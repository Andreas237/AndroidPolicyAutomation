// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.table;

import java.util.HashMap;
import java.util.Map;

public class TransientCache
{

	public TransientCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		cache = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #13  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void HashMap()>
	//    6   12:putfield        #16  <Field Map cache>
	//    7   15:return          
	}

	private Map primeCache(Class class1)
	{
		Map map = (Map)cache.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Map cache>
	//    2    4:aload_1         
	//    3    5:invokeinterface #25  <Method Object Map.get(Object)>
	//    4   10:checkcast       #21  <Class Map>
	//    5   13:astore_3        
		Object obj = ((Object) (map));
	//    6   14:aload_3         
	//    7   15:astore_2        
		if(map == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       40
		{
			obj = ((Object) (new HashMap()));
	//   10   20:new             #13  <Class HashMap>
	//   11   23:dup             
	//   12   24:invokespecial   #14  <Method void HashMap()>
	//   13   27:astore_2        
			cache.put(((Object) (class1)), obj);
	//   14   28:aload_0         
	//   15   29:getfield        #16  <Field Map cache>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokeinterface #29  <Method Object Map.put(Object, Object)>
	//   19   39:pop             
		}
		return ((Map) (obj));
	//   20   40:aload_2         
	//   21   41:areturn         
	}

	public Object get(Class class1, Object obj)
	{
		return primeCache(class1).get(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method Map primeCache(Class)>
	//    3    5:aload_2         
	//    4    6:invokeinterface #25  <Method Object Map.get(Object)>
	//    5   11:areturn         
	}

	public void put(Class class1, Object obj, Object obj1)
	{
		primeCache(class1).put(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method Map primeCache(Class)>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #29  <Method Object Map.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	private Map cache;
}
