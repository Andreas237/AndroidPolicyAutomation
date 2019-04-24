// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import java.io.File;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			DiskLruCacheFactory

class DiskLruCacheFactory$1
	implements cheDirectoryGetter
{

	public File getCacheDirectory()
	{
		return new File(val$diskCacheFolder);
	//    0    0:new             #24  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field String val$diskCacheFolder>
	//    4    8:invokespecial   #26  <Method void File(String)>
	//    5   11:areturn         
	}

	final String val$diskCacheFolder;

	DiskLruCacheFactory$1()
	{
		val$diskCacheFolder = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field String val$diskCacheFolder>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
