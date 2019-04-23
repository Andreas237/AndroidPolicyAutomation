// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bmg, bdn, bjo, bmh

public abstract class bmf
{

	public bmf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public abstract bmh a(bdn abdn[], bjo bjo);

	protected final void a()
	{
		bmg bmg1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field bmg a>
	//    2    4:astore_1        
		if(bmg1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			bmg1.c();
	//    5    9:aload_1         
	//    6   10:invokeinterface #19  <Method void bmg.c()>
	//    7   15:return          
	}

	public final void a(bmg bmg1)
	{
		a = bmg1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field bmg a>
	//    3    5:return          
	}

	public abstract void a(Object obj);

	private bmg a;
}
