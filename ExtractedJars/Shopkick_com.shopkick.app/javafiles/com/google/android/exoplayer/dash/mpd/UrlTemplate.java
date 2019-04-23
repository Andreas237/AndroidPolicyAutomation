// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

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
		int j;
label0:
		{
			as[0] = "";
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:ldc1            #64  <String "">
	//    3    4:aastore         
			int i = 0;
	//    4    5:iconst_0        
	//    5    6:istore          4
			j = i;
	//    6    8:iload           4
	//    7   10:istore          5
			do
			{
				if(i >= s.length())
					break label0;
	//    8   12:iload           4
	//    9   14:aload_0         
	//   10   15:invokevirtual   #68  <Method int String.length()>
	//   11   18:icmpge          448
				int k = s.indexOf("$", i);
	//   12   21:aload_0         
	//   13   22:ldc1            #70  <String "$">
	//   14   24:iload           4
	//   15   26:invokevirtual   #74  <Method int String.indexOf(String, int)>
	//   16   29:istore          6
				if(k == -1)
	//*  17   31:iload           6
	//*  18   33:iconst_m1       
	//*  19   34:icmpne          86
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   20   37:new             #76  <Class StringBuilder>
	//   21   40:dup             
	//   22   41:invokespecial   #77  <Method void StringBuilder()>
	//   23   44:astore          7
					stringbuilder.append(as[j]);
	//   24   46:aload           7
	//   25   48:aload_1         
	//   26   49:iload           5
	//   27   51:aaload          
	//   28   52:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   29   55:pop             
					stringbuilder.append(s.substring(i));
	//   30   56:aload           7
	//   31   58:aload_0         
	//   32   59:iload           4
	//   33   61:invokevirtual   #85  <Method String String.substring(int)>
	//   34   64:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
					as[j] = stringbuilder.toString();
	//   36   68:aload_1         
	//   37   69:iload           5
	//   38   71:aload           7
	//   39   73:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   40   76:aastore         
					i = s.length();
	//   41   77:aload_0         
	//   42   78:invokevirtual   #68  <Method int String.length()>
	//   43   81:istore          4
					continue;
	//   44   83:goto            12
				}
				if(k != i)
	//*  45   86:iload           6
	//*  46   88:iload           4
	//*  47   90:icmpeq          142
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//   48   93:new             #76  <Class StringBuilder>
	//   49   96:dup             
	//   50   97:invokespecial   #77  <Method void StringBuilder()>
	//   51  100:astore          7
					stringbuilder1.append(as[j]);
	//   52  102:aload           7
	//   53  104:aload_1         
	//   54  105:iload           5
	//   55  107:aaload          
	//   56  108:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   57  111:pop             
					stringbuilder1.append(s.substring(i, k));
	//   58  112:aload           7
	//   59  114:aload_0         
	//   60  115:iload           4
	//   61  117:iload           6
	//   62  119:invokevirtual   #92  <Method String String.substring(int, int)>
	//   63  122:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   64  125:pop             
					as[j] = stringbuilder1.toString();
	//   65  126:aload_1         
	//   66  127:iload           5
	//   67  129:aload           7
	//   68  131:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   69  134:aastore         
					i = k;
	//   70  135:iload           6
	//   71  137:istore          4
					continue;
	//   72  139:goto            12
				}
				if(s.startsWith("$$", i))
	//*  73  142:aload_0         
	//*  74  143:ldc1            #17  <String "$$">
	//*  75  145:iload           4
	//*  76  147:invokevirtual   #96  <Method boolean String.startsWith(String, int)>
	//*  77  150:ifeq            198
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//   78  153:new             #76  <Class StringBuilder>
	//   79  156:dup             
	//   80  157:invokespecial   #77  <Method void StringBuilder()>
	//   81  160:astore          7
					stringbuilder2.append(as[j]);
	//   82  162:aload           7
	//   83  164:aload_1         
	//   84  165:iload           5
	//   85  167:aaload          
	//   86  168:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   87  171:pop             
					stringbuilder2.append("$");
	//   88  172:aload           7
	//   89  174:ldc1            #70  <String "$">
	//   90  176:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   91  179:pop             
					as[j] = stringbuilder2.toString();
	//   92  180:aload_1         
	//   93  181:iload           5
	//   94  183:aload           7
	//   95  185:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   96  188:aastore         
					i += 2;
	//   97  189:iload           4
	//   98  191:iconst_2        
	//   99  192:iadd            
	//  100  193:istore          4
					continue;
	//  101  195:goto            12
				}
				k = i + 1;
	//  102  198:iload           4
	//  103  200:iconst_1        
	//  104  201:iadd            
	//  105  202:istore          6
				i = s.indexOf("$", k);
	//  106  204:aload_0         
	//  107  205:ldc1            #70  <String "$">
	//  108  207:iload           6
	//  109  209:invokevirtual   #74  <Method int String.indexOf(String, int)>
	//  110  212:istore          4
				String s2 = s.substring(k, i);
	//  111  214:aload_0         
	//  112  215:iload           6
	//  113  217:iload           4
	//  114  219:invokevirtual   #92  <Method String String.substring(int, int)>
	//  115  222:astore          9
				if(s2.equals("RepresentationID"))
	//* 116  224:aload           9
	//* 117  226:ldc1            #25  <String "RepresentationID">
	//* 118  228:invokevirtual   #100 <Method boolean String.equals(Object)>
	//* 119  231:ifeq            242
				{
					ai[j] = 1;
	//  120  234:aload_2         
	//  121  235:iload           5
	//  122  237:iconst_1        
	//  123  238:iastore         
				} else
	//* 124  239:goto            394
				{
					int l = s2.indexOf("%0");
	//  125  242:aload           9
	//  126  244:ldc1            #102 <String "%0">
	//  127  246:invokevirtual   #105 <Method int String.indexOf(String)>
	//  128  249:istore          6
					Object obj = "%01d";
	//  129  251:ldc1            #14  <String "%01d">
	//  130  253:astore          8
					String s1 = s2;
	//  131  255:aload           9
	//  132  257:astore          7
					if(l != -1)
	//* 133  259:iload           6
	//* 134  261:iconst_m1       
	//* 135  262:icmpeq          337
					{
						s1 = s2.substring(l);
	//  136  265:aload           9
	//  137  267:iload           6
	//  138  269:invokevirtual   #85  <Method String String.substring(int)>
	//  139  272:astore          7
						if(!s1.endsWith("d"))
	//* 140  274:aload           7
	//* 141  276:ldc1            #107 <String "d">
	//* 142  278:invokevirtual   #111 <Method boolean String.endsWith(String)>
	//* 143  281:ifne            319
						{
							obj = ((Object) (new StringBuilder()));
	//  144  284:new             #76  <Class StringBuilder>
	//  145  287:dup             
	//  146  288:invokespecial   #77  <Method void StringBuilder()>
	//  147  291:astore          8
							((StringBuilder) (obj)).append(s1);
	//  148  293:aload           8
	//  149  295:aload           7
	//  150  297:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  151  300:pop             
							((StringBuilder) (obj)).append("d");
	//  152  301:aload           8
	//  153  303:ldc1            #107 <String "d">
	//  154  305:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  155  308:pop             
							s1 = ((StringBuilder) (obj)).toString();
	//  156  309:aload           8
	//  157  311:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  158  314:astore          7
						}
	//* 159  316:goto            319
						s2 = s2.substring(0, l);
	//  160  319:aload           9
	//  161  321:iconst_0        
	//  162  322:iload           6
	//  163  324:invokevirtual   #92  <Method String String.substring(int, int)>
	//  164  327:astore          9
						obj = ((Object) (s1));
	//  165  329:aload           7
	//  166  331:astore          8
						s1 = s2;
	//  167  333:aload           9
	//  168  335:astore          7
					}
					if(s1.equals("Number"))
	//* 169  337:aload           7
	//* 170  339:ldc1            #20  <String "Number">
	//* 171  341:invokevirtual   #100 <Method boolean String.equals(Object)>
	//* 172  344:ifeq            355
						ai[j] = 2;
	//  173  347:aload_2         
	//  174  348:iload           5
	//  175  350:iconst_2        
	//  176  351:iastore         
					else
	//* 177  352:goto            388
					if(s1.equals("Bandwidth"))
	//* 178  355:aload           7
	//* 179  357:ldc1            #8   <String "Bandwidth">
	//* 180  359:invokevirtual   #100 <Method boolean String.equals(Object)>
	//* 181  362:ifeq            373
					{
						ai[j] = 3;
	//  182  365:aload_2         
	//  183  366:iload           5
	//  184  368:iconst_3        
	//  185  369:iastore         
					} else
	//* 186  370:goto            388
					{
						if(!s1.equals("Time"))
							break;
	//  187  373:aload           7
	//  188  375:ldc1            #30  <String "Time">
	//  189  377:invokevirtual   #100 <Method boolean String.equals(Object)>
	//  190  380:ifeq            415
						ai[j] = 4;
	//  191  383:aload_2         
	//  192  384:iload           5
	//  193  386:iconst_4        
	//  194  387:iastore         
					}
					as1[j] = ((String) (obj));
	//  195  388:aload_3         
	//  196  389:iload           5
	//  197  391:aload           8
	//  198  393:aastore         
				}
				j++;
	//  199  394:iload           5
	//  200  396:iconst_1        
	//  201  397:iadd            
	//  202  398:istore          5
				as[j] = "";
	//  203  400:aload_1         
	//  204  401:iload           5
	//  205  403:ldc1            #64  <String "">
	//  206  405:aastore         
				i++;
	//  207  406:iload           4
	//  208  408:iconst_1        
	//  209  409:iadd            
	//  210  410:istore          4
			} while(true);
	//  211  412:goto            12
			as = ((String []) (new StringBuilder()));
	//  212  415:new             #76  <Class StringBuilder>
	//  213  418:dup             
	//  214  419:invokespecial   #77  <Method void StringBuilder()>
	//  215  422:astore_1        
			((StringBuilder) (as)).append("Invalid template: ");
	//  216  423:aload_1         
	//  217  424:ldc1            #113 <String "Invalid template: ">
	//  218  426:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  219  429:pop             
			((StringBuilder) (as)).append(s);
	//  220  430:aload_1         
	//  221  431:aload_0         
	//  222  432:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  223  435:pop             
			throw new IllegalArgumentException(((StringBuilder) (as)).toString());
	//  224  436:new             #115 <Class IllegalArgumentException>
	//  225  439:dup             
	//  226  440:aload_1         
	//  227  441:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  228  444:invokespecial   #118 <Method void IllegalArgumentException(String)>
	//  229  447:athrow          
		}
		return j;
	//  230  448:iload           5
	//  231  450:ireturn         
	}

	public String buildUri(String s, int i, int j, long l)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #76  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:astore          8
		int k = 0;
	//    4    9:iconst_0        
	//    5   10:istore          6
		do
		{
			int i1 = identifierCount;
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field int identifierCount>
	//    8   16:istore          7
			if(k < i1)
	//*   9   18:iload           6
	//*  10   20:iload           7
	//*  11   22:icmpge          196
			{
				stringbuilder.append(urlPieces[k]);
	//   12   25:aload           8
	//   13   27:aload_0         
	//   14   28:getfield        #45  <Field String[] urlPieces>
	//   15   31:iload           6
	//   16   33:aaload          
	//   17   34:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
				int ai[] = identifiers;
	//   19   38:aload_0         
	//   20   39:getfield        #47  <Field int[] identifiers>
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
	//   29   56:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
				else
	//*  31   60:goto            187
				if(ai[k] == 2)
	//*  32   63:aload           9
	//*  33   65:iload           6
	//*  34   67:iaload          
	//*  35   68:iconst_2        
	//*  36   69:icmpne          105
					stringbuilder.append(String.format(Locale.US, identifierFormatTags[k], new Object[] {
						Integer.valueOf(i)
					}));
	//   37   72:aload           8
	//   38   74:getstatic       #126 <Field Locale Locale.US>
	//   39   77:aload_0         
	//   40   78:getfield        #49  <Field String[] identifierFormatTags>
	//   41   81:iload           6
	//   42   83:aaload          
	//   43   84:iconst_1        
	//   44   85:anewarray       Object[]
	//   45   88:dup             
	//   46   89:iconst_0        
	//   47   90:iload_2         
	//   48   91:invokestatic    #132 <Method Integer Integer.valueOf(int)>
	//   49   94:aastore         
	//   50   95:invokestatic    #136 <Method String String.format(Locale, String, Object[])>
	//   51   98:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   52  101:pop             
				else
	//*  53  102:goto            187
				if(ai[k] == 3)
	//*  54  105:aload           9
	//*  55  107:iload           6
	//*  56  109:iaload          
	//*  57  110:iconst_3        
	//*  58  111:icmpne          147
					stringbuilder.append(String.format(Locale.US, identifierFormatTags[k], new Object[] {
						Integer.valueOf(j)
					}));
	//   59  114:aload           8
	//   60  116:getstatic       #126 <Field Locale Locale.US>
	//   61  119:aload_0         
	//   62  120:getfield        #49  <Field String[] identifierFormatTags>
	//   63  123:iload           6
	//   64  125:aaload          
	//   65  126:iconst_1        
	//   66  127:anewarray       Object[]
	//   67  130:dup             
	//   68  131:iconst_0        
	//   69  132:iload_3         
	//   70  133:invokestatic    #132 <Method Integer Integer.valueOf(int)>
	//   71  136:aastore         
	//   72  137:invokestatic    #136 <Method String String.format(Locale, String, Object[])>
	//   73  140:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   74  143:pop             
				else
	//*  75  144:goto            187
				if(ai[k] == 4)
	//*  76  147:aload           9
	//*  77  149:iload           6
	//*  78  151:iaload          
	//*  79  152:iconst_4        
	//*  80  153:icmpne          187
					stringbuilder.append(String.format(Locale.US, identifierFormatTags[k], new Object[] {
						Long.valueOf(l)
					}));
	//   81  156:aload           8
	//   82  158:getstatic       #126 <Field Locale Locale.US>
	//   83  161:aload_0         
	//   84  162:getfield        #49  <Field String[] identifierFormatTags>
	//   85  165:iload           6
	//   86  167:aaload          
	//   87  168:iconst_1        
	//   88  169:anewarray       Object[]
	//   89  172:dup             
	//   90  173:iconst_0        
	//   91  174:lload           4
	//   92  176:invokestatic    #141 <Method Long Long.valueOf(long)>
	//   93  179:aastore         
	//   94  180:invokestatic    #136 <Method String String.format(Locale, String, Object[])>
	//   95  183:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   96  186:pop             
				k++;
	//   97  187:iload           6
	//   98  189:iconst_1        
	//   99  190:iadd            
	//  100  191:istore          6
			} else
	//* 101  193:goto            12
			{
				stringbuilder.append(urlPieces[i1]);
	//  102  196:aload           8
	//  103  198:aload_0         
	//  104  199:getfield        #45  <Field String[] urlPieces>
	//  105  202:iload           7
	//  106  204:aaload          
	//  107  205:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  108  208:pop             
				return stringbuilder.toString();
	//  109  209:aload           8
	//  110  211:invokevirtual   #89  <Method String StringBuilder.toString()>
	//  111  214:areturn         
			}
		} while(true);
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
