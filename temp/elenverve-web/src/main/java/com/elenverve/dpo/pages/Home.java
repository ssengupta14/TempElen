package com.elenverve.dpo.pages;

import java.util.LinkedList;
import java.util.List;

import com.elenverve.delete.later.TestMenu;
import com.elenverve.dpo.MenuDpo;

public class Home {
	
	private List<MenuDpo> menus = new LinkedList<MenuDpo>();

	public List<MenuDpo> getMenus() {
		TestMenu men = new TestMenu();
		return men.getMenus();
	}
	
	
	


}
