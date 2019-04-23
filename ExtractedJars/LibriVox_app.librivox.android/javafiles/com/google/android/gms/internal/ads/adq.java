// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			adj

final class adq
	implements Runnable
{

	adq(adj adj1, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = adj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field adj a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int b>
		c = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #22  <Field int c>
	//   11   19:return          
	}

	public final void run()
	{
		a.b(b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field adj a>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field int b>
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field int c>
	//    6   12:invokevirtual   #29  <Method void adj.b(int, int)>
	//    7   15:return          
	}

	private final adj a;
	private final int b;
	private final int c;
}
