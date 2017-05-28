package com.example.sudhakar.electricitycontrol;

import java.util.Arrays;

/**
 * Created by sudhakar on 5/23/2017.
 */

public class Room {
    private String id, roomNo, floorNo, blockName;
    private boolean allfans,allfanslights, alllights, fan1, fan2, fan3, fan4, fan5, fan6, fan7,
            light1, light2, light3, light4, light5, light6;
   // private boolean All[];

    public Room() {
      //  Arrays.fill(All, Boolean.FALSE);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public boolean isAllfans() {
        return allfans;
    }

    public void setAllfans(boolean allfans) {
        this.allfans = allfans;
    }

    public boolean isAllfanslights() {
        return allfanslights;
    }

    public void setAllfanslights(boolean allfanslights) {
        this.allfanslights = allfanslights;
    }

    public boolean isAlllights() {
        return alllights;
    }

    public void setAlllights(boolean alllights) {
        this.alllights = alllights;
    }

    public boolean isFan1() {
        return fan1;
    }

    public void setFan1(boolean fan1) {
        this.fan1 = fan1;
    }

    public boolean isFan2() {
        return fan2;
    }

    public void setFan2(boolean fan2) {
        this.fan2 = fan2;
    }

    public boolean isFan3() {
        return fan3;
    }

    public void setFan3(boolean fan3) {
        this.fan3 = fan3;
    }

    public boolean isFan4() {
        return fan4;
    }

    public void setFan4(boolean fan4) {
        this.fan4 = fan4;
    }

    public boolean isFan5() {
        return fan5;
    }

    public void setFan5(boolean fan5) {
        this.fan5 = fan5;
    }

    public boolean isFan6() {
        return fan6;
    }

    public void setFan6(boolean fan6) {
        this.fan6 = fan6;
    }

    public boolean isFan7() {
        return fan7;
    }

    public void setFan7(boolean fan7) {
        this.fan7 = fan7;
    }

    public boolean isLight1() {
        return light1;
    }

    public void setLight1(boolean light1) {
        this.light1 = light1;
    }

    public boolean isLight2() {
        return light2;
    }

    public void setLight2(boolean light2) {
        this.light2 = light2;
    }

    public boolean isLight3() {
        return light3;
    }

    public void setLight3(boolean light3) {
        this.light3 = light3;
    }

    public boolean isLight4() {
        return light4;
    }

    public void setLight4(boolean light4) {
        this.light4 = light4;
    }

    public boolean isLight5() {
        return light5;
    }

    public void setLight5(boolean light5) {
        this.light5 = light5;
    }

    public boolean isLight6() {
        return light6;
    }

    public void setLight6(boolean light6) {
        this.light6 = light6;
    }
/*
    public boolean[] getAll() {

        All[0] = isAllFans();
        All[1] = isAllFansLights();
        All[2] = isAllLights();
        All[3] = isFan1();
        All[4] = isFan2();
        All[5] = isFan3();
        All[6] = isFan4();
        All[7] = isFan5();
        All[8] = isFan6();
        All[9] = isFan7();
        All[10] = isLight1();
        All[11] = isLight2();
        All[12] = isLight3();
        All[13] = isLight4();
        All[14] = isLight5();
        All[15] = isLight6();
        return All;
    }

    public void setAll(boolean[] all) {
        All = all;
    }*/
}
