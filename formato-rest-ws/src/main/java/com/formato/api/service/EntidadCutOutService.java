package com.formato.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formato.api.dao.IEntityCutOutDAO;
import com.formato.api.dto.EntityCutOut;

@Service
public class EntidadCutOutService {
	
	@Autowired
    private IEntityCutOutDAO dao;

    public EntityCutOut save(EntityCutOut t) { return dao.save(t); }

    public EntityCutOut update(EntityCutOut t) { return dao.save(t); }

    public void delete(EntityCutOut t) { dao.delete(t); }

    public Iterable<EntityCutOut> list() { return dao.findAll(); }

    public Optional<EntityCutOut> listId(long id) {
        return dao.findById(id);
    }
	
}
