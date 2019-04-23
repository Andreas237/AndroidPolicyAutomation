// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.c.a;
import com.google.android.gms.c.d;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.internal.ads.*;

// Referenced classes of package com.google.android.gms.ads.formats:
//			a, MediaView, p

public final class UnifiedNativeAdView extends FrameLayout
{

	public UnifiedNativeAdView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void FrameLayout(Context, AttributeSet)>
		a = a(context);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #15  <Method FrameLayout a(Context)>
	//    8   12:putfield        #17  <Field FrameLayout a>
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:invokespecial   #20  <Method cj a()>
	//   12   20:putfield        #22  <Field cj b>
	//   13   23:return          
	}

	private final View a(String s)
	{
		s = ((String) (b.a(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field cj b>
	//    2    4:aload_1         
	//    3    5:invokeinterface #31  <Method a cj.a(String)>
	//    4   10:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_32;
	//    5   11:aload_1         
	//    6   12:ifnull          32
		s = ((String) ((View)d.a(((a) (s)))));
	//    7   15:aload_1         
	//    8   16:invokestatic    #36  <Method Object d.a(a)>
	//    9   19:checkcast       #38  <Class View>
	//   10   22:astore_1        
		return ((View) (s));
	//   11   23:aload_1         
	//   12   24:areturn         
		s;
	//   13   25:astore_1        
		aag.b("Unable to call getAssetView on delegate", ((Throwable) (s)));
	//   14   26:ldc1            #40  <String "Unable to call getAssetView on delegate">
	//   15   28:aload_1         
	//   16   29:invokestatic    #45  <Method void aag.b(String, Throwable)>
		return null;
	//   17   32:aconst_null     
	//   18   33:areturn         
	}

	private final FrameLayout a(Context context)
	{
		context = ((Context) (new FrameLayout(context)));
	//    0    0:new             #4   <Class FrameLayout>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #48  <Method void FrameLayout(Context)>
	//    4    8:astore_1        
		((FrameLayout) (context)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//    5    9:aload_1         
	//    6   10:new             #50  <Class android.widget.FrameLayout$LayoutParams>
	//    7   13:dup             
	//    8   14:iconst_m1       
	//    9   15:iconst_m1       
	//   10   16:invokespecial   #53  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   11   19:invokevirtual   #57  <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		addView(((View) (context)));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #61  <Method void addView(View)>
		return ((FrameLayout) (context));
	//   15   27:aload_1         
	//   16   28:areturn         
	}

	private final cj a()
	{
		am.a(((Object) (a)), "createDelegate must be called after overlayFrame has been created");
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field FrameLayout a>
	//    2    4:ldc1            #63  <String "createDelegate must be called after overlayFrame has been created">
	//    3    6:invokestatic    #68  <Method Object am.a(Object, Object)>
	//    4    9:pop             
		if(isInEditMode())
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #72  <Method boolean isInEditMode()>
	//*   7   14:ifeq            19
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
		else
			return bwk.b().a(a.getContext(), ((FrameLayout) (this)), a);
	//   10   19:invokestatic    #77  <Method bwa bwk.b()>
	//   11   22:aload_0         
	//   12   23:getfield        #17  <Field FrameLayout a>
	//   13   26:invokevirtual   #81  <Method Context FrameLayout.getContext()>
	//   14   29:aload_0         
	//   15   30:aload_0         
	//   16   31:getfield        #17  <Field FrameLayout a>
	//   17   34:invokevirtual   #86  <Method cj bwa.a(Context, FrameLayout, FrameLayout)>
	//   18   37:areturn         
	}

	private final void a(String s, View view)
	{
		try
		{
			b.a(s, d.a(((Object) (view))));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field cj b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #90  <Method a d.a(Object)>
	//    5    9:invokeinterface #93  <Method void cj.a(String, a)>
			return;
	//    6   14:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   7   15:astore_1        
		{
			aag.b("Unable to call setAssetView on delegate", ((Throwable) (s)));
	//    8   16:ldc1            #95  <String "Unable to call setAssetView on delegate">
	//    9   18:aload_1         
	//   10   19:invokestatic    #45  <Method void aag.b(String, Throwable)>
		}
	//   11   22:return          
	}

	public final void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.addView(view, i, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #98  <Method void FrameLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
		super.bringChildToFront(((View) (a)));
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #17  <Field FrameLayout a>
	//    8   12:invokespecial   #101 <Method void FrameLayout.bringChildToFront(View)>
	//    9   15:return          
	}

	public final void bringChildToFront(View view)
	{
		super.bringChildToFront(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method void FrameLayout.bringChildToFront(View)>
		FrameLayout framelayout = a;
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field FrameLayout a>
	//    5    9:astore_2        
		if(framelayout != view)
	//*   6   10:aload_2         
	//*   7   11:aload_1         
	//*   8   12:if_acmpeq       20
			super.bringChildToFront(((View) (framelayout)));
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:invokespecial   #101 <Method void FrameLayout.bringChildToFront(View)>
	//   12   20:return          
	}

	public final com.google.android.gms.ads.formats.a getAdChoicesView()
	{
		View view = a("3011");
	//    0    0:aload_0         
	//    1    1:ldc1            #105 <String "3011">
	//    2    3:invokespecial   #107 <Method View a(String)>
	//    3    6:astore_1        
		if(view instanceof com.google.android.gms.ads.formats.a)
	//*   4    7:aload_1         
	//*   5    8:instanceof      #109 <Class com.google.android.gms.ads.formats.a>
	//*   6   11:ifeq            19
			return (com.google.android.gms.ads.formats.a)view;
	//    7   14:aload_1         
	//    8   15:checkcast       #109 <Class com.google.android.gms.ads.formats.a>
	//    9   18:areturn         
		else
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
	}

	public final View getAdvertiserView()
	{
		return a("3005");
	//    0    0:aload_0         
	//    1    1:ldc1            #113 <String "3005">
	//    2    3:invokespecial   #107 <Method View a(String)>
	//    3    6:areturn         
	}

	public final View getBodyView()
	{
		return a("3004");
	//    0    0:aload_0         
	//    1    1:ldc1            #116 <String "3004">
	//    2    3:invokespecial   #107 <Method View a(String)>
	//    3    6:areturn         
	}

	public final View getCallToActionView()
	{
		return a("3002");
	//    0    0:aload_0         
	//    1    1:ldc1            #119 <String "3002">
	//    2    3:invokespecial   #107 <Method View a(String)>
	//    3    6:areturn         
	}

	public final View getHeadlineView()
	{
		return a("3001");
	//    0    0:aload_0         
	//    1    1:ldc1            #122 <String "3001">
	//    2    3:invokespecial   #107 <Method View a(String)>
	//    3    6:areturn         
	}

	public final View getIconView()
	{
		return a("3003");
	//    0    0:aload_0         
	//    1    1:ldc1            #125 <String "3003">
	//    2    3:invokespecial   #107 <Method View a(String)>
	//    3    6:areturn         
	}

	public final View getImageView()
	{
		return a("3008");
	//    0    0:aload_0         
	//    1    1:ldc1            #128 <String "3008">
	//    2    3:invokespecial   #107 <Method View a(String)>
	//    3    6:areturn         
	}

	public final MediaView getMediaView()
	{
		View view = a("3010");
	//    0    0:aload_0         
	//    1    1:ldc1            #132 <String "3010">
	//    2    3:invokespecial   #107 <Method View a(String)>
	//    3    6:astore_1        
		if(view instanceof MediaView)
	//*   4    7:aload_1         
	//*   5    8:instanceof      #134 <Class MediaView>
	//*   6   11:ifeq            19
			return (MediaView)view;
	//    7   14:aload_1         
	//    8   15:checkcast       #134 <Class MediaView>
	//    9   18:areturn         
		if(view != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          28
			aag.b("View is not an instance of MediaView");
	//   12   23:ldc1            #136 <String "View is not an instance of MediaView">
	//   13   25:invokestatic    #139 <Method void aag.b(String)>
		return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
	}

	public final View getPriceView()
	{
		return a("3007");
	//    0    0:aload_0         
	//    1    1:ldc1            #142 <String "3007">
	//    2    3:invokespecial   #107 <Method View a(String)>
	//    3    6:areturn         
	}

	public final View getStarRatingView()
	{
		return a("3009");
	//    0    0:aload_0         
	//    1    1:ldc1            #145 <String "3009">
	//    2    3:invokespecial   #107 <Method View a(String)>
	//    3    6:areturn         
	}

	public final View getStoreView()
	{
		return a("3006");
	//    0    0:aload_0         
	//    1    1:ldc1            #148 <String "3006">
	//    2    3:invokespecial   #107 <Method View a(String)>
	//    3    6:areturn         
	}

	public final void onVisibilityChanged(View view, int i)
	{
		super.onVisibilityChanged(view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #152 <Method void FrameLayout.onVisibilityChanged(View, int)>
		cj cj1 = b;
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field cj b>
	//    6   10:astore_3        
		if(cj1 != null)
	//*   7   11:aload_3         
	//*   8   12:ifnull          34
			try
			{
				cj1.a(d.a(((Object) (view))), i);
	//    9   15:aload_3         
	//   10   16:aload_1         
	//   11   17:invokestatic    #90  <Method a d.a(Object)>
	//   12   20:iload_2         
	//   13   21:invokeinterface #155 <Method void cj.a(a, int)>
				return;
	//   14   26:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  15   27:astore_1        
			{
				aag.b("Unable to call onVisibilityChanged on delegate", ((Throwable) (view)));
	//   16   28:ldc1            #157 <String "Unable to call onVisibilityChanged on delegate">
	//   17   30:aload_1         
	//   18   31:invokestatic    #45  <Method void aag.b(String, Throwable)>
			}
	//   19   34:return          
	}

	public final void removeAllViews()
	{
		super.removeAllViews();
	//    0    0:aload_0         
	//    1    1:invokespecial   #161 <Method void FrameLayout.removeAllViews()>
		super.addView(((View) (a)));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field FrameLayout a>
	//    5    9:invokespecial   #162 <Method void FrameLayout.addView(View)>
	//    6   12:return          
	}

	public final void removeView(View view)
	{
		if(a == view)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field FrameLayout a>
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
	//    7   11:invokespecial   #165 <Method void FrameLayout.removeView(View)>
			return;
	//    8   14:return          
		}
	}

	public final void setAdChoicesView(com.google.android.gms.ads.formats.a a1)
	{
		a("3011", ((View) (a1)));
	//    0    0:aload_0         
	//    1    1:ldc1            #105 <String "3011">
	//    2    3:aload_1         
	//    3    4:invokespecial   #169 <Method void a(String, View)>
	//    4    7:return          
	}

	public final void setAdvertiserView(View view)
	{
		a("3005", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #113 <String "3005">
	//    2    3:aload_1         
	//    3    4:invokespecial   #169 <Method void a(String, View)>
	//    4    7:return          
	}

	public final void setBodyView(View view)
	{
		a("3004", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #116 <String "3004">
	//    2    3:aload_1         
	//    3    4:invokespecial   #169 <Method void a(String, View)>
	//    4    7:return          
	}

	public final void setCallToActionView(View view)
	{
		a("3002", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #119 <String "3002">
	//    2    3:aload_1         
	//    3    4:invokespecial   #169 <Method void a(String, View)>
	//    4    7:return          
	}

	public final void setClickConfirmingView(View view)
	{
		try
		{
			b.b(d.a(((Object) (view))));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field cj b>
	//    2    4:aload_1         
	//    3    5:invokestatic    #90  <Method a d.a(Object)>
	//    4    8:invokeinterface #176 <Method void cj.b(a)>
			return;
	//    5   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*   6   14:astore_1        
		{
			aag.b("Unable to call setClickConfirmingView on delegate", ((Throwable) (view)));
	//    7   15:ldc1            #178 <String "Unable to call setClickConfirmingView on delegate">
	//    8   17:aload_1         
	//    9   18:invokestatic    #45  <Method void aag.b(String, Throwable)>
		}
	//   10   21:return          
	}

	public final void setHeadlineView(View view)
	{
		a("3001", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #122 <String "3001">
	//    2    3:aload_1         
	//    3    4:invokespecial   #169 <Method void a(String, View)>
	//    4    7:return          
	}

	public final void setIconView(View view)
	{
		a("3003", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #125 <String "3003">
	//    2    3:aload_1         
	//    3    4:invokespecial   #169 <Method void a(String, View)>
	//    4    7:return          
	}

	public final void setImageView(View view)
	{
		a("3008", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #128 <String "3008">
	//    2    3:aload_1         
	//    3    4:invokespecial   #169 <Method void a(String, View)>
	//    4    7:return          
	}

	public final void setMediaView(MediaView mediaview)
	{
		a("3010", ((View) (mediaview)));
	//    0    0:aload_0         
	//    1    1:ldc1            #132 <String "3010">
	//    2    3:aload_1         
	//    3    4:invokespecial   #169 <Method void a(String, View)>
	//    4    7:return          
	}

	public final void setNativeAd(p p1)
	{
		try
		{
			b.a((a)p1.k());
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field cj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #191 <Method Object p.k()>
	//    4    8:checkcast       #193 <Class a>
	//    5   11:invokeinterface #195 <Method void cj.a(a)>
			return;
	//    6   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(p p1)
	//*   7   17:astore_1        
		{
			aag.b("Unable to call setNativeAd on delegate", ((Throwable) (p1)));
	//    8   18:ldc1            #197 <String "Unable to call setNativeAd on delegate">
	//    9   20:aload_1         
	//   10   21:invokestatic    #45  <Method void aag.b(String, Throwable)>
		}
	//   11   24:return          
	}

	public final void setPriceView(View view)
	{
		a("3007", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #142 <String "3007">
	//    2    3:aload_1         
	//    3    4:invokespecial   #169 <Method void a(String, View)>
	//    4    7:return          
	}

	public final void setStarRatingView(View view)
	{
		a("3009", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #145 <String "3009">
	//    2    3:aload_1         
	//    3    4:invokespecial   #169 <Method void a(String, View)>
	//    4    7:return          
	}

	public final void setStoreView(View view)
	{
		a("3006", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #148 <String "3006">
	//    2    3:aload_1         
	//    3    4:invokespecial   #169 <Method void a(String, View)>
	//    4    7:return          
	}

	private final FrameLayout a;
	private final cj b = a();
}
