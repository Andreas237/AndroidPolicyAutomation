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
	//*   2    4:lookupswitch    2: default 32
	//	               1: 35
	//	               2: 54
	//*   3   32:goto            73
		case 1: // '\001'
			if(mStopped)
	//*   4   35:aload_0         
	//*   5   36:getfield        #12  <Field FragmentActivity this$0>
	//*   6   39:getfield        #28  <Field boolean FragmentActivity.mStopped>
	//*   7   42:ifeq            78
			{
				doReallyStop(false);
	//    8   45:aload_0         
	//    9   46:getfield        #12  <Field FragmentActivity this$0>
	//   10   49:iconst_0        
	//   11   50:invokevirtual   #32  <Method void FragmentActivity.doReallyStop(boolean)>
				return;
	//   12   53:return          
			}
			break;

		case 2: // '\002'
			onResumeFragments();
	//   13   54:aload_0         
	//   14   55:getfield        #12  <Field FragmentActivity this$0>
	//   15   58:invokevirtual   #35  <Method void FragmentActivity.onResumeFragments()>
			mFragments.execPendingActions();
	//   16   61:aload_0         
	//   17   62:getfield        #12  <Field FragmentActivity this$0>
	//   18   65:getfield        #39  <Field FragmentController FragmentActivity.mFragments>
	//   19   68:invokevirtual   #45  <Method boolean FragmentController.execPendingActions()>
	//   20   71:pop             
			return;
	//   21   72:return          

		default:
			super.handleMessage(message);
	//   22   73:aload_0         
	//   23   74:aload_1         
	//   24   75:invokespecial   #47  <Method void Handler.handleMessage(Message)>
			break;
		}
	//   25   78:return          
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
