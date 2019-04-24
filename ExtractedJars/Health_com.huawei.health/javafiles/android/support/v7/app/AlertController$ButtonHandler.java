// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.app:
//			AlertController

static final class AlertController$ButtonHandler extends Handler
{

	public void handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #33  <Field int Message.what>
		{
	//*   2    4:tableswitch     -3 1: default 40
	//	               -3 41
	//	               -2 41
	//	               -1 41
	//	               0 80
	//	               1 68
		default:
			return;
	//    3   40:return          

		case -3: 
		case -2: 
		case -1: 
			((android.content.r)message.obj).onClick((DialogInterface)mDialog.get(), message.what);
	//    4   41:aload_1         
	//    5   42:getfield        #37  <Field Object Message.obj>
	//    6   45:checkcast       #39  <Class android.content.DialogInterface$OnClickListener>
	//    7   48:aload_0         
	//    8   49:getfield        #25  <Field WeakReference mDialog>
	//    9   52:invokevirtual   #43  <Method Object WeakReference.get()>
	//   10   55:checkcast       #45  <Class DialogInterface>
	//   11   58:aload_1         
	//   12   59:getfield        #33  <Field int Message.what>
	//   13   62:invokeinterface #49  <Method void android.content.DialogInterface$OnClickListener.onClick(DialogInterface, int)>
			return;
	//   14   67:return          

		case 1: // '\001'
			((DialogInterface)message.obj).dismiss();
	//   15   68:aload_1         
	//   16   69:getfield        #37  <Field Object Message.obj>
	//   17   72:checkcast       #45  <Class DialogInterface>
	//   18   75:invokeinterface #52  <Method void DialogInterface.dismiss()>
			// fall through

		case 0: // '\0'
			return;
	//   19   80:return          
		}
	}

	private static final int MSG_DISMISS_DIALOG = 1;
	private WeakReference mDialog;

	public AlertController$ButtonHandler(DialogInterface dialoginterface)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Handler()>
		mDialog = new WeakReference(((Object) (dialoginterface)));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #23  <Method void WeakReference(Object)>
	//    7   13:putfield        #25  <Field WeakReference mDialog>
	//    8   16:return          
	}
}
