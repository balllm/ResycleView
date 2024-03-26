package com.example.resycleview;

public class MyRecycleView {
    private int image;
    private String title;
    private String capital;


    public MyRecycleView(int image, String title, String capital) {
        this.image = image;
        this.title = title;
        this.capital = capital;
    }


    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getCapital() {
        return capital;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
