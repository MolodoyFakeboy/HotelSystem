package org.project.Dao;

import org.project.Model.Guest;

import java.util.List;

public interface IGuestDao {
    void addGuest(Guest guest);
    void deletGuest(Guest guest);
    List<Guest> getGuests();
}