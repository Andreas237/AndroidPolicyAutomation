// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bxl, fk, fu

final class ft extends bxl
{

	ft(fk fk1)
	{
		a = fk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field fk a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void bxl()>
	//    5    9:return          
	}

	public final void a(String s, String s1)
	{
		fk.a(a).add(((Object) (new fu(this, s, s1))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field fk a>
	//    2    4:invokestatic    #20  <Method List fk.a(fk)>
	//    3    7:new             #22  <Class fu>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #25  <Method void fu(ft, String, String)>
	//    9   17:invokeinterface #31  <Method boolean List.add(Object)>
	//   10   22:pop             
	//   11   23:return          
	}

	private final fk a;
}
