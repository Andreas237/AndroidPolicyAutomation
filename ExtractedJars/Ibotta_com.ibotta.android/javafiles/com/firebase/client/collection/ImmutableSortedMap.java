// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.*;

// Referenced classes of package com.firebase.client.collection:
//			ArraySortedMap, RBTreeSortedMap

public abstract class ImmutableSortedMap
	implements Iterable
{
	public static class Builder
	{

		public static ImmutableSortedMap buildFrom(List list, Map map, KeyTranslator keytranslator, Comparator comparator)
		{
			if(list.size() < 25)
		//*   0    0:aload_0         
		//*   1    1:invokeinterface #34  <Method int List.size()>
		//*   2    6:bipush          25
		//*   3    8:icmpge          19
				return ((ImmutableSortedMap) (ArraySortedMap.buildFrom(list, map, keytranslator, comparator)));
		//    4   11:aload_0         
		//    5   12:aload_1         
		//    6   13:aload_2         
		//    7   14:aload_3         
		//    8   15:invokestatic    #39  <Method ArraySortedMap ArraySortedMap.buildFrom(List, Map, ImmutableSortedMap$Builder$KeyTranslator, Comparator)>
		//    9   18:areturn         
			else
				return ((ImmutableSortedMap) (RBTreeSortedMap.buildFrom(list, map, keytranslator, comparator)));
		//   10   19:aload_0         
		//   11   20:aload_1         
		//   12   21:aload_2         
		//   13   22:aload_3         
		//   14   23:invokestatic    #44  <Method RBTreeSortedMap RBTreeSortedMap.buildFrom(List, Map, ImmutableSortedMap$Builder$KeyTranslator, Comparator)>
		//   15   26:areturn         
		}

		public static ImmutableSortedMap emptyMap(Comparator comparator)
		{
			return ((ImmutableSortedMap) (new ArraySortedMap(comparator)));
		//    0    0:new             #36  <Class ArraySortedMap>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #51  <Method void ArraySortedMap(Comparator)>
		//    4    8:areturn         
		}

		public static ImmutableSortedMap fromMap(Map map, Comparator comparator)
		{
			if(map.size() < 25)
		//*   0    0:aload_0         
		//*   1    1:invokeinterface #57  <Method int Map.size()>
		//*   2    6:bipush          25
		//*   3    8:icmpge          17
				return ((ImmutableSortedMap) (ArraySortedMap.fromMap(map, comparator)));
		//    4   11:aload_0         
		//    5   12:aload_1         
		//    6   13:invokestatic    #60  <Method ArraySortedMap ArraySortedMap.fromMap(Map, Comparator)>
		//    7   16:areturn         
			else
				return ((ImmutableSortedMap) (RBTreeSortedMap.fromMap(map, comparator)));
		//    8   17:aload_0         
		//    9   18:aload_1         
		//   10   19:invokestatic    #63  <Method RBTreeSortedMap RBTreeSortedMap.fromMap(Map, Comparator)>
		//   11   22:areturn         
		}

		public static KeyTranslator identityTranslator()
		{
			return IDENTITY_TRANSLATOR;
		//    0    0:getstatic       #24  <Field ImmutableSortedMap$Builder$KeyTranslator IDENTITY_TRANSLATOR>
		//    1    3:areturn         
		}

		static final int ARRAY_TO_RB_TREE_SIZE_THRESHOLD = 25;
		private static final KeyTranslator IDENTITY_TRANSLATOR = new Builder.KeyTranslator() {

			public Object translate(Object obj)
			{
				return obj;
			//    0    0:aload_1         
			//    1    1:areturn         
			}

		}
;

		static 
		{
		//    0    0:new             #9   <Class ImmutableSortedMap$Builder$1>
		//    1    3:dup             
		//    2    4:invokespecial   #22  <Method void ImmutableSortedMap$Builder$1()>
		//    3    7:putstatic       #24  <Field ImmutableSortedMap$Builder$KeyTranslator IDENTITY_TRANSLATOR>
		//*   4   10:return          
		}

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface Builder.KeyTranslator
	{

		public abstract Object translate(Object obj);
	}


	public ImmutableSortedMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public abstract boolean containsKey(Object obj);

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof ImmutableSortedMap))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ImmutableSortedMap>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		Object obj1 = ((Object) ((ImmutableSortedMap)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ImmutableSortedMap>
	//   12   20:astore_2        
		if(!getComparator().equals(((Object) (((ImmutableSortedMap) (obj1)).getComparator()))))
	//*  13   21:aload_0         
	//*  14   22:invokevirtual   #27  <Method Comparator getComparator()>
	//*  15   25:aload_2         
	//*  16   26:invokevirtual   #27  <Method Comparator getComparator()>
	//*  17   29:invokeinterface #31  <Method boolean Comparator.equals(Object)>
	//*  18   34:ifne            39
			return false;
	//   19   37:iconst_0        
	//   20   38:ireturn         
		if(size() != ((ImmutableSortedMap) (obj1)).size())
	//*  21   39:aload_0         
	//*  22   40:invokevirtual   #35  <Method int size()>
	//*  23   43:aload_2         
	//*  24   44:invokevirtual   #35  <Method int size()>
	//*  25   47:icmpeq          52
			return false;
	//   26   50:iconst_0        
	//   27   51:ireturn         
		obj = ((Object) (iterator()));
	//   28   52:aload_0         
	//   29   53:invokevirtual   #39  <Method Iterator iterator()>
	//   30   56:astore_1        
		obj1 = ((Object) (((ImmutableSortedMap) (obj1)).iterator()));
	//   31   57:aload_2         
	//   32   58:invokevirtual   #39  <Method Iterator iterator()>
	//   33   61:astore_2        
		while(((Iterator) (obj)).hasNext()) 
	//*  34   62:aload_1         
	//*  35   63:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//*  36   68:ifeq            96
			if(!((java.util.Map.Entry)((Iterator) (obj)).next()).equals(((Iterator) (obj1)).next()))
	//*  37   71:aload_1         
	//*  38   72:invokeinterface #49  <Method Object Iterator.next()>
	//*  39   77:checkcast       #51  <Class java.util.Map$Entry>
	//*  40   80:aload_2         
	//*  41   81:invokeinterface #49  <Method Object Iterator.next()>
	//*  42   86:invokeinterface #52  <Method boolean java.util.Map$Entry.equals(Object)>
	//*  43   91:ifne            62
				return false;
	//   44   94:iconst_0        
	//   45   95:ireturn         
		return true;
	//   46   96:iconst_1        
	//   47   97:ireturn         
	}

	public abstract Object get(Object obj);

	public abstract Comparator getComparator();

	public abstract Object getMaxKey();

	public abstract Object getMinKey();

	public abstract Object getPredecessorKey(Object obj);

	public abstract Object getSuccessorKey(Object obj);

	public int hashCode()
	{
		int i = ((Object) (getComparator())).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Comparator getComparator()>
	//    2    4:invokevirtual   #61  <Method int Object.hashCode()>
	//    3    7:istore_1        
		for(Iterator iterator1 = iterator(); iterator1.hasNext();)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #39  <Method Iterator iterator()>
	//*   6   12:astore_2        
	//*   7   13:aload_2         
	//*   8   14:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//*   9   19:ifeq            45
			i = i * 31 + ((java.util.Map.Entry)iterator1.next()).hashCode();
	//   10   22:iload_1         
	//   11   23:bipush          31
	//   12   25:imul            
	//   13   26:aload_2         
	//   14   27:invokeinterface #49  <Method Object Iterator.next()>
	//   15   32:checkcast       #51  <Class java.util.Map$Entry>
	//   16   35:invokeinterface #62  <Method int java.util.Map$Entry.hashCode()>
	//   17   40:iadd            
	//   18   41:istore_1        

	//*  19   42:goto            13
		return i;
	//   20   45:iload_1         
	//   21   46:ireturn         
	}

	public abstract void inOrderTraversal(LLRBNode.NodeVisitor nodevisitor);

	public abstract ImmutableSortedMap insert(Object obj, Object obj1);

	public abstract boolean isEmpty();

	public abstract Iterator iterator();

	public abstract Iterator iteratorFrom(Object obj);

	public abstract ImmutableSortedMap remove(Object obj);

	public abstract Iterator reverseIterator();

	public abstract Iterator reverseIteratorFrom(Object obj);

	public abstract int size();

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #77  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(((Object)this).getClass().getSimpleName());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #82  <Method Class Object.getClass()>
	//    7   13:invokevirtual   #87  <Method String Class.getSimpleName()>
	//    8   16:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("{");
	//   10   20:aload_2         
	//   11   21:ldc1            #93  <String "{">
	//   12   23:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		Iterator iterator1 = iterator();
	//   14   27:aload_0         
	//   15   28:invokevirtual   #39  <Method Iterator iterator()>
	//   16   31:astore_3        
		boolean flag = true;
	//   17   32:iconst_1        
	//   18   33:istore_1        
		for(; iterator1.hasNext(); stringbuilder.append(")"))
	//*  19   34:aload_3         
	//*  20   35:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//*  21   40:ifeq            118
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
	//   22   43:aload_3         
	//   23   44:invokeinterface #49  <Method Object Iterator.next()>
	//   24   49:checkcast       #51  <Class java.util.Map$Entry>
	//   25   52:astore          4
			if(flag)
	//*  26   54:iload_1         
	//*  27   55:ifeq            63
				flag = false;
	//   28   58:iconst_0        
	//   29   59:istore_1        
			else
	//*  30   60:goto            70
				stringbuilder.append(", ");
	//   31   63:aload_2         
	//   32   64:ldc1            #95  <String ", ">
	//   33   66:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   34   69:pop             
			stringbuilder.append("(");
	//   35   70:aload_2         
	//   36   71:ldc1            #97  <String "(">
	//   37   73:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   38   76:pop             
			stringbuilder.append(entry.getKey());
	//   39   77:aload_2         
	//   40   78:aload           4
	//   41   80:invokeinterface #100 <Method Object java.util.Map$Entry.getKey()>
	//   42   85:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   43   88:pop             
			stringbuilder.append("=>");
	//   44   89:aload_2         
	//   45   90:ldc1            #105 <String "=>">
	//   46   92:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   47   95:pop             
			stringbuilder.append(entry.getValue());
	//   48   96:aload_2         
	//   49   97:aload           4
	//   50   99:invokeinterface #108 <Method Object java.util.Map$Entry.getValue()>
	//   51  104:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   52  107:pop             
		}

	//   53  108:aload_2         
	//   54  109:ldc1            #110 <String ")">
	//   55  111:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   56  114:pop             
	//*  57  115:goto            34
		stringbuilder.append("};");
	//   58  118:aload_2         
	//   59  119:ldc1            #112 <String "};">
	//   60  121:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   61  124:pop             
		return stringbuilder.toString();
	//   62  125:aload_2         
	//   63  126:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   64  129:areturn         
	}
}
