// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

public abstract class DiskCacheStrategy
{

	public DiskCacheStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:return          
	}

	public abstract boolean decodeCachedData();

	public abstract boolean decodeCachedResource();

	public abstract boolean isDataCacheable(DataSource datasource);

	public abstract boolean isResourceCacheable(boolean flag, DataSource datasource, EncodeStrategy encodestrategy);

	public static final DiskCacheStrategy ALL = new DiskCacheStrategy() {

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
			return datasource != DataSource.RESOURCE_DISK_CACHE && datasource != DataSource.MEMORY_CACHE;
		//    0    0:aload_2         
		//    1    1:getstatic       #25  <Field DataSource DataSource.RESOURCE_DISK_CACHE>
		//    2    4:if_acmpeq       16
		//    3    7:aload_2         
		//    4    8:getstatic       #28  <Field DataSource DataSource.MEMORY_CACHE>
		//    5   11:if_acmpeq       16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

	}
;
	public static final DiskCacheStrategy AUTOMATIC = new DiskCacheStrategy() {

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

	}
;
	public static final DiskCacheStrategy DATA = new DiskCacheStrategy() {

		public boolean decodeCachedData()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean decodeCachedResource()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isDataCacheable(DataSource datasource)
		{
			return datasource != DataSource.DATA_DISK_CACHE && datasource != DataSource.MEMORY_CACHE;
		//    0    0:aload_1         
		//    1    1:getstatic       #20  <Field DataSource DataSource.DATA_DISK_CACHE>
		//    2    4:if_acmpeq       16
		//    3    7:aload_1         
		//    4    8:getstatic       #23  <Field DataSource DataSource.MEMORY_CACHE>
		//    5   11:if_acmpeq       16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean isResourceCacheable(boolean flag, DataSource datasource, EncodeStrategy encodestrategy)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

	}
;
	public static final DiskCacheStrategy NONE = new DiskCacheStrategy() {

		public boolean decodeCachedData()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean decodeCachedResource()
		{
			return false;
		//    0    0:iconst_0        
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
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

	}
;
	public static final DiskCacheStrategy RESOURCE = new DiskCacheStrategy() {

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

	}
;

	static 
	{
	//    0    0:new             #6   <Class DiskCacheStrategy$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void DiskCacheStrategy$1()>
	//    3    7:putstatic       #27  <Field DiskCacheStrategy ALL>
	//    4   10:new             #8   <Class DiskCacheStrategy$2>
	//    5   13:dup             
	//    6   14:invokespecial   #28  <Method void DiskCacheStrategy$2()>
	//    7   17:putstatic       #30  <Field DiskCacheStrategy NONE>
	//    8   20:new             #10  <Class DiskCacheStrategy$3>
	//    9   23:dup             
	//   10   24:invokespecial   #31  <Method void DiskCacheStrategy$3()>
	//   11   27:putstatic       #33  <Field DiskCacheStrategy DATA>
	//   12   30:new             #12  <Class DiskCacheStrategy$4>
	//   13   33:dup             
	//   14   34:invokespecial   #34  <Method void DiskCacheStrategy$4()>
	//   15   37:putstatic       #36  <Field DiskCacheStrategy RESOURCE>
	//   16   40:new             #14  <Class DiskCacheStrategy$5>
	//   17   43:dup             
	//   18   44:invokespecial   #37  <Method void DiskCacheStrategy$5()>
	//   19   47:putstatic       #39  <Field DiskCacheStrategy AUTOMATIC>
	//*  20   50:return          
	}
}
