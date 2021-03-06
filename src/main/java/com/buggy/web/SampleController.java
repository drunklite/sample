/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.buggy.web;

import com.buggy.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/")
    @ResponseBody
    public String helloWorld() {

        Logger logger = LoggerFactory.getLogger(SampleController.class);
        logger.info("log with slf4j");

        return this.helloWorldService.getHelloMessage()+"--index...";
    }

//    @RequestMapping("/j")
//    @ResponseBody
//    public String jrebel() {
//
//        Logger logger = LoggerFactory.getLogger(SampleController.class);
//        logger.info("log with slf4j");
//
//        return this.helloWorldService.getHelloMessage()+"--JrebelWorking...";
//    }

    @RequestMapping("/tm")
    public String tm(){
        return "tm";
    }

    @RequestMapping("/self")
    @ResponseBody
    public String selfDefine(){
        return "selfDefine function";
    }

//    @Controller
//    public class MainController {
//
//        @RequestMapping("/")
//        public String index() {
//            return "index";
//        }
//
//    }

}
