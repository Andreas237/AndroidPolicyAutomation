// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.*;
import com.amap.api.trace.TraceListener;
import java.util.List;

// Referenced classes of package com.amap.api.mapcore.util:
//			gk

static class gk$c extends Handler
{

	public void a(TraceListener tracelistener)
	{
		a = tracelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TraceListener a>
	//    3    5:return          
	}

	public void handleMessage(Message message)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TraceListener a>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		obj = ((Object) (message.getData()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #27  <Method Bundle Message.getData()>
	//    8   14:astore_3        
		if(obj == null)
	//*   9   15:aload_3         
	//*  10   16:ifnonnull       20
			return;
	//   11   19:return          
		int i = ((Bundle) (obj)).getInt("lineID");
	//   12   20:aload_3         
	//   13   21:ldc1            #29  <String "lineID">
	//   14   23:invokevirtual   #35  <Method int Bundle.getInt(String)>
	//   15   26:istore_2        
		message.what;
	//   16   27:aload_1         
	//   17   28:getfield        #39  <Field int Message.what>
		JVM INSTR tableswitch 100 102: default 138
	//	               100 56
	//	               101 82
	//	               102 112;
	//   18   31:tableswitch     100 102: default 138
	//	               100 56
	//	               101 82
	//	               102 112
		   goto _L1 _L2 _L3 _L4
_L1:
		break MISSING_BLOCK_LABEL_138;
_L2:
		List list = (List)message.obj;
	//   19   56:aload_1         
	//   20   57:getfield        #43  <Field Object Message.obj>
	//   21   60:checkcast       #45  <Class List>
	//   22   63:astore_3        
		a.onTraceProcessing(i, message.arg1, list);
	//   23   64:aload_0         
	//   24   65:getfield        #17  <Field TraceListener a>
	//   25   68:iload_2         
	//   26   69:aload_1         
	//   27   70:getfield        #48  <Field int Message.arg1>
	//   28   73:aload_3         
	//   29   74:invokeinterface #54  <Method void TraceListener.onTraceProcessing(int, int, List)>
		break; /* Loop/switch isn't completed */
	//   30   79:goto            131
_L3:
		try
		{
			List list1 = (List)message.obj;
	//   31   82:aload_1         
	//   32   83:getfield        #43  <Field Object Message.obj>
	//   33   86:checkcast       #45  <Class List>
	//   34   89:astore_3        
			a.onFinished(i, list1, message.arg1, message.arg2);
	//   35   90:aload_0         
	//   36   91:getfield        #17  <Field TraceListener a>
	//   37   94:iload_2         
	//   38   95:aload_3         
	//   39   96:aload_1         
	//   40   97:getfield        #48  <Field int Message.arg1>
	//   41  100:aload_1         
	//   42  101:getfield        #57  <Field int Message.arg2>
	//   43  104:invokeinterface #61  <Method void TraceListener.onFinished(int, List, int, int)>
			break; /* Loop/switch isn't completed */
	//   44  109:goto            131
		}
	//*  45  112:aload_1         
	//*  46  113:getfield        #43  <Field Object Message.obj>
	//*  47  116:checkcast       #63  <Class String>
	//*  48  119:astore_1        
	//*  49  120:aload_0         
	//*  50  121:getfield        #17  <Field TraceListener a>
	//*  51  124:iload_2         
	//*  52  125:aload_1         
	//*  53  126:invokeinterface #67  <Method void TraceListener.onRequestFailed(int, String)>
	//*  54  131:return          
		// Misplaced declaration of an exception variable
		catch(Message message)
	//*  55  132:astore_1        
		{
			((Throwable) (message)).printStackTrace();
	//   56  133:aload_1         
	//   57  134:invokevirtual   #71  <Method void Throwable.printStackTrace()>
		}
		break MISSING_BLOCK_LABEL_137;
_L4:
		message = ((Message) ((String)message.obj));
		a.onRequestFailed(i, ((String) (message)));
		return;
		return;
	//   58  137:return          
	//   59  138:return          
	}

	private TraceListener a;

	public gk$c(Looper looper)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void Handler(Looper)>
	//    3    5:return          
	}
}
