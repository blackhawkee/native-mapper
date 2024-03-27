package com.mapper.nativemapper.model.map;

import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

import com.mapper.nativemapper.model.dto.TestRequest;
import com.mapper.nativemapper.model.dto.TestResponse;

@Component
public class TestRequestToTestResponseMap extends PropertyMap<TestRequest, TestResponse>{

    @Override
    protected void configure() {
        map().setOutputField1(source.getInputField1());
        map().setOutputField2(source.getInputField2());
    }
    
}
