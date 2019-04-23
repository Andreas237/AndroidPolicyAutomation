// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;


// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabf, zaah, zabd

final class zaai extends zabf
{

	zaai(zaah zaah1, zabd zabd)
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
		zafu.onConnectionSuspended(1);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zaah zafu>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #22  <Method void zaah.onConnectionSuspended(int)>
	//    4    8:return          
	}

	private final zaah zafu;
}
