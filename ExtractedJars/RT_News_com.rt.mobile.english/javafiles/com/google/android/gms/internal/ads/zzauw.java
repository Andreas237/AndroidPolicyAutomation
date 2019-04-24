// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaug, zzbbu, zzawi, zzazq, 
//			zzbah, zzaym, zzatz, zzazl, 
//			zzbbo, zzaxi, zzazy, zzbcu

final class zzauw
	implements zzaug
{

	zzauw()
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
			zzbah1 = ((zzbah) (zzawi.zzu(zzbah1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #24  <Method zzawi zzawi.zzu(zzbah)>
	//    2    4:astore_1        
			if(!(zzbah1 instanceof zzawi))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #20  <Class zzawi>
	//*   5    9:ifne            22
				throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
	//    6   12:new             #16  <Class GeneralSecurityException>
	//    7   15:dup             
	//    8   16:ldc1            #26  <String "expected ChaCha20Poly1305Key proto">
	//    9   18:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//   10   21:athrow          
			zzbah1 = ((zzbah) ((zzawi)zzbah1));
	//   11   22:aload_1         
	//   12   23:checkcast       #20  <Class zzawi>
	//   13   26:astore_1        
			zzazq.zzj(((zzawi) (zzbah1)).getVersion(), 0);
	//   14   27:aload_1         
	//   15   28:invokevirtual   #33  <Method int zzawi.getVersion()>
	//   16   31:iconst_0        
	//   17   32:invokestatic    #39  <Method void zzazq.zzj(int, int)>
			if(((zzawi) (zzbah1)).zzwv().size() != 32)
	//*  18   35:aload_1         
	//*  19   36:invokevirtual   #43  <Method zzbah zzawi.zzwv()>
	//*  20   39:invokevirtual   #48  <Method int zzbah.size()>
	//*  21   42:bipush          32
	//*  22   44:icmpeq          57
				throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
	//   23   47:new             #16  <Class GeneralSecurityException>
	//   24   50:dup             
	//   25   51:ldc1            #50  <String "invalid ChaCha20Poly1305Key: incorrect key length">
	//   26   53:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//   27   56:athrow          
			zzbah1 = ((zzbah) ((zzatz)new zzaym(((zzawi) (zzbah1)).zzwv().toByteArray())));
	//   28   57:new             #52  <Class zzaym>
	//   29   60:dup             
	//   30   61:aload_1         
	//   31   62:invokevirtual   #43  <Method zzbah zzawi.zzwv()>
	//   32   65:invokevirtual   #56  <Method byte[] zzbah.toByteArray()>
	//   33   68:invokespecial   #59  <Method void zzaym(byte[])>
	//   34   71:checkcast       #61  <Class zzatz>
	//   35   74:astore_1        
		}
	//*  36   75:aload_1         
	//*  37   76:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah1)
	//*  38   77:astore_1        
		{
			throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", ((Throwable) (zzbah1)));
	//   39   78:new             #16  <Class GeneralSecurityException>
	//   40   81:dup             
	//   41   82:ldc1            #63  <String "invalid ChaCha20Poly1305 key">
	//   42   84:aload_1         
	//   43   85:invokespecial   #66  <Method void GeneralSecurityException(String, Throwable)>
	//   44   88:athrow          
		}
		return ((zzatz) (zzbah1));
	}

	private static zzawi zzwl()
		throws GeneralSecurityException
	{
		return (zzawi)(zzbbo)((zzbbo.zza) (zzawi.zzxn().zzap(0).zzv(zzbah.zzo(zzazl.zzbh(32))))).zzadi();
	//    0    0:invokestatic    #73  <Method zzawi$zza zzawi.zzxn()>
	//    1    3:iconst_0        
	//    2    4:invokevirtual   #79  <Method zzawi$zza zzawi$zza.zzap(int)>
	//    3    7:bipush          32
	//    4    9:invokestatic    #85  <Method byte[] zzazl.zzbh(int)>
	//    5   12:invokestatic    #89  <Method zzbah zzbah.zzo(byte[])>
	//    6   15:invokevirtual   #93  <Method zzawi$zza zzawi$zza.zzv(zzbah)>
	//    7   18:invokevirtual   #99  <Method zzbbo zzbbo$zza.zzadi()>
	//    8   21:checkcast       #101 <Class zzbbo>
	//    9   24:checkcast       #20  <Class zzawi>
	//   10   27:areturn         
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
	//    2    2:invokespecial   #105 <Method zzatz zzd(zzbah)>
	//    3    5:areturn         
	}

	public final Object zza(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzawi))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #20  <Class zzawi>
	//*   2    4:ifne            17
			throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #26  <String "expected ChaCha20Poly1305Key proto">
	//    6   13:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		zzbcu = ((zzbcu) ((zzawi)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #20  <Class zzawi>
	//   10   21:astore_1        
		zzazq.zzj(((zzawi) (zzbcu)).getVersion(), 0);
	//   11   22:aload_1         
	//   12   23:invokevirtual   #33  <Method int zzawi.getVersion()>
	//   13   26:iconst_0        
	//   14   27:invokestatic    #39  <Method void zzazq.zzj(int, int)>
		if(((zzawi) (zzbcu)).zzwv().size() != 32)
	//*  15   30:aload_1         
	//*  16   31:invokevirtual   #43  <Method zzbah zzawi.zzwv()>
	//*  17   34:invokevirtual   #48  <Method int zzbah.size()>
	//*  18   37:bipush          32
	//*  19   39:icmpeq          52
			throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
	//   20   42:new             #16  <Class GeneralSecurityException>
	//   21   45:dup             
	//   22   46:ldc1            #50  <String "invalid ChaCha20Poly1305Key: incorrect key length">
	//   23   48:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//   24   51:athrow          
		else
			return ((Object) (new zzaym(((zzawi) (zzbcu)).zzwv().toByteArray())));
	//   25   52:new             #52  <Class zzaym>
	//   26   55:dup             
	//   27   56:aload_1         
	//   28   57:invokevirtual   #43  <Method zzbah zzawi.zzwv()>
	//   29   60:invokevirtual   #56  <Method byte[] zzbah.toByteArray()>
	//   30   63:invokespecial   #59  <Method void zzaym(byte[])>
	//   31   66:areturn         
	}

	public final zzbcu zzb(zzbah zzbah1)
		throws GeneralSecurityException
	{
		return ((zzbcu) (zzwl()));
	//    0    0:invokestatic    #110 <Method zzawi zzwl()>
	//    1    3:areturn         
	}

	public final zzbcu zzb(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		return ((zzbcu) (zzwl()));
	//    0    0:invokestatic    #110 <Method zzawi zzwl()>
	//    1    3:areturn         
	}

	public final zzaxi zzc(zzbah zzbah1)
		throws GeneralSecurityException
	{
		zzbah1 = ((zzbah) (zzwl()));
	//    0    0:invokestatic    #110 <Method zzawi zzwl()>
	//    1    3:astore_1        
		return (zzaxi)(zzbbo)((zzbbo.zza) (zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zzai(((zzazy) (zzbah1)).zzaav()).zzb(zzaxi.zzb.zzdkx))).zzadi();
	//    2    4:invokestatic    #119 <Method zzaxi$zza zzaxi.zzyz()>
	//    3    7:ldc1            #121 <String "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key">
	//    4    9:invokevirtual   #127 <Method zzaxi$zza zzaxi$zza.zzeb(String)>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #132 <Method zzbah zzazy.zzaav()>
	//    7   16:invokevirtual   #136 <Method zzaxi$zza zzaxi$zza.zzai(zzbah)>
	//    8   19:getstatic       #142 <Field zzaxi$zzb zzaxi$zzb.zzdkx>
	//    9   22:invokevirtual   #145 <Method zzaxi$zza zzaxi$zza.zzb(zzaxi$zzb)>
	//   10   25:invokevirtual   #99  <Method zzbbo zzbbo$zza.zzadi()>
	//   11   28:checkcast       #101 <Class zzbbo>
	//   12   31:checkcast       #115 <Class zzaxi>
	//   13   34:areturn         
	}
}
