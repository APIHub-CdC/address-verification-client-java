package io.address.validation.client.model;

import java.util.ArrayList;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;



public class Response {
  @SerializedName("indexes")
  private Indexes indexes = null;
  
  @SerializedName("errors")
  private ArrayList<Error> errors = null;
 


public Response indexes(Indexes indexes) {
    this.indexes = indexes;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Indexes getIndexes() {
    return indexes;
  }
  public void setIndexes(Indexes indexes) {
    this.indexes = indexes;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.indexes, response.indexes);
  }
  @Override
  public int hashCode() {
    return Objects.hash(indexes);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
