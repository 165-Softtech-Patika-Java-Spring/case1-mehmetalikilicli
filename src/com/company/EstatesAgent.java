package com.company;


import java.util.ArrayList;
import java.util.List;

public class EstatesAgent {

    static List<House> houseList = new ArrayList<House>();
    static List<Villa> villaList = new ArrayList<Villa>();
    static List<SummerHouse> summerHouseList = new ArrayList<SummerHouse>();

    static House house1 = new House(120, 450000, 3) ;
    static House house2 = new House(140, 650000, 4) ;
    static House house3 = new House(90, 350000, 2) ;
    static House house4 = new House(70, 250000, 1) ;

    static Villa villa1 = new Villa(180, 750000,5);
    static Villa villa2 = new Villa(200, 1000000,5);
    static Villa villa3 = new Villa(250, 1500000,6);
    static Villa villa4 = new Villa(400, 2000000,8);

    static SummerHouse summerHouse1 = new SummerHouse(150,700000,4);
    static SummerHouse summerHouse2 = new SummerHouse(200,1000000,6);
    static SummerHouse summerHouse3 = new SummerHouse(175,850000,5);
    static SummerHouse summerHouse4 = new SummerHouse(400,2000000,7);




    static void houseListCreater(){

        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);
        houseList.add(house4);
    }
    static void villaListCreater(){

        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);
        villaList.add(villa4);
    }

    static void summerHouseListCreater(){

        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);
        villaList.add(villa4);
    }



    static List<House> getHouseList(){

        return houseList;
    }
    static List<Villa> getVillaList(){

        return villaList;
    }
    static List<SummerHouse> getSummerHouseListList(){

        return summerHouseList;
    }



}
