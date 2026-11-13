package org.mpp.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.mpp.domain.dto.request.AuthenticationRequestDTO;
import org.mpp.domain.dto.response.AuthenticationResponseDTO;

@ApplicationScoped
public class AuthService {

    public AuthenticationResponseDTO authenticate(AuthenticationRequestDTO dto) {
        return null;
    }
}
