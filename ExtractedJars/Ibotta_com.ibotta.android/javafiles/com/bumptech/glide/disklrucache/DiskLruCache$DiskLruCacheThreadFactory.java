// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.disklrucache;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.bumptech.glide.disklrucache:
//			DiskLruCache

private static final class DiskLruCache$DiskLruCacheThreadFactory
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		runnable = ((Runnable) (new Thread(runnable, "glide-disk-lru-cache-thread")));
	//    2    2:new             #20  <Class Thread>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:ldc1            #22  <String "glide-disk-lru-cache-thread">
	//    6    9:invokespecial   #25  <Method void Thread(Runnable, String)>
	//    7   12:astore_1        
		((Thread) (runnable)).setPriority(1);
	//    8   13:aload_1         
	//    9   14:iconst_1        
	//   10   15:invokevirtual   #29  <Method void Thread.setPriority(int)>
		this;
	//   11   18:aload_0         
		JVM INSTR monitorexit ;
	//   12   19:monitorexit     
		return ((Thread) (runnable));
	//   13   20:aload_1         
	//   14   21:areturn         
		runnable;
	//   15   22:astore_1        
	//*  16   23:aload_0         
		throw runnable;
	//   17   24:monitorexit     
	//   18   25:aload_1         
	//   19   26:athrow          
	}

	private DiskLruCache$DiskLruCacheThreadFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	DiskLruCache$DiskLruCacheThreadFactory(DiskLruCache._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void DiskLruCache$DiskLruCacheThreadFactory()>
	//    2    4:return          
	}
}
