// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;


public final class HexDumpUtils
{

	public HexDumpUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static String dump(byte abyte0[], int i, int j, boolean flag)
	{
label0:
		{
			if(abyte0 == null || abyte0.length == 0 || i < 0 || j <= 0 || i + j > abyte0.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          398
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifeq            398
	//*   5    9:iload_1         
	//*   6   10:iflt            398
	//*   7   13:iload_2         
	//*   8   14:ifle            398
	//*   9   17:iload_1         
	//*  10   18:iload_2         
	//*  11   19:iadd            
	//*  12   20:aload_0         
	//*  13   21:arraylength     
	//*  14   22:icmple          28
				break label0;
	//   15   25:goto            398
			int k = 57;
	//   16   28:bipush          57
	//   17   30:istore          5
			if(flag)
	//*  18   32:iload_3         
	//*  19   33:ifeq            40
				k = 75;
	//   20   36:bipush          75
	//   21   38:istore          5
			StringBuilder stringbuilder = new StringBuilder(k * (((j + 16) - 1) / 16));
	//   22   40:new             #14  <Class StringBuilder>
	//   23   43:dup             
	//   24   44:iload           5
	//   25   46:iload_2         
	//   26   47:bipush          16
	//   27   49:iadd            
	//   28   50:iconst_1        
	//   29   51:isub            
	//   30   52:bipush          16
	//   31   54:idiv            
	//   32   55:imul            
	//   33   56:invokespecial   #17  <Method void StringBuilder(int)>
	//   34   59:astore          12
			k = j;
	//   35   61:iload_2         
	//   36   62:istore          5
			int i1 = 0;
	//   37   64:iconst_0        
	//   38   65:istore          7
			int j1 = 0;
	//   39   67:iconst_0        
	//   40   68:istore          8
			int k1;
			for(; k > 0; k = k1)
	//*  41   70:iload           5
	//*  42   72:ifle            392
			{
				int l;
label1:
				{
					if(i1 == 0)
	//*  43   75:iload           7
	//*  44   77:ifne            147
					{
						String s;
						Object aobj[];
						if(j < 0x10000)
	//*  45   80:iload_2         
	//*  46   81:ldc1            #18  <Int 0x10000>
	//*  47   83:icmpge          120
						{
							s = "%04X:";
	//   48   86:ldc1            #20  <String "%04X:">
	//   49   88:astore          10
							aobj = new Object[1];
	//   50   90:iconst_1        
	//   51   91:anewarray       Object[]
	//   52   94:astore          11
							aobj[0] = ((Object) (Integer.valueOf(i)));
	//   53   96:aload           11
	//   54   98:iconst_0        
	//   55   99:iload_1         
	//   56  100:invokestatic    #26  <Method Integer Integer.valueOf(int)>
	//   57  103:aastore         
						} else
	//*  58  104:aload           12
	//*  59  106:aload           10
	//*  60  108:aload           11
	//*  61  110:invokestatic    #32  <Method String String.format(String, Object[])>
	//*  62  113:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//*  63  116:pop             
	//*  64  117:goto            141
						{
							s = "%08X:";
	//   65  120:ldc1            #38  <String "%08X:">
	//   66  122:astore          10
							aobj = new Object[1];
	//   67  124:iconst_1        
	//   68  125:anewarray       Object[]
	//   69  128:astore          11
							aobj[0] = ((Object) (Integer.valueOf(i)));
	//   70  130:aload           11
	//   71  132:iconst_0        
	//   72  133:iload_1         
	//   73  134:invokestatic    #26  <Method Integer Integer.valueOf(int)>
	//   74  137:aastore         
						}
						stringbuilder.append(String.format(s, aobj));
	//*  75  138:goto            104
						l = i;
	//   76  141:iload_1         
	//   77  142:istore          6
					} else
	//*  78  144:goto            170
					{
						l = j1;
	//   79  147:iload           8
	//   80  149:istore          6
						if(i1 == 8)
	//*  81  151:iload           7
	//*  82  153:bipush          8
	//*  83  155:icmpne          170
						{
							stringbuilder.append(" -");
	//   84  158:aload           12
	//   85  160:ldc1            #40  <String " -">
	//   86  162:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   87  165:pop             
							l = j1;
	//   88  166:iload           8
	//   89  168:istore          6
						}
					}
					stringbuilder.append(String.format(" %02X", new Object[] {
						Integer.valueOf(abyte0[i] & 0xff)
					}));
	//   90  170:aload           12
	//   91  172:ldc1            #42  <String " %02X">
	//   92  174:iconst_1        
	//   93  175:anewarray       Object[]
	//   94  178:dup             
	//   95  179:iconst_0        
	//   96  180:aload_0         
	//   97  181:iload_1         
	//   98  182:baload          
	//   99  183:sipush          255
	//  100  186:iand            
	//  101  187:invokestatic    #26  <Method Integer Integer.valueOf(int)>
	//  102  190:aastore         
	//  103  191:invokestatic    #32  <Method String String.format(String, Object[])>
	//  104  194:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  105  197:pop             
					k1 = k - 1;
	//  106  198:iload           5
	//  107  200:iconst_1        
	//  108  201:isub            
	//  109  202:istore          9
					i1++;
	//  110  204:iload           7
	//  111  206:iconst_1        
	//  112  207:iadd            
	//  113  208:istore          7
					if(flag && (i1 == 16 || k1 == 0))
	//* 114  210:iload_3         
	//* 115  211:ifeq            346
	//* 116  214:iload           7
	//* 117  216:bipush          16
	//* 118  218:icmpeq          226
	//* 119  221:iload           9
	//* 120  223:ifne            346
					{
						j1 = 16 - i1;
	//  121  226:bipush          16
	//  122  228:iload           7
	//  123  230:isub            
	//  124  231:istore          8
						if(j1 > 0)
	//* 125  233:iload           8
	//* 126  235:ifle            265
							for(k = 0; k < j1; k++)
	//* 127  238:iconst_0        
	//* 128  239:istore          5
	//* 129  241:iload           5
	//* 130  243:iload           8
	//* 131  245:icmpge          265
								stringbuilder.append("   ");
	//  132  248:aload           12
	//  133  250:ldc1            #44  <String "   ">
	//  134  252:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  135  255:pop             

	//  136  256:iload           5
	//  137  258:iconst_1        
	//  138  259:iadd            
	//  139  260:istore          5
	//* 140  262:goto            241
						if(j1 >= 8)
	//* 141  265:iload           8
	//* 142  267:bipush          8
	//* 143  269:icmplt          280
							stringbuilder.append("  ");
	//  144  272:aload           12
	//  145  274:ldc1            #46  <String "  ">
	//  146  276:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  147  279:pop             
						stringbuilder.append("  ");
	//  148  280:aload           12
	//  149  282:ldc1            #46  <String "  ">
	//  150  284:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  151  287:pop             
						for(k = 0; k < i1; k++)
	//* 152  288:iconst_0        
	//* 153  289:istore          5
	//* 154  291:iload           5
	//* 155  293:iload           7
	//* 156  295:icmpge          346
						{
							char c = (char)abyte0[l + k];
	//  157  298:aload_0         
	//  158  299:iload           6
	//  159  301:iload           5
	//  160  303:iadd            
	//  161  304:baload          
	//  162  305:int2char        
	//  163  306:istore          4
							if(c < ' ' || c > '~')
	//* 164  308:iload           4
	//* 165  310:bipush          32
	//* 166  312:icmplt          325
	//* 167  315:iload           4
	//* 168  317:bipush          126
	//* 169  319:icmpgt          325
	//* 170  322:goto            329
								c = '.';
	//  171  325:bipush          46
	//  172  327:istore          4
							stringbuilder.append(c);
	//  173  329:aload           12
	//  174  331:iload           4
	//  175  333:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//  176  336:pop             
						}

	//  177  337:iload           5
	//  178  339:iconst_1        
	//  179  340:iadd            
	//  180  341:istore          5
					}
	//* 181  343:goto            291
					if(i1 != 16)
	//* 182  346:iload           7
	//* 183  348:bipush          16
	//* 184  350:icmpeq          362
					{
						k = i1;
	//  185  353:iload           7
	//  186  355:istore          5
						if(k1 != 0)
							break label1;
	//  187  357:iload           9
	//  188  359:ifne            373
					}
					stringbuilder.append('\n');
	//  189  362:aload           12
	//  190  364:bipush          10
	//  191  366:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//  192  369:pop             
					k = 0;
	//  193  370:iconst_0        
	//  194  371:istore          5
				}
				i++;
	//  195  373:iload_1         
	//  196  374:iconst_1        
	//  197  375:iadd            
	//  198  376:istore_1        
				i1 = k;
	//  199  377:iload           5
	//  200  379:istore          7
				j1 = l;
	//  201  381:iload           6
	//  202  383:istore          8
			}

	//  203  385:iload           9
	//  204  387:istore          5
	//* 205  389:goto            70
			return stringbuilder.toString();
	//  206  392:aload           12
	//  207  394:invokevirtual   #53  <Method String StringBuilder.toString()>
	//  208  397:areturn         
		}
		return null;
	//  209  398:aconst_null     
	//  210  399:areturn         
	}
}
