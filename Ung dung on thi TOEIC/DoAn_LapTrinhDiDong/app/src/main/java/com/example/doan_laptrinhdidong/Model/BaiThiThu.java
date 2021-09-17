package com.example.doan_laptrinhdidong.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class BaiThiThu implements Serializable {
    String tenDeThi;
    ArrayList<Part1> arrayPart1;
    ArrayList<Nghe> arrayPart2;
    ArrayList<Nghe> arrayPart3;
    ArrayList<Nghe> arrayPart4;
    ArrayList<DocHieu> arrayPart5;
    ArrayList<DocHieu> arrayPart6;
    ArrayList<Part7> arrayPart7;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDeThi() {
        return tenDeThi;
    }

    public void setTenDeThi(String tenDeThi) {
        this.tenDeThi = tenDeThi;
    }

    public ArrayList<Part1> getArrayPart1() {
        return arrayPart1;
    }

    public void setArrayPart1(ArrayList<Part1> arrayPart1) {
        this.arrayPart1 = arrayPart1;
    }

    public ArrayList<Nghe> getArrayPart2() {
        return arrayPart2;
    }

    public void setArrayPart2(ArrayList<Nghe> arrayPart2) {
        this.arrayPart2 = arrayPart2;
    }

    public ArrayList<Nghe> getArrayPart3() {
        return arrayPart3;
    }

    public void setArrayPart3(ArrayList<Nghe> arrayPart3) {
        this.arrayPart3 = arrayPart3;
    }

    public ArrayList<Nghe> getArrayPart4() {
        return arrayPart4;
    }

    public void setArrayPart4(ArrayList<Nghe> arrayPart4) {
        this.arrayPart4 = arrayPart4;
    }

    public ArrayList<DocHieu> getArrayPart5() {
        return arrayPart5;
    }

    public void setArrayPart5(ArrayList<DocHieu> arrayPart5) {
        this.arrayPart5 = arrayPart5;
    }

    public ArrayList<DocHieu> getArrayPart6() {
        return arrayPart6;
    }

    public void setArrayPart6(ArrayList<DocHieu> arrayPart6) {
        this.arrayPart6 = arrayPart6;
    }

    public ArrayList<Part7> getArrayPart7() {
        return arrayPart7;
    }

    public void setArrayPart7(ArrayList<Part7> arrayPart7) {
        this.arrayPart7 = arrayPart7;
    }

    public BaiThiThu(String tenDeThi, ArrayList<Part1> arrayPart1, ArrayList<Nghe> arrayPart2, ArrayList<Nghe> arrayPart3, ArrayList<Nghe> arrayPart4, ArrayList<DocHieu> arrayPart5, ArrayList<DocHieu> arrayPart6, ArrayList<Part7> arrayPart7) {
        this.tenDeThi = tenDeThi;
        this.arrayPart1 = arrayPart1;
        this.arrayPart2 = arrayPart2;
        this.arrayPart3 = arrayPart3;
        this.arrayPart4 = arrayPart4;
        this.arrayPart5 = arrayPart5;
        this.arrayPart6 = arrayPart6;
        this.arrayPart7 = arrayPart7;
    }

    public BaiThiThu(String tenDeThi, int id) {
        this.tenDeThi = tenDeThi;
        this.id = id;
    }
}
