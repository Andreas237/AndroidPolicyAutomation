// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bqo, brj

final class brl
	implements bqo
{

	brl(brj brj1)
	{
		a = brj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field brj a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void a(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
		{
			brj.b(a);
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field brj a>
	//    4    8:invokestatic    #22  <Method void brj.b(brj)>
			return;
	//    5   11:return          
		} else
		{
			brj.a(a);
	//    6   12:aload_0         
	//    7   13:getfield        #12  <Field brj a>
	//    8   16:invokestatic    #24  <Method void brj.a(brj)>
			return;
	//    9   19:return          
		}
	}

	private final brj a;
}
