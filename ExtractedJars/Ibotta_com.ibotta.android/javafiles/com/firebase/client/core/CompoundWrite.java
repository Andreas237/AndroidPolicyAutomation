// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.collection.ImmutableSortedMap;
import com.firebase.client.core.utilities.ImmutableTree;
import com.firebase.client.snapshot.*;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			Path

public class CompoundWrite
	implements Iterable
{

	private CompoundWrite(ImmutableTree immutabletree)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		writeTree = immutabletree;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field ImmutableTree writeTree>
	//    5    9:return          
	}

	private Node applySubtreeWrite(Path path, ImmutableTree immutabletree, Node node)
	{
		if(immutabletree.getValue() != null)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #45  <Method Object ImmutableTree.getValue()>
	//*   2    4:ifnull          22
			return node.updateChild(path, (Node)immutabletree.getValue());
	//    3    7:aload_3         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #45  <Method Object ImmutableTree.getValue()>
	//    7   13:checkcast       #47  <Class Node>
	//    8   16:invokeinterface #51  <Method Node Node.updateChild(Path, Node)>
	//    9   21:areturn         
		Object obj = null;
	//   10   22:aconst_null     
	//   11   23:astore          4
		Iterator iterator1 = immutabletree.getChildren().iterator();
	//   12   25:aload_2         
	//   13   26:invokevirtual   #55  <Method ImmutableSortedMap ImmutableTree.getChildren()>
	//   14   29:invokevirtual   #61  <Method Iterator ImmutableSortedMap.iterator()>
	//   15   32:astore          5
		immutabletree = ((ImmutableTree) (obj));
	//   16   34:aload           4
	//   17   36:astore_2        
		while(iterator1.hasNext()) 
	//*  18   37:aload           5
	//*  19   39:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  20   44:ifeq            120
		{
			Object obj1 = ((Object) ((java.util.Map.Entry)iterator1.next()));
	//   21   47:aload           5
	//   22   49:invokeinterface #70  <Method Object Iterator.next()>
	//   23   54:checkcast       #72  <Class java.util.Map$Entry>
	//   24   57:astore          6
			obj = ((Object) ((ImmutableTree)((java.util.Map.Entry) (obj1)).getValue()));
	//   25   59:aload           6
	//   26   61:invokeinterface #73  <Method Object java.util.Map$Entry.getValue()>
	//   27   66:checkcast       #23  <Class ImmutableTree>
	//   28   69:astore          4
			obj1 = ((Object) ((ChildKey)((java.util.Map.Entry) (obj1)).getKey()));
	//   29   71:aload           6
	//   30   73:invokeinterface #76  <Method Object java.util.Map$Entry.getKey()>
	//   31   78:checkcast       #78  <Class ChildKey>
	//   32   81:astore          6
			if(((ChildKey) (obj1)).isPriorityChildName())
	//*  33   83:aload           6
	//*  34   85:invokevirtual   #81  <Method boolean ChildKey.isPriorityChildName()>
	//*  35   88:ifeq            103
				immutabletree = ((ImmutableTree) ((Node)((ImmutableTree) (obj)).getValue()));
	//   36   91:aload           4
	//   37   93:invokevirtual   #45  <Method Object ImmutableTree.getValue()>
	//   38   96:checkcast       #47  <Class Node>
	//   39   99:astore_2        
			else
	//*  40  100:goto            37
				node = applySubtreeWrite(path.child(((ChildKey) (obj1))), ((ImmutableTree) (obj)), node);
	//   41  103:aload_0         
	//   42  104:aload_1         
	//   43  105:aload           6
	//   44  107:invokevirtual   #87  <Method Path Path.child(ChildKey)>
	//   45  110:aload           4
	//   46  112:aload_3         
	//   47  113:invokespecial   #89  <Method Node applySubtreeWrite(Path, ImmutableTree, Node)>
	//   48  116:astore_3        
		}
	//*  49  117:goto            37
		obj = ((Object) (node));
	//   50  120:aload_3         
	//   51  121:astore          4
		if(!node.getChild(path).isEmpty())
	//*  52  123:aload_3         
	//*  53  124:aload_1         
	//*  54  125:invokeinterface #93  <Method Node Node.getChild(Path)>
	//*  55  130:invokeinterface #96  <Method boolean Node.isEmpty()>
	//*  56  135:ifne            161
		{
			obj = ((Object) (node));
	//   57  138:aload_3         
	//   58  139:astore          4
			if(immutabletree != null)
	//*  59  141:aload_2         
	//*  60  142:ifnull          161
				obj = ((Object) (node.updateChild(path.child(ChildKey.getPriorityKey()), ((Node) (immutabletree)))));
	//   61  145:aload_3         
	//   62  146:aload_1         
	//   63  147:invokestatic    #100 <Method ChildKey ChildKey.getPriorityKey()>
	//   64  150:invokevirtual   #87  <Method Path Path.child(ChildKey)>
	//   65  153:aload_2         
	//   66  154:invokeinterface #51  <Method Node Node.updateChild(Path, Node)>
	//   67  159:astore          4
		}
		return ((Node) (obj));
	//   68  161:aload           4
	//   69  163:areturn         
	}

	public static CompoundWrite emptyWrite()
	{
		return EMPTY;
	//    0    0:getstatic       #32  <Field CompoundWrite EMPTY>
	//    1    3:areturn         
	}

	public static CompoundWrite fromChildMerge(Map map)
	{
		Object obj = ((Object) (ImmutableTree.emptyInstance()));
	//    0    0:invokestatic    #109 <Method ImmutableTree ImmutableTree.emptyInstance()>
	//    1    3:astore_1        
		Iterator iterator1 = map.entrySet().iterator();
	//    2    4:aload_0         
	//    3    5:invokeinterface #115 <Method Set Map.entrySet()>
	//    4   10:invokeinterface #118 <Method Iterator Set.iterator()>
	//    5   15:astore_2        
		ImmutableTree immutabletree;
		for(map = ((Map) (obj)); iterator1.hasNext(); map = ((Map) (((ImmutableTree) (map)).setTree(new Path(new ChildKey[] {
	(ChildKey)((java.util.Map.Entry) (obj)).getKey()
}), immutabletree))))
	//*   6   16:aload_1         
	//*   7   17:astore_0        
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            83
		{
			obj = ((Object) ((java.util.Map.Entry)iterator1.next()));
	//   11   27:aload_2         
	//   12   28:invokeinterface #70  <Method Object Iterator.next()>
	//   13   33:checkcast       #72  <Class java.util.Map$Entry>
	//   14   36:astore_1        
			immutabletree = new ImmutableTree(((java.util.Map.Entry) (obj)).getValue());
	//   15   37:new             #23  <Class ImmutableTree>
	//   16   40:dup             
	//   17   41:aload_1         
	//   18   42:invokeinterface #73  <Method Object java.util.Map$Entry.getValue()>
	//   19   47:invokespecial   #27  <Method void ImmutableTree(Object)>
	//   20   50:astore_3        
		}

	//   21   51:aload_0         
	//   22   52:new             #83  <Class Path>
	//   23   55:dup             
	//   24   56:iconst_1        
	//   25   57:anewarray       ChildKey[]
	//   26   60:dup             
	//   27   61:iconst_0        
	//   28   62:aload_1         
	//   29   63:invokeinterface #76  <Method Object java.util.Map$Entry.getKey()>
	//   30   68:checkcast       #78  <Class ChildKey>
	//   31   71:aastore         
	//   32   72:invokespecial   #121 <Method void Path(ChildKey[])>
	//   33   75:aload_3         
	//   34   76:invokevirtual   #125 <Method ImmutableTree ImmutableTree.setTree(Path, ImmutableTree)>
	//   35   79:astore_0        
	//*  36   80:goto            18
		return new CompoundWrite(((ImmutableTree) (map)));
	//   37   83:new             #2   <Class CompoundWrite>
	//   38   86:dup             
	//   39   87:aload_0         
	//   40   88:invokespecial   #30  <Method void CompoundWrite(ImmutableTree)>
	//   41   91:areturn         
	}

	public static CompoundWrite fromPathMerge(Map map)
	{
		Object obj = ((Object) (ImmutableTree.emptyInstance()));
	//    0    0:invokestatic    #109 <Method ImmutableTree ImmutableTree.emptyInstance()>
	//    1    3:astore_1        
		Iterator iterator1 = map.entrySet().iterator();
	//    2    4:aload_0         
	//    3    5:invokeinterface #115 <Method Set Map.entrySet()>
	//    4   10:invokeinterface #118 <Method Iterator Set.iterator()>
	//    5   15:astore_2        
		ImmutableTree immutabletree;
		for(map = ((Map) (obj)); iterator1.hasNext(); map = ((Map) (((ImmutableTree) (map)).setTree((Path)((java.util.Map.Entry) (obj)).getKey(), immutabletree))))
	//*   6   16:aload_1         
	//*   7   17:astore_0        
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            69
		{
			obj = ((Object) ((java.util.Map.Entry)iterator1.next()));
	//   11   27:aload_2         
	//   12   28:invokeinterface #70  <Method Object Iterator.next()>
	//   13   33:checkcast       #72  <Class java.util.Map$Entry>
	//   14   36:astore_1        
			immutabletree = new ImmutableTree(((java.util.Map.Entry) (obj)).getValue());
	//   15   37:new             #23  <Class ImmutableTree>
	//   16   40:dup             
	//   17   41:aload_1         
	//   18   42:invokeinterface #73  <Method Object java.util.Map$Entry.getValue()>
	//   19   47:invokespecial   #27  <Method void ImmutableTree(Object)>
	//   20   50:astore_3        
		}

	//   21   51:aload_0         
	//   22   52:aload_1         
	//   23   53:invokeinterface #76  <Method Object java.util.Map$Entry.getKey()>
	//   24   58:checkcast       #83  <Class Path>
	//   25   61:aload_3         
	//   26   62:invokevirtual   #125 <Method ImmutableTree ImmutableTree.setTree(Path, ImmutableTree)>
	//   27   65:astore_0        
	//*  28   66:goto            18
		return new CompoundWrite(((ImmutableTree) (map)));
	//   29   69:new             #2   <Class CompoundWrite>
	//   30   72:dup             
	//   31   73:aload_0         
	//   32   74:invokespecial   #30  <Method void CompoundWrite(ImmutableTree)>
	//   33   77:areturn         
	}

	public static CompoundWrite fromValue(Map map)
	{
		Object obj = ((Object) (ImmutableTree.emptyInstance()));
	//    0    0:invokestatic    #109 <Method ImmutableTree ImmutableTree.emptyInstance()>
	//    1    3:astore_1        
		Iterator iterator1 = map.entrySet().iterator();
	//    2    4:aload_0         
	//    3    5:invokeinterface #115 <Method Set Map.entrySet()>
	//    4   10:invokeinterface #118 <Method Iterator Set.iterator()>
	//    5   15:astore_2        
		ImmutableTree immutabletree;
		for(map = ((Map) (obj)); iterator1.hasNext(); map = ((Map) (((ImmutableTree) (map)).setTree(new Path((String)((java.util.Map.Entry) (obj)).getKey()), immutabletree))))
	//*   6   16:aload_1         
	//*   7   17:astore_0        
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            79
		{
			obj = ((Object) ((java.util.Map.Entry)iterator1.next()));
	//   11   27:aload_2         
	//   12   28:invokeinterface #70  <Method Object Iterator.next()>
	//   13   33:checkcast       #72  <Class java.util.Map$Entry>
	//   14   36:astore_1        
			immutabletree = new ImmutableTree(((Object) (NodeUtilities.NodeFromJSON(((java.util.Map.Entry) (obj)).getValue()))));
	//   15   37:new             #23  <Class ImmutableTree>
	//   16   40:dup             
	//   17   41:aload_1         
	//   18   42:invokeinterface #73  <Method Object java.util.Map$Entry.getValue()>
	//   19   47:invokestatic    #135 <Method Node NodeUtilities.NodeFromJSON(Object)>
	//   20   50:invokespecial   #27  <Method void ImmutableTree(Object)>
	//   21   53:astore_3        
		}

	//   22   54:aload_0         
	//   23   55:new             #83  <Class Path>
	//   24   58:dup             
	//   25   59:aload_1         
	//   26   60:invokeinterface #76  <Method Object java.util.Map$Entry.getKey()>
	//   27   65:checkcast       #137 <Class String>
	//   28   68:invokespecial   #140 <Method void Path(String)>
	//   29   71:aload_3         
	//   30   72:invokevirtual   #125 <Method ImmutableTree ImmutableTree.setTree(Path, ImmutableTree)>
	//   31   75:astore_0        
	//*  32   76:goto            18
		return new CompoundWrite(((ImmutableTree) (map)));
	//   33   79:new             #2   <Class CompoundWrite>
	//   34   82:dup             
	//   35   83:aload_0         
	//   36   84:invokespecial   #30  <Method void CompoundWrite(ImmutableTree)>
	//   37   87:areturn         
	}

	public CompoundWrite addWrite(Path path, Node node)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #144 <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            23
			return new CompoundWrite(new ImmutableTree(((Object) (node))));
	//    3    7:new             #2   <Class CompoundWrite>
	//    4   10:dup             
	//    5   11:new             #23  <Class ImmutableTree>
	//    6   14:dup             
	//    7   15:aload_2         
	//    8   16:invokespecial   #27  <Method void ImmutableTree(Object)>
	//    9   19:invokespecial   #30  <Method void CompoundWrite(ImmutableTree)>
	//   10   22:areturn         
		Path path1 = writeTree.findRootMostPathWithValue(path);
	//   11   23:aload_0         
	//   12   24:getfield        #37  <Field ImmutableTree writeTree>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #148 <Method Path ImmutableTree.findRootMostPathWithValue(Path)>
	//   15   31:astore_3        
		if(path1 != null)
	//*  16   32:aload_3         
	//*  17   33:ifnull          122
		{
			path = Path.getRelative(path1, path);
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:invokestatic    #152 <Method Path Path.getRelative(Path, Path)>
	//   21   41:astore_1        
			Node node1 = (Node)writeTree.get(path1);
	//   22   42:aload_0         
	//   23   43:getfield        #37  <Field ImmutableTree writeTree>
	//   24   46:aload_3         
	//   25   47:invokevirtual   #156 <Method Object ImmutableTree.get(Path)>
	//   26   50:checkcast       #47  <Class Node>
	//   27   53:astore          4
			ChildKey childkey = path.getBack();
	//   28   55:aload_1         
	//   29   56:invokevirtual   #159 <Method ChildKey Path.getBack()>
	//   30   59:astore          5
			if(childkey != null && childkey.isPriorityChildName() && node1.getChild(path.getParent()).isEmpty())
	//*  31   61:aload           5
	//*  32   63:ifnull          95
	//*  33   66:aload           5
	//*  34   68:invokevirtual   #81  <Method boolean ChildKey.isPriorityChildName()>
	//*  35   71:ifeq            95
	//*  36   74:aload           4
	//*  37   76:aload_1         
	//*  38   77:invokevirtual   #163 <Method Path Path.getParent()>
	//*  39   80:invokeinterface #93  <Method Node Node.getChild(Path)>
	//*  40   85:invokeinterface #96  <Method boolean Node.isEmpty()>
	//*  41   90:ifeq            95
			{
				return this;
	//   42   93:aload_0         
	//   43   94:areturn         
			} else
			{
				path = ((Path) (node1.updateChild(path, node)));
	//   44   95:aload           4
	//   45   97:aload_1         
	//   46   98:aload_2         
	//   47   99:invokeinterface #51  <Method Node Node.updateChild(Path, Node)>
	//   48  104:astore_1        
				return new CompoundWrite(writeTree.set(path1, ((Object) (path))));
	//   49  105:new             #2   <Class CompoundWrite>
	//   50  108:dup             
	//   51  109:aload_0         
	//   52  110:getfield        #37  <Field ImmutableTree writeTree>
	//   53  113:aload_3         
	//   54  114:aload_1         
	//   55  115:invokevirtual   #167 <Method ImmutableTree ImmutableTree.set(Path, Object)>
	//   56  118:invokespecial   #30  <Method void CompoundWrite(ImmutableTree)>
	//   57  121:areturn         
			}
		} else
		{
			node = ((Node) (new ImmutableTree(((Object) (node)))));
	//   58  122:new             #23  <Class ImmutableTree>
	//   59  125:dup             
	//   60  126:aload_2         
	//   61  127:invokespecial   #27  <Method void ImmutableTree(Object)>
	//   62  130:astore_2        
			return new CompoundWrite(writeTree.setTree(path, ((ImmutableTree) (node))));
	//   63  131:new             #2   <Class CompoundWrite>
	//   64  134:dup             
	//   65  135:aload_0         
	//   66  136:getfield        #37  <Field ImmutableTree writeTree>
	//   67  139:aload_1         
	//   68  140:aload_2         
	//   69  141:invokevirtual   #125 <Method ImmutableTree ImmutableTree.setTree(Path, ImmutableTree)>
	//   70  144:invokespecial   #30  <Method void CompoundWrite(ImmutableTree)>
	//   71  147:areturn         
		}
	}

	public CompoundWrite addWrite(ChildKey childkey, Node node)
	{
		return addWrite(new Path(new ChildKey[] {
			childkey
		}), node);
	//    0    0:aload_0         
	//    1    1:new             #83  <Class Path>
	//    2    4:dup             
	//    3    5:iconst_1        
	//    4    6:anewarray       ChildKey[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:aastore         
	//    9   13:invokespecial   #121 <Method void Path(ChildKey[])>
	//   10   16:aload_2         
	//   11   17:invokevirtual   #170 <Method CompoundWrite addWrite(Path, Node)>
	//   12   20:areturn         
	}

	public CompoundWrite addWrites(final Path path, CompoundWrite compoundwrite)
	{
		return (CompoundWrite)compoundwrite.writeTree.fold(((Object) (this)), new com.firebase.client.core.utilities.ImmutableTree.TreeVisitor() {

			public CompoundWrite onNodeValue(Path path1, Node node, CompoundWrite compoundwrite1)
			{
				return compoundwrite1.addWrite(path.child(path1), node);
			//    0    0:aload_3         
			//    1    1:aload_0         
			//    2    2:getfield        #22  <Field Path val$path>
			//    3    5:aload_1         
			//    4    6:invokevirtual   #34  <Method Path Path.child(Path)>
			//    5    9:aload_2         
			//    6   10:invokevirtual   #38  <Method CompoundWrite CompoundWrite.addWrite(Path, Node)>
			//    7   13:areturn         
			}

			public volatile Object onNodeValue(Path path1, Object obj, Object obj1)
			{
				return ((Object) (onNodeValue(path1, (Node)obj, (CompoundWrite)obj1)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #41  <Class Node>
			//    4    6:aload_3         
			//    5    7:checkcast       #9   <Class CompoundWrite>
			//    6   10:invokevirtual   #43  <Method CompoundWrite onNodeValue(Path, Node, CompoundWrite)>
			//    7   13:areturn         
			}

			final CompoundWrite this$0;
			final Path val$path;

			
			{
				this$0 = CompoundWrite.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CompoundWrite this$0>
				path = path1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Path val$path>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_2         
	//    1    1:getfield        #37  <Field ImmutableTree writeTree>
	//    2    4:aload_0         
	//    3    5:new             #9   <Class CompoundWrite$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #175 <Method void CompoundWrite$1(CompoundWrite, Path)>
	//    8   14:invokevirtual   #179 <Method Object ImmutableTree.fold(Object, com.firebase.client.core.utilities.ImmutableTree$TreeVisitor)>
	//    9   17:checkcast       #2   <Class CompoundWrite>
	//   10   20:areturn         
	}

	public Node apply(Node node)
	{
		return applySubtreeWrite(Path.getEmptyPath(), writeTree, node);
	//    0    0:aload_0         
	//    1    1:invokestatic    #184 <Method Path Path.getEmptyPath()>
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field ImmutableTree writeTree>
	//    4    8:aload_1         
	//    5    9:invokespecial   #89  <Method Node applySubtreeWrite(Path, ImmutableTree, Node)>
	//    6   12:areturn         
	}

	public CompoundWrite childCompoundWrite(Path path)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #144 <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		Node node = getCompleteNode(path);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #189 <Method Node getCompleteNode(Path)>
	//    8   14:astore_2        
		if(node != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          35
			return new CompoundWrite(new ImmutableTree(((Object) (node))));
	//   11   19:new             #2   <Class CompoundWrite>
	//   12   22:dup             
	//   13   23:new             #23  <Class ImmutableTree>
	//   14   26:dup             
	//   15   27:aload_2         
	//   16   28:invokespecial   #27  <Method void ImmutableTree(Object)>
	//   17   31:invokespecial   #30  <Method void CompoundWrite(ImmutableTree)>
	//   18   34:areturn         
		else
			return new CompoundWrite(writeTree.subtree(path));
	//   19   35:new             #2   <Class CompoundWrite>
	//   20   38:dup             
	//   21   39:aload_0         
	//   22   40:getfield        #37  <Field ImmutableTree writeTree>
	//   23   43:aload_1         
	//   24   44:invokevirtual   #193 <Method ImmutableTree ImmutableTree.subtree(Path)>
	//   25   47:invokespecial   #30  <Method void CompoundWrite(ImmutableTree)>
	//   26   50:areturn         
	}

	public Map childCompoundWrites()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #197 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #198 <Method void HashMap()>
	//    3    7:astore_1        
		java.util.Map.Entry entry;
		for(Iterator iterator1 = writeTree.getChildren().iterator(); iterator1.hasNext(); ((Map) (hashmap)).put(entry.getKey(), ((Object) (new CompoundWrite((ImmutableTree)entry.getValue())))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #37  <Field ImmutableTree writeTree>
	//*   6   12:invokevirtual   #55  <Method ImmutableSortedMap ImmutableTree.getChildren()>
	//*   7   15:invokevirtual   #61  <Method Iterator ImmutableSortedMap.iterator()>
	//*   8   18:astore_2        
	//*   9   19:aload_2         
	//*  10   20:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  11   25:ifeq            70
			entry = (java.util.Map.Entry)iterator1.next();
	//   12   28:aload_2         
	//   13   29:invokeinterface #70  <Method Object Iterator.next()>
	//   14   34:checkcast       #72  <Class java.util.Map$Entry>
	//   15   37:astore_3        

	//   16   38:aload_1         
	//   17   39:aload_3         
	//   18   40:invokeinterface #76  <Method Object java.util.Map$Entry.getKey()>
	//   19   45:new             #2   <Class CompoundWrite>
	//   20   48:dup             
	//   21   49:aload_3         
	//   22   50:invokeinterface #73  <Method Object java.util.Map$Entry.getValue()>
	//   23   55:checkcast       #23  <Class ImmutableTree>
	//   24   58:invokespecial   #30  <Method void CompoundWrite(ImmutableTree)>
	//   25   61:invokeinterface #202 <Method Object Map.put(Object, Object)>
	//   26   66:pop             
	//*  27   67:goto            19
		return ((Map) (hashmap));
	//   28   70:aload_1         
	//   29   71:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null && obj.getClass() == ((Object)this).getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          44
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #209 <Method Class Object.getClass()>
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #209 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            44
			return ((CompoundWrite)obj).getValue(true).equals(((Object) (getValue(true))));
	//   13   25:aload_1         
	//   14   26:checkcast       #2   <Class CompoundWrite>
	//   15   29:iconst_1        
	//   16   30:invokevirtual   #212 <Method Map getValue(boolean)>
	//   17   33:aload_0         
	//   18   34:iconst_1        
	//   19   35:invokevirtual   #212 <Method Map getValue(boolean)>
	//   20   38:invokeinterface #214 <Method boolean Map.equals(Object)>
	//   21   43:ireturn         
		else
			return false;
	//   22   44:iconst_0        
	//   23   45:ireturn         
	}

	public List getCompleteChildren()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #218 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #219 <Method void ArrayList()>
	//    3    7:astore_1        
		if(writeTree.getValue() != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #37  <Field ImmutableTree writeTree>
	//*   6   12:invokevirtual   #45  <Method Object ImmutableTree.getValue()>
	//*   7   15:ifnull          78
		{
			NamedNode namednode;
			for(Iterator iterator1 = ((Node)writeTree.getValue()).iterator(); iterator1.hasNext(); ((List) (arraylist)).add(((Object) (new NamedNode(namednode.getName(), namednode.getNode())))))
	//*   8   18:aload_0         
	//*   9   19:getfield        #37  <Field ImmutableTree writeTree>
	//*  10   22:invokevirtual   #45  <Method Object ImmutableTree.getValue()>
	//*  11   25:checkcast       #47  <Class Node>
	//*  12   28:invokeinterface #220 <Method Iterator Node.iterator()>
	//*  13   33:astore_2        
	//*  14   34:aload_2         
	//*  15   35:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  16   40:ifeq            161
				namednode = (NamedNode)iterator1.next();
	//   17   43:aload_2         
	//   18   44:invokeinterface #70  <Method Object Iterator.next()>
	//   19   49:checkcast       #222 <Class NamedNode>
	//   20   52:astore_3        

	//   21   53:aload_1         
	//   22   54:new             #222 <Class NamedNode>
	//   23   57:dup             
	//   24   58:aload_3         
	//   25   59:invokevirtual   #225 <Method ChildKey NamedNode.getName()>
	//   26   62:aload_3         
	//   27   63:invokevirtual   #229 <Method Node NamedNode.getNode()>
	//   28   66:invokespecial   #232 <Method void NamedNode(ChildKey, Node)>
	//   29   69:invokeinterface #237 <Method boolean List.add(Object)>
	//   30   74:pop             
		} else
	//*  31   75:goto            34
		{
			Iterator iterator2 = writeTree.getChildren().iterator();
	//   32   78:aload_0         
	//   33   79:getfield        #37  <Field ImmutableTree writeTree>
	//   34   82:invokevirtual   #55  <Method ImmutableSortedMap ImmutableTree.getChildren()>
	//   35   85:invokevirtual   #61  <Method Iterator ImmutableSortedMap.iterator()>
	//   36   88:astore_2        
			do
			{
				if(!iterator2.hasNext())
					break;
	//   37   89:aload_2         
	//   38   90:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   39   95:ifeq            161
				java.util.Map.Entry entry = (java.util.Map.Entry)iterator2.next();
	//   40   98:aload_2         
	//   41   99:invokeinterface #70  <Method Object Iterator.next()>
	//   42  104:checkcast       #72  <Class java.util.Map$Entry>
	//   43  107:astore_3        
				ImmutableTree immutabletree = (ImmutableTree)entry.getValue();
	//   44  108:aload_3         
	//   45  109:invokeinterface #73  <Method Object java.util.Map$Entry.getValue()>
	//   46  114:checkcast       #23  <Class ImmutableTree>
	//   47  117:astore          4
				if(immutabletree.getValue() != null)
	//*  48  119:aload           4
	//*  49  121:invokevirtual   #45  <Method Object ImmutableTree.getValue()>
	//*  50  124:ifnull          89
					((List) (arraylist)).add(((Object) (new NamedNode((ChildKey)entry.getKey(), (Node)immutabletree.getValue()))));
	//   51  127:aload_1         
	//   52  128:new             #222 <Class NamedNode>
	//   53  131:dup             
	//   54  132:aload_3         
	//   55  133:invokeinterface #76  <Method Object java.util.Map$Entry.getKey()>
	//   56  138:checkcast       #78  <Class ChildKey>
	//   57  141:aload           4
	//   58  143:invokevirtual   #45  <Method Object ImmutableTree.getValue()>
	//   59  146:checkcast       #47  <Class Node>
	//   60  149:invokespecial   #232 <Method void NamedNode(ChildKey, Node)>
	//   61  152:invokeinterface #237 <Method boolean List.add(Object)>
	//   62  157:pop             
			} while(true);
	//   63  158:goto            89
		}
		return ((List) (arraylist));
	//   64  161:aload_1         
	//   65  162:areturn         
	}

	public Node getCompleteNode(Path path)
	{
		Path path1 = writeTree.findRootMostPathWithValue(path);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ImmutableTree writeTree>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #148 <Method Path ImmutableTree.findRootMostPathWithValue(Path)>
	//    4    8:astore_2        
		if(path1 != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          35
			return ((Node)writeTree.get(path1)).getChild(Path.getRelative(path1, path));
	//    7   13:aload_0         
	//    8   14:getfield        #37  <Field ImmutableTree writeTree>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #156 <Method Object ImmutableTree.get(Path)>
	//   11   21:checkcast       #47  <Class Node>
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokestatic    #152 <Method Path Path.getRelative(Path, Path)>
	//   15   29:invokeinterface #93  <Method Node Node.getChild(Path)>
	//   16   34:areturn         
		else
			return null;
	//   17   35:aconst_null     
	//   18   36:areturn         
	}

	public Map getValue(final boolean exportFormat)
	{
		final HashMap writes = new HashMap();
	//    0    0:new             #197 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #198 <Method void HashMap()>
	//    3    7:astore_2        
		writeTree.foreach(new com.firebase.client.core.utilities.ImmutableTree.TreeVisitor() {

			public volatile Object onNodeValue(Path path, Object obj, Object obj1)
			{
				return ((Object) (onNodeValue(path, (Node)obj, (Void)obj1)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #34  <Class Node>
			//    4    6:aload_3         
			//    5    7:checkcast       #36  <Class Void>
			//    6   10:invokevirtual   #39  <Method Void onNodeValue(Path, Node, Void)>
			//    7   13:areturn         
			}

			public Void onNodeValue(Path path, Node node, Void void1)
			{
				writes.put(((Object) (path.wireFormat())), node.getValue(exportFormat));
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field Map val$writes>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #45  <Method String Path.wireFormat()>
			//    4    8:aload_2         
			//    5    9:aload_0         
			//    6   10:getfield        #26  <Field boolean val$exportFormat>
			//    7   13:invokeinterface #48  <Method Object Node.getValue(boolean)>
			//    8   18:invokeinterface #54  <Method Object Map.put(Object, Object)>
			//    9   23:pop             
				return null;
			//   10   24:aconst_null     
			//   11   25:areturn         
			}

			final CompoundWrite this$0;
			final boolean val$exportFormat;
			final Map val$writes;

			
			{
				this$0 = CompoundWrite.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field CompoundWrite this$0>
				writes = map;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Map val$writes>
				exportFormat = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #26  <Field boolean val$exportFormat>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field ImmutableTree writeTree>
	//    6   12:new             #11  <Class CompoundWrite$2>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:iload_1         
	//   11   19:invokespecial   #241 <Method void CompoundWrite$2(CompoundWrite, Map, boolean)>
	//   12   22:invokevirtual   #245 <Method void ImmutableTree.foreach(com.firebase.client.core.utilities.ImmutableTree$TreeVisitor)>
		return ((Map) (writes));
	//   13   25:aload_2         
	//   14   26:areturn         
	}

	public boolean hasCompleteWrite(Path path)
	{
		return getCompleteNode(path) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #189 <Method Node getCompleteNode(Path)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public int hashCode()
	{
		return getValue(true).hashCode();
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #212 <Method Map getValue(boolean)>
	//    3    5:invokeinterface #252 <Method int Map.hashCode()>
	//    4   10:ireturn         
	}

	public boolean isEmpty()
	{
		return writeTree.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ImmutableTree writeTree>
	//    2    4:invokevirtual   #253 <Method boolean ImmutableTree.isEmpty()>
	//    3    7:ireturn         
	}

	public Iterator iterator()
	{
		return writeTree.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ImmutableTree writeTree>
	//    2    4:invokevirtual   #254 <Method Iterator ImmutableTree.iterator()>
	//    3    7:areturn         
	}

	public CompoundWrite removeWrite(Path path)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #144 <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            11
			return EMPTY;
	//    3    7:getstatic       #32  <Field CompoundWrite EMPTY>
	//    4   10:areturn         
		else
			return new CompoundWrite(writeTree.setTree(path, ImmutableTree.emptyInstance()));
	//    5   11:new             #2   <Class CompoundWrite>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #37  <Field ImmutableTree writeTree>
	//    9   19:aload_1         
	//   10   20:invokestatic    #109 <Method ImmutableTree ImmutableTree.emptyInstance()>
	//   11   23:invokevirtual   #125 <Method ImmutableTree ImmutableTree.setTree(Path, ImmutableTree)>
	//   12   26:invokespecial   #30  <Method void CompoundWrite(ImmutableTree)>
	//   13   29:areturn         
	}

	public Node rootWrite()
	{
		return (Node)writeTree.getValue();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ImmutableTree writeTree>
	//    2    4:invokevirtual   #45  <Method Object ImmutableTree.getValue()>
	//    3    7:checkcast       #47  <Class Node>
	//    4   10:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #261 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #262 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("CompoundWrite{");
	//    4    8:aload_1         
	//    5    9:ldc2            #264 <String "CompoundWrite{">
	//    6   12:invokevirtual   #268 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object) (getValue(true))).toString());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #212 <Method Map getValue(boolean)>
	//   12   22:invokevirtual   #270 <Method String Object.toString()>
	//   13   25:invokevirtual   #268 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		stringbuilder.append("}");
	//   15   29:aload_1         
	//   16   30:ldc2            #272 <String "}">
	//   17   33:invokevirtual   #268 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		return stringbuilder.toString();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #273 <Method String StringBuilder.toString()>
	//   21   41:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private static final CompoundWrite EMPTY = new CompoundWrite(new ImmutableTree(((Object) (null))));
	private final ImmutableTree writeTree;

	static 
	{
	//    0    0:new             #2   <Class CompoundWrite>
	//    1    3:dup             
	//    2    4:new             #23  <Class ImmutableTree>
	//    3    7:dup             
	//    4    8:aconst_null     
	//    5    9:invokespecial   #27  <Method void ImmutableTree(Object)>
	//    6   12:invokespecial   #30  <Method void CompoundWrite(ImmutableTree)>
	//    7   15:putstatic       #32  <Field CompoundWrite EMPTY>
	//*   8   18:return          
	}
}
