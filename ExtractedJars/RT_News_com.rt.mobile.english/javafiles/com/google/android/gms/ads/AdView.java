// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzly;

// Referenced classes of package com.google.android.gms.ads:
//			BaseAdView, AdListener, AdSize, VideoController, 
//			AdRequest

public final class AdView extends BaseAdView
{

	public AdView(Context context)
	{
		super(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #9   <Method void BaseAdView(Context, int)>
		Preconditions.checkNotNull(((Object) (context)), "Context cannot be null");
	//    4    6:aload_1         
	//    5    7:ldc1            #11  <String "Context cannot be null">
	//    6    9:invokestatic    #17  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    7   12:pop             
	//    8   13:return          
	}

	public AdView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #22  <Method void BaseAdView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public AdView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #25  <Method void BaseAdView(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public final volatile void destroy()
	{
		super.destroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void BaseAdView.destroy()>
	//    2    4:return          
	}

	public final volatile AdListener getAdListener()
	{
		return super.getAdListener();
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method AdListener BaseAdView.getAdListener()>
	//    2    4:areturn         
	}

	public final volatile AdSize getAdSize()
	{
		return super.getAdSize();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method AdSize BaseAdView.getAdSize()>
	//    2    4:areturn         
	}

	public final volatile String getAdUnitId()
	{
		return super.getAdUnitId();
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method String BaseAdView.getAdUnitId()>
	//    2    4:areturn         
	}

	public final volatile String getMediationAdapterClassName()
	{
		return super.getMediationAdapterClassName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method String BaseAdView.getMediationAdapterClassName()>
	//    2    4:areturn         
	}

	public final VideoController getVideoController()
	{
		if(zzut != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field zzly zzut>
	//*   2    4:ifnull          15
			return zzut.getVideoController();
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field zzly zzut>
	//    5   11:invokevirtual   #54  <Method VideoController zzly.getVideoController()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public final volatile boolean isLoading()
	{
		return super.isLoading();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method boolean BaseAdView.isLoading()>
	//    2    4:ireturn         
	}

	public final volatile void loadAd(AdRequest adrequest)
	{
		super.loadAd(adrequest);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void BaseAdView.loadAd(AdRequest)>
	//    3    5:return          
	}

	public final volatile void pause()
	{
		super.pause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void BaseAdView.pause()>
	//    2    4:return          
	}

	public final volatile void resume()
	{
		super.resume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void BaseAdView.resume()>
	//    2    4:return          
	}

	public final volatile void setAdListener(AdListener adlistener)
	{
		super.setAdListener(adlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void BaseAdView.setAdListener(AdListener)>
	//    3    5:return          
	}

	public final volatile void setAdSize(AdSize adsize)
	{
		super.setAdSize(adsize);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method void BaseAdView.setAdSize(AdSize)>
	//    3    5:return          
	}

	public final volatile void setAdUnitId(String s)
	{
		super.setAdUnitId(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #84  <Method void BaseAdView.setAdUnitId(String)>
	//    3    5:return          
	}
}
