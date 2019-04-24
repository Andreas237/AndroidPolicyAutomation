// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import java.util.concurrent.*;

// Referenced classes of package ch.qos.logback.core.rolling.helper:
//			CompressionRunnable, Compressor

public class AsynchronousCompressor
{

	public AsynchronousCompressor(Compressor compressor1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		compressor = compressor1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Compressor compressor>
	//    5    9:return          
	}

	public Future compressAsynchronously(String s, String s1, String s2)
	{
		java.util.concurrent.ScheduledExecutorService scheduledexecutorservice = Executors.newScheduledThreadPool(1);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #22  <Method java.util.concurrent.ScheduledExecutorService Executors.newScheduledThreadPool(int)>
	//    2    4:astore          4
		s = ((String) (((ExecutorService) (scheduledexecutorservice)).submit(((Runnable) (new CompressionRunnable(compressor, s, s1, s2))))));
	//    3    6:aload           4
	//    4    8:new             #24  <Class CompressionRunnable>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #13  <Field Compressor compressor>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokespecial   #27  <Method void CompressionRunnable(Compressor, String, String, String)>
	//   12   22:invokeinterface #33  <Method Future ExecutorService.submit(Runnable)>
	//   13   27:astore_1        
		((ExecutorService) (scheduledexecutorservice)).shutdown();
	//   14   28:aload           4
	//   15   30:invokeinterface #36  <Method void ExecutorService.shutdown()>
		return ((Future) (s));
	//   16   35:aload_1         
	//   17   36:areturn         
	}

	Compressor compressor;
}
