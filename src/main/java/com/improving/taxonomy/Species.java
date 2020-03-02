package com.improving.taxonomy;

public abstract class Species extends Genus{
    String speciesName;

    public Species(String familyName, String genusName, String speciesName) {
        super(familyName, genusName);
        this.speciesName = speciesName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public abstract String speak();
    public abstract void description();

}
