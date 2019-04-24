// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework;

import android.os.Handler;
import android.os.Message;
import com.sec.android.service.health.util.LOG;
import java.lang.ref.WeakReference;

// Referenced classes of package com.sec.android.sensor.framework:
//			SensorService

private static class SensorService$RemoteInterfaceMessageHandler extends Handler
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
			SensorService.access$400(sensorservice, message);
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokestatic    #50  <Method void SensorService.access$400(SensorService, Message)>
	//   10   20:return          
	}

	private final WeakReference mReference;

	public SensorService$RemoteInterfaceMessageHandler(SensorService sensorservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Handler()>
		LOG.i(SensorService.access$000(), "RemoteInterfaceMessageHandler()");
	//    2    4:invokestatic    #19  <Method Class SensorService.access$000()>
	//    3    7:ldc1            #21  <String "RemoteInterfaceMessageHandler()">
	//    4    9:invokestatic    #27  <Method void LOG.i(Class, String)>
		if(sensorservice == null)
	//*   5   12:aload_1         
	//*   6   13:ifnonnull       30
		{
			LOG.w(SensorService.access$000(), "RemoteInterfaceMessageHandler() SensorService is null");
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
