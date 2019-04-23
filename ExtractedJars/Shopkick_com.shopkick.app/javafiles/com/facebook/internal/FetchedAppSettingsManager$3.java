// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			FetchedAppSettingsManager, FetchedAppSettings

static final class FetchedAppSettingsManager$3
	implements Runnable
{

	public void run()
	{
		val$callback.onSuccess(val$appSettings);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field FetchedAppSettingsManager$FetchedAppSettingsCallback val$callback>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field FetchedAppSettings val$appSettings>
	//    4    8:invokeinterface #31  <Method void FetchedAppSettingsManager$FetchedAppSettingsCallback.onSuccess(FetchedAppSettings)>
	//    5   13:return          
	}

	final FetchedAppSettings val$appSettings;
	final tchedAppSettingsCallback val$callback;

	FetchedAppSettingsManager$3(tchedAppSettingsCallback tchedappsettingscallback, FetchedAppSettings fetchedappsettings)
	{
		val$callback = tchedappsettingscallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FetchedAppSettingsManager$FetchedAppSettingsCallback val$callback>
		val$appSettings = fetchedappsettings;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field FetchedAppSettings val$appSettings>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
