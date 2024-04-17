package dev.byli.sdk.a.client;

import dev.byli.sdk.a.dto.DummyDto;
import dev.byli.sdk.a.exception.DummyException;
import org.springframework.web.reactive.function.client.WebClient;

public class DummyClient {
    private WebClient webClient;

    public DummyClient(WebClient webClient) {
        // Inject webclient with the published host
        this.webClient = webClient;
    }
    public DummyDto getDummyDto() throws DummyException {
        return this.webClient.get()
                .retrieve()
                .bodyToMono(DummyDto.class)
                .onErrorResume(t-> {throw new DummyException(t);})
        .block();
    }
}
