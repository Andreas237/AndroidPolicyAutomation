// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;
import java.util.StringTokenizer;

public final class HexDumpUtils
{

	public HexDumpUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static byte[] bytesFromString(String s)
	{
		s = ((String) (new StringTokenizer(s, " \t\n")));
	//    0    0:new             #15  <Class StringTokenizer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #17  <String " \t\n">
	//    4    7:invokespecial   #20  <Method void StringTokenizer(String, String)>
	//    5   10:astore_0        
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    6   11:new             #22  <Class ByteArrayOutputStream>
	//    7   14:dup             
	//    8   15:invokespecial   #23  <Method void ByteArrayOutputStream()>
	//    9   18:astore_1        
		while(((StringTokenizer) (s)).hasMoreTokens()) 
	//*  10   19:aload_0         
	//*  11   20:invokevirtual   #27  <Method boolean StringTokenizer.hasMoreTokens()>
	//*  12   23:ifeq            48
			try
			{
				bytearrayoutputstream.write(Integer.parseInt(((StringTokenizer) (s)).nextToken(), 16) & 0xff);
	//   13   26:aload_1         
	//   14   27:aload_0         
	//   15   28:invokevirtual   #31  <Method String StringTokenizer.nextToken()>
	//   16   31:bipush          16
	//   17   33:invokestatic    #37  <Method int Integer.parseInt(String, int)>
	//   18   36:sipush          255
	//   19   39:iand            
	//   20   40:invokevirtual   #41  <Method void ByteArrayOutputStream.write(int)>
			}
	//*  21   43:goto            19
	//*  22   46:aconst_null     
	//*  23   47:areturn         
	//*  24   48:aload_1         
	//*  25   49:invokevirtual   #45  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  26   52:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				return null;
			}
		return bytearrayoutputstream.toByteArray();
	//*  27   53:astore_0        
	//*  28   54:goto            46
	}

	public static String dump(byte abyte0[], int i, int j, boolean flag)
	{
label0:
		{
			if(abyte0 == null || abyte0.length == 0 || i < 0 || j <= 0 || i + j > abyte0.length)
	//*   0    0:aload_0         
	//*   1    1:ifnull          395
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifeq            395
	//*   5    9:iload_1         
	//*   6   10:iflt            395
	//*   7   13:iload_2         
	//*   8   14:ifle            395
	//*   9   17:iload_1         
	//*  10   18:iload_2         
	//*  11   19:iadd            
	//*  12   20:aload_0         
	//*  13   21:arraylength     
	//*  14   22:icmple          28
				break label0;
	//   15   25:goto            395
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
	//   22   40:new             #49  <Class StringBuilder>
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
	//   33   56:invokespecial   #51  <Method void StringBuilder(int)>
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
	//*  42   72:ifle            389
			{
				int l;
label1:
				{
					if(i1 == 0)
	//*  43   75:iload           7
	//*  44   77:ifne            144
					{
						String s;
						Object aobj[];
						if(j < 0x10000)
	//*  45   80:iload_2         
	//*  46   81:ldc1            #52  <Int 0x10000>
	//*  47   83:icmpge          107
						{
							s = "%04X:";
	//   48   86:ldc1            #54  <String "%04X:">
	//   49   88:astore          10
							aobj = new Object[1];
	//   50   90:iconst_1        
	//   51   91:anewarray       Object[]
	//   52   94:astore          11
							aobj[0] = ((Object) (Integer.valueOf(i)));
	//   53   96:aload           11
	//   54   98:iconst_0        
	//   55   99:iload_1         
	//   56  100:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//   57  103:aastore         
						} else
	//*  58  104:goto            125
						{
							s = "%08X:";
	//   59  107:ldc1            #60  <String "%08X:">
	//   60  109:astore          10
							aobj = new Object[1];
	//   61  111:iconst_1        
	//   62  112:anewarray       Object[]
	//   63  115:astore          11
							aobj[0] = ((Object) (Integer.valueOf(i)));
	//   64  117:aload           11
	//   65  119:iconst_0        
	//   66  120:iload_1         
	//   67  121:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//   68  124:aastore         
						}
						stringbuilder.append(String.format(s, aobj));
	//   69  125:aload           12
	//   70  127:aload           10
	//   71  129:aload           11
	//   72  131:invokestatic    #66  <Method String String.format(String, Object[])>
	//   73  134:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   74  137:pop             
						l = i;
	//   75  138:iload_1         
	//   76  139:istore          6
					} else
	//*  77  141:goto            167
					{
						l = j1;
	//   78  144:iload           8
	//   79  146:istore          6
						if(i1 == 8)
	//*  80  148:iload           7
	//*  81  150:bipush          8
	//*  82  152:icmpne          167
						{
							stringbuilder.append(" -");
	//   83  155:aload           12
	//   84  157:ldc1            #72  <String " -">
	//   85  159:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   86  162:pop             
							l = j1;
	//   87  163:iload           8
	//   88  165:istore          6
						}
					}
					stringbuilder.append(String.format(" %02X", new Object[] {
						Integer.valueOf(abyte0[i] & 0xff)
					}));
	//   89  167:aload           12
	//   90  169:ldc1            #74  <String " %02X">
	//   91  171:iconst_1        
	//   92  172:anewarray       Object[]
	//   93  175:dup             
	//   94  176:iconst_0        
	//   95  177:aload_0         
	//   96  178:iload_1         
	//   97  179:baload          
	//   98  180:sipush          255
	//   99  183:iand            
	//  100  184:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//  101  187:aastore         
	//  102  188:invokestatic    #66  <Method String String.format(String, Object[])>
	//  103  191:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//  104  194:pop             
					k1 = k - 1;
	//  105  195:iload           5
	//  106  197:iconst_1        
	//  107  198:isub            
	//  108  199:istore          9
					i1++;
	//  109  201:iload           7
	//  110  203:iconst_1        
	//  111  204:iadd            
	//  112  205:istore          7
					if(flag && (i1 == 16 || k1 == 0))
	//* 113  207:iload_3         
	//* 114  208:ifeq            343
	//* 115  211:iload           7
	//* 116  213:bipush          16
	//* 117  215:icmpeq          223
	//* 118  218:iload           9
	//* 119  220:ifne            343
					{
						j1 = 16 - i1;
	//  120  223:bipush          16
	//  121  225:iload           7
	//  122  227:isub            
	//  123  228:istore          8
						if(j1 > 0)
	//* 124  230:iload           8
	//* 125  232:ifle            262
							for(k = 0; k < j1; k++)
	//* 126  235:iconst_0        
	//* 127  236:istore          5
	//* 128  238:iload           5
	//* 129  240:iload           8
	//* 130  242:icmpge          262
								stringbuilder.append("   ");
	//  131  245:aload           12
	//  132  247:ldc1            #76  <String "   ">
	//  133  249:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//  134  252:pop             

	//  135  253:iload           5
	//  136  255:iconst_1        
	//  137  256:iadd            
	//  138  257:istore          5
	//* 139  259:goto            238
						if(j1 >= 8)
	//* 140  262:iload           8
	//* 141  264:bipush          8
	//* 142  266:icmplt          277
							stringbuilder.append("  ");
	//  143  269:aload           12
	//  144  271:ldc1            #78  <String "  ">
	//  145  273:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//  146  276:pop             
						stringbuilder.append("  ");
	//  147  277:aload           12
	//  148  279:ldc1            #78  <String "  ">
	//  149  281:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//  150  284:pop             
						for(k = 0; k < i1; k++)
	//* 151  285:iconst_0        
	//* 152  286:istore          5
	//* 153  288:iload           5
	//* 154  290:iload           7
	//* 155  292:icmpge          343
						{
							char c = (char)abyte0[l + k];
	//  156  295:aload_0         
	//  157  296:iload           6
	//  158  298:iload           5
	//  159  300:iadd            
	//  160  301:baload          
	//  161  302:int2char        
	//  162  303:istore          4
							if(c < ' ' || c > '~')
	//* 163  305:iload           4
	//* 164  307:bipush          32
	//* 165  309:icmplt          322
	//* 166  312:iload           4
	//* 167  314:bipush          126
	//* 168  316:icmpgt          322
	//* 169  319:goto            326
								c = '.';
	//  170  322:bipush          46
	//  171  324:istore          4
							stringbuilder.append(c);
	//  172  326:aload           12
	//  173  328:iload           4
	//  174  330:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//  175  333:pop             
						}

	//  176  334:iload           5
	//  177  336:iconst_1        
	//  178  337:iadd            
	//  179  338:istore          5
					}
	//* 180  340:goto            288
					if(i1 != 16)
	//* 181  343:iload           7
	//* 182  345:bipush          16
	//* 183  347:icmpeq          359
					{
						k = i1;
	//  184  350:iload           7
	//  185  352:istore          5
						if(k1 != 0)
							break label1;
	//  186  354:iload           9
	//  187  356:ifne            370
					}
					stringbuilder.append('\n');
	//  188  359:aload           12
	//  189  361:bipush          10
	//  190  363:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//  191  366:pop             
					k = 0;
	//  192  367:iconst_0        
	//  193  368:istore          5
				}
				i++;
	//  194  370:iload_1         
	//  195  371:iconst_1        
	//  196  372:iadd            
	//  197  373:istore_1        
				i1 = k;
	//  198  374:iload           5
	//  199  376:istore          7
				j1 = l;
	//  200  378:iload           6
	//  201  380:istore          8
			}

	//  202  382:iload           9
	//  203  384:istore          5
	//* 204  386:goto            70
			return stringbuilder.toString();
	//  205  389:aload           12
	//  206  391:invokevirtual   #84  <Method String StringBuilder.toString()>
	//  207  394:areturn         
		}
		return null;
	//  208  395:aconst_null     
	//  209  396:areturn         
	}
}
