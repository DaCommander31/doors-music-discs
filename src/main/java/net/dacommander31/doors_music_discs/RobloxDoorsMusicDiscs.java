package net.dacommander31.doors_music_discs;

import com.mojang.logging.LogUtils;
import net.dacommander31.doors_music_discs.item.ModCreativeModeTabs;
import net.dacommander31.doors_music_discs.item.ModItems;
import net.dacommander31.doors_music_discs.sound.ModSounds;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RobloxDoorsMusicDiscs.MOD_ID)
public class RobloxDoorsMusicDiscs {
    public static final String MOD_ID = "doors_music_discs";
    public static final Logger LOGGER = LogUtils.getLogger();

    public RobloxDoorsMusicDiscs() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModSounds.register(modEventBus);
    }
}
