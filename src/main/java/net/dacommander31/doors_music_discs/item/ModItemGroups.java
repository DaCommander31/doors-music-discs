package net.dacommander31.doors_music_discs.item;

import net.dacommander31.doors_music_discs.RobloxDoorsMusicDiscs;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final CreativeModeTab ROBLOX_DOORS_MUSIC_DISCS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(RobloxDoorsMusicDiscs.MOD_ID, "roblox_doors_music_discs"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RESONATOR))
                    .title(Component.translatable("itemgroup.doors_music_discs.roblox_doors_music_discs"))
                    .displayItems((displayContext, entries) -> {
                        entries.accept(ModItems.RESONATOR);
                        entries.accept(ModItems.INSTRUMENT_SHUFFLER);
                        entries.accept(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC);
                        entries.accept(ModItems.HERE_I_COME_MUSIC_DISC);
                        entries.accept(ModItems.UNHINGED_MUSIC_DISC);
                        entries.accept(ModItems.GUIDING_LIGHT_MUSIC_DISC);
                        entries.accept(ModItems.ELEVATOR_JAM_MUSIC_DISC);
                        entries.accept(ModItems.JEFFS_JINGLE_MUSIC_DISC);
                        entries.accept(ModItems.UNHINGED_2_MUSIC_DISC);
                        entries.accept(ModItems.ELEVATOR_JAMMED_MUSIC_DISC);
                        entries.accept(ModItems.CURIOUS_LIGHT_MUSIC_DISC);
                        entries.accept(ModItems.DOORS_TRAILER_REMIX_MUSIC_DISC);
                        entries.accept(ModItems.ELEVATOR_JAM_REMIX_MUSIC_DISC);
                        entries.accept(ModItems.DUSK_OF_THE_DOORS_MUSIC_DISC);
                        entries.accept(ModItems.JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC);
                        entries.accept(ModItems.MAKE_HASTE_MUSIC_DISC);
                        entries.accept(ModItems.SEEK_MERCH_TRAILER_THEME_MUSIC_DISC);
                        entries.accept(ModItems.ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC);
                        entries.accept(ModItems.ELEVATOR_JAM_VOICED_MUSIC_DISC);
                        entries.accept(ModItems.READY_OR_NOT_MUSIC_DISC);
                        entries.accept(ModItems.READY_TO_RUMBLE_MUSIC_DISC);
                        entries.accept(ModItems.JEFFS_JAM_MUSIC_DISC);
                        entries.accept(ModItems.OH_DAM_MUSIC_DISC);
                        entries.accept(ModItems.FRESH_RAIN_MUSIC_DISC);
                        entries.accept(ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC);
                        entries.accept(ModItems.THE_GREAT_INDOORS_MUSIC_DISC);
                        entries.accept(ModItems.SON_OF_A_BIRCH_MUSIC_DISC);
                        entries.accept(ModItems.THORNS_MUSIC_DISC);
                        entries.accept(ModItems.KEEP_OFF_THE_GRASS_MUSIC_DISC);
                        entries.accept(ModItems.DEALS_OF_THE_DOORS_MUSIC_DISC);
                        entries.accept(ModItems.CONTENT_CONTENT_CONTENT_MUSIC_DISC);
                        entries.accept(ModItems.THE_MINES_TEASER_MUSIC_DISC);
                        entries.accept(ModItems.THE_MINES_TRAILER_MUSIC_DISC);
                    })
                    .build());



    public static void registerItemGroups() {
        RobloxDoorsMusicDiscs.LOGGER.info("Registering Item Groups for " + RobloxDoorsMusicDiscs.MOD_ID);
    }
}
