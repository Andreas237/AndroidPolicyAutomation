// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aca, acl

final class ach
	implements Runnable
{

	ach(aca aca1, int i, int j)
	{
		c = aca1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field aca c>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #17  <Field int a>
		b = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #19  <Field int b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #22  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		if(aca.a(c) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field aca c>
	//*   2    4:invokestatic    #29  <Method acl aca.a(aca)>
	//*   3    7:ifnull          30
			aca.a(c).a(a, b);
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field aca c>
	//    6   14:invokestatic    #29  <Method acl aca.a(aca)>
	//    7   17:aload_0         
	//    8   18:getfield        #17  <Field int a>
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field int b>
	//   11   25:invokeinterface #34  <Method void acl.a(int, int)>
	//   12   30:return          
	}

	private final int a;
	private final int b;
	private final aca c;
}
