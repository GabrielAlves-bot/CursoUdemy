package br.com.erudio.ProjetoRestSpringBoot;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static final String template = " Hello, %s!";
	private final AtomicLong couter = new AtomicLong();
	
	@RequestMapping("/gretting")
	public Greeting greeting (@RequestParam(value = "name", defaultValue = "world") String name) {
		
		return new Greeting(couter.incrementAndGet(), String.format(template, name));
		
	}
}
