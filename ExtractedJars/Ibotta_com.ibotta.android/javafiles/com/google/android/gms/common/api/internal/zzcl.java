// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzcn, zzck, BasePendingResult

final class zzcl
	implements zzcn
{

	zzcl(zzck zzck1)
	{
		zzmq = zzck1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzck zzmq>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zzc(BasePendingResult basependingresult)
	{
		zzmq.zzmo.remove(((Object) (basependingresult)));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzck zzmq>
	//    2    4:getfield        #24  <Field Set zzck.zzmo>
	//    3    7:aload_1         
	//    4    8:invokeinterface #30  <Method boolean Set.remove(Object)>
	//    5   13:pop             
	//    6   14:return          
	}

	private final zzck zzmq;
}
