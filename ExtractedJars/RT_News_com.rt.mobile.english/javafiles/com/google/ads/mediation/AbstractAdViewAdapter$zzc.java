// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.*;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;
import java.util.WeakHashMap;

// Referenced classes of package com.google.ads.mediation:
//			AbstractAdViewAdapter

static final class AbstractAdViewAdapter$zzc extends UnifiedNativeAdMapper
{

	public final void trackViews(View view, Map map, Map map1)
	{
		if(view instanceof UnifiedNativeAdView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #108 <Class UnifiedNativeAdView>
	//*   2    4:ifeq            19
		{
			((UnifiedNativeAdView)view).setNativeAd(zzhg);
	//    3    7:aload_1         
	//    4    8:checkcast       #108 <Class UnifiedNativeAdView>
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field UnifiedNativeAd zzhg>
	//    7   15:invokevirtual   #111 <Method void UnifiedNativeAdView.setNativeAd(UnifiedNativeAd)>
			return;
	//    8   18:return          
		}
		view = ((View) ((NativeAdViewHolder)NativeAdViewHolder.zzvk.get(((Object) (view)))));
	//    9   19:getstatic       #117 <Field WeakHashMap NativeAdViewHolder.zzvk>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #123 <Method Object WeakHashMap.get(Object)>
	//   12   26:checkcast       #113 <Class NativeAdViewHolder>
	//   13   29:astore_1        
		if(view != null)
	//*  14   30:aload_1         
	//*  15   31:ifnull          42
			((NativeAdViewHolder) (view)).setNativeAd(zzhg);
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:getfield        #16  <Field UnifiedNativeAd zzhg>
	//   19   39:invokevirtual   #124 <Method void NativeAdViewHolder.setNativeAd(UnifiedNativeAd)>
	//   20   42:return          
	}

	private final UnifiedNativeAd zzhg;

	public AbstractAdViewAdapter$zzc(UnifiedNativeAd unifiednativead)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void UnifiedNativeAdMapper()>
		zzhg = unifiednativead;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field UnifiedNativeAd zzhg>
		((UnifiedNativeAdMapper)this).setHeadline(unifiednativead.getHeadline());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #22  <Method String UnifiedNativeAd.getHeadline()>
	//    8   14:invokevirtual   #26  <Method void UnifiedNativeAdMapper.setHeadline(String)>
		((UnifiedNativeAdMapper)this).setImages(unifiednativead.getImages());
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #30  <Method java.util.List UnifiedNativeAd.getImages()>
	//   12   22:invokevirtual   #34  <Method void UnifiedNativeAdMapper.setImages(java.util.List)>
		((UnifiedNativeAdMapper)this).setBody(unifiednativead.getBody());
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #37  <Method String UnifiedNativeAd.getBody()>
	//   16   30:invokevirtual   #40  <Method void UnifiedNativeAdMapper.setBody(String)>
		((UnifiedNativeAdMapper)this).setIcon(unifiednativead.getIcon());
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #44  <Method com.google.android.gms.ads.formats.NativeAd$Image UnifiedNativeAd.getIcon()>
	//   20   38:invokevirtual   #48  <Method void UnifiedNativeAdMapper.setIcon(com.google.android.gms.ads.formats.NativeAd$Image)>
		((UnifiedNativeAdMapper)this).setCallToAction(unifiednativead.getCallToAction());
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #51  <Method String UnifiedNativeAd.getCallToAction()>
	//   24   46:invokevirtual   #54  <Method void UnifiedNativeAdMapper.setCallToAction(String)>
		((UnifiedNativeAdMapper)this).setAdvertiser(unifiednativead.getAdvertiser());
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:invokevirtual   #57  <Method String UnifiedNativeAd.getAdvertiser()>
	//   28   54:invokevirtual   #60  <Method void UnifiedNativeAdMapper.setAdvertiser(String)>
		((UnifiedNativeAdMapper)this).setStarRating(unifiednativead.getStarRating());
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:invokevirtual   #64  <Method Double UnifiedNativeAd.getStarRating()>
	//   32   62:invokevirtual   #68  <Method void UnifiedNativeAdMapper.setStarRating(Double)>
		((UnifiedNativeAdMapper)this).setStore(unifiednativead.getStore());
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:invokevirtual   #71  <Method String UnifiedNativeAd.getStore()>
	//   36   70:invokevirtual   #74  <Method void UnifiedNativeAdMapper.setStore(String)>
		((UnifiedNativeAdMapper)this).setPrice(unifiednativead.getPrice());
	//   37   73:aload_0         
	//   38   74:aload_1         
	//   39   75:invokevirtual   #77  <Method String UnifiedNativeAd.getPrice()>
	//   40   78:invokevirtual   #80  <Method void UnifiedNativeAdMapper.setPrice(String)>
		((UnifiedNativeAdMapper)this).zzl(unifiednativead.zzbh());
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:invokevirtual   #84  <Method Object UnifiedNativeAd.zzbh()>
	//   44   86:invokevirtual   #88  <Method void UnifiedNativeAdMapper.zzl(Object)>
		((UnifiedNativeAdMapper)this).setOverrideImpressionRecording(true);
	//   45   89:aload_0         
	//   46   90:iconst_1        
	//   47   91:invokevirtual   #92  <Method void UnifiedNativeAdMapper.setOverrideImpressionRecording(boolean)>
		((UnifiedNativeAdMapper)this).setOverrideClickHandling(true);
	//   48   94:aload_0         
	//   49   95:iconst_1        
	//   50   96:invokevirtual   #95  <Method void UnifiedNativeAdMapper.setOverrideClickHandling(boolean)>
		((UnifiedNativeAdMapper)this).zza(unifiednativead.getVideoController());
	//   51   99:aload_0         
	//   52  100:aload_1         
	//   53  101:invokevirtual   #99  <Method com.google.android.gms.ads.VideoController UnifiedNativeAd.getVideoController()>
	//   54  104:invokevirtual   #103 <Method void UnifiedNativeAdMapper.zza(com.google.android.gms.ads.VideoController)>
	//   55  107:return          
	}
}
