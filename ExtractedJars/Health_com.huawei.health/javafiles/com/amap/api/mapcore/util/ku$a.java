// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			ku

public final class ku$a extends Handler
{

	public final void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #24  <Field int Message.what>
		{
	//*   2    4:lookupswitch    1: default 24
	//	               1: 25
		default:
			return;
	//    3   24:return          

		case 1: // '\001'
			a.b();
	//    4   25:aload_0         
	//    5   26:getfield        #12  <Field ku a>
	//    6   29:invokevirtual   #28  <Method void ku.b()>
			break;
		}
	//    7   32:return          
	}

	final ku a;

	public ku$a(ku ku1, Looper looper)
	{
		a = ku1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ku a>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #15  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
