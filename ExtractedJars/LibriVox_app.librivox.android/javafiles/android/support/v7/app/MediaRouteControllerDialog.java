// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.text.TextUtils;
import android.util.Log;
import android.view.*;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.*;
import android.widget.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package android.support.v7.app:
//			AlertDialog, MediaRouterThemeHelper, OverlayListView, MediaRouteDialogHelper, 
//			MediaRouteExpandCollapseButton, MediaRouteVolumeSlider

public class MediaRouteControllerDialog extends AlertDialog
{

	public MediaRouteControllerDialog(Context context)
	{
		this(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #144 <Method void MediaRouteControllerDialog(Context, int)>
	//    4    6:return          
	}

	public MediaRouteControllerDialog(Context context, int i)
	{
		context = MediaRouterThemeHelper.createThemedDialogContext(context, i, true);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #150 <Method Context MediaRouterThemeHelper.createThemedDialogContext(Context, int, boolean)>
	//    4    6:astore_1        
		super(context, MediaRouterThemeHelper.createThemedDialogStyle(context));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_1         
	//    8   10:invokestatic    #154 <Method int MediaRouterThemeHelper.createThemedDialogStyle(Context)>
	//    9   13:invokespecial   #155 <Method void AlertDialog(Context, int)>
		mVolumeControlEnabled = true;
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:putfield        #157 <Field boolean mVolumeControlEnabled>
		mGroupListFadeInAnimation = ((Runnable) (new _cls1()));
	//   13   21:aload_0         
	//   14   22:new             #159 <Class MediaRouteControllerDialog$1>
	//   15   25:dup             
	//   16   26:aload_0         
	//   17   27:invokespecial   #162 <Method void MediaRouteControllerDialog$1(MediaRouteControllerDialog)>
	//   18   30:putfield        #164 <Field Runnable mGroupListFadeInAnimation>
		mContext = getContext();
	//   19   33:aload_0         
	//   20   34:aload_0         
	//   21   35:invokevirtual   #168 <Method Context getContext()>
	//   22   38:putfield        #170 <Field Context mContext>
		mControllerCallback = new MediaControllerCallback();
	//   23   41:aload_0         
	//   24   42:new             #172 <Class MediaRouteControllerDialog$MediaControllerCallback>
	//   25   45:dup             
	//   26   46:aload_0         
	//   27   47:invokespecial   #173 <Method void MediaRouteControllerDialog$MediaControllerCallback(MediaRouteControllerDialog)>
	//   28   50:putfield        #175 <Field MediaRouteControllerDialog$MediaControllerCallback mControllerCallback>
		mRouter = MediaRouter.getInstance(mContext);
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:getfield        #170 <Field Context mContext>
	//   32   58:invokestatic    #181 <Method MediaRouter MediaRouter.getInstance(Context)>
	//   33   61:putfield        #183 <Field MediaRouter mRouter>
		mCallback = new MediaRouterCallback();
	//   34   64:aload_0         
	//   35   65:new             #185 <Class MediaRouteControllerDialog$MediaRouterCallback>
	//   36   68:dup             
	//   37   69:aload_0         
	//   38   70:invokespecial   #186 <Method void MediaRouteControllerDialog$MediaRouterCallback(MediaRouteControllerDialog)>
	//   39   73:putfield        #188 <Field MediaRouteControllerDialog$MediaRouterCallback mCallback>
		mRoute = mRouter.getSelectedRoute();
	//   40   76:aload_0         
	//   41   77:aload_0         
	//   42   78:getfield        #183 <Field MediaRouter mRouter>
	//   43   81:invokevirtual   #192 <Method android.support.v7.media.MediaRouter$RouteInfo MediaRouter.getSelectedRoute()>
	//   44   84:putfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
		setMediaSession(mRouter.getMediaSessionToken());
	//   45   87:aload_0         
	//   46   88:aload_0         
	//   47   89:getfield        #183 <Field MediaRouter mRouter>
	//   48   92:invokevirtual   #198 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaRouter.getMediaSessionToken()>
	//   49   95:invokespecial   #202 <Method void setMediaSession(android.support.v4.media.session.MediaSessionCompat$Token)>
		mVolumeGroupListPaddingTop = mContext.getResources().getDimensionPixelSize(android.support.v7.mediarouter.R.dimen.mr_controller_volume_group_list_padding_top);
	//   50   98:aload_0         
	//   51   99:aload_0         
	//   52  100:getfield        #170 <Field Context mContext>
	//   53  103:invokevirtual   #208 <Method Resources Context.getResources()>
	//   54  106:getstatic       #213 <Field int android.support.v7.mediarouter.R$dimen.mr_controller_volume_group_list_padding_top>
	//   55  109:invokevirtual   #219 <Method int Resources.getDimensionPixelSize(int)>
	//   56  112:putfield        #221 <Field int mVolumeGroupListPaddingTop>
		mAccessibilityManager = (AccessibilityManager)mContext.getSystemService("accessibility");
	//   57  115:aload_0         
	//   58  116:aload_0         
	//   59  117:getfield        #170 <Field Context mContext>
	//   60  120:ldc1            #223 <String "accessibility">
	//   61  122:invokevirtual   #227 <Method Object Context.getSystemService(String)>
	//   62  125:checkcast       #229 <Class AccessibilityManager>
	//   63  128:putfield        #231 <Field AccessibilityManager mAccessibilityManager>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  64  131:getstatic       #236 <Field int android.os.Build$VERSION.SDK_INT>
	//*  65  134:bipush          21
	//*  66  136:icmplt          161
		{
			mLinearOutSlowInInterpolator = AnimationUtils.loadInterpolator(context, android.support.v7.mediarouter.R.interpolator.mr_linear_out_slow_in);
	//   67  139:aload_0         
	//   68  140:aload_1         
	//   69  141:getstatic       #241 <Field int android.support.v7.mediarouter.R$interpolator.mr_linear_out_slow_in>
	//   70  144:invokestatic    #247 <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
	//   71  147:putfield        #249 <Field Interpolator mLinearOutSlowInInterpolator>
			mFastOutSlowInInterpolator = AnimationUtils.loadInterpolator(context, android.support.v7.mediarouter.R.interpolator.mr_fast_out_slow_in);
	//   72  150:aload_0         
	//   73  151:aload_1         
	//   74  152:getstatic       #252 <Field int android.support.v7.mediarouter.R$interpolator.mr_fast_out_slow_in>
	//   75  155:invokestatic    #247 <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
	//   76  158:putfield        #254 <Field Interpolator mFastOutSlowInInterpolator>
		}
		mAccelerateDecelerateInterpolator = ((Interpolator) (new AccelerateDecelerateInterpolator()));
	//   77  161:aload_0         
	//   78  162:new             #256 <Class AccelerateDecelerateInterpolator>
	//   79  165:dup             
	//   80  166:invokespecial   #258 <Method void AccelerateDecelerateInterpolator()>
	//   81  169:putfield        #260 <Field Interpolator mAccelerateDecelerateInterpolator>
	//   82  172:return          
	}

	private void animateGroupListItems(final Map previousRouteBoundMap, final Map previousRouteBitmapMap)
	{
		mVolumeGroupList.setEnabled(false);
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #270 <Method void OverlayListView.setEnabled(boolean)>
		mVolumeGroupList.requestLayout();
	//    4    8:aload_0         
	//    5    9:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//    6   12:invokevirtual   #273 <Method void OverlayListView.requestLayout()>
		mIsGroupListAnimating = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #275 <Field boolean mIsGroupListAnimating>
		mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (new _cls8())));
	//   10   20:aload_0         
	//   11   21:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//   12   24:invokevirtual   #279 <Method ViewTreeObserver OverlayListView.getViewTreeObserver()>
	//   13   27:new             #281 <Class MediaRouteControllerDialog$8>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokespecial   #284 <Method void MediaRouteControllerDialog$8(MediaRouteControllerDialog, Map, Map)>
	//   19   37:invokevirtual   #290 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   20   40:return          
	}

	private void animateLayoutHeight(View view, int i)
	{
		_cls7 _lcls7 = new _cls7();
	//    0    0:new             #294 <Class MediaRouteControllerDialog$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #298 <Method int getLayoutHeight(View)>
	//    5    9:iload_2         
	//    6   10:aload_1         
	//    7   11:invokespecial   #301 <Method void MediaRouteControllerDialog$7(MediaRouteControllerDialog, int, int, View)>
	//    8   14:astore_3        
		((Animation) (_lcls7)).setDuration(mGroupListAnimationDurationMs);
	//    9   15:aload_3         
	//   10   16:aload_0         
	//   11   17:getfield        #303 <Field int mGroupListAnimationDurationMs>
	//   12   20:i2l             
	//   13   21:invokevirtual   #309 <Method void Animation.setDuration(long)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  14   24:getstatic       #236 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   27:bipush          21
	//*  16   29:icmplt          40
			((Animation) (_lcls7)).setInterpolator(mInterpolator);
	//   17   32:aload_3         
	//   18   33:aload_0         
	//   19   34:getfield        #311 <Field Interpolator mInterpolator>
	//   20   37:invokevirtual   #315 <Method void Animation.setInterpolator(Interpolator)>
		view.startAnimation(((Animation) (_lcls7)));
	//   21   40:aload_1         
	//   22   41:aload_3         
	//   23   42:invokevirtual   #321 <Method void View.startAnimation(Animation)>
	//   24   45:return          
	}

	private boolean canShowPlaybackControlLayout()
	{
		return mCustomControlView == null && (mDescription != null || mState != null);
	//    0    0:aload_0         
	//    1    1:getfield        #325 <Field View mCustomControlView>
	//    2    4:ifnonnull       23
	//    3    7:aload_0         
	//    4    8:getfield        #327 <Field MediaDescriptionCompat mDescription>
	//    5   11:ifnonnull       21
	//    6   14:aload_0         
	//    7   15:getfield        #329 <Field PlaybackStateCompat mState>
	//    8   18:ifnull          23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private void fadeInAddedRoutes()
	{
		_cls12 _lcls12 = new _cls12();
	//    0    0:new             #332 <Class MediaRouteControllerDialog$12>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #333 <Method void MediaRouteControllerDialog$12(MediaRouteControllerDialog)>
	//    4    8:astore          5
		int j = mVolumeGroupList.getFirstVisiblePosition();
	//    5   10:aload_0         
	//    6   11:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//    7   14:invokevirtual   #337 <Method int OverlayListView.getFirstVisiblePosition()>
	//    8   17:istore          4
		int i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_3        
		boolean flag1;
		for(boolean flag = false; i < mVolumeGroupList.getChildCount(); flag = flag1)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_3         
	//*  14   24:aload_0         
	//*  15   25:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//*  16   28:invokevirtual   #340 <Method int OverlayListView.getChildCount()>
	//*  17   31:icmpge          145
		{
			View view = mVolumeGroupList.getChildAt(i);
	//   18   34:aload_0         
	//   19   35:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//   20   38:iload_3         
	//   21   39:invokevirtual   #344 <Method View OverlayListView.getChildAt(int)>
	//   22   42:astore          6
			android.support.v7.media.MediaRouter.RouteInfo routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)mVolumeGroupAdapter.getItem(j + i);
	//   23   44:aload_0         
	//   24   45:getfield        #346 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   25   48:iload           4
	//   26   50:iload_3         
	//   27   51:iadd            
	//   28   52:invokevirtual   #352 <Method Object MediaRouteControllerDialog$VolumeGroupAdapter.getItem(int)>
	//   29   55:checkcast       #354 <Class android.support.v7.media.MediaRouter$RouteInfo>
	//   30   58:astore          7
			flag1 = flag;
	//   31   60:iload_1         
	//   32   61:istore_2        
			if(mGroupMemberRoutesAdded.contains(((Object) (routeinfo))))
	//*  33   62:aload_0         
	//*  34   63:getfield        #356 <Field Set mGroupMemberRoutesAdded>
	//*  35   66:aload           7
	//*  36   68:invokeinterface #362 <Method boolean Set.contains(Object)>
	//*  37   73:ifeq            136
			{
				AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
	//   38   76:new             #364 <Class AlphaAnimation>
	//   39   79:dup             
	//   40   80:fconst_0        
	//   41   81:fconst_1        
	//   42   82:invokespecial   #367 <Method void AlphaAnimation(float, float)>
	//   43   85:astore          7
				((Animation) (alphaanimation)).setDuration(mGroupListFadeInDurationMs);
	//   44   87:aload           7
	//   45   89:aload_0         
	//   46   90:getfield        #369 <Field int mGroupListFadeInDurationMs>
	//   47   93:i2l             
	//   48   94:invokevirtual   #309 <Method void Animation.setDuration(long)>
				((Animation) (alphaanimation)).setFillEnabled(true);
	//   49   97:aload           7
	//   50   99:iconst_1        
	//   51  100:invokevirtual   #372 <Method void Animation.setFillEnabled(boolean)>
				((Animation) (alphaanimation)).setFillAfter(true);
	//   52  103:aload           7
	//   53  105:iconst_1        
	//   54  106:invokevirtual   #375 <Method void Animation.setFillAfter(boolean)>
				flag1 = flag;
	//   55  109:iload_1         
	//   56  110:istore_2        
				if(!flag)
	//*  57  111:iload_1         
	//*  58  112:ifne            124
				{
					((Animation) (alphaanimation)).setAnimationListener(((android.view.animation.Animation.AnimationListener) (_lcls12)));
	//   59  115:aload           7
	//   60  117:aload           5
	//   61  119:invokevirtual   #379 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
					flag1 = true;
	//   62  122:iconst_1        
	//   63  123:istore_2        
				}
				view.clearAnimation();
	//   64  124:aload           6
	//   65  126:invokevirtual   #382 <Method void View.clearAnimation()>
				view.startAnimation(((Animation) (alphaanimation)));
	//   66  129:aload           6
	//   67  131:aload           7
	//   68  133:invokevirtual   #321 <Method void View.startAnimation(Animation)>
			}
			i++;
	//   69  136:iload_3         
	//   70  137:iconst_1        
	//   71  138:iadd            
	//   72  139:istore_3        
		}

	//   73  140:iload_2         
	//   74  141:istore_1        
	//*  75  142:goto            23
	//   76  145:return          
	}

	private android.support.v7.media.MediaRouter.RouteGroup getGroup()
	{
		android.support.v7.media.MediaRouter.RouteInfo routeinfo = mRoute;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//    2    4:astore_1        
		if(routeinfo instanceof android.support.v7.media.MediaRouter.RouteGroup)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #386 <Class android.support.v7.media.MediaRouter$RouteGroup>
	//*   5    9:ifeq            17
			return (android.support.v7.media.MediaRouter.RouteGroup)routeinfo;
	//    6   12:aload_1         
	//    7   13:checkcast       #386 <Class android.support.v7.media.MediaRouter$RouteGroup>
	//    8   16:areturn         
		else
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
	}

	private static int getLayoutHeight(View view)
	{
		return view.getLayoutParams().height;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:getfield        #395 <Field int android.view.ViewGroup$LayoutParams.height>
	//    3    7:ireturn         
	}

	private int getMainControllerHeight(boolean flag)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(flag || mVolumeControlLayout.getVisibility() == 0)
	//*   2    2:iload_1         
	//*   3    3:ifne            16
	//*   4    6:aload_0         
	//*   5    7:getfield        #399 <Field LinearLayout mVolumeControlLayout>
	//*   6   10:invokevirtual   #404 <Method int LinearLayout.getVisibility()>
	//*   7   13:ifne            100
		{
			int j = 0 + (mMediaMainControlLayout.getPaddingTop() + mMediaMainControlLayout.getPaddingBottom());
	//    8   16:iconst_0        
	//    9   17:aload_0         
	//   10   18:getfield        #406 <Field LinearLayout mMediaMainControlLayout>
	//   11   21:invokevirtual   #409 <Method int LinearLayout.getPaddingTop()>
	//   12   24:aload_0         
	//   13   25:getfield        #406 <Field LinearLayout mMediaMainControlLayout>
	//   14   28:invokevirtual   #412 <Method int LinearLayout.getPaddingBottom()>
	//   15   31:iadd            
	//   16   32:iadd            
	//   17   33:istore_3        
			i = j;
	//   18   34:iload_3         
	//   19   35:istore_2        
			if(flag)
	//*  20   36:iload_1         
	//*  21   37:ifeq            50
				i = j + mPlaybackControlLayout.getMeasuredHeight();
	//   22   40:iload_3         
	//   23   41:aload_0         
	//   24   42:getfield        #414 <Field RelativeLayout mPlaybackControlLayout>
	//   25   45:invokevirtual   #419 <Method int RelativeLayout.getMeasuredHeight()>
	//   26   48:iadd            
	//   27   49:istore_2        
			j = i;
	//   28   50:iload_2         
	//   29   51:istore_3        
			if(mVolumeControlLayout.getVisibility() == 0)
	//*  30   52:aload_0         
	//*  31   53:getfield        #399 <Field LinearLayout mVolumeControlLayout>
	//*  32   56:invokevirtual   #404 <Method int LinearLayout.getVisibility()>
	//*  33   59:ifne            72
				j = i + mVolumeControlLayout.getMeasuredHeight();
	//   34   62:iload_2         
	//   35   63:aload_0         
	//   36   64:getfield        #399 <Field LinearLayout mVolumeControlLayout>
	//   37   67:invokevirtual   #420 <Method int LinearLayout.getMeasuredHeight()>
	//   38   70:iadd            
	//   39   71:istore_3        
			i = j;
	//   40   72:iload_3         
	//   41   73:istore_2        
			if(flag)
	//*  42   74:iload_1         
	//*  43   75:ifeq            100
			{
				i = j;
	//   44   78:iload_3         
	//   45   79:istore_2        
				if(mVolumeControlLayout.getVisibility() == 0)
	//*  46   80:aload_0         
	//*  47   81:getfield        #399 <Field LinearLayout mVolumeControlLayout>
	//*  48   84:invokevirtual   #404 <Method int LinearLayout.getVisibility()>
	//*  49   87:ifne            100
					i = j + mDividerView.getMeasuredHeight();
	//   50   90:iload_3         
	//   51   91:aload_0         
	//   52   92:getfield        #422 <Field View mDividerView>
	//   53   95:invokevirtual   #423 <Method int View.getMeasuredHeight()>
	//   54   98:iadd            
	//   55   99:istore_2        
			}
		}
		return i;
	//   56  100:iload_2         
	//   57  101:ireturn         
	}

	static boolean isBitmapRecycled(Bitmap bitmap)
	{
		return bitmap != null && bitmap.isRecycled();
	//    0    0:aload_0         
	//    1    1:ifnull          13
	//    2    4:aload_0         
	//    3    5:invokevirtual   #430 <Method boolean Bitmap.isRecycled()>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private boolean isIconChanged()
	{
		Object obj = ((Object) (mDescription));
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field MediaDescriptionCompat mDescription>
	//    2    4:astore_1        
		Uri uri = null;
	//    3    5:aconst_null     
	//    4    6:astore_2        
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       16
			obj = null;
	//    7   11:aconst_null     
	//    8   12:astore_1        
		else
	//*   9   13:goto            21
			obj = ((Object) (((MediaDescriptionCompat) (obj)).d()));
	//   10   16:aload_1         
	//   11   17:invokevirtual   #437 <Method Bitmap MediaDescriptionCompat.d()>
	//   12   20:astore_1        
		Object obj1 = ((Object) (mDescription));
	//   13   21:aload_0         
	//   14   22:getfield        #327 <Field MediaDescriptionCompat mDescription>
	//   15   25:astore_3        
		if(obj1 != null)
	//*  16   26:aload_3         
	//*  17   27:ifnonnull       33
	//*  18   30:goto            38
			uri = ((MediaDescriptionCompat) (obj1)).e();
	//   19   33:aload_3         
	//   20   34:invokevirtual   #441 <Method Uri MediaDescriptionCompat.e()>
	//   21   37:astore_2        
		obj1 = ((Object) (mFetchArtTask));
	//   22   38:aload_0         
	//   23   39:getfield        #443 <Field MediaRouteControllerDialog$FetchArtTask mFetchArtTask>
	//   24   42:astore_3        
		if(obj1 == null)
	//*  25   43:aload_3         
	//*  26   44:ifnonnull       55
			obj1 = ((Object) (mArtIconBitmap));
	//   27   47:aload_0         
	//   28   48:getfield        #445 <Field Bitmap mArtIconBitmap>
	//   29   51:astore_3        
		else
	//*  30   52:goto            60
			obj1 = ((Object) (((FetchArtTask) (obj1)).getIconBitmap()));
	//   31   55:aload_3         
	//   32   56:invokevirtual   #450 <Method Bitmap MediaRouteControllerDialog$FetchArtTask.getIconBitmap()>
	//   33   59:astore_3        
		Object obj2 = ((Object) (mFetchArtTask));
	//   34   60:aload_0         
	//   35   61:getfield        #443 <Field MediaRouteControllerDialog$FetchArtTask mFetchArtTask>
	//   36   64:astore          4
		if(obj2 == null)
	//*  37   66:aload           4
	//*  38   68:ifnonnull       80
			obj2 = ((Object) (mArtIconUri));
	//   39   71:aload_0         
	//   40   72:getfield        #452 <Field Uri mArtIconUri>
	//   41   75:astore          4
		else
	//*  42   77:goto            87
			obj2 = ((Object) (((FetchArtTask) (obj2)).getIconUri()));
	//   43   80:aload           4
	//   44   82:invokevirtual   #455 <Method Uri MediaRouteControllerDialog$FetchArtTask.getIconUri()>
	//   45   85:astore          4
		if(obj1 != obj)
	//*  46   87:aload_3         
	//*  47   88:aload_1         
	//*  48   89:if_acmpeq       94
			return true;
	//   49   92:iconst_1        
	//   50   93:ireturn         
		return obj1 == null && !uriEquals(((Uri) (obj2)), uri);
	//   51   94:aload_3         
	//   52   95:ifnonnull       109
	//   53   98:aload           4
	//   54  100:aload_2         
	//   55  101:invokestatic    #459 <Method boolean uriEquals(Uri, Uri)>
	//   56  104:ifne            109
	//   57  107:iconst_1        
	//   58  108:ireturn         
	//   59  109:iconst_0        
	//   60  110:ireturn         
	}

	private void rebuildVolumeGroupList(boolean flag)
	{
		List list;
		if(getGroup() == null)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #462 <Method android.support.v7.media.MediaRouter$RouteGroup getGroup()>
	//*   2    4:ifnonnull       12
			list = null;
	//    3    7:aconst_null     
	//    4    8:astore_2        
		else
	//*   5    9:goto            20
			list = getGroup().getRoutes();
	//    6   12:aload_0         
	//    7   13:invokespecial   #462 <Method android.support.v7.media.MediaRouter$RouteGroup getGroup()>
	//    8   16:invokevirtual   #466 <Method List android.support.v7.media.MediaRouter$RouteGroup.getRoutes()>
	//    9   19:astore_2        
		if(list == null)
	//*  10   20:aload_2         
	//*  11   21:ifnonnull       41
		{
			mGroupMemberRoutes.clear();
	//   12   24:aload_0         
	//   13   25:getfield        #468 <Field List mGroupMemberRoutes>
	//   14   28:invokeinterface #473 <Method void List.clear()>
			mVolumeGroupAdapter.notifyDataSetChanged();
	//   15   33:aload_0         
	//   16   34:getfield        #346 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   17   37:invokevirtual   #476 <Method void MediaRouteControllerDialog$VolumeGroupAdapter.notifyDataSetChanged()>
			return;
	//   18   40:return          
		}
		if(MediaRouteDialogHelper.listUnorderedEquals(mGroupMemberRoutes, list))
	//*  19   41:aload_0         
	//*  20   42:getfield        #468 <Field List mGroupMemberRoutes>
	//*  21   45:aload_2         
	//*  22   46:invokestatic    #482 <Method boolean MediaRouteDialogHelper.listUnorderedEquals(List, List)>
	//*  23   49:ifeq            60
		{
			mVolumeGroupAdapter.notifyDataSetChanged();
	//   24   52:aload_0         
	//   25   53:getfield        #346 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   26   56:invokevirtual   #476 <Method void MediaRouteControllerDialog$VolumeGroupAdapter.notifyDataSetChanged()>
			return;
	//   27   59:return          
		}
		HashMap hashmap;
		if(flag)
	//*  28   60:iload_1         
	//*  29   61:ifeq            79
			hashmap = MediaRouteDialogHelper.getItemBoundMap(((android.widget.ListView) (mVolumeGroupList)), ((ArrayAdapter) (mVolumeGroupAdapter)));
	//   30   64:aload_0         
	//   31   65:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//   32   68:aload_0         
	//   33   69:getfield        #346 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   34   72:invokestatic    #486 <Method HashMap MediaRouteDialogHelper.getItemBoundMap(android.widget.ListView, ArrayAdapter)>
	//   35   75:astore_3        
		else
	//*  36   76:goto            81
			hashmap = null;
	//   37   79:aconst_null     
	//   38   80:astore_3        
		HashMap hashmap1;
		if(flag)
	//*  39   81:iload_1         
	//*  40   82:ifeq            105
			hashmap1 = MediaRouteDialogHelper.getItemBitmapMap(mContext, ((android.widget.ListView) (mVolumeGroupList)), ((ArrayAdapter) (mVolumeGroupAdapter)));
	//   41   85:aload_0         
	//   42   86:getfield        #170 <Field Context mContext>
	//   43   89:aload_0         
	//   44   90:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//   45   93:aload_0         
	//   46   94:getfield        #346 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   47   97:invokestatic    #490 <Method HashMap MediaRouteDialogHelper.getItemBitmapMap(Context, android.widget.ListView, ArrayAdapter)>
	//   48  100:astore          4
		else
	//*  49  102:goto            108
			hashmap1 = null;
	//   50  105:aconst_null     
	//   51  106:astore          4
		mGroupMemberRoutesAdded = MediaRouteDialogHelper.getItemsAdded(mGroupMemberRoutes, list);
	//   52  108:aload_0         
	//   53  109:aload_0         
	//   54  110:getfield        #468 <Field List mGroupMemberRoutes>
	//   55  113:aload_2         
	//   56  114:invokestatic    #494 <Method Set MediaRouteDialogHelper.getItemsAdded(List, List)>
	//   57  117:putfield        #356 <Field Set mGroupMemberRoutesAdded>
		mGroupMemberRoutesRemoved = MediaRouteDialogHelper.getItemsRemoved(mGroupMemberRoutes, list);
	//   58  120:aload_0         
	//   59  121:aload_0         
	//   60  122:getfield        #468 <Field List mGroupMemberRoutes>
	//   61  125:aload_2         
	//   62  126:invokestatic    #497 <Method Set MediaRouteDialogHelper.getItemsRemoved(List, List)>
	//   63  129:putfield        #499 <Field Set mGroupMemberRoutesRemoved>
		mGroupMemberRoutes.addAll(0, ((java.util.Collection) (mGroupMemberRoutesAdded)));
	//   64  132:aload_0         
	//   65  133:getfield        #468 <Field List mGroupMemberRoutes>
	//   66  136:iconst_0        
	//   67  137:aload_0         
	//   68  138:getfield        #356 <Field Set mGroupMemberRoutesAdded>
	//   69  141:invokeinterface #503 <Method boolean List.addAll(int, java.util.Collection)>
	//   70  146:pop             
		mGroupMemberRoutes.removeAll(((java.util.Collection) (mGroupMemberRoutesRemoved)));
	//   71  147:aload_0         
	//   72  148:getfield        #468 <Field List mGroupMemberRoutes>
	//   73  151:aload_0         
	//   74  152:getfield        #499 <Field Set mGroupMemberRoutesRemoved>
	//   75  155:invokeinterface #507 <Method boolean List.removeAll(java.util.Collection)>
	//   76  160:pop             
		mVolumeGroupAdapter.notifyDataSetChanged();
	//   77  161:aload_0         
	//   78  162:getfield        #346 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   79  165:invokevirtual   #476 <Method void MediaRouteControllerDialog$VolumeGroupAdapter.notifyDataSetChanged()>
		if(flag && mIsGroupExpanded && mGroupMemberRoutesAdded.size() + mGroupMemberRoutesRemoved.size() > 0)
	//*  80  168:iload_1         
	//*  81  169:ifeq            209
	//*  82  172:aload_0         
	//*  83  173:getfield        #509 <Field boolean mIsGroupExpanded>
	//*  84  176:ifeq            209
	//*  85  179:aload_0         
	//*  86  180:getfield        #356 <Field Set mGroupMemberRoutesAdded>
	//*  87  183:invokeinterface #512 <Method int Set.size()>
	//*  88  188:aload_0         
	//*  89  189:getfield        #499 <Field Set mGroupMemberRoutesRemoved>
	//*  90  192:invokeinterface #512 <Method int Set.size()>
	//*  91  197:iadd            
	//*  92  198:ifle            209
		{
			animateGroupListItems(((Map) (hashmap)), ((Map) (hashmap1)));
	//   93  201:aload_0         
	//   94  202:aload_3         
	//   95  203:aload           4
	//   96  205:invokespecial   #514 <Method void animateGroupListItems(Map, Map)>
			return;
	//   97  208:return          
		} else
		{
			mGroupMemberRoutesAdded = null;
	//   98  209:aload_0         
	//   99  210:aconst_null     
	//  100  211:putfield        #356 <Field Set mGroupMemberRoutesAdded>
			mGroupMemberRoutesRemoved = null;
	//  101  214:aload_0         
	//  102  215:aconst_null     
	//  103  216:putfield        #499 <Field Set mGroupMemberRoutesRemoved>
			return;
	//  104  219:return          
		}
	}

	static void setLayoutHeight(View view, int i)
	{
		android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_2        
		layoutparams.height = i;
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:putfield        #395 <Field int android.view.ViewGroup$LayoutParams.height>
		view.setLayoutParams(layoutparams);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #519 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    9   15:return          
	}

	private void setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token token)
	{
		MediaControllerCompat mediacontrollercompat = mMediaController;
	//    0    0:aload_0         
	//    1    1:getfield        #523 <Field MediaControllerCompat mMediaController>
	//    2    4:astore_3        
		Object obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_2        
		if(mediacontrollercompat != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          24
		{
			mediacontrollercompat.b(((i) (mControllerCallback)));
	//    7   11:aload_3         
	//    8   12:aload_0         
	//    9   13:getfield        #175 <Field MediaRouteControllerDialog$MediaControllerCallback mControllerCallback>
	//   10   16:invokevirtual   #529 <Method void MediaControllerCompat.b(i)>
			mMediaController = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #523 <Field MediaControllerCompat mMediaController>
		}
		if(token == null)
	//*  14   24:aload_1         
	//*  15   25:ifnonnull       29
			return;
	//   16   28:return          
		if(!mAttachedToWindow)
	//*  17   29:aload_0         
	//*  18   30:getfield        #531 <Field boolean mAttachedToWindow>
	//*  19   33:ifne            37
			return;
	//   20   36:return          
		try
		{
			mMediaController = new MediaControllerCompat(mContext, token);
	//   21   37:aload_0         
	//   22   38:new             #525 <Class MediaControllerCompat>
	//   23   41:dup             
	//   24   42:aload_0         
	//   25   43:getfield        #170 <Field Context mContext>
	//   26   46:aload_1         
	//   27   47:invokespecial   #534 <Method void MediaControllerCompat(Context, android.support.v4.media.session.MediaSessionCompat$Token)>
	//   28   50:putfield        #523 <Field MediaControllerCompat mMediaController>
		}
	//*  29   53:goto            67
		// Misplaced declaration of an exception variable
		catch(android.support.v4.media.session.MediaSessionCompat.Token token)
	//*  30   56:astore_1        
		{
			Log.e("MediaRouteCtrlDialog", "Error creating media controller in setMediaSession.", ((Throwable) (token)));
	//   31   57:ldc1            #18  <String "MediaRouteCtrlDialog">
	//   32   59:ldc2            #536 <String "Error creating media controller in setMediaSession.">
	//   33   62:aload_1         
	//   34   63:invokestatic    #539 <Method int Log.e(String, String, Throwable)>
	//   35   66:pop             
		}
		token = ((android.support.v4.media.session.MediaSessionCompat.Token) (mMediaController));
	//   36   67:aload_0         
	//   37   68:getfield        #523 <Field MediaControllerCompat mMediaController>
	//   38   71:astore_1        
		if(token != null)
	//*  39   72:aload_1         
	//*  40   73:ifnull          84
			((MediaControllerCompat) (token)).a(((i) (mControllerCallback)));
	//   41   76:aload_1         
	//   42   77:aload_0         
	//   43   78:getfield        #175 <Field MediaRouteControllerDialog$MediaControllerCallback mControllerCallback>
	//   44   81:invokevirtual   #542 <Method void MediaControllerCompat.a(i)>
		token = ((android.support.v4.media.session.MediaSessionCompat.Token) (mMediaController));
	//   45   84:aload_0         
	//   46   85:getfield        #523 <Field MediaControllerCompat mMediaController>
	//   47   88:astore_1        
		if(token == null)
	//*  48   89:aload_1         
	//*  49   90:ifnonnull       98
			token = null;
	//   50   93:aconst_null     
	//   51   94:astore_1        
		else
	//*  52   95:goto            103
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((MediaControllerCompat) (token)).c()));
	//   53   98:aload_1         
	//   54   99:invokevirtual   #546 <Method MediaMetadataCompat MediaControllerCompat.c()>
	//   55  102:astore_1        
		if(token == null)
	//*  56  103:aload_1         
	//*  57  104:ifnonnull       112
			token = null;
	//   58  107:aconst_null     
	//   59  108:astore_1        
		else
	//*  60  109:goto            117
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((MediaMetadataCompat) (token)).a()));
	//   61  112:aload_1         
	//   62  113:invokevirtual   #551 <Method MediaDescriptionCompat MediaMetadataCompat.a()>
	//   63  116:astore_1        
		mDescription = ((MediaDescriptionCompat) (token));
	//   64  117:aload_0         
	//   65  118:aload_1         
	//   66  119:putfield        #327 <Field MediaDescriptionCompat mDescription>
		token = ((android.support.v4.media.session.MediaSessionCompat.Token) (mMediaController));
	//   67  122:aload_0         
	//   68  123:getfield        #523 <Field MediaControllerCompat mMediaController>
	//   69  126:astore_1        
		if(token == null)
	//*  70  127:aload_1         
	//*  71  128:ifnonnull       136
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (obj));
	//   72  131:aload_2         
	//   73  132:astore_1        
		else
	//*  74  133:goto            141
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((MediaControllerCompat) (token)).b()));
	//   75  136:aload_1         
	//   76  137:invokevirtual   #554 <Method PlaybackStateCompat MediaControllerCompat.b()>
	//   77  140:astore_1        
		mState = ((PlaybackStateCompat) (token));
	//   78  141:aload_0         
	//   79  142:aload_1         
	//   80  143:putfield        #329 <Field PlaybackStateCompat mState>
		updateArtIconIfNeeded();
	//   81  146:aload_0         
	//   82  147:invokevirtual   #557 <Method void updateArtIconIfNeeded()>
		update(false);
	//   83  150:aload_0         
	//   84  151:iconst_0        
	//   85  152:invokevirtual   #560 <Method void update(boolean)>
	//   86  155:return          
	}

	private void updateMediaControlVisibility(boolean flag)
	{
		Object obj = ((Object) (mDividerView));
	//    0    0:aload_0         
	//    1    1:getfield        #422 <Field View mDividerView>
	//    2    4:astore          4
		int i = mVolumeControlLayout.getVisibility();
	//    3    6:aload_0         
	//    4    7:getfield        #399 <Field LinearLayout mVolumeControlLayout>
	//    5   10:invokevirtual   #404 <Method int LinearLayout.getVisibility()>
	//    6   13:istore_2        
		boolean flag1 = false;
	//    7   14:iconst_0        
	//    8   15:istore_3        
		if(i == 0 && flag)
	//*   9   16:iload_2         
	//*  10   17:ifne            29
	//*  11   20:iload_1         
	//*  12   21:ifeq            29
			i = 0;
	//   13   24:iconst_0        
	//   14   25:istore_2        
		else
	//*  15   26:goto            32
			i = 8;
	//   16   29:bipush          8
	//   17   31:istore_2        
		((View) (obj)).setVisibility(i);
	//   18   32:aload           4
	//   19   34:iload_2         
	//   20   35:invokevirtual   #565 <Method void View.setVisibility(int)>
		obj = ((Object) (mMediaMainControlLayout));
	//   21   38:aload_0         
	//   22   39:getfield        #406 <Field LinearLayout mMediaMainControlLayout>
	//   23   42:astore          4
		i = ((int) (flag1));
	//   24   44:iload_3         
	//   25   45:istore_2        
		if(mVolumeControlLayout.getVisibility() == 8)
	//*  26   46:aload_0         
	//*  27   47:getfield        #399 <Field LinearLayout mVolumeControlLayout>
	//*  28   50:invokevirtual   #404 <Method int LinearLayout.getVisibility()>
	//*  29   53:bipush          8
	//*  30   55:icmpne          67
		{
			i = ((int) (flag1));
	//   31   58:iload_3         
	//   32   59:istore_2        
			if(!flag)
	//*  33   60:iload_1         
	//*  34   61:ifne            67
				i = 8;
	//   35   64:bipush          8
	//   36   66:istore_2        
		}
		((LinearLayout) (obj)).setVisibility(i);
	//   37   67:aload           4
	//   38   69:iload_2         
	//   39   70:invokevirtual   #566 <Method void LinearLayout.setVisibility(int)>
	//   40   73:return          
	}

	private void updatePlaybackControlLayout()
	{
		if(canShowPlaybackControlLayout())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #569 <Method boolean canShowPlaybackControlLayout()>
	//*   2    4:ifeq            437
		{
			Object obj = ((Object) (mDescription));
	//    3    7:aload_0         
	//    4    8:getfield        #327 <Field MediaDescriptionCompat mDescription>
	//    5   11:astore          6
			CharSequence charsequence = null;
	//    6   13:aconst_null     
	//    7   14:astore          7
			if(obj == null)
	//*   8   16:aload           6
	//*   9   18:ifnonnull       27
				obj = null;
	//   10   21:aconst_null     
	//   11   22:astore          6
			else
	//*  12   24:goto            34
				obj = ((Object) (((MediaDescriptionCompat) (obj)).b()));
	//   13   27:aload           6
	//   14   29:invokevirtual   #572 <Method CharSequence MediaDescriptionCompat.b()>
	//   15   32:astore          6
			boolean flag3 = TextUtils.isEmpty(((CharSequence) (obj)));
	//   16   34:aload           6
	//   17   36:invokestatic    #578 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   18   39:istore          5
			boolean flag2 = true;
	//   19   41:iconst_1        
	//   20   42:istore_3        
			boolean flag1 = flag3 ^ true;
	//   21   43:iload           5
	//   22   45:iconst_1        
	//   23   46:ixor            
	//   24   47:istore_2        
			MediaDescriptionCompat mediadescriptioncompat = mDescription;
	//   25   48:aload_0         
	//   26   49:getfield        #327 <Field MediaDescriptionCompat mDescription>
	//   27   52:astore          8
			if(mediadescriptioncompat != null)
	//*  28   54:aload           8
	//*  29   56:ifnonnull       62
	//*  30   59:goto            69
				charsequence = mediadescriptioncompat.c();
	//   31   62:aload           8
	//   32   64:invokevirtual   #580 <Method CharSequence MediaDescriptionCompat.c()>
	//   33   67:astore          7
			boolean flag = TextUtils.isEmpty(charsequence) ^ true;
	//   34   69:aload           7
	//   35   71:invokestatic    #578 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   36   74:iconst_1        
	//   37   75:ixor            
	//   38   76:istore_1        
			if(mRoute.getPresentationDisplayId() != -1)
	//*  39   77:aload_0         
	//*  40   78:getfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//*  41   81:invokevirtual   #583 <Method int android.support.v7.media.MediaRouter$RouteInfo.getPresentationDisplayId()>
	//*  42   84:iconst_m1       
	//*  43   85:icmpeq          105
			{
				mTitleView.setText(android.support.v7.mediarouter.R.string.mr_controller_casting_screen);
	//   44   88:aload_0         
	//   45   89:getfield        #585 <Field TextView mTitleView>
	//   46   92:getstatic       #590 <Field int android.support.v7.mediarouter.R$string.mr_controller_casting_screen>
	//   47   95:invokevirtual   #595 <Method void TextView.setText(int)>
				flag1 = true;
	//   48   98:iconst_1        
	//   49   99:istore_2        
				flag = false;
	//   50  100:iconst_0        
	//   51  101:istore_1        
			} else
	//*  52  102:goto            209
			{
				PlaybackStateCompat playbackstatecompat = mState;
	//   53  105:aload_0         
	//   54  106:getfield        #329 <Field PlaybackStateCompat mState>
	//   55  109:astore          8
				if(playbackstatecompat != null && playbackstatecompat.a() != 0)
	//*  56  111:aload           8
	//*  57  113:ifnull          195
	//*  58  116:aload           8
	//*  59  118:invokevirtual   #599 <Method int PlaybackStateCompat.a()>
	//*  60  121:ifne            127
	//*  61  124:goto            195
				{
					if(!flag1 && !flag)
	//*  62  127:iload_2         
	//*  63  128:ifne            152
	//*  64  131:iload_1         
	//*  65  132:ifne            152
					{
						mTitleView.setText(android.support.v7.mediarouter.R.string.mr_controller_no_info_available);
	//   66  135:aload_0         
	//   67  136:getfield        #585 <Field TextView mTitleView>
	//   68  139:getstatic       #602 <Field int android.support.v7.mediarouter.R$string.mr_controller_no_info_available>
	//   69  142:invokevirtual   #595 <Method void TextView.setText(int)>
						flag1 = true;
	//   70  145:iconst_1        
	//   71  146:istore_2        
						flag = false;
	//   72  147:iconst_0        
	//   73  148:istore_1        
					} else
	//*  74  149:goto            209
					{
						if(flag1)
	//*  75  152:iload_2         
	//*  76  153:ifeq            170
						{
							mTitleView.setText(((CharSequence) (obj)));
	//   77  156:aload_0         
	//   78  157:getfield        #585 <Field TextView mTitleView>
	//   79  160:aload           6
	//   80  162:invokevirtual   #605 <Method void TextView.setText(CharSequence)>
							flag1 = true;
	//   81  165:iconst_1        
	//   82  166:istore_2        
						} else
	//*  83  167:goto            172
						{
							flag1 = false;
	//   84  170:iconst_0        
	//   85  171:istore_2        
						}
						if(flag)
	//*  86  172:iload_1         
	//*  87  173:ifeq            190
						{
							mSubtitleView.setText(charsequence);
	//   88  176:aload_0         
	//   89  177:getfield        #607 <Field TextView mSubtitleView>
	//   90  180:aload           7
	//   91  182:invokevirtual   #605 <Method void TextView.setText(CharSequence)>
							flag = true;
	//   92  185:iconst_1        
	//   93  186:istore_1        
						} else
	//*  94  187:goto            209
						{
							flag = false;
	//   95  190:iconst_0        
	//   96  191:istore_1        
						}
					}
				} else
	//*  97  192:goto            209
				{
					mTitleView.setText(android.support.v7.mediarouter.R.string.mr_controller_no_media_selected);
	//   98  195:aload_0         
	//   99  196:getfield        #585 <Field TextView mTitleView>
	//  100  199:getstatic       #610 <Field int android.support.v7.mediarouter.R$string.mr_controller_no_media_selected>
	//  101  202:invokevirtual   #595 <Method void TextView.setText(int)>
					flag1 = true;
	//  102  205:iconst_1        
	//  103  206:istore_2        
					flag = false;
	//  104  207:iconst_0        
	//  105  208:istore_1        
				}
			}
			obj = ((Object) (mTitleView));
	//  106  209:aload_0         
	//  107  210:getfield        #585 <Field TextView mTitleView>
	//  108  213:astore          6
			byte byte2 = 8;
	//  109  215:bipush          8
	//  110  217:istore          4
			byte byte1;
			if(flag1)
	//* 111  219:iload_2         
	//* 112  220:ifeq            228
				byte1 = 0;
	//  113  223:iconst_0        
	//  114  224:istore_2        
			else
	//* 115  225:goto            231
				byte1 = 8;
	//  116  228:bipush          8
	//  117  230:istore_2        
			((TextView) (obj)).setVisibility(((int) (byte1)));
	//  118  231:aload           6
	//  119  233:iload_2         
	//  120  234:invokevirtual   #611 <Method void TextView.setVisibility(int)>
			obj = ((Object) (mSubtitleView));
	//  121  237:aload_0         
	//  122  238:getfield        #607 <Field TextView mSubtitleView>
	//  123  241:astore          6
			byte byte0;
			if(flag)
	//* 124  243:iload_1         
	//* 125  244:ifeq            252
				byte0 = 0;
	//  126  247:iconst_0        
	//  127  248:istore_1        
			else
	//* 128  249:goto            255
				byte0 = 8;
	//  129  252:bipush          8
	//  130  254:istore_1        
			((TextView) (obj)).setVisibility(((int) (byte0)));
	//  131  255:aload           6
	//  132  257:iload_1         
	//  133  258:invokevirtual   #611 <Method void TextView.setVisibility(int)>
			obj = ((Object) (mState));
	//  134  261:aload_0         
	//  135  262:getfield        #329 <Field PlaybackStateCompat mState>
	//  136  265:astore          6
			if(obj != null)
	//* 137  267:aload           6
	//* 138  269:ifnull          437
			{
				int i;
				if(((PlaybackStateCompat) (obj)).a() != 6 && mState.a() != 3)
	//* 139  272:aload           6
	//* 140  274:invokevirtual   #599 <Method int PlaybackStateCompat.a()>
	//* 141  277:bipush          6
	//* 142  279:icmpeq          301
	//* 143  282:aload_0         
	//* 144  283:getfield        #329 <Field PlaybackStateCompat mState>
	//* 145  286:invokevirtual   #599 <Method int PlaybackStateCompat.a()>
	//* 146  289:iconst_3        
	//* 147  290:icmpne          296
	//* 148  293:goto            301
					i = 0;
	//  149  296:iconst_0        
	//  150  297:istore_1        
				else
	//* 151  298:goto            303
					i = 1;
	//  152  301:iconst_1        
	//  153  302:istore_1        
				obj = ((Object) (mPlaybackControlButton.getContext()));
	//  154  303:aload_0         
	//  155  304:getfield        #613 <Field ImageButton mPlaybackControlButton>
	//  156  307:invokevirtual   #616 <Method Context ImageButton.getContext()>
	//  157  310:astore          6
				int j;
				if(i != 0 && isPauseActionSupported())
	//* 158  312:iload_1         
	//* 159  313:ifeq            334
	//* 160  316:aload_0         
	//* 161  317:invokevirtual   #619 <Method boolean isPauseActionSupported()>
	//* 162  320:ifeq            334
				{
					i = android.support.v7.mediarouter.R.attr.mediaRoutePauseDrawable;
	//  163  323:getstatic       #624 <Field int android.support.v7.mediarouter.R$attr.mediaRoutePauseDrawable>
	//  164  326:istore_1        
					j = android.support.v7.mediarouter.R.string.mr_controller_pause;
	//  165  327:getstatic       #627 <Field int android.support.v7.mediarouter.R$string.mr_controller_pause>
	//  166  330:istore_2        
				} else
	//* 167  331:goto            384
				if(i != 0 && isStopActionSupported())
	//* 168  334:iload_1         
	//* 169  335:ifeq            356
	//* 170  338:aload_0         
	//* 171  339:invokevirtual   #630 <Method boolean isStopActionSupported()>
	//* 172  342:ifeq            356
				{
					i = android.support.v7.mediarouter.R.attr.mediaRouteStopDrawable;
	//  173  345:getstatic       #633 <Field int android.support.v7.mediarouter.R$attr.mediaRouteStopDrawable>
	//  174  348:istore_1        
					j = android.support.v7.mediarouter.R.string.mr_controller_stop;
	//  175  349:getstatic       #636 <Field int android.support.v7.mediarouter.R$string.mr_controller_stop>
	//  176  352:istore_2        
				} else
	//* 177  353:goto            384
				if(i == 0 && isPlayActionSupported())
	//* 178  356:iload_1         
	//* 179  357:ifne            378
	//* 180  360:aload_0         
	//* 181  361:invokevirtual   #639 <Method boolean isPlayActionSupported()>
	//* 182  364:ifeq            378
				{
					i = android.support.v7.mediarouter.R.attr.mediaRoutePlayDrawable;
	//  183  367:getstatic       #642 <Field int android.support.v7.mediarouter.R$attr.mediaRoutePlayDrawable>
	//  184  370:istore_1        
					j = android.support.v7.mediarouter.R.string.mr_controller_play;
	//  185  371:getstatic       #645 <Field int android.support.v7.mediarouter.R$string.mr_controller_play>
	//  186  374:istore_2        
				} else
	//* 187  375:goto            384
				{
					i = 0;
	//  188  378:iconst_0        
	//  189  379:istore_1        
					j = 0;
	//  190  380:iconst_0        
	//  191  381:istore_2        
					flag2 = false;
	//  192  382:iconst_0        
	//  193  383:istore_3        
				}
				ImageButton imagebutton = mPlaybackControlButton;
	//  194  384:aload_0         
	//  195  385:getfield        #613 <Field ImageButton mPlaybackControlButton>
	//  196  388:astore          7
				if(flag2)
	//* 197  390:iload_3         
	//* 198  391:ifeq            397
					byte2 = 0;
	//  199  394:iconst_0        
	//  200  395:istore          4
				imagebutton.setVisibility(((int) (byte2)));
	//  201  397:aload           7
	//  202  399:iload           4
	//  203  401:invokevirtual   #646 <Method void ImageButton.setVisibility(int)>
				if(flag2)
	//* 204  404:iload_3         
	//* 205  405:ifeq            437
				{
					mPlaybackControlButton.setImageResource(MediaRouterThemeHelper.getThemeResource(((Context) (obj)), i));
	//  206  408:aload_0         
	//  207  409:getfield        #613 <Field ImageButton mPlaybackControlButton>
	//  208  412:aload           6
	//  209  414:iload_1         
	//  210  415:invokestatic    #650 <Method int MediaRouterThemeHelper.getThemeResource(Context, int)>
	//  211  418:invokevirtual   #653 <Method void ImageButton.setImageResource(int)>
					mPlaybackControlButton.setContentDescription(((Context) (obj)).getResources().getText(j));
	//  212  421:aload_0         
	//  213  422:getfield        #613 <Field ImageButton mPlaybackControlButton>
	//  214  425:aload           6
	//  215  427:invokevirtual   #208 <Method Resources Context.getResources()>
	//  216  430:iload_2         
	//  217  431:invokevirtual   #657 <Method CharSequence Resources.getText(int)>
	//  218  434:invokevirtual   #660 <Method void ImageButton.setContentDescription(CharSequence)>
				}
			}
		}
	//  219  437:return          
	}

	private void updateVolumeControlLayout()
	{
		boolean flag = isVolumeControlAvailable(mRoute);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//    3    5:invokevirtual   #665 <Method boolean isVolumeControlAvailable(android.support.v7.media.MediaRouter$RouteInfo)>
	//    4    8:istore_2        
		byte byte0 = 8;
	//    5    9:bipush          8
	//    6   11:istore_1        
		if(flag)
	//*   7   12:iload_2         
	//*   8   13:ifeq            87
		{
			if(mVolumeControlLayout.getVisibility() == 8)
	//*   9   16:aload_0         
	//*  10   17:getfield        #399 <Field LinearLayout mVolumeControlLayout>
	//*  11   20:invokevirtual   #404 <Method int LinearLayout.getVisibility()>
	//*  12   23:bipush          8
	//*  13   25:icmpne          96
			{
				mVolumeControlLayout.setVisibility(0);
	//   14   28:aload_0         
	//   15   29:getfield        #399 <Field LinearLayout mVolumeControlLayout>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #566 <Method void LinearLayout.setVisibility(int)>
				mVolumeSlider.setMax(mRoute.getVolumeMax());
	//   18   36:aload_0         
	//   19   37:getfield        #667 <Field SeekBar mVolumeSlider>
	//   20   40:aload_0         
	//   21   41:getfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//   22   44:invokevirtual   #670 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolumeMax()>
	//   23   47:invokevirtual   #675 <Method void SeekBar.setMax(int)>
				mVolumeSlider.setProgress(mRoute.getVolume());
	//   24   50:aload_0         
	//   25   51:getfield        #667 <Field SeekBar mVolumeSlider>
	//   26   54:aload_0         
	//   27   55:getfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//   28   58:invokevirtual   #678 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
	//   29   61:invokevirtual   #681 <Method void SeekBar.setProgress(int)>
				MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton = mGroupExpandCollapseButton;
	//   30   64:aload_0         
	//   31   65:getfield        #683 <Field MediaRouteExpandCollapseButton mGroupExpandCollapseButton>
	//   32   68:astore_3        
				if(getGroup() != null)
	//*  33   69:aload_0         
	//*  34   70:invokespecial   #462 <Method android.support.v7.media.MediaRouter$RouteGroup getGroup()>
	//*  35   73:ifnonnull       79
	//*  36   76:goto            81
					byte0 = 0;
	//   37   79:iconst_0        
	//   38   80:istore_1        
				mediarouteexpandcollapsebutton.setVisibility(((int) (byte0)));
	//   39   81:aload_3         
	//   40   82:iload_1         
	//   41   83:invokevirtual   #686 <Method void MediaRouteExpandCollapseButton.setVisibility(int)>
				return;
	//   42   86:return          
			}
		} else
		{
			mVolumeControlLayout.setVisibility(8);
	//   43   87:aload_0         
	//   44   88:getfield        #399 <Field LinearLayout mVolumeControlLayout>
	//   45   91:bipush          8
	//   46   93:invokevirtual   #566 <Method void LinearLayout.setVisibility(int)>
		}
	//   47   96:return          
	}

	private static boolean uriEquals(Uri uri, Uri uri1)
	{
		if(uri != null && uri.equals(((Object) (uri1))))
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:aload_0         
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #691 <Method boolean Uri.equals(Object)>
	//*   5    9:ifeq            14
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		return uri == null && uri1 == null;
	//    8   14:aload_0         
	//    9   15:ifnonnull       24
	//   10   18:aload_1         
	//   11   19:ifnonnull       24
	//   12   22:iconst_1        
	//   13   23:ireturn         
	//   14   24:iconst_0        
	//   15   25:ireturn         
	}

	void animateGroupListItemsInternal(Map map, Map map1)
	{
		Object obj = ((Object) (mGroupMemberRoutesAdded));
	//    0    0:aload_0         
	//    1    1:getfield        #356 <Field Set mGroupMemberRoutesAdded>
	//    2    4:astore          10
		if(obj != null)
	//*   3    6:aload           10
	//*   4    8:ifnull          525
		{
			if(mGroupMemberRoutesRemoved == null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #499 <Field Set mGroupMemberRoutesRemoved>
	//*   7   15:ifnonnull       19
				return;
	//    8   18:return          
			int j1 = ((Set) (obj)).size() - mGroupMemberRoutesRemoved.size();
	//    9   19:aload           10
	//   10   21:invokeinterface #512 <Method int Set.size()>
	//   11   26:aload_0         
	//   12   27:getfield        #499 <Field Set mGroupMemberRoutesRemoved>
	//   13   30:invokeinterface #512 <Method int Set.size()>
	//   14   35:isub            
	//   15   36:istore          8
			obj = ((Object) (new _cls9()));
	//   16   38:new             #694 <Class MediaRouteControllerDialog$9>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:invokespecial   #695 <Method void MediaRouteControllerDialog$9(MediaRouteControllerDialog)>
	//   20   46:astore          10
			int k1 = mVolumeGroupList.getFirstVisiblePosition();
	//   21   48:aload_0         
	//   22   49:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//   23   52:invokevirtual   #337 <Method int OverlayListView.getFirstVisiblePosition()>
	//   24   55:istore          9
			int k = 0;
	//   25   57:iconst_0        
	//   26   58:istore          4
			int i;
			for(boolean flag = false; k < mVolumeGroupList.getChildCount(); flag = ((boolean) (i)))
	//*  27   60:iconst_0        
	//*  28   61:istore          5
	//*  29   63:iload           4
	//*  30   65:aload_0         
	//*  31   66:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//*  32   69:invokevirtual   #340 <Method int OverlayListView.getChildCount()>
	//*  33   72:icmpge          334
			{
				View view = mVolumeGroupList.getChildAt(k);
	//   34   75:aload_0         
	//   35   76:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//   36   79:iload           4
	//   37   81:invokevirtual   #344 <Method View OverlayListView.getChildAt(int)>
	//   38   84:astore          11
				android.support.v7.media.MediaRouter.RouteInfo routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)mVolumeGroupAdapter.getItem(k1 + k);
	//   39   86:aload_0         
	//   40   87:getfield        #346 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   41   90:iload           9
	//   42   92:iload           4
	//   43   94:iadd            
	//   44   95:invokevirtual   #352 <Method Object MediaRouteControllerDialog$VolumeGroupAdapter.getItem(int)>
	//   45   98:checkcast       #354 <Class android.support.v7.media.MediaRouter$RouteInfo>
	//   46  101:astore          12
				Object obj1 = ((Object) ((Rect)map.get(((Object) (routeinfo)))));
	//   47  103:aload_1         
	//   48  104:aload           12
	//   49  106:invokeinterface #701 <Method Object Map.get(Object)>
	//   50  111:checkcast       #703 <Class Rect>
	//   51  114:astore          13
				int i1 = view.getTop();
	//   52  116:aload           11
	//   53  118:invokevirtual   #706 <Method int View.getTop()>
	//   54  121:istore          7
				if(obj1 != null)
	//*  55  123:aload           13
	//*  56  125:ifnull          137
					i = ((Rect) (obj1)).top;
	//   57  128:aload           13
	//   58  130:getfield        #709 <Field int Rect.top>
	//   59  133:istore_3        
				else
	//*  60  134:goto            148
					i = mVolumeGroupListItemHeight * j1 + i1;
	//   61  137:aload_0         
	//   62  138:getfield        #711 <Field int mVolumeGroupListItemHeight>
	//   63  141:iload           8
	//   64  143:imul            
	//   65  144:iload           7
	//   66  146:iadd            
	//   67  147:istore_3        
				obj1 = ((Object) (new AnimationSet(true)));
	//   68  148:new             #713 <Class AnimationSet>
	//   69  151:dup             
	//   70  152:iconst_1        
	//   71  153:invokespecial   #715 <Method void AnimationSet(boolean)>
	//   72  156:astore          13
				Object obj2 = ((Object) (mGroupMemberRoutesAdded));
	//   73  158:aload_0         
	//   74  159:getfield        #356 <Field Set mGroupMemberRoutesAdded>
	//   75  162:astore          14
				int l = i;
	//   76  164:iload_3         
	//   77  165:istore          6
				if(obj2 != null)
	//*  78  167:aload           14
	//*  79  169:ifnull          219
				{
					l = i;
	//   80  172:iload_3         
	//   81  173:istore          6
					if(((Set) (obj2)).contains(((Object) (routeinfo))))
	//*  82  175:aload           14
	//*  83  177:aload           12
	//*  84  179:invokeinterface #362 <Method boolean Set.contains(Object)>
	//*  85  184:ifeq            219
					{
						obj2 = ((Object) (new AlphaAnimation(0.0F, 0.0F)));
	//   86  187:new             #364 <Class AlphaAnimation>
	//   87  190:dup             
	//   88  191:fconst_0        
	//   89  192:fconst_0        
	//   90  193:invokespecial   #367 <Method void AlphaAnimation(float, float)>
	//   91  196:astore          14
						((Animation) (obj2)).setDuration(mGroupListFadeInDurationMs);
	//   92  198:aload           14
	//   93  200:aload_0         
	//   94  201:getfield        #369 <Field int mGroupListFadeInDurationMs>
	//   95  204:i2l             
	//   96  205:invokevirtual   #309 <Method void Animation.setDuration(long)>
						((AnimationSet) (obj1)).addAnimation(((Animation) (obj2)));
	//   97  208:aload           13
	//   98  210:aload           14
	//   99  212:invokevirtual   #718 <Method void AnimationSet.addAnimation(Animation)>
						l = i1;
	//  100  215:iload           7
	//  101  217:istore          6
					}
				}
				obj2 = ((Object) (new TranslateAnimation(0.0F, 0.0F, l - i1, 0.0F)));
	//  102  219:new             #720 <Class TranslateAnimation>
	//  103  222:dup             
	//  104  223:fconst_0        
	//  105  224:fconst_0        
	//  106  225:iload           6
	//  107  227:iload           7
	//  108  229:isub            
	//  109  230:i2f             
	//  110  231:fconst_0        
	//  111  232:invokespecial   #723 <Method void TranslateAnimation(float, float, float, float)>
	//  112  235:astore          14
				((Animation) (obj2)).setDuration(mGroupListAnimationDurationMs);
	//  113  237:aload           14
	//  114  239:aload_0         
	//  115  240:getfield        #303 <Field int mGroupListAnimationDurationMs>
	//  116  243:i2l             
	//  117  244:invokevirtual   #309 <Method void Animation.setDuration(long)>
				((AnimationSet) (obj1)).addAnimation(((Animation) (obj2)));
	//  118  247:aload           13
	//  119  249:aload           14
	//  120  251:invokevirtual   #718 <Method void AnimationSet.addAnimation(Animation)>
				((AnimationSet) (obj1)).setFillAfter(true);
	//  121  254:aload           13
	//  122  256:iconst_1        
	//  123  257:invokevirtual   #724 <Method void AnimationSet.setFillAfter(boolean)>
				((AnimationSet) (obj1)).setFillEnabled(true);
	//  124  260:aload           13
	//  125  262:iconst_1        
	//  126  263:invokevirtual   #725 <Method void AnimationSet.setFillEnabled(boolean)>
				((AnimationSet) (obj1)).setInterpolator(mInterpolator);
	//  127  266:aload           13
	//  128  268:aload_0         
	//  129  269:getfield        #311 <Field Interpolator mInterpolator>
	//  130  272:invokevirtual   #726 <Method void AnimationSet.setInterpolator(Interpolator)>
				i = ((int) (flag));
	//  131  275:iload           5
	//  132  277:istore_3        
				if(!flag)
	//* 133  278:iload           5
	//* 134  280:ifne            292
				{
					((AnimationSet) (obj1)).setAnimationListener(((android.view.animation.Animation.AnimationListener) (obj)));
	//  135  283:aload           13
	//  136  285:aload           10
	//  137  287:invokevirtual   #727 <Method void AnimationSet.setAnimationListener(android.view.animation.Animation$AnimationListener)>
					i = 1;
	//  138  290:iconst_1        
	//  139  291:istore_3        
				}
				view.clearAnimation();
	//  140  292:aload           11
	//  141  294:invokevirtual   #382 <Method void View.clearAnimation()>
				view.startAnimation(((Animation) (obj1)));
	//  142  297:aload           11
	//  143  299:aload           13
	//  144  301:invokevirtual   #321 <Method void View.startAnimation(Animation)>
				map.remove(((Object) (routeinfo)));
	//  145  304:aload_1         
	//  146  305:aload           12
	//  147  307:invokeinterface #730 <Method Object Map.remove(Object)>
	//  148  312:pop             
				map1.remove(((Object) (routeinfo)));
	//  149  313:aload_2         
	//  150  314:aload           12
	//  151  316:invokeinterface #730 <Method Object Map.remove(Object)>
	//  152  321:pop             
				k++;
	//  153  322:iload           4
	//  154  324:iconst_1        
	//  155  325:iadd            
	//  156  326:istore          4
			}

	//  157  328:iload_3         
	//  158  329:istore          5
	//* 159  331:goto            63
			for(Iterator iterator = map1.entrySet().iterator(); iterator.hasNext(); mVolumeGroupList.addOverlayObject(((OverlayListView.OverlayObject) (map1))))
	//* 160  334:aload_2         
	//* 161  335:invokeinterface #734 <Method Set Map.entrySet()>
	//* 162  340:invokeinterface #738 <Method Iterator Set.iterator()>
	//* 163  345:astore          10
	//* 164  347:aload           10
	//* 165  349:invokeinterface #743 <Method boolean Iterator.hasNext()>
	//* 166  354:ifeq            524
			{
				map1 = ((Map) ((java.util.Map.Entry)iterator.next()));
	//  167  357:aload           10
	//  168  359:invokeinterface #747 <Method Object Iterator.next()>
	//  169  364:checkcast       #749 <Class java.util.Map$Entry>
	//  170  367:astore_2        
				final android.support.v7.media.MediaRouter.RouteInfo route = (android.support.v7.media.MediaRouter.RouteInfo)((java.util.Map.Entry) (map1)).getKey();
	//  171  368:aload_2         
	//  172  369:invokeinterface #752 <Method Object java.util.Map$Entry.getKey()>
	//  173  374:checkcast       #354 <Class android.support.v7.media.MediaRouter$RouteInfo>
	//  174  377:astore          11
				map1 = ((Map) ((BitmapDrawable)((java.util.Map.Entry) (map1)).getValue()));
	//  175  379:aload_2         
	//  176  380:invokeinterface #755 <Method Object java.util.Map$Entry.getValue()>
	//  177  385:checkcast       #757 <Class BitmapDrawable>
	//  178  388:astore_2        
				Rect rect = (Rect)map.get(((Object) (route)));
	//  179  389:aload_1         
	//  180  390:aload           11
	//  181  392:invokeinterface #701 <Method Object Map.get(Object)>
	//  182  397:checkcast       #703 <Class Rect>
	//  183  400:astore          12
				if(mGroupMemberRoutesRemoved.contains(((Object) (route))))
	//* 184  402:aload_0         
	//* 185  403:getfield        #499 <Field Set mGroupMemberRoutesRemoved>
	//* 186  406:aload           11
	//* 187  408:invokeinterface #362 <Method boolean Set.contains(Object)>
	//* 188  413:ifeq            450
				{
					map1 = ((Map) ((new OverlayListView.OverlayObject(((BitmapDrawable) (map1)), rect)).setAlphaAnimation(1.0F, 0.0F).setDuration(mGroupListFadeOutDurationMs).setInterpolator(mInterpolator)));
	//  189  416:new             #759 <Class OverlayListView$OverlayObject>
	//  190  419:dup             
	//  191  420:aload_2         
	//  192  421:aload           12
	//  193  423:invokespecial   #762 <Method void OverlayListView$OverlayObject(BitmapDrawable, Rect)>
	//  194  426:fconst_1        
	//  195  427:fconst_0        
	//  196  428:invokevirtual   #766 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setAlphaAnimation(float, float)>
	//  197  431:aload_0         
	//  198  432:getfield        #768 <Field int mGroupListFadeOutDurationMs>
	//  199  435:i2l             
	//  200  436:invokevirtual   #771 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setDuration(long)>
	//  201  439:aload_0         
	//  202  440:getfield        #311 <Field Interpolator mInterpolator>
	//  203  443:invokevirtual   #774 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setInterpolator(Interpolator)>
	//  204  446:astore_2        
				} else
	//* 205  447:goto            513
				{
					int j = mVolumeGroupListItemHeight;
	//  206  450:aload_0         
	//  207  451:getfield        #711 <Field int mVolumeGroupListItemHeight>
	//  208  454:istore_3        
					map1 = ((Map) ((new OverlayListView.OverlayObject(((BitmapDrawable) (map1)), rect)).setTranslateYAnimation(j * j1).setDuration(mGroupListAnimationDurationMs).setInterpolator(mInterpolator).setAnimationEndListener(((OverlayListView.OverlayObject.OnAnimationEndListener) (new _cls10())))));
	//  209  455:new             #759 <Class OverlayListView$OverlayObject>
	//  210  458:dup             
	//  211  459:aload_2         
	//  212  460:aload           12
	//  213  462:invokespecial   #762 <Method void OverlayListView$OverlayObject(BitmapDrawable, Rect)>
	//  214  465:iload_3         
	//  215  466:iload           8
	//  216  468:imul            
	//  217  469:invokevirtual   #778 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setTranslateYAnimation(int)>
	//  218  472:aload_0         
	//  219  473:getfield        #303 <Field int mGroupListAnimationDurationMs>
	//  220  476:i2l             
	//  221  477:invokevirtual   #771 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setDuration(long)>
	//  222  480:aload_0         
	//  223  481:getfield        #311 <Field Interpolator mInterpolator>
	//  224  484:invokevirtual   #774 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setInterpolator(Interpolator)>
	//  225  487:new             #780 <Class MediaRouteControllerDialog$10>
	//  226  490:dup             
	//  227  491:aload_0         
	//  228  492:aload           11
	//  229  494:invokespecial   #783 <Method void MediaRouteControllerDialog$10(MediaRouteControllerDialog, android.support.v7.media.MediaRouter$RouteInfo)>
	//  230  497:invokevirtual   #787 <Method OverlayListView$OverlayObject OverlayListView$OverlayObject.setAnimationEndListener(OverlayListView$OverlayObject$OnAnimationEndListener)>
	//  231  500:astore_2        
					mGroupMemberRoutesAnimatingWithBitmap.add(((Object) (route)));
	//  232  501:aload_0         
	//  233  502:getfield        #789 <Field Set mGroupMemberRoutesAnimatingWithBitmap>
	//  234  505:aload           11
	//  235  507:invokeinterface #792 <Method boolean Set.add(Object)>
	//  236  512:pop             
				}
			}

	//  237  513:aload_0         
	//  238  514:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//  239  517:aload_2         
	//  240  518:invokevirtual   #796 <Method void OverlayListView.addOverlayObject(OverlayListView$OverlayObject)>
	//* 241  521:goto            347
			return;
	//  242  524:return          
		} else
		{
			return;
	//  243  525:return          
		}
	}

	void clearGroupListAnimation(boolean flag)
	{
		int j = mVolumeGroupList.getFirstVisiblePosition();
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//    2    4:invokevirtual   #337 <Method int OverlayListView.getFirstVisiblePosition()>
	//    3    7:istore_3        
		for(int i = 0; i < mVolumeGroupList.getChildCount(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//*   9   15:invokevirtual   #340 <Method int OverlayListView.getChildCount()>
	//*  10   18:icmpge          171
		{
			View view = mVolumeGroupList.getChildAt(i);
	//   11   21:aload_0         
	//   12   22:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//   13   25:iload_2         
	//   14   26:invokevirtual   #344 <Method View OverlayListView.getChildAt(int)>
	//   15   29:astore          4
			Object obj = ((Object) ((android.support.v7.media.MediaRouter.RouteInfo)mVolumeGroupAdapter.getItem(j + i)));
	//   16   31:aload_0         
	//   17   32:getfield        #346 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//   18   35:iload_3         
	//   19   36:iload_2         
	//   20   37:iadd            
	//   21   38:invokevirtual   #352 <Method Object MediaRouteControllerDialog$VolumeGroupAdapter.getItem(int)>
	//   22   41:checkcast       #354 <Class android.support.v7.media.MediaRouter$RouteInfo>
	//   23   44:astore          5
			if(flag)
	//*  24   46:iload_1         
	//*  25   47:ifeq            76
			{
				Set set = mGroupMemberRoutesAdded;
	//   26   50:aload_0         
	//   27   51:getfield        #356 <Field Set mGroupMemberRoutesAdded>
	//   28   54:astore          6
				if(set != null && set.contains(obj))
	//*  29   56:aload           6
	//*  30   58:ifnull          76
	//*  31   61:aload           6
	//*  32   63:aload           5
	//*  33   65:invokeinterface #362 <Method boolean Set.contains(Object)>
	//*  34   70:ifeq            76
					continue;
	//   35   73:goto            164
			}
			((LinearLayout)view.findViewById(android.support.v7.mediarouter.R.id.volume_item_container)).setVisibility(0);
	//   36   76:aload           4
	//   37   78:getstatic       #802 <Field int android.support.v7.mediarouter.R$id.volume_item_container>
	//   38   81:invokevirtual   #805 <Method View View.findViewById(int)>
	//   39   84:checkcast       #401 <Class LinearLayout>
	//   40   87:iconst_0        
	//   41   88:invokevirtual   #566 <Method void LinearLayout.setVisibility(int)>
			obj = ((Object) (new AnimationSet(true)));
	//   42   91:new             #713 <Class AnimationSet>
	//   43   94:dup             
	//   44   95:iconst_1        
	//   45   96:invokespecial   #715 <Method void AnimationSet(boolean)>
	//   46   99:astore          5
			AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 1.0F);
	//   47  101:new             #364 <Class AlphaAnimation>
	//   48  104:dup             
	//   49  105:fconst_1        
	//   50  106:fconst_1        
	//   51  107:invokespecial   #367 <Method void AlphaAnimation(float, float)>
	//   52  110:astore          6
			((Animation) (alphaanimation)).setDuration(0L);
	//   53  112:aload           6
	//   54  114:lconst_0        
	//   55  115:invokevirtual   #309 <Method void Animation.setDuration(long)>
			((AnimationSet) (obj)).addAnimation(((Animation) (alphaanimation)));
	//   56  118:aload           5
	//   57  120:aload           6
	//   58  122:invokevirtual   #718 <Method void AnimationSet.addAnimation(Animation)>
			((Animation) (new TranslateAnimation(0.0F, 0.0F, 0.0F, 0.0F))).setDuration(0L);
	//   59  125:new             #720 <Class TranslateAnimation>
	//   60  128:dup             
	//   61  129:fconst_0        
	//   62  130:fconst_0        
	//   63  131:fconst_0        
	//   64  132:fconst_0        
	//   65  133:invokespecial   #723 <Method void TranslateAnimation(float, float, float, float)>
	//   66  136:lconst_0        
	//   67  137:invokevirtual   #309 <Method void Animation.setDuration(long)>
			((AnimationSet) (obj)).setFillAfter(true);
	//   68  140:aload           5
	//   69  142:iconst_1        
	//   70  143:invokevirtual   #724 <Method void AnimationSet.setFillAfter(boolean)>
			((AnimationSet) (obj)).setFillEnabled(true);
	//   71  146:aload           5
	//   72  148:iconst_1        
	//   73  149:invokevirtual   #725 <Method void AnimationSet.setFillEnabled(boolean)>
			view.clearAnimation();
	//   74  152:aload           4
	//   75  154:invokevirtual   #382 <Method void View.clearAnimation()>
			view.startAnimation(((Animation) (obj)));
	//   76  157:aload           4
	//   77  159:aload           5
	//   78  161:invokevirtual   #321 <Method void View.startAnimation(Animation)>
		}

	//   79  164:iload_2         
	//   80  165:iconst_1        
	//   81  166:iadd            
	//   82  167:istore_2        
	//*  83  168:goto            10
		mVolumeGroupList.stopAnimationAll();
	//   84  171:aload_0         
	//   85  172:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//   86  175:invokevirtual   #808 <Method void OverlayListView.stopAnimationAll()>
		if(!flag)
	//*  87  178:iload_1         
	//*  88  179:ifne            187
			finishAnimation(false);
	//   89  182:aload_0         
	//   90  183:iconst_0        
	//   91  184:invokevirtual   #811 <Method void finishAnimation(boolean)>
	//   92  187:return          
	}

	void clearLoadedBitmap()
	{
		mArtIconIsLoaded = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #814 <Field boolean mArtIconIsLoaded>
		mArtIconLoadedBitmap = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #816 <Field Bitmap mArtIconLoadedBitmap>
		mArtIconBackgroundColor = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #818 <Field int mArtIconBackgroundColor>
	//    9   15:return          
	}

	void finishAnimation(boolean flag)
	{
		mGroupMemberRoutesAdded = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #356 <Field Set mGroupMemberRoutesAdded>
		mGroupMemberRoutesRemoved = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #499 <Field Set mGroupMemberRoutesRemoved>
		mIsGroupListAnimating = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #275 <Field boolean mIsGroupListAnimating>
		if(mIsGroupListAnimationPending)
	//*   9   15:aload_0         
	//*  10   16:getfield        #820 <Field boolean mIsGroupListAnimationPending>
	//*  11   19:ifeq            32
		{
			mIsGroupListAnimationPending = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #820 <Field boolean mIsGroupListAnimationPending>
			updateLayoutHeight(flag);
	//   15   27:aload_0         
	//   16   28:iload_1         
	//   17   29:invokevirtual   #823 <Method void updateLayoutHeight(boolean)>
		}
		mVolumeGroupList.setEnabled(true);
	//   18   32:aload_0         
	//   19   33:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//   20   36:iconst_1        
	//   21   37:invokevirtual   #270 <Method void OverlayListView.setEnabled(boolean)>
	//   22   40:return          
	}

	int getDesiredArtHeight(int i, int j)
	{
		if(i >= j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmplt          22
			return (int)(((float)mDialogContentWidth * (float)j) / (float)i + 0.5F);
	//    3    5:aload_0         
	//    4    6:getfield        #827 <Field int mDialogContentWidth>
	//    5    9:i2f             
	//    6   10:iload_2         
	//    7   11:i2f             
	//    8   12:fmul            
	//    9   13:iload_1         
	//   10   14:i2f             
	//   11   15:fdiv            
	//   12   16:ldc2            #828 <Float 0.5F>
	//   13   19:fadd            
	//   14   20:f2i             
	//   15   21:ireturn         
		else
			return (int)(((float)mDialogContentWidth * 9F) / 16F + 0.5F);
	//   16   22:aload_0         
	//   17   23:getfield        #827 <Field int mDialogContentWidth>
	//   18   26:i2f             
	//   19   27:ldc2            #829 <Float 9F>
	//   20   30:fmul            
	//   21   31:ldc2            #830 <Float 16F>
	//   22   34:fdiv            
	//   23   35:ldc2            #828 <Float 0.5F>
	//   24   38:fadd            
	//   25   39:f2i             
	//   26   40:ireturn         
	}

	public View getMediaControlView()
	{
		return mCustomControlView;
	//    0    0:aload_0         
	//    1    1:getfield        #325 <Field View mCustomControlView>
	//    2    4:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getMediaSession()
	{
		MediaControllerCompat mediacontrollercompat = mMediaController;
	//    0    0:aload_0         
	//    1    1:getfield        #523 <Field MediaControllerCompat mMediaController>
	//    2    4:astore_1        
		if(mediacontrollercompat == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return mediacontrollercompat.e();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #835 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaControllerCompat.e()>
	//    9   15:areturn         
	}

	public android.support.v7.media.MediaRouter.RouteInfo getRoute()
	{
		return mRoute;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//    2    4:areturn         
	}

	boolean isPauseActionSupported()
	{
		return (mState.e() & 514L) != 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #329 <Field PlaybackStateCompat mState>
	//    2    4:invokevirtual   #839 <Method long PlaybackStateCompat.e()>
	//    3    7:ldc2w           #840 <Long 514L>
	//    4   10:land            
	//    5   11:lconst_0        
	//    6   12:lcmp            
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	boolean isPlayActionSupported()
	{
		return (mState.e() & 516L) != 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #329 <Field PlaybackStateCompat mState>
	//    2    4:invokevirtual   #839 <Method long PlaybackStateCompat.e()>
	//    3    7:ldc2w           #842 <Long 516L>
	//    4   10:land            
	//    5   11:lconst_0        
	//    6   12:lcmp            
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	boolean isStopActionSupported()
	{
		return (mState.e() & 1L) != 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #329 <Field PlaybackStateCompat mState>
	//    2    4:invokevirtual   #839 <Method long PlaybackStateCompat.e()>
	//    3    7:lconst_1        
	//    4    8:land            
	//    5    9:lconst_0        
	//    6   10:lcmp            
	//    7   11:ifeq            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	boolean isVolumeControlAvailable(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		return mVolumeControlEnabled && routeinfo.getVolumeHandling() == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field boolean mVolumeControlEnabled>
	//    2    4:ifeq            17
	//    3    7:aload_1         
	//    4    8:invokevirtual   #846 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolumeHandling()>
	//    5   11:iconst_1        
	//    6   12:icmpne          17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public boolean isVolumeControlEnabled()
	{
		return mVolumeControlEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field boolean mVolumeControlEnabled>
	//    2    4:ireturn         
	}

	void loadInterpolator()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #236 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          34
		{
			Interpolator interpolator;
			if(mIsGroupExpanded)
	//*   3    8:aload_0         
	//*   4    9:getfield        #509 <Field boolean mIsGroupExpanded>
	//*   5   12:ifeq            23
				interpolator = mLinearOutSlowInInterpolator;
	//    6   15:aload_0         
	//    7   16:getfield        #249 <Field Interpolator mLinearOutSlowInInterpolator>
	//    8   19:astore_1        
			else
	//*   9   20:goto            28
				interpolator = mFastOutSlowInInterpolator;
	//   10   23:aload_0         
	//   11   24:getfield        #254 <Field Interpolator mFastOutSlowInInterpolator>
	//   12   27:astore_1        
			mInterpolator = interpolator;
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:putfield        #311 <Field Interpolator mInterpolator>
			return;
	//   16   33:return          
		} else
		{
			mInterpolator = mAccelerateDecelerateInterpolator;
	//   17   34:aload_0         
	//   18   35:aload_0         
	//   19   36:getfield        #260 <Field Interpolator mAccelerateDecelerateInterpolator>
	//   20   39:putfield        #311 <Field Interpolator mInterpolator>
			return;
	//   21   42:return          
		}
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #850 <Method void AlertDialog.onAttachedToWindow()>
		mAttachedToWindow = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #531 <Field boolean mAttachedToWindow>
		mRouter.addCallback(MediaRouteSelector.EMPTY, ((android.support.v7.media.MediaRouter.Callback) (mCallback)), 2);
	//    5    9:aload_0         
	//    6   10:getfield        #183 <Field MediaRouter mRouter>
	//    7   13:getstatic       #856 <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//    8   16:aload_0         
	//    9   17:getfield        #188 <Field MediaRouteControllerDialog$MediaRouterCallback mCallback>
	//   10   20:iconst_2        
	//   11   21:invokevirtual   #860 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback, int)>
		setMediaSession(mRouter.getMediaSessionToken());
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #183 <Field MediaRouter mRouter>
	//   15   29:invokevirtual   #198 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaRouter.getMediaSessionToken()>
	//   16   32:invokespecial   #202 <Method void setMediaSession(android.support.v4.media.session.MediaSessionCompat$Token)>
	//   17   35:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #864 <Method void AlertDialog.onCreate(Bundle)>
		getWindow().setBackgroundDrawableResource(0x106000d);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #868 <Method Window getWindow()>
	//    5    9:ldc2            #869 <Int 0x106000d>
	//    6   12:invokevirtual   #874 <Method void Window.setBackgroundDrawableResource(int)>
		setContentView(android.support.v7.mediarouter.R.layout.mr_controller_material_dialog_b);
	//    7   15:aload_0         
	//    8   16:getstatic       #879 <Field int android.support.v7.mediarouter.R$layout.mr_controller_material_dialog_b>
	//    9   19:invokevirtual   #882 <Method void setContentView(int)>
		findViewById(0x102001b).setVisibility(8);
	//   10   22:aload_0         
	//   11   23:ldc1            #9   <Int 0x102001b>
	//   12   25:invokevirtual   #883 <Method View findViewById(int)>
	//   13   28:bipush          8
	//   14   30:invokevirtual   #565 <Method void View.setVisibility(int)>
		Object obj = ((Object) (new ClickListener()));
	//   15   33:new             #885 <Class MediaRouteControllerDialog$ClickListener>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #886 <Method void MediaRouteControllerDialog$ClickListener(MediaRouteControllerDialog)>
	//   19   41:astore          4
		mExpandableAreaLayout = (FrameLayout)findViewById(android.support.v7.mediarouter.R.id.mr_expandable_area);
	//   20   43:aload_0         
	//   21   44:aload_0         
	//   22   45:getstatic       #889 <Field int android.support.v7.mediarouter.R$id.mr_expandable_area>
	//   23   48:invokevirtual   #883 <Method View findViewById(int)>
	//   24   51:checkcast       #891 <Class FrameLayout>
	//   25   54:putfield        #893 <Field FrameLayout mExpandableAreaLayout>
		mExpandableAreaLayout.setOnClickListener(((android.view.View.OnClickListener) (new _cls2())));
	//   26   57:aload_0         
	//   27   58:getfield        #893 <Field FrameLayout mExpandableAreaLayout>
	//   28   61:new             #895 <Class MediaRouteControllerDialog$2>
	//   29   64:dup             
	//   30   65:aload_0         
	//   31   66:invokespecial   #896 <Method void MediaRouteControllerDialog$2(MediaRouteControllerDialog)>
	//   32   69:invokevirtual   #900 <Method void FrameLayout.setOnClickListener(android.view.View$OnClickListener)>
		mDialogAreaLayout = (LinearLayout)findViewById(android.support.v7.mediarouter.R.id.mr_dialog_area);
	//   33   72:aload_0         
	//   34   73:aload_0         
	//   35   74:getstatic       #903 <Field int android.support.v7.mediarouter.R$id.mr_dialog_area>
	//   36   77:invokevirtual   #883 <Method View findViewById(int)>
	//   37   80:checkcast       #401 <Class LinearLayout>
	//   38   83:putfield        #905 <Field LinearLayout mDialogAreaLayout>
		mDialogAreaLayout.setOnClickListener(((android.view.View.OnClickListener) (new _cls3())));
	//   39   86:aload_0         
	//   40   87:getfield        #905 <Field LinearLayout mDialogAreaLayout>
	//   41   90:new             #907 <Class MediaRouteControllerDialog$3>
	//   42   93:dup             
	//   43   94:aload_0         
	//   44   95:invokespecial   #908 <Method void MediaRouteControllerDialog$3(MediaRouteControllerDialog)>
	//   45   98:invokevirtual   #909 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
		int i = MediaRouterThemeHelper.getButtonTextColor(mContext);
	//   46  101:aload_0         
	//   47  102:getfield        #170 <Field Context mContext>
	//   48  105:invokestatic    #912 <Method int MediaRouterThemeHelper.getButtonTextColor(Context)>
	//   49  108:istore_2        
		mDisconnectButton = (Button)findViewById(0x102001a);
	//   50  109:aload_0         
	//   51  110:aload_0         
	//   52  111:ldc1            #7   <Int 0x102001a>
	//   53  113:invokevirtual   #883 <Method View findViewById(int)>
	//   54  116:checkcast       #914 <Class Button>
	//   55  119:putfield        #916 <Field Button mDisconnectButton>
		mDisconnectButton.setText(android.support.v7.mediarouter.R.string.mr_controller_disconnect);
	//   56  122:aload_0         
	//   57  123:getfield        #916 <Field Button mDisconnectButton>
	//   58  126:getstatic       #919 <Field int android.support.v7.mediarouter.R$string.mr_controller_disconnect>
	//   59  129:invokevirtual   #920 <Method void Button.setText(int)>
		mDisconnectButton.setTextColor(i);
	//   60  132:aload_0         
	//   61  133:getfield        #916 <Field Button mDisconnectButton>
	//   62  136:iload_2         
	//   63  137:invokevirtual   #923 <Method void Button.setTextColor(int)>
		mDisconnectButton.setOnClickListener(((android.view.View.OnClickListener) (obj)));
	//   64  140:aload_0         
	//   65  141:getfield        #916 <Field Button mDisconnectButton>
	//   66  144:aload           4
	//   67  146:invokevirtual   #924 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		mStopCastingButton = (Button)findViewById(0x1020019);
	//   68  149:aload_0         
	//   69  150:aload_0         
	//   70  151:ldc1            #11  <Int 0x1020019>
	//   71  153:invokevirtual   #883 <Method View findViewById(int)>
	//   72  156:checkcast       #914 <Class Button>
	//   73  159:putfield        #926 <Field Button mStopCastingButton>
		mStopCastingButton.setText(android.support.v7.mediarouter.R.string.mr_controller_stop_casting);
	//   74  162:aload_0         
	//   75  163:getfield        #926 <Field Button mStopCastingButton>
	//   76  166:getstatic       #929 <Field int android.support.v7.mediarouter.R$string.mr_controller_stop_casting>
	//   77  169:invokevirtual   #920 <Method void Button.setText(int)>
		mStopCastingButton.setTextColor(i);
	//   78  172:aload_0         
	//   79  173:getfield        #926 <Field Button mStopCastingButton>
	//   80  176:iload_2         
	//   81  177:invokevirtual   #923 <Method void Button.setTextColor(int)>
		mStopCastingButton.setOnClickListener(((android.view.View.OnClickListener) (obj)));
	//   82  180:aload_0         
	//   83  181:getfield        #926 <Field Button mStopCastingButton>
	//   84  184:aload           4
	//   85  186:invokevirtual   #924 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		mRouteNameTextView = (TextView)findViewById(android.support.v7.mediarouter.R.id.mr_name);
	//   86  189:aload_0         
	//   87  190:aload_0         
	//   88  191:getstatic       #932 <Field int android.support.v7.mediarouter.R$id.mr_name>
	//   89  194:invokevirtual   #883 <Method View findViewById(int)>
	//   90  197:checkcast       #592 <Class TextView>
	//   91  200:putfield        #934 <Field TextView mRouteNameTextView>
		mCloseButton = (ImageButton)findViewById(android.support.v7.mediarouter.R.id.mr_close);
	//   92  203:aload_0         
	//   93  204:aload_0         
	//   94  205:getstatic       #937 <Field int android.support.v7.mediarouter.R$id.mr_close>
	//   95  208:invokevirtual   #883 <Method View findViewById(int)>
	//   96  211:checkcast       #615 <Class ImageButton>
	//   97  214:putfield        #939 <Field ImageButton mCloseButton>
		mCloseButton.setOnClickListener(((android.view.View.OnClickListener) (obj)));
	//   98  217:aload_0         
	//   99  218:getfield        #939 <Field ImageButton mCloseButton>
	//  100  221:aload           4
	//  101  223:invokevirtual   #940 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		mCustomControlLayout = (FrameLayout)findViewById(android.support.v7.mediarouter.R.id.mr_custom_control);
	//  102  226:aload_0         
	//  103  227:aload_0         
	//  104  228:getstatic       #943 <Field int android.support.v7.mediarouter.R$id.mr_custom_control>
	//  105  231:invokevirtual   #883 <Method View findViewById(int)>
	//  106  234:checkcast       #891 <Class FrameLayout>
	//  107  237:putfield        #945 <Field FrameLayout mCustomControlLayout>
		mDefaultControlLayout = (FrameLayout)findViewById(android.support.v7.mediarouter.R.id.mr_default_control);
	//  108  240:aload_0         
	//  109  241:aload_0         
	//  110  242:getstatic       #948 <Field int android.support.v7.mediarouter.R$id.mr_default_control>
	//  111  245:invokevirtual   #883 <Method View findViewById(int)>
	//  112  248:checkcast       #891 <Class FrameLayout>
	//  113  251:putfield        #950 <Field FrameLayout mDefaultControlLayout>
		Object obj1 = ((Object) (new _cls4()));
	//  114  254:new             #952 <Class MediaRouteControllerDialog$4>
	//  115  257:dup             
	//  116  258:aload_0         
	//  117  259:invokespecial   #953 <Method void MediaRouteControllerDialog$4(MediaRouteControllerDialog)>
	//  118  262:astore          5
		mArtView = (ImageView)findViewById(android.support.v7.mediarouter.R.id.mr_art);
	//  119  264:aload_0         
	//  120  265:aload_0         
	//  121  266:getstatic       #956 <Field int android.support.v7.mediarouter.R$id.mr_art>
	//  122  269:invokevirtual   #883 <Method View findViewById(int)>
	//  123  272:checkcast       #958 <Class ImageView>
	//  124  275:putfield        #960 <Field ImageView mArtView>
		mArtView.setOnClickListener(((android.view.View.OnClickListener) (obj1)));
	//  125  278:aload_0         
	//  126  279:getfield        #960 <Field ImageView mArtView>
	//  127  282:aload           5
	//  128  284:invokevirtual   #961 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		findViewById(android.support.v7.mediarouter.R.id.mr_control_title_container).setOnClickListener(((android.view.View.OnClickListener) (obj1)));
	//  129  287:aload_0         
	//  130  288:getstatic       #964 <Field int android.support.v7.mediarouter.R$id.mr_control_title_container>
	//  131  291:invokevirtual   #883 <Method View findViewById(int)>
	//  132  294:aload           5
	//  133  296:invokevirtual   #965 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		mMediaMainControlLayout = (LinearLayout)findViewById(android.support.v7.mediarouter.R.id.mr_media_main_control);
	//  134  299:aload_0         
	//  135  300:aload_0         
	//  136  301:getstatic       #968 <Field int android.support.v7.mediarouter.R$id.mr_media_main_control>
	//  137  304:invokevirtual   #883 <Method View findViewById(int)>
	//  138  307:checkcast       #401 <Class LinearLayout>
	//  139  310:putfield        #406 <Field LinearLayout mMediaMainControlLayout>
		mDividerView = findViewById(android.support.v7.mediarouter.R.id.mr_control_divider);
	//  140  313:aload_0         
	//  141  314:aload_0         
	//  142  315:getstatic       #971 <Field int android.support.v7.mediarouter.R$id.mr_control_divider>
	//  143  318:invokevirtual   #883 <Method View findViewById(int)>
	//  144  321:putfield        #422 <Field View mDividerView>
		mPlaybackControlLayout = (RelativeLayout)findViewById(android.support.v7.mediarouter.R.id.mr_playback_control);
	//  145  324:aload_0         
	//  146  325:aload_0         
	//  147  326:getstatic       #974 <Field int android.support.v7.mediarouter.R$id.mr_playback_control>
	//  148  329:invokevirtual   #883 <Method View findViewById(int)>
	//  149  332:checkcast       #416 <Class RelativeLayout>
	//  150  335:putfield        #414 <Field RelativeLayout mPlaybackControlLayout>
		mTitleView = (TextView)findViewById(android.support.v7.mediarouter.R.id.mr_control_title);
	//  151  338:aload_0         
	//  152  339:aload_0         
	//  153  340:getstatic       #977 <Field int android.support.v7.mediarouter.R$id.mr_control_title>
	//  154  343:invokevirtual   #883 <Method View findViewById(int)>
	//  155  346:checkcast       #592 <Class TextView>
	//  156  349:putfield        #585 <Field TextView mTitleView>
		mSubtitleView = (TextView)findViewById(android.support.v7.mediarouter.R.id.mr_control_subtitle);
	//  157  352:aload_0         
	//  158  353:aload_0         
	//  159  354:getstatic       #980 <Field int android.support.v7.mediarouter.R$id.mr_control_subtitle>
	//  160  357:invokevirtual   #883 <Method View findViewById(int)>
	//  161  360:checkcast       #592 <Class TextView>
	//  162  363:putfield        #607 <Field TextView mSubtitleView>
		mPlaybackControlButton = (ImageButton)findViewById(android.support.v7.mediarouter.R.id.mr_control_playback_ctrl);
	//  163  366:aload_0         
	//  164  367:aload_0         
	//  165  368:getstatic       #983 <Field int android.support.v7.mediarouter.R$id.mr_control_playback_ctrl>
	//  166  371:invokevirtual   #883 <Method View findViewById(int)>
	//  167  374:checkcast       #615 <Class ImageButton>
	//  168  377:putfield        #613 <Field ImageButton mPlaybackControlButton>
		mPlaybackControlButton.setOnClickListener(((android.view.View.OnClickListener) (obj)));
	//  169  380:aload_0         
	//  170  381:getfield        #613 <Field ImageButton mPlaybackControlButton>
	//  171  384:aload           4
	//  172  386:invokevirtual   #940 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		mVolumeControlLayout = (LinearLayout)findViewById(android.support.v7.mediarouter.R.id.mr_volume_control);
	//  173  389:aload_0         
	//  174  390:aload_0         
	//  175  391:getstatic       #986 <Field int android.support.v7.mediarouter.R$id.mr_volume_control>
	//  176  394:invokevirtual   #883 <Method View findViewById(int)>
	//  177  397:checkcast       #401 <Class LinearLayout>
	//  178  400:putfield        #399 <Field LinearLayout mVolumeControlLayout>
		mVolumeControlLayout.setVisibility(8);
	//  179  403:aload_0         
	//  180  404:getfield        #399 <Field LinearLayout mVolumeControlLayout>
	//  181  407:bipush          8
	//  182  409:invokevirtual   #566 <Method void LinearLayout.setVisibility(int)>
		mVolumeSlider = (SeekBar)findViewById(android.support.v7.mediarouter.R.id.mr_volume_slider);
	//  183  412:aload_0         
	//  184  413:aload_0         
	//  185  414:getstatic       #989 <Field int android.support.v7.mediarouter.R$id.mr_volume_slider>
	//  186  417:invokevirtual   #883 <Method View findViewById(int)>
	//  187  420:checkcast       #672 <Class SeekBar>
	//  188  423:putfield        #667 <Field SeekBar mVolumeSlider>
		mVolumeSlider.setTag(((Object) (mRoute)));
	//  189  426:aload_0         
	//  190  427:getfield        #667 <Field SeekBar mVolumeSlider>
	//  191  430:aload_0         
	//  192  431:getfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//  193  434:invokevirtual   #993 <Method void SeekBar.setTag(Object)>
		mVolumeChangeListener = new VolumeChangeListener();
	//  194  437:aload_0         
	//  195  438:new             #995 <Class MediaRouteControllerDialog$VolumeChangeListener>
	//  196  441:dup             
	//  197  442:aload_0         
	//  198  443:invokespecial   #996 <Method void MediaRouteControllerDialog$VolumeChangeListener(MediaRouteControllerDialog)>
	//  199  446:putfield        #998 <Field MediaRouteControllerDialog$VolumeChangeListener mVolumeChangeListener>
		mVolumeSlider.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (mVolumeChangeListener)));
	//  200  449:aload_0         
	//  201  450:getfield        #667 <Field SeekBar mVolumeSlider>
	//  202  453:aload_0         
	//  203  454:getfield        #998 <Field MediaRouteControllerDialog$VolumeChangeListener mVolumeChangeListener>
	//  204  457:invokevirtual   #1002 <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
		mVolumeGroupList = (OverlayListView)findViewById(android.support.v7.mediarouter.R.id.mr_volume_group_list);
	//  205  460:aload_0         
	//  206  461:aload_0         
	//  207  462:getstatic       #1005 <Field int android.support.v7.mediarouter.R$id.mr_volume_group_list>
	//  208  465:invokevirtual   #883 <Method View findViewById(int)>
	//  209  468:checkcast       #266 <Class OverlayListView>
	//  210  471:putfield        #264 <Field OverlayListView mVolumeGroupList>
		mGroupMemberRoutes = ((List) (new ArrayList()));
	//  211  474:aload_0         
	//  212  475:new             #1007 <Class ArrayList>
	//  213  478:dup             
	//  214  479:invokespecial   #1008 <Method void ArrayList()>
	//  215  482:putfield        #468 <Field List mGroupMemberRoutes>
		mVolumeGroupAdapter = new VolumeGroupAdapter(mVolumeGroupList.getContext(), mGroupMemberRoutes);
	//  216  485:aload_0         
	//  217  486:new             #348 <Class MediaRouteControllerDialog$VolumeGroupAdapter>
	//  218  489:dup             
	//  219  490:aload_0         
	//  220  491:aload_0         
	//  221  492:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//  222  495:invokevirtual   #1009 <Method Context OverlayListView.getContext()>
	//  223  498:aload_0         
	//  224  499:getfield        #468 <Field List mGroupMemberRoutes>
	//  225  502:invokespecial   #1012 <Method void MediaRouteControllerDialog$VolumeGroupAdapter(MediaRouteControllerDialog, Context, List)>
	//  226  505:putfield        #346 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
		mVolumeGroupList.setAdapter(((android.widget.ListAdapter) (mVolumeGroupAdapter)));
	//  227  508:aload_0         
	//  228  509:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//  229  512:aload_0         
	//  230  513:getfield        #346 <Field MediaRouteControllerDialog$VolumeGroupAdapter mVolumeGroupAdapter>
	//  231  516:invokevirtual   #1016 <Method void OverlayListView.setAdapter(android.widget.ListAdapter)>
		mGroupMemberRoutesAnimatingWithBitmap = ((Set) (new HashSet()));
	//  232  519:aload_0         
	//  233  520:new             #1018 <Class HashSet>
	//  234  523:dup             
	//  235  524:invokespecial   #1019 <Method void HashSet()>
	//  236  527:putfield        #789 <Field Set mGroupMemberRoutesAnimatingWithBitmap>
		obj = ((Object) (mContext));
	//  237  530:aload_0         
	//  238  531:getfield        #170 <Field Context mContext>
	//  239  534:astore          4
		obj1 = ((Object) (mMediaMainControlLayout));
	//  240  536:aload_0         
	//  241  537:getfield        #406 <Field LinearLayout mMediaMainControlLayout>
	//  242  540:astore          5
		OverlayListView overlaylistview = mVolumeGroupList;
	//  243  542:aload_0         
	//  244  543:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//  245  546:astore          6
		boolean flag;
		if(getGroup() != null)
	//* 246  548:aload_0         
	//* 247  549:invokespecial   #462 <Method android.support.v7.media.MediaRouter$RouteGroup getGroup()>
	//* 248  552:ifnull          560
			flag = true;
	//  249  555:iconst_1        
	//  250  556:istore_3        
		else
	//* 251  557:goto            562
			flag = false;
	//  252  560:iconst_0        
	//  253  561:istore_3        
		MediaRouterThemeHelper.setMediaControlsBackgroundColor(((Context) (obj)), ((View) (obj1)), ((View) (overlaylistview)), flag);
	//  254  562:aload           4
	//  255  564:aload           5
	//  256  566:aload           6
	//  257  568:iload_3         
	//  258  569:invokestatic    #1023 <Method void MediaRouterThemeHelper.setMediaControlsBackgroundColor(Context, View, View, boolean)>
		MediaRouterThemeHelper.setVolumeSliderColor(mContext, (MediaRouteVolumeSlider)mVolumeSlider, ((View) (mMediaMainControlLayout)));
	//  259  572:aload_0         
	//  260  573:getfield        #170 <Field Context mContext>
	//  261  576:aload_0         
	//  262  577:getfield        #667 <Field SeekBar mVolumeSlider>
	//  263  580:checkcast       #1025 <Class MediaRouteVolumeSlider>
	//  264  583:aload_0         
	//  265  584:getfield        #406 <Field LinearLayout mMediaMainControlLayout>
	//  266  587:invokestatic    #1029 <Method void MediaRouterThemeHelper.setVolumeSliderColor(Context, MediaRouteVolumeSlider, View)>
		mVolumeSliderMap = ((Map) (new HashMap()));
	//  267  590:aload_0         
	//  268  591:new             #1031 <Class HashMap>
	//  269  594:dup             
	//  270  595:invokespecial   #1032 <Method void HashMap()>
	//  271  598:putfield        #1034 <Field Map mVolumeSliderMap>
		mVolumeSliderMap.put(((Object) (mRoute)), ((Object) (mVolumeSlider)));
	//  272  601:aload_0         
	//  273  602:getfield        #1034 <Field Map mVolumeSliderMap>
	//  274  605:aload_0         
	//  275  606:getfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//  276  609:aload_0         
	//  277  610:getfield        #667 <Field SeekBar mVolumeSlider>
	//  278  613:invokeinterface #1038 <Method Object Map.put(Object, Object)>
	//  279  618:pop             
		mGroupExpandCollapseButton = (MediaRouteExpandCollapseButton)findViewById(android.support.v7.mediarouter.R.id.mr_group_expand_collapse);
	//  280  619:aload_0         
	//  281  620:aload_0         
	//  282  621:getstatic       #1041 <Field int android.support.v7.mediarouter.R$id.mr_group_expand_collapse>
	//  283  624:invokevirtual   #883 <Method View findViewById(int)>
	//  284  627:checkcast       #685 <Class MediaRouteExpandCollapseButton>
	//  285  630:putfield        #683 <Field MediaRouteExpandCollapseButton mGroupExpandCollapseButton>
		mGroupExpandCollapseButton.setOnClickListener(((android.view.View.OnClickListener) (new _cls5())));
	//  286  633:aload_0         
	//  287  634:getfield        #683 <Field MediaRouteExpandCollapseButton mGroupExpandCollapseButton>
	//  288  637:new             #1043 <Class MediaRouteControllerDialog$5>
	//  289  640:dup             
	//  290  641:aload_0         
	//  291  642:invokespecial   #1044 <Method void MediaRouteControllerDialog$5(MediaRouteControllerDialog)>
	//  292  645:invokevirtual   #1045 <Method void MediaRouteExpandCollapseButton.setOnClickListener(android.view.View$OnClickListener)>
		loadInterpolator();
	//  293  648:aload_0         
	//  294  649:invokevirtual   #1047 <Method void loadInterpolator()>
		mGroupListAnimationDurationMs = mContext.getResources().getInteger(android.support.v7.mediarouter.R.integer.mr_controller_volume_group_list_animation_duration_ms);
	//  295  652:aload_0         
	//  296  653:aload_0         
	//  297  654:getfield        #170 <Field Context mContext>
	//  298  657:invokevirtual   #208 <Method Resources Context.getResources()>
	//  299  660:getstatic       #1052 <Field int android.support.v7.mediarouter.R$integer.mr_controller_volume_group_list_animation_duration_ms>
	//  300  663:invokevirtual   #1055 <Method int Resources.getInteger(int)>
	//  301  666:putfield        #303 <Field int mGroupListAnimationDurationMs>
		mGroupListFadeInDurationMs = mContext.getResources().getInteger(android.support.v7.mediarouter.R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
	//  302  669:aload_0         
	//  303  670:aload_0         
	//  304  671:getfield        #170 <Field Context mContext>
	//  305  674:invokevirtual   #208 <Method Resources Context.getResources()>
	//  306  677:getstatic       #1058 <Field int android.support.v7.mediarouter.R$integer.mr_controller_volume_group_list_fade_in_duration_ms>
	//  307  680:invokevirtual   #1055 <Method int Resources.getInteger(int)>
	//  308  683:putfield        #369 <Field int mGroupListFadeInDurationMs>
		mGroupListFadeOutDurationMs = mContext.getResources().getInteger(android.support.v7.mediarouter.R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
	//  309  686:aload_0         
	//  310  687:aload_0         
	//  311  688:getfield        #170 <Field Context mContext>
	//  312  691:invokevirtual   #208 <Method Resources Context.getResources()>
	//  313  694:getstatic       #1061 <Field int android.support.v7.mediarouter.R$integer.mr_controller_volume_group_list_fade_out_duration_ms>
	//  314  697:invokevirtual   #1055 <Method int Resources.getInteger(int)>
	//  315  700:putfield        #768 <Field int mGroupListFadeOutDurationMs>
		mCustomControlView = onCreateMediaControlView(bundle);
	//  316  703:aload_0         
	//  317  704:aload_0         
	//  318  705:aload_1         
	//  319  706:invokevirtual   #1065 <Method View onCreateMediaControlView(Bundle)>
	//  320  709:putfield        #325 <Field View mCustomControlView>
		bundle = ((Bundle) (mCustomControlView));
	//  321  712:aload_0         
	//  322  713:getfield        #325 <Field View mCustomControlView>
	//  323  716:astore_1        
		if(bundle != null)
	//* 324  717:aload_1         
	//* 325  718:ifnull          737
		{
			mCustomControlLayout.addView(((View) (bundle)));
	//  326  721:aload_0         
	//  327  722:getfield        #945 <Field FrameLayout mCustomControlLayout>
	//  328  725:aload_1         
	//  329  726:invokevirtual   #1069 <Method void FrameLayout.addView(View)>
			mCustomControlLayout.setVisibility(0);
	//  330  729:aload_0         
	//  331  730:getfield        #945 <Field FrameLayout mCustomControlLayout>
	//  332  733:iconst_0        
	//  333  734:invokevirtual   #1070 <Method void FrameLayout.setVisibility(int)>
		}
		mCreated = true;
	//  334  737:aload_0         
	//  335  738:iconst_1        
	//  336  739:putfield        #1072 <Field boolean mCreated>
		updateLayout();
	//  337  742:aload_0         
	//  338  743:invokevirtual   #1075 <Method void updateLayout()>
	//  339  746:return          
	}

	public View onCreateMediaControlView(Bundle bundle)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onDetachedFromWindow()
	{
		mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field MediaRouter mRouter>
	//    2    4:aload_0         
	//    3    5:getfield        #188 <Field MediaRouteControllerDialog$MediaRouterCallback mCallback>
	//    4    8:invokevirtual   #1080 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
		setMediaSession(((android.support.v4.media.session.MediaSessionCompat.Token) (null)));
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:invokespecial   #202 <Method void setMediaSession(android.support.v4.media.session.MediaSessionCompat$Token)>
		mAttachedToWindow = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #531 <Field boolean mAttachedToWindow>
		super.onDetachedFromWindow();
	//   11   21:aload_0         
	//   12   22:invokespecial   #1082 <Method void AlertDialog.onDetachedFromWindow()>
	//   13   25:return          
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(i != 25 && i != 24)
	//*   0    0:iload_1         
	//*   1    1:bipush          25
	//*   2    3:icmpeq          22
	//*   3    6:iload_1         
	//*   4    7:bipush          24
	//*   5    9:icmpne          15
	//*   6   12:goto            22
			return super.onKeyDown(i, keyevent);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #1086 <Method boolean AlertDialog.onKeyDown(int, KeyEvent)>
	//   11   21:ireturn         
		keyevent = ((KeyEvent) (mRoute));
	//   12   22:aload_0         
	//   13   23:getfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//   14   26:astore_2        
		if(i == 25)
	//*  15   27:iload_1         
	//*  16   28:bipush          25
	//*  17   30:icmpne          38
			i = -1;
	//   18   33:iconst_m1       
	//   19   34:istore_1        
		else
	//*  20   35:goto            40
			i = 1;
	//   21   38:iconst_1        
	//   22   39:istore_1        
		((android.support.v7.media.MediaRouter.RouteInfo) (keyevent)).requestUpdateVolume(i);
	//   23   40:aload_2         
	//   24   41:iload_1         
	//   25   42:invokevirtual   #1089 <Method void android.support.v7.media.MediaRouter$RouteInfo.requestUpdateVolume(int)>
		return true;
	//   26   45:iconst_1        
	//   27   46:ireturn         
	}

	public boolean onKeyUp(int i, KeyEvent keyevent)
	{
		if(i != 25 && i != 24)
	//*   0    0:iload_1         
	//*   1    1:bipush          25
	//*   2    3:icmpeq          22
	//*   3    6:iload_1         
	//*   4    7:bipush          24
	//*   5    9:icmpne          15
	//*   6   12:goto            22
			return super.onKeyUp(i, keyevent);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:invokespecial   #1092 <Method boolean AlertDialog.onKeyUp(int, KeyEvent)>
	//   11   21:ireturn         
		else
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	public void setVolumeControlEnabled(boolean flag)
	{
		if(mVolumeControlEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field boolean mVolumeControlEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          25
		{
			mVolumeControlEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #157 <Field boolean mVolumeControlEnabled>
			if(mCreated)
	//*   7   13:aload_0         
	//*   8   14:getfield        #1072 <Field boolean mCreated>
	//*   9   17:ifeq            25
				update(false);
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #560 <Method void update(boolean)>
		}
	//   13   25:return          
	}

	void startGroupListFadeInAnimation()
	{
		clearGroupListAnimation(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #1096 <Method void clearGroupListAnimation(boolean)>
		mVolumeGroupList.requestLayout();
	//    3    5:aload_0         
	//    4    6:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//    5    9:invokevirtual   #273 <Method void OverlayListView.requestLayout()>
		mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (new _cls11())));
	//    6   12:aload_0         
	//    7   13:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//    8   16:invokevirtual   #279 <Method ViewTreeObserver OverlayListView.getViewTreeObserver()>
	//    9   19:new             #1098 <Class MediaRouteControllerDialog$11>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #1099 <Method void MediaRouteControllerDialog$11(MediaRouteControllerDialog)>
	//   13   27:invokevirtual   #290 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   14   30:return          
	}

	void startGroupListFadeInAnimationInternal()
	{
		Set set = mGroupMemberRoutesAdded;
	//    0    0:aload_0         
	//    1    1:getfield        #356 <Field Set mGroupMemberRoutesAdded>
	//    2    4:astore_1        
		if(set != null && set.size() != 0)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #512 <Method int Set.size()>
	//*   7   15:ifeq            23
		{
			fadeInAddedRoutes();
	//    8   18:aload_0         
	//    9   19:invokespecial   #1102 <Method void fadeInAddedRoutes()>
			return;
	//   10   22:return          
		} else
		{
			finishAnimation(true);
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #811 <Method void finishAnimation(boolean)>
			return;
	//   14   28:return          
		}
	}

	void update(boolean flag)
	{
		if(mRouteInVolumeSliderTouched != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1104 <Field android.support.v7.media.MediaRouter$RouteInfo mRouteInVolumeSliderTouched>
	//*   2    4:ifnull          23
		{
			mHasPendingUpdate = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #1106 <Field boolean mHasPendingUpdate>
			mPendingUpdateAnimationNeeded = flag | mPendingUpdateAnimationNeeded;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #1108 <Field boolean mPendingUpdateAnimationNeeded>
	//   10   18:ior             
	//   11   19:putfield        #1108 <Field boolean mPendingUpdateAnimationNeeded>
			return;
	//   12   22:return          
		}
		byte byte0 = 0;
	//   13   23:iconst_0        
	//   14   24:istore_2        
		mHasPendingUpdate = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #1106 <Field boolean mHasPendingUpdate>
		mPendingUpdateAnimationNeeded = false;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #1108 <Field boolean mPendingUpdateAnimationNeeded>
		if(mRoute.isSelected() && !mRoute.isDefaultOrBluetooth())
	//*  21   35:aload_0         
	//*  22   36:getfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//*  23   39:invokevirtual   #1111 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isSelected()>
	//*  24   42:ifeq            208
	//*  25   45:aload_0         
	//*  26   46:getfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//*  27   49:invokevirtual   #1114 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isDefaultOrBluetooth()>
	//*  28   52:ifeq            58
	//*  29   55:goto            208
		{
			if(!mCreated)
	//*  30   58:aload_0         
	//*  31   59:getfield        #1072 <Field boolean mCreated>
	//*  32   62:ifne            66
				return;
	//   33   65:return          
			mRouteNameTextView.setText(((CharSequence) (mRoute.getName())));
	//   34   66:aload_0         
	//   35   67:getfield        #934 <Field TextView mRouteNameTextView>
	//   36   70:aload_0         
	//   37   71:getfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//   38   74:invokevirtual   #1118 <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
	//   39   77:invokevirtual   #605 <Method void TextView.setText(CharSequence)>
			Button button = mDisconnectButton;
	//   40   80:aload_0         
	//   41   81:getfield        #916 <Field Button mDisconnectButton>
	//   42   84:astore_3        
			if(!mRoute.canDisconnect())
	//*  43   85:aload_0         
	//*  44   86:getfield        #194 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//*  45   89:invokevirtual   #1121 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.canDisconnect()>
	//*  46   92:ifeq            98
	//*  47   95:goto            101
				byte0 = 8;
	//   48   98:bipush          8
	//   49  100:istore_2        
			button.setVisibility(((int) (byte0)));
	//   50  101:aload_3         
	//   51  102:iload_2         
	//   52  103:invokevirtual   #1122 <Method void Button.setVisibility(int)>
			if(mCustomControlView == null && mArtIconIsLoaded)
	//*  53  106:aload_0         
	//*  54  107:getfield        #325 <Field View mCustomControlView>
	//*  55  110:ifnonnull       194
	//*  56  113:aload_0         
	//*  57  114:getfield        #814 <Field boolean mArtIconIsLoaded>
	//*  58  117:ifeq            194
			{
				if(isBitmapRecycled(mArtIconLoadedBitmap))
	//*  59  120:aload_0         
	//*  60  121:getfield        #816 <Field Bitmap mArtIconLoadedBitmap>
	//*  61  124:invokestatic    #1124 <Method boolean isBitmapRecycled(Bitmap)>
	//*  62  127:ifeq            168
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   63  130:new             #1126 <Class StringBuilder>
	//   64  133:dup             
	//   65  134:invokespecial   #1127 <Method void StringBuilder()>
	//   66  137:astore_3        
					stringbuilder.append("Can't set artwork image with recycled bitmap: ");
	//   67  138:aload_3         
	//   68  139:ldc2            #1129 <String "Can't set artwork image with recycled bitmap: ">
	//   69  142:invokevirtual   #1133 <Method StringBuilder StringBuilder.append(String)>
	//   70  145:pop             
					stringbuilder.append(((Object) (mArtIconLoadedBitmap)));
	//   71  146:aload_3         
	//   72  147:aload_0         
	//   73  148:getfield        #816 <Field Bitmap mArtIconLoadedBitmap>
	//   74  151:invokevirtual   #1136 <Method StringBuilder StringBuilder.append(Object)>
	//   75  154:pop             
					Log.w("MediaRouteCtrlDialog", stringbuilder.toString());
	//   76  155:ldc1            #18  <String "MediaRouteCtrlDialog">
	//   77  157:aload_3         
	//   78  158:invokevirtual   #1139 <Method String StringBuilder.toString()>
	//   79  161:invokestatic    #1143 <Method int Log.w(String, String)>
	//   80  164:pop             
				} else
	//*  81  165:goto            190
				{
					mArtView.setImageBitmap(mArtIconLoadedBitmap);
	//   82  168:aload_0         
	//   83  169:getfield        #960 <Field ImageView mArtView>
	//   84  172:aload_0         
	//   85  173:getfield        #816 <Field Bitmap mArtIconLoadedBitmap>
	//   86  176:invokevirtual   #1147 <Method void ImageView.setImageBitmap(Bitmap)>
					mArtView.setBackgroundColor(mArtIconBackgroundColor);
	//   87  179:aload_0         
	//   88  180:getfield        #960 <Field ImageView mArtView>
	//   89  183:aload_0         
	//   90  184:getfield        #818 <Field int mArtIconBackgroundColor>
	//   91  187:invokevirtual   #1150 <Method void ImageView.setBackgroundColor(int)>
				}
				clearLoadedBitmap();
	//   92  190:aload_0         
	//   93  191:invokevirtual   #1152 <Method void clearLoadedBitmap()>
			}
			updateVolumeControlLayout();
	//   94  194:aload_0         
	//   95  195:invokespecial   #1154 <Method void updateVolumeControlLayout()>
			updatePlaybackControlLayout();
	//   96  198:aload_0         
	//   97  199:invokespecial   #1156 <Method void updatePlaybackControlLayout()>
			updateLayoutHeight(flag);
	//   98  202:aload_0         
	//   99  203:iload_1         
	//  100  204:invokevirtual   #823 <Method void updateLayoutHeight(boolean)>
			return;
	//  101  207:return          
		} else
		{
			dismiss();
	//  102  208:aload_0         
	//  103  209:invokevirtual   #1159 <Method void dismiss()>
			return;
	//  104  212:return          
		}
	}

	void updateArtIconIfNeeded()
	{
		if(mCustomControlView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #325 <Field View mCustomControlView>
	//*   2    4:ifnonnull       55
		{
			if(!isIconChanged())
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #1161 <Method boolean isIconChanged()>
	//*   5   11:ifne            15
				return;
	//    6   14:return          
			FetchArtTask fetcharttask = mFetchArtTask;
	//    7   15:aload_0         
	//    8   16:getfield        #443 <Field MediaRouteControllerDialog$FetchArtTask mFetchArtTask>
	//    9   19:astore_1        
			if(fetcharttask != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          30
				fetcharttask.cancel(true);
	//   12   24:aload_1         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #1165 <Method boolean MediaRouteControllerDialog$FetchArtTask.cancel(boolean)>
	//   15   29:pop             
			mFetchArtTask = new FetchArtTask();
	//   16   30:aload_0         
	//   17   31:new             #447 <Class MediaRouteControllerDialog$FetchArtTask>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:invokespecial   #1166 <Method void MediaRouteControllerDialog$FetchArtTask(MediaRouteControllerDialog)>
	//   21   39:putfield        #443 <Field MediaRouteControllerDialog$FetchArtTask mFetchArtTask>
			mFetchArtTask.execute(((Object []) (new Void[0])));
	//   22   42:aload_0         
	//   23   43:getfield        #443 <Field MediaRouteControllerDialog$FetchArtTask mFetchArtTask>
	//   24   46:iconst_0        
	//   25   47:anewarray       Void[]
	//   26   50:invokevirtual   #1172 <Method AsyncTask MediaRouteControllerDialog$FetchArtTask.execute(Object[])>
	//   27   53:pop             
			return;
	//   28   54:return          
		} else
		{
			return;
	//   29   55:return          
		}
	}

	void updateLayout()
	{
		int i = MediaRouteDialogHelper.getDialogWidth(mContext);
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field Context mContext>
	//    2    4:invokestatic    #1175 <Method int MediaRouteDialogHelper.getDialogWidth(Context)>
	//    3    7:istore_1        
		getWindow().setLayout(i, -2);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #868 <Method Window getWindow()>
	//    6   12:iload_1         
	//    7   13:bipush          -2
	//    8   15:invokevirtual   #1179 <Method void Window.setLayout(int, int)>
		Object obj = ((Object) (getWindow().getDecorView()));
	//    9   18:aload_0         
	//   10   19:invokevirtual   #868 <Method Window getWindow()>
	//   11   22:invokevirtual   #1182 <Method View Window.getDecorView()>
	//   12   25:astore_2        
		mDialogContentWidth = i - ((View) (obj)).getPaddingLeft() - ((View) (obj)).getPaddingRight();
	//   13   26:aload_0         
	//   14   27:iload_1         
	//   15   28:aload_2         
	//   16   29:invokevirtual   #1185 <Method int View.getPaddingLeft()>
	//   17   32:isub            
	//   18   33:aload_2         
	//   19   34:invokevirtual   #1188 <Method int View.getPaddingRight()>
	//   20   37:isub            
	//   21   38:putfield        #827 <Field int mDialogContentWidth>
		obj = ((Object) (mContext.getResources()));
	//   22   41:aload_0         
	//   23   42:getfield        #170 <Field Context mContext>
	//   24   45:invokevirtual   #208 <Method Resources Context.getResources()>
	//   25   48:astore_2        
		mVolumeGroupListItemIconSize = ((Resources) (obj)).getDimensionPixelSize(android.support.v7.mediarouter.R.dimen.mr_controller_volume_group_list_item_icon_size);
	//   26   49:aload_0         
	//   27   50:aload_2         
	//   28   51:getstatic       #1191 <Field int android.support.v7.mediarouter.R$dimen.mr_controller_volume_group_list_item_icon_size>
	//   29   54:invokevirtual   #219 <Method int Resources.getDimensionPixelSize(int)>
	//   30   57:putfield        #1193 <Field int mVolumeGroupListItemIconSize>
		mVolumeGroupListItemHeight = ((Resources) (obj)).getDimensionPixelSize(android.support.v7.mediarouter.R.dimen.mr_controller_volume_group_list_item_height);
	//   31   60:aload_0         
	//   32   61:aload_2         
	//   33   62:getstatic       #1196 <Field int android.support.v7.mediarouter.R$dimen.mr_controller_volume_group_list_item_height>
	//   34   65:invokevirtual   #219 <Method int Resources.getDimensionPixelSize(int)>
	//   35   68:putfield        #711 <Field int mVolumeGroupListItemHeight>
		mVolumeGroupListMaxHeight = ((Resources) (obj)).getDimensionPixelSize(android.support.v7.mediarouter.R.dimen.mr_controller_volume_group_list_max_height);
	//   36   71:aload_0         
	//   37   72:aload_2         
	//   38   73:getstatic       #1199 <Field int android.support.v7.mediarouter.R$dimen.mr_controller_volume_group_list_max_height>
	//   39   76:invokevirtual   #219 <Method int Resources.getDimensionPixelSize(int)>
	//   40   79:putfield        #1201 <Field int mVolumeGroupListMaxHeight>
		mArtIconBitmap = null;
	//   41   82:aload_0         
	//   42   83:aconst_null     
	//   43   84:putfield        #445 <Field Bitmap mArtIconBitmap>
		mArtIconUri = null;
	//   44   87:aload_0         
	//   45   88:aconst_null     
	//   46   89:putfield        #452 <Field Uri mArtIconUri>
		updateArtIconIfNeeded();
	//   47   92:aload_0         
	//   48   93:invokevirtual   #557 <Method void updateArtIconIfNeeded()>
		update(false);
	//   49   96:aload_0         
	//   50   97:iconst_0        
	//   51   98:invokevirtual   #560 <Method void update(boolean)>
	//   52  101:return          
	}

	void updateLayoutHeight(final boolean animate)
	{
		mDefaultControlLayout.requestLayout();
	//    0    0:aload_0         
	//    1    1:getfield        #950 <Field FrameLayout mDefaultControlLayout>
	//    2    4:invokevirtual   #1202 <Method void FrameLayout.requestLayout()>
		mDefaultControlLayout.getViewTreeObserver().addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (new _cls6())));
	//    3    7:aload_0         
	//    4    8:getfield        #950 <Field FrameLayout mDefaultControlLayout>
	//    5   11:invokevirtual   #1203 <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
	//    6   14:new             #1205 <Class MediaRouteControllerDialog$6>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:iload_1         
	//   10   20:invokespecial   #1208 <Method void MediaRouteControllerDialog$6(MediaRouteControllerDialog, boolean)>
	//   11   23:invokevirtual   #290 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   12   26:return          
	}

	void updateLayoutHeightInternal(boolean flag)
	{
		int k;
		View view;
label0:
		{
			int i = getLayoutHeight(((View) (mMediaMainControlLayout)));
	//    0    0:aload_0         
	//    1    1:getfield        #406 <Field LinearLayout mMediaMainControlLayout>
	//    2    4:invokestatic    #298 <Method int getLayoutHeight(View)>
	//    3    7:istore_2        
			setLayoutHeight(((View) (mMediaMainControlLayout)), -1);
	//    4    8:aload_0         
	//    5    9:getfield        #406 <Field LinearLayout mMediaMainControlLayout>
	//    6   12:iconst_m1       
	//    7   13:invokestatic    #1211 <Method void setLayoutHeight(View, int)>
			updateMediaControlVisibility(canShowPlaybackControlLayout());
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:invokespecial   #569 <Method boolean canShowPlaybackControlLayout()>
	//   11   21:invokespecial   #1213 <Method void updateMediaControlVisibility(boolean)>
			view = getWindow().getDecorView();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #868 <Method Window getWindow()>
	//   14   28:invokevirtual   #1182 <Method View Window.getDecorView()>
	//   15   31:astore          11
			view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 0x40000000), 0);
	//   16   33:aload           11
	//   17   35:aload_0         
	//   18   36:invokevirtual   #868 <Method Window getWindow()>
	//   19   39:invokevirtual   #1217 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//   20   42:getfield        #1222 <Field int android.view.WindowManager$LayoutParams.width>
	//   21   45:ldc2            #1223 <Int 0x40000000>
	//   22   48:invokestatic    #1228 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   23   51:iconst_0        
	//   24   52:invokevirtual   #1231 <Method void View.measure(int, int)>
			setLayoutHeight(((View) (mMediaMainControlLayout)), i);
	//   25   55:aload_0         
	//   26   56:getfield        #406 <Field LinearLayout mMediaMainControlLayout>
	//   27   59:iload_2         
	//   28   60:invokestatic    #1211 <Method void setLayoutHeight(View, int)>
			if(mCustomControlView == null && (mArtView.getDrawable() instanceof BitmapDrawable))
	//*  29   63:aload_0         
	//*  30   64:getfield        #325 <Field View mCustomControlView>
	//*  31   67:ifnonnull       160
	//*  32   70:aload_0         
	//*  33   71:getfield        #960 <Field ImageView mArtView>
	//*  34   74:invokevirtual   #1235 <Method android.graphics.drawable.Drawable ImageView.getDrawable()>
	//*  35   77:instanceof      #757 <Class BitmapDrawable>
	//*  36   80:ifeq            160
			{
				Object obj = ((Object) (((BitmapDrawable)mArtView.getDrawable()).getBitmap()));
	//   37   83:aload_0         
	//   38   84:getfield        #960 <Field ImageView mArtView>
	//   39   87:invokevirtual   #1235 <Method android.graphics.drawable.Drawable ImageView.getDrawable()>
	//   40   90:checkcast       #757 <Class BitmapDrawable>
	//   41   93:invokevirtual   #1238 <Method Bitmap BitmapDrawable.getBitmap()>
	//   42   96:astore          10
				if(obj != null)
	//*  43   98:aload           10
	//*  44  100:ifnull          160
				{
					k = getDesiredArtHeight(((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
	//   45  103:aload_0         
	//   46  104:aload           10
	//   47  106:invokevirtual   #1241 <Method int Bitmap.getWidth()>
	//   48  109:aload           10
	//   49  111:invokevirtual   #1244 <Method int Bitmap.getHeight()>
	//   50  114:invokevirtual   #1246 <Method int getDesiredArtHeight(int, int)>
	//   51  117:istore_3        
					ImageView imageview = mArtView;
	//   52  118:aload_0         
	//   53  119:getfield        #960 <Field ImageView mArtView>
	//   54  122:astore          12
					if(((Bitmap) (obj)).getWidth() >= ((Bitmap) (obj)).getHeight())
	//*  55  124:aload           10
	//*  56  126:invokevirtual   #1241 <Method int Bitmap.getWidth()>
	//*  57  129:aload           10
	//*  58  131:invokevirtual   #1244 <Method int Bitmap.getHeight()>
	//*  59  134:icmplt          145
						obj = ((Object) (android.widget.ImageView.ScaleType.FIT_XY));
	//   60  137:getstatic       #1252 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_XY>
	//   61  140:astore          10
					else
	//*  62  142:goto            150
						obj = ((Object) (android.widget.ImageView.ScaleType.FIT_CENTER));
	//   63  145:getstatic       #1255 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
	//   64  148:astore          10
					imageview.setScaleType(((android.widget.ImageView.ScaleType) (obj)));
	//   65  150:aload           12
	//   66  152:aload           10
	//   67  154:invokevirtual   #1259 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
					break label0;
	//   68  157:goto            162
				}
			}
			k = 0;
	//   69  160:iconst_0        
	//   70  161:istore_3        
		}
		int j1 = getMainControllerHeight(canShowPlaybackControlLayout());
	//   71  162:aload_0         
	//   72  163:aload_0         
	//   73  164:invokespecial   #569 <Method boolean canShowPlaybackControlLayout()>
	//   74  167:invokespecial   #1261 <Method int getMainControllerHeight(boolean)>
	//   75  170:istore          6
		int i1 = mGroupMemberRoutes.size();
	//   76  172:aload_0         
	//   77  173:getfield        #468 <Field List mGroupMemberRoutes>
	//   78  176:invokeinterface #1262 <Method int List.size()>
	//   79  181:istore          5
		int j;
		if(getGroup() == null)
	//*  80  183:aload_0         
	//*  81  184:invokespecial   #462 <Method android.support.v7.media.MediaRouter$RouteGroup getGroup()>
	//*  82  187:ifnonnull       195
			j = 0;
	//   83  190:iconst_0        
	//   84  191:istore_2        
		else
	//*  85  192:goto            213
			j = mVolumeGroupListItemHeight * getGroup().getRoutes().size();
	//   86  195:aload_0         
	//   87  196:getfield        #711 <Field int mVolumeGroupListItemHeight>
	//   88  199:aload_0         
	//   89  200:invokespecial   #462 <Method android.support.v7.media.MediaRouter$RouteGroup getGroup()>
	//   90  203:invokevirtual   #466 <Method List android.support.v7.media.MediaRouter$RouteGroup.getRoutes()>
	//   91  206:invokeinterface #1262 <Method int List.size()>
	//   92  211:imul            
	//   93  212:istore_2        
		int l = j;
	//   94  213:iload_2         
	//   95  214:istore          4
		if(i1 > 0)
	//*  96  216:iload           5
	//*  97  218:ifle            229
			l = j + mVolumeGroupListPaddingTop;
	//   98  221:iload_2         
	//   99  222:aload_0         
	//  100  223:getfield        #221 <Field int mVolumeGroupListPaddingTop>
	//  101  226:iadd            
	//  102  227:istore          4
		j = Math.min(l, mVolumeGroupListMaxHeight);
	//  103  229:iload           4
	//  104  231:aload_0         
	//  105  232:getfield        #1201 <Field int mVolumeGroupListMaxHeight>
	//  106  235:invokestatic    #1267 <Method int Math.min(int, int)>
	//  107  238:istore_2        
		if(!mIsGroupExpanded)
	//* 108  239:aload_0         
	//* 109  240:getfield        #509 <Field boolean mIsGroupExpanded>
	//* 110  243:ifeq            249
	//* 111  246:goto            251
			j = 0;
	//  112  249:iconst_0        
	//  113  250:istore_2        
		l = Math.max(k, j) + j1;
	//  114  251:iload_3         
	//  115  252:iload_2         
	//  116  253:invokestatic    #1270 <Method int Math.max(int, int)>
	//  117  256:iload           6
	//  118  258:iadd            
	//  119  259:istore          4
		Rect rect = new Rect();
	//  120  261:new             #703 <Class Rect>
	//  121  264:dup             
	//  122  265:invokespecial   #1271 <Method void Rect()>
	//  123  268:astore          10
		view.getWindowVisibleDisplayFrame(rect);
	//  124  270:aload           11
	//  125  272:aload           10
	//  126  274:invokevirtual   #1275 <Method void View.getWindowVisibleDisplayFrame(Rect)>
		i1 = mDialogAreaLayout.getMeasuredHeight();
	//  127  277:aload_0         
	//  128  278:getfield        #905 <Field LinearLayout mDialogAreaLayout>
	//  129  281:invokevirtual   #420 <Method int LinearLayout.getMeasuredHeight()>
	//  130  284:istore          5
		int k1 = mDefaultControlLayout.getMeasuredHeight();
	//  131  286:aload_0         
	//  132  287:getfield        #950 <Field FrameLayout mDefaultControlLayout>
	//  133  290:invokevirtual   #1276 <Method int FrameLayout.getMeasuredHeight()>
	//  134  293:istore          7
		i1 = rect.height() - (i1 - k1);
	//  135  295:aload           10
	//  136  297:invokevirtual   #1278 <Method int Rect.height()>
	//  137  300:iload           5
	//  138  302:iload           7
	//  139  304:isub            
	//  140  305:isub            
	//  141  306:istore          5
		if(mCustomControlView == null && k > 0 && l <= i1)
	//* 142  308:aload_0         
	//* 143  309:getfield        #325 <Field View mCustomControlView>
	//* 144  312:ifnonnull       345
	//* 145  315:iload_3         
	//* 146  316:ifle            345
	//* 147  319:iload           4
	//* 148  321:iload           5
	//* 149  323:icmpgt          345
		{
			mArtView.setVisibility(0);
	//  150  326:aload_0         
	//  151  327:getfield        #960 <Field ImageView mArtView>
	//  152  330:iconst_0        
	//  153  331:invokevirtual   #1279 <Method void ImageView.setVisibility(int)>
			setLayoutHeight(((View) (mArtView)), k);
	//  154  334:aload_0         
	//  155  335:getfield        #960 <Field ImageView mArtView>
	//  156  338:iload_3         
	//  157  339:invokestatic    #1211 <Method void setLayoutHeight(View, int)>
		} else
	//* 158  342:goto            387
		{
			if(getLayoutHeight(((View) (mVolumeGroupList))) + mMediaMainControlLayout.getMeasuredHeight() >= mDefaultControlLayout.getMeasuredHeight())
	//* 159  345:aload_0         
	//* 160  346:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//* 161  349:invokestatic    #298 <Method int getLayoutHeight(View)>
	//* 162  352:aload_0         
	//* 163  353:getfield        #406 <Field LinearLayout mMediaMainControlLayout>
	//* 164  356:invokevirtual   #420 <Method int LinearLayout.getMeasuredHeight()>
	//* 165  359:iadd            
	//* 166  360:aload_0         
	//* 167  361:getfield        #950 <Field FrameLayout mDefaultControlLayout>
	//* 168  364:invokevirtual   #1276 <Method int FrameLayout.getMeasuredHeight()>
	//* 169  367:icmplt          379
				mArtView.setVisibility(8);
	//  170  370:aload_0         
	//  171  371:getfield        #960 <Field ImageView mArtView>
	//  172  374:bipush          8
	//  173  376:invokevirtual   #1279 <Method void ImageView.setVisibility(int)>
			l = j + j1;
	//  174  379:iload_2         
	//  175  380:iload           6
	//  176  382:iadd            
	//  177  383:istore          4
			k = 0;
	//  178  385:iconst_0        
	//  179  386:istore_3        
		}
		if(canShowPlaybackControlLayout() && l <= i1)
	//* 180  387:aload_0         
	//* 181  388:invokespecial   #569 <Method boolean canShowPlaybackControlLayout()>
	//* 182  391:ifeq            412
	//* 183  394:iload           4
	//* 184  396:iload           5
	//* 185  398:icmpgt          412
			mPlaybackControlLayout.setVisibility(0);
	//  186  401:aload_0         
	//  187  402:getfield        #414 <Field RelativeLayout mPlaybackControlLayout>
	//  188  405:iconst_0        
	//  189  406:invokevirtual   #1280 <Method void RelativeLayout.setVisibility(int)>
		else
	//* 190  409:goto            421
			mPlaybackControlLayout.setVisibility(8);
	//  191  412:aload_0         
	//  192  413:getfield        #414 <Field RelativeLayout mPlaybackControlLayout>
	//  193  416:bipush          8
	//  194  418:invokevirtual   #1280 <Method void RelativeLayout.setVisibility(int)>
		l = mPlaybackControlLayout.getVisibility();
	//  195  421:aload_0         
	//  196  422:getfield        #414 <Field RelativeLayout mPlaybackControlLayout>
	//  197  425:invokevirtual   #1281 <Method int RelativeLayout.getVisibility()>
	//  198  428:istore          4
		boolean flag2 = true;
	//  199  430:iconst_1        
	//  200  431:istore          9
		boolean flag1;
		if(l == 0)
	//* 201  433:iload           4
	//* 202  435:ifne            444
			flag1 = true;
	//  203  438:iconst_1        
	//  204  439:istore          8
		else
	//* 205  441:goto            447
			flag1 = false;
	//  206  444:iconst_0        
	//  207  445:istore          8
		updateMediaControlVisibility(flag1);
	//  208  447:aload_0         
	//  209  448:iload           8
	//  210  450:invokespecial   #1213 <Method void updateMediaControlVisibility(boolean)>
		if(mPlaybackControlLayout.getVisibility() == 0)
	//* 211  453:aload_0         
	//* 212  454:getfield        #414 <Field RelativeLayout mPlaybackControlLayout>
	//* 213  457:invokevirtual   #1281 <Method int RelativeLayout.getVisibility()>
	//* 214  460:ifne            470
			flag1 = flag2;
	//  215  463:iload           9
	//  216  465:istore          8
		else
	//* 217  467:goto            473
			flag1 = false;
	//  218  470:iconst_0        
	//  219  471:istore          8
		k1 = getMainControllerHeight(flag1);
	//  220  473:aload_0         
	//  221  474:iload           8
	//  222  476:invokespecial   #1261 <Method int getMainControllerHeight(boolean)>
	//  223  479:istore          7
		j1 = Math.max(k, j) + k1;
	//  224  481:iload_3         
	//  225  482:iload_2         
	//  226  483:invokestatic    #1270 <Method int Math.max(int, int)>
	//  227  486:iload           7
	//  228  488:iadd            
	//  229  489:istore          6
		l = j1;
	//  230  491:iload           6
	//  231  493:istore          4
		k = j;
	//  232  495:iload_2         
	//  233  496:istore_3        
		if(j1 > i1)
	//* 234  497:iload           6
	//* 235  499:iload           5
	//* 236  501:icmple          516
		{
			k = j - (j1 - i1);
	//  237  504:iload_2         
	//  238  505:iload           6
	//  239  507:iload           5
	//  240  509:isub            
	//  241  510:isub            
	//  242  511:istore_3        
			l = i1;
	//  243  512:iload           5
	//  244  514:istore          4
		}
		mMediaMainControlLayout.clearAnimation();
	//  245  516:aload_0         
	//  246  517:getfield        #406 <Field LinearLayout mMediaMainControlLayout>
	//  247  520:invokevirtual   #1282 <Method void LinearLayout.clearAnimation()>
		mVolumeGroupList.clearAnimation();
	//  248  523:aload_0         
	//  249  524:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//  250  527:invokevirtual   #1283 <Method void OverlayListView.clearAnimation()>
		mDefaultControlLayout.clearAnimation();
	//  251  530:aload_0         
	//  252  531:getfield        #950 <Field FrameLayout mDefaultControlLayout>
	//  253  534:invokevirtual   #1284 <Method void FrameLayout.clearAnimation()>
		if(flag)
	//* 254  537:iload_1         
	//* 255  538:ifeq            573
		{
			animateLayoutHeight(((View) (mMediaMainControlLayout)), k1);
	//  256  541:aload_0         
	//  257  542:aload_0         
	//  258  543:getfield        #406 <Field LinearLayout mMediaMainControlLayout>
	//  259  546:iload           7
	//  260  548:invokespecial   #1286 <Method void animateLayoutHeight(View, int)>
			animateLayoutHeight(((View) (mVolumeGroupList)), k);
	//  261  551:aload_0         
	//  262  552:aload_0         
	//  263  553:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//  264  556:iload_3         
	//  265  557:invokespecial   #1286 <Method void animateLayoutHeight(View, int)>
			animateLayoutHeight(((View) (mDefaultControlLayout)), l);
	//  266  560:aload_0         
	//  267  561:aload_0         
	//  268  562:getfield        #950 <Field FrameLayout mDefaultControlLayout>
	//  269  565:iload           4
	//  270  567:invokespecial   #1286 <Method void animateLayoutHeight(View, int)>
		} else
	//* 271  570:goto            599
		{
			setLayoutHeight(((View) (mMediaMainControlLayout)), k1);
	//  272  573:aload_0         
	//  273  574:getfield        #406 <Field LinearLayout mMediaMainControlLayout>
	//  274  577:iload           7
	//  275  579:invokestatic    #1211 <Method void setLayoutHeight(View, int)>
			setLayoutHeight(((View) (mVolumeGroupList)), k);
	//  276  582:aload_0         
	//  277  583:getfield        #264 <Field OverlayListView mVolumeGroupList>
	//  278  586:iload_3         
	//  279  587:invokestatic    #1211 <Method void setLayoutHeight(View, int)>
			setLayoutHeight(((View) (mDefaultControlLayout)), l);
	//  280  590:aload_0         
	//  281  591:getfield        #950 <Field FrameLayout mDefaultControlLayout>
	//  282  594:iload           4
	//  283  596:invokestatic    #1211 <Method void setLayoutHeight(View, int)>
		}
		setLayoutHeight(((View) (mExpandableAreaLayout)), rect.height());
	//  284  599:aload_0         
	//  285  600:getfield        #893 <Field FrameLayout mExpandableAreaLayout>
	//  286  603:aload           10
	//  287  605:invokevirtual   #1278 <Method int Rect.height()>
	//  288  608:invokestatic    #1211 <Method void setLayoutHeight(View, int)>
		rebuildVolumeGroupList(flag);
	//  289  611:aload_0         
	//  290  612:iload_1         
	//  291  613:invokespecial   #1288 <Method void rebuildVolumeGroupList(boolean)>
	//  292  616:return          
	}

	void updateVolumeGroupItemHeight(View view)
	{
		setLayoutHeight(((View) ((LinearLayout)view.findViewById(android.support.v7.mediarouter.R.id.volume_item_container))), mVolumeGroupListItemHeight);
	//    0    0:aload_1         
	//    1    1:getstatic       #802 <Field int android.support.v7.mediarouter.R$id.volume_item_container>
	//    2    4:invokevirtual   #805 <Method View View.findViewById(int)>
	//    3    7:checkcast       #401 <Class LinearLayout>
	//    4   10:aload_0         
	//    5   11:getfield        #711 <Field int mVolumeGroupListItemHeight>
	//    6   14:invokestatic    #1211 <Method void setLayoutHeight(View, int)>
		view = view.findViewById(android.support.v7.mediarouter.R.id.mr_volume_item_icon);
	//    7   17:aload_1         
	//    8   18:getstatic       #1292 <Field int android.support.v7.mediarouter.R$id.mr_volume_item_icon>
	//    9   21:invokevirtual   #805 <Method View View.findViewById(int)>
	//   10   24:astore_1        
		android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//   11   25:aload_1         
	//   12   26:invokevirtual   #390 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   13   29:astore_3        
		int i = mVolumeGroupListItemIconSize;
	//   14   30:aload_0         
	//   15   31:getfield        #1193 <Field int mVolumeGroupListItemIconSize>
	//   16   34:istore_2        
		layoutparams.width = i;
	//   17   35:aload_3         
	//   18   36:iload_2         
	//   19   37:putfield        #1293 <Field int android.view.ViewGroup$LayoutParams.width>
		layoutparams.height = i;
	//   20   40:aload_3         
	//   21   41:iload_2         
	//   22   42:putfield        #395 <Field int android.view.ViewGroup$LayoutParams.height>
		view.setLayoutParams(layoutparams);
	//   23   45:aload_1         
	//   24   46:aload_3         
	//   25   47:invokevirtual   #519 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   26   50:return          
	}

	static final int BUTTON_DISCONNECT_RES_ID = 0x102001a;
	private static final int BUTTON_NEUTRAL_RES_ID = 0x102001b;
	static final int BUTTON_STOP_RES_ID = 0x1020019;
	static final int CONNECTION_TIMEOUT_MILLIS;
	static final boolean DEBUG = Log.isLoggable("MediaRouteCtrlDialog", 3);
	static final String TAG = "MediaRouteCtrlDialog";
	static final int VOLUME_UPDATE_DELAY_MILLIS = 500;
	private Interpolator mAccelerateDecelerateInterpolator;
	final AccessibilityManager mAccessibilityManager;
	int mArtIconBackgroundColor;
	Bitmap mArtIconBitmap;
	boolean mArtIconIsLoaded;
	Bitmap mArtIconLoadedBitmap;
	Uri mArtIconUri;
	private ImageView mArtView;
	private boolean mAttachedToWindow;
	private final MediaRouterCallback mCallback;
	private ImageButton mCloseButton;
	Context mContext;
	MediaControllerCallback mControllerCallback;
	private boolean mCreated;
	private FrameLayout mCustomControlLayout;
	private View mCustomControlView;
	FrameLayout mDefaultControlLayout;
	MediaDescriptionCompat mDescription;
	private LinearLayout mDialogAreaLayout;
	private int mDialogContentWidth;
	private Button mDisconnectButton;
	private View mDividerView;
	private FrameLayout mExpandableAreaLayout;
	private Interpolator mFastOutSlowInInterpolator;
	FetchArtTask mFetchArtTask;
	private MediaRouteExpandCollapseButton mGroupExpandCollapseButton;
	int mGroupListAnimationDurationMs;
	Runnable mGroupListFadeInAnimation;
	private int mGroupListFadeInDurationMs;
	private int mGroupListFadeOutDurationMs;
	private List mGroupMemberRoutes;
	Set mGroupMemberRoutesAdded;
	Set mGroupMemberRoutesAnimatingWithBitmap;
	private Set mGroupMemberRoutesRemoved;
	boolean mHasPendingUpdate;
	private Interpolator mInterpolator;
	boolean mIsGroupExpanded;
	boolean mIsGroupListAnimating;
	boolean mIsGroupListAnimationPending;
	private Interpolator mLinearOutSlowInInterpolator;
	MediaControllerCompat mMediaController;
	private LinearLayout mMediaMainControlLayout;
	boolean mPendingUpdateAnimationNeeded;
	private ImageButton mPlaybackControlButton;
	private RelativeLayout mPlaybackControlLayout;
	final android.support.v7.media.MediaRouter.RouteInfo mRoute;
	android.support.v7.media.MediaRouter.RouteInfo mRouteInVolumeSliderTouched;
	private TextView mRouteNameTextView;
	final MediaRouter mRouter;
	PlaybackStateCompat mState;
	private Button mStopCastingButton;
	private TextView mSubtitleView;
	private TextView mTitleView;
	VolumeChangeListener mVolumeChangeListener;
	private boolean mVolumeControlEnabled;
	private LinearLayout mVolumeControlLayout;
	VolumeGroupAdapter mVolumeGroupAdapter;
	OverlayListView mVolumeGroupList;
	private int mVolumeGroupListItemHeight;
	private int mVolumeGroupListItemIconSize;
	private int mVolumeGroupListMaxHeight;
	private final int mVolumeGroupListPaddingTop;
	SeekBar mVolumeSlider;
	Map mVolumeSliderMap;

	static 
	{
	//    0    0:ldc1            #18  <String "MediaRouteCtrlDialog">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #122 <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #124 <Field boolean DEBUG>
		CONNECTION_TIMEOUT_MILLIS = (int)TimeUnit.SECONDS.toMillis(30L);
	//    4    9:getstatic       #130 <Field TimeUnit TimeUnit.SECONDS>
	//    5   12:ldc2w           #131 <Long 30L>
	//    6   15:invokevirtual   #136 <Method long TimeUnit.toMillis(long)>
	//    7   18:l2i             
	//    8   19:putstatic       #138 <Field int CONNECTION_TIMEOUT_MILLIS>
	//*   9   22:return          
	}

	private class _cls1
		implements Runnable
	{

		public void run()
		{
			startGroupListFadeInAnimation();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//    2    4:invokevirtual   #22  <Method void MediaRouteControllerDialog.startGroupListFadeInAnimation()>
		//    3    7:return          
		}

		final MediaRouteControllerDialog this$0;

		_cls1()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class MediaControllerCallback extends i
	{

		public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
		{
			MediaRouteControllerDialog mediaroutecontrollerdialog = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteControllerDialog this$0>
		//    2    4:astore_2        
			if(mediametadatacompat == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       14
				mediametadatacompat = null;
		//    5    9:aconst_null     
		//    6   10:astore_1        
			else
		//*   7   11:goto            19
				mediametadatacompat = ((MediaMetadataCompat) (mediametadatacompat.a()));
		//    8   14:aload_1         
		//    9   15:invokevirtual   #22  <Method MediaDescriptionCompat MediaMetadataCompat.a()>
		//   10   18:astore_1        
			mediaroutecontrollerdialog.mDescription = ((MediaDescriptionCompat) (mediametadatacompat));
		//   11   19:aload_2         
		//   12   20:aload_1         
		//   13   21:putfield        #28  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
			updateArtIconIfNeeded();
		//   14   24:aload_0         
		//   15   25:getfield        #10  <Field MediaRouteControllerDialog this$0>
		//   16   28:invokevirtual   #31  <Method void MediaRouteControllerDialog.updateArtIconIfNeeded()>
			update(false);
		//   17   31:aload_0         
		//   18   32:getfield        #10  <Field MediaRouteControllerDialog this$0>
		//   19   35:iconst_0        
		//   20   36:invokevirtual   #35  <Method void MediaRouteControllerDialog.update(boolean)>
		//   21   39:return          
		}

		public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
		{
			MediaRouteControllerDialog mediaroutecontrollerdialog = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteControllerDialog this$0>
		//    2    4:astore_2        
			mediaroutecontrollerdialog.mState = playbackstatecompat;
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:putfield        #41  <Field PlaybackStateCompat MediaRouteControllerDialog.mState>
			mediaroutecontrollerdialog.update(false);
		//    6   10:aload_2         
		//    7   11:iconst_0        
		//    8   12:invokevirtual   #35  <Method void MediaRouteControllerDialog.update(boolean)>
		//    9   15:return          
		}

		public void onSessionDestroyed()
		{
			if(mMediaController != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #10  <Field MediaRouteControllerDialog this$0>
		//*   2    4:getfield        #46  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//*   3    7:ifnull          35
			{
				mMediaController.b(((i) (mControllerCallback)));
		//    4   10:aload_0         
		//    5   11:getfield        #10  <Field MediaRouteControllerDialog this$0>
		//    6   14:getfield        #46  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//    7   17:aload_0         
		//    8   18:getfield        #10  <Field MediaRouteControllerDialog this$0>
		//    9   21:getfield        #50  <Field MediaRouteControllerDialog$MediaControllerCallback MediaRouteControllerDialog.mControllerCallback>
		//   10   24:invokevirtual   #56  <Method void MediaControllerCompat.b(i)>
				mMediaController = null;
		//   11   27:aload_0         
		//   12   28:getfield        #10  <Field MediaRouteControllerDialog this$0>
		//   13   31:aconst_null     
		//   14   32:putfield        #46  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
			}
		//   15   35:return          
		}

		final MediaRouteControllerDialog this$0;

		MediaControllerCallback()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void i()>
		//    5    9:return          
		}
	}


	private class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
	{

		public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			update(true);
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteControllerDialog this$0>
		//    2    4:iconst_1        
		//    3    5:invokevirtual   #22  <Method void MediaRouteControllerDialog.update(boolean)>
		//    4    8:return          
		}

		public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			update(false);
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteControllerDialog this$0>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #22  <Method void MediaRouteControllerDialog.update(boolean)>
		//    4    8:return          
		}

		public void onRouteVolumeChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			mediarouter = ((MediaRouter) ((SeekBar)mVolumeSliderMap.get(((Object) (routeinfo)))));
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteControllerDialog this$0>
		//    2    4:getfield        #28  <Field Map MediaRouteControllerDialog.mVolumeSliderMap>
		//    3    7:aload_2         
		//    4    8:invokeinterface #34  <Method Object Map.get(Object)>
		//    5   13:checkcast       #36  <Class SeekBar>
		//    6   16:astore_1        
			int i = routeinfo.getVolume();
		//    7   17:aload_2         
		//    8   18:invokevirtual   #42  <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
		//    9   21:istore_3        
			if(MediaRouteControllerDialog.DEBUG)
		//*  10   22:getstatic       #46  <Field boolean MediaRouteControllerDialog.DEBUG>
		//*  11   25:ifeq            63
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   12   28:new             #48  <Class StringBuilder>
		//   13   31:dup             
		//   14   32:invokespecial   #49  <Method void StringBuilder()>
		//   15   35:astore          4
				stringbuilder.append("onRouteVolumeChanged(), route.getVolume:");
		//   16   37:aload           4
		//   17   39:ldc1            #51  <String "onRouteVolumeChanged(), route.getVolume:">
		//   18   41:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   19   44:pop             
				stringbuilder.append(i);
		//   20   45:aload           4
		//   21   47:iload_3         
		//   22   48:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
		//   23   51:pop             
				Log.d("MediaRouteCtrlDialog", stringbuilder.toString());
		//   24   52:ldc1            #60  <String "MediaRouteCtrlDialog">
		//   25   54:aload           4
		//   26   56:invokevirtual   #64  <Method String StringBuilder.toString()>
		//   27   59:invokestatic    #70  <Method int Log.d(String, String)>
		//   28   62:pop             
			}
			if(mediarouter != null && mRouteInVolumeSliderTouched != routeinfo)
		//*  29   63:aload_1         
		//*  30   64:ifnull          83
		//*  31   67:aload_0         
		//*  32   68:getfield        #10  <Field MediaRouteControllerDialog this$0>
		//*  33   71:getfield        #74  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
		//*  34   74:aload_2         
		//*  35   75:if_acmpeq       83
				((SeekBar) (mediarouter)).setProgress(i);
		//   36   78:aload_1         
		//   37   79:iload_3         
		//   38   80:invokevirtual   #78  <Method void SeekBar.setProgress(int)>
		//   39   83:return          
		}

		final MediaRouteControllerDialog this$0;

		MediaRouterCallback()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void android.support.v7.media.MediaRouter$Callback()>
		//    5    9:return          
		}
	}


	private class _cls8
		implements android.view.ViewTreeObserver.OnGlobalLayoutListener
	{

		public void onGlobalLayout()
		{
			mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//    2    4:getfield        #30  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
		//    3    7:invokevirtual   #36  <Method ViewTreeObserver OverlayListView.getViewTreeObserver()>
		//    4   10:aload_0         
		//    5   11:invokevirtual   #42  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			animateGroupListItemsInternal(previousRouteBoundMap, previousRouteBitmapMap);
		//    6   14:aload_0         
		//    7   15:getfield        #15  <Field MediaRouteControllerDialog this$0>
		//    8   18:aload_0         
		//    9   19:getfield        #17  <Field Map val$previousRouteBoundMap>
		//   10   22:aload_0         
		//   11   23:getfield        #19  <Field Map val$previousRouteBitmapMap>
		//   12   26:invokevirtual   #46  <Method void MediaRouteControllerDialog.animateGroupListItemsInternal(Map, Map)>
		//   13   29:return          
		}

		final MediaRouteControllerDialog this$0;
		final Map val$previousRouteBitmapMap;
		final Map val$previousRouteBoundMap;

		_cls8()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field MediaRouteControllerDialog this$0>
			previousRouteBoundMap = map;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #17  <Field Map val$previousRouteBoundMap>
			previousRouteBitmapMap = map1;
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:putfield        #19  <Field Map val$previousRouteBitmapMap>
			super();
		//    9   15:aload_0         
		//   10   16:invokespecial   #22  <Method void Object()>
		//   11   19:return          
		}
	}


	private class _cls7 extends Animation
	{

		protected void applyTransformation(float f, Transformation transformation)
		{
			int i = startValue;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field int val$startValue>
		//    2    4:istore_3        
			int j = (int)((float)(i - endValue) * f);
		//    3    5:iload_3         
		//    4    6:aload_0         
		//    5    7:getfield        #19  <Field int val$endValue>
		//    6   10:isub            
		//    7   11:i2f             
		//    8   12:fload_1         
		//    9   13:fmul            
		//   10   14:f2i             
		//   11   15:istore          4
			MediaRouteControllerDialog.setLayoutHeight(view, i - j);
		//   12   17:aload_0         
		//   13   18:getfield        #21  <Field View val$view>
		//   14   21:iload_3         
		//   15   22:iload           4
		//   16   24:isub            
		//   17   25:invokestatic    #33  <Method void MediaRouteControllerDialog.setLayoutHeight(View, int)>
		//   18   28:return          
		}

		final MediaRouteControllerDialog this$0;
		final int val$endValue;
		final int val$startValue;
		final View val$view;

		_cls7()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field MediaRouteControllerDialog this$0>
			startValue = i;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #17  <Field int val$startValue>
			endValue = j;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #19  <Field int val$endValue>
			view = view1;
		//    9   15:aload_0         
		//   10   16:aload           4
		//   11   18:putfield        #21  <Field View val$view>
			super();
		//   12   21:aload_0         
		//   13   22:invokespecial   #24  <Method void Animation()>
		//   14   25:return          
		}
	}


	private class _cls12
		implements android.view.animation.Animation.AnimationListener
	{

		public void onAnimationEnd(Animation animation)
		{
			finishAnimation(true);
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//    2    4:iconst_1        
		//    3    5:invokevirtual   #24  <Method void MediaRouteControllerDialog.finishAnimation(boolean)>
		//    4    8:return          
		}

		public void onAnimationRepeat(Animation animation)
		{
		//    0    0:return          
		}

		public void onAnimationStart(Animation animation)
		{
		//    0    0:return          
		}

		final MediaRouteControllerDialog this$0;

		_cls12()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class VolumeGroupAdapter extends ArrayAdapter
	{

		public View getView(int i, View view, ViewGroup viewgroup)
		{
			boolean flag = false;
		//    0    0:iconst_0        
		//    1    1:istore          4
			if(view == null)
		//*   2    3:aload_2         
		//*   3    4:ifnonnull       26
				view = LayoutInflater.from(viewgroup.getContext()).inflate(android.support.v7.mediarouter.R.layout.mr_controller_volume_item, viewgroup, false);
		//    4    7:aload_3         
		//    5    8:invokevirtual   #32  <Method Context ViewGroup.getContext()>
		//    6   11:invokestatic    #38  <Method LayoutInflater LayoutInflater.from(Context)>
		//    7   14:getstatic       #44  <Field int android.support.v7.mediarouter.R$layout.mr_controller_volume_item>
		//    8   17:aload_3         
		//    9   18:iconst_0        
		//   10   19:invokevirtual   #48  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   11   22:astore_2        
			else
		//*  12   23:goto            34
				updateVolumeGroupItemHeight(view);
		//   13   26:aload_0         
		//   14   27:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//   15   30:aload_2         
		//   16   31:invokevirtual   #54  <Method void MediaRouteControllerDialog.updateVolumeGroupItemHeight(View)>
			android.support.v7.media.MediaRouter.RouteInfo routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)getItem(i);
		//   17   34:aload_0         
		//   18   35:iload_1         
		//   19   36:invokevirtual   #58  <Method Object getItem(int)>
		//   20   39:checkcast       #60  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//   21   42:astore          6
			if(routeinfo != null)
		//*  22   44:aload           6
		//*  23   46:ifnull          361
			{
				boolean flag1 = routeinfo.isEnabled();
		//   24   49:aload           6
		//   25   51:invokevirtual   #64  <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isEnabled()>
		//   26   54:istore          5
				Object obj = ((Object) ((TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_name)));
		//   27   56:aload_2         
		//   28   57:getstatic       #69  <Field int android.support.v7.mediarouter.R$id.mr_name>
		//   29   60:invokevirtual   #75  <Method View View.findViewById(int)>
		//   30   63:checkcast       #77  <Class TextView>
		//   31   66:astore          7
				((TextView) (obj)).setEnabled(flag1);
		//   32   68:aload           7
		//   33   70:iload           5
		//   34   72:invokevirtual   #81  <Method void TextView.setEnabled(boolean)>
				((TextView) (obj)).setText(((CharSequence) (routeinfo.getName())));
		//   35   75:aload           7
		//   36   77:aload           6
		//   37   79:invokevirtual   #85  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
		//   38   82:invokevirtual   #89  <Method void TextView.setText(CharSequence)>
				obj = ((Object) ((MediaRouteVolumeSlider)view.findViewById(android.support.v7.mediarouter.R.id.mr_volume_slider)));
		//   39   85:aload_2         
		//   40   86:getstatic       #92  <Field int android.support.v7.mediarouter.R$id.mr_volume_slider>
		//   41   89:invokevirtual   #75  <Method View View.findViewById(int)>
		//   42   92:checkcast       #94  <Class MediaRouteVolumeSlider>
		//   43   95:astore          7
				MediaRouterThemeHelper.setVolumeSliderColor(viewgroup.getContext(), ((MediaRouteVolumeSlider) (obj)), ((View) (mVolumeGroupList)));
		//   44   97:aload_3         
		//   45   98:invokevirtual   #32  <Method Context ViewGroup.getContext()>
		//   46  101:aload           7
		//   47  103:aload_0         
		//   48  104:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//   49  107:getfield        #98  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
		//   50  110:invokestatic    #102 <Method void MediaRouterThemeHelper.setVolumeSliderColor(Context, MediaRouteVolumeSlider, View)>
				((MediaRouteVolumeSlider) (obj)).setTag(((Object) (routeinfo)));
		//   51  113:aload           7
		//   52  115:aload           6
		//   53  117:invokevirtual   #106 <Method void MediaRouteVolumeSlider.setTag(Object)>
				mVolumeSliderMap.put(((Object) (routeinfo)), obj);
		//   54  120:aload_0         
		//   55  121:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//   56  124:getfield        #110 <Field Map MediaRouteControllerDialog.mVolumeSliderMap>
		//   57  127:aload           6
		//   58  129:aload           7
		//   59  131:invokeinterface #116 <Method Object Map.put(Object, Object)>
		//   60  136:pop             
				((MediaRouteVolumeSlider) (obj)).setHideThumb(flag1 ^ true);
		//   61  137:aload           7
		//   62  139:iload           5
		//   63  141:iconst_1        
		//   64  142:ixor            
		//   65  143:invokevirtual   #119 <Method void MediaRouteVolumeSlider.setHideThumb(boolean)>
				((MediaRouteVolumeSlider) (obj)).setEnabled(flag1);
		//   66  146:aload           7
		//   67  148:iload           5
		//   68  150:invokevirtual   #120 <Method void MediaRouteVolumeSlider.setEnabled(boolean)>
				if(flag1)
		//*  69  153:iload           5
		//*  70  155:ifeq            225
					if(isVolumeControlAvailable(routeinfo))
		//*  71  158:aload_0         
		//*  72  159:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//*  73  162:aload           6
		//*  74  164:invokevirtual   #124 <Method boolean MediaRouteControllerDialog.isVolumeControlAvailable(android.support.v7.media.MediaRouter$RouteInfo)>
		//*  75  167:ifeq            205
					{
						((MediaRouteVolumeSlider) (obj)).setMax(routeinfo.getVolumeMax());
		//   76  170:aload           7
		//   77  172:aload           6
		//   78  174:invokevirtual   #128 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolumeMax()>
		//   79  177:invokevirtual   #132 <Method void MediaRouteVolumeSlider.setMax(int)>
						((MediaRouteVolumeSlider) (obj)).setProgress(routeinfo.getVolume());
		//   80  180:aload           7
		//   81  182:aload           6
		//   82  184:invokevirtual   #135 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
		//   83  187:invokevirtual   #138 <Method void MediaRouteVolumeSlider.setProgress(int)>
						((MediaRouteVolumeSlider) (obj)).setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (mVolumeChangeListener)));
		//   84  190:aload           7
		//   85  192:aload_0         
		//   86  193:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//   87  196:getfield        #142 <Field MediaRouteControllerDialog$VolumeChangeListener MediaRouteControllerDialog.mVolumeChangeListener>
		//   88  199:invokevirtual   #146 <Method void MediaRouteVolumeSlider.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
					} else
		//*  89  202:goto            225
					{
						((MediaRouteVolumeSlider) (obj)).setMax(100);
		//   90  205:aload           7
		//   91  207:bipush          100
		//   92  209:invokevirtual   #132 <Method void MediaRouteVolumeSlider.setMax(int)>
						((MediaRouteVolumeSlider) (obj)).setProgress(100);
		//   93  212:aload           7
		//   94  214:bipush          100
		//   95  216:invokevirtual   #138 <Method void MediaRouteVolumeSlider.setProgress(int)>
						((MediaRouteVolumeSlider) (obj)).setEnabled(false);
		//   96  219:aload           7
		//   97  221:iconst_0        
		//   98  222:invokevirtual   #120 <Method void MediaRouteVolumeSlider.setEnabled(boolean)>
					}
				viewgroup = ((ViewGroup) ((ImageView)view.findViewById(android.support.v7.mediarouter.R.id.mr_volume_item_icon)));
		//   99  225:aload_2         
		//  100  226:getstatic       #149 <Field int android.support.v7.mediarouter.R$id.mr_volume_item_icon>
		//  101  229:invokevirtual   #75  <Method View View.findViewById(int)>
		//  102  232:checkcast       #151 <Class ImageView>
		//  103  235:astore_3        
				if(flag1)
		//* 104  236:iload           5
		//* 105  238:ifeq            248
					i = 255;
		//  106  241:sipush          255
		//  107  244:istore_1        
				else
		//* 108  245:goto            257
					i = (int)(mDisabledAlpha * 255F);
		//  109  248:aload_0         
		//  110  249:getfield        #23  <Field float mDisabledAlpha>
		//  111  252:ldc1            #152 <Float 255F>
		//  112  254:fmul            
		//  113  255:f2i             
		//  114  256:istore_1        
				((ImageView) (viewgroup)).setAlpha(i);
		//  115  257:aload_3         
		//  116  258:iload_1         
		//  117  259:invokevirtual   #155 <Method void ImageView.setAlpha(int)>
				viewgroup = ((ViewGroup) ((LinearLayout)view.findViewById(android.support.v7.mediarouter.R.id.volume_item_container)));
		//  118  262:aload_2         
		//  119  263:getstatic       #158 <Field int android.support.v7.mediarouter.R$id.volume_item_container>
		//  120  266:invokevirtual   #75  <Method View View.findViewById(int)>
		//  121  269:checkcast       #160 <Class LinearLayout>
		//  122  272:astore_3        
				i = ((int) (flag));
		//  123  273:iload           4
		//  124  275:istore_1        
				if(mGroupMemberRoutesAnimatingWithBitmap.contains(((Object) (routeinfo))))
		//* 125  276:aload_0         
		//* 126  277:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//* 127  280:getfield        #164 <Field Set MediaRouteControllerDialog.mGroupMemberRoutesAnimatingWithBitmap>
		//* 128  283:aload           6
		//* 129  285:invokeinterface #170 <Method boolean Set.contains(Object)>
		//* 130  290:ifeq            295
					i = 4;
		//  131  293:iconst_4        
		//  132  294:istore_1        
				((LinearLayout) (viewgroup)).setVisibility(i);
		//  133  295:aload_3         
		//  134  296:iload_1         
		//  135  297:invokevirtual   #173 <Method void LinearLayout.setVisibility(int)>
				if(mGroupMemberRoutesAdded != null && mGroupMemberRoutesAdded.contains(((Object) (routeinfo))))
		//* 136  300:aload_0         
		//* 137  301:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//* 138  304:getfield        #176 <Field Set MediaRouteControllerDialog.mGroupMemberRoutesAdded>
		//* 139  307:ifnull          361
		//* 140  310:aload_0         
		//* 141  311:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//* 142  314:getfield        #176 <Field Set MediaRouteControllerDialog.mGroupMemberRoutesAdded>
		//* 143  317:aload           6
		//* 144  319:invokeinterface #170 <Method boolean Set.contains(Object)>
		//* 145  324:ifeq            361
				{
					viewgroup = ((ViewGroup) (new AlphaAnimation(0.0F, 0.0F)));
		//  146  327:new             #178 <Class AlphaAnimation>
		//  147  330:dup             
		//  148  331:fconst_0        
		//  149  332:fconst_0        
		//  150  333:invokespecial   #181 <Method void AlphaAnimation(float, float)>
		//  151  336:astore_3        
					((Animation) (viewgroup)).setDuration(0L);
		//  152  337:aload_3         
		//  153  338:lconst_0        
		//  154  339:invokevirtual   #187 <Method void Animation.setDuration(long)>
					((Animation) (viewgroup)).setFillEnabled(true);
		//  155  342:aload_3         
		//  156  343:iconst_1        
		//  157  344:invokevirtual   #190 <Method void Animation.setFillEnabled(boolean)>
					((Animation) (viewgroup)).setFillAfter(true);
		//  158  347:aload_3         
		//  159  348:iconst_1        
		//  160  349:invokevirtual   #193 <Method void Animation.setFillAfter(boolean)>
					view.clearAnimation();
		//  161  352:aload_2         
		//  162  353:invokevirtual   #197 <Method void View.clearAnimation()>
					view.startAnimation(((Animation) (viewgroup)));
		//  163  356:aload_2         
		//  164  357:aload_3         
		//  165  358:invokevirtual   #201 <Method void View.startAnimation(Animation)>
				}
			}
			return view;
		//  166  361:aload_2         
		//  167  362:areturn         
		}

		public boolean isEnabled(int i)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		final float mDisabledAlpha;
		final MediaRouteControllerDialog this$0;

		public VolumeGroupAdapter(Context context, List list)
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteControllerDialog this$0>
			super(context, 0, list);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:iconst_0        
		//    6    8:aload_3         
		//    7    9:invokespecial   #15  <Method void ArrayAdapter(Context, int, List)>
			mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(context);
		//    8   12:aload_0         
		//    9   13:aload_2         
		//   10   14:invokestatic    #21  <Method float MediaRouterThemeHelper.getDisabledAlpha(Context)>
		//   11   17:putfield        #23  <Field float mDisabledAlpha>
		//   12   20:return          
		}
	}


	private class FetchArtTask extends AsyncTask
	{

		private InputStream openInputStreamByScheme(Uri uri)
		{
			String s = uri.getScheme().toLowerCase();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #67  <Method String Uri.getScheme()>
		//    2    4:invokevirtual   #72  <Method String String.toLowerCase()>
		//    3    7:astore_2        
			if(!"android.resource".equals(((Object) (s))) && !"content".equals(((Object) (s))) && !"file".equals(((Object) (s))))
		//*   4    8:ldc1            #74  <String "android.resource">
		//*   5   10:aload_2         
		//*   6   11:invokevirtual   #78  <Method boolean String.equals(Object)>
		//*   7   14:ifne            75
		//*   8   17:ldc1            #80  <String "content">
		//*   9   19:aload_2         
		//*  10   20:invokevirtual   #78  <Method boolean String.equals(Object)>
		//*  11   23:ifne            75
		//*  12   26:ldc1            #82  <String "file">
		//*  13   28:aload_2         
		//*  14   29:invokevirtual   #78  <Method boolean String.equals(Object)>
		//*  15   32:ifeq            38
		//*  16   35:goto            75
			{
				uri = ((Uri) ((new URL(uri.toString())).openConnection()));
		//   17   38:new             #84  <Class URL>
		//   18   41:dup             
		//   19   42:aload_1         
		//   20   43:invokevirtual   #87  <Method String Uri.toString()>
		//   21   46:invokespecial   #90  <Method void URL(String)>
		//   22   49:invokevirtual   #94  <Method URLConnection URL.openConnection()>
		//   23   52:astore_1        
				((URLConnection) (uri)).setConnectTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
		//   24   53:aload_1         
		//   25   54:getstatic       #97  <Field int MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS>
		//   26   57:invokevirtual   #103 <Method void URLConnection.setConnectTimeout(int)>
				((URLConnection) (uri)).setReadTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
		//   27   60:aload_1         
		//   28   61:getstatic       #97  <Field int MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS>
		//   29   64:invokevirtual   #106 <Method void URLConnection.setReadTimeout(int)>
				uri = ((Uri) (((URLConnection) (uri)).getInputStream()));
		//   30   67:aload_1         
		//   31   68:invokevirtual   #110 <Method InputStream URLConnection.getInputStream()>
		//   32   71:astore_1        
			} else
		//*  33   72:goto            90
			{
				uri = ((Uri) (mContext.getContentResolver().openInputStream(uri)));
		//   34   75:aload_0         
		//   35   76:getfield        #21  <Field MediaRouteControllerDialog this$0>
		//   36   79:getfield        #114 <Field Context MediaRouteControllerDialog.mContext>
		//   37   82:invokevirtual   #120 <Method ContentResolver Context.getContentResolver()>
		//   38   85:aload_1         
		//   39   86:invokevirtual   #125 <Method InputStream ContentResolver.openInputStream(Uri)>
		//   40   89:astore_1        
			}
			if(uri == null)
		//*  41   90:aload_1         
		//*  42   91:ifnonnull       96
				return null;
		//   43   94:aconst_null     
		//   44   95:areturn         
			else
				return ((InputStream) (new BufferedInputStream(((InputStream) (uri)))));
		//   45   96:new             #127 <Class BufferedInputStream>
		//   46   99:dup             
		//   47  100:aload_1         
		//   48  101:invokespecial   #130 <Method void BufferedInputStream(InputStream)>
		//   49  104:areturn         
		}

		protected transient Bitmap doInBackground(Void avoid[])
		{
			int i;
			avoid = ((Void []) (mIconBitmap));
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field Bitmap mIconBitmap>
		//    2    4:astore_1        
			i = 0;
		//    3    5:iconst_0        
		//    4    6:istore_2        
			if(avoid == null) goto _L2; else goto _L1
		//    5    7:aload_1         
		//    6    8:ifnull          14
		//*   7   11:goto            563
_L2:
			avoid = ((Void []) (mIconUri));
		//    8   14:aload_0         
		//    9   15:getfield        #58  <Field Uri mIconUri>
		//   10   18:astore_1        
			if(avoid == null) goto _L4; else goto _L3
		//   11   19:aload_1         
		//   12   20:ifnull          561
_L3:
			Object obj1 = ((Object) (openInputStreamByScheme(((Uri) (avoid)))));
		//   13   23:aload_0         
		//   14   24:aload_1         
		//   15   25:invokespecial   #136 <Method InputStream openInputStreamByScheme(Uri)>
		//   16   28:astore          6
			Object obj;
			if(obj1 != null)
				break MISSING_BLOCK_LABEL_113;
		//   17   30:aload           6
		//   18   32:ifnonnull       113
			obj = obj1;
		//   19   35:aload           6
		//   20   37:astore          5
			avoid = ((Void []) (obj1));
		//   21   39:aload           6
		//   22   41:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
		//   23   42:new             #138 <Class StringBuilder>
		//   24   45:dup             
		//   25   46:invokespecial   #139 <Method void StringBuilder()>
		//   26   49:astore          7
			obj = obj1;
		//   27   51:aload           6
		//   28   53:astore          5
			avoid = ((Void []) (obj1));
		//   29   55:aload           6
		//   30   57:astore_1        
			stringbuilder.append("Unable to open: ");
		//   31   58:aload           7
		//   32   60:ldc1            #141 <String "Unable to open: ">
		//   33   62:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
		//   34   65:pop             
			obj = obj1;
		//   35   66:aload           6
		//   36   68:astore          5
			avoid = ((Void []) (obj1));
		//   37   70:aload           6
		//   38   72:astore_1        
			stringbuilder.append(((Object) (mIconUri)));
		//   39   73:aload           7
		//   40   75:aload_0         
		//   41   76:getfield        #58  <Field Uri mIconUri>
		//   42   79:invokevirtual   #148 <Method StringBuilder StringBuilder.append(Object)>
		//   43   82:pop             
			obj = obj1;
		//   44   83:aload           6
		//   45   85:astore          5
			avoid = ((Void []) (obj1));
		//   46   87:aload           6
		//   47   89:astore_1        
			Log.w("MediaRouteCtrlDialog", stringbuilder.toString());
		//   48   90:ldc1            #42  <String "MediaRouteCtrlDialog">
		//   49   92:aload           7
		//   50   94:invokevirtual   #149 <Method String StringBuilder.toString()>
		//   51   97:invokestatic    #50  <Method int Log.w(String, String)>
		//   52  100:pop             
			int j;
			boolean flag;
			Object obj2;
			Object obj3;
			android.graphics.BitmapFactory.Options options;
			if(obj1 != null)
		//*  53  101:aload           6
		//*  54  103:ifnull          111
				try
				{
					((InputStream) (obj1)).close();
		//   55  106:aload           6
		//   56  108:invokevirtual   #154 <Method void InputStream.close()>
				}
		//*  57  111:aconst_null     
		//*  58  112:areturn         
		//*  59  113:aload           6
		//*  60  115:astore          5
		//*  61  117:aload           6
		//*  62  119:astore_1        
		//*  63  120:new             #156 <Class android.graphics.BitmapFactory$Options>
		//*  64  123:dup             
		//*  65  124:invokespecial   #157 <Method void android.graphics.BitmapFactory$Options()>
		//*  66  127:astore          8
		//*  67  129:aload           6
		//*  68  131:astore          5
		//*  69  133:aload           6
		//*  70  135:astore_1        
		//*  71  136:aload           8
		//*  72  138:iconst_1        
		//*  73  139:putfield        #161 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		//*  74  142:aload           6
		//*  75  144:astore          5
		//*  76  146:aload           6
		//*  77  148:astore_1        
		//*  78  149:aload           6
		//*  79  151:aconst_null     
		//*  80  152:aload           8
		//*  81  154:invokestatic    #167 <Method Bitmap BitmapFactory.decodeStream(InputStream, Rect, android.graphics.BitmapFactory$Options)>
		//*  82  157:pop             
		//*  83  158:aload           6
		//*  84  160:astore          5
		//*  85  162:aload           6
		//*  86  164:astore_1        
		//*  87  165:aload           8
		//*  88  167:getfield        #170 <Field int android.graphics.BitmapFactory$Options.outWidth>
		//*  89  170:ifeq            447
		//*  90  173:aload           6
		//*  91  175:astore          5
		//*  92  177:aload           6
		//*  93  179:astore_1        
		//*  94  180:aload           8
		//*  95  182:getfield        #173 <Field int android.graphics.BitmapFactory$Options.outHeight>
		//*  96  185:istore_3        
		//*  97  186:iload_3         
		//*  98  187:ifne            193
		//*  99  190:goto            447
		//* 100  193:aload           6
		//* 101  195:astore_1        
		//* 102  196:aload           6
		//* 103  198:invokevirtual   #176 <Method void InputStream.reset()>
		//* 104  201:goto            320
		//* 105  204:aload           6
		//* 106  206:astore          5
		//* 107  208:aload           6
		//* 108  210:astore_1        
		//* 109  211:aload           6
		//* 110  213:invokevirtual   #154 <Method void InputStream.close()>
		//* 111  216:aload           6
		//* 112  218:astore          5
		//* 113  220:aload           6
		//* 114  222:astore_1        
		//* 115  223:aload_0         
		//* 116  224:aload_0         
		//* 117  225:getfield        #58  <Field Uri mIconUri>
		//* 118  228:invokespecial   #136 <Method InputStream openInputStreamByScheme(Uri)>
		//* 119  231:astore          7
		//* 120  233:aload           7
		//* 121  235:astore          6
		//* 122  237:aload           7
		//* 123  239:ifnonnull       320
		//* 124  242:aload           7
		//* 125  244:astore          5
		//* 126  246:aload           7
		//* 127  248:astore_1        
		//* 128  249:new             #138 <Class StringBuilder>
		//* 129  252:dup             
		//* 130  253:invokespecial   #139 <Method void StringBuilder()>
		//* 131  256:astore          6
		//* 132  258:aload           7
		//* 133  260:astore          5
		//* 134  262:aload           7
		//* 135  264:astore_1        
		//* 136  265:aload           6
		//* 137  267:ldc1            #141 <String "Unable to open: ">
		//* 138  269:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
		//* 139  272:pop             
		//* 140  273:aload           7
		//* 141  275:astore          5
		//* 142  277:aload           7
		//* 143  279:astore_1        
		//* 144  280:aload           6
		//* 145  282:aload_0         
		//* 146  283:getfield        #58  <Field Uri mIconUri>
		//* 147  286:invokevirtual   #148 <Method StringBuilder StringBuilder.append(Object)>
		//* 148  289:pop             
		//* 149  290:aload           7
		//* 150  292:astore          5
		//* 151  294:aload           7
		//* 152  296:astore_1        
		//* 153  297:ldc1            #42  <String "MediaRouteCtrlDialog">
		//* 154  299:aload           6
		//* 155  301:invokevirtual   #149 <Method String StringBuilder.toString()>
		//* 156  304:invokestatic    #50  <Method int Log.w(String, String)>
		//* 157  307:pop             
		//* 158  308:aload           7
		//* 159  310:ifnull          318
		//* 160  313:aload           7
		//* 161  315:invokevirtual   #154 <Method void InputStream.close()>
		//* 162  318:aconst_null     
		//* 163  319:areturn         
		//* 164  320:aload           6
		//* 165  322:astore          5
		//* 166  324:aload           6
		//* 167  326:astore_1        
		//* 168  327:aload           8
		//* 169  329:iconst_0        
		//* 170  330:putfield        #161 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		//* 171  333:aload           6
		//* 172  335:astore          5
		//* 173  337:aload           6
		//* 174  339:astore_1        
		//* 175  340:aload_0         
		//* 176  341:getfield        #21  <Field MediaRouteControllerDialog this$0>
		//* 177  344:aload           8
		//* 178  346:getfield        #170 <Field int android.graphics.BitmapFactory$Options.outWidth>
		//* 179  349:aload           8
		//* 180  351:getfield        #173 <Field int android.graphics.BitmapFactory$Options.outHeight>
		//* 181  354:invokevirtual   #180 <Method int MediaRouteControllerDialog.getDesiredArtHeight(int, int)>
		//* 182  357:istore_3        
		//* 183  358:aload           6
		//* 184  360:astore          5
		//* 185  362:aload           6
		//* 186  364:astore_1        
		//* 187  365:aload           8
		//* 188  367:iconst_1        
		//* 189  368:aload           8
		//* 190  370:getfield        #173 <Field int android.graphics.BitmapFactory$Options.outHeight>
		//* 191  373:iload_3         
		//* 192  374:idiv            
		//* 193  375:invokestatic    #186 <Method int Integer.highestOneBit(int)>
		//* 194  378:invokestatic    #191 <Method int Math.max(int, int)>
		//* 195  381:putfield        #194 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		//* 196  384:aload           6
		//* 197  386:astore          5
		//* 198  388:aload           6
		//* 199  390:astore_1        
		//* 200  391:aload_0         
		//* 201  392:invokevirtual   #198 <Method boolean isCancelled()>
		//* 202  395:istore          4
		//* 203  397:iload           4
		//* 204  399:ifeq            414
		//* 205  402:aload           6
		//* 206  404:ifnull          412
		//* 207  407:aload           6
		//* 208  409:invokevirtual   #154 <Method void InputStream.close()>
		//* 209  412:aconst_null     
		//* 210  413:areturn         
		//* 211  414:aload           6
		//* 212  416:astore          5
		//* 213  418:aload           6
		//* 214  420:astore_1        
		//* 215  421:aload           6
		//* 216  423:aconst_null     
		//* 217  424:aload           8
		//* 218  426:invokestatic    #167 <Method Bitmap BitmapFactory.decodeStream(InputStream, Rect, android.graphics.BitmapFactory$Options)>
		//* 219  429:astore          7
		//* 220  431:aload           6
		//* 221  433:ifnull          441
		//* 222  436:aload           6
		//* 223  438:invokevirtual   #154 <Method void InputStream.close()>
		//* 224  441:aload           7
		//* 225  443:astore_1        
		//* 226  444:goto            563
		//* 227  447:aload           6
		//* 228  449:ifnull          457
		//* 229  452:aload           6
		//* 230  454:invokevirtual   #154 <Method void InputStream.close()>
		//* 231  457:aconst_null     
		//* 232  458:areturn         
		//* 233  459:astore          6
		//* 234  461:goto            476
		//* 235  464:astore_1        
		//* 236  465:aconst_null     
		//* 237  466:astore          5
		//* 238  468:goto            549
		//* 239  471:astore          6
		//* 240  473:aconst_null     
		//* 241  474:astore          5
		//* 242  476:aload           5
		//* 243  478:astore_1        
		//* 244  479:new             #138 <Class StringBuilder>
		//* 245  482:dup             
		//* 246  483:invokespecial   #139 <Method void StringBuilder()>
		//* 247  486:astore          7
		//* 248  488:aload           5
		//* 249  490:astore_1        
		//* 250  491:aload           7
		//* 251  493:ldc1            #141 <String "Unable to open: ">
		//* 252  495:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
		//* 253  498:pop             
		//* 254  499:aload           5
		//* 255  501:astore_1        
		//* 256  502:aload           7
		//* 257  504:aload_0         
		//* 258  505:getfield        #58  <Field Uri mIconUri>
		//* 259  508:invokevirtual   #148 <Method StringBuilder StringBuilder.append(Object)>
		//* 260  511:pop             
		//* 261  512:aload           5
		//* 262  514:astore_1        
		//* 263  515:ldc1            #42  <String "MediaRouteCtrlDialog">
		//* 264  517:aload           7
		//* 265  519:invokevirtual   #149 <Method String StringBuilder.toString()>
		//* 266  522:aload           6
		//* 267  524:invokestatic    #201 <Method int Log.w(String, String, Throwable)>
		//* 268  527:pop             
		//* 269  528:aload           5
		//* 270  530:ifnull          561
		//* 271  533:aload           5
		//* 272  535:invokevirtual   #154 <Method void InputStream.close()>
		//* 273  538:goto            561
		//* 274  541:astore          6
		//* 275  543:aload_1         
		//* 276  544:astore          5
		//* 277  546:aload           6
		//* 278  548:astore_1        
		//* 279  549:aload           5
		//* 280  551:ifnull          559
		//* 281  554:aload           5
		//* 282  556:invokevirtual   #154 <Method void InputStream.close()>
		//* 283  559:aload_1         
		//* 284  560:athrow          
		//* 285  561:aconst_null     
		//* 286  562:astore_1        
		//* 287  563:aload_1         
		//* 288  564:invokestatic    #40  <Method boolean MediaRouteControllerDialog.isBitmapRecycled(Bitmap)>
		//* 289  567:ifeq            607
		//* 290  570:new             #138 <Class StringBuilder>
		//* 291  573:dup             
		//* 292  574:invokespecial   #139 <Method void StringBuilder()>
		//* 293  577:astore          5
		//* 294  579:aload           5
		//* 295  581:ldc1            #203 <String "Can't use recycled bitmap: ">
		//* 296  583:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
		//* 297  586:pop             
		//* 298  587:aload           5
		//* 299  589:aload_1         
		//* 300  590:invokevirtual   #148 <Method StringBuilder StringBuilder.append(Object)>
		//* 301  593:pop             
		//* 302  594:ldc1            #42  <String "MediaRouteCtrlDialog">
		//* 303  596:aload           5
		//* 304  598:invokevirtual   #149 <Method String StringBuilder.toString()>
		//* 305  601:invokestatic    #50  <Method int Log.w(String, String)>
		//* 306  604:pop             
		//* 307  605:aconst_null     
		//* 308  606:areturn         
		//* 309  607:aload_1         
		//* 310  608:ifnull          678
		//* 311  611:aload_1         
		//* 312  612:invokevirtual   #209 <Method int Bitmap.getWidth()>
		//* 313  615:aload_1         
		//* 314  616:invokevirtual   #212 <Method int Bitmap.getHeight()>
		//* 315  619:icmpge          678
		//* 316  622:new             #214 <Class android.support.v7.graphics.Palette$Builder>
		//* 317  625:dup             
		//* 318  626:aload_1         
		//* 319  627:invokespecial   #217 <Method void android.support.v7.graphics.Palette$Builder(Bitmap)>
		//* 320  630:iconst_1        
		//* 321  631:invokevirtual   #221 <Method android.support.v7.graphics.Palette$Builder android.support.v7.graphics.Palette$Builder.maximumColorCount(int)>
		//* 322  634:invokevirtual   #225 <Method Palette android.support.v7.graphics.Palette$Builder.generate()>
		//* 323  637:astore          5
		//* 324  639:aload           5
		//* 325  641:invokevirtual   #231 <Method List Palette.getSwatches()>
		//* 326  644:invokeinterface #236 <Method boolean List.isEmpty()>
		//* 327  649:ifeq            655
		//* 328  652:goto            673
		//* 329  655:aload           5
		//* 330  657:invokevirtual   #231 <Method List Palette.getSwatches()>
		//* 331  660:iconst_0        
		//* 332  661:invokeinterface #240 <Method Object List.get(int)>
		//* 333  666:checkcast       #242 <Class android.support.v7.graphics.Palette$Swatch>
		//* 334  669:invokevirtual   #245 <Method int android.support.v7.graphics.Palette$Swatch.getRgb()>
		//* 335  672:istore_2        
		//* 336  673:aload_0         
		//* 337  674:iload_2         
		//* 338  675:putfield        #247 <Field int mBackgroundColor>
		//* 339  678:aload_1         
		//* 340  679:areturn         
				// Misplaced declaration of an exception variable
				catch(Void avoid[])
		//* 341  680:astore_1        
				{
					return null;
		//  342  681:aconst_null     
		//  343  682:areturn         
				}
			return null;
			obj = obj1;
			avoid = ((Void []) (obj1));
			options = new android.graphics.BitmapFactory.Options();
			obj = obj1;
			avoid = ((Void []) (obj1));
			options.inJustDecodeBounds = true;
			obj = obj1;
			avoid = ((Void []) (obj1));
			BitmapFactory.decodeStream(((InputStream) (obj1)), ((Rect) (null)), options);
			obj = obj1;
			avoid = ((Void []) (obj1));
			if(options.outWidth == 0) goto _L6; else goto _L5
_L5:
			obj = obj1;
			avoid = ((Void []) (obj1));
			j = options.outHeight;
			if(j != 0) goto _L7; else goto _L6
_L7:
			avoid = ((Void []) (obj1));
			((InputStream) (obj1)).reset();
			  goto _L8
_L13:
			obj = obj1;
			avoid = ((Void []) (obj1));
			((InputStream) (obj1)).close();
			obj = obj1;
			avoid = ((Void []) (obj1));
			obj3 = ((Object) (openInputStreamByScheme(mIconUri)));
			obj1 = obj3;
			if(obj3 != null) goto _L8; else goto _L9
_L9:
			obj = obj3;
			avoid = ((Void []) (obj3));
			obj1 = ((Object) (new StringBuilder()));
			obj = obj3;
			avoid = ((Void []) (obj3));
			((StringBuilder) (obj1)).append("Unable to open: ");
			obj = obj3;
			avoid = ((Void []) (obj3));
			((StringBuilder) (obj1)).append(((Object) (mIconUri)));
			obj = obj3;
			avoid = ((Void []) (obj3));
			Log.w("MediaRouteCtrlDialog", ((StringBuilder) (obj1)).toString());
			if(obj3 != null)
				try
				{
					((InputStream) (obj3)).close();
				}
		//* 344  683:astore_1        
		//* 345  684:goto            204
				// Misplaced declaration of an exception variable
				catch(Void avoid[])
		//* 346  687:astore_1        
				{
					return null;
		//  347  688:aconst_null     
		//  348  689:areturn         
				}
			return null;
_L8:
			obj = obj1;
			avoid = ((Void []) (obj1));
			options.inJustDecodeBounds = false;
			obj = obj1;
			avoid = ((Void []) (obj1));
			j = getDesiredArtHeight(options.outWidth, options.outHeight);
			obj = obj1;
			avoid = ((Void []) (obj1));
			options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / j));
			obj = obj1;
			avoid = ((Void []) (obj1));
			flag = isCancelled();
			if(flag)
			{
				if(obj1 != null)
					try
					{
						((InputStream) (obj1)).close();
					}
					// Misplaced declaration of an exception variable
					catch(Void avoid[])
		//* 349  690:astore_1        
					{
						return null;
		//  350  691:aconst_null     
		//  351  692:areturn         
					}
				return null;
			}
			obj = obj1;
			avoid = ((Void []) (obj1));
			obj3 = ((Object) (BitmapFactory.decodeStream(((InputStream) (obj1)), ((Rect) (null)), options)));
			if(obj1 != null)
				try
				{
					((InputStream) (obj1)).close();
				}
				// Misplaced declaration of an exception variable
				catch(Void avoid[]) { }
		//  352  693:astore_1        
			avoid = ((Void []) (obj3));
			  goto _L1
_L6:
			if(obj1 != null)
				try
				{
					((InputStream) (obj1)).close();
				}
		//* 353  694:goto            441
				// Misplaced declaration of an exception variable
				catch(Void avoid[])
		//* 354  697:astore_1        
				{
					return null;
		//  355  698:aconst_null     
		//  356  699:areturn         
				}
			return null;
			obj2;
			  goto _L10
			avoid;
			obj = null;
			  goto _L11
			obj2;
			obj = null;
_L10:
			avoid = ((Void []) (obj));
			obj3 = ((Object) (new StringBuilder()));
			avoid = ((Void []) (obj));
			((StringBuilder) (obj3)).append("Unable to open: ");
			avoid = ((Void []) (obj));
			((StringBuilder) (obj3)).append(((Object) (mIconUri)));
			avoid = ((Void []) (obj));
			Log.w("MediaRouteCtrlDialog", ((StringBuilder) (obj3)).toString(), ((Throwable) (obj2)));
			if(obj != null)
				try
				{
					((InputStream) (obj)).close();
				}
				// Misplaced declaration of an exception variable
				catch(Void avoid[]) { }
		//  357  700:astore_1        
			  goto _L4
			obj2;
			obj = ((Object) (avoid));
			avoid = ((Void []) (obj2));
_L11:
			if(obj != null)
				try
				{
					((InputStream) (obj)).close();
				}
		//* 358  701:goto            561
				catch(IOException ioexception) { }
		//  359  704:astore          5
			throw avoid;
_L4:
			avoid = null;
_L1:
			if(MediaRouteControllerDialog.isBitmapRecycled(((Bitmap) (avoid))))
			{
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("Can't use recycled bitmap: ");
				((StringBuilder) (obj)).append(((Object) (avoid)));
				Log.w("MediaRouteCtrlDialog", ((StringBuilder) (obj)).toString());
				return null;
			}
			if(avoid != null && ((Bitmap) (avoid)).getWidth() < ((Bitmap) (avoid)).getHeight())
			{
				obj = ((Object) ((new android.support.v7.graphics.Palette.Builder(((Bitmap) (avoid)))).maximumColorCount(1).generate()));
				if(!((Palette) (obj)).getSwatches().isEmpty())
					i = ((android.support.v7.graphics.Palette.Swatch)((Palette) (obj)).getSwatches().get(0)).getRgb();
				mBackgroundColor = i;
			}
			return ((Bitmap) (avoid));
			avoid;
			if(true) goto _L13; else goto _L12
_L12:
		//* 360  706:goto            559
		}

		protected volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground((Void[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #250 <Class Void[]>
		//    3    5:invokevirtual   #252 <Method Bitmap doInBackground(Void[])>
		//    4    8:areturn         
		}

		public Bitmap getIconBitmap()
		{
			return mIconBitmap;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field Bitmap mIconBitmap>
		//    2    4:areturn         
		}

		public Uri getIconUri()
		{
			return mIconUri;
		//    0    0:aload_0         
		//    1    1:getfield        #58  <Field Uri mIconUri>
		//    2    4:areturn         
		}

		protected void onPostExecute(Bitmap bitmap)
		{
			MediaRouteControllerDialog mediaroutecontrollerdialog = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field MediaRouteControllerDialog this$0>
		//    2    4:astore          7
			mediaroutecontrollerdialog.mFetchArtTask = null;
		//    3    6:aload           7
		//    4    8:aconst_null     
		//    5    9:putfield        #259 <Field MediaRouteControllerDialog$FetchArtTask MediaRouteControllerDialog.mFetchArtTask>
			if(!p.a(((Object) (mediaroutecontrollerdialog.mArtIconBitmap)), ((Object) (mIconBitmap))) || !p.a(((Object) (mArtIconUri)), ((Object) (mIconUri))))
		//*   6   12:aload           7
		//*   7   14:getfield        #262 <Field Bitmap MediaRouteControllerDialog.mArtIconBitmap>
		//*   8   17:aload_0         
		//*   9   18:getfield        #52  <Field Bitmap mIconBitmap>
		//*  10   21:invokestatic    #268 <Method boolean p.a(Object, Object)>
		//*  11   24:ifeq            44
		//*  12   27:aload_0         
		//*  13   28:getfield        #21  <Field MediaRouteControllerDialog this$0>
		//*  14   31:getfield        #271 <Field Uri MediaRouteControllerDialog.mArtIconUri>
		//*  15   34:aload_0         
		//*  16   35:getfield        #58  <Field Uri mIconUri>
		//*  17   38:invokestatic    #268 <Method boolean p.a(Object, Object)>
		//*  18   41:ifne            127
			{
				MediaRouteControllerDialog mediaroutecontrollerdialog1 = MediaRouteControllerDialog.this;
		//   19   44:aload_0         
		//   20   45:getfield        #21  <Field MediaRouteControllerDialog this$0>
		//   21   48:astore          7
				mediaroutecontrollerdialog1.mArtIconBitmap = mIconBitmap;
		//   22   50:aload           7
		//   23   52:aload_0         
		//   24   53:getfield        #52  <Field Bitmap mIconBitmap>
		//   25   56:putfield        #262 <Field Bitmap MediaRouteControllerDialog.mArtIconBitmap>
				mediaroutecontrollerdialog1.mArtIconLoadedBitmap = bitmap;
		//   26   59:aload           7
		//   27   61:aload_1         
		//   28   62:putfield        #274 <Field Bitmap MediaRouteControllerDialog.mArtIconLoadedBitmap>
				mediaroutecontrollerdialog1.mArtIconUri = mIconUri;
		//   29   65:aload           7
		//   30   67:aload_0         
		//   31   68:getfield        #58  <Field Uri mIconUri>
		//   32   71:putfield        #271 <Field Uri MediaRouteControllerDialog.mArtIconUri>
				mediaroutecontrollerdialog1.mArtIconBackgroundColor = mBackgroundColor;
		//   33   74:aload           7
		//   34   76:aload_0         
		//   35   77:getfield        #247 <Field int mBackgroundColor>
		//   36   80:putfield        #277 <Field int MediaRouteControllerDialog.mArtIconBackgroundColor>
				boolean flag = true;
		//   37   83:iconst_1        
		//   38   84:istore_2        
				mediaroutecontrollerdialog1.mArtIconIsLoaded = true;
		//   39   85:aload           7
		//   40   87:iconst_1        
		//   41   88:putfield        #280 <Field boolean MediaRouteControllerDialog.mArtIconIsLoaded>
				long l = SystemClock.uptimeMillis();
		//   42   91:invokestatic    #286 <Method long SystemClock.uptimeMillis()>
		//   43   94:lstore_3        
				long l1 = mStartTimeMillis;
		//   44   95:aload_0         
		//   45   96:getfield        #288 <Field long mStartTimeMillis>
		//   46   99:lstore          5
				bitmap = ((Bitmap) (MediaRouteControllerDialog.this));
		//   47  101:aload_0         
		//   48  102:getfield        #21  <Field MediaRouteControllerDialog this$0>
		//   49  105:astore_1        
				if(l - l1 <= 120L)
		//*  50  106:lload_3         
		//*  51  107:lload           5
		//*  52  109:lsub            
		//*  53  110:ldc2w           #7   <Long 120L>
		//*  54  113:lcmp            
		//*  55  114:ifle            120
		//*  56  117:goto            122
					flag = false;
		//   57  120:iconst_0        
		//   58  121:istore_2        
				((MediaRouteControllerDialog) (bitmap)).update(flag);
		//   59  122:aload_1         
		//   60  123:iload_2         
		//   61  124:invokevirtual   #292 <Method void MediaRouteControllerDialog.update(boolean)>
			}
		//   62  127:return          
		}

		protected volatile void onPostExecute(Object obj)
		{
			onPostExecute((Bitmap)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #205 <Class Bitmap>
		//    3    5:invokevirtual   #295 <Method void onPostExecute(Bitmap)>
		//    4    8:return          
		}

		protected void onPreExecute()
		{
			mStartTimeMillis = SystemClock.uptimeMillis();
		//    0    0:aload_0         
		//    1    1:invokestatic    #286 <Method long SystemClock.uptimeMillis()>
		//    2    4:putfield        #288 <Field long mStartTimeMillis>
			clearLoadedBitmap();
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field MediaRouteControllerDialog this$0>
		//    5   11:invokevirtual   #299 <Method void MediaRouteControllerDialog.clearLoadedBitmap()>
		//    6   14:return          
		}

		private static final long SHOW_ANIM_TIME_THRESHOLD_MILLIS = 120L;
		private int mBackgroundColor;
		private final Bitmap mIconBitmap;
		private final Uri mIconUri;
		private long mStartTimeMillis;
		final MediaRouteControllerDialog this$0;

		FetchArtTask()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void AsyncTask()>
			Object obj = ((Object) (mDescription));
		//    5    9:aload_1         
		//    6   10:getfield        #30  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
		//    7   13:astore_2        
			Object obj1 = null;
		//    8   14:aconst_null     
		//    9   15:astore          4
			if(obj == null)
		//*  10   17:aload_2         
		//*  11   18:ifnonnull       26
				obj = null;
		//   12   21:aconst_null     
		//   13   22:astore_2        
			else
		//*  14   23:goto            34
				obj = ((Object) (mDescription.d()));
		//   15   26:aload_1         
		//   16   27:getfield        #30  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
		//   17   30:invokevirtual   #36  <Method Bitmap MediaDescriptionCompat.d()>
		//   18   33:astore_2        
			Bitmap bitmap = ((Bitmap) (obj));
		//   19   34:aload_2         
		//   20   35:astore_3        
			if(MediaRouteControllerDialog.isBitmapRecycled(((Bitmap) (obj))))
		//*  21   36:aload_2         
		//*  22   37:invokestatic    #40  <Method boolean MediaRouteControllerDialog.isBitmapRecycled(Bitmap)>
		//*  23   40:ifeq            53
			{
				Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
		//   24   43:ldc1            #42  <String "MediaRouteCtrlDialog">
		//   25   45:ldc1            #44  <String "Can't fetch the given art bitmap because it's already recycled.">
		//   26   47:invokestatic    #50  <Method int Log.w(String, String)>
		//   27   50:pop             
				bitmap = null;
		//   28   51:aconst_null     
		//   29   52:astore_3        
			}
			mIconBitmap = bitmap;
		//   30   53:aload_0         
		//   31   54:aload_3         
		//   32   55:putfield        #52  <Field Bitmap mIconBitmap>
			if(mDescription == null)
		//*  33   58:aload_1         
		//*  34   59:getfield        #30  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
		//*  35   62:ifnonnull       71
				mediaroutecontrollerdialog = ((MediaRouteControllerDialog) (obj1));
		//   36   65:aload           4
		//   37   67:astore_1        
			else
		//*  38   68:goto            79
				mediaroutecontrollerdialog = ((MediaRouteControllerDialog) (mDescription.e()));
		//   39   71:aload_1         
		//   40   72:getfield        #30  <Field MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
		//   41   75:invokevirtual   #56  <Method Uri MediaDescriptionCompat.e()>
		//   42   78:astore_1        
			mIconUri = ((Uri) (MediaRouteControllerDialog.this));
		//   43   79:aload_0         
		//   44   80:aload_1         
		//   45   81:putfield        #58  <Field Uri mIconUri>
		//   46   84:return          
		}
	}


	private class _cls9
		implements android.view.animation.Animation.AnimationListener
	{

		public void onAnimationEnd(Animation animation)
		{
		//    0    0:return          
		}

		public void onAnimationRepeat(Animation animation)
		{
		//    0    0:return          
		}

		public void onAnimationStart(Animation animation)
		{
			mVolumeGroupList.startAnimationAll();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//    2    4:getfield        #26  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
		//    3    7:invokevirtual   #31  <Method void OverlayListView.startAnimationAll()>
			mVolumeGroupList.postDelayed(mGroupListFadeInAnimation, mGroupListAnimationDurationMs);
		//    4   10:aload_0         
		//    5   11:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//    6   14:getfield        #26  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
		//    7   17:aload_0         
		//    8   18:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//    9   21:getfield        #35  <Field Runnable MediaRouteControllerDialog.mGroupListFadeInAnimation>
		//   10   24:aload_0         
		//   11   25:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//   12   28:getfield        #39  <Field int MediaRouteControllerDialog.mGroupListAnimationDurationMs>
		//   13   31:i2l             
		//   14   32:invokevirtual   #43  <Method boolean OverlayListView.postDelayed(Runnable, long)>
		//   15   35:pop             
		//   16   36:return          
		}

		final MediaRouteControllerDialog this$0;

		_cls9()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class _cls10
		implements OverlayListView.OverlayObject.OnAnimationEndListener
	{

		public void onAnimationEnd()
		{
			mGroupMemberRoutesAnimatingWithBitmap.remove(((Object) (route)));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field MediaRouteControllerDialog this$0>
		//    2    4:getfield        #27  <Field Set MediaRouteControllerDialog.mGroupMemberRoutesAnimatingWithBitmap>
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field android.support.v7.media.MediaRouter$RouteInfo val$route>
		//    5   11:invokeinterface #33  <Method boolean Set.remove(Object)>
		//    6   16:pop             
			mVolumeGroupAdapter.notifyDataSetChanged();
		//    7   17:aload_0         
		//    8   18:getfield        #14  <Field MediaRouteControllerDialog this$0>
		//    9   21:getfield        #37  <Field MediaRouteControllerDialog$VolumeGroupAdapter MediaRouteControllerDialog.mVolumeGroupAdapter>
		//   10   24:invokevirtual   #42  <Method void MediaRouteControllerDialog$VolumeGroupAdapter.notifyDataSetChanged()>
		//   11   27:return          
		}

		final MediaRouteControllerDialog this$0;
		final android.support.v7.media.MediaRouter.RouteInfo val$route;

		_cls10()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field MediaRouteControllerDialog this$0>
			route = routeinfo;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #16  <Field android.support.v7.media.MediaRouter$RouteInfo val$route>
			super();
		//    6   10:aload_0         
		//    7   11:invokespecial   #19  <Method void Object()>
		//    8   14:return          
		}
	}


	private class ClickListener
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			int j = view.getId();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #24  <Method int View.getId()>
		//    2    4:istore          4
			int i = 1;
		//    3    6:iconst_1        
		//    4    7:istore_2        
			boolean flag = true;
		//    5    8:iconst_1        
		//    6    9:istore_3        
			if(j != 0x1020019 && j != 0x102001a)
		//*   7   10:iload           4
		//*   8   12:ldc1            #25  <Int 0x1020019>
		//*   9   14:icmpeq          292
		//*  10   17:iload           4
		//*  11   19:ldc1            #26  <Int 0x102001a>
		//*  12   21:icmpne          27
		//*  13   24:goto            292
			{
				if(j == android.support.v7.mediarouter.R.id.mr_control_playback_ctrl)
		//*  14   27:iload           4
		//*  15   29:getstatic       #32  <Field int android.support.v7.mediarouter.R$id.mr_control_playback_ctrl>
		//*  16   32:icmpne          276
				{
					if(mMediaController != null && mState != null)
		//*  17   35:aload_0         
		//*  18   36:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//*  19   39:getfield        #38  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//*  20   42:ifnull          334
		//*  21   45:aload_0         
		//*  22   46:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//*  23   49:getfield        #42  <Field PlaybackStateCompat MediaRouteControllerDialog.mState>
		//*  24   52:ifnull          334
					{
						i = mState.a();
		//   25   55:aload_0         
		//   26   56:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//   27   59:getfield        #42  <Field PlaybackStateCompat MediaRouteControllerDialog.mState>
		//   28   62:invokevirtual   #47  <Method int PlaybackStateCompat.a()>
		//   29   65:istore_2        
						j = 0;
		//   30   66:iconst_0        
		//   31   67:istore          4
						if(i != 3)
		//*  32   69:iload_2         
		//*  33   70:iconst_3        
		//*  34   71:icmpne          77
		//*  35   74:goto            79
							flag = false;
		//   36   77:iconst_0        
		//   37   78:istore_3        
						if(flag && isPauseActionSupported())
		//*  38   79:iload_3         
		//*  39   80:ifeq            113
		//*  40   83:aload_0         
		//*  41   84:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//*  42   87:invokevirtual   #51  <Method boolean MediaRouteControllerDialog.isPauseActionSupported()>
		//*  43   90:ifeq            113
						{
							mMediaController.a().b();
		//   44   93:aload_0         
		//   45   94:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//   46   97:getfield        #38  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//   47  100:invokevirtual   #56  <Method s MediaControllerCompat.a()>
		//   48  103:invokevirtual   #61  <Method void s.b()>
							i = android.support.v7.mediarouter.R.string.mr_controller_pause;
		//   49  106:getstatic       #66  <Field int android.support.v7.mediarouter.R$string.mr_controller_pause>
		//   50  109:istore_2        
						} else
		//*  51  110:goto            184
						if(flag && isStopActionSupported())
		//*  52  113:iload_3         
		//*  53  114:ifeq            147
		//*  54  117:aload_0         
		//*  55  118:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//*  56  121:invokevirtual   #69  <Method boolean MediaRouteControllerDialog.isStopActionSupported()>
		//*  57  124:ifeq            147
						{
							mMediaController.a().c();
		//   58  127:aload_0         
		//   59  128:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//   60  131:getfield        #38  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//   61  134:invokevirtual   #56  <Method s MediaControllerCompat.a()>
		//   62  137:invokevirtual   #72  <Method void s.c()>
							i = android.support.v7.mediarouter.R.string.mr_controller_stop;
		//   63  140:getstatic       #75  <Field int android.support.v7.mediarouter.R$string.mr_controller_stop>
		//   64  143:istore_2        
						} else
		//*  65  144:goto            184
						{
							i = j;
		//   66  147:iload           4
		//   67  149:istore_2        
							if(!flag)
		//*  68  150:iload_3         
		//*  69  151:ifne            184
							{
								i = j;
		//   70  154:iload           4
		//   71  156:istore_2        
								if(isPlayActionSupported())
		//*  72  157:aload_0         
		//*  73  158:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//*  74  161:invokevirtual   #78  <Method boolean MediaRouteControllerDialog.isPlayActionSupported()>
		//*  75  164:ifeq            184
								{
									mMediaController.a().a();
		//   76  167:aload_0         
		//   77  168:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//   78  171:getfield        #38  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//   79  174:invokevirtual   #56  <Method s MediaControllerCompat.a()>
		//   80  177:invokevirtual   #80  <Method void s.a()>
									i = android.support.v7.mediarouter.R.string.mr_controller_play;
		//   81  180:getstatic       #83  <Field int android.support.v7.mediarouter.R$string.mr_controller_play>
		//   82  183:istore_2        
								}
							}
						}
						if(mAccessibilityManager != null && mAccessibilityManager.isEnabled() && i != 0)
		//*  83  184:aload_0         
		//*  84  185:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//*  85  188:getfield        #87  <Field AccessibilityManager MediaRouteControllerDialog.mAccessibilityManager>
		//*  86  191:ifnull          334
		//*  87  194:aload_0         
		//*  88  195:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//*  89  198:getfield        #87  <Field AccessibilityManager MediaRouteControllerDialog.mAccessibilityManager>
		//*  90  201:invokevirtual   #92  <Method boolean AccessibilityManager.isEnabled()>
		//*  91  204:ifeq            334
		//*  92  207:iload_2         
		//*  93  208:ifeq            334
						{
							view = ((View) (AccessibilityEvent.obtain(16384)));
		//   94  211:sipush          16384
		//   95  214:invokestatic    #98  <Method AccessibilityEvent AccessibilityEvent.obtain(int)>
		//   96  217:astore_1        
							((AccessibilityEvent) (view)).setPackageName(((CharSequence) (mContext.getPackageName())));
		//   97  218:aload_1         
		//   98  219:aload_0         
		//   99  220:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//  100  223:getfield        #102 <Field Context MediaRouteControllerDialog.mContext>
		//  101  226:invokevirtual   #108 <Method String Context.getPackageName()>
		//  102  229:invokevirtual   #112 <Method void AccessibilityEvent.setPackageName(CharSequence)>
							((AccessibilityEvent) (view)).setClassName(((CharSequence) (((Object)this).getClass().getName())));
		//  103  232:aload_1         
		//  104  233:aload_0         
		//  105  234:invokevirtual   #116 <Method Class Object.getClass()>
		//  106  237:invokevirtual   #121 <Method String Class.getName()>
		//  107  240:invokevirtual   #124 <Method void AccessibilityEvent.setClassName(CharSequence)>
							((AccessibilityEvent) (view)).getText().add(((Object) (mContext.getString(i))));
		//  108  243:aload_1         
		//  109  244:invokevirtual   #128 <Method List AccessibilityEvent.getText()>
		//  110  247:aload_0         
		//  111  248:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//  112  251:getfield        #102 <Field Context MediaRouteControllerDialog.mContext>
		//  113  254:iload_2         
		//  114  255:invokevirtual   #132 <Method String Context.getString(int)>
		//  115  258:invokeinterface #138 <Method boolean List.add(Object)>
		//  116  263:pop             
							mAccessibilityManager.sendAccessibilityEvent(((AccessibilityEvent) (view)));
		//  117  264:aload_0         
		//  118  265:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//  119  268:getfield        #87  <Field AccessibilityManager MediaRouteControllerDialog.mAccessibilityManager>
		//  120  271:aload_1         
		//  121  272:invokevirtual   #142 <Method void AccessibilityManager.sendAccessibilityEvent(AccessibilityEvent)>
							return;
		//  122  275:return          
						}
					}
				} else
				if(j == android.support.v7.mediarouter.R.id.mr_close)
		//* 123  276:iload           4
		//* 124  278:getstatic       #145 <Field int android.support.v7.mediarouter.R$id.mr_close>
		//* 125  281:icmpne          334
				{
					dismiss();
		//  126  284:aload_0         
		//  127  285:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//  128  288:invokevirtual   #148 <Method void MediaRouteControllerDialog.dismiss()>
					return;
		//  129  291:return          
				}
			} else
			{
				if(mRoute.isSelected())
		//* 130  292:aload_0         
		//* 131  293:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//* 132  296:getfield        #152 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRoute>
		//* 133  299:invokevirtual   #157 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isSelected()>
		//* 134  302:ifeq            327
				{
					view = ((View) (mRouter));
		//  135  305:aload_0         
		//  136  306:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//  137  309:getfield        #161 <Field MediaRouter MediaRouteControllerDialog.mRouter>
		//  138  312:astore_1        
					if(j == 0x1020019)
		//* 139  313:iload           4
		//* 140  315:ldc1            #25  <Int 0x1020019>
		//* 141  317:icmpne          322
						i = 2;
		//  142  320:iconst_2        
		//  143  321:istore_2        
					((MediaRouter) (view)).unselect(i);
		//  144  322:aload_1         
		//  145  323:iload_2         
		//  146  324:invokevirtual   #167 <Method void MediaRouter.unselect(int)>
				}
				dismiss();
		//  147  327:aload_0         
		//  148  328:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//  149  331:invokevirtual   #148 <Method void MediaRouteControllerDialog.dismiss()>
			}
		//  150  334:return          
		}

		final MediaRouteControllerDialog this$0;

		ClickListener()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class _cls2
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			dismiss();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//    2    4:invokevirtual   #23  <Method void MediaRouteControllerDialog.dismiss()>
		//    3    7:return          
		}

		final MediaRouteControllerDialog this$0;

		_cls2()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class _cls3
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
		//    0    0:return          
		}

		final MediaRouteControllerDialog this$0;

		_cls3()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class _cls4
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			android.app.PendingIntent.CanceledException canceledexception;
			if(mMediaController != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//*   2    4:getfield        #26  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//*   3    7:ifnull          68
			{
				view = ((View) (mMediaController.d()));
		//    4   10:aload_0         
		//    5   11:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//    6   14:getfield        #26  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		//    7   17:invokevirtual   #32  <Method PendingIntent MediaControllerCompat.d()>
		//    8   20:astore_1        
				if(view != null)
		//*   9   21:aload_1         
		//*  10   22:ifnull          68
				{
					StringBuilder stringbuilder;
					try
					{
						((PendingIntent) (view)).send();
		//   11   25:aload_1         
		//   12   26:invokevirtual   #37  <Method void PendingIntent.send()>
						dismiss();
		//   13   29:aload_0         
		//   14   30:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//   15   33:invokevirtual   #40  <Method void MediaRouteControllerDialog.dismiss()>
						return;
		//   16   36:return          
					}
		//*  17   37:new             #42  <Class StringBuilder>
		//*  18   40:dup             
		//*  19   41:invokespecial   #43  <Method void StringBuilder()>
		//*  20   44:astore_2        
		//*  21   45:aload_2         
		//*  22   46:aload_1         
		//*  23   47:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
		//*  24   50:pop             
		//*  25   51:aload_2         
		//*  26   52:ldc1            #49  <String " was not sent, it had been canceled.">
		//*  27   54:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
		//*  28   57:pop             
		//*  29   58:ldc1            #54  <String "MediaRouteCtrlDialog">
		//*  30   60:aload_2         
		//*  31   61:invokevirtual   #58  <Method String StringBuilder.toString()>
		//*  32   64:invokestatic    #64  <Method int Log.e(String, String)>
		//*  33   67:pop             
		//*  34   68:return          
					// Misplaced declaration of an exception variable
					catch(android.app.PendingIntent.CanceledException canceledexception)
					{
						stringbuilder = new StringBuilder();
					}
					stringbuilder.append(((Object) (view)));
					stringbuilder.append(" was not sent, it had been canceled.");
					Log.e("MediaRouteCtrlDialog", stringbuilder.toString());
				}
			}
		//*  35   69:astore_2        
		//*  36   70:goto            37
		}

		final MediaRouteControllerDialog this$0;

		_cls4()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class VolumeChangeListener
		implements android.widget.SeekBar.OnSeekBarChangeListener
	{

		public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
		{
			if(flag)
		//*   0    0:iload_3         
		//*   1    1:ifeq            66
			{
				seekbar = ((SeekBar) ((android.support.v7.media.MediaRouter.RouteInfo)seekbar.getTag()));
		//    2    4:aload_1         
		//    3    5:invokevirtual   #33  <Method Object SeekBar.getTag()>
		//    4    8:checkcast       #35  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//    5   11:astore_1        
				if(MediaRouteControllerDialog.DEBUG)
		//*   6   12:getstatic       #41  <Field boolean MediaRouteControllerDialog.DEBUG>
		//*   7   15:ifeq            61
				{
					StringBuilder stringbuilder = new StringBuilder();
		//    8   18:new             #43  <Class StringBuilder>
		//    9   21:dup             
		//   10   22:invokespecial   #44  <Method void StringBuilder()>
		//   11   25:astore          4
					stringbuilder.append("onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(");
		//   12   27:aload           4
		//   13   29:ldc1            #46  <String "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(">
		//   14   31:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   15   34:pop             
					stringbuilder.append(i);
		//   16   35:aload           4
		//   17   37:iload_2         
		//   18   38:invokevirtual   #53  <Method StringBuilder StringBuilder.append(int)>
		//   19   41:pop             
					stringbuilder.append(")");
		//   20   42:aload           4
		//   21   44:ldc1            #55  <String ")">
		//   22   46:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   23   49:pop             
					Log.d("MediaRouteCtrlDialog", stringbuilder.toString());
		//   24   50:ldc1            #57  <String "MediaRouteCtrlDialog">
		//   25   52:aload           4
		//   26   54:invokevirtual   #61  <Method String StringBuilder.toString()>
		//   27   57:invokestatic    #67  <Method int Log.d(String, String)>
		//   28   60:pop             
				}
				((android.support.v7.media.MediaRouter.RouteInfo) (seekbar)).requestSetVolume(i);
		//   29   61:aload_1         
		//   30   62:iload_2         
		//   31   63:invokevirtual   #71  <Method void android.support.v7.media.MediaRouter$RouteInfo.requestSetVolume(int)>
			}
		//   32   66:return          
		}

		public void onStartTrackingTouch(SeekBar seekbar)
		{
			if(mRouteInVolumeSliderTouched != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field MediaRouteControllerDialog this$0>
		//*   2    4:getfield        #77  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
		//*   3    7:ifnull          25
				mVolumeSlider.removeCallbacks(mStopTrackingTouch);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field MediaRouteControllerDialog this$0>
		//    6   14:getfield        #81  <Field SeekBar MediaRouteControllerDialog.mVolumeSlider>
		//    7   17:aload_0         
		//    8   18:getfield        #24  <Field Runnable mStopTrackingTouch>
		//    9   21:invokevirtual   #85  <Method boolean SeekBar.removeCallbacks(Runnable)>
		//   10   24:pop             
			mRouteInVolumeSliderTouched = (android.support.v7.media.MediaRouter.RouteInfo)seekbar.getTag();
		//   11   25:aload_0         
		//   12   26:getfield        #14  <Field MediaRouteControllerDialog this$0>
		//   13   29:aload_1         
		//   14   30:invokevirtual   #33  <Method Object SeekBar.getTag()>
		//   15   33:checkcast       #35  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//   16   36:putfield        #77  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
		//   17   39:return          
		}

		public void onStopTrackingTouch(SeekBar seekbar)
		{
			mVolumeSlider.postDelayed(mStopTrackingTouch, 500L);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field MediaRouteControllerDialog this$0>
		//    2    4:getfield        #81  <Field SeekBar MediaRouteControllerDialog.mVolumeSlider>
		//    3    7:aload_0         
		//    4    8:getfield        #24  <Field Runnable mStopTrackingTouch>
		//    5   11:ldc2w           #87  <Long 500L>
		//    6   14:invokevirtual   #92  <Method boolean SeekBar.postDelayed(Runnable, long)>
		//    7   17:pop             
		//    8   18:return          
		}

		private final Runnable mStopTrackingTouch = new _cls1();
		final MediaRouteControllerDialog this$0;

		VolumeChangeListener()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Object()>
			class _cls1
				implements Runnable
			{

				public void run()
				{
					if(mRouteInVolumeSliderTouched != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
				//*   2    4:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
				//*   3    7:getfield        #29  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
				//*   4   10:ifnull          57
					{
						mRouteInVolumeSliderTouched = null;
				//    5   13:aload_0         
				//    6   14:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
				//    7   17:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
				//    8   20:aconst_null     
				//    9   21:putfield        #29  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
						if(mHasPendingUpdate)
				//*  10   24:aload_0         
				//*  11   25:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
				//*  12   28:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
				//*  13   31:getfield        #33  <Field boolean MediaRouteControllerDialog.mHasPendingUpdate>
				//*  14   34:ifeq            57
							update(mPendingUpdateAnimationNeeded);
				//   15   37:aload_0         
				//   16   38:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
				//   17   41:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
				//   18   44:aload_0         
				//   19   45:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
				//   20   48:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
				//   21   51:getfield        #36  <Field boolean MediaRouteControllerDialog.mPendingUpdateAnimationNeeded>
				//   22   54:invokevirtual   #40  <Method void MediaRouteControllerDialog.update(boolean)>
					}
				//   23   57:return          
				}

				final VolumeChangeListener this$1;

				_cls1()
				{
					this$1 = VolumeChangeListener.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
					super();
				//    3    5:aload_0         
				//    4    6:invokespecial   #15  <Method void Object()>
				//    5    9:return          
				}
			}

		//    5    9:aload_0         
		//    6   10:new             #19  <Class MediaRouteControllerDialog$VolumeChangeListener$1>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:invokespecial   #22  <Method void MediaRouteControllerDialog$VolumeChangeListener$1(MediaRouteControllerDialog$VolumeChangeListener)>
		//   10   18:putfield        #24  <Field Runnable mStopTrackingTouch>
		//   11   21:return          
		}
	}


	private class _cls5
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			view = ((View) (MediaRouteControllerDialog.this));
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//    2    4:astore_1        
			view.mIsGroupExpanded = ((MediaRouteControllerDialog) (view)).mIsGroupExpanded ^ true;
		//    3    5:aload_1         
		//    4    6:aload_1         
		//    5    7:getfield        #24  <Field boolean MediaRouteControllerDialog.mIsGroupExpanded>
		//    6   10:iconst_1        
		//    7   11:ixor            
		//    8   12:putfield        #24  <Field boolean MediaRouteControllerDialog.mIsGroupExpanded>
			if(mIsGroupExpanded)
		//*   9   15:aload_0         
		//*  10   16:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//*  11   19:getfield        #24  <Field boolean MediaRouteControllerDialog.mIsGroupExpanded>
		//*  12   22:ifeq            36
				mVolumeGroupList.setVisibility(0);
		//   13   25:aload_0         
		//   14   26:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//   15   29:getfield        #28  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
		//   16   32:iconst_0        
		//   17   33:invokevirtual   #34  <Method void OverlayListView.setVisibility(int)>
			loadInterpolator();
		//   18   36:aload_0         
		//   19   37:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//   20   40:invokevirtual   #37  <Method void MediaRouteControllerDialog.loadInterpolator()>
			updateLayoutHeight(true);
		//   21   43:aload_0         
		//   22   44:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//   23   47:iconst_1        
		//   24   48:invokevirtual   #41  <Method void MediaRouteControllerDialog.updateLayoutHeight(boolean)>
		//   25   51:return          
		}

		final MediaRouteControllerDialog this$0;

		_cls5()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class _cls11
		implements android.view.ViewTreeObserver.OnGlobalLayoutListener
	{

		public void onGlobalLayout()
		{
			mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//    2    4:getfield        #23  <Field OverlayListView MediaRouteControllerDialog.mVolumeGroupList>
		//    3    7:invokevirtual   #29  <Method ViewTreeObserver OverlayListView.getViewTreeObserver()>
		//    4   10:aload_0         
		//    5   11:invokevirtual   #35  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			startGroupListFadeInAnimationInternal();
		//    6   14:aload_0         
		//    7   15:getfield        #12  <Field MediaRouteControllerDialog this$0>
		//    8   18:invokevirtual   #38  <Method void MediaRouteControllerDialog.startGroupListFadeInAnimationInternal()>
		//    9   21:return          
		}

		final MediaRouteControllerDialog this$0;

		_cls11()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteControllerDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class _cls6
		implements android.view.ViewTreeObserver.OnGlobalLayoutListener
	{

		public void onGlobalLayout()
		{
			mDefaultControlLayout.getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field MediaRouteControllerDialog this$0>
		//    2    4:getfield        #27  <Field FrameLayout MediaRouteControllerDialog.mDefaultControlLayout>
		//    3    7:invokevirtual   #33  <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
		//    4   10:aload_0         
		//    5   11:invokevirtual   #39  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			if(mIsGroupListAnimating)
		//*   6   14:aload_0         
		//*   7   15:getfield        #14  <Field MediaRouteControllerDialog this$0>
		//*   8   18:getfield        #42  <Field boolean MediaRouteControllerDialog.mIsGroupListAnimating>
		//*   9   21:ifeq            33
			{
				mIsGroupListAnimationPending = true;
		//   10   24:aload_0         
		//   11   25:getfield        #14  <Field MediaRouteControllerDialog this$0>
		//   12   28:iconst_1        
		//   13   29:putfield        #45  <Field boolean MediaRouteControllerDialog.mIsGroupListAnimationPending>
				return;
		//   14   32:return          
			} else
			{
				updateLayoutHeightInternal(animate);
		//   15   33:aload_0         
		//   16   34:getfield        #14  <Field MediaRouteControllerDialog this$0>
		//   17   37:aload_0         
		//   18   38:getfield        #16  <Field boolean val$animate>
		//   19   41:invokevirtual   #49  <Method void MediaRouteControllerDialog.updateLayoutHeightInternal(boolean)>
				return;
		//   20   44:return          
			}
		}

		final MediaRouteControllerDialog this$0;
		final boolean val$animate;

		_cls6()
		{
			this$0 = MediaRouteControllerDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field MediaRouteControllerDialog this$0>
			animate = flag;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #16  <Field boolean val$animate>
			super();
		//    6   10:aload_0         
		//    7   11:invokespecial   #19  <Method void Object()>
		//    8   14:return          
		}
	}

}
