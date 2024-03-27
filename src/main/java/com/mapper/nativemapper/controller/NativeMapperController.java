package com.mapper.nativemapper.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapper.nativemapper.model.dto.TestRequest;
import com.mapper.nativemapper.model.dto.TestResponse;
import com.mapper.nativemapper.service.NativeMapperService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "native-mapper", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class NativeMapperController {
    
    private NativeMapperService service;

    @PostMapping(value = "/test")
    private Mono<TestResponse> test (@RequestBody TestRequest request) {
        return service.testService(request);
    }
}
