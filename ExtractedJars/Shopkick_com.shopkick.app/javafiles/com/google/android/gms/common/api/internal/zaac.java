// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaab, BasePendingResult

final class zaac
	implements com.google.android.gms.common.api.PendingResult.StatusListener
{

	zaac(zaab zaab1, BasePendingResult basependingresult)
	{
		zafm = zaab1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zaab zafm>
		zafl = basependingresult;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field BasePendingResult zafl>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void onComplete(Status status)
	{
		zaab.zaa(zafm).remove(((Object) (zafl)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zaab zafm>
	//    2    4:invokestatic    #28  <Method Map zaab.zaa(zaab)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field BasePendingResult zafl>
	//    5   11:invokeinterface #34  <Method Object Map.remove(Object)>
	//    6   16:pop             
	//    7   17:return          
	}

	private final BasePendingResult zafl;
	private final zaab zafm;
}
