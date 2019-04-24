// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.os.Bundle;

public class FirebaseAnalyticsEvent
{

	FirebaseAnalyticsEvent(String s, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		eventName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field String eventName>
		eventParams = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field Bundle eventParams>
	//    8   14:return          
	}

	public String getEventName()
	{
		return eventName;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String eventName>
	//    2    4:areturn         
	}

	public Bundle getEventParams()
	{
		return eventParams;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Bundle eventParams>
	//    2    4:areturn         
	}

	private final String eventName;
	private final Bundle eventParams;
}
