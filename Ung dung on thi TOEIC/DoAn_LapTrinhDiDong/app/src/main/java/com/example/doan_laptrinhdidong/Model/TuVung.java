package com.example.doan_laptrinhdidong.Model;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

public class TuVung implements Serializable {
    int id;
    String tu;
    String loaiTu;
    String nghia;
    DanhMucTu danhMucTu;

    public String getTu() {
        return tu;
    }

    public void setTu(String tu) {
        this.tu = tu;
    }

    public String getLoaiTu() {
        return loaiTu;
    }

    public void setLoaiTu(String loaiTu) {
        this.loaiTu = loaiTu;
    }

    public String getNghia() {
        return nghia;
    }

    public void setNghia(String nghia) {
        this.nghia = nghia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DanhMucTu getDanhMucTu() {
        return danhMucTu;
    }

    public void setDanhMucTu(DanhMucTu danhMucTu) {
        this.danhMucTu = danhMucTu;
    }

    public TuVung(String tu, String loaiTu, String nghia, DanhMucTu danhMucTu) {
        this.tu = tu;
        this.loaiTu = loaiTu;
        this.nghia = nghia;
        this.danhMucTu = danhMucTu;
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
