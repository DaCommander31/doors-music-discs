package net.dacommander31.doors_music_discs;

import com.mojang.logging.LogUtils;
import net.dacommander31.doors_music_discs.item.ModCreativeModeTabs;
import net.dacommander31.doors_music_discs.item.ModItems;
import net.dacommander31.doors_music_discs.sound.ModSounds;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(RobloxDoorsMusicDiscs.MOD_ID)
public class RobloxDoorsMusicDiscs {
    public static final String MOD_ID = "doors_music_discs";
    public static final Logger LOGGER = LogUtils.getLogger();


    public RobloxDoorsMusicDiscs(IEventBus modEventBus, ModContainer modContainer) {

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModSounds.register(modEventBus);

    }
}
