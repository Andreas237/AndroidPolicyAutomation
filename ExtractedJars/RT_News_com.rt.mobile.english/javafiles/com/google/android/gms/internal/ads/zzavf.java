// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzavg, zzauo, zzauh, zzauf

public final class zzavf
{

	public zzavf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	public static zzauf zza(zzauh zzauh)
		throws GeneralSecurityException
	{
		return ((zzauf) (new zzavg(zzauo.zza(zzauh, ((zzaug) (null))))));
	//    0    0:new             #32  <Class zzavg>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokestatic    #37  <Method zzaum zzauo.zza(zzauh, zzaug)>
	//    5    9:invokespecial   #40  <Method void zzavg(zzaum)>
	//    6   12:areturn         
	}

	private static final Logger logger = Logger.getLogger(((Class) (com/google/android/gms/internal/ads/zzavf)).getName());

	static 
	{
	//    0    0:ldc1            #2   <Class zzavf>
	//    1    2:invokevirtual   #14  <Method String Class.getName()>
	//    2    5:invokestatic    #20  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #22  <Field Logger logger>
	//*   4   11:return          
	}
}
