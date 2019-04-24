// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.os.Bundle;

public interface EventLogger
{

	public abstract void logEvent(String s, Bundle bundle);

	public abstract void logEvent(String s, String s1, Bundle bundle);
}
