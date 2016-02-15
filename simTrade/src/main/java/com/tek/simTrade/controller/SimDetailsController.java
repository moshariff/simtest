package com.tek.simTrade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tek.simTrade.service.SimDetailsService;

@RestController
@RequestMapping(value="/sim-details/")
public class SimDetailsController
{
	@Autowired
	private SimDetailsService simDetailsService;
	
	@RequestMapping(value = "/create-sim-trade", method = RequestMethod.GET)
	@ResponseBody
	String createSimTrade()
	{
		simDetailsService.createSimTradeTable();
		System.out.println("in right class");
		return "true";
	}
<<<<<<< HEAD

//this is the first changes i did

=======
>>>>>>> b7e1f3ec7d05c38f79e923208959263da07e1df9
}
