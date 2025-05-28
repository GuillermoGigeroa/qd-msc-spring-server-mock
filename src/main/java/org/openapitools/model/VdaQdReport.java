package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.VdaQdUser;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VDA QD Report
 */

@Schema(name = "VdaQdReport", description = "VDA QD Report")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class VdaQdReport {

  private @Nullable Integer reportId;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable String sql;

  private @Nullable String creationDate;

  private @Nullable String lastUpdate;

  private @Nullable Boolean graphic;

  private @Nullable String status;

  private @Nullable String application;

  private @Nullable VdaQdUser vdaQdUser;

  public VdaQdReport reportId(Integer reportId) {
    this.reportId = reportId;
    return this;
  }

  /**
   * Get reportId
   * @return reportId
   */
  
  @Schema(name = "reportId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reportId")
  public Integer getReportId() {
    return reportId;
  }

  public void setReportId(Integer reportId) {
    this.reportId = reportId;
  }

  public VdaQdReport name(String name) {
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

  public VdaQdReport description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VdaQdReport sql(String sql) {
    this.sql = sql;
    return this;
  }

  /**
   * Get sql
   * @return sql
   */
  
  @Schema(name = "sql", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sql")
  public String getSql() {
    return sql;
  }

  public void setSql(String sql) {
    this.sql = sql;
  }

  public VdaQdReport creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   */
  
  @Schema(name = "creationDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDate")
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public VdaQdReport lastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Get lastUpdate
   * @return lastUpdate
   */
  
  @Schema(name = "lastUpdate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdate")
  public String getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public VdaQdReport graphic(Boolean graphic) {
    this.graphic = graphic;
    return this;
  }

  /**
   * Get graphic
   * @return graphic
   */
  
  @Schema(name = "graphic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("graphic")
  public Boolean getGraphic() {
    return graphic;
  }

  public void setGraphic(Boolean graphic) {
    this.graphic = graphic;
  }

  public VdaQdReport status(String status) {
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

  public VdaQdReport application(String application) {
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

  public VdaQdReport vdaQdUser(VdaQdUser vdaQdUser) {
    this.vdaQdUser = vdaQdUser;
    return this;
  }

  /**
   * Get vdaQdUser
   * @return vdaQdUser
   */
  @Valid 
  @Schema(name = "vdaQdUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vdaQdUser")
  public VdaQdUser getVdaQdUser() {
    return vdaQdUser;
  }

  public void setVdaQdUser(VdaQdUser vdaQdUser) {
    this.vdaQdUser = vdaQdUser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VdaQdReport vdaQdReport = (VdaQdReport) o;
    return Objects.equals(this.reportId, vdaQdReport.reportId) &&
        Objects.equals(this.name, vdaQdReport.name) &&
        Objects.equals(this.description, vdaQdReport.description) &&
        Objects.equals(this.sql, vdaQdReport.sql) &&
        Objects.equals(this.creationDate, vdaQdReport.creationDate) &&
        Objects.equals(this.lastUpdate, vdaQdReport.lastUpdate) &&
        Objects.equals(this.graphic, vdaQdReport.graphic) &&
        Objects.equals(this.status, vdaQdReport.status) &&
        Objects.equals(this.application, vdaQdReport.application) &&
        Objects.equals(this.vdaQdUser, vdaQdReport.vdaQdUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, name, description, sql, creationDate, lastUpdate, graphic, status, application, vdaQdUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdaQdReport {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    graphic: ").append(toIndentedString(graphic)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    vdaQdUser: ").append(toIndentedString(vdaQdUser)).append("\n");
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

