package net.dacommander31.doors_music_discs.item;

import net.dacommander31.doors_music_discs.RobloxDoorsMusicDiscs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RobloxDoorsMusicDiscs.MOD_ID);

    public static final Supplier<CreativeModeTab> ROBLOX_DOORS_MUSIC_DISCS = CREATIVE_MODE_TABS.register("roblox_doors_music_discs",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC.get()))
                    .title(Component.translatable("creativetab.doors_music_discs.roblox_doors_music_discs"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RESONATOR.get());
                        output.accept(ModItems.INSTRUMENT_SHUFFLER.get());
                        output.accept(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC.get());
                        output.accept(ModItems.HERE_I_COME_MUSIC_DISC.get());
                        output.accept(ModItems.UNHINGED_MUSIC_DISC.get());
                        output.accept(ModItems.GUIDING_LIGHT_MUSIC_DISC.get());
                        output.accept(ModItems.ELEVATOR_JAM_MUSIC_DISC.get());
                        output.accept(ModItems.JEFFS_JINGLE_MUSIC_DISC.get());
                        output.accept(ModItems.UNHINGED_2_MUSIC_DISC.get());
                        output.accept(ModItems.ELEVATOR_JAMMED_MUSIC_DISC.get());
                        output.accept(ModItems.CURIOUS_LIGHT_MUSIC_DISC.get());
                        output.accept(ModItems.DOORS_TRAILER_REMIX_MUSIC_DISC.get());
                        output.accept(ModItems.ELEVATOR_JAM_REMIX_MUSIC_DISC.get());
                        output.accept(ModItems.DUSK_OF_THE_DOORS_MUSIC_DISC.get());
                        output.accept(ModItems.JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC.get());
                        output.accept(ModItems.MAKE_HASTE_MUSIC_DISC.get());
                        output.accept(ModItems.SEEK_MERCH_TRAILER_THEME_MUSIC_DISC.get());
                        output.accept(ModItems.ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC.get());
                        output.accept(ModItems.ELEVATOR_JAM_VOICED_MUSIC_DISC.get());
                        output.accept(ModItems.READY_OR_NOT_MUSIC_DISC.get());
                        output.accept(ModItems.READY_TO_RUMBLE_MUSIC_DISC.get());
                        output.accept(ModItems.JEFFS_JAM_MUSIC_DISC.get());
                        output.accept(ModItems.OH_DAM_MUSIC_DISC.get());
                        output.accept(ModItems.FRESH_RAIN_MUSIC_DISC.get());
                        output.accept(ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC.get());
                        output.accept(ModItems.THE_GREAT_INDOORS_MUSIC_DISC.get());
                        output.accept(ModItems.SON_OF_A_BIRCH_MUSIC_DISC.get());
                        output.accept(ModItems.THORNS_MUSIC_DISC.get());
                        output.accept(ModItems.KEEP_OFF_THE_GRASS_MUSIC_DISC.get());
                        output.accept(ModItems.DEALS_OF_THE_DOORS_MUSIC_DISC.get());
                        output.accept(ModItems.CONTENT_CONTENT_CONTENT_MUSIC_DISC.get());
                        output.accept(ModItems.THE_MINES_TEASER_MUSIC_DISC.get());
                        output.accept(ModItems.THE_MINES_TRAILER_MUSIC_DISC.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
