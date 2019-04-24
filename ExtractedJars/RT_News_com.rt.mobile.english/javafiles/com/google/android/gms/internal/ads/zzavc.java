// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzayf, zzaur, zzaub, zzbbo, 
//			zzave, zzauo, zzavd

public final class zzavc
{

	public static final zzayf zzdht;
	private static final zzayf zzdhu;

	static 
	{
		zzdht = (zzayf)(zzbbo)((zzbbo.zza) (((zzayf.zza)((zzbbo.zza) (zzayf.zzaam())).zza(((zzbbo) (zzaur.zzdht)))).zzb(zzaub.zza("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).zzb(zzaub.zza("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).zzej("TINK_HYBRID_1_0_0"))).zzadi();
	//    0    0:invokestatic    #17  <Method zzayf$zza zzayf.zzaam()>
	//    1    3:getstatic       #21  <Field zzayf zzaur.zzdht>
	//    2    6:invokevirtual   #27  <Method zzbbo$zza zzbbo$zza.zza(zzbbo)>
	//    3    9:checkcast       #29  <Class zzayf$zza>
	//    4   12:ldc1            #31  <String "TinkHybridDecrypt">
	//    5   14:ldc1            #33  <String "HybridDecrypt">
	//    6   16:ldc1            #35  <String "EciesAeadHkdfPrivateKey">
	//    7   18:iconst_0        
	//    8   19:iconst_1        
	//    9   20:invokestatic    #40  <Method zzaxp zzaub.zza(String, String, String, int, boolean)>
	//   10   23:invokevirtual   #44  <Method zzayf$zza zzayf$zza.zzb(zzaxp)>
	//   11   26:ldc1            #46  <String "TinkHybridEncrypt">
	//   12   28:ldc1            #48  <String "HybridEncrypt">
	//   13   30:ldc1            #50  <String "EciesAeadHkdfPublicKey">
	//   14   32:iconst_0        
	//   15   33:iconst_1        
	//   16   34:invokestatic    #40  <Method zzaxp zzaub.zza(String, String, String, int, boolean)>
	//   17   37:invokevirtual   #44  <Method zzayf$zza zzayf$zza.zzb(zzaxp)>
	//   18   40:ldc1            #52  <String "TINK_HYBRID_1_0_0">
	//   19   42:invokevirtual   #56  <Method zzayf$zza zzayf$zza.zzej(String)>
	//   20   45:invokevirtual   #60  <Method zzbbo zzbbo$zza.zzadi()>
	//   21   48:checkcast       #62  <Class zzbbo>
	//   22   51:checkcast       #13  <Class zzayf>
	//   23   54:putstatic       #63  <Field zzayf zzdht>
		zzdhu = (zzayf)(zzbbo)((zzbbo.zza) (((zzayf.zza)((zzbbo.zza) (zzayf.zzaam())).zza(((zzbbo) (zzdht)))).zzej("TINK_HYBRID_1_1_0"))).zzadi();
	//   24   57:invokestatic    #17  <Method zzayf$zza zzayf.zzaam()>
	//   25   60:getstatic       #63  <Field zzayf zzdht>
	//   26   63:invokevirtual   #27  <Method zzbbo$zza zzbbo$zza.zza(zzbbo)>
	//   27   66:checkcast       #29  <Class zzayf$zza>
	//   28   69:ldc1            #65  <String "TINK_HYBRID_1_1_0">
	//   29   71:invokevirtual   #56  <Method zzayf$zza zzayf$zza.zzej(String)>
	//   30   74:invokevirtual   #60  <Method zzbbo zzbbo$zza.zzadi()>
	//   31   77:checkcast       #62  <Class zzbbo>
	//   32   80:checkcast       #13  <Class zzayf>
	//   33   83:putstatic       #67  <Field zzayf zzdhu>
		try
		{
			zzauo.zza("TinkHybridEncrypt", ((zzaua) (new zzave())));
	//   34   86:ldc1            #46  <String "TinkHybridEncrypt">
	//   35   88:new             #69  <Class zzave>
	//   36   91:dup             
	//   37   92:invokespecial   #72  <Method void zzave()>
	//   38   95:invokestatic    #77  <Method void zzauo.zza(String, zzaua)>
			zzauo.zza("TinkHybridDecrypt", ((zzaua) (new zzavd())));
	//   39   98:ldc1            #31  <String "TinkHybridDecrypt">
	//   40  100:new             #79  <Class zzavd>
	//   41  103:dup             
	//   42  104:invokespecial   #80  <Method void zzavd()>
	//   43  107:invokestatic    #77  <Method void zzauo.zza(String, zzaua)>
			zzaur.zzwk();
	//   44  110:invokestatic    #83  <Method void zzaur.zzwk()>
	//   45  113:return          
		}
		catch(GeneralSecurityException generalsecurityexception)
	//*  46  114:astore_0        
		{
			throw new ExceptionInInitializerError(((Throwable) (generalsecurityexception)));
	//   47  115:new             #85  <Class ExceptionInInitializerError>
	//   48  118:dup             
	//   49  119:aload_0         
	//   50  120:invokespecial   #88  <Method void ExceptionInInitializerError(Throwable)>
	//   51  123:athrow          
		}
	}
}
