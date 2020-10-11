package com.TacoLoco.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TacoLoco.springboot.demo.data.TacoMenu;
import com.TacoLoco.springboot.demo.model.MenuResponse;

@RestController
public class MenuController {
	
	@RequestMapping("/menu")
	public MenuResponse menu() {
		return new MenuResponse(TacoMenu.tacomenu);
	}
}
