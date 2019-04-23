// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal.ads:
//			add, ahb, ad, adc, 
//			acm

public abstract class acn
{

	public acn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	protected static boolean a(add add1)
	{
		return add1.u().e();
	//    0    0:aload_0         
	//    1    1:invokeinterface #18  <Method ahb add.u()>
	//    2    6:invokevirtual   #24  <Method boolean ahb.e()>
	//    3    9:ireturn         
	}

	public abstract acm a(Context context, add add1, int i, boolean flag, ad ad, adc adc);
}
