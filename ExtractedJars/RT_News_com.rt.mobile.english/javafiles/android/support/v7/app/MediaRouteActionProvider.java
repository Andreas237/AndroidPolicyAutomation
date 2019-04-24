// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.support.v4.view.ActionProvider;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.app:
//			MediaRouteDialogFactory, MediaRouteButton

public class MediaRouteActionProvider extends ActionProvider
{
	private static final class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
	{

		private void refreshRoute(MediaRouter mediarouter)
		{
			MediaRouteActionProvider mediarouteactionprovider = (MediaRouteActionProvider)mProviderWeak.get();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field WeakReference mProviderWeak>
		//    2    4:invokevirtual   #29  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class MediaRouteActionProvider>
		//    4   10:astore_2        
			if(mediarouteactionprovider != null)
		//*   5   11:aload_2         
		//*   6   12:ifnull          20
			{
				mediarouteactionprovider.refreshRoute();
		//    7   15:aload_2         
		//    8   16:invokevirtual   #31  <Method void MediaRouteActionProvider.refreshRoute()>
				return;
		//    9   19:return          
			} else
			{
				mediarouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (this)));
		//   10   20:aload_1         
		//   11   21:aload_0         
		//   12   22:invokevirtual   #37  <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
				return;
		//   13   25:return          
			}
		}

		public void onProviderAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
		{
			refreshRoute(mediarouter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #41  <Method void refreshRoute(MediaRouter)>
		//    3    5:return          
		}

		public void onProviderChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
		{
			refreshRoute(mediarouter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #41  <Method void refreshRoute(MediaRouter)>
		//    3    5:return          
		}

		public void onProviderRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
		{
			refreshRoute(mediarouter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #41  <Method void refreshRoute(MediaRouter)>
		//    3    5:return          
		}

		public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute(mediarouter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #41  <Method void refreshRoute(MediaRouter)>
		//    3    5:return          
		}

		public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute(mediarouter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #41  <Method void refreshRoute(MediaRouter)>
		//    3    5:return          
		}

		public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute(mediarouter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #41  <Method void refreshRoute(MediaRouter)>
		//    3    5:return          
		}

		private final WeakReference mProviderWeak;

		public MediaRouterCallback(MediaRouteActionProvider mediarouteactionprovider)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void android.support.v7.media.MediaRouter$Callback()>
			mProviderWeak = new WeakReference(((Object) (mediarouteactionprovider)));
		//    2    4:aload_0         
		//    3    5:new             #17  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #20  <Method void WeakReference(Object)>
		//    7   13:putfield        #22  <Field WeakReference mProviderWeak>
		//    8   16:return          
		}
	}


	public MediaRouteActionProvider(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void ActionProvider(Context)>
		mSelector = MediaRouteSelector.EMPTY;
	//    3    5:aload_0         
	//    4    6:getstatic       #30  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//    5    9:putfield        #32  <Field MediaRouteSelector mSelector>
		mDialogFactory = MediaRouteDialogFactory.getDefault();
	//    6   12:aload_0         
	//    7   13:invokestatic    #38  <Method MediaRouteDialogFactory MediaRouteDialogFactory.getDefault()>
	//    8   16:putfield        #40  <Field MediaRouteDialogFactory mDialogFactory>
		mRouter = MediaRouter.getInstance(context);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokestatic    #46  <Method MediaRouter MediaRouter.getInstance(Context)>
	//   12   24:putfield        #48  <Field MediaRouter mRouter>
	//   13   27:aload_0         
	//   14   28:new             #6   <Class MediaRouteActionProvider$MediaRouterCallback>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #51  <Method void MediaRouteActionProvider$MediaRouterCallback(MediaRouteActionProvider)>
	//   18   36:putfield        #53  <Field MediaRouteActionProvider$MediaRouterCallback mCallback>
	//   19   39:return          
	}

	public MediaRouteDialogFactory getDialogFactory()
	{
		return mDialogFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field MediaRouteDialogFactory mDialogFactory>
	//    2    4:areturn         
	}

	public MediaRouteButton getMediaRouteButton()
	{
		return mButton;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field MediaRouteButton mButton>
	//    2    4:areturn         
	}

	public MediaRouteSelector getRouteSelector()
	{
		return mSelector;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field MediaRouteSelector mSelector>
	//    2    4:areturn         
	}

	public boolean isVisible()
	{
		return mRouter.isRouteAvailable(mSelector, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field MediaRouter mRouter>
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field MediaRouteSelector mSelector>
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #70  <Method boolean MediaRouter.isRouteAvailable(MediaRouteSelector, int)>
	//    6   12:ireturn         
	}

	public View onCreateActionView()
	{
		if(mButton != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field MediaRouteButton mButton>
	//*   2    4:ifnull          15
			Log.e("MediaRouteActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
	//    3    7:ldc1            #11  <String "MediaRouteActionProvider">
	//    4    9:ldc1            #74  <String "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...">
	//    5   11:invokestatic    #80  <Method int Log.e(String, String)>
	//    6   14:pop             
		mButton = onCreateMediaRouteButton();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #83  <Method MediaRouteButton onCreateMediaRouteButton()>
	//   10   20:putfield        #62  <Field MediaRouteButton mButton>
		mButton.setCheatSheetEnabled(true);
	//   11   23:aload_0         
	//   12   24:getfield        #62  <Field MediaRouteButton mButton>
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #89  <Method void MediaRouteButton.setCheatSheetEnabled(boolean)>
		mButton.setRouteSelector(mSelector);
	//   15   31:aload_0         
	//   16   32:getfield        #62  <Field MediaRouteButton mButton>
	//   17   35:aload_0         
	//   18   36:getfield        #32  <Field MediaRouteSelector mSelector>
	//   19   39:invokevirtual   #93  <Method void MediaRouteButton.setRouteSelector(MediaRouteSelector)>
		mButton.setDialogFactory(mDialogFactory);
	//   20   42:aload_0         
	//   21   43:getfield        #62  <Field MediaRouteButton mButton>
	//   22   46:aload_0         
	//   23   47:getfield        #40  <Field MediaRouteDialogFactory mDialogFactory>
	//   24   50:invokevirtual   #97  <Method void MediaRouteButton.setDialogFactory(MediaRouteDialogFactory)>
		mButton.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -1));
	//   25   53:aload_0         
	//   26   54:getfield        #62  <Field MediaRouteButton mButton>
	//   27   57:new             #99  <Class android.view.ViewGroup$LayoutParams>
	//   28   60:dup             
	//   29   61:bipush          -2
	//   30   63:iconst_m1       
	//   31   64:invokespecial   #102 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   32   67:invokevirtual   #106 <Method void MediaRouteButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		return ((View) (mButton));
	//   33   70:aload_0         
	//   34   71:getfield        #62  <Field MediaRouteButton mButton>
	//   35   74:areturn         
	}

	public MediaRouteButton onCreateMediaRouteButton()
	{
		return new MediaRouteButton(getContext());
	//    0    0:new             #85  <Class MediaRouteButton>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #110 <Method Context getContext()>
	//    4    8:invokespecial   #111 <Method void MediaRouteButton(Context)>
	//    5   11:areturn         
	}

	public boolean onPerformDefaultAction()
	{
		if(mButton != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field MediaRouteButton mButton>
	//*   2    4:ifnull          15
			return mButton.showDialog();
	//    3    7:aload_0         
	//    4    8:getfield        #62  <Field MediaRouteButton mButton>
	//    5   11:invokevirtual   #115 <Method boolean MediaRouteButton.showDialog()>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
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
	//    1    1:invokevirtual   #121 <Method void refreshVisibility()>
	//    2    4:return          
	}

	public void setDialogFactory(MediaRouteDialogFactory mediaroutedialogfactory)
	{
		if(mediaroutedialogfactory == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("factory must not be null");
	//    2    4:new             #123 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #125 <String "factory must not be null">
	//    5   10:invokespecial   #128 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(mDialogFactory != mediaroutedialogfactory)
	//*   7   14:aload_0         
	//*   8   15:getfield        #40  <Field MediaRouteDialogFactory mDialogFactory>
	//*   9   18:aload_1         
	//*  10   19:if_acmpeq       42
		{
			mDialogFactory = mediaroutedialogfactory;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #40  <Field MediaRouteDialogFactory mDialogFactory>
			if(mButton != null)
	//*  14   27:aload_0         
	//*  15   28:getfield        #62  <Field MediaRouteButton mButton>
	//*  16   31:ifnull          42
				mButton.setDialogFactory(mediaroutedialogfactory);
	//   17   34:aload_0         
	//   18   35:getfield        #62  <Field MediaRouteButton mButton>
	//   19   38:aload_1         
	//   20   39:invokevirtual   #97  <Method void MediaRouteButton.setDialogFactory(MediaRouteDialogFactory)>
		}
	//   21   42:return          
	}

	public void setRouteSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("selector must not be null");
	//    2    4:new             #123 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #131 <String "selector must not be null">
	//    5   10:invokespecial   #128 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(!mSelector.equals(((Object) (mediarouteselector))))
	//*   7   14:aload_0         
	//*   8   15:getfield        #32  <Field MediaRouteSelector mSelector>
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #135 <Method boolean MediaRouteSelector.equals(Object)>
	//*  11   22:ifne            89
		{
			if(!mSelector.isEmpty())
	//*  12   25:aload_0         
	//*  13   26:getfield        #32  <Field MediaRouteSelector mSelector>
	//*  14   29:invokevirtual   #138 <Method boolean MediaRouteSelector.isEmpty()>
	//*  15   32:ifne            46
				mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//   16   35:aload_0         
	//   17   36:getfield        #48  <Field MediaRouter mRouter>
	//   18   39:aload_0         
	//   19   40:getfield        #53  <Field MediaRouteActionProvider$MediaRouterCallback mCallback>
	//   20   43:invokevirtual   #142 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
			if(!mediarouteselector.isEmpty())
	//*  21   46:aload_1         
	//*  22   47:invokevirtual   #138 <Method boolean MediaRouteSelector.isEmpty()>
	//*  23   50:ifne            65
				mRouter.addCallback(mediarouteselector, ((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//   24   53:aload_0         
	//   25   54:getfield        #48  <Field MediaRouter mRouter>
	//   26   57:aload_1         
	//   27   58:aload_0         
	//   28   59:getfield        #53  <Field MediaRouteActionProvider$MediaRouterCallback mCallback>
	//   29   62:invokevirtual   #146 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback)>
			mSelector = mediarouteselector;
	//   30   65:aload_0         
	//   31   66:aload_1         
	//   32   67:putfield        #32  <Field MediaRouteSelector mSelector>
			refreshRoute();
	//   33   70:aload_0         
	//   34   71:invokevirtual   #148 <Method void refreshRoute()>
			if(mButton != null)
	//*  35   74:aload_0         
	//*  36   75:getfield        #62  <Field MediaRouteButton mButton>
	//*  37   78:ifnull          89
				mButton.setRouteSelector(mediarouteselector);
	//   38   81:aload_0         
	//   39   82:getfield        #62  <Field MediaRouteButton mButton>
	//   40   85:aload_1         
	//   41   86:invokevirtual   #93  <Method void MediaRouteButton.setRouteSelector(MediaRouteSelector)>
		}
	//   42   89:return          
	}

	private static final String TAG = "MediaRouteActionProvider";
	private MediaRouteButton mButton;
	private final MediaRouterCallback mCallback = new MediaRouterCallback(this);
	private MediaRouteDialogFactory mDialogFactory;
	private final MediaRouter mRouter;
	private MediaRouteSelector mSelector;
}
