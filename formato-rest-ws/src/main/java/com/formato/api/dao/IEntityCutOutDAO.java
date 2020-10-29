package com.formato.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formato.api.dto.EntityCutOut;

@Repository
public interface IEntityCutOutDAO extends CrudRepository<EntityCutOut, Long>{

}
