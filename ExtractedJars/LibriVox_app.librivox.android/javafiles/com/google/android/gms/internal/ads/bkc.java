// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bjs, bnf, bml, bmp, 
//			zzfs

public abstract class bkc extends bjs
{

	public bkc(bml bml, bmp bmp, zzfs zzfs, int j, Object obj, long l, 
			long l1, int k)
	{
		super(bml, bmp, 1, zzfs, j, obj, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:aload_3         
	//    5    5:iload           4
	//    6    7:aload           5
	//    7    9:lload           6
	//    8   11:lload           8
	//    9   13:invokespecial   #11  <Method void bjs(bml, bmp, int, zzfs, int, Object, long, long)>
		bnf.a(((Object) (zzfs)));
	//   10   16:aload_3         
	//   11   17:invokestatic    #17  <Method Object bnf.a(Object)>
	//   12   20:pop             
		i = k;
	//   13   21:aload_0         
	//   14   22:iload           10
	//   15   24:putfield        #19  <Field int i>
	//   16   27:return          
	}

	public int f()
	{
		return i + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int i>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public abstract boolean g();

	public final int i;
}
