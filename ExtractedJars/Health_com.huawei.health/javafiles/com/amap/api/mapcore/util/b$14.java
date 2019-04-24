// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$14
	implements Runnable
{

	public void run()
	{
		Message message;
		com.amap.api.maps.model.Poi poi;
		message = Message.obtain();
	//    0    0:invokestatic    #33  <Method Message Message.obtain()>
	//    1    3:astore_1        
		poi = com.amap.api.mapcore.util.b.a(b, (int)a.getX(), (int)a.getY(), 25);
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field b b>
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field MotionEvent a>
	//    6   12:invokevirtual   #39  <Method float MotionEvent.getX()>
	//    7   15:f2i             
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field MotionEvent a>
	//   10   20:invokevirtual   #42  <Method float MotionEvent.getY()>
	//   11   23:f2i             
	//   12   24:bipush          25
	//   13   26:invokestatic    #45  <Method com.amap.api.maps.model.Poi b.a(b, int, int, int)>
	//   14   29:astore_2        
		if(com.amap.api.mapcore.util.b.k(b) == null)
			break MISSING_BLOCK_LABEL_84;
	//   15   30:aload_0         
	//   16   31:getfield        #18  <Field b b>
	//   17   34:invokestatic    #49  <Method com.amap.api.maps.AMap$OnPOIClickListener b.k(b)>
	//   18   37:ifnull          84
		if(poi != null)
	//*  19   40:aload_2         
	//*  20   41:ifnull          70
		{
			try
			{
				message.what = 20;
	//   21   44:aload_1         
	//   22   45:bipush          20
	//   23   47:putfield        #53  <Field int Message.what>
				message.obj = ((Object) (poi));
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:putfield        #57  <Field Object Message.obj>
				b.i.sendMessage(message);
	//   27   55:aload_0         
	//   28   56:getfield        #18  <Field b b>
	//   29   59:getfield        #61  <Field Handler b.i>
	//   30   62:aload_1         
	//   31   63:invokevirtual   #67  <Method boolean Handler.sendMessage(Message)>
	//   32   66:pop             
			}
	//*  33   67:goto            95
	//*  34   70:aload_0         
	//*  35   71:getfield        #18  <Field b b>
	//*  36   74:aload_0         
	//*  37   75:getfield        #20  <Field MotionEvent a>
	//*  38   78:invokestatic    #69  <Method void b.a(b, MotionEvent)>
	//*  39   81:goto            95
	//*  40   84:aload_0         
	//*  41   85:getfield        #18  <Field b b>
	//*  42   88:aload_0         
	//*  43   89:getfield        #20  <Field MotionEvent a>
	//*  44   92:invokestatic    #69  <Method void b.a(b, MotionEvent)>
	//*  45   95:return          
			catch(Throwable throwable)
	//*  46   96:astore_1        
			{
				throwable.printStackTrace();
	//   47   97:aload_1         
	//   48   98:invokevirtual   #72  <Method void Throwable.printStackTrace()>
				return;
	//   49  101:return          
			}
			break MISSING_BLOCK_LABEL_95;
		}
		com.amap.api.mapcore.util.b.a(b, a);
		break MISSING_BLOCK_LABEL_95;
		com.amap.api.mapcore.util.b.a(b, a);
	}

	final MotionEvent a;
	final b b;

	b$14(b b1, MotionEvent motionevent)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field b b>
		a = motionevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field MotionEvent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
