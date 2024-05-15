package kr.or.kosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class SessionClusteringController {

	// 모든 사람이 접근 가능
	@GetMapping("/")
	public String home(HttpSession session) {
		
		System.out.println("SessionId = " + session.getId());
		return "index";
	}

}
