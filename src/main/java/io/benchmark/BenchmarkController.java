package io.benchmark;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BenchmarkController {

    @GetMapping("/hello")
    public Mono<String> helloWorld(){
        return Mono.just("Hello World!");
    }

}
