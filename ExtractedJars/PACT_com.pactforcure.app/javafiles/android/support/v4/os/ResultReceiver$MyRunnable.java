// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.Bundle;

// Referenced classes of package android.support.v4.os:
//			ResultReceiver

class ResultReceiver$MyRunnable
	implements Runnable
{

	public void run()
	{
		onReceiveResult(mResultCode, mResultData);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ResultReceiver this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field int mResultCode>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field Bundle mResultData>
	//    6   12:invokevirtual   #32  <Method void ResultReceiver.onReceiveResult(int, Bundle)>
	//    7   15:return          
	}

	final int mResultCode;
	final Bundle mResultData;
	final ResultReceiver this$0;

	ResultReceiver$MyRunnable(int i, Bundle bundle)
	{
		this$0 = ResultReceiver.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ResultReceiver this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		mResultCode = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field int mResultCode>
		mResultData = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field Bundle mResultData>
	//   11   19:return          
	}
}
