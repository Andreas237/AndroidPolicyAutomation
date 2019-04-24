// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.os.Message;

// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineJob

static class EngineJob$MainThreadCallback
	implements android.os.Handler.Callback
{

	public boolean handleMessage(Message message)
	{
		EngineJob enginejob = (EngineJob)message.obj;
	//    0    0:aload_1         
	//    1    1:getfield        #22  <Field Object Message.obj>
	//    2    4:checkcast       #8   <Class EngineJob>
	//    3    7:astore_2        
		switch(message.what)
	//*   4    8:aload_1         
	//*   5    9:getfield        #26  <Field int Message.what>
		{
	//*   6   12:tableswitch     1 3: default 40
	//	               1 43
	//	               2 50
	//	               3 57
	//*   7   40:goto            64
		case 1: // '\001'
			enginejob.handleResultOnMainThread();
	//    8   43:aload_2         
	//    9   44:invokevirtual   #29  <Method void EngineJob.handleResultOnMainThread()>
			break;

	//*  10   47:goto            94
		case 2: // '\002'
			enginejob.handleExceptionOnMainThread();
	//   11   50:aload_2         
	//   12   51:invokevirtual   #32  <Method void EngineJob.handleExceptionOnMainThread()>
			break;

	//*  13   54:goto            94
		case 3: // '\003'
			enginejob.handleCancelledOnMainThread();
	//   14   57:aload_2         
	//   15   58:invokevirtual   #35  <Method void EngineJob.handleCancelledOnMainThread()>
			break;

	//*  16   61:goto            94
		default:
			throw new IllegalStateException((new StringBuilder()).append("Unrecognized message: ").append(message.what).toString());
	//   17   64:new             #37  <Class IllegalStateException>
	//   18   67:dup             
	//   19   68:new             #39  <Class StringBuilder>
	//   20   71:dup             
	//   21   72:invokespecial   #40  <Method void StringBuilder()>
	//   22   75:ldc1            #42  <String "Unrecognized message: ">
	//   23   77:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   24   80:aload_1         
	//   25   81:getfield        #26  <Field int Message.what>
	//   26   84:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   27   87:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   28   90:invokespecial   #56  <Method void IllegalStateException(String)>
	//   29   93:athrow          
		}
		return true;
	//   30   94:iconst_1        
	//   31   95:ireturn         
	}

	EngineJob$MainThreadCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
