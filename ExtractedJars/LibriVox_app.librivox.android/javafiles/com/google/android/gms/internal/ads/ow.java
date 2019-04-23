// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aan, ov, abe

final class ow
	implements aan
{

	ow(ov ov1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = ov1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ov a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String b>
	//    8   14:return          
	}

	public final abe a(Object obj)
	{
		return a.a(b, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ov a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field String b>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #26  <Method abe ov.a(String, Object)>
	//    6   12:areturn         
	}

	private final ov a;
	private final String b;
}
