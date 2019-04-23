// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			adj

final class adk
	implements Runnable
{

	adk(adj adj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = adj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field adj a>
	//    5    9:return          
	}

	public final void run()
	{
		a.k();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field adj a>
	//    2    4:invokevirtual   #22  <Method void adj.k()>
	//    3    7:return          
	}

	private final adj a;
}
