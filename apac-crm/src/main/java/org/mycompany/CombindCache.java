package org.mycompany;

import java.util.HashMap;
import java.util.Map;

public class CombindCache {
	
	Map<String, Object> combindCache = new HashMap<String, Object>();
	
	public void putCRM(Object crm) {
		combindCache.put("CRM", crm);
	}
	
	public void putPricing(Object pricing) {
		System.out.println("pricing:["+pricing+"]");
		combindCache.put("PRICING", pricing);
	}
	
	public void putDrug(Object drug) {
		combindCache.put("DRUG", drug);
	}

	public Map<String, Object> get() {
		System.out.println("combindCache:["+combindCache+"]");
		return combindCache;
	}
}
