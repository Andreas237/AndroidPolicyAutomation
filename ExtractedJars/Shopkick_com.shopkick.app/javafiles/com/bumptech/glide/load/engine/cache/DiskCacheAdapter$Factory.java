// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;


// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			DiskCacheAdapter, DiskCache

public static final class DiskCacheAdapter$Factory
	implements DiskCache.Factory
{

	public DiskCache build()
	{
		return ((DiskCache) (new DiskCacheAdapter()));
	//    0    0:new             #8   <Class DiskCacheAdapter>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void DiskCacheAdapter()>
	//    3    7:areturn         
	}

	public DiskCacheAdapter$Factory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
