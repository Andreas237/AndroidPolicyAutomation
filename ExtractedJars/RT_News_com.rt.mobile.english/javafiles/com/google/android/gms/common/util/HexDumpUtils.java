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
	//*   1    1:ifnull          399
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifeq            399
	//*   5    9:iload_1         
	//*   6   10:iflt            399
	//*   7   13:iload_2         
	//*   8   14:ifle            399
	//*   9   17:iload_1         
	//*  10   18:iload_2         
	//*  11   19:iadd            
	//*  12   20:aload_0         
	//*  13   21:arraylength     
	//*  14   22:icmple          28
				break label0;
	//   15   25:goto            399
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
			int j1 = i1;
	//   39   67:iload           7
	//   40   69:istore          8
			int k1;
			for(; k > 0; k = k1)
	//*  41   71:iload           5
	//*  42   73:ifle            393
			{
				int l;
label1:
				{
					if(i1 == 0)
	//*  43   76:iload           7
	//*  44   78:ifne            148
					{
						String s;
						Object aobj[];
						if(j < 0x10000)
	//*  45   81:iload_2         
	//*  46   82:ldc1            #52  <Int 0x10000>
	//*  47   84:icmpge          121
						{
							s = "%04X:";
	//   48   87:ldc1            #54  <String "%04X:">
	//   49   89:astore          10
							aobj = new Object[1];
	//   50   91:iconst_1        
	//   51   92:anewarray       Object[]
	//   52   95:astore          11
							aobj[0] = ((Object) (Integer.valueOf(i)));
	//   53   97:aload           11
	//   54   99:iconst_0        
	//   55  100:iload_1         
	//   56  101:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//   57  104:aastore         
						} else
	//*  58  105:aload           12
	//*  59  107:aload           10
	//*  60  109:aload           11
	//*  61  111:invokestatic    #64  <Method String String.format(String, Object[])>
	//*  62  114:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//*  63  117:pop             
	//*  64  118:goto            142
						{
							s = "%08X:";
	//   65  121:ldc1            #70  <String "%08X:">
	//   66  123:astore          10
							aobj = new Object[1];
	//   67  125:iconst_1        
	//   68  126:anewarray       Object[]
	//   69  129:astore          11
							aobj[0] = ((Object) (Integer.valueOf(i)));
	//   70  131:aload           11
	//   71  133:iconst_0        
	//   72  134:iload_1         
	//   73  135:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//   74  138:aastore         
						}
						stringbuilder.append(String.format(s, aobj));
	//*  75  139:goto            105
						l = i;
	//   76  142:iload_1         
	//   77  143:istore          6
					} else
	//*  78  145:goto            171
					{
						l = j1;
	//   79  148:iload           8
	//   80  150:istore          6
						if(i1 == 8)
	//*  81  152:iload           7
	//*  82  154:bipush          8
	//*  83  156:icmpne          171
						{
							stringbuilder.append(" -");
	//   84  159:aload           12
	//   85  161:ldc1            #72  <String " -">
	//   86  163:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   87  166:pop             
							l = j1;
	//   88  167:iload           8
	//   89  169:istore          6
						}
					}
					stringbuilder.append(String.format(" %02X", new Object[] {
						Integer.valueOf(abyte0[i] & 0xff)
					}));
	//   90  171:aload           12
	//   91  173:ldc1            #74  <String " %02X">
	//   92  175:iconst_1        
	//   93  176:anewarray       Object[]
	//   94  179:dup             
	//   95  180:iconst_0        
	//   96  181:aload_0         
	//   97  182:iload_1         
	//   98  183:baload          
	//   99  184:sipush          255
	//  100  187:iand            
	//  101  188:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//  102  191:aastore         
	//  103  192:invokestatic    #64  <Method String String.format(String, Object[])>
	//  104  195:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//  105  198:pop             
					k1 = k - 1;
	//  106  199:iload           5
	//  107  201:iconst_1        
	//  108  202:isub            
	//  109  203:istore          9
					i1++;
	//  110  205:iload           7
	//  111  207:iconst_1        
	//  112  208:iadd            
	//  113  209:istore          7
					if(flag && (i1 == 16 || k1 == 0))
	//* 114  211:iload_3         
	//* 115  212:ifeq            347
	//* 116  215:iload           7
	//* 117  217:bipush          16
	//* 118  219:icmpeq          227
	//* 119  222:iload           9
	//* 120  224:ifne            347
					{
						j1 = 16 - i1;
	//  121  227:bipush          16
	//  122  229:iload           7
	//  123  231:isub            
	//  124  232:istore          8
						if(j1 > 0)
	//* 125  234:iload           8
	//* 126  236:ifle            266
							for(k = 0; k < j1; k++)
	//* 127  239:iconst_0        
	//* 128  240:istore          5
	//* 129  242:iload           5
	//* 130  244:iload           8
	//* 131  246:icmpge          266
								stringbuilder.append("   ");
	//  132  249:aload           12
	//  133  251:ldc1            #76  <String "   ">
	//  134  253:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//  135  256:pop             

	//  136  257:iload           5
	//  137  259:iconst_1        
	//  138  260:iadd            
	//  139  261:istore          5
	//* 140  263:goto            242
						if(j1 >= 8)
	//* 141  266:iload           8
	//* 142  268:bipush          8
	//* 143  270:icmplt          281
							stringbuilder.append("  ");
	//  144  273:aload           12
	//  145  275:ldc1            #78  <String "  ">
	//  146  277:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//  147  280:pop             
						stringbuilder.append("  ");
	//  148  281:aload           12
	//  149  283:ldc1            #78  <String "  ">
	//  150  285:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//  151  288:pop             
						for(k = 0; k < i1; k++)
	//* 152  289:iconst_0        
	//* 153  290:istore          5
	//* 154  292:iload           5
	//* 155  294:iload           7
	//* 156  296:icmpge          347
						{
							char c = (char)abyte0[l + k];
	//  157  299:aload_0         
	//  158  300:iload           6
	//  159  302:iload           5
	//  160  304:iadd            
	//  161  305:baload          
	//  162  306:int2char        
	//  163  307:istore          4
							if(c < ' ' || c > '~')
	//* 164  309:iload           4
	//* 165  311:bipush          32
	//* 166  313:icmplt          326
	//* 167  316:iload           4
	//* 168  318:bipush          126
	//* 169  320:icmpgt          326
	//* 170  323:goto            330
								c = '.';
	//  171  326:bipush          46
	//  172  328:istore          4
							stringbuilder.append(c);
	//  173  330:aload           12
	//  174  332:iload           4
	//  175  334:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//  176  337:pop             
						}

	//  177  338:iload           5
	//  178  340:iconst_1        
	//  179  341:iadd            
	//  180  342:istore          5
					}
	//* 181  344:goto            292
					if(i1 != 16)
	//* 182  347:iload           7
	//* 183  349:bipush          16
	//* 184  351:icmpeq          363
					{
						k = i1;
	//  185  354:iload           7
	//  186  356:istore          5
						if(k1 != 0)
							break label1;
	//  187  358:iload           9
	//  188  360:ifne            374
					}
					stringbuilder.append('\n');
	//  189  363:aload           12
	//  190  365:bipush          10
	//  191  367:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//  192  370:pop             
					k = 0;
	//  193  371:iconst_0        
	//  194  372:istore          5
				}
				i++;
	//  195  374:iload_1         
	//  196  375:iconst_1        
	//  197  376:iadd            
	//  198  377:istore_1        
				i1 = k;
	//  199  378:iload           5
	//  200  380:istore          7
				j1 = l;
	//  201  382:iload           6
	//  202  384:istore          8
			}

	//  203  386:iload           9
	//  204  388:istore          5
	//* 205  390:goto            71
			return stringbuilder.toString();
	//  206  393:aload           12
	//  207  395:invokevirtual   #84  <Method String StringBuilder.toString()>
	//  208  398:areturn         
		}
		return null;
	//  209  399:aconst_null     
	//  210  400:areturn         
	}
}
