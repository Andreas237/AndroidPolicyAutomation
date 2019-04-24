// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;

import io.fabric.sdk.android.services.common.TimingMetric;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.PriorityAsyncTask;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;

// Referenced classes of package io.fabric.sdk.android:
//			Kit, InitializationException, InitializationCallback, Fabric, 
//			Logger

class InitializationTask extends PriorityAsyncTask
{

	public InitializationTask(Kit kit1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void PriorityAsyncTask()>
		kit = kit1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Kit kit>
	//    5    9:return          
	}

	private TimingMetric createAndStartTimingMetric(String s)
	{
		s = ((String) (new TimingMetric((new StringBuilder()).append(kit.getIdentifier()).append(".").append(s).toString(), "KitInitialization")));
	//    0    0:new             #26  <Class TimingMetric>
	//    1    3:dup             
	//    2    4:new             #28  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #29  <Method void StringBuilder()>
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field Kit kit>
	//    7   15:invokevirtual   #35  <Method String Kit.getIdentifier()>
	//    8   18:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:ldc1            #41  <String ".">
	//   10   23:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:aload_1         
	//   12   27:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   14   33:ldc1            #9   <String "KitInitialization">
	//   15   35:invokespecial   #47  <Method void TimingMetric(String, String)>
	//   16   38:astore_1        
		((TimingMetric) (s)).startMeasuring();
	//   17   39:aload_1         
	//   18   40:invokevirtual   #50  <Method void TimingMetric.startMeasuring()>
		return ((TimingMetric) (s));
	//   19   43:aload_1         
	//   20   44:areturn         
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return doInBackground((Void[])aobj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #54  <Class Void[]>
	//    3    5:invokevirtual   #57  <Method Object doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected transient Object doInBackground(Void avoid[])
	{
		TimingMetric timingmetric = createAndStartTimingMetric("doInBackground");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "doInBackground">
	//    2    3:invokespecial   #60  <Method TimingMetric createAndStartTimingMetric(String)>
	//    3    6:astore_2        
		avoid = null;
	//    4    7:aconst_null     
	//    5    8:astore_1        
		if(!isCancelled())
	//*   6    9:aload_0         
	//*   7   10:invokevirtual   #64  <Method boolean isCancelled()>
	//*   8   13:ifne            24
			avoid = ((Void []) (kit.doInBackground()));
	//    9   16:aload_0         
	//   10   17:getfield        #19  <Field Kit kit>
	//   11   20:invokevirtual   #67  <Method Object Kit.doInBackground()>
	//   12   23:astore_1        
		timingmetric.stopMeasuring();
	//   13   24:aload_2         
	//   14   25:invokevirtual   #70  <Method void TimingMetric.stopMeasuring()>
		return ((Object) (avoid));
	//   15   28:aload_1         
	//   16   29:areturn         
	}

	public Priority getPriority()
	{
		return Priority.HIGH;
	//    0    0:getstatic       #79  <Field Priority Priority.HIGH>
	//    1    3:areturn         
	}

	protected void onCancelled(Object obj)
	{
		kit.onCancelled(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Kit kit>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #83  <Method void Kit.onCancelled(Object)>
		obj = ((Object) (new InitializationException((new StringBuilder()).append(kit.getIdentifier()).append(" Initialization was cancelled").toString())));
	//    4    8:new             #85  <Class InitializationException>
	//    5   11:dup             
	//    6   12:new             #28  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #29  <Method void StringBuilder()>
	//    9   19:aload_0         
	//   10   20:getfield        #19  <Field Kit kit>
	//   11   23:invokevirtual   #35  <Method String Kit.getIdentifier()>
	//   12   26:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:ldc1            #87  <String " Initialization was cancelled">
	//   14   31:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   15   34:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   16   37:invokespecial   #90  <Method void InitializationException(String)>
	//   17   40:astore_1        
		kit.initializationCallback.failure(((Exception) (obj)));
	//   18   41:aload_0         
	//   19   42:getfield        #19  <Field Kit kit>
	//   20   45:getfield        #94  <Field InitializationCallback Kit.initializationCallback>
	//   21   48:aload_1         
	//   22   49:invokeinterface #100 <Method void InitializationCallback.failure(Exception)>
	//   23   54:return          
	}

	protected void onPostExecute(Object obj)
	{
		kit.onPostExecute(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Kit kit>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #104 <Method void Kit.onPostExecute(Object)>
		kit.initializationCallback.success(obj);
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field Kit kit>
	//    6   12:getfield        #94  <Field InitializationCallback Kit.initializationCallback>
	//    7   15:aload_1         
	//    8   16:invokeinterface #107 <Method void InitializationCallback.success(Object)>
	//    9   21:return          
	}

	protected void onPreExecute()
	{
		TimingMetric timingmetric;
		super.onPreExecute();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void PriorityAsyncTask.onPreExecute()>
		timingmetric = createAndStartTimingMetric("onPreExecute");
	//    2    4:aload_0         
	//    3    5:ldc1            #115 <String "onPreExecute">
	//    4    7:invokespecial   #60  <Method TimingMetric createAndStartTimingMetric(String)>
	//    5   10:astore_2        
		boolean flag = kit.onPreExecute();
	//    6   11:aload_0         
	//    7   12:getfield        #19  <Field Kit kit>
	//    8   15:invokevirtual   #117 <Method boolean Kit.onPreExecute()>
	//    9   18:istore_1        
		timingmetric.stopMeasuring();
	//   10   19:aload_2         
	//   11   20:invokevirtual   #70  <Method void TimingMetric.stopMeasuring()>
		if(!flag)
	//*  12   23:iload_1         
	//*  13   24:ifne            33
			cancel(true);
	//   14   27:aload_0         
	//   15   28:iconst_1        
	//   16   29:invokevirtual   #121 <Method boolean cancel(boolean)>
	//   17   32:pop             
_L2:
		return;
	//   18   33:return          
		Object obj;
		obj;
	//   19   34:astore_3        
		throw obj;
	//   20   35:aload_3         
	//   21   36:athrow          
		obj;
	//   22   37:astore_3        
		timingmetric.stopMeasuring();
	//   23   38:aload_2         
	//   24   39:invokevirtual   #70  <Method void TimingMetric.stopMeasuring()>
		if(true)
	//*  25   42:iconst_0        
	//*  26   43:ifne            52
			cancel(true);
	//   27   46:aload_0         
	//   28   47:iconst_1        
	//   29   48:invokevirtual   #121 <Method boolean cancel(boolean)>
	//   30   51:pop             
		throw obj;
	//   31   52:aload_3         
	//   32   53:athrow          
		obj;
	//   33   54:astore_3        
		Fabric.getLogger().e("Fabric", "Failure onPreExecute()", ((Throwable) (obj)));
	//   34   55:invokestatic    #127 <Method Logger Fabric.getLogger()>
	//   35   58:ldc1            #129 <String "Fabric">
	//   36   60:ldc1            #131 <String "Failure onPreExecute()">
	//   37   62:aload_3         
	//   38   63:invokeinterface #137 <Method void Logger.e(String, String, Throwable)>
		timingmetric.stopMeasuring();
	//   39   68:aload_2         
	//   40   69:invokevirtual   #70  <Method void TimingMetric.stopMeasuring()>
		if(true)
	//*  41   72:iconst_0        
	//*  42   73:ifne            33
		{
			cancel(true);
	//   43   76:aload_0         
	//   44   77:iconst_1        
	//   45   78:invokevirtual   #121 <Method boolean cancel(boolean)>
	//   46   81:pop             
			return;
	//   47   82:return          
		}
		if(true) goto _L2; else goto _L1
_L1:
	}

	private static final String TIMING_METRIC_TAG = "KitInitialization";
	final Kit kit;
}
