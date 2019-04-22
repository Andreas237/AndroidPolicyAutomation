// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.*;
import com.firebase.client.utilities.Clock;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			CompoundWrite, Path, SnapshotHolder, SparseSnapshotTree

public class ServerValues
{

	public ServerValues()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static Map generateServerValues(Clock clock)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #21  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void HashMap()>
	//    3    7:astore_1        
		((Map) (hashmap)).put("timestamp", ((Object) (Long.valueOf(clock.millis()))));
	//    4    8:aload_1         
	//    5    9:ldc1            #24  <String "timestamp">
	//    6   11:aload_0         
	//    7   12:invokeinterface #30  <Method long Clock.millis()>
	//    8   17:invokestatic    #36  <Method Long Long.valueOf(long)>
	//    9   20:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   10   25:pop             
		return ((Map) (hashmap));
	//   11   26:aload_1         
	//   12   27:areturn         
	}

	public static Object resolveDeferredValue(Object obj, Map map)
	{
		if(obj instanceof Map)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #38  <Class Map>
	//*   2    4:ifeq            53
		{
			Object obj1 = ((Object) ((Map)obj));
	//    3    7:aload_0         
	//    4    8:checkcast       #38  <Class Map>
	//    5   11:astore_2        
			if(((Map) (obj1)).containsKey(".sv"))
	//*   6   12:aload_2         
	//*   7   13:ldc1            #12  <String ".sv">
	//*   8   15:invokeinterface #50  <Method boolean Map.containsKey(Object)>
	//*   9   20:ifeq            53
			{
				obj1 = ((Object) ((String)((Map) (obj1)).get(".sv")));
	//   10   23:aload_2         
	//   11   24:ldc1            #12  <String ".sv">
	//   12   26:invokeinterface #54  <Method Object Map.get(Object)>
	//   13   31:checkcast       #56  <Class String>
	//   14   34:astore_2        
				if(map.containsKey(obj1))
	//*  15   35:aload_1         
	//*  16   36:aload_2         
	//*  17   37:invokeinterface #50  <Method boolean Map.containsKey(Object)>
	//*  18   42:ifeq            53
					return map.get(obj1);
	//   19   45:aload_1         
	//   20   46:aload_2         
	//   21   47:invokeinterface #54  <Method Object Map.get(Object)>
	//   22   52:areturn         
			}
		}
		return obj;
	//   23   53:aload_0         
	//   24   54:areturn         
	}

	public static CompoundWrite resolveDeferredValueMerge(CompoundWrite compoundwrite, Map map)
	{
		Object obj = ((Object) (CompoundWrite.emptyWrite()));
	//    0    0:invokestatic    #65  <Method CompoundWrite CompoundWrite.emptyWrite()>
	//    1    3:astore_2        
		Iterator iterator = compoundwrite.iterator();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #69  <Method Iterator CompoundWrite.iterator()>
	//    4    8:astore_3        
		for(compoundwrite = ((CompoundWrite) (obj)); iterator.hasNext(); compoundwrite = compoundwrite.addWrite((Path)((java.util.Map.Entry) (obj)).getKey(), resolveDeferredValueSnapshot((Node)((java.util.Map.Entry) (obj)).getValue(), map)))
	//*   5    9:aload_2         
	//*   6   10:astore_0        
	//*   7   11:aload_3         
	//*   8   12:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//*   9   17:ifeq            60
			obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   10   20:aload_3         
	//   11   21:invokeinterface #79  <Method Object Iterator.next()>
	//   12   26:checkcast       #81  <Class java.util.Map$Entry>
	//   13   29:astore_2        

	//   14   30:aload_0         
	//   15   31:aload_2         
	//   16   32:invokeinterface #84  <Method Object java.util.Map$Entry.getKey()>
	//   17   37:checkcast       #86  <Class Path>
	//   18   40:aload_2         
	//   19   41:invokeinterface #89  <Method Object java.util.Map$Entry.getValue()>
	//   20   46:checkcast       #91  <Class Node>
	//   21   49:aload_1         
	//   22   50:invokestatic    #95  <Method Node resolveDeferredValueSnapshot(Node, Map)>
	//   23   53:invokevirtual   #99  <Method CompoundWrite CompoundWrite.addWrite(Path, Node)>
	//   24   56:astore_0        
	//*  25   57:goto            11
		return compoundwrite;
	//   26   60:aload_0         
	//   27   61:areturn         
	}

	public static Node resolveDeferredValueSnapshot(Node node, Map map)
	{
		Object obj1 = node.getPriority().getValue();
	//    0    0:aload_0         
	//    1    1:invokeinterface #104 <Method Node Node.getPriority()>
	//    2    6:invokeinterface #105 <Method Object Node.getValue()>
	//    3   11:astore_3        
		Object obj = obj1;
	//    4   12:aload_3         
	//    5   13:astore_2        
		if(obj1 instanceof Map)
	//*   6   14:aload_3         
	//*   7   15:instanceof      #38  <Class Map>
	//*   8   18:ifeq            60
		{
			Map map1 = (Map)obj1;
	//    9   21:aload_3         
	//   10   22:checkcast       #38  <Class Map>
	//   11   25:astore          4
			obj = obj1;
	//   12   27:aload_3         
	//   13   28:astore_2        
			if(map1.containsKey(".sv"))
	//*  14   29:aload           4
	//*  15   31:ldc1            #12  <String ".sv">
	//*  16   33:invokeinterface #50  <Method boolean Map.containsKey(Object)>
	//*  17   38:ifeq            60
				obj = map.get(((Object) ((String)map1.get(".sv"))));
	//   18   41:aload_1         
	//   19   42:aload           4
	//   20   44:ldc1            #12  <String ".sv">
	//   21   46:invokeinterface #54  <Method Object Map.get(Object)>
	//   22   51:checkcast       #56  <Class String>
	//   23   54:invokeinterface #54  <Method Object Map.get(Object)>
	//   24   59:astore_2        
		}
		obj = ((Object) (PriorityUtilities.parsePriority(obj)));
	//   25   60:aload_2         
	//   26   61:invokestatic    #111 <Method Node PriorityUtilities.parsePriority(Object)>
	//   27   64:astore_2        
		if(node.isLeafNode())
	//*  28   65:aload_0         
	//*  29   66:invokeinterface #114 <Method boolean Node.isLeafNode()>
	//*  30   71:ifeq            122
		{
			map = ((Map) (resolveDeferredValue(node.getValue(), map)));
	//   31   74:aload_0         
	//   32   75:invokeinterface #105 <Method Object Node.getValue()>
	//   33   80:aload_1         
	//   34   81:invokestatic    #116 <Method Object resolveDeferredValue(Object, Map)>
	//   35   84:astore_1        
			if(((Object) (map)).equals(node.getValue()) && obj.equals(((Object) (node.getPriority()))))
	//*  36   85:aload_1         
	//*  37   86:aload_0         
	//*  38   87:invokeinterface #105 <Method Object Node.getValue()>
	//*  39   92:invokevirtual   #119 <Method boolean Object.equals(Object)>
	//*  40   95:ifeq            116
	//*  41   98:aload_2         
	//*  42   99:aload_0         
	//*  43  100:invokeinterface #104 <Method Node Node.getPriority()>
	//*  44  105:invokevirtual   #119 <Method boolean Object.equals(Object)>
	//*  45  108:ifne            114
	//*  46  111:goto            116
				return node;
	//   47  114:aload_0         
	//   48  115:areturn         
			else
				return NodeUtilities.NodeFromJSON(((Object) (map)), ((Node) (obj)));
	//   49  116:aload_1         
	//   50  117:aload_2         
	//   51  118:invokestatic    #125 <Method Node NodeUtilities.NodeFromJSON(Object, Node)>
	//   52  121:areturn         
		}
		if(node.isEmpty())
	//*  53  122:aload_0         
	//*  54  123:invokeinterface #128 <Method boolean Node.isEmpty()>
	//*  55  128:ifeq            133
			return node;
	//   56  131:aload_0         
	//   57  132:areturn         
		node = ((Node) ((ChildrenNode)node));
	//   58  133:aload_0         
	//   59  134:checkcast       #130 <Class ChildrenNode>
	//   60  137:astore_0        
		obj1 = ((Object) (new SnapshotHolder(node)));
	//   61  138:new             #132 <Class SnapshotHolder>
	//   62  141:dup             
	//   63  142:aload_0         
	//   64  143:invokespecial   #135 <Method void SnapshotHolder(Node)>
	//   65  146:astore_3        
		((ChildrenNode) (node)).forEachChild(((com.firebase.client.snapshot.ChildrenNode.ChildVisitor) (new com.firebase.client.snapshot.ChildrenNode.ChildVisitor(map, ((SnapshotHolder) (obj1))) {

			public void visitChild(ChildKey childkey, Node node1)
			{
				Node node2 = ServerValues.resolveDeferredValueSnapshot(node1, serverValues);
			//    0    0:aload_2         
			//    1    1:aload_0         
			//    2    2:getfield        #17  <Field Map val$serverValues>
			//    3    5:invokestatic    #26  <Method Node ServerValues.resolveDeferredValueSnapshot(Node, Map)>
			//    4    8:astore_3        
				if(node2 != node1)
			//*   5    9:aload_3         
			//*   6   10:aload_2         
			//*   7   11:if_acmpeq       33
					holder.update(new Path(childkey.asString()), node2);
			//    8   14:aload_0         
			//    9   15:getfield        #19  <Field SnapshotHolder val$holder>
			//   10   18:new             #28  <Class Path>
			//   11   21:dup             
			//   12   22:aload_1         
			//   13   23:invokevirtual   #34  <Method String ChildKey.asString()>
			//   14   26:invokespecial   #37  <Method void Path(String)>
			//   15   29:aload_3         
			//   16   30:invokevirtual   #43  <Method void SnapshotHolder.update(Path, Node)>
			//   17   33:return          
			}

			final SnapshotHolder val$holder;
			final Map val$serverValues;

			
			{
				serverValues = map;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Map val$serverValues>
				holder = snapshotholder;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field SnapshotHolder val$holder>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void com.firebase.client.snapshot.ChildrenNode$ChildVisitor()>
			//    8   14:return          
			}
		}
)));
	//   66  147:aload_0         
	//   67  148:new             #8   <Class ServerValues$2>
	//   68  151:dup             
	//   69  152:aload_1         
	//   70  153:aload_3         
	//   71  154:invokespecial   #138 <Method void ServerValues$2(Map, SnapshotHolder)>
	//   72  157:invokevirtual   #142 <Method void ChildrenNode.forEachChild(com.firebase.client.snapshot.ChildrenNode$ChildVisitor)>
		if(!((Object) (((SnapshotHolder) (obj1)).getRootNode().getPriority())).equals(obj))
	//*  73  160:aload_3         
	//*  74  161:invokevirtual   #145 <Method Node SnapshotHolder.getRootNode()>
	//*  75  164:invokeinterface #104 <Method Node Node.getPriority()>
	//*  76  169:aload_2         
	//*  77  170:invokevirtual   #119 <Method boolean Object.equals(Object)>
	//*  78  173:ifne            187
			return ((SnapshotHolder) (obj1)).getRootNode().updatePriority(((Node) (obj)));
	//   79  176:aload_3         
	//   80  177:invokevirtual   #145 <Method Node SnapshotHolder.getRootNode()>
	//   81  180:aload_2         
	//   82  181:invokeinterface #149 <Method Node Node.updatePriority(Node)>
	//   83  186:areturn         
		else
			return ((SnapshotHolder) (obj1)).getRootNode();
	//   84  187:aload_3         
	//   85  188:invokevirtual   #145 <Method Node SnapshotHolder.getRootNode()>
	//   86  191:areturn         
	}

	public static SparseSnapshotTree resolveDeferredValueTree(SparseSnapshotTree sparsesnapshottree, Map map)
	{
		SparseSnapshotTree sparsesnapshottree1 = new SparseSnapshotTree();
	//    0    0:new             #154 <Class SparseSnapshotTree>
	//    1    3:dup             
	//    2    4:invokespecial   #155 <Method void SparseSnapshotTree()>
	//    3    7:astore_2        
		sparsesnapshottree.forEachTree(new Path(""), new SparseSnapshotTree.SparseSnapshotTreeVisitor(sparsesnapshottree1, map) {

			public void visitTree(Path path, Node node)
			{
				resolvedTree.remember(path, ServerValues.resolveDeferredValueSnapshot(node, serverValues));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field SparseSnapshotTree val$resolvedTree>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:aload_0         
			//    5    7:getfield        #21  <Field Map val$serverValues>
			//    6   10:invokestatic    #31  <Method Node ServerValues.resolveDeferredValueSnapshot(Node, Map)>
			//    7   13:invokevirtual   #36  <Method void SparseSnapshotTree.remember(Path, Node)>
			//    8   16:return          
			}

			final SparseSnapshotTree val$resolvedTree;
			final Map val$serverValues;

			
			{
				resolvedTree = sparsesnapshottree;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SparseSnapshotTree val$resolvedTree>
				serverValues = map;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Map val$serverValues>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    4    8:aload_0         
	//    5    9:new             #86  <Class Path>
	//    6   12:dup             
	//    7   13:ldc1            #157 <String "">
	//    8   15:invokespecial   #160 <Method void Path(String)>
	//    9   18:new             #6   <Class ServerValues$1>
	//   10   21:dup             
	//   11   22:aload_2         
	//   12   23:aload_1         
	//   13   24:invokespecial   #163 <Method void ServerValues$1(SparseSnapshotTree, Map)>
	//   14   27:invokevirtual   #167 <Method void SparseSnapshotTree.forEachTree(Path, SparseSnapshotTree$SparseSnapshotTreeVisitor)>
		return sparsesnapshottree1;
	//   15   30:aload_2         
	//   16   31:areturn         
	}

	public static final String NAME_SUBKEY_SERVERVALUE = ".sv";
}
