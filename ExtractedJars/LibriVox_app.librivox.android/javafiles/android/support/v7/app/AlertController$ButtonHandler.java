// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class AlertController$ButtonHandler extends Handler
{

	public void handleMessage(Message message)
	{
		int i = message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #29  <Field int Message.what>
	//    2    4:istore_2        
		if(i != 1)
	//*   3    5:iload_2         
	//*   4    6:iconst_1        
	//*   5    7:icmpeq          64
		{
			switch(i)
	//*   6   10:iload_2         
			{
	//*   7   11:tableswitch     -3 -1: default 36
	//	               -3 37
	//	               -2 37
	//	               -1 37
			default:
				return;
	//    8   36:return          

			case -3: 
			case -2: 
			case -1: 
				((android.content.r)message.obj).onClick((DialogInterface)mDialog.get(), message.what);
	//    9   37:aload_1         
	//   10   38:getfield        #33  <Field Object Message.obj>
	//   11   41:checkcast       #35  <Class android.content.DialogInterface$OnClickListener>
	//   12   44:aload_0         
	//   13   45:getfield        #21  <Field WeakReference mDialog>
	//   14   48:invokevirtual   #39  <Method Object WeakReference.get()>
	//   15   51:checkcast       #41  <Class DialogInterface>
	//   16   54:aload_1         
	//   17   55:getfield        #29  <Field int Message.what>
	//   18   58:invokeinterface #45  <Method void android.content.DialogInterface$OnClickListener.onClick(DialogInterface, int)>
				break;
			}
			return;
	//   19   63:return          
		} else
		{
			((DialogInterface)message.obj).dismiss();
	//   20   64:aload_1         
	//   21   65:getfield        #33  <Field Object Message.obj>
	//   22   68:checkcast       #41  <Class DialogInterface>
	//   23   71:invokeinterface #48  <Method void DialogInterface.dismiss()>
			return;
	//   24   76:return          
		}
	}

	private static final int MSG_DISMISS_DIALOG = 1;
	private WeakReference mDialog;

	public AlertController$ButtonHandler(DialogInterface dialoginterface)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Handler()>
		mDialog = new WeakReference(((Object) (dialoginterface)));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #19  <Method void WeakReference(Object)>
	//    7   13:putfield        #21  <Field WeakReference mDialog>
	//    8   16:return          
	}
}