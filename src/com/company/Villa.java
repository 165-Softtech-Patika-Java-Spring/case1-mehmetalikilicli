package com.company;

public class Villa {

    private int area ;
    private int price ;
    private int roomNum ;

    public Villa(int area, int price, int roomNum) {
        this.area = area;
        this.price = price;
        this.roomNum = roomNum;
    }


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
}
