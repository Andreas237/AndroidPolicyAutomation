// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaak

final class zaal
	implements Runnable
{

	zaal(zaak zaak1)
	{
		zagi = zaak1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zaak zagi>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zaak.zab(zagi).cancelAvailabilityErrorNotifications(zaak.zaa(zagi));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zaak zagi>
	//    2    4:invokestatic    #23  <Method GoogleApiAvailabilityLight zaak.zab(zaak)>
	//    3    7:aload_0         
	//    4    8:getfield        #12  <Field zaak zagi>
	//    5   11:invokestatic    #27  <Method android.content.Context zaak.zaa(zaak)>
	//    6   14:invokevirtual   #33  <Method void GoogleApiAvailabilityLight.cancelAvailabilityErrorNotifications(android.content.Context)>
	//    7   17:return          
	}

	private final zaak zagi;
}
