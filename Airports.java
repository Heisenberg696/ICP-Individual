class Airports{


@Override
    // The above code is the hashCode() method of the Airport class. It is used to generate a unique
    // hash code for each object of the Airport class.
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((airportID == null) ? 0 : airportID.hashCode());
        result = prime * result + ((airportName == null) ? 0 : airportName.hashCode());
        result = prime * result + altitude;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        result = prime * result + ((iata == null) ? 0 : iata.hashCode());
        result = prime * result + icao;
        result = prime * result + latitude;
        result = prime * result + longitude;
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + timezone;
        return result;
    }



/**
 * If the object is not null, and the object is of the same class, then check if the values of the
 * object are equal to the values of the other object. If they are, then return true. If they are not,
 * then return false
 * 
 * @param obj The object to compare this instance with.
 */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Airports other = (Airports) obj;
        if (airportID == null) {
            if (other.airportID != null)
                return false;
        } else if (!airportID.equals(other.airportID))
            return false;
        if (airportName == null) {
            if (other.airportName != null)
                return false;
        } else if (!airportName.equals(other.airportName))
            return false;
        if (altitude != other.altitude)
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        } else if (!country.equals(other.country))
            return false;
        if (iata == null) {
            if (other.iata != null)
                return false;
        } else if (!iata.equals(other.iata))
            return false;
        if (icao != other.icao)
            return false;
        if (latitude != other.latitude)
            return false;
        if (longitude != other.longitude)
            return false;
        if (source == null) {
            if (other.source != null)
                return false;
        } else if (!source.equals(other.source))
            return false;
        if (timezone != other.timezone)
            return false;
        return true;
    }


    
    // Defining the variables for the class.
    private Integer airportID;
    private String airportName;
    private String city;
    private String  country ;
    private String iata;
    private int icao;
    private int latitude;
    private int longitude;
    private int altitude;
    private int timezone ;
    private String source;

    // This is a constructor for the Airports class. It is used to create an object of the Airports
    // class.
    public Airports(Integer airportId, String airportName, String city, String country, String iata) {
            this.airportID = airportId;
            this.airportName = airportName;
            this.city = city;
            this.country = country;
            this.iata = iata;
            }

            

/**
 * This function returns the airportID of the airport
 * 
 * @return The airportID is being returned.
 */
    public Integer getAirportID() {
        return airportID;
    }


/**
 * This function returns the name of the airport.
 * 
 * @return The airport name.
 */
    public String getAirportName() {
        return airportName;
    }
/**
 * This function returns the city of the address
 * 
 * @return The city of the address.
 */
    public String getCity() {
        return city;
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
 * It returns the IATA code of the airport.
 * 
 * @return The iata variable is being returned.
 */
    public String getIata() {
        return iata;
    }


/**
 * It returns the icao.
 * 
 * @return The icao variable is being returned.
 */
    public int getIcao() {
        return icao;
    }


/**
 * This function returns the latitude of the location.
 * 
 * @return The latitude of the location.
 */
    public int getLatitude() {
        return latitude;
    }


/**
 * This function returns the longitude of the location
 * 
 * @return The longitude of the location.
 */
    public int getLongitude() {
        return longitude;
    }


/**
 * This function returns the altitude of the plane
 * 
 * @return The altitude of the plane.
 */
    public int getAltitude() {
        return altitude;
    }


/**
 * This function returns the timezone of the current location.
 * 
 * @return The timezone.
 */
    public int getTimezone() {
        return timezone;
    }


/**
 * It returns the source of the current object.
 * 
 * @return The source of the article.
 */
    public String getSource() {
        return source;
    }


    
    @Override
// A method that is used to return the string representation of an instance of the class.
    public String toString() {
        return "Airports [airportID=" + airportID + ", airportName=" + airportName + ", altitude=" + altitude
                + ", city=" + city + ", country=" + country + ", iata=" + iata + ", icao=" + icao + ", latitude="
                + latitude + ", longitude=" + longitude + ", source=" + source + ", timezone=" + timezone + "]";
    }



}