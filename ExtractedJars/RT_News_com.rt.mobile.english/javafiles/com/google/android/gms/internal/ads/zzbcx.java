// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbo, zzbah, zzbcu, zzbbg, 
//			zzbef, zzbea

final class zzbcx
{

	static String zza(zzbcu zzbcu1, String s)
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
		zza(zzbcu1, stringbuilder, 0);
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokestatic    #21  <Method void zza(zzbcu, StringBuilder, int)>
		return stringbuilder.toString();
	//   16   27:aload_2         
	//   17   28:invokevirtual   #25  <Method String StringBuilder.toString()>
	//   18   31:areturn         
	}

	private static void zza(zzbcu zzbcu1, StringBuilder stringbuilder, int i)
	{
		HashMap hashmap;
		HashMap hashmap1;
		Iterator iterator1;
		hashmap = new HashMap();
	//    0    0:new             #28  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void HashMap()>
	//    3    7:astore          8
		hashmap1 = new HashMap();
	//    4    9:new             #28  <Class HashMap>
	//    5   12:dup             
	//    6   13:invokespecial   #29  <Method void HashMap()>
	//    7   16:astore          9
		TreeSet treeset = new TreeSet();
	//    8   18:new             #31  <Class TreeSet>
	//    9   21:dup             
	//   10   22:invokespecial   #32  <Method void TreeSet()>
	//   11   25:astore          6
		Method amethod[] = ((Object) (zzbcu1)).getClass().getDeclaredMethods();
	//   12   27:aload_0         
	//   13   28:invokevirtual   #36  <Method Class Object.getClass()>
	//   14   31:invokevirtual   #42  <Method Method[] Class.getDeclaredMethods()>
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
	//   30   59:invokevirtual   #47  <Method String Method.getName()>
	//   31   62:aload           10
	//   32   64:invokeinterface #53  <Method Object Map.put(Object, Object)>
	//   33   69:pop             
			if(method.getParameterTypes().length != 0)
				continue;
	//   34   70:aload           10
	//   35   72:invokevirtual   #57  <Method Class[] Method.getParameterTypes()>
	//   36   75:arraylength     
	//   37   76:ifne            120
			((Map) (hashmap)).put(((Object) (method.getName())), ((Object) (method)));
	//   38   79:aload           8
	//   39   81:aload           10
	//   40   83:invokevirtual   #47  <Method String Method.getName()>
	//   41   86:aload           10
	//   42   88:invokeinterface #53  <Method Object Map.put(Object, Object)>
	//   43   93:pop             
			if(method.getName().startsWith("get"))
	//*  44   94:aload           10
	//*  45   96:invokevirtual   #47  <Method String Method.getName()>
	//*  46   99:ldc1            #59  <String "get">
	//*  47  101:invokevirtual   #65  <Method boolean String.startsWith(String)>
	//*  48  104:ifeq            120
				((Set) (treeset)).add(((Object) (method.getName())));
	//   49  107:aload           6
	//   50  109:aload           10
	//   51  111:invokevirtual   #47  <Method String Method.getName()>
	//   52  114:invokeinterface #71  <Method boolean Set.add(Object)>
	//   53  119:pop             
		}

	//   54  120:iload_3         
	//   55  121:iconst_1        
	//   56  122:iadd            
	//   57  123:istore_3        
	//*  58  124:goto            43
		iterator1 = ((Set) (treeset)).iterator();
	//   59  127:aload           6
	//   60  129:invokeinterface #75  <Method Iterator Set.iterator()>
	//   61  134:astore          10
_L10:
		String s2;
		Object obj;
		Object obj1;
		if(!iterator1.hasNext())
			break; /* Loop/switch isn't completed */
	//   62  136:aload           10
	//   63  138:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//   64  143:ifeq            1029
		obj = ((Object) ((String)iterator1.next()));
	//   65  146:aload           10
	//   66  148:invokeinterface #85  <Method Object Iterator.next()>
	//   67  153:checkcast       #61  <Class String>
	//   68  156:astore          7
		obj1 = ((Object) (((String) (obj)).replaceFirst("get", "")));
	//   69  158:aload           7
	//   70  160:ldc1            #59  <String "get">
	//   71  162:ldc1            #87  <String "">
	//   72  164:invokevirtual   #91  <Method String String.replaceFirst(String, String)>
	//   73  167:astore          11
		if(((String) (obj1)).endsWith("List") && !((String) (obj1)).endsWith("OrBuilderList") && !((String) (obj1)).equals("List"))
	//*  74  169:aload           11
	//*  75  171:ldc1            #93  <String "List">
	//*  76  173:invokevirtual   #96  <Method boolean String.endsWith(String)>
	//*  77  176:ifeq            318
	//*  78  179:aload           11
	//*  79  181:ldc1            #98  <String "OrBuilderList">
	//*  80  183:invokevirtual   #96  <Method boolean String.endsWith(String)>
	//*  81  186:ifne            318
	//*  82  189:aload           11
	//*  83  191:ldc1            #93  <String "List">
	//*  84  193:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  85  196:ifne            318
		{
			String s = String.valueOf(((Object) (((String) (obj1)).substring(0, 1).toLowerCase())));
	//   86  199:aload           11
	//   87  201:iconst_0        
	//   88  202:iconst_1        
	//   89  203:invokevirtual   #105 <Method String String.substring(int, int)>
	//   90  206:invokevirtual   #108 <Method String String.toLowerCase()>
	//   91  209:invokestatic    #112 <Method String String.valueOf(Object)>
	//   92  212:astore          6
			Object obj2 = ((Object) (String.valueOf(((Object) (((String) (obj1)).substring(1, ((String) (obj1)).length() - 4))))));
	//   93  214:aload           11
	//   94  216:iconst_1        
	//   95  217:aload           11
	//   96  219:invokevirtual   #116 <Method int String.length()>
	//   97  222:iconst_4        
	//   98  223:isub            
	//   99  224:invokevirtual   #105 <Method String String.substring(int, int)>
	//  100  227:invokestatic    #112 <Method String String.valueOf(Object)>
	//  101  230:astore          12
			if(((String) (obj2)).length() != 0)
	//* 102  232:aload           12
	//* 103  234:invokevirtual   #116 <Method int String.length()>
	//* 104  237:ifeq            252
				s = s.concat(((String) (obj2)));
	//  105  240:aload           6
	//  106  242:aload           12
	//  107  244:invokevirtual   #120 <Method String String.concat(String)>
	//  108  247:astore          6
			else
	//* 109  249:goto            263
				s = new String(s);
	//  110  252:new             #61  <Class String>
	//  111  255:dup             
	//  112  256:aload           6
	//  113  258:invokespecial   #123 <Method void String(String)>
	//  114  261:astore          6
			obj2 = ((Object) ((Method)((Map) (hashmap)).get(obj)));
	//  115  263:aload           8
	//  116  265:aload           7
	//  117  267:invokeinterface #126 <Method Object Map.get(Object)>
	//  118  272:checkcast       #44  <Class Method>
	//  119  275:astore          12
			if(obj2 != null && ((Object) (((Method) (obj2)).getReturnType())).equals(java/util/List))
	//* 120  277:aload           12
	//* 121  279:ifnull          318
	//* 122  282:aload           12
	//* 123  284:invokevirtual   #129 <Method Class Method.getReturnType()>
	//* 124  287:ldc1            #131 <Class List>
	//* 125  289:invokevirtual   #132 <Method boolean Object.equals(Object)>
	//* 126  292:ifeq            318
			{
				zza(stringbuilder, i, zzep(s), zzbbo.zza(((Method) (obj2)), ((Object) (zzbcu1)), new Object[0]));
	//  127  295:aload_1         
	//  128  296:iload_2         
	//  129  297:aload           6
	//  130  299:invokestatic    #135 <Method String zzep(String)>
	//  131  302:aload           12
	//  132  304:aload_0         
	//  133  305:iconst_0        
	//  134  306:anewarray       Object[]
	//  135  309:invokestatic    #140 <Method Object zzbbo.zza(Method, Object, Object[])>
	//  136  312:invokestatic    #143 <Method void zza(StringBuilder, int, String, Object)>
				continue; /* Loop/switch isn't completed */
	//  137  315:goto            136
			}
		}
		if(((String) (obj1)).endsWith("Map") && !((String) (obj1)).equals("Map"))
	//* 138  318:aload           11
	//* 139  320:ldc1            #145 <String "Map">
	//* 140  322:invokevirtual   #96  <Method boolean String.endsWith(String)>
	//* 141  325:ifeq            478
	//* 142  328:aload           11
	//* 143  330:ldc1            #145 <String "Map">
	//* 144  332:invokevirtual   #101 <Method boolean String.equals(Object)>
	//* 145  335:ifne            478
		{
			String s1 = String.valueOf(((Object) (((String) (obj1)).substring(0, 1).toLowerCase())));
	//  146  338:aload           11
	//  147  340:iconst_0        
	//  148  341:iconst_1        
	//  149  342:invokevirtual   #105 <Method String String.substring(int, int)>
	//  150  345:invokevirtual   #108 <Method String String.toLowerCase()>
	//  151  348:invokestatic    #112 <Method String String.valueOf(Object)>
	//  152  351:astore          6
			String s3 = String.valueOf(((Object) (((String) (obj1)).substring(1, ((String) (obj1)).length() - 3))));
	//  153  353:aload           11
	//  154  355:iconst_1        
	//  155  356:aload           11
	//  156  358:invokevirtual   #116 <Method int String.length()>
	//  157  361:iconst_3        
	//  158  362:isub            
	//  159  363:invokevirtual   #105 <Method String String.substring(int, int)>
	//  160  366:invokestatic    #112 <Method String String.valueOf(Object)>
	//  161  369:astore          12
			if(s3.length() != 0)
	//* 162  371:aload           12
	//* 163  373:invokevirtual   #116 <Method int String.length()>
	//* 164  376:ifeq            391
				s1 = s1.concat(s3);
	//  165  379:aload           6
	//  166  381:aload           12
	//  167  383:invokevirtual   #120 <Method String String.concat(String)>
	//  168  386:astore          6
			else
	//* 169  388:goto            402
				s1 = new String(s1);
	//  170  391:new             #61  <Class String>
	//  171  394:dup             
	//  172  395:aload           6
	//  173  397:invokespecial   #123 <Method void String(String)>
	//  174  400:astore          6
			obj = ((Object) ((Method)((Map) (hashmap)).get(obj)));
	//  175  402:aload           8
	//  176  404:aload           7
	//  177  406:invokeinterface #126 <Method Object Map.get(Object)>
	//  178  411:checkcast       #44  <Class Method>
	//  179  414:astore          7
			if(obj != null && ((Object) (((Method) (obj)).getReturnType())).equals(java/util/Map) && !((Method) (obj)).isAnnotationPresent(java/lang/Deprecated) && Modifier.isPublic(((Method) (obj)).getModifiers()))
	//* 180  416:aload           7
	//* 181  418:ifnull          478
	//* 182  421:aload           7
	//* 183  423:invokevirtual   #129 <Method Class Method.getReturnType()>
	//* 184  426:ldc1            #49  <Class Map>
	//* 185  428:invokevirtual   #132 <Method boolean Object.equals(Object)>
	//* 186  431:ifeq            478
	//* 187  434:aload           7
	//* 188  436:ldc1            #147 <Class Deprecated>
	//* 189  438:invokevirtual   #151 <Method boolean Method.isAnnotationPresent(Class)>
	//* 190  441:ifne            478
	//* 191  444:aload           7
	//* 192  446:invokevirtual   #154 <Method int Method.getModifiers()>
	//* 193  449:invokestatic    #160 <Method boolean Modifier.isPublic(int)>
	//* 194  452:ifeq            478
			{
				zza(stringbuilder, i, zzep(s1), zzbbo.zza(((Method) (obj)), ((Object) (zzbcu1)), new Object[0]));
	//  195  455:aload_1         
	//  196  456:iload_2         
	//  197  457:aload           6
	//  198  459:invokestatic    #135 <Method String zzep(String)>
	//  199  462:aload           7
	//  200  464:aload_0         
	//  201  465:iconst_0        
	//  202  466:anewarray       Object[]
	//  203  469:invokestatic    #140 <Method Object zzbbo.zza(Method, Object, Object[])>
	//  204  472:invokestatic    #143 <Method void zza(StringBuilder, int, String, Object)>
				continue; /* Loop/switch isn't completed */
	//  205  475:goto            136
			}
		}
		s2 = String.valueOf(obj1);
	//  206  478:aload           11
	//  207  480:invokestatic    #112 <Method String String.valueOf(Object)>
	//  208  483:astore          6
		if(s2.length() != 0)
	//* 209  485:aload           6
	//* 210  487:invokevirtual   #116 <Method int String.length()>
	//* 211  490:ifeq            505
			s2 = "set".concat(s2);
	//  212  493:ldc1            #162 <String "set">
	//  213  495:aload           6
	//  214  497:invokevirtual   #120 <Method String String.concat(String)>
	//  215  500:astore          6
		else
	//* 216  502:goto            516
			s2 = new String("set");
	//  217  505:new             #61  <Class String>
	//  218  508:dup             
	//  219  509:ldc1            #162 <String "set">
	//  220  511:invokespecial   #123 <Method void String(String)>
	//  221  514:astore          6
		if((Method)((Map) (hashmap1)).get(((Object) (s2))) == null)
			continue; /* Loop/switch isn't completed */
	//  222  516:aload           9
	//  223  518:aload           6
	//  224  520:invokeinterface #126 <Method Object Map.get(Object)>
	//  225  525:checkcast       #44  <Class Method>
	//  226  528:ifnull          136
		if(((String) (obj1)).endsWith("Bytes"))
	//* 227  531:aload           11
	//* 228  533:ldc1            #164 <String "Bytes">
	//* 229  535:invokevirtual   #96  <Method boolean String.endsWith(String)>
	//* 230  538:ifeq            602
		{
			s2 = String.valueOf(((Object) (((String) (obj1)).substring(0, ((String) (obj1)).length() - 5))));
	//  231  541:aload           11
	//  232  543:iconst_0        
	//  233  544:aload           11
	//  234  546:invokevirtual   #116 <Method int String.length()>
	//  235  549:iconst_5        
	//  236  550:isub            
	//  237  551:invokevirtual   #105 <Method String String.substring(int, int)>
	//  238  554:invokestatic    #112 <Method String String.valueOf(Object)>
	//  239  557:astore          6
			if(s2.length() != 0)
	//* 240  559:aload           6
	//* 241  561:invokevirtual   #116 <Method int String.length()>
	//* 242  564:ifeq            579
				s2 = "get".concat(s2);
	//  243  567:ldc1            #59  <String "get">
	//  244  569:aload           6
	//  245  571:invokevirtual   #120 <Method String String.concat(String)>
	//  246  574:astore          6
			else
	//* 247  576:goto            590
				s2 = new String("get");
	//  248  579:new             #61  <Class String>
	//  249  582:dup             
	//  250  583:ldc1            #59  <String "get">
	//  251  585:invokespecial   #123 <Method void String(String)>
	//  252  588:astore          6
			if(((Map) (hashmap)).containsKey(((Object) (s2))))
				continue; /* Loop/switch isn't completed */
	//  253  590:aload           8
	//  254  592:aload           6
	//  255  594:invokeinterface #167 <Method boolean Map.containsKey(Object)>
	//  256  599:ifne            136
		}
		s2 = String.valueOf(((Object) (((String) (obj1)).substring(0, 1).toLowerCase())));
	//  257  602:aload           11
	//  258  604:iconst_0        
	//  259  605:iconst_1        
	//  260  606:invokevirtual   #105 <Method String String.substring(int, int)>
	//  261  609:invokevirtual   #108 <Method String String.toLowerCase()>
	//  262  612:invokestatic    #112 <Method String String.valueOf(Object)>
	//  263  615:astore          6
		obj = ((Object) (String.valueOf(((Object) (((String) (obj1)).substring(1))))));
	//  264  617:aload           11
	//  265  619:iconst_1        
	//  266  620:invokevirtual   #170 <Method String String.substring(int)>
	//  267  623:invokestatic    #112 <Method String String.valueOf(Object)>
	//  268  626:astore          7
		if(((String) (obj)).length() != 0)
	//* 269  628:aload           7
	//* 270  630:invokevirtual   #116 <Method int String.length()>
	//* 271  633:ifeq            648
			s2 = s2.concat(((String) (obj)));
	//  272  636:aload           6
	//  273  638:aload           7
	//  274  640:invokevirtual   #120 <Method String String.concat(String)>
	//  275  643:astore          6
		else
	//* 276  645:goto            659
			s2 = new String(s2);
	//  277  648:new             #61  <Class String>
	//  278  651:dup             
	//  279  652:aload           6
	//  280  654:invokespecial   #123 <Method void String(String)>
	//  281  657:astore          6
		obj = ((Object) (String.valueOf(obj1)));
	//  282  659:aload           11
	//  283  661:invokestatic    #112 <Method String String.valueOf(Object)>
	//  284  664:astore          7
		if(((String) (obj)).length() != 0)
	//* 285  666:aload           7
	//* 286  668:invokevirtual   #116 <Method int String.length()>
	//* 287  671:ifeq            686
			obj = ((Object) ("get".concat(((String) (obj)))));
	//  288  674:ldc1            #59  <String "get">
	//  289  676:aload           7
	//  290  678:invokevirtual   #120 <Method String String.concat(String)>
	//  291  681:astore          7
		else
	//* 292  683:goto            697
			obj = ((Object) (new String("get")));
	//  293  686:new             #61  <Class String>
	//  294  689:dup             
	//  295  690:ldc1            #59  <String "get">
	//  296  692:invokespecial   #123 <Method void String(String)>
	//  297  695:astore          7
		Method method1 = (Method)((Map) (hashmap)).get(obj);
	//  298  697:aload           8
	//  299  699:aload           7
	//  300  701:invokeinterface #126 <Method Object Map.get(Object)>
	//  301  706:checkcast       #44  <Class Method>
	//  302  709:astore          12
		obj = ((Object) (String.valueOf(obj1)));
	//  303  711:aload           11
	//  304  713:invokestatic    #112 <Method String String.valueOf(Object)>
	//  305  716:astore          7
		if(((String) (obj)).length() != 0)
	//* 306  718:aload           7
	//* 307  720:invokevirtual   #116 <Method int String.length()>
	//* 308  723:ifeq            738
			obj = ((Object) ("has".concat(((String) (obj)))));
	//  309  726:ldc1            #172 <String "has">
	//  310  728:aload           7
	//  311  730:invokevirtual   #120 <Method String String.concat(String)>
	//  312  733:astore          7
		else
	//* 313  735:goto            749
			obj = ((Object) (new String("has")));
	//  314  738:new             #61  <Class String>
	//  315  741:dup             
	//  316  742:ldc1            #172 <String "has">
	//  317  744:invokespecial   #123 <Method void String(String)>
	//  318  747:astore          7
		obj = ((Object) ((Method)((Map) (hashmap)).get(obj)));
	//  319  749:aload           8
	//  320  751:aload           7
	//  321  753:invokeinterface #126 <Method Object Map.get(Object)>
	//  322  758:checkcast       #44  <Class Method>
	//  323  761:astore          7
		if(method1 == null)
			continue; /* Loop/switch isn't completed */
	//  324  763:aload           12
	//  325  765:ifnull          136
		obj1 = zzbbo.zza(method1, ((Object) (zzbcu1)), new Object[0]);
	//  326  768:aload           12
	//  327  770:aload_0         
	//  328  771:iconst_0        
	//  329  772:anewarray       Object[]
	//  330  775:invokestatic    #140 <Method Object zzbbo.zza(Method, Object, Object[])>
	//  331  778:astore          11
		if(obj != null)
			break MISSING_BLOCK_LABEL_991;
	//  332  780:aload           7
	//  333  782:ifnonnull       991
		if(!(obj1 instanceof Boolean)) goto _L2; else goto _L1
	//  334  785:aload           11
	//  335  787:instanceof      #174 <Class Boolean>
	//  336  790:ifeq            816
_L1:
		if(((Boolean)obj1).booleanValue()) goto _L4; else goto _L3
	//  337  793:aload           11
	//  338  795:checkcast       #174 <Class Boolean>
	//  339  798:invokevirtual   #177 <Method boolean Boolean.booleanValue()>
	//  340  801:ifne            810
_L3:
		boolean flag = true;
	//  341  804:iconst_1        
	//  342  805:istore          5
		  goto _L5
	//* 343  807:goto            974
_L4:
		flag = false;
	//  344  810:iconst_0        
	//  345  811:istore          5
		  goto _L5
	//* 346  813:goto            974
_L2:
		if(!(obj1 instanceof Integer))
			break; /* Loop/switch isn't completed */
	//  347  816:aload           11
	//  348  818:instanceof      #179 <Class Integer>
	//  349  821:ifeq            838
		if(((Integer)obj1).intValue() == 0)
	//* 350  824:aload           11
	//* 351  826:checkcast       #179 <Class Integer>
	//* 352  829:invokevirtual   #182 <Method int Integer.intValue()>
	//* 353  832:ifne            810
			break; /* Loop/switch isn't completed */
	//  354  835:goto            804
		if(true) goto _L4; else goto _L6
_L6:
		if(!(obj1 instanceof Float))
			break MISSING_BLOCK_LABEL_862;
	//  355  838:aload           11
	//  356  840:instanceof      #184 <Class Float>
	//  357  843:ifeq            862
		if(((Float)obj1).floatValue() != 0.0F) goto _L4; else goto _L7
	//  358  846:aload           11
	//  359  848:checkcast       #184 <Class Float>
	//  360  851:invokevirtual   #188 <Method float Float.floatValue()>
	//  361  854:fconst_0        
	//  362  855:fcmpl           
	//  363  856:ifne            810
_L7:
		break; /* Loop/switch isn't completed */
	//  364  859:goto            804
		if(!(obj1 instanceof Double))
			break MISSING_BLOCK_LABEL_886;
	//  365  862:aload           11
	//  366  864:instanceof      #190 <Class Double>
	//  367  867:ifeq            886
		if(((Double)obj1).doubleValue() != 0.0D) goto _L4; else goto _L8
	//  368  870:aload           11
	//  369  872:checkcast       #190 <Class Double>
	//  370  875:invokevirtual   #194 <Method double Double.doubleValue()>
	//  371  878:dconst_0        
	//  372  879:dcmpl           
	//  373  880:ifne            810
_L8:
		break; /* Loop/switch isn't completed */
	//  374  883:goto            804
		if(obj1 instanceof String)
	//* 375  886:aload           11
	//* 376  888:instanceof      #61  <Class String>
	//* 377  891:ifeq            910
		{
			obj = "";
	//  378  894:ldc1            #87  <String "">
	//  379  896:astore          7
		} else
	//* 380  898:aload           11
	//* 381  900:aload           7
	//* 382  902:invokevirtual   #132 <Method boolean Object.equals(Object)>
	//* 383  905:istore          5
	//* 384  907:goto            974
		{
			if(!(obj1 instanceof zzbah))
				continue; /* Loop/switch isn't completed */
	//  385  910:aload           11
	//  386  912:instanceof      #196 <Class zzbah>
	//  387  915:ifeq            926
			obj = ((Object) (zzbah.zzdpq));
	//  388  918:getstatic       #200 <Field zzbah zzbah.zzdpq>
	//  389  921:astore          7
		}
		flag = obj1.equals(obj);
		  goto _L5
	//* 390  923:goto            898
		if((obj1 instanceof zzbcu) ? obj1 != ((zzbcu)obj1).zzadg() : !(obj1 instanceof Enum) || ((Enum)obj1).ordinal() != 0) goto _L4; else goto _L3
	//  391  926:aload           11
	//  392  928:instanceof      #202 <Class zzbcu>
	//  393  931:ifeq            952
	//  394  934:aload           11
	//  395  936:aload           11
	//  396  938:checkcast       #202 <Class zzbcu>
	//  397  941:invokeinterface #206 <Method zzbcu zzbcu.zzadg()>
	//  398  946:if_acmpne       810
	//  399  949:goto            804
	//  400  952:aload           11
	//  401  954:instanceof      #208 <Class Enum>
	//  402  957:ifeq            810
	//  403  960:aload           11
	//  404  962:checkcast       #208 <Class Enum>
	//  405  965:invokevirtual   #211 <Method int Enum.ordinal()>
	//  406  968:ifne            810
	//* 407  971:goto            804
_L5:
		if(!flag)
	//* 408  974:iload           5
	//* 409  976:ifne            985
			flag = true;
	//  410  979:iconst_1        
	//  411  980:istore          5
		else
	//* 412  982:goto            1009
			flag = false;
	//  413  985:iconst_0        
	//  414  986:istore          5
		break MISSING_BLOCK_LABEL_1009;
	//  415  988:goto            1009
		flag = ((Boolean)zzbbo.zza(((Method) (obj)), ((Object) (zzbcu1)), new Object[0])).booleanValue();
	//  416  991:aload           7
	//  417  993:aload_0         
	//  418  994:iconst_0        
	//  419  995:anewarray       Object[]
	//  420  998:invokestatic    #140 <Method Object zzbbo.zza(Method, Object, Object[])>
	//  421 1001:checkcast       #174 <Class Boolean>
	//  422 1004:invokevirtual   #177 <Method boolean Boolean.booleanValue()>
	//  423 1007:istore          5
		if(flag)
	//* 424 1009:iload           5
	//* 425 1011:ifeq            136
			zza(stringbuilder, i, zzep(s2), obj1);
	//  426 1014:aload_1         
	//  427 1015:iload_2         
	//  428 1016:aload           6
	//  429 1018:invokestatic    #135 <Method String zzep(String)>
	//  430 1021:aload           11
	//  431 1023:invokestatic    #143 <Method void zza(StringBuilder, int, String, Object)>
		if(true) goto _L10; else goto _L9
	//  432 1026:goto            136
_L9:
		if(zzbcu1 instanceof zzbbo.zzc)
	//* 433 1029:aload_0         
	//* 434 1030:instanceof      #213 <Class zzbbo$zzc>
	//* 435 1033:ifeq            1082
		{
			Iterator iterator = ((zzbbo.zzc)zzbcu1).zzdtz.iterator();
	//  436 1036:aload_0         
	//  437 1037:checkcast       #213 <Class zzbbo$zzc>
	//  438 1040:getfield        #217 <Field zzbbg zzbbo$zzc.zzdtz>
	//  439 1043:invokevirtual   #220 <Method Iterator zzbbg.iterator()>
	//  440 1046:astore          6
			if(iterator.hasNext())
	//* 441 1048:aload           6
	//* 442 1050:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//* 443 1055:ifeq            1082
			{
				((java.util.Map.Entry)iterator.next()).getKey();
	//  444 1058:aload           6
	//  445 1060:invokeinterface #85  <Method Object Iterator.next()>
	//  446 1065:checkcast       #222 <Class java.util.Map$Entry>
	//  447 1068:invokeinterface #225 <Method Object java.util.Map$Entry.getKey()>
	//  448 1073:pop             
				throw new NoSuchMethodError();
	//  449 1074:new             #227 <Class NoSuchMethodError>
	//  450 1077:dup             
	//  451 1078:invokespecial   #228 <Method void NoSuchMethodError()>
	//  452 1081:athrow          
			}
		}
		zzbcu1 = ((zzbcu) ((zzbbo)zzbcu1));
	//  453 1082:aload_0         
	//  454 1083:checkcast       #137 <Class zzbbo>
	//  455 1086:astore_0        
		if(((zzbbo) (zzbcu1)).zzdtt != null)
	//* 456 1087:aload_0         
	//* 457 1088:getfield        #232 <Field zzbef zzbbo.zzdtt>
	//* 458 1091:ifnull          1103
			((zzbbo) (zzbcu1)).zzdtt.zza(stringbuilder, i);
	//  459 1094:aload_0         
	//  460 1095:getfield        #232 <Field zzbef zzbbo.zzdtt>
	//  461 1098:aload_1         
	//  462 1099:iload_2         
	//  463 1100:invokevirtual   #237 <Method void zzbef.zza(StringBuilder, int)>
		return;
	//  464 1103:return          
	}

	static final void zza(StringBuilder stringbuilder, int i, String s, Object obj)
	{
		if(obj instanceof List)
	//*   0    0:aload_3         
	//*   1    1:instanceof      #131 <Class List>
	//*   2    4:ifeq            42
		{
			for(obj = ((Object) (((List)obj).iterator())); ((Iterator) (obj)).hasNext(); zza(stringbuilder, i, s, ((Iterator) (obj)).next()));
	//    3    7:aload_3         
	//    4    8:checkcast       #131 <Class List>
	//    5   11:invokeinterface #238 <Method Iterator List.iterator()>
	//    6   16:astore_3        
	//    7   17:aload_3         
	//    8   18:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            41
	//   10   26:aload_0         
	//   11   27:iload_1         
	//   12   28:aload_2         
	//   13   29:aload_3         
	//   14   30:invokeinterface #85  <Method Object Iterator.next()>
	//   15   35:invokestatic    #143 <Method void zza(StringBuilder, int, String, Object)>
	//*  16   38:goto            17
			return;
	//   17   41:return          
		}
		if(obj instanceof Map)
	//*  18   42:aload_3         
	//*  19   43:instanceof      #49  <Class Map>
	//*  20   46:ifeq            92
		{
			for(obj = ((Object) (((Map)obj).entrySet().iterator())); ((Iterator) (obj)).hasNext(); zza(stringbuilder, i, s, ((Object) ((java.util.Map.Entry)((Iterator) (obj)).next()))));
	//   21   49:aload_3         
	//   22   50:checkcast       #49  <Class Map>
	//   23   53:invokeinterface #242 <Method Set Map.entrySet()>
	//   24   58:invokeinterface #75  <Method Iterator Set.iterator()>
	//   25   63:astore_3        
	//   26   64:aload_3         
	//   27   65:invokeinterface #81  <Method boolean Iterator.hasNext()>
	//   28   70:ifeq            91
	//   29   73:aload_0         
	//   30   74:iload_1         
	//   31   75:aload_2         
	//   32   76:aload_3         
	//   33   77:invokeinterface #85  <Method Object Iterator.next()>
	//   34   82:checkcast       #222 <Class java.util.Map$Entry>
	//   35   85:invokestatic    #143 <Method void zza(StringBuilder, int, String, Object)>
	//*  36   88:goto            64
			return;
	//   37   91:return          
		}
		stringbuilder.append('\n');
	//   38   92:aload_0         
	//   39   93:bipush          10
	//   40   95:invokevirtual   #245 <Method StringBuilder StringBuilder.append(char)>
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
	//   53  117:invokevirtual   #245 <Method StringBuilder StringBuilder.append(char)>
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
	//*  65  137:instanceof      #61  <Class String>
	//*  66  140:ifeq            173
		{
			stringbuilder.append(": \"");
	//   67  143:aload_0         
	//   68  144:ldc1            #247 <String ": \"">
	//   69  146:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   70  149:pop             
			stringbuilder.append(zzbea.zzaq(zzbah.zzem((String)obj)));
	//   71  150:aload_0         
	//   72  151:aload_3         
	//   73  152:checkcast       #61  <Class String>
	//   74  155:invokestatic    #251 <Method zzbah zzbah.zzem(String)>
	//   75  158:invokestatic    #257 <Method String zzbea.zzaq(zzbah)>
	//   76  161:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   77  164:pop             
			stringbuilder.append('"');
	//   78  165:aload_0         
	//   79  166:bipush          34
	//   80  168:invokevirtual   #245 <Method StringBuilder StringBuilder.append(char)>
	//   81  171:pop             
			return;
	//   82  172:return          
		}
		if(obj instanceof zzbah)
	//*  83  173:aload_3         
	//*  84  174:instanceof      #196 <Class zzbah>
	//*  85  177:ifeq            207
		{
			stringbuilder.append(": \"");
	//   86  180:aload_0         
	//   87  181:ldc1            #247 <String ": \"">
	//   88  183:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   89  186:pop             
			stringbuilder.append(zzbea.zzaq((zzbah)obj));
	//   90  187:aload_0         
	//   91  188:aload_3         
	//   92  189:checkcast       #196 <Class zzbah>
	//   93  192:invokestatic    #257 <Method String zzbea.zzaq(zzbah)>
	//   94  195:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   95  198:pop             
			stringbuilder.append('"');
	//   96  199:aload_0         
	//   97  200:bipush          34
	//   98  202:invokevirtual   #245 <Method StringBuilder StringBuilder.append(char)>
	//   99  205:pop             
			return;
	//  100  206:return          
		}
		if(obj instanceof zzbbo)
	//* 101  207:aload_3         
	//* 102  208:instanceof      #137 <Class zzbbo>
	//* 103  211:ifeq            276
		{
			stringbuilder.append(" {");
	//  104  214:aload_0         
	//  105  215:ldc2            #259 <String " {">
	//  106  218:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  107  221:pop             
			zza(((zzbcu) ((zzbbo)obj)), stringbuilder, i + 2);
	//  108  222:aload_3         
	//  109  223:checkcast       #137 <Class zzbbo>
	//  110  226:aload_0         
	//  111  227:iload_1         
	//  112  228:iconst_2        
	//  113  229:iadd            
	//  114  230:invokestatic    #21  <Method void zza(zzbcu, StringBuilder, int)>
			stringbuilder.append("\n");
	//  115  233:aload_0         
	//  116  234:ldc2            #261 <String "\n">
	//  117  237:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  118  240:pop             
			for(int k = ((int) (flag1)); k < i; k++)
	//* 119  241:iload           6
	//* 120  243:istore          4
	//* 121  245:iload           4
	//* 122  247:iload_1         
	//* 123  248:icmpge          267
				stringbuilder.append(' ');
	//  124  251:aload_0         
	//  125  252:bipush          32
	//  126  254:invokevirtual   #245 <Method StringBuilder StringBuilder.append(char)>
	//  127  257:pop             

	//  128  258:iload           4
	//  129  260:iconst_1        
	//  130  261:iadd            
	//  131  262:istore          4
	//* 132  264:goto            245
			stringbuilder.append("}");
	//  133  267:aload_0         
	//  134  268:ldc2            #263 <String "}">
	//  135  271:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  136  274:pop             
			return;
	//  137  275:return          
		}
		if(obj instanceof java.util.Map.Entry)
	//* 138  276:aload_3         
	//* 139  277:instanceof      #222 <Class java.util.Map$Entry>
	//* 140  280:ifeq            374
		{
			stringbuilder.append(" {");
	//  141  283:aload_0         
	//  142  284:ldc2            #259 <String " {">
	//  143  287:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  144  290:pop             
			s = ((String) ((java.util.Map.Entry)obj));
	//  145  291:aload_3         
	//  146  292:checkcast       #222 <Class java.util.Map$Entry>
	//  147  295:astore_2        
			int l = i + 2;
	//  148  296:iload_1         
	//  149  297:iconst_2        
	//  150  298:iadd            
	//  151  299:istore          4
			zza(stringbuilder, l, "key", ((java.util.Map.Entry) (s)).getKey());
	//  152  301:aload_0         
	//  153  302:iload           4
	//  154  304:ldc2            #265 <String "key">
	//  155  307:aload_2         
	//  156  308:invokeinterface #225 <Method Object java.util.Map$Entry.getKey()>
	//  157  313:invokestatic    #143 <Method void zza(StringBuilder, int, String, Object)>
			zza(stringbuilder, l, "value", ((java.util.Map.Entry) (s)).getValue());
	//  158  316:aload_0         
	//  159  317:iload           4
	//  160  319:ldc2            #267 <String "value">
	//  161  322:aload_2         
	//  162  323:invokeinterface #270 <Method Object java.util.Map$Entry.getValue()>
	//  163  328:invokestatic    #143 <Method void zza(StringBuilder, int, String, Object)>
			stringbuilder.append("\n");
	//  164  331:aload_0         
	//  165  332:ldc2            #261 <String "\n">
	//  166  335:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  167  338:pop             
			for(int i1 = ((int) (flag)); i1 < i; i1++)
	//* 168  339:iload           5
	//* 169  341:istore          4
	//* 170  343:iload           4
	//* 171  345:iload_1         
	//* 172  346:icmpge          365
				stringbuilder.append(' ');
	//  173  349:aload_0         
	//  174  350:bipush          32
	//  175  352:invokevirtual   #245 <Method StringBuilder StringBuilder.append(char)>
	//  176  355:pop             

	//  177  356:iload           4
	//  178  358:iconst_1        
	//  179  359:iadd            
	//  180  360:istore          4
	//* 181  362:goto            343
			stringbuilder.append("}");
	//  182  365:aload_0         
	//  183  366:ldc2            #263 <String "}">
	//  184  369:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  185  372:pop             
			return;
	//  186  373:return          
		} else
		{
			stringbuilder.append(": ");
	//  187  374:aload_0         
	//  188  375:ldc2            #272 <String ": ">
	//  189  378:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  190  381:pop             
			stringbuilder.append(obj.toString());
	//  191  382:aload_0         
	//  192  383:aload_3         
	//  193  384:invokevirtual   #273 <Method String Object.toString()>
	//  194  387:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  195  390:pop             
			return;
	//  196  391:return          
		}
	}

	private static final String zzep(String s)
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
	//*   8   12:invokevirtual   #116 <Method int String.length()>
	//*   9   15:icmpge          55
		{
			char c = s.charAt(i);
	//   10   18:aload_0         
	//   11   19:iload_2         
	//   12   20:invokevirtual   #277 <Method char String.charAt(int)>
	//   13   23:istore_1        
			if(Character.isUpperCase(c))
	//*  14   24:iload_1         
	//*  15   25:invokestatic    #283 <Method boolean Character.isUpperCase(char)>
	//*  16   28:ifeq            39
				stringbuilder.append("_");
	//   17   31:aload_3         
	//   18   32:ldc2            #285 <String "_">
	//   19   35:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			stringbuilder.append(Character.toLowerCase(c));
	//   21   39:aload_3         
	//   22   40:iload_1         
	//   23   41:invokestatic    #288 <Method char Character.toLowerCase(char)>
	//   24   44:invokevirtual   #245 <Method StringBuilder StringBuilder.append(char)>
	//   25   47:pop             
		}

	//   26   48:iload_2         
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:istore_2        
	//*  30   52:goto            10
		return stringbuilder.toString();
	//   31   55:aload_3         
	//   32   56:invokevirtual   #25  <Method String StringBuilder.toString()>
	//   33   59:areturn         
	}
}
