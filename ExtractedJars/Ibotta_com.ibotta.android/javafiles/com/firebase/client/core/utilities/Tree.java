// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.utilities;

import com.firebase.client.core.Path;
import com.firebase.client.snapshot.ChildKey;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.firebase.client.core.utilities:
//			TreeNode

public class Tree
{
	public static interface TreeFilter
	{

		public abstract boolean filterTreeNode(Tree tree);
	}

	public static interface TreeVisitor
	{

		public abstract void visitTree(Tree tree);
	}


	public Tree()
	{
		this(((ChildKey) (null)), ((Tree) (null)), new TreeNode());
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:new             #30  <Class TreeNode>
	//    4    6:dup             
	//    5    7:invokespecial   #32  <Method void TreeNode()>
	//    6   10:invokespecial   #35  <Method void Tree(ChildKey, Tree, TreeNode)>
	//    7   13:return          
	}

	public Tree(ChildKey childkey, Tree tree, TreeNode treenode)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		name = childkey;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field ChildKey name>
		parent = tree;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field Tree parent>
		node = treenode;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #42  <Field TreeNode node>
	//   11   19:return          
	}

	private void updateChild(ChildKey childkey, Tree tree)
	{
		boolean flag = tree.isEmpty();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #50  <Method boolean isEmpty()>
	//    2    4:istore_3        
		boolean flag1 = node.children.containsKey(((Object) (childkey)));
	//    3    5:aload_0         
	//    4    6:getfield        #42  <Field TreeNode node>
	//    5    9:getfield        #54  <Field Map TreeNode.children>
	//    6   12:aload_1         
	//    7   13:invokeinterface #60  <Method boolean Map.containsKey(Object)>
	//    8   18:istore          4
		if(flag && flag1)
	//*   9   20:iload_3         
	//*  10   21:ifeq            48
	//*  11   24:iload           4
	//*  12   26:ifeq            48
		{
			node.children.remove(((Object) (childkey)));
	//   13   29:aload_0         
	//   14   30:getfield        #42  <Field TreeNode node>
	//   15   33:getfield        #54  <Field Map TreeNode.children>
	//   16   36:aload_1         
	//   17   37:invokeinterface #64  <Method Object Map.remove(Object)>
	//   18   42:pop             
			updateParents();
	//   19   43:aload_0         
	//   20   44:invokespecial   #67  <Method void updateParents()>
			return;
	//   21   47:return          
		}
		if(!flag && !flag1)
	//*  22   48:iload_3         
	//*  23   49:ifne            79
	//*  24   52:iload           4
	//*  25   54:ifne            79
		{
			node.children.put(((Object) (childkey)), ((Object) (tree.node)));
	//   26   57:aload_0         
	//   27   58:getfield        #42  <Field TreeNode node>
	//   28   61:getfield        #54  <Field Map TreeNode.children>
	//   29   64:aload_1         
	//   30   65:aload_2         
	//   31   66:getfield        #42  <Field TreeNode node>
	//   32   69:invokeinterface #71  <Method Object Map.put(Object, Object)>
	//   33   74:pop             
			updateParents();
	//   34   75:aload_0         
	//   35   76:invokespecial   #67  <Method void updateParents()>
		}
	//   36   79:return          
	}

	private void updateParents()
	{
		Tree tree = parent;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Tree parent>
	//    2    4:astore_1        
		if(tree != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			tree.updateChild(name, this);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #38  <Field ChildKey name>
	//    8   14:aload_0         
	//    9   15:invokespecial   #74  <Method void updateChild(ChildKey, Tree)>
	//   10   18:return          
	}

	public boolean forEachAncestor(TreeFilter treefilter)
	{
		return forEachAncestor(treefilter, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #79  <Method boolean forEachAncestor(Tree$TreeFilter, boolean)>
	//    4    6:ireturn         
	}

	public boolean forEachAncestor(TreeFilter treefilter, boolean flag)
	{
		Tree tree;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            9
			tree = this;
	//    2    4:aload_0         
	//    3    5:astore_3        
		else
	//*   4    6:goto            14
			tree = parent;
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field Tree parent>
	//    7   13:astore_3        
		for(; tree != null; tree = tree.parent)
	//*   8   14:aload_3         
	//*   9   15:ifnull          38
			if(treefilter.filterTreeNode(tree))
	//*  10   18:aload_1         
	//*  11   19:aload_3         
	//*  12   20:invokeinterface #84  <Method boolean Tree$TreeFilter.filterTreeNode(Tree)>
	//*  13   25:ifeq            30
				return true;
	//   14   28:iconst_1        
	//   15   29:ireturn         

	//   16   30:aload_3         
	//   17   31:getfield        #40  <Field Tree parent>
	//   18   34:astore_3        
	//*  19   35:goto            14
		return false;
	//   20   38:iconst_0        
	//   21   39:ireturn         
	}

	public void forEachChild(TreeVisitor treevisitor)
	{
		Object aobj[] = node.children.entrySet().toArray();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field TreeNode node>
	//    2    4:getfield        #54  <Field Map TreeNode.children>
	//    3    7:invokeinterface #91  <Method Set Map.entrySet()>
	//    4   12:invokeinterface #97  <Method Object[] Set.toArray()>
	//    5   17:astore_3        
		for(int i = 0; i < aobj.length; i++)
	//*   6   18:iconst_0        
	//*   7   19:istore_2        
	//*   8   20:iload_2         
	//*   9   21:aload_3         
	//*  10   22:arraylength     
	//*  11   23:icmpge          75
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)aobj[i];
	//   12   26:aload_3         
	//   13   27:iload_2         
	//   14   28:aaload          
	//   15   29:checkcast       #99  <Class java.util.Map$Entry>
	//   16   32:astore          4
			treevisitor.visitTree(new Tree((ChildKey)entry.getKey(), this, (TreeNode)entry.getValue()));
	//   17   34:aload_1         
	//   18   35:new             #2   <Class Tree>
	//   19   38:dup             
	//   20   39:aload           4
	//   21   41:invokeinterface #103 <Method Object java.util.Map$Entry.getKey()>
	//   22   46:checkcast       #105 <Class ChildKey>
	//   23   49:aload_0         
	//   24   50:aload           4
	//   25   52:invokeinterface #108 <Method Object java.util.Map$Entry.getValue()>
	//   26   57:checkcast       #30  <Class TreeNode>
	//   27   60:invokespecial   #35  <Method void Tree(ChildKey, Tree, TreeNode)>
	//   28   63:invokeinterface #112 <Method void Tree$TreeVisitor.visitTree(Tree)>
		}

	//   29   68:iload_2         
	//   30   69:iconst_1        
	//   31   70:iadd            
	//   32   71:istore_2        
	//*  33   72:goto            20
	//   34   75:return          
	}

	public void forEachDescendant(TreeVisitor treevisitor)
	{
		forEachDescendant(treevisitor, false, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #117 <Method void forEachDescendant(Tree$TreeVisitor, boolean, boolean)>
	//    5    7:return          
	}

	public void forEachDescendant(TreeVisitor treevisitor, boolean flag)
	{
		forEachDescendant(treevisitor, flag, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #117 <Method void forEachDescendant(Tree$TreeVisitor, boolean, boolean)>
	//    5    7:return          
	}

	public void forEachDescendant(final TreeVisitor visitor, boolean flag, final boolean childrenFirst)
	{
		if(flag && !childrenFirst)
	//*   0    0:iload_2         
	//*   1    1:ifeq            15
	//*   2    4:iload_3         
	//*   3    5:ifne            15
			visitor.visitTree(this);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokeinterface #112 <Method void Tree$TreeVisitor.visitTree(Tree)>
		forEachChild(new TreeVisitor() {

			public void visitTree(Tree tree)
			{
				tree.forEachDescendant(visitor, true, childrenFirst);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #24  <Field Tree$TreeVisitor val$visitor>
			//    3    5:iconst_1        
			//    4    6:aload_0         
			//    5    7:getfield        #26  <Field boolean val$childrenFirst>
			//    6   10:invokevirtual   #33  <Method void Tree.forEachDescendant(Tree$TreeVisitor, boolean, boolean)>
			//    7   13:return          
			}

			final Tree this$0;
			final boolean val$childrenFirst;
			final TreeVisitor val$visitor;

			
			{
				this$0 = Tree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field Tree this$0>
				visitor = treevisitor;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Tree$TreeVisitor val$visitor>
				childrenFirst = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #26  <Field boolean val$childrenFirst>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    7   15:aload_0         
	//    8   16:new             #7   <Class Tree$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:iload_3         
	//   13   23:invokespecial   #122 <Method void Tree$1(Tree, Tree$TreeVisitor, boolean)>
	//   14   26:invokevirtual   #124 <Method void forEachChild(Tree$TreeVisitor)>
		if(flag && childrenFirst)
	//*  15   29:iload_2         
	//*  16   30:ifeq            44
	//*  17   33:iload_3         
	//*  18   34:ifeq            44
			visitor.visitTree(this);
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:invokeinterface #112 <Method void Tree$TreeVisitor.visitTree(Tree)>
	//   22   44:return          
	}

	public ChildKey getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ChildKey name>
	//    2    4:areturn         
	}

	public Tree getParent()
	{
		return parent;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Tree parent>
	//    2    4:areturn         
	}

	public Path getPath()
	{
		Object obj = ((Object) (parent));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Tree parent>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
			return ((Tree) (obj)).getPath().child(name);
	//    5    9:aload_1         
	//    6   10:invokevirtual   #134 <Method Path getPath()>
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field ChildKey name>
	//    9   17:invokevirtual   #140 <Method Path Path.child(ChildKey)>
	//   10   20:areturn         
		obj = ((Object) (name));
	//   11   21:aload_0         
	//   12   22:getfield        #38  <Field ChildKey name>
	//   13   25:astore_1        
		if(obj != null)
	//*  14   26:aload_1         
	//*  15   27:ifnull          46
			return new Path(new ChildKey[] {
				obj
			});
	//   16   30:new             #136 <Class Path>
	//   17   33:dup             
	//   18   34:iconst_1        
	//   19   35:anewarray       ChildKey[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:aload_1         
	//   23   41:aastore         
	//   24   42:invokespecial   #143 <Method void Path(ChildKey[])>
	//   25   45:areturn         
		else
			return Path.getEmptyPath();
	//   26   46:invokestatic    #146 <Method Path Path.getEmptyPath()>
	//   27   49:areturn         
	}

	public Object getValue()
	{
		return node.value;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field TreeNode node>
	//    2    4:getfield        #150 <Field Object TreeNode.value>
	//    3    7:areturn         
	}

	public boolean hasChildren()
	{
		return node.children.isEmpty() ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field TreeNode node>
	//    2    4:getfield        #54  <Field Map TreeNode.children>
	//    3    7:invokeinterface #153 <Method boolean Map.isEmpty()>
	//    4   12:iconst_1        
	//    5   13:ixor            
	//    6   14:ireturn         
	}

	public boolean isEmpty()
	{
		return node.value == null && node.children.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field TreeNode node>
	//    2    4:getfield        #150 <Field Object TreeNode.value>
	//    3    7:ifnonnull       27
	//    4   10:aload_0         
	//    5   11:getfield        #42  <Field TreeNode node>
	//    6   14:getfield        #54  <Field Map TreeNode.children>
	//    7   17:invokeinterface #153 <Method boolean Map.isEmpty()>
	//    8   22:ifeq            27
	//    9   25:iconst_1        
	//   10   26:ireturn         
	//   11   27:iconst_0        
	//   12   28:ireturn         
	}

	public TreeNode lastNodeOnPath(Path path)
	{
		Object obj = ((Object) (node));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field TreeNode node>
	//    2    4:astore_2        
		ChildKey childkey = path.getFront();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #158 <Method ChildKey Path.getFront()>
	//    5    9:astore          4
		Path path1 = path;
	//    6   11:aload_1         
	//    7   12:astore_3        
		for(path = ((Path) (childkey)); path != null; path = ((Path) (childkey)))
	//*   8   13:aload           4
	//*   9   15:astore_1        
	//*  10   16:aload_1         
	//*  11   17:ifnull          77
		{
			if(((TreeNode) (obj)).children.containsKey(((Object) (path))))
	//*  12   20:aload_2         
	//*  13   21:getfield        #54  <Field Map TreeNode.children>
	//*  14   24:aload_1         
	//*  15   25:invokeinterface #60  <Method boolean Map.containsKey(Object)>
	//*  16   30:ifeq            50
				path = ((Path) ((TreeNode)((TreeNode) (obj)).children.get(((Object) (path)))));
	//   17   33:aload_2         
	//   18   34:getfield        #54  <Field Map TreeNode.children>
	//   19   37:aload_1         
	//   20   38:invokeinterface #161 <Method Object Map.get(Object)>
	//   21   43:checkcast       #30  <Class TreeNode>
	//   22   46:astore_1        
			else
	//*  23   47:goto            52
				path = null;
	//   24   50:aconst_null     
	//   25   51:astore_1        
			if(path == null)
	//*  26   52:aload_1         
	//*  27   53:ifnonnull       58
				return ((TreeNode) (obj));
	//   28   56:aload_2         
	//   29   57:areturn         
			path1 = path1.popFront();
	//   30   58:aload_3         
	//   31   59:invokevirtual   #164 <Method Path Path.popFront()>
	//   32   62:astore_3        
			childkey = path1.getFront();
	//   33   63:aload_3         
	//   34   64:invokevirtual   #158 <Method ChildKey Path.getFront()>
	//   35   67:astore          4
			obj = ((Object) (path));
	//   36   69:aload_1         
	//   37   70:astore_2        
		}

	//   38   71:aload           4
	//   39   73:astore_1        
	//*  40   74:goto            16
		return ((TreeNode) (obj));
	//   41   77:aload_2         
	//   42   78:areturn         
	}

	public void setValue(Object obj)
	{
		node.value = obj;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field TreeNode node>
	//    2    4:aload_1         
	//    3    5:putfield        #150 <Field Object TreeNode.value>
		updateParents();
	//    4    8:aload_0         
	//    5    9:invokespecial   #67  <Method void updateParents()>
	//    6   12:return          
	}

	public Tree subTree(Path path)
	{
		ChildKey childkey = path.getFront();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #158 <Method ChildKey Path.getFront()>
	//    2    4:astore_2        
		Tree tree = this;
	//    3    5:aload_0         
	//    4    6:astore_3        
		for(; childkey != null; childkey = path.getFront())
	//*   5    7:aload_2         
	//*   6    8:ifnull          82
		{
			TreeNode treenode;
			if(tree.node.children.containsKey(((Object) (childkey))))
	//*   7   11:aload_3         
	//*   8   12:getfield        #42  <Field TreeNode node>
	//*   9   15:getfield        #54  <Field Map TreeNode.children>
	//*  10   18:aload_2         
	//*  11   19:invokeinterface #60  <Method boolean Map.containsKey(Object)>
	//*  12   24:ifeq            48
				treenode = (TreeNode)tree.node.children.get(((Object) (childkey)));
	//   13   27:aload_3         
	//   14   28:getfield        #42  <Field TreeNode node>
	//   15   31:getfield        #54  <Field Map TreeNode.children>
	//   16   34:aload_2         
	//   17   35:invokeinterface #161 <Method Object Map.get(Object)>
	//   18   40:checkcast       #30  <Class TreeNode>
	//   19   43:astore          4
			else
	//*  20   45:goto            57
				treenode = new TreeNode();
	//   21   48:new             #30  <Class TreeNode>
	//   22   51:dup             
	//   23   52:invokespecial   #32  <Method void TreeNode()>
	//   24   55:astore          4
			tree = new Tree(childkey, tree, treenode);
	//   25   57:new             #2   <Class Tree>
	//   26   60:dup             
	//   27   61:aload_2         
	//   28   62:aload_3         
	//   29   63:aload           4
	//   30   65:invokespecial   #35  <Method void Tree(ChildKey, Tree, TreeNode)>
	//   31   68:astore_3        
			path = path.popFront();
	//   32   69:aload_1         
	//   33   70:invokevirtual   #164 <Method Path Path.popFront()>
	//   34   73:astore_1        
		}

	//   35   74:aload_1         
	//   36   75:invokevirtual   #158 <Method ChildKey Path.getFront()>
	//   37   78:astore_2        
	//*  38   79:goto            7
		return tree;
	//   39   82:aload_3         
	//   40   83:areturn         
	}

	public String toString()
	{
		return toString("");
	//    0    0:aload_0         
	//    1    1:ldc1            #175 <String "">
	//    2    3:invokevirtual   #178 <Method String toString(String)>
	//    3    6:areturn         
	}

	String toString(String s)
	{
		Object obj = ((Object) (name));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ChildKey name>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
			obj = "<anon>";
	//    5    9:ldc1            #180 <String "<anon>">
	//    6   11:astore_2        
		else
	//*   7   12:goto            20
			obj = ((Object) (((ChildKey) (obj)).asString()));
	//    8   15:aload_2         
	//    9   16:invokevirtual   #183 <Method String ChildKey.asString()>
	//   10   19:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   11   20:new             #185 <Class StringBuilder>
	//   12   23:dup             
	//   13   24:invokespecial   #186 <Method void StringBuilder()>
	//   14   27:astore_3        
		stringbuilder.append(s);
	//   15   28:aload_3         
	//   16   29:aload_1         
	//   17   30:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
		stringbuilder.append(((String) (obj)));
	//   19   34:aload_3         
	//   20   35:aload_2         
	//   21   36:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   22   39:pop             
		stringbuilder.append("\n");
	//   23   40:aload_3         
	//   24   41:ldc1            #192 <String "\n">
	//   25   43:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   26   46:pop             
		obj = ((Object) (node));
	//   27   47:aload_0         
	//   28   48:getfield        #42  <Field TreeNode node>
	//   29   51:astore_2        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   30   52:new             #185 <Class StringBuilder>
	//   31   55:dup             
	//   32   56:invokespecial   #186 <Method void StringBuilder()>
	//   33   59:astore          4
		stringbuilder1.append(s);
	//   34   61:aload           4
	//   35   63:aload_1         
	//   36   64:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   37   67:pop             
		stringbuilder1.append("\t");
	//   38   68:aload           4
	//   39   70:ldc1            #194 <String "\t">
	//   40   72:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   41   75:pop             
		stringbuilder.append(((TreeNode) (obj)).toString(stringbuilder1.toString()));
	//   42   76:aload_3         
	//   43   77:aload_2         
	//   44   78:aload           4
	//   45   80:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   46   83:invokevirtual   #197 <Method String TreeNode.toString(String)>
	//   47   86:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   48   89:pop             
		return stringbuilder.toString();
	//   49   90:aload_3         
	//   50   91:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   51   94:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private ChildKey name;
	private TreeNode node;
	private Tree parent;

	static 
	{
	//    0    0:return          
	}
}
