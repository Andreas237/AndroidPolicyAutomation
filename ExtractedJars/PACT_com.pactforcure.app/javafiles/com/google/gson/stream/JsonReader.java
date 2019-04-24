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
		throws IOException
	{
		if(!lenient)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field boolean lenient>
	//*   2    4:ifne            14
			throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
	//    3    7:aload_0         
	//    4    8:ldc1            #157 <String "Use JsonReader.setLenient(true) to accept malformed JSON">
	//    5   10:invokespecial   #161 <Method IOException syntaxError(String)>
	//    6   13:athrow          
		else
			return;
	//    7   14:return          
	}

	private void consumeNonExecutePrefix()
		throws IOException
	{
		nextNonWhitespace(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #166 <Method int nextNonWhitespace(boolean)>
	//    3    5:pop             
		pos = pos - 1;
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #109 <Field int pos>
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:putfield        #109 <Field int pos>
		if(pos + NON_EXECUTE_PREFIX.length <= limit || fillBuffer(NON_EXECUTE_PREFIX.length)) goto _L2; else goto _L1
	//   10   16:aload_0         
	//   11   17:getfield        #109 <Field int pos>
	//   12   20:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//   13   23:arraylength     
	//   14   24:iadd            
	//   15   25:aload_0         
	//   16   26:getfield        #111 <Field int limit>
	//   17   29:icmple          44
	//   18   32:aload_0         
	//   19   33:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//   20   36:arraylength     
	//   21   37:invokespecial   #170 <Method boolean fillBuffer(int)>
	//   22   40:ifne            44
_L1:
		return;
	//   23   43:return          
_L2:
		int i = 0;
	//   24   44:iconst_0        
	//   25   45:istore_1        
label0:
		do
		{
label1:
			{
				if(i >= NON_EXECUTE_PREFIX.length)
					break label1;
	//   26   46:iload_1         
	//   27   47:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//   28   50:arraylength     
	//   29   51:icmpge          80
				if(buffer[pos + i] != NON_EXECUTE_PREFIX[i])
					break label0;
	//   30   54:aload_0         
	//   31   55:getfield        #107 <Field char[] buffer>
	//   32   58:aload_0         
	//   33   59:getfield        #109 <Field int pos>
	//   34   62:iload_1         
	//   35   63:iadd            
	//   36   64:caload          
	//   37   65:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//   38   68:iload_1         
	//   39   69:caload          
	//   40   70:icmpne          43
				i++;
	//   41   73:iload_1         
	//   42   74:iconst_1        
	//   43   75:iadd            
	//   44   76:istore_1        
			}
		} while(true);
	//   45   77:goto            46
		if(true) goto _L1; else goto _L3
_L3:
		pos = pos + NON_EXECUTE_PREFIX.length;
	//   46   80:aload_0         
	//   47   81:aload_0         
	//   48   82:getfield        #109 <Field int pos>
	//   49   85:getstatic       #91  <Field char[] NON_EXECUTE_PREFIX>
	//   50   88:arraylength     
	//   51   89:iadd            
	//   52   90:putfield        #109 <Field int pos>
		return;
	//   53   93:return          
	}

	private int doPeek()
		throws IOException
	{
		int i = stack[stackSize - 1];
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int[] stack>
	//    2    4:aload_0         
	//    3    5:getfield        #121 <Field int stackSize>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:iaload          
	//    7   11:istore_1        
		if(i != 1) goto _L2; else goto _L1
	//    8   12:iload_1         
	//    9   13:iconst_1        
	//   10   14:icmpne          133
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
_L14:
		nextNonWhitespace(true);
	//   19   29:aload_0         
	//   20   30:iconst_1        
	//   21   31:invokespecial   #166 <Method int nextNonWhitespace(boolean)>
		JVM INSTR lookupswitch 7: default 100
	//	               34: 668
	//	               39: 655
	//	               44: 615
	//	               59: 615
	//	               91: 689
	//	               93: 603
	//	               123: 696;
	//   22   34:lookupswitch    7: default 100
	//	               34: 668
	//	               39: 655
	//	               44: 615
	//	               59: 615
	//	               91: 689
	//	               93: 603
	//	               123: 696
		   goto _L3 _L4 _L5 _L6 _L6 _L7 _L8 _L9
_L3:
		pos = pos - 1;
	//   23  100:aload_0         
	//   24  101:aload_0         
	//   25  102:getfield        #109 <Field int pos>
	//   26  105:iconst_1        
	//   27  106:isub            
	//   28  107:putfield        #109 <Field int pos>
		if(stackSize == 1)
	//*  29  110:aload_0         
	//*  30  111:getfield        #121 <Field int stackSize>
	//*  31  114:iconst_1        
	//*  32  115:icmpne          122
			checkLenient();
	//   33  118:aload_0         
	//   34  119:invokespecial   #172 <Method void checkLenient()>
		i = peekKeyword();
	//   35  122:aload_0         
	//   36  123:invokespecial   #175 <Method int peekKeyword()>
	//   37  126:istore_1        
		if(i == 0) goto _L11; else goto _L10
	//   38  127:iload_1         
	//   39  128:ifeq            703
_L10:
		return i;
	//   40  131:iload_1         
	//   41  132:ireturn         
_L2:
		if(i == 2)
	//*  42  133:iload_1         
	//*  43  134:iconst_2        
	//*  44  135:icmpne          197
		{
			switch(nextNonWhitespace(true))
	//*  45  138:aload_0         
	//*  46  139:iconst_1        
	//*  47  140:invokespecial   #166 <Method int nextNonWhitespace(boolean)>
			{
	//*  48  143:lookupswitch    3: default 176
	//	               44: 29
	//	               59: 190
	//	               93: 183
			default:
				throw syntaxError("Unterminated array");
	//   49  176:aload_0         
	//   50  177:ldc1            #177 <String "Unterminated array">
	//   51  179:invokespecial   #161 <Method IOException syntaxError(String)>
	//   52  182:athrow          

			case 93: // ']'
				peeked = 4;
	//   53  183:aload_0         
	//   54  184:iconst_4        
	//   55  185:putfield        #117 <Field int peeked>
				return 4;
	//   56  188:iconst_4        
	//   57  189:ireturn         

			case 59: // ';'
				checkLenient();
	//   58  190:aload_0         
	//   59  191:invokespecial   #172 <Method void checkLenient()>
				break;

			case 44: // ','
				break;
			}
		} else
	//*  60  194:goto            29
		{
			if(i == 3 || i == 5)
	//*  61  197:iload_1         
	//*  62  198:iconst_3        
	//*  63  199:icmpeq          207
	//*  64  202:iload_1         
	//*  65  203:iconst_5        
	//*  66  204:icmpne          404
			{
				stack[stackSize - 1] = 4;
	//   67  207:aload_0         
	//   68  208:getfield        #119 <Field int[] stack>
	//   69  211:aload_0         
	//   70  212:getfield        #121 <Field int stackSize>
	//   71  215:iconst_1        
	//   72  216:isub            
	//   73  217:iconst_4        
	//   74  218:iastore         
				if(i == 5)
	//*  75  219:iload_1         
	//*  76  220:iconst_5        
	//*  77  221:icmpne          282
					switch(nextNonWhitespace(true))
	//*  78  224:aload_0         
	//*  79  225:iconst_1        
	//*  80  226:invokespecial   #166 <Method int nextNonWhitespace(boolean)>
					{
	//*  81  229:lookupswitch    3: default 264
	//	               44: 282
	//	               59: 278
	//	               125: 271
					default:
						throw syntaxError("Unterminated object");
	//   82  264:aload_0         
	//   83  265:ldc1            #179 <String "Unterminated object">
	//   84  267:invokespecial   #161 <Method IOException syntaxError(String)>
	//   85  270:athrow          

					case 125: // '}'
						peeked = 2;
	//   86  271:aload_0         
	//   87  272:iconst_2        
	//   88  273:putfield        #117 <Field int peeked>
						return 2;
	//   89  276:iconst_2        
	//   90  277:ireturn         

					case 59: // ';'
						checkLenient();
	//   91  278:aload_0         
	//   92  279:invokespecial   #172 <Method void checkLenient()>
						break;

					case 44: // ','
						break;
					}
				int j = nextNonWhitespace(true);
	//   93  282:aload_0         
	//   94  283:iconst_1        
	//   95  284:invokespecial   #166 <Method int nextNonWhitespace(boolean)>
	//   96  287:istore_2        
				switch(j)
	//*  97  288:iload_2         
				{
	//*  98  289:lookupswitch    3: default 324
	//	               34: 356
	//	               39: 365
	//	               125: 378
				default:
					checkLenient();
	//   99  324:aload_0         
	//  100  325:invokespecial   #172 <Method void checkLenient()>
					pos = pos - 1;
	//  101  328:aload_0         
	//  102  329:aload_0         
	//  103  330:getfield        #109 <Field int pos>
	//  104  333:iconst_1        
	//  105  334:isub            
	//  106  335:putfield        #109 <Field int pos>
					if(isLiteral((char)j))
	//* 107  338:aload_0         
	//* 108  339:iload_2         
	//* 109  340:int2char        
	//* 110  341:invokespecial   #183 <Method boolean isLiteral(char)>
	//* 111  344:ifeq            397
					{
						peeked = 14;
	//  112  347:aload_0         
	//  113  348:bipush          14
	//  114  350:putfield        #117 <Field int peeked>
						return 14;
	//  115  353:bipush          14
	//  116  355:ireturn         
					} else
	//* 117  356:aload_0         
	//* 118  357:bipush          13
	//* 119  359:putfield        #117 <Field int peeked>
	//* 120  362:bipush          13
	//* 121  364:ireturn         
	//* 122  365:aload_0         
	//* 123  366:invokespecial   #172 <Method void checkLenient()>
	//* 124  369:aload_0         
	//* 125  370:bipush          12
	//* 126  372:putfield        #117 <Field int peeked>
	//* 127  375:bipush          12
	//* 128  377:ireturn         
	//* 129  378:iload_1         
	//* 130  379:iconst_5        
	//* 131  380:icmpeq          390
	//* 132  383:aload_0         
	//* 133  384:iconst_2        
	//* 134  385:putfield        #117 <Field int peeked>
	//* 135  388:iconst_2        
	//* 136  389:ireturn         
	//* 137  390:aload_0         
	//* 138  391:ldc1            #185 <String "Expected name">
	//* 139  393:invokespecial   #161 <Method IOException syntaxError(String)>
	//* 140  396:athrow          
					{
						throw syntaxError("Expected name");
	//  141  397:aload_0         
	//  142  398:ldc1            #185 <String "Expected name">
	//  143  400:invokespecial   #161 <Method IOException syntaxError(String)>
	//  144  403:athrow          
					}

				case 34: // '"'
					peeked = 13;
					return 13;

				case 39: // '\''
					checkLenient();
					peeked = 12;
					return 12;

				case 125: // '}'
					break;
				}
				if(i != 5)
				{
					peeked = 2;
					return 2;
				} else
				{
					throw syntaxError("Expected name");
				}
			}
			if(i == 4)
	//* 145  404:iload_1         
	//* 146  405:iconst_4        
	//* 147  406:icmpne          513
			{
				stack[stackSize - 1] = 5;
	//  148  409:aload_0         
	//  149  410:getfield        #119 <Field int[] stack>
	//  150  413:aload_0         
	//  151  414:getfield        #121 <Field int stackSize>
	//  152  417:iconst_1        
	//  153  418:isub            
	//  154  419:iconst_5        
	//  155  420:iastore         
				switch(nextNonWhitespace(true))
	//* 156  421:aload_0         
	//* 157  422:iconst_1        
	//* 158  423:invokespecial   #166 <Method int nextNonWhitespace(boolean)>
				{
	//* 159  426:tableswitch     58 61: default 456
	//	               58 29
	//	               59 456
	//	               60 456
	//	               61 463
				case 59: // ';'
				case 60: // '<'
				default:
					throw syntaxError("Expected ':'");
	//  160  456:aload_0         
	//  161  457:ldc1            #187 <String "Expected ':'">
	//  162  459:invokespecial   #161 <Method IOException syntaxError(String)>
	//  163  462:athrow          

				case 61: // '='
					checkLenient();
	//  164  463:aload_0         
	//  165  464:invokespecial   #172 <Method void checkLenient()>
					if((pos < limit || fillBuffer(1)) && buffer[pos] == '>')
	//* 166  467:aload_0         
	//* 167  468:getfield        #109 <Field int pos>
	//* 168  471:aload_0         
	//* 169  472:getfield        #111 <Field int limit>
	//* 170  475:icmplt          486
	//* 171  478:aload_0         
	//* 172  479:iconst_1        
	//* 173  480:invokespecial   #170 <Method boolean fillBuffer(int)>
	//* 174  483:ifeq            29
	//* 175  486:aload_0         
	//* 176  487:getfield        #107 <Field char[] buffer>
	//* 177  490:aload_0         
	//* 178  491:getfield        #109 <Field int pos>
	//* 179  494:caload          
	//* 180  495:bipush          62
	//* 181  497:icmpne          29
						pos = pos + 1;
	//  182  500:aload_0         
	//  183  501:aload_0         
	//  184  502:getfield        #109 <Field int pos>
	//  185  505:iconst_1        
	//  186  506:iadd            
	//  187  507:putfield        #109 <Field int pos>
					break;

				case 58: // ':'
					break;
				}
			} else
	//* 188  510:goto            29
			if(i == 6)
	//* 189  513:iload_1         
	//* 190  514:bipush          6
	//* 191  516:icmpne          546
			{
				if(lenient)
	//* 192  519:aload_0         
	//* 193  520:getfield        #105 <Field boolean lenient>
	//* 194  523:ifeq            530
					consumeNonExecutePrefix();
	//  195  526:aload_0         
	//  196  527:invokespecial   #189 <Method void consumeNonExecutePrefix()>
				stack[stackSize - 1] = 7;
	//  197  530:aload_0         
	//  198  531:getfield        #119 <Field int[] stack>
	//  199  534:aload_0         
	//  200  535:getfield        #121 <Field int stackSize>
	//  201  538:iconst_1        
	//  202  539:isub            
	//  203  540:bipush          7
	//  204  542:iastore         
			} else
	//* 205  543:goto            29
			if(i == 7)
	//* 206  546:iload_1         
	//* 207  547:bipush          7
	//* 208  549:icmpne          587
			{
				if(nextNonWhitespace(false) == -1)
	//* 209  552:aload_0         
	//* 210  553:iconst_0        
	//* 211  554:invokespecial   #166 <Method int nextNonWhitespace(boolean)>
	//* 212  557:iconst_m1       
	//* 213  558:icmpne          570
				{
					peeked = 17;
	//  214  561:aload_0         
	//  215  562:bipush          17
	//  216  564:putfield        #117 <Field int peeked>
					return 17;
	//  217  567:bipush          17
	//  218  569:ireturn         
				}
				checkLenient();
	//  219  570:aload_0         
	//  220  571:invokespecial   #172 <Method void checkLenient()>
				pos = pos - 1;
	//  221  574:aload_0         
	//  222  575:aload_0         
	//  223  576:getfield        #109 <Field int pos>
	//  224  579:iconst_1        
	//  225  580:isub            
	//  226  581:putfield        #109 <Field int pos>
			} else
	//* 227  584:goto            29
			if(i == 8)
	//* 228  587:iload_1         
	//* 229  588:bipush          8
	//* 230  590:icmpne          29
				throw new IllegalStateException("JsonReader is closed");
	//  231  593:new             #191 <Class IllegalStateException>
	//  232  596:dup             
	//  233  597:ldc1            #193 <String "JsonReader is closed">
	//  234  599:invokespecial   #194 <Method void IllegalStateException(String)>
	//  235  602:athrow          
		}
		continue; /* Loop/switch isn't completed */
_L8:
		if(i == 1)
	//* 236  603:iload_1         
	//* 237  604:iconst_1        
	//* 238  605:icmpne          615
		{
			peeked = 4;
	//  239  608:aload_0         
	//  240  609:iconst_4        
	//  241  610:putfield        #117 <Field int peeked>
			return 4;
	//  242  613:iconst_4        
	//  243  614:ireturn         
		}
_L6:
		if(i == 1 || i == 2)
	//* 244  615:iload_1         
	//* 245  616:iconst_1        
	//* 246  617:icmpeq          625
	//* 247  620:iload_1         
	//* 248  621:iconst_2        
	//* 249  622:icmpne          648
		{
			checkLenient();
	//  250  625:aload_0         
	//  251  626:invokespecial   #172 <Method void checkLenient()>
			pos = pos - 1;
	//  252  629:aload_0         
	//  253  630:aload_0         
	//  254  631:getfield        #109 <Field int pos>
	//  255  634:iconst_1        
	//  256  635:isub            
	//  257  636:putfield        #109 <Field int pos>
			peeked = 7;
	//  258  639:aload_0         
	//  259  640:bipush          7
	//  260  642:putfield        #117 <Field int peeked>
			return 7;
	//  261  645:bipush          7
	//  262  647:ireturn         
		} else
		{
			throw syntaxError("Unexpected value");
	//  263  648:aload_0         
	//  264  649:ldc1            #196 <String "Unexpected value">
	//  265  651:invokespecial   #161 <Method IOException syntaxError(String)>
	//  266  654:athrow          
		}
_L5:
		checkLenient();
	//  267  655:aload_0         
	//  268  656:invokespecial   #172 <Method void checkLenient()>
		peeked = 8;
	//  269  659:aload_0         
	//  270  660:bipush          8
	//  271  662:putfield        #117 <Field int peeked>
		return 8;
	//  272  665:bipush          8
	//  273  667:ireturn         
_L4:
		if(stackSize == 1)
	//* 274  668:aload_0         
	//* 275  669:getfield        #121 <Field int stackSize>
	//* 276  672:iconst_1        
	//* 277  673:icmpne          680
			checkLenient();
	//  278  676:aload_0         
	//  279  677:invokespecial   #172 <Method void checkLenient()>
		peeked = 9;
	//  280  680:aload_0         
	//  281  681:bipush          9
	//  282  683:putfield        #117 <Field int peeked>
		return 9;
	//  283  686:bipush          9
	//  284  688:ireturn         
_L7:
		peeked = 3;
	//  285  689:aload_0         
	//  286  690:iconst_3        
	//  287  691:putfield        #117 <Field int peeked>
		return 3;
	//  288  694:iconst_3        
	//  289  695:ireturn         
_L9:
		peeked = 1;
	//  290  696:aload_0         
	//  291  697:iconst_1        
	//  292  698:putfield        #117 <Field int peeked>
		return 1;
	//  293  701:iconst_1        
	//  294  702:ireturn         
_L11:
		int k;
		k = peekNumber();
	//  295  703:aload_0         
	//  296  704:invokespecial   #199 <Method int peekNumber()>
	//  297  707:istore_2        
		i = k;
	//  298  708:iload_2         
	//  299  709:istore_1        
		if(k != 0) goto _L10; else goto _L12
	//  300  710:iload_2         
	//  301  711:ifne            131
_L12:
		if(!isLiteral(buffer[pos]))
	//* 302  714:aload_0         
	//* 303  715:aload_0         
	//* 304  716:getfield        #107 <Field char[] buffer>
	//* 305  719:aload_0         
	//* 306  720:getfield        #109 <Field int pos>
	//* 307  723:caload          
	//* 308  724:invokespecial   #183 <Method boolean isLiteral(char)>
	//* 309  727:ifne            737
		{
			throw syntaxError("Expected value");
	//  310  730:aload_0         
	//  311  731:ldc1            #201 <String "Expected value">
	//  312  733:invokespecial   #161 <Method IOException syntaxError(String)>
	//  313  736:athrow          
		} else
		{
			checkLenient();
	//  314  737:aload_0         
	//  315  738:invokespecial   #172 <Method void checkLenient()>
			peeked = 10;
	//  316  741:aload_0         
	//  317  742:bipush          10
	//  318  744:putfield        #117 <Field int peeked>
			return 10;
	//  319  747:bipush          10
	//  320  749:ireturn         
		}
		if(true) goto _L14; else goto _L13
_L13:
	}

	private boolean fillBuffer(int i)
		throws IOException
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		char ac[] = buffer;
	//    2    3:aload_0         
	//    3    4:getfield        #107 <Field char[] buffer>
	//    4    7:astore          5
		lineStart = lineStart - pos;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #115 <Field int lineStart>
	//    8   14:aload_0         
	//    9   15:getfield        #109 <Field int pos>
	//   10   18:isub            
	//   11   19:putfield        #115 <Field int lineStart>
		boolean flag;
		if(limit != pos)
	//*  12   22:aload_0         
	//*  13   23:getfield        #111 <Field int limit>
	//*  14   26:aload_0         
	//*  15   27:getfield        #109 <Field int pos>
	//*  16   30:icmpeq          183
		{
			limit = limit - pos;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #111 <Field int limit>
	//   20   38:aload_0         
	//   21   39:getfield        #109 <Field int pos>
	//   22   42:isub            
	//   23   43:putfield        #111 <Field int limit>
			System.arraycopy(((Object) (ac)), pos, ((Object) (ac)), 0, limit);
	//   24   46:aload           5
	//   25   48:aload_0         
	//   26   49:getfield        #109 <Field int pos>
	//   27   52:aload           5
	//   28   54:iconst_0        
	//   29   55:aload_0         
	//   30   56:getfield        #111 <Field int limit>
	//   31   59:invokestatic    #207 <Method void System.arraycopy(Object, int, Object, int, int)>
		} else
	//*  32   62:aload_0         
	//*  33   63:iconst_0        
	//*  34   64:putfield        #109 <Field int pos>
	//*  35   67:aload_0         
	//*  36   68:getfield        #134 <Field Reader in>
	//*  37   71:aload           5
	//*  38   73:aload_0         
	//*  39   74:getfield        #111 <Field int limit>
	//*  40   77:aload           5
	//*  41   79:arraylength     
	//*  42   80:aload_0         
	//*  43   81:getfield        #111 <Field int limit>
	//*  44   84:isub            
	//*  45   85:invokevirtual   #213 <Method int Reader.read(char[], int, int)>
	//*  46   88:istore_2        
	//*  47   89:iload           4
	//*  48   91:istore_3        
	//*  49   92:iload_2         
	//*  50   93:iconst_m1       
	//*  51   94:icmpeq          181
	//*  52   97:aload_0         
	//*  53   98:aload_0         
	//*  54   99:getfield        #111 <Field int limit>
	//*  55  102:iload_2         
	//*  56  103:iadd            
	//*  57  104:putfield        #111 <Field int limit>
	//*  58  107:iload_1         
	//*  59  108:istore_2        
	//*  60  109:aload_0         
	//*  61  110:getfield        #113 <Field int lineNumber>
	//*  62  113:ifne            169
	//*  63  116:iload_1         
	//*  64  117:istore_2        
	//*  65  118:aload_0         
	//*  66  119:getfield        #115 <Field int lineStart>
	//*  67  122:ifne            169
	//*  68  125:iload_1         
	//*  69  126:istore_2        
	//*  70  127:aload_0         
	//*  71  128:getfield        #111 <Field int limit>
	//*  72  131:ifle            169
	//*  73  134:iload_1         
	//*  74  135:istore_2        
	//*  75  136:aload           5
	//*  76  138:iconst_0        
	//*  77  139:caload          
	//*  78  140:ldc1            #214 <Int 65279>
	//*  79  142:icmpne          169
	//*  80  145:aload_0         
	//*  81  146:aload_0         
	//*  82  147:getfield        #109 <Field int pos>
	//*  83  150:iconst_1        
	//*  84  151:iadd            
	//*  85  152:putfield        #109 <Field int pos>
	//*  86  155:aload_0         
	//*  87  156:aload_0         
	//*  88  157:getfield        #115 <Field int lineStart>
	//*  89  160:iconst_1        
	//*  90  161:iadd            
	//*  91  162:putfield        #115 <Field int lineStart>
	//*  92  165:iload_1         
	//*  93  166:iconst_1        
	//*  94  167:iadd            
	//*  95  168:istore_2        
	//*  96  169:iload_2         
	//*  97  170:istore_1        
	//*  98  171:aload_0         
	//*  99  172:getfield        #111 <Field int limit>
	//* 100  175:iload_2         
	//* 101  176:icmplt          67
	//* 102  179:iconst_1        
	//* 103  180:istore_3        
	//* 104  181:iload_3         
	//* 105  182:ireturn         
		{
			limit = 0;
	//  106  183:aload_0         
	//  107  184:iconst_0        
	//  108  185:putfield        #111 <Field int limit>
		}
		pos = 0;
		do
		{
			int j = in.read(ac, limit, ac.length - limit);
			flag = flag1;
			if(j == -1)
				break;
			limit = limit + j;
			j = i;
			if(lineNumber == 0)
			{
				j = i;
				if(lineStart == 0)
				{
					j = i;
					if(limit > 0)
					{
						j = i;
						if(ac[0] == '\uFEFF')
						{
							pos = pos + 1;
							lineStart = lineStart + 1;
							j = i + 1;
						}
					}
				}
			}
			i = j;
			if(limit < j)
				continue;
			flag = true;
			break;
		} while(true);
		return flag;
	//* 109  188:goto            62
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
		throws IOException
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
	//    5  143:invokespecial   #172 <Method void checkLenient()>
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
		throws IOException
	{
		int i;
		int j;
		char ac[];
		ac = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore          7
		i = pos;
	//    3    6:aload_0         
	//    4    7:getfield        #109 <Field int pos>
	//    5   10:istore_2        
		j = limit;
	//    6   11:aload_0         
	//    7   12:getfield        #111 <Field int limit>
	//    8   15:istore_3        
_L2:
		int k;
		do
		{
			k = j;
	//    9   16:iload_3         
	//   10   17:istore          4
			int l = i;
	//   11   19:iload_2         
	//   12   20:istore          5
			if(i == j)
	//*  13   22:iload_2         
	//*  14   23:iload_3         
	//*  15   24:icmpne          98
			{
				pos = i;
	//   16   27:aload_0         
	//   17   28:iload_2         
	//   18   29:putfield        #109 <Field int pos>
				boolean flag1;
				if(!fillBuffer(1))
	//*  19   32:aload_0         
	//*  20   33:iconst_1        
	//*  21   34:invokespecial   #170 <Method boolean fillBuffer(int)>
	//*  22   37:ifne            86
					if(flag)
	//*  23   40:iload_1         
	//*  24   41:ifeq            357
						throw new EOFException((new StringBuilder()).append("End of input at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString());
	//   25   44:new             #216 <Class EOFException>
	//   26   47:dup             
	//   27   48:new             #218 <Class StringBuilder>
	//   28   51:dup             
	//   29   52:invokespecial   #219 <Method void StringBuilder()>
	//   30   55:ldc1            #221 <String "End of input at line ">
	//   31   57:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   32   60:aload_0         
	//   33   61:invokespecial   #150 <Method int getLineNumber()>
	//   34   64:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   35   67:ldc1            #230 <String " column ">
	//   36   69:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   37   72:aload_0         
	//   38   73:invokespecial   #154 <Method int getColumnNumber()>
	//   39   76:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   40   79:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   41   82:invokespecial   #235 <Method void EOFException(String)>
	//   42   85:athrow          
					else
	//*  43   86:aload_0         
	//*  44   87:getfield        #109 <Field int pos>
	//*  45   90:istore          5
	//*  46   92:aload_0         
	//*  47   93:getfield        #111 <Field int limit>
	//*  48   96:istore          4
	//*  49   98:iload           5
	//*  50  100:iconst_1        
	//*  51  101:iadd            
	//*  52  102:istore_2        
	//*  53  103:aload           7
	//*  54  105:iload           5
	//*  55  107:caload          
	//*  56  108:istore_3        
	//*  57  109:iload_3         
	//*  58  110:bipush          10
	//*  59  112:icmpne          136
	//*  60  115:aload_0         
	//*  61  116:aload_0         
	//*  62  117:getfield        #113 <Field int lineNumber>
	//*  63  120:iconst_1        
	//*  64  121:iadd            
	//*  65  122:putfield        #113 <Field int lineNumber>
	//*  66  125:aload_0         
	//*  67  126:iload_2         
	//*  68  127:putfield        #115 <Field int lineStart>
	//*  69  130:iload           4
	//*  70  132:istore_3        
	//*  71  133:goto            16
	//*  72  136:iload_3         
	//*  73  137:bipush          32
	//*  74  139:icmpeq          359
	//*  75  142:iload_3         
	//*  76  143:bipush          13
	//*  77  145:icmpeq          359
	//*  78  148:iload_3         
	//*  79  149:bipush          9
	//*  80  151:icmpne          160
	//*  81  154:iload           4
	//*  82  156:istore_3        
	//*  83  157:goto            16
	//*  84  160:iload_3         
	//*  85  161:bipush          47
	//*  86  163:icmpne          318
	//*  87  166:aload_0         
	//*  88  167:iload_2         
	//*  89  168:putfield        #109 <Field int pos>
	//*  90  171:iload_2         
	//*  91  172:iload           4
	//*  92  174:icmpne          211
	//*  93  177:aload_0         
	//*  94  178:aload_0         
	//*  95  179:getfield        #109 <Field int pos>
	//*  96  182:iconst_1        
	//*  97  183:isub            
	//*  98  184:putfield        #109 <Field int pos>
	//*  99  187:aload_0         
	//* 100  188:iconst_2        
	//* 101  189:invokespecial   #170 <Method boolean fillBuffer(int)>
	//* 102  192:istore          6
	//* 103  194:aload_0         
	//* 104  195:aload_0         
	//* 105  196:getfield        #109 <Field int pos>
	//* 106  199:iconst_1        
	//* 107  200:iadd            
	//* 108  201:putfield        #109 <Field int pos>
	//* 109  204:iload           6
	//* 110  206:ifne            211
	//* 111  209:iload_3         
	//* 112  210:ireturn         
	//* 113  211:aload_0         
	//* 114  212:invokespecial   #172 <Method void checkLenient()>
	//* 115  215:aload           7
	//* 116  217:aload_0         
	//* 117  218:getfield        #109 <Field int pos>
	//* 118  221:caload          
	//* 119  222:lookupswitch    2: default 248
	//	               42: 250
	//	               47: 291
	//* 120  248:iload_3         
	//* 121  249:ireturn         
	//* 122  250:aload_0         
	//* 123  251:aload_0         
	//* 124  252:getfield        #109 <Field int pos>
	//* 125  255:iconst_1        
	//* 126  256:iadd            
	//* 127  257:putfield        #109 <Field int pos>
	//* 128  260:aload_0         
	//* 129  261:ldc1            #237 <String "*/">
	//* 130  263:invokespecial   #241 <Method boolean skipTo(String)>
	//* 131  266:ifne            276
	//* 132  269:aload_0         
	//* 133  270:ldc1            #243 <String "Unterminated comment">
	//* 134  272:invokespecial   #161 <Method IOException syntaxError(String)>
	//* 135  275:athrow          
	//* 136  276:aload_0         
	//* 137  277:getfield        #109 <Field int pos>
	//* 138  280:iconst_2        
	//* 139  281:iadd            
	//* 140  282:istore_2        
	//* 141  283:aload_0         
	//* 142  284:getfield        #111 <Field int limit>
	//* 143  287:istore_3        
	//* 144  288:goto            16
	//* 145  291:aload_0         
	//* 146  292:aload_0         
	//* 147  293:getfield        #109 <Field int pos>
	//* 148  296:iconst_1        
	//* 149  297:iadd            
	//* 150  298:putfield        #109 <Field int pos>
	//* 151  301:aload_0         
	//* 152  302:invokespecial   #246 <Method void skipToEndOfLine()>
	//* 153  305:aload_0         
	//* 154  306:getfield        #109 <Field int pos>
	//* 155  309:istore_2        
	//* 156  310:aload_0         
	//* 157  311:getfield        #111 <Field int limit>
	//* 158  314:istore_3        
	//* 159  315:goto            16
	//* 160  318:iload_3         
	//* 161  319:bipush          35
	//* 162  321:icmpne          350
	//* 163  324:aload_0         
	//* 164  325:iload_2         
	//* 165  326:putfield        #109 <Field int pos>
	//* 166  329:aload_0         
	//* 167  330:invokespecial   #172 <Method void checkLenient()>
	//* 168  333:aload_0         
	//* 169  334:invokespecial   #246 <Method void skipToEndOfLine()>
	//* 170  337:aload_0         
	//* 171  338:getfield        #109 <Field int pos>
	//* 172  341:istore_2        
	//* 173  342:aload_0         
	//* 174  343:getfield        #111 <Field int limit>
	//* 175  346:istore_3        
	//* 176  347:goto            16
	//* 177  350:aload_0         
	//* 178  351:iload_2         
	//* 179  352:putfield        #109 <Field int pos>
	//* 180  355:iload_3         
	//* 181  356:ireturn         
						return -1;
	//  182  357:iconst_m1       
	//  183  358:ireturn         
				l = pos;
				k = limit;
			}
			i = l + 1;
			j = ((int) (ac[l]));
			if(j == '\n')
			{
				lineNumber = lineNumber + 1;
				lineStart = i;
				j = k;
			} else
			{
label0:
				{
					if(j == 32 || j == 13)
						break label0;
					if(j == 9)
					{
						j = k;
					} else
					{
						if(j == 47)
						{
							pos = i;
							if(i == k)
							{
								pos = pos - 1;
								flag1 = fillBuffer(2);
								pos = pos + 1;
								if(!flag1)
									return j;
							}
							checkLenient();
							switch(ac[pos])
							{
							default:
								return j;

							case 42: // '*'
								pos = pos + 1;
								if(!skipTo("*/"))
									throw syntaxError("Unterminated comment");
								i = pos + 2;
								j = limit;
								break;

							case 47: // '/'
								pos = pos + 1;
								skipToEndOfLine();
								i = pos;
								j = limit;
								break;
							}
						} else
						if(j == 35)
						{
							pos = i;
							checkLenient();
							skipToEndOfLine();
							i = pos;
							j = limit;
						} else
						{
							pos = i;
							return j;
						}
						continue; /* Loop/switch isn't completed */
					}
				}
			}
		} while(true);
		j = k;
	//  184  359:iload           4
	//  185  361:istore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//* 186  362:goto            16
	}

	private String nextQuotedValue(char c)
		throws IOException
	{
		char ac[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore          9
		StringBuilder stringbuilder = new StringBuilder();
	//    3    6:new             #218 <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #219 <Method void StringBuilder()>
	//    6   13:astore          10
		do
		{
			int i = pos;
	//    7   15:aload_0         
	//    8   16:getfield        #109 <Field int pos>
	//    9   19:istore_2        
			int l = limit;
	//   10   20:aload_0         
	//   11   21:getfield        #111 <Field int limit>
	//   12   24:istore          5
			int k = i;
	//   13   26:iload_2         
	//   14   27:istore          4
			while(i < l) 
	//*  15   29:iload_2         
	//*  16   30:iload           5
	//*  17   32:icmpge          190
			{
				int j1 = i + 1;
	//   18   35:iload_2         
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:istore          7
				char c1 = ac[i];
	//   22   40:aload           9
	//   23   42:iload_2         
	//   24   43:caload          
	//   25   44:istore          8
				if(c1 == c)
	//*  26   46:iload           8
	//*  27   48:iload_1         
	//*  28   49:icmpne          81
				{
					pos = j1;
	//   29   52:aload_0         
	//   30   53:iload           7
	//   31   55:putfield        #109 <Field int pos>
					stringbuilder.append(ac, k, j1 - k - 1);
	//   32   58:aload           10
	//   33   60:aload           9
	//   34   62:iload           4
	//   35   64:iload           7
	//   36   66:iload           4
	//   37   68:isub            
	//   38   69:iconst_1        
	//   39   70:isub            
	//   40   71:invokevirtual   #251 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   41   74:pop             
					return stringbuilder.toString();
	//   42   75:aload           10
	//   43   77:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   44   80:areturn         
				}
				int j;
				int i1;
				if(c1 == '\\')
	//*  45   81:iload           8
	//*  46   83:bipush          92
	//*  47   85:icmpne          144
				{
					pos = j1;
	//   48   88:aload_0         
	//   49   89:iload           7
	//   50   91:putfield        #109 <Field int pos>
					stringbuilder.append(ac, k, j1 - k - 1);
	//   51   94:aload           10
	//   52   96:aload           9
	//   53   98:iload           4
	//   54  100:iload           7
	//   55  102:iload           4
	//   56  104:isub            
	//   57  105:iconst_1        
	//   58  106:isub            
	//   59  107:invokevirtual   #251 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   60  110:pop             
					stringbuilder.append(readEscapeCharacter());
	//   61  111:aload           10
	//   62  113:aload_0         
	//   63  114:invokespecial   #255 <Method char readEscapeCharacter()>
	//   64  117:invokevirtual   #258 <Method StringBuilder StringBuilder.append(char)>
	//   65  120:pop             
					i = pos;
	//   66  121:aload_0         
	//   67  122:getfield        #109 <Field int pos>
	//   68  125:istore_2        
					i1 = limit;
	//   69  126:aload_0         
	//   70  127:getfield        #111 <Field int limit>
	//   71  130:istore          6
					j = i;
	//   72  132:iload_2         
	//   73  133:istore_3        
				} else
	//*  74  134:iload           6
	//*  75  136:istore          5
	//*  76  138:iload_3         
	//*  77  139:istore          4
	//*  78  141:goto            29
				{
					i1 = l;
	//   79  144:iload           5
	//   80  146:istore          6
					i = j1;
	//   81  148:iload           7
	//   82  150:istore_2        
					j = k;
	//   83  151:iload           4
	//   84  153:istore_3        
					if(c1 == '\n')
	//*  85  154:iload           8
	//*  86  156:bipush          10
	//*  87  158:icmpne          134
					{
						lineNumber = lineNumber + 1;
	//   88  161:aload_0         
	//   89  162:aload_0         
	//   90  163:getfield        #113 <Field int lineNumber>
	//   91  166:iconst_1        
	//   92  167:iadd            
	//   93  168:putfield        #113 <Field int lineNumber>
						lineStart = j1;
	//   94  171:aload_0         
	//   95  172:iload           7
	//   96  174:putfield        #115 <Field int lineStart>
						i1 = l;
	//   97  177:iload           5
	//   98  179:istore          6
						i = j1;
	//   99  181:iload           7
	//  100  183:istore_2        
						j = k;
	//  101  184:iload           4
	//  102  186:istore_3        
					}
				}
				l = i1;
				k = j;
			}
	//* 103  187:goto            134
			stringbuilder.append(ac, k, i - k);
	//  104  190:aload           10
	//  105  192:aload           9
	//  106  194:iload           4
	//  107  196:iload_2         
	//  108  197:iload           4
	//  109  199:isub            
	//  110  200:invokevirtual   #251 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//  111  203:pop             
			pos = i;
	//  112  204:aload_0         
	//  113  205:iload_2         
	//  114  206:putfield        #109 <Field int pos>
		} while(fillBuffer(1));
	//  115  209:aload_0         
	//  116  210:iconst_1        
	//  117  211:invokespecial   #170 <Method boolean fillBuffer(int)>
	//  118  214:ifne            15
		throw syntaxError("Unterminated string");
	//  119  217:aload_0         
	//  120  218:ldc2            #260 <String "Unterminated string">
	//  121  221:invokespecial   #161 <Method IOException syntaxError(String)>
	//  122  224:athrow          
	}

	private String nextUnquotedValue()
		throws IOException
	{
		int i;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
_L6:
		if(pos + i >= limit) goto _L2; else goto _L1
	//    4    4:aload_0         
	//    5    5:getfield        #109 <Field int pos>
	//    6    8:iload_1         
	//    7    9:iadd            
	//    8   10:aload_0         
	//    9   11:getfield        #111 <Field int limit>
	//   10   14:icmpge          222
_L1:
		int j;
		Object obj1;
		obj1 = obj;
	//   11   17:aload_3         
	//   12   18:astore          4
		j = i;
	//   13   20:iload_1         
	//   14   21:istore_2        
		buffer[pos + i];
	//   15   22:aload_0         
	//   16   23:getfield        #107 <Field char[] buffer>
	//   17   26:aload_0         
	//   18   27:getfield        #109 <Field int pos>
	//   19   30:iload_1         
	//   20   31:iadd            
	//   21   32:caload          
		JVM INSTR lookupswitch 16: default 172
	//	               9: 188
	//	               10: 188
	//	               12: 188
	//	               13: 188
	//	               32: 188
	//	               35: 179
	//	               44: 188
	//	               47: 179
	//	               58: 188
	//	               59: 179
	//	               61: 179
	//	               91: 188
	//	               92: 179
	//	               93: 188
	//	               123: 188
	//	               125: 188;
	//   22   33:lookupswitch    16: default 172
	//	               9: 188
	//	               10: 188
	//	               12: 188
	//	               13: 188
	//	               32: 188
	//	               35: 179
	//	               44: 188
	//	               47: 179
	//	               58: 188
	//	               59: 179
	//	               61: 179
	//	               91: 188
	//	               92: 179
	//	               93: 188
	//	               123: 188
	//	               125: 188
		   goto _L3 _L4 _L4 _L4 _L4 _L4 _L5 _L4 _L5 _L4 _L5 _L5 _L4 _L5 _L4 _L4 _L4
_L3:
		i++;
	//   23  172:iload_1         
	//   24  173:iconst_1        
	//   25  174:iadd            
	//   26  175:istore_1        
		break; /* Loop/switch isn't completed */
	//   27  176:goto            4
_L5:
		checkLenient();
	//   28  179:aload_0         
	//   29  180:invokespecial   #172 <Method void checkLenient()>
		j = i;
	//   30  183:iload_1         
	//   31  184:istore_2        
		obj1 = obj;
	//   32  185:aload_3         
	//   33  186:astore          4
		  goto _L4
		if(true) goto _L6; else goto _L2
_L4:
		if(obj1 == null)
	//*  34  188:aload           4
	//*  35  190:ifnonnull       308
		{
			obj = ((Object) (new String(buffer, pos, j)));
	//   36  193:new             #85  <Class String>
	//   37  196:dup             
	//   38  197:aload_0         
	//   39  198:getfield        #107 <Field char[] buffer>
	//   40  201:aload_0         
	//   41  202:getfield        #109 <Field int pos>
	//   42  205:iload_2         
	//   43  206:invokespecial   #264 <Method void String(char[], int, int)>
	//   44  209:astore_3        
		} else
	//*  45  210:aload_0         
	//*  46  211:aload_0         
	//*  47  212:getfield        #109 <Field int pos>
	//*  48  215:iload_2         
	//*  49  216:iadd            
	//*  50  217:putfield        #109 <Field int pos>
	//*  51  220:aload_3         
	//*  52  221:areturn         
	//*  53  222:iload_1         
	//*  54  223:aload_0         
	//*  55  224:getfield        #107 <Field char[] buffer>
	//*  56  227:arraylength     
	//*  57  228:icmpge          249
	//*  58  231:aload_3         
	//*  59  232:astore          4
	//*  60  234:iload_1         
	//*  61  235:istore_2        
	//*  62  236:aload_0         
	//*  63  237:iload_1         
	//*  64  238:iconst_1        
	//*  65  239:iadd            
	//*  66  240:invokespecial   #170 <Method boolean fillBuffer(int)>
	//*  67  243:ifeq            188
	//*  68  246:goto            4
	//*  69  249:aload_3         
	//*  70  250:astore          4
	//*  71  252:aload_3         
	//*  72  253:ifnonnull       265
	//*  73  256:new             #218 <Class StringBuilder>
	//*  74  259:dup             
	//*  75  260:invokespecial   #219 <Method void StringBuilder()>
	//*  76  263:astore          4
	//*  77  265:aload           4
	//*  78  267:aload_0         
	//*  79  268:getfield        #107 <Field char[] buffer>
	//*  80  271:aload_0         
	//*  81  272:getfield        #109 <Field int pos>
	//*  82  275:iload_1         
	//*  83  276:invokevirtual   #251 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//*  84  279:pop             
	//*  85  280:aload_0         
	//*  86  281:aload_0         
	//*  87  282:getfield        #109 <Field int pos>
	//*  88  285:iload_1         
	//*  89  286:iadd            
	//*  90  287:putfield        #109 <Field int pos>
	//*  91  290:iconst_0        
	//*  92  291:istore_2        
	//*  93  292:iconst_0        
	//*  94  293:istore_1        
	//*  95  294:aload           4
	//*  96  296:astore_3        
	//*  97  297:aload_0         
	//*  98  298:iconst_1        
	//*  99  299:invokespecial   #170 <Method boolean fillBuffer(int)>
	//* 100  302:ifne            4
	//* 101  305:goto            188
		{
			((StringBuilder) (obj1)).append(buffer, pos, j);
	//  102  308:aload           4
	//  103  310:aload_0         
	//  104  311:getfield        #107 <Field char[] buffer>
	//  105  314:aload_0         
	//  106  315:getfield        #109 <Field int pos>
	//  107  318:iload_2         
	//  108  319:invokevirtual   #251 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//  109  322:pop             
			obj = ((Object) (((StringBuilder) (obj1)).toString()));
	//  110  323:aload           4
	//  111  325:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  112  328:astore_3        
		}
		pos = pos + j;
		return ((String) (obj));
_L2:
label0:
		{
			if(i >= buffer.length)
				break label0;
			obj1 = obj;
			j = i;
			if(fillBuffer(i + 1))
				break; /* Loop/switch isn't completed */
		}
		  goto _L4
		obj1 = obj;
		if(obj == null)
			obj1 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj1)).append(buffer, pos, i);
		pos = pos + i;
		j = 0;
		i = 0;
		obj = obj1;
		if(fillBuffer(1)) goto _L6; else goto _L4
	//* 113  329:goto            210
	}

	private int peekKeyword()
		throws IOException
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
		if(i == 116 || i == 84)
	//*   6   10:iload_1         
	//*   7   11:bipush          116
	//*   8   13:icmpeq          22
	//*   9   16:iload_1         
	//*  10   17:bipush          84
	//*  11   19:icmpne          72
		{
			s = "true";
	//   12   22:ldc2            #266 <String "true">
	//   13   25:astore          5
			s1 = "TRUE";
	//   14   27:ldc2            #268 <String "TRUE">
	//   15   30:astore          6
			i = 5;
	//   16   32:iconst_5        
	//   17   33:istore_1        
		} else
	//*  18   34:aload           5
	//*  19   36:invokevirtual   #271 <Method int String.length()>
	//*  20   39:istore_3        
	//*  21   40:iconst_1        
	//*  22   41:istore_2        
	//*  23   42:iload_2         
	//*  24   43:iload_3         
	//*  25   44:icmpge          174
	//*  26   47:aload_0         
	//*  27   48:getfield        #109 <Field int pos>
	//*  28   51:iload_2         
	//*  29   52:iadd            
	//*  30   53:aload_0         
	//*  31   54:getfield        #111 <Field int limit>
	//*  32   57:icmplt          130
	//*  33   60:aload_0         
	//*  34   61:iload_2         
	//*  35   62:iconst_1        
	//*  36   63:iadd            
	//*  37   64:invokespecial   #170 <Method boolean fillBuffer(int)>
	//*  38   67:ifne            130
	//*  39   70:iconst_0        
	//*  40   71:ireturn         
		if(i == 102 || i == 70)
	//*  41   72:iload_1         
	//*  42   73:bipush          102
	//*  43   75:icmpeq          84
	//*  44   78:iload_1         
	//*  45   79:bipush          70
	//*  46   81:icmpne          100
		{
			s = "false";
	//   47   84:ldc2            #273 <String "false">
	//   48   87:astore          5
			s1 = "FALSE";
	//   49   89:ldc2            #275 <String "FALSE">
	//   50   92:astore          6
			i = 6;
	//   51   94:bipush          6
	//   52   96:istore_1        
		} else
	//*  53   97:goto            34
		if(i == 110 || i == 78)
	//*  54  100:iload_1         
	//*  55  101:bipush          110
	//*  56  103:icmpeq          112
	//*  57  106:iload_1         
	//*  58  107:bipush          78
	//*  59  109:icmpne          128
		{
			s = "null";
	//   60  112:ldc2            #277 <String "null">
	//   61  115:astore          5
			s1 = "NULL";
	//   62  117:ldc2            #279 <String "NULL">
	//   63  120:astore          6
			i = 7;
	//   64  122:bipush          7
	//   65  124:istore_1        
		} else
	//*  66  125:goto            34
		{
			return 0;
	//   67  128:iconst_0        
	//   68  129:ireturn         
		}
		do
		{
			int k = s.length();
			for(int j = 1; j < k; j++)
			{
				if(pos + j >= limit && !fillBuffer(j + 1))
					return 0;
				char c = buffer[pos + j];
	//   69  130:aload_0         
	//   70  131:getfield        #107 <Field char[] buffer>
	//   71  134:aload_0         
	//   72  135:getfield        #109 <Field int pos>
	//   73  138:iload_2         
	//   74  139:iadd            
	//   75  140:caload          
	//   76  141:istore          4
				if(c != s.charAt(j) && c != s1.charAt(j))
	//*  77  143:iload           4
	//*  78  145:aload           5
	//*  79  147:iload_2         
	//*  80  148:invokevirtual   #283 <Method char String.charAt(int)>
	//*  81  151:icmpeq          167
	//*  82  154:iload           4
	//*  83  156:aload           6
	//*  84  158:iload_2         
	//*  85  159:invokevirtual   #283 <Method char String.charAt(int)>
	//*  86  162:icmpeq          167
					return 0;
	//   87  165:iconst_0        
	//   88  166:ireturn         
			}

	//   89  167:iload_2         
	//   90  168:iconst_1        
	//   91  169:iadd            
	//   92  170:istore_2        
	//*  93  171:goto            42
			if((pos + k < limit || fillBuffer(k + 1)) && isLiteral(buffer[pos + k]))
	//*  94  174:aload_0         
	//*  95  175:getfield        #109 <Field int pos>
	//*  96  178:iload_3         
	//*  97  179:iadd            
	//*  98  180:aload_0         
	//*  99  181:getfield        #111 <Field int limit>
	//* 100  184:icmplt          197
	//* 101  187:aload_0         
	//* 102  188:iload_3         
	//* 103  189:iconst_1        
	//* 104  190:iadd            
	//* 105  191:invokespecial   #170 <Method boolean fillBuffer(int)>
	//* 106  194:ifeq            217
	//* 107  197:aload_0         
	//* 108  198:aload_0         
	//* 109  199:getfield        #107 <Field char[] buffer>
	//* 110  202:aload_0         
	//* 111  203:getfield        #109 <Field int pos>
	//* 112  206:iload_3         
	//* 113  207:iadd            
	//* 114  208:caload          
	//* 115  209:invokespecial   #183 <Method boolean isLiteral(char)>
	//* 116  212:ifeq            217
				return 0;
	//  117  215:iconst_0        
	//  118  216:ireturn         
			pos = pos + k;
	//  119  217:aload_0         
	//  120  218:aload_0         
	//  121  219:getfield        #109 <Field int pos>
	//  122  222:iload_3         
	//  123  223:iadd            
	//  124  224:putfield        #109 <Field int pos>
			peeked = i;
	//  125  227:aload_0         
	//  126  228:iload_1         
	//  127  229:putfield        #117 <Field int peeked>
			return i;
	//  128  232:iload_1         
	//  129  233:ireturn         
		} while(true);
	}

	private int peekNumber()
		throws IOException
	{
		int i;
		boolean flag;
		int j;
		boolean flag1;
		int i1;
		int j1;
		long l1;
		char ac[];
		ac = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore          15
		i = pos;
	//    3    6:aload_0         
	//    4    7:getfield        #109 <Field int pos>
	//    5   10:istore_2        
		j1 = limit;
	//    6   11:aload_0         
	//    7   12:getfield        #111 <Field int limit>
	//    8   15:istore          9
		l1 = 0L;
	//    9   17:lconst_0        
	//   10   18:lstore          11
		flag = false;
	//   11   20:iconst_0        
	//   12   21:istore_3        
		flag1 = true;
	//   13   22:iconst_1        
	//   14   23:istore          5
		i1 = 0;
	//   15   25:iconst_0        
	//   16   26:istore          8
		j = 0;
	//   17   28:iconst_0        
	//   18   29:istore          4
_L12:
		int k;
		int l;
		l = j1;
	//   19   31:iload           9
	//   20   33:istore          7
		k = i;
	//   21   35:iload_2         
	//   22   36:istore          6
		if(i + j != j1) goto _L2; else goto _L1
	//   23   38:iload_2         
	//   24   39:iload           4
	//   25   41:iadd            
	//   26   42:iload           9
	//   27   44:icmpne          134
_L1:
		if(j == ac.length)
	//*  28   47:iload           4
	//*  29   49:aload           15
	//*  30   51:arraylength     
	//*  31   52:icmpne          57
			return 0;
	//   32   55:iconst_0        
	//   33   56:ireturn         
		if(fillBuffer(j + 1)) goto _L4; else goto _L3
	//   34   57:aload_0         
	//   35   58:iload           4
	//   36   60:iconst_1        
	//   37   61:iadd            
	//   38   62:invokespecial   #170 <Method boolean fillBuffer(int)>
	//   39   65:ifne            122
	//*  40   68:iload           8
	//*  41   70:iconst_2        
	//*  42   71:icmpne          552
	//*  43   74:iload           5
	//*  44   76:ifeq            552
	//*  45   79:lload           11
	//*  46   81:ldc2w           #284 <Long 0x0L>
	//*  47   84:lcmp            
	//*  48   85:ifne            92
	//*  49   88:iload_3         
	//*  50   89:ifeq            552
	//*  51   92:iload_3         
	//*  52   93:ifeq            544
	//*  53   96:aload_0         
	//*  54   97:lload           11
	//*  55   99:putfield        #287 <Field long peekedLong>
	//*  56  102:aload_0         
	//*  57  103:aload_0         
	//*  58  104:getfield        #109 <Field int pos>
	//*  59  107:iload           4
	//*  60  109:iadd            
	//*  61  110:putfield        #109 <Field int pos>
	//*  62  113:aload_0         
	//*  63  114:bipush          15
	//*  64  116:putfield        #117 <Field int peeked>
	//*  65  119:bipush          15
	//*  66  121:ireturn         
_L4:
		k = pos;
	//   67  122:aload_0         
	//   68  123:getfield        #109 <Field int pos>
	//   69  126:istore          6
		l = limit;
	//   70  128:aload_0         
	//   71  129:getfield        #111 <Field int limit>
	//   72  132:istore          7
_L2:
		c = ac[k + j];
	//   73  134:aload           15
	//   74  136:iload           6
	//   75  138:iload           4
	//   76  140:iadd            
	//   77  141:caload          
	//   78  142:istore_1        
		c;
	//   79  143:iload_1         
		JVM INSTR lookupswitch 5: default 196
	//	               43: 291
	//	               45: 218
	//	               46: 346
	//	               69: 316
	//	               101: 316;
	//   80  144:lookupswitch    5: default 196
	//	               43: 291
	//	               45: 218
	//	               46: 346
	//	               69: 316
	//	               101: 316
		   goto _L5 _L6 _L7 _L8 _L9 _L9
_L5:
		if(c >= '0' && c <= '9') goto _L11; else goto _L10
	//   81  196:iload_1         
	//   82  197:bipush          48
	//   83  199:icmplt          208
	//   84  202:iload_1         
	//   85  203:bipush          57
	//   86  205:icmple          370
_L10:
		if(isLiteral(c))
	//*  87  208:aload_0         
	//*  88  209:iload_1         
	//*  89  210:invokespecial   #183 <Method boolean isLiteral(char)>
	//*  90  213:ifeq            68
			return 0;
	//   91  216:iconst_0        
	//   92  217:ireturn         
		  goto _L3
_L7:
		if(i1 == 0)
	//*  93  218:iload           8
	//*  94  220:ifne            266
		{
			flag2 = true;
	//   95  223:iconst_1        
	//   96  224:istore          10
			i = 1;
	//   97  226:iconst_1        
	//   98  227:istore_2        
			l2 = l1;
	//   99  228:lload           11
	//  100  230:lstore          13
			j1 = ((int) (flag1));
	//  101  232:iload           5
	//  102  234:istore          9
		} else
	//* 103  236:iload           4
	//* 104  238:iconst_1        
	//* 105  239:iadd            
	//* 106  240:istore          4
	//* 107  242:iload           9
	//* 108  244:istore          5
	//* 109  246:iload           7
	//* 110  248:istore          9
	//* 111  250:iload_2         
	//* 112  251:istore          8
	//* 113  253:iload           10
	//* 114  255:istore_3        
	//* 115  256:iload           6
	//* 116  258:istore_2        
	//* 117  259:lload           13
	//* 118  261:lstore          11
	//* 119  263:goto            31
		if(i1 == 5)
	//* 120  266:iload           8
	//* 121  268:iconst_5        
	//* 122  269:icmpne          289
		{
			i = 6;
	//  123  272:bipush          6
	//  124  274:istore_2        
			j1 = ((int) (flag1));
	//  125  275:iload           5
	//  126  277:istore          9
			flag2 = flag;
	//  127  279:iload_3         
	//  128  280:istore          10
			l2 = l1;
	//  129  282:lload           11
	//  130  284:lstore          13
		} else
	//* 131  286:goto            236
		{
			return 0;
	//  132  289:iconst_0        
	//  133  290:ireturn         
		}
_L13:
		j++;
		flag1 = ((boolean) (j1));
		j1 = l;
		i1 = i;
		flag = flag2;
		i = k;
		l1 = l2;
		  goto _L12
_L6:
		if(i1 == 5)
	//* 134  291:iload           8
	//* 135  293:iconst_5        
	//* 136  294:icmpne          314
		{
			i = 6;
	//  137  297:bipush          6
	//  138  299:istore_2        
			j1 = ((int) (flag1));
	//  139  300:iload           5
	//  140  302:istore          9
			flag2 = flag;
	//  141  304:iload_3         
	//  142  305:istore          10
			l2 = l1;
	//  143  307:lload           11
	//  144  309:lstore          13
		} else
	//* 145  311:goto            236
		{
			return 0;
	//  146  314:iconst_0        
	//  147  315:ireturn         
		}
		  goto _L13
_L9:
		if(i1 == 2 || i1 == 4)
	//* 148  316:iload           8
	//* 149  318:iconst_2        
	//* 150  319:icmpeq          328
	//* 151  322:iload           8
	//* 152  324:iconst_4        
	//* 153  325:icmpne          344
		{
			i = 5;
	//  154  328:iconst_5        
	//  155  329:istore_2        
			j1 = ((int) (flag1));
	//  156  330:iload           5
	//  157  332:istore          9
			flag2 = flag;
	//  158  334:iload_3         
	//  159  335:istore          10
			l2 = l1;
	//  160  337:lload           11
	//  161  339:lstore          13
		} else
	//* 162  341:goto            236
		{
			return 0;
	//  163  344:iconst_0        
	//  164  345:ireturn         
		}
		  goto _L13
_L8:
		if(i1 == 2)
	//* 165  346:iload           8
	//* 166  348:iconst_2        
	//* 167  349:icmpne          368
		{
			i = 3;
	//  168  352:iconst_3        
	//  169  353:istore_2        
			j1 = ((int) (flag1));
	//  170  354:iload           5
	//  171  356:istore          9
			flag2 = flag;
	//  172  358:iload_3         
	//  173  359:istore          10
			l2 = l1;
	//  174  361:lload           11
	//  175  363:lstore          13
		} else
	//* 176  365:goto            236
		{
			return 0;
	//  177  368:iconst_0        
	//  178  369:ireturn         
		}
		  goto _L13
_L11:
		if(i1 == 1 || i1 == 0)
	//* 179  370:iload           8
	//* 180  372:iconst_1        
	//* 181  373:icmpeq          381
	//* 182  376:iload           8
	//* 183  378:ifne            401
		{
			l2 = -(c - 48);
	//  184  381:iload_1         
	//  185  382:bipush          48
	//  186  384:isub            
	//  187  385:ineg            
	//  188  386:i2l             
	//  189  387:lstore          13
			i = 2;
	//  190  389:iconst_2        
	//  191  390:istore_2        
			j1 = ((int) (flag1));
	//  192  391:iload           5
	//  193  393:istore          9
			flag2 = flag;
	//  194  395:iload_3         
	//  195  396:istore          10
		} else
	//* 196  398:goto            236
		if(i1 == 2)
	//* 197  401:iload           8
	//* 198  403:iconst_2        
	//* 199  404:icmpne          478
		{
			if(l1 == 0L)
	//* 200  407:lload           11
	//* 201  409:lconst_0        
	//* 202  410:lcmp            
	//* 203  411:ifne            416
				return 0;
	//  204  414:iconst_0        
	//  205  415:ireturn         
			l2 = 10L * l1 - (long)(c - 48);
	//  206  416:ldc2w           #288 <Long 10L>
	//  207  419:lload           11
	//  208  421:lmul            
	//  209  422:iload_1         
	//  210  423:bipush          48
	//  211  425:isub            
	//  212  426:i2l             
	//  213  427:lsub            
	//  214  428:lstore          13
			if(l1 > 0x33333334L || l1 == 0x33333334L && l2 < l1)
	//* 215  430:lload           11
	//* 216  432:ldc2w           #11  <Long 0x33333334L>
	//* 217  435:lcmp            
	//* 218  436:ifgt            456
	//* 219  439:lload           11
	//* 220  441:ldc2w           #11  <Long 0x33333334L>
	//* 221  444:lcmp            
	//* 222  445:ifne            473
	//* 223  448:lload           13
	//* 224  450:lload           11
	//* 225  452:lcmp            
	//* 226  453:ifge            473
				i = 1;
	//  227  456:iconst_1        
	//  228  457:istore_2        
			else
	//* 229  458:iload           5
	//* 230  460:iload_2         
	//* 231  461:iand            
	//* 232  462:istore          9
	//* 233  464:iload           8
	//* 234  466:istore_2        
	//* 235  467:iload_3         
	//* 236  468:istore          10
	//* 237  470:goto            236
				i = 0;
	//  238  473:iconst_0        
	//  239  474:istore_2        
			j1 = ((int) (flag1 & i));
			i = i1;
			flag2 = flag;
		} else
	//* 240  475:goto            458
		{
label0:
			{
				if(i1 != 3)
					break label0;
	//  241  478:iload           8
	//  242  480:iconst_3        
	//  243  481:icmpne          500
				i = 4;
	//  244  484:iconst_4        
	//  245  485:istore_2        
				j1 = ((int) (flag1));
	//  246  486:iload           5
	//  247  488:istore          9
				flag2 = flag;
	//  248  490:iload_3         
	//  249  491:istore          10
				l2 = l1;
	//  250  493:lload           11
	//  251  495:lstore          13
			}
		}
		  goto _L13
	//* 252  497:goto            236
		if(i1 == 5) goto _L15; else goto _L14
	//  253  500:iload           8
	//  254  502:iconst_5        
	//  255  503:icmpeq          527
_L14:
		j1 = ((int) (flag1));
	//  256  506:iload           5
	//  257  508:istore          9
		i = i1;
	//  258  510:iload           8
	//  259  512:istore_2        
		flag2 = flag;
	//  260  513:iload_3         
	//  261  514:istore          10
		l2 = l1;
	//  262  516:lload           11
	//  263  518:lstore          13
		if(i1 != 6) goto _L13; else goto _L15
	//  264  520:iload           8
	//  265  522:bipush          6
	//  266  524:icmpne          236
_L15:
		i = 7;
	//  267  527:bipush          7
	//  268  529:istore_2        
		j1 = ((int) (flag1));
	//  269  530:iload           5
	//  270  532:istore          9
		flag2 = flag;
	//  271  534:iload_3         
	//  272  535:istore          10
		l2 = l1;
	//  273  537:lload           11
	//  274  539:lstore          13
		  goto _L13
_L3:
		if(i1 == 2 && flag1 && (l1 != 0x0L || flag))
		{
			char c;
			boolean flag2;
			long l2;
			if(!flag)
	//* 275  541:goto            236
				l1 = -l1;
	//  276  544:lload           11
	//  277  546:lneg            
	//  278  547:lstore          11
			peekedLong = l1;
			pos = pos + j;
			peeked = 15;
			return 15;
		}
	//* 279  549:goto            96
		if(i1 == 2 || i1 == 4 || i1 == 7)
	//* 280  552:iload           8
	//* 281  554:iconst_2        
	//* 282  555:icmpeq          571
	//* 283  558:iload           8
	//* 284  560:iconst_4        
	//* 285  561:icmpeq          571
	//* 286  564:iload           8
	//* 287  566:bipush          7
	//* 288  568:icmpne          586
		{
			peekedNumberLength = j;
	//  289  571:aload_0         
	//  290  572:iload           4
	//  291  574:putfield        #291 <Field int peekedNumberLength>
			peeked = 16;
	//  292  577:aload_0         
	//  293  578:bipush          16
	//  294  580:putfield        #117 <Field int peeked>
			return 16;
	//  295  583:bipush          16
	//  296  585:ireturn         
		} else
		{
			return 0;
	//  297  586:iconst_0        
	//  298  587:ireturn         
		}
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
	//   31   53:invokestatic    #207 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (pathIndices)), 0, ((Object) (ai2)), 0, stackSize);
	//   32   56:aload_0         
	//   33   57:getfield        #125 <Field int[] pathIndices>
	//   34   60:iconst_0        
	//   35   61:aload           4
	//   36   63:iconst_0        
	//   37   64:aload_0         
	//   38   65:getfield        #121 <Field int stackSize>
	//   39   68:invokestatic    #207 <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (pathNames)), 0, ((Object) (as)), 0, stackSize);
	//   40   71:aload_0         
	//   41   72:getfield        #123 <Field String[] pathNames>
	//   42   75:iconst_0        
	//   43   76:aload           5
	//   44   78:iconst_0        
	//   45   79:aload_0         
	//   46   80:getfield        #121 <Field int stackSize>
	//   47   83:invokestatic    #207 <Method void System.arraycopy(Object, int, Object, int, int)>
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
		throws IOException
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
	//*   7   13:invokespecial   #170 <Method boolean fillBuffer(int)>
	//*   8   16:ifne            27
			throw syntaxError("Unterminated escape sequence");
	//    9   19:aload_0         
	//   10   20:ldc2            #295 <String "Unterminated escape sequence">
	//   11   23:invokespecial   #161 <Method IOException syntaxError(String)>
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
		c;
	//   28   50:iload_1         
		JVM INSTR lookupswitch 7: default 116
	//	               10: 338
	//	               98: 326
	//	               102: 335
	//	               110: 329
	//	               114: 332
	//	               116: 323
	//	               117: 118;
	//   29   51:lookupswitch    7: default 116
	//	               10: 338
	//	               98: 326
	//	               102: 335
	//	               110: 329
	//	               114: 332
	//	               116: 323
	//	               117: 118
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		return c;
	//   30  116:iload_1         
	//   31  117:ireturn         
_L8:
		if(pos + 4 > limit && !fillBuffer(4))
	//*  32  118:aload_0         
	//*  33  119:getfield        #109 <Field int pos>
	//*  34  122:iconst_4        
	//*  35  123:iadd            
	//*  36  124:aload_0         
	//*  37  125:getfield        #111 <Field int limit>
	//*  38  128:icmple          147
	//*  39  131:aload_0         
	//*  40  132:iconst_4        
	//*  41  133:invokespecial   #170 <Method boolean fillBuffer(int)>
	//*  42  136:ifne            147
			throw syntaxError("Unterminated escape sequence");
	//   43  139:aload_0         
	//   44  140:ldc2            #295 <String "Unterminated escape sequence">
	//   45  143:invokespecial   #161 <Method IOException syntaxError(String)>
	//   46  146:athrow          
		char c1 = '\0';
	//   47  147:iconst_0        
	//   48  148:istore_1        
		int k = pos;
	//   49  149:aload_0         
	//   50  150:getfield        #109 <Field int pos>
	//   51  153:istore_3        
		int j = k;
	//   52  154:iload_3         
	//   53  155:istore_2        
		while(j < k + 4) 
	//*  54  156:iload_2         
	//*  55  157:iload_3         
	//*  56  158:iconst_4        
	//*  57  159:iadd            
	//*  58  160:icmpge          311
		{
			char c2 = buffer[j];
	//   59  163:aload_0         
	//   60  164:getfield        #107 <Field char[] buffer>
	//   61  167:iload_2         
	//   62  168:caload          
	//   63  169:istore          4
			char c3 = (char)(c1 << 4);
	//   64  171:iload_1         
	//   65  172:iconst_4        
	//   66  173:ishl            
	//   67  174:int2char        
	//   68  175:istore          5
			if(c2 >= '0' && c2 <= '9')
	//*  69  177:iload           4
	//*  70  179:bipush          48
	//*  71  181:icmplt          208
	//*  72  184:iload           4
	//*  73  186:bipush          57
	//*  74  188:icmpgt          208
				c1 = (char)((c2 - 48) + c3);
	//   75  191:iload           4
	//   76  193:bipush          48
	//   77  195:isub            
	//   78  196:iload           5
	//   79  198:iadd            
	//   80  199:int2char        
	//   81  200:istore_1        
			else
	//*  82  201:iload_2         
	//*  83  202:iconst_1        
	//*  84  203:iadd            
	//*  85  204:istore_2        
	//*  86  205:goto            156
			if(c2 >= 'a' && c2 <= 'f')
	//*  87  208:iload           4
	//*  88  210:bipush          97
	//*  89  212:icmplt          238
	//*  90  215:iload           4
	//*  91  217:bipush          102
	//*  92  219:icmpgt          238
				c1 = (char)((c2 - 97) + 10 + c3);
	//   93  222:iload           4
	//   94  224:bipush          97
	//   95  226:isub            
	//   96  227:bipush          10
	//   97  229:iadd            
	//   98  230:iload           5
	//   99  232:iadd            
	//  100  233:int2char        
	//  101  234:istore_1        
			else
	//* 102  235:goto            201
			if(c2 >= 'A' && c2 <= 'F')
	//* 103  238:iload           4
	//* 104  240:bipush          65
	//* 105  242:icmplt          268
	//* 106  245:iload           4
	//* 107  247:bipush          70
	//* 108  249:icmpgt          268
				c1 = (char)((c2 - 65) + 10 + c3);
	//  109  252:iload           4
	//  110  254:bipush          65
	//  111  256:isub            
	//  112  257:bipush          10
	//  113  259:iadd            
	//  114  260:iload           5
	//  115  262:iadd            
	//  116  263:int2char        
	//  117  264:istore_1        
			else
	//* 118  265:goto            201
				throw new NumberFormatException((new StringBuilder()).append("\\u").append(new String(buffer, pos, 4)).toString());
	//  119  268:new             #297 <Class NumberFormatException>
	//  120  271:dup             
	//  121  272:new             #218 <Class StringBuilder>
	//  122  275:dup             
	//  123  276:invokespecial   #219 <Method void StringBuilder()>
	//  124  279:ldc2            #299 <String "\\u">
	//  125  282:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  126  285:new             #85  <Class String>
	//  127  288:dup             
	//  128  289:aload_0         
	//  129  290:getfield        #107 <Field char[] buffer>
	//  130  293:aload_0         
	//  131  294:getfield        #109 <Field int pos>
	//  132  297:iconst_4        
	//  133  298:invokespecial   #264 <Method void String(char[], int, int)>
	//  134  301:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  135  304:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  136  307:invokespecial   #300 <Method void NumberFormatException(String)>
	//  137  310:athrow          
			j++;
		}
		pos = pos + 4;
	//  138  311:aload_0         
	//  139  312:aload_0         
	//  140  313:getfield        #109 <Field int pos>
	//  141  316:iconst_4        
	//  142  317:iadd            
	//  143  318:putfield        #109 <Field int pos>
		return c1;
	//  144  321:iload_1         
	//  145  322:ireturn         
_L7:
		return '\t';
	//  146  323:bipush          9
	//  147  325:ireturn         
_L3:
		return '\b';
	//  148  326:bipush          8
	//  149  328:ireturn         
_L5:
		return '\n';
	//  150  329:bipush          10
	//  151  331:ireturn         
_L6:
		return '\r';
	//  152  332:bipush          13
	//  153  334:ireturn         
_L4:
		return '\f';
	//  154  335:bipush          12
	//  155  337:ireturn         
_L2:
		lineNumber = lineNumber + 1;
	//  156  338:aload_0         
	//  157  339:aload_0         
	//  158  340:getfield        #113 <Field int lineNumber>
	//  159  343:iconst_1        
	//  160  344:iadd            
	//  161  345:putfield        #113 <Field int lineNumber>
		lineStart = pos;
	//  162  348:aload_0         
	//  163  349:aload_0         
	//  164  350:getfield        #109 <Field int pos>
	//  165  353:putfield        #115 <Field int lineStart>
		if(true) goto _L1; else goto _L9
	//  166  356:goto            116
_L9:
	}

	private void skipQuotedValue(char c)
		throws IOException
	{
		char ac[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field char[] buffer>
	//    2    4:astore          7
		do
		{
			int i = pos;
	//    3    6:aload_0         
	//    4    7:getfield        #109 <Field int pos>
	//    5   10:istore_2        
			int j = limit;
	//    6   11:aload_0         
	//    7   12:getfield        #111 <Field int limit>
	//    8   15:istore_3        
			while(i < j) 
	//*   9   16:iload_2         
	//*  10   17:iload_3         
	//*  11   18:icmpge          118
			{
				int l = i + 1;
	//   12   21:iload_2         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:istore          5
				char c1 = ac[i];
	//   16   26:aload           7
	//   17   28:iload_2         
	//   18   29:caload          
	//   19   30:istore          6
				if(c1 == c)
	//*  20   32:iload           6
	//*  21   34:iload_1         
	//*  22   35:icmpne          45
				{
					pos = l;
	//   23   38:aload_0         
	//   24   39:iload           5
	//   25   41:putfield        #109 <Field int pos>
					return;
	//   26   44:return          
				}
				int k;
				if(c1 == '\\')
	//*  27   45:iload           6
	//*  28   47:bipush          92
	//*  29   49:icmpne          80
				{
					pos = l;
	//   30   52:aload_0         
	//   31   53:iload           5
	//   32   55:putfield        #109 <Field int pos>
					readEscapeCharacter();
	//   33   58:aload_0         
	//   34   59:invokespecial   #255 <Method char readEscapeCharacter()>
	//   35   62:pop             
					i = pos;
	//   36   63:aload_0         
	//   37   64:getfield        #109 <Field int pos>
	//   38   67:istore_2        
					k = limit;
	//   39   68:aload_0         
	//   40   69:getfield        #111 <Field int limit>
	//   41   72:istore          4
				} else
	//*  42   74:iload           4
	//*  43   76:istore_3        
	//*  44   77:goto            16
				{
					k = j;
	//   45   80:iload_3         
	//   46   81:istore          4
					i = l;
	//   47   83:iload           5
	//   48   85:istore_2        
					if(c1 == '\n')
	//*  49   86:iload           6
	//*  50   88:bipush          10
	//*  51   90:icmpne          74
					{
						lineNumber = lineNumber + 1;
	//   52   93:aload_0         
	//   53   94:aload_0         
	//   54   95:getfield        #113 <Field int lineNumber>
	//   55   98:iconst_1        
	//   56   99:iadd            
	//   57  100:putfield        #113 <Field int lineNumber>
						lineStart = l;
	//   58  103:aload_0         
	//   59  104:iload           5
	//   60  106:putfield        #115 <Field int lineStart>
						k = j;
	//   61  109:iload_3         
	//   62  110:istore          4
						i = l;
	//   63  112:iload           5
	//   64  114:istore_2        
					}
				}
				j = k;
			}
	//*  65  115:goto            74
			pos = i;
	//   66  118:aload_0         
	//   67  119:iload_2         
	//   68  120:putfield        #109 <Field int pos>
		} while(fillBuffer(1));
	//   69  123:aload_0         
	//   70  124:iconst_1        
	//   71  125:invokespecial   #170 <Method boolean fillBuffer(int)>
	//   72  128:ifne            6
		throw syntaxError("Unterminated string");
	//   73  131:aload_0         
	//   74  132:ldc2            #260 <String "Unterminated string">
	//   75  135:invokespecial   #161 <Method IOException syntaxError(String)>
	//   76  138:athrow          
	}

	private boolean skipTo(String s)
		throws IOException
	{
_L2:
		if(pos + s.length() > limit && !fillBuffer(s.length()))
			break MISSING_BLOCK_LABEL_112;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field int pos>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #271 <Method int String.length()>
	//    4    8:iadd            
	//    5    9:aload_0         
	//    6   10:getfield        #111 <Field int limit>
	//    7   13:icmple          27
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #271 <Method int String.length()>
	//   11   21:invokespecial   #170 <Method boolean fillBuffer(int)>
	//   12   24:ifeq            112
		if(buffer[pos] != '\n')
			break; /* Loop/switch isn't completed */
	//   13   27:aload_0         
	//   14   28:getfield        #107 <Field char[] buffer>
	//   15   31:aload_0         
	//   16   32:getfield        #109 <Field int pos>
	//   17   35:caload          
	//   18   36:bipush          10
	//   19   38:icmpne          74
		lineNumber = lineNumber + 1;
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:getfield        #113 <Field int lineNumber>
	//   23   46:iconst_1        
	//   24   47:iadd            
	//   25   48:putfield        #113 <Field int lineNumber>
		lineStart = pos + 1;
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:getfield        #109 <Field int pos>
	//   29   56:iconst_1        
	//   30   57:iadd            
	//   31   58:putfield        #115 <Field int lineStart>
_L4:
		pos = pos + 1;
	//   32   61:aload_0         
	//   33   62:aload_0         
	//   34   63:getfield        #109 <Field int pos>
	//   35   66:iconst_1        
	//   36   67:iadd            
	//   37   68:putfield        #109 <Field int pos>
		if(true) goto _L2; else goto _L1
	//   38   71:goto            0
_L1:
		int i = 0;
	//   39   74:iconst_0        
	//   40   75:istore_2        
_L5:
		if(i >= s.length())
			break MISSING_BLOCK_LABEL_110;
	//   41   76:iload_2         
	//   42   77:aload_1         
	//   43   78:invokevirtual   #271 <Method int String.length()>
	//   44   81:icmpge          110
		if(buffer[pos + i] != s.charAt(i)) goto _L4; else goto _L3
	//   45   84:aload_0         
	//   46   85:getfield        #107 <Field char[] buffer>
	//   47   88:aload_0         
	//   48   89:getfield        #109 <Field int pos>
	//   49   92:iload_2         
	//   50   93:iadd            
	//   51   94:caload          
	//   52   95:aload_1         
	//   53   96:iload_2         
	//   54   97:invokevirtual   #283 <Method char String.charAt(int)>
	//   55  100:icmpne          61
_L3:
		i++;
	//   56  103:iload_2         
	//   57  104:iconst_1        
	//   58  105:iadd            
	//   59  106:istore_2        
		  goto _L5
		  goto _L4
	//*  60  107:goto            76
		return true;
	//   61  110:iconst_1        
	//   62  111:ireturn         
		return false;
	//   63  112:iconst_0        
	//   64  113:ireturn         
	}

	private void skipToEndOfLine()
		throws IOException
	{
		int i;
		do
		{
			if(pos < limit || fillBuffer(1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field int pos>
	//*   2    4:aload_0         
	//*   3    5:getfield        #111 <Field int limit>
	//*   4    8:icmplt          19
	//*   5   11:aload_0         
	//*   6   12:iconst_1        
	//*   7   13:invokespecial   #170 <Method boolean fillBuffer(int)>
	//*   8   16:ifeq            64
			{
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
				if(i != '\n')
					continue;
	//   24   40:iload_1         
	//   25   41:bipush          10
	//   26   43:icmpne          65
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
			}
			return;
	//   37   64:return          
		} while(i != '\r');
	//   38   65:iload_1         
	//   39   66:bipush          13
	//   40   68:icmpne          0
	//   41   71:return          
	}

	private void skipUnquotedValue()
		throws IOException
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
	//   23  172:invokespecial   #172 <Method void checkLenient()>
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
	//*  39  198:invokespecial   #170 <Method boolean fillBuffer(int)>
	//*  40  201:ifne            0
			return;
	//   41  204:return          
		if(true) goto _L2; else goto _L1
_L1:
	}

	private IOException syntaxError(String s)
		throws IOException
	{
		throw new MalformedJsonException((new StringBuilder()).append(s).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	//    0    0:new             #305 <Class MalformedJsonException>
	//    1    3:dup             
	//    2    4:new             #218 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #219 <Method void StringBuilder()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:ldc2            #307 <String " at line ">
	//    8   18:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:aload_0         
	//   10   22:invokespecial   #150 <Method int getLineNumber()>
	//   11   25:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   12   28:ldc1            #230 <String " column ">
	//   13   30:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:aload_0         
	//   15   34:invokespecial   #154 <Method int getColumnNumber()>
	//   16   37:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   17   40:ldc2            #309 <String " path ">
	//   18   43:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   19   46:aload_0         
	//   20   47:invokevirtual   #312 <Method String getPath()>
	//   21   50:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   22   53:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   23   56:invokespecial   #313 <Method void MalformedJsonException(String)>
	//   24   59:athrow          
	}

	public void beginArray()
		throws IOException
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
	//    8   12:invokespecial   #145 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 3)
	//*  10   16:iload_1         
	//*  11   17:iconst_3        
	//*  12   18:icmpne          44
		{
			push(1);
	//   13   21:aload_0         
	//   14   22:iconst_1        
	//   15   23:invokespecial   #316 <Method void push(int)>
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
			throw new IllegalStateException((new StringBuilder()).append("Expected BEGIN_ARRAY but was ").append(((Object) (peek()))).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	//   28   44:new             #191 <Class IllegalStateException>
	//   29   47:dup             
	//   30   48:new             #218 <Class StringBuilder>
	//   31   51:dup             
	//   32   52:invokespecial   #219 <Method void StringBuilder()>
	//   33   55:ldc2            #318 <String "Expected BEGIN_ARRAY but was ">
	//   34   58:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   35   61:aload_0         
	//   36   62:invokevirtual   #322 <Method JsonToken peek()>
	//   37   65:invokevirtual   #325 <Method StringBuilder StringBuilder.append(Object)>
	//   38   68:ldc2            #307 <String " at line ">
	//   39   71:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   40   74:aload_0         
	//   41   75:invokespecial   #150 <Method int getLineNumber()>
	//   42   78:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   43   81:ldc1            #230 <String " column ">
	//   44   83:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   45   86:aload_0         
	//   46   87:invokespecial   #154 <Method int getColumnNumber()>
	//   47   90:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   48   93:ldc2            #309 <String " path ">
	//   49   96:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   50   99:aload_0         
	//   51  100:invokevirtual   #312 <Method String getPath()>
	//   52  103:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   53  106:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   54  109:invokespecial   #194 <Method void IllegalStateException(String)>
	//   55  112:athrow          
		}
	}

	public void beginObject()
		throws IOException
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
	//    8   12:invokespecial   #145 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 1)
	//*  10   16:iload_1         
	//*  11   17:iconst_1        
	//*  12   18:icmpne          32
		{
			push(3);
	//   13   21:aload_0         
	//   14   22:iconst_3        
	//   15   23:invokespecial   #316 <Method void push(int)>
			peeked = 0;
	//   16   26:aload_0         
	//   17   27:iconst_0        
	//   18   28:putfield        #117 <Field int peeked>
			return;
	//   19   31:return          
		} else
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected BEGIN_OBJECT but was ").append(((Object) (peek()))).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	//   20   32:new             #191 <Class IllegalStateException>
	//   21   35:dup             
	//   22   36:new             #218 <Class StringBuilder>
	//   23   39:dup             
	//   24   40:invokespecial   #219 <Method void StringBuilder()>
	//   25   43:ldc2            #328 <String "Expected BEGIN_OBJECT but was ">
	//   26   46:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   27   49:aload_0         
	//   28   50:invokevirtual   #322 <Method JsonToken peek()>
	//   29   53:invokevirtual   #325 <Method StringBuilder StringBuilder.append(Object)>
	//   30   56:ldc2            #307 <String " at line ">
	//   31   59:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   32   62:aload_0         
	//   33   63:invokespecial   #150 <Method int getLineNumber()>
	//   34   66:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   35   69:ldc1            #230 <String " column ">
	//   36   71:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   37   74:aload_0         
	//   38   75:invokespecial   #154 <Method int getColumnNumber()>
	//   39   78:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   40   81:ldc2            #309 <String " path ">
	//   41   84:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   42   87:aload_0         
	//   43   88:invokevirtual   #312 <Method String getPath()>
	//   44   91:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   45   94:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   46   97:invokespecial   #194 <Method void IllegalStateException(String)>
	//   47  100:athrow          
		}
	}

	public void close()
		throws IOException
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
	//   13   22:invokevirtual   #331 <Method void Reader.close()>
	//   14   25:return          
	}

	public void endArray()
		throws IOException
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
	//    8   12:invokespecial   #145 <Method int doPeek()>
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
			throw new IllegalStateException((new StringBuilder()).append("Expected END_ARRAY but was ").append(((Object) (peek()))).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	//   39   57:new             #191 <Class IllegalStateException>
	//   40   60:dup             
	//   41   61:new             #218 <Class StringBuilder>
	//   42   64:dup             
	//   43   65:invokespecial   #219 <Method void StringBuilder()>
	//   44   68:ldc2            #334 <String "Expected END_ARRAY but was ">
	//   45   71:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   46   74:aload_0         
	//   47   75:invokevirtual   #322 <Method JsonToken peek()>
	//   48   78:invokevirtual   #325 <Method StringBuilder StringBuilder.append(Object)>
	//   49   81:ldc2            #307 <String " at line ">
	//   50   84:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   51   87:aload_0         
	//   52   88:invokespecial   #150 <Method int getLineNumber()>
	//   53   91:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   54   94:ldc1            #230 <String " column ">
	//   55   96:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   56   99:aload_0         
	//   57  100:invokespecial   #154 <Method int getColumnNumber()>
	//   58  103:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   59  106:ldc2            #309 <String " path ">
	//   60  109:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   61  112:aload_0         
	//   62  113:invokevirtual   #312 <Method String getPath()>
	//   63  116:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   64  119:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   65  122:invokespecial   #194 <Method void IllegalStateException(String)>
	//   66  125:athrow          
		}
	}

	public void endObject()
		throws IOException
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
	//    8   12:invokespecial   #145 <Method int doPeek()>
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
			throw new IllegalStateException((new StringBuilder()).append("Expected END_OBJECT but was ").append(((Object) (peek()))).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	//   45   67:new             #191 <Class IllegalStateException>
	//   46   70:dup             
	//   47   71:new             #218 <Class StringBuilder>
	//   48   74:dup             
	//   49   75:invokespecial   #219 <Method void StringBuilder()>
	//   50   78:ldc2            #337 <String "Expected END_OBJECT but was ">
	//   51   81:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   52   84:aload_0         
	//   53   85:invokevirtual   #322 <Method JsonToken peek()>
	//   54   88:invokevirtual   #325 <Method StringBuilder StringBuilder.append(Object)>
	//   55   91:ldc2            #307 <String " at line ">
	//   56   94:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   57   97:aload_0         
	//   58   98:invokespecial   #150 <Method int getLineNumber()>
	//   59  101:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   60  104:ldc1            #230 <String " column ">
	//   61  106:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   62  109:aload_0         
	//   63  110:invokespecial   #154 <Method int getColumnNumber()>
	//   64  113:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   65  116:ldc2            #309 <String " path ">
	//   66  119:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   67  122:aload_0         
	//   68  123:invokevirtual   #312 <Method String getPath()>
	//   69  126:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   70  129:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   71  132:invokespecial   #194 <Method void IllegalStateException(String)>
	//   72  135:athrow          
		}
	}

	public String getPath()
	{
		int i;
		int j;
		StringBuilder stringbuilder;
		stringbuilder = (new StringBuilder()).append('$');
	//    0    0:new             #218 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #219 <Method void StringBuilder()>
	//    3    7:bipush          36
	//    4    9:invokevirtual   #258 <Method StringBuilder StringBuilder.append(char)>
	//    5   12:astore_3        
		i = 0;
	//    6   13:iconst_0        
	//    7   14:istore_1        
		j = stackSize;
	//    8   15:aload_0         
	//    9   16:getfield        #121 <Field int stackSize>
	//   10   19:istore_2        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_125;
	//   11   20:iload_1         
	//   12   21:iload_2         
	//   13   22:icmpge          125
		switch(stack[i])
	//*  14   25:aload_0         
	//*  15   26:getfield        #119 <Field int[] stack>
	//*  16   29:iload_1         
	//*  17   30:iaload          
		{
		default:
			break;

	//*  18   31:tableswitch     1 5: default 64
	//	               1 71
	//	               2 71
	//	               3 95
	//	               4 95
	//	               5 95
		case 1: // '\001'
		case 2: // '\002'
			break; /* Loop/switch isn't completed */
	//   19   64:iload_1         

		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			break;
		}
		break MISSING_BLOCK_LABEL_95;
_L3:
		i++;
	//   20   65:iconst_1        
	//   21   66:iadd            
	//   22   67:istore_1        
		if(true) goto _L2; else goto _L1
	//   23   68:goto            20
_L1:
		stringbuilder.append('[').append(pathIndices[i]).append(']');
	//   24   71:aload_3         
	//   25   72:bipush          91
	//   26   74:invokevirtual   #258 <Method StringBuilder StringBuilder.append(char)>
	//   27   77:aload_0         
	//   28   78:getfield        #125 <Field int[] pathIndices>
	//   29   81:iload_1         
	//   30   82:iaload          
	//   31   83:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   32   86:bipush          93
	//   33   88:invokevirtual   #258 <Method StringBuilder StringBuilder.append(char)>
	//   34   91:pop             
		  goto _L3
	//*  35   92:goto            64
		stringbuilder.append('.');
	//   36   95:aload_3         
	//   37   96:bipush          46
	//   38   98:invokevirtual   #258 <Method StringBuilder StringBuilder.append(char)>
	//   39  101:pop             
		if(pathNames[i] != null)
	//*  40  102:aload_0         
	//*  41  103:getfield        #123 <Field String[] pathNames>
	//*  42  106:iload_1         
	//*  43  107:aaload          
	//*  44  108:ifnull          64
			stringbuilder.append(pathNames[i]);
	//   45  111:aload_3         
	//   46  112:aload_0         
	//   47  113:getfield        #123 <Field String[] pathNames>
	//   48  116:iload_1         
	//   49  117:aaload          
	//   50  118:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   51  121:pop             
		  goto _L3
	//*  52  122:goto            64
		return stringbuilder.toString();
	//   53  125:aload_3         
	//   54  126:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   55  129:areturn         
	}

	public boolean hasNext()
		throws IOException
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
	//    8   12:invokespecial   #145 <Method int doPeek()>
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
		throws IOException
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
	//    8   12:invokespecial   #145 <Method int doPeek()>
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
			throw new IllegalStateException((new StringBuilder()).append("Expected a boolean but was ").append(((Object) (peek()))).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	//   58   81:new             #191 <Class IllegalStateException>
	//   59   84:dup             
	//   60   85:new             #218 <Class StringBuilder>
	//   61   88:dup             
	//   62   89:invokespecial   #219 <Method void StringBuilder()>
	//   63   92:ldc2            #343 <String "Expected a boolean but was ">
	//   64   95:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   65   98:aload_0         
	//   66   99:invokevirtual   #322 <Method JsonToken peek()>
	//   67  102:invokevirtual   #325 <Method StringBuilder StringBuilder.append(Object)>
	//   68  105:ldc2            #307 <String " at line ">
	//   69  108:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   70  111:aload_0         
	//   71  112:invokespecial   #150 <Method int getLineNumber()>
	//   72  115:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   73  118:ldc1            #230 <String " column ">
	//   74  120:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   75  123:aload_0         
	//   76  124:invokespecial   #154 <Method int getColumnNumber()>
	//   77  127:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   78  130:ldc2            #309 <String " path ">
	//   79  133:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   80  136:aload_0         
	//   81  137:invokevirtual   #312 <Method String getPath()>
	//   82  140:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   83  143:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   84  146:invokespecial   #194 <Method void IllegalStateException(String)>
	//   85  149:athrow          
		}
	}

	public double nextDouble()
		throws IOException
	{
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore          5
		int i = k;
	//    3    6:iload           5
	//    4    8:istore          4
		if(k == 0)
	//*   5   10:iload           5
	//*   6   12:ifne            21
			i = doPeek();
	//    7   15:aload_0         
	//    8   16:invokespecial   #145 <Method int doPeek()>
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
	//   33   60:getfield        #287 <Field long peekedLong>
	//   34   63:l2d             
	//   35   64:dreturn         
		}
		if(i == 16)
	//*  36   65:iload           4
	//*  37   67:bipush          16
	//*  38   69:icmpne          209
		{
			peekedString = new String(buffer, pos, peekedNumberLength);
	//   39   72:aload_0         
	//   40   73:new             #85  <Class String>
	//   41   76:dup             
	//   42   77:aload_0         
	//   43   78:getfield        #107 <Field char[] buffer>
	//   44   81:aload_0         
	//   45   82:getfield        #109 <Field int pos>
	//   46   85:aload_0         
	//   47   86:getfield        #291 <Field int peekedNumberLength>
	//   48   89:invokespecial   #264 <Method void String(char[], int, int)>
	//   49   92:putfield        #347 <Field String peekedString>
			pos = pos + peekedNumberLength;
	//   50   95:aload_0         
	//   51   96:aload_0         
	//   52   97:getfield        #109 <Field int pos>
	//   53  100:aload_0         
	//   54  101:getfield        #291 <Field int peekedNumberLength>
	//   55  104:iadd            
	//   56  105:putfield        #109 <Field int pos>
		} else
	//*  57  108:aload_0         
	//*  58  109:bipush          11
	//*  59  111:putfield        #117 <Field int peeked>
	//*  60  114:aload_0         
	//*  61  115:getfield        #347 <Field String peekedString>
	//*  62  118:invokestatic    #353 <Method double Double.parseDouble(String)>
	//*  63  121:dstore_2        
	//*  64  122:aload_0         
	//*  65  123:getfield        #105 <Field boolean lenient>
	//*  66  126:ifne            345
	//*  67  129:dload_2         
	//*  68  130:invokestatic    #357 <Method boolean Double.isNaN(double)>
	//*  69  133:ifne            143
	//*  70  136:dload_2         
	//*  71  137:invokestatic    #360 <Method boolean Double.isInfinite(double)>
	//*  72  140:ifeq            345
	//*  73  143:new             #305 <Class MalformedJsonException>
	//*  74  146:dup             
	//*  75  147:new             #218 <Class StringBuilder>
	//*  76  150:dup             
	//*  77  151:invokespecial   #219 <Method void StringBuilder()>
	//*  78  154:ldc2            #362 <String "JSON forbids NaN and infinities: ">
	//*  79  157:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//*  80  160:dload_2         
	//*  81  161:invokevirtual   #365 <Method StringBuilder StringBuilder.append(double)>
	//*  82  164:ldc2            #307 <String " at line ">
	//*  83  167:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//*  84  170:aload_0         
	//*  85  171:invokespecial   #150 <Method int getLineNumber()>
	//*  86  174:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//*  87  177:ldc1            #230 <String " column ">
	//*  88  179:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//*  89  182:aload_0         
	//*  90  183:invokespecial   #154 <Method int getColumnNumber()>
	//*  91  186:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//*  92  189:ldc2            #309 <String " path ">
	//*  93  192:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//*  94  195:aload_0         
	//*  95  196:invokevirtual   #312 <Method String getPath()>
	//*  96  199:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//*  97  202:invokevirtual   #234 <Method String StringBuilder.toString()>
	//*  98  205:invokespecial   #313 <Method void MalformedJsonException(String)>
	//*  99  208:athrow          
		if(i == 8 || i == 9)
	//* 100  209:iload           4
	//* 101  211:bipush          8
	//* 102  213:icmpeq          223
	//* 103  216:iload           4
	//* 104  218:bipush          9
	//* 105  220:icmpne          251
		{
			char c;
			if(i == 8)
	//* 106  223:iload           4
	//* 107  225:bipush          8
	//* 108  227:icmpne          245
				c = '\'';
	//  109  230:bipush          39
	//  110  232:istore_1        
			else
	//* 111  233:aload_0         
	//* 112  234:aload_0         
	//* 113  235:iload_1         
	//* 114  236:invokespecial   #367 <Method String nextQuotedValue(char)>
	//* 115  239:putfield        #347 <Field String peekedString>
	//* 116  242:goto            108
				c = '"';
	//  117  245:bipush          34
	//  118  247:istore_1        
			peekedString = nextQuotedValue(c);
		} else
	//* 119  248:goto            233
		{
			if(i != 10)
				continue;
	//  120  251:iload           4
	//  121  253:bipush          10
	//  122  255:icmpne          269
			peekedString = nextUnquotedValue();
	//  123  258:aload_0         
	//  124  259:aload_0         
	//  125  260:invokespecial   #369 <Method String nextUnquotedValue()>
	//  126  263:putfield        #347 <Field String peekedString>
		}
		do
		{
			peeked = 11;
			double d = Double.parseDouble(peekedString);
			if(!lenient && (Double.isNaN(d) || Double.isInfinite(d)))
			{
				throw new MalformedJsonException((new StringBuilder()).append("JSON forbids NaN and infinities: ").append(d).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
			} else
	//* 127  266:goto            108
	//* 128  269:iload           4
	//* 129  271:bipush          11
	//* 130  273:icmpeq          108
	//* 131  276:new             #191 <Class IllegalStateException>
	//* 132  279:dup             
	//* 133  280:new             #218 <Class StringBuilder>
	//* 134  283:dup             
	//* 135  284:invokespecial   #219 <Method void StringBuilder()>
	//* 136  287:ldc2            #371 <String "Expected a double but was ">
	//* 137  290:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 138  293:aload_0         
	//* 139  294:invokevirtual   #322 <Method JsonToken peek()>
	//* 140  297:invokevirtual   #325 <Method StringBuilder StringBuilder.append(Object)>
	//* 141  300:ldc2            #307 <String " at line ">
	//* 142  303:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 143  306:aload_0         
	//* 144  307:invokespecial   #150 <Method int getLineNumber()>
	//* 145  310:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//* 146  313:ldc1            #230 <String " column ">
	//* 147  315:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 148  318:aload_0         
	//* 149  319:invokespecial   #154 <Method int getColumnNumber()>
	//* 150  322:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//* 151  325:ldc2            #309 <String " path ">
	//* 152  328:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 153  331:aload_0         
	//* 154  332:invokevirtual   #312 <Method String getPath()>
	//* 155  335:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 156  338:invokevirtual   #234 <Method String StringBuilder.toString()>
	//* 157  341:invokespecial   #194 <Method void IllegalStateException(String)>
	//* 158  344:athrow          
			{
				peekedString = null;
	//  159  345:aload_0         
	//  160  346:aconst_null     
	//  161  347:putfield        #347 <Field String peekedString>
				peeked = 0;
	//  162  350:aload_0         
	//  163  351:iconst_0        
	//  164  352:putfield        #117 <Field int peeked>
				int ai1[] = pathIndices;
	//  165  355:aload_0         
	//  166  356:getfield        #125 <Field int[] pathIndices>
	//  167  359:astore          6
				int j = stackSize - 1;
	//  168  361:aload_0         
	//  169  362:getfield        #121 <Field int stackSize>
	//  170  365:iconst_1        
	//  171  366:isub            
	//  172  367:istore          4
				ai1[j] = ai1[j] + 1;
	//  173  369:aload           6
	//  174  371:iload           4
	//  175  373:aload           6
	//  176  375:iload           4
	//  177  377:iaload          
	//  178  378:iconst_1        
	//  179  379:iadd            
	//  180  380:iastore         
				return d;
	//  181  381:dload_2         
	//  182  382:dreturn         
			}
		} while(i == 11);
		throw new IllegalStateException((new StringBuilder()).append("Expected a double but was ").append(((Object) (peek()))).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	}

	public int nextInt()
		throws IOException
	{
		int i;
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int peeked>
	//    2    4:istore          5
		i = j;
	//    3    6:iload           5
	//    4    8:istore          4
		if(j == 0)
	//*   5   10:iload           5
	//*   6   12:ifne            21
			i = doPeek();
	//    7   15:aload_0         
	//    8   16:invokespecial   #145 <Method int doPeek()>
	//    9   19:istore          4
		if(i == 15)
	//*  10   21:iload           4
	//*  11   23:bipush          15
	//*  12   25:icmpne          149
		{
			i = (int)peekedLong;
	//   13   28:aload_0         
	//   14   29:getfield        #287 <Field long peekedLong>
	//   15   32:l2i             
	//   16   33:istore          4
			if(peekedLong != (long)i)
	//*  17   35:aload_0         
	//*  18   36:getfield        #287 <Field long peekedLong>
	//*  19   39:iload           4
	//*  20   41:i2l             
	//*  21   42:lcmp            
	//*  22   43:ifeq            115
			{
				throw new NumberFormatException((new StringBuilder()).append("Expected an int but was ").append(peekedLong).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	//   23   46:new             #297 <Class NumberFormatException>
	//   24   49:dup             
	//   25   50:new             #218 <Class StringBuilder>
	//   26   53:dup             
	//   27   54:invokespecial   #219 <Method void StringBuilder()>
	//   28   57:ldc2            #374 <String "Expected an int but was ">
	//   29   60:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   30   63:aload_0         
	//   31   64:getfield        #287 <Field long peekedLong>
	//   32   67:invokevirtual   #377 <Method StringBuilder StringBuilder.append(long)>
	//   33   70:ldc2            #307 <String " at line ">
	//   34   73:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   35   76:aload_0         
	//   36   77:invokespecial   #150 <Method int getLineNumber()>
	//   37   80:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   38   83:ldc1            #230 <String " column ">
	//   39   85:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   40   88:aload_0         
	//   41   89:invokespecial   #154 <Method int getColumnNumber()>
	//   42   92:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   43   95:ldc2            #309 <String " path ">
	//   44   98:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   45  101:aload_0         
	//   46  102:invokevirtual   #312 <Method String getPath()>
	//   47  105:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   48  108:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   49  111:invokespecial   #300 <Method void NumberFormatException(String)>
	//   50  114:athrow          
			} else
			{
				peeked = 0;
	//   51  115:aload_0         
	//   52  116:iconst_0        
	//   53  117:putfield        #117 <Field int peeked>
				int ai[] = pathIndices;
	//   54  120:aload_0         
	//   55  121:getfield        #125 <Field int[] pathIndices>
	//   56  124:astore          6
				int k = stackSize - 1;
	//   57  126:aload_0         
	//   58  127:getfield        #121 <Field int stackSize>
	//   59  130:iconst_1        
	//   60  131:isub            
	//   61  132:istore          5
				ai[k] = ai[k] + 1;
	//   62  134:aload           6
	//   63  136:iload           5
	//   64  138:aload           6
	//   65  140:iload           5
	//   66  142:iaload          
	//   67  143:iconst_1        
	//   68  144:iadd            
	//   69  145:iastore         
				return i;
	//   70  146:iload           4
	//   71  148:ireturn         
			}
		}
		if(i != 16) goto _L2; else goto _L1
	//   72  149:iload           4
	//   73  151:bipush          16
	//   74  153:icmpne          287
_L1:
		peekedString = new String(buffer, pos, peekedNumberLength);
	//   75  156:aload_0         
	//   76  157:new             #85  <Class String>
	//   77  160:dup             
	//   78  161:aload_0         
	//   79  162:getfield        #107 <Field char[] buffer>
	//   80  165:aload_0         
	//   81  166:getfield        #109 <Field int pos>
	//   82  169:aload_0         
	//   83  170:getfield        #291 <Field int peekedNumberLength>
	//   84  173:invokespecial   #264 <Method void String(char[], int, int)>
	//   85  176:putfield        #347 <Field String peekedString>
		pos = pos + peekedNumberLength;
	//   86  179:aload_0         
	//   87  180:aload_0         
	//   88  181:getfield        #109 <Field int pos>
	//   89  184:aload_0         
	//   90  185:getfield        #291 <Field int peekedNumberLength>
	//   91  188:iadd            
	//   92  189:putfield        #109 <Field int pos>
_L4:
		peeked = 11;
	//   93  192:aload_0         
	//   94  193:bipush          11
	//   95  195:putfield        #117 <Field int peeked>
		double d = Double.parseDouble(peekedString);
	//   96  198:aload_0         
	//   97  199:getfield        #347 <Field String peekedString>
	//   98  202:invokestatic    #353 <Method double Double.parseDouble(String)>
	//   99  205:dstore_2        
		i = (int)d;
	//  100  206:dload_2         
	//  101  207:d2i             
	//  102  208:istore          4
		char c;
		int l;
		int ai1[];
		if((double)i != d)
	//* 103  210:iload           4
	//* 104  212:i2d             
	//* 105  213:dload_2         
	//* 106  214:dcmpl           
	//* 107  215:ifeq            438
		{
			throw new NumberFormatException((new StringBuilder()).append("Expected an int but was ").append(peekedString).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	//  108  218:new             #297 <Class NumberFormatException>
	//  109  221:dup             
	//  110  222:new             #218 <Class StringBuilder>
	//  111  225:dup             
	//  112  226:invokespecial   #219 <Method void StringBuilder()>
	//  113  229:ldc2            #374 <String "Expected an int but was ">
	//  114  232:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  115  235:aload_0         
	//  116  236:getfield        #347 <Field String peekedString>
	//  117  239:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  118  242:ldc2            #307 <String " at line ">
	//  119  245:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  120  248:aload_0         
	//  121  249:invokespecial   #150 <Method int getLineNumber()>
	//  122  252:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//  123  255:ldc1            #230 <String " column ">
	//  124  257:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  125  260:aload_0         
	//  126  261:invokespecial   #154 <Method int getColumnNumber()>
	//  127  264:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//  128  267:ldc2            #309 <String " path ">
	//  129  270:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  130  273:aload_0         
	//  131  274:invokevirtual   #312 <Method String getPath()>
	//  132  277:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  133  280:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  134  283:invokespecial   #300 <Method void NumberFormatException(String)>
	//  135  286:athrow          
		} else
	//* 136  287:iload           4
	//* 137  289:bipush          8
	//* 138  291:icmpeq          301
	//* 139  294:iload           4
	//* 140  296:bipush          9
	//* 141  298:icmpne          369
	//* 142  301:iload           4
	//* 143  303:bipush          8
	//* 144  305:icmpne          363
	//* 145  308:bipush          39
	//* 146  310:istore_1        
	//* 147  311:aload_0         
	//* 148  312:aload_0         
	//* 149  313:iload_1         
	//* 150  314:invokespecial   #367 <Method String nextQuotedValue(char)>
	//* 151  317:putfield        #347 <Field String peekedString>
	//* 152  320:aload_0         
	//* 153  321:getfield        #347 <Field String peekedString>
	//* 154  324:invokestatic    #383 <Method int Integer.parseInt(String)>
	//* 155  327:istore          4
	//* 156  329:aload_0         
	//* 157  330:iconst_0        
	//* 158  331:putfield        #117 <Field int peeked>
	//* 159  334:aload_0         
	//* 160  335:getfield        #125 <Field int[] pathIndices>
	//* 161  338:astore          6
	//* 162  340:aload_0         
	//* 163  341:getfield        #121 <Field int stackSize>
	//* 164  344:iconst_1        
	//* 165  345:isub            
	//* 166  346:istore          5
	//* 167  348:aload           6
	//* 168  350:iload           5
	//* 169  352:aload           6
	//* 170  354:iload           5
	//* 171  356:iaload          
	//* 172  357:iconst_1        
	//* 173  358:iadd            
	//* 174  359:iastore         
	//* 175  360:iload           4
	//* 176  362:ireturn         
	//* 177  363:bipush          34
	//* 178  365:istore_1        
	//* 179  366:goto            311
	//* 180  369:new             #191 <Class IllegalStateException>
	//* 181  372:dup             
	//* 182  373:new             #218 <Class StringBuilder>
	//* 183  376:dup             
	//* 184  377:invokespecial   #219 <Method void StringBuilder()>
	//* 185  380:ldc2            #374 <String "Expected an int but was ">
	//* 186  383:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 187  386:aload_0         
	//* 188  387:invokevirtual   #322 <Method JsonToken peek()>
	//* 189  390:invokevirtual   #325 <Method StringBuilder StringBuilder.append(Object)>
	//* 190  393:ldc2            #307 <String " at line ">
	//* 191  396:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 192  399:aload_0         
	//* 193  400:invokespecial   #150 <Method int getLineNumber()>
	//* 194  403:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//* 195  406:ldc1            #230 <String " column ">
	//* 196  408:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 197  411:aload_0         
	//* 198  412:invokespecial   #154 <Method int getColumnNumber()>
	//* 199  415:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//* 200  418:ldc2            #309 <String " path ">
	//* 201  421:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 202  424:aload_0         
	//* 203  425:invokevirtual   #312 <Method String getPath()>
	//* 204  428:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 205  431:invokevirtual   #234 <Method String StringBuilder.toString()>
	//* 206  434:invokespecial   #194 <Method void IllegalStateException(String)>
	//* 207  437:athrow          
		{
			peekedString = null;
	//  208  438:aload_0         
	//  209  439:aconst_null     
	//  210  440:putfield        #347 <Field String peekedString>
			peeked = 0;
	//  211  443:aload_0         
	//  212  444:iconst_0        
	//  213  445:putfield        #117 <Field int peeked>
			int ai2[] = pathIndices;
	//  214  448:aload_0         
	//  215  449:getfield        #125 <Field int[] pathIndices>
	//  216  452:astore          6
			int i1 = stackSize - 1;
	//  217  454:aload_0         
	//  218  455:getfield        #121 <Field int stackSize>
	//  219  458:iconst_1        
	//  220  459:isub            
	//  221  460:istore          5
			ai2[i1] = ai2[i1] + 1;
	//  222  462:aload           6
	//  223  464:iload           5
	//  224  466:aload           6
	//  225  468:iload           5
	//  226  470:iaload          
	//  227  471:iconst_1        
	//  228  472:iadd            
	//  229  473:iastore         
			return i;
	//  230  474:iload           4
	//  231  476:ireturn         
		}
_L2:
		if(i != 8 && i != 9)
			break MISSING_BLOCK_LABEL_369;
		if(i == 8)
			c = '\'';
		else
			c = '"';
		peekedString = nextQuotedValue(c);
		i = Integer.parseInt(peekedString);
		peeked = 0;
		ai1 = pathIndices;
		l = stackSize - 1;
		ai1[l] = ai1[l] + 1;
		return i;
		throw new IllegalStateException((new StringBuilder()).append("Expected an int but was ").append(((Object) (peek()))).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
		NumberFormatException numberformatexception;
		numberformatexception;
	//  232  477:astore          6
		if(true) goto _L4; else goto _L3
	//  233  479:goto            192
_L3:
	}

	public long nextLong()
		throws IOException
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
	//    8   16:invokespecial   #145 <Method int doPeek()>
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
	//   33   60:getfield        #287 <Field long peekedLong>
	//   34   63:lreturn         
		}
		if(i != 16) goto _L2; else goto _L1
	//   35   64:iload           4
	//   36   66:bipush          16
	//   37   68:icmpne          202
_L1:
		peekedString = new String(buffer, pos, peekedNumberLength);
	//   38   71:aload_0         
	//   39   72:new             #85  <Class String>
	//   40   75:dup             
	//   41   76:aload_0         
	//   42   77:getfield        #107 <Field char[] buffer>
	//   43   80:aload_0         
	//   44   81:getfield        #109 <Field int pos>
	//   45   84:aload_0         
	//   46   85:getfield        #291 <Field int peekedNumberLength>
	//   47   88:invokespecial   #264 <Method void String(char[], int, int)>
	//   48   91:putfield        #347 <Field String peekedString>
		pos = pos + peekedNumberLength;
	//   49   94:aload_0         
	//   50   95:aload_0         
	//   51   96:getfield        #109 <Field int pos>
	//   52   99:aload_0         
	//   53  100:getfield        #291 <Field int peekedNumberLength>
	//   54  103:iadd            
	//   55  104:putfield        #109 <Field int pos>
_L3:
		peeked = 11;
	//   56  107:aload_0         
	//   57  108:bipush          11
	//   58  110:putfield        #117 <Field int peeked>
		double d = Double.parseDouble(peekedString);
	//   59  113:aload_0         
	//   60  114:getfield        #347 <Field String peekedString>
	//   61  117:invokestatic    #353 <Method double Double.parseDouble(String)>
	//   62  120:dstore_2        
		long l = (long)d;
	//   63  121:dload_2         
	//   64  122:d2l             
	//   65  123:lstore          6
		char c;
		int ai1[];
		NumberFormatException numberformatexception;
		if((double)l != d)
	//*  66  125:lload           6
	//*  67  127:l2d             
	//*  68  128:dload_2         
	//*  69  129:dcmpl           
	//*  70  130:ifeq            358
		{
			throw new NumberFormatException((new StringBuilder()).append("Expected a long but was ").append(peekedString).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	//   71  133:new             #297 <Class NumberFormatException>
	//   72  136:dup             
	//   73  137:new             #218 <Class StringBuilder>
	//   74  140:dup             
	//   75  141:invokespecial   #219 <Method void StringBuilder()>
	//   76  144:ldc2            #387 <String "Expected a long but was ">
	//   77  147:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   78  150:aload_0         
	//   79  151:getfield        #347 <Field String peekedString>
	//   80  154:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   81  157:ldc2            #307 <String " at line ">
	//   82  160:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   83  163:aload_0         
	//   84  164:invokespecial   #150 <Method int getLineNumber()>
	//   85  167:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   86  170:ldc1            #230 <String " column ">
	//   87  172:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   88  175:aload_0         
	//   89  176:invokespecial   #154 <Method int getColumnNumber()>
	//   90  179:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   91  182:ldc2            #309 <String " path ">
	//   92  185:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   93  188:aload_0         
	//   94  189:invokevirtual   #312 <Method String getPath()>
	//   95  192:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   96  195:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   97  198:invokespecial   #300 <Method void NumberFormatException(String)>
	//   98  201:athrow          
		} else
	//*  99  202:iload           4
	//* 100  204:bipush          8
	//* 101  206:icmpeq          216
	//* 102  209:iload           4
	//* 103  211:bipush          9
	//* 104  213:icmpne          289
	//* 105  216:iload           4
	//* 106  218:bipush          8
	//* 107  220:icmpne          283
	//* 108  223:bipush          39
	//* 109  225:istore_1        
	//* 110  226:aload_0         
	//* 111  227:aload_0         
	//* 112  228:iload_1         
	//* 113  229:invokespecial   #367 <Method String nextQuotedValue(char)>
	//* 114  232:putfield        #347 <Field String peekedString>
	//* 115  235:aload_0         
	//* 116  236:getfield        #347 <Field String peekedString>
	//* 117  239:invokestatic    #393 <Method long Long.parseLong(String)>
	//* 118  242:lstore          6
	//* 119  244:aload_0         
	//* 120  245:iconst_0        
	//* 121  246:putfield        #117 <Field int peeked>
	//* 122  249:aload_0         
	//* 123  250:getfield        #125 <Field int[] pathIndices>
	//* 124  253:astore          8
	//* 125  255:aload_0         
	//* 126  256:getfield        #121 <Field int stackSize>
	//* 127  259:iconst_1        
	//* 128  260:isub            
	//* 129  261:istore          4
	//* 130  263:aload           8
	//* 131  265:iload           4
	//* 132  267:aload           8
	//* 133  269:iload           4
	//* 134  271:iaload          
	//* 135  272:iconst_1        
	//* 136  273:iadd            
	//* 137  274:iastore         
	//* 138  275:lload           6
	//* 139  277:lreturn         
	//* 140  278:astore          8
	//* 141  280:goto            107
	//* 142  283:bipush          34
	//* 143  285:istore_1        
	//* 144  286:goto            226
	//* 145  289:new             #191 <Class IllegalStateException>
	//* 146  292:dup             
	//* 147  293:new             #218 <Class StringBuilder>
	//* 148  296:dup             
	//* 149  297:invokespecial   #219 <Method void StringBuilder()>
	//* 150  300:ldc2            #387 <String "Expected a long but was ">
	//* 151  303:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 152  306:aload_0         
	//* 153  307:invokevirtual   #322 <Method JsonToken peek()>
	//* 154  310:invokevirtual   #325 <Method StringBuilder StringBuilder.append(Object)>
	//* 155  313:ldc2            #307 <String " at line ">
	//* 156  316:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 157  319:aload_0         
	//* 158  320:invokespecial   #150 <Method int getLineNumber()>
	//* 159  323:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//* 160  326:ldc1            #230 <String " column ">
	//* 161  328:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 162  331:aload_0         
	//* 163  332:invokespecial   #154 <Method int getColumnNumber()>
	//* 164  335:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//* 165  338:ldc2            #309 <String " path ">
	//* 166  341:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 167  344:aload_0         
	//* 168  345:invokevirtual   #312 <Method String getPath()>
	//* 169  348:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//* 170  351:invokevirtual   #234 <Method String StringBuilder.toString()>
	//* 171  354:invokespecial   #194 <Method void IllegalStateException(String)>
	//* 172  357:athrow          
		{
			peekedString = null;
	//  173  358:aload_0         
	//  174  359:aconst_null     
	//  175  360:putfield        #347 <Field String peekedString>
			peeked = 0;
	//  176  363:aload_0         
	//  177  364:iconst_0        
	//  178  365:putfield        #117 <Field int peeked>
			int ai2[] = pathIndices;
	//  179  368:aload_0         
	//  180  369:getfield        #125 <Field int[] pathIndices>
	//  181  372:astore          8
			int j = stackSize - 1;
	//  182  374:aload_0         
	//  183  375:getfield        #121 <Field int stackSize>
	//  184  378:iconst_1        
	//  185  379:isub            
	//  186  380:istore          4
			ai2[j] = ai2[j] + 1;
	//  187  382:aload           8
	//  188  384:iload           4
	//  189  386:aload           8
	//  190  388:iload           4
	//  191  390:iaload          
	//  192  391:iconst_1        
	//  193  392:iadd            
	//  194  393:iastore         
			return l;
	//  195  394:lload           6
	//  196  396:lreturn         
		}
_L2:
		if(i != 8 && i != 9)
			break MISSING_BLOCK_LABEL_289;
		if(i == 8)
			c = '\'';
		else
			c = '"';
		peekedString = nextQuotedValue(c);
		l = Long.parseLong(peekedString);
		peeked = 0;
		ai1 = pathIndices;
		i = stackSize - 1;
		ai1[i] = ai1[i] + 1;
		return l;
		numberformatexception;
		  goto _L3
		throw new IllegalStateException((new StringBuilder()).append("Expected a long but was ").append(((Object) (peek()))).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	}

	public String nextName()
		throws IOException
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
	//    8   12:invokespecial   #145 <Method int doPeek()>
	//    9   15:istore_1        
		String s;
		if(i == 14)
	//*  10   16:iload_1         
	//*  11   17:bipush          14
	//*  12   19:icmpne          46
			s = nextUnquotedValue();
	//   13   22:aload_0         
	//   14   23:invokespecial   #369 <Method String nextUnquotedValue()>
	//   15   26:astore_3        
		else
	//*  16   27:aload_0         
	//*  17   28:iconst_0        
	//*  18   29:putfield        #117 <Field int peeked>
	//*  19   32:aload_0         
	//*  20   33:getfield        #123 <Field String[] pathNames>
	//*  21   36:aload_0         
	//*  22   37:getfield        #121 <Field int stackSize>
	//*  23   40:iconst_1        
	//*  24   41:isub            
	//*  25   42:aload_3         
	//*  26   43:aastore         
	//*  27   44:aload_3         
	//*  28   45:areturn         
		if(i == 12)
	//*  29   46:iload_1         
	//*  30   47:bipush          12
	//*  31   49:icmpne          62
			s = nextQuotedValue('\'');
	//   32   52:aload_0         
	//   33   53:bipush          39
	//   34   55:invokespecial   #367 <Method String nextQuotedValue(char)>
	//   35   58:astore_3        
		else
	//*  36   59:goto            27
		if(i == 13)
	//*  37   62:iload_1         
	//*  38   63:bipush          13
	//*  39   65:icmpne          78
			s = nextQuotedValue('"');
	//   40   68:aload_0         
	//   41   69:bipush          34
	//   42   71:invokespecial   #367 <Method String nextQuotedValue(char)>
	//   43   74:astore_3        
		else
	//*  44   75:goto            27
			throw new IllegalStateException((new StringBuilder()).append("Expected a name but was ").append(((Object) (peek()))).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	//   45   78:new             #191 <Class IllegalStateException>
	//   46   81:dup             
	//   47   82:new             #218 <Class StringBuilder>
	//   48   85:dup             
	//   49   86:invokespecial   #219 <Method void StringBuilder()>
	//   50   89:ldc2            #396 <String "Expected a name but was ">
	//   51   92:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   52   95:aload_0         
	//   53   96:invokevirtual   #322 <Method JsonToken peek()>
	//   54   99:invokevirtual   #325 <Method StringBuilder StringBuilder.append(Object)>
	//   55  102:ldc2            #307 <String " at line ">
	//   56  105:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   57  108:aload_0         
	//   58  109:invokespecial   #150 <Method int getLineNumber()>
	//   59  112:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   60  115:ldc1            #230 <String " column ">
	//   61  117:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   62  120:aload_0         
	//   63  121:invokespecial   #154 <Method int getColumnNumber()>
	//   64  124:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   65  127:ldc2            #309 <String " path ">
	//   66  130:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   67  133:aload_0         
	//   68  134:invokevirtual   #312 <Method String getPath()>
	//   69  137:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   70  140:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   71  143:invokespecial   #194 <Method void IllegalStateException(String)>
	//   72  146:athrow          
		peeked = 0;
		pathNames[stackSize - 1] = s;
		return s;
	}

	public void nextNull()
		throws IOException
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
	//    8   12:invokespecial   #145 <Method int doPeek()>
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
			throw new IllegalStateException((new StringBuilder()).append("Expected null but was ").append(((Object) (peek()))).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	//   33   48:new             #191 <Class IllegalStateException>
	//   34   51:dup             
	//   35   52:new             #218 <Class StringBuilder>
	//   36   55:dup             
	//   37   56:invokespecial   #219 <Method void StringBuilder()>
	//   38   59:ldc2            #399 <String "Expected null but was ">
	//   39   62:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   40   65:aload_0         
	//   41   66:invokevirtual   #322 <Method JsonToken peek()>
	//   42   69:invokevirtual   #325 <Method StringBuilder StringBuilder.append(Object)>
	//   43   72:ldc2            #307 <String " at line ">
	//   44   75:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   45   78:aload_0         
	//   46   79:invokespecial   #150 <Method int getLineNumber()>
	//   47   82:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   48   85:ldc1            #230 <String " column ">
	//   49   87:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   50   90:aload_0         
	//   51   91:invokespecial   #154 <Method int getColumnNumber()>
	//   52   94:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   53   97:ldc2            #309 <String " path ">
	//   54  100:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   55  103:aload_0         
	//   56  104:invokevirtual   #312 <Method String getPath()>
	//   57  107:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   58  110:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   59  113:invokespecial   #194 <Method void IllegalStateException(String)>
	//   60  116:athrow          
		}
	}

	public String nextString()
		throws IOException
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
	//    8   12:invokespecial   #145 <Method int doPeek()>
	//    9   15:istore_1        
		String s;
		int ai[];
		if(i == 10)
	//*  10   16:iload_1         
	//*  11   17:bipush          10
	//*  12   19:icmpne          57
			s = nextUnquotedValue();
	//   13   22:aload_0         
	//   14   23:invokespecial   #369 <Method String nextUnquotedValue()>
	//   15   26:astore_3        
		else
	//*  16   27:aload_0         
	//*  17   28:iconst_0        
	//*  18   29:putfield        #117 <Field int peeked>
	//*  19   32:aload_0         
	//*  20   33:getfield        #125 <Field int[] pathIndices>
	//*  21   36:astore          4
	//*  22   38:aload_0         
	//*  23   39:getfield        #121 <Field int stackSize>
	//*  24   42:iconst_1        
	//*  25   43:isub            
	//*  26   44:istore_1        
	//*  27   45:aload           4
	//*  28   47:iload_1         
	//*  29   48:aload           4
	//*  30   50:iload_1         
	//*  31   51:iaload          
	//*  32   52:iconst_1        
	//*  33   53:iadd            
	//*  34   54:iastore         
	//*  35   55:aload_3         
	//*  36   56:areturn         
		if(i == 8)
	//*  37   57:iload_1         
	//*  38   58:bipush          8
	//*  39   60:icmpne          73
			s = nextQuotedValue('\'');
	//   40   63:aload_0         
	//   41   64:bipush          39
	//   42   66:invokespecial   #367 <Method String nextQuotedValue(char)>
	//   43   69:astore_3        
		else
	//*  44   70:goto            27
		if(i == 9)
	//*  45   73:iload_1         
	//*  46   74:bipush          9
	//*  47   76:icmpne          89
			s = nextQuotedValue('"');
	//   48   79:aload_0         
	//   49   80:bipush          34
	//   50   82:invokespecial   #367 <Method String nextQuotedValue(char)>
	//   51   85:astore_3        
		else
	//*  52   86:goto            27
		if(i == 11)
	//*  53   89:iload_1         
	//*  54   90:bipush          11
	//*  55   92:icmpne          108
		{
			s = peekedString;
	//   56   95:aload_0         
	//   57   96:getfield        #347 <Field String peekedString>
	//   58   99:astore_3        
			peekedString = null;
	//   59  100:aload_0         
	//   60  101:aconst_null     
	//   61  102:putfield        #347 <Field String peekedString>
		} else
	//*  62  105:goto            27
		if(i == 15)
	//*  63  108:iload_1         
	//*  64  109:bipush          15
	//*  65  111:icmpne          125
			s = Long.toString(peekedLong);
	//   66  114:aload_0         
	//   67  115:getfield        #287 <Field long peekedLong>
	//   68  118:invokestatic    #403 <Method String Long.toString(long)>
	//   69  121:astore_3        
		else
	//*  70  122:goto            27
		if(i == 16)
	//*  71  125:iload_1         
	//*  72  126:bipush          16
	//*  73  128:icmpne          167
		{
			s = new String(buffer, pos, peekedNumberLength);
	//   74  131:new             #85  <Class String>
	//   75  134:dup             
	//   76  135:aload_0         
	//   77  136:getfield        #107 <Field char[] buffer>
	//   78  139:aload_0         
	//   79  140:getfield        #109 <Field int pos>
	//   80  143:aload_0         
	//   81  144:getfield        #291 <Field int peekedNumberLength>
	//   82  147:invokespecial   #264 <Method void String(char[], int, int)>
	//   83  150:astore_3        
			pos = pos + peekedNumberLength;
	//   84  151:aload_0         
	//   85  152:aload_0         
	//   86  153:getfield        #109 <Field int pos>
	//   87  156:aload_0         
	//   88  157:getfield        #291 <Field int peekedNumberLength>
	//   89  160:iadd            
	//   90  161:putfield        #109 <Field int pos>
		} else
	//*  91  164:goto            27
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected a string but was ").append(((Object) (peek()))).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).append(" path ").append(getPath()).toString());
	//   92  167:new             #191 <Class IllegalStateException>
	//   93  170:dup             
	//   94  171:new             #218 <Class StringBuilder>
	//   95  174:dup             
	//   96  175:invokespecial   #219 <Method void StringBuilder()>
	//   97  178:ldc2            #405 <String "Expected a string but was ">
	//   98  181:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   99  184:aload_0         
	//  100  185:invokevirtual   #322 <Method JsonToken peek()>
	//  101  188:invokevirtual   #325 <Method StringBuilder StringBuilder.append(Object)>
	//  102  191:ldc2            #307 <String " at line ">
	//  103  194:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  104  197:aload_0         
	//  105  198:invokespecial   #150 <Method int getLineNumber()>
	//  106  201:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//  107  204:ldc1            #230 <String " column ">
	//  108  206:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  109  209:aload_0         
	//  110  210:invokespecial   #154 <Method int getColumnNumber()>
	//  111  213:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//  112  216:ldc2            #309 <String " path ">
	//  113  219:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  114  222:aload_0         
	//  115  223:invokevirtual   #312 <Method String getPath()>
	//  116  226:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//  117  229:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  118  232:invokespecial   #194 <Method void IllegalStateException(String)>
	//  119  235:athrow          
		}
		peeked = 0;
		ai = pathIndices;
		i = stackSize - 1;
		ai[i] = ai[i] + 1;
		return s;
	}

	public JsonToken peek()
		throws IOException
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
	//    8   12:invokespecial   #145 <Method int doPeek()>
	//    9   15:istore_1        
		switch(i)
	//*  10   16:iload_1         
		{
	//*  11   17:tableswitch     1 17: default 100
	//	               1 108
	//	               2 112
	//	               3 116
	//	               4 120
	//	               5 128
	//	               6 128
	//	               7 132
	//	               8 136
	//	               9 136
	//	               10 136
	//	               11 136
	//	               12 124
	//	               13 124
	//	               14 124
	//	               15 140
	//	               16 140
	//	               17 144
		default:
			throw new AssertionError();
	//   12  100:new             #407 <Class AssertionError>
	//   13  103:dup             
	//   14  104:invokespecial   #408 <Method void AssertionError()>
	//   15  107:athrow          

		case 1: // '\001'
			return JsonToken.BEGIN_OBJECT;
	//   16  108:getstatic       #414 <Field JsonToken JsonToken.BEGIN_OBJECT>
	//   17  111:areturn         

		case 2: // '\002'
			return JsonToken.END_OBJECT;
	//   18  112:getstatic       #417 <Field JsonToken JsonToken.END_OBJECT>
	//   19  115:areturn         

		case 3: // '\003'
			return JsonToken.BEGIN_ARRAY;
	//   20  116:getstatic       #420 <Field JsonToken JsonToken.BEGIN_ARRAY>
	//   21  119:areturn         

		case 4: // '\004'
			return JsonToken.END_ARRAY;
	//   22  120:getstatic       #423 <Field JsonToken JsonToken.END_ARRAY>
	//   23  123:areturn         

		case 12: // '\f'
		case 13: // '\r'
		case 14: // '\016'
			return JsonToken.NAME;
	//   24  124:getstatic       #426 <Field JsonToken JsonToken.NAME>
	//   25  127:areturn         

		case 5: // '\005'
		case 6: // '\006'
			return JsonToken.BOOLEAN;
	//   26  128:getstatic       #429 <Field JsonToken JsonToken.BOOLEAN>
	//   27  131:areturn         

		case 7: // '\007'
			return JsonToken.NULL;
	//   28  132:getstatic       #431 <Field JsonToken JsonToken.NULL>
	//   29  135:areturn         

		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
		case 11: // '\013'
			return JsonToken.STRING;
	//   30  136:getstatic       #434 <Field JsonToken JsonToken.STRING>
	//   31  139:areturn         

		case 15: // '\017'
		case 16: // '\020'
			return JsonToken.NUMBER;
	//   32  140:getstatic       #437 <Field JsonToken JsonToken.NUMBER>
	//   33  143:areturn         

		case 17: // '\021'
			return JsonToken.END_DOCUMENT;
	//   34  144:getstatic       #440 <Field JsonToken JsonToken.END_DOCUMENT>
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
		throws IOException
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
_L2:
		int i;
		int k;
		i = peeked;
	//    2    2:aload_0         
	//    3    3:getfield        #117 <Field int peeked>
	//    4    6:istore_1        
		k = i;
	//    5    7:iload_1         
	//    6    8:istore_3        
		if(i == 0)
	//*   7    9:iload_1         
	//*   8   10:ifne            18
			k = doPeek();
	//    9   13:aload_0         
	//   10   14:invokespecial   #145 <Method int doPeek()>
	//   11   17:istore_3        
		if(k != 3)
			break; /* Loop/switch isn't completed */
	//   12   18:iload_3         
	//   13   19:iconst_3        
	//   14   20:icmpne          81
		push(1);
	//   15   23:aload_0         
	//   16   24:iconst_1        
	//   17   25:invokespecial   #316 <Method void push(int)>
		i = j + 1;
	//   18   28:iload_2         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_1        
_L3:
		peeked = 0;
	//   22   32:aload_0         
	//   23   33:iconst_0        
	//   24   34:putfield        #117 <Field int peeked>
		j = i;
	//   25   37:iload_1         
	//   26   38:istore_2        
		if(i == 0)
	//*  27   39:iload_1         
	//*  28   40:ifne            2
		{
			int ai[] = pathIndices;
	//   29   43:aload_0         
	//   30   44:getfield        #125 <Field int[] pathIndices>
	//   31   47:astore          4
			i = stackSize - 1;
	//   32   49:aload_0         
	//   33   50:getfield        #121 <Field int stackSize>
	//   34   53:iconst_1        
	//   35   54:isub            
	//   36   55:istore_1        
			ai[i] = ai[i] + 1;
	//   37   56:aload           4
	//   38   58:iload_1         
	//   39   59:aload           4
	//   40   61:iload_1         
	//   41   62:iaload          
	//   42   63:iconst_1        
	//   43   64:iadd            
	//   44   65:iastore         
			pathNames[stackSize - 1] = "null";
	//   45   66:aload_0         
	//   46   67:getfield        #123 <Field String[] pathNames>
	//   47   70:aload_0         
	//   48   71:getfield        #121 <Field int stackSize>
	//   49   74:iconst_1        
	//   50   75:isub            
	//   51   76:ldc2            #277 <String "null">
	//   52   79:aastore         
			return;
	//   53   80:return          
		}
		if(true) goto _L2; else goto _L1
_L1:
		if(k == 1)
	//*  54   81:iload_3         
	//*  55   82:iconst_1        
	//*  56   83:icmpne          98
		{
			push(3);
	//   57   86:aload_0         
	//   58   87:iconst_3        
	//   59   88:invokespecial   #316 <Method void push(int)>
			i = j + 1;
	//   60   91:iload_2         
	//   61   92:iconst_1        
	//   62   93:iadd            
	//   63   94:istore_1        
		} else
	//*  64   95:goto            32
		if(k == 4)
	//*  65   98:iload_3         
	//*  66   99:iconst_4        
	//*  67  100:icmpne          120
		{
			stackSize = stackSize - 1;
	//   68  103:aload_0         
	//   69  104:aload_0         
	//   70  105:getfield        #121 <Field int stackSize>
	//   71  108:iconst_1        
	//   72  109:isub            
	//   73  110:putfield        #121 <Field int stackSize>
			i = j - 1;
	//   74  113:iload_2         
	//   75  114:iconst_1        
	//   76  115:isub            
	//   77  116:istore_1        
		} else
	//*  78  117:goto            32
		if(k == 2)
	//*  79  120:iload_3         
	//*  80  121:iconst_2        
	//*  81  122:icmpne          142
		{
			stackSize = stackSize - 1;
	//   82  125:aload_0         
	//   83  126:aload_0         
	//   84  127:getfield        #121 <Field int stackSize>
	//   85  130:iconst_1        
	//   86  131:isub            
	//   87  132:putfield        #121 <Field int stackSize>
			i = j - 1;
	//   88  135:iload_2         
	//   89  136:iconst_1        
	//   90  137:isub            
	//   91  138:istore_1        
		} else
	//*  92  139:goto            32
		if(k == 14 || k == 10)
	//*  93  142:iload_3         
	//*  94  143:bipush          14
	//*  95  145:icmpeq          154
	//*  96  148:iload_3         
	//*  97  149:bipush          10
	//*  98  151:icmpne          163
		{
			skipUnquotedValue();
	//   99  154:aload_0         
	//  100  155:invokespecial   #445 <Method void skipUnquotedValue()>
			i = j;
	//  101  158:iload_2         
	//  102  159:istore_1        
		} else
	//* 103  160:goto            32
		if(k == 8 || k == 12)
	//* 104  163:iload_3         
	//* 105  164:bipush          8
	//* 106  166:icmpeq          175
	//* 107  169:iload_3         
	//* 108  170:bipush          12
	//* 109  172:icmpne          186
		{
			skipQuotedValue('\'');
	//  110  175:aload_0         
	//  111  176:bipush          39
	//  112  178:invokespecial   #447 <Method void skipQuotedValue(char)>
			i = j;
	//  113  181:iload_2         
	//  114  182:istore_1        
		} else
	//* 115  183:goto            32
		if(k == 9 || k == 13)
	//* 116  186:iload_3         
	//* 117  187:bipush          9
	//* 118  189:icmpeq          198
	//* 119  192:iload_3         
	//* 120  193:bipush          13
	//* 121  195:icmpne          209
		{
			skipQuotedValue('"');
	//  122  198:aload_0         
	//  123  199:bipush          34
	//  124  201:invokespecial   #447 <Method void skipQuotedValue(char)>
			i = j;
	//  125  204:iload_2         
	//  126  205:istore_1        
		} else
	//* 127  206:goto            32
		{
			i = j;
	//  128  209:iload_2         
	//  129  210:istore_1        
			if(k == 16)
	//* 130  211:iload_3         
	//* 131  212:bipush          16
	//* 132  214:icmpne          32
			{
				pos = pos + peekedNumberLength;
	//  133  217:aload_0         
	//  134  218:aload_0         
	//  135  219:getfield        #109 <Field int pos>
	//  136  222:aload_0         
	//  137  223:getfield        #291 <Field int peekedNumberLength>
	//  138  226:iadd            
	//  139  227:putfield        #109 <Field int pos>
				i = j;
	//  140  230:iload_2         
	//  141  231:istore_1        
			}
		}
		  goto _L3
		if(true) goto _L2; else goto _L4
_L4:
	//* 142  232:goto            32
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getSimpleName()).append(" at line ").append(getLineNumber()).append(" column ").append(getColumnNumber()).toString();
	//    0    0:new             #218 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #219 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #451 <Method Class Object.getClass()>
	//    5   11:invokevirtual   #456 <Method String Class.getSimpleName()>
	//    6   14:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc2            #307 <String " at line ">
	//    8   20:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:aload_0         
	//   10   24:invokespecial   #150 <Method int getLineNumber()>
	//   11   27:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   12   30:ldc1            #230 <String " column ">
	//   13   32:invokevirtual   #225 <Method StringBuilder StringBuilder.append(String)>
	//   14   35:aload_0         
	//   15   36:invokespecial   #154 <Method int getColumnNumber()>
	//   16   39:invokevirtual   #228 <Method StringBuilder StringBuilder.append(int)>
	//   17   42:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   18   45:areturn         
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
				throws IOException
			{
				if(jsonreader instanceof JsonTreeReader)
			//*   0    0:aload_1         
			//*   1    1:instanceof      #17  <Class JsonTreeReader>
			//*   2    4:ifeq            15
				{
					((JsonTreeReader)jsonreader).promoteNameToValue();
			//    3    7:aload_1         
			//    4    8:checkcast       #17  <Class JsonTreeReader>
			//    5   11:invokevirtual   #19  <Method void JsonTreeReader.promoteNameToValue()>
					return;
			//    6   14:return          
				}
				int j = jsonreader.peeked;
			//    7   15:aload_1         
			//    8   16:invokestatic    #23  <Method int JsonReader.access$000(JsonReader)>
			//    9   19:istore_3        
				int i = j;
			//   10   20:iload_3         
			//   11   21:istore_2        
				if(j == 0)
			//*  12   22:iload_3         
			//*  13   23:ifne            31
					i = jsonreader.doPeek();
			//   14   26:aload_1         
			//   15   27:invokestatic    #26  <Method int JsonReader.access$100(JsonReader)>
			//   16   30:istore_2        
				if(i == 13)
			//*  17   31:iload_2         
			//*  18   32:bipush          13
			//*  19   34:icmpne          45
				{
					jsonreader.peeked = 9;
			//   20   37:aload_1         
			//   21   38:bipush          9
			//   22   40:invokestatic    #30  <Method int JsonReader.access$002(JsonReader, int)>
			//   23   43:pop             
					return;
			//   24   44:return          
				}
				if(i == 12)
			//*  25   45:iload_2         
			//*  26   46:bipush          12
			//*  27   48:icmpne          59
				{
					jsonreader.peeked = 8;
			//   28   51:aload_1         
			//   29   52:bipush          8
			//   30   54:invokestatic    #30  <Method int JsonReader.access$002(JsonReader, int)>
			//   31   57:pop             
					return;
			//   32   58:return          
				}
				if(i == 14)
			//*  33   59:iload_2         
			//*  34   60:bipush          14
			//*  35   62:icmpne          73
				{
					jsonreader.peeked = 10;
			//   36   65:aload_1         
			//   37   66:bipush          10
			//   38   68:invokestatic    #30  <Method int JsonReader.access$002(JsonReader, int)>
			//   39   71:pop             
					return;
			//   40   72:return          
				} else
				{
					throw new IllegalStateException((new StringBuilder()).append("Expected a name but was ").append(((Object) (jsonreader.peek()))).append(" ").append(" at line ").append(jsonreader.getLineNumber()).append(" column ").append(jsonreader.getColumnNumber()).append(" path ").append(jsonreader.getPath()).toString());
			//   41   73:new             #32  <Class IllegalStateException>
			//   42   76:dup             
			//   43   77:new             #34  <Class StringBuilder>
			//   44   80:dup             
			//   45   81:invokespecial   #35  <Method void StringBuilder()>
			//   46   84:ldc1            #37  <String "Expected a name but was ">
			//   47   86:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
			//   48   89:aload_1         
			//   49   90:invokevirtual   #45  <Method JsonToken JsonReader.peek()>
			//   50   93:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
			//   51   96:ldc1            #50  <String " ">
			//   52   98:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
			//   53  101:ldc1            #52  <String " at line ">
			//   54  103:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
			//   55  106:aload_1         
			//   56  107:invokestatic    #55  <Method int JsonReader.access$200(JsonReader)>
			//   57  110:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
			//   58  113:ldc1            #60  <String " column ">
			//   59  115:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
			//   60  118:aload_1         
			//   61  119:invokestatic    #63  <Method int JsonReader.access$300(JsonReader)>
			//   62  122:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
			//   63  125:ldc1            #65  <String " path ">
			//   64  127:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
			//   65  130:aload_1         
			//   66  131:invokevirtual   #69  <Method String JsonReader.getPath()>
			//   67  134:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
			//   68  137:invokevirtual   #72  <Method String StringBuilder.toString()>
			//   69  140:invokespecial   #75  <Method void IllegalStateException(String)>
			//   70  143:athrow          
				}
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
		throws IOException
	{
		return jsonreader.doPeek();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method int doPeek()>
	//    2    4:ireturn         
	}

*/


/*
	static int access$200(JsonReader jsonreader)
	{
		return jsonreader.getLineNumber();
	//    0    0:aload_0         
	//    1    1:invokespecial   #150 <Method int getLineNumber()>
	//    2    4:ireturn         
	}

*/


/*
	static int access$300(JsonReader jsonreader)
	{
		return jsonreader.getColumnNumber();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method int getColumnNumber()>
	//    2    4:ireturn         
	}

*/
}
