// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.os.Message;

// Referenced classes of package android.support.v4.provider:
//			SelfDestructiveThread

class SelfDestructiveThread$1
	implements android.os.Handler.Callback
{

	public boolean handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #26  <Field int Message.what>
		{
	//*   2    4:tableswitch     0 1: default 28
	//	               0 46
	//	               1 30
		default:
			return true;
	//    3   28:iconst_1        
	//    4   29:ireturn         

		case 1: // '\001'
			onInvokeRunnable((Runnable)message.obj);
	//    5   30:aload_0         
	//    6   31:getfield        #14  <Field SelfDestructiveThread this$0>
	//    7   34:aload_1         
	//    8   35:getfield        #30  <Field Object Message.obj>
	//    9   38:checkcast       #32  <Class Runnable>
	//   10   41:invokevirtual   #36  <Method void SelfDestructiveThread.onInvokeRunnable(Runnable)>
			return true;
	//   11   44:iconst_1        
	//   12   45:ireturn         

		case 0: // '\0'
			onDestruction();
	//   13   46:aload_0         
	//   14   47:getfield        #14  <Field SelfDestructiveThread this$0>
	//   15   50:invokevirtual   #39  <Method void SelfDestructiveThread.onDestruction()>
			return true;
	//   16   53:iconst_1        
	//   17   54:ireturn         
		}
	}

	final SelfDestructiveThread this$0;

	SelfDestructiveThread$1()
	{
		this$0 = SelfDestructiveThread.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SelfDestructiveThread this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
