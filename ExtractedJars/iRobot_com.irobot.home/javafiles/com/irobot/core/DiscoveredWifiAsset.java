// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			DiscoveredAsset, NetworkAddress, ProvisioningType, AssetInfo, 
//			DiscoveryType

public abstract class DiscoveredWifiAsset extends DiscoveredAsset
{
	private static final class CppProxy extends DiscoveredWifiAsset
	{

		private native void nativeDestroy(long l);

		private native int native_activeConnections(long l);

		private native AssetInfo native_assetInfo(long l);

		private native DiscoveryType native_discoveryType(long l);

		private native int native_discoveryVersion(long l);

		private native String native_macAddress(long l);

		private native NetworkAddress native_networkAddress(long l);

		private native String native_protocol(long l);

		private native ProvisioningType native_provisioningType(long l);

		private native String native_sku(long l);

		private native String native_softwareVersion(long l);

		public int activeConnections()
		{
			return native_activeConnections(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #56  <Method int native_activeConnections(long)>
		//    4    8:ireturn         
		}

		public AssetInfo assetInfo()
		{
			return native_assetInfo(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #60  <Method AssetInfo native_assetInfo(long)>
		//    4    8:areturn         
		}

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #65  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #67  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		public DiscoveryType discoveryType()
		{
			return native_discoveryType(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #71  <Method DiscoveryType native_discoveryType(long)>
		//    4    8:areturn         
		}

		public int discoveryVersion()
		{
			return native_discoveryVersion(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #74  <Method int native_discoveryVersion(long)>
		//    4    8:ireturn         
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #77  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #81  <Method void Object.finalize()>
		//    4    8:return          
		}

		public String macAddress()
		{
			return native_macAddress(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #85  <Method String native_macAddress(long)>
		//    4    8:areturn         
		}

		public NetworkAddress networkAddress()
		{
			return native_networkAddress(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #89  <Method NetworkAddress native_networkAddress(long)>
		//    4    8:areturn         
		}

		public String protocol()
		{
			return native_protocol(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #92  <Method String native_protocol(long)>
		//    4    8:areturn         
		}

		public ProvisioningType provisioningType()
		{
			return native_provisioningType(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #96  <Method ProvisioningType native_provisioningType(long)>
		//    4    8:areturn         
		}

		public String sku()
		{
			return native_sku(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #99  <Method String native_sku(long)>
		//    4    8:areturn         
		}

		public String softwareVersion()
		{
			return native_softwareVersion(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #102 <Method String native_softwareVersion(long)>
		//    4    8:areturn         
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
		//    1    1:invokespecial   #19  <Method void DiscoveredWifiAsset()>
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


	public DiscoveredWifiAsset()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void DiscoveredAsset()>
	//    2    4:return          
	}

	public static native DiscoveredWifiAsset create(String s);

	public abstract int activeConnections();

	public abstract int discoveryVersion();

	public abstract String macAddress();

	public abstract NetworkAddress networkAddress();

	public abstract String protocol();

	public abstract ProvisioningType provisioningType();

	public abstract String sku();

	public abstract String softwareVersion();
}
