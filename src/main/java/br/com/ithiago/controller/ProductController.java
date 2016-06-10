package br.com.ithiago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ithiago.model.Product;
import br.com.ithiago.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/")
	public String listAll() {
		return "Listing some products";
	}
	
	@RequestMapping("/product")
	public Product findByDescription(@RequestParam(required=false) String description) {
		return productService.findByDescription(description);
	}
}
