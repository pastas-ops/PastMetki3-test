package com.pastmetki.app;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

public class QuickGrid2Widget extends AppWidgetProvider {
    @Override public void onUpdate(Context c, AppWidgetManager m, int[] ids) {
        for (int id : ids) {
            RemoteViews v = new RemoteViews(c.getPackageName(), R.layout.widget_quick_grid2);
            PmData.applyBg(c, v, id);
            v.setOnClickPendingIntent(R.id.q1, PmData.link(c, "new/note", 81));
            v.setOnClickPendingIntent(R.id.q2, PmData.link(c, "new/task", 82));
            v.setOnClickPendingIntent(R.id.q3, PmData.link(c, "calendar", 83));
            v.setOnClickPendingIntent(R.id.q4, PmData.link(c, "chats", 84));
            m.updateAppWidget(id, v);
        }
    }
}
