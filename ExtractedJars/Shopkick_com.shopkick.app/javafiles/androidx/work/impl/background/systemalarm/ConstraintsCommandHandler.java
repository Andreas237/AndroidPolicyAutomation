// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.*;

// Referenced classes of package androidx.work.impl.background.systemalarm:
//			SystemAlarmDispatcher, ConstraintProxy, CommandHandler

class ConstraintsCommandHandler
{

	ConstraintsCommandHandler(Context context, int i, SystemAlarmDispatcher systemalarmdispatcher)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field Context mContext>
		mStartId = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #40  <Field int mStartId>
		mDispatcher = systemalarmdispatcher;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #42  <Field SystemAlarmDispatcher mDispatcher>
		mWorkConstraintsTracker = new WorkConstraintsTracker(mContext, ((androidx.work.impl.constraints.WorkConstraintsCallback) (null)));
	//   11   19:aload_0         
	//   12   20:new             #44  <Class WorkConstraintsTracker>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:getfield        #38  <Field Context mContext>
	//   16   28:aconst_null     
	//   17   29:invokespecial   #47  <Method void WorkConstraintsTracker(Context, androidx.work.impl.constraints.WorkConstraintsCallback)>
	//   18   32:putfield        #49  <Field WorkConstraintsTracker mWorkConstraintsTracker>
	//   19   35:return          
	}

	void handleConstraintsChanged()
	{
		int i = mDispatcher.getWorkManager().getConfiguration().getMaxSchedulerLimit();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SystemAlarmDispatcher mDispatcher>
	//    2    4:invokevirtual   #58  <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//    3    7:invokevirtual   #64  <Method Configuration WorkManagerImpl.getConfiguration()>
	//    4   10:invokevirtual   #70  <Method int Configuration.getMaxSchedulerLimit()>
	//    5   13:istore_1        
		Object obj1 = ((Object) (mDispatcher.getWorkManager().getWorkDatabase().workSpecDao().getEligibleWorkForScheduling(i)));
	//    6   14:aload_0         
	//    7   15:getfield        #42  <Field SystemAlarmDispatcher mDispatcher>
	//    8   18:invokevirtual   #58  <Method WorkManagerImpl SystemAlarmDispatcher.getWorkManager()>
	//    9   21:invokevirtual   #74  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//   10   24:invokevirtual   #80  <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//   11   27:iload_1         
	//   12   28:invokeinterface #86  <Method List WorkSpecDao.getEligibleWorkForScheduling(int)>
	//   13   33:astore          5
		ConstraintProxy.updateAll(mContext, ((List) (obj1)));
	//   14   35:aload_0         
	//   15   36:getfield        #38  <Field Context mContext>
	//   16   39:aload           5
	//   17   41:invokestatic    #92  <Method void ConstraintProxy.updateAll(Context, List)>
		mWorkConstraintsTracker.replace(((List) (obj1)));
	//   18   44:aload_0         
	//   19   45:getfield        #49  <Field WorkConstraintsTracker mWorkConstraintsTracker>
	//   20   48:aload           5
	//   21   50:invokevirtual   #96  <Method void WorkConstraintsTracker.replace(List)>
		Object obj = ((Object) (new ArrayList(((List) (obj1)).size())));
	//   22   53:new             #98  <Class ArrayList>
	//   23   56:dup             
	//   24   57:aload           5
	//   25   59:invokeinterface #103 <Method int List.size()>
	//   26   64:invokespecial   #106 <Method void ArrayList(int)>
	//   27   67:astore          4
		long l = System.currentTimeMillis();
	//   28   69:invokestatic    #112 <Method long System.currentTimeMillis()>
	//   29   72:lstore_2        
		obj1 = ((Object) (((List) (obj1)).iterator()));
	//   30   73:aload           5
	//   31   75:invokeinterface #116 <Method Iterator List.iterator()>
	//   32   80:astore          5
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   33   82:aload           5
	//   34   84:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//   35   89:ifeq            154
			WorkSpec workspec = (WorkSpec)((Iterator) (obj1)).next();
	//   36   92:aload           5
	//   37   94:invokeinterface #126 <Method Object Iterator.next()>
	//   38   99:checkcast       #128 <Class WorkSpec>
	//   39  102:astore          6
			String s = workspec.id;
	//   40  104:aload           6
	//   41  106:getfield        #131 <Field String WorkSpec.id>
	//   42  109:astore          7
			if(l >= workspec.calculateNextRunTime() && (!workspec.hasConstraints() || mWorkConstraintsTracker.areAllConstraintsMet(s)))
	//*  43  111:lload_2         
	//*  44  112:aload           6
	//*  45  114:invokevirtual   #134 <Method long WorkSpec.calculateNextRunTime()>
	//*  46  117:lcmp            
	//*  47  118:iflt            82
	//*  48  121:aload           6
	//*  49  123:invokevirtual   #137 <Method boolean WorkSpec.hasConstraints()>
	//*  50  126:ifeq            141
	//*  51  129:aload_0         
	//*  52  130:getfield        #49  <Field WorkConstraintsTracker mWorkConstraintsTracker>
	//*  53  133:aload           7
	//*  54  135:invokevirtual   #141 <Method boolean WorkConstraintsTracker.areAllConstraintsMet(String)>
	//*  55  138:ifeq            82
				((List) (obj)).add(((Object) (workspec)));
	//   56  141:aload           4
	//   57  143:aload           6
	//   58  145:invokeinterface #145 <Method boolean List.add(Object)>
	//   59  150:pop             
		} while(true);
	//   60  151:goto            82
		android.content.Intent intent;
		Object obj2;
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((SystemAlarmDispatcher) (obj2)).postOnMainThread(((Runnable) (new SystemAlarmDispatcher.AddRunnable(((SystemAlarmDispatcher) (obj2)), intent, mStartId)))))
	//*  61  154:aload           4
	//*  62  156:invokeinterface #116 <Method Iterator List.iterator()>
	//*  63  161:astore          4
	//*  64  163:aload           4
	//*  65  165:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//*  66  170:ifeq            255
		{
			obj2 = ((Object) (((WorkSpec)((Iterator) (obj)).next()).id));
	//   67  173:aload           4
	//   68  175:invokeinterface #126 <Method Object Iterator.next()>
	//   69  180:checkcast       #128 <Class WorkSpec>
	//   70  183:getfield        #131 <Field String WorkSpec.id>
	//   71  186:astore          6
			intent = CommandHandler.createDelayMetIntent(mContext, ((String) (obj2)));
	//   72  188:aload_0         
	//   73  189:getfield        #38  <Field Context mContext>
	//   74  192:aload           6
	//   75  194:invokestatic    #151 <Method android.content.Intent CommandHandler.createDelayMetIntent(Context, String)>
	//   76  197:astore          5
			Logger.get().debug(TAG, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[] {
				obj2
			}), new Throwable[0]);
	//   77  199:invokestatic    #155 <Method Logger Logger.get()>
	//   78  202:getstatic       #30  <Field String TAG>
	//   79  205:ldc1            #157 <String "Creating a delay_met command for workSpec with id (%s)">
	//   80  207:iconst_1        
	//   81  208:anewarray       Object[]
	//   82  211:dup             
	//   83  212:iconst_0        
	//   84  213:aload           6
	//   85  215:aastore         
	//   86  216:invokestatic    #163 <Method String String.format(String, Object[])>
	//   87  219:iconst_0        
	//   88  220:anewarray       Throwable[]
	//   89  223:invokevirtual   #169 <Method void Logger.debug(String, String, Throwable[])>
			obj2 = ((Object) (mDispatcher));
	//   90  226:aload_0         
	//   91  227:getfield        #42  <Field SystemAlarmDispatcher mDispatcher>
	//   92  230:astore          6
		}

	//   93  232:aload           6
	//   94  234:new             #171 <Class SystemAlarmDispatcher$AddRunnable>
	//   95  237:dup             
	//   96  238:aload           6
	//   97  240:aload           5
	//   98  242:aload_0         
	//   99  243:getfield        #40  <Field int mStartId>
	//  100  246:invokespecial   #174 <Method void SystemAlarmDispatcher$AddRunnable(SystemAlarmDispatcher, android.content.Intent, int)>
	//  101  249:invokevirtual   #178 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
	//* 102  252:goto            163
		mWorkConstraintsTracker.reset();
	//  103  255:aload_0         
	//  104  256:getfield        #49  <Field WorkConstraintsTracker mWorkConstraintsTracker>
	//  105  259:invokevirtual   #181 <Method void WorkConstraintsTracker.reset()>
	//  106  262:return          
	}

	private static final String TAG = Logger.tagWithPrefix("ConstraintsCmdHandler");
	private final Context mContext;
	private final SystemAlarmDispatcher mDispatcher;
	private final int mStartId;
	private final WorkConstraintsTracker mWorkConstraintsTracker;

	static 
	{
	//    0    0:ldc1            #22  <String "ConstraintsCmdHandler">
	//    1    2:invokestatic    #28  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #30  <Field String TAG>
	//*   3    8:return          
	}
}
