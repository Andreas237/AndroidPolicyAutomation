// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class UnregisterListenerMethod
{

	protected UnregisterListenerMethod(ListenerHolder.ListenerKey listenerkey)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzlj = listenerkey;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ListenerHolder$ListenerKey zzlj>
	//    5    9:return          
	}

	public ListenerHolder.ListenerKey getListenerKey()
	{
		return zzlj;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ListenerHolder$ListenerKey zzlj>
	//    2    4:areturn         
	}

	protected abstract void unregisterListener(com.google.android.gms.common.api.Api.AnyClient anyclient, TaskCompletionSource taskcompletionsource)
		throws RemoteException;

	private final ListenerHolder.ListenerKey zzlj;
}
