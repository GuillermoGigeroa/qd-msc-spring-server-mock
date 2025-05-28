package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.VdaQdApplicationTableDetail;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VDA QD Application Table Detail List
 */

@Schema(name = "VdaQdApplicationTableDetailList", description = "VDA QD Application Table Detail List")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class VdaQdApplicationTableDetailList {

  @Valid
  private List<@Valid VdaQdApplicationTableDetail> vdaQdApplicationTableDetails = new ArrayList<>();

  public VdaQdApplicationTableDetailList vdaQdApplicationTableDetails(List<@Valid VdaQdApplicationTableDetail> vdaQdApplicationTableDetails) {
    this.vdaQdApplicationTableDetails = vdaQdApplicationTableDetails;
    return this;
  }

  public VdaQdApplicationTableDetailList addVdaQdApplicationTableDetailsItem(VdaQdApplicationTableDetail vdaQdApplicationTableDetailsItem) {
    if (this.vdaQdApplicationTableDetails == null) {
      this.vdaQdApplicationTableDetails = new ArrayList<>();
    }
    this.vdaQdApplicationTableDetails.add(vdaQdApplicationTableDetailsItem);
    return this;
  }

  /**
   * Get vdaQdApplicationTableDetails
   * @return vdaQdApplicationTableDetails
   */
  @Valid 
  @Schema(name = "vdaQdApplicationTableDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vdaQdApplicationTableDetails")
  public List<@Valid VdaQdApplicationTableDetail> getVdaQdApplicationTableDetails() {
    return vdaQdApplicationTableDetails;
  }

  public void setVdaQdApplicationTableDetails(List<@Valid VdaQdApplicationTableDetail> vdaQdApplicationTableDetails) {
    this.vdaQdApplicationTableDetails = vdaQdApplicationTableDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VdaQdApplicationTableDetailList vdaQdApplicationTableDetailList = (VdaQdApplicationTableDetailList) o;
    return Objects.equals(this.vdaQdApplicationTableDetails, vdaQdApplicationTableDetailList.vdaQdApplicationTableDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vdaQdApplicationTableDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdaQdApplicationTableDetailList {\n");
    sb.append("    vdaQdApplicationTableDetails: ").append(toIndentedString(vdaQdApplicationTableDetails)).append("\n");
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

