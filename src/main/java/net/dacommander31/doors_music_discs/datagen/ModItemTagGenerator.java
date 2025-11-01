package net.dacommander31.doors_music_discs.datagen;

import net.dacommander31.doors_music_discs.item.ModItems;
import net.dacommander31.doors_music_discs.RobloxDoorsMusicDiscs;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {


    public ModItemTagGenerator(PackOutput p_275204_, CompletableFuture<HolderLookup.Provider> p_275194_,
                               CompletableFuture<TagLookup<Block>> p_275634_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275204_, p_275194_, p_275634_, RobloxDoorsMusicDiscs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC.get(),
                        ModItems.HERE_I_COME_MUSIC_DISC.get(),
                        ModItems.UNHINGED_MUSIC_DISC.get(),
                        ModItems.GUIDING_LIGHT_MUSIC_DISC.get(),
                        ModItems.ELEVATOR_JAM_MUSIC_DISC.get(),
                        ModItems.JEFFS_JINGLE_MUSIC_DISC.get(),
                        ModItems.UNHINGED_2_MUSIC_DISC.get(),
                        ModItems.ELEVATOR_JAMMED_MUSIC_DISC.get(),
                        ModItems.CURIOUS_LIGHT_MUSIC_DISC.get(),
                        ModItems.DOORS_TRAILER_REMIX_MUSIC_DISC.get(),
                        ModItems.ELEVATOR_JAM_REMIX_MUSIC_DISC.get(),
                        ModItems.DUSK_OF_THE_DOORS_MUSIC_DISC.get(),
                        ModItems.JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC.get(),
                        ModItems.MAKE_HASTE_MUSIC_DISC.get(),
                        ModItems.SEEK_MERCH_TRAILER_THEME_MUSIC_DISC.get(),
                        ModItems.ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC.get(),
                        ModItems.ELEVATOR_JAM_VOICED_MUSIC_DISC.get(),
                        ModItems.READY_OR_NOT_MUSIC_DISC.get(),
                        ModItems.READY_TO_RUMBLE_MUSIC_DISC.get(),
                        ModItems.JEFFS_JAM_MUSIC_DISC.get(),
                        ModItems.OH_DAM_MUSIC_DISC.get(),
                        ModItems.FRESH_RAIN_MUSIC_DISC.get(),
                        ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC.get(),
                        ModItems.THE_GREAT_INDOORS_MUSIC_DISC.get(),
                        ModItems.SON_OF_A_BIRCH_MUSIC_DISC.get(),
                        ModItems.THORNS_MUSIC_DISC.get(),
                        ModItems.KEEP_OFF_THE_GRASS_MUSIC_DISC.get(),
                        ModItems.DEALS_OF_THE_DOORS_MUSIC_DISC.get(),
                        ModItems.CONTENT_CONTENT_CONTENT_MUSIC_DISC.get(),
                        ModItems.THE_MINES_TEASER_MUSIC_DISC.get(),
                        ModItems.THE_MINES_TRAILER_MUSIC_DISC.get());
    }
}
