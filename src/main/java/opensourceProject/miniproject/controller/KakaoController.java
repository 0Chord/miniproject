package opensourceProject.miniproject.controller;

import opensourceProject.miniproject.dto.KakaoUserInfo;
import opensourceProject.miniproject.dto.KakaoUserName;
import opensourceProject.miniproject.service.KakaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KakaoController {

    private KakaoService kakaoService;
    private final Logger logger = LoggerFactory.getLogger(KakaoController.class);
    public KakaoController(KakaoService kakaoService) {
        this.kakaoService = kakaoService;
    }

    @GetMapping("/auth")
    public String kakaoAuth(@RequestParam(value = "code", required = false) String code, Model model){

        String accessToken = kakaoService.getAccessToken(code);
        KakaoUserInfo userInfo = kakaoService.getUserInfo(accessToken);
        KakaoUserName userName = new KakaoUserName(userInfo.getProperties().getNickname());
        logger.info("userName = " + userName);
        model.addAttribute("member",userName);
        return "signIn/inviteUser";
    }
}
