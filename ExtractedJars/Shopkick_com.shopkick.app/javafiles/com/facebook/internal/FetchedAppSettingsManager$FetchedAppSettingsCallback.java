// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			FetchedAppSettingsManager, FetchedAppSettings

public static interface FetchedAppSettingsManager$FetchedAppSettingsCallback
{

	public abstract void onError();

	public abstract void onSuccess(FetchedAppSettings fetchedappsettings);
}
