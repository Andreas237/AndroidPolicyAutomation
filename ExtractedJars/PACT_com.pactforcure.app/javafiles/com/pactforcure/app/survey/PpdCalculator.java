// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import java.util.Map;

// Referenced classes of package com.pactforcure.app.survey:
//			Answer

public class PpdCalculator
{

	public PpdCalculator(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		answers = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Map answers>
	//    5    9:aload_0         
	//    6   10:bipush          10
	//    7   12:anewarray       Object[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:iconst_5        
	//   11   18:anewarray       Object[]
	//   12   21:dup             
	//   13   22:iconst_0        
	//   14   23:ldc1            #18  <String "EPDS07">
	//   15   25:aastore         
	//   16   26:dup             
	//   17   27:iconst_1        
	//   18   28:iconst_0        
	//   19   29:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//   20   32:aastore         
	//   21   33:dup             
	//   22   34:iconst_2        
	//   23   35:iconst_1        
	//   24   36:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//   25   39:aastore         
	//   26   40:dup             
	//   27   41:iconst_3        
	//   28   42:iconst_2        
	//   29   43:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//   30   46:aastore         
	//   31   47:dup             
	//   32   48:iconst_4        
	//   33   49:iconst_3        
	//   34   50:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//   35   53:aastore         
	//   36   54:aastore         
	//   37   55:dup             
	//   38   56:iconst_1        
	//   39   57:iconst_5        
	//   40   58:anewarray       Object[]
	//   41   61:dup             
	//   42   62:iconst_0        
	//   43   63:ldc1            #26  <String "EPDS08">
	//   44   65:aastore         
	//   45   66:dup             
	//   46   67:iconst_1        
	//   47   68:iconst_0        
	//   48   69:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//   49   72:aastore         
	//   50   73:dup             
	//   51   74:iconst_2        
	//   52   75:iconst_1        
	//   53   76:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//   54   79:aastore         
	//   55   80:dup             
	//   56   81:iconst_3        
	//   57   82:iconst_2        
	//   58   83:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//   59   86:aastore         
	//   60   87:dup             
	//   61   88:iconst_4        
	//   62   89:iconst_3        
	//   63   90:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//   64   93:aastore         
	//   65   94:aastore         
	//   66   95:dup             
	//   67   96:iconst_2        
	//   68   97:iconst_5        
	//   69   98:anewarray       Object[]
	//   70  101:dup             
	//   71  102:iconst_0        
	//   72  103:ldc1            #28  <String "EPDS09">
	//   73  105:aastore         
	//   74  106:dup             
	//   75  107:iconst_1        
	//   76  108:iconst_3        
	//   77  109:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//   78  112:aastore         
	//   79  113:dup             
	//   80  114:iconst_2        
	//   81  115:iconst_2        
	//   82  116:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//   83  119:aastore         
	//   84  120:dup             
	//   85  121:iconst_3        
	//   86  122:iconst_1        
	//   87  123:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//   88  126:aastore         
	//   89  127:dup             
	//   90  128:iconst_4        
	//   91  129:iconst_0        
	//   92  130:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//   93  133:aastore         
	//   94  134:aastore         
	//   95  135:dup             
	//   96  136:iconst_3        
	//   97  137:iconst_5        
	//   98  138:anewarray       Object[]
	//   99  141:dup             
	//  100  142:iconst_0        
	//  101  143:ldc1            #30  <String "EPDS10">
	//  102  145:aastore         
	//  103  146:dup             
	//  104  147:iconst_1        
	//  105  148:iconst_3        
	//  106  149:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  107  152:aastore         
	//  108  153:dup             
	//  109  154:iconst_2        
	//  110  155:iconst_2        
	//  111  156:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  112  159:aastore         
	//  113  160:dup             
	//  114  161:iconst_3        
	//  115  162:iconst_1        
	//  116  163:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  117  166:aastore         
	//  118  167:dup             
	//  119  168:iconst_4        
	//  120  169:iconst_0        
	//  121  170:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  122  173:aastore         
	//  123  174:aastore         
	//  124  175:dup             
	//  125  176:iconst_4        
	//  126  177:iconst_5        
	//  127  178:anewarray       Object[]
	//  128  181:dup             
	//  129  182:iconst_0        
	//  130  183:ldc1            #32  <String "EPDS11">
	//  131  185:aastore         
	//  132  186:dup             
	//  133  187:iconst_1        
	//  134  188:iconst_3        
	//  135  189:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  136  192:aastore         
	//  137  193:dup             
	//  138  194:iconst_2        
	//  139  195:iconst_2        
	//  140  196:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  141  199:aastore         
	//  142  200:dup             
	//  143  201:iconst_3        
	//  144  202:iconst_1        
	//  145  203:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  146  206:aastore         
	//  147  207:dup             
	//  148  208:iconst_4        
	//  149  209:iconst_0        
	//  150  210:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  151  213:aastore         
	//  152  214:aastore         
	//  153  215:dup             
	//  154  216:iconst_5        
	//  155  217:iconst_5        
	//  156  218:anewarray       Object[]
	//  157  221:dup             
	//  158  222:iconst_0        
	//  159  223:ldc1            #34  <String "EPDS12">
	//  160  225:aastore         
	//  161  226:dup             
	//  162  227:iconst_1        
	//  163  228:iconst_3        
	//  164  229:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  165  232:aastore         
	//  166  233:dup             
	//  167  234:iconst_2        
	//  168  235:iconst_2        
	//  169  236:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  170  239:aastore         
	//  171  240:dup             
	//  172  241:iconst_3        
	//  173  242:iconst_1        
	//  174  243:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  175  246:aastore         
	//  176  247:dup             
	//  177  248:iconst_4        
	//  178  249:iconst_0        
	//  179  250:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  180  253:aastore         
	//  181  254:aastore         
	//  182  255:dup             
	//  183  256:bipush          6
	//  184  258:iconst_5        
	//  185  259:anewarray       Object[]
	//  186  262:dup             
	//  187  263:iconst_0        
	//  188  264:ldc1            #36  <String "EPDS13">
	//  189  266:aastore         
	//  190  267:dup             
	//  191  268:iconst_1        
	//  192  269:iconst_3        
	//  193  270:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  194  273:aastore         
	//  195  274:dup             
	//  196  275:iconst_2        
	//  197  276:iconst_2        
	//  198  277:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  199  280:aastore         
	//  200  281:dup             
	//  201  282:iconst_3        
	//  202  283:iconst_1        
	//  203  284:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  204  287:aastore         
	//  205  288:dup             
	//  206  289:iconst_4        
	//  207  290:iconst_0        
	//  208  291:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  209  294:aastore         
	//  210  295:aastore         
	//  211  296:dup             
	//  212  297:bipush          7
	//  213  299:iconst_5        
	//  214  300:anewarray       Object[]
	//  215  303:dup             
	//  216  304:iconst_0        
	//  217  305:ldc1            #38  <String "EPDS14">
	//  218  307:aastore         
	//  219  308:dup             
	//  220  309:iconst_1        
	//  221  310:iconst_3        
	//  222  311:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  223  314:aastore         
	//  224  315:dup             
	//  225  316:iconst_2        
	//  226  317:iconst_2        
	//  227  318:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  228  321:aastore         
	//  229  322:dup             
	//  230  323:iconst_3        
	//  231  324:iconst_1        
	//  232  325:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  233  328:aastore         
	//  234  329:dup             
	//  235  330:iconst_4        
	//  236  331:iconst_0        
	//  237  332:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  238  335:aastore         
	//  239  336:aastore         
	//  240  337:dup             
	//  241  338:bipush          8
	//  242  340:iconst_5        
	//  243  341:anewarray       Object[]
	//  244  344:dup             
	//  245  345:iconst_0        
	//  246  346:ldc1            #40  <String "EPDS15">
	//  247  348:aastore         
	//  248  349:dup             
	//  249  350:iconst_1        
	//  250  351:iconst_3        
	//  251  352:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  252  355:aastore         
	//  253  356:dup             
	//  254  357:iconst_2        
	//  255  358:iconst_2        
	//  256  359:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  257  362:aastore         
	//  258  363:dup             
	//  259  364:iconst_3        
	//  260  365:iconst_1        
	//  261  366:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  262  369:aastore         
	//  263  370:dup             
	//  264  371:iconst_4        
	//  265  372:iconst_0        
	//  266  373:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  267  376:aastore         
	//  268  377:aastore         
	//  269  378:dup             
	//  270  379:bipush          9
	//  271  381:iconst_5        
	//  272  382:anewarray       Object[]
	//  273  385:dup             
	//  274  386:iconst_0        
	//  275  387:ldc1            #42  <String "EPDS16">
	//  276  389:aastore         
	//  277  390:dup             
	//  278  391:iconst_1        
	//  279  392:iconst_3        
	//  280  393:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  281  396:aastore         
	//  282  397:dup             
	//  283  398:iconst_2        
	//  284  399:iconst_2        
	//  285  400:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  286  403:aastore         
	//  287  404:dup             
	//  288  405:iconst_3        
	//  289  406:iconst_1        
	//  290  407:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  291  410:aastore         
	//  292  411:dup             
	//  293  412:iconst_4        
	//  294  413:iconst_0        
	//  295  414:invokestatic    #24  <Method Integer Integer.valueOf(int)>
	//  296  417:aastore         
	//  297  418:aastore         
	//  298  419:putfield        #44  <Field Object[] allScoreValues>
	//  299  422:return          
	}

	public boolean ppdCase(int i)
	{
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
			boolean flag = flag1;
	//    2    2:iload_3         
	//    3    3:istore_2        
			if(i >= 13)
	//*   4    4:iload_1         
	//*   5    5:bipush          13
	//*   6    7:icmplt          226
			{
				Object obj = ((Object) ((Answer)answers.get("EPDS05")));
	//    7   10:aload_0         
	//    8   11:getfield        #16  <Field Map answers>
	//    9   14:ldc1            #51  <String "EPDS05">
	//   10   16:invokeinterface #57  <Method Object Map.get(Object)>
	//   11   21:checkcast       #59  <Class Answer>
	//   12   24:astore          4
				flag = flag1;
	//   13   26:iload_3         
	//   14   27:istore_2        
				if(obj != null)
	//*  15   28:aload           4
	//*  16   30:ifnull          226
				{
					obj = ((Object) (((Answer) (obj)).getValue()));
	//   17   33:aload           4
	//   18   35:invokevirtual   #63  <Method String Answer.getValue()>
	//   19   38:astore          4
					flag = flag1;
	//   20   40:iload_3         
	//   21   41:istore_2        
					if(!((String) (obj)).equals("moreThanThreeMonths"))
	//*  22   42:aload           4
	//*  23   44:ldc1            #65  <String "moreThanThreeMonths">
	//*  24   46:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  25   49:ifne            226
					{
						flag = flag1;
	//   26   52:iload_3         
	//   27   53:istore_2        
						if(!((String) (obj)).equals("beforeThisPregnancyStarted"))
	//*  28   54:aload           4
	//*  29   56:ldc1            #73  <String "beforeThisPregnancyStarted">
	//*  30   58:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  31   61:ifne            226
						{
							Object obj2 = ((Object) ((Answer)answers.get("EPDS06")));
	//   32   64:aload_0         
	//   33   65:getfield        #16  <Field Map answers>
	//   34   68:ldc1            #75  <String "EPDS06">
	//   35   70:invokeinterface #57  <Method Object Map.get(Object)>
	//   36   75:checkcast       #59  <Class Answer>
	//   37   78:astore          5
							Object obj4 = ((Object) ((Answer)answers.get("EPDS21")));
	//   38   80:aload_0         
	//   39   81:getfield        #16  <Field Map answers>
	//   40   84:ldc1            #77  <String "EPDS21">
	//   41   86:invokeinterface #57  <Method Object Map.get(Object)>
	//   42   91:checkcast       #59  <Class Answer>
	//   43   94:astore          7
							Object obj3 = ((Object) ((Answer)answers.get("EPDS22")));
	//   44   96:aload_0         
	//   45   97:getfield        #16  <Field Map answers>
	//   46  100:ldc1            #79  <String "EPDS22">
	//   47  102:invokeinterface #57  <Method Object Map.get(Object)>
	//   48  107:checkcast       #59  <Class Answer>
	//   49  110:astore          6
							Object obj1 = ((Object) ((Answer)answers.get("EPDS23")));
	//   50  112:aload_0         
	//   51  113:getfield        #16  <Field Map answers>
	//   52  116:ldc1            #81  <String "EPDS23">
	//   53  118:invokeinterface #57  <Method Object Map.get(Object)>
	//   54  123:checkcast       #59  <Class Answer>
	//   55  126:astore          4
							flag = flag1;
	//   56  128:iload_3         
	//   57  129:istore_2        
							if(obj2 != null)
	//*  58  130:aload           5
	//*  59  132:ifnull          226
							{
								flag = flag1;
	//   60  135:iload_3         
	//   61  136:istore_2        
								if(obj4 != null)
	//*  62  137:aload           7
	//*  63  139:ifnull          226
								{
									flag = flag1;
	//   64  142:iload_3         
	//   65  143:istore_2        
									if(obj3 != null)
	//*  66  144:aload           6
	//*  67  146:ifnull          226
									{
										flag = flag1;
	//   68  149:iload_3         
	//   69  150:istore_2        
										if(obj1 != null)
	//*  70  151:aload           4
	//*  71  153:ifnull          226
										{
											obj2 = ((Object) (((Answer) (obj2)).getValue()));
	//   72  156:aload           5
	//   73  158:invokevirtual   #63  <Method String Answer.getValue()>
	//   74  161:astore          5
											obj4 = ((Object) (((Answer) (obj4)).getValue()));
	//   75  163:aload           7
	//   76  165:invokevirtual   #63  <Method String Answer.getValue()>
	//   77  168:astore          7
											obj3 = ((Object) (((Answer) (obj3)).getValue()));
	//   78  170:aload           6
	//   79  172:invokevirtual   #63  <Method String Answer.getValue()>
	//   80  175:astore          6
											obj1 = ((Object) (((Answer) (obj1)).getValue()));
	//   81  177:aload           4
	//   82  179:invokevirtual   #63  <Method String Answer.getValue()>
	//   83  182:astore          4
											if(((String) (obj2)).equals("lessThanTwoWeeks") || !((String) (obj4)).equals("0") || !((String) (obj3)).equals("0") || !((String) (obj1)).equals("0"))
												break label0;
	//   84  184:aload           5
	//   85  186:ldc1            #83  <String "lessThanTwoWeeks">
	//   86  188:invokevirtual   #71  <Method boolean String.equals(Object)>
	//   87  191:ifne            228
	//   88  194:aload           7
	//   89  196:ldc1            #85  <String "0">
	//   90  198:invokevirtual   #71  <Method boolean String.equals(Object)>
	//   91  201:ifeq            228
	//   92  204:aload           6
	//   93  206:ldc1            #85  <String "0">
	//   94  208:invokevirtual   #71  <Method boolean String.equals(Object)>
	//   95  211:ifeq            228
	//   96  214:aload           4
	//   97  216:ldc1            #85  <String "0">
	//   98  218:invokevirtual   #71  <Method boolean String.equals(Object)>
	//   99  221:ifeq            228
											flag = true;
	//  100  224:iconst_1        
	//  101  225:istore_2        
										}
									}
								}
							}
						}
					}
				}
			}
			return flag;
	//  102  226:iload_2         
	//  103  227:ireturn         
		}
		return false;
	//  104  228:iconst_0        
	//  105  229:ireturn         
	}

	public boolean ppdPossible()
	{
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
			Object obj1 = ((Object) ((Answer)answers.get("PP2")));
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field Map answers>
	//    4    6:ldc1            #89  <String "PP2">
	//    5    8:invokeinterface #57  <Method Object Map.get(Object)>
	//    6   13:checkcast       #59  <Class Answer>
	//    7   16:astore          4
			Object obj2 = ((Object) ((Answer)answers.get("PP3")));
	//    8   18:aload_0         
	//    9   19:getfield        #16  <Field Map answers>
	//   10   22:ldc1            #91  <String "PP3">
	//   11   24:invokeinterface #57  <Method Object Map.get(Object)>
	//   12   29:checkcast       #59  <Class Answer>
	//   13   32:astore          5
			Object obj = ((Object) ((Answer)answers.get("PP4")));
	//   14   34:aload_0         
	//   15   35:getfield        #16  <Field Map answers>
	//   16   38:ldc1            #93  <String "PP4">
	//   17   40:invokeinterface #57  <Method Object Map.get(Object)>
	//   18   45:checkcast       #59  <Class Answer>
	//   19   48:astore_3        
			boolean flag = flag1;
	//   20   49:iload_2         
	//   21   50:istore_1        
			if(obj1 != null)
	//*  22   51:aload           4
	//*  23   53:ifnull          119
			{
				flag = flag1;
	//   24   56:iload_2         
	//   25   57:istore_1        
				if(obj2 != null)
	//*  26   58:aload           5
	//*  27   60:ifnull          119
				{
					flag = flag1;
	//   28   63:iload_2         
	//   29   64:istore_1        
					if(obj != null)
	//*  30   65:aload_3         
	//*  31   66:ifnull          119
					{
						obj1 = ((Object) (((Answer) (obj1)).getValue()));
	//   32   69:aload           4
	//   33   71:invokevirtual   #63  <Method String Answer.getValue()>
	//   34   74:astore          4
						obj2 = ((Object) (((Answer) (obj2)).getValue()));
	//   35   76:aload           5
	//   36   78:invokevirtual   #63  <Method String Answer.getValue()>
	//   37   81:astore          5
						obj = ((Object) (((Answer) (obj)).getValue()));
	//   38   83:aload_3         
	//   39   84:invokevirtual   #63  <Method String Answer.getValue()>
	//   40   87:astore_3        
						if(!((String) (obj1)).equals("1") && !((String) (obj2)).equals("1") && !((String) (obj)).equals("1"))
							break label0;
	//   41   88:aload           4
	//   42   90:ldc1            #95  <String "1">
	//   43   92:invokevirtual   #71  <Method boolean String.equals(Object)>
	//   44   95:ifne            117
	//   45   98:aload           5
	//   46  100:ldc1            #95  <String "1">
	//   47  102:invokevirtual   #71  <Method boolean String.equals(Object)>
	//   48  105:ifne            117
	//   49  108:aload_3         
	//   50  109:ldc1            #95  <String "1">
	//   51  111:invokevirtual   #71  <Method boolean String.equals(Object)>
	//   52  114:ifeq            121
						flag = true;
	//   53  117:iconst_1        
	//   54  118:istore_1        
					}
				}
			}
			return flag;
	//   55  119:iload_1         
	//   56  120:ireturn         
		}
		return false;
	//   57  121:iconst_0        
	//   58  122:ireturn         
	}

	public int score()
	{
		int j;
		byte byte0;
		int k;
		Object aobj[];
		byte0 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		aobj = allScoreValues;
	//    2    2:aload_0         
	//    3    3:getfield        #44  <Field Object[] allScoreValues>
	//    4    6:astore          5
		k = aobj.length;
	//    5    8:aload           5
	//    6   10:arraylength     
	//    7   11:istore          4
		j = 0;
	//    8   13:iconst_0        
	//    9   14:istore_2        
_L16:
		if(j >= k) goto _L2; else goto _L1
	//   10   15:iload_2         
	//   11   16:iload           4
	//   12   18:icmpge          287
_L1:
		int i;
		Object aobj1[];
		Object obj;
		aobj1 = (Object[])(Object[])aobj[j];
	//   13   21:aload           5
	//   14   23:iload_2         
	//   15   24:aaload          
	//   16   25:checkcast       #98  <Class Object[]>
	//   17   28:checkcast       #98  <Class Object[]>
	//   18   31:astore          6
		obj = ((Object) ((String)aobj1[0]));
	//   19   33:aload           6
	//   20   35:iconst_0        
	//   21   36:aaload          
	//   22   37:checkcast       #67  <Class String>
	//   23   40:astore          7
		obj = ((Object) ((Answer)answers.get(obj)));
	//   24   42:aload_0         
	//   25   43:getfield        #16  <Field Map answers>
	//   26   46:aload           7
	//   27   48:invokeinterface #57  <Method Object Map.get(Object)>
	//   28   53:checkcast       #59  <Class Answer>
	//   29   56:astore          7
		i = ((int) (byte0));
	//   30   58:iload_3         
	//   31   59:istore_1        
		if(obj == null) goto _L4; else goto _L3
	//   32   60:aload           7
	//   33   62:ifnull          154
_L3:
		obj = ((Object) (((Answer) (obj)).getValue()));
	//   34   65:aload           7
	//   35   67:invokevirtual   #63  <Method String Answer.getValue()>
	//   36   70:astore          7
		i = -1;
	//   37   72:iconst_m1       
	//   38   73:istore_1        
		((String) (obj)).hashCode();
	//   39   74:aload           7
	//   40   76:invokevirtual   #101 <Method int String.hashCode()>
		JVM INSTR lookupswitch 4: default 120
	//	               -938165841: 193
	//	               -564852014: 178
	//	               104712844: 208
	//	               105664230: 163;
	//   41   79:lookupswitch    4: default 120
	//	               -938165841: 193
	//	               -564852014: 178
	//	               104712844: 208
	//	               105664230: 163
		   goto _L5 _L6 _L7 _L8 _L9
_L5:
		i;
	//   42  120:iload_1         
		JVM INSTR tableswitch 0 3: default 152
	//	               0 223
	//	               1 239
	//	               2 255
	//	               3 271;
	//   43  121:tableswitch     0 3: default 152
	//	               0 223
	//	               1 239
	//	               2 255
	//	               3 271
		   goto _L10 _L11 _L12 _L13 _L14
_L10:
		i = ((int) (byte0));
	//   44  152:iload_3         
	//   45  153:istore_1        
_L4:
		j++;
	//   46  154:iload_2         
	//   47  155:iconst_1        
	//   48  156:iadd            
	//   49  157:istore_2        
		byte0 = ((byte) (i));
	//   50  158:iload_1         
	//   51  159:istore_3        
		continue; /* Loop/switch isn't completed */
	//   52  160:goto            15
_L9:
		if(((String) (obj)).equals("often"))
	//*  53  163:aload           7
	//*  54  165:ldc1            #103 <String "often">
	//*  55  167:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  56  170:ifeq            120
			i = 0;
	//   57  173:iconst_0        
	//   58  174:istore_1        
		  goto _L5
	//*  59  175:goto            120
_L7:
		if(((String) (obj)).equals("sometimes"))
	//*  60  178:aload           7
	//*  61  180:ldc1            #105 <String "sometimes">
	//*  62  182:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  63  185:ifeq            120
			i = 1;
	//   64  188:iconst_1        
	//   65  189:istore_1        
		  goto _L5
	//*  66  190:goto            120
_L6:
		if(((String) (obj)).equals("rarely"))
	//*  67  193:aload           7
	//*  68  195:ldc1            #107 <String "rarely">
	//*  69  197:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  70  200:ifeq            120
			i = 2;
	//   71  203:iconst_2        
	//   72  204:istore_1        
		  goto _L5
	//*  73  205:goto            120
_L8:
		if(((String) (obj)).equals("never"))
	//*  74  208:aload           7
	//*  75  210:ldc1            #109 <String "never">
	//*  76  212:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  77  215:ifeq            120
			i = 3;
	//   78  218:iconst_3        
	//   79  219:istore_1        
		  goto _L5
	//*  80  220:goto            120
_L11:
		i = byte0 + ((Integer)aobj1[1]).intValue();
	//   81  223:iload_3         
	//   82  224:aload           6
	//   83  226:iconst_1        
	//   84  227:aaload          
	//   85  228:checkcast       #20  <Class Integer>
	//   86  231:invokevirtual   #112 <Method int Integer.intValue()>
	//   87  234:iadd            
	//   88  235:istore_1        
		  goto _L4
	//*  89  236:goto            154
_L12:
		i = byte0 + ((Integer)aobj1[2]).intValue();
	//   90  239:iload_3         
	//   91  240:aload           6
	//   92  242:iconst_2        
	//   93  243:aaload          
	//   94  244:checkcast       #20  <Class Integer>
	//   95  247:invokevirtual   #112 <Method int Integer.intValue()>
	//   96  250:iadd            
	//   97  251:istore_1        
		  goto _L4
	//*  98  252:goto            154
_L13:
		i = byte0 + ((Integer)aobj1[3]).intValue();
	//   99  255:iload_3         
	//  100  256:aload           6
	//  101  258:iconst_3        
	//  102  259:aaload          
	//  103  260:checkcast       #20  <Class Integer>
	//  104  263:invokevirtual   #112 <Method int Integer.intValue()>
	//  105  266:iadd            
	//  106  267:istore_1        
		  goto _L4
	//* 107  268:goto            154
_L14:
		i = byte0 + ((Integer)aobj1[4]).intValue();
	//  108  271:iload_3         
	//  109  272:aload           6
	//  110  274:iconst_4        
	//  111  275:aaload          
	//  112  276:checkcast       #20  <Class Integer>
	//  113  279:invokevirtual   #112 <Method int Integer.intValue()>
	//  114  282:iadd            
	//  115  283:istore_1        
		  goto _L4
	//* 116  284:goto            154
_L2:
		return ((int) (byte0));
	//  117  287:iload_3         
	//  118  288:ireturn         
		if(true) goto _L16; else goto _L15
_L15:
	}

	private Object allScoreValues[] = {
		new Object[] {
			"EPDS07", Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)
		}, new Object[] {
			"EPDS08", Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)
		}, new Object[] {
			"EPDS09", Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0)
		}, new Object[] {
			"EPDS10", Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0)
		}, new Object[] {
			"EPDS11", Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0)
		}, new Object[] {
			"EPDS12", Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0)
		}, new Object[] {
			"EPDS13", Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0)
		}, new Object[] {
			"EPDS14", Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0)
		}, new Object[] {
			"EPDS15", Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0)
		}, new Object[] {
			"EPDS16", Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0)
		}
	};
	private Map answers;
}
