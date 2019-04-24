// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.view:
//			c

private class c$b$a extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #35  <Field int Message.what>
		{
	//*   2    4:tableswitch     1 3: default 32
	//	               1 123
	//	               2 115
	//	               3 65
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    3   32:new             #37  <Class StringBuilder>
	//    4   35:dup             
	//    5   36:invokespecial   #38  <Method void StringBuilder()>
	//    6   39:astore_2        
			stringbuilder.append("Unknown message ");
	//    7   40:aload_2         
	//    8   41:ldc1            #40  <String "Unknown message ">
	//    9   43:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   10   46:pop             
			stringbuilder.append(((Object) (message)));
	//   11   47:aload_2         
	//   12   48:aload_1         
	//   13   49:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   14   52:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   15   53:new             #49  <Class RuntimeException>
	//   16   56:dup             
	//   17   57:aload_2         
	//   18   58:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   19   61:invokespecial   #56  <Method void RuntimeException(String)>
	//   20   64:athrow          

		case 3: // '\003'
			if(a.b != null)
	//*  21   65:aload_0         
	//*  22   66:getfield        #15  <Field c$b a>
	//*  23   69:getfield        #59  <Field android.view.GestureDetector$OnDoubleTapListener c$b.b>
	//*  24   72:ifnull          142
				if(!a.c)
	//*  25   75:aload_0         
	//*  26   76:getfield        #15  <Field c$b a>
	//*  27   79:getfield        #63  <Field boolean c$b.c>
	//*  28   82:ifne            106
				{
					a.b.onSingleTapConfirmed(a.e);
	//   29   85:aload_0         
	//   30   86:getfield        #15  <Field c$b a>
	//   31   89:getfield        #59  <Field android.view.GestureDetector$OnDoubleTapListener c$b.b>
	//   32   92:aload_0         
	//   33   93:getfield        #15  <Field c$b a>
	//   34   96:getfield        #67  <Field android.view.MotionEvent c$b.e>
	//   35   99:invokeinterface #73  <Method boolean android.view.GestureDetector$OnDoubleTapListener.onSingleTapConfirmed(android.view.MotionEvent)>
	//   36  104:pop             
					return;
	//   37  105:return          
				} else
				{
					a.d = true;
	//   38  106:aload_0         
	//   39  107:getfield        #15  <Field c$b a>
	//   40  110:iconst_1        
	//   41  111:putfield        #76  <Field boolean c$b.d>
					return;
	//   42  114:return          
				}
			break;

		case 2: // '\002'
			a.a();
	//   43  115:aload_0         
	//   44  116:getfield        #15  <Field c$b a>
	//   45  119:invokevirtual   #78  <Method void c$b.a()>
			return;
	//   46  122:return          

		case 1: // '\001'
			a.a.onShowPress(a.e);
	//   47  123:aload_0         
	//   48  124:getfield        #15  <Field c$b a>
	//   49  127:getfield        #81  <Field android.view.GestureDetector$OnGestureListener c$b.a>
	//   50  130:aload_0         
	//   51  131:getfield        #15  <Field c$b a>
	//   52  134:getfield        #67  <Field android.view.MotionEvent c$b.e>
	//   53  137:invokeinterface #87  <Method void android.view.GestureDetector$OnGestureListener.onShowPress(android.view.MotionEvent)>
			break;
		}
	//   54  142:return          
	}

	final c.b a;

	c$b$a(c.b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field c$b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Handler()>
	//    5    9:return          
	}

	c$b$a(c.b b1, Handler handler)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field c$b a>
		super(handler.getLooper());
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #24  <Method android.os.Looper Handler.getLooper()>
	//    6   10:invokespecial   #27  <Method void Handler(android.os.Looper)>
	//    7   13:return          
	}
}
