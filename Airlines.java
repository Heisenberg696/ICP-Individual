class Airlines{
// Declaring the variables that will be used in the class.
    private int airline_ID;
    private String name;
    private String alias;
    private String iata_code;
    private String icao_code;
    private String callsign;
    private String country;
    private String active;





// A constructor.
    public Airlines(int airline_ID, String name, String alias, String iata_code, String icao_code, String callsign,
            String country, String active) {
        this.airline_ID = airline_ID;
        this.name = name;
        this.alias = alias;
        this.iata_code = iata_code;
        this.icao_code = icao_code;
        this.callsign = callsign;
        this.country = country;
        this.active = active;
    }


/**
 * It returns the airline_ID.
 * 
 * @return The airline_ID is being returned.
 */
    public int getAirline_ID() {
        return airline_ID;
    }


/**
 * It returns the name of the object.
 * 
 * @return The name of the person.
 */
    public String getName() {
        return name;
    }


/**
 * It returns the alias of the user.
 * 
 * @return The alias of the person.
 */
    public String getAlias() {
        return alias;
    }

/**
 * This function returns the iata_code of the airport
 * 
 * @return The iata_code is being returned.
 */
    public String getIata_code() {
        return iata_code;
    }


/**
 * This function returns the icao_code of the airport
 * 
 * @return The icao_code is being returned.
 */
    public String getIcao_code() {
        return icao_code;
    }


/**
 * This function returns the callsign of the aircraft
 * 
 * @return The callsign of the aircraft.
 */
    public String getCallsign() {
        return callsign;
    }


/**
 * This function returns the country of the user
 * 
 * @return The country variable is being returned.
 */
    public String getCountry() {
        return country;
    }


/**
 * // Java
 *     public String getActive() {
 *         return active;
 *     }
 * 
 * @return The active variable is being returned.
 */
    public String getActive() {
        return active;
    }


    
/**
 * The toString() method returns a string representation of the object
 * 
 * @return The toString method is being returned.
 */
    @Override
    public String toString() {
        return "Airlines [active=" + active + ", airline_ID=" + airline_ID + ", alias=" + alias + ", callsign="
                + callsign + ", country=" + country + ", iata_code=" + iata_code + ", icao_code=" + icao_code
                + ", name=" + name + "]";
    }

    
}