// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bli, blm, bnw, bld, 
//			ble

public abstract class blj extends bli
{

	public blj(bld bld, long l, long l1, int i, long l2, List list)
	{
		super(bld, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:invokespecial   #15  <Method void bli(bld, long, long)>
		d = i;
	//    5    8:aload_0         
	//    6    9:iload           6
	//    7   11:putfield        #17  <Field int d>
		e = l2;
	//    8   14:aload_0         
	//    9   15:lload           7
	//   10   17:putfield        #19  <Field long e>
		f = list;
	//   11   20:aload_0         
	//   12   21:aload           9
	//   13   23:putfield        #21  <Field List f>
	//   14   26:return          
	}

	public abstract int a(long l);

	public final long a(int i)
	{
		List list = f;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List f>
	//    2    4:astore          4
		long l;
		if(list != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          39
			l = ((blm)list.get(i - d)).a - c;
	//    5   11:aload           4
	//    6   13:iload_1         
	//    7   14:aload_0         
	//    8   15:getfield        #17  <Field int d>
	//    9   18:isub            
	//   10   19:invokeinterface #31  <Method Object List.get(int)>
	//   11   24:checkcast       #33  <Class blm>
	//   12   27:getfield        #35  <Field long blm.a>
	//   13   30:aload_0         
	//   14   31:getfield        #38  <Field long c>
	//   15   34:lsub            
	//   16   35:lstore_2        
		else
	//*  17   36:goto            52
			l = (long)(i - d) * e;
	//   18   39:iload_1         
	//   19   40:aload_0         
	//   20   41:getfield        #17  <Field int d>
	//   21   44:isub            
	//   22   45:i2l             
	//   23   46:aload_0         
	//   24   47:getfield        #19  <Field long e>
	//   25   50:lmul            
	//   26   51:lstore_2        
		return bnw.a(l, 0xf4240L, b);
	//   27   52:lload_2         
	//   28   53:ldc2w           #39  <Long 0xf4240L>
	//   29   56:aload_0         
	//   30   57:getfield        #43  <Field long b>
	//   31   60:invokestatic    #48  <Method long bnw.a(long, long, long)>
	//   32   63:lreturn         
	}

	public abstract bld a(ble ble, int i);

	public boolean a()
	{
		return f != null;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List f>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	final int d;
	final long e;
	final List f;
}
