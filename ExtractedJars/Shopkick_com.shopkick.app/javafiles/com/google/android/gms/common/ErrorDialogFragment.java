// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.*;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

public class ErrorDialogFragment extends DialogFragment
{

	public ErrorDialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void DialogFragment()>
		mDialog = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #14  <Field Dialog mDialog>
		zaan = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field android.content.DialogInterface$OnCancelListener zaan>
	//    8   14:return          
	}

	public static ErrorDialogFragment newInstance(Dialog dialog)
	{
		return newInstance(dialog, ((android.content.DialogInterface.OnCancelListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #22  <Method ErrorDialogFragment newInstance(Dialog, android.content.DialogInterface$OnCancelListener)>
	//    3    5:areturn         
	}

	public static ErrorDialogFragment newInstance(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		ErrorDialogFragment errordialogfragment = new ErrorDialogFragment();
	//    0    0:new             #2   <Class ErrorDialogFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ErrorDialogFragment()>
	//    3    7:astore_2        
		dialog = (Dialog)Preconditions.checkNotNull(((Object) (dialog)), "Cannot display null dialog");
	//    4    8:aload_0         
	//    5    9:ldc1            #25  <String "Cannot display null dialog">
	//    6   11:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   14:checkcast       #33  <Class Dialog>
	//    8   17:astore_0        
		dialog.setOnCancelListener(((android.content.DialogInterface.OnCancelListener) (null)));
	//    9   18:aload_0         
	//   10   19:aconst_null     
	//   11   20:invokevirtual   #37  <Method void Dialog.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
		dialog.setOnDismissListener(((android.content.DialogInterface.OnDismissListener) (null)));
	//   12   23:aload_0         
	//   13   24:aconst_null     
	//   14   25:invokevirtual   #41  <Method void Dialog.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
		errordialogfragment.mDialog = dialog;
	//   15   28:aload_2         
	//   16   29:aload_0         
	//   17   30:putfield        #14  <Field Dialog mDialog>
		if(oncancellistener != null)
	//*  18   33:aload_1         
	//*  19   34:ifnull          42
			errordialogfragment.zaan = oncancellistener;
	//   20   37:aload_2         
	//   21   38:aload_1         
	//   22   39:putfield        #16  <Field android.content.DialogInterface$OnCancelListener zaan>
		return errordialogfragment;
	//   23   42:aload_2         
	//   24   43:areturn         
	}

	public void onCancel(DialogInterface dialoginterface)
	{
		android.content.DialogInterface.OnCancelListener oncancellistener = zaan;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field android.content.DialogInterface$OnCancelListener zaan>
	//    2    4:astore_2        
		if(oncancellistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			oncancellistener.onCancel(dialoginterface);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #47  <Method void android.content.DialogInterface$OnCancelListener.onCancel(DialogInterface)>
	//    8   16:return          
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		if(mDialog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field Dialog mDialog>
	//*   2    4:ifnonnull       12
			setShowsDialog(false);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #53  <Method void setShowsDialog(boolean)>
		return mDialog;
	//    6   12:aload_0         
	//    7   13:getfield        #14  <Field Dialog mDialog>
	//    8   16:areturn         
	}

	public void show(FragmentManager fragmentmanager, String s)
	{
		super.show(fragmentmanager, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #57  <Method void DialogFragment.show(FragmentManager, String)>
	//    4    6:return          
	}

	private Dialog mDialog;
	private android.content.DialogInterface.OnCancelListener zaan;
}
