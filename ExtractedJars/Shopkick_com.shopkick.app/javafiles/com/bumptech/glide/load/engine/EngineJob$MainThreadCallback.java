// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.os.Message;

// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineJob

private static class EngineJob$MainThreadCallback
	implements android.os.Handler.Callback
{

	public boolean handleMessage(Message message)
	{
		Object obj = ((Object) ((EngineJob)message.obj));
	//    0    0:aload_1         
	//    1    1:getfield        #22  <Field Object Message.obj>
	//    2    4:checkcast       #8   <Class EngineJob>
	//    3    7:astore_2        
		switch(message.what)
	//*   4    8:aload_1         
	//*   5    9:getfield        #26  <Field int Message.what>
		{
	//*   6   12:tableswitch     1 3: default 40
	//	               1 90
	//	               2 83
	//	               3 76
		default:
			obj = ((Object) (new StringBuilder()));
	//    7   40:new             #28  <Class StringBuilder>
	//    8   43:dup             
	//    9   44:invokespecial   #29  <Method void StringBuilder()>
	//   10   47:astore_2        
			((StringBuilder) (obj)).append("Unrecognized message: ");
	//   11   48:aload_2         
	//   12   49:ldc1            #31  <String "Unrecognized message: ">
	//   13   51:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   14   54:pop             
			((StringBuilder) (obj)).append(message.what);
	//   15   55:aload_2         
	//   16   56:aload_1         
	//   17   57:getfield        #26  <Field int Message.what>
	//   18   60:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   19   63:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   20   64:new             #40  <Class IllegalStateException>
	//   21   67:dup             
	//   22   68:aload_2         
	//   23   69:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   24   72:invokespecial   #47  <Method void IllegalStateException(String)>
	//   25   75:athrow          

		case 3: // '\003'
			((EngineJob) (obj)).handleCancelledOnMainThread();
	//   26   76:aload_2         
	//   27   77:invokevirtual   #50  <Method void EngineJob.handleCancelledOnMainThread()>
			break;

	//*  28   80:goto            94
		case 2: // '\002'
			((EngineJob) (obj)).handleExceptionOnMainThread();
	//   29   83:aload_2         
	//   30   84:invokevirtual   #53  <Method void EngineJob.handleExceptionOnMainThread()>
			break;

	//*  31   87:goto            94
		case 1: // '\001'
			((EngineJob) (obj)).handleResultOnMainThread();
	//   32   90:aload_2         
	//   33   91:invokevirtual   #56  <Method void EngineJob.handleResultOnMainThread()>
			break;
		}
		return true;
	//   34   94:iconst_1        
	//   35   95:ireturn         
	}

	EngineJob$MainThreadCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
