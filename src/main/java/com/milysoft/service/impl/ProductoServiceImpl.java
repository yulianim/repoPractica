package com.milysoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.milysoft.dao.IProductoDAO;
import com.milysoft.model.Producto;
import com.milysoft.service.IProductoService;
 @Service
public class ProductoServiceImpl implements IProductoService {
	@Autowired
	private IProductoDAO dao;

	@Override
	public Producto registrar(Producto p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Producto modificar(Producto p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public void eliminar(int idProducto) {
		// TODO Auto-generated method stub
		dao.delete(idProducto);
	}

	@Override
	public Producto listarId(int idProducto) {
		// TODO Auto-generated method stub
		return dao.findOne(idProducto);
	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
