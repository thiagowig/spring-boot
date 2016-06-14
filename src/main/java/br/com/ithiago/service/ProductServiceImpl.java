package br.com.ithiago.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ithiago.model.Product;
import br.com.ithiago.rest.RestClient;
import br.com.ithiago.util.JsonMapper;

@Service
public class ProductServiceImpl implements ProductService {

	public static final String API_URL = "http://localhost:8090/api/product";
	
	/**
	 * Use {@link ProductServiceImpl#API_URL} instead.
	 */
	@Deprecated
	public static final String OLD_API_URL = "http://www.mocky.io/v2/575ec8f4110000a7192992dd";
	
	
	private RestClient restClient;
	
	@Autowired
	public ProductServiceImpl(RestClient restClient) {
		this.restClient = restClient;
	}

	@Override
	public Product findByDescription(String description) throws Exception {
		String response = restClient.getResponse(API_URL);

		return (Product) JsonMapper.toObject(response, Product.class);
	}
	
}
