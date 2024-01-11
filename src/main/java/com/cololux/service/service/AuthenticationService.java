package com.cololux.service.service;


import com.cololux.service.dto.request.SignUpRequest;
import com.cololux.service.dto.request.SigninRequest;
import com.cololux.service.dto.response.JwtAuthenticationResponse;

public interface AuthenticationService {

    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
