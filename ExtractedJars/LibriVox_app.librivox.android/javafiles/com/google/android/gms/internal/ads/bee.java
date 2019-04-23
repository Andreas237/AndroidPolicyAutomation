// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bdy, bdx

final class bee
	implements Runnable
{

	bee(bdy bdy1, int i)
	{
		b = bdy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field bdy b>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #16  <Field int a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		bdy.a(b).a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field bdy b>
	//    2    4:invokestatic    #26  <Method bdx bdy.a(bdy)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field int a>
	//    5   11:invokeinterface #31  <Method void bdx.a(int)>
	//    6   16:return          
	}

	private final int a;
	private final bdy b;
}
