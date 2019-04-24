// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.collections;

import java.util.*;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

// Referenced classes of package kotlin.collections:
//			CollectionsKt__CollectionsJVMKt, ArrayAsCollection, CollectionsKt, EmptyList, 
//			ArraysKt

class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt
{

	public CollectionsKt__CollectionsKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void CollectionsKt__CollectionsJVMKt()>
	//    2    4:return          
	}

	private static final List List(int i, Function1 function1)
	{
		ArrayList arraylist = new ArrayList(i);
	//    0    0:new             #93  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #96  <Method void ArrayList(int)>
	//    4    8:astore_3        
		for(int j = 0; j < i; j++)
	//*   5    9:iconst_0        
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:iload_0         
	//*   9   13:icmpge          38
			arraylist.add(function1.invoke(((Object) (Integer.valueOf(j)))));
	//   10   16:aload_3         
	//   11   17:aload_1         
	//   12   18:iload_2         
	//   13   19:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//   14   22:invokeinterface #108 <Method Object Function1.invoke(Object)>
	//   15   27:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//   16   30:pop             

	//   17   31:iload_2         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_2        
	//*  21   35:goto            11
		return (List)arraylist;
	//   22   38:aload_3         
	//   23   39:checkcast       #114 <Class List>
	//   24   42:areturn         
	}

	private static final List MutableList(int i, Function1 function1)
	{
		ArrayList arraylist = new ArrayList(i);
	//    0    0:new             #93  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #96  <Method void ArrayList(int)>
	//    4    8:astore_3        
		for(int j = 0; j < i; j++)
	//*   5    9:iconst_0        
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:iload_0         
	//*   9   13:icmpge          38
			arraylist.add(function1.invoke(((Object) (Integer.valueOf(j)))));
	//   10   16:aload_3         
	//   11   17:aload_1         
	//   12   18:iload_2         
	//   13   19:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//   14   22:invokeinterface #108 <Method Object Function1.invoke(Object)>
	//   15   27:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//   16   30:pop             

	//   17   31:iload_2         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_2        
	//*  21   35:goto            11
		return (List)arraylist;
	//   22   38:aload_3         
	//   23   39:checkcast       #114 <Class List>
	//   24   42:areturn         
	}

	private static final ArrayList arrayListOf()
	{
		return new ArrayList();
	//    0    0:new             #93  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void ArrayList()>
	//    3    7:areturn         
	}

	public static final transient ArrayList arrayListOf(Object aobj[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (aobj)), "elements");
	//    0    0:aload_0         
	//    1    1:ldc1            #122 <String "elements">
	//    2    3:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(aobj.length == 0)
	//*   3    6:aload_0         
	//*   4    7:arraylength     
	//*   5    8:ifne            19
			return new ArrayList();
	//    6   11:new             #93  <Class ArrayList>
	//    7   14:dup             
	//    8   15:invokespecial   #119 <Method void ArrayList()>
	//    9   18:areturn         
		else
			return new ArrayList((Collection)new ArrayAsCollection(aobj, true));
	//   10   19:new             #93  <Class ArrayList>
	//   11   22:dup             
	//   12   23:new             #130 <Class ArrayAsCollection>
	//   13   26:dup             
	//   14   27:aload_0         
	//   15   28:iconst_1        
	//   16   29:invokespecial   #133 <Method void ArrayAsCollection(Object[], boolean)>
	//   17   32:checkcast       #135 <Class Collection>
	//   18   35:invokespecial   #138 <Method void ArrayList(Collection)>
	//   19   38:areturn         
	}

	public static final Collection asCollection(Object aobj[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (aobj)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #142 <String "receiver$0">
	//    2    3:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return (Collection)new ArrayAsCollection(aobj, false);
	//    3    6:new             #130 <Class ArrayAsCollection>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:invokespecial   #133 <Method void ArrayAsCollection(Object[], boolean)>
	//    8   15:checkcast       #135 <Class Collection>
	//    9   18:areturn         
	}

	public static final int binarySearch(List list, int i, int j, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #142 <String "receiver$0">
	//    2    3:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "comparison");
	//    3    6:aload_3         
	//    4    7:ldc1            #145 <String "comparison">
	//    5    9:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, j);
	//    6   12:aload_0         
	//    7   13:invokeinterface #148 <Method int List.size()>
	//    8   18:iload_1         
	//    9   19:iload_2         
	//   10   20:invokestatic    #151 <Method void rangeCheck$CollectionsKt__CollectionsKt(int, int, int)>
		for(j--; i <= j;)
	//*  11   23:iload_2         
	//*  12   24:iconst_1        
	//*  13   25:isub            
	//*  14   26:istore_2        
	//*  15   27:iload_1         
	//*  16   28:iload_2         
	//*  17   29:icmpgt          90
		{
			int k = i + j >>> 1;
	//   18   32:iload_1         
	//   19   33:iload_2         
	//   20   34:iadd            
	//   21   35:iconst_1        
	//   22   36:iushr           
	//   23   37:istore          4
			int l = ((Number)function1.invoke(list.get(k))).intValue();
	//   24   39:aload_3         
	//   25   40:aload_0         
	//   26   41:iload           4
	//   27   43:invokeinterface #155 <Method Object List.get(int)>
	//   28   48:invokeinterface #108 <Method Object Function1.invoke(Object)>
	//   29   53:checkcast       #157 <Class Number>
	//   30   56:invokevirtual   #160 <Method int Number.intValue()>
	//   31   59:istore          5
			if(l < 0)
	//*  32   61:iload           5
	//*  33   63:ifge            74
				i = k + 1;
	//   34   66:iload           4
	//   35   68:iconst_1        
	//   36   69:iadd            
	//   37   70:istore_1        
			else
	//*  38   71:goto            27
			if(l > 0)
	//*  39   74:iload           5
	//*  40   76:ifle            87
				j = k - 1;
	//   41   79:iload           4
	//   42   81:iconst_1        
	//   43   82:isub            
	//   44   83:istore_2        
			else
	//*  45   84:goto            27
				return k;
	//   46   87:iload           4
	//   47   89:ireturn         
		}

		return -(i + 1);
	//   48   90:iload_1         
	//   49   91:iconst_1        
	//   50   92:iadd            
	//   51   93:ineg            
	//   52   94:ireturn         
	}

	public static final int binarySearch(List list, Comparable comparable, int i, int j)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #142 <String "receiver$0">
	//    2    3:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, j);
	//    3    6:aload_0         
	//    4    7:invokeinterface #148 <Method int List.size()>
	//    5   12:iload_2         
	//    6   13:iload_3         
	//    7   14:invokestatic    #151 <Method void rangeCheck$CollectionsKt__CollectionsKt(int, int, int)>
		for(j--; i <= j;)
	//*   8   17:iload_3         
	//*   9   18:iconst_1        
	//*  10   19:isub            
	//*  11   20:istore_3        
	//*  12   21:iload_2         
	//*  13   22:iload_3         
	//*  14   23:icmpgt          79
		{
			int k = i + j >>> 1;
	//   15   26:iload_2         
	//   16   27:iload_3         
	//   17   28:iadd            
	//   18   29:iconst_1        
	//   19   30:iushr           
	//   20   31:istore          4
			int l = ComparisonsKt.compareValues((Comparable)list.get(k), comparable);
	//   21   33:aload_0         
	//   22   34:iload           4
	//   23   36:invokeinterface #155 <Method Object List.get(int)>
	//   24   41:checkcast       #164 <Class Comparable>
	//   25   44:aload_1         
	//   26   45:invokestatic    #170 <Method int ComparisonsKt.compareValues(Comparable, Comparable)>
	//   27   48:istore          5
			if(l < 0)
	//*  28   50:iload           5
	//*  29   52:ifge            63
				i = k + 1;
	//   30   55:iload           4
	//   31   57:iconst_1        
	//   32   58:iadd            
	//   33   59:istore_2        
			else
	//*  34   60:goto            21
			if(l > 0)
	//*  35   63:iload           5
	//*  36   65:ifle            76
				j = k - 1;
	//   37   68:iload           4
	//   38   70:iconst_1        
	//   39   71:isub            
	//   40   72:istore_3        
			else
	//*  41   73:goto            21
				return k;
	//   42   76:iload           4
	//   43   78:ireturn         
		}

		return -(i + 1);
	//   44   79:iload_2         
	//   45   80:iconst_1        
	//   46   81:iadd            
	//   47   82:ineg            
	//   48   83:ireturn         
	}

	public static final int binarySearch(List list, Object obj, Comparator comparator, int i, int j)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #142 <String "receiver$0">
	//    2    3:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (comparator)), "comparator");
	//    3    6:aload_2         
	//    4    7:ldc1            #172 <String "comparator">
	//    5    9:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		rangeCheck$CollectionsKt__CollectionsKt(list.size(), i, j);
	//    6   12:aload_0         
	//    7   13:invokeinterface #148 <Method int List.size()>
	//    8   18:iload_3         
	//    9   19:iload           4
	//   10   21:invokestatic    #151 <Method void rangeCheck$CollectionsKt__CollectionsKt(int, int, int)>
		for(j--; i <= j;)
	//*  11   24:iload           4
	//*  12   26:iconst_1        
	//*  13   27:isub            
	//*  14   28:istore          4
	//*  15   30:iload_3         
	//*  16   31:iload           4
	//*  17   33:icmpgt          91
		{
			int k = i + j >>> 1;
	//   18   36:iload_3         
	//   19   37:iload           4
	//   20   39:iadd            
	//   21   40:iconst_1        
	//   22   41:iushr           
	//   23   42:istore          5
			int l = comparator.compare(list.get(k), obj);
	//   24   44:aload_2         
	//   25   45:aload_0         
	//   26   46:iload           5
	//   27   48:invokeinterface #155 <Method Object List.get(int)>
	//   28   53:aload_1         
	//   29   54:invokeinterface #178 <Method int Comparator.compare(Object, Object)>
	//   30   59:istore          6
			if(l < 0)
	//*  31   61:iload           6
	//*  32   63:ifge            74
				i = k + 1;
	//   33   66:iload           5
	//   34   68:iconst_1        
	//   35   69:iadd            
	//   36   70:istore_3        
			else
	//*  37   71:goto            30
			if(l > 0)
	//*  38   74:iload           6
	//*  39   76:ifle            88
				j = k - 1;
	//   40   79:iload           5
	//   41   81:iconst_1        
	//   42   82:isub            
	//   43   83:istore          4
			else
	//*  44   85:goto            30
				return k;
	//   45   88:iload           5
	//   46   90:ireturn         
		}

		return -(i + 1);
	//   47   91:iload_3         
	//   48   92:iconst_1        
	//   49   93:iadd            
	//   50   94:ineg            
	//   51   95:ireturn         
	}

	public static int binarySearch$default(List list, int i, int j, Function1 function1, int k, Object obj)
	{
		if((k & 1) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_1        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_1        
		if((k & 2) != 0)
	//*   6    9:iload           4
	//*   7   11:iconst_2        
	//*   8   12:iand            
	//*   9   13:ifeq            23
			j = list.size();
	//   10   16:aload_0         
	//   11   17:invokeinterface #148 <Method int List.size()>
	//   12   22:istore_2        
		return CollectionsKt.binarySearch(list, i, j, function1);
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:iload_2         
	//   16   26:aload_3         
	//   17   27:invokestatic    #184 <Method int CollectionsKt.binarySearch(List, int, int, Function1)>
	//   18   30:ireturn         
	}

	public static int binarySearch$default(List list, Comparable comparable, int i, int j, int k, Object obj)
	{
		if((k & 2) != 0)
	//*   0    0:iload           4
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((k & 4) != 0)
	//*   6    9:iload           4
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            23
			j = list.size();
	//   10   16:aload_0         
	//   11   17:invokeinterface #148 <Method int List.size()>
	//   12   22:istore_3        
		return CollectionsKt.binarySearch(list, comparable, i, j);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:iload_3         
	//   17   27:invokestatic    #187 <Method int CollectionsKt.binarySearch(List, Comparable, int, int)>
	//   18   30:ireturn         
	}

	public static int binarySearch$default(List list, Object obj, Comparator comparator, int i, int j, int k, Object obj1)
	{
		if((k & 4) != 0)
	//*   0    0:iload           5
	//*   1    2:iconst_4        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_3        
		if((k & 8) != 0)
	//*   6    9:iload           5
	//*   7   11:bipush          8
	//*   8   13:iand            
	//*   9   14:ifeq            25
			j = list.size();
	//   10   17:aload_0         
	//   11   18:invokeinterface #148 <Method int List.size()>
	//   12   23:istore          4
		return CollectionsKt.binarySearch(list, obj, comparator, i, j);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:iload_3         
	//   17   29:iload           4
	//   18   31:invokestatic    #190 <Method int CollectionsKt.binarySearch(List, Object, Comparator, int, int)>
	//   19   34:ireturn         
	}

	public static final int binarySearchBy(List list, Comparable comparable, int i, int j, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #142 <String "receiver$0">
	//    2    3:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "selector");
	//    3    6:aload           4
	//    4    8:ldc1            #191 <String "selector">
	//    5   10:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	/* block-local class not found */
	class binarySearchBy._cls1 {}

		return CollectionsKt.binarySearch(list, i, j, (Function1)new binarySearchBy._cls1(function1, comparable));
	//    6   13:aload_0         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:new             #193 <Class CollectionsKt__CollectionsKt$binarySearchBy$1>
	//   10   19:dup             
	//   11   20:aload           4
	//   12   22:aload_1         
	//   13   23:invokespecial   #196 <Method void CollectionsKt__CollectionsKt$binarySearchBy$1(Function1, Comparable)>
	//   14   26:checkcast       #104 <Class Function1>
	//   15   29:invokestatic    #184 <Method int CollectionsKt.binarySearch(List, int, int, Function1)>
	//   16   32:ireturn         
	}

	public static int binarySearchBy$default(List list, Comparable comparable, int i, int j, Function1 function1, int k, Object obj)
	{
		if((k & 2) != 0)
	//*   0    0:iload           5
	//*   1    2:iconst_2        
	//*   2    3:iand            
	//*   3    4:ifeq            9
			i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if((k & 4) != 0)
	//*   6    9:iload           5
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            23
			j = list.size();
	//   10   16:aload_0         
	//   11   17:invokeinterface #148 <Method int List.size()>
	//   12   22:istore_3        
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "receiver$0");
	//   13   23:aload_0         
	//   14   24:ldc1            #142 <String "receiver$0">
	//   15   26:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "selector");
	//   16   29:aload           4
	//   17   31:ldc1            #191 <String "selector">
	//   18   33:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return CollectionsKt.binarySearch(list, i, j, (Function1)new binarySearchBy._cls1(function1, comparable));
	//   19   36:aload_0         
	//   20   37:iload_2         
	//   21   38:iload_3         
	//   22   39:new             #193 <Class CollectionsKt__CollectionsKt$binarySearchBy$1>
	//   23   42:dup             
	//   24   43:aload           4
	//   25   45:aload_1         
	//   26   46:invokespecial   #196 <Method void CollectionsKt__CollectionsKt$binarySearchBy$1(Function1, Comparable)>
	//   27   49:checkcast       #104 <Class Function1>
	//   28   52:invokestatic    #184 <Method int CollectionsKt.binarySearch(List, int, int, Function1)>
	//   29   55:ireturn         
	}

	private static final boolean containsAll(Collection collection, Collection collection1)
	{
		return collection.containsAll(collection1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #203 <Method boolean Collection.containsAll(Collection)>
	//    3    7:ireturn         
	}

	public static final List emptyList()
	{
		return (List)EmptyList.INSTANCE;
	//    0    0:getstatic       #211 <Field EmptyList EmptyList.INSTANCE>
	//    1    3:checkcast       #114 <Class List>
	//    2    6:areturn         
	}

	public static final IntRange getIndices(Collection collection)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (collection)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #142 <String "receiver$0">
	//    2    3:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return new IntRange(0, collection.size() - 1);
	//    3    6:new             #214 <Class IntRange>
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:invokeinterface #215 <Method int Collection.size()>
	//    8   17:iconst_1        
	//    9   18:isub            
	//   10   19:invokespecial   #218 <Method void IntRange(int, int)>
	//   11   22:areturn         
	}

	public static final int getLastIndex(List list)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #142 <String "receiver$0">
	//    2    3:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return list.size() - 1;
	//    3    6:aload_0         
	//    4    7:invokeinterface #148 <Method int List.size()>
	//    5   12:iconst_1        
	//    6   13:isub            
	//    7   14:ireturn         
	}

	private static final Object ifEmpty(Collection collection, Function0 function0)
	{
		Object obj = ((Object) (collection));
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(collection.isEmpty())
	//*   2    2:aload_0         
	//*   3    3:invokeinterface #225 <Method boolean Collection.isEmpty()>
	//*   4    8:ifeq            18
			obj = function0.invoke();
	//    5   11:aload_1         
	//    6   12:invokeinterface #230 <Method Object Function0.invoke()>
	//    7   17:astore_2        
		return obj;
	//    8   18:aload_2         
	//    9   19:areturn         
	}

	private static final boolean isNotEmpty(Collection collection)
	{
		return collection.isEmpty() ^ true;
	//    0    0:aload_0         
	//    1    1:invokeinterface #225 <Method boolean Collection.isEmpty()>
	//    2    6:iconst_1        
	//    3    7:ixor            
	//    4    8:ireturn         
	}

	private static final boolean isNullOrEmpty(Collection collection)
	{
		return collection == null || collection.isEmpty();
	//    0    0:aload_0         
	//    1    1:ifnull          18
	//    2    4:aload_0         
	//    3    5:invokeinterface #225 <Method boolean Collection.isEmpty()>
	//    4   10:ifeq            16
	//    5   13:goto            18
	//    6   16:iconst_0        
	//    7   17:ireturn         
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	private static final List listOf()
	{
		return CollectionsKt.emptyList();
	//    0    0:invokestatic    #234 <Method List CollectionsKt.emptyList()>
	//    1    3:areturn         
	}

	public static final transient List listOf(Object aobj[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (aobj)), "elements");
	//    0    0:aload_0         
	//    1    1:ldc1            #122 <String "elements">
	//    2    3:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(aobj.length > 0)
	//*   3    6:aload_0         
	//*   4    7:arraylength     
	//*   5    8:ifle            16
			return ArraysKt.asList(aobj);
	//    6   11:aload_0         
	//    7   12:invokestatic    #239 <Method List ArraysKt.asList(Object[])>
	//    8   15:areturn         
		else
			return CollectionsKt.emptyList();
	//    9   16:invokestatic    #234 <Method List CollectionsKt.emptyList()>
	//   10   19:areturn         
	}

	public static final List listOfNotNull(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
			return CollectionsKt.listOf(obj);
	//    2    4:aload_0         
	//    3    5:invokestatic    #242 <Method List CollectionsKt.listOf(Object)>
	//    4    8:areturn         
		else
			return CollectionsKt.emptyList();
	//    5    9:invokestatic    #234 <Method List CollectionsKt.emptyList()>
	//    6   12:areturn         
	}

	public static final transient List listOfNotNull(Object aobj[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (aobj)), "elements");
	//    0    0:aload_0         
	//    1    1:ldc1            #122 <String "elements">
	//    2    3:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return ArraysKt.filterNotNull(aobj);
	//    3    6:aload_0         
	//    4    7:invokestatic    #246 <Method List ArraysKt.filterNotNull(Object[])>
	//    5   10:areturn         
	}

	private static final List mutableListOf()
	{
		return (List)new ArrayList();
	//    0    0:new             #93  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void ArrayList()>
	//    3    7:checkcast       #114 <Class List>
	//    4   10:areturn         
	}

	public static final transient List mutableListOf(Object aobj[])
	{
		Intrinsics.checkParameterIsNotNull(((Object) (aobj)), "elements");
	//    0    0:aload_0         
	//    1    1:ldc1            #122 <String "elements">
	//    2    3:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(aobj.length == 0)
	//*   3    6:aload_0         
	//*   4    7:arraylength     
	//*   5    8:ifne            22
			return (List)new ArrayList();
	//    6   11:new             #93  <Class ArrayList>
	//    7   14:dup             
	//    8   15:invokespecial   #119 <Method void ArrayList()>
	//    9   18:checkcast       #114 <Class List>
	//   10   21:areturn         
		else
			return (List)new ArrayList((Collection)new ArrayAsCollection(aobj, true));
	//   11   22:new             #93  <Class ArrayList>
	//   12   25:dup             
	//   13   26:new             #130 <Class ArrayAsCollection>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:iconst_1        
	//   17   32:invokespecial   #133 <Method void ArrayAsCollection(Object[], boolean)>
	//   18   35:checkcast       #135 <Class Collection>
	//   19   38:invokespecial   #138 <Method void ArrayList(Collection)>
	//   20   41:checkcast       #114 <Class List>
	//   21   44:areturn         
	}

	public static final List optimizeReadOnlyList(List list)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #142 <String "receiver$0">
	//    2    3:invokestatic    #128 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		switch(list.size())
	//*   3    6:aload_0         
	//*   4    7:invokeinterface #148 <Method int List.size()>
		{
	//*   5   12:tableswitch     0 1: default 36
	//	               0 49
	//	               1 38
		default:
			return list;
	//    6   36:aload_0         
	//    7   37:areturn         

		case 1: // '\001'
			return CollectionsKt.listOf(list.get(0));
	//    8   38:aload_0         
	//    9   39:iconst_0        
	//   10   40:invokeinterface #155 <Method Object List.get(int)>
	//   11   45:invokestatic    #242 <Method List CollectionsKt.listOf(Object)>
	//   12   48:areturn         

		case 0: // '\0'
			return CollectionsKt.emptyList();
	//   13   49:invokestatic    #234 <Method List CollectionsKt.emptyList()>
	//   14   52:areturn         
		}
	}

	private static final Collection orEmpty(Collection collection)
	{
		if(collection != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return collection;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return (Collection)CollectionsKt.emptyList();
	//    4    6:invokestatic    #234 <Method List CollectionsKt.emptyList()>
	//    5    9:checkcast       #135 <Class Collection>
	//    6   12:areturn         
	}

	private static final List orEmpty(List list)
	{
		if(list != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return list;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return CollectionsKt.emptyList();
	//    4    6:invokestatic    #234 <Method List CollectionsKt.emptyList()>
	//    5    9:areturn         
	}

	private static final void rangeCheck$CollectionsKt__CollectionsKt(int i, int j, int k)
	{
		if(j > k)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmple          63
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #252 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #253 <Method void StringBuilder()>
	//    6   12:astore_3        
			stringbuilder.append("fromIndex (");
	//    7   13:aload_3         
	//    8   14:ldc1            #255 <String "fromIndex (">
	//    9   16:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
			stringbuilder.append(j);
	//   11   20:aload_3         
	//   12   21:iload_1         
	//   13   22:invokevirtual   #262 <Method StringBuilder StringBuilder.append(int)>
	//   14   25:pop             
			stringbuilder.append(") is greater than toIndex (");
	//   15   26:aload_3         
	//   16   27:ldc2            #264 <String ") is greater than toIndex (">
	//   17   30:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			stringbuilder.append(k);
	//   19   34:aload_3         
	//   20   35:iload_2         
	//   21   36:invokevirtual   #262 <Method StringBuilder StringBuilder.append(int)>
	//   22   39:pop             
			stringbuilder.append(").");
	//   23   40:aload_3         
	//   24   41:ldc2            #266 <String ").">
	//   25   44:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
			throw (Throwable)new IllegalArgumentException(stringbuilder.toString());
	//   27   48:new             #268 <Class IllegalArgumentException>
	//   28   51:dup             
	//   29   52:aload_3         
	//   30   53:invokevirtual   #272 <Method String StringBuilder.toString()>
	//   31   56:invokespecial   #275 <Method void IllegalArgumentException(String)>
	//   32   59:checkcast       #277 <Class Throwable>
	//   33   62:athrow          
		}
		if(j < 0)
	//*  34   63:iload_1         
	//*  35   64:ifge            111
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   36   67:new             #252 <Class StringBuilder>
	//   37   70:dup             
	//   38   71:invokespecial   #253 <Method void StringBuilder()>
	//   39   74:astore_3        
			stringbuilder1.append("fromIndex (");
	//   40   75:aload_3         
	//   41   76:ldc1            #255 <String "fromIndex (">
	//   42   78:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   43   81:pop             
			stringbuilder1.append(j);
	//   44   82:aload_3         
	//   45   83:iload_1         
	//   46   84:invokevirtual   #262 <Method StringBuilder StringBuilder.append(int)>
	//   47   87:pop             
			stringbuilder1.append(") is less than zero.");
	//   48   88:aload_3         
	//   49   89:ldc2            #279 <String ") is less than zero.">
	//   50   92:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   51   95:pop             
			throw (Throwable)new IndexOutOfBoundsException(stringbuilder1.toString());
	//   52   96:new             #281 <Class IndexOutOfBoundsException>
	//   53   99:dup             
	//   54  100:aload_3         
	//   55  101:invokevirtual   #272 <Method String StringBuilder.toString()>
	//   56  104:invokespecial   #282 <Method void IndexOutOfBoundsException(String)>
	//   57  107:checkcast       #277 <Class Throwable>
	//   58  110:athrow          
		}
		if(k > i)
	//*  59  111:iload_2         
	//*  60  112:iload_0         
	//*  61  113:icmple          175
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   62  116:new             #252 <Class StringBuilder>
	//   63  119:dup             
	//   64  120:invokespecial   #253 <Method void StringBuilder()>
	//   65  123:astore_3        
			stringbuilder2.append("toIndex (");
	//   66  124:aload_3         
	//   67  125:ldc2            #284 <String "toIndex (">
	//   68  128:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   69  131:pop             
			stringbuilder2.append(k);
	//   70  132:aload_3         
	//   71  133:iload_2         
	//   72  134:invokevirtual   #262 <Method StringBuilder StringBuilder.append(int)>
	//   73  137:pop             
			stringbuilder2.append(") is greater than size (");
	//   74  138:aload_3         
	//   75  139:ldc2            #286 <String ") is greater than size (">
	//   76  142:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   77  145:pop             
			stringbuilder2.append(i);
	//   78  146:aload_3         
	//   79  147:iload_0         
	//   80  148:invokevirtual   #262 <Method StringBuilder StringBuilder.append(int)>
	//   81  151:pop             
			stringbuilder2.append(").");
	//   82  152:aload_3         
	//   83  153:ldc2            #266 <String ").">
	//   84  156:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   85  159:pop             
			throw (Throwable)new IndexOutOfBoundsException(stringbuilder2.toString());
	//   86  160:new             #281 <Class IndexOutOfBoundsException>
	//   87  163:dup             
	//   88  164:aload_3         
	//   89  165:invokevirtual   #272 <Method String StringBuilder.toString()>
	//   90  168:invokespecial   #282 <Method void IndexOutOfBoundsException(String)>
	//   91  171:checkcast       #277 <Class Throwable>
	//   92  174:athrow          
		} else
		{
			return;
	//   93  175:return          
		}
	}

	public static final void throwCountOverflow()
	{
		throw (Throwable)new ArithmeticException("Count overflow has happened.");
	//    0    0:new             #289 <Class ArithmeticException>
	//    1    3:dup             
	//    2    4:ldc2            #291 <String "Count overflow has happened.">
	//    3    7:invokespecial   #292 <Method void ArithmeticException(String)>
	//    4   10:checkcast       #277 <Class Throwable>
	//    5   13:athrow          
	}

	public static final void throwIndexOverflow()
	{
		throw (Throwable)new ArithmeticException("Index overflow has happened.");
	//    0    0:new             #289 <Class ArithmeticException>
	//    1    3:dup             
	//    2    4:ldc2            #294 <String "Index overflow has happened.">
	//    3    7:invokespecial   #292 <Method void ArithmeticException(String)>
	//    4   10:checkcast       #277 <Class Throwable>
	//    5   13:athrow          
	}
}
