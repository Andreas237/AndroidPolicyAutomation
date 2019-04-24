// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			HttpDataSource

public static final class HttpDataSource$RequestProperties
{

	public void clear()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		requestPropertiesSnapshot = null;
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:putfield        #24  <Field Map requestPropertiesSnapshot>
		requestProperties.clear();
	//    5    7:aload_0         
	//    6    8:getfield        #20  <Field Map requestProperties>
	//    7   11:invokeinterface #28  <Method void Map.clear()>
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return;
	//   10   18:return          
		Exception exception;
		exception;
	//   11   19:astore_1        
	//*  12   20:aload_0         
		throw exception;
	//   13   21:monitorexit     
	//   14   22:aload_1         
	//   15   23:athrow          
	}

	public void clearAndSet(Map map)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		requestPropertiesSnapshot = null;
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:putfield        #24  <Field Map requestPropertiesSnapshot>
		requestProperties.clear();
	//    5    7:aload_0         
	//    6    8:getfield        #20  <Field Map requestProperties>
	//    7   11:invokeinterface #28  <Method void Map.clear()>
		requestProperties.putAll(map);
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field Map requestProperties>
	//   10   20:aload_1         
	//   11   21:invokeinterface #33  <Method void Map.putAll(Map)>
		this;
	//   12   26:aload_0         
		JVM INSTR monitorexit ;
	//   13   27:monitorexit     
		return;
	//   14   28:return          
		map;
	//   15   29:astore_1        
	//*  16   30:aload_0         
		throw map;
	//   17   31:monitorexit     
	//   18   32:aload_1         
	//   19   33:athrow          
	}

	public Map getSnapshot()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Map map;
		if(requestPropertiesSnapshot == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #24  <Field Map requestPropertiesSnapshot>
	//*   4    6:ifnonnull       27
			requestPropertiesSnapshot = Collections.unmodifiableMap(((Map) (new HashMap(requestProperties))));
	//    5    9:aload_0         
	//    6   10:new             #17  <Class HashMap>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #20  <Field Map requestProperties>
	//   10   18:invokespecial   #39  <Method void HashMap(Map)>
	//   11   21:invokestatic    #45  <Method Map Collections.unmodifiableMap(Map)>
	//   12   24:putfield        #24  <Field Map requestPropertiesSnapshot>
		map = requestPropertiesSnapshot;
	//   13   27:aload_0         
	//   14   28:getfield        #24  <Field Map requestPropertiesSnapshot>
	//   15   31:astore_1        
		this;
	//   16   32:aload_0         
		JVM INSTR monitorexit ;
	//   17   33:monitorexit     
		return map;
	//   18   34:aload_1         
	//   19   35:areturn         
		Exception exception;
		exception;
	//   20   36:astore_1        
	//*  21   37:aload_0         
		throw exception;
	//   22   38:monitorexit     
	//   23   39:aload_1         
	//   24   40:athrow          
	}

	public void remove(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		requestPropertiesSnapshot = null;
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:putfield        #24  <Field Map requestPropertiesSnapshot>
		requestProperties.remove(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #20  <Field Map requestProperties>
	//    7   11:aload_1         
	//    8   12:invokeinterface #51  <Method Object Map.remove(Object)>
	//    9   17:pop             
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		s;
	//   13   21:astore_1        
	//*  14   22:aload_0         
		throw s;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public void set(String s, String s1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		requestPropertiesSnapshot = null;
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:putfield        #24  <Field Map requestPropertiesSnapshot>
		requestProperties.put(((Object) (s)), ((Object) (s1)));
	//    5    7:aload_0         
	//    6    8:getfield        #20  <Field Map requestProperties>
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokeinterface #57  <Method Object Map.put(Object, Object)>
	//   10   18:pop             
		this;
	//   11   19:aload_0         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return;
	//   13   21:return          
		s;
	//   14   22:astore_1        
	//*  15   23:aload_0         
		throw s;
	//   16   24:monitorexit     
	//   17   25:aload_1         
	//   18   26:athrow          
	}

	public void set(Map map)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		requestPropertiesSnapshot = null;
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:putfield        #24  <Field Map requestPropertiesSnapshot>
		requestProperties.putAll(map);
	//    5    7:aload_0         
	//    6    8:getfield        #20  <Field Map requestProperties>
	//    7   11:aload_1         
	//    8   12:invokeinterface #33  <Method void Map.putAll(Map)>
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		map;
	//   12   20:astore_1        
	//*  13   21:aload_0         
		throw map;
	//   14   22:monitorexit     
	//   15   23:aload_1         
	//   16   24:athrow          
	}

	private final Map requestProperties = new HashMap();
	private Map requestPropertiesSnapshot;

	public HttpDataSource$RequestProperties()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashMap()>
	//    6   12:putfield        #20  <Field Map requestProperties>
	//    7   15:return          
	}
}
