// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.*;

// Referenced classes of package com.firebase.client.collection:
//			ImmutableSortedMap, ArraySortedMap, RBTreeSortedMap

public static class ImmutableSortedMap$Builder
{
	public static interface KeyTranslator
	{

		public abstract Object translate(Object obj);
	}


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
	private static final KeyTranslator IDENTITY_TRANSLATOR = new KeyTranslator() {

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

	public ImmutableSortedMap$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}
}
