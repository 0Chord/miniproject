package opensourceProject.miniproject.dto;

import lombok.Data;

@Data
public class KakaoUserName {
    private String nickname;

    public KakaoUserName(String nickname) {
        this.nickname = nickname;
    }
}
