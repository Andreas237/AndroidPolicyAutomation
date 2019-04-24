// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import java.io.File;

// Referenced classes of package com.squareup.leakcanary:
//			HeapDump, AnalysisResult

public abstract class AbstractAnalysisResultService extends IntentService
{

	public AbstractAnalysisResultService()
	{
		super(((Class) (com/squareup/leakcanary/AbstractAnalysisResultService)).getName());
	//    0    0:aload_0         
	//    1    1:ldc1            #2   <Class AbstractAnalysisResultService>
	//    2    3:invokevirtual   #19  <Method String Class.getName()>
	//    3    6:invokespecial   #22  <Method void IntentService(String)>
	//    4    9:return          
	}

	public static void sendResultToListener(Context context, String s, HeapDump heapdump, AnalysisResult analysisresult)
	{
		try
		{
			s = ((String) (Class.forName(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #31  <Method Class Class.forName(String)>
	//    2    4:astore_1        
		}
	//*   3    5:goto            18
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   4    8:astore_0        
		{
			throw new RuntimeException(((Throwable) (context)));
	//    5    9:new             #33  <Class RuntimeException>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #36  <Method void RuntimeException(Throwable)>
	//    9   17:athrow          
		}
		s = ((String) (new Intent(context, ((Class) (s)))));
	//   10   18:new             #38  <Class Intent>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #41  <Method void Intent(Context, Class)>
	//   15   27:astore_1        
		((Intent) (s)).putExtra("heap_dump_extra", ((java.io.Serializable) (heapdump)));
	//   16   28:aload_1         
	//   17   29:ldc1            #8   <String "heap_dump_extra">
	//   18   31:aload_2         
	//   19   32:invokevirtual   #45  <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   20   35:pop             
		((Intent) (s)).putExtra("result_extra", ((java.io.Serializable) (analysisresult)));
	//   21   36:aload_1         
	//   22   37:ldc1            #11  <String "result_extra">
	//   23   39:aload_3         
	//   24   40:invokevirtual   #45  <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   25   43:pop             
		context.startService(((Intent) (s)));
	//   26   44:aload_0         
	//   27   45:aload_1         
	//   28   46:invokevirtual   #51  <Method android.content.ComponentName Context.startService(Intent)>
	//   29   49:pop             
	//   30   50:return          
	}

	protected final void onHandleIntent(Intent intent)
	{
		HeapDump heapdump;
		heapdump = (HeapDump)intent.getSerializableExtra("heap_dump_extra");
	//    0    0:aload_1         
	//    1    1:ldc1            #8   <String "heap_dump_extra">
	//    2    3:invokevirtual   #57  <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//    3    6:checkcast       #59  <Class HeapDump>
	//    4    9:astore_2        
		intent = ((Intent) ((AnalysisResult)intent.getSerializableExtra("result_extra")));
	//    5   10:aload_1         
	//    6   11:ldc1            #11  <String "result_extra">
	//    7   13:invokevirtual   #57  <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//    8   16:checkcast       #61  <Class AnalysisResult>
	//    9   19:astore_1        
		onHeapAnalyzed(heapdump, ((AnalysisResult) (intent)));
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #65  <Method void onHeapAnalyzed(HeapDump, AnalysisResult)>
		heapdump.heapDumpFile.delete();
	//   14   26:aload_2         
	//   15   27:getfield        #69  <Field File HeapDump.heapDumpFile>
	//   16   30:invokevirtual   #75  <Method boolean File.delete()>
	//   17   33:pop             
		return;
	//   18   34:return          
		intent;
	//   19   35:astore_1        
		heapdump.heapDumpFile.delete();
	//   20   36:aload_2         
	//   21   37:getfield        #69  <Field File HeapDump.heapDumpFile>
	//   22   40:invokevirtual   #75  <Method boolean File.delete()>
	//   23   43:pop             
		throw intent;
	//   24   44:aload_1         
	//   25   45:athrow          
	}

	protected abstract void onHeapAnalyzed(HeapDump heapdump, AnalysisResult analysisresult);

	private static final String HEAP_DUMP_EXTRA = "heap_dump_extra";
	private static final String RESULT_EXTRA = "result_extra";
}
