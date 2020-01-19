package com.reduse.dungeonsdragons_app.data;

import com.reduse.dungeonsdragons_app.data.model.Hero;

import java.util.List;
import java.util.UUID;

public interface HeroStore {

    List<Hero> getHero();

    Hero getById(UUID id);

    void deleteHero(Hero hero);
    void deleteHero(UUID id);

    void update(Hero hero);
    void insert(Hero hero);

    void addListener(Listener listener);

    void removeListener(Listener listener);

    interface Listener {
        void onHeroListChanged();
    }
}
