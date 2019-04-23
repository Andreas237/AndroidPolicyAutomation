// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import androidx.work.Operation;
import androidx.work.impl.*;
import androidx.work.impl.model.WorkSpecDao;

public class PruneWorkRunnable
	implements Runnable
{

	public PruneWorkRunnable(WorkManagerImpl workmanagerimpl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mWorkManagerImpl = workmanagerimpl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field WorkManagerImpl mWorkManagerImpl>
	//    5    9:aload_0         
	//    6   10:new             #23  <Class OperationImpl>
	//    7   13:dup             
	//    8   14:invokespecial   #24  <Method void OperationImpl()>
	//    9   17:putfield        #26  <Field OperationImpl mOperation>
	//   10   20:return          
	}

	public Operation getOperation()
	{
		return ((Operation) (mOperation));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field OperationImpl mOperation>
	//    2    4:areturn         
	}

	public void run()
	{
		try
		{
			mWorkManagerImpl.getWorkDatabase().workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field WorkManagerImpl mWorkManagerImpl>
	//    2    4:invokevirtual   #38  <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    3    7:invokevirtual   #44  <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    4   10:invokeinterface #49  <Method void WorkSpecDao.pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast()>
			mOperation.setState(((androidx.work.Operation.State) (Operation.SUCCESS)));
	//    5   15:aload_0         
	//    6   16:getfield        #26  <Field OperationImpl mOperation>
	//    7   19:getstatic       #55  <Field androidx.work.Operation$State$SUCCESS Operation.SUCCESS>
	//    8   22:invokevirtual   #59  <Method void OperationImpl.setState(androidx.work.Operation$State)>
			return;
	//    9   25:return          
		}
		catch(Throwable throwable)
	//*  10   26:astore_1        
		{
			mOperation.setState(((androidx.work.Operation.State) (new androidx.work.Operation.State.FAILURE(throwable))));
	//   11   27:aload_0         
	//   12   28:getfield        #26  <Field OperationImpl mOperation>
	//   13   31:new             #61  <Class androidx.work.Operation$State$FAILURE>
	//   14   34:dup             
	//   15   35:aload_1         
	//   16   36:invokespecial   #64  <Method void androidx.work.Operation$State$FAILURE(Throwable)>
	//   17   39:invokevirtual   #59  <Method void OperationImpl.setState(androidx.work.Operation$State)>
		}
	//   18   42:return          
	}

	private final OperationImpl mOperation = new OperationImpl();
	private final WorkManagerImpl mWorkManagerImpl;
}
