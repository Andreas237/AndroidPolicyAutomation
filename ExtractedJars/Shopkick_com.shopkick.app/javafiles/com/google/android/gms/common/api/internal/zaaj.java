// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;


// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabf, zaah, zabe, zabt, 
//			zabd

final class zaaj extends zabf
{

	zaaj(zaah zaah1, zabd zabd)
	{
		zafu = zaah1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zaah zafu>
		super(zabd);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zabf(zabd)>
	//    6   10:return          
	}

	public final void zaan()
	{
		zaah.zaa(zafu).zahs.zab(((android.os.Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zaah zafu>
	//    2    4:invokestatic    #22  <Method zabe zaah.zaa(zaah)>
	//    3    7:getfield        #28  <Field zabt zabe.zahs>
	//    4   10:aconst_null     
	//    5   11:invokeinterface #34  <Method void zabt.zab(android.os.Bundle)>
	//    6   16:return          
	}

	private final zaah zafu;
}
