// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzayf, zzavn, zzaub, zzbbo, 
//			zzauq, zzauo

public final class zzaur
{

	public static void zzwk()
		throws GeneralSecurityException
	{
		zzauo.zza("TinkAead", ((zzaua) (new zzauq())));
	//    0    0:ldc1            #31  <String "TinkAead">
	//    1    2:new             #83  <Class zzauq>
	//    2    5:dup             
	//    3    6:invokespecial   #85  <Method void zzauq()>
	//    4    9:invokestatic    #90  <Method void zzauo.zza(String, zzaua)>
		zzavn.zzwk();
	//    5   12:invokestatic    #91  <Method void zzavn.zzwk()>
	//    6   15:return          
	}

	public static final zzayf zzdht;
	private static final zzayf zzdhu;

	static 
	{
		zzdht = (zzayf)(zzbbo)((zzbbo.zza) (((zzayf.zza)((zzbbo.zza) (zzayf.zzaam())).zza(((zzbbo) (zzavn.zzdht)))).zzb(zzaub.zza("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).zzb(zzaub.zza("TinkAead", "Aead", "AesEaxKey", 0, true)).zzb(zzaub.zza("TinkAead", "Aead", "AesGcmKey", 0, true)).zzb(zzaub.zza("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).zzb(zzaub.zza("TinkAead", "Aead", "KmsAeadKey", 0, true)).zzb(zzaub.zza("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).zzej("TINK_AEAD_1_0_0"))).zzadi();
	//    0    0:invokestatic    #17  <Method zzayf$zza zzayf.zzaam()>
	//    1    3:getstatic       #21  <Field zzayf zzavn.zzdht>
	//    2    6:invokevirtual   #27  <Method zzbbo$zza zzbbo$zza.zza(zzbbo)>
	//    3    9:checkcast       #29  <Class zzayf$zza>
	//    4   12:ldc1            #31  <String "TinkAead">
	//    5   14:ldc1            #33  <String "Aead">
	//    6   16:ldc1            #35  <String "AesCtrHmacAeadKey">
	//    7   18:iconst_0        
	//    8   19:iconst_1        
	//    9   20:invokestatic    #40  <Method zzaxp zzaub.zza(String, String, String, int, boolean)>
	//   10   23:invokevirtual   #44  <Method zzayf$zza zzayf$zza.zzb(zzaxp)>
	//   11   26:ldc1            #31  <String "TinkAead">
	//   12   28:ldc1            #33  <String "Aead">
	//   13   30:ldc1            #46  <String "AesEaxKey">
	//   14   32:iconst_0        
	//   15   33:iconst_1        
	//   16   34:invokestatic    #40  <Method zzaxp zzaub.zza(String, String, String, int, boolean)>
	//   17   37:invokevirtual   #44  <Method zzayf$zza zzayf$zza.zzb(zzaxp)>
	//   18   40:ldc1            #31  <String "TinkAead">
	//   19   42:ldc1            #33  <String "Aead">
	//   20   44:ldc1            #48  <String "AesGcmKey">
	//   21   46:iconst_0        
	//   22   47:iconst_1        
	//   23   48:invokestatic    #40  <Method zzaxp zzaub.zza(String, String, String, int, boolean)>
	//   24   51:invokevirtual   #44  <Method zzayf$zza zzayf$zza.zzb(zzaxp)>
	//   25   54:ldc1            #31  <String "TinkAead">
	//   26   56:ldc1            #33  <String "Aead">
	//   27   58:ldc1            #50  <String "ChaCha20Poly1305Key">
	//   28   60:iconst_0        
	//   29   61:iconst_1        
	//   30   62:invokestatic    #40  <Method zzaxp zzaub.zza(String, String, String, int, boolean)>
	//   31   65:invokevirtual   #44  <Method zzayf$zza zzayf$zza.zzb(zzaxp)>
	//   32   68:ldc1            #31  <String "TinkAead">
	//   33   70:ldc1            #33  <String "Aead">
	//   34   72:ldc1            #52  <String "KmsAeadKey">
	//   35   74:iconst_0        
	//   36   75:iconst_1        
	//   37   76:invokestatic    #40  <Method zzaxp zzaub.zza(String, String, String, int, boolean)>
	//   38   79:invokevirtual   #44  <Method zzayf$zza zzayf$zza.zzb(zzaxp)>
	//   39   82:ldc1            #31  <String "TinkAead">
	//   40   84:ldc1            #33  <String "Aead">
	//   41   86:ldc1            #54  <String "KmsEnvelopeAeadKey">
	//   42   88:iconst_0        
	//   43   89:iconst_1        
	//   44   90:invokestatic    #40  <Method zzaxp zzaub.zza(String, String, String, int, boolean)>
	//   45   93:invokevirtual   #44  <Method zzayf$zza zzayf$zza.zzb(zzaxp)>
	//   46   96:ldc1            #56  <String "TINK_AEAD_1_0_0">
	//   47   98:invokevirtual   #60  <Method zzayf$zza zzayf$zza.zzej(String)>
	//   48  101:invokevirtual   #64  <Method zzbbo zzbbo$zza.zzadi()>
	//   49  104:checkcast       #66  <Class zzbbo>
	//   50  107:checkcast       #13  <Class zzayf>
	//   51  110:putstatic       #67  <Field zzayf zzdht>
		zzdhu = (zzayf)(zzbbo)((zzbbo.zza) (((zzayf.zza)((zzbbo.zza) (zzayf.zzaam())).zza(((zzbbo) (zzdht)))).zzej("TINK_AEAD_1_1_0"))).zzadi();
	//   52  113:invokestatic    #17  <Method zzayf$zza zzayf.zzaam()>
	//   53  116:getstatic       #67  <Field zzayf zzdht>
	//   54  119:invokevirtual   #27  <Method zzbbo$zza zzbbo$zza.zza(zzbbo)>
	//   55  122:checkcast       #29  <Class zzayf$zza>
	//   56  125:ldc1            #69  <String "TINK_AEAD_1_1_0">
	//   57  127:invokevirtual   #60  <Method zzayf$zza zzayf$zza.zzej(String)>
	//   58  130:invokevirtual   #64  <Method zzbbo zzbbo$zza.zzadi()>
	//   59  133:checkcast       #66  <Class zzbbo>
	//   60  136:checkcast       #13  <Class zzayf>
	//   61  139:putstatic       #71  <Field zzayf zzdhu>
		try
		{
			zzwk();
	//   62  142:invokestatic    #74  <Method void zzwk()>
	//   63  145:return          
		}
		catch(GeneralSecurityException generalsecurityexception)
	//*  64  146:astore_0        
		{
			throw new ExceptionInInitializerError(((Throwable) (generalsecurityexception)));
	//   65  147:new             #76  <Class ExceptionInInitializerError>
	//   66  150:dup             
	//   67  151:aload_0         
	//   68  152:invokespecial   #80  <Method void ExceptionInInitializerError(Throwable)>
	//   69  155:athrow          
		}
	}
}
