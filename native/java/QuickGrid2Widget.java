package com.pastmetki.app;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

// Быстрые действия 2x2: заметка, задача, календарь и чаты.
public class QuickGrid2Widget extends AppWidgetProvider {
    @Override public void onUpdate(Context c, AppWidgetManager m, int[] ids) {
        for (int id : ids) {
            RemoteViews v = new RemoteViews(c.getPackageName(), R.layout.widget_quick_grid2);
            PmData.applyBg(c, v, id);
            v.setOnClickPendingIntent(R.id.qg2_note, PmData.link(c, "new/note", 6201));
            v.setOnClickPendingIntent(R.id.qg2_task, PmData.link(c, "new/task", 6202));
            v.setOnClickPendingIntent(R.id.qg2_cal, PmData.link(c, "calendar", 6203));
            v.setOnClickPendingIntent(R.id.qg2_chat, PmData.link(c, "chats", 6204));
            m.updateAppWidget(id, v);
        }
    }
}
