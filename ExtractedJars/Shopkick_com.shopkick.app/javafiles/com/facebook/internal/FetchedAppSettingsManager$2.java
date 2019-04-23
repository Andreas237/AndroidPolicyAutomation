// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			FetchedAppSettingsManager

static final class FetchedAppSettingsManager$2
	implements Runnable
{

	public void run()
	{
		val$callback.onError();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field FetchedAppSettingsManager$FetchedAppSettingsCallback val$callback>
	//    2    4:invokeinterface #26  <Method void FetchedAppSettingsManager$FetchedAppSettingsCallback.onError()>
	//    3    9:return          
	}

	final tchedAppSettingsCallback val$callback;

	FetchedAppSettingsManager$2(tchedAppSettingsCallback tchedappsettingscallback)
	{
		val$callback = tchedappsettingscallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FetchedAppSettingsManager$FetchedAppSettingsCallback val$callback>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
