// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DiskCacheStrategy

class DiskCacheStrategy$5 extends DiskCacheStrategy
{

	public boolean decodeCachedData()
	{
		return true;
	//    0    0:iconst_1        
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
		return datasource == DataSource.REMOTE;
	//    0    0:aload_1         
	//    1    1:getstatic       #20  <Field DataSource DataSource.REMOTE>
	//    2    4:if_acmpne       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isResourceCacheable(boolean flag, DataSource datasource, EncodeStrategy encodestrategy)
	{
		return (flag && datasource == DataSource.DATA_DISK_CACHE || datasource == DataSource.LOCAL) && encodestrategy == EncodeStrategy.TRANSFORMED;
	//    0    0:iload_1         
	//    1    1:ifeq            11
	//    2    4:aload_2         
	//    3    5:getstatic       #25  <Field DataSource DataSource.DATA_DISK_CACHE>
	//    4    8:if_acmpeq       18
	//    5   11:aload_2         
	//    6   12:getstatic       #28  <Field DataSource DataSource.LOCAL>
	//    7   15:if_acmpne       27
	//    8   18:aload_3         
	//    9   19:getstatic       #34  <Field EncodeStrategy EncodeStrategy.TRANSFORMED>
	//   10   22:if_acmpne       27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	DiskCacheStrategy$5()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void DiskCacheStrategy()>
	//    2    4:return          
	}
}
