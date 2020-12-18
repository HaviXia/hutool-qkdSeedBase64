package com.example.demo;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.RandomUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //seed生成规则,产生一个32字节随机数,然后Base64输出
        //对等节点的seed相同
        //SpringApplication.run(DemoApplication.class, args);
        byte[] seed = RandomUtil.randomBytes(32);
        System.out.println(Base64.encode(seed));
    }
}
