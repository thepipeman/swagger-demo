package com.pipecrafts.swaggerdemo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseWrapper<OUTPUT> {

  HttpStatus status;

  String message;

  @ApiModelProperty(
    value = "The output data",
    accessMode = ApiModelProperty.AccessMode.READ_WRITE
  )
  OUTPUT data;

}
