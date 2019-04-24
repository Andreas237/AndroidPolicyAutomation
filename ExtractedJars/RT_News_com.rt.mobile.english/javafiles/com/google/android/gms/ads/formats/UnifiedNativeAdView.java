// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.*;

// Referenced classes of package com.google.android.gms.ads.formats:
//			AdChoicesView, MediaView, UnifiedNativeAd

public final class UnifiedNativeAdView extends FrameLayout
{

	public UnifiedNativeAdView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void FrameLayout(Context)>
		zzvp = zzb(context);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #16  <Method FrameLayout zzb(Context)>
	//    7   11:putfield        #18  <Field FrameLayout zzvp>
		zzvq = zzbf();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokespecial   #22  <Method zzqa zzbf()>
	//   11   19:putfield        #24  <Field zzqa zzvq>
	//   12   22:return          
	}

	public UnifiedNativeAdView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void FrameLayout(Context, AttributeSet)>
		zzvp = zzb(context);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #16  <Method FrameLayout zzb(Context)>
	//    8   12:putfield        #18  <Field FrameLayout zzvp>
		zzvq = zzbf();
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:invokespecial   #22  <Method zzqa zzbf()>
	//   12   20:putfield        #24  <Field zzqa zzvq>
	//   13   23:return          
	}

	public UnifiedNativeAdView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #31  <Method void FrameLayout(Context, AttributeSet, int)>
		zzvp = zzb(context);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:invokespecial   #16  <Method FrameLayout zzb(Context)>
	//    9   13:putfield        #18  <Field FrameLayout zzvp>
		zzvq = zzbf();
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:invokespecial   #22  <Method zzqa zzbf()>
	//   13   21:putfield        #24  <Field zzqa zzvq>
	//   14   24:return          
	}

	public UnifiedNativeAdView(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #37  <Method void FrameLayout(Context, AttributeSet, int, int)>
		zzvp = zzb(context);
	//    6    9:aload_0         
	//    7   10:aload_0         
	//    8   11:aload_1         
	//    9   12:invokespecial   #16  <Method FrameLayout zzb(Context)>
	//   10   15:putfield        #18  <Field FrameLayout zzvp>
		zzvq = zzbf();
	//   11   18:aload_0         
	//   12   19:aload_0         
	//   13   20:invokespecial   #22  <Method zzqa zzbf()>
	//   14   23:putfield        #24  <Field zzqa zzvq>
	//   15   26:return          
	}

	private final void zza(String s, View view)
	{
		try
		{
			zzvq.zzb(s, ObjectWrapper.wrap(((Object) (view))));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzqa zzvq>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #48  <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    5    9:invokeinterface #53  <Method void zzqa.zzb(String, IObjectWrapper)>
			return;
	//    6   14:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   7   15:astore_1        
		{
			zzane.zzb("Unable to call setAssetView on delegate", ((Throwable) (s)));
	//    8   16:ldc1            #55  <String "Unable to call setAssetView on delegate">
	//    9   18:aload_1         
	//   10   19:invokestatic    #60  <Method void zzane.zzb(String, Throwable)>
		}
	//   11   22:return          
	}

	private final FrameLayout zzb(Context context)
	{
		context = ((Context) (new FrameLayout(context)));
	//    0    0:new             #4   <Class FrameLayout>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #12  <Method void FrameLayout(Context)>
	//    4    8:astore_1        
		((FrameLayout) (context)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//    5    9:aload_1         
	//    6   10:new             #62  <Class android.widget.FrameLayout$LayoutParams>
	//    7   13:dup             
	//    8   14:iconst_m1       
	//    9   15:iconst_m1       
	//   10   16:invokespecial   #65  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   11   19:invokevirtual   #69  <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		addView(((View) (context)));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #73  <Method void addView(View)>
		return ((FrameLayout) (context));
	//   15   27:aload_1         
	//   16   28:areturn         
	}

	private final zzqa zzbf()
	{
		Preconditions.checkNotNull(((Object) (zzvp)), "createDelegate must be called after overlayFrame has been created");
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field FrameLayout zzvp>
	//    2    4:ldc1            #75  <String "createDelegate must be called after overlayFrame has been created">
	//    3    6:invokestatic    #81  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    9:pop             
		if(isInEditMode())
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #85  <Method boolean isInEditMode()>
	//*   7   14:ifeq            19
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
		else
			return zzkb.zzig().zza(zzvp.getContext(), ((FrameLayout) (this)), zzvp);
	//   10   19:invokestatic    #91  <Method zzjr zzkb.zzig()>
	//   11   22:aload_0         
	//   12   23:getfield        #18  <Field FrameLayout zzvp>
	//   13   26:invokevirtual   #95  <Method Context FrameLayout.getContext()>
	//   14   29:aload_0         
	//   15   30:aload_0         
	//   16   31:getfield        #18  <Field FrameLayout zzvp>
	//   17   34:invokevirtual   #100 <Method zzqa zzjr.zza(Context, FrameLayout, FrameLayout)>
	//   18   37:areturn         
	}

	private final View zzp(String s)
	{
		s = ((String) (zzvq.zzak(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzqa zzvq>
	//    2    4:aload_1         
	//    3    5:invokeinterface #106 <Method IObjectWrapper zzqa.zzak(String)>
	//    4   10:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_32;
	//    5   11:aload_1         
	//    6   12:ifnull          32
		s = ((String) ((View)ObjectWrapper.unwrap(((IObjectWrapper) (s)))));
	//    7   15:aload_1         
	//    8   16:invokestatic    #110 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    9   19:checkcast       #112 <Class View>
	//   10   22:astore_1        
		return ((View) (s));
	//   11   23:aload_1         
	//   12   24:areturn         
		s;
	//   13   25:astore_1        
		zzane.zzb("Unable to call getAssetView on delegate", ((Throwable) (s)));
	//   14   26:ldc1            #114 <String "Unable to call getAssetView on delegate">
	//   15   28:aload_1         
	//   16   29:invokestatic    #60  <Method void zzane.zzb(String, Throwable)>
		return null;
	//   17   32:aconst_null     
	//   18   33:areturn         
	}

	public final void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.addView(view, i, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #117 <Method void FrameLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
		super.bringChildToFront(((View) (zzvp)));
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #18  <Field FrameLayout zzvp>
	//    8   12:invokespecial   #120 <Method void FrameLayout.bringChildToFront(View)>
	//    9   15:return          
	}

	public final void bringChildToFront(View view)
	{
		super.bringChildToFront(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #120 <Method void FrameLayout.bringChildToFront(View)>
		if(zzvp != view)
	//*   3    5:aload_0         
	//*   4    6:getfield        #18  <Field FrameLayout zzvp>
	//*   5    9:aload_1         
	//*   6   10:if_acmpeq       21
			super.bringChildToFront(((View) (zzvp)));
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #18  <Field FrameLayout zzvp>
	//   10   18:invokespecial   #120 <Method void FrameLayout.bringChildToFront(View)>
	//   11   21:return          
	}

	public final void destroy()
	{
		try
		{
			zzvq.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzqa zzvq>
	//    2    4:invokeinterface #124 <Method void zzqa.destroy()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			zzane.zzb("Unable to destroy native ad view", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #126 <String "Unable to destroy native ad view">
	//    6   13:aload_1         
	//    7   14:invokestatic    #60  <Method void zzane.zzb(String, Throwable)>
		}
	//    8   17:return          
	}

	public final AdChoicesView getAdChoicesView()
	{
		View view = zzp("3011");
	//    0    0:aload_0         
	//    1    1:ldc1            #130 <String "3011">
	//    2    3:invokespecial   #132 <Method View zzp(String)>
	//    3    6:astore_1        
		if(view instanceof AdChoicesView)
	//*   4    7:aload_1         
	//*   5    8:instanceof      #134 <Class AdChoicesView>
	//*   6   11:ifeq            19
			return (AdChoicesView)view;
	//    7   14:aload_1         
	//    8   15:checkcast       #134 <Class AdChoicesView>
	//    9   18:areturn         
		else
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
	}

	public final View getAdvertiserView()
	{
		return zzp("3005");
	//    0    0:aload_0         
	//    1    1:ldc1            #138 <String "3005">
	//    2    3:invokespecial   #132 <Method View zzp(String)>
	//    3    6:areturn         
	}

	public final View getBodyView()
	{
		return zzp("3004");
	//    0    0:aload_0         
	//    1    1:ldc1            #141 <String "3004">
	//    2    3:invokespecial   #132 <Method View zzp(String)>
	//    3    6:areturn         
	}

	public final View getCallToActionView()
	{
		return zzp("3002");
	//    0    0:aload_0         
	//    1    1:ldc1            #144 <String "3002">
	//    2    3:invokespecial   #132 <Method View zzp(String)>
	//    3    6:areturn         
	}

	public final View getHeadlineView()
	{
		return zzp("3001");
	//    0    0:aload_0         
	//    1    1:ldc1            #147 <String "3001">
	//    2    3:invokespecial   #132 <Method View zzp(String)>
	//    3    6:areturn         
	}

	public final View getIconView()
	{
		return zzp("3003");
	//    0    0:aload_0         
	//    1    1:ldc1            #150 <String "3003">
	//    2    3:invokespecial   #132 <Method View zzp(String)>
	//    3    6:areturn         
	}

	public final View getImageView()
	{
		return zzp("3008");
	//    0    0:aload_0         
	//    1    1:ldc1            #153 <String "3008">
	//    2    3:invokespecial   #132 <Method View zzp(String)>
	//    3    6:areturn         
	}

	public final MediaView getMediaView()
	{
		View view = zzp("3010");
	//    0    0:aload_0         
	//    1    1:ldc1            #157 <String "3010">
	//    2    3:invokespecial   #132 <Method View zzp(String)>
	//    3    6:astore_1        
		if(view instanceof MediaView)
	//*   4    7:aload_1         
	//*   5    8:instanceof      #159 <Class MediaView>
	//*   6   11:ifeq            19
			return (MediaView)view;
	//    7   14:aload_1         
	//    8   15:checkcast       #159 <Class MediaView>
	//    9   18:areturn         
		if(view != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          28
			zzane.zzck("View is not an instance of MediaView");
	//   12   23:ldc1            #161 <String "View is not an instance of MediaView">
	//   13   25:invokestatic    #165 <Method void zzane.zzck(String)>
		return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
	}

	public final View getPriceView()
	{
		return zzp("3007");
	//    0    0:aload_0         
	//    1    1:ldc1            #168 <String "3007">
	//    2    3:invokespecial   #132 <Method View zzp(String)>
	//    3    6:areturn         
	}

	public final View getStarRatingView()
	{
		return zzp("3009");
	//    0    0:aload_0         
	//    1    1:ldc1            #171 <String "3009">
	//    2    3:invokespecial   #132 <Method View zzp(String)>
	//    3    6:areturn         
	}

	public final View getStoreView()
	{
		return zzp("3006");
	//    0    0:aload_0         
	//    1    1:ldc1            #174 <String "3006">
	//    2    3:invokespecial   #132 <Method View zzp(String)>
	//    3    6:areturn         
	}

	public final void onVisibilityChanged(View view, int i)
	{
		super.onVisibilityChanged(view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #178 <Method void FrameLayout.onVisibilityChanged(View, int)>
		if(zzvq != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #24  <Field zzqa zzvq>
	//*   6   10:ifnull          35
			try
			{
				zzvq.zzb(ObjectWrapper.wrap(((Object) (view))), i);
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field zzqa zzvq>
	//    9   17:aload_1         
	//   10   18:invokestatic    #48  <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   11   21:iload_2         
	//   12   22:invokeinterface #181 <Method void zzqa.zzb(IObjectWrapper, int)>
				return;
	//   13   27:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  14   28:astore_1        
			{
				zzane.zzb("Unable to call onVisibilityChanged on delegate", ((Throwable) (view)));
	//   15   29:ldc1            #183 <String "Unable to call onVisibilityChanged on delegate">
	//   16   31:aload_1         
	//   17   32:invokestatic    #60  <Method void zzane.zzb(String, Throwable)>
			}
	//   18   35:return          
	}

	public final void removeAllViews()
	{
		super.removeAllViews();
	//    0    0:aload_0         
	//    1    1:invokespecial   #186 <Method void FrameLayout.removeAllViews()>
		super.addView(((View) (zzvp)));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field FrameLayout zzvp>
	//    5    9:invokespecial   #187 <Method void FrameLayout.addView(View)>
	//    6   12:return          
	}

	public final void removeView(View view)
	{
		if(zzvp == view)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field FrameLayout zzvp>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
		{
			return;
	//    4    8:return          
		} else
		{
			super.removeView(view);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #190 <Method void FrameLayout.removeView(View)>
			return;
	//    8   14:return          
		}
	}

	public final void setAdChoicesView(AdChoicesView adchoicesview)
	{
		zza("3011", ((View) (adchoicesview)));
	//    0    0:aload_0         
	//    1    1:ldc1            #130 <String "3011">
	//    2    3:aload_1         
	//    3    4:invokespecial   #194 <Method void zza(String, View)>
	//    4    7:return          
	}

	public final void setAdvertiserView(View view)
	{
		zza("3005", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #138 <String "3005">
	//    2    3:aload_1         
	//    3    4:invokespecial   #194 <Method void zza(String, View)>
	//    4    7:return          
	}

	public final void setBodyView(View view)
	{
		zza("3004", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #141 <String "3004">
	//    2    3:aload_1         
	//    3    4:invokespecial   #194 <Method void zza(String, View)>
	//    4    7:return          
	}

	public final void setCallToActionView(View view)
	{
		zza("3002", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #144 <String "3002">
	//    2    3:aload_1         
	//    3    4:invokespecial   #194 <Method void zza(String, View)>
	//    4    7:return          
	}

	public final void setClickConfirmingView(View view)
	{
		try
		{
			zzvq.zzc(ObjectWrapper.wrap(((Object) (view))));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzqa zzvq>
	//    2    4:aload_1         
	//    3    5:invokestatic    #48  <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4    8:invokeinterface #202 <Method void zzqa.zzc(IObjectWrapper)>
			return;
	//    5   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   6   14:astore_1        
		{
			zzane.zzb("Unable to call setClickConfirmingView on delegate", ((Throwable) (view)));
	//    7   15:ldc1            #204 <String "Unable to call setClickConfirmingView on delegate">
	//    8   17:aload_1         
	//    9   18:invokestatic    #60  <Method void zzane.zzb(String, Throwable)>
		}
	//   10   21:return          
	}

	public final void setHeadlineView(View view)
	{
		zza("3001", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #147 <String "3001">
	//    2    3:aload_1         
	//    3    4:invokespecial   #194 <Method void zza(String, View)>
	//    4    7:return          
	}

	public final void setIconView(View view)
	{
		zza("3003", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #150 <String "3003">
	//    2    3:aload_1         
	//    3    4:invokespecial   #194 <Method void zza(String, View)>
	//    4    7:return          
	}

	public final void setImageView(View view)
	{
		zza("3008", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #153 <String "3008">
	//    2    3:aload_1         
	//    3    4:invokespecial   #194 <Method void zza(String, View)>
	//    4    7:return          
	}

	public final void setMediaView(MediaView mediaview)
	{
		zza("3010", ((View) (mediaview)));
	//    0    0:aload_0         
	//    1    1:ldc1            #157 <String "3010">
	//    2    3:aload_1         
	//    3    4:invokespecial   #194 <Method void zza(String, View)>
	//    4    7:return          
	}

	public final void setNativeAd(UnifiedNativeAd unifiednativead)
	{
		try
		{
			zzvq.zza((IObjectWrapper)unifiednativead.zzbe());
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzqa zzvq>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #217 <Method Object UnifiedNativeAd.zzbe()>
	//    4    8:checkcast       #219 <Class IObjectWrapper>
	//    5   11:invokeinterface #221 <Method void zzqa.zza(IObjectWrapper)>
			return;
	//    6   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(UnifiedNativeAd unifiednativead)
	//*   7   17:astore_1        
		{
			zzane.zzb("Unable to call setNativeAd on delegate", ((Throwable) (unifiednativead)));
	//    8   18:ldc1            #223 <String "Unable to call setNativeAd on delegate">
	//    9   20:aload_1         
	//   10   21:invokestatic    #60  <Method void zzane.zzb(String, Throwable)>
		}
	//   11   24:return          
	}

	public final void setPriceView(View view)
	{
		zza("3007", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #168 <String "3007">
	//    2    3:aload_1         
	//    3    4:invokespecial   #194 <Method void zza(String, View)>
	//    4    7:return          
	}

	public final void setStarRatingView(View view)
	{
		zza("3009", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #171 <String "3009">
	//    2    3:aload_1         
	//    3    4:invokespecial   #194 <Method void zza(String, View)>
	//    4    7:return          
	}

	public final void setStoreView(View view)
	{
		zza("3006", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #174 <String "3006">
	//    2    3:aload_1         
	//    3    4:invokespecial   #194 <Method void zza(String, View)>
	//    4    7:return          
	}

	private final FrameLayout zzvp;
	private final zzqa zzvq;
}
