package com.example.tp3_exercice4;


import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class LifeCycleAware implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void NombreUtilisation()
    {
        Inscription.getCompte();
    }


}
