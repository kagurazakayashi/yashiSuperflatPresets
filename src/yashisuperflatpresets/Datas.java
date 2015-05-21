
package yashisuperflatpresets;

import java.util.ArrayList;
import java.lang.String;

/**
 *
 * @author yashi
 */


public class Datas {
    
    //预设配置 id1=DataValue,id2=English,id3=Chinese
    public ArrayList<String> demoPreset (int id) {
        ArrayList<String> id1 = new ArrayList<String>();
        ArrayList<String> id2 = new ArrayList<String>();
        ArrayList<String> id3 = new ArrayList<String>();
        id1.add("3;minecraft:bedrock,2*minecraft:dirt,minecraft:grass;1;village");    id2.add("Classic Flat");    id3.add("经典平坦");
        id1.add("3;minecraft:bedrock,230*minecraft:stone,5*minecraft:dirt,minecraft:grass;3;biome_1,decoration,stronghold,mineshaft,dungeon");    id2.add("Tunnelers' Dream");    id3.add("挖洞者的梦想");
        id1.add("3;minecraft:bedrock,5*minecraft:stone,5*minecraft:dirt,5*minecraft:sand,90*minecraft:water;24;oceanmonument,biome_1");    id2.add("Water World");    id3.add("水世界");
        id1.add("3;minecraft:bedrock,59*minecraft:stone,3*minecraft:dirt,minecraft:grass;1;village,biome_1,decoration,stronghold,mineshaft,lake,lava_lake,dungeon");    id2.add("Overworld");    id3.add("主世界");
        id1.add("3;minecraft:bedrock,59*minecraft:stone,3*minecraft:dirt,minecraft:grass,minecraft:snow_layer;12;village,biome_1");    id2.add("Snowy Kingdom");    id3.add("雪之国度");
        id1.add("3;2*minecraft:cobblestone,3*minecraft:dirt,minecraft:grass;1;village,biome_1");    id2.add("Bottomless Pit");    id3.add("无底洞");
        id1.add("3;minecraft:bedrock,3*minecraft:stone,52*minecraft:sandstone,8*minecraft:sand;2;village,biome_1,decoration,stronghold,mineshaft,dungeon");    id2.add("Desert");    id3.add("沙漠");
        id1.add("3;minecraft:bedrock,3*minecraft:stone,52*minecraft:sandstone;2;");    id2.add("Redstone Ready");    id3.add("红石就绪");
        if (id == 1) {
            return id1;
        } else if (id == 2) {
            return id2;
        } else if (id == 3) {
            return id3;
        }
        return null;
    }
    
    //生物群系 id2=Chinese,id3=English
    public ArrayList<String> biome (int id) {
        ArrayList<String> id2 = new ArrayList<String>();
        ArrayList<String> id3 = new ArrayList<String>();
        id2.add("海洋");    id3.add("");
        id2.add("草原");    id3.add("");
        id2.add("沙漠");    id3.add("");
        id2.add("峭壁");    id3.add("");
        id2.add("森林");    id3.add("");
        id2.add("针叶林");    id3.add("");
        id2.add("沼泽");    id3.add("");
        id2.add("河流");    id3.add("");
        id2.add("下界");    id3.add("");
        id2.add("天空");    id3.add("");
        id2.add("冻洋");    id3.add("");
        id2.add("冻河");    id3.add("");
        id2.add("冰原");    id3.add("");
        id2.add("冰山");    id3.add("");
        id2.add("蘑菇岛");    id3.add("");
        id2.add("蘑菇岛海岸");    id3.add("");
        id2.add("沙滩");    id3.add("");
        id2.add("沙漠山丘");    id3.add("");
        id2.add("森林山丘");    id3.add("");
        id2.add("针叶林山丘");    id3.add("");
        id2.add("峭壁边缘");    id3.add("");
        id2.add("丛林");    id3.add("");
        id2.add("丛林山丘");    id3.add("");
        id2.add("丛林边缘");    id3.add("");
        id2.add("深海");    id3.add("");
        id2.add("石滩");    id3.add("");
        id2.add("寒冷沙滩");    id3.add("");
        id2.add("桦木森林");    id3.add("");
        id2.add("桦木森林山丘");    id3.add("");
        id2.add("黑森林");    id3.add("");
        id2.add("冷针叶林");    id3.add("");
        id2.add("冷针叶林山丘");    id3.add("");
        id2.add("大型针叶林");    id3.add("");
        id2.add("大型针叶林山丘");    id3.add("");
        id2.add("峭壁+");    id3.add("");
        id2.add("热带草原");    id3.add("");
        id2.add("热带高原");    id3.add("");
        id2.add("平顶山");    id3.add("");
        id2.add("平顶山高原 F");    id3.add("");
        id2.add("平顶山高原");    id3.add("");
        id2.add("向日葵平原");    id3.add("");
        id2.add("沙漠 M");    id3.add("");
        id2.add("极端的山丘 M");    id3.add("");
        id2.add("花的森林");    id3.add("");
        id2.add("针叶林 M");    id3.add("");
        id2.add("沼泽 M");    id3.add("");
        id2.add("冰刺平原");    id3.add("");
        id2.add("丛林 M");    id3.add("");
        id2.add("丛林边缘 M");    id3.add("");
        id2.add("白桦森林 M");    id3.add("");
        id2.add("桦木森林 M");    id3.add("");
        id2.add("黑森林 M");    id3.add("");
        id2.add("冷针叶林 M");    id3.add("");
        id2.add("红木森林");    id3.add("");
        id2.add("红木山丘");    id3.add("");
        id2.add("峭壁+ M");    id3.add("");
        id2.add("热带草原 M");    id3.add("");
        id2.add("热带高原 M");    id3.add("");
        id2.add("平顶山（岩柱）");    id3.add("");
        id2.add("平顶山高原 F M");    id3.add("");
        id2.add("平顶山高原 M");    id3.add("");
        if (id == 2) {
            return id2;
        } else if (id == 3) {
            return id3;
        }
        return null;
    }
    
    //羊毛，染色粘土，染色玻璃和地毯 id2=Chinese,id3=English
    public ArrayList<String> blockColor (int id) {
        ArrayList<String> id2 = new ArrayList<String>();
        ArrayList<String> id3 = new ArrayList<String>();
        id2.add("普通（白色）");    id3.add("");
        id2.add("橙色");    id3.add("");
        id2.add("品红色");    id3.add("");
        id2.add("淡蓝色");    id3.add("");
        id2.add("黄色");    id3.add("");
        id2.add("黄绿色");    id3.add("");
        id2.add("粉红色");    id3.add("");
        id2.add("灰色");    id3.add("");
        id2.add("淡灰色");    id3.add("");
        id2.add("青色");    id3.add("");
        id2.add("紫色");    id3.add("");
        id2.add("蓝色");    id3.add("");
        id2.add("棕色");    id3.add("");
        id2.add("绿色");    id3.add("");
        id2.add("红色");    id3.add("");
        id2.add("黑色");    id3.add("");
        if (id == 2) {
            return id2;
        } else if (id == 3) {
            return id3;
        }
        return null;
    }
    
    //方块 id0=BlockID,id1=DataValue,id2=Chinese,id3=English
    public ArrayList<String> block (int id) {
        ArrayList<String> id0 = new ArrayList<String>();
        ArrayList<String> id1 = new ArrayList<String>();
        ArrayList<String> id2 = new ArrayList<String>();
        ArrayList<String> id3 = new ArrayList<String>();
        id0.add("0");    id1.add("minecraft:air");    id2.add("空气");    id3.add("");
        id0.add("1");    id1.add("minecraft:stone");    id2.add("石头");    id3.add("");
        id0.add("1:1");    id1.add("minecraft:stone:1");    id2.add("花岗岩");    id3.add("");
        id0.add("1:2");    id1.add("minecraft:stone:2");    id2.add("磨制花岗岩");    id3.add("");
        id0.add("1:3");    id1.add("minecraft:stone:3");    id2.add("闪长岩");    id3.add("");
        id0.add("1:4");    id1.add("minecraft:stone:4");    id2.add("磨制闪长岩");    id3.add("");
        id0.add("1:5");    id1.add("minecraft:stone:5");    id2.add("安山岩");    id3.add("");
        id0.add("1:6");    id1.add("minecraft:stone:6");    id2.add("磨制安山岩");    id3.add("");
        id0.add("2");    id1.add("minecraft:grass");    id2.add("草方块");    id3.add("");
        id0.add("3");    id1.add("minecraft:dirt");    id2.add("泥土");    id3.add("");
        id0.add("3:1");    id1.add("minecraft:dirt:1");    id2.add("砂土");    id3.add("");
        id0.add("3:2");    id1.add("minecraft:dirt:2");    id2.add("灰化土");    id3.add("");
        id0.add("4");    id1.add("minecraft:cobblestone");    id2.add("圆石");    id3.add("");
        id0.add("5");    id1.add("minecraft:planks");    id2.add("橡木木板");    id3.add("");
        id0.add("5:1");    id1.add("minecraft:planks:1");    id2.add("云杉木板");    id3.add("");
        id0.add("5:2");    id1.add("minecraft:planks:2");    id2.add("白桦木板");    id3.add("");
        id0.add("5:3");    id1.add("minecraft:planks:3");    id2.add("丛林木板");    id3.add("");
        id0.add("5:4");    id1.add("minecraft:planks:4");    id2.add("金合欢木板");    id3.add("");
        id0.add("5:5");    id1.add("minecraft:planks:5");    id2.add("深色橡木木板");    id3.add("");
        id0.add("6");    id1.add("minecraft:sapling");    id2.add("树苗");    id3.add("");
        id0.add("7");    id1.add("minecraft:bedrock");    id2.add("基岩");    id3.add("");
        id0.add("8");    id1.add("minecraft:flowing_water");    id2.add("水");    id3.add("");
        id0.add("9");    id1.add("minecraft:water");    id2.add("静态水");    id3.add("");
        id0.add("10");    id1.add("minecraft:flowing_lava");    id2.add("岩浆");    id3.add("");
        id0.add("11");    id1.add("minecraft:lava");    id2.add("静态岩浆");    id3.add("");
        id0.add("12");    id1.add("minecraft:sand");    id2.add("沙子");    id3.add("");
        id0.add("12:1");    id1.add("minecraft:sand:1");    id2.add("红沙");    id3.add("");
        id0.add("13");    id1.add("minecraft:gravel");    id2.add("沙砾");    id3.add("");
        id0.add("14");    id1.add("minecraft:gold_ore");    id2.add("金矿石");    id3.add("");
        id0.add("15");    id1.add("minecraft:iron_ore");    id2.add("铁矿石");    id3.add("");
        id0.add("16");    id1.add("minecraft:coal_ore");    id2.add("煤矿石");    id3.add("");
        id0.add("17");    id1.add("minecraft:log");    id2.add("橡木（面朝上/下）");    id3.add("");
        id0.add("17:1");    id1.add("minecraft:log:1");    id2.add("云杉木（面朝上/下）");    id3.add("");
        id0.add("17:2");    id1.add("minecraft:log:2");    id2.add("白桦木（面朝上/下）");    id3.add("");
        id0.add("17:3");    id1.add("minecraft:log:3");    id2.add("从林木（面朝上/下）");    id3.add("");
        id0.add("17:4");    id1.add("minecraft:log:4");    id2.add("橡木（面朝东/西）");    id3.add("");
        id0.add("17:5");    id1.add("minecraft:log:5");    id2.add("云杉木（面朝东/西）");    id3.add("");
        id0.add("17:6");    id1.add("minecraft:log:6");    id2.add("白桦木（面朝东/西）");    id3.add("");
        id0.add("17:7");    id1.add("minecraft:log:7");    id2.add("从林木（面朝东/西）");    id3.add("");
        id0.add("17:8");    id1.add("minecraft:log:8");    id2.add("橡木（面朝南/北）");    id3.add("");
        id0.add("17:9");    id1.add("minecraft:log:9");    id2.add("云杉木（面朝南/北）");    id3.add("");
        id0.add("17:10");    id1.add("minecraft:log:10");    id2.add("白桦木（面朝南/北）");    id3.add("");
        id0.add("17:11");    id1.add("minecraft:log:11");    id2.add("从林木（面朝南/北）");    id3.add("");
        id0.add("17:12");    id1.add("minecraft:log:12");    id2.add("橡木（只有树皮）");    id3.add("");
        id0.add("17:13");    id1.add("minecraft:log:13");    id2.add("云杉木（只有树皮）");    id3.add("");
        id0.add("17:14");    id1.add("minecraft:log:14");    id2.add("白桦木（只有树皮）");    id3.add("");
        id0.add("17:15");    id1.add("minecraft:log:15");    id2.add("从林木（只有树皮）");    id3.add("");
        id0.add("18");    id1.add("minecraft:leaves");    id2.add("橡树树叶");    id3.add("");
        id0.add("18:1");    id1.add("minecraft:leaves:1");    id2.add("云杉树叶");    id3.add("");
        id0.add("18:2");    id1.add("minecraft:leaves:2");    id2.add("白桦树叶");    id3.add("");
        id0.add("18:3");    id1.add("minecraft:leaves:3");    id2.add("丛林树叶");    id3.add("");
        id0.add("18:4");    id1.add("minecraft:leaves:4");    id2.add("橡树树叶 (无腐烂)");    id3.add("");
        id0.add("18:5");    id1.add("minecraft:leaves:5");    id2.add("云杉树叶 (无腐烂)");    id3.add("");
        id0.add("18:6");    id1.add("minecraft:leaves:6");    id2.add("白桦树叶 (无腐烂)");    id3.add("");
        id0.add("18:7");    id1.add("minecraft:leaves:7");    id2.add("丛林树叶 (无腐烂)");    id3.add("");
        id0.add("18:8");    id1.add("minecraft:leaves:8");    id2.add("橡树树叶 (检查腐烂)");    id3.add("");
        id0.add("18:9");    id1.add("minecraft:leaves:9");    id2.add("云杉树叶 (检查腐烂)");    id3.add("");
        id0.add("18:10");    id1.add("minecraft:leaves:10");    id2.add("白桦树叶 (检查腐烂)");    id3.add("");
        id0.add("18:11");    id1.add("minecraft:leaves:11");    id2.add("白桦树叶 (检查腐烂)");    id3.add("");
        id0.add("18:12");    id1.add("minecraft:leaves:12");    id2.add("橡树树叶 (无腐烂和检查腐烂)");    id3.add("");
        id0.add("18:13");    id1.add("minecraft:leaves:13");    id2.add("云杉树叶 (无腐烂和检查腐烂)");    id3.add("");
        id0.add("18:14");    id1.add("minecraft:leaves:14");    id2.add("白桦树叶 (无腐烂和检查腐烂)");    id3.add("");
        id0.add("18:15");    id1.add("minecraft:leaves:15");    id2.add("丛林树叶 (无腐烂和检查腐烂)");    id3.add("");
        id0.add("19");    id1.add("minecraft:sponge");    id2.add("海绵");    id3.add("");
        id0.add("20");    id1.add("minecraft:glass");    id2.add("玻璃");    id3.add("");
        id0.add("22");    id1.add("minecraft:lapis_ore");    id2.add("青金石矿石");    id3.add("");
        id0.add("22");    id1.add("minecraft:lapis_block");    id2.add("青金石块");    id3.add("");
        id0.add("23");    id1.add("minecraft:dispenser");    id2.add("发射器");    id3.add("");
        id0.add("24");    id1.add("minecraft:sandstone");    id2.add("沙石");    id3.add("");
        id0.add("24:1");    id1.add("minecraft:sandstone:1");    id2.add("錾制沙石");    id3.add("");
        id0.add("24:2");    id1.add("minecraft:sandstone:2");    id2.add("平滑沙石");    id3.add("");
        id0.add("25");    id1.add("minecraft:noteblock");    id2.add("音符盒");    id3.add("");
        id0.add("27");    id1.add("minecraft:golden_rail");    id2.add("充能铁轨");    id3.add("");
        id0.add("28");    id1.add("minecraft:detector_rail");    id2.add("探测铁轨");    id3.add("");
        id0.add("29");    id1.add("minecraft:sticky_piston");    id2.add("粘性活塞");    id3.add("");
        id0.add("30");    id1.add("minecraft:web");    id2.add("蜘蛛网");    id3.add("");
        id0.add("31");    id1.add("minecraft:tallgrass");    id2.add("草丛");    id3.add("");
        id0.add("32");    id1.add("minecraft:deadbush");    id2.add("枯死的灌木");    id3.add("");
        id0.add("33");    id1.add("minecraft:piston");    id2.add("活塞");    id3.add("");
        id0.add("35:<color>");    id1.add("minecraft:wool:<color>");    id2.add("羊毛");    id3.add("");
        id0.add("37");    id1.add("minecraft:yellow_flower");    id2.add("蒲公英");    id3.add("");
        id0.add("38");    id1.add("minecraft:red_flower");    id2.add("罂粟");    id3.add("");
        id0.add("39");    id1.add("minecraft:brown_mushroom");    id2.add("棕色蘑菇");    id3.add("");
        id0.add("40");    id1.add("minecraft:red_mushroom");    id2.add("红色蘑菇");    id3.add("");
        id0.add("41");    id1.add("minecraft:gold_block");    id2.add("金块");    id3.add("");
        id0.add("42");    id1.add("minecraft:iron_block");    id2.add("铁块");    id3.add("");
        id0.add("44");    id1.add("minecraft:stone_slab");    id2.add("石台阶");    id3.add("");
        id0.add("44:1");    id1.add("minecraft:stone_slab:1");    id2.add("沙石台阶");    id3.add("");
        id0.add("44:2");    id1.add("minecraft:stone_slab:2");    id2.add("木石台阶");    id3.add("");
        id0.add("44:3");    id1.add("minecraft:stone_slab:3");    id2.add("圆石台阶");    id3.add("");
        id0.add("44:4");    id1.add("minecraft:stone_slab:4");    id2.add("砖块台阶");    id3.add("");
        id0.add("44:5");    id1.add("minecraft:stone_slab:5");    id2.add("石砖台阶");    id3.add("");
        id0.add("44:6");    id1.add("minecraft:stone_slab:6");    id2.add("地狱砖台阶");    id3.add("");
        id0.add("44:7");    id1.add("minecraft:stone_slab:7");    id2.add("石英台阶");    id3.add("");
        id0.add("45");    id1.add("minecraft:brick_block");    id2.add("砖块");    id3.add("");
        id0.add("46");    id1.add("minecraft:tnt");    id2.add("TNT");    id3.add("");
        id0.add("47");    id1.add("minecraft:bookshelf");    id2.add("书架");    id3.add("");
        id0.add("48");    id1.add("minecraft:mossy_cobblestone");    id2.add("苔石");    id3.add("");
        id0.add("49");    id1.add("minecraft:obsidian");    id2.add("黑曜石");    id3.add("");
        id0.add("50");    id1.add("minecraft:torch");    id2.add("火把");    id3.add("");
        id0.add("52");    id1.add("minecraft:mob_spawner");    id2.add("刷怪箱");    id3.add("");
        id0.add("53");    id1.add("minecraft:oak_stairs");    id2.add("橡木楼梯");    id3.add("");
        id0.add("54");    id1.add("minecraft:chest");    id2.add("箱子");    id3.add("");
        id0.add("55");    id1.add("minecraft:redstone_wire");    id2.add("红石线");    id3.add("");
        id0.add("56");    id1.add("minecraft:diamond_ore");    id2.add("钻石矿石");    id3.add("");
        id0.add("57");    id1.add("minecraft:diamond_block");    id2.add("钻石块");    id3.add("");
        id0.add("58");    id1.add("minecraft:crafting_table");    id2.add("工作台");    id3.add("");
        id0.add("60");    id1.add("minecraft:farmland");    id2.add("耕地");    id3.add("");
        id0.add("61");    id1.add("minecraft:furnace");    id2.add("熔炉");    id3.add("");
        id0.add("62");    id1.add("minecraft:lit_furnace");    id2.add("燃烧的熔炉");    id3.add("");
        id0.add("65");    id1.add("minecraft:ladder");    id2.add("梯子");    id3.add("");
        id0.add("66");    id1.add("minecraft:rail");    id2.add("铁轨");    id3.add("");
        id0.add("67");    id1.add("minecraft:stone_stairs");    id2.add("圆石楼梯");    id3.add("");
        id0.add("69");    id1.add("minecraft:lever");    id2.add("拉杆");    id3.add("");
        id0.add("70");    id1.add("minecraft:stone_pressure_plate");    id2.add("石质压力板");    id3.add("");
        id0.add("72");    id1.add("minecraft:wooden_pressure_plate");    id2.add("木质压力板");    id3.add("");
        id0.add("73");    id1.add("minecraft:redstone_ore");    id2.add("红石矿石");    id3.add("");
        id0.add("76");    id1.add("minecraft:redstone_torch");    id2.add("红石火把(已开启)");    id3.add("");
        id0.add("77");    id1.add("minecraft:stone_button");    id2.add("石质按钮");    id3.add("");
        id0.add("78");    id1.add("minecraft:snow_layer");    id2.add("雪");    id3.add("");
        id0.add("79");    id1.add("minecraft:ice");    id2.add("冰");    id3.add("");
        id0.add("80");    id1.add("minecraft:snow");    id2.add("雪块");    id3.add("");
        id0.add("81");    id1.add("minecraft:cactus");    id2.add("仙人掌");    id3.add("");
        id0.add("82");    id1.add("minecraft:clay");    id2.add("粘土");    id3.add("");
        id0.add("84");    id1.add("minecraft:jukebox");    id2.add("唱片机");    id3.add("");
        id0.add("85");    id1.add("minecraft:fence");    id2.add("栅栏");    id3.add("");
        id0.add("86");    id1.add("minecraft:pumpkin");    id2.add("南瓜");    id3.add("");
        id0.add("87");    id1.add("minecraft:netherrack");    id2.add("地狱岩");    id3.add("");
        id0.add("88");    id1.add("minecraft:soul_sand");    id2.add("灵魂沙");    id3.add("");
        id0.add("89");    id1.add("minecraft:glowstone");    id2.add("萤石");    id3.add("");
        id0.add("91");    id1.add("minecraft:lit_pumpkin");    id2.add("南瓜灯");    id3.add("");
        id0.add("95:<color>");    id1.add("minecraft:stained_glass:<color>");    id2.add("染色玻璃");    id3.add("");
        id0.add("96");    id1.add("minecraft:trapdoor");    id2.add("活板门");    id3.add("");
        id0.add("97");    id1.add("minecraft:monster_egg");    id2.add("石头怪物蛋");    id3.add("");
        id0.add("97:1");    id1.add("minecraft:monster_egg:1");    id2.add("圆石怪物蛋");    id3.add("");
        id0.add("97:2");    id1.add("minecraft:monster_egg:2");    id2.add("石砖怪物蛋");    id3.add("");
        id0.add("98");    id1.add("minecraft:stonebrick");    id2.add("石砖");    id3.add("");
        id0.add("98:1");    id1.add("minecraft:stonebrick:1");    id2.add("苔石砖");    id3.add("");
        id0.add("98:2");    id1.add("minecraft:stonebrick:2");    id2.add("裂石砖");    id3.add("");
        id0.add("98:3");    id1.add("minecraft:stonebrick:3");    id2.add("圈石砖");    id3.add("");
        id0.add("99");    id1.add("minecraft:brown_mushroom_block");    id2.add("棕色巨型蘑菇");    id3.add("");
        id0.add("100");    id1.add("minecraft:red_mushroom_block");    id2.add("红色巨型蘑菇");    id3.add("");
        id0.add("101");    id1.add("minecraft:iron_bars");    id2.add("铁栏杆");    id3.add("");
        id0.add("102");    id1.add("minecraft:glass_pane");    id2.add("玻璃板");    id3.add("");
        id0.add("103");    id1.add("minecraft:melon_block");    id2.add("西瓜");    id3.add("");
        id0.add("106");    id1.add("minecraft:vine");    id2.add("藤蔓");    id3.add("");
        id0.add("107");    id1.add("minecraft:fence_gate");    id2.add("栅栏门");    id3.add("");
        id0.add("108");    id1.add("minecraft:brick_stairs");    id2.add("砖块楼梯");    id3.add("");
        id0.add("109");    id1.add("minecraft:stone_brick_stairs");    id2.add("石砖楼梯");    id3.add("");
        id0.add("110");    id1.add("minecraft:mycelium");    id2.add("菌丝");    id3.add("");
        id0.add("111");    id1.add("minecraft:waterlily");    id2.add("睡莲");    id3.add("");
        id0.add("112");    id1.add("minecraft:nether_brick");    id2.add("地狱砖块");    id3.add("");
        id0.add("113");    id1.add("minecraft:nether_brick_fence");    id2.add("地狱砖栅栏");    id3.add("");
        id0.add("114");    id1.add("minecraft:nether_brick_stairs");    id2.add("地狱砖楼梯");    id3.add("");
        id0.add("116");    id1.add("minecraft:enchanting_table");    id2.add("附魔台");    id3.add("");
        id0.add("120");    id1.add("minecraft:end_portal_frame");    id2.add("末地传送门框架");    id3.add("");
        id0.add("121");    id1.add("minecraft:end_stone");    id2.add("末地石");    id3.add("");
        id0.add("122");    id1.add("minecraft:dragon_egg");    id2.add("龙蛋");    id3.add("");
        id0.add("123");    id1.add("minecraft:redstone_lamp");    id2.add("红石灯(未开启)");    id3.add("");
        id0.add("126");    id1.add("minecraft:wooden_slab");    id2.add("橡木台阶");    id3.add("");
        id0.add("126:1");    id1.add("minecraft:wooden_slab:1");    id2.add("云杉台阶");    id3.add("");
        id0.add("126:2");    id1.add("minecraft:wooden_slab:2");    id2.add("白桦台阶");    id3.add("");
        id0.add("126:3");    id1.add("minecraft:wooden_slab:3");    id2.add("丛林台阶");    id3.add("");
        id0.add("126:4");    id1.add("minecraft:wooden_slab:4");    id2.add("金合欢台阶");    id3.add("");
        id0.add("126:5");    id1.add("minecraft:wooden_slab:5");    id2.add("深色橡木台阶");    id3.add("");
        id0.add("128");    id1.add("minecraft:sandstone_stairs");    id2.add("沙石楼梯");    id3.add("");
        id0.add("129");    id1.add("minecraft:emerald_ore");    id2.add("绿宝石矿石");    id3.add("");
        id0.add("130");    id1.add("minecraft:ender_chest");    id2.add("末影箱");    id3.add("");
        id0.add("131");    id1.add("minecraft:tripwire_hook");    id2.add("绊线钩");    id3.add("");
        id0.add("133");    id1.add("minecraft:emerald_block");    id2.add("绿宝石块");    id3.add("");
        id0.add("134");    id1.add("minecraft:spruce_stairs");    id2.add("云杉楼梯");    id3.add("");
        id0.add("135");    id1.add("minecraft:birch_stairs");    id2.add("桦木楼梯");    id3.add("");
        id0.add("136");    id1.add("minecraft:jungle_stairs");    id2.add("丛林楼梯");    id3.add("");
        id0.add("137");    id1.add("minecraft:command_block");    id2.add("命令方块");    id3.add("");
        id0.add("138");    id1.add("minecraft:beacon");    id2.add("信标");    id3.add("");
        id0.add("139");    id1.add("minecraft:cobblestone_wall");    id2.add("圆石墙");    id3.add("");
        id0.add("139:1");    id1.add("minecraft:cobblestone_wall:1");    id2.add("苔石墙");    id3.add("");
        id0.add("143");    id1.add("minecraft:wooden_button");    id2.add("木质按钮");    id3.add("");
        id0.add("145");    id1.add("minecraft:anvil");    id2.add("铁砧");    id3.add("");
        id0.add("146");    id1.add("minecraft:trapped_chest");    id2.add("陷阱箱");    id3.add("");
        id0.add("147");    id1.add("minecraft:light_weighted_pressure_plate");    id2.add("轻质测重压力板");    id3.add("");
        id0.add("148");    id1.add("minecraft:heavy_weighted_pressure_plate");    id2.add("重质测重压力板");    id3.add("");
        id0.add("151");    id1.add("minecraft:daylight_detector");    id2.add("阳光传感器");    id3.add("");
        id0.add("152");    id1.add("minecraft:redstone_block");    id2.add("红石块");    id3.add("");
        id0.add("153");    id1.add("minecraft:quartz_ore");    id2.add("下界石英矿石");    id3.add("");
        id0.add("154");    id1.add("minecraft:hopper");    id2.add("漏斗");    id3.add("");
        id0.add("155");    id1.add("minecraft:quartz_block");    id2.add("石英块");    id3.add("");
        id0.add("156");    id1.add("minecraft:quartz_stairs");    id2.add("石英楼梯");    id3.add("");
        id0.add("157");    id1.add("minecraft:activator_rail");    id2.add("激活铁轨");    id3.add("");
        id0.add("158");    id1.add("minecraft:dropper");    id2.add("投掷器");    id3.add("");
        id0.add("159:<color>");    id1.add("minecraft:stained_hardened_clay:<color>");    id2.add("染色粘土");    id3.add("");
        id0.add("160");    id1.add("minecraft:stained_glass_pane");    id2.add("染色玻璃板");    id3.add("");
        id0.add("161");    id1.add("minecraft:leaves2");    id2.add("金合欢树叶");    id3.add("");
        id0.add("161:1");    id1.add("minecraft:leaves2:1");    id2.add("深色橡树树叶");    id3.add("");
        id0.add("161:2");    id1.add("minecraft:leaves2:2");    id2.add("金合欢树叶 (无腐烂)");    id3.add("");
        id0.add("161:3");    id1.add("minecraft:leaves2:3");    id2.add("深色橡树树叶 (无腐烂)");    id3.add("");
        id0.add("161:4");    id1.add("minecraft:leaves2:4");    id2.add("金合欢树叶 (检查腐烂)");    id3.add("");
        id0.add("161:5");    id1.add("minecraft:leaves2:5");    id2.add("深色橡树树叶 (检查腐烂)");    id3.add("");
        id0.add("161:6");    id1.add("minecraft:leaves2:6");    id2.add("金合欢树叶 (无腐烂和检查腐烂)");    id3.add("");
        id0.add("161:7");    id1.add("minecraft:leaves2:7");    id2.add("深色橡树树叶 (无腐烂和检查腐烂)");    id3.add("");
        id0.add("162");    id1.add("minecraft:log2");    id2.add("金合欢木（面朝上/下）");    id3.add("");
        id0.add("162:1");    id1.add("minecraft:log2:1");    id2.add("深色橡木（面朝上/下）");    id3.add("");
        id0.add("162:4");    id1.add("minecraft:log2:4");    id2.add("金合欢木（面朝东/西）");    id3.add("");
        id0.add("162:5");    id1.add("minecraft:log2:5");    id2.add("深色橡木（面朝东/西）");    id3.add("");
        id0.add("162:8");    id1.add("minecraft:log2:8");    id2.add("金合欢木（面朝南/北）");    id3.add("");
        id0.add("162:9");    id1.add("minecraft:log2:9");    id2.add("深色橡木（面朝南/北）");    id3.add("");
        id0.add("162:12");    id1.add("minecraft:log2:12");    id2.add("金合欢木（只有树皮）");    id3.add("");
        id0.add("162:13");    id1.add("minecraft:log2:13");    id2.add("深色橡木（只有树皮）");    id3.add("");
        id0.add("163");    id1.add("minecraft:acacia_stairs");    id2.add("金合欢楼梯");    id3.add("");
        id0.add("164");    id1.add("minecraft:dark_oak_stairs");    id2.add("深色橡木楼梯");    id3.add("");
        id0.add("165");    id1.add("minecraft:slime");    id2.add("粘液块");    id3.add("");
        id0.add("166");    id1.add("minecraft:barrier");    id2.add("屏障");    id3.add("");
        id0.add("167");    id1.add("minecraft:iron_trapdoor");    id2.add("铁活板门");    id3.add("");
        id0.add("168");    id1.add("minecraft:prismarine");    id2.add("海晶石");    id3.add("");
        id0.add("169");    id1.add("minecraft:sea_lantern");    id2.add("海晶灯");    id3.add("");
        id0.add("170");    id1.add("minecraft:hay_block");    id2.add("干草块");    id3.add("");
        id0.add("171:<color>");    id1.add("minecraft:carpet:<color>");    id2.add("地毯");    id3.add("");
        id0.add("172");    id1.add("minecraft:hardened_clay");    id2.add("硬化粘土");    id3.add("");
        id0.add("173");    id1.add("minecraft:coal_block");    id2.add("煤炭块");    id3.add("");
        id0.add("174");    id1.add("minecraft:packed_ice");    id2.add("浮冰");    id3.add("");
        id0.add("179");    id1.add("minecraft:red_sandstone");    id2.add("红沙石");    id3.add("");
        id0.add("180");    id1.add("minecraft:red_sandstone_stairs");    id2.add("红沙石楼梯");    id3.add("");
        id0.add("182");    id1.add("minecraft:stone_slab2");    id2.add("红沙石台阶");    id3.add("");
        id0.add("183");    id1.add("minecraft:spruce_fence_gate");    id2.add("云杉木栅栏门");    id3.add("");
        id0.add("184");    id1.add("minecraft:birch_fence_gate");    id2.add("白桦木栅栏门");    id3.add("");
        id0.add("185");    id1.add("minecraft:jungle_fence_gate");    id2.add("丛林木栅栏门");    id3.add("");
        id0.add("186");    id1.add("minecraft:dark_oak_fence_gate");    id2.add("深色橡木栅栏门");    id3.add("");
        id0.add("187");    id1.add("minecraft:acacia_fence_gate");    id2.add("金合欢栅栏门");    id3.add("");
        id0.add("188");    id1.add("minecraft:spruce_fence");    id2.add("云杉木栅栏");    id3.add("");
        id0.add("189");    id1.add("minecraft:birch_fence");    id2.add("白桦木栅栏");    id3.add("");
        id0.add("190");    id1.add("minecraft:jungle_fence");    id2.add("丛林木栅栏");    id3.add("");
        id0.add("191");    id1.add("minecraft:dark_oak_fence");    id2.add("深色橡木栅栏");    id3.add("");
        id0.add("192");    id1.add("minecraft:acacia_fence");    id2.add("金合欢栅栏");    id3.add("");
        id0.add("193");    id1.add("minecraft:spruce_door");    id2.add("云杉木门");    id3.add("");
        id0.add("194");    id1.add("minecraft:birch_door");    id2.add("白桦木门");    id3.add("");
        id0.add("195");    id1.add("minecraft:jungle_door");    id2.add("丛林木门");    id3.add("");
        id0.add("196");    id1.add("minecraft:acacia_door");    id2.add("金合欢木门");    id3.add("");
        id0.add("197");    id1.add("minecraft:dark_oak_door");    id2.add("深色橡木门");    id3.add("");
        if (id == 0) {
            return id0;
        } else if (id == 1) {
            return id1;
        } else if (id == 2) {
            return id2;
        } else if (id == 3) {
            return id3;
        }
        return null;
    }
    
    
    
    
}
