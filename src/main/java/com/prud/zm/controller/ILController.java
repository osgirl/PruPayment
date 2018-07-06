package com.prud.zm.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prud.zm.bean.ILDataList;
import com.prud.zm.service.ILService;


@RestController
@RequestMapping("/ILDataJson")
public class ILController {

	@Autowired
	private ILService ilService;
	
	 @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public String addOrder(@RequestBody ILDataList ilDataList) throws ParseException{
			return ilService.addILData(ilDataList);
	    }
	 
}
