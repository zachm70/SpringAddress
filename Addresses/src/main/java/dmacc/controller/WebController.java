package dmacc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Addresses;
import dmacc.repository.AddressRepository;

@Controller
public class WebController {
	@Autowired
	AddressRepository repo;
	
	@GetMapping({"/", "/viewAll"}) public String viewAllContacts(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewAddress(model);
		}
		model.addAttribute("addresses", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputAddress") public String addNewAddress(Model model) {
		Addresses a = new Addresses();
		model.addAttribute("newAddress", a);
		return "input";
	}
	
	@PostMapping("/inputAddress") public String addNewAddress(@ModelAttribute Addresses a, Model model) {
		repo.save(a);
		return viewAllContacts(model);
	}
	
	@GetMapping("/edit/{id}") public String showUpdateContact(@PathVariable("id") long id,Model model) {
		Addresses a = repo.findById(id).orElse(null);
		model.addAttribute("newAddress", a);
		return "input";
	}
	
	@PostMapping("/update/{id}") public String reviseContact(Addresses a, Model model) {
		repo.save(a);
		return viewAllContacts(model);
	}
	
	@GetMapping("/delete/{id}") public String deleteUser(@PathVariable("id") long id, Model model) {
		Addresses a = repo.findById(id).orElse(null);
		repo.delete(a);
		return viewAllContacts(model);
	}
}
