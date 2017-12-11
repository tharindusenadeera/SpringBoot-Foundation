package io.foundation.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return Arrays.asList(
				new Topic("Spring", "Spring Frame work", "Spring Framework Desc"),
				new Topic("Spring", "Spring Frame work", "Spring Framework Desc")
				);
	}

}
