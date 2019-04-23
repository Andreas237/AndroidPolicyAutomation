// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import androidx.work.Logger;
import androidx.work.impl.*;
import androidx.work.impl.model.WorkSpecDao;

public class StopWorkRunnable
	implements Runnable
{

	public StopWorkRunnable(WorkManagerImpl workmanagerimpl, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mWorkManagerImpl = workmanagerimpl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field WorkManagerImpl mWorkManagerImpl>
		mWorkSpecId = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field String mWorkSpecId>
	//    8   14:return          
	}

	public void run()
	{
		WorkDatabase workdatabase;
		WorkSpecDao workspecdao;
		workdatabase = mWorkManagerImpl.getWorkDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field WorkManagerImpl mWorkManagerImpl>
	//    2    4:invokevirtual   #43  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    3    7:astore_2        
		workspecdao = workdatabase.workSpecDao();
	//    4    8:aload_2         
	//    5    9:invokevirtual   #49  <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    6   12:astore_3        
		workdatabase.beginTransaction();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #52  <Method void WorkDatabase.beginTransaction()>
		if(workspecdao.getState(mWorkSpecId) == androidx.work.WorkInfo.State.RUNNING)
	//*   9   17:aload_3         
	//*  10   18:aload_0         
	//*  11   19:getfield        #36  <Field String mWorkSpecId>
	//*  12   22:invokeinterface #58  <Method androidx.work.WorkInfo$State WorkSpecDao.getState(String)>
	//*  13   27:getstatic       #64  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.RUNNING>
	//*  14   30:if_acmpne       54
			workspecdao.setState(androidx.work.WorkInfo.State.ENQUEUED, new String[] {
				mWorkSpecId
			});
	//   15   33:aload_3         
	//   16   34:getstatic       #67  <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//   17   37:iconst_1        
	//   18   38:anewarray       String[]
	//   19   41:dup             
	//   20   42:iconst_0        
	//   21   43:aload_0         
	//   22   44:getfield        #36  <Field String mWorkSpecId>
	//   23   47:aastore         
	//   24   48:invokeinterface #73  <Method int WorkSpecDao.setState(androidx.work.WorkInfo$State, String[])>
	//   25   53:pop             
		boolean flag = mWorkManagerImpl.getProcessor().stopWork(mWorkSpecId);
	//   26   54:aload_0         
	//   27   55:getfield        #34  <Field WorkManagerImpl mWorkManagerImpl>
	//   28   58:invokevirtual   #77  <Method Processor WorkManagerImpl.getProcessor()>
	//   29   61:aload_0         
	//   30   62:getfield        #36  <Field String mWorkSpecId>
	//   31   65:invokevirtual   #83  <Method boolean Processor.stopWork(String)>
	//   32   68:istore_1        
		Logger.get().debug(TAG, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[] {
			mWorkSpecId, Boolean.valueOf(flag)
		}), new Throwable[0]);
	//   33   69:invokestatic    #87  <Method Logger Logger.get()>
	//   34   72:getstatic       #27  <Field String TAG>
	//   35   75:ldc1            #89  <String "StopWorkRunnable for %s; Processor.stopWork = %s">
	//   36   77:iconst_2        
	//   37   78:anewarray       Object[]
	//   38   81:dup             
	//   39   82:iconst_0        
	//   40   83:aload_0         
	//   41   84:getfield        #36  <Field String mWorkSpecId>
	//   42   87:aastore         
	//   43   88:dup             
	//   44   89:iconst_1        
	//   45   90:iload_1         
	//   46   91:invokestatic    #95  <Method Boolean Boolean.valueOf(boolean)>
	//   47   94:aastore         
	//   48   95:invokestatic    #99  <Method String String.format(String, Object[])>
	//   49   98:iconst_0        
	//   50   99:anewarray       Throwable[]
	//   51  102:invokevirtual   #105 <Method void Logger.debug(String, String, Throwable[])>
		workdatabase.setTransactionSuccessful();
	//   52  105:aload_2         
	//   53  106:invokevirtual   #108 <Method void WorkDatabase.setTransactionSuccessful()>
		workdatabase.endTransaction();
	//   54  109:aload_2         
	//   55  110:invokevirtual   #111 <Method void WorkDatabase.endTransaction()>
		return;
	//   56  113:return          
		Exception exception;
		exception;
	//   57  114:astore_3        
		workdatabase.endTransaction();
	//   58  115:aload_2         
	//   59  116:invokevirtual   #111 <Method void WorkDatabase.endTransaction()>
		throw exception;
	//   60  119:aload_3         
	//   61  120:athrow          
	}

	private static final String TAG = Logger.tagWithPrefix("StopWorkRunnable");
	private WorkManagerImpl mWorkManagerImpl;
	private String mWorkSpecId;

	static 
	{
	//    0    0:ldc1            #19  <String "StopWorkRunnable">
	//    1    2:invokestatic    #25  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #27  <Field String TAG>
	//*   3    8:return          
	}
}
