package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.VdaQdReport;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VDA QD Report Run
 */

@Schema(name = "VdaQdReportRun", description = "VDA QD Report Run")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class VdaQdReportRun {

  private @Nullable VdaQdReport vdaQdReport;

  private @Nullable String startTime;

  private @Nullable String endTime;

  private @Nullable String result;

  private @Nullable String comments;

  public VdaQdReportRun vdaQdReport(VdaQdReport vdaQdReport) {
    this.vdaQdReport = vdaQdReport;
    return this;
  }

  /**
   * Get vdaQdReport
   * @return vdaQdReport
   */
  @Valid 
  @Schema(name = "vdaQdReport", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vdaQdReport")
  public VdaQdReport getVdaQdReport() {
    return vdaQdReport;
  }

  public void setVdaQdReport(VdaQdReport vdaQdReport) {
    this.vdaQdReport = vdaQdReport;
  }

  public VdaQdReportRun startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  
  @Schema(name = "startTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public VdaQdReportRun endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   */
  
  @Schema(name = "endTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public VdaQdReportRun result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  
  @Schema(name = "result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("result")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public VdaQdReportRun comments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Get comments
   * @return comments
   */
  
  @Schema(name = "comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VdaQdReportRun vdaQdReportRun = (VdaQdReportRun) o;
    return Objects.equals(this.vdaQdReport, vdaQdReportRun.vdaQdReport) &&
        Objects.equals(this.startTime, vdaQdReportRun.startTime) &&
        Objects.equals(this.endTime, vdaQdReportRun.endTime) &&
        Objects.equals(this.result, vdaQdReportRun.result) &&
        Objects.equals(this.comments, vdaQdReportRun.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vdaQdReport, startTime, endTime, result, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdaQdReportRun {\n");
    sb.append("    vdaQdReport: ").append(toIndentedString(vdaQdReport)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

