package com.pipecrafts.swaggerdemo.rest;

import com.pipecrafts.swaggerdemo.model.Trip;
import com.pipecrafts.swaggerdemo.model.UploadInput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@RestController
@RequestMapping("/trips")
public class TripController {

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Trip> getTrips() {
    return generateTrips();
  }

  @GetMapping(value = "/wrapped", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Trip> getWrappedTrips() {
    return ResponseEntity.ok(Trip.builder()
      .id(1L)
      .origin("Manila")
      .destination("Roxas, Isabela")
      .passengerName("Aaron Rasing")
      .price(BigDecimal.valueOf(950))
      .departure(LocalDateTime.now())
      .createdOn(new Date())
      .build());
  }


  @PostMapping(value = "/wrapped", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Trip> tesPost() {
    return ResponseEntity.ok(Trip.builder()
      .id(1L)
      .origin("Manila")
      .destination("Roxas, Isabela")
      .passengerName("Aaron Rasing")
      .price(BigDecimal.valueOf(950))
      .departure(LocalDateTime.now())
      .createdOn(new Date())
      .build());
  }

  @PostMapping(value = "/upload")
  public String upload(UploadInput input) {

    log.info("File received {}", input.getName());
    return input.getName();
  }


  private List<Trip> generateTrips() {

    List<Trip> trips = new ArrayList<>();
    trips.add(Trip.builder()
      .id(1L)
      .origin("Manila")
      .destination("Roxas, Isabela")
      .passengerName("Aaron Rasing")
      .price(BigDecimal.valueOf(950))
      .departure(LocalDateTime.now())
      .createdOn(new Date())
      .build());

    trips.add(Trip.builder()
      .id(2L)
      .origin("Manila")
      .destination("Ilagan, Isabela")
      .passengerName("Aaron Random")
      .price(BigDecimal.valueOf(1150))
      .departure(LocalDateTime.now())
      .createdOn(new Date())
      .build());

    return trips;
  }


}
