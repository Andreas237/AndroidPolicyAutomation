// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			ed

static class ed$c extends Handler
{

	public void handleMessage(Message message)
	{
		if(message.obj != null && (message.obj instanceof ed$b))
	//*   0    0:aload_1         
	//*   1    1:getfield        #20  <Field Object Message.obj>
	//*   2    4:ifnull          82
	//*   3    7:aload_1         
	//*   4    8:getfield        #20  <Field Object Message.obj>
	//*   5   11:instanceof      #22  <Class ed$b>
	//*   6   14:ifeq            82
		{
			ed$b ed$b1 = (ed$b)message.obj;
	//    7   17:aload_1         
	//    8   18:getfield        #20  <Field Object Message.obj>
	//    9   21:checkcast       #22  <Class ed$b>
	//   10   24:astore_2        
			switch(message.what)
	//*  11   25:aload_1         
	//*  12   26:getfield        #26  <Field int Message.what>
			{
	//*  13   29:lookupswitch    2: default 56
	//	               1: 57
	//	               2: 71
			default:
				return;
	//   14   56:return          

			case 1: // '\001'
				ed.c(ed$b1.a, ed$b1.b[0]);
	//   15   57:aload_2         
	//   16   58:getfield        #30  <Field ed ed$b.a>
	//   17   61:aload_2         
	//   18   62:getfield        #34  <Field Object[] ed$b.b>
	//   19   65:iconst_0        
	//   20   66:aaload          
	//   21   67:invokestatic    #37  <Method void ed.c(ed, Object)>
				return;
	//   22   70:return          

			case 2: // '\002'
				ed$b1.a.b(ed$b1.b);
	//   23   71:aload_2         
	//   24   72:getfield        #30  <Field ed ed$b.a>
	//   25   75:aload_2         
	//   26   76:getfield        #34  <Field Object[] ed$b.b>
	//   27   79:invokevirtual   #40  <Method void ed.b(Object[])>
				break;
			}
		}
	//   28   82:return          
	}

	public ed$c(Looper looper)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void Handler(Looper)>
	//    3    5:return          
	}
}
