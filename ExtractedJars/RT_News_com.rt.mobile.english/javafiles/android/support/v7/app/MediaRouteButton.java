// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.*;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.widget.TooltipCompat;
import android.util.*;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			MediaRouterThemeHelper, MediaRouteDialogFactory, MediaRouteControllerDialogFragment, MediaRouteChooserDialogFragment

public class MediaRouteButton extends View
{
	private final class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
	{

		public void onProviderAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #22  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onProviderChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #22  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onProviderRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #22  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #22  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #22  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #22  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #22  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoute();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #22  <Method void MediaRouteButton.refreshRoute()>
		//    3    7:return          
		}

		final MediaRouteButton this$0;

		MediaRouterCallback()
		{
			this$0 = MediaRouteButton.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field MediaRouteButton this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void android.support.v7.media.MediaRouter$Callback()>
		//    5    9:return          
		}
	}

	private final class RemoteIndicatorLoader extends AsyncTask
	{

		private void cacheAndReset(Drawable drawable)
		{
			if(drawable != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          18
				MediaRouteButton.sRemoteIndicatorCache.put(mResId, ((Object) (drawable.getConstantState())));
		//    2    4:invokestatic    #28  <Method SparseArray MediaRouteButton.access$000()>
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field int mResId>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #34  <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
		//    7   15:invokevirtual   #40  <Method void SparseArray.put(int, Object)>
			mRemoteIndicatorLoader = null;
		//    8   18:aload_0         
		//    9   19:getfield        #16  <Field MediaRouteButton this$0>
		//   10   22:aconst_null     
		//   11   23:invokestatic    #44  <Method MediaRouteButton$RemoteIndicatorLoader MediaRouteButton.access$102(MediaRouteButton, MediaRouteButton$RemoteIndicatorLoader)>
		//   12   26:pop             
		//   13   27:return          
		}

		protected transient Drawable doInBackground(Void avoid[])
		{
			return getContext().getResources().getDrawable(mResId);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaRouteButton this$0>
		//    2    4:invokevirtual   #50  <Method Context MediaRouteButton.getContext()>
		//    3    7:invokevirtual   #56  <Method Resources Context.getResources()>
		//    4   10:aload_0         
		//    5   11:getfield        #21  <Field int mResId>
		//    6   14:invokevirtual   #62  <Method Drawable Resources.getDrawable(int)>
		//    7   17:areturn         
		}

		protected volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground((Void[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #65  <Class Void[]>
		//    3    5:invokevirtual   #67  <Method Drawable doInBackground(Void[])>
		//    4    8:areturn         
		}

		protected void onCancelled(Drawable drawable)
		{
			cacheAndReset(drawable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #70  <Method void cacheAndReset(Drawable)>
		//    3    5:return          
		}

		protected volatile void onCancelled(Object obj)
		{
			onCancelled((Drawable)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #30  <Class Drawable>
		//    3    5:invokevirtual   #73  <Method void onCancelled(Drawable)>
		//    4    8:return          
		}

		protected void onPostExecute(Drawable drawable)
		{
			cacheAndReset(drawable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #70  <Method void cacheAndReset(Drawable)>
			setRemoteIndicatorDrawable(drawable);
		//    3    5:aload_0         
		//    4    6:getfield        #16  <Field MediaRouteButton this$0>
		//    5    9:aload_1         
		//    6   10:invokevirtual   #77  <Method void MediaRouteButton.setRemoteIndicatorDrawable(Drawable)>
		//    7   13:return          
		}

		protected volatile void onPostExecute(Object obj)
		{
			onPostExecute((Drawable)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #30  <Class Drawable>
		//    3    5:invokevirtual   #79  <Method void onPostExecute(Drawable)>
		//    4    8:return          
		}

		private final int mResId;
		final MediaRouteButton this$0;

		RemoteIndicatorLoader(int i)
		{
			this$0 = MediaRouteButton.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MediaRouteButton this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void AsyncTask()>
			mResId = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int mResId>
		//    8   14:return          
		}
	}


	public MediaRouteButton(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #68  <Method void MediaRouteButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public MediaRouteButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.mediarouter.R.attr.mediaRouteButtonStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #73  <Field int android.support.v7.mediarouter.R$attr.mediaRouteButtonStyle>
	//    4    6:invokespecial   #76  <Method void MediaRouteButton(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public MediaRouteButton(Context context, AttributeSet attributeset, int i)
	{
		super(MediaRouterThemeHelper.createThemedButtonContext(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #82  <Method Context MediaRouterThemeHelper.createThemedButtonContext(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #83  <Method void View(Context, AttributeSet, int)>
		mSelector = MediaRouteSelector.EMPTY;
	//    6   10:aload_0         
	//    7   11:getstatic       #88  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//    8   14:putfield        #90  <Field MediaRouteSelector mSelector>
		mDialogFactory = MediaRouteDialogFactory.getDefault();
	//    9   17:aload_0         
	//   10   18:invokestatic    #96  <Method MediaRouteDialogFactory MediaRouteDialogFactory.getDefault()>
	//   11   21:putfield        #98  <Field MediaRouteDialogFactory mDialogFactory>
		context = getContext();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #102 <Method Context getContext()>
	//   14   28:astore_1        
		mRouter = MediaRouter.getInstance(context);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokestatic    #108 <Method MediaRouter MediaRouter.getInstance(Context)>
	//   18   34:putfield        #110 <Field MediaRouter mRouter>
		mCallback = new MediaRouterCallback();
	//   19   37:aload_0         
	//   20   38:new             #6   <Class MediaRouteButton$MediaRouterCallback>
	//   21   41:dup             
	//   22   42:aload_0         
	//   23   43:invokespecial   #113 <Method void MediaRouteButton$MediaRouterCallback(MediaRouteButton)>
	//   24   46:putfield        #115 <Field MediaRouteButton$MediaRouterCallback mCallback>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.mediarouter.R.styleable.MediaRouteButton, i, 0)));
	//   25   49:aload_1         
	//   26   50:aload_2         
	//   27   51:getstatic       #119 <Field int[] android.support.v7.mediarouter.R$styleable.MediaRouteButton>
	//   28   54:iload_3         
	//   29   55:iconst_0        
	//   30   56:invokevirtual   #125 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   31   59:astore_1        
		mButtonTint = ((TypedArray) (context)).getColorStateList(android.support.v7.mediarouter.R.styleable.MediaRouteButton_mediaRouteButtonTint);
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:getstatic       #128 <Field int android.support.v7.mediarouter.R$styleable.MediaRouteButton_mediaRouteButtonTint>
	//   35   65:invokevirtual   #134 <Method ColorStateList TypedArray.getColorStateList(int)>
	//   36   68:putfield        #136 <Field ColorStateList mButtonTint>
		mMinWidth = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.mediarouter.R.styleable.MediaRouteButton_android_minWidth, 0);
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:getstatic       #139 <Field int android.support.v7.mediarouter.R$styleable.MediaRouteButton_android_minWidth>
	//   40   76:iconst_0        
	//   41   77:invokevirtual   #143 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   42   80:putfield        #145 <Field int mMinWidth>
		mMinHeight = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.mediarouter.R.styleable.MediaRouteButton_android_minHeight, 0);
	//   43   83:aload_0         
	//   44   84:aload_1         
	//   45   85:getstatic       #148 <Field int android.support.v7.mediarouter.R$styleable.MediaRouteButton_android_minHeight>
	//   46   88:iconst_0        
	//   47   89:invokevirtual   #143 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   48   92:putfield        #150 <Field int mMinHeight>
		i = ((TypedArray) (context)).getResourceId(android.support.v7.mediarouter.R.styleable.MediaRouteButton_externalRouteEnabledDrawable, 0);
	//   49   95:aload_1         
	//   50   96:getstatic       #153 <Field int android.support.v7.mediarouter.R$styleable.MediaRouteButton_externalRouteEnabledDrawable>
	//   51   99:iconst_0        
	//   52  100:invokevirtual   #156 <Method int TypedArray.getResourceId(int, int)>
	//   53  103:istore_3        
		((TypedArray) (context)).recycle();
	//   54  104:aload_1         
	//   55  105:invokevirtual   #159 <Method void TypedArray.recycle()>
		if(i != 0)
	//*  56  108:iload_3         
	//*  57  109:ifeq            166
		{
			context = ((Context) ((android.graphics.drawable.Drawable.ConstantState)sRemoteIndicatorCache.get(i)));
	//   58  112:getstatic       #57  <Field SparseArray sRemoteIndicatorCache>
	//   59  115:iload_3         
	//   60  116:invokevirtual   #163 <Method Object SparseArray.get(int)>
	//   61  119:checkcast       #165 <Class android.graphics.drawable.Drawable$ConstantState>
	//   62  122:astore_1        
			if(context != null)
	//*  63  123:aload_1         
	//*  64  124:ifnull          138
			{
				setRemoteIndicatorDrawable(((android.graphics.drawable.Drawable.ConstantState) (context)).newDrawable());
	//   65  127:aload_0         
	//   66  128:aload_1         
	//   67  129:invokevirtual   #169 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   68  132:invokevirtual   #173 <Method void setRemoteIndicatorDrawable(Drawable)>
			} else
	//*  69  135:goto            166
			{
				mRemoteIndicatorLoader = new RemoteIndicatorLoader(i);
	//   70  138:aload_0         
	//   71  139:new             #9   <Class MediaRouteButton$RemoteIndicatorLoader>
	//   72  142:dup             
	//   73  143:aload_0         
	//   74  144:iload_3         
	//   75  145:invokespecial   #176 <Method void MediaRouteButton$RemoteIndicatorLoader(MediaRouteButton, int)>
	//   76  148:putfield        #178 <Field MediaRouteButton$RemoteIndicatorLoader mRemoteIndicatorLoader>
				mRemoteIndicatorLoader.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ((Object []) (new Void[0])));
	//   77  151:aload_0         
	//   78  152:getfield        #178 <Field MediaRouteButton$RemoteIndicatorLoader mRemoteIndicatorLoader>
	//   79  155:getstatic       #184 <Field java.util.concurrent.Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//   80  158:iconst_0        
	//   81  159:anewarray       Void[]
	//   82  162:invokevirtual   #190 <Method AsyncTask MediaRouteButton$RemoteIndicatorLoader.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   83  165:pop             
			}
		}
		updateContentDescription();
	//   84  166:aload_0         
	//   85  167:invokespecial   #193 <Method void updateContentDescription()>
		setClickable(true);
	//   86  170:aload_0         
	//   87  171:iconst_1        
	//   88  172:invokevirtual   #197 <Method void setClickable(boolean)>
	//   89  175:return          
	}

	private Activity getActivity()
	{
		for(Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #102 <Method Context getContext()>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:instanceof      #205 <Class ContextWrapper>
	//*   5    9:ifeq            35
			if(context instanceof Activity)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #207 <Class Activity>
	//*   8   16:ifeq            24
				return (Activity)context;
	//    9   19:aload_1         
	//   10   20:checkcast       #207 <Class Activity>
	//   11   23:areturn         

	//   12   24:aload_1         
	//   13   25:checkcast       #205 <Class ContextWrapper>
	//   14   28:invokevirtual   #210 <Method Context ContextWrapper.getBaseContext()>
	//   15   31:astore_1        
	//*  16   32:goto            5
		return null;
	//   17   35:aconst_null     
	//   18   36:areturn         
	}

	private FragmentManager getFragmentManager()
	{
		Activity activity = getActivity();
	//    0    0:aload_0         
	//    1    1:invokespecial   #214 <Method Activity getActivity()>
	//    2    4:astore_1        
		if(activity instanceof FragmentActivity)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #216 <Class FragmentActivity>
	//*   5    9:ifeq            20
			return ((FragmentActivity)activity).getSupportFragmentManager();
	//    6   12:aload_1         
	//    7   13:checkcast       #216 <Class FragmentActivity>
	//    8   16:invokevirtual   #219 <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	private void updateContentDescription()
	{
		int i;
		if(mIsConnecting)
	//*   0    0:aload_0         
	//*   1    1:getfield        #221 <Field boolean mIsConnecting>
	//*   2    4:ifeq            14
			i = android.support.v7.mediarouter.R.string.mr_cast_button_connecting;
	//    3    7:getstatic       #226 <Field int android.support.v7.mediarouter.R$string.mr_cast_button_connecting>
	//    4   10:istore_1        
		else
	//*   5   11:goto            32
		if(mRemoteActive)
	//*   6   14:aload_0         
	//*   7   15:getfield        #228 <Field boolean mRemoteActive>
	//*   8   18:ifeq            28
			i = android.support.v7.mediarouter.R.string.mr_cast_button_connected;
	//    9   21:getstatic       #231 <Field int android.support.v7.mediarouter.R$string.mr_cast_button_connected>
	//   10   24:istore_1        
		else
	//*  11   25:goto            32
			i = android.support.v7.mediarouter.R.string.mr_cast_button_disconnected;
	//   12   28:getstatic       #234 <Field int android.support.v7.mediarouter.R$string.mr_cast_button_disconnected>
	//   13   31:istore_1        
		setContentDescription(((CharSequence) (getContext().getString(i))));
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:invokevirtual   #102 <Method Context getContext()>
	//   17   37:iload_1         
	//   18   38:invokevirtual   #238 <Method String Context.getString(int)>
	//   19   41:invokevirtual   #242 <Method void setContentDescription(CharSequence)>
	//   20   44:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #245 <Method void View.drawableStateChanged()>
		if(mRemoteIndicator != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #247 <Field Drawable mRemoteIndicator>
	//*   4    8:ifnull          29
		{
			int ai[] = getDrawableState();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #251 <Method int[] getDrawableState()>
	//    7   15:astore_1        
			mRemoteIndicator.setState(ai);
	//    8   16:aload_0         
	//    9   17:getfield        #247 <Field Drawable mRemoteIndicator>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #257 <Method boolean Drawable.setState(int[])>
	//   12   24:pop             
			invalidate();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #260 <Method void invalidate()>
		}
	//   15   29:return          
	}

	public MediaRouteDialogFactory getDialogFactory()
	{
		return mDialogFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field MediaRouteDialogFactory mDialogFactory>
	//    2    4:areturn         
	}

	public MediaRouteSelector getRouteSelector()
	{
		return mSelector;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field MediaRouteSelector mSelector>
	//    2    4:areturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		if(getBackground() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #269 <Method Drawable getBackground()>
	//*   2    4:ifnull          14
			DrawableCompat.jumpToCurrentState(getBackground());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #269 <Method Drawable getBackground()>
	//    5   11:invokestatic    #274 <Method void DrawableCompat.jumpToCurrentState(Drawable)>
		if(mRemoteIndicator != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #247 <Field Drawable mRemoteIndicator>
	//*   8   18:ifnull          28
			DrawableCompat.jumpToCurrentState(mRemoteIndicator);
	//    9   21:aload_0         
	//   10   22:getfield        #247 <Field Drawable mRemoteIndicator>
	//   11   25:invokestatic    #274 <Method void DrawableCompat.jumpToCurrentState(Drawable)>
	//   12   28:return          
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #277 <Method void View.onAttachedToWindow()>
		mAttachedToWindow = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #279 <Field boolean mAttachedToWindow>
		if(!mSelector.isEmpty())
	//*   5    9:aload_0         
	//*   6   10:getfield        #90  <Field MediaRouteSelector mSelector>
	//*   7   13:invokevirtual   #283 <Method boolean MediaRouteSelector.isEmpty()>
	//*   8   16:ifne            34
			mRouter.addCallback(mSelector, ((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//    9   19:aload_0         
	//   10   20:getfield        #110 <Field MediaRouter mRouter>
	//   11   23:aload_0         
	//   12   24:getfield        #90  <Field MediaRouteSelector mSelector>
	//   13   27:aload_0         
	//   14   28:getfield        #115 <Field MediaRouteButton$MediaRouterCallback mCallback>
	//   15   31:invokevirtual   #287 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback)>
		refreshRoute();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #290 <Method void refreshRoute()>
	//   18   38:return          
	}

	protected int[] onCreateDrawableState(int i)
	{
		int ai[] = super.onCreateDrawableState(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #294 <Method int[] View.onCreateDrawableState(int)>
	//    5    7:astore_2        
		if(mIsConnecting)
	//*   6    8:aload_0         
	//*   7    9:getfield        #221 <Field boolean mIsConnecting>
	//*   8   12:ifeq            25
		{
			mergeDrawableStates(ai, CHECKABLE_STATE_SET);
	//    9   15:aload_2         
	//   10   16:getstatic       #63  <Field int[] CHECKABLE_STATE_SET>
	//   11   19:invokestatic    #298 <Method int[] mergeDrawableStates(int[], int[])>
	//   12   22:pop             
			return ai;
	//   13   23:aload_2         
	//   14   24:areturn         
		}
		if(mRemoteActive)
	//*  15   25:aload_0         
	//*  16   26:getfield        #228 <Field boolean mRemoteActive>
	//*  17   29:ifeq            40
			mergeDrawableStates(ai, CHECKED_STATE_SET);
	//   18   32:aload_2         
	//   19   33:getstatic       #60  <Field int[] CHECKED_STATE_SET>
	//   20   36:invokestatic    #298 <Method int[] mergeDrawableStates(int[], int[])>
	//   21   39:pop             
		return ai;
	//   22   40:aload_2         
	//   23   41:areturn         
	}

	public void onDetachedFromWindow()
	{
		mAttachedToWindow = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #279 <Field boolean mAttachedToWindow>
		if(!mSelector.isEmpty())
	//*   3    5:aload_0         
	//*   4    6:getfield        #90  <Field MediaRouteSelector mSelector>
	//*   5    9:invokevirtual   #283 <Method boolean MediaRouteSelector.isEmpty()>
	//*   6   12:ifne            26
			mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//    7   15:aload_0         
	//    8   16:getfield        #110 <Field MediaRouter mRouter>
	//    9   19:aload_0         
	//   10   20:getfield        #115 <Field MediaRouteButton$MediaRouterCallback mCallback>
	//   11   23:invokevirtual   #303 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
		super.onDetachedFromWindow();
	//   12   26:aload_0         
	//   13   27:invokespecial   #305 <Method void View.onDetachedFromWindow()>
	//   14   30:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #309 <Method void View.onDraw(Canvas)>
		if(mRemoteIndicator != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #247 <Field Drawable mRemoteIndicator>
	//*   5    9:ifnull          125
		{
			int j1 = getPaddingLeft();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #313 <Method int getPaddingLeft()>
	//    8   16:istore          7
			int k1 = getWidth();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #316 <Method int getWidth()>
	//   11   22:istore          8
			int l1 = getPaddingRight();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #319 <Method int getPaddingRight()>
	//   14   28:istore          9
			int k = getPaddingTop();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #322 <Method int getPaddingTop()>
	//   17   34:istore          4
			int l = getHeight();
	//   18   36:aload_0         
	//   19   37:invokevirtual   #325 <Method int getHeight()>
	//   20   40:istore          5
			int i1 = getPaddingBottom();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #328 <Method int getPaddingBottom()>
	//   23   46:istore          6
			int i = mRemoteIndicator.getIntrinsicWidth();
	//   24   48:aload_0         
	//   25   49:getfield        #247 <Field Drawable mRemoteIndicator>
	//   26   52:invokevirtual   #331 <Method int Drawable.getIntrinsicWidth()>
	//   27   55:istore_2        
			int j = mRemoteIndicator.getIntrinsicHeight();
	//   28   56:aload_0         
	//   29   57:getfield        #247 <Field Drawable mRemoteIndicator>
	//   30   60:invokevirtual   #334 <Method int Drawable.getIntrinsicHeight()>
	//   31   63:istore_3        
			j1 += (k1 - l1 - j1 - i) / 2;
	//   32   64:iload           7
	//   33   66:iload           8
	//   34   68:iload           9
	//   35   70:isub            
	//   36   71:iload           7
	//   37   73:isub            
	//   38   74:iload_2         
	//   39   75:isub            
	//   40   76:iconst_2        
	//   41   77:idiv            
	//   42   78:iadd            
	//   43   79:istore          7
			k += (l - i1 - k - j) / 2;
	//   44   81:iload           4
	//   45   83:iload           5
	//   46   85:iload           6
	//   47   87:isub            
	//   48   88:iload           4
	//   49   90:isub            
	//   50   91:iload_3         
	//   51   92:isub            
	//   52   93:iconst_2        
	//   53   94:idiv            
	//   54   95:iadd            
	//   55   96:istore          4
			mRemoteIndicator.setBounds(j1, k, i + j1, j + k);
	//   56   98:aload_0         
	//   57   99:getfield        #247 <Field Drawable mRemoteIndicator>
	//   58  102:iload           7
	//   59  104:iload           4
	//   60  106:iload_2         
	//   61  107:iload           7
	//   62  109:iadd            
	//   63  110:iload_3         
	//   64  111:iload           4
	//   65  113:iadd            
	//   66  114:invokevirtual   #338 <Method void Drawable.setBounds(int, int, int, int)>
			mRemoteIndicator.draw(canvas);
	//   67  117:aload_0         
	//   68  118:getfield        #247 <Field Drawable mRemoteIndicator>
	//   69  121:aload_1         
	//   70  122:invokevirtual   #341 <Method void Drawable.draw(Canvas)>
		}
	//   71  125:return          
	}

	protected void onMeasure(int i, int j)
	{
		int l = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #349 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore          4
		int k = android.view.View.MeasureSpec.getSize(j);
	//    3    6:iload_2         
	//    4    7:invokestatic    #349 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_3        
		int l1 = android.view.View.MeasureSpec.getMode(i);
	//    6   11:iload_1         
	//    7   12:invokestatic    #352 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   15:istore          8
		int k1 = android.view.View.MeasureSpec.getMode(j);
	//    9   17:iload_2         
	//   10   18:invokestatic    #352 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   11   21:istore          7
		int i1 = mMinWidth;
	//   12   23:aload_0         
	//   13   24:getfield        #145 <Field int mMinWidth>
	//   14   27:istore          5
		Drawable drawable = mRemoteIndicator;
	//   15   29:aload_0         
	//   16   30:getfield        #247 <Field Drawable mRemoteIndicator>
	//   17   33:astore          9
		j = 0;
	//   18   35:iconst_0        
	//   19   36:istore_2        
		if(drawable != null)
	//*  20   37:aload           9
	//*  21   39:ifnull          63
			i = mRemoteIndicator.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight();
	//   22   42:aload_0         
	//   23   43:getfield        #247 <Field Drawable mRemoteIndicator>
	//   24   46:invokevirtual   #331 <Method int Drawable.getIntrinsicWidth()>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #313 <Method int getPaddingLeft()>
	//   27   53:iadd            
	//   28   54:aload_0         
	//   29   55:invokevirtual   #319 <Method int getPaddingRight()>
	//   30   58:iadd            
	//   31   59:istore_1        
		else
	//*  32   60:goto            65
			i = 0;
	//   33   63:iconst_0        
	//   34   64:istore_1        
		i1 = Math.max(i1, i);
	//   35   65:iload           5
	//   36   67:iload_1         
	//   37   68:invokestatic    #357 <Method int Math.max(int, int)>
	//   38   71:istore          5
		int j1 = mMinHeight;
	//   39   73:aload_0         
	//   40   74:getfield        #150 <Field int mMinHeight>
	//   41   77:istore          6
		i = j;
	//   42   79:iload_2         
	//   43   80:istore_1        
		if(mRemoteIndicator != null)
	//*  44   81:aload_0         
	//*  45   82:getfield        #247 <Field Drawable mRemoteIndicator>
	//*  46   85:ifnull          106
			i = mRemoteIndicator.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom();
	//   47   88:aload_0         
	//   48   89:getfield        #247 <Field Drawable mRemoteIndicator>
	//   49   92:invokevirtual   #334 <Method int Drawable.getIntrinsicHeight()>
	//   50   95:aload_0         
	//   51   96:invokevirtual   #322 <Method int getPaddingTop()>
	//   52   99:iadd            
	//   53  100:aload_0         
	//   54  101:invokevirtual   #328 <Method int getPaddingBottom()>
	//   55  104:iadd            
	//   56  105:istore_1        
		j1 = Math.max(j1, i);
	//   57  106:iload           6
	//   58  108:iload_1         
	//   59  109:invokestatic    #357 <Method int Math.max(int, int)>
	//   60  112:istore          6
		if(l1 != 0x80000000)
	//*  61  114:iload           8
	//*  62  116:ldc2            #358 <Int 0x80000000>
	//*  63  119:icmpeq          139
		{
			i = l;
	//   64  122:iload           4
	//   65  124:istore_1        
			if(l1 != 0x40000000)
	//*  66  125:iload           8
	//*  67  127:ldc2            #359 <Int 0x40000000>
	//*  68  130:icmpeq          147
				i = i1;
	//   69  133:iload           5
	//   70  135:istore_1        
		} else
	//*  71  136:goto            147
		{
			i = Math.min(l, i1);
	//   72  139:iload           4
	//   73  141:iload           5
	//   74  143:invokestatic    #362 <Method int Math.min(int, int)>
	//   75  146:istore_1        
		}
		if(k1 != 0x80000000)
	//*  76  147:iload           7
	//*  77  149:ldc2            #358 <Int 0x80000000>
	//*  78  152:icmpeq          171
		{
			j = k;
	//   79  155:iload_3         
	//   80  156:istore_2        
			if(k1 != 0x40000000)
	//*  81  157:iload           7
	//*  82  159:ldc2            #359 <Int 0x40000000>
	//*  83  162:icmpeq          178
				j = j1;
	//   84  165:iload           6
	//   85  167:istore_2        
		} else
	//*  86  168:goto            178
		{
			j = Math.min(k, j1);
	//   87  171:iload_3         
	//   88  172:iload           6
	//   89  174:invokestatic    #362 <Method int Math.min(int, int)>
	//   90  177:istore_2        
		}
		setMeasuredDimension(i, j);
	//   91  178:aload_0         
	//   92  179:iload_1         
	//   93  180:iload_2         
	//   94  181:invokevirtual   #365 <Method void setMeasuredDimension(int, int)>
	//   95  184:return          
	}

	public boolean performClick()
	{
		boolean flag1 = super.performClick();
	//    0    0:aload_0         
	//    1    1:invokespecial   #368 <Method boolean View.performClick()>
	//    2    4:istore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(!flag1)
	//*   5    7:iload_2         
	//*   6    8:ifne            16
			playSoundEffect(0);
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #371 <Method void playSoundEffect(int)>
		if(showDialog() || flag1)
	//*  10   16:aload_0         
	//*  11   17:invokevirtual   #374 <Method boolean showDialog()>
	//*  12   20:ifne            27
	//*  13   23:iload_2         
	//*  14   24:ifeq            29
			flag = true;
	//   15   27:iconst_1        
	//   16   28:istore_1        
		return flag;
	//   17   29:iload_1         
	//   18   30:ireturn         
	}

	void refreshRoute()
	{
		android.support.v7.media.MediaRouter.RouteInfo routeinfo = mRouter.getSelectedRoute();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field MediaRouter mRouter>
	//    2    4:invokevirtual   #378 <Method android.support.v7.media.MediaRouter$RouteInfo MediaRouter.getSelectedRoute()>
	//    3    7:astore          4
		boolean flag1 = routeinfo.isDefaultOrBluetooth();
	//    4    9:aload           4
	//    5   11:invokevirtual   #383 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isDefaultOrBluetooth()>
	//    6   14:istore_2        
		boolean flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_1        
		if(!flag1 && routeinfo.matchesSelector(mSelector))
	//*   9   17:iload_2         
	//*  10   18:ifne            38
	//*  11   21:aload           4
	//*  12   23:aload_0         
	//*  13   24:getfield        #90  <Field MediaRouteSelector mSelector>
	//*  14   27:invokevirtual   #387 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.matchesSelector(MediaRouteSelector)>
	//*  15   30:ifeq            38
			flag1 = true;
	//   16   33:iconst_1        
	//   17   34:istore_2        
		else
	//*  18   35:goto            40
			flag1 = false;
	//   19   38:iconst_0        
	//   20   39:istore_2        
		boolean flag2;
		if(flag1 && routeinfo.isConnecting())
	//*  21   40:iload_2         
	//*  22   41:ifeq            57
	//*  23   44:aload           4
	//*  24   46:invokevirtual   #390 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isConnecting()>
	//*  25   49:ifeq            57
			flag2 = true;
	//   26   52:iconst_1        
	//   27   53:istore_3        
		else
	//*  28   54:goto            59
			flag2 = false;
	//   29   57:iconst_0        
	//   30   58:istore_3        
		if(mRemoteActive != flag1)
	//*  31   59:aload_0         
	//*  32   60:getfield        #228 <Field boolean mRemoteActive>
	//*  33   63:iload_2         
	//*  34   64:icmpeq          74
		{
			mRemoteActive = flag1;
	//   35   67:aload_0         
	//   36   68:iload_2         
	//   37   69:putfield        #228 <Field boolean mRemoteActive>
			flag = true;
	//   38   72:iconst_1        
	//   39   73:istore_1        
		}
		if(mIsConnecting != flag2)
	//*  40   74:aload_0         
	//*  41   75:getfield        #221 <Field boolean mIsConnecting>
	//*  42   78:iload_3         
	//*  43   79:icmpeq          89
		{
			mIsConnecting = flag2;
	//   44   82:aload_0         
	//   45   83:iload_3         
	//   46   84:putfield        #221 <Field boolean mIsConnecting>
			flag = true;
	//   47   87:iconst_1        
	//   48   88:istore_1        
		}
		if(flag)
	//*  49   89:iload_1         
	//*  50   90:ifeq            101
		{
			updateContentDescription();
	//   51   93:aload_0         
	//   52   94:invokespecial   #193 <Method void updateContentDescription()>
			refreshDrawableState();
	//   53   97:aload_0         
	//   54   98:invokevirtual   #393 <Method void refreshDrawableState()>
		}
		if(mAttachedToWindow)
	//*  55  101:aload_0         
	//*  56  102:getfield        #279 <Field boolean mAttachedToWindow>
	//*  57  105:ifeq            124
			setEnabled(mRouter.isRouteAvailable(mSelector, 1));
	//   58  108:aload_0         
	//   59  109:aload_0         
	//   60  110:getfield        #110 <Field MediaRouter mRouter>
	//   61  113:aload_0         
	//   62  114:getfield        #90  <Field MediaRouteSelector mSelector>
	//   63  117:iconst_1        
	//   64  118:invokevirtual   #397 <Method boolean MediaRouter.isRouteAvailable(MediaRouteSelector, int)>
	//   65  121:invokevirtual   #400 <Method void setEnabled(boolean)>
		if(mRemoteIndicator != null && (mRemoteIndicator.getCurrent() instanceof AnimationDrawable))
	//*  66  124:aload_0         
	//*  67  125:getfield        #247 <Field Drawable mRemoteIndicator>
	//*  68  128:ifnull          219
	//*  69  131:aload_0         
	//*  70  132:getfield        #247 <Field Drawable mRemoteIndicator>
	//*  71  135:invokevirtual   #403 <Method Drawable Drawable.getCurrent()>
	//*  72  138:instanceof      #405 <Class AnimationDrawable>
	//*  73  141:ifeq            219
		{
			AnimationDrawable animationdrawable = (AnimationDrawable)mRemoteIndicator.getCurrent();
	//   74  144:aload_0         
	//   75  145:getfield        #247 <Field Drawable mRemoteIndicator>
	//   76  148:invokevirtual   #403 <Method Drawable Drawable.getCurrent()>
	//   77  151:checkcast       #405 <Class AnimationDrawable>
	//   78  154:astore          4
			if(mAttachedToWindow)
	//*  79  156:aload_0         
	//*  80  157:getfield        #279 <Field boolean mAttachedToWindow>
	//*  81  160:ifeq            185
			{
				if((flag || flag2) && !animationdrawable.isRunning())
	//*  82  163:iload_1         
	//*  83  164:ifne            171
	//*  84  167:iload_3         
	//*  85  168:ifeq            219
	//*  86  171:aload           4
	//*  87  173:invokevirtual   #408 <Method boolean AnimationDrawable.isRunning()>
	//*  88  176:ifne            219
				{
					animationdrawable.start();
	//   89  179:aload           4
	//   90  181:invokevirtual   #411 <Method void AnimationDrawable.start()>
					return;
	//   91  184:return          
				}
			} else
			if(flag1 && !flag2)
	//*  92  185:iload_2         
	//*  93  186:ifeq            219
	//*  94  189:iload_3         
	//*  95  190:ifne            219
			{
				if(animationdrawable.isRunning())
	//*  96  193:aload           4
	//*  97  195:invokevirtual   #408 <Method boolean AnimationDrawable.isRunning()>
	//*  98  198:ifeq            206
					animationdrawable.stop();
	//   99  201:aload           4
	//  100  203:invokevirtual   #414 <Method void AnimationDrawable.stop()>
				animationdrawable.selectDrawable(animationdrawable.getNumberOfFrames() - 1);
	//  101  206:aload           4
	//  102  208:aload           4
	//  103  210:invokevirtual   #417 <Method int AnimationDrawable.getNumberOfFrames()>
	//  104  213:iconst_1        
	//  105  214:isub            
	//  106  215:invokevirtual   #421 <Method boolean AnimationDrawable.selectDrawable(int)>
	//  107  218:pop             
			}
		}
	//  108  219:return          
	}

	void setCheatSheetEnabled(boolean flag)
	{
		String s;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            18
			s = getContext().getString(android.support.v7.mediarouter.R.string.mr_button_content_description);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #102 <Method Context getContext()>
	//    4    8:getstatic       #425 <Field int android.support.v7.mediarouter.R$string.mr_button_content_description>
	//    5   11:invokevirtual   #238 <Method String Context.getString(int)>
	//    6   14:astore_2        
		else
	//*   7   15:goto            20
			s = null;
	//    8   18:aconst_null     
	//    9   19:astore_2        
		TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (s)));
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokestatic    #431 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
	//   13   25:return          
	}

	public void setDialogFactory(MediaRouteDialogFactory mediaroutedialogfactory)
	{
		if(mediaroutedialogfactory == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("factory must not be null");
	//    2    4:new             #435 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #437 <String "factory must not be null">
	//    5   11:invokespecial   #440 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			mDialogFactory = mediaroutedialogfactory;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #98  <Field MediaRouteDialogFactory mDialogFactory>
			return;
	//   10   20:return          
		}
	}

	public void setRemoteIndicatorDrawable(Drawable drawable)
	{
		if(mRemoteIndicatorLoader != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #178 <Field MediaRouteButton$RemoteIndicatorLoader mRemoteIndicatorLoader>
	//*   2    4:ifnull          16
			mRemoteIndicatorLoader.cancel(false);
	//    3    7:aload_0         
	//    4    8:getfield        #178 <Field MediaRouteButton$RemoteIndicatorLoader mRemoteIndicatorLoader>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #445 <Method boolean MediaRouteButton$RemoteIndicatorLoader.cancel(boolean)>
	//    7   15:pop             
		if(mRemoteIndicator != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #247 <Field Drawable mRemoteIndicator>
	//*  10   20:ifnull          39
		{
			mRemoteIndicator.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   11   23:aload_0         
	//   12   24:getfield        #247 <Field Drawable mRemoteIndicator>
	//   13   27:aconst_null     
	//   14   28:invokevirtual   #449 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mRemoteIndicator);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #247 <Field Drawable mRemoteIndicator>
	//   18   36:invokevirtual   #452 <Method void unscheduleDrawable(Drawable)>
		}
		Drawable drawable1 = drawable;
	//   19   39:aload_1         
	//   20   40:astore_3        
		if(drawable != null)
	//*  21   41:aload_1         
	//*  22   42:ifnull          105
		{
			drawable1 = drawable;
	//   23   45:aload_1         
	//   24   46:astore_3        
			if(mButtonTint != null)
	//*  25   47:aload_0         
	//*  26   48:getfield        #136 <Field ColorStateList mButtonTint>
	//*  27   51:ifnull          70
			{
				drawable1 = DrawableCompat.wrap(drawable.mutate());
	//   28   54:aload_1         
	//   29   55:invokevirtual   #455 <Method Drawable Drawable.mutate()>
	//   30   58:invokestatic    #459 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   31   61:astore_3        
				DrawableCompat.setTintList(drawable1, mButtonTint);
	//   32   62:aload_3         
	//   33   63:aload_0         
	//   34   64:getfield        #136 <Field ColorStateList mButtonTint>
	//   35   67:invokestatic    #463 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			}
			drawable1.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   36   70:aload_3         
	//   37   71:aload_0         
	//   38   72:invokevirtual   #449 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			drawable1.setState(getDrawableState());
	//   39   75:aload_3         
	//   40   76:aload_0         
	//   41   77:invokevirtual   #251 <Method int[] getDrawableState()>
	//   42   80:invokevirtual   #257 <Method boolean Drawable.setState(int[])>
	//   43   83:pop             
			boolean flag;
			if(getVisibility() == 0)
	//*  44   84:aload_0         
	//*  45   85:invokevirtual   #466 <Method int getVisibility()>
	//*  46   88:ifne            96
				flag = true;
	//   47   91:iconst_1        
	//   48   92:istore_2        
			else
	//*  49   93:goto            98
				flag = false;
	//   50   96:iconst_0        
	//   51   97:istore_2        
			drawable1.setVisible(flag, false);
	//   52   98:aload_3         
	//   53   99:iload_2         
	//   54  100:iconst_0        
	//   55  101:invokevirtual   #470 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   56  104:pop             
		}
		mRemoteIndicator = drawable1;
	//   57  105:aload_0         
	//   58  106:aload_3         
	//   59  107:putfield        #247 <Field Drawable mRemoteIndicator>
		refreshDrawableState();
	//   60  110:aload_0         
	//   61  111:invokevirtual   #393 <Method void refreshDrawableState()>
		if(mAttachedToWindow && mRemoteIndicator != null && (mRemoteIndicator.getCurrent() instanceof AnimationDrawable))
	//*  62  114:aload_0         
	//*  63  115:getfield        #279 <Field boolean mAttachedToWindow>
	//*  64  118:ifeq            200
	//*  65  121:aload_0         
	//*  66  122:getfield        #247 <Field Drawable mRemoteIndicator>
	//*  67  125:ifnull          200
	//*  68  128:aload_0         
	//*  69  129:getfield        #247 <Field Drawable mRemoteIndicator>
	//*  70  132:invokevirtual   #403 <Method Drawable Drawable.getCurrent()>
	//*  71  135:instanceof      #405 <Class AnimationDrawable>
	//*  72  138:ifeq            200
		{
			drawable = ((Drawable) ((AnimationDrawable)mRemoteIndicator.getCurrent()));
	//   73  141:aload_0         
	//   74  142:getfield        #247 <Field Drawable mRemoteIndicator>
	//   75  145:invokevirtual   #403 <Method Drawable Drawable.getCurrent()>
	//   76  148:checkcast       #405 <Class AnimationDrawable>
	//   77  151:astore_1        
			if(mIsConnecting)
	//*  78  152:aload_0         
	//*  79  153:getfield        #221 <Field boolean mIsConnecting>
	//*  80  156:ifeq            171
			{
				if(!((AnimationDrawable) (drawable)).isRunning())
	//*  81  159:aload_1         
	//*  82  160:invokevirtual   #408 <Method boolean AnimationDrawable.isRunning()>
	//*  83  163:ifne            200
				{
					((AnimationDrawable) (drawable)).start();
	//   84  166:aload_1         
	//   85  167:invokevirtual   #411 <Method void AnimationDrawable.start()>
					return;
	//   86  170:return          
				}
			} else
			if(mRemoteActive)
	//*  87  171:aload_0         
	//*  88  172:getfield        #228 <Field boolean mRemoteActive>
	//*  89  175:ifeq            200
			{
				if(((AnimationDrawable) (drawable)).isRunning())
	//*  90  178:aload_1         
	//*  91  179:invokevirtual   #408 <Method boolean AnimationDrawable.isRunning()>
	//*  92  182:ifeq            189
					((AnimationDrawable) (drawable)).stop();
	//   93  185:aload_1         
	//   94  186:invokevirtual   #414 <Method void AnimationDrawable.stop()>
				((AnimationDrawable) (drawable)).selectDrawable(((AnimationDrawable) (drawable)).getNumberOfFrames() - 1);
	//   95  189:aload_1         
	//   96  190:aload_1         
	//   97  191:invokevirtual   #417 <Method int AnimationDrawable.getNumberOfFrames()>
	//   98  194:iconst_1        
	//   99  195:isub            
	//  100  196:invokevirtual   #421 <Method boolean AnimationDrawable.selectDrawable(int)>
	//  101  199:pop             
			}
		}
	//  102  200:return          
	}

	public void setRouteSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("selector must not be null");
	//    2    4:new             #435 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #474 <String "selector must not be null">
	//    5   11:invokespecial   #440 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(!mSelector.equals(((Object) (mediarouteselector))))
	//*   7   15:aload_0         
	//*   8   16:getfield        #90  <Field MediaRouteSelector mSelector>
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #478 <Method boolean MediaRouteSelector.equals(Object)>
	//*  11   23:ifne            82
		{
			if(mAttachedToWindow)
	//*  12   26:aload_0         
	//*  13   27:getfield        #279 <Field boolean mAttachedToWindow>
	//*  14   30:ifeq            73
			{
				if(!mSelector.isEmpty())
	//*  15   33:aload_0         
	//*  16   34:getfield        #90  <Field MediaRouteSelector mSelector>
	//*  17   37:invokevirtual   #283 <Method boolean MediaRouteSelector.isEmpty()>
	//*  18   40:ifne            54
					mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//   19   43:aload_0         
	//   20   44:getfield        #110 <Field MediaRouter mRouter>
	//   21   47:aload_0         
	//   22   48:getfield        #115 <Field MediaRouteButton$MediaRouterCallback mCallback>
	//   23   51:invokevirtual   #303 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
				if(!mediarouteselector.isEmpty())
	//*  24   54:aload_1         
	//*  25   55:invokevirtual   #283 <Method boolean MediaRouteSelector.isEmpty()>
	//*  26   58:ifne            73
					mRouter.addCallback(mediarouteselector, ((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//   27   61:aload_0         
	//   28   62:getfield        #110 <Field MediaRouter mRouter>
	//   29   65:aload_1         
	//   30   66:aload_0         
	//   31   67:getfield        #115 <Field MediaRouteButton$MediaRouterCallback mCallback>
	//   32   70:invokevirtual   #287 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback)>
			}
			mSelector = mediarouteselector;
	//   33   73:aload_0         
	//   34   74:aload_1         
	//   35   75:putfield        #90  <Field MediaRouteSelector mSelector>
			refreshRoute();
	//   36   78:aload_0         
	//   37   79:invokevirtual   #290 <Method void refreshRoute()>
		}
	//   38   82:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #481 <Method void View.setVisibility(int)>
		if(mRemoteIndicator != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #247 <Field Drawable mRemoteIndicator>
	//*   5    9:ifnull          38
		{
			Drawable drawable = mRemoteIndicator;
	//    6   12:aload_0         
	//    7   13:getfield        #247 <Field Drawable mRemoteIndicator>
	//    8   16:astore_3        
			boolean flag;
			if(getVisibility() == 0)
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #466 <Method int getVisibility()>
	//*  11   21:ifne            29
				flag = true;
	//   12   24:iconst_1        
	//   13   25:istore_2        
			else
	//*  14   26:goto            31
				flag = false;
	//   15   29:iconst_0        
	//   16   30:istore_2        
			drawable.setVisible(flag, false);
	//   17   31:aload_3         
	//   18   32:iload_2         
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #470 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   21   37:pop             
		}
	//   22   38:return          
	}

	public boolean showDialog()
	{
		if(!mAttachedToWindow)
	//*   0    0:aload_0         
	//*   1    1:getfield        #279 <Field boolean mAttachedToWindow>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		FragmentManager fragmentmanager = getFragmentManager();
	//    5    9:aload_0         
	//    6   10:invokespecial   #483 <Method FragmentManager getFragmentManager()>
	//    7   13:astore_1        
		if(fragmentmanager == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       29
			throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
	//   10   18:new             #485 <Class IllegalStateException>
	//   11   21:dup             
	//   12   22:ldc2            #487 <String "The activity must be a subclass of FragmentActivity">
	//   13   25:invokespecial   #488 <Method void IllegalStateException(String)>
	//   14   28:athrow          
		android.support.v7.media.MediaRouter.RouteInfo routeinfo = mRouter.getSelectedRoute();
	//   15   29:aload_0         
	//   16   30:getfield        #110 <Field MediaRouter mRouter>
	//   17   33:invokevirtual   #378 <Method android.support.v7.media.MediaRouter$RouteInfo MediaRouter.getSelectedRoute()>
	//   18   36:astore_2        
		if(!routeinfo.isDefaultOrBluetooth() && routeinfo.matchesSelector(mSelector))
	//*  19   37:aload_2         
	//*  20   38:invokevirtual   #383 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isDefaultOrBluetooth()>
	//*  21   41:ifne            94
	//*  22   44:aload_2         
	//*  23   45:aload_0         
	//*  24   46:getfield        #90  <Field MediaRouteSelector mSelector>
	//*  25   49:invokevirtual   #387 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.matchesSelector(MediaRouteSelector)>
	//*  26   52:ifne            58
	//*  27   55:goto            94
		{
			if(fragmentmanager.findFragmentByTag("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null)
	//*  28   58:aload_1         
	//*  29   59:ldc1            #20  <String "android.support.v7.mediarouter:MediaRouteControllerDialogFragment">
	//*  30   61:invokevirtual   #494 <Method android.support.v4.app.Fragment FragmentManager.findFragmentByTag(String)>
	//*  31   64:ifnull          78
			{
				Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
	//   32   67:ldc1            #23  <String "MediaRouteButton">
	//   33   69:ldc2            #496 <String "showDialog(): Route controller dialog already showing!">
	//   34   72:invokestatic    #502 <Method int Log.w(String, String)>
	//   35   75:pop             
				return false;
	//   36   76:iconst_0        
	//   37   77:ireturn         
			}
			mDialogFactory.onCreateControllerDialogFragment().show(fragmentmanager, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
	//   38   78:aload_0         
	//   39   79:getfield        #98  <Field MediaRouteDialogFactory mDialogFactory>
	//   40   82:invokevirtual   #506 <Method MediaRouteControllerDialogFragment MediaRouteDialogFactory.onCreateControllerDialogFragment()>
	//   41   85:aload_1         
	//   42   86:ldc1            #20  <String "android.support.v7.mediarouter:MediaRouteControllerDialogFragment">
	//   43   88:invokevirtual   #512 <Method void MediaRouteControllerDialogFragment.show(FragmentManager, String)>
		} else
	//*  44   91:goto            137
		{
			if(fragmentmanager.findFragmentByTag("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null)
	//*  45   94:aload_1         
	//*  46   95:ldc1            #17  <String "android.support.v7.mediarouter:MediaRouteChooserDialogFragment">
	//*  47   97:invokevirtual   #494 <Method android.support.v4.app.Fragment FragmentManager.findFragmentByTag(String)>
	//*  48  100:ifnull          114
			{
				Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
	//   49  103:ldc1            #23  <String "MediaRouteButton">
	//   50  105:ldc2            #514 <String "showDialog(): Route chooser dialog already showing!">
	//   51  108:invokestatic    #502 <Method int Log.w(String, String)>
	//   52  111:pop             
				return false;
	//   53  112:iconst_0        
	//   54  113:ireturn         
			}
			MediaRouteChooserDialogFragment mediaroutechooserdialogfragment = mDialogFactory.onCreateChooserDialogFragment();
	//   55  114:aload_0         
	//   56  115:getfield        #98  <Field MediaRouteDialogFactory mDialogFactory>
	//   57  118:invokevirtual   #518 <Method MediaRouteChooserDialogFragment MediaRouteDialogFactory.onCreateChooserDialogFragment()>
	//   58  121:astore_2        
			mediaroutechooserdialogfragment.setRouteSelector(mSelector);
	//   59  122:aload_2         
	//   60  123:aload_0         
	//   61  124:getfield        #90  <Field MediaRouteSelector mSelector>
	//   62  127:invokevirtual   #522 <Method void MediaRouteChooserDialogFragment.setRouteSelector(MediaRouteSelector)>
			mediaroutechooserdialogfragment.show(fragmentmanager, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
	//   63  130:aload_2         
	//   64  131:aload_1         
	//   65  132:ldc1            #17  <String "android.support.v7.mediarouter:MediaRouteChooserDialogFragment">
	//   66  134:invokevirtual   #523 <Method void MediaRouteChooserDialogFragment.show(FragmentManager, String)>
		}
		return true;
	//   67  137:iconst_1        
	//   68  138:ireturn         
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mRemoteIndicator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #527 <Method boolean View.verifyDrawable(Drawable)>
	//    3    5:ifne            21
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #247 <Field Drawable mRemoteIndicator>
	//    7   13:if_acmpne       19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	private static final int CHECKABLE_STATE_SET[] = {
		0x101009f
	};
	private static final int CHECKED_STATE_SET[] = {
		0x10100a0
	};
	private static final String CHOOSER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
	private static final String CONTROLLER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
	private static final String TAG = "MediaRouteButton";
	private static final SparseArray sRemoteIndicatorCache = new SparseArray(2);
	private boolean mAttachedToWindow;
	private ColorStateList mButtonTint;
	private final MediaRouterCallback mCallback;
	private MediaRouteDialogFactory mDialogFactory;
	private boolean mIsConnecting;
	private int mMinHeight;
	private int mMinWidth;
	private boolean mRemoteActive;
	private Drawable mRemoteIndicator;
	private RemoteIndicatorLoader mRemoteIndicatorLoader;
	private final MediaRouter mRouter;
	private MediaRouteSelector mSelector;

	static 
	{
	//    0    0:new             #51  <Class SparseArray>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:invokespecial   #55  <Method void SparseArray(int)>
	//    4    8:putstatic       #57  <Field SparseArray sRemoteIndicatorCache>
	//    5   11:iconst_1        
	//    6   12:newarray        int[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:ldc1            #58  <Int 0x10100a0>
	//   10   18:iastore         
	//   11   19:putstatic       #60  <Field int[] CHECKED_STATE_SET>
	//   12   22:iconst_1        
	//   13   23:newarray        int[]
	//   14   25:dup             
	//   15   26:iconst_0        
	//   16   27:ldc1            #61  <Int 0x101009f>
	//   17   29:iastore         
	//   18   30:putstatic       #63  <Field int[] CHECKABLE_STATE_SET>
	//*  19   33:return          
	}


/*
	static SparseArray access$000()
	{
		return sRemoteIndicatorCache;
	//    0    0:getstatic       #57  <Field SparseArray sRemoteIndicatorCache>
	//    1    3:areturn         
	}

*/


/*
	static RemoteIndicatorLoader access$102(MediaRouteButton mediaroutebutton, RemoteIndicatorLoader remoteindicatorloader)
	{
		mediaroutebutton.mRemoteIndicatorLoader = remoteindicatorloader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #178 <Field MediaRouteButton$RemoteIndicatorLoader mRemoteIndicatorLoader>
		return remoteindicatorloader;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
