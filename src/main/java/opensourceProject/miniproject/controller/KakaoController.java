package opensourceProject.miniproject.controller;

import opensourceProject.miniproject.dto.KakaoUserInfo;
import opensourceProject.miniproject.service.KakaoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class KakaoController {

    private KakaoService kakaoService;

    public KakaoController(KakaoService kakaoService) {
        this.kakaoService = kakaoService;
    }

    @GetMapping("/auth")
    public String kakaoAuth(@RequestParam(value = "code", required = false) String code, Model model,
                            HttpServletRequest request){

        String accessToken = kakaoService.getAccessToken(code);
        System.out.println("accessToken = " + accessToken);
        KakaoUserInfo userInfo = kakaoService.getUserInfo(accessToken);
        System.out.println("userInfo = " + userInfo);
        return null;
    }
}