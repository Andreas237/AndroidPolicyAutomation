// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemjob;

import androidx.work.Logger;
import com.google.common.util.concurrent.ListenableFuture;

// Referenced classes of package androidx.work.impl.background.systemjob:
//			SystemJobService

class SystemJobService$1
	implements Runnable
{

	public void run()
	{
		Throwable throwable;
		boolean flag;
		try
		{
			flag = ((Boolean)val$enqueuedFuture.get()).booleanValue();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ListenableFuture val$enqueuedFuture>
	//    2    4:invokeinterface #38  <Method Object ListenableFuture.get()>
	//    3    9:checkcast       #40  <Class Boolean>
	//    4   12:invokevirtual   #44  <Method boolean Boolean.booleanValue()>
	//    5   15:istore_1        
		}
	//*   6   16:goto            21
	//*   7   19:iconst_0        
	//*   8   20:istore_1        
	//*   9   21:iload_1         
	//*  10   22:ifne            66
	//*  11   25:invokestatic    #49  <Method Logger Logger.get()>
	//*  12   28:getstatic       #52  <Field String SystemJobService.TAG>
	//*  13   31:ldc1            #54  <String "De-duping request to process WorkSpec %s">
	//*  14   33:iconst_1        
	//*  15   34:anewarray       Object[]
	//*  16   37:dup             
	//*  17   38:iconst_0        
	//*  18   39:aload_0         
	//*  19   40:getfield        #25  <Field String val$workSpecId>
	//*  20   43:aastore         
	//*  21   44:invokestatic    #60  <Method String String.format(String, Object[])>
	//*  22   47:iconst_0        
	//*  23   48:anewarray       Throwable[]
	//*  24   51:invokevirtual   #64  <Method void Logger.debug(String, String, Throwable[])>
	//*  25   54:aload_0         
	//*  26   55:getfield        #21  <Field SystemJobService this$0>
	//*  27   58:aload_0         
	//*  28   59:getfield        #25  <Field String val$workSpecId>
	//*  29   62:iconst_0        
	//*  30   63:invokevirtual   #68  <Method void SystemJobService.onExecuted(String, boolean)>
	//*  31   66:return          
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			flag = false;
		}
		if(!flag)
		{
			Logger.get().debug(SystemJobService.TAG, String.format("De-duping request to process WorkSpec %s", new Object[] {
				val$workSpecId
			}), new Throwable[0]);
			onExecuted(val$workSpecId, false);
		}
	//*  32   67:astore_2        
	//*  33   68:goto            19
	}

	final SystemJobService this$0;
	final ListenableFuture val$enqueuedFuture;
	final String val$workSpecId;

	SystemJobService$1()
	{
		this$0 = final_systemjobservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field SystemJobService this$0>
		val$enqueuedFuture = listenablefuture;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ListenableFuture val$enqueuedFuture>
		val$workSpecId = String.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String val$workSpecId>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
