// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.workers;

import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

// Referenced classes of package androidx.work.impl.workers:
//			ConstraintTrackingWorker

class ConstraintTrackingWorker$2
	implements Runnable
{

	public void run()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ConstraintTrackingWorker this$0>
	//    2    4:getfield        #29  <Field Object ConstraintTrackingWorker.mLock>
	//    3    7:astore_1        
		obj;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(mAreConstraintsUnmet)
	//*   6   10:aload_0         
	//*   7   11:getfield        #19  <Field ConstraintTrackingWorker this$0>
	//*   8   14:getfield        #33  <Field boolean ConstraintTrackingWorker.mAreConstraintsUnmet>
	//*   9   17:ifeq            30
		{
			setFutureRetry();
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field ConstraintTrackingWorker this$0>
	//   12   24:invokevirtual   #36  <Method void ConstraintTrackingWorker.setFutureRetry()>
			break MISSING_BLOCK_LABEL_45;
	//   13   27:goto            45
		}
		mFuture.setFuture(val$innerFuture);
	//   14   30:aload_0         
	//   15   31:getfield        #19  <Field ConstraintTrackingWorker this$0>
	//   16   34:getfield        #40  <Field SettableFuture ConstraintTrackingWorker.mFuture>
	//   17   37:aload_0         
	//   18   38:getfield        #21  <Field ListenableFuture val$innerFuture>
	//   19   41:invokevirtual   #46  <Method boolean SettableFuture.setFuture(ListenableFuture)>
	//   20   44:pop             
		obj;
	//   21   45:aload_1         
		JVM INSTR monitorexit ;
	//   22   46:monitorexit     
		return;
	//   23   47:return          
		Exception exception;
		exception;
	//   24   48:astore_2        
		obj;
	//   25   49:aload_1         
		JVM INSTR monitorexit ;
	//   26   50:monitorexit     
		throw exception;
	//   27   51:aload_2         
	//   28   52:athrow          
	}

	final ConstraintTrackingWorker this$0;
	final ListenableFuture val$innerFuture;

	ConstraintTrackingWorker$2()
	{
		this$0 = final_constrainttrackingworker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ConstraintTrackingWorker this$0>
		val$innerFuture = ListenableFuture.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ListenableFuture val$innerFuture>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
