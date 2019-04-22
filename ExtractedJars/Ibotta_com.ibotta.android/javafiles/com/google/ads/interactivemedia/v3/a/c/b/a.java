// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.c.b;


final class a
	implements c.a
{

	public a(long l, int i, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #18  <Field long a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #20  <Field int b>
		l = -1L;
	//    8   14:ldc2w           #21  <Long -1L>
	//    9   17:lstore_1        
		if(l1 != -1L)
	//*  10   18:lload           4
	//*  11   20:ldc2w           #21  <Long -1L>
	//*  12   23:lcmp            
	//*  13   24:ifne            30
	//*  14   27:goto            37
			l = a(l1);
	//   15   30:aload_0         
	//   16   31:lload           4
	//   17   33:invokevirtual   #25  <Method long a(long)>
	//   18   36:lstore_1        
		c = l;
	//   19   37:aload_0         
	//   20   38:lload_1         
	//   21   39:putfield        #27  <Field long c>
	//   22   42:return          
	}

	public long a(long l)
	{
		return (Math.max(0L, l - a) * 0xf4240L * 8L) / (long)b;
	//    0    0:lconst_0        
	//    1    1:lload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field long a>
	//    4    6:lsub            
	//    5    7:invokestatic    #34  <Method long Math.max(long, long)>
	//    6   10:ldc2w           #35  <Long 0xf4240L>
	//    7   13:lmul            
	//    8   14:ldc2w           #37  <Long 8L>
	//    9   17:lmul            
	//   10   18:aload_0         
	//   11   19:getfield        #20  <Field int b>
	//   12   22:i2l             
	//   13   23:ldiv            
	//   14   24:lreturn         
	}

	public boolean a()
	{
		return c != -1L;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field long c>
	//    2    4:ldc2w           #21  <Long -1L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public long b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field long c>
	//    2    4:lreturn         
	}

	public long b(long l)
	{
		if(c == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field long c>
	//*   2    4:ldc2w           #21  <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            13
		{
			return 0L;
	//    5   11:lconst_0        
	//    6   12:lreturn         
		} else
		{
			long l1 = a;
	//    7   13:aload_0         
	//    8   14:getfield        #18  <Field long a>
	//    9   17:lstore_3        
			return (l * (long)b) / 0x7a1200L + l1;
	//   10   18:lload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #20  <Field int b>
	//   13   23:i2l             
	//   14   24:lmul            
	//   15   25:ldc2w           #41  <Long 0x7a1200L>
	//   16   28:ldiv            
	//   17   29:lload_3         
	//   18   30:ladd            
	//   19   31:lreturn         
		}
	}

	private final long a;
	private final int b;
	private final long c;
}
