package com.liugang.warehousemangerment.security;

import com.liugang.warehousemangerment.entity.person.Manager;
import com.liugang.warehousemangerment.service.person.ManagerService;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author wuhuihua
 * @data 2018 - 12
 * @packageName com.liugang.warehousemangerment.security
 * @projectName warehouse-mangerment
 * 定义授权的规则和定义认证的规则
 */
@EnableWebSecurity
public class ManagerSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 定义授权的规则
     * 定义哪些角色可以访问哪些页面
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //定制授权的规则1)所有的用户都可以来访问到根目录
        //  2)只有manager的用户才能登录到当前目录下的所有页面
        http
                .authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/manager/**").hasRole("MANAGER");
        http.formLogin().loginPage("/login");//没有权限的自动到login页面

        http.logout().logoutSuccessUrl("/");//注销时回到主页面
    }

    /**
     * 定义认证的规则
     * 给哪些人定义哪些角色
     * @param auth
     * @throws Exception
     */
    @Resource(name = "managerService")
    private ManagerService managerService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //下面给所有的管理员给权限(从数据库中获取数据)
        List<Manager> allManagers = managerService.getAllManagers();
        for(Manager manager : allManagers){
            auth.inMemoryAuthentication()
                    .passwordEncoder(new MyPasswordEncoder())
                    .withUser(manager.getManagerName())
                    .password(manager.getPassword())
                    .roles("MANAGER");
            System.out.println("-------------------"+manager);
        }
    }
}
