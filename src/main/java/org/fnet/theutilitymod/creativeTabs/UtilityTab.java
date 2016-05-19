package org.fnet.theutilitymod.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class UtilityTab extends CreativeTabs {

	private Item icon;
	public static final String LABEL = "Utility";
	
	public UtilityTab(Item icon) {
		super(LABEL);
		this.icon = icon;
	}

	@Override
	public Item getTabIconItem() {
		return this.icon;
	}

}
