// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.media.MediaRouteSelector;

// Referenced classes of package android.support.v7.app:
//			MediaRouteChooserDialog

public class MediaRouteChooserDialogFragment extends DialogFragment
{

	public MediaRouteChooserDialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void DialogFragment()>
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <String "selector">
	//    4    7:putfield        #18  <Field String ARGUMENT_SELECTOR>
		setCancelable(true);
	//    5   10:aload_0         
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #22  <Method void setCancelable(boolean)>
	//    8   15:return          
	}

	private void ensureRouteSelector()
	{
		if(mSelector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field MediaRouteSelector mSelector>
	//*   2    4:ifnonnull       43
		{
			Bundle bundle = getArguments();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #30  <Method Bundle getArguments()>
	//    5   11:astore_1        
			if(bundle != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          29
				mSelector = MediaRouteSelector.fromBundle(bundle.getBundle("selector"));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:ldc1            #16  <String "selector">
	//   11   20:invokevirtual   #36  <Method Bundle Bundle.getBundle(String)>
	//   12   23:invokestatic    #42  <Method MediaRouteSelector MediaRouteSelector.fromBundle(Bundle)>
	//   13   26:putfield        #26  <Field MediaRouteSelector mSelector>
			if(mSelector == null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #26  <Field MediaRouteSelector mSelector>
	//*  16   33:ifnonnull       43
				mSelector = MediaRouteSelector.EMPTY;
	//   17   36:aload_0         
	//   18   37:getstatic       #45  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//   19   40:putfield        #26  <Field MediaRouteSelector mSelector>
		}
	//   20   43:return          
	}

	public MediaRouteSelector getRouteSelector()
	{
		ensureRouteSelector();
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void ensureRouteSelector()>
		return mSelector;
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field MediaRouteSelector mSelector>
	//    4    8:areturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void DialogFragment.onConfigurationChanged(Configuration)>
		if(mDialog != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #55  <Field MediaRouteChooserDialog mDialog>
	//*   5    9:ifnull          19
			mDialog.updateLayout();
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field MediaRouteChooserDialog mDialog>
	//    8   16:invokevirtual   #60  <Method void MediaRouteChooserDialog.updateLayout()>
	//    9   19:return          
	}

	public MediaRouteChooserDialog onCreateChooserDialog(Context context, Bundle bundle)
	{
		return new MediaRouteChooserDialog(context);
	//    0    0:new             #57  <Class MediaRouteChooserDialog>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #65  <Method void MediaRouteChooserDialog(Context)>
	//    4    8:areturn         
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		mDialog = onCreateChooserDialog(getContext(), bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #71  <Method Context getContext()>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #73  <Method MediaRouteChooserDialog onCreateChooserDialog(Context, Bundle)>
	//    6   10:putfield        #55  <Field MediaRouteChooserDialog mDialog>
		mDialog.setRouteSelector(getRouteSelector());
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field MediaRouteChooserDialog mDialog>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #75  <Method MediaRouteSelector getRouteSelector()>
	//   11   21:invokevirtual   #79  <Method void MediaRouteChooserDialog.setRouteSelector(MediaRouteSelector)>
		return ((Dialog) (mDialog));
	//   12   24:aload_0         
	//   13   25:getfield        #55  <Field MediaRouteChooserDialog mDialog>
	//   14   28:areturn         
	}

	public void setRouteSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("selector must not be null");
	//    2    4:new             #81  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #83  <String "selector must not be null">
	//    5   10:invokespecial   #86  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		ensureRouteSelector();
	//    7   14:aload_0         
	//    8   15:invokespecial   #49  <Method void ensureRouteSelector()>
		if(!mSelector.equals(((Object) (mediarouteselector))))
	//*   9   18:aload_0         
	//*  10   19:getfield        #26  <Field MediaRouteSelector mSelector>
	//*  11   22:aload_1         
	//*  12   23:invokevirtual   #90  <Method boolean MediaRouteSelector.equals(Object)>
	//*  13   26:ifne            85
		{
			mSelector = mediarouteselector;
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:putfield        #26  <Field MediaRouteSelector mSelector>
			Bundle bundle = getArguments();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #30  <Method Bundle getArguments()>
	//   19   38:astore_3        
			Object obj = ((Object) (bundle));
	//   20   39:aload_3         
	//   21   40:astore_2        
			if(bundle == null)
	//*  22   41:aload_3         
	//*  23   42:ifnonnull       53
				obj = ((Object) (new Bundle()));
	//   24   45:new             #32  <Class Bundle>
	//   25   48:dup             
	//   26   49:invokespecial   #91  <Method void Bundle()>
	//   27   52:astore_2        
			((Bundle) (obj)).putBundle("selector", mediarouteselector.asBundle());
	//   28   53:aload_2         
	//   29   54:ldc1            #16  <String "selector">
	//   30   56:aload_1         
	//   31   57:invokevirtual   #94  <Method Bundle MediaRouteSelector.asBundle()>
	//   32   60:invokevirtual   #98  <Method void Bundle.putBundle(String, Bundle)>
			setArguments(((Bundle) (obj)));
	//   33   63:aload_0         
	//   34   64:aload_2         
	//   35   65:invokevirtual   #102 <Method void setArguments(Bundle)>
			obj = ((Object) ((MediaRouteChooserDialog)getDialog()));
	//   36   68:aload_0         
	//   37   69:invokevirtual   #106 <Method Dialog getDialog()>
	//   38   72:checkcast       #57  <Class MediaRouteChooserDialog>
	//   39   75:astore_2        
			if(obj != null)
	//*  40   76:aload_2         
	//*  41   77:ifnull          85
				((MediaRouteChooserDialog) (obj)).setRouteSelector(mediarouteselector);
	//   42   80:aload_2         
	//   43   81:aload_1         
	//   44   82:invokevirtual   #79  <Method void MediaRouteChooserDialog.setRouteSelector(MediaRouteSelector)>
		}
	//   45   85:return          
	}

	private final String ARGUMENT_SELECTOR = "selector";
	private MediaRouteChooserDialog mDialog;
	private MediaRouteSelector mSelector;
}
