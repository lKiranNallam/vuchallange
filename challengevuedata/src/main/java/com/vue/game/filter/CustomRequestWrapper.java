package com.vue.game.filter;

import com.vue.game.tp.call.ThirdPartyRestCall;

public class CustomRequestWrapper {

	public static String getRegionbyIP(String ipRequest) {
		
		System.out.println(ipRequest);
		return ThirdPartyRestCall.getCountryName(ipRequest);
	}
}
