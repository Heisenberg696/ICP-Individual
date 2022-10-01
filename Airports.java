class Airports{
@Override
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

    public Airports(Integer airportId, String airportName, String city, String country, String iata) {
            this.airportID = airportId;
            this.airportName = airportName;
            this.city = city;
            this.country = country;
            this.iata = iata;
            }

            

    public Integer getAirportID() {
        return airportID;
    }
    public String getAirportName() {
        return airportName;
    }
    public String getCity() {
        return city;
    }
    public String getCountry() {
        return country;
    }
    public String getIata() {
        return iata;
    }
    public int getIcao() {
        return icao;
    }
    public int getLatitude() {
        return latitude;
    }
    public int getLongitude() {
        return longitude;
    }
    public int getAltitude() {
        return altitude;
    }
    public int getTimezone() {
        return timezone;
    }
    public String getSource() {
        return source;
    }
    private String source;

    
    @Override
    public String toString() {
        return "Airports [airportID=" + airportID + ", airportName=" + airportName + ", altitude=" + altitude
                + ", city=" + city + ", country=" + country + ", iata=" + iata + ", icao=" + icao + ", latitude="
                + latitude + ", longitude=" + longitude + ", source=" + source + ", timezone=" + timezone + "]";
    }



}