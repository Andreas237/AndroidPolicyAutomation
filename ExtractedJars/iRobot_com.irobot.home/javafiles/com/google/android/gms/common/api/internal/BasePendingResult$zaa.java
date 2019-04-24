// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;


// Referenced classes of package com.google.android.gms.common.api.internal:
//			BasePendingResult, zap

private final class BasePendingResult$zaa
{

	protected final void finalize()
	{
		BasePendingResult.zab(BasePendingResult.zaa(zaea));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field BasePendingResult zaea>
	//    2    4:invokestatic    #24  <Method com.google.android.gms.common.api.Result BasePendingResult.zaa(BasePendingResult)>
	//    3    7:invokestatic    #28  <Method void BasePendingResult.zab(com.google.android.gms.common.api.Result)>
		super.finalize();
	//    4   10:aload_0         
	//    5   11:invokespecial   #30  <Method void Object.finalize()>
	//    6   14:return          
	}

	private final BasePendingResult zaea;

	private BasePendingResult$zaa(BasePendingResult basependingresult)
	{
		zaea = basependingresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field BasePendingResult zaea>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	BasePendingResult$zaa(BasePendingResult basependingresult, zap zap)
	{
		this(basependingresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void BasePendingResult$zaa(BasePendingResult)>
	//    3    5:return          
	}
}
