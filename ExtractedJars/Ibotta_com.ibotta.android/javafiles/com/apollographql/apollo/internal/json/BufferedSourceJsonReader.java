// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.json;

import com.apollographql.apollo.json.JsonDataException;
import com.apollographql.apollo.json.JsonEncodingException;
import java.io.EOFException;
import java.io.IOException;
import okio.*;

// Referenced classes of package com.apollographql.apollo.internal.json:
//			JsonReader, JsonScope

public final class BufferedSourceJsonReader extends JsonReader
{

	public BufferedSourceJsonReader(BufferedSource bufferedsource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void JsonReader()>
		lenient = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #60  <Field boolean lenient>
		failOnUnknown = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #62  <Field boolean failOnUnknown>
		peeked = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #64  <Field int peeked>
	//   11   19:aload_0         
	//   12   20:bipush          32
	//   13   22:newarray        int[]
	//   14   24:putfield        #66  <Field int[] stack>
		stackSize = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #68  <Field int stackSize>
		int ai[] = stack;
	//   18   32:aload_0         
	//   19   33:getfield        #66  <Field int[] stack>
	//   20   36:astore_3        
		int i = stackSize;
	//   21   37:aload_0         
	//   22   38:getfield        #68  <Field int stackSize>
	//   23   41:istore_2        
		stackSize = i + 1;
	//   24   42:aload_0         
	//   25   43:iload_2         
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:putfield        #68  <Field int stackSize>
		ai[i] = 6;
	//   29   49:aload_3         
	//   30   50:iload_2         
	//   31   51:bipush          6
	//   32   53:iastore         
	//   33   54:aload_0         
	//   34   55:bipush          32
	//   35   57:anewarray       String[]
	//   36   60:putfield        #72  <Field String[] pathNames>
	//   37   63:aload_0         
	//   38   64:bipush          32
	//   39   66:newarray        int[]
	//   40   68:putfield        #74  <Field int[] pathIndices>
		if(bufferedsource != null)
	//*  41   71:aload_1         
	//*  42   72:ifnull          91
		{
			source = bufferedsource;
	//   43   75:aload_0         
	//   44   76:aload_1         
	//   45   77:putfield        #76  <Field BufferedSource source>
			buffer = bufferedsource.buffer();
	//   46   80:aload_0         
	//   47   81:aload_1         
	//   48   82:invokeinterface #81  <Method Buffer BufferedSource.buffer()>
	//   49   87:putfield        #83  <Field Buffer buffer>
			return;
	//   50   90:return          
		} else
		{
			throw new NullPointerException("source == null");
	//   51   91:new             #85  <Class NullPointerException>
	//   52   94:dup             
	//   53   95:ldc1            #87  <String "source == null">
	//   54   97:invokespecial   #90  <Method void NullPointerException(String)>
	//   55  100:athrow          
		}
	}

	private void checkLenient()
		throws IOException
	{
		if(lenient)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field boolean lenient>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
	//    4    8:aload_0         
	//    5    9:ldc1            #95  <String "Use JsonReader.setLenient(true) to accept malformed JSON">
	//    6   11:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//    7   14:athrow          
	}

	private int doPeek()
		throws IOException
	{
		int i;
label0:
		{
label1:
			{
				int ai[] = stack;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int[] stack>
	//    2    4:astore_3        
				int j = stackSize;
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field int stackSize>
	//    5    9:istore_2        
				i = ai[j - 1];
	//    6   10:aload_3         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:isub            
	//   10   14:iaload          
	//   11   15:istore_1        
				if(i == 1)
	//*  12   16:iload_1         
	//*  13   17:iconst_1        
	//*  14   18:icmpne          30
					ai[j - 1] = 2;
	//   15   21:aload_3         
	//   16   22:iload_2         
	//   17   23:iconst_1        
	//   18   24:isub            
	//   19   25:iconst_2        
	//   20   26:iastore         
				else
	//*  21   27:goto            239
				if(i == 2)
	//*  22   30:iload_1         
	//*  23   31:iconst_2        
	//*  24   32:icmpne          88
				{
					j = nextNonWhitespace(true);
	//   25   35:aload_0         
	//   26   36:iconst_1        
	//   27   37:invokespecial   #106 <Method int nextNonWhitespace(boolean)>
	//   28   40:istore_2        
					buffer.readByte();
	//   29   41:aload_0         
	//   30   42:getfield        #83  <Field Buffer buffer>
	//   31   45:invokevirtual   #112 <Method byte Buffer.readByte()>
	//   32   48:pop             
					if(j != 44)
	//*  33   49:iload_2         
	//*  34   50:bipush          44
	//*  35   52:icmpeq          239
					{
						if(j != 59)
	//*  36   55:iload_2         
	//*  37   56:bipush          59
	//*  38   58:icmpeq          81
							if(j == 93)
	//*  39   61:iload_2         
	//*  40   62:bipush          93
	//*  41   64:icmpne          74
							{
								peeked = 4;
	//   42   67:aload_0         
	//   43   68:iconst_4        
	//   44   69:putfield        #64  <Field int peeked>
								return 4;
	//   45   72:iconst_4        
	//   46   73:ireturn         
							} else
							{
								throw syntaxError("Unterminated array");
	//   47   74:aload_0         
	//   48   75:ldc1            #114 <String "Unterminated array">
	//   49   77:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//   50   80:athrow          
							}
						checkLenient();
	//   51   81:aload_0         
	//   52   82:invokespecial   #116 <Method void checkLenient()>
					}
				} else
	//*  53   85:goto            239
				{
					if(i == 3 || i == 5)
	//*  54   88:iload_1         
	//*  55   89:iconst_3        
	//*  56   90:icmpeq          475
	//*  57   93:iload_1         
	//*  58   94:iconst_5        
	//*  59   95:icmpne          101
						break label0;
	//   60   98:goto            475
					if(i == 4)
	//*  61  101:iload_1         
	//*  62  102:iconst_4        
	//*  63  103:icmpne          186
					{
						ai[j - 1] = 5;
	//   64  106:aload_3         
	//   65  107:iload_2         
	//   66  108:iconst_1        
	//   67  109:isub            
	//   68  110:iconst_5        
	//   69  111:iastore         
						j = nextNonWhitespace(true);
	//   70  112:aload_0         
	//   71  113:iconst_1        
	//   72  114:invokespecial   #106 <Method int nextNonWhitespace(boolean)>
	//   73  117:istore_2        
						buffer.readByte();
	//   74  118:aload_0         
	//   75  119:getfield        #83  <Field Buffer buffer>
	//   76  122:invokevirtual   #112 <Method byte Buffer.readByte()>
	//   77  125:pop             
						if(j != 58)
	//*  78  126:iload_2         
	//*  79  127:bipush          58
	//*  80  129:icmpeq          239
							if(j == 61)
	//*  81  132:iload_2         
	//*  82  133:bipush          61
	//*  83  135:icmpne          179
							{
								checkLenient();
	//   84  138:aload_0         
	//   85  139:invokespecial   #116 <Method void checkLenient()>
								if(source.request(1L) && buffer.getByte(0L) == 62)
	//*  86  142:aload_0         
	//*  87  143:getfield        #76  <Field BufferedSource source>
	//*  88  146:lconst_1        
	//*  89  147:invokeinterface #120 <Method boolean BufferedSource.request(long)>
	//*  90  152:ifeq            239
	//*  91  155:aload_0         
	//*  92  156:getfield        #83  <Field Buffer buffer>
	//*  93  159:lconst_0        
	//*  94  160:invokevirtual   #124 <Method byte Buffer.getByte(long)>
	//*  95  163:bipush          62
	//*  96  165:icmpne          239
									buffer.readByte();
	//   97  168:aload_0         
	//   98  169:getfield        #83  <Field Buffer buffer>
	//   99  172:invokevirtual   #112 <Method byte Buffer.readByte()>
	//  100  175:pop             
							} else
	//* 101  176:goto            239
							{
								throw syntaxError("Expected ':'");
	//  102  179:aload_0         
	//  103  180:ldc1            #126 <String "Expected ':'">
	//  104  182:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//  105  185:athrow          
							}
					} else
					if(i == 6)
	//* 106  186:iload_1         
	//* 107  187:bipush          6
	//* 108  189:icmpne          202
						ai[j - 1] = 7;
	//  109  192:aload_3         
	//  110  193:iload_2         
	//  111  194:iconst_1        
	//  112  195:isub            
	//  113  196:bipush          7
	//  114  198:iastore         
					else
	//* 115  199:goto            239
					if(i == 7)
	//* 116  202:iload_1         
	//* 117  203:bipush          7
	//* 118  205:icmpne          233
					{
						if(nextNonWhitespace(false) == -1)
	//* 119  208:aload_0         
	//* 120  209:iconst_0        
	//* 121  210:invokespecial   #106 <Method int nextNonWhitespace(boolean)>
	//* 122  213:iconst_m1       
	//* 123  214:icmpne          226
						{
							peeked = 17;
	//  124  217:aload_0         
	//  125  218:bipush          17
	//  126  220:putfield        #64  <Field int peeked>
							return 17;
	//  127  223:bipush          17
	//  128  225:ireturn         
						}
						checkLenient();
	//  129  226:aload_0         
	//  130  227:invokespecial   #116 <Method void checkLenient()>
					} else
	//* 131  230:goto            239
					if(i == 8)
						break label1;
	//  132  233:iload_1         
	//  133  234:bipush          8
	//  134  236:icmpeq          465
				}
				j = nextNonWhitespace(true);
	//  135  239:aload_0         
	//  136  240:iconst_1        
	//  137  241:invokespecial   #106 <Method int nextNonWhitespace(boolean)>
	//  138  244:istore_2        
				if(j != 34)
	//* 139  245:iload_2         
	//* 140  246:bipush          34
	//* 141  248:icmpeq          448
				{
					if(j != 39)
	//* 142  251:iload_2         
	//* 143  252:bipush          39
	//* 144  254:icmpeq          427
					{
						if(j != 44 && j != 59)
	//* 145  257:iload_2         
	//* 146  258:bipush          44
	//* 147  260:icmpeq          394
	//* 148  263:iload_2         
	//* 149  264:bipush          59
	//* 150  266:icmpeq          394
							if(j != 91)
	//* 151  269:iload_2         
	//* 152  270:bipush          91
	//* 153  272:icmpeq          379
							{
								if(j != 93)
	//* 154  275:iload_2         
	//* 155  276:bipush          93
	//* 156  278:icmpeq          359
									if(j != 123)
	//* 157  281:iload_2         
	//* 158  282:bipush          123
	//* 159  284:icmpeq          344
									{
										i = peekKeyword();
	//  160  287:aload_0         
	//  161  288:invokespecial   #129 <Method int peekKeyword()>
	//  162  291:istore_1        
										if(i != 0)
	//* 163  292:iload_1         
	//* 164  293:ifeq            298
											return i;
	//  165  296:iload_1         
	//  166  297:ireturn         
										i = peekNumber();
	//  167  298:aload_0         
	//  168  299:invokespecial   #132 <Method int peekNumber()>
	//  169  302:istore_1        
										if(i != 0)
	//* 170  303:iload_1         
	//* 171  304:ifeq            309
											return i;
	//  172  307:iload_1         
	//  173  308:ireturn         
										if(isLiteral(((int) (buffer.getByte(0L)))))
	//* 174  309:aload_0         
	//* 175  310:aload_0         
	//* 176  311:getfield        #83  <Field Buffer buffer>
	//* 177  314:lconst_0        
	//* 178  315:invokevirtual   #124 <Method byte Buffer.getByte(long)>
	//* 179  318:invokespecial   #136 <Method boolean isLiteral(int)>
	//* 180  321:ifeq            337
										{
											checkLenient();
	//  181  324:aload_0         
	//  182  325:invokespecial   #116 <Method void checkLenient()>
											peeked = 10;
	//  183  328:aload_0         
	//  184  329:bipush          10
	//  185  331:putfield        #64  <Field int peeked>
											return 10;
	//  186  334:bipush          10
	//  187  336:ireturn         
										} else
										{
											throw syntaxError("Expected value");
	//  188  337:aload_0         
	//  189  338:ldc1            #138 <String "Expected value">
	//  190  340:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//  191  343:athrow          
										}
									} else
									{
										buffer.readByte();
	//  192  344:aload_0         
	//  193  345:getfield        #83  <Field Buffer buffer>
	//  194  348:invokevirtual   #112 <Method byte Buffer.readByte()>
	//  195  351:pop             
										peeked = 1;
	//  196  352:aload_0         
	//  197  353:iconst_1        
	//  198  354:putfield        #64  <Field int peeked>
										return 1;
	//  199  357:iconst_1        
	//  200  358:ireturn         
									}
								if(i == 1)
	//* 201  359:iload_1         
	//* 202  360:iconst_1        
	//* 203  361:icmpne          394
								{
									buffer.readByte();
	//  204  364:aload_0         
	//  205  365:getfield        #83  <Field Buffer buffer>
	//  206  368:invokevirtual   #112 <Method byte Buffer.readByte()>
	//  207  371:pop             
									peeked = 4;
	//  208  372:aload_0         
	//  209  373:iconst_4        
	//  210  374:putfield        #64  <Field int peeked>
									return 4;
	//  211  377:iconst_4        
	//  212  378:ireturn         
								}
							} else
							{
								buffer.readByte();
	//  213  379:aload_0         
	//  214  380:getfield        #83  <Field Buffer buffer>
	//  215  383:invokevirtual   #112 <Method byte Buffer.readByte()>
	//  216  386:pop             
								peeked = 3;
	//  217  387:aload_0         
	//  218  388:iconst_3        
	//  219  389:putfield        #64  <Field int peeked>
								return 3;
	//  220  392:iconst_3        
	//  221  393:ireturn         
							}
						if(i != 1 && i != 2)
	//* 222  394:iload_1         
	//* 223  395:iconst_1        
	//* 224  396:icmpeq          414
	//* 225  399:iload_1         
	//* 226  400:iconst_2        
	//* 227  401:icmpne          407
	//* 228  404:goto            414
						{
							throw syntaxError("Unexpected value");
	//  229  407:aload_0         
	//  230  408:ldc1            #140 <String "Unexpected value">
	//  231  410:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//  232  413:athrow          
						} else
						{
							checkLenient();
	//  233  414:aload_0         
	//  234  415:invokespecial   #116 <Method void checkLenient()>
							peeked = 7;
	//  235  418:aload_0         
	//  236  419:bipush          7
	//  237  421:putfield        #64  <Field int peeked>
							return 7;
	//  238  424:bipush          7
	//  239  426:ireturn         
						}
					} else
					{
						checkLenient();
	//  240  427:aload_0         
	//  241  428:invokespecial   #116 <Method void checkLenient()>
						buffer.readByte();
	//  242  431:aload_0         
	//  243  432:getfield        #83  <Field Buffer buffer>
	//  244  435:invokevirtual   #112 <Method byte Buffer.readByte()>
	//  245  438:pop             
						peeked = 8;
	//  246  439:aload_0         
	//  247  440:bipush          8
	//  248  442:putfield        #64  <Field int peeked>
						return 8;
	//  249  445:bipush          8
	//  250  447:ireturn         
					}
				} else
				{
					buffer.readByte();
	//  251  448:aload_0         
	//  252  449:getfield        #83  <Field Buffer buffer>
	//  253  452:invokevirtual   #112 <Method byte Buffer.readByte()>
	//  254  455:pop             
					peeked = 9;
	//  255  456:aload_0         
	//  256  457:bipush          9
	//  257  459:putfield        #64  <Field int peeked>
					return 9;
	//  258  462:bipush          9
	//  259  464:ireturn         
				}
			}
			throw new IllegalStateException("JsonReader is closed");
	//  260  465:new             #142 <Class IllegalStateException>
	//  261  468:dup             
	//  262  469:ldc1            #144 <String "JsonReader is closed">
	//  263  471:invokespecial   #145 <Method void IllegalStateException(String)>
	//  264  474:athrow          
		}
		stack[stackSize - 1] = 4;
	//  265  475:aload_0         
	//  266  476:getfield        #66  <Field int[] stack>
	//  267  479:aload_0         
	//  268  480:getfield        #68  <Field int stackSize>
	//  269  483:iconst_1        
	//  270  484:isub            
	//  271  485:iconst_4        
	//  272  486:iastore         
		if(i == 5)
	//* 273  487:iload_1         
	//* 274  488:iconst_5        
	//* 275  489:icmpne          542
		{
			int k = nextNonWhitespace(true);
	//  276  492:aload_0         
	//  277  493:iconst_1        
	//  278  494:invokespecial   #106 <Method int nextNonWhitespace(boolean)>
	//  279  497:istore_2        
			buffer.readByte();
	//  280  498:aload_0         
	//  281  499:getfield        #83  <Field Buffer buffer>
	//  282  502:invokevirtual   #112 <Method byte Buffer.readByte()>
	//  283  505:pop             
			if(k != 44)
	//* 284  506:iload_2         
	//* 285  507:bipush          44
	//* 286  509:icmpeq          542
			{
				if(k != 59)
	//* 287  512:iload_2         
	//* 288  513:bipush          59
	//* 289  515:icmpeq          538
					if(k == 125)
	//* 290  518:iload_2         
	//* 291  519:bipush          125
	//* 292  521:icmpne          531
					{
						peeked = 2;
	//  293  524:aload_0         
	//  294  525:iconst_2        
	//  295  526:putfield        #64  <Field int peeked>
						return 2;
	//  296  529:iconst_2        
	//  297  530:ireturn         
					} else
					{
						throw syntaxError("Unterminated object");
	//  298  531:aload_0         
	//  299  532:ldc1            #147 <String "Unterminated object">
	//  300  534:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//  301  537:athrow          
					}
				checkLenient();
	//  302  538:aload_0         
	//  303  539:invokespecial   #116 <Method void checkLenient()>
			}
		}
		int l = nextNonWhitespace(true);
	//  304  542:aload_0         
	//  305  543:iconst_1        
	//  306  544:invokespecial   #106 <Method int nextNonWhitespace(boolean)>
	//  307  547:istore_2        
		if(l != 34)
	//* 308  548:iload_2         
	//* 309  549:bipush          34
	//* 310  551:icmpeq          643
		{
			if(l != 39)
	//* 311  554:iload_2         
	//* 312  555:bipush          39
	//* 313  557:icmpeq          622
			{
				if(l != 125)
	//* 314  560:iload_2         
	//* 315  561:bipush          125
	//* 316  563:icmpeq          595
				{
					checkLenient();
	//  317  566:aload_0         
	//  318  567:invokespecial   #116 <Method void checkLenient()>
					if(isLiteral(((int) ((char)l))))
	//* 319  570:aload_0         
	//* 320  571:iload_2         
	//* 321  572:int2char        
	//* 322  573:invokespecial   #136 <Method boolean isLiteral(int)>
	//* 323  576:ifeq            588
					{
						peeked = 14;
	//  324  579:aload_0         
	//  325  580:bipush          14
	//  326  582:putfield        #64  <Field int peeked>
						return 14;
	//  327  585:bipush          14
	//  328  587:ireturn         
					} else
					{
						throw syntaxError("Expected name");
	//  329  588:aload_0         
	//  330  589:ldc1            #149 <String "Expected name">
	//  331  591:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//  332  594:athrow          
					}
				}
				if(i != 5)
	//* 333  595:iload_1         
	//* 334  596:iconst_5        
	//* 335  597:icmpeq          615
				{
					buffer.readByte();
	//  336  600:aload_0         
	//  337  601:getfield        #83  <Field Buffer buffer>
	//  338  604:invokevirtual   #112 <Method byte Buffer.readByte()>
	//  339  607:pop             
					peeked = 2;
	//  340  608:aload_0         
	//  341  609:iconst_2        
	//  342  610:putfield        #64  <Field int peeked>
					return 2;
	//  343  613:iconst_2        
	//  344  614:ireturn         
				} else
				{
					throw syntaxError("Expected name");
	//  345  615:aload_0         
	//  346  616:ldc1            #149 <String "Expected name">
	//  347  618:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//  348  621:athrow          
				}
			} else
			{
				buffer.readByte();
	//  349  622:aload_0         
	//  350  623:getfield        #83  <Field Buffer buffer>
	//  351  626:invokevirtual   #112 <Method byte Buffer.readByte()>
	//  352  629:pop             
				checkLenient();
	//  353  630:aload_0         
	//  354  631:invokespecial   #116 <Method void checkLenient()>
				peeked = 12;
	//  355  634:aload_0         
	//  356  635:bipush          12
	//  357  637:putfield        #64  <Field int peeked>
				return 12;
	//  358  640:bipush          12
	//  359  642:ireturn         
			}
		} else
		{
			buffer.readByte();
	//  360  643:aload_0         
	//  361  644:getfield        #83  <Field Buffer buffer>
	//  362  647:invokevirtual   #112 <Method byte Buffer.readByte()>
	//  363  650:pop             
			peeked = 13;
	//  364  651:aload_0         
	//  365  652:bipush          13
	//  366  654:putfield        #64  <Field int peeked>
			return 13;
	//  367  657:bipush          13
	//  368  659:ireturn         
		}
	}

	private boolean isLiteral(int i)
		throws IOException
	{
		switch(i)
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
	//    5  143:invokespecial   #116 <Method void checkLenient()>
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		do
		{
			BufferedSource bufferedsource = source;
	//    2    2:aload_0         
	//    3    3:getfield        #76  <Field BufferedSource source>
	//    4    6:astore          4
			int j = i + 1;
	//    5    8:iload_2         
	//    6    9:iconst_1        
	//    7   10:iadd            
	//    8   11:istore_3        
			if(!bufferedsource.request(j))
				break;
	//    9   12:aload           4
	//   10   14:iload_3         
	//   11   15:i2l             
	//   12   16:invokeinterface #120 <Method boolean BufferedSource.request(long)>
	//   13   21:ifeq            226
			i = ((int) (buffer.getByte(i)));
	//   14   24:aload_0         
	//   15   25:getfield        #83  <Field Buffer buffer>
	//   16   28:iload_2         
	//   17   29:i2l             
	//   18   30:invokevirtual   #124 <Method byte Buffer.getByte(long)>
	//   19   33:istore_2        
			if(i != 10 && i != 32 && i != 13 && i != 9)
	//*  20   34:iload_2         
	//*  21   35:bipush          10
	//*  22   37:icmpeq          221
	//*  23   40:iload_2         
	//*  24   41:bipush          32
	//*  25   43:icmpeq          221
	//*  26   46:iload_2         
	//*  27   47:bipush          13
	//*  28   49:icmpeq          221
	//*  29   52:iload_2         
	//*  30   53:bipush          9
	//*  31   55:icmpne          61
	//*  32   58:goto            221
			{
				buffer.skip(j - 1);
	//   33   61:aload_0         
	//   34   62:getfield        #83  <Field Buffer buffer>
	//   35   65:iload_3         
	//   36   66:iconst_1        
	//   37   67:isub            
	//   38   68:i2l             
	//   39   69:invokevirtual   #153 <Method void Buffer.skip(long)>
				if(i == 47)
	//*  40   72:iload_2         
	//*  41   73:bipush          47
	//*  42   75:icmpne          200
				{
					if(!source.request(2L))
	//*  43   78:aload_0         
	//*  44   79:getfield        #76  <Field BufferedSource source>
	//*  45   82:ldc2w           #154 <Long 2L>
	//*  46   85:invokeinterface #120 <Method boolean BufferedSource.request(long)>
	//*  47   90:ifne            95
						return i;
	//   48   93:iload_2         
	//   49   94:ireturn         
					checkLenient();
	//   50   95:aload_0         
	//   51   96:invokespecial   #116 <Method void checkLenient()>
					j = ((int) (buffer.getByte(1L)));
	//   52   99:aload_0         
	//   53  100:getfield        #83  <Field Buffer buffer>
	//   54  103:lconst_1        
	//   55  104:invokevirtual   #124 <Method byte Buffer.getByte(long)>
	//   56  107:istore_3        
					if(j != 42)
	//*  57  108:iload_3         
	//*  58  109:bipush          42
	//*  59  111:icmpeq          147
					{
						if(j != 47)
	//*  60  114:iload_3         
	//*  61  115:bipush          47
	//*  62  117:icmpeq          122
							return i;
	//   63  120:iload_2         
	//   64  121:ireturn         
						buffer.readByte();
	//   65  122:aload_0         
	//   66  123:getfield        #83  <Field Buffer buffer>
	//   67  126:invokevirtual   #112 <Method byte Buffer.readByte()>
	//   68  129:pop             
						buffer.readByte();
	//   69  130:aload_0         
	//   70  131:getfield        #83  <Field Buffer buffer>
	//   71  134:invokevirtual   #112 <Method byte Buffer.readByte()>
	//   72  137:pop             
						skipToEndOfLine();
	//   73  138:aload_0         
	//   74  139:invokespecial   #158 <Method void skipToEndOfLine()>
						i = 0;
	//   75  142:iconst_0        
	//   76  143:istore_2        
					} else
	//*  77  144:goto            2
					{
						buffer.readByte();
	//   78  147:aload_0         
	//   79  148:getfield        #83  <Field Buffer buffer>
	//   80  151:invokevirtual   #112 <Method byte Buffer.readByte()>
	//   81  154:pop             
						buffer.readByte();
	//   82  155:aload_0         
	//   83  156:getfield        #83  <Field Buffer buffer>
	//   84  159:invokevirtual   #112 <Method byte Buffer.readByte()>
	//   85  162:pop             
						if(skipTo("*/"))
	//*  86  163:aload_0         
	//*  87  164:ldc1            #160 <String "*/">
	//*  88  166:invokespecial   #164 <Method boolean skipTo(String)>
	//*  89  169:ifeq            193
						{
							buffer.readByte();
	//   90  172:aload_0         
	//   91  173:getfield        #83  <Field Buffer buffer>
	//   92  176:invokevirtual   #112 <Method byte Buffer.readByte()>
	//   93  179:pop             
							buffer.readByte();
	//   94  180:aload_0         
	//   95  181:getfield        #83  <Field Buffer buffer>
	//   96  184:invokevirtual   #112 <Method byte Buffer.readByte()>
	//   97  187:pop             
							i = 0;
	//   98  188:iconst_0        
	//   99  189:istore_2        
						} else
	//* 100  190:goto            2
						{
							throw syntaxError("Unterminated comment");
	//  101  193:aload_0         
	//  102  194:ldc1            #166 <String "Unterminated comment">
	//  103  196:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//  104  199:athrow          
						}
					}
				} else
				if(i == 35)
	//* 105  200:iload_2         
	//* 106  201:bipush          35
	//* 107  203:icmpne          219
				{
					checkLenient();
	//  108  206:aload_0         
	//  109  207:invokespecial   #116 <Method void checkLenient()>
					skipToEndOfLine();
	//  110  210:aload_0         
	//  111  211:invokespecial   #158 <Method void skipToEndOfLine()>
					i = 0;
	//  112  214:iconst_0        
	//  113  215:istore_2        
				} else
	//* 114  216:goto            2
				{
					return i;
	//  115  219:iload_2         
	//  116  220:ireturn         
				}
			} else
			{
				i = j;
	//  117  221:iload_3         
	//  118  222:istore_2        
			}
		} while(true);
	//  119  223:goto            2
		if(!flag)
	//* 120  226:iload_1         
	//* 121  227:ifne            232
			return -1;
	//  122  230:iconst_m1       
	//  123  231:ireturn         
		else
			throw new EOFException("End of input");
	//  124  232:new             #168 <Class EOFException>
	//  125  235:dup             
	//  126  236:ldc1            #170 <String "End of input">
	//  127  238:invokespecial   #171 <Method void EOFException(String)>
	//  128  241:athrow          
	}

	private String nextQuotedValue(ByteString bytestring)
		throws IOException
	{
		StringBuilder stringbuilder = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		do
		{
			long l = source.indexOfElement(bytestring);
	//    2    3:aload_0         
	//    3    4:getfield        #76  <Field BufferedSource source>
	//    4    7:aload_1         
	//    5    8:invokeinterface #177 <Method long BufferedSource.indexOfElement(ByteString)>
	//    6   13:lstore_2        
			if(l != -1L)
	//*   7   14:lload_2         
	//*   8   15:ldc2w           #178 <Long -1L>
	//*   9   18:lcmp            
	//*  10   19:ifeq            144
			{
				if(buffer.getByte(l) == 92)
	//*  11   22:aload_0         
	//*  12   23:getfield        #83  <Field Buffer buffer>
	//*  13   26:lload_2         
	//*  14   27:invokevirtual   #124 <Method byte Buffer.getByte(long)>
	//*  15   30:bipush          92
	//*  16   32:icmpne          92
				{
					StringBuilder stringbuilder1 = stringbuilder;
	//   17   35:aload           4
	//   18   37:astore          5
					if(stringbuilder == null)
	//*  19   39:aload           4
	//*  20   41:ifnonnull       53
						stringbuilder1 = new StringBuilder();
	//   21   44:new             #181 <Class StringBuilder>
	//   22   47:dup             
	//   23   48:invokespecial   #182 <Method void StringBuilder()>
	//   24   51:astore          5
					stringbuilder1.append(buffer.readUtf8(l));
	//   25   53:aload           5
	//   26   55:aload_0         
	//   27   56:getfield        #83  <Field Buffer buffer>
	//   28   59:lload_2         
	//   29   60:invokevirtual   #186 <Method String Buffer.readUtf8(long)>
	//   30   63:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   31   66:pop             
					buffer.readByte();
	//   32   67:aload_0         
	//   33   68:getfield        #83  <Field Buffer buffer>
	//   34   71:invokevirtual   #112 <Method byte Buffer.readByte()>
	//   35   74:pop             
					stringbuilder1.append(readEscapeCharacter());
	//   36   75:aload           5
	//   37   77:aload_0         
	//   38   78:invokespecial   #194 <Method char readEscapeCharacter()>
	//   39   81:invokevirtual   #197 <Method StringBuilder StringBuilder.append(char)>
	//   40   84:pop             
					stringbuilder = stringbuilder1;
	//   41   85:aload           5
	//   42   87:astore          4
				} else
	//*  43   89:goto            3
				if(stringbuilder == null)
	//*  44   92:aload           4
	//*  45   94:ifnonnull       116
				{
					bytestring = ((ByteString) (buffer.readUtf8(l)));
	//   46   97:aload_0         
	//   47   98:getfield        #83  <Field Buffer buffer>
	//   48  101:lload_2         
	//   49  102:invokevirtual   #186 <Method String Buffer.readUtf8(long)>
	//   50  105:astore_1        
					buffer.readByte();
	//   51  106:aload_0         
	//   52  107:getfield        #83  <Field Buffer buffer>
	//   53  110:invokevirtual   #112 <Method byte Buffer.readByte()>
	//   54  113:pop             
					return ((String) (bytestring));
	//   55  114:aload_1         
	//   56  115:areturn         
				} else
				{
					stringbuilder.append(buffer.readUtf8(l));
	//   57  116:aload           4
	//   58  118:aload_0         
	//   59  119:getfield        #83  <Field Buffer buffer>
	//   60  122:lload_2         
	//   61  123:invokevirtual   #186 <Method String Buffer.readUtf8(long)>
	//   62  126:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   63  129:pop             
					buffer.readByte();
	//   64  130:aload_0         
	//   65  131:getfield        #83  <Field Buffer buffer>
	//   66  134:invokevirtual   #112 <Method byte Buffer.readByte()>
	//   67  137:pop             
					return stringbuilder.toString();
	//   68  138:aload           4
	//   69  140:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   70  143:areturn         
				}
			} else
			{
				throw syntaxError("Unterminated string");
	//   71  144:aload_0         
	//   72  145:ldc1            #203 <String "Unterminated string">
	//   73  147:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//   74  150:athrow          
			}
		} while(true);
	}

	private String nextUnquotedValue()
		throws IOException
	{
		long l = source.indexOfElement(UNQUOTED_STRING_TERMINALS);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field BufferedSource source>
	//    2    4:getstatic       #49  <Field ByteString UNQUOTED_STRING_TERMINALS>
	//    3    7:invokeinterface #177 <Method long BufferedSource.indexOfElement(ByteString)>
	//    4   12:lstore_1        
		if(l != -1L)
	//*   5   13:lload_1         
	//*   6   14:ldc2w           #178 <Long -1L>
	//*   7   17:lcmp            
	//*   8   18:ifeq            30
			return buffer.readUtf8(l);
	//    9   21:aload_0         
	//   10   22:getfield        #83  <Field Buffer buffer>
	//   11   25:lload_1         
	//   12   26:invokevirtual   #186 <Method String Buffer.readUtf8(long)>
	//   13   29:areturn         
		else
			return buffer.readUtf8();
	//   14   30:aload_0         
	//   15   31:getfield        #83  <Field Buffer buffer>
	//   16   34:invokevirtual   #206 <Method String Buffer.readUtf8()>
	//   17   37:areturn         
	}

	private int peekKeyword()
		throws IOException
	{
		int i = ((int) (buffer.getByte(0L)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Buffer buffer>
	//    2    4:lconst_0        
	//    3    5:invokevirtual   #124 <Method byte Buffer.getByte(long)>
	//    4    8:istore_1        
		String s;
		String s1;
		if(i != 116 && i != 84)
	//*   5    9:iload_1         
	//*   6   10:bipush          116
	//*   7   12:icmpeq          84
	//*   8   15:iload_1         
	//*   9   16:bipush          84
	//*  10   18:icmpne          24
	//*  11   21:goto            84
		{
			if(i != 102 && i != 70)
	//*  12   24:iload_1         
	//*  13   25:bipush          102
	//*  14   27:icmpeq          70
	//*  15   30:iload_1         
	//*  16   31:bipush          70
	//*  17   33:icmpne          39
	//*  18   36:goto            70
			{
				if(i != 110 && i != 78)
	//*  19   39:iload_1         
	//*  20   40:bipush          110
	//*  21   42:icmpeq          56
	//*  22   45:iload_1         
	//*  23   46:bipush          78
	//*  24   48:icmpne          54
	//*  25   51:goto            56
					return 0;
	//   26   54:iconst_0        
	//   27   55:ireturn         
				s = "null";
	//   28   56:ldc1            #208 <String "null">
	//   29   58:astore          6
				s1 = "NULL";
	//   30   60:ldc1            #210 <String "NULL">
	//   31   62:astore          7
				i = 7;
	//   32   64:bipush          7
	//   33   66:istore_1        
			} else
	//*  34   67:goto            94
			{
				s = "false";
	//   35   70:ldc1            #212 <String "false">
	//   36   72:astore          6
				s1 = "FALSE";
	//   37   74:ldc1            #214 <String "FALSE">
	//   38   76:astore          7
				i = 6;
	//   39   78:bipush          6
	//   40   80:istore_1        
			}
		} else
	//*  41   81:goto            94
		{
			s = "true";
	//   42   84:ldc1            #216 <String "true">
	//   43   86:astore          6
			s1 = "TRUE";
	//   44   88:ldc1            #218 <String "TRUE">
	//   45   90:astore          7
			i = 5;
	//   46   92:iconst_5        
	//   47   93:istore_1        
		}
		int l = s.length();
	//   48   94:aload           6
	//   49   96:invokevirtual   #221 <Method int String.length()>
	//   50   99:istore          4
		int k;
		for(int j = 1; j < l; j = k)
	//*  51  101:iconst_1        
	//*  52  102:istore_2        
	//*  53  103:iload_2         
	//*  54  104:iload           4
	//*  55  106:icmpge          173
		{
			BufferedSource bufferedsource = source;
	//   56  109:aload_0         
	//   57  110:getfield        #76  <Field BufferedSource source>
	//   58  113:astore          8
			k = j + 1;
	//   59  115:iload_2         
	//   60  116:iconst_1        
	//   61  117:iadd            
	//   62  118:istore_3        
			if(!bufferedsource.request(k))
	//*  63  119:aload           8
	//*  64  121:iload_3         
	//*  65  122:i2l             
	//*  66  123:invokeinterface #120 <Method boolean BufferedSource.request(long)>
	//*  67  128:ifne            133
				return 0;
	//   68  131:iconst_0        
	//   69  132:ireturn         
			byte byte0 = buffer.getByte(j);
	//   70  133:aload_0         
	//   71  134:getfield        #83  <Field Buffer buffer>
	//   72  137:iload_2         
	//   73  138:i2l             
	//   74  139:invokevirtual   #124 <Method byte Buffer.getByte(long)>
	//   75  142:istore          5
			if(byte0 != s.charAt(j) && byte0 != s1.charAt(j))
	//*  76  144:iload           5
	//*  77  146:aload           6
	//*  78  148:iload_2         
	//*  79  149:invokevirtual   #225 <Method char String.charAt(int)>
	//*  80  152:icmpeq          168
	//*  81  155:iload           5
	//*  82  157:aload           7
	//*  83  159:iload_2         
	//*  84  160:invokevirtual   #225 <Method char String.charAt(int)>
	//*  85  163:icmpeq          168
				return 0;
	//   86  166:iconst_0        
	//   87  167:ireturn         
		}

	//   88  168:iload_3         
	//   89  169:istore_2        
	//*  90  170:goto            103
		if(source.request(l + 1) && isLiteral(((int) (buffer.getByte(l)))))
	//*  91  173:aload_0         
	//*  92  174:getfield        #76  <Field BufferedSource source>
	//*  93  177:iload           4
	//*  94  179:iconst_1        
	//*  95  180:iadd            
	//*  96  181:i2l             
	//*  97  182:invokeinterface #120 <Method boolean BufferedSource.request(long)>
	//*  98  187:ifeq            209
	//*  99  190:aload_0         
	//* 100  191:aload_0         
	//* 101  192:getfield        #83  <Field Buffer buffer>
	//* 102  195:iload           4
	//* 103  197:i2l             
	//* 104  198:invokevirtual   #124 <Method byte Buffer.getByte(long)>
	//* 105  201:invokespecial   #136 <Method boolean isLiteral(int)>
	//* 106  204:ifeq            209
		{
			return 0;
	//  107  207:iconst_0        
	//  108  208:ireturn         
		} else
		{
			buffer.skip(l);
	//  109  209:aload_0         
	//  110  210:getfield        #83  <Field Buffer buffer>
	//  111  213:iload           4
	//  112  215:i2l             
	//  113  216:invokevirtual   #153 <Method void Buffer.skip(long)>
			peeked = i;
	//  114  219:aload_0         
	//  115  220:iload_1         
	//  116  221:putfield        #64  <Field int peeked>
			return i;
	//  117  224:iload_1         
	//  118  225:ireturn         
		}
	}

	private int peekNumber()
		throws IOException
	{
		int j;
		boolean flag;
		int k;
		int i1;
		long l1;
		l1 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore          9
		i1 = 0;
	//    2    3:iconst_0        
	//    3    4:istore          7
		k = 0;
	//    4    6:iconst_0        
	//    5    7:istore          4
		j = 1;
	//    6    9:iconst_1        
	//    7   10:istore_2        
		flag = false;
	//    8   11:iconst_0        
	//    9   12:istore_3        
_L12:
		int j1;
		BufferedSource bufferedsource;
		bufferedsource = source;
	//   10   13:aload_0         
	//   11   14:getfield        #76  <Field BufferedSource source>
	//   12   17:astore          13
		j1 = i1 + 1;
	//   13   19:iload           7
	//   14   21:iconst_1        
	//   15   22:iadd            
	//   16   23:istore          8
		if(bufferedsource.request(j1)) goto _L2; else goto _L1
	//   17   25:aload           13
	//   18   27:iload           8
	//   19   29:i2l             
	//   20   30:invokeinterface #120 <Method boolean BufferedSource.request(long)>
	//   21   35:ifne            41
	//*  22   38:goto            287
_L2:
		int i = ((int) (buffer.getByte(i1)));
	//   23   41:aload_0         
	//   24   42:getfield        #83  <Field Buffer buffer>
	//   25   45:iload           7
	//   26   47:i2l             
	//   27   48:invokevirtual   #124 <Method byte Buffer.getByte(long)>
	//   28   51:istore_1        
		if(i == 43) goto _L4; else goto _L3
	//   29   52:iload_1         
	//   30   53:bipush          43
	//   31   55:icmpeq          487
_L3:
		if(i == 69 || i == 101) goto _L6; else goto _L5
	//   32   58:iload_1         
	//   33   59:bipush          69
	//   34   61:icmpeq          455
	//   35   64:iload_1         
	//   36   65:bipush          101
	//   37   67:icmpeq          455
_L5:
		i;
	//   38   70:iload_1         
		JVM INSTR tableswitch 45 46: default 92
	//	               45 411
	//	               46 388;
	//   39   71:tableswitch     45 46: default 92
	//	               45 411
	//	               46 388
		   goto _L7 _L8 _L9
_L7:
		int l;
		boolean flag1;
		long l2;
		if(i >= 48 && i <= 57)
	//*  40   92:iload_1         
	//*  41   93:bipush          48
	//*  42   95:icmplt          279
	//*  43   98:iload_1         
	//*  44   99:bipush          57
	//*  45  101:icmple          107
	//*  46  104:goto            279
		{
			if(k != 1 && k != 0)
	//*  47  107:iload           4
	//*  48  109:iconst_1        
	//*  49  110:icmpeq          260
	//*  50  113:iload           4
	//*  51  115:ifne            121
	//*  52  118:goto            260
			{
				if(k == 2)
	//*  53  121:iload           4
	//*  54  123:iconst_2        
	//*  55  124:icmpne          197
				{
					if(l1 == 0L)
	//*  56  127:lload           9
	//*  57  129:lconst_0        
	//*  58  130:lcmp            
	//*  59  131:ifne            136
						return 0;
	//   60  134:iconst_0        
	//   61  135:ireturn         
					l2 = 10L * l1 - (long)(i - 48);
	//   62  136:ldc2w           #226 <Long 10L>
	//   63  139:lload           9
	//   64  141:lmul            
	//   65  142:iload_1         
	//   66  143:bipush          48
	//   67  145:isub            
	//   68  146:i2l             
	//   69  147:lsub            
	//   70  148:lstore          11
					i = l1 != 0x33333334L;
	//   71  150:lload           9
	//   72  152:ldc2w           #228 <Long 0x33333334L>
	//   73  155:lcmp            
	//   74  156:istore_1        
					if(i <= 0 && (i != 0 || l2 >= l1))
	//*  75  157:iload_1         
	//*  76  158:ifgt            181
	//*  77  161:iload_1         
	//*  78  162:ifne            176
	//*  79  165:lload           11
	//*  80  167:lload           9
	//*  81  169:lcmp            
	//*  82  170:ifge            176
	//*  83  173:goto            181
						i = 0;
	//   84  176:iconst_0        
	//   85  177:istore_1        
					else
	//*  86  178:goto            183
						i = 1;
	//   87  181:iconst_1        
	//   88  182:istore_1        
					l = i & j;
	//   89  183:iload_1         
	//   90  184:iload_2         
	//   91  185:iand            
	//   92  186:istore          5
					i = k;
	//   93  188:iload           4
	//   94  190:istore_1        
					flag1 = flag;
	//   95  191:iload_3         
	//   96  192:istore          6
					break MISSING_BLOCK_LABEL_506;
	//   97  194:goto            506
				}
				if(k == 3)
	//*  98  197:iload           4
	//*  99  199:iconst_3        
	//* 100  200:icmpne          218
				{
					i = 4;
	//  101  203:iconst_4        
	//  102  204:istore_1        
					l = j;
	//  103  205:iload_2         
	//  104  206:istore          5
					l2 = l1;
	//  105  208:lload           9
	//  106  210:lstore          11
					flag1 = flag;
	//  107  212:iload_3         
	//  108  213:istore          6
					break MISSING_BLOCK_LABEL_506;
	//  109  215:goto            506
				}
				if(k != 5)
	//* 110  218:iload           4
	//* 111  220:iconst_5        
	//* 112  221:icmpeq          244
				{
					i = k;
	//  113  224:iload           4
	//  114  226:istore_1        
					l = j;
	//  115  227:iload_2         
	//  116  228:istore          5
					l2 = l1;
	//  117  230:lload           9
	//  118  232:lstore          11
					flag1 = flag;
	//  119  234:iload_3         
	//  120  235:istore          6
					if(k != 6)
						break MISSING_BLOCK_LABEL_506;
	//  121  237:iload           4
	//  122  239:bipush          6
	//  123  241:icmpne          506
				}
				i = 7;
	//  124  244:bipush          7
	//  125  246:istore_1        
				l = j;
	//  126  247:iload_2         
	//  127  248:istore          5
				l2 = l1;
	//  128  250:lload           9
	//  129  252:lstore          11
				flag1 = flag;
	//  130  254:iload_3         
	//  131  255:istore          6
			} else
	//* 132  257:goto            506
			{
				l2 = -(i - 48);
	//  133  260:iload_1         
	//  134  261:bipush          48
	//  135  263:isub            
	//  136  264:ineg            
	//  137  265:i2l             
	//  138  266:lstore          11
				i = 2;
	//  139  268:iconst_2        
	//  140  269:istore_1        
				l = j;
	//  141  270:iload_2         
	//  142  271:istore          5
				flag1 = flag;
	//  143  273:iload_3         
	//  144  274:istore          6
			}
			break MISSING_BLOCK_LABEL_506;
	//  145  276:goto            506
		}
		if(isLiteral(i)) goto _L10; else goto _L1
	//  146  279:aload_0         
	//  147  280:iload_1         
	//  148  281:invokespecial   #136 <Method boolean isLiteral(int)>
	//  149  284:ifne            386
_L1:
		if(k == 2 && j != 0 && (l1 != 0x0L || flag))
	//* 150  287:iload           4
	//* 151  289:iconst_2        
	//* 152  290:icmpne          347
	//* 153  293:iload_2         
	//* 154  294:ifeq            347
	//* 155  297:lload           9
	//* 156  299:ldc2w           #230 <Long 0x0L>
	//* 157  302:lcmp            
	//* 158  303:ifne            310
	//* 159  306:iload_3         
	//* 160  307:ifeq            347
		{
			if(!flag)
	//* 161  310:iload_3         
	//* 162  311:ifeq            317
	//* 163  314:goto            322
				l1 = -l1;
	//  164  317:lload           9
	//  165  319:lneg            
	//  166  320:lstore          9
			peekedLong = l1;
	//  167  322:aload_0         
	//  168  323:lload           9
	//  169  325:putfield        #233 <Field long peekedLong>
			buffer.skip(i1);
	//  170  328:aload_0         
	//  171  329:getfield        #83  <Field Buffer buffer>
	//  172  332:iload           7
	//  173  334:i2l             
	//  174  335:invokevirtual   #153 <Method void Buffer.skip(long)>
			peeked = 15;
	//  175  338:aload_0         
	//  176  339:bipush          15
	//  177  341:putfield        #64  <Field int peeked>
			return 15;
	//  178  344:bipush          15
	//  179  346:ireturn         
		}
		if(k != 2 && k != 4 && k != 7)
	//* 180  347:iload           4
	//* 181  349:iconst_2        
	//* 182  350:icmpeq          371
	//* 183  353:iload           4
	//* 184  355:iconst_4        
	//* 185  356:icmpeq          371
	//* 186  359:iload           4
	//* 187  361:bipush          7
	//* 188  363:icmpne          369
	//* 189  366:goto            371
		{
			return 0;
	//  190  369:iconst_0        
	//  191  370:ireturn         
		} else
		{
			peekedNumberLength = i1;
	//  192  371:aload_0         
	//  193  372:iload           7
	//  194  374:putfield        #235 <Field int peekedNumberLength>
			peeked = 16;
	//  195  377:aload_0         
	//  196  378:bipush          16
	//  197  380:putfield        #64  <Field int peeked>
			return 16;
	//  198  383:bipush          16
	//  199  385:ireturn         
		}
_L10:
		return 0;
	//  200  386:iconst_0        
	//  201  387:ireturn         
_L9:
		if(k == 2)
	//* 202  388:iload           4
	//* 203  390:iconst_2        
	//* 204  391:icmpne          409
		{
			i = 3;
	//  205  394:iconst_3        
	//  206  395:istore_1        
			l = j;
	//  207  396:iload_2         
	//  208  397:istore          5
			l2 = l1;
	//  209  399:lload           9
	//  210  401:lstore          11
			flag1 = flag;
	//  211  403:iload_3         
	//  212  404:istore          6
		} else
	//* 213  406:goto            506
		{
			return 0;
	//  214  409:iconst_0        
	//  215  410:ireturn         
		}
		break MISSING_BLOCK_LABEL_506;
_L8:
		if(k == 0)
	//* 216  411:iload           4
	//* 217  413:ifne            431
		{
			i = 1;
	//  218  416:iconst_1        
	//  219  417:istore_1        
			flag1 = true;
	//  220  418:iconst_1        
	//  221  419:istore          6
			l = j;
	//  222  421:iload_2         
	//  223  422:istore          5
			l2 = l1;
	//  224  424:lload           9
	//  225  426:lstore          11
		} else
	//* 226  428:goto            506
		if(k == 5)
	//* 227  431:iload           4
	//* 228  433:iconst_5        
	//* 229  434:icmpne          453
		{
			i = 6;
	//  230  437:bipush          6
	//  231  439:istore_1        
			l = j;
	//  232  440:iload_2         
	//  233  441:istore          5
			l2 = l1;
	//  234  443:lload           9
	//  235  445:lstore          11
			flag1 = flag;
	//  236  447:iload_3         
	//  237  448:istore          6
		} else
	//* 238  450:goto            506
		{
			return 0;
	//  239  453:iconst_0        
	//  240  454:ireturn         
		}
		break MISSING_BLOCK_LABEL_506;
_L6:
		if(k != 2 && k != 4)
	//* 241  455:iload           4
	//* 242  457:iconst_2        
	//* 243  458:icmpeq          472
	//* 244  461:iload           4
	//* 245  463:iconst_4        
	//* 246  464:icmpne          470
	//* 247  467:goto            472
			return 0;
	//  248  470:iconst_0        
	//  249  471:ireturn         
		i = 5;
	//  250  472:iconst_5        
	//  251  473:istore_1        
		l = j;
	//  252  474:iload_2         
	//  253  475:istore          5
		l2 = l1;
	//  254  477:lload           9
	//  255  479:lstore          11
		flag1 = flag;
	//  256  481:iload_3         
	//  257  482:istore          6
		break MISSING_BLOCK_LABEL_506;
	//  258  484:goto            506
_L4:
		if(k != 5)
			break; /* Loop/switch isn't completed */
	//  259  487:iload           4
	//  260  489:iconst_5        
	//  261  490:icmpne          526
		i = 6;
	//  262  493:bipush          6
	//  263  495:istore_1        
		flag1 = flag;
	//  264  496:iload_3         
	//  265  497:istore          6
		l2 = l1;
	//  266  499:lload           9
	//  267  501:lstore          11
		l = j;
	//  268  503:iload_2         
	//  269  504:istore          5
		i1 = j1;
	//  270  506:iload           8
	//  271  508:istore          7
		k = i;
	//  272  510:iload_1         
	//  273  511:istore          4
		j = l;
	//  274  513:iload           5
	//  275  515:istore_2        
		l1 = l2;
	//  276  516:lload           11
	//  277  518:lstore          9
		flag = flag1;
	//  278  520:iload           6
	//  279  522:istore_3        
		if(true) goto _L12; else goto _L11
	//  280  523:goto            13
_L11:
		return 0;
	//  281  526:iconst_0        
	//  282  527:ireturn         
	}

	private void push(int i)
	{
		int j = stackSize;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int stackSize>
	//    2    4:istore_2        
		int ai[] = stack;
	//    3    5:aload_0         
	//    4    6:getfield        #66  <Field int[] stack>
	//    5    9:astore_3        
		if(j != ai.length)
	//*   6   10:iload_2         
	//*   7   11:aload_3         
	//*   8   12:arraylength     
	//*   9   13:icmpeq          28
		{
			stackSize = j + 1;
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:iconst_1        
	//   13   19:iadd            
	//   14   20:putfield        #68  <Field int stackSize>
			ai[j] = i;
	//   15   23:aload_3         
	//   16   24:iload_2         
	//   17   25:iload_1         
	//   18   26:iastore         
			return;
	//   19   27:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   20   28:new             #181 <Class StringBuilder>
	//   21   31:dup             
	//   22   32:invokespecial   #182 <Method void StringBuilder()>
	//   23   35:astore_3        
			stringbuilder.append("Nesting too deep at ");
	//   24   36:aload_3         
	//   25   37:ldc1            #239 <String "Nesting too deep at ">
	//   26   39:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   27   42:pop             
			stringbuilder.append(getPath());
	//   28   43:aload_3         
	//   29   44:aload_0         
	//   30   45:invokevirtual   #242 <Method String getPath()>
	//   31   48:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   32   51:pop             
			throw new JsonDataException(stringbuilder.toString());
	//   33   52:new             #244 <Class JsonDataException>
	//   34   55:dup             
	//   35   56:aload_3         
	//   36   57:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   37   60:invokespecial   #245 <Method void JsonDataException(String)>
	//   38   63:athrow          
		}
	}

	private char readEscapeCharacter()
		throws IOException
	{
		if(!source.request(1L)) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field BufferedSource source>
	//    2    4:lconst_1        
	//    3    5:invokeinterface #120 <Method boolean BufferedSource.request(long)>
	//    4   10:ifeq            380
_L1:
		int i = ((int) (buffer.readByte()));
	//    5   13:aload_0         
	//    6   14:getfield        #83  <Field Buffer buffer>
	//    7   17:invokevirtual   #112 <Method byte Buffer.readByte()>
	//    8   20:istore_2        
		if(i == 10 || i == 34 || i == 39 || i == 47 || i == 92) goto _L4; else goto _L3
	//    9   21:iload_2         
	//   10   22:bipush          10
	//   11   24:icmpeq          377
	//   12   27:iload_2         
	//   13   28:bipush          34
	//   14   30:icmpeq          377
	//   15   33:iload_2         
	//   16   34:bipush          39
	//   17   36:icmpeq          377
	//   18   39:iload_2         
	//   19   40:bipush          47
	//   20   42:icmpeq          377
	//   21   45:iload_2         
	//   22   46:bipush          92
	//   23   48:icmpeq          377
_L3:
		if(i == 98) goto _L6; else goto _L5
	//   24   51:iload_2         
	//   25   52:bipush          98
	//   26   54:icmpeq          374
_L5:
		if(i == 102) goto _L8; else goto _L7
	//   27   57:iload_2         
	//   28   58:bipush          102
	//   29   60:icmpeq          371
_L7:
		if(i == 110) goto _L10; else goto _L9
	//   30   63:iload_2         
	//   31   64:bipush          110
	//   32   66:icmpeq          368
_L9:
		if(i == 114) goto _L12; else goto _L11
	//   33   69:iload_2         
	//   34   70:bipush          114
	//   35   72:icmpeq          365
_L11:
		i;
	//   36   75:iload_2         
		JVM INSTR tableswitch 116 117: default 100
	//	               116 362
	//	               117 145;
	//   37   76:tableswitch     116 117: default 100
	//	               116 362
	//	               117 145
		   goto _L13 _L14 _L15
_L13:
		if(lenient)
	//*  38  100:aload_0         
	//*  39  101:getfield        #60  <Field boolean lenient>
	//*  40  104:ifeq            110
		{
			return (char)i;
	//   41  107:iload_2         
	//   42  108:int2char        
	//   43  109:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   44  110:new             #181 <Class StringBuilder>
	//   45  113:dup             
	//   46  114:invokespecial   #182 <Method void StringBuilder()>
	//   47  117:astore          5
			stringbuilder.append("Invalid escape sequence: \\");
	//   48  119:aload           5
	//   49  121:ldc1            #247 <String "Invalid escape sequence: \\">
	//   50  123:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   51  126:pop             
			stringbuilder.append((char)i);
	//   52  127:aload           5
	//   53  129:iload_2         
	//   54  130:int2char        
	//   55  131:invokevirtual   #197 <Method StringBuilder StringBuilder.append(char)>
	//   56  134:pop             
			throw syntaxError(stringbuilder.toString());
	//   57  135:aload_0         
	//   58  136:aload           5
	//   59  138:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   60  141:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//   61  144:athrow          
		}
_L15:
		if(!source.request(4L)) goto _L17; else goto _L16
	//   62  145:aload_0         
	//   63  146:getfield        #76  <Field BufferedSource source>
	//   64  149:ldc2w           #248 <Long 4L>
	//   65  152:invokeinterface #120 <Method boolean BufferedSource.request(long)>
	//   66  157:ifeq            322
_L16:
		char c;
		i = 0;
	//   67  160:iconst_0        
	//   68  161:istore_2        
		c = '\0';
	//   69  162:iconst_0        
	//   70  163:istore_1        
_L27:
		if(i >= 4) goto _L19; else goto _L18
	//   71  164:iload_2         
	//   72  165:iconst_4        
	//   73  166:icmpge          310
_L18:
		byte byte0;
		char c1;
		byte0 = buffer.getByte(i);
	//   74  169:aload_0         
	//   75  170:getfield        #83  <Field Buffer buffer>
	//   76  173:iload_2         
	//   77  174:i2l             
	//   78  175:invokevirtual   #124 <Method byte Buffer.getByte(long)>
	//   79  178:istore_3        
		c1 = (char)(c << 4);
	//   80  179:iload_1         
	//   81  180:iconst_4        
	//   82  181:ishl            
	//   83  182:int2char        
	//   84  183:istore          4
		if(byte0 < 48 || byte0 > 57) goto _L21; else goto _L20
	//   85  185:iload_3         
	//   86  186:bipush          48
	//   87  188:icmplt          209
	//   88  191:iload_3         
	//   89  192:bipush          57
	//   90  194:icmpgt          209
_L20:
		c = (char)(c1 + (byte0 - 48));
	//   91  197:iload           4
	//   92  199:iload_3         
	//   93  200:bipush          48
	//   94  202:isub            
	//   95  203:iadd            
	//   96  204:int2char        
	//   97  205:istore_1        
		  goto _L22
	//*  98  206:goto            260
_L21:
		if(byte0 < 97 || byte0 > 102) goto _L24; else goto _L23
	//   99  209:iload_3         
	//  100  210:bipush          97
	//  101  212:icmplt          236
	//  102  215:iload_3         
	//  103  216:bipush          102
	//  104  218:icmpgt          236
_L23:
		c = (char)(c1 + ((byte0 - 97) + 10));
	//  105  221:iload           4
	//  106  223:iload_3         
	//  107  224:bipush          97
	//  108  226:isub            
	//  109  227:bipush          10
	//  110  229:iadd            
	//  111  230:iadd            
	//  112  231:int2char        
	//  113  232:istore_1        
		  goto _L22
	//* 114  233:goto            260
_L24:
		if(byte0 < 65 || byte0 > 70) goto _L26; else goto _L25
	//  115  236:iload_3         
	//  116  237:bipush          65
	//  117  239:icmplt          267
	//  118  242:iload_3         
	//  119  243:bipush          70
	//  120  245:icmpgt          267
_L25:
		c = (char)(c1 + ((byte0 - 65) + 10));
	//  121  248:iload           4
	//  122  250:iload_3         
	//  123  251:bipush          65
	//  124  253:isub            
	//  125  254:bipush          10
	//  126  256:iadd            
	//  127  257:iadd            
	//  128  258:int2char        
	//  129  259:istore_1        
_L22:
		i++;
	//  130  260:iload_2         
	//  131  261:iconst_1        
	//  132  262:iadd            
	//  133  263:istore_2        
		  goto _L27
	//* 134  264:goto            164
_L26:
		StringBuilder stringbuilder1 = new StringBuilder();
	//  135  267:new             #181 <Class StringBuilder>
	//  136  270:dup             
	//  137  271:invokespecial   #182 <Method void StringBuilder()>
	//  138  274:astore          5
		stringbuilder1.append("\\u");
	//  139  276:aload           5
	//  140  278:ldc1            #251 <String "\\u">
	//  141  280:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  142  283:pop             
		stringbuilder1.append(buffer.readUtf8(4L));
	//  143  284:aload           5
	//  144  286:aload_0         
	//  145  287:getfield        #83  <Field Buffer buffer>
	//  146  290:ldc2w           #248 <Long 4L>
	//  147  293:invokevirtual   #186 <Method String Buffer.readUtf8(long)>
	//  148  296:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  149  299:pop             
		throw syntaxError(stringbuilder1.toString());
	//  150  300:aload_0         
	//  151  301:aload           5
	//  152  303:invokevirtual   #201 <Method String StringBuilder.toString()>
	//  153  306:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//  154  309:athrow          
_L19:
		buffer.skip(4L);
	//  155  310:aload_0         
	//  156  311:getfield        #83  <Field Buffer buffer>
	//  157  314:ldc2w           #248 <Long 4L>
	//  158  317:invokevirtual   #153 <Method void Buffer.skip(long)>
		return c;
	//  159  320:iload_1         
	//  160  321:ireturn         
_L17:
		StringBuilder stringbuilder2 = new StringBuilder();
	//  161  322:new             #181 <Class StringBuilder>
	//  162  325:dup             
	//  163  326:invokespecial   #182 <Method void StringBuilder()>
	//  164  329:astore          5
		stringbuilder2.append("Unterminated escape sequence at path ");
	//  165  331:aload           5
	//  166  333:ldc1            #253 <String "Unterminated escape sequence at path ">
	//  167  335:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  168  338:pop             
		stringbuilder2.append(getPath());
	//  169  339:aload           5
	//  170  341:aload_0         
	//  171  342:invokevirtual   #242 <Method String getPath()>
	//  172  345:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  173  348:pop             
		throw new EOFException(stringbuilder2.toString());
	//  174  349:new             #168 <Class EOFException>
	//  175  352:dup             
	//  176  353:aload           5
	//  177  355:invokevirtual   #201 <Method String StringBuilder.toString()>
	//  178  358:invokespecial   #171 <Method void EOFException(String)>
	//  179  361:athrow          
_L14:
		return '\t';
	//  180  362:bipush          9
	//  181  364:ireturn         
_L12:
		return '\r';
	//  182  365:bipush          13
	//  183  367:ireturn         
_L10:
		return '\n';
	//  184  368:bipush          10
	//  185  370:ireturn         
_L8:
		return '\f';
	//  186  371:bipush          12
	//  187  373:ireturn         
_L6:
		return '\b';
	//  188  374:bipush          8
	//  189  376:ireturn         
_L4:
		return (char)i;
	//  190  377:iload_2         
	//  191  378:int2char        
	//  192  379:ireturn         
_L2:
		throw syntaxError("Unterminated escape sequence");
	//  193  380:aload_0         
	//  194  381:ldc1            #255 <String "Unterminated escape sequence">
	//  195  383:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//  196  386:athrow          
	}

	private void skipQuotedValue(ByteString bytestring)
		throws IOException
	{
		do
		{
			long l = source.indexOfElement(bytestring);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field BufferedSource source>
	//    2    4:aload_1         
	//    3    5:invokeinterface #177 <Method long BufferedSource.indexOfElement(ByteString)>
	//    4   10:lstore_2        
			if(l != -1L)
	//*   5   11:lload_2         
	//*   6   12:ldc2w           #178 <Long -1L>
	//*   7   15:lcmp            
	//*   8   16:ifeq            61
			{
				if(buffer.getByte(l) == 92)
	//*   9   19:aload_0         
	//*  10   20:getfield        #83  <Field Buffer buffer>
	//*  11   23:lload_2         
	//*  12   24:invokevirtual   #124 <Method byte Buffer.getByte(long)>
	//*  13   27:bipush          92
	//*  14   29:icmpne          50
				{
					buffer.skip(l + 1L);
	//   15   32:aload_0         
	//   16   33:getfield        #83  <Field Buffer buffer>
	//   17   36:lload_2         
	//   18   37:lconst_1        
	//   19   38:ladd            
	//   20   39:invokevirtual   #153 <Method void Buffer.skip(long)>
					readEscapeCharacter();
	//   21   42:aload_0         
	//   22   43:invokespecial   #194 <Method char readEscapeCharacter()>
	//   23   46:pop             
				} else
	//*  24   47:goto            0
				{
					buffer.skip(l + 1L);
	//   25   50:aload_0         
	//   26   51:getfield        #83  <Field Buffer buffer>
	//   27   54:lload_2         
	//   28   55:lconst_1        
	//   29   56:ladd            
	//   30   57:invokevirtual   #153 <Method void Buffer.skip(long)>
					return;
	//   31   60:return          
				}
			} else
			{
				throw syntaxError("Unterminated string");
	//   32   61:aload_0         
	//   33   62:ldc1            #203 <String "Unterminated string">
	//   34   64:invokespecial   #99  <Method JsonEncodingException syntaxError(String)>
	//   35   67:athrow          
			}
		} while(true);
	}

	private boolean skipTo(String s)
		throws IOException
	{
label0:
		do
		{
			boolean flag = source.request(s.length());
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field BufferedSource source>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #221 <Method int String.length()>
	//    4    8:i2l             
	//    5    9:invokeinterface #120 <Method boolean BufferedSource.request(long)>
	//    6   14:istore_3        
			int i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_2        
			if(flag)
	//*   9   17:iload_3         
	//*  10   18:ifeq            66
			{
				do
				{
					if(i >= s.length())
						break;
	//   11   21:iload_2         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #221 <Method int String.length()>
	//   14   26:icmpge          64
					if(buffer.getByte(i) != s.charAt(i))
	//*  15   29:aload_0         
	//*  16   30:getfield        #83  <Field Buffer buffer>
	//*  17   33:iload_2         
	//*  18   34:i2l             
	//*  19   35:invokevirtual   #124 <Method byte Buffer.getByte(long)>
	//*  20   38:aload_1         
	//*  21   39:iload_2         
	//*  22   40:invokevirtual   #225 <Method char String.charAt(int)>
	//*  23   43:icmpeq          57
					{
						buffer.readByte();
	//   24   46:aload_0         
	//   25   47:getfield        #83  <Field Buffer buffer>
	//   26   50:invokevirtual   #112 <Method byte Buffer.readByte()>
	//   27   53:pop             
						continue label0;
	//   28   54:goto            0
					}
					i++;
	//   29   57:iload_2         
	//   30   58:iconst_1        
	//   31   59:iadd            
	//   32   60:istore_2        
				} while(true);
	//   33   61:goto            21
				return true;
	//   34   64:iconst_1        
	//   35   65:ireturn         
			}
			return false;
	//   36   66:iconst_0        
	//   37   67:ireturn         
		} while(true);
	}

	private void skipToEndOfLine()
		throws IOException
	{
		long l = source.indexOfElement(LINEFEED_OR_CARRIAGE_RETURN);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field BufferedSource source>
	//    2    4:getstatic       #53  <Field ByteString LINEFEED_OR_CARRIAGE_RETURN>
	//    3    7:invokeinterface #177 <Method long BufferedSource.indexOfElement(ByteString)>
	//    4   12:lstore_1        
		Buffer buffer1 = buffer;
	//    5   13:aload_0         
	//    6   14:getfield        #83  <Field Buffer buffer>
	//    7   17:astore_3        
		if(l != -1L)
	//*   8   18:lload_1         
	//*   9   19:ldc2w           #178 <Long -1L>
	//*  10   22:lcmp            
	//*  11   23:ifeq            33
			l++;
	//   12   26:lload_1         
	//   13   27:lconst_1        
	//   14   28:ladd            
	//   15   29:lstore_1        
		else
	//*  16   30:goto            38
			l = buffer1.size();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #261 <Method long Buffer.size()>
	//   19   37:lstore_1        
		buffer1.skip(l);
	//   20   38:aload_3         
	//   21   39:lload_1         
	//   22   40:invokevirtual   #153 <Method void Buffer.skip(long)>
	//   23   43:return          
	}

	private void skipUnquotedValue()
		throws IOException
	{
		long l = source.indexOfElement(UNQUOTED_STRING_TERMINALS);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field BufferedSource source>
	//    2    4:getstatic       #49  <Field ByteString UNQUOTED_STRING_TERMINALS>
	//    3    7:invokeinterface #177 <Method long BufferedSource.indexOfElement(ByteString)>
	//    4   12:lstore_1        
		Buffer buffer1 = buffer;
	//    5   13:aload_0         
	//    6   14:getfield        #83  <Field Buffer buffer>
	//    7   17:astore_3        
		if(l == -1L)
	//*   8   18:lload_1         
	//*   9   19:ldc2w           #178 <Long -1L>
	//*  10   22:lcmp            
	//*  11   23:ifeq            29
	//*  12   26:goto            34
			l = buffer1.size();
	//   13   29:aload_3         
	//   14   30:invokevirtual   #261 <Method long Buffer.size()>
	//   15   33:lstore_1        
		buffer1.skip(l);
	//   16   34:aload_3         
	//   17   35:lload_1         
	//   18   36:invokevirtual   #153 <Method void Buffer.skip(long)>
	//   19   39:return          
	}

	private JsonEncodingException syntaxError(String s)
		throws JsonEncodingException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #181 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #182 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(s);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append(" at path ");
	//    8   14:aload_2         
	//    9   15:ldc2            #266 <String " at path ">
	//   10   18:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(getPath());
	//   12   22:aload_2         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #242 <Method String getPath()>
	//   15   27:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		throw new JsonEncodingException(stringbuilder.toString());
	//   17   31:new             #264 <Class JsonEncodingException>
	//   18   34:dup             
	//   19   35:aload_2         
	//   20   36:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   21   39:invokespecial   #267 <Method void JsonEncodingException(String)>
	//   22   42:athrow          
	}

	public void beginArray()
		throws IOException
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #270 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 3)
	//*  10   16:iload_1         
	//*  11   17:iconst_3        
	//*  12   18:icmpne          44
		{
			push(1);
	//   13   21:aload_0         
	//   14   22:iconst_1        
	//   15   23:invokespecial   #272 <Method void push(int)>
			pathIndices[stackSize - 1] = 0;
	//   16   26:aload_0         
	//   17   27:getfield        #74  <Field int[] pathIndices>
	//   18   30:aload_0         
	//   19   31:getfield        #68  <Field int stackSize>
	//   20   34:iconst_1        
	//   21   35:isub            
	//   22   36:iconst_0        
	//   23   37:iastore         
			peeked = 0;
	//   24   38:aload_0         
	//   25   39:iconst_0        
	//   26   40:putfield        #64  <Field int peeked>
			return;
	//   27   43:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   28   44:new             #181 <Class StringBuilder>
	//   29   47:dup             
	//   30   48:invokespecial   #182 <Method void StringBuilder()>
	//   31   51:astore_3        
			stringbuilder.append("Expected BEGIN_ARRAY but was ");
	//   32   52:aload_3         
	//   33   53:ldc2            #274 <String "Expected BEGIN_ARRAY but was ">
	//   34   56:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   35   59:pop             
			stringbuilder.append(((Object) (peek())));
	//   36   60:aload_3         
	//   37   61:aload_0         
	//   38   62:invokevirtual   #278 <Method JsonReader$Token peek()>
	//   39   65:invokevirtual   #281 <Method StringBuilder StringBuilder.append(Object)>
	//   40   68:pop             
			stringbuilder.append(" at path ");
	//   41   69:aload_3         
	//   42   70:ldc2            #266 <String " at path ">
	//   43   73:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   44   76:pop             
			stringbuilder.append(getPath());
	//   45   77:aload_3         
	//   46   78:aload_0         
	//   47   79:invokevirtual   #242 <Method String getPath()>
	//   48   82:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   49   85:pop             
			throw new JsonDataException(stringbuilder.toString());
	//   50   86:new             #244 <Class JsonDataException>
	//   51   89:dup             
	//   52   90:aload_3         
	//   53   91:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   54   94:invokespecial   #245 <Method void JsonDataException(String)>
	//   55   97:athrow          
		}
	}

	public void beginObject()
		throws IOException
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #270 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 1)
	//*  10   16:iload_1         
	//*  11   17:iconst_1        
	//*  12   18:icmpne          32
		{
			push(3);
	//   13   21:aload_0         
	//   14   22:iconst_3        
	//   15   23:invokespecial   #272 <Method void push(int)>
			peeked = 0;
	//   16   26:aload_0         
	//   17   27:iconst_0        
	//   18   28:putfield        #64  <Field int peeked>
			return;
	//   19   31:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   20   32:new             #181 <Class StringBuilder>
	//   21   35:dup             
	//   22   36:invokespecial   #182 <Method void StringBuilder()>
	//   23   39:astore_3        
			stringbuilder.append("Expected BEGIN_OBJECT but was ");
	//   24   40:aload_3         
	//   25   41:ldc2            #284 <String "Expected BEGIN_OBJECT but was ">
	//   26   44:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   27   47:pop             
			stringbuilder.append(((Object) (peek())));
	//   28   48:aload_3         
	//   29   49:aload_0         
	//   30   50:invokevirtual   #278 <Method JsonReader$Token peek()>
	//   31   53:invokevirtual   #281 <Method StringBuilder StringBuilder.append(Object)>
	//   32   56:pop             
			stringbuilder.append(" at path ");
	//   33   57:aload_3         
	//   34   58:ldc2            #266 <String " at path ">
	//   35   61:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   36   64:pop             
			stringbuilder.append(getPath());
	//   37   65:aload_3         
	//   38   66:aload_0         
	//   39   67:invokevirtual   #242 <Method String getPath()>
	//   40   70:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   41   73:pop             
			throw new JsonDataException(stringbuilder.toString());
	//   42   74:new             #244 <Class JsonDataException>
	//   43   77:dup             
	//   44   78:aload_3         
	//   45   79:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   46   82:invokespecial   #245 <Method void JsonDataException(String)>
	//   47   85:athrow          
		}
	}

	public void close()
		throws IOException
	{
		peeked = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #64  <Field int peeked>
		stack[0] = 8;
	//    3    5:aload_0         
	//    4    6:getfield        #66  <Field int[] stack>
	//    5    9:iconst_0        
	//    6   10:bipush          8
	//    7   12:iastore         
		stackSize = 1;
	//    8   13:aload_0         
	//    9   14:iconst_1        
	//   10   15:putfield        #68  <Field int stackSize>
		buffer.clear();
	//   11   18:aload_0         
	//   12   19:getfield        #83  <Field Buffer buffer>
	//   13   22:invokevirtual   #288 <Method void Buffer.clear()>
		source.close();
	//   14   25:aload_0         
	//   15   26:getfield        #76  <Field BufferedSource source>
	//   16   29:invokeinterface #290 <Method void BufferedSource.close()>
	//   17   34:return          
	}

	public void endArray()
		throws IOException
	{
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int peeked>
	//    2    4:istore_2        
		int i = k;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(k == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #270 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 4)
	//*  10   16:iload_1         
	//*  11   17:iconst_4        
	//*  12   18:icmpne          57
		{
			stackSize = stackSize - 1;
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #68  <Field int stackSize>
	//   16   26:iconst_1        
	//   17   27:isub            
	//   18   28:putfield        #68  <Field int stackSize>
			int ai[] = pathIndices;
	//   19   31:aload_0         
	//   20   32:getfield        #74  <Field int[] pathIndices>
	//   21   35:astore_3        
			int j = stackSize - 1;
	//   22   36:aload_0         
	//   23   37:getfield        #68  <Field int stackSize>
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
	//   37   53:putfield        #64  <Field int peeked>
			return;
	//   38   56:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   39   57:new             #181 <Class StringBuilder>
	//   40   60:dup             
	//   41   61:invokespecial   #182 <Method void StringBuilder()>
	//   42   64:astore_3        
			stringbuilder.append("Expected END_ARRAY but was ");
	//   43   65:aload_3         
	//   44   66:ldc2            #293 <String "Expected END_ARRAY but was ">
	//   45   69:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   46   72:pop             
			stringbuilder.append(((Object) (peek())));
	//   47   73:aload_3         
	//   48   74:aload_0         
	//   49   75:invokevirtual   #278 <Method JsonReader$Token peek()>
	//   50   78:invokevirtual   #281 <Method StringBuilder StringBuilder.append(Object)>
	//   51   81:pop             
			stringbuilder.append(" at path ");
	//   52   82:aload_3         
	//   53   83:ldc2            #266 <String " at path ">
	//   54   86:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   55   89:pop             
			stringbuilder.append(getPath());
	//   56   90:aload_3         
	//   57   91:aload_0         
	//   58   92:invokevirtual   #242 <Method String getPath()>
	//   59   95:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   60   98:pop             
			throw new JsonDataException(stringbuilder.toString());
	//   61   99:new             #244 <Class JsonDataException>
	//   62  102:dup             
	//   63  103:aload_3         
	//   64  104:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   65  107:invokespecial   #245 <Method void JsonDataException(String)>
	//   66  110:athrow          
		}
	}

	public void endObject()
		throws IOException
	{
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int peeked>
	//    2    4:istore_2        
		int i = k;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(k == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #270 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 2)
	//*  10   16:iload_1         
	//*  11   17:iconst_2        
	//*  12   18:icmpne          68
		{
			stackSize = stackSize - 1;
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #68  <Field int stackSize>
	//   16   26:iconst_1        
	//   17   27:isub            
	//   18   28:putfield        #68  <Field int stackSize>
			Object aobj[] = ((Object []) (pathNames));
	//   19   31:aload_0         
	//   20   32:getfield        #72  <Field String[] pathNames>
	//   21   35:astore_3        
			int j = stackSize;
	//   22   36:aload_0         
	//   23   37:getfield        #68  <Field int stackSize>
	//   24   40:istore_1        
			aobj[j] = null;
	//   25   41:aload_3         
	//   26   42:iload_1         
	//   27   43:aconst_null     
	//   28   44:aastore         
			aobj = ((Object []) (pathIndices));
	//   29   45:aload_0         
	//   30   46:getfield        #74  <Field int[] pathIndices>
	//   31   49:astore_3        
			j--;
	//   32   50:iload_1         
	//   33   51:iconst_1        
	//   34   52:isub            
	//   35   53:istore_1        
			aobj[j] = aobj[j] + 1;
	//   36   54:aload_3         
	//   37   55:iload_1         
	//   38   56:aload_3         
	//   39   57:iload_1         
	//   40   58:iaload          
	//   41   59:iconst_1        
	//   42   60:iadd            
	//   43   61:iastore         
			peeked = 0;
	//   44   62:aload_0         
	//   45   63:iconst_0        
	//   46   64:putfield        #64  <Field int peeked>
			return;
	//   47   67:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   48   68:new             #181 <Class StringBuilder>
	//   49   71:dup             
	//   50   72:invokespecial   #182 <Method void StringBuilder()>
	//   51   75:astore_3        
			stringbuilder.append("Expected END_OBJECT but was ");
	//   52   76:aload_3         
	//   53   77:ldc2            #296 <String "Expected END_OBJECT but was ">
	//   54   80:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   55   83:pop             
			stringbuilder.append(((Object) (peek())));
	//   56   84:aload_3         
	//   57   85:aload_0         
	//   58   86:invokevirtual   #278 <Method JsonReader$Token peek()>
	//   59   89:invokevirtual   #281 <Method StringBuilder StringBuilder.append(Object)>
	//   60   92:pop             
			stringbuilder.append(" at path ");
	//   61   93:aload_3         
	//   62   94:ldc2            #266 <String " at path ">
	//   63   97:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   64  100:pop             
			stringbuilder.append(getPath());
	//   65  101:aload_3         
	//   66  102:aload_0         
	//   67  103:invokevirtual   #242 <Method String getPath()>
	//   68  106:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   69  109:pop             
			throw new JsonDataException(stringbuilder.toString());
	//   70  110:new             #244 <Class JsonDataException>
	//   71  113:dup             
	//   72  114:aload_3         
	//   73  115:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   74  118:invokespecial   #245 <Method void JsonDataException(String)>
	//   75  121:athrow          
		}
	}

	public String getPath()
	{
		return JsonScope.getPath(stackSize, stack, pathNames, pathIndices);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int stackSize>
	//    2    4:aload_0         
	//    3    5:getfield        #66  <Field int[] stack>
	//    4    8:aload_0         
	//    5    9:getfield        #72  <Field String[] pathNames>
	//    6   12:aload_0         
	//    7   13:getfield        #74  <Field int[] pathIndices>
	//    8   16:invokestatic    #301 <Method String JsonScope.getPath(int, int[], String[], int[])>
	//    9   19:areturn         
	}

	public boolean hasNext()
		throws IOException
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #270 <Method int doPeek()>
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

	public boolean nextBoolean()
		throws IOException
	{
		int k = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int peeked>
	//    2    4:istore_2        
		int i = k;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(k == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #270 <Method int doPeek()>
	//    9   15:istore_1        
		if(i == 5)
	//*  10   16:iload_1         
	//*  11   17:iconst_5        
	//*  12   18:icmpne          48
		{
			peeked = 0;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #64  <Field int peeked>
			int ai[] = pathIndices;
	//   16   26:aload_0         
	//   17   27:getfield        #74  <Field int[] pathIndices>
	//   18   30:astore_3        
			i = stackSize - 1;
	//   19   31:aload_0         
	//   20   32:getfield        #68  <Field int stackSize>
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
	//   39   56:putfield        #64  <Field int peeked>
			int ai1[] = pathIndices;
	//   40   59:aload_0         
	//   41   60:getfield        #74  <Field int[] pathIndices>
	//   42   63:astore_3        
			int j = stackSize - 1;
	//   43   64:aload_0         
	//   44   65:getfield        #68  <Field int stackSize>
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
	//   58   81:new             #181 <Class StringBuilder>
	//   59   84:dup             
	//   60   85:invokespecial   #182 <Method void StringBuilder()>
	//   61   88:astore_3        
			stringbuilder.append("Expected a boolean but was ");
	//   62   89:aload_3         
	//   63   90:ldc2            #306 <String "Expected a boolean but was ">
	//   64   93:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   65   96:pop             
			stringbuilder.append(((Object) (peek())));
	//   66   97:aload_3         
	//   67   98:aload_0         
	//   68   99:invokevirtual   #278 <Method JsonReader$Token peek()>
	//   69  102:invokevirtual   #281 <Method StringBuilder StringBuilder.append(Object)>
	//   70  105:pop             
			stringbuilder.append(" at path ");
	//   71  106:aload_3         
	//   72  107:ldc2            #266 <String " at path ">
	//   73  110:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   74  113:pop             
			stringbuilder.append(getPath());
	//   75  114:aload_3         
	//   76  115:aload_0         
	//   77  116:invokevirtual   #242 <Method String getPath()>
	//   78  119:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   79  122:pop             
			throw new JsonDataException(stringbuilder.toString());
	//   80  123:new             #244 <Class JsonDataException>
	//   81  126:dup             
	//   82  127:aload_3         
	//   83  128:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   84  131:invokespecial   #245 <Method void JsonDataException(String)>
	//   85  134:athrow          
		}
	}

	public String nextName()
		throws IOException
	{
label0:
		{
			int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int peeked>
	//    2    4:istore_2        
			int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
			if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
				i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #270 <Method int doPeek()>
	//    9   15:istore_1        
			String s;
			if(i == 14)
	//*  10   16:iload_1         
	//*  11   17:bipush          14
	//*  12   19:icmpne          30
				s = nextUnquotedValue();
	//   13   22:aload_0         
	//   14   23:invokespecial   #309 <Method String nextUnquotedValue()>
	//   15   26:astore_3        
			else
	//*  16   27:goto            61
			if(i == 13)
	//*  17   30:iload_1         
	//*  18   31:bipush          13
	//*  19   33:icmpne          47
			{
				s = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
	//   20   36:aload_0         
	//   21   37:getstatic       #45  <Field ByteString DOUBLE_QUOTE_OR_SLASH>
	//   22   40:invokespecial   #311 <Method String nextQuotedValue(ByteString)>
	//   23   43:astore_3        
			} else
	//*  24   44:goto            61
			{
				if(i != 12)
					break label0;
	//   25   47:iload_1         
	//   26   48:bipush          12
	//   27   50:icmpne          80
				s = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
	//   28   53:aload_0         
	//   29   54:getstatic       #41  <Field ByteString SINGLE_QUOTE_OR_SLASH>
	//   30   57:invokespecial   #311 <Method String nextQuotedValue(ByteString)>
	//   31   60:astore_3        
			}
			peeked = 0;
	//   32   61:aload_0         
	//   33   62:iconst_0        
	//   34   63:putfield        #64  <Field int peeked>
			pathNames[stackSize - 1] = s;
	//   35   66:aload_0         
	//   36   67:getfield        #72  <Field String[] pathNames>
	//   37   70:aload_0         
	//   38   71:getfield        #68  <Field int stackSize>
	//   39   74:iconst_1        
	//   40   75:isub            
	//   41   76:aload_3         
	//   42   77:aastore         
			return s;
	//   43   78:aload_3         
	//   44   79:areturn         
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   45   80:new             #181 <Class StringBuilder>
	//   46   83:dup             
	//   47   84:invokespecial   #182 <Method void StringBuilder()>
	//   48   87:astore_3        
		stringbuilder.append("Expected a name but was ");
	//   49   88:aload_3         
	//   50   89:ldc2            #313 <String "Expected a name but was ">
	//   51   92:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   52   95:pop             
		stringbuilder.append(((Object) (peek())));
	//   53   96:aload_3         
	//   54   97:aload_0         
	//   55   98:invokevirtual   #278 <Method JsonReader$Token peek()>
	//   56  101:invokevirtual   #281 <Method StringBuilder StringBuilder.append(Object)>
	//   57  104:pop             
		stringbuilder.append(" at path ");
	//   58  105:aload_3         
	//   59  106:ldc2            #266 <String " at path ">
	//   60  109:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   61  112:pop             
		stringbuilder.append(getPath());
	//   62  113:aload_3         
	//   63  114:aload_0         
	//   64  115:invokevirtual   #242 <Method String getPath()>
	//   65  118:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   66  121:pop             
		throw new JsonDataException(stringbuilder.toString());
	//   67  122:new             #244 <Class JsonDataException>
	//   68  125:dup             
	//   69  126:aload_3         
	//   70  127:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   71  130:invokespecial   #245 <Method void JsonDataException(String)>
	//   72  133:athrow          
	}

	public String nextString()
		throws IOException
	{
label0:
		{
			int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int peeked>
	//    2    4:istore_2        
			int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
			if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
				i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #270 <Method int doPeek()>
	//    9   15:istore_1        
			String s;
			if(i == 10)
	//*  10   16:iload_1         
	//*  11   17:bipush          10
	//*  12   19:icmpne          30
				s = nextUnquotedValue();
	//   13   22:aload_0         
	//   14   23:invokespecial   #309 <Method String nextUnquotedValue()>
	//   15   26:astore_3        
			else
	//*  16   27:goto            119
			if(i == 9)
	//*  17   30:iload_1         
	//*  18   31:bipush          9
	//*  19   33:icmpne          47
				s = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
	//   20   36:aload_0         
	//   21   37:getstatic       #45  <Field ByteString DOUBLE_QUOTE_OR_SLASH>
	//   22   40:invokespecial   #311 <Method String nextQuotedValue(ByteString)>
	//   23   43:astore_3        
			else
	//*  24   44:goto            119
			if(i == 8)
	//*  25   47:iload_1         
	//*  26   48:bipush          8
	//*  27   50:icmpne          64
				s = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
	//   28   53:aload_0         
	//   29   54:getstatic       #41  <Field ByteString SINGLE_QUOTE_OR_SLASH>
	//   30   57:invokespecial   #311 <Method String nextQuotedValue(ByteString)>
	//   31   60:astore_3        
			else
	//*  32   61:goto            119
			if(i == 11)
	//*  33   64:iload_1         
	//*  34   65:bipush          11
	//*  35   67:icmpne          83
			{
				s = peekedString;
	//   36   70:aload_0         
	//   37   71:getfield        #316 <Field String peekedString>
	//   38   74:astore_3        
				peekedString = null;
	//   39   75:aload_0         
	//   40   76:aconst_null     
	//   41   77:putfield        #316 <Field String peekedString>
			} else
	//*  42   80:goto            119
			if(i == 15)
	//*  43   83:iload_1         
	//*  44   84:bipush          15
	//*  45   86:icmpne          100
			{
				s = Long.toString(peekedLong);
	//   46   89:aload_0         
	//   47   90:getfield        #233 <Field long peekedLong>
	//   48   93:invokestatic    #320 <Method String Long.toString(long)>
	//   49   96:astore_3        
			} else
	//*  50   97:goto            119
			{
				if(i != 16)
					break label0;
	//   51  100:iload_1         
	//   52  101:bipush          16
	//   53  103:icmpne          149
				s = buffer.readUtf8(peekedNumberLength);
	//   54  106:aload_0         
	//   55  107:getfield        #83  <Field Buffer buffer>
	//   56  110:aload_0         
	//   57  111:getfield        #235 <Field int peekedNumberLength>
	//   58  114:i2l             
	//   59  115:invokevirtual   #186 <Method String Buffer.readUtf8(long)>
	//   60  118:astore_3        
			}
			peeked = 0;
	//   61  119:aload_0         
	//   62  120:iconst_0        
	//   63  121:putfield        #64  <Field int peeked>
			int ai[] = pathIndices;
	//   64  124:aload_0         
	//   65  125:getfield        #74  <Field int[] pathIndices>
	//   66  128:astore          4
			i = stackSize - 1;
	//   67  130:aload_0         
	//   68  131:getfield        #68  <Field int stackSize>
	//   69  134:iconst_1        
	//   70  135:isub            
	//   71  136:istore_1        
			ai[i] = ai[i] + 1;
	//   72  137:aload           4
	//   73  139:iload_1         
	//   74  140:aload           4
	//   75  142:iload_1         
	//   76  143:iaload          
	//   77  144:iconst_1        
	//   78  145:iadd            
	//   79  146:iastore         
			return s;
	//   80  147:aload_3         
	//   81  148:areturn         
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   82  149:new             #181 <Class StringBuilder>
	//   83  152:dup             
	//   84  153:invokespecial   #182 <Method void StringBuilder()>
	//   85  156:astore_3        
		stringbuilder.append("Expected a string but was ");
	//   86  157:aload_3         
	//   87  158:ldc2            #322 <String "Expected a string but was ">
	//   88  161:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   89  164:pop             
		stringbuilder.append(((Object) (peek())));
	//   90  165:aload_3         
	//   91  166:aload_0         
	//   92  167:invokevirtual   #278 <Method JsonReader$Token peek()>
	//   93  170:invokevirtual   #281 <Method StringBuilder StringBuilder.append(Object)>
	//   94  173:pop             
		stringbuilder.append(" at path ");
	//   95  174:aload_3         
	//   96  175:ldc2            #266 <String " at path ">
	//   97  178:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   98  181:pop             
		stringbuilder.append(getPath());
	//   99  182:aload_3         
	//  100  183:aload_0         
	//  101  184:invokevirtual   #242 <Method String getPath()>
	//  102  187:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  103  190:pop             
		throw new JsonDataException(stringbuilder.toString());
	//  104  191:new             #244 <Class JsonDataException>
	//  105  194:dup             
	//  106  195:aload_3         
	//  107  196:invokevirtual   #201 <Method String StringBuilder.toString()>
	//  108  199:invokespecial   #245 <Method void JsonDataException(String)>
	//  109  202:athrow          
	}

	public JsonReader.Token peek()
		throws IOException
	{
		int j = peeked;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int peeked>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			i = doPeek();
	//    7   11:aload_0         
	//    8   12:invokespecial   #270 <Method int doPeek()>
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
	//   12  100:new             #324 <Class AssertionError>
	//   13  103:dup             
	//   14  104:invokespecial   #325 <Method void AssertionError()>
	//   15  107:athrow          

		case 17: // '\021'
			return JsonReader.Token.END_DOCUMENT;
	//   16  108:getstatic       #331 <Field JsonReader$Token JsonReader$Token.END_DOCUMENT>
	//   17  111:areturn         

		case 15: // '\017'
		case 16: // '\020'
			return JsonReader.Token.NUMBER;
	//   18  112:getstatic       #334 <Field JsonReader$Token JsonReader$Token.NUMBER>
	//   19  115:areturn         

		case 12: // '\f'
		case 13: // '\r'
		case 14: // '\016'
			return JsonReader.Token.NAME;
	//   20  116:getstatic       #337 <Field JsonReader$Token JsonReader$Token.NAME>
	//   21  119:areturn         

		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
		case 11: // '\013'
			return JsonReader.Token.STRING;
	//   22  120:getstatic       #340 <Field JsonReader$Token JsonReader$Token.STRING>
	//   23  123:areturn         

		case 7: // '\007'
			return JsonReader.Token.NULL;
	//   24  124:getstatic       #342 <Field JsonReader$Token JsonReader$Token.NULL>
	//   25  127:areturn         

		case 5: // '\005'
		case 6: // '\006'
			return JsonReader.Token.BOOLEAN;
	//   26  128:getstatic       #345 <Field JsonReader$Token JsonReader$Token.BOOLEAN>
	//   27  131:areturn         

		case 4: // '\004'
			return JsonReader.Token.END_ARRAY;
	//   28  132:getstatic       #348 <Field JsonReader$Token JsonReader$Token.END_ARRAY>
	//   29  135:areturn         

		case 3: // '\003'
			return JsonReader.Token.BEGIN_ARRAY;
	//   30  136:getstatic       #351 <Field JsonReader$Token JsonReader$Token.BEGIN_ARRAY>
	//   31  139:areturn         

		case 2: // '\002'
			return JsonReader.Token.END_OBJECT;
	//   32  140:getstatic       #354 <Field JsonReader$Token JsonReader$Token.END_OBJECT>
	//   33  143:areturn         

		case 1: // '\001'
			return JsonReader.Token.BEGIN_OBJECT;
	//   34  144:getstatic       #357 <Field JsonReader$Token JsonReader$Token.BEGIN_OBJECT>
	//   35  147:areturn         
		}
	}

	public void skipValue()
		throws IOException
	{
		if(!failOnUnknown)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field boolean failOnUnknown>
	//*   2    4:ifne            250
		{
			int j = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
			int i;
			do
			{
				i = peeked;
	//    5    9:aload_0         
	//    6   10:getfield        #64  <Field int peeked>
	//    7   13:istore_1        
				int k = i;
	//    8   14:iload_1         
	//    9   15:istore_3        
				if(i == 0)
	//*  10   16:iload_1         
	//*  11   17:ifne            25
					k = doPeek();
	//   12   20:aload_0         
	//   13   21:invokespecial   #270 <Method int doPeek()>
	//   14   24:istore_3        
				if(k == 3)
	//*  15   25:iload_3         
	//*  16   26:iconst_3        
	//*  17   27:icmpne          42
				{
					push(1);
	//   18   30:aload_0         
	//   19   31:iconst_1        
	//   20   32:invokespecial   #272 <Method void push(int)>
					i = j + 1;
	//   21   35:iload_2         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_1        
				} else
	//*  25   39:goto            203
				if(k == 1)
	//*  26   42:iload_3         
	//*  27   43:iconst_1        
	//*  28   44:icmpne          59
				{
					push(3);
	//   29   47:aload_0         
	//   30   48:iconst_3        
	//   31   49:invokespecial   #272 <Method void push(int)>
					i = j + 1;
	//   32   52:iload_2         
	//   33   53:iconst_1        
	//   34   54:iadd            
	//   35   55:istore_1        
				} else
	//*  36   56:goto            203
				if(k == 4)
	//*  37   59:iload_3         
	//*  38   60:iconst_4        
	//*  39   61:icmpne          81
				{
					stackSize = stackSize - 1;
	//   40   64:aload_0         
	//   41   65:aload_0         
	//   42   66:getfield        #68  <Field int stackSize>
	//   43   69:iconst_1        
	//   44   70:isub            
	//   45   71:putfield        #68  <Field int stackSize>
					i = j - 1;
	//   46   74:iload_2         
	//   47   75:iconst_1        
	//   48   76:isub            
	//   49   77:istore_1        
				} else
	//*  50   78:goto            203
				if(k == 2)
	//*  51   81:iload_3         
	//*  52   82:iconst_2        
	//*  53   83:icmpne          103
				{
					stackSize = stackSize - 1;
	//   54   86:aload_0         
	//   55   87:aload_0         
	//   56   88:getfield        #68  <Field int stackSize>
	//   57   91:iconst_1        
	//   58   92:isub            
	//   59   93:putfield        #68  <Field int stackSize>
					i = j - 1;
	//   60   96:iload_2         
	//   61   97:iconst_1        
	//   62   98:isub            
	//   63   99:istore_1        
				} else
	//*  64  100:goto            203
				if(k != 14 && k != 10)
	//*  65  103:iload_3         
	//*  66  104:bipush          14
	//*  67  106:icmpeq          197
	//*  68  109:iload_3         
	//*  69  110:bipush          10
	//*  70  112:icmpne          118
	//*  71  115:goto            197
				{
					if(k != 9 && k != 13)
	//*  72  118:iload_3         
	//*  73  119:bipush          9
	//*  74  121:icmpeq          185
	//*  75  124:iload_3         
	//*  76  125:bipush          13
	//*  77  127:icmpne          133
	//*  78  130:goto            185
					{
						if(k != 8 && k != 12)
	//*  79  133:iload_3         
	//*  80  134:bipush          8
	//*  81  136:icmpeq          173
	//*  82  139:iload_3         
	//*  83  140:bipush          12
	//*  84  142:icmpne          148
	//*  85  145:goto            173
						{
							i = j;
	//   86  148:iload_2         
	//   87  149:istore_1        
							if(k == 16)
	//*  88  150:iload_3         
	//*  89  151:bipush          16
	//*  90  153:icmpne          203
							{
								buffer.skip(peekedNumberLength);
	//   91  156:aload_0         
	//   92  157:getfield        #83  <Field Buffer buffer>
	//   93  160:aload_0         
	//   94  161:getfield        #235 <Field int peekedNumberLength>
	//   95  164:i2l             
	//   96  165:invokevirtual   #153 <Method void Buffer.skip(long)>
								i = j;
	//   97  168:iload_2         
	//   98  169:istore_1        
							}
						} else
	//*  99  170:goto            203
						{
							skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
	//  100  173:aload_0         
	//  101  174:getstatic       #41  <Field ByteString SINGLE_QUOTE_OR_SLASH>
	//  102  177:invokespecial   #360 <Method void skipQuotedValue(ByteString)>
							i = j;
	//  103  180:iload_2         
	//  104  181:istore_1        
						}
					} else
	//* 105  182:goto            203
					{
						skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
	//  106  185:aload_0         
	//  107  186:getstatic       #45  <Field ByteString DOUBLE_QUOTE_OR_SLASH>
	//  108  189:invokespecial   #360 <Method void skipQuotedValue(ByteString)>
						i = j;
	//  109  192:iload_2         
	//  110  193:istore_1        
					}
				} else
	//* 111  194:goto            203
				{
					skipUnquotedValue();
	//  112  197:aload_0         
	//  113  198:invokespecial   #362 <Method void skipUnquotedValue()>
					i = j;
	//  114  201:iload_2         
	//  115  202:istore_1        
				}
				peeked = 0;
	//  116  203:aload_0         
	//  117  204:iconst_0        
	//  118  205:putfield        #64  <Field int peeked>
				j = i;
	//  119  208:iload_1         
	//  120  209:istore_2        
			} while(i != 0);
	//  121  210:iload_1         
	//  122  211:ifne            9
			int ai[] = pathIndices;
	//  123  214:aload_0         
	//  124  215:getfield        #74  <Field int[] pathIndices>
	//  125  218:astore          4
			i = stackSize;
	//  126  220:aload_0         
	//  127  221:getfield        #68  <Field int stackSize>
	//  128  224:istore_1        
			j = i - 1;
	//  129  225:iload_1         
	//  130  226:iconst_1        
	//  131  227:isub            
	//  132  228:istore_2        
			ai[j] = ai[j] + 1;
	//  133  229:aload           4
	//  134  231:iload_2         
	//  135  232:aload           4
	//  136  234:iload_2         
	//  137  235:iaload          
	//  138  236:iconst_1        
	//  139  237:iadd            
	//  140  238:iastore         
			pathNames[i - 1] = "null";
	//  141  239:aload_0         
	//  142  240:getfield        #72  <Field String[] pathNames>
	//  143  243:iload_1         
	//  144  244:iconst_1        
	//  145  245:isub            
	//  146  246:ldc1            #208 <String "null">
	//  147  248:aastore         
			return;
	//  148  249:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  149  250:new             #181 <Class StringBuilder>
	//  150  253:dup             
	//  151  254:invokespecial   #182 <Method void StringBuilder()>
	//  152  257:astore          4
			stringbuilder.append("Cannot skip unexpected ");
	//  153  259:aload           4
	//  154  261:ldc2            #364 <String "Cannot skip unexpected ">
	//  155  264:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  156  267:pop             
			stringbuilder.append(((Object) (peek())));
	//  157  268:aload           4
	//  158  270:aload_0         
	//  159  271:invokevirtual   #278 <Method JsonReader$Token peek()>
	//  160  274:invokevirtual   #281 <Method StringBuilder StringBuilder.append(Object)>
	//  161  277:pop             
			stringbuilder.append(" at ");
	//  162  278:aload           4
	//  163  280:ldc2            #366 <String " at ">
	//  164  283:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  165  286:pop             
			stringbuilder.append(getPath());
	//  166  287:aload           4
	//  167  289:aload_0         
	//  168  290:invokevirtual   #242 <Method String getPath()>
	//  169  293:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  170  296:pop             
			throw new JsonDataException(stringbuilder.toString());
	//  171  297:new             #244 <Class JsonDataException>
	//  172  300:dup             
	//  173  301:aload           4
	//  174  303:invokevirtual   #201 <Method String StringBuilder.toString()>
	//  175  306:invokespecial   #245 <Method void JsonDataException(String)>
	//  176  309:athrow          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #181 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #182 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("JsonReader(");
	//    4    8:aload_1         
	//    5    9:ldc2            #368 <String "JsonReader(">
	//    6   12:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object) (source)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #76  <Field BufferedSource source>
	//   11   21:invokevirtual   #281 <Method StringBuilder StringBuilder.append(Object)>
	//   12   24:pop             
		stringbuilder.append(")");
	//   13   25:aload_1         
	//   14   26:ldc2            #370 <String ")">
	//   15   29:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		return stringbuilder.toString();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   19   37:areturn         
	}

	private static final ByteString DOUBLE_QUOTE_OR_SLASH = ByteString.encodeUtf8("\"\\");
	private static final ByteString LINEFEED_OR_CARRIAGE_RETURN = ByteString.encodeUtf8("\n\r");
	private static final ByteString SINGLE_QUOTE_OR_SLASH = ByteString.encodeUtf8("'\\");
	private static final ByteString UNQUOTED_STRING_TERMINALS = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
	private final Buffer buffer;
	private boolean failOnUnknown;
	private boolean lenient;
	private final int pathIndices[] = new int[32];
	private final String pathNames[] = new String[32];
	private int peeked;
	private long peekedLong;
	private int peekedNumberLength;
	private String peekedString;
	private final BufferedSource source;
	private final int stack[] = new int[32];
	private int stackSize;

	static 
	{
	//    0    0:ldc1            #33  <String "'\\">
	//    1    2:invokestatic    #39  <Method ByteString ByteString.encodeUtf8(String)>
	//    2    5:putstatic       #41  <Field ByteString SINGLE_QUOTE_OR_SLASH>
	//    3    8:ldc1            #43  <String "\"\\">
	//    4   10:invokestatic    #39  <Method ByteString ByteString.encodeUtf8(String)>
	//    5   13:putstatic       #45  <Field ByteString DOUBLE_QUOTE_OR_SLASH>
	//    6   16:ldc1            #47  <String "{}[]:, \n\t\r\f/\\;#=">
	//    7   18:invokestatic    #39  <Method ByteString ByteString.encodeUtf8(String)>
	//    8   21:putstatic       #49  <Field ByteString UNQUOTED_STRING_TERMINALS>
	//    9   24:ldc1            #51  <String "\n\r">
	//   10   26:invokestatic    #39  <Method ByteString ByteString.encodeUtf8(String)>
	//   11   29:putstatic       #53  <Field ByteString LINEFEED_OR_CARRIAGE_RETURN>
	//*  12   32:return          
	}
}
