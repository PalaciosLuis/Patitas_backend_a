package com.example.patitas_backend_a.service;

import com.example.patitas_backend_a.dto.CloseRequest;
import com.example.patitas_backend_a.dto.LoginReqDTO;

import java.io.IOException;

public interface AutenticacionService {
  String[] validarUsuario(LoginReqDTO request) throws IOException;
  void cerrarSesion(CloseRequest request) throws IOException;
}
