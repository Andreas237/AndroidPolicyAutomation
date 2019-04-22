// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.workers;


// Referenced classes of package androidx.work.impl.workers:
//			ConstraintTrackingWorker

class ConstraintTrackingWorker$1
	implements Runnable
{

	public void run()
	{
		setupAndRunConstraintTrackingWork();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ConstraintTrackingWorker this$0>
	//    2    4:invokevirtual   #25  <Method void ConstraintTrackingWorker.setupAndRunConstraintTrackingWork()>
	//    3    7:return          
	}

	final ConstraintTrackingWorker this$0;

	ConstraintTrackingWorker$1()
	{
		this$0 = ConstraintTrackingWorker.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ConstraintTrackingWorker this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
