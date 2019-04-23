// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.a;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bxi

public final class bvt extends bxi
{

	public bvt(a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void bxi()>
		a = a1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field a a>
	//    5    9:return          
	}

	public final void a()
	{
		a a1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field a a>
	//    2    4:astore_1        
		if(a1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			a1.a();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #19  <Method void a.a()>
	//    7   13:return          
	}

	private final a a;
}
