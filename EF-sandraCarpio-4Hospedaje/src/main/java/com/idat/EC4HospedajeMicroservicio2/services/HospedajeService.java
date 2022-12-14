package com.idat.EC4HospedajeMicroservicio2.services;

import java.util.List;

import com.idat.EC4HospedajeMicroservicio2.dto.HospedajeDTO;

public interface HospedajeService {
  List<HospedajeDTO> listar();
  void guardar(HospedajeDTO hospedaje);
}
