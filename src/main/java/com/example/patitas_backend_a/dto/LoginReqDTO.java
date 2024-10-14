package com.example.patitas_backend_a.dto;

public record LoginReqDTO(
  String tipoDocumento,
  String numeroDocumento,
  String password
) {

}
