package com.composition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeweleryBoxTest {

    @Test
    void getJeweleryCount() {
        Jewelery diamond_ring = new Jewelery(100);

        JeweleryBox jewelleryBox = new JeweleryBox(diamond_ring);
        Jewelery neckless = new Jewelery(200);

        JeweleryBox jewelleryBox1 = new JeweleryBox(neckless, jewelleryBox);

        assertEquals(2,jewelleryBox1.getJeweleryCount());
    }

    @Test
    void getJeweleryCount2() {
        JeweleryBox _5thLevelBox = new JeweleryBox();

        JeweleryBox _4thLevelBox = new JeweleryBox(_5thLevelBox);

        Jewelery nacklace = new Jewelery(10);
        JeweleryBox _3rdLevelBox = new JeweleryBox(nacklace, _4thLevelBox);

        Jewelery ring = new Jewelery(20);
        JeweleryBox _2ndLevelBox = new JeweleryBox(ring, _3rdLevelBox);

        JeweleryBox _1stLevelBox = new JeweleryBox(_2ndLevelBox);

        assertEquals(2, _1stLevelBox.getJeweleryCount());
    }


}
