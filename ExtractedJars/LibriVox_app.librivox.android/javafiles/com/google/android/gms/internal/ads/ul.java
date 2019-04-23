// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			un, um

public final class ul
{

	private ul(un un1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		d = un.a(un1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #22  <Method String un.a(un)>
	//    5    9:putfield        #24  <Field String d>
		a = un.b(un1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #26  <Method String un.b(un)>
	//    9   17:putfield        #28  <Field String a>
		b = un.c(un1);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #31  <Method int un.c(un)>
	//   13   25:putfield        #33  <Field int b>
		c = un.d(un1);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #36  <Method long un.d(un)>
	//   17   33:putfield        #38  <Field long c>
	//   18   36:return          
	}

	ul(un un1, um um)
	{
		this(un1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void ul(un)>
	//    3    5:return          
	}

	public final String a;
	public final int b;
	public final long c;
	private final String d;
}
