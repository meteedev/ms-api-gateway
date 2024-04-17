package com.meteeshop.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}

	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("orders-route", r -> r.path("/shop/api/v1/orders/**").uri("lb://ORDER-SERVICE"))
				.route("payments-route", r -> r.path("/shop/api/v1/payments/**").uri("lb://PAYMENT-SERVICE"))
				.route("inventory-route", r -> r.path("/shop/api/v1/inventories/**").uri("lb://INVENTORY-SERVICE"))
				//.route("tracker-route", r -> r.path("/tracker/**").uri("lb://tracker-service"))
				.build();
	}

}
