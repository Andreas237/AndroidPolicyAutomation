// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.Message;

// Referenced classes of package o:
//			x

class x$2
	implements android.os.ler.Callback
{

	public boolean handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #26  <Field int Message.what>
		{
	//*   2    4:lookupswitch    1: default 24
	//	               0: 27
	//*   3   24:goto            43
		case 0: // '\0'
			a.d((x$a)message.obj);
	//    4   27:aload_0         
	//    5   28:getfield        #16  <Field x a>
	//    6   31:aload_1         
	//    7   32:getfield        #30  <Field Object Message.obj>
	//    8   35:checkcast       #32  <Class x$a>
	//    9   38:invokevirtual   #36  <Method void x.d(x$a)>
			return true;
	//   10   41:iconst_1        
	//   11   42:ireturn         
		}
		return false;
	//   12   43:iconst_0        
	//   13   44:ireturn         
	}

	final x a;

	x$2(x x1)
	{
		a = x1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field x a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
