// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import com.firebase.client.collection.ImmutableSortedMap;
import com.firebase.client.core.Path;
import com.firebase.client.utilities.Utilities;
import java.util.*;

// Referenced classes of package com.firebase.client.snapshot:
//			Node, PriorityUtilities, ChildKey, NamedNode, 
//			PriorityIndex, EmptyNode

public class ChildrenNode
	implements Node
{
	public static abstract class ChildVisitor extends com.firebase.client.collection.LLRBNode.NodeVisitor
	{

		public abstract void visitChild(ChildKey childkey, Node node);

		public void visitEntry(ChildKey childkey, Node node)
		{
			visitChild(childkey, node);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #18  <Method void visitChild(ChildKey, Node)>
		//    4    6:return          
		}

		public volatile void visitEntry(Object obj, Object obj1)
		{
			visitEntry((ChildKey)obj, (Node)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #21  <Class ChildKey>
		//    3    5:aload_2         
		//    4    6:checkcast       #23  <Class Node>
		//    5    9:invokevirtual   #25  <Method void visitEntry(ChildKey, Node)>
		//    6   12:return          
		}

		public ChildVisitor()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void com.firebase.client.collection.LLRBNode$NodeVisitor()>
		//    2    4:return          
		}
	}

	private static class NamedNodeIterator
		implements Iterator
	{

		public boolean hasNext()
		{
			return iterator.hasNext();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Iterator iterator>
		//    2    4:invokeinterface #27  <Method boolean Iterator.hasNext()>
		//    3    9:ireturn         
		}

		public NamedNode next()
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Iterator iterator>
		//    2    4:invokeinterface #32  <Method Object Iterator.next()>
		//    3    9:checkcast       #34  <Class java.util.Map$Entry>
		//    4   12:astore_1        
			return new NamedNode((ChildKey)entry.getKey(), (Node)entry.getValue());
		//    5   13:new             #36  <Class NamedNode>
		//    6   16:dup             
		//    7   17:aload_1         
		//    8   18:invokeinterface #39  <Method Object java.util.Map$Entry.getKey()>
		//    9   23:checkcast       #41  <Class ChildKey>
		//   10   26:aload_1         
		//   11   27:invokeinterface #44  <Method Object java.util.Map$Entry.getValue()>
		//   12   32:checkcast       #46  <Class Node>
		//   13   35:invokespecial   #49  <Method void NamedNode(ChildKey, Node)>
		//   14   38:areturn         
		}

		public volatile Object next()
		{
			return ((Object) (next()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #51  <Method NamedNode next()>
		//    2    4:areturn         
		}

		public void remove()
		{
			iterator.remove();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Iterator iterator>
		//    2    4:invokeinterface #54  <Method void Iterator.remove()>
		//    3    9:return          
		}

		private final Iterator iterator;

		public NamedNodeIterator(Iterator iterator1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			iterator = iterator1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Iterator iterator>
		//    5    9:return          
		}
	}


	protected ChildrenNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		lazyHash = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #40  <Field String lazyHash>
		children = com.firebase.client.collection.ImmutableSortedMap.Builder.emptyMap(NAME_ONLY_COMPARATOR);
	//    5    9:aload_0         
	//    6   10:getstatic       #36  <Field Comparator NAME_ONLY_COMPARATOR>
	//    7   13:invokestatic    #46  <Method ImmutableSortedMap com.firebase.client.collection.ImmutableSortedMap$Builder.emptyMap(Comparator)>
	//    8   16:putfield        #48  <Field ImmutableSortedMap children>
		priority = PriorityUtilities.NullPriority();
	//    9   19:aload_0         
	//   10   20:invokestatic    #54  <Method Node PriorityUtilities.NullPriority()>
	//   11   23:putfield        #56  <Field Node priority>
	//   12   26:return          
	}

	protected ChildrenNode(ImmutableSortedMap immutablesortedmap, Node node)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		lazyHash = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #40  <Field String lazyHash>
		if(immutablesortedmap.isEmpty() && !node.isEmpty())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #63  <Method boolean ImmutableSortedMap.isEmpty()>
	//*   7   13:ifeq            38
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #64  <Method boolean Node.isEmpty()>
	//*  10   22:ifeq            28
	//*  11   25:goto            38
		{
			throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
	//   12   28:new             #66  <Class IllegalArgumentException>
	//   13   31:dup             
	//   14   32:ldc1            #68  <String "Can't create empty ChildrenNode with priority!">
	//   15   34:invokespecial   #71  <Method void IllegalArgumentException(String)>
	//   16   37:athrow          
		} else
		{
			priority = node;
	//   17   38:aload_0         
	//   18   39:aload_2         
	//   19   40:putfield        #56  <Field Node priority>
			children = immutablesortedmap;
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:putfield        #48  <Field ImmutableSortedMap children>
			return;
	//   23   48:return          
		}
	}

	private static void addIndentation(StringBuilder stringbuilder, int i)
	{
		for(int j = 0; j < i; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:iload_1         
	//*   4    4:icmpge          21
			stringbuilder.append(" ");
	//    5    7:aload_0         
	//    6    8:ldc1            #77  <String " ">
	//    7   10:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//    8   13:pop             

	//    9   14:iload_2         
	//   10   15:iconst_1        
	//   11   16:iadd            
	//   12   17:istore_2        
	//*  13   18:goto            2
	//   14   21:return          
	}

	private void toString(StringBuilder stringbuilder, int i)
	{
		if(children.isEmpty() && priority.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field ImmutableSortedMap children>
	//*   2    4:invokevirtual   #63  <Method boolean ImmutableSortedMap.isEmpty()>
	//*   3    7:ifeq            30
	//*   4   10:aload_0         
	//*   5   11:getfield        #56  <Field Node priority>
	//*   6   14:invokeinterface #64  <Method boolean Node.isEmpty()>
	//*   7   19:ifeq            30
		{
			stringbuilder.append("{ }");
	//    8   22:aload_1         
	//    9   23:ldc1            #86  <String "{ }">
	//   10   25:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   11   28:pop             
			return;
	//   12   29:return          
		}
		stringbuilder.append("{\n");
	//   13   30:aload_1         
	//   14   31:ldc1            #88  <String "{\n">
	//   15   33:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   16   36:pop             
		for(Iterator iterator1 = children.iterator(); iterator1.hasNext(); stringbuilder.append("\n"))
	//*  17   37:aload_0         
	//*  18   38:getfield        #48  <Field ImmutableSortedMap children>
	//*  19   41:invokevirtual   #92  <Method Iterator ImmutableSortedMap.iterator()>
	//*  20   44:astore          4
	//*  21   46:aload           4
	//*  22   48:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*  23   53:ifeq            161
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
	//   24   56:aload           4
	//   25   58:invokeinterface #101 <Method Object Iterator.next()>
	//   26   63:checkcast       #103 <Class java.util.Map$Entry>
	//   27   66:astore          5
			int j = i + 2;
	//   28   68:iload_2         
	//   29   69:iconst_2        
	//   30   70:iadd            
	//   31   71:istore_3        
			addIndentation(stringbuilder, j);
	//   32   72:aload_1         
	//   33   73:iload_3         
	//   34   74:invokestatic    #105 <Method void addIndentation(StringBuilder, int)>
			stringbuilder.append(((ChildKey)entry.getKey()).asString());
	//   35   77:aload_1         
	//   36   78:aload           5
	//   37   80:invokeinterface #108 <Method Object java.util.Map$Entry.getKey()>
	//   38   85:checkcast       #110 <Class ChildKey>
	//   39   88:invokevirtual   #114 <Method String ChildKey.asString()>
	//   40   91:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   41   94:pop             
			stringbuilder.append("=");
	//   42   95:aload_1         
	//   43   96:ldc1            #116 <String "=">
	//   44   98:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   45  101:pop             
			if(entry.getValue() instanceof ChildrenNode)
	//*  46  102:aload           5
	//*  47  104:invokeinterface #119 <Method Object java.util.Map$Entry.getValue()>
	//*  48  109:instanceof      #2   <Class ChildrenNode>
	//*  49  112:ifeq            133
				((ChildrenNode)entry.getValue()).toString(stringbuilder, j);
	//   50  115:aload           5
	//   51  117:invokeinterface #119 <Method Object java.util.Map$Entry.getValue()>
	//   52  122:checkcast       #2   <Class ChildrenNode>
	//   53  125:aload_1         
	//   54  126:iload_3         
	//   55  127:invokespecial   #121 <Method void toString(StringBuilder, int)>
			else
	//*  56  130:goto            151
				stringbuilder.append(((Object) ((Node)entry.getValue())).toString());
	//   57  133:aload_1         
	//   58  134:aload           5
	//   59  136:invokeinterface #119 <Method Object java.util.Map$Entry.getValue()>
	//   60  141:checkcast       #6   <Class Node>
	//   61  144:invokevirtual   #123 <Method String Object.toString()>
	//   62  147:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   63  150:pop             
		}

	//   64  151:aload_1         
	//   65  152:ldc1            #125 <String "\n">
	//   66  154:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   67  157:pop             
	//*  68  158:goto            46
		if(!priority.isEmpty())
	//*  69  161:aload_0         
	//*  70  162:getfield        #56  <Field Node priority>
	//*  71  165:invokeinterface #64  <Method boolean Node.isEmpty()>
	//*  72  170:ifne            206
		{
			addIndentation(stringbuilder, i + 2);
	//   73  173:aload_1         
	//   74  174:iload_2         
	//   75  175:iconst_2        
	//   76  176:iadd            
	//   77  177:invokestatic    #105 <Method void addIndentation(StringBuilder, int)>
			stringbuilder.append(".priority=");
	//   78  180:aload_1         
	//   79  181:ldc1            #127 <String ".priority=">
	//   80  183:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   81  186:pop             
			stringbuilder.append(((Object) (priority)).toString());
	//   82  187:aload_1         
	//   83  188:aload_0         
	//   84  189:getfield        #56  <Field Node priority>
	//   85  192:invokevirtual   #123 <Method String Object.toString()>
	//   86  195:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   87  198:pop             
			stringbuilder.append("\n");
	//   88  199:aload_1         
	//   89  200:ldc1            #125 <String "\n">
	//   90  202:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   91  205:pop             
		}
		addIndentation(stringbuilder, i);
	//   92  206:aload_1         
	//   93  207:iload_2         
	//   94  208:invokestatic    #105 <Method void addIndentation(StringBuilder, int)>
		stringbuilder.append("}");
	//   95  211:aload_1         
	//   96  212:ldc1            #129 <String "}">
	//   97  214:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   98  217:pop             
	//   99  218:return          
	}

	public int compareTo(Node node)
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #132 <Method boolean isEmpty()>
	//*   2    4:ifeq            20
			return !node.isEmpty() ? -1 : 0;
	//    3    7:aload_1         
	//    4    8:invokeinterface #64  <Method boolean Node.isEmpty()>
	//    5   13:ifeq            18
	//    6   16:iconst_0        
	//    7   17:ireturn         
	//    8   18:iconst_m1       
	//    9   19:ireturn         
		if(node.isLeafNode())
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #135 <Method boolean Node.isLeafNode()>
	//*  12   26:ifeq            31
			return 1;
	//   13   29:iconst_1        
	//   14   30:ireturn         
		if(node.isEmpty())
	//*  15   31:aload_1         
	//*  16   32:invokeinterface #64  <Method boolean Node.isEmpty()>
	//*  17   37:ifeq            42
			return 1;
	//   18   40:iconst_1        
	//   19   41:ireturn         
		return node != Node.MAX_NODE ? 0 : -1;
	//   20   42:aload_1         
	//   21   43:getstatic       #139 <Field ChildrenNode Node.MAX_NODE>
	//   22   46:if_acmpne       51
	//   23   49:iconst_m1       
	//   24   50:ireturn         
	//   25   51:iconst_0        
	//   26   52:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((Node)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #6   <Class Node>
	//    3    5:invokevirtual   #142 <Method int compareTo(Node)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(obj == this)
	//*   4    6:aload_1         
	//*   5    7:aload_0         
	//*   6    8:if_acmpne       13
			return true;
	//    7   11:iconst_1        
	//    8   12:ireturn         
		if(!(obj instanceof ChildrenNode))
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class ChildrenNode>
	//*  11   17:ifne            22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		Object obj1 = ((Object) ((ChildrenNode)obj));
	//   14   22:aload_1         
	//   15   23:checkcast       #2   <Class ChildrenNode>
	//   16   26:astore_2        
		if(!((Object) (getPriority())).equals(((Object) (((ChildrenNode) (obj1)).getPriority()))))
	//*  17   27:aload_0         
	//*  18   28:invokevirtual   #147 <Method Node getPriority()>
	//*  19   31:aload_2         
	//*  20   32:invokevirtual   #147 <Method Node getPriority()>
	//*  21   35:invokevirtual   #149 <Method boolean Object.equals(Object)>
	//*  22   38:ifne            43
			return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
		if(children.size() != ((ChildrenNode) (obj1)).children.size())
	//*  25   43:aload_0         
	//*  26   44:getfield        #48  <Field ImmutableSortedMap children>
	//*  27   47:invokevirtual   #153 <Method int ImmutableSortedMap.size()>
	//*  28   50:aload_2         
	//*  29   51:getfield        #48  <Field ImmutableSortedMap children>
	//*  30   54:invokevirtual   #153 <Method int ImmutableSortedMap.size()>
	//*  31   57:icmpeq          62
			return false;
	//   32   60:iconst_0        
	//   33   61:ireturn         
		obj = ((Object) (children.iterator()));
	//   34   62:aload_0         
	//   35   63:getfield        #48  <Field ImmutableSortedMap children>
	//   36   66:invokevirtual   #92  <Method Iterator ImmutableSortedMap.iterator()>
	//   37   69:astore_1        
		for(obj1 = ((Object) (((ChildrenNode) (obj1)).children.iterator())); ((Iterator) (obj)).hasNext() && ((Iterator) (obj1)).hasNext();)
	//*  38   70:aload_2         
	//*  39   71:getfield        #48  <Field ImmutableSortedMap children>
	//*  40   74:invokevirtual   #92  <Method Iterator ImmutableSortedMap.iterator()>
	//*  41   77:astore_2        
	//*  42   78:aload_1         
	//*  43   79:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*  44   84:ifeq            163
	//*  45   87:aload_2         
	//*  46   88:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*  47   93:ifeq            163
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   48   96:aload_1         
	//   49   97:invokeinterface #101 <Method Object Iterator.next()>
	//   50  102:checkcast       #103 <Class java.util.Map$Entry>
	//   51  105:astore_3        
			java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj1)).next();
	//   52  106:aload_2         
	//   53  107:invokeinterface #101 <Method Object Iterator.next()>
	//   54  112:checkcast       #103 <Class java.util.Map$Entry>
	//   55  115:astore          4
			if(!((ChildKey)entry.getKey()).equals(entry1.getKey()) || !((Object) ((Node)entry.getValue())).equals(entry1.getValue()))
	//*  56  117:aload_3         
	//*  57  118:invokeinterface #108 <Method Object java.util.Map$Entry.getKey()>
	//*  58  123:checkcast       #110 <Class ChildKey>
	//*  59  126:aload           4
	//*  60  128:invokeinterface #108 <Method Object java.util.Map$Entry.getKey()>
	//*  61  133:invokevirtual   #154 <Method boolean ChildKey.equals(Object)>
	//*  62  136:ifeq            161
	//*  63  139:aload_3         
	//*  64  140:invokeinterface #119 <Method Object java.util.Map$Entry.getValue()>
	//*  65  145:checkcast       #6   <Class Node>
	//*  66  148:aload           4
	//*  67  150:invokeinterface #119 <Method Object java.util.Map$Entry.getValue()>
	//*  68  155:invokevirtual   #149 <Method boolean Object.equals(Object)>
	//*  69  158:ifne            78
				return false;
	//   70  161:iconst_0        
	//   71  162:ireturn         
		}

		if(!((Iterator) (obj)).hasNext() && !((Iterator) (obj1)).hasNext())
	//*  72  163:aload_1         
	//*  73  164:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*  74  169:ifne            183
	//*  75  172:aload_2         
	//*  76  173:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*  77  178:ifne            183
			return true;
	//   78  181:iconst_1        
	//   79  182:ireturn         
		else
			throw new IllegalStateException("Something went wrong internally.");
	//   80  183:new             #156 <Class IllegalStateException>
	//   81  186:dup             
	//   82  187:ldc1            #158 <String "Something went wrong internally.">
	//   83  189:invokespecial   #159 <Method void IllegalStateException(String)>
	//   84  192:athrow          
	}

	public void forEachChild(ChildVisitor childvisitor)
	{
		forEachChild(childvisitor, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #164 <Method void forEachChild(ChildrenNode$ChildVisitor, boolean)>
	//    4    6:return          
	}

	public void forEachChild(final ChildVisitor visitor, boolean flag)
	{
		if(flag && !getPriority().isEmpty())
	//*   0    0:iload_2         
	//*   1    1:ifeq            36
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #147 <Method Node getPriority()>
	//*   4    8:invokeinterface #64  <Method boolean Node.isEmpty()>
	//*   5   13:ifeq            19
	//*   6   16:goto            36
		{
			children.inOrderTraversal(((com.firebase.client.collection.LLRBNode.NodeVisitor) (new com.firebase.client.collection.LLRBNode.NodeVisitor() {

				public void visitEntry(ChildKey childkey, Node node)
				{
					if(!passedPriorityKey && childkey.compareTo(ChildKey.getPriorityKey()) > 0)
				//*   0    0:aload_0         
				//*   1    1:getfield        #27  <Field boolean passedPriorityKey>
				//*   2    4:ifne            39
				//*   3    7:aload_1         
				//*   4    8:invokestatic    #36  <Method ChildKey ChildKey.getPriorityKey()>
				//*   5   11:invokevirtual   #40  <Method int ChildKey.compareTo(ChildKey)>
				//*   6   14:ifle            39
					{
						passedPriorityKey = true;
				//    7   17:aload_0         
				//    8   18:iconst_1        
				//    9   19:putfield        #27  <Field boolean passedPriorityKey>
						visitor.visitChild(ChildKey.getPriorityKey(), getPriority());
				//   10   22:aload_0         
				//   11   23:getfield        #22  <Field ChildrenNode$ChildVisitor val$visitor>
				//   12   26:invokestatic    #36  <Method ChildKey ChildKey.getPriorityKey()>
				//   13   29:aload_0         
				//   14   30:getfield        #20  <Field ChildrenNode this$0>
				//   15   33:invokevirtual   #44  <Method Node ChildrenNode.getPriority()>
				//   16   36:invokevirtual   #49  <Method void ChildrenNode$ChildVisitor.visitChild(ChildKey, Node)>
					}
					visitor.visitChild(childkey, node);
				//   17   39:aload_0         
				//   18   40:getfield        #22  <Field ChildrenNode$ChildVisitor val$visitor>
				//   19   43:aload_1         
				//   20   44:aload_2         
				//   21   45:invokevirtual   #49  <Method void ChildrenNode$ChildVisitor.visitChild(ChildKey, Node)>
				//   22   48:return          
				}

				public volatile void visitEntry(Object obj, Object obj1)
				{
					visitEntry((ChildKey)obj, (Node)obj1);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #32  <Class ChildKey>
				//    3    5:aload_2         
				//    4    6:checkcast       #52  <Class Node>
				//    5    9:invokevirtual   #54  <Method void visitEntry(ChildKey, Node)>
				//    6   12:return          
				}

				boolean passedPriorityKey;
				final ChildrenNode this$0;
				final ChildVisitor val$visitor;

			
			{
				this$0 = ChildrenNode.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ChildrenNode this$0>
				visitor = childvisitor;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field ChildrenNode$ChildVisitor val$visitor>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void com.firebase.client.collection.LLRBNode$NodeVisitor()>
				passedPriorityKey = false;
			//    8   14:aload_0         
			//    9   15:iconst_0        
			//   10   16:putfield        #27  <Field boolean passedPriorityKey>
			//   11   19:return          
			}
			}
)));
	//    7   19:aload_0         
	//    8   20:getfield        #48  <Field ImmutableSortedMap children>
	//    9   23:new             #10  <Class ChildrenNode$2>
	//   10   26:dup             
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:invokespecial   #167 <Method void ChildrenNode$2(ChildrenNode, ChildrenNode$ChildVisitor)>
	//   14   32:invokevirtual   #171 <Method void ImmutableSortedMap.inOrderTraversal(com.firebase.client.collection.LLRBNode$NodeVisitor)>
			return;
	//   15   35:return          
		} else
		{
			children.inOrderTraversal(((com.firebase.client.collection.LLRBNode.NodeVisitor) (visitor)));
	//   16   36:aload_0         
	//   17   37:getfield        #48  <Field ImmutableSortedMap children>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #171 <Method void ImmutableSortedMap.inOrderTraversal(com.firebase.client.collection.LLRBNode$NodeVisitor)>
			return;
	//   20   44:return          
		}
	}

	public Node getChild(Path path)
	{
		ChildKey childkey = path.getFront();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #179 <Method ChildKey Path.getFront()>
	//    2    4:astore_2        
		if(childkey == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return ((Node) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
		else
			return getImmediateChild(childkey).getChild(path.popFront());
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #183 <Method Node getImmediateChild(ChildKey)>
	//   10   16:aload_1         
	//   11   17:invokevirtual   #187 <Method Path Path.popFront()>
	//   12   20:invokeinterface #189 <Method Node Node.getChild(Path)>
	//   13   25:areturn         
	}

	public int getChildCount()
	{
		return children.size();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ImmutableSortedMap children>
	//    2    4:invokevirtual   #153 <Method int ImmutableSortedMap.size()>
	//    3    7:ireturn         
	}

	public ChildKey getFirstChildKey()
	{
		return (ChildKey)children.getMinKey();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ImmutableSortedMap children>
	//    2    4:invokevirtual   #194 <Method Object ImmutableSortedMap.getMinKey()>
	//    3    7:checkcast       #110 <Class ChildKey>
	//    4   10:areturn         
	}

	public String getHash()
	{
		if(lazyHash == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field String lazyHash>
	//*   2    4:ifnonnull       38
		{
			String s = getHashRepresentation(Node.HashVersion.V1);
	//    3    7:aload_0         
	//    4    8:getstatic       #201 <Field Node$HashVersion Node$HashVersion.V1>
	//    5   11:invokevirtual   #205 <Method String getHashRepresentation(Node$HashVersion)>
	//    6   14:astore_1        
			if(s.isEmpty())
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #208 <Method boolean String.isEmpty()>
	//*   9   19:ifeq            28
				s = "";
	//   10   22:ldc1            #210 <String "">
	//   11   24:astore_1        
			else
	//*  12   25:goto            33
				s = Utilities.sha1HexDigest(s);
	//   13   28:aload_1         
	//   14   29:invokestatic    #216 <Method String Utilities.sha1HexDigest(String)>
	//   15   32:astore_1        
			lazyHash = s;
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:putfield        #40  <Field String lazyHash>
		}
		return lazyHash;
	//   19   38:aload_0         
	//   20   39:getfield        #40  <Field String lazyHash>
	//   21   42:areturn         
	}

	public String getHashRepresentation(Node.HashVersion hashversion)
	{
		if(hashversion == Node.HashVersion.V1)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #201 <Field Node$HashVersion Node$HashVersion.V1>
	//*   2    4:if_acmpne       242
		{
			hashversion = ((Node.HashVersion) (new StringBuilder()));
	//    3    7:new             #79  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #217 <Method void StringBuilder()>
	//    6   14:astore_1        
			if(!priority.isEmpty())
	//*   7   15:aload_0         
	//*   8   16:getfield        #56  <Field Node priority>
	//*   9   19:invokeinterface #64  <Method boolean Node.isEmpty()>
	//*  10   24:ifne            58
			{
				((StringBuilder) (hashversion)).append("priority:");
	//   11   27:aload_1         
	//   12   28:ldc1            #219 <String "priority:">
	//   13   30:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
				((StringBuilder) (hashversion)).append(priority.getHashRepresentation(Node.HashVersion.V1));
	//   15   34:aload_1         
	//   16   35:aload_0         
	//   17   36:getfield        #56  <Field Node priority>
	//   18   39:getstatic       #201 <Field Node$HashVersion Node$HashVersion.V1>
	//   19   42:invokeinterface #220 <Method String Node.getHashRepresentation(Node$HashVersion)>
	//   20   47:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   21   50:pop             
				((StringBuilder) (hashversion)).append(":");
	//   22   51:aload_1         
	//   23   52:ldc1            #222 <String ":">
	//   24   54:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   25   57:pop             
			}
			Object obj = ((Object) (new ArrayList()));
	//   26   58:new             #224 <Class ArrayList>
	//   27   61:dup             
	//   28   62:invokespecial   #225 <Method void ArrayList()>
	//   29   65:astore_3        
			Iterator iterator1 = iterator();
	//   30   66:aload_0         
	//   31   67:invokevirtual   #226 <Method Iterator iterator()>
	//   32   70:astore          4
			boolean flag = false;
	//   33   72:iconst_0        
	//   34   73:istore_2        
			while(iterator1.hasNext()) 
	//*  35   74:aload           4
	//*  36   76:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*  37   81:ifeq            140
			{
				NamedNode namednode1 = (NamedNode)iterator1.next();
	//   38   84:aload           4
	//   39   86:invokeinterface #101 <Method Object Iterator.next()>
	//   40   91:checkcast       #228 <Class NamedNode>
	//   41   94:astore          5
				((List) (obj)).add(((Object) (namednode1)));
	//   42   96:aload_3         
	//   43   97:aload           5
	//   44   99:invokeinterface #233 <Method boolean List.add(Object)>
	//   45  104:pop             
				if(!flag && namednode1.getNode().getPriority().isEmpty())
	//*  46  105:iload_2         
	//*  47  106:ifne            135
	//*  48  109:aload           5
	//*  49  111:invokevirtual   #236 <Method Node NamedNode.getNode()>
	//*  50  114:invokeinterface #237 <Method Node Node.getPriority()>
	//*  51  119:invokeinterface #64  <Method boolean Node.isEmpty()>
	//*  52  124:ifne            130
	//*  53  127:goto            135
					flag = false;
	//   54  130:iconst_0        
	//   55  131:istore_2        
				else
	//*  56  132:goto            74
					flag = true;
	//   57  135:iconst_1        
	//   58  136:istore_2        
			}
	//*  59  137:goto            74
			if(flag)
	//*  60  140:iload_2         
	//*  61  141:ifeq            151
				Collections.sort(((List) (obj)), ((Comparator) (PriorityIndex.getInstance())));
	//   62  144:aload_3         
	//   63  145:invokestatic    #243 <Method PriorityIndex PriorityIndex.getInstance()>
	//   64  148:invokestatic    #249 <Method void Collections.sort(List, Comparator)>
			obj = ((Object) (((List) (obj)).iterator()));
	//   65  151:aload_3         
	//   66  152:invokeinterface #250 <Method Iterator List.iterator()>
	//   67  157:astore_3        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   68  158:aload_3         
	//   69  159:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//   70  164:ifeq            237
				NamedNode namednode = (NamedNode)((Iterator) (obj)).next();
	//   71  167:aload_3         
	//   72  168:invokeinterface #101 <Method Object Iterator.next()>
	//   73  173:checkcast       #228 <Class NamedNode>
	//   74  176:astore          4
				String s = namednode.getNode().getHash();
	//   75  178:aload           4
	//   76  180:invokevirtual   #236 <Method Node NamedNode.getNode()>
	//   77  183:invokeinterface #252 <Method String Node.getHash()>
	//   78  188:astore          5
				if(!s.equals(""))
	//*  79  190:aload           5
	//*  80  192:ldc1            #210 <String "">
	//*  81  194:invokevirtual   #253 <Method boolean String.equals(Object)>
	//*  82  197:ifne            158
				{
					((StringBuilder) (hashversion)).append(":");
	//   83  200:aload_1         
	//   84  201:ldc1            #222 <String ":">
	//   85  203:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   86  206:pop             
					((StringBuilder) (hashversion)).append(namednode.getName().asString());
	//   87  207:aload_1         
	//   88  208:aload           4
	//   89  210:invokevirtual   #256 <Method ChildKey NamedNode.getName()>
	//   90  213:invokevirtual   #114 <Method String ChildKey.asString()>
	//   91  216:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   92  219:pop             
					((StringBuilder) (hashversion)).append(":");
	//   93  220:aload_1         
	//   94  221:ldc1            #222 <String ":">
	//   95  223:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   96  226:pop             
					((StringBuilder) (hashversion)).append(s);
	//   97  227:aload_1         
	//   98  228:aload           5
	//   99  230:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//  100  233:pop             
				}
			} while(true);
	//  101  234:goto            158
			return ((StringBuilder) (hashversion)).toString();
	//  102  237:aload_1         
	//  103  238:invokevirtual   #257 <Method String StringBuilder.toString()>
	//  104  241:areturn         
		} else
		{
			throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
	//  105  242:new             #66  <Class IllegalArgumentException>
	//  106  245:dup             
	//  107  246:ldc2            #259 <String "Hashes on children nodes only supported for V1">
	//  108  249:invokespecial   #71  <Method void IllegalArgumentException(String)>
	//  109  252:athrow          
		}
	}

	public Node getImmediateChild(ChildKey childkey)
	{
		if(childkey.isPriorityChildName() && !priority.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #262 <Method boolean ChildKey.isPriorityChildName()>
	//*   2    4:ifeq            24
	//*   3    7:aload_0         
	//*   4    8:getfield        #56  <Field Node priority>
	//*   5   11:invokeinterface #64  <Method boolean Node.isEmpty()>
	//*   6   16:ifne            24
			return priority;
	//    7   19:aload_0         
	//    8   20:getfield        #56  <Field Node priority>
	//    9   23:areturn         
		if(children.containsKey(((Object) (childkey))))
	//*  10   24:aload_0         
	//*  11   25:getfield        #48  <Field ImmutableSortedMap children>
	//*  12   28:aload_1         
	//*  13   29:invokevirtual   #265 <Method boolean ImmutableSortedMap.containsKey(Object)>
	//*  14   32:ifeq            47
			return (Node)children.get(((Object) (childkey)));
	//   15   35:aload_0         
	//   16   36:getfield        #48  <Field ImmutableSortedMap children>
	//   17   39:aload_1         
	//   18   40:invokevirtual   #269 <Method Object ImmutableSortedMap.get(Object)>
	//   19   43:checkcast       #6   <Class Node>
	//   20   46:areturn         
		else
			return ((Node) (EmptyNode.Empty()));
	//   21   47:invokestatic    #275 <Method EmptyNode EmptyNode.Empty()>
	//   22   50:areturn         
	}

	public ChildKey getLastChildKey()
	{
		return (ChildKey)children.getMaxKey();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ImmutableSortedMap children>
	//    2    4:invokevirtual   #279 <Method Object ImmutableSortedMap.getMaxKey()>
	//    3    7:checkcast       #110 <Class ChildKey>
	//    4   10:areturn         
	}

	public ChildKey getPredecessorChildKey(ChildKey childkey)
	{
		return (ChildKey)children.getPredecessorKey(((Object) (childkey)));
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ImmutableSortedMap children>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #284 <Method Object ImmutableSortedMap.getPredecessorKey(Object)>
	//    4    8:checkcast       #110 <Class ChildKey>
	//    5   11:areturn         
	}

	public Node getPriority()
	{
		return priority;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Node priority>
	//    2    4:areturn         
	}

	public ChildKey getSuccessorChildKey(ChildKey childkey)
	{
		return (ChildKey)children.getSuccessorKey(((Object) (childkey)));
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ImmutableSortedMap children>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #288 <Method Object ImmutableSortedMap.getSuccessorKey(Object)>
	//    4    8:checkcast       #110 <Class ChildKey>
	//    5   11:areturn         
	}

	public Object getValue()
	{
		return getValue(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #291 <Method Object getValue(boolean)>
	//    3    5:areturn         
	}

	public Object getValue(boolean flag)
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #132 <Method boolean isEmpty()>
	//*   2    4:ifeq            9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		HashMap hashmap = new HashMap();
	//    5    9:new             #293 <Class HashMap>
	//    6   12:dup             
	//    7   13:invokespecial   #294 <Method void HashMap()>
	//    8   16:astore          7
		Iterator iterator1 = children.iterator();
	//    9   18:aload_0         
	//   10   19:getfield        #48  <Field ImmutableSortedMap children>
	//   11   22:invokevirtual   #92  <Method Iterator ImmutableSortedMap.iterator()>
	//   12   25:astore          8
		boolean flag2 = false;
	//   13   27:iconst_0        
	//   14   28:istore          5
		int k = 0;
	//   15   30:iconst_0        
	//   16   31:istore          4
		boolean flag1 = true;
	//   17   33:iconst_1        
	//   18   34:istore_2        
		int j = 0;
	//   19   35:iconst_0        
	//   20   36:istore_3        
		do
		{
			if(!iterator1.hasNext())
				break;
	//   21   37:aload           8
	//   22   39:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//   23   44:ifeq            198
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
	//   24   47:aload           8
	//   25   49:invokeinterface #101 <Method Object Iterator.next()>
	//   26   54:checkcast       #103 <Class java.util.Map$Entry>
	//   27   57:astore          9
			String s = ((ChildKey)entry.getKey()).asString();
	//   28   59:aload           9
	//   29   61:invokeinterface #108 <Method Object java.util.Map$Entry.getKey()>
	//   30   66:checkcast       #110 <Class ChildKey>
	//   31   69:invokevirtual   #114 <Method String ChildKey.asString()>
	//   32   72:astore          10
			((Map) (hashmap)).put(((Object) (s)), ((Node)entry.getValue()).getValue(flag));
	//   33   74:aload           7
	//   34   76:aload           10
	//   35   78:aload           9
	//   36   80:invokeinterface #119 <Method Object java.util.Map$Entry.getValue()>
	//   37   85:checkcast       #6   <Class Node>
	//   38   88:iload_1         
	//   39   89:invokeinterface #295 <Method Object Node.getValue(boolean)>
	//   40   94:invokeinterface #301 <Method Object Map.put(Object, Object)>
	//   41   99:pop             
			int l = k + 1;
	//   42  100:iload           4
	//   43  102:iconst_1        
	//   44  103:iadd            
	//   45  104:istore          6
			k = l;
	//   46  106:iload           6
	//   47  108:istore          4
			if(flag1)
	//*  48  110:iload_2         
	//*  49  111:ifeq            37
				if(s.length() > 1 && s.charAt(0) == '0')
	//*  50  114:aload           10
	//*  51  116:invokevirtual   #304 <Method int String.length()>
	//*  52  119:iconst_1        
	//*  53  120:icmple          143
	//*  54  123:aload           10
	//*  55  125:iconst_0        
	//*  56  126:invokevirtual   #308 <Method char String.charAt(int)>
	//*  57  129:bipush          48
	//*  58  131:icmpne          143
				{
					flag1 = false;
	//   59  134:iconst_0        
	//   60  135:istore_2        
					k = l;
	//   61  136:iload           6
	//   62  138:istore          4
				} else
	//*  63  140:goto            37
				{
					Integer integer = Utilities.tryParseInt(s);
	//   64  143:aload           10
	//   65  145:invokestatic    #312 <Method Integer Utilities.tryParseInt(String)>
	//   66  148:astore          9
					if(integer != null && integer.intValue() >= 0)
	//*  67  150:aload           9
	//*  68  152:ifnull          189
	//*  69  155:aload           9
	//*  70  157:invokevirtual   #317 <Method int Integer.intValue()>
	//*  71  160:iflt            189
					{
						k = l;
	//   72  163:iload           6
	//   73  165:istore          4
						if(integer.intValue() > j)
	//*  74  167:aload           9
	//*  75  169:invokevirtual   #317 <Method int Integer.intValue()>
	//*  76  172:iload_3         
	//*  77  173:icmple          37
						{
							j = integer.intValue();
	//   78  176:aload           9
	//   79  178:invokevirtual   #317 <Method int Integer.intValue()>
	//   80  181:istore_3        
							k = l;
	//   81  182:iload           6
	//   82  184:istore          4
						}
					} else
	//*  83  186:goto            37
					{
						flag1 = false;
	//   84  189:iconst_0        
	//   85  190:istore_2        
						k = l;
	//   86  191:iload           6
	//   87  193:istore          4
					}
				}
		} while(true);
	//   88  195:goto            37
		if(!flag && flag1 && j < k * 2)
	//*  89  198:iload_1         
	//*  90  199:ifne            288
	//*  91  202:iload_2         
	//*  92  203:ifeq            288
	//*  93  206:iload_3         
	//*  94  207:iload           4
	//*  95  209:iconst_2        
	//*  96  210:imul            
	//*  97  211:icmpge          288
		{
			ArrayList arraylist = new ArrayList(j + 1);
	//   98  214:new             #224 <Class ArrayList>
	//   99  217:dup             
	//  100  218:iload_3         
	//  101  219:iconst_1        
	//  102  220:iadd            
	//  103  221:invokespecial   #320 <Method void ArrayList(int)>
	//  104  224:astore          8
			for(int i = ((int) (flag2)); i <= j; i++)
	//* 105  226:iload           5
	//* 106  228:istore_2        
	//* 107  229:iload_2         
	//* 108  230:iload_3         
	//* 109  231:icmpgt          285
			{
				StringBuilder stringbuilder = new StringBuilder();
	//  110  234:new             #79  <Class StringBuilder>
	//  111  237:dup             
	//  112  238:invokespecial   #217 <Method void StringBuilder()>
	//  113  241:astore          9
				stringbuilder.append("");
	//  114  243:aload           9
	//  115  245:ldc1            #210 <String "">
	//  116  247:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//  117  250:pop             
				stringbuilder.append(i);
	//  118  251:aload           9
	//  119  253:iload_2         
	//  120  254:invokevirtual   #323 <Method StringBuilder StringBuilder.append(int)>
	//  121  257:pop             
				((List) (arraylist)).add(((Map) (hashmap)).get(((Object) (stringbuilder.toString()))));
	//  122  258:aload           8
	//  123  260:aload           7
	//  124  262:aload           9
	//  125  264:invokevirtual   #257 <Method String StringBuilder.toString()>
	//  126  267:invokeinterface #324 <Method Object Map.get(Object)>
	//  127  272:invokeinterface #233 <Method boolean List.add(Object)>
	//  128  277:pop             
			}

	//  129  278:iload_2         
	//  130  279:iconst_1        
	//  131  280:iadd            
	//  132  281:istore_2        
	//* 133  282:goto            229
			return ((Object) (arraylist));
	//  134  285:aload           8
	//  135  287:areturn         
		}
		if(flag && !priority.isEmpty())
	//* 136  288:iload_1         
	//* 137  289:ifeq            324
	//* 138  292:aload_0         
	//* 139  293:getfield        #56  <Field Node priority>
	//* 140  296:invokeinterface #64  <Method boolean Node.isEmpty()>
	//* 141  301:ifne            324
			((Map) (hashmap)).put(".priority", priority.getValue());
	//  142  304:aload           7
	//  143  306:ldc2            #326 <String ".priority">
	//  144  309:aload_0         
	//  145  310:getfield        #56  <Field Node priority>
	//  146  313:invokeinterface #327 <Method Object Node.getValue()>
	//  147  318:invokeinterface #301 <Method Object Map.put(Object, Object)>
	//  148  323:pop             
		return ((Object) (hashmap));
	//  149  324:aload           7
	//  150  326:areturn         
	}

	public boolean hasChild(ChildKey childkey)
	{
		return getImmediateChild(childkey).isEmpty() ^ true;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #183 <Method Node getImmediateChild(ChildKey)>
	//    3    5:invokeinterface #64  <Method boolean Node.isEmpty()>
	//    4   10:iconst_1        
	//    5   11:ixor            
	//    6   12:ireturn         
	}

	public int hashCode()
	{
		Iterator iterator1 = iterator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #226 <Method Iterator iterator()>
	//    2    4:astore_2        
		int i;
		NamedNode namednode;
		for(i = 0; iterator1.hasNext(); i = (i * 31 + namednode.getName().hashCode()) * 17 + ((Object) (namednode.getNode())).hashCode())
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:aload_2         
	//*   6    8:invokeinterface #97  <Method boolean Iterator.hasNext()>
	//*   7   13:ifeq            53
			namednode = (NamedNode)iterator1.next();
	//    8   16:aload_2         
	//    9   17:invokeinterface #101 <Method Object Iterator.next()>
	//   10   22:checkcast       #228 <Class NamedNode>
	//   11   25:astore_3        

	//   12   26:iload_1         
	//   13   27:bipush          31
	//   14   29:imul            
	//   15   30:aload_3         
	//   16   31:invokevirtual   #256 <Method ChildKey NamedNode.getName()>
	//   17   34:invokevirtual   #332 <Method int ChildKey.hashCode()>
	//   18   37:iadd            
	//   19   38:bipush          17
	//   20   40:imul            
	//   21   41:aload_3         
	//   22   42:invokevirtual   #236 <Method Node NamedNode.getNode()>
	//   23   45:invokevirtual   #333 <Method int Object.hashCode()>
	//   24   48:iadd            
	//   25   49:istore_1        
	//*  26   50:goto            7
		return i;
	//   27   53:iload_1         
	//   28   54:ireturn         
	}

	public boolean isEmpty()
	{
		return children.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ImmutableSortedMap children>
	//    2    4:invokevirtual   #63  <Method boolean ImmutableSortedMap.isEmpty()>
	//    3    7:ireturn         
	}

	public boolean isLeafNode()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new NamedNodeIterator(children.iterator())));
	//    0    0:new             #15  <Class ChildrenNode$NamedNodeIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field ImmutableSortedMap children>
	//    4    8:invokevirtual   #92  <Method Iterator ImmutableSortedMap.iterator()>
	//    5   11:invokespecial   #336 <Method void ChildrenNode$NamedNodeIterator(Iterator)>
	//    6   14:areturn         
	}

	public Iterator reverseIterator()
	{
		return ((Iterator) (new NamedNodeIterator(children.reverseIterator())));
	//    0    0:new             #15  <Class ChildrenNode$NamedNodeIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field ImmutableSortedMap children>
	//    4    8:invokevirtual   #340 <Method Iterator ImmutableSortedMap.reverseIterator()>
	//    5   11:invokespecial   #336 <Method void ChildrenNode$NamedNodeIterator(Iterator)>
	//    6   14:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #79  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #217 <Method void StringBuilder()>
	//    3    7:astore_1        
		toString(stringbuilder, 0);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokespecial   #121 <Method void toString(StringBuilder, int)>
		return stringbuilder.toString();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #257 <Method String StringBuilder.toString()>
	//   10   18:areturn         
	}

	public Node updateChild(Path path, Node node)
	{
		ChildKey childkey = path.getFront();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #179 <Method ChildKey Path.getFront()>
	//    2    4:astore_3        
		if(childkey == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       11
			return node;
	//    5    9:aload_2         
	//    6   10:areturn         
		if(childkey.isPriorityChildName())
	//*   7   11:aload_3         
	//*   8   12:invokevirtual   #262 <Method boolean ChildKey.isPriorityChildName()>
	//*   9   15:ifeq            24
			return updatePriority(node);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #346 <Method Node updatePriority(Node)>
	//   13   23:areturn         
		else
			return updateImmediateChild(childkey, getImmediateChild(childkey).updateChild(path.popFront(), node));
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:aload_0         
	//   17   27:aload_3         
	//   18   28:invokevirtual   #183 <Method Node getImmediateChild(ChildKey)>
	//   19   31:aload_1         
	//   20   32:invokevirtual   #187 <Method Path Path.popFront()>
	//   21   35:aload_2         
	//   22   36:invokeinterface #348 <Method Node Node.updateChild(Path, Node)>
	//   23   41:invokevirtual   #352 <Method Node updateImmediateChild(ChildKey, Node)>
	//   24   44:areturn         
	}

	public Node updateImmediateChild(ChildKey childkey, Node node)
	{
		if(childkey.isPriorityChildName())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #262 <Method boolean ChildKey.isPriorityChildName()>
	//*   2    4:ifeq            13
			return updatePriority(node);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #346 <Method Node updatePriority(Node)>
	//    6   12:areturn         
		ImmutableSortedMap immutablesortedmap1 = children;
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field ImmutableSortedMap children>
	//    9   17:astore          4
		ImmutableSortedMap immutablesortedmap = immutablesortedmap1;
	//   10   19:aload           4
	//   11   21:astore_3        
		if(immutablesortedmap1.containsKey(((Object) (childkey))))
	//*  12   22:aload           4
	//*  13   24:aload_1         
	//*  14   25:invokevirtual   #265 <Method boolean ImmutableSortedMap.containsKey(Object)>
	//*  15   28:ifeq            38
			immutablesortedmap = immutablesortedmap1.remove(((Object) (childkey)));
	//   16   31:aload           4
	//   17   33:aload_1         
	//   18   34:invokevirtual   #356 <Method ImmutableSortedMap ImmutableSortedMap.remove(Object)>
	//   19   37:astore_3        
		immutablesortedmap1 = immutablesortedmap;
	//   20   38:aload_3         
	//   21   39:astore          4
		if(!node.isEmpty())
	//*  22   41:aload_2         
	//*  23   42:invokeinterface #64  <Method boolean Node.isEmpty()>
	//*  24   47:ifne            58
			immutablesortedmap1 = immutablesortedmap.insert(((Object) (childkey)), ((Object) (node)));
	//   25   50:aload_3         
	//   26   51:aload_1         
	//   27   52:aload_2         
	//   28   53:invokevirtual   #360 <Method ImmutableSortedMap ImmutableSortedMap.insert(Object, Object)>
	//   29   56:astore          4
		if(immutablesortedmap1.isEmpty())
	//*  30   58:aload           4
	//*  31   60:invokevirtual   #63  <Method boolean ImmutableSortedMap.isEmpty()>
	//*  32   63:ifeq            70
			return ((Node) (EmptyNode.Empty()));
	//   33   66:invokestatic    #275 <Method EmptyNode EmptyNode.Empty()>
	//   34   69:areturn         
		else
			return ((Node) (new ChildrenNode(immutablesortedmap1, priority)));
	//   35   70:new             #2   <Class ChildrenNode>
	//   36   73:dup             
	//   37   74:aload           4
	//   38   76:aload_0         
	//   39   77:getfield        #56  <Field Node priority>
	//   40   80:invokespecial   #362 <Method void ChildrenNode(ImmutableSortedMap, Node)>
	//   41   83:areturn         
	}

	public Node updatePriority(Node node)
	{
		if(children.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field ImmutableSortedMap children>
	//*   2    4:invokevirtual   #63  <Method boolean ImmutableSortedMap.isEmpty()>
	//*   3    7:ifeq            14
			return ((Node) (EmptyNode.Empty()));
	//    4   10:invokestatic    #275 <Method EmptyNode EmptyNode.Empty()>
	//    5   13:areturn         
		else
			return ((Node) (new ChildrenNode(children, node)));
	//    6   14:new             #2   <Class ChildrenNode>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:getfield        #48  <Field ImmutableSortedMap children>
	//   10   22:aload_1         
	//   11   23:invokespecial   #362 <Method void ChildrenNode(ImmutableSortedMap, Node)>
	//   12   26:areturn         
	}

	static final boolean $assertionsDisabled = false;
	public static Comparator NAME_ONLY_COMPARATOR = new Comparator() {

		public int compare(ChildKey childkey, ChildKey childkey1)
		{
			return childkey.compareTo(childkey1);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #22  <Method int ChildKey.compareTo(ChildKey)>
		//    3    5:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((ChildKey)obj, (ChildKey)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class ChildKey>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class ChildKey>
		//    5    9:invokevirtual   #25  <Method int compare(ChildKey, ChildKey)>
		//    6   12:ireturn         
		}

	}
;
	private final ImmutableSortedMap children;
	private String lazyHash;
	private final Node priority;

	static 
	{
	//    0    0:new             #8   <Class ChildrenNode$1>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void ChildrenNode$1()>
	//    3    7:putstatic       #36  <Field Comparator NAME_ONLY_COMPARATOR>
	//*   4   10:return          
	}
}
