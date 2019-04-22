// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;

public final class AdMobAdapter extends AbstractAdViewAdapter
{

	public AdMobAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void AbstractAdViewAdapter()>
	//    2    4:return          
	}

	protected final Bundle zza(Bundle bundle, Bundle bundle1)
	{
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            15
			bundle = new Bundle();
	//    3    7:new             #18  <Class Bundle>
	//    4   10:dup             
	//    5   11:invokespecial   #19  <Method void Bundle()>
	//    6   14:astore_1        
		Bundle bundle2 = bundle;
	//    7   15:aload_1         
	//    8   16:astore_3        
		if(bundle.getBoolean("_newBundle"))
	//*   9   17:aload_1         
	//*  10   18:ldc1            #9   <String "_newBundle">
	//*  11   20:invokevirtual   #23  <Method boolean Bundle.getBoolean(String)>
	//*  12   23:ifeq            35
			bundle2 = new Bundle(bundle);
	//   13   26:new             #18  <Class Bundle>
	//   14   29:dup             
	//   15   30:aload_1         
	//   16   31:invokespecial   #26  <Method void Bundle(Bundle)>
	//   17   34:astore_3        
		bundle2.putInt("gw", 1);
	//   18   35:aload_3         
	//   19   36:ldc1            #28  <String "gw">
	//   20   38:iconst_1        
	//   21   39:invokevirtual   #32  <Method void Bundle.putInt(String, int)>
		bundle2.putString("mad_hac", bundle1.getString("mad_hac"));
	//   22   42:aload_3         
	//   23   43:ldc1            #34  <String "mad_hac">
	//   24   45:aload_2         
	//   25   46:ldc1            #34  <String "mad_hac">
	//   26   48:invokevirtual   #38  <Method String Bundle.getString(String)>
	//   27   51:invokevirtual   #42  <Method void Bundle.putString(String, String)>
		if(!TextUtils.isEmpty(((CharSequence) (bundle1.getString("adJson")))))
	//*  28   54:aload_2         
	//*  29   55:ldc1            #44  <String "adJson">
	//*  30   57:invokevirtual   #38  <Method String Bundle.getString(String)>
	//*  31   60:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  32   63:ifne            78
			bundle2.putString("_ad", bundle1.getString("adJson"));
	//   33   66:aload_3         
	//   34   67:ldc1            #52  <String "_ad">
	//   35   69:aload_2         
	//   36   70:ldc1            #44  <String "adJson">
	//   37   72:invokevirtual   #38  <Method String Bundle.getString(String)>
	//   38   75:invokevirtual   #42  <Method void Bundle.putString(String, String)>
		bundle2.putBoolean("_noRefresh", true);
	//   39   78:aload_3         
	//   40   79:ldc1            #54  <String "_noRefresh">
	//   41   81:iconst_1        
	//   42   82:invokevirtual   #58  <Method void Bundle.putBoolean(String, boolean)>
		return bundle2;
	//   43   85:aload_3         
	//   44   86:areturn         
	}

	public static final String NEW_BUNDLE = "_newBundle";
}
