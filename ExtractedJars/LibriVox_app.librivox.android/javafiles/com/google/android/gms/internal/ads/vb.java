// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.b;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.a;
import com.google.android.gms.c.d;
import com.google.android.gms.common.internal.am;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aag, ux, zzawd

public final class vb
	implements a
{

	public vb(ux ux1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = ux1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ux a>
	//    5    9:return          
	}

	public final void a(Bundle bundle)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #22  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #28  <Method void am.b(String)>
		com.google.android.gms.internal.ads.aag.b("Adapter called onAdMetadataChanged.");
	//    2    5:ldc1            #30  <String "Adapter called onAdMetadataChanged.">
	//    3    7:invokestatic    #33  <Method void com.google.android.gms.internal.ads.aag.b(String)>
		try
		{
			a.a(bundle);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ux a>
	//    6   14:aload_1         
	//    7   15:invokeinterface #37  <Method void com.google.android.gms.internal.ads.ux.a(Bundle)>
			return;
	//    8   20:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*   9   21:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (bundle)));
	//   10   22:ldc1            #39  <String "#007 Could not call remote method.">
	//   11   24:aload_1         
	//   12   25:invokestatic    #43  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   13   28:return          
	}

	public final void a(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #22  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #28  <Method void am.b(String)>
		com.google.android.gms.internal.ads.aag.b("Adapter called onInitializationSucceeded.");
	//    2    5:ldc1            #46  <String "Adapter called onInitializationSucceeded.">
	//    3    7:invokestatic    #33  <Method void com.google.android.gms.internal.ads.aag.b(String)>
		try
		{
			a.a(com.google.android.gms.c.d.a(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ux a>
	//    6   14:aload_1         
	//    7   15:invokestatic    #51  <Method com.google.android.gms.c.a d.a(Object)>
	//    8   18:invokeinterface #54  <Method void com.google.android.gms.internal.ads.ux.a(com.google.android.gms.c.a)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #39  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #43  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void a(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, int i)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #22  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #28  <Method void am.b(String)>
		com.google.android.gms.internal.ads.aag.b("Adapter called onAdFailedToLoad.");
	//    2    5:ldc1            #57  <String "Adapter called onAdFailedToLoad.">
	//    3    7:invokestatic    #33  <Method void com.google.android.gms.internal.ads.aag.b(String)>
		try
		{
			a.b(com.google.android.gms.c.d.a(((Object) (mediationrewardedvideoadadapter))), i);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ux a>
	//    6   14:aload_1         
	//    7   15:invokestatic    #51  <Method com.google.android.gms.c.a d.a(Object)>
	//    8   18:iload_2         
	//    9   19:invokeinterface #60  <Method void com.google.android.gms.internal.ads.ux.b(com.google.android.gms.c.a, int)>
			return;
	//   10   24:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  11   25:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   12   26:ldc1            #39  <String "#007 Could not call remote method.">
	//   13   28:aload_1         
	//   14   29:invokestatic    #43  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   15   32:return          
	}

	public final void a(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter, b b1)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #22  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #28  <Method void am.b(String)>
		com.google.android.gms.internal.ads.aag.b("Adapter called onRewarded.");
	//    2    5:ldc1            #63  <String "Adapter called onRewarded.">
	//    3    7:invokestatic    #33  <Method void com.google.android.gms.internal.ads.aag.b(String)>
		if(b1 != null)
	//*   4   10:aload_2         
	//*   5   11:ifnull          36
		{
			try
			{
				a.a(com.google.android.gms.c.d.a(((Object) (mediationrewardedvideoadadapter))), new zzawd(b1));
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field ux a>
	//    8   18:aload_1         
	//    9   19:invokestatic    #51  <Method com.google.android.gms.c.a d.a(Object)>
	//   10   22:new             #65  <Class zzawd>
	//   11   25:dup             
	//   12   26:aload_2         
	//   13   27:invokespecial   #68  <Method void zzawd(b)>
	//   14   30:invokeinterface #71  <Method void com.google.android.gms.internal.ads.ux.a(com.google.android.gms.c.a, zzawd)>
				return;
	//   15   35:return          
			}
	//*  16   36:aload_0         
	//*  17   37:getfield        #16  <Field ux a>
	//*  18   40:aload_1         
	//*  19   41:invokestatic    #51  <Method com.google.android.gms.c.a d.a(Object)>
	//*  20   44:new             #65  <Class zzawd>
	//*  21   47:dup             
	//*  22   48:ldc1            #73  <String "">
	//*  23   50:iconst_1        
	//*  24   51:invokespecial   #76  <Method void zzawd(String, int)>
	//*  25   54:invokeinterface #71  <Method void com.google.android.gms.internal.ads.ux.a(com.google.android.gms.c.a, zzawd)>
	//*  26   59:return          
			// Misplaced declaration of an exception variable
			catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  27   60:astore_1        
			{
				com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   28   61:ldc1            #39  <String "#007 Could not call remote method.">
	//   29   63:aload_1         
	//   30   64:invokestatic    #43  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
			}
			break MISSING_BLOCK_LABEL_67;
		}
		a.a(com.google.android.gms.c.d.a(((Object) (mediationrewardedvideoadadapter))), new zzawd("", 1));
		return;
	//   31   67:return          
	}

	public final void b(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #22  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #28  <Method void am.b(String)>
		com.google.android.gms.internal.ads.aag.b("Adapter called onAdLoaded.");
	//    2    5:ldc1            #78  <String "Adapter called onAdLoaded.">
	//    3    7:invokestatic    #33  <Method void com.google.android.gms.internal.ads.aag.b(String)>
		try
		{
			a.b(com.google.android.gms.c.d.a(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ux a>
	//    6   14:aload_1         
	//    7   15:invokestatic    #51  <Method com.google.android.gms.c.a d.a(Object)>
	//    8   18:invokeinterface #80  <Method void com.google.android.gms.internal.ads.ux.b(com.google.android.gms.c.a)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #39  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #43  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void c(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #22  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #28  <Method void am.b(String)>
		com.google.android.gms.internal.ads.aag.b("Adapter called onAdOpened.");
	//    2    5:ldc1            #83  <String "Adapter called onAdOpened.">
	//    3    7:invokestatic    #33  <Method void com.google.android.gms.internal.ads.aag.b(String)>
		try
		{
			a.c(com.google.android.gms.c.d.a(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ux a>
	//    6   14:aload_1         
	//    7   15:invokestatic    #51  <Method com.google.android.gms.c.a d.a(Object)>
	//    8   18:invokeinterface #85  <Method void ux.c(com.google.android.gms.c.a)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #39  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #43  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void d(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #22  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #28  <Method void am.b(String)>
		com.google.android.gms.internal.ads.aag.b("Adapter called onVideoStarted.");
	//    2    5:ldc1            #87  <String "Adapter called onVideoStarted.">
	//    3    7:invokestatic    #33  <Method void com.google.android.gms.internal.ads.aag.b(String)>
		try
		{
			a.d(com.google.android.gms.c.d.a(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ux a>
	//    6   14:aload_1         
	//    7   15:invokestatic    #51  <Method com.google.android.gms.c.a d.a(Object)>
	//    8   18:invokeinterface #89  <Method void com.google.android.gms.internal.ads.ux.d(com.google.android.gms.c.a)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #39  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #43  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void e(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #22  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #28  <Method void am.b(String)>
		com.google.android.gms.internal.ads.aag.b("Adapter called onAdClosed.");
	//    2    5:ldc1            #92  <String "Adapter called onAdClosed.">
	//    3    7:invokestatic    #33  <Method void com.google.android.gms.internal.ads.aag.b(String)>
		try
		{
			a.e(com.google.android.gms.c.d.a(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ux a>
	//    6   14:aload_1         
	//    7   15:invokestatic    #51  <Method com.google.android.gms.c.a d.a(Object)>
	//    8   18:invokeinterface #94  <Method void ux.e(com.google.android.gms.c.a)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #39  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #43  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void f(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #22  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #28  <Method void am.b(String)>
		com.google.android.gms.internal.ads.aag.b("Adapter called onAdLeftApplication.");
	//    2    5:ldc1            #97  <String "Adapter called onAdLeftApplication.">
	//    3    7:invokestatic    #33  <Method void com.google.android.gms.internal.ads.aag.b(String)>
		try
		{
			a.g(com.google.android.gms.c.d.a(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ux a>
	//    6   14:aload_1         
	//    7   15:invokestatic    #51  <Method com.google.android.gms.c.a d.a(Object)>
	//    8   18:invokeinterface #100 <Method void ux.g(com.google.android.gms.c.a)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #39  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #43  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   14   31:return          
	}

	public final void g(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #22  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #28  <Method void am.b(String)>
		com.google.android.gms.internal.ads.aag.b("Adapter called onVideoCompleted.");
	//    2    5:ldc1            #102 <String "Adapter called onVideoCompleted.">
	//    3    7:invokestatic    #33  <Method void com.google.android.gms.internal.ads.aag.b(String)>
		try
		{
			a.h(com.google.android.gms.c.d.a(((Object) (mediationrewardedvideoadadapter))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ux a>
	//    6   14:aload_1         
	//    7   15:invokestatic    #51  <Method com.google.android.gms.c.a d.a(Object)>
	//    8   18:invokeinterface #105 <Method void ux.h(com.google.android.gms.c.a)>
			return;
	//    9   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationRewardedVideoAdAdapter mediationrewardedvideoadadapter)
	//*  10   24:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationrewardedvideoadadapter)));
	//   11   25:ldc1            #39  <String "#007 Could not call remote method.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #43  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   14   31:return          
	}

	private final ux a;
}
