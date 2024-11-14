package com.example.myapi;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MyApiControllerTest {

    @Test
    void testSayHello() {
        MyApiController controller = new MyApiController();
        String response = controller.sayHello();
        assertThat(response).isEqualTo("Hello, World!");
    }
}