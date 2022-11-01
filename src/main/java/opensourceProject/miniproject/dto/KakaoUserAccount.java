package opensourceProject.miniproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KakaoUserAccount {

    @JsonProperty("profile_nickname_needs_agreement")
    private boolean profileNicknameNeedsAgreement;

    private KakaoUserAccountProfile profile;

    @JsonProperty("has_email")
    private boolean hasEmail;

    @JsonProperty("email_needs_agreement")
    private boolean emailNeedAgreement;

    @JsonProperty("is_email_vaild")
    private boolean isEmailValid;

    @JsonProperty("is_email_verified")
    private boolean isEmailVerified;

    private String email;

    public KakaoUserAccount(boolean profileNicknameNeedsAgreement, KakaoUserAccountProfile profile, boolean hasEmail, boolean emailNeedAgreement, boolean isEmailValid, boolean isEmailVerified, String email) {
        this.profileNicknameNeedsAgreement = profileNicknameNeedsAgreement;
        this.profile = profile;
        this.hasEmail = hasEmail;
        this.emailNeedAgreement = emailNeedAgreement;
        this.isEmailValid = isEmailValid;
        this.isEmailVerified = isEmailVerified;
        this.email = email;
    }

    public KakaoUserAccount() {
    }

    public boolean isProfileNicknameNeedsAgreement() {
        return profileNicknameNeedsAgreement;
    }

    public KakaoUserAccountProfile getProfile() {
        return profile;
    }

    public boolean isHasEmail() {
        return hasEmail;
    }

    public boolean isEmailNeedAgreement() {
        return emailNeedAgreement;
    }

    public boolean isEmailValid() {
        return isEmailValid;
    }

    public boolean isEmailVerified() {
        return isEmailVerified;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "KakaoUserAccount{" +
                "profileNicknameNeedsAgreement=" + profileNicknameNeedsAgreement +
                ", profile=" + profile +
                ", hasEmail=" + hasEmail +
                ", emailNeedAgreement=" + emailNeedAgreement +
                ", isEmailValid=" + isEmailValid +
                ", isEmailVerified=" + isEmailVerified +
                ", email='" + email + '\'' +
                '}';
    }
}
