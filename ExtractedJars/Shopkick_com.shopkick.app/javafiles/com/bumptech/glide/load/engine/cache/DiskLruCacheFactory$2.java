// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import java.io.File;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			DiskLruCacheFactory

class DiskLruCacheFactory$2
	implements cheDirectoryGetter
{

	public File getCacheDirectory()
	{
		return new File(val$diskCacheFolder, val$diskCacheName);
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

	DiskLruCacheFactory$2()
	{
		val$diskCacheFolder = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field String val$diskCacheFolder>
		val$diskCacheName = s1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field String val$diskCacheName>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void Object()>
	//    8   14:return          
	}
}
