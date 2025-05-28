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
 * VDA QD Report Pagination Parameters
 */

@Schema(name = "VdaQdReportPaginationParameters", description = "VDA QD Report Pagination Parameters")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class VdaQdReportPaginationParameters {

  private @Nullable String orderBy;

  private @Nullable String orderOrientation;

  private @Nullable Integer offSet;

  private @Nullable Integer pageSize;

  public VdaQdReportPaginationParameters orderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * Get orderBy
   * @return orderBy
   */
  
  @Schema(name = "orderBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderBy")
  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  public VdaQdReportPaginationParameters orderOrientation(String orderOrientation) {
    this.orderOrientation = orderOrientation;
    return this;
  }

  /**
   * Get orderOrientation
   * @return orderOrientation
   */
  
  @Schema(name = "orderOrientation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderOrientation")
  public String getOrderOrientation() {
    return orderOrientation;
  }

  public void setOrderOrientation(String orderOrientation) {
    this.orderOrientation = orderOrientation;
  }

  public VdaQdReportPaginationParameters offSet(Integer offSet) {
    this.offSet = offSet;
    return this;
  }

  /**
   * Get offSet
   * @return offSet
   */
  
  @Schema(name = "offSet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offSet")
  public Integer getOffSet() {
    return offSet;
  }

  public void setOffSet(Integer offSet) {
    this.offSet = offSet;
  }

  public VdaQdReportPaginationParameters pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   */
  
  @Schema(name = "pageSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VdaQdReportPaginationParameters vdaQdReportPaginationParameters = (VdaQdReportPaginationParameters) o;
    return Objects.equals(this.orderBy, vdaQdReportPaginationParameters.orderBy) &&
        Objects.equals(this.orderOrientation, vdaQdReportPaginationParameters.orderOrientation) &&
        Objects.equals(this.offSet, vdaQdReportPaginationParameters.offSet) &&
        Objects.equals(this.pageSize, vdaQdReportPaginationParameters.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderBy, orderOrientation, offSet, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdaQdReportPaginationParameters {\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    orderOrientation: ").append(toIndentedString(orderOrientation)).append("\n");
    sb.append("    offSet: ").append(toIndentedString(offSet)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

