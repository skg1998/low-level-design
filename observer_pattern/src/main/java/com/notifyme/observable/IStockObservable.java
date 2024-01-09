package com.notifyme.observable;

import com.notifyme.observer.INotificationObserver;

public interface IStockObservable {
    public void add(INotificationObserver user);

    public void remove(INotificationObserver user);

    public void notifySubscriber();

    public void setStock(int stock);
}
