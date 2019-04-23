// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.javax.inject.Provider;
import java.util.LinkedHashMap;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			MapFactory, DaggerCollections, Preconditions

public static final class MapFactory$Builder
{

	public MapFactory build()
	{
		return new MapFactory(((java.util.Map) (map)), ((MapFactory._cls1) (null)));
	//    0    0:new             #7   <Class MapFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field LinkedHashMap map>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #33  <Method void MapFactory(java.util.Map, MapFactory$1)>
	//    6   12:areturn         
	}

	public MapFactory$Builder put(Object obj, Provider provider)
	{
		map.put(Preconditions.checkNotNull(obj, "key"), Preconditions.checkNotNull(((Object) (provider)), "provider"));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field LinkedHashMap map>
	//    2    4:aload_1         
	//    3    5:ldc1            #39  <String "key">
	//    4    7:invokestatic    #45  <Method Object Preconditions.checkNotNull(Object, String)>
	//    5   10:aload_2         
	//    6   11:ldc1            #47  <String "provider">
	//    7   13:invokestatic    #45  <Method Object Preconditions.checkNotNull(Object, String)>
	//    8   16:invokevirtual   #52  <Method Object LinkedHashMap.put(Object, Object)>
	//    9   19:pop             
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	private final LinkedHashMap map;

	private MapFactory$Builder(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		map = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #22  <Method LinkedHashMap DaggerCollections.newLinkedHashMapWithExpectedSize(int)>
	//    5    9:putfield        #24  <Field LinkedHashMap map>
	//    6   12:return          
	}

	MapFactory$Builder(int i, MapFactory._cls1 _pcls1)
	{
		this(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #28  <Method void MapFactory$Builder(int)>
	//    3    5:return          
	}
}
