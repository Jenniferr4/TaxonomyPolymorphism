package com.improving.taxonomy;

public abstract class Family {
    String familyName;

    public Family(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

}
