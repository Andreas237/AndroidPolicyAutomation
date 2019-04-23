// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf

public final class bnn
{

	public bnn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public bnn(byte abyte0[])
	{
		this(abyte0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:arraylength     
	//    4    4:invokespecial   #19  <Method void bnn(byte[], int)>
	//    5    7:return          
	}

	private bnn(byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field byte[] a>
		d = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int d>
	//    8   14:return          
	}

	public final int a(int i)
	{
		int k;
		boolean flag;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          9
			if(i == 0)
	//*   2    3:iload_1         
	//*   3    4:ifne            9
				return 0;
	//    4    7:iconst_0        
	//    5    8:ireturn         
			int l1 = i / 8;
	//    6    9:iload_1         
	//    7   10:bipush          8
	//    8   12:idiv            
	//    9   13:istore          5
			int j = i;
	//   10   15:iload_1         
	//   11   16:istore_2        
			k = 0;
	//   12   17:iconst_0        
	//   13   18:istore_3        
			i = 0;
	//   14   19:iconst_0        
	//   15   20:istore_1        
			for(; k < l1; k++)
	//*  16   21:iload_3         
	//*  17   22:iload           5
	//*  18   24:icmpge          133
			{
				int l = c;
	//   19   27:aload_0         
	//   20   28:getfield        #26  <Field int c>
	//   21   31:istore          4
				if(l != 0)
	//*  22   33:iload           4
	//*  23   35:ifeq            89
				{
					byte abyte0[] = a;
	//   24   38:aload_0         
	//   25   39:getfield        #21  <Field byte[] a>
	//   26   42:astore          10
					int i2 = b;
	//   27   44:aload_0         
	//   28   45:getfield        #28  <Field int b>
	//   29   48:istore          6
					byte byte3 = abyte0[i2];
	//   30   50:aload           10
	//   31   52:iload           6
	//   32   54:baload          
	//   33   55:istore          7
					l = (abyte0[i2 + 1] & 0xff) >>> 8 - l | (byte3 & 0xff) << l;
	//   34   57:aload           10
	//   35   59:iload           6
	//   36   61:iconst_1        
	//   37   62:iadd            
	//   38   63:baload          
	//   39   64:sipush          255
	//   40   67:iand            
	//   41   68:bipush          8
	//   42   70:iload           4
	//   43   72:isub            
	//   44   73:iushr           
	//   45   74:iload           7
	//   46   76:sipush          255
	//   47   79:iand            
	//   48   80:iload           4
	//   49   82:ishl            
	//   50   83:ior             
	//   51   84:istore          4
				} else
	//*  52   86:goto            100
				{
					l = ((int) (a[b]));
	//   53   89:aload_0         
	//   54   90:getfield        #21  <Field byte[] a>
	//   55   93:aload_0         
	//   56   94:getfield        #28  <Field int b>
	//   57   97:baload          
	//   58   98:istore          4
				}
				j -= 8;
	//   59  100:iload_2         
	//   60  101:bipush          8
	//   61  103:isub            
	//   62  104:istore_2        
				i |= (0xff & l) << j;
	//   63  105:iload_1         
	//   64  106:sipush          255
	//   65  109:iload           4
	//   66  111:iand            
	//   67  112:iload_2         
	//   68  113:ishl            
	//   69  114:ior             
	//   70  115:istore_1        
				b = b + 1;
	//   71  116:aload_0         
	//   72  117:aload_0         
	//   73  118:getfield        #28  <Field int b>
	//   74  121:iconst_1        
	//   75  122:iadd            
	//   76  123:putfield        #28  <Field int b>
			}

	//   77  126:iload_3         
	//   78  127:iconst_1        
	//   79  128:iadd            
	//   80  129:istore_3        
	//*  81  130:goto            21
			k = i;
	//   82  133:iload_1         
	//   83  134:istore_3        
			if(j > 0)
	//*  84  135:iload_2         
	//*  85  136:ifle            288
			{
				k = c + j;
	//   86  139:aload_0         
	//   87  140:getfield        #26  <Field int c>
	//   88  143:iload_2         
	//   89  144:iadd            
	//   90  145:istore_3        
				j = ((int) ((byte)(255 >> 8 - j)));
	//   91  146:sipush          255
	//   92  149:bipush          8
	//   93  151:iload_2         
	//   94  152:isub            
	//   95  153:ishr            
	//   96  154:int2byte        
	//   97  155:istore_2        
				if(k > 8)
	//*  98  156:iload_3         
	//*  99  157:bipush          8
	//* 100  159:icmple          229
				{
					byte abyte1[] = a;
	//  101  162:aload_0         
	//  102  163:getfield        #21  <Field byte[] a>
	//  103  166:astore          10
					int i1 = b;
	//  104  168:aload_0         
	//  105  169:getfield        #28  <Field int b>
	//  106  172:istore          4
					byte byte0 = abyte1[i1];
	//  107  174:aload           10
	//  108  176:iload           4
	//  109  178:baload          
	//  110  179:istore          5
					byte byte2 = abyte1[i1 + 1];
	//  111  181:aload           10
	//  112  183:iload           4
	//  113  185:iconst_1        
	//  114  186:iadd            
	//  115  187:baload          
	//  116  188:istore          6
					b = i1 + 1;
	//  117  190:aload_0         
	//  118  191:iload           4
	//  119  193:iconst_1        
	//  120  194:iadd            
	//  121  195:putfield        #28  <Field int b>
					i = j & ((byte2 & 0xff) >> 16 - k | (byte0 & 0xff) << k - 8) | i;
	//  122  198:iload_2         
	//  123  199:iload           6
	//  124  201:sipush          255
	//  125  204:iand            
	//  126  205:bipush          16
	//  127  207:iload_3         
	//  128  208:isub            
	//  129  209:ishr            
	//  130  210:iload           5
	//  131  212:sipush          255
	//  132  215:iand            
	//  133  216:iload_3         
	//  134  217:bipush          8
	//  135  219:isub            
	//  136  220:ishl            
	//  137  221:ior             
	//  138  222:iand            
	//  139  223:iload_1         
	//  140  224:ior             
	//  141  225:istore_1        
				} else
	//* 142  226:goto            278
				{
					byte abyte2[] = a;
	//  143  229:aload_0         
	//  144  230:getfield        #21  <Field byte[] a>
	//  145  233:astore          10
					int j1 = b;
	//  146  235:aload_0         
	//  147  236:getfield        #28  <Field int b>
	//  148  239:istore          4
					byte byte1 = abyte2[j1];
	//  149  241:aload           10
	//  150  243:iload           4
	//  151  245:baload          
	//  152  246:istore          5
					if(k == 8)
	//* 153  248:iload_3         
	//* 154  249:bipush          8
	//* 155  251:icmpne          262
						b = j1 + 1;
	//  156  254:aload_0         
	//  157  255:iload           4
	//  158  257:iconst_1        
	//  159  258:iadd            
	//  160  259:putfield        #28  <Field int b>
					i = j & (byte1 & 0xff) >> 8 - k | i;
	//  161  262:iload_2         
	//  162  263:iload           5
	//  163  265:sipush          255
	//  164  268:iand            
	//  165  269:bipush          8
	//  166  271:iload_3         
	//  167  272:isub            
	//  168  273:ishr            
	//  169  274:iand            
	//  170  275:iload_1         
	//  171  276:ior             
	//  172  277:istore_1        
				}
				c = k % 8;
	//  173  278:aload_0         
	//  174  279:iload_3         
	//  175  280:bipush          8
	//  176  282:irem            
	//  177  283:putfield        #26  <Field int c>
				k = i;
	//  178  286:iload_1         
	//  179  287:istore_3        
			}
			i = b;
	//  180  288:aload_0         
	//  181  289:getfield        #28  <Field int b>
	//  182  292:istore_1        
			flag = flag1;
	//  183  293:iload           9
	//  184  295:istore          8
			if(i < 0)
				break label0;
	//  185  297:iload_1         
	//  186  298:iflt            357
			j = c;
	//  187  301:aload_0         
	//  188  302:getfield        #26  <Field int c>
	//  189  305:istore_2        
			flag = flag1;
	//  190  306:iload           9
	//  191  308:istore          8
			if(j < 0)
				break label0;
	//  192  310:iload_2         
	//  193  311:iflt            357
			flag = flag1;
	//  194  314:iload           9
	//  195  316:istore          8
			if(j >= 8)
				break label0;
	//  196  318:iload_2         
	//  197  319:bipush          8
	//  198  321:icmpge          357
			int k1 = d;
	//  199  324:aload_0         
	//  200  325:getfield        #23  <Field int d>
	//  201  328:istore          4
			if(i >= k1)
	//* 202  330:iload_1         
	//* 203  331:iload           4
	//* 204  333:icmplt          354
			{
				flag = flag1;
	//  205  336:iload           9
	//  206  338:istore          8
				if(i != k1)
					break label0;
	//  207  340:iload_1         
	//  208  341:iload           4
	//  209  343:icmpne          357
				flag = flag1;
	//  210  346:iload           9
	//  211  348:istore          8
				if(j != 0)
					break label0;
	//  212  350:iload_2         
	//  213  351:ifne            357
			}
			flag = true;
	//  214  354:iconst_1        
	//  215  355:istore          8
		}
		bnf.b(flag);
	//  216  357:iload           8
	//  217  359:invokestatic    #33  <Method void bnf.b(boolean)>
		return k;
	//  218  362:iload_3         
	//  219  363:ireturn         
	}

	private byte a[];
	private int b;
	private int c;
	private int d;
}
