// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.*;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import java.util.WeakHashMap;

// Referenced classes of package com.google.ads.mediation:
//			AbstractAdViewAdapter

static final class AbstractAdViewAdapter$zza extends NativeAppInstallAdMapper
{

	public final void trackView(View view)
	{
		if(view instanceof NativeAdView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #107 <Class NativeAdView>
	//*   2    4:ifeq            18
			((NativeAdView)view).setNativeAd(((com.google.android.gms.ads.formats.NativeAd) (zzhe)));
	//    3    7:aload_1         
	//    4    8:checkcast       #107 <Class NativeAdView>
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field NativeAppInstallAd zzhe>
	//    7   15:invokevirtual   #111 <Method void NativeAdView.setNativeAd(com.google.android.gms.ads.formats.NativeAd)>
		view = ((View) ((NativeAdViewHolder)NativeAdViewHolder.zzvk.get(((Object) (view)))));
	//    8   18:getstatic       #117 <Field WeakHashMap NativeAdViewHolder.zzvk>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #123 <Method Object WeakHashMap.get(Object)>
	//   11   25:checkcast       #113 <Class NativeAdViewHolder>
	//   12   28:astore_1        
		if(view != null)
	//*  13   29:aload_1         
	//*  14   30:ifnull          41
			((NativeAdViewHolder) (view)).setNativeAd(((com.google.android.gms.ads.formats.NativeAd) (zzhe)));
	//   15   33:aload_1         
	//   16   34:aload_0         
	//   17   35:getfield        #16  <Field NativeAppInstallAd zzhe>
	//   18   38:invokevirtual   #124 <Method void NativeAdViewHolder.setNativeAd(com.google.android.gms.ads.formats.NativeAd)>
	//   19   41:return          
	}

	private final NativeAppInstallAd zzhe;

	public AbstractAdViewAdapter$zza(NativeAppInstallAd nativeappinstallad)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NativeAppInstallAdMapper()>
		zzhe = nativeappinstallad;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field NativeAppInstallAd zzhe>
		((NativeAppInstallAdMapper)this).setHeadline(nativeappinstallad.getHeadline().toString());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #22  <Method CharSequence NativeAppInstallAd.getHeadline()>
	//    8   14:invokeinterface #28  <Method String CharSequence.toString()>
	//    9   19:invokevirtual   #32  <Method void NativeAppInstallAdMapper.setHeadline(String)>
		((NativeAppInstallAdMapper)this).setImages(nativeappinstallad.getImages());
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #36  <Method java.util.List NativeAppInstallAd.getImages()>
	//   13   27:invokevirtual   #40  <Method void NativeAppInstallAdMapper.setImages(java.util.List)>
		((NativeAppInstallAdMapper)this).setBody(nativeappinstallad.getBody().toString());
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #43  <Method CharSequence NativeAppInstallAd.getBody()>
	//   17   35:invokeinterface #28  <Method String CharSequence.toString()>
	//   18   40:invokevirtual   #46  <Method void NativeAppInstallAdMapper.setBody(String)>
		((NativeAppInstallAdMapper)this).setIcon(nativeappinstallad.getIcon());
	//   19   43:aload_0         
	//   20   44:aload_1         
	//   21   45:invokevirtual   #50  <Method com.google.android.gms.ads.formats.NativeAd$Image NativeAppInstallAd.getIcon()>
	//   22   48:invokevirtual   #54  <Method void NativeAppInstallAdMapper.setIcon(com.google.android.gms.ads.formats.NativeAd$Image)>
		((NativeAppInstallAdMapper)this).setCallToAction(nativeappinstallad.getCallToAction().toString());
	//   23   51:aload_0         
	//   24   52:aload_1         
	//   25   53:invokevirtual   #57  <Method CharSequence NativeAppInstallAd.getCallToAction()>
	//   26   56:invokeinterface #28  <Method String CharSequence.toString()>
	//   27   61:invokevirtual   #60  <Method void NativeAppInstallAdMapper.setCallToAction(String)>
		if(nativeappinstallad.getStarRating() != null)
	//*  28   64:aload_1         
	//*  29   65:invokevirtual   #64  <Method Double NativeAppInstallAd.getStarRating()>
	//*  30   68:ifnull          82
			((NativeAppInstallAdMapper)this).setStarRating(nativeappinstallad.getStarRating().doubleValue());
	//   31   71:aload_0         
	//   32   72:aload_1         
	//   33   73:invokevirtual   #64  <Method Double NativeAppInstallAd.getStarRating()>
	//   34   76:invokevirtual   #70  <Method double Double.doubleValue()>
	//   35   79:invokevirtual   #74  <Method void NativeAppInstallAdMapper.setStarRating(double)>
		if(nativeappinstallad.getStore() != null)
	//*  36   82:aload_1         
	//*  37   83:invokevirtual   #77  <Method CharSequence NativeAppInstallAd.getStore()>
	//*  38   86:ifnull          102
			((NativeAppInstallAdMapper)this).setStore(nativeappinstallad.getStore().toString());
	//   39   89:aload_0         
	//   40   90:aload_1         
	//   41   91:invokevirtual   #77  <Method CharSequence NativeAppInstallAd.getStore()>
	//   42   94:invokeinterface #28  <Method String CharSequence.toString()>
	//   43   99:invokevirtual   #80  <Method void NativeAppInstallAdMapper.setStore(String)>
		if(nativeappinstallad.getPrice() != null)
	//*  44  102:aload_1         
	//*  45  103:invokevirtual   #83  <Method CharSequence NativeAppInstallAd.getPrice()>
	//*  46  106:ifnull          122
			((NativeAppInstallAdMapper)this).setPrice(nativeappinstallad.getPrice().toString());
	//   47  109:aload_0         
	//   48  110:aload_1         
	//   49  111:invokevirtual   #83  <Method CharSequence NativeAppInstallAd.getPrice()>
	//   50  114:invokeinterface #28  <Method String CharSequence.toString()>
	//   51  119:invokevirtual   #86  <Method void NativeAppInstallAdMapper.setPrice(String)>
		((NativeAdMapper)this).setOverrideImpressionRecording(true);
	//   52  122:aload_0         
	//   53  123:iconst_1        
	//   54  124:invokevirtual   #92  <Method void NativeAdMapper.setOverrideImpressionRecording(boolean)>
		((NativeAdMapper)this).setOverrideClickHandling(true);
	//   55  127:aload_0         
	//   56  128:iconst_1        
	//   57  129:invokevirtual   #95  <Method void NativeAdMapper.setOverrideClickHandling(boolean)>
		((NativeAdMapper)this).zza(nativeappinstallad.getVideoController());
	//   58  132:aload_0         
	//   59  133:aload_1         
	//   60  134:invokevirtual   #99  <Method com.google.android.gms.ads.VideoController NativeAppInstallAd.getVideoController()>
	//   61  137:invokevirtual   #102 <Method void NativeAdMapper.zza(com.google.android.gms.ads.VideoController)>
	//   62  140:return          
	}
}
