package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@SpringBootApplication
public class MyProjectApplication {


	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		 return "<ul>"+
				"<li><a href= 'http://localhost:8080/doctor/1'</a> first doctor </li>" +
				"<li><a href= 'http://localhost:8080/doctor/2'</a> second doctor </li>" +
				"<li><a href= 'http://localhost:8080/doctor/3'</a>  third doctor </li>" +
				"<li><a href= 'http://localhost:8080/doctor/4'</a> fourth doctor </li> " +
			"</ul>";
	}

	 @RequestMapping("/doctor/1")
	 @ResponseBody
	 public String docone() {
	 	return "William Hartnell";
		}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctwo() {
		return "Patrick Troughton";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String docthree() {
		return "Jon Pertwee";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String docfour() {
		return "Tom Baker";
	}

}
