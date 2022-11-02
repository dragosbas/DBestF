package com.example.dbestf;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
class DBestFApplicationTests {

    @Test
    void contextLoads() throws Exception {
        assertTrue("Test1", true);
    }

}
