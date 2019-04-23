// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			acm

final class acp
	implements Runnable
{

	private acp(acm acm1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = acm1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field acm a>
	//    5    9:return          
	}

	static Runnable a(acm acm1)
	{
		return ((Runnable) (new acp(acm1)));
	//    0    0:new             #2   <Class acp>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #19  <Method void acp(acm)>
	//    4    8:areturn         
	}

	public final void run()
	{
		a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field acm a>
	//    2    4:invokevirtual   #25  <Method void acm.b()>
	//    3    7:return          
	}

	private final acm a;
}
