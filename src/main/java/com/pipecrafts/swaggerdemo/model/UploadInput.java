package com.pipecrafts.swaggerdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
public class UploadInput {

  private MultipartFile file;

  private String name;

}
