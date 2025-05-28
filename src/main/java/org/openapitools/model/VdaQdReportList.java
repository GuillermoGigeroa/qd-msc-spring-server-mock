package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * VDA QD Report List
 */

@Schema(name = "VdaQdReportList", description = "VDA QD Report List")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class VdaQdReportList {

  @Valid
  private List<@Valid VdaQdReport> vdaQdReports = new ArrayList<>();

  public VdaQdReportList vdaQdReports(List<@Valid VdaQdReport> vdaQdReports) {
    this.vdaQdReports = vdaQdReports;
    return this;
  }

  public VdaQdReportList addVdaQdReportsItem(VdaQdReport vdaQdReportsItem) {
    if (this.vdaQdReports == null) {
      this.vdaQdReports = new ArrayList<>();
    }
    this.vdaQdReports.add(vdaQdReportsItem);
    return this;
  }

  /**
   * Get vdaQdReports
   * @return vdaQdReports
   */
  @Valid 
  @Schema(name = "vdaQdReports", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vdaQdReports")
  public List<@Valid VdaQdReport> getVdaQdReports() {
    return vdaQdReports;
  }

  public void setVdaQdReports(List<@Valid VdaQdReport> vdaQdReports) {
    this.vdaQdReports = vdaQdReports;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VdaQdReportList vdaQdReportList = (VdaQdReportList) o;
    return Objects.equals(this.vdaQdReports, vdaQdReportList.vdaQdReports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vdaQdReports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdaQdReportList {\n");
    sb.append("    vdaQdReports: ").append(toIndentedString(vdaQdReports)).append("\n");
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

