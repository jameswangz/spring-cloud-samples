package example.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class ProductController {

    private final Logger logger = Logger.getLogger(String.valueOf(getClass()));

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Product> all() {
        List products = new ArrayList<>();
        products.add(new Product("A1", "iPhone 7"));
        products.add(new Product("A2", "Mac Book Pro"));
        products.add(new Product("A3", "iPad Pro"));
        return products;
    }

}
