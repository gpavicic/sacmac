package rs.sacmac.app.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/*")
	protected ModelAndView handleRequestWelcome(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView modelandview = new ModelAndView("index");
		modelandview.addObject("msg", "Dobrodošli");

		return modelandview;
	}

	@RequestMapping("/slatkepite")
	protected ModelAndView handleRequestslatkepite(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView modelandview = new ModelAndView("twocolumn1");
		modelandview.addObject("msg", "Slatke pite njam njam");

		return modelandview;
	}

	@RequestMapping("/slanepite")
	protected ModelAndView handleRequestslanepite(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView modelandview = new ModelAndView("twocolumn2");
		modelandview.addObject("msg", "Slane pite njam njam");

		return modelandview;
	}

	@RequestMapping("/mlecninapici")
	protected ModelAndView handleRequestmlecninapici(
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView modelandview = new ModelAndView("twocolumn1");
		modelandview.addObject("msg", "Mlecni napici ");

		return modelandview;
	}

	@RequestMapping("/toplinapici")
	protected ModelAndView handleRequesttoplinapici(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView modelandview = new ModelAndView("twocolumn2");
		modelandview.addObject("msg", "Topli napici ");

		return modelandview;
	}	
	
	
	@RequestMapping("/cenovnik")
	protected ModelAndView handleRequestCenovnik(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView modelandview = new ModelAndView("threecolumn");
		modelandview.addObject("welcomeMessage", "Dobrodošli");

		return modelandview;
	}
	
	@RequestMapping("/galerija")
	protected ModelAndView handleRequestgalerija(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView modelandview = new ModelAndView("galerija");
		modelandview.addObject("welcomeMessage", "Dobrodošli");

		return modelandview;
	}

	@RequestMapping("/threecolumn")
	protected ModelAndView handleRequestThreecolumn(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView modelandview = new ModelAndView("threecolumn");
		modelandview.addObject("welcomeMessage", "Dobrodošli");

		return modelandview;
	}

	@RequestMapping("/onecolumn")
	protected ModelAndView handleRequestOnecolumn(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView modelandview = new ModelAndView("onecolumn");
		modelandview.addObject("welcomeMessage", "Dobrodošli");

		return modelandview;
	}

	@RequestMapping("/twocolumn1")
	protected ModelAndView handleRequesttwocolumn1(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView modelandview = new ModelAndView("twocolumn1");
		modelandview.addObject("welcomeMessage", "Dobrodošli");

		return modelandview;
	}

	@RequestMapping("/twocolumn2")
	protected ModelAndView handleRequesttwocolumn2(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView modelandview = new ModelAndView("twocolumn2");
		modelandview.addObject("welcomeMessage", "Dobrodošli");

		return modelandview;
	}

}
