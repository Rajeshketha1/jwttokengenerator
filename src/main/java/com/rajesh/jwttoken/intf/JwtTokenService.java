package com.rajesh.jwttoken.intf;

import org.springframework.stereotype.Service;


public interface JwtTokenService {

  String jwtTokenGenerator(String id, String subject, String issu, Long lm);
}
