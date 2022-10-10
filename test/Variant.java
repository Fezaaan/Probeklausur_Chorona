package test;

public enum Variant{
    ALPHA("Alpha","B.1.1.7"),
    BETA("Beta","B.1.351"),
    GAMMA("Gamma", "P.1"),
    DELTA("Delta","B.1.617"),
    FETA("Feta", "O.u.z.o"),
    LAMBDA("Lambda", "C.37"),
    OMICRON("Omicron","B.1.1.529");
    private String label;
    private String designation;

    public String getDesignation() {
        return designation;
    }

    public String getLabel() {
        return label;
    }

    Variant(String label, String designation){
        this.label= label;
        this.designation=designation;
    }
}
