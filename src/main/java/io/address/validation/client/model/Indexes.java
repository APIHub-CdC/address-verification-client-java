package io.address.validation.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;


public class Indexes {
  @SerializedName("certaintyIndex")
  private BigDecimal certaintyIndex = null;
  @SerializedName("coincidenceIndex")
  private BigDecimal coincidenceIndex = null;
  public Indexes certaintyIndex(BigDecimal certaintyIndex) {
    this.certaintyIndex = certaintyIndex;
    return this;
  }
   
  @ApiModelProperty(example = "1.0", value = "certaintyIndex")
  public BigDecimal getCertaintyIndex() {
    return certaintyIndex;
  }
  public void setCertaintyIndex(BigDecimal certaintyIndex) {
    this.certaintyIndex = certaintyIndex;
  }
  public Indexes coincidenceIndex(BigDecimal coincidenceIndex) {
    this.coincidenceIndex = coincidenceIndex;
    return this;
  }
   
  @ApiModelProperty(example = "0.8", value = "coincidenceIndex")
  public BigDecimal getCoincidenceIndex() {
    return coincidenceIndex;
  }
  public void setCoincidenceIndex(BigDecimal coincidenceIndex) {
    this.coincidenceIndex = coincidenceIndex;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Indexes indexes = (Indexes) o;
    return Objects.equals(this.certaintyIndex, indexes.certaintyIndex) &&
        Objects.equals(this.coincidenceIndex, indexes.coincidenceIndex);
  }
  @Override
  public int hashCode() {
    return Objects.hash(certaintyIndex, coincidenceIndex);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Indexes {\n");
    
    sb.append("    certaintyIndex: ").append(toIndentedString(certaintyIndex)).append("\n");
    sb.append("    coincidenceIndex: ").append(toIndentedString(coincidenceIndex)).append("\n");
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
