package org.mycompany;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DrugCache {
	
	Map<String, Drug> cachestore = new HashMap<String, Drug>();
	
	public void put(Drug drug) {
		
		cachestore.put(drug.getDrugSKUNo(),drug);
	}
	
	public void getReset() {
		cachestore = new HashMap<String, Drug>();
	}
	
	public Drug get(String drugid) {
		System.out.println("drugid:["+drugid+"]");
		return cachestore.get(drugid);
	}
	
	public Map<String, Drug> getAll() {
		return cachestore;
	}
	
	public Collection<Drug> getAllasList() {
		return cachestore.values();
	}
	
}
