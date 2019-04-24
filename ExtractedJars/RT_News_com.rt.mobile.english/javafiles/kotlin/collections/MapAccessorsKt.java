// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.collections;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

// Referenced classes of package kotlin.collections:
//			MapsKt

public final class MapAccessorsKt
{

	private static final Object getValue(Map map, Object obj, KProperty kproperty)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (map)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "receiver$0">
	//    2    3:invokestatic    #44  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return MapsKt.getOrImplicitDefaultNullable(map, ((Object) (kproperty.getName())));
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:invokeinterface #50  <Method String KProperty.getName()>
	//    6   13:invokestatic    #56  <Method Object MapsKt.getOrImplicitDefaultNullable(Map, Object)>
	//    7   16:areturn         
	}

	private static final Object getVar(Map map, Object obj, KProperty kproperty)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (map)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "receiver$0">
	//    2    3:invokestatic    #44  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return MapsKt.getOrImplicitDefaultNullable(map, ((Object) (kproperty.getName())));
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:invokeinterface #50  <Method String KProperty.getName()>
	//    6   13:invokestatic    #56  <Method Object MapsKt.getOrImplicitDefaultNullable(Map, Object)>
	//    7   16:areturn         
	}

	private static final Object getVarContravariant(Map map, Object obj, KProperty kproperty)
	{
		return MapsKt.getOrImplicitDefaultNullable(map, ((Object) (kproperty.getName())));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokeinterface #50  <Method String KProperty.getName()>
	//    3    7:invokestatic    #56  <Method Object MapsKt.getOrImplicitDefaultNullable(Map, Object)>
	//    4   10:areturn         
	}

	private static final void setValue(Map map, Object obj, KProperty kproperty, Object obj1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (map)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "receiver$0">
	//    2    3:invokestatic    #44  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		map.put(((Object) (kproperty.getName())), obj1);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:invokeinterface #50  <Method String KProperty.getName()>
	//    6   13:aload_3         
	//    7   14:invokeinterface #76  <Method Object Map.put(Object, Object)>
	//    8   19:pop             
	//    9   20:return          
	}
}
