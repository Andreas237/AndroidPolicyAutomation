// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.app:
//			FragmentActivity, FragmentController

class FragmentActivity$1 extends Handler
{

	public void handleMessage(Message message)
	{
		if(message.what != 2)
	//*   0    0:aload_1         
	//*   1    1:getfield        #24  <Field int Message.what>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          14
		{
			super.handleMessage(message);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #26  <Method void Handler.handleMessage(Message)>
			return;
	//    7   13:return          
		} else
		{
			onResumeFragments();
	//    8   14:aload_0         
	//    9   15:getfield        #12  <Field FragmentActivity this$0>
	//   10   18:invokevirtual   #29  <Method void FragmentActivity.onResumeFragments()>
			mFragments.execPendingActions();
	//   11   21:aload_0         
	//   12   22:getfield        #12  <Field FragmentActivity this$0>
	//   13   25:getfield        #33  <Field FragmentController FragmentActivity.mFragments>
	//   14   28:invokevirtual   #39  <Method boolean FragmentController.execPendingActions()>
	//   15   31:pop             
			return;
	//   16   32:return          
		}
	}

	final FragmentActivity this$0;

	FragmentActivity$1()
	{
		this$0 = FragmentActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field FragmentActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Handler()>
	//    5    9:return          
	}
}
