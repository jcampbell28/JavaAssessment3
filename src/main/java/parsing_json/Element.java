package parsing_json;


import java.util.ArrayList;

public class Element {
    private String elementName;
    private String appearance;
    private Double atomicMass;
    private Double boilingPoint;
    private String category;
    private String color;
    private Double density;
    private String discoveredBy;
    private Double meltingPoint;
    private Double molarHeatCapacity;
    private String namedBy;
    private int atomicNumber;
    private int periodRow;
    private String phase;
    private String source;
    private String spectralImage;
    private String summary;
    private String symbol;
    private int xPosition;
    private int yPosition;
    private ArrayList<Integer> numOfElectronsPerShell;

    public Element (String elementName, String appearance, Double atomicMass, Double boilingPoint, String category, String color, Double density, String discoveredBy,
                    Double meltingPoint, Double molarHeatCapacity, String namedBy, int atomicNumber, int periodRow, String phase, String source, String spectralImage,
                    String summary, String symbol, int xPosition, int yPosition, ArrayList<Integer> numOfElectronsPerShell){
        this.elementName = elementName;
        this.appearance = appearance;
        this.atomicMass = atomicMass;
        this.boilingPoint = boilingPoint;
        this.category = category;
        this.color = color;
        this.density = density;
        this.discoveredBy = discoveredBy;
        this.meltingPoint = meltingPoint;
        this.molarHeatCapacity = molarHeatCapacity;
        this.namedBy = namedBy;
        this.atomicNumber = atomicNumber;
        this.periodRow = periodRow;
        this.phase = phase;
        this.source = source;
        this.spectralImage = spectralImage;
        this.summary = summary;
        this.symbol = symbol;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.numOfElectronsPerShell = numOfElectronsPerShell;
    }

    public String getName() {
        return elementName;
    }

    public String getAppearance() {
        return appearance;
    }

    public Double getAtomic_mass() {
        return atomicMass;
    }

    public Double getBoil() {
        return boilingPoint;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public Double getDensity() {
        return density;
    }

    public String getDiscovered_by() {
        return discoveredBy;
    }

    public Double getMelt() {
        return meltingPoint;
    }

    public Double getMolar_heat() {
        return molarHeatCapacity;
    }

    public String getNamed_by() {
        return namedBy;
    }

    public int getNumber() {
        return atomicNumber;
    }

    public int getPeriod() {
        return periodRow;
    }

    public String getPhase() {
        return phase;
    }

    public String getSource() {
        return source;
    }

    public String getSpectral_img() {
        return spectralImage;
    }

    public String getSummary() {
        return summary;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getXpos() {
        return xPosition;
    }

    public int getYpos() {
        return yPosition;
    }

    public ArrayList<Integer> getShells() {
        return numOfElectronsPerShell;
    }
}