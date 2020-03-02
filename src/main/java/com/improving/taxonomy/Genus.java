package com.improving.taxonomy;

public abstract class Genus extends Family{
    String genusName;


    public Genus(String familyName, String genusName) {
        super(familyName);
        this.genusName = genusName;
    }

    public String getGenusName() {
        return genusName;
    }
}
