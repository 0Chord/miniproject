package opensourceProject.miniproject.dto;

public class KakaoUserAccountProfile {

    private String nickname;

    public KakaoUserAccountProfile(String nickname) {
        this.nickname = nickname;
    }

    public KakaoUserAccountProfile() {
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "KakaoUserAccountProfile{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
