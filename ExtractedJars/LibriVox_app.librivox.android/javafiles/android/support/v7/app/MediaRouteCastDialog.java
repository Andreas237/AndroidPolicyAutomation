// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.*;
import android.support.v4.g.p;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.widget.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package android.support.v7.app:
//			AppCompatDialog, MediaRouterThemeHelper

public class MediaRouteCastDialog extends AppCompatDialog
{

	public MediaRouteCastDialog(Context context)
	{
		this(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #90  <Method void MediaRouteCastDialog(Context, int)>
	//    4    6:return          
	}

	public MediaRouteCastDialog(Context context, int i)
	{
		context = MediaRouterThemeHelper.createThemedDialogContext(context, i, false);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #96  <Method Context MediaRouterThemeHelper.createThemedDialogContext(Context, int, boolean)>
	//    4    6:astore_1        
		super(context, MediaRouterThemeHelper.createThemedDialogStyle(context));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_1         
	//    8   10:invokestatic    #100 <Method int MediaRouterThemeHelper.createThemedDialogStyle(Context)>
	//    9   13:invokespecial   #101 <Method void AppCompatDialog(Context, int)>
		mSelector = MediaRouteSelector.EMPTY;
	//   10   16:aload_0         
	//   11   17:getstatic       #106 <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//   12   20:putfield        #108 <Field MediaRouteSelector mSelector>
		mRoutes = ((List) (new ArrayList()));
	//   13   23:aload_0         
	//   14   24:new             #110 <Class ArrayList>
	//   15   27:dup             
	//   16   28:invokespecial   #112 <Method void ArrayList()>
	//   17   31:putfield        #114 <Field List mRoutes>
		mHandler = ((Handler) (new _cls1()));
	//   18   34:aload_0         
	//   19   35:new             #116 <Class MediaRouteCastDialog$1>
	//   20   38:dup             
	//   21   39:aload_0         
	//   22   40:invokespecial   #119 <Method void MediaRouteCastDialog$1(MediaRouteCastDialog)>
	//   23   43:putfield        #121 <Field Handler mHandler>
		mContext = getContext();
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:invokevirtual   #125 <Method Context getContext()>
	//   27   51:putfield        #127 <Field Context mContext>
		mRouter = MediaRouter.getInstance(mContext);
	//   28   54:aload_0         
	//   29   55:aload_0         
	//   30   56:getfield        #127 <Field Context mContext>
	//   31   59:invokestatic    #133 <Method MediaRouter MediaRouter.getInstance(Context)>
	//   32   62:putfield        #135 <Field MediaRouter mRouter>
		mCallback = new MediaRouterCallback();
	//   33   65:aload_0         
	//   34   66:new             #137 <Class MediaRouteCastDialog$MediaRouterCallback>
	//   35   69:dup             
	//   36   70:aload_0         
	//   37   71:invokespecial   #138 <Method void MediaRouteCastDialog$MediaRouterCallback(MediaRouteCastDialog)>
	//   38   74:putfield        #140 <Field MediaRouteCastDialog$MediaRouterCallback mCallback>
		mRoute = mRouter.getSelectedRoute();
	//   39   77:aload_0         
	//   40   78:aload_0         
	//   41   79:getfield        #135 <Field MediaRouter mRouter>
	//   42   82:invokevirtual   #144 <Method android.support.v7.media.MediaRouter$RouteInfo MediaRouter.getSelectedRoute()>
	//   43   85:putfield        #146 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
		mControllerCallback = new MediaControllerCallback();
	//   44   88:aload_0         
	//   45   89:new             #148 <Class MediaRouteCastDialog$MediaControllerCallback>
	//   46   92:dup             
	//   47   93:aload_0         
	//   48   94:invokespecial   #149 <Method void MediaRouteCastDialog$MediaControllerCallback(MediaRouteCastDialog)>
	//   49   97:putfield        #151 <Field MediaRouteCastDialog$MediaControllerCallback mControllerCallback>
		setMediaSession(mRouter.getMediaSessionToken());
	//   50  100:aload_0         
	//   51  101:aload_0         
	//   52  102:getfield        #135 <Field MediaRouter mRouter>
	//   53  105:invokevirtual   #155 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaRouter.getMediaSessionToken()>
	//   54  108:invokespecial   #159 <Method void setMediaSession(android.support.v4.media.session.MediaSessionCompat$Token)>
	//   55  111:return          
	}

	static boolean isBitmapRecycled(Bitmap bitmap)
	{
		return bitmap != null && bitmap.isRecycled();
	//    0    0:aload_0         
	//    1    1:ifnull          13
	//    2    4:aload_0         
	//    3    5:invokevirtual   #167 <Method boolean Bitmap.isRecycled()>
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
	//    1    1:getfield        #170 <Field MediaDescriptionCompat mDescription>
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
	//   11   17:invokevirtual   #176 <Method Bitmap MediaDescriptionCompat.d()>
	//   12   20:astore_1        
		Object obj1 = ((Object) (mDescription));
	//   13   21:aload_0         
	//   14   22:getfield        #170 <Field MediaDescriptionCompat mDescription>
	//   15   25:astore_3        
		if(obj1 != null)
	//*  16   26:aload_3         
	//*  17   27:ifnonnull       33
	//*  18   30:goto            38
			uri = ((MediaDescriptionCompat) (obj1)).e();
	//   19   33:aload_3         
	//   20   34:invokevirtual   #180 <Method Uri MediaDescriptionCompat.e()>
	//   21   37:astore_2        
		obj1 = ((Object) (mFetchArtTask));
	//   22   38:aload_0         
	//   23   39:getfield        #182 <Field MediaRouteCastDialog$FetchArtTask mFetchArtTask>
	//   24   42:astore_3        
		if(obj1 == null)
	//*  25   43:aload_3         
	//*  26   44:ifnonnull       55
			obj1 = ((Object) (mArtIconBitmap));
	//   27   47:aload_0         
	//   28   48:getfield        #184 <Field Bitmap mArtIconBitmap>
	//   29   51:astore_3        
		else
	//*  30   52:goto            60
			obj1 = ((Object) (((FetchArtTask) (obj1)).getIconBitmap()));
	//   31   55:aload_3         
	//   32   56:invokevirtual   #189 <Method Bitmap MediaRouteCastDialog$FetchArtTask.getIconBitmap()>
	//   33   59:astore_3        
		Object obj2 = ((Object) (mFetchArtTask));
	//   34   60:aload_0         
	//   35   61:getfield        #182 <Field MediaRouteCastDialog$FetchArtTask mFetchArtTask>
	//   36   64:astore          4
		if(obj2 == null)
	//*  37   66:aload           4
	//*  38   68:ifnonnull       80
			obj2 = ((Object) (mArtIconUri));
	//   39   71:aload_0         
	//   40   72:getfield        #191 <Field Uri mArtIconUri>
	//   41   75:astore          4
		else
	//*  42   77:goto            87
			obj2 = ((Object) (((FetchArtTask) (obj2)).getIconUri()));
	//   43   80:aload           4
	//   44   82:invokevirtual   #194 <Method Uri MediaRouteCastDialog$FetchArtTask.getIconUri()>
	//   45   85:astore          4
		if(obj1 != obj)
	//*  46   87:aload_3         
	//*  47   88:aload_1         
	//*  48   89:if_acmpeq       94
			return true;
	//   49   92:iconst_1        
	//   50   93:ireturn         
		return obj1 == null && p.a(obj2, ((Object) (uri)));
	//   51   94:aload_3         
	//   52   95:ifnonnull       109
	//   53   98:aload           4
	//   54  100:aload_2         
	//   55  101:invokestatic    #200 <Method boolean p.a(Object, Object)>
	//   56  104:ifeq            109
	//   57  107:iconst_1        
	//   58  108:ireturn         
	//   59  109:iconst_0        
	//   60  110:ireturn         
	}

	private void setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token token)
	{
		MediaControllerCompat mediacontrollercompat = mMediaController;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field MediaControllerCompat mMediaController>
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
	//    9   13:getfield        #151 <Field MediaRouteCastDialog$MediaControllerCallback mControllerCallback>
	//   10   16:invokevirtual   #210 <Method void MediaControllerCompat.b(i)>
			mMediaController = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #204 <Field MediaControllerCompat mMediaController>
		}
		if(token == null)
	//*  14   24:aload_1         
	//*  15   25:ifnonnull       29
			return;
	//   16   28:return          
		if(!mAttachedToWindow)
	//*  17   29:aload_0         
	//*  18   30:getfield        #212 <Field boolean mAttachedToWindow>
	//*  19   33:ifne            37
			return;
	//   20   36:return          
		try
		{
			mMediaController = new MediaControllerCompat(mContext, token);
	//   21   37:aload_0         
	//   22   38:new             #206 <Class MediaControllerCompat>
	//   23   41:dup             
	//   24   42:aload_0         
	//   25   43:getfield        #127 <Field Context mContext>
	//   26   46:aload_1         
	//   27   47:invokespecial   #215 <Method void MediaControllerCompat(Context, android.support.v4.media.session.MediaSessionCompat$Token)>
	//   28   50:putfield        #204 <Field MediaControllerCompat mMediaController>
		}
	//*  29   53:goto            66
		// Misplaced declaration of an exception variable
		catch(android.support.v4.media.session.MediaSessionCompat.Token token)
	//*  30   56:astore_1        
		{
			Log.e("MediaRouteCastDialog", "Error creating media controller in setMediaSession.", ((Throwable) (token)));
	//   31   57:ldc1            #12  <String "MediaRouteCastDialog">
	//   32   59:ldc1            #217 <String "Error creating media controller in setMediaSession.">
	//   33   61:aload_1         
	//   34   62:invokestatic    #222 <Method int Log.e(String, String, Throwable)>
	//   35   65:pop             
		}
		token = ((android.support.v4.media.session.MediaSessionCompat.Token) (mMediaController));
	//   36   66:aload_0         
	//   37   67:getfield        #204 <Field MediaControllerCompat mMediaController>
	//   38   70:astore_1        
		if(token != null)
	//*  39   71:aload_1         
	//*  40   72:ifnull          83
			((MediaControllerCompat) (token)).a(((i) (mControllerCallback)));
	//   41   75:aload_1         
	//   42   76:aload_0         
	//   43   77:getfield        #151 <Field MediaRouteCastDialog$MediaControllerCallback mControllerCallback>
	//   44   80:invokevirtual   #224 <Method void MediaControllerCompat.a(i)>
		token = ((android.support.v4.media.session.MediaSessionCompat.Token) (mMediaController));
	//   45   83:aload_0         
	//   46   84:getfield        #204 <Field MediaControllerCompat mMediaController>
	//   47   87:astore_1        
		if(token == null)
	//*  48   88:aload_1         
	//*  49   89:ifnonnull       97
			token = null;
	//   50   92:aconst_null     
	//   51   93:astore_1        
		else
	//*  52   94:goto            102
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((MediaControllerCompat) (token)).c()));
	//   53   97:aload_1         
	//   54   98:invokevirtual   #228 <Method MediaMetadataCompat MediaControllerCompat.c()>
	//   55  101:astore_1        
		if(token == null)
	//*  56  102:aload_1         
	//*  57  103:ifnonnull       111
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (obj));
	//   58  106:aload_2         
	//   59  107:astore_1        
		else
	//*  60  108:goto            116
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((MediaMetadataCompat) (token)).a()));
	//   61  111:aload_1         
	//   62  112:invokevirtual   #233 <Method MediaDescriptionCompat MediaMetadataCompat.a()>
	//   63  115:astore_1        
		mDescription = ((MediaDescriptionCompat) (token));
	//   64  116:aload_0         
	//   65  117:aload_1         
	//   66  118:putfield        #170 <Field MediaDescriptionCompat mDescription>
		updateArtIconIfNeeded();
	//   67  121:aload_0         
	//   68  122:invokevirtual   #236 <Method void updateArtIconIfNeeded()>
		update();
	//   69  125:aload_0         
	//   70  126:invokevirtual   #239 <Method void update()>
	//   71  129:return          
	}

	private void updateMetadataLayout()
	{
		Object obj = ((Object) (mDescription));
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field MediaDescriptionCompat mDescription>
	//    2    4:astore_3        
		CharSequence charsequence = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		if(obj == null)
	//*   5    8:aload_3         
	//*   6    9:ifnonnull       17
			obj = null;
	//    7   12:aconst_null     
	//    8   13:astore_3        
		else
	//*   9   14:goto            22
			obj = ((Object) (((MediaDescriptionCompat) (obj)).b()));
	//   10   17:aload_3         
	//   11   18:invokevirtual   #243 <Method CharSequence MediaDescriptionCompat.b()>
	//   12   21:astore_3        
		boolean flag = TextUtils.isEmpty(((CharSequence) (obj)));
	//   13   22:aload_3         
	//   14   23:invokestatic    #249 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   15   26:istore_1        
		MediaDescriptionCompat mediadescriptioncompat = mDescription;
	//   16   27:aload_0         
	//   17   28:getfield        #170 <Field MediaDescriptionCompat mDescription>
	//   18   31:astore          5
		if(mediadescriptioncompat != null)
	//*  19   33:aload           5
	//*  20   35:ifnonnull       41
	//*  21   38:goto            48
			charsequence = mediadescriptioncompat.c();
	//   22   41:aload           5
	//   23   43:invokevirtual   #251 <Method CharSequence MediaDescriptionCompat.c()>
	//   24   46:astore          4
		boolean flag1 = TextUtils.isEmpty(charsequence);
	//   25   48:aload           4
	//   26   50:invokestatic    #249 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   27   53:istore_2        
		if(flag ^ true)
	//*  28   54:iload_1         
	//*  29   55:iconst_1        
	//*  30   56:ixor            
	//*  31   57:ifeq            71
			mTitleView.setText(((CharSequence) (obj)));
	//   32   60:aload_0         
	//   33   61:getfield        #253 <Field TextView mTitleView>
	//   34   64:aload_3         
	//   35   65:invokevirtual   #259 <Method void TextView.setText(CharSequence)>
		else
	//*  36   68:goto            82
			mTitleView.setText(((CharSequence) (mTitlePlaceholder)));
	//   37   71:aload_0         
	//   38   72:getfield        #253 <Field TextView mTitleView>
	//   39   75:aload_0         
	//   40   76:getfield        #261 <Field String mTitlePlaceholder>
	//   41   79:invokevirtual   #259 <Method void TextView.setText(CharSequence)>
		if(flag1 ^ true)
	//*  42   82:iload_2         
	//*  43   83:iconst_1        
	//*  44   84:ixor            
	//*  45   85:ifeq            106
		{
			mSubtitleView.setText(charsequence);
	//   46   88:aload_0         
	//   47   89:getfield        #263 <Field TextView mSubtitleView>
	//   48   92:aload           4
	//   49   94:invokevirtual   #259 <Method void TextView.setText(CharSequence)>
			mSubtitleView.setVisibility(0);
	//   50   97:aload_0         
	//   51   98:getfield        #263 <Field TextView mSubtitleView>
	//   52  101:iconst_0        
	//   53  102:invokevirtual   #267 <Method void TextView.setVisibility(int)>
			return;
	//   54  105:return          
		} else
		{
			mSubtitleView.setVisibility(8);
	//   55  106:aload_0         
	//   56  107:getfield        #263 <Field TextView mSubtitleView>
	//   57  110:bipush          8
	//   58  112:invokevirtual   #267 <Method void TextView.setVisibility(int)>
			return;
	//   59  115:return          
		}
	}

	void clearLoadedBitmap()
	{
		mArtIconIsLoaded = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #270 <Field boolean mArtIconIsLoaded>
		mArtIconLoadedBitmap = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #272 <Field Bitmap mArtIconLoadedBitmap>
		mArtIconBackgroundColor = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #274 <Field int mArtIconBackgroundColor>
	//    9   15:return          
	}

	int getDesiredArtHeight(int i, int j)
	{
		return mArtView.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field ImageView mArtView>
	//    2    4:invokevirtual   #284 <Method int ImageView.getHeight()>
	//    3    7:ireturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getMediaSession()
	{
		MediaControllerCompat mediacontrollercompat = mMediaController;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field MediaControllerCompat mMediaController>
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
	//    8   12:invokevirtual   #287 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaControllerCompat.e()>
	//    9   15:areturn         
	}

	public MediaRouteSelector getRouteSelector()
	{
		return mSelector;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field MediaRouteSelector mSelector>
	//    2    4:areturn         
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #292 <Method void AppCompatDialog.onAttachedToWindow()>
		mAttachedToWindow = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #212 <Field boolean mAttachedToWindow>
		mRouter.addCallback(mSelector, ((android.support.v7.media.MediaRouter.Callback) (mCallback)), 1);
	//    5    9:aload_0         
	//    6   10:getfield        #135 <Field MediaRouter mRouter>
	//    7   13:aload_0         
	//    8   14:getfield        #108 <Field MediaRouteSelector mSelector>
	//    9   17:aload_0         
	//   10   18:getfield        #140 <Field MediaRouteCastDialog$MediaRouterCallback mCallback>
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #296 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback, int)>
		refreshRoutes();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #299 <Method void refreshRoutes()>
		setMediaSession(mRouter.getMediaSessionToken());
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #135 <Field MediaRouter mRouter>
	//   18   34:invokevirtual   #155 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaRouter.getMediaSessionToken()>
	//   19   37:invokespecial   #159 <Method void setMediaSession(android.support.v4.media.session.MediaSessionCompat$Token)>
	//   20   40:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #303 <Method void AppCompatDialog.onCreate(Bundle)>
		setContentView(android.support.v7.mediarouter.R.layout.mr_cast_dialog);
	//    3    5:aload_0         
	//    4    6:getstatic       #308 <Field int android.support.v7.mediarouter.R$layout.mr_cast_dialog>
	//    5    9:invokevirtual   #311 <Method void setContentView(int)>
		mCloseButton = (ImageButton)findViewById(android.support.v7.mediarouter.R.id.mr_cast_close_button);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getstatic       #316 <Field int android.support.v7.mediarouter.R$id.mr_cast_close_button>
	//    9   17:invokevirtual   #320 <Method View findViewById(int)>
	//   10   20:checkcast       #322 <Class ImageButton>
	//   11   23:putfield        #324 <Field ImageButton mCloseButton>
		mCloseButton.setOnClickListener(((android.view.View.OnClickListener) (new _cls2())));
	//   12   26:aload_0         
	//   13   27:getfield        #324 <Field ImageButton mCloseButton>
	//   14   30:new             #326 <Class MediaRouteCastDialog$2>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokespecial   #327 <Method void MediaRouteCastDialog$2(MediaRouteCastDialog)>
	//   18   38:invokevirtual   #331 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		mStopCastingButton = (Button)findViewById(android.support.v7.mediarouter.R.id.mr_cast_stop_button);
	//   19   41:aload_0         
	//   20   42:aload_0         
	//   21   43:getstatic       #334 <Field int android.support.v7.mediarouter.R$id.mr_cast_stop_button>
	//   22   46:invokevirtual   #320 <Method View findViewById(int)>
	//   23   49:checkcast       #336 <Class Button>
	//   24   52:putfield        #338 <Field Button mStopCastingButton>
		mStopCastingButton.setOnClickListener(((android.view.View.OnClickListener) (new _cls3())));
	//   25   55:aload_0         
	//   26   56:getfield        #338 <Field Button mStopCastingButton>
	//   27   59:new             #340 <Class MediaRouteCastDialog$3>
	//   28   62:dup             
	//   29   63:aload_0         
	//   30   64:invokespecial   #341 <Method void MediaRouteCastDialog$3(MediaRouteCastDialog)>
	//   31   67:invokevirtual   #342 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		mAdapter = new RecyclerAdapter();
	//   32   70:aload_0         
	//   33   71:new             #344 <Class MediaRouteCastDialog$RecyclerAdapter>
	//   34   74:dup             
	//   35   75:aload_0         
	//   36   76:invokespecial   #345 <Method void MediaRouteCastDialog$RecyclerAdapter(MediaRouteCastDialog)>
	//   37   79:putfield        #347 <Field MediaRouteCastDialog$RecyclerAdapter mAdapter>
		mRecyclerView = (RecyclerView)findViewById(android.support.v7.mediarouter.R.id.mr_cast_list);
	//   38   82:aload_0         
	//   39   83:aload_0         
	//   40   84:getstatic       #350 <Field int android.support.v7.mediarouter.R$id.mr_cast_list>
	//   41   87:invokevirtual   #320 <Method View findViewById(int)>
	//   42   90:checkcast       #352 <Class RecyclerView>
	//   43   93:putfield        #354 <Field RecyclerView mRecyclerView>
		mRecyclerView.setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (mAdapter)));
	//   44   96:aload_0         
	//   45   97:getfield        #354 <Field RecyclerView mRecyclerView>
	//   46  100:aload_0         
	//   47  101:getfield        #347 <Field MediaRouteCastDialog$RecyclerAdapter mAdapter>
	//   48  104:invokevirtual   #358 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
		mRecyclerView.setLayoutManager(((android.support.v7.widget.RecyclerView.LayoutManager) (new LinearLayoutManager(mContext))));
	//   49  107:aload_0         
	//   50  108:getfield        #354 <Field RecyclerView mRecyclerView>
	//   51  111:new             #360 <Class LinearLayoutManager>
	//   52  114:dup             
	//   53  115:aload_0         
	//   54  116:getfield        #127 <Field Context mContext>
	//   55  119:invokespecial   #362 <Method void LinearLayoutManager(Context)>
	//   56  122:invokevirtual   #366 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$LayoutManager)>
		mVolumeChangeListener = new VolumeChangeListener();
	//   57  125:aload_0         
	//   58  126:new             #368 <Class MediaRouteCastDialog$VolumeChangeListener>
	//   59  129:dup             
	//   60  130:aload_0         
	//   61  131:invokespecial   #369 <Method void MediaRouteCastDialog$VolumeChangeListener(MediaRouteCastDialog)>
	//   62  134:putfield        #371 <Field MediaRouteCastDialog$VolumeChangeListener mVolumeChangeListener>
		mVolumeSliderColor = MediaRouterThemeHelper.getControllerColor(mContext, 0);
	//   63  137:aload_0         
	//   64  138:aload_0         
	//   65  139:getfield        #127 <Field Context mContext>
	//   66  142:iconst_0        
	//   67  143:invokestatic    #375 <Method int MediaRouterThemeHelper.getControllerColor(Context, int)>
	//   68  146:putfield        #377 <Field int mVolumeSliderColor>
		mMetadataLayout = (RelativeLayout)findViewById(android.support.v7.mediarouter.R.id.mr_cast_meta);
	//   69  149:aload_0         
	//   70  150:aload_0         
	//   71  151:getstatic       #380 <Field int android.support.v7.mediarouter.R$id.mr_cast_meta>
	//   72  154:invokevirtual   #320 <Method View findViewById(int)>
	//   73  157:checkcast       #382 <Class RelativeLayout>
	//   74  160:putfield        #384 <Field RelativeLayout mMetadataLayout>
		mArtView = (ImageView)findViewById(android.support.v7.mediarouter.R.id.mr_cast_meta_art);
	//   75  163:aload_0         
	//   76  164:aload_0         
	//   77  165:getstatic       #387 <Field int android.support.v7.mediarouter.R$id.mr_cast_meta_art>
	//   78  168:invokevirtual   #320 <Method View findViewById(int)>
	//   79  171:checkcast       #280 <Class ImageView>
	//   80  174:putfield        #278 <Field ImageView mArtView>
		mTitleView = (TextView)findViewById(android.support.v7.mediarouter.R.id.mr_cast_meta_title);
	//   81  177:aload_0         
	//   82  178:aload_0         
	//   83  179:getstatic       #390 <Field int android.support.v7.mediarouter.R$id.mr_cast_meta_title>
	//   84  182:invokevirtual   #320 <Method View findViewById(int)>
	//   85  185:checkcast       #255 <Class TextView>
	//   86  188:putfield        #253 <Field TextView mTitleView>
		mSubtitleView = (TextView)findViewById(android.support.v7.mediarouter.R.id.mr_cast_meta_subtitle);
	//   87  191:aload_0         
	//   88  192:aload_0         
	//   89  193:getstatic       #393 <Field int android.support.v7.mediarouter.R$id.mr_cast_meta_subtitle>
	//   90  196:invokevirtual   #320 <Method View findViewById(int)>
	//   91  199:checkcast       #255 <Class TextView>
	//   92  202:putfield        #263 <Field TextView mSubtitleView>
		mTitlePlaceholder = mContext.getResources().getString(android.support.v7.mediarouter.R.string.mr_cast_dialog_title_view_placeholder);
	//   93  205:aload_0         
	//   94  206:aload_0         
	//   95  207:getfield        #127 <Field Context mContext>
	//   96  210:invokevirtual   #399 <Method Resources Context.getResources()>
	//   97  213:getstatic       #404 <Field int android.support.v7.mediarouter.R$string.mr_cast_dialog_title_view_placeholder>
	//   98  216:invokevirtual   #410 <Method String Resources.getString(int)>
	//   99  219:putfield        #261 <Field String mTitlePlaceholder>
		mCreated = true;
	//  100  222:aload_0         
	//  101  223:iconst_1        
	//  102  224:putfield        #412 <Field boolean mCreated>
		updateLayout();
	//  103  227:aload_0         
	//  104  228:invokevirtual   #415 <Method void updateLayout()>
	//  105  231:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #418 <Method void AppCompatDialog.onDetachedFromWindow()>
		mAttachedToWindow = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #212 <Field boolean mAttachedToWindow>
		mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//    5    9:aload_0         
	//    6   10:getfield        #135 <Field MediaRouter mRouter>
	//    7   13:aload_0         
	//    8   14:getfield        #140 <Field MediaRouteCastDialog$MediaRouterCallback mCallback>
	//    9   17:invokevirtual   #422 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
		mHandler.removeMessages(1);
	//   10   20:aload_0         
	//   11   21:getfield        #121 <Field Handler mHandler>
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #427 <Method void Handler.removeMessages(int)>
		setMediaSession(((android.support.v4.media.session.MediaSessionCompat.Token) (null)));
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:invokespecial   #159 <Method void setMediaSession(android.support.v4.media.session.MediaSessionCompat$Token)>
	//   17   33:return          
	}

	public boolean onFilterRoute(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		return !routeinfo.isDefaultOrBluetooth() && routeinfo.isEnabled() && routeinfo.matchesSelector(mSelector);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #434 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isDefaultOrBluetooth()>
	//    2    4:ifne            27
	//    3    7:aload_1         
	//    4    8:invokevirtual   #437 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isEnabled()>
	//    5   11:ifeq            27
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:getfield        #108 <Field MediaRouteSelector mSelector>
	//    9   19:invokevirtual   #441 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.matchesSelector(MediaRouteSelector)>
	//   10   22:ifeq            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public void onFilterRoutes(List list)
	{
		for(int i = list.size() - 1; i >= 0; i--)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #448 <Method int List.size()>
	//*   2    6:iconst_1        
	//*   3    7:isub            
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:iflt            45
			if(!onFilterRoute((android.support.v7.media.MediaRouter.RouteInfo)list.get(i)))
	//*   7   13:aload_0         
	//*   8   14:aload_1         
	//*   9   15:iload_2         
	//*  10   16:invokeinterface #452 <Method Object List.get(int)>
	//*  11   21:checkcast       #431 <Class android.support.v7.media.MediaRouter$RouteInfo>
	//*  12   24:invokevirtual   #454 <Method boolean onFilterRoute(android.support.v7.media.MediaRouter$RouteInfo)>
	//*  13   27:ifne            38
				list.remove(i);
	//   14   30:aload_1         
	//   15   31:iload_2         
	//   16   32:invokeinterface #457 <Method Object List.remove(int)>
	//   17   37:pop             

	//   18   38:iload_2         
	//   19   39:iconst_1        
	//   20   40:isub            
	//   21   41:istore_2        
	//*  22   42:goto            9
	//   23   45:return          
	}

	public void refreshRoutes()
	{
		if(mAttachedToWindow)
	//*   0    0:aload_0         
	//*   1    1:getfield        #212 <Field boolean mAttachedToWindow>
	//*   2    4:ifeq            87
		{
			ArrayList arraylist = new ArrayList(((java.util.Collection) (mRouter.getRoutes())));
	//    3    7:new             #110 <Class ArrayList>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #135 <Field MediaRouter mRouter>
	//    7   15:invokevirtual   #461 <Method List MediaRouter.getRoutes()>
	//    8   18:invokespecial   #464 <Method void ArrayList(java.util.Collection)>
	//    9   21:astore_1        
			onFilterRoutes(((List) (arraylist)));
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #466 <Method void onFilterRoutes(List)>
			Collections.sort(((List) (arraylist)), ((java.util.Comparator) (MediaRouteChooserDialog.RouteComparator.sInstance)));
	//   13   27:aload_1         
	//   14   28:getstatic       #472 <Field MediaRouteChooserDialog$RouteComparator MediaRouteChooserDialog$RouteComparator.sInstance>
	//   15   31:invokestatic    #478 <Method void Collections.sort(List, java.util.Comparator)>
			if(SystemClock.uptimeMillis() - mLastUpdateTime >= 300L)
	//*  16   34:invokestatic    #484 <Method long SystemClock.uptimeMillis()>
	//*  17   37:aload_0         
	//*  18   38:getfield        #486 <Field long mLastUpdateTime>
	//*  19   41:lsub            
	//*  20   42:ldc2w           #15  <Long 300L>
	//*  21   45:lcmp            
	//*  22   46:iflt            55
			{
				updateRoutes(((List) (arraylist)));
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokevirtual   #489 <Method void updateRoutes(List)>
				return;
	//   26   54:return          
			}
			mHandler.removeMessages(1);
	//   27   55:aload_0         
	//   28   56:getfield        #121 <Field Handler mHandler>
	//   29   59:iconst_1        
	//   30   60:invokevirtual   #427 <Method void Handler.removeMessages(int)>
			Handler handler = mHandler;
	//   31   63:aload_0         
	//   32   64:getfield        #121 <Field Handler mHandler>
	//   33   67:astore_2        
			handler.sendMessageAtTime(handler.obtainMessage(1, ((Object) (arraylist))), mLastUpdateTime + 300L);
	//   34   68:aload_2         
	//   35   69:aload_2         
	//   36   70:iconst_1        
	//   37   71:aload_1         
	//   38   72:invokevirtual   #493 <Method Message Handler.obtainMessage(int, Object)>
	//   39   75:aload_0         
	//   40   76:getfield        #486 <Field long mLastUpdateTime>
	//   41   79:ldc2w           #15  <Long 300L>
	//   42   82:ladd            
	//   43   83:invokevirtual   #497 <Method boolean Handler.sendMessageAtTime(Message, long)>
	//   44   86:pop             
		}
	//   45   87:return          
	}

	public void setRouteSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          56
		{
			if(!mSelector.equals(((Object) (mediarouteselector))))
	//*   2    4:aload_0         
	//*   3    5:getfield        #108 <Field MediaRouteSelector mSelector>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #503 <Method boolean MediaRouteSelector.equals(Object)>
	//*   6   12:ifne            55
			{
				mSelector = mediarouteselector;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #108 <Field MediaRouteSelector mSelector>
				if(mAttachedToWindow)
	//*  10   20:aload_0         
	//*  11   21:getfield        #212 <Field boolean mAttachedToWindow>
	//*  12   24:ifeq            51
				{
					mRouter.removeCallback(((android.support.v7.media.MediaRouter.Callback) (mCallback)));
	//   13   27:aload_0         
	//   14   28:getfield        #135 <Field MediaRouter mRouter>
	//   15   31:aload_0         
	//   16   32:getfield        #140 <Field MediaRouteCastDialog$MediaRouterCallback mCallback>
	//   17   35:invokevirtual   #422 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
					mRouter.addCallback(mediarouteselector, ((android.support.v7.media.MediaRouter.Callback) (mCallback)), 1);
	//   18   38:aload_0         
	//   19   39:getfield        #135 <Field MediaRouter mRouter>
	//   20   42:aload_1         
	//   21   43:aload_0         
	//   22   44:getfield        #140 <Field MediaRouteCastDialog$MediaRouterCallback mCallback>
	//   23   47:iconst_1        
	//   24   48:invokevirtual   #296 <Method void MediaRouter.addCallback(MediaRouteSelector, android.support.v7.media.MediaRouter$Callback, int)>
				}
				refreshRoutes();
	//   25   51:aload_0         
	//   26   52:invokevirtual   #299 <Method void refreshRoutes()>
			}
			return;
	//   27   55:return          
		} else
		{
			throw new IllegalArgumentException("selector must not be null");
	//   28   56:new             #505 <Class IllegalArgumentException>
	//   29   59:dup             
	//   30   60:ldc2            #507 <String "selector must not be null">
	//   31   63:invokespecial   #510 <Method void IllegalArgumentException(String)>
	//   32   66:athrow          
		}
	}

	void update()
	{
		if(mRoute.isSelected() && !mRoute.isDefaultOrBluetooth())
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//*   2    4:invokevirtual   #513 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isSelected()>
	//*   3    7:ifeq            164
	//*   4   10:aload_0         
	//*   5   11:getfield        #146 <Field android.support.v7.media.MediaRouter$RouteInfo mRoute>
	//*   6   14:invokevirtual   #434 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isDefaultOrBluetooth()>
	//*   7   17:ifeq            23
	//*   8   20:goto            164
		{
			if(!mCreated)
	//*   9   23:aload_0         
	//*  10   24:getfield        #412 <Field boolean mCreated>
	//*  11   27:ifne            31
				return;
	//   12   30:return          
			if(mArtIconIsLoaded)
	//*  13   31:aload_0         
	//*  14   32:getfield        #270 <Field boolean mArtIconIsLoaded>
	//*  15   35:ifeq            150
			{
				if(isBitmapRecycled(mArtIconLoadedBitmap))
	//*  16   38:aload_0         
	//*  17   39:getfield        #272 <Field Bitmap mArtIconLoadedBitmap>
	//*  18   42:invokestatic    #515 <Method boolean isBitmapRecycled(Bitmap)>
	//*  19   45:ifeq            95
				{
					mArtView.setVisibility(8);
	//   20   48:aload_0         
	//   21   49:getfield        #278 <Field ImageView mArtView>
	//   22   52:bipush          8
	//   23   54:invokevirtual   #516 <Method void ImageView.setVisibility(int)>
					StringBuilder stringbuilder = new StringBuilder();
	//   24   57:new             #518 <Class StringBuilder>
	//   25   60:dup             
	//   26   61:invokespecial   #519 <Method void StringBuilder()>
	//   27   64:astore_1        
					stringbuilder.append("Can't set artwork image with recycled bitmap: ");
	//   28   65:aload_1         
	//   29   66:ldc2            #521 <String "Can't set artwork image with recycled bitmap: ">
	//   30   69:invokevirtual   #525 <Method StringBuilder StringBuilder.append(String)>
	//   31   72:pop             
					stringbuilder.append(((Object) (mArtIconLoadedBitmap)));
	//   32   73:aload_1         
	//   33   74:aload_0         
	//   34   75:getfield        #272 <Field Bitmap mArtIconLoadedBitmap>
	//   35   78:invokevirtual   #528 <Method StringBuilder StringBuilder.append(Object)>
	//   36   81:pop             
					Log.w("MediaRouteCastDialog", stringbuilder.toString());
	//   37   82:ldc1            #12  <String "MediaRouteCastDialog">
	//   38   84:aload_1         
	//   39   85:invokevirtual   #532 <Method String StringBuilder.toString()>
	//   40   88:invokestatic    #536 <Method int Log.w(String, String)>
	//   41   91:pop             
				} else
	//*  42   92:goto            143
				{
					mArtView.setVisibility(0);
	//   43   95:aload_0         
	//   44   96:getfield        #278 <Field ImageView mArtView>
	//   45   99:iconst_0        
	//   46  100:invokevirtual   #516 <Method void ImageView.setVisibility(int)>
					mArtView.setImageBitmap(mArtIconLoadedBitmap);
	//   47  103:aload_0         
	//   48  104:getfield        #278 <Field ImageView mArtView>
	//   49  107:aload_0         
	//   50  108:getfield        #272 <Field Bitmap mArtIconLoadedBitmap>
	//   51  111:invokevirtual   #540 <Method void ImageView.setImageBitmap(Bitmap)>
					mArtView.setBackgroundColor(mArtIconBackgroundColor);
	//   52  114:aload_0         
	//   53  115:getfield        #278 <Field ImageView mArtView>
	//   54  118:aload_0         
	//   55  119:getfield        #274 <Field int mArtIconBackgroundColor>
	//   56  122:invokevirtual   #543 <Method void ImageView.setBackgroundColor(int)>
					mMetadataLayout.setBackgroundDrawable(((Drawable) (new BitmapDrawable(mArtIconLoadedBitmap))));
	//   57  125:aload_0         
	//   58  126:getfield        #384 <Field RelativeLayout mMetadataLayout>
	//   59  129:new             #545 <Class BitmapDrawable>
	//   60  132:dup             
	//   61  133:aload_0         
	//   62  134:getfield        #272 <Field Bitmap mArtIconLoadedBitmap>
	//   63  137:invokespecial   #547 <Method void BitmapDrawable(Bitmap)>
	//   64  140:invokevirtual   #551 <Method void RelativeLayout.setBackgroundDrawable(Drawable)>
				}
				clearLoadedBitmap();
	//   65  143:aload_0         
	//   66  144:invokevirtual   #553 <Method void clearLoadedBitmap()>
			} else
	//*  67  147:goto            159
			{
				mArtView.setVisibility(8);
	//   68  150:aload_0         
	//   69  151:getfield        #278 <Field ImageView mArtView>
	//   70  154:bipush          8
	//   71  156:invokevirtual   #516 <Method void ImageView.setVisibility(int)>
			}
			updateMetadataLayout();
	//   72  159:aload_0         
	//   73  160:invokespecial   #555 <Method void updateMetadataLayout()>
			return;
	//   74  163:return          
		} else
		{
			dismiss();
	//   75  164:aload_0         
	//   76  165:invokevirtual   #558 <Method void dismiss()>
			return;
	//   77  168:return          
		}
	}

	void updateArtIconIfNeeded()
	{
		if(!isIconChanged())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #560 <Method boolean isIconChanged()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		FetchArtTask fetcharttask = mFetchArtTask;
	//    4    8:aload_0         
	//    5    9:getfield        #182 <Field MediaRouteCastDialog$FetchArtTask mFetchArtTask>
	//    6   12:astore_1        
		if(fetcharttask != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          23
			fetcharttask.cancel(true);
	//    9   17:aload_1         
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #564 <Method boolean MediaRouteCastDialog$FetchArtTask.cancel(boolean)>
	//   12   22:pop             
		mFetchArtTask = new FetchArtTask();
	//   13   23:aload_0         
	//   14   24:new             #186 <Class MediaRouteCastDialog$FetchArtTask>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:invokespecial   #565 <Method void MediaRouteCastDialog$FetchArtTask(MediaRouteCastDialog)>
	//   18   32:putfield        #182 <Field MediaRouteCastDialog$FetchArtTask mFetchArtTask>
		mFetchArtTask.execute(((Object []) (new Void[0])));
	//   19   35:aload_0         
	//   20   36:getfield        #182 <Field MediaRouteCastDialog$FetchArtTask mFetchArtTask>
	//   21   39:iconst_0        
	//   22   40:anewarray       Void[]
	//   23   43:invokevirtual   #571 <Method AsyncTask MediaRouteCastDialog$FetchArtTask.execute(Object[])>
	//   24   46:pop             
	//   25   47:return          
	}

	void updateLayout()
	{
		getWindow().setLayout(-1, -1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #575 <Method Window getWindow()>
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #581 <Method void Window.setLayout(int, int)>
		mArtIconBitmap = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #184 <Field Bitmap mArtIconBitmap>
		mArtIconUri = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #191 <Field Uri mArtIconUri>
		updateArtIconIfNeeded();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #236 <Method void updateArtIconIfNeeded()>
		update();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #239 <Method void update()>
	//   15   27:return          
	}

	void updateRoutes(List list)
	{
		mLastUpdateTime = SystemClock.uptimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #484 <Method long SystemClock.uptimeMillis()>
	//    2    4:putfield        #486 <Field long mLastUpdateTime>
		mRoutes.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #114 <Field List mRoutes>
	//    5   11:invokeinterface #584 <Method void List.clear()>
		mRoutes.addAll(((java.util.Collection) (list)));
	//    6   16:aload_0         
	//    7   17:getfield        #114 <Field List mRoutes>
	//    8   20:aload_1         
	//    9   21:invokeinterface #588 <Method boolean List.addAll(java.util.Collection)>
	//   10   26:pop             
		mAdapter.setItems();
	//   11   27:aload_0         
	//   12   28:getfield        #347 <Field MediaRouteCastDialog$RecyclerAdapter mAdapter>
	//   13   31:invokevirtual   #591 <Method void MediaRouteCastDialog$RecyclerAdapter.setItems()>
	//   14   34:return          
	}

	static final int CONNECTION_TIMEOUT_MILLIS;
	static final int MSG_UPDATE_ROUTES = 1;
	static final String TAG = "MediaRouteCastDialog";
	private static final long UPDATE_ROUTES_DELAY_MS = 300L;
	private RecyclerAdapter mAdapter;
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
	MediaDescriptionCompat mDescription;
	FetchArtTask mFetchArtTask;
	private final Handler mHandler;
	private long mLastUpdateTime;
	MediaControllerCompat mMediaController;
	private RelativeLayout mMetadataLayout;
	private RecyclerView mRecyclerView;
	final android.support.v7.media.MediaRouter.RouteInfo mRoute;
	final MediaRouter mRouter;
	final List mRoutes;
	private MediaRouteSelector mSelector;
	private Button mStopCastingButton;
	private TextView mSubtitleView;
	private String mTitlePlaceholder;
	private TextView mTitleView;
	VolumeChangeListener mVolumeChangeListener;
	int mVolumeSliderColor;

	static 
	{
		CONNECTION_TIMEOUT_MILLIS = (int)TimeUnit.SECONDS.toMillis(30L);
	//    0    0:getstatic       #76  <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:ldc2w           #77  <Long 30L>
	//    2    6:invokevirtual   #82  <Method long TimeUnit.toMillis(long)>
	//    3    9:l2i             
	//    4   10:putstatic       #84  <Field int CONNECTION_TIMEOUT_MILLIS>
	//*   5   13:return          
	}

	private class _cls1 extends Handler
	{

		public void handleMessage(Message message)
		{
			if(message.what != 1)
		//*   0    0:aload_1         
		//*   1    1:getfield        #22  <Field int Message.what>
		//*   2    4:iconst_1        
		//*   3    5:icmpeq          9
			{
				return;
		//    4    8:return          
			} else
			{
				updateRoutes((List)message.obj);
		//    5    9:aload_0         
		//    6   10:getfield        #10  <Field MediaRouteCastDialog this$0>
		//    7   13:aload_1         
		//    8   14:getfield        #26  <Field Object Message.obj>
		//    9   17:checkcast       #28  <Class List>
		//   10   20:invokevirtual   #34  <Method void MediaRouteCastDialog.updateRoutes(List)>
				return;
		//   11   23:return          
			}
		}

		final MediaRouteCastDialog this$0;

		_cls1()
		{
			this$0 = MediaRouteCastDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field MediaRouteCastDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void Handler()>
		//    5    9:return          
		}
	}


	private class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
	{

		public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoutes();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteCastDialog this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteCastDialog.refreshRoutes()>
		//    3    7:return          
		}

		public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoutes();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteCastDialog this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteCastDialog.refreshRoutes()>
			update();
		//    3    7:aload_0         
		//    4    8:getfield        #10  <Field MediaRouteCastDialog this$0>
		//    5   11:invokevirtual   #25  <Method void MediaRouteCastDialog.update()>
		//    6   14:return          
		}

		public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			refreshRoutes();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteCastDialog this$0>
		//    2    4:invokevirtual   #21  <Method void MediaRouteCastDialog.refreshRoutes()>
		//    3    7:return          
		}

		public void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			update();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteCastDialog this$0>
		//    2    4:invokevirtual   #25  <Method void MediaRouteCastDialog.update()>
		//    3    7:return          
		}

		public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			update();
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteCastDialog this$0>
		//    2    4:invokevirtual   #25  <Method void MediaRouteCastDialog.update()>
		//    3    7:return          
		}

		final MediaRouteCastDialog this$0;

		MediaRouterCallback()
		{
			this$0 = MediaRouteCastDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field MediaRouteCastDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void android.support.v7.media.MediaRouter$Callback()>
		//    5    9:return          
		}
	}


	private class MediaControllerCallback extends i
	{

		public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
		{
			MediaRouteCastDialog mediaroutecastdialog = MediaRouteCastDialog.this;
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteCastDialog this$0>
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
			mediaroutecastdialog.mDescription = ((MediaDescriptionCompat) (mediametadatacompat));
		//   11   19:aload_2         
		//   12   20:aload_1         
		//   13   21:putfield        #28  <Field MediaDescriptionCompat MediaRouteCastDialog.mDescription>
			updateArtIconIfNeeded();
		//   14   24:aload_0         
		//   15   25:getfield        #10  <Field MediaRouteCastDialog this$0>
		//   16   28:invokevirtual   #31  <Method void MediaRouteCastDialog.updateArtIconIfNeeded()>
			update();
		//   17   31:aload_0         
		//   18   32:getfield        #10  <Field MediaRouteCastDialog this$0>
		//   19   35:invokevirtual   #34  <Method void MediaRouteCastDialog.update()>
		//   20   38:return          
		}

		public void onSessionDestroyed()
		{
			if(mMediaController != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #10  <Field MediaRouteCastDialog this$0>
		//*   2    4:getfield        #39  <Field MediaControllerCompat MediaRouteCastDialog.mMediaController>
		//*   3    7:ifnull          35
			{
				mMediaController.b(((i) (mControllerCallback)));
		//    4   10:aload_0         
		//    5   11:getfield        #10  <Field MediaRouteCastDialog this$0>
		//    6   14:getfield        #39  <Field MediaControllerCompat MediaRouteCastDialog.mMediaController>
		//    7   17:aload_0         
		//    8   18:getfield        #10  <Field MediaRouteCastDialog this$0>
		//    9   21:getfield        #43  <Field MediaRouteCastDialog$MediaControllerCallback MediaRouteCastDialog.mControllerCallback>
		//   10   24:invokevirtual   #49  <Method void MediaControllerCompat.b(i)>
				mMediaController = null;
		//   11   27:aload_0         
		//   12   28:getfield        #10  <Field MediaRouteCastDialog this$0>
		//   13   31:aconst_null     
		//   14   32:putfield        #39  <Field MediaControllerCompat MediaRouteCastDialog.mMediaController>
			}
		//   15   35:return          
		}

		final MediaRouteCastDialog this$0;

		MediaControllerCallback()
		{
			this$0 = MediaRouteCastDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field MediaRouteCastDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void i()>
		//    5    9:return          
		}
	}


	private class FetchArtTask extends AsyncTask
	{

		private InputStream openInputStreamByScheme(Uri uri)
		{
			String s = uri.getScheme().toLowerCase();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #62  <Method String Uri.getScheme()>
		//    2    4:invokevirtual   #67  <Method String String.toLowerCase()>
		//    3    7:astore_2        
			if(!"android.resource".equals(((Object) (s))) && !"content".equals(((Object) (s))) && !"file".equals(((Object) (s))))
		//*   4    8:ldc1            #69  <String "android.resource">
		//*   5   10:aload_2         
		//*   6   11:invokevirtual   #73  <Method boolean String.equals(Object)>
		//*   7   14:ifne            75
		//*   8   17:ldc1            #75  <String "content">
		//*   9   19:aload_2         
		//*  10   20:invokevirtual   #73  <Method boolean String.equals(Object)>
		//*  11   23:ifne            75
		//*  12   26:ldc1            #77  <String "file">
		//*  13   28:aload_2         
		//*  14   29:invokevirtual   #73  <Method boolean String.equals(Object)>
		//*  15   32:ifeq            38
		//*  16   35:goto            75
			{
				uri = ((Uri) ((new URL(uri.toString())).openConnection()));
		//   17   38:new             #79  <Class URL>
		//   18   41:dup             
		//   19   42:aload_1         
		//   20   43:invokevirtual   #82  <Method String Uri.toString()>
		//   21   46:invokespecial   #85  <Method void URL(String)>
		//   22   49:invokevirtual   #89  <Method URLConnection URL.openConnection()>
		//   23   52:astore_1        
				((URLConnection) (uri)).setConnectTimeout(MediaRouteCastDialog.CONNECTION_TIMEOUT_MILLIS);
		//   24   53:aload_1         
		//   25   54:getstatic       #92  <Field int MediaRouteCastDialog.CONNECTION_TIMEOUT_MILLIS>
		//   26   57:invokevirtual   #98  <Method void URLConnection.setConnectTimeout(int)>
				((URLConnection) (uri)).setReadTimeout(MediaRouteCastDialog.CONNECTION_TIMEOUT_MILLIS);
		//   27   60:aload_1         
		//   28   61:getstatic       #92  <Field int MediaRouteCastDialog.CONNECTION_TIMEOUT_MILLIS>
		//   29   64:invokevirtual   #101 <Method void URLConnection.setReadTimeout(int)>
				uri = ((Uri) (((URLConnection) (uri)).getInputStream()));
		//   30   67:aload_1         
		//   31   68:invokevirtual   #105 <Method InputStream URLConnection.getInputStream()>
		//   32   71:astore_1        
			} else
		//*  33   72:goto            90
			{
				uri = ((Uri) (mContext.getContentResolver().openInputStream(uri)));
		//   34   75:aload_0         
		//   35   76:getfield        #16  <Field MediaRouteCastDialog this$0>
		//   36   79:getfield        #109 <Field Context MediaRouteCastDialog.mContext>
		//   37   82:invokevirtual   #115 <Method ContentResolver Context.getContentResolver()>
		//   38   85:aload_1         
		//   39   86:invokevirtual   #120 <Method InputStream ContentResolver.openInputStream(Uri)>
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
		//   45   96:new             #122 <Class BufferedInputStream>
		//   46   99:dup             
		//   47  100:aload_1         
		//   48  101:invokespecial   #125 <Method void BufferedInputStream(InputStream)>
		//   49  104:areturn         
		}

		protected transient Bitmap doInBackground(Void avoid[])
		{
			int i;
			avoid = ((Void []) (mIconBitmap));
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field Bitmap mIconBitmap>
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
		//    9   15:getfield        #53  <Field Uri mIconUri>
		//   10   18:astore_1        
			if(avoid == null) goto _L4; else goto _L3
		//   11   19:aload_1         
		//   12   20:ifnull          561
_L3:
			Object obj1 = ((Object) (openInputStreamByScheme(((Uri) (avoid)))));
		//   13   23:aload_0         
		//   14   24:aload_1         
		//   15   25:invokespecial   #131 <Method InputStream openInputStreamByScheme(Uri)>
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
		//   23   42:new             #133 <Class StringBuilder>
		//   24   45:dup             
		//   25   46:invokespecial   #134 <Method void StringBuilder()>
		//   26   49:astore          7
			obj = obj1;
		//   27   51:aload           6
		//   28   53:astore          5
			avoid = ((Void []) (obj1));
		//   29   55:aload           6
		//   30   57:astore_1        
			stringbuilder.append("Unable to open: ");
		//   31   58:aload           7
		//   32   60:ldc1            #136 <String "Unable to open: ">
		//   33   62:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
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
		//   41   76:getfield        #53  <Field Uri mIconUri>
		//   42   79:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//   43   82:pop             
			obj = obj1;
		//   44   83:aload           6
		//   45   85:astore          5
			avoid = ((Void []) (obj1));
		//   46   87:aload           6
		//   47   89:astore_1        
			Log.w("MediaRouteCastDialog", stringbuilder.toString());
		//   48   90:ldc1            #37  <String "MediaRouteCastDialog">
		//   49   92:aload           7
		//   50   94:invokevirtual   #144 <Method String StringBuilder.toString()>
		//   51   97:invokestatic    #45  <Method int Log.w(String, String)>
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
		//   56  108:invokevirtual   #149 <Method void InputStream.close()>
				}
		//*  57  111:aconst_null     
		//*  58  112:areturn         
		//*  59  113:aload           6
		//*  60  115:astore          5
		//*  61  117:aload           6
		//*  62  119:astore_1        
		//*  63  120:new             #151 <Class android.graphics.BitmapFactory$Options>
		//*  64  123:dup             
		//*  65  124:invokespecial   #152 <Method void android.graphics.BitmapFactory$Options()>
		//*  66  127:astore          8
		//*  67  129:aload           6
		//*  68  131:astore          5
		//*  69  133:aload           6
		//*  70  135:astore_1        
		//*  71  136:aload           8
		//*  72  138:iconst_1        
		//*  73  139:putfield        #156 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		//*  74  142:aload           6
		//*  75  144:astore          5
		//*  76  146:aload           6
		//*  77  148:astore_1        
		//*  78  149:aload           6
		//*  79  151:aconst_null     
		//*  80  152:aload           8
		//*  81  154:invokestatic    #162 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
		//*  82  157:pop             
		//*  83  158:aload           6
		//*  84  160:astore          5
		//*  85  162:aload           6
		//*  86  164:astore_1        
		//*  87  165:aload           8
		//*  88  167:getfield        #165 <Field int android.graphics.BitmapFactory$Options.outWidth>
		//*  89  170:ifeq            447
		//*  90  173:aload           6
		//*  91  175:astore          5
		//*  92  177:aload           6
		//*  93  179:astore_1        
		//*  94  180:aload           8
		//*  95  182:getfield        #168 <Field int android.graphics.BitmapFactory$Options.outHeight>
		//*  96  185:istore_3        
		//*  97  186:iload_3         
		//*  98  187:ifne            193
		//*  99  190:goto            447
		//* 100  193:aload           6
		//* 101  195:astore_1        
		//* 102  196:aload           6
		//* 103  198:invokevirtual   #171 <Method void InputStream.reset()>
		//* 104  201:goto            320
		//* 105  204:aload           6
		//* 106  206:astore          5
		//* 107  208:aload           6
		//* 108  210:astore_1        
		//* 109  211:aload           6
		//* 110  213:invokevirtual   #149 <Method void InputStream.close()>
		//* 111  216:aload           6
		//* 112  218:astore          5
		//* 113  220:aload           6
		//* 114  222:astore_1        
		//* 115  223:aload_0         
		//* 116  224:aload_0         
		//* 117  225:getfield        #53  <Field Uri mIconUri>
		//* 118  228:invokespecial   #131 <Method InputStream openInputStreamByScheme(Uri)>
		//* 119  231:astore          7
		//* 120  233:aload           7
		//* 121  235:astore          6
		//* 122  237:aload           7
		//* 123  239:ifnonnull       320
		//* 124  242:aload           7
		//* 125  244:astore          5
		//* 126  246:aload           7
		//* 127  248:astore_1        
		//* 128  249:new             #133 <Class StringBuilder>
		//* 129  252:dup             
		//* 130  253:invokespecial   #134 <Method void StringBuilder()>
		//* 131  256:astore          6
		//* 132  258:aload           7
		//* 133  260:astore          5
		//* 134  262:aload           7
		//* 135  264:astore_1        
		//* 136  265:aload           6
		//* 137  267:ldc1            #136 <String "Unable to open: ">
		//* 138  269:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
		//* 139  272:pop             
		//* 140  273:aload           7
		//* 141  275:astore          5
		//* 142  277:aload           7
		//* 143  279:astore_1        
		//* 144  280:aload           6
		//* 145  282:aload_0         
		//* 146  283:getfield        #53  <Field Uri mIconUri>
		//* 147  286:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//* 148  289:pop             
		//* 149  290:aload           7
		//* 150  292:astore          5
		//* 151  294:aload           7
		//* 152  296:astore_1        
		//* 153  297:ldc1            #37  <String "MediaRouteCastDialog">
		//* 154  299:aload           6
		//* 155  301:invokevirtual   #144 <Method String StringBuilder.toString()>
		//* 156  304:invokestatic    #45  <Method int Log.w(String, String)>
		//* 157  307:pop             
		//* 158  308:aload           7
		//* 159  310:ifnull          318
		//* 160  313:aload           7
		//* 161  315:invokevirtual   #149 <Method void InputStream.close()>
		//* 162  318:aconst_null     
		//* 163  319:areturn         
		//* 164  320:aload           6
		//* 165  322:astore          5
		//* 166  324:aload           6
		//* 167  326:astore_1        
		//* 168  327:aload           8
		//* 169  329:iconst_0        
		//* 170  330:putfield        #156 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		//* 171  333:aload           6
		//* 172  335:astore          5
		//* 173  337:aload           6
		//* 174  339:astore_1        
		//* 175  340:aload_0         
		//* 176  341:getfield        #16  <Field MediaRouteCastDialog this$0>
		//* 177  344:aload           8
		//* 178  346:getfield        #165 <Field int android.graphics.BitmapFactory$Options.outWidth>
		//* 179  349:aload           8
		//* 180  351:getfield        #168 <Field int android.graphics.BitmapFactory$Options.outHeight>
		//* 181  354:invokevirtual   #175 <Method int MediaRouteCastDialog.getDesiredArtHeight(int, int)>
		//* 182  357:istore_3        
		//* 183  358:aload           6
		//* 184  360:astore          5
		//* 185  362:aload           6
		//* 186  364:astore_1        
		//* 187  365:aload           8
		//* 188  367:iconst_1        
		//* 189  368:aload           8
		//* 190  370:getfield        #168 <Field int android.graphics.BitmapFactory$Options.outHeight>
		//* 191  373:iload_3         
		//* 192  374:idiv            
		//* 193  375:invokestatic    #181 <Method int Integer.highestOneBit(int)>
		//* 194  378:invokestatic    #186 <Method int Math.max(int, int)>
		//* 195  381:putfield        #189 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		//* 196  384:aload           6
		//* 197  386:astore          5
		//* 198  388:aload           6
		//* 199  390:astore_1        
		//* 200  391:aload_0         
		//* 201  392:invokevirtual   #193 <Method boolean isCancelled()>
		//* 202  395:istore          4
		//* 203  397:iload           4
		//* 204  399:ifeq            414
		//* 205  402:aload           6
		//* 206  404:ifnull          412
		//* 207  407:aload           6
		//* 208  409:invokevirtual   #149 <Method void InputStream.close()>
		//* 209  412:aconst_null     
		//* 210  413:areturn         
		//* 211  414:aload           6
		//* 212  416:astore          5
		//* 213  418:aload           6
		//* 214  420:astore_1        
		//* 215  421:aload           6
		//* 216  423:aconst_null     
		//* 217  424:aload           8
		//* 218  426:invokestatic    #162 <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
		//* 219  429:astore          7
		//* 220  431:aload           6
		//* 221  433:ifnull          441
		//* 222  436:aload           6
		//* 223  438:invokevirtual   #149 <Method void InputStream.close()>
		//* 224  441:aload           7
		//* 225  443:astore_1        
		//* 226  444:goto            563
		//* 227  447:aload           6
		//* 228  449:ifnull          457
		//* 229  452:aload           6
		//* 230  454:invokevirtual   #149 <Method void InputStream.close()>
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
		//* 244  479:new             #133 <Class StringBuilder>
		//* 245  482:dup             
		//* 246  483:invokespecial   #134 <Method void StringBuilder()>
		//* 247  486:astore          7
		//* 248  488:aload           5
		//* 249  490:astore_1        
		//* 250  491:aload           7
		//* 251  493:ldc1            #136 <String "Unable to open: ">
		//* 252  495:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
		//* 253  498:pop             
		//* 254  499:aload           5
		//* 255  501:astore_1        
		//* 256  502:aload           7
		//* 257  504:aload_0         
		//* 258  505:getfield        #53  <Field Uri mIconUri>
		//* 259  508:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//* 260  511:pop             
		//* 261  512:aload           5
		//* 262  514:astore_1        
		//* 263  515:ldc1            #37  <String "MediaRouteCastDialog">
		//* 264  517:aload           7
		//* 265  519:invokevirtual   #144 <Method String StringBuilder.toString()>
		//* 266  522:aload           6
		//* 267  524:invokestatic    #196 <Method int Log.w(String, String, Throwable)>
		//* 268  527:pop             
		//* 269  528:aload           5
		//* 270  530:ifnull          561
		//* 271  533:aload           5
		//* 272  535:invokevirtual   #149 <Method void InputStream.close()>
		//* 273  538:goto            561
		//* 274  541:astore          6
		//* 275  543:aload_1         
		//* 276  544:astore          5
		//* 277  546:aload           6
		//* 278  548:astore_1        
		//* 279  549:aload           5
		//* 280  551:ifnull          559
		//* 281  554:aload           5
		//* 282  556:invokevirtual   #149 <Method void InputStream.close()>
		//* 283  559:aload_1         
		//* 284  560:athrow          
		//* 285  561:aconst_null     
		//* 286  562:astore_1        
		//* 287  563:aload_1         
		//* 288  564:invokestatic    #35  <Method boolean MediaRouteCastDialog.isBitmapRecycled(Bitmap)>
		//* 289  567:ifeq            607
		//* 290  570:new             #133 <Class StringBuilder>
		//* 291  573:dup             
		//* 292  574:invokespecial   #134 <Method void StringBuilder()>
		//* 293  577:astore          5
		//* 294  579:aload           5
		//* 295  581:ldc1            #198 <String "Can't use recycled bitmap: ">
		//* 296  583:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
		//* 297  586:pop             
		//* 298  587:aload           5
		//* 299  589:aload_1         
		//* 300  590:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
		//* 301  593:pop             
		//* 302  594:ldc1            #37  <String "MediaRouteCastDialog">
		//* 303  596:aload           5
		//* 304  598:invokevirtual   #144 <Method String StringBuilder.toString()>
		//* 305  601:invokestatic    #45  <Method int Log.w(String, String)>
		//* 306  604:pop             
		//* 307  605:aconst_null     
		//* 308  606:areturn         
		//* 309  607:aload_1         
		//* 310  608:ifnull          678
		//* 311  611:aload_1         
		//* 312  612:invokevirtual   #204 <Method int Bitmap.getWidth()>
		//* 313  615:aload_1         
		//* 314  616:invokevirtual   #207 <Method int Bitmap.getHeight()>
		//* 315  619:icmpge          678
		//* 316  622:new             #209 <Class android.support.v7.graphics.Palette$Builder>
		//* 317  625:dup             
		//* 318  626:aload_1         
		//* 319  627:invokespecial   #212 <Method void android.support.v7.graphics.Palette$Builder(Bitmap)>
		//* 320  630:iconst_1        
		//* 321  631:invokevirtual   #216 <Method android.support.v7.graphics.Palette$Builder android.support.v7.graphics.Palette$Builder.maximumColorCount(int)>
		//* 322  634:invokevirtual   #220 <Method Palette android.support.v7.graphics.Palette$Builder.generate()>
		//* 323  637:astore          5
		//* 324  639:aload           5
		//* 325  641:invokevirtual   #226 <Method List Palette.getSwatches()>
		//* 326  644:invokeinterface #231 <Method boolean List.isEmpty()>
		//* 327  649:ifeq            655
		//* 328  652:goto            673
		//* 329  655:aload           5
		//* 330  657:invokevirtual   #226 <Method List Palette.getSwatches()>
		//* 331  660:iconst_0        
		//* 332  661:invokeinterface #235 <Method Object List.get(int)>
		//* 333  666:checkcast       #237 <Class android.support.v7.graphics.Palette$Swatch>
		//* 334  669:invokevirtual   #240 <Method int android.support.v7.graphics.Palette$Swatch.getRgb()>
		//* 335  672:istore_2        
		//* 336  673:aload_0         
		//* 337  674:iload_2         
		//* 338  675:putfield        #242 <Field int mBackgroundColor>
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
			BitmapFactory.decodeStream(((InputStream) (obj1)), ((android.graphics.Rect) (null)), options);
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
			Log.w("MediaRouteCastDialog", ((StringBuilder) (obj1)).toString());
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
			obj3 = ((Object) (BitmapFactory.decodeStream(((InputStream) (obj1)), ((android.graphics.Rect) (null)), options)));
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
			Log.w("MediaRouteCastDialog", ((StringBuilder) (obj3)).toString(), ((Throwable) (obj2)));
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
			if(MediaRouteCastDialog.isBitmapRecycled(((Bitmap) (avoid))))
			{
				obj = ((Object) (new StringBuilder()));
				((StringBuilder) (obj)).append("Can't use recycled bitmap: ");
				((StringBuilder) (obj)).append(((Object) (avoid)));
				Log.w("MediaRouteCastDialog", ((StringBuilder) (obj)).toString());
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
		//    2    2:checkcast       #245 <Class Void[]>
		//    3    5:invokevirtual   #247 <Method Bitmap doInBackground(Void[])>
		//    4    8:areturn         
		}

		public Bitmap getIconBitmap()
		{
			return mIconBitmap;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field Bitmap mIconBitmap>
		//    2    4:areturn         
		}

		public Uri getIconUri()
		{
			return mIconUri;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field Uri mIconUri>
		//    2    4:areturn         
		}

		protected void onPostExecute(Bitmap bitmap)
		{
			MediaRouteCastDialog mediaroutecastdialog = MediaRouteCastDialog.this;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaRouteCastDialog this$0>
		//    2    4:astore_2        
			mediaroutecastdialog.mFetchArtTask = null;
		//    3    5:aload_2         
		//    4    6:aconst_null     
		//    5    7:putfield        #254 <Field MediaRouteCastDialog$FetchArtTask MediaRouteCastDialog.mFetchArtTask>
			if(!p.a(((Object) (mediaroutecastdialog.mArtIconBitmap)), ((Object) (mIconBitmap))) || !p.a(((Object) (mArtIconUri)), ((Object) (mIconUri))))
		//*   6   10:aload_2         
		//*   7   11:getfield        #257 <Field Bitmap MediaRouteCastDialog.mArtIconBitmap>
		//*   8   14:aload_0         
		//*   9   15:getfield        #47  <Field Bitmap mIconBitmap>
		//*  10   18:invokestatic    #263 <Method boolean p.a(Object, Object)>
		//*  11   21:ifeq            41
		//*  12   24:aload_0         
		//*  13   25:getfield        #16  <Field MediaRouteCastDialog this$0>
		//*  14   28:getfield        #266 <Field Uri MediaRouteCastDialog.mArtIconUri>
		//*  15   31:aload_0         
		//*  16   32:getfield        #53  <Field Uri mIconUri>
		//*  17   35:invokestatic    #263 <Method boolean p.a(Object, Object)>
		//*  18   38:ifne            84
			{
				MediaRouteCastDialog mediaroutecastdialog1 = MediaRouteCastDialog.this;
		//   19   41:aload_0         
		//   20   42:getfield        #16  <Field MediaRouteCastDialog this$0>
		//   21   45:astore_2        
				mediaroutecastdialog1.mArtIconBitmap = mIconBitmap;
		//   22   46:aload_2         
		//   23   47:aload_0         
		//   24   48:getfield        #47  <Field Bitmap mIconBitmap>
		//   25   51:putfield        #257 <Field Bitmap MediaRouteCastDialog.mArtIconBitmap>
				mediaroutecastdialog1.mArtIconLoadedBitmap = bitmap;
		//   26   54:aload_2         
		//   27   55:aload_1         
		//   28   56:putfield        #269 <Field Bitmap MediaRouteCastDialog.mArtIconLoadedBitmap>
				mediaroutecastdialog1.mArtIconUri = mIconUri;
		//   29   59:aload_2         
		//   30   60:aload_0         
		//   31   61:getfield        #53  <Field Uri mIconUri>
		//   32   64:putfield        #266 <Field Uri MediaRouteCastDialog.mArtIconUri>
				mediaroutecastdialog1.mArtIconBackgroundColor = mBackgroundColor;
		//   33   67:aload_2         
		//   34   68:aload_0         
		//   35   69:getfield        #242 <Field int mBackgroundColor>
		//   36   72:putfield        #272 <Field int MediaRouteCastDialog.mArtIconBackgroundColor>
				mediaroutecastdialog1.mArtIconIsLoaded = true;
		//   37   75:aload_2         
		//   38   76:iconst_1        
		//   39   77:putfield        #275 <Field boolean MediaRouteCastDialog.mArtIconIsLoaded>
				mediaroutecastdialog1.update();
		//   40   80:aload_2         
		//   41   81:invokevirtual   #278 <Method void MediaRouteCastDialog.update()>
			}
		//   42   84:return          
		}

		protected volatile void onPostExecute(Object obj)
		{
			onPostExecute((Bitmap)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #200 <Class Bitmap>
		//    3    5:invokevirtual   #281 <Method void onPostExecute(Bitmap)>
		//    4    8:return          
		}

		protected void onPreExecute()
		{
			clearLoadedBitmap();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaRouteCastDialog this$0>
		//    2    4:invokevirtual   #285 <Method void MediaRouteCastDialog.clearLoadedBitmap()>
		//    3    7:return          
		}

		private int mBackgroundColor;
		private final Bitmap mIconBitmap;
		private final Uri mIconUri;
		final MediaRouteCastDialog this$0;

		FetchArtTask()
		{
			this$0 = MediaRouteCastDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MediaRouteCastDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void AsyncTask()>
			Object obj = ((Object) (mDescription));
		//    5    9:aload_1         
		//    6   10:getfield        #25  <Field MediaDescriptionCompat MediaRouteCastDialog.mDescription>
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
		//   16   27:getfield        #25  <Field MediaDescriptionCompat MediaRouteCastDialog.mDescription>
		//   17   30:invokevirtual   #31  <Method Bitmap MediaDescriptionCompat.d()>
		//   18   33:astore_2        
			Bitmap bitmap = ((Bitmap) (obj));
		//   19   34:aload_2         
		//   20   35:astore_3        
			if(MediaRouteCastDialog.isBitmapRecycled(((Bitmap) (obj))))
		//*  21   36:aload_2         
		//*  22   37:invokestatic    #35  <Method boolean MediaRouteCastDialog.isBitmapRecycled(Bitmap)>
		//*  23   40:ifeq            53
			{
				Log.w("MediaRouteCastDialog", "Can't fetch the given art bitmap because it's already recycled.");
		//   24   43:ldc1            #37  <String "MediaRouteCastDialog">
		//   25   45:ldc1            #39  <String "Can't fetch the given art bitmap because it's already recycled.">
		//   26   47:invokestatic    #45  <Method int Log.w(String, String)>
		//   27   50:pop             
				bitmap = null;
		//   28   51:aconst_null     
		//   29   52:astore_3        
			}
			mIconBitmap = bitmap;
		//   30   53:aload_0         
		//   31   54:aload_3         
		//   32   55:putfield        #47  <Field Bitmap mIconBitmap>
			if(mDescription == null)
		//*  33   58:aload_1         
		//*  34   59:getfield        #25  <Field MediaDescriptionCompat MediaRouteCastDialog.mDescription>
		//*  35   62:ifnonnull       71
				mediaroutecastdialog = ((MediaRouteCastDialog) (obj1));
		//   36   65:aload           4
		//   37   67:astore_1        
			else
		//*  38   68:goto            79
				mediaroutecastdialog = ((MediaRouteCastDialog) (mDescription.e()));
		//   39   71:aload_1         
		//   40   72:getfield        #25  <Field MediaDescriptionCompat MediaRouteCastDialog.mDescription>
		//   41   75:invokevirtual   #51  <Method Uri MediaDescriptionCompat.e()>
		//   42   78:astore_1        
			mIconUri = ((Uri) (MediaRouteCastDialog.this));
		//   43   79:aload_0         
		//   44   80:aload_1         
		//   45   81:putfield        #53  <Field Uri mIconUri>
		//   46   84:return          
		}
	}


	private class _cls2
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			dismiss();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field MediaRouteCastDialog this$0>
		//    2    4:invokevirtual   #23  <Method void MediaRouteCastDialog.dismiss()>
		//    3    7:return          
		}

		final MediaRouteCastDialog this$0;

		_cls2()
		{
			this$0 = MediaRouteCastDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteCastDialog this$0>
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
			if(mRoute.isSelected())
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field MediaRouteCastDialog this$0>
		//*   2    4:getfield        #24  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
		//*   3    7:invokevirtual   #30  <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isSelected()>
		//*   4   10:ifeq            24
				mRouter.unselect(2);
		//    5   13:aload_0         
		//    6   14:getfield        #12  <Field MediaRouteCastDialog this$0>
		//    7   17:getfield        #34  <Field MediaRouter MediaRouteCastDialog.mRouter>
		//    8   20:iconst_2        
		//    9   21:invokevirtual   #40  <Method void MediaRouter.unselect(int)>
			dismiss();
		//   10   24:aload_0         
		//   11   25:getfield        #12  <Field MediaRouteCastDialog this$0>
		//   12   28:invokevirtual   #43  <Method void MediaRouteCastDialog.dismiss()>
		//   13   31:return          
		}

		final MediaRouteCastDialog this$0;

		_cls3()
		{
			this$0 = MediaRouteCastDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteCastDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class RecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter
	{

		private Drawable getDefaultIconDrawable(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			switch(routeinfo.getDeviceType())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #95  <Method int android.support.v7.media.MediaRouter$RouteInfo.getDeviceType()>
			{
		//*   2    4:tableswitch     1 2: default 28
		//		               1 45
		//		               2 40
			default:
				if(routeinfo instanceof android.support.v7.media.MediaRouter.RouteGroup)
		//*   3   28:aload_1         
		//*   4   29:instanceof      #97  <Class android.support.v7.media.MediaRouter$RouteGroup>
		//*   5   32:ifeq            50
					return mSpeakerGroupIcon;
		//    6   35:aload_0         
		//    7   36:getfield        #83  <Field Drawable mSpeakerGroupIcon>
		//    8   39:areturn         
				else
		//*   9   40:aload_0         
		//*  10   41:getfield        #78  <Field Drawable mSpeakerIcon>
		//*  11   44:areturn         
		//*  12   45:aload_0         
		//*  13   46:getfield        #73  <Field Drawable mTvIcon>
		//*  14   49:areturn         
					return mDefaultIcon;
		//   15   50:aload_0         
		//   16   51:getfield        #68  <Field Drawable mDefaultIcon>
		//   17   54:areturn         

			case 2: // '\002'
				return mSpeakerIcon;

			case 1: // '\001'
				return mTvIcon;
			}
		}

		Drawable getIconDrawable(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
			Uri uri;
			uri = routeinfo.getIconUri();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #104 <Method Uri android.support.v7.media.MediaRouter$RouteInfo.getIconUri()>
		//    2    4:astore_2        
			if(uri == null)
				break MISSING_BLOCK_LABEL_71;
		//    3    5:aload_2         
		//    4    6:ifnull          71
			Drawable drawable = Drawable.createFromStream(mContext.getContentResolver().openInputStream(uri), ((String) (null)));
		//    5    9:aload_0         
		//    6   10:getfield        #34  <Field MediaRouteCastDialog this$0>
		//    7   13:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
		//    8   16:invokevirtual   #110 <Method ContentResolver Context.getContentResolver()>
		//    9   19:aload_2         
		//   10   20:invokevirtual   #116 <Method InputStream ContentResolver.openInputStream(Uri)>
		//   11   23:aconst_null     
		//   12   24:invokestatic    #122 <Method Drawable Drawable.createFromStream(InputStream, String)>
		//   13   27:astore_3        
			if(drawable != null)
		//*  14   28:aload_3         
		//*  15   29:ifnull          71
				return drawable;
		//   16   32:aload_3         
		//   17   33:areturn         
			break MISSING_BLOCK_LABEL_71;
			IOException ioexception;
			ioexception;
		//   18   34:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//   19   35:new             #124 <Class StringBuilder>
		//   20   38:dup             
		//   21   39:invokespecial   #125 <Method void StringBuilder()>
		//   22   42:astore          4
			stringbuilder.append("Failed to load ");
		//   23   44:aload           4
		//   24   46:ldc1            #127 <String "Failed to load ">
		//   25   48:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
		//   26   51:pop             
			stringbuilder.append(((Object) (uri)));
		//   27   52:aload           4
		//   28   54:aload_2         
		//   29   55:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
		//   30   58:pop             
			Log.w("RecyclerAdapter", stringbuilder.toString(), ((Throwable) (ioexception)));
		//   31   59:ldc1            #17  <String "RecyclerAdapter">
		//   32   61:aload           4
		//   33   63:invokevirtual   #138 <Method String StringBuilder.toString()>
		//   34   66:aload_3         
		//   35   67:invokestatic    #144 <Method int Log.w(String, String, Throwable)>
		//   36   70:pop             
			return getDefaultIconDrawable(routeinfo);
		//   37   71:aload_0         
		//   38   72:aload_1         
		//   39   73:invokespecial   #146 <Method Drawable getDefaultIconDrawable(android.support.v7.media.MediaRouter$RouteInfo)>
		//   40   76:areturn         
		}

		public Item getItem(int i)
		{
			class Item
			{

				public Object getData()
				{
					return mData;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field Object mData>
				//    2    4:areturn         
				}

				public int getType()
				{
					return mType;
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field int mType>
				//    2    4:ireturn         
				}

				private final Object mData;
				private final int mType;
				final RecyclerAdapter this$1;

				Item(Object obj, int i)
				{
					this$1 = RecyclerAdapter.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
					super();
				//    3    5:aload_0         
				//    4    6:invokespecial   #17  <Method void Object()>
					mData = obj;
				//    5    9:aload_0         
				//    6   10:aload_2         
				//    7   11:putfield        #19  <Field Object mData>
					mType = i;
				//    8   14:aload_0         
				//    9   15:iload_3         
				//   10   16:putfield        #21  <Field int mType>
				//   11   19:return          
				}
			}

			return (Item)mItems.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field ArrayList mItems>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #152 <Method Object ArrayList.get(int)>
		//    4    8:checkcast       #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
		//    5   11:areturn         
		}

		public int getItemCount()
		{
			return mItems.size();
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field ArrayList mItems>
		//    2    4:invokevirtual   #158 <Method int ArrayList.size()>
		//    3    7:ireturn         
		}

		public int getItemViewType(int i)
		{
			return ((Item)mItems.get(i)).getType();
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field ArrayList mItems>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #152 <Method Object ArrayList.get(int)>
		//    4    8:checkcast       #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
		//    5   11:invokevirtual   #163 <Method int MediaRouteCastDialog$RecyclerAdapter$Item.getType()>
		//    6   14:ireturn         
		}

		boolean isSelectedRoute(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
		{
label0:
			{
				if(routeinfo.isSelected())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #169 <Method boolean android.support.v7.media.MediaRouter$RouteInfo.isSelected()>
		//*   2    4:ifeq            9
					return true;
		//    3    7:iconst_1        
		//    4    8:ireturn         
				if(!(mRoute instanceof android.support.v7.media.MediaRouter.RouteGroup))
					break label0;
		//    5    9:aload_0         
		//    6   10:getfield        #34  <Field MediaRouteCastDialog this$0>
		//    7   13:getfield        #173 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
		//    8   16:instanceof      #97  <Class android.support.v7.media.MediaRouter$RouteGroup>
		//    9   19:ifeq            74
				Iterator iterator = ((android.support.v7.media.MediaRouter.RouteGroup)mRoute).getRoutes().iterator();
		//   10   22:aload_0         
		//   11   23:getfield        #34  <Field MediaRouteCastDialog this$0>
		//   12   26:getfield        #173 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
		//   13   29:checkcast       #97  <Class android.support.v7.media.MediaRouter$RouteGroup>
		//   14   32:invokevirtual   #177 <Method List android.support.v7.media.MediaRouter$RouteGroup.getRoutes()>
		//   15   35:invokeinterface #183 <Method Iterator List.iterator()>
		//   16   40:astore_2        
				do
					if(!iterator.hasNext())
						break label0;
		//   17   41:aload_2         
		//   18   42:invokeinterface #188 <Method boolean Iterator.hasNext()>
		//   19   47:ifeq            74
				while(!((android.support.v7.media.MediaRouter.RouteInfo)iterator.next()).getId().equals(((Object) (routeinfo.getId()))));
		//   20   50:aload_2         
		//   21   51:invokeinterface #192 <Method Object Iterator.next()>
		//   22   56:checkcast       #91  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//   23   59:invokevirtual   #195 <Method String android.support.v7.media.MediaRouter$RouteInfo.getId()>
		//   24   62:aload_1         
		//   25   63:invokevirtual   #195 <Method String android.support.v7.media.MediaRouter$RouteInfo.getId()>
		//   26   66:invokevirtual   #201 <Method boolean String.equals(Object)>
		//   27   69:ifeq            41
				return true;
		//   28   72:iconst_1        
		//   29   73:ireturn         
			}
			return false;
		//   30   74:iconst_0        
		//   31   75:ireturn         
		}

		public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
		{
			int j = getItemViewType(i);
		//    0    0:aload_0         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #205 <Method int getItemViewType(int)>
		//    3    5:istore_3        
			Item item = getItem(i);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #207 <Method MediaRouteCastDialog$RecyclerAdapter$Item getItem(int)>
		//    7   11:astore          4
			switch(j)
		//*   8   13:iload_3         
			{
		//*   9   14:tableswitch     1 4: default 44
		//		               1 83
		//		               2 73
		//		               3 63
		//		               4 53
			default:
				Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
		//   10   44:ldc1            #17  <String "RecyclerAdapter">
		//   11   46:ldc1            #209 <String "Cannot bind item to ViewHolder because of wrong view type">
		//   12   48:invokestatic    #212 <Method int Log.w(String, String)>
		//   13   51:pop             
				return;
		//   14   52:return          

			case 4: // '\004'
				class GroupViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
				{

					public void bindGroupViewHolder(Item item1)
					{
						item1 = ((Item) ((android.support.v7.media.MediaRouter.RouteInfo)item1.getData()));
					//    0    0:aload_1         
					//    1    1:invokevirtual   #49  <Method Object MediaRouteCastDialog$RecyclerAdapter$Item.getData()>
					//    2    4:checkcast       #51  <Class android.support.v7.media.MediaRouter$RouteInfo>
					//    3    7:astore_1        
						mImageView.setImageDrawable(getIconDrawable(((android.support.v7.media.MediaRouter.RouteInfo) (item1))));
					//    4    8:aload_0         
					//    5    9:getfield        #33  <Field ImageView mImageView>
					//    6   12:aload_0         
					//    7   13:getfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
					//    8   16:aload_1         
					//    9   17:invokevirtual   #57  <Method Drawable MediaRouteCastDialog$RecyclerAdapter.getIconDrawable(android.support.v7.media.MediaRouter$RouteInfo)>
					//   10   20:invokevirtual   #61  <Method void ImageView.setImageDrawable(Drawable)>
						mTextView.setText(((CharSequence) (((android.support.v7.media.MediaRouter.RouteInfo) (item1)).getName())));
					//   11   23:aload_0         
					//   12   24:getfield        #40  <Field TextView mTextView>
					//   13   27:aload_1         
					//   14   28:invokevirtual   #65  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
					//   15   31:invokevirtual   #69  <Method void TextView.setText(CharSequence)>
					//   16   34:return          
					}

					ImageView mImageView;
					TextView mTextView;
					final RecyclerAdapter this$1;

				GroupViewHolder(View view)
				{
					this$1 = RecyclerAdapter.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
					super(view);
				//    3    5:aload_0         
				//    4    6:aload_2         
				//    5    7:invokespecial   #17  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
					mImageView = (ImageView)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_group_icon);
				//    6   10:aload_0         
				//    7   11:aload_2         
				//    8   12:getstatic       #23  <Field int android.support.v7.mediarouter.R$id.mr_cast_group_icon>
				//    9   15:invokevirtual   #29  <Method View View.findViewById(int)>
				//   10   18:checkcast       #31  <Class ImageView>
				//   11   21:putfield        #33  <Field ImageView mImageView>
					mTextView = (TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_group_name);
				//   12   24:aload_0         
				//   13   25:aload_2         
				//   14   26:getstatic       #36  <Field int android.support.v7.mediarouter.R$id.mr_cast_group_name>
				//   15   29:invokevirtual   #29  <Method View View.findViewById(int)>
				//   16   32:checkcast       #38  <Class TextView>
				//   17   35:putfield        #40  <Field TextView mTextView>
				//   18   38:return          
				}
				}

				((GroupViewHolder)viewholder).bindGroupViewHolder(item);
		//   15   53:aload_1         
		//   16   54:checkcast       #214 <Class MediaRouteCastDialog$RecyclerAdapter$GroupViewHolder>
		//   17   57:aload           4
		//   18   59:invokevirtual   #218 <Method void MediaRouteCastDialog$RecyclerAdapter$GroupViewHolder.bindGroupViewHolder(MediaRouteCastDialog$RecyclerAdapter$Item)>
				return;
		//   19   62:return          

			case 3: // '\003'
				class RouteViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
				{

					public void bindRouteViewHolder(Item item1)
					{
						item1 = ((Item) ((android.support.v7.media.MediaRouter.RouteInfo)item1.getData()));
					//    0    0:aload_1         
					//    1    1:invokevirtual   #67  <Method Object MediaRouteCastDialog$RecyclerAdapter$Item.getData()>
					//    2    4:checkcast       #69  <Class android.support.v7.media.MediaRouter$RouteInfo>
					//    3    7:astore_1        
						mImageView.setImageDrawable(getIconDrawable(((android.support.v7.media.MediaRouter.RouteInfo) (item1))));
					//    4    8:aload_0         
					//    5    9:getfield        #37  <Field ImageView mImageView>
					//    6   12:aload_0         
					//    7   13:getfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
					//    8   16:aload_1         
					//    9   17:invokevirtual   #75  <Method Drawable MediaRouteCastDialog$RecyclerAdapter.getIconDrawable(android.support.v7.media.MediaRouter$RouteInfo)>
					//   10   20:invokevirtual   #79  <Method void ImageView.setImageDrawable(Drawable)>
						mTextView.setText(((CharSequence) (((android.support.v7.media.MediaRouter.RouteInfo) (item1)).getName())));
					//   11   23:aload_0         
					//   12   24:getfield        #44  <Field TextView mTextView>
					//   13   27:aload_1         
					//   14   28:invokevirtual   #83  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
					//   15   31:invokevirtual   #87  <Method void TextView.setText(CharSequence)>
						mCheckBox.setChecked(isSelectedRoute(((android.support.v7.media.MediaRouter.RouteInfo) (item1))));
					//   16   34:aload_0         
					//   17   35:getfield        #51  <Field CheckBox mCheckBox>
					//   18   38:aload_0         
					//   19   39:getfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
					//   20   42:aload_1         
					//   21   43:invokevirtual   #91  <Method boolean MediaRouteCastDialog$RecyclerAdapter.isSelectedRoute(android.support.v7.media.MediaRouter$RouteInfo)>
					//   22   46:invokevirtual   #95  <Method void CheckBox.setChecked(boolean)>
						mVolumeSlider.setColor(mVolumeSliderColor);
					//   23   49:aload_0         
					//   24   50:getfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
					//   25   53:aload_0         
					//   26   54:getfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
					//   27   57:getfield        #99  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
					//   28   60:getfield        #104 <Field int MediaRouteCastDialog.mVolumeSliderColor>
					//   29   63:invokevirtual   #108 <Method void MediaRouteVolumeSlider.setColor(int)>
						mVolumeSlider.setTag(((Object) (item1)));
					//   30   66:aload_0         
					//   31   67:getfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
					//   32   70:aload_1         
					//   33   71:invokevirtual   #112 <Method void MediaRouteVolumeSlider.setTag(Object)>
						mVolumeSlider.setProgress(((android.support.v7.media.MediaRouter.RouteInfo) (item1)).getVolume());
					//   34   74:aload_0         
					//   35   75:getfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
					//   36   78:aload_1         
					//   37   79:invokevirtual   #116 <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
					//   38   82:invokevirtual   #119 <Method void MediaRouteVolumeSlider.setProgress(int)>
						mVolumeSlider.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (mVolumeChangeListener)));
					//   39   85:aload_0         
					//   40   86:getfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
					//   41   89:aload_0         
					//   42   90:getfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
					//   43   93:getfield        #99  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
					//   44   96:getfield        #123 <Field MediaRouteCastDialog$VolumeChangeListener MediaRouteCastDialog.mVolumeChangeListener>
					//   45   99:invokevirtual   #127 <Method void MediaRouteVolumeSlider.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
					//   46  102:return          
					}

					CheckBox mCheckBox;
					ImageView mImageView;
					TextView mTextView;
					MediaRouteVolumeSlider mVolumeSlider;
					final RecyclerAdapter this$1;

				RouteViewHolder(View view)
				{
					this$1 = RecyclerAdapter.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #18  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
					super(view);
				//    3    5:aload_0         
				//    4    6:aload_2         
				//    5    7:invokespecial   #21  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
					mImageView = (ImageView)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_route_icon);
				//    6   10:aload_0         
				//    7   11:aload_2         
				//    8   12:getstatic       #27  <Field int android.support.v7.mediarouter.R$id.mr_cast_route_icon>
				//    9   15:invokevirtual   #33  <Method View View.findViewById(int)>
				//   10   18:checkcast       #35  <Class ImageView>
				//   11   21:putfield        #37  <Field ImageView mImageView>
					mTextView = (TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_route_name);
				//   12   24:aload_0         
				//   13   25:aload_2         
				//   14   26:getstatic       #40  <Field int android.support.v7.mediarouter.R$id.mr_cast_route_name>
				//   15   29:invokevirtual   #33  <Method View View.findViewById(int)>
				//   16   32:checkcast       #42  <Class TextView>
				//   17   35:putfield        #44  <Field TextView mTextView>
					mCheckBox = (CheckBox)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_checkbox);
				//   18   38:aload_0         
				//   19   39:aload_2         
				//   20   40:getstatic       #47  <Field int android.support.v7.mediarouter.R$id.mr_cast_checkbox>
				//   21   43:invokevirtual   #33  <Method View View.findViewById(int)>
				//   22   46:checkcast       #49  <Class CheckBox>
				//   23   49:putfield        #51  <Field CheckBox mCheckBox>
					mVolumeSlider = (MediaRouteVolumeSlider)view.findViewById(android.support.v7.mediarouter.R.id.mr_cast_volume_slider);
				//   24   52:aload_0         
				//   25   53:aload_2         
				//   26   54:getstatic       #54  <Field int android.support.v7.mediarouter.R$id.mr_cast_volume_slider>
				//   27   57:invokevirtual   #33  <Method View View.findViewById(int)>
				//   28   60:checkcast       #56  <Class MediaRouteVolumeSlider>
				//   29   63:putfield        #58  <Field MediaRouteVolumeSlider mVolumeSlider>
				//   30   66:return          
				}
				}

				((RouteViewHolder)viewholder).bindRouteViewHolder(item);
		//   20   63:aload_1         
		//   21   64:checkcast       #220 <Class MediaRouteCastDialog$RecyclerAdapter$RouteViewHolder>
		//   22   67:aload           4
		//   23   69:invokevirtual   #223 <Method void MediaRouteCastDialog$RecyclerAdapter$RouteViewHolder.bindRouteViewHolder(MediaRouteCastDialog$RecyclerAdapter$Item)>
				return;
		//   24   72:return          

			case 2: // '\002'
				class HeaderViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
				{

					public void bindHeaderViewHolder(Item item1)
					{
						item1 = ((Item) (item1.getData().toString()));
					//    0    0:aload_1         
					//    1    1:invokevirtual   #40  <Method Object MediaRouteCastDialog$RecyclerAdapter$Item.getData()>
					//    2    4:invokevirtual   #46  <Method String Object.toString()>
					//    3    7:astore_1        
						mTextView.setText(((CharSequence) (((String) (item1)).toUpperCase())));
					//    4    8:aload_0         
					//    5    9:getfield        #31  <Field TextView mTextView>
					//    6   12:aload_1         
					//    7   13:invokevirtual   #51  <Method String String.toUpperCase()>
					//    8   16:invokevirtual   #55  <Method void TextView.setText(CharSequence)>
					//    9   19:return          
					}

					TextView mTextView;
					final RecyclerAdapter this$1;

				HeaderViewHolder(View view)
				{
					this$1 = RecyclerAdapter.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #12  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
					super(view);
				//    3    5:aload_0         
				//    4    6:aload_2         
				//    5    7:invokespecial   #15  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
					mTextView = (TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_dialog_header_name);
				//    6   10:aload_0         
				//    7   11:aload_2         
				//    8   12:getstatic       #21  <Field int android.support.v7.mediarouter.R$id.mr_dialog_header_name>
				//    9   15:invokevirtual   #27  <Method View View.findViewById(int)>
				//   10   18:checkcast       #29  <Class TextView>
				//   11   21:putfield        #31  <Field TextView mTextView>
				//   12   24:return          
				}
				}

				((HeaderViewHolder)viewholder).bindHeaderViewHolder(item);
		//   25   73:aload_1         
		//   26   74:checkcast       #225 <Class MediaRouteCastDialog$RecyclerAdapter$HeaderViewHolder>
		//   27   77:aload           4
		//   28   79:invokevirtual   #228 <Method void MediaRouteCastDialog$RecyclerAdapter$HeaderViewHolder.bindHeaderViewHolder(MediaRouteCastDialog$RecyclerAdapter$Item)>
				return;
		//   29   82:return          

			case 1: // '\001'
				class GroupVolumeViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
				{

					public void bindGroupVolumeView(Item item1)
					{
						item1 = ((Item) ((android.support.v7.media.MediaRouter.RouteInfo)item1.getData()));
					//    0    0:aload_1         
					//    1    1:invokevirtual   #49  <Method Object MediaRouteCastDialog$RecyclerAdapter$Item.getData()>
					//    2    4:checkcast       #51  <Class android.support.v7.media.MediaRouter$RouteInfo>
					//    3    7:astore_1        
						mTextView.setText(((CharSequence) (((android.support.v7.media.MediaRouter.RouteInfo) (item1)).getName().toUpperCase())));
					//    4    8:aload_0         
					//    5    9:getfield        #33  <Field TextView mTextView>
					//    6   12:aload_1         
					//    7   13:invokevirtual   #55  <Method String android.support.v7.media.MediaRouter$RouteInfo.getName()>
					//    8   16:invokevirtual   #60  <Method String String.toUpperCase()>
					//    9   19:invokevirtual   #64  <Method void TextView.setText(CharSequence)>
						mGroupVolumeSlider.setColor(mVolumeSliderColor);
					//   10   22:aload_0         
					//   11   23:getfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
					//   12   26:aload_0         
					//   13   27:getfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
					//   14   30:getfield        #70  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
					//   15   33:getfield        #75  <Field int MediaRouteCastDialog.mVolumeSliderColor>
					//   16   36:invokevirtual   #79  <Method void MediaRouteVolumeSlider.setColor(int)>
						mGroupVolumeSlider.setTag(((Object) (item1)));
					//   17   39:aload_0         
					//   18   40:getfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
					//   19   43:aload_1         
					//   20   44:invokevirtual   #83  <Method void MediaRouteVolumeSlider.setTag(Object)>
						mGroupVolumeSlider.setProgress(mRoute.getVolume());
					//   21   47:aload_0         
					//   22   48:getfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
					//   23   51:aload_0         
					//   24   52:getfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
					//   25   55:getfield        #70  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
					//   26   58:getfield        #87  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
					//   27   61:invokevirtual   #91  <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
					//   28   64:invokevirtual   #94  <Method void MediaRouteVolumeSlider.setProgress(int)>
						mGroupVolumeSlider.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (mVolumeChangeListener)));
					//   29   67:aload_0         
					//   30   68:getfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
					//   31   71:aload_0         
					//   32   72:getfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
					//   33   75:getfield        #70  <Field MediaRouteCastDialog MediaRouteCastDialog$RecyclerAdapter.this$0>
					//   34   78:getfield        #98  <Field MediaRouteCastDialog$VolumeChangeListener MediaRouteCastDialog.mVolumeChangeListener>
					//   35   81:invokevirtual   #102 <Method void MediaRouteVolumeSlider.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
					//   36   84:return          
					}

					MediaRouteVolumeSlider mGroupVolumeSlider;
					TextView mTextView;
					final RecyclerAdapter this$1;

				GroupVolumeViewHolder(View view)
				{
					this$1 = RecyclerAdapter.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #14  <Field MediaRouteCastDialog$RecyclerAdapter this$1>
					super(view);
				//    3    5:aload_0         
				//    4    6:aload_2         
				//    5    7:invokespecial   #17  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
					mTextView = (TextView)view.findViewById(android.support.v7.mediarouter.R.id.mr_group_volume_route_name);
				//    6   10:aload_0         
				//    7   11:aload_2         
				//    8   12:getstatic       #23  <Field int android.support.v7.mediarouter.R$id.mr_group_volume_route_name>
				//    9   15:invokevirtual   #29  <Method View View.findViewById(int)>
				//   10   18:checkcast       #31  <Class TextView>
				//   11   21:putfield        #33  <Field TextView mTextView>
					mGroupVolumeSlider = (MediaRouteVolumeSlider)view.findViewById(android.support.v7.mediarouter.R.id.mr_group_volume_slider);
				//   12   24:aload_0         
				//   13   25:aload_2         
				//   14   26:getstatic       #36  <Field int android.support.v7.mediarouter.R$id.mr_group_volume_slider>
				//   15   29:invokevirtual   #29  <Method View View.findViewById(int)>
				//   16   32:checkcast       #38  <Class MediaRouteVolumeSlider>
				//   17   35:putfield        #40  <Field MediaRouteVolumeSlider mGroupVolumeSlider>
				//   18   38:return          
				}
				}

				((GroupVolumeViewHolder)viewholder).bindGroupVolumeView(item);
		//   30   83:aload_1         
		//   31   84:checkcast       #230 <Class MediaRouteCastDialog$RecyclerAdapter$GroupVolumeViewHolder>
		//   32   87:aload           4
		//   33   89:invokevirtual   #233 <Method void MediaRouteCastDialog$RecyclerAdapter$GroupVolumeViewHolder.bindGroupVolumeView(MediaRouteCastDialog$RecyclerAdapter$Item)>
				return;
		//   34   92:return          
			}
		}

		public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
		{
			switch(i)
		//*   0    0:iload_2         
			{
		//*   1    1:tableswitch     1 4: default 32
		//		               1 105
		//		               2 84
		//		               3 63
		//		               4 42
			default:
				Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
		//    2   32:ldc1            #17  <String "RecyclerAdapter">
		//    3   34:ldc1            #237 <String "Cannot create ViewHolder because of wrong view type">
		//    4   36:invokestatic    #212 <Method int Log.w(String, String)>
		//    5   39:pop             
				return null;
		//    6   40:aconst_null     
		//    7   41:areturn         

			case 4: // '\004'
				return ((android.support.v7.widget.RecyclerView.ViewHolder) (new GroupViewHolder(mInflater.inflate(android.support.v7.mediarouter.R.layout.mr_cast_group_item, viewgroup, false))));
		//    8   42:new             #214 <Class MediaRouteCastDialog$RecyclerAdapter$GroupViewHolder>
		//    9   45:dup             
		//   10   46:aload_0         
		//   11   47:aload_0         
		//   12   48:getfield        #60  <Field LayoutInflater mInflater>
		//   13   51:getstatic       #242 <Field int android.support.v7.mediarouter.R$layout.mr_cast_group_item>
		//   14   54:aload_1         
		//   15   55:iconst_0        
		//   16   56:invokevirtual   #246 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   17   59:invokespecial   #249 <Method void MediaRouteCastDialog$RecyclerAdapter$GroupViewHolder(MediaRouteCastDialog$RecyclerAdapter, View)>
		//   18   62:areturn         

			case 3: // '\003'
				return ((android.support.v7.widget.RecyclerView.ViewHolder) (new RouteViewHolder(mInflater.inflate(android.support.v7.mediarouter.R.layout.mr_cast_route_item, viewgroup, false))));
		//   19   63:new             #220 <Class MediaRouteCastDialog$RecyclerAdapter$RouteViewHolder>
		//   20   66:dup             
		//   21   67:aload_0         
		//   22   68:aload_0         
		//   23   69:getfield        #60  <Field LayoutInflater mInflater>
		//   24   72:getstatic       #252 <Field int android.support.v7.mediarouter.R$layout.mr_cast_route_item>
		//   25   75:aload_1         
		//   26   76:iconst_0        
		//   27   77:invokevirtual   #246 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   28   80:invokespecial   #253 <Method void MediaRouteCastDialog$RecyclerAdapter$RouteViewHolder(MediaRouteCastDialog$RecyclerAdapter, View)>
		//   29   83:areturn         

			case 2: // '\002'
				return ((android.support.v7.widget.RecyclerView.ViewHolder) (new HeaderViewHolder(mInflater.inflate(android.support.v7.mediarouter.R.layout.mr_dialog_header_item, viewgroup, false))));
		//   30   84:new             #225 <Class MediaRouteCastDialog$RecyclerAdapter$HeaderViewHolder>
		//   31   87:dup             
		//   32   88:aload_0         
		//   33   89:aload_0         
		//   34   90:getfield        #60  <Field LayoutInflater mInflater>
		//   35   93:getstatic       #256 <Field int android.support.v7.mediarouter.R$layout.mr_dialog_header_item>
		//   36   96:aload_1         
		//   37   97:iconst_0        
		//   38   98:invokevirtual   #246 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   39  101:invokespecial   #257 <Method void MediaRouteCastDialog$RecyclerAdapter$HeaderViewHolder(MediaRouteCastDialog$RecyclerAdapter, View)>
		//   40  104:areturn         

			case 1: // '\001'
				return ((android.support.v7.widget.RecyclerView.ViewHolder) (new GroupVolumeViewHolder(mInflater.inflate(android.support.v7.mediarouter.R.layout.mr_cast_group_volume_item, viewgroup, false))));
		//   41  105:new             #230 <Class MediaRouteCastDialog$RecyclerAdapter$GroupVolumeViewHolder>
		//   42  108:dup             
		//   43  109:aload_0         
		//   44  110:aload_0         
		//   45  111:getfield        #60  <Field LayoutInflater mInflater>
		//   46  114:getstatic       #260 <Field int android.support.v7.mediarouter.R$layout.mr_cast_group_volume_item>
		//   47  117:aload_1         
		//   48  118:iconst_0        
		//   49  119:invokevirtual   #246 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   50  122:invokespecial   #261 <Method void MediaRouteCastDialog$RecyclerAdapter$GroupVolumeViewHolder(MediaRouteCastDialog$RecyclerAdapter, View)>
		//   51  125:areturn         
			}
		}

		void setItems()
		{
			mItems.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field ArrayList mItems>
		//    2    4:invokevirtual   #264 <Method void ArrayList.clear()>
			if(mRoute instanceof android.support.v7.media.MediaRouter.RouteGroup)
		//*   3    7:aload_0         
		//*   4    8:getfield        #34  <Field MediaRouteCastDialog this$0>
		//*   5   11:getfield        #173 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
		//*   6   14:instanceof      #97  <Class android.support.v7.media.MediaRouter$RouteGroup>
		//*   7   17:ifeq            103
			{
				mItems.add(((Object) (new Item(((Object) (mRoute)), 1))));
		//    8   20:aload_0         
		//    9   21:getfield        #42  <Field ArrayList mItems>
		//   10   24:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
		//   11   27:dup             
		//   12   28:aload_0         
		//   13   29:aload_0         
		//   14   30:getfield        #34  <Field MediaRouteCastDialog this$0>
		//   15   33:getfield        #173 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
		//   16   36:iconst_1        
		//   17   37:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
		//   18   40:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
		//   19   43:pop             
				android.support.v7.media.MediaRouter.RouteInfo routeinfo;
				for(Iterator iterator = ((android.support.v7.media.MediaRouter.RouteGroup)mRoute).getRoutes().iterator(); iterator.hasNext(); mItems.add(((Object) (new Item(((Object) (routeinfo)), 3)))))
		//*  20   44:aload_0         
		//*  21   45:getfield        #34  <Field MediaRouteCastDialog this$0>
		//*  22   48:getfield        #173 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
		//*  23   51:checkcast       #97  <Class android.support.v7.media.MediaRouter$RouteGroup>
		//*  24   54:invokevirtual   #177 <Method List android.support.v7.media.MediaRouter$RouteGroup.getRoutes()>
		//*  25   57:invokeinterface #183 <Method Iterator List.iterator()>
		//*  26   62:astore_1        
		//*  27   63:aload_1         
		//*  28   64:invokeinterface #188 <Method boolean Iterator.hasNext()>
		//*  29   69:ifeq            127
					routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)iterator.next();
		//   30   72:aload_1         
		//   31   73:invokeinterface #192 <Method Object Iterator.next()>
		//   32   78:checkcast       #91  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//   33   81:astore_2        

		//   34   82:aload_0         
		//   35   83:getfield        #42  <Field ArrayList mItems>
		//   36   86:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
		//   37   89:dup             
		//   38   90:aload_0         
		//   39   91:aload_2         
		//   40   92:iconst_3        
		//   41   93:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
		//   42   96:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
		//   43   99:pop             
			} else
		//*  44  100:goto            63
			{
				mItems.add(((Object) (new Item(((Object) (mRoute)), 3))));
		//   45  103:aload_0         
		//   46  104:getfield        #42  <Field ArrayList mItems>
		//   47  107:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
		//   48  110:dup             
		//   49  111:aload_0         
		//   50  112:aload_0         
		//   51  113:getfield        #34  <Field MediaRouteCastDialog this$0>
		//   52  116:getfield        #173 <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteCastDialog.mRoute>
		//   53  119:iconst_3        
		//   54  120:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
		//   55  123:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
		//   56  126:pop             
			}
			mAvailableRoutes.clear();
		//   57  127:aload_0         
		//   58  128:getfield        #44  <Field ArrayList mAvailableRoutes>
		//   59  131:invokevirtual   #264 <Method void ArrayList.clear()>
			mAvailableGroups.clear();
		//   60  134:aload_0         
		//   61  135:getfield        #46  <Field ArrayList mAvailableGroups>
		//   62  138:invokevirtual   #264 <Method void ArrayList.clear()>
			Iterator iterator1 = mRoutes.iterator();
		//   63  141:aload_0         
		//   64  142:getfield        #34  <Field MediaRouteCastDialog this$0>
		//   65  145:getfield        #274 <Field List MediaRouteCastDialog.mRoutes>
		//   66  148:invokeinterface #183 <Method Iterator List.iterator()>
		//   67  153:astore_1        
			do
			{
				if(!iterator1.hasNext())
					break;
		//   68  154:aload_1         
		//   69  155:invokeinterface #188 <Method boolean Iterator.hasNext()>
		//   70  160:ifeq            215
				android.support.v7.media.MediaRouter.RouteInfo routeinfo1 = (android.support.v7.media.MediaRouter.RouteInfo)iterator1.next();
		//   71  163:aload_1         
		//   72  164:invokeinterface #192 <Method Object Iterator.next()>
		//   73  169:checkcast       #91  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//   74  172:astore_2        
				if(!isSelectedRoute(routeinfo1))
		//*  75  173:aload_0         
		//*  76  174:aload_2         
		//*  77  175:invokevirtual   #276 <Method boolean isSelectedRoute(android.support.v7.media.MediaRouter$RouteInfo)>
		//*  78  178:ifeq            184
		//*  79  181:goto            154
					if(routeinfo1 instanceof android.support.v7.media.MediaRouter.RouteGroup)
		//*  80  184:aload_2         
		//*  81  185:instanceof      #97  <Class android.support.v7.media.MediaRouter$RouteGroup>
		//*  82  188:ifeq            203
						mAvailableGroups.add(((Object) (routeinfo1)));
		//   83  191:aload_0         
		//   84  192:getfield        #46  <Field ArrayList mAvailableGroups>
		//   85  195:aload_2         
		//   86  196:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
		//   87  199:pop             
					else
		//*  88  200:goto            154
						mAvailableRoutes.add(((Object) (routeinfo1)));
		//   89  203:aload_0         
		//   90  204:getfield        #44  <Field ArrayList mAvailableRoutes>
		//   91  207:aload_2         
		//   92  208:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
		//   93  211:pop             
			} while(true);
		//   94  212:goto            154
			if(mAvailableRoutes.size() > 0)
		//*  95  215:aload_0         
		//*  96  216:getfield        #44  <Field ArrayList mAvailableRoutes>
		//*  97  219:invokevirtual   #158 <Method int ArrayList.size()>
		//*  98  222:ifle            303
			{
				mItems.add(((Object) (new Item(((Object) (mContext.getString(android.support.v7.mediarouter.R.string.mr_dialog_device_header))), 2))));
		//   99  225:aload_0         
		//  100  226:getfield        #42  <Field ArrayList mItems>
		//  101  229:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
		//  102  232:dup             
		//  103  233:aload_0         
		//  104  234:aload_0         
		//  105  235:getfield        #34  <Field MediaRouteCastDialog this$0>
		//  106  238:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
		//  107  241:getstatic       #281 <Field int android.support.v7.mediarouter.R$string.mr_dialog_device_header>
		//  108  244:invokevirtual   #285 <Method String Context.getString(int)>
		//  109  247:iconst_2        
		//  110  248:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
		//  111  251:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
		//  112  254:pop             
				android.support.v7.media.MediaRouter.RouteInfo routeinfo2;
				for(Iterator iterator2 = mAvailableRoutes.iterator(); iterator2.hasNext(); mItems.add(((Object) (new Item(((Object) (routeinfo2)), 3)))))
		//* 113  255:aload_0         
		//* 114  256:getfield        #44  <Field ArrayList mAvailableRoutes>
		//* 115  259:invokevirtual   #286 <Method Iterator ArrayList.iterator()>
		//* 116  262:astore_1        
		//* 117  263:aload_1         
		//* 118  264:invokeinterface #188 <Method boolean Iterator.hasNext()>
		//* 119  269:ifeq            303
					routeinfo2 = (android.support.v7.media.MediaRouter.RouteInfo)iterator2.next();
		//  120  272:aload_1         
		//  121  273:invokeinterface #192 <Method Object Iterator.next()>
		//  122  278:checkcast       #91  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//  123  281:astore_2        

		//  124  282:aload_0         
		//  125  283:getfield        #42  <Field ArrayList mItems>
		//  126  286:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
		//  127  289:dup             
		//  128  290:aload_0         
		//  129  291:aload_2         
		//  130  292:iconst_3        
		//  131  293:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
		//  132  296:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
		//  133  299:pop             
			}
		//* 134  300:goto            263
			if(mAvailableGroups.size() > 0)
		//* 135  303:aload_0         
		//* 136  304:getfield        #46  <Field ArrayList mAvailableGroups>
		//* 137  307:invokevirtual   #158 <Method int ArrayList.size()>
		//* 138  310:ifle            391
			{
				mItems.add(((Object) (new Item(((Object) (mContext.getString(android.support.v7.mediarouter.R.string.mr_dialog_route_header))), 2))));
		//  139  313:aload_0         
		//  140  314:getfield        #42  <Field ArrayList mItems>
		//  141  317:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
		//  142  320:dup             
		//  143  321:aload_0         
		//  144  322:aload_0         
		//  145  323:getfield        #34  <Field MediaRouteCastDialog this$0>
		//  146  326:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
		//  147  329:getstatic       #289 <Field int android.support.v7.mediarouter.R$string.mr_dialog_route_header>
		//  148  332:invokevirtual   #285 <Method String Context.getString(int)>
		//  149  335:iconst_2        
		//  150  336:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
		//  151  339:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
		//  152  342:pop             
				android.support.v7.media.MediaRouter.RouteInfo routeinfo3;
				for(Iterator iterator3 = mAvailableGroups.iterator(); iterator3.hasNext(); mItems.add(((Object) (new Item(((Object) (routeinfo3)), 4)))))
		//* 153  343:aload_0         
		//* 154  344:getfield        #46  <Field ArrayList mAvailableGroups>
		//* 155  347:invokevirtual   #286 <Method Iterator ArrayList.iterator()>
		//* 156  350:astore_1        
		//* 157  351:aload_1         
		//* 158  352:invokeinterface #188 <Method boolean Iterator.hasNext()>
		//* 159  357:ifeq            391
					routeinfo3 = (android.support.v7.media.MediaRouter.RouteInfo)iterator3.next();
		//  160  360:aload_1         
		//  161  361:invokeinterface #192 <Method Object Iterator.next()>
		//  162  366:checkcast       #91  <Class android.support.v7.media.MediaRouter$RouteInfo>
		//  163  369:astore_2        

		//  164  370:aload_0         
		//  165  371:getfield        #42  <Field ArrayList mItems>
		//  166  374:new             #154 <Class MediaRouteCastDialog$RecyclerAdapter$Item>
		//  167  377:dup             
		//  168  378:aload_0         
		//  169  379:aload_2         
		//  170  380:iconst_4        
		//  171  381:invokespecial   #267 <Method void MediaRouteCastDialog$RecyclerAdapter$Item(MediaRouteCastDialog$RecyclerAdapter, Object, int)>
		//  172  384:invokevirtual   #270 <Method boolean ArrayList.add(Object)>
		//  173  387:pop             
			}
		//* 174  388:goto            351
			notifyDataSetChanged();
		//  175  391:aload_0         
		//  176  392:invokevirtual   #292 <Method void notifyDataSetChanged()>
		//  177  395:return          
		}

		private static final int ITEM_TYPE_GROUP = 4;
		private static final int ITEM_TYPE_GROUP_VOLUME = 1;
		private static final int ITEM_TYPE_HEADER = 2;
		private static final int ITEM_TYPE_ROUTE = 3;
		private static final String TAG = "RecyclerAdapter";
		private final ArrayList mAvailableGroups = new ArrayList();
		private final ArrayList mAvailableRoutes = new ArrayList();
		private final Drawable mDefaultIcon;
		private final LayoutInflater mInflater;
		private final ArrayList mItems = new ArrayList();
		private final Drawable mSpeakerGroupIcon;
		private final Drawable mSpeakerIcon;
		private final Drawable mTvIcon;
		final MediaRouteCastDialog this$0;

		RecyclerAdapter()
		{
			this$0 = MediaRouteCastDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #34  <Field MediaRouteCastDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #37  <Method void android.support.v7.widget.RecyclerView$Adapter()>
		//    5    9:aload_0         
		//    6   10:new             #39  <Class ArrayList>
		//    7   13:dup             
		//    8   14:invokespecial   #40  <Method void ArrayList()>
		//    9   17:putfield        #42  <Field ArrayList mItems>
		//   10   20:aload_0         
		//   11   21:new             #39  <Class ArrayList>
		//   12   24:dup             
		//   13   25:invokespecial   #40  <Method void ArrayList()>
		//   14   28:putfield        #44  <Field ArrayList mAvailableRoutes>
		//   15   31:aload_0         
		//   16   32:new             #39  <Class ArrayList>
		//   17   35:dup             
		//   18   36:invokespecial   #40  <Method void ArrayList()>
		//   19   39:putfield        #46  <Field ArrayList mAvailableGroups>
			mInflater = LayoutInflater.from(mContext);
		//   20   42:aload_0         
		//   21   43:aload_1         
		//   22   44:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
		//   23   47:invokestatic    #58  <Method LayoutInflater LayoutInflater.from(Context)>
		//   24   50:putfield        #60  <Field LayoutInflater mInflater>
			mDefaultIcon = MediaRouterThemeHelper.getDefaultDrawableIcon(mContext);
		//   25   53:aload_0         
		//   26   54:aload_1         
		//   27   55:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
		//   28   58:invokestatic    #66  <Method Drawable MediaRouterThemeHelper.getDefaultDrawableIcon(Context)>
		//   29   61:putfield        #68  <Field Drawable mDefaultIcon>
			mTvIcon = MediaRouterThemeHelper.getTvDrawableIcon(mContext);
		//   30   64:aload_0         
		//   31   65:aload_1         
		//   32   66:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
		//   33   69:invokestatic    #71  <Method Drawable MediaRouterThemeHelper.getTvDrawableIcon(Context)>
		//   34   72:putfield        #73  <Field Drawable mTvIcon>
			mSpeakerIcon = MediaRouterThemeHelper.getSpeakerDrawableIcon(mContext);
		//   35   75:aload_0         
		//   36   76:aload_1         
		//   37   77:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
		//   38   80:invokestatic    #76  <Method Drawable MediaRouterThemeHelper.getSpeakerDrawableIcon(Context)>
		//   39   83:putfield        #78  <Field Drawable mSpeakerIcon>
			mSpeakerGroupIcon = MediaRouterThemeHelper.getSpeakerGropuIcon(mContext);
		//   40   86:aload_0         
		//   41   87:aload_1         
		//   42   88:getfield        #52  <Field Context MediaRouteCastDialog.mContext>
		//   43   91:invokestatic    #81  <Method Drawable MediaRouterThemeHelper.getSpeakerGropuIcon(Context)>
		//   44   94:putfield        #83  <Field Drawable mSpeakerGroupIcon>
			setItems();
		//   45   97:aload_0         
		//   46   98:invokevirtual   #86  <Method void setItems()>
		//   47  101:return          
		}
	}


	private class VolumeChangeListener
		implements android.widget.SeekBar.OnSeekBarChangeListener
	{

		public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
		{
		//    0    0:return          
		}

		public void onStartTrackingTouch(SeekBar seekbar)
		{
		//    0    0:return          
		}

		public void onStopTrackingTouch(SeekBar seekbar)
		{
		//    0    0:return          
		}

		final MediaRouteCastDialog this$0;

		VolumeChangeListener()
		{
			this$0 = MediaRouteCastDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field MediaRouteCastDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}

}
