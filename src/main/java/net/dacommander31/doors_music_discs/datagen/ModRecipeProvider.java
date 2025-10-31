package net.dacommander31.doors_music_discs.datagen;

import net.dacommander31.doors_music_discs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {


    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RESONATOR)
                .input('N', Items.NOTE_BLOCK)
                .input('A', Items.AMETHYST_SHARD)
                .input('R', Items.REDSTONE)
                .pattern("RNR")
                .pattern("NAN")
                .pattern("RNR")
                .criterion(hasItem(Items.NOTE_BLOCK), conditionsFromItem(Items.NOTE_BLOCK))
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(consumer);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INSTRUMENT_SHUFFLER)
                .input(Items.NOTE_BLOCK)
                .input(Items.SAND)
                .input(ItemTags.PLANKS)
                .input(Items.GLASS)
                .input(ItemTags.STONE_CRAFTING_MATERIALS)
                .input(Items.COPPER_INGOT, 4)
                .criterion(hasItem(Items.NOTE_BLOCK), conditionsFromItem(Items.NOTE_BLOCK))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(consumer);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('D', ItemTags.WOODEN_DOORS)
                .input('L', Items.LANTERN)
                .input('P', ItemTags.PLANKS)
                .pattern("PLP")
                .pattern("DRD")
                .pattern("PLP")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ELEVATOR_JAM_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('B', ItemTags.BUTTONS)
                .input('Z', Items.REDSTONE)
                .input('I', Items.IRON_BARS)
                .pattern("IZI")
                .pattern("BRB")
                .pattern("IZI")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GUIDING_LIGHT_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('L', Items.SOUL_LANTERN)
                .input('S', Items.SOUL_SOIL)
                .input('P', ItemTags.PLANKS)
                .input('D', ItemTags.STONE_CRAFTING_MATERIALS)
                .pattern("DLP")
                .pattern("SRS")
                .pattern("PLD")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.UNHINGED_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('F', Items.ROTTEN_FLESH)
                .input('B', Items.BOOK)
                .input('P', Items.BONE)
                .pattern("PBP")
                .pattern("FRF")
                .pattern("PBP")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HERE_I_COME_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('S', Items.SLIME_BALL)
                .input('B', Items.BLACK_DYE)
                .input('D', ItemTags.WOODEN_DOORS)
                .input('E', Items.ENDER_EYE)
                .pattern("SDB")
                .pattern("ERE")
                .pattern("BDS")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JEFFS_JINGLE_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('B', Items.BLACK_DYE)
                .input('G', Items.GOLD_NUGGET)
                .input('S', Items.SEA_LANTERN)
                .pattern("S S")
                .pattern("BRB")
                .pattern("BGB")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.UNHINGED_2_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('C', Items.FIRE_CHARGE)
                .input('F', Items.ROTTEN_FLESH)
                .input('B', Items.BONE)
                .input('L', Items.LEVER)
                .pattern("BCB")
                .pattern("FRF")
                .pattern("BLB")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ELEVATOR_JAMMED_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('F', Items.ROTTEN_FLESH)
                .input('B', Items.BONE)
                .input('I', Items.IRON_BARS)
                .pattern("IBI")
                .pattern("FRF")
                .pattern("IBI")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ELEVATOR_JAM_REMIX_MUSIC_DISC)
                .input(ModItems.ELEVATOR_JAM_MUSIC_DISC)
                .input(ModItems.INSTRUMENT_SHUFFLER)
                .criterion(hasItem(ModItems.ELEVATOR_JAM_MUSIC_DISC), conditionsFromItem(ModItems.ELEVATOR_JAM_MUSIC_DISC))
                .criterion(hasItem(ModItems.INSTRUMENT_SHUFFLER), conditionsFromItem(ModItems.INSTRUMENT_SHUFFLER))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DOORS_TRAILER_REMIX_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('P', ItemTags.PLANKS)
                .input('L', Items.SOUL_LANTERN)
                .pattern("LPL")
                .pattern("PRP")
                .pattern("LPL")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DUSK_OF_THE_DOORS_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('L', Items.LANTERN)
                .input('B', Items.BRICK)
                .input('D', ItemTags.WOODEN_DOORS)
                .pattern("BLB")
                .pattern("DRD")
                .pattern("BLB")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CURIOUS_LIGHT_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('L', Items.LANTERN)
                .input('G', Items.GLOWSTONE)
                .input('P', ItemTags.PLANKS)
                .input('W', ItemTags.WOOL)
                .pattern("WLP")
                .pattern("GRG")
                .pattern("PLW")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JEFFS_JINGLE_DNB_REMIX_MUSIC_DISC)
                .input(ModItems.JEFFS_JINGLE_MUSIC_DISC)
                .input(Items.ROTTEN_FLESH)
                .input(Items.BONE)
                .input(ModItems.INSTRUMENT_SHUFFLER)
                .criterion(hasItem(ModItems.JEFFS_JINGLE_MUSIC_DISC), conditionsFromItem(ModItems.JEFFS_JINGLE_MUSIC_DISC))
                .criterion(hasItem(ModItems.INSTRUMENT_SHUFFLER), conditionsFromItem(ModItems.INSTRUMENT_SHUFFLER))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAKE_HASTE_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('C', Items.CLOCK)
                .input('L', Items.LEVER)
                .input('D', ItemTags.WOODEN_DOORS)
                .input('P', ItemTags.PLANKS)
                .pattern("PDP")
                .pattern("LRC")
                .pattern("PDP")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .criterion(hasItem(Items.CLOCK), conditionsFromItem(Items.CLOCK))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SEEK_MERCH_TRAILER_THEME_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('B', Items.BLACK_WOOL)
                .input('W', Items.WHITE_WOOL)
                .input('G', Items.GOLD_NUGGET)
                .pattern("BBB")
                .pattern("WRW")
                .pattern("GBG")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ELEVATOR_JAM_RETRO_MODE_MUSIC_DISC)
                .input(ModItems.ELEVATOR_JAM_MUSIC_DISC)
                .input(Items.RED_DYE)
                .input(Items.GREEN_DYE)
                .input(Items.BLUE_DYE)
                .input(ModItems.INSTRUMENT_SHUFFLER)
                .criterion(hasItem(ModItems.ELEVATOR_JAM_MUSIC_DISC), conditionsFromItem(ModItems.ELEVATOR_JAM_MUSIC_DISC))
                .criterion(hasItem(ModItems.INSTRUMENT_SHUFFLER), conditionsFromItem(ModItems.INSTRUMENT_SHUFFLER))
                .offerTo(consumer);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ELEVATOR_JAM_VOICED_MUSIC_DISC)
                .input(ModItems.ELEVATOR_JAM_MUSIC_DISC)
                .input(ItemTags.NOTEBLOCK_TOP_INSTRUMENTS)
                .input(ModItems.INSTRUMENT_SHUFFLER)
                .criterion(hasItem(ModItems.ELEVATOR_JAM_MUSIC_DISC), conditionsFromItem(ModItems.ELEVATOR_JAM_MUSIC_DISC))
                .criterion(hasItem(ModItems.INSTRUMENT_SHUFFLER), conditionsFromItem(ModItems.INSTRUMENT_SHUFFLER))
                .offerTo(consumer);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.READY_OR_NOT_MUSIC_DISC)
                .input(ModItems.HERE_I_COME_MUSIC_DISC)
                .input(Items.WATER_BUCKET)
                .input(Items.BLACK_DYE)
                .input(Items.MINECART)
                .input(Items.RAIL)
                .input(Items.POINTED_DRIPSTONE)
                .input(ModItems.INSTRUMENT_SHUFFLER)
                .criterion(hasItem(ModItems.HERE_I_COME_MUSIC_DISC), conditionsFromItem(ModItems.HERE_I_COME_MUSIC_DISC))
                .criterion(hasItem(ModItems.INSTRUMENT_SHUFFLER), conditionsFromItem(ModItems.INSTRUMENT_SHUFFLER))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.READY_TO_RUMBLE_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('P', ItemTags.PICKAXES)
                .input('S', Items.STONE)
                .input('W', Items.WATER_BUCKET)
                .input('V', Items.VINE)
                .input('L', Items.LEVER)
                .input('Y', Items.REDSTONE)
                .pattern("WPS")
                .pattern("LRY")
                .pattern("SVW")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JEFFS_JAM_MUSIC_DISC)
                .input(ModItems.JEFFS_JINGLE_MUSIC_DISC)
                .input(Items.WATER_BUCKET)
                .input(ItemTags.PLANKS)
                .input(ItemTags.BUTTONS)
                .input(Items.REDSTONE)
                .input(Items.GOLD_NUGGET)
                .input(ModItems.INSTRUMENT_SHUFFLER)
                .criterion(hasItem(ModItems.JEFFS_JINGLE_MUSIC_DISC), conditionsFromItem(ModItems.JEFFS_JINGLE_MUSIC_DISC))
                .criterion(hasItem(ModItems.INSTRUMENT_SHUFFLER), conditionsFromItem(ModItems.INSTRUMENT_SHUFFLER))
                .offerTo(consumer);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OH_DAM_MUSIC_DISC)
                .input(ModItems.HERE_I_COME_MUSIC_DISC)
                .input(Items.WATER_BUCKET)
                .input(Items.BLACK_DYE)
                .input(ItemTags.PLANKS)
                .input(Items.REDSTONE)
                .input(ItemTags.STONE_BRICKS)
                .input(ModItems.INSTRUMENT_SHUFFLER)
                .criterion(hasItem(ModItems.HERE_I_COME_MUSIC_DISC), conditionsFromItem(ModItems.HERE_I_COME_MUSIC_DISC))
                .criterion(hasItem(ModItems.INSTRUMENT_SHUFFLER), conditionsFromItem(ModItems.INSTRUMENT_SHUFFLER))
                .offerTo(consumer);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FRESH_RAIN_MUSIC_DISC)
                .input(ModItems.ELEVATOR_JAMMED_MUSIC_DISC)
                .input(Items.WATER_BUCKET)
                .input(ItemTags.WOODEN_DOORS)
                .input(ItemTags.STONE_BRICKS)
                .input(ItemTags.SAPLINGS)
                .input(ModItems.INSTRUMENT_SHUFFLER)
                .criterion(hasItem(ModItems.ELEVATOR_JAMMED_MUSIC_DISC), conditionsFromItem(ModItems.ELEVATOR_JAMMED_MUSIC_DISC))
                .criterion(hasItem(ModItems.INSTRUMENT_SHUFFLER), conditionsFromItem(ModItems.INSTRUMENT_SHUFFLER))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('G', Items.GRASS_BLOCK)
                .input('P', Items.DIRT_PATH)
                .input('S', ItemTags.SAPLINGS)
                .input('B', Items.BONE)
                .input('V', Items.VINE)
                .pattern("VBV")
                .pattern("SRS")
                .pattern("GPG")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_GREAT_INDOORS_MUSIC_DISC)
                .input('O', ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC)
                .input('I', ModItems.INSTRUMENT_SHUFFLER)
                .input('D', ItemTags.WOODEN_DOORS)
                .input('P', ItemTags.PLANKS)
                .input('G', Items.GLASS)
                .pattern("DGD")
                .pattern("GOG")
                .pattern("PIP")
                .criterion(hasItem(ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC), conditionsFromItem(ModItems.THE_GREAT_OUTDOORS_MUSIC_DISC))
                .criterion(hasItem(ModItems.INSTRUMENT_SHUFFLER), conditionsFromItem(ModItems.INSTRUMENT_SHUFFLER))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SON_OF_A_BIRCH_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('L', Items.BIRCH_LOG)
                .input('S', Items.SKELETON_SKULL)
                .input('N', Items.LEATHER)
                .input('H', Items.IRON_HOE)
                .input('B', Items.BONE)
                .input('V', Items.VINE)
                .pattern("NSH")
                .pattern("BRB")
                .pattern("VLV")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THORNS_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('L', Items.LANTERN)
                .input('P', Items.PINK_PETALS)
                .input('E', ItemTags.LEAVES)
                .input('V', Items.VINE)
                .pattern("VPV")
                .pattern("ERE")
                .pattern("VLV")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.KEEP_OFF_THE_GRASS_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('L', Items.LANTERN)
                .input('S', Items.SKELETON_SKULL)
                .input('N', Items.LEATHER)
                .input('B', Items.BONE)
                .input('V', Items.VINE)
                .input('G', Items.GRASS_BLOCK)
                .input('H', Items.LEATHER_BOOTS)
                .input('P', ItemTags.PLANKS)
                .pattern("LHN")
                .pattern("VRS")
                .pattern("GPB")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEALS_OF_THE_DOORS_MUSIC_DISC)
                .input('D', ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC)
                .input('I', ModItems.INSTRUMENT_SHUFFLER)
                .input('G', Items.GOLD_NUGGET)
                .input('P', ItemTags.PLANKS)
                .input('B', ItemTags.WOODEN_BUTTONS)
                .pattern("GPG")
                .pattern("BDB")
                .pattern("GIG")
                .criterion(hasItem(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC), conditionsFromItem(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC))
                .criterion(hasItem(ModItems.INSTRUMENT_SHUFFLER), conditionsFromItem(ModItems.INSTRUMENT_SHUFFLER))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CONTENT_CONTENT_CONTENT_MUSIC_DISC)
                .input('D', ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC)
                .input('I', ModItems.INSTRUMENT_SHUFFLER)
                .input('S', Items.SUGAR)
                .input('M', Items.MAGENTA_DYE)
                .input('Y', Items.YELLOW_DYE)
                .input('L', Items.LIGHT_BLUE_DYE)
                .pattern("MSM")
                .pattern("YDY")
                .pattern("LIL")
                .criterion(hasItem(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC), conditionsFromItem(ModItems.DAWN_OF_THE_DOORS_MUSIC_DISC))
                .criterion(hasItem(ModItems.INSTRUMENT_SHUFFLER), conditionsFromItem(ModItems.INSTRUMENT_SHUFFLER))
                .offerTo(consumer);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_MINES_TEASER_MUSIC_DISC)
                .input('R', ModItems.RESONATOR)
                .input('S', Items.STONE)
                .input('I', Items.IRON_BARS)
                .input('W', Items.WATER_BUCKET)
                .input('L', Items.LADDER)
                .pattern("SLS")
                .pattern("IRI")
                .pattern("SWS")
                .criterion(hasItem(ModItems.RESONATOR), conditionsFromItem(ModItems.RESONATOR))
                .offerTo(consumer);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_MINES_TRAILER_MUSIC_DISC)
                .input(ModItems.THE_MINES_TEASER_MUSIC_DISC)
                .input(Items.REDSTONE)
                .input(ModItems.INSTRUMENT_SHUFFLER)
                .criterion(hasItem(ModItems.THE_MINES_TEASER_MUSIC_DISC), conditionsFromItem(ModItems.THE_MINES_TEASER_MUSIC_DISC))
                .criterion(hasItem(ModItems.INSTRUMENT_SHUFFLER), conditionsFromItem(ModItems.INSTRUMENT_SHUFFLER))
                .offerTo(consumer);
    }
}
