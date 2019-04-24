// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaug, zzbbu, zzaxz, zzazq, 
//			zzayb, zzauj, zzaui, zzauy, 
//			zzatz, zzbbo, zzaxi, zzazy, 
//			zzbah, zzbcu

final class zzauz
	implements zzaug
{

	zzauz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private final zzatz zzd(zzbah zzbah)
		throws GeneralSecurityException
	{
		try
		{
			zzbah = ((zzbah) (zzaxz.zzal(zzbah)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #24  <Method zzaxz zzaxz.zzal(zzbah)>
	//    2    4:astore_1        
			if(!(zzbah instanceof zzaxz))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #20  <Class zzaxz>
	//*   5    9:ifne            22
				throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
	//    6   12:new             #16  <Class GeneralSecurityException>
	//    7   15:dup             
	//    8   16:ldc1            #26  <String "expected KmsEnvelopeAeadKey proto">
	//    9   18:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//   10   21:athrow          
			zzbah = ((zzbah) ((zzaxz)zzbah));
	//   11   22:aload_1         
	//   12   23:checkcast       #20  <Class zzaxz>
	//   13   26:astore_1        
			zzazq.zzj(((zzaxz) (zzbah)).getVersion(), 0);
	//   14   27:aload_1         
	//   15   28:invokevirtual   #33  <Method int zzaxz.getVersion()>
	//   16   31:iconst_0        
	//   17   32:invokestatic    #39  <Method void zzazq.zzj(int, int)>
			Object obj = ((Object) (((zzaxz) (zzbah)).zzaae().zzaah()));
	//   18   35:aload_1         
	//   19   36:invokevirtual   #43  <Method zzayb zzaxz.zzaae()>
	//   20   39:invokevirtual   #49  <Method String zzayb.zzaah()>
	//   21   42:astore_2        
			obj = ((Object) (zzauj.zzdx(((String) (obj))).zzdw(((String) (obj)))));
	//   22   43:aload_2         
	//   23   44:invokestatic    #55  <Method zzaui zzauj.zzdx(String)>
	//   24   47:aload_2         
	//   25   48:invokeinterface #61  <Method zzatz zzaui.zzdw(String)>
	//   26   53:astore_2        
			zzbah = ((zzbah) ((zzatz)new zzauy(((zzaxz) (zzbah)).zzaae().zzaai(), ((zzatz) (obj)))));
	//   27   54:new             #63  <Class zzauy>
	//   28   57:dup             
	//   29   58:aload_1         
	//   30   59:invokevirtual   #43  <Method zzayb zzaxz.zzaae()>
	//   31   62:invokevirtual   #67  <Method zzaxn zzayb.zzaai()>
	//   32   65:aload_2         
	//   33   66:invokespecial   #70  <Method void zzauy(zzaxn, zzatz)>
	//   34   69:checkcast       #72  <Class zzatz>
	//   35   72:astore_1        
		}
	//*  36   73:aload_1         
	//*  37   74:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah)
	//*  38   75:astore_1        
		{
			throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", ((Throwable) (zzbah)));
	//   39   76:new             #16  <Class GeneralSecurityException>
	//   40   79:dup             
	//   41   80:ldc1            #74  <String "expected serialized KmSEnvelopeAeadKey proto">
	//   42   82:aload_1         
	//   43   83:invokespecial   #77  <Method void GeneralSecurityException(String, Throwable)>
	//   44   86:athrow          
		}
		return ((zzatz) (zzbah));
	}

	public final int getVersion()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final Object zza(zzbah zzbah)
		throws GeneralSecurityException
	{
		return ((Object) (zzd(zzbah)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method zzatz zzd(zzbah)>
	//    3    5:areturn         
	}

	public final Object zza(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzaxz))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #20  <Class zzaxz>
	//*   2    4:ifne            17
		{
			throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #26  <String "expected KmsEnvelopeAeadKey proto">
	//    6   13:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		} else
		{
			zzbcu = ((zzbcu) ((zzaxz)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #20  <Class zzaxz>
	//   10   21:astore_1        
			zzazq.zzj(((zzaxz) (zzbcu)).getVersion(), 0);
	//   11   22:aload_1         
	//   12   23:invokevirtual   #33  <Method int zzaxz.getVersion()>
	//   13   26:iconst_0        
	//   14   27:invokestatic    #39  <Method void zzazq.zzj(int, int)>
			Object obj = ((Object) (((zzaxz) (zzbcu)).zzaae().zzaah()));
	//   15   30:aload_1         
	//   16   31:invokevirtual   #43  <Method zzayb zzaxz.zzaae()>
	//   17   34:invokevirtual   #49  <Method String zzayb.zzaah()>
	//   18   37:astore_2        
			obj = ((Object) (zzauj.zzdx(((String) (obj))).zzdw(((String) (obj)))));
	//   19   38:aload_2         
	//   20   39:invokestatic    #55  <Method zzaui zzauj.zzdx(String)>
	//   21   42:aload_2         
	//   22   43:invokeinterface #61  <Method zzatz zzaui.zzdw(String)>
	//   23   48:astore_2        
			return ((Object) (new zzauy(((zzaxz) (zzbcu)).zzaae().zzaai(), ((zzatz) (obj)))));
	//   24   49:new             #63  <Class zzauy>
	//   25   52:dup             
	//   26   53:aload_1         
	//   27   54:invokevirtual   #43  <Method zzayb zzaxz.zzaae()>
	//   28   57:invokevirtual   #67  <Method zzaxn zzayb.zzaai()>
	//   29   60:aload_2         
	//   30   61:invokespecial   #70  <Method void zzauy(zzaxn, zzatz)>
	//   31   64:areturn         
		}
	}

	public final zzbcu zzb(zzbah zzbah)
		throws GeneralSecurityException
	{
		try
		{
			zzbah = ((zzbah) (zzb(((zzbcu) (zzayb.zzam(zzbah))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #89  <Method zzayb zzayb.zzam(zzbah)>
	//    3    5:invokevirtual   #92  <Method zzbcu zzb(zzbcu)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", ((Throwable) (zzbah)));
	//    8   12:new             #16  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #94  <String "expected serialized KmsEnvelopeAeadKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #77  <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((zzbcu) (zzbah));
	}

	public final zzbcu zzb(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzayb))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #45  <Class zzayb>
	//*   2    4:ifne            17
		{
			throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #96  <String "expected KmsEnvelopeAeadKeyFormat proto">
	//    6   13:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		} else
		{
			zzbcu = ((zzbcu) ((zzayb)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #45  <Class zzayb>
	//   10   21:astore_1        
			return ((zzbcu) ((zzbbo)((zzbbo.zza) (zzaxz.zzaaf().zzb(((zzayb) (zzbcu))).zzbf(0))).zzadi()));
	//   11   22:invokestatic    #100 <Method zzaxz$zza zzaxz.zzaaf()>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #105 <Method zzaxz$zza zzaxz$zza.zzb(zzayb)>
	//   14   29:iconst_0        
	//   15   30:invokevirtual   #109 <Method zzaxz$zza zzaxz$zza.zzbf(int)>
	//   16   33:invokevirtual   #115 <Method zzbbo zzbbo$zza.zzadi()>
	//   17   36:checkcast       #117 <Class zzbbo>
	//   18   39:areturn         
		}
	}

	public final zzaxi zzc(zzbah zzbah)
		throws GeneralSecurityException
	{
		zzbah = ((zzbah) ((zzaxz)zzb(zzbah)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #121 <Method zzbcu zzb(zzbah)>
	//    3    5:checkcast       #20  <Class zzaxz>
	//    4    8:astore_1        
		return (zzaxi)(zzbbo)((zzbbo.zza) (zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").zzai(((zzazy) (zzbah)).zzaav()).zzb(zzaxi.zzb.zzdla))).zzadi();
	//    5    9:invokestatic    #127 <Method zzaxi$zza zzaxi.zzyz()>
	//    6   12:ldc1            #129 <String "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey">
	//    7   14:invokevirtual   #135 <Method zzaxi$zza zzaxi$zza.zzeb(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #141 <Method zzbah zzazy.zzaav()>
	//   10   21:invokevirtual   #145 <Method zzaxi$zza zzaxi$zza.zzai(zzbah)>
	//   11   24:getstatic       #151 <Field zzaxi$zzb zzaxi$zzb.zzdla>
	//   12   27:invokevirtual   #154 <Method zzaxi$zza zzaxi$zza.zzb(zzaxi$zzb)>
	//   13   30:invokevirtual   #115 <Method zzbbo zzbbo$zza.zzadi()>
	//   14   33:checkcast       #117 <Class zzbbo>
	//   15   36:checkcast       #123 <Class zzaxi>
	//   16   39:areturn         
	}
}
