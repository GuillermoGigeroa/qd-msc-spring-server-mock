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
 * Response Logout MSC
 */

@Schema(name = "LogoutVda", description = "Response Logout MSC")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class LogoutVda {

  private @Nullable String usuarioDominio;

  public LogoutVda usuarioDominio(String usuarioDominio) {
    this.usuarioDominio = usuarioDominio;
    return this;
  }

  /**
   * Get usuarioDominio
   * @return usuarioDominio
   */
  
  @Schema(name = "usuarioDominio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usuarioDominio")
  public String getUsuarioDominio() {
    return usuarioDominio;
  }

  public void setUsuarioDominio(String usuarioDominio) {
    this.usuarioDominio = usuarioDominio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogoutVda logoutVda = (LogoutVda) o;
    return Objects.equals(this.usuarioDominio, logoutVda.usuarioDominio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usuarioDominio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogoutVda {\n");
    sb.append("    usuarioDominio: ").append(toIndentedString(usuarioDominio)).append("\n");
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

