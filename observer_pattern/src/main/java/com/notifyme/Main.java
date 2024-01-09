package com.notifyme;

import com.notifyme.observable.IStockObservable;
import com.notifyme.observable.NotifyMeObservable;
import com.notifyme.observer.EmailNotificatonObserver;
import com.notifyme.observer.INotificationObserver;
import com.notifyme.observer.PhoneNotificationObserver;

public class Main {
    public static void main(String[] args) {
        IStockObservable notifyMeObserver = new NotifyMeObservable();

        INotificationObserver x = new EmailNotificatonObserver("x@gmail.com", notifyMeObserver);
        INotificationObserver y = new EmailNotificatonObserver("y@gmail.com", notifyMeObserver);
        INotificationObserver z = new PhoneNotificationObserver("999999", notifyMeObserver);

        notifyMeObserver.add(x);
        notifyMeObserver.add(y);
        notifyMeObserver.add(z);

        notifyMeObserver.setStock(10);
    }
}