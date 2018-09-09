package com.milysoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.milysoft.dao.IPersonaDAO;
import com.milysoft.model.Persona;
import com.milysoft.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private IPersonaDAO dao;
	
	@Override
	public Persona registrar(Persona persona) {
		// TODO Auto-generated method stub
		return dao.save(persona);
	}

	@Override
	public Persona modificar(Persona persona) {
		// TODO Auto-generated method stub
		return dao.save(persona);
	}

	@Override
	public void eliminar(int idPersona) {
		// TODO Auto-generated method stub
		dao.delete(idPersona);
	}

	@Override
	public Persona listarId(int idPersona) {
		// TODO Auto-generated method stub
		return dao.findOne(idPersona);
	}

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	
}
