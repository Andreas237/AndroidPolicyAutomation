// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.cache.memory;

import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.util.*;

// Referenced classes of package com.nostra13.universalimageloader.cache.memory:
//			MemoryCache

public abstract class BaseMemoryCache
	implements MemoryCache
{

	public BaseMemoryCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void HashMap()>
	//    6   12:invokestatic    #22  <Method Map Collections.synchronizedMap(Map)>
	//    7   15:putfield        #24  <Field Map softMap>
	//    8   18:return          
	}

	public void clear()
	{
		softMap.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map softMap>
	//    2    4:invokeinterface #30  <Method void Map.clear()>
	//    3    9:return          
	}

	protected abstract Reference createReference(Bitmap bitmap);

	public Bitmap get(String s)
	{
		s = ((String) ((Reference)softMap.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map softMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #37  <Method Object Map.get(Object)>
	//    4   10:checkcast       #39  <Class Reference>
	//    5   13:astore_1        
		if(s != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          26
			return (Bitmap)((Reference) (s)).get();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #42  <Method Object Reference.get()>
	//   10   22:checkcast       #44  <Class Bitmap>
	//   11   25:areturn         
		else
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
	}

	public Collection keys()
	{
		HashSet hashset;
		synchronized(softMap)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Map softMap>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			hashset = new HashSet(((Collection) (softMap.keySet())));
	//    5    7:new             #48  <Class HashSet>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #24  <Field Map softMap>
	//    9   15:invokeinterface #52  <Method java.util.Set Map.keySet()>
	//   10   20:invokespecial   #55  <Method void HashSet(Collection)>
	//   11   23:astore_2        
		}
	//   12   24:aload_1         
	//   13   25:monitorexit     
		return ((Collection) (hashset));
	//   14   26:aload_2         
	//   15   27:areturn         
		exception;
	//   16   28:astore_2        
		map;
	//   17   29:aload_1         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		throw exception;
	//   19   31:aload_2         
	//   20   32:athrow          
	}

	public boolean put(String s, Bitmap bitmap)
	{
		softMap.put(((Object) (s)), ((Object) (createReference(bitmap))));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map softMap>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #61  <Method Reference createReference(Bitmap)>
	//    6   10:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//    7   15:pop             
		return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
	}

	public Bitmap remove(String s)
	{
		s = ((String) ((Reference)softMap.remove(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Map softMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #67  <Method Object Map.remove(Object)>
	//    4   10:checkcast       #39  <Class Reference>
	//    5   13:astore_1        
		if(s == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       20
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
		else
			return (Bitmap)((Reference) (s)).get();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #42  <Method Object Reference.get()>
	//   12   24:checkcast       #44  <Class Bitmap>
	//   13   27:areturn         
	}

	private final Map softMap = Collections.synchronizedMap(((Map) (new HashMap())));
}
