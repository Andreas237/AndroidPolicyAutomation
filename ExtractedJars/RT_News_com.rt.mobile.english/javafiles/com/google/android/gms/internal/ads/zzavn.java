// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzayf, zzaub, zzbbo, zzavm, 
//			zzauo

public final class zzavn
{

	public static void zzwk()
		throws GeneralSecurityException
	{
		zzauo.zza("TinkMac", ((zzaua) (new zzavm())));
	//    0    0:ldc1            #27  <String "TinkMac">
	//    1    2:new             #70  <Class zzavm>
	//    2    5:dup             
	//    3    6:invokespecial   #72  <Method void zzavm()>
	//    4    9:invokestatic    #77  <Method void zzauo.zza(String, zzaua)>
	//    5   12:return          
	}

	public static final zzayf zzdht;
	private static final zzayf zzdhu;

	static 
	{
		zzdht = (zzayf)(zzbbo)((zzbbo.zza) (zzayf.zzaam().zzej("TINK_MAC_1_0_0").zzb(zzaub.zza("TinkMac", "Mac", "HmacKey", 0, true)))).zzadi();
	//    0    0:invokestatic    #17  <Method zzayf$zza zzayf.zzaam()>
	//    1    3:ldc1            #19  <String "TINK_MAC_1_0_0">
	//    2    5:invokevirtual   #25  <Method zzayf$zza zzayf$zza.zzej(String)>
	//    3    8:ldc1            #27  <String "TinkMac">
	//    4   10:ldc1            #29  <String "Mac">
	//    5   12:ldc1            #31  <String "HmacKey">
	//    6   14:iconst_0        
	//    7   15:iconst_1        
	//    8   16:invokestatic    #37  <Method zzaxp zzaub.zza(String, String, String, int, boolean)>
	//    9   19:invokevirtual   #41  <Method zzayf$zza zzayf$zza.zzb(zzaxp)>
	//   10   22:invokevirtual   #47  <Method zzbbo zzbbo$zza.zzadi()>
	//   11   25:checkcast       #49  <Class zzbbo>
	//   12   28:checkcast       #13  <Class zzayf>
	//   13   31:putstatic       #51  <Field zzayf zzdht>
		zzdhu = (zzayf)(zzbbo)((zzbbo.zza) (((zzayf.zza)((zzbbo.zza) (zzayf.zzaam())).zza(((zzbbo) (zzdht)))).zzej("TINK_MAC_1_1_0"))).zzadi();
	//   14   34:invokestatic    #17  <Method zzayf$zza zzayf.zzaam()>
	//   15   37:getstatic       #51  <Field zzayf zzdht>
	//   16   40:invokevirtual   #54  <Method zzbbo$zza zzbbo$zza.zza(zzbbo)>
	//   17   43:checkcast       #21  <Class zzayf$zza>
	//   18   46:ldc1            #56  <String "TINK_MAC_1_1_0">
	//   19   48:invokevirtual   #25  <Method zzayf$zza zzayf$zza.zzej(String)>
	//   20   51:invokevirtual   #47  <Method zzbbo zzbbo$zza.zzadi()>
	//   21   54:checkcast       #49  <Class zzbbo>
	//   22   57:checkcast       #13  <Class zzayf>
	//   23   60:putstatic       #58  <Field zzayf zzdhu>
		try
		{
			zzwk();
	//   24   63:invokestatic    #61  <Method void zzwk()>
	//   25   66:return          
		}
		catch(GeneralSecurityException generalsecurityexception)
	//*  26   67:astore_0        
		{
			throw new ExceptionInInitializerError(((Throwable) (generalsecurityexception)));
	//   27   68:new             #63  <Class ExceptionInInitializerError>
	//   28   71:dup             
	//   29   72:aload_0         
	//   30   73:invokespecial   #67  <Method void ExceptionInInitializerError(Throwable)>
	//   31   76:athrow          
		}
	}
}
