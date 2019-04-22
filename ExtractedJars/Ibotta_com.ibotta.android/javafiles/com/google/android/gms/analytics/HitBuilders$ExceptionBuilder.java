// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import com.google.android.gms.internal.measurement.zzdd;

// Referenced classes of package com.google.android.gms.analytics:
//			HitBuilders

public static class HitBuilders$ExceptionBuilder extends HitBuilders.HitBuilder
{

	public HitBuilders$ExceptionBuilder setDescription(String s)
	{
		((HitBuilders.HitBuilder)this).set("&exd", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #26  <String "&exd">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    4    7:pop             
		return this;
	//    5    8:aload_0         
	//    6    9:areturn         
	}

	public HitBuilders$ExceptionBuilder setFatal(boolean flag)
	{
		((HitBuilders.HitBuilder)this).set("&exf", zzdd.zzc(flag));
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <String "&exf">
	//    2    3:iload_1         
	//    3    4:invokestatic    #36  <Method String zzdd.zzc(boolean)>
	//    4    7:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    5   10:pop             
		return this;
	//    6   11:aload_0         
	//    7   12:areturn         
	}

	public HitBuilders$ExceptionBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void HitBuilders$HitBuilder()>
		((HitBuilders.HitBuilder)this).set("&t", "exception");
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <String "&t">
	//    4    7:ldc1            #17  <String "exception">
	//    5    9:invokevirtual   #21  <Method HitBuilders$HitBuilder HitBuilders$HitBuilder.set(String, String)>
	//    6   12:pop             
	//    7   13:return          
	}
}
