// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;


// Referenced classes of package com.google.android.gms.tasks:
//			OnTokenCanceledListener, TaskCompletionSource, zzu

final class zzs
	implements OnTokenCanceledListener
{

	zzs(TaskCompletionSource taskcompletionsource)
	{
		zzv = taskcompletionsource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field TaskCompletionSource zzv>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onCanceled()
	{
		TaskCompletionSource.zza(zzv).zza();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field TaskCompletionSource zzv>
	//    2    4:invokestatic    #23  <Method zzu TaskCompletionSource.zza(TaskCompletionSource)>
	//    3    7:invokevirtual   #28  <Method boolean zzu.zza()>
	//    4   10:pop             
	//    5   11:return          
	}

	private final TaskCompletionSource zzv;
}
