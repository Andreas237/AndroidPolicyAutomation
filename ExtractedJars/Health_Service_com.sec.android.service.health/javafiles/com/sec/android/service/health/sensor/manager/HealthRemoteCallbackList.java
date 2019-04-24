// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.manager;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.sec.android.service.health.sensor.PrivilegeSensorService;

public class HealthRemoteCallbackList extends RemoteCallbackList
{
	public static interface IHealthRemoteCallbackDiedListener
	{

		public abstract void remoteCallbackDied(_PrivilegeSensorDevice _pprivilegesensordevice, Object obj);
	}


	public HealthRemoteCallbackList(IHealthRemoteCallbackDiedListener ihealthremotecallbackdiedlistener, _PrivilegeSensorDevice _pprivilegesensordevice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void RemoteCallbackList()>
		mHealthRemoteCallbackDied = ihealthremotecallbackdiedlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field HealthRemoteCallbackList$IHealthRemoteCallbackDiedListener mHealthRemoteCallbackDied>
		device = _pprivilegesensordevice;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field _PrivilegeSensorDevice device>
	//    8   14:return          
	}

	public IInterface getListener(Integer integer)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		Object obj2 = PrivilegeSensorService.beginBroadcast;
	//    2    3:getstatic       #33  <Field Object PrivilegeSensorService.beginBroadcast>
	//    3    6:astore          5
		obj2;
	//    4    8:aload           5
		JVM INSTR monitorenter ;
	//    5   10:monitorenter    
		beginBroadcast();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #36  <Method int beginBroadcast()>
	//    8   15:pop             
		int i = 0;
	//    9   16:iconst_0        
	//   10   17:istore_2        
_L2:
		Object obj = ((Object) (obj1));
	//   11   18:aload           4
	//   12   20:astore_3        
		if(i >= getRegisteredCallbackCount())
			break MISSING_BLOCK_LABEL_59;
	//   13   21:iload_2         
	//   14   22:aload_0         
	//   15   23:invokevirtual   #39  <Method int getRegisteredCallbackCount()>
	//   16   26:icmpge          59
		obj = ((Object) ((Integer)getBroadcastCookie(i)));
	//   17   29:aload_0         
	//   18   30:iload_2         
	//   19   31:invokevirtual   #43  <Method Object getBroadcastCookie(int)>
	//   20   34:checkcast       #45  <Class Integer>
	//   21   37:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_74;
	//   22   38:aload_3         
	//   23   39:ifnull          74
		if(((Integer) (obj)).intValue() != integer.intValue())
			break MISSING_BLOCK_LABEL_74;
	//   24   42:aload_3         
	//   25   43:invokevirtual   #48  <Method int Integer.intValue()>
	//   26   46:aload_1         
	//   27   47:invokevirtual   #48  <Method int Integer.intValue()>
	//   28   50:icmpne          74
		obj = ((Object) (getBroadcastItem(i)));
	//   29   53:aload_0         
	//   30   54:iload_2         
	//   31   55:invokevirtual   #52  <Method IInterface getBroadcastItem(int)>
	//   32   58:astore_3        
		finishBroadcast();
	//   33   59:aload_0         
	//   34   60:invokevirtual   #55  <Method void finishBroadcast()>
		obj2;
	//   35   63:aload           5
		JVM INSTR monitorexit ;
	//   36   65:monitorexit     
		return ((IInterface) (obj));
	//   37   66:aload_3         
	//   38   67:areturn         
		integer;
	//   39   68:astore_1        
		obj2;
	//   40   69:aload           5
		JVM INSTR monitorexit ;
	//   41   71:monitorexit     
		throw integer;
	//   42   72:aload_1         
	//   43   73:athrow          
		i++;
	//   44   74:iload_2         
	//   45   75:iconst_1        
	//   46   76:iadd            
	//   47   77:istore_2        
		if(true) goto _L2; else goto _L1
	//   48   78:goto            18
_L1:
	}

	public void onCallbackDied(IInterface iinterface, Object obj)
	{
		super.onCallbackDied(iinterface, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #60  <Method void RemoteCallbackList.onCallbackDied(IInterface, Object)>
		mHealthRemoteCallbackDied.remoteCallbackDied(device, obj);
	//    4    6:aload_0         
	//    5    7:getfield        #20  <Field HealthRemoteCallbackList$IHealthRemoteCallbackDiedListener mHealthRemoteCallbackDied>
	//    6   10:aload_0         
	//    7   11:getfield        #22  <Field _PrivilegeSensorDevice device>
	//    8   14:aload_2         
	//    9   15:invokeinterface #64  <Method void HealthRemoteCallbackList$IHealthRemoteCallbackDiedListener.remoteCallbackDied(_PrivilegeSensorDevice, Object)>
	//   10   20:return          
	}

	_PrivilegeSensorDevice device;
	IHealthRemoteCallbackDiedListener mHealthRemoteCallbackDied;
}
