package com.erlita.lirikku.models;

public class BandImage {
    public String logo;
    public String name;
    public String linkweb;

    public BandImage(String logo, String name, String linkweb) {
        this.logo = logo;
        this.name = name;
        this.linkweb = linkweb;
    }

    public String getLinkweb() {
        return linkweb;
    }

    public void setLinkweb(String linkweb) {
        this.linkweb = linkweb;
    }


    public BandImage(String logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
