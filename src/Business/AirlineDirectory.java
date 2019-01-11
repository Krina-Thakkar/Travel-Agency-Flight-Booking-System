/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Krina Thakkar
 */
public class AirlineDirectory {
    private ArrayList<Airlines> airlineDir;
    private FlightDirectory flightdirectory;

    public AirlineDirectory() {
        this.airlineDir = new ArrayList<Airlines>();
        this.flightdirectory = new FlightDirectory();
    }

    public FlightDirectory getFlightdirectory() {
        return flightdirectory;
    }

    public void setFlightdirectory(FlightDirectory flightdirectory) {
        this.flightdirectory = flightdirectory;
    }

    public ArrayList<Airlines> getAirlineDir() {
        return airlineDir;
    }

    public void setAirlineDir(ArrayList<Airlines> airlineDir) {
        this.airlineDir = airlineDir;
    }
    public Airlines addAirlines(){
        Airlines airlines = new Airlines();
        airlineDir.add(airlines);
        return airlines;
    }
    public void deleteAirlines(Airlines airlines){
        airlineDir.remove(airlines);
    }
}
