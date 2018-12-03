package controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, String> m=new HashMap<String, String>();
		String name=request.getParameter("name");
		m.put("msg", "your name "+name);
		ModelAndView modelAndView=new ModelAndView("success",m );		
		return modelAndView;
	}

}
