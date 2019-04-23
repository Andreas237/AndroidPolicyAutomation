// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, aqq, atv, ask, 
//			arx, avg, avb

final class aty
{

	static String a(atv atv1, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #8   <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("# ");
	//    4    8:aload_2         
	//    5    9:ldc1            #14  <String "# ">
	//    6   11:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		a(atv1, stringbuilder, 0);
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokestatic    #21  <Method void a(atv, StringBuilder, int)>
		return stringbuilder.toString();
	//   16   27:aload_2         
	//   17   28:invokevirtual   #25  <Method String StringBuilder.toString()>
	//   18   31:areturn         
	}

	private static final String a(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #8   <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void StringBuilder()>
	//    3    7:astore_3        
		for(int i = 0; i < s.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #33  <Method int String.length()>
	//*   9   15:icmpge          54
		{
			char c = s.charAt(i);
	//   10   18:aload_0         
	//   11   19:iload_2         
	//   12   20:invokevirtual   #37  <Method char String.charAt(int)>
	//   13   23:istore_1        
			if(Character.isUpperCase(c))
	//*  14   24:iload_1         
	//*  15   25:invokestatic    #43  <Method boolean Character.isUpperCase(char)>
	//*  16   28:ifeq            38
				stringbuilder.append("_");
	//   17   31:aload_3         
	//   18   32:ldc1            #45  <String "_">
	//   19   34:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
			stringbuilder.append(Character.toLowerCase(c));
	//   21   38:aload_3         
	//   22   39:iload_1         
	//   23   40:invokestatic    #49  <Method char Character.toLowerCase(char)>
	//   24   43:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   25   46:pop             
		}

	//   26   47:iload_2         
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:istore_2        
	//*  30   51:goto            10
		return stringbuilder.toString();
	//   31   54:aload_3         
	//   32   55:invokevirtual   #25  <Method String StringBuilder.toString()>
	//   33   58:areturn         
	}

	private static void a(atv atv1, StringBuilder stringbuilder, int i)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #54  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void HashMap()>
	//    3    7:astore          8
		HashMap hashmap1 = new HashMap();
	//    4    9:new             #54  <Class HashMap>
	//    5   12:dup             
	//    6   13:invokespecial   #55  <Method void HashMap()>
	//    7   16:astore          9
		TreeSet treeset = new TreeSet();
	//    8   18:new             #57  <Class TreeSet>
	//    9   21:dup             
	//   10   22:invokespecial   #58  <Method void TreeSet()>
	//   11   25:astore          6
		Method amethod[] = ((Object) (atv1)).getClass().getDeclaredMethods();
	//   12   27:aload_0         
	//   13   28:invokevirtual   #62  <Method Class Object.getClass()>
	//   14   31:invokevirtual   #68  <Method Method[] Class.getDeclaredMethods()>
	//   15   34:astore          7
		int k = amethod.length;
	//   16   36:aload           7
	//   17   38:arraylength     
	//   18   39:istore          4
		for(int j = 0; j < k; j++)
	//*  19   41:iconst_0        
	//*  20   42:istore_3        
	//*  21   43:iload_3         
	//*  22   44:iload           4
	//*  23   46:icmpge          127
		{
			Method method = amethod[j];
	//   24   49:aload           7
	//   25   51:iload_3         
	//   26   52:aaload          
	//   27   53:astore          10
			((Map) (hashmap1)).put(((Object) (method.getName())), ((Object) (method)));
	//   28   55:aload           9
	//   29   57:aload           10
	//   30   59:invokevirtual   #73  <Method String Method.getName()>
	//   31   62:aload           10
	//   32   64:invokeinterface #79  <Method Object Map.put(Object, Object)>
	//   33   69:pop             
			if(method.getParameterTypes().length != 0)
				continue;
	//   34   70:aload           10
	//   35   72:invokevirtual   #83  <Method Class[] Method.getParameterTypes()>
	//   36   75:arraylength     
	//   37   76:ifne            120
			((Map) (hashmap)).put(((Object) (method.getName())), ((Object) (method)));
	//   38   79:aload           8
	//   39   81:aload           10
	//   40   83:invokevirtual   #73  <Method String Method.getName()>
	//   41   86:aload           10
	//   42   88:invokeinterface #79  <Method Object Map.put(Object, Object)>
	//   43   93:pop             
			if(method.getName().startsWith("get"))
	//*  44   94:aload           10
	//*  45   96:invokevirtual   #73  <Method String Method.getName()>
	//*  46   99:ldc1            #85  <String "get">
	//*  47  101:invokevirtual   #89  <Method boolean String.startsWith(String)>
	//*  48  104:ifeq            120
				((Set) (treeset)).add(((Object) (method.getName())));
	//   49  107:aload           6
	//   50  109:aload           10
	//   51  111:invokevirtual   #73  <Method String Method.getName()>
	//   52  114:invokeinterface #95  <Method boolean Set.add(Object)>
	//   53  119:pop             
		}

	//   54  120:iload_3         
	//   55  121:iconst_1        
	//   56  122:iadd            
	//   57  123:istore_3        
	//*  58  124:goto            43
		Iterator iterator1 = ((Set) (treeset)).iterator();
	//   59  127:aload           6
	//   60  129:invokeinterface #99  <Method Iterator Set.iterator()>
	//   61  134:astore          10
		do
		{
			if(!iterator1.hasNext())
				break;
	//   62  136:aload           10
	//   63  138:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   64  143:ifeq            1078
			Object obj = ((Object) ((String)iterator1.next()));
	//   65  146:aload           10
	//   66  148:invokeinterface #109 <Method Object Iterator.next()>
	//   67  153:checkcast       #29  <Class String>
	//   68  156:astore          7
			String s3 = ((String) (obj)).replaceFirst("get", "");
	//   69  158:aload           7
	//   70  160:ldc1            #85  <String "get">
	//   71  162:ldc1            #111 <String "">
	//   72  164:invokevirtual   #115 <Method String String.replaceFirst(String, String)>
	//   73  167:astore          11
			if(s3.endsWith("List") && !s3.endsWith("OrBuilderList") && !s3.equals("List"))
	//*  74  169:aload           11
	//*  75  171:ldc1            #117 <String "List">
	//*  76  173:invokevirtual   #120 <Method boolean String.endsWith(String)>
	//*  77  176:ifeq            318
	//*  78  179:aload           11
	//*  79  181:ldc1            #122 <String "OrBuilderList">
	//*  80  183:invokevirtual   #120 <Method boolean String.endsWith(String)>
	//*  81  186:ifne            318
	//*  82  189:aload           11
	//*  83  191:ldc1            #117 <String "List">
	//*  84  193:invokevirtual   #125 <Method boolean String.equals(Object)>
	//*  85  196:ifne            318
			{
				String s = String.valueOf(((Object) (s3.substring(0, 1).toLowerCase())));
	//   86  199:aload           11
	//   87  201:iconst_0        
	//   88  202:iconst_1        
	//   89  203:invokevirtual   #129 <Method String String.substring(int, int)>
	//   90  206:invokevirtual   #131 <Method String String.toLowerCase()>
	//   91  209:invokestatic    #135 <Method String String.valueOf(Object)>
	//   92  212:astore          6
				Object obj2 = ((Object) (String.valueOf(((Object) (s3.substring(1, s3.length() - 4))))));
	//   93  214:aload           11
	//   94  216:iconst_1        
	//   95  217:aload           11
	//   96  219:invokevirtual   #33  <Method int String.length()>
	//   97  222:iconst_4        
	//   98  223:isub            
	//   99  224:invokevirtual   #129 <Method String String.substring(int, int)>
	//  100  227:invokestatic    #135 <Method String String.valueOf(Object)>
	//  101  230:astore          12
				if(((String) (obj2)).length() != 0)
	//* 102  232:aload           12
	//* 103  234:invokevirtual   #33  <Method int String.length()>
	//* 104  237:ifeq            252
					s = s.concat(((String) (obj2)));
	//  105  240:aload           6
	//  106  242:aload           12
	//  107  244:invokevirtual   #138 <Method String String.concat(String)>
	//  108  247:astore          6
				else
	//* 109  249:goto            263
					s = new String(s);
	//  110  252:new             #29  <Class String>
	//  111  255:dup             
	//  112  256:aload           6
	//  113  258:invokespecial   #141 <Method void String(String)>
	//  114  261:astore          6
				obj2 = ((Object) ((Method)((Map) (hashmap)).get(obj)));
	//  115  263:aload           8
	//  116  265:aload           7
	//  117  267:invokeinterface #144 <Method Object Map.get(Object)>
	//  118  272:checkcast       #70  <Class Method>
	//  119  275:astore          12
				if(obj2 != null && ((Object) (((Method) (obj2)).getReturnType())).equals(java/util/List))
	//* 120  277:aload           12
	//* 121  279:ifnull          318
	//* 122  282:aload           12
	//* 123  284:invokevirtual   #147 <Method Class Method.getReturnType()>
	//* 124  287:ldc1            #149 <Class List>
	//* 125  289:invokevirtual   #150 <Method boolean Object.equals(Object)>
	//* 126  292:ifeq            318
				{
					a(stringbuilder, i, a(s), ash.a(((Method) (obj2)), ((Object) (atv1)), new Object[0]));
	//  127  295:aload_1         
	//  128  296:iload_2         
	//  129  297:aload           6
	//  130  299:invokestatic    #152 <Method String a(String)>
	//  131  302:aload           12
	//  132  304:aload_0         
	//  133  305:iconst_0        
	//  134  306:anewarray       Object[]
	//  135  309:invokestatic    #157 <Method Object ash.a(Method, Object, Object[])>
	//  136  312:invokestatic    #160 <Method void a(StringBuilder, int, String, Object)>
					continue;
	//  137  315:goto            136
				}
			}
			if(s3.endsWith("Map") && !s3.equals("Map"))
	//* 138  318:aload           11
	//* 139  320:ldc1            #162 <String "Map">
	//* 140  322:invokevirtual   #120 <Method boolean String.endsWith(String)>
	//* 141  325:ifeq            478
	//* 142  328:aload           11
	//* 143  330:ldc1            #162 <String "Map">
	//* 144  332:invokevirtual   #125 <Method boolean String.equals(Object)>
	//* 145  335:ifne            478
			{
				String s1 = String.valueOf(((Object) (s3.substring(0, 1).toLowerCase())));
	//  146  338:aload           11
	//  147  340:iconst_0        
	//  148  341:iconst_1        
	//  149  342:invokevirtual   #129 <Method String String.substring(int, int)>
	//  150  345:invokevirtual   #131 <Method String String.toLowerCase()>
	//  151  348:invokestatic    #135 <Method String String.valueOf(Object)>
	//  152  351:astore          6
				String s4 = String.valueOf(((Object) (s3.substring(1, s3.length() - 3))));
	//  153  353:aload           11
	//  154  355:iconst_1        
	//  155  356:aload           11
	//  156  358:invokevirtual   #33  <Method int String.length()>
	//  157  361:iconst_3        
	//  158  362:isub            
	//  159  363:invokevirtual   #129 <Method String String.substring(int, int)>
	//  160  366:invokestatic    #135 <Method String String.valueOf(Object)>
	//  161  369:astore          12
				if(s4.length() != 0)
	//* 162  371:aload           12
	//* 163  373:invokevirtual   #33  <Method int String.length()>
	//* 164  376:ifeq            391
					s1 = s1.concat(s4);
	//  165  379:aload           6
	//  166  381:aload           12
	//  167  383:invokevirtual   #138 <Method String String.concat(String)>
	//  168  386:astore          6
				else
	//* 169  388:goto            402
					s1 = new String(s1);
	//  170  391:new             #29  <Class String>
	//  171  394:dup             
	//  172  395:aload           6
	//  173  397:invokespecial   #141 <Method void String(String)>
	//  174  400:astore          6
				obj = ((Object) ((Method)((Map) (hashmap)).get(obj)));
	//  175  402:aload           8
	//  176  404:aload           7
	//  177  406:invokeinterface #144 <Method Object Map.get(Object)>
	//  178  411:checkcast       #70  <Class Method>
	//  179  414:astore          7
				if(obj != null && ((Object) (((Method) (obj)).getReturnType())).equals(java/util/Map) && !((Method) (obj)).isAnnotationPresent(java/lang/Deprecated) && Modifier.isPublic(((Method) (obj)).getModifiers()))
	//* 180  416:aload           7
	//* 181  418:ifnull          478
	//* 182  421:aload           7
	//* 183  423:invokevirtual   #147 <Method Class Method.getReturnType()>
	//* 184  426:ldc1            #75  <Class Map>
	//* 185  428:invokevirtual   #150 <Method boolean Object.equals(Object)>
	//* 186  431:ifeq            478
	//* 187  434:aload           7
	//* 188  436:ldc1            #164 <Class Deprecated>
	//* 189  438:invokevirtual   #168 <Method boolean Method.isAnnotationPresent(Class)>
	//* 190  441:ifne            478
	//* 191  444:aload           7
	//* 192  446:invokevirtual   #171 <Method int Method.getModifiers()>
	//* 193  449:invokestatic    #177 <Method boolean Modifier.isPublic(int)>
	//* 194  452:ifeq            478
				{
					a(stringbuilder, i, a(s1), ash.a(((Method) (obj)), ((Object) (atv1)), new Object[0]));
	//  195  455:aload_1         
	//  196  456:iload_2         
	//  197  457:aload           6
	//  198  459:invokestatic    #152 <Method String a(String)>
	//  199  462:aload           7
	//  200  464:aload_0         
	//  201  465:iconst_0        
	//  202  466:anewarray       Object[]
	//  203  469:invokestatic    #157 <Method Object ash.a(Method, Object, Object[])>
	//  204  472:invokestatic    #160 <Method void a(StringBuilder, int, String, Object)>
					continue;
	//  205  475:goto            136
				}
			}
			String s2 = String.valueOf(((Object) (s3)));
	//  206  478:aload           11
	//  207  480:invokestatic    #135 <Method String String.valueOf(Object)>
	//  208  483:astore          6
			if(s2.length() != 0)
	//* 209  485:aload           6
	//* 210  487:invokevirtual   #33  <Method int String.length()>
	//* 211  490:ifeq            505
				s2 = "set".concat(s2);
	//  212  493:ldc1            #179 <String "set">
	//  213  495:aload           6
	//  214  497:invokevirtual   #138 <Method String String.concat(String)>
	//  215  500:astore          6
			else
	//* 216  502:goto            516
				s2 = new String("set");
	//  217  505:new             #29  <Class String>
	//  218  508:dup             
	//  219  509:ldc1            #179 <String "set">
	//  220  511:invokespecial   #141 <Method void String(String)>
	//  221  514:astore          6
			if((Method)((Map) (hashmap1)).get(((Object) (s2))) == null)
				continue;
	//  222  516:aload           9
	//  223  518:aload           6
	//  224  520:invokeinterface #144 <Method Object Map.get(Object)>
	//  225  525:checkcast       #70  <Class Method>
	//  226  528:ifnull          136
			if(s3.endsWith("Bytes"))
	//* 227  531:aload           11
	//* 228  533:ldc1            #181 <String "Bytes">
	//* 229  535:invokevirtual   #120 <Method boolean String.endsWith(String)>
	//* 230  538:ifeq            602
			{
				s2 = String.valueOf(((Object) (s3.substring(0, s3.length() - 5))));
	//  231  541:aload           11
	//  232  543:iconst_0        
	//  233  544:aload           11
	//  234  546:invokevirtual   #33  <Method int String.length()>
	//  235  549:iconst_5        
	//  236  550:isub            
	//  237  551:invokevirtual   #129 <Method String String.substring(int, int)>
	//  238  554:invokestatic    #135 <Method String String.valueOf(Object)>
	//  239  557:astore          6
				if(s2.length() != 0)
	//* 240  559:aload           6
	//* 241  561:invokevirtual   #33  <Method int String.length()>
	//* 242  564:ifeq            579
					s2 = "get".concat(s2);
	//  243  567:ldc1            #85  <String "get">
	//  244  569:aload           6
	//  245  571:invokevirtual   #138 <Method String String.concat(String)>
	//  246  574:astore          6
				else
	//* 247  576:goto            590
					s2 = new String("get");
	//  248  579:new             #29  <Class String>
	//  249  582:dup             
	//  250  583:ldc1            #85  <String "get">
	//  251  585:invokespecial   #141 <Method void String(String)>
	//  252  588:astore          6
				if(((Map) (hashmap)).containsKey(((Object) (s2))))
					continue;
	//  253  590:aload           8
	//  254  592:aload           6
	//  255  594:invokeinterface #184 <Method boolean Map.containsKey(Object)>
	//  256  599:ifne            136
			}
			s2 = String.valueOf(((Object) (s3.substring(0, 1).toLowerCase())));
	//  257  602:aload           11
	//  258  604:iconst_0        
	//  259  605:iconst_1        
	//  260  606:invokevirtual   #129 <Method String String.substring(int, int)>
	//  261  609:invokevirtual   #131 <Method String String.toLowerCase()>
	//  262  612:invokestatic    #135 <Method String String.valueOf(Object)>
	//  263  615:astore          6
			obj = ((Object) (String.valueOf(((Object) (s3.substring(1))))));
	//  264  617:aload           11
	//  265  619:iconst_1        
	//  266  620:invokevirtual   #187 <Method String String.substring(int)>
	//  267  623:invokestatic    #135 <Method String String.valueOf(Object)>
	//  268  626:astore          7
			if(((String) (obj)).length() != 0)
	//* 269  628:aload           7
	//* 270  630:invokevirtual   #33  <Method int String.length()>
	//* 271  633:ifeq            648
				s2 = s2.concat(((String) (obj)));
	//  272  636:aload           6
	//  273  638:aload           7
	//  274  640:invokevirtual   #138 <Method String String.concat(String)>
	//  275  643:astore          6
			else
	//* 276  645:goto            659
				s2 = new String(s2);
	//  277  648:new             #29  <Class String>
	//  278  651:dup             
	//  279  652:aload           6
	//  280  654:invokespecial   #141 <Method void String(String)>
	//  281  657:astore          6
			obj = ((Object) (String.valueOf(((Object) (s3)))));
	//  282  659:aload           11
	//  283  661:invokestatic    #135 <Method String String.valueOf(Object)>
	//  284  664:astore          7
			if(((String) (obj)).length() != 0)
	//* 285  666:aload           7
	//* 286  668:invokevirtual   #33  <Method int String.length()>
	//* 287  671:ifeq            686
				obj = ((Object) ("get".concat(((String) (obj)))));
	//  288  674:ldc1            #85  <String "get">
	//  289  676:aload           7
	//  290  678:invokevirtual   #138 <Method String String.concat(String)>
	//  291  681:astore          7
			else
	//* 292  683:goto            697
				obj = ((Object) (new String("get")));
	//  293  686:new             #29  <Class String>
	//  294  689:dup             
	//  295  690:ldc1            #85  <String "get">
	//  296  692:invokespecial   #141 <Method void String(String)>
	//  297  695:astore          7
			Method method1 = (Method)((Map) (hashmap)).get(obj);
	//  298  697:aload           8
	//  299  699:aload           7
	//  300  701:invokeinterface #144 <Method Object Map.get(Object)>
	//  301  706:checkcast       #70  <Class Method>
	//  302  709:astore          12
			obj = ((Object) (String.valueOf(((Object) (s3)))));
	//  303  711:aload           11
	//  304  713:invokestatic    #135 <Method String String.valueOf(Object)>
	//  305  716:astore          7
			if(((String) (obj)).length() != 0)
	//* 306  718:aload           7
	//* 307  720:invokevirtual   #33  <Method int String.length()>
	//* 308  723:ifeq            738
				obj = ((Object) ("has".concat(((String) (obj)))));
	//  309  726:ldc1            #189 <String "has">
	//  310  728:aload           7
	//  311  730:invokevirtual   #138 <Method String String.concat(String)>
	//  312  733:astore          7
			else
	//* 313  735:goto            749
				obj = ((Object) (new String("has")));
	//  314  738:new             #29  <Class String>
	//  315  741:dup             
	//  316  742:ldc1            #189 <String "has">
	//  317  744:invokespecial   #141 <Method void String(String)>
	//  318  747:astore          7
			obj = ((Object) ((Method)((Map) (hashmap)).get(obj)));
	//  319  749:aload           8
	//  320  751:aload           7
	//  321  753:invokeinterface #144 <Method Object Map.get(Object)>
	//  322  758:checkcast       #70  <Class Method>
	//  323  761:astore          7
			if(method1 != null)
	//* 324  763:aload           12
	//* 325  765:ifnull          136
			{
				Object obj1 = ash.a(method1, ((Object) (atv1)), new Object[0]);
	//  326  768:aload           12
	//  327  770:aload_0         
	//  328  771:iconst_0        
	//  329  772:anewarray       Object[]
	//  330  775:invokestatic    #157 <Method Object ash.a(Method, Object, Object[])>
	//  331  778:astore          11
				boolean flag;
				if(obj == null)
	//* 332  780:aload           7
	//* 333  782:ifnonnull       1040
				{
					if(obj1 instanceof Boolean)
	//* 334  785:aload           11
	//* 335  787:instanceof      #191 <Class Boolean>
	//* 336  790:ifeq            816
					{
						if(!((Boolean)obj1).booleanValue())
	//* 337  793:aload           11
	//* 338  795:checkcast       #191 <Class Boolean>
	//* 339  798:invokevirtual   #194 <Method boolean Boolean.booleanValue()>
	//* 340  801:ifne            810
							flag = true;
	//  341  804:iconst_1        
	//  342  805:istore          5
						else
	//* 343  807:goto            1023
							flag = false;
	//  344  810:iconst_0        
	//  345  811:istore          5
					} else
	//* 346  813:goto            1023
					if(obj1 instanceof Integer)
	//* 347  816:aload           11
	//* 348  818:instanceof      #196 <Class Integer>
	//* 349  821:ifeq            847
					{
						if(((Integer)obj1).intValue() == 0)
	//* 350  824:aload           11
	//* 351  826:checkcast       #196 <Class Integer>
	//* 352  829:invokevirtual   #199 <Method int Integer.intValue()>
	//* 353  832:ifne            841
							flag = true;
	//  354  835:iconst_1        
	//  355  836:istore          5
						else
	//* 356  838:goto            1023
							flag = false;
	//  357  841:iconst_0        
	//  358  842:istore          5
					} else
	//* 359  844:goto            1023
					if(obj1 instanceof Float)
	//* 360  847:aload           11
	//* 361  849:instanceof      #201 <Class Float>
	//* 362  852:ifeq            880
					{
						if(((Float)obj1).floatValue() == 0.0F)
	//* 363  855:aload           11
	//* 364  857:checkcast       #201 <Class Float>
	//* 365  860:invokevirtual   #205 <Method float Float.floatValue()>
	//* 366  863:fconst_0        
	//* 367  864:fcmpl           
	//* 368  865:ifne            874
							flag = true;
	//  369  868:iconst_1        
	//  370  869:istore          5
						else
	//* 371  871:goto            1023
							flag = false;
	//  372  874:iconst_0        
	//  373  875:istore          5
					} else
	//* 374  877:goto            1023
					if(obj1 instanceof Double)
	//* 375  880:aload           11
	//* 376  882:instanceof      #207 <Class Double>
	//* 377  885:ifeq            913
					{
						if(((Double)obj1).doubleValue() == 0.0D)
	//* 378  888:aload           11
	//* 379  890:checkcast       #207 <Class Double>
	//* 380  893:invokevirtual   #211 <Method double Double.doubleValue()>
	//* 381  896:dconst_0        
	//* 382  897:dcmpl           
	//* 383  898:ifne            907
							flag = true;
	//  384  901:iconst_1        
	//  385  902:istore          5
						else
	//* 386  904:goto            1023
							flag = false;
	//  387  907:iconst_0        
	//  388  908:istore          5
					} else
	//* 389  910:goto            1023
					if(obj1 instanceof String)
	//* 390  913:aload           11
	//* 391  915:instanceof      #29  <Class String>
	//* 392  918:ifeq            933
						flag = obj1.equals("");
	//  393  921:aload           11
	//  394  923:ldc1            #111 <String "">
	//  395  925:invokevirtual   #150 <Method boolean Object.equals(Object)>
	//  396  928:istore          5
					else
	//* 397  930:goto            1023
					if(obj1 instanceof aqq)
	//* 398  933:aload           11
	//* 399  935:instanceof      #213 <Class aqq>
	//* 400  938:ifeq            954
						flag = obj1.equals(((Object) (aqq.a)));
	//  401  941:aload           11
	//  402  943:getstatic       #216 <Field aqq aqq.a>
	//  403  946:invokevirtual   #150 <Method boolean Object.equals(Object)>
	//  404  949:istore          5
					else
	//* 405  951:goto            1023
					if(obj1 instanceof atv)
	//* 406  954:aload           11
	//* 407  956:instanceof      #218 <Class atv>
	//* 408  959:ifeq            989
					{
						if(obj1 == ((atv)obj1).q())
	//* 409  962:aload           11
	//* 410  964:aload           11
	//* 411  966:checkcast       #218 <Class atv>
	//* 412  969:invokeinterface #222 <Method atv atv.q()>
	//* 413  974:if_acmpne       983
							flag = true;
	//  414  977:iconst_1        
	//  415  978:istore          5
						else
	//* 416  980:goto            1023
							flag = false;
	//  417  983:iconst_0        
	//  418  984:istore          5
					} else
	//* 419  986:goto            1023
					if(obj1 instanceof Enum)
	//* 420  989:aload           11
	//* 421  991:instanceof      #224 <Class Enum>
	//* 422  994:ifeq            1020
					{
						if(((Enum)obj1).ordinal() == 0)
	//* 423  997:aload           11
	//* 424  999:checkcast       #224 <Class Enum>
	//* 425 1002:invokevirtual   #227 <Method int Enum.ordinal()>
	//* 426 1005:ifne            1014
							flag = true;
	//  427 1008:iconst_1        
	//  428 1009:istore          5
						else
	//* 429 1011:goto            1023
							flag = false;
	//  430 1014:iconst_0        
	//  431 1015:istore          5
					} else
	//* 432 1017:goto            1023
					{
						flag = false;
	//  433 1020:iconst_0        
	//  434 1021:istore          5
					}
					if(!flag)
	//* 435 1023:iload           5
	//* 436 1025:ifne            1034
						flag = true;
	//  437 1028:iconst_1        
	//  438 1029:istore          5
					else
	//* 439 1031:goto            1058
						flag = false;
	//  440 1034:iconst_0        
	//  441 1035:istore          5
				} else
	//* 442 1037:goto            1058
				{
					flag = ((Boolean)ash.a(((Method) (obj)), ((Object) (atv1)), new Object[0])).booleanValue();
	//  443 1040:aload           7
	//  444 1042:aload_0         
	//  445 1043:iconst_0        
	//  446 1044:anewarray       Object[]
	//  447 1047:invokestatic    #157 <Method Object ash.a(Method, Object, Object[])>
	//  448 1050:checkcast       #191 <Class Boolean>
	//  449 1053:invokevirtual   #194 <Method boolean Boolean.booleanValue()>
	//  450 1056:istore          5
				}
				if(flag)
	//* 451 1058:iload           5
	//* 452 1060:ifeq            136
					a(stringbuilder, i, a(s2), obj1);
	//  453 1063:aload_1         
	//  454 1064:iload_2         
	//  455 1065:aload           6
	//  456 1067:invokestatic    #152 <Method String a(String)>
	//  457 1070:aload           11
	//  458 1072:invokestatic    #160 <Method void a(StringBuilder, int, String, Object)>
			}
		} while(true);
	//  459 1075:goto            136
		if(atv1 instanceof ask)
	//* 460 1078:aload_0         
	//* 461 1079:instanceof      #229 <Class ask>
	//* 462 1082:ifeq            1134
		{
			Iterator iterator = ((ask)atv1).zzfqa.e();
	//  463 1085:aload_0         
	//  464 1086:checkcast       #229 <Class ask>
	//  465 1089:getfield        #233 <Field arx ask.zzfqa>
	//  466 1092:invokevirtual   #238 <Method Iterator arx.e()>
	//  467 1095:astore          6
			if(iterator.hasNext())
	//* 468 1097:aload           6
	//* 469 1099:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//* 470 1104:ifne            1110
	//* 471 1107:goto            1134
			{
				((java.util.Map.Entry)iterator.next()).getKey();
	//  472 1110:aload           6
	//  473 1112:invokeinterface #109 <Method Object Iterator.next()>
	//  474 1117:checkcast       #240 <Class java.util.Map$Entry>
	//  475 1120:invokeinterface #243 <Method Object java.util.Map$Entry.getKey()>
	//  476 1125:pop             
				throw new NoSuchMethodError();
	//  477 1126:new             #245 <Class NoSuchMethodError>
	//  478 1129:dup             
	//  479 1130:invokespecial   #246 <Method void NoSuchMethodError()>
	//  480 1133:athrow          
			}
		}
		atv1 = ((atv) ((ash)atv1));
	//  481 1134:aload_0         
	//  482 1135:checkcast       #154 <Class ash>
	//  483 1138:astore_0        
		if(((ash) (atv1)).zzfpu != null)
	//* 484 1139:aload_0         
	//* 485 1140:getfield        #250 <Field avg ash.zzfpu>
	//* 486 1143:ifnull          1155
			((ash) (atv1)).zzfpu.a(stringbuilder, i);
	//  487 1146:aload_0         
	//  488 1147:getfield        #250 <Field avg ash.zzfpu>
	//  489 1150:aload_1         
	//  490 1151:iload_2         
	//  491 1152:invokevirtual   #255 <Method void avg.a(StringBuilder, int)>
	//  492 1155:return          
	}

	static final void a(StringBuilder stringbuilder, int i, String s, Object obj)
	{
		if(obj instanceof List)
	//*   0    0:aload_3         
	//*   1    1:instanceof      #149 <Class List>
	//*   2    4:ifeq            42
		{
			for(obj = ((Object) (((List)obj).iterator())); ((Iterator) (obj)).hasNext(); a(stringbuilder, i, s, ((Iterator) (obj)).next()));
	//    3    7:aload_3         
	//    4    8:checkcast       #149 <Class List>
	//    5   11:invokeinterface #256 <Method Iterator List.iterator()>
	//    6   16:astore_3        
	//    7   17:aload_3         
	//    8   18:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            41
	//   10   26:aload_0         
	//   11   27:iload_1         
	//   12   28:aload_2         
	//   13   29:aload_3         
	//   14   30:invokeinterface #109 <Method Object Iterator.next()>
	//   15   35:invokestatic    #160 <Method void a(StringBuilder, int, String, Object)>
	//*  16   38:goto            17
			return;
	//   17   41:return          
		}
		if(obj instanceof Map)
	//*  18   42:aload_3         
	//*  19   43:instanceof      #75  <Class Map>
	//*  20   46:ifeq            92
		{
			for(obj = ((Object) (((Map)obj).entrySet().iterator())); ((Iterator) (obj)).hasNext(); a(stringbuilder, i, s, ((Object) ((java.util.Map.Entry)((Iterator) (obj)).next()))));
	//   21   49:aload_3         
	//   22   50:checkcast       #75  <Class Map>
	//   23   53:invokeinterface #260 <Method Set Map.entrySet()>
	//   24   58:invokeinterface #99  <Method Iterator Set.iterator()>
	//   25   63:astore_3        
	//   26   64:aload_3         
	//   27   65:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   28   70:ifeq            91
	//   29   73:aload_0         
	//   30   74:iload_1         
	//   31   75:aload_2         
	//   32   76:aload_3         
	//   33   77:invokeinterface #109 <Method Object Iterator.next()>
	//   34   82:checkcast       #240 <Class java.util.Map$Entry>
	//   35   85:invokestatic    #160 <Method void a(StringBuilder, int, String, Object)>
	//*  36   88:goto            64
			return;
	//   37   91:return          
		}
		stringbuilder.append('\n');
	//   38   92:aload_0         
	//   39   93:bipush          10
	//   40   95:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   41   98:pop             
		boolean flag = false;
	//   42   99:iconst_0        
	//   43  100:istore          5
		boolean flag1 = false;
	//   44  102:iconst_0        
	//   45  103:istore          6
		for(int j = 0; j < i; j++)
	//*  46  105:iconst_0        
	//*  47  106:istore          4
	//*  48  108:iload           4
	//*  49  110:iload_1         
	//*  50  111:icmpge          130
			stringbuilder.append(' ');
	//   51  114:aload_0         
	//   52  115:bipush          32
	//   53  117:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   54  120:pop             

	//   55  121:iload           4
	//   56  123:iconst_1        
	//   57  124:iadd            
	//   58  125:istore          4
	//*  59  127:goto            108
		stringbuilder.append(s);
	//   60  130:aload_0         
	//   61  131:aload_2         
	//   62  132:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   63  135:pop             
		if(obj instanceof String)
	//*  64  136:aload_3         
	//*  65  137:instanceof      #29  <Class String>
	//*  66  140:ifeq            174
		{
			stringbuilder.append(": \"");
	//   67  143:aload_0         
	//   68  144:ldc2            #262 <String ": \"">
	//   69  147:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   70  150:pop             
			stringbuilder.append(avb.a(aqq.a((String)obj)));
	//   71  151:aload_0         
	//   72  152:aload_3         
	//   73  153:checkcast       #29  <Class String>
	//   74  156:invokestatic    #265 <Method aqq aqq.a(String)>
	//   75  159:invokestatic    #270 <Method String avb.a(aqq)>
	//   76  162:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   77  165:pop             
			stringbuilder.append('"');
	//   78  166:aload_0         
	//   79  167:bipush          34
	//   80  169:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   81  172:pop             
			return;
	//   82  173:return          
		}
		if(obj instanceof aqq)
	//*  83  174:aload_3         
	//*  84  175:instanceof      #213 <Class aqq>
	//*  85  178:ifeq            209
		{
			stringbuilder.append(": \"");
	//   86  181:aload_0         
	//   87  182:ldc2            #262 <String ": \"">
	//   88  185:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   89  188:pop             
			stringbuilder.append(avb.a((aqq)obj));
	//   90  189:aload_0         
	//   91  190:aload_3         
	//   92  191:checkcast       #213 <Class aqq>
	//   93  194:invokestatic    #270 <Method String avb.a(aqq)>
	//   94  197:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   95  200:pop             
			stringbuilder.append('"');
	//   96  201:aload_0         
	//   97  202:bipush          34
	//   98  204:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//   99  207:pop             
			return;
	//  100  208:return          
		}
		if(obj instanceof ash)
	//* 101  209:aload_3         
	//* 102  210:instanceof      #154 <Class ash>
	//* 103  213:ifeq            278
		{
			stringbuilder.append(" {");
	//  104  216:aload_0         
	//  105  217:ldc2            #272 <String " {">
	//  106  220:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  107  223:pop             
			a(((atv) ((ash)obj)), stringbuilder, i + 2);
	//  108  224:aload_3         
	//  109  225:checkcast       #154 <Class ash>
	//  110  228:aload_0         
	//  111  229:iload_1         
	//  112  230:iconst_2        
	//  113  231:iadd            
	//  114  232:invokestatic    #21  <Method void a(atv, StringBuilder, int)>
			stringbuilder.append("\n");
	//  115  235:aload_0         
	//  116  236:ldc2            #274 <String "\n">
	//  117  239:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  118  242:pop             
			for(int k = ((int) (flag1)); k < i; k++)
	//* 119  243:iload           6
	//* 120  245:istore          4
	//* 121  247:iload           4
	//* 122  249:iload_1         
	//* 123  250:icmpge          269
				stringbuilder.append(' ');
	//  124  253:aload_0         
	//  125  254:bipush          32
	//  126  256:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//  127  259:pop             

	//  128  260:iload           4
	//  129  262:iconst_1        
	//  130  263:iadd            
	//  131  264:istore          4
	//* 132  266:goto            247
			stringbuilder.append("}");
	//  133  269:aload_0         
	//  134  270:ldc2            #276 <String "}">
	//  135  273:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  136  276:pop             
			return;
	//  137  277:return          
		}
		if(obj instanceof java.util.Map.Entry)
	//* 138  278:aload_3         
	//* 139  279:instanceof      #240 <Class java.util.Map$Entry>
	//* 140  282:ifeq            376
		{
			stringbuilder.append(" {");
	//  141  285:aload_0         
	//  142  286:ldc2            #272 <String " {">
	//  143  289:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  144  292:pop             
			s = ((String) ((java.util.Map.Entry)obj));
	//  145  293:aload_3         
	//  146  294:checkcast       #240 <Class java.util.Map$Entry>
	//  147  297:astore_2        
			int l = i + 2;
	//  148  298:iload_1         
	//  149  299:iconst_2        
	//  150  300:iadd            
	//  151  301:istore          4
			a(stringbuilder, l, "key", ((java.util.Map.Entry) (s)).getKey());
	//  152  303:aload_0         
	//  153  304:iload           4
	//  154  306:ldc2            #278 <String "key">
	//  155  309:aload_2         
	//  156  310:invokeinterface #243 <Method Object java.util.Map$Entry.getKey()>
	//  157  315:invokestatic    #160 <Method void a(StringBuilder, int, String, Object)>
			a(stringbuilder, l, "value", ((java.util.Map.Entry) (s)).getValue());
	//  158  318:aload_0         
	//  159  319:iload           4
	//  160  321:ldc2            #280 <String "value">
	//  161  324:aload_2         
	//  162  325:invokeinterface #283 <Method Object java.util.Map$Entry.getValue()>
	//  163  330:invokestatic    #160 <Method void a(StringBuilder, int, String, Object)>
			stringbuilder.append("\n");
	//  164  333:aload_0         
	//  165  334:ldc2            #274 <String "\n">
	//  166  337:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  167  340:pop             
			for(int i1 = ((int) (flag)); i1 < i; i1++)
	//* 168  341:iload           5
	//* 169  343:istore          4
	//* 170  345:iload           4
	//* 171  347:iload_1         
	//* 172  348:icmpge          367
				stringbuilder.append(' ');
	//  173  351:aload_0         
	//  174  352:bipush          32
	//  175  354:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
	//  176  357:pop             

	//  177  358:iload           4
	//  178  360:iconst_1        
	//  179  361:iadd            
	//  180  362:istore          4
	//* 181  364:goto            345
			stringbuilder.append("}");
	//  182  367:aload_0         
	//  183  368:ldc2            #276 <String "}">
	//  184  371:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  185  374:pop             
			return;
	//  186  375:return          
		} else
		{
			stringbuilder.append(": ");
	//  187  376:aload_0         
	//  188  377:ldc2            #285 <String ": ">
	//  189  380:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  190  383:pop             
			stringbuilder.append(obj.toString());
	//  191  384:aload_0         
	//  192  385:aload_3         
	//  193  386:invokevirtual   #286 <Method String Object.toString()>
	//  194  389:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  195  392:pop             
			return;
	//  196  393:return          
		}
	}
}
