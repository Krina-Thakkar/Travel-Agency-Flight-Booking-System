/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Krina Thakkar
 */
public class Flights {
    private String FlightNo;
    private Date date;
    private String Departure;
    private String Arrival;
    private String airlineName;
    private String seat;

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
    
    public String getFlightNo() {
        return FlightNo;
    }

    public void setFlightNo(String FlightNo) {
        this.FlightNo = FlightNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDeparture() {
        return Departure;
    }

    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }

    public String getArrival() {
        return Arrival;
    }

    public void setArrival(String Arrival) {
        this.Arrival = Arrival;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
    
  @Override
    public String toString() {
        return this.getAirlineName(); //To change body of generated methods, choose Tools | Templates.
    }
}
