package com.bookstore.resource;

import java.util.Collections;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.service.UserService;

@RestController
public class LoginResource {

	@Autowired
	private UserService userService;
	
	@GetMapping("/token")
	public Map<String, String> token(HttpSession session, HttpServletRequest request)
	{
		
		String remoteHost = request.getRemoteHost();
		int portNumber = request.getRemotePort();
		
		System.out.println("Remote Host "+remoteHost);
		System.out.println("Remote port number = "+portNumber);
		System.out.println(request.getRemoteAddr());
		
		return Collections.singletonMap("token", session.getId());
	}
}
