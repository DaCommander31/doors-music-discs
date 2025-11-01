package net.dacommander31.doors_music_discs.datagen;

import net.dacommander31.doors_music_discs.RobloxDoorsMusicDiscs;
import net.dacommander31.doors_music_discs.item.ModItems;
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
                .add(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC.get())
                .add(ModItems.HERE_I_COME_MUSIC_DISC.get())
                .add(ModItems.UNHINGED_MUSIC_DISC.get())
                .add(ModItems.GUIDING_LIGHT_MUSIC_DISC.get())
                .add(ModItems.ELEVATOR_JAM_MUSIC_DISC.get())
                .add(ModItems.JEFFS_JINGLE_MUSIC_DISC.get())
                .add(ModItems.UNHINGED_2_MUSIC_DISC.get())
                .add(ModItems.ELEVATOR_JAMMED_MUSIC_DISC.get())
                .add(ModItems.CURIOUS_LIGHT_MUSIC_DISC.get())
                .add(ModItems.DOORS_TRAILER_REMIX_MUSIC_DISC.get())
                .add(ModItems.ELEVATOR_JAM_REMIX_MUSIC_DISC.get())
                .add(ModItems.DUSK_OF_THE_DOORS_MUSIC_DISC.get())
                .add(ModItems.JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC.get())
                .add(ModItems.MAKE_HASTE_MUSIC_DISC.get())
                .add(ModItems.SEEK_MERCH_TRAILER_THEME_MUSIC_DISC.get())
                .add(ModItems.ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC.get())
                .add(ModItems.ELEVATOR_JAM_VOICED_MUSIC_DISC.get())
                .add(ModItems.READY_OR_NOT_MUSIC_DISC.get())
                .add(ModItems.READY_TO_RUMBLE_MUSIC_DISC.get())
                .add(ModItems.JEFFS_JAM_MUSIC_DISC.get())
                .add(ModItems.OH_DAM_MUSIC_DISC.get())
                .add(ModItems.FRESH_RAIN_MUSIC_DISC.get());
    }
}
