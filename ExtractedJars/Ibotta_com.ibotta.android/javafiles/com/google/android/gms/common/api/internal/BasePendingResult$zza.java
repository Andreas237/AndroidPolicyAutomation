// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;


// Referenced classes of package com.google.android.gms.common.api.internal:
//			BasePendingResult, zzo

private final class BasePendingResult$zza
{

	protected final void finalize()
		throws Throwable
	{
		BasePendingResult.zzb(BasePendingResult.zza(zzfn));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field BasePendingResult zzfn>
	//    2    4:invokestatic    #26  <Method com.google.android.gms.common.api.Result BasePendingResult.zza(BasePendingResult)>
	//    3    7:invokestatic    #30  <Method void BasePendingResult.zzb(com.google.android.gms.common.api.Result)>
		super.finalize();
	//    4   10:aload_0         
	//    5   11:invokespecial   #32  <Method void Object.finalize()>
	//    6   14:return          
	}

	private final BasePendingResult zzfn;

	private BasePendingResult$zza(BasePendingResult basependingresult)
	{
		zzfn = basependingresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field BasePendingResult zzfn>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	BasePendingResult$zza(BasePendingResult basependingresult, zzo zzo)
	{
		this(basependingresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void BasePendingResult$zza(BasePendingResult)>
	//    3    5:return          
	}
}
