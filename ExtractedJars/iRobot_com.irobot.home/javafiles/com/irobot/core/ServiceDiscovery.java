// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AssetId, ServiceDiscoveryData

public abstract class ServiceDiscovery
{
	private static final class CppProxy extends ServiceDiscovery
	{

		private native void nativeDestroy(long l);

		private native void native_clearCacheEntry(long l, AssetId assetid);

		private native ServiceDiscoveryData native_getAppServiceDiscoveryData(long l, String s);

		private native String native_getEnvironmentName(long l);

		private native ServiceDiscoveryData native_getServiceDiscoveryData(long l, AssetId assetid);

		private native void native_queryDuplicateAssetStatus(long l, AssetId assetid);

		private native void native_resetServiceDiscoveryData(long l);

		private native void native_setEnvironmentName(long l, String s);

		public void clearCacheEntry(AssetId assetid)
		{
			native_clearCacheEntry(nativeRef, assetid);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #52  <Method void native_clearCacheEntry(long, AssetId)>
		//    5    9:return          
		}

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #57  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #59  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #62  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #66  <Method void Object.finalize()>
		//    4    8:return          
		}

		public ServiceDiscoveryData getAppServiceDiscoveryData(String s)
		{
			return native_getAppServiceDiscoveryData(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #70  <Method ServiceDiscoveryData native_getAppServiceDiscoveryData(long, String)>
		//    5    9:areturn         
		}

		public String getEnvironmentName()
		{
			return native_getEnvironmentName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #74  <Method String native_getEnvironmentName(long)>
		//    4    8:areturn         
		}

		public ServiceDiscoveryData getServiceDiscoveryData(AssetId assetid)
		{
			return native_getServiceDiscoveryData(nativeRef, assetid);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #78  <Method ServiceDiscoveryData native_getServiceDiscoveryData(long, AssetId)>
		//    5    9:areturn         
		}

		public void queryDuplicateAssetStatus(AssetId assetid)
		{
			native_queryDuplicateAssetStatus(nativeRef, assetid);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #81  <Method void native_queryDuplicateAssetStatus(long, AssetId)>
		//    5    9:return          
		}

		public void resetServiceDiscoveryData()
		{
			native_resetServiceDiscoveryData(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #84  <Method void native_resetServiceDiscoveryData(long)>
		//    4    8:return          
		}

		public void setEnvironmentName(String s)
		{
			native_setEnvironmentName(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #87  <Method void native_setEnvironmentName(long, String)>
		//    5    9:return          
		}

		static final boolean $assertionsDisabled = false;
		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		static 
		{
		//    0    0:return          
		}

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void ServiceDiscovery()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #28  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #30  <String "nativeRef is zero">
		//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #35  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public ServiceDiscovery()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native ServiceDiscovery getInstance();

	public abstract void clearCacheEntry(AssetId assetid);

	public abstract ServiceDiscoveryData getAppServiceDiscoveryData(String s);

	public abstract String getEnvironmentName();

	public abstract ServiceDiscoveryData getServiceDiscoveryData(AssetId assetid);

	public abstract void queryDuplicateAssetStatus(AssetId assetid);

	public abstract void resetServiceDiscoveryData();

	public abstract void setEnvironmentName(String s);
}
