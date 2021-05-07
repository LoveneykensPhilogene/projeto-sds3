package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

public class SaleDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SellerDTO sellerDTO;
	
	public SaleDTO() {}
	
	public SaleDTO(Long id, Integer visited,Integer deals,Double amount,LocalDate date, SellerDTO sellerDTIO) {
		this.id=id;
		this.visited=visited;
		this.amount=amount;
		this.deals=deals;
		this.date=date;
		this.sellerDTO=sellerDTO;
	}
	
	public SaleDTO(Sale sale) {
		id=sale.getId();
		visited=sale.getVisited();
		amount=sale.getAmount();
		deals=sale.getDeals();
		date=sale.getDate();
		sellerDTO=new SellerDTO(sale.getSeller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSellerDTO() {
		return sellerDTO;
	}

	public void setSellerDTO(SellerDTO sellerDTO) {
		this.sellerDTO = sellerDTO;
	}
	

}
