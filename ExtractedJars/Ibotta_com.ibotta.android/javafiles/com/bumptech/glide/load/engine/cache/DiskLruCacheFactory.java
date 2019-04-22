// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import java.io.File;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			DiskLruCacheWrapper, DiskCache

public class DiskLruCacheFactory
	implements DiskCache.Factory
{
	public static interface CacheDirectoryGetter
	{

		public abstract File getCacheDirectory();
	}


	public DiskLruCacheFactory(CacheDirectoryGetter cachedirectorygetter, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		diskCacheSize = l;
	//    2    4:aload_0         
	//    3    5:lload_2         
	//    4    6:putfield        #20  <Field long diskCacheSize>
		cacheDirectoryGetter = cachedirectorygetter;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #22  <Field DiskLruCacheFactory$CacheDirectoryGetter cacheDirectoryGetter>
	//    8   14:return          
	}

	public DiskCache build()
	{
		File file = cacheDirectoryGetter.getCacheDirectory();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field DiskLruCacheFactory$CacheDirectoryGetter cacheDirectoryGetter>
	//    2    4:invokeinterface #29  <Method File DiskLruCacheFactory$CacheDirectoryGetter.getCacheDirectory()>
	//    3    9:astore_1        
		if(file == null)
	//*   4   10:aload_1         
	//*   5   11:ifnonnull       16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		if(!file.mkdirs() && (!file.exists() || !file.isDirectory()))
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #35  <Method boolean File.mkdirs()>
	//*  10   20:ifne            39
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #38  <Method boolean File.exists()>
	//*  13   27:ifeq            37
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #41  <Method boolean File.isDirectory()>
	//*  16   34:ifne            39
			return null;
	//   17   37:aconst_null     
	//   18   38:areturn         
		else
			return DiskLruCacheWrapper.create(file, diskCacheSize);
	//   19   39:aload_1         
	//   20   40:aload_0         
	//   21   41:getfield        #20  <Field long diskCacheSize>
	//   22   44:invokestatic    #47  <Method DiskCache DiskLruCacheWrapper.create(File, long)>
	//   23   47:areturn         
	}

	private final CacheDirectoryGetter cacheDirectoryGetter;
	private final long diskCacheSize;
}
