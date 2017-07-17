package myprojects.sample.oauth.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class HomeController {
	@Value("${server.contextPath}")
	private String baseURL;
	

	/**
	 * * Home redirection to swagger api documentation * @return redirect to
	 * swagger docu
	 */
	@RequestMapping(value = "/")
	public String index() {
		return "redirect:swagger-ui.html";
	}
}
