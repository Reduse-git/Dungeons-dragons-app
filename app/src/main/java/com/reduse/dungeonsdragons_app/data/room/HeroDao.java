package com.reduse.dungeonsdragons_app.data.room;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface HeroDao {


    @Query("SELECT * FROM HeroEntity")
    List<HeroEntity> getAllHero();

    @Query("SELECT * FROM HeroEntity WHERE id == :idParam")
    HeroEntity getHeroById(String idParam);

    @Insert
    void add(HeroEntity heroEntity);

    @Delete
    void delete(HeroEntity heroEntity);

    @Update
    void update(HeroEntity heroEntity);

}
