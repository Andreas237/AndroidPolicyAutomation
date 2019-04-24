// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.flags.impl:
//			zza

final class zza$zzb$1
	implements Callable
{

	public Object call()
		throws Exception
	{
		return ((Object) (zzCS()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method Integer zzCS()>
	//    2    4:areturn         
	}

	public Integer zzCS()
	{
		return Integer.valueOf(zzaWM.getInt(zzaWN, zzaWP.intValue()));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SharedPreferences zzaWM>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field String zzaWN>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field Integer zzaWP>
	//    6   12:invokevirtual   #48  <Method int Integer.intValue()>
	//    7   15:invokeinterface #54  <Method int SharedPreferences.getInt(String, int)>
	//    8   20:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//    9   23:areturn         
	}

	final SharedPreferences zzaWM;
	final String zzaWN;
	final Integer zzaWP;

	zza$zzb$1(SharedPreferences sharedpreferences, String s, Integer integer)
	{
		zzaWM = sharedpreferences;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field SharedPreferences zzaWM>
		zzaWN = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field String zzaWN>
		zzaWP = integer;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #29  <Field Integer zzaWP>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #32  <Method void Object()>
	//   11   19:return          
	}
}
