// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.utilities;

import com.firebase.client.collection.ImmutableSortedMap;
import com.firebase.client.collection.StandardComparator;
import com.firebase.client.core.Path;
import com.firebase.client.snapshot.ChildKey;
import java.util.*;

// Referenced classes of package com.firebase.client.core.utilities:
//			Predicate

public class ImmutableTree
	implements Iterable
{
	public static interface TreeVisitor
	{

		public abstract Object onNodeValue(Path path, Object obj, Object obj1);
	}


	public ImmutableTree(Object obj)
	{
		this(obj, EMPTY_CHILDREN);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #41  <Field ImmutableSortedMap EMPTY_CHILDREN>
	//    3    5:invokespecial   #45  <Method void ImmutableTree(Object, ImmutableSortedMap)>
	//    4    8:return          
	}

	public ImmutableTree(Object obj, ImmutableSortedMap immutablesortedmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		value = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #55  <Field Object value>
		children = immutablesortedmap;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #57  <Field ImmutableSortedMap children>
	//    8   14:return          
	}

	public static ImmutableTree emptyInstance()
	{
		return EMPTY;
	//    0    0:getstatic       #47  <Field ImmutableTree EMPTY>
	//    1    3:areturn         
	}

	private Object fold(Path path, TreeVisitor treevisitor, Object obj)
	{
		for(Iterator iterator1 = children.iterator(); iterator1.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field ImmutableSortedMap children>
	//*   2    4:invokevirtual   #69  <Method Iterator ImmutableSortedMap.iterator()>
	//*   3    7:astore          4
	//*   4    9:aload           4
	//*   5   11:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            64
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
	//    7   19:aload           4
	//    8   21:invokeinterface #79  <Method Object Iterator.next()>
	//    9   26:checkcast       #81  <Class java.util.Map$Entry>
	//   10   29:astore          5
			obj = ((ImmutableTree)entry.getValue()).fold(path.child((ChildKey)entry.getKey()), treevisitor, obj);
	//   11   31:aload           5
	//   12   33:invokeinterface #84  <Method Object java.util.Map$Entry.getValue()>
	//   13   38:checkcast       #2   <Class ImmutableTree>
	//   14   41:aload_1         
	//   15   42:aload           5
	//   16   44:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//   17   49:checkcast       #27  <Class ChildKey>
	//   18   52:invokevirtual   #93  <Method Path Path.child(ChildKey)>
	//   19   55:aload_2         
	//   20   56:aload_3         
	//   21   57:invokespecial   #95  <Method Object fold(Path, ImmutableTree$TreeVisitor, Object)>
	//   22   60:astore_3        
		}

	//*  23   61:goto            9
		Object obj2 = value;
	//   24   64:aload_0         
	//   25   65:getfield        #55  <Field Object value>
	//   26   68:astore          5
		Object obj1 = obj;
	//   27   70:aload_3         
	//   28   71:astore          4
		if(obj2 != null)
	//*  29   73:aload           5
	//*  30   75:ifnull          90
			obj1 = treevisitor.onNodeValue(path, obj2, obj);
	//   31   78:aload_2         
	//   32   79:aload_1         
	//   33   80:aload           5
	//   34   82:aload_3         
	//   35   83:invokeinterface #99  <Method Object ImmutableTree$TreeVisitor.onNodeValue(Path, Object, Object)>
	//   36   88:astore          4
		return obj1;
	//   37   90:aload           4
	//   38   92:areturn         
	}

	public boolean containsMatchingValue(Predicate predicate)
	{
		Object obj = value;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object value>
	//    2    4:astore_2        
		if(obj != null && predicate.evaluate(obj))
	//*   3    5:aload_2         
	//*   4    6:ifnull          21
	//*   5    9:aload_1         
	//*   6   10:aload_2         
	//*   7   11:invokeinterface #108 <Method boolean Predicate.evaluate(Object)>
	//*   8   16:ifeq            21
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		for(Iterator iterator1 = children.iterator(); iterator1.hasNext();)
	//*  11   21:aload_0         
	//*  12   22:getfield        #57  <Field ImmutableSortedMap children>
	//*  13   25:invokevirtual   #69  <Method Iterator ImmutableSortedMap.iterator()>
	//*  14   28:astore_2        
	//*  15   29:aload_2         
	//*  16   30:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//*  17   35:ifeq            64
			if(((ImmutableTree)((java.util.Map.Entry)iterator1.next()).getValue()).containsMatchingValue(predicate))
	//*  18   38:aload_2         
	//*  19   39:invokeinterface #79  <Method Object Iterator.next()>
	//*  20   44:checkcast       #81  <Class java.util.Map$Entry>
	//*  21   47:invokeinterface #84  <Method Object java.util.Map$Entry.getValue()>
	//*  22   52:checkcast       #2   <Class ImmutableTree>
	//*  23   55:aload_1         
	//*  24   56:invokevirtual   #110 <Method boolean containsMatchingValue(Predicate)>
	//*  25   59:ifeq            29
				return true;
	//   26   62:iconst_1        
	//   27   63:ireturn         

		return false;
	//   28   64:iconst_0        
	//   29   65:ireturn         
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          93
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #116 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #116 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((ImmutableTree)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class ImmutableTree>
	//   16   28:astore_1        
			Object obj1 = ((Object) (children));
	//   17   29:aload_0         
	//   18   30:getfield        #57  <Field ImmutableSortedMap children>
	//   19   33:astore_2        
			if(obj1 != null)
	//*  20   34:aload_2         
	//*  21   35:ifnull          51
			{
				if(!((ImmutableSortedMap) (obj1)).equals(((Object) (((ImmutableTree) (obj)).children))))
	//*  22   38:aload_2         
	//*  23   39:aload_1         
	//*  24   40:getfield        #57  <Field ImmutableSortedMap children>
	//*  25   43:invokevirtual   #118 <Method boolean ImmutableSortedMap.equals(Object)>
	//*  26   46:ifne            60
					return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
			} else
			if(((ImmutableTree) (obj)).children != null)
	//*  29   51:aload_1         
	//*  30   52:getfield        #57  <Field ImmutableSortedMap children>
	//*  31   55:ifnull          60
				return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
			obj1 = value;
	//   34   60:aload_0         
	//   35   61:getfield        #55  <Field Object value>
	//   36   64:astore_2        
			if(obj1 != null)
	//*  37   65:aload_2         
	//*  38   66:ifnull          82
			{
				if(!obj1.equals(((ImmutableTree) (obj)).value))
	//*  39   69:aload_2         
	//*  40   70:aload_1         
	//*  41   71:getfield        #55  <Field Object value>
	//*  42   74:invokevirtual   #119 <Method boolean Object.equals(Object)>
	//*  43   77:ifne            91
					return false;
	//   44   80:iconst_0        
	//   45   81:ireturn         
			} else
			if(((ImmutableTree) (obj)).value != null)
	//*  46   82:aload_1         
	//*  47   83:getfield        #55  <Field Object value>
	//*  48   86:ifnull          91
				return false;
	//   49   89:iconst_0        
	//   50   90:ireturn         
			return true;
	//   51   91:iconst_1        
	//   52   92:ireturn         
		} else
		{
			return false;
	//   53   93:iconst_0        
	//   54   94:ireturn         
		}
	}

	public Path findRootMostMatchingPath(Path path, Predicate predicate)
	{
		Object obj = value;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object value>
	//    2    4:astore_3        
		if(obj != null && predicate.evaluate(obj))
	//*   3    5:aload_3         
	//*   4    6:ifnull          23
	//*   5    9:aload_2         
	//*   6   10:aload_3         
	//*   7   11:invokeinterface #108 <Method boolean Predicate.evaluate(Object)>
	//*   8   16:ifeq            23
			return Path.getEmptyPath();
	//    9   19:invokestatic    #125 <Method Path Path.getEmptyPath()>
	//   10   22:areturn         
		if(path.isEmpty())
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #128 <Method boolean Path.isEmpty()>
	//*  13   27:ifeq            32
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
		obj = ((Object) (path.getFront()));
	//   16   32:aload_1         
	//   17   33:invokevirtual   #132 <Method ChildKey Path.getFront()>
	//   18   36:astore_3        
		ImmutableTree immutabletree = (ImmutableTree)children.get(obj);
	//   19   37:aload_0         
	//   20   38:getfield        #57  <Field ImmutableSortedMap children>
	//   21   41:aload_3         
	//   22   42:invokevirtual   #136 <Method Object ImmutableSortedMap.get(Object)>
	//   23   45:checkcast       #2   <Class ImmutableTree>
	//   24   48:astore          4
		if(immutabletree != null)
	//*  25   50:aload           4
	//*  26   52:ifnull          92
		{
			path = immutabletree.findRootMostMatchingPath(path.popFront(), predicate);
	//   27   55:aload           4
	//   28   57:aload_1         
	//   29   58:invokevirtual   #139 <Method Path Path.popFront()>
	//   30   61:aload_2         
	//   31   62:invokevirtual   #141 <Method Path findRootMostMatchingPath(Path, Predicate)>
	//   32   65:astore_1        
			if(path != null)
	//*  33   66:aload_1         
	//*  34   67:ifnull          90
				return (new Path(new ChildKey[] {
					obj
				})).child(path);
	//   35   70:new             #89  <Class Path>
	//   36   73:dup             
	//   37   74:iconst_1        
	//   38   75:anewarray       ChildKey[]
	//   39   78:dup             
	//   40   79:iconst_0        
	//   41   80:aload_3         
	//   42   81:aastore         
	//   43   82:invokespecial   #144 <Method void Path(ChildKey[])>
	//   44   85:aload_1         
	//   45   86:invokevirtual   #147 <Method Path Path.child(Path)>
	//   46   89:areturn         
			else
				return null;
	//   47   90:aconst_null     
	//   48   91:areturn         
		} else
		{
			return null;
	//   49   92:aconst_null     
	//   50   93:areturn         
		}
	}

	public Path findRootMostPathWithValue(Path path)
	{
		return findRootMostMatchingPath(path, Predicate.TRUE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #153 <Field Predicate Predicate.TRUE>
	//    3    5:invokevirtual   #141 <Method Path findRootMostMatchingPath(Path, Predicate)>
	//    4    8:areturn         
	}

	public Object fold(Object obj, TreeVisitor treevisitor)
	{
		return fold(Path.getEmptyPath(), treevisitor, obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #125 <Method Path Path.getEmptyPath()>
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokespecial   #95  <Method Object fold(Path, ImmutableTree$TreeVisitor, Object)>
	//    5    9:areturn         
	}

	public void foreach(TreeVisitor treevisitor)
	{
		fold(Path.getEmptyPath(), treevisitor, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #125 <Method Path Path.getEmptyPath()>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #95  <Method Object fold(Path, ImmutableTree$TreeVisitor, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public Object get(Path path)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #128 <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            12
			return value;
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field Object value>
	//    5   11:areturn         
		Object obj = ((Object) (path.getFront()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #132 <Method ChildKey Path.getFront()>
	//    8   16:astore_2        
		obj = ((Object) ((ImmutableTree)children.get(obj)));
	//    9   17:aload_0         
	//   10   18:getfield        #57  <Field ImmutableSortedMap children>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #136 <Method Object ImmutableSortedMap.get(Object)>
	//   13   25:checkcast       #2   <Class ImmutableTree>
	//   14   28:astore_2        
		if(obj != null)
	//*  15   29:aload_2         
	//*  16   30:ifnull          42
			return ((ImmutableTree) (obj)).get(path.popFront());
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #139 <Method Path Path.popFront()>
	//   20   38:invokevirtual   #161 <Method Object get(Path)>
	//   21   41:areturn         
		else
			return ((Object) (null));
	//   22   42:aconst_null     
	//   23   43:areturn         
	}

	public ImmutableTree getChild(ChildKey childkey)
	{
		childkey = ((ChildKey) ((ImmutableTree)children.get(((Object) (childkey)))));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ImmutableSortedMap children>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #136 <Method Object ImmutableSortedMap.get(Object)>
	//    4    8:checkcast       #2   <Class ImmutableTree>
	//    5   11:astore_1        
		if(childkey != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          18
			return ((ImmutableTree) (childkey));
	//    8   16:aload_1         
	//    9   17:areturn         
		else
			return emptyInstance();
	//   10   18:invokestatic    #166 <Method ImmutableTree emptyInstance()>
	//   11   21:areturn         
	}

	public ImmutableSortedMap getChildren()
	{
		return children;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ImmutableSortedMap children>
	//    2    4:areturn         
	}

	public Object getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object value>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		Object obj = value;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object value>
	//    2    4:astore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		int i;
		if(obj != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          19
			i = obj.hashCode();
	//    7   11:aload_3         
	//    8   12:invokevirtual   #175 <Method int Object.hashCode()>
	//    9   15:istore_1        
		else
	//*  10   16:goto            21
			i = 0;
	//   11   19:iconst_0        
	//   12   20:istore_1        
		obj = ((Object) (children));
	//   13   21:aload_0         
	//   14   22:getfield        #57  <Field ImmutableSortedMap children>
	//   15   25:astore_3        
		if(obj != null)
	//*  16   26:aload_3         
	//*  17   27:ifnull          35
			j = ((ImmutableSortedMap) (obj)).hashCode();
	//   18   30:aload_3         
	//   19   31:invokevirtual   #176 <Method int ImmutableSortedMap.hashCode()>
	//   20   34:istore_2        
		return i * 31 + j;
	//   21   35:iload_1         
	//   22   36:bipush          31
	//   23   38:imul            
	//   24   39:iload_2         
	//   25   40:iadd            
	//   26   41:ireturn         
	}

	public boolean isEmpty()
	{
		return value == null && children.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object value>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field ImmutableSortedMap children>
	//    5   11:invokevirtual   #177 <Method boolean ImmutableSortedMap.isEmpty()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public Iterator iterator()
	{
		final ArrayList list = new ArrayList();
	//    0    0:new             #179 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #180 <Method void ArrayList()>
	//    3    7:astore_1        
		foreach(new TreeVisitor() {

			public volatile Object onNodeValue(Path path, Object obj, Object obj1)
			{
				return ((Object) (onNodeValue(path, obj, (Void)obj1)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:checkcast       #30  <Class Void>
			//    5    7:invokevirtual   #33  <Method Void onNodeValue(Path, Object, Void)>
			//    6   10:areturn         
			}

			public Void onNodeValue(Path path, Object obj, Void void1)
			{
				list.add(((Object) (new java.util.AbstractMap.SimpleImmutableEntry(((Object) (path)), obj))));
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field List val$list>
			//    2    4:new             #35  <Class java.util.AbstractMap$SimpleImmutableEntry>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:aload_2         
			//    6   10:invokespecial   #38  <Method void java.util.AbstractMap$SimpleImmutableEntry(Object, Object)>
			//    7   13:invokeinterface #44  <Method boolean List.add(Object)>
			//    8   18:pop             
				return null;
			//    9   19:aconst_null     
			//   10   20:areturn         
			}

			final ImmutableTree this$0;
			final List val$list;

			
			{
				this$0 = ImmutableTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ImmutableTree this$0>
				list = list1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field List val$list>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    4    8:aload_0         
	//    5    9:new             #11  <Class ImmutableTree$2>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #183 <Method void ImmutableTree$2(ImmutableTree, List)>
	//   10   18:invokevirtual   #185 <Method void foreach(ImmutableTree$TreeVisitor)>
		return ((List) (list)).iterator();
	//   11   21:aload_1         
	//   12   22:invokeinterface #188 <Method Iterator List.iterator()>
	//   13   27:areturn         
	}

	public Object leafMostValue(Path path)
	{
		return leafMostValueMatching(path, Predicate.TRUE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #153 <Field Predicate Predicate.TRUE>
	//    3    5:invokevirtual   #194 <Method Object leafMostValueMatching(Path, Predicate)>
	//    4    8:areturn         
	}

	public Object leafMostValueMatching(Path path, Predicate predicate)
	{
		Object obj = value;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object value>
	//    2    4:astore_3        
		if(obj != null && predicate.evaluate(obj))
	//*   3    5:aload_3         
	//*   4    6:ifnull          27
	//*   5    9:aload_2         
	//*   6   10:aload_3         
	//*   7   11:invokeinterface #108 <Method boolean Predicate.evaluate(Object)>
	//*   8   16:ifeq            27
			obj = value;
	//    9   19:aload_0         
	//   10   20:getfield        #55  <Field Object value>
	//   11   23:astore_3        
		else
	//*  12   24:goto            29
			obj = null;
	//   13   27:aconst_null     
	//   14   28:astore_3        
		Iterator iterator1 = path.iterator();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #195 <Method Iterator Path.iterator()>
	//   17   33:astore          5
		path = ((Path) (this));
	//   18   35:aload_0         
	//   19   36:astore_1        
		do
		{
			if(!iterator1.hasNext())
				break;
	//   20   37:aload           5
	//   21   39:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            121
			Object obj1 = ((Object) ((ChildKey)iterator1.next()));
	//   23   47:aload           5
	//   24   49:invokeinterface #79  <Method Object Iterator.next()>
	//   25   54:checkcast       #27  <Class ChildKey>
	//   26   57:astore          4
			obj1 = ((Object) ((ImmutableTree)((ImmutableTree) (path)).children.get(obj1)));
	//   27   59:aload_1         
	//   28   60:getfield        #57  <Field ImmutableSortedMap children>
	//   29   63:aload           4
	//   30   65:invokevirtual   #136 <Method Object ImmutableSortedMap.get(Object)>
	//   31   68:checkcast       #2   <Class ImmutableTree>
	//   32   71:astore          4
			if(obj1 == null)
	//*  33   73:aload           4
	//*  34   75:ifnonnull       80
				return obj;
	//   35   78:aload_3         
	//   36   79:areturn         
			Object obj2 = ((ImmutableTree) (obj1)).value;
	//   37   80:aload           4
	//   38   82:getfield        #55  <Field Object value>
	//   39   85:astore          6
			path = ((Path) (obj1));
	//   40   87:aload           4
	//   41   89:astore_1        
			if(obj2 != null)
	//*  42   90:aload           6
	//*  43   92:ifnull          37
			{
				path = ((Path) (obj1));
	//   44   95:aload           4
	//   45   97:astore_1        
				if(predicate.evaluate(obj2))
	//*  46   98:aload_2         
	//*  47   99:aload           6
	//*  48  101:invokeinterface #108 <Method boolean Predicate.evaluate(Object)>
	//*  49  106:ifeq            37
				{
					obj = ((ImmutableTree) (obj1)).value;
	//   50  109:aload           4
	//   51  111:getfield        #55  <Field Object value>
	//   52  114:astore_3        
					path = ((Path) (obj1));
	//   53  115:aload           4
	//   54  117:astore_1        
				}
			}
		} while(true);
	//   55  118:goto            37
		return obj;
	//   56  121:aload_3         
	//   57  122:areturn         
	}

	public ImmutableTree remove(Path path)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #128 <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            34
			if(children.isEmpty())
	//*   3    7:aload_0         
	//*   4    8:getfield        #57  <Field ImmutableSortedMap children>
	//*   5   11:invokevirtual   #177 <Method boolean ImmutableSortedMap.isEmpty()>
	//*   6   14:ifeq            21
				return emptyInstance();
	//    7   17:invokestatic    #166 <Method ImmutableTree emptyInstance()>
	//    8   20:areturn         
			else
				return new ImmutableTree(((Object) (null)), children);
	//    9   21:new             #2   <Class ImmutableTree>
	//   10   24:dup             
	//   11   25:aconst_null     
	//   12   26:aload_0         
	//   13   27:getfield        #57  <Field ImmutableSortedMap children>
	//   14   30:invokespecial   #45  <Method void ImmutableTree(Object, ImmutableSortedMap)>
	//   15   33:areturn         
		ChildKey childkey = path.getFront();
	//   16   34:aload_1         
	//   17   35:invokevirtual   #132 <Method ChildKey Path.getFront()>
	//   18   38:astore_2        
		ImmutableTree immutabletree = (ImmutableTree)children.get(((Object) (childkey)));
	//   19   39:aload_0         
	//   20   40:getfield        #57  <Field ImmutableSortedMap children>
	//   21   43:aload_2         
	//   22   44:invokevirtual   #136 <Method Object ImmutableSortedMap.get(Object)>
	//   23   47:checkcast       #2   <Class ImmutableTree>
	//   24   50:astore_3        
		if(immutabletree != null)
	//*  25   51:aload_3         
	//*  26   52:ifnull          124
		{
			path = ((Path) (immutabletree.remove(path.popFront())));
	//   27   55:aload_3         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #139 <Method Path Path.popFront()>
	//   30   60:invokevirtual   #200 <Method ImmutableTree remove(Path)>
	//   31   63:astore_1        
			if(((ImmutableTree) (path)).isEmpty())
	//*  32   64:aload_1         
	//*  33   65:invokevirtual   #201 <Method boolean isEmpty()>
	//*  34   68:ifeq            83
				path = ((Path) (children.remove(((Object) (childkey)))));
	//   35   71:aload_0         
	//   36   72:getfield        #57  <Field ImmutableSortedMap children>
	//   37   75:aload_2         
	//   38   76:invokevirtual   #204 <Method ImmutableSortedMap ImmutableSortedMap.remove(Object)>
	//   39   79:astore_1        
			else
	//*  40   80:goto            93
				path = ((Path) (children.insert(((Object) (childkey)), ((Object) (path)))));
	//   41   83:aload_0         
	//   42   84:getfield        #57  <Field ImmutableSortedMap children>
	//   43   87:aload_2         
	//   44   88:aload_1         
	//   45   89:invokevirtual   #208 <Method ImmutableSortedMap ImmutableSortedMap.insert(Object, Object)>
	//   46   92:astore_1        
			if(value == null && ((ImmutableSortedMap) (path)).isEmpty())
	//*  47   93:aload_0         
	//*  48   94:getfield        #55  <Field Object value>
	//*  49   97:ifnonnull       111
	//*  50  100:aload_1         
	//*  51  101:invokevirtual   #177 <Method boolean ImmutableSortedMap.isEmpty()>
	//*  52  104:ifeq            111
				return emptyInstance();
	//   53  107:invokestatic    #166 <Method ImmutableTree emptyInstance()>
	//   54  110:areturn         
			else
				return new ImmutableTree(value, ((ImmutableSortedMap) (path)));
	//   55  111:new             #2   <Class ImmutableTree>
	//   56  114:dup             
	//   57  115:aload_0         
	//   58  116:getfield        #55  <Field Object value>
	//   59  119:aload_1         
	//   60  120:invokespecial   #45  <Method void ImmutableTree(Object, ImmutableSortedMap)>
	//   61  123:areturn         
		} else
		{
			return this;
	//   62  124:aload_0         
	//   63  125:areturn         
		}
	}

	public Object rootMostValue(Path path)
	{
		return rootMostValueMatching(path, Predicate.TRUE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #153 <Field Predicate Predicate.TRUE>
	//    3    5:invokevirtual   #213 <Method Object rootMostValueMatching(Path, Predicate)>
	//    4    8:areturn         
	}

	public Object rootMostValueMatching(Path path, Predicate predicate)
	{
		Object obj = value;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object value>
	//    2    4:astore_3        
		if(obj != null && predicate.evaluate(obj))
	//*   3    5:aload_3         
	//*   4    6:ifnull          24
	//*   5    9:aload_2         
	//*   6   10:aload_3         
	//*   7   11:invokeinterface #108 <Method boolean Predicate.evaluate(Object)>
	//*   8   16:ifeq            24
			return value;
	//    9   19:aload_0         
	//   10   20:getfield        #55  <Field Object value>
	//   11   23:areturn         
		Iterator iterator1 = path.iterator();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #195 <Method Iterator Path.iterator()>
	//   14   28:astore          4
		path = ((Path) (this));
	//   15   30:aload_0         
	//   16   31:astore_1        
		while(iterator1.hasNext()) 
	//*  17   32:aload           4
	//*  18   34:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//*  19   39:ifeq            102
		{
			Object obj1 = ((Object) ((ChildKey)iterator1.next()));
	//   20   42:aload           4
	//   21   44:invokeinterface #79  <Method Object Iterator.next()>
	//   22   49:checkcast       #27  <Class ChildKey>
	//   23   52:astore_3        
			obj1 = ((Object) ((ImmutableTree)((ImmutableTree) (path)).children.get(obj1)));
	//   24   53:aload_1         
	//   25   54:getfield        #57  <Field ImmutableSortedMap children>
	//   26   57:aload_3         
	//   27   58:invokevirtual   #136 <Method Object ImmutableSortedMap.get(Object)>
	//   28   61:checkcast       #2   <Class ImmutableTree>
	//   29   64:astore_3        
			if(obj1 == null)
	//*  30   65:aload_3         
	//*  31   66:ifnonnull       71
				return ((Object) (null));
	//   32   69:aconst_null     
	//   33   70:areturn         
			Object obj2 = ((ImmutableTree) (obj1)).value;
	//   34   71:aload_3         
	//   35   72:getfield        #55  <Field Object value>
	//   36   75:astore          5
			path = ((Path) (obj1));
	//   37   77:aload_3         
	//   38   78:astore_1        
			if(obj2 != null)
	//*  39   79:aload           5
	//*  40   81:ifnull          32
			{
				path = ((Path) (obj1));
	//   41   84:aload_3         
	//   42   85:astore_1        
				if(predicate.evaluate(obj2))
	//*  43   86:aload_2         
	//*  44   87:aload           5
	//*  45   89:invokeinterface #108 <Method boolean Predicate.evaluate(Object)>
	//*  46   94:ifeq            32
					return ((ImmutableTree) (obj1)).value;
	//   47   97:aload_3         
	//   48   98:getfield        #55  <Field Object value>
	//   49  101:areturn         
			}
		}
		return ((Object) (null));
	//   50  102:aconst_null     
	//   51  103:areturn         
	}

	public ImmutableTree set(Path path, Object obj)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #128 <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            20
			return new ImmutableTree(obj, children);
	//    3    7:new             #2   <Class ImmutableTree>
	//    4   10:dup             
	//    5   11:aload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #57  <Field ImmutableSortedMap children>
	//    8   16:invokespecial   #45  <Method void ImmutableTree(Object, ImmutableSortedMap)>
	//    9   19:areturn         
		ChildKey childkey = path.getFront();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #132 <Method ChildKey Path.getFront()>
	//   12   24:astore          5
		ImmutableTree immutabletree1 = (ImmutableTree)children.get(((Object) (childkey)));
	//   13   26:aload_0         
	//   14   27:getfield        #57  <Field ImmutableSortedMap children>
	//   15   30:aload           5
	//   16   32:invokevirtual   #136 <Method Object ImmutableSortedMap.get(Object)>
	//   17   35:checkcast       #2   <Class ImmutableTree>
	//   18   38:astore          4
		ImmutableTree immutabletree = immutabletree1;
	//   19   40:aload           4
	//   20   42:astore_3        
		if(immutabletree1 == null)
	//*  21   43:aload           4
	//*  22   45:ifnonnull       52
			immutabletree = emptyInstance();
	//   23   48:invokestatic    #166 <Method ImmutableTree emptyInstance()>
	//   24   51:astore_3        
		path = ((Path) (immutabletree.set(path.popFront(), obj)));
	//   25   52:aload_3         
	//   26   53:aload_1         
	//   27   54:invokevirtual   #139 <Method Path Path.popFront()>
	//   28   57:aload_2         
	//   29   58:invokevirtual   #217 <Method ImmutableTree set(Path, Object)>
	//   30   61:astore_1        
		path = ((Path) (children.insert(((Object) (childkey)), ((Object) (path)))));
	//   31   62:aload_0         
	//   32   63:getfield        #57  <Field ImmutableSortedMap children>
	//   33   66:aload           5
	//   34   68:aload_1         
	//   35   69:invokevirtual   #208 <Method ImmutableSortedMap ImmutableSortedMap.insert(Object, Object)>
	//   36   72:astore_1        
		return new ImmutableTree(value, ((ImmutableSortedMap) (path)));
	//   37   73:new             #2   <Class ImmutableTree>
	//   38   76:dup             
	//   39   77:aload_0         
	//   40   78:getfield        #55  <Field Object value>
	//   41   81:aload_1         
	//   42   82:invokespecial   #45  <Method void ImmutableTree(Object, ImmutableSortedMap)>
	//   43   85:areturn         
	}

	public ImmutableTree setTree(Path path, ImmutableTree immutabletree)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #128 <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            9
			return immutabletree;
	//    3    7:aload_2         
	//    4    8:areturn         
		ChildKey childkey = path.getFront();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #132 <Method ChildKey Path.getFront()>
	//    7   13:astore          5
		ImmutableTree immutabletree2 = (ImmutableTree)children.get(((Object) (childkey)));
	//    8   15:aload_0         
	//    9   16:getfield        #57  <Field ImmutableSortedMap children>
	//   10   19:aload           5
	//   11   21:invokevirtual   #136 <Method Object ImmutableSortedMap.get(Object)>
	//   12   24:checkcast       #2   <Class ImmutableTree>
	//   13   27:astore          4
		ImmutableTree immutabletree1 = immutabletree2;
	//   14   29:aload           4
	//   15   31:astore_3        
		if(immutabletree2 == null)
	//*  16   32:aload           4
	//*  17   34:ifnonnull       41
			immutabletree1 = emptyInstance();
	//   18   37:invokestatic    #166 <Method ImmutableTree emptyInstance()>
	//   19   40:astore_3        
		path = ((Path) (immutabletree1.setTree(path.popFront(), immutabletree)));
	//   20   41:aload_3         
	//   21   42:aload_1         
	//   22   43:invokevirtual   #139 <Method Path Path.popFront()>
	//   23   46:aload_2         
	//   24   47:invokevirtual   #222 <Method ImmutableTree setTree(Path, ImmutableTree)>
	//   25   50:astore_1        
		if(((ImmutableTree) (path)).isEmpty())
	//*  26   51:aload_1         
	//*  27   52:invokevirtual   #201 <Method boolean isEmpty()>
	//*  28   55:ifeq            71
			path = ((Path) (children.remove(((Object) (childkey)))));
	//   29   58:aload_0         
	//   30   59:getfield        #57  <Field ImmutableSortedMap children>
	//   31   62:aload           5
	//   32   64:invokevirtual   #204 <Method ImmutableSortedMap ImmutableSortedMap.remove(Object)>
	//   33   67:astore_1        
		else
	//*  34   68:goto            82
			path = ((Path) (children.insert(((Object) (childkey)), ((Object) (path)))));
	//   35   71:aload_0         
	//   36   72:getfield        #57  <Field ImmutableSortedMap children>
	//   37   75:aload           5
	//   38   77:aload_1         
	//   39   78:invokevirtual   #208 <Method ImmutableSortedMap ImmutableSortedMap.insert(Object, Object)>
	//   40   81:astore_1        
		return new ImmutableTree(value, ((ImmutableSortedMap) (path)));
	//   41   82:new             #2   <Class ImmutableTree>
	//   42   85:dup             
	//   43   86:aload_0         
	//   44   87:getfield        #55  <Field Object value>
	//   45   90:aload_1         
	//   46   91:invokespecial   #45  <Method void ImmutableTree(Object, ImmutableSortedMap)>
	//   47   94:areturn         
	}

	public ImmutableTree subtree(Path path)
	{
		if(path.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #128 <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		Object obj = ((Object) (path.getFront()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #132 <Method ChildKey Path.getFront()>
	//    7   13:astore_2        
		obj = ((Object) ((ImmutableTree)children.get(obj)));
	//    8   14:aload_0         
	//    9   15:getfield        #57  <Field ImmutableSortedMap children>
	//   10   18:aload_2         
	//   11   19:invokevirtual   #136 <Method Object ImmutableSortedMap.get(Object)>
	//   12   22:checkcast       #2   <Class ImmutableTree>
	//   13   25:astore_2        
		if(obj != null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          39
			return ((ImmutableTree) (obj)).subtree(path.popFront());
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #139 <Method Path Path.popFront()>
	//   19   35:invokevirtual   #226 <Method ImmutableTree subtree(Path)>
	//   20   38:areturn         
		else
			return emptyInstance();
	//   21   39:invokestatic    #166 <Method ImmutableTree emptyInstance()>
	//   22   42:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #230 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #231 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ImmutableTree { value=");
	//    4    8:aload_1         
	//    5    9:ldc1            #233 <String "ImmutableTree { value=">
	//    6   11:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getValue());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #238 <Method Object getValue()>
	//   11   20:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", children={");
	//   13   24:aload_1         
	//   14   25:ldc1            #243 <String ", children={">
	//   15   27:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		java.util.Map.Entry entry;
		for(Iterator iterator1 = children.iterator(); iterator1.hasNext(); stringbuilder.append(entry.getValue()))
	//*  17   31:aload_0         
	//*  18   32:getfield        #57  <Field ImmutableSortedMap children>
	//*  19   35:invokevirtual   #69  <Method Iterator ImmutableSortedMap.iterator()>
	//*  20   38:astore_2        
	//*  21   39:aload_2         
	//*  22   40:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//*  23   45:ifeq            96
		{
			entry = (java.util.Map.Entry)iterator1.next();
	//   24   48:aload_2         
	//   25   49:invokeinterface #79  <Method Object Iterator.next()>
	//   26   54:checkcast       #81  <Class java.util.Map$Entry>
	//   27   57:astore_3        
			stringbuilder.append(((ChildKey)entry.getKey()).asString());
	//   28   58:aload_1         
	//   29   59:aload_3         
	//   30   60:invokeinterface #87  <Method Object java.util.Map$Entry.getKey()>
	//   31   65:checkcast       #27  <Class ChildKey>
	//   32   68:invokevirtual   #246 <Method String ChildKey.asString()>
	//   33   71:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   34   74:pop             
			stringbuilder.append("=");
	//   35   75:aload_1         
	//   36   76:ldc1            #248 <String "=">
	//   37   78:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   38   81:pop             
		}

	//   39   82:aload_1         
	//   40   83:aload_3         
	//   41   84:invokeinterface #84  <Method Object java.util.Map$Entry.getValue()>
	//   42   89:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   43   92:pop             
	//*  44   93:goto            39
		stringbuilder.append("} }");
	//   45   96:aload_1         
	//   46   97:ldc1            #250 <String "} }">
	//   47   99:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   48  102:pop             
		return stringbuilder.toString();
	//   49  103:aload_1         
	//   50  104:invokevirtual   #252 <Method String StringBuilder.toString()>
	//   51  107:areturn         
	}

	public Collection values()
	{
		final ArrayList list = new ArrayList();
	//    0    0:new             #179 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #180 <Method void ArrayList()>
	//    3    7:astore_1        
		foreach(new TreeVisitor() {

			public volatile Object onNodeValue(Path path, Object obj, Object obj1)
			{
				return ((Object) (onNodeValue(path, obj, (Void)obj1)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:checkcast       #30  <Class Void>
			//    5    7:invokevirtual   #33  <Method Void onNodeValue(Path, Object, Void)>
			//    6   10:areturn         
			}

			public Void onNodeValue(Path path, Object obj, Void void1)
			{
				list.add(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field ArrayList val$list>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #39  <Method boolean ArrayList.add(Object)>
			//    4    8:pop             
				return null;
			//    5    9:aconst_null     
			//    6   10:areturn         
			}

			final ImmutableTree this$0;
			final ArrayList val$list;

			
			{
				this$0 = ImmutableTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ImmutableTree this$0>
				list = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field ArrayList val$list>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    4    8:aload_0         
	//    5    9:new             #9   <Class ImmutableTree$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #257 <Method void ImmutableTree$1(ImmutableTree, ArrayList)>
	//   10   18:invokevirtual   #185 <Method void foreach(ImmutableTree$TreeVisitor)>
		return ((Collection) (list));
	//   11   21:aload_1         
	//   12   22:areturn         
	}

	private static final ImmutableTree EMPTY;
	private static final ImmutableSortedMap EMPTY_CHILDREN;
	private final ImmutableSortedMap children;
	private final Object value;

	static 
	{
		EMPTY_CHILDREN = com.firebase.client.collection.ImmutableSortedMap.Builder.emptyMap(((java.util.Comparator) (StandardComparator.getComparator(com/firebase/client/snapshot/ChildKey))));
	//    0    0:ldc1            #27  <Class ChildKey>
	//    1    2:invokestatic    #33  <Method StandardComparator StandardComparator.getComparator(Class)>
	//    2    5:invokestatic    #39  <Method ImmutableSortedMap com.firebase.client.collection.ImmutableSortedMap$Builder.emptyMap(java.util.Comparator)>
	//    3    8:putstatic       #41  <Field ImmutableSortedMap EMPTY_CHILDREN>
		EMPTY = new ImmutableTree(((Object) (null)), EMPTY_CHILDREN);
	//    4   11:new             #2   <Class ImmutableTree>
	//    5   14:dup             
	//    6   15:aconst_null     
	//    7   16:getstatic       #41  <Field ImmutableSortedMap EMPTY_CHILDREN>
	//    8   19:invokespecial   #45  <Method void ImmutableTree(Object, ImmutableSortedMap)>
	//    9   22:putstatic       #47  <Field ImmutableTree EMPTY>
	//*  10   25:return          
	}
}
