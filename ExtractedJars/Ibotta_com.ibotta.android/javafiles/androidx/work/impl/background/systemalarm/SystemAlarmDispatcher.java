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
	//    4    4:invokespecial   #47  <Method void SystemAlarmDispatcher(Context, Processor, WorkManagerImpl)>
	//    5    7:return          
	}

	SystemAlarmDispatcher(Context context, Processor processor, WorkManagerImpl workmanagerimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #59  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #61  <Field Context mContext>
		mCommandHandler = new CommandHandler(mContext);
	//    6   12:aload_0         
	//    7   13:new             #63  <Class CommandHandler>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #61  <Field Context mContext>
	//   11   21:invokespecial   #65  <Method void CommandHandler(Context)>
	//   12   24:putfield        #67  <Field CommandHandler mCommandHandler>
		mWorkTimer = new WorkTimer();
	//   13   27:aload_0         
	//   14   28:new             #69  <Class WorkTimer>
	//   15   31:dup             
	//   16   32:invokespecial   #70  <Method void WorkTimer()>
	//   17   35:putfield        #72  <Field WorkTimer mWorkTimer>
		if(workmanagerimpl == null)
	//*  18   38:aload_3         
	//*  19   39:ifnull          45
	//*  20   42:goto            49
			workmanagerimpl = WorkManagerImpl.getInstance();
	//   21   45:invokestatic    #78  <Method WorkManagerImpl WorkManagerImpl.getInstance()>
	//   22   48:astore_3        
		mWorkManager = workmanagerimpl;
	//   23   49:aload_0         
	//   24   50:aload_3         
	//   25   51:putfield        #80  <Field WorkManagerImpl mWorkManager>
		if(processor == null)
	//*  26   54:aload_2         
	//*  27   55:ifnull          61
	//*  28   58:goto            69
			processor = mWorkManager.getProcessor();
	//   29   61:aload_0         
	//   30   62:getfield        #80  <Field WorkManagerImpl mWorkManager>
	//   31   65:invokevirtual   #84  <Method Processor WorkManagerImpl.getProcessor()>
	//   32   68:astore_2        
		mProcessor = processor;
	//   33   69:aload_0         
	//   34   70:aload_2         
	//   35   71:putfield        #86  <Field Processor mProcessor>
		mProcessor.addExecutionListener(((ExecutionListener) (this)));
	//   36   74:aload_0         
	//   37   75:getfield        #86  <Field Processor mProcessor>
	//   38   78:aload_0         
	//   39   79:invokevirtual   #92  <Method void Processor.addExecutionListener(ExecutionListener)>
		mIntents = ((List) (new ArrayList()));
	//   40   82:aload_0         
	//   41   83:new             #94  <Class ArrayList>
	//   42   86:dup             
	//   43   87:invokespecial   #95  <Method void ArrayList()>
	//   44   90:putfield        #97  <Field List mIntents>
		mCurrentIntent = null;
	//   45   93:aload_0         
	//   46   94:aconst_null     
	//   47   95:putfield        #99  <Field Intent mCurrentIntent>
		mMainHandler = new Handler(Looper.getMainLooper());
	//   48   98:aload_0         
	//   49   99:new             #101 <Class Handler>
	//   50  102:dup             
	//   51  103:invokestatic    #107 <Method Looper Looper.getMainLooper()>
	//   52  106:invokespecial   #110 <Method void Handler(Looper)>
	//   53  109:putfield        #112 <Field Handler mMainHandler>
	//   54  112:return          
	}

	private void assertMainThread()
	{
		if(mMainHandler.getLooper().getThread() == Thread.currentThread())
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field Handler mMainHandler>
	//*   2    4:invokevirtual   #117 <Method Looper Handler.getLooper()>
	//*   3    7:invokevirtual   #121 <Method Thread Looper.getThread()>
	//*   4   10:invokestatic    #126 <Method Thread Thread.currentThread()>
	//*   5   13:if_acmpne       17
			return;
	//    6   16:return          
		else
			throw new IllegalStateException("Needs to be invoked on the main thread.");
	//    7   17:new             #128 <Class IllegalStateException>
	//    8   20:dup             
	//    9   21:ldc1            #130 <String "Needs to be invoked on the main thread.">
	//   10   23:invokespecial   #133 <Method void IllegalStateException(String)>
	//   11   26:athrow          
	}

	private boolean hasIntentWithAction(String s)
	{
label0:
		{
			assertMainThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method void assertMainThread()>
			synchronized(mIntents)
	//*   2    4:aload_0         
	//*   3    5:getfield        #97  <Field List mIntents>
	//*   4    8:astore_2        
	//*   5    9:aload_2         
	//*   6   10:monitorenter    
			{
				Iterator iterator = mIntents.iterator();
	//    7   11:aload_0         
	//    8   12:getfield        #97  <Field List mIntents>
	//    9   15:invokeinterface #144 <Method Iterator List.iterator()>
	//   10   20:astore_3        
				do
					if(!iterator.hasNext())
						break label0;
	//   11   21:aload_3         
	//   12   22:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            53
				while(!s.equals(((Object) (((Intent)iterator.next()).getAction()))));
	//   14   30:aload_1         
	//   15   31:aload_3         
	//   16   32:invokeinterface #154 <Method Object Iterator.next()>
	//   17   37:checkcast       #156 <Class Intent>
	//   18   40:invokevirtual   #160 <Method String Intent.getAction()>
	//   19   43:invokevirtual   #166 <Method boolean String.equals(Object)>
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
	//    1    1:invokespecial   #138 <Method void assertMainThread()>
		wakelock = WakeLocks.newWakeLock(mContext, "ProcessCommand");
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field Context mContext>
	//    4    8:ldc1            #169 <String "ProcessCommand">
	//    5   10:invokestatic    #175 <Method android.os.PowerManager$WakeLock WakeLocks.newWakeLock(Context, String)>
	//    6   13:astore_1        
		wakelock.acquire();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #180 <Method void android.os.PowerManager$WakeLock.acquire()>
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
					break MISSING_BLOCK_LABEL_358;
			//   17   35:aload_0         
			//   18   36:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   19   39:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
			//   20   42:ifnull          358
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
				Logger.debug("SystemAlarmDispatcher", String.format("Processing command %s, %s", new Object[] {
					mCurrentIntent, Integer.valueOf(i)
				}), new Throwable[0]);
			//   33   70:ldc1            #51  <String "SystemAlarmDispatcher">
			//   34   72:ldc1            #53  <String "Processing command %s, %s">
			//   35   74:iconst_2        
			//   36   75:anewarray       Object[]
			//   37   78:dup             
			//   38   79:iconst_0        
			//   39   80:aload_0         
			//   40   81:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   41   84:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
			//   42   87:aastore         
			//   43   88:dup             
			//   44   89:iconst_1        
			//   45   90:iload_1         
			//   46   91:invokestatic    #59  <Method Integer Integer.valueOf(int)>
			//   47   94:aastore         
			//   48   95:invokestatic    #65  <Method String String.format(String, Object[])>
			//   49   98:iconst_0        
			//   50   99:anewarray       Throwable[]
			//   51  102:invokestatic    #71  <Method void Logger.debug(String, String, Throwable[])>
				obj1 = ((Object) (WakeLocks.newWakeLock(mContext, String.format("%s (%s)", new Object[] {
					obj, Integer.valueOf(i)
				}))));
			//   52  105:aload_0         
			//   53  106:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   54  109:getfield        #75  <Field Context SystemAlarmDispatcher.mContext>
			//   55  112:ldc1            #77  <String "%s (%s)">
			//   56  114:iconst_2        
			//   57  115:anewarray       Object[]
			//   58  118:dup             
			//   59  119:iconst_0        
			//   60  120:aload_2         
			//   61  121:aastore         
			//   62  122:dup             
			//   63  123:iconst_1        
			//   64  124:iload_1         
			//   65  125:invokestatic    #59  <Method Integer Integer.valueOf(int)>
			//   66  128:aastore         
			//   67  129:invokestatic    #65  <Method String String.format(String, Object[])>
			//   68  132:invokestatic    #83  <Method android.os.PowerManager$WakeLock WakeLocks.newWakeLock(Context, String)>
			//   69  135:astore_3        
				Logger.debug("SystemAlarmDispatcher", String.format("Acquiring operation wake lock (%s) %s", new Object[] {
					obj, obj1
				}), new Throwable[0]);
			//   70  136:ldc1            #51  <String "SystemAlarmDispatcher">
			//   71  138:ldc1            #85  <String "Acquiring operation wake lock (%s) %s">
			//   72  140:iconst_2        
			//   73  141:anewarray       Object[]
			//   74  144:dup             
			//   75  145:iconst_0        
			//   76  146:aload_2         
			//   77  147:aastore         
			//   78  148:dup             
			//   79  149:iconst_1        
			//   80  150:aload_3         
			//   81  151:aastore         
			//   82  152:invokestatic    #65  <Method String String.format(String, Object[])>
			//   83  155:iconst_0        
			//   84  156:anewarray       Throwable[]
			//   85  159:invokestatic    #71  <Method void Logger.debug(String, String, Throwable[])>
				((android.os.PowerManager.WakeLock) (obj1)).acquire();
			//   86  162:aload_3         
			//   87  163:invokevirtual   #90  <Method void android.os.PowerManager$WakeLock.acquire()>
				mCommandHandler.onHandleIntent(mCurrentIntent, i, SystemAlarmDispatcher.this);
			//   88  166:aload_0         
			//   89  167:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   90  170:getfield        #94  <Field CommandHandler SystemAlarmDispatcher.mCommandHandler>
			//   91  173:aload_0         
			//   92  174:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   93  177:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
			//   94  180:iload_1         
			//   95  181:aload_0         
			//   96  182:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//   97  185:invokevirtual   #100 <Method void CommandHandler.onHandleIntent(Intent, int, SystemAlarmDispatcher)>
				Logger.debug("SystemAlarmDispatcher", String.format("Releasing operation wake lock (%s) %s", new Object[] {
					obj, obj1
				}), new Throwable[0]);
			//   98  188:ldc1            #51  <String "SystemAlarmDispatcher">
			//   99  190:ldc1            #102 <String "Releasing operation wake lock (%s) %s">
			//  100  192:iconst_2        
			//  101  193:anewarray       Object[]
			//  102  196:dup             
			//  103  197:iconst_0        
			//  104  198:aload_2         
			//  105  199:aastore         
			//  106  200:dup             
			//  107  201:iconst_1        
			//  108  202:aload_3         
			//  109  203:aastore         
			//  110  204:invokestatic    #65  <Method String String.format(String, Object[])>
			//  111  207:iconst_0        
			//  112  208:anewarray       Throwable[]
			//  113  211:invokestatic    #71  <Method void Logger.debug(String, String, Throwable[])>
				((android.os.PowerManager.WakeLock) (obj1)).release();
			//  114  214:aload_3         
			//  115  215:invokevirtual   #105 <Method void android.os.PowerManager$WakeLock.release()>
				obj = ((Object) (SystemAlarmDispatcher.this));
			//  116  218:aload_0         
			//  117  219:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//  118  222:astore_2        
				obj1 = ((Object) (new DequeueAndCheckForCompletion(((SystemAlarmDispatcher) (obj)))));
			//  119  223:new             #107 <Class SystemAlarmDispatcher$DequeueAndCheckForCompletion>
			//  120  226:dup             
			//  121  227:aload_2         
			//  122  228:invokespecial   #109 <Method void SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher)>
			//  123  231:astore_3        
				break MISSING_BLOCK_LABEL_302;
			//  124  232:goto            302
				Object obj2;
				obj2;
			//  125  235:astore          4
				break MISSING_BLOCK_LABEL_308;
			//  126  237:goto            308
				obj2;
			//  127  240:astore          4
				Logger.error("SystemAlarmDispatcher", "Unexpected error in onHandleIntent", new Throwable[] {
					obj2
				});
			//  128  242:ldc1            #51  <String "SystemAlarmDispatcher">
			//  129  244:ldc1            #111 <String "Unexpected error in onHandleIntent">
			//  130  246:iconst_1        
			//  131  247:anewarray       Throwable[]
			//  132  250:dup             
			//  133  251:iconst_0        
			//  134  252:aload           4
			//  135  254:aastore         
			//  136  255:invokestatic    #114 <Method void Logger.error(String, String, Throwable[])>
				Logger.debug("SystemAlarmDispatcher", String.format("Releasing operation wake lock (%s) %s", new Object[] {
					obj, obj1
				}), new Throwable[0]);
			//  137  258:ldc1            #51  <String "SystemAlarmDispatcher">
			//  138  260:ldc1            #102 <String "Releasing operation wake lock (%s) %s">
			//  139  262:iconst_2        
			//  140  263:anewarray       Object[]
			//  141  266:dup             
			//  142  267:iconst_0        
			//  143  268:aload_2         
			//  144  269:aastore         
			//  145  270:dup             
			//  146  271:iconst_1        
			//  147  272:aload_3         
			//  148  273:aastore         
			//  149  274:invokestatic    #65  <Method String String.format(String, Object[])>
			//  150  277:iconst_0        
			//  151  278:anewarray       Throwable[]
			//  152  281:invokestatic    #71  <Method void Logger.debug(String, String, Throwable[])>
				((android.os.PowerManager.WakeLock) (obj1)).release();
			//  153  284:aload_3         
			//  154  285:invokevirtual   #105 <Method void android.os.PowerManager$WakeLock.release()>
				obj = ((Object) (SystemAlarmDispatcher.this));
			//  155  288:aload_0         
			//  156  289:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//  157  292:astore_2        
				obj1 = ((Object) (new DequeueAndCheckForCompletion(((SystemAlarmDispatcher) (obj)))));
			//  158  293:new             #107 <Class SystemAlarmDispatcher$DequeueAndCheckForCompletion>
			//  159  296:dup             
			//  160  297:aload_2         
			//  161  298:invokespecial   #109 <Method void SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher)>
			//  162  301:astore_3        
				((SystemAlarmDispatcher) (obj)).postOnMainThread(((Runnable) (obj1)));
			//  163  302:aload_2         
			//  164  303:aload_3         
			//  165  304:invokevirtual   #118 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
				return;
			//  166  307:return          
				Logger.debug("SystemAlarmDispatcher", String.format("Releasing operation wake lock (%s) %s", new Object[] {
					obj, obj1
				}), new Throwable[0]);
			//  167  308:ldc1            #51  <String "SystemAlarmDispatcher">
			//  168  310:ldc1            #102 <String "Releasing operation wake lock (%s) %s">
			//  169  312:iconst_2        
			//  170  313:anewarray       Object[]
			//  171  316:dup             
			//  172  317:iconst_0        
			//  173  318:aload_2         
			//  174  319:aastore         
			//  175  320:dup             
			//  176  321:iconst_1        
			//  177  322:aload_3         
			//  178  323:aastore         
			//  179  324:invokestatic    #65  <Method String String.format(String, Object[])>
			//  180  327:iconst_0        
			//  181  328:anewarray       Throwable[]
			//  182  331:invokestatic    #71  <Method void Logger.debug(String, String, Throwable[])>
				((android.os.PowerManager.WakeLock) (obj1)).release();
			//  183  334:aload_3         
			//  184  335:invokevirtual   #105 <Method void android.os.PowerManager$WakeLock.release()>
				obj = ((Object) (SystemAlarmDispatcher.this));
			//  185  338:aload_0         
			//  186  339:getfield        #17  <Field SystemAlarmDispatcher this$0>
			//  187  342:astore_2        
				((SystemAlarmDispatcher) (obj)).postOnMainThread(((Runnable) (new DequeueAndCheckForCompletion(((SystemAlarmDispatcher) (obj))))));
			//  188  343:aload_2         
			//  189  344:new             #107 <Class SystemAlarmDispatcher$DequeueAndCheckForCompletion>
			//  190  347:dup             
			//  191  348:aload_2         
			//  192  349:invokespecial   #109 <Method void SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher)>
			//  193  352:invokevirtual   #118 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
				throw obj2;
			//  194  355:aload           4
			//  195  357:athrow          
				return;
			//  196  358:return          
				exception1;
			//  197  359:astore_3        
				obj;
			//  198  360:aload_2         
				JVM INSTR monitorexit ;
			//  199  361:monitorexit     
				throw exception1;
			//  200  362:aload_3         
			//  201  363:athrow          
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
	//   10   19:getfield        #80  <Field WorkManagerImpl mWorkManager>
	//   11   22:invokevirtual   #184 <Method TaskExecutor WorkManagerImpl.getWorkTaskExecutor()>
	//   12   25:new             #8   <Class SystemAlarmDispatcher$1>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:invokespecial   #187 <Method void SystemAlarmDispatcher$1(SystemAlarmDispatcher)>
	//   16   33:invokeinterface #193 <Method void TaskExecutor.executeOnBackgroundThread(Runnable)>
		wakelock.release();
	//   17   38:aload_1         
	//   18   39:invokevirtual   #196 <Method void android.os.PowerManager$WakeLock.release()>
		return;
	//   19   42:return          
		Exception exception;
		exception;
	//   20   43:astore_2        
		wakelock.release();
	//   21   44:aload_1         
	//   22   45:invokevirtual   #196 <Method void android.os.PowerManager$WakeLock.release()>
		throw exception;
	//   23   48:aload_2         
	//   24   49:athrow          
	}

	public boolean add(Intent intent, int i)
	{
		boolean flag;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		Logger.debug("SystemAlarmDispatcher", String.format("Adding command %s (%s)", new Object[] {
			intent, Integer.valueOf(i)
		}), new Throwable[0]);
	//    2    2:ldc1            #200 <String "SystemAlarmDispatcher">
	//    3    4:ldc1            #202 <String "Adding command %s (%s)">
	//    4    6:iconst_2        
	//    5    7:anewarray       Object[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:aload_1         
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_1        
	//   12   16:iload_2         
	//   13   17:invokestatic    #208 <Method Integer Integer.valueOf(int)>
	//   14   20:aastore         
	//   15   21:invokestatic    #212 <Method String String.format(String, Object[])>
	//   16   24:iconst_0        
	//   17   25:anewarray       Throwable[]
	//   18   28:invokestatic    #220 <Method void Logger.debug(String, String, Throwable[])>
		assertMainThread();
	//   19   31:aload_0         
	//   20   32:invokespecial   #138 <Method void assertMainThread()>
		String s = intent.getAction();
	//   21   35:aload_1         
	//   22   36:invokevirtual   #160 <Method String Intent.getAction()>
	//   23   39:astore          4
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  24   41:aload           4
	//*  25   43:invokestatic    #226 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  26   46:ifeq            62
		{
			Logger.warning("SystemAlarmDispatcher", "Unknown command. Ignoring", new Throwable[0]);
	//   27   49:ldc1            #200 <String "SystemAlarmDispatcher">
	//   28   51:ldc1            #228 <String "Unknown command. Ignoring">
	//   29   53:iconst_0        
	//   30   54:anewarray       Throwable[]
	//   31   57:invokestatic    #231 <Method void Logger.warning(String, String, Throwable[])>
			return false;
	//   32   60:iconst_0        
	//   33   61:ireturn         
		}
		if("ACTION_CONSTRAINTS_CHANGED".equals(((Object) (s))) && hasIntentWithAction("ACTION_CONSTRAINTS_CHANGED"))
	//*  34   62:ldc1            #233 <String "ACTION_CONSTRAINTS_CHANGED">
	//*  35   64:aload           4
	//*  36   66:invokevirtual   #166 <Method boolean String.equals(Object)>
	//*  37   69:ifeq            83
	//*  38   72:aload_0         
	//*  39   73:ldc1            #233 <String "ACTION_CONSTRAINTS_CHANGED">
	//*  40   75:invokespecial   #235 <Method boolean hasIntentWithAction(String)>
	//*  41   78:ifeq            83
			return false;
	//   42   81:iconst_0        
	//   43   82:ireturn         
		intent.putExtra("KEY_START_ID", i);
	//   44   83:aload_1         
	//   45   84:ldc1            #237 <String "KEY_START_ID">
	//   46   86:iload_2         
	//   47   87:invokevirtual   #241 <Method Intent Intent.putExtra(String, int)>
	//   48   90:pop             
		List list = mIntents;
	//   49   91:aload_0         
	//   50   92:getfield        #97  <Field List mIntents>
	//   51   95:astore          4
		list;
	//   52   97:aload           4
		JVM INSTR monitorenter ;
	//   53   99:monitorenter    
		i = ((int) (flag));
	//   54  100:iload_3         
	//   55  101:istore_2        
		if(!mIntents.isEmpty())
	//*  56  102:aload_0         
	//*  57  103:getfield        #97  <Field List mIntents>
	//*  58  106:invokeinterface #243 <Method boolean List.isEmpty()>
	//*  59  111:ifne            116
			i = 1;
	//   60  114:iconst_1        
	//   61  115:istore_2        
		mIntents.add(((Object) (intent)));
	//   62  116:aload_0         
	//   63  117:getfield        #97  <Field List mIntents>
	//   64  120:aload_1         
	//   65  121:invokeinterface #245 <Method boolean List.add(Object)>
	//   66  126:pop             
		if(i != 0)
			break MISSING_BLOCK_LABEL_135;
	//   67  127:iload_2         
	//   68  128:ifne            135
		processCommand();
	//   69  131:aload_0         
	//   70  132:invokespecial   #247 <Method void processCommand()>
		list;
	//   71  135:aload           4
		JVM INSTR monitorexit ;
	//   72  137:monitorexit     
		return true;
	//   73  138:iconst_1        
	//   74  139:ireturn         
		intent;
	//   75  140:astore_1        
		list;
	//   76  141:aload           4
		JVM INSTR monitorexit ;
	//   77  143:monitorexit     
		throw intent;
	//   78  144:aload_1         
	//   79  145:athrow          
	}

	void dequeueAndCheckForCompletion()
	{
		Logger.debug("SystemAlarmDispatcher", "Checking if commands are complete.", new Throwable[0]);
	//    0    0:ldc1            #200 <String "SystemAlarmDispatcher">
	//    1    2:ldc1            #250 <String "Checking if commands are complete.">
	//    2    4:iconst_0        
	//    3    5:anewarray       Throwable[]
	//    4    8:invokestatic    #220 <Method void Logger.debug(String, String, Throwable[])>
		assertMainThread();
	//    5   11:aload_0         
	//    6   12:invokespecial   #138 <Method void assertMainThread()>
		List list = mIntents;
	//    7   15:aload_0         
	//    8   16:getfield        #97  <Field List mIntents>
	//    9   19:astore_1        
		list;
	//   10   20:aload_1         
		JVM INSTR monitorenter ;
	//   11   21:monitorenter    
		if(mCurrentIntent == null)
			break MISSING_BLOCK_LABEL_96;
	//   12   22:aload_0         
	//   13   23:getfield        #99  <Field Intent mCurrentIntent>
	//   14   26:ifnull          96
		Logger.debug("SystemAlarmDispatcher", String.format("Removing command %s", new Object[] {
			mCurrentIntent
		}), new Throwable[0]);
	//   15   29:ldc1            #200 <String "SystemAlarmDispatcher">
	//   16   31:ldc1            #252 <String "Removing command %s">
	//   17   33:iconst_1        
	//   18   34:anewarray       Object[]
	//   19   37:dup             
	//   20   38:iconst_0        
	//   21   39:aload_0         
	//   22   40:getfield        #99  <Field Intent mCurrentIntent>
	//   23   43:aastore         
	//   24   44:invokestatic    #212 <Method String String.format(String, Object[])>
	//   25   47:iconst_0        
	//   26   48:anewarray       Throwable[]
	//   27   51:invokestatic    #220 <Method void Logger.debug(String, String, Throwable[])>
		if(((Object) ((Intent)mIntents.remove(0))).equals(((Object) (mCurrentIntent))))
	//*  28   54:aload_0         
	//*  29   55:getfield        #97  <Field List mIntents>
	//*  30   58:iconst_0        
	//*  31   59:invokeinterface #256 <Method Object List.remove(int)>
	//*  32   64:checkcast       #156 <Class Intent>
	//*  33   67:aload_0         
	//*  34   68:getfield        #99  <Field Intent mCurrentIntent>
	//*  35   71:invokevirtual   #257 <Method boolean Object.equals(Object)>
	//*  36   74:ifeq            85
		{
			mCurrentIntent = null;
	//   37   77:aload_0         
	//   38   78:aconst_null     
	//   39   79:putfield        #99  <Field Intent mCurrentIntent>
			break MISSING_BLOCK_LABEL_96;
	//   40   82:goto            96
		}
		throw new IllegalStateException("Dequeue-d command is not the first.");
	//   41   85:new             #128 <Class IllegalStateException>
	//   42   88:dup             
	//   43   89:ldc2            #259 <String "Dequeue-d command is not the first.">
	//   44   92:invokespecial   #133 <Method void IllegalStateException(String)>
	//   45   95:athrow          
		if(!mCommandHandler.hasPendingCommands() && mIntents.isEmpty())
	//*  46   96:aload_0         
	//*  47   97:getfield        #67  <Field CommandHandler mCommandHandler>
	//*  48  100:invokevirtual   #262 <Method boolean CommandHandler.hasPendingCommands()>
	//*  49  103:ifne            149
	//*  50  106:aload_0         
	//*  51  107:getfield        #97  <Field List mIntents>
	//*  52  110:invokeinterface #243 <Method boolean List.isEmpty()>
	//*  53  115:ifeq            149
		{
			Logger.debug("SystemAlarmDispatcher", "No more commands & intents.", new Throwable[0]);
	//   54  118:ldc1            #200 <String "SystemAlarmDispatcher">
	//   55  120:ldc2            #264 <String "No more commands & intents.">
	//   56  123:iconst_0        
	//   57  124:anewarray       Throwable[]
	//   58  127:invokestatic    #220 <Method void Logger.debug(String, String, Throwable[])>
			if(mCompletedListener != null)
	//*  59  130:aload_0         
	//*  60  131:getfield        #266 <Field SystemAlarmDispatcher$CommandsCompletedListener mCompletedListener>
	//*  61  134:ifnull          165
				mCompletedListener.onAllCommandsCompleted();
	//   62  137:aload_0         
	//   63  138:getfield        #266 <Field SystemAlarmDispatcher$CommandsCompletedListener mCompletedListener>
	//   64  141:invokeinterface #269 <Method void SystemAlarmDispatcher$CommandsCompletedListener.onAllCommandsCompleted()>
			break MISSING_BLOCK_LABEL_165;
	//   65  146:goto            165
		}
		if(!mIntents.isEmpty())
	//*  66  149:aload_0         
	//*  67  150:getfield        #97  <Field List mIntents>
	//*  68  153:invokeinterface #243 <Method boolean List.isEmpty()>
	//*  69  158:ifne            165
			processCommand();
	//   70  161:aload_0         
	//   71  162:invokespecial   #247 <Method void processCommand()>
		list;
	//   72  165:aload_1         
		JVM INSTR monitorexit ;
	//   73  166:monitorexit     
		return;
	//   74  167:return          
		Exception exception;
		exception;
	//   75  168:astore_2        
		list;
	//   76  169:aload_1         
		JVM INSTR monitorexit ;
	//   77  170:monitorexit     
		throw exception;
	//   78  171:aload_2         
	//   79  172:athrow          
	}

	Processor getProcessor()
	{
		return mProcessor;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Processor mProcessor>
	//    2    4:areturn         
	}

	WorkManagerImpl getWorkManager()
	{
		return mWorkManager;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field WorkManagerImpl mWorkManager>
	//    2    4:areturn         
	}

	WorkTimer getWorkTimer()
	{
		return mWorkTimer;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field WorkTimer mWorkTimer>
	//    2    4:areturn         
	}

	void onDestroy()
	{
		mProcessor.removeExecutionListener(((ExecutionListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Processor mProcessor>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #276 <Method void Processor.removeExecutionListener(ExecutionListener)>
		mCompletedListener = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #266 <Field SystemAlarmDispatcher$CommandsCompletedListener mCompletedListener>
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
	//    5    7:getfield        #61  <Field Context mContext>
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokestatic    #282 <Method Intent CommandHandler.createExecutionCompletedIntent(Context, String, boolean)>
	//    9   15:iconst_0        
	//   10   16:invokespecial   #285 <Method void SystemAlarmDispatcher$AddRunnable(SystemAlarmDispatcher, Intent, int)>
	//   11   19:invokevirtual   #288 <Method void postOnMainThread(Runnable)>
	//   12   22:return          
	}

	void postOnMainThread(Runnable runnable)
	{
		mMainHandler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field Handler mMainHandler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #292 <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	void setCompletedListener(CommandsCompletedListener commandscompletedlistener)
	{
		if(mCompletedListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #266 <Field SystemAlarmDispatcher$CommandsCompletedListener mCompletedListener>
	//*   2    4:ifnull          20
		{
			Logger.error("SystemAlarmDispatcher", "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
	//    3    7:ldc1            #200 <String "SystemAlarmDispatcher">
	//    4    9:ldc2            #296 <String "A completion listener for SystemAlarmDispatcher already exists.">
	//    5   12:iconst_0        
	//    6   13:anewarray       Throwable[]
	//    7   16:invokestatic    #299 <Method void Logger.error(String, String, Throwable[])>
			return;
	//    8   19:return          
		} else
		{
			mCompletedListener = commandscompletedlistener;
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:putfield        #266 <Field SystemAlarmDispatcher$CommandsCompletedListener mCompletedListener>
			return;
	//   12   25:return          
		}
	}

	final CommandHandler mCommandHandler;
	private CommandsCompletedListener mCompletedListener;
	final Context mContext;
	Intent mCurrentIntent;
	final List mIntents;
	private final Handler mMainHandler;
	private final Processor mProcessor;
	private final WorkManagerImpl mWorkManager;
	private final WorkTimer mWorkTimer;
}
