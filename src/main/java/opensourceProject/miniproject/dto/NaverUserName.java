package opensourceProject.miniproject.dto;

import lombok.Data;

@Data
public class NaverUserName {
    private String nickname;

    public NaverUserName(String nickname) {
        this.nickname = nickname;
    }
}
