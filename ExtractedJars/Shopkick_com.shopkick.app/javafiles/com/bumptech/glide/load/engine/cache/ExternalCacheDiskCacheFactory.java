// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			DiskLruCacheFactory

public final class ExternalCacheDiskCacheFactory extends DiskLruCacheFactory
{

	public ExternalCacheDiskCacheFactory(Context context)
	{
		this(context, "image_manager_disk_cache", 0xfa00000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #11  <String "image_manager_disk_cache">
	//    3    4:ldc1            #12  <Int 0xfa00000>
	//    4    6:invokespecial   #15  <Method void ExternalCacheDiskCacheFactory(Context, String, int)>
	//    5    9:return          
	}

	public ExternalCacheDiskCacheFactory(Context context, int i)
	{
		this(context, "image_manager_disk_cache", i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #11  <String "image_manager_disk_cache">
	//    3    4:iload_2         
	//    4    5:invokespecial   #15  <Method void ExternalCacheDiskCacheFactory(Context, String, int)>
	//    5    8:return          
	}

	public ExternalCacheDiskCacheFactory(final Context context, final String diskCacheName, int i)
	{
		super(new DiskLruCacheFactory.CacheDirectoryGetter() {

			public File getCacheDirectory()
			{
				File file = context.getExternalCacheDir();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field Context val$context>
			//    2    4:invokevirtual   #31  <Method File Context.getExternalCacheDir()>
			//    3    7:astore_1        
				if(file == null)
			//*   4    8:aload_1         
			//*   5    9:ifnonnull       14
					return null;
			//    6   12:aconst_null     
			//    7   13:areturn         
				String s = diskCacheName;
			//    8   14:aload_0         
			//    9   15:getfield        #20  <Field String val$diskCacheName>
			//   10   18:astore_2        
				if(s != null)
			//*  11   19:aload_2         
			//*  12   20:ifnull          33
					return new File(file, s);
			//   13   23:new             #33  <Class File>
			//   14   26:dup             
			//   15   27:aload_1         
			//   16   28:aload_2         
			//   17   29:invokespecial   #36  <Method void File(File, String)>
			//   18   32:areturn         
				else
					return file;
			//   19   33:aload_1         
			//   20   34:areturn         
			}

			final Context val$context;
			final String val$diskCacheName;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Context val$context>
				diskCacheName = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String val$diskCacheName>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, i);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class ExternalCacheDiskCacheFactory$1>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #20  <Method void ExternalCacheDiskCacheFactory$1(Context, String)>
	//    6   10:iload_3         
	//    7   11:i2l             
	//    8   12:invokespecial   #23  <Method void DiskLruCacheFactory(DiskLruCacheFactory$CacheDirectoryGetter, long)>
	//    9   15:return          
	}
}
