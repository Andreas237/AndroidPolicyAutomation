// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.events.FileRollOverManager;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;

interface SessionAnalyticsManagerStrategy
	extends FileRollOverManager
{

	public abstract void deleteAllEvents();

	public abstract void processEvent(SessionEvent.Builder builder);

	public abstract void sendEvents();

	public abstract void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata, String s);
}
