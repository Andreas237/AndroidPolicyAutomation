// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.handler.hrm;

import android.hardware.*;

// Referenced classes of package com.sec.android.service.health.sensor.handler.hrm:
//			HeartRateMonitorHandler

class HeartRateMonitorHandler$2
	implements SensorEventListener
{

	public void onAccuracyChanged(Sensor sensor, int i)
	{
	//    0    0:return          
	}

	public void onSensorChanged(SensorEvent sensorevent)
	{
	//    0    0:return          
	}

	final HeartRateMonitorHandler this$0;

	HeartRateMonitorHandler$2()
	{
		this$0 = HeartRateMonitorHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field HeartRateMonitorHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
