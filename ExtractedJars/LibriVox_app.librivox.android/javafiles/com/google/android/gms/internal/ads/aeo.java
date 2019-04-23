// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aep, aen

final class aeo
	implements Runnable
{

	aeo(aen aen)
	{
		a = aen;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field aen a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		aw.C().b(a);
	//    0    0:invokestatic    #23  <Method aep aw.C()>
	//    1    3:aload_0         
	//    2    4:getfield        #12  <Field aen a>
	//    3    7:invokevirtual   #28  <Method void aep.b(aen)>
	//    4   10:return          
	}

	private final aen a;
}
