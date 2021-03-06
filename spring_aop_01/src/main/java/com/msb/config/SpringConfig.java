package com.msb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.msb")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {



}
