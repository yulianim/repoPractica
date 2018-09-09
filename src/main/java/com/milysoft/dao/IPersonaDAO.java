package com.milysoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.milysoft.model.Persona;
@Repository
public interface IPersonaDAO extends JpaRepository<Persona, Integer>{

}
