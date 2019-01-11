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
public class FlightDirectory {
    private ArrayList<Flights> flightlist;
   // private ArrayList<FlightDirectory> flightdirlist;

    public FlightDirectory() {
        this.flightlist = new ArrayList<Flights>();
       //this.flightdirlist = new ArrayList<FlightDirectory>();
    }
    
  /*  public ArrayList<FlightDirectory> getFlightdirlist() {
        return flightdirlist;
    }

    public void setFlightdirlist(ArrayList<FlightDirectory> flightdirlist) {
        this.flightdirlist = flightdirlist;
    }*/

    public ArrayList<Flights> getFlightlist() {
        return flightlist;
    }

    public void setFlightlist(ArrayList<Flights> flightlist) {
        this.flightlist = flightlist;
    }
    
   public Flights addFlight(){
       Flights flights = new Flights();
       flightlist.add(flights);
     //System.out.println(flights);
       return flights;
   }
   
   public void deleteFlight(Flights flights){
       flightlist.remove(flights);
   }
   
   public ArrayList<Flights> searchFlight(String departure, String arrival){
       ArrayList<Flights> searchedFlightList = new ArrayList<Flights>();
        for(Flights f: this.flightlist){
            
            if(String.valueOf(f.getDeparture()).equals(departure) && String.valueOf(f.getArrival()).equals(arrival)){
               // System.out.println("Entered IF of search loop");
              // ArrayList<Flights> searchedFlightList = new ArrayList<Flights>();
               searchedFlightList.add(f);
               return searchedFlightList;
               }
        }
        //System.out.println("Did not do anythimg");
        return null;
   }
}
