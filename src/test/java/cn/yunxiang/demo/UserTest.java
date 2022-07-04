package cn.yunxiang.demo;

import cn.yunxiang.demo.dao.UserMapper;
import cn.yunxiang.demo.domain.po.User;
import cn.yunxiang.demo.enums.Sex;
import lombok.RequiredArgsConstructor;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/**
 * 用户单元测试
 */
@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class UserTest {

    /**
     * mock数据的工具
     */
    @Autowired
    private  MockMvc mockMvc;

    /**
     * 用户的mapper
     */

    @Autowired
    private  UserMapper userMapper;
    @Before
    public void initMockMvc() {
        initEntityData();
    }

    private void initEntityData(){

        User user= User.builder()
                .name("wangqx")
                .code("001")
                .age(34)
                .birthday(LocalDate.of(1987,10,18))
                .email("w18722008525@163.com")
                .phone("18722008525")
                .idNo("xxxxx")
                .sex(Sex.MAN)
                .build();
        userMapper.insert(user);

    }
    /**
     * 测试用例：列表
     */
    @Test
    public void testPageList() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/v1/api/user/page?pageCurrent=1&pageSize=10"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(jsonPath("$.pageSize").value("10"))
                .andExpect(jsonPath("$.pageCurrent").value("1"))
                .andExpect(jsonPath("$.pageTotal").value("1"))
                .andExpect(jsonPath("$.records[0].name").value("wangqx"))
                .andExpect(jsonPath("$.records[0].phone").value("18722008525"))
                .andExpect(jsonPath("$.records[0].sex").value("MAN"));
    }




}
