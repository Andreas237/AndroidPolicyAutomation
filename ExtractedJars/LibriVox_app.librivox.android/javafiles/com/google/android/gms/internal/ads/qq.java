// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bsf, bvi, bvg, bvj

final class qq
	implements bsf
{

	qq(bvj bvj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = bvj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field bvj a>
	//    5    9:return          
	}

	public final void a(bvi bvi1)
	{
		bvj bvj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field bvj a>
	//    2    4:astore_2        
		bvi1.c.b = bvj;
	//    3    5:aload_1         
	//    4    6:getfield        #23  <Field bvg bvi.c>
	//    5    9:aload_2         
	//    6   10:putfield        #28  <Field bvj bvg.b>
	//    7   13:return          
	}

	private final bvj a;
}
