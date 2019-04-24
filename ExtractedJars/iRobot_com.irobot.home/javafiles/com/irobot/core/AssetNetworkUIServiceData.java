// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AwsCloudEnvironmentEvent, AssetCloudConfigEvent, NetworkState, CurrentConnectionStateEvent, 
//			CurrentConnectionState, AssetMacAddressEvent, NetworkAddressEvent, AssetNetworkSettingsEvent, 
//			AssetNetworkStatusEvent, WifiConfigEvent, AssetWifiLogEvent, AssetWifiSignalStrengthEvent

public abstract class AssetNetworkUIServiceData
{
	private static final class CppProxy extends AssetNetworkUIServiceData
	{

		private native void nativeDestroy(long l);

		private native boolean native_canCommunicateWithAsset(long l);

		private native AwsCloudEnvironmentEvent native_getAwsCloudEnvironment(long l);

		private native AssetCloudConfigEvent native_getCloudNetworkAddress(long l);

		private native NetworkState native_getConnectionStateForLocal(long l);

		private native NetworkState native_getConnectionStateForRemote(long l);

		private native CurrentConnectionStateEvent native_getCurrentConnectionEvent(long l);

		private native CurrentConnectionState native_getCurrentConnectionState(long l);

		private native ArrayList native_getDataStateChangelist(long l);

		private native AssetMacAddressEvent native_getMacAddress(long l);

		private native NetworkAddressEvent native_getNetworkAddress(long l);

		private native ArrayList native_getNetworkInterfaces(long l);

		private native AssetNetworkSettingsEvent native_getNetworkSettings(long l);

		private native AssetNetworkStatusEvent native_getNetworkStatus(long l);

		private native ArrayList native_getSupportedNetworkDataTypes(long l);

		private native ArrayList native_getViewStateChangelist(long l);

		private native WifiConfigEvent native_getWifiConfiguration(long l);

		private native AssetWifiLogEvent native_getWifiLogs(long l);

		private native AssetWifiSignalStrengthEvent native_getWifiSignalStrength(long l);

		private native boolean native_isConnectedLocally(long l);

		private native boolean native_isWifiLogsAvailable(long l);

		public boolean canCommunicateWithAsset()
		{
			return native_canCommunicateWithAsset(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #74  <Method boolean native_canCommunicateWithAsset(long)>
		//    4    8:ireturn         
		}

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #79  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #81  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #84  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #88  <Method void Object.finalize()>
		//    4    8:return          
		}

		public AwsCloudEnvironmentEvent getAwsCloudEnvironment()
		{
			return native_getAwsCloudEnvironment(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #92  <Method AwsCloudEnvironmentEvent native_getAwsCloudEnvironment(long)>
		//    4    8:areturn         
		}

		public AssetCloudConfigEvent getCloudNetworkAddress()
		{
			return native_getCloudNetworkAddress(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #96  <Method AssetCloudConfigEvent native_getCloudNetworkAddress(long)>
		//    4    8:areturn         
		}

		public NetworkState getConnectionStateForLocal()
		{
			return native_getConnectionStateForLocal(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #100 <Method NetworkState native_getConnectionStateForLocal(long)>
		//    4    8:areturn         
		}

		public NetworkState getConnectionStateForRemote()
		{
			return native_getConnectionStateForRemote(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #103 <Method NetworkState native_getConnectionStateForRemote(long)>
		//    4    8:areturn         
		}

		public CurrentConnectionStateEvent getCurrentConnectionEvent()
		{
			return native_getCurrentConnectionEvent(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #107 <Method CurrentConnectionStateEvent native_getCurrentConnectionEvent(long)>
		//    4    8:areturn         
		}

		public CurrentConnectionState getCurrentConnectionState()
		{
			return native_getCurrentConnectionState(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #111 <Method CurrentConnectionState native_getCurrentConnectionState(long)>
		//    4    8:areturn         
		}

		public ArrayList getDataStateChangelist()
		{
			return native_getDataStateChangelist(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #115 <Method ArrayList native_getDataStateChangelist(long)>
		//    4    8:areturn         
		}

		public AssetMacAddressEvent getMacAddress()
		{
			return native_getMacAddress(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #121 <Method AssetMacAddressEvent native_getMacAddress(long)>
		//    4    8:areturn         
		}

		public NetworkAddressEvent getNetworkAddress()
		{
			return native_getNetworkAddress(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #125 <Method NetworkAddressEvent native_getNetworkAddress(long)>
		//    4    8:areturn         
		}

		public ArrayList getNetworkInterfaces()
		{
			return native_getNetworkInterfaces(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #128 <Method ArrayList native_getNetworkInterfaces(long)>
		//    4    8:areturn         
		}

		public AssetNetworkSettingsEvent getNetworkSettings()
		{
			return native_getNetworkSettings(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #133 <Method AssetNetworkSettingsEvent native_getNetworkSettings(long)>
		//    4    8:areturn         
		}

		public AssetNetworkStatusEvent getNetworkStatus()
		{
			return native_getNetworkStatus(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #137 <Method AssetNetworkStatusEvent native_getNetworkStatus(long)>
		//    4    8:areturn         
		}

		public ArrayList getSupportedNetworkDataTypes()
		{
			return native_getSupportedNetworkDataTypes(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #140 <Method ArrayList native_getSupportedNetworkDataTypes(long)>
		//    4    8:areturn         
		}

		public ArrayList getViewStateChangelist()
		{
			return native_getViewStateChangelist(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #143 <Method ArrayList native_getViewStateChangelist(long)>
		//    4    8:areturn         
		}

		public WifiConfigEvent getWifiConfiguration()
		{
			return native_getWifiConfiguration(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #148 <Method WifiConfigEvent native_getWifiConfiguration(long)>
		//    4    8:areturn         
		}

		public AssetWifiLogEvent getWifiLogs()
		{
			return native_getWifiLogs(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #152 <Method AssetWifiLogEvent native_getWifiLogs(long)>
		//    4    8:areturn         
		}

		public AssetWifiSignalStrengthEvent getWifiSignalStrength()
		{
			return native_getWifiSignalStrength(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #156 <Method AssetWifiSignalStrengthEvent native_getWifiSignalStrength(long)>
		//    4    8:areturn         
		}

		public boolean isConnectedLocally()
		{
			return native_isConnectedLocally(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #159 <Method boolean native_isConnectedLocally(long)>
		//    4    8:ireturn         
		}

		public boolean isWifiLogsAvailable()
		{
			return native_isWifiLogsAvailable(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #162 <Method boolean native_isWifiLogsAvailable(long)>
		//    4    8:ireturn         
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
		//    1    1:invokespecial   #19  <Method void AssetNetworkUIServiceData()>
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


	public AssetNetworkUIServiceData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract boolean canCommunicateWithAsset();

	public abstract AwsCloudEnvironmentEvent getAwsCloudEnvironment();

	public abstract AssetCloudConfigEvent getCloudNetworkAddress();

	public abstract NetworkState getConnectionStateForLocal();

	public abstract NetworkState getConnectionStateForRemote();

	public abstract CurrentConnectionStateEvent getCurrentConnectionEvent();

	public abstract CurrentConnectionState getCurrentConnectionState();

	public abstract ArrayList getDataStateChangelist();

	public abstract AssetMacAddressEvent getMacAddress();

	public abstract NetworkAddressEvent getNetworkAddress();

	public abstract ArrayList getNetworkInterfaces();

	public abstract AssetNetworkSettingsEvent getNetworkSettings();

	public abstract AssetNetworkStatusEvent getNetworkStatus();

	public abstract ArrayList getSupportedNetworkDataTypes();

	public abstract ArrayList getViewStateChangelist();

	public abstract WifiConfigEvent getWifiConfiguration();

	public abstract AssetWifiLogEvent getWifiLogs();

	public abstract AssetWifiSignalStrengthEvent getWifiSignalStrength();

	public abstract boolean isConnectedLocally();

	public abstract boolean isWifiLogsAvailable();
}
