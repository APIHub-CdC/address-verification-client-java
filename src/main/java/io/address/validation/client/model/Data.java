package io.address.validation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;



public class Data {
  @SerializedName("request")
  private VerificationRequest request = null;
  @SerializedName("response")
  private Response response = null;
  public Data request(VerificationRequest request) {
    this.request = request;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public VerificationRequest getRequest() {
    return request;
  }
  public void setRequest(VerificationRequest request) {
    this.request = request;
  }
  public Data response(Response response) {
    this.response = response;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Response getResponse() {
    return response;
  }
  public void setResponse(Response response) {
    this.response = response;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Data data = (Data) o;
    return Objects.equals(this.request, data.request) &&
        Objects.equals(this.response, data.response);
  }
  @Override
  public int hashCode() {
    return Objects.hash(request, response);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
