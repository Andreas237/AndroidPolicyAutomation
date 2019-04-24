// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			ProgressOutputStream

class ProgressOutputStream$1
	implements Runnable
{

	public void run()
	{
		val$progressCallback.onBatchProgress(ProgressOutputStream.access$000(ProgressOutputStream.this), ProgressOutputStream.access$100(ProgressOutputStream.this), ProgressOutputStream.access$200(ProgressOutputStream.this));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field GraphRequestBatch$OnProgressCallback val$progressCallback>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field ProgressOutputStream this$0>
	//    4    8:invokestatic    #29  <Method GraphRequestBatch ProgressOutputStream.access$000(ProgressOutputStream)>
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field ProgressOutputStream this$0>
	//    7   15:invokestatic    #33  <Method long ProgressOutputStream.access$100(ProgressOutputStream)>
	//    8   18:aload_0         
	//    9   19:getfield        #19  <Field ProgressOutputStream this$0>
	//   10   22:invokestatic    #36  <Method long ProgressOutputStream.access$200(ProgressOutputStream)>
	//   11   25:invokeinterface #42  <Method void GraphRequestBatch$OnProgressCallback.onBatchProgress(GraphRequestBatch, long, long)>
	//   12   30:return          
	}

	final ProgressOutputStream this$0;
	final gressCallback val$progressCallback;

	ProgressOutputStream$1()
	{
		this$0 = final_progressoutputstream;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ProgressOutputStream this$0>
		val$progressCallback = gressCallback.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field GraphRequestBatch$OnProgressCallback val$progressCallback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
