package com.soc.AuthMS.Configuration;

import jakarta.servlet.ServletException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.IOException;
import java.io.Serializable;
@Component
@CrossOrigin("*")
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = 1L;

    /*@Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        System.out.println("requestSSss :"+request);
        System.out.println("responseSSss :"+response);
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }*/


    @Override
    public void commence(jakarta.servlet.http.HttpServletRequest request,
                         jakarta.servlet.http.HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {

    }
}