// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.lang.reflect.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzbut

public final class zzbuu
{

	private static void zza(String s, Object obj, StringBuffer stringbuffer, StringBuffer stringbuffer1)
		throws IllegalAccessException, InvocationTargetException
	{
		if(obj != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       5
_L1:
		return;
	//    2    4:return          
_L2:
		int i;
		int l;
		int j1;
		Class class1;
		Method amethod[];
		if(!(obj instanceof zzbut))
			break MISSING_BLOCK_LABEL_494;
	//    3    5:aload_1         
	//    4    6:instanceof      #14  <Class zzbut>
	//    5    9:ifeq            494
		j1 = stringbuffer.length();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #20  <Method int StringBuffer.length()>
	//    8   16:istore          7
		if(s != null)
	//*   9   18:aload_0         
	//*  10   19:ifnull          47
		{
			stringbuffer1.append(stringbuffer).append(zzkd(s)).append(" <\n");
	//   11   22:aload_3         
	//   12   23:aload_2         
	//   13   24:invokevirtual   #24  <Method StringBuffer StringBuffer.append(StringBuffer)>
	//   14   27:aload_0         
	//   15   28:invokestatic    #28  <Method String zzkd(String)>
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
		int k1 = afield.length;
	//   30   60:aload           9
	//   31   62:arraylength     
	//   32   63:istore          8
		i = 0;
	//   33   65:iconst_0        
	//   34   66:istore          4
		do
		{
			if(i >= k1)
				break;
	//   35   68:iload           4
	//   36   70:iload           8
	//   37   72:icmpge          262
			Object obj2 = ((Object) (afield[i]));
	//   38   75:aload           9
	//   39   77:iload           4
	//   40   79:aaload          
	//   41   80:astore          13
			int j = ((Field) (obj2)).getModifiers();
	//   42   82:aload           13
	//   43   84:invokevirtual   #50  <Method int Field.getModifiers()>
	//   44   87:istore          5
			String s1 = ((Field) (obj2)).getName();
	//   45   89:aload           13
	//   46   91:invokevirtual   #54  <Method String Field.getName()>
	//   47   94:astore          11
			if(!"cachedSize".equals(((Object) (s1))) && (j & 1) == 1 && (j & 8) != 8 && !s1.startsWith("_") && !s1.endsWith("_"))
	//*  48   96:ldc1            #56  <String "cachedSize">
	//*  49   98:aload           11
	//*  50  100:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*  51  103:ifeq            115
	//*  52  106:iload           4
	//*  53  108:iconst_1        
	//*  54  109:iadd            
	//*  55  110:istore          4
	//*  56  112:goto            68
	//*  57  115:iload           5
	//*  58  117:iconst_1        
	//*  59  118:iand            
	//*  60  119:iconst_1        
	//*  61  120:icmpne          106
	//*  62  123:iload           5
	//*  63  125:bipush          8
	//*  64  127:iand            
	//*  65  128:bipush          8
	//*  66  130:icmpeq          106
	//*  67  133:aload           11
	//*  68  135:ldc1            #64  <String "_">
	//*  69  137:invokevirtual   #68  <Method boolean String.startsWith(String)>
	//*  70  140:ifne            106
	//*  71  143:aload           11
	//*  72  145:ldc1            #64  <String "_">
	//*  73  147:invokevirtual   #71  <Method boolean String.endsWith(String)>
	//*  74  150:ifne            106
			{
				Class class2 = ((Field) (obj2)).getType();
	//   75  153:aload           13
	//   76  155:invokevirtual   #74  <Method Class Field.getType()>
	//   77  158:astore          12
				obj2 = ((Field) (obj2)).get(obj);
	//   78  160:aload           13
	//   79  162:aload_1         
	//   80  163:invokevirtual   #78  <Method Object Field.get(Object)>
	//   81  166:astore          13
				if(class2.isArray())
	//*  82  168:aload           12
	//*  83  170:invokevirtual   #82  <Method boolean Class.isArray()>
	//*  84  173:ifeq            250
				{
					if(class2.getComponentType() == Byte.TYPE)
	//*  85  176:aload           12
	//*  86  178:invokevirtual   #85  <Method Class Class.getComponentType()>
	//*  87  181:getstatic       #91  <Field Class Byte.TYPE>
	//*  88  184:if_acmpne       199
					{
						zza(s1, obj2, stringbuffer, stringbuffer1);
	//   89  187:aload           11
	//   90  189:aload           13
	//   91  191:aload_2         
	//   92  192:aload_3         
	//   93  193:invokestatic    #93  <Method void zza(String, Object, StringBuffer, StringBuffer)>
					} else
	//*  94  196:goto            106
					{
						int k;
						int i1;
						if(obj2 == null)
	//*  95  199:aload           13
	//*  96  201:ifnonnull       240
							k = 0;
	//   97  204:iconst_0        
	//   98  205:istore          5
						else
	//*  99  207:iconst_0        
	//* 100  208:istore          6
	//* 101  210:iload           6
	//* 102  212:iload           5
	//* 103  214:icmpge          106
	//* 104  217:aload           11
	//* 105  219:aload           13
	//* 106  221:iload           6
	//* 107  223:invokestatic    #98  <Method Object Array.get(Object, int)>
	//* 108  226:aload_2         
	//* 109  227:aload_3         
	//* 110  228:invokestatic    #93  <Method void zza(String, Object, StringBuffer, StringBuffer)>
	//* 111  231:iload           6
	//* 112  233:iconst_1        
	//* 113  234:iadd            
	//* 114  235:istore          6
	//* 115  237:goto            210
							k = Array.getLength(obj2);
	//  116  240:aload           13
	//  117  242:invokestatic    #102 <Method int Array.getLength(Object)>
	//  118  245:istore          5
						i1 = 0;
						while(i1 < k) 
						{
							zza(s1, Array.get(obj2, i1), stringbuffer, stringbuffer1);
							i1++;
						}
					}
				} else
	//* 119  247:goto            207
				{
					zza(s1, obj2, stringbuffer, stringbuffer1);
	//  120  250:aload           11
	//  121  252:aload           13
	//  122  254:aload_2         
	//  123  255:aload_3         
	//  124  256:invokestatic    #93  <Method void zza(String, Object, StringBuffer, StringBuffer)>
				}
			}
			i++;
		} while(true);
	//* 125  259:goto            106
		amethod = class1.getMethods();
	//  126  262:aload           10
	//  127  264:invokevirtual   #106 <Method Method[] Class.getMethods()>
	//  128  267:astore          11
		l = amethod.length;
	//  129  269:aload           11
	//  130  271:arraylength     
	//  131  272:istore          5
		i = 0;
	//  132  274:iconst_0        
	//  133  275:istore          4
_L8:
		Object obj1;
		if(i >= l)
			continue; /* Loop/switch isn't completed */
	//  134  277:iload           4
	//  135  279:iload           5
	//  136  281:icmpge          472
		obj1 = ((Object) (amethod[i].getName()));
	//  137  284:aload           11
	//  138  286:iload           4
	//  139  288:aaload          
	//  140  289:invokevirtual   #109 <Method String Method.getName()>
	//  141  292:astore          9
		if(!((String) (obj1)).startsWith("set")) goto _L4; else goto _L3
	//  142  294:aload           9
	//  143  296:ldc1            #111 <String "set">
	//  144  298:invokevirtual   #68  <Method boolean String.startsWith(String)>
	//  145  301:ifeq            368
_L3:
		String s2 = ((String) (obj1)).substring(3);
	//  146  304:aload           9
	//  147  306:iconst_3        
	//  148  307:invokevirtual   #115 <Method String String.substring(int)>
	//  149  310:astore          12
		obj1 = ((Object) (String.valueOf(((Object) (s2)))));
	//  150  312:aload           12
	//  151  314:invokestatic    #119 <Method String String.valueOf(Object)>
	//  152  317:astore          9
		if(((String) (obj1)).length() == 0) goto _L6; else goto _L5
	//  153  319:aload           9
	//  154  321:invokevirtual   #120 <Method int String.length()>
	//  155  324:ifeq            377
_L5:
		obj1 = ((Object) ("has".concat(((String) (obj1)))));
	//  156  327:ldc1            #122 <String "has">
	//  157  329:aload           9
	//  158  331:invokevirtual   #125 <Method String String.concat(String)>
	//  159  334:astore          9
_L9:
		obj1 = ((Object) (class1.getMethod(((String) (obj1)), new Class[0])));
	//  160  336:aload           10
	//  161  338:aload           9
	//  162  340:iconst_0        
	//  163  341:anewarray       Class[]
	//  164  344:invokevirtual   #129 <Method Method Class.getMethod(String, Class[])>
	//  165  347:astore          9
		if(((Boolean)((Method) (obj1)).invoke(obj, new Object[0])).booleanValue()) goto _L7; else goto _L4
	//  166  349:aload           9
	//  167  351:aload_1         
	//  168  352:iconst_0        
	//  169  353:anewarray       Object[]
	//  170  356:invokevirtual   #133 <Method Object Method.invoke(Object, Object[])>
	//  171  359:checkcast       #135 <Class Boolean>
	//  172  362:invokevirtual   #138 <Method boolean Boolean.booleanValue()>
	//  173  365:ifne            396
_L4:
		i++;
	//  174  368:iload           4
	//  175  370:iconst_1        
	//  176  371:iadd            
	//  177  372:istore          4
		  goto _L8
	//* 178  374:goto            277
_L6:
		obj1 = ((Object) (new String("has")));
	//  179  377:new             #58  <Class String>
	//  180  380:dup             
	//  181  381:ldc1            #122 <String "has">
	//  182  383:invokespecial   #142 <Method void String(String)>
	//  183  386:astore          9
		  goto _L9
	//* 184  388:goto            336
		NoSuchMethodException nosuchmethodexception;
		nosuchmethodexception;
	//  185  391:astore          9
		  goto _L4
	//* 186  393:goto            368
_L7:
		nosuchmethodexception = ((NoSuchMethodException) (String.valueOf(((Object) (s2)))));
	//  187  396:aload           12
	//  188  398:invokestatic    #119 <Method String String.valueOf(Object)>
	//  189  401:astore          9
		if(((String) (nosuchmethodexception)).length() == 0)
			break MISSING_BLOCK_LABEL_453;
	//  190  403:aload           9
	//  191  405:invokevirtual   #120 <Method int String.length()>
	//  192  408:ifeq            453
		nosuchmethodexception = ((NoSuchMethodException) ("get".concat(((String) (nosuchmethodexception)))));
	//  193  411:ldc1            #143 <String "get">
	//  194  413:aload           9
	//  195  415:invokevirtual   #125 <Method String String.concat(String)>
	//  196  418:astore          9
_L10:
		nosuchmethodexception = ((NoSuchMethodException) (class1.getMethod(((String) (nosuchmethodexception)), new Class[0])));
	//  197  420:aload           10
	//  198  422:aload           9
	//  199  424:iconst_0        
	//  200  425:anewarray       Class[]
	//  201  428:invokevirtual   #129 <Method Method Class.getMethod(String, Class[])>
	//  202  431:astore          9
		zza(s2, ((Method) (nosuchmethodexception)).invoke(obj, new Object[0]), stringbuffer, stringbuffer1);
	//  203  433:aload           12
	//  204  435:aload           9
	//  205  437:aload_1         
	//  206  438:iconst_0        
	//  207  439:anewarray       Object[]
	//  208  442:invokevirtual   #133 <Method Object Method.invoke(Object, Object[])>
	//  209  445:aload_2         
	//  210  446:aload_3         
	//  211  447:invokestatic    #93  <Method void zza(String, Object, StringBuffer, StringBuffer)>
		  goto _L4
	//* 212  450:goto            368
		nosuchmethodexception = ((NoSuchMethodException) (new String("get")));
	//  213  453:new             #58  <Class String>
	//  214  456:dup             
	//  215  457:ldc1            #143 <String "get">
	//  216  459:invokespecial   #142 <Method void String(String)>
	//  217  462:astore          9
		  goto _L10
	//* 218  464:goto            420
		nosuchmethodexception;
	//  219  467:astore          9
		  goto _L4
	//* 220  469:goto            368
		if(s == null) goto _L1; else goto _L11
	//  221  472:aload_0         
	//  222  473:ifnull          4
_L11:
		stringbuffer.setLength(j1);
	//  223  476:aload_2         
	//  224  477:iload           7
	//  225  479:invokevirtual   #147 <Method void StringBuffer.setLength(int)>
		stringbuffer1.append(stringbuffer).append(">\n");
	//  226  482:aload_3         
	//  227  483:aload_2         
	//  228  484:invokevirtual   #24  <Method StringBuffer StringBuffer.append(StringBuffer)>
	//  229  487:ldc1            #149 <String ">\n">
	//  230  489:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//  231  492:pop             
		return;
	//  232  493:return          
		s = zzkd(s);
	//  233  494:aload_0         
	//  234  495:invokestatic    #28  <Method String zzkd(String)>
	//  235  498:astore_0        
		stringbuffer1.append(stringbuffer).append(s).append(": ");
	//  236  499:aload_3         
	//  237  500:aload_2         
	//  238  501:invokevirtual   #24  <Method StringBuffer StringBuffer.append(StringBuffer)>
	//  239  504:aload_0         
	//  240  505:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//  241  508:ldc1            #151 <String ": ">
	//  242  510:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//  243  513:pop             
		if(obj instanceof String)
	//* 244  514:aload_1         
	//* 245  515:instanceof      #58  <Class String>
	//* 246  518:ifeq            553
		{
			s = zzcE((String)obj);
	//  247  521:aload_1         
	//  248  522:checkcast       #58  <Class String>
	//  249  525:invokestatic    #154 <Method String zzcE(String)>
	//  250  528:astore_0        
			stringbuffer1.append("\"").append(s).append("\"");
	//  251  529:aload_3         
	//  252  530:ldc1            #156 <String "\"">
	//  253  532:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//  254  535:aload_0         
	//  255  536:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//  256  539:ldc1            #156 <String "\"">
	//  257  541:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//  258  544:pop             
		} else
	//* 259  545:aload_3         
	//* 260  546:ldc1            #158 <String "\n">
	//* 261  548:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//* 262  551:pop             
	//* 263  552:return          
		if(obj instanceof byte[])
	//* 264  553:aload_1         
	//* 265  554:instanceof      #160 <Class byte[]>
	//* 266  557:ifeq            571
			zza((byte[])obj, stringbuffer1);
	//  267  560:aload_1         
	//  268  561:checkcast       #160 <Class byte[]>
	//  269  564:aload_3         
	//  270  565:invokestatic    #163 <Method void zza(byte[], StringBuffer)>
		else
	//* 271  568:goto            545
			stringbuffer1.append(obj);
	//  272  571:aload_3         
	//  273  572:aload_1         
	//  274  573:invokevirtual   #166 <Method StringBuffer StringBuffer.append(Object)>
	//  275  576:pop             
		stringbuffer1.append("\n");
		return;
	//* 276  577:goto            545
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
		int i = 0;
	//   11   19:iconst_0        
	//   12   20:istore_2        
		while(i < abyte0.length) 
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
	//*  28   44:icmpne          66
				stringbuffer.append('\\').append((char)j);
	//   29   47:aload_1         
	//   30   48:bipush          92
	//   31   50:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   32   53:iload_3         
	//   33   54:int2char        
	//   34   55:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   35   58:pop             
			else
	//*  36   59:iload_2         
	//*  37   60:iconst_1        
	//*  38   61:iadd            
	//*  39   62:istore_2        
	//*  40   63:goto            21
			if(j >= 32 && j < 127)
	//*  41   66:iload_3         
	//*  42   67:bipush          32
	//*  43   69:icmplt          88
	//*  44   72:iload_3         
	//*  45   73:bipush          127
	//*  46   75:icmpge          88
				stringbuffer.append((char)j);
	//   47   78:aload_1         
	//   48   79:iload_3         
	//   49   80:int2char        
	//   50   81:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   51   84:pop             
			else
	//*  52   85:goto            59
				stringbuffer.append(String.format("\\%03o", new Object[] {
					Integer.valueOf(j)
				}));
	//   53   88:aload_1         
	//   54   89:ldc1            #175 <String "\\%03o">
	//   55   91:iconst_1        
	//   56   92:anewarray       Object[]
	//   57   95:dup             
	//   58   96:iconst_0        
	//   59   97:iload_3         
	//   60   98:invokestatic    #180 <Method Integer Integer.valueOf(int)>
	//   61  101:aastore         
	//   62  102:invokestatic    #184 <Method String String.format(String, Object[])>
	//   63  105:invokevirtual   #31  <Method StringBuffer StringBuffer.append(String)>
	//   64  108:pop             
			i++;
		}
	//*  65  109:goto            59
		stringbuffer.append('"');
	//   66  112:aload_1         
	//   67  113:bipush          34
	//   68  115:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   69  118:pop             
	//   70  119:return          
	}

	private static String zzcE(String s)
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
		return zzdC(s1);
	//   20   40:aload_1         
	//   21   41:invokestatic    #194 <Method String zzdC(String)>
	//   22   44:areturn         
	}

	private static String zzdC(String s)
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
		int i = 0;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		while(i < j) 
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
	//*  19   31:icmplt          66
	//*  20   34:iload_1         
	//*  21   35:bipush          126
	//*  22   37:icmpgt          66
	//*  23   40:iload_1         
	//*  24   41:bipush          34
	//*  25   43:icmpeq          66
	//*  26   46:iload_1         
	//*  27   47:bipush          39
	//*  28   49:icmpeq          66
				stringbuilder.append(c);
	//   29   52:aload           4
	//   30   54:iload_1         
	//   31   55:invokevirtual   #205 <Method StringBuilder StringBuilder.append(char)>
	//   32   58:pop             
			else
	//*  33   59:iload_2         
	//*  34   60:iconst_1        
	//*  35   61:iadd            
	//*  36   62:istore_2        
	//*  37   63:goto            17
				stringbuilder.append(String.format("\\u%04x", new Object[] {
					Integer.valueOf(((int) (c)))
				}));
	//   38   66:aload           4
	//   39   68:ldc1            #207 <String "\\u%04x">
	//   40   70:iconst_1        
	//   41   71:anewarray       Object[]
	//   42   74:dup             
	//   43   75:iconst_0        
	//   44   76:iload_1         
	//   45   77:invokestatic    #180 <Method Integer Integer.valueOf(int)>
	//   46   80:aastore         
	//   47   81:invokestatic    #184 <Method String String.format(String, Object[])>
	//   48   84:invokevirtual   #210 <Method StringBuilder StringBuilder.append(String)>
	//   49   87:pop             
			i++;
		}
	//*  50   88:goto            59
		return stringbuilder.toString();
	//   51   91:aload           4
	//   52   93:invokevirtual   #213 <Method String StringBuilder.toString()>
	//   53   96:areturn         
	}

	public static String zzg(zzbut zzbut1)
	{
		if(zzbut1 == null)
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
			zza(((String) (null)), ((Object) (zzbut1)), new StringBuffer(), stringbuffer);
	//    8   15:aconst_null     
	//    9   16:aload_0         
	//   10   17:new             #16  <Class StringBuffer>
	//   11   20:dup             
	//   12   21:invokespecial   #220 <Method void StringBuffer()>
	//   13   24:aload_1         
	//   14   25:invokestatic    #93  <Method void zza(String, Object, StringBuffer, StringBuffer)>
		}
	//*  15   28:aload_1         
	//*  16   29:invokevirtual   #221 <Method String StringBuffer.toString()>
	//*  17   32:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbut zzbut1)
	//*  18   33:astore_0        
		{
			zzbut1 = ((zzbut) (String.valueOf(((Object) (((IllegalAccessException) (zzbut1)).getMessage())))));
	//   19   34:aload_0         
	//   20   35:invokevirtual   #224 <Method String IllegalAccessException.getMessage()>
	//   21   38:invokestatic    #119 <Method String String.valueOf(Object)>
	//   22   41:astore_0        
			if(((String) (zzbut1)).length() != 0)
	//*  23   42:aload_0         
	//*  24   43:invokevirtual   #120 <Method int String.length()>
	//*  25   46:ifeq            56
				return "Error printing proto: ".concat(((String) (zzbut1)));
	//   26   49:ldc1            #226 <String "Error printing proto: ">
	//   27   51:aload_0         
	//   28   52:invokevirtual   #125 <Method String String.concat(String)>
	//   29   55:areturn         
			else
				return new String("Error printing proto: ");
	//   30   56:new             #58  <Class String>
	//   31   59:dup             
	//   32   60:ldc1            #226 <String "Error printing proto: ">
	//   33   62:invokespecial   #142 <Method void String(String)>
	//   34   65:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(zzbut zzbut1)
	//*  35   66:astore_0        
		{
			zzbut1 = ((zzbut) (String.valueOf(((Object) (((InvocationTargetException) (zzbut1)).getMessage())))));
	//   36   67:aload_0         
	//   37   68:invokevirtual   #227 <Method String InvocationTargetException.getMessage()>
	//   38   71:invokestatic    #119 <Method String String.valueOf(Object)>
	//   39   74:astore_0        
			if(((String) (zzbut1)).length() != 0)
	//*  40   75:aload_0         
	//*  41   76:invokevirtual   #120 <Method int String.length()>
	//*  42   79:ifeq            89
				return "Error printing proto: ".concat(((String) (zzbut1)));
	//   43   82:ldc1            #226 <String "Error printing proto: ">
	//   44   84:aload_0         
	//   45   85:invokevirtual   #125 <Method String String.concat(String)>
	//   46   88:areturn         
			else
				return new String("Error printing proto: ");
	//   47   89:new             #58  <Class String>
	//   48   92:dup             
	//   49   93:ldc1            #226 <String "Error printing proto: ">
	//   50   95:invokespecial   #142 <Method void String(String)>
	//   51   98:areturn         
		}
		return stringbuffer.toString();
	}

	private static String zzkd(String s)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #16  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #220 <Method void StringBuffer()>
	//    3    7:astore_3        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		while(i < s.length()) 
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
	//*  15   25:ifne            44
				stringbuffer.append(Character.toLowerCase(c));
	//   16   28:aload_3         
	//   17   29:iload_1         
	//   18   30:invokestatic    #235 <Method char Character.toLowerCase(char)>
	//   19   33:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   20   36:pop             
			else
	//*  21   37:iload_2         
	//*  22   38:iconst_1        
	//*  23   39:iadd            
	//*  24   40:istore_2        
	//*  25   41:goto            10
			if(Character.isUpperCase(c))
	//*  26   44:iload_1         
	//*  27   45:invokestatic    #239 <Method boolean Character.isUpperCase(char)>
	//*  28   48:ifeq            68
				stringbuffer.append('_').append(Character.toLowerCase(c));
	//   29   51:aload_3         
	//   30   52:bipush          95
	//   31   54:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   32   57:iload_1         
	//   33   58:invokestatic    #235 <Method char Character.toLowerCase(char)>
	//   34   61:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   35   64:pop             
			else
	//*  36   65:goto            37
				stringbuffer.append(c);
	//   37   68:aload_3         
	//   38   69:iload_1         
	//   39   70:invokevirtual   #173 <Method StringBuffer StringBuffer.append(char)>
	//   40   73:pop             
			i++;
		}
	//*  41   74:goto            37
		return stringbuffer.toString();
	//   42   77:aload_3         
	//   43   78:invokevirtual   #221 <Method String StringBuffer.toString()>
	//   44   81:areturn         
	}
}
