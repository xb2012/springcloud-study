package org.crayit.cloud;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping(value="/person",method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public person getperson(HttpServletRequest request){
		person p=new person();
		p.setId(1);
		p.setName("angulae");
		p.setMessage(request.getRequestURL().toString());
		return p;
	}

}
