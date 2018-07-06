package com.prud.zm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prud.zm.bean.ILDataList;
import com.prud.zm.persist.ILPersister;
import com.prud.zm.pojo.ILDataEntity;
import com.prud.zm.processor.ILProcessor;

@Service
public class ILService {

	@Autowired
	private ILPersister ilPersister;
	
	@Autowired
	private ILProcessor ilProcessor;
	
	public String addILData(ILDataList ilDataList){
		List<ILDataEntity> parseILData = ilProcessor.parseILData(ilDataList);
		for(ILDataEntity ildataEntity : parseILData){
			ilPersister.addIlData(ildataEntity);
		}
		return "SUCCESS";
	}
}
