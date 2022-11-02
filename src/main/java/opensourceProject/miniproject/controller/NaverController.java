package opensourceProject.miniproject.controller;

import opensourceProject.miniproject.dto.NaverUserInfo;
import opensourceProject.miniproject.dto.NaverUserName;
import opensourceProject.miniproject.service.NaverService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class NaverController {

    private final NaverService naverService;

    public NaverController(NaverService naverService) {
        this.naverService = naverService;
    }

    @GetMapping("/naverAuth")
    public String naverLogin(@RequestParam(value = "code", required=false) String code,@RequestParam(value= "state", required = false) String state,
                             Model model, HttpServletRequest request){
        String accessToken = naverService.getAccessToken(code, state);
        NaverUserInfo userInfo = naverService.getUserInfo(accessToken);
        NaverUserName userName = new NaverUserName(userInfo.getResponse().getName());
        System.out.println("userInfo = " + userInfo);
        System.out.println("userName = " + userName);
        model.addAttribute("member",userName);
        return "signIn/inviteUser";
    }
}
