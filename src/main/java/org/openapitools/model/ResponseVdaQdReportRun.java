package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ResponseHeader;
import org.openapitools.model.VdaQdReportRun;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Response VDA QD Report Run
 */

@Schema(name = "ResponseVdaQdReportRun", description = "Response VDA QD Report Run")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class ResponseVdaQdReportRun {

  private @Nullable ResponseHeader header;

  private @Nullable VdaQdReportRun data;

  public ResponseVdaQdReportRun header(ResponseHeader header) {
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
  public ResponseHeader getHeader() {
    return header;
  }

  public void setHeader(ResponseHeader header) {
    this.header = header;
  }

  public ResponseVdaQdReportRun data(VdaQdReportRun data) {
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
  public VdaQdReportRun getData() {
    return data;
  }

  public void setData(VdaQdReportRun data) {
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
    ResponseVdaQdReportRun responseVdaQdReportRun = (ResponseVdaQdReportRun) o;
    return Objects.equals(this.header, responseVdaQdReportRun.header) &&
        Objects.equals(this.data, responseVdaQdReportRun.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseVdaQdReportRun {\n");
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

