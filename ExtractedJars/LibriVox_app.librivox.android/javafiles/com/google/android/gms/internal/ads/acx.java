// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			acl, acw

final class acx
	implements Runnable
{

	acx(acw acw, acl acl1)
	{
		a = acl1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field acl a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		a.g();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field acl a>
	//    2    4:invokeinterface #22  <Method void acl.g()>
	//    3    9:return          
	}

	private final acl a;
}
