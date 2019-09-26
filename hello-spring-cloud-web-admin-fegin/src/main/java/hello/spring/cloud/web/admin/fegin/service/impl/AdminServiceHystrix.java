package hello.spring.cloud.web.admin.fegin.service.impl;

import hello.spring.cloud.web.admin.fegin.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @ClassName AdminServiceHystrix
 * @Author:Jerry.Liu;
 * @Description://TODO
 * @Package hello.spring.cloud.web.admin.fegin.service.impl
 * @Date 2019/9/25 16:58
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi() {
        return "It has somen error in your server";
    }
}
