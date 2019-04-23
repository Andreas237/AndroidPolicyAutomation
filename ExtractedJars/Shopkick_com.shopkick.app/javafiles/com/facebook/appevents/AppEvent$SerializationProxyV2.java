// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import java.io.Serializable;
import org.json.JSONException;

// Referenced classes of package com.facebook.appevents:
//			AppEvent

static class AppEvent$SerializationProxyV2
	implements Serializable
{

	private Object readResolve()
		throws JSONException
	{
		return ((Object) (new AppEvent(jsonString, isImplicit, checksum, ((AppEvent._cls1) (null)))));
	//    0    0:new             #8   <Class AppEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field String jsonString>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field boolean isImplicit>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field String checksum>
	//    8   16:aconst_null     
	//    9   17:invokespecial   #39  <Method void AppEvent(String, boolean, String, AppEvent$1)>
	//   10   20:areturn         
	}

	private static final long serialVersionUID = 0xb1ad70b9L;
	private final String checksum;
	private final boolean isImplicit;
	private final String jsonString;

	private AppEvent$SerializationProxyV2(String s, boolean flag, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		jsonString = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String jsonString>
		isImplicit = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #27  <Field boolean isImplicit>
		checksum = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field String checksum>
	//   11   19:return          
	}

	AppEvent$SerializationProxyV2(String s, boolean flag, String s1, AppEvent._cls1 _pcls1)
	{
		this(s, flag, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #33  <Method void AppEvent$SerializationProxyV2(String, boolean, String)>
	//    5    7:return          
	}
}
