package com.cololux.service.service;


import com.cololux.service.dto.request.SignUpRequest;
import com.cololux.service.dto.request.SignInRequest;
import com.cololux.service.dto.response.JwtAuthenticationResponse;

public interface AuthenticationService {

    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);
}
