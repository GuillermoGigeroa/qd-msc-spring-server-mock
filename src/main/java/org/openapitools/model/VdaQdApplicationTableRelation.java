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
 * VDA QD Application Table Relation
 */

@Schema(name = "VdaQdApplicationTableRelation", description = "VDA QD Application Table Relation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class VdaQdApplicationTableRelation {

  private @Nullable String referencedTableName;

  private @Nullable String referencedTableColumnName;

  public VdaQdApplicationTableRelation referencedTableName(String referencedTableName) {
    this.referencedTableName = referencedTableName;
    return this;
  }

  /**
   * Get referencedTableName
   * @return referencedTableName
   */
  
  @Schema(name = "referencedTableName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referencedTableName")
  public String getReferencedTableName() {
    return referencedTableName;
  }

  public void setReferencedTableName(String referencedTableName) {
    this.referencedTableName = referencedTableName;
  }

  public VdaQdApplicationTableRelation referencedTableColumnName(String referencedTableColumnName) {
    this.referencedTableColumnName = referencedTableColumnName;
    return this;
  }

  /**
   * Get referencedTableColumnName
   * @return referencedTableColumnName
   */
  
  @Schema(name = "referencedTableColumnName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referencedTableColumnName")
  public String getReferencedTableColumnName() {
    return referencedTableColumnName;
  }

  public void setReferencedTableColumnName(String referencedTableColumnName) {
    this.referencedTableColumnName = referencedTableColumnName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VdaQdApplicationTableRelation vdaQdApplicationTableRelation = (VdaQdApplicationTableRelation) o;
    return Objects.equals(this.referencedTableName, vdaQdApplicationTableRelation.referencedTableName) &&
        Objects.equals(this.referencedTableColumnName, vdaQdApplicationTableRelation.referencedTableColumnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencedTableName, referencedTableColumnName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdaQdApplicationTableRelation {\n");
    sb.append("    referencedTableName: ").append(toIndentedString(referencedTableName)).append("\n");
    sb.append("    referencedTableColumnName: ").append(toIndentedString(referencedTableColumnName)).append("\n");
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

