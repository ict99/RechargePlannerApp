// This class RechargeController is control the views and model objects 
package com.cts.controllers;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.validation.Valid;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import com.cts.model.CustomerDetails;
import com.cts.service.RechargeService;
/**
 * Recharge Controller
 *
 */
public class RechargeController {

	private RechargeService rechargeService;
	// add an initbinder ... to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for our validation
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor rechargeDateEditor = new CustomDateEditor(dateFormat, true);
		dataBinder.registerCustomEditor(Date.class, rechargeDateEditor);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@Autowired
	public RechargeController(RechargeService rechargeService) {
		super();
		this.rechargeService = rechargeService;
	}
	/**
	 * @params 
	 * @return ModelAndView
	 * @mapping "/"
	 */ 
	public ModelAndView show() {
		//write your code here
		return null;
	}
	/**
	 * @params customerDetails,bindingResult,model
	 * @return String
	 * @mapping "/check"
	 */ 
	public String checkStatus(@Valid @ModelAttribute("customerDetails") CustomerDetails customerDetails,
			BindingResult result, Model model,HttpSession session) {
		//Write your code here
		return null;
	}
	/**
	 * @params pid,model
	 * @return String
	 * @mapping "/details/{pid}"
	 */ 
	public String showDetailPage(@PathVariable("pid") int pid, Model model) {
		
		return null;
	}
}
