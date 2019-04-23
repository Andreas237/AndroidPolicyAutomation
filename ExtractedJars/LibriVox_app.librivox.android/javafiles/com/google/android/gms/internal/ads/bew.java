// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bdv, bnw, bev, bdw

public final class bew
	implements bdv
{

	public bew()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		e = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #30  <Field float e>
		f = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #32  <Field float f>
		b = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #34  <Field int b>
		c = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #36  <Field int c>
		g = a;
	//   14   24:aload_0         
	//   15   25:getstatic       #39  <Field ByteBuffer a>
	//   16   28:putfield        #41  <Field ByteBuffer g>
		h = g.asShortBuffer();
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #41  <Field ByteBuffer g>
	//   20   36:invokevirtual   #47  <Method ShortBuffer ByteBuffer.asShortBuffer()>
	//   21   39:putfield        #49  <Field ShortBuffer h>
		i = a;
	//   22   42:aload_0         
	//   23   43:getstatic       #39  <Field ByteBuffer a>
	//   24   46:putfield        #51  <Field ByteBuffer i>
	//   25   49:return          
	}

	public final float a(float f1)
	{
		e = bnw.a(f1, 0.1F, 8F);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc1            #54  <Float 0.1F>
	//    3    4:ldc1            #55  <Float 8F>
	//    4    6:invokestatic    #60  <Method float bnw.a(float, float, float)>
	//    5    9:putfield        #30  <Field float e>
		return e;
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field float e>
	//    8   16:freturn         
	}

	public final void a(ByteBuffer bytebuffer)
	{
		if(bytebuffer.hasRemaining())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #65  <Method boolean ByteBuffer.hasRemaining()>
	//*   2    4:ifeq            47
		{
			ShortBuffer shortbuffer = bytebuffer.asShortBuffer();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #47  <Method ShortBuffer ByteBuffer.asShortBuffer()>
	//    5   11:astore_3        
			int i1 = bytebuffer.remaining();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #69  <Method int ByteBuffer.remaining()>
	//    8   16:istore_2        
			j = j + (long)i1;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #71  <Field long j>
	//   12   22:iload_2         
	//   13   23:i2l             
	//   14   24:ladd            
	//   15   25:putfield        #71  <Field long j>
			d.a(shortbuffer);
	//   16   28:aload_0         
	//   17   29:getfield        #73  <Field bev d>
	//   18   32:aload_3         
	//   19   33:invokevirtual   #78  <Method void bev.a(ShortBuffer)>
			bytebuffer.position(bytebuffer.position() + i1);
	//   20   36:aload_1         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #81  <Method int ByteBuffer.position()>
	//   23   41:iload_2         
	//   24   42:iadd            
	//   25   43:invokevirtual   #84  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   26   46:pop             
		}
		int j1 = d.b() * b << 1;
	//   27   47:aload_0         
	//   28   48:getfield        #73  <Field bev d>
	//   29   51:invokevirtual   #86  <Method int bev.b()>
	//   30   54:aload_0         
	//   31   55:getfield        #34  <Field int b>
	//   32   58:imul            
	//   33   59:iconst_1        
	//   34   60:ishl            
	//   35   61:istore_2        
		if(j1 > 0)
	//*  36   62:iload_2         
	//*  37   63:ifle            160
		{
			if(g.capacity() < j1)
	//*  38   66:aload_0         
	//*  39   67:getfield        #41  <Field ByteBuffer g>
	//*  40   70:invokevirtual   #89  <Method int ByteBuffer.capacity()>
	//*  41   73:iload_2         
	//*  42   74:icmpge          105
			{
				g = ByteBuffer.allocateDirect(j1).order(ByteOrder.nativeOrder());
	//   43   77:aload_0         
	//   44   78:iload_2         
	//   45   79:invokestatic    #93  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   46   82:invokestatic    #99  <Method ByteOrder ByteOrder.nativeOrder()>
	//   47   85:invokevirtual   #103 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   48   88:putfield        #41  <Field ByteBuffer g>
				h = g.asShortBuffer();
	//   49   91:aload_0         
	//   50   92:aload_0         
	//   51   93:getfield        #41  <Field ByteBuffer g>
	//   52   96:invokevirtual   #47  <Method ShortBuffer ByteBuffer.asShortBuffer()>
	//   53   99:putfield        #49  <Field ShortBuffer h>
			} else
	//*  54  102:goto            121
			{
				g.clear();
	//   55  105:aload_0         
	//   56  106:getfield        #41  <Field ByteBuffer g>
	//   57  109:invokevirtual   #107 <Method java.nio.Buffer ByteBuffer.clear()>
	//   58  112:pop             
				h.clear();
	//   59  113:aload_0         
	//   60  114:getfield        #49  <Field ShortBuffer h>
	//   61  117:invokevirtual   #110 <Method java.nio.Buffer ShortBuffer.clear()>
	//   62  120:pop             
			}
			d.b(h);
	//   63  121:aload_0         
	//   64  122:getfield        #73  <Field bev d>
	//   65  125:aload_0         
	//   66  126:getfield        #49  <Field ShortBuffer h>
	//   67  129:invokevirtual   #112 <Method void bev.b(ShortBuffer)>
			k = k + (long)j1;
	//   68  132:aload_0         
	//   69  133:aload_0         
	//   70  134:getfield        #114 <Field long k>
	//   71  137:iload_2         
	//   72  138:i2l             
	//   73  139:ladd            
	//   74  140:putfield        #114 <Field long k>
			g.limit(j1);
	//   75  143:aload_0         
	//   76  144:getfield        #41  <Field ByteBuffer g>
	//   77  147:iload_2         
	//   78  148:invokevirtual   #117 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   79  151:pop             
			i = g;
	//   80  152:aload_0         
	//   81  153:aload_0         
	//   82  154:getfield        #41  <Field ByteBuffer g>
	//   83  157:putfield        #51  <Field ByteBuffer i>
		}
	//   84  160:return          
	}

	public final boolean a()
	{
		return Math.abs(e - 1.0F) >= 0.01F || Math.abs(f - 1.0F) >= 0.01F;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field float e>
	//    2    4:fconst_1        
	//    3    5:fsub            
	//    4    6:invokestatic    #122 <Method float Math.abs(float)>
	//    5    9:ldc1            #123 <Float 0.01F>
	//    6   11:fcmpl           
	//    7   12:ifge            35
	//    8   15:aload_0         
	//    9   16:getfield        #32  <Field float f>
	//   10   19:fconst_1        
	//   11   20:fsub            
	//   12   21:invokestatic    #122 <Method float Math.abs(float)>
	//   13   24:ldc1            #123 <Float 0.01F>
	//   14   26:fcmpl           
	//   15   27:iflt            33
	//   16   30:goto            35
	//   17   33:iconst_0        
	//   18   34:ireturn         
	//   19   35:iconst_1        
	//   20   36:ireturn         
	}

	public final boolean a(int i1, int j1, int k1)
	{
		if(k1 == 2)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          35
		{
			if(c == i1 && b == j1)
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field int c>
	//*   5    9:iload_1         
	//*   6   10:icmpne          23
	//*   7   13:aload_0         
	//*   8   14:getfield        #34  <Field int b>
	//*   9   17:iload_2         
	//*  10   18:icmpne          23
			{
				return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
			} else
			{
				c = i1;
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:putfield        #36  <Field int c>
				b = j1;
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:putfield        #34  <Field int b>
				return true;
	//   19   33:iconst_1        
	//   20   34:ireturn         
			}
		} else
		{
			throw new bdw(i1, j1, k1);
	//   21   35:new             #126 <Class bdw>
	//   22   38:dup             
	//   23   39:iload_1         
	//   24   40:iload_2         
	//   25   41:iload_3         
	//   26   42:invokespecial   #129 <Method void bdw(int, int, int)>
	//   27   45:athrow          
		}
	}

	public final float b(float f1)
	{
		f = bnw.a(f1, 0.1F, 8F);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc1            #54  <Float 0.1F>
	//    3    4:ldc1            #55  <Float 8F>
	//    4    6:invokestatic    #60  <Method float bnw.a(float, float, float)>
	//    5    9:putfield        #32  <Field float f>
		return f1;
	//    6   12:fload_1         
	//    7   13:freturn         
	}

	public final int b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int b>
	//    2    4:ireturn         
	}

	public final int c()
	{
		return 2;
	//    0    0:iconst_2        
	//    1    1:ireturn         
	}

	public final void d()
	{
		d.a();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field bev d>
	//    2    4:invokevirtual   #131 <Method void bev.a()>
		l = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #133 <Field boolean l>
	//    6   12:return          
	}

	public final ByteBuffer e()
	{
		ByteBuffer bytebuffer = i;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ByteBuffer i>
	//    2    4:astore_1        
		i = a;
	//    3    5:aload_0         
	//    4    6:getstatic       #39  <Field ByteBuffer a>
	//    5    9:putfield        #51  <Field ByteBuffer i>
		return bytebuffer;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	public final boolean f()
	{
		if(l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #133 <Field boolean l>
	//*   2    4:ifeq            25
		{
			bev bev1 = d;
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field bev d>
	//    5   11:astore_1        
			if(bev1 == null || bev1.b() == 0)
	//*   6   12:aload_1         
	//*   7   13:ifnull          23
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #86  <Method int bev.b()>
	//*  10   20:ifne            25
				return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		}
		return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public final void g()
	{
		d = new bev(c, b);
	//    0    0:aload_0         
	//    1    1:new             #75  <Class bev>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field int c>
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field int b>
	//    7   13:invokespecial   #137 <Method void bev(int, int)>
	//    8   16:putfield        #73  <Field bev d>
		d.a(e);
	//    9   19:aload_0         
	//   10   20:getfield        #73  <Field bev d>
	//   11   23:aload_0         
	//   12   24:getfield        #30  <Field float e>
	//   13   27:invokevirtual   #140 <Method void bev.a(float)>
		d.b(f);
	//   14   30:aload_0         
	//   15   31:getfield        #73  <Field bev d>
	//   16   34:aload_0         
	//   17   35:getfield        #32  <Field float f>
	//   18   38:invokevirtual   #142 <Method void bev.b(float)>
		i = a;
	//   19   41:aload_0         
	//   20   42:getstatic       #39  <Field ByteBuffer a>
	//   21   45:putfield        #51  <Field ByteBuffer i>
		j = 0L;
	//   22   48:aload_0         
	//   23   49:lconst_0        
	//   24   50:putfield        #71  <Field long j>
		k = 0L;
	//   25   53:aload_0         
	//   26   54:lconst_0        
	//   27   55:putfield        #114 <Field long k>
		l = false;
	//   28   58:aload_0         
	//   29   59:iconst_0        
	//   30   60:putfield        #133 <Field boolean l>
	//   31   63:return          
	}

	public final void h()
	{
		d = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #73  <Field bev d>
		g = a;
	//    3    5:aload_0         
	//    4    6:getstatic       #39  <Field ByteBuffer a>
	//    5    9:putfield        #41  <Field ByteBuffer g>
		h = g.asShortBuffer();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #41  <Field ByteBuffer g>
	//    9   17:invokevirtual   #47  <Method ShortBuffer ByteBuffer.asShortBuffer()>
	//   10   20:putfield        #49  <Field ShortBuffer h>
		i = a;
	//   11   23:aload_0         
	//   12   24:getstatic       #39  <Field ByteBuffer a>
	//   13   27:putfield        #51  <Field ByteBuffer i>
		b = -1;
	//   14   30:aload_0         
	//   15   31:iconst_m1       
	//   16   32:putfield        #34  <Field int b>
		c = -1;
	//   17   35:aload_0         
	//   18   36:iconst_m1       
	//   19   37:putfield        #36  <Field int c>
		j = 0L;
	//   20   40:aload_0         
	//   21   41:lconst_0        
	//   22   42:putfield        #71  <Field long j>
		k = 0L;
	//   23   45:aload_0         
	//   24   46:lconst_0        
	//   25   47:putfield        #114 <Field long k>
		l = false;
	//   26   50:aload_0         
	//   27   51:iconst_0        
	//   28   52:putfield        #133 <Field boolean l>
	//   29   55:return          
	}

	public final long i()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field long j>
	//    2    4:lreturn         
	}

	public final long j()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field long k>
	//    2    4:lreturn         
	}

	private int b;
	private int c;
	private bev d;
	private float e;
	private float f;
	private ByteBuffer g;
	private ShortBuffer h;
	private ByteBuffer i;
	private long j;
	private long k;
	private boolean l;
}
