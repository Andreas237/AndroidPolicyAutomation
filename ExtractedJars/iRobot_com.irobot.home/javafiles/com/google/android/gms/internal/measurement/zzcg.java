// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Preconditions;

public final class zzcg
{

	private zzcg(GservicesValue gservicesvalue, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		Preconditions.checkNotNull(((Object) (gservicesvalue)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #24  <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:pop             
		zzaao = gservicesvalue;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #26  <Field GservicesValue zzaao>
		zzaan = obj;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #28  <Field Object zzaan>
	//   11   19:return          
	}

	static zzcg zza(String s, float f, float f1)
	{
		return new zzcg(GservicesValue.value(s, Float.valueOf(0.5F)), ((Object) (Float.valueOf(0.5F))));
	//    0    0:new             #2   <Class zzcg>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #34  <Float 0.5F>
	//    4    7:invokestatic    #40  <Method Float Float.valueOf(float)>
	//    5   10:invokestatic    #46  <Method GservicesValue GservicesValue.value(String, Float)>
	//    6   13:ldc1            #34  <Float 0.5F>
	//    7   15:invokestatic    #40  <Method Float Float.valueOf(float)>
	//    8   18:invokespecial   #48  <Method void zzcg(GservicesValue, Object)>
	//    9   21:areturn         
	}

	static zzcg zza(String s, int i, int j)
	{
		return new zzcg(GservicesValue.value(s, Integer.valueOf(j)), ((Object) (Integer.valueOf(i))));
	//    0    0:new             #2   <Class zzcg>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//    5    9:invokestatic    #58  <Method GservicesValue GservicesValue.value(String, Integer)>
	//    6   12:iload_1         
	//    7   13:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//    8   16:invokespecial   #48  <Method void zzcg(GservicesValue, Object)>
	//    9   19:areturn         
	}

	static zzcg zza(String s, long l, long l1)
	{
		return new zzcg(GservicesValue.value(s, Long.valueOf(l1)), ((Object) (Long.valueOf(l))));
	//    0    0:new             #2   <Class zzcg>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:lload_3         
	//    4    6:invokestatic    #65  <Method Long Long.valueOf(long)>
	//    5    9:invokestatic    #68  <Method GservicesValue GservicesValue.value(String, Long)>
	//    6   12:lload_1         
	//    7   13:invokestatic    #65  <Method Long Long.valueOf(long)>
	//    8   16:invokespecial   #48  <Method void zzcg(GservicesValue, Object)>
	//    9   19:areturn         
	}

	static zzcg zza(String s, String s1, String s2)
	{
		return new zzcg(GservicesValue.value(s, s2), ((Object) (s1)));
	//    0    0:new             #2   <Class zzcg>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokestatic    #73  <Method GservicesValue GservicesValue.value(String, String)>
	//    5    9:aload_1         
	//    6   10:invokespecial   #48  <Method void zzcg(GservicesValue, Object)>
	//    7   13:areturn         
	}

	static zzcg zza(String s, boolean flag, boolean flag1)
	{
		return new zzcg(GservicesValue.value(s, flag1), ((Object) (Boolean.valueOf(flag))));
	//    0    0:new             #2   <Class zzcg>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:invokestatic    #78  <Method GservicesValue GservicesValue.value(String, boolean)>
	//    5    9:iload_1         
	//    6   10:invokestatic    #83  <Method Boolean Boolean.valueOf(boolean)>
	//    7   13:invokespecial   #48  <Method void zzcg(GservicesValue, Object)>
	//    8   16:areturn         
	}

	public final Object get()
	{
		return zzaan;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Object zzaan>
	//    2    4:areturn         
	}

	private final Object zzaan;
	private final GservicesValue zzaao;
}
