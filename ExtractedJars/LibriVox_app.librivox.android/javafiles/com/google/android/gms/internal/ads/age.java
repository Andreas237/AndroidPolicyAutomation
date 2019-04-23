// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			agd

final class age
	implements Runnable
{

	age(agd agd1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = agd1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field agd a>
		b = map;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Map b>
	//    8   14:return          
	}

	public final void run()
	{
		a.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field agd a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Map b>
	//    4    8:invokevirtual   #26  <Method void agd.a(Map)>
	//    5   11:return          
	}

	private final agd a;
	private final Map b;
}
