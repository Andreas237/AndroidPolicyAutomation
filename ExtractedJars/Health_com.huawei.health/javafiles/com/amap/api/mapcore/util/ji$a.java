// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			ji, jm, jk

static class ji$a extends Handler
{

	public void handleMessage(Message message)
	{
		message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #27  <Field int Message.what>
		JVM INSTR lookupswitch 2: default 81
	//	               0: 32
	//	               1: 50;
	//    2    4:lookupswitch    2: default 81
	//	               0: 32
	//	               1: 50
		   goto _L1 _L2 _L3
_L1:
		break MISSING_BLOCK_LABEL_81;
_L2:
		((jm)message.obj).b.a();
	//    3   32:aload_1         
	//    4   33:getfield        #31  <Field Object Message.obj>
	//    5   36:checkcast       #33  <Class jm>
	//    6   39:getfield        #37  <Field jk jm.b>
	//    7   42:invokeinterface #41  <Method void jk.a()>
		break; /* Loop/switch isn't completed */
	//    8   47:goto            74
_L3:
		try
		{
			message = ((Message) ((jm)message.obj));
	//    9   50:aload_1         
	//   10   51:getfield        #31  <Field Object Message.obj>
	//   11   54:checkcast       #33  <Class jm>
	//   12   57:astore_1        
			((jm) (message)).b.a(((jm) (message)).a);
	//   13   58:aload_1         
	//   14   59:getfield        #37  <Field jk jm.b>
	//   15   62:aload_1         
	//   16   63:getfield        #44  <Field gn jm.a>
	//   17   66:invokeinterface #47  <Method void jk.a(gn)>
		}
	//*  18   71:goto            74
	//*  19   74:return          
		// Misplaced declaration of an exception variable
		catch(Message message)
	//*  20   75:astore_1        
		{
			((Throwable) (message)).printStackTrace();
	//   21   76:aload_1         
	//   22   77:invokevirtual   #50  <Method void Throwable.printStackTrace()>
			return;
	//   23   80:return          
		}
		return;
	//   24   81:return          
	}

	public ji$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Handler()>
	//    2    4:return          
	}

	private ji$a(Looper looper)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void Handler(Looper)>
	//    3    5:return          
	}

	ji$a(Looper looper, ji$1 ji$1)
	{
		this(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void ji$a(Looper)>
	//    3    5:return          
	}
}
