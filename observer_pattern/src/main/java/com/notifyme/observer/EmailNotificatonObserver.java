package com.notifyme.observer;

import java.util.logging.Logger;

import com.notifyme.observable.IStockObservable;

public class EmailNotificatonObserver implements INotificationObserver {
    Logger logger = Logger.getLogger(getClass().getName());
    String emailId;
    IStockObservable iStockObservable;

    public EmailNotificatonObserver(String emailId, IStockObservable iStockObservable) {
        this.emailId = emailId;
        this.iStockObservable = iStockObservable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Notification sent to given email id");
    }

    private void sendMail(String emailId2, String msg) {
        logger.info(msg + ": " + emailId2);
    }

}
