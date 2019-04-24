// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.cache;

import com.raizlabs.android.dbflow.config.FlowLog;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.raizlabs.android.dbflow.structure.cache:
//			ModelCache

public class SimpleMapCache extends ModelCache
{

	public SimpleMapCache(int i)
	{
		super(((Object) (new HashMap(i))));
	//    0    0:aload_0         
	//    1    1:new             #9   <Class HashMap>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #11  <Method void HashMap(int)>
	//    5    9:invokespecial   #14  <Method void ModelCache(Object)>
	//    6   12:return          
	}

	public SimpleMapCache(Map map)
	{
		super(((Object) (map)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void ModelCache(Object)>
	//    3    5:return          
	}

	public void addModel(Object obj, Object obj1)
	{
		((Map)getCache()).put(obj, obj1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Object getCache()>
	//    2    4:checkcast       #26  <Class Map>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void clear()
	{
		((Map)getCache()).clear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Object getCache()>
	//    2    4:checkcast       #26  <Class Map>
	//    3    7:invokeinterface #35  <Method void Map.clear()>
	//    4   12:return          
	}

	public Object get(Object obj)
	{
		return ((Map)getCache()).get(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Object getCache()>
	//    2    4:checkcast       #26  <Class Map>
	//    3    7:aload_1         
	//    4    8:invokeinterface #39  <Method Object Map.get(Object)>
	//    5   13:areturn         
	}

	public Object removeModel(Object obj)
	{
		return ((Map)getCache()).remove(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method Object getCache()>
	//    2    4:checkcast       #26  <Class Map>
	//    3    7:aload_1         
	//    4    8:invokeinterface #44  <Method Object Map.remove(Object)>
	//    5   13:areturn         
	}

	public void setCacheSize(int i)
	{
		FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.I, (new StringBuilder()).append("The cache size for ").append(((Class) (com/raizlabs/android/dbflow/structure/cache/SimpleMapCache)).getSimpleName()).append(" is not re-configurable.").toString());
	//    0    0:getstatic       #51  <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.I>
	//    1    3:new             #53  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #55  <Method void StringBuilder()>
	//    4   10:ldc1            #57  <String "The cache size for ">
	//    5   12:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:ldc1            #2   <Class SimpleMapCache>
	//    7   17:invokevirtual   #67  <Method String Class.getSimpleName()>
	//    8   20:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//    9   23:ldc1            #69  <String " is not re-configurable.">
	//   10   25:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   11   28:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   12   31:invokestatic    #78  <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
	//   13   34:return          
	}
}
