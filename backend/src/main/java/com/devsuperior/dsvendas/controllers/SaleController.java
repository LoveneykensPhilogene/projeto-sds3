package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.services.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {
	
	@Autowired
	SaleService saleService;
	
	@GetMapping
	//@ResponseStatus(HttpStatus.ACCEPTED)
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> pageSaleDTO=saleService.findAll(pageable);
		return ResponseEntity.ok(pageSaleDTO);
	}
	
	@GetMapping("/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller(){
		List<SaleSumDTO> listSaleSumDTO=saleService.amountGroupBySeller();
		return ResponseEntity.ok(listSaleSumDTO);
	}
	
	@GetMapping("/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupBySeller(){
		List<SaleSuccessDTO> listSaleSuccessDTO=saleService.successGroupBySeller();
		return ResponseEntity.ok(listSaleSuccessDTO);
	}

}
