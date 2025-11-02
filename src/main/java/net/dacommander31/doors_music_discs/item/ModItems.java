package net.dacommander31.doors_music_discs.item;

import net.dacommander31.doors_music_discs.RobloxDoorsMusicDiscs;
import net.dacommander31.doors_music_discs.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RobloxDoorsMusicDiscs.MOD_ID);

    public static final DeferredItem<Item> RESONATOR = ITEMS.register("resonator",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INSTRUMENT_SHUFFLER = ITEMS.register("instrument_shuffler",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DAWN_OF_THE_DOORS_MUSIC_DISC = ITEMS.register("dawn_of_the_doors_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_DAWN_OF_THE_DOORS_KEY)));
    public static final DeferredItem<Item> ELEVATOR_JAM_MUSIC_DISC = ITEMS.register("elevator_jam_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_ELEVATOR_JAM_KEY)));
    public static final DeferredItem<Item> GUIDING_LIGHT_MUSIC_DISC = ITEMS.register("guiding_light_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_GUIDING_LIGHT_KEY)));
    public static final DeferredItem<Item> UNHINGED_MUSIC_DISC = ITEMS.register("unhinged_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_UNHINGED_KEY)));
    public static final DeferredItem<Item> HERE_I_COME_MUSIC_DISC = ITEMS.register("here_i_come_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_HERE_I_COME_KEY)));
    public static final DeferredItem<Item> JEFFS_JINGLE_MUSIC_DISC = ITEMS.register("jeffs_jingle_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_JEFFS_JINGLE_KEY)));
    public static final DeferredItem<Item> UNHINGED_2_MUSIC_DISC = ITEMS.register("unhinged_2_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_UNHINGED_2_KEY)));
    public static final DeferredItem<Item> ELEVATOR_JAMMED_MUSIC_DISC = ITEMS.register("elevator_jammed_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_ELEVATOR_JAMMED_KEY)));
    public static final DeferredItem<Item> ELEVATOR_JAM_REMIX_MUSIC_DISC = ITEMS.register("elevator_jam_remix_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_ELEVATOR_JAM_REMIX_KEY)));
    public static final DeferredItem<Item> DOORS_TRAILER_REMIX_MUSIC_DISC = ITEMS.register("doors_trailer_remix_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_DOORS_TRAILER_REMIX_KEY)));
    public static final DeferredItem<Item> DUSK_OF_THE_DOORS_MUSIC_DISC = ITEMS.register("dusk_of_the_doors_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_DUSK_OF_THE_DOORS_KEY)));
    public static final DeferredItem<Item> CURIOUS_LIGHT_MUSIC_DISC = ITEMS.register("curious_light_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_CURIOUS_LIGHT_KEY)));
    public static final DeferredItem<Item> JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC = ITEMS.register("jeffs_jingle_dnb_remix_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_JEFFS_JINGLE_DNB_REMIX_KEY)));
    public static final DeferredItem<Item> MAKE_HASTE_MUSIC_DISC = ITEMS.register("make_haste_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_MAKE_HASTE_KEY)));
    public static final DeferredItem<Item> SEEK_MERCH_TRAILER_THEME_MUSIC_DISC = ITEMS.register("seek_merch_trailer_theme_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_SEEK_MERCH_TRAILER_THEME_KEY)));
    public static final DeferredItem<Item> ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC = ITEMS.register("elevator_jam_retro_mode_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_ELEVATOR_JAM_RETRO_MODE_KEY)));
    public static final DeferredItem<Item> ELEVATOR_JAM_VOICED_MUSIC_DISC = ITEMS.register("elevator_jam_april_fools_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_ELEVATOR_JAM_VOICED_KEY)));
    public static final DeferredItem<Item> READY_OR_NOT_MUSIC_DISC = ITEMS.register("ready_or_not_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_READY_OR_NOT_KEY)));
    public static final DeferredItem<Item> READY_TO_RUMBLE_MUSIC_DISC = ITEMS.register("ready_to_rumble_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_READY_TO_RUMBLE_KEY)));
    public static final DeferredItem<Item> JEFFS_JAM_MUSIC_DISC = ITEMS.register("jeffs_jam_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_JEFFS_JAM_KEY)));
    public static final DeferredItem<Item> OH_DAM_MUSIC_DISC = ITEMS.register("oh_dam_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_OH_DAM_KEY)));
    public static final DeferredItem<Item> FRESH_RAIN_MUSIC_DISC = ITEMS.register("fresh_rain_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_FRESH_RAIN_KEY)));
    public static final DeferredItem<Item> THE_GREAT_OUTDOORS_MUSIC_DISC = ITEMS.register("the_great_outdoors_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_THE_GREAT_OUTDOORS_KEY)));
    public static final DeferredItem<Item> THE_GREAT_INDOORS_MUSIC_DISC = ITEMS.register("the_great_indoors_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_THE_GREAT_INDOORS_KEY)));
    public static final DeferredItem<Item> SON_OF_A_BIRCH_MUSIC_DISC = ITEMS.register("son_of_a_birch_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_SON_OF_A_BIRCH_KEY)));
    public static final DeferredItem<Item> THORNS_MUSIC_DISC = ITEMS.register("thorns_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_THORNS_KEY)));
    public static final DeferredItem<Item> KEEP_OFF_THE_GRASS_MUSIC_DISC = ITEMS.register("keep_off_the_grass_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_KEEP_OFF_THE_GRASS_KEY)));
    public static final DeferredItem<Item> DEALS_OF_THE_DOORS_MUSIC_DISC = ITEMS.register("deals_of_the_doors_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_DEALS_OF_THE_DOORS_KEY)));
    public static final DeferredItem<Item> CONTENT_CONTENT_CONTENT_MUSIC_DISC = ITEMS.register("content_content_content_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_CONTENT_CONTENT_CONTENT_KEY)));
    public static final DeferredItem<Item> THE_MINES_TEASER_MUSIC_DISC = ITEMS.register("the_mines_teaser_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_THE_MINES_TEASER_KEY)));
    public static final DeferredItem<Item> THE_MINES_TRAILER_MUSIC_DISC = ITEMS.register("the_mines_trailer_music_disc",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MUSIC_DISC_THE_MINES_TRAILER_KEY)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    
}
