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
	implements WorkConstraintsCallback, ExecutionListener, WorkTimer.TimeLimitExceededListener
{

	DelayMetCommandHandler(Context context, int i, String s, SystemAlarmDispatcher systemalarmdispatcher)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #53  <Field Context mContext>
		mStartId = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #55  <Field int mStartId>
		mDispatcher = systemalarmdispatcher;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #57  <Field SystemAlarmDispatcher mDispatcher>
		mWorkSpecId = s;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #59  <Field String mWorkSpecId>
		mWorkConstraintsTracker = new WorkConstraintsTracker(mContext, ((WorkConstraintsCallback) (this)));
	//   14   25:aload_0         
	//   15   26:new             #61  <Class WorkConstraintsTracker>
	//   16   29:dup             
	//   17   30:aload_0         
	//   18   31:getfield        #53  <Field Context mContext>
	//   19   34:aload_0         
	//   20   35:invokespecial   #64  <Method void WorkConstraintsTracker(Context, WorkConstraintsCallback)>
	//   21   38:putfield        #66  <Field WorkConstraintsTracker mWorkConstraintsTracker>
		mHasConstraints = false;
	//   22   41:aload_0         
	//   23   42:iconst_0        
	//   24   43:putfield        #68  <Field boolean mHasConstraints>
		mHasPendingStopWorkCommand = false;
	//   25   46:aload_0         
	//   26   47:iconst_0        
	//   27   48:putfield        #70  <Field boolean mHasPendingStopWorkCommand>
	//   28   51:aload_0         
	//   29   52:new             #4   <Class Object>
	//   30   55:dup             
	//   31   56:invokespecial   #51  <Method void Object()>
	//   32   59:putfield        #72  <Field Object mLock>
	//   33   62:return          
	}

	private void cleanUp()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			mDispatcher.getWorkTimer().stopTimer(mWorkSpecId);
	//    5    7:aload_0         
	//    6    8:getfield        #57  <Field SystemAlarmDispatcher mDispatcher>
	//    7   11:invokevirtual   #80  <Method WorkTimer SystemAlarmDispatcher.getWorkTimer()>
	//    8   14:aload_0         
	//    9   15:getfield        #59  <Field String mWorkSpecId>
	//   10   18:invokevirtual   #86  <Method void WorkTimer.stopTimer(String)>
			if(mWakeLock != null && mWakeLock.isHeld())
	//*  11   21:aload_0         
	//*  12   22:getfield        #88  <Field android.os.PowerManager$WakeLock mWakeLock>
	//*  13   25:ifnull          81
	//*  14   28:aload_0         
	//*  15   29:getfield        #88  <Field android.os.PowerManager$WakeLock mWakeLock>
	//*  16   32:invokevirtual   #94  <Method boolean android.os.PowerManager$WakeLock.isHeld()>
	//*  17   35:ifeq            81
			{
				Logger.get().debug(TAG, String.format("Releasing wakelock %s for WorkSpec %s", new Object[] {
					mWakeLock, mWorkSpecId
				}), new Throwable[0]);
	//   18   38:invokestatic    #98  <Method Logger Logger.get()>
	//   19   41:getstatic       #45  <Field String TAG>
	//   20   44:ldc1            #100 <String "Releasing wakelock %s for WorkSpec %s">
	//   21   46:iconst_2        
	//   22   47:anewarray       Object[]
	//   23   50:dup             
	//   24   51:iconst_0        
	//   25   52:aload_0         
	//   26   53:getfield        #88  <Field android.os.PowerManager$WakeLock mWakeLock>
	//   27   56:aastore         
	//   28   57:dup             
	//   29   58:iconst_1        
	//   30   59:aload_0         
	//   31   60:getfield        #59  <Field String mWorkSpecId>
	//   32   63:aastore         
	//   33   64:invokestatic    #106 <Method String String.format(String, Object[])>
	//   34   67:iconst_0        
	//   35   68:anewarray       Throwable[]
	//   36   71:invokevirtual   #112 <Method void Logger.debug(String, String, Throwable[])>
				mWakeLock.release();
	//   37   74:aload_0         
	//   38   75:getfield        #88  <Field android.os.PowerManager$WakeLock mWakeLock>
	//   39   78:invokevirtual   #115 <Method void android.os.PowerManager$WakeLock.release()>
			}
		}
	//   40   81:aload_1         
	//   41   82:monitorexit     
		return;
	//   42   83:return          
		exception;
	//   43   84:astore_2        
		obj;
	//   44   85:aload_1         
		JVM INSTR monitorexit ;
	//   45   86:monitorexit     
		throw exception;
	//   46   87:aload_2         
	//   47   88:athrow          
	}

	private void stopWork()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Object mLock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(mHasPendingStopWorkCommand)
			break MISSING_BLOCK_LABEL_199;
	//    5    7:aload_0         
	//    6    8:getfield        #70  <Field boolean mHasPendingStopWorkCommand>
	//    7   11:ifne            199
		Logger.get().debug(TAG, String.format("Stopping work for workspec %s", new Object[] {
			mWorkSpecId
		}), new Throwable[0]);
	//    8   14:invokestatic    #98  <Method Logger Logger.get()>
	//    9   17:getstatic       #45  <Field String TAG>
	//   10   20:ldc1            #118 <String "Stopping work for workspec %s">
	//   11   22:iconst_1        
	//   12   23:anewarray       Object[]
	//   13   26:dup             
	//   14   27:iconst_0        
	//   15   28:aload_0         
	//   16   29:getfield        #59  <Field String mWorkSpecId>
	//   17   32:aastore         
	//   18   33:invokestatic    #106 <Method String String.format(String, Object[])>
	//   19   36:iconst_0        
	//   20   37:anewarray       Throwable[]
	//   21   40:invokevirtual   #112 <Method void Logger.debug(String, String, Throwable[])>
		android.content.Intent intent = CommandHandler.createStopWorkIntent(mContext, mWorkSpecId);
	//   22   43:aload_0         
	//   23   44:getfield        #53  <Field Context mContext>
	//   24   47:aload_0         
	//   25   48:getfield        #59  <Field String mWorkSpecId>
	//   26   51:invokestatic    #124 <Method android.content.Intent CommandHandler.createStopWorkIntent(Context, String)>
	//   27   54:astore_2        
		mDispatcher.postOnMainThread(((Runnable) (new SystemAlarmDispatcher.AddRunnable(mDispatcher, intent, mStartId))));
	//   28   55:aload_0         
	//   29   56:getfield        #57  <Field SystemAlarmDispatcher mDispatcher>
	//   30   59:new             #126 <Class SystemAlarmDispatcher$AddRunnable>
	//   31   62:dup             
	//   32   63:aload_0         
	//   33   64:getfield        #57  <Field SystemAlarmDispatcher mDispatcher>
	//   34   67:aload_2         
	//   35   68:aload_0         
	//   36   69:getfield        #55  <Field int mStartId>
	//   37   72:invokespecial   #129 <Method void SystemAlarmDispatcher$AddRunnable(SystemAlarmDispatcher, android.content.Intent, int)>
	//   38   75:invokevirtual   #133 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
		if(mDispatcher.getProcessor().isEnqueued(mWorkSpecId))
	//*  39   78:aload_0         
	//*  40   79:getfield        #57  <Field SystemAlarmDispatcher mDispatcher>
	//*  41   82:invokevirtual   #137 <Method Processor SystemAlarmDispatcher.getProcessor()>
	//*  42   85:aload_0         
	//*  43   86:getfield        #59  <Field String mWorkSpecId>
	//*  44   89:invokevirtual   #143 <Method boolean Processor.isEnqueued(String)>
	//*  45   92:ifeq            162
		{
			Logger.get().debug(TAG, String.format("WorkSpec %s needs to be rescheduled", new Object[] {
				mWorkSpecId
			}), new Throwable[0]);
	//   46   95:invokestatic    #98  <Method Logger Logger.get()>
	//   47   98:getstatic       #45  <Field String TAG>
	//   48  101:ldc1            #145 <String "WorkSpec %s needs to be rescheduled">
	//   49  103:iconst_1        
	//   50  104:anewarray       Object[]
	//   51  107:dup             
	//   52  108:iconst_0        
	//   53  109:aload_0         
	//   54  110:getfield        #59  <Field String mWorkSpecId>
	//   55  113:aastore         
	//   56  114:invokestatic    #106 <Method String String.format(String, Object[])>
	//   57  117:iconst_0        
	//   58  118:anewarray       Throwable[]
	//   59  121:invokevirtual   #112 <Method void Logger.debug(String, String, Throwable[])>
			android.content.Intent intent1 = CommandHandler.createScheduleWorkIntent(mContext, mWorkSpecId);
	//   60  124:aload_0         
	//   61  125:getfield        #53  <Field Context mContext>
	//   62  128:aload_0         
	//   63  129:getfield        #59  <Field String mWorkSpecId>
	//   64  132:invokestatic    #148 <Method android.content.Intent CommandHandler.createScheduleWorkIntent(Context, String)>
	//   65  135:astore_2        
			mDispatcher.postOnMainThread(((Runnable) (new SystemAlarmDispatcher.AddRunnable(mDispatcher, intent1, mStartId))));
	//   66  136:aload_0         
	//   67  137:getfield        #57  <Field SystemAlarmDispatcher mDispatcher>
	//   68  140:new             #126 <Class SystemAlarmDispatcher$AddRunnable>
	//   69  143:dup             
	//   70  144:aload_0         
	//   71  145:getfield        #57  <Field SystemAlarmDispatcher mDispatcher>
	//   72  148:aload_2         
	//   73  149:aload_0         
	//   74  150:getfield        #55  <Field int mStartId>
	//   75  153:invokespecial   #129 <Method void SystemAlarmDispatcher$AddRunnable(SystemAlarmDispatcher, android.content.Intent, int)>
	//   76  156:invokevirtual   #133 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
			break MISSING_BLOCK_LABEL_191;
	//   77  159:goto            191
		}
		Logger.get().debug(TAG, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[] {
			mWorkSpecId
		}), new Throwable[0]);
	//   78  162:invokestatic    #98  <Method Logger Logger.get()>
	//   79  165:getstatic       #45  <Field String TAG>
	//   80  168:ldc1            #150 <String "Processor does not have WorkSpec %s. No need to reschedule ">
	//   81  170:iconst_1        
	//   82  171:anewarray       Object[]
	//   83  174:dup             
	//   84  175:iconst_0        
	//   85  176:aload_0         
	//   86  177:getfield        #59  <Field String mWorkSpecId>
	//   87  180:aastore         
	//   88  181:invokestatic    #106 <Method String String.format(String, Object[])>
	//   89  184:iconst_0        
	//   90  185:anewarray       Throwable[]
	//   91  188:invokevirtual   #112 <Method void Logger.debug(String, String, Throwable[])>
		mHasPendingStopWorkCommand = true;
	//   92  191:aload_0         
	//   93  192:iconst_1        
	//   94  193:putfield        #70  <Field boolean mHasPendingStopWorkCommand>
		break MISSING_BLOCK_LABEL_228;
	//   95  196:goto            228
		Logger.get().debug(TAG, String.format("Already stopped work for %s", new Object[] {
			mWorkSpecId
		}), new Throwable[0]);
	//   96  199:invokestatic    #98  <Method Logger Logger.get()>
	//   97  202:getstatic       #45  <Field String TAG>
	//   98  205:ldc1            #152 <String "Already stopped work for %s">
	//   99  207:iconst_1        
	//  100  208:anewarray       Object[]
	//  101  211:dup             
	//  102  212:iconst_0        
	//  103  213:aload_0         
	//  104  214:getfield        #59  <Field String mWorkSpecId>
	//  105  217:aastore         
	//  106  218:invokestatic    #106 <Method String String.format(String, Object[])>
	//  107  221:iconst_0        
	//  108  222:anewarray       Throwable[]
	//  109  225:invokevirtual   #112 <Method void Logger.debug(String, String, Throwable[])>
		obj;
	//  110  228:aload_1         
		JVM INSTR monitorexit ;
	//  111  229:monitorexit     
		return;
	//  112  230:return          
		Exception exception;
		exception;
	//  113  231:astore_2        
		obj;
	//  114  232:aload_1         
		JVM INSTR monitorexit ;
	//  115  233:monitorexit     
		throw exception;
	//  116  234:aload_2         
	//  117  235:athrow          
	}

	void handleProcessWork()
	{
		mWakeLock = WakeLocks.newWakeLock(mContext, String.format("%s (%s)", new Object[] {
			mWorkSpecId, Integer.valueOf(mStartId)
		}));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #53  <Field Context mContext>
	//    3    5:ldc1            #156 <String "%s (%s)">
	//    4    7:iconst_2        
	//    5    8:anewarray       Object[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:aload_0         
	//    9   14:getfield        #59  <Field String mWorkSpecId>
	//   10   17:aastore         
	//   11   18:dup             
	//   12   19:iconst_1        
	//   13   20:aload_0         
	//   14   21:getfield        #55  <Field int mStartId>
	//   15   24:invokestatic    #162 <Method Integer Integer.valueOf(int)>
	//   16   27:aastore         
	//   17   28:invokestatic    #106 <Method String String.format(String, Object[])>
	//   18   31:invokestatic    #168 <Method android.os.PowerManager$WakeLock WakeLocks.newWakeLock(Context, String)>
	//   19   34:putfield        #88  <Field android.os.PowerManager$WakeLock mWakeLock>
		Logger.get().debug(TAG, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[] {
			mWakeLock, mWorkSpecId
		}), new Throwable[0]);
	//   20   37:invokestatic    #98  <Method Logger Logger.get()>
	//   21   40:getstatic       #45  <Field String TAG>
	//   22   43:ldc1            #170 <String "Acquiring wakelock %s for WorkSpec %s">
	//   23   45:iconst_2        
	//   24   46:anewarray       Object[]
	//   25   49:dup             
	//   26   50:iconst_0        
	//   27   51:aload_0         
	//   28   52:getfield        #88  <Field android.os.PowerManager$WakeLock mWakeLock>
	//   29   55:aastore         
	//   30   56:dup             
	//   31   57:iconst_1        
	//   32   58:aload_0         
	//   33   59:getfield        #59  <Field String mWorkSpecId>
	//   34   62:aastore         
	//   35   63:invokestatic    #106 <Method String String.format(String, Object[])>
	//   36   66:iconst_0        
	//   37   67:anewarray       Throwable[]
	//   38   70:invokevirtual   #112 <Method void Logger.debug(String, String, Throwable[])>
		mWakeLock.acquire();
	//   39   73:aload_0         
	//   40   74:getfield        #88  <Field android.os.PowerManager$WakeLock mWakeLock>
	//   41   77:invokevirtual   #173 <Method void android.os.PowerManager$WakeLock.acquire()>
		WorkSpec workspec = mDispatcher.getWorkManager().getWorkDatabase().workSpecDao().getWorkSpec(mWorkSpecId);
	//   42   80:aload_0         
	//   43   81:getfield        #57  <Field SystemAlarmDispatcher mDispatcher>
	//   44   84:invokevirtual   #177 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//   45   87:invokevirtual   #183 <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//   46   90:invokevirtual   #189 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//   47   93:aload_0         
	//   48   94:getfield        #59  <Field String mWorkSpecId>
	//   49   97:invokeinterface #195 <Method WorkSpec WorkSpecDao.getWorkSpec(String)>
	//   50  102:astore_1        
		if(workspec == null)
	//*  51  103:aload_1         
	//*  52  104:ifnonnull       112
		{
			stopWork();
	//   53  107:aload_0         
	//   54  108:invokespecial   #197 <Method void stopWork()>
			return;
	//   55  111:return          
		}
		mHasConstraints = workspec.hasConstraints();
	//   56  112:aload_0         
	//   57  113:aload_1         
	//   58  114:invokevirtual   #202 <Method boolean WorkSpec.hasConstraints()>
	//   59  117:putfield        #68  <Field boolean mHasConstraints>
		if(!mHasConstraints)
	//*  60  120:aload_0         
	//*  61  121:getfield        #68  <Field boolean mHasConstraints>
	//*  62  124:ifne            168
		{
			Logger.get().debug(TAG, String.format("No constraints for %s", new Object[] {
				mWorkSpecId
			}), new Throwable[0]);
	//   63  127:invokestatic    #98  <Method Logger Logger.get()>
	//   64  130:getstatic       #45  <Field String TAG>
	//   65  133:ldc1            #204 <String "No constraints for %s">
	//   66  135:iconst_1        
	//   67  136:anewarray       Object[]
	//   68  139:dup             
	//   69  140:iconst_0        
	//   70  141:aload_0         
	//   71  142:getfield        #59  <Field String mWorkSpecId>
	//   72  145:aastore         
	//   73  146:invokestatic    #106 <Method String String.format(String, Object[])>
	//   74  149:iconst_0        
	//   75  150:anewarray       Throwable[]
	//   76  153:invokevirtual   #112 <Method void Logger.debug(String, String, Throwable[])>
			onAllConstraintsMet(Collections.singletonList(((Object) (mWorkSpecId))));
	//   77  156:aload_0         
	//   78  157:aload_0         
	//   79  158:getfield        #59  <Field String mWorkSpecId>
	//   80  161:invokestatic    #210 <Method List Collections.singletonList(Object)>
	//   81  164:invokevirtual   #214 <Method void onAllConstraintsMet(List)>
			return;
	//   82  167:return          
		} else
		{
			mWorkConstraintsTracker.replace(Collections.singletonList(((Object) (workspec))));
	//   83  168:aload_0         
	//   84  169:getfield        #66  <Field WorkConstraintsTracker mWorkConstraintsTracker>
	//   85  172:aload_1         
	//   86  173:invokestatic    #210 <Method List Collections.singletonList(Object)>
	//   87  176:invokevirtual   #217 <Method void WorkConstraintsTracker.replace(List)>
			return;
	//   88  179:return          
		}
	}

	public void onAllConstraintsMet(List list)
	{
		if(!list.contains(((Object) (mWorkSpecId))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #59  <Field String mWorkSpecId>
	//*   3    5:invokeinterface #224 <Method boolean List.contains(Object)>
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		Logger.get().debug(TAG, String.format("onAllConstraintsMet for %s", new Object[] {
			mWorkSpecId
		}), new Throwable[0]);
	//    6   14:invokestatic    #98  <Method Logger Logger.get()>
	//    7   17:getstatic       #45  <Field String TAG>
	//    8   20:ldc1            #226 <String "onAllConstraintsMet for %s">
	//    9   22:iconst_1        
	//   10   23:anewarray       Object[]
	//   11   26:dup             
	//   12   27:iconst_0        
	//   13   28:aload_0         
	//   14   29:getfield        #59  <Field String mWorkSpecId>
	//   15   32:aastore         
	//   16   33:invokestatic    #106 <Method String String.format(String, Object[])>
	//   17   36:iconst_0        
	//   18   37:anewarray       Throwable[]
	//   19   40:invokevirtual   #112 <Method void Logger.debug(String, String, Throwable[])>
		if(mDispatcher.getProcessor().startWork(mWorkSpecId))
	//*  20   43:aload_0         
	//*  21   44:getfield        #57  <Field SystemAlarmDispatcher mDispatcher>
	//*  22   47:invokevirtual   #137 <Method Processor SystemAlarmDispatcher.getProcessor()>
	//*  23   50:aload_0         
	//*  24   51:getfield        #59  <Field String mWorkSpecId>
	//*  25   54:invokevirtual   #229 <Method boolean Processor.startWork(String)>
	//*  26   57:ifeq            79
		{
			mDispatcher.getWorkTimer().startTimer(mWorkSpecId, 0x927c0L, ((WorkTimer.TimeLimitExceededListener) (this)));
	//   27   60:aload_0         
	//   28   61:getfield        #57  <Field SystemAlarmDispatcher mDispatcher>
	//   29   64:invokevirtual   #80  <Method WorkTimer SystemAlarmDispatcher.getWorkTimer()>
	//   30   67:aload_0         
	//   31   68:getfield        #59  <Field String mWorkSpecId>
	//   32   71:ldc2w           #230 <Long 0x927c0L>
	//   33   74:aload_0         
	//   34   75:invokevirtual   #235 <Method void WorkTimer.startTimer(String, long, WorkTimer$TimeLimitExceededListener)>
			return;
	//   35   78:return          
		} else
		{
			cleanUp();
	//   36   79:aload_0         
	//   37   80:invokespecial   #237 <Method void cleanUp()>
			return;
	//   38   83:return          
		}
	}

	public void onAllConstraintsNotMet(List list)
	{
		stopWork();
	//    0    0:aload_0         
	//    1    1:invokespecial   #197 <Method void stopWork()>
	//    2    4:return          
	}

	public void onExecuted(String s, boolean flag)
	{
		Logger.get().debug(TAG, String.format("onExecuted %s, %s", new Object[] {
			s, Boolean.valueOf(flag)
		}), new Throwable[0]);
	//    0    0:invokestatic    #98  <Method Logger Logger.get()>
	//    1    3:getstatic       #45  <Field String TAG>
	//    2    6:ldc1            #244 <String "onExecuted %s, %s">
	//    3    8:iconst_2        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_1         
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:iload_2         
	//   12   19:invokestatic    #249 <Method Boolean Boolean.valueOf(boolean)>
	//   13   22:aastore         
	//   14   23:invokestatic    #106 <Method String String.format(String, Object[])>
	//   15   26:iconst_0        
	//   16   27:anewarray       Throwable[]
	//   17   30:invokevirtual   #112 <Method void Logger.debug(String, String, Throwable[])>
		cleanUp();
	//   18   33:aload_0         
	//   19   34:invokespecial   #237 <Method void cleanUp()>
		if(mHasConstraints)
	//*  20   37:aload_0         
	//*  21   38:getfield        #68  <Field boolean mHasConstraints>
	//*  22   41:ifeq            74
		{
			s = ((String) (CommandHandler.createConstraintsChangedIntent(mContext)));
	//   23   44:aload_0         
	//   24   45:getfield        #53  <Field Context mContext>
	//   25   48:invokestatic    #253 <Method android.content.Intent CommandHandler.createConstraintsChangedIntent(Context)>
	//   26   51:astore_1        
			SystemAlarmDispatcher systemalarmdispatcher = mDispatcher;
	//   27   52:aload_0         
	//   28   53:getfield        #57  <Field SystemAlarmDispatcher mDispatcher>
	//   29   56:astore_3        
			systemalarmdispatcher.postOnMainThread(((Runnable) (new SystemAlarmDispatcher.AddRunnable(systemalarmdispatcher, ((android.content.Intent) (s)), mStartId))));
	//   30   57:aload_3         
	//   31   58:new             #126 <Class SystemAlarmDispatcher$AddRunnable>
	//   32   61:dup             
	//   33   62:aload_3         
	//   34   63:aload_1         
	//   35   64:aload_0         
	//   36   65:getfield        #55  <Field int mStartId>
	//   37   68:invokespecial   #129 <Method void SystemAlarmDispatcher$AddRunnable(SystemAlarmDispatcher, android.content.Intent, int)>
	//   38   71:invokevirtual   #133 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
		}
	//   39   74:return          
	}

	public void onTimeLimitExceeded(String s)
	{
		Logger.get().debug(TAG, String.format("Exceeded time limits on execution for %s", new Object[] {
			s
		}), new Throwable[0]);
	//    0    0:invokestatic    #98  <Method Logger Logger.get()>
	//    1    3:getstatic       #45  <Field String TAG>
	//    2    6:ldc2            #256 <String "Exceeded time limits on execution for %s">
	//    3    9:iconst_1        
	//    4   10:anewarray       Object[]
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:aload_1         
	//    8   16:aastore         
	//    9   17:invokestatic    #106 <Method String String.format(String, Object[])>
	//   10   20:iconst_0        
	//   11   21:anewarray       Throwable[]
	//   12   24:invokevirtual   #112 <Method void Logger.debug(String, String, Throwable[])>
		stopWork();
	//   13   27:aload_0         
	//   14   28:invokespecial   #197 <Method void stopWork()>
	//   15   31:return          
	}

	private static final String TAG = Logger.tagWithPrefix("DelayMetCommandHandler");
	private final Context mContext;
	private final SystemAlarmDispatcher mDispatcher;
	private boolean mHasConstraints;
	private boolean mHasPendingStopWorkCommand;
	private final Object mLock = new Object();
	private final int mStartId;
	private android.os.PowerManager.WakeLock mWakeLock;
	private final WorkConstraintsTracker mWorkConstraintsTracker;
	private final String mWorkSpecId;

	static 
	{
	//    0    0:ldc1            #37  <String "DelayMetCommandHandler">
	//    1    2:invokestatic    #43  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #45  <Field String TAG>
	//*   3    8:return          
	}
}
