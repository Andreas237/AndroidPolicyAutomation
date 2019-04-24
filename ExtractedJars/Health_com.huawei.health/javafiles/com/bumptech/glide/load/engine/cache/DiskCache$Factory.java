// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;


// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			DiskCache

public static interface DiskCache$Factory
{

	public abstract DiskCache build();

	public static final String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
	public static final int DEFAULT_DISK_CACHE_SIZE = 0xfa00000;
}
