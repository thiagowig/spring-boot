package br.com.ithiago.controller;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ithiago.model.Product;
import br.com.ithiago.service.ProductService;

@RestController()
public class ProductController {
	
	private static final Logger LOGGER = LogManager.getLogger(ProductController.class);

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public Product findByDescription(@RequestParam(required=false) String description) throws Exception {
		LOGGER.log(Level.INFO, "The method findByDescription was called");
		
		return productService.findByDescription(description);
	}
	
	@RequestMapping(value="/product/{id}", method=RequestMethod.GET)
	public String findById(@PathVariable Long id) {
		LOGGER.log(Level.INFO, "The method findById was called");
		
		return "The id is: " + id;
	}
}
