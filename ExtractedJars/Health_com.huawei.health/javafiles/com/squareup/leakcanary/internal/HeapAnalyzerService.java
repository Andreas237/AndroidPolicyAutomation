// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary.internal;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.squareup.leakcanary.*;

public final class HeapAnalyzerService extends IntentService
{

	public HeapAnalyzerService()
	{
		super(((Class) (com/squareup/leakcanary/internal/HeapAnalyzerService)).getSimpleName());
	//    0    0:aload_0         
	//    1    1:ldc1            #2   <Class HeapAnalyzerService>
	//    2    3:invokevirtual   #19  <Method String Class.getSimpleName()>
	//    3    6:invokespecial   #22  <Method void IntentService(String)>
	//    4    9:return          
	}

	public static void runAnalysis(Context context, HeapDump heapdump, Class class1)
	{
		Intent intent = new Intent(context, com/squareup/leakcanary/internal/HeapAnalyzerService);
	//    0    0:new             #27  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class HeapAnalyzerService>
	//    4    7:invokespecial   #30  <Method void Intent(Context, Class)>
	//    5   10:astore_3        
		intent.putExtra("listener_class_extra", class1.getName());
	//    6   11:aload_3         
	//    7   12:ldc1            #11  <String "listener_class_extra">
	//    8   14:aload_2         
	//    9   15:invokevirtual   #33  <Method String Class.getName()>
	//   10   18:invokevirtual   #37  <Method Intent Intent.putExtra(String, String)>
	//   11   21:pop             
		intent.putExtra("heapdump_extra", ((java.io.Serializable) (heapdump)));
	//   12   22:aload_3         
	//   13   23:ldc1            #8   <String "heapdump_extra">
	//   14   25:aload_1         
	//   15   26:invokevirtual   #40  <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   16   29:pop             
		context.startService(intent);
	//   17   30:aload_0         
	//   18   31:aload_3         
	//   19   32:invokevirtual   #46  <Method android.content.ComponentName Context.startService(Intent)>
	//   20   35:pop             
	//   21   36:return          
	}

	protected void onHandleIntent(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			CanaryLog.d("HeapAnalyzerService received a null intent, ignoring.", new Object[0]);
	//    2    4:ldc1            #52  <String "HeapAnalyzerService received a null intent, ignoring.">
	//    3    6:iconst_0        
	//    4    7:anewarray       Object[]
	//    5   10:invokestatic    #60  <Method void CanaryLog.d(String, Object[])>
			return;
	//    6   13:return          
		} else
		{
			String s = intent.getStringExtra("listener_class_extra");
	//    7   14:aload_1         
	//    8   15:ldc1            #11  <String "listener_class_extra">
	//    9   17:invokevirtual   #64  <Method String Intent.getStringExtra(String)>
	//   10   20:astore_2        
			intent = ((Intent) ((HeapDump)intent.getSerializableExtra("heapdump_extra")));
	//   11   21:aload_1         
	//   12   22:ldc1            #8   <String "heapdump_extra">
	//   13   24:invokevirtual   #68  <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//   14   27:checkcast       #70  <Class HeapDump>
	//   15   30:astore_1        
			AbstractAnalysisResultService.sendResultToListener(((Context) (this)), s, ((HeapDump) (intent)), (new HeapAnalyzer(((HeapDump) (intent)).excludedRefs)).checkForLeak(((HeapDump) (intent)).heapDumpFile, ((HeapDump) (intent)).referenceKey));
	//   16   31:aload_0         
	//   17   32:aload_2         
	//   18   33:aload_1         
	//   19   34:new             #72  <Class HeapAnalyzer>
	//   20   37:dup             
	//   21   38:aload_1         
	//   22   39:getfield        #76  <Field com.squareup.leakcanary.ExcludedRefs HeapDump.excludedRefs>
	//   23   42:invokespecial   #79  <Method void HeapAnalyzer(com.squareup.leakcanary.ExcludedRefs)>
	//   24   45:aload_1         
	//   25   46:getfield        #83  <Field java.io.File HeapDump.heapDumpFile>
	//   26   49:aload_1         
	//   27   50:getfield        #86  <Field String HeapDump.referenceKey>
	//   28   53:invokevirtual   #90  <Method com.squareup.leakcanary.AnalysisResult HeapAnalyzer.checkForLeak(java.io.File, String)>
	//   29   56:invokestatic    #96  <Method void AbstractAnalysisResultService.sendResultToListener(Context, String, HeapDump, com.squareup.leakcanary.AnalysisResult)>
			return;
	//   30   59:return          
		}
	}

	private static final String HEAPDUMP_EXTRA = "heapdump_extra";
	private static final String LISTENER_CLASS_EXTRA = "listener_class_extra";
}
