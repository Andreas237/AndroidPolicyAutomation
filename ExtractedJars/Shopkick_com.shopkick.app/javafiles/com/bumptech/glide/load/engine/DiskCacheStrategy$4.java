// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DiskCacheStrategy

class DiskCacheStrategy$4 extends DiskCacheStrategy
{

	public boolean decodeCachedData()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean decodeCachedResource()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isDataCacheable(DataSource datasource)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isResourceCacheable(boolean flag, DataSource datasource, EncodeStrategy encodestrategy)
	{
		return datasource != DataSource.RESOURCE_DISK_CACHE && datasource != DataSource.MEMORY_CACHE;
	//    0    0:aload_2         
	//    1    1:getstatic       #22  <Field DataSource DataSource.RESOURCE_DISK_CACHE>
	//    2    4:if_acmpeq       16
	//    3    7:aload_2         
	//    4    8:getstatic       #25  <Field DataSource DataSource.MEMORY_CACHE>
	//    5   11:if_acmpeq       16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	DiskCacheStrategy$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void DiskCacheStrategy()>
	//    2    4:return          
	}
}
