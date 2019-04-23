// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.Logger;
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
	//    1    1:invokespecial   #57  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #59  <Field Context mContext>
	//    5    9:aload_0         
	//    6   10:new             #61  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #62  <Method void HashMap()>
	//    9   17:putfield        #64  <Field Map mPendingDelayMet>
	//   10   20:aload_0         
	//   11   21:new             #4   <Class Object>
	//   12   24:dup             
	//   13   25:invokespecial   #57  <Method void Object()>
	//   14   28:putfield        #66  <Field Object mLock>
	//   15   31:return          
	}

	static Intent createConstraintsChangedIntent(Context context)
	{
		context = ((Context) (new Intent(context, androidx/work/impl/background/systemalarm/SystemAlarmService)));
	//    0    0:new             #71  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #73  <Class SystemAlarmService>
	//    4    7:invokespecial   #76  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).setAction("ACTION_CONSTRAINTS_CHANGED");
	//    6   11:aload_0         
	//    7   12:ldc1            #13  <String "ACTION_CONSTRAINTS_CHANGED">
	//    8   14:invokevirtual   #80  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		return ((Intent) (context));
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	static Intent createDelayMetIntent(Context context, String s)
	{
		context = ((Context) (new Intent(context, androidx/work/impl/background/systemalarm/SystemAlarmService)));
	//    0    0:new             #71  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #73  <Class SystemAlarmService>
	//    4    7:invokespecial   #76  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).setAction("ACTION_DELAY_MET");
	//    6   11:aload_0         
	//    7   12:ldc1            #15  <String "ACTION_DELAY_MET">
	//    8   14:invokevirtual   #80  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		((Intent) (context)).putExtra("KEY_WORKSPEC_ID", s);
	//   10   18:aload_0         
	//   11   19:ldc1            #27  <String "KEY_WORKSPEC_ID">
	//   12   21:aload_1         
	//   13   22:invokevirtual   #86  <Method Intent Intent.putExtra(String, String)>
	//   14   25:pop             
		return ((Intent) (context));
	//   15   26:aload_0         
	//   16   27:areturn         
	}

	static Intent createExecutionCompletedIntent(Context context, String s, boolean flag)
	{
		context = ((Context) (new Intent(context, androidx/work/impl/background/systemalarm/SystemAlarmService)));
	//    0    0:new             #71  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #73  <Class SystemAlarmService>
	//    4    7:invokespecial   #76  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).setAction("ACTION_EXECUTION_COMPLETED");
	//    6   11:aload_0         
	//    7   12:ldc1            #17  <String "ACTION_EXECUTION_COMPLETED">
	//    8   14:invokevirtual   #80  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		((Intent) (context)).putExtra("KEY_WORKSPEC_ID", s);
	//   10   18:aload_0         
	//   11   19:ldc1            #27  <String "KEY_WORKSPEC_ID">
	//   12   21:aload_1         
	//   13   22:invokevirtual   #86  <Method Intent Intent.putExtra(String, String)>
	//   14   25:pop             
		((Intent) (context)).putExtra("KEY_NEEDS_RESCHEDULE", flag);
	//   15   26:aload_0         
	//   16   27:ldc1            #25  <String "KEY_NEEDS_RESCHEDULE">
	//   17   29:iload_2         
	//   18   30:invokevirtual   #91  <Method Intent Intent.putExtra(String, boolean)>
	//   19   33:pop             
		return ((Intent) (context));
	//   20   34:aload_0         
	//   21   35:areturn         
	}

	static Intent createRescheduleIntent(Context context)
	{
		context = ((Context) (new Intent(context, androidx/work/impl/background/systemalarm/SystemAlarmService)));
	//    0    0:new             #71  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #73  <Class SystemAlarmService>
	//    4    7:invokespecial   #76  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).setAction("ACTION_RESCHEDULE");
	//    6   11:aload_0         
	//    7   12:ldc1            #19  <String "ACTION_RESCHEDULE">
	//    8   14:invokevirtual   #80  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		return ((Intent) (context));
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	static Intent createScheduleWorkIntent(Context context, String s)
	{
		context = ((Context) (new Intent(context, androidx/work/impl/background/systemalarm/SystemAlarmService)));
	//    0    0:new             #71  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #73  <Class SystemAlarmService>
	//    4    7:invokespecial   #76  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).setAction("ACTION_SCHEDULE_WORK");
	//    6   11:aload_0         
	//    7   12:ldc1            #21  <String "ACTION_SCHEDULE_WORK">
	//    8   14:invokevirtual   #80  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		((Intent) (context)).putExtra("KEY_WORKSPEC_ID", s);
	//   10   18:aload_0         
	//   11   19:ldc1            #27  <String "KEY_WORKSPEC_ID">
	//   12   21:aload_1         
	//   13   22:invokevirtual   #86  <Method Intent Intent.putExtra(String, String)>
	//   14   25:pop             
		return ((Intent) (context));
	//   15   26:aload_0         
	//   16   27:areturn         
	}

	static Intent createStopWorkIntent(Context context, String s)
	{
		context = ((Context) (new Intent(context, androidx/work/impl/background/systemalarm/SystemAlarmService)));
	//    0    0:new             #71  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #73  <Class SystemAlarmService>
	//    4    7:invokespecial   #76  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).setAction("ACTION_STOP_WORK");
	//    6   11:aload_0         
	//    7   12:ldc1            #23  <String "ACTION_STOP_WORK">
	//    8   14:invokevirtual   #80  <Method Intent Intent.setAction(String)>
	//    9   17:pop             
		((Intent) (context)).putExtra("KEY_WORKSPEC_ID", s);
	//   10   18:aload_0         
	//   11   19:ldc1            #27  <String "KEY_WORKSPEC_ID">
	//   12   21:aload_1         
	//   13   22:invokevirtual   #86  <Method Intent Intent.putExtra(String, String)>
	//   14   25:pop             
		return ((Intent) (context));
	//   15   26:aload_0         
	//   16   27:areturn         
	}

	private void handleConstraintsChanged(Intent intent, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
		Logger.get().debug(TAG, String.format("Handling constraints changed %s", new Object[] {
			intent
		}), new Throwable[0]);
	//    0    0:invokestatic    #100 <Method Logger Logger.get()>
	//    1    3:getstatic       #51  <Field String TAG>
	//    2    6:ldc1            #102 <String "Handling constraints changed %s">
	//    3    8:iconst_1        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_1         
	//    8   15:aastore         
	//    9   16:invokestatic    #108 <Method String String.format(String, Object[])>
	//   10   19:iconst_0        
	//   11   20:anewarray       Throwable[]
	//   12   23:invokevirtual   #114 <Method void Logger.debug(String, String, Throwable[])>
		(new ConstraintsCommandHandler(mContext, i, systemalarmdispatcher)).handleConstraintsChanged();
	//   13   26:new             #116 <Class ConstraintsCommandHandler>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:getfield        #59  <Field Context mContext>
	//   17   34:iload_2         
	//   18   35:aload_3         
	//   19   36:invokespecial   #119 <Method void ConstraintsCommandHandler(Context, int, SystemAlarmDispatcher)>
	//   20   39:invokevirtual   #121 <Method void ConstraintsCommandHandler.handleConstraintsChanged()>
	//   21   42:return          
	}

	private void handleDelayMet(Intent intent, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
		Object obj = ((Object) (intent.getExtras()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #126 <Method Bundle Intent.getExtras()>
	//    2    4:astore          4
		synchronized(mLock)
	//*   3    6:aload_0         
	//*   4    7:getfield        #66  <Field Object mLock>
	//*   5   10:astore_1        
	//*   6   11:aload_1         
	//*   7   12:monitorenter    
		{
			obj = ((Object) (((Bundle) (obj)).getString("KEY_WORKSPEC_ID")));
	//    8   13:aload           4
	//    9   15:ldc1            #27  <String "KEY_WORKSPEC_ID">
	//   10   17:invokevirtual   #131 <Method String Bundle.getString(String)>
	//   11   20:astore          4
			Logger.get().debug(TAG, String.format("Handing delay met for %s", new Object[] {
				obj
			}), new Throwable[0]);
	//   12   22:invokestatic    #100 <Method Logger Logger.get()>
	//   13   25:getstatic       #51  <Field String TAG>
	//   14   28:ldc1            #133 <String "Handing delay met for %s">
	//   15   30:iconst_1        
	//   16   31:anewarray       Object[]
	//   17   34:dup             
	//   18   35:iconst_0        
	//   19   36:aload           4
	//   20   38:aastore         
	//   21   39:invokestatic    #108 <Method String String.format(String, Object[])>
	//   22   42:iconst_0        
	//   23   43:anewarray       Throwable[]
	//   24   46:invokevirtual   #114 <Method void Logger.debug(String, String, Throwable[])>
			systemalarmdispatcher = ((SystemAlarmDispatcher) (new DelayMetCommandHandler(mContext, i, ((String) (obj)), systemalarmdispatcher)));
	//   25   49:new             #135 <Class DelayMetCommandHandler>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:getfield        #59  <Field Context mContext>
	//   29   57:iload_2         
	//   30   58:aload           4
	//   31   60:aload_3         
	//   32   61:invokespecial   #138 <Method void DelayMetCommandHandler(Context, int, String, SystemAlarmDispatcher)>
	//   33   64:astore_3        
			mPendingDelayMet.put(obj, ((Object) (systemalarmdispatcher)));
	//   34   65:aload_0         
	//   35   66:getfield        #64  <Field Map mPendingDelayMet>
	//   36   69:aload           4
	//   37   71:aload_3         
	//   38   72:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//   39   77:pop             
			((DelayMetCommandHandler) (systemalarmdispatcher)).handleProcessWork();
	//   40   78:aload_3         
	//   41   79:invokevirtual   #147 <Method void DelayMetCommandHandler.handleProcessWork()>
		}
	//   42   82:aload_1         
	//   43   83:monitorexit     
		return;
	//   44   84:return          
		systemalarmdispatcher;
	//   45   85:astore_3        
		intent;
	//   46   86:aload_1         
		JVM INSTR monitorexit ;
	//   47   87:monitorexit     
		throw systemalarmdispatcher;
	//   48   88:aload_3         
	//   49   89:athrow          
	}

	private void handleExecutionCompleted(Intent intent, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
		systemalarmdispatcher = ((SystemAlarmDispatcher) (intent.getExtras()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #126 <Method Bundle Intent.getExtras()>
	//    2    4:astore_3        
		String s = ((Bundle) (systemalarmdispatcher)).getString("KEY_WORKSPEC_ID");
	//    3    5:aload_3         
	//    4    6:ldc1            #27  <String "KEY_WORKSPEC_ID">
	//    5    8:invokevirtual   #131 <Method String Bundle.getString(String)>
	//    6   11:astore          5
		boolean flag = ((Bundle) (systemalarmdispatcher)).getBoolean("KEY_NEEDS_RESCHEDULE");
	//    7   13:aload_3         
	//    8   14:ldc1            #25  <String "KEY_NEEDS_RESCHEDULE">
	//    9   16:invokevirtual   #152 <Method boolean Bundle.getBoolean(String)>
	//   10   19:istore          4
		Logger.get().debug(TAG, String.format("Handling onExecutionCompleted %s, %s", new Object[] {
			intent, Integer.valueOf(i)
		}), new Throwable[0]);
	//   11   21:invokestatic    #100 <Method Logger Logger.get()>
	//   12   24:getstatic       #51  <Field String TAG>
	//   13   27:ldc1            #154 <String "Handling onExecutionCompleted %s, %s">
	//   14   29:iconst_2        
	//   15   30:anewarray       Object[]
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:aload_1         
	//   19   36:aastore         
	//   20   37:dup             
	//   21   38:iconst_1        
	//   22   39:iload_2         
	//   23   40:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   24   43:aastore         
	//   25   44:invokestatic    #108 <Method String String.format(String, Object[])>
	//   26   47:iconst_0        
	//   27   48:anewarray       Throwable[]
	//   28   51:invokevirtual   #114 <Method void Logger.debug(String, String, Throwable[])>
		onExecuted(s, flag);
	//   29   54:aload_0         
	//   30   55:aload           5
	//   31   57:iload           4
	//   32   59:invokevirtual   #164 <Method void onExecuted(String, boolean)>
	//   33   62:return          
	}

	private void handleReschedule(Intent intent, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
		Logger.get().debug(TAG, String.format("Handling reschedule %s, %s", new Object[] {
			intent, Integer.valueOf(i)
		}), new Throwable[0]);
	//    0    0:invokestatic    #100 <Method Logger Logger.get()>
	//    1    3:getstatic       #51  <Field String TAG>
	//    2    6:ldc1            #167 <String "Handling reschedule %s, %s">
	//    3    8:iconst_2        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_1         
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:iload_2         
	//   12   19:invokestatic    #160 <Method Integer Integer.valueOf(int)>
	//   13   22:aastore         
	//   14   23:invokestatic    #108 <Method String String.format(String, Object[])>
	//   15   26:iconst_0        
	//   16   27:anewarray       Throwable[]
	//   17   30:invokevirtual   #114 <Method void Logger.debug(String, String, Throwable[])>
		systemalarmdispatcher.getWorkManager().rescheduleEligibleWork();
	//   18   33:aload_3         
	//   19   34:invokevirtual   #173 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//   20   37:invokevirtual   #178 <Method void WorkManagerImpl.rescheduleEligibleWork()>
	//   21   40:return          
	}

	private void handleScheduleWorkIntent(Intent intent, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
		String s;
		s = intent.getExtras().getString("KEY_WORKSPEC_ID");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #126 <Method Bundle Intent.getExtras()>
	//    2    4:ldc1            #27  <String "KEY_WORKSPEC_ID">
	//    3    6:invokevirtual   #131 <Method String Bundle.getString(String)>
	//    4    9:astore          6
		Logger.get().debug(TAG, String.format("Handling schedule work for %s", new Object[] {
			s
		}), new Throwable[0]);
	//    5   11:invokestatic    #100 <Method Logger Logger.get()>
	//    6   14:getstatic       #51  <Field String TAG>
	//    7   17:ldc1            #181 <String "Handling schedule work for %s">
	//    8   19:iconst_1        
	//    9   20:anewarray       Object[]
	//   10   23:dup             
	//   11   24:iconst_0        
	//   12   25:aload           6
	//   13   27:aastore         
	//   14   28:invokestatic    #108 <Method String String.format(String, Object[])>
	//   15   31:iconst_0        
	//   16   32:anewarray       Throwable[]
	//   17   35:invokevirtual   #114 <Method void Logger.debug(String, String, Throwable[])>
		intent = ((Intent) (systemalarmdispatcher.getWorkManager().getWorkDatabase()));
	//   18   38:aload_3         
	//   19   39:invokevirtual   #173 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//   20   42:invokevirtual   #185 <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//   21   45:astore_1        
		((WorkDatabase) (intent)).beginTransaction();
	//   22   46:aload_1         
	//   23   47:invokevirtual   #190 <Method void WorkDatabase.beginTransaction()>
		Object obj = ((Object) (((WorkDatabase) (intent)).workSpecDao().getWorkSpec(s)));
	//   24   50:aload_1         
	//   25   51:invokevirtual   #194 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//   26   54:aload           6
	//   27   56:invokeinterface #200 <Method WorkSpec WorkSpecDao.getWorkSpec(String)>
	//   28   61:astore          7
		if(obj != null)
			break MISSING_BLOCK_LABEL_130;
	//   29   63:aload           7
	//   30   65:ifnonnull       130
		systemalarmdispatcher = ((SystemAlarmDispatcher) (Logger.get()));
	//   31   68:invokestatic    #100 <Method Logger Logger.get()>
	//   32   71:astore_3        
		obj = ((Object) (TAG));
	//   33   72:getstatic       #51  <Field String TAG>
	//   34   75:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   35   77:new             #202 <Class StringBuilder>
	//   36   80:dup             
	//   37   81:invokespecial   #203 <Method void StringBuilder()>
	//   38   84:astore          8
		stringbuilder.append("Skipping scheduling ");
	//   39   86:aload           8
	//   40   88:ldc1            #205 <String "Skipping scheduling ">
	//   41   90:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   42   93:pop             
		stringbuilder.append(s);
	//   43   94:aload           8
	//   44   96:aload           6
	//   45   98:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   46  101:pop             
		stringbuilder.append(" because it's no longer in the DB");
	//   47  102:aload           8
	//   48  104:ldc1            #211 <String " because it's no longer in the DB">
	//   49  106:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   50  109:pop             
		((Logger) (systemalarmdispatcher)).warning(((String) (obj)), stringbuilder.toString(), new Throwable[0]);
	//   51  110:aload_3         
	//   52  111:aload           7
	//   53  113:aload           8
	//   54  115:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   55  118:iconst_0        
	//   56  119:anewarray       Throwable[]
	//   57  122:invokevirtual   #218 <Method void Logger.warning(String, String, Throwable[])>
		((WorkDatabase) (intent)).endTransaction();
	//   58  125:aload_1         
	//   59  126:invokevirtual   #221 <Method void WorkDatabase.endTransaction()>
		return;
	//   60  129:return          
		if(((WorkSpec) (obj)).state == androidx.work.WorkInfo.State.ENQUEUED)
			break MISSING_BLOCK_LABEL_203;
	//   61  130:aload           7
	//   62  132:getfield        #227 <Field androidx.work.WorkInfo$State WorkSpec.state>
	//   63  135:getstatic       #232 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//   64  138:if_acmpeq       203
		systemalarmdispatcher = ((SystemAlarmDispatcher) (Logger.get()));
	//   65  141:invokestatic    #100 <Method Logger Logger.get()>
	//   66  144:astore_3        
		obj = ((Object) (TAG));
	//   67  145:getstatic       #51  <Field String TAG>
	//   68  148:astore          7
		StringBuilder stringbuilder1 = new StringBuilder();
	//   69  150:new             #202 <Class StringBuilder>
	//   70  153:dup             
	//   71  154:invokespecial   #203 <Method void StringBuilder()>
	//   72  157:astore          8
		stringbuilder1.append("Skipping scheduling ");
	//   73  159:aload           8
	//   74  161:ldc1            #205 <String "Skipping scheduling ">
	//   75  163:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   76  166:pop             
		stringbuilder1.append(s);
	//   77  167:aload           8
	//   78  169:aload           6
	//   79  171:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   80  174:pop             
		stringbuilder1.append(" because it is no longer enqueued");
	//   81  175:aload           8
	//   82  177:ldc1            #234 <String " because it is no longer enqueued">
	//   83  179:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   84  182:pop             
		((Logger) (systemalarmdispatcher)).warning(((String) (obj)), stringbuilder1.toString(), new Throwable[0]);
	//   85  183:aload_3         
	//   86  184:aload           7
	//   87  186:aload           8
	//   88  188:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   89  191:iconst_0        
	//   90  192:anewarray       Throwable[]
	//   91  195:invokevirtual   #218 <Method void Logger.warning(String, String, Throwable[])>
		((WorkDatabase) (intent)).endTransaction();
	//   92  198:aload_1         
	//   93  199:invokevirtual   #221 <Method void WorkDatabase.endTransaction()>
		return;
	//   94  202:return          
		long l;
		l = ((WorkSpec) (obj)).calculateNextRunTime();
	//   95  203:aload           7
	//   96  205:invokevirtual   #238 <Method long WorkSpec.calculateNextRunTime()>
	//   97  208:lstore          4
		if(!((WorkSpec) (obj)).hasConstraints())
	//*  98  210:aload           7
	//*  99  212:invokevirtual   #242 <Method boolean WorkSpec.hasConstraints()>
	//* 100  215:ifne            263
		{
			Logger.get().debug(TAG, String.format("Setting up Alarms for %s", new Object[] {
				s
			}), new Throwable[0]);
	//  101  218:invokestatic    #100 <Method Logger Logger.get()>
	//  102  221:getstatic       #51  <Field String TAG>
	//  103  224:ldc1            #244 <String "Setting up Alarms for %s">
	//  104  226:iconst_1        
	//  105  227:anewarray       Object[]
	//  106  230:dup             
	//  107  231:iconst_0        
	//  108  232:aload           6
	//  109  234:aastore         
	//  110  235:invokestatic    #108 <Method String String.format(String, Object[])>
	//  111  238:iconst_0        
	//  112  239:anewarray       Throwable[]
	//  113  242:invokevirtual   #114 <Method void Logger.debug(String, String, Throwable[])>
			Alarms.setAlarm(mContext, systemalarmdispatcher.getWorkManager(), s, l);
	//  114  245:aload_0         
	//  115  246:getfield        #59  <Field Context mContext>
	//  116  249:aload_3         
	//  117  250:invokevirtual   #173 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//  118  253:aload           6
	//  119  255:lload           4
	//  120  257:invokestatic    #250 <Method void Alarms.setAlarm(Context, WorkManagerImpl, String, long)>
			break MISSING_BLOCK_LABEL_325;
	//  121  260:goto            325
		}
		Logger.get().debug(TAG, String.format("Opportunistically setting an alarm for %s", new Object[] {
			s
		}), new Throwable[0]);
	//  122  263:invokestatic    #100 <Method Logger Logger.get()>
	//  123  266:getstatic       #51  <Field String TAG>
	//  124  269:ldc1            #252 <String "Opportunistically setting an alarm for %s">
	//  125  271:iconst_1        
	//  126  272:anewarray       Object[]
	//  127  275:dup             
	//  128  276:iconst_0        
	//  129  277:aload           6
	//  130  279:aastore         
	//  131  280:invokestatic    #108 <Method String String.format(String, Object[])>
	//  132  283:iconst_0        
	//  133  284:anewarray       Throwable[]
	//  134  287:invokevirtual   #114 <Method void Logger.debug(String, String, Throwable[])>
		Alarms.setAlarm(mContext, systemalarmdispatcher.getWorkManager(), s, l);
	//  135  290:aload_0         
	//  136  291:getfield        #59  <Field Context mContext>
	//  137  294:aload_3         
	//  138  295:invokevirtual   #173 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//  139  298:aload           6
	//  140  300:lload           4
	//  141  302:invokestatic    #250 <Method void Alarms.setAlarm(Context, WorkManagerImpl, String, long)>
		systemalarmdispatcher.postOnMainThread(((Runnable) (new SystemAlarmDispatcher.AddRunnable(systemalarmdispatcher, createConstraintsChangedIntent(mContext), i))));
	//  142  305:aload_3         
	//  143  306:new             #254 <Class SystemAlarmDispatcher$AddRunnable>
	//  144  309:dup             
	//  145  310:aload_3         
	//  146  311:aload_0         
	//  147  312:getfield        #59  <Field Context mContext>
	//  148  315:invokestatic    #256 <Method Intent createConstraintsChangedIntent(Context)>
	//  149  318:iload_2         
	//  150  319:invokespecial   #259 <Method void SystemAlarmDispatcher$AddRunnable(SystemAlarmDispatcher, Intent, int)>
	//  151  322:invokevirtual   #263 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
		((WorkDatabase) (intent)).setTransactionSuccessful();
	//  152  325:aload_1         
	//  153  326:invokevirtual   #266 <Method void WorkDatabase.setTransactionSuccessful()>
		((WorkDatabase) (intent)).endTransaction();
	//  154  329:aload_1         
	//  155  330:invokevirtual   #221 <Method void WorkDatabase.endTransaction()>
		return;
	//  156  333:return          
		systemalarmdispatcher;
	//  157  334:astore_3        
		((WorkDatabase) (intent)).endTransaction();
	//  158  335:aload_1         
	//  159  336:invokevirtual   #221 <Method void WorkDatabase.endTransaction()>
		throw systemalarmdispatcher;
	//  160  339:aload_3         
	//  161  340:athrow          
	}

	private void handleStopWork(Intent intent, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
		intent = ((Intent) (intent.getExtras().getString("KEY_WORKSPEC_ID")));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #126 <Method Bundle Intent.getExtras()>
	//    2    4:ldc1            #27  <String "KEY_WORKSPEC_ID">
	//    3    6:invokevirtual   #131 <Method String Bundle.getString(String)>
	//    4    9:astore_1        
		Logger.get().debug(TAG, String.format("Handing stopWork work for %s", new Object[] {
			intent
		}), new Throwable[0]);
	//    5   10:invokestatic    #100 <Method Logger Logger.get()>
	//    6   13:getstatic       #51  <Field String TAG>
	//    7   16:ldc2            #269 <String "Handing stopWork work for %s">
	//    8   19:iconst_1        
	//    9   20:anewarray       Object[]
	//   10   23:dup             
	//   11   24:iconst_0        
	//   12   25:aload_1         
	//   13   26:aastore         
	//   14   27:invokestatic    #108 <Method String String.format(String, Object[])>
	//   15   30:iconst_0        
	//   16   31:anewarray       Throwable[]
	//   17   34:invokevirtual   #114 <Method void Logger.debug(String, String, Throwable[])>
		systemalarmdispatcher.getWorkManager().stopWork(((String) (intent)));
	//   18   37:aload_3         
	//   19   38:invokevirtual   #173 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//   20   41:aload_1         
	//   21   42:invokevirtual   #273 <Method void WorkManagerImpl.stopWork(String)>
		Alarms.cancelAlarm(mContext, systemalarmdispatcher.getWorkManager(), ((String) (intent)));
	//   22   45:aload_0         
	//   23   46:getfield        #59  <Field Context mContext>
	//   24   49:aload_3         
	//   25   50:invokevirtual   #173 <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//   26   53:aload_1         
	//   27   54:invokestatic    #277 <Method void Alarms.cancelAlarm(Context, WorkManagerImpl, String)>
		systemalarmdispatcher.onExecuted(((String) (intent)), false);
	//   28   57:aload_3         
	//   29   58:aload_1         
	//   30   59:iconst_0        
	//   31   60:invokevirtual   #278 <Method void SystemAlarmDispatcher.onExecuted(String, boolean)>
	//   32   63:return          
	}

	private static transient boolean hasKeys(Bundle bundle, String as[])
	{
		if(bundle != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          44
		{
			if(bundle.isEmpty())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #284 <Method boolean Bundle.isEmpty()>
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
	//*  19   27:invokevirtual   #287 <Method Object Bundle.get(String)>
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
	//    1    1:getfield        #66  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(!mPendingDelayMet.isEmpty())
	//*   5    7:aload_0         
	//*   6    8:getfield        #64  <Field Map mPendingDelayMet>
	//*   7   11:invokeinterface #289 <Method boolean Map.isEmpty()>
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
	//    1    1:getfield        #66  <Field Object mLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		ExecutionListener executionlistener = (ExecutionListener)mPendingDelayMet.remove(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #64  <Field Map mPendingDelayMet>
	//    7   11:aload_1         
	//    8   12:invokeinterface #293 <Method Object Map.remove(Object)>
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
	//   16   31:invokeinterface #294 <Method void ExecutionListener.onExecuted(String, boolean)>
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
	//    1    1:invokevirtual   #299 <Method String Intent.getAction()>
	//    2    4:astore          4
		if("ACTION_CONSTRAINTS_CHANGED".equals(((Object) (s))))
	//*   3    6:ldc1            #13  <String "ACTION_CONSTRAINTS_CHANGED">
	//*   4    8:aload           4
	//*   5   10:invokevirtual   #303 <Method boolean String.equals(Object)>
	//*   6   13:ifeq            24
		{
			handleConstraintsChanged(intent, i, systemalarmdispatcher);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:iload_2         
	//   10   19:aload_3         
	//   11   20:invokespecial   #305 <Method void handleConstraintsChanged(Intent, int, SystemAlarmDispatcher)>
			return;
	//   12   23:return          
		}
		if("ACTION_RESCHEDULE".equals(((Object) (s))))
	//*  13   24:ldc1            #19  <String "ACTION_RESCHEDULE">
	//*  14   26:aload           4
	//*  15   28:invokevirtual   #303 <Method boolean String.equals(Object)>
	//*  16   31:ifeq            42
		{
			handleReschedule(intent, i, systemalarmdispatcher);
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:iload_2         
	//   20   37:aload_3         
	//   21   38:invokespecial   #307 <Method void handleReschedule(Intent, int, SystemAlarmDispatcher)>
			return;
	//   22   41:return          
		}
		if(!hasKeys(intent.getExtras(), new String[] {
	"KEY_WORKSPEC_ID"
}))
	//*  23   42:aload_1         
	//*  24   43:invokevirtual   #126 <Method Bundle Intent.getExtras()>
	//*  25   46:iconst_1        
	//*  26   47:anewarray       String[]
	//*  27   50:dup             
	//*  28   51:iconst_0        
	//*  29   52:ldc1            #27  <String "KEY_WORKSPEC_ID">
	//*  30   54:aastore         
	//*  31   55:invokestatic    #309 <Method boolean hasKeys(Bundle, String[])>
	//*  32   58:ifne            95
		{
			Logger.get().error(TAG, String.format("Invalid request for %s, requires %s.", new Object[] {
				s, "KEY_WORKSPEC_ID"
			}), new Throwable[0]);
	//   33   61:invokestatic    #100 <Method Logger Logger.get()>
	//   34   64:getstatic       #51  <Field String TAG>
	//   35   67:ldc2            #311 <String "Invalid request for %s, requires %s.">
	//   36   70:iconst_2        
	//   37   71:anewarray       Object[]
	//   38   74:dup             
	//   39   75:iconst_0        
	//   40   76:aload           4
	//   41   78:aastore         
	//   42   79:dup             
	//   43   80:iconst_1        
	//   44   81:ldc1            #27  <String "KEY_WORKSPEC_ID">
	//   45   83:aastore         
	//   46   84:invokestatic    #108 <Method String String.format(String, Object[])>
	//   47   87:iconst_0        
	//   48   88:anewarray       Throwable[]
	//   49   91:invokevirtual   #314 <Method void Logger.error(String, String, Throwable[])>
			return;
	//   50   94:return          
		}
		if("ACTION_SCHEDULE_WORK".equals(((Object) (s))))
	//*  51   95:ldc1            #21  <String "ACTION_SCHEDULE_WORK">
	//*  52   97:aload           4
	//*  53   99:invokevirtual   #303 <Method boolean String.equals(Object)>
	//*  54  102:ifeq            113
		{
			handleScheduleWorkIntent(intent, i, systemalarmdispatcher);
	//   55  105:aload_0         
	//   56  106:aload_1         
	//   57  107:iload_2         
	//   58  108:aload_3         
	//   59  109:invokespecial   #316 <Method void handleScheduleWorkIntent(Intent, int, SystemAlarmDispatcher)>
			return;
	//   60  112:return          
		}
		if("ACTION_DELAY_MET".equals(((Object) (s))))
	//*  61  113:ldc1            #15  <String "ACTION_DELAY_MET">
	//*  62  115:aload           4
	//*  63  117:invokevirtual   #303 <Method boolean String.equals(Object)>
	//*  64  120:ifeq            131
		{
			handleDelayMet(intent, i, systemalarmdispatcher);
	//   65  123:aload_0         
	//   66  124:aload_1         
	//   67  125:iload_2         
	//   68  126:aload_3         
	//   69  127:invokespecial   #318 <Method void handleDelayMet(Intent, int, SystemAlarmDispatcher)>
			return;
	//   70  130:return          
		}
		if("ACTION_STOP_WORK".equals(((Object) (s))))
	//*  71  131:ldc1            #23  <String "ACTION_STOP_WORK">
	//*  72  133:aload           4
	//*  73  135:invokevirtual   #303 <Method boolean String.equals(Object)>
	//*  74  138:ifeq            149
		{
			handleStopWork(intent, i, systemalarmdispatcher);
	//   75  141:aload_0         
	//   76  142:aload_1         
	//   77  143:iload_2         
	//   78  144:aload_3         
	//   79  145:invokespecial   #320 <Method void handleStopWork(Intent, int, SystemAlarmDispatcher)>
			return;
	//   80  148:return          
		}
		if("ACTION_EXECUTION_COMPLETED".equals(((Object) (s))))
	//*  81  149:ldc1            #17  <String "ACTION_EXECUTION_COMPLETED">
	//*  82  151:aload           4
	//*  83  153:invokevirtual   #303 <Method boolean String.equals(Object)>
	//*  84  156:ifeq            167
		{
			handleExecutionCompleted(intent, i, systemalarmdispatcher);
	//   85  159:aload_0         
	//   86  160:aload_1         
	//   87  161:iload_2         
	//   88  162:aload_3         
	//   89  163:invokespecial   #322 <Method void handleExecutionCompleted(Intent, int, SystemAlarmDispatcher)>
			return;
	//   90  166:return          
		} else
		{
			Logger.get().warning(TAG, String.format("Ignoring intent %s", new Object[] {
				intent
			}), new Throwable[0]);
	//   91  167:invokestatic    #100 <Method Logger Logger.get()>
	//   92  170:getstatic       #51  <Field String TAG>
	//   93  173:ldc2            #324 <String "Ignoring intent %s">
	//   94  176:iconst_1        
	//   95  177:anewarray       Object[]
	//   96  180:dup             
	//   97  181:iconst_0        
	//   98  182:aload_1         
	//   99  183:aastore         
	//  100  184:invokestatic    #108 <Method String String.format(String, Object[])>
	//  101  187:iconst_0        
	//  102  188:anewarray       Throwable[]
	//  103  191:invokevirtual   #218 <Method void Logger.warning(String, String, Throwable[])>
			return;
	//  104  194:return          
		}
	}

	static final String ACTION_CONSTRAINTS_CHANGED = "ACTION_CONSTRAINTS_CHANGED";
	static final String ACTION_DELAY_MET = "ACTION_DELAY_MET";
	static final String ACTION_EXECUTION_COMPLETED = "ACTION_EXECUTION_COMPLETED";
	static final String ACTION_RESCHEDULE = "ACTION_RESCHEDULE";
	static final String ACTION_SCHEDULE_WORK = "ACTION_SCHEDULE_WORK";
	static final String ACTION_STOP_WORK = "ACTION_STOP_WORK";
	private static final String KEY_NEEDS_RESCHEDULE = "KEY_NEEDS_RESCHEDULE";
	private static final String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
	private static final String TAG = Logger.tagWithPrefix("CommandHandler");
	static final long WORK_PROCESSING_TIME_IN_MS = 0x927c0L;
	private final Context mContext;
	private final Object mLock = new Object();
	private final Map mPendingDelayMet = new HashMap();

	static 
	{
	//    0    0:ldc1            #43  <String "CommandHandler">
	//    1    2:invokestatic    #49  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #51  <Field String TAG>
	//*   3    8:return          
	}
}
