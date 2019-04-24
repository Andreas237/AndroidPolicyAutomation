// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$15
	implements Runnable
{

	public void run()
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #32  <Method Message Message.obtain()>
	//    1    3:astore_1        
		message.what = 19;
	//    2    4:aload_1         
	//    3    5:bipush          19
	//    4    7:putfield        #36  <Field int Message.what>
		message.arg1 = (int)a.getX();
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #21  <Field MotionEvent a>
	//    8   15:invokevirtual   #42  <Method float MotionEvent.getX()>
	//    9   18:f2i             
	//   10   19:putfield        #45  <Field int Message.arg1>
		message.arg2 = (int)a.getY();
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #21  <Field MotionEvent a>
	//   14   27:invokevirtual   #48  <Method float MotionEvent.getY()>
	//   15   30:f2i             
	//   16   31:putfield        #51  <Field int Message.arg2>
		b.i.sendMessage(message);
	//   17   34:aload_0         
	//   18   35:getfield        #19  <Field b b>
	//   19   38:getfield        #55  <Field Handler b.i>
	//   20   41:aload_1         
	//   21   42:invokevirtual   #61  <Method boolean Handler.sendMessage(Message)>
	//   22   45:pop             
	//   23   46:return          
	}

	final MotionEvent a;
	final b b;

	b$15(b b1, MotionEvent motionevent)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field b b>
		a = motionevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field MotionEvent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
