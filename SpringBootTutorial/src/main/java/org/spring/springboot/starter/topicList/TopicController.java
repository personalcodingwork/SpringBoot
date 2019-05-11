package org.spring.springboot.starter.topicList;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topics> getAllTopics(){
		return Arrays.asList(
				new Topics(1,"Collection","Very simple to learn and it is simple form of generics"),
				new Topics(2,"Spring Boot","Production ready code"),
				new Topics(3,"Rest API","Easy to learn using jaxrs")
				);
	}
}
