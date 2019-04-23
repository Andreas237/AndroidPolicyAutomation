// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			DiskLruCacheFactory

public final class ExternalPreferredCacheDiskCacheFactory extends DiskLruCacheFactory
{

	public ExternalPreferredCacheDiskCacheFactory(Context context)
	{
		this(context, "image_manager_disk_cache", 0xfa00000L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "image_manager_disk_cache">
	//    3    4:ldc2w           #11  <Long 0xfa00000L>
	//    4    7:invokespecial   #15  <Method void ExternalPreferredCacheDiskCacheFactory(Context, String, long)>
	//    5   10:return          
	}

	public ExternalPreferredCacheDiskCacheFactory(Context context, long l)
	{
		this(context, "image_manager_disk_cache", l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "image_manager_disk_cache">
	//    3    4:lload_2         
	//    4    5:invokespecial   #15  <Method void ExternalPreferredCacheDiskCacheFactory(Context, String, long)>
	//    5    8:return          
	}

	public ExternalPreferredCacheDiskCacheFactory(final Context context, final String diskCacheName, long l)
	{
		super(new DiskLruCacheFactory.CacheDirectoryGetter() {

			private File getInternalCacheDirectory()
			{
				File file = context.getCacheDir();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field Context val$context>
			//    2    4:invokevirtual   #32  <Method File Context.getCacheDir()>
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
			//   13   23:new             #34  <Class File>
			//   14   26:dup             
			//   15   27:aload_1         
			//   16   28:aload_2         
			//   17   29:invokespecial   #37  <Method void File(File, String)>
			//   18   32:areturn         
				else
					return file;
			//   19   33:aload_1         
			//   20   34:areturn         
			}

			public File getCacheDirectory()
			{
				Object obj = ((Object) (getInternalCacheDirectory()));
			//    0    0:aload_0         
			//    1    1:invokespecial   #41  <Method File getInternalCacheDirectory()>
			//    2    4:astore_2        
				if(obj != null && ((File) (obj)).exists())
			//*   3    5:aload_2         
			//*   4    6:ifnull          18
			//*   5    9:aload_2         
			//*   6   10:invokevirtual   #45  <Method boolean File.exists()>
			//*   7   13:ifeq            18
					return ((File) (obj));
			//    8   16:aload_2         
			//    9   17:areturn         
				File file = context.getExternalCacheDir();
			//   10   18:aload_0         
			//   11   19:getfield        #18  <Field Context val$context>
			//   12   22:invokevirtual   #48  <Method File Context.getExternalCacheDir()>
			//   13   25:astore_1        
				if(file != null)
			//*  14   26:aload_1         
			//*  15   27:ifnull          60
				{
					if(!file.canWrite())
			//*  16   30:aload_1         
			//*  17   31:invokevirtual   #51  <Method boolean File.canWrite()>
			//*  18   34:ifne            39
						return ((File) (obj));
			//   19   37:aload_2         
			//   20   38:areturn         
					obj = ((Object) (diskCacheName));
			//   21   39:aload_0         
			//   22   40:getfield        #20  <Field String val$diskCacheName>
			//   23   43:astore_2        
					if(obj != null)
			//*  24   44:aload_2         
			//*  25   45:ifnull          58
						return new File(file, ((String) (obj)));
			//   26   48:new             #34  <Class File>
			//   27   51:dup             
			//   28   52:aload_1         
			//   29   53:aload_2         
			//   30   54:invokespecial   #37  <Method void File(File, String)>
			//   31   57:areturn         
					else
						return file;
			//   32   58:aload_1         
			//   33   59:areturn         
				} else
				{
					return ((File) (obj));
			//   34   60:aload_2         
			//   35   61:areturn         
				}
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
, l);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class ExternalPreferredCacheDiskCacheFactory$1>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #20  <Method void ExternalPreferredCacheDiskCacheFactory$1(Context, String)>
	//    6   10:lload_3         
	//    7   11:invokespecial   #23  <Method void DiskLruCacheFactory(DiskLruCacheFactory$CacheDirectoryGetter, long)>
	//    8   14:return          
	}
}
