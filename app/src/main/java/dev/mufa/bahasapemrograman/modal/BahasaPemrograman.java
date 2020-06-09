package dev.mufa.bahasapemrograman.modal;

import android.graphics.drawable.Drawable;

public class BahasaPemrograman {
    private int img;
    private String title;
    private String des;

    public BahasaPemrograman() {
    }

    public BahasaPemrograman(int img, String title, String des) {
        this.img = img;
        this.title = title;
        this.des = des;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
