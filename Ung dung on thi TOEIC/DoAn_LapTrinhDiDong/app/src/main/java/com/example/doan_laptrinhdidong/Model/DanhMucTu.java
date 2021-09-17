package com.example.doan_laptrinhdidong.Model;

import java.io.Serializable;

public class DanhMucTu implements Serializable {
    int idDanhMuc;
    String tenDanhMuc;

    public int getIdDanhMuc() {
        return idDanhMuc;
    }

    public void setIdDanhMuc(int idDanhMuc) {
        this.idDanhMuc = idDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public DanhMucTu(int idDanhMuc, String tenDanhMuc) {
        this.idDanhMuc = idDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
    }
}
