package io.foundation.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("Spring", "Spring Frame work", "Spring Framework Desc"),
			new Topic("Java", "Spring Frame work", "Spring Framework Desc")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
		
	}
	
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}
