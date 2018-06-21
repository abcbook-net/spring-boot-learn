package net.abcbook.learn.result.controller;

import net.abcbook.learn.result.UnifiedResultApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author summer
 * @date 2018/6/20 下午6:42
 */
@AutoConfigureMockMvc
public class HelloResultControllerTest extends UnifiedResultApplicationTests {

    /**
     * Mock MVC提供了一种强力的方式来测试MVC controllers，而不用启动一个完整的HTTP server
     * 模拟一个 HTTP Server
     */
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloResult() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/hello")
                        .param("source", "abc"))
                .andExpect(
                        MockMvcResultMatchers.status().isOk()
                )
                .andReturn();

    }
}