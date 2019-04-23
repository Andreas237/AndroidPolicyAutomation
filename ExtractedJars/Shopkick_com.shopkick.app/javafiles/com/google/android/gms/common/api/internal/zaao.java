// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabf, zaan, zaak, zabd

final class zaao extends zabf
{

	zaao(zaan zaan1, zabd zabd, ConnectionResult connectionresult)
	{
		zagm = zaan1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zaan zagm>
		zagl = connectionresult;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #14  <Field ConnectionResult zagl>
		super(zabd);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #17  <Method void zabf(zabd)>
	//    9   15:return          
	}

	public final void zaan()
	{
		zaak.zaa(zagm.zagi, zagl);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zaan zagm>
	//    2    4:getfield        #29  <Field zaak zaan.zagi>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field ConnectionResult zagl>
	//    5   11:invokestatic    #35  <Method void zaak.zaa(zaak, ConnectionResult)>
	//    6   14:return          
	}

	private final ConnectionResult zagl;
	private final zaan zagm;
}
