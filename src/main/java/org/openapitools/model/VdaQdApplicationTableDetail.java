package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.VdaQdApplicationTableColumn;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VDA QD Application Table Detail
 */

@Schema(name = "VdaQdApplicationTableDetail", description = "VDA QD Application Table Detail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class VdaQdApplicationTableDetail {

  private @Nullable String tableName;

  @Valid
  private List<@Valid VdaQdApplicationTableColumn> vdaQdApplicationTableColumns = new ArrayList<>();

  public VdaQdApplicationTableDetail tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * Get tableName
   * @return tableName
   */
  
  @Schema(name = "tableName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tableName")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public VdaQdApplicationTableDetail vdaQdApplicationTableColumns(List<@Valid VdaQdApplicationTableColumn> vdaQdApplicationTableColumns) {
    this.vdaQdApplicationTableColumns = vdaQdApplicationTableColumns;
    return this;
  }

  public VdaQdApplicationTableDetail addVdaQdApplicationTableColumnsItem(VdaQdApplicationTableColumn vdaQdApplicationTableColumnsItem) {
    if (this.vdaQdApplicationTableColumns == null) {
      this.vdaQdApplicationTableColumns = new ArrayList<>();
    }
    this.vdaQdApplicationTableColumns.add(vdaQdApplicationTableColumnsItem);
    return this;
  }

  /**
   * Get vdaQdApplicationTableColumns
   * @return vdaQdApplicationTableColumns
   */
  @Valid 
  @Schema(name = "vdaQdApplicationTableColumns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vdaQdApplicationTableColumns")
  public List<@Valid VdaQdApplicationTableColumn> getVdaQdApplicationTableColumns() {
    return vdaQdApplicationTableColumns;
  }

  public void setVdaQdApplicationTableColumns(List<@Valid VdaQdApplicationTableColumn> vdaQdApplicationTableColumns) {
    this.vdaQdApplicationTableColumns = vdaQdApplicationTableColumns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VdaQdApplicationTableDetail vdaQdApplicationTableDetail = (VdaQdApplicationTableDetail) o;
    return Objects.equals(this.tableName, vdaQdApplicationTableDetail.tableName) &&
        Objects.equals(this.vdaQdApplicationTableColumns, vdaQdApplicationTableDetail.vdaQdApplicationTableColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName, vdaQdApplicationTableColumns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdaQdApplicationTableDetail {\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    vdaQdApplicationTableColumns: ").append(toIndentedString(vdaQdApplicationTableColumns)).append("\n");
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

