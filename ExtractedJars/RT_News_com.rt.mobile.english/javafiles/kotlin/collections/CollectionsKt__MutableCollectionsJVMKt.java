// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.collections;

import java.util.*;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.collections:
//			CollectionsKt__IteratorsKt, CollectionsKt

class CollectionsKt__MutableCollectionsJVMKt extends CollectionsKt__IteratorsKt
{

	public CollectionsKt__MutableCollectionsJVMKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void CollectionsKt__IteratorsKt()>
	//    2    4:return          
	}

	private static final void fill(List list, Object obj)
	{
		Collections.fill(list, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #50  <Method void Collections.fill(List, Object)>
	//    3    5:return          
	}

	private static final void shuffle(List list)
	{
		Collections.shuffle(list);
	//    0    0:aload_0         
	//    1    1:invokestatic    #57  <Method void Collections.shuffle(List)>
	//    2    4:return          
	}

	private static final void shuffle(List list, Random random)
	{
		Collections.shuffle(list, random);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #61  <Method void Collections.shuffle(List, Random)>
	//    3    5:return          
	}

	public static final List shuffled(Iterable iterable)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #65  <String "receiver$0">
	//    2    3:invokestatic    #71  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		iterable = ((Iterable) (CollectionsKt.toMutableList(iterable)));
	//    3    6:aload_0         
	//    4    7:invokestatic    #75  <Method List CollectionsKt.toMutableList(Iterable)>
	//    5   10:astore_0        
		Collections.shuffle(((List) (iterable)));
	//    6   11:aload_0         
	//    7   12:invokestatic    #57  <Method void Collections.shuffle(List)>
		return ((List) (iterable));
	//    8   15:aload_0         
	//    9   16:areturn         
	}

	public static final List shuffled(Iterable iterable, Random random)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterable)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #65  <String "receiver$0">
	//    2    3:invokestatic    #71  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (random)), "random");
	//    3    6:aload_1         
	//    4    7:ldc1            #78  <String "random">
	//    5    9:invokestatic    #71  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		iterable = ((Iterable) (CollectionsKt.toMutableList(iterable)));
	//    6   12:aload_0         
	//    7   13:invokestatic    #75  <Method List CollectionsKt.toMutableList(Iterable)>
	//    8   16:astore_0        
		Collections.shuffle(((List) (iterable)), random);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokestatic    #61  <Method void Collections.shuffle(List, Random)>
		return ((List) (iterable));
	//   12   22:aload_0         
	//   13   23:areturn         
	}

	public static final void sort(List list)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #65  <String "receiver$0">
	//    2    3:invokestatic    #71  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(list.size() > 1)
	//*   3    6:aload_0         
	//*   4    7:invokeinterface #85  <Method int List.size()>
	//*   5   12:iconst_1        
	//*   6   13:icmple          20
			Collections.sort(list);
	//    7   16:aload_0         
	//    8   17:invokestatic    #87  <Method void Collections.sort(List)>
	//    9   20:return          
	}

	private static final void sort(List list, Comparator comparator)
	{
		throw (Throwable)new NotImplementedError(((String) (null)), 1, ((kotlin.jvm.internal.DefaultConstructorMarker) (null)));
	//    0    0:new             #102 <Class NotImplementedError>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:iconst_1        
	//    4    6:aconst_null     
	//    5    7:invokespecial   #105 <Method void NotImplementedError(String, int, kotlin.jvm.internal.DefaultConstructorMarker)>
	//    6   10:checkcast       #107 <Class Throwable>
	//    7   13:athrow          
	}

	private static final void sort(List list, Function2 function2)
	{
		throw (Throwable)new NotImplementedError(((String) (null)), 1, ((kotlin.jvm.internal.DefaultConstructorMarker) (null)));
	//    0    0:new             #102 <Class NotImplementedError>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:iconst_1        
	//    4    6:aconst_null     
	//    5    7:invokespecial   #105 <Method void NotImplementedError(String, int, kotlin.jvm.internal.DefaultConstructorMarker)>
	//    6   10:checkcast       #107 <Class Throwable>
	//    7   13:athrow          
	}

	public static final void sortWith(List list, Comparator comparator)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (list)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #65  <String "receiver$0">
	//    2    3:invokestatic    #71  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (comparator)), "comparator");
	//    3    6:aload_1         
	//    4    7:ldc1            #114 <String "comparator">
	//    5    9:invokestatic    #71  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(list.size() > 1)
	//*   6   12:aload_0         
	//*   7   13:invokeinterface #85  <Method int List.size()>
	//*   8   18:iconst_1        
	//*   9   19:icmple          27
			Collections.sort(list, comparator);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokestatic    #116 <Method void Collections.sort(List, Comparator)>
	//   13   27:return          
	}
}
