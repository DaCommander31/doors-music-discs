package net.dacommander31.doors_music_discs.datagen;

import net.dacommander31.doors_music_discs.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        simpleItem(ModItems.RESONATOR, itemModelGenerators);
        simpleItem(ModItems.INSTRUMENT_SHUFFLER, itemModelGenerators);
        simpleItem(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.ELEVATOR_JAM_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.GUIDING_LIGHT_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.UNHINGED_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.HERE_I_COME_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.JEFFS_JINGLE_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.UNHINGED_2_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.ELEVATOR_JAMMED_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.ELEVATOR_JAM_REMIX_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.DOORS_TRAILER_REMIX_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.DUSK_OF_THE_DOORS_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.CURIOUS_LIGHT_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.MAKE_HASTE_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.SEEK_MERCH_TRAILER_THEME_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.ELEVATOR_JAM_VOICED_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.READY_OR_NOT_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.READY_TO_RUMBLE_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.JEFFS_JAM_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.OH_DAM_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.FRESH_RAIN_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.THE_GREAT_INDOORS_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.SON_OF_A_BIRCH_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.THORNS_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.KEEP_OFF_THE_GRASS_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.DEALS_OF_THE_DOORS_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.CONTENT_CONTENT_CONTENT_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.THE_MINES_TEASER_MUSIC_DISC, itemModelGenerators);
        simpleItem(ModItems.THE_MINES_TRAILER_MUSIC_DISC, itemModelGenerators);
    }

    private static void simpleItem(Item item, ItemModelGenerators itemModelGenerators) {
        System.out.println("Registered Item Model");
        itemModelGenerators.createFlatItemModel(item, ModelTemplates.FLAT_ITEM);
    }

    @Override
    public String getName() {
        return "Roblox Doors Music Discs Model Definitions";
    }
}
