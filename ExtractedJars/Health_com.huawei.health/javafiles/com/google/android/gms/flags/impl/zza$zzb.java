// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.internal.zzaqf;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.flags.impl:
//			zza

public static class zza$zzb extends zza
{

	public static Integer zza(SharedPreferences sharedpreferences, String s, Integer integer)
	{
		return (Integer)zzaqf.zzb(new Callable(sharedpreferences, s, integer) {

			public Object call()
				throws Exception
			{
				return ((Object) (zzDG()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #41  <Method Integer zzDG()>
			//    2    4:areturn         
			}

			public Integer zzDG()
			{
				return Integer.valueOf(zzaXo.getInt(zzaXp, zzaXr.intValue()));
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field SharedPreferences zzaXo>
			//    2    4:aload_0         
			//    3    5:getfield        #27  <Field String zzaXp>
			//    4    8:aload_0         
			//    5    9:getfield        #29  <Field Integer zzaXr>
			//    6   12:invokevirtual   #48  <Method int Integer.intValue()>
			//    7   15:invokeinterface #54  <Method int SharedPreferences.getInt(String, int)>
			//    8   20:invokestatic    #58  <Method Integer Integer.valueOf(int)>
			//    9   23:areturn         
			}

			final SharedPreferences zzaXo;
			final String zzaXp;
			final Integer zzaXr;

			
			{
				zzaXo = sharedpreferences;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field SharedPreferences zzaXo>
				zzaXp = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field String zzaXp>
				zzaXr = integer;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field Integer zzaXr>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #32  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:new             #8   <Class zza$zzb$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #14  <Method void zza$zzb$1(SharedPreferences, String, Integer)>
	//    6   10:invokestatic    #19  <Method Object zzaqf.zzb(Callable)>
	//    7   13:checkcast       #21  <Class Integer>
	//    8   16:areturn         
	}
}
