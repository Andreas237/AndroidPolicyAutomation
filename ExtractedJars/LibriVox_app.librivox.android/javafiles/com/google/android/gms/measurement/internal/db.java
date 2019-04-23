// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;


// Referenced classes of package com.google.android.gms.measurement.internal:
//			fe, bt, s, u, 
//			cv, bv

final class db extends fe
{

	db(cv cv, bv bv)
	{
		a = cv;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field cv a>
		super(bv);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void fe(bv)>
	//    6   10:return          
	}

	public final void a()
	{
		((bt) (a)).r().i().a("Tasks have been queued for a long time");
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field cv a>
	//    2    4:invokevirtual   #21  <Method s bt.r()>
	//    3    7:invokevirtual   #27  <Method u s.i()>
	//    4   10:ldc1            #29  <String "Tasks have been queued for a long time">
	//    5   12:invokevirtual   #34  <Method void u.a(String)>
	//    6   15:return          
	}

	private final cv a;
}
