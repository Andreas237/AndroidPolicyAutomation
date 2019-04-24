// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework;

import android.app.PendingIntent;
import android.os.*;
import com.samsung.android.sensor.aidl.ISensorDeviceScanCallback;
import com.samsung.android.sensor.aidl.ISensorServiceCallback;
import com.samsung.android.sensor.data.SensorConnectorInfo;
import com.samsung.android.sensor.data.SensorDeviceInfo;
import com.sec.android.sensor.framework.device.android.SensorAndroidDeviceFactory;
import com.sec.android.service.health.cp.accesscontrol.AccesscontrolUtil;
import com.sec.android.service.health.util.LOG;
import java.util.List;

// Referenced classes of package com.sec.android.sensor.framework:
//			SensorService, SensorCallbackManager

class SensorService$1 extends com.samsung.android.sensor.aidl.terface.Stub
{

	public void addListener(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
	{
		LOG.i(SensorService.access$000(), "addListener()");
	//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
	//    1    3:ldc1            #24  <String "addListener()">
	//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       20
			LOG.w(SensorService.access$000(), "addListener() : SensorConnectorInfo is null");
	//    5   12:invokestatic    #22  <Method Class SensorService.access$000()>
	//    6   15:ldc1            #32  <String "addListener() : SensorConnectorInfo is null">
	//    7   17:invokestatic    #35  <Method void LOG.w(Class, String)>
		if(sensordeviceinfo == null)
	//*   8   20:aload_2         
	//*   9   21:ifnonnull       32
			LOG.w(SensorService.access$000(), "addListener() : SensorDeviceInfo is null");
	//   10   24:invokestatic    #22  <Method Class SensorService.access$000()>
	//   11   27:ldc1            #37  <String "addListener() : SensorDeviceInfo is null">
	//   12   29:invokestatic    #35  <Method void LOG.w(Class, String)>
		if(!AccesscontrolUtil.checkSignature(SensorService.access$100(SensorService.this), AccesscontrolUtil.getCallerPackage(SensorService.access$100(SensorService.this))))
	//*  13   32:aload_0         
	//*  14   33:getfield        #12  <Field SensorService this$0>
	//*  15   36:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  16   39:aload_0         
	//*  17   40:getfield        #12  <Field SensorService this$0>
	//*  18   43:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  19   46:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*  20   49:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*  21   52:iconst_1        
	//*  22   53:icmpeq          65
		{
			LOG.e(SensorService.access$000(), "addListener() : Security exception - Caller application not privileged");
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
			SensorService.access$200(SensorService.this).sendMessage(((Message) (sensorconnectorinfo)));
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
		LOG.i(SensorService.access$000(), "getDeviceInfoById()");
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
		LOG.i(SensorService.access$000(), "getRegisteredDeviceInfoList()");
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
		LOG.d(SensorService.access$000(), (new StringBuilder()).append("getAndroidSensorDeviceInfo dataType = ").append(i).toString());
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
		if(!AccesscontrolUtil.checkSignature(SensorService.access$100(SensorService.this), AccesscontrolUtil.getCallerPackage(SensorService.access$100(SensorService.this))))
	//*  10   25:aload_0         
	//*  11   26:getfield        #12  <Field SensorService this$0>
	//*  12   29:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  13   32:aload_0         
	//*  14   33:getfield        #12  <Field SensorService this$0>
	//*  15   36:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  16   39:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*  17   42:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*  18   45:iconst_1        
	//*  19   46:icmpeq          59
		{
			LOG.d(SensorService.access$000(), "[requestAccess] : Security exception - Caller application not privileged");
	//   20   49:invokestatic    #22  <Method Class SensorService.access$000()>
	//   21   52:ldc1            #126 <String "[requestAccess] : Security exception - Caller application not privileged">
	//   22   54:invokestatic    #124 <Method void LOG.d(Class, String)>
			return null;
	//   23   57:aconst_null     
	//   24   58:areturn         
		} else
		{
			return SensorAndroidDeviceFactory.getSupportedSensor(((android.content.Context) (SensorService.this)), i);
	//   25   59:aload_0         
	//   26   60:getfield        #12  <Field SensorService this$0>
	//   27   63:iload_1         
	//   28   64:invokestatic    #132 <Method SensorDeviceInfo SensorAndroidDeviceFactory.getSupportedSensor(android.content.Context, int)>
	//   29   67:areturn         
		}
	}

	public List getSupportedAndroidDeviceInfoList()
		throws RemoteException
	{
		LOG.d(SensorService.access$000(), "getSupportedAndroidSensorList");
	//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
	//    1    3:ldc1            #135 <String "getSupportedAndroidSensorList">
	//    2    5:invokestatic    #124 <Method void LOG.d(Class, String)>
		if(!AccesscontrolUtil.checkSignature(SensorService.access$100(SensorService.this), AccesscontrolUtil.getCallerPackage(SensorService.access$100(SensorService.this))))
	//*   3    8:aload_0         
	//*   4    9:getfield        #12  <Field SensorService this$0>
	//*   5   12:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*   6   15:aload_0         
	//*   7   16:getfield        #12  <Field SensorService this$0>
	//*   8   19:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*   9   22:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*  10   25:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*  11   28:iconst_1        
	//*  12   29:icmpeq          42
		{
			LOG.d(SensorService.access$000(), "[requestAccess] : Security exception - Caller application not privileged");
	//   13   32:invokestatic    #22  <Method Class SensorService.access$000()>
	//   14   35:ldc1            #126 <String "[requestAccess] : Security exception - Caller application not privileged">
	//   15   37:invokestatic    #124 <Method void LOG.d(Class, String)>
			return null;
	//   16   40:aconst_null     
	//   17   41:areturn         
		} else
		{
			return SensorAndroidDeviceFactory.getSupportedSensorList(((android.content.Context) (SensorService.this)));
	//   18   42:aload_0         
	//   19   43:getfield        #12  <Field SensorService this$0>
	//   20   46:invokestatic    #139 <Method List SensorAndroidDeviceFactory.getSupportedSensorList(android.content.Context)>
	//   21   49:areturn         
		}
	}

	public boolean isAndroidSensorSupported(int i)
		throws RemoteException
	{
		LOG.d(SensorService.access$000(), "isAndroidSensorSupported");
	//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
	//    1    3:ldc1            #142 <String "isAndroidSensorSupported">
	//    2    5:invokestatic    #124 <Method void LOG.d(Class, String)>
		if(!AccesscontrolUtil.checkSignature(SensorService.access$100(SensorService.this), AccesscontrolUtil.getCallerPackage(SensorService.access$100(SensorService.this))))
	//*   3    8:aload_0         
	//*   4    9:getfield        #12  <Field SensorService this$0>
	//*   5   12:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*   6   15:aload_0         
	//*   7   16:getfield        #12  <Field SensorService this$0>
	//*   8   19:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*   9   22:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*  10   25:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*  11   28:iconst_1        
	//*  12   29:icmpeq          42
		{
			LOG.d(SensorService.access$000(), "[requestAccess] : Security exception - Caller application not privileged");
	//   13   32:invokestatic    #22  <Method Class SensorService.access$000()>
	//   14   35:ldc1            #126 <String "[requestAccess] : Security exception - Caller application not privileged">
	//   15   37:invokestatic    #124 <Method void LOG.d(Class, String)>
			return false;
	//   16   40:iconst_0        
	//   17   41:ireturn         
		} else
		{
			return SensorAndroidDeviceFactory.isSensorSupported(((android.content.Context) (SensorService.this)), i);
	//   18   42:aload_0         
	//   19   43:getfield        #12  <Field SensorService this$0>
	//   20   46:iload_1         
	//   21   47:invokestatic    #146 <Method boolean SensorAndroidDeviceFactory.isSensorSupported(android.content.Context, int)>
	//   22   50:ireturn         
		}
	}

	public boolean registerAccessoryDeviceInfo(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException
	{
		LOG.i(SensorService.access$000(), "registerAccessoryDeviceInfo()");
	//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
	//    1    3:ldc1            #150 <String "registerAccessoryDeviceInfo()">
	//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
		return false;
	//    3    8:iconst_0        
	//    4    9:ireturn         
	}

	public void registerConnector(SensorConnectorInfo sensorconnectorinfo, ISensorServiceCallback isensorservicecallback)
	{
		LOG.i(SensorService.access$000(), "registerConnector()");
	//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
	//    1    3:ldc1            #154 <String "registerConnector()">
	//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       21
		{
			LOG.e(SensorService.access$000(), "registerConnector() : SensorConnectorInfo is null !!!");
	//    5   12:invokestatic    #22  <Method Class SensorService.access$000()>
	//    6   15:ldc1            #156 <String "registerConnector() : SensorConnectorInfo is null !!!">
	//    7   17:invokestatic    #56  <Method void LOG.e(Class, String)>
			return;
	//    8   20:return          
		}
		if(isensorservicecallback == null)
	//*   9   21:aload_2         
	//*  10   22:ifnonnull       33
			LOG.w(SensorService.access$000(), "registerConnector() : ISensorServiceCallback is null");
	//   11   25:invokestatic    #22  <Method Class SensorService.access$000()>
	//   12   28:ldc1            #158 <String "registerConnector() : ISensorServiceCallback is null">
	//   13   30:invokestatic    #35  <Method void LOG.w(Class, String)>
		if(!AccesscontrolUtil.checkSignature(SensorService.access$100(SensorService.this), AccesscontrolUtil.getCallerPackage(SensorService.access$100(SensorService.this))))
	//*  14   33:aload_0         
	//*  15   34:getfield        #12  <Field SensorService this$0>
	//*  16   37:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  17   40:aload_0         
	//*  18   41:getfield        #12  <Field SensorService this$0>
	//*  19   44:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  20   47:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*  21   50:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*  22   53:iconst_1        
	//*  23   54:icmpeq          66
		{
			LOG.d(SensorService.access$000(), "registerConnector() : Security exception - Caller application not privileged");
	//   24   57:invokestatic    #22  <Method Class SensorService.access$000()>
	//   25   60:ldc1            #160 <String "registerConnector() : Security exception - Caller application not privileged">
	//   26   62:invokestatic    #124 <Method void LOG.d(Class, String)>
			return;
	//   27   65:return          
		} else
		{
			SensorService.access$300(SensorService.this).add(((Object) (sensorconnectorinfo)));
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
		LOG.i(SensorService.access$000(), "releaseAccess()");
	//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
	//    1    3:ldc1            #188 <String "releaseAccess()">
	//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       20
			LOG.w(SensorService.access$000(), "releaseAccess() : SensorConnectorInfo is null");
	//    5   12:invokestatic    #22  <Method Class SensorService.access$000()>
	//    6   15:ldc1            #190 <String "releaseAccess() : SensorConnectorInfo is null">
	//    7   17:invokestatic    #35  <Method void LOG.w(Class, String)>
		if(sensordeviceinfo == null)
	//*   8   20:aload_2         
	//*   9   21:ifnonnull       32
			LOG.w(SensorService.access$000(), "releaseAccess() : SensorDeviceInfo is null");
	//   10   24:invokestatic    #22  <Method Class SensorService.access$000()>
	//   11   27:ldc1            #192 <String "releaseAccess() : SensorDeviceInfo is null">
	//   12   29:invokestatic    #35  <Method void LOG.w(Class, String)>
		if(!AccesscontrolUtil.checkSignature(SensorService.access$100(SensorService.this), AccesscontrolUtil.getCallerPackage(SensorService.access$100(SensorService.this))))
	//*  13   32:aload_0         
	//*  14   33:getfield        #12  <Field SensorService this$0>
	//*  15   36:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  16   39:aload_0         
	//*  17   40:getfield        #12  <Field SensorService this$0>
	//*  18   43:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  19   46:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*  20   49:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*  21   52:iconst_1        
	//*  22   53:icmpeq          65
		{
			LOG.e(SensorService.access$000(), "releaseAccess() : Security exception - Caller application not privileged");
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
			SensorService.access$200(SensorService.this).sendMessage(((Message) (sensorconnectorinfo)));
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
		LOG.i(SensorService.access$000(), "removeListener()");
	//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
	//    1    3:ldc1            #197 <String "removeListener()">
	//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       20
			LOG.w(SensorService.access$000(), "removeListener() : SensorConnectorInfo is null");
	//    5   12:invokestatic    #22  <Method Class SensorService.access$000()>
	//    6   15:ldc1            #199 <String "removeListener() : SensorConnectorInfo is null">
	//    7   17:invokestatic    #35  <Method void LOG.w(Class, String)>
		if(sensordeviceinfo == null)
	//*   8   20:aload_2         
	//*   9   21:ifnonnull       32
			LOG.w(SensorService.access$000(), "removeListener() : SensorDeviceInfo is null");
	//   10   24:invokestatic    #22  <Method Class SensorService.access$000()>
	//   11   27:ldc1            #201 <String "removeListener() : SensorDeviceInfo is null">
	//   12   29:invokestatic    #35  <Method void LOG.w(Class, String)>
		if(!AccesscontrolUtil.checkSignature(SensorService.access$100(SensorService.this), AccesscontrolUtil.getCallerPackage(SensorService.access$100(SensorService.this))))
	//*  13   32:aload_0         
	//*  14   33:getfield        #12  <Field SensorService this$0>
	//*  15   36:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  16   39:aload_0         
	//*  17   40:getfield        #12  <Field SensorService this$0>
	//*  18   43:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  19   46:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*  20   49:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*  21   52:iconst_1        
	//*  22   53:icmpeq          65
		{
			LOG.e(SensorService.access$000(), "removeListener() : Security exception - Caller application not privileged");
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
			SensorService.access$200(SensorService.this).sendMessage(((Message) (sensorconnectorinfo)));
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
		LOG.i(SensorService.access$000(), "requestAccess()");
	//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
	//    1    3:ldc1            #207 <String "requestAccess()">
	//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       20
			LOG.w(SensorService.access$000(), "requestAccess() : SensorConnectorInfo is null");
	//    5   12:invokestatic    #22  <Method Class SensorService.access$000()>
	//    6   15:ldc1            #209 <String "requestAccess() : SensorConnectorInfo is null">
	//    7   17:invokestatic    #35  <Method void LOG.w(Class, String)>
		if(sensordeviceinfo == null)
	//*   8   20:aload_2         
	//*   9   21:ifnonnull       32
			LOG.w(SensorService.access$000(), "requestAccess() : SensorDeviceInfo is null");
	//   10   24:invokestatic    #22  <Method Class SensorService.access$000()>
	//   11   27:ldc1            #211 <String "requestAccess() : SensorDeviceInfo is null">
	//   12   29:invokestatic    #35  <Method void LOG.w(Class, String)>
		if(!AccesscontrolUtil.checkSignature(SensorService.access$100(SensorService.this), AccesscontrolUtil.getCallerPackage(SensorService.access$100(SensorService.this))))
	//*  13   32:aload_0         
	//*  14   33:getfield        #12  <Field SensorService this$0>
	//*  15   36:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  16   39:aload_0         
	//*  17   40:getfield        #12  <Field SensorService this$0>
	//*  18   43:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  19   46:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*  20   49:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*  21   52:iconst_1        
	//*  22   53:icmpeq          65
		{
			LOG.e(SensorService.access$000(), "requestAccess() : Security exception - Caller application not privileged");
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
			SensorService.access$200(SensorService.this).sendMessage(((Message) (sensorconnectorinfo)));
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
		LOG.i(SensorService.access$000(), "startAccessoryDeviceScan()");
	//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
	//    1    3:ldc1            #220 <String "startAccessoryDeviceScan()">
	//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
	//    3    8:return          
	}

	public void stopAccessoryDeviceScan(SensorConnectorInfo sensorconnectorinfo)
	{
		LOG.i(SensorService.access$000(), "stopAccessoryDeviceScan()");
	//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
	//    1    3:ldc1            #224 <String "stopAccessoryDeviceScan()">
	//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
	//    3    8:return          
	}

	public void unregisterAccessoryDeviceInfo(SensorConnectorInfo sensorconnectorinfo, SensorDeviceInfo sensordeviceinfo)
		throws RemoteException
	{
		LOG.i(SensorService.access$000(), "unregisterAccessoryDeviceInfo()");
	//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
	//    1    3:ldc1            #227 <String "unregisterAccessoryDeviceInfo()">
	//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
	//    3    8:return          
	}

	public void unregisterConnector(SensorConnectorInfo sensorconnectorinfo)
	{
		LOG.i(SensorService.access$000(), "unregisterConnector()");
	//    0    0:invokestatic    #22  <Method Class SensorService.access$000()>
	//    1    3:ldc1            #230 <String "unregisterConnector()">
	//    2    5:invokestatic    #30  <Method void LOG.i(Class, String)>
		if(sensorconnectorinfo == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       21
		{
			LOG.e(SensorService.access$000(), "unregisterConnector() : SensorConnectorInfo is null !!!");
	//    5   12:invokestatic    #22  <Method Class SensorService.access$000()>
	//    6   15:ldc1            #232 <String "unregisterConnector() : SensorConnectorInfo is null !!!">
	//    7   17:invokestatic    #56  <Method void LOG.e(Class, String)>
			return;
	//    8   20:return          
		}
		if(!AccesscontrolUtil.checkSignature(SensorService.access$100(SensorService.this), AccesscontrolUtil.getCallerPackage(SensorService.access$100(SensorService.this))))
	//*   9   21:aload_0         
	//*  10   22:getfield        #12  <Field SensorService this$0>
	//*  11   25:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  12   28:aload_0         
	//*  13   29:getfield        #12  <Field SensorService this$0>
	//*  14   32:invokestatic    #41  <Method android.content.Context SensorService.access$100(SensorService)>
	//*  15   35:invokestatic    #47  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*  16   38:invokestatic    #51  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*  17   41:iconst_1        
	//*  18   42:icmpeq          54
		{
			LOG.d(SensorService.access$000(), "unregisterConnector() : Security exception - Caller application not privileged");
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
			SensorService.access$300(SensorService.this).remove(((Object) (sensorconnectorinfo)));
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

	SensorService$1()
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
