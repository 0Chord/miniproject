package opensourceProject.miniproject.dto;

public class KakaoUserProperties {

    private String nickname;

    public KakaoUserProperties(String nickname) {
        this.nickname = nickname;
    }

    public KakaoUserProperties() {
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "KakaoUserProperties{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
