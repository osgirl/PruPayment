package com.prud.zm.persist;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prud.zm.pojo.ILDataEntity;

@WebService
@Component
public class ILPersister{

	@Autowired
	private ILRepository ilRepository;
	
//	@Autowired
//	private EntityManagerFactory entityManagerFactory;
	
	public void addIlData(ILDataEntity ildataEntity){
		ilRepository.save(ildataEntity);
	}
}
