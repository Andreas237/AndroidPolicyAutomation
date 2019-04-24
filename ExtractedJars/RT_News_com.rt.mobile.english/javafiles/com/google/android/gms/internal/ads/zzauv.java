// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaug, zzbbu, zzawe, zzazq, 
//			zzbah, zzayj, zzatz, zzawg, 
//			zzazl, zzbbo, zzaxi, zzazy, 
//			zzbcu

final class zzauv
	implements zzaug
{

	zzauv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private final zzatz zzd(zzbah zzbah1)
		throws GeneralSecurityException
	{
		try
		{
			zzbah1 = ((zzbah) (zzawe.zzr(zzbah1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #24  <Method zzawe zzawe.zzr(zzbah)>
	//    2    4:astore_1        
			if(!(zzbah1 instanceof zzawe))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #20  <Class zzawe>
	//*   5    9:ifne            22
				throw new GeneralSecurityException("expected AesGcmKey proto");
	//    6   12:new             #16  <Class GeneralSecurityException>
	//    7   15:dup             
	//    8   16:ldc1            #26  <String "expected AesGcmKey proto">
	//    9   18:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//   10   21:athrow          
			zzbah1 = ((zzbah) ((zzawe)zzbah1));
	//   11   22:aload_1         
	//   12   23:checkcast       #20  <Class zzawe>
	//   13   26:astore_1        
			zzazq.zzj(((zzawe) (zzbah1)).getVersion(), 0);
	//   14   27:aload_1         
	//   15   28:invokevirtual   #33  <Method int zzawe.getVersion()>
	//   16   31:iconst_0        
	//   17   32:invokestatic    #39  <Method void zzazq.zzj(int, int)>
			zzazq.zzbi(((zzawe) (zzbah1)).zzwv().size());
	//   18   35:aload_1         
	//   19   36:invokevirtual   #43  <Method zzbah zzawe.zzwv()>
	//   20   39:invokevirtual   #48  <Method int zzbah.size()>
	//   21   42:invokestatic    #52  <Method void zzazq.zzbi(int)>
			zzbah1 = ((zzbah) ((zzatz)new zzayj(((zzawe) (zzbah1)).zzwv().toByteArray())));
	//   22   45:new             #54  <Class zzayj>
	//   23   48:dup             
	//   24   49:aload_1         
	//   25   50:invokevirtual   #43  <Method zzbah zzawe.zzwv()>
	//   26   53:invokevirtual   #58  <Method byte[] zzbah.toByteArray()>
	//   27   56:invokespecial   #61  <Method void zzayj(byte[])>
	//   28   59:checkcast       #63  <Class zzatz>
	//   29   62:astore_1        
		}
	//*  30   63:aload_1         
	//*  31   64:areturn         
	//*  32   65:new             #16  <Class GeneralSecurityException>
	//*  33   68:dup             
	//*  34   69:ldc1            #26  <String "expected AesGcmKey proto">
	//*  35   71:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//*  36   74:athrow          
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah1)
		{
			throw new GeneralSecurityException("expected AesGcmKey proto");
		}
		return ((zzatz) (zzbah1));
	//*  37   75:astore_1        
	//*  38   76:goto            65
	}

	public final int getVersion()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final Object zza(zzbah zzbah1)
		throws GeneralSecurityException
	{
		return ((Object) (zzd(zzbah1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #68  <Method zzatz zzd(zzbah)>
	//    3    5:areturn         
	}

	public final Object zza(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzawe))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #20  <Class zzawe>
	//*   2    4:ifne            17
		{
			throw new GeneralSecurityException("expected AesGcmKey proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #26  <String "expected AesGcmKey proto">
	//    6   13:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		} else
		{
			zzbcu = ((zzbcu) ((zzawe)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #20  <Class zzawe>
	//   10   21:astore_1        
			zzazq.zzj(((zzawe) (zzbcu)).getVersion(), 0);
	//   11   22:aload_1         
	//   12   23:invokevirtual   #33  <Method int zzawe.getVersion()>
	//   13   26:iconst_0        
	//   14   27:invokestatic    #39  <Method void zzazq.zzj(int, int)>
			zzazq.zzbi(((zzawe) (zzbcu)).zzwv().size());
	//   15   30:aload_1         
	//   16   31:invokevirtual   #43  <Method zzbah zzawe.zzwv()>
	//   17   34:invokevirtual   #48  <Method int zzbah.size()>
	//   18   37:invokestatic    #52  <Method void zzazq.zzbi(int)>
			return ((Object) (new zzayj(((zzawe) (zzbcu)).zzwv().toByteArray())));
	//   19   40:new             #54  <Class zzayj>
	//   20   43:dup             
	//   21   44:aload_1         
	//   22   45:invokevirtual   #43  <Method zzbah zzawe.zzwv()>
	//   23   48:invokevirtual   #58  <Method byte[] zzbah.toByteArray()>
	//   24   51:invokespecial   #61  <Method void zzayj(byte[])>
	//   25   54:areturn         
		}
	}

	public final zzbcu zzb(zzbah zzbah1)
		throws GeneralSecurityException
	{
		try
		{
			zzbah1 = ((zzbah) (zzb(((zzbcu) (zzawg.zzt(zzbah1))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #77  <Method zzawg zzawg.zzt(zzbah)>
	//    3    5:invokevirtual   #80  <Method zzbcu zzb(zzbcu)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah1)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", ((Throwable) (zzbah1)));
	//    8   12:new             #16  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #82  <String "expected serialized AesGcmKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #85  <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((zzbcu) (zzbah1));
	}

	public final zzbcu zzb(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzawg))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #73  <Class zzawg>
	//*   2    4:ifne            17
		{
			throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #87  <String "expected AesGcmKeyFormat proto">
	//    6   13:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		} else
		{
			zzbcu = ((zzbcu) ((zzawg)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #73  <Class zzawg>
	//   10   21:astore_1        
			zzazq.zzbi(((zzawg) (zzbcu)).getKeySize());
	//   11   22:aload_1         
	//   12   23:invokevirtual   #90  <Method int zzawg.getKeySize()>
	//   13   26:invokestatic    #52  <Method void zzazq.zzbi(int)>
			return ((zzbcu) ((zzbbo)((zzbbo.zza) (zzawe.zzxk().zzs(zzbah.zzo(zzazl.zzbh(((zzawg) (zzbcu)).getKeySize()))).zzao(0))).zzadi()));
	//   14   29:invokestatic    #94  <Method zzawe$zza zzawe.zzxk()>
	//   15   32:aload_1         
	//   16   33:invokevirtual   #90  <Method int zzawg.getKeySize()>
	//   17   36:invokestatic    #100 <Method byte[] zzazl.zzbh(int)>
	//   18   39:invokestatic    #104 <Method zzbah zzbah.zzo(byte[])>
	//   19   42:invokevirtual   #110 <Method zzawe$zza zzawe$zza.zzs(zzbah)>
	//   20   45:iconst_0        
	//   21   46:invokevirtual   #114 <Method zzawe$zza zzawe$zza.zzao(int)>
	//   22   49:invokevirtual   #120 <Method zzbbo zzbbo$zza.zzadi()>
	//   23   52:checkcast       #122 <Class zzbbo>
	//   24   55:areturn         
		}
	}

	public final zzaxi zzc(zzbah zzbah1)
		throws GeneralSecurityException
	{
		zzbah1 = ((zzbah) ((zzawe)zzb(zzbah1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #126 <Method zzbcu zzb(zzbah)>
	//    3    5:checkcast       #20  <Class zzawe>
	//    4    8:astore_1        
		return (zzaxi)(zzbbo)((zzbbo.zza) (zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.AesGcmKey").zzai(((zzazy) (zzbah1)).zzaav()).zzb(zzaxi.zzb.zzdkx))).zzadi();
	//    5    9:invokestatic    #132 <Method zzaxi$zza zzaxi.zzyz()>
	//    6   12:ldc1            #134 <String "type.googleapis.com/google.crypto.tink.AesGcmKey">
	//    7   14:invokevirtual   #140 <Method zzaxi$zza zzaxi$zza.zzeb(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #145 <Method zzbah zzazy.zzaav()>
	//   10   21:invokevirtual   #149 <Method zzaxi$zza zzaxi$zza.zzai(zzbah)>
	//   11   24:getstatic       #155 <Field zzaxi$zzb zzaxi$zzb.zzdkx>
	//   12   27:invokevirtual   #158 <Method zzaxi$zza zzaxi$zza.zzb(zzaxi$zzb)>
	//   13   30:invokevirtual   #120 <Method zzbbo zzbbo$zza.zzadi()>
	//   14   33:checkcast       #122 <Class zzbbo>
	//   15   36:checkcast       #128 <Class zzaxi>
	//   16   39:areturn         
	}
}
