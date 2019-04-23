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

static final class CancelWorkRunnable$3 extends CancelWorkRunnable
{

	void runInternal()
	{
		WorkDatabase workdatabase;
		workdatabase = val$workManagerImpl.getWorkDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WorkManagerImpl val$workManagerImpl>
	//    2    4:invokevirtual   #33  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    3    7:astore_1        
		workdatabase.beginTransaction();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #38  <Method void WorkDatabase.beginTransaction()>
		String s;
		for(Iterator iterator = workdatabase.workSpecDao().getUnfinishedWorkWithName(val$name).iterator(); iterator.hasNext(); cancel(val$workManagerImpl, s))
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
			s = (String)iterator.next();
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
		if(val$allowReschedule)
	//*  30   70:aload_0         
	//*  31   71:getfield        #21  <Field boolean val$allowReschedule>
	//*  32   74:ifeq            85
			reschedulePendingWorkers(val$workManagerImpl);
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

	CancelWorkRunnable$3(WorkManagerImpl workmanagerimpl, String s, boolean flag)
	{
		val$workManagerImpl = workmanagerimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field WorkManagerImpl val$workManagerImpl>
		val$name = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field String val$name>
		val$allowReschedule = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #21  <Field boolean val$allowReschedule>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #24  <Method void CancelWorkRunnable()>
	//   11   19:return          
	}
}
