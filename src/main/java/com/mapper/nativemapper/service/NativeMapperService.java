package com.mapper.nativemapper.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.mapper.nativemapper.model.dto.TestRequest;
import com.mapper.nativemapper.model.dto.TestResponse;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
@Slf4j
public class NativeMapperService {

    private ModelMapper modelMapper;

    public Mono<TestResponse> testService(final TestRequest request) {
        log.info("request {}", request.toString());
        var response = modelMapper.map(request, TestResponse.class);
        
        log.info("response {}", response.toString());
        return Mono.just(response);
    }
}
