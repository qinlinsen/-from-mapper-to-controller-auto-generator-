package com.eagle.frommappertocontrollerautogenerator;

import com.eagle.generator.Generator;
import com.eagle.test.mapper.CountryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FromMapperToControllerAutoGeneratorApplicationTests {
    @Resource
    CountryMapper countryMapper;
   @Test
    public void test(){
       Generator.startDB();

   }
}
