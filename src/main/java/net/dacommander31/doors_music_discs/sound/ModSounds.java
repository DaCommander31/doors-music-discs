package net.dacommander31.doors_music_discs.sound;

import net.dacommander31.doors_music_discs.RobloxDoorsMusicDiscs;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RobloxDoorsMusicDiscs.MOD_ID);

    public static final RegistryObject<SoundEvent> MUSIC_DISC_DAWN_OF_THE_DOORS = registerSoundEvent("music_disc.dawn_of_the_doors");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_DAWN_OF_THE_DOORS_KEY = registerJukeboxSong("music_disc.dawn_of_the_doors");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_ELEVATOR_JAM = registerSoundEvent("music_disc.elevator_jam");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_ELEVATOR_JAM_KEY = registerJukeboxSong("music_disc.elevator_jam");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_GUIDING_LIGHT = registerSoundEvent("music_disc.guiding_light");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_GUIDING_LIGHT_KEY = registerJukeboxSong("music_disc.guiding_light");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_UNHINGED = registerSoundEvent("music_disc.unhinged");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_UNHINGED_KEY = registerJukeboxSong("music_disc.unhinged");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HERE_I_COME = registerSoundEvent("music_disc.here_i_come");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_HERE_I_COME_KEY = registerJukeboxSong("music_disc.here_i_come");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_JEFFS_JINGLE = registerSoundEvent("music_disc.jeffs_jingle");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_JEFFS_JINGLE_KEY = registerJukeboxSong("music_disc.jeffs_jingle");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_UNHINGED_2 = registerSoundEvent("music_disc.unhinged_2");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_UNHINGED_2_KEY = registerJukeboxSong("music_disc.unhinged_2");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_ELEVATOR_JAMMED = registerSoundEvent("music_disc.elevator_jammed");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_ELEVATOR_JAMMED_KEY = registerJukeboxSong("music_disc.elevator_jammed");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CURIOUS_LIGHT = registerSoundEvent("music_disc.curious_light");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_CURIOUS_LIGHT_KEY = registerJukeboxSong("music_disc.curious_light");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_ELEVATOR_JAM_REMIX = registerSoundEvent("music_disc.elevator_jam_remix");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_ELEVATOR_JAM_REMIX_KEY = registerJukeboxSong("music_disc.elevator_jam_remix");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_DOORS_TRAILER_REMIX = registerSoundEvent("music_disc.doors_trailer_remix");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_DOORS_TRAILER_REMIX_KEY = registerJukeboxSong("music_disc.doors_trailer_remix");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_DUSK_OF_THE_DOORS = registerSoundEvent("music_disc.dusk_of_the_doors");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_DUSK_OF_THE_DOORS_KEY = registerJukeboxSong("music_disc.dusk_of_the_doors");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_JEFFS_JINGLE_DNB_REMIX = registerSoundEvent("music_disc.jeffs_jingle_dnb_remix");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_JEFFS_JINGLE_DNB_REMIX_KEY = registerJukeboxSong("music_disc.jeffs_jingle_dnb_remix");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_MAKE_HASTE = registerSoundEvent("music_disc.make_haste");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_MAKE_HASTE_KEY = registerJukeboxSong("music_disc.make_haste");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_SEEK_MERCH_TRAILER_THEME = registerSoundEvent("music_disc.seek_merch_trailer_theme");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_SEEK_MERCH_TRAILER_THEME_KEY = registerJukeboxSong("music_disc.seek_merch_trailer_theme");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_ELEVATOR_JAM_RETRO_MODE = registerSoundEvent("music_disc.elevator_jam_retro_mode");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_ELEVATOR_JAM_RETRO_MODE_KEY = registerJukeboxSong("music_disc.elevator_jam_retro_mode");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_ELEVATOR_JAM_VOICED = registerSoundEvent("music_disc.elevator_jam_voiced");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_ELEVATOR_JAM_VOICED_KEY = registerJukeboxSong("music_disc.elevator_jam_voiced");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_READY_OR_NOT = registerSoundEvent("music_disc.ready_or_not");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_READY_OR_NOT_KEY = registerJukeboxSong("music_disc.ready_or_not");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_READY_TO_RUMBLE = registerSoundEvent("music_disc.ready_to_rumble");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_READY_TO_RUMBLE_KEY = registerJukeboxSong("music_disc.ready_to_rumble");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_JEFFS_JAM = registerSoundEvent("music_disc.jeffs_jam");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_JEFFS_JAM_KEY = registerJukeboxSong("music_disc.jeffs_jam");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_OH_DAM = registerSoundEvent("music_disc.oh_dam");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_OH_DAM_KEY = registerJukeboxSong("music_disc.oh_dam");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_FRESH_RAIN = registerSoundEvent("music_disc.fresh_rain");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_FRESH_RAIN_KEY = registerJukeboxSong("music_disc.fresh_rain");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_THE_GREAT_OUTDOORS = registerSoundEvent("music_disc.the_great_outdoors");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_THE_GREAT_OUTDOORS_KEY = registerJukeboxSong("music_disc.the_great_outdoors");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_THE_GREAT_INDOORS = registerSoundEvent("music_disc.the_great_indoors");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_THE_GREAT_INDOORS_KEY = registerJukeboxSong("music_disc.the_great_indoors");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_SON_OF_A_BIRCH = registerSoundEvent("music_disc.son_of_a_birch");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_SON_OF_A_BIRCH_KEY = registerJukeboxSong("music_disc.son_of_a_birch");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_THORNS = registerSoundEvent("music_disc.thorns");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_THORNS_KEY = registerJukeboxSong("music_disc.thorns");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_KEEP_OFF_THE_GRASS = registerSoundEvent("music_disc.keep_off_the_grass");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_KEEP_OFF_THE_GRASS_KEY = registerJukeboxSong("music_disc.keep_off_the_grass");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_DEALS_OF_THE_DOORS = registerSoundEvent("music_disc.deals_of_the_doors");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_DEALS_OF_THE_DOORS_KEY = registerJukeboxSong("music_disc.deals_of_the_doors");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CONTENT_CONTENT_CONTENT = registerSoundEvent("music_disc.content_content_content");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_CONTENT_CONTENT_CONTENT_KEY = registerJukeboxSong("music_disc.content_content_content");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_THE_MINES_TEASER = registerSoundEvent("music_disc.the_mines_teaser");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_THE_MINES_TEASER_KEY = registerJukeboxSong("music_disc.the_mines_teaser");
    public static final RegistryObject<SoundEvent> MUSIC_DISC_THE_MINES_TRAILER = registerSoundEvent("music_disc.the_mines_trailer");
    public static final ResourceKey<JukeboxSong> MUSIC_DISC_THE_MINES_TRAILER_KEY = registerJukeboxSong("music_disc.the_mines_trailer");


    public static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(RobloxDoorsMusicDiscs.MOD_ID, name)));
    }

    private static ResourceKey<JukeboxSong> registerJukeboxSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(RobloxDoorsMusicDiscs.MOD_ID, name));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
