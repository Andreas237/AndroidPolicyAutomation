// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.os.Handler;
import java.util.concurrent.Callable;

// Referenced classes of package android.support.v4.provider:
//			SelfDestructiveThread

class SelfDestructiveThread$2
	implements Runnable
{

	public void run()
	{
		final Object result;
		try
		{
			result = val$callable.call();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Callable val$callable>
	//    2    4:invokeinterface #44  <Method Object Callable.call()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_0         
	//*   5   11:getfield        #29  <Field Handler val$callingHandler>
	//*   6   14:new             #13  <Class SelfDestructiveThread$2$1>
	//*   7   17:dup             
	//*   8   18:aload_0         
	//*   9   19:aload_1         
	//*  10   20:invokespecial   #47  <Method void SelfDestructiveThread$2$1(SelfDestructiveThread$2, Object)>
	//*  11   23:invokevirtual   #53  <Method boolean Handler.post(Runnable)>
	//*  12   26:pop             
	//*  13   27:return          
		catch(Exception exception)
	//*  14   28:astore_1        
		{
			exception = null;
	//   15   29:aconst_null     
	//   16   30:astore_1        
		}
		val$callingHandler.post(new Runnable() {

			public void run()
			{
				reply.onReply(result);
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

			
			{
				this$1 = SelfDestructiveThread._cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SelfDestructiveThread$2 this$1>
				result = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Object val$result>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//*  17   31:goto            10
	}

	final SelfDestructiveThread this$0;
	final Callable val$callable;
	final Handler val$callingHandler;
	final plyCallback val$reply;

	SelfDestructiveThread$2()
	{
		this$0 = final_selfdestructivethread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field SelfDestructiveThread this$0>
		val$callable = callable1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field Callable val$callable>
		val$callingHandler = handler;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #29  <Field Handler val$callingHandler>
		val$reply = plyCallback.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #31  <Field SelfDestructiveThread$ReplyCallback val$reply>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #34  <Method void Object()>
	//   14   25:return          
	}
}
