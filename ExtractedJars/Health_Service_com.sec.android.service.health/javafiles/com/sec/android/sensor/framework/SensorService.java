// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.*;
import com.samsung.android.sensor.aidl.ISensorDeviceScanCallback;
import com.samsung.android.sensor.aidl.ISensorServiceCallback;
import com.samsung.android.sensor.data.SensorConnectorInfo;
import com.samsung.android.sensor.data.SensorDeviceInfo;
import com.sec.android.sensor.framework.device.android.SensorAndroidDeviceFactory;
import com.sec.android.service.health.cp.accesscontrol.AccesscontrolUtil;
import com.sec.android.service.health.util.LOG;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.sec.android.sensor.framework:
//			SensorManager, SensorObjectIdGenerator, SensorCallbackManager

public class SensorService extends Service
{
	private static class RemoteInterfaceMessageHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			SensorService sensorservice = (SensorService)mReference.get();
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field WeakReference mReference>
		//    2    4:invokevirtual   #46  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class SensorService>
		//    4   10:astore_2        
			if(sensorservice != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          20
				sensorservice.handleMessage(message);
		//    7   15:aload_2         
		//    8   16:aload_1         
		//    9   17:invokestatic    #50  <Method void SensorService.access$400(SensorService, Message)>
		//   10   20:return          
		}

		private final WeakReference mReference;

		public RemoteInterfaceMessageHandler(SensorService sensorservice)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Handler()>
			LOG.i(SensorService.TAG, "RemoteInterfaceMessageHandler()");
		//    2    4:invokestatic    #19  <Method Class SensorService.access$000()>
		//    3    7:ldc1            #21  <String "RemoteInterfaceMessageHandler()">
		//    4    9:invokestatic    #27  <Method void LOG.i(Class, String)>
			if(sensorservice == null)
		//*   5   12:aload_1         
		//*   6   13:ifnonnull       30
			{
				LOG.w(SensorService.TAG, "RemoteInterfaceMessageHandler() SensorService is null");
		//    7   16:invokestatic    #19  <Method Class SensorService.access$000()>
		//    8   19:ldc1            #29  <String "RemoteInterfaceMessageHandler() SensorService is null">
		//    9   21:invokestatic    #32  <Method void LOG.w(Class, String)>
				mReference = null;
		//   10   24:aload_0         
		//   11   25:aconst_null     
		//   12   26:putfield        #34  <Field WeakReference mReference>
				return;
		//   13   29:return          
			} else
			{
				mReference = new WeakReference(((Object) (sensorservice)));
		//   14   30:aload_0         
		//   15   31:new             #36  <Class WeakReference>
		//   16   34:dup             
		//   17   35:aload_1         
		//   18   36:invokespecial   #39  <Method void WeakReference(Object)>
		//   19   39:putfield        #34  <Field WeakReference mReference>
				return;
		//   20   42:return          
			}
		}
	}


	public SensorService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Service()>
		mRemoteInterfaceMessageHandler = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #35  <Field SensorService$RemoteInterfaceMessageHandler mRemoteInterfaceMessageHandler>
		mContext = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #37  <Field Context mContext>
		mConnectorInfoList = ((List) (new ArrayList()));
	//    8   14:aload_0         
	//    9   15:new             #39  <Class ArrayList>
	//   10   18:dup             
	//   11   19:invokespecial   #40  <Method void ArrayList()>
	//   12   22:putfield        #42  <Field List mConnectorInfoList>
		mSensorServiceInterface = ((com.samsung.android.sensor.aidl.ISensorServiceInterface.Stub) (new com.samsung.android.sensor.aidl.ISensorServiceInterface.Stub() {

			public void addListener(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
			{
				LOG.i(SensorService.TAG, "addListener()");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #24  <String "addListener()">
			//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
				if(sensorconnectorinfo == null)
			//*   3    8:aload_1         
			//*   4    9:ifnonnull       20
					LOG.w(SensorService.TAG, "addListener() : SensorConnectorInfo is null");
			//    5   12:invokestatic    #22  <Method Class SensorService.access$000()>
			//    6   15:ldc1            #32  <String "addListener() : SensorConnectorInfo is null">
			//    7   17:invokestatic    #35  <Method void LOG.w(Class, String)>
				if(sensordeviceinfo == null)
			//*   8   20:aload_2         
			//*   9   21:ifnonnull       32
					LOG.w(SensorService.TAG, "addListener() : SensorDeviceInfo is null");
			//   10   24:invokestatic    #22  <Method Class SensorService.access$000()>
			//   11   27:ldc1            #37  <String "addListener() : SensorDeviceInfo is null">
			//   12   29:invokestatic    #35  <Method void LOG.w(Class, String)>
				if(!AccesscontrolUtil.checkSignature(mContext, AccesscontrolUtil.getCallerPackage(mContext)))
			//*  13   32:aload_0         
			//*  14   33:getfield        #12  <Field SensorService this$0>
			//*  15   36:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  16   39:aload_0         
			//*  17   40:getfield        #12  <Field SensorService this$0>
			//*  18   43:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  19   46:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(Context)>
			//*  20   49:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
			//*  21   52:iconst_1        
			//*  22   53:icmpeq          65
				{
					LOG.e(SensorService.TAG, "addListener() : Security exception - Caller application not privileged");
			//   23   56:invokestatic    #22  <Method Class SensorService.access$000()>
			//   24   59:ldc1            #53  <String "addListener() : Security exception - Caller application not privileged">
			//   25   61:invokestatic    #56  <Method void LOG.e(Class, String)>
					return;
			//   26   64:return          
				} else
				{
					Bundle bundle = new Bundle();
			//   27   65:new             #58  <Class Bundle>
			//   28   68:dup             
			//   29   69:invokespecial   #59  <Method void Bundle()>
			//   30   72:astore_3        
					bundle.putParcelable("callback_message_arg_connector_info", ((android.os.Parcelable) (sensorconnectorinfo)));
			//   31   73:aload_3         
			//   32   74:ldc1            #61  <String "callback_message_arg_connector_info">
			//   33   76:aload_1         
			//   34   77:invokevirtual   #65  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
					bundle.putParcelable("callback_message_arg_device_info", ((android.os.Parcelable) (sensordeviceinfo)));
			//   35   80:aload_3         
			//   36   81:ldc1            #67  <String "callback_message_arg_device_info">
			//   37   83:aload_2         
			//   38   84:invokevirtual   #65  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
					sensorconnectorinfo = ((SensorConnectorInfo) (new Message()));
			//   39   87:new             #69  <Class Message>
			//   40   90:dup             
			//   41   91:invokespecial   #70  <Method void Message()>
			//   42   94:astore_1        
					sensorconnectorinfo.what = 700;
			//   43   95:aload_1         
			//   44   96:sipush          700
			//   45   99:putfield        #74  <Field int Message.what>
					((Message) (sensorconnectorinfo)).setData(bundle);
			//   46  102:aload_1         
			//   47  103:aload_3         
			//   48  104:invokevirtual   #78  <Method void Message.setData(Bundle)>
					mRemoteInterfaceMessageHandler.sendMessage(((Message) (sensorconnectorinfo)));
			//   49  107:aload_0         
			//   50  108:getfield        #12  <Field SensorService this$0>
			//   51  111:invokestatic    #82  <Method SensorService$RemoteInterfaceMessageHandler SensorService.access$200(SensorService)>
			//   52  114:aload_1         
			//   53  115:invokevirtual   #88  <Method boolean SensorService$RemoteInterfaceMessageHandler.sendMessage(Message)>
			//   54  118:pop             
					return;
			//   55  119:return          
				}
			}

			public void addPendingIntent(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo, PendingIntent pendingintent)
				throws RemoteException
			{
			//    0    0:return          
			}

			public SensorDeviceInfo getDeviceInfoById(String s)
				throws RemoteException
			{
				LOG.i(SensorService.TAG, "getDeviceInfoById()");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #97  <String "getDeviceInfoById()">
			//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
				return null;
			//    3    8:aconst_null     
			//    4    9:areturn         
			}

			public List getRegisteredAccessoryDeviceInfoList()
				throws RemoteException
			{
				LOG.i(SensorService.TAG, "getRegisteredDeviceInfoList()");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #101 <String "getRegisteredDeviceInfoList()">
			//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
				return null;
			//    3    8:aconst_null     
			//    4    9:areturn         
			}

			public SensorDeviceInfo getSupportedAndroidDeviceInfo(int i)
				throws RemoteException
			{
				LOG.d(SensorService.TAG, (new StringBuilder()).append("getAndroidSensorDeviceInfo dataType = ").append(i).toString());
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:new             #107 <Class StringBuilder>
			//    2    6:dup             
			//    3    7:invokespecial   #108 <Method void StringBuilder()>
			//    4   10:ldc1            #110 <String "getAndroidSensorDeviceInfo dataType = ">
			//    5   12:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
			//    6   15:iload_1         
			//    7   16:invokevirtual   #117 <Method StringBuilder StringBuilder.append(int)>
			//    8   19:invokevirtual   #121 <Method String StringBuilder.toString()>
			//    9   22:invokestatic    #124 <Method void LOG.d(Class, String)>
				if(!AccesscontrolUtil.checkSignature(mContext, AccesscontrolUtil.getCallerPackage(mContext)))
			//*  10   25:aload_0         
			//*  11   26:getfield        #12  <Field SensorService this$0>
			//*  12   29:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  13   32:aload_0         
			//*  14   33:getfield        #12  <Field SensorService this$0>
			//*  15   36:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  16   39:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(Context)>
			//*  17   42:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
			//*  18   45:iconst_1        
			//*  19   46:icmpeq          59
				{
					LOG.d(SensorService.TAG, "[requestAccess] : Security exception - Caller application not privileged");
			//   20   49:invokestatic    #22  <Method Class SensorService.access$000()>
			//   21   52:ldc1            #126 <String "[requestAccess] : Security exception - Caller application not privileged">
			//   22   54:invokestatic    #124 <Method void LOG.d(Class, String)>
					return null;
			//   23   57:aconst_null     
			//   24   58:areturn         
				} else
				{
					return SensorAndroidDeviceFactory.getSupportedSensor(((Context) (SensorService.this)), i);
			//   25   59:aload_0         
			//   26   60:getfield        #12  <Field SensorService this$0>
			//   27   63:iload_1         
			//   28   64:invokestatic    #132 <Method SensorDeviceInfo SensorAndroidDeviceFactory.getSupportedSensor(Context, int)>
			//   29   67:areturn         
				}
			}

			public List getSupportedAndroidDeviceInfoList()
				throws RemoteException
			{
				LOG.d(SensorService.TAG, "getSupportedAndroidSensorList");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #135 <String "getSupportedAndroidSensorList">
			//    2    5:invokestatic    #124 <Method void LOG.d(Class, String)>
				if(!AccesscontrolUtil.checkSignature(mContext, AccesscontrolUtil.getCallerPackage(mContext)))
			//*   3    8:aload_0         
			//*   4    9:getfield        #12  <Field SensorService this$0>
			//*   5   12:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*   6   15:aload_0         
			//*   7   16:getfield        #12  <Field SensorService this$0>
			//*   8   19:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*   9   22:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(Context)>
			//*  10   25:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
			//*  11   28:iconst_1        
			//*  12   29:icmpeq          42
				{
					LOG.d(SensorService.TAG, "[requestAccess] : Security exception - Caller application not privileged");
			//   13   32:invokestatic    #22  <Method Class SensorService.access$000()>
			//   14   35:ldc1            #126 <String "[requestAccess] : Security exception - Caller application not privileged">
			//   15   37:invokestatic    #124 <Method void LOG.d(Class, String)>
					return null;
			//   16   40:aconst_null     
			//   17   41:areturn         
				} else
				{
					return SensorAndroidDeviceFactory.getSupportedSensorList(((Context) (SensorService.this)));
			//   18   42:aload_0         
			//   19   43:getfield        #12  <Field SensorService this$0>
			//   20   46:invokestatic    #139 <Method List SensorAndroidDeviceFactory.getSupportedSensorList(Context)>
			//   21   49:areturn         
				}
			}

			public boolean isAndroidSensorSupported(int i)
				throws RemoteException
			{
				LOG.d(SensorService.TAG, "isAndroidSensorSupported");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #142 <String "isAndroidSensorSupported">
			//    2    5:invokestatic    #124 <Method void LOG.d(Class, String)>
				if(!AccesscontrolUtil.checkSignature(mContext, AccesscontrolUtil.getCallerPackage(mContext)))
			//*   3    8:aload_0         
			//*   4    9:getfield        #12  <Field SensorService this$0>
			//*   5   12:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*   6   15:aload_0         
			//*   7   16:getfield        #12  <Field SensorService this$0>
			//*   8   19:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*   9   22:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(Context)>
			//*  10   25:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
			//*  11   28:iconst_1        
			//*  12   29:icmpeq          42
				{
					LOG.d(SensorService.TAG, "[requestAccess] : Security exception - Caller application not privileged");
			//   13   32:invokestatic    #22  <Method Class SensorService.access$000()>
			//   14   35:ldc1            #126 <String "[requestAccess] : Security exception - Caller application not privileged">
			//   15   37:invokestatic    #124 <Method void LOG.d(Class, String)>
					return false;
			//   16   40:iconst_0        
			//   17   41:ireturn         
				} else
				{
					return SensorAndroidDeviceFactory.isSensorSupported(((Context) (SensorService.this)), i);
			//   18   42:aload_0         
			//   19   43:getfield        #12  <Field SensorService this$0>
			//   20   46:iload_1         
			//   21   47:invokestatic    #146 <Method boolean SensorAndroidDeviceFactory.isSensorSupported(Context, int)>
			//   22   50:ireturn         
				}
			}

			public boolean registerAccessoryDeviceInfo(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
				throws RemoteException
			{
				LOG.i(SensorService.TAG, "registerAccessoryDeviceInfo()");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #150 <String "registerAccessoryDeviceInfo()">
			//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
				return false;
			//    3    8:iconst_0        
			//    4    9:ireturn         
			}

			public void registerConnector(SensorConnectorInfo sensorconnectorinfo, ISensorServiceCallback isensorservicecallback)
			{
				LOG.i(SensorService.TAG, "registerConnector()");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #154 <String "registerConnector()">
			//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
				if(sensorconnectorinfo == null)
			//*   3    8:aload_1         
			//*   4    9:ifnonnull       21
				{
					LOG.e(SensorService.TAG, "registerConnector() : SensorConnectorInfo is null !!!");
			//    5   12:invokestatic    #22  <Method Class SensorService.access$000()>
			//    6   15:ldc1            #156 <String "registerConnector() : SensorConnectorInfo is null !!!">
			//    7   17:invokestatic    #56  <Method void LOG.e(Class, String)>
					return;
			//    8   20:return          
				}
				if(isensorservicecallback == null)
			//*   9   21:aload_2         
			//*  10   22:ifnonnull       33
					LOG.w(SensorService.TAG, "registerConnector() : ISensorServiceCallback is null");
			//   11   25:invokestatic    #22  <Method Class SensorService.access$000()>
			//   12   28:ldc1            #158 <String "registerConnector() : ISensorServiceCallback is null">
			//   13   30:invokestatic    #35  <Method void LOG.w(Class, String)>
				if(!AccesscontrolUtil.checkSignature(mContext, AccesscontrolUtil.getCallerPackage(mContext)))
			//*  14   33:aload_0         
			//*  15   34:getfield        #12  <Field SensorService this$0>
			//*  16   37:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  17   40:aload_0         
			//*  18   41:getfield        #12  <Field SensorService this$0>
			//*  19   44:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  20   47:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(Context)>
			//*  21   50:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
			//*  22   53:iconst_1        
			//*  23   54:icmpeq          66
				{
					LOG.d(SensorService.TAG, "registerConnector() : Security exception - Caller application not privileged");
			//   24   57:invokestatic    #22  <Method Class SensorService.access$000()>
			//   25   60:ldc1            #160 <String "registerConnector() : Security exception - Caller application not privileged">
			//   26   62:invokestatic    #124 <Method void LOG.d(Class, String)>
					return;
			//   27   65:return          
				} else
				{
					mConnectorInfoList.add(((Object) (sensorconnectorinfo)));
			//   28   66:aload_0         
			//   29   67:getfield        #12  <Field SensorService this$0>
			//   30   70:invokestatic    #164 <Method List SensorService.access$300(SensorService)>
			//   31   73:aload_1         
			//   32   74:invokeinterface #170 <Method boolean List.add(Object)>
			//   33   79:pop             
					SensorCallbackManager.getInstance().addServiceCallback(sensorconnectorinfo.getName(), isensorservicecallback);
			//   34   80:invokestatic    #176 <Method SensorCallbackManager SensorCallbackManager.getInstance()>
			//   35   83:aload_1         
			//   36   84:invokevirtual   #181 <Method String SensorConnectorInfo.getName()>
			//   37   87:aload_2         
			//   38   88:invokevirtual   #185 <Method void SensorCallbackManager.addServiceCallback(String, ISensorServiceCallback)>
					return;
			//   39   91:return          
				}
			}

			public void releaseAccess(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
			{
				LOG.i(SensorService.TAG, "releaseAccess()");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #188 <String "releaseAccess()">
			//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
				if(sensorconnectorinfo == null)
			//*   3    8:aload_1         
			//*   4    9:ifnonnull       20
					LOG.w(SensorService.TAG, "releaseAccess() : SensorConnectorInfo is null");
			//    5   12:invokestatic    #22  <Method Class SensorService.access$000()>
			//    6   15:ldc1            #190 <String "releaseAccess() : SensorConnectorInfo is null">
			//    7   17:invokestatic    #35  <Method void LOG.w(Class, String)>
				if(sensordeviceinfo == null)
			//*   8   20:aload_2         
			//*   9   21:ifnonnull       32
					LOG.w(SensorService.TAG, "releaseAccess() : SensorDeviceInfo is null");
			//   10   24:invokestatic    #22  <Method Class SensorService.access$000()>
			//   11   27:ldc1            #192 <String "releaseAccess() : SensorDeviceInfo is null">
			//   12   29:invokestatic    #35  <Method void LOG.w(Class, String)>
				if(!AccesscontrolUtil.checkSignature(mContext, AccesscontrolUtil.getCallerPackage(mContext)))
			//*  13   32:aload_0         
			//*  14   33:getfield        #12  <Field SensorService this$0>
			//*  15   36:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  16   39:aload_0         
			//*  17   40:getfield        #12  <Field SensorService this$0>
			//*  18   43:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  19   46:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(Context)>
			//*  20   49:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
			//*  21   52:iconst_1        
			//*  22   53:icmpeq          65
				{
					LOG.e(SensorService.TAG, "releaseAccess() : Security exception - Caller application not privileged");
			//   23   56:invokestatic    #22  <Method Class SensorService.access$000()>
			//   24   59:ldc1            #194 <String "releaseAccess() : Security exception - Caller application not privileged">
			//   25   61:invokestatic    #56  <Method void LOG.e(Class, String)>
					return;
			//   26   64:return          
				} else
				{
					Bundle bundle = new Bundle();
			//   27   65:new             #58  <Class Bundle>
			//   28   68:dup             
			//   29   69:invokespecial   #59  <Method void Bundle()>
			//   30   72:astore_3        
					bundle.putParcelable("callback_message_arg_connector_info", ((android.os.Parcelable) (sensorconnectorinfo)));
			//   31   73:aload_3         
			//   32   74:ldc1            #61  <String "callback_message_arg_connector_info">
			//   33   76:aload_1         
			//   34   77:invokevirtual   #65  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
					bundle.putParcelable("callback_message_arg_device_info", ((android.os.Parcelable) (sensordeviceinfo)));
			//   35   80:aload_3         
			//   36   81:ldc1            #67  <String "callback_message_arg_device_info">
			//   37   83:aload_2         
			//   38   84:invokevirtual   #65  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
					sensorconnectorinfo = ((SensorConnectorInfo) (new Message()));
			//   39   87:new             #69  <Class Message>
			//   40   90:dup             
			//   41   91:invokespecial   #70  <Method void Message()>
			//   42   94:astore_1        
					sensorconnectorinfo.what = 600;
			//   43   95:aload_1         
			//   44   96:sipush          600
			//   45   99:putfield        #74  <Field int Message.what>
					((Message) (sensorconnectorinfo)).setData(bundle);
			//   46  102:aload_1         
			//   47  103:aload_3         
			//   48  104:invokevirtual   #78  <Method void Message.setData(Bundle)>
					mRemoteInterfaceMessageHandler.sendMessage(((Message) (sensorconnectorinfo)));
			//   49  107:aload_0         
			//   50  108:getfield        #12  <Field SensorService this$0>
			//   51  111:invokestatic    #82  <Method SensorService$RemoteInterfaceMessageHandler SensorService.access$200(SensorService)>
			//   52  114:aload_1         
			//   53  115:invokevirtual   #88  <Method boolean SensorService$RemoteInterfaceMessageHandler.sendMessage(Message)>
			//   54  118:pop             
					return;
			//   55  119:return          
				}
			}

			public void removeListener(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
			{
				LOG.i(SensorService.TAG, "removeListener()");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #197 <String "removeListener()">
			//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
				if(sensorconnectorinfo == null)
			//*   3    8:aload_1         
			//*   4    9:ifnonnull       20
					LOG.w(SensorService.TAG, "removeListener() : SensorConnectorInfo is null");
			//    5   12:invokestatic    #22  <Method Class SensorService.access$000()>
			//    6   15:ldc1            #199 <String "removeListener() : SensorConnectorInfo is null">
			//    7   17:invokestatic    #35  <Method void LOG.w(Class, String)>
				if(sensordeviceinfo == null)
			//*   8   20:aload_2         
			//*   9   21:ifnonnull       32
					LOG.w(SensorService.TAG, "removeListener() : SensorDeviceInfo is null");
			//   10   24:invokestatic    #22  <Method Class SensorService.access$000()>
			//   11   27:ldc1            #201 <String "removeListener() : SensorDeviceInfo is null">
			//   12   29:invokestatic    #35  <Method void LOG.w(Class, String)>
				if(!AccesscontrolUtil.checkSignature(mContext, AccesscontrolUtil.getCallerPackage(mContext)))
			//*  13   32:aload_0         
			//*  14   33:getfield        #12  <Field SensorService this$0>
			//*  15   36:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  16   39:aload_0         
			//*  17   40:getfield        #12  <Field SensorService this$0>
			//*  18   43:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  19   46:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(Context)>
			//*  20   49:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
			//*  21   52:iconst_1        
			//*  22   53:icmpeq          65
				{
					LOG.e(SensorService.TAG, "removeListener() : Security exception - Caller application not privileged");
			//   23   56:invokestatic    #22  <Method Class SensorService.access$000()>
			//   24   59:ldc1            #203 <String "removeListener() : Security exception - Caller application not privileged">
			//   25   61:invokestatic    #56  <Method void LOG.e(Class, String)>
					return;
			//   26   64:return          
				} else
				{
					Bundle bundle = new Bundle();
			//   27   65:new             #58  <Class Bundle>
			//   28   68:dup             
			//   29   69:invokespecial   #59  <Method void Bundle()>
			//   30   72:astore_3        
					bundle.putParcelable("callback_message_arg_connector_info", ((android.os.Parcelable) (sensorconnectorinfo)));
			//   31   73:aload_3         
			//   32   74:ldc1            #61  <String "callback_message_arg_connector_info">
			//   33   76:aload_1         
			//   34   77:invokevirtual   #65  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
					bundle.putParcelable("callback_message_arg_device_info", ((android.os.Parcelable) (sensordeviceinfo)));
			//   35   80:aload_3         
			//   36   81:ldc1            #67  <String "callback_message_arg_device_info">
			//   37   83:aload_2         
			//   38   84:invokevirtual   #65  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
					sensorconnectorinfo = ((SensorConnectorInfo) (new Message()));
			//   39   87:new             #69  <Class Message>
			//   40   90:dup             
			//   41   91:invokespecial   #70  <Method void Message()>
			//   42   94:astore_1        
					sensorconnectorinfo.what = 800;
			//   43   95:aload_1         
			//   44   96:sipush          800
			//   45   99:putfield        #74  <Field int Message.what>
					((Message) (sensorconnectorinfo)).setData(bundle);
			//   46  102:aload_1         
			//   47  103:aload_3         
			//   48  104:invokevirtual   #78  <Method void Message.setData(Bundle)>
					mRemoteInterfaceMessageHandler.sendMessage(((Message) (sensorconnectorinfo)));
			//   49  107:aload_0         
			//   50  108:getfield        #12  <Field SensorService this$0>
			//   51  111:invokestatic    #82  <Method SensorService$RemoteInterfaceMessageHandler SensorService.access$200(SensorService)>
			//   52  114:aload_1         
			//   53  115:invokevirtual   #88  <Method boolean SensorService$RemoteInterfaceMessageHandler.sendMessage(Message)>
			//   54  118:pop             
					return;
			//   55  119:return          
				}
			}

			public void removePendingIntent(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo, PendingIntent pendingintent)
				throws RemoteException
			{
			//    0    0:return          
			}

			public void requestAccess(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
			{
				LOG.i(SensorService.TAG, "requestAccess()");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #207 <String "requestAccess()">
			//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
				if(sensorconnectorinfo == null)
			//*   3    8:aload_1         
			//*   4    9:ifnonnull       20
					LOG.w(SensorService.TAG, "requestAccess() : SensorConnectorInfo is null");
			//    5   12:invokestatic    #22  <Method Class SensorService.access$000()>
			//    6   15:ldc1            #209 <String "requestAccess() : SensorConnectorInfo is null">
			//    7   17:invokestatic    #35  <Method void LOG.w(Class, String)>
				if(sensordeviceinfo == null)
			//*   8   20:aload_2         
			//*   9   21:ifnonnull       32
					LOG.w(SensorService.TAG, "requestAccess() : SensorDeviceInfo is null");
			//   10   24:invokestatic    #22  <Method Class SensorService.access$000()>
			//   11   27:ldc1            #211 <String "requestAccess() : SensorDeviceInfo is null">
			//   12   29:invokestatic    #35  <Method void LOG.w(Class, String)>
				if(!AccesscontrolUtil.checkSignature(mContext, AccesscontrolUtil.getCallerPackage(mContext)))
			//*  13   32:aload_0         
			//*  14   33:getfield        #12  <Field SensorService this$0>
			//*  15   36:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  16   39:aload_0         
			//*  17   40:getfield        #12  <Field SensorService this$0>
			//*  18   43:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  19   46:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(Context)>
			//*  20   49:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
			//*  21   52:iconst_1        
			//*  22   53:icmpeq          65
				{
					LOG.e(SensorService.TAG, "requestAccess() : Security exception - Caller application not privileged");
			//   23   56:invokestatic    #22  <Method Class SensorService.access$000()>
			//   24   59:ldc1            #213 <String "requestAccess() : Security exception - Caller application not privileged">
			//   25   61:invokestatic    #56  <Method void LOG.e(Class, String)>
					return;
			//   26   64:return          
				} else
				{
					Bundle bundle = new Bundle();
			//   27   65:new             #58  <Class Bundle>
			//   28   68:dup             
			//   29   69:invokespecial   #59  <Method void Bundle()>
			//   30   72:astore_3        
					bundle.putParcelable("callback_message_arg_connector_info", ((android.os.Parcelable) (sensorconnectorinfo)));
			//   31   73:aload_3         
			//   32   74:ldc1            #61  <String "callback_message_arg_connector_info">
			//   33   76:aload_1         
			//   34   77:invokevirtual   #65  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
					bundle.putParcelable("callback_message_arg_device_info", ((android.os.Parcelable) (sensordeviceinfo)));
			//   35   80:aload_3         
			//   36   81:ldc1            #67  <String "callback_message_arg_device_info">
			//   37   83:aload_2         
			//   38   84:invokevirtual   #65  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
					sensorconnectorinfo = ((SensorConnectorInfo) (new Message()));
			//   39   87:new             #69  <Class Message>
			//   40   90:dup             
			//   41   91:invokespecial   #70  <Method void Message()>
			//   42   94:astore_1        
					sensorconnectorinfo.what = 500;
			//   43   95:aload_1         
			//   44   96:sipush          500
			//   45   99:putfield        #74  <Field int Message.what>
					((Message) (sensorconnectorinfo)).setData(bundle);
			//   46  102:aload_1         
			//   47  103:aload_3         
			//   48  104:invokevirtual   #78  <Method void Message.setData(Bundle)>
					mRemoteInterfaceMessageHandler.sendMessage(((Message) (sensorconnectorinfo)));
			//   49  107:aload_0         
			//   50  108:getfield        #12  <Field SensorService this$0>
			//   51  111:invokestatic    #82  <Method SensorService$RemoteInterfaceMessageHandler SensorService.access$200(SensorService)>
			//   52  114:aload_1         
			//   53  115:invokevirtual   #88  <Method boolean SensorService$RemoteInterfaceMessageHandler.sendMessage(Message)>
			//   54  118:pop             
					return;
			//   55  119:return          
				}
			}

			public void setBluetoothIdentifier(List list)
				throws RemoteException
			{
			//    0    0:return          
			}

			public void startAccessoryDeviceScan(SensorConnectorInfo sensorconnectorinfo, ISensorDeviceScanCallback isensordevicescancallback)
			{
				LOG.i(SensorService.TAG, "startAccessoryDeviceScan()");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #220 <String "startAccessoryDeviceScan()">
			//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
			//    3    8:return          
			}

			public void stopAccessoryDeviceScan(SensorConnectorInfo sensorconnectorinfo)
			{
				LOG.i(SensorService.TAG, "stopAccessoryDeviceScan()");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #224 <String "stopAccessoryDeviceScan()">
			//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
			//    3    8:return          
			}

			public void unregisterAccessoryDeviceInfo(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
				throws RemoteException
			{
				LOG.i(SensorService.TAG, "unregisterAccessoryDeviceInfo()");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #227 <String "unregisterAccessoryDeviceInfo()">
			//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
			//    3    8:return          
			}

			public void unregisterConnector(SensorConnectorInfo sensorconnectorinfo)
			{
				LOG.i(SensorService.TAG, "unregisterConnector()");
			//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
			//    1    3:ldc1            #230 <String "unregisterConnector()">
			//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
				if(sensorconnectorinfo == null)
			//*   3    8:aload_1         
			//*   4    9:ifnonnull       21
				{
					LOG.e(SensorService.TAG, "unregisterConnector() : SensorConnectorInfo is null !!!");
			//    5   12:invokestatic    #22  <Method Class SensorService.access$000()>
			//    6   15:ldc1            #232 <String "unregisterConnector() : SensorConnectorInfo is null !!!">
			//    7   17:invokestatic    #56  <Method void LOG.e(Class, String)>
					return;
			//    8   20:return          
				}
				if(!AccesscontrolUtil.checkSignature(mContext, AccesscontrolUtil.getCallerPackage(mContext)))
			//*   9   21:aload_0         
			//*  10   22:getfield        #12  <Field SensorService this$0>
			//*  11   25:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  12   28:aload_0         
			//*  13   29:getfield        #12  <Field SensorService this$0>
			//*  14   32:invokestatic    #41  <Method Context SensorService.access$100(SensorService)>
			//*  15   35:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(Context)>
			//*  16   38:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(Context, String)>
			//*  17   41:iconst_1        
			//*  18   42:icmpeq          54
				{
					LOG.d(SensorService.TAG, "unregisterConnector() : Security exception - Caller application not privileged");
			//   19   45:invokestatic    #22  <Method Class SensorService.access$000()>
			//   20   48:ldc1            #234 <String "unregisterConnector() : Security exception - Caller application not privileged">
			//   21   50:invokestatic    #124 <Method void LOG.d(Class, String)>
					return;
			//   22   53:return          
				} else
				{
					SensorCallbackManager.getInstance().removeServiceCallback(sensorconnectorinfo.getName());
			//   23   54:invokestatic    #176 <Method SensorCallbackManager SensorCallbackManager.getInstance()>
			//   24   57:aload_1         
			//   25   58:invokevirtual   #181 <Method String SensorConnectorInfo.getName()>
			//   26   61:invokevirtual   #238 <Method void SensorCallbackManager.removeServiceCallback(String)>
					mConnectorInfoList.remove(((Object) (sensorconnectorinfo)));
			//   27   64:aload_0         
			//   28   65:getfield        #12  <Field SensorService this$0>
			//   29   68:invokestatic    #164 <Method List SensorService.access$300(SensorService)>
			//   30   71:aload_1         
			//   31   72:invokeinterface #241 <Method boolean List.remove(Object)>
			//   32   77:pop             
					return;
			//   33   78:return          
				}
			}

			final SensorService this$0;

			
			{
				this$0 = SensorService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field SensorService this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void com.samsung.android.sensor.aidl.ISensorServiceInterface$Stub()>
			//    5    9:return          
			}
		}
));
	//   13   25:aload_0         
	//   14   26:new             #6   <Class SensorService$1>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokespecial   #45  <Method void SensorService$1(SensorService)>
	//   18   34:putfield        #47  <Field com.samsung.android.sensor.aidl.ISensorServiceInterface$Stub mSensorServiceInterface>
	//   19   37:return          
	}

	private void handleMessage(Message message)
	{
		if(message == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Object obj = ((Object) (message.getData()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #67  <Method Bundle Message.getData()>
	//    5    9:astore_2        
		switch(message.what)
	//*   6   10:aload_1         
	//*   7   11:getfield        #71  <Field int Message.what>
		{
	//*   8   14:lookupswitch    4: default 56
	//	               500: 57
	//	               600: 86
	//	               700: 115
	//	               800: 144
		default:
			return;
	//    9   56:return          

		case 500: 
			message = ((Message) ((SensorDeviceInfo)((Bundle) (obj)).getParcelable("callback_message_arg_device_info")));
	//   10   57:aload_2         
	//   11   58:ldc1            #73  <String "callback_message_arg_device_info">
	//   12   60:invokevirtual   #79  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   13   63:checkcast       #81  <Class SensorDeviceInfo>
	//   14   66:astore_1        
			obj = ((Object) ((SensorConnectorInfo)((Bundle) (obj)).getParcelable("callback_message_arg_connector_info")));
	//   15   67:aload_2         
	//   16   68:ldc1            #83  <String "callback_message_arg_connector_info">
	//   17   70:invokevirtual   #79  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   18   73:checkcast       #85  <Class SensorConnectorInfo>
	//   19   76:astore_2        
			SensorManager.getInstance().requestAccess(((SensorConnectorInfo) (obj)), ((SensorDeviceInfo) (message)));
	//   20   77:invokestatic    #91  <Method SensorManager SensorManager.getInstance()>
	//   21   80:aload_2         
	//   22   81:aload_1         
	//   23   82:invokevirtual   #95  <Method void SensorManager.requestAccess(SensorConnectorInfo, SensorDeviceInfo)>
			return;
	//   24   85:return          

		case 600: 
			message = ((Message) ((SensorDeviceInfo)((Bundle) (obj)).getParcelable("callback_message_arg_device_info")));
	//   25   86:aload_2         
	//   26   87:ldc1            #73  <String "callback_message_arg_device_info">
	//   27   89:invokevirtual   #79  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   28   92:checkcast       #81  <Class SensorDeviceInfo>
	//   29   95:astore_1        
			obj = ((Object) ((SensorConnectorInfo)((Bundle) (obj)).getParcelable("callback_message_arg_connector_info")));
	//   30   96:aload_2         
	//   31   97:ldc1            #83  <String "callback_message_arg_connector_info">
	//   32   99:invokevirtual   #79  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   33  102:checkcast       #85  <Class SensorConnectorInfo>
	//   34  105:astore_2        
			SensorManager.getInstance().releaseAccess(((SensorConnectorInfo) (obj)), ((SensorDeviceInfo) (message)));
	//   35  106:invokestatic    #91  <Method SensorManager SensorManager.getInstance()>
	//   36  109:aload_2         
	//   37  110:aload_1         
	//   38  111:invokevirtual   #98  <Method void SensorManager.releaseAccess(SensorConnectorInfo, SensorDeviceInfo)>
			return;
	//   39  114:return          

		case 700: 
			message = ((Message) ((SensorConnectorInfo)((Bundle) (obj)).getParcelable("callback_message_arg_connector_info")));
	//   40  115:aload_2         
	//   41  116:ldc1            #83  <String "callback_message_arg_connector_info">
	//   42  118:invokevirtual   #79  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   43  121:checkcast       #85  <Class SensorConnectorInfo>
	//   44  124:astore_1        
			obj = ((Object) ((SensorDeviceInfo)((Bundle) (obj)).getParcelable("callback_message_arg_device_info")));
	//   45  125:aload_2         
	//   46  126:ldc1            #73  <String "callback_message_arg_device_info">
	//   47  128:invokevirtual   #79  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   48  131:checkcast       #81  <Class SensorDeviceInfo>
	//   49  134:astore_2        
			SensorManager.getInstance().addListener(((SensorConnectorInfo) (message)), ((SensorDeviceInfo) (obj)));
	//   50  135:invokestatic    #91  <Method SensorManager SensorManager.getInstance()>
	//   51  138:aload_1         
	//   52  139:aload_2         
	//   53  140:invokevirtual   #101 <Method void SensorManager.addListener(SensorConnectorInfo, SensorDeviceInfo)>
			return;
	//   54  143:return          

		case 800: 
			message = ((Message) ((SensorConnectorInfo)((Bundle) (obj)).getParcelable("callback_message_arg_connector_info")));
	//   55  144:aload_2         
	//   56  145:ldc1            #83  <String "callback_message_arg_connector_info">
	//   57  147:invokevirtual   #79  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   58  150:checkcast       #85  <Class SensorConnectorInfo>
	//   59  153:astore_1        
			break;
		}
		obj = ((Object) ((SensorDeviceInfo)((Bundle) (obj)).getParcelable("callback_message_arg_device_info")));
	//   60  154:aload_2         
	//   61  155:ldc1            #73  <String "callback_message_arg_device_info">
	//   62  157:invokevirtual   #79  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   63  160:checkcast       #81  <Class SensorDeviceInfo>
	//   64  163:astore_2        
		SensorManager.getInstance().removeListener(((SensorConnectorInfo) (message)), ((SensorDeviceInfo) (obj)));
	//   65  164:invokestatic    #91  <Method SensorManager SensorManager.getInstance()>
	//   66  167:aload_1         
	//   67  168:aload_2         
	//   68  169:invokevirtual   #104 <Method void SensorManager.removeListener(SensorConnectorInfo, SensorDeviceInfo)>
	//   69  172:return          
	}

	public IBinder onBind(Intent intent)
	{
		LOG.i(TAG, "onBind()");
	//    0    0:getstatic       #29  <Field Class TAG>
	//    1    3:ldc1            #108 <String "onBind()">
	//    2    5:invokestatic    #114 <Method void LOG.i(Class, String)>
		if(intent == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       22
		{
			LOG.e(TAG, "onBind() : Intent is null !!!");
	//    5   12:getstatic       #29  <Field Class TAG>
	//    6   15:ldc1            #116 <String "onBind() : Intent is null !!!">
	//    7   17:invokestatic    #119 <Method void LOG.e(Class, String)>
		} else
	//*   8   20:aconst_null     
	//*   9   21:areturn         
		{
			intent = ((Intent) (intent.getAction()));
	//   10   22:aload_1         
	//   11   23:invokevirtual   #125 <Method String Intent.getAction()>
	//   12   26:astore_1        
			if(intent != null && ((String) (intent)).equals("com.sec.android.sensor.framework.CONNECT_PRIVILEGED_SENSOR_SERVICE"))
	//*  13   27:aload_1         
	//*  14   28:ifnull          20
	//*  15   31:aload_1         
	//*  16   32:ldc1            #13  <String "com.sec.android.sensor.framework.CONNECT_PRIVILEGED_SENSOR_SERVICE">
	//*  17   34:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  18   37:ifeq            20
			{
				LOG.d(TAG, "onBind() : Returning SensorFramework Interface.");
	//   19   40:getstatic       #29  <Field Class TAG>
	//   20   43:ldc1            #133 <String "onBind() : Returning SensorFramework Interface.">
	//   21   45:invokestatic    #136 <Method void LOG.d(Class, String)>
				return ((IBinder) (mSensorServiceInterface));
	//   22   48:aload_0         
	//   23   49:getfield        #47  <Field com.samsung.android.sensor.aidl.ISensorServiceInterface$Stub mSensorServiceInterface>
	//   24   52:areturn         
			}
		}
		return null;
	}

	public void onCreate()
	{
		LOG.setLogger();
	//    0    0:invokestatic    #140 <Method void LOG.setLogger()>
		LOG.i(TAG, "onCreate()");
	//    1    3:getstatic       #29  <Field Class TAG>
	//    2    6:ldc1            #142 <String "onCreate()">
	//    3    8:invokestatic    #114 <Method void LOG.i(Class, String)>
		super.onCreate();
	//    4   11:aload_0         
	//    5   12:invokespecial   #144 <Method void Service.onCreate()>
		mContext = ((Context) (this));
	//    6   15:aload_0         
	//    7   16:aload_0         
	//    8   17:putfield        #37  <Field Context mContext>
		SensorObjectIdGenerator.getInstance().initialize(((Context) (this)));
	//    9   20:invokestatic    #149 <Method SensorObjectIdGenerator SensorObjectIdGenerator.getInstance()>
	//   10   23:aload_0         
	//   11   24:invokevirtual   #153 <Method void SensorObjectIdGenerator.initialize(Context)>
		SensorManager.getInstance().initialize(((Context) (this)));
	//   12   27:invokestatic    #91  <Method SensorManager SensorManager.getInstance()>
	//   13   30:aload_0         
	//   14   31:invokevirtual   #154 <Method void SensorManager.initialize(Context)>
		mRemoteInterfaceMessageHandler = new RemoteInterfaceMessageHandler(this);
	//   15   34:aload_0         
	//   16   35:new             #8   <Class SensorService$RemoteInterfaceMessageHandler>
	//   17   38:dup             
	//   18   39:aload_0         
	//   19   40:invokespecial   #155 <Method void SensorService$RemoteInterfaceMessageHandler(SensorService)>
	//   20   43:putfield        #35  <Field SensorService$RemoteInterfaceMessageHandler mRemoteInterfaceMessageHandler>
	//   21   46:return          
	}

	public void onDestroy()
	{
		LOG.i(TAG, "onDestroy()");
	//    0    0:getstatic       #29  <Field Class TAG>
	//    1    3:ldc1            #158 <String "onDestroy()">
	//    2    5:invokestatic    #114 <Method void LOG.i(Class, String)>
		SensorManager.getInstance().uninitialize();
	//    3    8:invokestatic    #91  <Method SensorManager SensorManager.getInstance()>
	//    4   11:invokevirtual   #161 <Method void SensorManager.uninitialize()>
		super.onDestroy();
	//    5   14:aload_0         
	//    6   15:invokespecial   #163 <Method void Service.onDestroy()>
	//    7   18:return          
	}

	public int onStartCommand(Intent intent, int i, int j)
	{
		LOG.i(TAG, "onStartCommand()");
	//    0    0:getstatic       #29  <Field Class TAG>
	//    1    3:ldc1            #167 <String "onStartCommand()">
	//    2    5:invokestatic    #114 <Method void LOG.i(Class, String)>
		return super.onStartCommand(intent, i, j);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:invokespecial   #169 <Method int Service.onStartCommand(Intent, int, int)>
	//    8   15:ireturn         
	}

	public boolean onUnbind(Intent intent)
	{
		LOG.i(TAG, "onUnbind()");
	//    0    0:getstatic       #29  <Field Class TAG>
	//    1    3:ldc1            #173 <String "onUnbind()">
	//    2    5:invokestatic    #114 <Method void LOG.i(Class, String)>
		return super.onUnbind(intent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #175 <Method boolean Service.onUnbind(Intent)>
	//    6   13:ireturn         
	}

	private static final String INTENT_ACTION_CONNECT_PRIVILEGED_SENSOR_SERVICE = "com.sec.android.sensor.framework.CONNECT_PRIVILEGED_SENSOR_SERVICE";
	private static final Class TAG = com/sec/android/sensor/framework/SensorService;
	private List mConnectorInfoList;
	private Context mContext;
	private RemoteInterfaceMessageHandler mRemoteInterfaceMessageHandler;
	private com.samsung.android.sensor.aidl.ISensorServiceInterface.Stub mSensorServiceInterface;

	static 
	{
	//    0    0:ldc1            #2   <Class SensorService>
	//    1    2:putstatic       #29  <Field Class TAG>
	//*   2    5:return          
	}


/*
	static Class access$000()
	{
		return TAG;
	//    0    0:getstatic       #29  <Field Class TAG>
	//    1    3:areturn         
	}

*/


/*
	static Context access$100(SensorService sensorservice)
	{
		return sensorservice.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Context mContext>
	//    2    4:areturn         
	}

*/


/*
	static RemoteInterfaceMessageHandler access$200(SensorService sensorservice)
	{
		return sensorservice.mRemoteInterfaceMessageHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field SensorService$RemoteInterfaceMessageHandler mRemoteInterfaceMessageHandler>
	//    2    4:areturn         
	}

*/


/*
	static List access$300(SensorService sensorservice)
	{
		return sensorservice.mConnectorInfoList;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field List mConnectorInfoList>
	//    2    4:areturn         
	}

*/


/*
	static void access$400(SensorService sensorservice, Message message)
	{
		sensorservice.handleMessage(message);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #61  <Method void handleMessage(Message)>
		return;
	//    3    5:return          
	}

*/
}
