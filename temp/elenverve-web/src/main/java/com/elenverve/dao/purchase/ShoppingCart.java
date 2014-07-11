package com.elenverve.dao.purchase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.elenverve.dao.product.Product;
import com.elenverve.dao.promotions.Offer;
import com.elenverve.util.ConversionPolicyUtil;

public class ShoppingCart {
	
	private Map<Integer,Product> products = new LinkedHashMap<Integer,Product>();
	private double originalCartPrice=0.0;
	private double totalOfferAmount;
	private double finalCartPrice;
	private int totalRewards;
	private int redeamableRewards;
	public Map<Integer,Product> getProducts() {
		return products;
	}
	public void addProduct(Product product) {
		int position=products.size()+1;
		this.totalRewards+=product.getRewardPoints();
		this.originalCartPrice+=product.getFinalPrice();
		List<Offer> offers= product.getOffers();
		this.totalOfferAmount+=ConversionPolicyUtil.convertOffers2Amount(offers);
		this.totalOfferAmount+=ConversionPolicyUtil.convertRewards2Amount(this.totalRewards);
		this.products.put(position,product);
	}
	public void removeProduct(int position) {
		Product product = products.get(position);
		this.totalRewards-=product.getRewardPoints();
		this.originalCartPrice-=product.getFinalPrice();
		List<Offer> offers= product.getOffers();
		this.totalOfferAmount-=ConversionPolicyUtil.convertOffers2Amount(offers);
		this.totalOfferAmount-=ConversionPolicyUtil.convertRewards2Amount(this.totalRewards);
		this.products.remove(position);
	}
	
	public double getOriginalCartPrice() {		
		return originalCartPrice;
	}
	public double getTotalOfferAmount() {
		return totalOfferAmount;
	}
	public double getFinalCartPrice() {
		
		return finalCartPrice;
	}	
	public int getTotalRewards() {
		return totalRewards;
	}	
	public int getRedeamableRewards() {
		return redeamableRewards;
	}
	public void setRedeamableRewards(int redeamableRewards) {
		this.redeamableRewards = redeamableRewards;
	}

}
