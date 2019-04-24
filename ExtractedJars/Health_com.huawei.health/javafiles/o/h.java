// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.a.a.b.a;
import android.os.*;

public class h extends Handler
{

	public h(a a1, Looper looper)
	{
		b = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field a b>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void Handler(Looper)>
	//    6   10:return          
	}

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #22  <Field int Message.what>
		{
	//*   2    4:lookupswitch    1: default 24
	//	               1: 27
	//*   3   24:goto            35
		case 1: // '\001'
			a.a(b);
	//    4   27:aload_0         
	//    5   28:getfield        #10  <Field a b>
	//    6   31:invokestatic    #28  <Method void a.a(a)>
			return;
	//    7   34:return          
		}
		super.handleMessage(message);
	//    8   35:aload_0         
	//    9   36:aload_1         
	//   10   37:invokespecial   #30  <Method void Handler.handleMessage(Message)>
	//   11   40:return          
	}

	final a b;
}
