// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			WorkQueue

class WorkQueue$1
	implements Runnable
{

	public void run()
	{
		val$node.getCallback().run();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field WorkQueue$WorkNode val$node>
	//    2    4:invokevirtual   #32  <Method Runnable WorkQueue$WorkNode.getCallback()>
	//    3    7:invokeinterface #34  <Method void Runnable.run()>
		WorkQueue.access$000(WorkQueue.this, val$node);
	//    4   12:aload_0         
	//    5   13:getfield        #19  <Field WorkQueue this$0>
	//    6   16:aload_0         
	//    7   17:getfield        #21  <Field WorkQueue$WorkNode val$node>
	//    8   20:invokestatic    #37  <Method void WorkQueue.access$000(WorkQueue, WorkQueue$WorkNode)>
		return;
	//    9   23:return          
		Exception exception;
		exception;
	//   10   24:astore_1        
		WorkQueue.access$000(WorkQueue.this, val$node);
	//   11   25:aload_0         
	//   12   26:getfield        #19  <Field WorkQueue this$0>
	//   13   29:aload_0         
	//   14   30:getfield        #21  <Field WorkQueue$WorkNode val$node>
	//   15   33:invokestatic    #37  <Method void WorkQueue.access$000(WorkQueue, WorkQueue$WorkNode)>
		throw exception;
	//   16   36:aload_1         
	//   17   37:athrow          
	}

	final WorkQueue this$0;
	final rkNode val$node;

	WorkQueue$1()
	{
		this$0 = final_workqueue;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field WorkQueue this$0>
		val$node = rkNode.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field WorkQueue$WorkNode val$node>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
