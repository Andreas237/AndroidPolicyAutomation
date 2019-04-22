// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.*;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.WakeLocks;
import java.util.Collections;
import java.util.List;

// Referenced classes of package androidx.work.impl.background.systemalarm:
//			SystemAlarmDispatcher, WorkTimer, CommandHandler

public class DelayMetCommandHandler
	implements ExecutionListener, WorkTimer.TimeLimitExceededListener, WorkConstraintsCallback
{

	DelayMetCommandHandler(Context context, int i, String s, SystemAlarmDispatcher systemalarmdispatcher)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field Context mContext>
		mStartId = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #42  <Field int mStartId>
		mDispatcher = systemalarmdispatcher;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #44  <Field SystemAlarmDispatcher mDispatcher>
		mWorkSpecId = s;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #46  <Field String mWorkSpecId>
		mWorkConstraintsTracker = new WorkConstraintsTracker(mContext, ((WorkConstraintsCallback) (this)));
	//   14   25:aload_0         
	//   15   26:new             #48  <Class WorkConstraintsTracker>
	//   16   29:dup             
	//   17   30:aload_0         
	//   18   31:getfield        #40  <Field Context mContext>
	//   19   34:aload_0         
	//   20   35:invokespecial   #51  <Method void WorkConstraintsTracker(Context, WorkConstraintsCallback)>
	//   21   38:putfield        #53  <Field WorkConstraintsTracker mWorkConstraintsTracker>
		mHasConstraints = false;
	//   22   41:aload_0         
	//   23   42:iconst_0        
	//   24   43:putfield        #55  <Field boolean mHasConstraints>
		mHasPendingStopWorkCommand = false;
	//   25   46:aload_0         
	//   26   47:iconst_0        
	//   27   48:putfield        #57  <Field boolean mHasPendingStopWorkCommand>
	//   28   51:aload_0         
	//   29   52:new             #4   <Class Object>
	//   30   55:dup             
	//   31   56:invokespecial   #38  <Method void Object()>
	//   32   59:putfield        #59  <Field Object mLock>
	//   33   62:return          
	}

	private void cleanUp()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			mDispatcher.getWorkTimer().stopTimer(mWorkSpecId);
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field SystemAlarmDispatcher mDispatcher>
	//    7   11:invokevirtual   #68  <Method WorkTimer SystemAlarmDispatcher.getWorkTimer()>
	//    8   14:aload_0         
	//    9   15:getfield        #46  <Field String mWorkSpecId>
	//   10   18:invokevirtual   #74  <Method void WorkTimer.stopTimer(String)>
			if(mWakeLock != null && mWakeLock.isHeld())
	//*  11   21:aload_0         
	//*  12   22:getfield        #76  <Field android.os.PowerManager$WakeLock mWakeLock>
	//*  13   25:ifnull          77
	//*  14   28:aload_0         
	//*  15   29:getfield        #76  <Field android.os.PowerManager$WakeLock mWakeLock>
	//*  16   32:invokevirtual   #82  <Method boolean android.os.PowerManager$WakeLock.isHeld()>
	//*  17   35:ifeq            77
			{
				Logger.debug("DelayMetCommandHandler", String.format("Releasing wakelock %s for WorkSpec %s", new Object[] {
					mWakeLock, mWorkSpecId
				}), new Throwable[0]);
	//   18   38:ldc1            #84  <String "DelayMetCommandHandler">
	//   19   40:ldc1            #86  <String "Releasing wakelock %s for WorkSpec %s">
	//   20   42:iconst_2        
	//   21   43:anewarray       Object[]
	//   22   46:dup             
	//   23   47:iconst_0        
	//   24   48:aload_0         
	//   25   49:getfield        #76  <Field android.os.PowerManager$WakeLock mWakeLock>
	//   26   52:aastore         
	//   27   53:dup             
	//   28   54:iconst_1        
	//   29   55:aload_0         
	//   30   56:getfield        #46  <Field String mWorkSpecId>
	//   31   59:aastore         
	//   32   60:invokestatic    #92  <Method String String.format(String, Object[])>
	//   33   63:iconst_0        
	//   34   64:anewarray       Throwable[]
	//   35   67:invokestatic    #100 <Method void Logger.debug(String, String, Throwable[])>
				mWakeLock.release();
	//   36   70:aload_0         
	//   37   71:getfield        #76  <Field android.os.PowerManager$WakeLock mWakeLock>
	//   38   74:invokevirtual   #103 <Method void android.os.PowerManager$WakeLock.release()>
			}
		}
	//   39   77:aload_1         
	//   40   78:monitorexit     
		return;
	//   41   79:return          
		exception;
	//   42   80:astore_2        
		obj;
	//   43   81:aload_1         
		JVM INSTR monitorexit ;
	//   44   82:monitorexit     
		throw exception;
	//   45   83:aload_2         
	//   46   84:athrow          
	}

	private void stopWork()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Object mLock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(mHasPendingStopWorkCommand)
			break MISSING_BLOCK_LABEL_187;
	//    5    7:aload_0         
	//    6    8:getfield        #57  <Field boolean mHasPendingStopWorkCommand>
	//    7   11:ifne            187
		Logger.debug("DelayMetCommandHandler", String.format("Stopping work for workspec %s", new Object[] {
			mWorkSpecId
		}), new Throwable[0]);
	//    8   14:ldc1            #84  <String "DelayMetCommandHandler">
	//    9   16:ldc1            #106 <String "Stopping work for workspec %s">
	//   10   18:iconst_1        
	//   11   19:anewarray       Object[]
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:aload_0         
	//   15   25:getfield        #46  <Field String mWorkSpecId>
	//   16   28:aastore         
	//   17   29:invokestatic    #92  <Method String String.format(String, Object[])>
	//   18   32:iconst_0        
	//   19   33:anewarray       Throwable[]
	//   20   36:invokestatic    #100 <Method void Logger.debug(String, String, Throwable[])>
		android.content.Intent intent = CommandHandler.createStopWorkIntent(mContext, mWorkSpecId);
	//   21   39:aload_0         
	//   22   40:getfield        #40  <Field Context mContext>
	//   23   43:aload_0         
	//   24   44:getfield        #46  <Field String mWorkSpecId>
	//   25   47:invokestatic    #112 <Method android.content.Intent CommandHandler.createStopWorkIntent(Context, String)>
	//   26   50:astore_2        
		mDispatcher.postOnMainThread(((Runnable) (new SystemAlarmDispatcher.AddRunnable(mDispatcher, intent, mStartId))));
	//   27   51:aload_0         
	//   28   52:getfield        #44  <Field SystemAlarmDispatcher mDispatcher>
	//   29   55:new             #114 <Class SystemAlarmDispatcher$AddRunnable>
	//   30   58:dup             
	//   31   59:aload_0         
	//   32   60:getfield        #44  <Field SystemAlarmDispatcher mDispatcher>
	//   33   63:aload_2         
	//   34   64:aload_0         
	//   35   65:getfield        #42  <Field int mStartId>
	//   36   68:invokespecial   #117 <Method void SystemAlarmDispatcher$AddRunnable(SystemAlarmDispatcher, android.content.Intent, int)>
	//   37   71:invokevirtual   #121 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
		if(mDispatcher.getProcessor().isEnqueued(mWorkSpecId))
	//*  38   74:aload_0         
	//*  39   75:getfield        #44  <Field SystemAlarmDispatcher mDispatcher>
	//*  40   78:invokevirtual   #125 <Method Processor SystemAlarmDispatcher.getProcessor()>
	//*  41   81:aload_0         
	//*  42   82:getfield        #46  <Field String mWorkSpecId>
	//*  43   85:invokevirtual   #131 <Method boolean Processor.isEnqueued(String)>
	//*  44   88:ifeq            154
		{
			Logger.debug("DelayMetCommandHandler", String.format("WorkSpec %s needs to be rescheduled", new Object[] {
				mWorkSpecId
			}), new Throwable[0]);
	//   45   91:ldc1            #84  <String "DelayMetCommandHandler">
	//   46   93:ldc1            #133 <String "WorkSpec %s needs to be rescheduled">
	//   47   95:iconst_1        
	//   48   96:anewarray       Object[]
	//   49   99:dup             
	//   50  100:iconst_0        
	//   51  101:aload_0         
	//   52  102:getfield        #46  <Field String mWorkSpecId>
	//   53  105:aastore         
	//   54  106:invokestatic    #92  <Method String String.format(String, Object[])>
	//   55  109:iconst_0        
	//   56  110:anewarray       Throwable[]
	//   57  113:invokestatic    #100 <Method void Logger.debug(String, String, Throwable[])>
			android.content.Intent intent1 = CommandHandler.createScheduleWorkIntent(mContext, mWorkSpecId);
	//   58  116:aload_0         
	//   59  117:getfield        #40  <Field Context mContext>
	//   60  120:aload_0         
	//   61  121:getfield        #46  <Field String mWorkSpecId>
	//   62  124:invokestatic    #136 <Method android.content.Intent CommandHandler.createScheduleWorkIntent(Context, String)>
	//   63  127:astore_2        
			mDispatcher.postOnMainThread(((Runnable) (new SystemAlarmDispatcher.AddRunnable(mDispatcher, intent1, mStartId))));
	//   64  128:aload_0         
	//   65  129:getfield        #44  <Field SystemAlarmDispatcher mDispatcher>
	//   66  132:new             #114 <Class SystemAlarmDispatcher$AddRunnable>
	//   67  135:dup             
	//   68  136:aload_0         
	//   69  137:getfield        #44  <Field SystemAlarmDispatcher mDispatcher>
	//   70  140:aload_2         
	//   71  141:aload_0         
	//   72  142:getfield        #42  <Field int mStartId>
	//   73  145:invokespecial   #117 <Method void SystemAlarmDispatcher$AddRunnable(SystemAlarmDispatcher, android.content.Intent, int)>
	//   74  148:invokevirtual   #121 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
			break MISSING_BLOCK_LABEL_179;
	//   75  151:goto            179
		}
		Logger.debug("DelayMetCommandHandler", String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[] {
			mWorkSpecId
		}), new Throwable[0]);
	//   76  154:ldc1            #84  <String "DelayMetCommandHandler">
	//   77  156:ldc1            #138 <String "Processor does not have WorkSpec %s. No need to reschedule ">
	//   78  158:iconst_1        
	//   79  159:anewarray       Object[]
	//   80  162:dup             
	//   81  163:iconst_0        
	//   82  164:aload_0         
	//   83  165:getfield        #46  <Field String mWorkSpecId>
	//   84  168:aastore         
	//   85  169:invokestatic    #92  <Method String String.format(String, Object[])>
	//   86  172:iconst_0        
	//   87  173:anewarray       Throwable[]
	//   88  176:invokestatic    #100 <Method void Logger.debug(String, String, Throwable[])>
		mHasPendingStopWorkCommand = true;
	//   89  179:aload_0         
	//   90  180:iconst_1        
	//   91  181:putfield        #57  <Field boolean mHasPendingStopWorkCommand>
		break MISSING_BLOCK_LABEL_212;
	//   92  184:goto            212
		Logger.debug("DelayMetCommandHandler", String.format("Already stopped work for %s", new Object[] {
			mWorkSpecId
		}), new Throwable[0]);
	//   93  187:ldc1            #84  <String "DelayMetCommandHandler">
	//   94  189:ldc1            #140 <String "Already stopped work for %s">
	//   95  191:iconst_1        
	//   96  192:anewarray       Object[]
	//   97  195:dup             
	//   98  196:iconst_0        
	//   99  197:aload_0         
	//  100  198:getfield        #46  <Field String mWorkSpecId>
	//  101  201:aastore         
	//  102  202:invokestatic    #92  <Method String String.format(String, Object[])>
	//  103  205:iconst_0        
	//  104  206:anewarray       Throwable[]
	//  105  209:invokestatic    #100 <Method void Logger.debug(String, String, Throwable[])>
		obj;
	//  106  212:aload_1         
		JVM INSTR monitorexit ;
	//  107  213:monitorexit     
		return;
	//  108  214:return          
		Exception exception;
		exception;
	//  109  215:astore_2        
		obj;
	//  110  216:aload_1         
		JVM INSTR monitorexit ;
	//  111  217:monitorexit     
		throw exception;
	//  112  218:aload_2         
	//  113  219:athrow          
	}

	void handleProcessWork()
	{
		mWakeLock = WakeLocks.newWakeLock(mContext, String.format("%s (%s)", new Object[] {
			mWorkSpecId, Integer.valueOf(mStartId)
		}));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field Context mContext>
	//    3    5:ldc1            #144 <String "%s (%s)">
	//    4    7:iconst_2        
	//    5    8:anewarray       Object[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:aload_0         
	//    9   14:getfield        #46  <Field String mWorkSpecId>
	//   10   17:aastore         
	//   11   18:dup             
	//   12   19:iconst_1        
	//   13   20:aload_0         
	//   14   21:getfield        #42  <Field int mStartId>
	//   15   24:invokestatic    #150 <Method Integer Integer.valueOf(int)>
	//   16   27:aastore         
	//   17   28:invokestatic    #92  <Method String String.format(String, Object[])>
	//   18   31:invokestatic    #156 <Method android.os.PowerManager$WakeLock WakeLocks.newWakeLock(Context, String)>
	//   19   34:putfield        #76  <Field android.os.PowerManager$WakeLock mWakeLock>
		Logger.debug("DelayMetCommandHandler", String.format("Acquiring wakelock %s for WorkSpec %s", new Object[] {
			mWakeLock, mWorkSpecId
		}), new Throwable[0]);
	//   20   37:ldc1            #84  <String "DelayMetCommandHandler">
	//   21   39:ldc1            #158 <String "Acquiring wakelock %s for WorkSpec %s">
	//   22   41:iconst_2        
	//   23   42:anewarray       Object[]
	//   24   45:dup             
	//   25   46:iconst_0        
	//   26   47:aload_0         
	//   27   48:getfield        #76  <Field android.os.PowerManager$WakeLock mWakeLock>
	//   28   51:aastore         
	//   29   52:dup             
	//   30   53:iconst_1        
	//   31   54:aload_0         
	//   32   55:getfield        #46  <Field String mWorkSpecId>
	//   33   58:aastore         
	//   34   59:invokestatic    #92  <Method String String.format(String, Object[])>
	//   35   62:iconst_0        
	//   36   63:anewarray       Throwable[]
	//   37   66:invokestatic    #100 <Method void Logger.debug(String, String, Throwable[])>
		mWakeLock.acquire();
	//   38   69:aload_0         
	//   39   70:getfield        #76  <Field android.os.PowerManager$WakeLock mWakeLock>
	//   40   73:invokevirtual   #161 <Method void android.os.PowerManager$WakeLock.acquire()>
		WorkSpec workspec = mDispatcher.getWorkManager().getWorkDatabase().workSpecDao().getWorkSpec(mWorkSpecId);
	//   41   76:aload_0         
	//   42   77:getfield        #44  <Field SystemAlarmDispatcher mDispatcher>
	//   43   80:invokevirtual   #165 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//   44   83:invokevirtual   #171 <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//   45   86:invokevirtual   #177 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//   46   89:aload_0         
	//   47   90:getfield        #46  <Field String mWorkSpecId>
	//   48   93:invokeinterface #183 <Method WorkSpec WorkSpecDao.getWorkSpec(String)>
	//   49   98:astore_1        
		if(workspec == null)
	//*  50   99:aload_1         
	//*  51  100:ifnonnull       108
		{
			stopWork();
	//   52  103:aload_0         
	//   53  104:invokespecial   #185 <Method void stopWork()>
			return;
	//   54  107:return          
		}
		mHasConstraints = workspec.hasConstraints();
	//   55  108:aload_0         
	//   56  109:aload_1         
	//   57  110:invokevirtual   #190 <Method boolean WorkSpec.hasConstraints()>
	//   58  113:putfield        #55  <Field boolean mHasConstraints>
		if(!mHasConstraints)
	//*  59  116:aload_0         
	//*  60  117:getfield        #55  <Field boolean mHasConstraints>
	//*  61  120:ifne            160
		{
			Logger.debug("DelayMetCommandHandler", String.format("No constraints for %s", new Object[] {
				mWorkSpecId
			}), new Throwable[0]);
	//   62  123:ldc1            #84  <String "DelayMetCommandHandler">
	//   63  125:ldc1            #192 <String "No constraints for %s">
	//   64  127:iconst_1        
	//   65  128:anewarray       Object[]
	//   66  131:dup             
	//   67  132:iconst_0        
	//   68  133:aload_0         
	//   69  134:getfield        #46  <Field String mWorkSpecId>
	//   70  137:aastore         
	//   71  138:invokestatic    #92  <Method String String.format(String, Object[])>
	//   72  141:iconst_0        
	//   73  142:anewarray       Throwable[]
	//   74  145:invokestatic    #100 <Method void Logger.debug(String, String, Throwable[])>
			onAllConstraintsMet(Collections.singletonList(((Object) (mWorkSpecId))));
	//   75  148:aload_0         
	//   76  149:aload_0         
	//   77  150:getfield        #46  <Field String mWorkSpecId>
	//   78  153:invokestatic    #198 <Method List Collections.singletonList(Object)>
	//   79  156:invokevirtual   #202 <Method void onAllConstraintsMet(List)>
			return;
	//   80  159:return          
		} else
		{
			mWorkConstraintsTracker.replace(Collections.singletonList(((Object) (workspec))));
	//   81  160:aload_0         
	//   82  161:getfield        #53  <Field WorkConstraintsTracker mWorkConstraintsTracker>
	//   83  164:aload_1         
	//   84  165:invokestatic    #198 <Method List Collections.singletonList(Object)>
	//   85  168:invokevirtual   #205 <Method void WorkConstraintsTracker.replace(List)>
			return;
	//   86  171:return          
		}
	}

	public void onAllConstraintsMet(List list)
	{
		Logger.debug("DelayMetCommandHandler", String.format("onAllConstraintsMet for %s", new Object[] {
			mWorkSpecId
		}), new Throwable[0]);
	//    0    0:ldc1            #84  <String "DelayMetCommandHandler">
	//    1    2:ldc1            #208 <String "onAllConstraintsMet for %s">
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:getfield        #46  <Field String mWorkSpecId>
	//    8   14:aastore         
	//    9   15:invokestatic    #92  <Method String String.format(String, Object[])>
	//   10   18:iconst_0        
	//   11   19:anewarray       Throwable[]
	//   12   22:invokestatic    #100 <Method void Logger.debug(String, String, Throwable[])>
		if(mDispatcher.getProcessor().startWork(mWorkSpecId))
	//*  13   25:aload_0         
	//*  14   26:getfield        #44  <Field SystemAlarmDispatcher mDispatcher>
	//*  15   29:invokevirtual   #125 <Method Processor SystemAlarmDispatcher.getProcessor()>
	//*  16   32:aload_0         
	//*  17   33:getfield        #46  <Field String mWorkSpecId>
	//*  18   36:invokevirtual   #211 <Method boolean Processor.startWork(String)>
	//*  19   39:ifeq            61
		{
			mDispatcher.getWorkTimer().startTimer(mWorkSpecId, 0x927c0L, ((WorkTimer.TimeLimitExceededListener) (this)));
	//   20   42:aload_0         
	//   21   43:getfield        #44  <Field SystemAlarmDispatcher mDispatcher>
	//   22   46:invokevirtual   #68  <Method WorkTimer SystemAlarmDispatcher.getWorkTimer()>
	//   23   49:aload_0         
	//   24   50:getfield        #46  <Field String mWorkSpecId>
	//   25   53:ldc2w           #212 <Long 0x927c0L>
	//   26   56:aload_0         
	//   27   57:invokevirtual   #217 <Method void WorkTimer.startTimer(String, long, WorkTimer$TimeLimitExceededListener)>
			return;
	//   28   60:return          
		} else
		{
			cleanUp();
	//   29   61:aload_0         
	//   30   62:invokespecial   #219 <Method void cleanUp()>
			return;
	//   31   65:return          
		}
	}

	public void onAllConstraintsNotMet(List list)
	{
		stopWork();
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method void stopWork()>
	//    2    4:return          
	}

	public void onExecuted(String s, boolean flag)
	{
		Logger.debug("DelayMetCommandHandler", String.format("onExecuted %s, %s", new Object[] {
			s, Boolean.valueOf(flag)
		}), new Throwable[0]);
	//    0    0:ldc1            #84  <String "DelayMetCommandHandler">
	//    1    2:ldc1            #226 <String "onExecuted %s, %s">
	//    2    4:iconst_2        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:iload_2         
	//   11   15:invokestatic    #231 <Method Boolean Boolean.valueOf(boolean)>
	//   12   18:aastore         
	//   13   19:invokestatic    #92  <Method String String.format(String, Object[])>
	//   14   22:iconst_0        
	//   15   23:anewarray       Throwable[]
	//   16   26:invokestatic    #100 <Method void Logger.debug(String, String, Throwable[])>
		cleanUp();
	//   17   29:aload_0         
	//   18   30:invokespecial   #219 <Method void cleanUp()>
		if(mHasConstraints)
	//*  19   33:aload_0         
	//*  20   34:getfield        #55  <Field boolean mHasConstraints>
	//*  21   37:ifeq            70
		{
			s = ((String) (CommandHandler.createConstraintsChangedIntent(mContext)));
	//   22   40:aload_0         
	//   23   41:getfield        #40  <Field Context mContext>
	//   24   44:invokestatic    #235 <Method android.content.Intent CommandHandler.createConstraintsChangedIntent(Context)>
	//   25   47:astore_1        
			SystemAlarmDispatcher systemalarmdispatcher = mDispatcher;
	//   26   48:aload_0         
	//   27   49:getfield        #44  <Field SystemAlarmDispatcher mDispatcher>
	//   28   52:astore_3        
			systemalarmdispatcher.postOnMainThread(((Runnable) (new SystemAlarmDispatcher.AddRunnable(systemalarmdispatcher, ((android.content.Intent) (s)), mStartId))));
	//   29   53:aload_3         
	//   30   54:new             #114 <Class SystemAlarmDispatcher$AddRunnable>
	//   31   57:dup             
	//   32   58:aload_3         
	//   33   59:aload_1         
	//   34   60:aload_0         
	//   35   61:getfield        #42  <Field int mStartId>
	//   36   64:invokespecial   #117 <Method void SystemAlarmDispatcher$AddRunnable(SystemAlarmDispatcher, android.content.Intent, int)>
	//   37   67:invokevirtual   #121 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
		}
	//   38   70:return          
	}

	public void onTimeLimitExceeded(String s)
	{
		Logger.debug("DelayMetCommandHandler", String.format("Exceeded time limits on execution for %s", new Object[] {
			s
		}), new Throwable[0]);
	//    0    0:ldc1            #84  <String "DelayMetCommandHandler">
	//    1    2:ldc1            #238 <String "Exceeded time limits on execution for %s">
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:invokestatic    #92  <Method String String.format(String, Object[])>
	//    9   15:iconst_0        
	//   10   16:anewarray       Throwable[]
	//   11   19:invokestatic    #100 <Method void Logger.debug(String, String, Throwable[])>
		stopWork();
	//   12   22:aload_0         
	//   13   23:invokespecial   #185 <Method void stopWork()>
	//   14   26:return          
	}

	private final Context mContext;
	private final SystemAlarmDispatcher mDispatcher;
	private boolean mHasConstraints;
	private boolean mHasPendingStopWorkCommand;
	private final Object mLock = new Object();
	private final int mStartId;
	private android.os.PowerManager.WakeLock mWakeLock;
	private final WorkConstraintsTracker mWorkConstraintsTracker;
	private final String mWorkSpecId;
}
