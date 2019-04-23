// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bkf, bku, bmm, bnb, 
//			bky, bmc, bke

public final class bkv
	implements bkf
{

	public bkv(bmm bmm1)
	{
		this(bmm1, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #15  <Method void bkv(bmm, int)>
	//    4    6:return          
	}

	private bkv(bmm bmm1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		a = bmm1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field bmm a>
		b = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #23  <Field int b>
	//    8   14:return          
	}

	public final bke a(bnb bnb, bky bky, int i, int ai[], bmc bmc, int j, long l, boolean flag, boolean flag1)
	{
		return ((bke) (new bku(bnb, bky, i, ai, bmc, j, a.a(), l, b, flag, flag1)));
	//    0    0:new             #26  <Class bku>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:iload           6
	//    8   13:aload_0         
	//    9   14:getfield        #21  <Field bmm a>
	//   10   17:invokeinterface #31  <Method bml bmm.a()>
	//   11   22:lload           7
	//   12   24:aload_0         
	//   13   25:getfield        #23  <Field int b>
	//   14   28:iload           9
	//   15   30:iload           10
	//   16   32:invokespecial   #34  <Method void bku(bnb, bky, int, int[], bmc, int, bml, long, int, boolean, boolean)>
	//   17   35:areturn         
	}

	private final bmm a;
	private final int b;
}
