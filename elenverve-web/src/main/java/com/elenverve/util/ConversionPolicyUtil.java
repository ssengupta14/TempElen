package com.elenverve.util;

import java.util.List;

import com.elenverve.dao.promotions.Offer;

public class ConversionPolicyUtil {

	public static double convertOffers2Amount(List<Offer> offers){
		double amount=0.0;
		for(Offer offer:offers){
			// apply offer policy here
			//DISCOUNT
			//SALE
			//PROMO
			//BAG
		}
		
		return amount;
	}
	public static double convertRewards2Amount(int totalRewards){
		double amount=0.0;
		// Apply reward policy
		return amount;
	}
}
