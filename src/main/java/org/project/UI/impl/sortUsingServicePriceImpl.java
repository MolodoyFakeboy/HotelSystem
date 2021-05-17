package org.project.UI.impl;

import org.project.Controller.IGuestController;
import org.project.UI.IAction;

import java.util.Scanner;

public class sortUsingServicePriceImpl implements IAction {

    private IGuestController guestController;
    private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(sortUsingServicePriceImpl.class);

    public sortUsingServicePriceImpl(IGuestController guestController) {
        this.guestController = guestController;
    }

    @Override
    public void execute() throws Exception {
        try {
            Scanner in = new Scanner(System.in);
            log.info("Укажите индекс гостя");
            int guestIndex = in.nextInt();
            guestController.sortUsingServicePrice(guestController.getGuest(guestIndex));
        } catch (Exception exception) {
            log.error("Неверный индекс");
        }
    }
}