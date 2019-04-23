// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf

public final class bnp
{

	public bnp(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field byte[] a>
		c = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int c>
		b = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #21  <Field int b>
		d = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #23  <Field int d>
		e();
	//   14   24:aload_0         
	//   15   25:invokespecial   #26  <Method void e()>
	//   16   28:return          
	}

	private final boolean c(int i)
	{
		if(2 <= i && i < b)
	//*   0    0:iconst_2        
	//*   1    1:iload_1         
	//*   2    2:icmpgt          43
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #21  <Field int b>
	//*   6   10:icmpge          43
		{
			byte abyte0[] = a;
	//    7   13:aload_0         
	//    8   14:getfield        #17  <Field byte[] a>
	//    9   17:astore_2        
			if(abyte0[i] == 3 && abyte0[i - 2] == 0 && abyte0[i - 1] == 0)
	//*  10   18:aload_2         
	//*  11   19:iload_1         
	//*  12   20:baload          
	//*  13   21:iconst_3        
	//*  14   22:icmpne          43
	//*  15   25:aload_2         
	//*  16   26:iload_1         
	//*  17   27:iconst_2        
	//*  18   28:isub            
	//*  19   29:baload          
	//*  20   30:ifne            43
	//*  21   33:aload_2         
	//*  22   34:iload_1         
	//*  23   35:iconst_1        
	//*  24   36:isub            
	//*  25   37:baload          
	//*  26   38:ifne            43
				return true;
	//   27   41:iconst_1        
	//   28   42:ireturn         
		}
		return false;
	//   29   43:iconst_0        
	//   30   44:ireturn         
	}

	private final int d()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i;
		for(i = 0; !a(); i++);
	//    2    2:iconst_0        
	//    3    3:istore_1        
	//    4    4:aload_0         
	//    5    5:invokevirtual   #32  <Method boolean a()>
	//    6    8:ifne            18
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:istore_1        
	//*  11   15:goto            4
		if(i > 0)
	//*  12   18:iload_1         
	//*  13   19:ifle            28
			j = b(i);
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:invokevirtual   #35  <Method int b(int)>
	//   17   27:istore_2        
		return ((1 << i) - 1) + j;
	//   18   28:iconst_1        
	//   19   29:iload_1         
	//   20   30:ishl            
	//   21   31:iconst_1        
	//   22   32:isub            
	//   23   33:iload_2         
	//   24   34:iadd            
	//   25   35:ireturn         
	}

	private final void e()
	{
		boolean flag;
label0:
		{
			int i = c;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int c>
	//    2    4:istore_1        
			if(i >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            49
			{
				int j = d;
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field int d>
	//    7   13:istore_2        
				if(j >= 0 && j < 8)
	//*   8   14:iload_2         
	//*   9   15:iflt            49
	//*  10   18:iload_2         
	//*  11   19:bipush          8
	//*  12   21:icmpge          49
				{
					int k = b;
	//   13   24:aload_0         
	//   14   25:getfield        #21  <Field int b>
	//   15   28:istore_3        
					if(i < k || i == k && j == 0)
	//*  16   29:iload_1         
	//*  17   30:iload_3         
	//*  18   31:icmplt          43
	//*  19   34:iload_1         
	//*  20   35:iload_3         
	//*  21   36:icmpne          49
	//*  22   39:iload_2         
	//*  23   40:ifne            49
					{
						flag = true;
	//   24   43:iconst_1        
	//   25   44:istore          4
						break label0;
	//   26   46:goto            52
					}
				}
			}
			flag = false;
	//   27   49:iconst_0        
	//   28   50:istore          4
		}
		bnf.b(flag);
	//   29   52:iload           4
	//   30   54:invokestatic    #40  <Method void bnf.b(boolean)>
	//   31   57:return          
	}

	public final void a(int i)
	{
		int j = c;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int c>
	//    2    4:istore_2        
		c = i / 8 + j;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:bipush          8
	//    6    9:idiv            
	//    7   10:iload_2         
	//    8   11:iadd            
	//    9   12:putfield        #19  <Field int c>
		d = d + i % 8;
	//   10   15:aload_0         
	//   11   16:aload_0         
	//   12   17:getfield        #23  <Field int d>
	//   13   20:iload_1         
	//   14   21:bipush          8
	//   15   23:irem            
	//   16   24:iadd            
	//   17   25:putfield        #23  <Field int d>
		i = d;
	//   18   28:aload_0         
	//   19   29:getfield        #23  <Field int d>
	//   20   32:istore_1        
		if(i > 7)
	//*  21   33:iload_1         
	//*  22   34:bipush          7
	//*  23   36:icmple          57
		{
			c = c + 1;
	//   24   39:aload_0         
	//   25   40:aload_0         
	//   26   41:getfield        #19  <Field int c>
	//   27   44:iconst_1        
	//   28   45:iadd            
	//   29   46:putfield        #19  <Field int c>
			d = i - 8;
	//   30   49:aload_0         
	//   31   50:iload_1         
	//   32   51:bipush          8
	//   33   53:isub            
	//   34   54:putfield        #23  <Field int d>
		}
		for(i = j + 1; i <= c; i = j + 1)
	//*  35   57:iload_2         
	//*  36   58:iconst_1        
	//*  37   59:iadd            
	//*  38   60:istore_1        
	//*  39   61:iload_1         
	//*  40   62:aload_0         
	//*  41   63:getfield        #19  <Field int c>
	//*  42   66:icmpgt          100
		{
			j = i;
	//   43   69:iload_1         
	//   44   70:istore_2        
			if(c(i))
	//*  45   71:aload_0         
	//*  46   72:iload_1         
	//*  47   73:invokespecial   #43  <Method boolean c(int)>
	//*  48   76:ifeq            93
			{
				c = c + 1;
	//   49   79:aload_0         
	//   50   80:aload_0         
	//   51   81:getfield        #19  <Field int c>
	//   52   84:iconst_1        
	//   53   85:iadd            
	//   54   86:putfield        #19  <Field int c>
				j = i + 2;
	//   55   89:iload_1         
	//   56   90:iconst_2        
	//   57   91:iadd            
	//   58   92:istore_2        
			}
		}

	//   59   93:iload_2         
	//   60   94:iconst_1        
	//   61   95:iadd            
	//   62   96:istore_1        
	//*  63   97:goto            61
		e();
	//   64  100:aload_0         
	//   65  101:invokespecial   #26  <Method void e()>
	//   66  104:return          
	}

	public final boolean a()
	{
		return b(1) == 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #35  <Method int b(int)>
	//    3    5:iconst_1        
	//    4    6:icmpne          11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public final int b()
	{
		return d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method int d()>
	//    2    4:ireturn         
	}

	public final int b(int i)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(i == 0)
	//*   2    2:iload_1         
	//*   3    3:ifne            8
			return 0;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		int j1 = i / 8;
	//    6    8:iload_1         
	//    7    9:bipush          8
	//    8   11:idiv            
	//    9   12:istore          6
		boolean flag = false;
	//   10   14:iconst_0        
	//   11   15:istore          4
		int j = i;
	//   12   17:iload_1         
	//   13   18:istore_2        
		i = ((int) (flag));
	//   14   19:iload           4
	//   15   21:istore_1        
		for(; k < j1; k++)
	//*  16   22:iload_3         
	//*  17   23:iload           6
	//*  18   25:icmpge          156
		{
			int l;
			if(c(c + 1))
	//*  19   28:aload_0         
	//*  20   29:aload_0         
	//*  21   30:getfield        #19  <Field int c>
	//*  22   33:iconst_1        
	//*  23   34:iadd            
	//*  24   35:invokespecial   #43  <Method boolean c(int)>
	//*  25   38:ifeq            52
				l = c + 2;
	//   26   41:aload_0         
	//   27   42:getfield        #19  <Field int c>
	//   28   45:iconst_2        
	//   29   46:iadd            
	//   30   47:istore          4
			else
	//*  31   49:goto            60
				l = c + 1;
	//   32   52:aload_0         
	//   33   53:getfield        #19  <Field int c>
	//   34   56:iconst_1        
	//   35   57:iadd            
	//   36   58:istore          4
			int i1 = d;
	//   37   60:aload_0         
	//   38   61:getfield        #23  <Field int d>
	//   39   64:istore          5
			if(i1 != 0)
	//*  40   66:iload           5
	//*  41   68:ifeq            116
			{
				byte abyte0[] = a;
	//   42   71:aload_0         
	//   43   72:getfield        #17  <Field byte[] a>
	//   44   75:astore          8
				byte byte4 = abyte0[c];
	//   45   77:aload           8
	//   46   79:aload_0         
	//   47   80:getfield        #19  <Field int c>
	//   48   83:baload          
	//   49   84:istore          7
				i1 = (abyte0[l] & 0xff) >>> 8 - i1 | (byte4 & 0xff) << i1;
	//   50   86:aload           8
	//   51   88:iload           4
	//   52   90:baload          
	//   53   91:sipush          255
	//   54   94:iand            
	//   55   95:bipush          8
	//   56   97:iload           5
	//   57   99:isub            
	//   58  100:iushr           
	//   59  101:iload           7
	//   60  103:sipush          255
	//   61  106:iand            
	//   62  107:iload           5
	//   63  109:ishl            
	//   64  110:ior             
	//   65  111:istore          5
			} else
	//*  66  113:goto            127
			{
				i1 = ((int) (a[c]));
	//   67  116:aload_0         
	//   68  117:getfield        #17  <Field byte[] a>
	//   69  120:aload_0         
	//   70  121:getfield        #19  <Field int c>
	//   71  124:baload          
	//   72  125:istore          5
			}
			j -= 8;
	//   73  127:iload_2         
	//   74  128:bipush          8
	//   75  130:isub            
	//   76  131:istore_2        
			i |= (0xff & i1) << j;
	//   77  132:iload_1         
	//   78  133:sipush          255
	//   79  136:iload           5
	//   80  138:iand            
	//   81  139:iload_2         
	//   82  140:ishl            
	//   83  141:ior             
	//   84  142:istore_1        
			c = l;
	//   85  143:aload_0         
	//   86  144:iload           4
	//   87  146:putfield        #19  <Field int c>
		}

	//   88  149:iload_3         
	//   89  150:iconst_1        
	//   90  151:iadd            
	//   91  152:istore_3        
	//*  92  153:goto            22
		k = i;
	//   93  156:iload_1         
	//   94  157:istore_3        
		if(j > 0)
	//*  95  158:iload_2         
	//*  96  159:ifle            323
		{
			k = d + j;
	//   97  162:aload_0         
	//   98  163:getfield        #23  <Field int d>
	//   99  166:iload_2         
	//  100  167:iadd            
	//  101  168:istore_3        
			byte byte0 = (byte)(255 >> 8 - j);
	//  102  169:sipush          255
	//  103  172:bipush          8
	//  104  174:iload_2         
	//  105  175:isub            
	//  106  176:ishr            
	//  107  177:int2byte        
	//  108  178:istore          4
			if(c(c + 1))
	//* 109  180:aload_0         
	//* 110  181:aload_0         
	//* 111  182:getfield        #19  <Field int c>
	//* 112  185:iconst_1        
	//* 113  186:iadd            
	//* 114  187:invokespecial   #43  <Method boolean c(int)>
	//* 115  190:ifeq            203
				j = c + 2;
	//  116  193:aload_0         
	//  117  194:getfield        #19  <Field int c>
	//  118  197:iconst_2        
	//  119  198:iadd            
	//  120  199:istore_2        
			else
	//* 121  200:goto            210
				j = c + 1;
	//  122  203:aload_0         
	//  123  204:getfield        #19  <Field int c>
	//  124  207:iconst_1        
	//  125  208:iadd            
	//  126  209:istore_2        
			if(k > 8)
	//* 127  210:iload_3         
	//* 128  211:bipush          8
	//* 129  213:icmple          274
			{
				byte abyte1[] = a;
	//  130  216:aload_0         
	//  131  217:getfield        #17  <Field byte[] a>
	//  132  220:astore          8
				byte byte1 = abyte1[c];
	//  133  222:aload           8
	//  134  224:aload_0         
	//  135  225:getfield        #19  <Field int c>
	//  136  228:baload          
	//  137  229:istore          5
				byte byte3 = abyte1[j];
	//  138  231:aload           8
	//  139  233:iload_2         
	//  140  234:baload          
	//  141  235:istore          6
				c = j;
	//  142  237:aload_0         
	//  143  238:iload_2         
	//  144  239:putfield        #19  <Field int c>
				i = byte0 & ((0xff & byte3) >> 16 - k | (byte1 & 0xff) << k - 8) | i;
	//  145  242:iload           4
	//  146  244:sipush          255
	//  147  247:iload           6
	//  148  249:iand            
	//  149  250:bipush          16
	//  150  252:iload_3         
	//  151  253:isub            
	//  152  254:ishr            
	//  153  255:iload           5
	//  154  257:sipush          255
	//  155  260:iand            
	//  156  261:iload_3         
	//  157  262:bipush          8
	//  158  264:isub            
	//  159  265:ishl            
	//  160  266:ior             
	//  161  267:iand            
	//  162  268:iload_1         
	//  163  269:ior             
	//  164  270:istore_1        
			} else
	//* 165  271:goto            313
			{
				byte byte2 = a[c];
	//  166  274:aload_0         
	//  167  275:getfield        #17  <Field byte[] a>
	//  168  278:aload_0         
	//  169  279:getfield        #19  <Field int c>
	//  170  282:baload          
	//  171  283:istore          5
				if(k == 8)
	//* 172  285:iload_3         
	//* 173  286:bipush          8
	//* 174  288:icmpne          296
					c = j;
	//  175  291:aload_0         
	//  176  292:iload_2         
	//  177  293:putfield        #19  <Field int c>
				i = byte0 & (0xff & byte2) >> 8 - k | i;
	//  178  296:iload           4
	//  179  298:sipush          255
	//  180  301:iload           5
	//  181  303:iand            
	//  182  304:bipush          8
	//  183  306:iload_3         
	//  184  307:isub            
	//  185  308:ishr            
	//  186  309:iand            
	//  187  310:iload_1         
	//  188  311:ior             
	//  189  312:istore_1        
			}
			d = k % 8;
	//  190  313:aload_0         
	//  191  314:iload_3         
	//  192  315:bipush          8
	//  193  317:irem            
	//  194  318:putfield        #23  <Field int d>
			k = i;
	//  195  321:iload_1         
	//  196  322:istore_3        
		}
		e();
	//  197  323:aload_0         
	//  198  324:invokespecial   #26  <Method void e()>
		return k;
	//  199  327:iload_3         
	//  200  328:ireturn         
	}

	public final int c()
	{
		int i = d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method int d()>
	//    2    4:istore_2        
		byte byte0;
		if(i % 2 == 0)
	//*   3    5:iload_2         
	//*   4    6:iconst_2        
	//*   5    7:irem            
	//*   6    8:ifne            16
			byte0 = -1;
	//    7   11:iconst_m1       
	//    8   12:istore_1        
		else
	//*   9   13:goto            18
			byte0 = 1;
	//   10   16:iconst_1        
	//   11   17:istore_1        
		return byte0 * ((i + 1) / 2);
	//   12   18:iload_1         
	//   13   19:iload_2         
	//   14   20:iconst_1        
	//   15   21:iadd            
	//   16   22:iconst_2        
	//   17   23:idiv            
	//   18   24:imul            
	//   19   25:ireturn         
	}

	private byte a[];
	private int b;
	private int c;
	private int d;
}
