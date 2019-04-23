// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			arh, avs, ark, aqq, 
//			atv, aqh, aun, avw

final class arl extends arh
{

	arl(ByteBuffer bytebuffer)
	{
		super(((arn) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #14  <Method void arh(arn)>
		b = bytebuffer;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #16  <Field ByteBuffer b>
		c = bytebuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #22  <Method ByteBuffer ByteBuffer.duplicate()>
	//    9   15:getstatic       #28  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   10   18:invokevirtual   #32  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   11   21:putfield        #34  <Field ByteBuffer c>
		d = bytebuffer.position();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #38  <Method int ByteBuffer.position()>
	//   15   29:putfield        #40  <Field int d>
	//   16   32:return          
	}

	private final void c(String s)
	{
		try
		{
			avs.a(((CharSequence) (s)), c);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field ByteBuffer c>
	//    3    5:invokestatic    #50  <Method void avs.a(CharSequence, ByteBuffer)>
			return;
	//    4    8:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    9:astore_1        
		{
			throw new ark(((Throwable) (s)));
	//    6   10:new             #52  <Class ark>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #55  <Method void ark(Throwable)>
	//   10   18:athrow          
		}
	}

	public final void a()
	{
		b.position(c.position());
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ByteBuffer b>
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field ByteBuffer c>
	//    4    8:invokevirtual   #38  <Method int ByteBuffer.position()>
	//    5   11:invokevirtual   #59  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    6   14:pop             
	//    7   15:return          
	}

	public final void a(byte byte0)
	{
		try
		{
			c.put(byte0);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ByteBuffer c>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #66  <Method ByteBuffer ByteBuffer.put(byte)>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		catch(BufferOverflowException bufferoverflowexception)
	//*   6   10:astore_2        
		{
			throw new ark(((Throwable) (bufferoverflowexception)));
	//    7   11:new             #52  <Class ark>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #55  <Method void ark(Throwable)>
	//   11   19:athrow          
		}
	}

	public final void a(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			((arh)this).b(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #69  <Method void arh.b(int)>
			return;
	//    5    9:return          
		} else
		{
			((arh)this).a(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #72  <Method void arh.a(long)>
			return;
	//   10   16:return          
		}
	}

	public final void a(int i, int j)
	{
		((arh)this).b(i << 3 | j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:ishl            
	//    4    4:iload_2         
	//    5    5:ior             
	//    6    6:invokevirtual   #69  <Method void arh.b(int)>
	//    7    9:return          
	}

	public final void a(int i, long l)
	{
		((arh)this).a(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #76  <Method void arh.a(int, int)>
		((arh)this).a(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #72  <Method void arh.a(long)>
	//    7   11:return          
	}

	public final void a(int i, aqq aqq1)
	{
		((arh)this).a(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #76  <Method void arh.a(int, int)>
		((arh)this).a(aqq1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #80  <Method void arh.a(aqq)>
	//    7   11:return          
	}

	public final void a(int i, atv atv1)
	{
		((arh)this).a(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #76  <Method void arh.a(int, int)>
		((arh)this).a(atv1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #84  <Method void arh.a(atv)>
	//    7   11:return          
	}

	final void a(int i, atv atv1, aun aun1)
	{
		((arh)this).a(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #76  <Method void arh.a(int, int)>
		((arh)this).a(atv1, aun1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #88  <Method void arh.a(atv, aun)>
	//    8   12:return          
	}

	public final void a(int i, String s)
	{
		((arh)this).a(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #76  <Method void arh.a(int, int)>
		((arh)this).a(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #91  <Method void arh.a(String)>
	//    7   11:return          
	}

	public final void a(int i, boolean flag)
	{
		((arh)this).a(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #76  <Method void arh.a(int, int)>
		((arh)this).a((byte)flag);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:int2byte        
	//    7    9:invokevirtual   #94  <Method void arh.a(byte)>
	//    8   12:return          
	}

	public final void a(long l)
	{
_L1:
		if((-128L & l) == 0L)
	//*   0    0:ldc2w           #95  <Long -128L>
	//*   1    3:lload_1         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            22
			try
			{
				c.put((byte)(int)l);
	//    6   10:aload_0         
	//    7   11:getfield        #34  <Field ByteBuffer c>
	//    8   14:lload_1         
	//    9   15:l2i             
	//   10   16:int2byte        
	//   11   17:invokevirtual   #66  <Method ByteBuffer ByteBuffer.put(byte)>
	//   12   20:pop             
				return;
	//   13   21:return          
			}
	//*  14   22:aload_0         
	//*  15   23:getfield        #34  <Field ByteBuffer c>
	//*  16   26:lload_1         
	//*  17   27:l2i             
	//*  18   28:bipush          127
	//*  19   30:iand            
	//*  20   31:sipush          128
	//*  21   34:ior             
	//*  22   35:int2byte        
	//*  23   36:invokevirtual   #66  <Method ByteBuffer ByteBuffer.put(byte)>
	//*  24   39:pop             
	//*  25   40:lload_1         
	//*  26   41:bipush          7
	//*  27   43:lushr           
	//*  28   44:lstore_1        
	//*  29   45:goto            0
			catch(BufferOverflowException bufferoverflowexception)
	//*  30   48:astore_3        
			{
				throw new ark(((Throwable) (bufferoverflowexception)));
	//   31   49:new             #52  <Class ark>
	//   32   52:dup             
	//   33   53:aload_3         
	//   34   54:invokespecial   #55  <Method void ark(Throwable)>
	//   35   57:athrow          
			}
		c.put((byte)((int)l & 0x7f | 0x80));
		l >>>= 7;
		  goto _L1
	}

	public final void a(aqq aqq1)
	{
		((arh)this).b(aqq1.a());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #100 <Method int aqq.a()>
	//    3    5:invokevirtual   #69  <Method void arh.b(int)>
		aqq1.a(((aqp) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #103 <Method void aqq.a(aqp)>
	//    7   13:return          
	}

	public final void a(atv atv1)
	{
		((arh)this).b(atv1.l());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #108 <Method int atv.l()>
	//    3    7:invokevirtual   #69  <Method void arh.b(int)>
		atv1.a(((arh) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokeinterface #111 <Method void atv.a(arh)>
	//    7   17:return          
	}

	final void a(atv atv1, aun aun1)
	{
		aqh aqh1 = (aqh)atv1;
	//    0    0:aload_1         
	//    1    1:checkcast       #113 <Class aqh>
	//    2    4:astore          5
		int j = aqh1.j();
	//    3    6:aload           5
	//    4    8:invokevirtual   #116 <Method int aqh.j()>
	//    5   11:istore          4
		int i = j;
	//    6   13:iload           4
	//    7   15:istore_3        
		if(j == -1)
	//*   8   16:iload           4
	//*   9   18:iconst_m1       
	//*  10   19:icmpne          37
		{
			i = aun1.b(((Object) (aqh1)));
	//   11   22:aload_2         
	//   12   23:aload           5
	//   13   25:invokeinterface #121 <Method int aun.b(Object)>
	//   14   30:istore_3        
			aqh1.a(i);
	//   15   31:aload           5
	//   16   33:iload_3         
	//   17   34:invokevirtual   #123 <Method void aqh.a(int)>
		}
		((arh)this).b(i);
	//   18   37:aload_0         
	//   19   38:iload_3         
	//   20   39:invokevirtual   #69  <Method void arh.b(int)>
		aun1.a(((Object) (atv1)), ((awf) (a)));
	//   21   42:aload_2         
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #126 <Field aro a>
	//   25   48:invokeinterface #129 <Method void aun.a(Object, awf)>
	//   26   53:return          
	}

	public final void a(String s)
	{
		int i = c.position();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ByteBuffer c>
	//    2    4:invokevirtual   #38  <Method int ByteBuffer.position()>
	//    3    7:istore_2        
		int j;
		int k;
		try
		{
			j = g(s.length() * 3);
	//    4    8:aload_1         
	//    5    9:invokevirtual   #138 <Method int String.length()>
	//    6   12:iconst_3        
	//    7   13:imul            
	//    8   14:invokestatic    #142 <Method int g(int)>
	//    9   17:istore_3        
			k = g(s.length());
	//   10   18:aload_1         
	//   11   19:invokevirtual   #138 <Method int String.length()>
	//   12   22:invokestatic    #142 <Method int g(int)>
	//   13   25:istore          4
		}
	//*  14   27:iload           4
	//*  15   29:iload_3         
	//*  16   30:icmpne          95
	//*  17   33:aload_0         
	//*  18   34:getfield        #34  <Field ByteBuffer c>
	//*  19   37:invokevirtual   #38  <Method int ByteBuffer.position()>
	//*  20   40:iload           4
	//*  21   42:iadd            
	//*  22   43:istore_3        
	//*  23   44:aload_0         
	//*  24   45:getfield        #34  <Field ByteBuffer c>
	//*  25   48:iload_3         
	//*  26   49:invokevirtual   #59  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  27   52:pop             
	//*  28   53:aload_0         
	//*  29   54:aload_1         
	//*  30   55:invokespecial   #144 <Method void c(String)>
	//*  31   58:aload_0         
	//*  32   59:getfield        #34  <Field ByteBuffer c>
	//*  33   62:invokevirtual   #38  <Method int ByteBuffer.position()>
	//*  34   65:istore          4
	//*  35   67:aload_0         
	//*  36   68:getfield        #34  <Field ByteBuffer c>
	//*  37   71:iload_2         
	//*  38   72:invokevirtual   #59  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  39   75:pop             
	//*  40   76:aload_0         
	//*  41   77:iload           4
	//*  42   79:iload_3         
	//*  43   80:isub            
	//*  44   81:invokevirtual   #69  <Method void arh.b(int)>
	//*  45   84:aload_0         
	//*  46   85:getfield        #34  <Field ByteBuffer c>
	//*  47   88:iload           4
	//*  48   90:invokevirtual   #59  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  49   93:pop             
	//*  50   94:return          
	//*  51   95:aload_0         
	//*  52   96:aload_1         
	//*  53   97:invokestatic    #147 <Method int avs.a(CharSequence)>
	//*  54  100:invokevirtual   #69  <Method void arh.b(int)>
	//*  55  103:aload_0         
	//*  56  104:aload_1         
	//*  57  105:invokespecial   #144 <Method void c(String)>
	//*  58  108:return          
	//*  59  109:astore_1        
	//*  60  110:new             #52  <Class ark>
	//*  61  113:dup             
	//*  62  114:aload_1         
	//*  63  115:invokespecial   #55  <Method void ark(Throwable)>
	//*  64  118:athrow          
		catch(avw avw1)
	//*  65  119:astore          5
		{
			c.position(i);
	//   66  121:aload_0         
	//   67  122:getfield        #34  <Field ByteBuffer c>
	//   68  125:iload_2         
	//   69  126:invokevirtual   #59  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   70  129:pop             
			((arh)this).a(s, avw1);
	//   71  130:aload_0         
	//   72  131:aload_1         
	//   73  132:aload           5
	//   74  134:invokevirtual   #150 <Method void arh.a(String, avw)>
			return;
	//   75  137:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new ark(((Throwable) (s)));
		}
		if(k != j)
			break MISSING_BLOCK_LABEL_95;
		j = c.position() + k;
		c.position(j);
		c(s);
		k = c.position();
		c.position(i);
		((arh)this).b(k - j);
		c.position(k);
		return;
		((arh)this).b(avs.a(((CharSequence) (s))));
		c(s);
		return;
	}

	public final void a(byte abyte0[], int i, int j)
	{
		((arh)this).b(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #153 <Method void arh.b(byte[], int, int)>
	//    5    7:return          
	}

	public final int b()
	{
		return c.remaining();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ByteBuffer c>
	//    2    4:invokevirtual   #156 <Method int ByteBuffer.remaining()>
	//    3    7:ireturn         
	}

	public final void b(int i)
	{
_L1:
		if((i & 0xffffff80) == 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            18
			try
			{
				c.put((byte)i);
	//    4    7:aload_0         
	//    5    8:getfield        #34  <Field ByteBuffer c>
	//    6   11:iload_1         
	//    7   12:int2byte        
	//    8   13:invokevirtual   #66  <Method ByteBuffer ByteBuffer.put(byte)>
	//    9   16:pop             
				return;
	//   10   17:return          
			}
	//*  11   18:aload_0         
	//*  12   19:getfield        #34  <Field ByteBuffer c>
	//*  13   22:iload_1         
	//*  14   23:bipush          127
	//*  15   25:iand            
	//*  16   26:sipush          128
	//*  17   29:ior             
	//*  18   30:int2byte        
	//*  19   31:invokevirtual   #66  <Method ByteBuffer ByteBuffer.put(byte)>
	//*  20   34:pop             
	//*  21   35:iload_1         
	//*  22   36:bipush          7
	//*  23   38:iushr           
	//*  24   39:istore_1        
	//*  25   40:goto            0
			catch(BufferOverflowException bufferoverflowexception)
	//*  26   43:astore_2        
			{
				throw new ark(((Throwable) (bufferoverflowexception)));
	//   27   44:new             #52  <Class ark>
	//   28   47:dup             
	//   29   48:aload_2         
	//   30   49:invokespecial   #55  <Method void ark(Throwable)>
	//   31   52:athrow          
			}
		c.put((byte)(i & 0x7f | 0x80));
		i >>>= 7;
		  goto _L1
	}

	public final void b(int i, int j)
	{
		((arh)this).a(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #76  <Method void arh.a(int, int)>
		((arh)this).a(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #157 <Method void arh.a(int)>
	//    7   11:return          
	}

	public final void b(int i, aqq aqq1)
	{
		((arh)this).a(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #76  <Method void arh.a(int, int)>
		((arh)this).c(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #159 <Method void arh.c(int, int)>
		((arh)this).a(3, aqq1);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #161 <Method void arh.a(int, aqq)>
		((arh)this).a(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #76  <Method void arh.a(int, int)>
	//   16   24:return          
	}

	public final void b(int i, atv atv1)
	{
		((arh)this).a(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #76  <Method void arh.a(int, int)>
		((arh)this).c(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #159 <Method void arh.c(int, int)>
		((arh)this).a(3, atv1);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #163 <Method void arh.a(int, atv)>
		((arh)this).a(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #76  <Method void arh.a(int, int)>
	//   16   24:return          
	}

	public final void b(byte abyte0[], int i, int j)
	{
		try
		{
			c.put(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ByteBuffer c>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #166 <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//    6   10:pop             
			return;
	//    7   11:return          
		}
	//*   8   12:astore_1        
	//*   9   13:new             #52  <Class ark>
	//*  10   16:dup             
	//*  11   17:aload_1         
	//*  12   18:invokespecial   #55  <Method void ark(Throwable)>
	//*  13   21:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  14   22:astore_1        
		{
			throw new ark(((Throwable) (abyte0)));
	//   15   23:new             #52  <Class ark>
	//   16   26:dup             
	//   17   27:aload_1         
	//   18   28:invokespecial   #55  <Method void ark(Throwable)>
	//   19   31:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new ark(((Throwable) (abyte0)));
		}
	}

	public final void c(int i, int j)
	{
		((arh)this).a(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #76  <Method void arh.a(int, int)>
		((arh)this).b(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #69  <Method void arh.b(int)>
	//    7   11:return          
	}

	public final void c(int i, long l)
	{
		((arh)this).a(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #76  <Method void arh.a(int, int)>
		((arh)this).c(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #168 <Method void arh.c(long)>
	//    7   11:return          
	}

	public final void c(long l)
	{
		try
		{
			c.putLong(l);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ByteBuffer c>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #172 <Method ByteBuffer ByteBuffer.putLong(long)>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		catch(BufferOverflowException bufferoverflowexception)
	//*   6   10:astore_3        
		{
			throw new ark(((Throwable) (bufferoverflowexception)));
	//    7   11:new             #52  <Class ark>
	//    8   14:dup             
	//    9   15:aload_3         
	//   10   16:invokespecial   #55  <Method void ark(Throwable)>
	//   11   19:athrow          
		}
	}

	public final void c(byte abyte0[], int i, int j)
	{
		((arh)this).b(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #69  <Method void arh.b(int)>
		((arh)this).b(abyte0, 0, j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:iload_3         
	//    7    9:invokevirtual   #153 <Method void arh.b(byte[], int, int)>
	//    8   12:return          
	}

	public final void d(int i)
	{
		try
		{
			c.putInt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ByteBuffer c>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #176 <Method ByteBuffer ByteBuffer.putInt(int)>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		catch(BufferOverflowException bufferoverflowexception)
	//*   6   10:astore_2        
		{
			throw new ark(((Throwable) (bufferoverflowexception)));
	//    7   11:new             #52  <Class ark>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #55  <Method void ark(Throwable)>
	//   11   19:athrow          
		}
	}

	public final void e(int i, int j)
	{
		((arh)this).a(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #76  <Method void arh.a(int, int)>
		((arh)this).d(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #179 <Method void arh.d(int)>
	//    7   11:return          
	}

	private final ByteBuffer b;
	private final ByteBuffer c;
	private final int d;
}
