// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			BackgroundPriorityRunnable, ExecutorUtils

static final class ExecutorUtils$2 extends BackgroundPriorityRunnable
{

	public void onRun()
	{
		try
		{
			Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Executing shutdown hook for ").append(val$serviceName).toString());
	//    0    0:invokestatic    #39  <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #41  <String "Fabric">
	//    2    5:new             #43  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #44  <Method void StringBuilder()>
	//    5   12:ldc1            #46  <String "Executing shutdown hook for ">
	//    6   14:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field String val$serviceName>
	//    9   21:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   11   27:invokeinterface #60  <Method void Logger.d(String, String)>
			val$service.shutdown();
	//   12   32:aload_0         
	//   13   33:getfield        #22  <Field ExecutorService val$service>
	//   14   36:invokeinterface #65  <Method void ExecutorService.shutdown()>
			if(!val$service.awaitTermination(val$terminationTimeout, val$timeUnit))
	//*  15   41:aload_0         
	//*  16   42:getfield        #22  <Field ExecutorService val$service>
	//*  17   45:aload_0         
	//*  18   46:getfield        #24  <Field long val$terminationTimeout>
	//*  19   49:aload_0         
	//*  20   50:getfield        #26  <Field TimeUnit val$timeUnit>
	//*  21   53:invokeinterface #69  <Method boolean ExecutorService.awaitTermination(long, TimeUnit)>
	//*  22   58:ifne            108
			{
				Fabric.getLogger().d("Fabric", (new StringBuilder()).append(val$serviceName).append(" did not shut down in the").append(" allocated time. Requesting immediate shutdown.").toString());
	//   23   61:invokestatic    #39  <Method Logger Fabric.getLogger()>
	//   24   64:ldc1            #41  <String "Fabric">
	//   25   66:new             #43  <Class StringBuilder>
	//   26   69:dup             
	//   27   70:invokespecial   #44  <Method void StringBuilder()>
	//   28   73:aload_0         
	//   29   74:getfield        #20  <Field String val$serviceName>
	//   30   77:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   31   80:ldc1            #71  <String " did not shut down in the">
	//   32   82:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   33   85:ldc1            #73  <String " allocated time. Requesting immediate shutdown.">
	//   34   87:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   35   90:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   36   93:invokeinterface #60  <Method void Logger.d(String, String)>
				val$service.shutdownNow();
	//   37   98:aload_0         
	//   38   99:getfield        #22  <Field ExecutorService val$service>
	//   39  102:invokeinterface #77  <Method java.util.List ExecutorService.shutdownNow()>
	//   40  107:pop             
			}
			return;
	//   41  108:return          
		}
		catch(InterruptedException interruptedexception)
	//*  42  109:astore_1        
		{
			Fabric.getLogger().d("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] {
				val$serviceName
			}));
	//   43  110:invokestatic    #39  <Method Logger Fabric.getLogger()>
	//   44  113:ldc1            #41  <String "Fabric">
	//   45  115:getstatic       #83  <Field Locale Locale.US>
	//   46  118:ldc1            #85  <String "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.">
	//   47  120:iconst_1        
	//   48  121:anewarray       Object[]
	//   49  124:dup             
	//   50  125:iconst_0        
	//   51  126:aload_0         
	//   52  127:getfield        #20  <Field String val$serviceName>
	//   53  130:aastore         
	//   54  131:invokestatic    #93  <Method String String.format(Locale, String, Object[])>
	//   55  134:invokeinterface #60  <Method void Logger.d(String, String)>
		}
		val$service.shutdownNow();
	//   56  139:aload_0         
	//   57  140:getfield        #22  <Field ExecutorService val$service>
	//   58  143:invokeinterface #77  <Method java.util.List ExecutorService.shutdownNow()>
	//   59  148:pop             
	//   60  149:return          
	}

	final ExecutorService val$service;
	final String val$serviceName;
	final long val$terminationTimeout;
	final TimeUnit val$timeUnit;

	ExecutorUtils$2(String s, ExecutorService executorservice, long l, TimeUnit timeunit)
	{
		val$serviceName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field String val$serviceName>
		val$service = executorservice;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ExecutorService val$service>
		val$terminationTimeout = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #24  <Field long val$terminationTimeout>
		val$timeUnit = timeunit;
	//    9   15:aload_0         
	//   10   16:aload           5
	//   11   18:putfield        #26  <Field TimeUnit val$timeUnit>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #29  <Method void BackgroundPriorityRunnable()>
	//   14   25:return          
	}
}
