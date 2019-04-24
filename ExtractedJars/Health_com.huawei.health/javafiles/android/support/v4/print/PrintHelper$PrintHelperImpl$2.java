// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;


// Referenced classes of package android.support.v4.print:
//			PrintHelper

class PrintHelper$PrintHelperImpl$2
	implements hCallback
{

	public void onFinish()
	{
		val$callback.onFinish();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PrintHelper$OnPrintFinishCallback val$callback>
	//    2    4:invokeinterface #33  <Method void PrintHelper$OnPrintFinishCallback.onFinish()>
	//    3    9:return          
	}

	final PrintHelper.PrintHelperImpl this$0;
	final ack val$callback;

	PrintHelper$PrintHelperImpl$2()
	{
		this$0 = final_printhelperimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field PrintHelper$PrintHelperImpl this$0>
		val$callback = ack.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field PrintHelper$OnPrintFinishCallback val$callback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
