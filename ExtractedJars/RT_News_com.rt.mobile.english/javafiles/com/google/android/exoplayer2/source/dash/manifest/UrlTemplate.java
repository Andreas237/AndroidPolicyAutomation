// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Locale;

public final class UrlTemplate
{

	private UrlTemplate(String as[], int ai[], String as1[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		urlPieces = as;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field String[] urlPieces>
		identifiers = ai;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #47  <Field int[] identifiers>
		identifierFormatTags = as1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #49  <Field String[] identifierFormatTags>
		identifierCount = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #51  <Field int identifierCount>
	//   14   25:return          
	}

	public static UrlTemplate compile(String s)
	{
		String as[] = new String[5];
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:astore_1        
		int ai[] = new int[4];
	//    3    5:iconst_4        
	//    4    6:newarray        int[]
	//    5    8:astore_2        
		String as1[] = new String[4];
	//    6    9:iconst_4        
	//    7   10:anewarray       String[]
	//    8   13:astore_3        
		return new UrlTemplate(as, ai, as1, parseTemplate(s, as, ai, as1));
	//    9   14:new             #2   <Class UrlTemplate>
	//   10   17:dup             
	//   11   18:aload_1         
	//   12   19:aload_2         
	//   13   20:aload_3         
	//   14   21:aload_0         
	//   15   22:aload_1         
	//   16   23:aload_2         
	//   17   24:aload_3         
	//   18   25:invokestatic    #60  <Method int parseTemplate(String, String[], int[], String[])>
	//   19   28:invokespecial   #62  <Method void UrlTemplate(String[], int[], String[], int)>
	//   20   31:areturn         
	}

	private static int parseTemplate(String s, String as[], int ai[], String as1[])
	{
		as[0] = "";
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:ldc1            #64  <String "">
	//    3    4:aastore         
		int i = 0;
	//    4    5:iconst_0        
	//    5    6:istore          4
		int j = i;
	//    6    8:iload           4
	//    7   10:istore          5
		while(i < s.length()) 
	//*   8   12:iload           4
	//*   9   14:aload_0         
	//*  10   15:invokevirtual   #68  <Method int String.length()>
	//*  11   18:icmpge          541
		{
			int k = s.indexOf("$", i);
	//   12   21:aload_0         
	//   13   22:ldc1            #70  <String "$">
	//   14   24:iload           4
	//   15   26:invokevirtual   #74  <Method int String.indexOf(String, int)>
	//   16   29:istore          7
			byte byte0 = -1;
	//   17   31:iconst_m1       
	//   18   32:istore          6
			if(k == -1)
	//*  19   34:iload           7
	//*  20   36:iconst_m1       
	//*  21   37:icmpne          89
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   22   40:new             #76  <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #77  <Method void StringBuilder()>
	//   25   47:astore          8
				stringbuilder.append(as[j]);
	//   26   49:aload           8
	//   27   51:aload_1         
	//   28   52:iload           5
	//   29   54:aaload          
	//   30   55:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
				stringbuilder.append(s.substring(i));
	//   32   59:aload           8
	//   33   61:aload_0         
	//   34   62:iload           4
	//   35   64:invokevirtual   #85  <Method String String.substring(int)>
	//   36   67:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   37   70:pop             
				as[j] = stringbuilder.toString();
	//   38   71:aload_1         
	//   39   72:iload           5
	//   40   74:aload           8
	//   41   76:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   42   79:aastore         
				i = s.length();
	//   43   80:aload_0         
	//   44   81:invokevirtual   #68  <Method int String.length()>
	//   45   84:istore          4
			} else
	//*  46   86:goto            12
			if(k != i)
	//*  47   89:iload           7
	//*  48   91:iload           4
	//*  49   93:icmpeq          145
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   50   96:new             #76  <Class StringBuilder>
	//   51   99:dup             
	//   52  100:invokespecial   #77  <Method void StringBuilder()>
	//   53  103:astore          8
				stringbuilder1.append(as[j]);
	//   54  105:aload           8
	//   55  107:aload_1         
	//   56  108:iload           5
	//   57  110:aaload          
	//   58  111:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   59  114:pop             
				stringbuilder1.append(s.substring(i, k));
	//   60  115:aload           8
	//   61  117:aload_0         
	//   62  118:iload           4
	//   63  120:iload           7
	//   64  122:invokevirtual   #92  <Method String String.substring(int, int)>
	//   65  125:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   66  128:pop             
				as[j] = stringbuilder1.toString();
	//   67  129:aload_1         
	//   68  130:iload           5
	//   69  132:aload           8
	//   70  134:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   71  137:aastore         
				i = k;
	//   72  138:iload           7
	//   73  140:istore          4
			} else
	//*  74  142:goto            12
			if(s.startsWith("$$", i))
	//*  75  145:aload_0         
	//*  76  146:ldc1            #17  <String "$$">
	//*  77  148:iload           4
	//*  78  150:invokevirtual   #96  <Method boolean String.startsWith(String, int)>
	//*  79  153:ifeq            201
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//   80  156:new             #76  <Class StringBuilder>
	//   81  159:dup             
	//   82  160:invokespecial   #77  <Method void StringBuilder()>
	//   83  163:astore          8
				stringbuilder2.append(as[j]);
	//   84  165:aload           8
	//   85  167:aload_1         
	//   86  168:iload           5
	//   87  170:aaload          
	//   88  171:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   89  174:pop             
				stringbuilder2.append("$");
	//   90  175:aload           8
	//   91  177:ldc1            #70  <String "$">
	//   92  179:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   93  182:pop             
				as[j] = stringbuilder2.toString();
	//   94  183:aload_1         
	//   95  184:iload           5
	//   96  186:aload           8
	//   97  188:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   98  191:aastore         
				i += 2;
	//   99  192:iload           4
	//  100  194:iconst_2        
	//  101  195:iadd            
	//  102  196:istore          4
			} else
	//* 103  198:goto            12
			{
				i++;
	//  104  201:iload           4
	//  105  203:iconst_1        
	//  106  204:iadd            
	//  107  205:istore          4
				int l = s.indexOf("$", i);
	//  108  207:aload_0         
	//  109  208:ldc1            #70  <String "$">
	//  110  210:iload           4
	//  111  212:invokevirtual   #74  <Method int String.indexOf(String, int)>
	//  112  215:istore          7
				String s1 = s.substring(i, l);
	//  113  217:aload_0         
	//  114  218:iload           4
	//  115  220:iload           7
	//  116  222:invokevirtual   #92  <Method String String.substring(int, int)>
	//  117  225:astore          10
				if(s1.equals("RepresentationID"))
	//* 118  227:aload           10
	//* 119  229:ldc1            #25  <String "RepresentationID">
	//* 120  231:invokevirtual   #100 <Method boolean String.equals(Object)>
	//* 121  234:ifeq            245
				{
					ai[j] = 1;
	//  122  237:aload_2         
	//  123  238:iload           5
	//  124  240:iconst_1        
	//  125  241:iastore         
				} else
	//* 126  242:goto            520
				{
					i = s1.indexOf("%0");
	//  127  245:aload           10
	//  128  247:ldc1            #102 <String "%0">
	//  129  249:invokevirtual   #105 <Method int String.indexOf(String)>
	//  130  252:istore          4
					Object obj1 = "%01d";
	//  131  254:ldc1            #14  <String "%01d">
	//  132  256:astore          9
					Object obj = ((Object) (s1));
	//  133  258:aload           10
	//  134  260:astore          8
					if(i != -1)
	//* 135  262:iload           4
	//* 136  264:iconst_m1       
	//* 137  265:icmpeq          341
					{
						obj1 = ((Object) (s1.substring(i)));
	//  138  268:aload           10
	//  139  270:iload           4
	//  140  272:invokevirtual   #85  <Method String String.substring(int)>
	//  141  275:astore          9
						obj = obj1;
	//  142  277:aload           9
	//  143  279:astore          8
						if(!((String) (obj1)).endsWith("d"))
	//* 144  281:aload           9
	//* 145  283:ldc1            #107 <String "d">
	//* 146  285:invokevirtual   #111 <Method boolean String.endsWith(String)>
	//* 147  288:ifne            323
						{
							obj = ((Object) (new StringBuilder()));
	//  148  291:new             #76  <Class StringBuilder>
	//  149  294:dup             
	//  150  295:invokespecial   #77  <Method void StringBuilder()>
	//  151  298:astore          8
							((StringBuilder) (obj)).append(((String) (obj1)));
	//  152  300:aload           8
	//  153  302:aload           9
	//  154  304:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  155  307:pop             
							((StringBuilder) (obj)).append("d");
	//  156  308:aload           8
	//  157  310:ldc1            #107 <String "d">
	//  158  312:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  159  315:pop             
							obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  160  316:aload           8
	//  161  318:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  162  321:astore          8
						}
						s1 = s1.substring(0, i);
	//  163  323:aload           10
	//  164  325:iconst_0        
	//  165  326:iload           4
	//  166  328:invokevirtual   #92  <Method String String.substring(int, int)>
	//  167  331:astore          10
						obj1 = obj;
	//  168  333:aload           8
	//  169  335:astore          9
						obj = ((Object) (s1));
	//  170  337:aload           10
	//  171  339:astore          8
					}
					i = ((String) (obj)).hashCode();
	//  172  341:aload           8
	//  173  343:invokevirtual   #114 <Method int String.hashCode()>
	//  174  346:istore          4
					if(i != 0x8bbdc769)
	//* 175  348:iload           4
	//* 176  350:ldc1            #115 <Int 0x8bbdc769>
	//* 177  352:icmpeq          416
					{
						if(i != 0x27c6ed)
	//* 178  355:iload           4
	//* 179  357:ldc1            #116 <Int 0x27c6ed>
	//* 180  359:icmpeq          396
						{
							if(i != 0x246e091)
	//* 181  362:iload           4
	//* 182  364:ldc1            #117 <Int 0x246e091>
	//* 183  366:icmpeq          376
							{
								i = ((int) (byte0));
	//  184  369:iload           6
	//  185  371:istore          4
							} else
	//* 186  373:goto            433
							{
								i = ((int) (byte0));
	//  187  376:iload           6
	//  188  378:istore          4
								if(((String) (obj)).equals("Bandwidth"))
	//* 189  380:aload           8
	//* 190  382:ldc1            #8   <String "Bandwidth">
	//* 191  384:invokevirtual   #100 <Method boolean String.equals(Object)>
	//* 192  387:ifeq            433
									i = 1;
	//  193  390:iconst_1        
	//  194  391:istore          4
							}
						} else
	//* 195  393:goto            433
						{
							i = ((int) (byte0));
	//  196  396:iload           6
	//  197  398:istore          4
							if(((String) (obj)).equals("Time"))
	//* 198  400:aload           8
	//* 199  402:ldc1            #30  <String "Time">
	//* 200  404:invokevirtual   #100 <Method boolean String.equals(Object)>
	//* 201  407:ifeq            433
								i = 2;
	//  202  410:iconst_2        
	//  203  411:istore          4
						}
					} else
	//* 204  413:goto            433
					{
						i = ((int) (byte0));
	//  205  416:iload           6
	//  206  418:istore          4
						if(((String) (obj)).equals("Number"))
	//* 207  420:aload           8
	//* 208  422:ldc1            #20  <String "Number">
	//* 209  424:invokevirtual   #100 <Method boolean String.equals(Object)>
	//* 210  427:ifeq            433
							i = 0;
	//  211  430:iconst_0        
	//  212  431:istore          4
					}
					switch(i)
	//* 213  433:iload           4
					{
	//* 214  435:tableswitch     0 2: default 460
	//	               0 509
	//	               1 501
	//	               2 493
					default:
						as = ((String []) (new StringBuilder()));
	//  215  460:new             #76  <Class StringBuilder>
	//  216  463:dup             
	//  217  464:invokespecial   #77  <Method void StringBuilder()>
	//  218  467:astore_1        
						((StringBuilder) (as)).append("Invalid template: ");
	//  219  468:aload_1         
	//  220  469:ldc1            #119 <String "Invalid template: ">
	//  221  471:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  222  474:pop             
						((StringBuilder) (as)).append(s);
	//  223  475:aload_1         
	//  224  476:aload_0         
	//  225  477:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  226  480:pop             
						throw new IllegalArgumentException(((StringBuilder) (as)).toString());
	//  227  481:new             #121 <Class IllegalArgumentException>
	//  228  484:dup             
	//  229  485:aload_1         
	//  230  486:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  231  489:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//  232  492:athrow          

					case 2: // '\002'
						ai[j] = 4;
	//  233  493:aload_2         
	//  234  494:iload           5
	//  235  496:iconst_4        
	//  236  497:iastore         
						break;

	//* 237  498:goto            514
					case 1: // '\001'
						ai[j] = 3;
	//  238  501:aload_2         
	//  239  502:iload           5
	//  240  504:iconst_3        
	//  241  505:iastore         
						break;

	//* 242  506:goto            514
					case 0: // '\0'
						ai[j] = 2;
	//  243  509:aload_2         
	//  244  510:iload           5
	//  245  512:iconst_2        
	//  246  513:iastore         
						break;
					}
					as1[j] = ((String) (obj1));
	//  247  514:aload_3         
	//  248  515:iload           5
	//  249  517:aload           9
	//  250  519:aastore         
				}
				j++;
	//  251  520:iload           5
	//  252  522:iconst_1        
	//  253  523:iadd            
	//  254  524:istore          5
				as[j] = "";
	//  255  526:aload_1         
	//  256  527:iload           5
	//  257  529:ldc1            #64  <String "">
	//  258  531:aastore         
				i = l + 1;
	//  259  532:iload           7
	//  260  534:iconst_1        
	//  261  535:iadd            
	//  262  536:istore          4
			}
		}
	//* 263  538:goto            142
		return j;
	//  264  541:iload           5
	//  265  543:ireturn         
	}

	public String buildUri(String s, long l, int i, long l1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #76  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:astore          8
		for(int j = 0; j < identifierCount; j++)
	//*   4    9:iconst_0        
	//*   5   10:istore          7
	//*   6   12:iload           7
	//*   7   14:aload_0         
	//*   8   15:getfield        #51  <Field int identifierCount>
	//*   9   18:icmpge          195
		{
			stringbuilder.append(urlPieces[j]);
	//   10   21:aload           8
	//   11   23:aload_0         
	//   12   24:getfield        #45  <Field String[] urlPieces>
	//   13   27:iload           7
	//   14   29:aaload          
	//   15   30:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			if(identifiers[j] == 1)
	//*  17   34:aload_0         
	//*  18   35:getfield        #47  <Field int[] identifiers>
	//*  19   38:iload           7
	//*  20   40:iaload          
	//*  21   41:iconst_1        
	//*  22   42:icmpne          55
			{
				stringbuilder.append(s);
	//   23   45:aload           8
	//   24   47:aload_1         
	//   25   48:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
				continue;
	//   27   52:goto            186
			}
			if(identifiers[j] == 2)
	//*  28   55:aload_0         
	//*  29   56:getfield        #47  <Field int[] identifiers>
	//*  30   59:iload           7
	//*  31   61:iaload          
	//*  32   62:iconst_2        
	//*  33   63:icmpne          99
			{
				stringbuilder.append(String.format(Locale.US, identifierFormatTags[j], new Object[] {
					Long.valueOf(l)
				}));
	//   34   66:aload           8
	//   35   68:getstatic       #132 <Field Locale Locale.US>
	//   36   71:aload_0         
	//   37   72:getfield        #49  <Field String[] identifierFormatTags>
	//   38   75:iload           7
	//   39   77:aaload          
	//   40   78:iconst_1        
	//   41   79:anewarray       Object[]
	//   42   82:dup             
	//   43   83:iconst_0        
	//   44   84:lload_2         
	//   45   85:invokestatic    #138 <Method Long Long.valueOf(long)>
	//   46   88:aastore         
	//   47   89:invokestatic    #142 <Method String String.format(Locale, String, Object[])>
	//   48   92:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   49   95:pop             
				continue;
	//   50   96:goto            186
			}
			if(identifiers[j] == 3)
	//*  51   99:aload_0         
	//*  52  100:getfield        #47  <Field int[] identifiers>
	//*  53  103:iload           7
	//*  54  105:iaload          
	//*  55  106:iconst_3        
	//*  56  107:icmpne          144
			{
				stringbuilder.append(String.format(Locale.US, identifierFormatTags[j], new Object[] {
					Integer.valueOf(i)
				}));
	//   57  110:aload           8
	//   58  112:getstatic       #132 <Field Locale Locale.US>
	//   59  115:aload_0         
	//   60  116:getfield        #49  <Field String[] identifierFormatTags>
	//   61  119:iload           7
	//   62  121:aaload          
	//   63  122:iconst_1        
	//   64  123:anewarray       Object[]
	//   65  126:dup             
	//   66  127:iconst_0        
	//   67  128:iload           4
	//   68  130:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   69  133:aastore         
	//   70  134:invokestatic    #142 <Method String String.format(Locale, String, Object[])>
	//   71  137:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   72  140:pop             
				continue;
	//   73  141:goto            186
			}
			if(identifiers[j] == 4)
	//*  74  144:aload_0         
	//*  75  145:getfield        #47  <Field int[] identifiers>
	//*  76  148:iload           7
	//*  77  150:iaload          
	//*  78  151:iconst_4        
	//*  79  152:icmpne          186
				stringbuilder.append(String.format(Locale.US, identifierFormatTags[j], new Object[] {
					Long.valueOf(l1)
				}));
	//   80  155:aload           8
	//   81  157:getstatic       #132 <Field Locale Locale.US>
	//   82  160:aload_0         
	//   83  161:getfield        #49  <Field String[] identifierFormatTags>
	//   84  164:iload           7
	//   85  166:aaload          
	//   86  167:iconst_1        
	//   87  168:anewarray       Object[]
	//   88  171:dup             
	//   89  172:iconst_0        
	//   90  173:lload           5
	//   91  175:invokestatic    #138 <Method Long Long.valueOf(long)>
	//   92  178:aastore         
	//   93  179:invokestatic    #142 <Method String String.format(Locale, String, Object[])>
	//   94  182:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   95  185:pop             
		}

	//   96  186:iload           7
	//   97  188:iconst_1        
	//   98  189:iadd            
	//   99  190:istore          7
	//* 100  192:goto            12
		stringbuilder.append(urlPieces[identifierCount]);
	//  101  195:aload           8
	//  102  197:aload_0         
	//  103  198:getfield        #45  <Field String[] urlPieces>
	//  104  201:aload_0         
	//  105  202:getfield        #51  <Field int identifierCount>
	//  106  205:aaload          
	//  107  206:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  108  209:pop             
		return stringbuilder.toString();
	//  109  210:aload           8
	//  110  212:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  111  215:areturn         
	}

	private static final String BANDWIDTH = "Bandwidth";
	private static final int BANDWIDTH_ID = 3;
	private static final String DEFAULT_FORMAT_TAG = "%01d";
	private static final String ESCAPED_DOLLAR = "$$";
	private static final String NUMBER = "Number";
	private static final int NUMBER_ID = 2;
	private static final String REPRESENTATION = "RepresentationID";
	private static final int REPRESENTATION_ID = 1;
	private static final String TIME = "Time";
	private static final int TIME_ID = 4;
	private final int identifierCount;
	private final String identifierFormatTags[];
	private final int identifiers[];
	private final String urlPieces[];
}
