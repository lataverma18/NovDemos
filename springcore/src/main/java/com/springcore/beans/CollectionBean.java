package com.springcore.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	List addresses;
	Set cset;
	Map cmap;
	Properties cprops;
	public Set getCset() {
		return cset;
	}
	public void setCset(Set cset) {
		this.cset = cset;
	}
	public Map getCmap() {
		return cmap;
	}
	public void setCmap(Map cmap) {
		this.cmap = cmap;
	}
	public Properties getCprops() {
		return cprops;
	}
	public void setCprops(Properties cprops) {
		this.cprops = cprops;
	}
	public List getAddresses() {
		return addresses;
	}
	public void setAddresses(List addresses) {
		this.addresses = addresses;
	}
}
