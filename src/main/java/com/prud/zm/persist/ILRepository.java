package com.prud.zm.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prud.zm.pojo.ILDataEntity;

@Repository
public interface ILRepository extends CrudRepository<ILDataEntity, Long>{

}
