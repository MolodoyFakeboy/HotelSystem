package Controller;

import Model.Guest;
import Model.Room;
import Model.Service;
import Service.GuestService;

import java.util.Scanner;

public class GuestController {
    private final GuestService guestService;


    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    public Guest getGuest(int index) {
        return guestService.getGuest(index);
    }

    public void bookRoom(Room room, Guest guest) {
        guestService.bookRoom(room, guest);
    }

    public void leaveHotel(Room room, int guestIndex) {
        guestService.leaveHotel(room, getGuest(guestIndex));
    }

    public void useService(Service service, int guestIndex) {
        guestService.useService(getGuest(guestIndex), service);
    }

    public void getaBill(int guestIndex, Room room) {
        guestService.getaBill(getGuest(guestIndex), room);
    }

    public void sortAction(Guest guest) {
        Scanner in = new Scanner(System.in);
        int action = in.nextInt();
        switch (action) {
            case 1:
                guestService.getNumberGuest();
                break;
            case 2:
                guestService.sortUsingServicePrice(guest);
                break;
            case 3:
                guestService.sortUsingServiceTime(guest);
            default:
                break;
        }
    }


}
