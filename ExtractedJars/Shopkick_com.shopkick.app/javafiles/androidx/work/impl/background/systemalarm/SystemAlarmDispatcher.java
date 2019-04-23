// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.Logger;
import androidx.work.impl.*;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.*;

// Referenced classes of package androidx.work.impl.background.systemalarm:
//			CommandHandler, WorkTimer

public class SystemAlarmDispatcher
	implements ExecutionListener
{
	static class AddRunnable
		implements Runnable
	{

		public void run()
		{
			mDispatcher.add(mIntent, mStartId);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field SystemAlarmDispatcher mDispatcher>
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field Intent mIntent>
		//    4    8:aload_0         
		//    5    9:getfield        #27  <Field int mStartId>
		//    6   12:invokevirtual   #34  <Method boolean SystemAlarmDispatcher.add(Intent, int)>
		//    7   15:pop             
		//    8   16:return          
		}

		private final SystemAlarmDispatcher mDispatcher;
		private final Intent mIntent;
		private final int mStartId;

		AddRunnable(SystemAlarmDispatcher systemalarmdispatcher, Intent intent, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			mDispatcher = systemalarmdispatcher;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field SystemAlarmDispatcher mDispatcher>
			mIntent = intent;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field Intent mIntent>
			mStartId = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #27  <Field int mStartId>
		//   11   19:return          
		}
	}

	static interface CommandsCompletedListener
	{

		public abstract void onAllCommandsCompleted();
	}

	static class DequeueAndCheckForCompletion
		implements Runnable
	{

		public void run()
		{
			mDispatcher.dequeueAndCheckForCompletion();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field SystemAlarmDispatcher mDispatcher>
		//    2    4:invokevirtual   #25  <Method void SystemAlarmDispatcher.dequeueAndCheckForCompletion()>
		//    3    7:return          
		}

		private final SystemAlarmDispatcher mDispatcher;

		DequeueAndCheckForCompletion(SystemAlarmDispatcher systemalarmdispatcher)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mDispatcher = systemalarmdispatcher;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field SystemAlarmDispatcher mDispatcher>
		//    5    9:return          
		}
	}


	SystemAlarmDispatcher(Context context)
	{
		this(context, ((Processor) (null)), ((WorkManagerImpl) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #70  <Method void SystemAlarmDispatcher(Context, Processor, WorkManagerImpl)>
	//    5    7:return          
	}

	SystemAlarmDispatcher(Context context, Processor processor, WorkManagerImpl workmanagerimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #80  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #82  <Field Context mContext>
		mCommandHandler = new CommandHandler(mContext);
	//    6   12:aload_0         
	//    7   13:new             #84  <Class CommandHandler>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #82  <Field Context mContext>
	//   11   21:invokespecial   #86  <Method void CommandHandler(Context)>
	//   12   24:putfield        #88  <Field CommandHandler mCommandHandler>
		mWorkTimer = new WorkTimer();
	//   13   27:aload_0         
	//   14   28:new             #90  <Class WorkTimer>
	//   15   31:dup             
	//   16   32:invokespecial   #91  <Method void WorkTimer()>
	//   17   35:putfield        #93  <Field WorkTimer mWorkTimer>
		if(workmanagerimpl == null)
	//*  18   38:aload_3         
	//*  19   39:ifnull          45
	//*  20   42:goto            49
			workmanagerimpl = WorkManagerImpl.getInstance();
	//   21   45:invokestatic    #99  <Method WorkManagerImpl WorkManagerImpl.getInstance()>
	//   22   48:astore_3        
		mWorkManager = workmanagerimpl;
	//   23   49:aload_0         
	//   24   50:aload_3         
	//   25   51:putfield        #101 <Field WorkManagerImpl mWorkManager>
		if(processor == null)
	//*  26   54:aload_2         
	//*  27   55:ifnull          61
	//*  28   58:goto            69
			processor = mWorkManager.getProcessor();
	//   29   61:aload_0         
	//   30   62:getfield        #101 <Field WorkManagerImpl mWorkManager>
	//   31   65:invokevirtual   #105 <Method Processor WorkManagerImpl.getProcessor()>
	//   32   68:astore_2        
		mProcessor = processor;
	//   33   69:aload_0         
	//   34   70:aload_2         
	//   35   71:putfield        #107 <Field Processor mProcessor>
		mProcessor.addExecutionListener(((ExecutionListener) (this)));
	//   36   74:aload_0         
	//   37   75:getfield        #107 <Field Processor mProcessor>
	//   38   78:aload_0         
	//   39   79:invokevirtual   #113 <Method void Processor.addExecutionListener(ExecutionListener)>
		mIntents = ((List) (new ArrayList()));
	//   40   82:aload_0         
	//   41   83:new             #115 <Class ArrayList>
	//   42   86:dup             
	//   43   87:invokespecial   #116 <Method void ArrayList()>
	//   44   90:putfield        #118 <Field List mIntents>
		mCurrentIntent = null;
	//   45   93:aload_0         
	//   46   94:aconst_null     
	//   47   95:putfield        #120 <Field Intent mCurrentIntent>
		mMainHandler = new Handler(Looper.getMainLooper());
	//   48   98:aload_0         
	//   49   99:new             #122 <Class Handler>
	//   50  102:dup             
	//   51  103:invokestatic    #128 <Method Looper Looper.getMainLooper()>
	//   52  106:invokespecial   #131 <Method void Handler(Looper)>
	//   53  109:putfield        #133 <Field Handler mMainHandler>
	//   54  112:return          
	}

	private void assertMainThread()
	{
		if(mMainHandler.getLooper().getThread() == Thread.currentThread())
	//*   0    0:aload_0         
	//*   1    1:getfield        #133 <Field Handler mMainHandler>
	//*   2    4:invokevirtual   #138 <Method Looper Handler.getLooper()>
	//*   3    7:invokevirtual   #142 <Method Thread Looper.getThread()>
	//*   4   10:invokestatic    #147 <Method Thread Thread.currentThread()>
	//*   5   13:if_acmpne       17
			return;
	//    6   16:return          
		else
			throw new IllegalStateException("Needs to be invoked on the main thread.");
	//    7   17:new             #149 <Class IllegalStateException>
	//    8   20:dup             
	//    9   21:ldc1            #151 <String "Needs to be invoked on the main thread.">
	//   10   23:invokespecial   #154 <Method void IllegalStateException(String)>
	//   11   26:athrow          
	}

	private boolean hasIntentWithAction(String s)
	{
label0:
		{
			assertMainThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #159 <Method void assertMainThread()>
			synchronized(mIntents)
	//*   2    4:aload_0         
	//*   3    5:getfield        #118 <Field List mIntents>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				Iterator iterator = mIntents.iterator();
	//    7   11:aload_0         
	//    8   12:getfield        #118 <Field List mIntents>
	//    9   15:invokeinterface #165 <Method Iterator List.iterator()>
	//   10   20:astore_3        
				do
					if(!iterator.hasNext())
						break label0;
	//   11   21:aload_3         
	//   12   22:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            53
				while(!s.equals(((Object) (((Intent)iterator.next()).getAction()))));
	//   14   30:aload_1         
	//   15   31:aload_3         
	//   16   32:invokeinterface #175 <Method Object Iterator.next()>
	//   17   37:checkcast       #177 <Class Intent>
	//   18   40:invokevirtual   #181 <Method String Intent.getAction()>
	//   19   43:invokevirtual   #187 <Method boolean String.equals(Object)>
	//   20   46:ifeq            21
			}
	//   21   49:aload_2         
	//   22   50:monitorexit     
			return true;
	//   23   51:iconst_1        
	//   24   52:ireturn         
		}
		list;
	//   25   53:aload_2         
		JVM INSTR monitorexit ;
	//   26   54:monitorexit     
		return false;
	//   27   55:iconst_0        
	//   28   56:ireturn         
		s;
	//   29   57:astore_1        
		list;
	//   30   58:aload_2         
		JVM INSTR monitorexit ;
	//   31   59:monitorexit     
		throw s;
	//   32   60:aload_1         
	//   33   61:athrow          
	}

	private void processCommand()
	{
		android.os.PowerManager.WakeLock wakelock;
		assertMainThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #159 <Method void assertMainThread()>
		wakelock = WakeLocks.newWakeLock(mContext, "ProcessCommand");
	//    2    4:aload_0         
	//    3    5:getfield        #82  <Field Context mContext>
	//    4    8:ldc1            #30  <String "ProcessCommand">
	//    5   10:invokestatic    #194 <Method android.os.PowerManager$WakeLock WakeLocks.newWakeLock(Context, String)>
	//    6   13:astore_1        
		wakelock.acquire();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #199 <Method void android.os.PowerManager$WakeLock.acquire()>
		mWorkManager.getWorkTaskExecutor().executeOnBackgroundThread(new Runnable() {

			public void run()
			{
				int i;
				Object obj1;
				synchronized(mIntents)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//*   2    4:getfield        #27  <Field List SystemAlarmDispatcher.mIntents>
			//*   3    7:astore_2        
			//*   4    8:aload_2         
			//*   5    9:monitorenter    
				{
					mCurrentIntent = (Intent)mIntents.get(0);
			//    6   10:aload_0         
			//    7   11:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//    8   14:aload_0         
			//    9   15:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   10   18:getfield        #27  <Field List SystemAlarmDispatcher.mIntents>
			//   11   21:iconst_0        
			//   12   22:invokeinterface #33  <Method Object List.get(int)>
			//   13   27:checkcast       #35  <Class Intent>
			//   14   30:putfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
				}
			//   15   33:aload_2         
			//   16   34:monitorexit     
				if(mCurrentIntent == null)
					break MISSING_BLOCK_LABEL_382;
			//   17   35:aload_0         
			//   18   36:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   19   39:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
			//   20   42:ifnull          382
				obj = ((Object) (mCurrentIntent.getAction()));
			//   21   45:aload_0         
			//   22   46:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   23   49:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
			//   24   52:invokevirtual   #43  <Method String Intent.getAction()>
			//   25   55:astore_2        
				i = mCurrentIntent.getIntExtra("KEY_START_ID", 0);
			//   26   56:aload_0         
			//   27   57:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   28   60:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
			//   29   63:ldc1            #45  <String "KEY_START_ID">
			//   30   65:iconst_0        
			//   31   66:invokevirtual   #49  <Method int Intent.getIntExtra(String, int)>
			//   32   69:istore_1        
				Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Processing command %s, %s", new Object[] {
					mCurrentIntent, Integer.valueOf(i)
				}), new Throwable[0]);
			//   33   70:invokestatic    #54  <Method Logger Logger.get()>
			//   34   73:getstatic       #58  <Field String SystemAlarmDispatcher.TAG>
			//   35   76:ldc1            #60  <String "Processing command %s, %s">
			//   36   78:iconst_2        
			//   37   79:anewarray       Object[]
			//   38   82:dup             
			//   39   83:iconst_0        
			//   40   84:aload_0         
			//   41   85:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   42   88:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
			//   43   91:aastore         
			//   44   92:dup             
			//   45   93:iconst_1        
			//   46   94:iload_1         
			//   47   95:invokestatic    #66  <Method Integer Integer.valueOf(int)>
			//   48   98:aastore         
			//   49   99:invokestatic    #72  <Method String String.format(String, Object[])>
			//   50  102:iconst_0        
			//   51  103:anewarray       Throwable[]
			//   52  106:invokevirtual   #76  <Method void Logger.debug(String, String, Throwable[])>
				obj1 = ((Object) (WakeLocks.newWakeLock(mContext, String.format("%s (%s)", new Object[] {
					obj, Integer.valueOf(i)
				}))));
			//   53  109:aload_0         
			//   54  110:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   55  113:getfield        #80  <Field Context SystemAlarmDispatcher.mContext>
			//   56  116:ldc1            #82  <String "%s (%s)">
			//   57  118:iconst_2        
			//   58  119:anewarray       Object[]
			//   59  122:dup             
			//   60  123:iconst_0        
			//   61  124:aload_2         
			//   62  125:aastore         
			//   63  126:dup             
			//   64  127:iconst_1        
			//   65  128:iload_1         
			//   66  129:invokestatic    #66  <Method Integer Integer.valueOf(int)>
			//   67  132:aastore         
			//   68  133:invokestatic    #72  <Method String String.format(String, Object[])>
			//   69  136:invokestatic    #88  <Method android.os.PowerManager$WakeLock WakeLocks.newWakeLock(Context, String)>
			//   70  139:astore_3        
				Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Acquiring operation wake lock (%s) %s", new Object[] {
					obj, obj1
				}), new Throwable[0]);
			//   71  140:invokestatic    #54  <Method Logger Logger.get()>
			//   72  143:getstatic       #58  <Field String SystemAlarmDispatcher.TAG>
			//   73  146:ldc1            #90  <String "Acquiring operation wake lock (%s) %s">
			//   74  148:iconst_2        
			//   75  149:anewarray       Object[]
			//   76  152:dup             
			//   77  153:iconst_0        
			//   78  154:aload_2         
			//   79  155:aastore         
			//   80  156:dup             
			//   81  157:iconst_1        
			//   82  158:aload_3         
			//   83  159:aastore         
			//   84  160:invokestatic    #72  <Method String String.format(String, Object[])>
			//   85  163:iconst_0        
			//   86  164:anewarray       Throwable[]
			//   87  167:invokevirtual   #76  <Method void Logger.debug(String, String, Throwable[])>
				((android.os.PowerManager.WakeLock) (obj1)).acquire();
			//   88  170:aload_3         
			//   89  171:invokevirtual   #95  <Method void android.os.PowerManager$WakeLock.acquire()>
				mCommandHandler.onHandleIntent(mCurrentIntent, i, SystemAlarmDispatcher.this);
			//   90  174:aload_0         
			//   91  175:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   92  178:getfield        #99  <Field CommandHandler SystemAlarmDispatcher.mCommandHandler>
			//   93  181:aload_0         
			//   94  182:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   95  185:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
			//   96  188:iload_1         
			//   97  189:aload_0         
			//   98  190:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   99  193:invokevirtual   #105 <Method void CommandHandler.onHandleIntent(Intent, int, SystemAlarmDispatcher)>
				Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Releasing operation wake lock (%s) %s", new Object[] {
					obj, obj1
				}), new Throwable[0]);
			//  100  196:invokestatic    #54  <Method Logger Logger.get()>
			//  101  199:getstatic       #58  <Field String SystemAlarmDispatcher.TAG>
			//  102  202:ldc1            #107 <String "Releasing operation wake lock (%s) %s">
			//  103  204:iconst_2        
			//  104  205:anewarray       Object[]
			//  105  208:dup             
			//  106  209:iconst_0        
			//  107  210:aload_2         
			//  108  211:aastore         
			//  109  212:dup             
			//  110  213:iconst_1        
			//  111  214:aload_3         
			//  112  215:aastore         
			//  113  216:invokestatic    #72  <Method String String.format(String, Object[])>
			//  114  219:iconst_0        
			//  115  220:anewarray       Throwable[]
			//  116  223:invokevirtual   #76  <Method void Logger.debug(String, String, Throwable[])>
				((android.os.PowerManager.WakeLock) (obj1)).release();
			//  117  226:aload_3         
			//  118  227:invokevirtual   #110 <Method void android.os.PowerManager$WakeLock.release()>
				obj = ((Object) (SystemAlarmDispatcher.this));
			//  119  230:aload_0         
			//  120  231:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//  121  234:astore_2        
				obj1 = ((Object) (new DequeueAndCheckForCompletion(((SystemAlarmDispatcher) (obj)))));
			//  122  235:new             #112 <Class SystemAlarmDispatcher$DequeueAndCheckForCompletion>
			//  123  238:dup             
			//  124  239:aload_2         
			//  125  240:invokespecial   #114 <Method void SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher)>
			//  126  243:astore_3        
				break MISSING_BLOCK_LABEL_322;
			//  127  244:goto            322
				Object obj2;
				obj2;
			//  128  247:astore          4
				break MISSING_BLOCK_LABEL_328;
			//  129  249:goto            328
				obj2;
			//  130  252:astore          4
				Logger.get().error(SystemAlarmDispatcher.TAG, "Unexpected error in onHandleIntent", new Throwable[] {
					obj2
				});
			//  131  254:invokestatic    #54  <Method Logger Logger.get()>
			//  132  257:getstatic       #58  <Field String SystemAlarmDispatcher.TAG>
			//  133  260:ldc1            #116 <String "Unexpected error in onHandleIntent">
			//  134  262:iconst_1        
			//  135  263:anewarray       Throwable[]
			//  136  266:dup             
			//  137  267:iconst_0        
			//  138  268:aload           4
			//  139  270:aastore         
			//  140  271:invokevirtual   #119 <Method void Logger.error(String, String, Throwable[])>
				Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Releasing operation wake lock (%s) %s", new Object[] {
					obj, obj1
				}), new Throwable[0]);
			//  141  274:invokestatic    #54  <Method Logger Logger.get()>
			//  142  277:getstatic       #58  <Field String SystemAlarmDispatcher.TAG>
			//  143  280:ldc1            #107 <String "Releasing operation wake lock (%s) %s">
			//  144  282:iconst_2        
			//  145  283:anewarray       Object[]
			//  146  286:dup             
			//  147  287:iconst_0        
			//  148  288:aload_2         
			//  149  289:aastore         
			//  150  290:dup             
			//  151  291:iconst_1        
			//  152  292:aload_3         
			//  153  293:aastore         
			//  154  294:invokestatic    #72  <Method String String.format(String, Object[])>
			//  155  297:iconst_0        
			//  156  298:anewarray       Throwable[]
			//  157  301:invokevirtual   #76  <Method void Logger.debug(String, String, Throwable[])>
				((android.os.PowerManager.WakeLock) (obj1)).release();
			//  158  304:aload_3         
			//  159  305:invokevirtual   #110 <Method void android.os.PowerManager$WakeLock.release()>
				obj = ((Object) (SystemAlarmDispatcher.this));
			//  160  308:aload_0         
			//  161  309:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//  162  312:astore_2        
				obj1 = ((Object) (new DequeueAndCheckForCompletion(((SystemAlarmDispatcher) (obj)))));
			//  163  313:new             #112 <Class SystemAlarmDispatcher$DequeueAndCheckForCompletion>
			//  164  316:dup             
			//  165  317:aload_2         
			//  166  318:invokespecial   #114 <Method void SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher)>
			//  167  321:astore_3        
				((SystemAlarmDispatcher) (obj)).postOnMainThread(((Runnable) (obj1)));
			//  168  322:aload_2         
			//  169  323:aload_3         
			//  170  324:invokevirtual   #123 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
				return;
			//  171  327:return          
				Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Releasing operation wake lock (%s) %s", new Object[] {
					obj, obj1
				}), new Throwable[0]);
			//  172  328:invokestatic    #54  <Method Logger Logger.get()>
			//  173  331:getstatic       #58  <Field String SystemAlarmDispatcher.TAG>
			//  174  334:ldc1            #107 <String "Releasing operation wake lock (%s) %s">
			//  175  336:iconst_2        
			//  176  337:anewarray       Object[]
			//  177  340:dup             
			//  178  341:iconst_0        
			//  179  342:aload_2         
			//  180  343:aastore         
			//  181  344:dup             
			//  182  345:iconst_1        
			//  183  346:aload_3         
			//  184  347:aastore         
			//  185  348:invokestatic    #72  <Method String String.format(String, Object[])>
			//  186  351:iconst_0        
			//  187  352:anewarray       Throwable[]
			//  188  355:invokevirtual   #76  <Method void Logger.debug(String, String, Throwable[])>
				((android.os.PowerManager.WakeLock) (obj1)).release();
			//  189  358:aload_3         
			//  190  359:invokevirtual   #110 <Method void android.os.PowerManager$WakeLock.release()>
				obj = ((Object) (SystemAlarmDispatcher.this));
			//  191  362:aload_0         
			//  192  363:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//  193  366:astore_2        
				((SystemAlarmDispatcher) (obj)).postOnMainThread(((Runnable) (new DequeueAndCheckForCompletion(((SystemAlarmDispatcher) (obj))))));
			//  194  367:aload_2         
			//  195  368:new             #112 <Class SystemAlarmDispatcher$DequeueAndCheckForCompletion>
			//  196  371:dup             
			//  197  372:aload_2         
			//  198  373:invokespecial   #114 <Method void SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher)>
			//  199  376:invokevirtual   #123 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
				throw obj2;
			//  200  379:aload           4
			//  201  381:athrow          
				return;
			//  202  382:return          
				exception1;
			//  203  383:astore_3        
				obj;
			//  204  384:aload_2         
				JVM INSTR monitorexit ;
			//  205  385:monitorexit     
				throw exception1;
			//  206  386:aload_3         
			//  207  387:athrow          
			}

			final SystemAlarmDispatcher this$0;

			
			{
				this$0 = SystemAlarmDispatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SystemAlarmDispatcher this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    9   18:aload_0         
	//   10   19:getfield        #101 <Field WorkManagerImpl mWorkManager>
	//   11   22:invokevirtual   #203 <Method TaskExecutor WorkManagerImpl.getWorkTaskExecutor()>
	//   12   25:new             #8   <Class SystemAlarmDispatcher$1>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:invokespecial   #206 <Method void SystemAlarmDispatcher$1(SystemAlarmDispatcher)>
	//   16   33:invokeinterface #212 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
		wakelock.release();
	//   17   38:aload_1         
	//   18   39:invokevirtual   #215 <Method void android.os.PowerManager$WakeLock.release()>
		return;
	//   19   42:return          
		Exception exception;
		exception;
	//   20   43:astore_2        
		wakelock.release();
	//   21   44:aload_1         
	//   22   45:invokevirtual   #215 <Method void android.os.PowerManager$WakeLock.release()>
		throw exception;
	//   23   48:aload_2         
	//   24   49:athrow          
	}

	public boolean add(Intent intent, int i)
	{
		boolean flag;
		Object obj = ((Object) (Logger.get()));
	//    0    0:invokestatic    #221 <Method Logger Logger.get()>
	//    1    3:astore          4
		String s = TAG;
	//    2    5:getstatic       #63  <Field String TAG>
	//    3    8:astore          5
		flag = false;
	//    4   10:iconst_0        
	//    5   11:istore_3        
		((Logger) (obj)).debug(s, String.format("Adding command %s (%s)", new Object[] {
			intent, Integer.valueOf(i)
		}), new Throwable[0]);
	//    6   12:aload           4
	//    7   14:aload           5
	//    8   16:ldc1            #223 <String "Adding command %s (%s)">
	//    9   18:iconst_2        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:aload_1         
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_1        
	//   17   28:iload_2         
	//   18   29:invokestatic    #229 <Method Integer Integer.valueOf(int)>
	//   19   32:aastore         
	//   20   33:invokestatic    #233 <Method String String.format(String, Object[])>
	//   21   36:iconst_0        
	//   22   37:anewarray       Throwable[]
	//   23   40:invokevirtual   #239 <Method void Logger.debug(String, String, Throwable[])>
		assertMainThread();
	//   24   43:aload_0         
	//   25   44:invokespecial   #159 <Method void assertMainThread()>
		obj = ((Object) (intent.getAction()));
	//   26   47:aload_1         
	//   27   48:invokevirtual   #181 <Method String Intent.getAction()>
	//   28   51:astore          4
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*  29   53:aload           4
	//*  30   55:invokestatic    #245 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  31   58:ifeq            78
		{
			Logger.get().warning(TAG, "Unknown command. Ignoring", new Throwable[0]);
	//   32   61:invokestatic    #221 <Method Logger Logger.get()>
	//   33   64:getstatic       #63  <Field String TAG>
	//   34   67:ldc1            #247 <String "Unknown command. Ignoring">
	//   35   69:iconst_0        
	//   36   70:anewarray       Throwable[]
	//   37   73:invokevirtual   #250 <Method void Logger.warning(String, String, Throwable[])>
			return false;
	//   38   76:iconst_0        
	//   39   77:ireturn         
		}
		if("ACTION_CONSTRAINTS_CHANGED".equals(obj) && hasIntentWithAction("ACTION_CONSTRAINTS_CHANGED"))
	//*  40   78:ldc1            #252 <String "ACTION_CONSTRAINTS_CHANGED">
	//*  41   80:aload           4
	//*  42   82:invokevirtual   #187 <Method boolean String.equals(Object)>
	//*  43   85:ifeq            99
	//*  44   88:aload_0         
	//*  45   89:ldc1            #252 <String "ACTION_CONSTRAINTS_CHANGED">
	//*  46   91:invokespecial   #254 <Method boolean hasIntentWithAction(String)>
	//*  47   94:ifeq            99
			return false;
	//   48   97:iconst_0        
	//   49   98:ireturn         
		intent.putExtra("KEY_START_ID", i);
	//   50   99:aload_1         
	//   51  100:ldc1            #27  <String "KEY_START_ID">
	//   52  102:iload_2         
	//   53  103:invokevirtual   #258 <Method Intent Intent.putExtra(String, int)>
	//   54  106:pop             
		List list = mIntents;
	//   55  107:aload_0         
	//   56  108:getfield        #118 <Field List mIntents>
	//   57  111:astore          4
		list;
	//   58  113:aload           4
		JVM INSTR monitorenter ;
	//   59  115:monitorenter    
		i = ((int) (flag));
	//   60  116:iload_3         
	//   61  117:istore_2        
		if(!mIntents.isEmpty())
	//*  62  118:aload_0         
	//*  63  119:getfield        #118 <Field List mIntents>
	//*  64  122:invokeinterface #260 <Method boolean List.isEmpty()>
	//*  65  127:ifne            132
			i = 1;
	//   66  130:iconst_1        
	//   67  131:istore_2        
		mIntents.add(((Object) (intent)));
	//   68  132:aload_0         
	//   69  133:getfield        #118 <Field List mIntents>
	//   70  136:aload_1         
	//   71  137:invokeinterface #262 <Method boolean List.add(Object)>
	//   72  142:pop             
		if(i != 0)
			break MISSING_BLOCK_LABEL_151;
	//   73  143:iload_2         
	//   74  144:ifne            151
		processCommand();
	//   75  147:aload_0         
	//   76  148:invokespecial   #264 <Method void processCommand()>
		list;
	//   77  151:aload           4
		JVM INSTR monitorexit ;
	//   78  153:monitorexit     
		return true;
	//   79  154:iconst_1        
	//   80  155:ireturn         
		intent;
	//   81  156:astore_1        
		list;
	//   82  157:aload           4
		JVM INSTR monitorexit ;
	//   83  159:monitorexit     
		throw intent;
	//   84  160:aload_1         
	//   85  161:athrow          
	}

	void dequeueAndCheckForCompletion()
	{
		Logger.get().debug(TAG, "Checking if commands are complete.", new Throwable[0]);
	//    0    0:invokestatic    #221 <Method Logger Logger.get()>
	//    1    3:getstatic       #63  <Field String TAG>
	//    2    6:ldc2            #267 <String "Checking if commands are complete.">
	//    3    9:iconst_0        
	//    4   10:anewarray       Throwable[]
	//    5   13:invokevirtual   #239 <Method void Logger.debug(String, String, Throwable[])>
		assertMainThread();
	//    6   16:aload_0         
	//    7   17:invokespecial   #159 <Method void assertMainThread()>
		List list = mIntents;
	//    8   20:aload_0         
	//    9   21:getfield        #118 <Field List mIntents>
	//   10   24:astore_1        
		list;
	//   11   25:aload_1         
		JVM INSTR monitorenter ;
	//   12   26:monitorenter    
		if(mCurrentIntent == null)
			break MISSING_BLOCK_LABEL_106;
	//   13   27:aload_0         
	//   14   28:getfield        #120 <Field Intent mCurrentIntent>
	//   15   31:ifnull          106
		Logger.get().debug(TAG, String.format("Removing command %s", new Object[] {
			mCurrentIntent
		}), new Throwable[0]);
	//   16   34:invokestatic    #221 <Method Logger Logger.get()>
	//   17   37:getstatic       #63  <Field String TAG>
	//   18   40:ldc2            #269 <String "Removing command %s">
	//   19   43:iconst_1        
	//   20   44:anewarray       Object[]
	//   21   47:dup             
	//   22   48:iconst_0        
	//   23   49:aload_0         
	//   24   50:getfield        #120 <Field Intent mCurrentIntent>
	//   25   53:aastore         
	//   26   54:invokestatic    #233 <Method String String.format(String, Object[])>
	//   27   57:iconst_0        
	//   28   58:anewarray       Throwable[]
	//   29   61:invokevirtual   #239 <Method void Logger.debug(String, String, Throwable[])>
		if(((Object) ((Intent)mIntents.remove(0))).equals(((Object) (mCurrentIntent))))
	//*  30   64:aload_0         
	//*  31   65:getfield        #118 <Field List mIntents>
	//*  32   68:iconst_0        
	//*  33   69:invokeinterface #273 <Method Object List.remove(int)>
	//*  34   74:checkcast       #177 <Class Intent>
	//*  35   77:aload_0         
	//*  36   78:getfield        #120 <Field Intent mCurrentIntent>
	//*  37   81:invokevirtual   #274 <Method boolean Object.equals(Object)>
	//*  38   84:ifeq            95
		{
			mCurrentIntent = null;
	//   39   87:aload_0         
	//   40   88:aconst_null     
	//   41   89:putfield        #120 <Field Intent mCurrentIntent>
			break MISSING_BLOCK_LABEL_106;
	//   42   92:goto            106
		}
		throw new IllegalStateException("Dequeue-d command is not the first.");
	//   43   95:new             #149 <Class IllegalStateException>
	//   44   98:dup             
	//   45   99:ldc2            #276 <String "Dequeue-d command is not the first.">
	//   46  102:invokespecial   #154 <Method void IllegalStateException(String)>
	//   47  105:athrow          
		if(!mCommandHandler.hasPendingCommands() && mIntents.isEmpty())
	//*  48  106:aload_0         
	//*  49  107:getfield        #88  <Field CommandHandler mCommandHandler>
	//*  50  110:invokevirtual   #279 <Method boolean CommandHandler.hasPendingCommands()>
	//*  51  113:ifne            163
	//*  52  116:aload_0         
	//*  53  117:getfield        #118 <Field List mIntents>
	//*  54  120:invokeinterface #260 <Method boolean List.isEmpty()>
	//*  55  125:ifeq            163
		{
			Logger.get().debug(TAG, "No more commands & intents.", new Throwable[0]);
	//   56  128:invokestatic    #221 <Method Logger Logger.get()>
	//   57  131:getstatic       #63  <Field String TAG>
	//   58  134:ldc2            #281 <String "No more commands & intents.">
	//   59  137:iconst_0        
	//   60  138:anewarray       Throwable[]
	//   61  141:invokevirtual   #239 <Method void Logger.debug(String, String, Throwable[])>
			if(mCompletedListener != null)
	//*  62  144:aload_0         
	//*  63  145:getfield        #283 <Field SystemAlarmDispatcher$CommandsCompletedListener mCompletedListener>
	//*  64  148:ifnull          179
				mCompletedListener.onAllCommandsCompleted();
	//   65  151:aload_0         
	//   66  152:getfield        #283 <Field SystemAlarmDispatcher$CommandsCompletedListener mCompletedListener>
	//   67  155:invokeinterface #286 <Method void SystemAlarmDispatcher$CommandsCompletedListener.onAllCommandsCompleted()>
			break MISSING_BLOCK_LABEL_179;
	//   68  160:goto            179
		}
		if(!mIntents.isEmpty())
	//*  69  163:aload_0         
	//*  70  164:getfield        #118 <Field List mIntents>
	//*  71  167:invokeinterface #260 <Method boolean List.isEmpty()>
	//*  72  172:ifne            179
			processCommand();
	//   73  175:aload_0         
	//   74  176:invokespecial   #264 <Method void processCommand()>
		list;
	//   75  179:aload_1         
		JVM INSTR monitorexit ;
	//   76  180:monitorexit     
		return;
	//   77  181:return          
		Exception exception;
		exception;
	//   78  182:astore_2        
		list;
	//   79  183:aload_1         
		JVM INSTR monitorexit ;
	//   80  184:monitorexit     
		throw exception;
	//   81  185:aload_2         
	//   82  186:athrow          
	}

	Processor getProcessor()
	{
		return mProcessor;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Processor mProcessor>
	//    2    4:areturn         
	}

	WorkManagerImpl getWorkManager()
	{
		return mWorkManager;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field WorkManagerImpl mWorkManager>
	//    2    4:areturn         
	}

	WorkTimer getWorkTimer()
	{
		return mWorkTimer;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field WorkTimer mWorkTimer>
	//    2    4:areturn         
	}

	void onDestroy()
	{
		mProcessor.removeExecutionListener(((ExecutionListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Processor mProcessor>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #293 <Method void Processor.removeExecutionListener(ExecutionListener)>
		mCompletedListener = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #283 <Field SystemAlarmDispatcher$CommandsCompletedListener mCompletedListener>
	//    7   13:return          
	}

	public void onExecuted(String s, boolean flag)
	{
		postOnMainThread(((Runnable) (new AddRunnable(this, CommandHandler.createExecutionCompletedIntent(mContext, s, flag), 0))));
	//    0    0:aload_0         
	//    1    1:new             #10  <Class SystemAlarmDispatcher$AddRunnable>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #82  <Field Context mContext>
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokestatic    #299 <Method Intent CommandHandler.createExecutionCompletedIntent(Context, String, boolean)>
	//    9   15:iconst_0        
	//   10   16:invokespecial   #302 <Method void SystemAlarmDispatcher$AddRunnable(SystemAlarmDispatcher, Intent, int)>
	//   11   19:invokevirtual   #305 <Method void postOnMainThread(Runnable)>
	//   12   22:return          
	}

	void postOnMainThread(Runnable runnable)
	{
		mMainHandler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field Handler mMainHandler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #309 <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	void setCompletedListener(CommandsCompletedListener commandscompletedlistener)
	{
		if(mCompletedListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #283 <Field SystemAlarmDispatcher$CommandsCompletedListener mCompletedListener>
	//*   2    4:ifnull          24
		{
			Logger.get().error(TAG, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
	//    3    7:invokestatic    #221 <Method Logger Logger.get()>
	//    4   10:getstatic       #63  <Field String TAG>
	//    5   13:ldc2            #313 <String "A completion listener for SystemAlarmDispatcher already exists.">
	//    6   16:iconst_0        
	//    7   17:anewarray       Throwable[]
	//    8   20:invokevirtual   #316 <Method void Logger.error(String, String, Throwable[])>
			return;
	//    9   23:return          
		} else
		{
			mCompletedListener = commandscompletedlistener;
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:putfield        #283 <Field SystemAlarmDispatcher$CommandsCompletedListener mCompletedListener>
			return;
	//   13   29:return          
		}
	}

	private static final int DEFAULT_START_ID = 0;
	private static final String KEY_START_ID = "KEY_START_ID";
	private static final String PROCESS_COMMAND_TAG = "ProcessCommand";
	static final String TAG = Logger.tagWithPrefix("SystemAlarmDispatcher");
	final CommandHandler mCommandHandler;
	private CommandsCompletedListener mCompletedListener;
	final Context mContext;
	Intent mCurrentIntent;
	final List mIntents;
	private final Handler mMainHandler;
	private final Processor mProcessor;
	private final WorkManagerImpl mWorkManager;
	private final WorkTimer mWorkTimer;

	static 
	{
	//    0    0:ldc1            #55  <String "SystemAlarmDispatcher">
	//    1    2:invokestatic    #61  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #63  <Field String TAG>
	//*   3    8:return          
	}
}
