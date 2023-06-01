package com.udea.ParcialEquipo1.Repository;

import com.udea.ParcialEquipo1.Entity.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente,Long> {
}
