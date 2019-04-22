// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public interface MediationAdapter
{
	public static final class zza
	{

		public final zza zzaj(int i)
		{
			zzdfl = 1;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #18  <Field int zzdfl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Bundle zzvx()
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #22  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void Bundle()>
		//    3    7:astore_1        
			bundle.putInt("capabilities", zzdfl);
		//    4    8:aload_1         
		//    5    9:ldc1            #25  <String "capabilities">
		//    6   11:aload_0         
		//    7   12:getfield        #18  <Field int zzdfl>
		//    8   15:invokevirtual   #29  <Method void Bundle.putInt(String, int)>
			return bundle;
		//    9   18:aload_1         
		//   10   19:areturn         
		}

		private int zzdfl;

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	public abstract void onDestroy();

	public abstract void onPause();

	public abstract void onResume();
}
