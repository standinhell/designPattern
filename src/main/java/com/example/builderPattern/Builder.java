package com.example.builderPattern;

import com.example.builderPattern.ceiling.LevelOneCeiling;
import com.example.builderPattern.ceiling.LevelTwoCeiling;
import com.example.builderPattern.coat.DuluxCoat;
import com.example.builderPattern.coat.LiBangCoat;
import com.example.builderPattern.floor.ShengXiangFloor;
import com.example.builderPattern.tile.DongPengTile;
import com.example.builderPattern.tile.MarcoPoloTile;

public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling()).appendCoat(new DuluxCoat()).appendFloor(new ShengXiangFloor());
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢⽥田园").appendCeiling(new LevelTwoCeiling()).appendCoat(new LiBangCoat()).appendTile(new MarcoPoloTile());
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling()).appendCoat(new LiBangCoat()).appendTile(new DongPengTile());
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        System.out.println(builder.levelOne(132.52D).getDetail());
        System.out.println(builder.levelTwo(98.25D).getDetail());
        System.out.println(builder.levelThree(85.43D).getDetail());
    }
}