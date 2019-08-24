package fr.formation.financings.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.financings.entities.Financing;
import fr.formation.financings.services.FinancingService;

@RestController
@RequestMapping("/financings")
@CrossOrigin("*")
public class FinancingController {

    private final FinancingService service;

    protected FinancingController(FinancingService service) {
	this.service = service;
    }

    @GetMapping("/{id}")
    public Financing getById(@PathVariable("id") Long id) {
	Financing financing = service.getById(id);
	return financing;
    }

    @PostMapping
    public void create(@RequestBody @Valid Financing financing) {
	service.create(financing);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
	service.deleteById(id);
    }
}
