package net.dacommander31.doors_music_discs.datagen;

import net.dacommander31.doors_music_discs.RobloxDoorsMusicDiscs;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;

@Mod.EventBusSubscriber(modid = RobloxDoorsMusicDiscs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), bindRegistries(ModRecipeProvider.Runner::new, lookupProvider));

        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));

    }

    private static <T extends DataProvider> DataProvider.Factory<T> bindRegistries(
            BiFunction<PackOutput, CompletableFuture<HolderLookup.Provider>, T> pTagProviderFactory, CompletableFuture<HolderLookup.Provider> pLookupProvider
    ) {
        return packOutput -> pTagProviderFactory.apply(packOutput, pLookupProvider);
    }
}
