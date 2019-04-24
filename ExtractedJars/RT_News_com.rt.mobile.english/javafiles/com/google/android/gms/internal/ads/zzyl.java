// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.*;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzyi, zzane, zzxt, zzqv

public final class zzyl
	implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener
{

	public zzyl(zzxt zzxt1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		zzbuu = zzxt1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field zzxt zzbuu>
	//    5    9:return          
	}

	private static void zza(MediationNativeAdapter mediationnativeadapter, UnifiedNativeAdMapper unifiednativeadmapper, NativeAdMapper nativeadmapper)
	{
		if(mediationnativeadapter instanceof AdMobAdapter)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #32  <Class AdMobAdapter>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mediationnativeadapter = ((MediationNativeAdapter) (new VideoController()));
	//    4    8:new             #34  <Class VideoController>
	//    5   11:dup             
	//    6   12:invokespecial   #35  <Method void VideoController()>
	//    7   15:astore_0        
		((VideoController) (mediationnativeadapter)).zza(((zzlo) (new zzyi())));
	//    8   16:aload_0         
	//    9   17:new             #37  <Class zzyi>
	//   10   20:dup             
	//   11   21:invokespecial   #38  <Method void zzyi()>
	//   12   24:invokevirtual   #41  <Method void VideoController.zza(zzlo)>
		if(unifiednativeadmapper != null && unifiednativeadmapper.hasVideoContent())
	//*  13   27:aload_1         
	//*  14   28:ifnull          43
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #47  <Method boolean UnifiedNativeAdMapper.hasVideoContent()>
	//*  17   35:ifeq            43
			unifiednativeadmapper.zza(((VideoController) (mediationnativeadapter)));
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:invokevirtual   #50  <Method void UnifiedNativeAdMapper.zza(VideoController)>
		if(nativeadmapper != null && nativeadmapper.hasVideoContent())
	//*  21   43:aload_2         
	//*  22   44:ifnull          59
	//*  23   47:aload_2         
	//*  24   48:invokevirtual   #53  <Method boolean NativeAdMapper.hasVideoContent()>
	//*  25   51:ifeq            59
			nativeadmapper.zza(((VideoController) (mediationnativeadapter)));
	//   26   54:aload_2         
	//   27   55:aload_0         
	//   28   56:invokevirtual   #54  <Method void NativeAdMapper.zza(VideoController)>
	//   29   59:return          
	}

	public final void onAdClicked(MediationBannerAdapter mediationbanneradapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdClicked.");
	//    2    5:ldc1            #69  <String "Adapter called onAdClicked.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdClicked();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #78  <Method void zzxt.onAdClicked()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void onAdClicked(MediationInterstitialAdapter mediationinterstitialadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdClicked.");
	//    2    5:ldc1            #69  <String "Adapter called onAdClicked.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdClicked();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #78  <Method void zzxt.onAdClicked()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationInterstitialAdapter mediationinterstitialadapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationinterstitialadapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void onAdClicked(MediationNativeAdapter mediationnativeadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		mediationnativeadapter = ((MediationNativeAdapter) (zzbuv));
	//    2    5:aload_0         
	//    3    6:getfield        #88  <Field NativeAdMapper zzbuv>
	//    4    9:astore_1        
		UnifiedNativeAdMapper unifiednativeadmapper = zzbuw;
	//    5   10:aload_0         
	//    6   11:getfield        #90  <Field UnifiedNativeAdMapper zzbuw>
	//    7   14:astore_2        
		if(zzbux == null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #92  <Field NativeCustomTemplateAd zzbux>
	//*  10   19:ifnonnull       71
		{
			if(mediationnativeadapter == null && unifiednativeadmapper == null)
	//*  11   22:aload_1         
	//*  12   23:ifnonnull       37
	//*  13   26:aload_2         
	//*  14   27:ifnonnull       37
			{
				zzane.zzd("#007 Could not call remote method.", ((Throwable) (null)));
	//   15   30:ldc1            #80  <String "#007 Could not call remote method.">
	//   16   32:aconst_null     
	//   17   33:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
				return;
	//   18   36:return          
			}
			if(unifiednativeadmapper != null && !unifiednativeadmapper.getOverrideClickHandling())
	//*  19   37:aload_2         
	//*  20   38:ifnull          54
	//*  21   41:aload_2         
	//*  22   42:invokevirtual   #95  <Method boolean UnifiedNativeAdMapper.getOverrideClickHandling()>
	//*  23   45:ifne            54
			{
				zzane.zzck("Could not call onAdClicked since setOverrideClickHandling is not set to true");
	//   24   48:ldc1            #97  <String "Could not call onAdClicked since setOverrideClickHandling is not set to true">
	//   25   50:invokestatic    #74  <Method void zzane.zzck(String)>
				return;
	//   26   53:return          
			}
			if(mediationnativeadapter != null && !((NativeAdMapper) (mediationnativeadapter)).getOverrideClickHandling())
	//*  27   54:aload_1         
	//*  28   55:ifnull          71
	//*  29   58:aload_1         
	//*  30   59:invokevirtual   #98  <Method boolean NativeAdMapper.getOverrideClickHandling()>
	//*  31   62:ifne            71
			{
				zzane.zzck("Could not call onAdClicked since setOverrideClickHandling is not set to true");
	//   32   65:ldc1            #97  <String "Could not call onAdClicked since setOverrideClickHandling is not set to true">
	//   33   67:invokestatic    #74  <Method void zzane.zzck(String)>
				return;
	//   34   70:return          
			}
		}
		zzane.zzck("Adapter called onAdClicked.");
	//   35   71:ldc1            #69  <String "Adapter called onAdClicked.">
	//   36   73:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdClicked();
	//   37   76:aload_0         
	//   38   77:getfield        #26  <Field zzxt zzbuu>
	//   39   80:invokeinterface #78  <Method void zzxt.onAdClicked()>
			return;
	//   40   85:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*  41   86:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   42   87:ldc1            #80  <String "#007 Could not call remote method.">
	//   43   89:aload_1         
	//   44   90:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   45   93:return          
	}

	public final void onAdClosed(MediationBannerAdapter mediationbanneradapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdClosed.");
	//    2    5:ldc1            #101 <String "Adapter called onAdClosed.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdClosed();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #103 <Method void zzxt.onAdClosed()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void onAdClosed(MediationInterstitialAdapter mediationinterstitialadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdClosed.");
	//    2    5:ldc1            #101 <String "Adapter called onAdClosed.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdClosed();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #103 <Method void zzxt.onAdClosed()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationInterstitialAdapter mediationinterstitialadapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationinterstitialadapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void onAdClosed(MediationNativeAdapter mediationnativeadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdClosed.");
	//    2    5:ldc1            #101 <String "Adapter called onAdClosed.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdClosed();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #103 <Method void zzxt.onAdClosed()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void onAdFailedToLoad(MediationBannerAdapter mediationbanneradapter, int i)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		mediationbanneradapter = ((MediationBannerAdapter) (new StringBuilder(55)));
	//    2    5:new             #107 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:bipush          55
	//    5   11:invokespecial   #110 <Method void StringBuilder(int)>
	//    6   14:astore_1        
		((StringBuilder) (mediationbanneradapter)).append("Adapter called onAdFailedToLoad with error. ");
	//    7   15:aload_1         
	//    8   16:ldc1            #112 <String "Adapter called onAdFailedToLoad with error. ">
	//    9   18:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		((StringBuilder) (mediationbanneradapter)).append(i);
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:invokevirtual   #119 <Method StringBuilder StringBuilder.append(int)>
	//   14   27:pop             
		zzane.zzck(((StringBuilder) (mediationbanneradapter)).toString());
	//   15   28:aload_1         
	//   16   29:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   17   32:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdFailedToLoad(i);
	//   18   35:aload_0         
	//   19   36:getfield        #26  <Field zzxt zzbuu>
	//   20   39:iload_2         
	//   21   40:invokeinterface #125 <Method void zzxt.onAdFailedToLoad(int)>
			return;
	//   22   45:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*  23   46:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//   24   47:ldc1            #80  <String "#007 Could not call remote method.">
	//   25   49:aload_1         
	//   26   50:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   27   53:return          
	}

	public final void onAdFailedToLoad(MediationInterstitialAdapter mediationinterstitialadapter, int i)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		mediationinterstitialadapter = ((MediationInterstitialAdapter) (new StringBuilder(55)));
	//    2    5:new             #107 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:bipush          55
	//    5   11:invokespecial   #110 <Method void StringBuilder(int)>
	//    6   14:astore_1        
		((StringBuilder) (mediationinterstitialadapter)).append("Adapter called onAdFailedToLoad with error ");
	//    7   15:aload_1         
	//    8   16:ldc1            #128 <String "Adapter called onAdFailedToLoad with error ">
	//    9   18:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		((StringBuilder) (mediationinterstitialadapter)).append(i);
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:invokevirtual   #119 <Method StringBuilder StringBuilder.append(int)>
	//   14   27:pop             
		((StringBuilder) (mediationinterstitialadapter)).append(".");
	//   15   28:aload_1         
	//   16   29:ldc1            #130 <String ".">
	//   17   31:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		zzane.zzck(((StringBuilder) (mediationinterstitialadapter)).toString());
	//   19   35:aload_1         
	//   20   36:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   21   39:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdFailedToLoad(i);
	//   22   42:aload_0         
	//   23   43:getfield        #26  <Field zzxt zzbuu>
	//   24   46:iload_2         
	//   25   47:invokeinterface #125 <Method void zzxt.onAdFailedToLoad(int)>
			return;
	//   26   52:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationInterstitialAdapter mediationinterstitialadapter)
	//*  27   53:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationinterstitialadapter)));
	//   28   54:ldc1            #80  <String "#007 Could not call remote method.">
	//   29   56:aload_1         
	//   30   57:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   31   60:return          
	}

	public final void onAdFailedToLoad(MediationNativeAdapter mediationnativeadapter, int i)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		mediationnativeadapter = ((MediationNativeAdapter) (new StringBuilder(55)));
	//    2    5:new             #107 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:bipush          55
	//    5   11:invokespecial   #110 <Method void StringBuilder(int)>
	//    6   14:astore_1        
		((StringBuilder) (mediationnativeadapter)).append("Adapter called onAdFailedToLoad with error ");
	//    7   15:aload_1         
	//    8   16:ldc1            #128 <String "Adapter called onAdFailedToLoad with error ">
	//    9   18:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		((StringBuilder) (mediationnativeadapter)).append(i);
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:invokevirtual   #119 <Method StringBuilder StringBuilder.append(int)>
	//   14   27:pop             
		((StringBuilder) (mediationnativeadapter)).append(".");
	//   15   28:aload_1         
	//   16   29:ldc1            #130 <String ".">
	//   17   31:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		zzane.zzck(((StringBuilder) (mediationnativeadapter)).toString());
	//   19   35:aload_1         
	//   20   36:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   21   39:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdFailedToLoad(i);
	//   22   42:aload_0         
	//   23   43:getfield        #26  <Field zzxt zzbuu>
	//   24   46:iload_2         
	//   25   47:invokeinterface #125 <Method void zzxt.onAdFailedToLoad(int)>
			return;
	//   26   52:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*  27   53:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   28   54:ldc1            #80  <String "#007 Could not call remote method.">
	//   29   56:aload_1         
	//   30   57:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   31   60:return          
	}

	public final void onAdImpression(MediationNativeAdapter mediationnativeadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		mediationnativeadapter = ((MediationNativeAdapter) (zzbuv));
	//    2    5:aload_0         
	//    3    6:getfield        #88  <Field NativeAdMapper zzbuv>
	//    4    9:astore_1        
		UnifiedNativeAdMapper unifiednativeadmapper = zzbuw;
	//    5   10:aload_0         
	//    6   11:getfield        #90  <Field UnifiedNativeAdMapper zzbuw>
	//    7   14:astore_2        
		if(zzbux == null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #92  <Field NativeCustomTemplateAd zzbux>
	//*  10   19:ifnonnull       71
		{
			if(mediationnativeadapter == null && unifiednativeadmapper == null)
	//*  11   22:aload_1         
	//*  12   23:ifnonnull       37
	//*  13   26:aload_2         
	//*  14   27:ifnonnull       37
			{
				zzane.zzd("#007 Could not call remote method.", ((Throwable) (null)));
	//   15   30:ldc1            #80  <String "#007 Could not call remote method.">
	//   16   32:aconst_null     
	//   17   33:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
				return;
	//   18   36:return          
			}
			if(unifiednativeadmapper != null && !unifiednativeadmapper.getOverrideImpressionRecording())
	//*  19   37:aload_2         
	//*  20   38:ifnull          54
	//*  21   41:aload_2         
	//*  22   42:invokevirtual   #135 <Method boolean UnifiedNativeAdMapper.getOverrideImpressionRecording()>
	//*  23   45:ifne            54
			{
				zzane.zzck("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
	//   24   48:ldc1            #137 <String "Could not call onAdImpression since setOverrideImpressionRecording is not set to true">
	//   25   50:invokestatic    #74  <Method void zzane.zzck(String)>
				return;
	//   26   53:return          
			}
			if(mediationnativeadapter != null && !((NativeAdMapper) (mediationnativeadapter)).getOverrideImpressionRecording())
	//*  27   54:aload_1         
	//*  28   55:ifnull          71
	//*  29   58:aload_1         
	//*  30   59:invokevirtual   #138 <Method boolean NativeAdMapper.getOverrideImpressionRecording()>
	//*  31   62:ifne            71
			{
				zzane.zzck("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
	//   32   65:ldc1            #137 <String "Could not call onAdImpression since setOverrideImpressionRecording is not set to true">
	//   33   67:invokestatic    #74  <Method void zzane.zzck(String)>
				return;
	//   34   70:return          
			}
		}
		zzane.zzck("Adapter called onAdImpression.");
	//   35   71:ldc1            #140 <String "Adapter called onAdImpression.">
	//   36   73:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdImpression();
	//   37   76:aload_0         
	//   38   77:getfield        #26  <Field zzxt zzbuu>
	//   39   80:invokeinterface #142 <Method void zzxt.onAdImpression()>
			return;
	//   40   85:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*  41   86:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   42   87:ldc1            #80  <String "#007 Could not call remote method.">
	//   43   89:aload_1         
	//   44   90:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   45   93:return          
	}

	public final void onAdLeftApplication(MediationBannerAdapter mediationbanneradapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdLeftApplication.");
	//    2    5:ldc1            #145 <String "Adapter called onAdLeftApplication.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdLeftApplication();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #147 <Method void zzxt.onAdLeftApplication()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void onAdLeftApplication(MediationInterstitialAdapter mediationinterstitialadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdLeftApplication.");
	//    2    5:ldc1            #145 <String "Adapter called onAdLeftApplication.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdLeftApplication();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #147 <Method void zzxt.onAdLeftApplication()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationInterstitialAdapter mediationinterstitialadapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationinterstitialadapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void onAdLeftApplication(MediationNativeAdapter mediationnativeadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdLeftApplication.");
	//    2    5:ldc1            #145 <String "Adapter called onAdLeftApplication.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdLeftApplication();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #147 <Method void zzxt.onAdLeftApplication()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void onAdLoaded(MediationBannerAdapter mediationbanneradapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdLoaded.");
	//    2    5:ldc1            #150 <String "Adapter called onAdLoaded.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdLoaded();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #152 <Method void zzxt.onAdLoaded()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void onAdLoaded(MediationInterstitialAdapter mediationinterstitialadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdLoaded.");
	//    2    5:ldc1            #150 <String "Adapter called onAdLoaded.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdLoaded();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #152 <Method void zzxt.onAdLoaded()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationInterstitialAdapter mediationinterstitialadapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationinterstitialadapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void onAdLoaded(MediationNativeAdapter mediationnativeadapter, NativeAdMapper nativeadmapper)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdLoaded.");
	//    2    5:ldc1            #150 <String "Adapter called onAdLoaded.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		zzbuv = nativeadmapper;
	//    4   10:aload_0         
	//    5   11:aload_2         
	//    6   12:putfield        #88  <Field NativeAdMapper zzbuv>
		zzbuw = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #90  <Field UnifiedNativeAdMapper zzbuw>
		zza(mediationnativeadapter, zzbuw, zzbuv);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #90  <Field UnifiedNativeAdMapper zzbuw>
	//   13   25:aload_0         
	//   14   26:getfield        #88  <Field NativeAdMapper zzbuv>
	//   15   29:invokestatic    #155 <Method void zza(MediationNativeAdapter, UnifiedNativeAdMapper, NativeAdMapper)>
		try
		{
			zzbuu.onAdLoaded();
	//   16   32:aload_0         
	//   17   33:getfield        #26  <Field zzxt zzbuu>
	//   18   36:invokeinterface #152 <Method void zzxt.onAdLoaded()>
			return;
	//   19   41:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*  20   42:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   21   43:ldc1            #80  <String "#007 Could not call remote method.">
	//   22   45:aload_1         
	//   23   46:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   24   49:return          
	}

	public final void onAdLoaded(MediationNativeAdapter mediationnativeadapter, UnifiedNativeAdMapper unifiednativeadmapper)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdLoaded.");
	//    2    5:ldc1            #150 <String "Adapter called onAdLoaded.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		zzbuw = unifiednativeadmapper;
	//    4   10:aload_0         
	//    5   11:aload_2         
	//    6   12:putfield        #90  <Field UnifiedNativeAdMapper zzbuw>
		zzbuv = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #88  <Field NativeAdMapper zzbuv>
		zza(mediationnativeadapter, zzbuw, zzbuv);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #90  <Field UnifiedNativeAdMapper zzbuw>
	//   13   25:aload_0         
	//   14   26:getfield        #88  <Field NativeAdMapper zzbuv>
	//   15   29:invokestatic    #155 <Method void zza(MediationNativeAdapter, UnifiedNativeAdMapper, NativeAdMapper)>
		try
		{
			zzbuu.onAdLoaded();
	//   16   32:aload_0         
	//   17   33:getfield        #26  <Field zzxt zzbuu>
	//   18   36:invokeinterface #152 <Method void zzxt.onAdLoaded()>
			return;
	//   19   41:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*  20   42:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   21   43:ldc1            #80  <String "#007 Could not call remote method.">
	//   22   45:aload_1         
	//   23   46:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   24   49:return          
	}

	public final void onAdOpened(MediationBannerAdapter mediationbanneradapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdOpened.");
	//    2    5:ldc1            #159 <String "Adapter called onAdOpened.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdOpened();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #161 <Method void zzxt.onAdOpened()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void onAdOpened(MediationInterstitialAdapter mediationinterstitialadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdOpened.");
	//    2    5:ldc1            #159 <String "Adapter called onAdOpened.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdOpened();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #161 <Method void zzxt.onAdOpened()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationInterstitialAdapter mediationinterstitialadapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationinterstitialadapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void onAdOpened(MediationNativeAdapter mediationnativeadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdOpened.");
	//    2    5:ldc1            #159 <String "Adapter called onAdOpened.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAdOpened();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #161 <Method void zzxt.onAdOpened()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void onVideoEnd(MediationNativeAdapter mediationnativeadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onVideoEnd.");
	//    2    5:ldc1            #164 <String "Adapter called onVideoEnd.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onVideoEnd();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:invokeinterface #166 <Method void zzxt.onVideoEnd()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//    9   21:ldc1            #80  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void zza(MediationBannerAdapter mediationbanneradapter, String s, String s1)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAppEvent.");
	//    2    5:ldc1            #169 <String "Adapter called onAppEvent.">
	//    3    7:invokestatic    #74  <Method void zzane.zzck(String)>
		try
		{
			zzbuu.onAppEvent(s, s1);
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field zzxt zzbuu>
	//    6   14:aload_2         
	//    7   15:aload_3         
	//    8   16:invokeinterface #173 <Method void zzxt.onAppEvent(String, String)>
			return;
	//    9   21:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*  10   22:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//   11   23:ldc1            #80  <String "#007 Could not call remote method.">
	//   12   25:aload_1         
	//   13   26:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   14   29:return          
	}

	public final void zza(MediationNativeAdapter mediationnativeadapter, NativeCustomTemplateAd nativecustomtemplatead)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #61  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void Preconditions.checkMainThread(String)>
		mediationnativeadapter = ((MediationNativeAdapter) (String.valueOf(((Object) (nativecustomtemplatead.getCustomTemplateId())))));
	//    2    5:aload_2         
	//    3    6:invokeinterface #179 <Method String NativeCustomTemplateAd.getCustomTemplateId()>
	//    4   11:invokestatic    #185 <Method String String.valueOf(Object)>
	//    5   14:astore_1        
		if(((String) (mediationnativeadapter)).length() != 0)
	//*   6   15:aload_1         
	//*   7   16:invokevirtual   #189 <Method int String.length()>
	//*   8   19:ifeq            32
			mediationnativeadapter = ((MediationNativeAdapter) ("Adapter called onAdLoaded with template id ".concat(((String) (mediationnativeadapter)))));
	//    9   22:ldc1            #191 <String "Adapter called onAdLoaded with template id ">
	//   10   24:aload_1         
	//   11   25:invokevirtual   #195 <Method String String.concat(String)>
	//   12   28:astore_1        
		else
	//*  13   29:goto            42
			mediationnativeadapter = ((MediationNativeAdapter) (new String("Adapter called onAdLoaded with template id ")));
	//   14   32:new             #181 <Class String>
	//   15   35:dup             
	//   16   36:ldc1            #191 <String "Adapter called onAdLoaded with template id ">
	//   17   38:invokespecial   #197 <Method void String(String)>
	//   18   41:astore_1        
		zzane.zzck(((String) (mediationnativeadapter)));
	//   19   42:aload_1         
	//   20   43:invokestatic    #74  <Method void zzane.zzck(String)>
		zzbux = nativecustomtemplatead;
	//   21   46:aload_0         
	//   22   47:aload_2         
	//   23   48:putfield        #92  <Field NativeCustomTemplateAd zzbux>
		try
		{
			zzbuu.onAdLoaded();
	//   24   51:aload_0         
	//   25   52:getfield        #26  <Field zzxt zzbuu>
	//   26   55:invokeinterface #152 <Method void zzxt.onAdLoaded()>
			return;
	//   27   60:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*  28   61:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   29   62:ldc1            #80  <String "#007 Could not call remote method.">
	//   30   64:aload_1         
	//   31   65:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
		}
	//   32   68:return          
	}

	public final void zza(MediationNativeAdapter mediationnativeadapter, NativeCustomTemplateAd nativecustomtemplatead, String s)
	{
		if(nativecustomtemplatead instanceof zzqv)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #200 <Class zzqv>
	//*   2    4:ifeq            33
		{
			try
			{
				zzbuu.zzb(((zzqv)nativecustomtemplatead).zzku(), s);
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field zzxt zzbuu>
	//    5   11:aload_2         
	//    6   12:checkcast       #200 <Class zzqv>
	//    7   15:invokevirtual   #204 <Method zzqs zzqv.zzku()>
	//    8   18:aload_3         
	//    9   19:invokeinterface #208 <Method void zzxt.zzb(zzqs, String)>
				return;
	//   10   24:return          
			}
			// Misplaced declaration of an exception variable
			catch(MediationNativeAdapter mediationnativeadapter)
	//*  11   25:astore_1        
			{
				zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   12   26:ldc1            #80  <String "#007 Could not call remote method.">
	//   13   28:aload_1         
	//   14   29:invokestatic    #84  <Method void zzane.zzd(String, Throwable)>
			}
			return;
	//   15   32:return          
		} else
		{
			zzane.zzdk("Unexpected native custom template ad type.");
	//   16   33:ldc1            #210 <String "Unexpected native custom template ad type.">
	//   17   35:invokestatic    #213 <Method void zzane.zzdk(String)>
			return;
	//   18   38:return          
		}
	}

	public final NativeAdMapper zzmx()
	{
		return zzbuv;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field NativeAdMapper zzbuv>
	//    2    4:areturn         
	}

	public final UnifiedNativeAdMapper zzmy()
	{
		return zzbuw;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field UnifiedNativeAdMapper zzbuw>
	//    2    4:areturn         
	}

	public final NativeCustomTemplateAd zzmz()
	{
		return zzbux;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field NativeCustomTemplateAd zzbux>
	//    2    4:areturn         
	}

	private final zzxt zzbuu;
	private NativeAdMapper zzbuv;
	private UnifiedNativeAdMapper zzbuw;
	private NativeCustomTemplateAd zzbux;
}
