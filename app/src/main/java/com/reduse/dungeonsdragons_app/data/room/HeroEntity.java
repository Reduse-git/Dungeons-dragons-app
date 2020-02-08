package com.reduse.dungeonsdragons_app.data.room;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class HeroEntity {
@PrimaryKey
@NonNull
    public String id;
    public String heroName;
    public Integer speed;
    public Integer Shild;

    public Integer level;

    public Integer power;

    public Integer dexterity;

    public Integer charisma;

    public Integer body;

    public Integer intelligence;

    public Integer wisdom;

    public String race;

    public String classHero;

}
