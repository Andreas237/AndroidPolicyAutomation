// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.handler;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import com.samsung.android.sdk.health.sensor._PlatformSensorDataListener;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerInterface;
import com.samsung.android.sdk.health.sensor.handler.PrivilegeSensorProfileHandlerListener;
import com.sec.android.service.health.sensor.PrivilegeSensorService;
import com.sec.android.service.health.sensor.manager.BaseSensorManagerListener;
import com.sec.android.service.health.sensor.manager.HealthRemoteCallbackList;
import com.sec.android.service.health.util.LOG;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ProfileHandlerController
	implements PrivilegeSensorProfileHandlerListener
{

	public ProfileHandlerController(_PrivilegeSensorDevice _pprivilegesensordevice, PrivilegeSensorProfileHandlerInterface privilegesensorprofilehandlerinterface, BaseSensorManagerListener basesensormanagerlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		handler = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
		listener = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #54  <Field BaseSensorManagerListener listener>
		dataListenerHashMap = new ConcurrentHashMap();
	//    8   14:aload_0         
	//    9   15:new             #56  <Class ConcurrentHashMap>
	//   10   18:dup             
	//   11   19:invokespecial   #57  <Method void ConcurrentHashMap()>
	//   12   22:putfield        #59  <Field ConcurrentHashMap dataListenerHashMap>
		mDataRecord = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #61  <Field boolean mDataRecord>
		mDataType = -1;
	//   16   30:aload_0         
	//   17   31:iconst_m1       
	//   18   32:putfield        #63  <Field int mDataType>
		mcontrollingDevObjId = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #65  <Field Integer mcontrollingDevObjId>
		mProcessId = -1;
	//   22   40:aload_0         
	//   23   41:iconst_m1       
	//   24   42:putfield        #67  <Field int mProcessId>
		mState = 0;
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:putfield        #69  <Field int mState>
		uniqueKey = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #71  <Field String uniqueKey>
		mRemoteCallbackDied = new com.sec.android.service.health.sensor.manager.HealthRemoteCallbackList.IHealthRemoteCallbackDiedListener() {

			public void remoteCallbackDied(_PrivilegeSensorDevice _pprivilegesensordevice1, Object obj)
			{
				if(obj instanceof Integer)
			//*   0    0:aload_2         
			//*   1    1:instanceof      #23  <Class Integer>
			//*   2    4:ifeq            32
					LOG.d(ProfileHandlerController.TAG, (new StringBuilder()).append("RemoteCallbackDied :").append(obj).toString());
			//    3    7:invokestatic    #27  <Method Class ProfileHandlerController.access$000()>
			//    4   10:new             #29  <Class StringBuilder>
			//    5   13:dup             
			//    6   14:invokespecial   #30  <Method void StringBuilder()>
			//    7   17:ldc1            #32  <String "RemoteCallbackDied :">
			//    8   19:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
			//    9   22:aload_2         
			//   10   23:invokevirtual   #39  <Method StringBuilder StringBuilder.append(Object)>
			//   11   26:invokevirtual   #43  <Method String StringBuilder.toString()>
			//   12   29:invokestatic    #49  <Method void LOG.d(Class, String)>
			//   13   32:return          
			}

			final ProfileHandlerController this$0;

			
			{
				this$0 = ProfileHandlerController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ProfileHandlerController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   31   55:aload_0         
	//   32   56:new             #8   <Class ProfileHandlerController$1>
	//   33   59:dup             
	//   34   60:aload_0         
	//   35   61:invokespecial   #74  <Method void ProfileHandlerController$1(ProfileHandlerController)>
	//   36   64:putfield        #76  <Field com.sec.android.service.health.sensor.manager.HealthRemoteCallbackList$IHealthRemoteCallbackDiedListener mRemoteCallbackDied>
		handler = privilegesensorprofilehandlerinterface;
	//   37   67:aload_0         
	//   38   68:aload_2         
	//   39   69:putfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
		device = _pprivilegesensordevice;
	//   40   72:aload_0         
	//   41   73:aload_1         
	//   42   74:putfield        #78  <Field _PrivilegeSensorDevice device>
		listener = basesensormanagerlistener;
	//   43   77:aload_0         
	//   44   78:aload_3         
	//   45   79:putfield        #54  <Field BaseSensorManagerListener listener>
	//   46   82:return          
	}

	private RemoteCallbackList getRemoteEventCallBackList(String s)
	{
		return (RemoteCallbackList)dataListenerHashMap.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ConcurrentHashMap dataListenerHashMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #86  <Method Object ConcurrentHashMap.get(Object)>
	//    4    8:checkcast       #88  <Class RemoteCallbackList>
	//    5   11:areturn         
	}

	private _PlatformSensorDataListener getSensorDataListener(String s, int i)
	{
		Object obj;
		RemoteCallbackList remotecallbacklist;
		remotecallbacklist = getRemoteEventCallBackList(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #94  <Method RemoteCallbackList getRemoteEventCallBackList(String)>
	//    3    5:astore          6
		obj = null;
	//    4    7:aconst_null     
	//    5    8:astore          4
		if(remotecallbacklist == null)
	//*   6   10:aload           6
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		Object obj1 = PrivilegeSensorService.beginBroadcast;
	//   10   17:getstatic       #100 <Field Object PrivilegeSensorService.beginBroadcast>
	//   11   20:astore          5
		obj1;
	//   12   22:aload           5
		JVM INSTR monitorenter ;
	//   13   24:monitorenter    
		remotecallbacklist.beginBroadcast();
	//   14   25:aload           6
	//   15   27:invokevirtual   #103 <Method int RemoteCallbackList.beginBroadcast()>
	//   16   30:pop             
		int j = 0;
	//   17   31:iconst_0        
	//   18   32:istore_3        
_L2:
		s = ((String) (obj));
	//   19   33:aload           4
	//   20   35:astore_1        
		if(j >= remotecallbacklist.getRegisteredCallbackCount())
			break MISSING_BLOCK_LABEL_86;
	//   21   36:iload_3         
	//   22   37:aload           6
	//   23   39:invokevirtual   #106 <Method int RemoteCallbackList.getRegisteredCallbackCount()>
	//   24   42:icmpge          86
		s = ((String) (remotecallbacklist.getBroadcastCookie(j)));
	//   25   45:aload           6
	//   26   47:iload_3         
	//   27   48:invokevirtual   #110 <Method Object RemoteCallbackList.getBroadcastCookie(int)>
	//   28   51:astore_1        
		if(s == null)
	//*  29   52:aload_1         
	//*  30   53:ifnonnull       59
			break MISSING_BLOCK_LABEL_102;
	//   31   56:goto            102
		s = ((String) ((Integer)s));
	//   32   59:aload_1         
	//   33   60:checkcast       #112 <Class Integer>
	//   34   63:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_102;
	//   35   64:aload_1         
	//   36   65:ifnull          102
		if(((Integer) (s)).intValue() != i)
			break MISSING_BLOCK_LABEL_102;
	//   37   68:aload_1         
	//   38   69:invokevirtual   #115 <Method int Integer.intValue()>
	//   39   72:iload_2         
	//   40   73:icmpne          102
		s = ((String) ((_PlatformSensorDataListener)remotecallbacklist.getBroadcastItem(j)));
	//   41   76:aload           6
	//   42   78:iload_3         
	//   43   79:invokevirtual   #119 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   44   82:checkcast       #121 <Class _PlatformSensorDataListener>
	//   45   85:astore_1        
		remotecallbacklist.finishBroadcast();
	//   46   86:aload           6
	//   47   88:invokevirtual   #124 <Method void RemoteCallbackList.finishBroadcast()>
		obj1;
	//   48   91:aload           5
		JVM INSTR monitorexit ;
	//   49   93:monitorexit     
		return ((_PlatformSensorDataListener) (s));
	//   50   94:aload_1         
	//   51   95:areturn         
		s;
	//   52   96:astore_1        
		obj1;
	//   53   97:aload           5
		JVM INSTR monitorexit ;
	//   54   99:monitorexit     
		throw s;
	//   55  100:aload_1         
	//   56  101:athrow          
		j++;
	//   57  102:iload_3         
	//   58  103:iconst_1        
	//   59  104:iadd            
	//   60  105:istore_3        
		if(true) goto _L2; else goto _L1
	//   61  106:goto            33
_L1:
	}

	public void addDataListener(Integer integer, _PlatformSensorDataListener _pplatformsensordatalistener)
	{
		LOG.d(TAG, (new StringBuilder()).append("addDataListener() devObjId : ").append(((Object) (integer))).toString());
	//    0    0:getstatic       #45  <Field Class TAG>
	//    1    3:new             #128 <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #129 <Method void StringBuilder()>
	//    4   10:ldc1            #131 <String "addDataListener() devObjId : ">
	//    5   12:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_1         
	//    7   16:invokevirtual   #138 <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:invokevirtual   #142 <Method String StringBuilder.toString()>
	//    9   22:invokestatic    #148 <Method void LOG.d(Class, String)>
		LOG.d(TAG, (new StringBuilder()).append("addingDataListener() binderId : ").append(((Object) (_pplatformsensordatalistener.asBinder())).hashCode()).toString());
	//   10   25:getstatic       #45  <Field Class TAG>
	//   11   28:new             #128 <Class StringBuilder>
	//   12   31:dup             
	//   13   32:invokespecial   #129 <Method void StringBuilder()>
	//   14   35:ldc1            #150 <String "addingDataListener() binderId : ">
	//   15   37:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   16   40:aload_2         
	//   17   41:invokeinterface #154 <Method android.os.IBinder _PlatformSensorDataListener.asBinder()>
	//   18   46:invokevirtual   #157 <Method int Object.hashCode()>
	//   19   49:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   20   52:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   21   55:invokestatic    #148 <Method void LOG.d(Class, String)>
		LOG.d(TAG, (new StringBuilder()).append("addSensorEventListener deviceId: ").append(device.getId()).toString());
	//   22   58:getstatic       #45  <Field Class TAG>
	//   23   61:new             #128 <Class StringBuilder>
	//   24   64:dup             
	//   25   65:invokespecial   #129 <Method void StringBuilder()>
	//   26   68:ldc1            #162 <String "addSensorEventListener deviceId: ">
	//   27   70:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   28   73:aload_0         
	//   29   74:getfield        #78  <Field _PrivilegeSensorDevice device>
	//   30   77:invokevirtual   #167 <Method String _PrivilegeSensorDevice.getId()>
	//   31   80:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   32   83:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   33   86:invokestatic    #148 <Method void LOG.d(Class, String)>
		Object obj = ((Object) ((HealthRemoteCallbackList)dataListenerHashMap.get(((Object) (device.getId())))));
	//   34   89:aload_0         
	//   35   90:getfield        #59  <Field ConcurrentHashMap dataListenerHashMap>
	//   36   93:aload_0         
	//   37   94:getfield        #78  <Field _PrivilegeSensorDevice device>
	//   38   97:invokevirtual   #167 <Method String _PrivilegeSensorDevice.getId()>
	//   39  100:invokevirtual   #86  <Method Object ConcurrentHashMap.get(Object)>
	//   40  103:checkcast       #169 <Class HealthRemoteCallbackList>
	//   41  106:astore          4
		HealthRemoteCallbackList healthremotecallbacklist = ((HealthRemoteCallbackList) (obj));
	//   42  108:aload           4
	//   43  110:astore_3        
		if(obj == null)
	//*  44  111:aload           4
	//*  45  113:ifnonnull       163
		{
			LOG.d(TAG, (new StringBuilder()).append("addSensorEventListener RemotecallBackListAdded created with device : ").append(device.getName()).toString());
	//   46  116:getstatic       #45  <Field Class TAG>
	//   47  119:new             #128 <Class StringBuilder>
	//   48  122:dup             
	//   49  123:invokespecial   #129 <Method void StringBuilder()>
	//   50  126:ldc1            #171 <String "addSensorEventListener RemotecallBackListAdded created with device : ">
	//   51  128:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   52  131:aload_0         
	//   53  132:getfield        #78  <Field _PrivilegeSensorDevice device>
	//   54  135:invokevirtual   #174 <Method String _PrivilegeSensorDevice.getName()>
	//   55  138:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   56  141:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   57  144:invokestatic    #148 <Method void LOG.d(Class, String)>
			healthremotecallbacklist = new HealthRemoteCallbackList(mRemoteCallbackDied, device);
	//   58  147:new             #169 <Class HealthRemoteCallbackList>
	//   59  150:dup             
	//   60  151:aload_0         
	//   61  152:getfield        #76  <Field com.sec.android.service.health.sensor.manager.HealthRemoteCallbackList$IHealthRemoteCallbackDiedListener mRemoteCallbackDied>
	//   62  155:aload_0         
	//   63  156:getfield        #78  <Field _PrivilegeSensorDevice device>
	//   64  159:invokespecial   #177 <Method void HealthRemoteCallbackList(com.sec.android.service.health.sensor.manager.HealthRemoteCallbackList$IHealthRemoteCallbackDiedListener, _PrivilegeSensorDevice)>
	//   65  162:astore_3        
		}
		obj = ((Object) (getSensorDataListener(device.getId(), integer.intValue())));
	//   66  163:aload_0         
	//   67  164:aload_0         
	//   68  165:getfield        #78  <Field _PrivilegeSensorDevice device>
	//   69  168:invokevirtual   #167 <Method String _PrivilegeSensorDevice.getId()>
	//   70  171:aload_1         
	//   71  172:invokevirtual   #115 <Method int Integer.intValue()>
	//   72  175:invokespecial   #179 <Method _PlatformSensorDataListener getSensorDataListener(String, int)>
	//   73  178:astore          4
		if(obj != null)
	//*  74  180:aload           4
	//*  75  182:ifnull          192
			healthremotecallbacklist.unregister(((android.os.IInterface) (obj)));
	//   76  185:aload_3         
	//   77  186:aload           4
	//   78  188:invokevirtual   #183 <Method boolean HealthRemoteCallbackList.unregister(android.os.IInterface)>
	//   79  191:pop             
		healthremotecallbacklist.register(((android.os.IInterface) (_pplatformsensordatalistener)), ((Object) (integer)));
	//   80  192:aload_3         
	//   81  193:aload_2         
	//   82  194:aload_1         
	//   83  195:invokevirtual   #187 <Method boolean HealthRemoteCallbackList.register(android.os.IInterface, Object)>
	//   84  198:pop             
		LOG.d(TAG, (new StringBuilder()).append("addDataListener :  Registered listner Count:").append(healthremotecallbacklist.getRegisteredCallbackCount()).toString());
	//   85  199:getstatic       #45  <Field Class TAG>
	//   86  202:new             #128 <Class StringBuilder>
	//   87  205:dup             
	//   88  206:invokespecial   #129 <Method void StringBuilder()>
	//   89  209:ldc1            #189 <String "addDataListener :  Registered listner Count:">
	//   90  211:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   91  214:aload_3         
	//   92  215:invokevirtual   #190 <Method int HealthRemoteCallbackList.getRegisteredCallbackCount()>
	//   93  218:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   94  221:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   95  224:invokestatic    #148 <Method void LOG.d(Class, String)>
		dataListenerHashMap.put(((Object) (device.getId())), ((Object) (healthremotecallbacklist)));
	//   96  227:aload_0         
	//   97  228:getfield        #59  <Field ConcurrentHashMap dataListenerHashMap>
	//   98  231:aload_0         
	//   99  232:getfield        #78  <Field _PrivilegeSensorDevice device>
	//  100  235:invokevirtual   #167 <Method String _PrivilegeSensorDevice.getId()>
	//  101  238:aload_3         
	//  102  239:invokevirtual   #194 <Method Object ConcurrentHashMap.put(Object, Object)>
	//  103  242:pop             
	//  104  243:return          
	}

	public void deinitialize()
	{
		if(handler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//*   2    4:ifnull          16
			handler.deinitialize();
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//    5   11:invokeinterface #199 <Method void PrivilegeSensorProfileHandlerInterface.deinitialize()>
	//    6   16:return          
	}

	public void initiallize(Context context, Object obj)
	{
		if(handler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//*   2    4:ifnull          24
			handler.initialize(context, ((PrivilegeSensorProfileHandlerListener) (this)), device, obj);
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #78  <Field _PrivilegeSensorDevice device>
	//    9   17:aload_2         
	//   10   18:invokeinterface #205 <Method int PrivilegeSensorProfileHandlerInterface.initialize(Context, PrivilegeSensorProfileHandlerListener, _PrivilegeSensorDevice, Object)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void onDataReceived(int i, Bundle bundle)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(listener != null && handler != null && mcontrollingDevObjId != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #54  <Field BaseSensorManagerListener listener>
	//*   4    6:ifnull          78
	//*   5    9:aload_0         
	//*   6   10:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//*   7   13:ifnull          78
	//*   8   16:aload_0         
	//*   9   17:getfield        #65  <Field Integer mcontrollingDevObjId>
	//*  10   20:ifnull          78
		{
			LOG.d(TAG, "onDataReceived()");
	//   11   23:getstatic       #45  <Field Class TAG>
	//   12   26:ldc1            #209 <String "onDataReceived()">
	//   13   28:invokestatic    #148 <Method void LOG.d(Class, String)>
			listener.onDataReceived(bundle, (RemoteCallbackList)dataListenerHashMap.get(((Object) (device.getId()))), handler.getDevice(), mcontrollingDevObjId.intValue(), mProcessId);
	//   14   31:aload_0         
	//   15   32:getfield        #54  <Field BaseSensorManagerListener listener>
	//   16   35:aload_2         
	//   17   36:aload_0         
	//   18   37:getfield        #59  <Field ConcurrentHashMap dataListenerHashMap>
	//   19   40:aload_0         
	//   20   41:getfield        #78  <Field _PrivilegeSensorDevice device>
	//   21   44:invokevirtual   #167 <Method String _PrivilegeSensorDevice.getId()>
	//   22   47:invokevirtual   #86  <Method Object ConcurrentHashMap.get(Object)>
	//   23   50:checkcast       #88  <Class RemoteCallbackList>
	//   24   53:aload_0         
	//   25   54:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//   26   57:invokeinterface #213 <Method _PrivilegeSensorDevice PrivilegeSensorProfileHandlerInterface.getDevice()>
	//   27   62:aload_0         
	//   28   63:getfield        #65  <Field Integer mcontrollingDevObjId>
	//   29   66:invokevirtual   #115 <Method int Integer.intValue()>
	//   30   69:aload_0         
	//   31   70:getfield        #67  <Field int mProcessId>
	//   32   73:invokeinterface #218 <Method void BaseSensorManagerListener.onDataReceived(Bundle, RemoteCallbackList, _PrivilegeSensorDevice, int, int)>
		}
		this;
	//   33   78:aload_0         
		JVM INSTR monitorexit ;
	//   34   79:monitorexit     
		return;
	//   35   80:return          
		bundle;
	//   36   81:astore_2        
		this;
	//   37   82:aload_0         
		JVM INSTR monitorexit ;
	//   38   83:monitorexit     
		throw bundle;
	//   39   84:aload_2         
	//   40   85:athrow          
	}

	public void onDataReceived(int i, Bundle abundle[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(listener != null && handler != null && mcontrollingDevObjId != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #54  <Field BaseSensorManagerListener listener>
	//*   4    6:ifnull          78
	//*   5    9:aload_0         
	//*   6   10:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//*   7   13:ifnull          78
	//*   8   16:aload_0         
	//*   9   17:getfield        #65  <Field Integer mcontrollingDevObjId>
	//*  10   20:ifnull          78
		{
			LOG.d(TAG, "onDataReceived()");
	//   11   23:getstatic       #45  <Field Class TAG>
	//   12   26:ldc1            #209 <String "onDataReceived()">
	//   13   28:invokestatic    #148 <Method void LOG.d(Class, String)>
			listener.onDataReceived(abundle, (RemoteCallbackList)dataListenerHashMap.get(((Object) (device.getId()))), handler.getDevice(), mcontrollingDevObjId.intValue(), mProcessId);
	//   14   31:aload_0         
	//   15   32:getfield        #54  <Field BaseSensorManagerListener listener>
	//   16   35:aload_2         
	//   17   36:aload_0         
	//   18   37:getfield        #59  <Field ConcurrentHashMap dataListenerHashMap>
	//   19   40:aload_0         
	//   20   41:getfield        #78  <Field _PrivilegeSensorDevice device>
	//   21   44:invokevirtual   #167 <Method String _PrivilegeSensorDevice.getId()>
	//   22   47:invokevirtual   #86  <Method Object ConcurrentHashMap.get(Object)>
	//   23   50:checkcast       #88  <Class RemoteCallbackList>
	//   24   53:aload_0         
	//   25   54:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//   26   57:invokeinterface #213 <Method _PrivilegeSensorDevice PrivilegeSensorProfileHandlerInterface.getDevice()>
	//   27   62:aload_0         
	//   28   63:getfield        #65  <Field Integer mcontrollingDevObjId>
	//   29   66:invokevirtual   #115 <Method int Integer.intValue()>
	//   30   69:aload_0         
	//   31   70:getfield        #67  <Field int mProcessId>
	//   32   73:invokeinterface #222 <Method void BaseSensorManagerListener.onDataReceived(Bundle[], RemoteCallbackList, _PrivilegeSensorDevice, int, int)>
		}
		this;
	//   33   78:aload_0         
		JVM INSTR monitorexit ;
	//   34   79:monitorexit     
		return;
	//   35   80:return          
		abundle;
	//   36   81:astore_2        
		this;
	//   37   82:aload_0         
		JVM INSTR monitorexit ;
	//   38   83:monitorexit     
		throw abundle;
	//   39   84:aload_2         
	//   40   85:athrow          
	}

	public void onDataStarted(int i, int j)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(listener != null && handler != null && mcontrollingDevObjId != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #54  <Field BaseSensorManagerListener listener>
	//*   4    6:ifnull          120
	//*   5    9:aload_0         
	//*   6   10:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//*   7   13:ifnull          120
	//*   8   16:aload_0         
	//*   9   17:getfield        #65  <Field Integer mcontrollingDevObjId>
	//*  10   20:ifnull          120
		{
			LOG.d(TAG, (new StringBuilder()).append("onDataStarted() dataType : ").append(i).append(" errorCode : ").append(j).toString());
	//   11   23:getstatic       #45  <Field Class TAG>
	//   12   26:new             #128 <Class StringBuilder>
	//   13   29:dup             
	//   14   30:invokespecial   #129 <Method void StringBuilder()>
	//   15   33:ldc1            #226 <String "onDataStarted() dataType : ">
	//   16   35:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   17   38:iload_1         
	//   18   39:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   19   42:ldc1            #228 <String " errorCode : ">
	//   20   44:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:iload_2         
	//   22   48:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   23   51:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   24   54:invokestatic    #148 <Method void LOG.d(Class, String)>
			mDataType = i;
	//   25   57:aload_0         
	//   26   58:iload_1         
	//   27   59:putfield        #63  <Field int mDataType>
			uniqueKey = UUID.randomUUID().toString();
	//   28   62:aload_0         
	//   29   63:invokestatic    #234 <Method UUID UUID.randomUUID()>
	//   30   66:invokevirtual   #235 <Method String UUID.toString()>
	//   31   69:putfield        #71  <Field String uniqueKey>
			listener.onDataStarted(i, j, (RemoteCallbackList)dataListenerHashMap.get(((Object) (device.getId()))), handler.getDevice(), mcontrollingDevObjId.intValue(), mProcessId);
	//   32   72:aload_0         
	//   33   73:getfield        #54  <Field BaseSensorManagerListener listener>
	//   34   76:iload_1         
	//   35   77:iload_2         
	//   36   78:aload_0         
	//   37   79:getfield        #59  <Field ConcurrentHashMap dataListenerHashMap>
	//   38   82:aload_0         
	//   39   83:getfield        #78  <Field _PrivilegeSensorDevice device>
	//   40   86:invokevirtual   #167 <Method String _PrivilegeSensorDevice.getId()>
	//   41   89:invokevirtual   #86  <Method Object ConcurrentHashMap.get(Object)>
	//   42   92:checkcast       #88  <Class RemoteCallbackList>
	//   43   95:aload_0         
	//   44   96:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//   45   99:invokeinterface #213 <Method _PrivilegeSensorDevice PrivilegeSensorProfileHandlerInterface.getDevice()>
	//   46  104:aload_0         
	//   47  105:getfield        #65  <Field Integer mcontrollingDevObjId>
	//   48  108:invokevirtual   #115 <Method int Integer.intValue()>
	//   49  111:aload_0         
	//   50  112:getfield        #67  <Field int mProcessId>
	//   51  115:invokeinterface #238 <Method void BaseSensorManagerListener.onDataStarted(int, int, RemoteCallbackList, _PrivilegeSensorDevice, int, int)>
		}
		this;
	//   52  120:aload_0         
		JVM INSTR monitorexit ;
	//   53  121:monitorexit     
		return;
	//   54  122:return          
		Exception exception;
		exception;
	//   55  123:astore_3        
		this;
	//   56  124:aload_0         
		JVM INSTR monitorexit ;
	//   57  125:monitorexit     
		throw exception;
	//   58  126:aload_3         
	//   59  127:athrow          
	}

	public void onDataStopped(int i, int j)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(listener == null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #54  <Field BaseSensorManagerListener listener>
	//    4    6:ifnull          183
_L1:
		LOG.d(TAG, (new StringBuilder()).append("onDataStopped() dataType : ").append(i).append(" errorCode : ").append(j).append(" state : ").append(mState).toString());
	//    5    9:getstatic       #45  <Field Class TAG>
	//    6   12:new             #128 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #129 <Method void StringBuilder()>
	//    9   19:ldc1            #241 <String "onDataStopped() dataType : ">
	//   10   21:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:iload_1         
	//   12   25:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   13   28:ldc1            #228 <String " errorCode : ">
	//   14   30:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:iload_2         
	//   16   34:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   17   37:ldc1            #243 <String " state : ">
	//   18   39:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   19   42:aload_0         
	//   20   43:getfield        #69  <Field int mState>
	//   21   46:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   22   49:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   23   52:invokestatic    #148 <Method void LOG.d(Class, String)>
		if(mcontrollingDevObjId == null || handler == null) goto _L2; else goto _L3
	//   24   55:aload_0         
	//   25   56:getfield        #65  <Field Integer mcontrollingDevObjId>
	//   26   59:ifnull          183
	//   27   62:aload_0         
	//   28   63:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//   29   66:ifnull          183
_L3:
		Integer integer;
		integer = Integer.valueOf(mcontrollingDevObjId.intValue());
	//   30   69:aload_0         
	//   31   70:getfield        #65  <Field Integer mcontrollingDevObjId>
	//   32   73:invokevirtual   #115 <Method int Integer.intValue()>
	//   33   76:invokestatic    #247 <Method Integer Integer.valueOf(int)>
	//   34   79:astore_3        
		mcontrollingDevObjId = null;
	//   35   80:aload_0         
	//   36   81:aconst_null     
	//   37   82:putfield        #65  <Field Integer mcontrollingDevObjId>
		if(mState != 3)
			break MISSING_BLOCK_LABEL_186;
	//   38   85:aload_0         
	//   39   86:getfield        #69  <Field int mState>
	//   40   89:iconst_3        
	//   41   90:icmpne          186
		mState = 2;
	//   42   93:aload_0         
	//   43   94:iconst_2        
	//   44   95:putfield        #69  <Field int mState>
		LOG.d(TAG, "onDataStopped() this.mState is changed to STATE_REQUEST_PROCESSING");
	//   45   98:getstatic       #45  <Field Class TAG>
	//   46  101:ldc1            #249 <String "onDataStopped() this.mState is changed to STATE_REQUEST_PROCESSING">
	//   47  103:invokestatic    #148 <Method void LOG.d(Class, String)>
_L5:
		listener.onDataStopped(i, j, (RemoteCallbackList)dataListenerHashMap.get(((Object) (device.getId()))), handler.getDevice(), integer.intValue(), mProcessId);
	//   48  106:aload_0         
	//   49  107:getfield        #54  <Field BaseSensorManagerListener listener>
	//   50  110:iload_1         
	//   51  111:iload_2         
	//   52  112:aload_0         
	//   53  113:getfield        #59  <Field ConcurrentHashMap dataListenerHashMap>
	//   54  116:aload_0         
	//   55  117:getfield        #78  <Field _PrivilegeSensorDevice device>
	//   56  120:invokevirtual   #167 <Method String _PrivilegeSensorDevice.getId()>
	//   57  123:invokevirtual   #86  <Method Object ConcurrentHashMap.get(Object)>
	//   58  126:checkcast       #88  <Class RemoteCallbackList>
	//   59  129:aload_0         
	//   60  130:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//   61  133:invokeinterface #213 <Method _PrivilegeSensorDevice PrivilegeSensorProfileHandlerInterface.getDevice()>
	//   62  138:aload_3         
	//   63  139:invokevirtual   #115 <Method int Integer.intValue()>
	//   64  142:aload_0         
	//   65  143:getfield        #67  <Field int mProcessId>
	//   66  146:invokeinterface #251 <Method void BaseSensorManagerListener.onDataStopped(int, int, RemoteCallbackList, _PrivilegeSensorDevice, int, int)>
		mDataRecord = false;
	//   67  151:aload_0         
	//   68  152:iconst_0        
	//   69  153:putfield        #61  <Field boolean mDataRecord>
		mDataType = -1;
	//   70  156:aload_0         
	//   71  157:iconst_m1       
	//   72  158:putfield        #63  <Field int mDataType>
		mProcessId = -1;
	//   73  161:aload_0         
	//   74  162:iconst_m1       
	//   75  163:putfield        #67  <Field int mProcessId>
		uniqueKey = null;
	//   76  166:aload_0         
	//   77  167:aconst_null     
	//   78  168:putfield        #71  <Field String uniqueKey>
		removeDataListener(device.getId(), integer);
	//   79  171:aload_0         
	//   80  172:aload_0         
	//   81  173:getfield        #78  <Field _PrivilegeSensorDevice device>
	//   82  176:invokevirtual   #167 <Method String _PrivilegeSensorDevice.getId()>
	//   83  179:aload_3         
	//   84  180:invokevirtual   #255 <Method void removeDataListener(String, Integer)>
_L2:
		this;
	//   85  183:aload_0         
		JVM INSTR monitorexit ;
	//   86  184:monitorexit     
		return;
	//   87  185:return          
		mState = 0;
	//   88  186:aload_0         
	//   89  187:iconst_0        
	//   90  188:putfield        #69  <Field int mState>
		LOG.d(TAG, "onDataStopped() this.mState is changed to STATE_NONE");
	//   91  191:getstatic       #45  <Field Class TAG>
	//   92  194:ldc2            #257 <String "onDataStopped() this.mState is changed to STATE_NONE">
	//   93  197:invokestatic    #148 <Method void LOG.d(Class, String)>
		if(true) goto _L5; else goto _L4
	//   94  200:goto            106
_L4:
		Exception exception;
		exception;
	//   95  203:astore_3        
		this;
	//   96  204:aload_0         
		JVM INSTR monitorexit ;
	//   97  205:monitorexit     
		throw exception;
	//   98  206:aload_3         
	//   99  207:athrow          
	}

	public int registerListener(_PrivilegeSensorDevice _pprivilegesensordevice, Integer integer, _PlatformSensorDataListener _pplatformsensordatalistener)
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore          4
		this;
	//    2    3:aload_0         
		JVM INSTR monitorenter ;
	//    3    4:monitorenter    
		LOG.d(TAG, (new StringBuilder()).append("startReceivingData() device Id : ").append(((Object) (integer))).toString());
	//    4    5:getstatic       #45  <Field Class TAG>
	//    5    8:new             #128 <Class StringBuilder>
	//    6   11:dup             
	//    7   12:invokespecial   #129 <Method void StringBuilder()>
	//    8   15:ldc2            #261 <String "startReceivingData() device Id : ">
	//    9   18:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:aload_2         
	//   11   22:invokevirtual   #138 <Method StringBuilder StringBuilder.append(Object)>
	//   12   25:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   13   28:invokestatic    #148 <Method void LOG.d(Class, String)>
		if(_pplatformsensordatalistener != null && integer != null) goto _L2; else goto _L1
	//   14   31:aload_3         
	//   15   32:ifnull          39
	//   16   35:aload_2         
	//   17   36:ifnonnull       53
_L1:
		LOG.d(TAG, "startReceivingData() listener || devId is NULL");
	//   18   39:getstatic       #45  <Field Class TAG>
	//   19   42:ldc2            #263 <String "startReceivingData() listener || devId is NULL">
	//   20   45:invokestatic    #148 <Method void LOG.d(Class, String)>
_L3:
		this;
	//   21   48:aload_0         
		JVM INSTR monitorexit ;
	//   22   49:monitorexit     
		return i;
	//   23   50:iload           4
	//   24   52:ireturn         
_L2:
		if(mState != 1 && mState != 3)
			break MISSING_BLOCK_LABEL_106;
	//   25   53:aload_0         
	//   26   54:getfield        #69  <Field int mState>
	//   27   57:iconst_1        
	//   28   58:icmpeq          69
	//   29   61:aload_0         
	//   30   62:getfield        #69  <Field int mState>
	//   31   65:iconst_3        
	//   32   66:icmpne          106
		LOG.d(TAG, (new StringBuilder()).append("startReceivingData() Device is BUSY, startRecivingData has already been called - this.mState : ").append(mState).toString());
	//   33   69:getstatic       #45  <Field Class TAG>
	//   34   72:new             #128 <Class StringBuilder>
	//   35   75:dup             
	//   36   76:invokespecial   #129 <Method void StringBuilder()>
	//   37   79:ldc2            #265 <String "startReceivingData() Device is BUSY, startRecivingData has already been called - this.mState : ">
	//   38   82:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   39   85:aload_0         
	//   40   86:getfield        #69  <Field int mState>
	//   41   89:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   42   92:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   43   95:invokestatic    #148 <Method void LOG.d(Class, String)>
		  goto _L3
	//*  44   98:goto            48
		_pprivilegesensordevice;
	//   45  101:astore_1        
	//*  46  102:aload_0         
		throw _pprivilegesensordevice;
	//   47  103:monitorexit     
	//   48  104:aload_1         
	//   49  105:athrow          
label0:
		{
			if(getSensorDataListener(_pprivilegesensordevice.getId(), integer.intValue()) == null)
				break label0;
	//   50  106:aload_0         
	//   51  107:aload_1         
	//   52  108:invokevirtual   #167 <Method String _PrivilegeSensorDevice.getId()>
	//   53  111:aload_2         
	//   54  112:invokevirtual   #115 <Method int Integer.intValue()>
	//   55  115:invokespecial   #179 <Method _PlatformSensorDataListener getSensorDataListener(String, int)>
	//   56  118:ifnull          133
			LOG.d(TAG, "startReceivingData() Alreay Present for the ProcessID");
	//   57  121:getstatic       #45  <Field Class TAG>
	//   58  124:ldc2            #267 <String "startReceivingData() Alreay Present for the ProcessID">
	//   59  127:invokestatic    #148 <Method void LOG.d(Class, String)>
		}
		  goto _L3
	//*  60  130:goto            48
		if(handler == null)
			break MISSING_BLOCK_LABEL_294;
	//   61  133:aload_0         
	//   62  134:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//   63  137:ifnull          294
		LOG.d(TAG, "startReceivingData() exerciseID Invoking Handler's start Receving Data");
	//   64  140:getstatic       #45  <Field Class TAG>
	//   65  143:ldc2            #269 <String "startReceivingData() exerciseID Invoking Handler's start Receving Data">
	//   66  146:invokestatic    #148 <Method void LOG.d(Class, String)>
		addDataListener(integer, _pplatformsensordatalistener);
	//   67  149:aload_0         
	//   68  150:aload_2         
	//   69  151:aload_3         
	//   70  152:invokevirtual   #271 <Method void addDataListener(Integer, _PlatformSensorDataListener)>
		mcontrollingDevObjId = integer;
	//   71  155:aload_0         
	//   72  156:aload_2         
	//   73  157:putfield        #65  <Field Integer mcontrollingDevObjId>
		handler.getDevice().setObjectId(mcontrollingDevObjId.intValue());
	//   74  160:aload_0         
	//   75  161:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//   76  164:invokeinterface #213 <Method _PrivilegeSensorDevice PrivilegeSensorProfileHandlerInterface.getDevice()>
	//   77  169:aload_0         
	//   78  170:getfield        #65  <Field Integer mcontrollingDevObjId>
	//   79  173:invokevirtual   #115 <Method int Integer.intValue()>
	//   80  176:invokevirtual   #275 <Method void _PrivilegeSensorDevice.setObjectId(int)>
		i = handler.startReceivingData();
	//   81  179:aload_0         
	//   82  180:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//   83  183:invokeinterface #278 <Method int PrivilegeSensorProfileHandlerInterface.startReceivingData()>
	//   84  188:istore          4
		if(i != 0)
			break MISSING_BLOCK_LABEL_272;
	//   85  190:iload           4
	//   86  192:ifne            272
		LOG.d(TAG, "startReceivingData() Invoking Handler's Success");
	//   87  195:getstatic       #45  <Field Class TAG>
	//   88  198:ldc2            #280 <String "startReceivingData() Invoking Handler's Success">
	//   89  201:invokestatic    #148 <Method void LOG.d(Class, String)>
		if(mState != 0) goto _L5; else goto _L4
	//   90  204:aload_0         
	//   91  205:getfield        #69  <Field int mState>
	//   92  208:ifne            255
_L4:
		mState = 1;
	//   93  211:aload_0         
	//   94  212:iconst_1        
	//   95  213:putfield        #69  <Field int mState>
		LOG.d(TAG, "startReceivingData() this.mState is changed to STATE_DATA_RECEIVING");
	//   96  216:getstatic       #45  <Field Class TAG>
	//   97  219:ldc2            #282 <String "startReceivingData() this.mState is changed to STATE_DATA_RECEIVING">
	//   98  222:invokestatic    #148 <Method void LOG.d(Class, String)>
_L6:
		LOG.d(TAG, (new StringBuilder()).append("startReceivingData() error : ").append(i).toString());
	//   99  225:getstatic       #45  <Field Class TAG>
	//  100  228:new             #128 <Class StringBuilder>
	//  101  231:dup             
	//  102  232:invokespecial   #129 <Method void StringBuilder()>
	//  103  235:ldc2            #284 <String "startReceivingData() error : ">
	//  104  238:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//  105  241:iload           4
	//  106  243:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//  107  246:invokevirtual   #142 <Method String StringBuilder.toString()>
	//  108  249:invokestatic    #148 <Method void LOG.d(Class, String)>
		  goto _L3
	//* 109  252:goto            48
_L5:
		mState = 3;
	//  110  255:aload_0         
	//  111  256:iconst_3        
	//  112  257:putfield        #69  <Field int mState>
		LOG.d(TAG, "startReceivingData() this.mState is changed to STATE_DATA_AND_REQUEST_PROCESSING");
	//  113  260:getstatic       #45  <Field Class TAG>
	//  114  263:ldc2            #286 <String "startReceivingData() this.mState is changed to STATE_DATA_AND_REQUEST_PROCESSING">
	//  115  266:invokestatic    #148 <Method void LOG.d(Class, String)>
		  goto _L6
	//* 116  269:goto            225
		mcontrollingDevObjId = null;
	//  117  272:aload_0         
	//  118  273:aconst_null     
	//  119  274:putfield        #65  <Field Integer mcontrollingDevObjId>
		mProcessId = -1;
	//  120  277:aload_0         
	//  121  278:iconst_m1       
	//  122  279:putfield        #67  <Field int mProcessId>
		removeDataListener(_pprivilegesensordevice.getId(), integer);
	//  123  282:aload_0         
	//  124  283:aload_1         
	//  125  284:invokevirtual   #167 <Method String _PrivilegeSensorDevice.getId()>
	//  126  287:aload_2         
	//  127  288:invokevirtual   #255 <Method void removeDataListener(String, Integer)>
		  goto _L6
	//* 128  291:goto            225
		LOG.d(TAG, "startReceivingData() exerciseID returning ERROR_FAILURE");
	//  129  294:getstatic       #45  <Field Class TAG>
	//  130  297:ldc2            #288 <String "startReceivingData() exerciseID returning ERROR_FAILURE">
	//  131  300:invokestatic    #148 <Method void LOG.d(Class, String)>
		i = 0;
	//  132  303:iconst_0        
	//  133  304:istore          4
		  goto _L3
	//* 134  306:goto            48
	}

	public void removeDataListener(String s, Integer integer)
	{
		Object obj;
		HealthRemoteCallbackList healthremotecallbacklist;
		LOG.d(TAG, (new StringBuilder()).append("removeDataListener() processId : ").append(((Object) (integer))).toString());
	//    0    0:getstatic       #45  <Field Class TAG>
	//    1    3:new             #128 <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #129 <Method void StringBuilder()>
	//    4   10:ldc2            #290 <String "removeDataListener() processId : ">
	//    5   13:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//    6   16:aload_2         
	//    7   17:invokevirtual   #138 <Method StringBuilder StringBuilder.append(Object)>
	//    8   20:invokevirtual   #142 <Method String StringBuilder.toString()>
	//    9   23:invokestatic    #148 <Method void LOG.d(Class, String)>
		healthremotecallbacklist = (HealthRemoteCallbackList)dataListenerHashMap.get(((Object) (s)));
	//   10   26:aload_0         
	//   11   27:getfield        #59  <Field ConcurrentHashMap dataListenerHashMap>
	//   12   30:aload_1         
	//   13   31:invokevirtual   #86  <Method Object ConcurrentHashMap.get(Object)>
	//   14   34:checkcast       #169 <Class HealthRemoteCallbackList>
	//   15   37:astore          6
		obj = null;
	//   16   39:aconst_null     
	//   17   40:astore          4
		if(healthremotecallbacklist != null) goto _L2; else goto _L1
	//   18   42:aload           6
	//   19   44:ifnonnull       57
_L1:
		LOG.e(TAG, "removeSensorEventListener :  remoteCallBackList instance is NULL");
	//   20   47:getstatic       #45  <Field Class TAG>
	//   21   50:ldc2            #292 <String "removeSensorEventListener :  remoteCallBackList instance is NULL">
	//   22   53:invokestatic    #295 <Method void LOG.e(Class, String)>
_L6:
		return;
	//   23   56:return          
_L2:
		Object obj1 = PrivilegeSensorService.beginBroadcast;
	//   24   57:getstatic       #100 <Field Object PrivilegeSensorService.beginBroadcast>
	//   25   60:astore          5
		obj1;
	//   26   62:aload           5
		JVM INSTR monitorenter ;
	//   27   64:monitorenter    
		healthremotecallbacklist.beginBroadcast();
	//   28   65:aload           6
	//   29   67:invokevirtual   #296 <Method int HealthRemoteCallbackList.beginBroadcast()>
	//   30   70:pop             
		int i = 0;
	//   31   71:iconst_0        
	//   32   72:istore_3        
_L4:
		s = ((String) (obj));
	//   33   73:aload           4
	//   34   75:astore_1        
		if(i >= healthremotecallbacklist.getRegisteredCallbackCount())
			break MISSING_BLOCK_LABEL_120;
	//   35   76:iload_3         
	//   36   77:aload           6
	//   37   79:invokevirtual   #190 <Method int HealthRemoteCallbackList.getRegisteredCallbackCount()>
	//   38   82:icmpge          120
		s = ((String) ((Integer)healthremotecallbacklist.getBroadcastCookie(i)));
	//   39   85:aload           6
	//   40   87:iload_3         
	//   41   88:invokevirtual   #297 <Method Object HealthRemoteCallbackList.getBroadcastCookie(int)>
	//   42   91:checkcast       #112 <Class Integer>
	//   43   94:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_182;
	//   44   95:aload_1         
	//   45   96:ifnull          182
		if(((Integer) (s)).intValue() != integer.intValue())
			break MISSING_BLOCK_LABEL_182;
	//   46   99:aload_1         
	//   47  100:invokevirtual   #115 <Method int Integer.intValue()>
	//   48  103:aload_2         
	//   49  104:invokevirtual   #115 <Method int Integer.intValue()>
	//   50  107:icmpne          182
		s = ((String) ((_PlatformSensorDataListener)healthremotecallbacklist.getBroadcastItem(i)));
	//   51  110:aload           6
	//   52  112:iload_3         
	//   53  113:invokevirtual   #298 <Method android.os.IInterface HealthRemoteCallbackList.getBroadcastItem(int)>
	//   54  116:checkcast       #121 <Class _PlatformSensorDataListener>
	//   55  119:astore_1        
		healthremotecallbacklist.finishBroadcast();
	//   56  120:aload           6
	//   57  122:invokevirtual   #299 <Method void HealthRemoteCallbackList.finishBroadcast()>
		obj1;
	//   58  125:aload           5
		JVM INSTR monitorexit ;
	//   59  127:monitorexit     
		i = 0;
	//   60  128:iconst_0        
	//   61  129:istore_3        
		if(s != null)
	//*  62  130:aload_1         
	//*  63  131:ifnull          173
		{
			healthremotecallbacklist.unregister(((android.os.IInterface) (s)));
	//   64  134:aload           6
	//   65  136:aload_1         
	//   66  137:invokevirtual   #183 <Method boolean HealthRemoteCallbackList.unregister(android.os.IInterface)>
	//   67  140:pop             
			i = healthremotecallbacklist.getRegisteredCallbackCount();
	//   68  141:aload           6
	//   69  143:invokevirtual   #190 <Method int HealthRemoteCallbackList.getRegisteredCallbackCount()>
	//   70  146:istore_3        
			LOG.d(TAG, (new StringBuilder()).append("removeSensorEventListener :  Count:").append(i).toString());
	//   71  147:getstatic       #45  <Field Class TAG>
	//   72  150:new             #128 <Class StringBuilder>
	//   73  153:dup             
	//   74  154:invokespecial   #129 <Method void StringBuilder()>
	//   75  157:ldc2            #301 <String "removeSensorEventListener :  Count:">
	//   76  160:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   77  163:iload_3         
	//   78  164:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   79  167:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   80  170:invokestatic    #148 <Method void LOG.d(Class, String)>
		}
		if(i == 0)
	//*  81  173:iload_3         
	//*  82  174:ifne            56
		{
			deinitialize();
	//   83  177:aload_0         
	//   84  178:invokevirtual   #302 <Method void deinitialize()>
			return;
	//   85  181:return          
		}
		continue; /* Loop/switch isn't completed */
		i++;
	//   86  182:iload_3         
	//   87  183:iconst_1        
	//   88  184:iadd            
	//   89  185:istore_3        
		if(true) goto _L4; else goto _L3
	//   90  186:goto            73
_L3:
		s;
	//   91  189:astore_1        
		obj1;
	//   92  190:aload           5
		JVM INSTR monitorexit ;
	//   93  192:monitorexit     
		throw s;
	//   94  193:aload_1         
	//   95  194:athrow          
		if(true) goto _L6; else goto _L5
_L5:
	}

	public int unregisterListener(Integer integer)
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		this;
	//    2    2:aload_0         
		JVM INSTR monitorenter ;
	//    3    3:monitorenter    
		LOG.d(TAG, (new StringBuilder()).append("stopReceivingData() devObjectId : ").append(((Object) (integer))).toString());
	//    4    4:getstatic       #45  <Field Class TAG>
	//    5    7:new             #128 <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #129 <Method void StringBuilder()>
	//    8   14:ldc2            #306 <String "stopReceivingData() devObjectId : ">
	//    9   17:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #138 <Method StringBuilder StringBuilder.append(Object)>
	//   12   24:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   13   27:invokestatic    #148 <Method void LOG.d(Class, String)>
		if(integer != null) goto _L2; else goto _L1
	//   14   30:aload_1         
	//   15   31:ifnonnull       47
_L1:
		LOG.e(TAG, "stopReceivingData() processId is NULL so returning ");
	//   16   34:getstatic       #45  <Field Class TAG>
	//   17   37:ldc2            #308 <String "stopReceivingData() processId is NULL so returning ">
	//   18   40:invokestatic    #295 <Method void LOG.e(Class, String)>
_L3:
		this;
	//   19   43:aload_0         
		JVM INSTR monitorexit ;
	//   20   44:monitorexit     
		return i;
	//   21   45:iload_2         
	//   22   46:ireturn         
_L2:
		if(mState == 1 || mState == 3)
			break MISSING_BLOCK_LABEL_100;
	//   23   47:aload_0         
	//   24   48:getfield        #69  <Field int mState>
	//   25   51:iconst_1        
	//   26   52:icmpeq          100
	//   27   55:aload_0         
	//   28   56:getfield        #69  <Field int mState>
	//   29   59:iconst_3        
	//   30   60:icmpeq          100
		LOG.e(TAG, (new StringBuilder()).append("stopReceivingData() is Not BUSY, so stopRecivingData should not be called - this.mState : ").append(mState).toString());
	//   31   63:getstatic       #45  <Field Class TAG>
	//   32   66:new             #128 <Class StringBuilder>
	//   33   69:dup             
	//   34   70:invokespecial   #129 <Method void StringBuilder()>
	//   35   73:ldc2            #310 <String "stopReceivingData() is Not BUSY, so stopRecivingData should not be called - this.mState : ">
	//   36   76:invokevirtual   #135 <Method StringBuilder StringBuilder.append(String)>
	//   37   79:aload_0         
	//   38   80:getfield        #69  <Field int mState>
	//   39   83:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   40   86:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   41   89:invokestatic    #295 <Method void LOG.e(Class, String)>
		  goto _L3
	//*  42   92:goto            43
		integer;
	//   43   95:astore_1        
	//*  44   96:aload_0         
		throw integer;
	//   45   97:monitorexit     
	//   46   98:aload_1         
	//   47   99:athrow          
label0:
		{
			if(mcontrollingDevObjId == null || mcontrollingDevObjId.intValue() != integer.intValue())
				break label0;
	//   48  100:aload_0         
	//   49  101:getfield        #65  <Field Integer mcontrollingDevObjId>
	//   50  104:ifnull          150
	//   51  107:aload_0         
	//   52  108:getfield        #65  <Field Integer mcontrollingDevObjId>
	//   53  111:invokevirtual   #115 <Method int Integer.intValue()>
	//   54  114:aload_1         
	//   55  115:invokevirtual   #115 <Method int Integer.intValue()>
	//   56  118:icmpne          150
			if(handler == null)
				break MISSING_BLOCK_LABEL_162;
	//   57  121:aload_0         
	//   58  122:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//   59  125:ifnull          162
			LOG.e(TAG, "stopReceivingData() Invoking Handler's stop Receving Data");
	//   60  128:getstatic       #45  <Field Class TAG>
	//   61  131:ldc2            #312 <String "stopReceivingData() Invoking Handler's stop Receving Data">
	//   62  134:invokestatic    #295 <Method void LOG.e(Class, String)>
			i = handler.stopReceivingData();
	//   63  137:aload_0         
	//   64  138:getfield        #52  <Field PrivilegeSensorProfileHandlerInterface handler>
	//   65  141:invokeinterface #315 <Method int PrivilegeSensorProfileHandlerInterface.stopReceivingData()>
	//   66  146:istore_2        
		}
		  goto _L3
	//*  67  147:goto            43
		LOG.e(TAG, "stopReceivingData() processId not Equal to controlling processId");
	//   68  150:getstatic       #45  <Field Class TAG>
	//   69  153:ldc2            #317 <String "stopReceivingData() processId not Equal to controlling processId">
	//   70  156:invokestatic    #295 <Method void LOG.e(Class, String)>
		  goto _L3
	//*  71  159:goto            43
		LOG.d(TAG, "stopReceivingData() returning ERROR_FAILURE");
	//   72  162:getstatic       #45  <Field Class TAG>
	//   73  165:ldc2            #319 <String "stopReceivingData() returning ERROR_FAILURE">
	//   74  168:invokestatic    #148 <Method void LOG.d(Class, String)>
		i = 0;
	//   75  171:iconst_0        
	//   76  172:istore_2        
		  goto _L3
	//*  77  173:goto            43
	}

	private static final int STATE_DATA_AND_REQUEST_PROCESSING = 3;
	private static final int STATE_DATA_RECEIVING = 1;
	private static final int STATE_NONE = 0;
	private static final int STATE_REQUEST_PROCESSING = 2;
	private static final Class TAG = com/sec/android/service/health/sensor/handler/ProfileHandlerController;
	private ConcurrentHashMap dataListenerHashMap;
	private _PrivilegeSensorDevice device;
	private PrivilegeSensorProfileHandlerInterface handler;
	private BaseSensorManagerListener listener;
	private boolean mDataRecord;
	private int mDataType;
	private int mProcessId;
	com.sec.android.service.health.sensor.manager.HealthRemoteCallbackList.IHealthRemoteCallbackDiedListener mRemoteCallbackDied;
	private int mState;
	private Integer mcontrollingDevObjId;
	private String uniqueKey;

	static 
	{
	//    0    0:ldc1            #2   <Class ProfileHandlerController>
	//    1    2:putstatic       #45  <Field Class TAG>
	//*   2    5:return          
	}


/*
	static Class access$000()
	{
		return TAG;
	//    0    0:getstatic       #45  <Field Class TAG>
	//    1    3:areturn         
	}

*/
}
