// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.collections:
//			CollectionsKt__IterablesKt

class CollectionsKt__IteratorsJVMKt extends CollectionsKt__IterablesKt
{

	public CollectionsKt__IteratorsJVMKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void CollectionsKt__IterablesKt()>
	//    2    4:return          
	}

	public static final Iterator iterator(Enumeration enumeration)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (enumeration)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #33  <String "receiver$0">
	//    2    3:invokestatic    #39  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	/* block-local class not found */
	class iterator._cls1 {}

		return (Iterator)new iterator._cls1(enumeration);
	//    3    6:new             #41  <Class CollectionsKt__IteratorsJVMKt$iterator$1>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokespecial   #44  <Method void CollectionsKt__IteratorsJVMKt$iterator$1(Enumeration)>
	//    7   14:checkcast       #46  <Class Iterator>
	//    8   17:areturn         
	}
}
