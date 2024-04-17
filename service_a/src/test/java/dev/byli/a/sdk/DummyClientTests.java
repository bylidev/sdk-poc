package dev.byli.a.sdk;

import dev.byli.a.ServiceAApplication;
import dev.byli.sdk.a.client.DummyClient;
import dev.byli.sdk.a.dto.DummyDto;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;

public class DummyClientTests extends ServiceAApplication {
    @Test
    void getDummy_test(){
        WebClient webClient = WebClient.create("http://localhost:8080");
        DummyClient dummyClient = new DummyClient(webClient);
        DummyDto dummyDto = dummyClient.getDummyDto();
        assert dummyDto.getName().equals("Service A");
        assert dummyDto.getDescription().equals("Hello, Service A!");
    }
}
