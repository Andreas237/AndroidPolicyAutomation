// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aco

final class acq
	implements Runnable
{

	acq(aco aco1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = aco1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field aco a>
		b = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field boolean b>
	//    8   14:return          
	}

	public final void run()
	{
		a.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field aco a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field boolean b>
	//    4    8:invokevirtual   #26  <Method void aco.a(boolean)>
	//    5   11:return          
	}

	private final aco a;
	private final boolean b;
}
