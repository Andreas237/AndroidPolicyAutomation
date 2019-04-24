// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import android.content.Context;
import com.squareup.leakcanary.internal.HeapAnalyzerService;
import com.squareup.leakcanary.internal.LeakCanaryInternals;

// Referenced classes of package com.squareup.leakcanary:
//			Preconditions, HeapDump

public final class ServiceHeapDumpListener
	implements HeapDump.Listener
{

	public ServiceHeapDumpListener(Context context1, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		LeakCanaryInternals.setEnabled(context1, class1, true);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iconst_1        
	//    5    7:invokestatic    #22  <Method void LeakCanaryInternals.setEnabled(Context, Class, boolean)>
		LeakCanaryInternals.setEnabled(context1, com/squareup/leakcanary/internal/HeapAnalyzerService, true);
	//    6   10:aload_1         
	//    7   11:ldc1            #24  <Class HeapAnalyzerService>
	//    8   13:iconst_1        
	//    9   14:invokestatic    #22  <Method void LeakCanaryInternals.setEnabled(Context, Class, boolean)>
		listenerServiceClass = (Class)Preconditions.checkNotNull(((Object) (class1)), "listenerServiceClass");
	//   10   17:aload_0         
	//   11   18:aload_2         
	//   12   19:ldc1            #25  <String "listenerServiceClass">
	//   13   21:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, String)>
	//   14   24:checkcast       #33  <Class Class>
	//   15   27:putfield        #35  <Field Class listenerServiceClass>
		context = ((Context)Preconditions.checkNotNull(((Object) (context1)), "context")).getApplicationContext();
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:ldc1            #36  <String "context">
	//   19   34:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, String)>
	//   20   37:checkcast       #38  <Class Context>
	//   21   40:invokevirtual   #42  <Method Context Context.getApplicationContext()>
	//   22   43:putfield        #44  <Field Context context>
	//   23   46:return          
	}

	public void analyze(HeapDump heapdump)
	{
		Preconditions.checkNotNull(((Object) (heapdump)), "heapDump");
	//    0    0:aload_1         
	//    1    1:ldc1            #51  <String "heapDump">
	//    2    3:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, String)>
	//    3    6:pop             
		HeapAnalyzerService.runAnalysis(context, heapdump, listenerServiceClass);
	//    4    7:aload_0         
	//    5    8:getfield        #44  <Field Context context>
	//    6   11:aload_1         
	//    7   12:aload_0         
	//    8   13:getfield        #35  <Field Class listenerServiceClass>
	//    9   16:invokestatic    #55  <Method void HeapAnalyzerService.runAnalysis(Context, HeapDump, Class)>
	//   10   19:return          
	}

	private final Context context;
	private final Class listenerServiceClass;
}
