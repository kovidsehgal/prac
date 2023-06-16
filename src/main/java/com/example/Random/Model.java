package com.example.Random;


public class Model {
    String joke;

    public Model(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return joke;
    }
}
