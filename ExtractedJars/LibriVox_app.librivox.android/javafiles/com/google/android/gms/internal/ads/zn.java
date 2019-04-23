// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;

public final class zn
{

	public static boolean a(Bundle bundle)
	{
		bundle = bundle.getBundle(((Class) (com/google/ads/mediation/admob/AdMobAdapter)).getName());
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <Class AdMobAdapter>
	//    2    3:invokevirtual   #16  <Method String Class.getName()>
	//    3    6:invokevirtual   #22  <Method Bundle Bundle.getBundle(String)>
	//    4    9:astore_0        
		return bundle != null && bundle.getBoolean("render_test_ad_label", false);
	//    5   10:aload_0         
	//    6   11:ifnull          26
	//    7   14:aload_0         
	//    8   15:ldc1            #24  <String "render_test_ad_label">
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #28  <Method boolean Bundle.getBoolean(String, boolean)>
	//   11   21:ifeq            26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}
}
