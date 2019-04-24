// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;


// Referenced classes of package com.google.android.gms.tasks:
//			CancellationToken, zzu, Task, zzb, 
//			OnTokenCanceledListener

final class zza extends CancellationToken
{

	zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void CancellationToken()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class zzu>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void zzu()>
	//    6   12:putfield        #16  <Field zzu zza>
	//    7   15:return          
	}

	public final void cancel()
	{
		zza.trySetResult(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzu zza>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #22  <Method boolean zzu.trySetResult(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final boolean isCancellationRequested()
	{
		return ((Task) (zza)).isComplete();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzu zza>
	//    2    4:invokevirtual   #29  <Method boolean Task.isComplete()>
	//    3    7:ireturn         
	}

	public final CancellationToken onCanceledRequested(OnTokenCanceledListener ontokencanceledlistener)
	{
		((Task) (zza)).addOnSuccessListener(((OnSuccessListener) (new zzb(this, ontokencanceledlistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzu zza>
	//    2    4:new             #33  <Class zzb>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #36  <Method void zzb(zza, OnTokenCanceledListener)>
	//    7   13:invokevirtual   #40  <Method Task Task.addOnSuccessListener(OnSuccessListener)>
	//    8   16:pop             
		return ((CancellationToken) (this));
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	private final zzu zza = new zzu();
}
