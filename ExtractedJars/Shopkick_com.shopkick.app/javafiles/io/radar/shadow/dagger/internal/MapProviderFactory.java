// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.dagger.Lazy;
import io.radar.shadow.javax.inject.Provider;
import java.util.*;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			Factory, DaggerCollections, Preconditions

public final class MapProviderFactory
	implements Factory, Lazy
{
	public static final class Builder
	{

		public MapProviderFactory build()
		{
			return new MapProviderFactory(((Map) (map)));
		//    0    0:new             #7   <Class MapProviderFactory>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field LinkedHashMap map>
		//    4    8:aconst_null     
		//    5    9:invokespecial   #33  <Method void MapProviderFactory(Map, MapProviderFactory$1)>
		//    6   12:areturn         
		}

		public Builder put(Object obj, Provider provider)
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

		private Builder(int i)
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

	}


	private MapProviderFactory(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		contributingMap = Collections.unmodifiableMap(map);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #28  <Method Map Collections.unmodifiableMap(Map)>
	//    5    9:putfield        #30  <Field Map contributingMap>
	//    6   12:return          
	}


	public static Builder builder(int i)
	{
		return new Builder(i);
	//    0    0:new             #13  <Class MapProviderFactory$Builder>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #41  <Method void MapProviderFactory$Builder(int, MapProviderFactory$1)>
	//    5    9:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method Map get()>
	//    2    4:areturn         
	}

	public Map get()
	{
		return contributingMap;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map contributingMap>
	//    2    4:areturn         
	}

	private final Map contributingMap;
}
