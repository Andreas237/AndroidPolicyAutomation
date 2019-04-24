// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.simpleparser;

import java.util.HashMap;
import java.util.Map;

public class EntitiesToUnicode
{

	public EntitiesToUnicode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #536 <Method void Object()>
	//    2    4:return          
	}

	public static char decodeEntity(String s)
	{
		char c = '\0';
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(s.startsWith("#x"))
	//*   2    2:aload_0         
	//*   3    3:ldc2            #542 <String "#x">
	//*   4    6:invokevirtual   #548 <Method boolean String.startsWith(String)>
	//*   5    9:ifeq            31
		{
			int i;
			try
			{
				i = Integer.parseInt(s.substring(2), 16);
	//    6   12:aload_0         
	//    7   13:iconst_2        
	//    8   14:invokevirtual   #552 <Method String String.substring(int)>
	//    9   17:bipush          16
	//   10   19:invokestatic    #558 <Method int Integer.parseInt(String, int)>
	//   11   22:istore_2        
			}
	//*  12   23:iload_2         
	//*  13   24:int2char        
	//*  14   25:istore_1        
	//*  15   26:iload_1         
	//*  16   27:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  17   28:astore_0        
			{
				return '\0';
	//   18   29:iconst_0        
	//   19   30:ireturn         
			}
			c = (char)i;
		} else
		{
			if(s.startsWith("#"))
	//*  20   31:aload_0         
	//*  21   32:ldc2            #560 <String "#">
	//*  22   35:invokevirtual   #548 <Method boolean String.startsWith(String)>
	//*  23   38:ifeq            56
			{
				int j;
				try
				{
					j = Integer.parseInt(s.substring(1));
	//   24   41:aload_0         
	//   25   42:iconst_1        
	//   26   43:invokevirtual   #552 <Method String String.substring(int)>
	//   27   46:invokestatic    #563 <Method int Integer.parseInt(String)>
	//   28   49:istore_2        
				}
	//*  29   50:iload_2         
	//*  30   51:int2char        
	//*  31   52:ireturn         
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  32   53:astore_0        
				{
					return '\0';
	//   33   54:iconst_0        
	//   34   55:ireturn         
				}
				return (char)j;
			}
			s = ((String) ((Character)MAP.get(((Object) (s)))));
	//   35   56:getstatic       #16  <Field Map MAP>
	//   36   59:aload_0         
	//   37   60:invokeinterface #567 <Method Object Map.get(Object)>
	//   38   65:checkcast       #20  <Class Character>
	//   39   68:astore_0        
			if(s != null)
	//*  40   69:aload_0         
	//*  41   70:ifnull          26
				return ((Character) (s)).charValue();
	//   42   73:aload_0         
	//   43   74:invokevirtual   #571 <Method char Character.charValue()>
	//   44   77:ireturn         
		}
		return c;
	}

	public static String decodeString(String s)
	{
		int i = s.indexOf('&');
	//    0    0:aload_0         
	//    1    1:bipush          38
	//    2    3:invokevirtual   #577 <Method int String.indexOf(int)>
	//    3    6:istore_2        
		if(i == -1)
	//*   4    7:iload_2         
	//*   5    8:iconst_m1       
	//*   6    9:icmpne          14
			return s;
	//    7   12:aload_0         
	//    8   13:areturn         
		StringBuffer stringbuffer = new StringBuffer(s.substring(0, i));
	//    9   14:new             #579 <Class StringBuffer>
	//   10   17:dup             
	//   11   18:aload_0         
	//   12   19:iconst_0        
	//   13   20:iload_2         
	//   14   21:invokevirtual   #582 <Method String String.substring(int, int)>
	//   15   24:invokespecial   #585 <Method void StringBuffer(String)>
	//   16   27:astore          6
		do
		{
			int l = s.indexOf(';', i);
	//   17   29:aload_0         
	//   18   30:bipush          59
	//   19   32:iload_2         
	//   20   33:invokevirtual   #588 <Method int String.indexOf(int, int)>
	//   21   36:istore          5
			if(l == -1)
	//*  22   38:iload           5
	//*  23   40:iconst_m1       
	//*  24   41:icmpne          61
			{
				stringbuffer.append(s.substring(i));
	//   25   44:aload           6
	//   26   46:aload_0         
	//   27   47:iload_2         
	//   28   48:invokevirtual   #552 <Method String String.substring(int)>
	//   29   51:invokevirtual   #592 <Method StringBuffer StringBuffer.append(String)>
	//   30   54:pop             
				return stringbuffer.toString();
	//   31   55:aload           6
	//   32   57:invokevirtual   #596 <Method String StringBuffer.toString()>
	//   33   60:areturn         
			}
			int k = s.indexOf('&', i + 1);
	//   34   61:aload_0         
	//   35   62:bipush          38
	//   36   64:iload_2         
	//   37   65:iconst_1        
	//   38   66:iadd            
	//   39   67:invokevirtual   #588 <Method int String.indexOf(int, int)>
	//   40   70:istore          4
			int j = i;
	//   41   72:iload_2         
	//   42   73:istore_3        
			for(i = k; i != -1 && i < l; i = s.indexOf('&', j + 1))
	//*  43   74:iload           4
	//*  44   76:istore_2        
	//*  45   77:iload_2         
	//*  46   78:iconst_m1       
	//*  47   79:icmpeq          115
	//*  48   82:iload_2         
	//*  49   83:iload           5
	//*  50   85:icmpge          115
			{
				stringbuffer.append(s.substring(j, i));
	//   51   88:aload           6
	//   52   90:aload_0         
	//   53   91:iload_3         
	//   54   92:iload_2         
	//   55   93:invokevirtual   #582 <Method String String.substring(int, int)>
	//   56   96:invokevirtual   #592 <Method StringBuffer StringBuffer.append(String)>
	//   57   99:pop             
				j = i;
	//   58  100:iload_2         
	//   59  101:istore_3        
			}

	//   60  102:aload_0         
	//   61  103:bipush          38
	//   62  105:iload_3         
	//   63  106:iconst_1        
	//   64  107:iadd            
	//   65  108:invokevirtual   #588 <Method int String.indexOf(int, int)>
	//   66  111:istore_2        
	//*  67  112:goto            77
			char c = decodeEntity(s.substring(j + 1, l));
	//   68  115:aload_0         
	//   69  116:iload_3         
	//   70  117:iconst_1        
	//   71  118:iadd            
	//   72  119:iload           5
	//   73  121:invokevirtual   #582 <Method String String.substring(int, int)>
	//   74  124:invokestatic    #598 <Method char decodeEntity(String)>
	//   75  127:istore_1        
			if(s.length() < l + 1)
	//*  76  128:aload_0         
	//*  77  129:invokevirtual   #602 <Method int String.length()>
	//*  78  132:iload           5
	//*  79  134:iconst_1        
	//*  80  135:iadd            
	//*  81  136:icmpge          145
				return stringbuffer.toString();
	//   82  139:aload           6
	//   83  141:invokevirtual   #596 <Method String StringBuffer.toString()>
	//   84  144:areturn         
			if(c == 0)
	//*  85  145:iload_1         
	//*  86  146:ifne            198
				stringbuffer.append(s.substring(j, l + 1));
	//   87  149:aload           6
	//   88  151:aload_0         
	//   89  152:iload_3         
	//   90  153:iload           5
	//   91  155:iconst_1        
	//   92  156:iadd            
	//   93  157:invokevirtual   #582 <Method String String.substring(int, int)>
	//   94  160:invokevirtual   #592 <Method StringBuffer StringBuffer.append(String)>
	//   95  163:pop             
			else
	//*  96  164:aload_0         
	//*  97  165:bipush          38
	//*  98  167:iload           5
	//*  99  169:invokevirtual   #588 <Method int String.indexOf(int, int)>
	//* 100  172:istore_2        
	//* 101  173:iload_2         
	//* 102  174:iconst_m1       
	//* 103  175:icmpne          208
	//* 104  178:aload           6
	//* 105  180:aload_0         
	//* 106  181:iload           5
	//* 107  183:iconst_1        
	//* 108  184:iadd            
	//* 109  185:invokevirtual   #552 <Method String String.substring(int)>
	//* 110  188:invokevirtual   #592 <Method StringBuffer StringBuffer.append(String)>
	//* 111  191:pop             
	//* 112  192:aload           6
	//* 113  194:invokevirtual   #596 <Method String StringBuffer.toString()>
	//* 114  197:areturn         
				stringbuffer.append(c);
	//  115  198:aload           6
	//  116  200:iload_1         
	//  117  201:invokevirtual   #605 <Method StringBuffer StringBuffer.append(char)>
	//  118  204:pop             
			i = s.indexOf('&', l);
			if(i == -1)
			{
				stringbuffer.append(s.substring(l + 1));
				return stringbuffer.toString();
			}
	//* 119  205:goto            164
			stringbuffer.append(s.substring(l + 1, i));
	//  120  208:aload           6
	//  121  210:aload_0         
	//  122  211:iload           5
	//  123  213:iconst_1        
	//  124  214:iadd            
	//  125  215:iload_2         
	//  126  216:invokevirtual   #582 <Method String String.substring(int, int)>
	//  127  219:invokevirtual   #592 <Method StringBuffer StringBuffer.append(String)>
	//  128  222:pop             
		} while(true);
	//  129  223:goto            29
	}

	private static final Map MAP;

	static 
	{
		MAP = ((Map) (new HashMap()));
	//    0    0:new             #11  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void HashMap()>
	//    3    7:putstatic       #16  <Field Map MAP>
		MAP.put("nbsp", ((Object) (Character.valueOf('\240'))));
	//    4   10:getstatic       #16  <Field Map MAP>
	//    5   13:ldc1            #18  <String "nbsp">
	//    6   15:sipush          160
	//    7   18:invokestatic    #24  <Method Character Character.valueOf(char)>
	//    8   21:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//    9   26:pop             
		MAP.put("iexcl", ((Object) (Character.valueOf('\241'))));
	//   10   27:getstatic       #16  <Field Map MAP>
	//   11   30:ldc1            #32  <String "iexcl">
	//   12   32:sipush          161
	//   13   35:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   14   38:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   15   43:pop             
		MAP.put("cent", ((Object) (Character.valueOf('\242'))));
	//   16   44:getstatic       #16  <Field Map MAP>
	//   17   47:ldc1            #34  <String "cent">
	//   18   49:sipush          162
	//   19   52:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   20   55:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   21   60:pop             
		MAP.put("pound", ((Object) (Character.valueOf('\243'))));
	//   22   61:getstatic       #16  <Field Map MAP>
	//   23   64:ldc1            #36  <String "pound">
	//   24   66:sipush          163
	//   25   69:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   26   72:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   27   77:pop             
		MAP.put("curren", ((Object) (Character.valueOf('\244'))));
	//   28   78:getstatic       #16  <Field Map MAP>
	//   29   81:ldc1            #38  <String "curren">
	//   30   83:sipush          164
	//   31   86:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   32   89:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   33   94:pop             
		MAP.put("yen", ((Object) (Character.valueOf('\245'))));
	//   34   95:getstatic       #16  <Field Map MAP>
	//   35   98:ldc1            #40  <String "yen">
	//   36  100:sipush          165
	//   37  103:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   38  106:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   39  111:pop             
		MAP.put("brvbar", ((Object) (Character.valueOf('\246'))));
	//   40  112:getstatic       #16  <Field Map MAP>
	//   41  115:ldc1            #42  <String "brvbar">
	//   42  117:sipush          166
	//   43  120:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   44  123:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   45  128:pop             
		MAP.put("sect", ((Object) (Character.valueOf('\247'))));
	//   46  129:getstatic       #16  <Field Map MAP>
	//   47  132:ldc1            #44  <String "sect">
	//   48  134:sipush          167
	//   49  137:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   50  140:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   51  145:pop             
		MAP.put("uml", ((Object) (Character.valueOf('\250'))));
	//   52  146:getstatic       #16  <Field Map MAP>
	//   53  149:ldc1            #46  <String "uml">
	//   54  151:sipush          168
	//   55  154:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   56  157:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   57  162:pop             
		MAP.put("copy", ((Object) (Character.valueOf('\251'))));
	//   58  163:getstatic       #16  <Field Map MAP>
	//   59  166:ldc1            #48  <String "copy">
	//   60  168:sipush          169
	//   61  171:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   62  174:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   63  179:pop             
		MAP.put("ordf", ((Object) (Character.valueOf('\252'))));
	//   64  180:getstatic       #16  <Field Map MAP>
	//   65  183:ldc1            #50  <String "ordf">
	//   66  185:sipush          170
	//   67  188:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   68  191:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   69  196:pop             
		MAP.put("laquo", ((Object) (Character.valueOf('\253'))));
	//   70  197:getstatic       #16  <Field Map MAP>
	//   71  200:ldc1            #52  <String "laquo">
	//   72  202:sipush          171
	//   73  205:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   74  208:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   75  213:pop             
		MAP.put("not", ((Object) (Character.valueOf('\254'))));
	//   76  214:getstatic       #16  <Field Map MAP>
	//   77  217:ldc1            #54  <String "not">
	//   78  219:sipush          172
	//   79  222:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   80  225:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   81  230:pop             
		MAP.put("shy", ((Object) (Character.valueOf('\255'))));
	//   82  231:getstatic       #16  <Field Map MAP>
	//   83  234:ldc1            #56  <String "shy">
	//   84  236:sipush          173
	//   85  239:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   86  242:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   87  247:pop             
		MAP.put("reg", ((Object) (Character.valueOf('\256'))));
	//   88  248:getstatic       #16  <Field Map MAP>
	//   89  251:ldc1            #58  <String "reg">
	//   90  253:sipush          174
	//   91  256:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   92  259:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   93  264:pop             
		MAP.put("macr", ((Object) (Character.valueOf('\257'))));
	//   94  265:getstatic       #16  <Field Map MAP>
	//   95  268:ldc1            #60  <String "macr">
	//   96  270:sipush          175
	//   97  273:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   98  276:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   99  281:pop             
		MAP.put("deg", ((Object) (Character.valueOf('\260'))));
	//  100  282:getstatic       #16  <Field Map MAP>
	//  101  285:ldc1            #62  <String "deg">
	//  102  287:sipush          176
	//  103  290:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  104  293:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  105  298:pop             
		MAP.put("plusmn", ((Object) (Character.valueOf('\261'))));
	//  106  299:getstatic       #16  <Field Map MAP>
	//  107  302:ldc1            #64  <String "plusmn">
	//  108  304:sipush          177
	//  109  307:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  110  310:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  111  315:pop             
		MAP.put("sup2", ((Object) (Character.valueOf('\262'))));
	//  112  316:getstatic       #16  <Field Map MAP>
	//  113  319:ldc1            #66  <String "sup2">
	//  114  321:sipush          178
	//  115  324:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  116  327:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  117  332:pop             
		MAP.put("sup3", ((Object) (Character.valueOf('\263'))));
	//  118  333:getstatic       #16  <Field Map MAP>
	//  119  336:ldc1            #68  <String "sup3">
	//  120  338:sipush          179
	//  121  341:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  122  344:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  123  349:pop             
		MAP.put("acute", ((Object) (Character.valueOf('\264'))));
	//  124  350:getstatic       #16  <Field Map MAP>
	//  125  353:ldc1            #70  <String "acute">
	//  126  355:sipush          180
	//  127  358:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  128  361:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  129  366:pop             
		MAP.put("micro", ((Object) (Character.valueOf('\265'))));
	//  130  367:getstatic       #16  <Field Map MAP>
	//  131  370:ldc1            #72  <String "micro">
	//  132  372:sipush          181
	//  133  375:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  134  378:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  135  383:pop             
		MAP.put("para", ((Object) (Character.valueOf('\266'))));
	//  136  384:getstatic       #16  <Field Map MAP>
	//  137  387:ldc1            #74  <String "para">
	//  138  389:sipush          182
	//  139  392:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  140  395:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  141  400:pop             
		MAP.put("middot", ((Object) (Character.valueOf('\267'))));
	//  142  401:getstatic       #16  <Field Map MAP>
	//  143  404:ldc1            #76  <String "middot">
	//  144  406:sipush          183
	//  145  409:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  146  412:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  147  417:pop             
		MAP.put("cedil", ((Object) (Character.valueOf('\270'))));
	//  148  418:getstatic       #16  <Field Map MAP>
	//  149  421:ldc1            #78  <String "cedil">
	//  150  423:sipush          184
	//  151  426:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  152  429:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  153  434:pop             
		MAP.put("sup1", ((Object) (Character.valueOf('\271'))));
	//  154  435:getstatic       #16  <Field Map MAP>
	//  155  438:ldc1            #80  <String "sup1">
	//  156  440:sipush          185
	//  157  443:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  158  446:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  159  451:pop             
		MAP.put("ordm", ((Object) (Character.valueOf('\272'))));
	//  160  452:getstatic       #16  <Field Map MAP>
	//  161  455:ldc1            #82  <String "ordm">
	//  162  457:sipush          186
	//  163  460:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  164  463:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  165  468:pop             
		MAP.put("raquo", ((Object) (Character.valueOf('\273'))));
	//  166  469:getstatic       #16  <Field Map MAP>
	//  167  472:ldc1            #84  <String "raquo">
	//  168  474:sipush          187
	//  169  477:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  170  480:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  171  485:pop             
		MAP.put("frac14", ((Object) (Character.valueOf('\274'))));
	//  172  486:getstatic       #16  <Field Map MAP>
	//  173  489:ldc1            #86  <String "frac14">
	//  174  491:sipush          188
	//  175  494:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  176  497:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  177  502:pop             
		MAP.put("frac12", ((Object) (Character.valueOf('\275'))));
	//  178  503:getstatic       #16  <Field Map MAP>
	//  179  506:ldc1            #88  <String "frac12">
	//  180  508:sipush          189
	//  181  511:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  182  514:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  183  519:pop             
		MAP.put("frac34", ((Object) (Character.valueOf('\276'))));
	//  184  520:getstatic       #16  <Field Map MAP>
	//  185  523:ldc1            #90  <String "frac34">
	//  186  525:sipush          190
	//  187  528:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  188  531:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  189  536:pop             
		MAP.put("iquest", ((Object) (Character.valueOf('\277'))));
	//  190  537:getstatic       #16  <Field Map MAP>
	//  191  540:ldc1            #92  <String "iquest">
	//  192  542:sipush          191
	//  193  545:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  194  548:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  195  553:pop             
		MAP.put("Agrave", ((Object) (Character.valueOf('\300'))));
	//  196  554:getstatic       #16  <Field Map MAP>
	//  197  557:ldc1            #94  <String "Agrave">
	//  198  559:sipush          192
	//  199  562:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  200  565:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  201  570:pop             
		MAP.put("Aacute", ((Object) (Character.valueOf('\301'))));
	//  202  571:getstatic       #16  <Field Map MAP>
	//  203  574:ldc1            #96  <String "Aacute">
	//  204  576:sipush          193
	//  205  579:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  206  582:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  207  587:pop             
		MAP.put("Acirc", ((Object) (Character.valueOf('\302'))));
	//  208  588:getstatic       #16  <Field Map MAP>
	//  209  591:ldc1            #98  <String "Acirc">
	//  210  593:sipush          194
	//  211  596:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  212  599:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  213  604:pop             
		MAP.put("Atilde", ((Object) (Character.valueOf('\303'))));
	//  214  605:getstatic       #16  <Field Map MAP>
	//  215  608:ldc1            #100 <String "Atilde">
	//  216  610:sipush          195
	//  217  613:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  218  616:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  219  621:pop             
		MAP.put("Auml", ((Object) (Character.valueOf('\304'))));
	//  220  622:getstatic       #16  <Field Map MAP>
	//  221  625:ldc1            #102 <String "Auml">
	//  222  627:sipush          196
	//  223  630:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  224  633:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  225  638:pop             
		MAP.put("Aring", ((Object) (Character.valueOf('\305'))));
	//  226  639:getstatic       #16  <Field Map MAP>
	//  227  642:ldc1            #104 <String "Aring">
	//  228  644:sipush          197
	//  229  647:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  230  650:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  231  655:pop             
		MAP.put("AElig", ((Object) (Character.valueOf('\306'))));
	//  232  656:getstatic       #16  <Field Map MAP>
	//  233  659:ldc1            #106 <String "AElig">
	//  234  661:sipush          198
	//  235  664:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  236  667:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  237  672:pop             
		MAP.put("Ccedil", ((Object) (Character.valueOf('\307'))));
	//  238  673:getstatic       #16  <Field Map MAP>
	//  239  676:ldc1            #108 <String "Ccedil">
	//  240  678:sipush          199
	//  241  681:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  242  684:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  243  689:pop             
		MAP.put("Egrave", ((Object) (Character.valueOf('\310'))));
	//  244  690:getstatic       #16  <Field Map MAP>
	//  245  693:ldc1            #110 <String "Egrave">
	//  246  695:sipush          200
	//  247  698:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  248  701:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  249  706:pop             
		MAP.put("Eacute", ((Object) (Character.valueOf('\311'))));
	//  250  707:getstatic       #16  <Field Map MAP>
	//  251  710:ldc1            #112 <String "Eacute">
	//  252  712:sipush          201
	//  253  715:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  254  718:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  255  723:pop             
		MAP.put("Ecirc", ((Object) (Character.valueOf('\312'))));
	//  256  724:getstatic       #16  <Field Map MAP>
	//  257  727:ldc1            #114 <String "Ecirc">
	//  258  729:sipush          202
	//  259  732:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  260  735:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  261  740:pop             
		MAP.put("Euml", ((Object) (Character.valueOf('\313'))));
	//  262  741:getstatic       #16  <Field Map MAP>
	//  263  744:ldc1            #116 <String "Euml">
	//  264  746:sipush          203
	//  265  749:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  266  752:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  267  757:pop             
		MAP.put("Igrave", ((Object) (Character.valueOf('\314'))));
	//  268  758:getstatic       #16  <Field Map MAP>
	//  269  761:ldc1            #118 <String "Igrave">
	//  270  763:sipush          204
	//  271  766:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  272  769:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  273  774:pop             
		MAP.put("Iacute", ((Object) (Character.valueOf('\315'))));
	//  274  775:getstatic       #16  <Field Map MAP>
	//  275  778:ldc1            #120 <String "Iacute">
	//  276  780:sipush          205
	//  277  783:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  278  786:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  279  791:pop             
		MAP.put("Icirc", ((Object) (Character.valueOf('\316'))));
	//  280  792:getstatic       #16  <Field Map MAP>
	//  281  795:ldc1            #122 <String "Icirc">
	//  282  797:sipush          206
	//  283  800:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  284  803:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  285  808:pop             
		MAP.put("Iuml", ((Object) (Character.valueOf('\317'))));
	//  286  809:getstatic       #16  <Field Map MAP>
	//  287  812:ldc1            #124 <String "Iuml">
	//  288  814:sipush          207
	//  289  817:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  290  820:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  291  825:pop             
		MAP.put("ETH", ((Object) (Character.valueOf('\320'))));
	//  292  826:getstatic       #16  <Field Map MAP>
	//  293  829:ldc1            #126 <String "ETH">
	//  294  831:sipush          208
	//  295  834:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  296  837:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  297  842:pop             
		MAP.put("Ntilde", ((Object) (Character.valueOf('\321'))));
	//  298  843:getstatic       #16  <Field Map MAP>
	//  299  846:ldc1            #128 <String "Ntilde">
	//  300  848:sipush          209
	//  301  851:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  302  854:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  303  859:pop             
		MAP.put("Ograve", ((Object) (Character.valueOf('\322'))));
	//  304  860:getstatic       #16  <Field Map MAP>
	//  305  863:ldc1            #130 <String "Ograve">
	//  306  865:sipush          210
	//  307  868:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  308  871:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  309  876:pop             
		MAP.put("Oacute", ((Object) (Character.valueOf('\323'))));
	//  310  877:getstatic       #16  <Field Map MAP>
	//  311  880:ldc1            #132 <String "Oacute">
	//  312  882:sipush          211
	//  313  885:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  314  888:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  315  893:pop             
		MAP.put("Ocirc", ((Object) (Character.valueOf('\324'))));
	//  316  894:getstatic       #16  <Field Map MAP>
	//  317  897:ldc1            #134 <String "Ocirc">
	//  318  899:sipush          212
	//  319  902:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  320  905:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  321  910:pop             
		MAP.put("Otilde", ((Object) (Character.valueOf('\325'))));
	//  322  911:getstatic       #16  <Field Map MAP>
	//  323  914:ldc1            #136 <String "Otilde">
	//  324  916:sipush          213
	//  325  919:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  326  922:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  327  927:pop             
		MAP.put("Ouml", ((Object) (Character.valueOf('\326'))));
	//  328  928:getstatic       #16  <Field Map MAP>
	//  329  931:ldc1            #138 <String "Ouml">
	//  330  933:sipush          214
	//  331  936:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  332  939:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  333  944:pop             
		MAP.put("times", ((Object) (Character.valueOf('\327'))));
	//  334  945:getstatic       #16  <Field Map MAP>
	//  335  948:ldc1            #140 <String "times">
	//  336  950:sipush          215
	//  337  953:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  338  956:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  339  961:pop             
		MAP.put("Oslash", ((Object) (Character.valueOf('\330'))));
	//  340  962:getstatic       #16  <Field Map MAP>
	//  341  965:ldc1            #142 <String "Oslash">
	//  342  967:sipush          216
	//  343  970:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  344  973:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  345  978:pop             
		MAP.put("Ugrave", ((Object) (Character.valueOf('\331'))));
	//  346  979:getstatic       #16  <Field Map MAP>
	//  347  982:ldc1            #144 <String "Ugrave">
	//  348  984:sipush          217
	//  349  987:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  350  990:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  351  995:pop             
		MAP.put("Uacute", ((Object) (Character.valueOf('\332'))));
	//  352  996:getstatic       #16  <Field Map MAP>
	//  353  999:ldc1            #146 <String "Uacute">
	//  354 1001:sipush          218
	//  355 1004:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  356 1007:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  357 1012:pop             
		MAP.put("Ucirc", ((Object) (Character.valueOf('\333'))));
	//  358 1013:getstatic       #16  <Field Map MAP>
	//  359 1016:ldc1            #148 <String "Ucirc">
	//  360 1018:sipush          219
	//  361 1021:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  362 1024:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  363 1029:pop             
		MAP.put("Uuml", ((Object) (Character.valueOf('\334'))));
	//  364 1030:getstatic       #16  <Field Map MAP>
	//  365 1033:ldc1            #150 <String "Uuml">
	//  366 1035:sipush          220
	//  367 1038:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  368 1041:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  369 1046:pop             
		MAP.put("Yacute", ((Object) (Character.valueOf('\335'))));
	//  370 1047:getstatic       #16  <Field Map MAP>
	//  371 1050:ldc1            #152 <String "Yacute">
	//  372 1052:sipush          221
	//  373 1055:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  374 1058:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  375 1063:pop             
		MAP.put("THORN", ((Object) (Character.valueOf('\336'))));
	//  376 1064:getstatic       #16  <Field Map MAP>
	//  377 1067:ldc1            #154 <String "THORN">
	//  378 1069:sipush          222
	//  379 1072:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  380 1075:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  381 1080:pop             
		MAP.put("szlig", ((Object) (Character.valueOf('\337'))));
	//  382 1081:getstatic       #16  <Field Map MAP>
	//  383 1084:ldc1            #156 <String "szlig">
	//  384 1086:sipush          223
	//  385 1089:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  386 1092:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  387 1097:pop             
		MAP.put("agrave", ((Object) (Character.valueOf('\340'))));
	//  388 1098:getstatic       #16  <Field Map MAP>
	//  389 1101:ldc1            #158 <String "agrave">
	//  390 1103:sipush          224
	//  391 1106:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  392 1109:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  393 1114:pop             
		MAP.put("aacute", ((Object) (Character.valueOf('\341'))));
	//  394 1115:getstatic       #16  <Field Map MAP>
	//  395 1118:ldc1            #160 <String "aacute">
	//  396 1120:sipush          225
	//  397 1123:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  398 1126:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  399 1131:pop             
		MAP.put("acirc", ((Object) (Character.valueOf('\342'))));
	//  400 1132:getstatic       #16  <Field Map MAP>
	//  401 1135:ldc1            #162 <String "acirc">
	//  402 1137:sipush          226
	//  403 1140:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  404 1143:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  405 1148:pop             
		MAP.put("atilde", ((Object) (Character.valueOf('\343'))));
	//  406 1149:getstatic       #16  <Field Map MAP>
	//  407 1152:ldc1            #164 <String "atilde">
	//  408 1154:sipush          227
	//  409 1157:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  410 1160:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  411 1165:pop             
		MAP.put("auml", ((Object) (Character.valueOf('\344'))));
	//  412 1166:getstatic       #16  <Field Map MAP>
	//  413 1169:ldc1            #166 <String "auml">
	//  414 1171:sipush          228
	//  415 1174:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  416 1177:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  417 1182:pop             
		MAP.put("aring", ((Object) (Character.valueOf('\345'))));
	//  418 1183:getstatic       #16  <Field Map MAP>
	//  419 1186:ldc1            #168 <String "aring">
	//  420 1188:sipush          229
	//  421 1191:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  422 1194:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  423 1199:pop             
		MAP.put("aelig", ((Object) (Character.valueOf('\346'))));
	//  424 1200:getstatic       #16  <Field Map MAP>
	//  425 1203:ldc1            #170 <String "aelig">
	//  426 1205:sipush          230
	//  427 1208:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  428 1211:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  429 1216:pop             
		MAP.put("ccedil", ((Object) (Character.valueOf('\347'))));
	//  430 1217:getstatic       #16  <Field Map MAP>
	//  431 1220:ldc1            #172 <String "ccedil">
	//  432 1222:sipush          231
	//  433 1225:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  434 1228:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  435 1233:pop             
		MAP.put("egrave", ((Object) (Character.valueOf('\350'))));
	//  436 1234:getstatic       #16  <Field Map MAP>
	//  437 1237:ldc1            #174 <String "egrave">
	//  438 1239:sipush          232
	//  439 1242:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  440 1245:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  441 1250:pop             
		MAP.put("eacute", ((Object) (Character.valueOf('\351'))));
	//  442 1251:getstatic       #16  <Field Map MAP>
	//  443 1254:ldc1            #176 <String "eacute">
	//  444 1256:sipush          233
	//  445 1259:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  446 1262:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  447 1267:pop             
		MAP.put("ecirc", ((Object) (Character.valueOf('\352'))));
	//  448 1268:getstatic       #16  <Field Map MAP>
	//  449 1271:ldc1            #178 <String "ecirc">
	//  450 1273:sipush          234
	//  451 1276:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  452 1279:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  453 1284:pop             
		MAP.put("euml", ((Object) (Character.valueOf('\353'))));
	//  454 1285:getstatic       #16  <Field Map MAP>
	//  455 1288:ldc1            #180 <String "euml">
	//  456 1290:sipush          235
	//  457 1293:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  458 1296:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  459 1301:pop             
		MAP.put("igrave", ((Object) (Character.valueOf('\354'))));
	//  460 1302:getstatic       #16  <Field Map MAP>
	//  461 1305:ldc1            #182 <String "igrave">
	//  462 1307:sipush          236
	//  463 1310:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  464 1313:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  465 1318:pop             
		MAP.put("iacute", ((Object) (Character.valueOf('\355'))));
	//  466 1319:getstatic       #16  <Field Map MAP>
	//  467 1322:ldc1            #184 <String "iacute">
	//  468 1324:sipush          237
	//  469 1327:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  470 1330:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  471 1335:pop             
		MAP.put("icirc", ((Object) (Character.valueOf('\356'))));
	//  472 1336:getstatic       #16  <Field Map MAP>
	//  473 1339:ldc1            #186 <String "icirc">
	//  474 1341:sipush          238
	//  475 1344:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  476 1347:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  477 1352:pop             
		MAP.put("iuml", ((Object) (Character.valueOf('\357'))));
	//  478 1353:getstatic       #16  <Field Map MAP>
	//  479 1356:ldc1            #188 <String "iuml">
	//  480 1358:sipush          239
	//  481 1361:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  482 1364:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  483 1369:pop             
		MAP.put("eth", ((Object) (Character.valueOf('\360'))));
	//  484 1370:getstatic       #16  <Field Map MAP>
	//  485 1373:ldc1            #190 <String "eth">
	//  486 1375:sipush          240
	//  487 1378:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  488 1381:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  489 1386:pop             
		MAP.put("ntilde", ((Object) (Character.valueOf('\361'))));
	//  490 1387:getstatic       #16  <Field Map MAP>
	//  491 1390:ldc1            #192 <String "ntilde">
	//  492 1392:sipush          241
	//  493 1395:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  494 1398:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  495 1403:pop             
		MAP.put("ograve", ((Object) (Character.valueOf('\362'))));
	//  496 1404:getstatic       #16  <Field Map MAP>
	//  497 1407:ldc1            #194 <String "ograve">
	//  498 1409:sipush          242
	//  499 1412:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  500 1415:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  501 1420:pop             
		MAP.put("oacute", ((Object) (Character.valueOf('\363'))));
	//  502 1421:getstatic       #16  <Field Map MAP>
	//  503 1424:ldc1            #196 <String "oacute">
	//  504 1426:sipush          243
	//  505 1429:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  506 1432:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  507 1437:pop             
		MAP.put("ocirc", ((Object) (Character.valueOf('\364'))));
	//  508 1438:getstatic       #16  <Field Map MAP>
	//  509 1441:ldc1            #198 <String "ocirc">
	//  510 1443:sipush          244
	//  511 1446:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  512 1449:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  513 1454:pop             
		MAP.put("otilde", ((Object) (Character.valueOf('\365'))));
	//  514 1455:getstatic       #16  <Field Map MAP>
	//  515 1458:ldc1            #200 <String "otilde">
	//  516 1460:sipush          245
	//  517 1463:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  518 1466:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  519 1471:pop             
		MAP.put("ouml", ((Object) (Character.valueOf('\366'))));
	//  520 1472:getstatic       #16  <Field Map MAP>
	//  521 1475:ldc1            #202 <String "ouml">
	//  522 1477:sipush          246
	//  523 1480:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  524 1483:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  525 1488:pop             
		MAP.put("divide", ((Object) (Character.valueOf('\367'))));
	//  526 1489:getstatic       #16  <Field Map MAP>
	//  527 1492:ldc1            #204 <String "divide">
	//  528 1494:sipush          247
	//  529 1497:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  530 1500:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  531 1505:pop             
		MAP.put("oslash", ((Object) (Character.valueOf('\370'))));
	//  532 1506:getstatic       #16  <Field Map MAP>
	//  533 1509:ldc1            #206 <String "oslash">
	//  534 1511:sipush          248
	//  535 1514:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  536 1517:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  537 1522:pop             
		MAP.put("ugrave", ((Object) (Character.valueOf('\371'))));
	//  538 1523:getstatic       #16  <Field Map MAP>
	//  539 1526:ldc1            #208 <String "ugrave">
	//  540 1528:sipush          249
	//  541 1531:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  542 1534:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  543 1539:pop             
		MAP.put("uacute", ((Object) (Character.valueOf('\372'))));
	//  544 1540:getstatic       #16  <Field Map MAP>
	//  545 1543:ldc1            #210 <String "uacute">
	//  546 1545:sipush          250
	//  547 1548:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  548 1551:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  549 1556:pop             
		MAP.put("ucirc", ((Object) (Character.valueOf('\373'))));
	//  550 1557:getstatic       #16  <Field Map MAP>
	//  551 1560:ldc1            #212 <String "ucirc">
	//  552 1562:sipush          251
	//  553 1565:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  554 1568:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  555 1573:pop             
		MAP.put("uuml", ((Object) (Character.valueOf('\374'))));
	//  556 1574:getstatic       #16  <Field Map MAP>
	//  557 1577:ldc1            #214 <String "uuml">
	//  558 1579:sipush          252
	//  559 1582:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  560 1585:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  561 1590:pop             
		MAP.put("yacute", ((Object) (Character.valueOf('\375'))));
	//  562 1591:getstatic       #16  <Field Map MAP>
	//  563 1594:ldc1            #216 <String "yacute">
	//  564 1596:sipush          253
	//  565 1599:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  566 1602:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  567 1607:pop             
		MAP.put("thorn", ((Object) (Character.valueOf('\376'))));
	//  568 1608:getstatic       #16  <Field Map MAP>
	//  569 1611:ldc1            #218 <String "thorn">
	//  570 1613:sipush          254
	//  571 1616:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  572 1619:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  573 1624:pop             
		MAP.put("yuml", ((Object) (Character.valueOf('\377'))));
	//  574 1625:getstatic       #16  <Field Map MAP>
	//  575 1628:ldc1            #220 <String "yuml">
	//  576 1630:sipush          255
	//  577 1633:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  578 1636:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  579 1641:pop             
		MAP.put("fnof", ((Object) (Character.valueOf('\u0192'))));
	//  580 1642:getstatic       #16  <Field Map MAP>
	//  581 1645:ldc1            #222 <String "fnof">
	//  582 1647:sipush          402
	//  583 1650:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  584 1653:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  585 1658:pop             
		MAP.put("Alpha", ((Object) (Character.valueOf('\u0391'))));
	//  586 1659:getstatic       #16  <Field Map MAP>
	//  587 1662:ldc1            #224 <String "Alpha">
	//  588 1664:sipush          913
	//  589 1667:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  590 1670:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  591 1675:pop             
		MAP.put("Beta", ((Object) (Character.valueOf('\u0392'))));
	//  592 1676:getstatic       #16  <Field Map MAP>
	//  593 1679:ldc1            #226 <String "Beta">
	//  594 1681:sipush          914
	//  595 1684:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  596 1687:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  597 1692:pop             
		MAP.put("Gamma", ((Object) (Character.valueOf('\u0393'))));
	//  598 1693:getstatic       #16  <Field Map MAP>
	//  599 1696:ldc1            #228 <String "Gamma">
	//  600 1698:sipush          915
	//  601 1701:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  602 1704:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  603 1709:pop             
		MAP.put("Delta", ((Object) (Character.valueOf('\u0394'))));
	//  604 1710:getstatic       #16  <Field Map MAP>
	//  605 1713:ldc1            #230 <String "Delta">
	//  606 1715:sipush          916
	//  607 1718:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  608 1721:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  609 1726:pop             
		MAP.put("Epsilon", ((Object) (Character.valueOf('\u0395'))));
	//  610 1727:getstatic       #16  <Field Map MAP>
	//  611 1730:ldc1            #232 <String "Epsilon">
	//  612 1732:sipush          917
	//  613 1735:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  614 1738:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  615 1743:pop             
		MAP.put("Zeta", ((Object) (Character.valueOf('\u0396'))));
	//  616 1744:getstatic       #16  <Field Map MAP>
	//  617 1747:ldc1            #234 <String "Zeta">
	//  618 1749:sipush          918
	//  619 1752:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  620 1755:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  621 1760:pop             
		MAP.put("Eta", ((Object) (Character.valueOf('\u0397'))));
	//  622 1761:getstatic       #16  <Field Map MAP>
	//  623 1764:ldc1            #236 <String "Eta">
	//  624 1766:sipush          919
	//  625 1769:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  626 1772:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  627 1777:pop             
		MAP.put("Theta", ((Object) (Character.valueOf('\u0398'))));
	//  628 1778:getstatic       #16  <Field Map MAP>
	//  629 1781:ldc1            #238 <String "Theta">
	//  630 1783:sipush          920
	//  631 1786:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  632 1789:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  633 1794:pop             
		MAP.put("Iota", ((Object) (Character.valueOf('\u0399'))));
	//  634 1795:getstatic       #16  <Field Map MAP>
	//  635 1798:ldc1            #240 <String "Iota">
	//  636 1800:sipush          921
	//  637 1803:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  638 1806:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  639 1811:pop             
		MAP.put("Kappa", ((Object) (Character.valueOf('\u039A'))));
	//  640 1812:getstatic       #16  <Field Map MAP>
	//  641 1815:ldc1            #242 <String "Kappa">
	//  642 1817:sipush          922
	//  643 1820:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  644 1823:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  645 1828:pop             
		MAP.put("Lambda", ((Object) (Character.valueOf('\u039B'))));
	//  646 1829:getstatic       #16  <Field Map MAP>
	//  647 1832:ldc1            #244 <String "Lambda">
	//  648 1834:sipush          923
	//  649 1837:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  650 1840:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  651 1845:pop             
		MAP.put("Mu", ((Object) (Character.valueOf('\u039C'))));
	//  652 1846:getstatic       #16  <Field Map MAP>
	//  653 1849:ldc1            #246 <String "Mu">
	//  654 1851:sipush          924
	//  655 1854:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  656 1857:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  657 1862:pop             
		MAP.put("Nu", ((Object) (Character.valueOf('\u039D'))));
	//  658 1863:getstatic       #16  <Field Map MAP>
	//  659 1866:ldc1            #248 <String "Nu">
	//  660 1868:sipush          925
	//  661 1871:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  662 1874:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  663 1879:pop             
		MAP.put("Xi", ((Object) (Character.valueOf('\u039E'))));
	//  664 1880:getstatic       #16  <Field Map MAP>
	//  665 1883:ldc1            #250 <String "Xi">
	//  666 1885:sipush          926
	//  667 1888:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  668 1891:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  669 1896:pop             
		MAP.put("Omicron", ((Object) (Character.valueOf('\u039F'))));
	//  670 1897:getstatic       #16  <Field Map MAP>
	//  671 1900:ldc1            #252 <String "Omicron">
	//  672 1902:sipush          927
	//  673 1905:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  674 1908:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  675 1913:pop             
		MAP.put("Pi", ((Object) (Character.valueOf('\u03A0'))));
	//  676 1914:getstatic       #16  <Field Map MAP>
	//  677 1917:ldc1            #254 <String "Pi">
	//  678 1919:sipush          928
	//  679 1922:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  680 1925:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  681 1930:pop             
		MAP.put("Rho", ((Object) (Character.valueOf('\u03A1'))));
	//  682 1931:getstatic       #16  <Field Map MAP>
	//  683 1934:ldc2            #256 <String "Rho">
	//  684 1937:sipush          929
	//  685 1940:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  686 1943:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  687 1948:pop             
		MAP.put("Sigma", ((Object) (Character.valueOf('\u03A3'))));
	//  688 1949:getstatic       #16  <Field Map MAP>
	//  689 1952:ldc2            #258 <String "Sigma">
	//  690 1955:sipush          931
	//  691 1958:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  692 1961:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  693 1966:pop             
		MAP.put("Tau", ((Object) (Character.valueOf('\u03A4'))));
	//  694 1967:getstatic       #16  <Field Map MAP>
	//  695 1970:ldc2            #260 <String "Tau">
	//  696 1973:sipush          932
	//  697 1976:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  698 1979:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  699 1984:pop             
		MAP.put("Upsilon", ((Object) (Character.valueOf('\u03A5'))));
	//  700 1985:getstatic       #16  <Field Map MAP>
	//  701 1988:ldc2            #262 <String "Upsilon">
	//  702 1991:sipush          933
	//  703 1994:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  704 1997:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  705 2002:pop             
		MAP.put("Phi", ((Object) (Character.valueOf('\u03A6'))));
	//  706 2003:getstatic       #16  <Field Map MAP>
	//  707 2006:ldc2            #264 <String "Phi">
	//  708 2009:sipush          934
	//  709 2012:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  710 2015:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  711 2020:pop             
		MAP.put("Chi", ((Object) (Character.valueOf('\u03A7'))));
	//  712 2021:getstatic       #16  <Field Map MAP>
	//  713 2024:ldc2            #266 <String "Chi">
	//  714 2027:sipush          935
	//  715 2030:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  716 2033:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  717 2038:pop             
		MAP.put("Psi", ((Object) (Character.valueOf('\u03A8'))));
	//  718 2039:getstatic       #16  <Field Map MAP>
	//  719 2042:ldc2            #268 <String "Psi">
	//  720 2045:sipush          936
	//  721 2048:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  722 2051:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  723 2056:pop             
		MAP.put("Omega", ((Object) (Character.valueOf('\u03A9'))));
	//  724 2057:getstatic       #16  <Field Map MAP>
	//  725 2060:ldc2            #270 <String "Omega">
	//  726 2063:sipush          937
	//  727 2066:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  728 2069:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  729 2074:pop             
		MAP.put("alpha", ((Object) (Character.valueOf('\u03B1'))));
	//  730 2075:getstatic       #16  <Field Map MAP>
	//  731 2078:ldc2            #272 <String "alpha">
	//  732 2081:sipush          945
	//  733 2084:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  734 2087:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  735 2092:pop             
		MAP.put("beta", ((Object) (Character.valueOf('\u03B2'))));
	//  736 2093:getstatic       #16  <Field Map MAP>
	//  737 2096:ldc2            #274 <String "beta">
	//  738 2099:sipush          946
	//  739 2102:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  740 2105:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  741 2110:pop             
		MAP.put("gamma", ((Object) (Character.valueOf('\u03B3'))));
	//  742 2111:getstatic       #16  <Field Map MAP>
	//  743 2114:ldc2            #276 <String "gamma">
	//  744 2117:sipush          947
	//  745 2120:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  746 2123:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  747 2128:pop             
		MAP.put("delta", ((Object) (Character.valueOf('\u03B4'))));
	//  748 2129:getstatic       #16  <Field Map MAP>
	//  749 2132:ldc2            #278 <String "delta">
	//  750 2135:sipush          948
	//  751 2138:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  752 2141:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  753 2146:pop             
		MAP.put("epsilon", ((Object) (Character.valueOf('\u03B5'))));
	//  754 2147:getstatic       #16  <Field Map MAP>
	//  755 2150:ldc2            #280 <String "epsilon">
	//  756 2153:sipush          949
	//  757 2156:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  758 2159:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  759 2164:pop             
		MAP.put("zeta", ((Object) (Character.valueOf('\u03B6'))));
	//  760 2165:getstatic       #16  <Field Map MAP>
	//  761 2168:ldc2            #282 <String "zeta">
	//  762 2171:sipush          950
	//  763 2174:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  764 2177:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  765 2182:pop             
		MAP.put("eta", ((Object) (Character.valueOf('\u03B7'))));
	//  766 2183:getstatic       #16  <Field Map MAP>
	//  767 2186:ldc2            #284 <String "eta">
	//  768 2189:sipush          951
	//  769 2192:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  770 2195:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  771 2200:pop             
		MAP.put("theta", ((Object) (Character.valueOf('\u03B8'))));
	//  772 2201:getstatic       #16  <Field Map MAP>
	//  773 2204:ldc2            #286 <String "theta">
	//  774 2207:sipush          952
	//  775 2210:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  776 2213:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  777 2218:pop             
		MAP.put("iota", ((Object) (Character.valueOf('\u03B9'))));
	//  778 2219:getstatic       #16  <Field Map MAP>
	//  779 2222:ldc2            #288 <String "iota">
	//  780 2225:sipush          953
	//  781 2228:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  782 2231:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  783 2236:pop             
		MAP.put("kappa", ((Object) (Character.valueOf('\u03BA'))));
	//  784 2237:getstatic       #16  <Field Map MAP>
	//  785 2240:ldc2            #290 <String "kappa">
	//  786 2243:sipush          954
	//  787 2246:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  788 2249:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  789 2254:pop             
		MAP.put("lambda", ((Object) (Character.valueOf('\u03BB'))));
	//  790 2255:getstatic       #16  <Field Map MAP>
	//  791 2258:ldc2            #292 <String "lambda">
	//  792 2261:sipush          955
	//  793 2264:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  794 2267:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  795 2272:pop             
		MAP.put("mu", ((Object) (Character.valueOf('\u03BC'))));
	//  796 2273:getstatic       #16  <Field Map MAP>
	//  797 2276:ldc2            #294 <String "mu">
	//  798 2279:sipush          956
	//  799 2282:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  800 2285:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  801 2290:pop             
		MAP.put("nu", ((Object) (Character.valueOf('\u03BD'))));
	//  802 2291:getstatic       #16  <Field Map MAP>
	//  803 2294:ldc2            #296 <String "nu">
	//  804 2297:sipush          957
	//  805 2300:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  806 2303:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  807 2308:pop             
		MAP.put("xi", ((Object) (Character.valueOf('\u03BE'))));
	//  808 2309:getstatic       #16  <Field Map MAP>
	//  809 2312:ldc2            #298 <String "xi">
	//  810 2315:sipush          958
	//  811 2318:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  812 2321:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  813 2326:pop             
		MAP.put("omicron", ((Object) (Character.valueOf('\u03BF'))));
	//  814 2327:getstatic       #16  <Field Map MAP>
	//  815 2330:ldc2            #300 <String "omicron">
	//  816 2333:sipush          959
	//  817 2336:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  818 2339:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  819 2344:pop             
		MAP.put("pi", ((Object) (Character.valueOf('\u03C0'))));
	//  820 2345:getstatic       #16  <Field Map MAP>
	//  821 2348:ldc2            #302 <String "pi">
	//  822 2351:sipush          960
	//  823 2354:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  824 2357:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  825 2362:pop             
		MAP.put("rho", ((Object) (Character.valueOf('\u03C1'))));
	//  826 2363:getstatic       #16  <Field Map MAP>
	//  827 2366:ldc2            #304 <String "rho">
	//  828 2369:sipush          961
	//  829 2372:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  830 2375:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  831 2380:pop             
		MAP.put("sigmaf", ((Object) (Character.valueOf('\u03C2'))));
	//  832 2381:getstatic       #16  <Field Map MAP>
	//  833 2384:ldc2            #306 <String "sigmaf">
	//  834 2387:sipush          962
	//  835 2390:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  836 2393:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  837 2398:pop             
		MAP.put("sigma", ((Object) (Character.valueOf('\u03C3'))));
	//  838 2399:getstatic       #16  <Field Map MAP>
	//  839 2402:ldc2            #308 <String "sigma">
	//  840 2405:sipush          963
	//  841 2408:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  842 2411:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  843 2416:pop             
		MAP.put("tau", ((Object) (Character.valueOf('\u03C4'))));
	//  844 2417:getstatic       #16  <Field Map MAP>
	//  845 2420:ldc2            #310 <String "tau">
	//  846 2423:sipush          964
	//  847 2426:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  848 2429:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  849 2434:pop             
		MAP.put("upsilon", ((Object) (Character.valueOf('\u03C5'))));
	//  850 2435:getstatic       #16  <Field Map MAP>
	//  851 2438:ldc2            #312 <String "upsilon">
	//  852 2441:sipush          965
	//  853 2444:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  854 2447:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  855 2452:pop             
		MAP.put("phi", ((Object) (Character.valueOf('\u03C6'))));
	//  856 2453:getstatic       #16  <Field Map MAP>
	//  857 2456:ldc2            #314 <String "phi">
	//  858 2459:sipush          966
	//  859 2462:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  860 2465:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  861 2470:pop             
		MAP.put("chi", ((Object) (Character.valueOf('\u03C7'))));
	//  862 2471:getstatic       #16  <Field Map MAP>
	//  863 2474:ldc2            #316 <String "chi">
	//  864 2477:sipush          967
	//  865 2480:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  866 2483:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  867 2488:pop             
		MAP.put("psi", ((Object) (Character.valueOf('\u03C8'))));
	//  868 2489:getstatic       #16  <Field Map MAP>
	//  869 2492:ldc2            #318 <String "psi">
	//  870 2495:sipush          968
	//  871 2498:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  872 2501:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  873 2506:pop             
		MAP.put("omega", ((Object) (Character.valueOf('\u03C9'))));
	//  874 2507:getstatic       #16  <Field Map MAP>
	//  875 2510:ldc2            #320 <String "omega">
	//  876 2513:sipush          969
	//  877 2516:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  878 2519:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  879 2524:pop             
		MAP.put("thetasym", ((Object) (Character.valueOf('\u03D1'))));
	//  880 2525:getstatic       #16  <Field Map MAP>
	//  881 2528:ldc2            #322 <String "thetasym">
	//  882 2531:sipush          977
	//  883 2534:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  884 2537:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  885 2542:pop             
		MAP.put("upsih", ((Object) (Character.valueOf('\u03D2'))));
	//  886 2543:getstatic       #16  <Field Map MAP>
	//  887 2546:ldc2            #324 <String "upsih">
	//  888 2549:sipush          978
	//  889 2552:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  890 2555:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  891 2560:pop             
		MAP.put("piv", ((Object) (Character.valueOf('\u03D6'))));
	//  892 2561:getstatic       #16  <Field Map MAP>
	//  893 2564:ldc2            #326 <String "piv">
	//  894 2567:sipush          982
	//  895 2570:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  896 2573:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  897 2578:pop             
		MAP.put("bull", ((Object) (Character.valueOf('\u2022'))));
	//  898 2579:getstatic       #16  <Field Map MAP>
	//  899 2582:ldc2            #328 <String "bull">
	//  900 2585:sipush          8226
	//  901 2588:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  902 2591:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  903 2596:pop             
		MAP.put("hellip", ((Object) (Character.valueOf('\u2026'))));
	//  904 2597:getstatic       #16  <Field Map MAP>
	//  905 2600:ldc2            #330 <String "hellip">
	//  906 2603:sipush          8230
	//  907 2606:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  908 2609:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  909 2614:pop             
		MAP.put("prime", ((Object) (Character.valueOf('\u2032'))));
	//  910 2615:getstatic       #16  <Field Map MAP>
	//  911 2618:ldc2            #332 <String "prime">
	//  912 2621:sipush          8242
	//  913 2624:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  914 2627:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  915 2632:pop             
		MAP.put("Prime", ((Object) (Character.valueOf('\u2033'))));
	//  916 2633:getstatic       #16  <Field Map MAP>
	//  917 2636:ldc2            #334 <String "Prime">
	//  918 2639:sipush          8243
	//  919 2642:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  920 2645:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  921 2650:pop             
		MAP.put("oline", ((Object) (Character.valueOf('\u203E'))));
	//  922 2651:getstatic       #16  <Field Map MAP>
	//  923 2654:ldc2            #336 <String "oline">
	//  924 2657:sipush          8254
	//  925 2660:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  926 2663:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  927 2668:pop             
		MAP.put("frasl", ((Object) (Character.valueOf('\u2044'))));
	//  928 2669:getstatic       #16  <Field Map MAP>
	//  929 2672:ldc2            #338 <String "frasl">
	//  930 2675:sipush          8260
	//  931 2678:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  932 2681:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  933 2686:pop             
		MAP.put("weierp", ((Object) (Character.valueOf('\u2118'))));
	//  934 2687:getstatic       #16  <Field Map MAP>
	//  935 2690:ldc2            #340 <String "weierp">
	//  936 2693:sipush          8472
	//  937 2696:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  938 2699:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  939 2704:pop             
		MAP.put("image", ((Object) (Character.valueOf('\u2111'))));
	//  940 2705:getstatic       #16  <Field Map MAP>
	//  941 2708:ldc2            #342 <String "image">
	//  942 2711:sipush          8465
	//  943 2714:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  944 2717:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  945 2722:pop             
		MAP.put("real", ((Object) (Character.valueOf('\u211C'))));
	//  946 2723:getstatic       #16  <Field Map MAP>
	//  947 2726:ldc2            #344 <String "real">
	//  948 2729:sipush          8476
	//  949 2732:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  950 2735:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  951 2740:pop             
		MAP.put("trade", ((Object) (Character.valueOf('\u2122'))));
	//  952 2741:getstatic       #16  <Field Map MAP>
	//  953 2744:ldc2            #346 <String "trade">
	//  954 2747:sipush          8482
	//  955 2750:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  956 2753:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  957 2758:pop             
		MAP.put("alefsym", ((Object) (Character.valueOf('\u2135'))));
	//  958 2759:getstatic       #16  <Field Map MAP>
	//  959 2762:ldc2            #348 <String "alefsym">
	//  960 2765:sipush          8501
	//  961 2768:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  962 2771:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  963 2776:pop             
		MAP.put("larr", ((Object) (Character.valueOf('\u2190'))));
	//  964 2777:getstatic       #16  <Field Map MAP>
	//  965 2780:ldc2            #350 <String "larr">
	//  966 2783:sipush          8592
	//  967 2786:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  968 2789:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  969 2794:pop             
		MAP.put("uarr", ((Object) (Character.valueOf('\u2191'))));
	//  970 2795:getstatic       #16  <Field Map MAP>
	//  971 2798:ldc2            #352 <String "uarr">
	//  972 2801:sipush          8593
	//  973 2804:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  974 2807:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  975 2812:pop             
		MAP.put("rarr", ((Object) (Character.valueOf('\u2192'))));
	//  976 2813:getstatic       #16  <Field Map MAP>
	//  977 2816:ldc2            #354 <String "rarr">
	//  978 2819:sipush          8594
	//  979 2822:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  980 2825:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  981 2830:pop             
		MAP.put("darr", ((Object) (Character.valueOf('\u2193'))));
	//  982 2831:getstatic       #16  <Field Map MAP>
	//  983 2834:ldc2            #356 <String "darr">
	//  984 2837:sipush          8595
	//  985 2840:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  986 2843:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  987 2848:pop             
		MAP.put("harr", ((Object) (Character.valueOf('\u2194'))));
	//  988 2849:getstatic       #16  <Field Map MAP>
	//  989 2852:ldc2            #358 <String "harr">
	//  990 2855:sipush          8596
	//  991 2858:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  992 2861:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  993 2866:pop             
		MAP.put("crarr", ((Object) (Character.valueOf('\u21B5'))));
	//  994 2867:getstatic       #16  <Field Map MAP>
	//  995 2870:ldc2            #360 <String "crarr">
	//  996 2873:sipush          8629
	//  997 2876:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  998 2879:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  999 2884:pop             
		MAP.put("lArr", ((Object) (Character.valueOf('\u21D0'))));
	// 1000 2885:getstatic       #16  <Field Map MAP>
	// 1001 2888:ldc2            #362 <String "lArr">
	// 1002 2891:sipush          8656
	// 1003 2894:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1004 2897:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1005 2902:pop             
		MAP.put("uArr", ((Object) (Character.valueOf('\u21D1'))));
	// 1006 2903:getstatic       #16  <Field Map MAP>
	// 1007 2906:ldc2            #364 <String "uArr">
	// 1008 2909:sipush          8657
	// 1009 2912:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1010 2915:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1011 2920:pop             
		MAP.put("rArr", ((Object) (Character.valueOf('\u21D2'))));
	// 1012 2921:getstatic       #16  <Field Map MAP>
	// 1013 2924:ldc2            #366 <String "rArr">
	// 1014 2927:sipush          8658
	// 1015 2930:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1016 2933:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1017 2938:pop             
		MAP.put("dArr", ((Object) (Character.valueOf('\u21D3'))));
	// 1018 2939:getstatic       #16  <Field Map MAP>
	// 1019 2942:ldc2            #368 <String "dArr">
	// 1020 2945:sipush          8659
	// 1021 2948:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1022 2951:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1023 2956:pop             
		MAP.put("hArr", ((Object) (Character.valueOf('\u21D4'))));
	// 1024 2957:getstatic       #16  <Field Map MAP>
	// 1025 2960:ldc2            #370 <String "hArr">
	// 1026 2963:sipush          8660
	// 1027 2966:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1028 2969:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1029 2974:pop             
		MAP.put("forall", ((Object) (Character.valueOf('\u2200'))));
	// 1030 2975:getstatic       #16  <Field Map MAP>
	// 1031 2978:ldc2            #372 <String "forall">
	// 1032 2981:sipush          8704
	// 1033 2984:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1034 2987:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1035 2992:pop             
		MAP.put("part", ((Object) (Character.valueOf('\u2202'))));
	// 1036 2993:getstatic       #16  <Field Map MAP>
	// 1037 2996:ldc2            #374 <String "part">
	// 1038 2999:sipush          8706
	// 1039 3002:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1040 3005:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1041 3010:pop             
		MAP.put("exist", ((Object) (Character.valueOf('\u2203'))));
	// 1042 3011:getstatic       #16  <Field Map MAP>
	// 1043 3014:ldc2            #376 <String "exist">
	// 1044 3017:sipush          8707
	// 1045 3020:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1046 3023:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1047 3028:pop             
		MAP.put("empty", ((Object) (Character.valueOf('\u2205'))));
	// 1048 3029:getstatic       #16  <Field Map MAP>
	// 1049 3032:ldc2            #378 <String "empty">
	// 1050 3035:sipush          8709
	// 1051 3038:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1052 3041:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1053 3046:pop             
		MAP.put("nabla", ((Object) (Character.valueOf('\u2207'))));
	// 1054 3047:getstatic       #16  <Field Map MAP>
	// 1055 3050:ldc2            #380 <String "nabla">
	// 1056 3053:sipush          8711
	// 1057 3056:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1058 3059:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1059 3064:pop             
		MAP.put("isin", ((Object) (Character.valueOf('\u2208'))));
	// 1060 3065:getstatic       #16  <Field Map MAP>
	// 1061 3068:ldc2            #382 <String "isin">
	// 1062 3071:sipush          8712
	// 1063 3074:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1064 3077:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1065 3082:pop             
		MAP.put("notin", ((Object) (Character.valueOf('\u2209'))));
	// 1066 3083:getstatic       #16  <Field Map MAP>
	// 1067 3086:ldc2            #384 <String "notin">
	// 1068 3089:sipush          8713
	// 1069 3092:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1070 3095:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1071 3100:pop             
		MAP.put("ni", ((Object) (Character.valueOf('\u220B'))));
	// 1072 3101:getstatic       #16  <Field Map MAP>
	// 1073 3104:ldc2            #386 <String "ni">
	// 1074 3107:sipush          8715
	// 1075 3110:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1076 3113:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1077 3118:pop             
		MAP.put("prod", ((Object) (Character.valueOf('\u220F'))));
	// 1078 3119:getstatic       #16  <Field Map MAP>
	// 1079 3122:ldc2            #388 <String "prod">
	// 1080 3125:sipush          8719
	// 1081 3128:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1082 3131:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1083 3136:pop             
		MAP.put("sum", ((Object) (Character.valueOf('\u2211'))));
	// 1084 3137:getstatic       #16  <Field Map MAP>
	// 1085 3140:ldc2            #390 <String "sum">
	// 1086 3143:sipush          8721
	// 1087 3146:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1088 3149:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1089 3154:pop             
		MAP.put("minus", ((Object) (Character.valueOf('\u2212'))));
	// 1090 3155:getstatic       #16  <Field Map MAP>
	// 1091 3158:ldc2            #392 <String "minus">
	// 1092 3161:sipush          8722
	// 1093 3164:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1094 3167:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1095 3172:pop             
		MAP.put("lowast", ((Object) (Character.valueOf('\u2217'))));
	// 1096 3173:getstatic       #16  <Field Map MAP>
	// 1097 3176:ldc2            #394 <String "lowast">
	// 1098 3179:sipush          8727
	// 1099 3182:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1100 3185:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1101 3190:pop             
		MAP.put("radic", ((Object) (Character.valueOf('\u221A'))));
	// 1102 3191:getstatic       #16  <Field Map MAP>
	// 1103 3194:ldc2            #396 <String "radic">
	// 1104 3197:sipush          8730
	// 1105 3200:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1106 3203:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1107 3208:pop             
		MAP.put("prop", ((Object) (Character.valueOf('\u221D'))));
	// 1108 3209:getstatic       #16  <Field Map MAP>
	// 1109 3212:ldc2            #398 <String "prop">
	// 1110 3215:sipush          8733
	// 1111 3218:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1112 3221:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1113 3226:pop             
		MAP.put("infin", ((Object) (Character.valueOf('\u221E'))));
	// 1114 3227:getstatic       #16  <Field Map MAP>
	// 1115 3230:ldc2            #400 <String "infin">
	// 1116 3233:sipush          8734
	// 1117 3236:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1118 3239:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1119 3244:pop             
		MAP.put("ang", ((Object) (Character.valueOf('\u2220'))));
	// 1120 3245:getstatic       #16  <Field Map MAP>
	// 1121 3248:ldc2            #402 <String "ang">
	// 1122 3251:sipush          8736
	// 1123 3254:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1124 3257:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1125 3262:pop             
		MAP.put("and", ((Object) (Character.valueOf('\u2227'))));
	// 1126 3263:getstatic       #16  <Field Map MAP>
	// 1127 3266:ldc2            #404 <String "and">
	// 1128 3269:sipush          8743
	// 1129 3272:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1130 3275:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1131 3280:pop             
		MAP.put("or", ((Object) (Character.valueOf('\u2228'))));
	// 1132 3281:getstatic       #16  <Field Map MAP>
	// 1133 3284:ldc2            #406 <String "or">
	// 1134 3287:sipush          8744
	// 1135 3290:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1136 3293:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1137 3298:pop             
		MAP.put("cap", ((Object) (Character.valueOf('\u2229'))));
	// 1138 3299:getstatic       #16  <Field Map MAP>
	// 1139 3302:ldc2            #408 <String "cap">
	// 1140 3305:sipush          8745
	// 1141 3308:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1142 3311:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1143 3316:pop             
		MAP.put("cup", ((Object) (Character.valueOf('\u222A'))));
	// 1144 3317:getstatic       #16  <Field Map MAP>
	// 1145 3320:ldc2            #410 <String "cup">
	// 1146 3323:sipush          8746
	// 1147 3326:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1148 3329:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1149 3334:pop             
		MAP.put("int", ((Object) (Character.valueOf('\u222B'))));
	// 1150 3335:getstatic       #16  <Field Map MAP>
	// 1151 3338:ldc2            #412 <String "int">
	// 1152 3341:sipush          8747
	// 1153 3344:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1154 3347:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1155 3352:pop             
		MAP.put("there4", ((Object) (Character.valueOf('\u2234'))));
	// 1156 3353:getstatic       #16  <Field Map MAP>
	// 1157 3356:ldc2            #414 <String "there4">
	// 1158 3359:sipush          8756
	// 1159 3362:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1160 3365:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1161 3370:pop             
		MAP.put("sim", ((Object) (Character.valueOf('\u223C'))));
	// 1162 3371:getstatic       #16  <Field Map MAP>
	// 1163 3374:ldc2            #416 <String "sim">
	// 1164 3377:sipush          8764
	// 1165 3380:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1166 3383:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1167 3388:pop             
		MAP.put("cong", ((Object) (Character.valueOf('\u2245'))));
	// 1168 3389:getstatic       #16  <Field Map MAP>
	// 1169 3392:ldc2            #418 <String "cong">
	// 1170 3395:sipush          8773
	// 1171 3398:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1172 3401:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1173 3406:pop             
		MAP.put("asymp", ((Object) (Character.valueOf('\u2248'))));
	// 1174 3407:getstatic       #16  <Field Map MAP>
	// 1175 3410:ldc2            #420 <String "asymp">
	// 1176 3413:sipush          8776
	// 1177 3416:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1178 3419:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1179 3424:pop             
		MAP.put("ne", ((Object) (Character.valueOf('\u2260'))));
	// 1180 3425:getstatic       #16  <Field Map MAP>
	// 1181 3428:ldc2            #422 <String "ne">
	// 1182 3431:sipush          8800
	// 1183 3434:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1184 3437:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1185 3442:pop             
		MAP.put("equiv", ((Object) (Character.valueOf('\u2261'))));
	// 1186 3443:getstatic       #16  <Field Map MAP>
	// 1187 3446:ldc2            #424 <String "equiv">
	// 1188 3449:sipush          8801
	// 1189 3452:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1190 3455:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1191 3460:pop             
		MAP.put("le", ((Object) (Character.valueOf('\u2264'))));
	// 1192 3461:getstatic       #16  <Field Map MAP>
	// 1193 3464:ldc2            #426 <String "le">
	// 1194 3467:sipush          8804
	// 1195 3470:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1196 3473:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1197 3478:pop             
		MAP.put("ge", ((Object) (Character.valueOf('\u2265'))));
	// 1198 3479:getstatic       #16  <Field Map MAP>
	// 1199 3482:ldc2            #428 <String "ge">
	// 1200 3485:sipush          8805
	// 1201 3488:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1202 3491:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1203 3496:pop             
		MAP.put("sub", ((Object) (Character.valueOf('\u2282'))));
	// 1204 3497:getstatic       #16  <Field Map MAP>
	// 1205 3500:ldc2            #430 <String "sub">
	// 1206 3503:sipush          8834
	// 1207 3506:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1208 3509:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1209 3514:pop             
		MAP.put("sup", ((Object) (Character.valueOf('\u2283'))));
	// 1210 3515:getstatic       #16  <Field Map MAP>
	// 1211 3518:ldc2            #432 <String "sup">
	// 1212 3521:sipush          8835
	// 1213 3524:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1214 3527:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1215 3532:pop             
		MAP.put("nsub", ((Object) (Character.valueOf('\u2284'))));
	// 1216 3533:getstatic       #16  <Field Map MAP>
	// 1217 3536:ldc2            #434 <String "nsub">
	// 1218 3539:sipush          8836
	// 1219 3542:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1220 3545:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1221 3550:pop             
		MAP.put("sube", ((Object) (Character.valueOf('\u2286'))));
	// 1222 3551:getstatic       #16  <Field Map MAP>
	// 1223 3554:ldc2            #436 <String "sube">
	// 1224 3557:sipush          8838
	// 1225 3560:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1226 3563:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1227 3568:pop             
		MAP.put("supe", ((Object) (Character.valueOf('\u2287'))));
	// 1228 3569:getstatic       #16  <Field Map MAP>
	// 1229 3572:ldc2            #438 <String "supe">
	// 1230 3575:sipush          8839
	// 1231 3578:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1232 3581:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1233 3586:pop             
		MAP.put("oplus", ((Object) (Character.valueOf('\u2295'))));
	// 1234 3587:getstatic       #16  <Field Map MAP>
	// 1235 3590:ldc2            #440 <String "oplus">
	// 1236 3593:sipush          8853
	// 1237 3596:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1238 3599:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1239 3604:pop             
		MAP.put("otimes", ((Object) (Character.valueOf('\u2297'))));
	// 1240 3605:getstatic       #16  <Field Map MAP>
	// 1241 3608:ldc2            #442 <String "otimes">
	// 1242 3611:sipush          8855
	// 1243 3614:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1244 3617:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1245 3622:pop             
		MAP.put("perp", ((Object) (Character.valueOf('\u22A5'))));
	// 1246 3623:getstatic       #16  <Field Map MAP>
	// 1247 3626:ldc2            #444 <String "perp">
	// 1248 3629:sipush          8869
	// 1249 3632:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1250 3635:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1251 3640:pop             
		MAP.put("sdot", ((Object) (Character.valueOf('\u22C5'))));
	// 1252 3641:getstatic       #16  <Field Map MAP>
	// 1253 3644:ldc2            #446 <String "sdot">
	// 1254 3647:sipush          8901
	// 1255 3650:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1256 3653:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1257 3658:pop             
		MAP.put("lceil", ((Object) (Character.valueOf('\u2308'))));
	// 1258 3659:getstatic       #16  <Field Map MAP>
	// 1259 3662:ldc2            #448 <String "lceil">
	// 1260 3665:sipush          8968
	// 1261 3668:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1262 3671:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1263 3676:pop             
		MAP.put("rceil", ((Object) (Character.valueOf('\u2309'))));
	// 1264 3677:getstatic       #16  <Field Map MAP>
	// 1265 3680:ldc2            #450 <String "rceil">
	// 1266 3683:sipush          8969
	// 1267 3686:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1268 3689:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1269 3694:pop             
		MAP.put("lfloor", ((Object) (Character.valueOf('\u230A'))));
	// 1270 3695:getstatic       #16  <Field Map MAP>
	// 1271 3698:ldc2            #452 <String "lfloor">
	// 1272 3701:sipush          8970
	// 1273 3704:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1274 3707:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1275 3712:pop             
		MAP.put("rfloor", ((Object) (Character.valueOf('\u230B'))));
	// 1276 3713:getstatic       #16  <Field Map MAP>
	// 1277 3716:ldc2            #454 <String "rfloor">
	// 1278 3719:sipush          8971
	// 1279 3722:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1280 3725:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1281 3730:pop             
		MAP.put("lang", ((Object) (Character.valueOf('\u2329'))));
	// 1282 3731:getstatic       #16  <Field Map MAP>
	// 1283 3734:ldc2            #456 <String "lang">
	// 1284 3737:sipush          9001
	// 1285 3740:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1286 3743:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1287 3748:pop             
		MAP.put("rang", ((Object) (Character.valueOf('\u232A'))));
	// 1288 3749:getstatic       #16  <Field Map MAP>
	// 1289 3752:ldc2            #458 <String "rang">
	// 1290 3755:sipush          9002
	// 1291 3758:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1292 3761:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1293 3766:pop             
		MAP.put("loz", ((Object) (Character.valueOf('\u25CA'))));
	// 1294 3767:getstatic       #16  <Field Map MAP>
	// 1295 3770:ldc2            #460 <String "loz">
	// 1296 3773:sipush          9674
	// 1297 3776:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1298 3779:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1299 3784:pop             
		MAP.put("spades", ((Object) (Character.valueOf('\u2660'))));
	// 1300 3785:getstatic       #16  <Field Map MAP>
	// 1301 3788:ldc2            #462 <String "spades">
	// 1302 3791:sipush          9824
	// 1303 3794:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1304 3797:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1305 3802:pop             
		MAP.put("clubs", ((Object) (Character.valueOf('\u2663'))));
	// 1306 3803:getstatic       #16  <Field Map MAP>
	// 1307 3806:ldc2            #464 <String "clubs">
	// 1308 3809:sipush          9827
	// 1309 3812:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1310 3815:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1311 3820:pop             
		MAP.put("hearts", ((Object) (Character.valueOf('\u2665'))));
	// 1312 3821:getstatic       #16  <Field Map MAP>
	// 1313 3824:ldc2            #466 <String "hearts">
	// 1314 3827:sipush          9829
	// 1315 3830:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1316 3833:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1317 3838:pop             
		MAP.put("diams", ((Object) (Character.valueOf('\u2666'))));
	// 1318 3839:getstatic       #16  <Field Map MAP>
	// 1319 3842:ldc2            #468 <String "diams">
	// 1320 3845:sipush          9830
	// 1321 3848:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1322 3851:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1323 3856:pop             
		MAP.put("quot", ((Object) (Character.valueOf('"'))));
	// 1324 3857:getstatic       #16  <Field Map MAP>
	// 1325 3860:ldc2            #470 <String "quot">
	// 1326 3863:bipush          34
	// 1327 3865:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1328 3868:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1329 3873:pop             
		MAP.put("amp", ((Object) (Character.valueOf('&'))));
	// 1330 3874:getstatic       #16  <Field Map MAP>
	// 1331 3877:ldc2            #472 <String "amp">
	// 1332 3880:bipush          38
	// 1333 3882:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1334 3885:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1335 3890:pop             
		MAP.put("apos", ((Object) (Character.valueOf('\''))));
	// 1336 3891:getstatic       #16  <Field Map MAP>
	// 1337 3894:ldc2            #474 <String "apos">
	// 1338 3897:bipush          39
	// 1339 3899:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1340 3902:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1341 3907:pop             
		MAP.put("lt", ((Object) (Character.valueOf('<'))));
	// 1342 3908:getstatic       #16  <Field Map MAP>
	// 1343 3911:ldc2            #476 <String "lt">
	// 1344 3914:bipush          60
	// 1345 3916:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1346 3919:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1347 3924:pop             
		MAP.put("gt", ((Object) (Character.valueOf('>'))));
	// 1348 3925:getstatic       #16  <Field Map MAP>
	// 1349 3928:ldc2            #478 <String "gt">
	// 1350 3931:bipush          62
	// 1351 3933:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1352 3936:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1353 3941:pop             
		MAP.put("OElig", ((Object) (Character.valueOf('\u0152'))));
	// 1354 3942:getstatic       #16  <Field Map MAP>
	// 1355 3945:ldc2            #480 <String "OElig">
	// 1356 3948:sipush          338
	// 1357 3951:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1358 3954:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1359 3959:pop             
		MAP.put("oelig", ((Object) (Character.valueOf('\u0153'))));
	// 1360 3960:getstatic       #16  <Field Map MAP>
	// 1361 3963:ldc2            #482 <String "oelig">
	// 1362 3966:sipush          339
	// 1363 3969:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1364 3972:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1365 3977:pop             
		MAP.put("Scaron", ((Object) (Character.valueOf('\u0160'))));
	// 1366 3978:getstatic       #16  <Field Map MAP>
	// 1367 3981:ldc2            #484 <String "Scaron">
	// 1368 3984:sipush          352
	// 1369 3987:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1370 3990:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1371 3995:pop             
		MAP.put("scaron", ((Object) (Character.valueOf('\u0161'))));
	// 1372 3996:getstatic       #16  <Field Map MAP>
	// 1373 3999:ldc2            #486 <String "scaron">
	// 1374 4002:sipush          353
	// 1375 4005:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1376 4008:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1377 4013:pop             
		MAP.put("Yuml", ((Object) (Character.valueOf('\u0178'))));
	// 1378 4014:getstatic       #16  <Field Map MAP>
	// 1379 4017:ldc2            #488 <String "Yuml">
	// 1380 4020:sipush          376
	// 1381 4023:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1382 4026:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1383 4031:pop             
		MAP.put("circ", ((Object) (Character.valueOf('\u02C6'))));
	// 1384 4032:getstatic       #16  <Field Map MAP>
	// 1385 4035:ldc2            #490 <String "circ">
	// 1386 4038:sipush          710
	// 1387 4041:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1388 4044:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1389 4049:pop             
		MAP.put("tilde", ((Object) (Character.valueOf('\u02DC'))));
	// 1390 4050:getstatic       #16  <Field Map MAP>
	// 1391 4053:ldc2            #492 <String "tilde">
	// 1392 4056:sipush          732
	// 1393 4059:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1394 4062:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1395 4067:pop             
		MAP.put("ensp", ((Object) (Character.valueOf('\u2002'))));
	// 1396 4068:getstatic       #16  <Field Map MAP>
	// 1397 4071:ldc2            #494 <String "ensp">
	// 1398 4074:sipush          8194
	// 1399 4077:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1400 4080:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1401 4085:pop             
		MAP.put("emsp", ((Object) (Character.valueOf('\u2003'))));
	// 1402 4086:getstatic       #16  <Field Map MAP>
	// 1403 4089:ldc2            #496 <String "emsp">
	// 1404 4092:sipush          8195
	// 1405 4095:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1406 4098:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1407 4103:pop             
		MAP.put("thinsp", ((Object) (Character.valueOf('\u2009'))));
	// 1408 4104:getstatic       #16  <Field Map MAP>
	// 1409 4107:ldc2            #498 <String "thinsp">
	// 1410 4110:sipush          8201
	// 1411 4113:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1412 4116:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1413 4121:pop             
		MAP.put("zwnj", ((Object) (Character.valueOf('\u200C'))));
	// 1414 4122:getstatic       #16  <Field Map MAP>
	// 1415 4125:ldc2            #500 <String "zwnj">
	// 1416 4128:sipush          8204
	// 1417 4131:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1418 4134:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1419 4139:pop             
		MAP.put("zwj", ((Object) (Character.valueOf('\u200D'))));
	// 1420 4140:getstatic       #16  <Field Map MAP>
	// 1421 4143:ldc2            #502 <String "zwj">
	// 1422 4146:sipush          8205
	// 1423 4149:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1424 4152:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1425 4157:pop             
		MAP.put("lrm", ((Object) (Character.valueOf('\u200E'))));
	// 1426 4158:getstatic       #16  <Field Map MAP>
	// 1427 4161:ldc2            #504 <String "lrm">
	// 1428 4164:sipush          8206
	// 1429 4167:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1430 4170:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1431 4175:pop             
		MAP.put("rlm", ((Object) (Character.valueOf('\u200F'))));
	// 1432 4176:getstatic       #16  <Field Map MAP>
	// 1433 4179:ldc2            #506 <String "rlm">
	// 1434 4182:sipush          8207
	// 1435 4185:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1436 4188:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1437 4193:pop             
		MAP.put("ndash", ((Object) (Character.valueOf('\u2013'))));
	// 1438 4194:getstatic       #16  <Field Map MAP>
	// 1439 4197:ldc2            #508 <String "ndash">
	// 1440 4200:sipush          8211
	// 1441 4203:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1442 4206:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1443 4211:pop             
		MAP.put("mdash", ((Object) (Character.valueOf('\u2014'))));
	// 1444 4212:getstatic       #16  <Field Map MAP>
	// 1445 4215:ldc2            #510 <String "mdash">
	// 1446 4218:sipush          8212
	// 1447 4221:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1448 4224:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1449 4229:pop             
		MAP.put("lsquo", ((Object) (Character.valueOf('\u2018'))));
	// 1450 4230:getstatic       #16  <Field Map MAP>
	// 1451 4233:ldc2            #512 <String "lsquo">
	// 1452 4236:sipush          8216
	// 1453 4239:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1454 4242:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1455 4247:pop             
		MAP.put("rsquo", ((Object) (Character.valueOf('\u2019'))));
	// 1456 4248:getstatic       #16  <Field Map MAP>
	// 1457 4251:ldc2            #514 <String "rsquo">
	// 1458 4254:sipush          8217
	// 1459 4257:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1460 4260:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1461 4265:pop             
		MAP.put("sbquo", ((Object) (Character.valueOf('\u201A'))));
	// 1462 4266:getstatic       #16  <Field Map MAP>
	// 1463 4269:ldc2            #516 <String "sbquo">
	// 1464 4272:sipush          8218
	// 1465 4275:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1466 4278:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1467 4283:pop             
		MAP.put("ldquo", ((Object) (Character.valueOf('\u201C'))));
	// 1468 4284:getstatic       #16  <Field Map MAP>
	// 1469 4287:ldc2            #518 <String "ldquo">
	// 1470 4290:sipush          8220
	// 1471 4293:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1472 4296:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1473 4301:pop             
		MAP.put("rdquo", ((Object) (Character.valueOf('\u201D'))));
	// 1474 4302:getstatic       #16  <Field Map MAP>
	// 1475 4305:ldc2            #520 <String "rdquo">
	// 1476 4308:sipush          8221
	// 1477 4311:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1478 4314:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1479 4319:pop             
		MAP.put("bdquo", ((Object) (Character.valueOf('\u201E'))));
	// 1480 4320:getstatic       #16  <Field Map MAP>
	// 1481 4323:ldc2            #522 <String "bdquo">
	// 1482 4326:sipush          8222
	// 1483 4329:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1484 4332:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1485 4337:pop             
		MAP.put("dagger", ((Object) (Character.valueOf('\u2020'))));
	// 1486 4338:getstatic       #16  <Field Map MAP>
	// 1487 4341:ldc2            #524 <String "dagger">
	// 1488 4344:sipush          8224
	// 1489 4347:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1490 4350:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1491 4355:pop             
		MAP.put("Dagger", ((Object) (Character.valueOf('\u2021'))));
	// 1492 4356:getstatic       #16  <Field Map MAP>
	// 1493 4359:ldc2            #526 <String "Dagger">
	// 1494 4362:sipush          8225
	// 1495 4365:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1496 4368:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1497 4373:pop             
		MAP.put("permil", ((Object) (Character.valueOf('\u2030'))));
	// 1498 4374:getstatic       #16  <Field Map MAP>
	// 1499 4377:ldc2            #528 <String "permil">
	// 1500 4380:sipush          8240
	// 1501 4383:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1502 4386:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1503 4391:pop             
		MAP.put("lsaquo", ((Object) (Character.valueOf('\u2039'))));
	// 1504 4392:getstatic       #16  <Field Map MAP>
	// 1505 4395:ldc2            #530 <String "lsaquo">
	// 1506 4398:sipush          8249
	// 1507 4401:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1508 4404:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1509 4409:pop             
		MAP.put("rsaquo", ((Object) (Character.valueOf('\u203A'))));
	// 1510 4410:getstatic       #16  <Field Map MAP>
	// 1511 4413:ldc2            #532 <String "rsaquo">
	// 1512 4416:sipush          8250
	// 1513 4419:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1514 4422:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1515 4427:pop             
		MAP.put("euro", ((Object) (Character.valueOf('\u20AC'))));
	// 1516 4428:getstatic       #16  <Field Map MAP>
	// 1517 4431:ldc2            #534 <String "euro">
	// 1518 4434:sipush          8364
	// 1519 4437:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1520 4440:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1521 4445:pop             
	//*1522 4446:return          
	}
}
