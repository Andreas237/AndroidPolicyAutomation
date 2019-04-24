// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import com.comscore.analytics.Core;
import com.comscore.measurement.Measurement;
import com.comscore.measurement.MeasurementDispatcher;
import com.comscore.utils.task.TaskExecutor;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.comscore.utils:
//			TransmissionMode, CSLog

public class DispatchQueue extends ConcurrentLinkedQueue
{

	public DispatchQueue(Core core)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void ConcurrentLinkedQueue()>
		b = core;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Core b>
	//    5    9:return          
	}

	public void enqueue(Measurement measurement)
	{
		offer(measurement);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #35  <Method boolean offer(Measurement)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void enqueueSettingChange(int i, Object obj)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 75
	//	               1 62
	//	               2 46
	//	               3 33
		default:
			return;
	//    2   32:return          

		case 3: // '\003'
			b.setMeasurementLabelOrder((String[])obj, true);
	//    3   33:aload_0         
	//    4   34:getfield        #28  <Field Core b>
	//    5   37:aload_2         
	//    6   38:checkcast       #40  <Class String[]>
	//    7   41:iconst_1        
	//    8   42:invokevirtual   #46  <Method void Core.setMeasurementLabelOrder(String[], boolean)>
			return;
	//    9   45:return          

		case 2: // '\002'
			b.setSecure(((Boolean)obj).booleanValue(), true);
	//   10   46:aload_0         
	//   11   47:getfield        #28  <Field Core b>
	//   12   50:aload_2         
	//   13   51:checkcast       #48  <Class Boolean>
	//   14   54:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//   15   57:iconst_1        
	//   16   58:invokevirtual   #56  <Method void Core.setSecure(boolean, boolean)>
			return;
	//   17   61:return          

		case 1: // '\001'
			b.allowOfflineTransmission((TransmissionMode)obj, true);
	//   18   62:aload_0         
	//   19   63:getfield        #28  <Field Core b>
	//   20   66:aload_2         
	//   21   67:checkcast       #58  <Class TransmissionMode>
	//   22   70:iconst_1        
	//   23   71:invokevirtual   #62  <Method void Core.allowOfflineTransmission(TransmissionMode, boolean)>
			return;
	//   24   74:return          

		case 0: // '\0'
			b.allowLiveTransmission((TransmissionMode)obj, true);
	//   25   75:aload_0         
	//   26   76:getfield        #28  <Field Core b>
	//   27   79:aload_2         
	//   28   80:checkcast       #58  <Class TransmissionMode>
	//   29   83:iconst_1        
	//   30   84:invokevirtual   #65  <Method void Core.allowLiveTransmission(TransmissionMode, boolean)>
			return;
	//   31   87:return          
		}
	}

	public boolean offer(Measurement measurement)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("offer(): ");
	//    4    8:aload_2         
	//    5    9:ldc1            #70  <String "offer(): ">
	//    6   11:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(measurement.retrieveLabelsAsString(b.getMeasurementLabelOrder()));
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:aload_0         
	//   11   18:getfield        #28  <Field Core b>
	//   12   21:invokevirtual   #78  <Method String[] Core.getMeasurementLabelOrder()>
	//   13   24:invokevirtual   #84  <Method String Measurement.retrieveLabelsAsString(String[])>
	//   14   27:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   16   31:aload_0         
	//   17   32:aload_2         
	//   18   33:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   19   36:invokestatic    #94  <Method void CSLog.d(Object, String)>
		return b.getMeasurementDispatcher().sendMeasurmement(measurement, true);
	//   20   39:aload_0         
	//   21   40:getfield        #28  <Field Core b>
	//   22   43:invokevirtual   #98  <Method MeasurementDispatcher Core.getMeasurementDispatcher()>
	//   23   46:aload_1         
	//   24   47:iconst_1        
	//   25   48:invokevirtual   #104 <Method boolean MeasurementDispatcher.sendMeasurmement(Measurement, boolean)>
	//   26   51:ireturn         
	}

	public volatile boolean offer(Object obj)
	{
		return offer((Runnable)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #107 <Class Runnable>
	//    3    5:invokevirtual   #110 <Method boolean offer(Runnable)>
	//    4    8:ireturn         
	}

	public boolean offer(Runnable runnable)
	{
		return b.getTaskExecutor().execute(runnable, true);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Core b>
	//    2    4:invokevirtual   #114 <Method TaskExecutor Core.getTaskExecutor()>
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #120 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//    6   12:ireturn         
	}

	public void processAggregateData(Measurement measurement)
	{
		b.getMeasurementDispatcher().addAggregateData(measurement);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Core b>
	//    2    4:invokevirtual   #98  <Method MeasurementDispatcher Core.getMeasurementDispatcher()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #124 <Method void MeasurementDispatcher.addAggregateData(Measurement)>
	//    5   11:return          
	}

	public void processEventCounter(Measurement measurement)
	{
		b.getMeasurementDispatcher().addEventCounter(measurement);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Core b>
	//    2    4:invokevirtual   #98  <Method MeasurementDispatcher Core.getMeasurementDispatcher()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #128 <Method void MeasurementDispatcher.addEventCounter(Measurement)>
	//    5   11:return          
	}

	public void stop()
	{
		b.getTaskExecutor().removeAllEnqueuedTasks();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Core b>
	//    2    4:invokevirtual   #114 <Method TaskExecutor Core.getTaskExecutor()>
	//    3    7:invokevirtual   #132 <Method void TaskExecutor.removeAllEnqueuedTasks()>
	//    4   10:return          
	}

	public static final int LIVE_TRANSMISSION_MODE = 0;
	public static final int MEASUREMENT_LABEL_ORDER = 3;
	public static final int OFFLINE_TRANSMISSION_MODE = 1;
	public static final int SECURE_MODE = 2;
	private static final long a = 1L;
	private Core b;
}
