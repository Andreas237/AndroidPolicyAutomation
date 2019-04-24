// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.collections;

import java.util.*;
import kotlin.TypeCastException;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package kotlin.collections:
//			CollectionsKt

class CollectionsKt__CollectionsJVMKt
{

	public CollectionsKt__CollectionsJVMKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:return          
	}

	private static final int checkCountOverflow(int i)
	{
		if(i < 0)
	//*   0    0:iload_0         
	//*   1    1:ifge            31
		{
			if(PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0))
	//*   2    4:iconst_1        
	//*   3    5:iconst_3        
	//*   4    6:iconst_0        
	//*   5    7:invokestatic    #56  <Method boolean PlatformImplementationsKt.apiVersionIsAtLeast(int, int, int)>
	//*   6   10:ifeq            18
			{
				CollectionsKt.throwCountOverflow();
	//    7   13:invokestatic    #60  <Method void CollectionsKt.throwCountOverflow()>
				return i;
	//    8   16:iload_0         
	//    9   17:ireturn         
			} else
			{
				throw (Throwable)new ArithmeticException("Count overflow has happened.");
	//   10   18:new             #62  <Class ArithmeticException>
	//   11   21:dup             
	//   12   22:ldc1            #64  <String "Count overflow has happened.">
	//   13   24:invokespecial   #67  <Method void ArithmeticException(String)>
	//   14   27:checkcast       #69  <Class Throwable>
	//   15   30:athrow          
			}
		} else
		{
			return i;
	//   16   31:iload_0         
	//   17   32:ireturn         
		}
	}

	private static final int checkIndexOverflow(int i)
	{
		if(i < 0)
	//*   0    0:iload_0         
	//*   1    1:ifge            31
		{
			if(PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0))
	//*   2    4:iconst_1        
	//*   3    5:iconst_3        
	//*   4    6:iconst_0        
	//*   5    7:invokestatic    #56  <Method boolean PlatformImplementationsKt.apiVersionIsAtLeast(int, int, int)>
	//*   6   10:ifeq            18
			{
				CollectionsKt.throwIndexOverflow();
	//    7   13:invokestatic    #73  <Method void CollectionsKt.throwIndexOverflow()>
				return i;
	//    8   16:iload_0         
	//    9   17:ireturn         
			} else
			{
				throw (Throwable)new ArithmeticException("Index overflow has happened.");
	//   10   18:new             #62  <Class ArithmeticException>
	//   11   21:dup             
	//   12   22:ldc1            #75  <String "Index overflow has happened.">
	//   13   24:invokespecial   #67  <Method void ArithmeticException(String)>
	//   14   27:checkcast       #69  <Class Throwable>
	//   15   30:athrow          
			}
		} else
		{
			return i;
	//   16   31:iload_0         
	//   17   32:ireturn         
		}
	}

	private static final Object[] copyToArrayImpl(Collection collection)
	{
		return CollectionToArray.toArray(collection);
	//    0    0:aload_0         
	//    1    1:invokestatic    #80  <Method Object[] CollectionToArray.toArray(Collection)>
	//    2    4:areturn         
	}

	private static final Object[] copyToArrayImpl(Collection collection, Object aobj[])
	{
		if(aobj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
	//    2    4:new             #84  <Class TypeCastException>
	//    3    7:dup             
	//    4    8:ldc1            #86  <String "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>">
	//    5   10:invokespecial   #87  <Method void TypeCastException(String)>
	//    6   13:athrow          
		collection = ((Collection) (CollectionToArray.toArray(collection, aobj)));
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokestatic    #89  <Method Object[] CollectionToArray.toArray(Collection, Object[])>
	//   10   19:astore_0        
		if(collection == null)
	//*  11   20:aload_0         
	//*  12   21:ifnonnull       34
			throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
	//   13   24:new             #84  <Class TypeCastException>
	//   14   27:dup             
	//   15   28:ldc1            #91  <String "null cannot be cast to non-null type kotlin.Array<T>">
	//   16   30:invokespecial   #87  <Method void TypeCastException(String)>
	//   17   33:athrow          
		else
			return ((Object []) (collection));
	//   18   34:aload_0         
	//   19   35:areturn         
	}

	public static final Object[] copyToArrayOfAny(Object aobj[], boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (aobj)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #95  <String "receiver$0">
	//    2    3:invokestatic    #101 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(flag && Intrinsics.areEqual(((Object) (((Object) (aobj)).getClass())), [Ljava/lang/Object;))
	//*   3    6:iload_1         
	//*   4    7:ifeq            24
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #105 <Method Class Object.getClass()>
	//*   7   14:ldc1            #107 <Class Object[]>
	//*   8   16:invokestatic    #111 <Method boolean Intrinsics.areEqual(Object, Object)>
	//*   9   19:ifeq            24
		{
			return aobj;
	//   10   22:aload_0         
	//   11   23:areturn         
		} else
		{
			aobj = Arrays.copyOf(aobj, aobj.length, [Ljava/lang/Object;);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:arraylength     
	//   15   27:ldc1            #107 <Class Object[]>
	//   16   29:invokestatic    #117 <Method Object[] Arrays.copyOf(Object[], int, Class)>
	//   17   32:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (aobj)), "java.util.Arrays.copyOf(\u2026 Array<Any?>::class.java)");
	//   18   33:aload_0         
	//   19   34:ldc1            #119 <String "java.util.Arrays.copyOf(\u2026 Array<Any?>::class.java)">
	//   20   36:invokestatic    #122 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return aobj;
	//   21   39:aload_0         
	//   22   40:areturn         
		}
	}

	public static final List listOf(Object obj)
	{
		obj = ((Object) (Collections.singletonList(obj)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #129 <Method List Collections.singletonList(Object)>
	//    2    4:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(obj, "java.util.Collections.singletonList(element)");
	//    3    5:aload_0         
	//    4    6:ldc1            #131 <String "java.util.Collections.singletonList(element)">
	//    5    8:invokestatic    #122 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((List) (obj));
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	private static final List toList(Enumeration enumeration)
	{
		enumeration = ((Enumeration) (Collections.list(enumeration)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #137 <Method java.util.ArrayList Collections.list(Enumeration)>
	//    2    4:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (enumeration)), "java.util.Collections.list(this)");
	//    3    5:aload_0         
	//    4    6:ldc1            #139 <String "java.util.Collections.list(this)">
	//    5    8:invokestatic    #122 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return (List)enumeration;
	//    6   11:aload_0         
	//    7   12:checkcast       #141 <Class List>
	//    8   15:areturn         
	}
}
