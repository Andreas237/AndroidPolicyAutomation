// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.ArrayList;
import java.util.HashMap;
import org.w3c.dom.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			XfaForm

public static class XfaForm$Xml2SomDatasets extends XfaForm.Xml2Som
{

	private static boolean hasChildren(Node node)
	{
		Object obj = ((Object) (node.getAttributes().getNamedItemNS("http://www.xfa.org/schema/xfa-data/1.0/", "dataNode")));
	//    0    0:aload_0         
	//    1    1:invokeinterface #52  <Method NamedNodeMap Node.getAttributes()>
	//    2    6:ldc1            #54  <String "http://www.xfa.org/schema/xfa-data/1.0/">
	//    3    8:ldc1            #56  <String "dataNode">
	//    4   10:invokeinterface #62  <Method Node NamedNodeMap.getNamedItemNS(String, String)>
	//    5   15:astore_1        
		if(obj == null) goto _L2; else goto _L1
	//    6   16:aload_1         
	//    7   17:ifnull          49
_L1:
		obj = ((Object) (((Node) (obj)).getNodeValue()));
	//    8   20:aload_1         
	//    9   21:invokeinterface #66  <Method String Node.getNodeValue()>
	//   10   26:astore_1        
		if(!"dataGroup".equals(obj)) goto _L4; else goto _L3
	//   11   27:ldc1            #68  <String "dataGroup">
	//   12   29:aload_1         
	//   13   30:invokevirtual   #74  <Method boolean String.equals(Object)>
	//   14   33:ifeq            38
_L3:
		return true;
	//   15   36:iconst_1        
	//   16   37:ireturn         
_L4:
		if("dataValue".equals(obj))
	//*  17   38:ldc1            #76  <String "dataValue">
	//*  18   40:aload_1         
	//*  19   41:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  20   44:ifeq            49
			return false;
	//   21   47:iconst_0        
	//   22   48:ireturn         
_L2:
		if(!node.hasChildNodes())
	//*  23   49:aload_0         
	//*  24   50:invokeinterface #80  <Method boolean Node.hasChildNodes()>
	//*  25   55:ifne            60
			return false;
	//   26   58:iconst_0        
	//   27   59:ireturn         
		node = node.getFirstChild();
	//   28   60:aload_0         
	//   29   61:invokeinterface #84  <Method Node Node.getFirstChild()>
	//   30   66:astore_0        
label0:
		do
		{
label1:
			{
				if(node == null)
					break label1;
	//   31   67:aload_0         
	//   32   68:ifnull          91
				if(node.getNodeType() == 1)
					break label0;
	//   33   71:aload_0         
	//   34   72:invokeinterface #88  <Method short Node.getNodeType()>
	//   35   77:iconst_1        
	//   36   78:icmpeq          36
				node = node.getNextSibling();
	//   37   81:aload_0         
	//   38   82:invokeinterface #91  <Method Node Node.getNextSibling()>
	//   39   87:astore_0        
			}
		} while(true);
	//   40   88:goto            67
		if(true) goto _L3; else goto _L5
_L5:
		return false;
	//   41   91:iconst_0        
	//   42   92:ireturn         
	}

	private void processDatasetsInternal(Node node)
	{
		if(node != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          183
		{
			HashMap hashmap = new HashMap();
	//    2    4:new             #21  <Class HashMap>
	//    3    7:dup             
	//    4    8:invokespecial   #22  <Method void HashMap()>
	//    5   11:astore_3        
			node = node.getFirstChild();
	//    6   12:aload_1         
	//    7   13:invokeinterface #84  <Method Node Node.getFirstChild()>
	//    8   18:astore_1        
			while(node != null) 
	//*   9   19:aload_1         
	//*  10   20:ifnull          183
			{
				if(node.getNodeType() != 1)
					continue;
	//   11   23:aload_1         
	//   12   24:invokeinterface #88  <Method short Node.getNodeType()>
	//   13   29:iconst_1        
	//   14   30:icmpne          160
				String s = escapeSom(node.getLocalName());
	//   15   33:aload_1         
	//   16   34:invokeinterface #94  <Method String Node.getLocalName()>
	//   17   39:invokestatic    #98  <Method String escapeSom(String)>
	//   18   42:astore          4
				Object obj = ((Object) ((Integer)hashmap.get(((Object) (s)))));
	//   19   44:aload_3         
	//   20   45:aload           4
	//   21   47:invokevirtual   #102 <Method Object HashMap.get(Object)>
	//   22   50:checkcast       #104 <Class Integer>
	//   23   53:astore_2        
				if(obj == null)
	//*  24   54:aload_2         
	//*  25   55:ifnonnull       170
					obj = ((Object) (Integer.valueOf(0)));
	//   26   58:iconst_0        
	//   27   59:invokestatic    #108 <Method Integer Integer.valueOf(int)>
	//   28   62:astore_2        
				else
	//*  29   63:aload_3         
	//*  30   64:aload           4
	//*  31   66:aload_2         
	//*  32   67:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//*  33   70:pop             
	//*  34   71:aload_0         
	//*  35   72:getfield        #33  <Field XfaForm$Stack2 stack>
	//*  36   75:new             #114 <Class StringBuilder>
	//*  37   78:dup             
	//*  38   79:invokespecial   #115 <Method void StringBuilder()>
	//*  39   82:aload           4
	//*  40   84:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//*  41   87:ldc1            #121 <String "[">
	//*  42   89:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//*  43   92:aload_2         
	//*  44   93:invokevirtual   #124 <Method String Integer.toString()>
	//*  45   96:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//*  46   99:ldc1            #126 <String "]">
	//*  47  101:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//*  48  104:invokevirtual   #127 <Method String StringBuilder.toString()>
	//*  49  107:invokevirtual   #130 <Method Object XfaForm$Stack2.push(Object)>
	//*  50  110:pop             
	//*  51  111:aload_1         
	//*  52  112:invokestatic    #132 <Method boolean hasChildren(Node)>
	//*  53  115:ifeq            123
	//*  54  118:aload_0         
	//*  55  119:aload_1         
	//*  56  120:invokespecial   #43  <Method void processDatasetsInternal(Node)>
	//*  57  123:aload_0         
	//*  58  124:invokevirtual   #135 <Method String printStack()>
	//*  59  127:astore_2        
	//*  60  128:aload_0         
	//*  61  129:getfield        #19  <Field ArrayList order>
	//*  62  132:aload_2         
	//*  63  133:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
	//*  64  136:pop             
	//*  65  137:aload_0         
	//*  66  138:aload_2         
	//*  67  139:invokevirtual   #142 <Method void inverseSearchAdd(String)>
	//*  68  142:aload_0         
	//*  69  143:getfield        #26  <Field HashMap name2Node>
	//*  70  146:aload_2         
	//*  71  147:aload_1         
	//*  72  148:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//*  73  151:pop             
	//*  74  152:aload_0         
	//*  75  153:getfield        #33  <Field XfaForm$Stack2 stack>
	//*  76  156:invokevirtual   #146 <Method Object XfaForm$Stack2.pop()>
	//*  77  159:pop             
	//*  78  160:aload_1         
	//*  79  161:invokeinterface #91  <Method Node Node.getNextSibling()>
	//*  80  166:astore_1        
	//*  81  167:goto            19
					obj = ((Object) (Integer.valueOf(((Integer) (obj)).intValue() + 1)));
	//   82  170:aload_2         
	//   83  171:invokevirtual   #150 <Method int Integer.intValue()>
	//   84  174:iconst_1        
	//   85  175:iadd            
	//   86  176:invokestatic    #108 <Method Integer Integer.valueOf(int)>
	//   87  179:astore_2        
				hashmap.put(((Object) (s)), obj);
				stack.push(((Object) ((new StringBuilder()).append(s).append("[").append(((Integer) (obj)).toString()).append("]").toString())));
				if(hasChildren(node))
					processDatasetsInternal(node);
				obj = ((Object) (printStack()));
				order.add(obj);
				inverseSearchAdd(((String) (obj)));
				name2Node.put(obj, ((Object) (node)));
				stack.pop();
				node = node.getNextSibling();
			}
		}
	//*  88  180:goto            63
	//   89  183:return          
	}

	public Node insertNode(Node node, String s)
	{
		XfaForm.Stack2 stack2 = splitParts(s);
	//    0    0:aload_2         
	//    1    1:invokestatic    #156 <Method XfaForm$Stack2 splitParts(String)>
	//    2    4:astore          9
		Document document = node.getOwnerDocument();
	//    3    6:aload_1         
	//    4    7:invokeinterface #160 <Method Document Node.getOwnerDocument()>
	//    5   12:astore          10
		Object obj = null;
	//    6   14:aconst_null     
	//    7   15:astore          7
		for(node = node.getFirstChild(); node.getNodeType() != 1; node = node.getNextSibling());
	//    8   17:aload_1         
	//    9   18:invokeinterface #84  <Method Node Node.getFirstChild()>
	//   10   23:astore_1        
	//   11   24:aload_1         
	//   12   25:invokeinterface #88  <Method short Node.getNodeType()>
	//   13   30:iconst_1        
	//   14   31:icmpeq          44
	//   15   34:aload_1         
	//   16   35:invokeinterface #91  <Method Node Node.getNextSibling()>
	//   17   40:astore_1        
	//*  18   41:goto            24
		int k = 0;
	//   19   44:iconst_0        
	//   20   45:istore          5
		Node node1 = node;
	//   21   47:aload_1         
	//   22   48:astore          8
		node = ((Node) (obj));
	//   23   50:aload           7
	//   24   52:astore_1        
		do
		{
			if(k >= stack2.size())
				break;
	//   25   53:iload           5
	//   26   55:aload           9
	//   27   57:invokevirtual   #163 <Method int XfaForm$Stack2.size()>
	//   28   60:icmpge          280
			node = ((Node) ((String)stack2.get(k)));
	//   29   63:aload           9
	//   30   65:iload           5
	//   31   67:invokevirtual   #166 <Method Object XfaForm$Stack2.get(int)>
	//   32   70:checkcast       #70  <Class String>
	//   33   73:astore_1        
			int i = ((String) (node)).lastIndexOf('[');
	//   34   74:aload_1         
	//   35   75:bipush          91
	//   36   77:invokevirtual   #170 <Method int String.lastIndexOf(int)>
	//   37   80:istore_3        
			String s1 = ((String) (node)).substring(0, i);
	//   38   81:aload_1         
	//   39   82:iconst_0        
	//   40   83:iload_3         
	//   41   84:invokevirtual   #174 <Method String String.substring(int, int)>
	//   42   87:astore          11
			int l = Integer.parseInt(((String) (node)).substring(i + 1, ((String) (node)).length() - 1));
	//   43   89:aload_1         
	//   44   90:iload_3         
	//   45   91:iconst_1        
	//   46   92:iadd            
	//   47   93:aload_1         
	//   48   94:invokevirtual   #177 <Method int String.length()>
	//   49   97:iconst_1        
	//   50   98:isub            
	//   51   99:invokevirtual   #174 <Method String String.substring(int, int)>
	//   52  102:invokestatic    #181 <Method int Integer.parseInt(String)>
	//   53  105:istore          6
			i = -1;
	//   54  107:iconst_m1       
	//   55  108:istore_3        
			Object obj1 = ((Object) (node1.getFirstChild()));
	//   56  109:aload           8
	//   57  111:invokeinterface #84  <Method Node Node.getFirstChild()>
	//   58  116:astore          7
label0:
			do
			{
				int j;
label1:
				{
					j = i;
	//   59  118:iload_3         
	//   60  119:istore          4
					node = ((Node) (obj1));
	//   61  121:aload           7
	//   62  123:astore_1        
					if(obj1 != null)
	//*  63  124:aload           7
	//*  64  126:ifnull          183
					{
						j = i;
	//   65  129:iload_3         
	//   66  130:istore          4
						if(((Node) (obj1)).getNodeType() != 1)
							break label1;
	//   67  132:aload           7
	//   68  134:invokeinterface #88  <Method short Node.getNodeType()>
	//   69  139:iconst_1        
	//   70  140:icmpne          253
						j = i;
	//   71  143:iload_3         
	//   72  144:istore          4
						if(!escapeSom(((Node) (obj1)).getLocalName()).equals(((Object) (s1))))
							break label1;
	//   73  146:aload           7
	//   74  148:invokeinterface #94  <Method String Node.getLocalName()>
	//   75  153:invokestatic    #98  <Method String escapeSom(String)>
	//   76  156:aload           11
	//   77  158:invokevirtual   #74  <Method boolean String.equals(Object)>
	//   78  161:ifeq            253
						i++;
	//   79  164:iload_3         
	//   80  165:iconst_1        
	//   81  166:iadd            
	//   82  167:istore_3        
						j = i;
	//   83  168:iload_3         
	//   84  169:istore          4
						if(i != l)
							break label1;
	//   85  171:iload_3         
	//   86  172:iload           6
	//   87  174:icmpne          253
						node = ((Node) (obj1));
	//   88  177:aload           7
	//   89  179:astore_1        
					}
					for(j = i; j < l; j++)
	//*  90  180:iload_3         
	//*  91  181:istore          4
	//*  92  183:iload           4
	//*  93  185:iload           6
	//*  94  187:icmpge          268
					{
						node = node1.appendChild(((Node) (document.createElementNS(((String) (null)), s1))));
	//   95  190:aload           8
	//   96  192:aload           10
	//   97  194:aconst_null     
	//   98  195:aload           11
	//   99  197:invokeinterface #187 <Method org.w3c.dom.Element Document.createElementNS(String, String)>
	//  100  202:invokeinterface #191 <Method Node Node.appendChild(Node)>
	//  101  207:astore_1        
						obj1 = ((Object) (document.createAttributeNS("http://www.xfa.org/schema/xfa-data/1.0/", "dataNode")));
	//  102  208:aload           10
	//  103  210:ldc1            #54  <String "http://www.xfa.org/schema/xfa-data/1.0/">
	//  104  212:ldc1            #56  <String "dataNode">
	//  105  214:invokeinterface #195 <Method org.w3c.dom.Attr Document.createAttributeNS(String, String)>
	//  106  219:astore          7
						((Node) (obj1)).setNodeValue("dataGroup");
	//  107  221:aload           7
	//  108  223:ldc1            #68  <String "dataGroup">
	//  109  225:invokeinterface #198 <Method void Node.setNodeValue(String)>
						node.getAttributes().setNamedItemNS(((Node) (obj1)));
	//  110  230:aload_1         
	//  111  231:invokeinterface #52  <Method NamedNodeMap Node.getAttributes()>
	//  112  236:aload           7
	//  113  238:invokeinterface #201 <Method Node NamedNodeMap.setNamedItemNS(Node)>
	//  114  243:pop             
					}

	//  115  244:iload           4
	//  116  246:iconst_1        
	//  117  247:iadd            
	//  118  248:istore          4
					break label0;
	//  119  250:goto            183
				}
				obj1 = ((Object) (((Node) (obj1)).getNextSibling()));
	//  120  253:aload           7
	//  121  255:invokeinterface #91  <Method Node Node.getNextSibling()>
	//  122  260:astore          7
				i = j;
	//  123  262:iload           4
	//  124  264:istore_3        
			} while(true);
	//  125  265:goto            118
			node1 = node;
	//  126  268:aload_1         
	//  127  269:astore          8
			k++;
	//  128  271:iload           5
	//  129  273:iconst_1        
	//  130  274:iadd            
	//  131  275:istore          5
		} while(true);
	//  132  277:goto            53
		inverseSearchAdd(inverseSearch, stack2, s);
	//  133  280:aload_0         
	//  134  281:getfield        #40  <Field HashMap inverseSearch>
	//  135  284:aload           9
	//  136  286:aload_2         
	//  137  287:invokestatic    #204 <Method void inverseSearchAdd(HashMap, XfaForm$Stack2, String)>
		name2Node.put(((Object) (s)), ((Object) (node)));
	//  138  290:aload_0         
	//  139  291:getfield        #26  <Field HashMap name2Node>
	//  140  294:aload_2         
	//  141  295:aload_1         
	//  142  296:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
	//  143  299:pop             
		order.add(((Object) (s)));
	//  144  300:aload_0         
	//  145  301:getfield        #19  <Field ArrayList order>
	//  146  304:aload_2         
	//  147  305:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
	//  148  308:pop             
		return node;
	//  149  309:aload_1         
	//  150  310:areturn         
	}

	public XfaForm$Xml2SomDatasets(Node node)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void XfaForm$Xml2Som()>
		order = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #14  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field ArrayList order>
		name2Node = new HashMap();
	//    7   15:aload_0         
	//    8   16:new             #21  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #22  <Method void HashMap()>
	//   11   23:putfield        #26  <Field HashMap name2Node>
		stack = new XfaForm.Stack2();
	//   12   26:aload_0         
	//   13   27:new             #28  <Class XfaForm$Stack2>
	//   14   30:dup             
	//   15   31:invokespecial   #29  <Method void XfaForm$Stack2()>
	//   16   34:putfield        #33  <Field XfaForm$Stack2 stack>
		anform = 0;
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:putfield        #37  <Field int anform>
		inverseSearch = new HashMap();
	//   20   42:aload_0         
	//   21   43:new             #21  <Class HashMap>
	//   22   46:dup             
	//   23   47:invokespecial   #22  <Method void HashMap()>
	//   24   50:putfield        #40  <Field HashMap inverseSearch>
		processDatasetsInternal(node);
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:invokespecial   #43  <Method void processDatasetsInternal(Node)>
	//   28   58:return          
	}
}
