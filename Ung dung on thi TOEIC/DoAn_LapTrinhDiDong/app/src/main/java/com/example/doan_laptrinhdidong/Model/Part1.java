package com.example.doan_laptrinhdidong.Model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

public class Part1 implements Serializable {
    String IDAudio;
    String hinh;
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

    public String getIDAudio() {
        return IDAudio;
    }

    public void setIDAudio(String IDAudio) {
        this.IDAudio = IDAudio;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
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

    public Part1(String IDAudio, String hinh, String dapAnA, String dapAnB, String dapAnC, String dapAnD, String dapAnChon, String dapAnDung, BaiThiThu baiThiThu) {
        this.IDAudio = IDAudio;
        this.hinh = hinh;
        this.dapAnA = dapAnA;
        this.dapAnB = dapAnB;
        this.dapAnC = dapAnC;
        this.dapAnD = dapAnD;
        this.dapAnChon = dapAnChon;
        this.dapAnDung = dapAnDung;
        this.baiThiThu = baiThiThu;
    }

    public Part1(String IDAudio, String hinh, String dapAnA, String dapAnB, String dapAnC, String dapAnD, String dapAnChon, String dapAnDung, int id, BaiThiThu baiThiThu) {
        this.IDAudio = IDAudio;
        this.hinh = hinh;
        this.dapAnA = dapAnA;
        this.dapAnB = dapAnB;
        this.dapAnC = dapAnC;
        this.dapAnD = dapAnD;
        this.dapAnChon = dapAnChon;
        this.dapAnDung = dapAnDung;
        this.id = id;
        this.baiThiThu = baiThiThu;
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

    public static MediaPlayer playSong(Context context, String fileName)
    {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            AssetFileDescriptor assetFileDescriptor = context.getAssets().openFd(fileName);
            mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(),assetFileDescriptor.getStartOffset(),assetFileDescriptor.getLength());
            assetFileDescriptor.close();

            mediaPlayer.prepare();
            mediaPlayer.setVolume(1f, 1f);
            mediaPlayer.setLooping(false);
            return mediaPlayer;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
