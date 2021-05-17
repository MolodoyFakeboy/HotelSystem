package org.project.Dao;

import org.project.Annotations.AddArrayList;
import org.project.Annotations.Singleton;
import org.project.Model.Room;

import java.io.Serializable;
import java.util.List;


@Singleton
public class RoomDao implements IRoomDao, Serializable {

    @AddArrayList
    private List<Room> rooms;


    @Override
    public void addRoom(Room room) {
        org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(RoomDao.class);
        rooms.add(room);
        log.info(" Добавлена новая комната " + room.toString());
    }

    @Override
    public void removeRoom(Room room) {
        if (rooms.contains(room)) {
            rooms.remove(room);
        }
    }

    @Override
    public List<Room> getRooms() {
        return rooms;
    }
}