// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.internal.zzaps;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.flags.impl:
//			zza

public static class zza$zzd extends zza
{

	public static String zza(SharedPreferences sharedpreferences, String s, String s1)
	{
		return (String)zzaps.zzb(new Callable(sharedpreferences, s, s1) {

			public Object call()
				throws Exception
			{
				return ((Object) (zzou()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #40  <Method String zzou()>
			//    2    4:areturn         
			}

			public String zzou()
			{
				return zzaWM.getString(zzaWN, zzaWR);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field SharedPreferences zzaWM>
			//    2    4:aload_0         
			//    3    5:getfield        #26  <Field String zzaWN>
			//    4    8:aload_0         
			//    5    9:getfield        #28  <Field String zzaWR>
			//    6   12:invokeinterface #47  <Method String SharedPreferences.getString(String, String)>
			//    7   17:areturn         
			}

			final SharedPreferences zzaWM;
			final String zzaWN;
			final String zzaWR;

			
			{
				zzaWM = sharedpreferences;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field SharedPreferences zzaWM>
				zzaWN = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field String zzaWN>
				zzaWR = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field String zzaWR>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:new             #8   <Class zza$zzd$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #14  <Method void zza$zzd$1(SharedPreferences, String, String)>
	//    6   10:invokestatic    #20  <Method Object zzaps.zzb(Callable)>
	//    7   13:checkcast       #22  <Class String>
	//    8   16:areturn         
	}
}
