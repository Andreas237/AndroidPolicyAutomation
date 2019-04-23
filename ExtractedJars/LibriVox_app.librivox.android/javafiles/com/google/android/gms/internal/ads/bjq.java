// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bkc, bjr, bml, bmp, 
//			zzfs

public abstract class bjq extends bkc
{

	public bjq(bml bml, bmp bmp, zzfs zzfs, int i, Object obj, long l, 
			long l1, int i1)
	{
		super(bml, bmp, zzfs, i, obj, l, l1, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:lload           6
	//    7   10:lload           8
	//    8   12:iload           10
	//    9   14:invokespecial   #12  <Method void bkc(bml, bmp, zzfs, int, Object, long, long, int)>
	//   10   17:return          
	}

	public final int a(int i)
	{
		return k[i];
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int[] k>
	//    2    4:iload_1         
	//    3    5:iaload          
	//    4    6:ireturn         
	}

	public final void a(bjr bjr1)
	{
		j = bjr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field bjr j>
		k = bjr1.a();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #25  <Method int[] bjr.a()>
	//    6   10:putfield        #17  <Field int[] k>
	//    7   13:return          
	}

	protected final bjr d()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field bjr j>
	//    2    4:areturn         
	}

	private bjr j;
	private int k[];
}
