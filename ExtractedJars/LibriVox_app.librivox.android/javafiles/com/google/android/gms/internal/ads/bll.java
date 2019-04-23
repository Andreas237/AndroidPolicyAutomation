// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			blj, bnw, bld, ble, 
//			zzfs, blq, blm

public final class bll extends blj
{

	public bll(bld bld1, long l, long l1, int i, long l2, List list, blq blq1, blq blq2)
	{
		super(bld1, l, l1, i, l2, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:iload           6
	//    5    7:lload           7
	//    6    9:aload           9
	//    7   11:invokespecial   #12  <Method void blj(bld, long, long, int, long, List)>
		g = blq1;
	//    8   14:aload_0         
	//    9   15:aload           10
	//   10   17:putfield        #14  <Field blq g>
		h = blq2;
	//   11   20:aload_0         
	//   12   21:aload           11
	//   13   23:putfield        #16  <Field blq h>
	//   14   26:return          
	}

	public final int a(long l)
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field List f>
	//*   2    4:ifnull          17
			return f.size();
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field List f>
	//    5   11:invokeinterface #29  <Method int List.size()>
	//    6   16:ireturn         
		if(l != 0x1L)
	//*   7   17:lload_1         
	//*   8   18:ldc2w           #30  <Long 0x1L>
	//*   9   21:lcmp            
	//*  10   22:ifeq            44
			return (int)bnw.a(l, (e * 0xf4240L) / b);
	//   11   25:lload_1         
	//   12   26:aload_0         
	//   13   27:getfield        #35  <Field long e>
	//   14   30:ldc2w           #36  <Long 0xf4240L>
	//   15   33:lmul            
	//   16   34:aload_0         
	//   17   35:getfield        #40  <Field long b>
	//   18   38:ldiv            
	//   19   39:invokestatic    #45  <Method long bnw.a(long, long)>
	//   20   42:l2i             
	//   21   43:ireturn         
		else
			return -1;
	//   22   44:iconst_m1       
	//   23   45:ireturn         
	}

	public final bld a(ble ble1)
	{
		blq blq1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field blq g>
	//    2    4:astore_2        
		if(blq1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          41
			return new bld(blq1.a(ble1.a.a, 0, ble1.a.b, 0L), 0L, -1L);
	//    5    9:new             #48  <Class bld>
	//    6   12:dup             
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:getfield        #53  <Field zzfs ble.a>
	//   10   18:getfield        #58  <Field String zzfs.a>
	//   11   21:iconst_0        
	//   12   22:aload_1         
	//   13   23:getfield        #53  <Field zzfs ble.a>
	//   14   26:getfield        #61  <Field int zzfs.b>
	//   15   29:lconst_0        
	//   16   30:invokevirtual   #66  <Method String blq.a(String, int, int, long)>
	//   17   33:lconst_0        
	//   18   34:ldc2w           #67  <Long -1L>
	//   19   37:invokespecial   #71  <Method void bld(String, long, long)>
	//   20   40:areturn         
		else
			return super.a(ble1);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:invokespecial   #73  <Method bld blj.a(ble)>
	//   24   46:areturn         
	}

	public final bld a(ble ble1, int i)
	{
		long l;
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field List f>
	//*   2    4:ifnull          32
			l = ((blm)f.get(i - d)).a;
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field List f>
	//    5   11:iload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #77  <Field int d>
	//    8   16:isub            
	//    9   17:invokeinterface #81  <Method Object List.get(int)>
	//   10   22:checkcast       #83  <Class blm>
	//   11   25:getfield        #85  <Field long blm.a>
	//   12   28:lstore_3        
		else
	//*  13   29:goto            45
			l = (long)(i - d) * e;
	//   14   32:iload_2         
	//   15   33:aload_0         
	//   16   34:getfield        #77  <Field int d>
	//   17   37:isub            
	//   18   38:i2l             
	//   19   39:aload_0         
	//   20   40:getfield        #35  <Field long e>
	//   21   43:lmul            
	//   22   44:lstore_3        
		return new bld(h.a(ble1.a.a, i, ble1.a.b, l), 0L, -1L);
	//   23   45:new             #48  <Class bld>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:getfield        #16  <Field blq h>
	//   27   53:aload_1         
	//   28   54:getfield        #53  <Field zzfs ble.a>
	//   29   57:getfield        #58  <Field String zzfs.a>
	//   30   60:iload_2         
	//   31   61:aload_1         
	//   32   62:getfield        #53  <Field zzfs ble.a>
	//   33   65:getfield        #61  <Field int zzfs.b>
	//   34   68:lload_3         
	//   35   69:invokevirtual   #66  <Method String blq.a(String, int, int, long)>
	//   36   72:lconst_0        
	//   37   73:ldc2w           #67  <Long -1L>
	//   38   76:invokespecial   #71  <Method void bld(String, long, long)>
	//   39   79:areturn         
	}

	final blq g;
	final blq h;
}
