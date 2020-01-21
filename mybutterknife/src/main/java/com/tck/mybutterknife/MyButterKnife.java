package com.tck.mybutterknife;

import android.app.Activity;

public class MyButterKnife {

    public static void bind(Activity activity) {

        String className = activity.getClass().getName() + "$ViewBinder";
        try {
            Class<?> viewBinderClass = Class.forName(className);
            ViewBinder viewBinder = (ViewBinder) viewBinderClass.newInstance();
            viewBinder.bind(activity);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

    }


}
