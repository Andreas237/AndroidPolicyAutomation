// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.ndk;

import android.content.Context;
import com.crashlytics.android.core.internal.models.SessionEventData;

interface NdkKitController
{

	public abstract void clearCachedData();

	public abstract SessionEventData getPreviousCrashData();

	public abstract boolean initialize(Context context);

	public abstract void loadPreviousCrashData();
}
