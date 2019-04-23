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
	//*   1    1:ifnull          391
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifeq            391
	//*   5    9:iload_1         
	//*   6   10:iflt            391
	//*   7   13:iload_2         
	//*   8   14:ifle            391
	//*   9   17:iload_1         
	//*  10   18:iload_2         
	//*  11   19:iadd            
	//*  12   20:aload_0         
	//*  13   21:arraylength     
	//*  14   22:icmple          28
				break label0;
	//   15   25:goto            391
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
	//   34   59:astore          10
			k = j;
	//   35   61:iload_2         
	//   36   62:istore          5
			int i1 = 0;
	//   37   64:iconst_0        
	//   38   65:istore          7
			int j1 = i1;
	//   39   67:iload           7
	//   40   69:istore          8
			int k1;
			for(; k > 0; k = k1)
	//*  41   71:iload           5
	//*  42   73:ifle            385
			{
				int l;
label1:
				{
					if(i1 == 0)
	//*  43   76:iload           7
	//*  44   78:ifne            140
					{
						if(j < 0x10000)
	//*  45   81:iload_2         
	//*  46   82:ldc1            #18  <Int 0x10000>
	//*  47   84:icmpge          112
							stringbuilder.append(String.format("%04X:", new Object[] {
								Integer.valueOf(i)
							}));
	//   48   87:aload           10
	//   49   89:ldc1            #20  <String "%04X:">
	//   50   91:iconst_1        
	//   51   92:anewarray       Object[]
	//   52   95:dup             
	//   53   96:iconst_0        
	//   54   97:iload_1         
	//   55   98:invokestatic    #26  <Method Integer Integer.valueOf(int)>
	//   56  101:aastore         
	//   57  102:invokestatic    #32  <Method String String.format(String, Object[])>
	//   58  105:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   59  108:pop             
						else
	//*  60  109:goto            134
							stringbuilder.append(String.format("%08X:", new Object[] {
								Integer.valueOf(i)
							}));
	//   61  112:aload           10
	//   62  114:ldc1            #38  <String "%08X:">
	//   63  116:iconst_1        
	//   64  117:anewarray       Object[]
	//   65  120:dup             
	//   66  121:iconst_0        
	//   67  122:iload_1         
	//   68  123:invokestatic    #26  <Method Integer Integer.valueOf(int)>
	//   69  126:aastore         
	//   70  127:invokestatic    #32  <Method String String.format(String, Object[])>
	//   71  130:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   72  133:pop             
						l = i;
	//   73  134:iload_1         
	//   74  135:istore          6
					} else
	//*  75  137:goto            163
					{
						l = j1;
	//   76  140:iload           8
	//   77  142:istore          6
						if(i1 == 8)
	//*  78  144:iload           7
	//*  79  146:bipush          8
	//*  80  148:icmpne          163
						{
							stringbuilder.append(" -");
	//   81  151:aload           10
	//   82  153:ldc1            #40  <String " -">
	//   83  155:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   84  158:pop             
							l = j1;
	//   85  159:iload           8
	//   86  161:istore          6
						}
					}
					stringbuilder.append(String.format(" %02X", new Object[] {
						Integer.valueOf(abyte0[i] & 0xff)
					}));
	//   87  163:aload           10
	//   88  165:ldc1            #42  <String " %02X">
	//   89  167:iconst_1        
	//   90  168:anewarray       Object[]
	//   91  171:dup             
	//   92  172:iconst_0        
	//   93  173:aload_0         
	//   94  174:iload_1         
	//   95  175:baload          
	//   96  176:sipush          255
	//   97  179:iand            
	//   98  180:invokestatic    #26  <Method Integer Integer.valueOf(int)>
	//   99  183:aastore         
	//  100  184:invokestatic    #32  <Method String String.format(String, Object[])>
	//  101  187:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  102  190:pop             
					k1 = k - 1;
	//  103  191:iload           5
	//  104  193:iconst_1        
	//  105  194:isub            
	//  106  195:istore          9
					i1++;
	//  107  197:iload           7
	//  108  199:iconst_1        
	//  109  200:iadd            
	//  110  201:istore          7
					if(flag && (i1 == 16 || k1 == 0))
	//* 111  203:iload_3         
	//* 112  204:ifeq            339
	//* 113  207:iload           7
	//* 114  209:bipush          16
	//* 115  211:icmpeq          219
	//* 116  214:iload           9
	//* 117  216:ifne            339
					{
						j1 = 16 - i1;
	//  118  219:bipush          16
	//  119  221:iload           7
	//  120  223:isub            
	//  121  224:istore          8
						if(j1 > 0)
	//* 122  226:iload           8
	//* 123  228:ifle            258
							for(k = 0; k < j1; k++)
	//* 124  231:iconst_0        
	//* 125  232:istore          5
	//* 126  234:iload           5
	//* 127  236:iload           8
	//* 128  238:icmpge          258
								stringbuilder.append("   ");
	//  129  241:aload           10
	//  130  243:ldc1            #44  <String "   ">
	//  131  245:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  132  248:pop             

	//  133  249:iload           5
	//  134  251:iconst_1        
	//  135  252:iadd            
	//  136  253:istore          5
	//* 137  255:goto            234
						if(j1 >= 8)
	//* 138  258:iload           8
	//* 139  260:bipush          8
	//* 140  262:icmplt          273
							stringbuilder.append("  ");
	//  141  265:aload           10
	//  142  267:ldc1            #46  <String "  ">
	//  143  269:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  144  272:pop             
						stringbuilder.append("  ");
	//  145  273:aload           10
	//  146  275:ldc1            #46  <String "  ">
	//  147  277:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//  148  280:pop             
						for(k = 0; k < i1; k++)
	//* 149  281:iconst_0        
	//* 150  282:istore          5
	//* 151  284:iload           5
	//* 152  286:iload           7
	//* 153  288:icmpge          339
						{
							char c = (char)abyte0[l + k];
	//  154  291:aload_0         
	//  155  292:iload           6
	//  156  294:iload           5
	//  157  296:iadd            
	//  158  297:baload          
	//  159  298:int2char        
	//  160  299:istore          4
							if(c < ' ' || c > '~')
	//* 161  301:iload           4
	//* 162  303:bipush          32
	//* 163  305:icmplt          318
	//* 164  308:iload           4
	//* 165  310:bipush          126
	//* 166  312:icmpgt          318
	//* 167  315:goto            322
								c = '.';
	//  168  318:bipush          46
	//  169  320:istore          4
							stringbuilder.append(c);
	//  170  322:aload           10
	//  171  324:iload           4
	//  172  326:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//  173  329:pop             
						}

	//  174  330:iload           5
	//  175  332:iconst_1        
	//  176  333:iadd            
	//  177  334:istore          5
					}
	//* 178  336:goto            284
					if(i1 != 16)
	//* 179  339:iload           7
	//* 180  341:bipush          16
	//* 181  343:icmpeq          355
					{
						k = i1;
	//  182  346:iload           7
	//  183  348:istore          5
						if(k1 != 0)
							break label1;
	//  184  350:iload           9
	//  185  352:ifne            366
					}
					stringbuilder.append('\n');
	//  186  355:aload           10
	//  187  357:bipush          10
	//  188  359:invokevirtual   #49  <Method StringBuilder StringBuilder.append(char)>
	//  189  362:pop             
					k = 0;
	//  190  363:iconst_0        
	//  191  364:istore          5
				}
				i++;
	//  192  366:iload_1         
	//  193  367:iconst_1        
	//  194  368:iadd            
	//  195  369:istore_1        
				i1 = k;
	//  196  370:iload           5
	//  197  372:istore          7
				j1 = l;
	//  198  374:iload           6
	//  199  376:istore          8
			}

	//  200  378:iload           9
	//  201  380:istore          5
	//* 202  382:goto            71
			return stringbuilder.toString();
	//  203  385:aload           10
	//  204  387:invokevirtual   #53  <Method String StringBuilder.toString()>
	//  205  390:areturn         
		}
		return null;
	//  206  391:aconst_null     
	//  207  392:areturn         
	}
}
