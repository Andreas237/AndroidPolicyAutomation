// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import b.a.a.a.a.d.e;
import b.a.a.a.a.g.b;

interface SessionAnalyticsManagerStrategy
	extends e
{

	public abstract void deleteAllEvents();

	public abstract void processEvent(SessionEvent.Builder builder);

	public abstract void sendEvents();

	public abstract void setAnalyticsSettingsData(b b, String s);
}
