package edu.pdx.cs510J.linbin;

import edu.pdx.cs410J.AbstractFlight;

public class Flight extends AbstractFlight {
  private int flightNo;
  private String src;
  private String dest;
  private String departTime;
  private String arriveTime;

  public  Flight() {
    flightNo = 42;
  }

  public Flight(int no, String src, String dest, String dt, String at) {
    this.flightNo = no;
    this.src = src;
    this.dest = dest;
    this.departTime = dt;
    this.arriveTime = at;
  }

  @Override
  public int getNumber() {
    return flightNo;
  }

  @Override
  public String getSource() {
    return src;
  }

  @Override
  public String getDepartureString() {
    return departTime;
  }

  @Override
  public String getDestination() {
    return dest;
  }

  @Override
  public String getArrivalString() {
    return arriveTime;
  }
}
