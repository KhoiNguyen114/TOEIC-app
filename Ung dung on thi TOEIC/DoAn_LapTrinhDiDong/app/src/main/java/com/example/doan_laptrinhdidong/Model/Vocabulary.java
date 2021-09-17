package com.example.doan_laptrinhdidong.Model;

import java.io.Serializable;

public class Vocabulary implements Serializable {
    String cauDe;
    String dapAnA;
    String dapAnB;
    String dapAnC;
    String dapAnD;
    String dapAnDung;

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

    public String getDapAnDung() {
        return dapAnDung;
    }

    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    public Vocabulary(String cauDe, String dapAnA, String dapAnB, String dapAnC, String dapAnD, String dapAnDung) {
        this.cauDe = cauDe;
        this.dapAnA = dapAnA;
        this.dapAnB = dapAnB;
        this.dapAnC = dapAnC;
        this.dapAnD = dapAnD;
        this.dapAnDung = dapAnDung;
    }
}
