package com.company;

import java.util.List;

public class Service {



    int totalHousePrice() {
        int temp =0;

        EstatesAgent.houseListCreater();

        List<House> serviceHouseList = EstatesAgent.getHouseList();
        for (int i = 0 ;i< serviceHouseList.size();i++){
           temp += serviceHouseList.get(i).getPrice();
        }
        return temp;
    }

    int totalVillaPrice() {
        int temp =0;

        EstatesAgent.villaListCreater();

        List<Villa> serviceVillaList = EstatesAgent.getVillaList();
        for (int i = 0 ;i< serviceVillaList.size();i++){
            temp += serviceVillaList.get(i).getPrice();
        }
        return temp;
    }

    int totalSummerHousePrice() {
        int temp =0;

        EstatesAgent.summerHouseListCreater();

        List<SummerHouse> serviceSummerHouseList = EstatesAgent.getSummerHouseListList();
        for (int i = 0 ;i< serviceSummerHouseList.size();i++){
            temp += serviceSummerHouseList.get(i).getPrice();
        }
        return temp;
    }

    int totalEstatePrice() {
        int temp =0;

        temp += totalHousePrice();
        temp += totalVillaPrice();
        temp += totalSummerHousePrice();
       return temp;
    }

    int averageHouseArea(){
    int temp=0;

        List<House> serviceHouseList = EstatesAgent.getHouseList();
        for (int i = 0 ;i< serviceHouseList.size();i++){
            temp += serviceHouseList.get(i).getArea();

            temp = temp/serviceHouseList.size();
        }
        return temp;
    }


    int averageVillaArea(){
        int temp=0;

        List<Villa> serviceVillaList = EstatesAgent.getVillaList();
        for (int i = 0 ;i< serviceVillaList.size();i++){
            temp += serviceVillaList.get(i).getArea();

            temp = temp/serviceVillaList.size();
        }
        return temp;
    }



    int averageSummerHouseArea(){
        int temp=0;

        List<SummerHouse> serviceSummerHouseList = EstatesAgent.getSummerHouseListList();
        for (int i = 0 ;i< serviceSummerHouseList.size();i++){
            temp += serviceSummerHouseList.get(i).getArea();

            temp = temp/serviceSummerHouseList.size();
        }
        return temp;
    }

    int averageEstimatesArea(){
        int temp=0;

        temp = averageHouseArea()+averageVillaArea()+averageSummerHouseArea();



        return temp/3;
    }







    int totalVillaPrice(List<Villa> List) {
        int temp =0;

        for (int i = 0 ;i< List.size();i++){

            temp += List.get(i).getArea();

        }

        return temp;
    }




}
