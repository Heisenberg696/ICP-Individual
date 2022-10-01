import javax.print.DocFlavor.INPUT_STREAM;

class Routes{
    // Declaring fields.
    private String airlineCode;
    private String airlineID ;
    private String sourceairportCode;
    private String sourceairportID;
    private String destinationAirportcode;
    private Integer stops;
    private String destinationAairportID;
    private String codeshare;
    private String equipment;

    
    /**
     * This function returns the number of stops in the route
     * 
     * @return The stops variable is being returned.
     */
    public Integer getStops() {
        return stops;
    }

   /**
    * This function returns the airline code
    * 
    * @return The airline code.
    */
    public String getAirlineCode() {
        return airlineCode;
    }

   /**
    * // Java
    * public String getAirlineID() {
    *         return airlineID;
    *     }
    * 
    * @return The airlineID is being returned.
    */
    public String getAirlineID() {
        return airlineID;
    }

   /**
    * This function returns the source airport code
    * 
    * @return The sourceairportCode is being returned.
    */
    public String getSourceairportCode() {
        return sourceairportCode;
    }

/**
 * This function returns the sourceairportID of the flight
 * 
 * @return The sourceairportID is being returned.
 */
    public String getSourceairportID() {
        return sourceairportID;
    }

/**
 * This function returns the destination airport code.
 * 
 * @return The destination airport code.
 */
    public String getDestinationAirportcode() {
        return destinationAirportcode;
    }

/**
 * This function returns the destination airport ID.
 * 
 * @return The destinationAairportID is being returned.
 */
    public String getDestinationAairportID() {
        return destinationAairportID;
    }



    // This is a constructor. It is used to create an object of the class.
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

 
    



    


   
    




    @Override
    public String toString() {
        return "Routes [airlineCode=" + airlineCode + ", airlineID=" + airlineID + ", codeshare=" + codeshare
                + ", destinationAairportID=" + destinationAairportID + ", destinationAirportcode="
                + destinationAirportcode + ", equipment=" + equipment + ", sourceairportID=" + sourceairportID
                + ", sourceairportCode=" + sourceairportCode + ", stops=" + stops + "]";}


    }