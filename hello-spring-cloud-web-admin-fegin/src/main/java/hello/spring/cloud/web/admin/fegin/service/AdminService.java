package hello.spring.cloud.web.admin.fegin.service;

import hello.spring.cloud.web.admin.fegin.service.impl.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName AdminService
 * @Author:Jerry.Liu;
 * @Description://TODO
 * @Package hello.spring.cloud.web.admin.fegin.service
 * @Date 2019/9/19 1:09
 */
@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi();
}
