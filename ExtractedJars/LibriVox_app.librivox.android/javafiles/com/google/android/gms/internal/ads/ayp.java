// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ayr, abc, ayu, acd, 
//			xz

public class ayp extends ayr
	implements abc
{

	public ayp(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ayr()>
		g = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String g>
	//    5    9:return          
	}

	public final String a()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String g>
	//    2    4:areturn         
	}

	public final void a(acd acd)
	{
		f = acd;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field acd f>
	//    3    5:return          
	}

	public final void a(ayu ayu1, long l, xz xz)
	{
		b = ayu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field ayu b>
		c = ayu1.b();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokeinterface #37  <Method long ayu.b()>
	//    6   12:putfield        #40  <Field long c>
		long l1 = c;
	//    7   15:aload_0         
	//    8   16:getfield        #40  <Field long c>
	//    9   19:lstore          6
		int j;
		if(!h && 8L + l < 0x0L)
	//*  10   21:aload_0         
	//*  11   22:getfield        #42  <Field boolean h>
	//*  12   25:ifne            50
	//*  13   28:ldc2w           #43  <Long 8L>
	//*  14   31:lload_2         
	//*  15   32:ladd            
	//*  16   33:ldc2w           #45  <Long 0x0L>
	//*  17   36:lcmp            
	//*  18   37:iflt            43
	//*  19   40:goto            50
			j = 8;
	//   20   43:bipush          8
	//   21   45:istore          5
		else
	//*  22   47:goto            54
			j = 16;
	//   23   50:bipush          16
	//   24   52:istore          5
		d = l1 - (long)j;
	//   25   54:aload_0         
	//   26   55:lload           6
	//   27   57:iload           5
	//   28   59:i2l             
	//   29   60:lsub            
	//   30   61:putfield        #49  <Field long d>
		ayu1.a(ayu1.b() + l);
	//   31   64:aload_1         
	//   32   65:aload_1         
	//   33   66:invokeinterface #37  <Method long ayu.b()>
	//   34   71:lload_2         
	//   35   72:ladd            
	//   36   73:invokeinterface #52  <Method void ayu.a(long)>
		e = ayu1.b();
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:invokeinterface #37  <Method long ayu.b()>
	//   40   85:putfield        #55  <Field long e>
		a = xz;
	//   41   88:aload_0         
	//   42   89:aload           4
	//   43   91:putfield        #58  <Field xz a>
	//   44   94:return          
	}

	public final void a(ayu ayu1, ByteBuffer bytebuffer, long l, xz xz)
	{
		i = ayu1.b() - (long)bytebuffer.remaining();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #37  <Method long ayu.b()>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #65  <Method int ByteBuffer.remaining()>
	//    5   11:i2l             
	//    6   12:lsub            
	//    7   13:putfield        #67  <Field long i>
		boolean flag;
		if(bytebuffer.remaining() == 16)
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #65  <Method int ByteBuffer.remaining()>
	//*  10   20:bipush          16
	//*  11   22:icmpne          31
			flag = true;
	//   12   25:iconst_1        
	//   13   26:istore          6
		else
	//*  14   28:goto            34
			flag = false;
	//   15   31:iconst_0        
	//   16   32:istore          6
		h = flag;
	//   17   34:aload_0         
	//   18   35:iload           6
	//   19   37:putfield        #42  <Field boolean h>
		((ayr)this).a(ayu1, l, xz);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:lload_3         
	//   23   43:aload           5
	//   24   45:invokevirtual   #69  <Method void ayr.a(ayu, long, xz)>
	//   25   48:return          
	}

	private acd f;
	private String g;
	private boolean h;
	private long i;
}
