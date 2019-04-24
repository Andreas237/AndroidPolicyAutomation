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

public final class NativeContentAdView extends NativeAdView
{

	public NativeContentAdView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void NativeAdView(Context)>
	//    3    5:return          
	}

	public NativeContentAdView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void NativeAdView(Context, AttributeSet)>
	//    4    6:return          
	}

	public NativeContentAdView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #15  <Method void NativeAdView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NativeContentAdView(Context context, AttributeSet attributeset, int i, int j)
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

	public final View getAdvertiserView()
	{
		return super.zzp("1004");
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <String "1004">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final View getBodyView()
	{
		return super.zzp("1002");
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <String "1002">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final View getCallToActionView()
	{
		return super.zzp("1003");
	//    0    0:aload_0         
	//    1    1:ldc1            #32  <String "1003">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final View getHeadlineView()
	{
		return super.zzp("1001");
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "1001">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final View getImageView()
	{
		return super.zzp("1005");
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "1005">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final View getLogoView()
	{
		return super.zzp("1006");
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <String "1006">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:areturn         
	}

	public final MediaView getMediaView()
	{
		View view = super.zzp("1009");
	//    0    0:aload_0         
	//    1    1:ldc1            #45  <String "1009">
	//    2    3:invokespecial   #26  <Method View NativeAdView.zzp(String)>
	//    3    6:astore_1        
		if(view instanceof MediaView)
	//*   4    7:aload_1         
	//*   5    8:instanceof      #47  <Class MediaView>
	//*   6   11:ifeq            19
			return (MediaView)view;
	//    7   14:aload_1         
	//    8   15:checkcast       #47  <Class MediaView>
	//    9   18:areturn         
		if(view != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          28
			zzane.zzck("View is not an instance of MediaView");
	//   12   23:ldc1            #49  <String "View is not an instance of MediaView">
	//   13   25:invokestatic    #55  <Method void zzane.zzck(String)>
		return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
	}

	public final void setAdvertiserView(View view)
	{
		super.zza("1004", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <String "1004">
	//    2    3:aload_1         
	//    3    4:invokespecial   #61  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setBodyView(View view)
	{
		super.zza("1002", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <String "1002">
	//    2    3:aload_1         
	//    3    4:invokespecial   #61  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setCallToActionView(View view)
	{
		super.zza("1003", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #32  <String "1003">
	//    2    3:aload_1         
	//    3    4:invokespecial   #61  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setHeadlineView(View view)
	{
		super.zza("1001", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "1001">
	//    2    3:aload_1         
	//    3    4:invokespecial   #61  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setImageView(View view)
	{
		super.zza("1005", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "1005">
	//    2    3:aload_1         
	//    3    4:invokespecial   #61  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setLogoView(View view)
	{
		super.zza("1006", view);
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <String "1006">
	//    2    3:aload_1         
	//    3    4:invokespecial   #61  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}

	public final void setMediaView(MediaView mediaview)
	{
		super.zza("1009", ((View) (mediaview)));
	//    0    0:aload_0         
	//    1    1:ldc1            #45  <String "1009">
	//    2    3:aload_1         
	//    3    4:invokespecial   #61  <Method void NativeAdView.zza(String, View)>
	//    4    7:return          
	}
}
