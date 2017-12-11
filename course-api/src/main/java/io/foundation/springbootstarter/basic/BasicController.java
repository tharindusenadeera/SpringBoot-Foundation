package io.foundation.springbootstarter.basic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	@RequestMapping("/basic")
	public String saySomething() {
		 return "Say Something";
	}
}
