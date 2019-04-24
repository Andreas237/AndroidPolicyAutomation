// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.lang.reflect.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxt

public final class zzbxu
{

	private static void zza(String s, Object obj, StringBuffer stringbuffer, StringBuffer stringbuffer1)
		throws IllegalAccessException, InvocationTargetException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(!(obj instanceof zzbxt)) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:instanceof      #14  <Class zzbxt>
	//    5    9:ifeq            499
_L1:
		int j;
		int i1;
		int k1;
		Class class1;
		Method amethod[];
		k1 = stringbuffer.length();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #20  <Method int StringBuffer.length()>
	//    8   16:istore          7
		if(s != null)
	//*   9   18:aload_0         
	//*  10   19:ifnull          47
		{
			stringbuffer1.append(stringbuffer).append(zzkc(s)).append(" <\n");
	//   11   22:aload_3         
	//   12   23:aload_2         
	//   13   24:invokevirtual   #24  <Method StringBuffer StringBuffer.append(StringBuffer)>
	//   14   27:aload_0         
	//   15   28:invokestatic    #28  <Method String zzkc(String)>
	//   16   31:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//   17   34:ldc1            #33  <String " <\n">
	//   18   36:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//   19   39:pop             
			stringbuffer.append("  ");
	//   20   40:aload_2         
	//   21   41:ldc1            #35  <String "  ">
	//   22   43:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//   23   46:pop             
		}
		class1 = obj.getClass();
	//   24   47:aload_1         
	//   25   48:invokevirtual   #39  <Method Class Object.getClass()>
	//   26   51:astore          10
		Field afield[] = class1.getFields();
	//   27   53:aload           10
	//   28   55:invokevirtual   #45  <Method Field[] Class.getFields()>
	//   29   58:astore          9
		int l1 = afield.length;
	//   30   60:aload           9
	//   31   62:arraylength     
	//   32   63:istore          8
		for(int i = 0; i < l1; i++)
	//*  33   65:iconst_0        
	//*  34   66:istore          4
	//*  35   68:iload           4
	//*  36   70:iload           8
	//*  37   72:icmpge          265
		{
			Object obj2 = ((Object) (afield[i]));
	//   38   75:aload           9
	//   39   77:iload           4
	//   40   79:aaload          
	//   41   80:astore          13
			int k = ((Field) (obj2)).getModifiers();
	//   42   82:aload           13
	//   43   84:invokevirtual   #50  <Method int Field.getModifiers()>
	//   44   87:istore          5
			String s2 = ((Field) (obj2)).getName();
	//   45   89:aload           13
	//   46   91:invokevirtual   #54  <Method String Field.getName()>
	//   47   94:astore          11
			if("cachedSize".equals(((Object) (s2))) || (k & 1) != 1 || (k & 8) == 8 || s2.startsWith("_") || s2.endsWith("_"))
				continue;
	//   48   96:ldc1            #56  <String "cachedSize">
	//   49   98:aload           11
	//   50  100:invokevirtual   #62  <Method boolean String.equals(Object)>
	//   51  103:ifeq            109
	//   52  106:goto            256
	//   53  109:iload           5
	//   54  111:iconst_1        
	//   55  112:iand            
	//   56  113:iconst_1        
	//   57  114:icmpne          256
	//   58  117:iload           5
	//   59  119:bipush          8
	//   60  121:iand            
	//   61  122:bipush          8
	//   62  124:icmpeq          256
	//   63  127:aload           11
	//   64  129:ldc1            #64  <String "_">
	//   65  131:invokevirtual   #68  <Method boolean String.startsWith(String)>
	//   66  134:ifne            256
	//   67  137:aload           11
	//   68  139:ldc1            #64  <String "_">
	//   69  141:invokevirtual   #71  <Method boolean String.endsWith(String)>
	//   70  144:ifne            256
			Class class2 = ((Field) (obj2)).getType();
	//   71  147:aload           13
	//   72  149:invokevirtual   #74  <Method Class Field.getType()>
	//   73  152:astore          12
			obj2 = ((Field) (obj2)).get(obj);
	//   74  154:aload           13
	//   75  156:aload_1         
	//   76  157:invokevirtual   #78  <Method Object Field.get(Object)>
	//   77  160:astore          13
			if(class2.isArray())
	//*  78  162:aload           12
	//*  79  164:invokevirtual   #82  <Method boolean Class.isArray()>
	//*  80  167:ifeq            247
			{
				if(class2.getComponentType() == Byte.TYPE)
	//*  81  170:aload           12
	//*  82  172:invokevirtual   #85  <Method Class Class.getComponentType()>
	//*  83  175:getstatic       #91  <Field Class Byte.TYPE>
	//*  84  178:if_acmpne       193
				{
					zza(s2, obj2, stringbuffer, stringbuffer1);
	//   85  181:aload           11
	//   86  183:aload           13
	//   87  185:aload_2         
	//   88  186:aload_3         
	//   89  187:invokestatic    #93  <Method void zza(String, Object, StringBuffer, StringBuffer)>
					continue;
	//   90  190:goto            244
				}
				int l;
				if(obj2 == null)
	//*  91  193:aload           13
	//*  92  195:ifnonnull       204
					l = 0;
	//   93  198:iconst_0        
	//   94  199:istore          5
				else
	//*  95  201:goto            211
					l = Array.getLength(obj2);
	//   96  204:aload           13
	//   97  206:invokestatic    #99  <Method int Array.getLength(Object)>
	//   98  209:istore          5
				for(int j1 = 0; j1 < l; j1++)
	//*  99  211:iconst_0        
	//* 100  212:istore          6
	//* 101  214:iload           6
	//* 102  216:iload           5
	//* 103  218:icmpge          244
					zza(s2, Array.get(obj2, j1), stringbuffer, stringbuffer1);
	//  104  221:aload           11
	//  105  223:aload           13
	//  106  225:iload           6
	//  107  227:invokestatic    #102 <Method Object Array.get(Object, int)>
	//  108  230:aload_2         
	//  109  231:aload_3         
	//  110  232:invokestatic    #93  <Method void zza(String, Object, StringBuffer, StringBuffer)>

	//  111  235:iload           6
	//  112  237:iconst_1        
	//  113  238:iadd            
	//  114  239:istore          6
			} else
	//* 115  241:goto            214
	//* 116  244:goto            256
			{
				zza(s2, obj2, stringbuffer, stringbuffer1);
	//  117  247:aload           11
	//  118  249:aload           13
	//  119  251:aload_2         
	//  120  252:aload_3         
	//  121  253:invokestatic    #93  <Method void zza(String, Object, StringBuffer, StringBuffer)>
			}
		}

	//  122  256:iload           4
	//  123  258:iconst_1        
	//  124  259:iadd            
	//  125  260:istore          4
	//* 126  262:goto            68
		amethod = class1.getMethods();
	//  127  265:aload           10
	//  128  267:invokevirtual   #106 <Method Method[] Class.getMethods()>
	//  129  270:astore          11
		i1 = amethod.length;
	//  130  272:aload           11
	//  131  274:arraylength     
	//  132  275:istore          5
		j = 0;
	//  133  277:iconst_0        
	//  134  278:istore          4
_L4:
		String s3;
		if(j >= i1)
			break; /* Loop/switch isn't completed */
	//  135  280:iload           4
	//  136  282:iload           5
	//  137  284:icmpge          477
		String s1 = amethod[j].getName();
	//  138  287:aload           11
	//  139  289:iload           4
	//  140  291:aaload          
	//  141  292:invokevirtual   #109 <Method String Method.getName()>
	//  142  295:astore          9
		if(!s1.startsWith("set"))
			break MISSING_BLOCK_LABEL_468;
	//  143  297:aload           9
	//  144  299:ldc1            #111 <String "set">
	//  145  301:invokevirtual   #68  <Method boolean String.startsWith(String)>
	//  146  304:ifeq            468
		s3 = s1.substring(3);
	//  147  307:aload           9
	//  148  309:iconst_3        
	//  149  310:invokevirtual   #115 <Method String String.substring(int)>
	//  150  313:astore          12
		Object obj1;
		obj1 = ((Object) (String.valueOf(((Object) (s3)))));
	//  151  315:aload           12
	//  152  317:invokestatic    #119 <Method String String.valueOf(Object)>
	//  153  320:astore          9
		if(((String) (obj1)).length() != 0)
	//* 154  322:aload           9
	//* 155  324:invokevirtual   #120 <Method int String.length()>
	//* 156  327:ifeq            342
		{
			obj1 = ((Object) ("has".concat(((String) (obj1)))));
	//  157  330:ldc1            #122 <String "has">
	//  158  332:aload           9
	//  159  334:invokevirtual   #125 <Method String String.concat(String)>
	//  160  337:astore          9
			break MISSING_BLOCK_LABEL_353;
	//  161  339:goto            353
		}
		obj1 = ((Object) (new String("has")));
	//  162  342:new             #58  <Class String>
	//  163  345:dup             
	//  164  346:ldc1            #122 <String "has">
	//  165  348:invokespecial   #129 <Method void String(String)>
	//  166  351:astore          9
		obj1 = ((Object) (class1.getMethod(((String) (obj1)), new Class[0])));
	//  167  353:aload           10
	//  168  355:aload           9
	//  169  357:iconst_0        
	//  170  358:anewarray       Class[]
	//  171  361:invokevirtual   #133 <Method Method Class.getMethod(String, Class[])>
	//  172  364:astore          9
	//* 173  366:goto            372
	//* 174  369:goto            468
		if(!((Boolean)((Method) (obj1)).invoke(obj, new Object[0])).booleanValue())
	//* 175  372:aload           9
	//* 176  374:aload_1         
	//* 177  375:iconst_0        
	//* 178  376:anewarray       Object[]
	//* 179  379:invokevirtual   #137 <Method Object Method.invoke(Object, Object[])>
	//* 180  382:checkcast       #139 <Class Boolean>
	//* 181  385:invokevirtual   #142 <Method boolean Boolean.booleanValue()>
	//* 182  388:ifne            394
			break MISSING_BLOCK_LABEL_468;
	//  183  391:goto            468
		obj1 = ((Object) (String.valueOf(((Object) (s3)))));
	//  184  394:aload           12
	//  185  396:invokestatic    #119 <Method String String.valueOf(Object)>
	//  186  399:astore          9
		if(((String) (obj1)).length() != 0)
	//* 187  401:aload           9
	//* 188  403:invokevirtual   #120 <Method int String.length()>
	//* 189  406:ifeq            421
		{
			obj1 = ((Object) ("get".concat(((String) (obj1)))));
	//  190  409:ldc1            #143 <String "get">
	//  191  411:aload           9
	//  192  413:invokevirtual   #125 <Method String String.concat(String)>
	//  193  416:astore          9
			break MISSING_BLOCK_LABEL_432;
	//  194  418:goto            432
		}
		obj1 = ((Object) (new String("get")));
	//  195  421:new             #58  <Class String>
	//  196  424:dup             
	//  197  425:ldc1            #143 <String "get">
	//  198  427:invokespecial   #129 <Method void String(String)>
	//  199  430:astore          9
		obj1 = ((Object) (class1.getMethod(((String) (obj1)), new Class[0])));
	//  200  432:aload           10
	//  201  434:aload           9
	//  202  436:iconst_0        
	//  203  437:anewarray       Class[]
	//  204  440:invokevirtual   #133 <Method Method Class.getMethod(String, Class[])>
	//  205  443:astore          9
	//* 206  445:goto            451
	//* 207  448:goto            468
		zza(s3, ((Method) (obj1)).invoke(obj, new Object[0]), stringbuffer, stringbuffer1);
	//  208  451:aload           12
	//  209  453:aload           9
	//  210  455:aload_1         
	//  211  456:iconst_0        
	//  212  457:anewarray       Object[]
	//  213  460:invokevirtual   #137 <Method Object Method.invoke(Object, Object[])>
	//  214  463:aload_2         
	//  215  464:aload_3         
	//  216  465:invokestatic    #93  <Method void zza(String, Object, StringBuffer, StringBuffer)>
_L5:
		j++;
	//  217  468:iload           4
	//  218  470:iconst_1        
	//  219  471:iadd            
	//  220  472:istore          4
		if(true) goto _L4; else goto _L3
	//  221  474:goto            280
_L3:
		if(s != null)
	//* 222  477:aload_0         
	//* 223  478:ifnull          498
		{
			stringbuffer.setLength(k1);
	//  224  481:aload_2         
	//  225  482:iload           7
	//  226  484:invokevirtual   #147 <Method void StringBuffer.setLength(int)>
			stringbuffer1.append(stringbuffer).append(">\n");
	//  227  487:aload_3         
	//  228  488:aload_2         
	//  229  489:invokevirtual   #24  <Method StringBuffer StringBuffer.append(StringBuffer)>
	//  230  492:ldc1            #149 <String ">\n">
	//  231  494:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//  232  497:pop             
		}
		return;
	//  233  498:return          
_L2:
		s = zzkc(s);
	//  234  499:aload_0         
	//  235  500:invokestatic    #28  <Method String zzkc(String)>
	//  236  503:astore_0        
		stringbuffer1.append(stringbuffer).append(s).append(": ");
	//  237  504:aload_3         
	//  238  505:aload_2         
	//  239  506:invokevirtual   #24  <Method StringBuffer StringBuffer.append(StringBuffer)>
	//  240  509:aload_0         
	//  241  510:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//  242  513:ldc1            #151 <String ": ">
	//  243  515:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//  244  518:pop             
		if(obj instanceof String)
	//* 245  519:aload_1         
	//* 246  520:instanceof      #58  <Class String>
	//* 247  523:ifeq            553
		{
			s = zzcF((String)obj);
	//  248  526:aload_1         
	//  249  527:checkcast       #58  <Class String>
	//  250  530:invokestatic    #154 <Method String zzcF(String)>
	//  251  533:astore_0        
			stringbuffer1.append("\"").append(s).append("\"");
	//  252  534:aload_3         
	//  253  535:ldc1            #156 <String "\"">
	//  254  537:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//  255  540:aload_0         
	//  256  541:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//  257  544:ldc1            #156 <String "\"">
	//  258  546:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//  259  549:pop             
		} else
	//* 260  550:goto            577
		if(obj instanceof byte[])
	//* 261  553:aload_1         
	//* 262  554:instanceof      #158 <Class byte[]>
	//* 263  557:ifeq            571
			zza((byte[])obj, stringbuffer1);
	//  264  560:aload_1         
	//  265  561:checkcast       #158 <Class byte[]>
	//  266  564:aload_3         
	//  267  565:invokestatic    #161 <Method void zza(byte[], StringBuffer)>
		else
	//* 268  568:goto            577
			stringbuffer1.append(obj);
	//  269  571:aload_3         
	//  270  572:aload_1         
	//  271  573:invokevirtual   #164 <Method StringBuffer StringBuffer.append(Object)>
	//  272  576:pop             
		stringbuffer1.append("\n");
	//  273  577:aload_3         
	//  274  578:ldc1            #166 <String "\n">
	//  275  580:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//  276  583:pop             
		return;
	//  277  584:return          
		NoSuchMethodException nosuchmethodexception;
		nosuchmethodexception;
	//  278  585:astore          9
		  goto _L5
	//* 279  587:goto            369
		nosuchmethodexception;
	//  280  590:astore          9
		  goto _L5
	//* 281  592:goto            448
	}

	private static void zza(byte abyte0[], StringBuffer stringbuffer)
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
		{
			stringbuffer.append("\"\"");
	//    2    4:aload_1         
	//    3    5:ldc1            #170 <String "\"\"">
	//    4    7:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//    5   10:pop             
			return;
	//    6   11:return          
		}
		stringbuffer.append('"');
	//    7   12:aload_1         
	//    8   13:bipush          34
	//    9   15:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   10   18:pop             
		for(int i = 0; i < abyte0.length; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_2        
	//*  13   21:iload_2         
	//*  14   22:aload_0         
	//*  15   23:arraylength     
	//*  16   24:icmpge          112
		{
			int j = abyte0[i] & 0xff;
	//   17   27:aload_0         
	//   18   28:iload_2         
	//   19   29:baload          
	//   20   30:sipush          255
	//   21   33:iand            
	//   22   34:istore_3        
			if(j == 92 || j == 34)
	//*  23   35:iload_3         
	//*  24   36:bipush          92
	//*  25   38:icmpeq          47
	//*  26   41:iload_3         
	//*  27   42:bipush          34
	//*  28   44:icmpne          62
			{
				stringbuffer.append('\\').append((char)j);
	//   29   47:aload_1         
	//   30   48:bipush          92
	//   31   50:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   32   53:iload_3         
	//   33   54:int2char        
	//   34   55:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   35   58:pop             
				continue;
	//   36   59:goto            105
			}
			if(j >= 32 && j < 127)
	//*  37   62:iload_3         
	//*  38   63:bipush          32
	//*  39   65:icmplt          84
	//*  40   68:iload_3         
	//*  41   69:bipush          127
	//*  42   71:icmpge          84
				stringbuffer.append((char)j);
	//   43   74:aload_1         
	//   44   75:iload_3         
	//   45   76:int2char        
	//   46   77:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   47   80:pop             
			else
	//*  48   81:goto            105
				stringbuffer.append(String.format("\\%03o", new Object[] {
					Integer.valueOf(j)
				}));
	//   49   84:aload_1         
	//   50   85:ldc1            #175 <String "\\%03o">
	//   51   87:iconst_1        
	//   52   88:anewarray       Object[]
	//   53   91:dup             
	//   54   92:iconst_0        
	//   55   93:iload_3         
	//   56   94:invokestatic    #180 <Method Integer Integer.valueOf(int)>
	//   57   97:aastore         
	//   58   98:invokestatic    #184 <Method String String.format(String, Object[])>
	//   59  101:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//   60  104:pop             
		}

	//   61  105:iload_2         
	//   62  106:iconst_1        
	//   63  107:iadd            
	//   64  108:istore_2        
	//*  65  109:goto            21
		stringbuffer.append('"');
	//   66  112:aload_1         
	//   67  113:bipush          34
	//   68  115:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   69  118:pop             
	//   70  119:return          
	}

	private static String zzcF(String s)
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(!s.startsWith("http"))
	//*   2    2:aload_0         
	//*   3    3:ldc1            #186 <String "http">
	//*   4    5:invokevirtual   #68  <Method boolean String.startsWith(String)>
	//*   5    8:ifne            40
		{
			s1 = s;
	//    6   11:aload_0         
	//    7   12:astore_1        
			if(s.length() > 200)
	//*   8   13:aload_0         
	//*   9   14:invokevirtual   #120 <Method int String.length()>
	//*  10   17:sipush          200
	//*  11   20:icmple          40
				s1 = String.valueOf(((Object) (s.substring(0, 200)))).concat("[...]");
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:sipush          200
	//   15   28:invokevirtual   #189 <Method String String.substring(int, int)>
	//   16   31:invokestatic    #119 <Method String String.valueOf(Object)>
	//   17   34:ldc1            #191 <String "[...]">
	//   18   36:invokevirtual   #125 <Method String String.concat(String)>
	//   19   39:astore_1        
		}
		return zzdy(s1);
	//   20   40:aload_1         
	//   21   41:invokestatic    #194 <Method String zzdy(String)>
	//   22   44:areturn         
	}

	private static String zzdy(String s)
	{
		int j = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method int String.length()>
	//    2    4:istore_3        
		StringBuilder stringbuilder = new StringBuilder(j);
	//    3    5:new             #196 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:iload_3         
	//    6   10:invokespecial   #198 <Method void StringBuilder(int)>
	//    7   13:astore          4
		for(int i = 0; i < j; i++)
	//*   8   15:iconst_0        
	//*   9   16:istore_2        
	//*  10   17:iload_2         
	//*  11   18:iload_3         
	//*  12   19:icmpge          91
		{
			char c = s.charAt(i);
	//   13   22:aload_0         
	//   14   23:iload_2         
	//   15   24:invokevirtual   #202 <Method char String.charAt(int)>
	//   16   27:istore_1        
			if(c >= ' ' && c <= '~' && c != '"' && c != '\'')
	//*  17   28:iload_1         
	//*  18   29:bipush          32
	//*  19   31:icmplt          62
	//*  20   34:iload_1         
	//*  21   35:bipush          126
	//*  22   37:icmpgt          62
	//*  23   40:iload_1         
	//*  24   41:bipush          34
	//*  25   43:icmpeq          62
	//*  26   46:iload_1         
	//*  27   47:bipush          39
	//*  28   49:icmpeq          62
				stringbuilder.append(c);
	//   29   52:aload           4
	//   30   54:iload_1         
	//   31   55:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//   32   58:pop             
			else
	//*  33   59:goto            84
				stringbuilder.append(String.format("\\u%04x", new Object[] {
					Integer.valueOf(((int) (c)))
				}));
	//   34   62:aload           4
	//   35   64:ldc1            #207 <String "\\u%04x">
	//   36   66:iconst_1        
	//   37   67:anewarray       Object[]
	//   38   70:dup             
	//   39   71:iconst_0        
	//   40   72:iload_1         
	//   41   73:invokestatic    #180 <Method Integer Integer.valueOf(int)>
	//   42   76:aastore         
	//   43   77:invokestatic    #184 <Method String String.format(String, Object[])>
	//   44   80:invokevirtual   #210 <Method StringBuilder StringBuilder.append(String)>
	//   45   83:pop             
		}

	//   46   84:iload_2         
	//   47   85:iconst_1        
	//   48   86:iadd            
	//   49   87:istore_2        
	//*  50   88:goto            17
		return stringbuilder.toString();
	//   51   91:aload           4
	//   52   93:invokevirtual   #213 <Method String StringBuilder.toString()>
	//   53   96:areturn         
	}

	public static String zzg(zzbxt zzbxt1)
	{
		if(zzbxt1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #217 <String "">
	//    3    6:areturn         
		StringBuffer stringbuffer = new StringBuffer();
	//    4    7:new             #16  <Class StringBuffer>
	//    5   10:dup             
	//    6   11:invokespecial   #220 <Method void StringBuffer()>
	//    7   14:astore_1        
		try
		{
			zza(((String) (null)), ((Object) (zzbxt1)), new StringBuffer(), stringbuffer);
	//    8   15:aconst_null     
	//    9   16:aload_0         
	//   10   17:new             #16  <Class StringBuffer>
	//   11   20:dup             
	//   12   21:invokespecial   #220 <Method void StringBuffer()>
	//   13   24:aload_1         
	//   14   25:invokestatic    #93  <Method void zza(String, Object, StringBuffer, StringBuffer)>
		}
	//*  15   28:goto            97
		// Misplaced declaration of an exception variable
		catch(zzbxt zzbxt1)
	//*  16   31:astore_0        
		{
			zzbxt1 = ((zzbxt) (String.valueOf(((Object) (((IllegalAccessException) (zzbxt1)).getMessage())))));
	//   17   32:aload_0         
	//   18   33:invokevirtual   #223 <Method String IllegalAccessException.getMessage()>
	//   19   36:invokestatic    #119 <Method String String.valueOf(Object)>
	//   20   39:astore_0        
			if(((String) (zzbxt1)).length() != 0)
	//*  21   40:aload_0         
	//*  22   41:invokevirtual   #120 <Method int String.length()>
	//*  23   44:ifeq            54
				return "Error printing proto: ".concat(((String) (zzbxt1)));
	//   24   47:ldc1            #225 <String "Error printing proto: ">
	//   25   49:aload_0         
	//   26   50:invokevirtual   #125 <Method String String.concat(String)>
	//   27   53:areturn         
			else
				return new String("Error printing proto: ");
	//   28   54:new             #58  <Class String>
	//   29   57:dup             
	//   30   58:ldc1            #225 <String "Error printing proto: ">
	//   31   60:invokespecial   #129 <Method void String(String)>
	//   32   63:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(zzbxt zzbxt1)
	//*  33   64:astore_0        
		{
			zzbxt1 = ((zzbxt) (String.valueOf(((Object) (((InvocationTargetException) (zzbxt1)).getMessage())))));
	//   34   65:aload_0         
	//   35   66:invokevirtual   #226 <Method String InvocationTargetException.getMessage()>
	//   36   69:invokestatic    #119 <Method String String.valueOf(Object)>
	//   37   72:astore_0        
			if(((String) (zzbxt1)).length() != 0)
	//*  38   73:aload_0         
	//*  39   74:invokevirtual   #120 <Method int String.length()>
	//*  40   77:ifeq            87
				return "Error printing proto: ".concat(((String) (zzbxt1)));
	//   41   80:ldc1            #225 <String "Error printing proto: ">
	//   42   82:aload_0         
	//   43   83:invokevirtual   #125 <Method String String.concat(String)>
	//   44   86:areturn         
			else
				return new String("Error printing proto: ");
	//   45   87:new             #58  <Class String>
	//   46   90:dup             
	//   47   91:ldc1            #225 <String "Error printing proto: ">
	//   48   93:invokespecial   #129 <Method void String(String)>
	//   49   96:areturn         
		}
		return stringbuffer.toString();
	//   50   97:aload_1         
	//   51   98:invokevirtual   #227 <Method String StringBuffer.toString()>
	//   52  101:areturn         
	}

	private static String zzkc(String s)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #16  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #220 <Method void StringBuffer()>
	//    3    7:astore_3        
		for(int i = 0; i < s.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #120 <Method int String.length()>
	//*   9   15:icmpge          77
		{
			char c = s.charAt(i);
	//   10   18:aload_0         
	//   11   19:iload_2         
	//   12   20:invokevirtual   #202 <Method char String.charAt(int)>
	//   13   23:istore_1        
			if(i == 0)
	//*  14   24:iload_2         
	//*  15   25:ifne            40
			{
				stringbuffer.append(Character.toLowerCase(c));
	//   16   28:aload_3         
	//   17   29:iload_1         
	//   18   30:invokestatic    #235 <Method char Character.toLowerCase(char)>
	//   19   33:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   20   36:pop             
				continue;
	//   21   37:goto            70
			}
			if(Character.isUpperCase(c))
	//*  22   40:iload_1         
	//*  23   41:invokestatic    #239 <Method boolean Character.isUpperCase(char)>
	//*  24   44:ifeq            64
				stringbuffer.append('_').append(Character.toLowerCase(c));
	//   25   47:aload_3         
	//   26   48:bipush          95
	//   27   50:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   28   53:iload_1         
	//   29   54:invokestatic    #235 <Method char Character.toLowerCase(char)>
	//   30   57:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   31   60:pop             
			else
	//*  32   61:goto            70
				stringbuffer.append(c);
	//   33   64:aload_3         
	//   34   65:iload_1         
	//   35   66:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   36   69:pop             
		}

	//   37   70:iload_2         
	//   38   71:iconst_1        
	//   39   72:iadd            
	//   40   73:istore_2        
	//*  41   74:goto            10
		return stringbuffer.toString();
	//   42   77:aload_3         
	//   43   78:invokevirtual   #227 <Method String StringBuffer.toString()>
	//   44   81:areturn         
	}
}
