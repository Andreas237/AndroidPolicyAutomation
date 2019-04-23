// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.util.Preconditions;
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
		LockedResource lockedresource = (LockedResource)Preconditions.checkNotNull(((Object) ((LockedResource)POOL.acquire())));
	//    0    0:getstatic       #35  <Field android.support.v4.util.Pools$Pool POOL>
	//    1    3:invokeinterface #64  <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    2    8:checkcast       #2   <Class LockedResource>
	//    3   11:invokestatic    #70  <Method Object Preconditions.checkNotNull(Object)>
	//    4   14:checkcast       #2   <Class LockedResource>
	//    5   17:astore_1        
		lockedresource.init(resource);
	//    6   18:aload_1         
	//    7   19:aload_0         
	//    8   20:invokespecial   #72  <Method void init(Resource)>
		return lockedresource;
	//    9   23:aload_1         
	//   10   24:areturn         
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
	//    5    9:invokeinterface #78  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public Object get()
	{
		return toWrap.get();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Resource toWrap>
	//    2    4:invokeinterface #81  <Method Object Resource.get()>
	//    3    9:areturn         
	}

	public Class getResourceClass()
	{
		return toWrap.getResourceClass();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Resource toWrap>
	//    2    4:invokeinterface #86  <Method Class Resource.getResourceClass()>
	//    3    9:areturn         
	}

	public int getSize()
	{
		return toWrap.getSize();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Resource toWrap>
	//    2    4:invokeinterface #91  <Method int Resource.getSize()>
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
	//    4    6:invokevirtual   #96  <Method void StateVerifier.throwIfRecycled()>
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
	//   13   25:invokeinterface #98  <Method void Resource.recycle()>
			release();
	//   14   30:aload_0         
	//   15   31:invokespecial   #100 <Method void release()>
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

	void unlock()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		stateVerifier.throwIfRecycled();
	//    2    2:aload_0         
	//    3    3:getfield        #45  <Field StateVerifier stateVerifier>
	//    4    6:invokevirtual   #96  <Method void StateVerifier.throwIfRecycled()>
		if(!isLocked)
			break MISSING_BLOCK_LABEL_35;
	//    5    9:aload_0         
	//    6   10:getfield        #51  <Field boolean isLocked>
	//    7   13:ifeq            35
		isLocked = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #51  <Field boolean isLocked>
		if(isRecycled)
	//*  11   21:aload_0         
	//*  12   22:getfield        #49  <Field boolean isRecycled>
	//*  13   25:ifeq            32
			recycle();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #102 <Method void recycle()>
		this;
	//   16   32:aload_0         
		JVM INSTR monitorexit ;
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		throw new IllegalStateException("Already unlocked");
	//   19   35:new             #104 <Class IllegalStateException>
	//   20   38:dup             
	//   21   39:ldc1            #106 <String "Already unlocked">
	//   22   41:invokespecial   #109 <Method void IllegalStateException(String)>
	//   23   44:athrow          
		Exception exception;
		exception;
	//   24   45:astore_1        
		this;
	//   25   46:aload_0         
		JVM INSTR monitorexit ;
	//   26   47:monitorexit     
		throw exception;
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
