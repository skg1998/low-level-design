package com.notifyme.observer;

import java.util.logging.Logger;

import com.notifyme.observable.IStockObservable;

public class PhoneNotificationObserver implements INotificationObserver {
    Logger logger = Logger.getLogger(getClass().getName());
    String phoneNumber;
    IStockObservable iStockObservable;

    public PhoneNotificationObserver(String phoneNumber, IStockObservable iStockObservable) {
        this.phoneNumber = phoneNumber;
        this.iStockObservable = iStockObservable;
    }

    @Override
    public void update() {
        sendTextMessage(phoneNumber, "Notification sent to given phnoe number");
    }

    private void sendTextMessage(String phone, String msg) {
        logger.info(msg + ": " + phone);
    }

}
