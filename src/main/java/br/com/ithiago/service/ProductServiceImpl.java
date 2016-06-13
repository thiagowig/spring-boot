package br.com.ithiago.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ithiago.model.Product;
import br.com.ithiago.rest.RestClient;
import br.com.ithiago.util.JsonMapper;

@Service
public class ProductServiceImpl implements ProductService {

	private static final String REST_URL = "http://www.mocky.io/v2/575ec8f4110000a7192992dd";
	
	@Autowired
	private RestClient restClient;
	
	public ProductServiceImpl() {
	}
	
	public ProductServiceImpl(RestClient restClient) {
		this.restClient = restClient;
	}

	@Override
	public Product findByDescription(String description) throws Exception {
		String response = restClient.getResponse(REST_URL);

		return (Product) JsonMapper.toObject(response, Product.class);
	}
	
}
