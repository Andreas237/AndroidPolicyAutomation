// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			ExtraEncoding, PdfEncodings, IntHashtable

private static class PdfEncodings$SymbolConversion
	implements ExtraEncoding
{

	public String byteToChar(byte abyte0[], String s)
	{
		int k = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          5
		s = ((String) (new char[k]));
	//    3    4:iload           5
	//    4    6:newarray        char[]
	//    5    8:astore_2        
		int j = 0;
	//    6    9:iconst_0        
	//    7   10:istore          4
		int i;
		for(i = 0; j < k; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_3        
	//*  10   14:iload           4
	//*  11   16:iload           5
	//*  12   18:icmpge          54
		{
			byte byte0 = abyte0[j];
	//   13   21:aload_1         
	//   14   22:iload           4
	//   15   24:baload          
	//   16   25:istore          6
			s[i] = byteToChar[byte0 & 0xff];
	//   17   27:aload_2         
	//   18   28:iload_3         
	//   19   29:aload_0         
	//   20   30:getfield        #411 <Field char[] byteToChar>
	//   21   33:iload           6
	//   22   35:sipush          255
	//   23   38:iand            
	//   24   39:caload          
	//   25   40:castore         
			j++;
	//   26   41:iload           4
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore          4
		}

	//   30   47:iload_3         
	//   31   48:iconst_1        
	//   32   49:iadd            
	//   33   50:istore_3        
	//*  34   51:goto            14
		return new String(((char []) (s)), 0, i);
	//   35   54:new             #414 <Class String>
	//   36   57:dup             
	//   37   58:aload_2         
	//   38   59:iconst_0        
	//   39   60:iload_3         
	//   40   61:invokespecial   #417 <Method void String(char[], int, int)>
	//   41   64:areturn         
	}

	public byte[] charToByte(char c, String s)
	{
		byte byte0 = (byte)translation.get(((int) (c)));
	//    0    0:aload_0         
	//    1    1:getfield        #409 <Field IntHashtable translation>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #423 <Method int IntHashtable.get(int)>
	//    4    8:int2byte        
	//    5    9:istore_3        
		if(byte0 != 0)
	//*   6   10:iload_3         
	//*   7   11:ifeq            22
			return (new byte[] {
				byte0
			});
	//    8   14:iconst_1        
	//    9   15:newarray        byte[]
	//   10   17:dup             
	//   11   18:iconst_0        
	//   12   19:iload_3         
	//   13   20:bastore         
	//   14   21:areturn         
		else
			return new byte[0];
	//   15   22:iconst_0        
	//   16   23:newarray        byte[]
	//   17   25:areturn         
	}

	public byte[] charToByte(String s, String s1)
	{
		s1 = ((String) (s.toCharArray()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #428 <Method char[] String.toCharArray()>
	//    2    4:astore_2        
		s = ((String) (new byte[s1.length]));
	//    3    5:aload_2         
	//    4    6:arraylength     
	//    5    7:newarray        byte[]
	//    6    9:astore_1        
		int l = s1.length;
	//    7   10:aload_2         
	//    8   11:arraylength     
	//    9   12:istore          7
		int j = 0;
	//   10   14:iconst_0        
	//   11   15:istore          5
		int i = 0;
	//   12   17:iconst_0        
	//   13   18:istore          4
		for(; j < l; j++)
	//*  14   20:iload           5
	//*  15   22:iload           7
	//*  16   24:icmpge          72
		{
			char c = s1[j];
	//   17   27:aload_2         
	//   18   28:iload           5
	//   19   30:caload          
	//   20   31:istore          6
			byte byte0 = (byte)translation.get(((int) (c)));
	//   21   33:aload_0         
	//   22   34:getfield        #409 <Field IntHashtable translation>
	//   23   37:iload           6
	//   24   39:invokevirtual   #423 <Method int IntHashtable.get(int)>
	//   25   42:int2byte        
	//   26   43:istore_3        
			if(byte0 != 0)
	//*  27   44:iload_3         
	//*  28   45:ifeq            97
			{
				int k = i + 1;
	//   29   48:iload           4
	//   30   50:iconst_1        
	//   31   51:iadd            
	//   32   52:istore          6
				s[i] = byte0;
	//   33   54:aload_1         
	//   34   55:iload           4
	//   35   57:iload_3         
	//   36   58:bastore         
				i = k;
	//   37   59:iload           6
	//   38   61:istore          4
			}
		}

	//   39   63:iload           5
	//   40   65:iconst_1        
	//   41   66:iadd            
	//   42   67:istore          5
	//*  43   69:goto            20
		if(i == l)
	//*  44   72:iload           4
	//*  45   74:iload           7
	//*  46   76:icmpne          81
		{
			return ((byte []) (s));
	//   47   79:aload_1         
	//   48   80:areturn         
		} else
		{
			s1 = ((String) (new byte[i]));
	//   49   81:iload           4
	//   50   83:newarray        byte[]
	//   51   85:astore_2        
			System.arraycopy(((Object) (s)), 0, ((Object) (s1)), 0, i);
	//   52   86:aload_1         
	//   53   87:iconst_0        
	//   54   88:aload_2         
	//   55   89:iconst_0        
	//   56   90:iload           4
	//   57   92:invokestatic    #434 <Method void System.arraycopy(Object, int, Object, int, int)>
			return ((byte []) (s1));
	//   58   95:aload_2         
	//   59   96:areturn         
		}
	//*  60   97:goto            63
	}

	private static final IntHashtable t1;
	private static final IntHashtable t2;
	private static final char table1[] = {
		'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
		'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
		'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
		'\0', '\0', ' ', '!', '\u2200', '#', '\u2203', '%', '&', '\u220B', 
		'(', ')', '*', '+', ',', '-', '.', '/', '0', '1', 
		'2', '3', '4', '5', '6', '7', '8', '9', ':', ';', 
		'<', '=', '>', '?', '\u2245', '\u0391', '\u0392', '\u03A7', '\u0394', '\u0395', 
		'\u03A6', '\u0393', '\u0397', '\u0399', '\u03D1', '\u039A', '\u039B', '\u039C', '\u039D', '\u039F', 
		'\u03A0', '\u0398', '\u03A1', '\u03A3', '\u03A4', '\u03A5', '\u03C2', '\u03A9', '\u039E', '\u03A8', 
		'\u0396', '[', '\u2234', ']', '\u22A5', '_', '\u0305', '\u03B1', '\u03B2', '\u03C7', 
		'\u03B4', '\u03B5', '\u03D5', '\u03B3', '\u03B7', '\u03B9', '\u03C6', '\u03BA', '\u03BB', '\u03BC', 
		'\u03BD', '\u03BF', '\u03C0', '\u03B8', '\u03C1', '\u03C3', '\u03C4', '\u03C5', '\u03D6', '\u03C9', 
		'\u03BE', '\u03C8', '\u03B6', '{', '|', '}', '~', '\0', '\0', '\0', 
		'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
		'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
		'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
		'\u20AC', '\u03D2', '\u2032', '\u2264', '\u2044', '\u221E', '\u0192', '\u2663', '\u2666', '\u2665', 
		'\u2660', '\u2194', '\u2190', '\u2191', '\u2192', '\u2193', '\260', '\261', '\u2033', '\u2265', 
		'\327', '\u221D', '\u2202', '\u2022', '\367', '\u2260', '\u2261', '\u2248', '\u2026', '\u2502', 
		'\u2500', '\u21B5', '\u2135', '\u2111', '\u211C', '\u2118', '\u2297', '\u2295', '\u2205', '\u2229', 
		'\u222A', '\u2283', '\u2287', '\u2284', '\u2282', '\u2286', '\u2208', '\u2209', '\u2220', '\u2207', 
		'\256', '\251', '\u2122', '\u220F', '\u221A', '\u22C5', '\254', '\u2227', '\u2228', '\u21D4', 
		'\u21D0', '\u21D1', '\u21D2', '\u21D3', '\u25CA', '\u2329', '\0', '\0', '\0', '\u2211', 
		'\u239B', '\u239C', '\u239D', '\u23A1', '\u23A2', '\u23A3', '\u23A7', '\u23A8', '\u23A9', '\u23AA', 
		'\0', '\u232A', '\u222B', '\u2320', '\u23AE', '\u2321', '\u239E', '\u239F', '\u23A0', '\u23A4', 
		'\u23A5', '\u23A6', '\u23AB', '\u23AC', '\u23AD', '\0'
	};
	private static final char table2[] = {
		'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
		'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
		'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
		'\0', '\0', ' ', '\u2701', '\u2702', '\u2703', '\u2704', '\u260E', '\u2706', '\u2707', 
		'\u2708', '\u2709', '\u261B', '\u261E', '\u270C', '\u270D', '\u270E', '\u270F', '\u2710', '\u2711', 
		'\u2712', '\u2713', '\u2714', '\u2715', '\u2716', '\u2717', '\u2718', '\u2719', '\u271A', '\u271B', 
		'\u271C', '\u271D', '\u271E', '\u271F', '\u2720', '\u2721', '\u2722', '\u2723', '\u2724', '\u2725', 
		'\u2726', '\u2727', '\u2605', '\u2729', '\u272A', '\u272B', '\u272C', '\u272D', '\u272E', '\u272F', 
		'\u2730', '\u2731', '\u2732', '\u2733', '\u2734', '\u2735', '\u2736', '\u2737', '\u2738', '\u2739', 
		'\u273A', '\u273B', '\u273C', '\u273D', '\u273E', '\u273F', '\u2740', '\u2741', '\u2742', '\u2743', 
		'\u2744', '\u2745', '\u2746', '\u2747', '\u2748', '\u2749', '\u274A', '\u274B', '\u25CF', '\u274D', 
		'\u25A0', '\u274F', '\u2750', '\u2751', '\u2752', '\u25B2', '\u25BC', '\u25C6', '\u2756', '\u25D7', 
		'\u2758', '\u2759', '\u275A', '\u275B', '\u275C', '\u275D', '\u275E', '\0', '\0', '\0', 
		'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
		'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
		'\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', 
		'\0', '\u2761', '\u2762', '\u2763', '\u2764', '\u2765', '\u2766', '\u2767', '\u2663', '\u2666', 
		'\u2665', '\u2660', '\u2460', '\u2461', '\u2462', '\u2463', '\u2464', '\u2465', '\u2466', '\u2467', 
		'\u2468', '\u2469', '\u2776', '\u2777', '\u2778', '\u2779', '\u277A', '\u277B', '\u277C', '\u277D', 
		'\u277E', '\u277F', '\u2780', '\u2781', '\u2782', '\u2783', '\u2784', '\u2785', '\u2786', '\u2787', 
		'\u2788', '\u2789', '\u278A', '\u278B', '\u278C', '\u278D', '\u278E', '\u278F', '\u2790', '\u2791', 
		'\u2792', '\u2793', '\u2794', '\u2192', '\u2194', '\u2195', '\u2798', '\u2799', '\u279A', '\u279B', 
		'\u279C', '\u279D', '\u279E', '\u279F', '\u27A0', '\u27A1', '\u27A2', '\u27A3', '\u27A4', '\u27A5', 
		'\u27A6', '\u27A7', '\u27A8', '\u27A9', '\u27AA', '\u27AB', '\u27AC', '\u27AD', '\u27AE', '\u27AF', 
		'\0', '\u27B1', '\u27B2', '\u27B3', '\u27B4', '\u27B5', '\u27B6', '\u27B7', '\u27B8', '\u27B9', 
		'\u27BA', '\u27BB', '\u27BC', '\u27BD', '\u27BE', '\0'
	};
	private final char byteToChar[];
	private IntHashtable translation;

	static 
	{
		t1 = new IntHashtable();
	//    0    0:new             #21  <Class IntHashtable>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void IntHashtable()>
	//    3    7:putstatic       #26  <Field IntHashtable t1>
		t2 = new IntHashtable();
	//    4   10:new             #21  <Class IntHashtable>
	//    5   13:dup             
	//    6   14:invokespecial   #24  <Method void IntHashtable()>
	//    7   17:putstatic       #28  <Field IntHashtable t2>
	//    8   20:sipush          256
	//    9   23:newarray        char[]
	//   10   25:dup             
	//   11   26:iconst_0        
	//   12   27:ldc1            #29  <Int 0>
	//   13   29:castore         
	//   14   30:dup             
	//   15   31:iconst_1        
	//   16   32:ldc1            #29  <Int 0>
	//   17   34:castore         
	//   18   35:dup             
	//   19   36:iconst_2        
	//   20   37:ldc1            #29  <Int 0>
	//   21   39:castore         
	//   22   40:dup             
	//   23   41:iconst_3        
	//   24   42:ldc1            #29  <Int 0>
	//   25   44:castore         
	//   26   45:dup             
	//   27   46:iconst_4        
	//   28   47:ldc1            #29  <Int 0>
	//   29   49:castore         
	//   30   50:dup             
	//   31   51:iconst_5        
	//   32   52:ldc1            #29  <Int 0>
	//   33   54:castore         
	//   34   55:dup             
	//   35   56:bipush          6
	//   36   58:ldc1            #29  <Int 0>
	//   37   60:castore         
	//   38   61:dup             
	//   39   62:bipush          7
	//   40   64:ldc1            #29  <Int 0>
	//   41   66:castore         
	//   42   67:dup             
	//   43   68:bipush          8
	//   44   70:ldc1            #29  <Int 0>
	//   45   72:castore         
	//   46   73:dup             
	//   47   74:bipush          9
	//   48   76:ldc1            #29  <Int 0>
	//   49   78:castore         
	//   50   79:dup             
	//   51   80:bipush          10
	//   52   82:ldc1            #29  <Int 0>
	//   53   84:castore         
	//   54   85:dup             
	//   55   86:bipush          11
	//   56   88:ldc1            #29  <Int 0>
	//   57   90:castore         
	//   58   91:dup             
	//   59   92:bipush          12
	//   60   94:ldc1            #29  <Int 0>
	//   61   96:castore         
	//   62   97:dup             
	//   63   98:bipush          13
	//   64  100:ldc1            #29  <Int 0>
	//   65  102:castore         
	//   66  103:dup             
	//   67  104:bipush          14
	//   68  106:ldc1            #29  <Int 0>
	//   69  108:castore         
	//   70  109:dup             
	//   71  110:bipush          15
	//   72  112:ldc1            #29  <Int 0>
	//   73  114:castore         
	//   74  115:dup             
	//   75  116:bipush          16
	//   76  118:ldc1            #29  <Int 0>
	//   77  120:castore         
	//   78  121:dup             
	//   79  122:bipush          17
	//   80  124:ldc1            #29  <Int 0>
	//   81  126:castore         
	//   82  127:dup             
	//   83  128:bipush          18
	//   84  130:ldc1            #29  <Int 0>
	//   85  132:castore         
	//   86  133:dup             
	//   87  134:bipush          19
	//   88  136:ldc1            #29  <Int 0>
	//   89  138:castore         
	//   90  139:dup             
	//   91  140:bipush          20
	//   92  142:ldc1            #29  <Int 0>
	//   93  144:castore         
	//   94  145:dup             
	//   95  146:bipush          21
	//   96  148:ldc1            #29  <Int 0>
	//   97  150:castore         
	//   98  151:dup             
	//   99  152:bipush          22
	//  100  154:ldc1            #29  <Int 0>
	//  101  156:castore         
	//  102  157:dup             
	//  103  158:bipush          23
	//  104  160:ldc1            #29  <Int 0>
	//  105  162:castore         
	//  106  163:dup             
	//  107  164:bipush          24
	//  108  166:ldc1            #29  <Int 0>
	//  109  168:castore         
	//  110  169:dup             
	//  111  170:bipush          25
	//  112  172:ldc1            #29  <Int 0>
	//  113  174:castore         
	//  114  175:dup             
	//  115  176:bipush          26
	//  116  178:ldc1            #29  <Int 0>
	//  117  180:castore         
	//  118  181:dup             
	//  119  182:bipush          27
	//  120  184:ldc1            #29  <Int 0>
	//  121  186:castore         
	//  122  187:dup             
	//  123  188:bipush          28
	//  124  190:ldc1            #29  <Int 0>
	//  125  192:castore         
	//  126  193:dup             
	//  127  194:bipush          29
	//  128  196:ldc1            #29  <Int 0>
	//  129  198:castore         
	//  130  199:dup             
	//  131  200:bipush          30
	//  132  202:ldc1            #29  <Int 0>
	//  133  204:castore         
	//  134  205:dup             
	//  135  206:bipush          31
	//  136  208:ldc1            #29  <Int 0>
	//  137  210:castore         
	//  138  211:dup             
	//  139  212:bipush          32
	//  140  214:ldc1            #30  <Int 32>
	//  141  216:castore         
	//  142  217:dup             
	//  143  218:bipush          33
	//  144  220:ldc1            #31  <Int 33>
	//  145  222:castore         
	//  146  223:dup             
	//  147  224:bipush          34
	//  148  226:ldc1            #32  <Int 8704>
	//  149  228:castore         
	//  150  229:dup             
	//  151  230:bipush          35
	//  152  232:ldc1            #33  <Int 35>
	//  153  234:castore         
	//  154  235:dup             
	//  155  236:bipush          36
	//  156  238:ldc1            #34  <Int 8707>
	//  157  240:castore         
	//  158  241:dup             
	//  159  242:bipush          37
	//  160  244:ldc1            #35  <Int 37>
	//  161  246:castore         
	//  162  247:dup             
	//  163  248:bipush          38
	//  164  250:ldc1            #36  <Int 38>
	//  165  252:castore         
	//  166  253:dup             
	//  167  254:bipush          39
	//  168  256:ldc1            #37  <Int 8715>
	//  169  258:castore         
	//  170  259:dup             
	//  171  260:bipush          40
	//  172  262:ldc1            #38  <Int 40>
	//  173  264:castore         
	//  174  265:dup             
	//  175  266:bipush          41
	//  176  268:ldc1            #39  <Int 41>
	//  177  270:castore         
	//  178  271:dup             
	//  179  272:bipush          42
	//  180  274:ldc1            #40  <Int 42>
	//  181  276:castore         
	//  182  277:dup             
	//  183  278:bipush          43
	//  184  280:ldc1            #41  <Int 43>
	//  185  282:castore         
	//  186  283:dup             
	//  187  284:bipush          44
	//  188  286:ldc1            #42  <Int 44>
	//  189  288:castore         
	//  190  289:dup             
	//  191  290:bipush          45
	//  192  292:ldc1            #43  <Int 45>
	//  193  294:castore         
	//  194  295:dup             
	//  195  296:bipush          46
	//  196  298:ldc1            #44  <Int 46>
	//  197  300:castore         
	//  198  301:dup             
	//  199  302:bipush          47
	//  200  304:ldc1            #45  <Int 47>
	//  201  306:castore         
	//  202  307:dup             
	//  203  308:bipush          48
	//  204  310:ldc1            #46  <Int 48>
	//  205  312:castore         
	//  206  313:dup             
	//  207  314:bipush          49
	//  208  316:ldc1            #47  <Int 49>
	//  209  318:castore         
	//  210  319:dup             
	//  211  320:bipush          50
	//  212  322:ldc1            #48  <Int 50>
	//  213  324:castore         
	//  214  325:dup             
	//  215  326:bipush          51
	//  216  328:ldc1            #49  <Int 51>
	//  217  330:castore         
	//  218  331:dup             
	//  219  332:bipush          52
	//  220  334:ldc1            #50  <Int 52>
	//  221  336:castore         
	//  222  337:dup             
	//  223  338:bipush          53
	//  224  340:ldc1            #51  <Int 53>
	//  225  342:castore         
	//  226  343:dup             
	//  227  344:bipush          54
	//  228  346:ldc1            #52  <Int 54>
	//  229  348:castore         
	//  230  349:dup             
	//  231  350:bipush          55
	//  232  352:ldc1            #53  <Int 55>
	//  233  354:castore         
	//  234  355:dup             
	//  235  356:bipush          56
	//  236  358:ldc1            #54  <Int 56>
	//  237  360:castore         
	//  238  361:dup             
	//  239  362:bipush          57
	//  240  364:ldc1            #55  <Int 57>
	//  241  366:castore         
	//  242  367:dup             
	//  243  368:bipush          58
	//  244  370:ldc1            #56  <Int 58>
	//  245  372:castore         
	//  246  373:dup             
	//  247  374:bipush          59
	//  248  376:ldc1            #57  <Int 59>
	//  249  378:castore         
	//  250  379:dup             
	//  251  380:bipush          60
	//  252  382:ldc1            #58  <Int 60>
	//  253  384:castore         
	//  254  385:dup             
	//  255  386:bipush          61
	//  256  388:ldc1            #59  <Int 61>
	//  257  390:castore         
	//  258  391:dup             
	//  259  392:bipush          62
	//  260  394:ldc1            #60  <Int 62>
	//  261  396:castore         
	//  262  397:dup             
	//  263  398:bipush          63
	//  264  400:ldc1            #61  <Int 63>
	//  265  402:castore         
	//  266  403:dup             
	//  267  404:bipush          64
	//  268  406:ldc1            #62  <Int 8773>
	//  269  408:castore         
	//  270  409:dup             
	//  271  410:bipush          65
	//  272  412:ldc1            #63  <Int 913>
	//  273  414:castore         
	//  274  415:dup             
	//  275  416:bipush          66
	//  276  418:ldc1            #64  <Int 914>
	//  277  420:castore         
	//  278  421:dup             
	//  279  422:bipush          67
	//  280  424:ldc1            #65  <Int 935>
	//  281  426:castore         
	//  282  427:dup             
	//  283  428:bipush          68
	//  284  430:ldc1            #66  <Int 916>
	//  285  432:castore         
	//  286  433:dup             
	//  287  434:bipush          69
	//  288  436:ldc1            #67  <Int 917>
	//  289  438:castore         
	//  290  439:dup             
	//  291  440:bipush          70
	//  292  442:ldc1            #68  <Int 934>
	//  293  444:castore         
	//  294  445:dup             
	//  295  446:bipush          71
	//  296  448:ldc1            #69  <Int 915>
	//  297  450:castore         
	//  298  451:dup             
	//  299  452:bipush          72
	//  300  454:ldc1            #70  <Int 919>
	//  301  456:castore         
	//  302  457:dup             
	//  303  458:bipush          73
	//  304  460:ldc1            #71  <Int 921>
	//  305  462:castore         
	//  306  463:dup             
	//  307  464:bipush          74
	//  308  466:ldc1            #72  <Int 977>
	//  309  468:castore         
	//  310  469:dup             
	//  311  470:bipush          75
	//  312  472:ldc1            #73  <Int 922>
	//  313  474:castore         
	//  314  475:dup             
	//  315  476:bipush          76
	//  316  478:ldc1            #74  <Int 923>
	//  317  480:castore         
	//  318  481:dup             
	//  319  482:bipush          77
	//  320  484:ldc1            #75  <Int 924>
	//  321  486:castore         
	//  322  487:dup             
	//  323  488:bipush          78
	//  324  490:ldc1            #76  <Int 925>
	//  325  492:castore         
	//  326  493:dup             
	//  327  494:bipush          79
	//  328  496:ldc1            #77  <Int 927>
	//  329  498:castore         
	//  330  499:dup             
	//  331  500:bipush          80
	//  332  502:ldc1            #78  <Int 928>
	//  333  504:castore         
	//  334  505:dup             
	//  335  506:bipush          81
	//  336  508:ldc1            #79  <Int 920>
	//  337  510:castore         
	//  338  511:dup             
	//  339  512:bipush          82
	//  340  514:ldc1            #80  <Int 929>
	//  341  516:castore         
	//  342  517:dup             
	//  343  518:bipush          83
	//  344  520:ldc1            #81  <Int 931>
	//  345  522:castore         
	//  346  523:dup             
	//  347  524:bipush          84
	//  348  526:ldc1            #82  <Int 932>
	//  349  528:castore         
	//  350  529:dup             
	//  351  530:bipush          85
	//  352  532:ldc1            #83  <Int 933>
	//  353  534:castore         
	//  354  535:dup             
	//  355  536:bipush          86
	//  356  538:ldc1            #84  <Int 962>
	//  357  540:castore         
	//  358  541:dup             
	//  359  542:bipush          87
	//  360  544:ldc1            #85  <Int 937>
	//  361  546:castore         
	//  362  547:dup             
	//  363  548:bipush          88
	//  364  550:ldc1            #86  <Int 926>
	//  365  552:castore         
	//  366  553:dup             
	//  367  554:bipush          89
	//  368  556:ldc1            #87  <Int 936>
	//  369  558:castore         
	//  370  559:dup             
	//  371  560:bipush          90
	//  372  562:ldc1            #88  <Int 918>
	//  373  564:castore         
	//  374  565:dup             
	//  375  566:bipush          91
	//  376  568:ldc1            #89  <Int 91>
	//  377  570:castore         
	//  378  571:dup             
	//  379  572:bipush          92
	//  380  574:ldc1            #90  <Int 8756>
	//  381  576:castore         
	//  382  577:dup             
	//  383  578:bipush          93
	//  384  580:ldc1            #91  <Int 93>
	//  385  582:castore         
	//  386  583:dup             
	//  387  584:bipush          94
	//  388  586:ldc1            #92  <Int 8869>
	//  389  588:castore         
	//  390  589:dup             
	//  391  590:bipush          95
	//  392  592:ldc1            #93  <Int 95>
	//  393  594:castore         
	//  394  595:dup             
	//  395  596:bipush          96
	//  396  598:ldc1            #94  <Int 773>
	//  397  600:castore         
	//  398  601:dup             
	//  399  602:bipush          97
	//  400  604:ldc1            #95  <Int 945>
	//  401  606:castore         
	//  402  607:dup             
	//  403  608:bipush          98
	//  404  610:ldc1            #96  <Int 946>
	//  405  612:castore         
	//  406  613:dup             
	//  407  614:bipush          99
	//  408  616:ldc1            #97  <Int 967>
	//  409  618:castore         
	//  410  619:dup             
	//  411  620:bipush          100
	//  412  622:ldc1            #98  <Int 948>
	//  413  624:castore         
	//  414  625:dup             
	//  415  626:bipush          101
	//  416  628:ldc1            #99  <Int 949>
	//  417  630:castore         
	//  418  631:dup             
	//  419  632:bipush          102
	//  420  634:ldc1            #100 <Int 981>
	//  421  636:castore         
	//  422  637:dup             
	//  423  638:bipush          103
	//  424  640:ldc1            #101 <Int 947>
	//  425  642:castore         
	//  426  643:dup             
	//  427  644:bipush          104
	//  428  646:ldc1            #102 <Int 951>
	//  429  648:castore         
	//  430  649:dup             
	//  431  650:bipush          105
	//  432  652:ldc1            #103 <Int 953>
	//  433  654:castore         
	//  434  655:dup             
	//  435  656:bipush          106
	//  436  658:ldc1            #104 <Int 966>
	//  437  660:castore         
	//  438  661:dup             
	//  439  662:bipush          107
	//  440  664:ldc1            #105 <Int 954>
	//  441  666:castore         
	//  442  667:dup             
	//  443  668:bipush          108
	//  444  670:ldc1            #106 <Int 955>
	//  445  672:castore         
	//  446  673:dup             
	//  447  674:bipush          109
	//  448  676:ldc1            #107 <Int 956>
	//  449  678:castore         
	//  450  679:dup             
	//  451  680:bipush          110
	//  452  682:ldc1            #108 <Int 957>
	//  453  684:castore         
	//  454  685:dup             
	//  455  686:bipush          111
	//  456  688:ldc1            #109 <Int 959>
	//  457  690:castore         
	//  458  691:dup             
	//  459  692:bipush          112
	//  460  694:ldc1            #110 <Int 960>
	//  461  696:castore         
	//  462  697:dup             
	//  463  698:bipush          113
	//  464  700:ldc1            #111 <Int 952>
	//  465  702:castore         
	//  466  703:dup             
	//  467  704:bipush          114
	//  468  706:ldc1            #112 <Int 961>
	//  469  708:castore         
	//  470  709:dup             
	//  471  710:bipush          115
	//  472  712:ldc1            #113 <Int 963>
	//  473  714:castore         
	//  474  715:dup             
	//  475  716:bipush          116
	//  476  718:ldc1            #114 <Int 964>
	//  477  720:castore         
	//  478  721:dup             
	//  479  722:bipush          117
	//  480  724:ldc1            #115 <Int 965>
	//  481  726:castore         
	//  482  727:dup             
	//  483  728:bipush          118
	//  484  730:ldc1            #116 <Int 982>
	//  485  732:castore         
	//  486  733:dup             
	//  487  734:bipush          119
	//  488  736:ldc1            #117 <Int 969>
	//  489  738:castore         
	//  490  739:dup             
	//  491  740:bipush          120
	//  492  742:ldc1            #118 <Int 958>
	//  493  744:castore         
	//  494  745:dup             
	//  495  746:bipush          121
	//  496  748:ldc1            #119 <Int 968>
	//  497  750:castore         
	//  498  751:dup             
	//  499  752:bipush          122
	//  500  754:ldc1            #120 <Int 950>
	//  501  756:castore         
	//  502  757:dup             
	//  503  758:bipush          123
	//  504  760:ldc1            #121 <Int 123>
	//  505  762:castore         
	//  506  763:dup             
	//  507  764:bipush          124
	//  508  766:ldc1            #122 <Int 124>
	//  509  768:castore         
	//  510  769:dup             
	//  511  770:bipush          125
	//  512  772:ldc1            #123 <Int 125>
	//  513  774:castore         
	//  514  775:dup             
	//  515  776:bipush          126
	//  516  778:ldc1            #124 <Int 126>
	//  517  780:castore         
	//  518  781:dup             
	//  519  782:bipush          127
	//  520  784:ldc1            #29  <Int 0>
	//  521  786:castore         
	//  522  787:dup             
	//  523  788:sipush          128
	//  524  791:ldc1            #29  <Int 0>
	//  525  793:castore         
	//  526  794:dup             
	//  527  795:sipush          129
	//  528  798:ldc1            #29  <Int 0>
	//  529  800:castore         
	//  530  801:dup             
	//  531  802:sipush          130
	//  532  805:ldc1            #29  <Int 0>
	//  533  807:castore         
	//  534  808:dup             
	//  535  809:sipush          131
	//  536  812:ldc1            #29  <Int 0>
	//  537  814:castore         
	//  538  815:dup             
	//  539  816:sipush          132
	//  540  819:ldc1            #29  <Int 0>
	//  541  821:castore         
	//  542  822:dup             
	//  543  823:sipush          133
	//  544  826:ldc1            #29  <Int 0>
	//  545  828:castore         
	//  546  829:dup             
	//  547  830:sipush          134
	//  548  833:ldc1            #29  <Int 0>
	//  549  835:castore         
	//  550  836:dup             
	//  551  837:sipush          135
	//  552  840:ldc1            #29  <Int 0>
	//  553  842:castore         
	//  554  843:dup             
	//  555  844:sipush          136
	//  556  847:ldc1            #29  <Int 0>
	//  557  849:castore         
	//  558  850:dup             
	//  559  851:sipush          137
	//  560  854:ldc1            #29  <Int 0>
	//  561  856:castore         
	//  562  857:dup             
	//  563  858:sipush          138
	//  564  861:ldc1            #29  <Int 0>
	//  565  863:castore         
	//  566  864:dup             
	//  567  865:sipush          139
	//  568  868:ldc1            #29  <Int 0>
	//  569  870:castore         
	//  570  871:dup             
	//  571  872:sipush          140
	//  572  875:ldc1            #29  <Int 0>
	//  573  877:castore         
	//  574  878:dup             
	//  575  879:sipush          141
	//  576  882:ldc1            #29  <Int 0>
	//  577  884:castore         
	//  578  885:dup             
	//  579  886:sipush          142
	//  580  889:ldc1            #29  <Int 0>
	//  581  891:castore         
	//  582  892:dup             
	//  583  893:sipush          143
	//  584  896:ldc1            #29  <Int 0>
	//  585  898:castore         
	//  586  899:dup             
	//  587  900:sipush          144
	//  588  903:ldc1            #29  <Int 0>
	//  589  905:castore         
	//  590  906:dup             
	//  591  907:sipush          145
	//  592  910:ldc1            #29  <Int 0>
	//  593  912:castore         
	//  594  913:dup             
	//  595  914:sipush          146
	//  596  917:ldc1            #29  <Int 0>
	//  597  919:castore         
	//  598  920:dup             
	//  599  921:sipush          147
	//  600  924:ldc1            #29  <Int 0>
	//  601  926:castore         
	//  602  927:dup             
	//  603  928:sipush          148
	//  604  931:ldc1            #29  <Int 0>
	//  605  933:castore         
	//  606  934:dup             
	//  607  935:sipush          149
	//  608  938:ldc1            #29  <Int 0>
	//  609  940:castore         
	//  610  941:dup             
	//  611  942:sipush          150
	//  612  945:ldc1            #29  <Int 0>
	//  613  947:castore         
	//  614  948:dup             
	//  615  949:sipush          151
	//  616  952:ldc1            #29  <Int 0>
	//  617  954:castore         
	//  618  955:dup             
	//  619  956:sipush          152
	//  620  959:ldc1            #29  <Int 0>
	//  621  961:castore         
	//  622  962:dup             
	//  623  963:sipush          153
	//  624  966:ldc1            #29  <Int 0>
	//  625  968:castore         
	//  626  969:dup             
	//  627  970:sipush          154
	//  628  973:ldc1            #29  <Int 0>
	//  629  975:castore         
	//  630  976:dup             
	//  631  977:sipush          155
	//  632  980:ldc1            #29  <Int 0>
	//  633  982:castore         
	//  634  983:dup             
	//  635  984:sipush          156
	//  636  987:ldc1            #29  <Int 0>
	//  637  989:castore         
	//  638  990:dup             
	//  639  991:sipush          157
	//  640  994:ldc1            #29  <Int 0>
	//  641  996:castore         
	//  642  997:dup             
	//  643  998:sipush          158
	//  644 1001:ldc1            #29  <Int 0>
	//  645 1003:castore         
	//  646 1004:dup             
	//  647 1005:sipush          159
	//  648 1008:ldc1            #29  <Int 0>
	//  649 1010:castore         
	//  650 1011:dup             
	//  651 1012:sipush          160
	//  652 1015:ldc1            #125 <Int 8364>
	//  653 1017:castore         
	//  654 1018:dup             
	//  655 1019:sipush          161
	//  656 1022:ldc1            #126 <Int 978>
	//  657 1024:castore         
	//  658 1025:dup             
	//  659 1026:sipush          162
	//  660 1029:ldc1            #127 <Int 8242>
	//  661 1031:castore         
	//  662 1032:dup             
	//  663 1033:sipush          163
	//  664 1036:ldc1            #128 <Int 8804>
	//  665 1038:castore         
	//  666 1039:dup             
	//  667 1040:sipush          164
	//  668 1043:ldc1            #129 <Int 8260>
	//  669 1045:castore         
	//  670 1046:dup             
	//  671 1047:sipush          165
	//  672 1050:ldc1            #130 <Int 8734>
	//  673 1052:castore         
	//  674 1053:dup             
	//  675 1054:sipush          166
	//  676 1057:ldc1            #131 <Int 402>
	//  677 1059:castore         
	//  678 1060:dup             
	//  679 1061:sipush          167
	//  680 1064:ldc1            #132 <Int 9827>
	//  681 1066:castore         
	//  682 1067:dup             
	//  683 1068:sipush          168
	//  684 1071:ldc1            #133 <Int 9830>
	//  685 1073:castore         
	//  686 1074:dup             
	//  687 1075:sipush          169
	//  688 1078:ldc1            #134 <Int 9829>
	//  689 1080:castore         
	//  690 1081:dup             
	//  691 1082:sipush          170
	//  692 1085:ldc1            #135 <Int 9824>
	//  693 1087:castore         
	//  694 1088:dup             
	//  695 1089:sipush          171
	//  696 1092:ldc1            #136 <Int 8596>
	//  697 1094:castore         
	//  698 1095:dup             
	//  699 1096:sipush          172
	//  700 1099:ldc1            #137 <Int 8592>
	//  701 1101:castore         
	//  702 1102:dup             
	//  703 1103:sipush          173
	//  704 1106:ldc1            #138 <Int 8593>
	//  705 1108:castore         
	//  706 1109:dup             
	//  707 1110:sipush          174
	//  708 1113:ldc1            #139 <Int 8594>
	//  709 1115:castore         
	//  710 1116:dup             
	//  711 1117:sipush          175
	//  712 1120:ldc1            #140 <Int 8595>
	//  713 1122:castore         
	//  714 1123:dup             
	//  715 1124:sipush          176
	//  716 1127:ldc1            #141 <Int 176>
	//  717 1129:castore         
	//  718 1130:dup             
	//  719 1131:sipush          177
	//  720 1134:ldc1            #142 <Int 177>
	//  721 1136:castore         
	//  722 1137:dup             
	//  723 1138:sipush          178
	//  724 1141:ldc1            #143 <Int 8243>
	//  725 1143:castore         
	//  726 1144:dup             
	//  727 1145:sipush          179
	//  728 1148:ldc1            #144 <Int 8805>
	//  729 1150:castore         
	//  730 1151:dup             
	//  731 1152:sipush          180
	//  732 1155:ldc1            #145 <Int 215>
	//  733 1157:castore         
	//  734 1158:dup             
	//  735 1159:sipush          181
	//  736 1162:ldc1            #146 <Int 8733>
	//  737 1164:castore         
	//  738 1165:dup             
	//  739 1166:sipush          182
	//  740 1169:ldc1            #147 <Int 8706>
	//  741 1171:castore         
	//  742 1172:dup             
	//  743 1173:sipush          183
	//  744 1176:ldc1            #148 <Int 8226>
	//  745 1178:castore         
	//  746 1179:dup             
	//  747 1180:sipush          184
	//  748 1183:ldc1            #149 <Int 247>
	//  749 1185:castore         
	//  750 1186:dup             
	//  751 1187:sipush          185
	//  752 1190:ldc1            #150 <Int 8800>
	//  753 1192:castore         
	//  754 1193:dup             
	//  755 1194:sipush          186
	//  756 1197:ldc1            #151 <Int 8801>
	//  757 1199:castore         
	//  758 1200:dup             
	//  759 1201:sipush          187
	//  760 1204:ldc1            #152 <Int 8776>
	//  761 1206:castore         
	//  762 1207:dup             
	//  763 1208:sipush          188
	//  764 1211:ldc1            #153 <Int 8230>
	//  765 1213:castore         
	//  766 1214:dup             
	//  767 1215:sipush          189
	//  768 1218:ldc1            #154 <Int 9474>
	//  769 1220:castore         
	//  770 1221:dup             
	//  771 1222:sipush          190
	//  772 1225:ldc1            #155 <Int 9472>
	//  773 1227:castore         
	//  774 1228:dup             
	//  775 1229:sipush          191
	//  776 1232:ldc1            #156 <Int 8629>
	//  777 1234:castore         
	//  778 1235:dup             
	//  779 1236:sipush          192
	//  780 1239:ldc1            #157 <Int 8501>
	//  781 1241:castore         
	//  782 1242:dup             
	//  783 1243:sipush          193
	//  784 1246:ldc1            #158 <Int 8465>
	//  785 1248:castore         
	//  786 1249:dup             
	//  787 1250:sipush          194
	//  788 1253:ldc1            #159 <Int 8476>
	//  789 1255:castore         
	//  790 1256:dup             
	//  791 1257:sipush          195
	//  792 1260:ldc1            #160 <Int 8472>
	//  793 1262:castore         
	//  794 1263:dup             
	//  795 1264:sipush          196
	//  796 1267:ldc1            #161 <Int 8855>
	//  797 1269:castore         
	//  798 1270:dup             
	//  799 1271:sipush          197
	//  800 1274:ldc1            #162 <Int 8853>
	//  801 1276:castore         
	//  802 1277:dup             
	//  803 1278:sipush          198
	//  804 1281:ldc1            #163 <Int 8709>
	//  805 1283:castore         
	//  806 1284:dup             
	//  807 1285:sipush          199
	//  808 1288:ldc1            #164 <Int 8745>
	//  809 1290:castore         
	//  810 1291:dup             
	//  811 1292:sipush          200
	//  812 1295:ldc1            #165 <Int 8746>
	//  813 1297:castore         
	//  814 1298:dup             
	//  815 1299:sipush          201
	//  816 1302:ldc1            #166 <Int 8835>
	//  817 1304:castore         
	//  818 1305:dup             
	//  819 1306:sipush          202
	//  820 1309:ldc1            #167 <Int 8839>
	//  821 1311:castore         
	//  822 1312:dup             
	//  823 1313:sipush          203
	//  824 1316:ldc1            #168 <Int 8836>
	//  825 1318:castore         
	//  826 1319:dup             
	//  827 1320:sipush          204
	//  828 1323:ldc1            #169 <Int 8834>
	//  829 1325:castore         
	//  830 1326:dup             
	//  831 1327:sipush          205
	//  832 1330:ldc1            #170 <Int 8838>
	//  833 1332:castore         
	//  834 1333:dup             
	//  835 1334:sipush          206
	//  836 1337:ldc1            #171 <Int 8712>
	//  837 1339:castore         
	//  838 1340:dup             
	//  839 1341:sipush          207
	//  840 1344:ldc1            #172 <Int 8713>
	//  841 1346:castore         
	//  842 1347:dup             
	//  843 1348:sipush          208
	//  844 1351:ldc1            #173 <Int 8736>
	//  845 1353:castore         
	//  846 1354:dup             
	//  847 1355:sipush          209
	//  848 1358:ldc1            #174 <Int 8711>
	//  849 1360:castore         
	//  850 1361:dup             
	//  851 1362:sipush          210
	//  852 1365:ldc1            #175 <Int 174>
	//  853 1367:castore         
	//  854 1368:dup             
	//  855 1369:sipush          211
	//  856 1372:ldc1            #176 <Int 169>
	//  857 1374:castore         
	//  858 1375:dup             
	//  859 1376:sipush          212
	//  860 1379:ldc1            #177 <Int 8482>
	//  861 1381:castore         
	//  862 1382:dup             
	//  863 1383:sipush          213
	//  864 1386:ldc1            #178 <Int 8719>
	//  865 1388:castore         
	//  866 1389:dup             
	//  867 1390:sipush          214
	//  868 1393:ldc1            #179 <Int 8730>
	//  869 1395:castore         
	//  870 1396:dup             
	//  871 1397:sipush          215
	//  872 1400:ldc1            #180 <Int 8901>
	//  873 1402:castore         
	//  874 1403:dup             
	//  875 1404:sipush          216
	//  876 1407:ldc1            #181 <Int 172>
	//  877 1409:castore         
	//  878 1410:dup             
	//  879 1411:sipush          217
	//  880 1414:ldc1            #182 <Int 8743>
	//  881 1416:castore         
	//  882 1417:dup             
	//  883 1418:sipush          218
	//  884 1421:ldc1            #183 <Int 8744>
	//  885 1423:castore         
	//  886 1424:dup             
	//  887 1425:sipush          219
	//  888 1428:ldc1            #184 <Int 8660>
	//  889 1430:castore         
	//  890 1431:dup             
	//  891 1432:sipush          220
	//  892 1435:ldc1            #185 <Int 8656>
	//  893 1437:castore         
	//  894 1438:dup             
	//  895 1439:sipush          221
	//  896 1442:ldc1            #186 <Int 8657>
	//  897 1444:castore         
	//  898 1445:dup             
	//  899 1446:sipush          222
	//  900 1449:ldc1            #187 <Int 8658>
	//  901 1451:castore         
	//  902 1452:dup             
	//  903 1453:sipush          223
	//  904 1456:ldc1            #188 <Int 8659>
	//  905 1458:castore         
	//  906 1459:dup             
	//  907 1460:sipush          224
	//  908 1463:ldc1            #189 <Int 9674>
	//  909 1465:castore         
	//  910 1466:dup             
	//  911 1467:sipush          225
	//  912 1470:ldc1            #190 <Int 9001>
	//  913 1472:castore         
	//  914 1473:dup             
	//  915 1474:sipush          226
	//  916 1477:ldc1            #29  <Int 0>
	//  917 1479:castore         
	//  918 1480:dup             
	//  919 1481:sipush          227
	//  920 1484:ldc1            #29  <Int 0>
	//  921 1486:castore         
	//  922 1487:dup             
	//  923 1488:sipush          228
	//  924 1491:ldc1            #29  <Int 0>
	//  925 1493:castore         
	//  926 1494:dup             
	//  927 1495:sipush          229
	//  928 1498:ldc1            #191 <Int 8721>
	//  929 1500:castore         
	//  930 1501:dup             
	//  931 1502:sipush          230
	//  932 1505:ldc1            #192 <Int 9115>
	//  933 1507:castore         
	//  934 1508:dup             
	//  935 1509:sipush          231
	//  936 1512:ldc1            #193 <Int 9116>
	//  937 1514:castore         
	//  938 1515:dup             
	//  939 1516:sipush          232
	//  940 1519:ldc1            #194 <Int 9117>
	//  941 1521:castore         
	//  942 1522:dup             
	//  943 1523:sipush          233
	//  944 1526:ldc1            #195 <Int 9121>
	//  945 1528:castore         
	//  946 1529:dup             
	//  947 1530:sipush          234
	//  948 1533:ldc1            #196 <Int 9122>
	//  949 1535:castore         
	//  950 1536:dup             
	//  951 1537:sipush          235
	//  952 1540:ldc1            #197 <Int 9123>
	//  953 1542:castore         
	//  954 1543:dup             
	//  955 1544:sipush          236
	//  956 1547:ldc1            #198 <Int 9127>
	//  957 1549:castore         
	//  958 1550:dup             
	//  959 1551:sipush          237
	//  960 1554:ldc1            #199 <Int 9128>
	//  961 1556:castore         
	//  962 1557:dup             
	//  963 1558:sipush          238
	//  964 1561:ldc1            #200 <Int 9129>
	//  965 1563:castore         
	//  966 1564:dup             
	//  967 1565:sipush          239
	//  968 1568:ldc1            #201 <Int 9130>
	//  969 1570:castore         
	//  970 1571:dup             
	//  971 1572:sipush          240
	//  972 1575:ldc1            #29  <Int 0>
	//  973 1577:castore         
	//  974 1578:dup             
	//  975 1579:sipush          241
	//  976 1582:ldc1            #202 <Int 9002>
	//  977 1584:castore         
	//  978 1585:dup             
	//  979 1586:sipush          242
	//  980 1589:ldc1            #203 <Int 8747>
	//  981 1591:castore         
	//  982 1592:dup             
	//  983 1593:sipush          243
	//  984 1596:ldc1            #204 <Int 8992>
	//  985 1598:castore         
	//  986 1599:dup             
	//  987 1600:sipush          244
	//  988 1603:ldc1            #205 <Int 9134>
	//  989 1605:castore         
	//  990 1606:dup             
	//  991 1607:sipush          245
	//  992 1610:ldc1            #206 <Int 8993>
	//  993 1612:castore         
	//  994 1613:dup             
	//  995 1614:sipush          246
	//  996 1617:ldc1            #207 <Int 9118>
	//  997 1619:castore         
	//  998 1620:dup             
	//  999 1621:sipush          247
	// 1000 1624:ldc1            #208 <Int 9119>
	// 1001 1626:castore         
	// 1002 1627:dup             
	// 1003 1628:sipush          248
	// 1004 1631:ldc1            #209 <Int 9120>
	// 1005 1633:castore         
	// 1006 1634:dup             
	// 1007 1635:sipush          249
	// 1008 1638:ldc1            #210 <Int 9124>
	// 1009 1640:castore         
	// 1010 1641:dup             
	// 1011 1642:sipush          250
	// 1012 1645:ldc1            #211 <Int 9125>
	// 1013 1647:castore         
	// 1014 1648:dup             
	// 1015 1649:sipush          251
	// 1016 1652:ldc1            #212 <Int 9126>
	// 1017 1654:castore         
	// 1018 1655:dup             
	// 1019 1656:sipush          252
	// 1020 1659:ldc1            #213 <Int 9131>
	// 1021 1661:castore         
	// 1022 1662:dup             
	// 1023 1663:sipush          253
	// 1024 1666:ldc1            #214 <Int 9132>
	// 1025 1668:castore         
	// 1026 1669:dup             
	// 1027 1670:sipush          254
	// 1028 1673:ldc1            #215 <Int 9133>
	// 1029 1675:castore         
	// 1030 1676:dup             
	// 1031 1677:sipush          255
	// 1032 1680:ldc1            #29  <Int 0>
	// 1033 1682:castore         
	// 1034 1683:putstatic       #217 <Field char[] table1>
	// 1035 1686:sipush          256
	// 1036 1689:newarray        char[]
	// 1037 1691:dup             
	// 1038 1692:iconst_0        
	// 1039 1693:ldc1            #29  <Int 0>
	// 1040 1695:castore         
	// 1041 1696:dup             
	// 1042 1697:iconst_1        
	// 1043 1698:ldc1            #29  <Int 0>
	// 1044 1700:castore         
	// 1045 1701:dup             
	// 1046 1702:iconst_2        
	// 1047 1703:ldc1            #29  <Int 0>
	// 1048 1705:castore         
	// 1049 1706:dup             
	// 1050 1707:iconst_3        
	// 1051 1708:ldc1            #29  <Int 0>
	// 1052 1710:castore         
	// 1053 1711:dup             
	// 1054 1712:iconst_4        
	// 1055 1713:ldc1            #29  <Int 0>
	// 1056 1715:castore         
	// 1057 1716:dup             
	// 1058 1717:iconst_5        
	// 1059 1718:ldc1            #29  <Int 0>
	// 1060 1720:castore         
	// 1061 1721:dup             
	// 1062 1722:bipush          6
	// 1063 1724:ldc1            #29  <Int 0>
	// 1064 1726:castore         
	// 1065 1727:dup             
	// 1066 1728:bipush          7
	// 1067 1730:ldc1            #29  <Int 0>
	// 1068 1732:castore         
	// 1069 1733:dup             
	// 1070 1734:bipush          8
	// 1071 1736:ldc1            #29  <Int 0>
	// 1072 1738:castore         
	// 1073 1739:dup             
	// 1074 1740:bipush          9
	// 1075 1742:ldc1            #29  <Int 0>
	// 1076 1744:castore         
	// 1077 1745:dup             
	// 1078 1746:bipush          10
	// 1079 1748:ldc1            #29  <Int 0>
	// 1080 1750:castore         
	// 1081 1751:dup             
	// 1082 1752:bipush          11
	// 1083 1754:ldc1            #29  <Int 0>
	// 1084 1756:castore         
	// 1085 1757:dup             
	// 1086 1758:bipush          12
	// 1087 1760:ldc1            #29  <Int 0>
	// 1088 1762:castore         
	// 1089 1763:dup             
	// 1090 1764:bipush          13
	// 1091 1766:ldc1            #29  <Int 0>
	// 1092 1768:castore         
	// 1093 1769:dup             
	// 1094 1770:bipush          14
	// 1095 1772:ldc1            #29  <Int 0>
	// 1096 1774:castore         
	// 1097 1775:dup             
	// 1098 1776:bipush          15
	// 1099 1778:ldc1            #29  <Int 0>
	// 1100 1780:castore         
	// 1101 1781:dup             
	// 1102 1782:bipush          16
	// 1103 1784:ldc1            #29  <Int 0>
	// 1104 1786:castore         
	// 1105 1787:dup             
	// 1106 1788:bipush          17
	// 1107 1790:ldc1            #29  <Int 0>
	// 1108 1792:castore         
	// 1109 1793:dup             
	// 1110 1794:bipush          18
	// 1111 1796:ldc1            #29  <Int 0>
	// 1112 1798:castore         
	// 1113 1799:dup             
	// 1114 1800:bipush          19
	// 1115 1802:ldc1            #29  <Int 0>
	// 1116 1804:castore         
	// 1117 1805:dup             
	// 1118 1806:bipush          20
	// 1119 1808:ldc1            #29  <Int 0>
	// 1120 1810:castore         
	// 1121 1811:dup             
	// 1122 1812:bipush          21
	// 1123 1814:ldc1            #29  <Int 0>
	// 1124 1816:castore         
	// 1125 1817:dup             
	// 1126 1818:bipush          22
	// 1127 1820:ldc1            #29  <Int 0>
	// 1128 1822:castore         
	// 1129 1823:dup             
	// 1130 1824:bipush          23
	// 1131 1826:ldc1            #29  <Int 0>
	// 1132 1828:castore         
	// 1133 1829:dup             
	// 1134 1830:bipush          24
	// 1135 1832:ldc1            #29  <Int 0>
	// 1136 1834:castore         
	// 1137 1835:dup             
	// 1138 1836:bipush          25
	// 1139 1838:ldc1            #29  <Int 0>
	// 1140 1840:castore         
	// 1141 1841:dup             
	// 1142 1842:bipush          26
	// 1143 1844:ldc1            #29  <Int 0>
	// 1144 1846:castore         
	// 1145 1847:dup             
	// 1146 1848:bipush          27
	// 1147 1850:ldc1            #29  <Int 0>
	// 1148 1852:castore         
	// 1149 1853:dup             
	// 1150 1854:bipush          28
	// 1151 1856:ldc1            #29  <Int 0>
	// 1152 1858:castore         
	// 1153 1859:dup             
	// 1154 1860:bipush          29
	// 1155 1862:ldc1            #29  <Int 0>
	// 1156 1864:castore         
	// 1157 1865:dup             
	// 1158 1866:bipush          30
	// 1159 1868:ldc1            #29  <Int 0>
	// 1160 1870:castore         
	// 1161 1871:dup             
	// 1162 1872:bipush          31
	// 1163 1874:ldc1            #29  <Int 0>
	// 1164 1876:castore         
	// 1165 1877:dup             
	// 1166 1878:bipush          32
	// 1167 1880:ldc1            #30  <Int 32>
	// 1168 1882:castore         
	// 1169 1883:dup             
	// 1170 1884:bipush          33
	// 1171 1886:ldc1            #218 <Int 9985>
	// 1172 1888:castore         
	// 1173 1889:dup             
	// 1174 1890:bipush          34
	// 1175 1892:ldc1            #219 <Int 9986>
	// 1176 1894:castore         
	// 1177 1895:dup             
	// 1178 1896:bipush          35
	// 1179 1898:ldc1            #220 <Int 9987>
	// 1180 1900:castore         
	// 1181 1901:dup             
	// 1182 1902:bipush          36
	// 1183 1904:ldc1            #221 <Int 9988>
	// 1184 1906:castore         
	// 1185 1907:dup             
	// 1186 1908:bipush          37
	// 1187 1910:ldc1            #222 <Int 9742>
	// 1188 1912:castore         
	// 1189 1913:dup             
	// 1190 1914:bipush          38
	// 1191 1916:ldc1            #223 <Int 9990>
	// 1192 1918:castore         
	// 1193 1919:dup             
	// 1194 1920:bipush          39
	// 1195 1922:ldc1            #224 <Int 9991>
	// 1196 1924:castore         
	// 1197 1925:dup             
	// 1198 1926:bipush          40
	// 1199 1928:ldc1            #225 <Int 9992>
	// 1200 1930:castore         
	// 1201 1931:dup             
	// 1202 1932:bipush          41
	// 1203 1934:ldc1            #226 <Int 9993>
	// 1204 1936:castore         
	// 1205 1937:dup             
	// 1206 1938:bipush          42
	// 1207 1940:ldc1            #227 <Int 9755>
	// 1208 1942:castore         
	// 1209 1943:dup             
	// 1210 1944:bipush          43
	// 1211 1946:ldc1            #228 <Int 9758>
	// 1212 1948:castore         
	// 1213 1949:dup             
	// 1214 1950:bipush          44
	// 1215 1952:ldc1            #229 <Int 9996>
	// 1216 1954:castore         
	// 1217 1955:dup             
	// 1218 1956:bipush          45
	// 1219 1958:ldc1            #230 <Int 9997>
	// 1220 1960:castore         
	// 1221 1961:dup             
	// 1222 1962:bipush          46
	// 1223 1964:ldc1            #231 <Int 9998>
	// 1224 1966:castore         
	// 1225 1967:dup             
	// 1226 1968:bipush          47
	// 1227 1970:ldc1            #232 <Int 9999>
	// 1228 1972:castore         
	// 1229 1973:dup             
	// 1230 1974:bipush          48
	// 1231 1976:ldc1            #233 <Int 10000>
	// 1232 1978:castore         
	// 1233 1979:dup             
	// 1234 1980:bipush          49
	// 1235 1982:ldc1            #234 <Int 10001>
	// 1236 1984:castore         
	// 1237 1985:dup             
	// 1238 1986:bipush          50
	// 1239 1988:ldc1            #235 <Int 10002>
	// 1240 1990:castore         
	// 1241 1991:dup             
	// 1242 1992:bipush          51
	// 1243 1994:ldc1            #236 <Int 10003>
	// 1244 1996:castore         
	// 1245 1997:dup             
	// 1246 1998:bipush          52
	// 1247 2000:ldc1            #237 <Int 10004>
	// 1248 2002:castore         
	// 1249 2003:dup             
	// 1250 2004:bipush          53
	// 1251 2006:ldc1            #238 <Int 10005>
	// 1252 2008:castore         
	// 1253 2009:dup             
	// 1254 2010:bipush          54
	// 1255 2012:ldc1            #239 <Int 10006>
	// 1256 2014:castore         
	// 1257 2015:dup             
	// 1258 2016:bipush          55
	// 1259 2018:ldc1            #240 <Int 10007>
	// 1260 2020:castore         
	// 1261 2021:dup             
	// 1262 2022:bipush          56
	// 1263 2024:ldc1            #241 <Int 10008>
	// 1264 2026:castore         
	// 1265 2027:dup             
	// 1266 2028:bipush          57
	// 1267 2030:ldc1            #242 <Int 10009>
	// 1268 2032:castore         
	// 1269 2033:dup             
	// 1270 2034:bipush          58
	// 1271 2036:ldc1            #243 <Int 10010>
	// 1272 2038:castore         
	// 1273 2039:dup             
	// 1274 2040:bipush          59
	// 1275 2042:ldc1            #244 <Int 10011>
	// 1276 2044:castore         
	// 1277 2045:dup             
	// 1278 2046:bipush          60
	// 1279 2048:ldc1            #245 <Int 10012>
	// 1280 2050:castore         
	// 1281 2051:dup             
	// 1282 2052:bipush          61
	// 1283 2054:ldc1            #246 <Int 10013>
	// 1284 2056:castore         
	// 1285 2057:dup             
	// 1286 2058:bipush          62
	// 1287 2060:ldc1            #247 <Int 10014>
	// 1288 2062:castore         
	// 1289 2063:dup             
	// 1290 2064:bipush          63
	// 1291 2066:ldc1            #248 <Int 10015>
	// 1292 2068:castore         
	// 1293 2069:dup             
	// 1294 2070:bipush          64
	// 1295 2072:ldc1            #249 <Int 10016>
	// 1296 2074:castore         
	// 1297 2075:dup             
	// 1298 2076:bipush          65
	// 1299 2078:ldc1            #250 <Int 10017>
	// 1300 2080:castore         
	// 1301 2081:dup             
	// 1302 2082:bipush          66
	// 1303 2084:ldc1            #251 <Int 10018>
	// 1304 2086:castore         
	// 1305 2087:dup             
	// 1306 2088:bipush          67
	// 1307 2090:ldc1            #252 <Int 10019>
	// 1308 2092:castore         
	// 1309 2093:dup             
	// 1310 2094:bipush          68
	// 1311 2096:ldc1            #253 <Int 10020>
	// 1312 2098:castore         
	// 1313 2099:dup             
	// 1314 2100:bipush          69
	// 1315 2102:ldc1            #254 <Int 10021>
	// 1316 2104:castore         
	// 1317 2105:dup             
	// 1318 2106:bipush          70
	// 1319 2108:ldc1            #255 <Int 10022>
	// 1320 2110:castore         
	// 1321 2111:dup             
	// 1322 2112:bipush          71
	// 1323 2114:ldc2            #256 <Int 10023>
	// 1324 2117:castore         
	// 1325 2118:dup             
	// 1326 2119:bipush          72
	// 1327 2121:ldc2            #257 <Int 9733>
	// 1328 2124:castore         
	// 1329 2125:dup             
	// 1330 2126:bipush          73
	// 1331 2128:ldc2            #258 <Int 10025>
	// 1332 2131:castore         
	// 1333 2132:dup             
	// 1334 2133:bipush          74
	// 1335 2135:ldc2            #259 <Int 10026>
	// 1336 2138:castore         
	// 1337 2139:dup             
	// 1338 2140:bipush          75
	// 1339 2142:ldc2            #260 <Int 10027>
	// 1340 2145:castore         
	// 1341 2146:dup             
	// 1342 2147:bipush          76
	// 1343 2149:ldc2            #261 <Int 10028>
	// 1344 2152:castore         
	// 1345 2153:dup             
	// 1346 2154:bipush          77
	// 1347 2156:ldc2            #262 <Int 10029>
	// 1348 2159:castore         
	// 1349 2160:dup             
	// 1350 2161:bipush          78
	// 1351 2163:ldc2            #263 <Int 10030>
	// 1352 2166:castore         
	// 1353 2167:dup             
	// 1354 2168:bipush          79
	// 1355 2170:ldc2            #264 <Int 10031>
	// 1356 2173:castore         
	// 1357 2174:dup             
	// 1358 2175:bipush          80
	// 1359 2177:ldc2            #265 <Int 10032>
	// 1360 2180:castore         
	// 1361 2181:dup             
	// 1362 2182:bipush          81
	// 1363 2184:ldc2            #266 <Int 10033>
	// 1364 2187:castore         
	// 1365 2188:dup             
	// 1366 2189:bipush          82
	// 1367 2191:ldc2            #267 <Int 10034>
	// 1368 2194:castore         
	// 1369 2195:dup             
	// 1370 2196:bipush          83
	// 1371 2198:ldc2            #268 <Int 10035>
	// 1372 2201:castore         
	// 1373 2202:dup             
	// 1374 2203:bipush          84
	// 1375 2205:ldc2            #269 <Int 10036>
	// 1376 2208:castore         
	// 1377 2209:dup             
	// 1378 2210:bipush          85
	// 1379 2212:ldc2            #270 <Int 10037>
	// 1380 2215:castore         
	// 1381 2216:dup             
	// 1382 2217:bipush          86
	// 1383 2219:ldc2            #271 <Int 10038>
	// 1384 2222:castore         
	// 1385 2223:dup             
	// 1386 2224:bipush          87
	// 1387 2226:ldc2            #272 <Int 10039>
	// 1388 2229:castore         
	// 1389 2230:dup             
	// 1390 2231:bipush          88
	// 1391 2233:ldc2            #273 <Int 10040>
	// 1392 2236:castore         
	// 1393 2237:dup             
	// 1394 2238:bipush          89
	// 1395 2240:ldc2            #274 <Int 10041>
	// 1396 2243:castore         
	// 1397 2244:dup             
	// 1398 2245:bipush          90
	// 1399 2247:ldc2            #275 <Int 10042>
	// 1400 2250:castore         
	// 1401 2251:dup             
	// 1402 2252:bipush          91
	// 1403 2254:ldc2            #276 <Int 10043>
	// 1404 2257:castore         
	// 1405 2258:dup             
	// 1406 2259:bipush          92
	// 1407 2261:ldc2            #277 <Int 10044>
	// 1408 2264:castore         
	// 1409 2265:dup             
	// 1410 2266:bipush          93
	// 1411 2268:ldc2            #278 <Int 10045>
	// 1412 2271:castore         
	// 1413 2272:dup             
	// 1414 2273:bipush          94
	// 1415 2275:ldc2            #279 <Int 10046>
	// 1416 2278:castore         
	// 1417 2279:dup             
	// 1418 2280:bipush          95
	// 1419 2282:ldc2            #280 <Int 10047>
	// 1420 2285:castore         
	// 1421 2286:dup             
	// 1422 2287:bipush          96
	// 1423 2289:ldc2            #281 <Int 10048>
	// 1424 2292:castore         
	// 1425 2293:dup             
	// 1426 2294:bipush          97
	// 1427 2296:ldc2            #282 <Int 10049>
	// 1428 2299:castore         
	// 1429 2300:dup             
	// 1430 2301:bipush          98
	// 1431 2303:ldc2            #283 <Int 10050>
	// 1432 2306:castore         
	// 1433 2307:dup             
	// 1434 2308:bipush          99
	// 1435 2310:ldc2            #284 <Int 10051>
	// 1436 2313:castore         
	// 1437 2314:dup             
	// 1438 2315:bipush          100
	// 1439 2317:ldc2            #285 <Int 10052>
	// 1440 2320:castore         
	// 1441 2321:dup             
	// 1442 2322:bipush          101
	// 1443 2324:ldc2            #286 <Int 10053>
	// 1444 2327:castore         
	// 1445 2328:dup             
	// 1446 2329:bipush          102
	// 1447 2331:ldc2            #287 <Int 10054>
	// 1448 2334:castore         
	// 1449 2335:dup             
	// 1450 2336:bipush          103
	// 1451 2338:ldc2            #288 <Int 10055>
	// 1452 2341:castore         
	// 1453 2342:dup             
	// 1454 2343:bipush          104
	// 1455 2345:ldc2            #289 <Int 10056>
	// 1456 2348:castore         
	// 1457 2349:dup             
	// 1458 2350:bipush          105
	// 1459 2352:ldc2            #290 <Int 10057>
	// 1460 2355:castore         
	// 1461 2356:dup             
	// 1462 2357:bipush          106
	// 1463 2359:ldc2            #291 <Int 10058>
	// 1464 2362:castore         
	// 1465 2363:dup             
	// 1466 2364:bipush          107
	// 1467 2366:ldc2            #292 <Int 10059>
	// 1468 2369:castore         
	// 1469 2370:dup             
	// 1470 2371:bipush          108
	// 1471 2373:ldc2            #293 <Int 9679>
	// 1472 2376:castore         
	// 1473 2377:dup             
	// 1474 2378:bipush          109
	// 1475 2380:ldc2            #294 <Int 10061>
	// 1476 2383:castore         
	// 1477 2384:dup             
	// 1478 2385:bipush          110
	// 1479 2387:ldc2            #295 <Int 9632>
	// 1480 2390:castore         
	// 1481 2391:dup             
	// 1482 2392:bipush          111
	// 1483 2394:ldc2            #296 <Int 10063>
	// 1484 2397:castore         
	// 1485 2398:dup             
	// 1486 2399:bipush          112
	// 1487 2401:ldc2            #297 <Int 10064>
	// 1488 2404:castore         
	// 1489 2405:dup             
	// 1490 2406:bipush          113
	// 1491 2408:ldc2            #298 <Int 10065>
	// 1492 2411:castore         
	// 1493 2412:dup             
	// 1494 2413:bipush          114
	// 1495 2415:ldc2            #299 <Int 10066>
	// 1496 2418:castore         
	// 1497 2419:dup             
	// 1498 2420:bipush          115
	// 1499 2422:ldc2            #300 <Int 9650>
	// 1500 2425:castore         
	// 1501 2426:dup             
	// 1502 2427:bipush          116
	// 1503 2429:ldc2            #301 <Int 9660>
	// 1504 2432:castore         
	// 1505 2433:dup             
	// 1506 2434:bipush          117
	// 1507 2436:ldc2            #302 <Int 9670>
	// 1508 2439:castore         
	// 1509 2440:dup             
	// 1510 2441:bipush          118
	// 1511 2443:ldc2            #303 <Int 10070>
	// 1512 2446:castore         
	// 1513 2447:dup             
	// 1514 2448:bipush          119
	// 1515 2450:ldc2            #304 <Int 9687>
	// 1516 2453:castore         
	// 1517 2454:dup             
	// 1518 2455:bipush          120
	// 1519 2457:ldc2            #305 <Int 10072>
	// 1520 2460:castore         
	// 1521 2461:dup             
	// 1522 2462:bipush          121
	// 1523 2464:ldc2            #306 <Int 10073>
	// 1524 2467:castore         
	// 1525 2468:dup             
	// 1526 2469:bipush          122
	// 1527 2471:ldc2            #307 <Int 10074>
	// 1528 2474:castore         
	// 1529 2475:dup             
	// 1530 2476:bipush          123
	// 1531 2478:ldc2            #308 <Int 10075>
	// 1532 2481:castore         
	// 1533 2482:dup             
	// 1534 2483:bipush          124
	// 1535 2485:ldc2            #309 <Int 10076>
	// 1536 2488:castore         
	// 1537 2489:dup             
	// 1538 2490:bipush          125
	// 1539 2492:ldc2            #310 <Int 10077>
	// 1540 2495:castore         
	// 1541 2496:dup             
	// 1542 2497:bipush          126
	// 1543 2499:ldc2            #311 <Int 10078>
	// 1544 2502:castore         
	// 1545 2503:dup             
	// 1546 2504:bipush          127
	// 1547 2506:ldc1            #29  <Int 0>
	// 1548 2508:castore         
	// 1549 2509:dup             
	// 1550 2510:sipush          128
	// 1551 2513:ldc1            #29  <Int 0>
	// 1552 2515:castore         
	// 1553 2516:dup             
	// 1554 2517:sipush          129
	// 1555 2520:ldc1            #29  <Int 0>
	// 1556 2522:castore         
	// 1557 2523:dup             
	// 1558 2524:sipush          130
	// 1559 2527:ldc1            #29  <Int 0>
	// 1560 2529:castore         
	// 1561 2530:dup             
	// 1562 2531:sipush          131
	// 1563 2534:ldc1            #29  <Int 0>
	// 1564 2536:castore         
	// 1565 2537:dup             
	// 1566 2538:sipush          132
	// 1567 2541:ldc1            #29  <Int 0>
	// 1568 2543:castore         
	// 1569 2544:dup             
	// 1570 2545:sipush          133
	// 1571 2548:ldc1            #29  <Int 0>
	// 1572 2550:castore         
	// 1573 2551:dup             
	// 1574 2552:sipush          134
	// 1575 2555:ldc1            #29  <Int 0>
	// 1576 2557:castore         
	// 1577 2558:dup             
	// 1578 2559:sipush          135
	// 1579 2562:ldc1            #29  <Int 0>
	// 1580 2564:castore         
	// 1581 2565:dup             
	// 1582 2566:sipush          136
	// 1583 2569:ldc1            #29  <Int 0>
	// 1584 2571:castore         
	// 1585 2572:dup             
	// 1586 2573:sipush          137
	// 1587 2576:ldc1            #29  <Int 0>
	// 1588 2578:castore         
	// 1589 2579:dup             
	// 1590 2580:sipush          138
	// 1591 2583:ldc1            #29  <Int 0>
	// 1592 2585:castore         
	// 1593 2586:dup             
	// 1594 2587:sipush          139
	// 1595 2590:ldc1            #29  <Int 0>
	// 1596 2592:castore         
	// 1597 2593:dup             
	// 1598 2594:sipush          140
	// 1599 2597:ldc1            #29  <Int 0>
	// 1600 2599:castore         
	// 1601 2600:dup             
	// 1602 2601:sipush          141
	// 1603 2604:ldc1            #29  <Int 0>
	// 1604 2606:castore         
	// 1605 2607:dup             
	// 1606 2608:sipush          142
	// 1607 2611:ldc1            #29  <Int 0>
	// 1608 2613:castore         
	// 1609 2614:dup             
	// 1610 2615:sipush          143
	// 1611 2618:ldc1            #29  <Int 0>
	// 1612 2620:castore         
	// 1613 2621:dup             
	// 1614 2622:sipush          144
	// 1615 2625:ldc1            #29  <Int 0>
	// 1616 2627:castore         
	// 1617 2628:dup             
	// 1618 2629:sipush          145
	// 1619 2632:ldc1            #29  <Int 0>
	// 1620 2634:castore         
	// 1621 2635:dup             
	// 1622 2636:sipush          146
	// 1623 2639:ldc1            #29  <Int 0>
	// 1624 2641:castore         
	// 1625 2642:dup             
	// 1626 2643:sipush          147
	// 1627 2646:ldc1            #29  <Int 0>
	// 1628 2648:castore         
	// 1629 2649:dup             
	// 1630 2650:sipush          148
	// 1631 2653:ldc1            #29  <Int 0>
	// 1632 2655:castore         
	// 1633 2656:dup             
	// 1634 2657:sipush          149
	// 1635 2660:ldc1            #29  <Int 0>
	// 1636 2662:castore         
	// 1637 2663:dup             
	// 1638 2664:sipush          150
	// 1639 2667:ldc1            #29  <Int 0>
	// 1640 2669:castore         
	// 1641 2670:dup             
	// 1642 2671:sipush          151
	// 1643 2674:ldc1            #29  <Int 0>
	// 1644 2676:castore         
	// 1645 2677:dup             
	// 1646 2678:sipush          152
	// 1647 2681:ldc1            #29  <Int 0>
	// 1648 2683:castore         
	// 1649 2684:dup             
	// 1650 2685:sipush          153
	// 1651 2688:ldc1            #29  <Int 0>
	// 1652 2690:castore         
	// 1653 2691:dup             
	// 1654 2692:sipush          154
	// 1655 2695:ldc1            #29  <Int 0>
	// 1656 2697:castore         
	// 1657 2698:dup             
	// 1658 2699:sipush          155
	// 1659 2702:ldc1            #29  <Int 0>
	// 1660 2704:castore         
	// 1661 2705:dup             
	// 1662 2706:sipush          156
	// 1663 2709:ldc1            #29  <Int 0>
	// 1664 2711:castore         
	// 1665 2712:dup             
	// 1666 2713:sipush          157
	// 1667 2716:ldc1            #29  <Int 0>
	// 1668 2718:castore         
	// 1669 2719:dup             
	// 1670 2720:sipush          158
	// 1671 2723:ldc1            #29  <Int 0>
	// 1672 2725:castore         
	// 1673 2726:dup             
	// 1674 2727:sipush          159
	// 1675 2730:ldc1            #29  <Int 0>
	// 1676 2732:castore         
	// 1677 2733:dup             
	// 1678 2734:sipush          160
	// 1679 2737:ldc1            #29  <Int 0>
	// 1680 2739:castore         
	// 1681 2740:dup             
	// 1682 2741:sipush          161
	// 1683 2744:ldc2            #312 <Int 10081>
	// 1684 2747:castore         
	// 1685 2748:dup             
	// 1686 2749:sipush          162
	// 1687 2752:ldc2            #313 <Int 10082>
	// 1688 2755:castore         
	// 1689 2756:dup             
	// 1690 2757:sipush          163
	// 1691 2760:ldc2            #314 <Int 10083>
	// 1692 2763:castore         
	// 1693 2764:dup             
	// 1694 2765:sipush          164
	// 1695 2768:ldc2            #315 <Int 10084>
	// 1696 2771:castore         
	// 1697 2772:dup             
	// 1698 2773:sipush          165
	// 1699 2776:ldc2            #316 <Int 10085>
	// 1700 2779:castore         
	// 1701 2780:dup             
	// 1702 2781:sipush          166
	// 1703 2784:ldc2            #317 <Int 10086>
	// 1704 2787:castore         
	// 1705 2788:dup             
	// 1706 2789:sipush          167
	// 1707 2792:ldc2            #318 <Int 10087>
	// 1708 2795:castore         
	// 1709 2796:dup             
	// 1710 2797:sipush          168
	// 1711 2800:ldc1            #132 <Int 9827>
	// 1712 2802:castore         
	// 1713 2803:dup             
	// 1714 2804:sipush          169
	// 1715 2807:ldc1            #133 <Int 9830>
	// 1716 2809:castore         
	// 1717 2810:dup             
	// 1718 2811:sipush          170
	// 1719 2814:ldc1            #134 <Int 9829>
	// 1720 2816:castore         
	// 1721 2817:dup             
	// 1722 2818:sipush          171
	// 1723 2821:ldc1            #135 <Int 9824>
	// 1724 2823:castore         
	// 1725 2824:dup             
	// 1726 2825:sipush          172
	// 1727 2828:ldc2            #319 <Int 9312>
	// 1728 2831:castore         
	// 1729 2832:dup             
	// 1730 2833:sipush          173
	// 1731 2836:ldc2            #320 <Int 9313>
	// 1732 2839:castore         
	// 1733 2840:dup             
	// 1734 2841:sipush          174
	// 1735 2844:ldc2            #321 <Int 9314>
	// 1736 2847:castore         
	// 1737 2848:dup             
	// 1738 2849:sipush          175
	// 1739 2852:ldc2            #322 <Int 9315>
	// 1740 2855:castore         
	// 1741 2856:dup             
	// 1742 2857:sipush          176
	// 1743 2860:ldc2            #323 <Int 9316>
	// 1744 2863:castore         
	// 1745 2864:dup             
	// 1746 2865:sipush          177
	// 1747 2868:ldc2            #324 <Int 9317>
	// 1748 2871:castore         
	// 1749 2872:dup             
	// 1750 2873:sipush          178
	// 1751 2876:ldc2            #325 <Int 9318>
	// 1752 2879:castore         
	// 1753 2880:dup             
	// 1754 2881:sipush          179
	// 1755 2884:ldc2            #326 <Int 9319>
	// 1756 2887:castore         
	// 1757 2888:dup             
	// 1758 2889:sipush          180
	// 1759 2892:ldc2            #327 <Int 9320>
	// 1760 2895:castore         
	// 1761 2896:dup             
	// 1762 2897:sipush          181
	// 1763 2900:ldc2            #328 <Int 9321>
	// 1764 2903:castore         
	// 1765 2904:dup             
	// 1766 2905:sipush          182
	// 1767 2908:ldc2            #329 <Int 10102>
	// 1768 2911:castore         
	// 1769 2912:dup             
	// 1770 2913:sipush          183
	// 1771 2916:ldc2            #330 <Int 10103>
	// 1772 2919:castore         
	// 1773 2920:dup             
	// 1774 2921:sipush          184
	// 1775 2924:ldc2            #331 <Int 10104>
	// 1776 2927:castore         
	// 1777 2928:dup             
	// 1778 2929:sipush          185
	// 1779 2932:ldc2            #332 <Int 10105>
	// 1780 2935:castore         
	// 1781 2936:dup             
	// 1782 2937:sipush          186
	// 1783 2940:ldc2            #333 <Int 10106>
	// 1784 2943:castore         
	// 1785 2944:dup             
	// 1786 2945:sipush          187
	// 1787 2948:ldc2            #334 <Int 10107>
	// 1788 2951:castore         
	// 1789 2952:dup             
	// 1790 2953:sipush          188
	// 1791 2956:ldc2            #335 <Int 10108>
	// 1792 2959:castore         
	// 1793 2960:dup             
	// 1794 2961:sipush          189
	// 1795 2964:ldc2            #336 <Int 10109>
	// 1796 2967:castore         
	// 1797 2968:dup             
	// 1798 2969:sipush          190
	// 1799 2972:ldc2            #337 <Int 10110>
	// 1800 2975:castore         
	// 1801 2976:dup             
	// 1802 2977:sipush          191
	// 1803 2980:ldc2            #338 <Int 10111>
	// 1804 2983:castore         
	// 1805 2984:dup             
	// 1806 2985:sipush          192
	// 1807 2988:ldc2            #339 <Int 10112>
	// 1808 2991:castore         
	// 1809 2992:dup             
	// 1810 2993:sipush          193
	// 1811 2996:ldc2            #340 <Int 10113>
	// 1812 2999:castore         
	// 1813 3000:dup             
	// 1814 3001:sipush          194
	// 1815 3004:ldc2            #341 <Int 10114>
	// 1816 3007:castore         
	// 1817 3008:dup             
	// 1818 3009:sipush          195
	// 1819 3012:ldc2            #342 <Int 10115>
	// 1820 3015:castore         
	// 1821 3016:dup             
	// 1822 3017:sipush          196
	// 1823 3020:ldc2            #343 <Int 10116>
	// 1824 3023:castore         
	// 1825 3024:dup             
	// 1826 3025:sipush          197
	// 1827 3028:ldc2            #344 <Int 10117>
	// 1828 3031:castore         
	// 1829 3032:dup             
	// 1830 3033:sipush          198
	// 1831 3036:ldc2            #345 <Int 10118>
	// 1832 3039:castore         
	// 1833 3040:dup             
	// 1834 3041:sipush          199
	// 1835 3044:ldc2            #346 <Int 10119>
	// 1836 3047:castore         
	// 1837 3048:dup             
	// 1838 3049:sipush          200
	// 1839 3052:ldc2            #347 <Int 10120>
	// 1840 3055:castore         
	// 1841 3056:dup             
	// 1842 3057:sipush          201
	// 1843 3060:ldc2            #348 <Int 10121>
	// 1844 3063:castore         
	// 1845 3064:dup             
	// 1846 3065:sipush          202
	// 1847 3068:ldc2            #349 <Int 10122>
	// 1848 3071:castore         
	// 1849 3072:dup             
	// 1850 3073:sipush          203
	// 1851 3076:ldc2            #350 <Int 10123>
	// 1852 3079:castore         
	// 1853 3080:dup             
	// 1854 3081:sipush          204
	// 1855 3084:ldc2            #351 <Int 10124>
	// 1856 3087:castore         
	// 1857 3088:dup             
	// 1858 3089:sipush          205
	// 1859 3092:ldc2            #352 <Int 10125>
	// 1860 3095:castore         
	// 1861 3096:dup             
	// 1862 3097:sipush          206
	// 1863 3100:ldc2            #353 <Int 10126>
	// 1864 3103:castore         
	// 1865 3104:dup             
	// 1866 3105:sipush          207
	// 1867 3108:ldc2            #354 <Int 10127>
	// 1868 3111:castore         
	// 1869 3112:dup             
	// 1870 3113:sipush          208
	// 1871 3116:ldc2            #355 <Int 10128>
	// 1872 3119:castore         
	// 1873 3120:dup             
	// 1874 3121:sipush          209
	// 1875 3124:ldc2            #356 <Int 10129>
	// 1876 3127:castore         
	// 1877 3128:dup             
	// 1878 3129:sipush          210
	// 1879 3132:ldc2            #357 <Int 10130>
	// 1880 3135:castore         
	// 1881 3136:dup             
	// 1882 3137:sipush          211
	// 1883 3140:ldc2            #358 <Int 10131>
	// 1884 3143:castore         
	// 1885 3144:dup             
	// 1886 3145:sipush          212
	// 1887 3148:ldc2            #359 <Int 10132>
	// 1888 3151:castore         
	// 1889 3152:dup             
	// 1890 3153:sipush          213
	// 1891 3156:ldc1            #139 <Int 8594>
	// 1892 3158:castore         
	// 1893 3159:dup             
	// 1894 3160:sipush          214
	// 1895 3163:ldc1            #136 <Int 8596>
	// 1896 3165:castore         
	// 1897 3166:dup             
	// 1898 3167:sipush          215
	// 1899 3170:ldc2            #360 <Int 8597>
	// 1900 3173:castore         
	// 1901 3174:dup             
	// 1902 3175:sipush          216
	// 1903 3178:ldc2            #361 <Int 10136>
	// 1904 3181:castore         
	// 1905 3182:dup             
	// 1906 3183:sipush          217
	// 1907 3186:ldc2            #362 <Int 10137>
	// 1908 3189:castore         
	// 1909 3190:dup             
	// 1910 3191:sipush          218
	// 1911 3194:ldc2            #363 <Int 10138>
	// 1912 3197:castore         
	// 1913 3198:dup             
	// 1914 3199:sipush          219
	// 1915 3202:ldc2            #364 <Int 10139>
	// 1916 3205:castore         
	// 1917 3206:dup             
	// 1918 3207:sipush          220
	// 1919 3210:ldc2            #365 <Int 10140>
	// 1920 3213:castore         
	// 1921 3214:dup             
	// 1922 3215:sipush          221
	// 1923 3218:ldc2            #366 <Int 10141>
	// 1924 3221:castore         
	// 1925 3222:dup             
	// 1926 3223:sipush          222
	// 1927 3226:ldc2            #367 <Int 10142>
	// 1928 3229:castore         
	// 1929 3230:dup             
	// 1930 3231:sipush          223
	// 1931 3234:ldc2            #368 <Int 10143>
	// 1932 3237:castore         
	// 1933 3238:dup             
	// 1934 3239:sipush          224
	// 1935 3242:ldc2            #369 <Int 10144>
	// 1936 3245:castore         
	// 1937 3246:dup             
	// 1938 3247:sipush          225
	// 1939 3250:ldc2            #370 <Int 10145>
	// 1940 3253:castore         
	// 1941 3254:dup             
	// 1942 3255:sipush          226
	// 1943 3258:ldc2            #371 <Int 10146>
	// 1944 3261:castore         
	// 1945 3262:dup             
	// 1946 3263:sipush          227
	// 1947 3266:ldc2            #372 <Int 10147>
	// 1948 3269:castore         
	// 1949 3270:dup             
	// 1950 3271:sipush          228
	// 1951 3274:ldc2            #373 <Int 10148>
	// 1952 3277:castore         
	// 1953 3278:dup             
	// 1954 3279:sipush          229
	// 1955 3282:ldc2            #374 <Int 10149>
	// 1956 3285:castore         
	// 1957 3286:dup             
	// 1958 3287:sipush          230
	// 1959 3290:ldc2            #375 <Int 10150>
	// 1960 3293:castore         
	// 1961 3294:dup             
	// 1962 3295:sipush          231
	// 1963 3298:ldc2            #376 <Int 10151>
	// 1964 3301:castore         
	// 1965 3302:dup             
	// 1966 3303:sipush          232
	// 1967 3306:ldc2            #377 <Int 10152>
	// 1968 3309:castore         
	// 1969 3310:dup             
	// 1970 3311:sipush          233
	// 1971 3314:ldc2            #378 <Int 10153>
	// 1972 3317:castore         
	// 1973 3318:dup             
	// 1974 3319:sipush          234
	// 1975 3322:ldc2            #379 <Int 10154>
	// 1976 3325:castore         
	// 1977 3326:dup             
	// 1978 3327:sipush          235
	// 1979 3330:ldc2            #380 <Int 10155>
	// 1980 3333:castore         
	// 1981 3334:dup             
	// 1982 3335:sipush          236
	// 1983 3338:ldc2            #381 <Int 10156>
	// 1984 3341:castore         
	// 1985 3342:dup             
	// 1986 3343:sipush          237
	// 1987 3346:ldc2            #382 <Int 10157>
	// 1988 3349:castore         
	// 1989 3350:dup             
	// 1990 3351:sipush          238
	// 1991 3354:ldc2            #383 <Int 10158>
	// 1992 3357:castore         
	// 1993 3358:dup             
	// 1994 3359:sipush          239
	// 1995 3362:ldc2            #384 <Int 10159>
	// 1996 3365:castore         
	// 1997 3366:dup             
	// 1998 3367:sipush          240
	// 1999 3370:ldc1            #29  <Int 0>
	// 2000 3372:castore         
	// 2001 3373:dup             
	// 2002 3374:sipush          241
	// 2003 3377:ldc2            #385 <Int 10161>
	// 2004 3380:castore         
	// 2005 3381:dup             
	// 2006 3382:sipush          242
	// 2007 3385:ldc2            #386 <Int 10162>
	// 2008 3388:castore         
	// 2009 3389:dup             
	// 2010 3390:sipush          243
	// 2011 3393:ldc2            #387 <Int 10163>
	// 2012 3396:castore         
	// 2013 3397:dup             
	// 2014 3398:sipush          244
	// 2015 3401:ldc2            #388 <Int 10164>
	// 2016 3404:castore         
	// 2017 3405:dup             
	// 2018 3406:sipush          245
	// 2019 3409:ldc2            #389 <Int 10165>
	// 2020 3412:castore         
	// 2021 3413:dup             
	// 2022 3414:sipush          246
	// 2023 3417:ldc2            #390 <Int 10166>
	// 2024 3420:castore         
	// 2025 3421:dup             
	// 2026 3422:sipush          247
	// 2027 3425:ldc2            #391 <Int 10167>
	// 2028 3428:castore         
	// 2029 3429:dup             
	// 2030 3430:sipush          248
	// 2031 3433:ldc2            #392 <Int 10168>
	// 2032 3436:castore         
	// 2033 3437:dup             
	// 2034 3438:sipush          249
	// 2035 3441:ldc2            #393 <Int 10169>
	// 2036 3444:castore         
	// 2037 3445:dup             
	// 2038 3446:sipush          250
	// 2039 3449:ldc2            #394 <Int 10170>
	// 2040 3452:castore         
	// 2041 3453:dup             
	// 2042 3454:sipush          251
	// 2043 3457:ldc2            #395 <Int 10171>
	// 2044 3460:castore         
	// 2045 3461:dup             
	// 2046 3462:sipush          252
	// 2047 3465:ldc2            #396 <Int 10172>
	// 2048 3468:castore         
	// 2049 3469:dup             
	// 2050 3470:sipush          253
	// 2051 3473:ldc2            #397 <Int 10173>
	// 2052 3476:castore         
	// 2053 3477:dup             
	// 2054 3478:sipush          254
	// 2055 3481:ldc2            #398 <Int 10174>
	// 2056 3484:castore         
	// 2057 3485:dup             
	// 2058 3486:sipush          255
	// 2059 3489:ldc1            #29  <Int 0>
	// 2060 3491:castore         
	// 2061 3492:putstatic       #400 <Field char[] table2>
		for(int i = 0; i < 256; i++)
	//*2062 3495:iconst_0        
	//*2063 3496:istore_0        
	//*2064 3497:iload_0         
	//*2065 3498:sipush          256
	//*2066 3501:icmpge          3530
		{
			char c = table1[i];
	// 2067 3504:getstatic       #217 <Field char[] table1>
	// 2068 3507:iload_0         
	// 2069 3508:caload          
	// 2070 3509:istore_1        
			if(c != 0)
	//*2071 3510:iload_1         
	//*2072 3511:ifeq            3523
				t1.put(((int) (c)), i);
	// 2073 3514:getstatic       #26  <Field IntHashtable t1>
	// 2074 3517:iload_1         
	// 2075 3518:iload_0         
	// 2076 3519:invokevirtual   #404 <Method int IntHashtable.put(int, int)>
	// 2077 3522:pop             
		}

	// 2078 3523:iload_0         
	// 2079 3524:iconst_1        
	// 2080 3525:iadd            
	// 2081 3526:istore_0        
	//*2082 3527:goto            3497
		for(int j = 0; j < 256; j++)
	//*2083 3530:iconst_0        
	//*2084 3531:istore_0        
	//*2085 3532:iload_0         
	//*2086 3533:sipush          256
	//*2087 3536:icmpge          3565
		{
			char c1 = table2[j];
	// 2088 3539:getstatic       #400 <Field char[] table2>
	// 2089 3542:iload_0         
	// 2090 3543:caload          
	// 2091 3544:istore_1        
			if(c1 != 0)
	//*2092 3545:iload_1         
	//*2093 3546:ifeq            3558
				t2.put(((int) (c1)), j);
	// 2094 3549:getstatic       #28  <Field IntHashtable t2>
	// 2095 3552:iload_1         
	// 2096 3553:iload_0         
	// 2097 3554:invokevirtual   #404 <Method int IntHashtable.put(int, int)>
	// 2098 3557:pop             
		}

	// 2099 3558:iload_0         
	// 2100 3559:iconst_1        
	// 2101 3560:iadd            
	// 2102 3561:istore_0        
	//*2103 3562:goto            3532
	//*2104 3565:return          
	}

	PdfEncodings$SymbolConversion(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #407 <Method void Object()>
		if(flag)
	//*   2    4:iload_1         
	//*   3    5:ifeq            23
		{
			translation = t1;
	//    4    8:aload_0         
	//    5    9:getstatic       #26  <Field IntHashtable t1>
	//    6   12:putfield        #409 <Field IntHashtable translation>
			byteToChar = table1;
	//    7   15:aload_0         
	//    8   16:getstatic       #217 <Field char[] table1>
	//    9   19:putfield        #411 <Field char[] byteToChar>
			return;
	//   10   22:return          
		} else
		{
			translation = t2;
	//   11   23:aload_0         
	//   12   24:getstatic       #28  <Field IntHashtable t2>
	//   13   27:putfield        #409 <Field IntHashtable translation>
			byteToChar = table2;
	//   14   30:aload_0         
	//   15   31:getstatic       #400 <Field char[] table2>
	//   16   34:putfield        #411 <Field char[] byteToChar>
			return;
	//   17   37:return          
		}
	}
}
