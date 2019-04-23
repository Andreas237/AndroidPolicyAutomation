// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.a.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ak, af, ag

public final class am extends ak
{

	public am(c c1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void ak()>
		a = c1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field c a>
	//    5    9:return          
	}

	public final void a(ag ag)
	{
		a.a(((com.google.android.gms.ads.a.b) (new af(ag))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field c a>
	//    2    4:new             #18  <Class af>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #20  <Method void af(ag)>
	//    6   12:invokeinterface #25  <Method void c.a(com.google.android.gms.ads.a.b)>
	//    7   17:return          
	}

	private final c a;
}
