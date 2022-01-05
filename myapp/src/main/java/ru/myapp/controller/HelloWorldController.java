package ru.myapp.controller;

import java.util.concurrent.atomic.AtomicLong;

import io.micrometer.core.annotation.Timed;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.myapp.model.Greeting;

@Controller
@Timed
@Endpoint(id = "hello-world")
public class HelloWorldController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@ReadOperation
	@GetMapping("/hello")
	@ResponseBody
	public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/hello/{studentName}")
	@ResponseBody
	public Greeting sayHelloStudent(@PathVariable() String studentName) {
		return new Greeting(counter.incrementAndGet(), String.format(template, studentName));
	}

}
