package me.modforgery.tesla.init;

import me.modforgery.tesla.block.*;
import me.modforgery.tesla.block.te.TileEntityPlasmaFurnace;
import me.modforgery.tesla.block.te.TileEntityTeslaCoil;
import me.modforgery.tesla.block.te.TileEntityVDGGenerator;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * File by ModForgery for Minecraft on 31/08/2014.
 */
public class TeslaBlocks
{
	
	public static Block vdgGenerator;
	public static Block teslaCoil;
	public static Block plasmaFurnace;
	public static Block metalPlate;
    public static Block oreCopper;
    public static Block teslaBase;
    public static Block oreTin;
    public static Block blockCopper;
    public static Block blockTin;
	
    public static void init()
    {
    	vdgGenerator = new BlockVDGGenerator();
    	teslaCoil = new BlockTeslaCoil();
        plasmaFurnace = new BlockPlasmaFurnace();
        metalPlate = new BlockDecorative("metalPlate");
        oreCopper = new BlockCopperOre();
        teslaBase = new BlockTeslaBase();
        oreTin = new BlockTinOre();
        blockCopper = new BlockDecorative("blockCopper");
        blockTin = new BlockDecorative("blockTin");

    	GameRegistry.registerBlock(vdgGenerator, "vdgGenerator");
    	GameRegistry.registerBlock(teslaCoil, "teslaCoil");
        GameRegistry.registerBlock(plasmaFurnace, "plasmaFurnace");
        GameRegistry.registerBlock(metalPlate, "metalPlate");
        GameRegistry.registerBlock(oreCopper, "oreCopper");
        GameRegistry.registerBlock(teslaBase, "teslaBase");
        GameRegistry.registerBlock(oreTin, "oreTin");
        GameRegistry.registerBlock(blockCopper, "blockCopper");
        GameRegistry.registerBlock(blockTin, "blockTin");

    	GameRegistry.registerTileEntity(TileEntityVDGGenerator.class, "te_vdgGenerator");
    	GameRegistry.registerTileEntity(TileEntityTeslaCoil.class, "te_teslaCoil");
        GameRegistry.registerTileEntity(TileEntityPlasmaFurnace.class, "te_plasmaFurnace");

    }
}
