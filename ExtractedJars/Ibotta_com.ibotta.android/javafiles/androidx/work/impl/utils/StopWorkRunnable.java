// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import androidx.work.Logger;
import androidx.work.State;
import androidx.work.impl.*;
import androidx.work.impl.model.WorkSpecDao;

public class StopWorkRunnable
	implements Runnable
{

	public StopWorkRunnable(WorkManagerImpl workmanagerimpl, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mWorkManagerImpl = workmanagerimpl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field WorkManagerImpl mWorkManagerImpl>
		mWorkSpecId = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field String mWorkSpecId>
	//    8   14:return          
	}

	public void run()
	{
		WorkDatabase workdatabase;
		WorkSpecDao workspecdao;
		workdatabase = mWorkManagerImpl.getWorkDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field WorkManagerImpl mWorkManagerImpl>
	//    2    4:invokevirtual   #31  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    3    7:astore_2        
		workspecdao = workdatabase.workSpecDao();
	//    4    8:aload_2         
	//    5    9:invokevirtual   #37  <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    6   12:astore_3        
		workdatabase.beginTransaction();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #40  <Method void WorkDatabase.beginTransaction()>
		if(workspecdao.getState(mWorkSpecId) == State.RUNNING)
	//*   9   17:aload_3         
	//*  10   18:aload_0         
	//*  11   19:getfield        #23  <Field String mWorkSpecId>
	//*  12   22:invokeinterface #46  <Method State WorkSpecDao.getState(String)>
	//*  13   27:getstatic       #52  <Field State State.RUNNING>
	//*  14   30:if_acmpne       54
			workspecdao.setState(State.ENQUEUED, new String[] {
				mWorkSpecId
			});
	//   15   33:aload_3         
	//   16   34:getstatic       #55  <Field State State.ENQUEUED>
	//   17   37:iconst_1        
	//   18   38:anewarray       String[]
	//   19   41:dup             
	//   20   42:iconst_0        
	//   21   43:aload_0         
	//   22   44:getfield        #23  <Field String mWorkSpecId>
	//   23   47:aastore         
	//   24   48:invokeinterface #61  <Method int WorkSpecDao.setState(State, String[])>
	//   25   53:pop             
		boolean flag = mWorkManagerImpl.getProcessor().stopWork(mWorkSpecId);
	//   26   54:aload_0         
	//   27   55:getfield        #21  <Field WorkManagerImpl mWorkManagerImpl>
	//   28   58:invokevirtual   #65  <Method Processor WorkManagerImpl.getProcessor()>
	//   29   61:aload_0         
	//   30   62:getfield        #23  <Field String mWorkSpecId>
	//   31   65:invokevirtual   #71  <Method boolean Processor.stopWork(String)>
	//   32   68:istore_1        
		Logger.debug("StopWorkRunnable", String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[] {
			mWorkSpecId, Boolean.valueOf(flag)
		}), new Throwable[0]);
	//   33   69:ldc1            #73  <String "StopWorkRunnable">
	//   34   71:ldc1            #75  <String "StopWorkRunnable for %s; Processor.stopWork = %s">
	//   35   73:iconst_2        
	//   36   74:anewarray       Object[]
	//   37   77:dup             
	//   38   78:iconst_0        
	//   39   79:aload_0         
	//   40   80:getfield        #23  <Field String mWorkSpecId>
	//   41   83:aastore         
	//   42   84:dup             
	//   43   85:iconst_1        
	//   44   86:iload_1         
	//   45   87:invokestatic    #81  <Method Boolean Boolean.valueOf(boolean)>
	//   46   90:aastore         
	//   47   91:invokestatic    #85  <Method String String.format(String, Object[])>
	//   48   94:iconst_0        
	//   49   95:anewarray       Throwable[]
	//   50   98:invokestatic    #93  <Method void Logger.debug(String, String, Throwable[])>
		workdatabase.setTransactionSuccessful();
	//   51  101:aload_2         
	//   52  102:invokevirtual   #96  <Method void WorkDatabase.setTransactionSuccessful()>
		workdatabase.endTransaction();
	//   53  105:aload_2         
	//   54  106:invokevirtual   #99  <Method void WorkDatabase.endTransaction()>
		return;
	//   55  109:return          
		Exception exception;
		exception;
	//   56  110:astore_3        
		workdatabase.endTransaction();
	//   57  111:aload_2         
	//   58  112:invokevirtual   #99  <Method void WorkDatabase.endTransaction()>
		throw exception;
	//   59  115:aload_3         
	//   60  116:athrow          
	}

	private WorkManagerImpl mWorkManagerImpl;
	private String mWorkSpecId;
}
