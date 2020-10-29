package com.formato.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formato.api.dao.IEntityFormatDAO;
import com.formato.api.dto.EntityFormat;

@Service
public class EntidadFormatoService {
	
	@Autowired
    private IEntityFormatDAO dao;

    public EntityFormat save(EntityFormat t) { return dao.save(t); }

    public EntityFormat update(EntityFormat t) { return dao.save(t); }

    public void delete(EntityFormat t) { dao.delete(t); }

    public Iterable<EntityFormat> list() { return dao.findAll(); }

    public Optional<EntityFormat> listId(int id) {
        return dao.findById(id);
    }
	
}
