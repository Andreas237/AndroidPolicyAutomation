// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import com.firebase.client.FirebaseException;
import java.util.*;

// Referenced classes of package com.firebase.client.snapshot:
//			PriorityUtilities, EmptyNode, StringNode, LongNode, 
//			DoubleNode, BooleanNode, DeferredValueNode, Node, 
//			ChildKey, ChildrenNode

public class NodeUtilities
{

	public NodeUtilities()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Node NodeFromJSON(Object obj)
		throws FirebaseException
	{
		return NodeFromJSON(obj, PriorityUtilities.NullPriority());
	//    0    0:aload_0         
	//    1    1:invokestatic    #19  <Method Node PriorityUtilities.NullPriority()>
	//    2    4:invokestatic    #22  <Method Node NodeFromJSON(Object, Node)>
	//    3    7:areturn         
	}

	public static Node NodeFromJSON(Object obj, Node node)
		throws FirebaseException
	{
		Node node1;
		Object obj1;
		obj1 = obj;
	//    0    0:aload_0         
	//    1    1:astore          4
		node1 = node;
	//    2    3:aload_1         
	//    3    4:astore_3        
		Object obj2;
		if(!(obj instanceof Map))
			break MISSING_BLOCK_LABEL_73;
	//    4    5:aload_0         
	//    5    6:instanceof      #27  <Class Map>
	//    6    9:ifeq            73
		obj2 = ((Object) ((Map)obj));
	//    7   12:aload_0         
	//    8   13:checkcast       #27  <Class Map>
	//    9   16:astore          5
		if(((Map) (obj2)).containsKey(".priority"))
	//*  10   18:aload           5
	//*  11   20:ldc1            #29  <String ".priority">
	//*  12   22:invokeinterface #33  <Method boolean Map.containsKey(Object)>
	//*  13   27:ifeq            43
			node = PriorityUtilities.parsePriority(((Map) (obj2)).get(".priority"));
	//   14   30:aload           5
	//   15   32:ldc1            #29  <String ".priority">
	//   16   34:invokeinterface #37  <Method Object Map.get(Object)>
	//   17   39:invokestatic    #40  <Method Node PriorityUtilities.parsePriority(Object)>
	//   18   42:astore_1        
		obj1 = obj;
	//   19   43:aload_0         
	//   20   44:astore          4
		node1 = node;
	//   21   46:aload_1         
	//   22   47:astore_3        
		if(!((Map) (obj2)).containsKey(".value"))
			break MISSING_BLOCK_LABEL_73;
	//   23   48:aload           5
	//   24   50:ldc1            #42  <String ".value">
	//   25   52:invokeinterface #33  <Method boolean Map.containsKey(Object)>
	//   26   57:ifeq            73
		obj1 = ((Map) (obj2)).get(".value");
	//   27   60:aload           5
	//   28   62:ldc1            #42  <String ".value">
	//   29   64:invokeinterface #37  <Method Object Map.get(Object)>
	//   30   69:astore          4
		node1 = node;
	//   31   71:aload_1         
	//   32   72:astore_3        
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_82;
	//   33   73:aload           4
	//   34   75:ifnonnull       82
		return ((Node) (EmptyNode.Empty()));
	//   35   78:invokestatic    #48  <Method EmptyNode EmptyNode.Empty()>
	//   36   81:areturn         
		if(obj1 instanceof String)
	//*  37   82:aload           4
	//*  38   84:instanceof      #50  <Class String>
	//*  39   87:ifeq            104
			return ((Node) (new StringNode((String)obj1, node1)));
	//   40   90:new             #52  <Class StringNode>
	//   41   93:dup             
	//   42   94:aload           4
	//   43   96:checkcast       #50  <Class String>
	//   44   99:aload_3         
	//   45  100:invokespecial   #55  <Method void StringNode(String, Node)>
	//   46  103:areturn         
		if(obj1 instanceof Long)
	//*  47  104:aload           4
	//*  48  106:instanceof      #57  <Class Long>
	//*  49  109:ifeq            126
			return ((Node) (new LongNode((Long)obj1, node1)));
	//   50  112:new             #59  <Class LongNode>
	//   51  115:dup             
	//   52  116:aload           4
	//   53  118:checkcast       #57  <Class Long>
	//   54  121:aload_3         
	//   55  122:invokespecial   #62  <Method void LongNode(Long, Node)>
	//   56  125:areturn         
		if(obj1 instanceof Integer)
	//*  57  126:aload           4
	//*  58  128:instanceof      #64  <Class Integer>
	//*  59  131:ifeq            155
			return ((Node) (new LongNode(Long.valueOf(((Integer)obj1).intValue()), node1)));
	//   60  134:new             #59  <Class LongNode>
	//   61  137:dup             
	//   62  138:aload           4
	//   63  140:checkcast       #64  <Class Integer>
	//   64  143:invokevirtual   #68  <Method int Integer.intValue()>
	//   65  146:i2l             
	//   66  147:invokestatic    #72  <Method Long Long.valueOf(long)>
	//   67  150:aload_3         
	//   68  151:invokespecial   #62  <Method void LongNode(Long, Node)>
	//   69  154:areturn         
		if(obj1 instanceof Double)
	//*  70  155:aload           4
	//*  71  157:instanceof      #74  <Class Double>
	//*  72  160:ifeq            177
			return ((Node) (new DoubleNode((Double)obj1, node1)));
	//   73  163:new             #76  <Class DoubleNode>
	//   74  166:dup             
	//   75  167:aload           4
	//   76  169:checkcast       #74  <Class Double>
	//   77  172:aload_3         
	//   78  173:invokespecial   #79  <Method void DoubleNode(Double, Node)>
	//   79  176:areturn         
		if(obj1 instanceof Boolean)
	//*  80  177:aload           4
	//*  81  179:instanceof      #81  <Class Boolean>
	//*  82  182:ifeq            199
			return ((Node) (new BooleanNode((Boolean)obj1, node1)));
	//   83  185:new             #83  <Class BooleanNode>
	//   84  188:dup             
	//   85  189:aload           4
	//   86  191:checkcast       #81  <Class Boolean>
	//   87  194:aload_3         
	//   88  195:invokespecial   #86  <Method void BooleanNode(Boolean, Node)>
	//   89  198:areturn         
		if((obj1 instanceof Map) || (obj1 instanceof List))
	//*  90  199:aload           4
	//*  91  201:instanceof      #27  <Class Map>
	//*  92  204:ifne            258
	//*  93  207:aload           4
	//*  94  209:instanceof      #88  <Class List>
	//*  95  212:ifeq            218
			break MISSING_BLOCK_LABEL_258;
	//   96  215:goto            258
		obj = ((Object) (new StringBuilder()));
	//   97  218:new             #90  <Class StringBuilder>
	//   98  221:dup             
	//   99  222:invokespecial   #91  <Method void StringBuilder()>
	//  100  225:astore_0        
		((StringBuilder) (obj)).append("Failed to parse node with class ");
	//  101  226:aload_0         
	//  102  227:ldc1            #93  <String "Failed to parse node with class ">
	//  103  229:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//  104  232:pop             
		((StringBuilder) (obj)).append(obj1.getClass().toString());
	//  105  233:aload_0         
	//  106  234:aload           4
	//  107  236:invokevirtual   #101 <Method Class Object.getClass()>
	//  108  239:invokevirtual   #107 <Method String Class.toString()>
	//  109  242:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//  110  245:pop             
		throw new FirebaseException(((StringBuilder) (obj)).toString());
	//  111  246:new             #13  <Class FirebaseException>
	//  112  249:dup             
	//  113  250:aload_0         
	//  114  251:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  115  254:invokespecial   #111 <Method void FirebaseException(String)>
	//  116  257:athrow          
		if(!(obj1 instanceof Map)) goto _L2; else goto _L1
	//  117  258:aload           4
	//  118  260:instanceof      #27  <Class Map>
	//  119  263:ifeq            396
_L1:
		obj1 = ((Object) ((Map)obj1));
	//  120  266:aload           4
	//  121  268:checkcast       #27  <Class Map>
	//  122  271:astore          4
		if(((Map) (obj1)).containsKey(".sv"))
	//* 123  273:aload           4
	//* 124  275:ldc1            #113 <String ".sv">
	//* 125  277:invokeinterface #33  <Method boolean Map.containsKey(Object)>
	//* 126  282:ifeq            296
			return ((Node) (new DeferredValueNode(((Map) (obj1)), node1)));
	//  127  285:new             #115 <Class DeferredValueNode>
	//  128  288:dup             
	//  129  289:aload           4
	//  130  291:aload_3         
	//  131  292:invokespecial   #118 <Method void DeferredValueNode(Map, Node)>
	//  132  295:areturn         
		node = ((Node) (new HashMap(((Map) (obj1)).size())));
	//  133  296:new             #120 <Class HashMap>
	//  134  299:dup             
	//  135  300:aload           4
	//  136  302:invokeinterface #123 <Method int Map.size()>
	//  137  307:invokespecial   #126 <Method void HashMap(int)>
	//  138  310:astore_1        
		obj2 = ((Object) (((Map) (obj1)).keySet().iterator()));
	//  139  311:aload           4
	//  140  313:invokeinterface #130 <Method Set Map.keySet()>
	//  141  318:invokeinterface #136 <Method Iterator Set.iterator()>
	//  142  323:astore          5
_L4:
		obj = ((Object) (node));
	//  143  325:aload_1         
	//  144  326:astore_0        
		if(!((Iterator) (obj2)).hasNext())
			break; /* Loop/switch isn't completed */
	//  145  327:aload           5
	//  146  329:invokeinterface #142 <Method boolean Iterator.hasNext()>
	//  147  334:ifeq            498
		obj = ((Object) ((String)((Iterator) (obj2)).next()));
	//  148  337:aload           5
	//  149  339:invokeinterface #146 <Method Object Iterator.next()>
	//  150  344:checkcast       #50  <Class String>
	//  151  347:astore_0        
		if(!((String) (obj)).startsWith("."))
	//* 152  348:aload_0         
	//* 153  349:ldc1            #148 <String ".">
	//* 154  351:invokevirtual   #152 <Method boolean String.startsWith(String)>
	//* 155  354:ifne            325
		{
			Node node3 = NodeFromJSON(((Map) (obj1)).get(obj));
	//  156  357:aload           4
	//  157  359:aload_0         
	//  158  360:invokeinterface #37  <Method Object Map.get(Object)>
	//  159  365:invokestatic    #154 <Method Node NodeFromJSON(Object)>
	//  160  368:astore          6
			if(!node3.isEmpty())
	//* 161  370:aload           6
	//* 162  372:invokeinterface #159 <Method boolean Node.isEmpty()>
	//* 163  377:ifne            325
				((Map) (node)).put(((Object) (ChildKey.fromString(((String) (obj))))), ((Object) (node3)));
	//  164  380:aload_1         
	//  165  381:aload_0         
	//  166  382:invokestatic    #165 <Method ChildKey ChildKey.fromString(String)>
	//  167  385:aload           6
	//  168  387:invokeinterface #169 <Method Object Map.put(Object, Object)>
	//  169  392:pop             
		}
		if(true) goto _L4; else goto _L3
	//  170  393:goto            325
_L2:
		int i;
		Node node2;
		try
		{
			obj1 = ((Object) ((List)obj1));
	//  171  396:aload           4
	//  172  398:checkcast       #88  <Class List>
	//  173  401:astore          4
			node = ((Node) (new HashMap(((List) (obj1)).size())));
	//  174  403:new             #120 <Class HashMap>
	//  175  406:dup             
	//  176  407:aload           4
	//  177  409:invokeinterface #170 <Method int List.size()>
	//  178  414:invokespecial   #126 <Method void HashMap(int)>
	//  179  417:astore_1        
		}
	//* 180  418:iconst_0        
	//* 181  419:istore_2        
	//* 182  420:aload_1         
	//* 183  421:astore_0        
	//* 184  422:iload_2         
	//* 185  423:aload           4
	//* 186  425:invokeinterface #170 <Method int List.size()>
	//* 187  430:icmpge          498
	//* 188  433:new             #90  <Class StringBuilder>
	//* 189  436:dup             
	//* 190  437:invokespecial   #91  <Method void StringBuilder()>
	//* 191  440:astore_0        
	//* 192  441:aload_0         
	//* 193  442:ldc1            #172 <String "">
	//* 194  444:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//* 195  447:pop             
	//* 196  448:aload_0         
	//* 197  449:iload_2         
	//* 198  450:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//* 199  453:pop             
	//* 200  454:aload_0         
	//* 201  455:invokevirtual   #108 <Method String StringBuilder.toString()>
	//* 202  458:astore_0        
	//* 203  459:aload           4
	//* 204  461:iload_2         
	//* 205  462:invokeinterface #178 <Method Object List.get(int)>
	//* 206  467:invokestatic    #154 <Method Node NodeFromJSON(Object)>
	//* 207  470:astore          5
	//* 208  472:aload           5
	//* 209  474:invokeinterface #159 <Method boolean Node.isEmpty()>
	//* 210  479:ifne            541
	//* 211  482:aload_1         
	//* 212  483:aload_0         
	//* 213  484:invokestatic    #165 <Method ChildKey ChildKey.fromString(String)>
	//* 214  487:aload           5
	//* 215  489:invokeinterface #169 <Method Object Map.put(Object, Object)>
	//* 216  494:pop             
	//* 217  495:goto            541
	//* 218  498:aload_0         
	//* 219  499:invokeinterface #179 <Method boolean Map.isEmpty()>
	//* 220  504:ifeq            511
	//* 221  507:invokestatic    #48  <Method EmptyNode EmptyNode.Empty()>
	//* 222  510:areturn         
	//* 223  511:new             #181 <Class ChildrenNode>
	//* 224  514:dup             
	//* 225  515:aload_0         
	//* 226  516:getstatic       #185 <Field java.util.Comparator ChildrenNode.NAME_ONLY_COMPARATOR>
	//* 227  519:invokestatic    #191 <Method com.firebase.client.collection.ImmutableSortedMap com.firebase.client.collection.ImmutableSortedMap$Builder.fromMap(Map, java.util.Comparator)>
	//* 228  522:aload_3         
	//* 229  523:invokespecial   #194 <Method void ChildrenNode(com.firebase.client.collection.ImmutableSortedMap, Node)>
	//* 230  526:astore_0        
	//* 231  527:aload_0         
	//* 232  528:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 233  529:astore_0        
		{
			throw new FirebaseException("Failed to parse node", ((Throwable) (obj)));
	//  234  530:new             #13  <Class FirebaseException>
	//  235  533:dup             
	//  236  534:ldc1            #196 <String "Failed to parse node">
	//  237  536:aload_0         
	//  238  537:invokespecial   #199 <Method void FirebaseException(String, Throwable)>
	//  239  540:athrow          
		}
		i = 0;
_L8:
		obj = ((Object) (node));
		if(i >= ((List) (obj1)).size()) goto _L3; else goto _L5
_L5:
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("");
		((StringBuilder) (obj)).append(i);
		obj = ((Object) (((StringBuilder) (obj)).toString()));
		node2 = NodeFromJSON(((List) (obj1)).get(i));
		if(!node2.isEmpty())
			((Map) (node)).put(((Object) (ChildKey.fromString(((String) (obj))))), ((Object) (node2)));
		  goto _L6
_L3:
		if(((Map) (obj)).isEmpty())
			return ((Node) (EmptyNode.Empty()));
		obj = ((Object) (new ChildrenNode(com.firebase.client.collection.ImmutableSortedMap.Builder.fromMap(((Map) (obj)), ChildrenNode.NAME_ONLY_COMPARATOR), node1)));
		return ((Node) (obj));
_L6:
		i++;
	//  240  541:iload_2         
	//  241  542:iconst_1        
	//  242  543:iadd            
	//  243  544:istore_2        
		if(true) goto _L8; else goto _L7
	//  244  545:goto            420
_L7:
	}

	public static int nameAndPriorityCompare(ChildKey childkey, Node node, ChildKey childkey1, Node node1)
	{
		int i = node.compareTo(((Object) (node1)));
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:invokeinterface #205 <Method int Node.compareTo(Object)>
	//    3    7:istore          4
		if(i != 0)
	//*   4    9:iload           4
	//*   5   11:ifeq            17
			return i;
	//    6   14:iload           4
	//    7   16:ireturn         
		else
			return childkey.compareTo(childkey1);
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:invokevirtual   #208 <Method int ChildKey.compareTo(ChildKey)>
	//   11   22:ireturn         
	}
}
