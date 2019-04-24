// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.util.HashMap;
import java.util.StringTokenizer;

public class WebColors extends HashMap
{

	public WebColors()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #307 <Method void HashMap()>
	//    2    4:return          
	}

	private static int getRGBChannelValue(String s)
	{
		if(s.endsWith("%"))
	//*   0    0:aload_0         
	//*   1    1:ldc2            #311 <String "%">
	//*   2    4:invokevirtual   #317 <Method boolean String.endsWith(String)>
	//*   3    7:ifeq            32
			return (Integer.parseInt(s.substring(0, s.length() - 1)) * 255) / 100;
	//    4   10:aload_0         
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:invokevirtual   #321 <Method int String.length()>
	//    8   16:iconst_1        
	//    9   17:isub            
	//   10   18:invokevirtual   #325 <Method String String.substring(int, int)>
	//   11   21:invokestatic    #330 <Method int Integer.parseInt(String)>
	//   12   24:sipush          255
	//   13   27:imul            
	//   14   28:bipush          100
	//   15   30:idiv            
	//   16   31:ireturn         
		else
			return Integer.parseInt(s);
	//   17   32:aload_0         
	//   18   33:invokestatic    #330 <Method int Integer.parseInt(String)>
	//   19   36:ireturn         
	}

	public static BaseColor getRGBColor(String s)
	{
		int ai[] = new int[4];
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:astore          4
		int[] _tmp = ai;
	//    3    5:aload           4
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:iconst_0        
	//    7   10:iastore         
	//    8   11:dup             
	//    9   12:iconst_1        
	//   10   13:iconst_0        
	//   11   14:iastore         
	//   12   15:dup             
	//   13   16:iconst_2        
	//   14   17:iconst_0        
	//   15   18:iastore         
	//   16   19:dup             
	//   17   20:iconst_3        
	//   18   21:sipush          255
	//   19   24:iastore         
	//   20   25:pop             
		ai[0] = 0;
		ai[1] = 0;
		ai[2] = 0;
		ai[3] = 255;
		String s1 = s.toLowerCase();
	//   21   26:aload_0         
	//   22   27:invokevirtual   #336 <Method String String.toLowerCase()>
	//   23   30:astore_3        
		boolean flag = missingHashColorFormat(s1);
	//   24   31:aload_3         
	//   25   32:invokestatic    #339 <Method boolean missingHashColorFormat(String)>
	//   26   35:istore_2        
		if(s1.startsWith("#") || flag)
	//*  27   36:aload_3         
	//*  28   37:ldc2            #341 <String "#">
	//*  29   40:invokevirtual   #344 <Method boolean String.startsWith(String)>
	//*  30   43:ifne            50
	//*  31   46:iload_2         
	//*  32   47:ifeq            290
		{
			s = s1;
	//   33   50:aload_3         
	//   34   51:astore_0        
			if(!flag)
	//*  35   52:iload_2         
	//*  36   53:ifne            62
				s = s1.substring(1);
	//   37   56:aload_3         
	//   38   57:iconst_1        
	//   39   58:invokevirtual   #347 <Method String String.substring(int)>
	//   40   61:astore_0        
			if(s.length() == 3)
	//*  41   62:aload_0         
	//*  42   63:invokevirtual   #321 <Method int String.length()>
	//*  43   66:iconst_3        
	//*  44   67:icmpne          195
			{
				s1 = s.substring(0, 1);
	//   45   70:aload_0         
	//   46   71:iconst_0        
	//   47   72:iconst_1        
	//   48   73:invokevirtual   #325 <Method String String.substring(int, int)>
	//   49   76:astore_3        
				ai[0] = Integer.parseInt((new StringBuilder()).append(s1).append(s1).toString(), 16);
	//   50   77:aload           4
	//   51   79:iconst_0        
	//   52   80:new             #349 <Class StringBuilder>
	//   53   83:dup             
	//   54   84:invokespecial   #350 <Method void StringBuilder()>
	//   55   87:aload_3         
	//   56   88:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   57   91:aload_3         
	//   58   92:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   59   95:invokevirtual   #357 <Method String StringBuilder.toString()>
	//   60   98:bipush          16
	//   61  100:invokestatic    #360 <Method int Integer.parseInt(String, int)>
	//   62  103:iastore         
				s1 = s.substring(1, 2);
	//   63  104:aload_0         
	//   64  105:iconst_1        
	//   65  106:iconst_2        
	//   66  107:invokevirtual   #325 <Method String String.substring(int, int)>
	//   67  110:astore_3        
				ai[1] = Integer.parseInt((new StringBuilder()).append(s1).append(s1).toString(), 16);
	//   68  111:aload           4
	//   69  113:iconst_1        
	//   70  114:new             #349 <Class StringBuilder>
	//   71  117:dup             
	//   72  118:invokespecial   #350 <Method void StringBuilder()>
	//   73  121:aload_3         
	//   74  122:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   75  125:aload_3         
	//   76  126:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   77  129:invokevirtual   #357 <Method String StringBuilder.toString()>
	//   78  132:bipush          16
	//   79  134:invokestatic    #360 <Method int Integer.parseInt(String, int)>
	//   80  137:iastore         
				s = s.substring(2);
	//   81  138:aload_0         
	//   82  139:iconst_2        
	//   83  140:invokevirtual   #347 <Method String String.substring(int)>
	//   84  143:astore_0        
				ai[2] = Integer.parseInt((new StringBuilder()).append(s).append(s).toString(), 16);
	//   85  144:aload           4
	//   86  146:iconst_2        
	//   87  147:new             #349 <Class StringBuilder>
	//   88  150:dup             
	//   89  151:invokespecial   #350 <Method void StringBuilder()>
	//   90  154:aload_0         
	//   91  155:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   92  158:aload_0         
	//   93  159:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   94  162:invokevirtual   #357 <Method String StringBuilder.toString()>
	//   95  165:bipush          16
	//   96  167:invokestatic    #360 <Method int Integer.parseInt(String, int)>
	//   97  170:iastore         
				return new BaseColor(ai[0], ai[1], ai[2], ai[3]);
	//   98  171:new             #362 <Class BaseColor>
	//   99  174:dup             
	//  100  175:aload           4
	//  101  177:iconst_0        
	//  102  178:iaload          
	//  103  179:aload           4
	//  104  181:iconst_1        
	//  105  182:iaload          
	//  106  183:aload           4
	//  107  185:iconst_2        
	//  108  186:iaload          
	//  109  187:aload           4
	//  110  189:iconst_3        
	//  111  190:iaload          
	//  112  191:invokespecial   #365 <Method void BaseColor(int, int, int, int)>
	//  113  194:areturn         
			}
			if(s.length() == 6)
	//* 114  195:aload_0         
	//* 115  196:invokevirtual   #321 <Method int String.length()>
	//* 116  199:bipush          6
	//* 117  201:icmpne          272
			{
				ai[0] = Integer.parseInt(s.substring(0, 2), 16);
	//  118  204:aload           4
	//  119  206:iconst_0        
	//  120  207:aload_0         
	//  121  208:iconst_0        
	//  122  209:iconst_2        
	//  123  210:invokevirtual   #325 <Method String String.substring(int, int)>
	//  124  213:bipush          16
	//  125  215:invokestatic    #360 <Method int Integer.parseInt(String, int)>
	//  126  218:iastore         
				ai[1] = Integer.parseInt(s.substring(2, 4), 16);
	//  127  219:aload           4
	//  128  221:iconst_1        
	//  129  222:aload_0         
	//  130  223:iconst_2        
	//  131  224:iconst_4        
	//  132  225:invokevirtual   #325 <Method String String.substring(int, int)>
	//  133  228:bipush          16
	//  134  230:invokestatic    #360 <Method int Integer.parseInt(String, int)>
	//  135  233:iastore         
				ai[2] = Integer.parseInt(s.substring(4), 16);
	//  136  234:aload           4
	//  137  236:iconst_2        
	//  138  237:aload_0         
	//  139  238:iconst_4        
	//  140  239:invokevirtual   #347 <Method String String.substring(int)>
	//  141  242:bipush          16
	//  142  244:invokestatic    #360 <Method int Integer.parseInt(String, int)>
	//  143  247:iastore         
				return new BaseColor(ai[0], ai[1], ai[2], ai[3]);
	//  144  248:new             #362 <Class BaseColor>
	//  145  251:dup             
	//  146  252:aload           4
	//  147  254:iconst_0        
	//  148  255:iaload          
	//  149  256:aload           4
	//  150  258:iconst_1        
	//  151  259:iaload          
	//  152  260:aload           4
	//  153  262:iconst_2        
	//  154  263:iaload          
	//  155  264:aload           4
	//  156  266:iconst_3        
	//  157  267:iaload          
	//  158  268:invokespecial   #365 <Method void BaseColor(int, int, int, int)>
	//  159  271:areturn         
			} else
			{
				throw new IllegalArgumentException(MessageLocalization.getComposedMessage("unknown.color.format.must.be.rgb.or.rrggbb", new Object[0]));
	//  160  272:new             #367 <Class IllegalArgumentException>
	//  161  275:dup             
	//  162  276:ldc2            #369 <String "unknown.color.format.must.be.rgb.or.rrggbb">
	//  163  279:iconst_0        
	//  164  280:anewarray       Object[]
	//  165  283:invokestatic    #377 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  166  286:invokespecial   #380 <Method void IllegalArgumentException(String)>
	//  167  289:athrow          
			}
		}
		if(s1.startsWith("rgb("))
	//* 168  290:aload_3         
	//* 169  291:ldc2            #382 <String "rgb(">
	//* 170  294:invokevirtual   #344 <Method boolean String.startsWith(String)>
	//* 171  297:ifeq            394
		{
			s = ((String) (new StringTokenizer(s1, "rgb(), \t\r\n\f")));
	//  172  300:new             #384 <Class StringTokenizer>
	//  173  303:dup             
	//  174  304:aload_3         
	//  175  305:ldc2            #386 <String "rgb(), \t\r\n\f">
	//  176  308:invokespecial   #389 <Method void StringTokenizer(String, String)>
	//  177  311:astore_0        
			for(int i = 0; i < 3; i++)
	//* 178  312:iconst_0        
	//* 179  313:istore_1        
	//* 180  314:iload_1         
	//* 181  315:iconst_3        
	//* 182  316:icmpge          370
				if(((StringTokenizer) (s)).hasMoreElements())
	//* 183  319:aload_0         
	//* 184  320:invokevirtual   #393 <Method boolean StringTokenizer.hasMoreElements()>
	//* 185  323:ifeq            363
				{
					ai[i] = getRGBChannelValue(((StringTokenizer) (s)).nextToken());
	//  186  326:aload           4
	//  187  328:iload_1         
	//  188  329:aload_0         
	//  189  330:invokevirtual   #396 <Method String StringTokenizer.nextToken()>
	//  190  333:invokestatic    #398 <Method int getRGBChannelValue(String)>
	//  191  336:iastore         
					ai[i] = Math.max(0, ai[i]);
	//  192  337:aload           4
	//  193  339:iload_1         
	//  194  340:iconst_0        
	//  195  341:aload           4
	//  196  343:iload_1         
	//  197  344:iaload          
	//  198  345:invokestatic    #404 <Method int Math.max(int, int)>
	//  199  348:iastore         
					ai[i] = Math.min(255, ai[i]);
	//  200  349:aload           4
	//  201  351:iload_1         
	//  202  352:sipush          255
	//  203  355:aload           4
	//  204  357:iload_1         
	//  205  358:iaload          
	//  206  359:invokestatic    #407 <Method int Math.min(int, int)>
	//  207  362:iastore         
				}

	//  208  363:iload_1         
	//  209  364:iconst_1        
	//  210  365:iadd            
	//  211  366:istore_1        
	//* 212  367:goto            314
			return new BaseColor(ai[0], ai[1], ai[2], ai[3]);
	//  213  370:new             #362 <Class BaseColor>
	//  214  373:dup             
	//  215  374:aload           4
	//  216  376:iconst_0        
	//  217  377:iaload          
	//  218  378:aload           4
	//  219  380:iconst_1        
	//  220  381:iaload          
	//  221  382:aload           4
	//  222  384:iconst_2        
	//  223  385:iaload          
	//  224  386:aload           4
	//  225  388:iconst_3        
	//  226  389:iaload          
	//  227  390:invokespecial   #365 <Method void BaseColor(int, int, int, int)>
	//  228  393:areturn         
		}
		if(s1.startsWith("rgba("))
	//* 229  394:aload_3         
	//* 230  395:ldc2            #409 <String "rgba(">
	//* 231  398:invokevirtual   #344 <Method boolean String.startsWith(String)>
	//* 232  401:ifeq            526
		{
			s = ((String) (new StringTokenizer(s1, "rgba(), \t\r\n\f")));
	//  233  404:new             #384 <Class StringTokenizer>
	//  234  407:dup             
	//  235  408:aload_3         
	//  236  409:ldc2            #411 <String "rgba(), \t\r\n\f">
	//  237  412:invokespecial   #389 <Method void StringTokenizer(String, String)>
	//  238  415:astore_0        
			for(int j = 0; j < 3; j++)
	//* 239  416:iconst_0        
	//* 240  417:istore_1        
	//* 241  418:iload_1         
	//* 242  419:iconst_3        
	//* 243  420:icmpge          474
				if(((StringTokenizer) (s)).hasMoreElements())
	//* 244  423:aload_0         
	//* 245  424:invokevirtual   #393 <Method boolean StringTokenizer.hasMoreElements()>
	//* 246  427:ifeq            467
				{
					ai[j] = getRGBChannelValue(((StringTokenizer) (s)).nextToken());
	//  247  430:aload           4
	//  248  432:iload_1         
	//  249  433:aload_0         
	//  250  434:invokevirtual   #396 <Method String StringTokenizer.nextToken()>
	//  251  437:invokestatic    #398 <Method int getRGBChannelValue(String)>
	//  252  440:iastore         
					ai[j] = Math.max(0, ai[j]);
	//  253  441:aload           4
	//  254  443:iload_1         
	//  255  444:iconst_0        
	//  256  445:aload           4
	//  257  447:iload_1         
	//  258  448:iaload          
	//  259  449:invokestatic    #404 <Method int Math.max(int, int)>
	//  260  452:iastore         
					ai[j] = Math.min(255, ai[j]);
	//  261  453:aload           4
	//  262  455:iload_1         
	//  263  456:sipush          255
	//  264  459:aload           4
	//  265  461:iload_1         
	//  266  462:iaload          
	//  267  463:invokestatic    #407 <Method int Math.min(int, int)>
	//  268  466:iastore         
				}

	//  269  467:iload_1         
	//  270  468:iconst_1        
	//  271  469:iadd            
	//  272  470:istore_1        
	//* 273  471:goto            418
			if(((StringTokenizer) (s)).hasMoreElements())
	//* 274  474:aload_0         
	//* 275  475:invokevirtual   #393 <Method boolean StringTokenizer.hasMoreElements()>
	//* 276  478:ifeq            502
				ai[3] = (int)((double)(255F * Float.parseFloat(((StringTokenizer) (s)).nextToken())) + 0.5D);
	//  277  481:aload           4
	//  278  483:iconst_3        
	//  279  484:ldc2            #412 <Float 255F>
	//  280  487:aload_0         
	//  281  488:invokevirtual   #396 <Method String StringTokenizer.nextToken()>
	//  282  491:invokestatic    #418 <Method float Float.parseFloat(String)>
	//  283  494:fmul            
	//  284  495:f2d             
	//  285  496:ldc2w           #419 <Double 0.5D>
	//  286  499:dadd            
	//  287  500:d2i             
	//  288  501:iastore         
			return new BaseColor(ai[0], ai[1], ai[2], ai[3]);
	//  289  502:new             #362 <Class BaseColor>
	//  290  505:dup             
	//  291  506:aload           4
	//  292  508:iconst_0        
	//  293  509:iaload          
	//  294  510:aload           4
	//  295  512:iconst_1        
	//  296  513:iaload          
	//  297  514:aload           4
	//  298  516:iconst_2        
	//  299  517:iaload          
	//  300  518:aload           4
	//  301  520:iconst_3        
	//  302  521:iaload          
	//  303  522:invokespecial   #365 <Method void BaseColor(int, int, int, int)>
	//  304  525:areturn         
		}
		if(!NAMES.containsKey(((Object) (s1))))
	//* 305  526:getstatic       #19  <Field WebColors NAMES>
	//* 306  529:aload_3         
	//* 307  530:invokevirtual   #424 <Method boolean containsKey(Object)>
	//* 308  533:ifne            558
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("color.not.found", ((Object []) (new String[] {
				s1
			}))));
	//  309  536:new             #367 <Class IllegalArgumentException>
	//  310  539:dup             
	//  311  540:ldc2            #426 <String "color.not.found">
	//  312  543:iconst_1        
	//  313  544:anewarray       String[]
	//  314  547:dup             
	//  315  548:iconst_0        
	//  316  549:aload_3         
	//  317  550:aastore         
	//  318  551:invokestatic    #377 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  319  554:invokespecial   #380 <Method void IllegalArgumentException(String)>
	//  320  557:athrow          
		} else
		{
			s = ((String) ((int[])NAMES.get(((Object) (s1)))));
	//  321  558:getstatic       #19  <Field WebColors NAMES>
	//  322  561:aload_3         
	//  323  562:invokevirtual   #430 <Method Object get(Object)>
	//  324  565:checkcast       #432 <Class int[]>
	//  325  568:astore_0        
			return new BaseColor(s[0], s[1], s[2], s[3]);
	//  326  569:new             #362 <Class BaseColor>
	//  327  572:dup             
	//  328  573:aload_0         
	//  329  574:iconst_0        
	//  330  575:iaload          
	//  331  576:aload_0         
	//  332  577:iconst_1        
	//  333  578:iaload          
	//  334  579:aload_0         
	//  335  580:iconst_2        
	//  336  581:iaload          
	//  337  582:aload_0         
	//  338  583:iconst_3        
	//  339  584:iaload          
	//  340  585:invokespecial   #365 <Method void BaseColor(int, int, int, int)>
	//  341  588:areturn         
		}
	}

	private static boolean missingHashColorFormat(String s)
	{
		int i = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method int String.length()>
	//    2    4:istore_1        
		if(i == 3 || i == 6)
	//*   3    5:iload_1         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          16
	//*   6   10:iload_1         
	//*   7   11:bipush          6
	//*   8   13:icmpne          47
			return s.matches((new StringBuilder()).append("[0-9a-f]{").append(i).append("}").toString());
	//    9   16:aload_0         
	//   10   17:new             #349 <Class StringBuilder>
	//   11   20:dup             
	//   12   21:invokespecial   #350 <Method void StringBuilder()>
	//   13   24:ldc2            #434 <String "[0-9a-f]{">
	//   14   27:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:iload_1         
	//   16   31:invokevirtual   #437 <Method StringBuilder StringBuilder.append(int)>
	//   17   34:ldc2            #439 <String "}">
	//   18   37:invokevirtual   #354 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:invokevirtual   #357 <Method String StringBuilder.toString()>
	//   20   43:invokevirtual   #442 <Method boolean String.matches(String)>
	//   21   46:ireturn         
		else
			return false;
	//   22   47:iconst_0        
	//   23   48:ireturn         
	}

	public static final WebColors NAMES;
	private static final long serialVersionUID = 0xb898ade0L;

	static 
	{
		NAMES = new WebColors();
	//    0    0:new             #2   <Class WebColors>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void WebColors()>
	//    3    7:putstatic       #19  <Field WebColors NAMES>
		NAMES.put("aliceblue", ((Object) (new int[] {
			240, 248, 255, 255
		})));
	//    4   10:getstatic       #19  <Field WebColors NAMES>
	//    5   13:ldc1            #21  <String "aliceblue">
	//    6   15:iconst_4        
	//    7   16:newarray        int[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:sipush          240
	//   11   23:iastore         
	//   12   24:dup             
	//   13   25:iconst_1        
	//   14   26:sipush          248
	//   15   29:iastore         
	//   16   30:dup             
	//   17   31:iconst_2        
	//   18   32:sipush          255
	//   19   35:iastore         
	//   20   36:dup             
	//   21   37:iconst_3        
	//   22   38:sipush          255
	//   23   41:iastore         
	//   24   42:invokevirtual   #25  <Method Object put(Object, Object)>
	//   25   45:pop             
		NAMES.put("antiquewhite", ((Object) (new int[] {
			250, 235, 215, 255
		})));
	//   26   46:getstatic       #19  <Field WebColors NAMES>
	//   27   49:ldc1            #27  <String "antiquewhite">
	//   28   51:iconst_4        
	//   29   52:newarray        int[]
	//   30   54:dup             
	//   31   55:iconst_0        
	//   32   56:sipush          250
	//   33   59:iastore         
	//   34   60:dup             
	//   35   61:iconst_1        
	//   36   62:sipush          235
	//   37   65:iastore         
	//   38   66:dup             
	//   39   67:iconst_2        
	//   40   68:sipush          215
	//   41   71:iastore         
	//   42   72:dup             
	//   43   73:iconst_3        
	//   44   74:sipush          255
	//   45   77:iastore         
	//   46   78:invokevirtual   #25  <Method Object put(Object, Object)>
	//   47   81:pop             
		NAMES.put("aqua", ((Object) (new int[] {
			0, 255, 255, 255
		})));
	//   48   82:getstatic       #19  <Field WebColors NAMES>
	//   49   85:ldc1            #29  <String "aqua">
	//   50   87:iconst_4        
	//   51   88:newarray        int[]
	//   52   90:dup             
	//   53   91:iconst_0        
	//   54   92:iconst_0        
	//   55   93:iastore         
	//   56   94:dup             
	//   57   95:iconst_1        
	//   58   96:sipush          255
	//   59   99:iastore         
	//   60  100:dup             
	//   61  101:iconst_2        
	//   62  102:sipush          255
	//   63  105:iastore         
	//   64  106:dup             
	//   65  107:iconst_3        
	//   66  108:sipush          255
	//   67  111:iastore         
	//   68  112:invokevirtual   #25  <Method Object put(Object, Object)>
	//   69  115:pop             
		NAMES.put("aquamarine", ((Object) (new int[] {
			127, 255, 212, 255
		})));
	//   70  116:getstatic       #19  <Field WebColors NAMES>
	//   71  119:ldc1            #31  <String "aquamarine">
	//   72  121:iconst_4        
	//   73  122:newarray        int[]
	//   74  124:dup             
	//   75  125:iconst_0        
	//   76  126:bipush          127
	//   77  128:iastore         
	//   78  129:dup             
	//   79  130:iconst_1        
	//   80  131:sipush          255
	//   81  134:iastore         
	//   82  135:dup             
	//   83  136:iconst_2        
	//   84  137:sipush          212
	//   85  140:iastore         
	//   86  141:dup             
	//   87  142:iconst_3        
	//   88  143:sipush          255
	//   89  146:iastore         
	//   90  147:invokevirtual   #25  <Method Object put(Object, Object)>
	//   91  150:pop             
		NAMES.put("azure", ((Object) (new int[] {
			240, 255, 255, 255
		})));
	//   92  151:getstatic       #19  <Field WebColors NAMES>
	//   93  154:ldc1            #33  <String "azure">
	//   94  156:iconst_4        
	//   95  157:newarray        int[]
	//   96  159:dup             
	//   97  160:iconst_0        
	//   98  161:sipush          240
	//   99  164:iastore         
	//  100  165:dup             
	//  101  166:iconst_1        
	//  102  167:sipush          255
	//  103  170:iastore         
	//  104  171:dup             
	//  105  172:iconst_2        
	//  106  173:sipush          255
	//  107  176:iastore         
	//  108  177:dup             
	//  109  178:iconst_3        
	//  110  179:sipush          255
	//  111  182:iastore         
	//  112  183:invokevirtual   #25  <Method Object put(Object, Object)>
	//  113  186:pop             
		NAMES.put("beige", ((Object) (new int[] {
			245, 245, 220, 255
		})));
	//  114  187:getstatic       #19  <Field WebColors NAMES>
	//  115  190:ldc1            #35  <String "beige">
	//  116  192:iconst_4        
	//  117  193:newarray        int[]
	//  118  195:dup             
	//  119  196:iconst_0        
	//  120  197:sipush          245
	//  121  200:iastore         
	//  122  201:dup             
	//  123  202:iconst_1        
	//  124  203:sipush          245
	//  125  206:iastore         
	//  126  207:dup             
	//  127  208:iconst_2        
	//  128  209:sipush          220
	//  129  212:iastore         
	//  130  213:dup             
	//  131  214:iconst_3        
	//  132  215:sipush          255
	//  133  218:iastore         
	//  134  219:invokevirtual   #25  <Method Object put(Object, Object)>
	//  135  222:pop             
		NAMES.put("bisque", ((Object) (new int[] {
			255, 228, 196, 255
		})));
	//  136  223:getstatic       #19  <Field WebColors NAMES>
	//  137  226:ldc1            #37  <String "bisque">
	//  138  228:iconst_4        
	//  139  229:newarray        int[]
	//  140  231:dup             
	//  141  232:iconst_0        
	//  142  233:sipush          255
	//  143  236:iastore         
	//  144  237:dup             
	//  145  238:iconst_1        
	//  146  239:sipush          228
	//  147  242:iastore         
	//  148  243:dup             
	//  149  244:iconst_2        
	//  150  245:sipush          196
	//  151  248:iastore         
	//  152  249:dup             
	//  153  250:iconst_3        
	//  154  251:sipush          255
	//  155  254:iastore         
	//  156  255:invokevirtual   #25  <Method Object put(Object, Object)>
	//  157  258:pop             
		NAMES.put("black", ((Object) (new int[] {
			0, 0, 0, 255
		})));
	//  158  259:getstatic       #19  <Field WebColors NAMES>
	//  159  262:ldc1            #39  <String "black">
	//  160  264:iconst_4        
	//  161  265:newarray        int[]
	//  162  267:dup             
	//  163  268:iconst_0        
	//  164  269:iconst_0        
	//  165  270:iastore         
	//  166  271:dup             
	//  167  272:iconst_1        
	//  168  273:iconst_0        
	//  169  274:iastore         
	//  170  275:dup             
	//  171  276:iconst_2        
	//  172  277:iconst_0        
	//  173  278:iastore         
	//  174  279:dup             
	//  175  280:iconst_3        
	//  176  281:sipush          255
	//  177  284:iastore         
	//  178  285:invokevirtual   #25  <Method Object put(Object, Object)>
	//  179  288:pop             
		NAMES.put("blanchedalmond", ((Object) (new int[] {
			255, 235, 205, 255
		})));
	//  180  289:getstatic       #19  <Field WebColors NAMES>
	//  181  292:ldc1            #41  <String "blanchedalmond">
	//  182  294:iconst_4        
	//  183  295:newarray        int[]
	//  184  297:dup             
	//  185  298:iconst_0        
	//  186  299:sipush          255
	//  187  302:iastore         
	//  188  303:dup             
	//  189  304:iconst_1        
	//  190  305:sipush          235
	//  191  308:iastore         
	//  192  309:dup             
	//  193  310:iconst_2        
	//  194  311:sipush          205
	//  195  314:iastore         
	//  196  315:dup             
	//  197  316:iconst_3        
	//  198  317:sipush          255
	//  199  320:iastore         
	//  200  321:invokevirtual   #25  <Method Object put(Object, Object)>
	//  201  324:pop             
		NAMES.put("blue", ((Object) (new int[] {
			0, 0, 255, 255
		})));
	//  202  325:getstatic       #19  <Field WebColors NAMES>
	//  203  328:ldc1            #43  <String "blue">
	//  204  330:iconst_4        
	//  205  331:newarray        int[]
	//  206  333:dup             
	//  207  334:iconst_0        
	//  208  335:iconst_0        
	//  209  336:iastore         
	//  210  337:dup             
	//  211  338:iconst_1        
	//  212  339:iconst_0        
	//  213  340:iastore         
	//  214  341:dup             
	//  215  342:iconst_2        
	//  216  343:sipush          255
	//  217  346:iastore         
	//  218  347:dup             
	//  219  348:iconst_3        
	//  220  349:sipush          255
	//  221  352:iastore         
	//  222  353:invokevirtual   #25  <Method Object put(Object, Object)>
	//  223  356:pop             
		NAMES.put("blueviolet", ((Object) (new int[] {
			138, 43, 226, 255
		})));
	//  224  357:getstatic       #19  <Field WebColors NAMES>
	//  225  360:ldc1            #45  <String "blueviolet">
	//  226  362:iconst_4        
	//  227  363:newarray        int[]
	//  228  365:dup             
	//  229  366:iconst_0        
	//  230  367:sipush          138
	//  231  370:iastore         
	//  232  371:dup             
	//  233  372:iconst_1        
	//  234  373:bipush          43
	//  235  375:iastore         
	//  236  376:dup             
	//  237  377:iconst_2        
	//  238  378:sipush          226
	//  239  381:iastore         
	//  240  382:dup             
	//  241  383:iconst_3        
	//  242  384:sipush          255
	//  243  387:iastore         
	//  244  388:invokevirtual   #25  <Method Object put(Object, Object)>
	//  245  391:pop             
		NAMES.put("brown", ((Object) (new int[] {
			165, 42, 42, 255
		})));
	//  246  392:getstatic       #19  <Field WebColors NAMES>
	//  247  395:ldc1            #47  <String "brown">
	//  248  397:iconst_4        
	//  249  398:newarray        int[]
	//  250  400:dup             
	//  251  401:iconst_0        
	//  252  402:sipush          165
	//  253  405:iastore         
	//  254  406:dup             
	//  255  407:iconst_1        
	//  256  408:bipush          42
	//  257  410:iastore         
	//  258  411:dup             
	//  259  412:iconst_2        
	//  260  413:bipush          42
	//  261  415:iastore         
	//  262  416:dup             
	//  263  417:iconst_3        
	//  264  418:sipush          255
	//  265  421:iastore         
	//  266  422:invokevirtual   #25  <Method Object put(Object, Object)>
	//  267  425:pop             
		NAMES.put("burlywood", ((Object) (new int[] {
			222, 184, 135, 255
		})));
	//  268  426:getstatic       #19  <Field WebColors NAMES>
	//  269  429:ldc1            #49  <String "burlywood">
	//  270  431:iconst_4        
	//  271  432:newarray        int[]
	//  272  434:dup             
	//  273  435:iconst_0        
	//  274  436:sipush          222
	//  275  439:iastore         
	//  276  440:dup             
	//  277  441:iconst_1        
	//  278  442:sipush          184
	//  279  445:iastore         
	//  280  446:dup             
	//  281  447:iconst_2        
	//  282  448:sipush          135
	//  283  451:iastore         
	//  284  452:dup             
	//  285  453:iconst_3        
	//  286  454:sipush          255
	//  287  457:iastore         
	//  288  458:invokevirtual   #25  <Method Object put(Object, Object)>
	//  289  461:pop             
		NAMES.put("cadetblue", ((Object) (new int[] {
			95, 158, 160, 255
		})));
	//  290  462:getstatic       #19  <Field WebColors NAMES>
	//  291  465:ldc1            #51  <String "cadetblue">
	//  292  467:iconst_4        
	//  293  468:newarray        int[]
	//  294  470:dup             
	//  295  471:iconst_0        
	//  296  472:bipush          95
	//  297  474:iastore         
	//  298  475:dup             
	//  299  476:iconst_1        
	//  300  477:sipush          158
	//  301  480:iastore         
	//  302  481:dup             
	//  303  482:iconst_2        
	//  304  483:sipush          160
	//  305  486:iastore         
	//  306  487:dup             
	//  307  488:iconst_3        
	//  308  489:sipush          255
	//  309  492:iastore         
	//  310  493:invokevirtual   #25  <Method Object put(Object, Object)>
	//  311  496:pop             
		NAMES.put("chartreuse", ((Object) (new int[] {
			127, 255, 0, 255
		})));
	//  312  497:getstatic       #19  <Field WebColors NAMES>
	//  313  500:ldc1            #53  <String "chartreuse">
	//  314  502:iconst_4        
	//  315  503:newarray        int[]
	//  316  505:dup             
	//  317  506:iconst_0        
	//  318  507:bipush          127
	//  319  509:iastore         
	//  320  510:dup             
	//  321  511:iconst_1        
	//  322  512:sipush          255
	//  323  515:iastore         
	//  324  516:dup             
	//  325  517:iconst_2        
	//  326  518:iconst_0        
	//  327  519:iastore         
	//  328  520:dup             
	//  329  521:iconst_3        
	//  330  522:sipush          255
	//  331  525:iastore         
	//  332  526:invokevirtual   #25  <Method Object put(Object, Object)>
	//  333  529:pop             
		NAMES.put("chocolate", ((Object) (new int[] {
			210, 105, 30, 255
		})));
	//  334  530:getstatic       #19  <Field WebColors NAMES>
	//  335  533:ldc1            #55  <String "chocolate">
	//  336  535:iconst_4        
	//  337  536:newarray        int[]
	//  338  538:dup             
	//  339  539:iconst_0        
	//  340  540:sipush          210
	//  341  543:iastore         
	//  342  544:dup             
	//  343  545:iconst_1        
	//  344  546:bipush          105
	//  345  548:iastore         
	//  346  549:dup             
	//  347  550:iconst_2        
	//  348  551:bipush          30
	//  349  553:iastore         
	//  350  554:dup             
	//  351  555:iconst_3        
	//  352  556:sipush          255
	//  353  559:iastore         
	//  354  560:invokevirtual   #25  <Method Object put(Object, Object)>
	//  355  563:pop             
		NAMES.put("coral", ((Object) (new int[] {
			255, 127, 80, 255
		})));
	//  356  564:getstatic       #19  <Field WebColors NAMES>
	//  357  567:ldc1            #57  <String "coral">
	//  358  569:iconst_4        
	//  359  570:newarray        int[]
	//  360  572:dup             
	//  361  573:iconst_0        
	//  362  574:sipush          255
	//  363  577:iastore         
	//  364  578:dup             
	//  365  579:iconst_1        
	//  366  580:bipush          127
	//  367  582:iastore         
	//  368  583:dup             
	//  369  584:iconst_2        
	//  370  585:bipush          80
	//  371  587:iastore         
	//  372  588:dup             
	//  373  589:iconst_3        
	//  374  590:sipush          255
	//  375  593:iastore         
	//  376  594:invokevirtual   #25  <Method Object put(Object, Object)>
	//  377  597:pop             
		NAMES.put("cornflowerblue", ((Object) (new int[] {
			100, 149, 237, 255
		})));
	//  378  598:getstatic       #19  <Field WebColors NAMES>
	//  379  601:ldc1            #59  <String "cornflowerblue">
	//  380  603:iconst_4        
	//  381  604:newarray        int[]
	//  382  606:dup             
	//  383  607:iconst_0        
	//  384  608:bipush          100
	//  385  610:iastore         
	//  386  611:dup             
	//  387  612:iconst_1        
	//  388  613:sipush          149
	//  389  616:iastore         
	//  390  617:dup             
	//  391  618:iconst_2        
	//  392  619:sipush          237
	//  393  622:iastore         
	//  394  623:dup             
	//  395  624:iconst_3        
	//  396  625:sipush          255
	//  397  628:iastore         
	//  398  629:invokevirtual   #25  <Method Object put(Object, Object)>
	//  399  632:pop             
		NAMES.put("cornsilk", ((Object) (new int[] {
			255, 248, 220, 255
		})));
	//  400  633:getstatic       #19  <Field WebColors NAMES>
	//  401  636:ldc1            #61  <String "cornsilk">
	//  402  638:iconst_4        
	//  403  639:newarray        int[]
	//  404  641:dup             
	//  405  642:iconst_0        
	//  406  643:sipush          255
	//  407  646:iastore         
	//  408  647:dup             
	//  409  648:iconst_1        
	//  410  649:sipush          248
	//  411  652:iastore         
	//  412  653:dup             
	//  413  654:iconst_2        
	//  414  655:sipush          220
	//  415  658:iastore         
	//  416  659:dup             
	//  417  660:iconst_3        
	//  418  661:sipush          255
	//  419  664:iastore         
	//  420  665:invokevirtual   #25  <Method Object put(Object, Object)>
	//  421  668:pop             
		NAMES.put("crimson", ((Object) (new int[] {
			220, 20, 60, 255
		})));
	//  422  669:getstatic       #19  <Field WebColors NAMES>
	//  423  672:ldc1            #63  <String "crimson">
	//  424  674:iconst_4        
	//  425  675:newarray        int[]
	//  426  677:dup             
	//  427  678:iconst_0        
	//  428  679:sipush          220
	//  429  682:iastore         
	//  430  683:dup             
	//  431  684:iconst_1        
	//  432  685:bipush          20
	//  433  687:iastore         
	//  434  688:dup             
	//  435  689:iconst_2        
	//  436  690:bipush          60
	//  437  692:iastore         
	//  438  693:dup             
	//  439  694:iconst_3        
	//  440  695:sipush          255
	//  441  698:iastore         
	//  442  699:invokevirtual   #25  <Method Object put(Object, Object)>
	//  443  702:pop             
		NAMES.put("cyan", ((Object) (new int[] {
			0, 255, 255, 255
		})));
	//  444  703:getstatic       #19  <Field WebColors NAMES>
	//  445  706:ldc1            #65  <String "cyan">
	//  446  708:iconst_4        
	//  447  709:newarray        int[]
	//  448  711:dup             
	//  449  712:iconst_0        
	//  450  713:iconst_0        
	//  451  714:iastore         
	//  452  715:dup             
	//  453  716:iconst_1        
	//  454  717:sipush          255
	//  455  720:iastore         
	//  456  721:dup             
	//  457  722:iconst_2        
	//  458  723:sipush          255
	//  459  726:iastore         
	//  460  727:dup             
	//  461  728:iconst_3        
	//  462  729:sipush          255
	//  463  732:iastore         
	//  464  733:invokevirtual   #25  <Method Object put(Object, Object)>
	//  465  736:pop             
		NAMES.put("darkblue", ((Object) (new int[] {
			0, 0, 139, 255
		})));
	//  466  737:getstatic       #19  <Field WebColors NAMES>
	//  467  740:ldc1            #67  <String "darkblue">
	//  468  742:iconst_4        
	//  469  743:newarray        int[]
	//  470  745:dup             
	//  471  746:iconst_0        
	//  472  747:iconst_0        
	//  473  748:iastore         
	//  474  749:dup             
	//  475  750:iconst_1        
	//  476  751:iconst_0        
	//  477  752:iastore         
	//  478  753:dup             
	//  479  754:iconst_2        
	//  480  755:sipush          139
	//  481  758:iastore         
	//  482  759:dup             
	//  483  760:iconst_3        
	//  484  761:sipush          255
	//  485  764:iastore         
	//  486  765:invokevirtual   #25  <Method Object put(Object, Object)>
	//  487  768:pop             
		NAMES.put("darkcyan", ((Object) (new int[] {
			0, 139, 139, 255
		})));
	//  488  769:getstatic       #19  <Field WebColors NAMES>
	//  489  772:ldc1            #69  <String "darkcyan">
	//  490  774:iconst_4        
	//  491  775:newarray        int[]
	//  492  777:dup             
	//  493  778:iconst_0        
	//  494  779:iconst_0        
	//  495  780:iastore         
	//  496  781:dup             
	//  497  782:iconst_1        
	//  498  783:sipush          139
	//  499  786:iastore         
	//  500  787:dup             
	//  501  788:iconst_2        
	//  502  789:sipush          139
	//  503  792:iastore         
	//  504  793:dup             
	//  505  794:iconst_3        
	//  506  795:sipush          255
	//  507  798:iastore         
	//  508  799:invokevirtual   #25  <Method Object put(Object, Object)>
	//  509  802:pop             
		NAMES.put("darkgoldenrod", ((Object) (new int[] {
			184, 134, 11, 255
		})));
	//  510  803:getstatic       #19  <Field WebColors NAMES>
	//  511  806:ldc1            #71  <String "darkgoldenrod">
	//  512  808:iconst_4        
	//  513  809:newarray        int[]
	//  514  811:dup             
	//  515  812:iconst_0        
	//  516  813:sipush          184
	//  517  816:iastore         
	//  518  817:dup             
	//  519  818:iconst_1        
	//  520  819:sipush          134
	//  521  822:iastore         
	//  522  823:dup             
	//  523  824:iconst_2        
	//  524  825:bipush          11
	//  525  827:iastore         
	//  526  828:dup             
	//  527  829:iconst_3        
	//  528  830:sipush          255
	//  529  833:iastore         
	//  530  834:invokevirtual   #25  <Method Object put(Object, Object)>
	//  531  837:pop             
		NAMES.put("darkgray", ((Object) (new int[] {
			169, 169, 169, 255
		})));
	//  532  838:getstatic       #19  <Field WebColors NAMES>
	//  533  841:ldc1            #73  <String "darkgray">
	//  534  843:iconst_4        
	//  535  844:newarray        int[]
	//  536  846:dup             
	//  537  847:iconst_0        
	//  538  848:sipush          169
	//  539  851:iastore         
	//  540  852:dup             
	//  541  853:iconst_1        
	//  542  854:sipush          169
	//  543  857:iastore         
	//  544  858:dup             
	//  545  859:iconst_2        
	//  546  860:sipush          169
	//  547  863:iastore         
	//  548  864:dup             
	//  549  865:iconst_3        
	//  550  866:sipush          255
	//  551  869:iastore         
	//  552  870:invokevirtual   #25  <Method Object put(Object, Object)>
	//  553  873:pop             
		NAMES.put("darkgreen", ((Object) (new int[] {
			0, 100, 0, 255
		})));
	//  554  874:getstatic       #19  <Field WebColors NAMES>
	//  555  877:ldc1            #75  <String "darkgreen">
	//  556  879:iconst_4        
	//  557  880:newarray        int[]
	//  558  882:dup             
	//  559  883:iconst_0        
	//  560  884:iconst_0        
	//  561  885:iastore         
	//  562  886:dup             
	//  563  887:iconst_1        
	//  564  888:bipush          100
	//  565  890:iastore         
	//  566  891:dup             
	//  567  892:iconst_2        
	//  568  893:iconst_0        
	//  569  894:iastore         
	//  570  895:dup             
	//  571  896:iconst_3        
	//  572  897:sipush          255
	//  573  900:iastore         
	//  574  901:invokevirtual   #25  <Method Object put(Object, Object)>
	//  575  904:pop             
		NAMES.put("darkkhaki", ((Object) (new int[] {
			189, 183, 107, 255
		})));
	//  576  905:getstatic       #19  <Field WebColors NAMES>
	//  577  908:ldc1            #77  <String "darkkhaki">
	//  578  910:iconst_4        
	//  579  911:newarray        int[]
	//  580  913:dup             
	//  581  914:iconst_0        
	//  582  915:sipush          189
	//  583  918:iastore         
	//  584  919:dup             
	//  585  920:iconst_1        
	//  586  921:sipush          183
	//  587  924:iastore         
	//  588  925:dup             
	//  589  926:iconst_2        
	//  590  927:bipush          107
	//  591  929:iastore         
	//  592  930:dup             
	//  593  931:iconst_3        
	//  594  932:sipush          255
	//  595  935:iastore         
	//  596  936:invokevirtual   #25  <Method Object put(Object, Object)>
	//  597  939:pop             
		NAMES.put("darkmagenta", ((Object) (new int[] {
			139, 0, 139, 255
		})));
	//  598  940:getstatic       #19  <Field WebColors NAMES>
	//  599  943:ldc1            #79  <String "darkmagenta">
	//  600  945:iconst_4        
	//  601  946:newarray        int[]
	//  602  948:dup             
	//  603  949:iconst_0        
	//  604  950:sipush          139
	//  605  953:iastore         
	//  606  954:dup             
	//  607  955:iconst_1        
	//  608  956:iconst_0        
	//  609  957:iastore         
	//  610  958:dup             
	//  611  959:iconst_2        
	//  612  960:sipush          139
	//  613  963:iastore         
	//  614  964:dup             
	//  615  965:iconst_3        
	//  616  966:sipush          255
	//  617  969:iastore         
	//  618  970:invokevirtual   #25  <Method Object put(Object, Object)>
	//  619  973:pop             
		NAMES.put("darkolivegreen", ((Object) (new int[] {
			85, 107, 47, 255
		})));
	//  620  974:getstatic       #19  <Field WebColors NAMES>
	//  621  977:ldc1            #81  <String "darkolivegreen">
	//  622  979:iconst_4        
	//  623  980:newarray        int[]
	//  624  982:dup             
	//  625  983:iconst_0        
	//  626  984:bipush          85
	//  627  986:iastore         
	//  628  987:dup             
	//  629  988:iconst_1        
	//  630  989:bipush          107
	//  631  991:iastore         
	//  632  992:dup             
	//  633  993:iconst_2        
	//  634  994:bipush          47
	//  635  996:iastore         
	//  636  997:dup             
	//  637  998:iconst_3        
	//  638  999:sipush          255
	//  639 1002:iastore         
	//  640 1003:invokevirtual   #25  <Method Object put(Object, Object)>
	//  641 1006:pop             
		NAMES.put("darkorange", ((Object) (new int[] {
			255, 140, 0, 255
		})));
	//  642 1007:getstatic       #19  <Field WebColors NAMES>
	//  643 1010:ldc1            #83  <String "darkorange">
	//  644 1012:iconst_4        
	//  645 1013:newarray        int[]
	//  646 1015:dup             
	//  647 1016:iconst_0        
	//  648 1017:sipush          255
	//  649 1020:iastore         
	//  650 1021:dup             
	//  651 1022:iconst_1        
	//  652 1023:sipush          140
	//  653 1026:iastore         
	//  654 1027:dup             
	//  655 1028:iconst_2        
	//  656 1029:iconst_0        
	//  657 1030:iastore         
	//  658 1031:dup             
	//  659 1032:iconst_3        
	//  660 1033:sipush          255
	//  661 1036:iastore         
	//  662 1037:invokevirtual   #25  <Method Object put(Object, Object)>
	//  663 1040:pop             
		NAMES.put("darkorchid", ((Object) (new int[] {
			153, 50, 204, 255
		})));
	//  664 1041:getstatic       #19  <Field WebColors NAMES>
	//  665 1044:ldc1            #85  <String "darkorchid">
	//  666 1046:iconst_4        
	//  667 1047:newarray        int[]
	//  668 1049:dup             
	//  669 1050:iconst_0        
	//  670 1051:sipush          153
	//  671 1054:iastore         
	//  672 1055:dup             
	//  673 1056:iconst_1        
	//  674 1057:bipush          50
	//  675 1059:iastore         
	//  676 1060:dup             
	//  677 1061:iconst_2        
	//  678 1062:sipush          204
	//  679 1065:iastore         
	//  680 1066:dup             
	//  681 1067:iconst_3        
	//  682 1068:sipush          255
	//  683 1071:iastore         
	//  684 1072:invokevirtual   #25  <Method Object put(Object, Object)>
	//  685 1075:pop             
		NAMES.put("darkred", ((Object) (new int[] {
			139, 0, 0, 255
		})));
	//  686 1076:getstatic       #19  <Field WebColors NAMES>
	//  687 1079:ldc1            #87  <String "darkred">
	//  688 1081:iconst_4        
	//  689 1082:newarray        int[]
	//  690 1084:dup             
	//  691 1085:iconst_0        
	//  692 1086:sipush          139
	//  693 1089:iastore         
	//  694 1090:dup             
	//  695 1091:iconst_1        
	//  696 1092:iconst_0        
	//  697 1093:iastore         
	//  698 1094:dup             
	//  699 1095:iconst_2        
	//  700 1096:iconst_0        
	//  701 1097:iastore         
	//  702 1098:dup             
	//  703 1099:iconst_3        
	//  704 1100:sipush          255
	//  705 1103:iastore         
	//  706 1104:invokevirtual   #25  <Method Object put(Object, Object)>
	//  707 1107:pop             
		NAMES.put("darksalmon", ((Object) (new int[] {
			233, 150, 122, 255
		})));
	//  708 1108:getstatic       #19  <Field WebColors NAMES>
	//  709 1111:ldc1            #89  <String "darksalmon">
	//  710 1113:iconst_4        
	//  711 1114:newarray        int[]
	//  712 1116:dup             
	//  713 1117:iconst_0        
	//  714 1118:sipush          233
	//  715 1121:iastore         
	//  716 1122:dup             
	//  717 1123:iconst_1        
	//  718 1124:sipush          150
	//  719 1127:iastore         
	//  720 1128:dup             
	//  721 1129:iconst_2        
	//  722 1130:bipush          122
	//  723 1132:iastore         
	//  724 1133:dup             
	//  725 1134:iconst_3        
	//  726 1135:sipush          255
	//  727 1138:iastore         
	//  728 1139:invokevirtual   #25  <Method Object put(Object, Object)>
	//  729 1142:pop             
		NAMES.put("darkseagreen", ((Object) (new int[] {
			143, 188, 143, 255
		})));
	//  730 1143:getstatic       #19  <Field WebColors NAMES>
	//  731 1146:ldc1            #91  <String "darkseagreen">
	//  732 1148:iconst_4        
	//  733 1149:newarray        int[]
	//  734 1151:dup             
	//  735 1152:iconst_0        
	//  736 1153:sipush          143
	//  737 1156:iastore         
	//  738 1157:dup             
	//  739 1158:iconst_1        
	//  740 1159:sipush          188
	//  741 1162:iastore         
	//  742 1163:dup             
	//  743 1164:iconst_2        
	//  744 1165:sipush          143
	//  745 1168:iastore         
	//  746 1169:dup             
	//  747 1170:iconst_3        
	//  748 1171:sipush          255
	//  749 1174:iastore         
	//  750 1175:invokevirtual   #25  <Method Object put(Object, Object)>
	//  751 1178:pop             
		NAMES.put("darkslateblue", ((Object) (new int[] {
			72, 61, 139, 255
		})));
	//  752 1179:getstatic       #19  <Field WebColors NAMES>
	//  753 1182:ldc1            #93  <String "darkslateblue">
	//  754 1184:iconst_4        
	//  755 1185:newarray        int[]
	//  756 1187:dup             
	//  757 1188:iconst_0        
	//  758 1189:bipush          72
	//  759 1191:iastore         
	//  760 1192:dup             
	//  761 1193:iconst_1        
	//  762 1194:bipush          61
	//  763 1196:iastore         
	//  764 1197:dup             
	//  765 1198:iconst_2        
	//  766 1199:sipush          139
	//  767 1202:iastore         
	//  768 1203:dup             
	//  769 1204:iconst_3        
	//  770 1205:sipush          255
	//  771 1208:iastore         
	//  772 1209:invokevirtual   #25  <Method Object put(Object, Object)>
	//  773 1212:pop             
		NAMES.put("darkslategray", ((Object) (new int[] {
			47, 79, 79, 255
		})));
	//  774 1213:getstatic       #19  <Field WebColors NAMES>
	//  775 1216:ldc1            #95  <String "darkslategray">
	//  776 1218:iconst_4        
	//  777 1219:newarray        int[]
	//  778 1221:dup             
	//  779 1222:iconst_0        
	//  780 1223:bipush          47
	//  781 1225:iastore         
	//  782 1226:dup             
	//  783 1227:iconst_1        
	//  784 1228:bipush          79
	//  785 1230:iastore         
	//  786 1231:dup             
	//  787 1232:iconst_2        
	//  788 1233:bipush          79
	//  789 1235:iastore         
	//  790 1236:dup             
	//  791 1237:iconst_3        
	//  792 1238:sipush          255
	//  793 1241:iastore         
	//  794 1242:invokevirtual   #25  <Method Object put(Object, Object)>
	//  795 1245:pop             
		NAMES.put("darkturquoise", ((Object) (new int[] {
			0, 206, 209, 255
		})));
	//  796 1246:getstatic       #19  <Field WebColors NAMES>
	//  797 1249:ldc1            #97  <String "darkturquoise">
	//  798 1251:iconst_4        
	//  799 1252:newarray        int[]
	//  800 1254:dup             
	//  801 1255:iconst_0        
	//  802 1256:iconst_0        
	//  803 1257:iastore         
	//  804 1258:dup             
	//  805 1259:iconst_1        
	//  806 1260:sipush          206
	//  807 1263:iastore         
	//  808 1264:dup             
	//  809 1265:iconst_2        
	//  810 1266:sipush          209
	//  811 1269:iastore         
	//  812 1270:dup             
	//  813 1271:iconst_3        
	//  814 1272:sipush          255
	//  815 1275:iastore         
	//  816 1276:invokevirtual   #25  <Method Object put(Object, Object)>
	//  817 1279:pop             
		NAMES.put("darkviolet", ((Object) (new int[] {
			148, 0, 211, 255
		})));
	//  818 1280:getstatic       #19  <Field WebColors NAMES>
	//  819 1283:ldc1            #99  <String "darkviolet">
	//  820 1285:iconst_4        
	//  821 1286:newarray        int[]
	//  822 1288:dup             
	//  823 1289:iconst_0        
	//  824 1290:sipush          148
	//  825 1293:iastore         
	//  826 1294:dup             
	//  827 1295:iconst_1        
	//  828 1296:iconst_0        
	//  829 1297:iastore         
	//  830 1298:dup             
	//  831 1299:iconst_2        
	//  832 1300:sipush          211
	//  833 1303:iastore         
	//  834 1304:dup             
	//  835 1305:iconst_3        
	//  836 1306:sipush          255
	//  837 1309:iastore         
	//  838 1310:invokevirtual   #25  <Method Object put(Object, Object)>
	//  839 1313:pop             
		NAMES.put("deeppink", ((Object) (new int[] {
			255, 20, 147, 255
		})));
	//  840 1314:getstatic       #19  <Field WebColors NAMES>
	//  841 1317:ldc1            #101 <String "deeppink">
	//  842 1319:iconst_4        
	//  843 1320:newarray        int[]
	//  844 1322:dup             
	//  845 1323:iconst_0        
	//  846 1324:sipush          255
	//  847 1327:iastore         
	//  848 1328:dup             
	//  849 1329:iconst_1        
	//  850 1330:bipush          20
	//  851 1332:iastore         
	//  852 1333:dup             
	//  853 1334:iconst_2        
	//  854 1335:sipush          147
	//  855 1338:iastore         
	//  856 1339:dup             
	//  857 1340:iconst_3        
	//  858 1341:sipush          255
	//  859 1344:iastore         
	//  860 1345:invokevirtual   #25  <Method Object put(Object, Object)>
	//  861 1348:pop             
		NAMES.put("deepskyblue", ((Object) (new int[] {
			0, 191, 255, 255
		})));
	//  862 1349:getstatic       #19  <Field WebColors NAMES>
	//  863 1352:ldc1            #103 <String "deepskyblue">
	//  864 1354:iconst_4        
	//  865 1355:newarray        int[]
	//  866 1357:dup             
	//  867 1358:iconst_0        
	//  868 1359:iconst_0        
	//  869 1360:iastore         
	//  870 1361:dup             
	//  871 1362:iconst_1        
	//  872 1363:sipush          191
	//  873 1366:iastore         
	//  874 1367:dup             
	//  875 1368:iconst_2        
	//  876 1369:sipush          255
	//  877 1372:iastore         
	//  878 1373:dup             
	//  879 1374:iconst_3        
	//  880 1375:sipush          255
	//  881 1378:iastore         
	//  882 1379:invokevirtual   #25  <Method Object put(Object, Object)>
	//  883 1382:pop             
		NAMES.put("dimgray", ((Object) (new int[] {
			105, 105, 105, 255
		})));
	//  884 1383:getstatic       #19  <Field WebColors NAMES>
	//  885 1386:ldc1            #105 <String "dimgray">
	//  886 1388:iconst_4        
	//  887 1389:newarray        int[]
	//  888 1391:dup             
	//  889 1392:iconst_0        
	//  890 1393:bipush          105
	//  891 1395:iastore         
	//  892 1396:dup             
	//  893 1397:iconst_1        
	//  894 1398:bipush          105
	//  895 1400:iastore         
	//  896 1401:dup             
	//  897 1402:iconst_2        
	//  898 1403:bipush          105
	//  899 1405:iastore         
	//  900 1406:dup             
	//  901 1407:iconst_3        
	//  902 1408:sipush          255
	//  903 1411:iastore         
	//  904 1412:invokevirtual   #25  <Method Object put(Object, Object)>
	//  905 1415:pop             
		NAMES.put("dodgerblue", ((Object) (new int[] {
			30, 144, 255, 255
		})));
	//  906 1416:getstatic       #19  <Field WebColors NAMES>
	//  907 1419:ldc1            #107 <String "dodgerblue">
	//  908 1421:iconst_4        
	//  909 1422:newarray        int[]
	//  910 1424:dup             
	//  911 1425:iconst_0        
	//  912 1426:bipush          30
	//  913 1428:iastore         
	//  914 1429:dup             
	//  915 1430:iconst_1        
	//  916 1431:sipush          144
	//  917 1434:iastore         
	//  918 1435:dup             
	//  919 1436:iconst_2        
	//  920 1437:sipush          255
	//  921 1440:iastore         
	//  922 1441:dup             
	//  923 1442:iconst_3        
	//  924 1443:sipush          255
	//  925 1446:iastore         
	//  926 1447:invokevirtual   #25  <Method Object put(Object, Object)>
	//  927 1450:pop             
		NAMES.put("firebrick", ((Object) (new int[] {
			178, 34, 34, 255
		})));
	//  928 1451:getstatic       #19  <Field WebColors NAMES>
	//  929 1454:ldc1            #109 <String "firebrick">
	//  930 1456:iconst_4        
	//  931 1457:newarray        int[]
	//  932 1459:dup             
	//  933 1460:iconst_0        
	//  934 1461:sipush          178
	//  935 1464:iastore         
	//  936 1465:dup             
	//  937 1466:iconst_1        
	//  938 1467:bipush          34
	//  939 1469:iastore         
	//  940 1470:dup             
	//  941 1471:iconst_2        
	//  942 1472:bipush          34
	//  943 1474:iastore         
	//  944 1475:dup             
	//  945 1476:iconst_3        
	//  946 1477:sipush          255
	//  947 1480:iastore         
	//  948 1481:invokevirtual   #25  <Method Object put(Object, Object)>
	//  949 1484:pop             
		NAMES.put("floralwhite", ((Object) (new int[] {
			255, 250, 240, 255
		})));
	//  950 1485:getstatic       #19  <Field WebColors NAMES>
	//  951 1488:ldc1            #111 <String "floralwhite">
	//  952 1490:iconst_4        
	//  953 1491:newarray        int[]
	//  954 1493:dup             
	//  955 1494:iconst_0        
	//  956 1495:sipush          255
	//  957 1498:iastore         
	//  958 1499:dup             
	//  959 1500:iconst_1        
	//  960 1501:sipush          250
	//  961 1504:iastore         
	//  962 1505:dup             
	//  963 1506:iconst_2        
	//  964 1507:sipush          240
	//  965 1510:iastore         
	//  966 1511:dup             
	//  967 1512:iconst_3        
	//  968 1513:sipush          255
	//  969 1516:iastore         
	//  970 1517:invokevirtual   #25  <Method Object put(Object, Object)>
	//  971 1520:pop             
		NAMES.put("forestgreen", ((Object) (new int[] {
			34, 139, 34, 255
		})));
	//  972 1521:getstatic       #19  <Field WebColors NAMES>
	//  973 1524:ldc1            #113 <String "forestgreen">
	//  974 1526:iconst_4        
	//  975 1527:newarray        int[]
	//  976 1529:dup             
	//  977 1530:iconst_0        
	//  978 1531:bipush          34
	//  979 1533:iastore         
	//  980 1534:dup             
	//  981 1535:iconst_1        
	//  982 1536:sipush          139
	//  983 1539:iastore         
	//  984 1540:dup             
	//  985 1541:iconst_2        
	//  986 1542:bipush          34
	//  987 1544:iastore         
	//  988 1545:dup             
	//  989 1546:iconst_3        
	//  990 1547:sipush          255
	//  991 1550:iastore         
	//  992 1551:invokevirtual   #25  <Method Object put(Object, Object)>
	//  993 1554:pop             
		NAMES.put("fuchsia", ((Object) (new int[] {
			255, 0, 255, 255
		})));
	//  994 1555:getstatic       #19  <Field WebColors NAMES>
	//  995 1558:ldc1            #115 <String "fuchsia">
	//  996 1560:iconst_4        
	//  997 1561:newarray        int[]
	//  998 1563:dup             
	//  999 1564:iconst_0        
	// 1000 1565:sipush          255
	// 1001 1568:iastore         
	// 1002 1569:dup             
	// 1003 1570:iconst_1        
	// 1004 1571:iconst_0        
	// 1005 1572:iastore         
	// 1006 1573:dup             
	// 1007 1574:iconst_2        
	// 1008 1575:sipush          255
	// 1009 1578:iastore         
	// 1010 1579:dup             
	// 1011 1580:iconst_3        
	// 1012 1581:sipush          255
	// 1013 1584:iastore         
	// 1014 1585:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1015 1588:pop             
		NAMES.put("gainsboro", ((Object) (new int[] {
			220, 220, 220, 255
		})));
	// 1016 1589:getstatic       #19  <Field WebColors NAMES>
	// 1017 1592:ldc1            #117 <String "gainsboro">
	// 1018 1594:iconst_4        
	// 1019 1595:newarray        int[]
	// 1020 1597:dup             
	// 1021 1598:iconst_0        
	// 1022 1599:sipush          220
	// 1023 1602:iastore         
	// 1024 1603:dup             
	// 1025 1604:iconst_1        
	// 1026 1605:sipush          220
	// 1027 1608:iastore         
	// 1028 1609:dup             
	// 1029 1610:iconst_2        
	// 1030 1611:sipush          220
	// 1031 1614:iastore         
	// 1032 1615:dup             
	// 1033 1616:iconst_3        
	// 1034 1617:sipush          255
	// 1035 1620:iastore         
	// 1036 1621:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1037 1624:pop             
		NAMES.put("ghostwhite", ((Object) (new int[] {
			248, 248, 255, 255
		})));
	// 1038 1625:getstatic       #19  <Field WebColors NAMES>
	// 1039 1628:ldc1            #119 <String "ghostwhite">
	// 1040 1630:iconst_4        
	// 1041 1631:newarray        int[]
	// 1042 1633:dup             
	// 1043 1634:iconst_0        
	// 1044 1635:sipush          248
	// 1045 1638:iastore         
	// 1046 1639:dup             
	// 1047 1640:iconst_1        
	// 1048 1641:sipush          248
	// 1049 1644:iastore         
	// 1050 1645:dup             
	// 1051 1646:iconst_2        
	// 1052 1647:sipush          255
	// 1053 1650:iastore         
	// 1054 1651:dup             
	// 1055 1652:iconst_3        
	// 1056 1653:sipush          255
	// 1057 1656:iastore         
	// 1058 1657:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1059 1660:pop             
		NAMES.put("gold", ((Object) (new int[] {
			255, 215, 0, 255
		})));
	// 1060 1661:getstatic       #19  <Field WebColors NAMES>
	// 1061 1664:ldc1            #121 <String "gold">
	// 1062 1666:iconst_4        
	// 1063 1667:newarray        int[]
	// 1064 1669:dup             
	// 1065 1670:iconst_0        
	// 1066 1671:sipush          255
	// 1067 1674:iastore         
	// 1068 1675:dup             
	// 1069 1676:iconst_1        
	// 1070 1677:sipush          215
	// 1071 1680:iastore         
	// 1072 1681:dup             
	// 1073 1682:iconst_2        
	// 1074 1683:iconst_0        
	// 1075 1684:iastore         
	// 1076 1685:dup             
	// 1077 1686:iconst_3        
	// 1078 1687:sipush          255
	// 1079 1690:iastore         
	// 1080 1691:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1081 1694:pop             
		NAMES.put("goldenrod", ((Object) (new int[] {
			218, 165, 32, 255
		})));
	// 1082 1695:getstatic       #19  <Field WebColors NAMES>
	// 1083 1698:ldc1            #123 <String "goldenrod">
	// 1084 1700:iconst_4        
	// 1085 1701:newarray        int[]
	// 1086 1703:dup             
	// 1087 1704:iconst_0        
	// 1088 1705:sipush          218
	// 1089 1708:iastore         
	// 1090 1709:dup             
	// 1091 1710:iconst_1        
	// 1092 1711:sipush          165
	// 1093 1714:iastore         
	// 1094 1715:dup             
	// 1095 1716:iconst_2        
	// 1096 1717:bipush          32
	// 1097 1719:iastore         
	// 1098 1720:dup             
	// 1099 1721:iconst_3        
	// 1100 1722:sipush          255
	// 1101 1725:iastore         
	// 1102 1726:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1103 1729:pop             
		NAMES.put("gray", ((Object) (new int[] {
			128, 128, 128, 255
		})));
	// 1104 1730:getstatic       #19  <Field WebColors NAMES>
	// 1105 1733:ldc1            #125 <String "gray">
	// 1106 1735:iconst_4        
	// 1107 1736:newarray        int[]
	// 1108 1738:dup             
	// 1109 1739:iconst_0        
	// 1110 1740:sipush          128
	// 1111 1743:iastore         
	// 1112 1744:dup             
	// 1113 1745:iconst_1        
	// 1114 1746:sipush          128
	// 1115 1749:iastore         
	// 1116 1750:dup             
	// 1117 1751:iconst_2        
	// 1118 1752:sipush          128
	// 1119 1755:iastore         
	// 1120 1756:dup             
	// 1121 1757:iconst_3        
	// 1122 1758:sipush          255
	// 1123 1761:iastore         
	// 1124 1762:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1125 1765:pop             
		NAMES.put("green", ((Object) (new int[] {
			0, 128, 0, 255
		})));
	// 1126 1766:getstatic       #19  <Field WebColors NAMES>
	// 1127 1769:ldc1            #127 <String "green">
	// 1128 1771:iconst_4        
	// 1129 1772:newarray        int[]
	// 1130 1774:dup             
	// 1131 1775:iconst_0        
	// 1132 1776:iconst_0        
	// 1133 1777:iastore         
	// 1134 1778:dup             
	// 1135 1779:iconst_1        
	// 1136 1780:sipush          128
	// 1137 1783:iastore         
	// 1138 1784:dup             
	// 1139 1785:iconst_2        
	// 1140 1786:iconst_0        
	// 1141 1787:iastore         
	// 1142 1788:dup             
	// 1143 1789:iconst_3        
	// 1144 1790:sipush          255
	// 1145 1793:iastore         
	// 1146 1794:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1147 1797:pop             
		NAMES.put("greenyellow", ((Object) (new int[] {
			173, 255, 47, 255
		})));
	// 1148 1798:getstatic       #19  <Field WebColors NAMES>
	// 1149 1801:ldc1            #129 <String "greenyellow">
	// 1150 1803:iconst_4        
	// 1151 1804:newarray        int[]
	// 1152 1806:dup             
	// 1153 1807:iconst_0        
	// 1154 1808:sipush          173
	// 1155 1811:iastore         
	// 1156 1812:dup             
	// 1157 1813:iconst_1        
	// 1158 1814:sipush          255
	// 1159 1817:iastore         
	// 1160 1818:dup             
	// 1161 1819:iconst_2        
	// 1162 1820:bipush          47
	// 1163 1822:iastore         
	// 1164 1823:dup             
	// 1165 1824:iconst_3        
	// 1166 1825:sipush          255
	// 1167 1828:iastore         
	// 1168 1829:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1169 1832:pop             
		NAMES.put("honeydew", ((Object) (new int[] {
			240, 255, 240, 255
		})));
	// 1170 1833:getstatic       #19  <Field WebColors NAMES>
	// 1171 1836:ldc1            #131 <String "honeydew">
	// 1172 1838:iconst_4        
	// 1173 1839:newarray        int[]
	// 1174 1841:dup             
	// 1175 1842:iconst_0        
	// 1176 1843:sipush          240
	// 1177 1846:iastore         
	// 1178 1847:dup             
	// 1179 1848:iconst_1        
	// 1180 1849:sipush          255
	// 1181 1852:iastore         
	// 1182 1853:dup             
	// 1183 1854:iconst_2        
	// 1184 1855:sipush          240
	// 1185 1858:iastore         
	// 1186 1859:dup             
	// 1187 1860:iconst_3        
	// 1188 1861:sipush          255
	// 1189 1864:iastore         
	// 1190 1865:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1191 1868:pop             
		NAMES.put("hotpink", ((Object) (new int[] {
			255, 105, 180, 255
		})));
	// 1192 1869:getstatic       #19  <Field WebColors NAMES>
	// 1193 1872:ldc1            #133 <String "hotpink">
	// 1194 1874:iconst_4        
	// 1195 1875:newarray        int[]
	// 1196 1877:dup             
	// 1197 1878:iconst_0        
	// 1198 1879:sipush          255
	// 1199 1882:iastore         
	// 1200 1883:dup             
	// 1201 1884:iconst_1        
	// 1202 1885:bipush          105
	// 1203 1887:iastore         
	// 1204 1888:dup             
	// 1205 1889:iconst_2        
	// 1206 1890:sipush          180
	// 1207 1893:iastore         
	// 1208 1894:dup             
	// 1209 1895:iconst_3        
	// 1210 1896:sipush          255
	// 1211 1899:iastore         
	// 1212 1900:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1213 1903:pop             
		NAMES.put("indianred", ((Object) (new int[] {
			205, 92, 92, 255
		})));
	// 1214 1904:getstatic       #19  <Field WebColors NAMES>
	// 1215 1907:ldc1            #135 <String "indianred">
	// 1216 1909:iconst_4        
	// 1217 1910:newarray        int[]
	// 1218 1912:dup             
	// 1219 1913:iconst_0        
	// 1220 1914:sipush          205
	// 1221 1917:iastore         
	// 1222 1918:dup             
	// 1223 1919:iconst_1        
	// 1224 1920:bipush          92
	// 1225 1922:iastore         
	// 1226 1923:dup             
	// 1227 1924:iconst_2        
	// 1228 1925:bipush          92
	// 1229 1927:iastore         
	// 1230 1928:dup             
	// 1231 1929:iconst_3        
	// 1232 1930:sipush          255
	// 1233 1933:iastore         
	// 1234 1934:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1235 1937:pop             
		NAMES.put("indigo", ((Object) (new int[] {
			75, 0, 130, 255
		})));
	// 1236 1938:getstatic       #19  <Field WebColors NAMES>
	// 1237 1941:ldc1            #137 <String "indigo">
	// 1238 1943:iconst_4        
	// 1239 1944:newarray        int[]
	// 1240 1946:dup             
	// 1241 1947:iconst_0        
	// 1242 1948:bipush          75
	// 1243 1950:iastore         
	// 1244 1951:dup             
	// 1245 1952:iconst_1        
	// 1246 1953:iconst_0        
	// 1247 1954:iastore         
	// 1248 1955:dup             
	// 1249 1956:iconst_2        
	// 1250 1957:sipush          130
	// 1251 1960:iastore         
	// 1252 1961:dup             
	// 1253 1962:iconst_3        
	// 1254 1963:sipush          255
	// 1255 1966:iastore         
	// 1256 1967:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1257 1970:pop             
		NAMES.put("ivory", ((Object) (new int[] {
			255, 255, 240, 255
		})));
	// 1258 1971:getstatic       #19  <Field WebColors NAMES>
	// 1259 1974:ldc1            #139 <String "ivory">
	// 1260 1976:iconst_4        
	// 1261 1977:newarray        int[]
	// 1262 1979:dup             
	// 1263 1980:iconst_0        
	// 1264 1981:sipush          255
	// 1265 1984:iastore         
	// 1266 1985:dup             
	// 1267 1986:iconst_1        
	// 1268 1987:sipush          255
	// 1269 1990:iastore         
	// 1270 1991:dup             
	// 1271 1992:iconst_2        
	// 1272 1993:sipush          240
	// 1273 1996:iastore         
	// 1274 1997:dup             
	// 1275 1998:iconst_3        
	// 1276 1999:sipush          255
	// 1277 2002:iastore         
	// 1278 2003:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1279 2006:pop             
		NAMES.put("khaki", ((Object) (new int[] {
			240, 230, 140, 255
		})));
	// 1280 2007:getstatic       #19  <Field WebColors NAMES>
	// 1281 2010:ldc1            #141 <String "khaki">
	// 1282 2012:iconst_4        
	// 1283 2013:newarray        int[]
	// 1284 2015:dup             
	// 1285 2016:iconst_0        
	// 1286 2017:sipush          240
	// 1287 2020:iastore         
	// 1288 2021:dup             
	// 1289 2022:iconst_1        
	// 1290 2023:sipush          230
	// 1291 2026:iastore         
	// 1292 2027:dup             
	// 1293 2028:iconst_2        
	// 1294 2029:sipush          140
	// 1295 2032:iastore         
	// 1296 2033:dup             
	// 1297 2034:iconst_3        
	// 1298 2035:sipush          255
	// 1299 2038:iastore         
	// 1300 2039:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1301 2042:pop             
		NAMES.put("lavender", ((Object) (new int[] {
			230, 230, 250, 255
		})));
	// 1302 2043:getstatic       #19  <Field WebColors NAMES>
	// 1303 2046:ldc1            #143 <String "lavender">
	// 1304 2048:iconst_4        
	// 1305 2049:newarray        int[]
	// 1306 2051:dup             
	// 1307 2052:iconst_0        
	// 1308 2053:sipush          230
	// 1309 2056:iastore         
	// 1310 2057:dup             
	// 1311 2058:iconst_1        
	// 1312 2059:sipush          230
	// 1313 2062:iastore         
	// 1314 2063:dup             
	// 1315 2064:iconst_2        
	// 1316 2065:sipush          250
	// 1317 2068:iastore         
	// 1318 2069:dup             
	// 1319 2070:iconst_3        
	// 1320 2071:sipush          255
	// 1321 2074:iastore         
	// 1322 2075:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1323 2078:pop             
		NAMES.put("lavenderblush", ((Object) (new int[] {
			255, 240, 245, 255
		})));
	// 1324 2079:getstatic       #19  <Field WebColors NAMES>
	// 1325 2082:ldc1            #145 <String "lavenderblush">
	// 1326 2084:iconst_4        
	// 1327 2085:newarray        int[]
	// 1328 2087:dup             
	// 1329 2088:iconst_0        
	// 1330 2089:sipush          255
	// 1331 2092:iastore         
	// 1332 2093:dup             
	// 1333 2094:iconst_1        
	// 1334 2095:sipush          240
	// 1335 2098:iastore         
	// 1336 2099:dup             
	// 1337 2100:iconst_2        
	// 1338 2101:sipush          245
	// 1339 2104:iastore         
	// 1340 2105:dup             
	// 1341 2106:iconst_3        
	// 1342 2107:sipush          255
	// 1343 2110:iastore         
	// 1344 2111:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1345 2114:pop             
		NAMES.put("lawngreen", ((Object) (new int[] {
			124, 252, 0, 255
		})));
	// 1346 2115:getstatic       #19  <Field WebColors NAMES>
	// 1347 2118:ldc1            #147 <String "lawngreen">
	// 1348 2120:iconst_4        
	// 1349 2121:newarray        int[]
	// 1350 2123:dup             
	// 1351 2124:iconst_0        
	// 1352 2125:bipush          124
	// 1353 2127:iastore         
	// 1354 2128:dup             
	// 1355 2129:iconst_1        
	// 1356 2130:sipush          252
	// 1357 2133:iastore         
	// 1358 2134:dup             
	// 1359 2135:iconst_2        
	// 1360 2136:iconst_0        
	// 1361 2137:iastore         
	// 1362 2138:dup             
	// 1363 2139:iconst_3        
	// 1364 2140:sipush          255
	// 1365 2143:iastore         
	// 1366 2144:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1367 2147:pop             
		NAMES.put("lemonchiffon", ((Object) (new int[] {
			255, 250, 205, 255
		})));
	// 1368 2148:getstatic       #19  <Field WebColors NAMES>
	// 1369 2151:ldc1            #149 <String "lemonchiffon">
	// 1370 2153:iconst_4        
	// 1371 2154:newarray        int[]
	// 1372 2156:dup             
	// 1373 2157:iconst_0        
	// 1374 2158:sipush          255
	// 1375 2161:iastore         
	// 1376 2162:dup             
	// 1377 2163:iconst_1        
	// 1378 2164:sipush          250
	// 1379 2167:iastore         
	// 1380 2168:dup             
	// 1381 2169:iconst_2        
	// 1382 2170:sipush          205
	// 1383 2173:iastore         
	// 1384 2174:dup             
	// 1385 2175:iconst_3        
	// 1386 2176:sipush          255
	// 1387 2179:iastore         
	// 1388 2180:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1389 2183:pop             
		NAMES.put("lightblue", ((Object) (new int[] {
			173, 216, 230, 255
		})));
	// 1390 2184:getstatic       #19  <Field WebColors NAMES>
	// 1391 2187:ldc1            #151 <String "lightblue">
	// 1392 2189:iconst_4        
	// 1393 2190:newarray        int[]
	// 1394 2192:dup             
	// 1395 2193:iconst_0        
	// 1396 2194:sipush          173
	// 1397 2197:iastore         
	// 1398 2198:dup             
	// 1399 2199:iconst_1        
	// 1400 2200:sipush          216
	// 1401 2203:iastore         
	// 1402 2204:dup             
	// 1403 2205:iconst_2        
	// 1404 2206:sipush          230
	// 1405 2209:iastore         
	// 1406 2210:dup             
	// 1407 2211:iconst_3        
	// 1408 2212:sipush          255
	// 1409 2215:iastore         
	// 1410 2216:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1411 2219:pop             
		NAMES.put("lightcoral", ((Object) (new int[] {
			240, 128, 128, 255
		})));
	// 1412 2220:getstatic       #19  <Field WebColors NAMES>
	// 1413 2223:ldc1            #153 <String "lightcoral">
	// 1414 2225:iconst_4        
	// 1415 2226:newarray        int[]
	// 1416 2228:dup             
	// 1417 2229:iconst_0        
	// 1418 2230:sipush          240
	// 1419 2233:iastore         
	// 1420 2234:dup             
	// 1421 2235:iconst_1        
	// 1422 2236:sipush          128
	// 1423 2239:iastore         
	// 1424 2240:dup             
	// 1425 2241:iconst_2        
	// 1426 2242:sipush          128
	// 1427 2245:iastore         
	// 1428 2246:dup             
	// 1429 2247:iconst_3        
	// 1430 2248:sipush          255
	// 1431 2251:iastore         
	// 1432 2252:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1433 2255:pop             
		NAMES.put("lightcyan", ((Object) (new int[] {
			224, 255, 255, 255
		})));
	// 1434 2256:getstatic       #19  <Field WebColors NAMES>
	// 1435 2259:ldc1            #155 <String "lightcyan">
	// 1436 2261:iconst_4        
	// 1437 2262:newarray        int[]
	// 1438 2264:dup             
	// 1439 2265:iconst_0        
	// 1440 2266:sipush          224
	// 1441 2269:iastore         
	// 1442 2270:dup             
	// 1443 2271:iconst_1        
	// 1444 2272:sipush          255
	// 1445 2275:iastore         
	// 1446 2276:dup             
	// 1447 2277:iconst_2        
	// 1448 2278:sipush          255
	// 1449 2281:iastore         
	// 1450 2282:dup             
	// 1451 2283:iconst_3        
	// 1452 2284:sipush          255
	// 1453 2287:iastore         
	// 1454 2288:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1455 2291:pop             
		NAMES.put("lightgoldenrodyellow", ((Object) (new int[] {
			250, 250, 210, 255
		})));
	// 1456 2292:getstatic       #19  <Field WebColors NAMES>
	// 1457 2295:ldc1            #157 <String "lightgoldenrodyellow">
	// 1458 2297:iconst_4        
	// 1459 2298:newarray        int[]
	// 1460 2300:dup             
	// 1461 2301:iconst_0        
	// 1462 2302:sipush          250
	// 1463 2305:iastore         
	// 1464 2306:dup             
	// 1465 2307:iconst_1        
	// 1466 2308:sipush          250
	// 1467 2311:iastore         
	// 1468 2312:dup             
	// 1469 2313:iconst_2        
	// 1470 2314:sipush          210
	// 1471 2317:iastore         
	// 1472 2318:dup             
	// 1473 2319:iconst_3        
	// 1474 2320:sipush          255
	// 1475 2323:iastore         
	// 1476 2324:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1477 2327:pop             
		NAMES.put("lightgreen", ((Object) (new int[] {
			144, 238, 144, 255
		})));
	// 1478 2328:getstatic       #19  <Field WebColors NAMES>
	// 1479 2331:ldc1            #159 <String "lightgreen">
	// 1480 2333:iconst_4        
	// 1481 2334:newarray        int[]
	// 1482 2336:dup             
	// 1483 2337:iconst_0        
	// 1484 2338:sipush          144
	// 1485 2341:iastore         
	// 1486 2342:dup             
	// 1487 2343:iconst_1        
	// 1488 2344:sipush          238
	// 1489 2347:iastore         
	// 1490 2348:dup             
	// 1491 2349:iconst_2        
	// 1492 2350:sipush          144
	// 1493 2353:iastore         
	// 1494 2354:dup             
	// 1495 2355:iconst_3        
	// 1496 2356:sipush          255
	// 1497 2359:iastore         
	// 1498 2360:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1499 2363:pop             
		NAMES.put("lightgrey", ((Object) (new int[] {
			211, 211, 211, 255
		})));
	// 1500 2364:getstatic       #19  <Field WebColors NAMES>
	// 1501 2367:ldc1            #161 <String "lightgrey">
	// 1502 2369:iconst_4        
	// 1503 2370:newarray        int[]
	// 1504 2372:dup             
	// 1505 2373:iconst_0        
	// 1506 2374:sipush          211
	// 1507 2377:iastore         
	// 1508 2378:dup             
	// 1509 2379:iconst_1        
	// 1510 2380:sipush          211
	// 1511 2383:iastore         
	// 1512 2384:dup             
	// 1513 2385:iconst_2        
	// 1514 2386:sipush          211
	// 1515 2389:iastore         
	// 1516 2390:dup             
	// 1517 2391:iconst_3        
	// 1518 2392:sipush          255
	// 1519 2395:iastore         
	// 1520 2396:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1521 2399:pop             
		NAMES.put("lightpink", ((Object) (new int[] {
			255, 182, 193, 255
		})));
	// 1522 2400:getstatic       #19  <Field WebColors NAMES>
	// 1523 2403:ldc1            #163 <String "lightpink">
	// 1524 2405:iconst_4        
	// 1525 2406:newarray        int[]
	// 1526 2408:dup             
	// 1527 2409:iconst_0        
	// 1528 2410:sipush          255
	// 1529 2413:iastore         
	// 1530 2414:dup             
	// 1531 2415:iconst_1        
	// 1532 2416:sipush          182
	// 1533 2419:iastore         
	// 1534 2420:dup             
	// 1535 2421:iconst_2        
	// 1536 2422:sipush          193
	// 1537 2425:iastore         
	// 1538 2426:dup             
	// 1539 2427:iconst_3        
	// 1540 2428:sipush          255
	// 1541 2431:iastore         
	// 1542 2432:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1543 2435:pop             
		NAMES.put("lightsalmon", ((Object) (new int[] {
			255, 160, 122, 255
		})));
	// 1544 2436:getstatic       #19  <Field WebColors NAMES>
	// 1545 2439:ldc1            #165 <String "lightsalmon">
	// 1546 2441:iconst_4        
	// 1547 2442:newarray        int[]
	// 1548 2444:dup             
	// 1549 2445:iconst_0        
	// 1550 2446:sipush          255
	// 1551 2449:iastore         
	// 1552 2450:dup             
	// 1553 2451:iconst_1        
	// 1554 2452:sipush          160
	// 1555 2455:iastore         
	// 1556 2456:dup             
	// 1557 2457:iconst_2        
	// 1558 2458:bipush          122
	// 1559 2460:iastore         
	// 1560 2461:dup             
	// 1561 2462:iconst_3        
	// 1562 2463:sipush          255
	// 1563 2466:iastore         
	// 1564 2467:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1565 2470:pop             
		NAMES.put("lightseagreen", ((Object) (new int[] {
			32, 178, 170, 255
		})));
	// 1566 2471:getstatic       #19  <Field WebColors NAMES>
	// 1567 2474:ldc1            #167 <String "lightseagreen">
	// 1568 2476:iconst_4        
	// 1569 2477:newarray        int[]
	// 1570 2479:dup             
	// 1571 2480:iconst_0        
	// 1572 2481:bipush          32
	// 1573 2483:iastore         
	// 1574 2484:dup             
	// 1575 2485:iconst_1        
	// 1576 2486:sipush          178
	// 1577 2489:iastore         
	// 1578 2490:dup             
	// 1579 2491:iconst_2        
	// 1580 2492:sipush          170
	// 1581 2495:iastore         
	// 1582 2496:dup             
	// 1583 2497:iconst_3        
	// 1584 2498:sipush          255
	// 1585 2501:iastore         
	// 1586 2502:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1587 2505:pop             
		NAMES.put("lightskyblue", ((Object) (new int[] {
			135, 206, 250, 255
		})));
	// 1588 2506:getstatic       #19  <Field WebColors NAMES>
	// 1589 2509:ldc1            #169 <String "lightskyblue">
	// 1590 2511:iconst_4        
	// 1591 2512:newarray        int[]
	// 1592 2514:dup             
	// 1593 2515:iconst_0        
	// 1594 2516:sipush          135
	// 1595 2519:iastore         
	// 1596 2520:dup             
	// 1597 2521:iconst_1        
	// 1598 2522:sipush          206
	// 1599 2525:iastore         
	// 1600 2526:dup             
	// 1601 2527:iconst_2        
	// 1602 2528:sipush          250
	// 1603 2531:iastore         
	// 1604 2532:dup             
	// 1605 2533:iconst_3        
	// 1606 2534:sipush          255
	// 1607 2537:iastore         
	// 1608 2538:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1609 2541:pop             
		NAMES.put("lightslategray", ((Object) (new int[] {
			119, 136, 153, 255
		})));
	// 1610 2542:getstatic       #19  <Field WebColors NAMES>
	// 1611 2545:ldc1            #171 <String "lightslategray">
	// 1612 2547:iconst_4        
	// 1613 2548:newarray        int[]
	// 1614 2550:dup             
	// 1615 2551:iconst_0        
	// 1616 2552:bipush          119
	// 1617 2554:iastore         
	// 1618 2555:dup             
	// 1619 2556:iconst_1        
	// 1620 2557:sipush          136
	// 1621 2560:iastore         
	// 1622 2561:dup             
	// 1623 2562:iconst_2        
	// 1624 2563:sipush          153
	// 1625 2566:iastore         
	// 1626 2567:dup             
	// 1627 2568:iconst_3        
	// 1628 2569:sipush          255
	// 1629 2572:iastore         
	// 1630 2573:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1631 2576:pop             
		NAMES.put("lightsteelblue", ((Object) (new int[] {
			176, 196, 222, 255
		})));
	// 1632 2577:getstatic       #19  <Field WebColors NAMES>
	// 1633 2580:ldc1            #173 <String "lightsteelblue">
	// 1634 2582:iconst_4        
	// 1635 2583:newarray        int[]
	// 1636 2585:dup             
	// 1637 2586:iconst_0        
	// 1638 2587:sipush          176
	// 1639 2590:iastore         
	// 1640 2591:dup             
	// 1641 2592:iconst_1        
	// 1642 2593:sipush          196
	// 1643 2596:iastore         
	// 1644 2597:dup             
	// 1645 2598:iconst_2        
	// 1646 2599:sipush          222
	// 1647 2602:iastore         
	// 1648 2603:dup             
	// 1649 2604:iconst_3        
	// 1650 2605:sipush          255
	// 1651 2608:iastore         
	// 1652 2609:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1653 2612:pop             
		NAMES.put("lightyellow", ((Object) (new int[] {
			255, 255, 224, 255
		})));
	// 1654 2613:getstatic       #19  <Field WebColors NAMES>
	// 1655 2616:ldc1            #175 <String "lightyellow">
	// 1656 2618:iconst_4        
	// 1657 2619:newarray        int[]
	// 1658 2621:dup             
	// 1659 2622:iconst_0        
	// 1660 2623:sipush          255
	// 1661 2626:iastore         
	// 1662 2627:dup             
	// 1663 2628:iconst_1        
	// 1664 2629:sipush          255
	// 1665 2632:iastore         
	// 1666 2633:dup             
	// 1667 2634:iconst_2        
	// 1668 2635:sipush          224
	// 1669 2638:iastore         
	// 1670 2639:dup             
	// 1671 2640:iconst_3        
	// 1672 2641:sipush          255
	// 1673 2644:iastore         
	// 1674 2645:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1675 2648:pop             
		NAMES.put("lime", ((Object) (new int[] {
			0, 255, 0, 255
		})));
	// 1676 2649:getstatic       #19  <Field WebColors NAMES>
	// 1677 2652:ldc1            #177 <String "lime">
	// 1678 2654:iconst_4        
	// 1679 2655:newarray        int[]
	// 1680 2657:dup             
	// 1681 2658:iconst_0        
	// 1682 2659:iconst_0        
	// 1683 2660:iastore         
	// 1684 2661:dup             
	// 1685 2662:iconst_1        
	// 1686 2663:sipush          255
	// 1687 2666:iastore         
	// 1688 2667:dup             
	// 1689 2668:iconst_2        
	// 1690 2669:iconst_0        
	// 1691 2670:iastore         
	// 1692 2671:dup             
	// 1693 2672:iconst_3        
	// 1694 2673:sipush          255
	// 1695 2676:iastore         
	// 1696 2677:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1697 2680:pop             
		NAMES.put("limegreen", ((Object) (new int[] {
			50, 205, 50, 255
		})));
	// 1698 2681:getstatic       #19  <Field WebColors NAMES>
	// 1699 2684:ldc1            #179 <String "limegreen">
	// 1700 2686:iconst_4        
	// 1701 2687:newarray        int[]
	// 1702 2689:dup             
	// 1703 2690:iconst_0        
	// 1704 2691:bipush          50
	// 1705 2693:iastore         
	// 1706 2694:dup             
	// 1707 2695:iconst_1        
	// 1708 2696:sipush          205
	// 1709 2699:iastore         
	// 1710 2700:dup             
	// 1711 2701:iconst_2        
	// 1712 2702:bipush          50
	// 1713 2704:iastore         
	// 1714 2705:dup             
	// 1715 2706:iconst_3        
	// 1716 2707:sipush          255
	// 1717 2710:iastore         
	// 1718 2711:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1719 2714:pop             
		NAMES.put("linen", ((Object) (new int[] {
			250, 240, 230, 255
		})));
	// 1720 2715:getstatic       #19  <Field WebColors NAMES>
	// 1721 2718:ldc1            #181 <String "linen">
	// 1722 2720:iconst_4        
	// 1723 2721:newarray        int[]
	// 1724 2723:dup             
	// 1725 2724:iconst_0        
	// 1726 2725:sipush          250
	// 1727 2728:iastore         
	// 1728 2729:dup             
	// 1729 2730:iconst_1        
	// 1730 2731:sipush          240
	// 1731 2734:iastore         
	// 1732 2735:dup             
	// 1733 2736:iconst_2        
	// 1734 2737:sipush          230
	// 1735 2740:iastore         
	// 1736 2741:dup             
	// 1737 2742:iconst_3        
	// 1738 2743:sipush          255
	// 1739 2746:iastore         
	// 1740 2747:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1741 2750:pop             
		NAMES.put("magenta", ((Object) (new int[] {
			255, 0, 255, 255
		})));
	// 1742 2751:getstatic       #19  <Field WebColors NAMES>
	// 1743 2754:ldc1            #183 <String "magenta">
	// 1744 2756:iconst_4        
	// 1745 2757:newarray        int[]
	// 1746 2759:dup             
	// 1747 2760:iconst_0        
	// 1748 2761:sipush          255
	// 1749 2764:iastore         
	// 1750 2765:dup             
	// 1751 2766:iconst_1        
	// 1752 2767:iconst_0        
	// 1753 2768:iastore         
	// 1754 2769:dup             
	// 1755 2770:iconst_2        
	// 1756 2771:sipush          255
	// 1757 2774:iastore         
	// 1758 2775:dup             
	// 1759 2776:iconst_3        
	// 1760 2777:sipush          255
	// 1761 2780:iastore         
	// 1762 2781:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1763 2784:pop             
		NAMES.put("maroon", ((Object) (new int[] {
			128, 0, 0, 255
		})));
	// 1764 2785:getstatic       #19  <Field WebColors NAMES>
	// 1765 2788:ldc1            #185 <String "maroon">
	// 1766 2790:iconst_4        
	// 1767 2791:newarray        int[]
	// 1768 2793:dup             
	// 1769 2794:iconst_0        
	// 1770 2795:sipush          128
	// 1771 2798:iastore         
	// 1772 2799:dup             
	// 1773 2800:iconst_1        
	// 1774 2801:iconst_0        
	// 1775 2802:iastore         
	// 1776 2803:dup             
	// 1777 2804:iconst_2        
	// 1778 2805:iconst_0        
	// 1779 2806:iastore         
	// 1780 2807:dup             
	// 1781 2808:iconst_3        
	// 1782 2809:sipush          255
	// 1783 2812:iastore         
	// 1784 2813:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1785 2816:pop             
		NAMES.put("mediumaquamarine", ((Object) (new int[] {
			102, 205, 170, 255
		})));
	// 1786 2817:getstatic       #19  <Field WebColors NAMES>
	// 1787 2820:ldc1            #187 <String "mediumaquamarine">
	// 1788 2822:iconst_4        
	// 1789 2823:newarray        int[]
	// 1790 2825:dup             
	// 1791 2826:iconst_0        
	// 1792 2827:bipush          102
	// 1793 2829:iastore         
	// 1794 2830:dup             
	// 1795 2831:iconst_1        
	// 1796 2832:sipush          205
	// 1797 2835:iastore         
	// 1798 2836:dup             
	// 1799 2837:iconst_2        
	// 1800 2838:sipush          170
	// 1801 2841:iastore         
	// 1802 2842:dup             
	// 1803 2843:iconst_3        
	// 1804 2844:sipush          255
	// 1805 2847:iastore         
	// 1806 2848:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1807 2851:pop             
		NAMES.put("mediumblue", ((Object) (new int[] {
			0, 0, 205, 255
		})));
	// 1808 2852:getstatic       #19  <Field WebColors NAMES>
	// 1809 2855:ldc1            #189 <String "mediumblue">
	// 1810 2857:iconst_4        
	// 1811 2858:newarray        int[]
	// 1812 2860:dup             
	// 1813 2861:iconst_0        
	// 1814 2862:iconst_0        
	// 1815 2863:iastore         
	// 1816 2864:dup             
	// 1817 2865:iconst_1        
	// 1818 2866:iconst_0        
	// 1819 2867:iastore         
	// 1820 2868:dup             
	// 1821 2869:iconst_2        
	// 1822 2870:sipush          205
	// 1823 2873:iastore         
	// 1824 2874:dup             
	// 1825 2875:iconst_3        
	// 1826 2876:sipush          255
	// 1827 2879:iastore         
	// 1828 2880:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1829 2883:pop             
		NAMES.put("mediumorchid", ((Object) (new int[] {
			186, 85, 211, 255
		})));
	// 1830 2884:getstatic       #19  <Field WebColors NAMES>
	// 1831 2887:ldc1            #191 <String "mediumorchid">
	// 1832 2889:iconst_4        
	// 1833 2890:newarray        int[]
	// 1834 2892:dup             
	// 1835 2893:iconst_0        
	// 1836 2894:sipush          186
	// 1837 2897:iastore         
	// 1838 2898:dup             
	// 1839 2899:iconst_1        
	// 1840 2900:bipush          85
	// 1841 2902:iastore         
	// 1842 2903:dup             
	// 1843 2904:iconst_2        
	// 1844 2905:sipush          211
	// 1845 2908:iastore         
	// 1846 2909:dup             
	// 1847 2910:iconst_3        
	// 1848 2911:sipush          255
	// 1849 2914:iastore         
	// 1850 2915:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1851 2918:pop             
		NAMES.put("mediumpurple", ((Object) (new int[] {
			147, 112, 219, 255
		})));
	// 1852 2919:getstatic       #19  <Field WebColors NAMES>
	// 1853 2922:ldc1            #193 <String "mediumpurple">
	// 1854 2924:iconst_4        
	// 1855 2925:newarray        int[]
	// 1856 2927:dup             
	// 1857 2928:iconst_0        
	// 1858 2929:sipush          147
	// 1859 2932:iastore         
	// 1860 2933:dup             
	// 1861 2934:iconst_1        
	// 1862 2935:bipush          112
	// 1863 2937:iastore         
	// 1864 2938:dup             
	// 1865 2939:iconst_2        
	// 1866 2940:sipush          219
	// 1867 2943:iastore         
	// 1868 2944:dup             
	// 1869 2945:iconst_3        
	// 1870 2946:sipush          255
	// 1871 2949:iastore         
	// 1872 2950:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1873 2953:pop             
		NAMES.put("mediumseagreen", ((Object) (new int[] {
			60, 179, 113, 255
		})));
	// 1874 2954:getstatic       #19  <Field WebColors NAMES>
	// 1875 2957:ldc1            #195 <String "mediumseagreen">
	// 1876 2959:iconst_4        
	// 1877 2960:newarray        int[]
	// 1878 2962:dup             
	// 1879 2963:iconst_0        
	// 1880 2964:bipush          60
	// 1881 2966:iastore         
	// 1882 2967:dup             
	// 1883 2968:iconst_1        
	// 1884 2969:sipush          179
	// 1885 2972:iastore         
	// 1886 2973:dup             
	// 1887 2974:iconst_2        
	// 1888 2975:bipush          113
	// 1889 2977:iastore         
	// 1890 2978:dup             
	// 1891 2979:iconst_3        
	// 1892 2980:sipush          255
	// 1893 2983:iastore         
	// 1894 2984:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1895 2987:pop             
		NAMES.put("mediumslateblue", ((Object) (new int[] {
			123, 104, 238, 255
		})));
	// 1896 2988:getstatic       #19  <Field WebColors NAMES>
	// 1897 2991:ldc1            #197 <String "mediumslateblue">
	// 1898 2993:iconst_4        
	// 1899 2994:newarray        int[]
	// 1900 2996:dup             
	// 1901 2997:iconst_0        
	// 1902 2998:bipush          123
	// 1903 3000:iastore         
	// 1904 3001:dup             
	// 1905 3002:iconst_1        
	// 1906 3003:bipush          104
	// 1907 3005:iastore         
	// 1908 3006:dup             
	// 1909 3007:iconst_2        
	// 1910 3008:sipush          238
	// 1911 3011:iastore         
	// 1912 3012:dup             
	// 1913 3013:iconst_3        
	// 1914 3014:sipush          255
	// 1915 3017:iastore         
	// 1916 3018:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1917 3021:pop             
		NAMES.put("mediumspringgreen", ((Object) (new int[] {
			0, 250, 154, 255
		})));
	// 1918 3022:getstatic       #19  <Field WebColors NAMES>
	// 1919 3025:ldc1            #199 <String "mediumspringgreen">
	// 1920 3027:iconst_4        
	// 1921 3028:newarray        int[]
	// 1922 3030:dup             
	// 1923 3031:iconst_0        
	// 1924 3032:iconst_0        
	// 1925 3033:iastore         
	// 1926 3034:dup             
	// 1927 3035:iconst_1        
	// 1928 3036:sipush          250
	// 1929 3039:iastore         
	// 1930 3040:dup             
	// 1931 3041:iconst_2        
	// 1932 3042:sipush          154
	// 1933 3045:iastore         
	// 1934 3046:dup             
	// 1935 3047:iconst_3        
	// 1936 3048:sipush          255
	// 1937 3051:iastore         
	// 1938 3052:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1939 3055:pop             
		NAMES.put("mediumturquoise", ((Object) (new int[] {
			72, 209, 204, 255
		})));
	// 1940 3056:getstatic       #19  <Field WebColors NAMES>
	// 1941 3059:ldc1            #201 <String "mediumturquoise">
	// 1942 3061:iconst_4        
	// 1943 3062:newarray        int[]
	// 1944 3064:dup             
	// 1945 3065:iconst_0        
	// 1946 3066:bipush          72
	// 1947 3068:iastore         
	// 1948 3069:dup             
	// 1949 3070:iconst_1        
	// 1950 3071:sipush          209
	// 1951 3074:iastore         
	// 1952 3075:dup             
	// 1953 3076:iconst_2        
	// 1954 3077:sipush          204
	// 1955 3080:iastore         
	// 1956 3081:dup             
	// 1957 3082:iconst_3        
	// 1958 3083:sipush          255
	// 1959 3086:iastore         
	// 1960 3087:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1961 3090:pop             
		NAMES.put("mediumvioletred", ((Object) (new int[] {
			199, 21, 133, 255
		})));
	// 1962 3091:getstatic       #19  <Field WebColors NAMES>
	// 1963 3094:ldc1            #203 <String "mediumvioletred">
	// 1964 3096:iconst_4        
	// 1965 3097:newarray        int[]
	// 1966 3099:dup             
	// 1967 3100:iconst_0        
	// 1968 3101:sipush          199
	// 1969 3104:iastore         
	// 1970 3105:dup             
	// 1971 3106:iconst_1        
	// 1972 3107:bipush          21
	// 1973 3109:iastore         
	// 1974 3110:dup             
	// 1975 3111:iconst_2        
	// 1976 3112:sipush          133
	// 1977 3115:iastore         
	// 1978 3116:dup             
	// 1979 3117:iconst_3        
	// 1980 3118:sipush          255
	// 1981 3121:iastore         
	// 1982 3122:invokevirtual   #25  <Method Object put(Object, Object)>
	// 1983 3125:pop             
		NAMES.put("midnightblue", ((Object) (new int[] {
			25, 25, 112, 255
		})));
	// 1984 3126:getstatic       #19  <Field WebColors NAMES>
	// 1985 3129:ldc1            #205 <String "midnightblue">
	// 1986 3131:iconst_4        
	// 1987 3132:newarray        int[]
	// 1988 3134:dup             
	// 1989 3135:iconst_0        
	// 1990 3136:bipush          25
	// 1991 3138:iastore         
	// 1992 3139:dup             
	// 1993 3140:iconst_1        
	// 1994 3141:bipush          25
	// 1995 3143:iastore         
	// 1996 3144:dup             
	// 1997 3145:iconst_2        
	// 1998 3146:bipush          112
	// 1999 3148:iastore         
	// 2000 3149:dup             
	// 2001 3150:iconst_3        
	// 2002 3151:sipush          255
	// 2003 3154:iastore         
	// 2004 3155:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2005 3158:pop             
		NAMES.put("mintcream", ((Object) (new int[] {
			245, 255, 250, 255
		})));
	// 2006 3159:getstatic       #19  <Field WebColors NAMES>
	// 2007 3162:ldc1            #207 <String "mintcream">
	// 2008 3164:iconst_4        
	// 2009 3165:newarray        int[]
	// 2010 3167:dup             
	// 2011 3168:iconst_0        
	// 2012 3169:sipush          245
	// 2013 3172:iastore         
	// 2014 3173:dup             
	// 2015 3174:iconst_1        
	// 2016 3175:sipush          255
	// 2017 3178:iastore         
	// 2018 3179:dup             
	// 2019 3180:iconst_2        
	// 2020 3181:sipush          250
	// 2021 3184:iastore         
	// 2022 3185:dup             
	// 2023 3186:iconst_3        
	// 2024 3187:sipush          255
	// 2025 3190:iastore         
	// 2026 3191:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2027 3194:pop             
		NAMES.put("mistyrose", ((Object) (new int[] {
			255, 228, 225, 255
		})));
	// 2028 3195:getstatic       #19  <Field WebColors NAMES>
	// 2029 3198:ldc1            #209 <String "mistyrose">
	// 2030 3200:iconst_4        
	// 2031 3201:newarray        int[]
	// 2032 3203:dup             
	// 2033 3204:iconst_0        
	// 2034 3205:sipush          255
	// 2035 3208:iastore         
	// 2036 3209:dup             
	// 2037 3210:iconst_1        
	// 2038 3211:sipush          228
	// 2039 3214:iastore         
	// 2040 3215:dup             
	// 2041 3216:iconst_2        
	// 2042 3217:sipush          225
	// 2043 3220:iastore         
	// 2044 3221:dup             
	// 2045 3222:iconst_3        
	// 2046 3223:sipush          255
	// 2047 3226:iastore         
	// 2048 3227:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2049 3230:pop             
		NAMES.put("moccasin", ((Object) (new int[] {
			255, 228, 181, 255
		})));
	// 2050 3231:getstatic       #19  <Field WebColors NAMES>
	// 2051 3234:ldc1            #211 <String "moccasin">
	// 2052 3236:iconst_4        
	// 2053 3237:newarray        int[]
	// 2054 3239:dup             
	// 2055 3240:iconst_0        
	// 2056 3241:sipush          255
	// 2057 3244:iastore         
	// 2058 3245:dup             
	// 2059 3246:iconst_1        
	// 2060 3247:sipush          228
	// 2061 3250:iastore         
	// 2062 3251:dup             
	// 2063 3252:iconst_2        
	// 2064 3253:sipush          181
	// 2065 3256:iastore         
	// 2066 3257:dup             
	// 2067 3258:iconst_3        
	// 2068 3259:sipush          255
	// 2069 3262:iastore         
	// 2070 3263:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2071 3266:pop             
		NAMES.put("navajowhite", ((Object) (new int[] {
			255, 222, 173, 255
		})));
	// 2072 3267:getstatic       #19  <Field WebColors NAMES>
	// 2073 3270:ldc1            #213 <String "navajowhite">
	// 2074 3272:iconst_4        
	// 2075 3273:newarray        int[]
	// 2076 3275:dup             
	// 2077 3276:iconst_0        
	// 2078 3277:sipush          255
	// 2079 3280:iastore         
	// 2080 3281:dup             
	// 2081 3282:iconst_1        
	// 2082 3283:sipush          222
	// 2083 3286:iastore         
	// 2084 3287:dup             
	// 2085 3288:iconst_2        
	// 2086 3289:sipush          173
	// 2087 3292:iastore         
	// 2088 3293:dup             
	// 2089 3294:iconst_3        
	// 2090 3295:sipush          255
	// 2091 3298:iastore         
	// 2092 3299:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2093 3302:pop             
		NAMES.put("navy", ((Object) (new int[] {
			0, 0, 128, 255
		})));
	// 2094 3303:getstatic       #19  <Field WebColors NAMES>
	// 2095 3306:ldc1            #215 <String "navy">
	// 2096 3308:iconst_4        
	// 2097 3309:newarray        int[]
	// 2098 3311:dup             
	// 2099 3312:iconst_0        
	// 2100 3313:iconst_0        
	// 2101 3314:iastore         
	// 2102 3315:dup             
	// 2103 3316:iconst_1        
	// 2104 3317:iconst_0        
	// 2105 3318:iastore         
	// 2106 3319:dup             
	// 2107 3320:iconst_2        
	// 2108 3321:sipush          128
	// 2109 3324:iastore         
	// 2110 3325:dup             
	// 2111 3326:iconst_3        
	// 2112 3327:sipush          255
	// 2113 3330:iastore         
	// 2114 3331:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2115 3334:pop             
		NAMES.put("oldlace", ((Object) (new int[] {
			253, 245, 230, 255
		})));
	// 2116 3335:getstatic       #19  <Field WebColors NAMES>
	// 2117 3338:ldc1            #217 <String "oldlace">
	// 2118 3340:iconst_4        
	// 2119 3341:newarray        int[]
	// 2120 3343:dup             
	// 2121 3344:iconst_0        
	// 2122 3345:sipush          253
	// 2123 3348:iastore         
	// 2124 3349:dup             
	// 2125 3350:iconst_1        
	// 2126 3351:sipush          245
	// 2127 3354:iastore         
	// 2128 3355:dup             
	// 2129 3356:iconst_2        
	// 2130 3357:sipush          230
	// 2131 3360:iastore         
	// 2132 3361:dup             
	// 2133 3362:iconst_3        
	// 2134 3363:sipush          255
	// 2135 3366:iastore         
	// 2136 3367:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2137 3370:pop             
		NAMES.put("olive", ((Object) (new int[] {
			128, 128, 0, 255
		})));
	// 2138 3371:getstatic       #19  <Field WebColors NAMES>
	// 2139 3374:ldc1            #219 <String "olive">
	// 2140 3376:iconst_4        
	// 2141 3377:newarray        int[]
	// 2142 3379:dup             
	// 2143 3380:iconst_0        
	// 2144 3381:sipush          128
	// 2145 3384:iastore         
	// 2146 3385:dup             
	// 2147 3386:iconst_1        
	// 2148 3387:sipush          128
	// 2149 3390:iastore         
	// 2150 3391:dup             
	// 2151 3392:iconst_2        
	// 2152 3393:iconst_0        
	// 2153 3394:iastore         
	// 2154 3395:dup             
	// 2155 3396:iconst_3        
	// 2156 3397:sipush          255
	// 2157 3400:iastore         
	// 2158 3401:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2159 3404:pop             
		NAMES.put("olivedrab", ((Object) (new int[] {
			107, 142, 35, 255
		})));
	// 2160 3405:getstatic       #19  <Field WebColors NAMES>
	// 2161 3408:ldc1            #221 <String "olivedrab">
	// 2162 3410:iconst_4        
	// 2163 3411:newarray        int[]
	// 2164 3413:dup             
	// 2165 3414:iconst_0        
	// 2166 3415:bipush          107
	// 2167 3417:iastore         
	// 2168 3418:dup             
	// 2169 3419:iconst_1        
	// 2170 3420:sipush          142
	// 2171 3423:iastore         
	// 2172 3424:dup             
	// 2173 3425:iconst_2        
	// 2174 3426:bipush          35
	// 2175 3428:iastore         
	// 2176 3429:dup             
	// 2177 3430:iconst_3        
	// 2178 3431:sipush          255
	// 2179 3434:iastore         
	// 2180 3435:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2181 3438:pop             
		NAMES.put("orange", ((Object) (new int[] {
			255, 165, 0, 255
		})));
	// 2182 3439:getstatic       #19  <Field WebColors NAMES>
	// 2183 3442:ldc1            #223 <String "orange">
	// 2184 3444:iconst_4        
	// 2185 3445:newarray        int[]
	// 2186 3447:dup             
	// 2187 3448:iconst_0        
	// 2188 3449:sipush          255
	// 2189 3452:iastore         
	// 2190 3453:dup             
	// 2191 3454:iconst_1        
	// 2192 3455:sipush          165
	// 2193 3458:iastore         
	// 2194 3459:dup             
	// 2195 3460:iconst_2        
	// 2196 3461:iconst_0        
	// 2197 3462:iastore         
	// 2198 3463:dup             
	// 2199 3464:iconst_3        
	// 2200 3465:sipush          255
	// 2201 3468:iastore         
	// 2202 3469:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2203 3472:pop             
		NAMES.put("orangered", ((Object) (new int[] {
			255, 69, 0, 255
		})));
	// 2204 3473:getstatic       #19  <Field WebColors NAMES>
	// 2205 3476:ldc1            #225 <String "orangered">
	// 2206 3478:iconst_4        
	// 2207 3479:newarray        int[]
	// 2208 3481:dup             
	// 2209 3482:iconst_0        
	// 2210 3483:sipush          255
	// 2211 3486:iastore         
	// 2212 3487:dup             
	// 2213 3488:iconst_1        
	// 2214 3489:bipush          69
	// 2215 3491:iastore         
	// 2216 3492:dup             
	// 2217 3493:iconst_2        
	// 2218 3494:iconst_0        
	// 2219 3495:iastore         
	// 2220 3496:dup             
	// 2221 3497:iconst_3        
	// 2222 3498:sipush          255
	// 2223 3501:iastore         
	// 2224 3502:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2225 3505:pop             
		NAMES.put("orchid", ((Object) (new int[] {
			218, 112, 214, 255
		})));
	// 2226 3506:getstatic       #19  <Field WebColors NAMES>
	// 2227 3509:ldc1            #227 <String "orchid">
	// 2228 3511:iconst_4        
	// 2229 3512:newarray        int[]
	// 2230 3514:dup             
	// 2231 3515:iconst_0        
	// 2232 3516:sipush          218
	// 2233 3519:iastore         
	// 2234 3520:dup             
	// 2235 3521:iconst_1        
	// 2236 3522:bipush          112
	// 2237 3524:iastore         
	// 2238 3525:dup             
	// 2239 3526:iconst_2        
	// 2240 3527:sipush          214
	// 2241 3530:iastore         
	// 2242 3531:dup             
	// 2243 3532:iconst_3        
	// 2244 3533:sipush          255
	// 2245 3536:iastore         
	// 2246 3537:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2247 3540:pop             
		NAMES.put("palegoldenrod", ((Object) (new int[] {
			238, 232, 170, 255
		})));
	// 2248 3541:getstatic       #19  <Field WebColors NAMES>
	// 2249 3544:ldc1            #229 <String "palegoldenrod">
	// 2250 3546:iconst_4        
	// 2251 3547:newarray        int[]
	// 2252 3549:dup             
	// 2253 3550:iconst_0        
	// 2254 3551:sipush          238
	// 2255 3554:iastore         
	// 2256 3555:dup             
	// 2257 3556:iconst_1        
	// 2258 3557:sipush          232
	// 2259 3560:iastore         
	// 2260 3561:dup             
	// 2261 3562:iconst_2        
	// 2262 3563:sipush          170
	// 2263 3566:iastore         
	// 2264 3567:dup             
	// 2265 3568:iconst_3        
	// 2266 3569:sipush          255
	// 2267 3572:iastore         
	// 2268 3573:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2269 3576:pop             
		NAMES.put("palegreen", ((Object) (new int[] {
			152, 251, 152, 255
		})));
	// 2270 3577:getstatic       #19  <Field WebColors NAMES>
	// 2271 3580:ldc1            #231 <String "palegreen">
	// 2272 3582:iconst_4        
	// 2273 3583:newarray        int[]
	// 2274 3585:dup             
	// 2275 3586:iconst_0        
	// 2276 3587:sipush          152
	// 2277 3590:iastore         
	// 2278 3591:dup             
	// 2279 3592:iconst_1        
	// 2280 3593:sipush          251
	// 2281 3596:iastore         
	// 2282 3597:dup             
	// 2283 3598:iconst_2        
	// 2284 3599:sipush          152
	// 2285 3602:iastore         
	// 2286 3603:dup             
	// 2287 3604:iconst_3        
	// 2288 3605:sipush          255
	// 2289 3608:iastore         
	// 2290 3609:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2291 3612:pop             
		NAMES.put("paleturquoise", ((Object) (new int[] {
			175, 238, 238, 255
		})));
	// 2292 3613:getstatic       #19  <Field WebColors NAMES>
	// 2293 3616:ldc1            #233 <String "paleturquoise">
	// 2294 3618:iconst_4        
	// 2295 3619:newarray        int[]
	// 2296 3621:dup             
	// 2297 3622:iconst_0        
	// 2298 3623:sipush          175
	// 2299 3626:iastore         
	// 2300 3627:dup             
	// 2301 3628:iconst_1        
	// 2302 3629:sipush          238
	// 2303 3632:iastore         
	// 2304 3633:dup             
	// 2305 3634:iconst_2        
	// 2306 3635:sipush          238
	// 2307 3638:iastore         
	// 2308 3639:dup             
	// 2309 3640:iconst_3        
	// 2310 3641:sipush          255
	// 2311 3644:iastore         
	// 2312 3645:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2313 3648:pop             
		NAMES.put("palevioletred", ((Object) (new int[] {
			219, 112, 147, 255
		})));
	// 2314 3649:getstatic       #19  <Field WebColors NAMES>
	// 2315 3652:ldc1            #235 <String "palevioletred">
	// 2316 3654:iconst_4        
	// 2317 3655:newarray        int[]
	// 2318 3657:dup             
	// 2319 3658:iconst_0        
	// 2320 3659:sipush          219
	// 2321 3662:iastore         
	// 2322 3663:dup             
	// 2323 3664:iconst_1        
	// 2324 3665:bipush          112
	// 2325 3667:iastore         
	// 2326 3668:dup             
	// 2327 3669:iconst_2        
	// 2328 3670:sipush          147
	// 2329 3673:iastore         
	// 2330 3674:dup             
	// 2331 3675:iconst_3        
	// 2332 3676:sipush          255
	// 2333 3679:iastore         
	// 2334 3680:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2335 3683:pop             
		NAMES.put("papayawhip", ((Object) (new int[] {
			255, 239, 213, 255
		})));
	// 2336 3684:getstatic       #19  <Field WebColors NAMES>
	// 2337 3687:ldc1            #237 <String "papayawhip">
	// 2338 3689:iconst_4        
	// 2339 3690:newarray        int[]
	// 2340 3692:dup             
	// 2341 3693:iconst_0        
	// 2342 3694:sipush          255
	// 2343 3697:iastore         
	// 2344 3698:dup             
	// 2345 3699:iconst_1        
	// 2346 3700:sipush          239
	// 2347 3703:iastore         
	// 2348 3704:dup             
	// 2349 3705:iconst_2        
	// 2350 3706:sipush          213
	// 2351 3709:iastore         
	// 2352 3710:dup             
	// 2353 3711:iconst_3        
	// 2354 3712:sipush          255
	// 2355 3715:iastore         
	// 2356 3716:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2357 3719:pop             
		NAMES.put("peachpuff", ((Object) (new int[] {
			255, 218, 185, 255
		})));
	// 2358 3720:getstatic       #19  <Field WebColors NAMES>
	// 2359 3723:ldc1            #239 <String "peachpuff">
	// 2360 3725:iconst_4        
	// 2361 3726:newarray        int[]
	// 2362 3728:dup             
	// 2363 3729:iconst_0        
	// 2364 3730:sipush          255
	// 2365 3733:iastore         
	// 2366 3734:dup             
	// 2367 3735:iconst_1        
	// 2368 3736:sipush          218
	// 2369 3739:iastore         
	// 2370 3740:dup             
	// 2371 3741:iconst_2        
	// 2372 3742:sipush          185
	// 2373 3745:iastore         
	// 2374 3746:dup             
	// 2375 3747:iconst_3        
	// 2376 3748:sipush          255
	// 2377 3751:iastore         
	// 2378 3752:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2379 3755:pop             
		NAMES.put("peru", ((Object) (new int[] {
			205, 133, 63, 255
		})));
	// 2380 3756:getstatic       #19  <Field WebColors NAMES>
	// 2381 3759:ldc1            #241 <String "peru">
	// 2382 3761:iconst_4        
	// 2383 3762:newarray        int[]
	// 2384 3764:dup             
	// 2385 3765:iconst_0        
	// 2386 3766:sipush          205
	// 2387 3769:iastore         
	// 2388 3770:dup             
	// 2389 3771:iconst_1        
	// 2390 3772:sipush          133
	// 2391 3775:iastore         
	// 2392 3776:dup             
	// 2393 3777:iconst_2        
	// 2394 3778:bipush          63
	// 2395 3780:iastore         
	// 2396 3781:dup             
	// 2397 3782:iconst_3        
	// 2398 3783:sipush          255
	// 2399 3786:iastore         
	// 2400 3787:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2401 3790:pop             
		NAMES.put("pink", ((Object) (new int[] {
			255, 192, 203, 255
		})));
	// 2402 3791:getstatic       #19  <Field WebColors NAMES>
	// 2403 3794:ldc1            #243 <String "pink">
	// 2404 3796:iconst_4        
	// 2405 3797:newarray        int[]
	// 2406 3799:dup             
	// 2407 3800:iconst_0        
	// 2408 3801:sipush          255
	// 2409 3804:iastore         
	// 2410 3805:dup             
	// 2411 3806:iconst_1        
	// 2412 3807:sipush          192
	// 2413 3810:iastore         
	// 2414 3811:dup             
	// 2415 3812:iconst_2        
	// 2416 3813:sipush          203
	// 2417 3816:iastore         
	// 2418 3817:dup             
	// 2419 3818:iconst_3        
	// 2420 3819:sipush          255
	// 2421 3822:iastore         
	// 2422 3823:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2423 3826:pop             
		NAMES.put("plum", ((Object) (new int[] {
			221, 160, 221, 255
		})));
	// 2424 3827:getstatic       #19  <Field WebColors NAMES>
	// 2425 3830:ldc1            #245 <String "plum">
	// 2426 3832:iconst_4        
	// 2427 3833:newarray        int[]
	// 2428 3835:dup             
	// 2429 3836:iconst_0        
	// 2430 3837:sipush          221
	// 2431 3840:iastore         
	// 2432 3841:dup             
	// 2433 3842:iconst_1        
	// 2434 3843:sipush          160
	// 2435 3846:iastore         
	// 2436 3847:dup             
	// 2437 3848:iconst_2        
	// 2438 3849:sipush          221
	// 2439 3852:iastore         
	// 2440 3853:dup             
	// 2441 3854:iconst_3        
	// 2442 3855:sipush          255
	// 2443 3858:iastore         
	// 2444 3859:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2445 3862:pop             
		NAMES.put("powderblue", ((Object) (new int[] {
			176, 224, 230, 255
		})));
	// 2446 3863:getstatic       #19  <Field WebColors NAMES>
	// 2447 3866:ldc1            #247 <String "powderblue">
	// 2448 3868:iconst_4        
	// 2449 3869:newarray        int[]
	// 2450 3871:dup             
	// 2451 3872:iconst_0        
	// 2452 3873:sipush          176
	// 2453 3876:iastore         
	// 2454 3877:dup             
	// 2455 3878:iconst_1        
	// 2456 3879:sipush          224
	// 2457 3882:iastore         
	// 2458 3883:dup             
	// 2459 3884:iconst_2        
	// 2460 3885:sipush          230
	// 2461 3888:iastore         
	// 2462 3889:dup             
	// 2463 3890:iconst_3        
	// 2464 3891:sipush          255
	// 2465 3894:iastore         
	// 2466 3895:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2467 3898:pop             
		NAMES.put("purple", ((Object) (new int[] {
			128, 0, 128, 255
		})));
	// 2468 3899:getstatic       #19  <Field WebColors NAMES>
	// 2469 3902:ldc1            #249 <String "purple">
	// 2470 3904:iconst_4        
	// 2471 3905:newarray        int[]
	// 2472 3907:dup             
	// 2473 3908:iconst_0        
	// 2474 3909:sipush          128
	// 2475 3912:iastore         
	// 2476 3913:dup             
	// 2477 3914:iconst_1        
	// 2478 3915:iconst_0        
	// 2479 3916:iastore         
	// 2480 3917:dup             
	// 2481 3918:iconst_2        
	// 2482 3919:sipush          128
	// 2483 3922:iastore         
	// 2484 3923:dup             
	// 2485 3924:iconst_3        
	// 2486 3925:sipush          255
	// 2487 3928:iastore         
	// 2488 3929:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2489 3932:pop             
		NAMES.put("red", ((Object) (new int[] {
			255, 0, 0, 255
		})));
	// 2490 3933:getstatic       #19  <Field WebColors NAMES>
	// 2491 3936:ldc1            #251 <String "red">
	// 2492 3938:iconst_4        
	// 2493 3939:newarray        int[]
	// 2494 3941:dup             
	// 2495 3942:iconst_0        
	// 2496 3943:sipush          255
	// 2497 3946:iastore         
	// 2498 3947:dup             
	// 2499 3948:iconst_1        
	// 2500 3949:iconst_0        
	// 2501 3950:iastore         
	// 2502 3951:dup             
	// 2503 3952:iconst_2        
	// 2504 3953:iconst_0        
	// 2505 3954:iastore         
	// 2506 3955:dup             
	// 2507 3956:iconst_3        
	// 2508 3957:sipush          255
	// 2509 3960:iastore         
	// 2510 3961:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2511 3964:pop             
		NAMES.put("rosybrown", ((Object) (new int[] {
			188, 143, 143, 255
		})));
	// 2512 3965:getstatic       #19  <Field WebColors NAMES>
	// 2513 3968:ldc1            #253 <String "rosybrown">
	// 2514 3970:iconst_4        
	// 2515 3971:newarray        int[]
	// 2516 3973:dup             
	// 2517 3974:iconst_0        
	// 2518 3975:sipush          188
	// 2519 3978:iastore         
	// 2520 3979:dup             
	// 2521 3980:iconst_1        
	// 2522 3981:sipush          143
	// 2523 3984:iastore         
	// 2524 3985:dup             
	// 2525 3986:iconst_2        
	// 2526 3987:sipush          143
	// 2527 3990:iastore         
	// 2528 3991:dup             
	// 2529 3992:iconst_3        
	// 2530 3993:sipush          255
	// 2531 3996:iastore         
	// 2532 3997:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2533 4000:pop             
		NAMES.put("royalblue", ((Object) (new int[] {
			65, 105, 225, 255
		})));
	// 2534 4001:getstatic       #19  <Field WebColors NAMES>
	// 2535 4004:ldc1            #255 <String "royalblue">
	// 2536 4006:iconst_4        
	// 2537 4007:newarray        int[]
	// 2538 4009:dup             
	// 2539 4010:iconst_0        
	// 2540 4011:bipush          65
	// 2541 4013:iastore         
	// 2542 4014:dup             
	// 2543 4015:iconst_1        
	// 2544 4016:bipush          105
	// 2545 4018:iastore         
	// 2546 4019:dup             
	// 2547 4020:iconst_2        
	// 2548 4021:sipush          225
	// 2549 4024:iastore         
	// 2550 4025:dup             
	// 2551 4026:iconst_3        
	// 2552 4027:sipush          255
	// 2553 4030:iastore         
	// 2554 4031:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2555 4034:pop             
		NAMES.put("saddlebrown", ((Object) (new int[] {
			139, 69, 19, 255
		})));
	// 2556 4035:getstatic       #19  <Field WebColors NAMES>
	// 2557 4038:ldc2            #257 <String "saddlebrown">
	// 2558 4041:iconst_4        
	// 2559 4042:newarray        int[]
	// 2560 4044:dup             
	// 2561 4045:iconst_0        
	// 2562 4046:sipush          139
	// 2563 4049:iastore         
	// 2564 4050:dup             
	// 2565 4051:iconst_1        
	// 2566 4052:bipush          69
	// 2567 4054:iastore         
	// 2568 4055:dup             
	// 2569 4056:iconst_2        
	// 2570 4057:bipush          19
	// 2571 4059:iastore         
	// 2572 4060:dup             
	// 2573 4061:iconst_3        
	// 2574 4062:sipush          255
	// 2575 4065:iastore         
	// 2576 4066:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2577 4069:pop             
		NAMES.put("salmon", ((Object) (new int[] {
			250, 128, 114, 255
		})));
	// 2578 4070:getstatic       #19  <Field WebColors NAMES>
	// 2579 4073:ldc2            #259 <String "salmon">
	// 2580 4076:iconst_4        
	// 2581 4077:newarray        int[]
	// 2582 4079:dup             
	// 2583 4080:iconst_0        
	// 2584 4081:sipush          250
	// 2585 4084:iastore         
	// 2586 4085:dup             
	// 2587 4086:iconst_1        
	// 2588 4087:sipush          128
	// 2589 4090:iastore         
	// 2590 4091:dup             
	// 2591 4092:iconst_2        
	// 2592 4093:bipush          114
	// 2593 4095:iastore         
	// 2594 4096:dup             
	// 2595 4097:iconst_3        
	// 2596 4098:sipush          255
	// 2597 4101:iastore         
	// 2598 4102:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2599 4105:pop             
		NAMES.put("sandybrown", ((Object) (new int[] {
			244, 164, 96, 255
		})));
	// 2600 4106:getstatic       #19  <Field WebColors NAMES>
	// 2601 4109:ldc2            #261 <String "sandybrown">
	// 2602 4112:iconst_4        
	// 2603 4113:newarray        int[]
	// 2604 4115:dup             
	// 2605 4116:iconst_0        
	// 2606 4117:sipush          244
	// 2607 4120:iastore         
	// 2608 4121:dup             
	// 2609 4122:iconst_1        
	// 2610 4123:sipush          164
	// 2611 4126:iastore         
	// 2612 4127:dup             
	// 2613 4128:iconst_2        
	// 2614 4129:bipush          96
	// 2615 4131:iastore         
	// 2616 4132:dup             
	// 2617 4133:iconst_3        
	// 2618 4134:sipush          255
	// 2619 4137:iastore         
	// 2620 4138:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2621 4141:pop             
		NAMES.put("seagreen", ((Object) (new int[] {
			46, 139, 87, 255
		})));
	// 2622 4142:getstatic       #19  <Field WebColors NAMES>
	// 2623 4145:ldc2            #263 <String "seagreen">
	// 2624 4148:iconst_4        
	// 2625 4149:newarray        int[]
	// 2626 4151:dup             
	// 2627 4152:iconst_0        
	// 2628 4153:bipush          46
	// 2629 4155:iastore         
	// 2630 4156:dup             
	// 2631 4157:iconst_1        
	// 2632 4158:sipush          139
	// 2633 4161:iastore         
	// 2634 4162:dup             
	// 2635 4163:iconst_2        
	// 2636 4164:bipush          87
	// 2637 4166:iastore         
	// 2638 4167:dup             
	// 2639 4168:iconst_3        
	// 2640 4169:sipush          255
	// 2641 4172:iastore         
	// 2642 4173:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2643 4176:pop             
		NAMES.put("seashell", ((Object) (new int[] {
			255, 245, 238, 255
		})));
	// 2644 4177:getstatic       #19  <Field WebColors NAMES>
	// 2645 4180:ldc2            #265 <String "seashell">
	// 2646 4183:iconst_4        
	// 2647 4184:newarray        int[]
	// 2648 4186:dup             
	// 2649 4187:iconst_0        
	// 2650 4188:sipush          255
	// 2651 4191:iastore         
	// 2652 4192:dup             
	// 2653 4193:iconst_1        
	// 2654 4194:sipush          245
	// 2655 4197:iastore         
	// 2656 4198:dup             
	// 2657 4199:iconst_2        
	// 2658 4200:sipush          238
	// 2659 4203:iastore         
	// 2660 4204:dup             
	// 2661 4205:iconst_3        
	// 2662 4206:sipush          255
	// 2663 4209:iastore         
	// 2664 4210:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2665 4213:pop             
		NAMES.put("sienna", ((Object) (new int[] {
			160, 82, 45, 255
		})));
	// 2666 4214:getstatic       #19  <Field WebColors NAMES>
	// 2667 4217:ldc2            #267 <String "sienna">
	// 2668 4220:iconst_4        
	// 2669 4221:newarray        int[]
	// 2670 4223:dup             
	// 2671 4224:iconst_0        
	// 2672 4225:sipush          160
	// 2673 4228:iastore         
	// 2674 4229:dup             
	// 2675 4230:iconst_1        
	// 2676 4231:bipush          82
	// 2677 4233:iastore         
	// 2678 4234:dup             
	// 2679 4235:iconst_2        
	// 2680 4236:bipush          45
	// 2681 4238:iastore         
	// 2682 4239:dup             
	// 2683 4240:iconst_3        
	// 2684 4241:sipush          255
	// 2685 4244:iastore         
	// 2686 4245:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2687 4248:pop             
		NAMES.put("silver", ((Object) (new int[] {
			192, 192, 192, 255
		})));
	// 2688 4249:getstatic       #19  <Field WebColors NAMES>
	// 2689 4252:ldc2            #269 <String "silver">
	// 2690 4255:iconst_4        
	// 2691 4256:newarray        int[]
	// 2692 4258:dup             
	// 2693 4259:iconst_0        
	// 2694 4260:sipush          192
	// 2695 4263:iastore         
	// 2696 4264:dup             
	// 2697 4265:iconst_1        
	// 2698 4266:sipush          192
	// 2699 4269:iastore         
	// 2700 4270:dup             
	// 2701 4271:iconst_2        
	// 2702 4272:sipush          192
	// 2703 4275:iastore         
	// 2704 4276:dup             
	// 2705 4277:iconst_3        
	// 2706 4278:sipush          255
	// 2707 4281:iastore         
	// 2708 4282:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2709 4285:pop             
		NAMES.put("skyblue", ((Object) (new int[] {
			135, 206, 235, 255
		})));
	// 2710 4286:getstatic       #19  <Field WebColors NAMES>
	// 2711 4289:ldc2            #271 <String "skyblue">
	// 2712 4292:iconst_4        
	// 2713 4293:newarray        int[]
	// 2714 4295:dup             
	// 2715 4296:iconst_0        
	// 2716 4297:sipush          135
	// 2717 4300:iastore         
	// 2718 4301:dup             
	// 2719 4302:iconst_1        
	// 2720 4303:sipush          206
	// 2721 4306:iastore         
	// 2722 4307:dup             
	// 2723 4308:iconst_2        
	// 2724 4309:sipush          235
	// 2725 4312:iastore         
	// 2726 4313:dup             
	// 2727 4314:iconst_3        
	// 2728 4315:sipush          255
	// 2729 4318:iastore         
	// 2730 4319:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2731 4322:pop             
		NAMES.put("slateblue", ((Object) (new int[] {
			106, 90, 205, 255
		})));
	// 2732 4323:getstatic       #19  <Field WebColors NAMES>
	// 2733 4326:ldc2            #273 <String "slateblue">
	// 2734 4329:iconst_4        
	// 2735 4330:newarray        int[]
	// 2736 4332:dup             
	// 2737 4333:iconst_0        
	// 2738 4334:bipush          106
	// 2739 4336:iastore         
	// 2740 4337:dup             
	// 2741 4338:iconst_1        
	// 2742 4339:bipush          90
	// 2743 4341:iastore         
	// 2744 4342:dup             
	// 2745 4343:iconst_2        
	// 2746 4344:sipush          205
	// 2747 4347:iastore         
	// 2748 4348:dup             
	// 2749 4349:iconst_3        
	// 2750 4350:sipush          255
	// 2751 4353:iastore         
	// 2752 4354:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2753 4357:pop             
		NAMES.put("slategray", ((Object) (new int[] {
			112, 128, 144, 255
		})));
	// 2754 4358:getstatic       #19  <Field WebColors NAMES>
	// 2755 4361:ldc2            #275 <String "slategray">
	// 2756 4364:iconst_4        
	// 2757 4365:newarray        int[]
	// 2758 4367:dup             
	// 2759 4368:iconst_0        
	// 2760 4369:bipush          112
	// 2761 4371:iastore         
	// 2762 4372:dup             
	// 2763 4373:iconst_1        
	// 2764 4374:sipush          128
	// 2765 4377:iastore         
	// 2766 4378:dup             
	// 2767 4379:iconst_2        
	// 2768 4380:sipush          144
	// 2769 4383:iastore         
	// 2770 4384:dup             
	// 2771 4385:iconst_3        
	// 2772 4386:sipush          255
	// 2773 4389:iastore         
	// 2774 4390:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2775 4393:pop             
		NAMES.put("snow", ((Object) (new int[] {
			255, 250, 250, 255
		})));
	// 2776 4394:getstatic       #19  <Field WebColors NAMES>
	// 2777 4397:ldc2            #277 <String "snow">
	// 2778 4400:iconst_4        
	// 2779 4401:newarray        int[]
	// 2780 4403:dup             
	// 2781 4404:iconst_0        
	// 2782 4405:sipush          255
	// 2783 4408:iastore         
	// 2784 4409:dup             
	// 2785 4410:iconst_1        
	// 2786 4411:sipush          250
	// 2787 4414:iastore         
	// 2788 4415:dup             
	// 2789 4416:iconst_2        
	// 2790 4417:sipush          250
	// 2791 4420:iastore         
	// 2792 4421:dup             
	// 2793 4422:iconst_3        
	// 2794 4423:sipush          255
	// 2795 4426:iastore         
	// 2796 4427:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2797 4430:pop             
		NAMES.put("springgreen", ((Object) (new int[] {
			0, 255, 127, 255
		})));
	// 2798 4431:getstatic       #19  <Field WebColors NAMES>
	// 2799 4434:ldc2            #279 <String "springgreen">
	// 2800 4437:iconst_4        
	// 2801 4438:newarray        int[]
	// 2802 4440:dup             
	// 2803 4441:iconst_0        
	// 2804 4442:iconst_0        
	// 2805 4443:iastore         
	// 2806 4444:dup             
	// 2807 4445:iconst_1        
	// 2808 4446:sipush          255
	// 2809 4449:iastore         
	// 2810 4450:dup             
	// 2811 4451:iconst_2        
	// 2812 4452:bipush          127
	// 2813 4454:iastore         
	// 2814 4455:dup             
	// 2815 4456:iconst_3        
	// 2816 4457:sipush          255
	// 2817 4460:iastore         
	// 2818 4461:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2819 4464:pop             
		NAMES.put("steelblue", ((Object) (new int[] {
			70, 130, 180, 255
		})));
	// 2820 4465:getstatic       #19  <Field WebColors NAMES>
	// 2821 4468:ldc2            #281 <String "steelblue">
	// 2822 4471:iconst_4        
	// 2823 4472:newarray        int[]
	// 2824 4474:dup             
	// 2825 4475:iconst_0        
	// 2826 4476:bipush          70
	// 2827 4478:iastore         
	// 2828 4479:dup             
	// 2829 4480:iconst_1        
	// 2830 4481:sipush          130
	// 2831 4484:iastore         
	// 2832 4485:dup             
	// 2833 4486:iconst_2        
	// 2834 4487:sipush          180
	// 2835 4490:iastore         
	// 2836 4491:dup             
	// 2837 4492:iconst_3        
	// 2838 4493:sipush          255
	// 2839 4496:iastore         
	// 2840 4497:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2841 4500:pop             
		NAMES.put("tan", ((Object) (new int[] {
			210, 180, 140, 255
		})));
	// 2842 4501:getstatic       #19  <Field WebColors NAMES>
	// 2843 4504:ldc2            #283 <String "tan">
	// 2844 4507:iconst_4        
	// 2845 4508:newarray        int[]
	// 2846 4510:dup             
	// 2847 4511:iconst_0        
	// 2848 4512:sipush          210
	// 2849 4515:iastore         
	// 2850 4516:dup             
	// 2851 4517:iconst_1        
	// 2852 4518:sipush          180
	// 2853 4521:iastore         
	// 2854 4522:dup             
	// 2855 4523:iconst_2        
	// 2856 4524:sipush          140
	// 2857 4527:iastore         
	// 2858 4528:dup             
	// 2859 4529:iconst_3        
	// 2860 4530:sipush          255
	// 2861 4533:iastore         
	// 2862 4534:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2863 4537:pop             
		NAMES.put("teal", ((Object) (new int[] {
			0, 128, 128, 255
		})));
	// 2864 4538:getstatic       #19  <Field WebColors NAMES>
	// 2865 4541:ldc2            #285 <String "teal">
	// 2866 4544:iconst_4        
	// 2867 4545:newarray        int[]
	// 2868 4547:dup             
	// 2869 4548:iconst_0        
	// 2870 4549:iconst_0        
	// 2871 4550:iastore         
	// 2872 4551:dup             
	// 2873 4552:iconst_1        
	// 2874 4553:sipush          128
	// 2875 4556:iastore         
	// 2876 4557:dup             
	// 2877 4558:iconst_2        
	// 2878 4559:sipush          128
	// 2879 4562:iastore         
	// 2880 4563:dup             
	// 2881 4564:iconst_3        
	// 2882 4565:sipush          255
	// 2883 4568:iastore         
	// 2884 4569:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2885 4572:pop             
		NAMES.put("thistle", ((Object) (new int[] {
			216, 191, 216, 255
		})));
	// 2886 4573:getstatic       #19  <Field WebColors NAMES>
	// 2887 4576:ldc2            #287 <String "thistle">
	// 2888 4579:iconst_4        
	// 2889 4580:newarray        int[]
	// 2890 4582:dup             
	// 2891 4583:iconst_0        
	// 2892 4584:sipush          216
	// 2893 4587:iastore         
	// 2894 4588:dup             
	// 2895 4589:iconst_1        
	// 2896 4590:sipush          191
	// 2897 4593:iastore         
	// 2898 4594:dup             
	// 2899 4595:iconst_2        
	// 2900 4596:sipush          216
	// 2901 4599:iastore         
	// 2902 4600:dup             
	// 2903 4601:iconst_3        
	// 2904 4602:sipush          255
	// 2905 4605:iastore         
	// 2906 4606:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2907 4609:pop             
		NAMES.put("tomato", ((Object) (new int[] {
			255, 99, 71, 255
		})));
	// 2908 4610:getstatic       #19  <Field WebColors NAMES>
	// 2909 4613:ldc2            #289 <String "tomato">
	// 2910 4616:iconst_4        
	// 2911 4617:newarray        int[]
	// 2912 4619:dup             
	// 2913 4620:iconst_0        
	// 2914 4621:sipush          255
	// 2915 4624:iastore         
	// 2916 4625:dup             
	// 2917 4626:iconst_1        
	// 2918 4627:bipush          99
	// 2919 4629:iastore         
	// 2920 4630:dup             
	// 2921 4631:iconst_2        
	// 2922 4632:bipush          71
	// 2923 4634:iastore         
	// 2924 4635:dup             
	// 2925 4636:iconst_3        
	// 2926 4637:sipush          255
	// 2927 4640:iastore         
	// 2928 4641:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2929 4644:pop             
		NAMES.put("transparent", ((Object) (new int[] {
			255, 255, 255, 0
		})));
	// 2930 4645:getstatic       #19  <Field WebColors NAMES>
	// 2931 4648:ldc2            #291 <String "transparent">
	// 2932 4651:iconst_4        
	// 2933 4652:newarray        int[]
	// 2934 4654:dup             
	// 2935 4655:iconst_0        
	// 2936 4656:sipush          255
	// 2937 4659:iastore         
	// 2938 4660:dup             
	// 2939 4661:iconst_1        
	// 2940 4662:sipush          255
	// 2941 4665:iastore         
	// 2942 4666:dup             
	// 2943 4667:iconst_2        
	// 2944 4668:sipush          255
	// 2945 4671:iastore         
	// 2946 4672:dup             
	// 2947 4673:iconst_3        
	// 2948 4674:iconst_0        
	// 2949 4675:iastore         
	// 2950 4676:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2951 4679:pop             
		NAMES.put("turquoise", ((Object) (new int[] {
			64, 224, 208, 255
		})));
	// 2952 4680:getstatic       #19  <Field WebColors NAMES>
	// 2953 4683:ldc2            #293 <String "turquoise">
	// 2954 4686:iconst_4        
	// 2955 4687:newarray        int[]
	// 2956 4689:dup             
	// 2957 4690:iconst_0        
	// 2958 4691:bipush          64
	// 2959 4693:iastore         
	// 2960 4694:dup             
	// 2961 4695:iconst_1        
	// 2962 4696:sipush          224
	// 2963 4699:iastore         
	// 2964 4700:dup             
	// 2965 4701:iconst_2        
	// 2966 4702:sipush          208
	// 2967 4705:iastore         
	// 2968 4706:dup             
	// 2969 4707:iconst_3        
	// 2970 4708:sipush          255
	// 2971 4711:iastore         
	// 2972 4712:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2973 4715:pop             
		NAMES.put("violet", ((Object) (new int[] {
			238, 130, 238, 255
		})));
	// 2974 4716:getstatic       #19  <Field WebColors NAMES>
	// 2975 4719:ldc2            #295 <String "violet">
	// 2976 4722:iconst_4        
	// 2977 4723:newarray        int[]
	// 2978 4725:dup             
	// 2979 4726:iconst_0        
	// 2980 4727:sipush          238
	// 2981 4730:iastore         
	// 2982 4731:dup             
	// 2983 4732:iconst_1        
	// 2984 4733:sipush          130
	// 2985 4736:iastore         
	// 2986 4737:dup             
	// 2987 4738:iconst_2        
	// 2988 4739:sipush          238
	// 2989 4742:iastore         
	// 2990 4743:dup             
	// 2991 4744:iconst_3        
	// 2992 4745:sipush          255
	// 2993 4748:iastore         
	// 2994 4749:invokevirtual   #25  <Method Object put(Object, Object)>
	// 2995 4752:pop             
		NAMES.put("wheat", ((Object) (new int[] {
			245, 222, 179, 255
		})));
	// 2996 4753:getstatic       #19  <Field WebColors NAMES>
	// 2997 4756:ldc2            #297 <String "wheat">
	// 2998 4759:iconst_4        
	// 2999 4760:newarray        int[]
	// 3000 4762:dup             
	// 3001 4763:iconst_0        
	// 3002 4764:sipush          245
	// 3003 4767:iastore         
	// 3004 4768:dup             
	// 3005 4769:iconst_1        
	// 3006 4770:sipush          222
	// 3007 4773:iastore         
	// 3008 4774:dup             
	// 3009 4775:iconst_2        
	// 3010 4776:sipush          179
	// 3011 4779:iastore         
	// 3012 4780:dup             
	// 3013 4781:iconst_3        
	// 3014 4782:sipush          255
	// 3015 4785:iastore         
	// 3016 4786:invokevirtual   #25  <Method Object put(Object, Object)>
	// 3017 4789:pop             
		NAMES.put("white", ((Object) (new int[] {
			255, 255, 255, 255
		})));
	// 3018 4790:getstatic       #19  <Field WebColors NAMES>
	// 3019 4793:ldc2            #299 <String "white">
	// 3020 4796:iconst_4        
	// 3021 4797:newarray        int[]
	// 3022 4799:dup             
	// 3023 4800:iconst_0        
	// 3024 4801:sipush          255
	// 3025 4804:iastore         
	// 3026 4805:dup             
	// 3027 4806:iconst_1        
	// 3028 4807:sipush          255
	// 3029 4810:iastore         
	// 3030 4811:dup             
	// 3031 4812:iconst_2        
	// 3032 4813:sipush          255
	// 3033 4816:iastore         
	// 3034 4817:dup             
	// 3035 4818:iconst_3        
	// 3036 4819:sipush          255
	// 3037 4822:iastore         
	// 3038 4823:invokevirtual   #25  <Method Object put(Object, Object)>
	// 3039 4826:pop             
		NAMES.put("whitesmoke", ((Object) (new int[] {
			245, 245, 245, 255
		})));
	// 3040 4827:getstatic       #19  <Field WebColors NAMES>
	// 3041 4830:ldc2            #301 <String "whitesmoke">
	// 3042 4833:iconst_4        
	// 3043 4834:newarray        int[]
	// 3044 4836:dup             
	// 3045 4837:iconst_0        
	// 3046 4838:sipush          245
	// 3047 4841:iastore         
	// 3048 4842:dup             
	// 3049 4843:iconst_1        
	// 3050 4844:sipush          245
	// 3051 4847:iastore         
	// 3052 4848:dup             
	// 3053 4849:iconst_2        
	// 3054 4850:sipush          245
	// 3055 4853:iastore         
	// 3056 4854:dup             
	// 3057 4855:iconst_3        
	// 3058 4856:sipush          255
	// 3059 4859:iastore         
	// 3060 4860:invokevirtual   #25  <Method Object put(Object, Object)>
	// 3061 4863:pop             
		NAMES.put("yellow", ((Object) (new int[] {
			255, 255, 0, 255
		})));
	// 3062 4864:getstatic       #19  <Field WebColors NAMES>
	// 3063 4867:ldc2            #303 <String "yellow">
	// 3064 4870:iconst_4        
	// 3065 4871:newarray        int[]
	// 3066 4873:dup             
	// 3067 4874:iconst_0        
	// 3068 4875:sipush          255
	// 3069 4878:iastore         
	// 3070 4879:dup             
	// 3071 4880:iconst_1        
	// 3072 4881:sipush          255
	// 3073 4884:iastore         
	// 3074 4885:dup             
	// 3075 4886:iconst_2        
	// 3076 4887:iconst_0        
	// 3077 4888:iastore         
	// 3078 4889:dup             
	// 3079 4890:iconst_3        
	// 3080 4891:sipush          255
	// 3081 4894:iastore         
	// 3082 4895:invokevirtual   #25  <Method Object put(Object, Object)>
	// 3083 4898:pop             
		NAMES.put("yellowgreen", ((Object) (new int[] {
			154, 205, 50, 255
		})));
	// 3084 4899:getstatic       #19  <Field WebColors NAMES>
	// 3085 4902:ldc2            #305 <String "yellowgreen">
	// 3086 4905:iconst_4        
	// 3087 4906:newarray        int[]
	// 3088 4908:dup             
	// 3089 4909:iconst_0        
	// 3090 4910:sipush          154
	// 3091 4913:iastore         
	// 3092 4914:dup             
	// 3093 4915:iconst_1        
	// 3094 4916:sipush          205
	// 3095 4919:iastore         
	// 3096 4920:dup             
	// 3097 4921:iconst_2        
	// 3098 4922:bipush          50
	// 3099 4924:iastore         
	// 3100 4925:dup             
	// 3101 4926:iconst_3        
	// 3102 4927:sipush          255
	// 3103 4930:iastore         
	// 3104 4931:invokevirtual   #25  <Method Object put(Object, Object)>
	// 3105 4934:pop             
	//*3106 4935:return          
	}
}
