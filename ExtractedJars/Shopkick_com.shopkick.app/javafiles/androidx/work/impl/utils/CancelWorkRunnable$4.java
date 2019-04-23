// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package androidx.work.impl.utils:
//			CancelWorkRunnable, Preferences

static final class CancelWorkRunnable$4 extends CancelWorkRunnable
{

	void runInternal()
	{
		WorkDatabase workdatabase;
		workdatabase = val$workManagerImpl.getWorkDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field WorkManagerImpl val$workManagerImpl>
	//    2    4:invokevirtual   #25  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    3    7:astore_1        
		workdatabase.beginTransaction();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #30  <Method void WorkDatabase.beginTransaction()>
		String s;
		for(Iterator iterator = workdatabase.workSpecDao().getAllUnfinishedWork().iterator(); iterator.hasNext(); cancel(val$workManagerImpl, s))
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
		(new Preferences(val$workManagerImpl.getApplicationContext())).setLastCancelAllTimeMillis(System.currentTimeMillis());
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

	CancelWorkRunnable$4(WorkManagerImpl workmanagerimpl)
	{
		val$workManagerImpl = workmanagerimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field WorkManagerImpl val$workManagerImpl>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void CancelWorkRunnable()>
	//    5    9:return          
	}
}
