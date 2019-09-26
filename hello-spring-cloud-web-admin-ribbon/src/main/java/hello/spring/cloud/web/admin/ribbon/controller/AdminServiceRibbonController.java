package hello.spring.cloud.web.admin.ribbon.controller;

import hello.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AdminServiceRibbonController
 * @Author:Jerry.Liu;
 * @Description://TODO
 * @Package hello.spring.cloud.web.admin.ribbon.controller
 * @Date 2019/9/18 17:39
 */
@RestController
public class AdminServiceRibbonController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/hi")
    public  String sayHi(){
        return  adminService.syaHi();
    }
}
