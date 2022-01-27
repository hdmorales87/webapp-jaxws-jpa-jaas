package org.hmorales.webapp.jaxws.repositories;

import org.hmorales.webapp.jaxws.models.Curso;

import java.util.List;

public interface CursoRepository {
    List<Curso> listar();
    Curso guardar(Curso curso);
}
