import javax.print.DocFlavor.INPUT_STREAM;

class Routes{
    private String airlineCode;
    private String airlineID ;
    private String sourceairportCode;
    private String sourceairportID;
    private String destinationAirportcode;


    private Integer stops;
    
    public Integer getStops() {
        return stops;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public String getAirlineID() {
        return airlineID;
    }

    public String getSourceairportCode() {
        return sourceairportCode;
    }

    public String getSourceairportID() {
        return sourceairportID;
    }

    public String getDestinationAirportcode() {
        return destinationAirportcode;
    }

    private String destinationAairportID;
    public String getDestinationAairportID() {
        return destinationAairportID;
    }

    public Routes(String airlineCode, String airlineID, String sourceairportCode, String sourceairportID,
            String destinationAirportcode, String destinationAairportID, Integer stops) {
        this.airlineCode = airlineCode;
        this.airlineID = airlineID;
        this.sourceairportCode = sourceairportCode;
        this.sourceairportID = sourceairportID;
        this.destinationAirportcode = destinationAirportcode;
        this.destinationAairportID = destinationAairportID;
        this.stops = stops;
    }

    private String codeshare;
    



    


   
    


    private String equipment;

    @Override
    public String toString() {
        return "Routes [airlineCode=" + airlineCode + ", airlineID=" + airlineID + ", codeshare=" + codeshare
                + ", destinationAairportID=" + destinationAairportID + ", destinationAirportcode="
                + destinationAirportcode + ", equipment=" + equipment + ", sourceairportID=" + sourceairportID
                + ", sourceairportCode=" + sourceairportCode + ", stops=" + stops + "]";}


    }