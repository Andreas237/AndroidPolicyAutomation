// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.javax.inject.Provider;
import java.util.*;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			Factory, InstanceFactory, DaggerCollections, Preconditions

public final class MapFactory
	implements Factory
{
	public static final class Builder
	{

		public MapFactory build()
		{
			return new MapFactory(((Map) (map)));
		//    0    0:new             #7   <Class MapFactory>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field LinkedHashMap map>
		//    4    8:aconst_null     
		//    5    9:invokespecial   #33  <Method void MapFactory(Map, MapFactory$1)>
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


	private MapFactory(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		contributingMap = Collections.unmodifiableMap(map);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #43  <Method Map Collections.unmodifiableMap(Map)>
	//    5    9:putfield        #45  <Field Map contributingMap>
	//    6   12:return          
	}


	public static Builder builder(int i)
	{
		return new Builder(i);
	//    0    0:new             #11  <Class MapFactory$Builder>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #55  <Method void MapFactory$Builder(int, MapFactory$1)>
	//    5    9:areturn         
	}

	public static Provider emptyMapProvider()
	{
		return EMPTY;
	//    0    0:getstatic       #34  <Field Provider EMPTY>
	//    1    3:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method Map get()>
	//    2    4:areturn         
	}

	public Map get()
	{
		LinkedHashMap linkedhashmap = DaggerCollections.newLinkedHashMapWithExpectedSize(contributingMap.size());
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Map contributingMap>
	//    2    4:invokeinterface #69  <Method int Map.size()>
	//    3    9:invokestatic    #75  <Method LinkedHashMap DaggerCollections.newLinkedHashMapWithExpectedSize(int)>
	//    4   12:astore_1        
		java.util.Map.Entry entry;
		for(Iterator iterator = contributingMap.entrySet().iterator(); iterator.hasNext(); ((Map) (linkedhashmap)).put(entry.getKey(), ((Provider)entry.getValue()).get()))
	//*   5   13:aload_0         
	//*   6   14:getfield        #45  <Field Map contributingMap>
	//*   7   17:invokeinterface #79  <Method Set Map.entrySet()>
	//*   8   22:invokeinterface #85  <Method Iterator Set.iterator()>
	//*   9   27:astore_2        
	//*  10   28:aload_2         
	//*  11   29:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//*  12   34:ifeq            77
			entry = (java.util.Map.Entry)iterator.next();
	//   13   37:aload_2         
	//   14   38:invokeinterface #94  <Method Object Iterator.next()>
	//   15   43:checkcast       #96  <Class java.util.Map$Entry>
	//   16   46:astore_3        

	//   17   47:aload_1         
	//   18   48:aload_3         
	//   19   49:invokeinterface #99  <Method Object java.util.Map$Entry.getKey()>
	//   20   54:aload_3         
	//   21   55:invokeinterface #102 <Method Object java.util.Map$Entry.getValue()>
	//   22   60:checkcast       #104 <Class Provider>
	//   23   63:invokeinterface #106 <Method Object Provider.get()>
	//   24   68:invokeinterface #110 <Method Object Map.put(Object, Object)>
	//   25   73:pop             
	//*  26   74:goto            28
		return Collections.unmodifiableMap(((Map) (linkedhashmap)));
	//   27   77:aload_1         
	//   28   78:invokestatic    #43  <Method Map Collections.unmodifiableMap(Map)>
	//   29   81:areturn         
	}

	private static final Provider EMPTY = InstanceFactory.create(((Object) (Collections.emptyMap())));
	private final Map contributingMap;

	static 
	{
	//    0    0:invokestatic    #26  <Method Map Collections.emptyMap()>
	//    1    3:invokestatic    #32  <Method Factory InstanceFactory.create(Object)>
	//    2    6:putstatic       #34  <Field Provider EMPTY>
	//*   3    9:return          
	}
}
