package com.zjy.web;

import com.zjy.dao.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.List;

class WebApplicationTests extends BaseTests {

    @Test
    void contextLoads() {
        System.out.println("---OK---");
    }

    @Test
    void test() {
        WebClient client = WebClient.builder().baseUrl("http://localhost:8082/").build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
        UserHttpInterface service = factory.createClient(UserHttpInterface.class);
        List<UserInfo> users = service.getUsers();
        for (UserInfo user : users) {
            System.out.printf("%d-%s%n", user.getId(), user.getName());
        }
    }
}
