package pivotalparis.credhubdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
@RestController
public class CredhubdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CredhubdemoApplication.class, args);
	}

	@Value("${vcap.services.mongo.credentials.uri}")
	String uri;

	@RequestMapping(value = "/demo")
	public String demo(	) {
		return uri;
}

}