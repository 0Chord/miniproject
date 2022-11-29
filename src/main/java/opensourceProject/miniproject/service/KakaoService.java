package opensourceProject.miniproject.service;

import opensourceProject.miniproject.dto.KakaoAuthResponse;
import opensourceProject.miniproject.dto.KakaoUserInfo;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import secret.SecretInformation;

@Service
public class KakaoService {
    private final String KAKAO_AUTH_URL = "https://kauth.kakao.com/oauth/token";
    private final String KAKAO_REQ_URL = "https://kapi.kakao.com/v2/user/me";
    private final RestTemplate restTemplate;

    public KakaoService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    SecretInformation secretInformation = new SecretInformation();

    public String getAccessToken(String authorizeToken){
        try{
            String clientId = secretInformation.getKAKAO_CLIENT();
            String redirectURL = "https://0chord.shop/auth";

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
            params.add("grant_type", "authorization_code");
            params.add("client_id", clientId);
            params.add("redirect_url", redirectURL);
            params.add("code",authorizeToken);

            HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(params, headers);

            ResponseEntity<KakaoAuthResponse> result = restTemplate.exchange(KAKAO_AUTH_URL, HttpMethod.POST, entity, KakaoAuthResponse.class);
            KakaoAuthResponse kakaoAuthResponse = result.getBody();
            return kakaoAuthResponse.getAccessToken();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public KakaoUserInfo getUserInfo(String accessToken){
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Authorization","Bearer " + accessToken);
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(headers);

            ResponseEntity<KakaoUserInfo> kakaoUserInfo = restTemplate.exchange(KAKAO_REQ_URL,
                    HttpMethod.POST,
                    entity,
                    KakaoUserInfo.class);

            KakaoUserInfo kakaoInfo = kakaoUserInfo.getBody();

            return kakaoInfo;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    }

