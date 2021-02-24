package com.codewithdj.foodspice.Models;

public class RecipeModel {
    int pic;
    String text;

    //Creating constructor of both pic and text
    public RecipeModel(int pic, String text) {
        this.pic = pic;
        this.text = text;
    }

    //Generating getter and setter for above items
    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
