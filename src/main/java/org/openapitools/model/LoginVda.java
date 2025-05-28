package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request Login MSC
 */

@Schema(name = "LoginVda", description = "Request Login MSC")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class LoginVda {

  private String usuarioDominio;

  private @Nullable String passwordDominio;

  private @Nullable String moduloAplicacion;

  public LoginVda() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LoginVda(String usuarioDominio) {
    this.usuarioDominio = usuarioDominio;
  }

  public LoginVda usuarioDominio(String usuarioDominio) {
    this.usuarioDominio = usuarioDominio;
    return this;
  }

  /**
   * Get usuarioDominio
   * @return usuarioDominio
   */
  @NotNull 
  @Schema(name = "usuarioDominio", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("usuarioDominio")
  public String getUsuarioDominio() {
    return usuarioDominio;
  }

  public void setUsuarioDominio(String usuarioDominio) {
    this.usuarioDominio = usuarioDominio;
  }

  public LoginVda passwordDominio(String passwordDominio) {
    this.passwordDominio = passwordDominio;
    return this;
  }

  /**
   * Get passwordDominio
   * @return passwordDominio
   */
  
  @Schema(name = "passwordDominio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passwordDominio")
  public String getPasswordDominio() {
    return passwordDominio;
  }

  public void setPasswordDominio(String passwordDominio) {
    this.passwordDominio = passwordDominio;
  }

  public LoginVda moduloAplicacion(String moduloAplicacion) {
    this.moduloAplicacion = moduloAplicacion;
    return this;
  }

  /**
   * Get moduloAplicacion
   * @return moduloAplicacion
   */
  
  @Schema(name = "moduloAplicacion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moduloAplicacion")
  public String getModuloAplicacion() {
    return moduloAplicacion;
  }

  public void setModuloAplicacion(String moduloAplicacion) {
    this.moduloAplicacion = moduloAplicacion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginVda loginVda = (LoginVda) o;
    return Objects.equals(this.usuarioDominio, loginVda.usuarioDominio) &&
        Objects.equals(this.passwordDominio, loginVda.passwordDominio) &&
        Objects.equals(this.moduloAplicacion, loginVda.moduloAplicacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usuarioDominio, passwordDominio, moduloAplicacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginVda {\n");
    sb.append("    usuarioDominio: ").append(toIndentedString(usuarioDominio)).append("\n");
    sb.append("    passwordDominio: ").append(toIndentedString(passwordDominio)).append("\n");
    sb.append("    moduloAplicacion: ").append(toIndentedString(moduloAplicacion)).append("\n");
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

