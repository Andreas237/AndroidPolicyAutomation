// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.collection.ImmutableSortedMap;
import com.firebase.client.core.Path;
import com.firebase.client.core.utilities.ImmutableTree;
import com.firebase.client.core.utilities.Predicate;
import com.firebase.client.snapshot.ChildKey;
import java.util.Iterator;
import java.util.Set;

public class PruneForest
{

	public PruneForest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		pruneForest = ImmutableTree.emptyInstance();
	//    2    4:aload_0         
	//    3    5:invokestatic    #50  <Method ImmutableTree ImmutableTree.emptyInstance()>
	//    4    8:putfield        #52  <Field ImmutableTree pruneForest>
	//    5   11:return          
	}

	private PruneForest(ImmutableTree immutabletree)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		pruneForest = immutabletree;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #52  <Field ImmutableTree pruneForest>
	//    5    9:return          
	}

	private PruneForest doAll(Path path, Set set, ImmutableTree immutabletree)
	{
		ImmutableTree immutabletree1 = pruneForest.subtree(path);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ImmutableTree pruneForest>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #61  <Method ImmutableTree ImmutableTree.subtree(Path)>
	//    4    8:astore          5
		ImmutableSortedMap immutablesortedmap = immutabletree1.getChildren();
	//    5   10:aload           5
	//    6   12:invokevirtual   #65  <Method ImmutableSortedMap ImmutableTree.getChildren()>
	//    7   15:astore          4
		Iterator iterator = set.iterator();
	//    8   17:aload_2         
	//    9   18:invokeinterface #71  <Method Iterator Set.iterator()>
	//   10   23:astore          6
		for(set = ((Set) (immutablesortedmap)); iterator.hasNext(); set = ((Set) (((ImmutableSortedMap) (set)).insert(((Object) ((ChildKey)iterator.next())), ((Object) (immutabletree))))));
	//   11   25:aload           4
	//   12   27:astore_2        
	//   13   28:aload           6
	//   14   30:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//   15   35:ifeq            57
	//   16   38:aload_2         
	//   17   39:aload           6
	//   18   41:invokeinterface #81  <Method Object Iterator.next()>
	//   19   46:checkcast       #83  <Class ChildKey>
	//   20   49:aload_3         
	//   21   50:invokevirtual   #89  <Method ImmutableSortedMap ImmutableSortedMap.insert(Object, Object)>
	//   22   53:astore_2        
	//*  23   54:goto            28
		return new PruneForest(pruneForest.setTree(path, new ImmutableTree(immutabletree1.getValue(), ((ImmutableSortedMap) (set)))));
	//   24   57:new             #2   <Class PruneForest>
	//   25   60:dup             
	//   26   61:aload_0         
	//   27   62:getfield        #52  <Field ImmutableTree pruneForest>
	//   28   65:aload_1         
	//   29   66:new             #31  <Class ImmutableTree>
	//   30   69:dup             
	//   31   70:aload           5
	//   32   72:invokevirtual   #92  <Method Object ImmutableTree.getValue()>
	//   33   75:aload_2         
	//   34   76:invokespecial   #95  <Method void ImmutableTree(Object, ImmutableSortedMap)>
	//   35   79:invokevirtual   #99  <Method ImmutableTree ImmutableTree.setTree(Path, ImmutableTree)>
	//   36   82:invokespecial   #101 <Method void PruneForest(ImmutableTree)>
	//   37   85:areturn         
	}

	public boolean affectsPath(Path path)
	{
		return pruneForest.rootMostValue(path) != null || !pruneForest.subtree(path).isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ImmutableTree pruneForest>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #108 <Method Object ImmutableTree.rootMostValue(Path)>
	//    4    8:ifnonnull       30
	//    5   11:aload_0         
	//    6   12:getfield        #52  <Field ImmutableTree pruneForest>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #61  <Method ImmutableTree ImmutableTree.subtree(Path)>
	//    9   19:invokevirtual   #111 <Method boolean ImmutableTree.isEmpty()>
	//   10   22:ifne            28
	//   11   25:goto            30
	//   12   28:iconst_0        
	//   13   29:ireturn         
	//   14   30:iconst_1        
	//   15   31:ireturn         
	}

	public PruneForest child(Path path)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #116 <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return child(path.getFront()).child(path.popFront());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #120 <Method ChildKey Path.getFront()>
	//    8   14:invokevirtual   #123 <Method PruneForest child(ChildKey)>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #127 <Method Path Path.popFront()>
	//   11   21:invokevirtual   #129 <Method PruneForest child(Path)>
	//   12   24:areturn         
	}

	public PruneForest child(ChildKey childkey)
	{
		ImmutableTree immutabletree = pruneForest.getChild(childkey);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ImmutableTree pruneForest>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #133 <Method ImmutableTree ImmutableTree.getChild(ChildKey)>
	//    4    8:astore_2        
		if(immutabletree == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       31
		{
			childkey = ((ChildKey) (new ImmutableTree(pruneForest.getValue())));
	//    7   13:new             #31  <Class ImmutableTree>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #52  <Field ImmutableTree pruneForest>
	//   11   21:invokevirtual   #92  <Method Object ImmutableTree.getValue()>
	//   12   24:invokespecial   #40  <Method void ImmutableTree(Object)>
	//   13   27:astore_1        
		} else
	//*  14   28:goto            67
		{
			childkey = ((ChildKey) (immutabletree));
	//   15   31:aload_2         
	//   16   32:astore_1        
			if(immutabletree.getValue() == null)
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #92  <Method Object ImmutableTree.getValue()>
	//*  19   37:ifnonnull       67
			{
				childkey = ((ChildKey) (immutabletree));
	//   20   40:aload_2         
	//   21   41:astore_1        
				if(pruneForest.getValue() != null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #52  <Field ImmutableTree pruneForest>
	//*  24   46:invokevirtual   #92  <Method Object ImmutableTree.getValue()>
	//*  25   49:ifnull          67
					childkey = ((ChildKey) (immutabletree.set(Path.getEmptyPath(), pruneForest.getValue())));
	//   26   52:aload_2         
	//   27   53:invokestatic    #136 <Method Path Path.getEmptyPath()>
	//   28   56:aload_0         
	//   29   57:getfield        #52  <Field ImmutableTree pruneForest>
	//   30   60:invokevirtual   #92  <Method Object ImmutableTree.getValue()>
	//   31   63:invokevirtual   #140 <Method ImmutableTree ImmutableTree.set(Path, Object)>
	//   32   66:astore_1        
			}
		}
		return new PruneForest(((ImmutableTree) (childkey)));
	//   33   67:new             #2   <Class PruneForest>
	//   34   70:dup             
	//   35   71:aload_1         
	//   36   72:invokespecial   #101 <Method void PruneForest(ImmutableTree)>
	//   37   75:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof PruneForest))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class PruneForest>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((PruneForest)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class PruneForest>
	//   12   20:astore_1        
		return pruneForest.equals(((Object) (((PruneForest) (obj)).pruneForest)));
	//   13   21:aload_0         
	//   14   22:getfield        #52  <Field ImmutableTree pruneForest>
	//   15   25:aload_1         
	//   16   26:getfield        #52  <Field ImmutableTree pruneForest>
	//   17   29:invokevirtual   #144 <Method boolean ImmutableTree.equals(Object)>
	//   18   32:ifne            37
	//   19   35:iconst_0        
	//   20   36:ireturn         
	//   21   37:iconst_1        
	//   22   38:ireturn         
	}

	public Object foldKeptNodes(Object obj, final com.firebase.client.core.utilities.ImmutableTree.TreeVisitor treeVisitor)
	{
		return pruneForest.fold(obj, new com.firebase.client.core.utilities.ImmutableTree.TreeVisitor() {

			public Object onNodeValue(Path path, Boolean boolean1, Object obj1)
			{
				if(!boolean1.booleanValue())
			//*   0    0:aload_2         
			//*   1    1:invokevirtual   #34  <Method boolean Boolean.booleanValue()>
			//*   2    4:ifne            20
					return treeVisitor.onNodeValue(path, ((Object) (null)), obj1);
			//    3    7:aload_0         
			//    4    8:getfield        #22  <Field com.firebase.client.core.utilities.ImmutableTree$TreeVisitor val$treeVisitor>
			//    5   11:aload_1         
			//    6   12:aconst_null     
			//    7   13:aload_3         
			//    8   14:invokeinterface #37  <Method Object com.firebase.client.core.utilities.ImmutableTree$TreeVisitor.onNodeValue(Path, Object, Object)>
			//    9   19:areturn         
				else
					return obj1;
			//   10   20:aload_3         
			//   11   21:areturn         
			}

			public volatile Object onNodeValue(Path path, Object obj1, Object obj2)
			{
				return onNodeValue(path, (Boolean)obj1, obj2);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #30  <Class Boolean>
			//    4    6:aload_3         
			//    5    7:invokevirtual   #41  <Method Object onNodeValue(Path, Boolean, Object)>
			//    6   10:areturn         
			}

			final PruneForest this$0;
			final com.firebase.client.core.utilities.ImmutableTree.TreeVisitor val$treeVisitor;

			
			{
				this$0 = PruneForest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field PruneForest this$0>
				treeVisitor = treevisitor;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field com.firebase.client.core.utilities.ImmutableTree$TreeVisitor val$treeVisitor>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ImmutableTree pruneForest>
	//    2    4:aload_1         
	//    3    5:new             #10  <Class PruneForest$3>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #149 <Method void PruneForest$3(PruneForest, com.firebase.client.core.utilities.ImmutableTree$TreeVisitor)>
	//    8   14:invokevirtual   #152 <Method Object ImmutableTree.fold(Object, com.firebase.client.core.utilities.ImmutableTree$TreeVisitor)>
	//    9   17:areturn         
	}

	public int hashCode()
	{
		return pruneForest.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ImmutableTree pruneForest>
	//    2    4:invokevirtual   #157 <Method int ImmutableTree.hashCode()>
	//    3    7:ireturn         
	}

	public PruneForest keep(Path path)
	{
		if(pruneForest.rootMostValueMatching(path, KEEP_PREDICATE) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field ImmutableTree pruneForest>
	//*   2    4:aload_1         
	//*   3    5:getstatic       #26  <Field Predicate KEEP_PREDICATE>
	//*   4    8:invokevirtual   #162 <Method Object ImmutableTree.rootMostValueMatching(Path, Predicate)>
	//*   5   11:ifnull          16
			return this;
	//    6   14:aload_0         
	//    7   15:areturn         
		else
			return new PruneForest(pruneForest.setTree(path, KEEP_TREE));
	//    8   16:new             #2   <Class PruneForest>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #52  <Field ImmutableTree pruneForest>
	//   12   24:aload_1         
	//   13   25:getstatic       #44  <Field ImmutableTree KEEP_TREE>
	//   14   28:invokevirtual   #99  <Method ImmutableTree ImmutableTree.setTree(Path, ImmutableTree)>
	//   15   31:invokespecial   #101 <Method void PruneForest(ImmutableTree)>
	//   16   34:areturn         
	}

	public PruneForest keepAll(Path path, Set set)
	{
		if(pruneForest.rootMostValueMatching(path, KEEP_PREDICATE) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field ImmutableTree pruneForest>
	//*   2    4:aload_1         
	//*   3    5:getstatic       #26  <Field Predicate KEEP_PREDICATE>
	//*   4    8:invokevirtual   #162 <Method Object ImmutableTree.rootMostValueMatching(Path, Predicate)>
	//*   5   11:ifnull          16
			return this;
	//    6   14:aload_0         
	//    7   15:areturn         
		else
			return doAll(path, set, KEEP_TREE);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:getstatic       #44  <Field ImmutableTree KEEP_TREE>
	//   12   22:invokespecial   #166 <Method PruneForest doAll(Path, Set, ImmutableTree)>
	//   13   25:areturn         
	}

	public PruneForest prune(Path path)
	{
		if(pruneForest.rootMostValueMatching(path, KEEP_PREDICATE) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field ImmutableTree pruneForest>
	//*   2    4:aload_1         
	//*   3    5:getstatic       #26  <Field Predicate KEEP_PREDICATE>
	//*   4    8:invokevirtual   #162 <Method Object ImmutableTree.rootMostValueMatching(Path, Predicate)>
	//*   5   11:ifnonnull       49
		{
			if(pruneForest.rootMostValueMatching(path, PRUNE_PREDICATE) != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #52  <Field ImmutableTree pruneForest>
	//*   8   18:aload_1         
	//*   9   19:getstatic       #29  <Field Predicate PRUNE_PREDICATE>
	//*  10   22:invokevirtual   #162 <Method Object ImmutableTree.rootMostValueMatching(Path, Predicate)>
	//*  11   25:ifnull          30
				return this;
	//   12   28:aload_0         
	//   13   29:areturn         
			else
				return new PruneForest(pruneForest.setTree(path, PRUNE_TREE));
	//   14   30:new             #2   <Class PruneForest>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:getfield        #52  <Field ImmutableTree pruneForest>
	//   18   38:aload_1         
	//   19   39:getstatic       #42  <Field ImmutableTree PRUNE_TREE>
	//   20   42:invokevirtual   #99  <Method ImmutableTree ImmutableTree.setTree(Path, ImmutableTree)>
	//   21   45:invokespecial   #101 <Method void PruneForest(ImmutableTree)>
	//   22   48:areturn         
		} else
		{
			throw new IllegalArgumentException("Can't prune path that was kept previously!");
	//   23   49:new             #170 <Class IllegalArgumentException>
	//   24   52:dup             
	//   25   53:ldc1            #172 <String "Can't prune path that was kept previously!">
	//   26   55:invokespecial   #175 <Method void IllegalArgumentException(String)>
	//   27   58:athrow          
		}
	}

	public PruneForest pruneAll(Path path, Set set)
	{
		if(pruneForest.rootMostValueMatching(path, KEEP_PREDICATE) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field ImmutableTree pruneForest>
	//*   2    4:aload_1         
	//*   3    5:getstatic       #26  <Field Predicate KEEP_PREDICATE>
	//*   4    8:invokevirtual   #162 <Method Object ImmutableTree.rootMostValueMatching(Path, Predicate)>
	//*   5   11:ifnonnull       40
		{
			if(pruneForest.rootMostValueMatching(path, PRUNE_PREDICATE) != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #52  <Field ImmutableTree pruneForest>
	//*   8   18:aload_1         
	//*   9   19:getstatic       #29  <Field Predicate PRUNE_PREDICATE>
	//*  10   22:invokevirtual   #162 <Method Object ImmutableTree.rootMostValueMatching(Path, Predicate)>
	//*  11   25:ifnull          30
				return this;
	//   12   28:aload_0         
	//   13   29:areturn         
			else
				return doAll(path, set, PRUNE_TREE);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:getstatic       #42  <Field ImmutableTree PRUNE_TREE>
	//   18   36:invokespecial   #166 <Method PruneForest doAll(Path, Set, ImmutableTree)>
	//   19   39:areturn         
		} else
		{
			throw new IllegalArgumentException("Can't prune path that was kept previously!");
	//   20   40:new             #170 <Class IllegalArgumentException>
	//   21   43:dup             
	//   22   44:ldc1            #172 <String "Can't prune path that was kept previously!">
	//   23   46:invokespecial   #175 <Method void IllegalArgumentException(String)>
	//   24   49:athrow          
		}
	}

	public boolean prunesAnything()
	{
		return pruneForest.containsMatchingValue(PRUNE_PREDICATE);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ImmutableTree pruneForest>
	//    2    4:getstatic       #29  <Field Predicate PRUNE_PREDICATE>
	//    3    7:invokevirtual   #181 <Method boolean ImmutableTree.containsMatchingValue(Predicate)>
	//    4   10:ireturn         
	}

	public boolean shouldKeep(Path path)
	{
		path = ((Path) ((Boolean)pruneForest.leafMostValue(path)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ImmutableTree pruneForest>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #185 <Method Object ImmutableTree.leafMostValue(Path)>
	//    4    8:checkcast       #33  <Class Boolean>
	//    5   11:astore_1        
		return path != null && !((Boolean) (path)).booleanValue();
	//    6   12:aload_1         
	//    7   13:ifnull          25
	//    8   16:aload_1         
	//    9   17:invokevirtual   #188 <Method boolean Boolean.booleanValue()>
	//   10   20:ifne            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public boolean shouldPruneUnkeptDescendants(Path path)
	{
		path = ((Path) ((Boolean)pruneForest.leafMostValue(path)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ImmutableTree pruneForest>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #185 <Method Object ImmutableTree.leafMostValue(Path)>
	//    4    8:checkcast       #33  <Class Boolean>
	//    5   11:astore_1        
		return path != null && ((Boolean) (path)).booleanValue();
	//    6   12:aload_1         
	//    7   13:ifnull          25
	//    8   16:aload_1         
	//    9   17:invokevirtual   #188 <Method boolean Boolean.booleanValue()>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #193 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #194 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("{PruneForest:");
	//    4    8:aload_1         
	//    5    9:ldc1            #196 <String "{PruneForest:">
	//    6   11:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(pruneForest.toString());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #52  <Field ImmutableTree pruneForest>
	//   11   20:invokevirtual   #202 <Method String ImmutableTree.toString()>
	//   12   23:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append("}");
	//   14   27:aload_1         
	//   15   28:ldc1            #204 <String "}">
	//   16   30:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return stringbuilder.toString();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   20   38:areturn         
	}

	private static final Predicate KEEP_PREDICATE = new Predicate() {

		public boolean evaluate(Boolean boolean1)
		{
			return boolean1.booleanValue() ^ true;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method boolean Boolean.booleanValue()>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:ireturn         
		}

		public volatile boolean evaluate(Object obj)
		{
			return evaluate((Boolean)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class Boolean>
		//    3    5:invokevirtual   #25  <Method boolean evaluate(Boolean)>
		//    4    8:ireturn         
		}

	}
;
	private static final ImmutableTree KEEP_TREE = new ImmutableTree(((Object) (Boolean.valueOf(false))));
	private static final Predicate PRUNE_PREDICATE = new Predicate() {

		public boolean evaluate(Boolean boolean1)
		{
			return boolean1.booleanValue();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method boolean Boolean.booleanValue()>
		//    2    4:ireturn         
		}

		public volatile boolean evaluate(Object obj)
		{
			return evaluate((Boolean)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class Boolean>
		//    3    5:invokevirtual   #25  <Method boolean evaluate(Boolean)>
		//    4    8:ireturn         
		}

	}
;
	private static final ImmutableTree PRUNE_TREE = new ImmutableTree(((Object) (Boolean.valueOf(true))));
	private final ImmutableTree pruneForest;

	static 
	{
	//    0    0:new             #6   <Class PruneForest$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void PruneForest$1()>
	//    3    7:putstatic       #26  <Field Predicate KEEP_PREDICATE>
	//    4   10:new             #8   <Class PruneForest$2>
	//    5   13:dup             
	//    6   14:invokespecial   #27  <Method void PruneForest$2()>
	//    7   17:putstatic       #29  <Field Predicate PRUNE_PREDICATE>
	//    8   20:new             #31  <Class ImmutableTree>
	//    9   23:dup             
	//   10   24:iconst_1        
	//   11   25:invokestatic    #37  <Method Boolean Boolean.valueOf(boolean)>
	//   12   28:invokespecial   #40  <Method void ImmutableTree(Object)>
	//   13   31:putstatic       #42  <Field ImmutableTree PRUNE_TREE>
	//   14   34:new             #31  <Class ImmutableTree>
	//   15   37:dup             
	//   16   38:iconst_0        
	//   17   39:invokestatic    #37  <Method Boolean Boolean.valueOf(boolean)>
	//   18   42:invokespecial   #40  <Method void ImmutableTree(Object)>
	//   19   45:putstatic       #44  <Field ImmutableTree KEEP_TREE>
	//*  20   48:return          
	}
}
