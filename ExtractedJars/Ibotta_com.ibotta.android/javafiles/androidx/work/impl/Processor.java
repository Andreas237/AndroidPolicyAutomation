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
	//    1    1:invokespecial   #39  <Method void Object()>
		mAppContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field Context mAppContext>
		mConfiguration = configuration;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #43  <Field Configuration mConfiguration>
		mWorkTaskExecutor = taskexecutor;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #45  <Field TaskExecutor mWorkTaskExecutor>
		mWorkDatabase = workdatabase;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #47  <Field WorkDatabase mWorkDatabase>
		mEnqueuedWorkMap = ((Map) (new HashMap()));
	//   14   25:aload_0         
	//   15   26:new             #49  <Class HashMap>
	//   16   29:dup             
	//   17   30:invokespecial   #50  <Method void HashMap()>
	//   18   33:putfield        #52  <Field Map mEnqueuedWorkMap>
		mSchedulers = list;
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:putfield        #54  <Field List mSchedulers>
		mCancelledIds = ((Set) (new HashSet()));
	//   22   42:aload_0         
	//   23   43:new             #56  <Class HashSet>
	//   24   46:dup             
	//   25   47:invokespecial   #57  <Method void HashSet()>
	//   26   50:putfield        #59  <Field Set mCancelledIds>
	//   27   53:aload_0         
	//   28   54:new             #61  <Class ArrayList>
	//   29   57:dup             
	//   30   58:invokespecial   #62  <Method void ArrayList()>
	//   31   61:putfield        #64  <Field List mOuterListeners>
	//   32   64:aload_0         
	//   33   65:new             #4   <Class Object>
	//   34   68:dup             
	//   35   69:invokespecial   #39  <Method void Object()>
	//   36   72:putfield        #66  <Field Object mLock>
	//   37   75:return          
	}

	public void addExecutionListener(ExecutionListener executionlistener)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mOuterListeners.add(((Object) (executionlistener)));
	//    5    7:aload_0         
	//    6    8:getfield        #64  <Field List mOuterListeners>
	//    7   11:aload_1         
	//    8   12:invokeinterface #77  <Method boolean List.add(Object)>
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

	public boolean isCancelled(String s)
	{
		boolean flag;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			flag = mCancelledIds.contains(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #59  <Field Set mCancelledIds>
	//    7   11:aload_1         
	//    8   12:invokeinterface #84  <Method boolean Set.contains(Object)>
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
	//*   1    1:getfield        #66  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			flag = mEnqueuedWorkMap.containsKey(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #52  <Field Map mEnqueuedWorkMap>
	//    7   11:aload_1         
	//    8   12:invokeinterface #91  <Method boolean Map.containsKey(Object)>
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
	//    1    1:getfield        #66  <Field Object mLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		mEnqueuedWorkMap.remove(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #52  <Field Map mEnqueuedWorkMap>
	//    7   11:aload_1         
	//    8   12:invokeinterface #98  <Method Object Map.remove(Object)>
	//    9   17:pop             
		Logger.debug("Processor", String.format("%s %s executed; reschedule = %s", new Object[] {
			((Object)this).getClass().getSimpleName(), s, Boolean.valueOf(flag)
		}), new Throwable[0]);
	//   10   18:ldc1            #100 <String "Processor">
	//   11   20:ldc1            #102 <String "%s %s executed; reschedule = %s">
	//   12   22:iconst_3        
	//   13   23:anewarray       Object[]
	//   14   26:dup             
	//   15   27:iconst_0        
	//   16   28:aload_0         
	//   17   29:invokevirtual   #106 <Method Class Object.getClass()>
	//   18   32:invokevirtual   #112 <Method String Class.getSimpleName()>
	//   19   35:aastore         
	//   20   36:dup             
	//   21   37:iconst_1        
	//   22   38:aload_1         
	//   23   39:aastore         
	//   24   40:dup             
	//   25   41:iconst_2        
	//   26   42:iload_2         
	//   27   43:invokestatic    #118 <Method Boolean Boolean.valueOf(boolean)>
	//   28   46:aastore         
	//   29   47:invokestatic    #124 <Method String String.format(String, Object[])>
	//   30   50:iconst_0        
	//   31   51:anewarray       Throwable[]
	//   32   54:invokestatic    #132 <Method void Logger.debug(String, String, Throwable[])>
		for(Iterator iterator = mOuterListeners.iterator(); iterator.hasNext(); ((ExecutionListener)iterator.next()).onExecuted(s, flag));
	//   33   57:aload_0         
	//   34   58:getfield        #64  <Field List mOuterListeners>
	//   35   61:invokeinterface #136 <Method Iterator List.iterator()>
	//   36   66:astore          4
	//   37   68:aload           4
	//   38   70:invokeinterface #142 <Method boolean Iterator.hasNext()>
	//   39   75:ifeq            98
	//   40   78:aload           4
	//   41   80:invokeinterface #146 <Method Object Iterator.next()>
	//   42   85:checkcast       #6   <Class ExecutionListener>
	//   43   88:aload_1         
	//   44   89:iload_2         
	//   45   90:invokeinterface #148 <Method void ExecutionListener.onExecuted(String, boolean)>
	//*  46   95:goto            68
		obj;
	//   47   98:aload_3         
		JVM INSTR monitorexit ;
	//   48   99:monitorexit     
		return;
	//   49  100:return          
		s;
	//   50  101:astore_1        
		obj;
	//   51  102:aload_3         
		JVM INSTR monitorexit ;
	//   52  103:monitorexit     
		throw s;
	//   53  104:aload_1         
	//   54  105:athrow          
	}

	public void removeExecutionListener(ExecutionListener executionlistener)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mOuterListeners.remove(((Object) (executionlistener)));
	//    5    7:aload_0         
	//    6    8:getfield        #64  <Field List mOuterListeners>
	//    7   11:aload_1         
	//    8   12:invokeinterface #151 <Method boolean List.remove(Object)>
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
	//    3    3:invokevirtual   #155 <Method boolean startWork(String, androidx.work.WorkerParameters$RuntimeExtras)>
	//    4    6:ireturn         
	}

	public boolean startWork(String s, androidx.work.WorkerParameters.RuntimeExtras runtimeextras)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(!mEnqueuedWorkMap.containsKey(((Object) (s))))
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #52  <Field Map mEnqueuedWorkMap>
	//    7   11:aload_1         
	//    8   12:invokeinterface #91  <Method boolean Map.containsKey(Object)>
	//    9   17:ifeq            46
				Logger.debug("Processor", String.format("Work %s is already enqueued for processing", new Object[] {
					s
				}), new Throwable[0]);
	//   10   20:ldc1            #100 <String "Processor">
	//   11   22:ldc1            #157 <String "Work %s is already enqueued for processing">
	//   12   24:iconst_1        
	//   13   25:anewarray       Object[]
	//   14   28:dup             
	//   15   29:iconst_0        
	//   16   30:aload_1         
	//   17   31:aastore         
	//   18   32:invokestatic    #124 <Method String String.format(String, Object[])>
	//   19   35:iconst_0        
	//   20   36:anewarray       Throwable[]
	//   21   39:invokestatic    #132 <Method void Logger.debug(String, String, Throwable[])>
			}
	//   22   42:aload_3         
	//   23   43:monitorexit     
			return false;
	//   24   44:iconst_0        
	//   25   45:ireturn         
		}
		runtimeextras = ((androidx.work.WorkerParameters.RuntimeExtras) ((new WorkerWrapper.Builder(mAppContext, mConfiguration, mWorkTaskExecutor, mWorkDatabase, s)).withSchedulers(mSchedulers).withRuntimeExtras(runtimeextras).build()));
	//   26   46:new             #159 <Class WorkerWrapper$Builder>
	//   27   49:dup             
	//   28   50:aload_0         
	//   29   51:getfield        #41  <Field Context mAppContext>
	//   30   54:aload_0         
	//   31   55:getfield        #43  <Field Configuration mConfiguration>
	//   32   58:aload_0         
	//   33   59:getfield        #45  <Field TaskExecutor mWorkTaskExecutor>
	//   34   62:aload_0         
	//   35   63:getfield        #47  <Field WorkDatabase mWorkDatabase>
	//   36   66:aload_1         
	//   37   67:invokespecial   #162 <Method void WorkerWrapper$Builder(Context, Configuration, TaskExecutor, WorkDatabase, String)>
	//   38   70:aload_0         
	//   39   71:getfield        #54  <Field List mSchedulers>
	//   40   74:invokevirtual   #166 <Method WorkerWrapper$Builder WorkerWrapper$Builder.withSchedulers(List)>
	//   41   77:aload_2         
	//   42   78:invokevirtual   #170 <Method WorkerWrapper$Builder WorkerWrapper$Builder.withRuntimeExtras(androidx.work.WorkerParameters$RuntimeExtras)>
	//   43   81:invokevirtual   #174 <Method WorkerWrapper WorkerWrapper$Builder.build()>
	//   44   84:astore_2        
		ListenableFuture listenablefuture = ((WorkerWrapper) (runtimeextras)).getFuture();
	//   45   85:aload_2         
	//   46   86:invokevirtual   #180 <Method ListenableFuture WorkerWrapper.getFuture()>
	//   47   89:astore          4
		listenablefuture.addListener(((Runnable) (new FutureListener(((ExecutionListener) (this)), s, listenablefuture))), mWorkTaskExecutor.getMainThreadExecutor());
	//   48   91:aload           4
	//   49   93:new             #8   <Class Processor$FutureListener>
	//   50   96:dup             
	//   51   97:aload_0         
	//   52   98:aload_1         
	//   53   99:aload           4
	//   54  101:invokespecial   #183 <Method void Processor$FutureListener(ExecutionListener, String, ListenableFuture)>
	//   55  104:aload_0         
	//   56  105:getfield        #45  <Field TaskExecutor mWorkTaskExecutor>
	//   57  108:invokeinterface #189 <Method Executor TaskExecutor.getMainThreadExecutor()>
	//   58  113:invokeinterface #195 <Method void ListenableFuture.addListener(Runnable, Executor)>
		mEnqueuedWorkMap.put(((Object) (s)), ((Object) (runtimeextras)));
	//   59  118:aload_0         
	//   60  119:getfield        #52  <Field Map mEnqueuedWorkMap>
	//   61  122:aload_1         
	//   62  123:aload_2         
	//   63  124:invokeinterface #199 <Method Object Map.put(Object, Object)>
	//   64  129:pop             
		obj;
	//   65  130:aload_3         
		JVM INSTR monitorexit ;
	//   66  131:monitorexit     
		mWorkTaskExecutor.getBackgroundExecutor().execute(((Runnable) (runtimeextras)));
	//   67  132:aload_0         
	//   68  133:getfield        #45  <Field TaskExecutor mWorkTaskExecutor>
	//   69  136:invokeinterface #202 <Method Executor TaskExecutor.getBackgroundExecutor()>
	//   70  141:aload_2         
	//   71  142:invokeinterface #208 <Method void Executor.execute(Runnable)>
		Logger.debug("Processor", String.format("%s: processing %s", new Object[] {
			((Object)this).getClass().getSimpleName(), s
		}), new Throwable[0]);
	//   72  147:ldc1            #100 <String "Processor">
	//   73  149:ldc1            #210 <String "%s: processing %s">
	//   74  151:iconst_2        
	//   75  152:anewarray       Object[]
	//   76  155:dup             
	//   77  156:iconst_0        
	//   78  157:aload_0         
	//   79  158:invokevirtual   #106 <Method Class Object.getClass()>
	//   80  161:invokevirtual   #112 <Method String Class.getSimpleName()>
	//   81  164:aastore         
	//   82  165:dup             
	//   83  166:iconst_1        
	//   84  167:aload_1         
	//   85  168:aastore         
	//   86  169:invokestatic    #124 <Method String String.format(String, Object[])>
	//   87  172:iconst_0        
	//   88  173:anewarray       Throwable[]
	//   89  176:invokestatic    #132 <Method void Logger.debug(String, String, Throwable[])>
		return true;
	//   90  179:iconst_1        
	//   91  180:ireturn         
		s;
	//   92  181:astore_1        
		obj;
	//   93  182:aload_3         
		JVM INSTR monitorexit ;
	//   94  183:monitorexit     
		throw s;
	//   95  184:aload_1         
	//   96  185:athrow          
	}

	public boolean stopAndCancelWork(String s)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		WorkerWrapper workerwrapper;
		Logger.debug("Processor", String.format("Processor cancelling %s", new Object[] {
			s
		}), new Throwable[0]);
	//    5    7:ldc1            #100 <String "Processor">
	//    6    9:ldc1            #213 <String "Processor cancelling %s">
	//    7   11:iconst_1        
	//    8   12:anewarray       Object[]
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:aload_1         
	//   12   18:aastore         
	//   13   19:invokestatic    #124 <Method String String.format(String, Object[])>
	//   14   22:iconst_0        
	//   15   23:anewarray       Throwable[]
	//   16   26:invokestatic    #132 <Method void Logger.debug(String, String, Throwable[])>
		mCancelledIds.add(((Object) (s)));
	//   17   29:aload_0         
	//   18   30:getfield        #59  <Field Set mCancelledIds>
	//   19   33:aload_1         
	//   20   34:invokeinterface #214 <Method boolean Set.add(Object)>
	//   21   39:pop             
		workerwrapper = (WorkerWrapper)mEnqueuedWorkMap.remove(((Object) (s)));
	//   22   40:aload_0         
	//   23   41:getfield        #52  <Field Map mEnqueuedWorkMap>
	//   24   44:aload_1         
	//   25   45:invokeinterface #98  <Method Object Map.remove(Object)>
	//   26   50:checkcast       #176 <Class WorkerWrapper>
	//   27   53:astore_3        
		if(workerwrapper == null)
			break MISSING_BLOCK_LABEL_89;
	//   28   54:aload_3         
	//   29   55:ifnull          89
		workerwrapper.interrupt(true);
	//   30   58:aload_3         
	//   31   59:iconst_1        
	//   32   60:invokevirtual   #218 <Method void WorkerWrapper.interrupt(boolean)>
		Logger.debug("Processor", String.format("WorkerWrapper cancelled for %s", new Object[] {
			s
		}), new Throwable[0]);
	//   33   63:ldc1            #100 <String "Processor">
	//   34   65:ldc1            #220 <String "WorkerWrapper cancelled for %s">
	//   35   67:iconst_1        
	//   36   68:anewarray       Object[]
	//   37   71:dup             
	//   38   72:iconst_0        
	//   39   73:aload_1         
	//   40   74:aastore         
	//   41   75:invokestatic    #124 <Method String String.format(String, Object[])>
	//   42   78:iconst_0        
	//   43   79:anewarray       Throwable[]
	//   44   82:invokestatic    #132 <Method void Logger.debug(String, String, Throwable[])>
		obj;
	//   45   85:aload_2         
		JVM INSTR monitorexit ;
	//   46   86:monitorexit     
		return true;
	//   47   87:iconst_1        
	//   48   88:ireturn         
		Logger.debug("Processor", String.format("WorkerWrapper could not be found for %s", new Object[] {
			s
		}), new Throwable[0]);
	//   49   89:ldc1            #100 <String "Processor">
	//   50   91:ldc1            #222 <String "WorkerWrapper could not be found for %s">
	//   51   93:iconst_1        
	//   52   94:anewarray       Object[]
	//   53   97:dup             
	//   54   98:iconst_0        
	//   55   99:aload_1         
	//   56  100:aastore         
	//   57  101:invokestatic    #124 <Method String String.format(String, Object[])>
	//   58  104:iconst_0        
	//   59  105:anewarray       Throwable[]
	//   60  108:invokestatic    #132 <Method void Logger.debug(String, String, Throwable[])>
		obj;
	//   61  111:aload_2         
		JVM INSTR monitorexit ;
	//   62  112:monitorexit     
		return false;
	//   63  113:iconst_0        
	//   64  114:ireturn         
		s;
	//   65  115:astore_1        
		obj;
	//   66  116:aload_2         
		JVM INSTR monitorexit ;
	//   67  117:monitorexit     
		throw s;
	//   68  118:aload_1         
	//   69  119:athrow          
	}

	public boolean stopWork(String s)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		WorkerWrapper workerwrapper;
		Logger.debug("Processor", String.format("Processor stopping %s", new Object[] {
			s
		}), new Throwable[0]);
	//    5    7:ldc1            #100 <String "Processor">
	//    6    9:ldc1            #225 <String "Processor stopping %s">
	//    7   11:iconst_1        
	//    8   12:anewarray       Object[]
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:aload_1         
	//   12   18:aastore         
	//   13   19:invokestatic    #124 <Method String String.format(String, Object[])>
	//   14   22:iconst_0        
	//   15   23:anewarray       Throwable[]
	//   16   26:invokestatic    #132 <Method void Logger.debug(String, String, Throwable[])>
		workerwrapper = (WorkerWrapper)mEnqueuedWorkMap.remove(((Object) (s)));
	//   17   29:aload_0         
	//   18   30:getfield        #52  <Field Map mEnqueuedWorkMap>
	//   19   33:aload_1         
	//   20   34:invokeinterface #98  <Method Object Map.remove(Object)>
	//   21   39:checkcast       #176 <Class WorkerWrapper>
	//   22   42:astore_3        
		if(workerwrapper == null)
			break MISSING_BLOCK_LABEL_78;
	//   23   43:aload_3         
	//   24   44:ifnull          78
		workerwrapper.interrupt(false);
	//   25   47:aload_3         
	//   26   48:iconst_0        
	//   27   49:invokevirtual   #218 <Method void WorkerWrapper.interrupt(boolean)>
		Logger.debug("Processor", String.format("WorkerWrapper stopped for %s", new Object[] {
			s
		}), new Throwable[0]);
	//   28   52:ldc1            #100 <String "Processor">
	//   29   54:ldc1            #227 <String "WorkerWrapper stopped for %s">
	//   30   56:iconst_1        
	//   31   57:anewarray       Object[]
	//   32   60:dup             
	//   33   61:iconst_0        
	//   34   62:aload_1         
	//   35   63:aastore         
	//   36   64:invokestatic    #124 <Method String String.format(String, Object[])>
	//   37   67:iconst_0        
	//   38   68:anewarray       Throwable[]
	//   39   71:invokestatic    #132 <Method void Logger.debug(String, String, Throwable[])>
		obj;
	//   40   74:aload_2         
		JVM INSTR monitorexit ;
	//   41   75:monitorexit     
		return true;
	//   42   76:iconst_1        
	//   43   77:ireturn         
		Logger.debug("Processor", String.format("WorkerWrapper could not be found for %s", new Object[] {
			s
		}), new Throwable[0]);
	//   44   78:ldc1            #100 <String "Processor">
	//   45   80:ldc1            #222 <String "WorkerWrapper could not be found for %s">
	//   46   82:iconst_1        
	//   47   83:anewarray       Object[]
	//   48   86:dup             
	//   49   87:iconst_0        
	//   50   88:aload_1         
	//   51   89:aastore         
	//   52   90:invokestatic    #124 <Method String String.format(String, Object[])>
	//   53   93:iconst_0        
	//   54   94:anewarray       Throwable[]
	//   55   97:invokestatic    #132 <Method void Logger.debug(String, String, Throwable[])>
		obj;
	//   56  100:aload_2         
		JVM INSTR monitorexit ;
	//   57  101:monitorexit     
		return false;
	//   58  102:iconst_0        
	//   59  103:ireturn         
		s;
	//   60  104:astore_1        
		obj;
	//   61  105:aload_2         
		JVM INSTR monitorexit ;
	//   62  106:monitorexit     
		throw s;
	//   63  107:aload_1         
	//   64  108:athrow          
	}

	private Context mAppContext;
	private Set mCancelledIds;
	private Configuration mConfiguration;
	private Map mEnqueuedWorkMap;
	private final Object mLock = new Object();
	private final List mOuterListeners = new ArrayList();
	private List mSchedulers;
	private WorkDatabase mWorkDatabase;
	private TaskExecutor mWorkTaskExecutor;
}
