package example.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringCloudApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(
//                        p -> p.path("/compute-service/**")
//                                .filters(f -> f.stripPrefix(1))
//                                .uri("lb://compute-service")
//                )
//                .route(
//                        p -> p.path("/product-service/**")
//                                .filters(f -> f.stripPrefix(1))
//                                .uri("lb://product-service")
//                )
//                .route(
//                        p -> p.path("/server/**")
//                                .uri("lb://sidecar")
//                )
//                .route(
//                        p -> p.path("/client/**")
//                                .uri("lb://sidecar")
//                )
//                .build();
//    }

}
