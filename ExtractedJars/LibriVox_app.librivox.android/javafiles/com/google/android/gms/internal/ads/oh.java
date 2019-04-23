// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			wt, og

final class oh
	implements Runnable
{

	oh(og og)
	{
		a = og;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field og a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		((wt) (a)).b_();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field og a>
	//    2    4:invokevirtual   #22  <Method void wt.b_()>
	//    3    7:return          
	}

	private final og a;
}
