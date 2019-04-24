// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Message;

// Referenced classes of package android.support.design.widget:
//			SnackbarManager

class SnackbarManager$1
	implements android.os.Handler.Callback
{

	public boolean handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #26  <Field int Message.what>
		{
	//*   2    4:tableswitch     0 0: default 24
	//	               0 26
		default:
			return false;
	//    3   24:iconst_0        
	//    4   25:ireturn         

		case 0: // '\0'
			handleTimeout((ackbarRecord)message.obj);
	//    5   26:aload_0         
	//    6   27:getfield        #16  <Field SnackbarManager this$0>
	//    7   30:aload_1         
	//    8   31:getfield        #30  <Field Object Message.obj>
	//    9   34:checkcast       #32  <Class SnackbarManager$SnackbarRecord>
	//   10   37:invokevirtual   #36  <Method void SnackbarManager.handleTimeout(SnackbarManager$SnackbarRecord)>
			break;
		}
		return true;
	//   11   40:iconst_1        
	//   12   41:ireturn         
	}

	final SnackbarManager this$0;

	SnackbarManager$1()
	{
		this$0 = SnackbarManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field SnackbarManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
