package io.address.validation.client.model;


import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(ServiceCode.Adapter.class)
public enum ServiceCode {
  
  CFE("CFE"),
  
  IZZI("IZZI");
  private String value;
  ServiceCode(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static ServiceCode fromValue(String text) {
    for (ServiceCode b : ServiceCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<ServiceCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ServiceCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public ServiceCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ServiceCode.fromValue(String.valueOf(value));
    }
  }
}
