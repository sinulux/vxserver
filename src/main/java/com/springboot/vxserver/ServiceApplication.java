package com.springboot.vxserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wangshibao
 * @ClassName ServiceApplication
 * @Description 启动类
 * @date 2018/4/23 10:17
 */
// spring boot的注解，一般只用于主类，是无xml配置启动的关键部分,
// 明确指定了扫描包的路径为其修饰的主类的包（这也就是为什么主类要放在根包路径下的原因）
@EnableAutoConfiguration
// 等价于上面3个注解，没有mapper.xml或者mapper.java时，可直接使用该注解
@SpringBootApplication
@EnableScheduling
@EnableSwagger2
public class ServiceApplication {

    /**
     * spring boot的入口，在整个子项目在内
     *
     * @param args
     * @return
     * @author wangshibao
     * @date 2018/4/23 10:55
     */
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
