// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.manager;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import com.samsung.android.sdk.health.sensor._PlatformSensorDataListener;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.sec.android.service.health.sensor.handler.ProfileHandlerController;
import com.sec.android.service.health.sensor.manager.util.Filter;
import com.sec.android.service.health.util.LOG;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.sec.android.service.health.sensor.manager:
//			BaseSensorManagerListener, ISensorListener

public abstract class BaseSensorManager
	implements BaseSensorManagerListener
{

	public BaseSensorManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mSensorListener = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field ISensorListener mSensorListener>
		mContext = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #28  <Field Context mContext>
		profileHashMap = new ConcurrentHashMap();
	//    8   14:aload_0         
	//    9   15:new             #30  <Class ConcurrentHashMap>
	//   10   18:dup             
	//   11   19:invokespecial   #31  <Method void ConcurrentHashMap()>
	//   12   22:putfield        #33  <Field ConcurrentHashMap profileHashMap>
	//   13   25:return          
	}

	protected void addProfileHandlerController(String s, ProfileHandlerController profilehandlercontroller)
	{
		LOG.d(TAG, (new StringBuilder()).append("addProfileHandlerController deviceId : ").append(s).toString());
	//    0    0:getstatic       #20  <Field Class TAG>
	//    1    3:new             #37  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #38  <Method void StringBuilder()>
	//    4   10:ldc1            #40  <String "addProfileHandlerController deviceId : ">
	//    5   12:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_1         
	//    7   16:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #48  <Method String StringBuilder.toString()>
	//    9   22:invokestatic    #54  <Method void LOG.d(Class, String)>
		profileHashMap.put(((Object) (s)), ((Object) (profilehandlercontroller)));
	//   10   25:aload_0         
	//   11   26:getfield        #33  <Field ConcurrentHashMap profileHashMap>
	//   12   29:aload_1         
	//   13   30:aload_2         
	//   14   31:invokevirtual   #58  <Method Object ConcurrentHashMap.put(Object, Object)>
	//   15   34:pop             
	//   16   35:return          
	}

	public void close(_PrivilegeSensorDevice _pprivilegesensordevice)
	{
		ProfileHandlerController profilehandlercontroller = (ProfileHandlerController)profileHashMap.get(((Object) (_pprivilegesensordevice.getId())));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ConcurrentHashMap profileHashMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #65  <Method String _PrivilegeSensorDevice.getId()>
	//    4    8:invokevirtual   #69  <Method Object ConcurrentHashMap.get(Object)>
	//    5   11:checkcast       #71  <Class ProfileHandlerController>
	//    6   14:astore_2        
		if(profilehandlercontroller != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          46
		{
			profilehandlercontroller.removeDataListener(_pprivilegesensordevice.getId(), Integer.valueOf(_pprivilegesensordevice.getObjectId()));
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #65  <Method String _PrivilegeSensorDevice.getId()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #75  <Method int _PrivilegeSensorDevice.getObjectId()>
	//   14   28:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   15   31:invokevirtual   #85  <Method void ProfileHandlerController.removeDataListener(String, Integer)>
			profileHashMap.remove(((Object) (_pprivilegesensordevice.getId())));
	//   16   34:aload_0         
	//   17   35:getfield        #33  <Field ConcurrentHashMap profileHashMap>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #65  <Method String _PrivilegeSensorDevice.getId()>
	//   20   42:invokevirtual   #88  <Method Object ConcurrentHashMap.remove(Object)>
	//   21   45:pop             
		}
	//   22   46:return          
	}

	public void deinitialize()
	{
		LOG.d(TAG, "deinitialize is called");
	//    0    0:getstatic       #20  <Field Class TAG>
	//    1    3:ldc1            #91  <String "deinitialize is called">
	//    2    5:invokestatic    #54  <Method void LOG.d(Class, String)>
		if(profileHashMap != null)
	//*   3    8:aload_0         
	//*   4    9:getfield        #33  <Field ConcurrentHashMap profileHashMap>
	//*   5   12:ifnull          59
		{
			for(Iterator iterator = profileHashMap.values().iterator(); iterator.hasNext(); ((ProfileHandlerController)iterator.next()).deinitialize());
	//    6   15:aload_0         
	//    7   16:getfield        #33  <Field ConcurrentHashMap profileHashMap>
	//    8   19:invokevirtual   #95  <Method Collection ConcurrentHashMap.values()>
	//    9   22:invokeinterface #101 <Method Iterator Collection.iterator()>
	//   10   27:astore_1        
	//   11   28:aload_1         
	//   12   29:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//   13   34:ifeq            52
	//   14   37:aload_1         
	//   15   38:invokeinterface #111 <Method Object Iterator.next()>
	//   16   43:checkcast       #71  <Class ProfileHandlerController>
	//   17   46:invokevirtual   #113 <Method void ProfileHandlerController.deinitialize()>
	//*  18   49:goto            28
			profileHashMap.clear();
	//   19   52:aload_0         
	//   20   53:getfield        #33  <Field ConcurrentHashMap profileHashMap>
	//   21   56:invokevirtual   #116 <Method void ConcurrentHashMap.clear()>
		}
	//   22   59:return          
	}

	public abstract List getConnectedDevices(Filter filter);

	public ProfileHandlerController getProfileHandlerController(String s)
	{
		return (ProfileHandlerController)profileHashMap.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ConcurrentHashMap profileHashMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #69  <Method Object ConcurrentHashMap.get(Object)>
	//    4    8:checkcast       #71  <Class ProfileHandlerController>
	//    5   11:areturn         
	}

	public void initialize(Context context, ISensorListener isensorlistener)
	{
		mSensorListener = isensorlistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #26  <Field ISensorListener mSensorListener>
		mContext = context;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #28  <Field Context mContext>
	//    6   10:return          
	}

	public abstract boolean isDataTypeSupported(int i);

	public void onDataReceived(Bundle bundle, RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int i, int j)
	{
		LOG.d(TAG, (new StringBuilder()).append("onDataReceived :  processId :").append(j).toString());
	//    0    0:getstatic       #20  <Field Class TAG>
	//    1    3:new             #37  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #38  <Method void StringBuilder()>
	//    4   10:ldc1            #128 <String "onDataReceived :  processId :">
	//    5   12:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:iload           5
	//    7   17:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//    8   20:invokevirtual   #48  <Method String StringBuilder.toString()>
	//    9   23:invokestatic    #54  <Method void LOG.d(Class, String)>
		if(mSensorListener != null)
	//*  10   26:aload_0         
	//*  11   27:getfield        #26  <Field ISensorListener mSensorListener>
	//*  12   30:ifnull          47
			mSensorListener.onDataReceived(bundle, remotecallbacklist, _pprivilegesensordevice, j);
	//   13   33:aload_0         
	//   14   34:getfield        #26  <Field ISensorListener mSensorListener>
	//   15   37:aload_1         
	//   16   38:aload_2         
	//   17   39:aload_3         
	//   18   40:iload           5
	//   19   42:invokeinterface #136 <Method void ISensorListener.onDataReceived(Bundle, RemoteCallbackList, _PrivilegeSensorDevice, int)>
	//   20   47:return          
	}

	public void onDataReceived(Bundle abundle[], RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int i, int j)
	{
		LOG.d(TAG, (new StringBuilder()).append("onDataReceived :  processId :").append(j).toString());
	//    0    0:getstatic       #20  <Field Class TAG>
	//    1    3:new             #37  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #38  <Method void StringBuilder()>
	//    4   10:ldc1            #128 <String "onDataReceived :  processId :">
	//    5   12:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:iload           5
	//    7   17:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//    8   20:invokevirtual   #48  <Method String StringBuilder.toString()>
	//    9   23:invokestatic    #54  <Method void LOG.d(Class, String)>
		if(mSensorListener != null)
	//*  10   26:aload_0         
	//*  11   27:getfield        #26  <Field ISensorListener mSensorListener>
	//*  12   30:ifnull          47
			mSensorListener.onDataReceived(abundle, remotecallbacklist, _pprivilegesensordevice, j);
	//   13   33:aload_0         
	//   14   34:getfield        #26  <Field ISensorListener mSensorListener>
	//   15   37:aload_1         
	//   16   38:aload_2         
	//   17   39:aload_3         
	//   18   40:iload           5
	//   19   42:invokeinterface #142 <Method void ISensorListener.onDataReceived(Bundle[], RemoteCallbackList, _PrivilegeSensorDevice, int)>
	//   20   47:return          
	}

	public void onDataStarted(int i, int j, RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int k, int l)
	{
		LOG.d(TAG, (new StringBuilder()).append("onDataStarted dataType : ").append(i).append(" processId :").append(l).append(" errorCode : ").append(j).toString());
	//    0    0:getstatic       #20  <Field Class TAG>
	//    1    3:new             #37  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #38  <Method void StringBuilder()>
	//    4   10:ldc1            #147 <String "onDataStarted dataType : ">
	//    5   12:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:iload_1         
	//    7   16:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #149 <String " processId :">
	//    9   21:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:iload           6
	//   11   26:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//   12   29:ldc1            #151 <String " errorCode : ">
	//   13   31:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:iload_2         
	//   15   35:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//   16   38:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   17   41:invokestatic    #54  <Method void LOG.d(Class, String)>
		if(mSensorListener != null)
	//*  18   44:aload_0         
	//*  19   45:getfield        #26  <Field ISensorListener mSensorListener>
	//*  20   48:ifnull          69
			mSensorListener.onDataStarted(i, j, remotecallbacklist, _pprivilegesensordevice, k, l);
	//   21   51:aload_0         
	//   22   52:getfield        #26  <Field ISensorListener mSensorListener>
	//   23   55:iload_1         
	//   24   56:iload_2         
	//   25   57:aload_3         
	//   26   58:aload           4
	//   27   60:iload           5
	//   28   62:iload           6
	//   29   64:invokeinterface #153 <Method void ISensorListener.onDataStarted(int, int, RemoteCallbackList, _PrivilegeSensorDevice, int, int)>
	//   30   69:return          
	}

	public void onDataStopped(int i, int j, RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int k, int l)
	{
		LOG.d(TAG, (new StringBuilder()).append("onDataStopped dataType : ").append(i).append(" errorCode : ").append(j).append(" processId :").append(l).toString());
	//    0    0:getstatic       #20  <Field Class TAG>
	//    1    3:new             #37  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #38  <Method void StringBuilder()>
	//    4   10:ldc1            #157 <String "onDataStopped dataType : ">
	//    5   12:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:iload_1         
	//    7   16:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #151 <String " errorCode : ">
	//    9   21:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:iload_2         
	//   11   25:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//   12   28:ldc1            #149 <String " processId :">
	//   13   30:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:iload           6
	//   15   35:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//   16   38:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   17   41:invokestatic    #54  <Method void LOG.d(Class, String)>
		if(mSensorListener != null)
	//*  18   44:aload_0         
	//*  19   45:getfield        #26  <Field ISensorListener mSensorListener>
	//*  20   48:ifnull          69
			mSensorListener.onDataStopped(i, j, remotecallbacklist, _pprivilegesensordevice, k, l);
	//   21   51:aload_0         
	//   22   52:getfield        #26  <Field ISensorListener mSensorListener>
	//   23   55:iload_1         
	//   24   56:iload_2         
	//   25   57:aload_3         
	//   26   58:aload           4
	//   27   60:iload           5
	//   28   62:iload           6
	//   29   64:invokeinterface #159 <Method void ISensorListener.onDataStopped(int, int, RemoteCallbackList, _PrivilegeSensorDevice, int, int)>
	//   30   69:return          
	}

	public abstract int registerListener(_PrivilegeSensorDevice _pprivilegesensordevice, Integer integer, _PlatformSensorDataListener _pplatformsensordatalistener);

	protected void removeProfileHandlerController(String s)
	{
		LOG.d(TAG, (new StringBuilder()).append("removeProfileHandlerController deviceId : ").append(s).toString());
	//    0    0:getstatic       #20  <Field Class TAG>
	//    1    3:new             #37  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #38  <Method void StringBuilder()>
	//    4   10:ldc1            #165 <String "removeProfileHandlerController deviceId : ">
	//    5   12:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_1         
	//    7   16:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #48  <Method String StringBuilder.toString()>
	//    9   22:invokestatic    #54  <Method void LOG.d(Class, String)>
		profileHashMap.remove(((Object) (s)));
	//   10   25:aload_0         
	//   11   26:getfield        #33  <Field ConcurrentHashMap profileHashMap>
	//   12   29:aload_1         
	//   13   30:invokevirtual   #88  <Method Object ConcurrentHashMap.remove(Object)>
	//   14   33:pop             
	//   15   34:return          
	}

	public abstract int unregisterListener(_PrivilegeSensorDevice _pprivilegesensordevice, Integer integer);

	protected static final Class TAG = com/sec/android/service/health/sensor/manager/BaseSensorManager;
	protected Context mContext;
	protected ISensorListener mSensorListener;
	private ConcurrentHashMap profileHashMap;

	static 
	{
	//    0    0:ldc1            #2   <Class BaseSensorManager>
	//    1    2:putstatic       #20  <Field Class TAG>
	//*   2    5:return          
	}
}
