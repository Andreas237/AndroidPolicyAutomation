// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor;

import android.os.*;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.sec.android.service.health.sensor.manager.ISensorListener;
import com.sec.android.service.health.util.LOG;
import java.util.List;

// Referenced classes of package com.sec.android.service.health.sensor:
//			PrivilegeSensorService

private final class PrivilegeSensorService$SensorListener
	implements ISensorListener
{

	public void onDataReceived(Bundle bundle, RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int i)
	{
		LOG.d(PrivilegeSensorService.access$100(), (new StringBuilder()).append("[SensorListener] onDataReceived() deviceID : ").append(_pprivilegesensordevice.getId()).append(" processId : ").append(i).append(" deviceObjId : ").append(_pprivilegesensordevice.getObjectId()).append("Extra: ").append(((Object) (bundle))).toString());
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
			remotecallbacklist = PrivilegeSensorService.access$200(remotecallbacklist);
	//   26   63:aload_2         
	//   27   64:invokestatic    #72  <Method RemoteCallbackList PrivilegeSensorService.access$200(RemoteCallbackList)>
	//   28   67:astore_2        
			remotecallbacklist = ((RemoteCallbackList) (PrivilegeSensorService.access$300().obtainMessage(102, ((Integer)_pprivilegesensordevice.getDataType().get(0)).intValue(), -1, ((Object) (remotecallbacklist)))));
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
			PrivilegeSensorService.access$300().sendMessage(((Message) (remotecallbacklist)));
	//   52  115:invokestatic    #76  <Method Handler PrivilegeSensorService.access$300()>
	//   53  118:aload_2         
	//   54  119:invokevirtual   #116 <Method boolean Handler.sendMessage(Message)>
	//   55  122:pop             
			return;
	//   56  123:return          
		} else
		{
			LOG.e(PrivilegeSensorService.access$100(), "onDataReceived callbackList is null");
	//   57  124:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
	//   58  127:ldc1            #118 <String "onDataReceived callbackList is null">
	//   59  129:invokestatic    #121 <Method void LOG.e(Class, String)>
			return;
	//   60  132:return          
		}
	}

	public void onDataReceived(Bundle abundle[], RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int i)
	{
		LOG.d(PrivilegeSensorService.access$100(), (new StringBuilder()).append("[SensorListener] onDataReceived() deviceID : ").append(_pprivilegesensordevice.getId()).append(" processId : ").append(i).append(" deviceObjId : ").append(_pprivilegesensordevice.getObjectId()).toString());
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
			remotecallbacklist = PrivilegeSensorService.access$200(remotecallbacklist);
	//   22   54:aload_2         
	//   23   55:invokestatic    #72  <Method RemoteCallbackList PrivilegeSensorService.access$200(RemoteCallbackList)>
	//   24   58:astore_2        
			remotecallbacklist = ((RemoteCallbackList) (PrivilegeSensorService.access$300().obtainMessage(104, ((Integer)_pprivilegesensordevice.getDataType().get(0)).intValue(), -1, ((Object) (remotecallbacklist)))));
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
			PrivilegeSensorService.access$300().sendMessage(((Message) (remotecallbacklist)));
	//   48  106:invokestatic    #76  <Method Handler PrivilegeSensorService.access$300()>
	//   49  109:aload_2         
	//   50  110:invokevirtual   #116 <Method boolean Handler.sendMessage(Message)>
	//   51  113:pop             
			return;
	//   52  114:return          
		} else
		{
			LOG.e(PrivilegeSensorService.access$100(), "onDataReceived callbackList is null");
	//   53  115:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
	//   54  118:ldc1            #118 <String "onDataReceived callbackList is null">
	//   55  120:invokestatic    #121 <Method void LOG.e(Class, String)>
			return;
	//   56  123:return          
		}
	}

	public void onDataStarted(int i, int j, RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int k, int l)
	{
		LOG.d(PrivilegeSensorService.access$100(), (new StringBuilder()).append("[SensorListener] onDataStarted() dataType : ").append(i).append(" errorCode : ").append(j).append(" processId : ").append(l).append(" DevObjectId :  ").append(k).toString());
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
			LOG.e(PrivilegeSensorService.access$100(), "onDataStarted device is null");
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
			remotecallbacklist = PrivilegeSensorService.access$200(remotecallbacklist);
	//   30   72:aload_3         
	//   31   73:invokestatic    #72  <Method RemoteCallbackList PrivilegeSensorService.access$200(RemoteCallbackList)>
	//   32   76:astore_3        
			remotecallbacklist = ((RemoteCallbackList) (PrivilegeSensorService.access$300().obtainMessage(101, i, j, ((Object) (remotecallbacklist)))));
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
			PrivilegeSensorService.access$300().sendMessage(((Message) (remotecallbacklist)));
	//   45  100:invokestatic    #76  <Method Handler PrivilegeSensorService.access$300()>
	//   46  103:aload_3         
	//   47  104:invokevirtual   #116 <Method boolean Handler.sendMessage(Message)>
	//   48  107:pop             
			return;
	//   49  108:return          
		} else
		{
			LOG.e(PrivilegeSensorService.access$100(), "onDataStarted callbackList is null");
	//   50  109:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
	//   51  112:ldc1            #141 <String "onDataStarted callbackList is null">
	//   52  114:invokestatic    #121 <Method void LOG.e(Class, String)>
			return;
	//   53  117:return          
		}
	}

	public void onDataStopped(int i, int j, RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int k, int l)
	{
		LOG.d(PrivilegeSensorService.access$100(), (new StringBuilder()).append("[SensorListener] onDataStopped() dataType : ").append(i).append(" errorCode : ").append(j).append(" processId : ").append(l).append(" DevObjectId :  ").append(k).toString());
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
			LOG.e(PrivilegeSensorService.access$100(), "onDataStopped device is null");
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
			remotecallbacklist = PrivilegeSensorService.access$200(remotecallbacklist);
	//   30   72:aload_3         
	//   31   73:invokestatic    #72  <Method RemoteCallbackList PrivilegeSensorService.access$200(RemoteCallbackList)>
	//   32   76:astore_3        
			remotecallbacklist = ((RemoteCallbackList) (PrivilegeSensorService.access$300().obtainMessage(103, i, j, ((Object) (remotecallbacklist)))));
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
			PrivilegeSensorService.access$300().sendMessage(((Message) (remotecallbacklist)));
	//   45  100:invokestatic    #76  <Method Handler PrivilegeSensorService.access$300()>
	//   46  103:aload_3         
	//   47  104:invokevirtual   #116 <Method boolean Handler.sendMessage(Message)>
	//   48  107:pop             
			return;
	//   49  108:return          
		} else
		{
			LOG.d(PrivilegeSensorService.access$100(), "onDataStopped callbackList is null");
	//   50  109:invokestatic    #28  <Method Class PrivilegeSensorService.access$100()>
	//   51  112:ldc1            #149 <String "onDataStopped callbackList is null">
	//   52  114:invokestatic    #68  <Method void LOG.d(Class, String)>
			return;
	//   53  117:return          
		}
	}

	final PrivilegeSensorService this$0;

	private PrivilegeSensorService$SensorListener()
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

	PrivilegeSensorService$SensorListener(PrivilegeSensorService._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void PrivilegeSensorService$SensorListener(PrivilegeSensorService)>
	//    3    5:return          
	}
}
