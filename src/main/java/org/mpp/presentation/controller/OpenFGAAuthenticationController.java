package org.mpp.presentation.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.mpp.domain.dto.request.AuthenticationRequestDTO;
import org.mpp.domain.dto.response.AuthenticationResponseDTO;
import org.mpp.services.AuthService;

@Path("/auth")
public class OpenFGAAuthenticationController {

    @Inject
    public AuthService authService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public AuthenticationResponseDTO authenticate(AuthenticationRequestDTO requestDTO) {
        return authService.authenticate(requestDTO);
    }
}
