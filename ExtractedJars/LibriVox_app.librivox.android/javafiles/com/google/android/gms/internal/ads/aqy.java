// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			arh, ara, aqr, aqq

final class aqy
{

	private aqy(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		b = new byte[i];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:newarray        byte[]
	//    5    8:putfield        #15  <Field byte[] b>
		a = arh.a(b);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #15  <Field byte[] b>
	//    9   16:invokestatic    #20  <Method arh arh.a(byte[])>
	//   10   19:putfield        #22  <Field arh a>
	//   11   22:return          
	}

	aqy(int i, aqr aqr)
	{
		this(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #26  <Method void aqy(int)>
	//    3    5:return          
	}

	public final aqq a()
	{
		a.c();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field arh a>
	//    2    4:invokevirtual   #30  <Method void arh.c()>
		return ((aqq) (new ara(b)));
	//    3    7:new             #32  <Class ara>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field byte[] b>
	//    7   15:invokespecial   #35  <Method void ara(byte[])>
	//    8   18:areturn         
	}

	public final arh b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field arh a>
	//    2    4:areturn         
	}

	private final arh a;
	private final byte b[];
}
