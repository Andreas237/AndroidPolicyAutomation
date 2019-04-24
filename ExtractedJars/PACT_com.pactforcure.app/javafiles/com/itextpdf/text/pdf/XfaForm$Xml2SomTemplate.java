// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.ArrayList;
import java.util.HashMap;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

// Referenced classes of package com.itextpdf.text.pdf:
//			XfaForm

public static class XfaForm$Xml2SomTemplate extends XfaForm.Xml2Som
{

	private void processTemplate(Node node, HashMap hashmap)
	{
		HashMap hashmap1 = hashmap;
	//    0    0:aload_2         
	//    1    1:astore          7
		if(hashmap == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       16
			hashmap1 = new HashMap();
	//    4    7:new             #25  <Class HashMap>
	//    5   10:dup             
	//    6   11:invokespecial   #26  <Method void HashMap()>
	//    7   14:astore          7
		HashMap hashmap2 = new HashMap();
	//    8   16:new             #25  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #26  <Method void HashMap()>
	//   11   23:astore          9
		hashmap = ((HashMap) (node.getFirstChild()));
	//   12   25:aload_1         
	//   13   26:invokeinterface #58  <Method Node Node.getFirstChild()>
	//   14   31:astore_2        
		while(hashmap != null) 
	//*  15   32:aload_2         
	//*  16   33:ifnull          592
		{
			if(((Node) (hashmap)).getNodeType() == 1)
	//*  17   36:aload_2         
	//*  18   37:invokeinterface #62  <Method short Node.getNodeType()>
	//*  19   42:iconst_1        
	//*  20   43:icmpne          200
			{
				node = ((Node) (((Node) (hashmap)).getLocalName()));
	//   21   46:aload_2         
	//   22   47:invokeinterface #66  <Method String Node.getLocalName()>
	//   23   52:astore_1        
				if("subform".equals(((Object) (node))))
	//*  24   53:ldc1            #68  <String "subform">
	//*  25   55:aload_1         
	//*  26   56:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  27   59:ifeq            264
				{
					node = ((Node) (hashmap)).getAttributes().getNamedItem("name");
	//   28   62:aload_2         
	//   29   63:invokeinterface #78  <Method NamedNodeMap Node.getAttributes()>
	//   30   68:ldc1            #80  <String "name">
	//   31   70:invokeinterface #86  <Method Node NamedNodeMap.getNamedItem(String)>
	//   32   75:astore_1        
					String s = "#subform";
	//   33   76:ldc1            #88  <String "#subform">
	//   34   78:astore          8
					boolean flag = true;
	//   35   80:iconst_1        
	//   36   81:istore_3        
					if(node != null)
	//*  37   82:aload_1         
	//*  38   83:ifnull          99
					{
						s = escapeSom(node.getNodeValue());
	//   39   86:aload_1         
	//   40   87:invokeinterface #91  <Method String Node.getNodeValue()>
	//   41   92:invokestatic    #95  <Method String escapeSom(String)>
	//   42   95:astore          8
						flag = false;
	//   43   97:iconst_0        
	//   44   98:istore_3        
					}
					if(flag)
	//*  45   99:iload_3         
	//*  46  100:ifeq            210
					{
						node = ((Node) (Integer.valueOf(anform)));
	//   47  103:aload_0         
	//   48  104:getfield        #40  <Field int anform>
	//   49  107:invokestatic    #101 <Method Integer Integer.valueOf(int)>
	//   50  110:astore_1        
						anform = anform + 1;
	//   51  111:aload_0         
	//   52  112:aload_0         
	//   53  113:getfield        #40  <Field int anform>
	//   54  116:iconst_1        
	//   55  117:iadd            
	//   56  118:putfield        #40  <Field int anform>
					} else
	//*  57  121:aload_0         
	//*  58  122:getfield        #37  <Field XfaForm$Stack2 stack>
	//*  59  125:new             #103 <Class StringBuilder>
	//*  60  128:dup             
	//*  61  129:invokespecial   #104 <Method void StringBuilder()>
	//*  62  132:aload           8
	//*  63  134:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  64  137:ldc1            #110 <String "[">
	//*  65  139:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  66  142:aload_1         
	//*  67  143:invokevirtual   #113 <Method String Integer.toString()>
	//*  68  146:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  69  149:ldc1            #115 <String "]">
	//*  70  151:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//*  71  154:invokevirtual   #116 <Method String StringBuilder.toString()>
	//*  72  157:invokevirtual   #120 <Method Object XfaForm$Stack2.push(Object)>
	//*  73  160:pop             
	//*  74  161:aload_0         
	//*  75  162:aload_0         
	//*  76  163:getfield        #42  <Field int templateLevel>
	//*  77  166:iconst_1        
	//*  78  167:iadd            
	//*  79  168:putfield        #42  <Field int templateLevel>
	//*  80  171:iload_3         
	//*  81  172:ifeq            255
	//*  82  175:aload_0         
	//*  83  176:aload_2         
	//*  84  177:aload           7
	//*  85  179:invokespecial   #49  <Method void processTemplate(Node, HashMap)>
	//*  86  182:aload_0         
	//*  87  183:aload_0         
	//*  88  184:getfield        #42  <Field int templateLevel>
	//*  89  187:iconst_1        
	//*  90  188:isub            
	//*  91  189:putfield        #42  <Field int templateLevel>
	//*  92  192:aload_0         
	//*  93  193:getfield        #37  <Field XfaForm$Stack2 stack>
	//*  94  196:invokevirtual   #124 <Method Object XfaForm$Stack2.pop()>
	//*  95  199:pop             
	//*  96  200:aload_2         
	//*  97  201:invokeinterface #127 <Method Node Node.getNextSibling()>
	//*  98  206:astore_2        
	//*  99  207:goto            32
					{
						node = ((Node) ((Integer)hashmap2.get(((Object) (s)))));
	//  100  210:aload           9
	//  101  212:aload           8
	//  102  214:invokevirtual   #130 <Method Object HashMap.get(Object)>
	//  103  217:checkcast       #97  <Class Integer>
	//  104  220:astore_1        
						if(node == null)
	//* 105  221:aload_1         
	//* 106  222:ifnonnull       242
							node = ((Node) (Integer.valueOf(0)));
	//  107  225:iconst_0        
	//  108  226:invokestatic    #101 <Method Integer Integer.valueOf(int)>
	//  109  229:astore_1        
						else
	//* 110  230:aload           9
	//* 111  232:aload           8
	//* 112  234:aload_1         
	//* 113  235:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
	//* 114  238:pop             
	//* 115  239:goto            121
							node = ((Node) (Integer.valueOf(((Integer) (node)).intValue() + 1)));
	//  116  242:aload_1         
	//  117  243:invokevirtual   #138 <Method int Integer.intValue()>
	//  118  246:iconst_1        
	//  119  247:iadd            
	//  120  248:invokestatic    #101 <Method Integer Integer.valueOf(int)>
	//  121  251:astore_1        
						hashmap2.put(((Object) (s)), ((Object) (node)));
					}
					stack.push(((Object) ((new StringBuilder()).append(s).append("[").append(((Integer) (node)).toString()).append("]").toString())));
					templateLevel = templateLevel + 1;
					if(flag)
						processTemplate(((Node) (hashmap)), hashmap1);
					else
	//* 122  252:goto            230
						processTemplate(((Node) (hashmap)), ((HashMap) (null)));
	//  123  255:aload_0         
	//  124  256:aload_2         
	//  125  257:aconst_null     
	//  126  258:invokespecial   #49  <Method void processTemplate(Node, HashMap)>
					templateLevel = templateLevel - 1;
					stack.pop();
				} else
	//* 127  261:goto            182
				if("field".equals(((Object) (node))) || "exclGroup".equals(((Object) (node))))
	//* 128  264:ldc1            #140 <String "field">
	//* 129  266:aload_1         
	//* 130  267:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 131  270:ifne            282
	//* 132  273:ldc1            #142 <String "exclGroup">
	//* 133  275:aload_1         
	//* 134  276:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 135  279:ifeq            433
				{
					node = ((Node) (hashmap)).getAttributes().getNamedItem("name");
	//  136  282:aload_2         
	//  137  283:invokeinterface #78  <Method NamedNodeMap Node.getAttributes()>
	//  138  288:ldc1            #80  <String "name">
	//  139  290:invokeinterface #86  <Method Node NamedNodeMap.getNamedItem(String)>
	//  140  295:astore_1        
					if(node != null)
	//* 141  296:aload_1         
	//* 142  297:ifnull          200
					{
						String s1 = escapeSom(node.getNodeValue());
	//  143  300:aload_1         
	//  144  301:invokeinterface #91  <Method String Node.getNodeValue()>
	//  145  306:invokestatic    #95  <Method String escapeSom(String)>
	//  146  309:astore          8
						node = ((Node) ((Integer)hashmap1.get(((Object) (s1)))));
	//  147  311:aload           7
	//  148  313:aload           8
	//  149  315:invokevirtual   #130 <Method Object HashMap.get(Object)>
	//  150  318:checkcast       #97  <Class Integer>
	//  151  321:astore_1        
						if(node == null)
	//* 152  322:aload_1         
	//* 153  323:ifnonnull       420
							node = ((Node) (Integer.valueOf(0)));
	//  154  326:iconst_0        
	//  155  327:invokestatic    #101 <Method Integer Integer.valueOf(int)>
	//  156  330:astore_1        
						else
	//* 157  331:aload           7
	//* 158  333:aload           8
	//* 159  335:aload_1         
	//* 160  336:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
	//* 161  339:pop             
	//* 162  340:aload_0         
	//* 163  341:getfield        #37  <Field XfaForm$Stack2 stack>
	//* 164  344:new             #103 <Class StringBuilder>
	//* 165  347:dup             
	//* 166  348:invokespecial   #104 <Method void StringBuilder()>
	//* 167  351:aload           8
	//* 168  353:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 169  356:ldc1            #110 <String "[">
	//* 170  358:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 171  361:aload_1         
	//* 172  362:invokevirtual   #113 <Method String Integer.toString()>
	//* 173  365:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 174  368:ldc1            #115 <String "]">
	//* 175  370:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//* 176  373:invokevirtual   #116 <Method String StringBuilder.toString()>
	//* 177  376:invokevirtual   #120 <Method Object XfaForm$Stack2.push(Object)>
	//* 178  379:pop             
	//* 179  380:aload_0         
	//* 180  381:invokevirtual   #145 <Method String printStack()>
	//* 181  384:astore_1        
	//* 182  385:aload_0         
	//* 183  386:getfield        #23  <Field ArrayList order>
	//* 184  389:aload_1         
	//* 185  390:invokevirtual   #148 <Method boolean ArrayList.add(Object)>
	//* 186  393:pop             
	//* 187  394:aload_0         
	//* 188  395:aload_1         
	//* 189  396:invokevirtual   #152 <Method void inverseSearchAdd(String)>
	//* 190  399:aload_0         
	//* 191  400:getfield        #30  <Field HashMap name2Node>
	//* 192  403:aload_1         
	//* 193  404:aload_2         
	//* 194  405:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
	//* 195  408:pop             
	//* 196  409:aload_0         
	//* 197  410:getfield        #37  <Field XfaForm$Stack2 stack>
	//* 198  413:invokevirtual   #124 <Method Object XfaForm$Stack2.pop()>
	//* 199  416:pop             
	//* 200  417:goto            200
							node = ((Node) (Integer.valueOf(((Integer) (node)).intValue() + 1)));
	//  201  420:aload_1         
	//  202  421:invokevirtual   #138 <Method int Integer.intValue()>
	//  203  424:iconst_1        
	//  204  425:iadd            
	//  205  426:invokestatic    #101 <Method Integer Integer.valueOf(int)>
	//  206  429:astore_1        
						hashmap1.put(((Object) (s1)), ((Object) (node)));
						stack.push(((Object) ((new StringBuilder()).append(s1).append("[").append(((Integer) (node)).toString()).append("]").toString())));
						node = ((Node) (printStack()));
						order.add(((Object) (node)));
						inverseSearchAdd(((String) (node)));
						name2Node.put(((Object) (node)), ((Object) (hashmap)));
						stack.pop();
					}
				} else
	//* 207  430:goto            331
				if(!dynamicForm && templateLevel > 0 && "occur".equals(((Object) (node))))
	//* 208  433:aload_0         
	//* 209  434:getfield        #154 <Field boolean dynamicForm>
	//* 210  437:ifne            200
	//* 211  440:aload_0         
	//* 212  441:getfield        #42  <Field int templateLevel>
	//* 213  444:ifle            200
	//* 214  447:ldc1            #156 <String "occur">
	//* 215  449:aload_1         
	//* 216  450:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 217  453:ifeq            200
				{
					int j = 1;
	//  218  456:iconst_1        
	//  219  457:istore          4
					int k = 1;
	//  220  459:iconst_1        
	//  221  460:istore          5
					boolean flag1 = true;
	//  222  462:iconst_1        
	//  223  463:istore          6
					node = ((Node) (hashmap)).getAttributes().getNamedItem("initial");
	//  224  465:aload_2         
	//  225  466:invokeinterface #78  <Method NamedNodeMap Node.getAttributes()>
	//  226  471:ldc1            #158 <String "initial">
	//  227  473:invokeinterface #86  <Method Node NamedNodeMap.getNamedItem(String)>
	//  228  478:astore_1        
					int i = j;
	//  229  479:iload           4
	//  230  481:istore_3        
					if(node != null)
	//* 231  482:aload_1         
	//* 232  483:ifnull          499
						try
						{
							i = Integer.parseInt(node.getNodeValue().trim());
	//  233  486:aload_1         
	//  234  487:invokeinterface #91  <Method String Node.getNodeValue()>
	//  235  492:invokevirtual   #161 <Method String String.trim()>
	//  236  495:invokestatic    #165 <Method int Integer.parseInt(String)>
	//  237  498:istore_3        
						}
	//* 238  499:aload_2         
	//* 239  500:invokeinterface #78  <Method NamedNodeMap Node.getAttributes()>
	//* 240  505:ldc1            #167 <String "min">
	//* 241  507:invokeinterface #86  <Method Node NamedNodeMap.getNamedItem(String)>
	//* 242  512:astore_1        
	//* 243  513:iload           5
	//* 244  515:istore          4
	//* 245  517:aload_1         
	//* 246  518:ifnull          535
	//* 247  521:aload_1         
	//* 248  522:invokeinterface #91  <Method String Node.getNodeValue()>
	//* 249  527:invokevirtual   #161 <Method String String.trim()>
	//* 250  530:invokestatic    #165 <Method int Integer.parseInt(String)>
	//* 251  533:istore          4
	//* 252  535:aload_2         
	//* 253  536:invokeinterface #78  <Method NamedNodeMap Node.getAttributes()>
	//* 254  541:ldc1            #169 <String "max">
	//* 255  543:invokeinterface #86  <Method Node NamedNodeMap.getNamedItem(String)>
	//* 256  548:astore_1        
	//* 257  549:iload           6
	//* 258  551:istore          5
	//* 259  553:aload_1         
	//* 260  554:ifnull          571
	//* 261  557:aload_1         
	//* 262  558:invokeinterface #91  <Method String Node.getNodeValue()>
	//* 263  563:invokevirtual   #161 <Method String String.trim()>
	//* 264  566:invokestatic    #165 <Method int Integer.parseInt(String)>
	//* 265  569:istore          5
	//* 266  571:iload_3         
	//* 267  572:iload           4
	//* 268  574:icmpne          584
	//* 269  577:iload           4
	//* 270  579:iload           5
	//* 271  581:icmpeq          200
	//* 272  584:aload_0         
	//* 273  585:iconst_1        
	//* 274  586:putfield        #154 <Field boolean dynamicForm>
	//* 275  589:goto            200
	//* 276  592:return          
	//* 277  593:astore_1        
	//* 278  594:iload           6
	//* 279  596:istore          5
	//* 280  598:goto            571
	//* 281  601:astore_1        
	//* 282  602:iload           5
	//* 283  604:istore          4
	//* 284  606:goto            535
						// Misplaced declaration of an exception variable
						catch(Node node)
	//* 285  609:astore_1        
						{
							i = j;
	//  286  610:iload           4
	//  287  612:istore_3        
						}
					node = ((Node) (hashmap)).getAttributes().getNamedItem("min");
					j = k;
					if(node != null)
						try
						{
							j = Integer.parseInt(node.getNodeValue().trim());
						}
						// Misplaced declaration of an exception variable
						catch(Node node)
						{
							j = k;
						}
					node = ((Node) (hashmap)).getAttributes().getNamedItem("max");
					k = ((int) (flag1));
					if(node != null)
						try
						{
							k = Integer.parseInt(node.getNodeValue().trim());
						}
						// Misplaced declaration of an exception variable
						catch(Node node)
						{
							k = ((int) (flag1));
						}
					if(i != j || j != k)
						dynamicForm = true;
				}
			}
			hashmap = ((HashMap) (((Node) (hashmap)).getNextSibling()));
		}
	//* 288  613:goto            499
	}

	public String getFieldType(String s)
	{
		s = ((String) ((Node)name2Node.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field HashMap name2Node>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #54  <Class Node>
	//    5   11:astore_1        
		if(s != null) goto _L2; else goto _L1
	//    6   12:aload_1         
	//    7   13:ifnonnull       18
_L1:
		return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
_L2:
		if("exclGroup".equals(((Object) (((Node) (s)).getLocalName()))))
	//*  10   18:ldc1            #142 <String "exclGroup">
	//*  11   20:aload_1         
	//*  12   21:invokeinterface #66  <Method String Node.getLocalName()>
	//*  13   26:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  14   29:ifeq            35
			return "exclGroup";
	//   15   32:ldc1            #142 <String "exclGroup">
	//   16   34:areturn         
		s = ((String) (((Node) (s)).getFirstChild()));
	//   17   35:aload_1         
	//   18   36:invokeinterface #58  <Method Node Node.getFirstChild()>
	//   19   41:astore_1        
_L6:
		if(s != null && (((Node) (s)).getNodeType() != 1 || !"ui".equals(((Object) (((Node) (s)).getLocalName()))))) goto _L4; else goto _L3
	//   20   42:aload_1         
	//   21   43:ifnull          70
	//   22   46:aload_1         
	//   23   47:invokeinterface #62  <Method short Node.getNodeType()>
	//   24   52:iconst_1        
	//   25   53:icmpne          130
	//   26   56:ldc1            #174 <String "ui">
	//   27   58:aload_1         
	//   28   59:invokeinterface #66  <Method String Node.getLocalName()>
	//   29   64:invokevirtual   #74  <Method boolean String.equals(Object)>
	//   30   67:ifeq            130
_L3:
		if(s == null) goto _L1; else goto _L5
	//   31   70:aload_1         
	//   32   71:ifnull          16
_L5:
		s = ((String) (((Node) (s)).getFirstChild()));
	//   33   74:aload_1         
	//   34   75:invokeinterface #58  <Method Node Node.getFirstChild()>
	//   35   80:astore_1        
_L7:
		if(s != null)
	//*  36   81:aload_1         
	//*  37   82:ifnull          16
		{
			if(((Node) (s)).getNodeType() == 1 && (!"extras".equals(((Object) (((Node) (s)).getLocalName()))) || !"picture".equals(((Object) (((Node) (s)).getLocalName())))))
	//*  38   85:aload_1         
	//*  39   86:invokeinterface #62  <Method short Node.getNodeType()>
	//*  40   91:iconst_1        
	//*  41   92:icmpne          140
	//*  42   95:ldc1            #176 <String "extras">
	//*  43   97:aload_1         
	//*  44   98:invokeinterface #66  <Method String Node.getLocalName()>
	//*  45  103:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  46  106:ifeq            123
	//*  47  109:ldc1            #178 <String "picture">
	//*  48  111:aload_1         
	//*  49  112:invokeinterface #66  <Method String Node.getLocalName()>
	//*  50  117:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  51  120:ifne            140
				return ((Node) (s)).getLocalName();
	//   52  123:aload_1         
	//   53  124:invokeinterface #66  <Method String Node.getLocalName()>
	//   54  129:areturn         
			break MISSING_BLOCK_LABEL_140;
		}
		  goto _L1
_L4:
		s = ((String) (((Node) (s)).getNextSibling()));
	//   55  130:aload_1         
	//   56  131:invokeinterface #127 <Method Node Node.getNextSibling()>
	//   57  136:astore_1        
		  goto _L6
	//*  58  137:goto            42
		s = ((String) (((Node) (s)).getNextSibling()));
	//   59  140:aload_1         
	//   60  141:invokeinterface #127 <Method Node Node.getNextSibling()>
	//   61  146:astore_1        
		  goto _L7
	//*  62  147:goto            81
	}

	public boolean isDynamicForm()
	{
		return dynamicForm;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field boolean dynamicForm>
	//    2    4:ireturn         
	}

	public void setDynamicForm(boolean flag)
	{
		dynamicForm = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #154 <Field boolean dynamicForm>
	//    3    5:return          
	}

	private boolean dynamicForm;
	private int templateLevel;

	public XfaForm$Xml2SomTemplate(Node node)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void XfaForm$Xml2Som()>
		order = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ArrayList()>
	//    6   12:putfield        #23  <Field ArrayList order>
		name2Node = new HashMap();
	//    7   15:aload_0         
	//    8   16:new             #25  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #26  <Method void HashMap()>
	//   11   23:putfield        #30  <Field HashMap name2Node>
		stack = new XfaForm.Stack2();
	//   12   26:aload_0         
	//   13   27:new             #32  <Class XfaForm$Stack2>
	//   14   30:dup             
	//   15   31:invokespecial   #33  <Method void XfaForm$Stack2()>
	//   16   34:putfield        #37  <Field XfaForm$Stack2 stack>
		anform = 0;
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:putfield        #40  <Field int anform>
		templateLevel = 0;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #42  <Field int templateLevel>
		inverseSearch = new HashMap();
	//   23   47:aload_0         
	//   24   48:new             #25  <Class HashMap>
	//   25   51:dup             
	//   26   52:invokespecial   #26  <Method void HashMap()>
	//   27   55:putfield        #45  <Field HashMap inverseSearch>
		processTemplate(node, ((HashMap) (null)));
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:aconst_null     
	//   31   61:invokespecial   #49  <Method void processTemplate(Node, HashMap)>
	//   32   64:return          
	}
}
