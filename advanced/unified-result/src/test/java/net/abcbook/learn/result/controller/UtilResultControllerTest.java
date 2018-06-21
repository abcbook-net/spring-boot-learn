package net.abcbook.learn.result.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import net.abcbook.learn.result.UnifiedResultApplicationTests;
import net.abcbook.learn.result.enums.ResultEnum;
import net.abcbook.learn.result.utils.ResultUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.LinkedMultiValueMap;

/**
 * @author summer
 * @date 2018/6/21 下午3:58
 */
@AutoConfigureMockMvc
@Slf4j
public class UtilResultControllerTest extends UnifiedResultApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    /**
     * @author summer
     * @date 2018/6/21 下午4:26
     * @return void
     * @description 测试未知错误请求
     */
    @Test
    public void error() throws Exception {
        /*
         * 通过 Jackson 封装预期返回结果
         */
        ObjectMapper objectMapper = new ObjectMapper();
        String expectResult = objectMapper.writeValueAsString(ResultUtil.error());

        /*
         * 模拟请求, 并验证请求结果
         * 1. 请求的返回状态正确
         * 2. 请求的返回结果和预期结果一致
         */
        mockMvc.perform(
                MockMvcRequestBuilders.get("/util/error")
        )
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().string(expectResult));
    }

    @Test
    public void enumError() throws Exception {
        /*
         * 通过 Jackson 封装预期返回结果
         */
        ObjectMapper objectMapper = new ObjectMapper();
        String expectResult = objectMapper.writeValueAsString(ResultUtil.error(ResultEnum.ERROR));

        mockMvc.perform(
                MockMvcRequestBuilders.get("/util/error/enum")
                .param("resultEnum", ResultEnum.ERROR.name())
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectResult));
    }

    /**
     * @author summer
     * @date 2018/6/21 下午5:29
     * @return void
     * @description 测试普通 post 请求是否正常
     */
    @Test
    public void success() throws Exception {
        /*
         * 通过 Jackson 封装预期返回结果
         */
        ObjectMapper objectMapper = new ObjectMapper();
        String expectResult = objectMapper.writeValueAsString(ResultUtil.success());

        mockMvc.perform(
                MockMvcRequestBuilders.get("/util/success")
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectResult));
    }

    /**
     * @author summer
     * @date 2018/6/21 下午5:30
     * @return void
     * @description 测试带参数的请求, 是否正常
     */
    @Test
    public void successData() throws Exception {
        // 定义传入的值
        LinkedMultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<String, String>();
        multiValueMap.add("username","summer");
        multiValueMap.add("age","14");
        multiValueMap.add("gender", "1");


        /*
         * 通过 Jackson 封装预期返回结果
         */
        // 无法判断内容, 详情请看本方法最后注释
//        ObjectMapper objectMapper = new ObjectMapper();
//        String expectResult = objectMapper.writeValueAsString(ResultUtil.success(multiValueMap));

        // 定义请求路径, 请求方式, 请求参数
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/util/success/data");
        requestBuilder.params(multiValueMap);

        // 执行请求
        ResultActions resultActions = mockMvc.perform(requestBuilder);
        /*
         * 对结果进行预判
         * 1. 返回的状态码是 2xx
         * 2. 返回结果是传入的预订结果
         */
        resultActions.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
        // 因为 LinkedMultiValueMap 的 value 值是 LinkedList 所以在生成 json 的时候会呈现数组结构,
        // 所以此处使用内容判断会出现问题
//        resultActions.andExpect(MockMvcResultMatchers.content().string(expectResult));

    }

}