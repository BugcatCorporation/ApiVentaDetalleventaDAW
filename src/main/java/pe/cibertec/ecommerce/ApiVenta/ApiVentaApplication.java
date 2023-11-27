package pe.cibertec.ecommerce.ApiVenta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class ApiVentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiVentaApplication.class, args);
	}

}
