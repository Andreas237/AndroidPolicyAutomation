// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aan, afn, pt, abe

final class pu
	implements aan
{

	pu(pt pt1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = pt1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field pt a>
	//    5    9:return          
	}

	public final abe a(Object obj)
	{
		return a.a((afn)obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field pt a>
	//    2    4:aload_1         
	//    3    5:checkcast       #19  <Class afn>
	//    4    8:invokevirtual   #24  <Method abe pt.a(afn)>
	//    5   11:areturn         
	}

	private final pt a;
}
