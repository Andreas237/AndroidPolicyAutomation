// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import java.util.Map;

// Referenced classes of package com.firebase.client.core:
//			PersistentConnection

private static class PersistentConnection$OutstandingPut
{

	public String getAction()
	{
		return action;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String action>
	//    2    4:areturn         
	}

	public com.firebase.client.Firebase.CompletionListener getOnComplete()
	{
		return onComplete;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field com.firebase.client.Firebase$CompletionListener onComplete>
	//    2    4:areturn         
	}

	public Map getRequest()
	{
		return request;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Map request>
	//    2    4:areturn         
	}

	private String action;
	private com.firebase.client.Firebase.CompletionListener onComplete;
	private Map request;


/*
	static com.firebase.client.Firebase.CompletionListener access$100(PersistentConnection$OutstandingPut persistentconnection$outstandingput)
	{
		return persistentconnection$outstandingput.onComplete;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field com.firebase.client.Firebase$CompletionListener onComplete>
	//    2    4:areturn         
	}

*/

	private PersistentConnection$OutstandingPut(String s, Map map, com.firebase.client.Firebase.CompletionListener completionlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		action = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String action>
		request = map;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Map request>
		onComplete = completionlistener;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field com.firebase.client.Firebase$CompletionListener onComplete>
	//   11   19:return          
	}

	PersistentConnection$OutstandingPut(String s, Map map, com.firebase.client.Firebase.CompletionListener completionlistener, PersistentConnection._cls1 _pcls1)
	{
		this(s, map, completionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #31  <Method void PersistentConnection$OutstandingPut(String, Map, com.firebase.client.Firebase$CompletionListener)>
	//    5    7:return          
	}
}
