package example.springcloud.compute.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient("sidecar")
public interface BusNumberClient {

    @RequestMapping(method = RequestMethod.GET, value = "/server/bus_numbers")
    Object getBusNumbers(@RequestHeader("Authorization") String token);

}
