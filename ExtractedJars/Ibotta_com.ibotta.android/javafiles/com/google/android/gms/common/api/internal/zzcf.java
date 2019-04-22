// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			TaskApiCall

final class zzcf extends TaskApiCall
{

	zzcf(TaskApiCall.Builder builder, Feature afeature[], boolean flag)
	{
		zzmc = builder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #11  <Field TaskApiCall$Builder zzmc>
		super(afeature, flag, ((zzce) (null)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:aconst_null     
	//    7    9:invokespecial   #14  <Method void TaskApiCall(Feature[], boolean, zzce)>
	//    8   12:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient, TaskCompletionSource taskcompletionsource)
		throws RemoteException
	{
		TaskApiCall.Builder.zza(zzmc).accept(((Object) (anyclient)), ((Object) (taskcompletionsource)));
	//    0    0:aload_0         
	//    1    1:getfield        #11  <Field TaskApiCall$Builder zzmc>
	//    2    4:invokestatic    #25  <Method BiConsumer TaskApiCall$Builder.zza(TaskApiCall$Builder)>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #31  <Method void BiConsumer.accept(Object, Object)>
	//    6   14:return          
	}

	private final TaskApiCall.Builder zzmc;
}
