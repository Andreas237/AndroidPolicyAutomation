// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.*;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			Path

class SparseSnapshotTree
{
	public static interface SparseSnapshotChildVisitor
	{

		public abstract void visitChild(ChildKey childkey, SparseSnapshotTree sparsesnapshottree);
	}

	public static interface SparseSnapshotTreeVisitor
	{

		public abstract void visitTree(Path path, Node node);
	}


	public SparseSnapshotTree()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		value = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #25  <Field Node value>
		children = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #27  <Field Map children>
	//    8   14:return          
	}

	public void forEachChild(SparseSnapshotChildVisitor sparsesnapshotchildvisitor)
	{
		Object obj = ((Object) (children));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Map children>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          67
		{
			java.util.Map.Entry entry;
			for(obj = ((Object) (((Map) (obj)).entrySet().iterator())); ((Iterator) (obj)).hasNext(); sparsesnapshotchildvisitor.visitChild((ChildKey)entry.getKey(), (SparseSnapshotTree)entry.getValue()))
	//*   5    9:aload_2         
	//*   6   10:invokeinterface #36  <Method Set Map.entrySet()>
	//*   7   15:invokeinterface #42  <Method Iterator Set.iterator()>
	//*   8   20:astore_2        
	//*   9   21:aload_2         
	//*  10   22:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            67
				entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   12   30:aload_2         
	//   13   31:invokeinterface #52  <Method Object Iterator.next()>
	//   14   36:checkcast       #54  <Class java.util.Map$Entry>
	//   15   39:astore_3        

	//   16   40:aload_1         
	//   17   41:aload_3         
	//   18   42:invokeinterface #57  <Method Object java.util.Map$Entry.getKey()>
	//   19   47:checkcast       #59  <Class ChildKey>
	//   20   50:aload_3         
	//   21   51:invokeinterface #62  <Method Object java.util.Map$Entry.getValue()>
	//   22   56:checkcast       #2   <Class SparseSnapshotTree>
	//   23   59:invokeinterface #66  <Method void SparseSnapshotTree$SparseSnapshotChildVisitor.visitChild(ChildKey, SparseSnapshotTree)>
		}
	//*  24   64:goto            21
	//   25   67:return          
	}

	public void forEachTree(final Path prefixPath, final SparseSnapshotTreeVisitor visitor)
	{
		Node node = value;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Node value>
	//    2    4:astore_3        
		if(node != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          18
		{
			visitor.visitTree(prefixPath, node);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:aload_3         
	//    8   12:invokeinterface #72  <Method void SparseSnapshotTree$SparseSnapshotTreeVisitor.visitTree(Path, Node)>
			return;
	//    9   17:return          
		} else
		{
			forEachChild(new SparseSnapshotChildVisitor() {

				public void visitChild(ChildKey childkey, SparseSnapshotTree sparsesnapshottree)
				{
					sparsesnapshottree.forEachTree(prefixPath.child(childkey), visitor);
				//    0    0:aload_2         
				//    1    1:aload_0         
				//    2    2:getfield        #23  <Field Path val$prefixPath>
				//    3    5:aload_1         
				//    4    6:invokevirtual   #37  <Method Path Path.child(ChildKey)>
				//    5    9:aload_0         
				//    6   10:getfield        #25  <Field SparseSnapshotTree$SparseSnapshotTreeVisitor val$visitor>
				//    7   13:invokevirtual   #38  <Method void SparseSnapshotTree.forEachTree(Path, SparseSnapshotTree$SparseSnapshotTreeVisitor)>
				//    8   16:return          
				}

				final SparseSnapshotTree this$0;
				final Path val$prefixPath;
				final SparseSnapshotTreeVisitor val$visitor;

			
			{
				this$0 = SparseSnapshotTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field SparseSnapshotTree this$0>
				prefixPath = path;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Path val$prefixPath>
				visitor = sparsesnapshottreevisitor;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field SparseSnapshotTree$SparseSnapshotTreeVisitor val$visitor>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   10   18:aload_0         
	//   11   19:new             #8   <Class SparseSnapshotTree$2>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokespecial   #75  <Method void SparseSnapshotTree$2(SparseSnapshotTree, Path, SparseSnapshotTree$SparseSnapshotTreeVisitor)>
	//   17   29:invokevirtual   #77  <Method void forEachChild(SparseSnapshotTree$SparseSnapshotChildVisitor)>
			return;
	//   18   32:return          
		}
	}

	public boolean forget(final Path path)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #84  <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            19
		{
			value = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #25  <Field Node value>
			children = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #27  <Field Map children>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		}
		Node node = value;
	//   11   19:aload_0         
	//   12   20:getfield        #25  <Field Node value>
	//   13   23:astore_2        
		if(node != null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          71
			if(node.isLeafNode())
	//*  16   28:aload_2         
	//*  17   29:invokeinterface #89  <Method boolean Node.isLeafNode()>
	//*  18   34:ifeq            39
			{
				return false;
	//   19   37:iconst_0        
	//   20   38:ireturn         
			} else
			{
				ChildrenNode childrennode = (ChildrenNode)value;
	//   21   39:aload_0         
	//   22   40:getfield        #25  <Field Node value>
	//   23   43:checkcast       #91  <Class ChildrenNode>
	//   24   46:astore_2        
				value = null;
	//   25   47:aload_0         
	//   26   48:aconst_null     
	//   27   49:putfield        #25  <Field Node value>
				childrennode.forEachChild(((com.firebase.client.snapshot.ChildrenNode.ChildVisitor) (new com.firebase.client.snapshot.ChildrenNode.ChildVisitor() {

					public void visitChild(ChildKey childkey1, Node node1)
					{
						remember(path.child(childkey1), node1);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field SparseSnapshotTree this$0>
					//    2    4:aload_0         
					//    3    5:getfield        #19  <Field Path val$path>
					//    4    8:aload_1         
					//    5    9:invokevirtual   #31  <Method Path Path.child(ChildKey)>
					//    6   12:aload_2         
					//    7   13:invokevirtual   #35  <Method void SparseSnapshotTree.remember(Path, Node)>
					//    8   16:return          
					}

					final SparseSnapshotTree this$0;
					final Path val$path;

			
			{
				this$0 = SparseSnapshotTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SparseSnapshotTree this$0>
				path = path1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Path val$path>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void com.firebase.client.snapshot.ChildrenNode$ChildVisitor()>
			//    8   14:return          
			}
				}
)));
	//   28   52:aload_2         
	//   29   53:new             #6   <Class SparseSnapshotTree$1>
	//   30   56:dup             
	//   31   57:aload_0         
	//   32   58:aload_1         
	//   33   59:invokespecial   #94  <Method void SparseSnapshotTree$1(SparseSnapshotTree, Path)>
	//   34   62:invokevirtual   #97  <Method void ChildrenNode.forEachChild(com.firebase.client.snapshot.ChildrenNode$ChildVisitor)>
				return forget(path);
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:invokevirtual   #99  <Method boolean forget(Path)>
	//   38   70:ireturn         
			}
		if(children != null)
	//*  39   71:aload_0         
	//*  40   72:getfield        #27  <Field Map children>
	//*  41   75:ifnull          153
		{
			ChildKey childkey = path.getFront();
	//   42   78:aload_1         
	//   43   79:invokevirtual   #103 <Method ChildKey Path.getFront()>
	//   44   82:astore_2        
			path = path.popFront();
	//   45   83:aload_1         
	//   46   84:invokevirtual   #107 <Method Path Path.popFront()>
	//   47   87:astore_1        
			if(children.containsKey(((Object) (childkey))) && ((SparseSnapshotTree)children.get(((Object) (childkey)))).forget(path))
	//*  48   88:aload_0         
	//*  49   89:getfield        #27  <Field Map children>
	//*  50   92:aload_2         
	//*  51   93:invokeinterface #111 <Method boolean Map.containsKey(Object)>
	//*  52   98:ifeq            132
	//*  53  101:aload_0         
	//*  54  102:getfield        #27  <Field Map children>
	//*  55  105:aload_2         
	//*  56  106:invokeinterface #115 <Method Object Map.get(Object)>
	//*  57  111:checkcast       #2   <Class SparseSnapshotTree>
	//*  58  114:aload_1         
	//*  59  115:invokevirtual   #99  <Method boolean forget(Path)>
	//*  60  118:ifeq            132
				children.remove(((Object) (childkey)));
	//   61  121:aload_0         
	//   62  122:getfield        #27  <Field Map children>
	//   63  125:aload_2         
	//   64  126:invokeinterface #118 <Method Object Map.remove(Object)>
	//   65  131:pop             
			if(children.isEmpty())
	//*  66  132:aload_0         
	//*  67  133:getfield        #27  <Field Map children>
	//*  68  136:invokeinterface #119 <Method boolean Map.isEmpty()>
	//*  69  141:ifeq            151
			{
				children = null;
	//   70  144:aload_0         
	//   71  145:aconst_null     
	//   72  146:putfield        #27  <Field Map children>
				return true;
	//   73  149:iconst_1        
	//   74  150:ireturn         
			} else
			{
				return false;
	//   75  151:iconst_0        
	//   76  152:ireturn         
			}
		} else
		{
			return true;
	//   77  153:iconst_1        
	//   78  154:ireturn         
		}
	}

	public void remember(Path path, Node node)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #84  <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            18
		{
			value = node;
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:putfield        #25  <Field Node value>
			children = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #27  <Field Map children>
			return;
	//    9   17:return          
		}
		Object obj = ((Object) (value));
	//   10   18:aload_0         
	//   11   19:getfield        #25  <Field Node value>
	//   12   22:astore_3        
		if(obj != null)
	//*  13   23:aload_3         
	//*  14   24:ifnull          40
		{
			value = ((Node) (obj)).updateChild(path, node);
	//   15   27:aload_0         
	//   16   28:aload_3         
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:invokeinterface #124 <Method Node Node.updateChild(Path, Node)>
	//   20   36:putfield        #25  <Field Node value>
			return;
	//   21   39:return          
		}
		if(children == null)
	//*  22   40:aload_0         
	//*  23   41:getfield        #27  <Field Map children>
	//*  24   44:ifnonnull       58
			children = ((Map) (new HashMap()));
	//   25   47:aload_0         
	//   26   48:new             #126 <Class HashMap>
	//   27   51:dup             
	//   28   52:invokespecial   #127 <Method void HashMap()>
	//   29   55:putfield        #27  <Field Map children>
		obj = ((Object) (path.getFront()));
	//   30   58:aload_1         
	//   31   59:invokevirtual   #103 <Method ChildKey Path.getFront()>
	//   32   62:astore_3        
		if(!children.containsKey(obj))
	//*  33   63:aload_0         
	//*  34   64:getfield        #27  <Field Map children>
	//*  35   67:aload_3         
	//*  36   68:invokeinterface #111 <Method boolean Map.containsKey(Object)>
	//*  37   73:ifne            94
			children.put(obj, ((Object) (new SparseSnapshotTree())));
	//   38   76:aload_0         
	//   39   77:getfield        #27  <Field Map children>
	//   40   80:aload_3         
	//   41   81:new             #2   <Class SparseSnapshotTree>
	//   42   84:dup             
	//   43   85:invokespecial   #128 <Method void SparseSnapshotTree()>
	//   44   88:invokeinterface #132 <Method Object Map.put(Object, Object)>
	//   45   93:pop             
		((SparseSnapshotTree)children.get(obj)).remember(path.popFront(), node);
	//   46   94:aload_0         
	//   47   95:getfield        #27  <Field Map children>
	//   48   98:aload_3         
	//   49   99:invokeinterface #115 <Method Object Map.get(Object)>
	//   50  104:checkcast       #2   <Class SparseSnapshotTree>
	//   51  107:aload_1         
	//   52  108:invokevirtual   #107 <Method Path Path.popFront()>
	//   53  111:aload_2         
	//   54  112:invokevirtual   #134 <Method void remember(Path, Node)>
	//   55  115:return          
	}

	private Map children;
	private Node value;
}
