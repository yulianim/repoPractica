package com.milysoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.milysoft.model.Producto;

@Repository
public interface IProductoDAO extends JpaRepository<Producto, Integer>{

}
