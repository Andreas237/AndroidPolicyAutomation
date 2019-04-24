// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;

// Referenced classes of package com.bumptech.glide.load.engine:
//			Resource

final class LockedResource
	implements Resource, com.bumptech.glide.util.pool.FactoryPools.Poolable
{

	LockedResource()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #43  <Method StateVerifier StateVerifier.newInstance()>
	//    4    8:putfield        #45  <Field StateVerifier stateVerifier>
	//    5   11:return          
	}

	private void init(Resource resource)
	{
		isRecycled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #49  <Field boolean isRecycled>
		isLocked = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #51  <Field boolean isLocked>
		toWrap = resource;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #53  <Field Resource toWrap>
	//    9   15:return          
	}

	static LockedResource obtain(Resource resource)
	{
		LockedResource lockedresource = (LockedResource)POOL.acquire();
	//    0    0:getstatic       #35  <Field android.support.v4.util.Pools$Pool POOL>
	//    1    3:invokeinterface #63  <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    2    8:checkcast       #2   <Class LockedResource>
	//    3   11:astore_1        
		lockedresource.init(resource);
	//    4   12:aload_1         
	//    5   13:aload_0         
	//    6   14:invokespecial   #65  <Method void init(Resource)>
		return lockedresource;
	//    7   17:aload_1         
	//    8   18:areturn         
	}

	private void release()
	{
		toWrap = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #53  <Field Resource toWrap>
		POOL.release(((Object) (this)));
	//    3    5:getstatic       #35  <Field android.support.v4.util.Pools$Pool POOL>
	//    4    8:aload_0         
	//    5    9:invokeinterface #70  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public Object get()
	{
		return toWrap.get();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Resource toWrap>
	//    2    4:invokeinterface #73  <Method Object Resource.get()>
	//    3    9:areturn         
	}

	public Class getResourceClass()
	{
		return toWrap.getResourceClass();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Resource toWrap>
	//    2    4:invokeinterface #78  <Method Class Resource.getResourceClass()>
	//    3    9:areturn         
	}

	public int getSize()
	{
		return toWrap.getSize();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Resource toWrap>
	//    2    4:invokeinterface #83  <Method int Resource.getSize()>
	//    3    9:ireturn         
	}

	public StateVerifier getVerifier()
	{
		return stateVerifier;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field StateVerifier stateVerifier>
	//    2    4:areturn         
	}

	public void recycle()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		stateVerifier.throwIfRecycled();
	//    2    2:aload_0         
	//    3    3:getfield        #45  <Field StateVerifier stateVerifier>
	//    4    6:invokevirtual   #88  <Method void StateVerifier.throwIfRecycled()>
		isRecycled = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #49  <Field boolean isRecycled>
		if(!isLocked)
	//*   8   14:aload_0         
	//*   9   15:getfield        #51  <Field boolean isLocked>
	//*  10   18:ifne            34
		{
			toWrap.recycle();
	//   11   21:aload_0         
	//   12   22:getfield        #53  <Field Resource toWrap>
	//   13   25:invokeinterface #90  <Method void Resource.recycle()>
			release();
	//   14   30:aload_0         
	//   15   31:invokespecial   #92  <Method void release()>
		}
		this;
	//   16   34:aload_0         
		JVM INSTR monitorexit ;
	//   17   35:monitorexit     
		return;
	//   18   36:return          
		Exception exception;
		exception;
	//   19   37:astore_1        
	//*  20   38:aload_0         
		throw exception;
	//   21   39:monitorexit     
	//   22   40:aload_1         
	//   23   41:athrow          
	}

	public void unlock()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		stateVerifier.throwIfRecycled();
	//    2    2:aload_0         
	//    3    3:getfield        #45  <Field StateVerifier stateVerifier>
	//    4    6:invokevirtual   #88  <Method void StateVerifier.throwIfRecycled()>
		if(!isLocked)
	//*   5    9:aload_0         
	//*   6   10:getfield        #51  <Field boolean isLocked>
	//*   7   13:ifne            26
			throw new IllegalStateException("Already unlocked");
	//    8   16:new             #95  <Class IllegalStateException>
	//    9   19:dup             
	//   10   20:ldc1            #97  <String "Already unlocked">
	//   11   22:invokespecial   #100 <Method void IllegalStateException(String)>
	//   12   25:athrow          
		isLocked = false;
	//   13   26:aload_0         
	//   14   27:iconst_0        
	//   15   28:putfield        #51  <Field boolean isLocked>
		if(isRecycled)
	//*  16   31:aload_0         
	//*  17   32:getfield        #49  <Field boolean isRecycled>
	//*  18   35:ifeq            42
			recycle();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #101 <Method void recycle()>
		this;
	//   21   42:aload_0         
		JVM INSTR monitorexit ;
	//   22   43:monitorexit     
		return;
	//   23   44:return          
		Exception exception;
		exception;
	//   24   45:astore_1        
	//*  25   46:aload_0         
		throw exception;
	//   26   47:monitorexit     
	//   27   48:aload_1         
	//   28   49:athrow          
	}

	private static final android.support.v4.util.Pools.Pool POOL = FactoryPools.threadSafe(20, new com.bumptech.glide.util.pool.FactoryPools.Factory() {

		public LockedResource create()
		{
			return new LockedResource();
		//    0    0:new             #9   <Class LockedResource>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void LockedResource()>
		//    3    7:areturn         
		}

		public volatile Object create()
		{
			return ((Object) (create()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #22  <Method LockedResource create()>
		//    2    4:areturn         
		}

	}
);
	private boolean isLocked;
	private boolean isRecycled;
	private final StateVerifier stateVerifier = StateVerifier.newInstance();
	private Resource toWrap;

	static 
	{
	//    0    0:bipush          20
	//    1    2:new             #11  <Class LockedResource$1>
	//    2    5:dup             
	//    3    6:invokespecial   #27  <Method void LockedResource$1()>
	//    4    9:invokestatic    #33  <Method android.support.v4.util.Pools$Pool FactoryPools.threadSafe(int, com.bumptech.glide.util.pool.FactoryPools$Factory)>
	//    5   12:putstatic       #35  <Field android.support.v4.util.Pools$Pool POOL>
	//*   6   15:return          
	}
}
