package com.mapper.nativemapper.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mapper.nativemapper.model.map.TestRequestToTestResponseMap;

@Configuration
public class ModelMapperConfig {
    
    @Autowired
    private TestRequestToTestResponseMap testRequestToTestResponseMap;

    @Bean
    ModelMapper modelMapper(){
        var modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        modelMapper.addMappings(testRequestToTestResponseMap);

        return modelMapper;
    }
}
