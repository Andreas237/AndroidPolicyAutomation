// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.mediation;

import com.google.android.gms.internal.ads.zzane;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

public class MediationServerParameters
{
	public static final class MappingException extends Exception
	{

		public MappingException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void Exception(String)>
		//    3    5:return          
		}
	}

	public static interface Parameter
		extends Annotation
	{

		public abstract String name();

		public abstract boolean required();
	}


	public MediationServerParameters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public void load(Map map)
		throws MappingException
	{
		Object obj2;
		Iterator iterator;
		obj2 = ((Object) (new HashMap()));
	//    0    0:new             #24  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void HashMap()>
	//    3    7:astore          5
		Field afield[] = ((Object)this).getClass().getFields();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #29  <Method Class Object.getClass()>
	//    6   13:invokevirtual   #35  <Method Field[] Class.getFields()>
	//    7   16:astore          4
		int i = 0;
	//    8   18:iconst_0        
	//    9   19:istore_2        
		for(int j = afield.length; i < j; i++)
	//*  10   20:aload           4
	//*  11   22:arraylength     
	//*  12   23:istore_3        
	//*  13   24:iload_2         
	//*  14   25:iload_3         
	//*  15   26:icmpge          76
		{
			Field field = afield[i];
	//   16   29:aload           4
	//   17   31:iload_2         
	//   18   32:aaload          
	//   19   33:astore          6
			Parameter parameter = (Parameter)field.getAnnotation(com/google/ads/mediation/MediationServerParameters$Parameter);
	//   20   35:aload           6
	//   21   37:ldc1            #9   <Class MediationServerParameters$Parameter>
	//   22   39:invokevirtual   #41  <Method Annotation Field.getAnnotation(Class)>
	//   23   42:checkcast       #9   <Class MediationServerParameters$Parameter>
	//   24   45:astore          7
			if(parameter != null)
	//*  25   47:aload           7
	//*  26   49:ifnull          69
				((Map) (obj2)).put(((Object) (parameter.name())), ((Object) (field)));
	//   27   52:aload           5
	//   28   54:aload           7
	//   29   56:invokeinterface #45  <Method String MediationServerParameters$Parameter.name()>
	//   30   61:aload           6
	//   31   63:invokeinterface #51  <Method Object Map.put(Object, Object)>
	//   32   68:pop             
		}

	//   33   69:iload_2         
	//   34   70:iconst_1        
	//   35   71:iadd            
	//   36   72:istore_2        
	//*  37   73:goto            24
		if(((Map) (obj2)).isEmpty())
	//*  38   76:aload           5
	//*  39   78:invokeinterface #55  <Method boolean Map.isEmpty()>
	//*  40   83:ifeq            91
			zzane.zzdk("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
	//   41   86:ldc1            #57  <String "No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.">
	//   42   88:invokestatic    #63  <Method void zzane.zzdk(String)>
		iterator = map.entrySet().iterator();
	//   43   91:aload_1         
	//   44   92:invokeinterface #67  <Method Set Map.entrySet()>
	//   45   97:invokeinterface #73  <Method Iterator Set.iterator()>
	//   46  102:astore          6
_L5:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//   47  104:aload           6
	//   48  106:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//   49  111:ifeq            377
_L1:
		Object obj;
		map = ((Map) ((java.util.Map.Entry)iterator.next()));
	//   50  114:aload           6
	//   51  116:invokeinterface #82  <Method Object Iterator.next()>
	//   52  121:checkcast       #84  <Class java.util.Map$Entry>
	//   53  124:astore_1        
		obj = ((Object) ((Field)((Map) (obj2)).remove(((java.util.Map.Entry) (map)).getKey())));
	//   54  125:aload           5
	//   55  127:aload_1         
	//   56  128:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//   57  133:invokeinterface #91  <Method Object Map.remove(Object)>
	//   58  138:checkcast       #37  <Class Field>
	//   59  141:astore          4
		if(obj == null) goto _L4; else goto _L3
	//   60  143:aload           4
	//   61  145:ifnull          278
_L3:
		((Field) (obj)).set(((Object) (this)), ((java.util.Map.Entry) (map)).getValue());
	//   62  148:aload           4
	//   63  150:aload_0         
	//   64  151:aload_1         
	//   65  152:invokeinterface #94  <Method Object java.util.Map$Entry.getValue()>
	//   66  157:invokevirtual   #98  <Method void Field.set(Object, Object)>
		  goto _L5
	//*  67  160:goto            104
_L8:
		map = ((Map) ((String)((java.util.Map.Entry) (map)).getKey()));
	//   68  163:aload_1         
	//   69  164:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//   70  169:checkcast       #100 <Class String>
	//   71  172:astore_1        
		obj = ((Object) (new StringBuilder(43 + String.valueOf(((Object) (map))).length())));
	//   72  173:new             #102 <Class StringBuilder>
	//   73  176:dup             
	//   74  177:bipush          43
	//   75  179:aload_1         
	//   76  180:invokestatic    #106 <Method String String.valueOf(Object)>
	//   77  183:invokevirtual   #110 <Method int String.length()>
	//   78  186:iadd            
	//   79  187:invokespecial   #113 <Method void StringBuilder(int)>
	//   80  190:astore          4
		((StringBuilder) (obj)).append("Server option \"");
	//   81  192:aload           4
	//   82  194:ldc1            #115 <String "Server option \"">
	//   83  196:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   84  199:pop             
		((StringBuilder) (obj)).append(((String) (map)));
	//   85  200:aload           4
	//   86  202:aload_1         
	//   87  203:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   88  206:pop             
		map = "\" could not be set: Bad Type";
	//   89  207:ldc1            #121 <String "\" could not be set: Bad Type">
	//   90  209:astore_1        
		  goto _L6
	//*  91  210:goto            260
_L7:
		map = ((Map) ((String)((java.util.Map.Entry) (map)).getKey()));
	//   92  213:aload_1         
	//   93  214:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//   94  219:checkcast       #100 <Class String>
	//   95  222:astore_1        
		obj = ((Object) (new StringBuilder(49 + String.valueOf(((Object) (map))).length())));
	//   96  223:new             #102 <Class StringBuilder>
	//   97  226:dup             
	//   98  227:bipush          49
	//   99  229:aload_1         
	//  100  230:invokestatic    #106 <Method String String.valueOf(Object)>
	//  101  233:invokevirtual   #110 <Method int String.length()>
	//  102  236:iadd            
	//  103  237:invokespecial   #113 <Method void StringBuilder(int)>
	//  104  240:astore          4
		((StringBuilder) (obj)).append("Server option \"");
	//  105  242:aload           4
	//  106  244:ldc1            #115 <String "Server option \"">
	//  107  246:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//  108  249:pop             
		((StringBuilder) (obj)).append(((String) (map)));
	//  109  250:aload           4
	//  110  252:aload_1         
	//  111  253:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//  112  256:pop             
		map = "\" could not be set: Illegal Access";
	//  113  257:ldc1            #123 <String "\" could not be set: Illegal Access">
	//  114  259:astore_1        
_L6:
		((StringBuilder) (obj)).append(((String) (map)));
	//  115  260:aload           4
	//  116  262:aload_1         
	//  117  263:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//  118  266:pop             
		zzane.zzdk(((StringBuilder) (obj)).toString());
	//  119  267:aload           4
	//  120  269:invokevirtual   #126 <Method String StringBuilder.toString()>
	//  121  272:invokestatic    #63  <Method void zzane.zzdk(String)>
		  goto _L5
	//* 122  275:goto            104
_L4:
		String s = (String)((java.util.Map.Entry) (map)).getKey();
	//  123  278:aload_1         
	//  124  279:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//  125  284:checkcast       #100 <Class String>
	//  126  287:astore          4
		map = ((Map) ((String)((java.util.Map.Entry) (map)).getValue()));
	//  127  289:aload_1         
	//  128  290:invokeinterface #94  <Method Object java.util.Map$Entry.getValue()>
	//  129  295:checkcast       #100 <Class String>
	//  130  298:astore_1        
		StringBuilder stringbuilder1 = new StringBuilder(31 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (map))).length());
	//  131  299:new             #102 <Class StringBuilder>
	//  132  302:dup             
	//  133  303:bipush          31
	//  134  305:aload           4
	//  135  307:invokestatic    #106 <Method String String.valueOf(Object)>
	//  136  310:invokevirtual   #110 <Method int String.length()>
	//  137  313:iadd            
	//  138  314:aload_1         
	//  139  315:invokestatic    #106 <Method String String.valueOf(Object)>
	//  140  318:invokevirtual   #110 <Method int String.length()>
	//  141  321:iadd            
	//  142  322:invokespecial   #113 <Method void StringBuilder(int)>
	//  143  325:astore          7
		stringbuilder1.append("Unexpected server option: ");
	//  144  327:aload           7
	//  145  329:ldc1            #128 <String "Unexpected server option: ">
	//  146  331:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//  147  334:pop             
		stringbuilder1.append(s);
	//  148  335:aload           7
	//  149  337:aload           4
	//  150  339:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//  151  342:pop             
		stringbuilder1.append(" = \"");
	//  152  343:aload           7
	//  153  345:ldc1            #130 <String " = \"">
	//  154  347:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//  155  350:pop             
		stringbuilder1.append(((String) (map)));
	//  156  351:aload           7
	//  157  353:aload_1         
	//  158  354:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//  159  357:pop             
		stringbuilder1.append("\"");
	//  160  358:aload           7
	//  161  360:ldc1            #132 <String "\"">
	//  162  362:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//  163  365:pop             
		zzane.zzck(stringbuilder1.toString());
	//  164  366:aload           7
	//  165  368:invokevirtual   #126 <Method String StringBuilder.toString()>
	//  166  371:invokestatic    #135 <Method void zzane.zzck(String)>
		  goto _L5
	//* 167  374:goto            104
_L2:
		StringBuilder stringbuilder = new StringBuilder();
	//  168  377:new             #102 <Class StringBuilder>
	//  169  380:dup             
	//  170  381:invokespecial   #136 <Method void StringBuilder()>
	//  171  384:astore          4
		obj2 = ((Object) (((Map) (obj2)).values().iterator()));
	//  172  386:aload           5
	//  173  388:invokeinterface #140 <Method Collection Map.values()>
	//  174  393:invokeinterface #143 <Method Iterator Collection.iterator()>
	//  175  398:astore          5
		do
		{
			if(!((Iterator) (obj2)).hasNext())
				break;
	//  176  400:aload           5
	//  177  402:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//  178  407:ifeq            530
			Field field1 = (Field)((Iterator) (obj2)).next();
	//  179  410:aload           5
	//  180  412:invokeinterface #82  <Method Object Iterator.next()>
	//  181  417:checkcast       #37  <Class Field>
	//  182  420:astore          6
			if(((Parameter)field1.getAnnotation(com/google/ads/mediation/MediationServerParameters$Parameter)).required())
	//* 183  422:aload           6
	//* 184  424:ldc1            #9   <Class MediationServerParameters$Parameter>
	//* 185  426:invokevirtual   #41  <Method Annotation Field.getAnnotation(Class)>
	//* 186  429:checkcast       #9   <Class MediationServerParameters$Parameter>
	//* 187  432:invokeinterface #146 <Method boolean MediationServerParameters$Parameter.required()>
	//* 188  437:ifeq            400
			{
				map = ((Map) (String.valueOf(((Object) (((Parameter)field1.getAnnotation(com/google/ads/mediation/MediationServerParameters$Parameter)).name())))));
	//  189  440:aload           6
	//  190  442:ldc1            #9   <Class MediationServerParameters$Parameter>
	//  191  444:invokevirtual   #41  <Method Annotation Field.getAnnotation(Class)>
	//  192  447:checkcast       #9   <Class MediationServerParameters$Parameter>
	//  193  450:invokeinterface #45  <Method String MediationServerParameters$Parameter.name()>
	//  194  455:invokestatic    #106 <Method String String.valueOf(Object)>
	//  195  458:astore_1        
				if(((String) (map)).length() != 0)
	//* 196  459:aload_1         
	//* 197  460:invokevirtual   #110 <Method int String.length()>
	//* 198  463:ifeq            476
					map = ((Map) ("Required server option missing: ".concat(((String) (map)))));
	//  199  466:ldc1            #148 <String "Required server option missing: ">
	//  200  468:aload_1         
	//  201  469:invokevirtual   #152 <Method String String.concat(String)>
	//  202  472:astore_1        
				else
	//* 203  473:goto            486
					map = ((Map) (new String("Required server option missing: ")));
	//  204  476:new             #100 <Class String>
	//  205  479:dup             
	//  206  480:ldc1            #148 <String "Required server option missing: ">
	//  207  482:invokespecial   #154 <Method void String(String)>
	//  208  485:astore_1        
				zzane.zzdk(((String) (map)));
	//  209  486:aload_1         
	//  210  487:invokestatic    #63  <Method void zzane.zzdk(String)>
				if(stringbuilder.length() > 0)
	//* 211  490:aload           4
	//* 212  492:invokevirtual   #155 <Method int StringBuilder.length()>
	//* 213  495:ifle            506
					stringbuilder.append(", ");
	//  214  498:aload           4
	//  215  500:ldc1            #157 <String ", ">
	//  216  502:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//  217  505:pop             
				stringbuilder.append(((Parameter)field1.getAnnotation(com/google/ads/mediation/MediationServerParameters$Parameter)).name());
	//  218  506:aload           4
	//  219  508:aload           6
	//  220  510:ldc1            #9   <Class MediationServerParameters$Parameter>
	//  221  512:invokevirtual   #41  <Method Annotation Field.getAnnotation(Class)>
	//  222  515:checkcast       #9   <Class MediationServerParameters$Parameter>
	//  223  518:invokeinterface #45  <Method String MediationServerParameters$Parameter.name()>
	//  224  523:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//  225  526:pop             
			}
		} while(true);
	//  226  527:goto            400
		if(stringbuilder.length() > 0)
	//* 227  530:aload           4
	//* 228  532:invokevirtual   #155 <Method int StringBuilder.length()>
	//* 229  535:ifle            583
		{
			map = ((Map) (String.valueOf(((Object) (stringbuilder.toString())))));
	//  230  538:aload           4
	//  231  540:invokevirtual   #126 <Method String StringBuilder.toString()>
	//  232  543:invokestatic    #106 <Method String String.valueOf(Object)>
	//  233  546:astore_1        
			if(((String) (map)).length() != 0)
	//* 234  547:aload_1         
	//* 235  548:invokevirtual   #110 <Method int String.length()>
	//* 236  551:ifeq            564
				map = ((Map) ("Required server option(s) missing: ".concat(((String) (map)))));
	//  237  554:ldc1            #159 <String "Required server option(s) missing: ">
	//  238  556:aload_1         
	//  239  557:invokevirtual   #152 <Method String String.concat(String)>
	//  240  560:astore_1        
			else
	//* 241  561:goto            574
				map = ((Map) (new String("Required server option(s) missing: ")));
	//  242  564:new             #100 <Class String>
	//  243  567:dup             
	//  244  568:ldc1            #159 <String "Required server option(s) missing: ">
	//  245  570:invokespecial   #154 <Method void String(String)>
	//  246  573:astore_1        
			throw new MappingException(((String) (map)));
	//  247  574:new             #6   <Class MediationServerParameters$MappingException>
	//  248  577:dup             
	//  249  578:aload_1         
	//  250  579:invokespecial   #160 <Method void MediationServerParameters$MappingException(String)>
	//  251  582:athrow          
		} else
		{
			return;
	//  252  583:return          
		}
		Object obj1;
		obj1;
	//  253  584:astore          4
		  goto _L7
	//* 254  586:goto            213
		obj1;
	//  255  589:astore          4
		  goto _L8
	//* 256  591:goto            163
	}
}
