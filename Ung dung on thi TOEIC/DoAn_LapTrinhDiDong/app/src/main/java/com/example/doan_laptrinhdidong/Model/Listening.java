package com.example.doan_laptrinhdidong.Model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;

import com.example.doan_laptrinhdidong.R;

import java.io.IOException;
import java.io.Serializable;

public class Listening implements Serializable {
    String IDAudio;
    String cauDe;
    String dapAnA;
    String dapAnB;
    String dapAnC;
    String dapAnD;
    String dapAnDung;

    public String getIDAudio() {
        return IDAudio;
    }

    public void setIDAudio(String IDAudio) {
        this.IDAudio = IDAudio;
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

    public String getDapAnDung() {
        return dapAnDung;
    }

    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    public Listening(String IDAudio, String cauDe, String dapAnA, String dapAnB, String dapAnC, String dapAnD, String dapAnDung) {
        this.IDAudio = IDAudio;
        this.cauDe = cauDe;
        this.dapAnA = dapAnA;
        this.dapAnB = dapAnB;
        this.dapAnC = dapAnC;
        this.dapAnD = dapAnD;
        this.dapAnDung = dapAnDung;
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
