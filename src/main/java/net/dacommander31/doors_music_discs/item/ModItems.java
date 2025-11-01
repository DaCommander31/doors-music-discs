package net.dacommander31.doors_music_discs.item;

import net.dacommander31.doors_music_discs.RobloxDoorsMusicDiscs;
import net.dacommander31.doors_music_discs.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RobloxDoorsMusicDiscs.MOD_ID);

    public static final RegistryObject<Item> RESONATOR = ITEMS.register("resonator",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INSTRUMENT_SHUFFLER = ITEMS.register("instrument_shuffler",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DAWN_OF_THE_DOORS_MUSIC_DISC = ITEMS.register("dawn_of_the_doors_music_disc",
            () -> new RecordItem(1, ModSounds.MUSIC_DISC_DAWN_OF_THE_DOORS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4640));
    public static final RegistryObject<Item> ELEVATOR_JAM_MUSIC_DISC = ITEMS.register("elevator_jam_music_disc",
            () -> new RecordItem(5, ModSounds.MUSIC_DISC_ELEVATOR_JAM, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 640));
    public static final RegistryObject<Item> GUIDING_LIGHT_MUSIC_DISC = ITEMS.register("guiding_light_music_disc",
            () -> new RecordItem(4, ModSounds.MUSIC_DISC_GUIDING_LIGHT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4640));
    public static final RegistryObject<Item> UNHINGED_MUSIC_DISC = ITEMS.register("unhinged_music_disc",
            () -> new RecordItem(3, ModSounds.MUSIC_DISC_UNHINGED, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3820));
    public static final RegistryObject<Item> HERE_I_COME_MUSIC_DISC = ITEMS.register("here_i_come_music_disc",
            () -> new RecordItem(2, ModSounds.MUSIC_DISC_HERE_I_COME, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2240));
    public static final RegistryObject<Item> JEFFS_JINGLE_MUSIC_DISC = ITEMS.register("jeffs_jingle_music_disc",
            () -> new RecordItem(6, ModSounds.MUSIC_DISC_JEFFS_JINGLE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2500));
    public static final RegistryObject<Item> UNHINGED_2_MUSIC_DISC = ITEMS.register("unhinged_2_music_disc",
            () -> new RecordItem(7, ModSounds.MUSIC_DISC_UNHINGED_2, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3660));
    public static final RegistryObject<Item> ELEVATOR_JAMMED_MUSIC_DISC = ITEMS.register("elevator_jammed_music_disc",
            () -> new RecordItem(8, ModSounds.MUSIC_DISC_ELEVATOR_JAMMED, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1120));
    public static final RegistryObject<Item> ELEVATOR_JAM_REMIX_MUSIC_DISC = ITEMS.register("elevator_jam_remix_music_disc",
            () -> new RecordItem(11, ModSounds.MUSIC_DISC_ELEVATOR_JAM_REMIX, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1720));
    public static final RegistryObject<Item> DOORS_TRAILER_REMIX_MUSIC_DISC = ITEMS.register("doors_trailer_remix_music_disc",
            () -> new RecordItem(10, ModSounds.MUSIC_DISC_DOORS_TRAILER_REMIX, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1980));
    public static final RegistryObject<Item> DUSK_OF_THE_DOORS_MUSIC_DISC = ITEMS.register("dusk_of_the_doors_music_disc",
            () -> new RecordItem(1, ModSounds.MUSIC_DISC_DUSK_OF_THE_DOORS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1500));
    public static final RegistryObject<Item> CURIOUS_LIGHT_MUSIC_DISC = ITEMS.register("curious_light_music_disc",
            () -> new RecordItem(9, ModSounds.MUSIC_DISC_CURIOUS_LIGHT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1200));
    public static final RegistryObject<Item> JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC = ITEMS.register("jeffs_jingle_dnb_remix_music_disc",
            () -> new RecordItem(2, ModSounds.MUSIC_DISC_JEFFS_JINGLE_DNB_REMIX, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2280));
    public static final RegistryObject<Item> MAKE_HASTE_MUSIC_DISC = ITEMS.register("make_haste_music_disc",
            () -> new RecordItem(3, ModSounds.MUSIC_DISC_MAKE_HASTE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2660));
    public static final RegistryObject<Item> SEEK_MERCH_TRAILER_THEME_MUSIC_DISC = ITEMS.register("seek_merch_trailer_theme_music_disc",
            () -> new RecordItem(4, ModSounds.MUSIC_DISC_SEEK_MERCH_TRAILER_THEME, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2100));
    public static final RegistryObject<Item> ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC = ITEMS.register("elevator_jam_retro_mode_music_disc",
            () -> new RecordItem(5, ModSounds.MUSIC_DISC_ELEVATOR_JAM_RETRO_MODE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 660));
    public static final RegistryObject<Item> ELEVATOR_JAM_VOICED_MUSIC_DISC = ITEMS.register("elevator_jam_april_fools_music_disc",
            () -> new RecordItem(6, ModSounds.MUSIC_DISC_ELEVATOR_JAM_VOICED, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 600));
    public static final RegistryObject<Item> READY_OR_NOT_MUSIC_DISC = ITEMS.register("ready_or_not_music_disc",
            () -> new RecordItem(1, ModSounds.MUSIC_DISC_READY_OR_NOT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5640));
    public static final RegistryObject<Item> READY_TO_RUMBLE_MUSIC_DISC = ITEMS.register("ready_to_rumble_music_disc",
            () -> new RecordItem(2, ModSounds.MUSIC_DISC_READY_TO_RUMBLE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4020));
    public static final RegistryObject<Item> JEFFS_JAM_MUSIC_DISC = ITEMS.register("jeffs_jam_music_disc",
            () -> new RecordItem(3, ModSounds.MUSIC_DISC_JEFFS_JAM, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2520));
    public static final RegistryObject<Item> OH_DAM_MUSIC_DISC = ITEMS.register("oh_dam_music_disc",
            () -> new RecordItem(4, ModSounds.MUSIC_DISC_OH_DAM, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3760));
    public static final RegistryObject<Item> FRESH_RAIN_MUSIC_DISC = ITEMS.register("fresh_rain_music_disc",
            () -> new RecordItem(5, ModSounds.MUSIC_DISC_FRESH_RAIN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2340));
    public static final RegistryObject<Item> THE_GREAT_OUTDOORS_MUSIC_DISC = ITEMS.register("the_great_outdoors_music_disc",
            () -> new RecordItem(6, ModSounds.MUSIC_DISC_THE_GREAT_OUTDOORS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1420));
    public static final RegistryObject<Item> THE_GREAT_INDOORS_MUSIC_DISC = ITEMS.register("the_great_indoors_music_disc",
            () -> new RecordItem(7, ModSounds.MUSIC_DISC_THE_GREAT_INDOORS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 720));
    public static final RegistryObject<Item> SON_OF_A_BIRCH_MUSIC_DISC = ITEMS.register("son_of_a_birch_music_disc",
            () -> new RecordItem(8, ModSounds.MUSIC_DISC_SON_OF_A_BIRCH, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2460));
    public static final RegistryObject<Item> THORNS_MUSIC_DISC = ITEMS.register("thorns_music_disc",
            () -> new RecordItem(9, ModSounds.MUSIC_DISC_THORNS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3140));
    public static final RegistryObject<Item> KEEP_OFF_THE_GRASS_MUSIC_DISC = ITEMS.register("keep_off_the_grass_music_disc",
            () -> new RecordItem(10, ModSounds.MUSIC_DISC_KEEP_OFF_THE_GRASS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 820));
    public static final RegistryObject<Item> DEALS_OF_THE_DOORS_MUSIC_DISC = ITEMS.register("deals_of_the_doors_music_disc",
            () -> new RecordItem(11, ModSounds.MUSIC_DISC_DEALS_OF_THE_DOORS, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1600));
    public static final RegistryObject<Item> CONTENT_CONTENT_CONTENT_MUSIC_DISC = ITEMS.register("content_content_content_music_disc",
            () -> new RecordItem(12, ModSounds.MUSIC_DISC_CONTENT_CONTENT_CONTENT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1600));
    public static final RegistryObject<Item> THE_MINES_TEASER_MUSIC_DISC = ITEMS.register("the_mines_teaser_music_disc",
            () -> new RecordItem(13, ModSounds.MUSIC_DISC_THE_MINES_TEASER, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1140));
    public static final RegistryObject<Item> THE_MINES_TRAILER_MUSIC_DISC = ITEMS.register("the_mines_trailer_music_disc",
            () -> new RecordItem(14, ModSounds.MUSIC_DISC_THE_MINES_TRAILER, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1040));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
