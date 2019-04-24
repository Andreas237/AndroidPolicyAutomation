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
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #24  <Field int Message.what>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 53
	//	               2 34
		default:
			super.handleMessage(message);
	//    3   28:aload_0         
	//    4   29:aload_1         
	//    5   30:invokespecial   #26  <Method void Handler.handleMessage(Message)>
			return;
	//    6   33:return          

		case 2: // '\002'
			onResumeFragments();
	//    7   34:aload_0         
	//    8   35:getfield        #12  <Field FragmentActivity this$0>
	//    9   38:invokevirtual   #29  <Method void FragmentActivity.onResumeFragments()>
			mFragments.execPendingActions();
	//   10   41:aload_0         
	//   11   42:getfield        #12  <Field FragmentActivity this$0>
	//   12   45:getfield        #33  <Field FragmentController FragmentActivity.mFragments>
	//   13   48:invokevirtual   #39  <Method boolean FragmentController.execPendingActions()>
	//   14   51:pop             
			return;
	//   15   52:return          

		case 1: // '\001'
			break;
		}
		if(mStopped)
	//*  16   53:aload_0         
	//*  17   54:getfield        #12  <Field FragmentActivity this$0>
	//*  18   57:getfield        #43  <Field boolean FragmentActivity.mStopped>
	//*  19   60:ifeq            71
			doReallyStop(false);
	//   20   63:aload_0         
	//   21   64:getfield        #12  <Field FragmentActivity this$0>
	//   22   67:iconst_0        
	//   23   68:invokevirtual   #47  <Method void FragmentActivity.doReallyStop(boolean)>
	//   24   71:return          
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
