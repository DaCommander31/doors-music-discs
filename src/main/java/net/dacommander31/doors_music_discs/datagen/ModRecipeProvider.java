package net.dacommander31.doors_music_discs.datagen;

import net.dacommander31.doors_music_discs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.MISC, ModItems.RESONATOR)
                        .define('N', Items.NOTE_BLOCK)
                        .define('A', Items.AMETHYST_SHARD)
                        .define('R', Items.REDSTONE)
                        .pattern("RNR")
                        .pattern("NAN")
                        .pattern("RNR")
                        .unlockedBy(getHasName(Items.NOTE_BLOCK), has(Items.NOTE_BLOCK))
                        .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                        .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.INSTRUMENT_SHUFFLER)
                        .requires(Items.NOTE_BLOCK)
                        .requires(Items.SAND)
                        .requires(ItemTags.PLANKS)
                        .requires(Items.GLASS)
                        .requires(ItemTags.STONE_CRAFTING_MATERIALS)
                        .requires(Items.COPPER_INGOT, 4)
                        .unlockedBy(getHasName(Items.NOTE_BLOCK), has(Items.NOTE_BLOCK))
                        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                        .save(output);


                shaped(RecipeCategory.MISC, ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('D', ItemTags.WOODEN_DOORS)
                        .define('L', Items.LANTERN)
                        .define('P', ItemTags.PLANKS)
                        .pattern("PLP")
                        .pattern("DRD")
                        .pattern("PLP")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.ELEVATOR_JAM_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('B', ItemTags.BUTTONS)
                        .define('Z', Items.REDSTONE)
                        .define('I', Items.IRON_BARS)
                        .pattern("IZI")
                        .pattern("BRB")
                        .pattern("IZI")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.GUIDING_LIGHT_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('L', Items.SOUL_LANTERN)
                        .define('S', Items.SOUL_SOIL)
                        .define('P', ItemTags.PLANKS)
                        .define('D', ItemTags.STONE_CRAFTING_MATERIALS)
                        .pattern("DLP")
                        .pattern("SRS")
                        .pattern("PLD")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.UNHINGED_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('F', Items.ROTTEN_FLESH)
                        .define('B', Items.BOOK)
                        .define('P', Items.BONE)
                        .pattern("PBP")
                        .pattern("FRF")
                        .pattern("PBP")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.HERE_I_COME_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('S', Items.SLIME_BALL)
                        .define('B', Items.BLACK_DYE)
                        .define('D', ItemTags.WOODEN_DOORS)
                        .define('E', Items.ENDER_EYE)
                        .pattern("SDB")
                        .pattern("ERE")
                        .pattern("BDS")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.JEFFS_JINGLE_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('B', Items.BLACK_DYE)
                        .define('G', Items.GOLD_NUGGET)
                        .define('S', Items.SEA_LANTERN)
                        .pattern("S S")
                        .pattern("BRB")
                        .pattern("BGB")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.UNHINGED_2_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('C', Items.FIRE_CHARGE)
                        .define('F', Items.ROTTEN_FLESH)
                        .define('B', Items.BONE)
                        .define('L', Items.LEVER)
                        .pattern("BCB")
                        .pattern("FRF")
                        .pattern("BLB")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.ELEVATOR_JAMMED_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('F', Items.ROTTEN_FLESH)
                        .define('B', Items.BONE)
                        .define('I', Items.IRON_BARS)
                        .pattern("IBI")
                        .pattern("FRF")
                        .pattern("IBI")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.ELEVATOR_JAM_REMIX_MUSIC_DISC)
                        .requires(ModItems.ELEVATOR_JAM_MUSIC_DISC)
                        .requires(ModItems.INSTRUMENT_SHUFFLER)
                        .unlockedBy(getHasName(ModItems.ELEVATOR_JAM_MUSIC_DISC), has(ModItems.ELEVATOR_JAM_MUSIC_DISC))
                        .unlockedBy(getHasName(ModItems.INSTRUMENT_SHUFFLER), has(ModItems.INSTRUMENT_SHUFFLER))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.DOORS_TRAILER_REMIX_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('P', ItemTags.PLANKS)
                        .define('L', Items.SOUL_LANTERN)
                        .pattern("LPL")
                        .pattern("PRP")
                        .pattern("LPL")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.DUSK_OF_THE_DOORS_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('L', Items.LANTERN)
                        .define('B', Items.BRICK)
                        .define('D', ItemTags.WOODEN_DOORS)
                        .pattern("BLB")
                        .pattern("DRD")
                        .pattern("BLB")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.CURIOUS_LIGHT_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('L', Items.LANTERN)
                        .define('G', Items.GLOWSTONE)
                        .define('P', ItemTags.PLANKS)
                        .define('W', ItemTags.WOOL)
                        .pattern("WLP")
                        .pattern("GRG")
                        .pattern("PLW")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC)
                        .requires(ModItems.JEFFS_JINGLE_MUSIC_DISC)
                        .requires(Items.ROTTEN_FLESH)
                        .requires(Items.BONE)
                        .requires(ModItems.INSTRUMENT_SHUFFLER)
                        .unlockedBy(getHasName(ModItems.JEFFS_JINGLE_MUSIC_DISC), has(ModItems.JEFFS_JINGLE_MUSIC_DISC))
                        .unlockedBy(getHasName(ModItems.INSTRUMENT_SHUFFLER), has(ModItems.INSTRUMENT_SHUFFLER))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.MAKE_HASTE_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('C', Items.CLOCK)
                        .define('L', Items.LEVER)
                        .define('D', ItemTags.WOODEN_DOORS)
                        .define('P', ItemTags.PLANKS)
                        .pattern("PDP")
                        .pattern("LRC")
                        .pattern("PDP")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .unlockedBy(getHasName(Items.CLOCK), has(Items.CLOCK))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.SEEK_MERCH_TRAILER_THEME_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('B', Items.BLACK_WOOL)
                        .define('W', Items.WHITE_WOOL)
                        .define('G', Items.GOLD_NUGGET)
                        .pattern("BBB")
                        .pattern("WRW")
                        .pattern("GBG")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC)
                        .requires(ModItems.ELEVATOR_JAM_MUSIC_DISC)
                        .requires(Items.RED_DYE)
                        .requires(Items.GREEN_DYE)
                        .requires(Items.BLUE_DYE)
                        .requires(ModItems.INSTRUMENT_SHUFFLER)
                        .unlockedBy(getHasName(ModItems.ELEVATOR_JAM_MUSIC_DISC), has(ModItems.ELEVATOR_JAM_MUSIC_DISC))
                        .unlockedBy(getHasName(ModItems.INSTRUMENT_SHUFFLER), has(ModItems.INSTRUMENT_SHUFFLER))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.ELEVATOR_JAM_VOICED_MUSIC_DISC)
                        .requires(ModItems.ELEVATOR_JAM_MUSIC_DISC)
                        .requires(ItemTags.NOTE_BLOCK_TOP_INSTRUMENTS)
                        .requires(ModItems.INSTRUMENT_SHUFFLER)
                        .unlockedBy(getHasName(ModItems.ELEVATOR_JAM_MUSIC_DISC), has(ModItems.ELEVATOR_JAM_MUSIC_DISC))
                        .unlockedBy(getHasName(ModItems.INSTRUMENT_SHUFFLER), has(ModItems.INSTRUMENT_SHUFFLER))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.READY_OR_NOT_MUSIC_DISC)
                        .requires(ModItems.HERE_I_COME_MUSIC_DISC)
                        .requires(Items.WATER_BUCKET)
                        .requires(Items.BLACK_DYE)
                        .requires(Items.MINECART)
                        .requires(Items.RAIL)
                        .requires(Items.POINTED_DRIPSTONE)
                        .requires(ModItems.INSTRUMENT_SHUFFLER)
                        .unlockedBy(getHasName(ModItems.HERE_I_COME_MUSIC_DISC), has(ModItems.HERE_I_COME_MUSIC_DISC))
                        .unlockedBy(getHasName(ModItems.INSTRUMENT_SHUFFLER), has(ModItems.INSTRUMENT_SHUFFLER))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.READY_TO_RUMBLE_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('P', ItemTags.PICKAXES)
                        .define('S', Items.STONE)
                        .define('W', Items.WATER_BUCKET)
                        .define('V', Items.VINE)
                        .define('L', Items.LEVER)
                        .define('Y', Items.REDSTONE)
                        .pattern("WPS")
                        .pattern("LRY")
                        .pattern("SVW")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.JEFFS_JAM_MUSIC_DISC)
                        .requires(ModItems.JEFFS_JINGLE_MUSIC_DISC)
                        .requires(Items.WATER_BUCKET)
                        .requires(ItemTags.PLANKS)
                        .requires(ItemTags.BUTTONS)
                        .requires(Items.REDSTONE)
                        .requires(Items.GOLD_NUGGET)
                        .requires(ModItems.INSTRUMENT_SHUFFLER)
                        .unlockedBy(getHasName(ModItems.JEFFS_JINGLE_MUSIC_DISC), has(ModItems.JEFFS_JINGLE_MUSIC_DISC))
                        .unlockedBy(getHasName(ModItems.INSTRUMENT_SHUFFLER), has(ModItems.INSTRUMENT_SHUFFLER))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.OH_DAM_MUSIC_DISC)
                        .requires(ModItems.HERE_I_COME_MUSIC_DISC)
                        .requires(Items.WATER_BUCKET)
                        .requires(Items.BLACK_DYE)
                        .requires(ItemTags.PLANKS)
                        .requires(Items.REDSTONE)
                        .requires(ItemTags.STONE_BRICKS)
                        .requires(ModItems.INSTRUMENT_SHUFFLER)
                        .unlockedBy(getHasName(ModItems.HERE_I_COME_MUSIC_DISC), has(ModItems.HERE_I_COME_MUSIC_DISC))
                        .unlockedBy(getHasName(ModItems.INSTRUMENT_SHUFFLER), has(ModItems.INSTRUMENT_SHUFFLER))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.FRESH_RAIN_MUSIC_DISC)
                        .requires(ModItems.ELEVATOR_JAMMED_MUSIC_DISC)
                        .requires(Items.WATER_BUCKET)
                        .requires(ItemTags.WOODEN_DOORS)
                        .requires(ItemTags.STONE_BRICKS)
                        .requires(ItemTags.SAPLINGS)
                        .requires(ModItems.INSTRUMENT_SHUFFLER)
                        .unlockedBy(getHasName(ModItems.ELEVATOR_JAMMED_MUSIC_DISC), has(ModItems.ELEVATOR_JAMMED_MUSIC_DISC))
                        .unlockedBy(getHasName(ModItems.INSTRUMENT_SHUFFLER), has(ModItems.INSTRUMENT_SHUFFLER))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('G', Items.GRASS_BLOCK)
                        .define('P', Items.DIRT_PATH)
                        .define('S', ItemTags.SAPLINGS)
                        .define('B', Items.BONE)
                        .define('V', Items.VINE)
                        .pattern("VBV")
                        .pattern("SRS")
                        .pattern("GPG")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.THE_GREAT_INDOORS_MUSIC_DISC)
                        .define('O', ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC)
                        .define('I', ModItems.INSTRUMENT_SHUFFLER)
                        .define('D', ItemTags.WOODEN_DOORS)
                        .define('P', ItemTags.PLANKS)
                        .define('G', Items.GLASS)
                        .pattern("DGD")
                        .pattern("GOG")
                        .pattern("PIP")
                        .unlockedBy(getHasName(ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC), has(ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC))
                        .unlockedBy(getHasName(ModItems.INSTRUMENT_SHUFFLER), has(ModItems.INSTRUMENT_SHUFFLER))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.SON_OF_A_BIRCH_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('L', Items.BIRCH_LOG)
                        .define('S', Items.SKELETON_SKULL)
                        .define('N', ItemTags.BUNDLES)
                        .define('H', Items.IRON_HOE)
                        .define('B', Items.BONE)
                        .define('V', Items.VINE)
                        .pattern("NSH")
                        .pattern("BRB")
                        .pattern("VLV")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.THORNS_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('L', Items.LANTERN)
                        .define('P', Items.PINK_PETALS)
                        .define('E', ItemTags.LEAVES)
                        .define('V', Items.VINE)
                        .pattern("VPV")
                        .pattern("ERE")
                        .pattern("VLV")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.KEEP_OFF_THE_GRASS_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('L', Items.LANTERN)
                        .define('S', Items.SKELETON_SKULL)
                        .define('N', ItemTags.BUNDLES)
                        .define('B', Items.BONE)
                        .define('V', Items.VINE)
                        .define('G', Items.GRASS_BLOCK)
                        .define('H', Items.LEATHER_BOOTS)
                        .define('P', ItemTags.PLANKS)
                        .pattern("LHN")
                        .pattern("VRS")
                        .pattern("GPB")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.DEALS_OF_THE_DOORS_MUSIC_DISC)
                        .define('D', ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC)
                        .define('I', ModItems.INSTRUMENT_SHUFFLER)
                        .define('G', Items.GOLD_NUGGET)
                        .define('P', ItemTags.PLANKS)
                        .define('B', ItemTags.WOODEN_BUTTONS)
                        .pattern("GPG")
                        .pattern("BDB")
                        .pattern("GIG")
                        .unlockedBy(getHasName(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC), has(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC))
                        .unlockedBy(getHasName(ModItems.INSTRUMENT_SHUFFLER), has(ModItems.INSTRUMENT_SHUFFLER))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.CONTENT_CONTENT_CONTENT_MUSIC_DISC)
                        .define('D', ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC)
                        .define('I', ModItems.INSTRUMENT_SHUFFLER)
                        .define('S', Items.SUGAR)
                        .define('M', Items.MAGENTA_DYE)
                        .define('Y', Items.YELLOW_DYE)
                        .define('L', Items.LIGHT_BLUE_DYE)
                        .pattern("MSM")
                        .pattern("YDY")
                        .pattern("LIL")
                        .unlockedBy(getHasName(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC), has(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC))
                        .unlockedBy(getHasName(ModItems.INSTRUMENT_SHUFFLER), has(ModItems.INSTRUMENT_SHUFFLER))
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.THE_MINES_TEASER_MUSIC_DISC)
                        .define('R', ModItems.RESONATOR)
                        .define('S', Items.STONE)
                        .define('I', Items.IRON_BARS)
                        .define('W', Items.WATER_BUCKET)
                        .define('L', Items.LADDER)
                        .pattern("SLS")
                        .pattern("IRI")
                        .pattern("SWS")
                        .unlockedBy(getHasName(ModItems.RESONATOR), has(ModItems.RESONATOR))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.THE_MINES_TRAILER_MUSIC_DISC)
                        .requires(ModItems.THE_MINES_TEASER_MUSIC_DISC)
                        .requires(Items.REDSTONE)
                        .requires(ModItems.INSTRUMENT_SHUFFLER)
                        .unlockedBy(getHasName(ModItems.THE_MINES_TEASER_MUSIC_DISC), has(ModItems.THE_MINES_TEASER_MUSIC_DISC))
                        .unlockedBy(getHasName(ModItems.INSTRUMENT_SHUFFLER), has(ModItems.INSTRUMENT_SHUFFLER))
                        .save(output);
            }
        };
    }



    @Override
    public String getName() {
        return "Roblox Doors Music Disc Recipes";
    }
}
