// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aap, wi

final class aar
	implements aap
{

	aar(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field String a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void a(Object obj)
	{
	//    0    0:return          
	}

	public final void a(Throwable throwable)
	{
		aw.i().a(throwable, a);
	//    0    0:invokestatic    #26  <Method wi aw.i()>
	//    1    3:aload_1         
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field String a>
	//    4    8:invokevirtual   #31  <Method void wi.a(Throwable, String)>
	//    5   11:return          
	}

	private final String a;
}
