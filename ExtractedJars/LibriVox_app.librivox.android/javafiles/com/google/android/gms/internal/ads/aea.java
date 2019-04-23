// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bmm, adx, bml

final class aea
	implements bmm
{

	aea(adx adx1, bmm bmm1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = adx1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field adx a>
		b = bmm1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field bmm b>
	//    8   14:return          
	}

	public final bml a()
	{
		return a.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field adx a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field bmm b>
	//    4    8:invokevirtual   #26  <Method bml adx.a(bmm)>
	//    5   11:areturn         
	}

	private final adx a;
	private final bmm b;
}
