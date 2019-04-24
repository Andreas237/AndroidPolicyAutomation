// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import com.comscore.analytics.Core;
import com.comscore.applications.ApplicationMeasurement;
import com.comscore.applications.EventType;
import com.comscore.measurement.MeasurementDispatcher;
import java.util.HashMap;

// Referenced classes of package com.comscore.streaming:
//			StreamSense

class e
	implements Runnable
{

	e(StreamSense streamsense, HashMap hashmap, String s)
	{
		c = streamsense;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field StreamSense c>
		a = hashmap;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field HashMap a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public void run()
	{
		ApplicationMeasurement applicationmeasurement = ApplicationMeasurement.newApplicationMeasurement(c.a, EventType.HIDDEN, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field StreamSense c>
	//    2    4:getfield        #30  <Field Core StreamSense.a>
	//    3    7:getstatic       #36  <Field EventType EventType.HIDDEN>
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field HashMap a>
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field String b>
	//    8   18:invokestatic    #42  <Method ApplicationMeasurement ApplicationMeasurement.newApplicationMeasurement(Core, EventType, HashMap, String)>
	//    9   21:astore_1        
		c.a.getMeasurementDispatcher().sendMeasurmement(((com.comscore.measurement.Measurement) (applicationmeasurement)), false);
	//   10   22:aload_0         
	//   11   23:getfield        #16  <Field StreamSense c>
	//   12   26:getfield        #30  <Field Core StreamSense.a>
	//   13   29:invokevirtual   #48  <Method MeasurementDispatcher Core.getMeasurementDispatcher()>
	//   14   32:aload_1         
	//   15   33:iconst_0        
	//   16   34:invokevirtual   #54  <Method boolean MeasurementDispatcher.sendMeasurmement(com.comscore.measurement.Measurement, boolean)>
	//   17   37:pop             
	//   18   38:return          
	}

	final HashMap a;
	final String b;
	final StreamSense c;
}
