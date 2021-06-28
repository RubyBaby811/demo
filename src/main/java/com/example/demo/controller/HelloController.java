/*
  Copyright (C), 2020-2021, XXX有限公司
  FileName: HelloController
  Author:   ruby
  Date:     2021/6/21 19:56
  Description: HelloController
  History:
  <author>          <time>          <version>          <desc>
  作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈HelloController〉
 *
 * @author ruby
 * @create 2021/6/21
 * @since 1.0.0
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String sayHello() {
        System.out.println("第一次修改");
        return "index";
    }

}