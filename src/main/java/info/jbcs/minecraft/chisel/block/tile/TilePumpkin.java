package info.jbcs.minecraft.chisel.block.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TilePumpkin extends TileEntity
{

    public int pos;

    public TilePumpkin()
    {
        pos = 0;
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound)
    {
        super.writeToNBT(nbtTagCompound);
        nbtTagCompound.setInteger("pos", pos);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound)
    {
        super.readFromNBT(nbtTagCompound);
        pos = nbtTagCompound.getInteger("pos");
    }

}
