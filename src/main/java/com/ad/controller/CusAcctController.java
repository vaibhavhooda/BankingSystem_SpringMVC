package com.ad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ad.beans.Customer;
import com.ad.beans.CustomerAcc;
import com.ad.dao.CusAcctDao;

@Controller
public class CusAcctController {
	
	@Autowired
	CusAcctDao daoAC;
	
	/*
	 It displays a form to input data, here "command" is a reserved request
	 attribute which is used to display object data into form
	 */
	@RequestMapping("/cusAcctform")
	public String showform(Model m) {
		m.addAttribute("command", new CustomerAcc());
		return "cusAcctform";
	}	
	
	@RequestMapping(value = "/viewcusAcct/{id}")
	public String viewcusAcct(@PathVariable int id,Model m) {
		List<CustomerAcc> list = daoAC.getCusAcct(id);
		m.addAttribute("list", list);
		return "viewcusAcct";
	}
	
	/*
	 * It saves object into database. The @ModelAttribute puts request data into
	 * model object. I need to mention RequestMethod.POST
	 */
	@RequestMapping(value = "/saveCusAcct", method = RequestMethod.POST)
	public String saveCusAcct(@ModelAttribute("customeracct") CustomerAcc cusacct) {
		daoAC.saveCusAcct(cusacct);
		return "redirect:/viewcusAcct";// will redirect to viewCusAcct request mapping
	}
	
	
	
	

}
