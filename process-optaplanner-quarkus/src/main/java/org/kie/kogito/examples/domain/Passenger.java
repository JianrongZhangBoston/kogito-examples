/**
 *  Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.kie.kogito.examples.domain;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.entity.PlanningPin;
import org.optaplanner.core.api.domain.lookup.PlanningId;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

@PlanningEntity
public class Passenger {

    @PlanningId
    private Long id;

    private String name;
    // Sometimes null
    private SeatType seatTypePreference;
    // At least 15 years old, sufficient mobility, strength and dexterity to assist in an evacuation.
    private boolean emergencyExitRowCapable;
    @PlanningPin
    private boolean paidForSeat;

    @PlanningVariable(valueRangeProviderRefs = "seatRange")
    private Seat seat;

    public Passenger() {
    }

    public Passenger(Long id, String name, SeatType seatTypePreference, boolean emergencyExitRowCapable, boolean paidForSeat, Seat seat) {
        this.id = id;
        this.name = name;
        this.seatTypePreference = seatTypePreference;
        this.emergencyExitRowCapable = emergencyExitRowCapable;
        this.paidForSeat = paidForSeat;
        this.seat = seat;
    }

    // ************************************************************************
    // Getters and setters
    // ************************************************************************

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SeatType getSeatTypePreference() {
        return seatTypePreference;
    }

    public boolean isEmergencyExitRowCapable() {
        return emergencyExitRowCapable;
    }

    public boolean hasPaidForSeat() {
        return paidForSeat;
    }

    public Seat getSeat() {
        return seat;
    }
}
