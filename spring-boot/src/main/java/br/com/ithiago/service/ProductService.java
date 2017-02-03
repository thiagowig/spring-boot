package br.com.ithiago.service;

import br.com.ithiago.model.Product;

public interface ProductService {

	Product findByDescription(String description) throws Exception;
}
