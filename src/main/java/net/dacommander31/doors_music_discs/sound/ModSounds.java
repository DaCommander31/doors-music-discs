package net.dacommander31.doors_music_discs.sound;

import net.dacommander31.doors_music_discs.RobloxDoorsMusicDiscs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent MUSIC_DISC_DAWN_OF_THE_DOORS = registerSoundEvent("music_disc.dawn_of_the_doors");
    public static SoundEvent MUSIC_DISC_ELEVATOR_JAM = registerSoundEvent("music_disc.elevator_jam");
    public static SoundEvent MUSIC_DISC_GUIDING_LIGHT = registerSoundEvent("music_disc.guiding_light");
    public static SoundEvent MUSIC_DISC_UNHINGED = registerSoundEvent("music_disc.unhinged");
    public static SoundEvent MUSIC_DISC_HERE_I_COME = registerSoundEvent("music_disc.here_i_come");
    public static SoundEvent MUSIC_DISC_JEFFS_JINGLE = registerSoundEvent("music_disc.jeffs_jingle");
    public static SoundEvent MUSIC_DISC_UNHINGED_2 = registerSoundEvent("music_disc.unhinged_2");
    public static SoundEvent MUSIC_DISC_ELEVATOR_JAMMED = registerSoundEvent("music_disc.elevator_jammed");
    public static SoundEvent MUSIC_DISC_CURIOUS_LIGHT = registerSoundEvent("music_disc.curious_light");
    public static SoundEvent MUSIC_DISC_ELEVATOR_JAM_REMIX = registerSoundEvent("music_disc.elevator_jam_remix");
    public static SoundEvent MUSIC_DISC_DOORS_TRAILER_REMIX = registerSoundEvent("music_disc.doors_trailer_remix");
    public static SoundEvent MUSIC_DISC_DUSK_OF_THE_DOORS = registerSoundEvent("music_disc.dusk_of_the_doors");
    public static SoundEvent MUSIC_DISC_JEFFS_JINGLE_DNB_REMIX = registerSoundEvent("music_disc.jeffs_jingle_dnb_remix");;
    public static SoundEvent MUSIC_DISC_MAKE_HASTE = registerSoundEvent("music_disc.make_haste");
    public static SoundEvent MUSIC_DISC_SEEK_MERCH_TRAILER_THEME = registerSoundEvent("music_disc.seek_merch_trailer_theme");
    public static SoundEvent MUSIC_DISC_ELEVATOR_JAM_RETRO_MODE = registerSoundEvent("music_disc.elevator_jam_retro_mode");
    public static SoundEvent MUSIC_DISC_ELEVATOR_JAM_VOICED = registerSoundEvent("music_disc.elevator_jam_voiced");
    public static SoundEvent MUSIC_DISC_READY_OR_NOT = registerSoundEvent("music_disc.ready_or_not");
    public static SoundEvent MUSIC_DISC_READY_TO_RUMBLE = registerSoundEvent("music_disc.ready_to_rumble");
    public static SoundEvent MUSIC_DISC_JEFFS_JAM = registerSoundEvent("music_disc.jeffs_jam");
    public static SoundEvent MUSIC_DISC_OH_DAM = registerSoundEvent("music_disc.oh_dam");
    public static SoundEvent MUSIC_DISC_FRESH_RAIN = registerSoundEvent("music_disc.fresh_rain");
    public static SoundEvent MUSIC_DISC_THE_GREAT_OUTDOORS = registerSoundEvent("music_disc.the_great_outdoors");
    public static SoundEvent MUSIC_DISC_THE_GREAT_INDOORS = registerSoundEvent("music_disc.the_great_indoors");
    public static SoundEvent MUSIC_DISC_SON_OF_A_BIRCH = registerSoundEvent("music_disc.son_of_a_birch");
    public static SoundEvent MUSIC_DISC_THORNS = registerSoundEvent("music_disc.thorns");
    public static SoundEvent MUSIC_DISC_KEEP_OFF_THE_GRASS = registerSoundEvent("music_disc.keep_off_the_grass");
    public static SoundEvent MUSIC_DISC_DEALS_OF_THE_DOORS = registerSoundEvent("music_disc.deals_of_the_doors");
    public static SoundEvent MUSIC_DISC_CONTENT_CONTENT_CONTENT = registerSoundEvent("music_disc.content_content_content");
    public static SoundEvent MUSIC_DISC_THE_MINES_TEASER = registerSoundEvent("music_disc.the_mines_teaser");
    public static SoundEvent MUSIC_DISC_THE_MINES_TRAILER = registerSoundEvent("music_disc.the_mines_trailer");


    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(RobloxDoorsMusicDiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }


    public static void registerSounds() {
        RobloxDoorsMusicDiscs.LOGGER.info("Registering Sounds for " + RobloxDoorsMusicDiscs.MOD_ID);
    }
}
