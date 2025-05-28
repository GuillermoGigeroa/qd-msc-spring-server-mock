package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.VdaQdApplicationTableRelation;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VDA QD Application Table Column
 */

@Schema(name = "VdaQdApplicationTableColumn", description = "VDA QD Application Table Column")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class VdaQdApplicationTableColumn {

  private @Nullable String columnName;

  private @Nullable String columnType;

  private @Nullable VdaQdApplicationTableRelation vdaQdApplicationTableRelation;

  public VdaQdApplicationTableColumn columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Get columnName
   * @return columnName
   */
  
  @Schema(name = "columnName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("columnName")
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public VdaQdApplicationTableColumn columnType(String columnType) {
    this.columnType = columnType;
    return this;
  }

  /**
   * Get columnType
   * @return columnType
   */
  
  @Schema(name = "columnType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("columnType")
  public String getColumnType() {
    return columnType;
  }

  public void setColumnType(String columnType) {
    this.columnType = columnType;
  }

  public VdaQdApplicationTableColumn vdaQdApplicationTableRelation(VdaQdApplicationTableRelation vdaQdApplicationTableRelation) {
    this.vdaQdApplicationTableRelation = vdaQdApplicationTableRelation;
    return this;
  }

  /**
   * Get vdaQdApplicationTableRelation
   * @return vdaQdApplicationTableRelation
   */
  @Valid 
  @Schema(name = "vdaQdApplicationTableRelation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vdaQdApplicationTableRelation")
  public VdaQdApplicationTableRelation getVdaQdApplicationTableRelation() {
    return vdaQdApplicationTableRelation;
  }

  public void setVdaQdApplicationTableRelation(VdaQdApplicationTableRelation vdaQdApplicationTableRelation) {
    this.vdaQdApplicationTableRelation = vdaQdApplicationTableRelation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VdaQdApplicationTableColumn vdaQdApplicationTableColumn = (VdaQdApplicationTableColumn) o;
    return Objects.equals(this.columnName, vdaQdApplicationTableColumn.columnName) &&
        Objects.equals(this.columnType, vdaQdApplicationTableColumn.columnType) &&
        Objects.equals(this.vdaQdApplicationTableRelation, vdaQdApplicationTableColumn.vdaQdApplicationTableRelation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, columnType, vdaQdApplicationTableRelation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdaQdApplicationTableColumn {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    vdaQdApplicationTableRelation: ").append(toIndentedString(vdaQdApplicationTableRelation)).append("\n");
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

