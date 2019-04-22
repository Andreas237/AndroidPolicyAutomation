// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;


// Referenced classes of package androidx.work:
//			ListenableWorker, Data

public static final class ListenableWorker$Payload
{

	public Data getOutputData()
	{
		return mOutput;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Data mOutput>
	//    2    4:areturn         
	}

	public ListenableWorker.Result getResult()
	{
		return mResult;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ListenableWorker$Result mResult>
	//    2    4:areturn         
	}

	Data mOutput;
	ListenableWorker.Result mResult;

	public ListenableWorker$Payload(ListenableWorker.Result result, Data data)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mResult = result;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field ListenableWorker$Result mResult>
		mOutput = data;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Data mOutput>
	//    8   14:return          
	}
}
