package com.api.agenda.database;

import com.api.agenda.entidade.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RepositorioContato extends JpaRepository <Contato, Long> {

}
