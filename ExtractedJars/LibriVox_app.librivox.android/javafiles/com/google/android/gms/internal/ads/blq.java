// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Locale;

public final class blq
{

	private blq(String as[], int ai[], String as1[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = as;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String[] a>
		b = ai;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field int[] b>
		c = as1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #22  <Field String[] c>
		d = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #24  <Field int d>
	//   14   25:return          
	}

	public static blq a(String s)
	{
		int j;
		String as[];
		int ai[];
		String as1[];
label0:
		{
			as = new String[5];
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:astore          8
			ai = new int[4];
	//    3    6:iconst_4        
	//    4    7:newarray        int[]
	//    5    9:astore          9
			as1 = new String[4];
	//    6   11:iconst_4        
	//    7   12:anewarray       String[]
	//    8   15:astore          10
			as[0] = "";
	//    9   17:aload           8
	//   10   19:iconst_0        
	//   11   20:ldc1            #30  <String "">
	//   12   22:aastore         
			int i = 0;
	//   13   23:iconst_0        
	//   14   24:istore_1        
			j = 0;
	//   15   25:iconst_0        
	//   16   26:istore_2        
label1:
			do
			{
				if(i >= s.length())
					break label0;
	//   17   27:iload_1         
	//   18   28:aload_0         
	//   19   29:invokevirtual   #34  <Method int String.length()>
	//   20   32:icmpge          522
				int k = s.indexOf("$", i);
	//   21   35:aload_0         
	//   22   36:ldc1            #36  <String "$">
	//   23   38:iload_1         
	//   24   39:invokevirtual   #40  <Method int String.indexOf(String, int)>
	//   25   42:istore          4
				byte byte0 = -1;
	//   26   44:iconst_m1       
	//   27   45:istore_3        
				if(k == -1)
	//*  28   46:iload           4
	//*  29   48:iconst_m1       
	//*  30   49:icmpne          116
				{
					String s1 = String.valueOf(((Object) (as[j])));
	//   31   52:aload           8
	//   32   54:iload_2         
	//   33   55:aaload          
	//   34   56:invokestatic    #44  <Method String String.valueOf(Object)>
	//   35   59:astore          5
					String s4 = String.valueOf(((Object) (s.substring(i))));
	//   36   61:aload_0         
	//   37   62:iload_1         
	//   38   63:invokevirtual   #48  <Method String String.substring(int)>
	//   39   66:invokestatic    #44  <Method String String.valueOf(Object)>
	//   40   69:astore          6
					if(s4.length() != 0)
	//*  41   71:aload           6
	//*  42   73:invokevirtual   #34  <Method int String.length()>
	//*  43   76:ifeq            91
						s1 = s1.concat(s4);
	//   44   79:aload           5
	//   45   81:aload           6
	//   46   83:invokevirtual   #52  <Method String String.concat(String)>
	//   47   86:astore          5
					else
	//*  48   88:goto            102
						s1 = new String(s1);
	//   49   91:new             #28  <Class String>
	//   50   94:dup             
	//   51   95:aload           5
	//   52   97:invokespecial   #55  <Method void String(String)>
	//   53  100:astore          5
					as[j] = s1;
	//   54  102:aload           8
	//   55  104:iload_2         
	//   56  105:aload           5
	//   57  107:aastore         
					i = s.length();
	//   58  108:aload_0         
	//   59  109:invokevirtual   #34  <Method int String.length()>
	//   60  112:istore_1        
					continue;
	//   61  113:goto            27
				}
				if(k != i)
	//*  62  116:iload           4
	//*  63  118:iload_1         
	//*  64  119:icmpeq          186
				{
					String s2 = String.valueOf(((Object) (as[j])));
	//   65  122:aload           8
	//   66  124:iload_2         
	//   67  125:aaload          
	//   68  126:invokestatic    #44  <Method String String.valueOf(Object)>
	//   69  129:astore          5
					String s5 = String.valueOf(((Object) (s.substring(i, k))));
	//   70  131:aload_0         
	//   71  132:iload_1         
	//   72  133:iload           4
	//   73  135:invokevirtual   #58  <Method String String.substring(int, int)>
	//   74  138:invokestatic    #44  <Method String String.valueOf(Object)>
	//   75  141:astore          6
					if(s5.length() != 0)
	//*  76  143:aload           6
	//*  77  145:invokevirtual   #34  <Method int String.length()>
	//*  78  148:ifeq            163
						s2 = s2.concat(s5);
	//   79  151:aload           5
	//   80  153:aload           6
	//   81  155:invokevirtual   #52  <Method String String.concat(String)>
	//   82  158:astore          5
					else
	//*  83  160:goto            174
						s2 = new String(s2);
	//   84  163:new             #28  <Class String>
	//   85  166:dup             
	//   86  167:aload           5
	//   87  169:invokespecial   #55  <Method void String(String)>
	//   88  172:astore          5
					as[j] = s2;
	//   89  174:aload           8
	//   90  176:iload_2         
	//   91  177:aload           5
	//   92  179:aastore         
					i = k;
	//   93  180:iload           4
	//   94  182:istore_1        
					continue;
	//   95  183:goto            27
				}
				if(s.startsWith("$$", i))
	//*  96  186:aload_0         
	//*  97  187:ldc1            #60  <String "$$">
	//*  98  189:iload_1         
	//*  99  190:invokevirtual   #64  <Method boolean String.startsWith(String, int)>
	//* 100  193:ifeq            219
				{
					as[j] = String.valueOf(((Object) (as[j]))).concat("$");
	//  101  196:aload           8
	//  102  198:iload_2         
	//  103  199:aload           8
	//  104  201:iload_2         
	//  105  202:aaload          
	//  106  203:invokestatic    #44  <Method String String.valueOf(Object)>
	//  107  206:ldc1            #36  <String "$">
	//  108  208:invokevirtual   #52  <Method String String.concat(String)>
	//  109  211:aastore         
					i += 2;
	//  110  212:iload_1         
	//  111  213:iconst_2        
	//  112  214:iadd            
	//  113  215:istore_1        
					continue;
	//  114  216:goto            27
				}
				i++;
	//  115  219:iload_1         
	//  116  220:iconst_1        
	//  117  221:iadd            
	//  118  222:istore_1        
				k = s.indexOf("$", i);
	//  119  223:aload_0         
	//  120  224:ldc1            #36  <String "$">
	//  121  226:iload_1         
	//  122  227:invokevirtual   #40  <Method int String.indexOf(String, int)>
	//  123  230:istore          4
				String s7 = s.substring(i, k);
	//  124  232:aload_0         
	//  125  233:iload_1         
	//  126  234:iload           4
	//  127  236:invokevirtual   #58  <Method String String.substring(int, int)>
	//  128  239:astore          7
				if(s7.equals("RepresentationID"))
	//* 129  241:aload           7
	//* 130  243:ldc1            #66  <String "RepresentationID">
	//* 131  245:invokevirtual   #70  <Method boolean String.equals(Object)>
	//* 132  248:ifeq            259
				{
					ai[j] = 1;
	//  133  251:aload           9
	//  134  253:iload_2         
	//  135  254:iconst_1        
	//  136  255:iastore         
				} else
	//* 137  256:goto            485
				{
					i = s7.indexOf("%0");
	//  138  259:aload           7
	//  139  261:ldc1            #72  <String "%0">
	//  140  263:invokevirtual   #75  <Method int String.indexOf(String)>
	//  141  266:istore_1        
					String s6 = "%01d";
	//  142  267:ldc1            #77  <String "%01d">
	//  143  269:astore          6
					String s3 = s7;
	//  144  271:aload           7
	//  145  273:astore          5
					if(i != -1)
	//* 146  275:iload_1         
	//* 147  276:iconst_m1       
	//* 148  277:icmpeq          331
					{
						s6 = s7.substring(i);
	//  149  280:aload           7
	//  150  282:iload_1         
	//  151  283:invokevirtual   #48  <Method String String.substring(int)>
	//  152  286:astore          6
						s3 = s6;
	//  153  288:aload           6
	//  154  290:astore          5
						if(!s6.endsWith("d"))
	//* 155  292:aload           6
	//* 156  294:ldc1            #78  <String "d">
	//* 157  296:invokevirtual   #82  <Method boolean String.endsWith(String)>
	//* 158  299:ifne            314
							s3 = String.valueOf(((Object) (s6))).concat("d");
	//  159  302:aload           6
	//  160  304:invokestatic    #44  <Method String String.valueOf(Object)>
	//  161  307:ldc1            #78  <String "d">
	//  162  309:invokevirtual   #52  <Method String String.concat(String)>
	//  163  312:astore          5
						s7 = s7.substring(0, i);
	//  164  314:aload           7
	//  165  316:iconst_0        
	//  166  317:iload_1         
	//  167  318:invokevirtual   #58  <Method String String.substring(int, int)>
	//  168  321:astore          7
						s6 = s3;
	//  169  323:aload           5
	//  170  325:astore          6
						s3 = s7;
	//  171  327:aload           7
	//  172  329:astore          5
					}
					i = s3.hashCode();
	//  173  331:aload           5
	//  174  333:invokevirtual   #85  <Method int String.hashCode()>
	//  175  336:istore_1        
					if(i != 0x8bbdc769)
	//* 176  337:iload_1         
	//* 177  338:ldc1            #86  <Int 0x8bbdc769>
	//* 178  340:icmpeq          394
					{
						if(i != 0x27c6ed)
	//* 179  343:iload_1         
	//* 180  344:ldc1            #87  <Int 0x27c6ed>
	//* 181  346:icmpeq          377
						{
							if(i != 0x246e091)
	//* 182  349:iload_1         
	//* 183  350:ldc1            #88  <Int 0x246e091>
	//* 184  352:icmpeq          360
							{
								i = ((int) (byte0));
	//  185  355:iload_3         
	//  186  356:istore_1        
							} else
	//* 187  357:goto            408
							{
								i = ((int) (byte0));
	//  188  360:iload_3         
	//  189  361:istore_1        
								if(s3.equals("Bandwidth"))
	//* 190  362:aload           5
	//* 191  364:ldc1            #90  <String "Bandwidth">
	//* 192  366:invokevirtual   #70  <Method boolean String.equals(Object)>
	//* 193  369:ifeq            408
									i = 1;
	//  194  372:iconst_1        
	//  195  373:istore_1        
							}
						} else
	//* 196  374:goto            408
						{
							i = ((int) (byte0));
	//  197  377:iload_3         
	//  198  378:istore_1        
							if(s3.equals("Time"))
	//* 199  379:aload           5
	//* 200  381:ldc1            #92  <String "Time">
	//* 201  383:invokevirtual   #70  <Method boolean String.equals(Object)>
	//* 202  386:ifeq            408
								i = 2;
	//  203  389:iconst_2        
	//  204  390:istore_1        
						}
					} else
	//* 205  391:goto            408
					{
						i = ((int) (byte0));
	//  206  394:iload_3         
	//  207  395:istore_1        
						if(s3.equals("Number"))
	//* 208  396:aload           5
	//* 209  398:ldc1            #94  <String "Number">
	//* 210  400:invokevirtual   #70  <Method boolean String.equals(Object)>
	//* 211  403:ifeq            408
							i = 0;
	//  212  406:iconst_0        
	//  213  407:istore_1        
					}
					switch(i)
	//* 214  408:iload_1         
					{
	//* 215  409:tableswitch     0 2: default 436
	//	               0 474
	//	               1 466
	//	               2 458
					default:
						s = String.valueOf(((Object) (s)));
	//  216  436:aload_0         
	//  217  437:invokestatic    #44  <Method String String.valueOf(Object)>
	//  218  440:astore_0        
						if(s.length() != 0)
	//* 219  441:aload_0         
	//* 220  442:invokevirtual   #34  <Method int String.length()>
	//* 221  445:ifeq            503
							s = "Invalid template: ".concat(s);
	//  222  448:ldc1            #96  <String "Invalid template: ">
	//  223  450:aload_0         
	//  224  451:invokevirtual   #52  <Method String String.concat(String)>
	//  225  454:astore_0        
						else
	//* 226  455:goto            513
	//* 227  458:aload           9
	//* 228  460:iload_2         
	//* 229  461:iconst_4        
	//* 230  462:iastore         
	//* 231  463:goto            479
	//* 232  466:aload           9
	//* 233  468:iload_2         
	//* 234  469:iconst_3        
	//* 235  470:iastore         
	//* 236  471:goto            479
	//* 237  474:aload           9
	//* 238  476:iload_2         
	//* 239  477:iconst_2        
	//* 240  478:iastore         
	//* 241  479:aload           10
	//* 242  481:iload_2         
	//* 243  482:aload           6
	//* 244  484:aastore         
	//* 245  485:iload_2         
	//* 246  486:iconst_1        
	//* 247  487:iadd            
	//* 248  488:istore_2        
	//* 249  489:aload           8
	//* 250  491:iload_2         
	//* 251  492:ldc1            #30  <String "">
	//* 252  494:aastore         
	//* 253  495:iload           4
	//* 254  497:iconst_1        
	//* 255  498:iadd            
	//* 256  499:istore_1        
	//* 257  500:goto            27
							s = new String("Invalid template: ");
	//  258  503:new             #28  <Class String>
	//  259  506:dup             
	//  260  507:ldc1            #96  <String "Invalid template: ">
	//  261  509:invokespecial   #55  <Method void String(String)>
	//  262  512:astore_0        
						break label1;

					case 2: // '\002'
						ai[j] = 4;
						break;

					case 1: // '\001'
						ai[j] = 3;
						break;

					case 0: // '\0'
						ai[j] = 2;
						break;
					}
					as1[j] = s6;
				}
				j++;
				as[j] = "";
				i = k + 1;
			} while(true);
			throw new IllegalArgumentException(s);
	//  263  513:new             #98  <Class IllegalArgumentException>
	//  264  516:dup             
	//  265  517:aload_0         
	//  266  518:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//  267  521:athrow          
		}
		return new blq(as, ai, as1, j);
	//  268  522:new             #2   <Class blq>
	//  269  525:dup             
	//  270  526:aload           8
	//  271  528:aload           9
	//  272  530:aload           10
	//  273  532:iload_2         
	//  274  533:invokespecial   #101 <Method void blq(String[], int[], String[], int)>
	//  275  536:areturn         
	}

	public final String a(String s, int i, int j, long l)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #104 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #105 <Method void StringBuilder()>
	//    3    7:astore          8
		int k = 0;
	//    4    9:iconst_0        
	//    5   10:istore          6
		do
		{
			int i1 = d;
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field int d>
	//    8   16:istore          7
			if(k < i1)
	//*   9   18:iload           6
	//*  10   20:iload           7
	//*  11   22:icmpge          196
			{
				stringbuilder.append(a[k]);
	//   12   25:aload           8
	//   13   27:aload_0         
	//   14   28:getfield        #18  <Field String[] a>
	//   15   31:iload           6
	//   16   33:aaload          
	//   17   34:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
				int ai[] = b;
	//   19   38:aload_0         
	//   20   39:getfield        #20  <Field int[] b>
	//   21   42:astore          9
				if(ai[k] == 1)
	//*  22   44:aload           9
	//*  23   46:iload           6
	//*  24   48:iaload          
	//*  25   49:iconst_1        
	//*  26   50:icmpne          63
					stringbuilder.append(s);
	//   27   53:aload           8
	//   28   55:aload_1         
	//   29   56:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
				else
	//*  31   60:goto            187
				if(ai[k] == 2)
	//*  32   63:aload           9
	//*  33   65:iload           6
	//*  34   67:iaload          
	//*  35   68:iconst_2        
	//*  36   69:icmpne          105
					stringbuilder.append(String.format(Locale.US, c[k], new Object[] {
						Integer.valueOf(i)
					}));
	//   37   72:aload           8
	//   38   74:getstatic       #115 <Field Locale Locale.US>
	//   39   77:aload_0         
	//   40   78:getfield        #22  <Field String[] c>
	//   41   81:iload           6
	//   42   83:aaload          
	//   43   84:iconst_1        
	//   44   85:anewarray       Object[]
	//   45   88:dup             
	//   46   89:iconst_0        
	//   47   90:iload_2         
	//   48   91:invokestatic    #120 <Method Integer Integer.valueOf(int)>
	//   49   94:aastore         
	//   50   95:invokestatic    #124 <Method String String.format(Locale, String, Object[])>
	//   51   98:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   52  101:pop             
				else
	//*  53  102:goto            187
				if(ai[k] == 3)
	//*  54  105:aload           9
	//*  55  107:iload           6
	//*  56  109:iaload          
	//*  57  110:iconst_3        
	//*  58  111:icmpne          147
					stringbuilder.append(String.format(Locale.US, c[k], new Object[] {
						Integer.valueOf(j)
					}));
	//   59  114:aload           8
	//   60  116:getstatic       #115 <Field Locale Locale.US>
	//   61  119:aload_0         
	//   62  120:getfield        #22  <Field String[] c>
	//   63  123:iload           6
	//   64  125:aaload          
	//   65  126:iconst_1        
	//   66  127:anewarray       Object[]
	//   67  130:dup             
	//   68  131:iconst_0        
	//   69  132:iload_3         
	//   70  133:invokestatic    #120 <Method Integer Integer.valueOf(int)>
	//   71  136:aastore         
	//   72  137:invokestatic    #124 <Method String String.format(Locale, String, Object[])>
	//   73  140:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   74  143:pop             
				else
	//*  75  144:goto            187
				if(ai[k] == 4)
	//*  76  147:aload           9
	//*  77  149:iload           6
	//*  78  151:iaload          
	//*  79  152:iconst_4        
	//*  80  153:icmpne          187
					stringbuilder.append(String.format(Locale.US, c[k], new Object[] {
						Long.valueOf(l)
					}));
	//   81  156:aload           8
	//   82  158:getstatic       #115 <Field Locale Locale.US>
	//   83  161:aload_0         
	//   84  162:getfield        #22  <Field String[] c>
	//   85  165:iload           6
	//   86  167:aaload          
	//   87  168:iconst_1        
	//   88  169:anewarray       Object[]
	//   89  172:dup             
	//   90  173:iconst_0        
	//   91  174:lload           4
	//   92  176:invokestatic    #129 <Method Long Long.valueOf(long)>
	//   93  179:aastore         
	//   94  180:invokestatic    #124 <Method String String.format(Locale, String, Object[])>
	//   95  183:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   96  186:pop             
				k++;
	//   97  187:iload           6
	//   98  189:iconst_1        
	//   99  190:iadd            
	//  100  191:istore          6
			} else
	//* 101  193:goto            12
			{
				stringbuilder.append(a[i1]);
	//  102  196:aload           8
	//  103  198:aload_0         
	//  104  199:getfield        #18  <Field String[] a>
	//  105  202:iload           7
	//  106  204:aaload          
	//  107  205:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//  108  208:pop             
				return stringbuilder.toString();
	//  109  209:aload           8
	//  110  211:invokevirtual   #133 <Method String StringBuilder.toString()>
	//  111  214:areturn         
			}
		} while(true);
	}

	private final String a[];
	private final int b[];
	private final String c[];
	private final int d;
}
