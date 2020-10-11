package com.TacoLoco.springboot.demo.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TacoLoco.springboot.demo.data.TacoMenu;
import com.TacoLoco.springboot.demo.exception.TacoNotFoundException;
import com.TacoLoco.springboot.demo.model.TotalOrderRequest;
import com.TacoLoco.springboot.demo.model.TotalOrderResponse;

@RestController
public class OrderController {
	@RequestMapping("/placeorder")
	public TotalOrderResponse orderTotal(@RequestBody TotalOrderRequest request) {
		double totalPrice = 0; int totalQuantity = 0;
		for(Map.Entry<String, Integer> map: request.getFoodOrder().entrySet()) {
			String items = map.getKey(); int quantites = map.getValue();
			//Check if the Taco exists. throw exception if null
			if(!TacoMenu.tacomenu.containsKey(items)) {
				throw new TacoNotFoundException();}
			totalQuantity += quantites;
			double pricePerItem = TacoMenu.tacomenu.get(items);
			double tempPrice = quantites * pricePerItem;
			totalPrice += tempPrice;
		}
		if(totalQuantity > 3) {
			double discount =totalPrice*0.2;
			totalPrice-=discount;
		} return new TotalOrderResponse(request.getcustomerId(), totalPrice);
	}
}
