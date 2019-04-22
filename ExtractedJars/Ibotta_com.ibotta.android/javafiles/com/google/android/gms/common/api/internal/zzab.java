// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzaa, BasePendingResult

final class zzab
	implements com.google.android.gms.common.api.PendingResult.StatusListener
{

	zzab(zzaa zzaa1, BasePendingResult basependingresult)
	{
		zzgz = zzaa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzaa zzgz>
		zzgy = basependingresult;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field BasePendingResult zzgy>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void onComplete(Status status)
	{
		zzaa.zza(zzgz).remove(((Object) (zzgy)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzaa zzgz>
	//    2    4:invokestatic    #28  <Method Map zzaa.zza(zzaa)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field BasePendingResult zzgy>
	//    5   11:invokeinterface #34  <Method Object Map.remove(Object)>
	//    6   16:pop             
	//    7   17:return          
	}

	private final BasePendingResult zzgy;
	private final zzaa zzgz;
}
