package net.dacommander31.doors_music_discs.datagen;

import net.dacommander31.doors_music_discs.RobloxDoorsMusicDiscs;
import net.dacommander31.doors_music_discs.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RobloxDoorsMusicDiscs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RESONATOR.get());
        basicItem(ModItems.INSTRUMENT_SHUFFLER.get());
        basicItem(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC.get());
        basicItem(ModItems.ELEVATOR_JAM_MUSIC_DISC.get());
        basicItem(ModItems.GUIDING_LIGHT_MUSIC_DISC.get());
        basicItem(ModItems.UNHINGED_MUSIC_DISC.get());
        basicItem(ModItems.HERE_I_COME_MUSIC_DISC.get());
        basicItem(ModItems.JEFFS_JINGLE_MUSIC_DISC.get());
        basicItem(ModItems.UNHINGED_2_MUSIC_DISC.get());
        basicItem(ModItems.ELEVATOR_JAMMED_MUSIC_DISC.get());
        basicItem(ModItems.ELEVATOR_JAM_REMIX_MUSIC_DISC.get());
        basicItem(ModItems.DOORS_TRAILER_REMIX_MUSIC_DISC.get());
        basicItem(ModItems.DUSK_OF_THE_DOORS_MUSIC_DISC.get());
        basicItem(ModItems.CURIOUS_LIGHT_MUSIC_DISC.get());
        basicItem(ModItems.JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC.get());
        basicItem(ModItems.MAKE_HASTE_MUSIC_DISC.get());
        basicItem(ModItems.SEEK_MERCH_TRAILER_THEME_MUSIC_DISC.get());
        basicItem(ModItems.ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC.get());
        basicItem(ModItems.ELEVATOR_JAM_VOICED_MUSIC_DISC.get());
        basicItem(ModItems.READY_OR_NOT_MUSIC_DISC.get());
        basicItem(ModItems.READY_TO_RUMBLE_MUSIC_DISC.get());
        basicItem(ModItems.JEFFS_JAM_MUSIC_DISC.get());
        basicItem(ModItems.OH_DAM_MUSIC_DISC.get());
        basicItem(ModItems.FRESH_RAIN_MUSIC_DISC.get());
        basicItem(ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC.get());
        basicItem(ModItems.THE_GREAT_INDOORS_MUSIC_DISC.get());
        basicItem(ModItems.SON_OF_A_BIRCH_MUSIC_DISC.get());
        basicItem(ModItems.THORNS_MUSIC_DISC.get());
        basicItem(ModItems.KEEP_OFF_THE_GRASS_MUSIC_DISC.get());
        basicItem(ModItems.DEALS_OF_THE_DOORS_MUSIC_DISC.get());
        basicItem(ModItems.CONTENT_CONTENT_CONTENT_MUSIC_DISC.get());
        basicItem(ModItems.THE_MINES_TEASER_MUSIC_DISC.get());
        basicItem(ModItems.THE_MINES_TRAILER_MUSIC_DISC.get());
    }
}
