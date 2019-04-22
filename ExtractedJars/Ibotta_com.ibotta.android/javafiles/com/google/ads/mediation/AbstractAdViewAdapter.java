// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.*;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.*;
import com.google.android.gms.ads.mediation.*;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.ads.*;
import java.util.*;

// Referenced classes of package com.google.ads.mediation:
//			zza, zzb

public abstract class AbstractAdViewAdapter
	implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, com.google.android.gms.ads.mediation.zza, MediationRewardedVideoAdAdapter, zzatm
{
	static final class zza extends NativeAppInstallAdMapper
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

		public zza(NativeAppInstallAd nativeappinstallad)
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
		//   60  134:invokevirtual   #99  <Method VideoController NativeAppInstallAd.getVideoController()>
		//   61  137:invokevirtual   #102 <Method void NativeAdMapper.zza(VideoController)>
		//   62  140:return          
		}
	}

	static final class zzb extends NativeContentAdMapper
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

		public zzb(NativeContentAd nativecontentad)
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
		//   44   96:invokevirtual   #79  <Method VideoController NativeContentAd.getVideoController()>
		//   45   99:invokevirtual   #83  <Method void NativeAdMapper.zza(VideoController)>
		//   46  102:return          
		}
	}

	static final class zzc extends UnifiedNativeAdMapper
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

		public zzc(UnifiedNativeAd unifiednativead)
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
		//   53  101:invokevirtual   #99  <Method VideoController UnifiedNativeAd.getVideoController()>
		//   54  104:invokevirtual   #103 <Method void UnifiedNativeAdMapper.zza(VideoController)>
		//   55  107:return          
		}
	}

	static final class zzd extends AdListener
		implements AppEventListener, zzjd
	{

		public final void onAdClicked()
		{
			zzhi.onAdClicked(((MediationBannerAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #32  <Method void MediationBannerListener.onAdClicked(MediationBannerAdapter)>
		//    5   13:return          
		}

		public final void onAdClosed()
		{
			zzhi.onAdClosed(((MediationBannerAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #35  <Method void MediationBannerListener.onAdClosed(MediationBannerAdapter)>
		//    5   13:return          
		}

		public final void onAdFailedToLoad(int i)
		{
			zzhi.onAdFailedToLoad(((MediationBannerAdapter) (zzhh)), i);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
		//    4    8:iload_1         
		//    5    9:invokeinterface #40  <Method void MediationBannerListener.onAdFailedToLoad(MediationBannerAdapter, int)>
		//    6   14:return          
		}

		public final void onAdLeftApplication()
		{
			zzhi.onAdLeftApplication(((MediationBannerAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #43  <Method void MediationBannerListener.onAdLeftApplication(MediationBannerAdapter)>
		//    5   13:return          
		}

		public final void onAdLoaded()
		{
			zzhi.onAdLoaded(((MediationBannerAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #46  <Method void MediationBannerListener.onAdLoaded(MediationBannerAdapter)>
		//    5   13:return          
		}

		public final void onAdOpened()
		{
			zzhi.onAdOpened(((MediationBannerAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #49  <Method void MediationBannerListener.onAdOpened(MediationBannerAdapter)>
		//    5   13:return          
		}

		public final void onAppEvent(String s, String s1)
		{
			zzhi.zza(((MediationBannerAdapter) (zzhh)), s, s1);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field MediationBannerListener zzhi>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field AbstractAdViewAdapter zzhh>
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokeinterface #55  <Method void MediationBannerListener.zza(MediationBannerAdapter, String, String)>
		//    7   15:return          
		}

		private final AbstractAdViewAdapter zzhh;
		private final MediationBannerListener zzhi;

		public zzd(AbstractAdViewAdapter abstractadviewadapter, MediationBannerListener mediationbannerlistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void AdListener()>
			zzhh = abstractadviewadapter;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field AbstractAdViewAdapter zzhh>
			zzhi = mediationbannerlistener;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field MediationBannerListener zzhi>
		//    8   14:return          
		}
	}

	static final class zze extends AdListener
		implements zzjd
	{

		public final void onAdClicked()
		{
			zzhj.onAdClicked(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field MediationInterstitialListener zzhj>
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #30  <Method void MediationInterstitialListener.onAdClicked(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
		//    5   13:return          
		}

		public final void onAdClosed()
		{
			zzhj.onAdClosed(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field MediationInterstitialListener zzhj>
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #33  <Method void MediationInterstitialListener.onAdClosed(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
		//    5   13:return          
		}

		public final void onAdFailedToLoad(int i)
		{
			zzhj.onAdFailedToLoad(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzhh)), i);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field MediationInterstitialListener zzhj>
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field AbstractAdViewAdapter zzhh>
		//    4    8:iload_1         
		//    5    9:invokeinterface #38  <Method void MediationInterstitialListener.onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationInterstitialAdapter, int)>
		//    6   14:return          
		}

		public final void onAdLeftApplication()
		{
			zzhj.onAdLeftApplication(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field MediationInterstitialListener zzhj>
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #41  <Method void MediationInterstitialListener.onAdLeftApplication(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
		//    5   13:return          
		}

		public final void onAdLoaded()
		{
			zzhj.onAdLoaded(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field MediationInterstitialListener zzhj>
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #44  <Method void MediationInterstitialListener.onAdLoaded(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
		//    5   13:return          
		}

		public final void onAdOpened()
		{
			zzhj.onAdOpened(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field MediationInterstitialListener zzhj>
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #47  <Method void MediationInterstitialListener.onAdOpened(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
		//    5   13:return          
		}

		private final AbstractAdViewAdapter zzhh;
		private final MediationInterstitialListener zzhj;

		public zze(AbstractAdViewAdapter abstractadviewadapter, MediationInterstitialListener mediationinterstitiallistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void AdListener()>
			zzhh = abstractadviewadapter;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field AbstractAdViewAdapter zzhh>
			zzhj = mediationinterstitiallistener;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field MediationInterstitialListener zzhj>
		//    8   14:return          
		}
	}

	static final class zzf extends AdListener
		implements com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener, com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener, com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener, com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
	{

		public final void onAdClicked()
		{
			zzhk.onAdClicked(((MediationNativeAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #38  <Method void MediationNativeListener.onAdClicked(MediationNativeAdapter)>
		//    5   13:return          
		}

		public final void onAdClosed()
		{
			zzhk.onAdClosed(((MediationNativeAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #41  <Method void MediationNativeListener.onAdClosed(MediationNativeAdapter)>
		//    5   13:return          
		}

		public final void onAdFailedToLoad(int i)
		{
			zzhk.onAdFailedToLoad(((MediationNativeAdapter) (zzhh)), i);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
		//    4    8:iload_1         
		//    5    9:invokeinterface #46  <Method void MediationNativeListener.onAdFailedToLoad(MediationNativeAdapter, int)>
		//    6   14:return          
		}

		public final void onAdImpression()
		{
			zzhk.onAdImpression(((MediationNativeAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #49  <Method void MediationNativeListener.onAdImpression(MediationNativeAdapter)>
		//    5   13:return          
		}

		public final void onAdLeftApplication()
		{
			zzhk.onAdLeftApplication(((MediationNativeAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #52  <Method void MediationNativeListener.onAdLeftApplication(MediationNativeAdapter)>
		//    5   13:return          
		}

		public final void onAdLoaded()
		{
		//    0    0:return          
		}

		public final void onAdOpened()
		{
			zzhk.onAdOpened(((MediationNativeAdapter) (zzhh)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
		//    4    8:invokeinterface #56  <Method void MediationNativeListener.onAdOpened(MediationNativeAdapter)>
		//    5   13:return          
		}

		public final void onAppInstallAdLoaded(NativeAppInstallAd nativeappinstallad)
		{
			zzhk.onAdLoaded(((MediationNativeAdapter) (zzhh)), ((NativeAdMapper) (new zza(nativeappinstallad))));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
		//    4    8:new             #60  <Class AbstractAdViewAdapter$zza>
		//    5   11:dup             
		//    6   12:aload_1         
		//    7   13:invokespecial   #62  <Method void AbstractAdViewAdapter$zza(NativeAppInstallAd)>
		//    8   16:invokeinterface #65  <Method void MediationNativeListener.onAdLoaded(MediationNativeAdapter, NativeAdMapper)>
		//    9   21:return          
		}

		public final void onContentAdLoaded(NativeContentAd nativecontentad)
		{
			zzhk.onAdLoaded(((MediationNativeAdapter) (zzhh)), ((NativeAdMapper) (new zzb(nativecontentad))));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
		//    4    8:new             #69  <Class AbstractAdViewAdapter$zzb>
		//    5   11:dup             
		//    6   12:aload_1         
		//    7   13:invokespecial   #71  <Method void AbstractAdViewAdapter$zzb(NativeContentAd)>
		//    8   16:invokeinterface #65  <Method void MediationNativeListener.onAdLoaded(MediationNativeAdapter, NativeAdMapper)>
		//    9   21:return          
		}

		public final void onCustomClick(NativeCustomTemplateAd nativecustomtemplatead, String s)
		{
			zzhk.zza(((MediationNativeAdapter) (zzhh)), nativecustomtemplatead, s);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokeinterface #77  <Method void MediationNativeListener.zza(MediationNativeAdapter, NativeCustomTemplateAd, String)>
		//    7   15:return          
		}

		public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativecustomtemplatead)
		{
			zzhk.zza(((MediationNativeAdapter) (zzhh)), nativecustomtemplatead);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
		//    4    8:aload_1         
		//    5    9:invokeinterface #82  <Method void MediationNativeListener.zza(MediationNativeAdapter, NativeCustomTemplateAd)>
		//    6   14:return          
		}

		public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiednativead)
		{
			zzhk.onAdLoaded(((MediationNativeAdapter) (zzhh)), ((UnifiedNativeAdMapper) (new zzc(unifiednativead))));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediationNativeListener zzhk>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field AbstractAdViewAdapter zzhh>
		//    4    8:new             #86  <Class AbstractAdViewAdapter$zzc>
		//    5   11:dup             
		//    6   12:aload_1         
		//    7   13:invokespecial   #88  <Method void AbstractAdViewAdapter$zzc(UnifiedNativeAd)>
		//    8   16:invokeinterface #91  <Method void MediationNativeListener.onAdLoaded(MediationNativeAdapter, UnifiedNativeAdMapper)>
		//    9   21:return          
		}

		private final AbstractAdViewAdapter zzhh;
		private final MediationNativeListener zzhk;

		public zzf(AbstractAdViewAdapter abstractadviewadapter, MediationNativeListener mediationnativelistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void AdListener()>
			zzhh = abstractadviewadapter;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #29  <Field AbstractAdViewAdapter zzhh>
			zzhk = mediationnativelistener;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #31  <Field MediationNativeListener zzhk>
		//    8   14:return          
		}
	}


	public AbstractAdViewAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #59  <Class com.google.ads.mediation.zza>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #62  <Method void com.google.ads.mediation.zza(AbstractAdViewAdapter)>
	//    7   13:putfield        #64  <Field RewardedVideoAdListener zzhc>
	//    8   16:return          
	}

	private final AdRequest zza(Context context, MediationAdRequest mediationadrequest, Bundle bundle, Bundle bundle1)
	{
		com.google.android.gms.ads.AdRequest.Builder builder = new com.google.android.gms.ads.AdRequest.Builder();
	//    0    0:new             #68  <Class com.google.android.gms.ads.AdRequest$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void com.google.android.gms.ads.AdRequest$Builder()>
	//    3    7:astore          7
		Object obj = ((Object) (mediationadrequest.getBirthday()));
	//    4    9:aload_2         
	//    5   10:invokeinterface #75  <Method java.util.Date MediationAdRequest.getBirthday()>
	//    6   15:astore          8
		if(obj != null)
	//*   7   17:aload           8
	//*   8   19:ifnull          30
			builder.setBirthday(((java.util.Date) (obj)));
	//    9   22:aload           7
	//   10   24:aload           8
	//   11   26:invokevirtual   #79  <Method com.google.android.gms.ads.AdRequest$Builder com.google.android.gms.ads.AdRequest$Builder.setBirthday(java.util.Date)>
	//   12   29:pop             
		int i = mediationadrequest.getGender();
	//   13   30:aload_2         
	//   14   31:invokeinterface #83  <Method int MediationAdRequest.getGender()>
	//   15   36:istore          5
		if(i != 0)
	//*  16   38:iload           5
	//*  17   40:ifeq            51
			builder.setGender(i);
	//   18   43:aload           7
	//   19   45:iload           5
	//   20   47:invokevirtual   #87  <Method com.google.android.gms.ads.AdRequest$Builder com.google.android.gms.ads.AdRequest$Builder.setGender(int)>
	//   21   50:pop             
		obj = ((Object) (mediationadrequest.getKeywords()));
	//   22   51:aload_2         
	//   23   52:invokeinterface #91  <Method Set MediationAdRequest.getKeywords()>
	//   24   57:astore          8
		if(obj != null)
	//*  25   59:aload           8
	//*  26   61:ifnull          102
			for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); builder.addKeyword((String)((Iterator) (obj)).next()));
	//   27   64:aload           8
	//   28   66:invokeinterface #97  <Method Iterator Set.iterator()>
	//   29   71:astore          8
	//   30   73:aload           8
	//   31   75:invokeinterface #103 <Method boolean Iterator.hasNext()>
	//   32   80:ifeq            102
	//   33   83:aload           7
	//   34   85:aload           8
	//   35   87:invokeinterface #107 <Method Object Iterator.next()>
	//   36   92:checkcast       #109 <Class String>
	//   37   95:invokevirtual   #113 <Method com.google.android.gms.ads.AdRequest$Builder com.google.android.gms.ads.AdRequest$Builder.addKeyword(String)>
	//   38   98:pop             
	//*  39   99:goto            73
		obj = ((Object) (mediationadrequest.getLocation()));
	//   40  102:aload_2         
	//   41  103:invokeinterface #117 <Method android.location.Location MediationAdRequest.getLocation()>
	//   42  108:astore          8
		if(obj != null)
	//*  43  110:aload           8
	//*  44  112:ifnull          123
			builder.setLocation(((android.location.Location) (obj)));
	//   45  115:aload           7
	//   46  117:aload           8
	//   47  119:invokevirtual   #121 <Method com.google.android.gms.ads.AdRequest$Builder com.google.android.gms.ads.AdRequest$Builder.setLocation(android.location.Location)>
	//   48  122:pop             
		if(mediationadrequest.isTesting())
	//*  49  123:aload_2         
	//*  50  124:invokeinterface #124 <Method boolean MediationAdRequest.isTesting()>
	//*  51  129:ifeq            146
		{
			zzkb.zzif();
	//   52  132:invokestatic    #130 <Method zzamu zzkb.zzif()>
	//   53  135:pop             
			builder.addTestDevice(zzamu.zzbc(context));
	//   54  136:aload           7
	//   55  138:aload_1         
	//   56  139:invokestatic    #136 <Method String zzamu.zzbc(Context)>
	//   57  142:invokevirtual   #139 <Method com.google.android.gms.ads.AdRequest$Builder com.google.android.gms.ads.AdRequest$Builder.addTestDevice(String)>
	//   58  145:pop             
		}
		if(mediationadrequest.taggedForChildDirectedTreatment() != -1)
	//*  59  146:aload_2         
	//*  60  147:invokeinterface #142 <Method int MediationAdRequest.taggedForChildDirectedTreatment()>
	//*  61  152:iconst_m1       
	//*  62  153:icmpeq          187
		{
			int j = mediationadrequest.taggedForChildDirectedTreatment();
	//   63  156:aload_2         
	//   64  157:invokeinterface #142 <Method int MediationAdRequest.taggedForChildDirectedTreatment()>
	//   65  162:istore          5
			boolean flag = true;
	//   66  164:iconst_1        
	//   67  165:istore          6
			if(j != 1)
	//*  68  167:iload           5
	//*  69  169:iconst_1        
	//*  70  170:icmpne          176
	//*  71  173:goto            179
				flag = false;
	//   72  176:iconst_0        
	//   73  177:istore          6
			builder.tagForChildDirectedTreatment(flag);
	//   74  179:aload           7
	//   75  181:iload           6
	//   76  183:invokevirtual   #146 <Method com.google.android.gms.ads.AdRequest$Builder com.google.android.gms.ads.AdRequest$Builder.tagForChildDirectedTreatment(boolean)>
	//   77  186:pop             
		}
		builder.setIsDesignedForFamilies(mediationadrequest.isDesignedForFamilies());
	//   78  187:aload           7
	//   79  189:aload_2         
	//   80  190:invokeinterface #149 <Method boolean MediationAdRequest.isDesignedForFamilies()>
	//   81  195:invokevirtual   #152 <Method com.google.android.gms.ads.AdRequest$Builder com.google.android.gms.ads.AdRequest$Builder.setIsDesignedForFamilies(boolean)>
	//   82  198:pop             
		builder.addNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter, zza(bundle, bundle1));
	//   83  199:aload           7
	//   84  201:ldc1            #154 <Class AdMobAdapter>
	//   85  203:aload_0         
	//   86  204:aload_3         
	//   87  205:aload           4
	//   88  207:invokevirtual   #157 <Method Bundle zza(Bundle, Bundle)>
	//   89  210:invokevirtual   #161 <Method com.google.android.gms.ads.AdRequest$Builder com.google.android.gms.ads.AdRequest$Builder.addNetworkExtrasBundle(Class, Bundle)>
	//   90  213:pop             
		return builder.build();
	//   91  214:aload           7
	//   92  216:invokevirtual   #165 <Method AdRequest com.google.android.gms.ads.AdRequest$Builder.build()>
	//   93  219:areturn         
	}

	static InterstitialAd zza(AbstractAdViewAdapter abstractadviewadapter, InterstitialAd interstitialad)
	{
		abstractadviewadapter.zzha = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #168 <Field InterstitialAd zzha>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	static MediationRewardedVideoAdListener zza(AbstractAdViewAdapter abstractadviewadapter)
	{
		return abstractadviewadapter.zzhb;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field MediationRewardedVideoAdListener zzhb>
	//    2    4:areturn         
	}

	static InterstitialAd zzb(AbstractAdViewAdapter abstractadviewadapter)
	{
		return abstractadviewadapter.zzha;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field InterstitialAd zzha>
	//    2    4:areturn         
	}

	public String getAdUnitId(Bundle bundle)
	{
		return bundle.getString("pubid");
	//    0    0:aload_1         
	//    1    1:ldc1            #39  <String "pubid">
	//    2    3:invokevirtual   #180 <Method String Bundle.getString(String)>
	//    3    6:areturn         
	}

	public View getBannerView()
	{
		return ((View) (zzgw));
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field AdView zzgw>
	//    2    4:areturn         
	}

	public Bundle getInterstitialAdapterInfo()
	{
		return (new com.google.android.gms.ads.mediation.MediationAdapter.zza()).zzaj(1).zzvx();
	//    0    0:new             #188 <Class com.google.android.gms.ads.mediation.MediationAdapter$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #189 <Method void com.google.android.gms.ads.mediation.MediationAdapter$zza()>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #193 <Method com.google.android.gms.ads.mediation.MediationAdapter$zza com.google.android.gms.ads.mediation.MediationAdapter$zza.zzaj(int)>
	//    5   11:invokevirtual   #196 <Method Bundle com.google.android.gms.ads.mediation.MediationAdapter$zza.zzvx()>
	//    6   14:areturn         
	}

	public zzlo getVideoController()
	{
		Object obj = ((Object) (zzgw));
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field AdView zzgw>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((AdView) (obj)).getVideoController()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #203 <Method VideoController AdView.getVideoController()>
	//    7   13:astore_1        
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				return ((VideoController) (obj)).zzbc();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #207 <Method zzlo VideoController.zzbc()>
	//   12   22:areturn         
		}
		return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
	}

	public void initialize(Context context, MediationAdRequest mediationadrequest, String s, MediationRewardedVideoAdListener mediationrewardedvideoadlistener, Bundle bundle, Bundle bundle1)
	{
		zzgz = context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #215 <Method Context Context.getApplicationContext()>
	//    3    5:putfield        #217 <Field Context zzgz>
		zzhb = mediationrewardedvideoadlistener;
	//    4    8:aload_0         
	//    5    9:aload           4
	//    6   11:putfield        #171 <Field MediationRewardedVideoAdListener zzhb>
		zzhb.onInitializationSucceeded(((MediationRewardedVideoAdAdapter) (this)));
	//    7   14:aload_0         
	//    8   15:getfield        #171 <Field MediationRewardedVideoAdListener zzhb>
	//    9   18:aload_0         
	//   10   19:invokeinterface #223 <Method void MediationRewardedVideoAdListener.onInitializationSucceeded(MediationRewardedVideoAdAdapter)>
	//   11   24:return          
	}

	public boolean isInitialized()
	{
		return zzhb != null;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field MediationRewardedVideoAdListener zzhb>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void loadAd(MediationAdRequest mediationadrequest, Bundle bundle, Bundle bundle1)
	{
		Context context = zzgz;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field Context zzgz>
	//    2    4:astore          4
		if(context != null && zzhb != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          99
	//*   5   11:aload_0         
	//*   6   12:getfield        #171 <Field MediationRewardedVideoAdListener zzhb>
	//*   7   15:ifnonnull       21
	//*   8   18:goto            99
		{
			zzha = new InterstitialAd(context);
	//    9   21:aload_0         
	//   10   22:new             #228 <Class InterstitialAd>
	//   11   25:dup             
	//   12   26:aload           4
	//   13   28:invokespecial   #231 <Method void InterstitialAd(Context)>
	//   14   31:putfield        #168 <Field InterstitialAd zzha>
			zzha.zza(true);
	//   15   34:aload_0         
	//   16   35:getfield        #168 <Field InterstitialAd zzha>
	//   17   38:iconst_1        
	//   18   39:invokevirtual   #234 <Method void InterstitialAd.zza(boolean)>
			zzha.setAdUnitId(getAdUnitId(bundle));
	//   19   42:aload_0         
	//   20   43:getfield        #168 <Field InterstitialAd zzha>
	//   21   46:aload_0         
	//   22   47:aload_2         
	//   23   48:invokevirtual   #236 <Method String getAdUnitId(Bundle)>
	//   24   51:invokevirtual   #240 <Method void InterstitialAd.setAdUnitId(String)>
			zzha.setRewardedVideoAdListener(zzhc);
	//   25   54:aload_0         
	//   26   55:getfield        #168 <Field InterstitialAd zzha>
	//   27   58:aload_0         
	//   28   59:getfield        #64  <Field RewardedVideoAdListener zzhc>
	//   29   62:invokevirtual   #244 <Method void InterstitialAd.setRewardedVideoAdListener(RewardedVideoAdListener)>
			zzha.zza(((com.google.android.gms.ads.reward.zza) (new com.google.ads.mediation.zzb(this))));
	//   30   65:aload_0         
	//   31   66:getfield        #168 <Field InterstitialAd zzha>
	//   32   69:new             #246 <Class zzb>
	//   33   72:dup             
	//   34   73:aload_0         
	//   35   74:invokespecial   #247 <Method void zzb(AbstractAdViewAdapter)>
	//   36   77:invokevirtual   #250 <Method void InterstitialAd.zza(com.google.android.gms.ads.reward.zza)>
			zzha.loadAd(zza(zzgz, mediationadrequest, bundle1, bundle));
	//   37   80:aload_0         
	//   38   81:getfield        #168 <Field InterstitialAd zzha>
	//   39   84:aload_0         
	//   40   85:aload_0         
	//   41   86:getfield        #217 <Field Context zzgz>
	//   42   89:aload_1         
	//   43   90:aload_3         
	//   44   91:aload_2         
	//   45   92:invokespecial   #252 <Method AdRequest zza(Context, MediationAdRequest, Bundle, Bundle)>
	//   46   95:invokevirtual   #255 <Method void InterstitialAd.loadAd(AdRequest)>
			return;
	//   47   98:return          
		} else
		{
			zzane.e("AdMobAdapter.loadAd called before initialize.");
	//   48   99:ldc2            #257 <String "AdMobAdapter.loadAd called before initialize.">
	//   49  102:invokestatic    #262 <Method void zzane.e(String)>
			return;
	//   50  105:return          
		}
	}

	public void onDestroy()
	{
		AdView adview = zzgw;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field AdView zzgw>
	//    2    4:astore_1        
		if(adview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			adview.destroy();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #266 <Method void AdView.destroy()>
			zzgw = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #184 <Field AdView zzgw>
		}
		if(zzgx != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #268 <Field InterstitialAd zzgx>
	//*  12   22:ifnull          30
			zzgx = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #268 <Field InterstitialAd zzgx>
		if(zzgy != null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #270 <Field AdLoader zzgy>
	//*  18   34:ifnull          42
			zzgy = null;
	//   19   37:aload_0         
	//   20   38:aconst_null     
	//   21   39:putfield        #270 <Field AdLoader zzgy>
		if(zzha != null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #168 <Field InterstitialAd zzha>
	//*  24   46:ifnull          54
			zzha = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #168 <Field InterstitialAd zzha>
	//   28   54:return          
	}

	public void onImmersiveModeUpdated(boolean flag)
	{
		InterstitialAd interstitialad = zzgx;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field InterstitialAd zzgx>
	//    2    4:astore_2        
		if(interstitialad != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			interstitialad.setImmersiveMode(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #274 <Method void InterstitialAd.setImmersiveMode(boolean)>
		interstitialad = zzha;
	//    8   14:aload_0         
	//    9   15:getfield        #168 <Field InterstitialAd zzha>
	//   10   18:astore_2        
		if(interstitialad != null)
	//*  11   19:aload_2         
	//*  12   20:ifnull          28
			interstitialad.setImmersiveMode(flag);
	//   13   23:aload_2         
	//   14   24:iload_1         
	//   15   25:invokevirtual   #274 <Method void InterstitialAd.setImmersiveMode(boolean)>
	//   16   28:return          
	}

	public void onPause()
	{
		AdView adview = zzgw;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field AdView zzgw>
	//    2    4:astore_1        
		if(adview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			adview.pause();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #278 <Method void AdView.pause()>
	//    7   13:return          
	}

	public void onResume()
	{
		AdView adview = zzgw;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field AdView zzgw>
	//    2    4:astore_1        
		if(adview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			adview.resume();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #282 <Method void AdView.resume()>
	//    7   13:return          
	}

	public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
	{
		zzgw = new AdView(context);
	//    0    0:aload_0         
	//    1    1:new             #200 <Class AdView>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #285 <Method void AdView(Context)>
	//    5    9:putfield        #184 <Field AdView zzgw>
		zzgw.setAdSize(new AdSize(adsize.getWidth(), adsize.getHeight()));
	//    6   12:aload_0         
	//    7   13:getfield        #184 <Field AdView zzgw>
	//    8   16:new             #287 <Class AdSize>
	//    9   19:dup             
	//   10   20:aload           4
	//   11   22:invokevirtual   #290 <Method int AdSize.getWidth()>
	//   12   25:aload           4
	//   13   27:invokevirtual   #293 <Method int AdSize.getHeight()>
	//   14   30:invokespecial   #296 <Method void AdSize(int, int)>
	//   15   33:invokevirtual   #300 <Method void AdView.setAdSize(AdSize)>
		zzgw.setAdUnitId(getAdUnitId(bundle));
	//   16   36:aload_0         
	//   17   37:getfield        #184 <Field AdView zzgw>
	//   18   40:aload_0         
	//   19   41:aload_3         
	//   20   42:invokevirtual   #236 <Method String getAdUnitId(Bundle)>
	//   21   45:invokevirtual   #301 <Method void AdView.setAdUnitId(String)>
		zzgw.setAdListener(((AdListener) (new zzd(this, mediationbannerlistener))));
	//   22   48:aload_0         
	//   23   49:getfield        #184 <Field AdView zzgw>
	//   24   52:new             #27  <Class AbstractAdViewAdapter$zzd>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:aload_2         
	//   28   58:invokespecial   #304 <Method void AbstractAdViewAdapter$zzd(AbstractAdViewAdapter, MediationBannerListener)>
	//   29   61:invokevirtual   #308 <Method void AdView.setAdListener(AdListener)>
		zzgw.loadAd(zza(context, mediationadrequest, bundle1, bundle));
	//   30   64:aload_0         
	//   31   65:getfield        #184 <Field AdView zzgw>
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:aload           5
	//   35   72:aload           6
	//   36   74:aload_3         
	//   37   75:invokespecial   #252 <Method AdRequest zza(Context, MediationAdRequest, Bundle, Bundle)>
	//   38   78:invokevirtual   #309 <Method void AdView.loadAd(AdRequest)>
	//   39   81:return          
	}

	public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
	{
		zzgx = new InterstitialAd(context);
	//    0    0:aload_0         
	//    1    1:new             #228 <Class InterstitialAd>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #231 <Method void InterstitialAd(Context)>
	//    5    9:putfield        #268 <Field InterstitialAd zzgx>
		zzgx.setAdUnitId(getAdUnitId(bundle));
	//    6   12:aload_0         
	//    7   13:getfield        #268 <Field InterstitialAd zzgx>
	//    8   16:aload_0         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #236 <Method String getAdUnitId(Bundle)>
	//   11   21:invokevirtual   #240 <Method void InterstitialAd.setAdUnitId(String)>
		zzgx.setAdListener(((AdListener) (new zze(this, mediationinterstitiallistener))));
	//   12   24:aload_0         
	//   13   25:getfield        #268 <Field InterstitialAd zzgx>
	//   14   28:new             #30  <Class AbstractAdViewAdapter$zze>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokespecial   #314 <Method void AbstractAdViewAdapter$zze(AbstractAdViewAdapter, MediationInterstitialListener)>
	//   19   37:invokevirtual   #315 <Method void InterstitialAd.setAdListener(AdListener)>
		zzgx.loadAd(zza(context, mediationadrequest, bundle1, bundle));
	//   20   40:aload_0         
	//   21   41:getfield        #268 <Field InterstitialAd zzgx>
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:aload           4
	//   25   48:aload           5
	//   26   50:aload_3         
	//   27   51:invokespecial   #252 <Method AdRequest zza(Context, MediationAdRequest, Bundle, Bundle)>
	//   28   54:invokevirtual   #255 <Method void InterstitialAd.loadAd(AdRequest)>
	//   29   57:return          
	}

	public void requestNativeAd(Context context, MediationNativeListener mediationnativelistener, Bundle bundle, NativeMediationAdRequest nativemediationadrequest, Bundle bundle1)
	{
		zzf zzf1 = new zzf(this, mediationnativelistener);
	//    0    0:new             #33  <Class AbstractAdViewAdapter$zzf>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokespecial   #320 <Method void AbstractAdViewAdapter$zzf(AbstractAdViewAdapter, MediationNativeListener)>
	//    5    9:astore          6
		com.google.android.gms.ads.AdLoader.Builder builder = (new com.google.android.gms.ads.AdLoader.Builder(context, bundle.getString("pubid"))).withAdListener(((AdListener) (zzf1)));
	//    6   11:new             #322 <Class com.google.android.gms.ads.AdLoader$Builder>
	//    7   14:dup             
	//    8   15:aload_1         
	//    9   16:aload_3         
	//   10   17:ldc1            #39  <String "pubid">
	//   11   19:invokevirtual   #180 <Method String Bundle.getString(String)>
	//   12   22:invokespecial   #325 <Method void com.google.android.gms.ads.AdLoader$Builder(Context, String)>
	//   13   25:aload           6
	//   14   27:invokevirtual   #329 <Method com.google.android.gms.ads.AdLoader$Builder com.google.android.gms.ads.AdLoader$Builder.withAdListener(AdListener)>
	//   15   30:astore          7
		mediationnativelistener = ((MediationNativeListener) (nativemediationadrequest.getNativeAdOptions()));
	//   16   32:aload           4
	//   17   34:invokeinterface #335 <Method com.google.android.gms.ads.formats.NativeAdOptions NativeMediationAdRequest.getNativeAdOptions()>
	//   18   39:astore_2        
		if(mediationnativelistener != null)
	//*  19   40:aload_2         
	//*  20   41:ifnull          51
			builder.withNativeAdOptions(((com.google.android.gms.ads.formats.NativeAdOptions) (mediationnativelistener)));
	//   21   44:aload           7
	//   22   46:aload_2         
	//   23   47:invokevirtual   #339 <Method com.google.android.gms.ads.AdLoader$Builder com.google.android.gms.ads.AdLoader$Builder.withNativeAdOptions(com.google.android.gms.ads.formats.NativeAdOptions)>
	//   24   50:pop             
		if(nativemediationadrequest.isUnifiedNativeAdRequested())
	//*  25   51:aload           4
	//*  26   53:invokeinterface #342 <Method boolean NativeMediationAdRequest.isUnifiedNativeAdRequested()>
	//*  27   58:ifeq            69
			builder.forUnifiedNativeAd(((com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener) (zzf1)));
	//   28   61:aload           7
	//   29   63:aload           6
	//   30   65:invokevirtual   #346 <Method com.google.android.gms.ads.AdLoader$Builder com.google.android.gms.ads.AdLoader$Builder.forUnifiedNativeAd(com.google.android.gms.ads.formats.UnifiedNativeAd$OnUnifiedNativeAdLoadedListener)>
	//   31   68:pop             
		if(nativemediationadrequest.isAppInstallAdRequested())
	//*  32   69:aload           4
	//*  33   71:invokeinterface #349 <Method boolean NativeMediationAdRequest.isAppInstallAdRequested()>
	//*  34   76:ifeq            87
			builder.forAppInstallAd(((com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener) (zzf1)));
	//   35   79:aload           7
	//   36   81:aload           6
	//   37   83:invokevirtual   #353 <Method com.google.android.gms.ads.AdLoader$Builder com.google.android.gms.ads.AdLoader$Builder.forAppInstallAd(com.google.android.gms.ads.formats.NativeAppInstallAd$OnAppInstallAdLoadedListener)>
	//   38   86:pop             
		if(nativemediationadrequest.isContentAdRequested())
	//*  39   87:aload           4
	//*  40   89:invokeinterface #356 <Method boolean NativeMediationAdRequest.isContentAdRequested()>
	//*  41   94:ifeq            105
			builder.forContentAd(((com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener) (zzf1)));
	//   42   97:aload           7
	//   43   99:aload           6
	//   44  101:invokevirtual   #360 <Method com.google.android.gms.ads.AdLoader$Builder com.google.android.gms.ads.AdLoader$Builder.forContentAd(com.google.android.gms.ads.formats.NativeContentAd$OnContentAdLoadedListener)>
	//   45  104:pop             
		if(nativemediationadrequest.zzna())
	//*  46  105:aload           4
	//*  47  107:invokeinterface #363 <Method boolean NativeMediationAdRequest.zzna()>
	//*  48  112:ifeq            201
		{
			String s;
			for(Iterator iterator = nativemediationadrequest.zznb().keySet().iterator(); iterator.hasNext(); builder.forCustomTemplateAd(s, ((com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener) (zzf1)), ((com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener) (mediationnativelistener))))
	//*  49  115:aload           4
	//*  50  117:invokeinterface #367 <Method Map NativeMediationAdRequest.zznb()>
	//*  51  122:invokeinterface #372 <Method Set Map.keySet()>
	//*  52  127:invokeinterface #97  <Method Iterator Set.iterator()>
	//*  53  132:astore          8
	//*  54  134:aload           8
	//*  55  136:invokeinterface #103 <Method boolean Iterator.hasNext()>
	//*  56  141:ifeq            201
			{
				s = (String)iterator.next();
	//   57  144:aload           8
	//   58  146:invokeinterface #107 <Method Object Iterator.next()>
	//   59  151:checkcast       #109 <Class String>
	//   60  154:astore          9
				if(((Boolean)nativemediationadrequest.zznb().get(((Object) (s)))).booleanValue())
	//*  61  156:aload           4
	//*  62  158:invokeinterface #367 <Method Map NativeMediationAdRequest.zznb()>
	//*  63  163:aload           9
	//*  64  165:invokeinterface #376 <Method Object Map.get(Object)>
	//*  65  170:checkcast       #378 <Class Boolean>
	//*  66  173:invokevirtual   #381 <Method boolean Boolean.booleanValue()>
	//*  67  176:ifeq            185
					mediationnativelistener = ((MediationNativeListener) (zzf1));
	//   68  179:aload           6
	//   69  181:astore_2        
				else
	//*  70  182:goto            187
					mediationnativelistener = null;
	//   71  185:aconst_null     
	//   72  186:astore_2        
			}

	//   73  187:aload           7
	//   74  189:aload           9
	//   75  191:aload           6
	//   76  193:aload_2         
	//   77  194:invokevirtual   #385 <Method com.google.android.gms.ads.AdLoader$Builder com.google.android.gms.ads.AdLoader$Builder.forCustomTemplateAd(String, com.google.android.gms.ads.formats.NativeCustomTemplateAd$OnCustomTemplateAdLoadedListener, com.google.android.gms.ads.formats.NativeCustomTemplateAd$OnCustomClickListener)>
	//   78  197:pop             
		}
	//*  79  198:goto            134
		zzgy = builder.build();
	//   80  201:aload_0         
	//   81  202:aload           7
	//   82  204:invokevirtual   #388 <Method AdLoader com.google.android.gms.ads.AdLoader$Builder.build()>
	//   83  207:putfield        #270 <Field AdLoader zzgy>
		zzgy.loadAd(zza(context, ((MediationAdRequest) (nativemediationadrequest)), bundle1, bundle));
	//   84  210:aload_0         
	//   85  211:getfield        #270 <Field AdLoader zzgy>
	//   86  214:aload_0         
	//   87  215:aload_1         
	//   88  216:aload           4
	//   89  218:aload           5
	//   90  220:aload_3         
	//   91  221:invokespecial   #252 <Method AdRequest zza(Context, MediationAdRequest, Bundle, Bundle)>
	//   92  224:invokevirtual   #391 <Method void AdLoader.loadAd(AdRequest)>
	//   93  227:return          
	}

	public void showInterstitial()
	{
		zzgx.show();
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field InterstitialAd zzgx>
	//    2    4:invokevirtual   #395 <Method void InterstitialAd.show()>
	//    3    7:return          
	}

	public void showVideo()
	{
		zzha.show();
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field InterstitialAd zzha>
	//    2    4:invokevirtual   #395 <Method void InterstitialAd.show()>
	//    3    7:return          
	}

	protected abstract Bundle zza(Bundle bundle, Bundle bundle1);

	public static final String AD_UNIT_ID_PARAMETER = "pubid";
	private AdView zzgw;
	private InterstitialAd zzgx;
	private AdLoader zzgy;
	private Context zzgz;
	private InterstitialAd zzha;
	private MediationRewardedVideoAdListener zzhb;
	private final RewardedVideoAdListener zzhc = new com.google.ads.mediation.zza(this);
}
