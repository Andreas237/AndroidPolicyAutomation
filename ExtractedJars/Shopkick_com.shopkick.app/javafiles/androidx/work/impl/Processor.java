// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

// Referenced classes of package androidx.work.impl:
//			ExecutionListener, WorkerWrapper, WorkDatabase

public class Processor
	implements ExecutionListener
{
	private static class FutureListener
		implements Runnable
	{

		public void run()
		{
			Object obj;
			boolean flag;
			try
			{
				flag = ((Boolean)mFuture.get()).booleanValue();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field ListenableFuture mFuture>
		//    2    4:invokeinterface #43  <Method Object ListenableFuture.get()>
		//    3    9:checkcast       #45  <Class Boolean>
		//    4   12:invokevirtual   #49  <Method boolean Boolean.booleanValue()>
		//    5   15:istore_1        
			}
		//*   6   16:goto            21
		//*   7   19:iconst_1        
		//*   8   20:istore_1        
		//*   9   21:aload_0         
		//*  10   22:getfield        #24  <Field ExecutionListener mExecutionListener>
		//*  11   25:aload_0         
		//*  12   26:getfield        #26  <Field String mWorkSpecId>
		//*  13   29:iload_1         
		//*  14   30:invokeinterface #55  <Method void ExecutionListener.onExecuted(String, boolean)>
		//*  15   35:return          
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				flag = true;
			}
			mExecutionListener.onExecuted(mWorkSpecId, flag);
		//*  16   36:astore_2        
		//*  17   37:goto            19
		}

		private ExecutionListener mExecutionListener;
		private ListenableFuture mFuture;
		private String mWorkSpecId;

		FutureListener(ExecutionListener executionlistener, String s, ListenableFuture listenablefuture)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			mExecutionListener = executionlistener;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field ExecutionListener mExecutionListener>
			mWorkSpecId = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field String mWorkSpecId>
			mFuture = listenablefuture;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field ListenableFuture mFuture>
		//   11   19:return          
		}
	}


	public Processor(Context context, Configuration configuration, TaskExecutor taskexecutor, WorkDatabase workdatabase, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		mAppContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #55  <Field Context mAppContext>
		mConfiguration = configuration;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #57  <Field Configuration mConfiguration>
		mWorkTaskExecutor = taskexecutor;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #59  <Field TaskExecutor mWorkTaskExecutor>
		mWorkDatabase = workdatabase;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #61  <Field WorkDatabase mWorkDatabase>
		mEnqueuedWorkMap = ((Map) (new HashMap()));
	//   14   25:aload_0         
	//   15   26:new             #63  <Class HashMap>
	//   16   29:dup             
	//   17   30:invokespecial   #64  <Method void HashMap()>
	//   18   33:putfield        #66  <Field Map mEnqueuedWorkMap>
		mSchedulers = list;
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:putfield        #68  <Field List mSchedulers>
		mCancelledIds = ((Set) (new HashSet()));
	//   22   42:aload_0         
	//   23   43:new             #70  <Class HashSet>
	//   24   46:dup             
	//   25   47:invokespecial   #71  <Method void HashSet()>
	//   26   50:putfield        #73  <Field Set mCancelledIds>
	//   27   53:aload_0         
	//   28   54:new             #75  <Class ArrayList>
	//   29   57:dup             
	//   30   58:invokespecial   #76  <Method void ArrayList()>
	//   31   61:putfield        #78  <Field List mOuterListeners>
	//   32   64:aload_0         
	//   33   65:new             #4   <Class Object>
	//   34   68:dup             
	//   35   69:invokespecial   #53  <Method void Object()>
	//   36   72:putfield        #80  <Field Object mLock>
	//   37   75:return          
	}

	public void addExecutionListener(ExecutionListener executionlistener)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mOuterListeners.add(((Object) (executionlistener)));
	//    5    7:aload_0         
	//    6    8:getfield        #78  <Field List mOuterListeners>
	//    7   11:aload_1         
	//    8   12:invokeinterface #90  <Method boolean List.add(Object)>
	//    9   17:pop             
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		executionlistener;
	//   13   21:astore_1        
		obj;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw executionlistener;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public boolean hasWork()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(!mEnqueuedWorkMap.isEmpty())
	//*   5    7:aload_0         
	//*   6    8:getfield        #66  <Field Map mEnqueuedWorkMap>
	//*   7   11:invokeinterface #97  <Method boolean Map.isEmpty()>
	//*   8   16:ifne            33
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_1        
		else
	//*  11   21:goto            24
	//*  12   24:aload_2         
	//*  13   25:monitorexit     
	//*  14   26:iload_1         
	//*  15   27:ireturn         
	//*  16   28:astore_3        
	//*  17   29:aload_2         
	//*  18   30:monitorexit     
	//*  19   31:aload_3         
	//*  20   32:athrow          
			flag = false;
	//   21   33:iconst_0        
	//   22   34:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  23   35:goto            24
	}

	public boolean isCancelled(String s)
	{
		boolean flag;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			flag = mCancelledIds.contains(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #73  <Field Set mCancelledIds>
	//    7   11:aload_1         
	//    8   12:invokeinterface #104 <Method boolean Set.contains(Object)>
	//    9   17:istore_2        
		}
	//   10   18:aload_3         
	//   11   19:monitorexit     
		return flag;
	//   12   20:iload_2         
	//   13   21:ireturn         
		s;
	//   14   22:astore_1        
		obj;
	//   15   23:aload_3         
		JVM INSTR monitorexit ;
	//   16   24:monitorexit     
		throw s;
	//   17   25:aload_1         
	//   18   26:athrow          
	}

	public boolean isEnqueued(String s)
	{
		boolean flag;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			flag = mEnqueuedWorkMap.containsKey(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #66  <Field Map mEnqueuedWorkMap>
	//    7   11:aload_1         
	//    8   12:invokeinterface #109 <Method boolean Map.containsKey(Object)>
	//    9   17:istore_2        
		}
	//   10   18:aload_3         
	//   11   19:monitorexit     
		return flag;
	//   12   20:iload_2         
	//   13   21:ireturn         
		s;
	//   14   22:astore_1        
		obj;
	//   15   23:aload_3         
		JVM INSTR monitorexit ;
	//   16   24:monitorexit     
		throw s;
	//   17   25:aload_1         
	//   18   26:athrow          
	}

	public void onExecuted(String s, boolean flag)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Object mLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		mEnqueuedWorkMap.remove(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #66  <Field Map mEnqueuedWorkMap>
	//    7   11:aload_1         
	//    8   12:invokeinterface #116 <Method Object Map.remove(Object)>
	//    9   17:pop             
		Logger.get().debug(TAG, String.format("%s %s executed; reschedule = %s", new Object[] {
			((Object)this).getClass().getSimpleName(), s, Boolean.valueOf(flag)
		}), new Throwable[0]);
	//   10   18:invokestatic    #120 <Method Logger Logger.get()>
	//   11   21:getstatic       #48  <Field String TAG>
	//   12   24:ldc1            #122 <String "%s %s executed; reschedule = %s">
	//   13   26:iconst_3        
	//   14   27:anewarray       Object[]
	//   15   30:dup             
	//   16   31:iconst_0        
	//   17   32:aload_0         
	//   18   33:invokevirtual   #126 <Method Class Object.getClass()>
	//   19   36:invokevirtual   #132 <Method String Class.getSimpleName()>
	//   20   39:aastore         
	//   21   40:dup             
	//   22   41:iconst_1        
	//   23   42:aload_1         
	//   24   43:aastore         
	//   25   44:dup             
	//   26   45:iconst_2        
	//   27   46:iload_2         
	//   28   47:invokestatic    #138 <Method Boolean Boolean.valueOf(boolean)>
	//   29   50:aastore         
	//   30   51:invokestatic    #144 <Method String String.format(String, Object[])>
	//   31   54:iconst_0        
	//   32   55:anewarray       Throwable[]
	//   33   58:invokevirtual   #150 <Method void Logger.debug(String, String, Throwable[])>
		for(Iterator iterator = mOuterListeners.iterator(); iterator.hasNext(); ((ExecutionListener)iterator.next()).onExecuted(s, flag));
	//   34   61:aload_0         
	//   35   62:getfield        #78  <Field List mOuterListeners>
	//   36   65:invokeinterface #154 <Method Iterator List.iterator()>
	//   37   70:astore          4
	//   38   72:aload           4
	//   39   74:invokeinterface #159 <Method boolean Iterator.hasNext()>
	//   40   79:ifeq            102
	//   41   82:aload           4
	//   42   84:invokeinterface #163 <Method Object Iterator.next()>
	//   43   89:checkcast       #6   <Class ExecutionListener>
	//   44   92:aload_1         
	//   45   93:iload_2         
	//   46   94:invokeinterface #165 <Method void ExecutionListener.onExecuted(String, boolean)>
	//*  47   99:goto            72
		obj;
	//   48  102:aload_3         
		JVM INSTR monitorexit ;
	//   49  103:monitorexit     
		return;
	//   50  104:return          
		s;
	//   51  105:astore_1        
		obj;
	//   52  106:aload_3         
		JVM INSTR monitorexit ;
	//   53  107:monitorexit     
		throw s;
	//   54  108:aload_1         
	//   55  109:athrow          
	}

	public void removeExecutionListener(ExecutionListener executionlistener)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mOuterListeners.remove(((Object) (executionlistener)));
	//    5    7:aload_0         
	//    6    8:getfield        #78  <Field List mOuterListeners>
	//    7   11:aload_1         
	//    8   12:invokeinterface #168 <Method boolean List.remove(Object)>
	//    9   17:pop             
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		executionlistener;
	//   13   21:astore_1        
		obj;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw executionlistener;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public boolean startWork(String s)
	{
		return startWork(s, ((androidx.work.WorkerParameters.RuntimeExtras) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #172 <Method boolean startWork(String, androidx.work.WorkerParameters$RuntimeExtras)>
	//    4    6:ireturn         
	}

	public boolean startWork(String s, androidx.work.WorkerParameters.RuntimeExtras runtimeextras)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(!mEnqueuedWorkMap.containsKey(((Object) (s))))
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #66  <Field Map mEnqueuedWorkMap>
	//    7   11:aload_1         
	//    8   12:invokeinterface #109 <Method boolean Map.containsKey(Object)>
	//    9   17:ifeq            50
				Logger.get().debug(TAG, String.format("Work %s is already enqueued for processing", new Object[] {
					s
				}), new Throwable[0]);
	//   10   20:invokestatic    #120 <Method Logger Logger.get()>
	//   11   23:getstatic       #48  <Field String TAG>
	//   12   26:ldc1            #174 <String "Work %s is already enqueued for processing">
	//   13   28:iconst_1        
	//   14   29:anewarray       Object[]
	//   15   32:dup             
	//   16   33:iconst_0        
	//   17   34:aload_1         
	//   18   35:aastore         
	//   19   36:invokestatic    #144 <Method String String.format(String, Object[])>
	//   20   39:iconst_0        
	//   21   40:anewarray       Throwable[]
	//   22   43:invokevirtual   #150 <Method void Logger.debug(String, String, Throwable[])>
			}
	//   23   46:aload_3         
	//   24   47:monitorexit     
			return false;
	//   25   48:iconst_0        
	//   26   49:ireturn         
		}
		runtimeextras = ((androidx.work.WorkerParameters.RuntimeExtras) ((new WorkerWrapper.Builder(mAppContext, mConfiguration, mWorkTaskExecutor, mWorkDatabase, s)).withSchedulers(mSchedulers).withRuntimeExtras(runtimeextras).build()));
	//   27   50:new             #176 <Class WorkerWrapper$Builder>
	//   28   53:dup             
	//   29   54:aload_0         
	//   30   55:getfield        #55  <Field Context mAppContext>
	//   31   58:aload_0         
	//   32   59:getfield        #57  <Field Configuration mConfiguration>
	//   33   62:aload_0         
	//   34   63:getfield        #59  <Field TaskExecutor mWorkTaskExecutor>
	//   35   66:aload_0         
	//   36   67:getfield        #61  <Field WorkDatabase mWorkDatabase>
	//   37   70:aload_1         
	//   38   71:invokespecial   #179 <Method void WorkerWrapper$Builder(Context, Configuration, TaskExecutor, WorkDatabase, String)>
	//   39   74:aload_0         
	//   40   75:getfield        #68  <Field List mSchedulers>
	//   41   78:invokevirtual   #183 <Method WorkerWrapper$Builder WorkerWrapper$Builder.withSchedulers(List)>
	//   42   81:aload_2         
	//   43   82:invokevirtual   #187 <Method WorkerWrapper$Builder WorkerWrapper$Builder.withRuntimeExtras(androidx.work.WorkerParameters$RuntimeExtras)>
	//   44   85:invokevirtual   #191 <Method WorkerWrapper WorkerWrapper$Builder.build()>
	//   45   88:astore_2        
		ListenableFuture listenablefuture = ((WorkerWrapper) (runtimeextras)).getFuture();
	//   46   89:aload_2         
	//   47   90:invokevirtual   #197 <Method ListenableFuture WorkerWrapper.getFuture()>
	//   48   93:astore          4
		listenablefuture.addListener(((Runnable) (new FutureListener(((ExecutionListener) (this)), s, listenablefuture))), mWorkTaskExecutor.getMainThreadExecutor());
	//   49   95:aload           4
	//   50   97:new             #8   <Class Processor$FutureListener>
	//   51  100:dup             
	//   52  101:aload_0         
	//   53  102:aload_1         
	//   54  103:aload           4
	//   55  105:invokespecial   #200 <Method void Processor$FutureListener(ExecutionListener, String, ListenableFuture)>
	//   56  108:aload_0         
	//   57  109:getfield        #59  <Field TaskExecutor mWorkTaskExecutor>
	//   58  112:invokeinterface #206 <Method Executor TaskExecutor.getMainThreadExecutor()>
	//   59  117:invokeinterface #212 <Method void ListenableFuture.addListener(Runnable, Executor)>
		mEnqueuedWorkMap.put(((Object) (s)), ((Object) (runtimeextras)));
	//   60  122:aload_0         
	//   61  123:getfield        #66  <Field Map mEnqueuedWorkMap>
	//   62  126:aload_1         
	//   63  127:aload_2         
	//   64  128:invokeinterface #216 <Method Object Map.put(Object, Object)>
	//   65  133:pop             
		obj;
	//   66  134:aload_3         
		JVM INSTR monitorexit ;
	//   67  135:monitorexit     
		mWorkTaskExecutor.getBackgroundExecutor().execute(((Runnable) (runtimeextras)));
	//   68  136:aload_0         
	//   69  137:getfield        #59  <Field TaskExecutor mWorkTaskExecutor>
	//   70  140:invokeinterface #219 <Method Executor TaskExecutor.getBackgroundExecutor()>
	//   71  145:aload_2         
	//   72  146:invokeinterface #225 <Method void Executor.execute(Runnable)>
		Logger.get().debug(TAG, String.format("%s: processing %s", new Object[] {
			((Object)this).getClass().getSimpleName(), s
		}), new Throwable[0]);
	//   73  151:invokestatic    #120 <Method Logger Logger.get()>
	//   74  154:getstatic       #48  <Field String TAG>
	//   75  157:ldc1            #227 <String "%s: processing %s">
	//   76  159:iconst_2        
	//   77  160:anewarray       Object[]
	//   78  163:dup             
	//   79  164:iconst_0        
	//   80  165:aload_0         
	//   81  166:invokevirtual   #126 <Method Class Object.getClass()>
	//   82  169:invokevirtual   #132 <Method String Class.getSimpleName()>
	//   83  172:aastore         
	//   84  173:dup             
	//   85  174:iconst_1        
	//   86  175:aload_1         
	//   87  176:aastore         
	//   88  177:invokestatic    #144 <Method String String.format(String, Object[])>
	//   89  180:iconst_0        
	//   90  181:anewarray       Throwable[]
	//   91  184:invokevirtual   #150 <Method void Logger.debug(String, String, Throwable[])>
		return true;
	//   92  187:iconst_1        
	//   93  188:ireturn         
		s;
	//   94  189:astore_1        
		obj;
	//   95  190:aload_3         
		JVM INSTR monitorexit ;
	//   96  191:monitorexit     
		throw s;
	//   97  192:aload_1         
	//   98  193:athrow          
	}

	public boolean stopAndCancelWork(String s)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		WorkerWrapper workerwrapper;
		Logger.get().debug(TAG, String.format("Processor cancelling %s", new Object[] {
			s
		}), new Throwable[0]);
	//    5    7:invokestatic    #120 <Method Logger Logger.get()>
	//    6   10:getstatic       #48  <Field String TAG>
	//    7   13:ldc1            #230 <String "Processor cancelling %s">
	//    8   15:iconst_1        
	//    9   16:anewarray       Object[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:aload_1         
	//   13   22:aastore         
	//   14   23:invokestatic    #144 <Method String String.format(String, Object[])>
	//   15   26:iconst_0        
	//   16   27:anewarray       Throwable[]
	//   17   30:invokevirtual   #150 <Method void Logger.debug(String, String, Throwable[])>
		mCancelledIds.add(((Object) (s)));
	//   18   33:aload_0         
	//   19   34:getfield        #73  <Field Set mCancelledIds>
	//   20   37:aload_1         
	//   21   38:invokeinterface #231 <Method boolean Set.add(Object)>
	//   22   43:pop             
		workerwrapper = (WorkerWrapper)mEnqueuedWorkMap.remove(((Object) (s)));
	//   23   44:aload_0         
	//   24   45:getfield        #66  <Field Map mEnqueuedWorkMap>
	//   25   48:aload_1         
	//   26   49:invokeinterface #116 <Method Object Map.remove(Object)>
	//   27   54:checkcast       #193 <Class WorkerWrapper>
	//   28   57:astore_3        
		if(workerwrapper == null)
			break MISSING_BLOCK_LABEL_97;
	//   29   58:aload_3         
	//   30   59:ifnull          97
		workerwrapper.interrupt(true);
	//   31   62:aload_3         
	//   32   63:iconst_1        
	//   33   64:invokevirtual   #235 <Method void WorkerWrapper.interrupt(boolean)>
		Logger.get().debug(TAG, String.format("WorkerWrapper cancelled for %s", new Object[] {
			s
		}), new Throwable[0]);
	//   34   67:invokestatic    #120 <Method Logger Logger.get()>
	//   35   70:getstatic       #48  <Field String TAG>
	//   36   73:ldc1            #237 <String "WorkerWrapper cancelled for %s">
	//   37   75:iconst_1        
	//   38   76:anewarray       Object[]
	//   39   79:dup             
	//   40   80:iconst_0        
	//   41   81:aload_1         
	//   42   82:aastore         
	//   43   83:invokestatic    #144 <Method String String.format(String, Object[])>
	//   44   86:iconst_0        
	//   45   87:anewarray       Throwable[]
	//   46   90:invokevirtual   #150 <Method void Logger.debug(String, String, Throwable[])>
		obj;
	//   47   93:aload_2         
		JVM INSTR monitorexit ;
	//   48   94:monitorexit     
		return true;
	//   49   95:iconst_1        
	//   50   96:ireturn         
		Logger.get().debug(TAG, String.format("WorkerWrapper could not be found for %s", new Object[] {
			s
		}), new Throwable[0]);
	//   51   97:invokestatic    #120 <Method Logger Logger.get()>
	//   52  100:getstatic       #48  <Field String TAG>
	//   53  103:ldc1            #239 <String "WorkerWrapper could not be found for %s">
	//   54  105:iconst_1        
	//   55  106:anewarray       Object[]
	//   56  109:dup             
	//   57  110:iconst_0        
	//   58  111:aload_1         
	//   59  112:aastore         
	//   60  113:invokestatic    #144 <Method String String.format(String, Object[])>
	//   61  116:iconst_0        
	//   62  117:anewarray       Throwable[]
	//   63  120:invokevirtual   #150 <Method void Logger.debug(String, String, Throwable[])>
		obj;
	//   64  123:aload_2         
		JVM INSTR monitorexit ;
	//   65  124:monitorexit     
		return false;
	//   66  125:iconst_0        
	//   67  126:ireturn         
		s;
	//   68  127:astore_1        
		obj;
	//   69  128:aload_2         
		JVM INSTR monitorexit ;
	//   70  129:monitorexit     
		throw s;
	//   71  130:aload_1         
	//   72  131:athrow          
	}

	public boolean stopWork(String s)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		WorkerWrapper workerwrapper;
		Logger.get().debug(TAG, String.format("Processor stopping %s", new Object[] {
			s
		}), new Throwable[0]);
	//    5    7:invokestatic    #120 <Method Logger Logger.get()>
	//    6   10:getstatic       #48  <Field String TAG>
	//    7   13:ldc1            #242 <String "Processor stopping %s">
	//    8   15:iconst_1        
	//    9   16:anewarray       Object[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:aload_1         
	//   13   22:aastore         
	//   14   23:invokestatic    #144 <Method String String.format(String, Object[])>
	//   15   26:iconst_0        
	//   16   27:anewarray       Throwable[]
	//   17   30:invokevirtual   #150 <Method void Logger.debug(String, String, Throwable[])>
		workerwrapper = (WorkerWrapper)mEnqueuedWorkMap.remove(((Object) (s)));
	//   18   33:aload_0         
	//   19   34:getfield        #66  <Field Map mEnqueuedWorkMap>
	//   20   37:aload_1         
	//   21   38:invokeinterface #116 <Method Object Map.remove(Object)>
	//   22   43:checkcast       #193 <Class WorkerWrapper>
	//   23   46:astore_3        
		if(workerwrapper == null)
			break MISSING_BLOCK_LABEL_86;
	//   24   47:aload_3         
	//   25   48:ifnull          86
		workerwrapper.interrupt(false);
	//   26   51:aload_3         
	//   27   52:iconst_0        
	//   28   53:invokevirtual   #235 <Method void WorkerWrapper.interrupt(boolean)>
		Logger.get().debug(TAG, String.format("WorkerWrapper stopped for %s", new Object[] {
			s
		}), new Throwable[0]);
	//   29   56:invokestatic    #120 <Method Logger Logger.get()>
	//   30   59:getstatic       #48  <Field String TAG>
	//   31   62:ldc1            #244 <String "WorkerWrapper stopped for %s">
	//   32   64:iconst_1        
	//   33   65:anewarray       Object[]
	//   34   68:dup             
	//   35   69:iconst_0        
	//   36   70:aload_1         
	//   37   71:aastore         
	//   38   72:invokestatic    #144 <Method String String.format(String, Object[])>
	//   39   75:iconst_0        
	//   40   76:anewarray       Throwable[]
	//   41   79:invokevirtual   #150 <Method void Logger.debug(String, String, Throwable[])>
		obj;
	//   42   82:aload_2         
		JVM INSTR monitorexit ;
	//   43   83:monitorexit     
		return true;
	//   44   84:iconst_1        
	//   45   85:ireturn         
		Logger.get().debug(TAG, String.format("WorkerWrapper could not be found for %s", new Object[] {
			s
		}), new Throwable[0]);
	//   46   86:invokestatic    #120 <Method Logger Logger.get()>
	//   47   89:getstatic       #48  <Field String TAG>
	//   48   92:ldc1            #239 <String "WorkerWrapper could not be found for %s">
	//   49   94:iconst_1        
	//   50   95:anewarray       Object[]
	//   51   98:dup             
	//   52   99:iconst_0        
	//   53  100:aload_1         
	//   54  101:aastore         
	//   55  102:invokestatic    #144 <Method String String.format(String, Object[])>
	//   56  105:iconst_0        
	//   57  106:anewarray       Throwable[]
	//   58  109:invokevirtual   #150 <Method void Logger.debug(String, String, Throwable[])>
		obj;
	//   59  112:aload_2         
		JVM INSTR monitorexit ;
	//   60  113:monitorexit     
		return false;
	//   61  114:iconst_0        
	//   62  115:ireturn         
		s;
	//   63  116:astore_1        
		obj;
	//   64  117:aload_2         
		JVM INSTR monitorexit ;
	//   65  118:monitorexit     
		throw s;
	//   66  119:aload_1         
	//   67  120:athrow          
	}

	private static final String TAG = Logger.tagWithPrefix("Processor");
	private Context mAppContext;
	private Set mCancelledIds;
	private Configuration mConfiguration;
	private Map mEnqueuedWorkMap;
	private final Object mLock = new Object();
	private final List mOuterListeners = new ArrayList();
	private List mSchedulers;
	private WorkDatabase mWorkDatabase;
	private TaskExecutor mWorkTaskExecutor;

	static 
	{
	//    0    0:ldc1            #40  <String "Processor">
	//    1    2:invokestatic    #46  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #48  <Field String TAG>
	//*   3    8:return          
	}
}
