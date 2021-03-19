package com.gridnine.testing.service;


import com.gridnine.testing.entity.Flight;

import java.util.List;

/**
 * @author Andrey Fyodorov
 * Created on 19.03.2021.
 */

public interface FlightFilterBuilder {

  List<Flight> build();

  FlightFilterBuilder filterDepartureBeforeNow();

  FlightFilterBuilder filterArrivalBeforeDeparture();

  FlightFilterBuilder filterSumTimeOnGroundMoreThanTwoHours();
}
