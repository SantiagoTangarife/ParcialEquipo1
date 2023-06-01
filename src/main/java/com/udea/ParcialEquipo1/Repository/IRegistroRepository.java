package com.udea.ParcialEquipo1.Repository;

import com.udea.ParcialEquipo1.Entity.Paciente;
import com.udea.ParcialEquipo1.Entity.Registro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IRegistroRepository extends CrudRepository<Registro, Integer> {

    List<Registro> findAllByCedulaPaciente(Paciente paciente);
}
