package hello.spring.cloud.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AdminController
 * @Author:Jerry.Liu;
 * @Description://TODO
 * @Package hello.spring.cloud.service.controller
 * @Date 2019/9/11 22:30
 */
@RestController
public class AdminController {

    @Value( "${server.port}")
    private String serverPort;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public  String sayHi(){
        return "hi your server port  is"+serverPort;
    }
}
