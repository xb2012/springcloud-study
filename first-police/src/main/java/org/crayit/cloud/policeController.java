package org.crayit.cloud;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class policeController {	
	@RequestMapping(value="/call/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public police call(@PathVariable Integer id){
		police p=new police();
		p.setId(id);
		p.setName("ANgular");
		return p;
	}

}
