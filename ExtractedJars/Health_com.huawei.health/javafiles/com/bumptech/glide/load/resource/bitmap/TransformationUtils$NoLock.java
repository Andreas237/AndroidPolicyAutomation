// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			TransformationUtils

static final class TransformationUtils$NoLock
	implements Lock
{

	public void lock()
	{
	//    0    0:return          
	}

	public void lockInterruptibly()
		throws InterruptedException
	{
	//    0    0:return          
	}

	public Condition newCondition()
	{
		throw new UnsupportedOperationException("Should not be called");
	//    0    0:new             #24  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "Should not be called">
	//    3    6:invokespecial   #29  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean tryLock()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean tryLock(long l, TimeUnit timeunit)
		throws InterruptedException
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void unlock()
	{
	//    0    0:return          
	}

	TransformationUtils$NoLock()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
