// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;


// Referenced classes of package com.firebase.client.core:
//			PersistentConnection, Path

private static class PersistentConnection$OutstandingDisconnect
{

	public String getAction()
	{
		return action;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String action>
	//    2    4:areturn         
	}

	public Object getData()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Object data>
	//    2    4:areturn         
	}

	public com.firebase.client.Firebase.CompletionListener getOnComplete()
	{
		return onComplete;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field com.firebase.client.Firebase$CompletionListener onComplete>
	//    2    4:areturn         
	}

	public Path getPath()
	{
		return path;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Path path>
	//    2    4:areturn         
	}

	private final String action;
	private final Object data;
	private final com.firebase.client.Firebase.CompletionListener onComplete;
	private final Path path;


/*
	static com.firebase.client.Firebase.CompletionListener access$200(PersistentConnection$OutstandingDisconnect persistentconnection$outstandingdisconnect)
	{
		return persistentconnection$outstandingdisconnect.onComplete;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field com.firebase.client.Firebase$CompletionListener onComplete>
	//    2    4:areturn         
	}

*/

	private PersistentConnection$OutstandingDisconnect(String s, Path path1, Object obj, com.firebase.client.Firebase.CompletionListener completionlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		action = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field String action>
		path = path1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Path path>
		data = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field Object data>
		onComplete = completionlistener;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #28  <Field com.firebase.client.Firebase$CompletionListener onComplete>
	//   14   25:return          
	}

	PersistentConnection$OutstandingDisconnect(String s, Path path1, Object obj, com.firebase.client.Firebase.CompletionListener completionlistener, PersistentConnection._cls1 _pcls1)
	{
		this(s, path1, obj, completionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #32  <Method void PersistentConnection$OutstandingDisconnect(String, Path, Object, com.firebase.client.Firebase$CompletionListener)>
	//    6    9:return          
	}
}
