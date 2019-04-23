// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			DaggerCollections

public final class MapBuilder
{

	private MapBuilder(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		contributions = ((Map) (DaggerCollections.newLinkedHashMapWithExpectedSize(i)));
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #19  <Method java.util.LinkedHashMap DaggerCollections.newLinkedHashMapWithExpectedSize(int)>
	//    5    9:putfield        #21  <Field Map contributions>
	//    6   12:return          
	}

	public static MapBuilder newMapBuilder(int i)
	{
		return new MapBuilder(i);
	//    0    0:new             #2   <Class MapBuilder>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #26  <Method void MapBuilder(int)>
	//    4    8:areturn         
	}

	public Map build()
	{
		if(contributions.size() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Map contributions>
	//*   2    4:invokeinterface #36  <Method int Map.size()>
	//*   3    9:ifeq            20
			return Collections.unmodifiableMap(contributions);
	//    4   12:aload_0         
	//    5   13:getfield        #21  <Field Map contributions>
	//    6   16:invokestatic    #42  <Method Map Collections.unmodifiableMap(Map)>
	//    7   19:areturn         
		else
			return Collections.emptyMap();
	//    8   20:invokestatic    #45  <Method Map Collections.emptyMap()>
	//    9   23:areturn         
	}

	public MapBuilder put(Object obj, Object obj1)
	{
		contributions.put(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Map contributions>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #51  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public MapBuilder putAll(Map map)
	{
		contributions.putAll(map);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Map contributions>
	//    2    4:aload_1         
	//    3    5:invokeinterface #57  <Method void Map.putAll(Map)>
		return this;
	//    4   10:aload_0         
	//    5   11:areturn         
	}

	private final Map contributions;
}
