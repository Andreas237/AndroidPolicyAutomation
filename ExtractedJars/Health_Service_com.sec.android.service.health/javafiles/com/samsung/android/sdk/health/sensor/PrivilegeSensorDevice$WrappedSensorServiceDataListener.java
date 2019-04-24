// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;

import android.os.Bundle;
import android.os.RemoteException;

// Referenced classes of package com.samsung.android.sdk.health.sensor:
//			PrivilegeSensorDevice, PrivilegeSensorDataListener

private final class PrivilegeSensorDevice$WrappedSensorServiceDataListener extends _PlatformSensorDataListener.Stub
{

	public void onBulkDataReceived(int i, Bundle abundle[])
		throws RemoteException
	{
		mActualListener.onReceived(i, abundle);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PrivilegeSensorDataListener mActualListener>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #30  <Method void PrivilegeSensorDataListener.onReceived(int, Bundle[])>
	//    5   11:return          
	}

	public void onDataReceived(int i, Bundle bundle)
		throws RemoteException
	{
		mActualListener.onReceived(i, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PrivilegeSensorDataListener mActualListener>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #35  <Method void PrivilegeSensorDataListener.onReceived(int, Bundle)>
	//    5   11:return          
	}

	public void onDataStarted(int i, int j)
		throws RemoteException
	{
		mActualListener.onStarted(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PrivilegeSensorDataListener mActualListener>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #40  <Method void PrivilegeSensorDataListener.onStarted(int, int)>
	//    5   11:return          
	}

	public void onDataStopped(int i, int j)
		throws RemoteException
	{
		mActualListener.onStopped(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PrivilegeSensorDataListener mActualListener>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #44  <Method void PrivilegeSensorDataListener.onStopped(int, int)>
	//    5   11:return          
	}

	private PrivilegeSensorDataListener mActualListener;
	final PrivilegeSensorDevice this$0;

	public PrivilegeSensorDevice$WrappedSensorServiceDataListener(PrivilegeSensorDataListener privilegesensordatalistener)
	{
		this$0 = PrivilegeSensorDevice.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field PrivilegeSensorDevice this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void _PlatformSensorDataListener$Stub()>
		mActualListener = privilegesensordatalistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field PrivilegeSensorDataListener mActualListener>
	//    8   14:return          
	}
}
