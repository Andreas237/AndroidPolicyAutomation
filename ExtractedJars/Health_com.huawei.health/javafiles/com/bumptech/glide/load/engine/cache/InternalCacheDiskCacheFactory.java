// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			DiskLruCacheFactory

public final class InternalCacheDiskCacheFactory extends DiskLruCacheFactory
{

	public InternalCacheDiskCacheFactory(Context context)
	{
		this(context, "image_manager_disk_cache", 0xfa00000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "image_manager_disk_cache">
	//    3    4:ldc1            #11  <Int 0xfa00000>
	//    4    6:invokespecial   #14  <Method void InternalCacheDiskCacheFactory(Context, String, int)>
	//    5    9:return          
	}

	public InternalCacheDiskCacheFactory(Context context, int i)
	{
		this(context, "image_manager_disk_cache", i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "image_manager_disk_cache">
	//    3    4:iload_2         
	//    4    5:invokespecial   #14  <Method void InternalCacheDiskCacheFactory(Context, String, int)>
	//    5    8:return          
	}

	public InternalCacheDiskCacheFactory(final Context context, final String diskCacheName, int i)
	{
		super(new DiskLruCacheFactory.CacheDirectoryGetter() {

			public File getCacheDirectory()
			{
				File file = context.getCacheDir();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field Context val$context>
			//    2    4:invokevirtual   #31  <Method File Context.getCacheDir()>
			//    3    7:astore_1        
				if(file == null)
			//*   4    8:aload_1         
			//*   5    9:ifnonnull       14
					return null;
			//    6   12:aconst_null     
			//    7   13:areturn         
				if(diskCacheName != null)
			//*   8   14:aload_0         
			//*   9   15:getfield        #20  <Field String val$diskCacheName>
			//*  10   18:ifnull          34
					return new File(file, diskCacheName);
			//   11   21:new             #33  <Class File>
			//   12   24:dup             
			//   13   25:aload_1         
			//   14   26:aload_0         
			//   15   27:getfield        #20  <Field String val$diskCacheName>
			//   16   30:invokespecial   #36  <Method void File(File, String)>
			//   17   33:areturn         
				else
					return file;
			//   18   34:aload_1         
			//   19   35:areturn         
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
	//    1    1:new             #6   <Class InternalCacheDiskCacheFactory$1>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void InternalCacheDiskCacheFactory$1(Context, String)>
	//    6   10:iload_3         
	//    7   11:invokespecial   #22  <Method void DiskLruCacheFactory(DiskLruCacheFactory$CacheDirectoryGetter, int)>
	//    8   14:return          
	}
}
