// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bli, bld

public final class bln extends bli
{

	public bln()
	{
		this(((bld) (null)), 1L, 0L, 0L, 0L);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:lconst_1        
	//    3    3:lconst_0        
	//    4    4:lconst_0        
	//    5    5:lconst_0        
	//    6    6:invokespecial   #12  <Method void bln(bld, long, long, long, long)>
	//    7    9:return          
	}

	public bln(bld bld, long l, long l1, long l2, 
			long l3)
	{
		super(bld, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:invokespecial   #16  <Method void bli(bld, long, long)>
		d = l2;
	//    5    8:aload_0         
	//    6    9:lload           6
	//    7   11:putfield        #18  <Field long d>
		e = l3;
	//    8   14:aload_0         
	//    9   15:lload           8
	//   10   17:putfield        #20  <Field long e>
	//   11   20:return          
	}

	final long d;
	final long e;
}
