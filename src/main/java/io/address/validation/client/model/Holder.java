package io.address.validation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class Holder {
  @SerializedName("name")
  private String name = null;
  @SerializedName("secondName")
  private String secondName = null;
  @SerializedName("lastName")
  private String lastName = null;
  @SerializedName("secondLastName")
  private String secondLastName = null;
  public Holder name(String name) {
    this.name = name;
    return this;
  }
   
  @ApiModelProperty(example = "Vlad", value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Holder secondName(String secondName) {
    this.secondName = secondName;
    return this;
  }
   
  @ApiModelProperty(example = "Eddie", value = "")
  public String getSecondName() {
    return secondName;
  }
  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }
  public Holder lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
   
  @ApiModelProperty(example = "Teples", value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public Holder secondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
    return this;
  }
   
  @ApiModelProperty(example = "Vlodiling", value = "")
  public String getSecondLastName() {
    return secondLastName;
  }
  public void setSecondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Holder holder = (Holder) o;
    return Objects.equals(this.name, holder.name) &&
        Objects.equals(this.secondName, holder.secondName) &&
        Objects.equals(this.lastName, holder.lastName) &&
        Objects.equals(this.secondLastName, holder.secondLastName);
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, secondName, lastName, secondLastName);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Holder {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    secondLastName: ").append(toIndentedString(secondLastName)).append("\n");
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
