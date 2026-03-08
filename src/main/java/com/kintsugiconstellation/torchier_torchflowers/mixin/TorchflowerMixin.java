package com.kintsugiconstellation.torchier_torchflowers.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(FlowerBlock.class)
public class TorchflowerMixin extends Block {
    public TorchflowerMixin(Properties properties) {
        super(properties);
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        if (this.asBlock() == Blocks.TORCHFLOWER)
            return 14;
        else
            return super.getLightEmission(state, level, pos);
    }
}
