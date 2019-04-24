// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.internal.zzaqf;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.flags.impl:
//			zza

public static class zza$zzc extends zza
{

	public static Long zza(SharedPreferences sharedpreferences, String s, Long long1)
	{
		return (Long)zzaqf.zzb(new Callable(sharedpreferences, s, long1) {

			public Object call()
				throws Exception
			{
				return ((Object) (zzDH()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #41  <Method Long zzDH()>
			//    2    4:areturn         
			}

			public Long zzDH()
			{
				return Long.valueOf(zzaXo.getLong(zzaXp, zzaXs.longValue()));
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field SharedPreferences zzaXo>
			//    2    4:aload_0         
			//    3    5:getfield        #27  <Field String zzaXp>
			//    4    8:aload_0         
			//    5    9:getfield        #29  <Field Long zzaXs>
			//    6   12:invokevirtual   #48  <Method long Long.longValue()>
			//    7   15:invokeinterface #54  <Method long SharedPreferences.getLong(String, long)>
			//    8   20:invokestatic    #58  <Method Long Long.valueOf(long)>
			//    9   23:areturn         
			}

			final SharedPreferences zzaXo;
			final String zzaXp;
			final Long zzaXs;

			
			{
				zzaXo = sharedpreferences;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field SharedPreferences zzaXo>
				zzaXp = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field String zzaXp>
				zzaXs = long1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field Long zzaXs>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #32  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:new             #8   <Class zza$zzc$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #14  <Method void zza$zzc$1(SharedPreferences, String, Long)>
	//    6   10:invokestatic    #20  <Method Object zzaqf.zzb(Callable)>
	//    7   13:checkcast       #22  <Class Long>
	//    8   16:areturn         
	}
}
