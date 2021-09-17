package com.example.doan_laptrinhdidong.Application;

import android.app.Application;
import android.os.CountDownTimer;

import com.example.doan_laptrinhdidong.Model.DocHieu;
import com.example.doan_laptrinhdidong.Model.Nghe;
import com.example.doan_laptrinhdidong.Model.Part1;
import com.example.doan_laptrinhdidong.Model.Part7;

import java.util.ArrayList;

public class AppTest extends Application {
    public CountDownTimer countDownTimer;
    public ArrayList<Part1> part1ArrayList;
    public ArrayList<Nghe> part2ArrayList;
    public ArrayList<Nghe> part3ArrayList;
    public ArrayList<Nghe> part4ArrayList;
    public ArrayList<DocHieu> part5ArrayList;
    public ArrayList<DocHieu> part6ArrayList;
    public ArrayList<Part7> part7ArrayList;

    public ArrayList<Part1> getPart1ArrayList() {
        return part1ArrayList;
    }

    public void setPart1ArrayList(ArrayList<Part1> part1ArrayList) {
        this.part1ArrayList = part1ArrayList;
    }

    public ArrayList<Nghe> getPart2ArrayList() {
        return part2ArrayList;
    }

    public void setPart2ArrayList(ArrayList<Nghe> part2ArrayList) {
        this.part2ArrayList = part2ArrayList;
    }

    public ArrayList<Nghe> getPart3ArrayList() {
        return part3ArrayList;
    }

    public void setPart3ArrayList(ArrayList<Nghe> part3ArrayList) {
        this.part3ArrayList = part3ArrayList;
    }

    public ArrayList<Nghe> getPart4ArrayList() {
        return part4ArrayList;
    }

    public void setPart4ArrayList(ArrayList<Nghe> part4ArrayList) {
        this.part4ArrayList = part4ArrayList;
    }

    public ArrayList<DocHieu> getPart5ArrayList() {
        return part5ArrayList;
    }

    public void setPart5ArrayList(ArrayList<DocHieu> part5ArrayList) {
        this.part5ArrayList = part5ArrayList;
    }

    public ArrayList<DocHieu> getPart6ArrayList() {
        return part6ArrayList;
    }

    public void setPart6ArrayList(ArrayList<DocHieu> part6ArrayList) {
        this.part6ArrayList = part6ArrayList;
    }

    public ArrayList<Part7> getPart7ArrayList() {
        return part7ArrayList;
    }

    public void setPart7ArrayList(ArrayList<Part7> part7ArrayList) {
        this.part7ArrayList = part7ArrayList;
    }
}
