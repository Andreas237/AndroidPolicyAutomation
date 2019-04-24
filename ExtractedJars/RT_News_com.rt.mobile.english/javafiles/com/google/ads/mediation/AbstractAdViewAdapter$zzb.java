// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.*;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import java.util.WeakHashMap;

// Referenced classes of package com.google.ads.mediation:
//			AbstractAdViewAdapter

static final class AbstractAdViewAdapter$zzb extends NativeContentAdMapper
{

	public final void trackView(View view)
	{
		if(view instanceof NativeAdView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #88  <Class NativeAdView>
	//*   2    4:ifeq            18
			((NativeAdView)view).setNativeAd(((com.google.android.gms.ads.formats.NativeAd) (zzhf)));
	//    3    7:aload_1         
	//    4    8:checkcast       #88  <Class NativeAdView>
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field NativeContentAd zzhf>
	//    7   15:invokevirtual   #92  <Method void NativeAdView.setNativeAd(com.google.android.gms.ads.formats.NativeAd)>
		view = ((View) ((NativeAdViewHolder)NativeAdViewHolder.zzvk.get(((Object) (view)))));
	//    8   18:getstatic       #98  <Field WeakHashMap NativeAdViewHolder.zzvk>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #104 <Method Object WeakHashMap.get(Object)>
	//   11   25:checkcast       #94  <Class NativeAdViewHolder>
	//   12   28:astore_1        
		if(view != null)
	//*  13   29:aload_1         
	//*  14   30:ifnull          41
			((NativeAdViewHolder) (view)).setNativeAd(((com.google.android.gms.ads.formats.NativeAd) (zzhf)));
	//   15   33:aload_1         
	//   16   34:aload_0         
	//   17   35:getfield        #16  <Field NativeContentAd zzhf>
	//   18   38:invokevirtual   #105 <Method void NativeAdViewHolder.setNativeAd(com.google.android.gms.ads.formats.NativeAd)>
	//   19   41:return          
	}

	private final NativeContentAd zzhf;

	public AbstractAdViewAdapter$zzb(NativeContentAd nativecontentad)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NativeContentAdMapper()>
		zzhf = nativecontentad;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field NativeContentAd zzhf>
		((NativeContentAdMapper)this).setHeadline(nativecontentad.getHeadline().toString());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #22  <Method CharSequence NativeContentAd.getHeadline()>
	//    8   14:invokeinterface #28  <Method String CharSequence.toString()>
	//    9   19:invokevirtual   #32  <Method void NativeContentAdMapper.setHeadline(String)>
		((NativeContentAdMapper)this).setImages(nativecontentad.getImages());
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #36  <Method java.util.List NativeContentAd.getImages()>
	//   13   27:invokevirtual   #40  <Method void NativeContentAdMapper.setImages(java.util.List)>
		((NativeContentAdMapper)this).setBody(nativecontentad.getBody().toString());
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #43  <Method CharSequence NativeContentAd.getBody()>
	//   17   35:invokeinterface #28  <Method String CharSequence.toString()>
	//   18   40:invokevirtual   #46  <Method void NativeContentAdMapper.setBody(String)>
		if(nativecontentad.getLogo() != null)
	//*  19   43:aload_1         
	//*  20   44:invokevirtual   #50  <Method com.google.android.gms.ads.formats.NativeAd$Image NativeContentAd.getLogo()>
	//*  21   47:ifnull          58
			((NativeContentAdMapper)this).setLogo(nativecontentad.getLogo());
	//   22   50:aload_0         
	//   23   51:aload_1         
	//   24   52:invokevirtual   #50  <Method com.google.android.gms.ads.formats.NativeAd$Image NativeContentAd.getLogo()>
	//   25   55:invokevirtual   #54  <Method void NativeContentAdMapper.setLogo(com.google.android.gms.ads.formats.NativeAd$Image)>
		((NativeContentAdMapper)this).setCallToAction(nativecontentad.getCallToAction().toString());
	//   26   58:aload_0         
	//   27   59:aload_1         
	//   28   60:invokevirtual   #57  <Method CharSequence NativeContentAd.getCallToAction()>
	//   29   63:invokeinterface #28  <Method String CharSequence.toString()>
	//   30   68:invokevirtual   #60  <Method void NativeContentAdMapper.setCallToAction(String)>
		((NativeContentAdMapper)this).setAdvertiser(nativecontentad.getAdvertiser().toString());
	//   31   71:aload_0         
	//   32   72:aload_1         
	//   33   73:invokevirtual   #63  <Method CharSequence NativeContentAd.getAdvertiser()>
	//   34   76:invokeinterface #28  <Method String CharSequence.toString()>
	//   35   81:invokevirtual   #66  <Method void NativeContentAdMapper.setAdvertiser(String)>
		((NativeAdMapper)this).setOverrideImpressionRecording(true);
	//   36   84:aload_0         
	//   37   85:iconst_1        
	//   38   86:invokevirtual   #72  <Method void NativeAdMapper.setOverrideImpressionRecording(boolean)>
		((NativeAdMapper)this).setOverrideClickHandling(true);
	//   39   89:aload_0         
	//   40   90:iconst_1        
	//   41   91:invokevirtual   #75  <Method void NativeAdMapper.setOverrideClickHandling(boolean)>
		((NativeAdMapper)this).zza(nativecontentad.getVideoController());
	//   42   94:aload_0         
	//   43   95:aload_1         
	//   44   96:invokevirtual   #79  <Method com.google.android.gms.ads.VideoController NativeContentAd.getVideoController()>
	//   45   99:invokevirtual   #83  <Method void NativeAdMapper.zza(com.google.android.gms.ads.VideoController)>
	//   46  102:return          
	}
}
