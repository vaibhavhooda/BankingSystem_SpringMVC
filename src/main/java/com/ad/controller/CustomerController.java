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
import com.ad.dao.CustomerDao;

@Controller
public class CustomerController {

	@Autowired
	CustomerDao daoC;
	
	/*
	 It displays a form to input data, here "command" is a reserved request
	 attribute which is used to display object data into form
	 */
	@RequestMapping("/customerform")
	public String showform(Model m) {
		m.addAttribute("command", new Customer());
		return "customerform";
	}
	@RequestMapping(value = "/viewcustomer/{id}")
	public String viewcustomer(@PathVariable int id,Model m) {
		List<Customer> list = daoC.getCustomer(id);
		m.addAttribute("list", list);
		return "viewcustomer";
	}
	/*
	  It displays object data into form for the given id. The @PathVariable puts
	  URL data into variable.
	 */
	@RequestMapping(value = "/editcustomer/{id}")
	public String editCustomer(@PathVariable int id, Model m) {
		Customer customer = daoC.getCustomerById(id);
		m.addAttribute("command", customer);
		return "customereditform";
	}
	/* It updates model object. */
	@RequestMapping(value = "/editsaveCustomer", method = RequestMethod.POST)
	public String editsaveCustomer(@ModelAttribute("customer") Customer customer) {
		daoC.updateCustomer(customer);
		return "redirect:/viewcustomer";
	}
	
	// this part only shows in login admin 
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		daoC.saveCustomer(customer);
		//** SHOW MESSAGE 'SUCCESS' HERE 
		return "redirect:/customerform";
		
	}
	
	
}
