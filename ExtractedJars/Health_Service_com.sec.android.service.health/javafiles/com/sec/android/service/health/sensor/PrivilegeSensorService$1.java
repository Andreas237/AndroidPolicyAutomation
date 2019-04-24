// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor;

import android.os.RemoteException;
import com.samsung.android.sdk.health.sensor._PlatformSensorDataListener;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.sec.android.service.health.cp.accesscontrol.AccesscontrolUtil;
import com.sec.android.service.health.sensor.manager.BaseSensorManager;
import com.sec.android.service.health.sensor.manager.util.Filter;
import com.sec.android.service.health.util.LOG;
import java.util.List;

// Referenced classes of package com.sec.android.service.health.sensor:
//			PrivilegeSensorService

class PrivilegeSensorService$1 extends com.samsung.android.sdk.health.sensor.ub
{

	public int checkAvailability(int i, int j, int k)
		throws RemoteException
	{
		if(!AccesscontrolUtil.checkSignature(((android.content.Context) (PrivilegeSensorService.this)), AccesscontrolUtil.getCallerPackage(((android.content.Context) (PrivilegeSensorService.this)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field PrivilegeSensorService this$0>
	//*   2    4:aload_0         
	//*   3    5:getfield        #12  <Field PrivilegeSensorService this$0>
	//*   4    8:invokestatic    #26  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*   5   11:invokestatic    #30  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*   6   14:ifne            27
			LOG.d(PrivilegeSensorService.access$100(), "[SensorListener] checkAvailability : Security exception - Caller application not privileged");
	//    7   17:invokestatic    #34  <Method Class PrivilegeSensorService.access$100()>
	//    8   20:ldc1            #36  <String "[SensorListener] checkAvailability : Security exception - Caller application not privileged">
	//    9   22:invokestatic    #42  <Method void LOG.d(Class, String)>
		else
	//*  10   25:iconst_1        
	//*  11   26:ireturn         
		if(PrivilegeSensorService.access$400(PrivilegeSensorService.this, i, k))
	//*  12   27:aload_0         
	//*  13   28:getfield        #12  <Field PrivilegeSensorService this$0>
	//*  14   31:iload_1         
	//*  15   32:iload_3         
	//*  16   33:invokestatic    #46  <Method boolean PrivilegeSensorService.access$400(PrivilegeSensorService, int, int)>
	//*  17   36:ifeq            25
			return 0;
	//   18   39:iconst_0        
	//   19   40:ireturn         
		return 1;
	}

	public void close(_PrivilegeSensorDevice _pprivilegesensordevice)
		throws RemoteException
	{
		if(!AccesscontrolUtil.checkSignature(((android.content.Context) (PrivilegeSensorService.this)), AccesscontrolUtil.getCallerPackage(((android.content.Context) (PrivilegeSensorService.this)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field PrivilegeSensorService this$0>
	//*   2    4:aload_0         
	//*   3    5:getfield        #12  <Field PrivilegeSensorService this$0>
	//*   4    8:invokestatic    #26  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*   5   11:invokestatic    #30  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*   6   14:ifne            26
		{
			LOG.d(PrivilegeSensorService.access$100(), "[SensorListener] close : Security exception - Caller application not privileged");
	//    7   17:invokestatic    #34  <Method Class PrivilegeSensorService.access$100()>
	//    8   20:ldc1            #51  <String "[SensorListener] close : Security exception - Caller application not privileged">
	//    9   22:invokestatic    #42  <Method void LOG.d(Class, String)>
			return;
	//   10   25:return          
		} else
		{
			PrivilegeSensorService.access$500(PrivilegeSensorService.this, _pprivilegesensordevice.getConnectivityType()).close(_pprivilegesensordevice);
	//   11   26:aload_0         
	//   12   27:getfield        #12  <Field PrivilegeSensorService this$0>
	//   13   30:aload_1         
	//   14   31:invokevirtual   #57  <Method int _PrivilegeSensorDevice.getConnectivityType()>
	//   15   34:invokestatic    #61  <Method BaseSensorManager PrivilegeSensorService.access$500(PrivilegeSensorService, int)>
	//   16   37:aload_1         
	//   17   38:invokevirtual   #65  <Method void BaseSensorManager.close(_PrivilegeSensorDevice)>
			return;
	//   18   41:return          
		}
	}

	public int getAPIVersion()
		throws RemoteException
	{
		if(!AccesscontrolUtil.checkSignature(((android.content.Context) (PrivilegeSensorService.this)), AccesscontrolUtil.getCallerPackage(((android.content.Context) (PrivilegeSensorService.this)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field PrivilegeSensorService this$0>
	//*   2    4:aload_0         
	//*   3    5:getfield        #12  <Field PrivilegeSensorService this$0>
	//*   4    8:invokestatic    #26  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*   5   11:invokestatic    #30  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*   6   14:ifne            27
		{
			LOG.d(PrivilegeSensorService.access$100(), "[SensorListener] getAPIVersion : Security exception - Caller application not privileged");
	//    7   17:invokestatic    #34  <Method Class PrivilegeSensorService.access$100()>
	//    8   20:ldc1            #68  <String "[SensorListener] getAPIVersion : Security exception - Caller application not privileged">
	//    9   22:invokestatic    #42  <Method void LOG.d(Class, String)>
			return 0;
	//   10   25:iconst_0        
	//   11   26:ireturn         
		} else
		{
			return 1;
	//   12   27:iconst_1        
	//   13   28:ireturn         
		}
	}

	public List getConnectedDevices(int i, int j, int k)
		throws RemoteException
	{
		if(!AccesscontrolUtil.checkSignature(((android.content.Context) (PrivilegeSensorService.this)), AccesscontrolUtil.getCallerPackage(((android.content.Context) (PrivilegeSensorService.this)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field PrivilegeSensorService this$0>
	//*   2    4:aload_0         
	//*   3    5:getfield        #12  <Field PrivilegeSensorService this$0>
	//*   4    8:invokestatic    #26  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*   5   11:invokestatic    #30  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*   6   14:ifne            27
		{
			LOG.d(PrivilegeSensorService.access$100(), "[SensorListener] getConnectedDevices : Security exception - Caller application not privileged");
	//    7   17:invokestatic    #34  <Method Class PrivilegeSensorService.access$100()>
	//    8   20:ldc1            #72  <String "[SensorListener] getConnectedDevices : Security exception - Caller application not privileged">
	//    9   22:invokestatic    #42  <Method void LOG.d(Class, String)>
			return null;
	//   10   25:aconst_null     
	//   11   26:areturn         
		} else
		{
			return PrivilegeSensorService.access$500(PrivilegeSensorService.this, i).getConnectedDevices(new Filter(j, k, ((String) (null))));
	//   12   27:aload_0         
	//   13   28:getfield        #12  <Field PrivilegeSensorService this$0>
	//   14   31:iload_1         
	//   15   32:invokestatic    #61  <Method BaseSensorManager PrivilegeSensorService.access$500(PrivilegeSensorService, int)>
	//   16   35:new             #74  <Class Filter>
	//   17   38:dup             
	//   18   39:iload_2         
	//   19   40:iload_3         
	//   20   41:aconst_null     
	//   21   42:invokespecial   #77  <Method void Filter(int, int, String)>
	//   22   45:invokevirtual   #80  <Method List BaseSensorManager.getConnectedDevices(Filter)>
	//   23   48:areturn         
		}
	}

	public boolean registerListener(_PrivilegeSensorDevice _pprivilegesensordevice, _PlatformSensorDataListener _pplatformsensordatalistener)
		throws RemoteException
	{
		if(!AccesscontrolUtil.checkSignature(((android.content.Context) (PrivilegeSensorService.this)), AccesscontrolUtil.getCallerPackage(((android.content.Context) (PrivilegeSensorService.this)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field PrivilegeSensorService this$0>
	//*   2    4:aload_0         
	//*   3    5:getfield        #12  <Field PrivilegeSensorService this$0>
	//*   4    8:invokestatic    #26  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*   5   11:invokestatic    #30  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*   6   14:ifne            27
			LOG.d(PrivilegeSensorService.access$100(), "[SensorListener] registerListener : Security exception - Caller application not privileged");
	//    7   17:invokestatic    #34  <Method Class PrivilegeSensorService.access$100()>
	//    8   20:ldc1            #86  <String "[SensorListener] registerListener : Security exception - Caller application not privileged">
	//    9   22:invokestatic    #42  <Method void LOG.d(Class, String)>
		else
	//*  10   25:iconst_0        
	//*  11   26:ireturn         
		if(PrivilegeSensorService.access$500(PrivilegeSensorService.this, _pprivilegesensordevice.getConnectivityType()).registerListener(_pprivilegesensordevice, Integer.valueOf(_pprivilegesensordevice.getObjectId()), _pplatformsensordatalistener) == 0)
	//*  12   27:aload_0         
	//*  13   28:getfield        #12  <Field PrivilegeSensorService this$0>
	//*  14   31:aload_1         
	//*  15   32:invokevirtual   #57  <Method int _PrivilegeSensorDevice.getConnectivityType()>
	//*  16   35:invokestatic    #61  <Method BaseSensorManager PrivilegeSensorService.access$500(PrivilegeSensorService, int)>
	//*  17   38:aload_1         
	//*  18   39:aload_1         
	//*  19   40:invokevirtual   #89  <Method int _PrivilegeSensorDevice.getObjectId()>
	//*  20   43:invokestatic    #95  <Method Integer Integer.valueOf(int)>
	//*  21   46:aload_2         
	//*  22   47:invokevirtual   #98  <Method int BaseSensorManager.registerListener(_PrivilegeSensorDevice, Integer, _PlatformSensorDataListener)>
	//*  23   50:ifne            25
			return true;
	//   24   53:iconst_1        
	//   25   54:ireturn         
		return false;
	}

	public boolean unregisterListener(_PrivilegeSensorDevice _pprivilegesensordevice)
		throws RemoteException
	{
		if(!AccesscontrolUtil.checkSignature(((android.content.Context) (PrivilegeSensorService.this)), AccesscontrolUtil.getCallerPackage(((android.content.Context) (PrivilegeSensorService.this)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field PrivilegeSensorService this$0>
	//*   2    4:aload_0         
	//*   3    5:getfield        #12  <Field PrivilegeSensorService this$0>
	//*   4    8:invokestatic    #26  <Method String AccesscontrolUtil.getCallerPackage(android.content.Context)>
	//*   5   11:invokestatic    #30  <Method boolean AccesscontrolUtil.checkSignature(android.content.Context, String)>
	//*   6   14:ifne            27
			LOG.d(PrivilegeSensorService.access$100(), "[SensorListener] unregisterListener : Security exception - Caller application not privileged");
	//    7   17:invokestatic    #34  <Method Class PrivilegeSensorService.access$100()>
	//    8   20:ldc1            #102 <String "[SensorListener] unregisterListener : Security exception - Caller application not privileged">
	//    9   22:invokestatic    #42  <Method void LOG.d(Class, String)>
		else
	//*  10   25:iconst_0        
	//*  11   26:ireturn         
		if(PrivilegeSensorService.access$500(PrivilegeSensorService.this, _pprivilegesensordevice.getConnectivityType()).unregisterListener(_pprivilegesensordevice, Integer.valueOf(_pprivilegesensordevice.getObjectId())) == 0)
	//*  12   27:aload_0         
	//*  13   28:getfield        #12  <Field PrivilegeSensorService this$0>
	//*  14   31:aload_1         
	//*  15   32:invokevirtual   #57  <Method int _PrivilegeSensorDevice.getConnectivityType()>
	//*  16   35:invokestatic    #61  <Method BaseSensorManager PrivilegeSensorService.access$500(PrivilegeSensorService, int)>
	//*  17   38:aload_1         
	//*  18   39:aload_1         
	//*  19   40:invokevirtual   #89  <Method int _PrivilegeSensorDevice.getObjectId()>
	//*  20   43:invokestatic    #95  <Method Integer Integer.valueOf(int)>
	//*  21   46:invokevirtual   #105 <Method int BaseSensorManager.unregisterListener(_PrivilegeSensorDevice, Integer)>
	//*  22   49:ifne            25
			return true;
	//   23   52:iconst_1        
	//   24   53:ireturn         
		return false;
	}

	final PrivilegeSensorService this$0;

	PrivilegeSensorService$1()
	{
		this$0 = PrivilegeSensorService.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field PrivilegeSensorService this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void com.samsung.android.sdk.health.sensor._PlatformSensorService$Stub()>
	//    5    9:return          
	}
}
