// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;


// Referenced classes of package com.squareup.leakcanary:
//			RefWatcher, DebuggerControl, ExcludedRefs, GcTrigger, 
//			HeapDumper, WatchExecutor

public class RefWatcherBuilder
{

	public RefWatcherBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public final RefWatcher build()
	{
		if(isDisabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #28  <Method boolean isDisabled()>
	//*   2    4:ifeq            11
			return RefWatcher.DISABLED;
	//    3    7:getstatic       #34  <Field RefWatcher RefWatcher.DISABLED>
	//    4   10:areturn         
		Object obj = ((Object) (excludedRefs));
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field ExcludedRefs excludedRefs>
	//    7   15:astore_2        
		ExcludedRefs excludedrefs = ((ExcludedRefs) (obj));
	//    8   16:aload_2         
	//    9   17:astore_1        
		if(obj == null)
	//*  10   18:aload_2         
	//*  11   19:ifnonnull       27
			excludedrefs = defaultExcludedRefs();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #40  <Method ExcludedRefs defaultExcludedRefs()>
	//   14   26:astore_1        
		Object obj1 = ((Object) (heapDumpListener));
	//   15   27:aload_0         
	//   16   28:getfield        #42  <Field HeapDump$Listener heapDumpListener>
	//   17   31:astore_3        
		obj = obj1;
	//   18   32:aload_3         
	//   19   33:astore_2        
		if(obj1 == null)
	//*  20   34:aload_3         
	//*  21   35:ifnonnull       43
			obj = ((Object) (defaultHeapDumpListener()));
	//   22   38:aload_0         
	//   23   39:invokevirtual   #46  <Method HeapDump$Listener defaultHeapDumpListener()>
	//   24   42:astore_2        
		Object obj2 = ((Object) (debuggerControl));
	//   25   43:aload_0         
	//   26   44:getfield        #48  <Field DebuggerControl debuggerControl>
	//   27   47:astore          4
		obj1 = obj2;
	//   28   49:aload           4
	//   29   51:astore_3        
		if(obj2 == null)
	//*  30   52:aload           4
	//*  31   54:ifnonnull       62
			obj1 = ((Object) (defaultDebuggerControl()));
	//   32   57:aload_0         
	//   33   58:invokevirtual   #52  <Method DebuggerControl defaultDebuggerControl()>
	//   34   61:astore_3        
		Object obj3 = ((Object) (heapDumper));
	//   35   62:aload_0         
	//   36   63:getfield        #54  <Field HeapDumper heapDumper>
	//   37   66:astore          5
		obj2 = obj3;
	//   38   68:aload           5
	//   39   70:astore          4
		if(obj3 == null)
	//*  40   72:aload           5
	//*  41   74:ifnonnull       83
			obj2 = ((Object) (defaultHeapDumper()));
	//   42   77:aload_0         
	//   43   78:invokevirtual   #58  <Method HeapDumper defaultHeapDumper()>
	//   44   81:astore          4
		Object obj4 = ((Object) (watchExecutor));
	//   45   83:aload_0         
	//   46   84:getfield        #60  <Field WatchExecutor watchExecutor>
	//   47   87:astore          6
		obj3 = obj4;
	//   48   89:aload           6
	//   49   91:astore          5
		if(obj4 == null)
	//*  50   93:aload           6
	//*  51   95:ifnonnull       104
			obj3 = ((Object) (defaultWatchExecutor()));
	//   52   98:aload_0         
	//   53   99:invokevirtual   #64  <Method WatchExecutor defaultWatchExecutor()>
	//   54  102:astore          5
		GcTrigger gctrigger = gcTrigger;
	//   55  104:aload_0         
	//   56  105:getfield        #66  <Field GcTrigger gcTrigger>
	//   57  108:astore          7
		obj4 = ((Object) (gctrigger));
	//   58  110:aload           7
	//   59  112:astore          6
		if(gctrigger == null)
	//*  60  114:aload           7
	//*  61  116:ifnonnull       125
			obj4 = ((Object) (defaultGcTrigger()));
	//   62  119:aload_0         
	//   63  120:invokevirtual   #70  <Method GcTrigger defaultGcTrigger()>
	//   64  123:astore          6
		return new RefWatcher(((WatchExecutor) (obj3)), ((DebuggerControl) (obj1)), ((GcTrigger) (obj4)), ((HeapDumper) (obj2)), ((HeapDump.Listener) (obj)), excludedrefs);
	//   65  125:new             #30  <Class RefWatcher>
	//   66  128:dup             
	//   67  129:aload           5
	//   68  131:aload_3         
	//   69  132:aload           6
	//   70  134:aload           4
	//   71  136:aload_2         
	//   72  137:aload_1         
	//   73  138:invokespecial   #73  <Method void RefWatcher(WatchExecutor, DebuggerControl, GcTrigger, HeapDumper, HeapDump$Listener, ExcludedRefs)>
	//   74  141:areturn         
	}

	public final RefWatcherBuilder debuggerControl(DebuggerControl debuggercontrol)
	{
		debuggerControl = debuggercontrol;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field DebuggerControl debuggerControl>
		return self();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #78  <Method RefWatcherBuilder self()>
	//    5    9:areturn         
	}

	protected DebuggerControl defaultDebuggerControl()
	{
		return DebuggerControl.NONE;
	//    0    0:getstatic       #85  <Field DebuggerControl DebuggerControl.NONE>
	//    1    3:areturn         
	}

	protected ExcludedRefs defaultExcludedRefs()
	{
		return ExcludedRefs.builder().build();
	//    0    0:invokestatic    #91  <Method ExcludedRefs$Builder ExcludedRefs.builder()>
	//    1    3:invokeinterface #95  <Method ExcludedRefs ExcludedRefs$Builder.build()>
	//    2    8:areturn         
	}

	protected GcTrigger defaultGcTrigger()
	{
		return GcTrigger.DEFAULT;
	//    0    0:getstatic       #100 <Field GcTrigger GcTrigger.DEFAULT>
	//    1    3:areturn         
	}

	protected HeapDump.Listener defaultHeapDumpListener()
	{
		return HeapDump.Listener.NONE;
	//    0    0:getstatic       #104 <Field HeapDump$Listener HeapDump$Listener.NONE>
	//    1    3:areturn         
	}

	protected HeapDumper defaultHeapDumper()
	{
		return HeapDumper.NONE;
	//    0    0:getstatic       #108 <Field HeapDumper HeapDumper.NONE>
	//    1    3:areturn         
	}

	protected WatchExecutor defaultWatchExecutor()
	{
		return WatchExecutor.NONE;
	//    0    0:getstatic       #112 <Field WatchExecutor WatchExecutor.NONE>
	//    1    3:areturn         
	}

	public final RefWatcherBuilder excludedRefs(ExcludedRefs excludedrefs)
	{
		excludedRefs = excludedrefs;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field ExcludedRefs excludedRefs>
		return self();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #78  <Method RefWatcherBuilder self()>
	//    5    9:areturn         
	}

	public final RefWatcherBuilder gcTrigger(GcTrigger gctrigger)
	{
		gcTrigger = gctrigger;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field GcTrigger gcTrigger>
		return self();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #78  <Method RefWatcherBuilder self()>
	//    5    9:areturn         
	}

	public final RefWatcherBuilder heapDumpListener(HeapDump.Listener listener)
	{
		heapDumpListener = listener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field HeapDump$Listener heapDumpListener>
		return self();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #78  <Method RefWatcherBuilder self()>
	//    5    9:areturn         
	}

	public final RefWatcherBuilder heapDumper(HeapDumper heapdumper)
	{
		heapDumper = heapdumper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field HeapDumper heapDumper>
		return self();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #78  <Method RefWatcherBuilder self()>
	//    5    9:areturn         
	}

	protected boolean isDisabled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected final RefWatcherBuilder self()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final RefWatcherBuilder watchExecutor(WatchExecutor watchexecutor)
	{
		watchExecutor = watchexecutor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field WatchExecutor watchExecutor>
		return self();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #78  <Method RefWatcherBuilder self()>
	//    5    9:areturn         
	}

	private DebuggerControl debuggerControl;
	private ExcludedRefs excludedRefs;
	private GcTrigger gcTrigger;
	private HeapDump.Listener heapDumpListener;
	private HeapDumper heapDumper;
	private WatchExecutor watchExecutor;
}
