// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.*;

// Referenced classes of package com.google.android.gms.ads:
//			AdRequest, Correlator, AdSize, AdListener

public class AdLoader
{
	public static class Builder
	{

		public AdLoader build()
		{
			AdLoader adloader;
			try
			{
				adloader = new AdLoader(mContext, zzum.zzdh());
		//    0    0:new             #6   <Class AdLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field Context mContext>
		//    4    8:aload_0         
		//    5    9:getfield        #20  <Field zzkn zzum>
		//    6   12:invokeinterface #59  <Method zzkk zzkn.zzdh()>
		//    7   17:invokespecial   #62  <Method void AdLoader(Context, zzkk)>
		//    8   20:astore_1        
			}
		//*   9   21:aload_1         
		//*  10   22:areturn         
			catch(RemoteException remoteexception)
		//*  11   23:astore_1        
			{
				zzane.zzb("Failed to build AdLoader.", ((Throwable) (remoteexception)));
		//   12   24:ldc1            #64  <String "Failed to build AdLoader.">
		//   13   26:aload_1         
		//   14   27:invokestatic    #69  <Method void zzane.zzb(String, Throwable)>
				return null;
		//   15   30:aconst_null     
		//   16   31:areturn         
			}
			return adloader;
		}

		public Builder forAppInstallAd(com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener onappinstalladloadedlistener)
		{
			try
			{
				zzum.zza(((com.google.android.gms.internal.ads.zzqw) (new zzrx(onappinstalladloadedlistener))));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzkn zzum>
		//    2    4:new             #73  <Class zzrx>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #76  <Method void zzrx(com.google.android.gms.ads.formats.NativeAppInstallAd$OnAppInstallAdLoadedListener)>
		//    6   12:invokeinterface #80  <Method void zzkn.zza(com.google.android.gms.internal.ads.zzqw)>
			}
		//*   7   17:aload_0         
		//*   8   18:areturn         
			// Misplaced declaration of an exception variable
			catch(com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener onappinstalladloadedlistener)
		//*   9   19:astore_1        
			{
				zzane.zzc("Failed to add app install ad listener", ((Throwable) (onappinstalladloadedlistener)));
		//   10   20:ldc1            #82  <String "Failed to add app install ad listener">
		//   11   22:aload_1         
		//   12   23:invokestatic    #85  <Method void zzane.zzc(String, Throwable)>
				return this;
		//   13   26:aload_0         
		//   14   27:areturn         
			}
			return this;
		}

		public Builder forContentAd(com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener oncontentadloadedlistener)
		{
			try
			{
				zzum.zza(((com.google.android.gms.internal.ads.zzqz) (new zzry(oncontentadloadedlistener))));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzkn zzum>
		//    2    4:new             #89  <Class zzry>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #92  <Method void zzry(com.google.android.gms.ads.formats.NativeContentAd$OnContentAdLoadedListener)>
		//    6   12:invokeinterface #95  <Method void zzkn.zza(com.google.android.gms.internal.ads.zzqz)>
			}
		//*   7   17:aload_0         
		//*   8   18:areturn         
			// Misplaced declaration of an exception variable
			catch(com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener oncontentadloadedlistener)
		//*   9   19:astore_1        
			{
				zzane.zzc("Failed to add content ad listener", ((Throwable) (oncontentadloadedlistener)));
		//   10   20:ldc1            #97  <String "Failed to add content ad listener">
		//   11   22:aload_1         
		//   12   23:invokestatic    #85  <Method void zzane.zzc(String, Throwable)>
				return this;
		//   13   26:aload_0         
		//   14   27:areturn         
			}
			return this;
		}

		public Builder forCustomTemplateAd(String s, com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener oncustomtemplateadloadedlistener, com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener oncustomclicklistener)
		{
			zzkn zzkn1;
			zzsa zzsa1;
			try
			{
				zzkn1 = zzum;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzkn zzum>
		//    2    4:astore          4
				zzsa1 = new zzsa(oncustomtemplateadloadedlistener);
		//    3    6:new             #101 <Class zzsa>
		//    4    9:dup             
		//    5   10:aload_2         
		//    6   11:invokespecial   #104 <Method void zzsa(com.google.android.gms.ads.formats.NativeCustomTemplateAd$OnCustomTemplateAdLoadedListener)>
		//    7   14:astore          5
			}
		//*   8   16:aload_3         
		//*   9   17:ifnonnull       25
		//*  10   20:aconst_null     
		//*  11   21:astore_2        
		//*  12   22:goto            34
		//*  13   25:new             #106 <Class zzrz>
		//*  14   28:dup             
		//*  15   29:aload_3         
		//*  16   30:invokespecial   #109 <Method void zzrz(com.google.android.gms.ads.formats.NativeCustomTemplateAd$OnCustomClickListener)>
		//*  17   33:astore_2        
		//*  18   34:aload           4
		//*  19   36:aload_1         
		//*  20   37:aload           5
		//*  21   39:aload_2         
		//*  22   40:invokeinterface #112 <Method void zzkn.zza(String, com.google.android.gms.internal.ads.zzrf, com.google.android.gms.internal.ads.zzrc)>
		//*  23   45:aload_0         
		//*  24   46:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  25   47:astore_1        
			{
				zzane.zzc("Failed to add custom template ad listener", ((Throwable) (s)));
		//   26   48:ldc1            #114 <String "Failed to add custom template ad listener">
		//   27   50:aload_1         
		//   28   51:invokestatic    #85  <Method void zzane.zzc(String, Throwable)>
				return this;
		//   29   54:aload_0         
		//   30   55:areturn         
			}
			if(oncustomclicklistener == null)
			{
				oncustomtemplateadloadedlistener = null;
				break MISSING_BLOCK_LABEL_34;
			}
			oncustomtemplateadloadedlistener = ((com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener) (new zzrz(oncustomclicklistener)));
			zzkn1.zza(s, ((com.google.android.gms.internal.ads.zzrf) (zzsa1)), ((com.google.android.gms.internal.ads.zzrc) (oncustomtemplateadloadedlistener)));
			return this;
		}

		public transient Builder forPublisherAdView(OnPublisherAdViewLoadedListener onpublisheradviewloadedlistener, AdSize aadsize[])
		{
			if(aadsize != null && aadsize.length > 0)
		//*   0    0:aload_2         
		//*   1    1:ifnull          54
		//*   2    4:aload_2         
		//*   3    5:arraylength     
		//*   4    6:ifgt            12
		//*   5    9:goto            54
			{
				try
				{
					aadsize = ((AdSize []) (new zzjn(mContext, aadsize)));
		//    6   12:new             #118 <Class zzjn>
		//    7   15:dup             
		//    8   16:aload_0         
		//    9   17:getfield        #18  <Field Context mContext>
		//   10   20:aload_2         
		//   11   21:invokespecial   #121 <Method void zzjn(Context, AdSize[])>
		//   12   24:astore_2        
					zzum.zza(((com.google.android.gms.internal.ads.zzri) (new zzsb(onpublisheradviewloadedlistener))), ((zzjn) (aadsize)));
		//   13   25:aload_0         
		//   14   26:getfield        #20  <Field zzkn zzum>
		//   15   29:new             #123 <Class zzsb>
		//   16   32:dup             
		//   17   33:aload_1         
		//   18   34:invokespecial   #126 <Method void zzsb(OnPublisherAdViewLoadedListener)>
		//   19   37:aload_2         
		//   20   38:invokeinterface #129 <Method void zzkn.zza(com.google.android.gms.internal.ads.zzri, zzjn)>
				}
		//*  21   43:aload_0         
		//*  22   44:areturn         
				// Misplaced declaration of an exception variable
				catch(OnPublisherAdViewLoadedListener onpublisheradviewloadedlistener)
		//*  23   45:astore_1        
				{
					zzane.zzc("Failed to add publisher banner ad listener", ((Throwable) (onpublisheradviewloadedlistener)));
		//   24   46:ldc1            #131 <String "Failed to add publisher banner ad listener">
		//   25   48:aload_1         
		//   26   49:invokestatic    #85  <Method void zzane.zzc(String, Throwable)>
					return this;
		//   27   52:aload_0         
		//   28   53:areturn         
				}
				return this;
			} else
			{
				throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
		//   29   54:new             #133 <Class IllegalArgumentException>
		//   30   57:dup             
		//   31   58:ldc1            #135 <String "The supported ad sizes must contain at least one valid ad size.">
		//   32   60:invokespecial   #138 <Method void IllegalArgumentException(String)>
		//   33   63:athrow          
			}
		}

		public Builder forUnifiedNativeAd(com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onunifiednativeadloadedlistener)
		{
			try
			{
				zzum.zza(((com.google.android.gms.internal.ads.zzrl) (new zzsd(onunifiednativeadloadedlistener))));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzkn zzum>
		//    2    4:new             #142 <Class zzsd>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #145 <Method void zzsd(com.google.android.gms.ads.formats.UnifiedNativeAd$OnUnifiedNativeAdLoadedListener)>
		//    6   12:invokeinterface #148 <Method void zzkn.zza(com.google.android.gms.internal.ads.zzrl)>
			}
		//*   7   17:aload_0         
		//*   8   18:areturn         
			// Misplaced declaration of an exception variable
			catch(com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onunifiednativeadloadedlistener)
		//*   9   19:astore_1        
			{
				zzane.zzc("Failed to add google native ad listener", ((Throwable) (onunifiednativeadloadedlistener)));
		//   10   20:ldc1            #150 <String "Failed to add google native ad listener">
		//   11   22:aload_1         
		//   12   23:invokestatic    #85  <Method void zzane.zzc(String, Throwable)>
				return this;
		//   13   26:aload_0         
		//   14   27:areturn         
			}
			return this;
		}

		public Builder withAdListener(AdListener adlistener)
		{
			try
			{
				zzum.zzb(((com.google.android.gms.internal.ads.zzkh) (new zzjf(adlistener))));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzkn zzum>
		//    2    4:new             #154 <Class zzjf>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #157 <Method void zzjf(AdListener)>
		//    6   12:invokeinterface #160 <Method void zzkn.zzb(com.google.android.gms.internal.ads.zzkh)>
			}
		//*   7   17:aload_0         
		//*   8   18:areturn         
			// Misplaced declaration of an exception variable
			catch(AdListener adlistener)
		//*   9   19:astore_1        
			{
				zzane.zzc("Failed to set AdListener.", ((Throwable) (adlistener)));
		//   10   20:ldc1            #162 <String "Failed to set AdListener.">
		//   11   22:aload_1         
		//   12   23:invokestatic    #85  <Method void zzane.zzc(String, Throwable)>
				return this;
		//   13   26:aload_0         
		//   14   27:areturn         
			}
			return this;
		}

		public Builder withCorrelator(Correlator correlator)
		{
			Preconditions.checkNotNull(((Object) (correlator)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #168 <Method Object Preconditions.checkNotNull(Object)>
		//    2    4:pop             
			try
			{
				zzum.zzb(((com.google.android.gms.internal.ads.zzlg) (correlator.zzuu)));
		//    3    5:aload_0         
		//    4    6:getfield        #20  <Field zzkn zzum>
		//    5    9:aload_1         
		//    6   10:getfield        #174 <Field com.google.android.gms.internal.ads.zzkc Correlator.zzuu>
		//    7   13:invokeinterface #177 <Method void zzkn.zzb(com.google.android.gms.internal.ads.zzlg)>
			}
		//*   8   18:aload_0         
		//*   9   19:areturn         
			// Misplaced declaration of an exception variable
			catch(Correlator correlator)
		//*  10   20:astore_1        
			{
				zzane.zzc("Failed to set correlator.", ((Throwable) (correlator)));
		//   11   21:ldc1            #179 <String "Failed to set correlator.">
		//   12   23:aload_1         
		//   13   24:invokestatic    #85  <Method void zzane.zzc(String, Throwable)>
				return this;
		//   14   27:aload_0         
		//   15   28:areturn         
			}
			return this;
		}

		public Builder withNativeAdOptions(NativeAdOptions nativeadoptions)
		{
			try
			{
				zzum.zza(new zzpl(nativeadoptions));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzkn zzum>
		//    2    4:new             #184 <Class zzpl>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #187 <Method void zzpl(NativeAdOptions)>
		//    6   12:invokeinterface #190 <Method void zzkn.zza(zzpl)>
			}
		//*   7   17:aload_0         
		//*   8   18:areturn         
			// Misplaced declaration of an exception variable
			catch(NativeAdOptions nativeadoptions)
		//*   9   19:astore_1        
			{
				zzane.zzc("Failed to specify native ad options", ((Throwable) (nativeadoptions)));
		//   10   20:ldc1            #192 <String "Failed to specify native ad options">
		//   11   22:aload_1         
		//   12   23:invokestatic    #85  <Method void zzane.zzc(String, Throwable)>
				return this;
		//   13   26:aload_0         
		//   14   27:areturn         
			}
			return this;
		}

		public Builder withPublisherAdViewOptions(PublisherAdViewOptions publisheradviewoptions)
		{
			try
			{
				zzum.zza(publisheradviewoptions);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field zzkn zzum>
		//    2    4:aload_1         
		//    3    5:invokeinterface #197 <Method void zzkn.zza(PublisherAdViewOptions)>
			}
		//*   4   10:aload_0         
		//*   5   11:areturn         
			// Misplaced declaration of an exception variable
			catch(PublisherAdViewOptions publisheradviewoptions)
		//*   6   12:astore_1        
			{
				zzane.zzc("Failed to specify DFP banner ad options", ((Throwable) (publisheradviewoptions)));
		//    7   13:ldc1            #199 <String "Failed to specify DFP banner ad options">
		//    8   15:aload_1         
		//    9   16:invokestatic    #85  <Method void zzane.zzc(String, Throwable)>
				return this;
		//   10   19:aload_0         
		//   11   20:areturn         
			}
			return this;
		}

		private final Context mContext;
		private final zzkn zzum;

		private Builder(Context context, zzkn zzkn1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mContext = context;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field Context mContext>
			zzum = zzkn1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field zzkn zzum>
		//    8   14:return          
		}

		public Builder(Context context, String s)
		{
			this((Context)Preconditions.checkNotNull(((Object) (context)), "context cannot be null"), zzkb.zzig().zzb(context, s, ((com.google.android.gms.internal.ads.zzxn) (new zzxm()))));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #24  <String "context cannot be null">
		//    3    4:invokestatic    #30  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    4    7:checkcast       #32  <Class Context>
		//    5   10:invokestatic    #38  <Method zzjr zzkb.zzig()>
		//    6   13:aload_1         
		//    7   14:aload_2         
		//    8   15:new             #40  <Class zzxm>
		//    9   18:dup             
		//   10   19:invokespecial   #41  <Method void zzxm()>
		//   11   22:invokevirtual   #47  <Method zzkn zzjr.zzb(Context, String, com.google.android.gms.internal.ads.zzxn)>
		//   12   25:invokespecial   #49  <Method void AdLoader$Builder(Context, zzkn)>
		//   13   28:return          
		}
	}


	AdLoader(Context context, zzkk zzkk1)
	{
		this(context, zzkk1, zzjm.zzara);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #20  <Field zzjm zzjm.zzara>
	//    4    6:invokespecial   #23  <Method void AdLoader(Context, zzkk, zzjm)>
	//    5    9:return          
	}

	private AdLoader(Context context, zzkk zzkk1, zzjm zzjm1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Context mContext>
		zzul = zzkk1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field zzkk zzul>
		zzuk = zzjm1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field zzjm zzuk>
	//   11   19:return          
	}

	private final void zza(zzlw zzlw)
	{
		try
		{
			zzul.zzd(zzjm.zza(mContext, zzlw));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzkk zzul>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field Context mContext>
	//    4    8:aload_1         
	//    5    9:invokestatic    #40  <Method com.google.android.gms.internal.ads.zzjj zzjm.zza(Context, zzlw)>
	//    6   12:invokeinterface #46  <Method void zzkk.zzd(com.google.android.gms.internal.ads.zzjj)>
			return;
	//    7   17:return          
		}
		// Misplaced declaration of an exception variable
		catch(zzlw zzlw)
	//*   8   18:astore_1        
		{
			zzane.zzb("Failed to load ad.", ((Throwable) (zzlw)));
	//    9   19:ldc1            #48  <String "Failed to load ad.">
	//   10   21:aload_1         
	//   11   22:invokestatic    #54  <Method void zzane.zzb(String, Throwable)>
		}
	//   12   25:return          
	}

	public String getMediationAdapterClassName()
	{
		String s;
		try
		{
			s = zzul.zzck();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzkk zzul>
	//    2    4:invokeinterface #60  <Method String zzkk.zzck()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			zzane.zzc("Failed to get the mediation adapter class name.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #62  <String "Failed to get the mediation adapter class name.">
	//    8   15:aload_1         
	//    9   16:invokestatic    #65  <Method void zzane.zzc(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return s;
	}

	public boolean isLoading()
	{
		boolean flag;
		try
		{
			flag = zzul.isLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzkk zzul>
	//    2    4:invokeinterface #70  <Method boolean zzkk.isLoading()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_2        
		{
			zzane.zzc("Failed to check if ad is loading.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #72  <String "Failed to check if ad is loading.">
	//    8   15:aload_2         
	//    9   16:invokestatic    #65  <Method void zzane.zzc(String, Throwable)>
			return false;
	//   10   19:iconst_0        
	//   11   20:ireturn         
		}
		return flag;
	}

	public void loadAd(AdRequest adrequest)
	{
		zza(adrequest.zzay());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #83  <Method zzlw AdRequest.zzay()>
	//    3    5:invokespecial   #85  <Method void zza(zzlw)>
	//    4    8:return          
	}

	public void loadAd(PublisherAdRequest publisheradrequest)
	{
		zza(publisheradrequest.zzay());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #90  <Method zzlw PublisherAdRequest.zzay()>
	//    3    5:invokespecial   #85  <Method void zza(zzlw)>
	//    4    8:return          
	}

	public void loadAds(AdRequest adrequest, int i)
	{
		adrequest = ((AdRequest) (adrequest.zzay()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #83  <Method zzlw AdRequest.zzay()>
	//    2    4:astore_1        
		try
		{
			zzul.zza(zzjm.zza(mContext, ((zzlw) (adrequest))), i);
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field zzkk zzul>
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field Context mContext>
	//    7   13:aload_1         
	//    8   14:invokestatic    #40  <Method com.google.android.gms.internal.ads.zzjj zzjm.zza(Context, zzlw)>
	//    9   17:iload_2         
	//   10   18:invokeinterface #95  <Method void zzkk.zza(com.google.android.gms.internal.ads.zzjj, int)>
			return;
	//   11   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(AdRequest adrequest)
	//*  12   24:astore_1        
		{
			zzane.zzb("Failed to load ads.", ((Throwable) (adrequest)));
	//   13   25:ldc1            #97  <String "Failed to load ads.">
	//   14   27:aload_1         
	//   15   28:invokestatic    #54  <Method void zzane.zzb(String, Throwable)>
		}
	//   16   31:return          
	}

	private final Context mContext;
	private final zzjm zzuk;
	private final zzkk zzul;
}
