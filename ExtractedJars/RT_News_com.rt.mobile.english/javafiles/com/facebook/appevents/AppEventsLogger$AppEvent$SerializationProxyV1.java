// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import java.io.Serializable;
import org.json.JSONException;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

private static class AppEventsLogger$AppEvent$SerializationProxyV1
	implements Serializable
{

	private Object readResolve()
		throws JSONException
	{
		return ((Object) (new AppEventsLogger.AppEvent(jsonString, isImplicit, ((AppEventsLogger._cls1) (null)))));
	//    0    0:new             #8   <Class AppEventsLogger$AppEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field String jsonString>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field boolean isImplicit>
	//    6   12:aconst_null     
	//    7   13:invokespecial   #39  <Method void AppEventsLogger$AppEvent(String, boolean, AppEventsLogger$1)>
	//    8   16:areturn         
	}

	private static final long serialVersionUID = 0x317ab613L;
	private final boolean isImplicit;
	private final String jsonString;

	private AppEventsLogger$AppEvent$SerializationProxyV1(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		jsonString = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field String jsonString>
		isImplicit = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #29  <Field boolean isImplicit>
	//    8   14:return          
	}

	AppEventsLogger$AppEvent$SerializationProxyV1(String s, boolean flag, AppEventsLogger._cls1 _pcls1)
	{
		this(s, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void AppEventsLogger$AppEvent$SerializationProxyV1(String, boolean)>
	//    4    6:return          
	}
}
