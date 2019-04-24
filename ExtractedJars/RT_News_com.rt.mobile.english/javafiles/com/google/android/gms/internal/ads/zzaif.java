// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzane, zzaic, zzaig

public final class zzaif
	implements MediationRewardedVideoAdListener
{

	public zzaif(zzaic zzaic1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzcmj = zzaic1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field zzaic zzcmj>
	//    5    9:return          
	}

	public final void onAdClicked(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #23  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #29  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdClicked.");
	//    2    5:ldc1            #31  <String "Adapter called onAdClicked.">
	//    3    7:invokestatic    #36  <Method void zzane.zzck(String)>
		try
		{
			zzcmj.zzv(ObjectWrapper.wrap(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field zzaic zzcmj>
	//    6   14:aload_1         
	//    7   15:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   18:invokeinterface #48  <Method void zzaic.zzv(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #50  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #54  <Method void zzane.zzd(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void onAdClosed(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #23  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #29  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdClosed.");
	//    2    5:ldc1            #57  <String "Adapter called onAdClosed.">
	//    3    7:invokestatic    #36  <Method void zzane.zzck(String)>
		try
		{
			zzcmj.zzu(ObjectWrapper.wrap(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field zzaic zzcmj>
	//    6   14:aload_1         
	//    7   15:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   18:invokeinterface #60  <Method void zzaic.zzu(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #50  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #54  <Method void zzane.zzd(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, int i)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #23  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #29  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdFailedToLoad.");
	//    2    5:ldc1            #64  <String "Adapter called onAdFailedToLoad.">
	//    3    7:invokestatic    #36  <Method void zzane.zzck(String)>
		try
		{
			zzcmj.zzd(ObjectWrapper.wrap(((Object) (mediationrewardedvideoadadapter))), i);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field zzaic zzcmj>
	//    6   14:aload_1         
	//    7   15:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   18:iload_2         
	//    9   19:invokeinterface #67  <Method void zzaic.zzd(com.google.android.gms.dynamic.IObjectWrapper, int)>
			return;
	//   10   24:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  11   25:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   12   26:ldc1            #50  <String "#007 Could not call remote method.">
	//   13   28:aload_1         
	//   14   29:invokestatic    #54  <Method void zzane.zzd(String, Throwable)>
		}
	//   15   32:return          
	}

	public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #23  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #29  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdLeftApplication.");
	//    2    5:ldc1            #70  <String "Adapter called onAdLeftApplication.">
	//    3    7:invokestatic    #36  <Method void zzane.zzck(String)>
		try
		{
			zzcmj.zzw(ObjectWrapper.wrap(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field zzaic zzcmj>
	//    6   14:aload_1         
	//    7   15:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   18:invokeinterface #73  <Method void zzaic.zzw(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #50  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #54  <Method void zzane.zzd(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #23  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #29  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdLoaded.");
	//    2    5:ldc1            #76  <String "Adapter called onAdLoaded.">
	//    3    7:invokestatic    #36  <Method void zzane.zzck(String)>
		try
		{
			zzcmj.zzr(ObjectWrapper.wrap(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field zzaic zzcmj>
	//    6   14:aload_1         
	//    7   15:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   18:invokeinterface #79  <Method void zzaic.zzr(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #50  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #54  <Method void zzane.zzd(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void onAdOpened(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #23  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #29  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdOpened.");
	//    2    5:ldc1            #82  <String "Adapter called onAdOpened.">
	//    3    7:invokestatic    #36  <Method void zzane.zzck(String)>
		try
		{
			zzcmj.zzs(ObjectWrapper.wrap(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field zzaic zzcmj>
	//    6   14:aload_1         
	//    7   15:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   18:invokeinterface #85  <Method void zzaic.zzs(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #50  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #54  <Method void zzane.zzd(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, int i)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #23  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #29  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onInitializationFailed.");
	//    2    5:ldc1            #88  <String "Adapter called onInitializationFailed.">
	//    3    7:invokestatic    #36  <Method void zzane.zzck(String)>
		try
		{
			zzcmj.zzc(ObjectWrapper.wrap(((Object) (mediationrewardedvideoadadapter))), i);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field zzaic zzcmj>
	//    6   14:aload_1         
	//    7   15:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   18:iload_2         
	//    9   19:invokeinterface #91  <Method void zzaic.zzc(com.google.android.gms.dynamic.IObjectWrapper, int)>
			return;
	//   10   24:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  11   25:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   12   26:ldc1            #50  <String "#007 Could not call remote method.">
	//   13   28:aload_1         
	//   14   29:invokestatic    #54  <Method void zzane.zzd(String, Throwable)>
		}
	//   15   32:return          
	}

	public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #23  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #29  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onInitializationSucceeded.");
	//    2    5:ldc1            #94  <String "Adapter called onInitializationSucceeded.">
	//    3    7:invokestatic    #36  <Method void zzane.zzck(String)>
		try
		{
			zzcmj.zzq(ObjectWrapper.wrap(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field zzaic zzcmj>
	//    6   14:aload_1         
	//    7   15:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   18:invokeinterface #97  <Method void zzaic.zzq(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #50  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #54  <Method void zzane.zzd(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void onRewarded(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, RewardItem rewarditem)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #23  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #29  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onRewarded.");
	//    2    5:ldc1            #101 <String "Adapter called onRewarded.">
	//    3    7:invokestatic    #36  <Method void zzane.zzck(String)>
		if(rewarditem != null)
	//*   4   10:aload_2         
	//*   5   11:ifnull          36
		{
			try
			{
				zzcmj.zza(ObjectWrapper.wrap(((Object) (mediationrewardedvideoadadapter))), new zzaig(rewarditem));
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field zzaic zzcmj>
	//    8   18:aload_1         
	//    9   19:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   10   22:new             #103 <Class zzaig>
	//   11   25:dup             
	//   12   26:aload_2         
	//   13   27:invokespecial   #106 <Method void zzaig(RewardItem)>
	//   14   30:invokeinterface #110 <Method void zzaic.zza(com.google.android.gms.dynamic.IObjectWrapper, zzaig)>
				return;
	//   15   35:return          
			}
	//*  16   36:aload_0         
	//*  17   37:getfield        #16  <Field zzaic zzcmj>
	//*  18   40:aload_1         
	//*  19   41:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//*  20   44:new             #103 <Class zzaig>
	//*  21   47:dup             
	//*  22   48:ldc1            #112 <String "">
	//*  23   50:iconst_1        
	//*  24   51:invokespecial   #115 <Method void zzaig(String, int)>
	//*  25   54:invokeinterface #110 <Method void zzaic.zza(com.google.android.gms.dynamic.IObjectWrapper, zzaig)>
	//*  26   59:return          
	//*  27   60:ldc1            #50  <String "#007 Could not call remote method.">
	//*  28   62:aload_1         
	//*  29   63:invokestatic    #54  <Method void zzane.zzd(String, Throwable)>
	//*  30   66:return          
			// Misplaced declaration of an exception variable
			catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
			{
				zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
			}
			break MISSING_BLOCK_LABEL_66;
		}
		zzcmj.zza(ObjectWrapper.wrap(((Object) (mediationrewardedvideoadadapter))), new zzaig("", 1));
		return;
	//*  31   67:astore_1        
	//*  32   68:goto            60
	}

	public final void onVideoCompleted(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #23  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #29  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onVideoCompleted.");
	//    2    5:ldc1            #118 <String "Adapter called onVideoCompleted.">
	//    3    7:invokestatic    #36  <Method void zzane.zzck(String)>
		try
		{
			zzcmj.zzx(ObjectWrapper.wrap(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field zzaic zzcmj>
	//    6   14:aload_1         
	//    7   15:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   18:invokeinterface #121 <Method void zzaic.zzx(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #50  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #54  <Method void zzane.zzd(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #23  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #29  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onVideoStarted.");
	//    2    5:ldc1            #124 <String "Adapter called onVideoStarted.">
	//    3    7:invokestatic    #36  <Method void zzane.zzck(String)>
		try
		{
			zzcmj.zzt(ObjectWrapper.wrap(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field zzaic zzcmj>
	//    6   14:aload_1         
	//    7   15:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   18:invokeinterface #127 <Method void zzaic.zzt(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #50  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #54  <Method void zzane.zzd(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void zzc(Bundle bundle)
	{
		Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #23  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #29  <Method void Preconditions.checkMainThread(String)>
		zzane.zzck("Adapter called onAdMetadataChanged.");
	//    2    5:ldc1            #130 <String "Adapter called onAdMetadataChanged.">
	//    3    7:invokestatic    #36  <Method void zzane.zzck(String)>
		try
		{
			zzcmj.zzc(bundle);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field zzaic zzcmj>
	//    6   14:aload_1         
	//    7   15:invokeinterface #132 <Method void zzaic.zzc(Bundle)>
			return;
	//    8   20:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*   9   21:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (bundle)));
	//   10   22:ldc1            #50  <String "#007 Could not call remote method.">
	//   11   24:aload_1         
	//   12   25:invokestatic    #54  <Method void zzane.zzd(String, Throwable)>
		}
	//   13   28:return          
	}

	private final zzaic zzcmj;
}
