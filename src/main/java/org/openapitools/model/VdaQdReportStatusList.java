package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VDA QD Report Status List
 */

@Schema(name = "VdaQdReportStatusList", description = "VDA QD Report Status List")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class VdaQdReportStatusList {

  @Valid
  private List<String> statusList = new ArrayList<>();

  public VdaQdReportStatusList statusList(List<String> statusList) {
    this.statusList = statusList;
    return this;
  }

  public VdaQdReportStatusList addStatusListItem(String statusListItem) {
    if (this.statusList == null) {
      this.statusList = new ArrayList<>();
    }
    this.statusList.add(statusListItem);
    return this;
  }

  /**
   * Get statusList
   * @return statusList
   */
  
  @Schema(name = "statusList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusList")
  public List<String> getStatusList() {
    return statusList;
  }

  public void setStatusList(List<String> statusList) {
    this.statusList = statusList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VdaQdReportStatusList vdaQdReportStatusList = (VdaQdReportStatusList) o;
    return Objects.equals(this.statusList, vdaQdReportStatusList.statusList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdaQdReportStatusList {\n");
    sb.append("    statusList: ").append(toIndentedString(statusList)).append("\n");
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

