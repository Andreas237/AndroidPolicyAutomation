// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.*;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			Path

public class RangeMerge
{

	public RangeMerge(Path path, Path path1, Node node)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		optExclusiveStart = path;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Path optExclusiveStart>
		optInclusiveEnd = path1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Path optInclusiveEnd>
		snap = node;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field Node snap>
	//   11   19:return          
	}

	private Node updateRangeInNode(Path path, Node node, Node node1)
	{
		Object obj = ((Object) (optExclusiveStart));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Path optExclusiveStart>
	//    2    4:astore          9
		int i;
		if(obj == null)
	//*   3    6:aload           9
	//*   4    8:ifnonnull       17
			i = 1;
	//    5   11:iconst_1        
	//    6   12:istore          4
		else
	//*   7   14:goto            25
			i = path.compareTo(((Path) (obj)));
	//    8   17:aload_1         
	//    9   18:aload           9
	//   10   20:invokevirtual   #33  <Method int Path.compareTo(Path)>
	//   11   23:istore          4
		obj = ((Object) (optInclusiveEnd));
	//   12   25:aload_0         
	//   13   26:getfield        #23  <Field Path optInclusiveEnd>
	//   14   29:astore          9
		int j;
		if(obj == null)
	//*  15   31:aload           9
	//*  16   33:ifnonnull       42
			j = -1;
	//   17   36:iconst_m1       
	//   18   37:istore          5
		else
	//*  19   39:goto            50
			j = path.compareTo(((Path) (obj)));
	//   20   42:aload_1         
	//   21   43:aload           9
	//   22   45:invokevirtual   #33  <Method int Path.compareTo(Path)>
	//   23   48:istore          5
		obj = ((Object) (optExclusiveStart));
	//   24   50:aload_0         
	//   25   51:getfield        #21  <Field Path optExclusiveStart>
	//   26   54:astore          9
		boolean flag2 = false;
	//   27   56:iconst_0        
	//   28   57:istore          8
		boolean flag;
		if(obj != null && path.contains(((Path) (obj))))
	//*  29   59:aload           9
	//*  30   61:ifnull          79
	//*  31   64:aload_1         
	//*  32   65:aload           9
	//*  33   67:invokevirtual   #37  <Method boolean Path.contains(Path)>
	//*  34   70:ifeq            79
			flag = true;
	//   35   73:iconst_1        
	//   36   74:istore          6
		else
	//*  37   76:goto            82
			flag = false;
	//   38   79:iconst_0        
	//   39   80:istore          6
		obj = ((Object) (optInclusiveEnd));
	//   40   82:aload_0         
	//   41   83:getfield        #23  <Field Path optInclusiveEnd>
	//   42   86:astore          9
		boolean flag1 = flag2;
	//   43   88:iload           8
	//   44   90:istore          7
		if(obj != null)
	//*  45   92:aload           9
	//*  46   94:ifnull          113
		{
			flag1 = flag2;
	//   47   97:iload           8
	//   48   99:istore          7
			if(path.contains(((Path) (obj))))
	//*  49  101:aload_1         
	//*  50  102:aload           9
	//*  51  104:invokevirtual   #37  <Method boolean Path.contains(Path)>
	//*  52  107:ifeq            113
				flag1 = true;
	//   53  110:iconst_1        
	//   54  111:istore          7
		}
		if(i > 0 && j < 0 && !flag1)
	//*  55  113:iload           4
	//*  56  115:ifle            130
	//*  57  118:iload           5
	//*  58  120:ifge            130
	//*  59  123:iload           7
	//*  60  125:ifne            130
			return node1;
	//   61  128:aload_3         
	//   62  129:areturn         
		if(i > 0 && flag1 && node1.isLeafNode())
	//*  63  130:iload           4
	//*  64  132:ifle            151
	//*  65  135:iload           7
	//*  66  137:ifeq            151
	//*  67  140:aload_3         
	//*  68  141:invokeinterface #43  <Method boolean Node.isLeafNode()>
	//*  69  146:ifeq            151
			return node1;
	//   70  149:aload_3         
	//   71  150:areturn         
		if(i > 0 && j == 0)
	//*  72  151:iload           4
	//*  73  153:ifle            176
	//*  74  156:iload           5
	//*  75  158:ifne            176
			if(node.isLeafNode())
	//*  76  161:aload_2         
	//*  77  162:invokeinterface #43  <Method boolean Node.isLeafNode()>
	//*  78  167:ifeq            174
				return ((Node) (EmptyNode.Empty()));
	//   79  170:invokestatic    #49  <Method EmptyNode EmptyNode.Empty()>
	//   80  173:areturn         
			else
				return node;
	//   81  174:aload_2         
	//   82  175:areturn         
		if(!flag && !flag1)
	//*  83  176:iload           6
	//*  84  178:ifne            191
	//*  85  181:iload           7
	//*  86  183:ifeq            189
	//*  87  186:goto            191
			return node;
	//   88  189:aload_2         
	//   89  190:areturn         
		obj = ((Object) (new HashSet()));
	//   90  191:new             #51  <Class HashSet>
	//   91  194:dup             
	//   92  195:invokespecial   #52  <Method void HashSet()>
	//   93  198:astore          9
		for(Iterator iterator = node.iterator(); iterator.hasNext(); ((Set) (obj)).add(((Object) (((NamedNode)iterator.next()).getName()))));
	//   94  200:aload_2         
	//   95  201:invokeinterface #56  <Method Iterator Node.iterator()>
	//   96  206:astore          10
	//   97  208:aload           10
	//   98  210:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//   99  215:ifeq            242
	//  100  218:aload           9
	//  101  220:aload           10
	//  102  222:invokeinterface #65  <Method Object Iterator.next()>
	//  103  227:checkcast       #67  <Class NamedNode>
	//  104  230:invokevirtual   #71  <Method ChildKey NamedNode.getName()>
	//  105  233:invokeinterface #77  <Method boolean Set.add(Object)>
	//  106  238:pop             
	//* 107  239:goto            208
		for(Iterator iterator1 = node1.iterator(); iterator1.hasNext(); ((Set) (obj)).add(((Object) (((NamedNode)iterator1.next()).getName()))));
	//  108  242:aload_3         
	//  109  243:invokeinterface #56  <Method Iterator Node.iterator()>
	//  110  248:astore          10
	//  111  250:aload           10
	//  112  252:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//  113  257:ifeq            284
	//  114  260:aload           9
	//  115  262:aload           10
	//  116  264:invokeinterface #65  <Method Object Iterator.next()>
	//  117  269:checkcast       #67  <Class NamedNode>
	//  118  272:invokevirtual   #71  <Method ChildKey NamedNode.getName()>
	//  119  275:invokeinterface #77  <Method boolean Set.add(Object)>
	//  120  280:pop             
	//* 121  281:goto            250
		Object obj1 = ((Object) (new ArrayList(((Set) (obj)).size() + 1)));
	//  122  284:new             #79  <Class ArrayList>
	//  123  287:dup             
	//  124  288:aload           9
	//  125  290:invokeinterface #83  <Method int Set.size()>
	//  126  295:iconst_1        
	//  127  296:iadd            
	//  128  297:invokespecial   #86  <Method void ArrayList(int)>
	//  129  300:astore          10
		((List) (obj1)).addAll(((java.util.Collection) (obj)));
	//  130  302:aload           10
	//  131  304:aload           9
	//  132  306:invokeinterface #92  <Method boolean List.addAll(java.util.Collection)>
	//  133  311:pop             
		if(!node1.getPriority().isEmpty() || !node.getPriority().isEmpty())
	//* 134  312:aload_3         
	//* 135  313:invokeinterface #96  <Method Node Node.getPriority()>
	//* 136  318:invokeinterface #99  <Method boolean Node.isEmpty()>
	//* 137  323:ifeq            340
	//* 138  326:aload_2         
	//* 139  327:invokeinterface #96  <Method Node Node.getPriority()>
	//* 140  332:invokeinterface #99  <Method boolean Node.isEmpty()>
	//* 141  337:ifne            351
			((List) (obj1)).add(((Object) (ChildKey.getPriorityKey())));
	//  142  340:aload           10
	//  143  342:invokestatic    #104 <Method ChildKey ChildKey.getPriorityKey()>
	//  144  345:invokeinterface #105 <Method boolean List.add(Object)>
	//  145  350:pop             
		obj1 = ((Object) (((List) (obj1)).iterator()));
	//  146  351:aload           10
	//  147  353:invokeinterface #106 <Method Iterator List.iterator()>
	//  148  358:astore          10
		obj = ((Object) (node));
	//  149  360:aload_2         
	//  150  361:astore          9
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//  151  363:aload           10
	//  152  365:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//  153  370:ifeq            446
			ChildKey childkey = (ChildKey)((Iterator) (obj1)).next();
	//  154  373:aload           10
	//  155  375:invokeinterface #65  <Method Object Iterator.next()>
	//  156  380:checkcast       #101 <Class ChildKey>
	//  157  383:astore          11
			Node node2 = node.getImmediateChild(childkey);
	//  158  385:aload_2         
	//  159  386:aload           11
	//  160  388:invokeinterface #110 <Method Node Node.getImmediateChild(ChildKey)>
	//  161  393:astore          12
			Node node3 = updateRangeInNode(path.child(childkey), node.getImmediateChild(childkey), node1.getImmediateChild(childkey));
	//  162  395:aload_0         
	//  163  396:aload_1         
	//  164  397:aload           11
	//  165  399:invokevirtual   #114 <Method Path Path.child(ChildKey)>
	//  166  402:aload_2         
	//  167  403:aload           11
	//  168  405:invokeinterface #110 <Method Node Node.getImmediateChild(ChildKey)>
	//  169  410:aload_3         
	//  170  411:aload           11
	//  171  413:invokeinterface #110 <Method Node Node.getImmediateChild(ChildKey)>
	//  172  418:invokespecial   #116 <Method Node updateRangeInNode(Path, Node, Node)>
	//  173  421:astore          13
			if(node3 != node2)
	//* 174  423:aload           13
	//* 175  425:aload           12
	//* 176  427:if_acmpeq       363
				obj = ((Object) (((Node) (obj)).updateImmediateChild(childkey, node3)));
	//  177  430:aload           9
	//  178  432:aload           11
	//  179  434:aload           13
	//  180  436:invokeinterface #120 <Method Node Node.updateImmediateChild(ChildKey, Node)>
	//  181  441:astore          9
		} while(true);
	//  182  443:goto            363
		return ((Node) (obj));
	//  183  446:aload           9
	//  184  448:areturn         
	}

	public Node applyTo(Node node)
	{
		return updateRangeInNode(Path.getEmptyPath(), node, snap);
	//    0    0:aload_0         
	//    1    1:invokestatic    #126 <Method Path Path.getEmptyPath()>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field Node snap>
	//    5    9:invokespecial   #116 <Method Node updateRangeInNode(Path, Node, Node)>
	//    6   12:areturn         
	}

	Path getEnd()
	{
		return optInclusiveEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Path optInclusiveEnd>
	//    2    4:areturn         
	}

	Path getStart()
	{
		return optExclusiveStart;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Path optExclusiveStart>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #132 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #133 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("RangeMerge{optExclusiveStart=");
	//    4    8:aload_1         
	//    5    9:ldc1            #135 <String "RangeMerge{optExclusiveStart=">
	//    6   11:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (optExclusiveStart)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #21  <Field Path optExclusiveStart>
	//   11   20:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", optInclusiveEnd=");
	//   13   24:aload_1         
	//   14   25:ldc1            #144 <String ", optInclusiveEnd=">
	//   15   27:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (optInclusiveEnd)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #23  <Field Path optInclusiveEnd>
	//   20   36:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(", snap=");
	//   22   40:aload_1         
	//   23   41:ldc1            #146 <String ", snap=">
	//   24   43:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(((Object) (snap)));
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #25  <Field Node snap>
	//   29   52:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		stringbuilder.append('}');
	//   31   56:aload_1         
	//   32   57:bipush          125
	//   33   59:invokevirtual   #149 <Method StringBuilder StringBuilder.append(char)>
	//   34   62:pop             
		return stringbuilder.toString();
	//   35   63:aload_1         
	//   36   64:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   37   67:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private final Path optExclusiveStart;
	private final Path optInclusiveEnd;
	private final Node snap;

	static 
	{
	//    0    0:return          
	}
}
