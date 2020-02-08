package com.reduse.dungeonsdragons_app.data.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(
        entities = {HeroEntity.class},
        version = 1,
        exportSchema = false
)


public  abstract  class HeroDatabase extends RoomDatabase {
public abstract HeroDao heroDao();


}
