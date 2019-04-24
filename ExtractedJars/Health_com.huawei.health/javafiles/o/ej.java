// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


public final class ej
{

	public static byte[] c(String s)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #136 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #139 <Method void StringBuffer()>
	//    3    7:astore          6
		s = ((String) (s.getBytes("US-ASCII")));
	//    4    9:aload_0         
	//    5   10:ldc1            #141 <String "US-ASCII">
	//    6   12:invokevirtual   #146 <Method byte[] String.getBytes(String)>
	//    7   15:astore_0        
		int k = s.length;
	//    8   16:aload_0         
	//    9   17:arraylength     
	//   10   18:istore_3        
		int i = 0;
	//   11   19:iconst_0        
	//   12   20:istore_1        
		do
		{
			if(i >= k)
				break;
	//   13   21:iload_1         
	//   14   22:iload_3         
	//   15   23:icmpge          269
			int j;
			byte byte1;
			do
			{
				byte abyte0[] = a;
	//   16   26:getstatic       #131 <Field byte[] a>
	//   17   29:astore          7
				j = i + 1;
	//   18   31:iload_1         
	//   19   32:iconst_1        
	//   20   33:iadd            
	//   21   34:istore_2        
				byte1 = abyte0[s[i]];
	//   22   35:aload           7
	//   23   37:aload_0         
	//   24   38:iload_1         
	//   25   39:baload          
	//   26   40:baload          
	//   27   41:istore          5
				if(j >= k)
					break;
	//   28   43:iload_2         
	//   29   44:iload_3         
	//   30   45:icmpge          56
				i = j;
	//   31   48:iload_2         
	//   32   49:istore_1        
			} while(byte1 == -1);
	//   33   50:iload           5
	//   34   52:iconst_m1       
	//   35   53:icmpeq          26
			if(byte1 == -1)
				break;
	//   36   56:iload           5
	//   37   58:iconst_m1       
	//   38   59:icmpeq          269
			i = j;
	//   39   62:iload_2         
	//   40   63:istore_1        
			byte byte0;
			do
			{
				byte abyte1[] = a;
	//   41   64:getstatic       #131 <Field byte[] a>
	//   42   67:astore          7
				j = i + 1;
	//   43   69:iload_1         
	//   44   70:iconst_1        
	//   45   71:iadd            
	//   46   72:istore_2        
				byte0 = abyte1[s[i]];
	//   47   73:aload           7
	//   48   75:aload_0         
	//   49   76:iload_1         
	//   50   77:baload          
	//   51   78:baload          
	//   52   79:istore          4
				if(j >= k)
					break;
	//   53   81:iload_2         
	//   54   82:iload_3         
	//   55   83:icmpge          94
				i = j;
	//   56   86:iload_2         
	//   57   87:istore_1        
			} while(byte0 == -1);
	//   58   88:iload           4
	//   59   90:iconst_m1       
	//   60   91:icmpeq          64
			if(byte0 == -1)
				break;
	//   61   94:iload           4
	//   62   96:iconst_m1       
	//   63   97:icmpeq          269
			stringbuffer.append((char)(byte1 << 2 | (byte0 & 0x30) >>> 4));
	//   64  100:aload           6
	//   65  102:iload           5
	//   66  104:iconst_2        
	//   67  105:ishl            
	//   68  106:iload           4
	//   69  108:bipush          48
	//   70  110:iand            
	//   71  111:iconst_4        
	//   72  112:iushr           
	//   73  113:ior             
	//   74  114:int2char        
	//   75  115:invokevirtual   #150 <Method StringBuffer StringBuffer.append(char)>
	//   76  118:pop             
			i = j;
	//   77  119:iload_2         
	//   78  120:istore_1        
			do
			{
				j = i + 1;
	//   79  121:iload_1         
	//   80  122:iconst_1        
	//   81  123:iadd            
	//   82  124:istore_2        
				i = ((int) (s[i]));
	//   83  125:aload_0         
	//   84  126:iload_1         
	//   85  127:baload          
	//   86  128:istore_1        
				if(i == 61)
	//*  87  129:iload_1         
	//*  88  130:bipush          61
	//*  89  132:icmpne          146
					return stringbuffer.toString().getBytes("iso8859-1");
	//   90  135:aload           6
	//   91  137:invokevirtual   #154 <Method String StringBuffer.toString()>
	//   92  140:ldc1            #156 <String "iso8859-1">
	//   93  142:invokevirtual   #146 <Method byte[] String.getBytes(String)>
	//   94  145:areturn         
				byte1 = a[i];
	//   95  146:getstatic       #131 <Field byte[] a>
	//   96  149:iload_1         
	//   97  150:baload          
	//   98  151:istore          5
				if(j >= k)
					break;
	//   99  153:iload_2         
	//  100  154:iload_3         
	//  101  155:icmpge          166
				i = j;
	//  102  158:iload_2         
	//  103  159:istore_1        
			} while(byte1 == -1);
	//  104  160:iload           5
	//  105  162:iconst_m1       
	//  106  163:icmpeq          121
			if(byte1 == -1)
				break;
	//  107  166:iload           5
	//  108  168:iconst_m1       
	//  109  169:icmpeq          269
			stringbuffer.append((char)((byte0 & 0xf) << 4 | (byte1 & 0x3c) >>> 2));
	//  110  172:aload           6
	//  111  174:iload           4
	//  112  176:bipush          15
	//  113  178:iand            
	//  114  179:iconst_4        
	//  115  180:ishl            
	//  116  181:iload           5
	//  117  183:bipush          60
	//  118  185:iand            
	//  119  186:iconst_2        
	//  120  187:iushr           
	//  121  188:ior             
	//  122  189:int2char        
	//  123  190:invokevirtual   #150 <Method StringBuffer StringBuffer.append(char)>
	//  124  193:pop             
			i = j;
	//  125  194:iload_2         
	//  126  195:istore_1        
			do
			{
				j = i + 1;
	//  127  196:iload_1         
	//  128  197:iconst_1        
	//  129  198:iadd            
	//  130  199:istore_2        
				i = ((int) (s[i]));
	//  131  200:aload_0         
	//  132  201:iload_1         
	//  133  202:baload          
	//  134  203:istore_1        
				if(i == 61)
	//* 135  204:iload_1         
	//* 136  205:bipush          61
	//* 137  207:icmpne          221
					return stringbuffer.toString().getBytes("iso8859-1");
	//  138  210:aload           6
	//  139  212:invokevirtual   #154 <Method String StringBuffer.toString()>
	//  140  215:ldc1            #156 <String "iso8859-1">
	//  141  217:invokevirtual   #146 <Method byte[] String.getBytes(String)>
	//  142  220:areturn         
				byte0 = a[i];
	//  143  221:getstatic       #131 <Field byte[] a>
	//  144  224:iload_1         
	//  145  225:baload          
	//  146  226:istore          4
				if(j >= k)
					break;
	//  147  228:iload_2         
	//  148  229:iload_3         
	//  149  230:icmpge          241
				i = j;
	//  150  233:iload_2         
	//  151  234:istore_1        
			} while(byte0 == -1);
	//  152  235:iload           4
	//  153  237:iconst_m1       
	//  154  238:icmpeq          196
			if(byte0 == -1)
				break;
	//  155  241:iload           4
	//  156  243:iconst_m1       
	//  157  244:icmpeq          269
			stringbuffer.append((char)((byte1 & 3) << 6 | byte0));
	//  158  247:aload           6
	//  159  249:iload           5
	//  160  251:iconst_3        
	//  161  252:iand            
	//  162  253:bipush          6
	//  163  255:ishl            
	//  164  256:iload           4
	//  165  258:ior             
	//  166  259:int2char        
	//  167  260:invokevirtual   #150 <Method StringBuffer StringBuffer.append(char)>
	//  168  263:pop             
			i = j;
	//  169  264:iload_2         
	//  170  265:istore_1        
		} while(true);
	//  171  266:goto            21
		return stringbuffer.toString().getBytes("iso8859-1");
	//  172  269:aload           6
	//  173  271:invokevirtual   #154 <Method String StringBuffer.toString()>
	//  174  274:ldc1            #156 <String "iso8859-1">
	//  175  276:invokevirtual   #146 <Method byte[] String.getBytes(String)>
	//  176  279:areturn         
	}

	private static byte a[] = {
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
		-1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 
		54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
		-1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 
		5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
		15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
		25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 
		29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
		39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
		49, 50, 51, -1, -1, -1, -1, -1
	};
	private static char d[] = {
		'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
		'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
		'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 
		'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 
		'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
		'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', 
		'8', '9', '+', '/'
	};

	static 
	{
	//    0    0:bipush          64
	//    1    2:newarray        char[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #11  <Int 65>
	//    5    8:castore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #12  <Int 66>
	//    9   13:castore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #13  <Int 67>
	//   13   18:castore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #14  <Int 68>
	//   17   23:castore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #15  <Int 69>
	//   21   28:castore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #16  <Int 70>
	//   25   33:castore         
	//   26   34:dup             
	//   27   35:bipush          6
	//   28   37:ldc1            #17  <Int 71>
	//   29   39:castore         
	//   30   40:dup             
	//   31   41:bipush          7
	//   32   43:ldc1            #18  <Int 72>
	//   33   45:castore         
	//   34   46:dup             
	//   35   47:bipush          8
	//   36   49:ldc1            #19  <Int 73>
	//   37   51:castore         
	//   38   52:dup             
	//   39   53:bipush          9
	//   40   55:ldc1            #20  <Int 74>
	//   41   57:castore         
	//   42   58:dup             
	//   43   59:bipush          10
	//   44   61:ldc1            #21  <Int 75>
	//   45   63:castore         
	//   46   64:dup             
	//   47   65:bipush          11
	//   48   67:ldc1            #22  <Int 76>
	//   49   69:castore         
	//   50   70:dup             
	//   51   71:bipush          12
	//   52   73:ldc1            #23  <Int 77>
	//   53   75:castore         
	//   54   76:dup             
	//   55   77:bipush          13
	//   56   79:ldc1            #24  <Int 78>
	//   57   81:castore         
	//   58   82:dup             
	//   59   83:bipush          14
	//   60   85:ldc1            #25  <Int 79>
	//   61   87:castore         
	//   62   88:dup             
	//   63   89:bipush          15
	//   64   91:ldc1            #26  <Int 80>
	//   65   93:castore         
	//   66   94:dup             
	//   67   95:bipush          16
	//   68   97:ldc1            #27  <Int 81>
	//   69   99:castore         
	//   70  100:dup             
	//   71  101:bipush          17
	//   72  103:ldc1            #28  <Int 82>
	//   73  105:castore         
	//   74  106:dup             
	//   75  107:bipush          18
	//   76  109:ldc1            #29  <Int 83>
	//   77  111:castore         
	//   78  112:dup             
	//   79  113:bipush          19
	//   80  115:ldc1            #30  <Int 84>
	//   81  117:castore         
	//   82  118:dup             
	//   83  119:bipush          20
	//   84  121:ldc1            #31  <Int 85>
	//   85  123:castore         
	//   86  124:dup             
	//   87  125:bipush          21
	//   88  127:ldc1            #32  <Int 86>
	//   89  129:castore         
	//   90  130:dup             
	//   91  131:bipush          22
	//   92  133:ldc1            #33  <Int 87>
	//   93  135:castore         
	//   94  136:dup             
	//   95  137:bipush          23
	//   96  139:ldc1            #34  <Int 88>
	//   97  141:castore         
	//   98  142:dup             
	//   99  143:bipush          24
	//  100  145:ldc1            #35  <Int 89>
	//  101  147:castore         
	//  102  148:dup             
	//  103  149:bipush          25
	//  104  151:ldc1            #36  <Int 90>
	//  105  153:castore         
	//  106  154:dup             
	//  107  155:bipush          26
	//  108  157:ldc1            #37  <Int 97>
	//  109  159:castore         
	//  110  160:dup             
	//  111  161:bipush          27
	//  112  163:ldc1            #38  <Int 98>
	//  113  165:castore         
	//  114  166:dup             
	//  115  167:bipush          28
	//  116  169:ldc1            #39  <Int 99>
	//  117  171:castore         
	//  118  172:dup             
	//  119  173:bipush          29
	//  120  175:ldc1            #40  <Int 100>
	//  121  177:castore         
	//  122  178:dup             
	//  123  179:bipush          30
	//  124  181:ldc1            #41  <Int 101>
	//  125  183:castore         
	//  126  184:dup             
	//  127  185:bipush          31
	//  128  187:ldc1            #42  <Int 102>
	//  129  189:castore         
	//  130  190:dup             
	//  131  191:bipush          32
	//  132  193:ldc1            #43  <Int 103>
	//  133  195:castore         
	//  134  196:dup             
	//  135  197:bipush          33
	//  136  199:ldc1            #44  <Int 104>
	//  137  201:castore         
	//  138  202:dup             
	//  139  203:bipush          34
	//  140  205:ldc1            #45  <Int 105>
	//  141  207:castore         
	//  142  208:dup             
	//  143  209:bipush          35
	//  144  211:ldc1            #46  <Int 106>
	//  145  213:castore         
	//  146  214:dup             
	//  147  215:bipush          36
	//  148  217:ldc1            #47  <Int 107>
	//  149  219:castore         
	//  150  220:dup             
	//  151  221:bipush          37
	//  152  223:ldc1            #48  <Int 108>
	//  153  225:castore         
	//  154  226:dup             
	//  155  227:bipush          38
	//  156  229:ldc1            #49  <Int 109>
	//  157  231:castore         
	//  158  232:dup             
	//  159  233:bipush          39
	//  160  235:ldc1            #50  <Int 110>
	//  161  237:castore         
	//  162  238:dup             
	//  163  239:bipush          40
	//  164  241:ldc1            #51  <Int 111>
	//  165  243:castore         
	//  166  244:dup             
	//  167  245:bipush          41
	//  168  247:ldc1            #52  <Int 112>
	//  169  249:castore         
	//  170  250:dup             
	//  171  251:bipush          42
	//  172  253:ldc1            #53  <Int 113>
	//  173  255:castore         
	//  174  256:dup             
	//  175  257:bipush          43
	//  176  259:ldc1            #54  <Int 114>
	//  177  261:castore         
	//  178  262:dup             
	//  179  263:bipush          44
	//  180  265:ldc1            #55  <Int 115>
	//  181  267:castore         
	//  182  268:dup             
	//  183  269:bipush          45
	//  184  271:ldc1            #56  <Int 116>
	//  185  273:castore         
	//  186  274:dup             
	//  187  275:bipush          46
	//  188  277:ldc1            #57  <Int 117>
	//  189  279:castore         
	//  190  280:dup             
	//  191  281:bipush          47
	//  192  283:ldc1            #58  <Int 118>
	//  193  285:castore         
	//  194  286:dup             
	//  195  287:bipush          48
	//  196  289:ldc1            #59  <Int 119>
	//  197  291:castore         
	//  198  292:dup             
	//  199  293:bipush          49
	//  200  295:ldc1            #60  <Int 120>
	//  201  297:castore         
	//  202  298:dup             
	//  203  299:bipush          50
	//  204  301:ldc1            #61  <Int 121>
	//  205  303:castore         
	//  206  304:dup             
	//  207  305:bipush          51
	//  208  307:ldc1            #62  <Int 122>
	//  209  309:castore         
	//  210  310:dup             
	//  211  311:bipush          52
	//  212  313:ldc1            #63  <Int 48>
	//  213  315:castore         
	//  214  316:dup             
	//  215  317:bipush          53
	//  216  319:ldc1            #64  <Int 49>
	//  217  321:castore         
	//  218  322:dup             
	//  219  323:bipush          54
	//  220  325:ldc1            #65  <Int 50>
	//  221  327:castore         
	//  222  328:dup             
	//  223  329:bipush          55
	//  224  331:ldc1            #66  <Int 51>
	//  225  333:castore         
	//  226  334:dup             
	//  227  335:bipush          56
	//  228  337:ldc1            #67  <Int 52>
	//  229  339:castore         
	//  230  340:dup             
	//  231  341:bipush          57
	//  232  343:ldc1            #68  <Int 53>
	//  233  345:castore         
	//  234  346:dup             
	//  235  347:bipush          58
	//  236  349:ldc1            #69  <Int 54>
	//  237  351:castore         
	//  238  352:dup             
	//  239  353:bipush          59
	//  240  355:ldc1            #70  <Int 55>
	//  241  357:castore         
	//  242  358:dup             
	//  243  359:bipush          60
	//  244  361:ldc1            #71  <Int 56>
	//  245  363:castore         
	//  246  364:dup             
	//  247  365:bipush          61
	//  248  367:ldc1            #72  <Int 57>
	//  249  369:castore         
	//  250  370:dup             
	//  251  371:bipush          62
	//  252  373:ldc1            #73  <Int 43>
	//  253  375:castore         
	//  254  376:dup             
	//  255  377:bipush          63
	//  256  379:ldc1            #74  <Int 47>
	//  257  381:castore         
	//  258  382:putstatic       #76  <Field char[] d>
	//  259  385:sipush          128
	//  260  388:newarray        byte[]
	//  261  390:dup             
	//  262  391:iconst_0        
	//  263  392:ldc1            #77  <Int -1>
	//  264  394:bastore         
	//  265  395:dup             
	//  266  396:iconst_1        
	//  267  397:ldc1            #77  <Int -1>
	//  268  399:bastore         
	//  269  400:dup             
	//  270  401:iconst_2        
	//  271  402:ldc1            #77  <Int -1>
	//  272  404:bastore         
	//  273  405:dup             
	//  274  406:iconst_3        
	//  275  407:ldc1            #77  <Int -1>
	//  276  409:bastore         
	//  277  410:dup             
	//  278  411:iconst_4        
	//  279  412:ldc1            #77  <Int -1>
	//  280  414:bastore         
	//  281  415:dup             
	//  282  416:iconst_5        
	//  283  417:ldc1            #77  <Int -1>
	//  284  419:bastore         
	//  285  420:dup             
	//  286  421:bipush          6
	//  287  423:ldc1            #77  <Int -1>
	//  288  425:bastore         
	//  289  426:dup             
	//  290  427:bipush          7
	//  291  429:ldc1            #77  <Int -1>
	//  292  431:bastore         
	//  293  432:dup             
	//  294  433:bipush          8
	//  295  435:ldc1            #77  <Int -1>
	//  296  437:bastore         
	//  297  438:dup             
	//  298  439:bipush          9
	//  299  441:ldc1            #77  <Int -1>
	//  300  443:bastore         
	//  301  444:dup             
	//  302  445:bipush          10
	//  303  447:ldc1            #77  <Int -1>
	//  304  449:bastore         
	//  305  450:dup             
	//  306  451:bipush          11
	//  307  453:ldc1            #77  <Int -1>
	//  308  455:bastore         
	//  309  456:dup             
	//  310  457:bipush          12
	//  311  459:ldc1            #77  <Int -1>
	//  312  461:bastore         
	//  313  462:dup             
	//  314  463:bipush          13
	//  315  465:ldc1            #77  <Int -1>
	//  316  467:bastore         
	//  317  468:dup             
	//  318  469:bipush          14
	//  319  471:ldc1            #77  <Int -1>
	//  320  473:bastore         
	//  321  474:dup             
	//  322  475:bipush          15
	//  323  477:ldc1            #77  <Int -1>
	//  324  479:bastore         
	//  325  480:dup             
	//  326  481:bipush          16
	//  327  483:ldc1            #77  <Int -1>
	//  328  485:bastore         
	//  329  486:dup             
	//  330  487:bipush          17
	//  331  489:ldc1            #77  <Int -1>
	//  332  491:bastore         
	//  333  492:dup             
	//  334  493:bipush          18
	//  335  495:ldc1            #77  <Int -1>
	//  336  497:bastore         
	//  337  498:dup             
	//  338  499:bipush          19
	//  339  501:ldc1            #77  <Int -1>
	//  340  503:bastore         
	//  341  504:dup             
	//  342  505:bipush          20
	//  343  507:ldc1            #77  <Int -1>
	//  344  509:bastore         
	//  345  510:dup             
	//  346  511:bipush          21
	//  347  513:ldc1            #77  <Int -1>
	//  348  515:bastore         
	//  349  516:dup             
	//  350  517:bipush          22
	//  351  519:ldc1            #77  <Int -1>
	//  352  521:bastore         
	//  353  522:dup             
	//  354  523:bipush          23
	//  355  525:ldc1            #77  <Int -1>
	//  356  527:bastore         
	//  357  528:dup             
	//  358  529:bipush          24
	//  359  531:ldc1            #77  <Int -1>
	//  360  533:bastore         
	//  361  534:dup             
	//  362  535:bipush          25
	//  363  537:ldc1            #77  <Int -1>
	//  364  539:bastore         
	//  365  540:dup             
	//  366  541:bipush          26
	//  367  543:ldc1            #77  <Int -1>
	//  368  545:bastore         
	//  369  546:dup             
	//  370  547:bipush          27
	//  371  549:ldc1            #77  <Int -1>
	//  372  551:bastore         
	//  373  552:dup             
	//  374  553:bipush          28
	//  375  555:ldc1            #77  <Int -1>
	//  376  557:bastore         
	//  377  558:dup             
	//  378  559:bipush          29
	//  379  561:ldc1            #77  <Int -1>
	//  380  563:bastore         
	//  381  564:dup             
	//  382  565:bipush          30
	//  383  567:ldc1            #77  <Int -1>
	//  384  569:bastore         
	//  385  570:dup             
	//  386  571:bipush          31
	//  387  573:ldc1            #77  <Int -1>
	//  388  575:bastore         
	//  389  576:dup             
	//  390  577:bipush          32
	//  391  579:ldc1            #77  <Int -1>
	//  392  581:bastore         
	//  393  582:dup             
	//  394  583:bipush          33
	//  395  585:ldc1            #77  <Int -1>
	//  396  587:bastore         
	//  397  588:dup             
	//  398  589:bipush          34
	//  399  591:ldc1            #77  <Int -1>
	//  400  593:bastore         
	//  401  594:dup             
	//  402  595:bipush          35
	//  403  597:ldc1            #77  <Int -1>
	//  404  599:bastore         
	//  405  600:dup             
	//  406  601:bipush          36
	//  407  603:ldc1            #77  <Int -1>
	//  408  605:bastore         
	//  409  606:dup             
	//  410  607:bipush          37
	//  411  609:ldc1            #77  <Int -1>
	//  412  611:bastore         
	//  413  612:dup             
	//  414  613:bipush          38
	//  415  615:ldc1            #77  <Int -1>
	//  416  617:bastore         
	//  417  618:dup             
	//  418  619:bipush          39
	//  419  621:ldc1            #77  <Int -1>
	//  420  623:bastore         
	//  421  624:dup             
	//  422  625:bipush          40
	//  423  627:ldc1            #77  <Int -1>
	//  424  629:bastore         
	//  425  630:dup             
	//  426  631:bipush          41
	//  427  633:ldc1            #77  <Int -1>
	//  428  635:bastore         
	//  429  636:dup             
	//  430  637:bipush          42
	//  431  639:ldc1            #77  <Int -1>
	//  432  641:bastore         
	//  433  642:dup             
	//  434  643:bipush          43
	//  435  645:ldc1            #78  <Int 62>
	//  436  647:bastore         
	//  437  648:dup             
	//  438  649:bipush          44
	//  439  651:ldc1            #77  <Int -1>
	//  440  653:bastore         
	//  441  654:dup             
	//  442  655:bipush          45
	//  443  657:ldc1            #77  <Int -1>
	//  444  659:bastore         
	//  445  660:dup             
	//  446  661:bipush          46
	//  447  663:ldc1            #77  <Int -1>
	//  448  665:bastore         
	//  449  666:dup             
	//  450  667:bipush          47
	//  451  669:ldc1            #79  <Int 63>
	//  452  671:bastore         
	//  453  672:dup             
	//  454  673:bipush          48
	//  455  675:ldc1            #67  <Int 52>
	//  456  677:bastore         
	//  457  678:dup             
	//  458  679:bipush          49
	//  459  681:ldc1            #68  <Int 53>
	//  460  683:bastore         
	//  461  684:dup             
	//  462  685:bipush          50
	//  463  687:ldc1            #69  <Int 54>
	//  464  689:bastore         
	//  465  690:dup             
	//  466  691:bipush          51
	//  467  693:ldc1            #70  <Int 55>
	//  468  695:bastore         
	//  469  696:dup             
	//  470  697:bipush          52
	//  471  699:ldc1            #71  <Int 56>
	//  472  701:bastore         
	//  473  702:dup             
	//  474  703:bipush          53
	//  475  705:ldc1            #72  <Int 57>
	//  476  707:bastore         
	//  477  708:dup             
	//  478  709:bipush          54
	//  479  711:ldc1            #80  <Int 58>
	//  480  713:bastore         
	//  481  714:dup             
	//  482  715:bipush          55
	//  483  717:ldc1            #81  <Int 59>
	//  484  719:bastore         
	//  485  720:dup             
	//  486  721:bipush          56
	//  487  723:ldc1            #82  <Int 60>
	//  488  725:bastore         
	//  489  726:dup             
	//  490  727:bipush          57
	//  491  729:ldc1            #83  <Int 61>
	//  492  731:bastore         
	//  493  732:dup             
	//  494  733:bipush          58
	//  495  735:ldc1            #77  <Int -1>
	//  496  737:bastore         
	//  497  738:dup             
	//  498  739:bipush          59
	//  499  741:ldc1            #77  <Int -1>
	//  500  743:bastore         
	//  501  744:dup             
	//  502  745:bipush          60
	//  503  747:ldc1            #77  <Int -1>
	//  504  749:bastore         
	//  505  750:dup             
	//  506  751:bipush          61
	//  507  753:ldc1            #77  <Int -1>
	//  508  755:bastore         
	//  509  756:dup             
	//  510  757:bipush          62
	//  511  759:ldc1            #77  <Int -1>
	//  512  761:bastore         
	//  513  762:dup             
	//  514  763:bipush          63
	//  515  765:ldc1            #77  <Int -1>
	//  516  767:bastore         
	//  517  768:dup             
	//  518  769:bipush          64
	//  519  771:ldc1            #77  <Int -1>
	//  520  773:bastore         
	//  521  774:dup             
	//  522  775:bipush          65
	//  523  777:ldc1            #84  <Int 0>
	//  524  779:bastore         
	//  525  780:dup             
	//  526  781:bipush          66
	//  527  783:ldc1            #85  <Int 1>
	//  528  785:bastore         
	//  529  786:dup             
	//  530  787:bipush          67
	//  531  789:ldc1            #86  <Int 2>
	//  532  791:bastore         
	//  533  792:dup             
	//  534  793:bipush          68
	//  535  795:ldc1            #87  <Int 3>
	//  536  797:bastore         
	//  537  798:dup             
	//  538  799:bipush          69
	//  539  801:ldc1            #88  <Int 4>
	//  540  803:bastore         
	//  541  804:dup             
	//  542  805:bipush          70
	//  543  807:ldc1            #89  <Int 5>
	//  544  809:bastore         
	//  545  810:dup             
	//  546  811:bipush          71
	//  547  813:ldc1            #90  <Int 6>
	//  548  815:bastore         
	//  549  816:dup             
	//  550  817:bipush          72
	//  551  819:ldc1            #91  <Int 7>
	//  552  821:bastore         
	//  553  822:dup             
	//  554  823:bipush          73
	//  555  825:ldc1            #92  <Int 8>
	//  556  827:bastore         
	//  557  828:dup             
	//  558  829:bipush          74
	//  559  831:ldc1            #93  <Int 9>
	//  560  833:bastore         
	//  561  834:dup             
	//  562  835:bipush          75
	//  563  837:ldc1            #94  <Int 10>
	//  564  839:bastore         
	//  565  840:dup             
	//  566  841:bipush          76
	//  567  843:ldc1            #95  <Int 11>
	//  568  845:bastore         
	//  569  846:dup             
	//  570  847:bipush          77
	//  571  849:ldc1            #96  <Int 12>
	//  572  851:bastore         
	//  573  852:dup             
	//  574  853:bipush          78
	//  575  855:ldc1            #97  <Int 13>
	//  576  857:bastore         
	//  577  858:dup             
	//  578  859:bipush          79
	//  579  861:ldc1            #98  <Int 14>
	//  580  863:bastore         
	//  581  864:dup             
	//  582  865:bipush          80
	//  583  867:ldc1            #99  <Int 15>
	//  584  869:bastore         
	//  585  870:dup             
	//  586  871:bipush          81
	//  587  873:ldc1            #100 <Int 16>
	//  588  875:bastore         
	//  589  876:dup             
	//  590  877:bipush          82
	//  591  879:ldc1            #101 <Int 17>
	//  592  881:bastore         
	//  593  882:dup             
	//  594  883:bipush          83
	//  595  885:ldc1            #102 <Int 18>
	//  596  887:bastore         
	//  597  888:dup             
	//  598  889:bipush          84
	//  599  891:ldc1            #103 <Int 19>
	//  600  893:bastore         
	//  601  894:dup             
	//  602  895:bipush          85
	//  603  897:ldc1            #104 <Int 20>
	//  604  899:bastore         
	//  605  900:dup             
	//  606  901:bipush          86
	//  607  903:ldc1            #105 <Int 21>
	//  608  905:bastore         
	//  609  906:dup             
	//  610  907:bipush          87
	//  611  909:ldc1            #106 <Int 22>
	//  612  911:bastore         
	//  613  912:dup             
	//  614  913:bipush          88
	//  615  915:ldc1            #107 <Int 23>
	//  616  917:bastore         
	//  617  918:dup             
	//  618  919:bipush          89
	//  619  921:ldc1            #108 <Int 24>
	//  620  923:bastore         
	//  621  924:dup             
	//  622  925:bipush          90
	//  623  927:ldc1            #109 <Int 25>
	//  624  929:bastore         
	//  625  930:dup             
	//  626  931:bipush          91
	//  627  933:ldc1            #77  <Int -1>
	//  628  935:bastore         
	//  629  936:dup             
	//  630  937:bipush          92
	//  631  939:ldc1            #77  <Int -1>
	//  632  941:bastore         
	//  633  942:dup             
	//  634  943:bipush          93
	//  635  945:ldc1            #77  <Int -1>
	//  636  947:bastore         
	//  637  948:dup             
	//  638  949:bipush          94
	//  639  951:ldc1            #77  <Int -1>
	//  640  953:bastore         
	//  641  954:dup             
	//  642  955:bipush          95
	//  643  957:ldc1            #77  <Int -1>
	//  644  959:bastore         
	//  645  960:dup             
	//  646  961:bipush          96
	//  647  963:ldc1            #77  <Int -1>
	//  648  965:bastore         
	//  649  966:dup             
	//  650  967:bipush          97
	//  651  969:ldc1            #110 <Int 26>
	//  652  971:bastore         
	//  653  972:dup             
	//  654  973:bipush          98
	//  655  975:ldc1            #111 <Int 27>
	//  656  977:bastore         
	//  657  978:dup             
	//  658  979:bipush          99
	//  659  981:ldc1            #112 <Int 28>
	//  660  983:bastore         
	//  661  984:dup             
	//  662  985:bipush          100
	//  663  987:ldc1            #113 <Int 29>
	//  664  989:bastore         
	//  665  990:dup             
	//  666  991:bipush          101
	//  667  993:ldc1            #114 <Int 30>
	//  668  995:bastore         
	//  669  996:dup             
	//  670  997:bipush          102
	//  671  999:ldc1            #115 <Int 31>
	//  672 1001:bastore         
	//  673 1002:dup             
	//  674 1003:bipush          103
	//  675 1005:ldc1            #116 <Int 32>
	//  676 1007:bastore         
	//  677 1008:dup             
	//  678 1009:bipush          104
	//  679 1011:ldc1            #117 <Int 33>
	//  680 1013:bastore         
	//  681 1014:dup             
	//  682 1015:bipush          105
	//  683 1017:ldc1            #118 <Int 34>
	//  684 1019:bastore         
	//  685 1020:dup             
	//  686 1021:bipush          106
	//  687 1023:ldc1            #119 <Int 35>
	//  688 1025:bastore         
	//  689 1026:dup             
	//  690 1027:bipush          107
	//  691 1029:ldc1            #120 <Int 36>
	//  692 1031:bastore         
	//  693 1032:dup             
	//  694 1033:bipush          108
	//  695 1035:ldc1            #121 <Int 37>
	//  696 1037:bastore         
	//  697 1038:dup             
	//  698 1039:bipush          109
	//  699 1041:ldc1            #122 <Int 38>
	//  700 1043:bastore         
	//  701 1044:dup             
	//  702 1045:bipush          110
	//  703 1047:ldc1            #123 <Int 39>
	//  704 1049:bastore         
	//  705 1050:dup             
	//  706 1051:bipush          111
	//  707 1053:ldc1            #124 <Int 40>
	//  708 1055:bastore         
	//  709 1056:dup             
	//  710 1057:bipush          112
	//  711 1059:ldc1            #125 <Int 41>
	//  712 1061:bastore         
	//  713 1062:dup             
	//  714 1063:bipush          113
	//  715 1065:ldc1            #126 <Int 42>
	//  716 1067:bastore         
	//  717 1068:dup             
	//  718 1069:bipush          114
	//  719 1071:ldc1            #73  <Int 43>
	//  720 1073:bastore         
	//  721 1074:dup             
	//  722 1075:bipush          115
	//  723 1077:ldc1            #127 <Int 44>
	//  724 1079:bastore         
	//  725 1080:dup             
	//  726 1081:bipush          116
	//  727 1083:ldc1            #128 <Int 45>
	//  728 1085:bastore         
	//  729 1086:dup             
	//  730 1087:bipush          117
	//  731 1089:ldc1            #129 <Int 46>
	//  732 1091:bastore         
	//  733 1092:dup             
	//  734 1093:bipush          118
	//  735 1095:ldc1            #74  <Int 47>
	//  736 1097:bastore         
	//  737 1098:dup             
	//  738 1099:bipush          119
	//  739 1101:ldc1            #63  <Int 48>
	//  740 1103:bastore         
	//  741 1104:dup             
	//  742 1105:bipush          120
	//  743 1107:ldc1            #64  <Int 49>
	//  744 1109:bastore         
	//  745 1110:dup             
	//  746 1111:bipush          121
	//  747 1113:ldc1            #65  <Int 50>
	//  748 1115:bastore         
	//  749 1116:dup             
	//  750 1117:bipush          122
	//  751 1119:ldc1            #66  <Int 51>
	//  752 1121:bastore         
	//  753 1122:dup             
	//  754 1123:bipush          123
	//  755 1125:ldc1            #77  <Int -1>
	//  756 1127:bastore         
	//  757 1128:dup             
	//  758 1129:bipush          124
	//  759 1131:ldc1            #77  <Int -1>
	//  760 1133:bastore         
	//  761 1134:dup             
	//  762 1135:bipush          125
	//  763 1137:ldc1            #77  <Int -1>
	//  764 1139:bastore         
	//  765 1140:dup             
	//  766 1141:bipush          126
	//  767 1143:ldc1            #77  <Int -1>
	//  768 1145:bastore         
	//  769 1146:dup             
	//  770 1147:bipush          127
	//  771 1149:ldc1            #77  <Int -1>
	//  772 1151:bastore         
	//  773 1152:putstatic       #131 <Field byte[] a>
	//* 774 1155:return          
	}
}
