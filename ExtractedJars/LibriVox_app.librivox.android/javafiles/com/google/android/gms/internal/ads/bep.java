// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bdv, bdw

final class bep
	implements bdv
{

	public bep()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		g = a;
	//    2    4:aload_0         
	//    3    5:getstatic       #25  <Field ByteBuffer a>
	//    4    8:putfield        #27  <Field ByteBuffer g>
		h = a;
	//    5   11:aload_0         
	//    6   12:getstatic       #25  <Field ByteBuffer a>
	//    7   15:putfield        #29  <Field ByteBuffer h>
		b = -1;
	//    8   18:aload_0         
	//    9   19:iconst_m1       
	//   10   20:putfield        #31  <Field int b>
		c = -1;
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:putfield        #33  <Field int c>
	//   14   28:return          
	}

	public final void a(ByteBuffer bytebuffer)
	{
		int j = bytebuffer.position();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #41  <Method int ByteBuffer.position()>
	//    2    4:istore_2        
		int i1 = bytebuffer.limit();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #44  <Method int ByteBuffer.limit()>
	//    5    9:istore          4
		int k = ((i1 - j) / (b * 2)) * f.length << 1;
	//    6   11:iload           4
	//    7   13:iload_2         
	//    8   14:isub            
	//    9   15:aload_0         
	//   10   16:getfield        #31  <Field int b>
	//   11   19:iconst_2        
	//   12   20:imul            
	//   13   21:idiv            
	//   14   22:aload_0         
	//   15   23:getfield        #46  <Field int[] f>
	//   16   26:arraylength     
	//   17   27:imul            
	//   18   28:iconst_1        
	//   19   29:ishl            
	//   20   30:istore_3        
		if(g.capacity() < k)
	//*  21   31:aload_0         
	//*  22   32:getfield        #27  <Field ByteBuffer g>
	//*  23   35:invokevirtual   #49  <Method int ByteBuffer.capacity()>
	//*  24   38:iload_3         
	//*  25   39:icmpge          59
			g = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
	//   26   42:aload_0         
	//   27   43:iload_3         
	//   28   44:invokestatic    #53  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   29   47:invokestatic    #59  <Method ByteOrder ByteOrder.nativeOrder()>
	//   30   50:invokevirtual   #63  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   31   53:putfield        #27  <Field ByteBuffer g>
		else
	//*  32   56:goto            67
			g.clear();
	//   33   59:aload_0         
	//   34   60:getfield        #27  <Field ByteBuffer g>
	//   35   63:invokevirtual   #67  <Method java.nio.Buffer ByteBuffer.clear()>
	//   36   66:pop             
		for(; j < i1; j += b << 1)
	//*  37   67:iload_2         
	//*  38   68:iload           4
	//*  39   70:icmpge          135
		{
			int ai[] = f;
	//   40   73:aload_0         
	//   41   74:getfield        #46  <Field int[] f>
	//   42   77:astore          7
			int j1 = ai.length;
	//   43   79:aload           7
	//   44   81:arraylength     
	//   45   82:istore          5
			for(int l = 0; l < j1; l++)
	//*  46   84:iconst_0        
	//*  47   85:istore_3        
	//*  48   86:iload_3         
	//*  49   87:iload           5
	//*  50   89:icmpge          123
			{
				int k1 = ai[l];
	//   51   92:aload           7
	//   52   94:iload_3         
	//   53   95:iaload          
	//   54   96:istore          6
				g.putShort(bytebuffer.getShort(k1 * 2 + j));
	//   55   98:aload_0         
	//   56   99:getfield        #27  <Field ByteBuffer g>
	//   57  102:aload_1         
	//   58  103:iload           6
	//   59  105:iconst_2        
	//   60  106:imul            
	//   61  107:iload_2         
	//   62  108:iadd            
	//   63  109:invokevirtual   #71  <Method short ByteBuffer.getShort(int)>
	//   64  112:invokevirtual   #75  <Method ByteBuffer ByteBuffer.putShort(short)>
	//   65  115:pop             
			}

	//   66  116:iload_3         
	//   67  117:iconst_1        
	//   68  118:iadd            
	//   69  119:istore_3        
		}

	//   70  120:goto            86
	//   71  123:iload_2         
	//   72  124:aload_0         
	//   73  125:getfield        #31  <Field int b>
	//   74  128:iconst_1        
	//   75  129:ishl            
	//   76  130:iadd            
	//   77  131:istore_2        
	//*  78  132:goto            67
		bytebuffer.position(i1);
	//   79  135:aload_1         
	//   80  136:iload           4
	//   81  138:invokevirtual   #78  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   82  141:pop             
		g.flip();
	//   83  142:aload_0         
	//   84  143:getfield        #27  <Field ByteBuffer g>
	//   85  146:invokevirtual   #81  <Method java.nio.Buffer ByteBuffer.flip()>
	//   86  149:pop             
		h = g;
	//   87  150:aload_0         
	//   88  151:aload_0         
	//   89  152:getfield        #27  <Field ByteBuffer g>
	//   90  155:putfield        #29  <Field ByteBuffer h>
	//   91  158:return          
	}

	public final void a(int ai[])
	{
		d = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field int[] d>
	//    3    5:return          
	}

	public final boolean a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean e>
	//    2    4:ireturn         
	}

	public final boolean a(int j, int k, int l)
	{
		boolean flag = Arrays.equals(d, f) ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int[] d>
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field int[] f>
	//    4    8:invokestatic    #94  <Method boolean Arrays.equals(int[], int[])>
	//    5   11:iconst_1        
	//    6   12:ixor            
	//    7   13:istore          6
		f = d;
	//    8   15:aload_0         
	//    9   16:aload_0         
	//   10   17:getfield        #84  <Field int[] d>
	//   11   20:putfield        #46  <Field int[] f>
		if(f == null)
	//*  12   23:aload_0         
	//*  13   24:getfield        #46  <Field int[] f>
	//*  14   27:ifnonnull       38
		{
			e = false;
	//   15   30:aload_0         
	//   16   31:iconst_0        
	//   17   32:putfield        #87  <Field boolean e>
			return flag;
	//   18   35:iload           6
	//   19   37:ireturn         
		}
		if(l == 2)
	//*  20   38:iload_3         
	//*  21   39:iconst_2        
	//*  22   40:icmpne          183
		{
			if(!flag && c == j && b == k)
	//*  23   43:iload           6
	//*  24   45:ifne            66
	//*  25   48:aload_0         
	//*  26   49:getfield        #33  <Field int c>
	//*  27   52:iload_1         
	//*  28   53:icmpne          66
	//*  29   56:aload_0         
	//*  30   57:getfield        #31  <Field int b>
	//*  31   60:iload_2         
	//*  32   61:icmpne          66
				return false;
	//   33   64:iconst_0        
	//   34   65:ireturn         
			c = j;
	//   35   66:aload_0         
	//   36   67:iload_1         
	//   37   68:putfield        #33  <Field int c>
			b = k;
	//   38   71:aload_0         
	//   39   72:iload_2         
	//   40   73:putfield        #31  <Field int b>
			if(k != f.length)
	//*  41   76:iload_2         
	//*  42   77:aload_0         
	//*  43   78:getfield        #46  <Field int[] f>
	//*  44   81:arraylength     
	//*  45   82:icmpeq          91
				flag = true;
	//   46   85:iconst_1        
	//   47   86:istore          6
			else
	//*  48   88:goto            94
				flag = false;
	//   49   91:iconst_0        
	//   50   92:istore          6
			e = flag;
	//   51   94:aload_0         
	//   52   95:iload           6
	//   53   97:putfield        #87  <Field boolean e>
			int i1 = 0;
	//   54  100:iconst_0        
	//   55  101:istore          4
			do
			{
				int ai[] = f;
	//   56  103:aload_0         
	//   57  104:getfield        #46  <Field int[] f>
	//   58  107:astore          7
				if(i1 < ai.length)
	//*  59  109:iload           4
	//*  60  111:aload           7
	//*  61  113:arraylength     
	//*  62  114:icmpge          181
				{
					int j1 = ai[i1];
	//   63  117:aload           7
	//   64  119:iload           4
	//   65  121:iaload          
	//   66  122:istore          5
					if(j1 < k)
	//*  67  124:iload           5
	//*  68  126:iload_2         
	//*  69  127:icmpge          170
					{
						boolean flag1 = e;
	//   70  130:aload_0         
	//   71  131:getfield        #87  <Field boolean e>
	//   72  134:istore          6
						if(j1 != i1)
	//*  73  136:iload           5
	//*  74  138:iload           4
	//*  75  140:icmpeq          149
							j1 = 1;
	//   76  143:iconst_1        
	//   77  144:istore          5
						else
	//*  78  146:goto            152
							j1 = 0;
	//   79  149:iconst_0        
	//   80  150:istore          5
						e = j1 | flag1;
	//   81  152:aload_0         
	//   82  153:iload           5
	//   83  155:iload           6
	//   84  157:ior             
	//   85  158:putfield        #87  <Field boolean e>
						i1++;
	//   86  161:iload           4
	//   87  163:iconst_1        
	//   88  164:iadd            
	//   89  165:istore          4
					} else
	//*  90  167:goto            103
					{
						throw new bdw(j, k, l);
	//   91  170:new             #96  <Class bdw>
	//   92  173:dup             
	//   93  174:iload_1         
	//   94  175:iload_2         
	//   95  176:iload_3         
	//   96  177:invokespecial   #99  <Method void bdw(int, int, int)>
	//   97  180:athrow          
					}
				} else
				{
					return true;
	//   98  181:iconst_1        
	//   99  182:ireturn         
				}
			} while(true);
		} else
		{
			throw new bdw(j, k, l);
	//  100  183:new             #96  <Class bdw>
	//  101  186:dup             
	//  102  187:iload_1         
	//  103  188:iload_2         
	//  104  189:iload_3         
	//  105  190:invokespecial   #99  <Method void bdw(int, int, int)>
	//  106  193:athrow          
		}
	}

	public final int b()
	{
		int ai[] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int[] f>
	//    2    4:astore_1        
		if(ai == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			return b;
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field int b>
	//    7   13:ireturn         
		else
			return ai.length;
	//    8   14:aload_1         
	//    9   15:arraylength     
	//   10   16:ireturn         
	}

	public final int c()
	{
		return 2;
	//    0    0:iconst_2        
	//    1    1:ireturn         
	}

	public final void d()
	{
		i = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #101 <Field boolean i>
	//    3    5:return          
	}

	public final ByteBuffer e()
	{
		ByteBuffer bytebuffer = h;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ByteBuffer h>
	//    2    4:astore_1        
		h = a;
	//    3    5:aload_0         
	//    4    6:getstatic       #25  <Field ByteBuffer a>
	//    5    9:putfield        #29  <Field ByteBuffer h>
		return bytebuffer;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	public final boolean f()
	{
		return i && h == a;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field boolean i>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field ByteBuffer h>
	//    5   11:getstatic       #25  <Field ByteBuffer a>
	//    6   14:if_acmpne       19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public final void g()
	{
		h = a;
	//    0    0:aload_0         
	//    1    1:getstatic       #25  <Field ByteBuffer a>
	//    2    4:putfield        #29  <Field ByteBuffer h>
		i = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #101 <Field boolean i>
	//    6   12:return          
	}

	public final void h()
	{
		g();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method void g()>
		g = a;
	//    2    4:aload_0         
	//    3    5:getstatic       #25  <Field ByteBuffer a>
	//    4    8:putfield        #27  <Field ByteBuffer g>
		b = -1;
	//    5   11:aload_0         
	//    6   12:iconst_m1       
	//    7   13:putfield        #31  <Field int b>
		c = -1;
	//    8   16:aload_0         
	//    9   17:iconst_m1       
	//   10   18:putfield        #33  <Field int c>
		f = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #46  <Field int[] f>
		e = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #87  <Field boolean e>
	//   17   31:return          
	}

	private int b;
	private int c;
	private int d[];
	private boolean e;
	private int f[];
	private ByteBuffer g;
	private ByteBuffer h;
	private boolean i;
}
