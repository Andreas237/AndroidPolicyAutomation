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
//			CancelWorkRunnable

static final class CancelWorkRunnable$2 extends CancelWorkRunnable
{

	void runInternal()
	{
		WorkDatabase workdatabase;
		workdatabase = val$workManagerImpl.getWorkDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field WorkManagerImpl val$workManagerImpl>
	//    2    4:invokevirtual   #29  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    3    7:astore_1        
		workdatabase.beginTransaction();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #34  <Method void WorkDatabase.beginTransaction()>
		String s;
		for(Iterator iterator = workdatabase.workSpecDao().getUnfinishedWorkWithTag(val$tag).iterator(); iterator.hasNext(); cancel(val$workManagerImpl, s))
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
			s = (String)iterator.next();
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
		reschedulePendingWorkers(val$workManagerImpl);
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

	CancelWorkRunnable$2(WorkManagerImpl workmanagerimpl, String s)
	{
		val$workManagerImpl = workmanagerimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field WorkManagerImpl val$workManagerImpl>
		val$tag = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field String val$tag>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void CancelWorkRunnable()>
	//    8   14:return          
	}
}
