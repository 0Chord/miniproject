package opensourceProject.miniproject.service;


import opensourceProject.miniproject.dto.NaverAuthResponse;
import opensourceProject.miniproject.dto.NaverUserInfo;
import org.springframework.stereotype.Service;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import secret.SecretInformation;

@Service
public class NaverService {

    private final String NAVER_AUTH_URL = "https://nid.naver.com/oauth2.0/token";
    private final String NAVER_REQ_URL = "https://openapi.naver.com/v1/nid/me";

    private final RestTemplate restTemplate;
    private final SecretInformation secretInformation = new SecretInformation();

    public NaverService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getAccessToken(String authorizeToken, String state) {
        try {
            String clientId = secretInformation.getCLIENT_ID();
            String clientSecret = secretInformation.getCLIENT_SECRET();
            String redirectURL = "http://localhost:8080/naverAuth";

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
            params.add("grant_type", "authorization_code");
            params.add("client_id", clientId);
            params.add("client_secret", clientSecret);
            params.add("code", authorizeToken);
            params.add("state", state);

            HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(params, headers);

            ResponseEntity<NaverAuthResponse> result = restTemplate.exchange(NAVER_AUTH_URL, HttpMethod.POST, entity, NaverAuthResponse.class);
            NaverAuthResponse naverAuthResponse = result.getBody();

            return naverAuthResponse.getAccessToken();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public NaverUserInfo getUserInfo(String accessToken){
        try{
            HttpHeaders headers = new HttpHeaders();
            headers.add("Authorization", "Bearer " + accessToken);
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(headers);

            ResponseEntity<NaverUserInfo> naverUserInfo = restTemplate.exchange(NAVER_REQ_URL, HttpMethod.POST, entity, NaverUserInfo.class);

            NaverUserInfo naverInfo = naverUserInfo.getBody();

            return naverInfo;
        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
