// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.*;
import android.util.SparseArray;
import com.samsung.android.sdk.health.sensor._PlatformSensorDataListener;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.sec.android.service.health.cp.accesscontrol.AccesscontrolUtil;
import com.sec.android.service.health.sensor.manager.BaseSensorManager;
import com.sec.android.service.health.sensor.manager.ISensorListener;
import com.sec.android.service.health.sensor.manager.InternalAndroidSensorManager;
import com.sec.android.service.health.sensor.manager.util.Filter;
import com.sec.android.service.health.util.FeatureChecker;
import com.sec.android.service.health.util.LOG;
import java.util.List;
import java.util.Locale;

public class PrivilegeSensorService extends Service
{
	private final class SensorListener
		implements ISensorListener
	{

		public void onDataReceived(Bundle bundle, RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int i)
		{
			LOG.d(PrivilegeSensorService.TAG, (new StringBuilder()).append("[SensorListener] onDataReceived() deviceID : ").append(_pprivilegesensordevice.getId()).append(" processId : ").append(i).append(" deviceObjId : ").append(_pprivilegesensordevice.getObjectId()).append("Extra: ").append(((Object) (bundle))).toString());
		//    0    0:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
		//    1    3:new             #30  <Class StringBuilder>
		//    2    6:dup             
		//    3    7:invokespecial   #31  <Method void StringBuilder()>
		//    4   10:ldc1            #33  <String "[SensorListener] onDataReceived() deviceID : ">
		//    5   12:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//    6   15:aload_3         
		//    7   16:invokevirtual   #43  <Method String _PrivilegeSensorDevice.getId()>
		//    8   19:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:ldc1            #45  <String " processId : ">
		//   10   24:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   11   27:iload           4
		//   12   29:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
		//   13   32:ldc1            #50  <String " deviceObjId : ">
		//   14   34:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   15   37:aload_3         
		//   16   38:invokevirtual   #54  <Method int _PrivilegeSensorDevice.getObjectId()>
		//   17   41:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
		//   18   44:ldc1            #56  <String "Extra: ">
		//   19   46:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   20   49:aload_1         
		//   21   50:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
		//   22   53:invokevirtual   #62  <Method String StringBuilder.toString()>
		//   23   56:invokestatic    #68  <Method void LOG.d(Class, String)>
			if(remotecallbacklist != null)
		//*  24   59:aload_2         
		//*  25   60:ifnull          124
			{
				remotecallbacklist = PrivilegeSensorService.createRemoteCallbackListCopy(remotecallbacklist);
		//   26   63:aload_2         
		//   27   64:invokestatic    #72  <Method RemoteCallbackList PrivilegeSensorService.access$200(RemoteCallbackList)>
		//   28   67:astore_2        
				remotecallbacklist = ((RemoteCallbackList) (PrivilegeSensorService.mCbHandler.obtainMessage(102, ((Integer)_pprivilegesensordevice.getDataType().get(0)).intValue(), -1, ((Object) (remotecallbacklist)))));
		//   29   68:invokestatic    #76  <Method Handler PrivilegeSensorService.access$300()>
		//   30   71:bipush          102
		//   31   73:aload_3         
		//   32   74:invokevirtual   #80  <Method List _PrivilegeSensorDevice.getDataType()>
		//   33   77:iconst_0        
		//   34   78:invokeinterface #86  <Method Object List.get(int)>
		//   35   83:checkcast       #88  <Class Integer>
		//   36   86:invokevirtual   #91  <Method int Integer.intValue()>
		//   37   89:iconst_m1       
		//   38   90:aload_2         
		//   39   91:invokevirtual   #97  <Method Message Handler.obtainMessage(int, int, int, Object)>
		//   40   94:astore_2        
				_pprivilegesensordevice = ((_PrivilegeSensorDevice) (new Bundle()));
		//   41   95:new             #99  <Class Bundle>
		//   42   98:dup             
		//   43   99:invokespecial   #100 <Method void Bundle()>
		//   44  102:astore_3        
				((Bundle) (_pprivilegesensordevice)).putParcelable("_Extra", ((android.os.Parcelable) (bundle)));
		//   45  103:aload_3         
		//   46  104:ldc1            #102 <String "_Extra">
		//   47  106:aload_1         
		//   48  107:invokevirtual   #106 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
				((Message) (remotecallbacklist)).setData(((Bundle) (_pprivilegesensordevice)));
		//   49  110:aload_2         
		//   50  111:aload_3         
		//   51  112:invokevirtual   #112 <Method void Message.setData(Bundle)>
				PrivilegeSensorService.mCbHandler.sendMessage(((Message) (remotecallbacklist)));
		//   52  115:invokestatic    #76  <Method Handler PrivilegeSensorService.access$300()>
		//   53  118:aload_2         
		//   54  119:invokevirtual   #116 <Method boolean Handler.sendMessage(Message)>
		//   55  122:pop             
				return;
		//   56  123:return          
			} else
			{
				LOG.e(PrivilegeSensorService.TAG, "onDataReceived callbackList is null");
		//   57  124:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
		//   58  127:ldc1            #118 <String "onDataReceived callbackList is null">
		//   59  129:invokestatic    #121 <Method void LOG.e(Class, String)>
				return;
		//   60  132:return          
			}
		}

		public void onDataReceived(Bundle abundle[], RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int i)
		{
			LOG.d(PrivilegeSensorService.TAG, (new StringBuilder()).append("[SensorListener] onDataReceived() deviceID : ").append(_pprivilegesensordevice.getId()).append(" processId : ").append(i).append(" deviceObjId : ").append(_pprivilegesensordevice.getObjectId()).toString());
		//    0    0:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
		//    1    3:new             #30  <Class StringBuilder>
		//    2    6:dup             
		//    3    7:invokespecial   #31  <Method void StringBuilder()>
		//    4   10:ldc1            #33  <String "[SensorListener] onDataReceived() deviceID : ">
		//    5   12:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//    6   15:aload_3         
		//    7   16:invokevirtual   #43  <Method String _PrivilegeSensorDevice.getId()>
		//    8   19:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:ldc1            #45  <String " processId : ">
		//   10   24:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   11   27:iload           4
		//   12   29:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
		//   13   32:ldc1            #50  <String " deviceObjId : ">
		//   14   34:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   15   37:aload_3         
		//   16   38:invokevirtual   #54  <Method int _PrivilegeSensorDevice.getObjectId()>
		//   17   41:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
		//   18   44:invokevirtual   #62  <Method String StringBuilder.toString()>
		//   19   47:invokestatic    #68  <Method void LOG.d(Class, String)>
			if(remotecallbacklist != null)
		//*  20   50:aload_2         
		//*  21   51:ifnull          115
			{
				remotecallbacklist = PrivilegeSensorService.createRemoteCallbackListCopy(remotecallbacklist);
		//   22   54:aload_2         
		//   23   55:invokestatic    #72  <Method RemoteCallbackList PrivilegeSensorService.access$200(RemoteCallbackList)>
		//   24   58:astore_2        
				remotecallbacklist = ((RemoteCallbackList) (PrivilegeSensorService.mCbHandler.obtainMessage(104, ((Integer)_pprivilegesensordevice.getDataType().get(0)).intValue(), -1, ((Object) (remotecallbacklist)))));
		//   25   59:invokestatic    #76  <Method Handler PrivilegeSensorService.access$300()>
		//   26   62:bipush          104
		//   27   64:aload_3         
		//   28   65:invokevirtual   #80  <Method List _PrivilegeSensorDevice.getDataType()>
		//   29   68:iconst_0        
		//   30   69:invokeinterface #86  <Method Object List.get(int)>
		//   31   74:checkcast       #88  <Class Integer>
		//   32   77:invokevirtual   #91  <Method int Integer.intValue()>
		//   33   80:iconst_m1       
		//   34   81:aload_2         
		//   35   82:invokevirtual   #97  <Method Message Handler.obtainMessage(int, int, int, Object)>
		//   36   85:astore_2        
				_pprivilegesensordevice = ((_PrivilegeSensorDevice) (new Bundle()));
		//   37   86:new             #99  <Class Bundle>
		//   38   89:dup             
		//   39   90:invokespecial   #100 <Method void Bundle()>
		//   40   93:astore_3        
				((Bundle) (_pprivilegesensordevice)).putParcelableArray("_Extra", ((android.os.Parcelable []) (abundle)));
		//   41   94:aload_3         
		//   42   95:ldc1            #102 <String "_Extra">
		//   43   97:aload_1         
		//   44   98:invokevirtual   #128 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
				((Message) (remotecallbacklist)).setData(((Bundle) (_pprivilegesensordevice)));
		//   45  101:aload_2         
		//   46  102:aload_3         
		//   47  103:invokevirtual   #112 <Method void Message.setData(Bundle)>
				PrivilegeSensorService.mCbHandler.sendMessage(((Message) (remotecallbacklist)));
		//   48  106:invokestatic    #76  <Method Handler PrivilegeSensorService.access$300()>
		//   49  109:aload_2         
		//   50  110:invokevirtual   #116 <Method boolean Handler.sendMessage(Message)>
		//   51  113:pop             
				return;
		//   52  114:return          
			} else
			{
				LOG.e(PrivilegeSensorService.TAG, "onDataReceived callbackList is null");
		//   53  115:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
		//   54  118:ldc1            #118 <String "onDataReceived callbackList is null">
		//   55  120:invokestatic    #121 <Method void LOG.e(Class, String)>
				return;
		//   56  123:return          
			}
		}

		public void onDataStarted(int i, int j, RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int k, int l)
		{
			LOG.d(PrivilegeSensorService.TAG, (new StringBuilder()).append("[SensorListener] onDataStarted() dataType : ").append(i).append(" errorCode : ").append(j).append(" processId : ").append(l).append(" DevObjectId :  ").append(k).toString());
		//    0    0:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
		//    1    3:new             #30  <Class StringBuilder>
		//    2    6:dup             
		//    3    7:invokespecial   #31  <Method void StringBuilder()>
		//    4   10:ldc1            #133 <String "[SensorListener] onDataStarted() dataType : ">
		//    5   12:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//    6   15:iload_1         
		//    7   16:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
		//    8   19:ldc1            #135 <String " errorCode : ">
		//    9   21:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   10   24:iload_2         
		//   11   25:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
		//   12   28:ldc1            #45  <String " processId : ">
		//   13   30:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   14   33:iload           6
		//   15   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
		//   16   38:ldc1            #137 <String " DevObjectId :  ">
		//   17   40:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   18   43:iload           5
		//   19   45:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
		//   20   48:invokevirtual   #62  <Method String StringBuilder.toString()>
		//   21   51:invokestatic    #68  <Method void LOG.d(Class, String)>
			if(_pprivilegesensordevice == null)
		//*  22   54:aload           4
		//*  23   56:ifnonnull       68
			{
				LOG.e(PrivilegeSensorService.TAG, "onDataStarted device is null");
		//   24   59:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
		//   25   62:ldc1            #139 <String "onDataStarted device is null">
		//   26   64:invokestatic    #121 <Method void LOG.e(Class, String)>
				return;
		//   27   67:return          
			}
			if(remotecallbacklist != null)
		//*  28   68:aload_3         
		//*  29   69:ifnull          109
			{
				remotecallbacklist = PrivilegeSensorService.createRemoteCallbackListCopy(remotecallbacklist);
		//   30   72:aload_3         
		//   31   73:invokestatic    #72  <Method RemoteCallbackList PrivilegeSensorService.access$200(RemoteCallbackList)>
		//   32   76:astore_3        
				remotecallbacklist = ((RemoteCallbackList) (PrivilegeSensorService.mCbHandler.obtainMessage(101, i, j, ((Object) (remotecallbacklist)))));
		//   33   77:invokestatic    #76  <Method Handler PrivilegeSensorService.access$300()>
		//   34   80:bipush          101
		//   35   82:iload_1         
		//   36   83:iload_2         
		//   37   84:aload_3         
		//   38   85:invokevirtual   #97  <Method Message Handler.obtainMessage(int, int, int, Object)>
		//   39   88:astore_3        
				((Message) (remotecallbacklist)).setData(new Bundle());
		//   40   89:aload_3         
		//   41   90:new             #99  <Class Bundle>
		//   42   93:dup             
		//   43   94:invokespecial   #100 <Method void Bundle()>
		//   44   97:invokevirtual   #112 <Method void Message.setData(Bundle)>
				PrivilegeSensorService.mCbHandler.sendMessage(((Message) (remotecallbacklist)));
		//   45  100:invokestatic    #76  <Method Handler PrivilegeSensorService.access$300()>
		//   46  103:aload_3         
		//   47  104:invokevirtual   #116 <Method boolean Handler.sendMessage(Message)>
		//   48  107:pop             
				return;
		//   49  108:return          
			} else
			{
				LOG.e(PrivilegeSensorService.TAG, "onDataStarted callbackList is null");
		//   50  109:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
		//   51  112:ldc1            #141 <String "onDataStarted callbackList is null">
		//   52  114:invokestatic    #121 <Method void LOG.e(Class, String)>
				return;
		//   53  117:return          
			}
		}

		public void onDataStopped(int i, int j, RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int k, int l)
		{
			LOG.d(PrivilegeSensorService.TAG, (new StringBuilder()).append("[SensorListener] onDataStopped() dataType : ").append(i).append(" errorCode : ").append(j).append(" processId : ").append(l).append(" DevObjectId :  ").append(k).toString());
		//    0    0:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
		//    1    3:new             #30  <Class StringBuilder>
		//    2    6:dup             
		//    3    7:invokespecial   #31  <Method void StringBuilder()>
		//    4   10:ldc1            #145 <String "[SensorListener] onDataStopped() dataType : ">
		//    5   12:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//    6   15:iload_1         
		//    7   16:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
		//    8   19:ldc1            #135 <String " errorCode : ">
		//    9   21:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   10   24:iload_2         
		//   11   25:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
		//   12   28:ldc1            #45  <String " processId : ">
		//   13   30:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   14   33:iload           6
		//   15   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
		//   16   38:ldc1            #137 <String " DevObjectId :  ">
		//   17   40:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   18   43:iload           5
		//   19   45:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
		//   20   48:invokevirtual   #62  <Method String StringBuilder.toString()>
		//   21   51:invokestatic    #68  <Method void LOG.d(Class, String)>
			if(_pprivilegesensordevice == null)
		//*  22   54:aload           4
		//*  23   56:ifnonnull       68
			{
				LOG.e(PrivilegeSensorService.TAG, "onDataStopped device is null");
		//   24   59:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
		//   25   62:ldc1            #147 <String "onDataStopped device is null">
		//   26   64:invokestatic    #121 <Method void LOG.e(Class, String)>
				return;
		//   27   67:return          
			}
			if(remotecallbacklist != null)
		//*  28   68:aload_3         
		//*  29   69:ifnull          109
			{
				remotecallbacklist = PrivilegeSensorService.createRemoteCallbackListCopy(remotecallbacklist);
		//   30   72:aload_3         
		//   31   73:invokestatic    #72  <Method RemoteCallbackList PrivilegeSensorService.access$200(RemoteCallbackList)>
		//   32   76:astore_3        
				remotecallbacklist = ((RemoteCallbackList) (PrivilegeSensorService.mCbHandler.obtainMessage(103, i, j, ((Object) (remotecallbacklist)))));
		//   33   77:invokestatic    #76  <Method Handler PrivilegeSensorService.access$300()>
		//   34   80:bipush          103
		//   35   82:iload_1         
		//   36   83:iload_2         
		//   37   84:aload_3         
		//   38   85:invokevirtual   #97  <Method Message Handler.obtainMessage(int, int, int, Object)>
		//   39   88:astore_3        
				((Message) (remotecallbacklist)).setData(new Bundle());
		//   40   89:aload_3         
		//   41   90:new             #99  <Class Bundle>
		//   42   93:dup             
		//   43   94:invokespecial   #100 <Method void Bundle()>
		//   44   97:invokevirtual   #112 <Method void Message.setData(Bundle)>
				PrivilegeSensorService.mCbHandler.sendMessage(((Message) (remotecallbacklist)));
		//   45  100:invokestatic    #76  <Method Handler PrivilegeSensorService.access$300()>
		//   46  103:aload_3         
		//   47  104:invokevirtual   #116 <Method boolean Handler.sendMessage(Message)>
		//   48  107:pop             
				return;
		//   49  108:return          
			} else
			{
				LOG.d(PrivilegeSensorService.TAG, "onDataStopped callbackList is null");
		//   50  109:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
		//   51  112:ldc1            #149 <String "onDataStopped callbackList is null">
		//   52  114:invokestatic    #68  <Method void LOG.d(Class, String)>
				return;
		//   53  117:return          
			}
		}

		final PrivilegeSensorService this$0;

		private SensorListener()
		{
			this$0 = PrivilegeSensorService.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field PrivilegeSensorService this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	public PrivilegeSensorService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #74  <Class Binder>
	//    4    8:dup             
	//    5    9:invokespecial   #75  <Method void Binder()>
	//    6   12:putfield        #77  <Field IBinder mForegroundToken>
		mSDKVersion = new SparseArray();
	//    7   15:aload_0         
	//    8   16:new             #79  <Class SparseArray>
	//    9   19:dup             
	//   10   20:invokespecial   #80  <Method void SparseArray()>
	//   11   23:putfield        #82  <Field SparseArray mSDKVersion>
		mSensorListener = new SensorListener();
	//   12   26:aload_0         
	//   13   27:new             #10  <Class PrivilegeSensorService$SensorListener>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:invokespecial   #85  <Method void PrivilegeSensorService$SensorListener(PrivilegeSensorService, PrivilegeSensorService$1)>
	//   18   36:putfield        #87  <Field PrivilegeSensorService$SensorListener mSensorListener>
	//   19   39:aload_0         
	//   20   40:new             #6   <Class PrivilegeSensorService$1>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:invokespecial   #90  <Method void PrivilegeSensorService$1(PrivilegeSensorService)>
	//   24   48:putfield        #92  <Field com.samsung.android.sdk.health.sensor._PlatformSensorService$Stub mBinder>
	//   25   51:return          
	}

	private static RemoteCallbackList createRemoteCallbackListCopy(RemoteCallbackList remotecallbacklist)
	{
		RemoteCallbackList remotecallbacklist1;
		if(remotecallbacklist == null)
			break MISSING_BLOCK_LABEL_68;
	//    0    0:aload_0         
	//    1    1:ifnull          68
		remotecallbacklist1 = new RemoteCallbackList();
	//    2    4:new             #115 <Class RemoteCallbackList>
	//    3    7:dup             
	//    4    8:invokespecial   #116 <Method void RemoteCallbackList()>
	//    5   11:astore          4
		Object obj = beginBroadcast;
	//    6   13:getstatic       #67  <Field Object beginBroadcast>
	//    7   16:astore_3        
		obj;
	//    8   17:aload_3         
		JVM INSTR monitorenter ;
	//    9   18:monitorenter    
		int j = remotecallbacklist.beginBroadcast();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #119 <Method int RemoteCallbackList.beginBroadcast()>
	//   12   23:istore_2        
		int i = 0;
	//   13   24:iconst_0        
	//   14   25:istore_1        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   15   26:iload_1         
	//   16   27:iload_2         
	//   17   28:icmpge          54
		remotecallbacklist1.register(remotecallbacklist.getBroadcastItem(i), remotecallbacklist.getBroadcastCookie(i));
	//   18   31:aload           4
	//   19   33:aload_0         
	//   20   34:iload_1         
	//   21   35:invokevirtual   #123 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   22   38:aload_0         
	//   23   39:iload_1         
	//   24   40:invokevirtual   #127 <Method Object RemoteCallbackList.getBroadcastCookie(int)>
	//   25   43:invokevirtual   #131 <Method boolean RemoteCallbackList.register(android.os.IInterface, Object)>
	//   26   46:pop             
		i++;
	//   27   47:iload_1         
	//   28   48:iconst_1        
	//   29   49:iadd            
	//   30   50:istore_1        
		if(true) goto _L2; else goto _L1
	//   31   51:goto            26
_L1:
		remotecallbacklist.finishBroadcast();
	//   32   54:aload_0         
	//   33   55:invokevirtual   #134 <Method void RemoteCallbackList.finishBroadcast()>
		obj;
	//   34   58:aload_3         
		JVM INSTR monitorexit ;
	//   35   59:monitorexit     
		return remotecallbacklist1;
	//   36   60:aload           4
	//   37   62:areturn         
		remotecallbacklist;
	//   38   63:astore_0        
		obj;
	//   39   64:aload_3         
		JVM INSTR monitorexit ;
	//   40   65:monitorexit     
		throw remotecallbacklist;
	//   41   66:aload_0         
	//   42   67:athrow          
		LOG.d(TAG, "[SensorListener] createRemoteCallbackListCopy() originalCallbackList is null");
	//   43   68:getstatic       #60  <Field Class TAG>
	//   44   71:ldc1            #136 <String "[SensorListener] createRemoteCallbackListCopy() originalCallbackList is null">
	//   45   73:invokestatic    #142 <Method void LOG.d(Class, String)>
		return null;
	//   46   76:aconst_null     
	//   47   77:areturn         
	}

	private BaseSensorManager getSensorManager(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 26
	//	               1 26
		default:
			return null;
	//    2   24:aconst_null     
	//    3   25:areturn         

		case 0: // '\0'
		case 1: // '\001'
			return ((BaseSensorManager) (InternalAndroidSensorManager.getInstance()));
	//    4   26:invokestatic    #150 <Method InternalAndroidSensorManager InternalAndroidSensorManager.getInstance()>
	//    5   29:areturn         
		}
	}

	private void initializeSensorManager(SensorListener sensorlistener)
	{
		for(int i = 1; i < 2; i++)
	//*   0    0:iconst_1        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:iconst_2        
	//*   4    4:icmpge          24
			getSensorManager(i).initialize(((android.content.Context) (this)), ((ISensorListener) (sensorlistener)));
	//    5    7:aload_0         
	//    6    8:iload_2         
	//    7    9:invokespecial   #113 <Method BaseSensorManager getSensorManager(int)>
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #158 <Method void BaseSensorManager.initialize(android.content.Context, ISensorListener)>

	//   11   17:iload_2         
	//   12   18:iconst_1        
	//   13   19:iadd            
	//   14   20:istore_2        
	//*  15   21:goto            2
	//   16   24:return          
	}

	private boolean isFeatureEnabled(int i, int j)
	{
		boolean flag1;
		Object obj;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		switch(i)
	//*   2    3:iload_1         
		{
	//*   3    4:tableswitch     0 1: default 28
	//	               0 30
	//	               1 30
		default:
			return false;
	//    4   28:iconst_0        
	//    5   29:ireturn         

		case 0: // '\0'
		case 1: // '\001'
			obj = ((Object) ((SensorManager)getSystemService("sensor")));
	//    6   30:aload_0         
	//    7   31:ldc1            #160 <String "sensor">
	//    8   33:invokevirtual   #164 <Method Object getSystemService(String)>
	//    9   36:checkcast       #166 <Class SensorManager>
	//   10   39:astore          5
			break;
		}
		if(j != 1 && j != 0 || ((SensorManager) (obj)).getDefaultSensor(0x1001a) == null) goto _L2; else goto _L1
	//   11   41:iload_2         
	//   12   42:iconst_1        
	//   13   43:icmpeq          50
	//   14   46:iload_2         
	//   15   47:ifne            64
	//   16   50:aload           5
	//   17   52:ldc1            #39  <Int 0x1001a>
	//   18   54:invokevirtual   #170 <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//   19   57:ifnull          64
_L1:
		boolean flag = true;
	//   20   60:iconst_1        
	//   21   61:istore_3        
_L4:
		return flag;
	//   22   62:iload_3         
	//   23   63:ireturn         
_L2:
		if(j == 2 && ((SensorManager) (obj)).getDefaultSensor(0x1001a) != null)
	//*  24   64:iload_2         
	//*  25   65:iconst_2        
	//*  26   66:icmpne          84
	//*  27   69:aload           5
	//*  28   71:ldc1            #39  <Int 0x1001a>
	//*  29   73:invokevirtual   #170 <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  30   76:ifnull          84
			flag = true;
	//   31   79:iconst_1        
	//   32   80:istore_3        
		else
	//*  33   81:goto            62
		if(j == 3 && ((SensorManager) (obj)).getDefaultSensor(0x1001f) != null)
	//*  34   84:iload_2         
	//*  35   85:iconst_3        
	//*  36   86:icmpne          104
	//*  37   89:aload           5
	//*  38   91:ldc1            #35  <Int 0x1001f>
	//*  39   93:invokevirtual   #170 <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  40   96:ifnull          104
			flag = true;
	//   41   99:iconst_1        
	//   42  100:istore_3        
		else
	//*  43  101:goto            62
		if(j == 4)
	//*  44  104:iload_2         
	//*  45  105:iconst_4        
	//*  46  106:icmpne          134
		{
			obj = ((Object) (getPackageManager()));
	//   47  109:aload_0         
	//   48  110:invokevirtual   #174 <Method PackageManager getPackageManager()>
	//   49  113:astore          5
			flag = flag1;
	//   50  115:iload           4
	//   51  117:istore_3        
			if(obj != null)
	//*  52  118:aload           5
	//*  53  120:ifnull          62
				flag = ((PackageManager) (obj)).hasSystemFeature("com.sec.feature.healthcover");
	//   54  123:aload           5
	//   55  125:ldc1            #20  <String "com.sec.feature.healthcover">
	//   56  127:invokevirtual   #180 <Method boolean PackageManager.hasSystemFeature(String)>
	//   57  130:istore_3        
		} else
	//*  58  131:goto            62
		{
			flag = flag1;
	//   59  134:iload           4
	//   60  136:istore_3        
			if(j == 7)
	//*  61  137:iload_2         
	//*  62  138:bipush          7
	//*  63  140:icmpne          62
			{
				flag = flag1;
	//   64  143:iload           4
	//   65  145:istore_3        
				if(((SensorManager) (obj)).getDefaultSensor(0x1001e) != null)
	//*  66  146:aload           5
	//*  67  148:ldc1            #37  <Int 0x1001e>
	//*  68  150:invokevirtual   #170 <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//*  69  153:ifnull          62
					flag = true;
	//   70  156:iconst_1        
	//   71  157:istore_3        
			}
		}
		if(true) goto _L4; else goto _L3
	//   72  158:goto            62
_L3:
	}

	private void setProcessSDKVersion(int i, int j, String s)
	{
		if(mSDKVersion.get(i) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field SparseArray mSDKVersion>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #185 <Method Object SparseArray.get(int)>
	//*   4    8:ifnull          12
			return;
	//    5   11:return          
		String s1;
		if(j == -1)
	//*   6   12:iload_2         
	//*   7   13:iconst_m1       
	//*   8   14:icmpne          110
			s1 = "#";
	//    9   17:ldc1            #187 <String "#">
	//   10   19:astore          4
		else
	//*  11   21:new             #189 <Class StringBuilder>
	//*  12   24:dup             
	//*  13   25:invokespecial   #190 <Method void StringBuilder()>
	//*  14   28:aload           4
	//*  15   30:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//*  16   33:ldc1            #196 <String "|">
	//*  17   35:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//*  18   38:invokevirtual   #200 <Method String StringBuilder.toString()>
	//*  19   41:astore          4
	//*  20   43:aload_3         
	//*  21   44:ifnull          54
	//*  22   47:aload_3         
	//*  23   48:invokevirtual   #205 <Method int String.length()>
	//*  24   51:ifne            119
	//*  25   54:new             #189 <Class StringBuilder>
	//*  26   57:dup             
	//*  27   58:invokespecial   #190 <Method void StringBuilder()>
	//*  28   61:aload           4
	//*  29   63:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//*  30   66:ldc1            #187 <String "#">
	//*  31   68:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//*  32   71:invokevirtual   #200 <Method String StringBuilder.toString()>
	//*  33   74:astore_3        
	//*  34   75:getstatic       #60  <Field Class TAG>
	//*  35   78:new             #189 <Class StringBuilder>
	//*  36   81:dup             
	//*  37   82:invokespecial   #190 <Method void StringBuilder()>
	//*  38   85:ldc1            #207 <String "setProcessSDKVersion version : ">
	//*  39   87:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//*  40   90:aload_3         
	//*  41   91:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//*  42   94:invokevirtual   #200 <Method String StringBuilder.toString()>
	//*  43   97:invokestatic    #142 <Method void LOG.d(Class, String)>
	//*  44  100:aload_0         
	//*  45  101:getfield        #82  <Field SparseArray mSDKVersion>
	//*  46  104:iload_1         
	//*  47  105:aload_3         
	//*  48  106:invokevirtual   #211 <Method void SparseArray.put(int, Object)>
	//*  49  109:return          
			s1 = Integer.toString(j);
	//   50  110:iload_2         
	//   51  111:invokestatic    #216 <Method String Integer.toString(int)>
	//   52  114:astore          4
		s1 = (new StringBuilder()).append(s1).append("|").toString();
		if(s == null || s.length() == 0)
			s = (new StringBuilder()).append(s1).append("#").toString();
		else
	//*  53  116:goto            21
			s = (new StringBuilder()).append(s1).append(s).toString();
	//   54  119:new             #189 <Class StringBuilder>
	//   55  122:dup             
	//   56  123:invokespecial   #190 <Method void StringBuilder()>
	//   57  126:aload           4
	//   58  128:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   59  131:aload_3         
	//   60  132:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   61  135:invokevirtual   #200 <Method String StringBuilder.toString()>
	//   62  138:astore_3        
		LOG.d(TAG, (new StringBuilder()).append("setProcessSDKVersion version : ").append(s).toString());
		mSDKVersion.put(i, ((Object) (s)));
	//*  63  139:goto            75
	}

	public void deinitializeSensorManager()
	{
		LOG.d(TAG, "deinitialize()");
	//    0    0:getstatic       #60  <Field Class TAG>
	//    1    3:ldc1            #219 <String "deinitialize()">
	//    2    5:invokestatic    #142 <Method void LOG.d(Class, String)>
		for(int i = 1; i < 2; i++)
	//*   3    8:iconst_1        
	//*   4    9:istore_1        
	//*   5   10:iload_1         
	//*   6   11:iconst_2        
	//*   7   12:icmpge          30
			getSensorManager(i).deinitialize();
	//    8   15:aload_0         
	//    9   16:iload_1         
	//   10   17:invokespecial   #113 <Method BaseSensorManager getSensorManager(int)>
	//   11   20:invokevirtual   #222 <Method void BaseSensorManager.deinitialize()>

	//   12   23:iload_1         
	//   13   24:iconst_1        
	//   14   25:iadd            
	//   15   26:istore_1        
	//*  16   27:goto            10
	//   17   30:return          
	}

	public IBinder onBind(Intent intent)
	{
		int i = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_2        
		String s = null;
	//    2    2:aconst_null     
	//    3    3:astore_3        
		if(intent.hasExtra("VERSION_CODE"))
	//*   4    4:aload_1         
	//*   5    5:ldc1            #41  <String "VERSION_CODE">
	//*   6    7:invokevirtual   #229 <Method boolean Intent.hasExtra(String)>
	//*   7   10:ifeq            21
			i = intent.getIntExtra("VERSION_CODE", -1);
	//    8   13:aload_1         
	//    9   14:ldc1            #41  <String "VERSION_CODE">
	//   10   16:iconst_m1       
	//   11   17:invokevirtual   #233 <Method int Intent.getIntExtra(String, int)>
	//   12   20:istore_2        
		if(intent.hasExtra("VERSION_NAME"))
	//*  13   21:aload_1         
	//*  14   22:ldc1            #43  <String "VERSION_NAME">
	//*  15   24:invokevirtual   #229 <Method boolean Intent.hasExtra(String)>
	//*  16   27:ifeq            37
			s = intent.getStringExtra("VERSION_NAME");
	//   17   30:aload_1         
	//   18   31:ldc1            #43  <String "VERSION_NAME">
	//   19   33:invokevirtual   #237 <Method String Intent.getStringExtra(String)>
	//   20   36:astore_3        
		setProcessSDKVersion(Binder.getCallingPid(), i, s);
	//   21   37:aload_0         
	//   22   38:invokestatic    #240 <Method int Binder.getCallingPid()>
	//   23   41:iload_2         
	//   24   42:aload_3         
	//   25   43:invokespecial   #242 <Method void setProcessSDKVersion(int, int, String)>
		return ((IBinder) (mBinder));
	//   26   46:aload_0         
	//   27   47:getfield        #92  <Field com.samsung.android.sdk.health.sensor._PlatformSensorService$Stub mBinder>
	//   28   50:areturn         
	}

	public void onCreate()
	{
		LOG.setLogger();
	//    0    0:invokestatic    #246 <Method void LOG.setLogger()>
		super.onCreate();
	//    1    3:aload_0         
	//    2    4:invokespecial   #248 <Method void Service.onCreate()>
		LOG.d(TAG, "[SensorService] onCreate() DEBUGING_MODE = true");
	//    3    7:getstatic       #60  <Field Class TAG>
	//    4   10:ldc1            #250 <String "[SensorService] onCreate() DEBUGING_MODE = true">
	//    5   12:invokestatic    #142 <Method void LOG.d(Class, String)>
		FeatureChecker.init(((android.content.Context) (this)));
	//    6   15:aload_0         
	//    7   16:invokestatic    #256 <Method void FeatureChecker.init(android.content.Context)>
		initializeSensorManager(mSensorListener);
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #87  <Field PrivilegeSensorService$SensorListener mSensorListener>
	//   11   24:invokespecial   #258 <Method void initializeSensorManager(PrivilegeSensorService$SensorListener)>
	//   12   27:return          
	}

	public void onDestroy()
	{
		LOG.d(TAG, "[SensorService] onDestroy()");
	//    0    0:getstatic       #60  <Field Class TAG>
	//    1    3:ldc2            #261 <String "[SensorService] onDestroy()">
	//    2    6:invokestatic    #142 <Method void LOG.d(Class, String)>
		deinitializeSensorManager();
	//    3    9:aload_0         
	//    4   10:invokevirtual   #263 <Method void deinitializeSensorManager()>
		super.onDestroy();
	//    5   13:aload_0         
	//    6   14:invokespecial   #265 <Method void Service.onDestroy()>
	//    7   17:return          
	}

	public int onStartCommand(Intent intent, int i, int j)
	{
		LOG.d(TAG, (new StringBuilder()).append("[SensorService] onStartCommand() - flags : ").append(i).append(" startId : ").append(j).toString());
	//    0    0:getstatic       #60  <Field Class TAG>
	//    1    3:new             #189 <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #190 <Method void StringBuilder()>
	//    4   10:ldc2            #269 <String "[SensorService] onStartCommand() - flags : ">
	//    5   13:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//    6   16:iload_2         
	//    7   17:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
	//    8   20:ldc2            #274 <String " startId : ">
	//    9   23:invokevirtual   #194 <Method StringBuilder StringBuilder.append(String)>
	//   10   26:iload_3         
	//   11   27:invokevirtual   #272 <Method StringBuilder StringBuilder.append(int)>
	//   12   30:invokevirtual   #200 <Method String StringBuilder.toString()>
	//   13   33:invokestatic    #142 <Method void LOG.d(Class, String)>
		if(!Build.MANUFACTURER.toUpperCase(Locale.US).contains("SAMSUNG"))
	//*  14   36:getstatic       #279 <Field String Build.MANUFACTURER>
	//*  15   39:getstatic       #285 <Field Locale Locale.US>
	//*  16   42:invokevirtual   #289 <Method String String.toUpperCase(Locale)>
	//*  17   45:ldc2            #291 <String "SAMSUNG">
	//*  18   48:invokevirtual   #295 <Method boolean String.contains(CharSequence)>
	//*  19   51:ifne            67
		{
			LOG.e(TAG, "This device is not SAMSUNG device. finish");
	//   20   54:getstatic       #60  <Field Class TAG>
	//   21   57:ldc2            #297 <String "This device is not SAMSUNG device. finish">
	//   22   60:invokestatic    #300 <Method void LOG.e(Class, String)>
			super.onDestroy();
	//   23   63:aload_0         
	//   24   64:invokespecial   #265 <Method void Service.onDestroy()>
		}
		return 1;
	//   25   67:iconst_1        
	//   26   68:ireturn         
	}

	public boolean onUnbind(Intent intent)
	{
		LOG.e(TAG, "onUnbind called");
	//    0    0:getstatic       #60  <Field Class TAG>
	//    1    3:ldc2            #304 <String "onUnbind called">
	//    2    6:invokestatic    #300 <Method void LOG.e(Class, String)>
		return super.onUnbind(intent);
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:invokespecial   #306 <Method boolean Service.onUnbind(Intent)>
	//    6   14:ireturn         
	}

	private static final int API_VERSION = 1;
	private static final boolean DEBUGING_MODE = true;
	private static final String FEATURE_HEALTHCOVER = "com.sec.feature.healthcover";
	private static final int HANDLER_BULK_DATA_RECEIVED = 104;
	private static final int HANDLER_DATA_RECEIVED = 102;
	private static final int HANDLER_DATA_STARTED = 101;
	private static final int HANDLER_DATA_STOPED = 103;
	private static final Class TAG = com/sec/android/service/health/sensor/PrivilegeSensorService;
	private static final int TYPE_BASE = 0x10000;
	private static final int TYPE_BLOOD_GLUCOSE = 0x1001f;
	private static final int TYPE_BODY_TEMPERATURE = 0x1001e;
	private static final int TYPE_HEART_RATE_MONITOR = 0x1001a;
	private static final String VERSION_CODE = "VERSION_CODE";
	private static final String VERSION_NAME = "VERSION_NAME";
	public static final Object beginBroadcast = new Object();
	private static final Handler mCbHandler = new Handler() {

		public void handleMessage(Message message)
		{
			Object obj1;
			obj1 = ((Object) (message.getData()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #21  <Method Bundle Message.getData()>
		//    2    4:astore          5
			LOG.d(PrivilegeSensorService.TAG, (new StringBuilder()).append("[SensorListener] mCbHandler handleMessage msg.what : ").append(message.what).toString());
		//    3    6:invokestatic    #25  <Method Class PrivilegeSensorService.access$100()>
		//    4    9:new             #27  <Class StringBuilder>
		//    5   12:dup             
		//    6   13:invokespecial   #28  <Method void StringBuilder()>
		//    7   16:ldc1            #30  <String "[SensorListener] mCbHandler handleMessage msg.what : ">
		//    8   18:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
		//    9   21:aload_1         
		//   10   22:getfield        #38  <Field int Message.what>
		//   11   25:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
		//   12   28:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   13   31:invokestatic    #51  <Method void LOG.d(Class, String)>
			message.what;
		//   14   34:aload_1         
		//   15   35:getfield        #38  <Field int Message.what>
			JVM INSTR tableswitch 101 104: default 68
		//		               101 536
		//		               102 308
		//		               103 700
		//		               104 77;
		//   16   38:tableswitch     101 104: default 68
		//		               101 536
		//		               102 308
		//		               103 700
		//		               104 77
			   goto _L1 _L2 _L3 _L4 _L5
_L1:
			LOG.e(PrivilegeSensorService.TAG, "[SensorListener] handleMessage case default");
		//   17   68:invokestatic    #25  <Method Class PrivilegeSensorService.access$100()>
		//   18   71:ldc1            #53  <String "[SensorListener] handleMessage case default">
		//   19   73:invokestatic    #56  <Method void LOG.e(Class, String)>
_L7:
			return;
		//   20   76:return          
_L5:
			Bundle abundle[];
			RemoteCallbackList remotecallbacklist;
			abundle = null;
		//   21   77:aconst_null     
		//   22   78:astore          4
			if(((Bundle) (obj1)).containsKey("_Extra"))
		//*  23   80:aload           5
		//*  24   82:ldc1            #58  <String "_Extra">
		//*  25   84:invokevirtual   #64  <Method boolean Bundle.containsKey(String)>
		//*  26   87:ifeq            105
				abundle = (Bundle[])(Bundle[])((Bundle) (obj1)).getParcelableArray("_Extra");
		//   27   90:aload           5
		//   28   92:ldc1            #58  <String "_Extra">
		//   29   94:invokevirtual   #68  <Method android.os.Parcelable[] Bundle.getParcelableArray(String)>
		//   30   97:checkcast       #70  <Class Bundle[]>
		//   31  100:checkcast       #70  <Class Bundle[]>
		//   32  103:astore          4
			remotecallbacklist = (RemoteCallbackList)message.obj;
		//   33  105:aload_1         
		//   34  106:getfield        #74  <Field Object Message.obj>
		//   35  109:checkcast       #76  <Class RemoteCallbackList>
		//   36  112:astore          6
			if(remotecallbacklist == null) goto _L7; else goto _L6
		//   37  114:aload           6
		//   38  116:ifnull          76
_L6:
			obj1 = PrivilegeSensorService.beginBroadcast;
		//   39  119:getstatic       #79  <Field Object PrivilegeSensorService.beginBroadcast>
		//   40  122:astore          5
			obj1;
		//   41  124:aload           5
			JVM INSTR monitorenter ;
		//   42  126:monitorenter    
			int j;
			j = remotecallbacklist.beginBroadcast();
		//   43  127:aload           6
		//   44  129:invokevirtual   #82  <Method int RemoteCallbackList.beginBroadcast()>
		//   45  132:istore_3        
			LOG.d(PrivilegeSensorService.TAG, (new StringBuilder()).append("HANDLER_DATA_RECEIVED broadcastNum = ").append(j).toString());
		//   46  133:invokestatic    #25  <Method Class PrivilegeSensorService.access$100()>
		//   47  136:new             #27  <Class StringBuilder>
		//   48  139:dup             
		//   49  140:invokespecial   #28  <Method void StringBuilder()>
		//   50  143:ldc1            #84  <String "HANDLER_DATA_RECEIVED broadcastNum = ">
		//   51  145:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
		//   52  148:iload_3         
		//   53  149:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
		//   54  152:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   55  155:invokestatic    #51  <Method void LOG.d(Class, String)>
			int i = 0;
		//   56  158:iconst_0        
		//   57  159:istore_2        
_L14:
			if(i >= j) goto _L9; else goto _L8
		//   58  160:iload_2         
		//   59  161:iload_3         
		//   60  162:icmpge          299
_L8:
			if(remotecallbacklist.getBroadcastItem(i) == null) goto _L11; else goto _L10
		//   61  165:aload           6
		//   62  167:iload_2         
		//   63  168:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   64  171:ifnull          199
_L10:
			if(abundle == null) goto _L13; else goto _L12
		//   65  174:aload           4
		//   66  176:ifnull          227
_L12:
			((_PlatformSensorDataListener)remotecallbacklist.getBroadcastItem(i)).onBulkDataReceived(message.arg1, abundle);
		//   67  179:aload           6
		//   68  181:iload_2         
		//   69  182:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   70  185:checkcast       #90  <Class _PlatformSensorDataListener>
		//   71  188:aload_1         
		//   72  189:getfield        #93  <Field int Message.arg1>
		//   73  192:aload           4
		//   74  194:invokeinterface #97  <Method void _PlatformSensorDataListener.onBulkDataReceived(int, Bundle[])>
_L11:
			if(remotecallbacklist.getBroadcastItem(i) != null)
		//*  75  199:aload           6
		//*  76  201:iload_2         
		//*  77  202:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//*  78  205:ifnull          220
				remotecallbacklist.unregister(remotecallbacklist.getBroadcastItem(i));
		//   79  208:aload           6
		//   80  210:aload           6
		//   81  212:iload_2         
		//   82  213:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//   83  216:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//   84  219:pop             
_L16:
			i++;
		//   85  220:iload_2         
		//   86  221:iconst_1        
		//   87  222:iadd            
		//   88  223:istore_2        
			  goto _L14
		//*  89  224:goto            160
_L13:
			LOG.e(PrivilegeSensorService.TAG, "HANDLER_DATA_RECEIVED  data and extra are null");
		//   90  227:invokestatic    #25  <Method Class PrivilegeSensorService.access$100()>
		//   91  230:ldc1            #103 <String "HANDLER_DATA_RECEIVED  data and extra are null">
		//   92  232:invokestatic    #56  <Method void LOG.e(Class, String)>
			  goto _L11
		//*  93  235:goto            199
			RemoteException remoteexception1;
			remoteexception1;
		//   94  238:astore          7
			remoteexception1.printStackTrace();
		//   95  240:aload           7
		//   96  242:invokevirtual   #106 <Method void RemoteException.printStackTrace()>
			if(remotecallbacklist.getBroadcastItem(i) == null) goto _L16; else goto _L15
		//   97  245:aload           6
		//   98  247:iload_2         
		//   99  248:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  100  251:ifnull          220
_L15:
			remotecallbacklist.unregister(remotecallbacklist.getBroadcastItem(i));
		//  101  254:aload           6
		//  102  256:aload           6
		//  103  258:iload_2         
		//  104  259:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  105  262:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//  106  265:pop             
			  goto _L16
		//* 107  266:goto            220
			message;
		//  108  269:astore_1        
			obj1;
		//  109  270:aload           5
			JVM INSTR monitorexit ;
		//  110  272:monitorexit     
			throw message;
		//  111  273:aload_1         
		//  112  274:athrow          
			message;
		//  113  275:astore_1        
			if(remotecallbacklist.getBroadcastItem(i) != null)
		//* 114  276:aload           6
		//* 115  278:iload_2         
		//* 116  279:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//* 117  282:ifnull          297
				remotecallbacklist.unregister(remotecallbacklist.getBroadcastItem(i));
		//  118  285:aload           6
		//  119  287:aload           6
		//  120  289:iload_2         
		//  121  290:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  122  293:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//  123  296:pop             
			throw message;
		//  124  297:aload_1         
		//  125  298:athrow          
_L9:
			remotecallbacklist.finishBroadcast();
		//  126  299:aload           6
		//  127  301:invokevirtual   #109 <Method void RemoteCallbackList.finishBroadcast()>
			obj1;
		//  128  304:aload           5
			JVM INSTR monitorexit ;
		//  129  306:monitorexit     
			return;
		//  130  307:return          
_L3:
			Object obj;
			obj = null;
		//  131  308:aconst_null     
		//  132  309:astore          4
			if(((Bundle) (obj1)).containsKey("_Extra"))
		//* 133  311:aload           5
		//* 134  313:ldc1            #58  <String "_Extra">
		//* 135  315:invokevirtual   #64  <Method boolean Bundle.containsKey(String)>
		//* 136  318:ifeq            333
				obj = ((Object) ((Bundle)((Bundle) (obj1)).getParcelable("_Extra")));
		//  137  321:aload           5
		//  138  323:ldc1            #58  <String "_Extra">
		//  139  325:invokevirtual   #113 <Method android.os.Parcelable Bundle.getParcelable(String)>
		//  140  328:checkcast       #60  <Class Bundle>
		//  141  331:astore          4
			remotecallbacklist = (RemoteCallbackList)message.obj;
		//  142  333:aload_1         
		//  143  334:getfield        #74  <Field Object Message.obj>
		//  144  337:checkcast       #76  <Class RemoteCallbackList>
		//  145  340:astore          6
			if(remotecallbacklist == null) goto _L7; else goto _L17
		//  146  342:aload           6
		//  147  344:ifnull          76
_L17:
			obj1 = PrivilegeSensorService.beginBroadcast;
		//  148  347:getstatic       #79  <Field Object PrivilegeSensorService.beginBroadcast>
		//  149  350:astore          5
			obj1;
		//  150  352:aload           5
			JVM INSTR monitorenter ;
		//  151  354:monitorenter    
			j = remotecallbacklist.beginBroadcast();
		//  152  355:aload           6
		//  153  357:invokevirtual   #82  <Method int RemoteCallbackList.beginBroadcast()>
		//  154  360:istore_3        
			LOG.d(PrivilegeSensorService.TAG, (new StringBuilder()).append("HANDLER_DATA_RECEIVED broadcastNum = ").append(j).toString());
		//  155  361:invokestatic    #25  <Method Class PrivilegeSensorService.access$100()>
		//  156  364:new             #27  <Class StringBuilder>
		//  157  367:dup             
		//  158  368:invokespecial   #28  <Method void StringBuilder()>
		//  159  371:ldc1            #84  <String "HANDLER_DATA_RECEIVED broadcastNum = ">
		//  160  373:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
		//  161  376:iload_3         
		//  162  377:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
		//  163  380:invokevirtual   #45  <Method String StringBuilder.toString()>
		//  164  383:invokestatic    #51  <Method void LOG.d(Class, String)>
			i = 0;
		//  165  386:iconst_0        
		//  166  387:istore_2        
_L24:
			if(i >= j) goto _L19; else goto _L18
		//  167  388:iload_2         
		//  168  389:iload_3         
		//  169  390:icmpge          527
_L18:
			if(remotecallbacklist.getBroadcastItem(i) == null) goto _L21; else goto _L20
		//  170  393:aload           6
		//  171  395:iload_2         
		//  172  396:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  173  399:ifnull          427
_L20:
			if(obj == null) goto _L23; else goto _L22
		//  174  402:aload           4
		//  175  404:ifnull          455
_L22:
			((_PlatformSensorDataListener)remotecallbacklist.getBroadcastItem(i)).onDataReceived(message.arg1, ((Bundle) (obj)));
		//  176  407:aload           6
		//  177  409:iload_2         
		//  178  410:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  179  413:checkcast       #90  <Class _PlatformSensorDataListener>
		//  180  416:aload_1         
		//  181  417:getfield        #93  <Field int Message.arg1>
		//  182  420:aload           4
		//  183  422:invokeinterface #117 <Method void _PlatformSensorDataListener.onDataReceived(int, Bundle)>
_L21:
			if(remotecallbacklist.getBroadcastItem(i) != null)
		//* 184  427:aload           6
		//* 185  429:iload_2         
		//* 186  430:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//* 187  433:ifnull          448
				remotecallbacklist.unregister(remotecallbacklist.getBroadcastItem(i));
		//  188  436:aload           6
		//  189  438:aload           6
		//  190  440:iload_2         
		//  191  441:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  192  444:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//  193  447:pop             
_L26:
			i++;
		//  194  448:iload_2         
		//  195  449:iconst_1        
		//  196  450:iadd            
		//  197  451:istore_2        
			  goto _L24
		//* 198  452:goto            388
_L23:
			LOG.e(PrivilegeSensorService.TAG, "HANDLER_DATA_RECEIVED  data and extra are null");
		//  199  455:invokestatic    #25  <Method Class PrivilegeSensorService.access$100()>
		//  200  458:ldc1            #103 <String "HANDLER_DATA_RECEIVED  data and extra are null">
		//  201  460:invokestatic    #56  <Method void LOG.e(Class, String)>
			  goto _L21
		//* 202  463:goto            427
			remoteexception1;
		//  203  466:astore          7
			remoteexception1.printStackTrace();
		//  204  468:aload           7
		//  205  470:invokevirtual   #106 <Method void RemoteException.printStackTrace()>
			if(remotecallbacklist.getBroadcastItem(i) == null) goto _L26; else goto _L25
		//  206  473:aload           6
		//  207  475:iload_2         
		//  208  476:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  209  479:ifnull          448
_L25:
			remotecallbacklist.unregister(remotecallbacklist.getBroadcastItem(i));
		//  210  482:aload           6
		//  211  484:aload           6
		//  212  486:iload_2         
		//  213  487:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  214  490:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//  215  493:pop             
			  goto _L26
		//* 216  494:goto            448
			message;
		//  217  497:astore_1        
			obj1;
		//  218  498:aload           5
			JVM INSTR monitorexit ;
		//  219  500:monitorexit     
			throw message;
		//  220  501:aload_1         
		//  221  502:athrow          
			message;
		//  222  503:astore_1        
			if(remotecallbacklist.getBroadcastItem(i) != null)
		//* 223  504:aload           6
		//* 224  506:iload_2         
		//* 225  507:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//* 226  510:ifnull          525
				remotecallbacklist.unregister(remotecallbacklist.getBroadcastItem(i));
		//  227  513:aload           6
		//  228  515:aload           6
		//  229  517:iload_2         
		//  230  518:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  231  521:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//  232  524:pop             
			throw message;
		//  233  525:aload_1         
		//  234  526:athrow          
_L19:
			remotecallbacklist.finishBroadcast();
		//  235  527:aload           6
		//  236  529:invokevirtual   #109 <Method void RemoteCallbackList.finishBroadcast()>
			obj1;
		//  237  532:aload           5
			JVM INSTR monitorexit ;
		//  238  534:monitorexit     
			return;
		//  239  535:return          
_L2:
			obj1 = ((Object) ((RemoteCallbackList)message.obj));
		//  240  536:aload_1         
		//  241  537:getfield        #74  <Field Object Message.obj>
		//  242  540:checkcast       #76  <Class RemoteCallbackList>
		//  243  543:astore          5
			if(obj1 == null) goto _L7; else goto _L27
		//  244  545:aload           5
		//  245  547:ifnull          76
_L27:
			obj = PrivilegeSensorService.beginBroadcast;
		//  246  550:getstatic       #79  <Field Object PrivilegeSensorService.beginBroadcast>
		//  247  553:astore          4
			obj;
		//  248  555:aload           4
			JVM INSTR monitorenter ;
		//  249  557:monitorenter    
			j = ((RemoteCallbackList) (obj1)).beginBroadcast();
		//  250  558:aload           5
		//  251  560:invokevirtual   #82  <Method int RemoteCallbackList.beginBroadcast()>
		//  252  563:istore_3        
			i = 0;
		//  253  564:iconst_0        
		//  254  565:istore_2        
_L29:
			if(i >= j)
				break; /* Loop/switch isn't completed */
		//  255  566:iload_2         
		//  256  567:iload_3         
		//  257  568:icmpge          691
			if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) != null)
		//* 258  571:aload           5
		//* 259  573:iload_2         
		//* 260  574:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//* 261  577:ifnull          602
				((_PlatformSensorDataListener)((RemoteCallbackList) (obj1)).getBroadcastItem(i)).onDataStarted(message.arg1, message.arg2);
		//  262  580:aload           5
		//  263  582:iload_2         
		//  264  583:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  265  586:checkcast       #90  <Class _PlatformSensorDataListener>
		//  266  589:aload_1         
		//  267  590:getfield        #93  <Field int Message.arg1>
		//  268  593:aload_1         
		//  269  594:getfield        #120 <Field int Message.arg2>
		//  270  597:invokeinterface #124 <Method void _PlatformSensorDataListener.onDataStarted(int, int)>
			if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) != null)
		//* 271  602:aload           5
		//* 272  604:iload_2         
		//* 273  605:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//* 274  608:ifnull          623
				((RemoteCallbackList) (obj1)).unregister(((RemoteCallbackList) (obj1)).getBroadcastItem(i));
		//  275  611:aload           5
		//  276  613:aload           5
		//  277  615:iload_2         
		//  278  616:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  279  619:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//  280  622:pop             
_L31:
			i++;
		//  281  623:iload_2         
		//  282  624:iconst_1        
		//  283  625:iadd            
		//  284  626:istore_2        
			if(true) goto _L29; else goto _L28
		//  285  627:goto            566
			RemoteException remoteexception;
			remoteexception;
		//  286  630:astore          6
			remoteexception.printStackTrace();
		//  287  632:aload           6
		//  288  634:invokevirtual   #106 <Method void RemoteException.printStackTrace()>
			if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) == null) goto _L31; else goto _L30
		//  289  637:aload           5
		//  290  639:iload_2         
		//  291  640:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  292  643:ifnull          623
_L30:
			((RemoteCallbackList) (obj1)).unregister(((RemoteCallbackList) (obj1)).getBroadcastItem(i));
		//  293  646:aload           5
		//  294  648:aload           5
		//  295  650:iload_2         
		//  296  651:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  297  654:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//  298  657:pop             
			  goto _L31
		//* 299  658:goto            623
			message;
		//  300  661:astore_1        
			obj;
		//  301  662:aload           4
			JVM INSTR monitorexit ;
		//  302  664:monitorexit     
			throw message;
		//  303  665:aload_1         
		//  304  666:athrow          
			message;
		//  305  667:astore_1        
			if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) != null)
		//* 306  668:aload           5
		//* 307  670:iload_2         
		//* 308  671:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//* 309  674:ifnull          689
				((RemoteCallbackList) (obj1)).unregister(((RemoteCallbackList) (obj1)).getBroadcastItem(i));
		//  310  677:aload           5
		//  311  679:aload           5
		//  312  681:iload_2         
		//  313  682:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  314  685:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//  315  688:pop             
			throw message;
		//  316  689:aload_1         
		//  317  690:athrow          
_L28:
			((RemoteCallbackList) (obj1)).finishBroadcast();
		//  318  691:aload           5
		//  319  693:invokevirtual   #109 <Method void RemoteCallbackList.finishBroadcast()>
			obj;
		//  320  696:aload           4
			JVM INSTR monitorexit ;
		//  321  698:monitorexit     
			return;
		//  322  699:return          
_L4:
			obj1 = ((Object) ((RemoteCallbackList)message.obj));
		//  323  700:aload_1         
		//  324  701:getfield        #74  <Field Object Message.obj>
		//  325  704:checkcast       #76  <Class RemoteCallbackList>
		//  326  707:astore          5
			if(obj1 == null) goto _L7; else goto _L32
		//  327  709:aload           5
		//  328  711:ifnull          76
_L32:
			obj = PrivilegeSensorService.beginBroadcast;
		//  329  714:getstatic       #79  <Field Object PrivilegeSensorService.beginBroadcast>
		//  330  717:astore          4
			obj;
		//  331  719:aload           4
			JVM INSTR monitorenter ;
		//  332  721:monitorenter    
			j = ((RemoteCallbackList) (obj1)).beginBroadcast();
		//  333  722:aload           5
		//  334  724:invokevirtual   #82  <Method int RemoteCallbackList.beginBroadcast()>
		//  335  727:istore_3        
			i = 0;
		//  336  728:iconst_0        
		//  337  729:istore_2        
_L34:
			if(i >= j)
				break; /* Loop/switch isn't completed */
		//  338  730:iload_2         
		//  339  731:iload_3         
		//  340  732:icmpge          855
			if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) != null)
		//* 341  735:aload           5
		//* 342  737:iload_2         
		//* 343  738:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//* 344  741:ifnull          766
				((_PlatformSensorDataListener)((RemoteCallbackList) (obj1)).getBroadcastItem(i)).onDataStopped(message.arg1, message.arg2);
		//  345  744:aload           5
		//  346  746:iload_2         
		//  347  747:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  348  750:checkcast       #90  <Class _PlatformSensorDataListener>
		//  349  753:aload_1         
		//  350  754:getfield        #93  <Field int Message.arg1>
		//  351  757:aload_1         
		//  352  758:getfield        #120 <Field int Message.arg2>
		//  353  761:invokeinterface #127 <Method void _PlatformSensorDataListener.onDataStopped(int, int)>
			if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) != null)
		//* 354  766:aload           5
		//* 355  768:iload_2         
		//* 356  769:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//* 357  772:ifnull          787
				((RemoteCallbackList) (obj1)).unregister(((RemoteCallbackList) (obj1)).getBroadcastItem(i));
		//  358  775:aload           5
		//  359  777:aload           5
		//  360  779:iload_2         
		//  361  780:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  362  783:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//  363  786:pop             
_L36:
			i++;
		//  364  787:iload_2         
		//  365  788:iconst_1        
		//  366  789:iadd            
		//  367  790:istore_2        
			if(true) goto _L34; else goto _L33
		//  368  791:goto            730
			remoteexception;
		//  369  794:astore          6
			remoteexception.printStackTrace();
		//  370  796:aload           6
		//  371  798:invokevirtual   #106 <Method void RemoteException.printStackTrace()>
			if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) == null) goto _L36; else goto _L35
		//  372  801:aload           5
		//  373  803:iload_2         
		//  374  804:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  375  807:ifnull          787
_L35:
			((RemoteCallbackList) (obj1)).unregister(((RemoteCallbackList) (obj1)).getBroadcastItem(i));
		//  376  810:aload           5
		//  377  812:aload           5
		//  378  814:iload_2         
		//  379  815:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  380  818:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//  381  821:pop             
			  goto _L36
		//* 382  822:goto            787
			message;
		//  383  825:astore_1        
			obj;
		//  384  826:aload           4
			JVM INSTR monitorexit ;
		//  385  828:monitorexit     
			throw message;
		//  386  829:aload_1         
		//  387  830:athrow          
			message;
		//  388  831:astore_1        
			if(((RemoteCallbackList) (obj1)).getBroadcastItem(i) != null)
		//* 389  832:aload           5
		//* 390  834:iload_2         
		//* 391  835:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//* 392  838:ifnull          853
				((RemoteCallbackList) (obj1)).unregister(((RemoteCallbackList) (obj1)).getBroadcastItem(i));
		//  393  841:aload           5
		//  394  843:aload           5
		//  395  845:iload_2         
		//  396  846:invokevirtual   #88  <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
		//  397  849:invokevirtual   #101 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//  398  852:pop             
			throw message;
		//  399  853:aload_1         
		//  400  854:athrow          
_L33:
			((RemoteCallbackList) (obj1)).finishBroadcast();
		//  401  855:aload           5
		//  402  857:invokevirtual   #109 <Method void RemoteCallbackList.finishBroadcast()>
			obj;
		//  403  860:aload           4
			JVM INSTR monitorexit ;
		//  404  862:monitorexit     
		//  405  863:return          
		}

	}
;
	private final com.samsung.android.sdk.health.sensor._PlatformSensorService.Stub mBinder = new com.samsung.android.sdk.health.sensor._PlatformSensorService.Stub() {

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
				LOG.d(PrivilegeSensorService.TAG, "[SensorListener] checkAvailability : Security exception - Caller application not privileged");
		//    7   17:invokestatic    #34  <Method Class PrivilegeSensorService.access$100()>
		//    8   20:ldc1            #36  <String "[SensorListener] checkAvailability : Security exception - Caller application not privileged">
		//    9   22:invokestatic    #42  <Method void LOG.d(Class, String)>
			else
		//*  10   25:iconst_1        
		//*  11   26:ireturn         
			if(isFeatureEnabled(i, k))
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
				LOG.d(PrivilegeSensorService.TAG, "[SensorListener] close : Security exception - Caller application not privileged");
		//    7   17:invokestatic    #34  <Method Class PrivilegeSensorService.access$100()>
		//    8   20:ldc1            #51  <String "[SensorListener] close : Security exception - Caller application not privileged">
		//    9   22:invokestatic    #42  <Method void LOG.d(Class, String)>
				return;
		//   10   25:return          
			} else
			{
				getSensorManager(_pprivilegesensordevice.getConnectivityType()).close(_pprivilegesensordevice);
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
				LOG.d(PrivilegeSensorService.TAG, "[SensorListener] getAPIVersion : Security exception - Caller application not privileged");
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
				LOG.d(PrivilegeSensorService.TAG, "[SensorListener] getConnectedDevices : Security exception - Caller application not privileged");
		//    7   17:invokestatic    #34  <Method Class PrivilegeSensorService.access$100()>
		//    8   20:ldc1            #72  <String "[SensorListener] getConnectedDevices : Security exception - Caller application not privileged">
		//    9   22:invokestatic    #42  <Method void LOG.d(Class, String)>
				return null;
		//   10   25:aconst_null     
		//   11   26:areturn         
			} else
			{
				return getSensorManager(i).getConnectedDevices(new Filter(j, k, ((String) (null))));
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
				LOG.d(PrivilegeSensorService.TAG, "[SensorListener] registerListener : Security exception - Caller application not privileged");
		//    7   17:invokestatic    #34  <Method Class PrivilegeSensorService.access$100()>
		//    8   20:ldc1            #86  <String "[SensorListener] registerListener : Security exception - Caller application not privileged">
		//    9   22:invokestatic    #42  <Method void LOG.d(Class, String)>
			else
		//*  10   25:iconst_0        
		//*  11   26:ireturn         
			if(getSensorManager(_pprivilegesensordevice.getConnectivityType()).registerListener(_pprivilegesensordevice, Integer.valueOf(_pprivilegesensordevice.getObjectId()), _pplatformsensordatalistener) == 0)
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
				LOG.d(PrivilegeSensorService.TAG, "[SensorListener] unregisterListener : Security exception - Caller application not privileged");
		//    7   17:invokestatic    #34  <Method Class PrivilegeSensorService.access$100()>
		//    8   20:ldc1            #102 <String "[SensorListener] unregisterListener : Security exception - Caller application not privileged">
		//    9   22:invokestatic    #42  <Method void LOG.d(Class, String)>
			else
		//*  10   25:iconst_0        
		//*  11   26:ireturn         
			if(getSensorManager(_pprivilegesensordevice.getConnectivityType()).unregisterListener(_pprivilegesensordevice, Integer.valueOf(_pprivilegesensordevice.getObjectId())) == 0)
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
;
	public final IBinder mForegroundToken = new Binder();
	private SparseArray mSDKVersion;
	private SensorListener mSensorListener;

	static 
	{
	//    0    0:ldc1            #2   <Class PrivilegeSensorService>
	//    1    2:putstatic       #60  <Field Class TAG>
	//    2    5:new             #62  <Class Object>
	//    3    8:dup             
	//    4    9:invokespecial   #65  <Method void Object()>
	//    5   12:putstatic       #67  <Field Object beginBroadcast>
	//    6   15:new             #8   <Class PrivilegeSensorService$2>
	//    7   18:dup             
	//    8   19:invokespecial   #68  <Method void PrivilegeSensorService$2()>
	//    9   22:putstatic       #70  <Field Handler mCbHandler>
	//*  10   25:return          
	}


/*
	static Class access$100()
	{
		return TAG;
	//    0    0:getstatic       #60  <Field Class TAG>
	//    1    3:areturn         
	}

*/


/*
	static RemoteCallbackList access$200(RemoteCallbackList remotecallbacklist)
	{
		return createRemoteCallbackListCopy(remotecallbacklist);
	//    0    0:aload_0         
	//    1    1:invokestatic    #99  <Method RemoteCallbackList createRemoteCallbackListCopy(RemoteCallbackList)>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$300()
	{
		return mCbHandler;
	//    0    0:getstatic       #70  <Field Handler mCbHandler>
	//    1    3:areturn         
	}

*/


/*
	static boolean access$400(PrivilegeSensorService privilegesensorservice, int i, int j)
	{
		return privilegesensorservice.isFeatureEnabled(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #107 <Method boolean isFeatureEnabled(int, int)>
	//    4    6:ireturn         
	}

*/


/*
	static BaseSensorManager access$500(PrivilegeSensorService privilegesensorservice, int i)
	{
		return privilegesensorservice.getSensorManager(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #113 <Method BaseSensorManager getSensorManager(int)>
	//    3    5:areturn         
	}

*/
}
