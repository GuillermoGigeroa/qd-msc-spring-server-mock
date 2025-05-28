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
 * Service Instance
 */

@Schema(name = "ServiceInstance", description = "Service Instance")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-28T13:41:28.114098400-03:00[America/Buenos_Aires]", comments = "Generator version: 7.13.0")
public class ServiceInstance {

  private @Nullable String system;

  private @Nullable String name;

  private @Nullable String operation;

  private @Nullable String version;

  private @Nullable String ip;

  private @Nullable String port;

  private @Nullable String layer;

  private @Nullable Integer index;

  private @Nullable Integer latency;

  public ServiceInstance system(String system) {
    this.system = system;
    return this;
  }

  /**
   * Get system
   * @return system
   */
  
  @Schema(name = "system", example = "retail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("system")
  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public ServiceInstance name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", example = "com.midd.test.service.AccountsService", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceInstance operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  
  @Schema(name = "operation", example = "listAccounts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operation")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public ServiceInstance version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", example = "1.0.4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ServiceInstance ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * Get ip
   * @return ip
   */
  
  @Schema(name = "ip", example = "10.11.12.13", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public ServiceInstance port(String port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
   */
  
  @Schema(name = "port", example = "28080", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("port")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public ServiceInstance layer(String layer) {
    this.layer = layer;
    return this;
  }

  /**
   * Get layer
   * @return layer
   */
  
  @Schema(name = "layer", example = "service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("layer")
  public String getLayer() {
    return layer;
  }

  public void setLayer(String layer) {
    this.layer = layer;
  }

  public ServiceInstance index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
   */
  
  @Schema(name = "index", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public ServiceInstance latency(Integer latency) {
    this.latency = latency;
    return this;
  }

  /**
   * Get latency
   * @return latency
   */
  
  @Schema(name = "latency", example = "247", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latency")
  public Integer getLatency() {
    return latency;
  }

  public void setLatency(Integer latency) {
    this.latency = latency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInstance serviceInstance = (ServiceInstance) o;
    return Objects.equals(this.system, serviceInstance.system) &&
        Objects.equals(this.name, serviceInstance.name) &&
        Objects.equals(this.operation, serviceInstance.operation) &&
        Objects.equals(this.version, serviceInstance.version) &&
        Objects.equals(this.ip, serviceInstance.ip) &&
        Objects.equals(this.port, serviceInstance.port) &&
        Objects.equals(this.layer, serviceInstance.layer) &&
        Objects.equals(this.index, serviceInstance.index) &&
        Objects.equals(this.latency, serviceInstance.latency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(system, name, operation, version, ip, port, layer, index, latency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstance {\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
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

