package com.i5.section03.annotationconfig.subsection01.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.i5") //컴포넌트 스캔 범위 설정
public class ContextConfiguration {
}
