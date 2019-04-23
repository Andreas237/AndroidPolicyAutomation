// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.support.v4.view.d;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.util.Log;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			MediaRouteDialogFactory, MediaRouteButton

public class MediaRouteActionProvider extends d
{

	public MediaRouteActionProvider(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void d(Context)>
		mSelector = MediaRouteSelector.EMPTY;
	//    3    5:aload_0         
	//    4    6:getstatic       #27  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//    5    9:putfield        #29  <Field MediaRouteSelector mSelector>
		mDialogFactory = MediaRouteDialogFactory.getDefault();
	//    6   12:aload_0         
	//    7   13:invokestatic    #35  <Method MediaRouteDialogFactory MediaRouteDialogFactory.getDefault()>
	//    8   16:putfield        #37  <Field MediaRouteDialogFactory mDialogFactory>
		mRouter = MediaRouter.getInstance(context);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokestatic    #43  <Method MediaRouter MediaRouter.getInstance(Context)>
	//   12   24:putfield        #45  <Field MediaRouter mRouter>
	//   13   27:aload_0         
	//   14   28:new             #47  <Class MediaRouteActionProvider$MediaRouterCallback>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #50  <Method void MediaRouteActionProvider$MediaRouterCallback(MediaRouteActionProvider)>
	//   18   36:putfield        #52  <Field MediaRouteActionProvider$MediaRouterCallback mCallback>
	//   19   39:return          
	}

	public MediaRouteDialogFactory getDialogFactory()
	{
		return mDialogFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field MediaRouteDialogFactory mDialogFactory>
	//    2    4:areturn         
	}

	public MediaRouteButton getMediaRouteButton()
	{
		return mButton;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field MediaRouteButton mButton>
	//    2    4:areturn         
	}

	public MediaRouteSelector getRouteSelector()
	{
		return mSelector;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field MediaRouteSelector mSelector>
	//    2    4:areturn         
	}

	public boolean isVisible()
	{
		return mRouter.isRouteAvailable(mSelector, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field MediaRouter mRouter>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field MediaRouteSelector mSelector>
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #66  <Method boolean MediaRouter.isRouteAvailable(MediaRouteSelector, int)>
	//    6   12:ireturn         
	}

	public View onCreateActionView()
	{
		if(mButton != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field MediaRouteButton mButton>
	//*   2    4:ifnull          15
			Log.e("MediaRouteActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
	//    3    7:ldc1            #8   <String "MediaRouteActionProvider">
	//    4    9:ldc1            #70  <String "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...">
	//    5   11:invokestatic    #76  <Method int Log.e(String, String)>
	//    6   14:pop             
		mButton = onCreateMediaRouteButton();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #79  <Method MediaRouteButton onCreateMediaRouteButton()>
	//   10   20:putfield        #58  <Field MediaRouteButton mButton>
		mButton.setCheatSheetEnabled(true);
	//   11   23:aload_0         
	//   12   24:getfield        #58  <Field MediaRouteButton mButton>
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #85  <Method void MediaRouteButton.setCheatSheetEnabled(boolean)>
		mButton.setRouteSelector(mSelector);
	//   15   31:aload_0         
	//   16   32:getfield        #58  <Field MediaRouteButton mButton>
	//   17   35:aload_0         
	//   18   36:getfield        #29  <Field MediaRouteSelector mSelector>
	//   19   39:invokevirtual   #89  <Method void MediaRouteButton.setRouteSelector(MediaRouteSelector)>
		mButton.setDialogFactory(mDialogFactory);
	//   20   42:aload_0         
	//   21   43:getfield        #58  <Field MediaRouteButton mButton>
	//   22   46:aload_0         
	//   23   47:getfield        #37  <Field MediaRouteDialogFactory mDialogFactory>
	//   24   50:invokevirtual   #93  <Method void MediaRouteButton.setDialogFactory(MediaRouteDialogFactory)>
		mButton.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -1));
	//   25   53:aload_0         
	//   26   54:getfield        #58  <Field MediaRouteButton mButton>
	//   27   57:new             #95  <Class android.view.ViewGroup$LayoutParams>
	//   28   60:dup             
	//   29   61:bipush          -2
	//   30   63:iconst_m1       
	//   31   64:invokespecial   #98  <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   32   67:invokevirtual   #102 <Method void MediaRouteButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		return ((View) (mButton));
	//   33   70:aload_0         
	//   34   71:getfield        #58  <Field MediaRouteButton mButton>
	//   35   74:areturn         
	}

	public MediaRouteButton onCreateMediaRouteButton()
	{
		return new MediaRouteButton(getContext());
	//    0    0:new             #81  <Class MediaRouteButton>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #106 <Method Context getContext()>
	//    4    8:invokespecial   #107 <Method void MediaRouteButton(Context)>
	//    5   11:areturn         
	}

	public boolean onPerformDefaultAction()
	{
		MediaRouteButton mediaroutebutton = mButton;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field MediaRouteButton mButton>
	//    2    4:astore_1        
		if(mediaroutebutton != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return mediaroutebutton.showDialog();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #111 <Method boolean MediaRouteButton.showDialog()>
	//    7   13:ireturn         
		else
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean overridesItemVisibility()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	void refreshRoute()
	{
		refreshVisibility();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method void refreshVisibility()>
	//    2    4:return          
	}

	public void setDialogFactory(MediaRouteDialogFactory mediaroutedialogfactory)
	{
		if(mediaroutedialogfactory != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          32
		{
			if(mDialogFactory != mediaroutedialogfactory)
	//*   2    4:aload_0         
	//*   3    5:getfield        #37  <Field MediaRouteDialogFactory mDialogFactory>
	//*   4    8:aload_1         
	//*   5    9:if_acmpeq       31
			{
				mDialogFactory = mediaroutedialogfactory;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #37  <Field MediaRouteDialogFactory mDialogFactory>
				MediaRouteButton mediaroutebutton = mButton;
	//    9   17:aload_0         
	//   10   18:getfield        #58  <Field MediaRouteButton mButton>
	//   11   21:astore_2        
				if(mediaroutebutton != null)
	//*  12   22:aload_2         
	//*  13   23:ifnull          31
					mediaroutebutton.setDialogFactory(mediaroutedialogfactory);
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #93  <Method void MediaRouteButton.setDialogFactory(MediaRouteDialogFactory)>
			}
			return;
	//   17   31:return          
		} else
		{
			throw new IllegalArgumentException("factory must not be null");
	//   18   32:new             #119 <Class IllegalArgumentException>
	//   19   35:dup             
	//   20   36:ldc1            #121 <String "factory must not be null">
	//   21   38:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//   22   41:athrow          
		}
	}

	public void setRouteSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          79
		{
			if(!mSelector.equals(((Object) (mediarouteselector))))
	//*   2    4:aload_0         
	//*   3    5:getfield        #29  <Field MediaRouteSelector mSelector>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #128 <Method boolean MediaRouteSelector.equals(Object)>
	//*   6   12:ifne            78
			{
				if(!mSelector.isEmpty())
	//*   7   15:aload_0         
	//*   8   16:getfield        #29  <Field MediaRouteSelector mSelector>
	//*   9   19:invokevirtual   #131 <Method boolean MediaRouteSelector.isEmpty()>
	//*  10   22:ifne            36
					mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//   11   25:aload_0         
	//   12   26:getfield        #45  <Field MediaRouter mRouter>
	//   13   29:aload_0         
	//   14   30:getfield        #52  <Field MediaRouteActionProvider$MediaRouterCallback mCallback>
	//   15   33:invokevirtual   #135 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
				if(!mediarouteselector.isEmpty())
	//*  16   36:aload_1         
	//*  17   37:invokevirtual   #131 <Method boolean MediaRouteSelector.isEmpty()>
	//*  18   40:ifne            55
					mRouter.addCallback(mediarouteselector, ((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//   19   43:aload_0         
	//   20   44:getfield        #45  <Field MediaRouter mRouter>
	//   21   47:aload_1         
	//   22   48:aload_0         
	//   23   49:getfield        #52  <Field MediaRouteActionProvider$MediaRouterCallback mCallback>
	//   24   52:invokevirtual   #139 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback)>
				mSelector = mediarouteselector;
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:putfield        #29  <Field MediaRouteSelector mSelector>
				refreshRoute();
	//   28   60:aload_0         
	//   29   61:invokevirtual   #141 <Method void refreshRoute()>
				MediaRouteButton mediaroutebutton = mButton;
	//   30   64:aload_0         
	//   31   65:getfield        #58  <Field MediaRouteButton mButton>
	//   32   68:astore_2        
				if(mediaroutebutton != null)
	//*  33   69:aload_2         
	//*  34   70:ifnull          78
					mediaroutebutton.setRouteSelector(mediarouteselector);
	//   35   73:aload_2         
	//   36   74:aload_1         
	//   37   75:invokevirtual   #89  <Method void MediaRouteButton.setRouteSelector(MediaRouteSelector)>
			}
			return;
	//   38   78:return          
		} else
		{
			throw new IllegalArgumentException("selector must not be null");
	//   39   79:new             #119 <Class IllegalArgumentException>
	//   40   82:dup             
	//   41   83:ldc1            #143 <String "selector must not be null">
	//   42   85:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//   43   88:athrow          
		}
	}

	private static final String TAG = "MediaRouteActionProvider";
	private MediaRouteButton mButton;
	private final MediaRouterCallback mCallback = new MediaRouterCallback();
	private MediaRouteDialogFactory mDialogFactory;
	private final MediaRouter mRouter;
	private MediaRouteSelector mSelector;

	private class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
	{

		private void refreshRoute(MediaRouter mediarouter)
		{
			MediaRouteActionProvider mediarouteactionprovider = (MediaRouteActionProvider)mProviderWeak.get();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field WeakReference mProviderWeak>
		//    2    4:invokevirtual   #25  <Method Object WeakReference.get()>
		//    3    7:checkcast       #27  <Class MediaRouteActionProvider>
		//    4   10:astore_2        
			if(mediarouteactionprovider != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          20
			{
				mediarouteactionprovider.refreshRoute();
		//    7   15:aload_2         
		//    8   16:invokevirtual   #29  <Method void MediaRouteActionProvider.refreshRoute()>
				return;
		//    9   19:return          
			} else
			{
				mediarouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (this)));
		//   10   20:aload_1         
		//   11   21:aload_0         
		//   12   22:invokevirtual   #35  <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
				return;
		//   13   25:return          
			}
		}

		public void onProviderAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
		{
			refreshRoute(mediarouter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #39  <Method void refreshRoute(MediaRouter)>
		//    3    5:return          
		}

		public void onProviderChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
		{
			refreshRoute(mediarouter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #39  <Method void refreshRoute(MediaRouter)>
		//    3    5:return          
		}

		public void onProviderRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
		{
			refreshRoute(mediarouter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #39  <Method void refreshRoute(MediaRouter)>
		//    3    5:return          
		}

		public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute(mediarouter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #39  <Method void refreshRoute(MediaRouter)>
		//    3    5:return          
		}

		public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute(mediarouter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #39  <Method void refreshRoute(MediaRouter)>
		//    3    5:return          
		}

		public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute(mediarouter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #39  <Method void refreshRoute(MediaRouter)>
		//    3    5:return          
		}

		private final WeakReference mProviderWeak;

		public MediaRouterCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void android.support.v7.media.MediaRouter$Callback()>
			mProviderWeak = new WeakReference(((Object) (MediaRouteActionProvider.this)));
		//    2    4:aload_0         
		//    3    5:new             #13  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #16  <Method void WeakReference(Object)>
		//    7   13:putfield        #18  <Field WeakReference mProviderWeak>
		//    8   16:return          
		}
	}

}
