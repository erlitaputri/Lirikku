package com.erlita.lirikku.models;

public class BandImage {
    public String image;
    public String name;
    public int lirik;
    public String judul;
    public String linkweb;
    public String band;

    public BandImage() {
        this.image = image;
        this.name = name;
        this.lirik = lirik;
        this.judul =judul;
        this.linkweb = linkweb;
    }

    public BandImage(String image, String name) {
        this.image = image;
        this.name = name;
    }

    public BandImage(int lirik, String judul) {
        this.lirik = lirik;
        this.judul = judul;
    }

    public BandImage(String band, String judul, String image){
        this.band = band;
        this.judul = judul;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLirik() {
        return lirik;
    }

    public void setLirik(int lirik) {
        this.lirik = lirik;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getLinkweb() {
        return linkweb;
    }

    public void setLink(String linkweb) {
        this.linkweb = linkweb;
    }
}
