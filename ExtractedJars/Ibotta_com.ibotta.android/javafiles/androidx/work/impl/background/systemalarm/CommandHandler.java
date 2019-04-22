// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.Logger;
import androidx.work.State;
import androidx.work.impl.*;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package androidx.work.impl.background.systemalarm:
//			SystemAlarmService, ConstraintsCommandHandler, DelayMetCommandHandler, SystemAlarmDispatcher, 
//			Alarms

public class CommandHandler
	implements ExecutionListener
{

	CommandHandler(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field Context mContext>
	//    5    9:aload_0         
	//    6   10:new             #27  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #28  <Method void HashMap()>
	//    9   17:putfield        #30  <Field Map mPendingDelayMet>
	//   10   20:aload_0         
	//   11   21:new             #4   <Class Object>
	//   12   24:dup             
	//   13   25:invokespecial   #23  <Method void Object()>
	//   14   28:putfield        #32  <Field Object mLock>
	//   15   31:return          
	}

	static Intent createConstraintsChangedIntent(Context context)
	{
		context = ((Context) (new Intent(context, androidx/work/impl/background/systemalarm/SystemAlarmService)));
	//    0    0:new             #38  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #40  <Class SystemAlarmService>
	//    4    7:invokespecial   #43  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).setAction("ACTION_CONSTRAINTS_CHANGED");
	//    6   11:aload_0         
	//    7   12:ldc1            #45  <String "ACTION_CONSTRAINTS_CHANGED">
	//    8   14:invokevirtual   #49  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		return ((Intent) (context));
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	static Intent createDelayMetIntent(Context context, String s)
	{
		context = ((Context) (new Intent(context, androidx/work/impl/background/systemalarm/SystemAlarmService)));
	//    0    0:new             #38  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #40  <Class SystemAlarmService>
	//    4    7:invokespecial   #43  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).setAction("ACTION_DELAY_MET");
	//    6   11:aload_0         
	//    7   12:ldc1            #53  <String "ACTION_DELAY_MET">
	//    8   14:invokevirtual   #49  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		((Intent) (context)).putExtra("KEY_WORKSPEC_ID", s);
	//   10   18:aload_0         
	//   11   19:ldc1            #55  <String "KEY_WORKSPEC_ID">
	//   12   21:aload_1         
	//   13   22:invokevirtual   #59  <Method Intent Intent.putExtra(String, String)>
	//   14   25:pop             
		return ((Intent) (context));
	//   15   26:aload_0         
	//   16   27:areturn         
	}

	static Intent createExecutionCompletedIntent(Context context, String s, boolean flag)
	{
		context = ((Context) (new Intent(context, androidx/work/impl/background/systemalarm/SystemAlarmService)));
	//    0    0:new             #38  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #40  <Class SystemAlarmService>
	//    4    7:invokespecial   #43  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).setAction("ACTION_EXECUTION_COMPLETED");
	//    6   11:aload_0         
	//    7   12:ldc1            #63  <String "ACTION_EXECUTION_COMPLETED">
	//    8   14:invokevirtual   #49  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		((Intent) (context)).putExtra("KEY_WORKSPEC_ID", s);
	//   10   18:aload_0         
	//   11   19:ldc1            #55  <String "KEY_WORKSPEC_ID">
	//   12   21:aload_1         
	//   13   22:invokevirtual   #59  <Method Intent Intent.putExtra(String, String)>
	//   14   25:pop             
		((Intent) (context)).putExtra("KEY_NEEDS_RESCHEDULE", flag);
	//   15   26:aload_0         
	//   16   27:ldc1            #65  <String "KEY_NEEDS_RESCHEDULE">
	//   17   29:iload_2         
	//   18   30:invokevirtual   #68  <Method Intent Intent.putExtra(String, boolean)>
	//   19   33:pop             
		return ((Intent) (context));
	//   20   34:aload_0         
	//   21   35:areturn         
	}

	static Intent createRescheduleIntent(Context context)
	{
		context = ((Context) (new Intent(context, androidx/work/impl/background/systemalarm/SystemAlarmService)));
	//    0    0:new             #38  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #40  <Class SystemAlarmService>
	//    4    7:invokespecial   #43  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).setAction("ACTION_RESCHEDULE");
	//    6   11:aload_0         
	//    7   12:ldc1            #71  <String "ACTION_RESCHEDULE">
	//    8   14:invokevirtual   #49  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		return ((Intent) (context));
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	static Intent createScheduleWorkIntent(Context context, String s)
	{
		context = ((Context) (new Intent(context, androidx/work/impl/background/systemalarm/SystemAlarmService)));
	//    0    0:new             #38  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #40  <Class SystemAlarmService>
	//    4    7:invokespecial   #43  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).setAction("ACTION_SCHEDULE_WORK");
	//    6   11:aload_0         
	//    7   12:ldc1            #74  <String "ACTION_SCHEDULE_WORK">
	//    8   14:invokevirtual   #49  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		((Intent) (context)).putExtra("KEY_WORKSPEC_ID", s);
	//   10   18:aload_0         
	//   11   19:ldc1            #55  <String "KEY_WORKSPEC_ID">
	//   12   21:aload_1         
	//   13   22:invokevirtual   #59  <Method Intent Intent.putExtra(String, String)>
	//   14   25:pop             
		return ((Intent) (context));
	//   15   26:aload_0         
	//   16   27:areturn         
	}

	static Intent createStopWorkIntent(Context context, String s)
	{
		context = ((Context) (new Intent(context, androidx/work/impl/background/systemalarm/SystemAlarmService)));
	//    0    0:new             #38  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #40  <Class SystemAlarmService>
	//    4    7:invokespecial   #43  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).setAction("ACTION_STOP_WORK");
	//    6   11:aload_0         
	//    7   12:ldc1            #77  <String "ACTION_STOP_WORK">
	//    8   14:invokevirtual   #49  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		((Intent) (context)).putExtra("KEY_WORKSPEC_ID", s);
	//   10   18:aload_0         
	//   11   19:ldc1            #55  <String "KEY_WORKSPEC_ID">
	//   12   21:aload_1         
	//   13   22:invokevirtual   #59  <Method Intent Intent.putExtra(String, String)>
	//   14   25:pop             
		return ((Intent) (context));
	//   15   26:aload_0         
	//   16   27:areturn         
	}

	private void handleConstraintsChanged(Intent intent, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
		Logger.debug("CommandHandler", String.format("Handling constraints changed %s", new Object[] {
			intent
		}), new Throwable[0]);
	//    0    0:ldc1            #81  <String "CommandHandler">
	//    1    2:ldc1            #83  <String "Handling constraints changed %s">
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:invokestatic    #89  <Method String String.format(String, Object[])>
	//    9   15:iconst_0        
	//   10   16:anewarray       Throwable[]
	//   11   19:invokestatic    #97  <Method void Logger.debug(String, String, Throwable[])>
		(new ConstraintsCommandHandler(mContext, i, systemalarmdispatcher)).handleConstraintsChanged();
	//   12   22:new             #99  <Class ConstraintsCommandHandler>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:getfield        #25  <Field Context mContext>
	//   16   30:iload_2         
	//   17   31:aload_3         
	//   18   32:invokespecial   #102 <Method void ConstraintsCommandHandler(Context, int, SystemAlarmDispatcher)>
	//   19   35:invokevirtual   #104 <Method void ConstraintsCommandHandler.handleConstraintsChanged()>
	//   20   38:return          
	}

	private void handleDelayMet(Intent intent, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
		Object obj = ((Object) (intent.getExtras()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #109 <Method Bundle Intent.getExtras()>
	//    2    4:astore          4
		synchronized(mLock)
	//*   3    6:aload_0         
	//*   4    7:getfield        #32  <Field Object mLock>
	//*   5   10:astore_1        
	//*   6   11:aload_1         
	//*   7   12:monitorenter    
		{
			obj = ((Object) (((Bundle) (obj)).getString("KEY_WORKSPEC_ID")));
	//    8   13:aload           4
	//    9   15:ldc1            #55  <String "KEY_WORKSPEC_ID">
	//   10   17:invokevirtual   #115 <Method String Bundle.getString(String)>
	//   11   20:astore          4
			Logger.debug("CommandHandler", String.format("Handing delay met for %s", new Object[] {
				obj
			}), new Throwable[0]);
	//   12   22:ldc1            #81  <String "CommandHandler">
	//   13   24:ldc1            #117 <String "Handing delay met for %s">
	//   14   26:iconst_1        
	//   15   27:anewarray       Object[]
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload           4
	//   19   34:aastore         
	//   20   35:invokestatic    #89  <Method String String.format(String, Object[])>
	//   21   38:iconst_0        
	//   22   39:anewarray       Throwable[]
	//   23   42:invokestatic    #97  <Method void Logger.debug(String, String, Throwable[])>
			systemalarmdispatcher = ((SystemAlarmDispatcher) (new DelayMetCommandHandler(mContext, i, ((String) (obj)), systemalarmdispatcher)));
	//   24   45:new             #119 <Class DelayMetCommandHandler>
	//   25   48:dup             
	//   26   49:aload_0         
	//   27   50:getfield        #25  <Field Context mContext>
	//   28   53:iload_2         
	//   29   54:aload           4
	//   30   56:aload_3         
	//   31   57:invokespecial   #122 <Method void DelayMetCommandHandler(Context, int, String, SystemAlarmDispatcher)>
	//   32   60:astore_3        
			mPendingDelayMet.put(obj, ((Object) (systemalarmdispatcher)));
	//   33   61:aload_0         
	//   34   62:getfield        #30  <Field Map mPendingDelayMet>
	//   35   65:aload           4
	//   36   67:aload_3         
	//   37   68:invokeinterface #128 <Method Object Map.put(Object, Object)>
	//   38   73:pop             
			((DelayMetCommandHandler) (systemalarmdispatcher)).handleProcessWork();
	//   39   74:aload_3         
	//   40   75:invokevirtual   #131 <Method void DelayMetCommandHandler.handleProcessWork()>
		}
	//   41   78:aload_1         
	//   42   79:monitorexit     
		return;
	//   43   80:return          
		systemalarmdispatcher;
	//   44   81:astore_3        
		intent;
	//   45   82:aload_1         
		JVM INSTR monitorexit ;
	//   46   83:monitorexit     
		throw systemalarmdispatcher;
	//   47   84:aload_3         
	//   48   85:athrow          
	}

	private void handleExecutionCompleted(Intent intent, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
		systemalarmdispatcher = ((SystemAlarmDispatcher) (intent.getExtras()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #109 <Method Bundle Intent.getExtras()>
	//    2    4:astore_3        
		String s = ((Bundle) (systemalarmdispatcher)).getString("KEY_WORKSPEC_ID");
	//    3    5:aload_3         
	//    4    6:ldc1            #55  <String "KEY_WORKSPEC_ID">
	//    5    8:invokevirtual   #115 <Method String Bundle.getString(String)>
	//    6   11:astore          5
		boolean flag = ((Bundle) (systemalarmdispatcher)).getBoolean("KEY_NEEDS_RESCHEDULE");
	//    7   13:aload_3         
	//    8   14:ldc1            #65  <String "KEY_NEEDS_RESCHEDULE">
	//    9   16:invokevirtual   #136 <Method boolean Bundle.getBoolean(String)>
	//   10   19:istore          4
		Logger.debug("CommandHandler", String.format("Handling onExecutionCompleted %s, %s", new Object[] {
			intent, Integer.valueOf(i)
		}), new Throwable[0]);
	//   11   21:ldc1            #81  <String "CommandHandler">
	//   12   23:ldc1            #138 <String "Handling onExecutionCompleted %s, %s">
	//   13   25:iconst_2        
	//   14   26:anewarray       Object[]
	//   15   29:dup             
	//   16   30:iconst_0        
	//   17   31:aload_1         
	//   18   32:aastore         
	//   19   33:dup             
	//   20   34:iconst_1        
	//   21   35:iload_2         
	//   22   36:invokestatic    #144 <Method Integer Integer.valueOf(int)>
	//   23   39:aastore         
	//   24   40:invokestatic    #89  <Method String String.format(String, Object[])>
	//   25   43:iconst_0        
	//   26   44:anewarray       Throwable[]
	//   27   47:invokestatic    #97  <Method void Logger.debug(String, String, Throwable[])>
		onExecuted(s, flag);
	//   28   50:aload_0         
	//   29   51:aload           5
	//   30   53:iload           4
	//   31   55:invokevirtual   #148 <Method void onExecuted(String, boolean)>
	//   32   58:return          
	}

	private void handleReschedule(Intent intent, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
		Logger.debug("CommandHandler", String.format("Handling reschedule %s, %s", new Object[] {
			intent, Integer.valueOf(i)
		}), new Throwable[0]);
	//    0    0:ldc1            #81  <String "CommandHandler">
	//    1    2:ldc1            #151 <String "Handling reschedule %s, %s">
	//    2    4:iconst_2        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:iload_2         
	//   11   15:invokestatic    #144 <Method Integer Integer.valueOf(int)>
	//   12   18:aastore         
	//   13   19:invokestatic    #89  <Method String String.format(String, Object[])>
	//   14   22:iconst_0        
	//   15   23:anewarray       Throwable[]
	//   16   26:invokestatic    #97  <Method void Logger.debug(String, String, Throwable[])>
		systemalarmdispatcher.getWorkManager().rescheduleEligibleWork();
	//   17   29:aload_3         
	//   18   30:invokevirtual   #157 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//   19   33:invokevirtual   #162 <Method void WorkManagerImpl.rescheduleEligibleWork()>
	//   20   36:return          
	}

	private void handleScheduleWorkIntent(Intent intent, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
		String s;
		s = intent.getExtras().getString("KEY_WORKSPEC_ID");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #109 <Method Bundle Intent.getExtras()>
	//    2    4:ldc1            #55  <String "KEY_WORKSPEC_ID">
	//    3    6:invokevirtual   #115 <Method String Bundle.getString(String)>
	//    4    9:astore          6
		Logger.debug("CommandHandler", String.format("Handling schedule work for %s", new Object[] {
			s
		}), new Throwable[0]);
	//    5   11:ldc1            #81  <String "CommandHandler">
	//    6   13:ldc1            #165 <String "Handling schedule work for %s">
	//    7   15:iconst_1        
	//    8   16:anewarray       Object[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:aload           6
	//   12   23:aastore         
	//   13   24:invokestatic    #89  <Method String String.format(String, Object[])>
	//   14   27:iconst_0        
	//   15   28:anewarray       Throwable[]
	//   16   31:invokestatic    #97  <Method void Logger.debug(String, String, Throwable[])>
		intent = ((Intent) (systemalarmdispatcher.getWorkManager().getWorkDatabase()));
	//   17   34:aload_3         
	//   18   35:invokevirtual   #157 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//   19   38:invokevirtual   #169 <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//   20   41:astore_1        
		((WorkDatabase) (intent)).beginTransaction();
	//   21   42:aload_1         
	//   22   43:invokevirtual   #174 <Method void WorkDatabase.beginTransaction()>
		WorkSpec workspec = ((WorkDatabase) (intent)).workSpecDao().getWorkSpec(s);
	//   23   46:aload_1         
	//   24   47:invokevirtual   #178 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//   25   50:aload           6
	//   26   52:invokeinterface #184 <Method WorkSpec WorkSpecDao.getWorkSpec(String)>
	//   27   57:astore          7
		if(workspec != null)
			break MISSING_BLOCK_LABEL_118;
	//   28   59:aload           7
	//   29   61:ifnonnull       118
		systemalarmdispatcher = ((SystemAlarmDispatcher) (new StringBuilder()));
	//   30   64:new             #186 <Class StringBuilder>
	//   31   67:dup             
	//   32   68:invokespecial   #187 <Method void StringBuilder()>
	//   33   71:astore_3        
		((StringBuilder) (systemalarmdispatcher)).append("Skipping scheduling ");
	//   34   72:aload_3         
	//   35   73:ldc1            #189 <String "Skipping scheduling ">
	//   36   75:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   37   78:pop             
		((StringBuilder) (systemalarmdispatcher)).append(s);
	//   38   79:aload_3         
	//   39   80:aload           6
	//   40   82:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   41   85:pop             
		((StringBuilder) (systemalarmdispatcher)).append(" because it's no longer in ");
	//   42   86:aload_3         
	//   43   87:ldc1            #195 <String " because it's no longer in ">
	//   44   89:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   45   92:pop             
		((StringBuilder) (systemalarmdispatcher)).append("the DB");
	//   46   93:aload_3         
	//   47   94:ldc1            #197 <String "the DB">
	//   48   96:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   49   99:pop             
		Logger.warning("CommandHandler", ((StringBuilder) (systemalarmdispatcher)).toString(), new Throwable[0]);
	//   50  100:ldc1            #81  <String "CommandHandler">
	//   51  102:aload_3         
	//   52  103:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   53  106:iconst_0        
	//   54  107:anewarray       Throwable[]
	//   55  110:invokestatic    #204 <Method void Logger.warning(String, String, Throwable[])>
		((WorkDatabase) (intent)).endTransaction();
	//   56  113:aload_1         
	//   57  114:invokevirtual   #207 <Method void WorkDatabase.endTransaction()>
		return;
	//   58  117:return          
		if(workspec.state == State.ENQUEUED)
			break MISSING_BLOCK_LABEL_183;
	//   59  118:aload           7
	//   60  120:getfield        #213 <Field State WorkSpec.state>
	//   61  123:getstatic       #218 <Field State State.ENQUEUED>
	//   62  126:if_acmpeq       183
		systemalarmdispatcher = ((SystemAlarmDispatcher) (new StringBuilder()));
	//   63  129:new             #186 <Class StringBuilder>
	//   64  132:dup             
	//   65  133:invokespecial   #187 <Method void StringBuilder()>
	//   66  136:astore_3        
		((StringBuilder) (systemalarmdispatcher)).append("Skipping scheduling ");
	//   67  137:aload_3         
	//   68  138:ldc1            #189 <String "Skipping scheduling ">
	//   69  140:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   70  143:pop             
		((StringBuilder) (systemalarmdispatcher)).append(s);
	//   71  144:aload_3         
	//   72  145:aload           6
	//   73  147:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   74  150:pop             
		((StringBuilder) (systemalarmdispatcher)).append(" because it is no longer ");
	//   75  151:aload_3         
	//   76  152:ldc1            #220 <String " because it is no longer ">
	//   77  154:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   78  157:pop             
		((StringBuilder) (systemalarmdispatcher)).append("enqueued");
	//   79  158:aload_3         
	//   80  159:ldc1            #222 <String "enqueued">
	//   81  161:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   82  164:pop             
		Logger.warning("CommandHandler", ((StringBuilder) (systemalarmdispatcher)).toString(), new Throwable[0]);
	//   83  165:ldc1            #81  <String "CommandHandler">
	//   84  167:aload_3         
	//   85  168:invokevirtual   #201 <Method String StringBuilder.toString()>
	//   86  171:iconst_0        
	//   87  172:anewarray       Throwable[]
	//   88  175:invokestatic    #204 <Method void Logger.warning(String, String, Throwable[])>
		((WorkDatabase) (intent)).endTransaction();
	//   89  178:aload_1         
	//   90  179:invokevirtual   #207 <Method void WorkDatabase.endTransaction()>
		return;
	//   91  182:return          
		long l;
		l = workspec.calculateNextRunTime();
	//   92  183:aload           7
	//   93  185:invokevirtual   #226 <Method long WorkSpec.calculateNextRunTime()>
	//   94  188:lstore          4
		if(!workspec.hasConstraints())
	//*  95  190:aload           7
	//*  96  192:invokevirtual   #230 <Method boolean WorkSpec.hasConstraints()>
	//*  97  195:ifne            239
		{
			Logger.debug("CommandHandler", String.format("Setting up Alarms for %s", new Object[] {
				s
			}), new Throwable[0]);
	//   98  198:ldc1            #81  <String "CommandHandler">
	//   99  200:ldc1            #232 <String "Setting up Alarms for %s">
	//  100  202:iconst_1        
	//  101  203:anewarray       Object[]
	//  102  206:dup             
	//  103  207:iconst_0        
	//  104  208:aload           6
	//  105  210:aastore         
	//  106  211:invokestatic    #89  <Method String String.format(String, Object[])>
	//  107  214:iconst_0        
	//  108  215:anewarray       Throwable[]
	//  109  218:invokestatic    #97  <Method void Logger.debug(String, String, Throwable[])>
			Alarms.setAlarm(mContext, systemalarmdispatcher.getWorkManager(), s, l);
	//  110  221:aload_0         
	//  111  222:getfield        #25  <Field Context mContext>
	//  112  225:aload_3         
	//  113  226:invokevirtual   #157 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//  114  229:aload           6
	//  115  231:lload           4
	//  116  233:invokestatic    #238 <Method void Alarms.setAlarm(Context, WorkManagerImpl, String, long)>
			break MISSING_BLOCK_LABEL_297;
	//  117  236:goto            297
		}
		Logger.debug("CommandHandler", String.format("Opportunistically setting an alarm for %s", new Object[] {
			s
		}), new Throwable[0]);
	//  118  239:ldc1            #81  <String "CommandHandler">
	//  119  241:ldc1            #240 <String "Opportunistically setting an alarm for %s">
	//  120  243:iconst_1        
	//  121  244:anewarray       Object[]
	//  122  247:dup             
	//  123  248:iconst_0        
	//  124  249:aload           6
	//  125  251:aastore         
	//  126  252:invokestatic    #89  <Method String String.format(String, Object[])>
	//  127  255:iconst_0        
	//  128  256:anewarray       Throwable[]
	//  129  259:invokestatic    #97  <Method void Logger.debug(String, String, Throwable[])>
		Alarms.setAlarm(mContext, systemalarmdispatcher.getWorkManager(), s, l);
	//  130  262:aload_0         
	//  131  263:getfield        #25  <Field Context mContext>
	//  132  266:aload_3         
	//  133  267:invokevirtual   #157 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//  134  270:aload           6
	//  135  272:lload           4
	//  136  274:invokestatic    #238 <Method void Alarms.setAlarm(Context, WorkManagerImpl, String, long)>
		systemalarmdispatcher.postOnMainThread(((Runnable) (new SystemAlarmDispatcher.AddRunnable(systemalarmdispatcher, createConstraintsChangedIntent(mContext), i))));
	//  137  277:aload_3         
	//  138  278:new             #242 <Class SystemAlarmDispatcher$AddRunnable>
	//  139  281:dup             
	//  140  282:aload_3         
	//  141  283:aload_0         
	//  142  284:getfield        #25  <Field Context mContext>
	//  143  287:invokestatic    #244 <Method Intent createConstraintsChangedIntent(Context)>
	//  144  290:iload_2         
	//  145  291:invokespecial   #247 <Method void SystemAlarmDispatcher$AddRunnable(SystemAlarmDispatcher, Intent, int)>
	//  146  294:invokevirtual   #251 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
		((WorkDatabase) (intent)).setTransactionSuccessful();
	//  147  297:aload_1         
	//  148  298:invokevirtual   #254 <Method void WorkDatabase.setTransactionSuccessful()>
		((WorkDatabase) (intent)).endTransaction();
	//  149  301:aload_1         
	//  150  302:invokevirtual   #207 <Method void WorkDatabase.endTransaction()>
		return;
	//  151  305:return          
		systemalarmdispatcher;
	//  152  306:astore_3        
		((WorkDatabase) (intent)).endTransaction();
	//  153  307:aload_1         
	//  154  308:invokevirtual   #207 <Method void WorkDatabase.endTransaction()>
		throw systemalarmdispatcher;
	//  155  311:aload_3         
	//  156  312:athrow          
	}

	private void handleStopWork(Intent intent, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
		intent = ((Intent) (intent.getExtras().getString("KEY_WORKSPEC_ID")));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #109 <Method Bundle Intent.getExtras()>
	//    2    4:ldc1            #55  <String "KEY_WORKSPEC_ID">
	//    3    6:invokevirtual   #115 <Method String Bundle.getString(String)>
	//    4    9:astore_1        
		Logger.debug("CommandHandler", String.format("Handing stopWork work for %s", new Object[] {
			intent
		}), new Throwable[0]);
	//    5   10:ldc1            #81  <String "CommandHandler">
	//    6   12:ldc2            #257 <String "Handing stopWork work for %s">
	//    7   15:iconst_1        
	//    8   16:anewarray       Object[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:aload_1         
	//   12   22:aastore         
	//   13   23:invokestatic    #89  <Method String String.format(String, Object[])>
	//   14   26:iconst_0        
	//   15   27:anewarray       Throwable[]
	//   16   30:invokestatic    #97  <Method void Logger.debug(String, String, Throwable[])>
		systemalarmdispatcher.getWorkManager().stopWork(((String) (intent)));
	//   17   33:aload_3         
	//   18   34:invokevirtual   #157 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #261 <Method void WorkManagerImpl.stopWork(String)>
		Alarms.cancelAlarm(mContext, systemalarmdispatcher.getWorkManager(), ((String) (intent)));
	//   21   41:aload_0         
	//   22   42:getfield        #25  <Field Context mContext>
	//   23   45:aload_3         
	//   24   46:invokevirtual   #157 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//   25   49:aload_1         
	//   26   50:invokestatic    #265 <Method void Alarms.cancelAlarm(Context, WorkManagerImpl, String)>
		systemalarmdispatcher.onExecuted(((String) (intent)), false);
	//   27   53:aload_3         
	//   28   54:aload_1         
	//   29   55:iconst_0        
	//   30   56:invokevirtual   #266 <Method void SystemAlarmDispatcher.onExecuted(String, boolean)>
	//   31   59:return          
	}

	private static transient boolean hasKeys(Bundle bundle, String as[])
	{
		if(bundle != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          44
		{
			if(bundle.isEmpty())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #272 <Method boolean Bundle.isEmpty()>
	//*   4    8:ifeq            13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			int j = as.length;
	//    7   13:aload_1         
	//    8   14:arraylength     
	//    9   15:istore_3        
			for(int i = 0; i < j; i++)
	//*  10   16:iconst_0        
	//*  11   17:istore_2        
	//*  12   18:iload_2         
	//*  13   19:iload_3         
	//*  14   20:icmpge          42
				if(bundle.get(as[i]) == null)
	//*  15   23:aload_0         
	//*  16   24:aload_1         
	//*  17   25:iload_2         
	//*  18   26:aaload          
	//*  19   27:invokevirtual   #276 <Method Object Bundle.get(String)>
	//*  20   30:ifnonnull       35
					return false;
	//   21   33:iconst_0        
	//   22   34:ireturn         

	//   23   35:iload_2         
	//   24   36:iconst_1        
	//   25   37:iadd            
	//   26   38:istore_2        
	//*  27   39:goto            18
			return true;
	//   28   42:iconst_1        
	//   29   43:ireturn         
		} else
		{
			return false;
	//   30   44:iconst_0        
	//   31   45:ireturn         
		}
	}

	boolean hasPendingCommands()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(!mPendingDelayMet.isEmpty())
	//*   5    7:aload_0         
	//*   6    8:getfield        #30  <Field Map mPendingDelayMet>
	//*   7   11:invokeinterface #278 <Method boolean Map.isEmpty()>
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

	public void onExecuted(String s, boolean flag)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Object mLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		ExecutionListener executionlistener = (ExecutionListener)mPendingDelayMet.remove(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #30  <Field Map mPendingDelayMet>
	//    7   11:aload_1         
	//    8   12:invokeinterface #282 <Method Object Map.remove(Object)>
	//    9   17:checkcast       #6   <Class ExecutionListener>
	//   10   20:astore          4
		if(executionlistener == null)
			break MISSING_BLOCK_LABEL_36;
	//   11   22:aload           4
	//   12   24:ifnull          36
		executionlistener.onExecuted(s, flag);
	//   13   27:aload           4
	//   14   29:aload_1         
	//   15   30:iload_2         
	//   16   31:invokeinterface #283 <Method void ExecutionListener.onExecuted(String, boolean)>
		obj;
	//   17   36:aload_3         
		JVM INSTR monitorexit ;
	//   18   37:monitorexit     
		return;
	//   19   38:return          
		s;
	//   20   39:astore_1        
		obj;
	//   21   40:aload_3         
		JVM INSTR monitorexit ;
	//   22   41:monitorexit     
		throw s;
	//   23   42:aload_1         
	//   24   43:athrow          
	}

	void onHandleIntent(Intent intent, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
		String s = intent.getAction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #288 <Method String Intent.getAction()>
	//    2    4:astore          4
		if("ACTION_CONSTRAINTS_CHANGED".equals(((Object) (s))))
	//*   3    6:ldc1            #45  <String "ACTION_CONSTRAINTS_CHANGED">
	//*   4    8:aload           4
	//*   5   10:invokevirtual   #292 <Method boolean String.equals(Object)>
	//*   6   13:ifeq            24
		{
			handleConstraintsChanged(intent, i, systemalarmdispatcher);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:iload_2         
	//   10   19:aload_3         
	//   11   20:invokespecial   #294 <Method void handleConstraintsChanged(Intent, int, SystemAlarmDispatcher)>
			return;
	//   12   23:return          
		}
		if("ACTION_RESCHEDULE".equals(((Object) (s))))
	//*  13   24:ldc1            #71  <String "ACTION_RESCHEDULE">
	//*  14   26:aload           4
	//*  15   28:invokevirtual   #292 <Method boolean String.equals(Object)>
	//*  16   31:ifeq            42
		{
			handleReschedule(intent, i, systemalarmdispatcher);
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:iload_2         
	//   20   37:aload_3         
	//   21   38:invokespecial   #296 <Method void handleReschedule(Intent, int, SystemAlarmDispatcher)>
			return;
	//   22   41:return          
		}
		if(!hasKeys(intent.getExtras(), new String[] {
	"KEY_WORKSPEC_ID"
}))
	//*  23   42:aload_1         
	//*  24   43:invokevirtual   #109 <Method Bundle Intent.getExtras()>
	//*  25   46:iconst_1        
	//*  26   47:anewarray       String[]
	//*  27   50:dup             
	//*  28   51:iconst_0        
	//*  29   52:ldc1            #55  <String "KEY_WORKSPEC_ID">
	//*  30   54:aastore         
	//*  31   55:invokestatic    #298 <Method boolean hasKeys(Bundle, String[])>
	//*  32   58:ifne            91
		{
			Logger.error("CommandHandler", String.format("Invalid request for %s, requires %s.", new Object[] {
				s, "KEY_WORKSPEC_ID"
			}), new Throwable[0]);
	//   33   61:ldc1            #81  <String "CommandHandler">
	//   34   63:ldc2            #300 <String "Invalid request for %s, requires %s.">
	//   35   66:iconst_2        
	//   36   67:anewarray       Object[]
	//   37   70:dup             
	//   38   71:iconst_0        
	//   39   72:aload           4
	//   40   74:aastore         
	//   41   75:dup             
	//   42   76:iconst_1        
	//   43   77:ldc1            #55  <String "KEY_WORKSPEC_ID">
	//   44   79:aastore         
	//   45   80:invokestatic    #89  <Method String String.format(String, Object[])>
	//   46   83:iconst_0        
	//   47   84:anewarray       Throwable[]
	//   48   87:invokestatic    #303 <Method void Logger.error(String, String, Throwable[])>
			return;
	//   49   90:return          
		}
		if("ACTION_SCHEDULE_WORK".equals(((Object) (s))))
	//*  50   91:ldc1            #74  <String "ACTION_SCHEDULE_WORK">
	//*  51   93:aload           4
	//*  52   95:invokevirtual   #292 <Method boolean String.equals(Object)>
	//*  53   98:ifeq            109
		{
			handleScheduleWorkIntent(intent, i, systemalarmdispatcher);
	//   54  101:aload_0         
	//   55  102:aload_1         
	//   56  103:iload_2         
	//   57  104:aload_3         
	//   58  105:invokespecial   #305 <Method void handleScheduleWorkIntent(Intent, int, SystemAlarmDispatcher)>
			return;
	//   59  108:return          
		}
		if("ACTION_DELAY_MET".equals(((Object) (s))))
	//*  60  109:ldc1            #53  <String "ACTION_DELAY_MET">
	//*  61  111:aload           4
	//*  62  113:invokevirtual   #292 <Method boolean String.equals(Object)>
	//*  63  116:ifeq            127
		{
			handleDelayMet(intent, i, systemalarmdispatcher);
	//   64  119:aload_0         
	//   65  120:aload_1         
	//   66  121:iload_2         
	//   67  122:aload_3         
	//   68  123:invokespecial   #307 <Method void handleDelayMet(Intent, int, SystemAlarmDispatcher)>
			return;
	//   69  126:return          
		}
		if("ACTION_STOP_WORK".equals(((Object) (s))))
	//*  70  127:ldc1            #77  <String "ACTION_STOP_WORK">
	//*  71  129:aload           4
	//*  72  131:invokevirtual   #292 <Method boolean String.equals(Object)>
	//*  73  134:ifeq            145
		{
			handleStopWork(intent, i, systemalarmdispatcher);
	//   74  137:aload_0         
	//   75  138:aload_1         
	//   76  139:iload_2         
	//   77  140:aload_3         
	//   78  141:invokespecial   #309 <Method void handleStopWork(Intent, int, SystemAlarmDispatcher)>
			return;
	//   79  144:return          
		}
		if("ACTION_EXECUTION_COMPLETED".equals(((Object) (s))))
	//*  80  145:ldc1            #63  <String "ACTION_EXECUTION_COMPLETED">
	//*  81  147:aload           4
	//*  82  149:invokevirtual   #292 <Method boolean String.equals(Object)>
	//*  83  152:ifeq            163
		{
			handleExecutionCompleted(intent, i, systemalarmdispatcher);
	//   84  155:aload_0         
	//   85  156:aload_1         
	//   86  157:iload_2         
	//   87  158:aload_3         
	//   88  159:invokespecial   #311 <Method void handleExecutionCompleted(Intent, int, SystemAlarmDispatcher)>
			return;
	//   89  162:return          
		} else
		{
			Logger.warning("CommandHandler", String.format("Ignoring intent %s", new Object[] {
				intent
			}), new Throwable[0]);
	//   90  163:ldc1            #81  <String "CommandHandler">
	//   91  165:ldc2            #313 <String "Ignoring intent %s">
	//   92  168:iconst_1        
	//   93  169:anewarray       Object[]
	//   94  172:dup             
	//   95  173:iconst_0        
	//   96  174:aload_1         
	//   97  175:aastore         
	//   98  176:invokestatic    #89  <Method String String.format(String, Object[])>
	//   99  179:iconst_0        
	//  100  180:anewarray       Throwable[]
	//  101  183:invokestatic    #204 <Method void Logger.warning(String, String, Throwable[])>
			return;
	//  102  186:return          
		}
	}

	private final Context mContext;
	private final Object mLock = new Object();
	private final Map mPendingDelayMet = new HashMap();
}
