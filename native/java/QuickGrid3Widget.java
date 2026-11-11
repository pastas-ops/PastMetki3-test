package com.pastmetki.app;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

// Быстрые действия 3x3: девять основных переходов PastMetki.
public class QuickGrid3Widget extends AppWidgetProvider {
    @Override public void onUpdate(Context c, AppWidgetManager m, int[] ids) {
        for (int id : ids) {
            RemoteViews v = new RemoteViews(c.getPackageName(), R.layout.widget_quick_grid3);
            PmData.applyBg(c, v, id);
            v.setOnClickPendingIntent(R.id.qg3_note, PmData.link(c, "new/note", 6301));
            v.setOnClickPendingIntent(R.id.qg3_task, PmData.link(c, "new/task", 6302));
            v.setOnClickPendingIntent(R.id.qg3_cal, PmData.link(c, "calendar", 6303));
            v.setOnClickPendingIntent(R.id.qg3_chat, PmData.link(c, "chats", 6304));
            v.setOnClickPendingIntent(R.id.qg3_search, PmData.link(c, "search", 6305));
            v.setOnClickPendingIntent(R.id.qg3_group, PmData.link(c, "group", 6306));
            v.setOnClickPendingIntent(R.id.qg3_profile, PmData.link(c, "profile", 6307));
            v.setOnClickPendingIntent(R.id.qg3_shop, PmData.link(c, "shop", 6308));
            v.setOnClickPendingIntent(R.id.qg3_history, PmData.link(c, "history", 6309));
            m.updateAppWidget(id, v);
        }
    }
}
