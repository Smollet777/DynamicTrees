package com.ferreusveritas.dynamictrees.trees;

import com.ferreusveritas.dynamictrees.DynamicTrees;
import com.ferreusveritas.dynamictrees.blocks.leaves.LeavesProperties;
import net.minecraft.util.ResourceLocation;

/**
 * Get your Cheeto fingers off! Only the DynamicTrees mod should use this and only for vanilla trees
 * 
 * @author ferreusveritas
 */
public class VanillaTreeFamily extends Family {
	
	public final DynamicTrees.VanillaWoodTypes woodType;
	
	public VanillaTreeFamily(DynamicTrees.VanillaWoodTypes wood) {
		super(new ResourceLocation(DynamicTrees.MOD_ID, wood.toString()));

		woodType = wood;
		getCommonLeaves().setFamily(this);

		//Setup tree references
		setPrimitiveLog(wood.getLog());
		setPrimitiveStrippedLog(wood.getStrippedLog());

		//Setup common species
		getCommonSpecies().generateSeed();
		getCommonSpecies().generateSapling();
		
	}

	@SuppressWarnings("all")
	@Override
	public LeavesProperties getCommonLeaves() {
		return LeavesProperties.REGISTRY.get(this.getRegistryName());
	}

}
