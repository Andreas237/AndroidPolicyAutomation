// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.p;
import android.support.v7.media.MediaRouteSelector;
import android.util.Log;

// Referenced classes of package android.support.v7.app:
//			MediaRouteCastDialog, MediaRouteControllerDialog

public class MediaRouteControllerDialogFragment extends p
{

	public MediaRouteControllerDialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void p()>
		setCancelable(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #34  <Method void setCancelable(boolean)>
	//    5    9:return          
	}

	private void ensureRouteSelector()
	{
		if(mSelector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field MediaRouteSelector mSelector>
	//*   2    4:ifnonnull       43
		{
			Bundle bundle = getArguments();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #41  <Method Bundle getArguments()>
	//    5   11:astore_1        
			if(bundle != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          29
				mSelector = MediaRouteSelector.fromBundle(bundle.getBundle("selector"));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:ldc1            #8   <String "selector">
	//   11   20:invokevirtual   #47  <Method Bundle Bundle.getBundle(String)>
	//   12   23:invokestatic    #53  <Method MediaRouteSelector MediaRouteSelector.fromBundle(Bundle)>
	//   13   26:putfield        #37  <Field MediaRouteSelector mSelector>
			if(mSelector == null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #37  <Field MediaRouteSelector mSelector>
	//*  16   33:ifnonnull       43
				mSelector = MediaRouteSelector.EMPTY;
	//   17   36:aload_0         
	//   18   37:getstatic       #56  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//   19   40:putfield        #37  <Field MediaRouteSelector mSelector>
		}
	//   20   43:return          
	}

	public MediaRouteSelector getRouteSelector()
	{
		ensureRouteSelector();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void ensureRouteSelector()>
		return mSelector;
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field MediaRouteSelector mSelector>
	//    4    8:areturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #64  <Method void p.onConfigurationChanged(Configuration)>
		configuration = ((Configuration) (mDialog));
	//    3    5:aload_0         
	//    4    6:getfield        #66  <Field Dialog mDialog>
	//    5    9:astore_1        
		if(configuration != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          35
		{
			if(USE_SUPPORT_DYNAMIC_GROUP)
	//*   8   14:getstatic       #26  <Field boolean USE_SUPPORT_DYNAMIC_GROUP>
	//*   9   17:ifeq            28
			{
				((MediaRouteCastDialog)configuration).updateLayout();
	//   10   20:aload_1         
	//   11   21:checkcast       #68  <Class MediaRouteCastDialog>
	//   12   24:invokevirtual   #71  <Method void MediaRouteCastDialog.updateLayout()>
				return;
	//   13   27:return          
			}
			((MediaRouteControllerDialog)configuration).updateLayout();
	//   14   28:aload_1         
	//   15   29:checkcast       #73  <Class MediaRouteControllerDialog>
	//   16   32:invokevirtual   #74  <Method void MediaRouteControllerDialog.updateLayout()>
		}
	//   17   35:return          
	}

	public MediaRouteCastDialog onCreateCastDialog(Context context)
	{
		return new MediaRouteCastDialog(context);
	//    0    0:new             #68  <Class MediaRouteCastDialog>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #79  <Method void MediaRouteCastDialog(Context)>
	//    4    8:areturn         
	}

	public MediaRouteControllerDialog onCreateControllerDialog(Context context, Bundle bundle)
	{
		return new MediaRouteControllerDialog(context);
	//    0    0:new             #73  <Class MediaRouteControllerDialog>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #82  <Method void MediaRouteControllerDialog(Context)>
	//    4    8:areturn         
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		if(USE_SUPPORT_DYNAMIC_GROUP)
	//*   0    0:getstatic       #26  <Field boolean USE_SUPPORT_DYNAMIC_GROUP>
	//*   1    3:ifeq            35
		{
			mDialog = ((Dialog) (onCreateCastDialog(getContext())));
	//    2    6:aload_0         
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #88  <Method Context getContext()>
	//    6   12:invokevirtual   #90  <Method MediaRouteCastDialog onCreateCastDialog(Context)>
	//    7   15:putfield        #66  <Field Dialog mDialog>
			((MediaRouteCastDialog)mDialog).setRouteSelector(mSelector);
	//    8   18:aload_0         
	//    9   19:getfield        #66  <Field Dialog mDialog>
	//   10   22:checkcast       #68  <Class MediaRouteCastDialog>
	//   11   25:aload_0         
	//   12   26:getfield        #37  <Field MediaRouteSelector mSelector>
	//   13   29:invokevirtual   #94  <Method void MediaRouteCastDialog.setRouteSelector(MediaRouteSelector)>
		} else
	//*  14   32:goto            48
		{
			mDialog = ((Dialog) (onCreateControllerDialog(getContext(), bundle)));
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:invokevirtual   #88  <Method Context getContext()>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #96  <Method MediaRouteControllerDialog onCreateControllerDialog(Context, Bundle)>
	//   21   45:putfield        #66  <Field Dialog mDialog>
		}
		return mDialog;
	//   22   48:aload_0         
	//   23   49:getfield        #66  <Field Dialog mDialog>
	//   24   52:areturn         
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void p.onStop()>
		Dialog dialog = mDialog;
	//    2    4:aload_0         
	//    3    5:getfield        #66  <Field Dialog mDialog>
	//    4    8:astore_1        
		if(dialog != null && !USE_SUPPORT_DYNAMIC_GROUP)
	//*   5    9:aload_1         
	//*   6   10:ifnull          27
	//*   7   13:getstatic       #26  <Field boolean USE_SUPPORT_DYNAMIC_GROUP>
	//*   8   16:ifne            27
			((MediaRouteControllerDialog)dialog).clearGroupListAnimation(false);
	//    9   19:aload_1         
	//   10   20:checkcast       #73  <Class MediaRouteControllerDialog>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #102 <Method void MediaRouteControllerDialog.clearGroupListAnimation(boolean)>
	//   13   27:return          
	}

	public void setRouteSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          82
		{
			ensureRouteSelector();
	//    2    4:aload_0         
	//    3    5:invokespecial   #60  <Method void ensureRouteSelector()>
			if(!mSelector.equals(((Object) (mediarouteselector))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #37  <Field MediaRouteSelector mSelector>
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #106 <Method boolean MediaRouteSelector.equals(Object)>
	//*   8   16:ifne            81
			{
				mSelector = mediarouteselector;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #37  <Field MediaRouteSelector mSelector>
				Bundle bundle = getArguments();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #41  <Method Bundle getArguments()>
	//   14   28:astore_3        
				Object obj = ((Object) (bundle));
	//   15   29:aload_3         
	//   16   30:astore_2        
				if(bundle == null)
	//*  17   31:aload_3         
	//*  18   32:ifnonnull       43
					obj = ((Object) (new Bundle()));
	//   19   35:new             #43  <Class Bundle>
	//   20   38:dup             
	//   21   39:invokespecial   #107 <Method void Bundle()>
	//   22   42:astore_2        
				((Bundle) (obj)).putBundle("selector", mediarouteselector.asBundle());
	//   23   43:aload_2         
	//   24   44:ldc1            #8   <String "selector">
	//   25   46:aload_1         
	//   26   47:invokevirtual   #110 <Method Bundle MediaRouteSelector.asBundle()>
	//   27   50:invokevirtual   #114 <Method void Bundle.putBundle(String, Bundle)>
				setArguments(((Bundle) (obj)));
	//   28   53:aload_0         
	//   29   54:aload_2         
	//   30   55:invokevirtual   #118 <Method void setArguments(Bundle)>
				obj = ((Object) (mDialog));
	//   31   58:aload_0         
	//   32   59:getfield        #66  <Field Dialog mDialog>
	//   33   62:astore_2        
				if(obj != null && USE_SUPPORT_DYNAMIC_GROUP)
	//*  34   63:aload_2         
	//*  35   64:ifnull          81
	//*  36   67:getstatic       #26  <Field boolean USE_SUPPORT_DYNAMIC_GROUP>
	//*  37   70:ifeq            81
					((MediaRouteCastDialog)obj).setRouteSelector(mediarouteselector);
	//   38   73:aload_2         
	//   39   74:checkcast       #68  <Class MediaRouteCastDialog>
	//   40   77:aload_1         
	//   41   78:invokevirtual   #94  <Method void MediaRouteCastDialog.setRouteSelector(MediaRouteSelector)>
			}
			return;
	//   42   81:return          
		} else
		{
			throw new IllegalArgumentException("selector must not be null");
	//   43   82:new             #120 <Class IllegalArgumentException>
	//   44   85:dup             
	//   45   86:ldc1            #122 <String "selector must not be null">
	//   46   88:invokespecial   #125 <Method void IllegalArgumentException(String)>
	//   47   91:athrow          
		}
	}

	private static final String ARGUMENT_SELECTOR = "selector";
	private static final boolean USE_SUPPORT_DYNAMIC_GROUP = Log.isLoggable("UseSupportDynamicGroup", 3);
	private Dialog mDialog;
	private MediaRouteSelector mSelector;

	static 
	{
	//    0    0:ldc1            #18  <String "UseSupportDynamicGroup">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #24  <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #26  <Field boolean USE_SUPPORT_DYNAMIC_GROUP>
	//*   4    9:return          
	}
}
