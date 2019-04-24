// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.squareup.leakcanary:
//			Exclusion

public final class ExcludedRefs
	implements Serializable
{
	public static interface Builder
	{

		public abstract ExcludedRefs build();

		public abstract BuilderWithParams clazz(String s);

		public abstract BuilderWithParams instanceField(String s, String s1);

		public abstract BuilderWithParams staticField(String s, String s1);

		public abstract BuilderWithParams thread(String s);
	}


	ExcludedRefs(BuilderWithParams builderwithparams)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	/* block-local class not found */
	class BuilderWithParams {}

		fieldNameByClassName = unmodifiableRefStringMap(BuilderWithParams.access._mth000(builderwithparams));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #29  <Method Map ExcludedRefs$BuilderWithParams.access$000(ExcludedRefs$BuilderWithParams)>
	//    6   10:invokespecial   #33  <Method Map unmodifiableRefStringMap(Map)>
	//    7   13:putfield        #35  <Field Map fieldNameByClassName>
		staticFieldNameByClassName = unmodifiableRefStringMap(BuilderWithParams.access._mth100(builderwithparams));
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokestatic    #38  <Method Map ExcludedRefs$BuilderWithParams.access$100(ExcludedRefs$BuilderWithParams)>
	//   12   22:invokespecial   #33  <Method Map unmodifiableRefStringMap(Map)>
	//   13   25:putfield        #40  <Field Map staticFieldNameByClassName>
		threadNames = unmodifiableRefMap(BuilderWithParams.access._mth200(builderwithparams));
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokestatic    #43  <Method Map ExcludedRefs$BuilderWithParams.access$200(ExcludedRefs$BuilderWithParams)>
	//   18   34:invokespecial   #46  <Method Map unmodifiableRefMap(Map)>
	//   19   37:putfield        #48  <Field Map threadNames>
		classNames = unmodifiableRefMap(BuilderWithParams.access._mth300(builderwithparams));
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:invokestatic    #51  <Method Map ExcludedRefs$BuilderWithParams.access$300(ExcludedRefs$BuilderWithParams)>
	//   24   46:invokespecial   #46  <Method Map unmodifiableRefMap(Map)>
	//   25   49:putfield        #53  <Field Map classNames>
	//   26   52:return          
	}

	public static Builder builder()
	{
		return ((Builder) (new BuilderWithParams()));
	//    0    0:new             #11  <Class ExcludedRefs$BuilderWithParams>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void ExcludedRefs$BuilderWithParams()>
	//    3    7:areturn         
	}

	private Map unmodifiableRefMap(Map map)
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #59  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void LinkedHashMap()>
	//    3    7:astore_2        
	/* block-local class not found */
	class ParamsBuilder {}

		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); ((Map) (linkedhashmap)).put(entry.getKey(), ((Object) (new Exclusion((ParamsBuilder)entry.getValue())))))
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #66  <Method Set Map.entrySet()>
	//*   6   14:invokeinterface #72  <Method Iterator Set.iterator()>
	//*   7   19:astore_1        
	//*   8   20:aload_1         
	//*   9   21:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            71
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   11   29:aload_1         
	//   12   30:invokeinterface #82  <Method Object Iterator.next()>
	//   13   35:checkcast       #84  <Class java.util.Map$Entry>
	//   14   38:astore_3        

	//   15   39:aload_2         
	//   16   40:aload_3         
	//   17   41:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//   18   46:new             #89  <Class Exclusion>
	//   19   49:dup             
	//   20   50:aload_3         
	//   21   51:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//   22   56:checkcast       #13  <Class ExcludedRefs$ParamsBuilder>
	//   23   59:invokespecial   #95  <Method void Exclusion(ExcludedRefs$ParamsBuilder)>
	//   24   62:invokeinterface #99  <Method Object Map.put(Object, Object)>
	//   25   67:pop             
	//*  26   68:goto            20
		return Collections.unmodifiableMap(((Map) (linkedhashmap)));
	//   27   71:aload_2         
	//   28   72:invokestatic    #104 <Method Map Collections.unmodifiableMap(Map)>
	//   29   75:areturn         
	}

	private Map unmodifiableRefStringMap(Map map)
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #59  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void LinkedHashMap()>
	//    3    7:astore_2        
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); linkedhashmap.put(entry.getKey(), ((Object) (unmodifiableRefMap((Map)entry.getValue())))))
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #66  <Method Set Map.entrySet()>
	//*   6   14:invokeinterface #72  <Method Iterator Set.iterator()>
	//*   7   19:astore_1        
	//*   8   20:aload_1         
	//*   9   21:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            66
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   11   29:aload_1         
	//   12   30:invokeinterface #82  <Method Object Iterator.next()>
	//   13   35:checkcast       #84  <Class java.util.Map$Entry>
	//   14   38:astore_3        

	//   15   39:aload_2         
	//   16   40:aload_3         
	//   17   41:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//   18   46:aload_0         
	//   19   47:aload_3         
	//   20   48:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//   21   53:checkcast       #62  <Class Map>
	//   22   56:invokespecial   #46  <Method Map unmodifiableRefMap(Map)>
	//   23   59:invokevirtual   #107 <Method Object LinkedHashMap.put(Object, Object)>
	//   24   62:pop             
	//*  25   63:goto            20
		return Collections.unmodifiableMap(((Map) (linkedhashmap)));
	//   26   66:aload_2         
	//   27   67:invokestatic    #104 <Method Map Collections.unmodifiableMap(Map)>
	//   28   70:areturn         
	}

	public String toString()
	{
		String s = "";
	//    0    0:ldc1            #112 <String "">
	//    1    2:astore_1        
		for(Iterator iterator = fieldNameByClassName.entrySet().iterator(); iterator.hasNext();)
	//*   2    3:aload_0         
	//*   3    4:getfield        #35  <Field Map fieldNameByClassName>
	//*   4    7:invokeinterface #66  <Method Set Map.entrySet()>
	//*   5   12:invokeinterface #72  <Method Iterator Set.iterator()>
	//*   6   17:astore_3        
	//*   7   18:aload_3         
	//*   8   19:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*   9   24:ifeq            174
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   10   27:aload_3         
	//   11   28:invokeinterface #82  <Method Object Iterator.next()>
	//   12   33:checkcast       #84  <Class java.util.Map$Entry>
	//   13   36:astore_2        
			String s5 = (String)entry.getKey();
	//   14   37:aload_2         
	//   15   38:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//   16   43:checkcast       #114 <Class String>
	//   17   46:astore          4
			Iterator iterator4 = ((Map)entry.getValue()).entrySet().iterator();
	//   18   48:aload_2         
	//   19   49:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//   20   54:checkcast       #62  <Class Map>
	//   21   57:invokeinterface #66  <Method Set Map.entrySet()>
	//   22   62:invokeinterface #72  <Method Iterator Set.iterator()>
	//   23   67:astore          5
			while(iterator4.hasNext()) 
	//*  24   69:aload           5
	//*  25   71:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*  26   76:ifeq            171
			{
				java.util.Map.Entry entry4 = (java.util.Map.Entry)iterator4.next();
	//   27   79:aload           5
	//   28   81:invokeinterface #82  <Method Object Iterator.next()>
	//   29   86:checkcast       #84  <Class java.util.Map$Entry>
	//   30   89:astore          6
				String s1;
				if(((Exclusion)entry4.getValue()).alwaysExclude)
	//*  31   91:aload           6
	//*  32   93:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//*  33   98:checkcast       #89  <Class Exclusion>
	//*  34  101:getfield        #118 <Field boolean Exclusion.alwaysExclude>
	//*  35  104:ifeq            113
					s1 = " (always)";
	//   36  107:ldc1            #120 <String " (always)">
	//   37  109:astore_2        
				else
	//*  38  110:goto            116
					s1 = "";
	//   39  113:ldc1            #112 <String "">
	//   40  115:astore_2        
				s = (new StringBuilder()).append(s).append("| Field: ").append(s5).append(".").append((String)entry4.getKey()).append(s1).append("\n").toString();
	//   41  116:new             #122 <Class StringBuilder>
	//   42  119:dup             
	//   43  120:invokespecial   #123 <Method void StringBuilder()>
	//   44  123:aload_1         
	//   45  124:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   46  127:ldc1            #129 <String "| Field: ">
	//   47  129:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   48  132:aload           4
	//   49  134:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   50  137:ldc1            #131 <String ".">
	//   51  139:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   52  142:aload           6
	//   53  144:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//   54  149:checkcast       #114 <Class String>
	//   55  152:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   56  155:aload_2         
	//   57  156:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   58  159:ldc1            #133 <String "\n">
	//   59  161:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   60  164:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   61  167:astore_1        
			}
		}

	//*  62  168:goto            69
	//*  63  171:goto            18
		for(Iterator iterator1 = staticFieldNameByClassName.entrySet().iterator(); iterator1.hasNext();)
	//*  64  174:aload_0         
	//*  65  175:getfield        #40  <Field Map staticFieldNameByClassName>
	//*  66  178:invokeinterface #66  <Method Set Map.entrySet()>
	//*  67  183:invokeinterface #72  <Method Iterator Set.iterator()>
	//*  68  188:astore_3        
	//*  69  189:aload_3         
	//*  70  190:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*  71  195:ifeq            345
		{
			java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator1.next();
	//   72  198:aload_3         
	//   73  199:invokeinterface #82  <Method Object Iterator.next()>
	//   74  204:checkcast       #84  <Class java.util.Map$Entry>
	//   75  207:astore_2        
			String s6 = (String)entry1.getKey();
	//   76  208:aload_2         
	//   77  209:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//   78  214:checkcast       #114 <Class String>
	//   79  217:astore          4
			Iterator iterator5 = ((Map)entry1.getValue()).entrySet().iterator();
	//   80  219:aload_2         
	//   81  220:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//   82  225:checkcast       #62  <Class Map>
	//   83  228:invokeinterface #66  <Method Set Map.entrySet()>
	//   84  233:invokeinterface #72  <Method Iterator Set.iterator()>
	//   85  238:astore          5
			while(iterator5.hasNext()) 
	//*  86  240:aload           5
	//*  87  242:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//*  88  247:ifeq            342
			{
				java.util.Map.Entry entry5 = (java.util.Map.Entry)iterator5.next();
	//   89  250:aload           5
	//   90  252:invokeinterface #82  <Method Object Iterator.next()>
	//   91  257:checkcast       #84  <Class java.util.Map$Entry>
	//   92  260:astore          6
				String s2;
				if(((Exclusion)entry5.getValue()).alwaysExclude)
	//*  93  262:aload           6
	//*  94  264:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//*  95  269:checkcast       #89  <Class Exclusion>
	//*  96  272:getfield        #118 <Field boolean Exclusion.alwaysExclude>
	//*  97  275:ifeq            284
					s2 = " (always)";
	//   98  278:ldc1            #120 <String " (always)">
	//   99  280:astore_2        
				else
	//* 100  281:goto            287
					s2 = "";
	//  101  284:ldc1            #112 <String "">
	//  102  286:astore_2        
				s = (new StringBuilder()).append(s).append("| Static field: ").append(s6).append(".").append((String)entry5.getKey()).append(s2).append("\n").toString();
	//  103  287:new             #122 <Class StringBuilder>
	//  104  290:dup             
	//  105  291:invokespecial   #123 <Method void StringBuilder()>
	//  106  294:aload_1         
	//  107  295:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  108  298:ldc1            #137 <String "| Static field: ">
	//  109  300:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  110  303:aload           4
	//  111  305:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  112  308:ldc1            #131 <String ".">
	//  113  310:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  114  313:aload           6
	//  115  315:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//  116  320:checkcast       #114 <Class String>
	//  117  323:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  118  326:aload_2         
	//  119  327:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  120  330:ldc1            #133 <String "\n">
	//  121  332:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  122  335:invokevirtual   #135 <Method String StringBuilder.toString()>
	//  123  338:astore_1        
			}
		}

	//* 124  339:goto            240
	//* 125  342:goto            189
		for(Iterator iterator2 = threadNames.entrySet().iterator(); iterator2.hasNext();)
	//* 126  345:aload_0         
	//* 127  346:getfield        #48  <Field Map threadNames>
	//* 128  349:invokeinterface #66  <Method Set Map.entrySet()>
	//* 129  354:invokeinterface #72  <Method Iterator Set.iterator()>
	//* 130  359:astore_3        
	//* 131  360:aload_3         
	//* 132  361:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//* 133  366:ifeq            450
		{
			java.util.Map.Entry entry2 = (java.util.Map.Entry)iterator2.next();
	//  134  369:aload_3         
	//  135  370:invokeinterface #82  <Method Object Iterator.next()>
	//  136  375:checkcast       #84  <Class java.util.Map$Entry>
	//  137  378:astore          4
			String s3;
			if(((Exclusion)entry2.getValue()).alwaysExclude)
	//* 138  380:aload           4
	//* 139  382:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//* 140  387:checkcast       #89  <Class Exclusion>
	//* 141  390:getfield        #118 <Field boolean Exclusion.alwaysExclude>
	//* 142  393:ifeq            402
				s3 = " (always)";
	//  143  396:ldc1            #120 <String " (always)">
	//  144  398:astore_2        
			else
	//* 145  399:goto            405
				s3 = "";
	//  146  402:ldc1            #112 <String "">
	//  147  404:astore_2        
			s = (new StringBuilder()).append(s).append("| Thread:").append((String)entry2.getKey()).append(s3).append("\n").toString();
	//  148  405:new             #122 <Class StringBuilder>
	//  149  408:dup             
	//  150  409:invokespecial   #123 <Method void StringBuilder()>
	//  151  412:aload_1         
	//  152  413:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  153  416:ldc1            #139 <String "| Thread:">
	//  154  418:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  155  421:aload           4
	//  156  423:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//  157  428:checkcast       #114 <Class String>
	//  158  431:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  159  434:aload_2         
	//  160  435:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  161  438:ldc1            #133 <String "\n">
	//  162  440:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  163  443:invokevirtual   #135 <Method String StringBuilder.toString()>
	//  164  446:astore_1        
		}

	//* 165  447:goto            360
		for(Iterator iterator3 = classNames.entrySet().iterator(); iterator3.hasNext();)
	//* 166  450:aload_0         
	//* 167  451:getfield        #53  <Field Map classNames>
	//* 168  454:invokeinterface #66  <Method Set Map.entrySet()>
	//* 169  459:invokeinterface #72  <Method Iterator Set.iterator()>
	//* 170  464:astore_3        
	//* 171  465:aload_3         
	//* 172  466:invokeinterface #78  <Method boolean Iterator.hasNext()>
	//* 173  471:ifeq            555
		{
			java.util.Map.Entry entry3 = (java.util.Map.Entry)iterator3.next();
	//  174  474:aload_3         
	//  175  475:invokeinterface #82  <Method Object Iterator.next()>
	//  176  480:checkcast       #84  <Class java.util.Map$Entry>
	//  177  483:astore          4
			String s4;
			if(((Exclusion)entry3.getValue()).alwaysExclude)
	//* 178  485:aload           4
	//* 179  487:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//* 180  492:checkcast       #89  <Class Exclusion>
	//* 181  495:getfield        #118 <Field boolean Exclusion.alwaysExclude>
	//* 182  498:ifeq            507
				s4 = " (always)";
	//  183  501:ldc1            #120 <String " (always)">
	//  184  503:astore_2        
			else
	//* 185  504:goto            510
				s4 = "";
	//  186  507:ldc1            #112 <String "">
	//  187  509:astore_2        
			s = (new StringBuilder()).append(s).append("| Class:").append((String)entry3.getKey()).append(s4).append("\n").toString();
	//  188  510:new             #122 <Class StringBuilder>
	//  189  513:dup             
	//  190  514:invokespecial   #123 <Method void StringBuilder()>
	//  191  517:aload_1         
	//  192  518:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  193  521:ldc1            #141 <String "| Class:">
	//  194  523:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  195  526:aload           4
	//  196  528:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//  197  533:checkcast       #114 <Class String>
	//  198  536:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  199  539:aload_2         
	//  200  540:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  201  543:ldc1            #133 <String "\n">
	//  202  545:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  203  548:invokevirtual   #135 <Method String StringBuilder.toString()>
	//  204  551:astore_1        
		}

	//* 205  552:goto            465
		return s;
	//  206  555:aload_1         
	//  207  556:areturn         
	}

	public final Map classNames;
	public final Map fieldNameByClassName;
	public final Map staticFieldNameByClassName;
	public final Map threadNames;
}
