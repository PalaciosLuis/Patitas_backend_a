package com.example.patitas_backend_a.dto;

public record LoginResponseDTO(
  String codigo,
  String mensaje,
  String nombreUsuario,
  String correoUsuario
) {
}
