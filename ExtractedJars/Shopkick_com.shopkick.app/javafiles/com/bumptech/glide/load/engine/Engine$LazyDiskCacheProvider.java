// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCacheAdapter;

// Referenced classes of package com.bumptech.glide.load.engine:
//			Engine

private static class Engine$LazyDiskCacheProvider
	implements DecodeJob.DiskCacheProvider
{

	void clearDiskCacheIfCreated()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		DiskCache diskcache = diskCache;
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field DiskCache diskCache>
	//    4    6:astore_1        
		if(diskcache != null)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:aload_1         
	//    6    8:ifnonnull       14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		diskCache.clear();
	//   10   14:aload_0         
	//   11   15:getfield        #25  <Field DiskCache diskCache>
	//   12   18:invokeinterface #30  <Method void DiskCache.clear()>
		this;
	//   13   23:aload_0         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		return;
	//   15   25:return          
		Exception exception;
		exception;
	//   16   26:astore_1        
	//*  17   27:aload_0         
		throw exception;
	//   18   28:monitorexit     
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public DiskCache getDiskCache()
	{
		if(diskCache != null)
			break MISSING_BLOCK_LABEL_57;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field DiskCache diskCache>
	//    2    4:ifnonnull       57
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(diskCache == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #25  <Field DiskCache diskCache>
	//*   7   13:ifnonnull       29
			diskCache = factory.build();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #20  <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory factory>
	//   11   21:invokeinterface #38  <Method DiskCache com.bumptech.glide.load.engine.cache.DiskCache$Factory.build()>
	//   12   26:putfield        #25  <Field DiskCache diskCache>
		if(diskCache == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #25  <Field DiskCache diskCache>
	//*  15   33:ifnonnull       47
			diskCache = ((DiskCache) (new DiskCacheAdapter()));
	//   16   36:aload_0         
	//   17   37:new             #40  <Class DiskCacheAdapter>
	//   18   40:dup             
	//   19   41:invokespecial   #41  <Method void DiskCacheAdapter()>
	//   20   44:putfield        #25  <Field DiskCache diskCache>
		this;
	//   21   47:aload_0         
		JVM INSTR monitorexit ;
	//   22   48:monitorexit     
		break MISSING_BLOCK_LABEL_57;
	//   23   49:goto            57
		Exception exception;
		exception;
	//   24   52:astore_1        
		this;
	//   25   53:aload_0         
		JVM INSTR monitorexit ;
	//   26   54:monitorexit     
		throw exception;
	//   27   55:aload_1         
	//   28   56:athrow          
		return diskCache;
	//   29   57:aload_0         
	//   30   58:getfield        #25  <Field DiskCache diskCache>
	//   31   61:areturn         
	}

	private volatile DiskCache diskCache;
	private final com.bumptech.glide.load.engine.cache.DiskCache.Factory factory;

	Engine$LazyDiskCacheProvider(com.bumptech.glide.load.engine.cache.DiskCache.Factory factory1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		factory = factory1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field com.bumptech.glide.load.engine.cache.DiskCache$Factory factory>
	//    5    9:return          
	}
}
