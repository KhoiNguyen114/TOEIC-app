package com.example.doan_laptrinhdidong.Model;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

public class Grammar implements Serializable {
    String loaiNguPhap;
    String cauDe;
    String dapAnA;
    String dapAnB;
    String dapAnC;
    String dapAnD;
    String dapAnDung;

    public String getDapAnDung() {
        return dapAnDung;
    }

    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    public String getLoaiNguPhap() {
        return loaiNguPhap;
    }

    public void setLoaiNguPhap(String loaiNguPhap) {
        this.loaiNguPhap = loaiNguPhap;
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

    public Grammar(String loaiNguPhap, String cauDe, String dapAnA, String dapAnB, String dapAnC, String dapAnD, String dapAnDung) {
        this.loaiNguPhap = loaiNguPhap;
        this.cauDe = cauDe;
        this.dapAnA = dapAnA;
        this.dapAnB = dapAnB;
        this.dapAnC = dapAnC;
        this.dapAnD = dapAnD;
        this.dapAnDung = dapAnDung;
    }

    public static Bitmap convertStringToBitmapFromAccess(Context context, String filename)
    {
        AssetManager assetManager = context.getAssets();
        try
        {
            InputStream is = assetManager.open(filename);
            Bitmap bitmap = BitmapFactory.decodeStream(is);
            return bitmap;
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
}
