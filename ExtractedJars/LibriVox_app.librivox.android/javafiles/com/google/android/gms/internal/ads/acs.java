// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aco

final class acs
	implements Runnable
{

	acs(aco aco1)
	{
		a = aco1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field aco a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		aco.a(a, "surfaceDestroyed", new String[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field aco a>
	//    2    4:ldc1            #19  <String "surfaceDestroyed">
	//    3    6:iconst_0        
	//    4    7:anewarray       String[]
	//    5   10:invokestatic    #26  <Method void aco.a(aco, String, String[])>
	//    6   13:return          
	}

	private final aco a;
}
