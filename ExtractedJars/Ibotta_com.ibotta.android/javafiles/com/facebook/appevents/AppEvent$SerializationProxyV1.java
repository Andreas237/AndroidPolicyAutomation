// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import java.io.Serializable;
import org.json.JSONException;

// Referenced classes of package com.facebook.appevents:
//			AppEvent

static class AppEvent$SerializationProxyV1
	implements Serializable
{

	private Object readResolve()
		throws JSONException
	{
		return ((Object) (new AppEvent(jsonString, isImplicit, ((String) (null)), ((AppEvent._cls1) (null)))));
	//    0    0:new             #8   <Class AppEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field String jsonString>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field boolean isImplicit>
	//    6   12:aconst_null     
	//    7   13:aconst_null     
	//    8   14:invokespecial   #29  <Method void AppEvent(String, boolean, String, AppEvent$1)>
	//    9   17:areturn         
	}

	private static final long serialVersionUID = 0x317ab613L;
	private final boolean isImplicit;
	private final String jsonString;
}
