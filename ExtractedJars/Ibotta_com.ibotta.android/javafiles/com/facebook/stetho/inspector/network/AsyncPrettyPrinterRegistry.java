// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			AsyncPrettyPrinterFactory

public class AsyncPrettyPrinterRegistry
{

	public AsyncPrettyPrinterRegistry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void HashMap()>
	//    6   12:putfield        #17  <Field Map mRegistry>
	//    7   15:return          
	}

	public AsyncPrettyPrinterFactory lookup(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = ((String) ((AsyncPrettyPrinterFactory)mRegistry.get(((Object) (s)))));
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field Map mRegistry>
	//    4    6:aload_1         
	//    5    7:invokeinterface #27  <Method Object Map.get(Object)>
	//    6   12:checkcast       #29  <Class AsyncPrettyPrinterFactory>
	//    7   15:astore_1        
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return ((AsyncPrettyPrinterFactory) (s));
	//   10   18:aload_1         
	//   11   19:areturn         
		s;
	//   12   20:astore_1        
	//*  13   21:aload_0         
		throw s;
	//   14   22:monitorexit     
	//   15   23:aload_1         
	//   16   24:athrow          
	}

	public void register(String s, AsyncPrettyPrinterFactory asyncprettyprinterfactory)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mRegistry.put(((Object) (s)), ((Object) (asyncprettyprinterfactory)));
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field Map mRegistry>
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokeinterface #36  <Method Object Map.put(Object, Object)>
	//    7   13:pop             
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		s;
	//   11   17:astore_1        
	//*  12   18:aload_0         
		throw s;
	//   13   19:monitorexit     
	//   14   20:aload_1         
	//   15   21:athrow          
	}

	public boolean unregister(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = ((String) (mRegistry.remove(((Object) (s)))));
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field Map mRegistry>
	//    4    6:aload_1         
	//    5    7:invokeinterface #41  <Method Object Map.remove(Object)>
	//    6   12:astore_1        
		boolean flag;
		if(s != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          22
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:goto            24
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_2        
		this;
	//   14   24:aload_0         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		return flag;
	//   16   26:iload_2         
	//   17   27:ireturn         
		s;
	//   18   28:astore_1        
	//*  19   29:aload_0         
		throw s;
	//   20   30:monitorexit     
	//   21   31:aload_1         
	//   22   32:athrow          
	}

	private final Map mRegistry = new HashMap();
}
