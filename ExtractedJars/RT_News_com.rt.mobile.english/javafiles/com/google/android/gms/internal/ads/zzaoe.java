// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaof, zzaog, zzaoh, zzaod

public final class zzaoe
{

	public static zzaod zza(Executor executor)
	{
		return ((zzaod) (new zzaoh(executor, ((zzaof) (null)))));
	//    0    0:new             #36  <Class zzaoh>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #39  <Method void zzaoh(Executor, zzaof)>
	//    5    9:areturn         
	}

	public static final Executor zzcvy;
	public static final Executor zzcvz;
	private static final zzaod zzcwa;
	private static final zzaod zzcwb;

	static 
	{
		zzcvy = ((Executor) (new zzaof()));
	//    0    0:new             #15  <Class zzaof>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzaof()>
	//    3    7:putstatic       #20  <Field Executor zzcvy>
		zzcvz = ((Executor) (new zzaog()));
	//    4   10:new             #22  <Class zzaog>
	//    5   13:dup             
	//    6   14:invokespecial   #23  <Method void zzaog()>
	//    7   17:putstatic       #25  <Field Executor zzcvz>
		zzcwa = zza(zzcvy);
	//    8   20:getstatic       #20  <Field Executor zzcvy>
	//    9   23:invokestatic    #29  <Method zzaod zza(Executor)>
	//   10   26:putstatic       #31  <Field zzaod zzcwa>
		zzcwb = zza(zzcvz);
	//   11   29:getstatic       #25  <Field Executor zzcvz>
	//   12   32:invokestatic    #29  <Method zzaod zza(Executor)>
	//   13   35:putstatic       #33  <Field zzaod zzcwb>
	//*  14   38:return          
	}
}
