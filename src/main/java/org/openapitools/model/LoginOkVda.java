package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.Nullable;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.annotation.Generated;

/**
 * Response Login MSC
 */

@Schema(name = "LoginOkVda", description = "Response Login MSC")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class LoginOkVda {

  private Boolean loginOk;

  private @Nullable String userID;

  private @Nullable String userEmail;

  private @Nullable String userName;

  private @Nullable String userSurname;

  public LoginOkVda() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LoginOkVda(Boolean loginOk) {
    this.loginOk = loginOk;
  }

  public LoginOkVda loginOk(Boolean loginOk) {
    this.loginOk = loginOk;
    return this;
  }

  /**
   * Get loginOk
   * @return loginOk
   */
  @NotNull 
  @Schema(name = "loginOk", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("loginOk")
  public Boolean getLoginOk() {
    return loginOk;
  }

  public void setLoginOk(Boolean loginOk) {
    this.loginOk = loginOk;
  }

  public LoginOkVda userID(String userID) {
    this.userID = userID;
    return this;
  }

  /**
   * Get userID
   * @return userID
   */
  
  @Schema(name = "userID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userID")
  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

  public LoginOkVda userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * Get userEmail
   * @return userEmail
   */
  
  @Schema(name = "userEmail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userEmail")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public LoginOkVda userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
   */
  
  @Schema(name = "userName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public LoginOkVda userSurname(String userSurname) {
    this.userSurname = userSurname;
    return this;
  }

  /**
   * Get userSurname
   * @return userSurname
   */
  
  @Schema(name = "userSurname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userSurname")
  public String getUserSurname() {
    return userSurname;
  }

  public void setUserSurname(String userSurname) {
    this.userSurname = userSurname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginOkVda loginOkVda = (LoginOkVda) o;
    return Objects.equals(this.loginOk, loginOkVda.loginOk) &&
        Objects.equals(this.userID, loginOkVda.userID) &&
        Objects.equals(this.userEmail, loginOkVda.userEmail) &&
        Objects.equals(this.userName, loginOkVda.userName) &&
        Objects.equals(this.userSurname, loginOkVda.userSurname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginOk, userID, userEmail, userName, userSurname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginOkVda {\n");
    sb.append("    loginOk: ").append(toIndentedString(loginOk)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userSurname: ").append(toIndentedString(userSurname)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

