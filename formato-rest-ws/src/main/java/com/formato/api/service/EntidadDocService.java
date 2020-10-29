package com.formato.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formato.api.dao.IEntityDocDAO;
import com.formato.api.dto.EntityDoc;

@Service
public class EntidadDocService {
	
	@Autowired
    private IEntityDocDAO dao;

    public EntityDoc save(EntityDoc t) { return dao.save(t); }

    public EntityDoc update(EntityDoc t) { return dao.save(t); }

    public void delete(EntityDoc t) { dao.delete(t); }

    public Iterable<EntityDoc> list() { return dao.findAll(); }

    public Optional<EntityDoc> listId(int id) {
        return dao.findById(id);
    }
	
}
