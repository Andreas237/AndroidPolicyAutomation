// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			RobotNameEvent, AssetInfo, DataType, CommandType, 
//			AppInfoEvent, NetworkSessionType, NetworkAddressEvent, RobotPreferences, 
//			RobotPasswordEvent

public abstract class CommandTierAgent
{
	private static final class CppProxy extends CommandTierAgent
	{

		private native void nativeDestroy(long l);

		private native void native_connect(long l);

		private native void native_disconnect(long l);

		private native RobotNameEvent native_getRobotName(long l);

		private native void native_processV1ProvisioningFinished(long l, AssetInfo assetinfo);

		private native void native_queryCloudConfig(long l);

		private native void native_queryRoombaName(long l);

		private native void native_requestData(long l, DataType datatype);

		private native void native_requestPose(long l);

		private native void native_resetRobotLocally(long l);

		private native void native_resetRobotRemotely(long l);

		private native void native_sendCommand(long l, CommandType commandtype);

		private native void native_sendDriveCommandWithSpeed(long l, float f, float f1, boolean flag);

		private native void native_sendOTAPackage(long l, byte abyte0[]);

		private native void native_setAppInfoState(long l, AppInfoEvent appinfoevent);

		private native void native_setCountry(long l, String s);

		private native void native_setFakeRemoteNetworkDownMessages(long l, boolean flag);

		private native void native_setNetworkAddressState(long l, NetworkSessionType networksessiontype, NetworkAddressEvent networkaddressevent);

		private native void native_setNetworkToConnected(long l, AssetInfo assetinfo, NetworkSessionType networksessiontype);

		private native void native_setPreferences(long l, RobotPreferences robotpreferences);

		private native void native_setRegistrationDate(long l, String s);

		private native void native_setRobotPasswordState(long l, RobotPasswordEvent robotpasswordevent);

		private native void native_startOTAUpdate(long l);

		public void connect()
		{
			native_connect(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #74  <Method void native_connect(long)>
		//    4    8:return          
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

		public void disconnect()
		{
			native_disconnect(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #84  <Method void native_disconnect(long)>
		//    4    8:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #87  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #91  <Method void Object.finalize()>
		//    4    8:return          
		}

		public RobotNameEvent getRobotName()
		{
			return native_getRobotName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #95  <Method RobotNameEvent native_getRobotName(long)>
		//    4    8:areturn         
		}

		public void processV1ProvisioningFinished(AssetInfo assetinfo)
		{
			native_processV1ProvisioningFinished(nativeRef, assetinfo);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #99  <Method void native_processV1ProvisioningFinished(long, AssetInfo)>
		//    5    9:return          
		}

		public void queryCloudConfig()
		{
			native_queryCloudConfig(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #102 <Method void native_queryCloudConfig(long)>
		//    4    8:return          
		}

		public void queryRoombaName()
		{
			native_queryRoombaName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #105 <Method void native_queryRoombaName(long)>
		//    4    8:return          
		}

		public void requestData(DataType datatype)
		{
			native_requestData(nativeRef, datatype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #109 <Method void native_requestData(long, DataType)>
		//    5    9:return          
		}

		public void requestPose()
		{
			native_requestPose(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #112 <Method void native_requestPose(long)>
		//    4    8:return          
		}

		public void resetRobotLocally()
		{
			native_resetRobotLocally(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #115 <Method void native_resetRobotLocally(long)>
		//    4    8:return          
		}

		public void resetRobotRemotely()
		{
			native_resetRobotRemotely(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #118 <Method void native_resetRobotRemotely(long)>
		//    4    8:return          
		}

		public void sendCommand(CommandType commandtype)
		{
			native_sendCommand(nativeRef, commandtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #122 <Method void native_sendCommand(long, CommandType)>
		//    5    9:return          
		}

		public void sendDriveCommandWithSpeed(float f, float f1, boolean flag)
		{
			native_sendDriveCommandWithSpeed(nativeRef, f, f1, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:fload_1         
		//    4    6:fload_2         
		//    5    7:iload_3         
		//    6    8:invokespecial   #126 <Method void native_sendDriveCommandWithSpeed(long, float, float, boolean)>
		//    7   11:return          
		}

		public void sendOTAPackage(byte abyte0[])
		{
			native_sendOTAPackage(nativeRef, abyte0);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #130 <Method void native_sendOTAPackage(long, byte[])>
		//    5    9:return          
		}

		public void setAppInfoState(AppInfoEvent appinfoevent)
		{
			native_setAppInfoState(nativeRef, appinfoevent);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #134 <Method void native_setAppInfoState(long, AppInfoEvent)>
		//    5    9:return          
		}

		public void setCountry(String s)
		{
			native_setCountry(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #137 <Method void native_setCountry(long, String)>
		//    5    9:return          
		}

		public void setFakeRemoteNetworkDownMessages(boolean flag)
		{
			native_setFakeRemoteNetworkDownMessages(nativeRef, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:invokespecial   #140 <Method void native_setFakeRemoteNetworkDownMessages(long, boolean)>
		//    5    9:return          
		}

		public void setNetworkAddressState(NetworkSessionType networksessiontype, NetworkAddressEvent networkaddressevent)
		{
			native_setNetworkAddressState(nativeRef, networksessiontype, networkaddressevent);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #144 <Method void native_setNetworkAddressState(long, NetworkSessionType, NetworkAddressEvent)>
		//    6   10:return          
		}

		public void setNetworkToConnected(AssetInfo assetinfo, NetworkSessionType networksessiontype)
		{
			native_setNetworkToConnected(nativeRef, assetinfo, networksessiontype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #148 <Method void native_setNetworkToConnected(long, AssetInfo, NetworkSessionType)>
		//    6   10:return          
		}

		public void setPreferences(RobotPreferences robotpreferences)
		{
			native_setPreferences(nativeRef, robotpreferences);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #152 <Method void native_setPreferences(long, RobotPreferences)>
		//    5    9:return          
		}

		public void setRegistrationDate(String s)
		{
			native_setRegistrationDate(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #155 <Method void native_setRegistrationDate(long, String)>
		//    5    9:return          
		}

		public void setRobotPasswordState(RobotPasswordEvent robotpasswordevent)
		{
			native_setRobotPasswordState(nativeRef, robotpasswordevent);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #159 <Method void native_setRobotPasswordState(long, RobotPasswordEvent)>
		//    5    9:return          
		}

		public void startOTAUpdate()
		{
			native_startOTAUpdate(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #162 <Method void native_startOTAUpdate(long)>
		//    4    8:return          
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
		//    1    1:invokespecial   #19  <Method void CommandTierAgent()>
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


	public CommandTierAgent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract void connect();

	public abstract void disconnect();

	public abstract RobotNameEvent getRobotName();

	public abstract void processV1ProvisioningFinished(AssetInfo assetinfo);

	public abstract void queryCloudConfig();

	public abstract void queryRoombaName();

	public abstract void requestData(DataType datatype);

	public abstract void requestPose();

	public abstract void resetRobotLocally();

	public abstract void resetRobotRemotely();

	public abstract void sendCommand(CommandType commandtype);

	public abstract void sendDriveCommandWithSpeed(float f, float f1, boolean flag);

	public abstract void sendOTAPackage(byte abyte0[]);

	public abstract void setAppInfoState(AppInfoEvent appinfoevent);

	public abstract void setCountry(String s);

	public abstract void setFakeRemoteNetworkDownMessages(boolean flag);

	public abstract void setNetworkAddressState(NetworkSessionType networksessiontype, NetworkAddressEvent networkaddressevent);

	public abstract void setNetworkToConnected(AssetInfo assetinfo, NetworkSessionType networksessiontype);

	public abstract void setPreferences(RobotPreferences robotpreferences);

	public abstract void setRegistrationDate(String s);

	public abstract void setRobotPasswordState(RobotPasswordEvent robotpasswordevent);

	public abstract void startOTAUpdate();
}
