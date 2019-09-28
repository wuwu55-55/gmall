package com.atguigu.gmall.wms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.atguigu.gmall.wma.dao")
@EnableSwagger2
@RefreshScope
public class GmallWmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallWmaApplication.class, args);
	}

}
