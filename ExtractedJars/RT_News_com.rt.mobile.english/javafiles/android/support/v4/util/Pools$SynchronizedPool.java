// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//			Pools

public static class Pools$SynchronizedPool extends Pools.SimplePool
{

	public Object acquire()
	{
		Object obj1;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			obj1 = super.acquire();
	//    5    7:aload_0         
	//    6    8:invokespecial   #26  <Method Object Pools$SimplePool.acquire()>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return obj1;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public boolean release(Object obj)
	{
		boolean flag;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			flag = super.release(obj);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #33  <Method boolean Pools$SimplePool.release(Object)>
	//    8   12:istore_2        
		}
	//    9   13:aload_3         
	//   10   14:monitorexit     
		return flag;
	//   11   15:iload_2         
	//   12   16:ireturn         
		obj;
	//   13   17:astore_1        
		obj1;
	//   14   18:aload_3         
		JVM INSTR monitorexit ;
	//   15   19:monitorexit     
		throw obj;
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
