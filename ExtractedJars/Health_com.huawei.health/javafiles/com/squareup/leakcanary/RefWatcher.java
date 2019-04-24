// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.leakcanary:
//			RefWatcherBuilder, Preconditions, WatchExecutor, DebuggerControl, 
//			GcTrigger, HeapDumper, ExcludedRefs, KeyedWeakReference, 
//			HeapDump, Retryable

public final class RefWatcher
{

	RefWatcher(WatchExecutor watchexecutor, DebuggerControl debuggercontrol, GcTrigger gctrigger, HeapDumper heapdumper, HeapDump.Listener listener, ExcludedRefs excludedrefs)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		watchExecutor = (WatchExecutor)Preconditions.checkNotNull(((Object) (watchexecutor)), "watchExecutor");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #43  <String "watchExecutor">
	//    5    8:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   11:checkcast       #51  <Class WatchExecutor>
	//    7   14:putfield        #53  <Field WatchExecutor watchExecutor>
		debuggerControl = (DebuggerControl)Preconditions.checkNotNull(((Object) (debuggercontrol)), "debuggerControl");
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:ldc1            #54  <String "debuggerControl">
	//   11   21:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, String)>
	//   12   24:checkcast       #56  <Class DebuggerControl>
	//   13   27:putfield        #58  <Field DebuggerControl debuggerControl>
		gcTrigger = (GcTrigger)Preconditions.checkNotNull(((Object) (gctrigger)), "gcTrigger");
	//   14   30:aload_0         
	//   15   31:aload_3         
	//   16   32:ldc1            #59  <String "gcTrigger">
	//   17   34:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, String)>
	//   18   37:checkcast       #61  <Class GcTrigger>
	//   19   40:putfield        #63  <Field GcTrigger gcTrigger>
		heapDumper = (HeapDumper)Preconditions.checkNotNull(((Object) (heapdumper)), "heapDumper");
	//   20   43:aload_0         
	//   21   44:aload           4
	//   22   46:ldc1            #64  <String "heapDumper">
	//   23   48:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, String)>
	//   24   51:checkcast       #66  <Class HeapDumper>
	//   25   54:putfield        #68  <Field HeapDumper heapDumper>
		heapdumpListener = (HeapDump.Listener)Preconditions.checkNotNull(((Object) (listener)), "heapdumpListener");
	//   26   57:aload_0         
	//   27   58:aload           5
	//   28   60:ldc1            #69  <String "heapdumpListener">
	//   29   62:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, String)>
	//   30   65:checkcast       #71  <Class HeapDump$Listener>
	//   31   68:putfield        #73  <Field HeapDump$Listener heapdumpListener>
		excludedRefs = (ExcludedRefs)Preconditions.checkNotNull(((Object) (excludedrefs)), "excludedRefs");
	//   32   71:aload_0         
	//   33   72:aload           6
	//   34   74:ldc1            #74  <String "excludedRefs">
	//   35   76:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, String)>
	//   36   79:checkcast       #76  <Class ExcludedRefs>
	//   37   82:putfield        #78  <Field ExcludedRefs excludedRefs>
	//   38   85:aload_0         
	//   39   86:new             #80  <Class CopyOnWriteArraySet>
	//   40   89:dup             
	//   41   90:invokespecial   #81  <Method void CopyOnWriteArraySet()>
	//   42   93:putfield        #83  <Field Set retainedKeys>
	//   43   96:aload_0         
	//   44   97:new             #85  <Class ReferenceQueue>
	//   45  100:dup             
	//   46  101:invokespecial   #86  <Method void ReferenceQueue()>
	//   47  104:putfield        #88  <Field ReferenceQueue queue>
	//   48  107:return          
	}

	private void ensureGoneAsync(final long watchStartNanoTime, final KeyedWeakReference reference)
	{
		watchExecutor.execute(new Retryable() {

			public Retryable.Result run()
			{
				return ensureGone(reference, watchStartNanoTime);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field RefWatcher this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field KeyedWeakReference val$reference>
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field long val$watchStartNanoTime>
			//    6   12:invokevirtual   #35  <Method Retryable$Result RefWatcher.ensureGone(KeyedWeakReference, long)>
			//    7   15:areturn         
			}

			final RefWatcher this$0;
			final KeyedWeakReference val$reference;
			final long val$watchStartNanoTime;

			
			{
				this$0 = RefWatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field RefWatcher this$0>
				reference = keyedweakreference;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field KeyedWeakReference val$reference>
				watchStartNanoTime = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #25  <Field long val$watchStartNanoTime>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field WatchExecutor watchExecutor>
	//    2    4:new             #6   <Class RefWatcher$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:lload_1         
	//    7   11:invokespecial   #93  <Method void RefWatcher$1(RefWatcher, KeyedWeakReference, long)>
	//    8   14:invokeinterface #97  <Method void WatchExecutor.execute(Retryable)>
	//    9   19:return          
	}

	private boolean gone(KeyedWeakReference keyedweakreference)
	{
		return !retainedKeys.contains(((Object) (keyedweakreference.key)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Set retainedKeys>
	//    2    4:aload_1         
	//    3    5:getfield        #105 <Field String KeyedWeakReference.key>
	//    4    8:invokeinterface #111 <Method boolean Set.contains(Object)>
	//    5   13:ifne            18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	private void removeWeaklyReachableReferences()
	{
		do
		{
			KeyedWeakReference keyedweakreference = (KeyedWeakReference)queue.poll();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field ReferenceQueue queue>
	//    2    4:invokevirtual   #116 <Method java.lang.ref.Reference ReferenceQueue.poll()>
	//    3    7:checkcast       #101 <Class KeyedWeakReference>
	//    4   10:astore_1        
			if(keyedweakreference != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          32
				retainedKeys.remove(((Object) (keyedweakreference.key)));
	//    7   15:aload_0         
	//    8   16:getfield        #83  <Field Set retainedKeys>
	//    9   19:aload_1         
	//   10   20:getfield        #105 <Field String KeyedWeakReference.key>
	//   11   23:invokeinterface #119 <Method boolean Set.remove(Object)>
	//   12   28:pop             
			else
	//*  13   29:goto            0
				return;
	//   14   32:return          
		} while(true);
	}

	Retryable.Result ensureGone(KeyedWeakReference keyedweakreference, long l)
	{
		long l1 = System.nanoTime();
	//    0    0:invokestatic    #127 <Method long System.nanoTime()>
	//    1    3:lstore          4
		l = TimeUnit.NANOSECONDS.toMillis(l1 - l);
	//    2    5:getstatic       #133 <Field TimeUnit TimeUnit.NANOSECONDS>
	//    3    8:lload           4
	//    4   10:lload_2         
	//    5   11:lsub            
	//    6   12:invokevirtual   #137 <Method long TimeUnit.toMillis(long)>
	//    7   15:lstore_2        
		removeWeaklyReachableReferences();
	//    8   16:aload_0         
	//    9   17:invokespecial   #139 <Method void removeWeaklyReachableReferences()>
		if(debuggerControl.isDebuggerAttached())
	//*  10   20:aload_0         
	//*  11   21:getfield        #58  <Field DebuggerControl debuggerControl>
	//*  12   24:invokeinterface #143 <Method boolean DebuggerControl.isDebuggerAttached()>
	//*  13   29:ifeq            36
			return Retryable.Result.RETRY;
	//   14   32:getstatic       #149 <Field Retryable$Result Retryable$Result.RETRY>
	//   15   35:areturn         
		if(gone(keyedweakreference))
	//*  16   36:aload_0         
	//*  17   37:aload_1         
	//*  18   38:invokespecial   #151 <Method boolean gone(KeyedWeakReference)>
	//*  19   41:ifeq            48
			return Retryable.Result.DONE;
	//   20   44:getstatic       #154 <Field Retryable$Result Retryable$Result.DONE>
	//   21   47:areturn         
		gcTrigger.runGc();
	//   22   48:aload_0         
	//   23   49:getfield        #63  <Field GcTrigger gcTrigger>
	//   24   52:invokeinterface #157 <Method void GcTrigger.runGc()>
		removeWeaklyReachableReferences();
	//   25   57:aload_0         
	//   26   58:invokespecial   #139 <Method void removeWeaklyReachableReferences()>
		if(!gone(keyedweakreference))
	//*  27   61:aload_0         
	//*  28   62:aload_1         
	//*  29   63:invokespecial   #151 <Method boolean gone(KeyedWeakReference)>
	//*  30   66:ifne            159
		{
			long l2 = System.nanoTime();
	//   31   69:invokestatic    #127 <Method long System.nanoTime()>
	//   32   72:lstore          6
			l1 = TimeUnit.NANOSECONDS.toMillis(l2 - l1);
	//   33   74:getstatic       #133 <Field TimeUnit TimeUnit.NANOSECONDS>
	//   34   77:lload           6
	//   35   79:lload           4
	//   36   81:lsub            
	//   37   82:invokevirtual   #137 <Method long TimeUnit.toMillis(long)>
	//   38   85:lstore          4
			java.io.File file = heapDumper.dumpHeap();
	//   39   87:aload_0         
	//   40   88:getfield        #68  <Field HeapDumper heapDumper>
	//   41   91:invokeinterface #161 <Method java.io.File HeapDumper.dumpHeap()>
	//   42   96:astore          8
			if(file == HeapDumper.RETRY_LATER)
	//*  43   98:aload           8
	//*  44  100:getstatic       #165 <Field java.io.File HeapDumper.RETRY_LATER>
	//*  45  103:if_acmpne       110
				return Retryable.Result.RETRY;
	//   46  106:getstatic       #149 <Field Retryable$Result Retryable$Result.RETRY>
	//   47  109:areturn         
			l2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - l2);
	//   48  110:getstatic       #133 <Field TimeUnit TimeUnit.NANOSECONDS>
	//   49  113:invokestatic    #127 <Method long System.nanoTime()>
	//   50  116:lload           6
	//   51  118:lsub            
	//   52  119:invokevirtual   #137 <Method long TimeUnit.toMillis(long)>
	//   53  122:lstore          6
			heapdumpListener.analyze(new HeapDump(file, keyedweakreference.key, keyedweakreference.name, excludedRefs, l, l1, l2));
	//   54  124:aload_0         
	//   55  125:getfield        #73  <Field HeapDump$Listener heapdumpListener>
	//   56  128:new             #167 <Class HeapDump>
	//   57  131:dup             
	//   58  132:aload           8
	//   59  134:aload_1         
	//   60  135:getfield        #105 <Field String KeyedWeakReference.key>
	//   61  138:aload_1         
	//   62  139:getfield        #170 <Field String KeyedWeakReference.name>
	//   63  142:aload_0         
	//   64  143:getfield        #78  <Field ExcludedRefs excludedRefs>
	//   65  146:lload_2         
	//   66  147:lload           4
	//   67  149:lload           6
	//   68  151:invokespecial   #173 <Method void HeapDump(java.io.File, String, String, ExcludedRefs, long, long, long)>
	//   69  154:invokeinterface #177 <Method void HeapDump$Listener.analyze(HeapDump)>
		}
		return Retryable.Result.DONE;
	//   70  159:getstatic       #154 <Field Retryable$Result Retryable$Result.DONE>
	//   71  162:areturn         
	}

	public void watch(Object obj)
	{
		watch(obj, "");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #181 <String "">
	//    3    4:invokevirtual   #184 <Method void watch(Object, String)>
	//    4    7:return          
	}

	public void watch(Object obj, String s)
	{
		if(this == DISABLED)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #39  <Field RefWatcher DISABLED>
	//*   2    4:if_acmpne       8
		{
			return;
	//    3    7:return          
		} else
		{
			Preconditions.checkNotNull(obj, "watchedReference");
	//    4    8:aload_1         
	//    5    9:ldc1            #186 <String "watchedReference">
	//    6   11:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, String)>
	//    7   14:pop             
			Preconditions.checkNotNull(((Object) (s)), "referenceName");
	//    8   15:aload_2         
	//    9   16:ldc1            #188 <String "referenceName">
	//   10   18:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, String)>
	//   11   21:pop             
			long l = System.nanoTime();
	//   12   22:invokestatic    #127 <Method long System.nanoTime()>
	//   13   25:lstore_3        
			String s1 = UUID.randomUUID().toString();
	//   14   26:invokestatic    #194 <Method UUID UUID.randomUUID()>
	//   15   29:invokevirtual   #198 <Method String UUID.toString()>
	//   16   32:astore          5
			retainedKeys.add(((Object) (s1)));
	//   17   34:aload_0         
	//   18   35:getfield        #83  <Field Set retainedKeys>
	//   19   38:aload           5
	//   20   40:invokeinterface #201 <Method boolean Set.add(Object)>
	//   21   45:pop             
			ensureGoneAsync(l, new KeyedWeakReference(obj, s1, s, queue));
	//   22   46:aload_0         
	//   23   47:lload_3         
	//   24   48:new             #101 <Class KeyedWeakReference>
	//   25   51:dup             
	//   26   52:aload_1         
	//   27   53:aload           5
	//   28   55:aload_2         
	//   29   56:aload_0         
	//   30   57:getfield        #88  <Field ReferenceQueue queue>
	//   31   60:invokespecial   #204 <Method void KeyedWeakReference(Object, String, String, ReferenceQueue)>
	//   32   63:invokespecial   #206 <Method void ensureGoneAsync(long, KeyedWeakReference)>
			return;
	//   33   66:return          
		}
	}

	public static final RefWatcher DISABLED = (new RefWatcherBuilder()).build();
	private final DebuggerControl debuggerControl;
	private final ExcludedRefs excludedRefs;
	private final GcTrigger gcTrigger;
	private final HeapDumper heapDumper;
	private final HeapDump.Listener heapdumpListener;
	private final ReferenceQueue queue = new ReferenceQueue();
	private final Set retainedKeys = new CopyOnWriteArraySet();
	private final WatchExecutor watchExecutor;

	static 
	{
	//    0    0:new             #30  <Class RefWatcherBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void RefWatcherBuilder()>
	//    3    7:invokevirtual   #37  <Method RefWatcher RefWatcherBuilder.build()>
	//    4   10:putstatic       #39  <Field RefWatcher DISABLED>
	//*   5   13:return          
	}
}
