// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			ListenerHolder

public abstract class RegisterListenerMethod
{

	protected RegisterListenerMethod(ListenerHolder listenerholder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzls = listenerholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ListenerHolder zzls>
	//    5    9:return          
	}

	public void clearListener()
	{
		zzls.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ListenerHolder zzls>
	//    2    4:invokevirtual   #26  <Method void ListenerHolder.clear()>
	//    3    7:return          
	}

	public ListenerHolder.ListenerKey getListenerKey()
	{
		return zzls.getListenerKey();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ListenerHolder zzls>
	//    2    4:invokevirtual   #30  <Method ListenerHolder$ListenerKey ListenerHolder.getListenerKey()>
	//    3    7:areturn         
	}

	protected abstract void registerListener(com.google.android.gms.common.api.Api.AnyClient anyclient, TaskCompletionSource taskcompletionsource)
		throws RemoteException;

	private final ListenerHolder zzls;
}
