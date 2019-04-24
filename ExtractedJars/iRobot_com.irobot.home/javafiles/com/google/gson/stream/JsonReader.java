// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.*;

// Referenced classes of package com.google.gson.stream:
//			MalformedJsonException, JsonToken

public class JsonReader
	implements Closeable
{

	public JsonReader(Reader reader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method void Object()>
		lenient = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #105 <Field boolean lenient>
	//    5    9:aload_0         
	//    6   10:sipush          1024
	//    7   13:newarray        char[]
	//    8   15:putfield        #107 <Field char[] buffer>
		pos = 0;
	//    9   18:aload_0         
	//   10   19:iconst_0        
	//   11   20:putfield        #109 <Field int pos>
		limit = 0;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #111 <Field int limit>
		lineNumber = 0;
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:putfield        #113 <Field int lineNumber>
		lineStart = 0;
	//   18   33:aload_0         
	//   19   34:iconst_0        
	//   20   35:putfield        #115 <Field int lineStart>
		peeked = 0;
	//   21   38:aload_0         
	//   22   39:iconst_0        
	//   23   40:putfield        #117 <Field int peeked>
		stack = new int[32];
	//   24   43:aload_0         
	//   25   44:bipush          32
	//   26   46:newarray        int[]
	//   27   48:putfield        #119 <Field int[] stack>
		stackSize = 0;
	//   28   51:aload_0         
	//   29   52:iconst_0        
	//   30   53:putfield        #121 <Field int stackSize>
		int ai[] = stack;
	//   31   56:aload_0         
	//   32   57:getfield        #119 <Field int[] stack>
	//   33   60:astore_3        
		int i = stackSize;
	//   34   61:aload_0         
	//   35   62:getfield        #121 <Field int stackSize>
	//   36   65:istore_2        
		stackSize = i + 1;
	//   37   66:aload_0         
	//   38   67:iload_2         
	//   39   68:iconst_1        
	//   40   69:iadd            
	//   41   70:putfield        #121 <Field int stackSize>
		ai[i] = 6;
	//   42   73:aload_3         
	//   43   74:iload_2         
	//   44   75:bipush          6
	//   45   77:iastore         
		pathNames = new String[32];
	//   46   78:aload_0         
	//   47   79:bipush          32
	//   48   81:anewarray       String[]
	//   49   84:putfield        #123 <Field String[] pathNames>
		pathIndices = new int[32];
	//   50   87:aload_0         
	//   51   88:bipush          32
	//   52   90:newarray        int[]
	//   53   92:putfield        #125 <Field int[] pathIndices>
		if(reader == null)
	//*  54   95:aload_1         
	//*  55   96:ifnonnull       109
		{
			throw new NullPointerException("in == null");
	//   56   99:new             #127 <Class NullPointerException>
	//   57  102:dup             
	//   58  103:ldc1            #129 <String "in == null">
	//   59  105:invokespecial   #132 <Method void NullPointerException(String)>
	//   60  108:athrow          
		} else
		{
			in = reader;
	//   61  109:aload_0         
	//   62  110:aload_1         
	//   63  111:putfield        #134 <Field Reader in>
			return;
	//   64  114:return          
		}
	}

	private void checkLenient()
	{
		if(!lenient)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field boolean lenient>
	//*   2    4:ifne            14
			throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
	//    3    7:aload_0         
	//    4    8:ldc1            #154 <String "Use JsonReader.setLenient(true) to accept malformed JSON">
	//    5   10:invokespecial   #158 <Method IOException syntaxError(String)>
	//    6   13:athrow          
		else
			return;
	//    7   14:return          
	}

	private void consumeNonExecutePrefix()
	{
		nextNonWhitespace(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #163 <Method int nextNonWhitespace(boolean)>
	//    3    5:pop             
		pos = pos - 1;
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #109 <Field int pos>
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:putfield        #109 <Field int pos>
		if(pos + NON_EXECUTE_PREFIX.length > limit && !fillBuffer(NON_EXECUTE_PREFIX.length))
	//*  10   16:aload_0         
	//*  11   17:getfield        #109 <Field int pos>
	//*  12   20:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//*  13   23:arraylength     
	//*  14   24:iadd            
	//*  15   25:aload_0         
	//*  16   26:getfield        #111 <Field int limit>
	//*  17   29:icmple          44
	//*  18   32:aload_0         
	//*  19   33:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//*  20   36:arraylength     
	//*  21   37:invokespecial   #167 <Method boolean fillBuffer(int)>
	//*  22   40:ifne            44
			return;
	//   23   43:return          
		for(int i = 0; i < NON_EXECUTE_PREFIX.length; i++)
	//*  24   44:iconst_0        
	//*  25   45:istore_1        
	//*  26   46:iload_1         
	//*  27   47:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//*  28   50:arraylength     
	//*  29   51:icmpge          81
			if(buffer[pos + i] != NON_EXECUTE_PREFIX[i])
	//*  30   54:aload_0         
	//*  31   55:getfield        #107 <Field char[] buffer>
	//*  32   58:aload_0         
	//*  33   59:getfield        #109 <Field int pos>
	//*  34   62:iload_1         
	//*  35   63:iadd            
	//*  36   64:caload          
	//*  37   65:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//*  38   68:iload_1         
	//*  39   69:caload          
	//*  40   70:icmpeq          74
				return;
	//   41   73:return          

	//   42   74:iload_1         
	//   43   75:iconst_1        
	//   44   76:iadd            
	//   45   77:istore_1        
	//*  46   78:goto            46
		pos = pos + NON_EXECUTE_PREFIX.length;
	//   47   81:aload_0         
	//   48   82:aload_0         
	//   49   83:getfield        #109 <Field int pos>
	//   50   86:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//   51   89:arraylength     
	//   52   90:iadd            
	//   53   91:putfield        #109 <Field int pos>
	//   54   94:return          
	}

	private int doPeek()
	{
		int k = stack[stackSize - 1];
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int[] stack>
	//    2    4:aload_0         
	//    3    5:getfield        #121 <Field int stackSize>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:iaload          
	//    7   11:istore_2        
		if(k != 1) goto _L2; else goto _L1
	//    8   12:iload_2         
	//    9   13:iconst_1        
	//   10   14:icmpne          32
_L1:
		stack[stackSize - 1] = 2;
	//   11   17:aload_0         
	//   12   18:getfield        #119 <Field int[] stack>
	//   13   21:aload_0         
	//   14   22:getfield        #121 <Field int stackSize>
	//   15   25:iconst_1        
	//   16   26:isub            
	//   17   27:iconst_2        
	//   18   28:iastore         
		  goto _L3
	//*  19   29:goto            277
_L2:
		if(k != 2) goto _L5; else goto _L4
	//   20   32:iload_2         
	//   21   33:iconst_2        
	//   22   34:icmpne          82
_L4:
		int i = nextNonWhitespace(true);
	//   23   37:aload_0         
	//   24   38:iconst_1        
	//   25   39:invokespecial   #163 <Method int nextNonWhitespace(boolean)>
	//   26   42:istore_1        
		if(i != 44)
	//*  27   43:iload_1         
	//*  28   44:bipush          44
	//*  29   46:icmpeq          277
		{
			if(i != 59)
	//*  30   49:iload_1         
	//*  31   50:bipush          59
	//*  32   52:icmpeq          75
				if(i != 93)
	//*  33   55:iload_1         
	//*  34   56:bipush          93
	//*  35   58:icmpeq          68
				{
					throw syntaxError("Unterminated array");
	//   36   61:aload_0         
	//   37   62:ldc1            #169 <String "Unterminated array">
	//   38   64:invokespecial   #158 <Method IOException syntaxError(String)>
	//   39   67:athrow          
				} else
				{
					peeked = 4;
	//   40   68:aload_0         
	//   41   69:iconst_4        
	//   42   70:putfield        #117 <Field int peeked>
					return 4;
	//   43   73:iconst_4        
	//   44   74:ireturn         
				}
			checkLenient();
	//   45   75:aload_0         
	//   46   76:invokespecial   #171 <Method void checkLenient()>
		}
		  goto _L3
	//*  47   79:goto            277
_L5:
		if(k != 3 && k != 5) goto _L7; else goto _L6
	//   48   82:iload_2         
	//   49   83:iconst_3        
	//   50   84:icmpeq          502
	//   51   87:iload_2         
	//   52   88:iconst_5        
	//   53   89:icmpne          95
	//*  54   92:goto            502
_L7:
		if(k != 4) goto _L9; else goto _L8
	//   55   95:iload_2         
	//   56   96:iconst_4        
	//   57   97:icmpne          184
_L8:
		int j;
		stack[stackSize - 1] = 5;
	//   58  100:aload_0         
	//   59  101:getfield        #119 <Field int[] stack>
	//   60  104:aload_0         
	//   61  105:getfield        #121 <Field int stackSize>
	//   62  108:iconst_1        
	//   63  109:isub            
	//   64  110:iconst_5        
	//   65  111:iastore         
		j = nextNonWhitespace(true);
	//   66  112:aload_0         
	//   67  113:iconst_1        
	//   68  114:invokespecial   #163 <Method int nextNonWhitespace(boolean)>
	//   69  117:istore_1        
		if(j == 58) goto _L3; else goto _L10
	//   70  118:iload_1         
	//   71  119:bipush          58
	//   72  121:icmpeq          277
_L10:
		if(j != 61)
	//*  73  124:iload_1         
	//*  74  125:bipush          61
	//*  75  127:icmpeq          137
			throw syntaxError("Expected ':'");
	//   76  130:aload_0         
	//   77  131:ldc1            #173 <String "Expected ':'">
	//   78  133:invokespecial   #158 <Method IOException syntaxError(String)>
	//   79  136:athrow          
		checkLenient();
	//   80  137:aload_0         
	//   81  138:invokespecial   #171 <Method void checkLenient()>
		if(pos >= limit && !fillBuffer(1) || buffer[pos] != '>') goto _L3; else goto _L11
	//   82  141:aload_0         
	//   83  142:getfield        #109 <Field int pos>
	//   84  145:aload_0         
	//   85  146:getfield        #111 <Field int limit>
	//   86  149:icmplt          160
	//   87  152:aload_0         
	//   88  153:iconst_1        
	//   89  154:invokespecial   #167 <Method boolean fillBuffer(int)>
	//   90  157:ifeq            277
	//   91  160:aload_0         
	//   92  161:getfield        #107 <Field char[] buffer>
	//   93  164:aload_0         
	//   94  165:getfield        #109 <Field int pos>
	//   95  168:caload          
	//   96  169:bipush          62
	//   97  171:icmpne          277
_L11:
		j = pos + 1;
	//   98  174:aload_0         
	//   99  175:getfield        #109 <Field int pos>
	//  100  178:iconst_1        
	//  101  179:iadd            
	//  102  180:istore_1        
		  goto _L12
	//* 103  181:goto            253
_L9:
		if(k != 6) goto _L14; else goto _L13
	//  104  184:iload_2         
	//  105  185:bipush          6
	//  106  187:icmpne          217
_L13:
		if(lenient)
	//* 107  190:aload_0         
	//* 108  191:getfield        #105 <Field boolean lenient>
	//* 109  194:ifeq            201
			consumeNonExecutePrefix();
	//  110  197:aload_0         
	//  111  198:invokespecial   #175 <Method void consumeNonExecutePrefix()>
		stack[stackSize - 1] = 7;
	//  112  201:aload_0         
	//  113  202:getfield        #119 <Field int[] stack>
	//  114  205:aload_0         
	//  115  206:getfield        #121 <Field int stackSize>
	//  116  209:iconst_1        
	//  117  210:isub            
	//  118  211:bipush          7
	//  119  213:iastore         
		  goto _L3
	//* 120  214:goto            277
_L14:
		if(k != 7) goto _L16; else goto _L15
	//  121  217:iload_2         
	//  122  218:bipush          7
	//  123  220:icmpne          261
_L15:
		if(nextNonWhitespace(false) != -1) goto _L18; else goto _L17
	//  124  223:aload_0         
	//  125  224:iconst_0        
	//  126  225:invokespecial   #163 <Method int nextNonWhitespace(boolean)>
	//  127  228:iconst_m1       
	//  128  229:icmpne          242
_L17:
		j = 17;
	//  129  232:bipush          17
	//  130  234:istore_1        
_L20:
		peeked = j;
	//  131  235:aload_0         
	//  132  236:iload_1         
	//  133  237:putfield        #117 <Field int peeked>
		return j;
	//  134  240:iload_1         
	//  135  241:ireturn         
_L18:
		checkLenient();
	//  136  242:aload_0         
	//  137  243:invokespecial   #171 <Method void checkLenient()>
		j = pos - 1;
	//  138  246:aload_0         
	//  139  247:getfield        #109 <Field int pos>
	//  140  250:iconst_1        
	//  141  251:isub            
	//  142  252:istore_1        
_L12:
		pos = j;
	//  143  253:aload_0         
	//  144  254:iload_1         
	//  145  255:putfield        #109 <Field int pos>
		  goto _L3
	//* 146  258:goto            277
_L16:
		if(k == 8)
	//* 147  261:iload_2         
	//* 148  262:bipush          8
	//* 149  264:icmpne          277
			throw new IllegalStateException("JsonReader is closed");
	//  150  267:new             #177 <Class IllegalStateException>
	//  151  270:dup             
	//  152  271:ldc1            #179 <String "JsonReader is closed">
	//  153  273:invokespecial   #180 <Method void IllegalStateException(String)>
	//  154  276:athrow          
_L3:
		j = nextNonWhitespace(true);
	//  155  277:aload_0         
	//  156  278:iconst_1        
	//  157  279:invokespecial   #163 <Method int nextNonWhitespace(boolean)>
	//  158  282:istore_1        
		if(j != 34)
	//* 159  283:iload_1         
	//* 160  284:bipush          34
	//* 161  286:icmpeq          484
			if(j != 39)
	//* 162  289:iload_1         
	//* 163  290:bipush          39
	//* 164  292:icmpeq          471
			{
				if(j != 44 && j != 59)
	//* 165  295:iload_1         
	//* 166  296:bipush          44
	//* 167  298:icmpeq          428
	//* 168  301:iload_1         
	//* 169  302:bipush          59
	//* 170  304:icmpeq          428
					if(j != 91)
	//* 171  307:iload_1         
	//* 172  308:bipush          91
	//* 173  310:icmpeq          421
					{
						if(j != 93)
	//* 174  313:iload_1         
	//* 175  314:bipush          93
	//* 176  316:icmpeq          409
						{
							if(j != 123)
	//* 177  319:iload_1         
	//* 178  320:bipush          123
	//* 179  322:icmpeq          402
							{
								pos = pos - 1;
	//  180  325:aload_0         
	//  181  326:aload_0         
	//  182  327:getfield        #109 <Field int pos>
	//  183  330:iconst_1        
	//  184  331:isub            
	//  185  332:putfield        #109 <Field int pos>
								if(stackSize == 1)
	//* 186  335:aload_0         
	//* 187  336:getfield        #121 <Field int stackSize>
	//* 188  339:iconst_1        
	//* 189  340:icmpne          347
									checkLenient();
	//  190  343:aload_0         
	//  191  344:invokespecial   #171 <Method void checkLenient()>
								j = peekKeyword();
	//  192  347:aload_0         
	//  193  348:invokespecial   #183 <Method int peekKeyword()>
	//  194  351:istore_1        
								if(j != 0)
	//* 195  352:iload_1         
	//* 196  353:ifeq            358
									return j;
	//  197  356:iload_1         
	//  198  357:ireturn         
								j = peekNumber();
	//  199  358:aload_0         
	//  200  359:invokespecial   #186 <Method int peekNumber()>
	//  201  362:istore_1        
								if(j != 0)
	//* 202  363:iload_1         
	//* 203  364:ifeq            369
									return j;
	//  204  367:iload_1         
	//  205  368:ireturn         
								if(!isLiteral(buffer[pos]))
	//* 206  369:aload_0         
	//* 207  370:aload_0         
	//* 208  371:getfield        #107 <Field char[] buffer>
	//* 209  374:aload_0         
	//* 210  375:getfield        #109 <Field int pos>
	//* 211  378:caload          
	//* 212  379:invokespecial   #190 <Method boolean isLiteral(char)>
	//* 213  382:ifne            392
									throw syntaxError("Expected value");
	//  214  385:aload_0         
	//  215  386:ldc1            #192 <String "Expected value">
	//  216  388:invokespecial   #158 <Method IOException syntaxError(String)>
	//  217  391:athrow          
								checkLenient();
	//  218  392:aload_0         
	//  219  393:invokespecial   #171 <Method void checkLenient()>
								j = 10;
	//  220  396:bipush          10
	//  221  398:istore_1        
							} else
	//* 222  399:goto            235
							{
								peeked = 1;
	//  223  402:aload_0         
	//  224  403:iconst_1        
	//  225  404:putfield        #117 <Field int peeked>
								return 1;
	//  226  407:iconst_1        
	//  227  408:ireturn         
							}
							continue; /* Loop/switch isn't completed */
						}
						if(k == 1)
	//* 228  409:iload_2         
	//* 229  410:iconst_1        
	//* 230  411:icmpne          428
						{
							peeked = 4;
	//  231  414:aload_0         
	//  232  415:iconst_4        
	//  233  416:putfield        #117 <Field int peeked>
							return 4;
	//  234  419:iconst_4        
	//  235  420:ireturn         
						}
					} else
					{
						peeked = 3;
	//  236  421:aload_0         
	//  237  422:iconst_3        
	//  238  423:putfield        #117 <Field int peeked>
						return 3;
	//  239  426:iconst_3        
	//  240  427:ireturn         
					}
				if(k != 1 && k != 2)
	//* 241  428:iload_2         
	//* 242  429:iconst_1        
	//* 243  430:icmpeq          448
	//* 244  433:iload_2         
	//* 245  434:iconst_2        
	//* 246  435:icmpne          441
	//* 247  438:goto            448
				{
					throw syntaxError("Unexpected value");
	//  248  441:aload_0         
	//  249  442:ldc1            #194 <String "Unexpected value">
	//  250  444:invokespecial   #158 <Method IOException syntaxError(String)>
	//  251  447:athrow          
				} else
				{
					checkLenient();
	//  252  448:aload_0         
	//  253  449:invokespecial   #171 <Method void checkLenient()>
					pos = pos - 1;
	//  254  452:aload_0         
	//  255  453:aload_0         
	//  256  454:getfield        #109 <Field int pos>
	//  257  457:iconst_1        
	//  258  458:isub            
	//  259  459:putfield        #109 <Field int pos>
					peeked = 7;
	//  260  462:aload_0         
	//  261  463:bipush          7
	//  262  465:putfield        #117 <Field int peeked>
					return 7;
	//  263  468:bipush          7
	//  264  470:ireturn         
				}
			} else
			{
				checkLenient();
	//  265  471:aload_0         
	//  266  472:invokespecial   #171 <Method void checkLenient()>
				peeked = 8;
	//  267  475:aload_0         
	//  268  476:bipush          8
	//  269  478:putfield        #117 <Field int peeked>
				return 8;
	//  270  481:bipush          8
	//  271  483:ireturn         
			}
		if(stackSize == 1)
	//* 272  484:aload_0         
	//* 273  485:getfield        #121 <Field int stackSize>
	//* 274  488:iconst_1        
	//* 275  489:icmpne          496
			checkLenient();
	//  276  492:aload_0         
	//  277  493:invokespecial   #171 <Method void checkLenient()>
		j = 9;
	//  278  496:bipush          9
	//  279  498:istore_1        
		continue; /* Loop/switch isn't completed */
	//  280  499:goto            235
_L6:
		stack[stackSize - 1] = 4;
	//  281  502:aload_0         
	//  282  503:getfield        #119 <Field int[] stack>
	//  283  506:aload_0         
	//  284  507:getfield        #121 <Field int stackSize>
	//  285  510:iconst_1        
	//  286  511:isub            
	//  287  512:iconst_4        
	//  288  513:iastore         
		if(k == 5)
	//* 289  514:iload_2         
	//* 290  515:iconst_5        
	//* 291  516:icmpne          561
		{
			j = nextNonWhitespace(true);
	//  292  519:aload_0         
	//  293  520:iconst_1        
	//  294  521:invokespecial   #163 <Method int nextNonWhitespace(boolean)>
	//  295  524:istore_1        
			if(j != 44)
	//* 296  525:iload_1         
	//* 297  526:bipush          44
	//* 298  528:icmpeq          561
			{
				if(j != 59)
	//* 299  531:iload_1         
	//* 300  532:bipush          59
	//* 301  534:icmpeq          557
					if(j != 125)
	//* 302  537:iload_1         
	//* 303  538:bipush          125
	//* 304  540:icmpeq          550
					{
						throw syntaxError("Unterminated object");
	//  305  543:aload_0         
	//  306  544:ldc1            #196 <String "Unterminated object">
	//  307  546:invokespecial   #158 <Method IOException syntaxError(String)>
	//  308  549:athrow          
					} else
					{
						peeked = 2;
	//  309  550:aload_0         
	//  310  551:iconst_2        
	//  311  552:putfield        #117 <Field int peeked>
						return 2;
	//  312  555:iconst_2        
	//  313  556:ireturn         
					}
				checkLenient();
	//  314  557:aload_0         
	//  315  558:invokespecial   #171 <Method void checkLenient()>
			}
		}
		j = nextNonWhitespace(true);
	//  316  561:aload_0         
	//  317  562:iconst_1        
	//  318  563:invokespecial   #163 <Method int nextNonWhitespace(boolean)>
	//  319  566:istore_1        
		if(j != 34)
	//* 320  567:iload_1         
	//* 321  568:bipush          34
	//* 322  570:icmpeq          650
		{
			if(j != 39)
	//* 323  573:iload_1         
	//* 324  574:bipush          39
	//* 325  576:icmpeq          640
			{
				if(j != 125)
	//* 326  579:iload_1         
	//* 327  580:bipush          125
	//* 328  582:icmpeq          621
				{
					checkLenient();
	//  329  585:aload_0         
	//  330  586:invokespecial   #171 <Method void checkLenient()>
					pos = pos - 1;
	//  331  589:aload_0         
	//  332  590:aload_0         
	//  333  591:getfield        #109 <Field int pos>
	//  334  594:iconst_1        
	//  335  595:isub            
	//  336  596:putfield        #109 <Field int pos>
					if(isLiteral((char)j))
	//* 337  599:aload_0         
	//* 338  600:iload_1         
	//* 339  601:int2char        
	//* 340  602:invokespecial   #190 <Method boolean isLiteral(char)>
	//* 341  605:ifeq            614
						j = 14;
	//  342  608:bipush          14
	//  343  610:istore_1        
					else
	//* 344  611:goto            235
						throw syntaxError("Expected name");
	//  345  614:aload_0         
	//  346  615:ldc1            #198 <String "Expected name">
	//  347  617:invokespecial   #158 <Method IOException syntaxError(String)>
	//  348  620:athrow          
				} else
				if(k != 5)
	//* 349  621:iload_2         
	//* 350  622:iconst_5        
	//* 351  623:icmpeq          633
				{
					peeked = 2;
	//  352  626:aload_0         
	//  353  627:iconst_2        
	//  354  628:putfield        #117 <Field int peeked>
					return 2;
	//  355  631:iconst_2        
	//  356  632:ireturn         
				} else
				{
					throw syntaxError("Expected name");
	//  357  633:aload_0         
	//  358  634:ldc1            #198 <String "Expected name">
	//  359  636:invokespecial   #158 <Method IOException syntaxError(String)>
	//  360  639:athrow          
				}
			} else
			{
				checkLenient();
	//  361  640:aload_0         
	//  362  641:invokespecial   #171 <Method void checkLenient()>
				j = 12;
	//  363  644:bipush          12
	//  364  646:istore_1        
			}
		} else
	//* 365  647:goto            235
		{
			j = 13;
	//  366  650:bipush          13
	//  367  652:istore_1        
		}
		if(true) goto _L20; else goto _L19
	//  368  653:goto            235
_L19:
	}

	private boolean fillBuffer(int i)
	{
		char ac[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore_3        
		lineStart = lineStart - pos;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #115 <Field int lineStart>
	//    6   10:aload_0         
	//    7   11:getfield        #109 <Field int pos>
	//    8   14:isub            
	//    9   15:putfield        #115 <Field int lineStart>
		if(limit != pos)
	//*  10   18:aload_0         
	//*  11   19:getfield        #111 <Field int limit>
	//*  12   22:aload_0         
	//*  13   23:getfield        #109 <Field int pos>
	//*  14   26:icmpeq          59
		{
			limit = limit - pos;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #111 <Field int limit>
	//   18   34:aload_0         
	//   19   35:getfield        #109 <Field int pos>
	//   20   38:isub            
	//   21   39:putfield        #111 <Field int limit>
			System.arraycopy(((Object) (ac)), pos, ((Object) (ac)), 0, limit);
	//   22   42:aload_3         
	//   23   43:aload_0         
	//   24   44:getfield        #109 <Field int pos>
	//   25   47:aload_3         
	//   26   48:iconst_0        
	//   27   49:aload_0         
	//   28   50:getfield        #111 <Field int limit>
	//   29   53:invokestatic    #204 <Method void System.arraycopy(Object, int, Object, int, int)>
		} else
	//*  30   56:goto            64
		{
			limit = 0;
	//   31   59:aload_0         
	//   32   60:iconst_0        
	//   33   61:putfield        #111 <Field int limit>
		}
		pos = 0;
	//   34   64:aload_0         
	//   35   65:iconst_0        
	//   36   66:putfield        #109 <Field int pos>
		do
		{
			int j = in.read(ac, limit, ac.length - limit);
	//   37   69:aload_0         
	//   38   70:getfield        #134 <Field Reader in>
	//   39   73:aload_3         
	//   40   74:aload_0         
	//   41   75:getfield        #111 <Field int limit>
	//   42   78:aload_3         
	//   43   79:arraylength     
	//   44   80:aload_0         
	//   45   81:getfield        #111 <Field int limit>
	//   46   84:isub            
	//   47   85:invokevirtual   #210 <Method int Reader.read(char[], int, int)>
	//   48   88:istore_2        
			if(j != -1)
	//*  49   89:iload_2         
	//*  50   90:iconst_m1       
	//*  51   91:icmpeq          177
			{
				limit = limit + j;
	//   52   94:aload_0         
	//   53   95:aload_0         
	//   54   96:getfield        #111 <Field int limit>
	//   55   99:iload_2         
	//   56  100:iadd            
	//   57  101:putfield        #111 <Field int limit>
				j = i;
	//   58  104:iload_1         
	//   59  105:istore_2        
				if(lineNumber == 0)
	//*  60  106:aload_0         
	//*  61  107:getfield        #113 <Field int lineNumber>
	//*  62  110:ifne            165
				{
					j = i;
	//   63  113:iload_1         
	//   64  114:istore_2        
					if(lineStart == 0)
	//*  65  115:aload_0         
	//*  66  116:getfield        #115 <Field int lineStart>
	//*  67  119:ifne            165
					{
						j = i;
	//   68  122:iload_1         
	//   69  123:istore_2        
						if(limit > 0)
	//*  70  124:aload_0         
	//*  71  125:getfield        #111 <Field int limit>
	//*  72  128:ifle            165
						{
							j = i;
	//   73  131:iload_1         
	//   74  132:istore_2        
							if(ac[0] == '\uFEFF')
	//*  75  133:aload_3         
	//*  76  134:iconst_0        
	//*  77  135:caload          
	//*  78  136:ldc1            #211 <Int 65279>
	//*  79  138:icmpne          165
							{
								pos = pos + 1;
	//   80  141:aload_0         
	//   81  142:aload_0         
	//   82  143:getfield        #109 <Field int pos>
	//   83  146:iconst_1        
	//   84  147:iadd            
	//   85  148:putfield        #109 <Field int pos>
								lineStart = lineStart + 1;
	//   86  151:aload_0         
	//   87  152:aload_0         
	//   88  153:getfield        #115 <Field int lineStart>
	//   89  156:iconst_1        
	//   90  157:iadd            
	//   91  158:putfield        #115 <Field int lineStart>
								j = i + 1;
	//   92  161:iload_1         
	//   93  162:iconst_1        
	//   94  163:iadd            
	//   95  164:istore_2        
							}
						}
					}
				}
				i = j;
	//   96  165:iload_2         
	//   97  166:istore_1        
				if(limit >= j)
	//*  98  167:aload_0         
	//*  99  168:getfield        #111 <Field int limit>
	//* 100  171:iload_2         
	//* 101  172:icmplt          69
					return true;
	//  102  175:iconst_1        
	//  103  176:ireturn         
			} else
			{
				return false;
	//  104  177:iconst_0        
	//  105  178:ireturn         
			}
		} while(true);
	}

	private int getColumnNumber()
	{
		return (pos - lineStart) + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field int pos>
	//    2    4:aload_0         
	//    3    5:getfield        #115 <Field int lineStart>
	//    4    8:isub            
	//    5    9:iconst_1        
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	private int getLineNumber()
	{
		return lineNumber + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field int lineNumber>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	private boolean isLiteral(char c)
	{
		switch(c)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    16: default 140
	//	               9: 146
	//	               10: 146
	//	               12: 146
	//	               13: 146
	//	               32: 146
	//	               35: 142
	//	               44: 146
	//	               47: 142
	//	               58: 146
	//	               59: 142
	//	               61: 142
	//	               91: 146
	//	               92: 142
	//	               93: 146
	//	               123: 146
	//	               125: 146
		default:
			return true;
	//    2  140:iconst_1        
	//    3  141:ireturn         

		case 35: // '#'
		case 47: // '/'
		case 59: // ';'
		case 61: // '='
		case 92: // '\\'
			checkLenient();
	//    4  142:aload_0         
	//    5  143:invokespecial   #171 <Method void checkLenient()>
			// fall through

		case 9: // '\t'
		case 10: // '\n'
		case 12: // '\f'
		case 13: // '\r'
		case 32: // ' '
		case 44: // ','
		case 58: // ':'
		case 91: // '['
		case 93: // ']'
		case 123: // '{'
		case 125: // '}'
			return false;
	//    6  146:iconst_0        
	//    7  147:ireturn         
		}
	}

	private int nextNonWhitespace(boolean flag)
	{
		Object obj = ((Object) (buffer));
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore          7
_L3:
		int i = pos;
	//    3    6:aload_0         
	//    4    7:getfield        #109 <Field int pos>
	//    5   10:istore_2        
_L4:
		int k = limit;
	//    6   11:aload_0         
	//    7   12:getfield        #111 <Field int limit>
	//    8   15:istore          4
_L6:
		int j;
		int l = i;
	//    9   17:iload_2         
	//   10   18:istore          5
		j = k;
	//   11   20:iload           4
	//   12   22:istore_3        
		if(i == k)
	//*  13   23:iload_2         
	//*  14   24:iload           4
	//*  15   26:icmpne          117
		{
			pos = i;
	//   16   29:aload_0         
	//   17   30:iload_2         
	//   18   31:putfield        #109 <Field int pos>
			if(!fillBuffer(1))
	//*  19   34:aload_0         
	//*  20   35:iconst_1        
	//*  21   36:invokespecial   #167 <Method boolean fillBuffer(int)>
	//*  22   39:ifne            106
				if(flag)
	//*  23   42:iload_1         
	//*  24   43:ifeq            104
				{
					obj = ((Object) (new StringBuilder()));
	//   25   46:new             #213 <Class StringBuilder>
	//   26   49:dup             
	//   27   50:invokespecial   #214 <Method void StringBuilder()>
	//   28   53:astore          7
					((StringBuilder) (obj)).append("End of input at line ");
	//   29   55:aload           7
	//   30   57:ldc1            #216 <String "End of input at line ">
	//   31   59:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
					((StringBuilder) (obj)).append(getLineNumber());
	//   33   63:aload           7
	//   34   65:aload_0         
	//   35   66:invokespecial   #147 <Method int getLineNumber()>
	//   36   69:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   37   72:pop             
					((StringBuilder) (obj)).append(" column ");
	//   38   73:aload           7
	//   39   75:ldc1            #225 <String " column ">
	//   40   77:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   41   80:pop             
					((StringBuilder) (obj)).append(getColumnNumber());
	//   42   81:aload           7
	//   43   83:aload_0         
	//   44   84:invokespecial   #151 <Method int getColumnNumber()>
	//   45   87:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   46   90:pop             
					throw new EOFException(((StringBuilder) (obj)).toString());
	//   47   91:new             #227 <Class EOFException>
	//   48   94:dup             
	//   49   95:aload           7
	//   50   97:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   51  100:invokespecial   #232 <Method void EOFException(String)>
	//   52  103:athrow          
				} else
				{
					return -1;
	//   53  104:iconst_m1       
	//   54  105:ireturn         
				}
			l = pos;
	//   55  106:aload_0         
	//   56  107:getfield        #109 <Field int pos>
	//   57  110:istore          5
			j = limit;
	//   58  112:aload_0         
	//   59  113:getfield        #111 <Field int limit>
	//   60  116:istore_3        
		}
		i = l + 1;
	//   61  117:iload           5
	//   62  119:iconst_1        
	//   63  120:iadd            
	//   64  121:istore_2        
		k = ((int) (obj[l]));
	//   65  122:aload           7
	//   66  124:iload           5
	//   67  126:caload          
	//   68  127:istore          4
		if(k == '\n')
	//*  69  129:iload           4
	//*  70  131:bipush          10
	//*  71  133:icmpne          154
		{
			lineNumber = lineNumber + 1;
	//   72  136:aload_0         
	//   73  137:aload_0         
	//   74  138:getfield        #113 <Field int lineNumber>
	//   75  141:iconst_1        
	//   76  142:iadd            
	//   77  143:putfield        #113 <Field int lineNumber>
			lineStart = i;
	//   78  146:aload_0         
	//   79  147:iload_2         
	//   80  148:putfield        #115 <Field int lineStart>
			break MISSING_BLOCK_LABEL_337;
	//   81  151:goto            337
		}
		if(k == ' ' || k == '\r' || k == '\t')
	//*  82  154:iload           4
	//*  83  156:bipush          32
	//*  84  158:icmpeq          337
	//*  85  161:iload           4
	//*  86  163:bipush          13
	//*  87  165:icmpeq          337
	//*  88  168:iload           4
	//*  89  170:bipush          9
	//*  90  172:icmpne          178
			break MISSING_BLOCK_LABEL_337;
	//   91  175:goto            337
		if(k != '/')
			break MISSING_BLOCK_LABEL_310;
	//   92  178:iload           4
	//   93  180:bipush          47
	//   94  182:icmpne          310
		pos = i;
	//   95  185:aload_0         
	//   96  186:iload_2         
	//   97  187:putfield        #109 <Field int pos>
		if(i == j)
	//*  98  190:iload_2         
	//*  99  191:iload_3         
	//* 100  192:icmpne          230
		{
			pos = pos - 1;
	//  101  195:aload_0         
	//  102  196:aload_0         
	//  103  197:getfield        #109 <Field int pos>
	//  104  200:iconst_1        
	//  105  201:isub            
	//  106  202:putfield        #109 <Field int pos>
			boolean flag1 = fillBuffer(2);
	//  107  205:aload_0         
	//  108  206:iconst_2        
	//  109  207:invokespecial   #167 <Method boolean fillBuffer(int)>
	//  110  210:istore          6
			pos = pos + 1;
	//  111  212:aload_0         
	//  112  213:aload_0         
	//  113  214:getfield        #109 <Field int pos>
	//  114  217:iconst_1        
	//  115  218:iadd            
	//  116  219:putfield        #109 <Field int pos>
			if(!flag1)
	//* 117  222:iload           6
	//* 118  224:ifne            230
				return k;
	//  119  227:iload           4
	//  120  229:ireturn         
		}
		checkLenient();
	//  121  230:aload_0         
	//  122  231:invokespecial   #171 <Method void checkLenient()>
		i = ((int) (obj[pos]));
	//  123  234:aload           7
	//  124  236:aload_0         
	//  125  237:getfield        #109 <Field int pos>
	//  126  240:caload          
	//  127  241:istore_2        
		if(i == 42) goto _L2; else goto _L1
	//  128  242:iload_2         
	//  129  243:bipush          42
	//  130  245:icmpeq          274
_L1:
		if(i != 47)
	//* 131  248:iload_2         
	//* 132  249:bipush          47
	//* 133  251:icmpeq          257
			return k;
	//  134  254:iload           4
	//  135  256:ireturn         
		pos = pos + 1;
	//  136  257:aload_0         
	//  137  258:aload_0         
	//  138  259:getfield        #109 <Field int pos>
	//  139  262:iconst_1        
	//  140  263:iadd            
	//  141  264:putfield        #109 <Field int pos>
_L5:
		skipToEndOfLine();
	//  142  267:aload_0         
	//  143  268:invokespecial   #235 <Method void skipToEndOfLine()>
		  goto _L3
	//* 144  271:goto            6
_L2:
		pos = pos + 1;
	//  145  274:aload_0         
	//  146  275:aload_0         
	//  147  276:getfield        #109 <Field int pos>
	//  148  279:iconst_1        
	//  149  280:iadd            
	//  150  281:putfield        #109 <Field int pos>
		if(!skipTo("*/"))
	//* 151  284:aload_0         
	//* 152  285:ldc1            #237 <String "*/">
	//* 153  287:invokespecial   #241 <Method boolean skipTo(String)>
	//* 154  290:ifne            300
			throw syntaxError("Unterminated comment");
	//  155  293:aload_0         
	//  156  294:ldc1            #243 <String "Unterminated comment">
	//  157  296:invokespecial   #158 <Method IOException syntaxError(String)>
	//  158  299:athrow          
		i = pos + 2;
	//  159  300:aload_0         
	//  160  301:getfield        #109 <Field int pos>
	//  161  304:iconst_2        
	//  162  305:iadd            
	//  163  306:istore_2        
		  goto _L4
	//* 164  307:goto            11
		if(k == '#')
	//* 165  310:iload           4
	//* 166  312:bipush          35
	//* 167  314:icmpne          329
		{
			pos = i;
	//  168  317:aload_0         
	//  169  318:iload_2         
	//  170  319:putfield        #109 <Field int pos>
			checkLenient();
	//  171  322:aload_0         
	//  172  323:invokespecial   #171 <Method void checkLenient()>
		} else
	//* 173  326:goto            267
		{
			pos = i;
	//  174  329:aload_0         
	//  175  330:iload_2         
	//  176  331:putfield        #109 <Field int pos>
			return k;
	//  177  334:iload           4
	//  178  336:ireturn         
		}
		  goto _L5
		k = j;
	//  179  337:iload_3         
	//  180  338:istore          4
		  goto _L6
	//* 181  340:goto            17
	}

	private String nextQuotedValue(char c)
	{
		char ac[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//    3    6:new             #213 <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #214 <Method void StringBuilder()>
	//    6   13:astore          7
label0:
		do
		{
			int j = pos;
	//    7   15:aload_0         
	//    8   16:getfield        #109 <Field int pos>
	//    9   19:istore_3        
			int l = limit;
	//   10   20:aload_0         
	//   11   21:getfield        #111 <Field int limit>
	//   12   24:istore          5
			int i = j;
	//   13   26:iload_3         
	//   14   27:istore_2        
			int k;
			do
			{
				k = i;
	//   15   28:iload_2         
	//   16   29:istore          4
				if(k >= l)
					break;
	//   17   31:iload           4
	//   18   33:iload           5
	//   19   35:icmpge          145
				i = k + 1;
	//   20   38:iload           4
	//   21   40:iconst_1        
	//   22   41:iadd            
	//   23   42:istore_2        
				k = ((int) (ac[k]));
	//   24   43:aload           6
	//   25   45:iload           4
	//   26   47:caload          
	//   27   48:istore          4
				if(k == c)
	//*  28   50:iload           4
	//*  29   52:iload_1         
	//*  30   53:icmpne          81
				{
					pos = i;
	//   31   56:aload_0         
	//   32   57:iload_2         
	//   33   58:putfield        #109 <Field int pos>
					stringbuilder.append(ac, j, i - j - 1);
	//   34   61:aload           7
	//   35   63:aload           6
	//   36   65:iload_3         
	//   37   66:iload_2         
	//   38   67:iload_3         
	//   39   68:isub            
	//   40   69:iconst_1        
	//   41   70:isub            
	//   42   71:invokevirtual   #248 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   43   74:pop             
					return stringbuilder.toString();
	//   44   75:aload           7
	//   45   77:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   46   80:areturn         
				}
				if(k == 92)
	//*  47   81:iload           4
	//*  48   83:bipush          92
	//*  49   85:icmpne          120
				{
					pos = i;
	//   50   88:aload_0         
	//   51   89:iload_2         
	//   52   90:putfield        #109 <Field int pos>
					stringbuilder.append(ac, j, i - j - 1);
	//   53   93:aload           7
	//   54   95:aload           6
	//   55   97:iload_3         
	//   56   98:iload_2         
	//   57   99:iload_3         
	//   58  100:isub            
	//   59  101:iconst_1        
	//   60  102:isub            
	//   61  103:invokevirtual   #248 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   62  106:pop             
					stringbuilder.append(readEscapeCharacter());
	//   63  107:aload           7
	//   64  109:aload_0         
	//   65  110:invokespecial   #252 <Method char readEscapeCharacter()>
	//   66  113:invokevirtual   #255 <Method StringBuilder StringBuilder.append(char)>
	//   67  116:pop             
					continue label0;
	//   68  117:goto            15
				}
				if(k == 10)
	//*  69  120:iload           4
	//*  70  122:bipush          10
	//*  71  124:icmpne          142
				{
					lineNumber = lineNumber + 1;
	//   72  127:aload_0         
	//   73  128:aload_0         
	//   74  129:getfield        #113 <Field int lineNumber>
	//   75  132:iconst_1        
	//   76  133:iadd            
	//   77  134:putfield        #113 <Field int lineNumber>
					lineStart = i;
	//   78  137:aload_0         
	//   79  138:iload_2         
	//   80  139:putfield        #115 <Field int lineStart>
				}
			} while(true);
	//   81  142:goto            28
			stringbuilder.append(ac, j, k - j);
	//   82  145:aload           7
	//   83  147:aload           6
	//   84  149:iload_3         
	//   85  150:iload           4
	//   86  152:iload_3         
	//   87  153:isub            
	//   88  154:invokevirtual   #248 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   89  157:pop             
			pos = k;
	//   90  158:aload_0         
	//   91  159:iload           4
	//   92  161:putfield        #109 <Field int pos>
			if(!fillBuffer(1))
	//*  93  164:aload_0         
	//*  94  165:iconst_1        
	//*  95  166:invokespecial   #167 <Method boolean fillBuffer(int)>
	//*  96  169:ifne            15
				throw syntaxError("Unterminated string");
	//   97  172:aload_0         
	//   98  173:ldc2            #257 <String "Unterminated string">
	//   99  176:invokespecial   #158 <Method IOException syntaxError(String)>
	//  100  179:athrow          
		} while(true);
	}

	private String nextUnquotedValue()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		Object obj = null;
	//    2    2:aconst_null     
	//    3    3:astore_3        
		int i;
label0:
		do
		{
label1:
			{
				i = 0;
	//    4    4:iconst_0        
	//    5    5:istore_1        
label2:
				do
				{
					do
					{
						if(pos + i >= limit)
							break;
	//    6    6:aload_0         
	//    7    7:getfield        #109 <Field int pos>
	//    8   10:iload_1         
	//    9   11:iadd            
	//   10   12:aload_0         
	//   11   13:getfield        #111 <Field int limit>
	//   12   16:icmpge          182
						switch(buffer[pos + i])
	//*  13   19:aload_0         
	//*  14   20:getfield        #107 <Field char[] buffer>
	//*  15   23:aload_0         
	//*  16   24:getfield        #109 <Field int pos>
	//*  17   27:iload_1         
	//*  18   28:iadd            
	//*  19   29:caload          
						{
	//*  20   30:lookupswitch    16: default 168
	//	               9: 204
	//	               10: 204
	//	               12: 204
	//	               13: 204
	//	               32: 204
	//	               35: 175
	//	               44: 204
	//	               47: 175
	//	               58: 204
	//	               59: 175
	//	               61: 175
	//	               91: 204
	//	               92: 175
	//	               93: 204
	//	               123: 204
	//	               125: 204
						default:
							i++;
	//   21  168:iload_1         
	//   22  169:iconst_1        
	//   23  170:iadd            
	//   24  171:istore_1        
							continue;
	//   25  172:goto            6

						case 9: // '\t'
						case 10: // '\n'
						case 12: // '\f'
						case 13: // '\r'
						case 32: // ' '
						case 44: // ','
						case 58: // ':'
						case 91: // '['
						case 93: // ']'
						case 123: // '{'
						case 125: // '}'
							break label2;

						case 35: // '#'
						case 47: // '/'
						case 59: // ';'
						case 61: // '='
						case 92: // '\\'
							checkLenient();
	//   26  175:aload_0         
	//   27  176:invokespecial   #171 <Method void checkLenient()>
							break label2;
	//   28  179:goto            204
						}
					} while(true);
					if(i >= buffer.length)
						break label1;
	//   29  182:iload_1         
	//   30  183:aload_0         
	//   31  184:getfield        #107 <Field char[] buffer>
	//   32  187:arraylength     
	//   33  188:icmpge          207
				} while(fillBuffer(i + 1));
	//   34  191:aload_0         
	//   35  192:iload_1         
	//   36  193:iconst_1        
	//   37  194:iadd            
	//   38  195:invokespecial   #167 <Method boolean fillBuffer(int)>
	//   39  198:ifeq            204
				break label0;
	//   40  201:goto            6
			}
	//*  41  204:goto            264
			Object obj1 = obj;
	//   42  207:aload_3         
	//   43  208:astore          4
			if(obj == null)
	//*  44  210:aload_3         
	//*  45  211:ifnonnull       223
				obj1 = ((Object) (new StringBuilder()));
	//   46  214:new             #213 <Class StringBuilder>
	//   47  217:dup             
	//   48  218:invokespecial   #214 <Method void StringBuilder()>
	//   49  221:astore          4
			((StringBuilder) (obj1)).append(buffer, pos, i);
	//   50  223:aload           4
	//   51  225:aload_0         
	//   52  226:getfield        #107 <Field char[] buffer>
	//   53  229:aload_0         
	//   54  230:getfield        #109 <Field int pos>
	//   55  233:iload_1         
	//   56  234:invokevirtual   #248 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   57  237:pop             
			pos = pos + i;
	//   58  238:aload_0         
	//   59  239:aload_0         
	//   60  240:getfield        #109 <Field int pos>
	//   61  243:iload_1         
	//   62  244:iadd            
	//   63  245:putfield        #109 <Field int pos>
			obj = obj1;
	//   64  248:aload           4
	//   65  250:astore_3        
			if(fillBuffer(1))
				continue;
	//   66  251:aload_0         
	//   67  252:iconst_1        
	//   68  253:invokespecial   #167 <Method boolean fillBuffer(int)>
	//   69  256:ifne            4
			obj = obj1;
	//   70  259:aload           4
	//   71  261:astore_3        
			i = ((int) (flag));
	//   72  262:iload_2         
	//   73  263:istore_1        
			break;
		} while(true);
		if(obj == null)
	//*  74  264:aload_3         
	//*  75  265:ifnonnull       288
		{
			obj = ((Object) (new String(buffer, pos, i)));
	//   76  268:new             #85  <Class String>
	//   77  271:dup             
	//   78  272:aload_0         
	//   79  273:getfield        #107 <Field char[] buffer>
	//   80  276:aload_0         
	//   81  277:getfield        #109 <Field int pos>
	//   82  280:iload_1         
	//   83  281:invokespecial   #261 <Method void String(char[], int, int)>
	//   84  284:astore_3        
		} else
	//*  85  285:goto            307
		{
			((StringBuilder) (obj)).append(buffer, pos, i);
	//   86  288:aload_3         
	//   87  289:aload_0         
	//   88  290:getfield        #107 <Field char[] buffer>
	//   89  293:aload_0         
	//   90  294:getfield        #109 <Field int pos>
	//   91  297:iload_1         
	//   92  298:invokevirtual   #248 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   93  301:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   94  302:aload_3         
	//   95  303:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   96  306:astore_3        
		}
		pos = pos + i;
	//   97  307:aload_0         
	//   98  308:aload_0         
	//   99  309:getfield        #109 <Field int pos>
	//  100  312:iload_1         
	//  101  313:iadd            
	//  102  314:putfield        #109 <Field int pos>
		return ((String) (obj));
	//  103  317:aload_3         
	//  104  318:areturn         
	}

	private int peekKeyword()
	{
		int i = ((int) (buffer[pos]));
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field int pos>
	//    4    8:caload          
	//    5    9:istore_1        
		String s;
		String s1;
		if(i != 't' && i != 'T')
	//*   6   10:iload_1         
	//*   7   11:bipush          116
	//*   8   13:icmpeq          89
	//*   9   16:iload_1         
	//*  10   17:bipush          84
	//*  11   19:icmpne          25
	//*  12   22:goto            89
		{
			if(i != 'f' && i != 'F')
	//*  13   25:iload_1         
	//*  14   26:bipush          102
	//*  15   28:icmpeq          73
	//*  16   31:iload_1         
	//*  17   32:bipush          70
	//*  18   34:icmpne          40
	//*  19   37:goto            73
			{
				if(i != 'n' && i != 'N')
	//*  20   40:iload_1         
	//*  21   41:bipush          110
	//*  22   43:icmpeq          57
	//*  23   46:iload_1         
	//*  24   47:bipush          78
	//*  25   49:icmpne          55
	//*  26   52:goto            57
					return 0;
	//   27   55:iconst_0        
	//   28   56:ireturn         
				s = "null";
	//   29   57:ldc2            #263 <String "null">
	//   30   60:astore          5
				s1 = "NULL";
	//   31   62:ldc2            #265 <String "NULL">
	//   32   65:astore          6
				i = 7;
	//   33   67:bipush          7
	//   34   69:istore_1        
			} else
	//*  35   70:goto            101
			{
				s = "false";
	//   36   73:ldc2            #267 <String "false">
	//   37   76:astore          5
				s1 = "FALSE";
	//   38   78:ldc2            #269 <String "FALSE">
	//   39   81:astore          6
				i = 6;
	//   40   83:bipush          6
	//   41   85:istore_1        
			}
		} else
	//*  42   86:goto            101
		{
			s = "true";
	//   43   89:ldc2            #271 <String "true">
	//   44   92:astore          5
			s1 = "TRUE";
	//   45   94:ldc2            #273 <String "TRUE">
	//   46   97:astore          6
			i = 5;
	//   47   99:iconst_5        
	//   48  100:istore_1        
		}
		int k = s.length();
	//   49  101:aload           5
	//   50  103:invokevirtual   #276 <Method int String.length()>
	//   51  106:istore_3        
		for(int j = 1; j < k; j++)
	//*  52  107:iconst_1        
	//*  53  108:istore_2        
	//*  54  109:iload_2         
	//*  55  110:iload_3         
	//*  56  111:icmpge          183
		{
			if(pos + j >= limit && !fillBuffer(j + 1))
	//*  57  114:aload_0         
	//*  58  115:getfield        #109 <Field int pos>
	//*  59  118:iload_2         
	//*  60  119:iadd            
	//*  61  120:aload_0         
	//*  62  121:getfield        #111 <Field int limit>
	//*  63  124:icmplt          139
	//*  64  127:aload_0         
	//*  65  128:iload_2         
	//*  66  129:iconst_1        
	//*  67  130:iadd            
	//*  68  131:invokespecial   #167 <Method boolean fillBuffer(int)>
	//*  69  134:ifne            139
				return 0;
	//   70  137:iconst_0        
	//   71  138:ireturn         
			char c = buffer[pos + j];
	//   72  139:aload_0         
	//   73  140:getfield        #107 <Field char[] buffer>
	//   74  143:aload_0         
	//   75  144:getfield        #109 <Field int pos>
	//   76  147:iload_2         
	//   77  148:iadd            
	//   78  149:caload          
	//   79  150:istore          4
			if(c != s.charAt(j) && c != s1.charAt(j))
	//*  80  152:iload           4
	//*  81  154:aload           5
	//*  82  156:iload_2         
	//*  83  157:invokevirtual   #280 <Method char String.charAt(int)>
	//*  84  160:icmpeq          176
	//*  85  163:iload           4
	//*  86  165:aload           6
	//*  87  167:iload_2         
	//*  88  168:invokevirtual   #280 <Method char String.charAt(int)>
	//*  89  171:icmpeq          176
				return 0;
	//   90  174:iconst_0        
	//   91  175:ireturn         
		}

	//   92  176:iload_2         
	//   93  177:iconst_1        
	//   94  178:iadd            
	//   95  179:istore_2        
	//*  96  180:goto            109
		if((pos + k < limit || fillBuffer(k + 1)) && isLiteral(buffer[pos + k]))
	//*  97  183:aload_0         
	//*  98  184:getfield        #109 <Field int pos>
	//*  99  187:iload_3         
	//* 100  188:iadd            
	//* 101  189:aload_0         
	//* 102  190:getfield        #111 <Field int limit>
	//* 103  193:icmplt          206
	//* 104  196:aload_0         
	//* 105  197:iload_3         
	//* 106  198:iconst_1        
	//* 107  199:iadd            
	//* 108  200:invokespecial   #167 <Method boolean fillBuffer(int)>
	//* 109  203:ifeq            226
	//* 110  206:aload_0         
	//* 111  207:aload_0         
	//* 112  208:getfield        #107 <Field char[] buffer>
	//* 113  211:aload_0         
	//* 114  212:getfield        #109 <Field int pos>
	//* 115  215:iload_3         
	//* 116  216:iadd            
	//* 117  217:caload          
	//* 118  218:invokespecial   #190 <Method boolean isLiteral(char)>
	//* 119  221:ifeq            226
		{
			return 0;
	//  120  224:iconst_0        
	//  121  225:ireturn         
		} else
		{
			pos = pos + k;
	//  122  226:aload_0         
	//  123  227:aload_0         
	//  124  228:getfield        #109 <Field int pos>
	//  125  231:iload_3         
	//  126  232:iadd            
	//  127  233:putfield        #109 <Field int pos>
			peeked = i;
	//  128  236:aload_0         
	//  129  237:iload_1         
	//  130  238:putfield        #117 <Field int peeked>
			return i;
	//  131  241:iload_1         
	//  132  242:ireturn         
		}
	}

	private int peekNumber()
	{
		int i;
		boolean flag;
		int j;
		boolean flag1;
		int k;
		int j1;
		long l1;
		char ac[];
		ac = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore          14
		j1 = pos;
	//    3    6:aload_0         
	//    4    7:getfield        #109 <Field int pos>
	//    5   10:istore          9
		j = limit;
	//    6   12:aload_0         
	//    7   13:getfield        #111 <Field int limit>
	//    8   16:istore          4
		k = 0;
	//    9   18:iconst_0        
	//   10   19:istore          6
		i = 0;
	//   11   21:iconst_0        
	//   12   22:istore_2        
		flag = true;
	//   13   23:iconst_1        
	//   14   24:istore_3        
		l1 = 0L;
	//   15   25:lconst_0        
	//   16   26:lstore          10
		flag1 = false;
	//   17   28:iconst_0        
	//   18   29:istore          5
_L24:
		int l;
		int i1;
		i1 = j1;
	//   19   31:iload           9
	//   20   33:istore          8
		l = j;
	//   21   35:iload           4
	//   22   37:istore          7
		if(j1 + k != j) goto _L2; else goto _L1
	//   23   39:iload           9
	//   24   41:iload           6
	//   25   43:iadd            
	//   26   44:iload           4
	//   27   46:icmpne          85
_L1:
		if(k == ac.length)
	//*  28   49:iload           6
	//*  29   51:aload           14
	//*  30   53:arraylength     
	//*  31   54:icmpne          59
			return 0;
	//   32   57:iconst_0        
	//   33   58:ireturn         
		if(fillBuffer(k + 1)) goto _L4; else goto _L3
	//   34   59:aload_0         
	//   35   60:iload           6
	//   36   62:iconst_1        
	//   37   63:iadd            
	//   38   64:invokespecial   #167 <Method boolean fillBuffer(int)>
	//   39   67:ifne            73
	//*  40   70:goto            306
_L4:
		i1 = pos;
	//   41   73:aload_0         
	//   42   74:getfield        #109 <Field int pos>
	//   43   77:istore          8
		l = limit;
	//   44   79:aload_0         
	//   45   80:getfield        #111 <Field int limit>
	//   46   83:istore          7
_L2:
		char c = ac[i1 + k];
	//   47   85:aload           14
	//   48   87:iload           8
	//   49   89:iload           6
	//   50   91:iadd            
	//   51   92:caload          
	//   52   93:istore_1        
		if(c == '+') goto _L6; else goto _L5
	//   53   94:iload_1         
	//   54   95:bipush          43
	//   55   97:icmpeq          458
_L5:
		if(c == 'E' || c == 'e') goto _L8; else goto _L7
	//   56  100:iload_1         
	//   57  101:bipush          69
	//   58  103:icmpeq          438
	//   59  106:iload_1         
	//   60  107:bipush          101
	//   61  109:icmpeq          438
_L7:
		c;
	//   62  112:iload_1         
		JVM INSTR tableswitch 45 46: default 136
	//	               45 416
	//	               46 404;
	//   63  113:tableswitch     45 46: default 136
	//	               45 416
	//	               46 404
		   goto _L9 _L10 _L11
_L9:
		if(c >= '0' && c <= '9') goto _L13; else goto _L12
	//   64  136:iload_1         
	//   65  137:bipush          48
	//   66  139:icmplt          298
	//   67  142:iload_1         
	//   68  143:bipush          57
	//   69  145:icmple          151
	//*  70  148:goto            298
_L13:
		if(i != 1 && i != 0) goto _L15; else goto _L14
	//   71  151:iload_2         
	//   72  152:iconst_1        
	//   73  153:icmpeq          285
	//   74  156:iload_2         
	//   75  157:ifne            163
	//*  76  160:goto            285
_L15:
		if(i != 2) goto _L17; else goto _L16
	//   77  163:iload_2         
	//   78  164:iconst_2        
	//   79  165:icmpne          238
_L16:
		long l2;
		if(l1 == 0L)
	//*  80  168:lload           10
	//*  81  170:lconst_0        
	//*  82  171:lcmp            
	//*  83  172:ifne            177
			return 0;
	//   84  175:iconst_0        
	//   85  176:ireturn         
		l2 = 10L * l1 - (long)(c - 48);
	//   86  177:ldc2w           #281 <Long 10L>
	//   87  180:lload           10
	//   88  182:lmul            
	//   89  183:iload_1         
	//   90  184:bipush          48
	//   91  186:isub            
	//   92  187:i2l             
	//   93  188:lsub            
	//   94  189:lstore          12
		j = l1 != 0x33333334L;
	//   95  191:lload           10
	//   96  193:ldc2w           #11  <Long 0x33333334L>
	//   97  196:lcmp            
	//   98  197:istore          4
		if(j <= 0 && (j != 0 || l2 >= l1))
	//*  99  199:iload           4
	//* 100  201:ifgt            226
	//* 101  204:iload           4
	//* 102  206:ifne            220
	//* 103  209:lload           12
	//* 104  211:lload           10
	//* 105  213:lcmp            
	//* 106  214:ifge            220
	//* 107  217:goto            226
			j = 0;
	//  108  220:iconst_0        
	//  109  221:istore          4
		else
	//* 110  223:goto            229
			j = 1;
	//  111  226:iconst_1        
	//  112  227:istore          4
		j &= ((int) (flag));
	//  113  229:iload           4
	//  114  231:iload_3         
	//  115  232:iand            
	//  116  233:istore          4
		  goto _L18
	//* 117  235:goto            269
_L17:
		if(i == 3)
	//* 118  238:iload_2         
	//* 119  239:iconst_3        
	//* 120  240:icmpne          248
		{
			i = 4;
	//  121  243:iconst_4        
	//  122  244:istore_2        
			break MISSING_BLOCK_LABEL_466;
	//  123  245:goto            466
		}
		if(i == 5) goto _L20; else goto _L19
	//  124  248:iload_2         
	//  125  249:iconst_5        
	//  126  250:icmpeq          279
_L19:
		j = ((int) (flag));
	//  127  253:iload_3         
	//  128  254:istore          4
		l2 = l1;
	//  129  256:lload           10
	//  130  258:lstore          12
		if(i != 6) goto _L18; else goto _L20
	//  131  260:iload_2         
	//  132  261:bipush          6
	//  133  263:icmpne          269
	//* 134  266:goto            279
_L18:
		flag = ((boolean) (j));
	//  135  269:iload           4
	//  136  271:istore_3        
		l1 = l2;
	//  137  272:lload           12
	//  138  274:lstore          10
		break MISSING_BLOCK_LABEL_466;
	//  139  276:goto            466
_L20:
		i = 7;
	//  140  279:bipush          7
	//  141  281:istore_2        
		break MISSING_BLOCK_LABEL_466;
	//  142  282:goto            466
_L14:
		l1 = -(c - 48);
	//  143  285:iload_1         
	//  144  286:bipush          48
	//  145  288:isub            
	//  146  289:ineg            
	//  147  290:i2l             
	//  148  291:lstore          10
		i = 2;
	//  149  293:iconst_2        
	//  150  294:istore_2        
		break MISSING_BLOCK_LABEL_466;
	//  151  295:goto            466
_L12:
		if(isLiteral(c)) goto _L21; else goto _L3
	//  152  298:aload_0         
	//  153  299:iload_1         
	//  154  300:invokespecial   #190 <Method boolean isLiteral(char)>
	//  155  303:ifne            402
_L3:
		if(i == 2 && flag && (l1 != 0x0L || flag1))
	//* 156  306:iload_2         
	//* 157  307:iconst_2        
	//* 158  308:icmpne          369
	//* 159  311:iload_3         
	//* 160  312:ifeq            369
	//* 161  315:lload           10
	//* 162  317:ldc2w           #283 <Long 0x0L>
	//* 163  320:lcmp            
	//* 164  321:ifne            329
	//* 165  324:iload           5
	//* 166  326:ifeq            369
		{
			if(!flag1)
	//* 167  329:iload           5
	//* 168  331:ifeq            337
	//* 169  334:goto            342
				l1 = -l1;
	//  170  337:lload           10
	//  171  339:lneg            
	//  172  340:lstore          10
			peekedLong = l1;
	//  173  342:aload_0         
	//  174  343:lload           10
	//  175  345:putfield        #286 <Field long peekedLong>
			pos = pos + k;
	//  176  348:aload_0         
	//  177  349:aload_0         
	//  178  350:getfield        #109 <Field int pos>
	//  179  353:iload           6
	//  180  355:iadd            
	//  181  356:putfield        #109 <Field int pos>
			i = 15;
	//  182  359:bipush          15
	//  183  361:istore_2        
		} else
	//* 184  362:aload_0         
	//* 185  363:iload_2         
	//* 186  364:putfield        #117 <Field int peeked>
	//* 187  367:iload_2         
	//* 188  368:ireturn         
		{
			if(i != 2 && i != 4 && i != 7)
	//* 189  369:iload_2         
	//* 190  370:iconst_2        
	//* 191  371:icmpeq          390
	//* 192  374:iload_2         
	//* 193  375:iconst_4        
	//* 194  376:icmpeq          390
	//* 195  379:iload_2         
	//* 196  380:bipush          7
	//* 197  382:icmpne          388
	//* 198  385:goto            390
				return 0;
	//  199  388:iconst_0        
	//  200  389:ireturn         
			peekedNumberLength = k;
	//  201  390:aload_0         
	//  202  391:iload           6
	//  203  393:putfield        #288 <Field int peekedNumberLength>
			i = 16;
	//  204  396:bipush          16
	//  205  398:istore_2        
		}
		peeked = i;
		return i;
	//* 206  399:goto            362
_L21:
		return 0;
	//  207  402:iconst_0        
	//  208  403:ireturn         
_L11:
		if(i == 2)
	//* 209  404:iload_2         
	//* 210  405:iconst_2        
	//* 211  406:icmpne          414
			i = 3;
	//  212  409:iconst_3        
	//  213  410:istore_2        
		else
	//* 214  411:goto            466
			return 0;
	//  215  414:iconst_0        
	//  216  415:ireturn         
		break MISSING_BLOCK_LABEL_466;
_L10:
		if(i == 0)
	//* 217  416:iload_2         
	//* 218  417:ifne            428
		{
			i = 1;
	//  219  420:iconst_1        
	//  220  421:istore_2        
			flag1 = true;
	//  221  422:iconst_1        
	//  222  423:istore          5
			break MISSING_BLOCK_LABEL_466;
	//  223  425:goto            466
		}
		if(i != 5)
	//* 224  428:iload_2         
	//* 225  429:iconst_5        
	//* 226  430:icmpne          436
	//* 227  433:goto            463
			return 0;
	//  228  436:iconst_0        
	//  229  437:ireturn         
		  goto _L22
_L8:
		if(i != 2 && i != 4)
	//* 230  438:iload_2         
	//* 231  439:iconst_2        
	//* 232  440:icmpeq          453
	//* 233  443:iload_2         
	//* 234  444:iconst_4        
	//* 235  445:icmpne          451
	//* 236  448:goto            453
			return 0;
	//  237  451:iconst_0        
	//  238  452:ireturn         
		i = 5;
	//  239  453:iconst_5        
	//  240  454:istore_2        
		break MISSING_BLOCK_LABEL_466;
	//  241  455:goto            466
_L6:
		if(i != 5)
			break; /* Loop/switch isn't completed */
	//  242  458:iload_2         
	//  243  459:iconst_5        
	//  244  460:icmpne          483
_L22:
		i = 6;
	//  245  463:bipush          6
	//  246  465:istore_2        
		k++;
	//  247  466:iload           6
	//  248  468:iconst_1        
	//  249  469:iadd            
	//  250  470:istore          6
		j1 = i1;
	//  251  472:iload           8
	//  252  474:istore          9
		j = l;
	//  253  476:iload           7
	//  254  478:istore          4
		if(true) goto _L24; else goto _L23
	//  255  480:goto            31
_L23:
		return 0;
	//  256  483:iconst_0        
	//  257  484:ireturn         
	}

	private void push(int i)
	{
		if(stackSize == stack.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field int stackSize>
	//*   2    4:aload_0         
	//*   3    5:getfield        #119 <Field int[] stack>
	//*   4    8:arraylength     
	//*   5    9:icmpne          103
		{
			int ai[] = new int[stackSize * 2];
	//    6   12:aload_0         
	//    7   13:getfield        #121 <Field int stackSize>
	//    8   16:iconst_2        
	//    9   17:imul            
	//   10   18:newarray        int[]
	//   11   20:astore_3        
			int ai2[] = new int[stackSize * 2];
	//   12   21:aload_0         
	//   13   22:getfield        #121 <Field int stackSize>
	//   14   25:iconst_2        
	//   15   26:imul            
	//   16   27:newarray        int[]
	//   17   29:astore          4
			String as[] = new String[stackSize * 2];
	//   18   31:aload_0         
	//   19   32:getfield        #121 <Field int stackSize>
	//   20   35:iconst_2        
	//   21   36:imul            
	//   22   37:anewarray       String[]
	//   23   40:astore          5
			System.arraycopy(((Object) (stack)), 0, ((Object) (ai)), 0, stackSize);
	//   24   42:aload_0         
	//   25   43:getfield        #119 <Field int[] stack>
	//   26   46:iconst_0        
	//   27   47:aload_3         
	//   28   48:iconst_0        
	//   29   49:aload_0         
	//   30   50:getfield        #121 <Field int stackSize>
	//   31   53:invokestatic    #204 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (pathIndices)), 0, ((Object) (ai2)), 0, stackSize);
	//   32   56:aload_0         
	//   33   57:getfield        #125 <Field int[] pathIndices>
	//   34   60:iconst_0        
	//   35   61:aload           4
	//   36   63:iconst_0        
	//   37   64:aload_0         
	//   38   65:getfield        #121 <Field int stackSize>
	//   39   68:invokestatic    #204 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (pathNames)), 0, ((Object) (as)), 0, stackSize);
	//   40   71:aload_0         
	//   41   72:getfield        #123 <Field String[] pathNames>
	//   42   75:iconst_0        
	//   43   76:aload           5
	//   44   78:iconst_0        
	//   45   79:aload_0         
	//   46   80:getfield        #121 <Field int stackSize>
	//   47   83:invokestatic    #204 <Method void System.arraycopy(Object, int, Object, int, int)>
			stack = ai;
	//   48   86:aload_0         
	//   49   87:aload_3         
	//   50   88:putfield        #119 <Field int[] stack>
			pathIndices = ai2;
	//   51   91:aload_0         
	//   52   92:aload           4
	//   53   94:putfield        #125 <Field int[] pathIndices>
			pathNames = as;
	//   54   97:aload_0         
	//   55   98:aload           5
	//   56  100:putfield        #123 <Field String[] pathNames>
		}
		int ai1[] = stack;
	//   57  103:aload_0         
	//   58  104:getfield        #119 <Field int[] stack>
	//   59  107:astore_3        
		int j = stackSize;
	//   60  108:aload_0         
	//   61  109:getfield        #121 <Field int stackSize>
	//   62  112:istore_2        
		stackSize = j + 1;
	//   63  113:aload_0         
	//   64  114:iload_2         
	//   65  115:iconst_1        
	//   66  116:iadd            
	//   67  117:putfield        #121 <Field int stackSize>
		ai1[j] = i;
	//   68  120:aload_3         
	//   69  121:iload_2         
	//   70  122:iload_1         
	//   71  123:iastore         
	//   72  124:return          
	}

	private char readEscapeCharacter()
	{
		char c;
		if(pos == limit && !fillBuffer(1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field int pos>
	//*   2    4:aload_0         
	//*   3    5:getfield        #111 <Field int limit>
	//*   4    8:icmpne          27
	//*   5   11:aload_0         
	//*   6   12:iconst_1        
	//*   7   13:invokespecial   #167 <Method boolean fillBuffer(int)>
	//*   8   16:ifne            27
			throw syntaxError("Unterminated escape sequence");
	//    9   19:aload_0         
	//   10   20:ldc2            #292 <String "Unterminated escape sequence">
	//   11   23:invokespecial   #158 <Method IOException syntaxError(String)>
	//   12   26:athrow          
		char ac[] = buffer;
	//   13   27:aload_0         
	//   14   28:getfield        #107 <Field char[] buffer>
	//   15   31:astore          6
		int i = pos;
	//   16   33:aload_0         
	//   17   34:getfield        #109 <Field int pos>
	//   18   37:istore_2        
		pos = i + 1;
	//   19   38:aload_0         
	//   20   39:iload_2         
	//   21   40:iconst_1        
	//   22   41:iadd            
	//   23   42:putfield        #109 <Field int pos>
		c = ac[i];
	//   24   45:aload           6
	//   25   47:iload_2         
	//   26   48:caload          
	//   27   49:istore_1        
		if(c == '\n') goto _L2; else goto _L1
	//   28   50:iload_1         
	//   29   51:bipush          10
	//   30   53:icmpeq          328
_L1:
		if(c == 'b') goto _L4; else goto _L3
	//   31   56:iload_1         
	//   32   57:bipush          98
	//   33   59:icmpeq          325
_L3:
		if(c == 'f') goto _L6; else goto _L5
	//   34   62:iload_1         
	//   35   63:bipush          102
	//   36   65:icmpeq          322
_L5:
		if(c == 'n') goto _L8; else goto _L7
	//   37   68:iload_1         
	//   38   69:bipush          110
	//   39   71:icmpeq          319
_L7:
		if(c == 'r') goto _L10; else goto _L9
	//   40   74:iload_1         
	//   41   75:bipush          114
	//   42   77:icmpeq          316
_L9:
		c;
	//   43   80:iload_1         
		JVM INSTR tableswitch 116 117: default 104
	//	               116 313
	//	               117 106;
	//   44   81:tableswitch     116 117: default 104
	//	               116 313
	//	               117 106
		   goto _L11 _L12 _L13
_L11:
		return c;
	//   45  104:iload_1         
	//   46  105:ireturn         
_L13:
		int j;
		int k;
		if(pos + 4 > limit && !fillBuffer(4))
	//*  47  106:aload_0         
	//*  48  107:getfield        #109 <Field int pos>
	//*  49  110:iconst_4        
	//*  50  111:iadd            
	//*  51  112:aload_0         
	//*  52  113:getfield        #111 <Field int limit>
	//*  53  116:icmple          135
	//*  54  119:aload_0         
	//*  55  120:iconst_4        
	//*  56  121:invokespecial   #167 <Method boolean fillBuffer(int)>
	//*  57  124:ifne            135
			throw syntaxError("Unterminated escape sequence");
	//   58  127:aload_0         
	//   59  128:ldc2            #292 <String "Unterminated escape sequence">
	//   60  131:invokespecial   #158 <Method IOException syntaxError(String)>
	//   61  134:athrow          
		c = '\0';
	//   62  135:iconst_0        
	//   63  136:istore_1        
		k = pos;
	//   64  137:aload_0         
	//   65  138:getfield        #109 <Field int pos>
	//   66  141:istore_3        
		j = k;
	//   67  142:iload_3         
	//   68  143:istore_2        
_L20:
		int l;
		char c1;
		l = j;
	//   69  144:iload_2         
	//   70  145:istore          4
		if(l >= k + 4)
			break; /* Loop/switch isn't completed */
	//   71  147:iload           4
	//   72  149:iload_3         
	//   73  150:iconst_4        
	//   74  151:iadd            
	//   75  152:icmpge          301
		j = ((int) (buffer[l]));
	//   76  155:aload_0         
	//   77  156:getfield        #107 <Field char[] buffer>
	//   78  159:iload           4
	//   79  161:caload          
	//   80  162:istore_2        
		c1 = (char)(c << 4);
	//   81  163:iload_1         
	//   82  164:iconst_4        
	//   83  165:ishl            
	//   84  166:int2char        
	//   85  167:istore          5
		if(j < 48 || j > 57) goto _L15; else goto _L14
	//   86  169:iload_2         
	//   87  170:bipush          48
	//   88  172:icmplt          195
	//   89  175:iload_2         
	//   90  176:bipush          57
	//   91  178:icmpgt          195
_L14:
		j -= 48;
	//   92  181:iload_2         
	//   93  182:bipush          48
	//   94  184:isub            
	//   95  185:istore_2        
_L17:
		c = (char)(c1 + j);
	//   96  186:iload           5
	//   97  188:iload_2         
	//   98  189:iadd            
	//   99  190:int2char        
	//  100  191:istore_1        
	//* 101  192:goto            240
	//* 102  195:iload_2         
	//* 103  196:bipush          97
	//* 104  198:icmplt          220
	//* 105  201:iload_2         
	//* 106  202:bipush          102
	//* 107  204:icmpgt          220
	//* 108  207:iload_2         
	//* 109  208:bipush          97
	//* 110  210:isub            
	//* 111  211:istore_2        
	//* 112  212:iload_2         
	//* 113  213:bipush          10
	//* 114  215:iadd            
	//* 115  216:istore_2        
	//* 116  217:goto            186
	//* 117  220:iload_2         
	//* 118  221:bipush          65
	//* 119  223:icmplt          248
	//* 120  226:iload_2         
	//* 121  227:bipush          70
	//* 122  229:icmpgt          248
	//* 123  232:iload_2         
	//* 124  233:bipush          65
	//* 125  235:isub            
	//* 126  236:istore_2        
	//* 127  237:goto            212
		j = l + 1;
	//  128  240:iload           4
	//  129  242:iconst_1        
	//  130  243:iadd            
	//  131  244:istore_2        
		continue; /* Loop/switch isn't completed */
	//  132  245:goto            144
_L15:
		if(j < 97 || j > 102)
			break; /* Loop/switch isn't completed */
		j -= 97;
_L18:
		j += 10;
		if(true) goto _L17; else goto _L16
_L16:
		if(j >= 65 && j <= 70)
		{
			j -= 65;
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  133  248:new             #213 <Class StringBuilder>
	//  134  251:dup             
	//  135  252:invokespecial   #214 <Method void StringBuilder()>
	//  136  255:astore          6
			stringbuilder.append("\\u");
	//  137  257:aload           6
	//  138  259:ldc2            #294 <String "\\u">
	//  139  262:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  140  265:pop             
			stringbuilder.append(new String(buffer, pos, 4));
	//  141  266:aload           6
	//  142  268:new             #85  <Class String>
	//  143  271:dup             
	//  144  272:aload_0         
	//  145  273:getfield        #107 <Field char[] buffer>
	//  146  276:aload_0         
	//  147  277:getfield        #109 <Field int pos>
	//  148  280:iconst_4        
	//  149  281:invokespecial   #261 <Method void String(char[], int, int)>
	//  150  284:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  151  287:pop             
			throw new NumberFormatException(stringbuilder.toString());
	//  152  288:new             #296 <Class NumberFormatException>
	//  153  291:dup             
	//  154  292:aload           6
	//  155  294:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  156  297:invokespecial   #297 <Method void NumberFormatException(String)>
	//  157  300:athrow          
		}
		  goto _L18
		if(true) goto _L20; else goto _L19
_L19:
		pos = pos + 4;
	//  158  301:aload_0         
	//  159  302:aload_0         
	//  160  303:getfield        #109 <Field int pos>
	//  161  306:iconst_4        
	//  162  307:iadd            
	//  163  308:putfield        #109 <Field int pos>
		return c;
	//  164  311:iload_1         
	//  165  312:ireturn         
_L12:
		return '\t';
	//  166  313:bipush          9
	//  167  315:ireturn         
_L10:
		return '\r';
	//  168  316:bipush          13
	//  169  318:ireturn         
_L8:
		return '\n';
	//  170  319:bipush          10
	//  171  321:ireturn         
_L6:
		return '\f';
	//  172  322:bipush          12
	//  173  324:ireturn         
_L4:
		return '\b';
	//  174  325:bipush          8
	//  175  327:ireturn         
_L2:
		lineNumber = lineNumber + 1;
	//  176  328:aload_0         
	//  177  329:aload_0         
	//  178  330:getfield        #113 <Field int lineNumber>
	//  179  333:iconst_1        
	//  180  334:iadd            
	//  181  335:putfield        #113 <Field int lineNumber>
		lineStart = pos;
	//  182  338:aload_0         
	//  183  339:aload_0         
	//  184  340:getfield        #109 <Field int pos>
	//  185  343:putfield        #115 <Field int lineStart>
		return c;
	//  186  346:iload_1         
	//  187  347:ireturn         
	}

	private void skipQuotedValue(char c)
	{
		char ac[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore          5
label0:
		do
		{
			int i = pos;
	//    3    6:aload_0         
	//    4    7:getfield        #109 <Field int pos>
	//    5   10:istore_2        
			int j;
			for(int k = limit; i < k; i = j)
	//*   6   11:aload_0         
	//*   7   12:getfield        #111 <Field int limit>
	//*   8   15:istore          4
	//*   9   17:iload_2         
	//*  10   18:iload           4
	//*  11   20:icmpge          88
			{
				j = i + 1;
	//   12   23:iload_2         
	//   13   24:iconst_1        
	//   14   25:iadd            
	//   15   26:istore_3        
				i = ((int) (ac[i]));
	//   16   27:aload           5
	//   17   29:iload_2         
	//   18   30:caload          
	//   19   31:istore_2        
				if(i == c)
	//*  20   32:iload_2         
	//*  21   33:iload_1         
	//*  22   34:icmpne          43
				{
					pos = j;
	//   23   37:aload_0         
	//   24   38:iload_3         
	//   25   39:putfield        #109 <Field int pos>
					return;
	//   26   42:return          
				}
				if(i == 92)
	//*  27   43:iload_2         
	//*  28   44:bipush          92
	//*  29   46:icmpne          62
				{
					pos = j;
	//   30   49:aload_0         
	//   31   50:iload_3         
	//   32   51:putfield        #109 <Field int pos>
					readEscapeCharacter();
	//   33   54:aload_0         
	//   34   55:invokespecial   #252 <Method char readEscapeCharacter()>
	//   35   58:pop             
					continue label0;
	//   36   59:goto            6
				}
				if(i == 10)
	//*  37   62:iload_2         
	//*  38   63:bipush          10
	//*  39   65:icmpne          83
				{
					lineNumber = lineNumber + 1;
	//   40   68:aload_0         
	//   41   69:aload_0         
	//   42   70:getfield        #113 <Field int lineNumber>
	//   43   73:iconst_1        
	//   44   74:iadd            
	//   45   75:putfield        #113 <Field int lineNumber>
					lineStart = j;
	//   46   78:aload_0         
	//   47   79:iload_3         
	//   48   80:putfield        #115 <Field int lineStart>
				}
			}

	//   49   83:iload_3         
	//   50   84:istore_2        
	//*  51   85:goto            17
			pos = i;
	//   52   88:aload_0         
	//   53   89:iload_2         
	//   54   90:putfield        #109 <Field int pos>
			if(!fillBuffer(1))
	//*  55   93:aload_0         
	//*  56   94:iconst_1        
	//*  57   95:invokespecial   #167 <Method boolean fillBuffer(int)>
	//*  58   98:ifne            6
				throw syntaxError("Unterminated string");
	//   59  101:aload_0         
	//   60  102:ldc2            #257 <String "Unterminated string">
	//   61  105:invokespecial   #158 <Method IOException syntaxError(String)>
	//   62  108:athrow          
		} while(true);
	}

	private boolean skipTo(String s)
	{
_L7:
		int i;
		int j = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field int pos>
	//    2    4:istore_3        
		int k = s.length();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #276 <Method int String.length()>
	//    5    9:istore          4
		int l = limit;
	//    6   11:aload_0         
	//    7   12:getfield        #111 <Field int limit>
	//    8   15:istore          5
		i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		if(j + k > l && !fillBuffer(s.length()))
	//*  11   19:iload_3         
	//*  12   20:iload           4
	//*  13   22:iadd            
	//*  14   23:iload           5
	//*  15   25:icmple          44
	//*  16   28:aload_0         
	//*  17   29:aload_1         
	//*  18   30:invokevirtual   #276 <Method int String.length()>
	//*  19   33:invokespecial   #167 <Method boolean fillBuffer(int)>
	//*  20   36:ifeq            42
	//*  21   39:goto            44
			return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
		if(buffer[pos] != '\n') goto _L2; else goto _L1
	//   24   44:aload_0         
	//   25   45:getfield        #107 <Field char[] buffer>
	//   26   48:aload_0         
	//   27   49:getfield        #109 <Field int pos>
	//   28   52:caload          
	//   29   53:bipush          10
	//   30   55:icmpne          81
_L1:
		lineNumber = lineNumber + 1;
	//   31   58:aload_0         
	//   32   59:aload_0         
	//   33   60:getfield        #113 <Field int lineNumber>
	//   34   63:iconst_1        
	//   35   64:iadd            
	//   36   65:putfield        #113 <Field int lineNumber>
		lineStart = pos + 1;
	//   37   68:aload_0         
	//   38   69:aload_0         
	//   39   70:getfield        #109 <Field int pos>
	//   40   73:iconst_1        
	//   41   74:iadd            
	//   42   75:putfield        #115 <Field int lineStart>
		  goto _L3
	//*  43   78:goto            108
_L2:
		if(i >= s.length())
			break; /* Loop/switch isn't completed */
	//   44   81:iload_2         
	//   45   82:aload_1         
	//   46   83:invokevirtual   #276 <Method int String.length()>
	//   47   86:icmpge          128
		if(buffer[pos + i] == s.charAt(i)) goto _L4; else goto _L3
	//   48   89:aload_0         
	//   49   90:getfield        #107 <Field char[] buffer>
	//   50   93:aload_0         
	//   51   94:getfield        #109 <Field int pos>
	//   52   97:iload_2         
	//   53   98:iadd            
	//   54   99:caload          
	//   55  100:aload_1         
	//   56  101:iload_2         
	//   57  102:invokevirtual   #280 <Method char String.charAt(int)>
	//   58  105:icmpeq          121
_L3:
		pos = pos + 1;
	//   59  108:aload_0         
	//   60  109:aload_0         
	//   61  110:getfield        #109 <Field int pos>
	//   62  113:iconst_1        
	//   63  114:iadd            
	//   64  115:putfield        #109 <Field int pos>
		continue; /* Loop/switch isn't completed */
	//   65  118:goto            0
_L4:
		i++;
	//   66  121:iload_2         
	//   67  122:iconst_1        
	//   68  123:iadd            
	//   69  124:istore_2        
		if(true) goto _L2; else goto _L5
	//   70  125:goto            81
_L5:
		return true;
	//   71  128:iconst_1        
	//   72  129:ireturn         
		if(true) goto _L7; else goto _L6
_L6:
	}

	private void skipToEndOfLine()
	{
		int i;
		do
		{
			if(pos >= limit && !fillBuffer(1))
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field int pos>
	//    2    4:aload_0         
	//    3    5:getfield        #111 <Field int limit>
	//    4    8:icmplt          19
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:invokespecial   #167 <Method boolean fillBuffer(int)>
	//    8   16:ifeq            71
			char ac[] = buffer;
	//    9   19:aload_0         
	//   10   20:getfield        #107 <Field char[] buffer>
	//   11   23:astore_2        
			i = pos;
	//   12   24:aload_0         
	//   13   25:getfield        #109 <Field int pos>
	//   14   28:istore_1        
			pos = i + 1;
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #109 <Field int pos>
			i = ((int) (ac[i]));
	//   20   36:aload_2         
	//   21   37:iload_1         
	//   22   38:caload          
	//   23   39:istore_1        
			if(i == '\n')
	//*  24   40:iload_1         
	//*  25   41:bipush          10
	//*  26   43:icmpne          65
			{
				lineNumber = lineNumber + 1;
	//   27   46:aload_0         
	//   28   47:aload_0         
	//   29   48:getfield        #113 <Field int lineNumber>
	//   30   51:iconst_1        
	//   31   52:iadd            
	//   32   53:putfield        #113 <Field int lineNumber>
				lineStart = pos;
	//   33   56:aload_0         
	//   34   57:aload_0         
	//   35   58:getfield        #109 <Field int pos>
	//   36   61:putfield        #115 <Field int lineStart>
				return;
	//   37   64:return          
			}
		} while(i != '\r');
	//   38   65:iload_1         
	//   39   66:bipush          13
	//   40   68:icmpne          0
	//   41   71:return          
	}

	private void skipUnquotedValue()
	{
_L2:
		int i;
label0:
		{
			i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
			do
			{
				if(pos + i >= limit)
					break label0;
	//    2    2:aload_0         
	//    3    3:getfield        #109 <Field int pos>
	//    4    6:iload_1         
	//    5    7:iadd            
	//    6    8:aload_0         
	//    7    9:getfield        #111 <Field int limit>
	//    8   12:icmpge          186
				switch(buffer[pos + i])
	//*   9   15:aload_0         
	//*  10   16:getfield        #107 <Field char[] buffer>
	//*  11   19:aload_0         
	//*  12   20:getfield        #109 <Field int pos>
	//*  13   23:iload_1         
	//*  14   24:iadd            
	//*  15   25:caload          
				{
	//*  16   26:lookupswitch    16: default 164
	//	               9: 175
	//	               10: 175
	//	               12: 175
	//	               13: 175
	//	               32: 175
	//	               35: 171
	//	               44: 175
	//	               47: 171
	//	               58: 175
	//	               59: 171
	//	               61: 171
	//	               91: 175
	//	               92: 171
	//	               93: 175
	//	               123: 175
	//	               125: 175
				default:
					i++;
	//   17  164:iload_1         
	//   18  165:iconst_1        
	//   19  166:iadd            
	//   20  167:istore_1        
					break;
	//   21  168:goto            2

				case 35: // '#'
				case 47: // '/'
				case 59: // ';'
				case 61: // '='
				case 92: // '\\'
					checkLenient();
	//   22  171:aload_0         
	//   23  172:invokespecial   #171 <Method void checkLenient()>
					// fall through

				case 9: // '\t'
				case 10: // '\n'
				case 12: // '\f'
				case 13: // '\r'
				case 32: // ' '
				case 44: // ','
				case 58: // ':'
				case 91: // '['
				case 93: // ']'
				case 123: // '{'
				case 125: // '}'
label1:
					{
						pos = pos + i;
	//   24  175:aload_0         
	//   25  176:aload_0         
	//   26  177:getfield        #109 <Field int pos>
	//   27  180:iload_1         
	//   28  181:iadd            
	//   29  182:putfield        #109 <Field int pos>
						break label1;
					}
					break;
				}
			} while(true);
			break label0;
		}
		return;
	//   30  185:return          
		pos = pos + i;
	//   31  186:aload_0         
	//   32  187:aload_0         
	//   33  188:getfield        #109 <Field int pos>
	//   34  191:iload_1         
	//   35  192:iadd            
	//   36  193:putfield        #109 <Field int pos>
		if(!fillBuffer(1))
	//*  37  196:aload_0         
	//*  38  197:iconst_1        
	//*  39  198:invokespecial   #167 <Method boolean fillBuffer(int)>
	//*  40  201:ifne            0
			return;
	//   41  204:return          
		if(true) goto _L2; else goto _L1
_L1:
	}

	private IOException syntaxError(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #213 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #214 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(s);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append(" at line ");
	//    8   14:aload_2         
	//    9   15:ldc2            #302 <String " at line ">
	//   10   18:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(getLineNumber());
	//   12   22:aload_2         
	//   13   23:aload_0         
	//   14   24:invokespecial   #147 <Method int getLineNumber()>
	//   15   27:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   16   30:pop             
		stringbuilder.append(" column ");
	//   17   31:aload_2         
	//   18   32:ldc1            #225 <String " column ">
	//   19   34:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(getColumnNumber());
	//   21   38:aload_2         
	//   22   39:aload_0         
	//   23   40:invokespecial   #151 <Method int getColumnNumber()>
	//   24   43:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   25   46:pop             
		stringbuilder.append(" path ");
	//   26   47:aload_2         
	//   27   48:ldc2            #304 <String " path ">
	//   28   51:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
		stringbuilder.append(getPath());
	//   30   55:aload_2         
	//   31   56:aload_0         
	//   32   57:invokevirtual   #307 <Method String getPath()>
	//   33   60:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   34   63:pop             
		throw new MalformedJsonException(stringbuilder.toString());
	//   35   64:new             #309 <Class MalformedJsonException>
	//   36   67:dup             
	//   37   68:aload_2         
	//   38   69:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   39   72:invokespecial   #310 <Method void MalformedJsonException(String)>
	//   40   75:athrow          
	}

	public void beginArray()
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #143 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 3)
	//*  10   16:iload_1         
	//*  11   17:iconst_3        
	//*  12   18:icmpne          44
		{
			push(1);
	//   13   21:aload_0         
	//   14   22:iconst_1        
	//   15   23:invokespecial   #313 <Method void push(int)>
			pathIndices[stackSize - 1] = 0;
	//   16   26:aload_0         
	//   17   27:getfield        #125 <Field int[] pathIndices>
	//   18   30:aload_0         
	//   19   31:getfield        #121 <Field int stackSize>
	//   20   34:iconst_1        
	//   21   35:isub            
	//   22   36:iconst_0        
	//   23   37:iastore         
			peeked = 0;
	//   24   38:aload_0         
	//   25   39:iconst_0        
	//   26   40:putfield        #117 <Field int peeked>
			return;
	//   27   43:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   28   44:new             #213 <Class StringBuilder>
	//   29   47:dup             
	//   30   48:invokespecial   #214 <Method void StringBuilder()>
	//   31   51:astore_3        
			stringbuilder.append("Expected BEGIN_ARRAY but was ");
	//   32   52:aload_3         
	//   33   53:ldc2            #315 <String "Expected BEGIN_ARRAY but was ">
	//   34   56:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   35   59:pop             
			stringbuilder.append(((Object) (peek())));
	//   36   60:aload_3         
	//   37   61:aload_0         
	//   38   62:invokevirtual   #319 <Method JsonToken peek()>
	//   39   65:invokevirtual   #322 <Method StringBuilder StringBuilder.append(Object)>
	//   40   68:pop             
			stringbuilder.append(" at line ");
	//   41   69:aload_3         
	//   42   70:ldc2            #302 <String " at line ">
	//   43   73:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   44   76:pop             
			stringbuilder.append(getLineNumber());
	//   45   77:aload_3         
	//   46   78:aload_0         
	//   47   79:invokespecial   #147 <Method int getLineNumber()>
	//   48   82:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   49   85:pop             
			stringbuilder.append(" column ");
	//   50   86:aload_3         
	//   51   87:ldc1            #225 <String " column ">
	//   52   89:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   53   92:pop             
			stringbuilder.append(getColumnNumber());
	//   54   93:aload_3         
	//   55   94:aload_0         
	//   56   95:invokespecial   #151 <Method int getColumnNumber()>
	//   57   98:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   58  101:pop             
			stringbuilder.append(" path ");
	//   59  102:aload_3         
	//   60  103:ldc2            #304 <String " path ">
	//   61  106:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   62  109:pop             
			stringbuilder.append(getPath());
	//   63  110:aload_3         
	//   64  111:aload_0         
	//   65  112:invokevirtual   #307 <Method String getPath()>
	//   66  115:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   67  118:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   68  119:new             #177 <Class IllegalStateException>
	//   69  122:dup             
	//   70  123:aload_3         
	//   71  124:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   72  127:invokespecial   #180 <Method void IllegalStateException(String)>
	//   73  130:athrow          
		}
	}

	public void beginObject()
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #143 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 1)
	//*  10   16:iload_1         
	//*  11   17:iconst_1        
	//*  12   18:icmpne          32
		{
			push(3);
	//   13   21:aload_0         
	//   14   22:iconst_3        
	//   15   23:invokespecial   #313 <Method void push(int)>
			peeked = 0;
	//   16   26:aload_0         
	//   17   27:iconst_0        
	//   18   28:putfield        #117 <Field int peeked>
			return;
	//   19   31:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   20   32:new             #213 <Class StringBuilder>
	//   21   35:dup             
	//   22   36:invokespecial   #214 <Method void StringBuilder()>
	//   23   39:astore_3        
			stringbuilder.append("Expected BEGIN_OBJECT but was ");
	//   24   40:aload_3         
	//   25   41:ldc2            #325 <String "Expected BEGIN_OBJECT but was ">
	//   26   44:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   27   47:pop             
			stringbuilder.append(((Object) (peek())));
	//   28   48:aload_3         
	//   29   49:aload_0         
	//   30   50:invokevirtual   #319 <Method JsonToken peek()>
	//   31   53:invokevirtual   #322 <Method StringBuilder StringBuilder.append(Object)>
	//   32   56:pop             
			stringbuilder.append(" at line ");
	//   33   57:aload_3         
	//   34   58:ldc2            #302 <String " at line ">
	//   35   61:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   36   64:pop             
			stringbuilder.append(getLineNumber());
	//   37   65:aload_3         
	//   38   66:aload_0         
	//   39   67:invokespecial   #147 <Method int getLineNumber()>
	//   40   70:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   41   73:pop             
			stringbuilder.append(" column ");
	//   42   74:aload_3         
	//   43   75:ldc1            #225 <String " column ">
	//   44   77:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   45   80:pop             
			stringbuilder.append(getColumnNumber());
	//   46   81:aload_3         
	//   47   82:aload_0         
	//   48   83:invokespecial   #151 <Method int getColumnNumber()>
	//   49   86:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   50   89:pop             
			stringbuilder.append(" path ");
	//   51   90:aload_3         
	//   52   91:ldc2            #304 <String " path ">
	//   53   94:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   54   97:pop             
			stringbuilder.append(getPath());
	//   55   98:aload_3         
	//   56   99:aload_0         
	//   57  100:invokevirtual   #307 <Method String getPath()>
	//   58  103:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   59  106:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   60  107:new             #177 <Class IllegalStateException>
	//   61  110:dup             
	//   62  111:aload_3         
	//   63  112:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   64  115:invokespecial   #180 <Method void IllegalStateException(String)>
	//   65  118:athrow          
		}
	}

	public void close()
	{
		peeked = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #117 <Field int peeked>
		stack[0] = 8;
	//    3    5:aload_0         
	//    4    6:getfield        #119 <Field int[] stack>
	//    5    9:iconst_0        
	//    6   10:bipush          8
	//    7   12:iastore         
		stackSize = 1;
	//    8   13:aload_0         
	//    9   14:iconst_1        
	//   10   15:putfield        #121 <Field int stackSize>
		in.close();
	//   11   18:aload_0         
	//   12   19:getfield        #134 <Field Reader in>
	//   13   22:invokevirtual   #328 <Method void Reader.close()>
	//   14   25:return          
	}

	public void endArray()
	{
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = k;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(k == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #143 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 4)
	//*  10   16:iload_1         
	//*  11   17:iconst_4        
	//*  12   18:icmpne          57
		{
			stackSize = stackSize - 1;
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #121 <Field int stackSize>
	//   16   26:iconst_1        
	//   17   27:isub            
	//   18   28:putfield        #121 <Field int stackSize>
			int ai[] = pathIndices;
	//   19   31:aload_0         
	//   20   32:getfield        #125 <Field int[] pathIndices>
	//   21   35:astore_3        
			int j = stackSize - 1;
	//   22   36:aload_0         
	//   23   37:getfield        #121 <Field int stackSize>
	//   24   40:iconst_1        
	//   25   41:isub            
	//   26   42:istore_1        
			ai[j] = ai[j] + 1;
	//   27   43:aload_3         
	//   28   44:iload_1         
	//   29   45:aload_3         
	//   30   46:iload_1         
	//   31   47:iaload          
	//   32   48:iconst_1        
	//   33   49:iadd            
	//   34   50:iastore         
			peeked = 0;
	//   35   51:aload_0         
	//   36   52:iconst_0        
	//   37   53:putfield        #117 <Field int peeked>
			return;
	//   38   56:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   39   57:new             #213 <Class StringBuilder>
	//   40   60:dup             
	//   41   61:invokespecial   #214 <Method void StringBuilder()>
	//   42   64:astore_3        
			stringbuilder.append("Expected END_ARRAY but was ");
	//   43   65:aload_3         
	//   44   66:ldc2            #331 <String "Expected END_ARRAY but was ">
	//   45   69:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   46   72:pop             
			stringbuilder.append(((Object) (peek())));
	//   47   73:aload_3         
	//   48   74:aload_0         
	//   49   75:invokevirtual   #319 <Method JsonToken peek()>
	//   50   78:invokevirtual   #322 <Method StringBuilder StringBuilder.append(Object)>
	//   51   81:pop             
			stringbuilder.append(" at line ");
	//   52   82:aload_3         
	//   53   83:ldc2            #302 <String " at line ">
	//   54   86:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   55   89:pop             
			stringbuilder.append(getLineNumber());
	//   56   90:aload_3         
	//   57   91:aload_0         
	//   58   92:invokespecial   #147 <Method int getLineNumber()>
	//   59   95:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   60   98:pop             
			stringbuilder.append(" column ");
	//   61   99:aload_3         
	//   62  100:ldc1            #225 <String " column ">
	//   63  102:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   64  105:pop             
			stringbuilder.append(getColumnNumber());
	//   65  106:aload_3         
	//   66  107:aload_0         
	//   67  108:invokespecial   #151 <Method int getColumnNumber()>
	//   68  111:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   69  114:pop             
			stringbuilder.append(" path ");
	//   70  115:aload_3         
	//   71  116:ldc2            #304 <String " path ">
	//   72  119:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   73  122:pop             
			stringbuilder.append(getPath());
	//   74  123:aload_3         
	//   75  124:aload_0         
	//   76  125:invokevirtual   #307 <Method String getPath()>
	//   77  128:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   78  131:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   79  132:new             #177 <Class IllegalStateException>
	//   80  135:dup             
	//   81  136:aload_3         
	//   82  137:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   83  140:invokespecial   #180 <Method void IllegalStateException(String)>
	//   84  143:athrow          
		}
	}

	public void endObject()
	{
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = k;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(k == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #143 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 2)
	//*  10   16:iload_1         
	//*  11   17:iconst_2        
	//*  12   18:icmpne          67
		{
			stackSize = stackSize - 1;
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #121 <Field int stackSize>
	//   16   26:iconst_1        
	//   17   27:isub            
	//   18   28:putfield        #121 <Field int stackSize>
			pathNames[stackSize] = null;
	//   19   31:aload_0         
	//   20   32:getfield        #123 <Field String[] pathNames>
	//   21   35:aload_0         
	//   22   36:getfield        #121 <Field int stackSize>
	//   23   39:aconst_null     
	//   24   40:aastore         
			int ai[] = pathIndices;
	//   25   41:aload_0         
	//   26   42:getfield        #125 <Field int[] pathIndices>
	//   27   45:astore_3        
			int j = stackSize - 1;
	//   28   46:aload_0         
	//   29   47:getfield        #121 <Field int stackSize>
	//   30   50:iconst_1        
	//   31   51:isub            
	//   32   52:istore_1        
			ai[j] = ai[j] + 1;
	//   33   53:aload_3         
	//   34   54:iload_1         
	//   35   55:aload_3         
	//   36   56:iload_1         
	//   37   57:iaload          
	//   38   58:iconst_1        
	//   39   59:iadd            
	//   40   60:iastore         
			peeked = 0;
	//   41   61:aload_0         
	//   42   62:iconst_0        
	//   43   63:putfield        #117 <Field int peeked>
			return;
	//   44   66:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   45   67:new             #213 <Class StringBuilder>
	//   46   70:dup             
	//   47   71:invokespecial   #214 <Method void StringBuilder()>
	//   48   74:astore_3        
			stringbuilder.append("Expected END_OBJECT but was ");
	//   49   75:aload_3         
	//   50   76:ldc2            #334 <String "Expected END_OBJECT but was ">
	//   51   79:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   52   82:pop             
			stringbuilder.append(((Object) (peek())));
	//   53   83:aload_3         
	//   54   84:aload_0         
	//   55   85:invokevirtual   #319 <Method JsonToken peek()>
	//   56   88:invokevirtual   #322 <Method StringBuilder StringBuilder.append(Object)>
	//   57   91:pop             
			stringbuilder.append(" at line ");
	//   58   92:aload_3         
	//   59   93:ldc2            #302 <String " at line ">
	//   60   96:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   61   99:pop             
			stringbuilder.append(getLineNumber());
	//   62  100:aload_3         
	//   63  101:aload_0         
	//   64  102:invokespecial   #147 <Method int getLineNumber()>
	//   65  105:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   66  108:pop             
			stringbuilder.append(" column ");
	//   67  109:aload_3         
	//   68  110:ldc1            #225 <String " column ">
	//   69  112:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   70  115:pop             
			stringbuilder.append(getColumnNumber());
	//   71  116:aload_3         
	//   72  117:aload_0         
	//   73  118:invokespecial   #151 <Method int getColumnNumber()>
	//   74  121:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   75  124:pop             
			stringbuilder.append(" path ");
	//   76  125:aload_3         
	//   77  126:ldc2            #304 <String " path ">
	//   78  129:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   79  132:pop             
			stringbuilder.append(getPath());
	//   80  133:aload_3         
	//   81  134:aload_0         
	//   82  135:invokevirtual   #307 <Method String getPath()>
	//   83  138:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   84  141:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   85  142:new             #177 <Class IllegalStateException>
	//   86  145:dup             
	//   87  146:aload_3         
	//   88  147:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   89  150:invokespecial   #180 <Method void IllegalStateException(String)>
	//   90  153:athrow          
		}
	}

	public String getPath()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #213 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #214 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append('$');
	//    4    8:aload_3         
	//    5    9:bipush          36
	//    6   11:invokevirtual   #255 <Method StringBuilder StringBuilder.append(char)>
	//    7   14:pop             
		int j = stackSize;
	//    8   15:aload_0         
	//    9   16:getfield        #121 <Field int stackSize>
	//   10   19:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   20:iconst_0        
	//*  12   21:istore_1        
	//*  13   22:iload_1         
	//*  14   23:iload_2         
	//*  15   24:icmpge          133
			switch(stack[i])
	//*  16   27:aload_0         
	//*  17   28:getfield        #119 <Field int[] stack>
	//*  18   31:iload_1         
	//*  19   32:iaload          
			{
	//*  20   33:tableswitch     1 5: default 68
	//	               1 101
	//	               2 101
	//	               3 71
	//	               4 71
	//	               5 71
	//*  21   68:goto            126
			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
				stringbuilder.append('.');
	//   22   71:aload_3         
	//   23   72:bipush          46
	//   24   74:invokevirtual   #255 <Method StringBuilder StringBuilder.append(char)>
	//   25   77:pop             
				if(pathNames[i] != null)
	//*  26   78:aload_0         
	//*  27   79:getfield        #123 <Field String[] pathNames>
	//*  28   82:iload_1         
	//*  29   83:aaload          
	//*  30   84:ifnull          126
					stringbuilder.append(pathNames[i]);
	//   31   87:aload_3         
	//   32   88:aload_0         
	//   33   89:getfield        #123 <Field String[] pathNames>
	//   34   92:iload_1         
	//   35   93:aaload          
	//   36   94:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   37   97:pop             
				break;

	//*  38   98:goto            126
			case 1: // '\001'
			case 2: // '\002'
				stringbuilder.append('[');
	//   39  101:aload_3         
	//   40  102:bipush          91
	//   41  104:invokevirtual   #255 <Method StringBuilder StringBuilder.append(char)>
	//   42  107:pop             
				stringbuilder.append(pathIndices[i]);
	//   43  108:aload_3         
	//   44  109:aload_0         
	//   45  110:getfield        #125 <Field int[] pathIndices>
	//   46  113:iload_1         
	//   47  114:iaload          
	//   48  115:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   49  118:pop             
				stringbuilder.append(']');
	//   50  119:aload_3         
	//   51  120:bipush          93
	//   52  122:invokevirtual   #255 <Method StringBuilder StringBuilder.append(char)>
	//   53  125:pop             
				break;
			}

	//   54  126:iload_1         
	//   55  127:iconst_1        
	//   56  128:iadd            
	//   57  129:istore_1        
	//*  58  130:goto            22
		return stringbuilder.toString();
	//   59  133:aload_3         
	//   60  134:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   61  137:areturn         
	}

	public boolean hasNext()
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #143 <Method int doPeek()>
	//    9   15:istore_1        
		return i != 2 && i != 4;
	//   10   16:iload_1         
	//   11   17:iconst_2        
	//   12   18:icmpeq          28
	//   13   21:iload_1         
	//   14   22:iconst_4        
	//   15   23:icmpeq          28
	//   16   26:iconst_1        
	//   17   27:ireturn         
	//   18   28:iconst_0        
	//   19   29:ireturn         
	}

	public final boolean isLenient()
	{
		return lenient;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field boolean lenient>
	//    2    4:ireturn         
	}

	public boolean nextBoolean()
	{
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = k;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(k == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #143 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 5)
	//*  10   16:iload_1         
	//*  11   17:iconst_5        
	//*  12   18:icmpne          48
		{
			peeked = 0;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #117 <Field int peeked>
			int ai[] = pathIndices;
	//   16   26:aload_0         
	//   17   27:getfield        #125 <Field int[] pathIndices>
	//   18   30:astore_3        
			i = stackSize - 1;
	//   19   31:aload_0         
	//   20   32:getfield        #121 <Field int stackSize>
	//   21   35:iconst_1        
	//   22   36:isub            
	//   23   37:istore_1        
			ai[i] = ai[i] + 1;
	//   24   38:aload_3         
	//   25   39:iload_1         
	//   26   40:aload_3         
	//   27   41:iload_1         
	//   28   42:iaload          
	//   29   43:iconst_1        
	//   30   44:iadd            
	//   31   45:iastore         
			return true;
	//   32   46:iconst_1        
	//   33   47:ireturn         
		}
		if(i == 6)
	//*  34   48:iload_1         
	//*  35   49:bipush          6
	//*  36   51:icmpne          81
		{
			peeked = 0;
	//   37   54:aload_0         
	//   38   55:iconst_0        
	//   39   56:putfield        #117 <Field int peeked>
			int ai1[] = pathIndices;
	//   40   59:aload_0         
	//   41   60:getfield        #125 <Field int[] pathIndices>
	//   42   63:astore_3        
			int j = stackSize - 1;
	//   43   64:aload_0         
	//   44   65:getfield        #121 <Field int stackSize>
	//   45   68:iconst_1        
	//   46   69:isub            
	//   47   70:istore_1        
			ai1[j] = ai1[j] + 1;
	//   48   71:aload_3         
	//   49   72:iload_1         
	//   50   73:aload_3         
	//   51   74:iload_1         
	//   52   75:iaload          
	//   53   76:iconst_1        
	//   54   77:iadd            
	//   55   78:iastore         
			return false;
	//   56   79:iconst_0        
	//   57   80:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   58   81:new             #213 <Class StringBuilder>
	//   59   84:dup             
	//   60   85:invokespecial   #214 <Method void StringBuilder()>
	//   61   88:astore_3        
			stringbuilder.append("Expected a boolean but was ");
	//   62   89:aload_3         
	//   63   90:ldc2            #340 <String "Expected a boolean but was ">
	//   64   93:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   65   96:pop             
			stringbuilder.append(((Object) (peek())));
	//   66   97:aload_3         
	//   67   98:aload_0         
	//   68   99:invokevirtual   #319 <Method JsonToken peek()>
	//   69  102:invokevirtual   #322 <Method StringBuilder StringBuilder.append(Object)>
	//   70  105:pop             
			stringbuilder.append(" at line ");
	//   71  106:aload_3         
	//   72  107:ldc2            #302 <String " at line ">
	//   73  110:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   74  113:pop             
			stringbuilder.append(getLineNumber());
	//   75  114:aload_3         
	//   76  115:aload_0         
	//   77  116:invokespecial   #147 <Method int getLineNumber()>
	//   78  119:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   79  122:pop             
			stringbuilder.append(" column ");
	//   80  123:aload_3         
	//   81  124:ldc1            #225 <String " column ">
	//   82  126:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   83  129:pop             
			stringbuilder.append(getColumnNumber());
	//   84  130:aload_3         
	//   85  131:aload_0         
	//   86  132:invokespecial   #151 <Method int getColumnNumber()>
	//   87  135:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   88  138:pop             
			stringbuilder.append(" path ");
	//   89  139:aload_3         
	//   90  140:ldc2            #304 <String " path ">
	//   91  143:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   92  146:pop             
			stringbuilder.append(getPath());
	//   93  147:aload_3         
	//   94  148:aload_0         
	//   95  149:invokevirtual   #307 <Method String getPath()>
	//   96  152:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   97  155:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   98  156:new             #177 <Class IllegalStateException>
	//   99  159:dup             
	//  100  160:aload_3         
	//  101  161:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  102  164:invokespecial   #180 <Method void IllegalStateException(String)>
	//  103  167:athrow          
		}
	}

	public double nextDouble()
	{
		int i;
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore          5
		i = k;
	//    3    6:iload           5
	//    4    8:istore          4
		if(k == 0)
	//*   5   10:iload           5
	//*   6   12:ifne            21
			i = doPeek();
	//    7   15:aload_0         
	//    8   16:invokespecial   #143 <Method int doPeek()>
	//    9   19:istore          4
		if(i == 15)
	//*  10   21:iload           4
	//*  11   23:bipush          15
	//*  12   25:icmpne          65
		{
			peeked = 0;
	//   13   28:aload_0         
	//   14   29:iconst_0        
	//   15   30:putfield        #117 <Field int peeked>
			int ai[] = pathIndices;
	//   16   33:aload_0         
	//   17   34:getfield        #125 <Field int[] pathIndices>
	//   18   37:astore          6
			i = stackSize - 1;
	//   19   39:aload_0         
	//   20   40:getfield        #121 <Field int stackSize>
	//   21   43:iconst_1        
	//   22   44:isub            
	//   23   45:istore          4
			ai[i] = ai[i] + 1;
	//   24   47:aload           6
	//   25   49:iload           4
	//   26   51:aload           6
	//   27   53:iload           4
	//   28   55:iaload          
	//   29   56:iconst_1        
	//   30   57:iadd            
	//   31   58:iastore         
			return (double)peekedLong;
	//   32   59:aload_0         
	//   33   60:getfield        #286 <Field long peekedLong>
	//   34   63:l2d             
	//   35   64:dreturn         
		}
		if(i != 16) goto _L2; else goto _L1
	//   36   65:iload           4
	//   37   67:bipush          16
	//   38   69:icmpne          111
_L1:
		peekedString = new String(buffer, pos, peekedNumberLength);
	//   39   72:aload_0         
	//   40   73:new             #85  <Class String>
	//   41   76:dup             
	//   42   77:aload_0         
	//   43   78:getfield        #107 <Field char[] buffer>
	//   44   81:aload_0         
	//   45   82:getfield        #109 <Field int pos>
	//   46   85:aload_0         
	//   47   86:getfield        #288 <Field int peekedNumberLength>
	//   48   89:invokespecial   #261 <Method void String(char[], int, int)>
	//   49   92:putfield        #344 <Field String peekedString>
		pos = pos + peekedNumberLength;
	//   50   95:aload_0         
	//   51   96:aload_0         
	//   52   97:getfield        #109 <Field int pos>
	//   53  100:aload_0         
	//   54  101:getfield        #288 <Field int peekedNumberLength>
	//   55  104:iadd            
	//   56  105:putfield        #109 <Field int pos>
		  goto _L3
	//*  57  108:goto            280
_L2:
		if(i != 8 && i != 9) goto _L5; else goto _L4
	//   58  111:iload           4
	//   59  113:bipush          8
	//   60  115:icmpeq          254
	//   61  118:iload           4
	//   62  120:bipush          9
	//   63  122:icmpne          128
	//*  64  125:goto            254
_L5:
		if(i != 10) goto _L7; else goto _L6
	//   65  128:iload           4
	//   66  130:bipush          10
	//   67  132:icmpne          150
_L6:
		Object obj = ((Object) (nextUnquotedValue()));
	//   68  135:aload_0         
	//   69  136:invokespecial   #346 <Method String nextUnquotedValue()>
	//   70  139:astore          6
_L8:
		peekedString = ((String) (obj));
	//   71  141:aload_0         
	//   72  142:aload           6
	//   73  144:putfield        #344 <Field String peekedString>
		break; /* Loop/switch isn't completed */
	//   74  147:goto            280
_L7:
		if(i != 11)
	//*  75  150:iload           4
	//*  76  152:bipush          11
	//*  77  154:icmpeq          280
		{
			obj = ((Object) (new StringBuilder()));
	//   78  157:new             #213 <Class StringBuilder>
	//   79  160:dup             
	//   80  161:invokespecial   #214 <Method void StringBuilder()>
	//   81  164:astore          6
			((StringBuilder) (obj)).append("Expected a double but was ");
	//   82  166:aload           6
	//   83  168:ldc2            #348 <String "Expected a double but was ">
	//   84  171:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   85  174:pop             
			((StringBuilder) (obj)).append(((Object) (peek())));
	//   86  175:aload           6
	//   87  177:aload_0         
	//   88  178:invokevirtual   #319 <Method JsonToken peek()>
	//   89  181:invokevirtual   #322 <Method StringBuilder StringBuilder.append(Object)>
	//   90  184:pop             
			((StringBuilder) (obj)).append(" at line ");
	//   91  185:aload           6
	//   92  187:ldc2            #302 <String " at line ">
	//   93  190:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   94  193:pop             
			((StringBuilder) (obj)).append(getLineNumber());
	//   95  194:aload           6
	//   96  196:aload_0         
	//   97  197:invokespecial   #147 <Method int getLineNumber()>
	//   98  200:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   99  203:pop             
			((StringBuilder) (obj)).append(" column ");
	//  100  204:aload           6
	//  101  206:ldc1            #225 <String " column ">
	//  102  208:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  103  211:pop             
			((StringBuilder) (obj)).append(getColumnNumber());
	//  104  212:aload           6
	//  105  214:aload_0         
	//  106  215:invokespecial   #151 <Method int getColumnNumber()>
	//  107  218:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//  108  221:pop             
			((StringBuilder) (obj)).append(" path ");
	//  109  222:aload           6
	//  110  224:ldc2            #304 <String " path ">
	//  111  227:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  112  230:pop             
			((StringBuilder) (obj)).append(getPath());
	//  113  231:aload           6
	//  114  233:aload_0         
	//  115  234:invokevirtual   #307 <Method String getPath()>
	//  116  237:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  117  240:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//  118  241:new             #177 <Class IllegalStateException>
	//  119  244:dup             
	//  120  245:aload           6
	//  121  247:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  122  250:invokespecial   #180 <Method void IllegalStateException(String)>
	//  123  253:athrow          
		}
		break; /* Loop/switch isn't completed */
_L4:
		char c;
		if(i == 8)
	//* 124  254:iload           4
	//* 125  256:bipush          8
	//* 126  258:icmpne          267
			c = '\'';
	//  127  261:bipush          39
	//  128  263:istore_1        
		else
	//* 129  264:goto            270
			c = '"';
	//  130  267:bipush          34
	//  131  269:istore_1        
		obj = ((Object) (nextQuotedValue(c)));
	//  132  270:aload_0         
	//  133  271:iload_1         
	//  134  272:invokespecial   #350 <Method String nextQuotedValue(char)>
	//  135  275:astore          6
		if(true) goto _L8; else goto _L3
	//  136  277:goto            141
_L3:
		peeked = 11;
	//  137  280:aload_0         
	//  138  281:bipush          11
	//  139  283:putfield        #117 <Field int peeked>
		double d = Double.parseDouble(peekedString);
	//  140  286:aload_0         
	//  141  287:getfield        #344 <Field String peekedString>
	//  142  290:invokestatic    #356 <Method double Double.parseDouble(String)>
	//  143  293:dstore_2        
		if(!lenient && (Double.isNaN(d) || Double.isInfinite(d)))
	//* 144  294:aload_0         
	//* 145  295:getfield        #105 <Field boolean lenient>
	//* 146  298:ifne            409
	//* 147  301:dload_2         
	//* 148  302:invokestatic    #360 <Method boolean Double.isNaN(double)>
	//* 149  305:ifne            315
	//* 150  308:dload_2         
	//* 151  309:invokestatic    #363 <Method boolean Double.isInfinite(double)>
	//* 152  312:ifeq            409
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  153  315:new             #213 <Class StringBuilder>
	//  154  318:dup             
	//  155  319:invokespecial   #214 <Method void StringBuilder()>
	//  156  322:astore          6
			stringbuilder.append("JSON forbids NaN and infinities: ");
	//  157  324:aload           6
	//  158  326:ldc2            #365 <String "JSON forbids NaN and infinities: ">
	//  159  329:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  160  332:pop             
			stringbuilder.append(d);
	//  161  333:aload           6
	//  162  335:dload_2         
	//  163  336:invokevirtual   #368 <Method StringBuilder StringBuilder.append(double)>
	//  164  339:pop             
			stringbuilder.append(" at line ");
	//  165  340:aload           6
	//  166  342:ldc2            #302 <String " at line ">
	//  167  345:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  168  348:pop             
			stringbuilder.append(getLineNumber());
	//  169  349:aload           6
	//  170  351:aload_0         
	//  171  352:invokespecial   #147 <Method int getLineNumber()>
	//  172  355:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//  173  358:pop             
			stringbuilder.append(" column ");
	//  174  359:aload           6
	//  175  361:ldc1            #225 <String " column ">
	//  176  363:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  177  366:pop             
			stringbuilder.append(getColumnNumber());
	//  178  367:aload           6
	//  179  369:aload_0         
	//  180  370:invokespecial   #151 <Method int getColumnNumber()>
	//  181  373:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//  182  376:pop             
			stringbuilder.append(" path ");
	//  183  377:aload           6
	//  184  379:ldc2            #304 <String " path ">
	//  185  382:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  186  385:pop             
			stringbuilder.append(getPath());
	//  187  386:aload           6
	//  188  388:aload_0         
	//  189  389:invokevirtual   #307 <Method String getPath()>
	//  190  392:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  191  395:pop             
			throw new MalformedJsonException(stringbuilder.toString());
	//  192  396:new             #309 <Class MalformedJsonException>
	//  193  399:dup             
	//  194  400:aload           6
	//  195  402:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  196  405:invokespecial   #310 <Method void MalformedJsonException(String)>
	//  197  408:athrow          
		} else
		{
			peekedString = null;
	//  198  409:aload_0         
	//  199  410:aconst_null     
	//  200  411:putfield        #344 <Field String peekedString>
			peeked = 0;
	//  201  414:aload_0         
	//  202  415:iconst_0        
	//  203  416:putfield        #117 <Field int peeked>
			int ai1[] = pathIndices;
	//  204  419:aload_0         
	//  205  420:getfield        #125 <Field int[] pathIndices>
	//  206  423:astore          6
			int j = stackSize - 1;
	//  207  425:aload_0         
	//  208  426:getfield        #121 <Field int stackSize>
	//  209  429:iconst_1        
	//  210  430:isub            
	//  211  431:istore          4
			ai1[j] = ai1[j] + 1;
	//  212  433:aload           6
	//  213  435:iload           4
	//  214  437:aload           6
	//  215  439:iload           4
	//  216  441:iaload          
	//  217  442:iconst_1        
	//  218  443:iadd            
	//  219  444:iastore         
			return d;
	//  220  445:dload_2         
	//  221  446:dreturn         
		}
	}

	public int nextInt()
	{
		int l = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore          5
		int i = l;
	//    3    6:iload           5
	//    4    8:istore          4
		if(l == 0)
	//*   5   10:iload           5
	//*   6   12:ifne            21
			i = doPeek();
	//    7   15:aload_0         
	//    8   16:invokespecial   #143 <Method int doPeek()>
	//    9   19:istore          4
		if(i == 15)
	//*  10   21:iload           4
	//*  11   23:bipush          15
	//*  12   25:icmpne          177
		{
			i = (int)peekedLong;
	//   13   28:aload_0         
	//   14   29:getfield        #286 <Field long peekedLong>
	//   15   32:l2i             
	//   16   33:istore          4
			if(peekedLong != (long)i)
	//*  17   35:aload_0         
	//*  18   36:getfield        #286 <Field long peekedLong>
	//*  19   39:iload           4
	//*  20   41:i2l             
	//*  21   42:lcmp            
	//*  22   43:ifeq            143
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   23   46:new             #213 <Class StringBuilder>
	//   24   49:dup             
	//   25   50:invokespecial   #214 <Method void StringBuilder()>
	//   26   53:astore          6
				stringbuilder.append("Expected an int but was ");
	//   27   55:aload           6
	//   28   57:ldc2            #371 <String "Expected an int but was ">
	//   29   60:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   30   63:pop             
				stringbuilder.append(peekedLong);
	//   31   64:aload           6
	//   32   66:aload_0         
	//   33   67:getfield        #286 <Field long peekedLong>
	//   34   70:invokevirtual   #374 <Method StringBuilder StringBuilder.append(long)>
	//   35   73:pop             
				stringbuilder.append(" at line ");
	//   36   74:aload           6
	//   37   76:ldc2            #302 <String " at line ">
	//   38   79:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   39   82:pop             
				stringbuilder.append(getLineNumber());
	//   40   83:aload           6
	//   41   85:aload_0         
	//   42   86:invokespecial   #147 <Method int getLineNumber()>
	//   43   89:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   44   92:pop             
				stringbuilder.append(" column ");
	//   45   93:aload           6
	//   46   95:ldc1            #225 <String " column ">
	//   47   97:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   48  100:pop             
				stringbuilder.append(getColumnNumber());
	//   49  101:aload           6
	//   50  103:aload_0         
	//   51  104:invokespecial   #151 <Method int getColumnNumber()>
	//   52  107:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   53  110:pop             
				stringbuilder.append(" path ");
	//   54  111:aload           6
	//   55  113:ldc2            #304 <String " path ">
	//   56  116:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   57  119:pop             
				stringbuilder.append(getPath());
	//   58  120:aload           6
	//   59  122:aload_0         
	//   60  123:invokevirtual   #307 <Method String getPath()>
	//   61  126:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   62  129:pop             
				throw new NumberFormatException(stringbuilder.toString());
	//   63  130:new             #296 <Class NumberFormatException>
	//   64  133:dup             
	//   65  134:aload           6
	//   66  136:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   67  139:invokespecial   #297 <Method void NumberFormatException(String)>
	//   68  142:athrow          
			} else
			{
				peeked = 0;
	//   69  143:aload_0         
	//   70  144:iconst_0        
	//   71  145:putfield        #117 <Field int peeked>
				int ai[] = pathIndices;
	//   72  148:aload_0         
	//   73  149:getfield        #125 <Field int[] pathIndices>
	//   74  152:astore          6
				int i1 = stackSize - 1;
	//   75  154:aload_0         
	//   76  155:getfield        #121 <Field int stackSize>
	//   77  158:iconst_1        
	//   78  159:isub            
	//   79  160:istore          5
				ai[i1] = ai[i1] + 1;
	//   80  162:aload           6
	//   81  164:iload           5
	//   82  166:aload           6
	//   83  168:iload           5
	//   84  170:iaload          
	//   85  171:iconst_1        
	//   86  172:iadd            
	//   87  173:iastore         
				return i;
	//   88  174:iload           4
	//   89  176:ireturn         
			}
		}
		if(i == 16)
	//*  90  177:iload           4
	//*  91  179:bipush          16
	//*  92  181:icmpne          223
		{
			peekedString = new String(buffer, pos, peekedNumberLength);
	//   93  184:aload_0         
	//   94  185:new             #85  <Class String>
	//   95  188:dup             
	//   96  189:aload_0         
	//   97  190:getfield        #107 <Field char[] buffer>
	//   98  193:aload_0         
	//   99  194:getfield        #109 <Field int pos>
	//  100  197:aload_0         
	//  101  198:getfield        #288 <Field int peekedNumberLength>
	//  102  201:invokespecial   #261 <Method void String(char[], int, int)>
	//  103  204:putfield        #344 <Field String peekedString>
			pos = pos + peekedNumberLength;
	//  104  207:aload_0         
	//  105  208:aload_0         
	//  106  209:getfield        #109 <Field int pos>
	//  107  212:aload_0         
	//  108  213:getfield        #288 <Field int peekedNumberLength>
	//  109  216:iadd            
	//  110  217:putfield        #109 <Field int pos>
			break MISSING_BLOCK_LABEL_405;
	//  111  220:goto            405
		}
		if(i != 8 && i != 9)
	//* 112  223:iload           4
	//* 113  225:bipush          8
	//* 114  227:icmpeq          337
	//* 115  230:iload           4
	//* 116  232:bipush          9
	//* 117  234:icmpne          240
	//* 118  237:goto            337
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  119  240:new             #213 <Class StringBuilder>
	//  120  243:dup             
	//  121  244:invokespecial   #214 <Method void StringBuilder()>
	//  122  247:astore          6
			stringbuilder1.append("Expected an int but was ");
	//  123  249:aload           6
	//  124  251:ldc2            #371 <String "Expected an int but was ">
	//  125  254:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  126  257:pop             
			stringbuilder1.append(((Object) (peek())));
	//  127  258:aload           6
	//  128  260:aload_0         
	//  129  261:invokevirtual   #319 <Method JsonToken peek()>
	//  130  264:invokevirtual   #322 <Method StringBuilder StringBuilder.append(Object)>
	//  131  267:pop             
			stringbuilder1.append(" at line ");
	//  132  268:aload           6
	//  133  270:ldc2            #302 <String " at line ">
	//  134  273:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  135  276:pop             
			stringbuilder1.append(getLineNumber());
	//  136  277:aload           6
	//  137  279:aload_0         
	//  138  280:invokespecial   #147 <Method int getLineNumber()>
	//  139  283:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//  140  286:pop             
			stringbuilder1.append(" column ");
	//  141  287:aload           6
	//  142  289:ldc1            #225 <String " column ">
	//  143  291:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  144  294:pop             
			stringbuilder1.append(getColumnNumber());
	//  145  295:aload           6
	//  146  297:aload_0         
	//  147  298:invokespecial   #151 <Method int getColumnNumber()>
	//  148  301:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//  149  304:pop             
			stringbuilder1.append(" path ");
	//  150  305:aload           6
	//  151  307:ldc2            #304 <String " path ">
	//  152  310:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  153  313:pop             
			stringbuilder1.append(getPath());
	//  154  314:aload           6
	//  155  316:aload_0         
	//  156  317:invokevirtual   #307 <Method String getPath()>
	//  157  320:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  158  323:pop             
			throw new IllegalStateException(stringbuilder1.toString());
	//  159  324:new             #177 <Class IllegalStateException>
	//  160  327:dup             
	//  161  328:aload           6
	//  162  330:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  163  333:invokespecial   #180 <Method void IllegalStateException(String)>
	//  164  336:athrow          
		}
		char c;
		if(i == 8)
	//* 165  337:iload           4
	//* 166  339:bipush          8
	//* 167  341:icmpne          350
			c = '\'';
	//  168  344:bipush          39
	//  169  346:istore_1        
		else
	//* 170  347:goto            353
			c = '"';
	//  171  350:bipush          34
	//  172  352:istore_1        
		peekedString = nextQuotedValue(c);
	//  173  353:aload_0         
	//  174  354:aload_0         
	//  175  355:iload_1         
	//  176  356:invokespecial   #350 <Method String nextQuotedValue(char)>
	//  177  359:putfield        #344 <Field String peekedString>
		int j;
		int j1;
		int ai1[];
		j = Integer.parseInt(peekedString);
	//  178  362:aload_0         
	//  179  363:getfield        #344 <Field String peekedString>
	//  180  366:invokestatic    #380 <Method int Integer.parseInt(String)>
	//  181  369:istore          4
		peeked = 0;
	//  182  371:aload_0         
	//  183  372:iconst_0        
	//  184  373:putfield        #117 <Field int peeked>
		ai1 = pathIndices;
	//  185  376:aload_0         
	//  186  377:getfield        #125 <Field int[] pathIndices>
	//  187  380:astore          6
		j1 = stackSize - 1;
	//  188  382:aload_0         
	//  189  383:getfield        #121 <Field int stackSize>
	//  190  386:iconst_1        
	//  191  387:isub            
	//  192  388:istore          5
		ai1[j1] = ai1[j1] + 1;
	//  193  390:aload           6
	//  194  392:iload           5
	//  195  394:aload           6
	//  196  396:iload           5
	//  197  398:iaload          
	//  198  399:iconst_1        
	//  199  400:iadd            
	//  200  401:iastore         
		return j;
	//  201  402:iload           4
	//  202  404:ireturn         
_L2:
		peeked = 11;
	//  203  405:aload_0         
	//  204  406:bipush          11
	//  205  408:putfield        #117 <Field int peeked>
		double d = Double.parseDouble(peekedString);
	//  206  411:aload_0         
	//  207  412:getfield        #344 <Field String peekedString>
	//  208  415:invokestatic    #356 <Method double Double.parseDouble(String)>
	//  209  418:dstore_2        
		int k = (int)d;
	//  210  419:dload_2         
	//  211  420:d2i             
	//  212  421:istore          4
		if((double)k != d)
	//* 213  423:iload           4
	//* 214  425:i2d             
	//* 215  426:dload_2         
	//* 216  427:dcmpl           
	//* 217  428:ifeq            528
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//  218  431:new             #213 <Class StringBuilder>
	//  219  434:dup             
	//  220  435:invokespecial   #214 <Method void StringBuilder()>
	//  221  438:astore          6
			stringbuilder2.append("Expected an int but was ");
	//  222  440:aload           6
	//  223  442:ldc2            #371 <String "Expected an int but was ">
	//  224  445:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  225  448:pop             
			stringbuilder2.append(peekedString);
	//  226  449:aload           6
	//  227  451:aload_0         
	//  228  452:getfield        #344 <Field String peekedString>
	//  229  455:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  230  458:pop             
			stringbuilder2.append(" at line ");
	//  231  459:aload           6
	//  232  461:ldc2            #302 <String " at line ">
	//  233  464:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  234  467:pop             
			stringbuilder2.append(getLineNumber());
	//  235  468:aload           6
	//  236  470:aload_0         
	//  237  471:invokespecial   #147 <Method int getLineNumber()>
	//  238  474:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//  239  477:pop             
			stringbuilder2.append(" column ");
	//  240  478:aload           6
	//  241  480:ldc1            #225 <String " column ">
	//  242  482:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  243  485:pop             
			stringbuilder2.append(getColumnNumber());
	//  244  486:aload           6
	//  245  488:aload_0         
	//  246  489:invokespecial   #151 <Method int getColumnNumber()>
	//  247  492:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//  248  495:pop             
			stringbuilder2.append(" path ");
	//  249  496:aload           6
	//  250  498:ldc2            #304 <String " path ">
	//  251  501:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  252  504:pop             
			stringbuilder2.append(getPath());
	//  253  505:aload           6
	//  254  507:aload_0         
	//  255  508:invokevirtual   #307 <Method String getPath()>
	//  256  511:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  257  514:pop             
			throw new NumberFormatException(stringbuilder2.toString());
	//  258  515:new             #296 <Class NumberFormatException>
	//  259  518:dup             
	//  260  519:aload           6
	//  261  521:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  262  524:invokespecial   #297 <Method void NumberFormatException(String)>
	//  263  527:athrow          
		} else
		{
			peekedString = null;
	//  264  528:aload_0         
	//  265  529:aconst_null     
	//  266  530:putfield        #344 <Field String peekedString>
			peeked = 0;
	//  267  533:aload_0         
	//  268  534:iconst_0        
	//  269  535:putfield        #117 <Field int peeked>
			int ai2[] = pathIndices;
	//  270  538:aload_0         
	//  271  539:getfield        #125 <Field int[] pathIndices>
	//  272  542:astore          6
			int k1 = stackSize - 1;
	//  273  544:aload_0         
	//  274  545:getfield        #121 <Field int stackSize>
	//  275  548:iconst_1        
	//  276  549:isub            
	//  277  550:istore          5
			ai2[k1] = ai2[k1] + 1;
	//  278  552:aload           6
	//  279  554:iload           5
	//  280  556:aload           6
	//  281  558:iload           5
	//  282  560:iaload          
	//  283  561:iconst_1        
	//  284  562:iadd            
	//  285  563:iastore         
			return k;
	//  286  564:iload           4
	//  287  566:ireturn         
		}
		NumberFormatException numberformatexception;
		numberformatexception;
	//  288  567:astore          6
		if(true) goto _L2; else goto _L1
	//  289  569:goto            405
_L1:
	}

	public long nextLong()
	{
		int l = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore          5
		int i = l;
	//    3    6:iload           5
	//    4    8:istore          4
		if(l == 0)
	//*   5   10:iload           5
	//*   6   12:ifne            21
			i = doPeek();
	//    7   15:aload_0         
	//    8   16:invokespecial   #143 <Method int doPeek()>
	//    9   19:istore          4
		if(i == 15)
	//*  10   21:iload           4
	//*  11   23:bipush          15
	//*  12   25:icmpne          64
		{
			peeked = 0;
	//   13   28:aload_0         
	//   14   29:iconst_0        
	//   15   30:putfield        #117 <Field int peeked>
			int ai[] = pathIndices;
	//   16   33:aload_0         
	//   17   34:getfield        #125 <Field int[] pathIndices>
	//   18   37:astore          8
			i = stackSize - 1;
	//   19   39:aload_0         
	//   20   40:getfield        #121 <Field int stackSize>
	//   21   43:iconst_1        
	//   22   44:isub            
	//   23   45:istore          4
			ai[i] = ai[i] + 1;
	//   24   47:aload           8
	//   25   49:iload           4
	//   26   51:aload           8
	//   27   53:iload           4
	//   28   55:iaload          
	//   29   56:iconst_1        
	//   30   57:iadd            
	//   31   58:iastore         
			return peekedLong;
	//   32   59:aload_0         
	//   33   60:getfield        #286 <Field long peekedLong>
	//   34   63:lreturn         
		}
		if(i == 16)
	//*  35   64:iload           4
	//*  36   66:bipush          16
	//*  37   68:icmpne          110
		{
			peekedString = new String(buffer, pos, peekedNumberLength);
	//   38   71:aload_0         
	//   39   72:new             #85  <Class String>
	//   40   75:dup             
	//   41   76:aload_0         
	//   42   77:getfield        #107 <Field char[] buffer>
	//   43   80:aload_0         
	//   44   81:getfield        #109 <Field int pos>
	//   45   84:aload_0         
	//   46   85:getfield        #288 <Field int peekedNumberLength>
	//   47   88:invokespecial   #261 <Method void String(char[], int, int)>
	//   48   91:putfield        #344 <Field String peekedString>
			pos = pos + peekedNumberLength;
	//   49   94:aload_0         
	//   50   95:aload_0         
	//   51   96:getfield        #109 <Field int pos>
	//   52   99:aload_0         
	//   53  100:getfield        #288 <Field int peekedNumberLength>
	//   54  103:iadd            
	//   55  104:putfield        #109 <Field int pos>
			break MISSING_BLOCK_LABEL_292;
	//   56  107:goto            292
		}
		if(i != 8 && i != 9)
	//*  57  110:iload           4
	//*  58  112:bipush          8
	//*  59  114:icmpeq          224
	//*  60  117:iload           4
	//*  61  119:bipush          9
	//*  62  121:icmpne          127
	//*  63  124:goto            224
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   64  127:new             #213 <Class StringBuilder>
	//   65  130:dup             
	//   66  131:invokespecial   #214 <Method void StringBuilder()>
	//   67  134:astore          8
			stringbuilder.append("Expected a long but was ");
	//   68  136:aload           8
	//   69  138:ldc2            #384 <String "Expected a long but was ">
	//   70  141:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   71  144:pop             
			stringbuilder.append(((Object) (peek())));
	//   72  145:aload           8
	//   73  147:aload_0         
	//   74  148:invokevirtual   #319 <Method JsonToken peek()>
	//   75  151:invokevirtual   #322 <Method StringBuilder StringBuilder.append(Object)>
	//   76  154:pop             
			stringbuilder.append(" at line ");
	//   77  155:aload           8
	//   78  157:ldc2            #302 <String " at line ">
	//   79  160:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   80  163:pop             
			stringbuilder.append(getLineNumber());
	//   81  164:aload           8
	//   82  166:aload_0         
	//   83  167:invokespecial   #147 <Method int getLineNumber()>
	//   84  170:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   85  173:pop             
			stringbuilder.append(" column ");
	//   86  174:aload           8
	//   87  176:ldc1            #225 <String " column ">
	//   88  178:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   89  181:pop             
			stringbuilder.append(getColumnNumber());
	//   90  182:aload           8
	//   91  184:aload_0         
	//   92  185:invokespecial   #151 <Method int getColumnNumber()>
	//   93  188:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   94  191:pop             
			stringbuilder.append(" path ");
	//   95  192:aload           8
	//   96  194:ldc2            #304 <String " path ">
	//   97  197:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   98  200:pop             
			stringbuilder.append(getPath());
	//   99  201:aload           8
	//  100  203:aload_0         
	//  101  204:invokevirtual   #307 <Method String getPath()>
	//  102  207:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  103  210:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//  104  211:new             #177 <Class IllegalStateException>
	//  105  214:dup             
	//  106  215:aload           8
	//  107  217:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  108  220:invokespecial   #180 <Method void IllegalStateException(String)>
	//  109  223:athrow          
		}
		char c;
		if(i == 8)
	//* 110  224:iload           4
	//* 111  226:bipush          8
	//* 112  228:icmpne          237
			c = '\'';
	//  113  231:bipush          39
	//  114  233:istore_1        
		else
	//* 115  234:goto            240
			c = '"';
	//  116  237:bipush          34
	//  117  239:istore_1        
		peekedString = nextQuotedValue(c);
	//  118  240:aload_0         
	//  119  241:aload_0         
	//  120  242:iload_1         
	//  121  243:invokespecial   #350 <Method String nextQuotedValue(char)>
	//  122  246:putfield        #344 <Field String peekedString>
		int j;
		long l1;
		int ai1[];
		l1 = Long.parseLong(peekedString);
	//  123  249:aload_0         
	//  124  250:getfield        #344 <Field String peekedString>
	//  125  253:invokestatic    #390 <Method long Long.parseLong(String)>
	//  126  256:lstore          6
		peeked = 0;
	//  127  258:aload_0         
	//  128  259:iconst_0        
	//  129  260:putfield        #117 <Field int peeked>
		ai1 = pathIndices;
	//  130  263:aload_0         
	//  131  264:getfield        #125 <Field int[] pathIndices>
	//  132  267:astore          8
		j = stackSize - 1;
	//  133  269:aload_0         
	//  134  270:getfield        #121 <Field int stackSize>
	//  135  273:iconst_1        
	//  136  274:isub            
	//  137  275:istore          4
		ai1[j] = ai1[j] + 1;
	//  138  277:aload           8
	//  139  279:iload           4
	//  140  281:aload           8
	//  141  283:iload           4
	//  142  285:iaload          
	//  143  286:iconst_1        
	//  144  287:iadd            
	//  145  288:iastore         
		return l1;
	//  146  289:lload           6
	//  147  291:lreturn         
_L2:
		peeked = 11;
	//  148  292:aload_0         
	//  149  293:bipush          11
	//  150  295:putfield        #117 <Field int peeked>
		double d = Double.parseDouble(peekedString);
	//  151  298:aload_0         
	//  152  299:getfield        #344 <Field String peekedString>
	//  153  302:invokestatic    #356 <Method double Double.parseDouble(String)>
	//  154  305:dstore_2        
		long l2 = (long)d;
	//  155  306:dload_2         
	//  156  307:d2l             
	//  157  308:lstore          6
		if((double)l2 != d)
	//* 158  310:lload           6
	//* 159  312:l2d             
	//* 160  313:dload_2         
	//* 161  314:dcmpl           
	//* 162  315:ifeq            415
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  163  318:new             #213 <Class StringBuilder>
	//  164  321:dup             
	//  165  322:invokespecial   #214 <Method void StringBuilder()>
	//  166  325:astore          8
			stringbuilder1.append("Expected a long but was ");
	//  167  327:aload           8
	//  168  329:ldc2            #384 <String "Expected a long but was ">
	//  169  332:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  170  335:pop             
			stringbuilder1.append(peekedString);
	//  171  336:aload           8
	//  172  338:aload_0         
	//  173  339:getfield        #344 <Field String peekedString>
	//  174  342:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  175  345:pop             
			stringbuilder1.append(" at line ");
	//  176  346:aload           8
	//  177  348:ldc2            #302 <String " at line ">
	//  178  351:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  179  354:pop             
			stringbuilder1.append(getLineNumber());
	//  180  355:aload           8
	//  181  357:aload_0         
	//  182  358:invokespecial   #147 <Method int getLineNumber()>
	//  183  361:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//  184  364:pop             
			stringbuilder1.append(" column ");
	//  185  365:aload           8
	//  186  367:ldc1            #225 <String " column ">
	//  187  369:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  188  372:pop             
			stringbuilder1.append(getColumnNumber());
	//  189  373:aload           8
	//  190  375:aload_0         
	//  191  376:invokespecial   #151 <Method int getColumnNumber()>
	//  192  379:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//  193  382:pop             
			stringbuilder1.append(" path ");
	//  194  383:aload           8
	//  195  385:ldc2            #304 <String " path ">
	//  196  388:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  197  391:pop             
			stringbuilder1.append(getPath());
	//  198  392:aload           8
	//  199  394:aload_0         
	//  200  395:invokevirtual   #307 <Method String getPath()>
	//  201  398:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  202  401:pop             
			throw new NumberFormatException(stringbuilder1.toString());
	//  203  402:new             #296 <Class NumberFormatException>
	//  204  405:dup             
	//  205  406:aload           8
	//  206  408:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  207  411:invokespecial   #297 <Method void NumberFormatException(String)>
	//  208  414:athrow          
		} else
		{
			peekedString = null;
	//  209  415:aload_0         
	//  210  416:aconst_null     
	//  211  417:putfield        #344 <Field String peekedString>
			peeked = 0;
	//  212  420:aload_0         
	//  213  421:iconst_0        
	//  214  422:putfield        #117 <Field int peeked>
			int ai2[] = pathIndices;
	//  215  425:aload_0         
	//  216  426:getfield        #125 <Field int[] pathIndices>
	//  217  429:astore          8
			int k = stackSize - 1;
	//  218  431:aload_0         
	//  219  432:getfield        #121 <Field int stackSize>
	//  220  435:iconst_1        
	//  221  436:isub            
	//  222  437:istore          4
			ai2[k] = ai2[k] + 1;
	//  223  439:aload           8
	//  224  441:iload           4
	//  225  443:aload           8
	//  226  445:iload           4
	//  227  447:iaload          
	//  228  448:iconst_1        
	//  229  449:iadd            
	//  230  450:iastore         
			return l2;
	//  231  451:lload           6
	//  232  453:lreturn         
		}
		NumberFormatException numberformatexception;
		numberformatexception;
	//  233  454:astore          8
		if(true) goto _L2; else goto _L1
	//  234  456:goto            292
_L1:
	}

	public String nextName()
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_3        
		int i = j;
	//    3    5:iload_3         
	//    4    6:istore_2        
		if(j == 0)
	//*   5    7:iload_3         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #143 <Method int doPeek()>
	//    9   15:istore_2        
		String s;
		if(i == 14)
	//*  10   16:iload_2         
	//*  11   17:bipush          14
	//*  12   19:icmpne          31
		{
			s = nextUnquotedValue();
	//   13   22:aload_0         
	//   14   23:invokespecial   #346 <Method String nextUnquotedValue()>
	//   15   26:astore          4
		} else
	//*  16   28:goto            62
		{
			char c;
			if(i == 12)
	//*  17   31:iload_2         
	//*  18   32:bipush          12
	//*  19   34:icmpne          50
				c = '\'';
	//   20   37:bipush          39
	//   21   39:istore_1        
			else
	//*  22   40:aload_0         
	//*  23   41:iload_1         
	//*  24   42:invokespecial   #350 <Method String nextQuotedValue(char)>
	//*  25   45:astore          4
	//*  26   47:goto            62
			if(i == 13)
	//*  27   50:iload_2         
	//*  28   51:bipush          13
	//*  29   53:icmpne          83
			{
				c = '"';
	//   30   56:bipush          34
	//   31   58:istore_1        
			} else
	//*  32   59:goto            40
	//*  33   62:aload_0         
	//*  34   63:iconst_0        
	//*  35   64:putfield        #117 <Field int peeked>
	//*  36   67:aload_0         
	//*  37   68:getfield        #123 <Field String[] pathNames>
	//*  38   71:aload_0         
	//*  39   72:getfield        #121 <Field int stackSize>
	//*  40   75:iconst_1        
	//*  41   76:isub            
	//*  42   77:aload           4
	//*  43   79:aastore         
	//*  44   80:aload           4
	//*  45   82:areturn         
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   46   83:new             #213 <Class StringBuilder>
	//   47   86:dup             
	//   48   87:invokespecial   #214 <Method void StringBuilder()>
	//   49   90:astore          4
				stringbuilder.append("Expected a name but was ");
	//   50   92:aload           4
	//   51   94:ldc2            #393 <String "Expected a name but was ">
	//   52   97:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   53  100:pop             
				stringbuilder.append(((Object) (peek())));
	//   54  101:aload           4
	//   55  103:aload_0         
	//   56  104:invokevirtual   #319 <Method JsonToken peek()>
	//   57  107:invokevirtual   #322 <Method StringBuilder StringBuilder.append(Object)>
	//   58  110:pop             
				stringbuilder.append(" at line ");
	//   59  111:aload           4
	//   60  113:ldc2            #302 <String " at line ">
	//   61  116:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   62  119:pop             
				stringbuilder.append(getLineNumber());
	//   63  120:aload           4
	//   64  122:aload_0         
	//   65  123:invokespecial   #147 <Method int getLineNumber()>
	//   66  126:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   67  129:pop             
				stringbuilder.append(" column ");
	//   68  130:aload           4
	//   69  132:ldc1            #225 <String " column ">
	//   70  134:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   71  137:pop             
				stringbuilder.append(getColumnNumber());
	//   72  138:aload           4
	//   73  140:aload_0         
	//   74  141:invokespecial   #151 <Method int getColumnNumber()>
	//   75  144:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   76  147:pop             
				stringbuilder.append(" path ");
	//   77  148:aload           4
	//   78  150:ldc2            #304 <String " path ">
	//   79  153:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   80  156:pop             
				stringbuilder.append(getPath());
	//   81  157:aload           4
	//   82  159:aload_0         
	//   83  160:invokevirtual   #307 <Method String getPath()>
	//   84  163:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   85  166:pop             
				throw new IllegalStateException(stringbuilder.toString());
	//   86  167:new             #177 <Class IllegalStateException>
	//   87  170:dup             
	//   88  171:aload           4
	//   89  173:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   90  176:invokespecial   #180 <Method void IllegalStateException(String)>
	//   91  179:athrow          
			}
			s = nextQuotedValue(c);
		}
		peeked = 0;
		pathNames[stackSize - 1] = s;
		return s;
	}

	public void nextNull()
	{
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = k;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(k == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #143 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 7)
	//*  10   16:iload_1         
	//*  11   17:bipush          7
	//*  12   19:icmpne          48
		{
			peeked = 0;
	//   13   22:aload_0         
	//   14   23:iconst_0        
	//   15   24:putfield        #117 <Field int peeked>
			int ai[] = pathIndices;
	//   16   27:aload_0         
	//   17   28:getfield        #125 <Field int[] pathIndices>
	//   18   31:astore_3        
			int j = stackSize - 1;
	//   19   32:aload_0         
	//   20   33:getfield        #121 <Field int stackSize>
	//   21   36:iconst_1        
	//   22   37:isub            
	//   23   38:istore_1        
			ai[j] = ai[j] + 1;
	//   24   39:aload_3         
	//   25   40:iload_1         
	//   26   41:aload_3         
	//   27   42:iload_1         
	//   28   43:iaload          
	//   29   44:iconst_1        
	//   30   45:iadd            
	//   31   46:iastore         
			return;
	//   32   47:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   33   48:new             #213 <Class StringBuilder>
	//   34   51:dup             
	//   35   52:invokespecial   #214 <Method void StringBuilder()>
	//   36   55:astore_3        
			stringbuilder.append("Expected null but was ");
	//   37   56:aload_3         
	//   38   57:ldc2            #396 <String "Expected null but was ">
	//   39   60:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   40   63:pop             
			stringbuilder.append(((Object) (peek())));
	//   41   64:aload_3         
	//   42   65:aload_0         
	//   43   66:invokevirtual   #319 <Method JsonToken peek()>
	//   44   69:invokevirtual   #322 <Method StringBuilder StringBuilder.append(Object)>
	//   45   72:pop             
			stringbuilder.append(" at line ");
	//   46   73:aload_3         
	//   47   74:ldc2            #302 <String " at line ">
	//   48   77:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   49   80:pop             
			stringbuilder.append(getLineNumber());
	//   50   81:aload_3         
	//   51   82:aload_0         
	//   52   83:invokespecial   #147 <Method int getLineNumber()>
	//   53   86:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   54   89:pop             
			stringbuilder.append(" column ");
	//   55   90:aload_3         
	//   56   91:ldc1            #225 <String " column ">
	//   57   93:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   58   96:pop             
			stringbuilder.append(getColumnNumber());
	//   59   97:aload_3         
	//   60   98:aload_0         
	//   61   99:invokespecial   #151 <Method int getColumnNumber()>
	//   62  102:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   63  105:pop             
			stringbuilder.append(" path ");
	//   64  106:aload_3         
	//   65  107:ldc2            #304 <String " path ">
	//   66  110:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   67  113:pop             
			stringbuilder.append(getPath());
	//   68  114:aload_3         
	//   69  115:aload_0         
	//   70  116:invokevirtual   #307 <Method String getPath()>
	//   71  119:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   72  122:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   73  123:new             #177 <Class IllegalStateException>
	//   74  126:dup             
	//   75  127:aload_3         
	//   76  128:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   77  131:invokespecial   #180 <Method void IllegalStateException(String)>
	//   78  134:athrow          
		}
	}

	public String nextString()
	{
		int i;
		String s;
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_3        
		i = k;
	//    3    5:iload_3         
	//    4    6:istore_2        
		if(k == 0)
	//*   5    7:iload_3         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #143 <Method int doPeek()>
	//    9   15:istore_2        
		if(i == 10)
	//*  10   16:iload_2         
	//*  11   17:bipush          10
	//*  12   19:icmpne          31
		{
			s = nextUnquotedValue();
	//   13   22:aload_0         
	//   14   23:invokespecial   #346 <Method String nextUnquotedValue()>
	//   15   26:astore          4
			break MISSING_BLOCK_LABEL_140;
	//   16   28:goto            140
		}
		if(i != 8) goto _L2; else goto _L1
	//   17   31:iload_2         
	//   18   32:bipush          8
	//   19   34:icmpne          50
_L1:
		char c = '\'';
	//   20   37:bipush          39
	//   21   39:istore_1        
_L4:
		s = nextQuotedValue(c);
	//   22   40:aload_0         
	//   23   41:iload_1         
	//   24   42:invokespecial   #350 <Method String nextQuotedValue(char)>
	//   25   45:astore          4
		break MISSING_BLOCK_LABEL_140;
	//   26   47:goto            140
_L2:
		if(i != 9)
			break; /* Loop/switch isn't completed */
	//   27   50:iload_2         
	//   28   51:bipush          9
	//   29   53:icmpne          62
		c = '"';
	//   30   56:bipush          34
	//   31   58:istore_1        
		if(true) goto _L4; else goto _L3
	//   32   59:goto            40
_L3:
		if(i == 11)
	//*  33   62:iload_2         
	//*  34   63:bipush          11
	//*  35   65:icmpne          82
		{
			s = peekedString;
	//   36   68:aload_0         
	//   37   69:getfield        #344 <Field String peekedString>
	//   38   72:astore          4
			peekedString = null;
	//   39   74:aload_0         
	//   40   75:aconst_null     
	//   41   76:putfield        #344 <Field String peekedString>
		} else
	//*  42   79:goto            140
		if(i == 15)
	//*  43   82:iload_2         
	//*  44   83:bipush          15
	//*  45   85:icmpne          100
		{
			s = Long.toString(peekedLong);
	//   46   88:aload_0         
	//   47   89:getfield        #286 <Field long peekedLong>
	//   48   92:invokestatic    #400 <Method String Long.toString(long)>
	//   49   95:astore          4
		} else
	//*  50   97:goto            140
		{
			if(i != 16)
				break MISSING_BLOCK_LABEL_171;
	//   51  100:iload_2         
	//   52  101:bipush          16
	//   53  103:icmpne          171
			s = new String(buffer, pos, peekedNumberLength);
	//   54  106:new             #85  <Class String>
	//   55  109:dup             
	//   56  110:aload_0         
	//   57  111:getfield        #107 <Field char[] buffer>
	//   58  114:aload_0         
	//   59  115:getfield        #109 <Field int pos>
	//   60  118:aload_0         
	//   61  119:getfield        #288 <Field int peekedNumberLength>
	//   62  122:invokespecial   #261 <Method void String(char[], int, int)>
	//   63  125:astore          4
			pos = pos + peekedNumberLength;
	//   64  127:aload_0         
	//   65  128:aload_0         
	//   66  129:getfield        #109 <Field int pos>
	//   67  132:aload_0         
	//   68  133:getfield        #288 <Field int peekedNumberLength>
	//   69  136:iadd            
	//   70  137:putfield        #109 <Field int pos>
		}
		peeked = 0;
	//   71  140:aload_0         
	//   72  141:iconst_0        
	//   73  142:putfield        #117 <Field int peeked>
		int ai[] = pathIndices;
	//   74  145:aload_0         
	//   75  146:getfield        #125 <Field int[] pathIndices>
	//   76  149:astore          5
		int j = stackSize - 1;
	//   77  151:aload_0         
	//   78  152:getfield        #121 <Field int stackSize>
	//   79  155:iconst_1        
	//   80  156:isub            
	//   81  157:istore_2        
		ai[j] = ai[j] + 1;
	//   82  158:aload           5
	//   83  160:iload_2         
	//   84  161:aload           5
	//   85  163:iload_2         
	//   86  164:iaload          
	//   87  165:iconst_1        
	//   88  166:iadd            
	//   89  167:iastore         
		return s;
	//   90  168:aload           4
	//   91  170:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//   92  171:new             #213 <Class StringBuilder>
	//   93  174:dup             
	//   94  175:invokespecial   #214 <Method void StringBuilder()>
	//   95  178:astore          4
		stringbuilder.append("Expected a string but was ");
	//   96  180:aload           4
	//   97  182:ldc2            #402 <String "Expected a string but was ">
	//   98  185:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   99  188:pop             
		stringbuilder.append(((Object) (peek())));
	//  100  189:aload           4
	//  101  191:aload_0         
	//  102  192:invokevirtual   #319 <Method JsonToken peek()>
	//  103  195:invokevirtual   #322 <Method StringBuilder StringBuilder.append(Object)>
	//  104  198:pop             
		stringbuilder.append(" at line ");
	//  105  199:aload           4
	//  106  201:ldc2            #302 <String " at line ">
	//  107  204:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  108  207:pop             
		stringbuilder.append(getLineNumber());
	//  109  208:aload           4
	//  110  210:aload_0         
	//  111  211:invokespecial   #147 <Method int getLineNumber()>
	//  112  214:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//  113  217:pop             
		stringbuilder.append(" column ");
	//  114  218:aload           4
	//  115  220:ldc1            #225 <String " column ">
	//  116  222:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  117  225:pop             
		stringbuilder.append(getColumnNumber());
	//  118  226:aload           4
	//  119  228:aload_0         
	//  120  229:invokespecial   #151 <Method int getColumnNumber()>
	//  121  232:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//  122  235:pop             
		stringbuilder.append(" path ");
	//  123  236:aload           4
	//  124  238:ldc2            #304 <String " path ">
	//  125  241:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  126  244:pop             
		stringbuilder.append(getPath());
	//  127  245:aload           4
	//  128  247:aload_0         
	//  129  248:invokevirtual   #307 <Method String getPath()>
	//  130  251:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//  131  254:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//  132  255:new             #177 <Class IllegalStateException>
	//  133  258:dup             
	//  134  259:aload           4
	//  135  261:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  136  264:invokespecial   #180 <Method void IllegalStateException(String)>
	//  137  267:athrow          
	}

	public JsonToken peek()
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #143 <Method int doPeek()>
	//    9   15:istore_1        
		switch(i)
	//*  10   16:iload_1         
		{
	//*  11   17:tableswitch     1 17: default 100
	//	               1 144
	//	               2 140
	//	               3 136
	//	               4 132
	//	               5 128
	//	               6 128
	//	               7 124
	//	               8 120
	//	               9 120
	//	               10 120
	//	               11 120
	//	               12 116
	//	               13 116
	//	               14 116
	//	               15 112
	//	               16 112
	//	               17 108
		default:
			throw new AssertionError();
	//   12  100:new             #404 <Class AssertionError>
	//   13  103:dup             
	//   14  104:invokespecial   #405 <Method void AssertionError()>
	//   15  107:athrow          

		case 17: // '\021'
			return JsonToken.END_DOCUMENT;
	//   16  108:getstatic       #411 <Field JsonToken JsonToken.END_DOCUMENT>
	//   17  111:areturn         

		case 15: // '\017'
		case 16: // '\020'
			return JsonToken.NUMBER;
	//   18  112:getstatic       #414 <Field JsonToken JsonToken.NUMBER>
	//   19  115:areturn         

		case 12: // '\f'
		case 13: // '\r'
		case 14: // '\016'
			return JsonToken.NAME;
	//   20  116:getstatic       #417 <Field JsonToken JsonToken.NAME>
	//   21  119:areturn         

		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
		case 11: // '\013'
			return JsonToken.STRING;
	//   22  120:getstatic       #420 <Field JsonToken JsonToken.STRING>
	//   23  123:areturn         

		case 7: // '\007'
			return JsonToken.NULL;
	//   24  124:getstatic       #422 <Field JsonToken JsonToken.NULL>
	//   25  127:areturn         

		case 5: // '\005'
		case 6: // '\006'
			return JsonToken.BOOLEAN;
	//   26  128:getstatic       #425 <Field JsonToken JsonToken.BOOLEAN>
	//   27  131:areturn         

		case 4: // '\004'
			return JsonToken.END_ARRAY;
	//   28  132:getstatic       #428 <Field JsonToken JsonToken.END_ARRAY>
	//   29  135:areturn         

		case 3: // '\003'
			return JsonToken.BEGIN_ARRAY;
	//   30  136:getstatic       #431 <Field JsonToken JsonToken.BEGIN_ARRAY>
	//   31  139:areturn         

		case 2: // '\002'
			return JsonToken.END_OBJECT;
	//   32  140:getstatic       #434 <Field JsonToken JsonToken.END_OBJECT>
	//   33  143:areturn         

		case 1: // '\001'
			return JsonToken.BEGIN_OBJECT;
	//   34  144:getstatic       #437 <Field JsonToken JsonToken.BEGIN_OBJECT>
	//   35  147:areturn         
		}
	}

	public final void setLenient(boolean flag)
	{
		lenient = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #105 <Field boolean lenient>
	//    3    5:return          
	}

	public void skipValue()
	{
		int l = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
_L6:
		int i1;
		int i = peeked;
	//    2    2:aload_0         
	//    3    3:getfield        #117 <Field int peeked>
	//    4    6:istore_2        
		i1 = i;
	//    5    7:iload_2         
	//    6    8:istore          4
		if(i == 0)
	//*   7   10:iload_2         
	//*   8   11:ifne            20
			i1 = doPeek();
	//    9   14:aload_0         
	//   10   15:invokespecial   #143 <Method int doPeek()>
	//   11   18:istore          4
		if(i1 != 3) goto _L2; else goto _L1
	//   12   20:iload           4
	//   13   22:iconst_3        
	//   14   23:icmpne          38
_L1:
		push(1);
	//   15   26:aload_0         
	//   16   27:iconst_1        
	//   17   28:invokespecial   #313 <Method void push(int)>
_L4:
		int j;
		j = l + 1;
	//   18   31:iload_3         
	//   19   32:iconst_1        
	//   20   33:iadd            
	//   21   34:istore_2        
		break MISSING_BLOCK_LABEL_187;
	//   22   35:goto            187
_L2:
		if(i1 != 1)
			break; /* Loop/switch isn't completed */
	//   23   38:iload           4
	//   24   40:iconst_1        
	//   25   41:icmpne          52
		push(3);
	//   26   44:aload_0         
	//   27   45:iconst_3        
	//   28   46:invokespecial   #313 <Method void push(int)>
		if(true) goto _L4; else goto _L3
	//   29   49:goto            31
_L3:
		while(i1 == 4 || i1 == 2) 
	//*  30   52:iload           4
	//*  31   54:iconst_4        
	//*  32   55:icmpne          75
		{
			stackSize = stackSize - 1;
	//   33   58:aload_0         
	//   34   59:aload_0         
	//   35   60:getfield        #121 <Field int stackSize>
	//   36   63:iconst_1        
	//   37   64:isub            
	//   38   65:putfield        #121 <Field int stackSize>
			j = l - 1;
	//   39   68:iload_3         
	//   40   69:iconst_1        
	//   41   70:isub            
	//   42   71:istore_2        
			break MISSING_BLOCK_LABEL_187;
	//   43   72:goto            187
		}
	//   44   75:iload           4
	//   45   77:iconst_2        
	//   46   78:icmpne          84
	//*  47   81:goto            58
		if(i1 != 14 && i1 != 10)
	//*  48   84:iload           4
	//*  49   86:bipush          14
	//*  50   88:icmpeq          181
	//*  51   91:iload           4
	//*  52   93:bipush          10
	//*  53   95:icmpne          101
	//*  54   98:goto            181
		{
			char c;
			if(i1 != 8 && i1 != 12)
	//*  55  101:iload           4
	//*  56  103:bipush          8
	//*  57  105:icmpeq          168
	//*  58  108:iload           4
	//*  59  110:bipush          12
	//*  60  112:icmpne          118
	//*  61  115:goto            168
			{
				if(i1 != 9 && i1 != 13)
	//*  62  118:iload           4
	//*  63  120:bipush          9
	//*  64  122:icmpeq          162
	//*  65  125:iload           4
	//*  66  127:bipush          13
	//*  67  129:icmpne          135
	//*  68  132:goto            162
				{
					j = l;
	//   69  135:iload_3         
	//   70  136:istore_2        
					if(i1 == 16)
	//*  71  137:iload           4
	//*  72  139:bipush          16
	//*  73  141:icmpne          187
					{
						pos = pos + peekedNumberLength;
	//   74  144:aload_0         
	//   75  145:aload_0         
	//   76  146:getfield        #109 <Field int pos>
	//   77  149:aload_0         
	//   78  150:getfield        #288 <Field int peekedNumberLength>
	//   79  153:iadd            
	//   80  154:putfield        #109 <Field int pos>
						j = l;
	//   81  157:iload_3         
	//   82  158:istore_2        
					}
					break MISSING_BLOCK_LABEL_187;
	//   83  159:goto            187
				}
				c = '"';
	//   84  162:bipush          34
	//   85  164:istore_1        
			} else
	//*  86  165:goto            171
			{
				c = '\'';
	//   87  168:bipush          39
	//   88  170:istore_1        
			}
			skipQuotedValue(c);
	//   89  171:aload_0         
	//   90  172:iload_1         
	//   91  173:invokespecial   #442 <Method void skipQuotedValue(char)>
			j = l;
	//   92  176:iload_3         
	//   93  177:istore_2        
		} else
	//*  94  178:goto            187
		{
			skipUnquotedValue();
	//   95  181:aload_0         
	//   96  182:invokespecial   #444 <Method void skipUnquotedValue()>
			j = l;
	//   97  185:iload_3         
	//   98  186:istore_2        
		}
		peeked = 0;
	//   99  187:aload_0         
	//  100  188:iconst_0        
	//  101  189:putfield        #117 <Field int peeked>
		l = j;
	//  102  192:iload_2         
	//  103  193:istore_3        
		if(j == 0)
	//* 104  194:iload_2         
	//* 105  195:ifne            2
		{
			int ai[] = pathIndices;
	//  106  198:aload_0         
	//  107  199:getfield        #125 <Field int[] pathIndices>
	//  108  202:astore          5
			int k = stackSize - 1;
	//  109  204:aload_0         
	//  110  205:getfield        #121 <Field int stackSize>
	//  111  208:iconst_1        
	//  112  209:isub            
	//  113  210:istore_2        
			ai[k] = ai[k] + 1;
	//  114  211:aload           5
	//  115  213:iload_2         
	//  116  214:aload           5
	//  117  216:iload_2         
	//  118  217:iaload          
	//  119  218:iconst_1        
	//  120  219:iadd            
	//  121  220:iastore         
			pathNames[stackSize - 1] = "null";
	//  122  221:aload_0         
	//  123  222:getfield        #123 <Field String[] pathNames>
	//  124  225:aload_0         
	//  125  226:getfield        #121 <Field int stackSize>
	//  126  229:iconst_1        
	//  127  230:isub            
	//  128  231:ldc2            #263 <String "null">
	//  129  234:aastore         
			return;
	//  130  235:return          
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #213 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #214 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object)this).getClass().getSimpleName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #448 <Method Class Object.getClass()>
	//    7   13:invokevirtual   #453 <Method String Class.getSimpleName()>
	//    8   16:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(" at line ");
	//   10   20:aload_1         
	//   11   21:ldc2            #302 <String " at line ">
	//   12   24:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(getLineNumber());
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:invokespecial   #147 <Method int getLineNumber()>
	//   17   33:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   18   36:pop             
		stringbuilder.append(" column ");
	//   19   37:aload_1         
	//   20   38:ldc1            #225 <String " column ">
	//   21   40:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
		stringbuilder.append(getColumnNumber());
	//   23   44:aload_1         
	//   24   45:aload_0         
	//   25   46:invokespecial   #151 <Method int getColumnNumber()>
	//   26   49:invokevirtual   #223 <Method StringBuilder StringBuilder.append(int)>
	//   27   52:pop             
		return stringbuilder.toString();
	//   28   53:aload_1         
	//   29   54:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   30   57:areturn         
	}

	private static final long MIN_INCOMPLETE_INTEGER = 0x33333334L;
	private static final char NON_EXECUTE_PREFIX[] = ")]}'\n".toCharArray();
	private static final int NUMBER_CHAR_DECIMAL = 3;
	private static final int NUMBER_CHAR_DIGIT = 2;
	private static final int NUMBER_CHAR_EXP_DIGIT = 7;
	private static final int NUMBER_CHAR_EXP_E = 5;
	private static final int NUMBER_CHAR_EXP_SIGN = 6;
	private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
	private static final int NUMBER_CHAR_NONE = 0;
	private static final int NUMBER_CHAR_SIGN = 1;
	private static final int PEEKED_BEGIN_ARRAY = 3;
	private static final int PEEKED_BEGIN_OBJECT = 1;
	private static final int PEEKED_BUFFERED = 11;
	private static final int PEEKED_DOUBLE_QUOTED = 9;
	private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
	private static final int PEEKED_END_ARRAY = 4;
	private static final int PEEKED_END_OBJECT = 2;
	private static final int PEEKED_EOF = 17;
	private static final int PEEKED_FALSE = 6;
	private static final int PEEKED_LONG = 15;
	private static final int PEEKED_NONE = 0;
	private static final int PEEKED_NULL = 7;
	private static final int PEEKED_NUMBER = 16;
	private static final int PEEKED_SINGLE_QUOTED = 8;
	private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
	private static final int PEEKED_TRUE = 5;
	private static final int PEEKED_UNQUOTED = 10;
	private static final int PEEKED_UNQUOTED_NAME = 14;
	private final char buffer[] = new char[1024];
	private final Reader in;
	private boolean lenient;
	private int limit;
	private int lineNumber;
	private int lineStart;
	private int pathIndices[];
	private String pathNames[];
	private int peeked;
	private long peekedLong;
	private int peekedNumberLength;
	private String peekedString;
	private int pos;
	private int stack[];
	private int stackSize;

	static 
	{
	//    0    0:ldc1            #83  <String ")]}'\n">
	//    1    2:invokevirtual   #89  <Method char[] String.toCharArray()>
	//    2    5:putstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
		JsonReaderInternalAccess.INSTANCE = ((JsonReaderInternalAccess) (new JsonReaderInternalAccess() {

			public void promoteNameToValue(JsonReader jsonreader)
			{
				if(jsonreader instanceof JsonTreeReader)
			//*   0    0:aload_1         
			//*   1    1:instanceof      #15  <Class JsonTreeReader>
			//*   2    4:ifeq            15
				{
					((JsonTreeReader)jsonreader).promoteNameToValue();
			//    3    7:aload_1         
			//    4    8:checkcast       #15  <Class JsonTreeReader>
			//    5   11:invokevirtual   #17  <Method void JsonTreeReader.promoteNameToValue()>
					return;
			//    6   14:return          
				}
				int j = jsonreader.peeked;
			//    7   15:aload_1         
			//    8   16:invokestatic    #21  <Method int JsonReader.access$000(JsonReader)>
			//    9   19:istore_3        
				int i = j;
			//   10   20:iload_3         
			//   11   21:istore_2        
				if(j == 0)
			//*  12   22:iload_3         
			//*  13   23:ifne            31
					i = jsonreader.doPeek();
			//   14   26:aload_1         
			//   15   27:invokestatic    #24  <Method int JsonReader.access$100(JsonReader)>
			//   16   30:istore_2        
				if(i == 13)
			//*  17   31:iload_2         
			//*  18   32:bipush          13
			//*  19   34:icmpne          47
					i = 9;
			//   20   37:bipush          9
			//   21   39:istore_2        
				else
			//*  22   40:aload_1         
			//*  23   41:iload_2         
			//*  24   42:invokestatic    #28  <Method int JsonReader.access$002(JsonReader, int)>
			//*  25   45:pop             
			//*  26   46:return          
				if(i == 12)
			//*  27   47:iload_2         
			//*  28   48:bipush          12
			//*  29   50:icmpne          59
					i = 8;
			//   30   53:bipush          8
			//   31   55:istore_2        
				else
			//*  32   56:goto            40
				if(i == 14)
			//*  33   59:iload_2         
			//*  34   60:bipush          14
			//*  35   62:icmpne          71
				{
					i = 10;
			//   36   65:bipush          10
			//   37   67:istore_2        
				} else
			//*  38   68:goto            40
				{
					StringBuilder stringbuilder = new StringBuilder();
			//   39   71:new             #30  <Class StringBuilder>
			//   40   74:dup             
			//   41   75:invokespecial   #31  <Method void StringBuilder()>
			//   42   78:astore          4
					stringbuilder.append("Expected a name but was ");
			//   43   80:aload           4
			//   44   82:ldc1            #33  <String "Expected a name but was ">
			//   45   84:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
			//   46   87:pop             
					stringbuilder.append(((Object) (jsonreader.peek())));
			//   47   88:aload           4
			//   48   90:aload_1         
			//   49   91:invokevirtual   #41  <Method JsonToken JsonReader.peek()>
			//   50   94:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
			//   51   97:pop             
					stringbuilder.append(" ");
			//   52   98:aload           4
			//   53  100:ldc1            #46  <String " ">
			//   54  102:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
			//   55  105:pop             
					stringbuilder.append(" at line ");
			//   56  106:aload           4
			//   57  108:ldc1            #48  <String " at line ">
			//   58  110:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
			//   59  113:pop             
					stringbuilder.append(jsonreader.getLineNumber());
			//   60  114:aload           4
			//   61  116:aload_1         
			//   62  117:invokestatic    #51  <Method int JsonReader.access$200(JsonReader)>
			//   63  120:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
			//   64  123:pop             
					stringbuilder.append(" column ");
			//   65  124:aload           4
			//   66  126:ldc1            #56  <String " column ">
			//   67  128:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
			//   68  131:pop             
					stringbuilder.append(jsonreader.getColumnNumber());
			//   69  132:aload           4
			//   70  134:aload_1         
			//   71  135:invokestatic    #59  <Method int JsonReader.access$300(JsonReader)>
			//   72  138:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
			//   73  141:pop             
					stringbuilder.append(" path ");
			//   74  142:aload           4
			//   75  144:ldc1            #61  <String " path ">
			//   76  146:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
			//   77  149:pop             
					stringbuilder.append(jsonreader.getPath());
			//   78  150:aload           4
			//   79  152:aload_1         
			//   80  153:invokevirtual   #65  <Method String JsonReader.getPath()>
			//   81  156:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
			//   82  159:pop             
					throw new IllegalStateException(stringbuilder.toString());
			//   83  160:new             #67  <Class IllegalStateException>
			//   84  163:dup             
			//   85  164:aload           4
			//   86  166:invokevirtual   #70  <Method String StringBuilder.toString()>
			//   87  169:invokespecial   #73  <Method void IllegalStateException(String)>
			//   88  172:athrow          
				}
				jsonreader.peeked = i;
			}

		}
));
	//    3    8:new             #8   <Class JsonReader$1>
	//    4   11:dup             
	//    5   12:invokespecial   #94  <Method void JsonReader$1()>
	//    6   15:putstatic       #100 <Field JsonReaderInternalAccess JsonReaderInternalAccess.INSTANCE>
	//*   7   18:return          
	}


/*
	static int access$000(JsonReader jsonreader)
	{
		return jsonreader.peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:ireturn         
	}

*/


/*
	static int access$002(JsonReader jsonreader, int i)
	{
		jsonreader.peeked = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #117 <Field int peeked>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$100(JsonReader jsonreader)
	{
		return jsonreader.doPeek();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method int doPeek()>
	//    2    4:ireturn         
	}

*/


/*
	static int access$200(JsonReader jsonreader)
	{
		return jsonreader.getLineNumber();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method int getLineNumber()>
	//    2    4:ireturn         
	}

*/


/*
	static int access$300(JsonReader jsonreader)
	{
		return jsonreader.getColumnNumber();
	//    0    0:aload_0         
	//    1    1:invokespecial   #151 <Method int getColumnNumber()>
	//    2    4:ireturn         
	}

*/
}
