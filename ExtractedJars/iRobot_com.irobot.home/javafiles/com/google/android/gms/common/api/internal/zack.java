// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			TaskApiCall, RemoteCall

final class zack extends TaskApiCall
{

	zack(TaskApiCall.Builder builder, Feature afeature[], boolean flag)
	{
		zakm = builder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #11  <Field TaskApiCall$Builder zakm>
		super(afeature, flag, ((zaci) (null)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:aconst_null     
	//    7    9:invokespecial   #14  <Method void TaskApiCall(Feature[], boolean, zaci)>
	//    8   12:return          
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient, TaskCompletionSource taskcompletionsource)
	{
		TaskApiCall.Builder.zaa(zakm).accept(((Object) (anyclient)), ((Object) (taskcompletionsource)));
	//    0    0:aload_0         
	//    1    1:getfield        #11  <Field TaskApiCall$Builder zakm>
	//    2    4:invokestatic    #23  <Method RemoteCall TaskApiCall$Builder.zaa(TaskApiCall$Builder)>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #29  <Method void RemoteCall.accept(Object, Object)>
	//    6   14:return          
	}

	private final TaskApiCall.Builder zakm;
}
