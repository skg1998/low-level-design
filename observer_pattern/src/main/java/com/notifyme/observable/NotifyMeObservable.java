package com.notifyme.observable;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.notifyme.observer.INotificationObserver;

public class NotifyMeObservable implements IStockObservable {
    public final Logger logger = Logger.getLogger(getClass().getName());
    public List<INotificationObserver> observers = new ArrayList<>();
    public int stock = 0;

    @Override
    public void add(INotificationObserver observer) {
        logger.info("Add Observers");
        observers.add(observer);
    }

    @Override
    public void remove(INotificationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (INotificationObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStock(int stock) {
        if (stock == 0) {
            notifySubscriber();
        }
        this.stock += stock;
    }

}
