// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.internal.Preconditions;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.gestures.GestureObserver;
import com.newrelic.agent.android.tracing.Trace;

public class SupportErrorDialogFragment extends DialogFragment
	implements TraceFieldInterface
{

	public SupportErrorDialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void DialogFragment()>
		mDialog = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field Dialog mDialog>
		zzap = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field android.content.DialogInterface$OnCancelListener zzap>
	//    8   14:return          
	}

	public static SupportErrorDialogFragment newInstance(Dialog dialog)
	{
		return newInstance(dialog, ((android.content.DialogInterface.OnCancelListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #27  <Method SupportErrorDialogFragment newInstance(Dialog, android.content.DialogInterface$OnCancelListener)>
	//    3    5:areturn         
	}

	public static SupportErrorDialogFragment newInstance(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		SupportErrorDialogFragment supporterrordialogfragment = new SupportErrorDialogFragment();
	//    0    0:new             #2   <Class SupportErrorDialogFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void SupportErrorDialogFragment()>
	//    3    7:astore_2        
		dialog = (Dialog)Preconditions.checkNotNull(((Object) (dialog)), "Cannot display null dialog");
	//    4    8:aload_0         
	//    5    9:ldc1            #30  <String "Cannot display null dialog">
	//    6   11:invokestatic    #36  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   14:checkcast       #38  <Class Dialog>
	//    8   17:astore_0        
		dialog.setOnCancelListener(((android.content.DialogInterface.OnCancelListener) (null)));
	//    9   18:aload_0         
	//   10   19:aconst_null     
	//   11   20:invokevirtual   #42  <Method void Dialog.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
		dialog.setOnDismissListener(((android.content.DialogInterface.OnDismissListener) (null)));
	//   12   23:aload_0         
	//   13   24:aconst_null     
	//   14   25:invokevirtual   #46  <Method void Dialog.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
		supporterrordialogfragment.mDialog = dialog;
	//   15   28:aload_2         
	//   16   29:aload_0         
	//   17   30:putfield        #19  <Field Dialog mDialog>
		if(oncancellistener != null)
	//*  18   33:aload_1         
	//*  19   34:ifnull          42
			supporterrordialogfragment.zzap = oncancellistener;
	//   20   37:aload_2         
	//   21   38:aload_1         
	//   22   39:putfield        #21  <Field android.content.DialogInterface$OnCancelListener zzap>
		return supporterrordialogfragment;
	//   23   42:aload_2         
	//   24   43:areturn         
	}

	public void onCancel(DialogInterface dialoginterface)
	{
		android.content.DialogInterface.OnCancelListener oncancellistener = zzap;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field android.content.DialogInterface$OnCancelListener zzap>
	//    2    4:astore_2        
		if(oncancellistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			oncancellistener.onCancel(dialoginterface);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #52  <Method void android.content.DialogInterface$OnCancelListener.onCancel(DialogInterface)>
	//    8   16:return          
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		if(mDialog == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Dialog mDialog>
	//*   2    4:ifnonnull       12
			setShowsDialog(false);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #58  <Method void setShowsDialog(boolean)>
		return mDialog;
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field Dialog mDialog>
	//    8   16:areturn         
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void DialogFragment.onStart()>
		GestureObserver.getInstance().onActivityOrFragmentStarted(((Object) (this)));
	//    2    4:invokestatic    #67  <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #71  <Method void GestureObserver.onActivityOrFragmentStarted(Object)>
	//    5   11:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void DialogFragment.onStop()>
		GestureObserver.getInstance().onActivityOrFragmentStopped(((Object) (this)));
	//    2    4:invokestatic    #67  <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #77  <Method void GestureObserver.onActivityOrFragmentStopped(Object)>
	//    5   11:return          
	}

	public void show(FragmentManager fragmentmanager, String s)
	{
		super.show(fragmentmanager, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #81  <Method void DialogFragment.show(FragmentManager, String)>
	//    4    6:return          
	}

	public Trace _nr_trace;
	private Dialog mDialog;
	private android.content.DialogInterface.OnCancelListener zzap;
}
