// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.tool.xml.Tag;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.css:
//			CssFiles, CssUtils, CssFile, CssRule

public class CssFilesImpl
	implements CssFiles
{

	public CssFilesImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		files = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List files>
		utils = CssUtils.getInstance();
	//    7   15:aload_0         
	//    8   16:invokestatic    #26  <Method CssUtils CssUtils.getInstance()>
	//    9   19:putfield        #28  <Field CssUtils utils>
	//   10   22:return          
	}

	public CssFilesImpl(CssFile cssfile)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void CssFilesImpl()>
		add(cssfile);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #34  <Method void add(CssFile)>
	//    5    9:return          
	}

	public void add(CssFile cssfile)
	{
		if(cssfile != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			files.add(((Object) (cssfile)));
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field List files>
	//    4    8:aload_1         
	//    5    9:invokeinterface #39  <Method boolean List.add(Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void clear()
	{
		Iterator iterator = files.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List files>
	//    2    4:invokeinterface #44  <Method Iterator List.iterator()>
	//    3    9:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4   10:aload_1         
	//    5   11:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            45
			if(!((CssFile)iterator.next()).isPersistent())
	//*   7   19:aload_1         
	//*   8   20:invokeinterface #54  <Method Object Iterator.next()>
	//*   9   25:checkcast       #56  <Class CssFile>
	//*  10   28:invokeinterface #59  <Method boolean CssFile.isPersistent()>
	//*  11   33:ifne            10
				iterator.remove();
	//   12   36:aload_1         
	//   13   37:invokeinterface #62  <Method void Iterator.remove()>
		} while(true);
	//   14   42:goto            10
	//   15   45:return          
	}

	public Map getCSS(Tag tag)
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #66  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void LinkedHashMap()>
	//    3    7:astore_2        
		populateCss(tag, ((Map) (linkedhashmap)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #71  <Method void populateCss(Tag, Map)>
		return ((Map) (linkedhashmap));
	//    8   14:aload_2         
	//    9   15:areturn         
	}

	public boolean hasFiles()
	{
		return !files.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List files>
	//    2    4:invokeinterface #77  <Method boolean List.isEmpty()>
	//    3    9:ifne            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	public void populateCss(Tag tag, Map map)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #17  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void ArrayList()>
	//    3    7:astore_3        
		for(Iterator iterator = files.iterator(); iterator.hasNext(); ((List) (arraylist)).addAll(((java.util.Collection) (((CssFile)iterator.next()).get(tag)))));
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field List files>
	//    6   12:invokeinterface #44  <Method Iterator List.iterator()>
	//    7   17:astore          4
	//    8   19:aload           4
	//    9   21:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            55
	//   11   29:aload_3         
	//   12   30:aload           4
	//   13   32:invokeinterface #54  <Method Object Iterator.next()>
	//   14   37:checkcast       #56  <Class CssFile>
	//   15   40:aload_1         
	//   16   41:invokeinterface #81  <Method List CssFile.get(Tag)>
	//   17   46:invokeinterface #85  <Method boolean List.addAll(java.util.Collection)>
	//   18   51:pop             
	//*  19   52:goto            19
		Collections.sort(((List) (arraylist)));
	//   20   55:aload_3         
	//   21   56:invokestatic    #91  <Method void Collections.sort(List)>
		for(tag = ((Tag) (((List) (arraylist)).iterator())); ((Iterator) (tag)).hasNext(); populateOneCss(map, ((CssRule)((Iterator) (tag)).next()).getNormalDeclarations()));
	//   22   59:aload_3         
	//   23   60:invokeinterface #44  <Method Iterator List.iterator()>
	//   24   65:astore_1        
	//   25   66:aload_1         
	//   26   67:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//   27   72:ifeq            95
	//   28   75:aload_0         
	//   29   76:aload_2         
	//   30   77:aload_1         
	//   31   78:invokeinterface #54  <Method Object Iterator.next()>
	//   32   83:checkcast       #93  <Class CssRule>
	//   33   86:invokevirtual   #97  <Method Map CssRule.getNormalDeclarations()>
	//   34   89:invokevirtual   #101 <Method void populateOneCss(Map, Map)>
	//*  35   92:goto            66
		for(tag = ((Tag) (((List) (arraylist)).iterator())); ((Iterator) (tag)).hasNext(); populateOneCss(map, ((CssRule)((Iterator) (tag)).next()).getImportantDeclarations()));
	//   36   95:aload_3         
	//   37   96:invokeinterface #44  <Method Iterator List.iterator()>
	//   38  101:astore_1        
	//   39  102:aload_1         
	//   40  103:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//   41  108:ifeq            131
	//   42  111:aload_0         
	//   43  112:aload_2         
	//   44  113:aload_1         
	//   45  114:invokeinterface #54  <Method Object Iterator.next()>
	//   46  119:checkcast       #93  <Class CssRule>
	//   47  122:invokevirtual   #104 <Method Map CssRule.getImportantDeclarations()>
	//   48  125:invokevirtual   #101 <Method void populateOneCss(Map, Map)>
	//*  49  128:goto            102
	//   50  131:return          
	}

	public void populateOneCss(Map map, Map map1)
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #66  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void LinkedHashMap()>
	//    3    7:astore_3        
		map1 = ((Map) (map1.entrySet().iterator()));
	//    4    8:aload_2         
	//    5    9:invokeinterface #111 <Method Set Map.entrySet()>
	//    6   14:invokeinterface #114 <Method Iterator Set.iterator()>
	//    7   19:astore_2        
label0:
		do
		{
			if(!((Iterator) (map1)).hasNext())
				break;
	//    8   20:aload_2         
	//    9   21:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            670
			Object obj1 = ((Object) ((java.util.Map.Entry)((Iterator) (map1)).next()));
	//   11   29:aload_2         
	//   12   30:invokeinterface #54  <Method Object Iterator.next()>
	//   13   35:checkcast       #116 <Class java.util.Map$Entry>
	//   14   38:astore          5
			Object obj = ((Object) (utils.stripDoubleSpacesTrimAndToLowerCase((String)((java.util.Map.Entry) (obj1)).getKey())));
	//   15   40:aload_0         
	//   16   41:getfield        #28  <Field CssUtils utils>
	//   17   44:aload           5
	//   18   46:invokeinterface #119 <Method Object java.util.Map$Entry.getKey()>
	//   19   51:checkcast       #121 <Class String>
	//   20   54:invokevirtual   #125 <Method String CssUtils.stripDoubleSpacesTrimAndToLowerCase(String)>
	//   21   57:astore          4
			obj1 = ((Object) (utils.stripDoubleSpacesAndTrim((String)((java.util.Map.Entry) (obj1)).getValue())));
	//   22   59:aload_0         
	//   23   60:getfield        #28  <Field CssUtils utils>
	//   24   63:aload           5
	//   25   65:invokeinterface #128 <Method Object java.util.Map$Entry.getValue()>
	//   26   70:checkcast       #121 <Class String>
	//   27   73:invokevirtual   #131 <Method String CssUtils.stripDoubleSpacesAndTrim(String)>
	//   28   76:astore          5
			if("border".equalsIgnoreCase(((String) (obj))))
	//*  29   78:ldc1            #133 <String "border">
	//*  30   80:aload           4
	//*  31   82:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//*  32   85:ifeq            106
			{
				((Map) (linkedhashmap)).putAll(utils.parseBorder(((String) (obj1))));
	//   33   88:aload_3         
	//   34   89:aload_0         
	//   35   90:getfield        #28  <Field CssUtils utils>
	//   36   93:aload           5
	//   37   95:invokevirtual   #141 <Method Map CssUtils.parseBorder(String)>
	//   38   98:invokeinterface #145 <Method void Map.putAll(Map)>
				continue;
	//   39  103:goto            20
			}
			if("border-top".equalsIgnoreCase(((String) (obj))))
	//*  40  106:ldc1            #147 <String "border-top">
	//*  41  108:aload           4
	//*  42  110:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//*  43  113:ifeq            136
			{
				((Map) (linkedhashmap)).putAll(utils.parseBorder(((String) (obj1)), "border-top"));
	//   44  116:aload_3         
	//   45  117:aload_0         
	//   46  118:getfield        #28  <Field CssUtils utils>
	//   47  121:aload           5
	//   48  123:ldc1            #147 <String "border-top">
	//   49  125:invokevirtual   #150 <Method Map CssUtils.parseBorder(String, String)>
	//   50  128:invokeinterface #145 <Method void Map.putAll(Map)>
				continue;
	//   51  133:goto            20
			}
			if("border-bottom".equalsIgnoreCase(((String) (obj))))
	//*  52  136:ldc1            #152 <String "border-bottom">
	//*  53  138:aload           4
	//*  54  140:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//*  55  143:ifeq            166
			{
				((Map) (linkedhashmap)).putAll(utils.parseBorder(((String) (obj1)), "border-bottom"));
	//   56  146:aload_3         
	//   57  147:aload_0         
	//   58  148:getfield        #28  <Field CssUtils utils>
	//   59  151:aload           5
	//   60  153:ldc1            #152 <String "border-bottom">
	//   61  155:invokevirtual   #150 <Method Map CssUtils.parseBorder(String, String)>
	//   62  158:invokeinterface #145 <Method void Map.putAll(Map)>
				continue;
	//   63  163:goto            20
			}
			if("border-left".equalsIgnoreCase(((String) (obj))))
	//*  64  166:ldc1            #154 <String "border-left">
	//*  65  168:aload           4
	//*  66  170:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//*  67  173:ifeq            196
			{
				((Map) (linkedhashmap)).putAll(utils.parseBorder(((String) (obj1)), "border-left"));
	//   68  176:aload_3         
	//   69  177:aload_0         
	//   70  178:getfield        #28  <Field CssUtils utils>
	//   71  181:aload           5
	//   72  183:ldc1            #154 <String "border-left">
	//   73  185:invokevirtual   #150 <Method Map CssUtils.parseBorder(String, String)>
	//   74  188:invokeinterface #145 <Method void Map.putAll(Map)>
				continue;
	//   75  193:goto            20
			}
			if("border-right".equalsIgnoreCase(((String) (obj))))
	//*  76  196:ldc1            #156 <String "border-right">
	//*  77  198:aload           4
	//*  78  200:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//*  79  203:ifeq            226
			{
				((Map) (linkedhashmap)).putAll(utils.parseBorder(((String) (obj1)), "border-right"));
	//   80  206:aload_3         
	//   81  207:aload_0         
	//   82  208:getfield        #28  <Field CssUtils utils>
	//   83  211:aload           5
	//   84  213:ldc1            #156 <String "border-right">
	//   85  215:invokevirtual   #150 <Method Map CssUtils.parseBorder(String, String)>
	//   86  218:invokeinterface #145 <Method void Map.putAll(Map)>
				continue;
	//   87  223:goto            20
			}
			if("margin".equalsIgnoreCase(((String) (obj))))
	//*  88  226:ldc1            #158 <String "margin">
	//*  89  228:aload           4
	//*  90  230:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//*  91  233:ifeq            319
			{
				obj = ((Object) (utils.parseBoxValues(((String) (obj1)), "margin-", "")));
	//   92  236:aload_0         
	//   93  237:getfield        #28  <Field CssUtils utils>
	//   94  240:aload           5
	//   95  242:ldc1            #160 <String "margin-">
	//   96  244:ldc1            #162 <String "">
	//   97  246:invokevirtual   #166 <Method Map CssUtils.parseBoxValues(String, String, String)>
	//   98  249:astore          4
				obj1 = ((Object) (((Map) (obj)).keySet().iterator()));
	//   99  251:aload           4
	//  100  253:invokeinterface #169 <Method Set Map.keySet()>
	//  101  258:invokeinterface #114 <Method Iterator Set.iterator()>
	//  102  263:astore          5
				do
				{
					String s;
					do
					{
						if(!((Iterator) (obj1)).hasNext())
							continue label0;
	//  103  265:aload           5
	//  104  267:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//  105  272:ifeq            20
						s = (String)((Iterator) (obj1)).next();
	//  106  275:aload           5
	//  107  277:invokeinterface #54  <Method Object Iterator.next()>
	//  108  282:checkcast       #121 <Class String>
	//  109  285:astore          6
					} while(((Map) (linkedhashmap)).containsKey(((Object) (s))));
	//  110  287:aload_3         
	//  111  288:aload           6
	//  112  290:invokeinterface #172 <Method boolean Map.containsKey(Object)>
	//  113  295:ifne            265
					((Map) (linkedhashmap)).put(((Object) (s)), ((Map) (obj)).get(((Object) (s))));
	//  114  298:aload_3         
	//  115  299:aload           6
	//  116  301:aload           4
	//  117  303:aload           6
	//  118  305:invokeinterface #175 <Method Object Map.get(Object)>
	//  119  310:invokeinterface #179 <Method Object Map.put(Object, Object)>
	//  120  315:pop             
				} while(true);
	//  121  316:goto            265
			}
			if("border-width".equalsIgnoreCase(((String) (obj))))
	//* 122  319:ldc1            #181 <String "border-width">
	//* 123  321:aload           4
	//* 124  323:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//* 125  326:ifeq            351
			{
				((Map) (linkedhashmap)).putAll(utils.parseBoxValues(((String) (obj1)), "border-", "-width"));
	//  126  329:aload_3         
	//  127  330:aload_0         
	//  128  331:getfield        #28  <Field CssUtils utils>
	//  129  334:aload           5
	//  130  336:ldc1            #183 <String "border-">
	//  131  338:ldc1            #185 <String "-width">
	//  132  340:invokevirtual   #166 <Method Map CssUtils.parseBoxValues(String, String, String)>
	//  133  343:invokeinterface #145 <Method void Map.putAll(Map)>
				continue;
	//  134  348:goto            20
			}
			if("border-style".equalsIgnoreCase(((String) (obj))))
	//* 135  351:ldc1            #187 <String "border-style">
	//* 136  353:aload           4
	//* 137  355:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//* 138  358:ifeq            383
			{
				((Map) (linkedhashmap)).putAll(utils.parseBoxValues(((String) (obj1)), "border-", "-style"));
	//  139  361:aload_3         
	//  140  362:aload_0         
	//  141  363:getfield        #28  <Field CssUtils utils>
	//  142  366:aload           5
	//  143  368:ldc1            #183 <String "border-">
	//  144  370:ldc1            #189 <String "-style">
	//  145  372:invokevirtual   #166 <Method Map CssUtils.parseBoxValues(String, String, String)>
	//  146  375:invokeinterface #145 <Method void Map.putAll(Map)>
				continue;
	//  147  380:goto            20
			}
			if("border-color".equalsIgnoreCase(((String) (obj))))
	//* 148  383:ldc1            #191 <String "border-color">
	//* 149  385:aload           4
	//* 150  387:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//* 151  390:ifeq            415
			{
				((Map) (linkedhashmap)).putAll(utils.parseBoxValues(((String) (obj1)), "border-", "-color"));
	//  152  393:aload_3         
	//  153  394:aload_0         
	//  154  395:getfield        #28  <Field CssUtils utils>
	//  155  398:aload           5
	//  156  400:ldc1            #183 <String "border-">
	//  157  402:ldc1            #193 <String "-color">
	//  158  404:invokevirtual   #166 <Method Map CssUtils.parseBoxValues(String, String, String)>
	//  159  407:invokeinterface #145 <Method void Map.putAll(Map)>
				continue;
	//  160  412:goto            20
			}
			if("padding".equalsIgnoreCase(((String) (obj))))
	//* 161  415:ldc1            #195 <String "padding">
	//* 162  417:aload           4
	//* 163  419:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//* 164  422:ifeq            508
			{
				obj = ((Object) (utils.parseBoxValues(((String) (obj1)), "padding-", "")));
	//  165  425:aload_0         
	//  166  426:getfield        #28  <Field CssUtils utils>
	//  167  429:aload           5
	//  168  431:ldc1            #197 <String "padding-">
	//  169  433:ldc1            #162 <String "">
	//  170  435:invokevirtual   #166 <Method Map CssUtils.parseBoxValues(String, String, String)>
	//  171  438:astore          4
				obj1 = ((Object) (((Map) (obj)).keySet().iterator()));
	//  172  440:aload           4
	//  173  442:invokeinterface #169 <Method Set Map.keySet()>
	//  174  447:invokeinterface #114 <Method Iterator Set.iterator()>
	//  175  452:astore          5
				do
				{
					String s1;
					do
					{
						if(!((Iterator) (obj1)).hasNext())
							continue label0;
	//  176  454:aload           5
	//  177  456:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//  178  461:ifeq            20
						s1 = (String)((Iterator) (obj1)).next();
	//  179  464:aload           5
	//  180  466:invokeinterface #54  <Method Object Iterator.next()>
	//  181  471:checkcast       #121 <Class String>
	//  182  474:astore          6
					} while(((Map) (linkedhashmap)).containsKey(((Object) (s1))));
	//  183  476:aload_3         
	//  184  477:aload           6
	//  185  479:invokeinterface #172 <Method boolean Map.containsKey(Object)>
	//  186  484:ifne            454
					((Map) (linkedhashmap)).put(((Object) (s1)), ((Map) (obj)).get(((Object) (s1))));
	//  187  487:aload_3         
	//  188  488:aload           6
	//  189  490:aload           4
	//  190  492:aload           6
	//  191  494:invokeinterface #175 <Method Object Map.get(Object)>
	//  192  499:invokeinterface #179 <Method Object Map.put(Object, Object)>
	//  193  504:pop             
				} while(true);
	//  194  505:goto            454
			}
			if("font".equalsIgnoreCase(((String) (obj))))
	//* 195  508:ldc1            #199 <String "font">
	//* 196  510:aload           4
	//* 197  512:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//* 198  515:ifeq            536
			{
				((Map) (linkedhashmap)).putAll(utils.processFont(((String) (obj1))));
	//  199  518:aload_3         
	//  200  519:aload_0         
	//  201  520:getfield        #28  <Field CssUtils utils>
	//  202  523:aload           5
	//  203  525:invokevirtual   #202 <Method Map CssUtils.processFont(String)>
	//  204  528:invokeinterface #145 <Method void Map.putAll(Map)>
				continue;
	//  205  533:goto            20
			}
			if("list-style".equalsIgnoreCase(((String) (obj))))
	//* 206  536:ldc1            #204 <String "list-style">
	//* 207  538:aload           4
	//* 208  540:invokevirtual   #137 <Method boolean String.equalsIgnoreCase(String)>
	//* 209  543:ifeq            564
			{
				((Map) (linkedhashmap)).putAll(utils.processListStyle(((String) (obj1))));
	//  210  546:aload_3         
	//  211  547:aload_0         
	//  212  548:getfield        #28  <Field CssUtils utils>
	//  213  551:aload           5
	//  214  553:invokevirtual   #207 <Method Map CssUtils.processListStyle(String)>
	//  215  556:invokeinterface #145 <Method void Map.putAll(Map)>
				continue;
	//  216  561:goto            20
			}
			if(((String) (obj)).toLowerCase().contains("background"))
	//* 217  564:aload           4
	//* 218  566:invokevirtual   #211 <Method String String.toLowerCase()>
	//* 219  569:ldc1            #213 <String "background">
	//* 220  571:invokevirtual   #217 <Method boolean String.contains(CharSequence)>
	//* 221  574:ifeq            656
			{
				obj = ((Object) (utils.processBackground(((String) (obj1)))));
	//  222  577:aload_0         
	//  223  578:getfield        #28  <Field CssUtils utils>
	//  224  581:aload           5
	//  225  583:invokevirtual   #220 <Method Map CssUtils.processBackground(String)>
	//  226  586:astore          4
				obj1 = ((Object) (((Map) (obj)).keySet().iterator()));
	//  227  588:aload           4
	//  228  590:invokeinterface #169 <Method Set Map.keySet()>
	//  229  595:invokeinterface #114 <Method Iterator Set.iterator()>
	//  230  600:astore          5
				do
				{
					String s2;
					do
					{
						if(!((Iterator) (obj1)).hasNext())
							continue label0;
	//  231  602:aload           5
	//  232  604:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//  233  609:ifeq            20
						s2 = (String)((Iterator) (obj1)).next();
	//  234  612:aload           5
	//  235  614:invokeinterface #54  <Method Object Iterator.next()>
	//  236  619:checkcast       #121 <Class String>
	//  237  622:astore          6
					} while(((Map) (linkedhashmap)).containsKey(((Object) (s2))));
	//  238  624:aload_3         
	//  239  625:aload           6
	//  240  627:invokeinterface #172 <Method boolean Map.containsKey(Object)>
	//  241  632:ifne            602
					((Map) (linkedhashmap)).put(((Object) (s2)), ((Map) (obj)).get(((Object) (s2))));
	//  242  635:aload_3         
	//  243  636:aload           6
	//  244  638:aload           4
	//  245  640:aload           6
	//  246  642:invokeinterface #175 <Method Object Map.get(Object)>
	//  247  647:invokeinterface #179 <Method Object Map.put(Object, Object)>
	//  248  652:pop             
				} while(true);
	//  249  653:goto            602
			}
			((Map) (linkedhashmap)).put(obj, obj1);
	//  250  656:aload_3         
	//  251  657:aload           4
	//  252  659:aload           5
	//  253  661:invokeinterface #179 <Method Object Map.put(Object, Object)>
	//  254  666:pop             
		} while(true);
	//  255  667:goto            20
		map.putAll(((Map) (linkedhashmap)));
	//  256  670:aload_1         
	//  257  671:aload_3         
	//  258  672:invokeinterface #145 <Method void Map.putAll(Map)>
	//  259  677:return          
	}

	private final List files;
	private final CssUtils utils;
}
