// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzjj

public final class zzamm
{

	public static boolean zzo(zzjj zzjj1)
	{
		if(zzjj1.zzaqg != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Bundle zzjj.zzaqg>
	//*   2    4:ifnull          15
			zzjj1 = ((zzjj) (zzjj1.zzaqg));
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field Bundle zzjj.zzaqg>
	//    5   11:astore_0        
		else
	//*   6   12:goto            23
			zzjj1 = ((zzjj) (new Bundle()));
	//    7   15:new             #15  <Class Bundle>
	//    8   18:dup             
	//    9   19:invokespecial   #19  <Method void Bundle()>
	//   10   22:astore_0        
		if(((Bundle) (zzjj1)).getBundle(((Class) (com/google/ads/mediation/admob/AdMobAdapter)).getName()) != null)
	//*  11   23:aload_0         
	//*  12   24:ldc1            #21  <Class AdMobAdapter>
	//*  13   26:invokevirtual   #27  <Method String Class.getName()>
	//*  14   29:invokevirtual   #31  <Method Bundle Bundle.getBundle(String)>
	//*  15   32:ifnull          48
			zzjj1 = ((zzjj) (((Bundle) (zzjj1)).getBundle(((Class) (com/google/ads/mediation/admob/AdMobAdapter)).getName())));
	//   16   35:aload_0         
	//   17   36:ldc1            #21  <Class AdMobAdapter>
	//   18   38:invokevirtual   #27  <Method String Class.getName()>
	//   19   41:invokevirtual   #31  <Method Bundle Bundle.getBundle(String)>
	//   20   44:astore_0        
		else
	//*  21   45:goto            56
			zzjj1 = ((zzjj) (new Bundle()));
	//   22   48:new             #15  <Class Bundle>
	//   23   51:dup             
	//   24   52:invokespecial   #19  <Method void Bundle()>
	//   25   55:astore_0        
		return ((Bundle) (zzjj1)).getBoolean("render_test_label", false);
	//   26   56:aload_0         
	//   27   57:ldc1            #33  <String "render_test_label">
	//   28   59:iconst_0        
	//   29   60:invokevirtual   #37  <Method boolean Bundle.getBoolean(String, boolean)>
	//   30   63:ireturn         
	}
}
