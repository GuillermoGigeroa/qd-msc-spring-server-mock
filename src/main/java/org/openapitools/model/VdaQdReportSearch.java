package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.VdaQdReportPaginationParameters;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VDA QD Report Search
 */

@Schema(name = "VdaQdReportSearch", description = "VDA QD Report Search")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class VdaQdReportSearch {

  private @Nullable String user;

  private @Nullable String name;

  private @Nullable String application;

  private @Nullable String status;

  private @Nullable VdaQdReportPaginationParameters vdaQdReportPaginationParameters;

  public VdaQdReportSearch user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public VdaQdReportSearch name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VdaQdReportSearch application(String application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public VdaQdReportSearch status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public VdaQdReportSearch vdaQdReportPaginationParameters(VdaQdReportPaginationParameters vdaQdReportPaginationParameters) {
    this.vdaQdReportPaginationParameters = vdaQdReportPaginationParameters;
    return this;
  }

  /**
   * Get vdaQdReportPaginationParameters
   * @return vdaQdReportPaginationParameters
   */
  @Valid 
  @Schema(name = "vdaQdReportPaginationParameters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vdaQdReportPaginationParameters")
  public VdaQdReportPaginationParameters getVdaQdReportPaginationParameters() {
    return vdaQdReportPaginationParameters;
  }

  public void setVdaQdReportPaginationParameters(VdaQdReportPaginationParameters vdaQdReportPaginationParameters) {
    this.vdaQdReportPaginationParameters = vdaQdReportPaginationParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VdaQdReportSearch vdaQdReportSearch = (VdaQdReportSearch) o;
    return Objects.equals(this.user, vdaQdReportSearch.user) &&
        Objects.equals(this.name, vdaQdReportSearch.name) &&
        Objects.equals(this.application, vdaQdReportSearch.application) &&
        Objects.equals(this.status, vdaQdReportSearch.status) &&
        Objects.equals(this.vdaQdReportPaginationParameters, vdaQdReportSearch.vdaQdReportPaginationParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, name, application, status, vdaQdReportPaginationParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdaQdReportSearch {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vdaQdReportPaginationParameters: ").append(toIndentedString(vdaQdReportPaginationParameters)).append("\n");
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

