// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaug, zzbbu, zzavy, zzazq, 
//			zzbah, zzawc, zzayi, zzatz, 
//			zzawa, zzazl, zzbbo, zzaxi, 
//			zzazy, zzbcu

final class zzauu
	implements zzaug
{

	zzauu()
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
			zzbah1 = ((zzbah) (zzavy.zzo(zzbah1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #24  <Method zzavy zzavy.zzo(zzbah)>
	//    2    4:astore_1        
			if(!(zzbah1 instanceof zzavy))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #20  <Class zzavy>
	//*   5    9:ifne            22
				throw new GeneralSecurityException("expected AesEaxKey proto");
	//    6   12:new             #16  <Class GeneralSecurityException>
	//    7   15:dup             
	//    8   16:ldc1            #26  <String "expected AesEaxKey proto">
	//    9   18:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//   10   21:athrow          
			zzbah1 = ((zzbah) ((zzavy)zzbah1));
	//   11   22:aload_1         
	//   12   23:checkcast       #20  <Class zzavy>
	//   13   26:astore_1        
			zzazq.zzj(((zzavy) (zzbah1)).getVersion(), 0);
	//   14   27:aload_1         
	//   15   28:invokevirtual   #33  <Method int zzavy.getVersion()>
	//   16   31:iconst_0        
	//   17   32:invokestatic    #39  <Method void zzazq.zzj(int, int)>
			zzazq.zzbi(((zzavy) (zzbah1)).zzwv().size());
	//   18   35:aload_1         
	//   19   36:invokevirtual   #43  <Method zzbah zzavy.zzwv()>
	//   20   39:invokevirtual   #48  <Method int zzbah.size()>
	//   21   42:invokestatic    #52  <Method void zzazq.zzbi(int)>
			if(((zzavy) (zzbah1)).zzxe().zzxb() != 12 && ((zzavy) (zzbah1)).zzxe().zzxb() != 16)
	//*  22   45:aload_1         
	//*  23   46:invokevirtual   #56  <Method zzawc zzavy.zzxe()>
	//*  24   49:invokevirtual   #61  <Method int zzawc.zzxb()>
	//*  25   52:bipush          12
	//*  26   54:icmpeq          79
	//*  27   57:aload_1         
	//*  28   58:invokevirtual   #56  <Method zzawc zzavy.zzxe()>
	//*  29   61:invokevirtual   #61  <Method int zzawc.zzxb()>
	//*  30   64:bipush          16
	//*  31   66:icmpeq          79
				throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
	//   32   69:new             #16  <Class GeneralSecurityException>
	//   33   72:dup             
	//   34   73:ldc1            #63  <String "invalid IV size; acceptable values have 12 or 16 bytes">
	//   35   75:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//   36   78:athrow          
			zzbah1 = ((zzbah) ((zzatz)new zzayi(((zzavy) (zzbah1)).zzwv().toByteArray(), ((zzavy) (zzbah1)).zzxe().zzxb())));
	//   37   79:new             #65  <Class zzayi>
	//   38   82:dup             
	//   39   83:aload_1         
	//   40   84:invokevirtual   #43  <Method zzbah zzavy.zzwv()>
	//   41   87:invokevirtual   #69  <Method byte[] zzbah.toByteArray()>
	//   42   90:aload_1         
	//   43   91:invokevirtual   #56  <Method zzawc zzavy.zzxe()>
	//   44   94:invokevirtual   #61  <Method int zzawc.zzxb()>
	//   45   97:invokespecial   #72  <Method void zzayi(byte[], int)>
	//   46  100:checkcast       #74  <Class zzatz>
	//   47  103:astore_1        
		}
	//*  48  104:aload_1         
	//*  49  105:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah1)
	//*  50  106:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesEaxKey proto", ((Throwable) (zzbah1)));
	//   51  107:new             #16  <Class GeneralSecurityException>
	//   52  110:dup             
	//   53  111:ldc1            #76  <String "expected serialized AesEaxKey proto">
	//   54  113:aload_1         
	//   55  114:invokespecial   #79  <Method void GeneralSecurityException(String, Throwable)>
	//   56  117:athrow          
		}
		return ((zzatz) (zzbah1));
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
	//    2    2:invokespecial   #84  <Method zzatz zzd(zzbah)>
	//    3    5:areturn         
	}

	public final Object zza(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzavy))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #20  <Class zzavy>
	//*   2    4:ifne            17
			throw new GeneralSecurityException("expected AesEaxKey proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #26  <String "expected AesEaxKey proto">
	//    6   13:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		zzbcu = ((zzbcu) ((zzavy)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #20  <Class zzavy>
	//   10   21:astore_1        
		zzazq.zzj(((zzavy) (zzbcu)).getVersion(), 0);
	//   11   22:aload_1         
	//   12   23:invokevirtual   #33  <Method int zzavy.getVersion()>
	//   13   26:iconst_0        
	//   14   27:invokestatic    #39  <Method void zzazq.zzj(int, int)>
		zzazq.zzbi(((zzavy) (zzbcu)).zzwv().size());
	//   15   30:aload_1         
	//   16   31:invokevirtual   #43  <Method zzbah zzavy.zzwv()>
	//   17   34:invokevirtual   #48  <Method int zzbah.size()>
	//   18   37:invokestatic    #52  <Method void zzazq.zzbi(int)>
		if(((zzavy) (zzbcu)).zzxe().zzxb() != 12 && ((zzavy) (zzbcu)).zzxe().zzxb() != 16)
	//*  19   40:aload_1         
	//*  20   41:invokevirtual   #56  <Method zzawc zzavy.zzxe()>
	//*  21   44:invokevirtual   #61  <Method int zzawc.zzxb()>
	//*  22   47:bipush          12
	//*  23   49:icmpeq          74
	//*  24   52:aload_1         
	//*  25   53:invokevirtual   #56  <Method zzawc zzavy.zzxe()>
	//*  26   56:invokevirtual   #61  <Method int zzawc.zzxb()>
	//*  27   59:bipush          16
	//*  28   61:icmpeq          74
			throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
	//   29   64:new             #16  <Class GeneralSecurityException>
	//   30   67:dup             
	//   31   68:ldc1            #63  <String "invalid IV size; acceptable values have 12 or 16 bytes">
	//   32   70:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//   33   73:athrow          
		else
			return ((Object) (new zzayi(((zzavy) (zzbcu)).zzwv().toByteArray(), ((zzavy) (zzbcu)).zzxe().zzxb())));
	//   34   74:new             #65  <Class zzayi>
	//   35   77:dup             
	//   36   78:aload_1         
	//   37   79:invokevirtual   #43  <Method zzbah zzavy.zzwv()>
	//   38   82:invokevirtual   #69  <Method byte[] zzbah.toByteArray()>
	//   39   85:aload_1         
	//   40   86:invokevirtual   #56  <Method zzawc zzavy.zzxe()>
	//   41   89:invokevirtual   #61  <Method int zzawc.zzxb()>
	//   42   92:invokespecial   #72  <Method void zzayi(byte[], int)>
	//   43   95:areturn         
	}

	public final zzbcu zzb(zzbah zzbah1)
		throws GeneralSecurityException
	{
		try
		{
			zzbah1 = ((zzbah) (zzb(((zzbcu) (zzawa.zzq(zzbah1))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #93  <Method zzawa zzawa.zzq(zzbah)>
	//    3    5:invokevirtual   #96  <Method zzbcu zzb(zzbcu)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah1)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", ((Throwable) (zzbah1)));
	//    8   12:new             #16  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #98  <String "expected serialized AesEaxKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #79  <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((zzbcu) (zzbah1));
	}

	public final zzbcu zzb(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzawa))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #89  <Class zzawa>
	//*   2    4:ifne            17
			throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #100 <String "expected AesEaxKeyFormat proto">
	//    6   13:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		zzbcu = ((zzbcu) ((zzawa)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #89  <Class zzawa>
	//   10   21:astore_1        
		zzazq.zzbi(((zzawa) (zzbcu)).getKeySize());
	//   11   22:aload_1         
	//   12   23:invokevirtual   #103 <Method int zzawa.getKeySize()>
	//   13   26:invokestatic    #52  <Method void zzazq.zzbi(int)>
		if(((zzawa) (zzbcu)).zzxe().zzxb() != 12 && ((zzawa) (zzbcu)).zzxe().zzxb() != 16)
	//*  14   29:aload_1         
	//*  15   30:invokevirtual   #104 <Method zzawc zzawa.zzxe()>
	//*  16   33:invokevirtual   #61  <Method int zzawc.zzxb()>
	//*  17   36:bipush          12
	//*  18   38:icmpeq          63
	//*  19   41:aload_1         
	//*  20   42:invokevirtual   #104 <Method zzawc zzawa.zzxe()>
	//*  21   45:invokevirtual   #61  <Method int zzawc.zzxb()>
	//*  22   48:bipush          16
	//*  23   50:icmpeq          63
			throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
	//   24   53:new             #16  <Class GeneralSecurityException>
	//   25   56:dup             
	//   26   57:ldc1            #63  <String "invalid IV size; acceptable values have 12 or 16 bytes">
	//   27   59:invokespecial   #29  <Method void GeneralSecurityException(String)>
	//   28   62:athrow          
		else
			return ((zzbcu) ((zzbbo)((zzbbo.zza) (zzavy.zzxf().zzp(zzbah.zzo(zzazl.zzbh(((zzawa) (zzbcu)).getKeySize()))).zzb(((zzawa) (zzbcu)).zzxe()).zzan(0))).zzadi()));
	//   29   63:invokestatic    #108 <Method zzavy$zza zzavy.zzxf()>
	//   30   66:aload_1         
	//   31   67:invokevirtual   #103 <Method int zzawa.getKeySize()>
	//   32   70:invokestatic    #114 <Method byte[] zzazl.zzbh(int)>
	//   33   73:invokestatic    #117 <Method zzbah zzbah.zzo(byte[])>
	//   34   76:invokevirtual   #123 <Method zzavy$zza zzavy$zza.zzp(zzbah)>
	//   35   79:aload_1         
	//   36   80:invokevirtual   #104 <Method zzawc zzawa.zzxe()>
	//   37   83:invokevirtual   #126 <Method zzavy$zza zzavy$zza.zzb(zzawc)>
	//   38   86:iconst_0        
	//   39   87:invokevirtual   #130 <Method zzavy$zza zzavy$zza.zzan(int)>
	//   40   90:invokevirtual   #136 <Method zzbbo zzbbo$zza.zzadi()>
	//   41   93:checkcast       #138 <Class zzbbo>
	//   42   96:areturn         
	}

	public final zzaxi zzc(zzbah zzbah1)
		throws GeneralSecurityException
	{
		zzbah1 = ((zzbah) ((zzavy)zzb(zzbah1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #142 <Method zzbcu zzb(zzbah)>
	//    3    5:checkcast       #20  <Class zzavy>
	//    4    8:astore_1        
		return (zzaxi)(zzbbo)((zzbbo.zza) (zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.AesEaxKey").zzai(((zzazy) (zzbah1)).zzaav()).zzb(zzaxi.zzb.zzdkx))).zzadi();
	//    5    9:invokestatic    #148 <Method zzaxi$zza zzaxi.zzyz()>
	//    6   12:ldc1            #150 <String "type.googleapis.com/google.crypto.tink.AesEaxKey">
	//    7   14:invokevirtual   #156 <Method zzaxi$zza zzaxi$zza.zzeb(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #161 <Method zzbah zzazy.zzaav()>
	//   10   21:invokevirtual   #165 <Method zzaxi$zza zzaxi$zza.zzai(zzbah)>
	//   11   24:getstatic       #171 <Field zzaxi$zzb zzaxi$zzb.zzdkx>
	//   12   27:invokevirtual   #174 <Method zzaxi$zza zzaxi$zza.zzb(zzaxi$zzb)>
	//   13   30:invokevirtual   #136 <Method zzbbo zzbbo$zza.zzadi()>
	//   14   33:checkcast       #138 <Class zzbbo>
	//   15   36:checkcast       #144 <Class zzaxi>
	//   16   39:areturn         
	}
}
