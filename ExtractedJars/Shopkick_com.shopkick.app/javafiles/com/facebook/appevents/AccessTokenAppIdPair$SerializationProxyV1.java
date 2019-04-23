// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import java.io.Serializable;

// Referenced classes of package com.facebook.appevents:
//			AccessTokenAppIdPair

static class AccessTokenAppIdPair$SerializationProxyV1
	implements Serializable
{

	private Object readResolve()
	{
		return ((Object) (new AccessTokenAppIdPair(accessTokenString, appId)));
	//    0    0:new             #8   <Class AccessTokenAppIdPair>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field String accessTokenString>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field String appId>
	//    6   12:invokespecial   #32  <Method void AccessTokenAppIdPair(String, String)>
	//    7   15:areturn         
	}

	private static final long serialVersionUID = 0x317ab613L;
	private final String accessTokenString;
	private final String appId;

	private AccessTokenAppIdPair$SerializationProxyV1(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		accessTokenString = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field String accessTokenString>
		appId = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field String appId>
	//    8   14:return          
	}

	AccessTokenAppIdPair$SerializationProxyV1(String s, String s1, AccessTokenAppIdPair._cls1 _pcls1)
	{
		this(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void AccessTokenAppIdPair$SerializationProxyV1(String, String)>
	//    4    6:return          
	}
}
