// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			DiskCacheWriteLocker

static class DiskCacheWriteLocker$WriteLock
{

	int interestedThreads;
	final Lock lock = new ReentrantLock();

	DiskCacheWriteLocker$WriteLock()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ReentrantLock>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ReentrantLock()>
	//    6   12:putfield        #20  <Field Lock lock>
	//    7   15:return          
	}
}
