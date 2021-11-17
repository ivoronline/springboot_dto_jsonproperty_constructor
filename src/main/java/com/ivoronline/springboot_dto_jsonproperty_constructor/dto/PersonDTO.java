package com.ivoronline.springboot_dto_jsonproperty_constructor.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonDTO {

  //PROPERTIES
  public String  propName;
  public Integer propAge;

  //CONSTRUCTOR
  private PersonDTO(
    @JsonProperty("First Name") String  reqName,
    @JsonProperty("Age")        Integer reqAge
  ) {
    this.propName = reqName;
    this.propAge  = reqAge;
  }

}
