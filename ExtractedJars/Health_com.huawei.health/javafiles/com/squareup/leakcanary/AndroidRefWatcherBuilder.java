// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.leakcanary:
//			RefWatcherBuilder, RefWatcher, LeakCanary, ActivityRefWatcher, 
//			AndroidDebuggerControl, AndroidExcludedRefs, ServiceHeapDumpListener, DisplayLeakService, 
//			DefaultLeakDirectoryProvider, AndroidHeapDumper, AndroidWatchExecutor, DebuggerControl, 
//			ExcludedRefs, HeapDumper, WatchExecutor

public final class AndroidRefWatcherBuilder extends RefWatcherBuilder
{

	AndroidRefWatcherBuilder(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void RefWatcherBuilder()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #36  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #38  <Field Context context>
	//    6   12:return          
	}

	public RefWatcher buildAndInstall()
	{
		RefWatcher refwatcher = build();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method RefWatcher build()>
	//    2    4:astore_1        
		if(refwatcher != RefWatcher.DISABLED)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #49  <Field RefWatcher RefWatcher.DISABLED>
	//*   5    9:if_acmpeq       30
		{
			LeakCanary.enableDisplayLeakActivity(context);
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field Context context>
	//    8   16:invokestatic    #54  <Method void LeakCanary.enableDisplayLeakActivity(Context)>
			ActivityRefWatcher.install((Application)context, refwatcher);
	//    9   19:aload_0         
	//   10   20:getfield        #38  <Field Context context>
	//   11   23:checkcast       #56  <Class Application>
	//   12   26:aload_1         
	//   13   27:invokestatic    #62  <Method void ActivityRefWatcher.install(Application, RefWatcher)>
		}
		return refwatcher;
	//   14   30:aload_1         
	//   15   31:areturn         
	}

	protected DebuggerControl defaultDebuggerControl()
	{
		return ((DebuggerControl) (new AndroidDebuggerControl()));
	//    0    0:new             #66  <Class AndroidDebuggerControl>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void AndroidDebuggerControl()>
	//    3    7:areturn         
	}

	protected ExcludedRefs defaultExcludedRefs()
	{
		return AndroidExcludedRefs.createAppDefaults().build();
	//    0    0:invokestatic    #75  <Method ExcludedRefs$Builder AndroidExcludedRefs.createAppDefaults()>
	//    1    3:invokeinterface #79  <Method ExcludedRefs ExcludedRefs$Builder.build()>
	//    2    8:areturn         
	}

	protected HeapDump.Listener defaultHeapDumpListener()
	{
		return ((HeapDump.Listener) (new ServiceHeapDumpListener(context, com/squareup/leakcanary/DisplayLeakService)));
	//    0    0:new             #83  <Class ServiceHeapDumpListener>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Context context>
	//    4    8:ldc1            #85  <Class DisplayLeakService>
	//    5   10:invokespecial   #88  <Method void ServiceHeapDumpListener(Context, Class)>
	//    6   13:areturn         
	}

	protected HeapDumper defaultHeapDumper()
	{
		DefaultLeakDirectoryProvider defaultleakdirectoryprovider = new DefaultLeakDirectoryProvider(context);
	//    0    0:new             #92  <Class DefaultLeakDirectoryProvider>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Context context>
	//    4    8:invokespecial   #94  <Method void DefaultLeakDirectoryProvider(Context)>
	//    5   11:astore_1        
		return ((HeapDumper) (new AndroidHeapDumper(context, ((LeakDirectoryProvider) (defaultleakdirectoryprovider)))));
	//    6   12:new             #96  <Class AndroidHeapDumper>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #38  <Field Context context>
	//   10   20:aload_1         
	//   11   21:invokespecial   #99  <Method void AndroidHeapDumper(Context, LeakDirectoryProvider)>
	//   12   24:areturn         
	}

	protected WatchExecutor defaultWatchExecutor()
	{
		return ((WatchExecutor) (new AndroidWatchExecutor(DEFAULT_WATCH_DELAY_MILLIS)));
	//    0    0:new             #103 <Class AndroidWatchExecutor>
	//    1    3:dup             
	//    2    4:getstatic       #25  <Field long DEFAULT_WATCH_DELAY_MILLIS>
	//    3    7:invokespecial   #106 <Method void AndroidWatchExecutor(long)>
	//    4   10:areturn         
	}

	protected boolean isDisabled()
	{
		return LeakCanary.isInAnalyzerProcess(context);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Context context>
	//    2    4:invokestatic    #112 <Method boolean LeakCanary.isInAnalyzerProcess(Context)>
	//    3    7:ireturn         
	}

	public AndroidRefWatcherBuilder listenerServiceClass(Class class1)
	{
		return (AndroidRefWatcherBuilder)heapDumpListener(((HeapDump.Listener) (new ServiceHeapDumpListener(context, class1))));
	//    0    0:aload_0         
	//    1    1:new             #83  <Class ServiceHeapDumpListener>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field Context context>
	//    5    9:aload_1         
	//    6   10:invokespecial   #88  <Method void ServiceHeapDumpListener(Context, Class)>
	//    7   13:invokevirtual   #118 <Method RefWatcherBuilder heapDumpListener(HeapDump$Listener)>
	//    8   16:checkcast       #2   <Class AndroidRefWatcherBuilder>
	//    9   19:areturn         
	}

	public AndroidRefWatcherBuilder maxStoredHeapDumps(int i)
	{
		DefaultLeakDirectoryProvider defaultleakdirectoryprovider = new DefaultLeakDirectoryProvider(context, i);
	//    0    0:new             #92  <Class DefaultLeakDirectoryProvider>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Context context>
	//    4    8:iload_1         
	//    5    9:invokespecial   #125 <Method void DefaultLeakDirectoryProvider(Context, int)>
	//    6   12:astore_2        
		LeakCanary.setDisplayLeakActivityDirectoryProvider(((LeakDirectoryProvider) (defaultleakdirectoryprovider)));
	//    7   13:aload_2         
	//    8   14:invokestatic    #129 <Method void LeakCanary.setDisplayLeakActivityDirectoryProvider(LeakDirectoryProvider)>
		return (AndroidRefWatcherBuilder)heapDumper(((HeapDumper) (new AndroidHeapDumper(context, ((LeakDirectoryProvider) (defaultleakdirectoryprovider))))));
	//    9   17:aload_0         
	//   10   18:new             #96  <Class AndroidHeapDumper>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #38  <Field Context context>
	//   14   26:aload_2         
	//   15   27:invokespecial   #99  <Method void AndroidHeapDumper(Context, LeakDirectoryProvider)>
	//   16   30:invokevirtual   #133 <Method RefWatcherBuilder heapDumper(HeapDumper)>
	//   17   33:checkcast       #2   <Class AndroidRefWatcherBuilder>
	//   18   36:areturn         
	}

	public AndroidRefWatcherBuilder watchDelay(long l, TimeUnit timeunit)
	{
		return (AndroidRefWatcherBuilder)watchExecutor(((WatchExecutor) (new AndroidWatchExecutor(timeunit.toMillis(l)))));
	//    0    0:aload_0         
	//    1    1:new             #103 <Class AndroidWatchExecutor>
	//    2    4:dup             
	//    3    5:aload_3         
	//    4    6:lload_1         
	//    5    7:invokevirtual   #23  <Method long TimeUnit.toMillis(long)>
	//    6   10:invokespecial   #106 <Method void AndroidWatchExecutor(long)>
	//    7   13:invokevirtual   #139 <Method RefWatcherBuilder watchExecutor(WatchExecutor)>
	//    8   16:checkcast       #2   <Class AndroidRefWatcherBuilder>
	//    9   19:areturn         
	}

	private static final long DEFAULT_WATCH_DELAY_MILLIS;
	private final Context context;

	static 
	{
		DEFAULT_WATCH_DELAY_MILLIS = TimeUnit.SECONDS.toMillis(5L);
	//    0    0:getstatic       #17  <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:ldc2w           #18  <Long 5L>
	//    2    6:invokevirtual   #23  <Method long TimeUnit.toMillis(long)>
	//    3    9:putstatic       #25  <Field long DEFAULT_WATCH_DELAY_MILLIS>
	//*   4   12:return          
	}
}
