// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.flags.impl:
//			zza

final class zza$zzd$1
	implements Callable
{

	public Object call()
		throws Exception
	{
		return ((Object) (zzbY()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method String zzbY()>
	//    2    4:areturn         
	}

	public String zzbY()
	{
		return zzaXo.getString(zzaXp, zzaXt);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SharedPreferences zzaXo>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field String zzaXp>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field String zzaXt>
	//    6   12:invokeinterface #47  <Method String SharedPreferences.getString(String, String)>
	//    7   17:areturn         
	}

	final SharedPreferences zzaXo;
	final String zzaXp;
	final String zzaXt;

	zza$zzd$1(SharedPreferences sharedpreferences, String s, String s1)
	{
		zzaXo = sharedpreferences;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field SharedPreferences zzaXo>
		zzaXp = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field String zzaXp>
		zzaXt = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field String zzaXt>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:return          
	}
}
