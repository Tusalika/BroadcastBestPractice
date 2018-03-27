package com.example.thiago.broadcastbestpractice;

import android.app.Activity;
import android.support.v7.app.ActionBar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thiago on 2018/3/27.
 */

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishALL() {
        for (Activity activity : activities) {
            if ((!activity.isFinishing())) {
                activity.finish();
            }
        }
        activities.clear();
    }
}
