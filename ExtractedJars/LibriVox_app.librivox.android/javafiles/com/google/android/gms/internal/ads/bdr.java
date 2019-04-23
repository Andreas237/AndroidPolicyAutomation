// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bcr

public final class bdr
{

	public bdr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public final long a()
	{
		return bcr.a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field long f>
	//    2    4:invokestatic    #27  <Method long bcr.a(long)>
	//    3    7:lreturn         
	}

	public final bdr a(Object obj, Object obj1, int i, long l, long l1, 
			boolean flag)
	{
		d = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field Object d>
		a = obj1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #32  <Field Object a>
		b = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #34  <Field int b>
		c = l;
	//    9   15:aload_0         
	//   10   16:lload           4
	//   11   18:putfield        #36  <Field long c>
		f = l1;
	//   12   21:aload_0         
	//   13   22:lload           6
	//   14   24:putfield        #22  <Field long f>
		e = false;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #38  <Field boolean e>
		return this;
	//   18   32:aload_0         
	//   19   33:areturn         
	}

	public Object a;
	public int b;
	public long c;
	private Object d;
	private boolean e;
	private long f;
}
