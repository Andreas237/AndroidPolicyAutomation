// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.os.Handler;
import java.util.concurrent.Callable;

// Referenced classes of package android.support.v4.provider:
//			SelfDestructiveThread

class SelfDestructiveThread$2$1
	implements Runnable
{

	public void run()
	{
		val$reply.onReply(val$result);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SelfDestructiveThread$2 this$1>
	//    2    4:getfield        #28  <Field SelfDestructiveThread$ReplyCallback SelfDestructiveThread$2.val$reply>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Object val$result>
	//    5   11:invokeinterface #34  <Method void SelfDestructiveThread$ReplyCallback.onReply(Object)>
	//    6   16:return          
	}

	final SelfDestructiveThread._cls2 this$1;
	final Object val$result;

	SelfDestructiveThread$2$1()
	{
		this$1 = final__pcls2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SelfDestructiveThread$2 this$1>
		val$result = Object.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Object val$result>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class android/support/v4/provider/SelfDestructiveThread$2

/* anonymous class */
	class SelfDestructiveThread._cls2
		implements Runnable
	{

		public void run()
		{
			Exception exception;
			Object obj;
			try
			{
				obj = callable.call();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Callable val$callable>
		//    2    4:invokeinterface #44  <Method Object Callable.call()>
		//    3    9:astore_1        
			}
		//*   4   10:goto            15
		//*   5   13:aconst_null     
		//*   6   14:astore_1        
		//*   7   15:aload_0         
		//*   8   16:getfield        #29  <Field Handler val$callingHandler>
		//*   9   19:new             #13  <Class SelfDestructiveThread$2$1>
		//*  10   22:dup             
		//*  11   23:aload_0         
		//*  12   24:aload_1         
		//*  13   25:invokespecial   #47  <Method void SelfDestructiveThread$2$1(SelfDestructiveThread$2, Object)>
		//*  14   28:invokevirtual   #53  <Method boolean Handler.post(Runnable)>
		//*  15   31:pop             
		//*  16   32:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				obj = null;
			}
			callingHandler.post(((Runnable) (((SelfDestructiveThread._cls2._cls1) (obj)). new SelfDestructiveThread._cls2._cls1())));
		//*  17   33:astore_1        
		//*  18   34:goto            13
		}

		final SelfDestructiveThread this$0;
		final Callable val$callable;
		final Handler val$callingHandler;
		final SelfDestructiveThread.ReplyCallback val$reply;

			
			{
				this$0 = final_selfdestructivethread;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field SelfDestructiveThread this$0>
				callable = callable1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field Callable val$callable>
				callingHandler = handler;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field Handler val$callingHandler>
				reply = SelfDestructiveThread.ReplyCallback.this;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field SelfDestructiveThread$ReplyCallback val$reply>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #34  <Method void Object()>
			//   14   25:return          
			}
	}

}
