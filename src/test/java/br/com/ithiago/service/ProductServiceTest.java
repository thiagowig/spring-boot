package br.com.ithiago.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.ithiago.model.Product;
import br.com.ithiago.rest.RestClient;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {
	
	@Mock
	private RestClient restClient;
	
	private String response = "{\"id\" : \"1\",\"description\" : \"Motorola startac\"}";
	
	@Test
	public void shouldReturnAProduct() throws Exception {
		initMocks(this);
		when(restClient.getResponse(anyString())).thenReturn(response);
		
		ProductService productService = new ProductServiceImpl(restClient);
		Product product = productService.findByDescription("Motorola");
		
		assertProduct(product);
	}
	
	@Test
	public void doingAError() {
		assertEquals(true, false);
	}

	private void assertProduct(Product product) {
		Long expectedId = 1L;
		String expectedDescription = "Motorola startac";		
		
		assertEquals(expectedId, product.getId());
		assertEquals(expectedDescription, product.getDescription());
	}
}
