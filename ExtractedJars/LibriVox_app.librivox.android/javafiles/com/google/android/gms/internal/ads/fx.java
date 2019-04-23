// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bwo, fk, fy

final class fx extends bwo
{

	fx(fk fk1)
	{
		a = fk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field fk a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void bwo()>
	//    5    9:return          
	}

	public final void a()
	{
		fk.a(a).add(((Object) (new fy(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field fk a>
	//    2    4:invokestatic    #19  <Method List fk.a(fk)>
	//    3    7:new             #21  <Class fy>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #24  <Method void fy(fx)>
	//    7   15:invokeinterface #30  <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	private final fk a;
}
