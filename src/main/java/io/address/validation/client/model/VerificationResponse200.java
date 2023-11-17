package io.address.validation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;



public class VerificationResponse200 {
  @SerializedName("message")
  private String message = null;
  @SerializedName("data")
  private Data data = null;
  public VerificationResponse200 message(String message) {
    this.message = message;
    return this;
  }
   
  @ApiModelProperty(example = "Validation completed successfully!", value = "mensaje")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public VerificationResponse200 data(Data data) {
    this.data = data;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Data getData() {
    return data;
  }
  public void setData(Data data) {
    this.data = data;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationResponse200 verificationResponse200 = (VerificationResponse200) o;
    return Objects.equals(this.message, verificationResponse200.message) &&
        Objects.equals(this.data, verificationResponse200.data);
  }
  @Override
  public int hashCode() {
    return Objects.hash(message, data);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationResponse200 {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
