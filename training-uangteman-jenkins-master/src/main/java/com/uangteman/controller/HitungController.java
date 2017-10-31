package com.uangteman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uangteman.services.HitungServices;


@RestController
@RequestMapping("/operation")
public class HitungController {
	
	@Autowired
	private HitungServices hitungService;
	
	@RequestMapping(method=RequestMethod.GET, value="/plus/{a}/{b}")
	public int add(@PathVariable("a") int a, @PathVariable("b") int b) {
		return hitungService.add(a, b);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/minus/{a}/{b}")
	public int minus(@PathVariable("a") int a, @PathVariable("b") int b) {
		return hitungService.minus(a, b);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/multiple/{a}/{b}")
	public int multiple(@PathVariable("a") int a, @PathVariable("b") int b) {
		return hitungService.multiple(a, b);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/divide/{a}/{b}")
	public float divide(@PathVariable("a") int a, @PathVariable("b") int b) {
		return hitungService.divide(a, b);
	}
}
