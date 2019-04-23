// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			awp

public final class awr
{

	public static String a(awp awp1)
	{
		if(awp1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #12  <String "">
	//    3    6:areturn         
		StringBuffer stringbuffer = new StringBuffer();
	//    4    7:new             #14  <Class StringBuffer>
	//    5   10:dup             
	//    6   11:invokespecial   #18  <Method void StringBuffer()>
	//    7   14:astore_1        
		try
		{
			a(((String) (null)), ((Object) (awp1)), new StringBuffer(), stringbuffer);
	//    8   15:aconst_null     
	//    9   16:aload_0         
	//   10   17:new             #14  <Class StringBuffer>
	//   11   20:dup             
	//   12   21:invokespecial   #18  <Method void StringBuffer()>
	//   13   24:aload_1         
	//   14   25:invokestatic    #21  <Method void a(String, Object, StringBuffer, StringBuffer)>
		}
	//*  15   28:aload_1         
	//*  16   29:invokevirtual   #25  <Method String StringBuffer.toString()>
	//*  17   32:areturn         
	//*  18   33:astore_0        
	//*  19   34:aload_0         
	//*  20   35:invokevirtual   #28  <Method String InvocationTargetException.getMessage()>
	//*  21   38:invokestatic    #34  <Method String String.valueOf(Object)>
	//*  22   41:astore_0        
	//*  23   42:aload_0         
	//*  24   43:invokevirtual   #38  <Method int String.length()>
	//*  25   46:ifeq            56
	//*  26   49:ldc1            #40  <String "Error printing proto: ">
	//*  27   51:aload_0         
	//*  28   52:invokevirtual   #44  <Method String String.concat(String)>
	//*  29   55:areturn         
	//*  30   56:new             #30  <Class String>
	//*  31   59:dup             
	//*  32   60:ldc1            #40  <String "Error printing proto: ">
	//*  33   62:invokespecial   #47  <Method void String(String)>
	//*  34   65:areturn         
		// Misplaced declaration of an exception variable
		catch(awp awp1)
	//*  35   66:astore_0        
		{
			awp1 = ((awp) (String.valueOf(((Object) (((IllegalAccessException) (awp1)).getMessage())))));
	//   36   67:aload_0         
	//   37   68:invokevirtual   #48  <Method String IllegalAccessException.getMessage()>
	//   38   71:invokestatic    #34  <Method String String.valueOf(Object)>
	//   39   74:astore_0        
			if(((String) (awp1)).length() != 0)
	//*  40   75:aload_0         
	//*  41   76:invokevirtual   #38  <Method int String.length()>
	//*  42   79:ifeq            89
				return "Error printing proto: ".concat(((String) (awp1)));
	//   43   82:ldc1            #40  <String "Error printing proto: ">
	//   44   84:aload_0         
	//   45   85:invokevirtual   #44  <Method String String.concat(String)>
	//   46   88:areturn         
			else
				return new String("Error printing proto: ");
	//   47   89:new             #30  <Class String>
	//   48   92:dup             
	//   49   93:ldc1            #40  <String "Error printing proto: ">
	//   50   95:invokespecial   #47  <Method void String(String)>
	//   51   98:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(awp awp1)
		{
			awp1 = ((awp) (String.valueOf(((Object) (((InvocationTargetException) (awp1)).getMessage())))));
			if(((String) (awp1)).length() != 0)
				return "Error printing proto: ".concat(((String) (awp1)));
			else
				return new String("Error printing proto: ");
		}
		return stringbuffer.toString();
	}

	private static String a(String s)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #14  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void StringBuffer()>
	//    3    7:astore_3        
		for(int i = 0; i < s.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #38  <Method int String.length()>
	//*   9   15:icmpge          79
		{
			char c = s.charAt(i);
	//   10   18:aload_0         
	//   11   19:iload_2         
	//   12   20:invokevirtual   #53  <Method char String.charAt(int)>
	//   13   23:istore_1        
			if(i == 0)
	//*  14   24:iload_2         
	//*  15   25:ifne            40
			{
				stringbuffer.append(Character.toLowerCase(c));
	//   16   28:aload_3         
	//   17   29:iload_1         
	//   18   30:invokestatic    #59  <Method char Character.toLowerCase(char)>
	//   19   33:invokevirtual   #63  <Method StringBuffer StringBuffer.append(char)>
	//   20   36:pop             
				continue;
	//   21   37:goto            72
			}
			if(Character.isUpperCase(c))
	//*  22   40:iload_1         
	//*  23   41:invokestatic    #67  <Method boolean Character.isUpperCase(char)>
	//*  24   44:ifeq            66
			{
				stringbuffer.append('_');
	//   25   47:aload_3         
	//   26   48:bipush          95
	//   27   50:invokevirtual   #63  <Method StringBuffer StringBuffer.append(char)>
	//   28   53:pop             
				stringbuffer.append(Character.toLowerCase(c));
	//   29   54:aload_3         
	//   30   55:iload_1         
	//   31   56:invokestatic    #59  <Method char Character.toLowerCase(char)>
	//   32   59:invokevirtual   #63  <Method StringBuffer StringBuffer.append(char)>
	//   33   62:pop             
			} else
	//*  34   63:goto            72
			{
				stringbuffer.append(c);
	//   35   66:aload_3         
	//   36   67:iload_1         
	//   37   68:invokevirtual   #63  <Method StringBuffer StringBuffer.append(char)>
	//   38   71:pop             
			}
		}

	//   39   72:iload_2         
	//   40   73:iconst_1        
	//   41   74:iadd            
	//   42   75:istore_2        
	//*  43   76:goto            10
		return stringbuffer.toString();
	//   44   79:aload_3         
	//   45   80:invokevirtual   #25  <Method String StringBuffer.toString()>
	//   46   83:areturn         
	}

	private static void a(String s, Object obj, StringBuffer stringbuffer, StringBuffer stringbuffer1)
	{
		if(obj == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          845
_L1:
		if(!(obj instanceof awp)) goto _L4; else goto _L3
	//    2    4:aload_1         
	//    3    5:instanceof      #71  <Class awp>
	//    4    8:ifeq            471
_L3:
		int j;
		int k1;
		int k2;
		Class class1;
		Method amethod[];
		k2 = stringbuffer.length();
	//    5   11:aload_2         
	//    6   12:invokevirtual   #72  <Method int StringBuffer.length()>
	//    7   15:istore          8
		if(s != null)
	//*   8   17:aload_0         
	//*   9   18:ifnull          50
		{
			stringbuffer1.append(stringbuffer);
	//   10   21:aload_3         
	//   11   22:aload_2         
	//   12   23:invokevirtual   #75  <Method StringBuffer StringBuffer.append(StringBuffer)>
	//   13   26:pop             
			stringbuffer1.append(a(s));
	//   14   27:aload_3         
	//   15   28:aload_0         
	//   16   29:invokestatic    #77  <Method String a(String)>
	//   17   32:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//   18   35:pop             
			stringbuffer1.append(" <\n");
	//   19   36:aload_3         
	//   20   37:ldc1            #82  <String " <\n">
	//   21   39:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//   22   42:pop             
			stringbuffer.append("  ");
	//   23   43:aload_2         
	//   24   44:ldc1            #84  <String "  ">
	//   25   46:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//   26   49:pop             
		}
		class1 = obj.getClass();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #88  <Method Class Object.getClass()>
	//   29   54:astore          11
		Field afield[] = class1.getFields();
	//   30   56:aload           11
	//   31   58:invokevirtual   #94  <Method Field[] Class.getFields()>
	//   32   61:astore          10
		int l2 = afield.length;
	//   33   63:aload           10
	//   34   65:arraylength     
	//   35   66:istore          9
		for(int i = 0; i < l2; i++)
	//*  36   68:iconst_0        
	//*  37   69:istore          5
	//*  38   71:iload           5
	//*  39   73:iload           9
	//*  40   75:icmpge          250
		{
			Object obj2 = ((Object) (afield[i]));
	//   41   78:aload           10
	//   42   80:iload           5
	//   43   82:aaload          
	//   44   83:astore          14
			int i1 = ((Field) (obj2)).getModifiers();
	//   45   85:aload           14
	//   46   87:invokevirtual   #99  <Method int Field.getModifiers()>
	//   47   90:istore          6
			String s2 = ((Field) (obj2)).getName();
	//   48   92:aload           14
	//   49   94:invokevirtual   #102 <Method String Field.getName()>
	//   50   97:astore          12
			if("cachedSize".equals(((Object) (s2))) || (i1 & 1) != 1 || (i1 & 8) == 8 || s2.startsWith("_") || s2.endsWith("_"))
				continue;
	//   51   99:ldc1            #104 <String "cachedSize">
	//   52  101:aload           12
	//   53  103:invokevirtual   #108 <Method boolean String.equals(Object)>
	//   54  106:ifne            241
	//   55  109:iload           6
	//   56  111:iconst_1        
	//   57  112:iand            
	//   58  113:iconst_1        
	//   59  114:icmpne          241
	//   60  117:iload           6
	//   61  119:bipush          8
	//   62  121:iand            
	//   63  122:bipush          8
	//   64  124:icmpeq          241
	//   65  127:aload           12
	//   66  129:ldc1            #110 <String "_">
	//   67  131:invokevirtual   #114 <Method boolean String.startsWith(String)>
	//   68  134:ifne            241
	//   69  137:aload           12
	//   70  139:ldc1            #110 <String "_">
	//   71  141:invokevirtual   #117 <Method boolean String.endsWith(String)>
	//   72  144:ifne            241
			Class class2 = ((Field) (obj2)).getType();
	//   73  147:aload           14
	//   74  149:invokevirtual   #120 <Method Class Field.getType()>
	//   75  152:astore          13
			obj2 = ((Field) (obj2)).get(obj);
	//   76  154:aload           14
	//   77  156:aload_1         
	//   78  157:invokevirtual   #124 <Method Object Field.get(Object)>
	//   79  160:astore          14
			if(class2.isArray() && class2.getComponentType() != Byte.TYPE)
	//*  80  162:aload           13
	//*  81  164:invokevirtual   #128 <Method boolean Class.isArray()>
	//*  82  167:ifeq            232
	//*  83  170:aload           13
	//*  84  172:invokevirtual   #131 <Method Class Class.getComponentType()>
	//*  85  175:getstatic       #137 <Field Class Byte.TYPE>
	//*  86  178:if_acmpeq       232
			{
				int j1;
				if(obj2 == null)
	//*  87  181:aload           14
	//*  88  183:ifnonnull       192
					j1 = 0;
	//   89  186:iconst_0        
	//   90  187:istore          6
				else
	//*  91  189:goto            199
					j1 = Array.getLength(obj2);
	//   92  192:aload           14
	//   93  194:invokestatic    #143 <Method int Array.getLength(Object)>
	//   94  197:istore          6
				for(int j2 = 0; j2 < j1; j2++)
	//*  95  199:iconst_0        
	//*  96  200:istore          7
	//*  97  202:iload           7
	//*  98  204:iload           6
	//*  99  206:icmpge          241
					a(s2, Array.get(obj2, j2), stringbuffer, stringbuffer1);
	//  100  209:aload           12
	//  101  211:aload           14
	//  102  213:iload           7
	//  103  215:invokestatic    #146 <Method Object Array.get(Object, int)>
	//  104  218:aload_2         
	//  105  219:aload_3         
	//  106  220:invokestatic    #21  <Method void a(String, Object, StringBuffer, StringBuffer)>

	//  107  223:iload           7
	//  108  225:iconst_1        
	//  109  226:iadd            
	//  110  227:istore          7
			} else
	//* 111  229:goto            202
			{
				a(s2, obj2, stringbuffer, stringbuffer1);
	//  112  232:aload           12
	//  113  234:aload           14
	//  114  236:aload_2         
	//  115  237:aload_3         
	//  116  238:invokestatic    #21  <Method void a(String, Object, StringBuffer, StringBuffer)>
			}
		}

	//  117  241:iload           5
	//  118  243:iconst_1        
	//  119  244:iadd            
	//  120  245:istore          5
	//* 121  247:goto            71
		amethod = class1.getMethods();
	//  122  250:aload           11
	//  123  252:invokevirtual   #150 <Method Method[] Class.getMethods()>
	//  124  255:astore          12
		k1 = amethod.length;
	//  125  257:aload           12
	//  126  259:arraylength     
	//  127  260:istore          6
		j = 0;
	//  128  262:iconst_0        
	//  129  263:istore          5
_L6:
		String s3;
		if(j >= k1)
			break; /* Loop/switch isn't completed */
	//  130  265:iload           5
	//  131  267:iload           6
	//  132  269:icmpge          447
		String s1 = amethod[j].getName();
	//  133  272:aload           12
	//  134  274:iload           5
	//  135  276:aaload          
	//  136  277:invokevirtual   #153 <Method String Method.getName()>
	//  137  280:astore          10
		if(!s1.startsWith("set"))
			break MISSING_BLOCK_LABEL_438;
	//  138  282:aload           10
	//  139  284:ldc1            #155 <String "set">
	//  140  286:invokevirtual   #114 <Method boolean String.startsWith(String)>
	//  141  289:ifeq            438
		s3 = s1.substring(3);
	//  142  292:aload           10
	//  143  294:iconst_3        
	//  144  295:invokevirtual   #159 <Method String String.substring(int)>
	//  145  298:astore          13
		Object obj1;
		obj1 = ((Object) (String.valueOf(((Object) (s3)))));
	//  146  300:aload           13
	//  147  302:invokestatic    #34  <Method String String.valueOf(Object)>
	//  148  305:astore          10
		if(((String) (obj1)).length() != 0)
	//* 149  307:aload           10
	//* 150  309:invokevirtual   #38  <Method int String.length()>
	//* 151  312:ifeq            327
		{
			obj1 = ((Object) ("has".concat(((String) (obj1)))));
	//  152  315:ldc1            #161 <String "has">
	//  153  317:aload           10
	//  154  319:invokevirtual   #44  <Method String String.concat(String)>
	//  155  322:astore          10
			break MISSING_BLOCK_LABEL_338;
	//  156  324:goto            338
		}
		obj1 = ((Object) (new String("has")));
	//  157  327:new             #30  <Class String>
	//  158  330:dup             
	//  159  331:ldc1            #161 <String "has">
	//  160  333:invokespecial   #47  <Method void String(String)>
	//  161  336:astore          10
		obj1 = ((Object) (class1.getMethod(((String) (obj1)), new Class[0])));
	//  162  338:aload           11
	//  163  340:aload           10
	//  164  342:iconst_0        
	//  165  343:anewarray       Class[]
	//  166  346:invokevirtual   #165 <Method Method Class.getMethod(String, Class[])>
	//  167  349:astore          10
		if(!((Boolean)((Method) (obj1)).invoke(obj, new Object[0])).booleanValue())
			break MISSING_BLOCK_LABEL_438;
	//  168  351:aload           10
	//  169  353:aload_1         
	//  170  354:iconst_0        
	//  171  355:anewarray       Object[]
	//  172  358:invokevirtual   #169 <Method Object Method.invoke(Object, Object[])>
	//  173  361:checkcast       #171 <Class Boolean>
	//  174  364:invokevirtual   #174 <Method boolean Boolean.booleanValue()>
	//  175  367:ifeq            438
		obj1 = ((Object) (String.valueOf(((Object) (s3)))));
	//  176  370:aload           13
	//  177  372:invokestatic    #34  <Method String String.valueOf(Object)>
	//  178  375:astore          10
		if(((String) (obj1)).length() != 0)
	//* 179  377:aload           10
	//* 180  379:invokevirtual   #38  <Method int String.length()>
	//* 181  382:ifeq            397
		{
			obj1 = ((Object) ("get".concat(((String) (obj1)))));
	//  182  385:ldc1            #175 <String "get">
	//  183  387:aload           10
	//  184  389:invokevirtual   #44  <Method String String.concat(String)>
	//  185  392:astore          10
			break MISSING_BLOCK_LABEL_408;
	//  186  394:goto            408
		}
		obj1 = ((Object) (new String("get")));
	//  187  397:new             #30  <Class String>
	//  188  400:dup             
	//  189  401:ldc1            #175 <String "get">
	//  190  403:invokespecial   #47  <Method void String(String)>
	//  191  406:astore          10
		obj1 = ((Object) (class1.getMethod(((String) (obj1)), new Class[0])));
	//  192  408:aload           11
	//  193  410:aload           10
	//  194  412:iconst_0        
	//  195  413:anewarray       Class[]
	//  196  416:invokevirtual   #165 <Method Method Class.getMethod(String, Class[])>
	//  197  419:astore          10
		a(s3, ((Method) (obj1)).invoke(obj, new Object[0]), stringbuffer, stringbuffer1);
	//  198  421:aload           13
	//  199  423:aload           10
	//  200  425:aload_1         
	//  201  426:iconst_0        
	//  202  427:anewarray       Object[]
	//  203  430:invokevirtual   #169 <Method Object Method.invoke(Object, Object[])>
	//  204  433:aload_2         
	//  205  434:aload_3         
	//  206  435:invokestatic    #21  <Method void a(String, Object, StringBuffer, StringBuffer)>
_L7:
		j++;
	//  207  438:iload           5
	//  208  440:iconst_1        
	//  209  441:iadd            
	//  210  442:istore          5
		if(true) goto _L6; else goto _L5
	//  211  444:goto            265
_L5:
		if(s != null)
	//* 212  447:aload_0         
	//* 213  448:ifnull          470
		{
			stringbuffer.setLength(k2);
	//  214  451:aload_2         
	//  215  452:iload           8
	//  216  454:invokevirtual   #179 <Method void StringBuffer.setLength(int)>
			stringbuffer1.append(stringbuffer);
	//  217  457:aload_3         
	//  218  458:aload_2         
	//  219  459:invokevirtual   #75  <Method StringBuffer StringBuffer.append(StringBuffer)>
	//  220  462:pop             
			stringbuffer1.append(">\n");
	//  221  463:aload_3         
	//  222  464:ldc1            #181 <String ">\n">
	//  223  466:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//  224  469:pop             
		}
		return;
	//  225  470:return          
_L4:
		s = a(s);
	//  226  471:aload_0         
	//  227  472:invokestatic    #77  <Method String a(String)>
	//  228  475:astore_0        
		stringbuffer1.append(stringbuffer);
	//  229  476:aload_3         
	//  230  477:aload_2         
	//  231  478:invokevirtual   #75  <Method StringBuffer StringBuffer.append(StringBuffer)>
	//  232  481:pop             
		stringbuffer1.append(s);
	//  233  482:aload_3         
	//  234  483:aload_0         
	//  235  484:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//  236  487:pop             
		stringbuffer1.append(": ");
	//  237  488:aload_3         
	//  238  489:ldc1            #183 <String ": ">
	//  239  491:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//  240  494:pop             
		if(obj instanceof String)
	//* 241  495:aload_1         
	//* 242  496:instanceof      #30  <Class String>
	//* 243  499:ifeq            678
		{
			obj = ((Object) ((String)obj));
	//  244  502:aload_1         
	//  245  503:checkcast       #30  <Class String>
	//  246  506:astore_1        
			s = ((String) (obj));
	//  247  507:aload_1         
	//  248  508:astore_0        
			if(!((String) (obj)).startsWith("http"))
	//* 249  509:aload_1         
	//* 250  510:ldc1            #185 <String "http">
	//* 251  512:invokevirtual   #114 <Method boolean String.startsWith(String)>
	//* 252  515:ifne            547
			{
				s = ((String) (obj));
	//  253  518:aload_1         
	//  254  519:astore_0        
				if(((String) (obj)).length() > 200)
	//* 255  520:aload_1         
	//* 256  521:invokevirtual   #38  <Method int String.length()>
	//* 257  524:sipush          200
	//* 258  527:icmple          547
					s = String.valueOf(((Object) (((String) (obj)).substring(0, 200)))).concat("[...]");
	//  259  530:aload_1         
	//  260  531:iconst_0        
	//  261  532:sipush          200
	//  262  535:invokevirtual   #188 <Method String String.substring(int, int)>
	//  263  538:invokestatic    #34  <Method String String.valueOf(Object)>
	//  264  541:ldc1            #190 <String "[...]">
	//  265  543:invokevirtual   #44  <Method String String.concat(String)>
	//  266  546:astore_0        
			}
			int l1 = s.length();
	//  267  547:aload_0         
	//  268  548:invokevirtual   #38  <Method int String.length()>
	//  269  551:istore          6
			obj = ((Object) (new StringBuilder(l1)));
	//  270  553:new             #192 <Class StringBuilder>
	//  271  556:dup             
	//  272  557:iload           6
	//  273  559:invokespecial   #194 <Method void StringBuilder(int)>
	//  274  562:astore_1        
			for(int k = 0; k < l1; k++)
	//* 275  563:iconst_0        
	//* 276  564:istore          5
	//* 277  566:iload           5
	//* 278  568:iload           6
	//* 279  570:icmpge          650
			{
				char c = s.charAt(k);
	//  280  573:aload_0         
	//  281  574:iload           5
	//  282  576:invokevirtual   #53  <Method char String.charAt(int)>
	//  283  579:istore          4
				if(c >= ' ' && c <= '~' && c != '"' && c != '\'')
	//* 284  581:iload           4
	//* 285  583:bipush          32
	//* 286  585:icmplt          619
	//* 287  588:iload           4
	//* 288  590:bipush          126
	//* 289  592:icmpgt          619
	//* 290  595:iload           4
	//* 291  597:bipush          34
	//* 292  599:icmpeq          619
	//* 293  602:iload           4
	//* 294  604:bipush          39
	//* 295  606:icmpeq          619
					((StringBuilder) (obj)).append(c);
	//  296  609:aload_1         
	//  297  610:iload           4
	//  298  612:invokevirtual   #197 <Method StringBuilder StringBuilder.append(char)>
	//  299  615:pop             
				else
	//* 300  616:goto            641
					((StringBuilder) (obj)).append(String.format("\\u%04x", new Object[] {
						Integer.valueOf(((int) (c)))
					}));
	//  301  619:aload_1         
	//  302  620:ldc1            #199 <String "\\u%04x">
	//  303  622:iconst_1        
	//  304  623:anewarray       Object[]
	//  305  626:dup             
	//  306  627:iconst_0        
	//  307  628:iload           4
	//  308  630:invokestatic    #204 <Method Integer Integer.valueOf(int)>
	//  309  633:aastore         
	//  310  634:invokestatic    #208 <Method String String.format(String, Object[])>
	//  311  637:invokevirtual   #211 <Method StringBuilder StringBuilder.append(String)>
	//  312  640:pop             
			}

	//  313  641:iload           5
	//  314  643:iconst_1        
	//  315  644:iadd            
	//  316  645:istore          5
	//* 317  647:goto            566
			s = ((StringBuilder) (obj)).toString();
	//  318  650:aload_1         
	//  319  651:invokevirtual   #212 <Method String StringBuilder.toString()>
	//  320  654:astore_0        
			stringbuffer1.append("\"");
	//  321  655:aload_3         
	//  322  656:ldc1            #214 <String "\"">
	//  323  658:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//  324  661:pop             
			stringbuffer1.append(s);
	//  325  662:aload_3         
	//  326  663:aload_0         
	//  327  664:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//  328  667:pop             
			stringbuffer1.append("\"");
	//  329  668:aload_3         
	//  330  669:ldc1            #214 <String "\"">
	//  331  671:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//  332  674:pop             
		} else
	//* 333  675:goto            838
		if(obj instanceof byte[])
	//* 334  678:aload_1         
	//* 335  679:instanceof      #216 <Class byte[]>
	//* 336  682:ifeq            832
		{
			s = ((String) ((byte[])obj));
	//  337  685:aload_1         
	//  338  686:checkcast       #216 <Class byte[]>
	//  339  689:astore_0        
			if(s == null)
	//* 340  690:aload_0         
	//* 341  691:ifnonnull       704
			{
				stringbuffer1.append("\"\"");
	//  342  694:aload_3         
	//  343  695:ldc1            #218 <String "\"\"">
	//  344  697:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//  345  700:pop             
			} else
	//* 346  701:goto            838
			{
				stringbuffer1.append('"');
	//  347  704:aload_3         
	//  348  705:bipush          34
	//  349  707:invokevirtual   #63  <Method StringBuffer StringBuffer.append(char)>
	//  350  710:pop             
				for(int l = 0; l < s.length; l++)
	//* 351  711:iconst_0        
	//* 352  712:istore          5
	//* 353  714:iload           5
	//* 354  716:aload_0         
	//* 355  717:arraylength     
	//* 356  718:icmpge          822
				{
					int i2 = s[l] & 0xff;
	//  357  721:aload_0         
	//  358  722:iload           5
	//  359  724:baload          
	//  360  725:sipush          255
	//  361  728:iand            
	//  362  729:istore          6
					if(i2 != 92 && i2 != 34)
	//* 363  731:iload           6
	//* 364  733:bipush          92
	//* 365  735:icmpeq          798
	//* 366  738:iload           6
	//* 367  740:bipush          34
	//* 368  742:icmpne          748
	//* 369  745:goto            798
					{
						if(i2 >= 32 && i2 < 127)
	//* 370  748:iload           6
	//* 371  750:bipush          32
	//* 372  752:icmplt          773
	//* 373  755:iload           6
	//* 374  757:bipush          127
	//* 375  759:icmpge          773
							stringbuffer1.append((char)i2);
	//  376  762:aload_3         
	//  377  763:iload           6
	//  378  765:int2char        
	//  379  766:invokevirtual   #63  <Method StringBuffer StringBuffer.append(char)>
	//  380  769:pop             
						else
	//* 381  770:goto            813
							stringbuffer1.append(String.format("\\%03o", new Object[] {
								Integer.valueOf(i2)
							}));
	//  382  773:aload_3         
	//  383  774:ldc1            #220 <String "\\%03o">
	//  384  776:iconst_1        
	//  385  777:anewarray       Object[]
	//  386  780:dup             
	//  387  781:iconst_0        
	//  388  782:iload           6
	//  389  784:invokestatic    #204 <Method Integer Integer.valueOf(int)>
	//  390  787:aastore         
	//  391  788:invokestatic    #208 <Method String String.format(String, Object[])>
	//  392  791:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//  393  794:pop             
					} else
	//* 394  795:goto            813
					{
						stringbuffer1.append('\\');
	//  395  798:aload_3         
	//  396  799:bipush          92
	//  397  801:invokevirtual   #63  <Method StringBuffer StringBuffer.append(char)>
	//  398  804:pop             
						stringbuffer1.append((char)i2);
	//  399  805:aload_3         
	//  400  806:iload           6
	//  401  808:int2char        
	//  402  809:invokevirtual   #63  <Method StringBuffer StringBuffer.append(char)>
	//  403  812:pop             
					}
				}

	//  404  813:iload           5
	//  405  815:iconst_1        
	//  406  816:iadd            
	//  407  817:istore          5
	//* 408  819:goto            714
				stringbuffer1.append('"');
	//  409  822:aload_3         
	//  410  823:bipush          34
	//  411  825:invokevirtual   #63  <Method StringBuffer StringBuffer.append(char)>
	//  412  828:pop             
			}
		} else
	//* 413  829:goto            838
		{
			stringbuffer1.append(obj);
	//  414  832:aload_3         
	//  415  833:aload_1         
	//  416  834:invokevirtual   #223 <Method StringBuffer StringBuffer.append(Object)>
	//  417  837:pop             
		}
		stringbuffer1.append("\n");
	//  418  838:aload_3         
	//  419  839:ldc1            #225 <String "\n">
	//  420  841:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//  421  844:pop             
_L2:
		return;
	//  422  845:return          
		NoSuchMethodException nosuchmethodexception;
		nosuchmethodexception;
	//  423  846:astore          10
		  goto _L7
	//* 424  848:goto            438
	}
}
