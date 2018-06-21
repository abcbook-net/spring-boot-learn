package net.abcbook.learn.parameter.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author summer
 * @date 2018/6/19 下午5:44
 * 测试直接从 cookie 中获取值
 */
@RestController
@RequestMapping("/cookie")
public class CookieValueController {

    @GetMapping
    public String cookieValue(@CookieValue("token") String token) {
        return token;
    }
}
