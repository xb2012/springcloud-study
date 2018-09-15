package org.crayit.cloud;

import org.apache.http.client.HttpClient;
import com.netflix.client.ClientFactory;
import com.netflix.client.config.ClientConfigFactory;
import com.netflix.client.http.HttpRequest;
import com.netflix.client.http.HttpResponse;
import com.netflix.config.ConfigurationManager;
import com.netflix.niws.client.http.RestClient;
import com.sun.jersey.api.client.Client;
public class TestRibbon {

	public static void main(String[] args) throws Exception{
		ConfigurationManager.getConfigInstance().setProperty(
				"my-client.ribbon.listOfServers", "localhost:8080,localhost:8081");
		RestClient client=(RestClient)ClientFactory.getNamedClient("my-client");
		HttpRequest request=HttpRequest.newBuilder().uri("/person").build();
		for(int i=0;i<10;i++){
			HttpResponse response=client.executeWithLoadBalancer(request);
			String json=response.getEntity(String.class);
			System.out.println(json);
		}

	}

}
