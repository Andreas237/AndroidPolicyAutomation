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
		message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #24  <Field int Message.what>
		JVM INSTR tableswitch 1 2: default 28
	//	               1 34
	//	               2 53;
	//    2    4:tableswitch     1 2: default 28
	//	               1 34
	//	               2 53
		   goto _L1 _L2 _L3
_L1:
		super.handleMessage(message);
	//    3   28:aload_0         
	//    4   29:aload_1         
	//    5   30:invokespecial   #26  <Method void Handler.handleMessage(Message)>
_L5:
		return;
	//    6   33:return          
_L2:
		if(!mStopped) goto _L5; else goto _L4
	//    7   34:aload_0         
	//    8   35:getfield        #12  <Field FragmentActivity this$0>
	//    9   38:getfield        #30  <Field boolean FragmentActivity.mStopped>
	//   10   41:ifeq            33
_L4:
		doReallyStop(false);
	//   11   44:aload_0         
	//   12   45:getfield        #12  <Field FragmentActivity this$0>
	//   13   48:iconst_0        
	//   14   49:invokevirtual   #34  <Method void FragmentActivity.doReallyStop(boolean)>
		return;
	//   15   52:return          
_L3:
		onResumeFragments();
	//   16   53:aload_0         
	//   17   54:getfield        #12  <Field FragmentActivity this$0>
	//   18   57:invokevirtual   #37  <Method void FragmentActivity.onResumeFragments()>
		mFragments.execPendingActions();
	//   19   60:aload_0         
	//   20   61:getfield        #12  <Field FragmentActivity this$0>
	//   21   64:getfield        #41  <Field FragmentController FragmentActivity.mFragments>
	//   22   67:invokevirtual   #47  <Method boolean FragmentController.execPendingActions()>
	//   23   70:pop             
		return;
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
