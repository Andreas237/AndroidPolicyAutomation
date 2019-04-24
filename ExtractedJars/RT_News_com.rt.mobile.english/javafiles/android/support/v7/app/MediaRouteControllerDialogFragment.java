// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

public class MediaRouteControllerDialogFragment extends DialogFragment
{

	public MediaRouteControllerDialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void DialogFragment()>
		setCancelable(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #14  <Method void setCancelable(boolean)>
	//    5    9:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void DialogFragment.onConfigurationChanged(Configuration)>
		if(mDialog != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field MediaRouteControllerDialog mDialog>
	//*   5    9:ifnull          19
			mDialog.updateLayout();
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field MediaRouteControllerDialog mDialog>
	//    8   16:invokevirtual   #26  <Method void MediaRouteControllerDialog.updateLayout()>
	//    9   19:return          
	}

	public MediaRouteControllerDialog onCreateControllerDialog(Context context, Bundle bundle)
	{
		return new MediaRouteControllerDialog(context);
	//    0    0:new             #23  <Class MediaRouteControllerDialog>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #31  <Method void MediaRouteControllerDialog(Context)>
	//    4    8:areturn         
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		mDialog = onCreateControllerDialog(getContext(), bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #37  <Method Context getContext()>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #39  <Method MediaRouteControllerDialog onCreateControllerDialog(Context, Bundle)>
	//    6   10:putfield        #21  <Field MediaRouteControllerDialog mDialog>
		return ((Dialog) (mDialog));
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field MediaRouteControllerDialog mDialog>
	//    9   17:areturn         
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void DialogFragment.onStop()>
		if(mDialog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #21  <Field MediaRouteControllerDialog mDialog>
	//*   4    8:ifnull          19
			mDialog.clearGroupListAnimation(false);
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field MediaRouteControllerDialog mDialog>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #45  <Method void MediaRouteControllerDialog.clearGroupListAnimation(boolean)>
	//    9   19:return          
	}

	private MediaRouteControllerDialog mDialog;
}
