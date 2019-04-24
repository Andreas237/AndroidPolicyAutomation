// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.collections:
//			CollectionsKt__IteratorsJVMKt, IndexingIterator

class CollectionsKt__IteratorsKt extends CollectionsKt__IteratorsJVMKt
{

	public CollectionsKt__IteratorsKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void CollectionsKt__IteratorsJVMKt()>
	//    2    4:return          
	}

	public static final void forEach(Iterator iterator1, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterator1)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #37  <String "receiver$0">
	//    2    3:invokestatic    #43  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "operation");
	//    3    6:aload_1         
	//    4    7:ldc1            #44  <String "operation">
	//    5    9:invokestatic    #43  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		for(; iterator1.hasNext(); function1.invoke(iterator1.next()));
	//    6   12:aload_0         
	//    7   13:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            37
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:invokeinterface #54  <Method Object Iterator.next()>
	//   12   28:invokeinterface #60  <Method Object Function1.invoke(Object)>
	//   13   33:pop             
	//*  14   34:goto            12
	//   15   37:return          
	}

	private static final Iterator iterator(Iterator iterator1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterator1)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #37  <String "receiver$0">
	//    2    3:invokestatic    #43  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return iterator1;
	//    3    6:aload_0         
	//    4    7:areturn         
	}

	public static final Iterator withIndex(Iterator iterator1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (iterator1)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #37  <String "receiver$0">
	//    2    3:invokestatic    #43  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return (Iterator)new IndexingIterator(iterator1);
	//    3    6:new             #69  <Class IndexingIterator>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokespecial   #72  <Method void IndexingIterator(Iterator)>
	//    7   14:checkcast       #46  <Class Iterator>
	//    8   17:areturn         
	}
}
