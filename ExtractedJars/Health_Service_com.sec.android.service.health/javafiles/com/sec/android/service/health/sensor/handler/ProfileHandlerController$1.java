// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.handler;

import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;
import com.sec.android.service.health.util.LOG;

// Referenced classes of package com.sec.android.service.health.sensor.handler:
//			ProfileHandlerController

class ProfileHandlerController$1
	implements com.sec.android.service.health.sensor.manager.ealthRemoteCallbackDiedListener
{

	public void remoteCallbackDied(_PrivilegeSensorDevice _pprivilegesensordevice, Object obj)
	{
		if(obj instanceof Integer)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #23  <Class Integer>
	//*   2    4:ifeq            32
			LOG.d(ProfileHandlerController.access$000(), (new StringBuilder()).append("RemoteCallbackDied :").append(obj).toString());
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

	ProfileHandlerController$1()
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
