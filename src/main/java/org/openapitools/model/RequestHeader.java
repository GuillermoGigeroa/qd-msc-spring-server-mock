package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Request Header
 */

@Schema(name = "RequestHeader", description = "Request Header")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class RequestHeader {

  private @Nullable ServiceInstance caller;

  private @Nullable String channel;

  private @Nullable String groupId;

  private @Nullable String password;

  private @Nullable String remoteHost;

  private @Nullable String serviceName;

  private @Nullable String sessionId;

  private @Nullable String transactionId;

  private @Nullable String taskId;

  private @Nullable String userId;

  public RequestHeader caller(ServiceInstance caller) {
    this.caller = caller;
    return this;
  }

  /**
   * Get caller
   * @return caller
   */
  @Valid 
  @Schema(name = "caller", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caller")
  public ServiceInstance getCaller() {
    return caller;
  }

  public void setCaller(ServiceInstance caller) {
    this.caller = caller;
  }

  public RequestHeader channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
   */
  
  @Schema(name = "channel", example = "PRE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public RequestHeader groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
   */
  
  @Schema(name = "groupId", example = "20000000001", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public RequestHeader password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  
  @Schema(name = "password", example = "xxx", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public RequestHeader remoteHost(String remoteHost) {
    this.remoteHost = remoteHost;
    return this;
  }

  /**
   * Get remoteHost
   * @return remoteHost
   */
  
  @Schema(name = "remoteHost", example = "10.11.12.13", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remoteHost")
  public String getRemoteHost() {
    return remoteHost;
  }

  public void setRemoteHost(String remoteHost) {
    this.remoteHost = remoteHost;
  }

  public RequestHeader serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
   */
  
  @Schema(name = "serviceName", example = "clientData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public RequestHeader sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
   */
  
  @Schema(name = "sessionId", example = "8a33ff49-64adce33-0164-add58e7b-9876", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public RequestHeader transactionId(String transactionId) {
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

  public RequestHeader taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
   */
  
  @Schema(name = "taskId", example = "0123456789", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskId")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public RequestHeader userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  
  @Schema(name = "userId", example = "preuser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestHeader requestHeader = (RequestHeader) o;
    return Objects.equals(this.caller, requestHeader.caller) &&
        Objects.equals(this.channel, requestHeader.channel) &&
        Objects.equals(this.groupId, requestHeader.groupId) &&
        Objects.equals(this.password, requestHeader.password) &&
        Objects.equals(this.remoteHost, requestHeader.remoteHost) &&
        Objects.equals(this.serviceName, requestHeader.serviceName) &&
        Objects.equals(this.sessionId, requestHeader.sessionId) &&
        Objects.equals(this.transactionId, requestHeader.transactionId) &&
        Objects.equals(this.taskId, requestHeader.taskId) &&
        Objects.equals(this.userId, requestHeader.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caller, channel, groupId, password, remoteHost, serviceName, sessionId, transactionId, taskId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeader {\n");
    sb.append("    caller: ").append(toIndentedString(caller)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    remoteHost: ").append(toIndentedString(remoteHost)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

