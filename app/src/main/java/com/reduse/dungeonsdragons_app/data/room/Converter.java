package com.reduse.dungeonsdragons_app.data.room;

import com.reduse.dungeonsdragons_app.data.model.Hero;

import java.util.Date;
import java.util.UUID;

class Converter {
    static Hero convert(HeroEntity entity) {
        Hero hero = new Hero();
        hero.setId(UUID.fromString(entity.id));
        hero.setHeroName(entity.heroName);
        hero.setBody(entity.body);
        hero.setCharisma(entity.charisma);
        hero.setDexterity(entity.dexterity);
        hero.setIntelligence(entity.intelligence);
        hero.setPower(entity.power);
        hero.setLevel(entity.level);
        hero.setRace(entity.race);
        hero.setClassHero(entity.classHero);
        hero.setWisdom(entity.wisdom);
        hero.setShild(entity.speed);
        hero.setSpeed(entity.speed);


        return hero;
    }

    static HeroEntity convert(Hero hero) {
        HeroEntity heroEntity = new HeroEntity();
        heroEntity.id = hero.getId().toString();
        heroEntity.heroName = hero.getHeroName();

        return heroEntity;
    }

}
