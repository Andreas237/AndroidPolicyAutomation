// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			RegisterListenerMethod, RemoteCall, ListenerHolder

final class zaca extends RegisterListenerMethod
{

	zaca(RegistrationMethods.Builder builder, ListenerHolder listenerholder, Feature afeature[], boolean flag)
	{
		zakg = builder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #11  <Field RegistrationMethods$Builder zakg>
		super(listenerholder, afeature, flag);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #14  <Method void RegisterListenerMethod(ListenerHolder, Feature[], boolean)>
	//    8   13:return          
	}

	protected final void registerListener(com.google.android.gms.common.api.Api.AnyClient anyclient, TaskCompletionSource taskcompletionsource)
	{
		RegistrationMethods.Builder.zaa(zakg).accept(((Object) (anyclient)), ((Object) (taskcompletionsource)));
	//    0    0:aload_0         
	//    1    1:getfield        #11  <Field RegistrationMethods$Builder zakg>
	//    2    4:invokestatic    #23  <Method RemoteCall RegistrationMethods$Builder.zaa(RegistrationMethods$Builder)>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #29  <Method void RemoteCall.accept(Object, Object)>
	//    6   14:return          
	}

	private final RegistrationMethods.Builder zakg;
}
