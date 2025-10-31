package net.dacommander31.doors_music_discs.datagen;

import net.dacommander31.doors_music_discs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC,
                        ModItems.HERE_I_COME_MUSIC_DISC,
                        ModItems.UNHINGED_MUSIC_DISC,
                        ModItems.GUIDING_LIGHT_MUSIC_DISC,
                        ModItems.ELEVATOR_JAM_MUSIC_DISC,
                        ModItems.JEFFS_JINGLE_MUSIC_DISC,
                        ModItems.UNHINGED_2_MUSIC_DISC,
                        ModItems.ELEVATOR_JAMMED_MUSIC_DISC,
                        ModItems.CURIOUS_LIGHT_MUSIC_DISC,
                        ModItems.DOORS_TRAILER_REMIX_MUSIC_DISC,
                        ModItems.ELEVATOR_JAM_REMIX_MUSIC_DISC,
                        ModItems.DUSK_OF_THE_DOORS_MUSIC_DISC,
                        ModItems.JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC,
                        ModItems.MAKE_HASTE_MUSIC_DISC,
                        ModItems.SEEK_MERCH_TRAILER_THEME_MUSIC_DISC,
                        ModItems.ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC,
                        ModItems.ELEVATOR_JAM_VOICED_MUSIC_DISC,
                        ModItems.READY_OR_NOT_MUSIC_DISC,
                        ModItems.READY_TO_RUMBLE_MUSIC_DISC,
                        ModItems.JEFFS_JAM_MUSIC_DISC,
                        ModItems.OH_DAM_MUSIC_DISC,
                        ModItems.FRESH_RAIN_MUSIC_DISC,
                        ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC,
                        ModItems.THE_GREAT_INDOORS_MUSIC_DISC,
                        ModItems.SON_OF_A_BIRCH_MUSIC_DISC,
                        ModItems.THORNS_MUSIC_DISC,
                        ModItems.KEEP_OFF_THE_GRASS_MUSIC_DISC,
                        ModItems.DEALS_OF_THE_DOORS_MUSIC_DISC,
                        ModItems.CONTENT_CONTENT_CONTENT_MUSIC_DISC,
                        ModItems.THE_MINES_TEASER_MUSIC_DISC,
                        ModItems.THE_MINES_TRAILER_MUSIC_DISC);
    }
}
