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
	//    1    1:invokespecial   #22  <Method void Object()>
		diskCacheSize = l;
	//    2    4:aload_0         
	//    3    5:lload_2         
	//    4    6:putfield        #24  <Field long diskCacheSize>
		cacheDirectoryGetter = cachedirectorygetter;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #26  <Field DiskLruCacheFactory$CacheDirectoryGetter cacheDirectoryGetter>
	//    8   14:return          
	}

	public DiskLruCacheFactory(final String diskCacheFolder, long l)
	{
		this(new CacheDirectoryGetter() {

			public File getCacheDirectory()
			{
				return new File(diskCacheFolder);
			//    0    0:new             #24  <Class File>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #16  <Field String val$diskCacheFolder>
			//    4    8:invokespecial   #26  <Method void File(String)>
			//    5   11:areturn         
			}

			final String val$diskCacheFolder;

			
			{
				diskCacheFolder = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field String val$diskCacheFolder>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, l);
	//    0    0:aload_0         
	//    1    1:new             #8   <Class DiskLruCacheFactory$1>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #31  <Method void DiskLruCacheFactory$1(String)>
	//    5    9:lload_2         
	//    6   10:invokespecial   #33  <Method void DiskLruCacheFactory(DiskLruCacheFactory$CacheDirectoryGetter, long)>
	//    7   13:return          
	}

	public DiskLruCacheFactory(final String diskCacheFolder, final String diskCacheName, long l)
	{
		this(new CacheDirectoryGetter() {

			public File getCacheDirectory()
			{
				return new File(diskCacheFolder, diskCacheName);
			//    0    0:new             #27  <Class File>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field String val$diskCacheFolder>
			//    4    8:aload_0         
			//    5    9:getfield        #19  <Field String val$diskCacheName>
			//    6   12:invokespecial   #29  <Method void File(String, String)>
			//    7   15:areturn         
			}

			final String val$diskCacheFolder;
			final String val$diskCacheName;

			
			{
				diskCacheFolder = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field String val$diskCacheFolder>
				diskCacheName = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field String val$diskCacheName>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void Object()>
			//    8   14:return          
			}
		}
, l);
	//    0    0:aload_0         
	//    1    1:new             #10  <Class DiskLruCacheFactory$2>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #37  <Method void DiskLruCacheFactory$2(String, String)>
	//    6   10:lload_3         
	//    7   11:invokespecial   #33  <Method void DiskLruCacheFactory(DiskLruCacheFactory$CacheDirectoryGetter, long)>
	//    8   14:return          
	}

	public DiskCache build()
	{
		File file = cacheDirectoryGetter.getCacheDirectory();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field DiskLruCacheFactory$CacheDirectoryGetter cacheDirectoryGetter>
	//    2    4:invokeinterface #43  <Method File DiskLruCacheFactory$CacheDirectoryGetter.getCacheDirectory()>
	//    3    9:astore_1        
		if(file == null)
	//*   4   10:aload_1         
	//*   5   11:ifnonnull       16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		if(!file.mkdirs() && (!file.exists() || !file.isDirectory()))
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #49  <Method boolean File.mkdirs()>
	//*  10   20:ifne            39
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #52  <Method boolean File.exists()>
	//*  13   27:ifeq            37
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #55  <Method boolean File.isDirectory()>
	//*  16   34:ifne            39
			return null;
	//   17   37:aconst_null     
	//   18   38:areturn         
		else
			return DiskLruCacheWrapper.create(file, diskCacheSize);
	//   19   39:aload_1         
	//   20   40:aload_0         
	//   21   41:getfield        #24  <Field long diskCacheSize>
	//   22   44:invokestatic    #61  <Method DiskCache DiskLruCacheWrapper.create(File, long)>
	//   23   47:areturn         
	}

	private final CacheDirectoryGetter cacheDirectoryGetter;
	private final long diskCacheSize;
}
