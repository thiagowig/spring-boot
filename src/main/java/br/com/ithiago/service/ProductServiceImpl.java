package br.com.ithiago.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.ithiago.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	private final AtomicLong counter = new AtomicLong();

	@Override
	public Product findByDescription(String description) {
		Product product = new Product(counter.incrementAndGet(), "This is " + description);
		
		return product;
	}

}
