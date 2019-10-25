package com.wildcodeschool.doctorwho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class DoctorWhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorWhoApplication.class, args);
	}

	@RequestMapping("/doctor/{id}")
	@ResponseBody
	public String doctor (@PathVariable int id){
		if (id == 9) {
			return "number:" + id + ",name: Christopher Eccleston";
		}
		if (id == 10) {
			return "number:" + id + ",name: David Tennant";
		}
		if (id == 11) {
			return "number:" + id + ",name: Matt Smith";
		}
		if (id == 12) {
			return "number:" + id + ",name: Peter Capaldi";
		}
		if (id == 13) {
			return "number:" + id + ",name: Jodie Whittaker";
		}
		if (id >= 1 && id <= 8) {
			throw new ResponseStatusException(HttpStatus.SEE_OTHER, "");
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de récupérer l'incarnation" + id);
	}

}
