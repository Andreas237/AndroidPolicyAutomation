// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			UnregisterListenerMethod, RemoteCall

final class zacb extends UnregisterListenerMethod
{

	zacb(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerkey)
	{
		zakg = builder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #11  <Field RegistrationMethods$Builder zakg>
		super(listenerkey);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #14  <Method void UnregisterListenerMethod(ListenerHolder$ListenerKey)>
	//    6   10:return          
	}

	protected final void unregisterListener(com.google.android.gms.common.api.Api.AnyClient anyclient, TaskCompletionSource taskcompletionsource)
		throws RemoteException
	{
		RegistrationMethods.Builder.zab(zakg).accept(((Object) (anyclient)), ((Object) (taskcompletionsource)));
	//    0    0:aload_0         
	//    1    1:getfield        #11  <Field RegistrationMethods$Builder zakg>
	//    2    4:invokestatic    #25  <Method RemoteCall RegistrationMethods$Builder.zab(RegistrationMethods$Builder)>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #31  <Method void RemoteCall.accept(Object, Object)>
	//    6   14:return          
	}

	private final RegistrationMethods.Builder zakg;
}
