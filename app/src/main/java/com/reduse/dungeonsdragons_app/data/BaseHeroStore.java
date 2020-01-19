package com.reduse.dungeonsdragons_app.data;

import com.reduse.dungeonsdragons_app.data.model.Hero;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseHeroStore implements HeroStore {
    private Set<Listener> listenerSet = new HashSet<>();

    protected final void notifyListeners() {
        for (Listener listener : listenerSet) {
            listener.onHeroListChanged();
        }
    }
    @Override
    public void removeListener(Listener listener){listenerSet.remove(listener);}
    @Override
    public void addListener(Listener listener){listenerSet.add(listener);}
    @Override
    public void update(Hero hero) {

    }

}
