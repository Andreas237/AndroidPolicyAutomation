// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import androidx.work.Operation;
import androidx.work.impl.*;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.*;

// Referenced classes of package androidx.work.impl.utils:
//			Preferences

public abstract class CancelWorkRunnable
	implements Runnable
{

	public CancelWorkRunnable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class OperationImpl>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void OperationImpl()>
	//    6   12:putfield        #29  <Field OperationImpl mOperation>
	//    7   15:return          
	}

	public static CancelWorkRunnable forAll(WorkManagerImpl workmanagerimpl)
	{
		return ((CancelWorkRunnable) (new CancelWorkRunnable(workmanagerimpl) {

			void runInternal()
			{
				WorkDatabase workdatabase;
				workdatabase = workManagerImpl.getWorkDatabase();
			//    0    0:aload_0         
			//    1    1:getfield        #13  <Field WorkManagerImpl val$workManagerImpl>
			//    2    4:invokevirtual   #25  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
			//    3    7:astore_1        
				workdatabase.beginTransaction();
			//    4    8:aload_1         
			//    5    9:invokevirtual   #30  <Method void WorkDatabase.beginTransaction()>
				String s;
				for(Iterator iterator = workdatabase.workSpecDao().getAllUnfinishedWork().iterator(); iterator.hasNext(); cancel(workManagerImpl, s))
			//*   6   12:aload_1         
			//*   7   13:invokevirtual   #34  <Method WorkSpecDao WorkDatabase.workSpecDao()>
			//*   8   16:invokeinterface #40  <Method List WorkSpecDao.getAllUnfinishedWork()>
			//*   9   21:invokeinterface #46  <Method Iterator List.iterator()>
			//*  10   26:astore_2        
			//*  11   27:aload_2         
			//*  12   28:invokeinterface #52  <Method boolean Iterator.hasNext()>
			//*  13   33:ifeq            58
					s = (String)iterator.next();
			//   14   36:aload_2         
			//   15   37:invokeinterface #56  <Method Object Iterator.next()>
			//   16   42:checkcast       #58  <Class String>
			//   17   45:astore_3        

			//   18   46:aload_0         
			//   19   47:aload_0         
			//   20   48:getfield        #13  <Field WorkManagerImpl val$workManagerImpl>
			//   21   51:aload_3         
			//   22   52:invokevirtual   #62  <Method void cancel(WorkManagerImpl, String)>
			//*  23   55:goto            27
				workdatabase.setTransactionSuccessful();
			//   24   58:aload_1         
			//   25   59:invokevirtual   #65  <Method void WorkDatabase.setTransactionSuccessful()>
				(new Preferences(workManagerImpl.getApplicationContext())).setLastCancelAllTimeMillis(System.currentTimeMillis());
			//   26   62:new             #67  <Class Preferences>
			//   27   65:dup             
			//   28   66:aload_0         
			//   29   67:getfield        #13  <Field WorkManagerImpl val$workManagerImpl>
			//   30   70:invokevirtual   #71  <Method android.content.Context WorkManagerImpl.getApplicationContext()>
			//   31   73:invokespecial   #74  <Method void Preferences(android.content.Context)>
			//   32   76:invokestatic    #80  <Method long System.currentTimeMillis()>
			//   33   79:invokevirtual   #84  <Method void Preferences.setLastCancelAllTimeMillis(long)>
				workdatabase.endTransaction();
			//   34   82:aload_1         
			//   35   83:invokevirtual   #87  <Method void WorkDatabase.endTransaction()>
				return;
			//   36   86:return          
				Exception exception;
				exception;
			//   37   87:astore_2        
				workdatabase.endTransaction();
			//   38   88:aload_1         
			//   39   89:invokevirtual   #87  <Method void WorkDatabase.endTransaction()>
				throw exception;
			//   40   92:aload_2         
			//   41   93:athrow          
			}

			final WorkManagerImpl val$workManagerImpl;

			
			{
				workManagerImpl = workmanagerimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #13  <Field WorkManagerImpl val$workManagerImpl>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #16  <Method void CancelWorkRunnable()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #14  <Class CancelWorkRunnable$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void CancelWorkRunnable$4(WorkManagerImpl)>
	//    4    8:areturn         
	}

	public static CancelWorkRunnable forId(UUID uuid, WorkManagerImpl workmanagerimpl)
	{
		return ((CancelWorkRunnable) (new CancelWorkRunnable(workmanagerimpl, uuid) {

			void runInternal()
			{
				cancel(workManagerImpl, id.toString());
			//    0    0:aload_0         
			//    1    1:aload_0         
			//    2    2:getfield        #15  <Field WorkManagerImpl val$workManagerImpl>
			//    3    5:aload_0         
			//    4    6:getfield        #17  <Field UUID val$id>
			//    5    9:invokevirtual   #29  <Method String UUID.toString()>
			//    6   12:invokevirtual   #33  <Method void cancel(WorkManagerImpl, String)>
				reschedulePendingWorkers(workManagerImpl);
			//    7   15:aload_0         
			//    8   16:aload_0         
			//    9   17:getfield        #15  <Field WorkManagerImpl val$workManagerImpl>
			//   10   20:invokevirtual   #37  <Method void reschedulePendingWorkers(WorkManagerImpl)>
			//   11   23:return          
			}

			final UUID val$id;
			final WorkManagerImpl val$workManagerImpl;

			
			{
				workManagerImpl = workmanagerimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WorkManagerImpl val$workManagerImpl>
				id = uuid;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #17  <Field UUID val$id>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #20  <Method void CancelWorkRunnable()>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #8   <Class CancelWorkRunnable$1>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokespecial   #42  <Method void CancelWorkRunnable$1(WorkManagerImpl, UUID)>
	//    5    9:areturn         
	}

	public static CancelWorkRunnable forName(String s, WorkManagerImpl workmanagerimpl, boolean flag)
	{
		return ((CancelWorkRunnable) (new CancelWorkRunnable(workmanagerimpl, s, flag) {

			void runInternal()
			{
				WorkDatabase workdatabase;
				workdatabase = workManagerImpl.getWorkDatabase();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field WorkManagerImpl val$workManagerImpl>
			//    2    4:invokevirtual   #33  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
			//    3    7:astore_1        
				workdatabase.beginTransaction();
			//    4    8:aload_1         
			//    5    9:invokevirtual   #38  <Method void WorkDatabase.beginTransaction()>
				String s1;
				for(Iterator iterator = workdatabase.workSpecDao().getUnfinishedWorkWithName(name).iterator(); iterator.hasNext(); cancel(workManagerImpl, s1))
			//*   6   12:aload_1         
			//*   7   13:invokevirtual   #42  <Method WorkSpecDao WorkDatabase.workSpecDao()>
			//*   8   16:aload_0         
			//*   9   17:getfield        #19  <Field String val$name>
			//*  10   20:invokeinterface #48  <Method List WorkSpecDao.getUnfinishedWorkWithName(String)>
			//*  11   25:invokeinterface #54  <Method Iterator List.iterator()>
			//*  12   30:astore_2        
			//*  13   31:aload_2         
			//*  14   32:invokeinterface #60  <Method boolean Iterator.hasNext()>
			//*  15   37:ifeq            62
					s1 = (String)iterator.next();
			//   16   40:aload_2         
			//   17   41:invokeinterface #64  <Method Object Iterator.next()>
			//   18   46:checkcast       #66  <Class String>
			//   19   49:astore_3        

			//   20   50:aload_0         
			//   21   51:aload_0         
			//   22   52:getfield        #17  <Field WorkManagerImpl val$workManagerImpl>
			//   23   55:aload_3         
			//   24   56:invokevirtual   #70  <Method void cancel(WorkManagerImpl, String)>
			//*  25   59:goto            31
				workdatabase.setTransactionSuccessful();
			//   26   62:aload_1         
			//   27   63:invokevirtual   #73  <Method void WorkDatabase.setTransactionSuccessful()>
				workdatabase.endTransaction();
			//   28   66:aload_1         
			//   29   67:invokevirtual   #76  <Method void WorkDatabase.endTransaction()>
				if(allowReschedule)
			//*  30   70:aload_0         
			//*  31   71:getfield        #21  <Field boolean val$allowReschedule>
			//*  32   74:ifeq            85
					reschedulePendingWorkers(workManagerImpl);
			//   33   77:aload_0         
			//   34   78:aload_0         
			//   35   79:getfield        #17  <Field WorkManagerImpl val$workManagerImpl>
			//   36   82:invokevirtual   #80  <Method void reschedulePendingWorkers(WorkManagerImpl)>
				return;
			//   37   85:return          
				Exception exception;
				exception;
			//   38   86:astore_2        
				workdatabase.endTransaction();
			//   39   87:aload_1         
			//   40   88:invokevirtual   #76  <Method void WorkDatabase.endTransaction()>
				throw exception;
			//   41   91:aload_2         
			//   42   92:athrow          
			}

			final boolean val$allowReschedule;
			final String val$name;
			final WorkManagerImpl val$workManagerImpl;

			
			{
				workManagerImpl = workmanagerimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WorkManagerImpl val$workManagerImpl>
				name = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field String val$name>
				allowReschedule = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #21  <Field boolean val$allowReschedule>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #24  <Method void CancelWorkRunnable()>
			//   11   19:return          
			}
		}
));
	//    0    0:new             #12  <Class CancelWorkRunnable$3>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #47  <Method void CancelWorkRunnable$3(WorkManagerImpl, String, boolean)>
	//    6   10:areturn         
	}

	public static CancelWorkRunnable forTag(String s, WorkManagerImpl workmanagerimpl)
	{
		return ((CancelWorkRunnable) (new CancelWorkRunnable(workmanagerimpl, s) {

			void runInternal()
			{
				WorkDatabase workdatabase;
				workdatabase = workManagerImpl.getWorkDatabase();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field WorkManagerImpl val$workManagerImpl>
			//    2    4:invokevirtual   #29  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
			//    3    7:astore_1        
				workdatabase.beginTransaction();
			//    4    8:aload_1         
			//    5    9:invokevirtual   #34  <Method void WorkDatabase.beginTransaction()>
				String s1;
				for(Iterator iterator = workdatabase.workSpecDao().getUnfinishedWorkWithTag(tag).iterator(); iterator.hasNext(); cancel(workManagerImpl, s1))
			//*   6   12:aload_1         
			//*   7   13:invokevirtual   #38  <Method WorkSpecDao WorkDatabase.workSpecDao()>
			//*   8   16:aload_0         
			//*   9   17:getfield        #17  <Field String val$tag>
			//*  10   20:invokeinterface #44  <Method List WorkSpecDao.getUnfinishedWorkWithTag(String)>
			//*  11   25:invokeinterface #50  <Method Iterator List.iterator()>
			//*  12   30:astore_2        
			//*  13   31:aload_2         
			//*  14   32:invokeinterface #56  <Method boolean Iterator.hasNext()>
			//*  15   37:ifeq            62
					s1 = (String)iterator.next();
			//   16   40:aload_2         
			//   17   41:invokeinterface #60  <Method Object Iterator.next()>
			//   18   46:checkcast       #62  <Class String>
			//   19   49:astore_3        

			//   20   50:aload_0         
			//   21   51:aload_0         
			//   22   52:getfield        #15  <Field WorkManagerImpl val$workManagerImpl>
			//   23   55:aload_3         
			//   24   56:invokevirtual   #65  <Method void cancel(WorkManagerImpl, String)>
			//*  25   59:goto            31
				workdatabase.setTransactionSuccessful();
			//   26   62:aload_1         
			//   27   63:invokevirtual   #68  <Method void WorkDatabase.setTransactionSuccessful()>
				workdatabase.endTransaction();
			//   28   66:aload_1         
			//   29   67:invokevirtual   #71  <Method void WorkDatabase.endTransaction()>
				reschedulePendingWorkers(workManagerImpl);
			//   30   70:aload_0         
			//   31   71:aload_0         
			//   32   72:getfield        #15  <Field WorkManagerImpl val$workManagerImpl>
			//   33   75:invokevirtual   #75  <Method void reschedulePendingWorkers(WorkManagerImpl)>
				return;
			//   34   78:return          
				Exception exception;
				exception;
			//   35   79:astore_2        
				workdatabase.endTransaction();
			//   36   80:aload_1         
			//   37   81:invokevirtual   #71  <Method void WorkDatabase.endTransaction()>
				throw exception;
			//   38   84:aload_2         
			//   39   85:athrow          
			}

			final String val$tag;
			final WorkManagerImpl val$workManagerImpl;

			
			{
				workManagerImpl = workmanagerimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WorkManagerImpl val$workManagerImpl>
				tag = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #17  <Field String val$tag>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #20  <Method void CancelWorkRunnable()>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #10  <Class CancelWorkRunnable$2>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokespecial   #52  <Method void CancelWorkRunnable$2(WorkManagerImpl, String)>
	//    5    9:areturn         
	}

	private void recursivelyCancelWorkAndDependents(WorkDatabase workdatabase, String s)
	{
		WorkSpecDao workspecdao = workdatabase.workSpecDao();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #60  <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    2    4:astore_3        
		for(Iterator iterator = workdatabase.dependencyDao().getDependentWorkIds(s).iterator(); iterator.hasNext(); recursivelyCancelWorkAndDependents(workdatabase, (String)iterator.next()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #64  <Method DependencyDao WorkDatabase.dependencyDao()>
	//    5    9:aload_2         
	//    6   10:invokeinterface #70  <Method List DependencyDao.getDependentWorkIds(String)>
	//    7   15:invokeinterface #76  <Method Iterator List.iterator()>
	//    8   20:astore          4
	//    9   22:aload           4
	//   10   24:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//   11   29:ifeq            50
	//   12   32:aload_0         
	//   13   33:aload_1         
	//   14   34:aload           4
	//   15   36:invokeinterface #86  <Method Object Iterator.next()>
	//   16   41:checkcast       #88  <Class String>
	//   17   44:invokespecial   #90  <Method void recursivelyCancelWorkAndDependents(WorkDatabase, String)>
	//*  18   47:goto            22
		workdatabase = ((WorkDatabase) (workspecdao.getState(s)));
	//   19   50:aload_3         
	//   20   51:aload_2         
	//   21   52:invokeinterface #96  <Method androidx.work.WorkInfo$State WorkSpecDao.getState(String)>
	//   22   57:astore_1        
		if(workdatabase != androidx.work.WorkInfo.State.SUCCEEDED && workdatabase != androidx.work.WorkInfo.State.FAILED)
	//*  23   58:aload_1         
	//*  24   59:getstatic       #102 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.SUCCEEDED>
	//*  25   62:if_acmpeq       90
	//*  26   65:aload_1         
	//*  27   66:getstatic       #105 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.FAILED>
	//*  28   69:if_acmpeq       90
			workspecdao.setState(androidx.work.WorkInfo.State.CANCELLED, new String[] {
				s
			});
	//   29   72:aload_3         
	//   30   73:getstatic       #108 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.CANCELLED>
	//   31   76:iconst_1        
	//   32   77:anewarray       String[]
	//   33   80:dup             
	//   34   81:iconst_0        
	//   35   82:aload_2         
	//   36   83:aastore         
	//   37   84:invokeinterface #112 <Method int WorkSpecDao.setState(androidx.work.WorkInfo$State, String[])>
	//   38   89:pop             
	//   39   90:return          
	}

	void cancel(WorkManagerImpl workmanagerimpl, String s)
	{
		recursivelyCancelWorkAndDependents(workmanagerimpl.getWorkDatabase(), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #119 <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    3    5:aload_2         
	//    4    6:invokespecial   #90  <Method void recursivelyCancelWorkAndDependents(WorkDatabase, String)>
		workmanagerimpl.getProcessor().stopAndCancelWork(s);
	//    5    9:aload_1         
	//    6   10:invokevirtual   #123 <Method Processor WorkManagerImpl.getProcessor()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #129 <Method boolean Processor.stopAndCancelWork(String)>
	//    9   17:pop             
		for(workmanagerimpl = ((WorkManagerImpl) (workmanagerimpl.getSchedulers().iterator())); ((Iterator) (workmanagerimpl)).hasNext(); ((Scheduler)((Iterator) (workmanagerimpl)).next()).cancel(s));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #133 <Method List WorkManagerImpl.getSchedulers()>
	//   12   22:invokeinterface #76  <Method Iterator List.iterator()>
	//   13   27:astore_1        
	//   14   28:aload_1         
	//   15   29:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//   16   34:ifeq            55
	//   17   37:aload_1         
	//   18   38:invokeinterface #86  <Method Object Iterator.next()>
	//   19   43:checkcast       #135 <Class Scheduler>
	//   20   46:aload_2         
	//   21   47:invokeinterface #138 <Method void Scheduler.cancel(String)>
	//*  22   52:goto            28
	//   23   55:return          
	}

	public Operation getOperation()
	{
		return ((Operation) (mOperation));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field OperationImpl mOperation>
	//    2    4:areturn         
	}

	void reschedulePendingWorkers(WorkManagerImpl workmanagerimpl)
	{
		Schedulers.schedule(workmanagerimpl.getConfiguration(), workmanagerimpl.getWorkDatabase(), workmanagerimpl.getSchedulers());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #145 <Method androidx.work.Configuration WorkManagerImpl.getConfiguration()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #119 <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #133 <Method List WorkManagerImpl.getSchedulers()>
	//    6   12:invokestatic    #151 <Method void Schedulers.schedule(androidx.work.Configuration, WorkDatabase, List)>
	//    7   15:return          
	}

	public void run()
	{
		try
		{
			runInternal();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method void runInternal()>
			mOperation.setState(((androidx.work.Operation.State) (Operation.SUCCESS)));
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field OperationImpl mOperation>
	//    4    8:getstatic       #163 <Field androidx.work.Operation$State$SUCCESS Operation.SUCCESS>
	//    5   11:invokevirtual   #166 <Method void OperationImpl.setState(androidx.work.Operation$State)>
			return;
	//    6   14:return          
		}
		catch(Throwable throwable)
	//*   7   15:astore_1        
		{
			mOperation.setState(((androidx.work.Operation.State) (new androidx.work.Operation.State.FAILURE(throwable))));
	//    8   16:aload_0         
	//    9   17:getfield        #29  <Field OperationImpl mOperation>
	//   10   20:new             #168 <Class androidx.work.Operation$State$FAILURE>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #171 <Method void androidx.work.Operation$State$FAILURE(Throwable)>
	//   14   28:invokevirtual   #166 <Method void OperationImpl.setState(androidx.work.Operation$State)>
		}
	//   15   31:return          
	}

	abstract void runInternal();

	private final OperationImpl mOperation = new OperationImpl();
}
