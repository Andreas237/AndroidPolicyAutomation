// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.ads.zzane;

// Referenced classes of package com.google.android.gms.ads.formats:
//			NativeAdView, MediaView

public final class NativeAppInstallAdView extends NativeAdView
{

	public NativeAppInstallAdView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void NativeAdView(Context)>
	//    3    5:return          
	}

	public NativeAppInstallAdView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void NativeAdView(Context, AttributeSet)>
	//    4    6:return          
	}

	public NativeAppInstallAdView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #15  <Method void NativeAdView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NativeAppInstallAdView(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #18  <Method void NativeAdView(Context, AttributeSet, int, int)>
	//    6    9:return          
	}

	public final View getBodyView()
	{
		return super.zzp("2004");
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <String "2004">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final View getCallToActionView()
	{
		return super.zzp("2002");
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <String "2002">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final View getHeadlineView()
	{
		return super.zzp("2001");
	//    0    0:aload_0         
	//    1    1:ldc1            #32  <String "2001">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final View getIconView()
	{
		return super.zzp("2003");
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "2003">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final View getImageView()
	{
		return super.zzp("2007");
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "2007">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final MediaView getMediaView()
	{
		View view = super.zzp("2011");
	//    0    0:aload_0         
	//    1    1:ldc1            #42  <String "2011">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:astore_1        
		if(view instanceof MediaView)
	//*   4    7:aload_1         
	//*   5    8:instanceof      #44  <Class MediaView>
	//*   6   11:ifeq            19
			return (MediaView)view;
	//    7   14:aload_1         
	//    8   15:checkcast       #44  <Class MediaView>
	//    9   18:areturn         
		if(view != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          28
			zzane.zzck("View is not an instance of MediaView");
	//   12   23:ldc1            #46  <String "View is not an instance of MediaView">
	//   13   25:invokestatic    #52  <Method void zzane.zzck(String)>
		return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
	}

	public final View getPriceView()
	{
		return super.zzp("2006");
	//    0    0:aload_0         
	//    1    1:ldc1            #55  <String "2006">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final View getStarRatingView()
	{
		return super.zzp("2008");
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "2008">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final View getStoreView()
	{
		return super.zzp("2005");
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "2005">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final void setBodyView(View view)
	{
		super.zza("2004", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <String "2004">
	//    2    3:aload_1         
	//    3    4:invokespecial   #67  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setCallToActionView(View view)
	{
		super.zza("2002", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <String "2002">
	//    2    3:aload_1         
	//    3    4:invokespecial   #67  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setHeadlineView(View view)
	{
		super.zza("2001", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #32  <String "2001">
	//    2    3:aload_1         
	//    3    4:invokespecial   #67  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setIconView(View view)
	{
		super.zza("2003", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "2003">
	//    2    3:aload_1         
	//    3    4:invokespecial   #67  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setImageView(View view)
	{
		super.zza("2007", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "2007">
	//    2    3:aload_1         
	//    3    4:invokespecial   #67  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setMediaView(MediaView mediaview)
	{
		super.zza("2011", ((View) (mediaview)));
	//    0    0:aload_0         
	//    1    1:ldc1            #42  <String "2011">
	//    2    3:aload_1         
	//    3    4:invokespecial   #67  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setPriceView(View view)
	{
		super.zza("2006", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #55  <String "2006">
	//    2    3:aload_1         
	//    3    4:invokespecial   #67  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setStarRatingView(View view)
	{
		super.zza("2008", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "2008">
	//    2    3:aload_1         
	//    3    4:invokespecial   #67  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setStoreView(View view)
	{
		super.zza("2005", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "2005">
	//    2    3:aload_1         
	//    3    4:invokespecial   #67  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}
}
