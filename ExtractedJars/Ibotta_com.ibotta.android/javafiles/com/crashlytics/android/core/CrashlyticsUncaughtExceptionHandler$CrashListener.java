// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler

static interface CrashlyticsUncaughtExceptionHandler$CrashListener
{

	public abstract void onUncaughtException(Thread thread, Throwable throwable);
}
