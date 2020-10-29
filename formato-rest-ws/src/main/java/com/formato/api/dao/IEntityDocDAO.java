package com.formato.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formato.api.dto.EntityDoc;

@Repository
public interface IEntityDocDAO extends CrudRepository<EntityDoc, Integer>{

}
