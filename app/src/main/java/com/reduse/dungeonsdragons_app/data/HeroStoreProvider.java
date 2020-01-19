package com.reduse.dungeonsdragons_app.data;

import android.content.Context;

import com.reduse.dungeonsdragons_app.data.room.RoomHeroStore;

public class HeroStoreProvider {

    private static HeroStore instance;

    private HeroStoreProvider() {

    }
    public  static HeroStore getInstance(Context context){
        if(instance == null){
            instance = new RoomHeroStore(context);
        }
        return instance;
    }
}
