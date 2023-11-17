package io.address.validation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;


public class Address {
  @SerializedName("streetAddress")
  private String streetAddress = null;
  @SerializedName("settlement")
  private String settlement = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("zipCode")
  private String zipCode = null;
  public Address streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }
   
  @ApiModelProperty(example = "love street 525", required = true, value = "")
  public String getStreetAddress() {
    return streetAddress;
  }
  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }
  public Address settlement(String settlement) {
    this.settlement = settlement;
    return this;
  }
   
  @ApiModelProperty(example = "Centro", required = true, value = "")
  public String getSettlement() {
    return settlement;
  }
  public void setSettlement(String settlement) {
    this.settlement = settlement;
  }
  public Address city(String city) {
    this.city = city;
    return this;
  }
   
  @ApiModelProperty(example = "Cuahutemoc", required = true, value = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public Address state(String state) {
    this.state = state;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")

  public void setState(String state) {
    this.state = state;
  }
  public Address zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }
   
  @ApiModelProperty(example = "06000", required = true, value = "")
  public String getZipCode() {
    return zipCode;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.streetAddress, address.streetAddress) &&
        Objects.equals(this.settlement, address.settlement) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.zipCode, address.zipCode);
  }
  @Override
  public int hashCode() {
    return Objects.hash(streetAddress, settlement, city, state, zipCode);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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
