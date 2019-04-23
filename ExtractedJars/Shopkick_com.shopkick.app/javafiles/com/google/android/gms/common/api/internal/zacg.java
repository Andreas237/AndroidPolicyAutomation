// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zaj;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zace

final class zacg
	implements Runnable
{

	zacg(zace zace1, zaj zaj)
	{
		zakj = zace1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zace zakj>
		zagq = zaj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zaj zagq>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zace.zaa(zakj, zagq);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zace zakj>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field zaj zagq>
	//    4    8:invokestatic    #26  <Method void zace.zaa(zace, zaj)>
	//    5   11:return          
	}

	private final zaj zagq;
	private final zace zakj;
}
