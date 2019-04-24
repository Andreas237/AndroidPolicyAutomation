// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.collections;

import java.util.*;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.collections:
//			CollectionsKt__CollectionsKt, CollectionsKt

class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt
{

	public CollectionsKt__IterablesKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void CollectionsKt__CollectionsKt()>
	//    2    4:return          
	}

	private static final Iterable Iterable(Function0 function0)
	{
	/* block-local class not found */
	class Iterable._cls1 {}

		return (Iterable)new Iterable._cls1(function0);
	//    0    0:new             #47  <Class CollectionsKt__IterablesKt$Iterable$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #50  <Method void CollectionsKt__IterablesKt$Iterable$1(Function0)>
	//    4    8:checkcast       #52  <Class Iterable>
	//    5   11:areturn         
	}

	public static final int collectionSizeOrDefault(Iterable iterable, int i)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <String "receiver$0">
	//    2    3:invokestatic    #66  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(iterable instanceof Collection)
	//*   3    6:aload_0         
	//*   4    7:instanceof      #68  <Class Collection>
	//*   5   10:ifeq            23
			i = ((Collection)iterable).size();
	//    6   13:aload_0         
	//    7   14:checkcast       #68  <Class Collection>
	//    8   17:invokeinterface #72  <Method int Collection.size()>
	//    9   22:istore_1        
		return i;
	//   10   23:iload_1         
	//   11   24:ireturn         
	}

	public static final Integer collectionSizeOrNull(Iterable iterable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <String "receiver$0">
	//    2    3:invokestatic    #66  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(iterable instanceof Collection)
	//*   3    6:aload_0         
	//*   4    7:instanceof      #68  <Class Collection>
	//*   5   10:ifeq            26
			return Integer.valueOf(((Collection)iterable).size());
	//    6   13:aload_0         
	//    7   14:checkcast       #68  <Class Collection>
	//    8   17:invokeinterface #72  <Method int Collection.size()>
	//    9   22:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   10   25:areturn         
		else
			return null;
	//   11   26:aconst_null     
	//   12   27:areturn         
	}

	public static final Collection convertToSetForSetOperation(Iterable iterable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <String "receiver$0">
	//    2    3:invokestatic    #66  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(iterable instanceof Set)
	//*   3    6:aload_0         
	//*   4    7:instanceof      #85  <Class Set>
	//*   5   10:ifeq            18
			return (Collection)iterable;
	//    6   13:aload_0         
	//    7   14:checkcast       #68  <Class Collection>
	//    8   17:areturn         
		if(iterable instanceof Collection)
	//*   9   18:aload_0         
	//*  10   19:instanceof      #68  <Class Collection>
	//*  11   22:ifeq            47
		{
			Collection collection = (Collection)iterable;
	//   12   25:aload_0         
	//   13   26:checkcast       #68  <Class Collection>
	//   14   29:astore_1        
			if(safeToConvertToSet$CollectionsKt__IterablesKt(collection))
	//*  15   30:aload_1         
	//*  16   31:invokestatic    #88  <Method boolean safeToConvertToSet$CollectionsKt__IterablesKt(Collection)>
	//*  17   34:ifeq            45
				return (Collection)CollectionsKt.toHashSet(iterable);
	//   18   37:aload_0         
	//   19   38:invokestatic    #93  <Method java.util.HashSet CollectionsKt.toHashSet(Iterable)>
	//   20   41:checkcast       #68  <Class Collection>
	//   21   44:areturn         
			else
				return collection;
	//   22   45:aload_1         
	//   23   46:areturn         
		} else
		{
			return (Collection)CollectionsKt.toHashSet(iterable);
	//   24   47:aload_0         
	//   25   48:invokestatic    #93  <Method java.util.HashSet CollectionsKt.toHashSet(Iterable)>
	//   26   51:checkcast       #68  <Class Collection>
	//   27   54:areturn         
		}
	}

	public static final Collection convertToSetForSetOperationWith(Iterable iterable, Iterable iterable1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <String "receiver$0">
	//    2    3:invokestatic    #66  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (iterable1)), "source");
	//    3    6:aload_1         
	//    4    7:ldc1            #96  <String "source">
	//    5    9:invokestatic    #66  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(iterable instanceof Set)
	//*   6   12:aload_0         
	//*   7   13:instanceof      #85  <Class Set>
	//*   8   16:ifeq            24
			return (Collection)iterable;
	//    9   19:aload_0         
	//   10   20:checkcast       #68  <Class Collection>
	//   11   23:areturn         
		if(iterable instanceof Collection)
	//*  12   24:aload_0         
	//*  13   25:instanceof      #68  <Class Collection>
	//*  14   28:ifeq            78
		{
			if((iterable1 instanceof Collection) && ((Collection)iterable1).size() < 2)
	//*  15   31:aload_1         
	//*  16   32:instanceof      #68  <Class Collection>
	//*  17   35:ifeq            56
	//*  18   38:aload_1         
	//*  19   39:checkcast       #68  <Class Collection>
	//*  20   42:invokeinterface #72  <Method int Collection.size()>
	//*  21   47:iconst_2        
	//*  22   48:icmpge          56
				return (Collection)iterable;
	//   23   51:aload_0         
	//   24   52:checkcast       #68  <Class Collection>
	//   25   55:areturn         
			iterable1 = ((Iterable) ((Collection)iterable));
	//   26   56:aload_0         
	//   27   57:checkcast       #68  <Class Collection>
	//   28   60:astore_1        
			if(safeToConvertToSet$CollectionsKt__IterablesKt(((Collection) (iterable1))))
	//*  29   61:aload_1         
	//*  30   62:invokestatic    #88  <Method boolean safeToConvertToSet$CollectionsKt__IterablesKt(Collection)>
	//*  31   65:ifeq            76
				return (Collection)CollectionsKt.toHashSet(iterable);
	//   32   68:aload_0         
	//   33   69:invokestatic    #93  <Method java.util.HashSet CollectionsKt.toHashSet(Iterable)>
	//   34   72:checkcast       #68  <Class Collection>
	//   35   75:areturn         
			else
				return ((Collection) (iterable1));
	//   36   76:aload_1         
	//   37   77:areturn         
		} else
		{
			return (Collection)CollectionsKt.toHashSet(iterable);
	//   38   78:aload_0         
	//   39   79:invokestatic    #93  <Method java.util.HashSet CollectionsKt.toHashSet(Iterable)>
	//   40   82:checkcast       #68  <Class Collection>
	//   41   85:areturn         
		}
	}

	public static final List flatten(Iterable iterable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <String "receiver$0">
	//    2    3:invokestatic    #66  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		ArrayList arraylist = new ArrayList();
	//    3    6:new             #100 <Class ArrayList>
	//    4    9:dup             
	//    5   10:invokespecial   #101 <Method void ArrayList()>
	//    6   13:astore_1        
		Iterable iterable1;
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); CollectionsKt.addAll((Collection)arraylist, iterable1))
	//*   7   14:aload_0         
	//*   8   15:invokeinterface #104 <Method Iterator Iterable.iterator()>
	//*   9   20:astore_0        
	//*  10   21:aload_0         
	//*  11   22:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//*  12   27:ifeq            52
			iterable1 = (Iterable)((Iterator) (iterable)).next();
	//   13   30:aload_0         
	//   14   31:invokeinterface #114 <Method Object Iterator.next()>
	//   15   36:checkcast       #52  <Class Iterable>
	//   16   39:astore_2        

	//   17   40:aload_1         
	//   18   41:checkcast       #68  <Class Collection>
	//   19   44:aload_2         
	//   20   45:invokestatic    #118 <Method boolean CollectionsKt.addAll(Collection, Iterable)>
	//   21   48:pop             
	//*  22   49:goto            21
		return (List)arraylist;
	//   23   52:aload_1         
	//   24   53:checkcast       #120 <Class List>
	//   25   56:areturn         
	}

	private static final boolean safeToConvertToSet$CollectionsKt__IterablesKt(Collection collection)
	{
		return collection.size() > 2 && (collection instanceof ArrayList);
	//    0    0:aload_0         
	//    1    1:invokeinterface #72  <Method int Collection.size()>
	//    2    6:iconst_2        
	//    3    7:icmple          19
	//    4   10:aload_0         
	//    5   11:instanceof      #100 <Class ArrayList>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public static final Pair unzip(Iterable iterable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <String "receiver$0">
	//    2    3:invokestatic    #66  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		int i = CollectionsKt.collectionSizeOrDefault(iterable, 10);
	//    3    6:aload_0         
	//    4    7:bipush          10
	//    5    9:invokestatic    #125 <Method int CollectionsKt.collectionSizeOrDefault(Iterable, int)>
	//    6   12:istore_1        
		ArrayList arraylist = new ArrayList(i);
	//    7   13:new             #100 <Class ArrayList>
	//    8   16:dup             
	//    9   17:iload_1         
	//   10   18:invokespecial   #128 <Method void ArrayList(int)>
	//   11   21:astore_2        
		ArrayList arraylist1 = new ArrayList(i);
	//   12   22:new             #100 <Class ArrayList>
	//   13   25:dup             
	//   14   26:iload_1         
	//   15   27:invokespecial   #128 <Method void ArrayList(int)>
	//   16   30:astore_3        
		Pair pair;
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); arraylist1.add(pair.getSecond()))
	//*  17   31:aload_0         
	//*  18   32:invokeinterface #104 <Method Iterator Iterable.iterator()>
	//*  19   37:astore_0        
	//*  20   38:aload_0         
	//*  21   39:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//*  22   44:ifeq            81
		{
			pair = (Pair)((Iterator) (iterable)).next();
	//   23   47:aload_0         
	//   24   48:invokeinterface #114 <Method Object Iterator.next()>
	//   25   53:checkcast       #130 <Class Pair>
	//   26   56:astore          4
			arraylist.add(pair.getFirst());
	//   27   58:aload_2         
	//   28   59:aload           4
	//   29   61:invokevirtual   #133 <Method Object Pair.getFirst()>
	//   30   64:invokevirtual   #137 <Method boolean ArrayList.add(Object)>
	//   31   67:pop             
		}

	//   32   68:aload_3         
	//   33   69:aload           4
	//   34   71:invokevirtual   #140 <Method Object Pair.getSecond()>
	//   35   74:invokevirtual   #137 <Method boolean ArrayList.add(Object)>
	//   36   77:pop             
	//*  37   78:goto            38
		return TuplesKt.to(((Object) (arraylist)), ((Object) (arraylist1)));
	//   38   81:aload_2         
	//   39   82:aload_3         
	//   40   83:invokestatic    #146 <Method Pair TuplesKt.to(Object, Object)>
	//   41   86:areturn         
	}
}
