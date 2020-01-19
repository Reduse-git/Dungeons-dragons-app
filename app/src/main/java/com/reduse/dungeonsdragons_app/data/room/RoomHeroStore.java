package com.reduse.dungeonsdragons_app.data.room;

import android.content.Context;

import androidx.room.Room;

import com.reduse.dungeonsdragons_app.data.BaseHeroStore;
import com.reduse.dungeonsdragons_app.data.model.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RoomHeroStore extends BaseHeroStore {

    private HeroDao heroDao;
    public RoomHeroStore(Context context) {
        heroDao = Room.databaseBuilder(
                context,
                HeroDatabase.class,
                "travel-database.sqlite")
                .allowMainThreadQueries()
                .build()
                .heroDao();
    }
    @Override
    public List<Hero> getHero() {
        List<HeroEntity> heroEntityList = heroDao.getAllHero();

        List<Hero> resultList = new ArrayList<>();

        for(HeroEntity heroEntity: heroEntityList){
            resultList.add(Converter.convert(heroEntity));
        }
        return resultList;
    }

    @Override
    public Hero getById(UUID id) {
        HeroEntity heroEntity = heroDao.getHeroById(id.toString());

        return Converter.convert(heroEntity);
    }

    @Override
    public void deleteHero(Hero hero) {
        heroDao.delete(Converter.convert(hero));
        notifyListeners();
    }

    @Override
    public void deleteHero(UUID id) {
        HeroEntity entityToDelete = new HeroEntity();
        entityToDelete.id =id.toString();
        heroDao.delete(entityToDelete);
        notifyListeners();
    }

    @Override
    public void insert(Hero hero) {
        heroDao.add(Converter.convert(hero));
        notifyListeners();
    }
    @Override
    public void update(Hero hero){
        heroDao.update(Converter.convert(hero));
        notifyListeners();
    }
}
