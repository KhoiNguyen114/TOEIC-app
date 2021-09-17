package com.example.doan_laptrinhdidong.Model;

import java.io.Serializable;

public class Part7 implements Serializable {
    String doanVan;
    String cauDe;
    String dapAnA;
    String dapAnB;
    String dapAnC;
    String dapAnD;
    String dapAnChon;
    String dapAnDung;
    int id;
    BaiThiThu baiThiThu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BaiThiThu getBaiThiThu() {
        return baiThiThu;
    }

    public void setBaiThiThu(BaiThiThu baiThiThu) {
        this.baiThiThu = baiThiThu;
    }

    public String getDoanVan() {
        return doanVan;
    }

    public void setDoanVan(String doanVan) {
        this.doanVan = doanVan;
    }

    public String getCauDe() {
        return cauDe;
    }

    public void setCauDe(String cauDe) {
        this.cauDe = cauDe;
    }

    public String getDapAnA() {
        return dapAnA;
    }

    public void setDapAnA(String dapAnA) {
        this.dapAnA = dapAnA;
    }

    public String getDapAnB() {
        return dapAnB;
    }

    public void setDapAnB(String dapAnB) {
        this.dapAnB = dapAnB;
    }

    public String getDapAnC() {
        return dapAnC;
    }

    public void setDapAnC(String dapAnC) {
        this.dapAnC = dapAnC;
    }

    public String getDapAnD() {
        return dapAnD;
    }

    public void setDapAnD(String dapAnD) {
        this.dapAnD = dapAnD;
    }

    public String getDapAnChon() {
        return dapAnChon;
    }

    public void setDapAnChon(String dapAnChon) {
        this.dapAnChon = dapAnChon;
    }

    public String getDapAnDung() {
        return dapAnDung;
    }

    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    public Part7(String doanVan, String cauDe, String dapAnA, String dapAnB, String dapAnC, String dapAnD, String dapAnChon, String dapAnDung, BaiThiThu baiThiThu) {
        this.doanVan = doanVan;
        this.cauDe = cauDe;
        this.dapAnA = dapAnA;
        this.dapAnB = dapAnB;
        this.dapAnC = dapAnC;
        this.dapAnD = dapAnD;
        this.dapAnChon = dapAnChon;
        this.dapAnDung = dapAnDung;
        this.baiThiThu = baiThiThu;
    }

    public Part7(String doanVan, String cauDe, String dapAnA, String dapAnB, String dapAnC, String dapAnD, String dapAnChon, String dapAnDung, int id, BaiThiThu baiThiThu) {
        this.doanVan = doanVan;
        this.cauDe = cauDe;
        this.dapAnA = dapAnA;
        this.dapAnB = dapAnB;
        this.dapAnC = dapAnC;
        this.dapAnD = dapAnD;
        this.dapAnChon = dapAnChon;
        this.dapAnDung = dapAnDung;
        this.id = id;
        this.baiThiThu = baiThiThu;
    }
}
