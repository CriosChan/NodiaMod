package fr.criosdu79.nodiamod.world;

import cpw.mods.fml.common.IWorldGenerator;
import fr.criosdu79.nodiamod.init.blockMod;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class WorldGenNodia implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId){
            case -1:
                Generatenether(world, chunkX * 16, chunkZ * 16, random );

            case 0:
                GenerateOverWorld(world, chunkX * 16, chunkZ * 16, random );

            case 1:
                GenerateEnder(world, chunkX * 16, chunkZ * 16, random );

        }
    }

    private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int Y, int maxY, int minV, int maxV, int spawnChance){
        for(int i = 0; i < spawnChance; i ++){
            int chunkSize = 16;
            int Xpos = posX + random.nextInt(chunkSize);
            int Ypos = Y + random.nextInt(maxY - Y);
            int Zpos = posZ + random.nextInt(chunkSize);

            new WorldGenMinable(block, maxV, blockSpawn).generate(world, random, Xpos, Ypos, Zpos);
        }
    }

    private void GenerateEnder(World world, int i, int i1, Random random) {
    }

    private void GenerateOverWorld(World world, int i, int i1, Random random) {
        addOre(blockMod.saphir_ore, Blocks.stone, random, world, i, i1, 10, 25, 5, 7, 16);
        addOre(blockMod.ruby_ore, Blocks.stone, random, world, i, i1, 10, 20, 2, 6, 9);
        addOre(blockMod.anxiteinfected_ore, Blocks.stone, random, world, i, i1, 0, 7, 1, 2, 6);
    }

    private void Generatenether(World world, int i, int i1, Random random) {
    }
}
