// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zacs, zacp, BasePendingResult

final class zacq
	implements zacs
{

	zacq(zacp zacp1)
	{
		zala = zacp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zacp zala>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zac(BasePendingResult basependingresult)
	{
		zala.zaky.remove(((Object) (basependingresult)));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zacp zala>
	//    2    4:getfield        #24  <Field Set zacp.zaky>
	//    3    7:aload_1         
	//    4    8:invokeinterface #30  <Method boolean Set.remove(Object)>
	//    5   13:pop             
	//    6   14:return          
	}

	private final zacp zala;
}
