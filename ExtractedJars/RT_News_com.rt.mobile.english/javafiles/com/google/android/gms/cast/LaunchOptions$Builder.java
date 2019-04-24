// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import com.google.android.gms.internal.cast.zzcu;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//			LaunchOptions

public static final class LaunchOptions$Builder
{

	public final LaunchOptions build()
	{
		return zzcz;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LaunchOptions zzcz>
	//    2    4:areturn         
	}

	public final LaunchOptions$Builder setLocale(Locale locale)
	{
		zzcz.setLanguage(zzcu.zza(locale));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LaunchOptions zzcz>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method String zzcu.zza(Locale)>
	//    4    8:invokevirtual   #32  <Method void LaunchOptions.setLanguage(String)>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public final LaunchOptions$Builder setRelaunchIfRunning(boolean flag)
	{
		zzcz.setRelaunchIfRunning(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LaunchOptions zzcz>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #37  <Method void LaunchOptions.setRelaunchIfRunning(boolean)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private LaunchOptions zzcz;

	public LaunchOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzcz = new LaunchOptions();
	//    2    4:aload_0         
	//    3    5:new             #6   <Class LaunchOptions>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void LaunchOptions()>
	//    6   12:putfield        #17  <Field LaunchOptions zzcz>
	//    7   15:return          
	}
}
