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
//			AdChoicesView, NativeAd

public class NativeAdView extends FrameLayout
{

	public NativeAdView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void FrameLayout(Context)>
		zzvh = zzb(context);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #16  <Method FrameLayout zzb(Context)>
	//    7   11:putfield        #18  <Field FrameLayout zzvh>
		zzvi = zzbf();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokespecial   #22  <Method zzqa zzbf()>
	//   11   19:putfield        #24  <Field zzqa zzvi>
	//   12   22:return          
	}

	public NativeAdView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void FrameLayout(Context, AttributeSet)>
		zzvh = zzb(context);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #16  <Method FrameLayout zzb(Context)>
	//    8   12:putfield        #18  <Field FrameLayout zzvh>
		zzvi = zzbf();
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:invokespecial   #22  <Method zzqa zzbf()>
	//   12   20:putfield        #24  <Field zzqa zzvi>
	//   13   23:return          
	}

	public NativeAdView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #31  <Method void FrameLayout(Context, AttributeSet, int)>
		zzvh = zzb(context);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:invokespecial   #16  <Method FrameLayout zzb(Context)>
	//    9   13:putfield        #18  <Field FrameLayout zzvh>
		zzvi = zzbf();
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:invokespecial   #22  <Method zzqa zzbf()>
	//   13   21:putfield        #24  <Field zzqa zzvi>
	//   14   24:return          
	}

	public NativeAdView(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #37  <Method void FrameLayout(Context, AttributeSet, int, int)>
		zzvh = zzb(context);
	//    6    9:aload_0         
	//    7   10:aload_0         
	//    8   11:aload_1         
	//    9   12:invokespecial   #16  <Method FrameLayout zzb(Context)>
	//   10   15:putfield        #18  <Field FrameLayout zzvh>
		zzvi = zzbf();
	//   11   18:aload_0         
	//   12   19:aload_0         
	//   13   20:invokespecial   #22  <Method zzqa zzbf()>
	//   14   23:putfield        #24  <Field zzqa zzvi>
	//   15   26:return          
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
	//    6   10:new             #40  <Class android.widget.FrameLayout$LayoutParams>
	//    7   13:dup             
	//    8   14:iconst_m1       
	//    9   15:iconst_m1       
	//   10   16:invokespecial   #43  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   11   19:invokevirtual   #47  <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		addView(((View) (context)));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #51  <Method void addView(View)>
		return ((FrameLayout) (context));
	//   15   27:aload_1         
	//   16   28:areturn         
	}

	private final zzqa zzbf()
	{
		Preconditions.checkNotNull(((Object) (zzvh)), "createDelegate must be called after mOverlayFrame has been created");
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field FrameLayout zzvh>
	//    2    4:ldc1            #53  <String "createDelegate must be called after mOverlayFrame has been created">
	//    3    6:invokestatic    #59  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    9:pop             
		if(isInEditMode())
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #63  <Method boolean isInEditMode()>
	//*   7   14:ifeq            19
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
		else
			return zzkb.zzig().zza(zzvh.getContext(), ((FrameLayout) (this)), zzvh);
	//   10   19:invokestatic    #69  <Method zzjr zzkb.zzig()>
	//   11   22:aload_0         
	//   12   23:getfield        #18  <Field FrameLayout zzvh>
	//   13   26:invokevirtual   #73  <Method Context FrameLayout.getContext()>
	//   14   29:aload_0         
	//   15   30:aload_0         
	//   16   31:getfield        #18  <Field FrameLayout zzvh>
	//   17   34:invokevirtual   #79  <Method zzqa zzjr.zza(Context, FrameLayout, FrameLayout)>
	//   18   37:areturn         
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.addView(view, i, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #82  <Method void FrameLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
		super.bringChildToFront(((View) (zzvh)));
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #18  <Field FrameLayout zzvh>
	//    8   12:invokespecial   #85  <Method void FrameLayout.bringChildToFront(View)>
	//    9   15:return          
	}

	public void bringChildToFront(View view)
	{
		super.bringChildToFront(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void FrameLayout.bringChildToFront(View)>
		if(zzvh != view)
	//*   3    5:aload_0         
	//*   4    6:getfield        #18  <Field FrameLayout zzvh>
	//*   5    9:aload_1         
	//*   6   10:if_acmpeq       21
			super.bringChildToFront(((View) (zzvh)));
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #18  <Field FrameLayout zzvh>
	//   10   18:invokespecial   #85  <Method void FrameLayout.bringChildToFront(View)>
	//   11   21:return          
	}

	public void destroy()
	{
		try
		{
			zzvi.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzqa zzvi>
	//    2    4:invokeinterface #93  <Method void zzqa.destroy()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			zzane.zzb("Unable to destroy native ad view", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #95  <String "Unable to destroy native ad view">
	//    6   13:aload_1         
	//    7   14:invokestatic    #100 <Method void zzane.zzb(String, Throwable)>
		}
	//    8   17:return          
	}

	public AdChoicesView getAdChoicesView()
	{
		View view = zzp("1098");
	//    0    0:aload_0         
	//    1    1:ldc1            #104 <String "1098">
	//    2    3:invokevirtual   #108 <Method View zzp(String)>
	//    3    6:astore_1        
		if(view instanceof AdChoicesView)
	//*   4    7:aload_1         
	//*   5    8:instanceof      #110 <Class AdChoicesView>
	//*   6   11:ifeq            19
			return (AdChoicesView)view;
	//    7   14:aload_1         
	//    8   15:checkcast       #110 <Class AdChoicesView>
	//    9   18:areturn         
		else
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
	}

	public void onVisibilityChanged(View view, int i)
	{
		super.onVisibilityChanged(view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #114 <Method void FrameLayout.onVisibilityChanged(View, int)>
		if(zzvi != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #24  <Field zzqa zzvi>
	//*   6   10:ifnull          35
			try
			{
				zzvi.zzb(ObjectWrapper.wrap(((Object) (view))), i);
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field zzqa zzvi>
	//    9   17:aload_1         
	//   10   18:invokestatic    #120 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   11   21:iload_2         
	//   12   22:invokeinterface #123 <Method void zzqa.zzb(IObjectWrapper, int)>
				return;
	//   13   27:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  14   28:astore_1        
			{
				zzane.zzb("Unable to call onVisibilityChanged on delegate", ((Throwable) (view)));
	//   15   29:ldc1            #125 <String "Unable to call onVisibilityChanged on delegate">
	//   16   31:aload_1         
	//   17   32:invokestatic    #100 <Method void zzane.zzb(String, Throwable)>
			}
	//   18   35:return          
	}

	public void removeAllViews()
	{
		super.removeAllViews();
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method void FrameLayout.removeAllViews()>
		super.addView(((View) (zzvh)));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field FrameLayout zzvh>
	//    5    9:invokespecial   #129 <Method void FrameLayout.addView(View)>
	//    6   12:return          
	}

	public void removeView(View view)
	{
		if(zzvh == view)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field FrameLayout zzvh>
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
	//    7   11:invokespecial   #132 <Method void FrameLayout.removeView(View)>
			return;
	//    8   14:return          
		}
	}

	public void setAdChoicesView(AdChoicesView adchoicesview)
	{
		zza("1098", ((View) (adchoicesview)));
	//    0    0:aload_0         
	//    1    1:ldc1            #104 <String "1098">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #137 <Method void zza(String, View)>
	//    4    7:return          
	}

	public void setNativeAd(NativeAd nativead)
	{
		try
		{
			zzvi.zza((IObjectWrapper)nativead.zzbe());
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzqa zzvi>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #145 <Method Object NativeAd.zzbe()>
	//    4    8:checkcast       #147 <Class IObjectWrapper>
	//    5   11:invokeinterface #150 <Method void zzqa.zza(IObjectWrapper)>
			return;
	//    6   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(NativeAd nativead)
	//*   7   17:astore_1        
		{
			zzane.zzb("Unable to call setNativeAd on delegate", ((Throwable) (nativead)));
	//    8   18:ldc1            #152 <String "Unable to call setNativeAd on delegate">
	//    9   20:aload_1         
	//   10   21:invokestatic    #100 <Method void zzane.zzb(String, Throwable)>
		}
	//   11   24:return          
	}

	protected final void zza(String s, View view)
	{
		try
		{
			zzvi.zzb(s, ObjectWrapper.wrap(((Object) (view))));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzqa zzvi>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #120 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    5    9:invokeinterface #155 <Method void zzqa.zzb(String, IObjectWrapper)>
			return;
	//    6   14:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   7   15:astore_1        
		{
			zzane.zzb("Unable to call setAssetView on delegate", ((Throwable) (s)));
	//    8   16:ldc1            #157 <String "Unable to call setAssetView on delegate">
	//    9   18:aload_1         
	//   10   19:invokestatic    #100 <Method void zzane.zzb(String, Throwable)>
		}
	//   11   22:return          
	}

	protected final View zzp(String s)
	{
		s = ((String) (zzvi.zzak(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzqa zzvi>
	//    2    4:aload_1         
	//    3    5:invokeinterface #161 <Method IObjectWrapper zzqa.zzak(String)>
	//    4   10:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_32;
	//    5   11:aload_1         
	//    6   12:ifnull          32
		s = ((String) ((View)ObjectWrapper.unwrap(((IObjectWrapper) (s)))));
	//    7   15:aload_1         
	//    8   16:invokestatic    #165 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    9   19:checkcast       #167 <Class View>
	//   10   22:astore_1        
		return ((View) (s));
	//   11   23:aload_1         
	//   12   24:areturn         
		s;
	//   13   25:astore_1        
		zzane.zzb("Unable to call getAssetView on delegate", ((Throwable) (s)));
	//   14   26:ldc1            #169 <String "Unable to call getAssetView on delegate">
	//   15   28:aload_1         
	//   16   29:invokestatic    #100 <Method void zzane.zzb(String, Throwable)>
		return null;
	//   17   32:aconst_null     
	//   18   33:areturn         
	}

	private final FrameLayout zzvh;
	private final zzqa zzvi;
}
