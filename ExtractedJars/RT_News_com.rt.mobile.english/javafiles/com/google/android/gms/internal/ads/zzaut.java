// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaug, zzavw, zzbbu, zzavs, 
//			zzazq, zzbah, zzayh, zzavu, 
//			zzazl, zzbbo, zzaxi, zzazy, 
//			zzbcu

final class zzaut
	implements zzaug
{

	zzaut()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static void zza(zzavw zzavw1)
		throws GeneralSecurityException
	{
		if(zzavw1.zzxb() >= 12 && zzavw1.zzxb() <= 16)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #22  <Method int zzavw.zzxb()>
	//*   2    4:bipush          12
	//*   3    6:icmplt          22
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #22  <Method int zzavw.zzxb()>
	//*   6   13:bipush          16
	//*   7   15:icmple          21
	//*   8   18:goto            22
			return;
	//    9   21:return          
		else
			throw new GeneralSecurityException("invalid IV size");
	//   10   22:new             #16  <Class GeneralSecurityException>
	//   11   25:dup             
	//   12   26:ldc1            #24  <String "invalid IV size">
	//   13   28:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//   14   31:athrow          
	}

	private final zzayh zze(zzbah zzbah1)
		throws GeneralSecurityException
	{
		try
		{
			zzbah1 = ((zzbah) (zzavs.zzl(zzbah1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #38  <Method zzavs zzavs.zzl(zzbah)>
	//    2    4:astore_1        
			if(!(zzbah1 instanceof zzavs))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #34  <Class zzavs>
	//*   5    9:ifne            22
				throw new GeneralSecurityException("expected AesCtrKey proto");
	//    6   12:new             #16  <Class GeneralSecurityException>
	//    7   15:dup             
	//    8   16:ldc1            #40  <String "expected AesCtrKey proto">
	//    9   18:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//   10   21:athrow          
			zzbah1 = ((zzbah) ((zzavs)zzbah1));
	//   11   22:aload_1         
	//   12   23:checkcast       #34  <Class zzavs>
	//   13   26:astore_1        
			zzazq.zzj(((zzavs) (zzbah1)).getVersion(), 0);
	//   14   27:aload_1         
	//   15   28:invokevirtual   #43  <Method int zzavs.getVersion()>
	//   16   31:iconst_0        
	//   17   32:invokestatic    #49  <Method void zzazq.zzj(int, int)>
			zzazq.zzbi(((zzavs) (zzbah1)).zzwv().size());
	//   18   35:aload_1         
	//   19   36:invokevirtual   #53  <Method zzbah zzavs.zzwv()>
	//   20   39:invokevirtual   #58  <Method int zzbah.size()>
	//   21   42:invokestatic    #62  <Method void zzazq.zzbi(int)>
			zza(((zzavs) (zzbah1)).zzwu());
	//   22   45:aload_1         
	//   23   46:invokevirtual   #66  <Method zzavw zzavs.zzwu()>
	//   24   49:invokestatic    #68  <Method void zza(zzavw)>
			zzbah1 = ((zzbah) ((zzayh)new zzayh(((zzavs) (zzbah1)).zzwv().toByteArray(), ((zzavs) (zzbah1)).zzwu().zzxb())));
	//   25   52:new             #70  <Class zzayh>
	//   26   55:dup             
	//   27   56:aload_1         
	//   28   57:invokevirtual   #53  <Method zzbah zzavs.zzwv()>
	//   29   60:invokevirtual   #74  <Method byte[] zzbah.toByteArray()>
	//   30   63:aload_1         
	//   31   64:invokevirtual   #66  <Method zzavw zzavs.zzwu()>
	//   32   67:invokevirtual   #22  <Method int zzavw.zzxb()>
	//   33   70:invokespecial   #77  <Method void zzayh(byte[], int)>
	//   34   73:checkcast       #70  <Class zzayh>
	//   35   76:astore_1        
		}
	//*  36   77:aload_1         
	//*  37   78:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah1)
	//*  38   79:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesCtrKey proto", ((Throwable) (zzbah1)));
	//   39   80:new             #16  <Class GeneralSecurityException>
	//   40   83:dup             
	//   41   84:ldc1            #79  <String "expected serialized AesCtrKey proto">
	//   42   86:aload_1         
	//   43   87:invokespecial   #82  <Method void GeneralSecurityException(String, Throwable)>
	//   44   90:athrow          
		}
		return ((zzayh) (zzbah1));
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
		return ((Object) (zze(zzbah1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method zzayh zze(zzbah)>
	//    3    5:areturn         
	}

	public final Object zza(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzavs))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #34  <Class zzavs>
	//*   2    4:ifne            17
		{
			throw new GeneralSecurityException("expected AesCtrKey proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #40  <String "expected AesCtrKey proto">
	//    6   13:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		} else
		{
			zzbcu = ((zzbcu) ((zzavs)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #34  <Class zzavs>
	//   10   21:astore_1        
			zzazq.zzj(((zzavs) (zzbcu)).getVersion(), 0);
	//   11   22:aload_1         
	//   12   23:invokevirtual   #43  <Method int zzavs.getVersion()>
	//   13   26:iconst_0        
	//   14   27:invokestatic    #49  <Method void zzazq.zzj(int, int)>
			zzazq.zzbi(((zzavs) (zzbcu)).zzwv().size());
	//   15   30:aload_1         
	//   16   31:invokevirtual   #53  <Method zzbah zzavs.zzwv()>
	//   17   34:invokevirtual   #58  <Method int zzbah.size()>
	//   18   37:invokestatic    #62  <Method void zzazq.zzbi(int)>
			zza(((zzavs) (zzbcu)).zzwu());
	//   19   40:aload_1         
	//   20   41:invokevirtual   #66  <Method zzavw zzavs.zzwu()>
	//   21   44:invokestatic    #68  <Method void zza(zzavw)>
			return ((Object) (new zzayh(((zzavs) (zzbcu)).zzwv().toByteArray(), ((zzavs) (zzbcu)).zzwu().zzxb())));
	//   22   47:new             #70  <Class zzayh>
	//   23   50:dup             
	//   24   51:aload_1         
	//   25   52:invokevirtual   #53  <Method zzbah zzavs.zzwv()>
	//   26   55:invokevirtual   #74  <Method byte[] zzbah.toByteArray()>
	//   27   58:aload_1         
	//   28   59:invokevirtual   #66  <Method zzavw zzavs.zzwu()>
	//   29   62:invokevirtual   #22  <Method int zzavw.zzxb()>
	//   30   65:invokespecial   #77  <Method void zzayh(byte[], int)>
	//   31   68:areturn         
		}
	}

	public final zzbcu zzb(zzbah zzbah1)
		throws GeneralSecurityException
	{
		try
		{
			zzbah1 = ((zzbah) (zzb(((zzbcu) (zzavu.zzn(zzbah1))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #94  <Method zzavu zzavu.zzn(zzbah)>
	//    3    5:invokevirtual   #97  <Method zzbcu zzb(zzbcu)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah1)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", ((Throwable) (zzbah1)));
	//    8   12:new             #16  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #99  <String "expected serialized AesCtrKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #82  <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((zzbcu) (zzbah1));
	}

	public final zzbcu zzb(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzavu))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #90  <Class zzavu>
	//*   2    4:ifne            17
		{
			throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #101 <String "expected AesCtrKeyFormat proto">
	//    6   13:invokespecial   #27  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		} else
		{
			zzbcu = ((zzbcu) ((zzavu)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #90  <Class zzavu>
	//   10   21:astore_1        
			zzazq.zzbi(((zzavu) (zzbcu)).getKeySize());
	//   11   22:aload_1         
	//   12   23:invokevirtual   #104 <Method int zzavu.getKeySize()>
	//   13   26:invokestatic    #62  <Method void zzazq.zzbi(int)>
			zza(((zzavu) (zzbcu)).zzwu());
	//   14   29:aload_1         
	//   15   30:invokevirtual   #105 <Method zzavw zzavu.zzwu()>
	//   16   33:invokestatic    #68  <Method void zza(zzavw)>
			return ((zzbcu) ((zzbbo)((zzbbo.zza) (zzavs.zzww().zzc(((zzavu) (zzbcu)).zzwu()).zzm(zzbah.zzo(zzazl.zzbh(((zzavu) (zzbcu)).getKeySize()))).zzam(0))).zzadi()));
	//   17   36:invokestatic    #109 <Method zzavs$zza zzavs.zzww()>
	//   18   39:aload_1         
	//   19   40:invokevirtual   #105 <Method zzavw zzavu.zzwu()>
	//   20   43:invokevirtual   #115 <Method zzavs$zza zzavs$zza.zzc(zzavw)>
	//   21   46:aload_1         
	//   22   47:invokevirtual   #104 <Method int zzavu.getKeySize()>
	//   23   50:invokestatic    #121 <Method byte[] zzazl.zzbh(int)>
	//   24   53:invokestatic    #125 <Method zzbah zzbah.zzo(byte[])>
	//   25   56:invokevirtual   #129 <Method zzavs$zza zzavs$zza.zzm(zzbah)>
	//   26   59:iconst_0        
	//   27   60:invokevirtual   #133 <Method zzavs$zza zzavs$zza.zzam(int)>
	//   28   63:invokevirtual   #139 <Method zzbbo zzbbo$zza.zzadi()>
	//   29   66:checkcast       #141 <Class zzbbo>
	//   30   69:areturn         
		}
	}

	public final zzaxi zzc(zzbah zzbah1)
		throws GeneralSecurityException
	{
		zzbah1 = ((zzbah) ((zzavs)zzb(zzbah1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #144 <Method zzbcu zzb(zzbah)>
	//    3    5:checkcast       #34  <Class zzavs>
	//    4    8:astore_1        
		return (zzaxi)(zzbbo)((zzbbo.zza) (zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.AesCtrKey").zzai(((zzazy) (zzbah1)).zzaav()).zzb(zzaxi.zzb.zzdkx))).zzadi();
	//    5    9:invokestatic    #150 <Method zzaxi$zza zzaxi.zzyz()>
	//    6   12:ldc1            #152 <String "type.googleapis.com/google.crypto.tink.AesCtrKey">
	//    7   14:invokevirtual   #158 <Method zzaxi$zza zzaxi$zza.zzeb(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #163 <Method zzbah zzazy.zzaav()>
	//   10   21:invokevirtual   #167 <Method zzaxi$zza zzaxi$zza.zzai(zzbah)>
	//   11   24:getstatic       #173 <Field zzaxi$zzb zzaxi$zzb.zzdkx>
	//   12   27:invokevirtual   #176 <Method zzaxi$zza zzaxi$zza.zzb(zzaxi$zzb)>
	//   13   30:invokevirtual   #139 <Method zzbbo zzbbo$zza.zzadi()>
	//   14   33:checkcast       #141 <Class zzbbo>
	//   15   36:checkcast       #146 <Class zzaxi>
	//   16   39:areturn         
	}
}
