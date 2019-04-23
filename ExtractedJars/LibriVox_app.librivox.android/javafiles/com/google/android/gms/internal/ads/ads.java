// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			adj

final class ads
	implements Runnable
{

	ads(adj adj1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = adj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field adj a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int b>
	//    8   14:return          
	}

	public final void run()
	{
		a.g(b);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field adj a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int b>
	//    4    8:invokevirtual   #27  <Method void adj.g(int)>
	//    5   11:return          
	}

	private final adj a;
	private final int b;
}
