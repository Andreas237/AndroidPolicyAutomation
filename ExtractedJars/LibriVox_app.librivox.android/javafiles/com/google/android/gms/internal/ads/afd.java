// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			add

final class afd
	implements Runnable
{

	afd(add add1, boolean flag, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = add1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field add a>
		b = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field boolean b>
		c = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #23  <Field long c>
	//   11   19:return          
	}

	public final void run()
	{
		a.a(b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field add a>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field boolean b>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field long c>
	//    6   12:invokeinterface #30  <Method void add.a(boolean, long)>
	//    7   17:return          
	}

	private final add a;
	private final boolean b;
	private final long c;
}
