package com.pipecrafts.swaggerdemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Trip implements Serializable {

  private Long id;

  @NotBlank
  private String origin;

  @NotBlank
  private String destination;

  @NotBlank
  private String passengerName;

  @NotNull
  private BigDecimal price;

  @NotNull
  private LocalDateTime departure;

  @JsonFormat(
    pattern = "yyyy-MM-dd'T'HH:mm:ss",
    timezone = "GMT+8"
  )
  private Date createdOn;

  @ApiModelProperty(
    dataType = "java.util.Map",
    reference = "java.lang.String"
  )
  private Object dummy;

  private Map<String, String> remarks;
}
