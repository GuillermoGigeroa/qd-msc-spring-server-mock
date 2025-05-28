package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.RequestHeader;
import org.openapitools.model.VdaQdReportSearch;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request VDA QD Report Search
 */

@Schema(name = "RequestVdaQdReportSearch", description = "Request VDA QD Report Search")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class RequestVdaQdReportSearch {

  private @Nullable RequestHeader header;

  private @Nullable VdaQdReportSearch data;

  public RequestVdaQdReportSearch header(RequestHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
   */
  @Valid 
  @Schema(name = "header", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("header")
  public RequestHeader getHeader() {
    return header;
  }

  public void setHeader(RequestHeader header) {
    this.header = header;
  }

  public RequestVdaQdReportSearch data(VdaQdReportSearch data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public VdaQdReportSearch getData() {
    return data;
  }

  public void setData(VdaQdReportSearch data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestVdaQdReportSearch requestVdaQdReportSearch = (RequestVdaQdReportSearch) o;
    return Objects.equals(this.header, requestVdaQdReportSearch.header) &&
        Objects.equals(this.data, requestVdaQdReportSearch.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestVdaQdReportSearch {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

