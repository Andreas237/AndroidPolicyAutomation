// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zaj;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabf, zaak, zaar, zabd

final class zaas extends zabf
{

	zaas(zaar zaar, zabd zabd, zaak zaak1, zaj zaj)
	{
		zagp = zaak1;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #12  <Field zaak zagp>
		zagq = zaj;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #14  <Field zaj zagq>
		super(zabd);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #17  <Method void zabf(zabd)>
	//    9   16:return          
	}

	public final void zaan()
	{
		zaak.zaa(zagp, zagq);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zaak zagp>
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field zaj zagq>
	//    4    8:invokestatic    #26  <Method void zaak.zaa(zaak, zaj)>
	//    5   11:return          
	}

	private final zaak zagp;
	private final zaj zagq;
}
