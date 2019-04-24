// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaug, zzaxv, zzazq, zzaxx, 
//			zzauj, zzaui, zzbbu, zzbbo, 
//			zzaxi, zzazy, zzbcu, zzatz, 
//			zzbah

final class zzaux
	implements zzaug
{

	zzaux()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static zzatz zzc(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzaxv))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #18  <Class zzaxv>
	//*   2    4:ifne            17
		{
			throw new GeneralSecurityException("expected KmsAeadKey proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #20  <String "expected KmsAeadKey proto">
	//    6   13:invokespecial   #23  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		} else
		{
			zzbcu = ((zzbcu) ((zzaxv)zzbcu));
	//    8   17:aload_0         
	//    9   18:checkcast       #18  <Class zzaxv>
	//   10   21:astore_0        
			zzazq.zzj(((zzaxv) (zzbcu)).getVersion(), 0);
	//   11   22:aload_0         
	//   12   23:invokevirtual   #27  <Method int zzaxv.getVersion()>
	//   13   26:iconst_0        
	//   14   27:invokestatic    #33  <Method void zzazq.zzj(int, int)>
			zzbcu = ((zzbcu) (((zzaxv) (zzbcu)).zzzy().zzaab()));
	//   15   30:aload_0         
	//   16   31:invokevirtual   #37  <Method zzaxx zzaxv.zzzy()>
	//   17   34:invokevirtual   #43  <Method String zzaxx.zzaab()>
	//   18   37:astore_0        
			return zzauj.zzdx(((String) (zzbcu))).zzdw(((String) (zzbcu)));
	//   19   38:aload_0         
	//   20   39:invokestatic    #49  <Method zzaui zzauj.zzdx(String)>
	//   21   42:aload_0         
	//   22   43:invokeinterface #55  <Method zzatz zzaui.zzdw(String)>
	//   23   48:areturn         
		}
	}

	private static zzatz zzd(zzbah zzbah)
		throws GeneralSecurityException
	{
		try
		{
			zzbah = ((zzbah) (zzc(((zzbcu) (zzaxv.zzaj(zzbah))))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #64  <Method zzaxv zzaxv.zzaj(zzbah)>
	//    2    4:invokestatic    #66  <Method zzatz zzc(zzbcu)>
	//    3    7:astore_0        
		}
	//*   4    8:aload_0         
	//*   5    9:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah)
	//*   6   10:astore_0        
		{
			throw new GeneralSecurityException("expected KmsAeadKey proto", ((Throwable) (zzbah)));
	//    7   11:new             #16  <Class GeneralSecurityException>
	//    8   14:dup             
	//    9   15:ldc1            #20  <String "expected KmsAeadKey proto">
	//   10   17:aload_0         
	//   11   18:invokespecial   #69  <Method void GeneralSecurityException(String, Throwable)>
	//   12   21:athrow          
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
	//    0    0:aload_1         
	//    1    1:invokestatic    #73  <Method zzatz zzd(zzbah)>
	//    2    4:areturn         
	}

	public final Object zza(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		return ((Object) (zzc(zzbcu)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method zzatz zzc(zzbcu)>
	//    2    4:areturn         
	}

	public final zzbcu zzb(zzbah zzbah)
		throws GeneralSecurityException
	{
		try
		{
			zzbah = ((zzbah) (zzb(((zzbcu) (zzaxx.zzak(zzbah))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #80  <Method zzaxx zzaxx.zzak(zzbah)>
	//    3    5:invokevirtual   #83  <Method zzbcu zzb(zzbcu)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(zzbah zzbah)
	//*   7   11:astore_1        
		{
			throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", ((Throwable) (zzbah)));
	//    8   12:new             #16  <Class GeneralSecurityException>
	//    9   15:dup             
	//   10   16:ldc1            #85  <String "expected serialized KmsAeadKeyFormat proto">
	//   11   18:aload_1         
	//   12   19:invokespecial   #69  <Method void GeneralSecurityException(String, Throwable)>
	//   13   22:athrow          
		}
		return ((zzbcu) (zzbah));
	}

	public final zzbcu zzb(zzbcu zzbcu)
		throws GeneralSecurityException
	{
		if(!(zzbcu instanceof zzaxx))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #39  <Class zzaxx>
	//*   2    4:ifne            17
		{
			throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
	//    3    7:new             #16  <Class GeneralSecurityException>
	//    4   10:dup             
	//    5   11:ldc1            #87  <String "expected KmsAeadKeyFormat proto">
	//    6   13:invokespecial   #23  <Method void GeneralSecurityException(String)>
	//    7   16:athrow          
		} else
		{
			zzbcu = ((zzbcu) ((zzaxx)zzbcu));
	//    8   17:aload_1         
	//    9   18:checkcast       #39  <Class zzaxx>
	//   10   21:astore_1        
			return ((zzbcu) ((zzbbo)((zzbbo.zza) (zzaxv.zzzz().zzb(((zzaxx) (zzbcu))).zzbe(0))).zzadi()));
	//   11   22:invokestatic    #91  <Method zzaxv$zza zzaxv.zzzz()>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #96  <Method zzaxv$zza zzaxv$zza.zzb(zzaxx)>
	//   14   29:iconst_0        
	//   15   30:invokevirtual   #100 <Method zzaxv$zza zzaxv$zza.zzbe(int)>
	//   16   33:invokevirtual   #106 <Method zzbbo zzbbo$zza.zzadi()>
	//   17   36:checkcast       #108 <Class zzbbo>
	//   18   39:areturn         
		}
	}

	public final zzaxi zzc(zzbah zzbah)
		throws GeneralSecurityException
	{
		zzbah = ((zzbah) ((zzaxv)zzb(zzbah)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #111 <Method zzbcu zzb(zzbah)>
	//    3    5:checkcast       #18  <Class zzaxv>
	//    4    8:astore_1        
		return (zzaxi)(zzbbo)((zzbbo.zza) (zzaxi.zzyz().zzeb("type.googleapis.com/google.crypto.tink.KmsAeadKey").zzai(((zzazy) (zzbah)).zzaav()).zzb(zzaxi.zzb.zzdla))).zzadi();
	//    5    9:invokestatic    #117 <Method zzaxi$zza zzaxi.zzyz()>
	//    6   12:ldc1            #119 <String "type.googleapis.com/google.crypto.tink.KmsAeadKey">
	//    7   14:invokevirtual   #125 <Method zzaxi$zza zzaxi$zza.zzeb(String)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #131 <Method zzbah zzazy.zzaav()>
	//   10   21:invokevirtual   #135 <Method zzaxi$zza zzaxi$zza.zzai(zzbah)>
	//   11   24:getstatic       #141 <Field zzaxi$zzb zzaxi$zzb.zzdla>
	//   12   27:invokevirtual   #144 <Method zzaxi$zza zzaxi$zza.zzb(zzaxi$zzb)>
	//   13   30:invokevirtual   #106 <Method zzbbo zzbbo$zza.zzadi()>
	//   14   33:checkcast       #108 <Class zzbbo>
	//   15   36:checkcast       #113 <Class zzaxi>
	//   16   39:areturn         
	}
}
