// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.maploader;


// Referenced classes of package com.autonavi.ae.gmap.maploader:
//			Pools

public static class Pools$SynchronizedPool extends Pools.SimplePool
{

	public Object acquire()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object mLock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1 = super.acquire();
	//    5    7:aload_0         
	//    6    8:invokespecial   #26  <Method Object Pools$SimplePool.acquire()>
	//    7   11:astore_2        
		obj;
	//    8   12:aload_1         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return obj1;
	//   10   14:aload_2         
	//   11   15:areturn         
		Exception exception;
		exception;
	//   12   16:astore_2        
	//*  13   17:aload_1         
		throw exception;
	//   14   18:monitorexit     
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public boolean release(Object obj)
	{
		Object obj1 = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object mLock>
	//    2    4:astore_3        
		obj1;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag = super.release(obj);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #32  <Method boolean Pools$SimplePool.release(Object)>
	//    8   12:istore_2        
		obj1;
	//    9   13:aload_3         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return flag;
	//   11   15:iload_2         
	//   12   16:ireturn         
		obj;
	//   13   17:astore_1        
	//*  14   18:aload_3         
		throw obj;
	//   15   19:monitorexit     
	//   16   20:aload_1         
	//   17   21:athrow          
	}

	private final Object mLock = new Object();

	public Pools$SynchronizedPool(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #14  <Method void Pools$SimplePool(int)>
	//    3    5:aload_0         
	//    4    6:new             #16  <Class Object>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void Object()>
	//    7   13:putfield        #21  <Field Object mLock>
	//    8   16:return          
	}
}
