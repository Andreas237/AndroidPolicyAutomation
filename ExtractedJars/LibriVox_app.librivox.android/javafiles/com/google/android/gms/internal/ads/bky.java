// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			blc, bcr, blr

public final class bky
{

	public bky(long l, long l1, long l2, boolean flag, 
			long l3, long l4, long l5, blr blr, 
			Uri uri, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #26  <Field long a>
		h = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #28  <Field long h>
		i = l2;
	//    8   14:aload_0         
	//    9   15:lload           5
	//   10   17:putfield        #30  <Field long i>
		b = flag;
	//   11   20:aload_0         
	//   12   21:iload           7
	//   13   23:putfield        #32  <Field boolean b>
		c = l3;
	//   14   26:aload_0         
	//   15   27:lload           8
	//   16   29:putfield        #34  <Field long c>
		d = l4;
	//   17   32:aload_0         
	//   18   33:lload           10
	//   19   35:putfield        #36  <Field long d>
		e = l5;
	//   20   38:aload_0         
	//   21   39:lload           12
	//   22   41:putfield        #38  <Field long e>
		f = blr;
	//   23   44:aload_0         
	//   24   45:aload           14
	//   25   47:putfield        #40  <Field blr f>
		g = uri;
	//   26   50:aload_0         
	//   27   51:aload           15
	//   28   53:putfield        #42  <Field Uri g>
		j = list;
	//   29   56:aload_0         
	//   30   57:aload           16
	//   31   59:putfield        #44  <Field List j>
	//   32   62:return          
	}

	public final int a()
	{
		return j.size();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field List j>
	//    2    4:invokeinterface #51  <Method int List.size()>
	//    3    9:ireturn         
	}

	public final blc a(int k)
	{
		return (blc)j.get(k);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field List j>
	//    2    4:iload_1         
	//    3    5:invokeinterface #56  <Method Object List.get(int)>
	//    4   10:checkcast       #58  <Class blc>
	//    5   13:areturn         
	}

	public final long b(int k)
	{
		long l;
		if(k == j.size() - 1)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #44  <Field List j>
	//*   3    5:invokeinterface #51  <Method int List.size()>
	//*   4   10:iconst_1        
	//*   5   11:isub            
	//*   6   12:icmpne          57
		{
			l = h;
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field long h>
	//    9   19:lstore_2        
			if(l == 0x1L)
	//*  10   20:lload_2         
	//*  11   21:ldc2w           #60  <Long 0x1L>
	//*  12   24:lcmp            
	//*  13   25:ifne            35
				l = 0x1L;
	//   14   28:ldc2w           #60  <Long 0x1L>
	//   15   31:lstore_2        
			else
	//*  16   32:goto            93
				l -= ((blc)j.get(k)).b;
	//   17   35:lload_2         
	//   18   36:aload_0         
	//   19   37:getfield        #44  <Field List j>
	//   20   40:iload_1         
	//   21   41:invokeinterface #56  <Method Object List.get(int)>
	//   22   46:checkcast       #58  <Class blc>
	//   23   49:getfield        #63  <Field long blc.b>
	//   24   52:lsub            
	//   25   53:lstore_2        
		} else
	//*  26   54:goto            93
		{
			l = ((blc)j.get(k + 1)).b - ((blc)j.get(k)).b;
	//   27   57:aload_0         
	//   28   58:getfield        #44  <Field List j>
	//   29   61:iload_1         
	//   30   62:iconst_1        
	//   31   63:iadd            
	//   32   64:invokeinterface #56  <Method Object List.get(int)>
	//   33   69:checkcast       #58  <Class blc>
	//   34   72:getfield        #63  <Field long blc.b>
	//   35   75:aload_0         
	//   36   76:getfield        #44  <Field List j>
	//   37   79:iload_1         
	//   38   80:invokeinterface #56  <Method Object List.get(int)>
	//   39   85:checkcast       #58  <Class blc>
	//   40   88:getfield        #63  <Field long blc.b>
	//   41   91:lsub            
	//   42   92:lstore_2        
		}
		return bcr.b(l);
	//   43   93:lload_2         
	//   44   94:invokestatic    #68  <Method long bcr.b(long)>
	//   45   97:lreturn         
	}

	public final long a;
	public final boolean b;
	public final long c;
	public final long d;
	public final long e;
	public final blr f;
	public final Uri g;
	private final long h;
	private final long i;
	private final List j;
}
