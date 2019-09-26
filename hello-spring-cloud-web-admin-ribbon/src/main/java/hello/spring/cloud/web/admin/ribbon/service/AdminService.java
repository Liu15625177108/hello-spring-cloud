package hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName AdminService
 * @Author:Jerry.Liu;
 * @Description://TODO
 * @Package hello.spring.cloud.web.admin.ribbon.service
 * @Date 2019/9/18 17:34
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String syaHi(){
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi", String.class);
    }
    public String hiError(){
        return "It has some error in our server";
    }

}
