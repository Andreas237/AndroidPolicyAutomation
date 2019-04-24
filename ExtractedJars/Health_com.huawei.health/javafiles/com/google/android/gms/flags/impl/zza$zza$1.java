// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.flags.impl:
//			zza

final class zza$zza$1
	implements Callable
{

	public Object call()
		throws Exception
	{
		return ((Object) (zzbX()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method Boolean zzbX()>
	//    2    4:areturn         
	}

	public Boolean zzbX()
	{
		return Boolean.valueOf(zzaXo.getBoolean(zzaXp, zzaXq.booleanValue()));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SharedPreferences zzaXo>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field String zzaXp>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field Boolean zzaXq>
	//    6   12:invokevirtual   #47  <Method boolean Boolean.booleanValue()>
	//    7   15:invokeinterface #53  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    8   20:invokestatic    #57  <Method Boolean Boolean.valueOf(boolean)>
	//    9   23:areturn         
	}

	final SharedPreferences zzaXo;
	final String zzaXp;
	final Boolean zzaXq;

	zza$zza$1(SharedPreferences sharedpreferences, String s, Boolean boolean1)
	{
		zzaXo = sharedpreferences;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field SharedPreferences zzaXo>
		zzaXp = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field String zzaXp>
		zzaXq = boolean1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field Boolean zzaXq>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:return          
	}
}
