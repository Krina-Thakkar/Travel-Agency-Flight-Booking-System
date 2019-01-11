/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Krina Thakkar
 */
public class Airlines {
    private String airlineName;
    private String airlineType;

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineType() {
        return airlineType;
    }

    public void setAirlineType(String airlineType) {
        this.airlineType = airlineType;
    }
    @Override
    public String toString() {
        return this.getAirlineName(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
