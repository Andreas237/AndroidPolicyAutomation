// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.recyclerview.extensions;


// Referenced classes of package android.support.v7.recyclerview.extensions:
//			AsyncListDiffer

class AsyncListDiffer$1$2
	implements Runnable
{

	public void run()
	{
		if(mMaxScheduledGeneration == val$runGeneration)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field AsyncListDiffer$1 this$1>
	//*   2    4:getfield        #27  <Field AsyncListDiffer AsyncListDiffer$1.this$0>
	//*   3    7:getfield        #33  <Field int AsyncListDiffer.mMaxScheduledGeneration>
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field AsyncListDiffer$1 this$1>
	//*   6   14:getfield        #36  <Field int AsyncListDiffer$1.val$runGeneration>
	//*   7   17:icmpne          41
			latchList(val$newList, val$result);
	//    8   20:aload_0         
	//    9   21:getfield        #14  <Field AsyncListDiffer$1 this$1>
	//   10   24:getfield        #27  <Field AsyncListDiffer AsyncListDiffer$1.this$0>
	//   11   27:aload_0         
	//   12   28:getfield        #14  <Field AsyncListDiffer$1 this$1>
	//   13   31:getfield        #40  <Field java.util.List AsyncListDiffer$1.val$newList>
	//   14   34:aload_0         
	//   15   35:getfield        #16  <Field android.support.v7.util.DiffUtil$DiffResult val$result>
	//   16   38:invokevirtual   #44  <Method void AsyncListDiffer.latchList(java.util.List, android.support.v7.util.DiffUtil$DiffResult)>
	//   17   41:return          
	}

	final AsyncListDiffer._cls1 this$1;
	final android.support.v7.util.DiffUtil$DiffResult val$result;

	AsyncListDiffer$1$2()
	{
		this$1 = final__pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AsyncListDiffer$1 this$1>
		val$result = android.support.v7.util.DiffUtil$DiffResult.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field android.support.v7.util.DiffUtil$DiffResult val$result>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}
}
