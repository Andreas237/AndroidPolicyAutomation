// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import java.io.Serializable;
import java.util.HashMap;

// Referenced classes of package com.facebook.appevents:
//			PersistedEvents

static class PersistedEvents$SerializationProxyV1
	implements Serializable
{

	private Object readResolve()
	{
		return ((Object) (new PersistedEvents(proxyEvents)));
	//    0    0:new             #8   <Class PersistedEvents>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field HashMap proxyEvents>
	//    4    8:invokespecial   #32  <Method void PersistedEvents(HashMap)>
	//    5   11:areturn         
	}

	private static final long serialVersionUID = 0xb1aac909L;
	private final HashMap proxyEvents;

	private PersistedEvents$SerializationProxyV1(HashMap hashmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		proxyEvents = hashmap;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field HashMap proxyEvents>
	//    5    9:return          
	}

	PersistedEvents$SerializationProxyV1(HashMap hashmap, PersistedEvents._cls1 _pcls1)
	{
		this(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void PersistedEvents$SerializationProxyV1(HashMap)>
	//    3    5:return          
	}
}
