// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bdv, bdw

final class beu
	implements bdv
{

	public beu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		b = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #21  <Field int b>
		c = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #23  <Field int c>
		d = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #25  <Field int d>
		e = a;
	//   11   19:aload_0         
	//   12   20:getstatic       #28  <Field ByteBuffer a>
	//   13   23:putfield        #30  <Field ByteBuffer e>
		f = a;
	//   14   26:aload_0         
	//   15   27:getstatic       #28  <Field ByteBuffer a>
	//   16   30:putfield        #32  <Field ByteBuffer f>
	//   17   33:return          
	}

	public final void a(ByteBuffer bytebuffer)
	{
		int i = bytebuffer.position();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method int ByteBuffer.position()>
	//    2    4:istore_2        
		int k = bytebuffer.limit();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #43  <Method int ByteBuffer.limit()>
	//    5    9:istore          4
		int j = k - i;
	//    6   11:iload           4
	//    7   13:iload_2         
	//    8   14:isub            
	//    9   15:istore_3        
		int l = d;
	//   10   16:aload_0         
	//   11   17:getfield        #25  <Field int d>
	//   12   20:istore          5
		if(l != 0x80000000)
	//*  13   22:iload           5
	//*  14   24:ldc1            #44  <Int 0x80000000>
	//*  15   26:icmpeq          64
		{
			if(l != 3)
	//*  16   29:iload           5
	//*  17   31:iconst_3        
	//*  18   32:icmpeq          57
			{
				if(l == 0x40000000)
	//*  19   35:iload           5
	//*  20   37:ldc1            #45  <Int 0x40000000>
	//*  21   39:icmpne          49
					j /= 2;
	//   22   42:iload_3         
	//   23   43:iconst_2        
	//   24   44:idiv            
	//   25   45:istore_3        
				else
	//*  26   46:goto            70
					throw new IllegalStateException();
	//   27   49:new             #47  <Class IllegalStateException>
	//   28   52:dup             
	//   29   53:invokespecial   #48  <Method void IllegalStateException()>
	//   30   56:athrow          
			} else
			{
				j <<= 1;
	//   31   57:iload_3         
	//   32   58:iconst_1        
	//   33   59:ishl            
	//   34   60:istore_3        
			}
		} else
	//*  35   61:goto            70
		{
			j = j / 3 << 1;
	//   36   64:iload_3         
	//   37   65:iconst_3        
	//   38   66:idiv            
	//   39   67:iconst_1        
	//   40   68:ishl            
	//   41   69:istore_3        
		}
		if(e.capacity() < j)
	//*  42   70:aload_0         
	//*  43   71:getfield        #30  <Field ByteBuffer e>
	//*  44   74:invokevirtual   #51  <Method int ByteBuffer.capacity()>
	//*  45   77:iload_3         
	//*  46   78:icmpge          98
			e = ByteBuffer.allocateDirect(j).order(ByteOrder.nativeOrder());
	//   47   81:aload_0         
	//   48   82:iload_3         
	//   49   83:invokestatic    #55  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   50   86:invokestatic    #61  <Method ByteOrder ByteOrder.nativeOrder()>
	//   51   89:invokevirtual   #65  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   52   92:putfield        #30  <Field ByteBuffer e>
		else
	//*  53   95:goto            106
			e.clear();
	//   54   98:aload_0         
	//   55   99:getfield        #30  <Field ByteBuffer e>
	//   56  102:invokevirtual   #69  <Method java.nio.Buffer ByteBuffer.clear()>
	//   57  105:pop             
		l = d;
	//   58  106:aload_0         
	//   59  107:getfield        #25  <Field int d>
	//   60  110:istore          5
		j = i;
	//   61  112:iload_2         
	//   62  113:istore_3        
		if(l != 0x80000000)
	//*  63  114:iload           5
	//*  64  116:ldc1            #44  <Int 0x80000000>
	//*  65  118:icmpeq          231
		{
			j = i;
	//   66  121:iload_2         
	//   67  122:istore_3        
			if(l != 3)
	//*  68  123:iload           5
	//*  69  125:iconst_3        
	//*  70  126:icmpeq          187
			{
				if(l == 0x40000000)
	//*  71  129:iload           5
	//*  72  131:ldc1            #45  <Int 0x40000000>
	//*  73  133:icmpne          179
					for(; i < k; i += 4)
	//*  74  136:iload_2         
	//*  75  137:iload           4
	//*  76  139:icmpge          274
					{
						e.put(bytebuffer.get(i + 2));
	//   77  142:aload_0         
	//   78  143:getfield        #30  <Field ByteBuffer e>
	//   79  146:aload_1         
	//   80  147:iload_2         
	//   81  148:iconst_2        
	//   82  149:iadd            
	//   83  150:invokevirtual   #73  <Method byte ByteBuffer.get(int)>
	//   84  153:invokevirtual   #77  <Method ByteBuffer ByteBuffer.put(byte)>
	//   85  156:pop             
						e.put(bytebuffer.get(i + 3));
	//   86  157:aload_0         
	//   87  158:getfield        #30  <Field ByteBuffer e>
	//   88  161:aload_1         
	//   89  162:iload_2         
	//   90  163:iconst_3        
	//   91  164:iadd            
	//   92  165:invokevirtual   #73  <Method byte ByteBuffer.get(int)>
	//   93  168:invokevirtual   #77  <Method ByteBuffer ByteBuffer.put(byte)>
	//   94  171:pop             
					}

	//   95  172:iload_2         
	//   96  173:iconst_4        
	//   97  174:iadd            
	//   98  175:istore_2        
				else
	//*  99  176:goto            136
					throw new IllegalStateException();
	//  100  179:new             #47  <Class IllegalStateException>
	//  101  182:dup             
	//  102  183:invokespecial   #48  <Method void IllegalStateException()>
	//  103  186:athrow          
			} else
			{
				for(; j < k; j++)
	//* 104  187:iload_3         
	//* 105  188:iload           4
	//* 106  190:icmpge          274
				{
					e.put((byte)0);
	//  107  193:aload_0         
	//  108  194:getfield        #30  <Field ByteBuffer e>
	//  109  197:iconst_0        
	//  110  198:invokevirtual   #77  <Method ByteBuffer ByteBuffer.put(byte)>
	//  111  201:pop             
					e.put((byte)((bytebuffer.get(j) & 0xff) - 128));
	//  112  202:aload_0         
	//  113  203:getfield        #30  <Field ByteBuffer e>
	//  114  206:aload_1         
	//  115  207:iload_3         
	//  116  208:invokevirtual   #73  <Method byte ByteBuffer.get(int)>
	//  117  211:sipush          255
	//  118  214:iand            
	//  119  215:sipush          128
	//  120  218:isub            
	//  121  219:int2byte        
	//  122  220:invokevirtual   #77  <Method ByteBuffer ByteBuffer.put(byte)>
	//  123  223:pop             
				}

	//  124  224:iload_3         
	//  125  225:iconst_1        
	//  126  226:iadd            
	//  127  227:istore_3        
			}
		} else
	//* 128  228:goto            187
		{
			for(; j < k; j += 3)
	//* 129  231:iload_3         
	//* 130  232:iload           4
	//* 131  234:icmpge          274
			{
				e.put(bytebuffer.get(j + 1));
	//  132  237:aload_0         
	//  133  238:getfield        #30  <Field ByteBuffer e>
	//  134  241:aload_1         
	//  135  242:iload_3         
	//  136  243:iconst_1        
	//  137  244:iadd            
	//  138  245:invokevirtual   #73  <Method byte ByteBuffer.get(int)>
	//  139  248:invokevirtual   #77  <Method ByteBuffer ByteBuffer.put(byte)>
	//  140  251:pop             
				e.put(bytebuffer.get(j + 2));
	//  141  252:aload_0         
	//  142  253:getfield        #30  <Field ByteBuffer e>
	//  143  256:aload_1         
	//  144  257:iload_3         
	//  145  258:iconst_2        
	//  146  259:iadd            
	//  147  260:invokevirtual   #73  <Method byte ByteBuffer.get(int)>
	//  148  263:invokevirtual   #77  <Method ByteBuffer ByteBuffer.put(byte)>
	//  149  266:pop             
			}

	//  150  267:iload_3         
	//  151  268:iconst_3        
	//  152  269:iadd            
	//  153  270:istore_3        
		}
	//* 154  271:goto            231
		bytebuffer.position(bytebuffer.limit());
	//  155  274:aload_1         
	//  156  275:aload_1         
	//  157  276:invokevirtual   #43  <Method int ByteBuffer.limit()>
	//  158  279:invokevirtual   #80  <Method java.nio.Buffer ByteBuffer.position(int)>
	//  159  282:pop             
		e.flip();
	//  160  283:aload_0         
	//  161  284:getfield        #30  <Field ByteBuffer e>
	//  162  287:invokevirtual   #83  <Method java.nio.Buffer ByteBuffer.flip()>
	//  163  290:pop             
		f = e;
	//  164  291:aload_0         
	//  165  292:aload_0         
	//  166  293:getfield        #30  <Field ByteBuffer e>
	//  167  296:putfield        #32  <Field ByteBuffer f>
	//  168  299:return          
	}

	public final boolean a()
	{
		int i = d;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int d>
	//    2    4:istore_1        
		return i != 0 && i != 2;
	//    3    5:iload_1         
	//    4    6:ifeq            16
	//    5    9:iload_1         
	//    6   10:iconst_2        
	//    7   11:icmpeq          16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public final boolean a(int i, int j, int k)
	{
		if(k != 3 && k != 2 && k != 0x80000000 && k != 0x40000000)
	//*   0    0:iload_3         
	//*   1    1:iconst_3        
	//*   2    2:icmpeq          36
	//*   3    5:iload_3         
	//*   4    6:iconst_2        
	//*   5    7:icmpeq          36
	//*   6   10:iload_3         
	//*   7   11:ldc1            #44  <Int 0x80000000>
	//*   8   13:icmpeq          36
	//*   9   16:iload_3         
	//*  10   17:ldc1            #45  <Int 0x40000000>
	//*  11   19:icmpne          25
	//*  12   22:goto            36
			throw new bdw(i, j, k);
	//   13   25:new             #87  <Class bdw>
	//   14   28:dup             
	//   15   29:iload_1         
	//   16   30:iload_2         
	//   17   31:iload_3         
	//   18   32:invokespecial   #90  <Method void bdw(int, int, int)>
	//   19   35:athrow          
		if(b == i && c == j && d == k)
	//*  20   36:aload_0         
	//*  21   37:getfield        #21  <Field int b>
	//*  22   40:iload_1         
	//*  23   41:icmpne          62
	//*  24   44:aload_0         
	//*  25   45:getfield        #23  <Field int c>
	//*  26   48:iload_2         
	//*  27   49:icmpne          62
	//*  28   52:aload_0         
	//*  29   53:getfield        #25  <Field int d>
	//*  30   56:iload_3         
	//*  31   57:icmpne          62
			return false;
	//   32   60:iconst_0        
	//   33   61:ireturn         
		b = i;
	//   34   62:aload_0         
	//   35   63:iload_1         
	//   36   64:putfield        #21  <Field int b>
		c = j;
	//   37   67:aload_0         
	//   38   68:iload_2         
	//   39   69:putfield        #23  <Field int c>
		d = k;
	//   40   72:aload_0         
	//   41   73:iload_3         
	//   42   74:putfield        #25  <Field int d>
		if(k == 2)
	//*  43   77:iload_3         
	//*  44   78:iconst_2        
	//*  45   79:icmpne          89
			e = a;
	//   46   82:aload_0         
	//   47   83:getstatic       #28  <Field ByteBuffer a>
	//   48   86:putfield        #30  <Field ByteBuffer e>
		return true;
	//   49   89:iconst_1        
	//   50   90:ireturn         
	}

	public final int b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int c>
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
		g = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #92  <Field boolean g>
	//    3    5:return          
	}

	public final ByteBuffer e()
	{
		ByteBuffer bytebuffer = f;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ByteBuffer f>
	//    2    4:astore_1        
		f = a;
	//    3    5:aload_0         
	//    4    6:getstatic       #28  <Field ByteBuffer a>
	//    5    9:putfield        #32  <Field ByteBuffer f>
		return bytebuffer;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	public final boolean f()
	{
		return g && f == a;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field boolean g>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field ByteBuffer f>
	//    5   11:getstatic       #28  <Field ByteBuffer a>
	//    6   14:if_acmpne       19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public final void g()
	{
		f = a;
	//    0    0:aload_0         
	//    1    1:getstatic       #28  <Field ByteBuffer a>
	//    2    4:putfield        #32  <Field ByteBuffer f>
		g = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #92  <Field boolean g>
	//    6   12:return          
	}

	public final void h()
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method void g()>
		e = a;
	//    2    4:aload_0         
	//    3    5:getstatic       #28  <Field ByteBuffer a>
	//    4    8:putfield        #30  <Field ByteBuffer e>
		b = -1;
	//    5   11:aload_0         
	//    6   12:iconst_m1       
	//    7   13:putfield        #21  <Field int b>
		c = -1;
	//    8   16:aload_0         
	//    9   17:iconst_m1       
	//   10   18:putfield        #23  <Field int c>
		d = 0;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #25  <Field int d>
	//   14   26:return          
	}

	private int b;
	private int c;
	private int d;
	private ByteBuffer e;
	private ByteBuffer f;
	private boolean g;
}
