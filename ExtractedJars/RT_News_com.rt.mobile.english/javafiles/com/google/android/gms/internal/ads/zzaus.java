// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaug, zzaut, zzauo, zzbbu, 
//			zzavo, zzazq, zzayx, zzazi, 
//			zzauk, zzaxc, zzaxg, zzatz, 
//			zzavq, zzavs, zzbbo, zzaxi, 
//			zzazy, zzbah, zzbcu

class zzaus
	implements zzaug
{

	zzaus()
		throws GeneralSecurityException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		zzauo.zza("type.googleapis.com/google.crypto.tink.AesCtrKey", ((zzaug) (new zzaut())));
	//    2    4:ldc1            #33  <String "type.googleapis.com/google.crypto.tink.AesCtrKey">
	//    3    6:new             #35  <Class zzaut>
	//    4    9:dup             
	//    5   10:invokespecial   #36  <Method void zzaut()>
	//    6   13:invokestatic    #42  <Method void zzauo.zza(String, zzaug)>
	//    7   16:return          
	}

	private final zzatz zzd(zzbah zzbah)
		throws GeneralSecurityException
	{
		try
		{
			zzbah = ((zzbah) (zzavo.zzi(zzbah)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #53  <Method zzavo zzavo.zzi(zzbah)>
	//    2    4:astore_1        
			if(!(zzbah instanceof zzavo))
	//*   3    5:aload_1         
	//*   4    6:instanceof      #49  <Class zzavo>
	//*   5    9:ifne            22
				throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
	//    6   12:new             #29  <Class GeneralSecurityException>
	//    7   15:dup             
	//    8   16:ldc1            #55  <String "expected AesCtrHmacAeadKey proto">
	//    9   18:invokespecial   #58  <Method void GeneralSecurityException(String)>
	//   10   21:athrow          
			zzbah = ((zzbah) ((zzavo)zzbah));
	//   11   22:aload_1         
	//   12   23:checkcast       #49  <Class zzavo>
	//   13   26:astore_1        
			zzazq.zzj(((zzavo) (zzbah)).getVersion(), 0);
	//   14   27:aload_1         
	//   15   28:invokevirtual   #62  <Method int zzavo.getVersion()>
	//   16   31:iconst_0        
	//   17   32:invokestatic    #68  <Method void zzazq.zzj(int, int)>
			zzbah = ((zzbah) ((zzatz)new zzayx((zzazi)zzauo.zzb("type.googleapis.com/google.crypto.tink.AesCtrKey", ((zzbcu) (((zzavo) (zzbah)).zzwn()))), (zzauk)zzauo.zzb("type.googleapis.com/google.crypto.tink.HmacKey", ((zzbcu) (((zzavo) (zzbah)).zzwo()))), ((zzavo) (zzbah)).zzwo().zzym().zzyt())));
	//   18   35:new             #70  <Class zzayx>
	//   19   38:dup             
	//   20   39:ldc1            #33  <String "type.googleapis.com/google.crypto.tink.AesCtrKey">
	//   21   41:aload_1         
	//   22   42:invokevirtual   #74  <Method zzavs zzavo.zzwn()>
	//   23   45:invokestatic    #78  <Method Object zzauo.zzb(String, zzbcu)>
	//   24   48:checkcast       #80  <Class zzazi>
	//   25   51:ldc1            #82  <String "type.googleapis.com/google.crypto.tink.HmacKey">
	//   26   53:aload_1         
	//   27   54:invokevirtual   #86  <Method zzaxc zzavo.zzwo()>
	//   28   57:invokestatic    #78  <Method Object zzauo.zzb(String, zzbcu)>
	//   29   60:checkcast       #88  <Class zzauk>
	//   30   63:aload_1         
	//   31   64:invokevirtual   #86  <Method zzaxc zzavo.zzwo()>
	//   32   67:invokevirtual   #94  <Method zzaxg zzaxc.zzym()>
	//   33   70:invokevirtual   #99  <Method int zzaxg.zzyt()>
	//   34   73:invokespecial   #102 <Method void zzayx(zzazi, zzauk, int)>
	//   35   76:checkcast       #104 <Class zzatz>
	//   36   79:astore_1        
		}
	//*  37   80:aload_1         
	//*  38   81:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah)
	//*  39   82:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", ((Throwable) (zzbah)));
	//   40   83:new             #29  <Class GeneralSecurityException>
	//   41   86:dup             
	//   42   87:ldc1            #106 <String "expected serialized AesCtrHmacAeadKey proto">
	//   43   89:aload_1         
	//   44   90:invokespecial   #109 <Method void GeneralSecurityException(String, Throwable)>
	//   45   93:athrow          
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
	//    2    2:invokespecial   #112 <Method zzatz zzd(zzbah)>
	//    3    5:areturn         
	}

	public final Object zza(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzavo))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #49  <Class zzavo>
	//*   2    4:ifne            17
		{
			throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
	//    3    7:new             #29  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #55  <String "expected AesCtrHmacAeadKey proto">
	//    6   13:invokespecial   #58  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		} else
		{
			zzbcu = ((zzbcu) ((zzavo)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #49  <Class zzavo>
	//   10   21:astore_1        
			zzazq.zzj(((zzavo) (zzbcu)).getVersion(), 0);
	//   11   22:aload_1         
	//   12   23:invokevirtual   #62  <Method int zzavo.getVersion()>
	//   13   26:iconst_0        
	//   14   27:invokestatic    #68  <Method void zzazq.zzj(int, int)>
			return ((Object) (new zzayx((zzazi)zzauo.zzb("type.googleapis.com/google.crypto.tink.AesCtrKey", ((zzbcu) (((zzavo) (zzbcu)).zzwn()))), (zzauk)zzauo.zzb("type.googleapis.com/google.crypto.tink.HmacKey", ((zzbcu) (((zzavo) (zzbcu)).zzwo()))), ((zzavo) (zzbcu)).zzwo().zzym().zzyt())));
	//   15   30:new             #70  <Class zzayx>
	//   16   33:dup             
	//   17   34:ldc1            #33  <String "type.googleapis.com/google.crypto.tink.AesCtrKey">
	//   18   36:aload_1         
	//   19   37:invokevirtual   #74  <Method zzavs zzavo.zzwn()>
	//   20   40:invokestatic    #78  <Method Object zzauo.zzb(String, zzbcu)>
	//   21   43:checkcast       #80  <Class zzazi>
	//   22   46:ldc1            #82  <String "type.googleapis.com/google.crypto.tink.HmacKey">
	//   23   48:aload_1         
	//   24   49:invokevirtual   #86  <Method zzaxc zzavo.zzwo()>
	//   25   52:invokestatic    #78  <Method Object zzauo.zzb(String, zzbcu)>
	//   26   55:checkcast       #88  <Class zzauk>
	//   27   58:aload_1         
	//   28   59:invokevirtual   #86  <Method zzaxc zzavo.zzwo()>
	//   29   62:invokevirtual   #94  <Method zzaxg zzaxc.zzym()>
	//   30   65:invokevirtual   #99  <Method int zzaxg.zzyt()>
	//   31   68:invokespecial   #102 <Method void zzayx(zzazi, zzauk, int)>
	//   32   71:areturn         
		}
	}

	public final zzbcu zzb(zzbah zzbah)
		throws GeneralSecurityException
	{
		try
		{
			zzbah = ((zzbah) (zzb(((zzbcu) (zzavq.zzj(zzbah))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #119 <Method zzavq zzavq.zzj(zzbah)>
	//    3    5:invokevirtual   #122 <Method zzbcu zzb(zzbcu)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", ((Throwable) (zzbah)));
	//    8   12:new             #29  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #124 <String "expected serialized AesCtrHmacAeadKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #109 <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((zzbcu) (zzbah));
	}

	public final zzbcu zzb(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzavq))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #116 <Class zzavq>
	//*   2    4:ifne            17
		{
			throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
	//    3    7:new             #29  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #126 <String "expected AesCtrHmacAeadKeyFormat proto">
	//    6   13:invokespecial   #58  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		} else
		{
			Object obj = ((Object) ((zzavq)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #116 <Class zzavq>
	//   10   21:astore_2        
			zzbcu = ((zzbcu) ((zzavs)zzauo.zza("type.googleapis.com/google.crypto.tink.AesCtrKey", ((zzbcu) (((zzavq) (obj)).zzwr())))));
	//   11   22:ldc1            #33  <String "type.googleapis.com/google.crypto.tink.AesCtrKey">
	//   12   24:aload_2         
	//   13   25:invokevirtual   #130 <Method zzavu zzavq.zzwr()>
	//   14   28:invokestatic    #133 <Method zzbcu zzauo.zza(String, zzbcu)>
	//   15   31:checkcast       #135 <Class zzavs>
	//   16   34:astore_1        
			obj = ((Object) ((zzaxc)zzauo.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzbcu) (((zzavq) (obj)).zzws())))));
	//   17   35:ldc1            #82  <String "type.googleapis.com/google.crypto.tink.HmacKey">
	//   18   37:aload_2         
	//   19   38:invokevirtual   #139 <Method zzaxe zzavq.zzws()>
	//   20   41:invokestatic    #133 <Method zzbcu zzauo.zza(String, zzbcu)>
	//   21   44:checkcast       #90  <Class zzaxc>
	//   22   47:astore_2        
			return ((zzbcu) ((zzbbo)((zzbbo.zza) (zzavo.zzwp().zzb(((zzavs) (zzbcu))).zzb(((zzaxc) (obj))).zzal(0))).zzadi()));
	//   23   48:invokestatic    #143 <Method zzavo$zza zzavo.zzwp()>
	//   24   51:aload_1         
	//   25   52:invokevirtual   #148 <Method zzavo$zza zzavo$zza.zzb(zzavs)>
	//   26   55:aload_2         
	//   27   56:invokevirtual   #151 <Method zzavo$zza zzavo$zza.zzb(zzaxc)>
	//   28   59:iconst_0        
	//   29   60:invokevirtual   #155 <Method zzavo$zza zzavo$zza.zzal(int)>
	//   30   63:invokevirtual   #161 <Method zzbbo zzbbo$zza.zzadi()>
	//   31   66:checkcast       #163 <Class zzbbo>
	//   32   69:areturn         
		}
	}

	public final zzaxi zzc(zzbah zzbah)
		throws GeneralSecurityException
	{
		zzbah = ((zzbah) ((zzavo)zzb(zzbah)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #167 <Method zzbcu zzb(zzbah)>
	//    3    5:checkcast       #49  <Class zzavo>
	//    4    8:astore_1        
		return (zzaxi)(zzbbo)((zzbbo.zza) (zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").zzai(((zzazy) (zzbah)).zzaav()).zzb(zzaxi.zzb.zzdkx))).zzadi();
	//    5    9:invokestatic    #173 <Method zzaxi$zza zzaxi.zzyz()>
	//    6   12:ldc1            #175 <String "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey">
	//    7   14:invokevirtual   #181 <Method zzaxi$zza zzaxi$zza.zzeb(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #187 <Method zzbah zzazy.zzaav()>
	//   10   21:invokevirtual   #191 <Method zzaxi$zza zzaxi$zza.zzai(zzbah)>
	//   11   24:getstatic       #197 <Field zzaxi$zzb zzaxi$zzb.zzdkx>
	//   12   27:invokevirtual   #200 <Method zzaxi$zza zzaxi$zza.zzb(zzaxi$zzb)>
	//   13   30:invokevirtual   #161 <Method zzbbo zzbbo$zza.zzadi()>
	//   14   33:checkcast       #163 <Class zzbbo>
	//   15   36:checkcast       #169 <Class zzaxi>
	//   16   39:areturn         
	}

	private static final Logger logger = Logger.getLogger(((Class) (com/google/android/gms/internal/ads/zzaus)).getName());

	static 
	{
	//    0    0:ldc1            #2   <Class zzaus>
	//    1    2:invokevirtual   #17  <Method String Class.getName()>
	//    2    5:invokestatic    #23  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #25  <Field Logger logger>
	//*   4   11:return          
	}
}
