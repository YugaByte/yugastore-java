//package com.yugabyte.app.yugastore.service.impl;
//
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.ScopedProxyMode;
//import org.springframework.stereotype.Service;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.yugabyte.app.yugastore.rest.clients.ShoppingCartK8sRestClient;
//
//@Service
//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
//public class ShoppingCartServiceK8sImpl {
//
//	private final ShoppingCartK8sRestClient shoppingCartRestClient;
//
//	@Autowired
//	public ShoppingCartServiceK8sImpl(ShoppingCartK8sRestClient shoppingCartRestClient) {
//		this.shoppingCartRestClient = shoppingCartRestClient;
//	}
//	
////	@Autowired
////	  public ShoppingCartServiceRestImpl(Decoder decoder, Encoder encoder, Client client, 
////				Contract contract) {
////		  this.shoppingCartRestClient = Feign.builder().client(client)
////					.encoder(encoder)
////					.decoder(decoder)
////					.contract(contract)
////					.target(ShoppingCartRestClient.class, 
////							"http://cart-microservice");
////	  }
//
//	public String addProduct(String userId, String asin) {
//
//		String result = shoppingCartRestClient.addProductToCart(userId, asin);
//		return result;
//	}
//
//	public Map<String, Integer> getProductsInCart(String userId) {
//
//		Map<String, Integer> productsInCart = shoppingCartRestClient.getProductsInCart(userId);
//		return productsInCart;
//	}
//
//	public String removeProduct(String userId, String asin) {
//		String result = shoppingCartRestClient.removeProductFromCart(userId, asin);
//		return result;
//	}
//
//	public String clearCart(String userId) {
//		String result = shoppingCartRestClient.clearCart(userId);
//		return result;
//	}
//
//}
