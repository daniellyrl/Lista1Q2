package com.company;

public class Aluno {
    private double n1;
    private double n2;
    private double media;

    public void calculomedia(){
        double media = (n1 + n2)/2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    }
