package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ErrorDetail;
import org.openapitools.model.ServiceInstance;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Response Header
 */

@Schema(name = "ResponseHeader", description = "Response Header")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class ResponseHeader {

  private @Nullable String messageCode;

  private @Nullable String messageDescription;

  private @Nullable String resultCode;

  private @Nullable ServiceInstance serviceInstance;

  private @Nullable String transactionId;

  @Valid
  private List<@Valid ErrorDetail> error = new ArrayList<>();

  @Valid
  private List<@Valid ErrorDetail> errorDetail = new ArrayList<>();

  public ResponseHeader messageCode(String messageCode) {
    this.messageCode = messageCode;
    return this;
  }

  /**
   * Get messageCode
   * @return messageCode
   */
  
  @Schema(name = "messageCode", example = "WC100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageCode")
  public String getMessageCode() {
    return messageCode;
  }

  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  public ResponseHeader messageDescription(String messageDescription) {
    this.messageDescription = messageDescription;
    return this;
  }

  /**
   * Get messageDescription
   * @return messageDescription
   */
  
  @Schema(name = "messageDescription", example = "No data found", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageDescription")
  public String getMessageDescription() {
    return messageDescription;
  }

  public void setMessageDescription(String messageDescription) {
    this.messageDescription = messageDescription;
  }

  public ResponseHeader resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

  /**
   * Get resultCode
   * @return resultCode
   */
  
  @Schema(name = "resultCode", example = "ok", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resultCode")
  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  public ResponseHeader serviceInstance(ServiceInstance serviceInstance) {
    this.serviceInstance = serviceInstance;
    return this;
  }

  /**
   * Get serviceInstance
   * @return serviceInstance
   */
  @Valid 
  @Schema(name = "serviceInstance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceInstance")
  public ServiceInstance getServiceInstance() {
    return serviceInstance;
  }

  public void setServiceInstance(ServiceInstance serviceInstance) {
    this.serviceInstance = serviceInstance;
  }

  public ResponseHeader transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
   */
  
  @Schema(name = "transactionId", example = "8a33ff49-64adce33-0164-add58e7b-0032", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public ResponseHeader error(List<@Valid ErrorDetail> error) {
    this.error = error;
    return this;
  }

  public ResponseHeader addErrorItem(ErrorDetail errorItem) {
    if (this.error == null) {
      this.error = new ArrayList<>();
    }
    this.error.add(errorItem);
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @Valid 
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public List<@Valid ErrorDetail> getError() {
    return error;
  }

  public void setError(List<@Valid ErrorDetail> error) {
    this.error = error;
  }

  public ResponseHeader errorDetail(List<@Valid ErrorDetail> errorDetail) {
    this.errorDetail = errorDetail;
    return this;
  }

  public ResponseHeader addErrorDetailItem(ErrorDetail errorDetailItem) {
    if (this.errorDetail == null) {
      this.errorDetail = new ArrayList<>();
    }
    this.errorDetail.add(errorDetailItem);
    return this;
  }

  /**
   * Get errorDetail
   * @return errorDetail
   */
  @Valid 
  @Schema(name = "errorDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorDetail")
  public List<@Valid ErrorDetail> getErrorDetail() {
    return errorDetail;
  }

  public void setErrorDetail(List<@Valid ErrorDetail> errorDetail) {
    this.errorDetail = errorDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHeader responseHeader = (ResponseHeader) o;
    return Objects.equals(this.messageCode, responseHeader.messageCode) &&
        Objects.equals(this.messageDescription, responseHeader.messageDescription) &&
        Objects.equals(this.resultCode, responseHeader.resultCode) &&
        Objects.equals(this.serviceInstance, responseHeader.serviceInstance) &&
        Objects.equals(this.transactionId, responseHeader.transactionId) &&
        Objects.equals(this.error, responseHeader.error) &&
        Objects.equals(this.errorDetail, responseHeader.errorDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageCode, messageDescription, resultCode, serviceInstance, transactionId, error, errorDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHeader {\n");
    sb.append("    messageCode: ").append(toIndentedString(messageCode)).append("\n");
    sb.append("    messageDescription: ").append(toIndentedString(messageDescription)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    serviceInstance: ").append(toIndentedString(serviceInstance)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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

