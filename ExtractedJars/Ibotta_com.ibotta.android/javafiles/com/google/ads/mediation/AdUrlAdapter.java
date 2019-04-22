// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.*;

// Referenced classes of package com.google.ads.mediation:
//			AbstractAdViewAdapter

public final class AdUrlAdapter extends AbstractAdViewAdapter
	implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter
{

	public AdUrlAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void AbstractAdViewAdapter()>
	//    2    4:return          
	}

	public final String getAdUnitId(Bundle bundle)
	{
		return "adurl";
	//    0    0:ldc1            #20  <String "adurl">
	//    1    2:areturn         
	}

	protected final Bundle zza(Bundle bundle, Bundle bundle1)
	{
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            15
			bundle = new Bundle();
	//    3    7:new             #24  <Class Bundle>
	//    4   10:dup             
	//    5   11:invokespecial   #25  <Method void Bundle()>
	//    6   14:astore_1        
		bundle.putBundle("sdk_less_server_data", bundle1);
	//    7   15:aload_1         
	//    8   16:ldc1            #27  <String "sdk_less_server_data">
	//    9   18:aload_2         
	//   10   19:invokevirtual   #31  <Method void Bundle.putBundle(String, Bundle)>
		bundle.putBoolean("_noRefresh", true);
	//   11   22:aload_1         
	//   12   23:ldc1            #33  <String "_noRefresh">
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #37  <Method void Bundle.putBoolean(String, boolean)>
		return bundle;
	//   15   29:aload_1         
	//   16   30:areturn         
	}
}
