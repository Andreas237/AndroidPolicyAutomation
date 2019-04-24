// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;

// Referenced classes of package android.support.v4.os:
//			ResultReceiver

class ResultReceiver$MyResultReceiver extends IResultReceiver.Stub
{

	public void send(int i, Bundle bundle)
	{
		if(mHandler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field ResultReceiver this$0>
	//*   2    4:getfield        #23  <Field Handler ResultReceiver.mHandler>
	//*   3    7:ifnull          35
		{
			mHandler.post(((Runnable) (new ResultReceiver.MyRunnable(ResultReceiver.this, i, bundle))));
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field ResultReceiver this$0>
	//    6   14:getfield        #23  <Field Handler ResultReceiver.mHandler>
	//    7   17:new             #25  <Class ResultReceiver$MyRunnable>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:getfield        #13  <Field ResultReceiver this$0>
	//   11   25:iload_1         
	//   12   26:aload_2         
	//   13   27:invokespecial   #28  <Method void ResultReceiver$MyRunnable(ResultReceiver, int, Bundle)>
	//   14   30:invokevirtual   #34  <Method boolean Handler.post(Runnable)>
	//   15   33:pop             
			return;
	//   16   34:return          
		} else
		{
			onReceiveResult(i, bundle);
	//   17   35:aload_0         
	//   18   36:getfield        #13  <Field ResultReceiver this$0>
	//   19   39:iload_1         
	//   20   40:aload_2         
	//   21   41:invokevirtual   #37  <Method void ResultReceiver.onReceiveResult(int, Bundle)>
			return;
	//   22   44:return          
		}
	}

	final ResultReceiver this$0;

	ResultReceiver$MyResultReceiver()
	{
		this$0 = ResultReceiver.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ResultReceiver this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void IResultReceiver$Stub()>
	//    5    9:return          
	}
}
