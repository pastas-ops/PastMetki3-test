package com.pastmetki.app;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

public class QuickGrid3Widget extends AppWidgetProvider {
    @Override public void onUpdate(Context c, AppWidgetManager m, int[] ids) {
        for (int id : ids) {
            RemoteViews v = new RemoteViews(c.getPackageName(), R.layout.widget_quick_grid3);
            PmData.applyBg(c, v, id);
            String[] routes = {"new/note", "calendar", "chats", "notes", "home", "new/task", "search", "groups", "profile"};
            int[] views = {R.id.q1,R.id.q2,R.id.q3,R.id.q4,R.id.q5,R.id.q6,R.id.q7,R.id.q8,R.id.q9};
            for (int i=0;i<views.length;i++) v.setOnClickPendingIntent(views[i], PmData.link(c, routes[i], 91+i));
            m.updateAppWidget(id, v);
        }
    }
}
