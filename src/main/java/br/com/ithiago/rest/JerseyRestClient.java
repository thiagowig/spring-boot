package br.com.ithiago.rest;

import org.springframework.stereotype.Component;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@Component
public class JerseyRestClient implements RestClient {

	public String getResponse(String url) {
		Client client = Client.create();
		WebResource webResource = client.resource(url);
		
		ClientResponse clientResponse = webResource.get(ClientResponse.class);
		
		return clientResponse.getEntity(String.class);
	}
}
