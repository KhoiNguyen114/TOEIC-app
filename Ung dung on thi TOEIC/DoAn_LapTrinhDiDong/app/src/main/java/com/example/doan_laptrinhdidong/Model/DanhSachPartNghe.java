package com.example.doan_laptrinhdidong.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class DanhSachPartNghe implements Serializable {
    int part;
    String moTa;

    public int getPart() {
        return part;
    }

    public void setPart(int part) {
        this.part = part;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public DanhSachPartNghe(int part, String moTa) {
        this.part = part;
        this.moTa = moTa;
    }
}
