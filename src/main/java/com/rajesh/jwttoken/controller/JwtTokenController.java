package com.rajesh.jwttoken.controller;

import com.rajesh.jwttoken.intf.JwtTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/jwtToken")
public class JwtTokenController {

  @Autowired
  private JwtTokenService jwtTokenService;

  @GetMapping()
  public String getJwtTojken(
      @RequestParam String id,
      @RequestParam String issuer,
      @RequestParam String subject,
      @RequestParam long ttlMillis) {

    return jwtTokenService.jwtTokenGenerator(id, issuer, subject, ttlMillis);
  }
}
