package com.elenverve.util;

import java.util.List;

import com.elenverve.dao.promotions.GiftCard;

public class GiftCardUtil {
	public static double redeemGiftCardAmount(List<GiftCard> giftCards){
		double amount=0.0;
		for(GiftCard card: giftCards){
			if(card.isAuthorized()){
				
			}
		}
		return amount;
	}

}
