package com.hurteng.stormplane;

import android.app.Application;

import com.ego.game.mi.Mi;
import com.ego.shadow.Shadow;
import com.hurteng.stormplane.myplane.BuildConfig;

/**
 * @author lxy
 * @time 2018/8/31  14:44
 */
public class Game extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Shadow.init(this,"1809011253",MainActivity.class);
        Mi.init(this,"2882303761517864333","5261786449333", BuildConfig.DEBUG);
    }
}
