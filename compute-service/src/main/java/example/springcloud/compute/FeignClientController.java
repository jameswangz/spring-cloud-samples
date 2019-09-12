package example.springcloud.compute;

import example.springcloud.compute.client.BusNumberClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class FeignClientController {

    private final Logger logger = Logger.getLogger(String.valueOf(getClass()));

    @Autowired
    private BusNumberClient busNumberClient;

    @RequestMapping(value = "/bus_numbers", method = RequestMethod.GET)
    public Object busNumbers(@RequestHeader("Authorization") String token) {
        Object busNumbers = busNumberClient.getBusNumbers(token);
        logger.info(busNumbers.toString());
        return busNumbers;
    }

}
