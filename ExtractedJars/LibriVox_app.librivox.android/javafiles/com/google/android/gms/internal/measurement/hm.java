// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			hn, dc

final class hm
	implements hn
{

	hm(dc dc1)
	{
		a = dc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field dc a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final byte a(int i)
	{
		return a.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field dc a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #21  <Method byte dc.a(int)>
	//    4    8:ireturn         
	}

	public final int a()
	{
		return a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field dc a>
	//    2    4:invokevirtual   #24  <Method int dc.a()>
	//    3    7:ireturn         
	}

	private final dc a;
}
